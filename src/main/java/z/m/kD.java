/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1799
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.ef;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_1799.class})
public class kD {
    @Inject(method={"method_7958"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$forceGlint(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (ef.shouldForceGlint() && !((class_1799)this).method_7960()) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }
}

