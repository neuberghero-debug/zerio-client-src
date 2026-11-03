/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10034
 *  net.minecraft.class_1268
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10034;
import net.minecraft.class_1268;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_10034.class})
public interface jD {
    @Accessor(value="field_53410")
    public void zerio$setInSneakingPose(boolean var1);

    @Accessor(value="field_53414")
    public void zerio$setIsUsingItem(boolean var1);

    @Accessor(value="field_53409")
    public void zerio$setActiveHand(class_1268 var1);

    @Accessor(value="field_53407")
    public void zerio$setItemUseTime(float var1);
}

