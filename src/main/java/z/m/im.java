/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1309
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package z.m;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import z.r.ko;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_1309.class})
public abstract class im {
    @WrapOperation(method={"method_6043"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_36454()F")})
    private float zerio$wireJumpYaw(class_1309 class_13092, Operation<Float> operation) {
        return ko.physicsYaw(class_13092, ((Float)operation.call(new Object[]{class_13092})).floatValue());
    }
}

