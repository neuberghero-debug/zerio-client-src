/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10185
 *  net.minecraft.class_241
 *  net.minecraft.class_304
 *  net.minecraft.class_743
 *  net.minecraft.class_744
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10185;
import net.minecraft.class_241;
import net.minecraft.class_304;
import net.minecraft.class_743;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.ko;
import z.r.lK;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_743.class})
public abstract class cj
extends class_744 {
    @WrapOperation(method={"method_3129"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_304;method_1434()Z")})
    private boolean zerio$combatDrivesKeys(class_304 class_3042, Operation<Boolean> operation) {
        return lK.resolve(class_3042, (Boolean)operation.call(new Object[]{class_3042}));
    }

    @Inject(method={"method_3129"}, at={@At(value="TAIL")})
    private void zerio$wireMovementRemap(CallbackInfo callbackInfo) {
        class_10185 class_101852 = ko.remapKeys(this.field_54155, this.field_55868);
        if (class_101852 != null) {
            this.field_54155 = class_101852;
            class_241 class_2412 = ko.remappedMoveVector();
            if (class_2412 != null) {
                this.field_55868 = class_2412;
            }
        }
    }
}

