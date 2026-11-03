/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2561
 *  net.minecraft.class_2622
 *  net.minecraft.class_2672
 *  net.minecraft.class_2676
 *  net.minecraft.class_634
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_2622;
import net.minecraft.class_2672;
import net.minecraft.class_2676;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.aR;
import z.r.bi;
import z.r.bu;
import z.r.dM;
import z.r.er;
import z.r.gU;
import z.r.hs;
import z.r.kl;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_634.class})
public abstract class kh {
    @Inject(method={"method_45730"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$fakeCommands(String string, CallbackInfo callbackInfo) {
        er er2 = er.getInstance();
        if (er2 != null && er2.tryIntercept(string)) {
            callbackInfo.cancel();
            return;
        }
        dM dM2 = dM.getInstance();
        if (dM2 != null && dM2.tryInterceptBalance(string)) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"method_11094"}, at={@At(value="HEAD")})
    private void zerio$blockEntityDebugUpdate(class_2622 class_26222, CallbackInfo callbackInfo) {
        bu bu2 = bu.getInstance();
        if (bu2 != null) {
            bu2.onBlockEntityUpdatePacket(class_26222);
        }
    }

    @Inject(method={"method_11128"}, at={@At(value="HEAD")})
    private void zerio$blockEntityDebugChunk(class_2672 class_26722, CallbackInfo callbackInfo) {
        bu bu2 = bu.getInstance();
        if (bu2 != null) {
            bu2.onChunkDataPacket(class_26722);
        }
    }

    @Inject(method={"method_11128"}, at={@At(value="HEAD")})
    private void zerio$chunkFinderChunkLight(class_2672 class_26722, CallbackInfo callbackInfo) {
        hs.offerLight(class_26722.method_11523(), class_26722.method_11524(), class_26722.method_38599());
    }

    @Inject(method={"method_11143"}, at={@At(value="HEAD")})
    private void zerio$chunkFinderLightUpdate(class_2676 class_26762, CallbackInfo callbackInfo) {
        hs.offerLight(class_26762.method_11558(), class_26762.method_11554(), class_26762.method_38600());
    }

    @ModifyArg(method={"method_34075"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_418;<init>(Lnet/minecraft/class_2561;ZLnet/minecraft/class_746;)V"), index=0)
    private class_2561 zerio$nameProtectDeathScreen(class_2561 class_25612) {
        return gU.applyForMessages(class_25612, kl.getInstance(), aR.a);
    }

    @Inject(method={"method_11128"}, at={@At(value="TAIL")})
    private void zerio$debugChunkApplied(class_2672 class_26722, CallbackInfo callbackInfo) {
        bi bi2 = bi.getInstance();
        if (bi2 != null) {
            bi2.onChunkDataApplied(class_26722);
        }
    }
}

