/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1007
 *  net.minecraft.class_11890
 *  net.minecraft.class_1306
 *  net.minecraft.class_572$class_573
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 *  org.spongepowered.asm.mixin.transformer.meta.MixinProxy
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1007;
import net.minecraft.class_11890;
import net.minecraft.class_1306;
import net.minecraft.class_572;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.transformer.meta.MixinProxy;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_1007.class})
public interface bf {
    @Invoker(value="method_64258")
    @MixinProxy(sessionId="48601b63-ede7-4950-adb7-e84113f2c810")
    public static /* synthetic */ class_572.class_573 zerio$getArmPose(class_11890 class_118902, class_1306 class_13062) {
        return class_1007.getArmPose$zerio_$md$f2c810$0((class_11890)class_118902, (class_1306)class_13062);
    }
}

