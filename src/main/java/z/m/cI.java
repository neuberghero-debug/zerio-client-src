/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 *  net.minecraft.class_312
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.gF;
import z.r.gj;
import z.r.kM;
import z.r.mw;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_312.class})
public abstract class cI {
    private static final /* synthetic */ String a;
    @Shadow
    @Final
    private class_310 field_1779;
    @Shadow
    private double field_1787;
    @Shadow
    private double field_1789;

    @Inject(method={"method_1606"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$freecamMouse(double d2, CallbackInfo callbackInfo) {
        kM kM2 = cI.getFreecam();
        if (kM2 == null || !kM2.isFreecamActive()) {
            return;
        }
        if (this.field_1779.field_1755 != null) {
            return;
        }
        double d3 = (Double)this.field_1779.field_1690.method_42495().method_41753() * 0.6 + 0.2;
        double d4 = d3 * d3 * d3 * 8.0;
        double d5 = this.field_1789 * d4 * (double)kM2.getLookSensitivity();
        double d6 = this.field_1787 * d4 * (double)kM2.getLookSensitivity();
        float f2 = kM2.getCurrentYaw() + (float)d5 * 0.15f;
        float f3 = kM2.getCurrentPitch() + (float)d6 * 0.15f;
        kM2.setRotation(f2, f3);
        this.field_1789 = 0.0;
        this.field_1787 = 0.0;
        callbackInfo.cancel();
    }

    private static kM getFreecam() {
        kM kM2;
        gF gF2 = mw.getInstance().getModuleByName(a);
        return gF2 instanceof kM ? (kM2 = (kM)gF2) : null;
    }

    static {
        a = gj.decode("u0qJO89dOQ==", 1309563117);
    }
}

