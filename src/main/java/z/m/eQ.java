/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2350
 *  net.minecraft.class_854
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2350;
import net.minecraft.class_854;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.et;
import z.r.gF;
import z.r.gj;
import z.r.kM;
import z.r.mw;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_854.class})
public abstract class eQ {
    private static final /* synthetic */ String a;

    @Inject(method={"method_3695"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$xrayForceVisible(class_2350 class_23502, class_2350 class_23503, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        kM kM2;
        kM kM3;
        et et2 = et.get();
        if (et2 != null && et2.isEnabled()) {
            callbackInfoReturnable.setReturnValue((Object)true);
            return;
        }
        gF gF2 = mw.getInstance().getModuleByName(a);
        kM kM4 = kM3 = gF2 instanceof kM ? (kM2 = (kM)gF2) : null;
        if (kM3 != null && kM3.isFreecamActive()) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    static {
        a = gj.decode("Dgqi8nDlqw==", -2034831401);
    }
}

