/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_765
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Slice
 */
package z.m;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Slice;
import z.r.bI;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_765.class})
public abstract class gy {
    @ModifyExpressionValue(method={"method_3313"}, at={@At(value="INVOKE", target="Ljava/lang/Double;floatValue()F", ordinal=0)}, slice={@Slice(from=@At(value="INVOKE", target="Lnet/minecraft/class_315;method_42473()Lnet/minecraft/class_7172;"))})
    private float zerio$fullbrightGamma(float f2) {
        return bI.lightmapGamma(f2);
    }
}

