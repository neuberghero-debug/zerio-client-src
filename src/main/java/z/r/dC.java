/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface dC {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), -477318976);

    public void zerio$setGlintAura(boolean var1);

    public boolean zerio$hasGlintAura();
}

