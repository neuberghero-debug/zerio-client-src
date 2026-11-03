/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.gF;
import z.r.gj;
import z.r.kM;
import z.r.mw;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_746.class})
public abstract class eJ {
    private static final /* synthetic */ String a;

    @Inject(method={"method_3136"}, at={@At(value="HEAD")})
    private void zerio$reapplyFreecamBodyInputBeforeMovementPackets(CallbackInfo callbackInfo) {
        kM kM2;
        kM kM3;
        gF gF2 = mw.getInstance().getModuleByName(a);
        kM kM4 = kM3 = gF2 instanceof kM ? (kM2 = (kM)gF2) : null;
        if (kM3 == null || !kM3.isFreecamActive()) {
            return;
        }
        kM.reapplyBodyMovementFromKeys(class_310.method_1551());
    }

    @Inject(method={"method_5773"}, at={@At(value="TAIL")})
    private void zerio$reapplyFreecamBodyInputEndOfTick(CallbackInfo callbackInfo) {
        kM kM2;
        kM kM3;
        gF gF2 = mw.getInstance().getModuleByName(a);
        kM kM4 = kM3 = gF2 instanceof kM ? (kM2 = (kM)gF2) : null;
        if (kM3 == null || !kM3.isFreecamActive()) {
            return;
        }
        kM.reapplyBodyMovementFromKeys(class_310.method_1551());
    }

    @Inject(method={"method_22120"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$freecamHasMovementWhenLatched(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        kM kM2;
        kM kM3;
        class_746 class_7462 = (class_746)this;
        if (class_310.method_1551().field_1724 != class_7462) {
            return;
        }
        gF gF2 = mw.getInstance().getModuleByName(a);
        kM kM4 = kM3 = gF2 instanceof kM ? (kM2 = (kM)gF2) : null;
        if (kM3 == null || !kM3.isFreecamActive() || !kM3.hasLatchedLocomotion()) {
            return;
        }
        callbackInfoReturnable.setReturnValue((Object)true);
    }

    static {
        a = gj.decode("p/5nV9q33Q==", 1968442348);
    }
}

