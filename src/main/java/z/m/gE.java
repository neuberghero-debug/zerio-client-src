/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_2338
 *  net.minecraft.class_3965
 *  net.minecraft.class_636
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_3965;
import net.minecraft.class_636;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.da;
import z.r.gS;
import z.r.gW;
import z.r.lp;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_636.class})
public class gE {
    @Unique
    private class_2338 a;

    @Inject(method={"method_2918"}, at={@At(value="HEAD")})
    private void zerio$onAttackEntity(class_1657 class_16572, class_1297 class_12972, CallbackInfo callbackInfo) {
        lp.onAttack(class_16572, class_12972);
        da.onAttack(class_16572, class_12972);
    }

    @Inject(method={"method_2896"}, at={@At(value="HEAD")})
    private void zerio$onInteractBlock(class_746 class_7462, class_1268 class_12682, class_3965 class_39652, CallbackInfoReturnable<class_1269> callbackInfoReturnable) {
        this.a = gW.placementCandidate(class_7462, class_12682, class_39652);
    }

    @Inject(method={"method_2896"}, at={@At(value="RETURN")})
    private void zerio$afterInteractBlock(class_746 class_7462, class_1268 class_12682, class_3965 class_39652, CallbackInfoReturnable<class_1269> callbackInfoReturnable) {
        gW.confirmPlacement(this.a, (class_1269)callbackInfoReturnable.getReturnValue());
        this.a = null;
    }

    @Inject(method={"method_2899"}, at={@At(value="RETURN")})
    private void zerio$onBreakBlock(class_2338 class_23382, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (callbackInfoReturnable.getReturnValueZ()) {
            gS.onBlockBroken(class_23382);
        }
    }
}

