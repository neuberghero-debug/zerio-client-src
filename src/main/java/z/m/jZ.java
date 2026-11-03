/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1268
 *  net.minecraft.class_1309
 *  net.minecraft.class_310
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.lx;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_1309.class})
public class jZ {
    @Shadow
    public boolean field_6252;

    @ModifyReturnValue(method={"method_6028"}, at={@At(value="RETURN")})
    private int zerio$swingSpeed(int n2) {
        class_1309 class_13092 = (class_1309)this;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 != class_13092) {
            return n2;
        }
        lx lx2 = lx.get();
        if (lx2 == null || !lx2.isEnabled()) {
            return n2;
        }
        return lx2.remapSwingDuration(n2);
    }

    @Inject(method={"method_23667(Lnet/minecraft/class_1268;Z)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$restartSwing(class_1268 class_12682, boolean bl2, CallbackInfo callbackInfo) {
        class_1309 class_13092 = (class_1309)this;
        if (class_310.method_1551().field_1724 != class_13092) {
            return;
        }
        lx lx2 = lx.get();
        if (lx2 == null || !lx2.isEnabled()) {
            return;
        }
        if (lx.isMiningSwing()) {
            if (this.field_6252) {
                callbackInfo.cancel();
            }
            return;
        }
        if (lx2.isRestartSwing() && !lx2.isPitchOnlyMotion()) {
            this.field_6252 = false;
        }
    }
}

