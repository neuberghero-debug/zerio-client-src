/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_12250
 *  org.joml.Matrix4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_12250;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.ef;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_12250.class})
public class cF {
    @Inject(method={"method_76031"}, at={@At(value="HEAD")}, cancellable=true)
    private static void zerio$customGlintTransform(float f2, CallbackInfoReturnable<Matrix4f> callbackInfoReturnable) {
        Matrix4f matrix4f = ef.glintTransform(f2);
        if (matrix4f != null) {
            callbackInfoReturnable.setReturnValue((Object)matrix4f);
        }
    }
}

