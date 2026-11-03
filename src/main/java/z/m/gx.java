/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1657
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.he;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_1657.class})
public abstract class gx {
    @Inject(method={"method_55755"}, at={@At(value="RETURN")}, cancellable=true)
    private void zerio$entityRange(CallbackInfoReturnable<Double> callbackInfoReturnable) {
        double d2 = he.entityRange((class_1657)this, callbackInfoReturnable.getReturnValueD());
        if (d2 != callbackInfoReturnable.getReturnValueD()) {
            callbackInfoReturnable.setReturnValue((Object)d2);
        }
    }

    @Inject(method={"method_55754"}, at={@At(value="RETURN")}, cancellable=true)
    private void zerio$blockRange(CallbackInfoReturnable<Double> callbackInfoReturnable) {
        double d2 = he.blockRange((class_1657)this, callbackInfoReturnable.getReturnValueD());
        if (d2 != callbackInfoReturnable.getReturnValueD()) {
            callbackInfoReturnable.setReturnValue((Object)d2);
        }
    }
}

