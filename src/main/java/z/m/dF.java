/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2708
 *  net.minecraft.class_2724
 *  net.minecraft.class_634
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2708;
import net.minecraft.class_2724;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.he;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_634.class})
public abstract class dF {
    @Inject(method={"method_11157"}, at={@At(value="TAIL")})
    private void zerio$onTeleport(class_2708 class_27082, CallbackInfo callbackInfo) {
        he.fireWorldReset();
    }

    @Inject(method={"method_11117"}, at={@At(value="TAIL")})
    private void zerio$onRespawn(class_2724 class_27242, CallbackInfo callbackInfo) {
        he.fireWorldReset();
    }
}

