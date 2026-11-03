/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2248
 *  net.minecraft.class_2960
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2248;
import net.minecraft.class_2960;
import z.r.az;
import z.r.hL;

@Environment(value=EnvType.CLIENT)
public interface D {
    public static final int h = mK.a(MethodHandles.lookup().lookupClass(), 875156255);

    public Set<class_2960> getTrackedBlockIds();

    public void addTarget(class_2248 var1, int var2);

    public boolean removeTargetById(class_2960 var1);

    public az getTargetColor(class_2960 var1);

    public hL getTargetsGroup();
}

