/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_11910
 *  net.minecraft.class_310
 *  net.minecraft.class_312
 *  net.minecraft.class_408
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11910;
import net.minecraft.class_310;
import net.minecraft.class_312;
import net.minecraft.class_408;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.a;
import z.r.cC;
import z.r.dn;
import z.r.gF;
import z.r.gj;
import z.r.hc;
import z.r.kM;
import z.r.mw;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_312.class})
public abstract class kX {
    private static final /* synthetic */ String a;

    @Inject(method={"method_1601"}, at={@At(value="HEAD")})
    private void zerio$creamyMouseInput(long l2, class_11910 class_119102, int n2, CallbackInfo callbackInfo) {
        dn dn2;
        if (n2 != 1 && n2 != 0) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 != null && class_3102.method_22683().method_4490() == l2 && (dn2 = dn.get()) != null) {
            dn2.onMouseInput(class_119102.comp_4801(), n2);
        }
    }

    @Inject(method={"method_1598"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$onScroll(long l2, double d2, double d3, CallbackInfo callbackInfo) {
        kM kM2;
        gF gF2;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 == null || class_3102.method_22683().method_4490() != l2) {
            return;
        }
        dn dn2 = dn.get();
        if (dn2 != null) {
            dn2.onMouseScroll(d3);
        }
        if (class_3102.field_1755 instanceof class_408) {
            if (hc.onMouseScroll(class_3102, d3)) {
                callbackInfo.cancel();
            }
            return;
        }
        if (class_3102.field_1755 != null) {
            return;
        }
        gF gF3 = mw.getInstance().getModuleByName(a);
        if (gF3 instanceof kM) {
            gF2 = (kM)gF3;
            v0 = gF2;
        } else {
            v0 = kM2 = null;
        }
        if (kM2 != null && kM2.isFreecamActive()) {
            if (kM2.onMouseScroll(d3)) {
                callbackInfo.cancel();
            }
            return;
        }
        gF2 = z.r.a.get();
        if (gF2 != null && ((a)gF2).onMouseScroll(d3)) {
            callbackInfo.cancel();
            return;
        }
        gF3 = cC.get();
        if (gF3 != null && ((cC)gF3).onMouseScroll(d3)) {
            callbackInfo.cancel();
        }
    }

    static {
        a = gj.decode("AIqiNaitpw==", 444221442);
    }
}

