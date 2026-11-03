/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_4184
 *  net.minecraft.class_638
 *  net.minecraft.class_758
 *  org.joml.Vector4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_758;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import z.r.aZ;
import z.r.dB;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_758.class})
public class jM {
    @Inject(method={"method_62185"}, at={@At(value="RETURN")}, cancellable=false)
    private void zerio$tintFogColor(class_4184 class_41842, float f2, class_638 class_6382, int n2, float f3, CallbackInfoReturnable<Vector4f> callbackInfoReturnable) {
        Vector4f vector4f = (Vector4f)callbackInfoReturnable.getReturnValue();
        if (dB.fogActive()) {
            dB.applyFogColor(vector4f);
        } else if (aZ.isActive() && vector4f != null) {
            aZ.applyFogTint(vector4f);
        }
    }

    @ModifyArgs(method={"method_3211(Lnet/minecraft/class_4184;ILnet/minecraft/class_9779;FLnet/minecraft/class_638;)Lorg/joml/Vector4f;"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_758;method_71110(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"))
    private void zerio$fogDistances(Args args) {
        if (!dB.fogActive()) {
            return;
        }
        args.set(3, (Object)Float.valueOf(dB.fogStart(((Float)args.get(3)).floatValue())));
        args.set(4, (Object)Float.valueOf(dB.fogEnd(((Float)args.get(4)).floatValue())));
        args.set(5, (Object)Float.valueOf(dB.fogStart(((Float)args.get(5)).floatValue())));
        args.set(6, (Object)Float.valueOf(dB.fogEnd(((Float)args.get(6)).floatValue())));
        args.set(7, (Object)Float.valueOf(dB.fogEnd(((Float)args.get(7)).floatValue())));
        args.set(8, (Object)Float.valueOf(dB.fogEnd(((Float)args.get(8)).floatValue())));
    }
}

