/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_9955
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_9955;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import z.r.dB;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_9955.class})
public abstract class lf {
    @ModifyVariable(method={"method_62168"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private int zerio$cloudColor(int n2) {
        return dB.cloudActive() ? dB.cloudColor() : n2;
    }
}

