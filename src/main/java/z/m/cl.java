/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_12076
 *  net.minecraft.class_4184
 *  net.minecraft.class_638
 *  net.minecraft.class_9975
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_12076;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_9975;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.dB;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_9975.class})
public abstract class cl {
    @Inject(method={"method_74926"}, at={@At(value="TAIL")})
    private void zerio$skyColor(class_638 class_6382, float f2, class_4184 class_41842, class_12076 class_120762, CallbackInfo callbackInfo) {
        if (dB.skyActive()) {
            class_120762.field_63097 = dB.skyColor();
        }
    }
}

