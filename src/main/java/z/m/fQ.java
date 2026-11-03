/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10017
 *  net.minecraft.class_10055
 *  net.minecraft.class_11659
 *  net.minecraft.class_12075
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_897
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10017;
import net.minecraft.class_10055;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.aR;
import z.r.cR;
import z.r.dc;
import z.r.gU;
import z.r.kl;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_897.class})
public abstract class fQ {
    @Inject(method={"method_62354"}, at={@At(value="TAIL")})
    private void zerio$shaderOutlineColor(class_1297 class_12972, class_10017 class_100172, float f2, CallbackInfo callbackInfo) {
        dc dc2 = dc.getInstance();
        if (dc2 != null && dc2.shouldOutline(class_12972)) {
            class_100172.field_61821 = dc2.outlineColor(class_12972);
        }
    }

    @Inject(method={"method_62426"}, at={@At(value="RETURN")}, cancellable=true)
    private void zerio$nameProtectRendererLabel(class_1297 class_12972, CallbackInfoReturnable<class_2561> callbackInfoReturnable) {
        class_2561 class_25612;
        class_2561 class_25613 = (class_2561)callbackInfoReturnable.getReturnValue();
        if (class_25613 == null) {
            return;
        }
        kl kl2 = kl.getInstance();
        if (kl2 == null) {
            return;
        }
        if (class_12972 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_12972;
            class_310 class_3102 = class_310.method_1551();
            String string = class_16572.method_7334().name();
            if (!kl2.protectsProfileName(string, class_3102, aR.e)) {
                return;
            }
            class_25612 = gU.applyForKnownPlayer(class_25613, string, class_16572.method_5667(), kl2, aR.e);
        } else {
            class_25612 = gU.apply(class_25613, kl2, aR.e);
        }
        if (class_25612 != class_25613) {
            callbackInfoReturnable.setReturnValue((Object)class_25612);
        }
    }

    @Inject(method={"method_3921"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$suppressVanillaPlayerLabel(class_1297 class_12972, double d2, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (!(class_12972 instanceof class_1657)) {
            return;
        }
        cR cR2 = cR.get();
        if (cR2 != null && cR2.claimsPlayerLabels()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"method_3926"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$cancelVanillaLabelDraw(class_10017 class_100172, class_4587 class_45872, class_11659 class_116592, class_12075 class_120752, CallbackInfo callbackInfo) {
        if (!(class_100172 instanceof class_10055)) {
            return;
        }
        cR cR2 = cR.get();
        if (cR2 != null && cR2.claimsPlayerLabels()) {
            callbackInfo.cancel();
        }
    }
}

