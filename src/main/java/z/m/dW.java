/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_1937
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.M;
import z.r.a;
import z.r.cC;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_4184.class})
public abstract class dW {
    @Shadow
    private float field_18721;
    @Shadow
    private float field_18722;

    @Inject(method={"method_19321"}, at={@At(value="HEAD")})
    private void zerio$uprightFlightCameraHeight(class_1937 class_19372, class_1297 class_12972, boolean bl2, boolean bl3, float f2, CallbackInfo callbackInfo) {
        if (!bl2 || !M.anchorsCamera(class_12972)) {
            return;
        }
        float f3 = 2.0f;
        a a2 = a.get();
        if (a2 != null && a2.isCameraEngaged()) {
            f3 = class_3532.method_16439((float)a2.blendProgress(), (float)class_12972.method_5751(), (float)f3);
        }
        this.field_18721 = f3;
        this.field_18722 = f3;
    }

    @Inject(method={"method_19318"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$cameraClip(float f2, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        if (dW.zerio$freeLookOwnsCamera()) {
            return;
        }
        cC cC2 = cC.get();
        if (cC2 != null && cC2.shouldClip()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf((float)cC2.getDistance()));
        }
    }

    @ModifyVariable(method={"method_19318"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private float zerio$modifyCamDistance(float f2) {
        if (dW.zerio$freeLookOwnsCamera()) {
            return f2;
        }
        cC cC2 = cC.get();
        if (cC2 != null && cC2.isEnabled()) {
            return (float)cC2.getDistance();
        }
        return f2;
    }

    private static boolean zerio$freeLookOwnsCamera() {
        a a2 = a.get();
        return a2 != null && a2.isCameraEngaged();
    }
}

