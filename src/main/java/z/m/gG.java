/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1044
 *  net.minecraft.class_1060
 *  net.minecraft.class_12247
 *  net.minecraft.class_2960
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package z.m;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1044;
import net.minecraft.class_1060;
import net.minecraft.class_12247;
import net.minecraft.class_2960;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import z.r.ef;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_12247.class})
public class gG {
    @WrapOperation(method={"method_75926"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1060;method_4619(Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;")})
    private class_1044 zerio$customGlintSheet(class_1060 class_10602, class_2960 class_29602, Operation<class_1044> operation) {
        class_1044 class_10443 = ef.textureFor(class_29602);
        return class_10443 != null ? class_10443 : (class_1044)operation.call(new Object[]{class_10602, class_29602});
    }
}

