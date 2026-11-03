/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2535
 *  net.minecraft.class_2547
 *  net.minecraft.class_2596
 *  net.minecraft.class_8697
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import net.minecraft.class_8697;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.aK;
import z.r.dB;
import z.r.gB;
import z.r.iV;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_2535.class})
public abstract class s {
    @Inject(method={"method_10759"}, at={@At(value="HEAD")}, cancellable=true)
    private static <T extends class_2547> void zerio$goateTap(class_2596<T> class_25962, class_2547 class_25472, CallbackInfo callbackInfo) {
        if (!(class_25472 instanceof class_8697)) {
            return;
        }
        iV iV2 = iV.getInstance();
        if (iV2 != null) {
            iV2.onInboundPacket(class_25962, class_25472);
        }
        if (dB.cancelTimePacket(class_25962) || gB.intercept(class_25962, class_25472)) {
            callbackInfo.cancel();
            return;
        }
        aK.observeInbound(class_25962);
    }
}

