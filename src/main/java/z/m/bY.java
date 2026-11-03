/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.mA;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_310.class})
public abstract class bY {
    @Inject(method={"method_1536"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$portAttack(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (mA.onManualAttackClick()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
}

