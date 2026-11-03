/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10039
 *  net.minecraft.class_11659
 *  net.minecraft.class_12075
 *  net.minecraft.class_1542
 *  net.minecraft.class_4587
 *  net.minecraft.class_916
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10039;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_1542;
import net.minecraft.class_4587;
import net.minecraft.class_916;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.dC;
import z.r.ef;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_916.class})
public class o {
    @Inject(method={"method_62470(Lnet/minecraft/class_1542;Lnet/minecraft/class_10039;F)V"}, at={@At(value="TAIL")})
    private void zerio$captureGlintForAura(class_1542 class_15422, class_10039 class_100392, float f2, CallbackInfo callbackInfo) {
        ((dC)class_100392).zerio$setGlintAura(ef.auraEnabled() && class_15422.method_6983().method_7958());
    }

    @Inject(method={"method_3996(Lnet/minecraft/class_10039;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_12075;)V"}, at={@At(value="TAIL")})
    private void zerio$submitGlintAura(class_10039 class_100392, class_4587 class_45872, class_11659 class_116592, class_12075 class_120752, CallbackInfo callbackInfo) {
        if (((dC)class_100392).zerio$hasGlintAura()) {
            ef.submitAura(class_45872, class_116592, class_120752);
        }
    }
}

