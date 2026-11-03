/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1113
 *  net.minecraft.class_1140
 *  net.minecraft.class_1140$class_11518
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1113;
import net.minecraft.class_1140;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.fu;
import z.r.hr;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_1140.class})
public class jm {
    @Inject(method={"method_4854(Lnet/minecraft/class_1113;)Lnet/minecraft/class_1140$class_11518;"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$replaceSound(class_1113 class_11132, CallbackInfoReturnable<class_1140.class_11518> callbackInfoReturnable) {
        if (hr.replace(class_11132)) {
            callbackInfoReturnable.setReturnValue((Object)class_1140.class_11518.field_60956);
        }
    }

    @Inject(method={"method_4856()V", "method_54648()V"}, at={@At(value="TAIL")})
    private void zerio$onEngineStopped(CallbackInfo callbackInfo) {
        hr.invalidate();
        fu.invalidate();
    }
}

