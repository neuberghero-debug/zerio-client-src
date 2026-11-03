/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2248
 *  net.minecraft.class_2464
 *  net.minecraft.class_4970$class_4971
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2248;
import net.minecraft.class_2464;
import net.minecraft.class_4970;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.et;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_4970.class_4971.class})
public abstract class hz {
    @Shadow
    public abstract class_2248 method_26204();

    @Inject(method={"method_26217"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$xrayGetRenderType(CallbackInfoReturnable<class_2464> callbackInfoReturnable) {
        et et2 = et.get();
        if (et2 == null || !et2.isEnabled()) {
            return;
        }
        if (!et2.isWhitelisted(this.method_26204()) && et2.getOpacity() >= 255) {
            callbackInfoReturnable.setReturnValue((Object)class_2464.field_11455);
        }
    }

    @Inject(method={"method_26216"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$xrayIsOpaqueFullCube(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        et et2 = et.get();
        if (et2 == null || !et2.isEnabled()) {
            return;
        }
        if (!et2.isWhitelisted(this.method_26204())) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
}

