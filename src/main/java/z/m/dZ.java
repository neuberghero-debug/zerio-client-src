/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2561
 *  net.minecraft.class_338
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_338;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import z.r.aR;
import z.r.gU;
import z.r.kl;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_338.class})
public class dZ {
    @ModifyVariable(method={"method_1812(Lnet/minecraft/class_2561;)V"}, at=@At(value="HEAD"), argsOnly=true)
    private class_2561 zerio$nameProtectUnsigned(class_2561 class_25612) {
        return gU.applyForMessages(class_25612, kl.getInstance(), aR.l);
    }

    @ModifyVariable(method={"method_44811(Lnet/minecraft/class_2561;Lnet/minecraft/class_7469;Lnet/minecraft/class_7591;)V"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private class_2561 zerio$nameProtectSigned(class_2561 class_25612) {
        return gU.applyForMessages(class_25612, kl.getInstance(), aR.l);
    }
}

