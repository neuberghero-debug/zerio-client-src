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
import z.r.iG;

@Environment(value=EnvType.CLIENT)
public class hL
extends iG {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), 1372623936);

    /*
     * Enabled aggressive block sorting
     */
    public hL(String string) {
        int n2 = a & 0xC2902E0B ^ 0x235E34E3;
        int n3 = (n2 | 0xC2902E0B) ^ 0xA6A9F85C;
        n3 ^= 0x972B4F1B;
        super(string);
        n3 ^= 0xF8F84DF1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean isIconGrid() {
        int n2 = a & 0xB63233F4 ^ 0x30CDF0AE;
        int n3 = 0;
        int n4 = (n2 | 0xB63233F4) ^ 0x7EED344F;
        n3 = (n2 | 0xB63233F4) ^ 0x9266C3F0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 614019086: {
                    break;
                }
                case -1956705437: {
                    n4 ^= n3 ^ 0xFE6402F7;
                    n3 = (n2 | 0xB63233F4) ^ 0xF95181F9;
                    continue block5;
                }
                case 1336832519: {
                    return true;
                }
            }
            n3 = (n2 | 0xB63233F4) ^ 0x3DA0F89D;
        }
    }
}

