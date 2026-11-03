/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1792
 *  net.minecraft.class_2960
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1792;
import net.minecraft.class_2960;
import z.r.iG;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class gR
extends iG {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), 1869429523);
    private final class_2960 a;

    /*
     * Enabled aggressive block sorting
     */
    public gR(String string, class_1792 class_17922, class_2960 class_29602) {
        int n2 = 1737873813;
        int n3 = a & 0x6795D995 ^ 0x58D3E646;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xA3881602;
        n5 ^= 0x6C828D3B;
        super(string, class_17922);
        n4 = (n3 | n2) ^ 0xBD074524;
        block6: while (true) {
            switch (n4) {
                default: {
                    continue block6;
                }
                case 1915998098: {
                    this.a = class_29602;
                    n4 = (n3 | n2) ^ 0xB195C908;
                    continue block6;
                }
                case -1026508045: {
                    n5 ^= n4 ^ 0x7A82A846;
                    n4 = (n3 | n2) ^ 0xDE43045;
                    continue block6;
                }
                case -834521377: {
                    n5 ^= n4 ^ 0x8FC2F431;
                    n4 = (n3 | n2) ^ 0xDDC1B5D3;
                    continue block6;
                }
                case -1575597564: 
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public class_2960 getTargetBlockId() {
        int n2 = a & 0x96E0A211 ^ 0x37C92ABF;
        int n3 = 0;
        int n4 = (n2 | 0x96E0A211) ^ 0xF7875B6E;
        n3 = (n2 | 0x96E0A211) ^ 0xA04AF742;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 515160967: {
                    n4 ^= n3 ^ 0xCD98E45C;
                    n3 = (n2 | 0x96E0A211) ^ 0xD64A7A8C;
                    continue block5;
                }
                case 396582397: {
                    break;
                }
                case 1638125619: {
                    return this.a;
                }
            }
            n3 = (n2 | 0x96E0A211) ^ 0xA95D1138;
        }
    }
}

