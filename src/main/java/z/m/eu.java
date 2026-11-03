/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.sugar.Local
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_11658
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_4063
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_761
 *  net.minecraft.class_9779
 *  net.minecraft.class_9909
 *  net.minecraft.class_9922
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11658;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_4063;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_761;
import net.minecraft.class_9779;
import net.minecraft.class_9909;
import net.minecraft.class_9922;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.aZ;
import z.r.cZ;
import z.r.hJ;
import z.r.iy;
import z.r.kM;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_761.class})
public class eu {
    @Inject(method={"method_22710"}, at={@At(value="HEAD")})
    private void captureMatrices(class_9922 class_99222, class_9779 class_97792, boolean bl2, class_4184 class_41842, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, GpuBufferSlice gpuBufferSlice, Vector4f vector4f, boolean bl3, CallbackInfo callbackInfo) {
        if (matrix4f3 != null) {
            cZ.c.set((Matrix4fc)matrix4f3);
        }
        if (matrix4f2 != null) {
            cZ.b.set((Matrix4fc)matrix4f2);
        }
        if (matrix4f != null) {
            cZ.a.set((Matrix4fc)matrix4f);
        }
        if (aZ.isActive() && vector4f != null) {
            aZ.applyFogTint(vector4f);
        }
    }

    @Inject(method={"method_62200"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$skipVanillaSky(class_9909 class_99092, class_4184 class_41842, GpuBufferSlice gpuBufferSlice, CallbackInfo callbackInfo) {
        if (aZ.isActive()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"method_62204"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$hideClouds(class_9909 class_99092, class_4063 class_40632, class_243 class_2432, long l2, float f2, int n2, float f3, CallbackInfo callbackInfo) {
        if (aZ.isActive()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"method_62210"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$animatedBlockOutline(class_4597.class_4598 class_45982, class_4587 class_45872, boolean bl2, class_11658 class_116582, CallbackInfo callbackInfo) {
        if (!hJ.ok()) {
            return;
        }
        iy iy2 = iy.get();
        if (iy2 == null || !iy2.isEnabled()) {
            return;
        }
        iy2.onOutlineRender(class_45872, class_45982, bl2, class_116582.field_63083, class_116582.field_63082.field_63078);
        callbackInfo.cancel();
    }

    @ModifyExpressionValue(method={"method_72917"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_761;method_40050(Lnet/minecraft/class_2338;)Z")})
    private boolean zerio$freecamKeepOwnBodyRenderable(boolean bl2, @Local class_1297 class_12972) {
        return bl2 || kM.rendersDetachedBody(class_12972);
    }
}

