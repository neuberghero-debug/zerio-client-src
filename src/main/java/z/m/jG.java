/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10426
 *  net.minecraft.class_12122
 *  net.minecraft.class_572$class_573
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10426;
import net.minecraft.class_12122;
import net.minecraft.class_572;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_10426.class})
public interface jG {
    @Accessor(value="field_63604")
    public void zerio$setHandSwingProgress(float var1);

    @Accessor(value="field_55304")
    public void zerio$setRightArmPose(class_572.class_573 var1);

    @Accessor(value="field_55306")
    public void zerio$setLeftArmPose(class_572.class_573 var1);

    @Accessor(value="field_63603")
    public void zerio$setSwingAnimationType(class_12122 var1);
}

