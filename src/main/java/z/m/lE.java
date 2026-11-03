/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  net.minecraft.class_638
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.gW;
import z.r.gb;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_638.class})
public abstract class lE {
    @Inject(method={"method_41926"}, at={@At(value="HEAD")})
    private void zerio$blockEspPending(class_2338 class_23382, class_2680 class_26802, class_243 class_2432, CallbackInfo callbackInfo) {
        lE.notifyIfChunk((class_638)this, class_23382, class_26802);
    }

    @Inject(method={"method_41928"}, at={@At(value="HEAD")})
    private void zerio$blockEspPacket(class_2338 class_23382, class_2680 class_26802, int n2, CallbackInfo callbackInfo) {
        lE.notifyIfChunk((class_638)this, class_23382, class_26802);
    }

    private static void notifyIfChunk(class_638 class_6382, class_2338 class_23382, class_2680 class_26802) {
        gW.onBlockUpdate(class_6382, class_23382, class_26802);
        gb gb2 = gb.getInstanceStatic();
        if (gb2 == null || !gb2.isEnabled()) {
            return;
        }
        class_2818 class_28182 = class_6382.method_8500(class_23382);
        if (class_28182 == null) {
            return;
        }
        class_2680 class_26803 = class_28182.method_8320(class_23382);
        gb2.onClientChunkBlockEdited(class_28182, class_23382.method_10062(), class_26803, class_26802);
    }
}

