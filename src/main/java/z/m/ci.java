/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10444$class_10445
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_777
 *  net.minecraft.class_918
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package z.m;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10444;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_777;
import net.minecraft.class_918;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import z.r.au;
import z.r.ef;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_918.class})
public class ci {
    @WrapOperation(method={"method_62476"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_918;method_23180(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;Ljava/util/List;[III)V")})
    private static void zerio$fullCoverBlackout(class_4587 class_45872, class_4588 class_45882, List<class_777> list, int[] nArray, int n2, int n3, Operation<Void> operation, @Local(argsOnly=true) class_10444.class_10445 class_104452) {
        if (class_104452 != class_10444.class_10445.field_55341 && ef.shouldBlackoutItem()) {
            class_45882 = new au(class_45882);
        }
        operation.call(new Object[]{class_45872, class_45882, list, nArray, n2, n3});
    }
}

