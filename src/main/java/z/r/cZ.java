/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.joml.Matrix4f
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.joml.Matrix4f;

@Environment(value=EnvType.CLIENT)
public class cZ {
    public static final Matrix4f a = new Matrix4f();
    public static final Matrix4f b;
    public static final Matrix4f c;

    static {
        c = new Matrix4f();
        b = new Matrix4f();
    }
}

