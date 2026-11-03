/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2350
 *  net.minecraft.class_2680
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.et;

@Environment(value=EnvType.CLIENT)
@Mixin(value={AbstractBlockRenderContext.class}, remap=false)
public abstract class bR {
    @Shadow
    protected class_2680 state;

    @Inject(method={"isFaceCulled"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$disableCullingForXray(class_2350 class_23502, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (class_23502 == null) {
            return;
        }
        et et2 = et.get();
        if (et2 != null && et2.isEnabled() && this.state != null && et2.isWhitelisted(this.state.method_26204())) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
}

