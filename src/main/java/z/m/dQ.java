/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_1937
 *  net.minecraft.class_310
 *  net.minecraft.class_4184
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.a;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_4184.class})
public abstract class dQ {
    @Inject(method={"method_19321"}, at={@At(value="HEAD")})
    private void zerio$freeLookFrame(class_1937 class_19372, class_1297 class_12972, boolean bl2, boolean bl3, float f2, CallbackInfo callbackInfo) {
        a a2 = a.get();
        if (a2 != null) {
            a2.onCameraFrame(class_310.method_1551());
        }
    }

    @Redirect(method={"method_19321"}, require=0, at=@At(value="INVOKE", target="Lnet/minecraft/class_1297;method_5705(F)F"))
    private float zerio$freeLookYaw(class_1297 class_12972, float f2) {
        a a2 = a.get();
        if (a2 != null && a2.isCameraEngaged() && class_12972 == class_310.method_1551().field_1724) {
            return a2.cameraYaw(class_12972, f2);
        }
        return class_12972.method_5705(f2);
    }

    @Redirect(method={"method_19321"}, require=0, at=@At(value="INVOKE", target="Lnet/minecraft/class_1297;method_5695(F)F"))
    private float zerio$freeLookPitch(class_1297 class_12972, float f2) {
        a a2 = a.get();
        if (a2 != null && a2.isCameraEngaged() && class_12972 == class_310.method_1551().field_1724) {
            return a2.cameraPitch(class_12972, f2);
        }
        return class_12972.method_5695(f2);
    }

    @Inject(method={"method_19318"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$freeLookClip(float f2, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        a a2 = a.get();
        if (a2 != null && a2.isCameraEngaged() && a2.isThroughWalls()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(a2.cameraDistance()));
        }
    }

    @ModifyVariable(method={"method_19318"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private float zerio$freeLookDistance(float f2) {
        a a2 = a.get();
        if (a2 != null && a2.isCameraEngaged()) {
            return a2.cameraDistance();
        }
        return f2;
    }
}

