/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_4587
 *  net.minecraft.class_757
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.eZ;
import z.r.ef;
import z.r.gF;
import z.r.gj;
import z.r.kM;
import z.r.mw;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_757.class})
public abstract class dY {
    private static final /* synthetic */ String a;

    @Inject(method={"method_3198"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$noHurtCam(class_4587 class_45872, float f2, CallbackInfo callbackInfo) {
        if (eZ.a) {
            callbackInfo.cancel();
        }
    }

    @ModifyExpressionValue(method={"method_3172"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_5498;method_31034()Z")})
    private boolean zerio$freecamRenderFirstPersonHands(boolean bl2) {
        kM kM2;
        kM kM3;
        gF gF2 = mw.getInstance().getModuleByName(a);
        kM kM4 = kM3 = gF2 instanceof kM ? (kM2 = (kM)gF2) : null;
        if (kM3 != null && kM3.isFreecamActive() && kM3.renderHands()) {
            return true;
        }
        return bl2;
    }

    @ModifyArg(method={"method_3192"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11284;method_71116(IIDJLnet/minecraft/class_9779;ILnet/minecraft/class_4184;Z)V"), index=2)
    private double zerio$customGlintStrength(double d2) {
        return ef.overrideGlintStrength(d2);
    }

    static {
        a = gj.decode("uxkfMg/hig==", 1399879590);
    }
}

