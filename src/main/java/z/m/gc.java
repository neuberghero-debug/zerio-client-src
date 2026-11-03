/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 *  net.minecraft.class_743
 *  net.minecraft.class_744
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_743;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.gF;
import z.r.gj;
import z.r.kM;
import z.r.mw;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_743.class})
public abstract class gc {
    private static final /* synthetic */ String a;

    @Inject(method={"method_3129"}, at={@At(value="TAIL")}, order=100)
    private void zerio$freecamReapplyCachedBodyInputAfterKeyboardTick(CallbackInfo callbackInfo) {
        kM kM2;
        kM kM3;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1724.field_3913 != (class_744)this) {
            return;
        }
        gF gF2 = mw.getInstance().getModuleByName(a);
        kM kM4 = kM3 = gF2 instanceof kM ? (kM2 = (kM)gF2) : null;
        if (kM3 == null || !kM3.isFreecamActive()) {
            return;
        }
        kM.reapplyBodyMovementFromKeys(class_3102);
    }

    static {
        a = gj.decode("epWEnUAMtg==", -1602566443);
    }
}

