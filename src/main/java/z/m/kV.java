/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 *  net.minecraft.class_312
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.a;
import z.r.kM;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_312.class})
public abstract class kV {
    @Shadow
    private double field_1789;
    @Shadow
    private double field_1787;
    @Shadow
    @Final
    private class_310 field_1779;

    @Inject(method={"method_1606"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$freeLookMouse(double d2, CallbackInfo callbackInfo) {
        a a2 = a.get();
        if (a2 == null || !a2.shouldCaptureMouse()) {
            return;
        }
        if (this.field_1779.field_1755 != null) {
            return;
        }
        kM kM2 = kM.get();
        if (kM2 != null && kM2.isFreecamActive()) {
            return;
        }
        double d3 = (Double)this.field_1779.field_1690.method_42495().method_41753() * 0.6 + 0.2;
        double d4 = d3 * d3 * d3 * 8.0;
        double d5 = this.field_1789 * d4 * (double)a2.getLookSensitivity();
        double d6 = this.field_1787 * d4 * (double)a2.getLookSensitivity();
        if (((Boolean)this.field_1779.field_1690.method_72706().method_41753()).booleanValue()) {
            d5 = -d5;
        }
        if (((Boolean)this.field_1779.field_1690.method_42438().method_41753()).booleanValue()) {
            d6 = -d6;
        }
        a2.rotateCamera((float)d5 * 0.15f, (float)d6 * 0.15f);
        this.field_1789 = 0.0;
        this.field_1787 = 0.0;
        callbackInfo.cancel();
    }
}

