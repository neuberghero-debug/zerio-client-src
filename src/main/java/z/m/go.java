/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 *  net.minecraft.class_742
 *  net.minecraft.class_8685
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_742;
import net.minecraft.class_8685;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.hO;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_742.class})
public abstract class go {
    @Inject(method={"method_52814"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$overrideSkin(CallbackInfoReturnable<class_8685> callbackInfoReturnable) {
        class_8685 class_86852 = hO.getOverrideSkin();
        if (class_86852 == null) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null) {
            return;
        }
        if (this == class_3102.field_1724) {
            callbackInfoReturnable.setReturnValue((Object)class_86852);
        }
    }
}

