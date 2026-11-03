/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_11228
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11228;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.jI;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_11228.class})
public class ju {
    @Inject(method={"method_70890(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V"}, at={@At(value="TAIL")})
    private void zerio$renderUi(GpuBufferSlice gpuBufferSlice, CallbackInfo callbackInfo) {
        jI.onGuiRendered();
    }
}

