/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_355
 *  net.minecraft.class_5348
 *  net.minecraft.class_640
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 */
package z.m;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_355;
import net.minecraft.class_5348;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import z.r.aR;
import z.r.gU;
import z.r.kl;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_355.class})
public class be {
    @ModifyReturnValue(method={"method_1918"}, at={@At(value="RETURN")})
    private class_2561 zerio$nameProtectTab(class_2561 class_25612, class_640 class_6402) {
        if (class_25612 == null) {
            return null;
        }
        kl kl2 = kl.getInstance();
        if (kl2 == null) {
            return class_25612;
        }
        class_310 class_3102 = class_310.method_1551();
        String string = class_6402.method_2966().name();
        if (!kl2.protectsProfileName(string, class_3102, aR.i)) {
            return class_25612;
        }
        return gU.applyForKnownPlayer(class_25612, string, class_6402.method_2966().id(), kl2, aR.i);
    }

    @ModifyArg(method={"method_1919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_327;method_1728(Lnet/minecraft/class_5348;I)Ljava/util/List;"), index=0)
    private class_5348 zerio$nameProtectHeaderFooter(class_5348 class_53482) {
        if (!(class_53482 instanceof class_2561)) {
            return class_53482;
        }
        class_2561 class_25612 = (class_2561)class_53482;
        return gU.applyForMessages(class_25612, kl.getInstance(), aR.i);
    }
}

