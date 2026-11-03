/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_11908
 *  net.minecraft.class_309
 *  net.minecraft.class_310
 *  net.minecraft.class_437
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11908;
import net.minecraft.class_309;
import net.minecraft.class_310;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.H;
import z.r.bw;
import z.r.dn;
import z.r.gO;
import z.r.gj;
import z.r.gk;
import z.r.hJ;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_309.class})
public abstract class kP {
    private static final /* synthetic */ String a;

    @Inject(method={"method_1466"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$creamyKeyInput(long l2, int n2, class_11908 class_119082, CallbackInfo callbackInfo) {
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 == null || class_3102.method_22683().method_4490() != l2) {
            return;
        }
        if (gk.shouldBlockKeyInput(class_119082, n2)) {
            callbackInfo.cancel();
            return;
        }
        if (n2 != 1 && n2 != 0) {
            return;
        }
        dn dn2 = dn.get();
        if (dn2 != null) {
            dn2.onKeyboardInput(class_119082.comp_4795(), n2);
        }
    }

    @Inject(method={"method_1466"}, at={@At(value="TAIL")})
    private void zerio$openClickGuiOverMenu(long l2, int n2, class_11908 class_119082, CallbackInfo callbackInfo) {
        if (n2 != 1) {
            return;
        }
        int n3 = class_119082.comp_4795();
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 == null || class_3102.method_22683().method_4490() != l2) {
            return;
        }
        if (class_3102.field_1755 == null || class_3102.field_1755 instanceof bw) {
            return;
        }
        int n4 = H.get().getClickGuiKey();
        if (n4 < 0) {
            n4 = 344;
        }
        if (n3 != n4) {
            return;
        }
        if (hJ.ok()) {
            gO.suppressNextEndClientTick();
            class_3102.method_1507((class_437)new bw());
        } else if (hJ.hasProtectedModules()) {
            String string = hJ.errMsg();
            hJ.fatal(string == null || string.isBlank() ? a : string);
        }
    }

    static {
        a = gj.decode("dIJj+8tBd8jgcijbjhkJAWHW", -75284003);
    }
}

