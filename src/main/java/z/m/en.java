/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.kM;
import z.r.kb;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_1297.class})
public class en {
    @Inject(method={"method_5851"}, at={@At(value="HEAD")}, cancellable=true)
    private void onIsGlowing(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        class_1297 class_12972 = (class_1297)this;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_12972 == class_3102.field_1724) {
            return;
        }
        kb kb2 = kb.get(class_3102);
        if (kb2 != null && kb2.shouldGlowEntity(class_12972, class_3102)) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    @Inject(method={"method_5756"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$freecamSeeOwnBody(class_1657 class_16572, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (class_16572 != class_310.method_1551().field_1724) {
            return;
        }
        if (!kM.rendersDetachedBody((class_1297)this)) {
            return;
        }
        callbackInfoReturnable.setReturnValue((Object)false);
        callbackInfoReturnable.cancel();
    }

    @Inject(method={"method_5727(DDD)Z"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$freecamKeepBodyInRenderRange(double d2, double d3, double d4, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (kM.rendersDetachedBody((class_1297)this)) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }
}

