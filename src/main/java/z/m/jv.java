/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import java.util.ArrayDeque;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.ck;
import z.r.gb;
import z.r.iE;
import z.r.lu;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_2818.class})
public abstract class jv {
    @Unique
    private static final ThreadLocal<ArrayDeque<class_2680>> a = ThreadLocal.withInitial(ArrayDeque::new);

    @Inject(method={"method_12010"}, at={@At(value="HEAD")})
    private void zerio$recordStateBefore(class_2338 class_23382, class_2680 class_26802, int n2, CallbackInfoReturnable<class_2680> callbackInfoReturnable) {
        a.get().push(((class_2818)this).method_8320(class_23382));
    }

    @Inject(method={"method_12010"}, at={@At(value="RETURN")})
    private void zerio$patchBlockEspCache(class_2338 class_23382, class_2680 class_26802, int n2, CallbackInfoReturnable<class_2680> callbackInfoReturnable) {
        ArrayDeque<class_2680> arrayDeque = a.get();
        if (arrayDeque.isEmpty()) {
            return;
        }
        class_2680 class_26803 = arrayDeque.pop();
        class_2818 class_28182 = (class_2818)this;
        class_2680 class_26804 = class_26802;
        gb gb2 = gb.getInstanceStatic();
        if (gb2 != null) {
            gb2.onClientChunkBlockEdited(class_28182, class_23382, class_26803, class_26804);
        }
        if (callbackInfoReturnable.getReturnValue() != null) {
            iE.onClientBlockChanged(class_28182, class_23382, class_26803, class_26804);
            lu.onClientBlockChanged(class_28182, class_23382, class_26803, class_26804);
            ck.onClientBlockChanged(class_28182, class_23382);
        }
    }
}

