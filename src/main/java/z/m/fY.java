/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10185
 *  net.minecraft.class_241
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10185;
import net.minecraft.class_241;
import net.minecraft.class_310;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.m.iz;
import z.r.gF;
import z.r.gj;
import z.r.kM;
import z.r.mw;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_746.class})
public abstract class fY {
    private static final /* synthetic */ String a;

    @Inject(method={"method_66282"}, at={@At(value="HEAD")})
    private void zerio$neutralizeKeyboardBeforeMovementInput(CallbackInfo callbackInfo) {
        this.neutralizeLocomotionInputIfFreecam();
    }

    @Inject(method={"method_66282"}, at={@At(value="TAIL")})
    private void zerio$reapplyBodyAfterMovementInput(CallbackInfo callbackInfo) {
        kM.reapplyBodyMovementFromKeys(class_310.method_1551());
    }

    @Inject(method={"method_6007"}, at={@At(value="HEAD")})
    private void zerio$neutralizeKeyboardBeforeTickMovement(CallbackInfo callbackInfo) {
        this.neutralizeLocomotionInputIfFreecam();
    }

    @Inject(method={"method_6007"}, at={@At(value="TAIL")})
    private void zerio$reapplyBodyAfterTickMovement(CallbackInfo callbackInfo) {
        kM.reapplyBodyMovementFromKeys(class_310.method_1551());
    }

    private void neutralizeLocomotionInputIfFreecam() {
        kM kM2 = fY.getFreecam();
        if (kM2 == null || !kM2.isFreecamActive()) {
            return;
        }
        class_746 class_7462 = (class_746)this;
        class_7462.field_3913.field_54155 = class_10185.field_54098;
        ((iz)class_7462.field_3913).zerio$setMovementVector(class_241.field_1340);
    }

    private static kM getFreecam() {
        kM kM2;
        gF gF2 = mw.getInstance().getModuleByName(a);
        return gF2 instanceof kM ? (kM2 = (kM)gF2) : null;
    }

    static {
        a = gj.decode("NXsk4ULBOA==", 1658419675);
    }
}

