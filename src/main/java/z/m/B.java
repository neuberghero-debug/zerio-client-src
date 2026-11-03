/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_11659
 *  net.minecraft.class_1268
 *  net.minecraft.class_1306
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1839
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_742
 *  net.minecraft.class_746
 *  net.minecraft.class_759
 *  net.minecraft.class_759$class_5773
 *  net.minecraft.class_7833
 *  net.minecraft.class_811
 *  org.joml.Quaternionfc
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11659;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1839;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_759;
import net.minecraft.class_7833;
import net.minecraft.class_811;
import org.joml.Quaternionfc;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.gj;
import z.r.lx;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
@Mixin(value={class_759.class})
public class B {
    private static final /* synthetic */ String a;
    @Unique
    private class_1268 a;
    private static final /* synthetic */ String b;
    @Unique
    private float a;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    @Unique
    private boolean a;
    private static final String e;
    private static final /* synthetic */ String f;
    @Unique
    private float b;
    @Unique
    private class_1799 a = class_1799.field_8037;

    @ModifyVariable(method={"method_3228"}, at=@At(value="HEAD"), argsOnly=true, ordinal=3)
    private float zerio$lockItemHeightOnSwap(float f2) {
        lx lx2 = B.zerio$animations();
        return lx2 != null && lx2.isPitchOnlyMotion() ? 0.0f : f2;
    }

    @Inject(method={"method_3228"}, at={@At(value="HEAD")})
    private void zerio$captureSwingProgress(class_742 class_7422, float f2, float f3, class_1268 class_12682, float f4, class_1799 class_17992, float f5, class_4587 class_45872, class_11659 class_116592, int n2, CallbackInfo callbackInfo) {
        this.b = f4;
        this.a = f2;
        this.a = class_12682;
        this.a = class_17992;
    }

    @ModifyReturnValue(method={"method_65910"}, at={@At(value="RETURN")})
    private boolean zerio$swapItemInPlace(boolean bl2, class_1799 class_17992, class_1799 class_17993) {
        lx lx2 = B.zerio$animations();
        return lx2 != null && lx2.isPitchOnlyMotion() || bl2;
    }

    @Inject(method={"method_65816"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$cancelMovingSwing(float f2, class_4587 class_45872, int n2, class_1306 class_13062, CallbackInfo callbackInfo) {
        lx lx2 = B.zerio$animations();
        if (lx2 == null) {
            return;
        }
        String string = lx2.getSwingMotion();
        if (d.equals(string) || b.equals(string)) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"method_3218"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$rotateConsumedItem(class_4587 class_45872, float f2, class_1306 class_13062, class_1799 class_17992, class_1657 class_16572, CallbackInfo callbackInfo) {
        lx lx2 = B.zerio$animations();
        if (lx2 == null) {
            return;
        }
        if (b.equals(lx2.getSwingMotion())) {
            callbackInfo.cancel();
            return;
        }
        if (!lx2.isPitchOnlyMotion()) {
            return;
        }
        float f3 = (float)class_17992.method_7935((class_1309)class_16572) - ((float)class_16572.method_6014() - f2 + 1.0f);
        float f4 = lx2.getConsumeRotationOffset(Math.max(0.0f, f3));
        float f5 = class_13062 == class_1306.field_6183 ? -1.0f : 1.0f;
        float f6 = Math.min(1.0f, Math.abs(f4) / 35.0f);
        class_45872.method_46416(f5 * 0.025f * f6, 0.025f * f6, -0.018f * f6);
        class_45872.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(-f5 * f4 * 0.16f));
        class_45872.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(f5 * f4));
        class_45872.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees(-f5 * f4 * 0.1f));
        callbackInfo.cancel();
    }

    @ModifyExpressionValue(method={"method_3228"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1799;method_7976()Lnet/minecraft/class_1839;")})
    private class_1839 zerio$replaceTridentUsePose(class_1839 class_18392) {
        lx lx2 = B.zerio$animations();
        return lx2 != null && lx2.isPitchOnlyMotion() && class_18392 == class_1839.field_63380 ? class_1839.field_8952 : class_18392;
    }

    @ModifyExpressionValue(method={"method_3228"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_742;method_6123()Z")})
    private boolean zerio$replaceRiptidePose(boolean bl2) {
        lx lx2 = B.zerio$animations();
        return bl2 && (lx2 == null || !lx2.isPitchOnlyMotion());
    }

    @ModifyVariable(method={"method_3217(Lnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private float zerio$remapSwingProgress(float f2) {
        lx lx2 = B.zerio$animations();
        if (lx2 == null) {
            return f2;
        }
        return lx2.remapSwingProgress(f2);
    }

    @Inject(method={"method_3217(Lnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V"}, at={@At(value="TAIL")})
    private void zerio$reshapeSwing(class_4587 class_45872, class_1306 class_13062, float f2, CallbackInfo callbackInfo) {
        lx lx2 = B.zerio$animations();
        if (lx2 == null) {
            return;
        }
        String string = lx2.getSwingMotion();
        float f3 = lx2.getSwingArc();
        boolean bl2 = a.equals(string);
        if (bl2 && f3 >= 0.999f) {
            return;
        }
        int n2 = class_13062 == class_1306.field_6183 ? 1 : -1;
        float f4 = class_3532.method_15374((double)(f2 * f2 * (float)Math.PI));
        float f5 = class_3532.method_15374((double)(class_3532.method_15355((float)f2) * (float)Math.PI));
        class_45872.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)n2 * 45.0f));
        class_45872.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(f5 * 80.0f));
        class_45872.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)n2 * f5 * 20.0f));
        class_45872.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)(-n2) * (45.0f + f4 * -20.0f)));
        float f6 = -0.4f * f5;
        float f7 = 0.2f * class_3532.method_15374((double)(class_3532.method_15355((float)f2) * ((float)Math.PI * 2)));
        float f8 = -0.2f * class_3532.method_15374((double)(f2 * (float)Math.PI));
        if (bl2) {
            float f9 = 1.0f - f3;
            class_45872.method_46416((float)(-n2) * f6 * f9, -f7 * f9, -f8 * f9);
            float f10 = f4 * f3;
            float f11 = f5 * f3;
            class_45872.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)n2 * (45.0f + f10 * -20.0f)));
            class_45872.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)n2 * f11 * -20.0f));
            class_45872.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(f11 * -80.0f));
            class_45872.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)n2 * -45.0f));
            return;
        }
        class_45872.method_46416((float)(-n2) * f6, -f7, -f8);
        if (f.equals(string)) {
            class_45872.method_46416((float)n2 * -0.1f * f5 * f3, 0.055f * f5 * f3, 0.0f);
            class_45872.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)n2 * -9.0f * f5 * f3));
        }
    }

    @ModifyExpressionValue(method={"method_3220"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_746;method_75194(F)F")})
    private float zerio$noCooldownDip(float f2) {
        lx lx2 = B.zerio$animations();
        return lx2 != null && (lx2.isNoReequip() || lx2.isPitchOnlyMotion()) ? 1.0f : f2;
    }

    @Inject(method={"method_3215"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$noEquipReset(class_1268 class_12682, CallbackInfo callbackInfo) {
        lx lx2 = B.zerio$animations();
        if (lx2 != null && (lx2.isNoReequip() || lx2.isPitchOnlyMotion())) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"method_3224(Lnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V"}, at={@At(value="TAIL")})
    private void zerio$adjustEquipOffset(class_4587 class_45872, class_1306 class_13062, float f2, CallbackInfo callbackInfo) {
        lx lx2 = B.zerio$animations();
        if (lx2 == null) {
            return;
        }
        float f3 = lx2.getSwingForce();
        if (!lx2.isPitchOnlyMotion() && f3 > 1.0f) {
            float f4 = (f3 - 1.0f) * 0.08f * (0.35f + f2 * 0.65f);
            if (class_13062 == class_1306.field_6183) {
                class_45872.method_46416(f4 * 0.35f, -f4 * 0.25f, -f4 * 0.55f);
            } else {
                class_45872.method_46416(-f4 * 0.35f, -f4 * 0.25f, -f4 * 0.55f);
            }
        }
        int n2 = class_13062 == class_1306.field_6183 ? 1 : -1;
        class_45872.method_46416((float)(-n2) * lx2.getCenterPull(), lx2.getLiftY(), lx2.getLiftZ());
        float f5 = lx2.getHandPitch();
        float f6 = lx2.getHandYaw();
        float f7 = lx2.getHandRoll();
        if (lx2.isPitchOnlyMotion()) {
            float f8;
            boolean bl2;
            float f9 = 1.0f - class_3532.method_15363((float)f2, (float)0.0f, (float)1.0f);
            float f10 = class_13062 == class_1306.field_6183 ? -1.0f : 1.0f;
            float f11 = lx2.getPitchSwingOffset(this.b);
            class_746 class_7462 = class_310.method_1551().field_1724;
            boolean bl3 = bl2 = class_7462 != null && class_7462.method_6115() && class_7462.method_6014() > 0 && class_7462.method_6058() == this.a;
            if (bl2 && this.a.method_7976() == class_1839.field_63380) {
                f8 = (float)this.a.method_7935((class_1309)class_7462) - ((float)class_7462.method_6014() - this.a + 1.0f);
                f11 = lx2.getTridentRotationOffset(Math.max(0.0f, f8));
            } else if (class_7462 != null && class_7462.method_6123() && this.a.method_7976() == class_1839.field_63380) {
                f11 = lx2.getRiptideRotationOffset((float)class_7462.field_6012 + this.a);
            }
            f5 += f10 * (f11 *= f9);
            f6 += f11 * 0.1f;
            f7 -= f11 * 0.07f;
            f8 = Math.min(1.0f, Math.abs(f11) / 45.0f);
            class_45872.method_46416((float)(-n2) * 0.012f * f8, 0.01f * f8, 0.0f);
        }
        if (f5 != 0.0f || f6 != 0.0f || f7 != 0.0f) {
            class_45872.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)n2 * f6));
            class_45872.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(f5));
            class_45872.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)n2 * f7));
        }
    }

    @Inject(method={"method_3233(Lnet/minecraft/class_1309;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_10444;method_65604(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;III)V", shift=At.Shift.BEFORE)})
    private void zerio$animationsItemScaleBefore(class_1309 class_13092, class_1799 class_17992, class_811 class_8112, class_4587 class_45872, class_11659 class_116592, int n2, CallbackInfo callbackInfo) {
        this.a = false;
        lx lx2 = B.zerio$animations();
        if (lx2 == null || class_17992.method_7960()) {
            return;
        }
        if (!(class_13092 instanceof class_746) || class_13092 != class_310.method_1551().field_1724) {
            return;
        }
        if (class_8112 != class_811.field_4322 && class_8112 != class_811.field_4321) {
            return;
        }
        float f2 = lx2.getHeldItemScale();
        if (Math.abs(f2 - 1.0f) < 0.02f) {
            return;
        }
        class_45872.method_22903();
        class_45872.method_22905(f2, f2, f2);
        this.a = true;
    }

    @Inject(method={"method_3233(Lnet/minecraft/class_1309;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_10444;method_65604(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;III)V", shift=At.Shift.AFTER)})
    private void zerio$animationsItemScaleAfter(class_1309 class_13092, class_1799 class_17992, class_811 class_8112, class_4587 class_45872, class_11659 class_116592, int n2, CallbackInfo callbackInfo) {
        if (this.a) {
            class_45872.method_22909();
            this.a = false;
        }
    }

    @ModifyReturnValue(method={"method_33303"}, at={@At(value="RETURN")})
    private static class_759.class_5773 zerio$forceBothHands(class_759.class_5773 class_57732, class_746 class_7462) {
        lx lx2 = B.zerio$animations();
        if (lx2 == null || !lx2.isForceBothHands()) {
            return class_57732;
        }
        return class_759.class_5773.field_28384;
    }

    @Unique
    private static lx zerio$animations() {
        class_310 class_3102 = class_310.method_1551();
        if (!(class_3102.field_1724 instanceof class_746)) {
            return null;
        }
        lx lx2 = lx.get();
        return lx2 != null && lx2.isEnabled() ? lx2 : null;
    }

    static {
        c = gj.decode("GEkviCZ/fDaWL7gpBmvo+VLb7Er8QI0YnzPuNrpUObkIMsNYFe4fFpMBbFzb9AhGFURKlTaKKKgJ9ZIDyQ35kngOBnRi1CdIaKGwPkOrN4WzpywH10epaLmLSltVq9gIgMOSOWoXHCrRyFWHag5QmJfhUPnoCHX3tMP14TdTmA1jD4jdalK2lY4UXuk0t61Od6K8fB44cDUNOP9Ea85ulR5Tim1anfEgxA==", -103551254);
        d = gj.decode("ZrRYDxGM", 84640025);
        b = gj.decode("V3fOED9B", 1071100951);
        a = gj.decode("og6hElpFmw==", -218663341);
        f = gj.decode("wbCC4wa+Eg==", -582324316);
        e = c;
    }
}

