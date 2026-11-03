/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10034
 *  net.minecraft.class_10055
 *  net.minecraft.class_11659
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_979
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10034;
import net.minecraft.class_10055;
import net.minecraft.class_11659;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_979;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.M;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_979.class})
public abstract class gK {
    @Inject(method={"method_17161"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$hideElytraForUprightFlight(class_4587 class_45872, class_11659 class_116592, int n2, class_10034 class_100342, float f2, float f3, CallbackInfo callbackInfo) {
        class_1657 class_16572;
        if (!(class_100342 instanceof class_10055)) {
            return;
        }
        class_10055 class_100552 = (class_10055)class_100342;
        M m2 = M.get();
        if (m2 == null || !m2.isEnabled()) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1687 == null) {
            return;
        }
        class_1297 class_12972 = class_3102.field_1687.method_8469(class_100552.field_53528);
        if (class_12972 instanceof class_1657 && m2.hidesElytra(class_16572 = (class_1657)class_12972)) {
            callbackInfo.cancel();
        }
    }
}

