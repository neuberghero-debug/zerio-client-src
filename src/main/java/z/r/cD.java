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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class cD {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), -811365031);
    private static volatile boolean a;

    /*
     * Enabled aggressive block sorting
     */
    private cD() {
        int n2 = a & 0x3C55D601 ^ 0xB3B595C7;
        int n3 = (n2 | 0x3C55D601) ^ 0x848AB00D;
        n3 ^= 0x29798043;
        n3 ^= 0x167C0E04;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean isClaimed() {
        int n2 = a & 0xC12C5900 ^ 0xA3B83321;
        int n3 = 0;
        int n4 = (n2 | 0xC12C5900) ^ 0x329689A1;
        n3 = (n2 | 0xC12C5900) ^ 0xD228F994;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1784838500: {
                    n4 ^= n3 ^ 0x1A9486B0;
                    n3 = (n2 | 0xC12C5900) ^ 0xFF941AE;
                    continue block5;
                }
                case 831816373: {
                    n3 = (n2 | 0xC12C5900) ^ 0x7621FDBD;
                    continue block5;
                }
                case -331007345: 
            }
            break;
        }
        return a;
    }

    /*
     * Unable to fully structure code
     */
    public static void blockUse() {
        var3 = -2066918588;
        var0_1 = cD.a & -2066918588 ^ 1308538975;
        var2_2 = 0;
        if (true) ** GOTO lbl31
lbl5:
        // 1 sources

        while (true) {
            continue;
            break;
        }
        block8: while (true) {
            var2_2 = (var0_1 | var3) ^ 270639207;
            if (true) ** GOTO lbl15
            block9: while (true) {
                block14: {
                    var2_2 = (var0_1 | var3) ^ 701514815;
                    break block14;
lbl13:
                    // 1 sources

                    return;
                }
lbl16:
                // 2 sources

                block11: while (true) {
                    switch (var2_2) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block11;
                            }
                            break;
                        }
                        case -572630216: {
                            ** continue;
                        }
                        case -466632864: {
                            ** continue;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var2_2 = (var0_1 | var3) ^ 1840613823;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 1988459201: {
                            var1_3 ^= var2_2 ^ 1121881184;
                            continue block9;
                        }
lbl31:
                        // 1 sources

                        var1_3 = (var0_1 | var3) ^ 719662593;
                        var2_2 = (var0_1 | var3) ^ 1291145670;
                        ** continue;
                        case -1605733664: {
                            var1_3 ^= var2_2 ^ -516964290;
                            continue block8;
                        }
                        case -2130007399: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        ** while (true)
        cD.a = true;
        var2_2 = (var0_1 | var3) ^ -1149599330;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void clearClaimed() {
        int n2 = -2109027253;
        int n3 = a & 0x824ACC4B ^ 0xF84C82DA;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xD6F1BD46;
        n4 = (n3 | n2) ^ 0x65384996;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1518975179: {
                    return;
                }
                case -667803319: {
                    a = false;
                    n4 = (n3 | n2) ^ 0x7288C67A;
                    continue block7;
                }
                case -1619622067: {
                    n4 = (n3 | n2) ^ 0xD49C9FB3;
                    continue block7;
                }
                case 785535336: {
                    n5 ^= n4 ^ 0x726CCA4B;
                    n4 = (n3 | n2) ^ 0x227CEF92;
                    continue block7;
                }
                case -2000287583: 
            }
            n5 ^= n4 ^ 0xD9571F5A;
            n4 = (n3 | n2) ^ 0x5F3889EE;
        }
    }
}

