/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_243
 *  net.minecraft.class_4184
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
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.gj;
import z.r.kM;
import z.r.mw;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_4184.class})
public abstract class ch {
    private static final /* synthetic */ String a;
    @Shadow
    private float field_18718;
    @Shadow
    @Final
    private class_2338.class_2339 field_18713;
    @Shadow
    private class_243 field_18712;
    @Shadow
    private float field_18717;

    @Shadow
    protected abstract void method_19325(float var1, float var2);

    @Inject(method={"method_19321"}, at={@At(value="RETURN")})
    private void zerio$freecamOverride(class_1937 class_19372, class_1297 class_12972, boolean bl2, boolean bl3, float f2, CallbackInfo callbackInfo) {
        kM kM2 = ch.getFreecam();
        if (kM2 == null || !kM2.isFreecamActive()) {
            return;
        }
        double d2 = kM2.getInterpolatedX(f2);
        double d3 = kM2.getInterpolatedY(f2);
        double d4 = kM2.getInterpolatedZ(f2);
        this.field_18712 = new class_243(d2, d3, d4);
        this.field_18713.method_10102(d2, d3, d4);
        float f3 = kM2.getInterpolatedYaw(f2);
        float f4 = kM2.getInterpolatedPitch(f2);
        this.method_19325(f3, f4);
    }

    private static kM getFreecam() {
        return (kM)mw.getInstance().getModuleByName(a);
    }

    static {
        a = gj.decode("1F5jatqzog==", -1800448064);
    }
}

