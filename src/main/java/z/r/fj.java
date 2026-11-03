/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1657
 *  net.minecraft.class_490
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_490;

@Environment(value=EnvType.CLIENT)
public class fj
extends class_490 {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), -1316195793);

    /*
     * Enabled aggressive block sorting
     */
    public fj(class_1657 class_16572) {
        int n2 = a & 0xA5C1000B ^ 0x4C562C14;
        int n3 = (n2 | 0xA5C1000B) ^ 0x29D8C506;
        n3 ^= 0x4D9AA421;
        super(class_16572);
    }
}

