/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_1802
 *  net.minecraft.class_310
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.an;
import z.r.dc;
import z.r.gF;
import z.r.gj;
import z.r.lx;
import z.r.mw;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_310.class})
public class gI {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    @Shadow
    private int field_1752;

    @Inject(method={"method_1574"}, at={@At(value="HEAD")})
    private void onTick(CallbackInfo callbackInfo) {
        an an2;
        gF gF2 = mw.getInstance().getModuleByName(b);
        if (gF2 != null && gF2.isEnabled()) {
            this.field_1752 = 0;
            return;
        }
        gF gF3 = mw.getInstance().getModuleByName(a);
        class_310 class_3102 = (class_310)this;
        if (gF3 instanceof an && (an2 = (an)gF3).isEnabled() && class_3102.field_1724 != null && (class_3102.field_1724.method_6047().method_31574(class_1802.field_8301) || class_3102.field_1724.method_6079().method_31574(class_1802.field_8301))) {
            this.field_1752 = Math.min(this.field_1752, an2.getCrystalUseCooldown());
        }
    }

    @Inject(method={"method_1590"}, at={@At(value="HEAD")})
    private void zerio$miningSwingBegin(boolean bl2, CallbackInfo callbackInfo) {
        lx.setMiningSwing(true);
    }

    @Inject(method={"method_1590"}, at={@At(value="RETURN")})
    private void zerio$miningSwingEnd(boolean bl2, CallbackInfo callbackInfo) {
        lx.setMiningSwing(false);
    }

    @Inject(method={"method_27022"}, at={@At(value="RETURN")}, cancellable=true)
    private void zerio$shaderOutline(class_1297 class_12972, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        dc dc2 = dc.getInstance();
        if (dc2 != null && dc2.shouldOutline(class_12972)) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    static {
        b = gj.decode("Kr8wSwfyX0OL", -1430768989);
        a = gj.decode("YbI4fihhBmgH0zU=", -1365727016);
    }
}

