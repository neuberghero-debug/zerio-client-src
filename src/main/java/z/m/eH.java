/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10055
 *  net.minecraft.class_1297
 *  net.minecraft.class_1306
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_591
 *  net.minecraft.class_630
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10055;
import net.minecraft.class_1297;
import net.minecraft.class_1306;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_591;
import net.minecraft.class_630;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.M;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_591.class})
public abstract class eH {
    @Inject(method={"method_62110(Lnet/minecraft/class_10055;)V"}, at={@At(value="TAIL")})
    private void zerio$uprightFlightSupermanPose(class_10055 class_100552, CallbackInfo callbackInfo) {
        class_1657 class_16572;
        M m2 = M.get();
        if (m2 == null || !m2.isEnabled()) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1687 == null) {
            return;
        }
        class_1297 class_12972 = class_3102.field_1687.method_8469(class_100552.field_53528);
        if (!(class_12972 instanceof class_1657) || !m2.posesSuperman(class_16572 = (class_1657)class_12972)) {
            return;
        }
        class_12972 = (class_591)this;
        boolean bl2 = class_100552.field_55303 == class_1306.field_6183;
        class_630 class_6302 = bl2 ? class_12972.field_3401 : class_12972.field_27433;
        class_630 class_6303 = bl2 ? class_12972.field_27433 : class_12972.field_3401;
        float f2 = class_3532.method_15374((double)(class_100552.field_53328 * 0.25f)) * 0.06f;
        class_6302.field_3654 = -1.75f + f2;
        class_6302.field_3675 = bl2 ? -0.1f : 0.1f;
        class_6302.field_3674 = 0.0f;
        class_6303.field_3654 = 0.7f - f2 * 0.5f;
        class_6303.field_3675 = bl2 ? 0.15f : -0.15f;
        class_6303.field_3674 = bl2 ? 0.25f : -0.25f;
        class_630 class_6304 = bl2 ? class_12972.field_3397 : class_12972.field_3392;
        class_630 class_6305 = bl2 ? class_12972.field_3392 : class_12972.field_3397;
        class_6304.field_3654 = -0.2f + f2 * 0.3f;
        class_6304.field_3675 = 0.0f;
        class_6304.field_3674 = 0.0f;
        class_6305.field_3654 = 0.45f - f2 * 0.3f;
        class_6305.field_3675 = 0.0f;
        class_6305.field_3674 = 0.0f;
    }
}

