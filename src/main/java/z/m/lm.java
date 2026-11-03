/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_327
 *  net.minecraft.class_329
 *  net.minecraft.class_5348
 *  net.minecraft.class_5498
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_329;
import net.minecraft.class_5348;
import net.minecraft.class_5498;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.aR;
import z.r.dM;
import z.r.da;
import z.r.gF;
import z.r.gU;
import z.r.gj;
import z.r.kM;
import z.r.kl;
import z.r.mw;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_329.class})
public class lm {
    private static final /* synthetic */ String a;
    @Unique
    private static final String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;

    @Inject(method={"method_1736"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$replaceCrosshair(CallbackInfo callbackInfo) {
        da da2 = da.get();
        if (da2 != null && da2.shouldHideVanilla(class_310.method_1551())) {
            callbackInfo.cancel();
        }
    }

    @WrapOperation(method={"method_1736"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_5498;method_31034()Z")})
    private boolean zerio$freecamActLikeFirstPersonForCrosshair(class_5498 class_54982, Operation<Boolean> operation) {
        kM kM2;
        kM kM3;
        gF gF2 = mw.getInstance().getModuleByName(a);
        kM kM4 = kM3 = gF2 instanceof kM ? (kM2 = (kM)gF2) : null;
        if (kM3 != null && kM3.isFreecamActive() && kM3.isShowPlayerModel() && !class_54982.method_31034()) {
            return true;
        }
        return (Boolean)operation.call(new Object[]{class_54982});
    }

    @Inject(method={"method_55803"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderScoreboard(CallbackInfo callbackInfo) {
        gF gF2 = mw.getInstance().getModuleByName(d);
        if (gF2 != null && gF2.isEnabled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"}, at={@At(value="HEAD")})
    private void zerio$beginSidebar(CallbackInfo callbackInfo) {
        dM dM2 = dM.getInstance();
        if (dM2 != null) {
            dM2.beginSidebar();
        }
    }

    @WrapOperation(method={"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_327;method_27525(Lnet/minecraft/class_5348;)I", ordinal=0)})
    private int zerio$sidebarTitleWidth(class_327 class_3272, class_5348 class_53482, Operation<Integer> operation) {
        if (class_53482 instanceof class_2561) {
            class_2561 class_25612 = (class_2561)class_53482;
            return (Integer)operation.call(new Object[]{class_3272, lm.zerio$scrubSidebarText(class_25612)});
        }
        return (Integer)operation.call(new Object[]{class_3272, class_53482});
    }

    @WrapOperation(method={"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_327;method_27525(Lnet/minecraft/class_5348;)I", ordinal=1)})
    private int zerio$sidebarLineWidth(class_327 class_3272, class_5348 class_53482, Operation<Integer> operation) {
        if (class_53482 instanceof class_2561) {
            class_2561 class_25612 = (class_2561)class_53482;
            return (Integer)operation.call(new Object[]{class_3272, lm.zerio$transformSidebarLine(class_25612, true)});
        }
        return (Integer)operation.call(new Object[]{class_3272, class_53482});
    }

    @ModifyArg(method={"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_51439(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;IIIZ)V", ordinal=0), index=1)
    private class_2561 zerio$sidebarTitleDraw(class_2561 class_25612) {
        return lm.zerio$scrubSidebarText(class_25612);
    }

    @ModifyArg(method={"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_51439(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;IIIZ)V", ordinal=1), index=1)
    private class_2561 zerio$sidebarLineDraw(class_2561 class_25612) {
        return lm.zerio$transformSidebarLine(class_25612, false);
    }

    private static class_2561 zerio$transformSidebarLine(class_2561 class_25612, boolean bl2) {
        class_2561 class_25613 = class_25612;
        dM dM2 = dM.getInstance();
        if (dM2 != null) {
            class_25613 = bl2 ? dM2.rewriteForWidth(class_25613) : dM2.rewriteForDraw(class_25613);
        }
        return lm.zerio$scrubSidebarText(class_25613);
    }

    private static class_2561 zerio$scrubSidebarText(class_2561 class_25612) {
        return gU.applyForMessages(class_25612, kl.getInstance(), aR.m);
    }

    @ModifyVariable(method={"method_34004"}, at=@At(value="HEAD"), argsOnly=true)
    private class_2561 zerio$nameProtectTitle(class_2561 class_25612) {
        return lm.zerio$scrubGameMessage(class_25612);
    }

    @ModifyVariable(method={"method_34002"}, at=@At(value="HEAD"), argsOnly=true)
    private class_2561 zerio$nameProtectSubtitle(class_2561 class_25612) {
        return lm.zerio$scrubGameMessage(class_25612);
    }

    @ModifyVariable(method={"method_1758"}, at=@At(value="HEAD"), argsOnly=true)
    private class_2561 zerio$nameProtectOverlay(class_2561 class_25612) {
        return lm.zerio$scrubGameMessage(class_25612);
    }

    @ModifyVariable(method={"method_1732"}, at=@At(value="HEAD"), argsOnly=true)
    private class_2561 zerio$nameProtectRecordOverlay(class_2561 class_25612) {
        return lm.zerio$scrubGameMessage(class_25612);
    }

    @Unique
    private static class_2561 zerio$scrubGameMessage(class_2561 class_25612) {
        return gU.applyForMessages(class_25612, kl.getInstance(), aR.a);
    }

    static {
        c = gj.decode("Jx0LeKBV7TaRYTxC/1XWxvRculZPajQiXXerNNkNEyAdbFWAxw6xDMH8/dnPpBWN3BDvULQqX5tX7qy2BmCe9wbQpnLk8daXd5qjz9zxwqhVASZH2NijT2HH2FBSwWphXJZ66q3ZFS0p1lGEHcE=", 2134529586);
        a = gj.decode("LmZI9M5Rzw==", 2095498340);
        d = gj.decode("jZ/xAoBee1/RYgn3iz8=", 892840816);
        b = c;
    }
}

