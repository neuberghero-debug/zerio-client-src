/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2561
 *  net.minecraft.class_337
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_337;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import z.r.aR;
import z.r.gU;
import z.r.kl;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_337.class})
public class fp {
    @ModifyArg(method={"method_1796"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_27535(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;III)V"), index=1)
    private class_2561 zerio$nameProtectBossBar(class_2561 class_25612) {
        return gU.applyForMessages(class_25612, kl.getInstance(), aR.a);
    }
}

