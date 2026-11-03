/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_312
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.bA;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_312.class})
public abstract class fB {
    @Shadow
    private double field_1787;
    @Shadow
    private double field_1789;

    @Inject(method={"method_1606"}, at={@At(value="HEAD")})
    private void zerio$combatSteer(double d2, CallbackInfo callbackInfo) {
        double[] dArray = bA.step(this.field_1789, this.field_1787, d2);
        this.field_1789 += dArray[0];
        this.field_1787 += dArray[1];
    }

    @ModifyExpressionValue(method={"method_55793"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_310;method_1569()Z")})
    private boolean zerio$steerActiveUnfocused(boolean bl2) {
        return bl2 || bA.steering();
    }

    @ModifyExpressionValue(method={"method_55793"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_312;method_1613()Z")})
    private boolean zerio$steerGrabbedUnfocused(boolean bl2) {
        return bl2 || bA.steering();
    }
}

