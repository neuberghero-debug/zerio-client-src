/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1058
 *  net.minecraft.class_11659
 *  net.minecraft.class_11683$class_11792
 *  net.minecraft.class_12249
 *  net.minecraft.class_1921
 *  net.minecraft.class_3879
 *  net.minecraft.class_4587
 *  net.minecraft.class_922
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package z.m;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1058;
import net.minecraft.class_11659;
import net.minecraft.class_11683;
import net.minecraft.class_12249;
import net.minecraft.class_1921;
import net.minecraft.class_3879;
import net.minecraft.class_4587;
import net.minecraft.class_922;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import z.r.ef;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_922.class})
public class bm {
    @WrapOperation(method={"method_4054(Lnet/minecraft/class_10042;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_12075;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_11659;method_73490(Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_4587;Lnet/minecraft/class_1921;IIILnet/minecraft/class_1058;ILnet/minecraft/class_11683$class_11792;)V")})
    private void zerio$skinGlint(class_11659 class_116592, class_3879<Object> class_38792, Object object, class_4587 class_45872, class_1921 class_19212, int n2, int n3, int n4, class_1058 class_10582, int n5, class_11683.class_11792 class_117922, Operation<Void> operation) {
        boolean bl2 = ef.skinGlintFor(object);
        operation.call(new Object[]{class_116592, class_38792, object, class_45872, class_19212, n2, n3, bl2 ? -16777216 : n4, class_10582, n5, class_117922});
        if (bl2) {
            class_116592.method_73490(class_38792, object, class_45872, class_12249.method_75989(), n2, n3, -1, null, n5, null);
        }
    }
}

