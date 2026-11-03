/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.he;
import z.r.ko;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_1297.class})
public abstract class Y {
    @Inject(method={"method_5871"}, at={@At(value="RETURN")}, cancellable=true)
    private void zerio$hitboxMargin(CallbackInfoReturnable<Float> callbackInfoReturnable) {
        float f2 = he.hitboxExtra((class_1297)this);
        if (f2 > 0.0f) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(callbackInfoReturnable.getReturnValueF() + f2));
        }
    }

    @WrapOperation(method={"method_5724"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1297;method_36454()F")})
    private float zerio$wireMovementYaw(class_1297 class_12972, Operation<Float> operation) {
        return ko.physicsYaw(class_12972, ((Float)operation.call(new Object[]{class_12972})).floatValue());
    }
}

