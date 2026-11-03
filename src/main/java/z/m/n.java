/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10039
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10039;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import z.r.dC;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_10039.class})
public class n
implements dC {
    @Unique
    private boolean a;

    @Override
    public void zerio$setGlintAura(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public boolean zerio$hasGlintAura() {
        return this.a;
    }
}

