/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2248
 *  net.minecraft.class_2350
 *  net.minecraft.class_2680
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2248;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.et;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_2248.class})
public abstract class l {
    @Inject(method={"method_9607"}, at={@At(value="HEAD")}, cancellable=true)
    private static void zerio$xrayShouldDrawSide(class_2680 class_26802, class_2680 class_26803, class_2350 class_23502, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        et et2 = et.get();
        if (et2 == null || !et2.isEnabled()) {
            return;
        }
        if (et2.isWhitelisted(class_26802.method_26204())) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }
}

