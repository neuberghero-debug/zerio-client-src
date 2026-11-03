/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_239
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.he;
import z.r.hh;
import z.r.hu;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_310.class})
public abstract class aB {
    @Inject(method={"method_1583"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$useGuard(CallbackInfo callbackInfo) {
        class_3965 class_39652;
        class_310 class_3102 = (class_310)this;
        if (he.suppressVanillaUse()) {
            callbackInfo.cancel();
            return;
        }
        class_239 class_2392 = class_3102.field_1765;
        if (class_2392 instanceof class_3965 && (class_39652 = (class_3965)class_2392).method_17783() == class_239.class_240.field_1332) {
            if (hu.consumeManualWorldInteraction()) {
                callbackInfo.cancel();
                return;
            }
            if (hh.blocksManualBlockUse(class_39652.method_17777())) {
                callbackInfo.cancel();
            }
        }
    }

    @Inject(method={"method_1536"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$attackGuard(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        class_3965 class_39652;
        boolean bl2;
        if (he.suppressAutomation()) {
            callbackInfoReturnable.setReturnValue((Object)false);
            return;
        }
        class_310 class_3102 = (class_310)this;
        class_239 class_2392 = class_3102.field_1765;
        boolean bl3 = bl2 = class_2392 instanceof class_3965 && (class_39652 = (class_3965)class_2392).method_17783() == class_239.class_240.field_1332;
        if (bl2 && hu.consumeManualWorldInteraction()) {
            callbackInfoReturnable.setReturnValue((Object)false);
            return;
        }
        if (!bl2 && class_3102.field_1724 != null && class_3102.field_1761 != null && (class_39652 = he.silentClickTarget()) != null) {
            class_3102.field_1761.method_2918((class_1657)class_3102.field_1724, (class_1297)class_39652);
            class_3102.field_1724.method_6104(class_1268.field_5808);
            callbackInfoReturnable.setReturnValue((Object)false);
            return;
        }
        class_2392 = class_3102.field_1765;
        if (class_2392 instanceof class_3966 && hh.blocksManualAttack((class_39652 = (class_3966)class_2392).method_17782())) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"method_1590"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$automationBreakingGuard(boolean bl2, CallbackInfo callbackInfo) {
        class_3965 class_39652;
        class_239 class_2392;
        if (bl2 && hu.blocksManualBlockBreaking()) {
            callbackInfo.cancel();
            return;
        }
        if (bl2 && hu.consumeManualWorldInteraction()) {
            callbackInfo.cancel();
            return;
        }
        class_310 class_3102 = (class_310)this;
        if (bl2 && (class_2392 = class_3102.field_1765) instanceof class_3965 && (class_39652 = (class_3965)class_2392).method_17783() == class_239.class_240.field_1332 && hh.blocksManualBlockBreak(class_39652.method_17777())) {
            callbackInfo.cancel();
            return;
        }
        if (he.suppressAutomation() && !he.allowVanillaBlockBreaking()) {
            callbackInfo.cancel();
        }
    }
}

