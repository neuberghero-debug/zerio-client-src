/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10799
 *  net.minecraft.class_2960
 *  net.minecraft.class_332
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10799;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import z.r.gj;
import z.r.jt;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class hn {
    private static final int a;
    private static final class_2960 a;
    public static final int b;
    private static final int[] a;
    public static boolean a;
    private static final class_2960 b;
    public static final int c;
    public static final int d;
    public static final int e;
    private static final class_2960 c;

    /*
     * Enabled aggressive block sorting
     */
    private hn() {
        int n2 = e & 0x78B06820 ^ 0x84E5DDC3;
        int n3 = (n2 | 0x78B06820) ^ 0x1F87558;
        n3 ^= 0xBDAA0827;
        n3 ^= 0x899729;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String MY() {
        int n2 = 1093247003;
        int n3 = e & 0x5F58DBE9 ^ 0x150F81BD;
        int n4 = 0;
        int n5 = (n3 | 0x5F58DBE9) ^ 0x346B79F2;
        n4 = (n3 | 0x5F58DBE9) ^ 0x98A26FC5;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case 510753778: {
                    return gj.text(hn.MZ((n5 | n4 ^ n2) ^ (n4 ^ 0x69935B38), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x8FABAE98))), hn.MZ((n5 | n4 ^ n2) ^ (n4 ^ 0x69935B39), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x959CBF99))), hn.MZ((n5 | n4 ^ n2) ^ (n4 ^ 0x69935B3A), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xECB9EE))), hn.MZ((n5 | n4 ^ n2) ^ (n4 ^ 0x69935B3B), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xF3546119))), hn.MZ((n5 | n4 ^ n2) ^ (n4 ^ 0x69935B3C), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x2301431B))));
                }
                case -939674568: {
                    n4 = (n3 | 0x5F58DBE9) ^ 0x1B6578D2;
                    continue block5;
                }
                case 1144693551: 
            }
            n5 ^= n4 ^ 0xEAD58D80;
            n4 = (n3 | 0x5F58DBE9) ^ 0x412EA00F;
        }
    }

    private static int MZ(int n2, int n3) {
        int n4 = 1462717016;
        int n5 = -1214701520;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x5F86955B)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xF7BFC9D0;
        n6 += (n5 | n4) ^ 0xF7BFC672;
        n6 -= (n5 | n4) ^ 0xF7BF30D5;
        n6 += (n5 | n4) ^ 0xF7BF70CE;
        n6 -= (n5 | n4) ^ 0xF7BF7DF8;
        n6 -= (n5 | n4) ^ 0xF7BF4342;
        n6 -= (n5 | n4) ^ 0xF7BFD018;
        n6 += (n5 | n4) ^ 0xF7BFD410;
        return n6 -= (n5 | n4) ^ 0xF7BF257E;
    }

    /*
     * Unable to fully structure code
     */
    private static String Na(int ... var0) {
        block32: {
            block36: {
                block33: {
                    block34: {
                        block30: {
                            block31: {
                                block35: {
                                    break block35;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        var6_4 = (var4_3 | var8_1) ^ 1720466592;
                                        break block30;
                                        break;
                                    }
lbl4:
                                    // 1 sources

                                    while (true) {
                                        var5_5 ^= var6_4 ^ -2134143772;
                                        ** GOTO lbl99
                                        break;
                                    }
lbl7:
                                    // 1 sources

                                    while (true) {
                                        var6_4 = (var4_3 | var8_1) ^ 2045334492;
                                        break block31;
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var5_5 ^= 1277422652;
                                        break block32;
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        System.arraycopy(var0, 0, var3_8, var1_6.length, var0.length);
                                        ** GOTO lbl95
                                        break;
                                    }
lbl16:
                                    // 1 sources

                                    while (true) {
                                        var6_4 = (var4_3 | var8_1) ^ -1165534881;
                                        break block31;
                                        break;
                                    }
                                }
                                var8_1 = 1282823704;
                                var7_2 = 455347274;
                                var4_3 = hn.e & 1282823704 ^ -1669691140;
                                var6_4 = 0;
                                break block36;
lbl25:
                                // 1 sources

                                while (true) {
                                    ** GOTO lbl57
                                    break;
                                }
lbl27:
                                // 1 sources

                                while (true) {
                                    var5_5 ^= var6_4 ^ 1275266844;
                                    break block33;
                                    break;
                                }
lbl30:
                                // 1 sources

                                while (true) {
                                    var5_5 ^= var6_4 ^ 1459837568;
                                    ** GOTO lbl55
                                    break;
                                }
lbl33:
                                // 1 sources

                                while (true) {
                                    System.arraycopy(var2_7, 0, var3_8, var1_6.length + var0.length, var2_7.length);
                                    ** GOTO lbl97
                                    break;
                                }
lbl36:
                                // 1 sources

                                while (true) {
                                    var5_5 ^= var6_4 ^ 848462681;
                                    ** GOTO lbl101
                                    break;
                                }
                            }
lbl40:
                            // 2 sources

                            block26: while (true) {
                                switch (var6_4) lbl-1000:
                                // 6 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block26;
                                        }
                                        break;
                                    }
                                    case -1659860865: {
                                        ** continue;
                                    }
                                    case 567757888: {
                                        ** continue;
                                    }
                                    case 1300181556: {
                                        ** continue;
                                    }
                                    case 1727629219: {
                                        ** continue;
                                    }
                                    case -1516794592: {
                                        ** continue;
                                    }
lbl55:
                                    // 1 sources

                                    var6_4 = (var4_3 | var8_1) ^ -1369667636;
                                    ** GOTO lbl-1000
lbl57:
                                    // 1 sources

                                    var2_7 = new int[]{hn.MZ(((var5_5 ^= -1368932248) | var8_1) ^ 1984340138, (var4_3 | var8_1) ^ ((var5_5 | var8_1) ^ -1486810385)), hn.MZ((var5_5 | var8_1) ^ 1984340139, (var4_3 | var8_1) ^ ((var5_5 | var8_1) ^ 1633320332)), hn.MZ((var5_5 | var8_1) ^ 1984340136, (var4_3 | var8_1) ^ ((var5_5 | var8_1) ^ 33892785)), hn.MZ((var5_5 | var8_1) ^ 1984340137, (var4_3 | var8_1) ^ ((var5_5 | var8_1) ^ -270649037))};
                                    ** continue;
lbl59:
                                    // 1 sources

                                    while (true) {
                                        v0 = new int[hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744343), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 1665502655)))];
                                        v0[0] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744342), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 1709843643)));
                                        v0[1] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744341), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -1620939512)));
                                        v0[2] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744348), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -211606369)));
                                        v0[3] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744347), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -639737389)));
                                        v0[4] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744346), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 10233732)));
                                        v0[5] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744345), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -1274428482)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744352)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 187973038))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744351), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2101337553)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744350)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -736696814))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744349), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 1412214478)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744324)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 1660844901))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744323), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 1578733662)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744322)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 632305581))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744321), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 141860162)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744328)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -1518161818))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744327), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 1876581447)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744326)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 3713241))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744325), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 613092623)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744332)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 236368306))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744331), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 1472770428)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744330)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -1062250770))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744329), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 2024622011)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744336)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -1871782863))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744335), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 731327918)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744334)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 2010882084))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744333), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 2135443597)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744372)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -1726777867))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744371), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -1409240391)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744370)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 1579259845))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744369), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 496040612)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744376)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 1488421123))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744375), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -1245026262)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744374)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 1310051494))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744373), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 129142372)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744380)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 2136741936))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744379), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -886743961)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744378)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 1565649261))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744377), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 91323095)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744384)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 1541900435))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744383), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 908511175)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744382)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ 1683324045))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744381), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -1519564831)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744356)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -1772009934))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744355), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -1020857635)));
                                        v0[hn.MZ((int)((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744354)), (int)((var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -1813758177))))] = hn.MZ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2095744353), (var4_3 | var6_4 ^ var7_2) ^ ((var5_5 | var6_4 ^ var7_2) ^ (var6_4 ^ -2061240419)));
                                        var1_6 = v0;
                                        ** continue;
                                        break;
                                    }
                                    case -1454749052: {
                                        System.arraycopy(var1_6, 0, var3_8, 0, var1_6.length);
                                        break block34;
                                    }
                                    case 1104253757: {
                                        var5_5 ^= var6_4 ^ 1816157097;
                                        ** continue;
                                    }
lbl95:
                                    // 1 sources

                                    var6_4 = (var4_3 | var8_1) ^ -1649455679;
                                    ** GOTO lbl-1000
lbl97:
                                    // 1 sources

                                    var6_4 = (var4_3 | var8_1) ^ -1862144824;
                                    ** GOTO lbl-1000
lbl99:
                                    // 1 sources

                                    var6_4 = (var4_3 | var8_1) ^ -39218500;
                                    ** GOTO lbl-1000
lbl101:
                                    // 1 sources

                                    var6_4 = (var4_3 | var8_1) ^ 1966380152;
                                    ** continue;
                                    case 1914853680: {
                                        return gj.text(var3_8);
                                    }
                                }
                                break;
                            }
                        }
lbl106:
                        // 3 sources

                        block29: while (true) {
                            switch (var6_4) {
                                default: {
                                    continue block29;
                                }
                                case -1158487460: {
                                    ** continue;
                                }
                                case 2058155816: {
                                    ** continue;
                                }
                                ** case 1465014866:
lbl115:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                    }
                    var6_4 = (var4_3 | var8_1) ^ 1097750147;
                    ** while (true)
                }
                var6_4 = (var4_3 | var8_1) ^ -1960016722;
                ** GOTO lbl106
            }
            var5_5 = (var4_3 | var8_1) ^ 1458823289;
            var6_4 = (var4_3 | var8_1) ^ -1496176172;
            ** while (true)
        }
        var3_8 = new int[var1_6.length + var0.length + var2_7.length];
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void fill(class_332 var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        var9_6 = 54651888;
        var6_7 = hn.e & 54651888 ^ 2111093801;
        var8_8 = 0;
        var7_9 = (var6_7 | var9_6) ^ -1513910470;
        var8_8 = (var6_7 | var9_6) ^ 927189857;
        if (true) ** GOTO lbl19
        block7: while (true) {
            switch (var8_8) {
                case -757507741: {
                    var7_9 ^= var8_8 ^ -1060965703;
                    var8_8 = (var6_7 | var9_6) ^ 565852076;
                    continue block7;
                }
                case -672650037: {
                    var7_9 ^= var8_8 ^ 1843238311;
                    var8_8 = (var6_7 | var9_6) ^ 926367328;
                    continue block7;
                }
                case 1217803416: {
                    var8_8 = (var6_7 | var9_6) ^ -1472343246;
                }
lbl19:
                // 3 sources

                default: {
                    continue block7;
                }
                case 1222820249: {
                    hn.fill(var0, var1_1, var2_2, var3_3, var4_4, var5_5, hn.MZ((var7_9 | var8_8 ^ 1268984425) ^ (var8_8 ^ -2085038723), (var6_7 | var8_8 ^ 1268984425) ^ ((var7_9 | var8_8 ^ 1268984425) ^ (var8_8 ^ 1908476648))));
                    var8_8 = (var6_7 | var9_6) ^ -1391679846;
                    continue block7;
                }
                case 1584384085: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void fill(class_332 var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        block64: {
            block68: {
                block75: {
                    block66: {
                        block69: {
                            block74: {
                                block73: {
                                    block70: {
                                        block65: {
                                            block63: {
                                                block71: {
                                                    block76: {
                                                        block67: {
                                                            block62: {
                                                                block72: {
                                                                    block77: {
                                                                        break block77;
lbl1:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var11_9 = (var9_8 | var12_7) ^ 338777061;
                                                                            break block62;
                                                                            break;
                                                                        }
lbl4:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var10_10 ^= var11_9 ^ 618485541;
                                                                            break block63;
                                                                            break;
                                                                        }
lbl7:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var11_9 = (var9_8 | var12_7) ^ 94109878;
                                                                            break block64;
                                                                            break;
                                                                        }
lbl10:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var11_9 = (var9_8 | var12_7) ^ -430092987;
                                                                            break block65;
                                                                            break;
                                                                        }
lbl13:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
lbl15:
                                                                        // 1 sources

                                                                        return;
lbl17:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var11_9 = (var9_8 | var12_7) ^ -1456052249;
                                                                            break block64;
                                                                            break;
                                                                        }
lbl20:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var10_10 ^= var11_9 ^ -1329465133;
                                                                            break block66;
                                                                            break;
                                                                        }
lbl23:
                                                                        // 1 sources

                                                                        while (var3_3 > 0) {
                                                                            break block67;
                                                                        }
                                                                        break block73;
lbl26:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (var7_11 >= 2) break block68;
                                                                            ** continue;
                                                                            break;
                                                                        }
lbl29:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var10_10 ^= var11_9 ^ 123341335;
                                                                            break block69;
                                                                            break;
                                                                        }
lbl32:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var10_10 ^= var11_9 ^ 129983594;
                                                                            break block70;
                                                                            break;
                                                                        }
lbl35:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var10_10 ^= var11_9 ^ -1102488060;
                                                                            ** continue;
                                                                            break;
                                                                        }
lbl38:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var10_10 ^= var11_9 ^ 673306609;
                                                                            ** continue;
                                                                            break;
                                                                        }
lbl41:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var10_10 ^= var11_9 ^ -2037043222;
                                                                            break block71;
                                                                            break;
                                                                        }
lbl44:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
lbl46:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var11_9 = (var9_8 | var12_7) ^ 494607725;
                                                                            break block65;
                                                                            break;
                                                                        }
                                                                    }
                                                                    var12_7 = 230566210;
                                                                    var9_8 = hn.e & 230566210 ^ 371125895;
                                                                    var11_9 = 0;
                                                                    var10_10 = (var9_8 | var12_7) ^ -1858155584;
                                                                    ** while (true)
lbl55:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (var4_4 > 0) break block72;
                                                                        break block73;
                                                                        break;
                                                                    }
lbl58:
                                                                    // 1 sources

                                                                    while (hn.a) {
                                                                        break block74;
                                                                    }
                                                                    break block73;
                                                                }
                                                                var11_9 = (var9_8 | var12_7) ^ -1426588138;
                                                                break block62;
lbl64:
                                                                // 1 sources

                                                                while (true) {
                                                                    var11_9 = (var9_8 | var12_7) ^ -1841729019;
                                                                    break block62;
lbl67:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var10_10 ^= var11_9 ^ -476078772;
                                                                        break block75;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                var0.method_25294(var1_1, var2_2, var1_1 + var3_3, var2_2 + var4_4, var5_5);
                                                                var11_9 = (var9_8 | var12_7) ^ 1110942526;
                                                                break block62;
                                                                hn.Nb(var0, var8_12, var1_1, var2_2, var3_3, var4_4, var7_11, var5_5);
                                                                var11_9 = (var9_8 | var12_7) ^ -298992897;
                                                                break block65;
lbl76:
                                                                // 1 sources

                                                                while (true) {
                                                                    var10_10 ^= var11_9 ^ 1627060293;
                                                                    break block76;
                                                                    break;
                                                                }
lbl79:
                                                                // 1 sources

                                                                return;
lbl81:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
lbl84:
                                                            // 9 sources

                                                            block55: while (true) {
                                                                switch (var11_9) {
                                                                    default: {
                                                                        continue block55;
                                                                    }
                                                                    case -1536553785: {
                                                                        ** continue;
                                                                    }
                                                                    case 1569279225: {
                                                                        ** continue;
                                                                    }
                                                                    case -1920492094: {
                                                                        ** GOTO lbl23
                                                                    }
                                                                    case -549720195: {
                                                                        ** continue;
                                                                    }
                                                                    case -1253502511: {
                                                                        ** continue;
                                                                    }
                                                                    case -1184243286: {
                                                                        ** continue;
                                                                    }
                                                                    case 533327053: {
                                                                        ** GOTO lbl58
                                                                    }
                                                                    case -1903058269: {
                                                                        ** continue;
                                                                    }
                                                                    case -133020823: {
                                                                        break;
                                                                    }
                                                                    case 193969186: {
                                                                        break;
                                                                    }
                                                                }
                                                                var11_9 = (var9_8 | var12_7) ^ -1495855507;
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var11_9 = (var9_8 | var12_7) ^ -408114002;
                                                        ** GOTO lbl84
                                                    }
                                                    var11_9 = (var9_8 | var12_7) ^ -1063523045;
                                                    break block64;
lbl116:
                                                    // 1 sources

                                                    while (true) {
                                                        var11_9 = (var9_8 | var12_7) ^ -968920208;
                                                        break block64;
                                                        break;
                                                    }
                                                }
                                                var11_9 = (var9_8 | var12_7) ^ 633099970;
                                                ** GOTO lbl84
                                                {
                                                    case 1916137089: {
                                                        return;
                                                    }
                                                }
                                            }
                                            var11_9 = (var9_8 | var12_7) ^ 205006802;
                                            break block64;
lbl127:
                                            // 1 sources

                                            while (true) {
                                                var8_12 = hn.Nd(var7_11);
                                                ** continue;
                                                break;
                                            }
                                            {
                                                case 462182176: {
                                                    ** continue;
                                                }
                                            }
                                            var11_9 = (var9_8 | var12_7) ^ -1065025350;
                                            ** GOTO lbl84
                                        }
lbl135:
                                        // 2 sources

                                        block58: while (true) {
                                            switch (var11_9) {
                                                default: {
                                                    continue block58;
                                                }
                                                case 46527146: {
                                                    ** continue;
                                                }
                                                case -242002632: {
                                                    ** continue;
                                                }
                                                case -1432899518: {
                                                    ** continue;
                                                }
                                                ** case -102522238:
lbl146:
                                                // 1 sources

                                                ** continue;
                                            }
                                            break;
                                        }
                                        var0.method_25294(var1_1, var2_2, var1_1 + var3_3, var2_2 + var4_4, var5_5);
                                        var11_9 = (var9_8 | var12_7) ^ -1042568468;
                                        break block64;
                                        {
                                            ** case 973256965:
                                        }
lbl151:
                                        // 1 sources

                                        var7_11 = Math.min(var6_6, Math.min(var3_3, var4_4) / 2);
                                        ** while (true)
                                    }
                                    var11_9 = (var9_8 | var12_7) ^ 7799562;
                                    ** GOTO lbl84
lbl156:
                                    // 1 sources

                                    while (true) {
                                        var11_9 = (var9_8 | var12_7) ^ -1464549221;
                                        break block64;
                                        break;
                                    }
                                }
                                var11_9 = (var9_8 | var12_7) ^ -1859170972;
                                ** GOTO lbl84
                            }
                            var11_9 = (var9_8 | var12_7) ^ 70432999;
                            ** GOTO lbl84
                        }
                        var11_9 = (var9_8 | var12_7) ^ -1255579771;
                        ** while (true)
                    }
                    var11_9 = (var9_8 | var12_7) ^ 1837826374;
                    ** GOTO lbl84
                }
                var11_9 = (var9_8 | var12_7) ^ -1143676160;
                ** while (true)
lbl174:
                // 1 sources

                while (true) {
                    var10_10 ^= var11_9 ^ -1434699533;
                    ** continue;
                    break;
                }
            }
            var11_9 = (var9_8 | var12_7) ^ 1213936656;
        }
        block61: while (true) {
            switch (var11_9) {
                default: {
                    continue block61;
                }
                case -1232566240: {
                    ** continue;
                }
                case 438497137: {
                    ** continue;
                }
                case -551222564: {
                    ** continue;
                }
                case -563788501: {
                    ** continue;
                }
                case -645817161: {
                    ** continue;
                }
                case 327600149: {
                    ** continue;
                }
                case -1224069284: {
                    ** continue;
                }
                ** case 1474681815:
lbl199:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public static void fillBorder(class_332 var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    private static void Nb(class_332 var0, jt var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [78[UNCONDITIONALDOLOOP]], but top level block is 30[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    private static void Nc(class_332 var0, class_2960 var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, int var9_9, int var10_10, int var11_11) {
        block46: {
            block47: {
                block41: {
                    block48: {
                        block43: {
                            block44: {
                                block40: {
                                    block42: {
                                        block45: {
                                            block39: {
                                                var17_12 = -1671161676;
                                                var14_13 = hn.e & -1671161676 ^ -562042907;
                                                var16_14 = 0;
                                                ** GOTO lbl28
lbl5:
                                                // 1 sources

                                                while (true) {
                                                    var16_14 = (var14_13 | var17_12) ^ -843858285;
                                                    break block39;
                                                    break;
                                                }
lbl8:
                                                // 1 sources

                                                while (true) {
                                                    var16_14 = (var14_13 | var17_12) ^ 627294622;
                                                    break block40;
                                                    break;
                                                }
lbl11:
                                                // 1 sources

                                                while (true) {
                                                    var16_14 = (var14_13 | var17_12) ^ 1141309163;
                                                    break block40;
lbl14:
                                                    // 1 sources

                                                    while (true) {
                                                        var15_15 ^= var16_14 ^ 886089523;
                                                        break block41;
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
lbl18:
                                            // 8 sources

                                            block27: while (true) {
                                                switch (var16_14) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        default: {
                                                            continue block27;
                                                        }
                                                        break;
                                                    }
                                                    case 692692190: {
                                                        break block42;
                                                    }
                                                    case 486254677: {
                                                        var12_16 = var5_5 - var3_3;
                                                        break block27;
                                                    }
lbl28:
                                                    // 1 sources

                                                    var15_15 = (var14_13 | var17_12) ^ 1142388755;
                                                    var16_14 = (var14_13 | var17_12) ^ -147432661;
                                                    ** continue;
                                                    case 332153190: {
                                                        if (var10_10 > 0) break block43;
                                                        break block44;
                                                    }
lbl34:
                                                    // 1 sources

                                                    while (var12_16 > 0) {
                                                        break block45;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                            var15_15 ^= 531508284;
                                            break block47;
                                        }
                                        var16_14 = (var14_13 | var17_12) ^ -509243635;
                                        break block40;
lbl42:
                                        // 1 sources

                                        while (true) {
                                            var16_14 = (var14_13 | var17_12) ^ -612774833;
                                            ** GOTO lbl18
                                            break;
                                        }
                                    }
                                    var16_14 = (var14_13 | var17_12) ^ -1775335211;
                                    ** GOTO lbl18
lbl48:
                                    // 1 sources

                                    while (true) {
                                        var16_14 = (var14_13 | var17_12) ^ -754395528;
                                        ** GOTO lbl18
                                        break;
                                    }
lbl51:
                                    // 1 sources

                                    while (true) {
                                        var0.method_25293(class_10799.field_56883, var1_1, var7_7, var8_8, (float)var3_3, (float)var4_4, var9_9, var10_10, var12_16, var13_17, var2_2, var2_2, var11_11);
                                        ** continue;
                                        break;
                                    }
                                    {
                                        case -1452429514: {
                                            var15_15 ^= var16_14 ^ 1057775882;
                                            break block48;
                                        }
                                    }
                                }
lbl58:
                                // 5 sources

                                block33: while (true) {
                                    block11 : switch (var16_14) lbl-1000:
                                    // 4 sources

                                    {
                                        default: {
                                            continue block33;
                                        }
                                        case 1441652110: {
                                            ** continue;
                                        }
                                        case -663643289: {
                                            ** GOTO lbl34
                                        }
                                        case 1071280376: {
                                            break block33;
                                        }
                                        case -747183706: {
                                            ** continue;
                                        }
lbl70:
                                        // 1 sources

                                        while (true) {
                                            var16_14 = (var14_13 | var17_12) ^ 218701395;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        {
                                            case 225913229: {
                                                if (var9_9 <= 0) break block11;
                                                ** continue;
                                            }
                                        }
lbl76:
                                        // 2 sources

                                        while (true) {
                                            var16_14 = (var14_13 | var17_12) ^ 1247733597;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case -82035093: {
                                            var15_15 ^= var16_14 ^ -305057526;
                                            break block46;
                                        }
                                    }
                                    break;
                                }
                                var16_14 = (var14_13 | var17_12) ^ -727941663;
                                ** GOTO lbl58
                                {
                                    case 1483217568: {
                                        return;
                                    }
                                }
                                {
                                    case -1703345890: {
                                        var15_15 ^= var16_14 ^ -1842157404;
                                        ** continue;
                                    }
                                }
                            }
                            var16_14 = (var14_13 | var17_12) ^ 1299254980;
                            ** GOTO lbl18
                            {
                                case -1809770328: {
                                    var15_15 ^= var16_14 ^ 317780245;
                                    var16_14 = (var14_13 | var17_12) ^ 1905898204;
                                    ** GOTO lbl-1000
                                }
                            }
                        }
                        var16_14 = (var14_13 | var17_12) ^ 1997689027;
                        ** GOTO lbl18
                    }
                    var16_14 = (var14_13 | var17_12) ^ -1031514208;
                    ** GOTO lbl18
                    {
                        case 84292538: {
                            ** continue;
                        }
                        case 1213298464: {
                            var15_15 ^= var16_14 ^ 1550886024;
                            ** continue;
                        }
                    }
                }
                var16_14 = (var14_13 | var17_12) ^ 101606546;
                ** GOTO lbl58
                {
                    case 1979777012: {
                        return;
                    }
                }
lbl112:
                // 1 sources

                while (true) {
                    var16_14 = (var14_13 | var17_12) ^ -2045254315;
                    ** continue;
                    break;
                }
                {
                    case -1343861463: {
                        return;
                    }
                    ** case 182682132:
                }
lbl118:
                // 1 sources

                ** while (var13_17 > 0)
lbl119:
                // 1 sources

                ** while (true)
lbl120:
                // 1 sources

                while (true) {
                    var16_14 = (var14_13 | var17_12) ^ -1953357189;
                    ** GOTO lbl58
                    break;
                }
            }
            var13_17 = var6_6 - var4_4;
            ** while (true)
            {
                ** case -1827737295:
            }
lbl127:
            // 1 sources

            var15_15 ^= var16_14 ^ 2003538307;
            ** while (true)
        }
        var16_14 = (var14_13 | var17_12) ^ -1468071935;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block23: {
            block24: {
                var3 = 654947696;
                var2_1 = 790735234;
                hn.e = mK.a(MethodHandles.lookup().lookupClass(), -41858131);
                var1_2 = 0;
                var0_3 = 2128382522;
                var1_2 = var3 ^ -243696438;
                break block24;
lbl8:
                // 2 sources

                while (true) {
                    var0_3 ^= -1138755339;
                    var0_3 ^= -1989553788;
                    var0_3 ^= -2101491507;
                    var0_3 ^= -458097502;
                    var0_3 ^= -1043758841;
                    var0_3 ^= 2014075519;
                    break block23;
                    break;
                }
lbl20:
                // 1 sources

                while (true) {
                    hn.d = hn.MZ(((var0_3 ^= -1280064831) | var3) ^ -550352230, var3 ^ ((var0_3 | var3) ^ -1076582644));
                    hn.c = hn.MZ((var0_3 | var3) ^ -550352231, var3 ^ ((var0_3 | var3) ^ 875939374));
                    hn.b = hn.MZ((var0_3 | var3) ^ -550352232, var3 ^ ((var0_3 | var3) ^ 1592770743));
                    hn.a = hn.MZ((var0_3 | var3) ^ -550352225, var3 ^ ((var0_3 | var3) ^ -1668296477));
                    var1_2 = var3 ^ 939908005;
                    break block24;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    var1_2 = var3 ^ -367591408;
                    break block24;
                    break;
                }
lbl30:
                // 2 sources

                while (true) {
                    v0 = var0_3;
                    var0_3 ^= 2016513323;
                    hn.a[v1] = v2 ^ ((v0 | var3) ^ -1960242612 ^ hn.e);
                    v1 = v1 + 1;
                    v3 = v4 + 4;
                    v5 = v5;
                    v4 = v3;
                    var0_3 ^= 1905936081;
                    if (v3 < v5.length) ** GOTO lbl8
                    ** continue;
                    break;
                }
            }
            block21: while (true) {
                switch (var1_2) {
                    case -697251398: {
                        ** break;
                    }
                    case -720230242: {
                        var0_3 ^= var1_2 ^ -2009565745;
                        var1_2 = var3 ^ var2_1;
                        continue block21;
                    }
                    case -1983325924: {
                        var0_3 ^= var1_2 ^ 1391933347;
                        var1_2 = var3 ^ 985120400;
                        continue block21;
                    }
                    case 498994144: {
                        v1 = 0;
                        v4 = 0;
                        hn.a = new int[((var0_3 ^= -36276636) | var3) ^ 2134751160];
                        var0_3 ^= -1098562312;
                        v5 = "\u0010aNY\nV_,\u009f&YUl\u009e\u0081\u00aa\u00bc\u00cb\u00a3\u00a5\u0095(IN\u0093\u0087\u00e0\u00efi\u000f\u00a9.\u0005\u000e\u00e0\u00c1/\u00b3\u00a5\u0088\u00f6\u00f1\u00e3\u00dfBd\u0007\u0099\u00fdY\u00f9bt\u00ad\u00e6\u0003\"{\"\u00db\u00a2Aj\u0092\u0094\u0093\u00bf\u00b3\u00a8tT\u00a0\u00d3\u00dd\u00f3z\u00fe\u0019YvS\u00eft\u00b6\u0099\u00b7\u0098\u0003\u00f6Ul\u0004\u00d2\u00e6\u00c9=\u00f8{u`\u00a1\u00a5u\u008a6\u00c2\u0092=\u008e\u00c0\u0083\u008cf\u0003\u0018\u00e5\u00dd\u00fa\u00e9\u009c\u0081\u00b6d\u00f5\u0089%\u008c\u00c3o~\u00b1\u001bZmv\u00b0\u00a8LS*\u00eb\u00fd>\u00a5\u00ae\u00daE\u00ebC\u00a7\u00ac.\u00b8x\bs\u00f1\u00dfJa\u00891\u00dc\u00ea=H\u0098q\u00ab<-\u00b6\u00f3\u001c\u00be\u00d5\u00ad\u008aLO\u00c0K\u0003\u00d7\u00928\u00b8TS\u0000\u0083\u009d`\f\u0082\u00f45K6\u00c7e\u0089\u00fb\u00d8sN3\u0091\u00a4_\f\u0001bdc\u00a5\u0001;7\u009d\u00ec\u00e0'\u0011$\u00aa@\u00fav\u00f87}E\u00ad\u00eb)M\u00eb \u00ed/\u00ea\u0011a\u0018t\u00f7K*\u00b6&e\u00ddUt\u00ac\u0000_\u0081\u00ca\u00ee\u00e98|e\bYQ\u000f\u00d2_\u00cf\u00cd\u00b2O\u009a\u00c0#:+r\u0083e\u00dc![L\u0011M\u008d\u001d$".getBytes("ISO-8859-1");
                        ** continue;
                    }
                    case -853625504: {
                        var0_3 ^= var1_2 ^ 2013070065;
                        ** break;
                    }
                    case -960038491: {
                        var0_3 ^= var1_2 ^ -1689467015;
                        var1_2 = var3 ^ -1548841969;
                        continue block21;
                    }
                    case -1931155147: {
                        hn.a = class_2960.method_60655((String)hn.MY(), (String)hn.Na(new int[]{hn.MZ((var0_3 | var1_2 ^ -1410507707) ^ (var1_2 ^ -1825250518), var1_2 ^ -1410507707 ^ ((var0_3 | var1_2 ^ -1410507707) ^ (var1_2 ^ -585626575)))}));
                        var1_2 = var3 ^ -506508075;
                        continue block21;
                    }
lbl74:
                    // 1 sources

                    var1_2 = var3 ^ -1410507707;
                    break;
                    case 136846578: {
                        hn.c = class_2960.method_60655((String)hn.MY(), (String)hn.Na(new int[]{hn.MZ((var0_3 | var1_2 ^ var2_1) ^ (var1_2 ^ 391664738), var1_2 ^ var2_1 ^ ((var0_3 | var1_2 ^ var2_1) ^ (var1_2 ^ -1207120450))), hn.MZ((var0_3 | var1_2 ^ var2_1) ^ (var1_2 ^ 391664749), var1_2 ^ var2_1 ^ ((var0_3 | var1_2 ^ var2_1) ^ (var1_2 ^ -723870587)))}));
                        return;
                    }
                    case -1250062345: {
                        hn.a = true;
                        ** continue;
                    }
lbl82:
                    // 1 sources

                    var1_2 = var3 ^ -1363055508;
                    continue block21;
                    case 520908501: {
                        var0_3 ^= var1_2 ^ 1074538741;
                        var1_2 = var3 ^ -1837876601;
                        break;
                    }
                    case -2069415553: {
                        hn.b = class_2960.method_60655((String)hn.MY(), (String)hn.Na(new int[]{hn.MZ((var0_3 | var1_2 ^ -1548841969) ^ (var1_2 ^ -1007339025), var1_2 ^ -1548841969 ^ ((var0_3 | var1_2 ^ -1548841969) ^ (var1_2 ^ 1064929541)))}));
                        var1_2 = var3 ^ -233071122;
                    }
                }
            }
        }
        v2 = (v5[v4] & 255) << 24 | ((v5[v4 + 1] & 255) << 16 | ((v5[v4 + 2] & 255) << 8 | v5[v4 + 3] & 255));
        block22: while (true) {
            switch (var0_3) {
                case 1499156850: {
                    var0_3 ^= -644809121;
                    ** GOTO lbl30
                }
                default: {
                    var0_3 ^= 2054551030;
                    continue block22;
                }
                case 202346623: 
            }
            break;
        }
        var0_3 ^= -485225060;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static jt Nd(int var0) {
        block33: {
            block30: {
                block31: {
                    block32: {
                        block35: {
                            block29: {
                                block34: {
                                    break block34;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        var2_7 ^= var3_6 ^ 1074172621;
                                        break block29;
                                        break;
                                    }
lbl4:
                                    // 1 sources

                                    return new jt(hn.c, hn.MZ((var2_7 | var3_6 ^ var4_4) ^ (var3_6 ^ 1985069280), (var1_5 | var3_6 ^ var4_4) ^ ((var2_7 | var3_6 ^ var4_4) ^ (var3_6 ^ -712760418))), hn.MZ((var2_7 | var3_6 ^ var4_4) ^ (var3_6 ^ 1985069281), (var1_5 | var3_6 ^ var4_4) ^ ((var2_7 | var3_6 ^ var4_4) ^ (var3_6 ^ -574427205))));
lbl6:
                                    // 1 sources

                                    return new jt(hn.b, hn.MZ((var2_7 | var3_6 ^ var5_3) ^ (var3_6 ^ 1542655925), (var1_5 | var3_6 ^ var5_3) ^ ((var2_7 | var3_6 ^ var5_3) ^ (var3_6 ^ -1509953303))), hn.MZ((var2_7 | var3_6 ^ var5_3) ^ (var3_6 ^ 1542655926), (var1_5 | var3_6 ^ var5_3) ^ ((var2_7 | var3_6 ^ var5_3) ^ (var3_6 ^ -1757600188))));
                                }
                                var7_1 = -656507417;
                                var6_2 = 125202368;
                                var5_3 = -1958518648;
                                var4_4 = 1047113704;
                                var1_5 = hn.e & 125202368 ^ 1215824473;
                                var3_6 = 0;
                                break block35;
                                while (true) {
                                    var3_6 = (var1_5 | var6_2) ^ -1795527903;
                                    break block30;
lbl19:
                                    // 1 sources

                                    while (true) {
                                        var2_7 ^= var3_6 ^ 1674392945;
                                        break block31;
                                        break;
                                    }
                                    break;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    var3_6 = (var1_5 | var6_2) ^ -255269696;
                                    break block30;
lbl25:
                                    // 1 sources

                                    while (true) {
                                        var3_6 = (var1_5 | var6_2) ^ 884926194;
                                        break block30;
                                        break;
                                    }
lbl28:
                                    // 1 sources

                                    return new jt(hn.a, hn.MZ((var2_7 | var3_6 ^ var7_1) ^ (var3_6 ^ -790195478), (var1_5 | var3_6 ^ var7_1) ^ ((var2_7 | var3_6 ^ var7_1) ^ (var3_6 ^ -338957903))), hn.MZ((var2_7 | var3_6 ^ var7_1) ^ (var3_6 ^ -790195563), (var1_5 | var3_6 ^ var7_1) ^ ((var2_7 | var3_6 ^ var7_1) ^ (var3_6 ^ 918625336))));
lbl30:
                                    // 1 sources

                                    while (true) {
                                        if (var0 < hn.MZ((var2_7 | var3_6 ^ 4216104) ^ (var3_6 ^ -1594775028), (var1_5 | var3_6 ^ 4216104) ^ ((var2_7 | var3_6 ^ 4216104) ^ (var3_6 ^ 812749362)))) break block32;
                                        break block33;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var3_6 = (var1_5 | var6_2) ^ 1212699953;
                            break block30;
lbl36:
                            // 1 sources

                            while (true) {
                                var3_6 = (var1_5 | var6_2) ^ 1321169800;
                                break block30;
                                break;
                            }
lbl39:
                            // 1 sources

                            while (true) {
                                var2_7 ^= var3_6 ^ 2031997829;
                                ** continue;
                                break;
                            }
lbl42:
                            // 1 sources

                            while (true) {
                                var3_6 = (var1_5 | var6_2) ^ 1986113521;
                                break block30;
                                break;
                            }
lbl45:
                            // 1 sources

                            while (true) {
                                var3_6 = (var1_5 | var6_2) ^ -1864991234;
                                break block30;
                                break;
                            }
                        }
                        var2_7 = (var1_5 | var6_2) ^ 2085901697;
                        var3_6 = (var1_5 | var6_2) ^ -1789896020;
                        break block30;
lbl52:
                        // 1 sources

                        while (true) {
                            var2_7 ^= var3_6 ^ -1473716149;
                            ** continue;
                            break;
                        }
                    }
                    var3_6 = (var1_5 | var6_2) ^ -1686512023;
                    break block30;
lbl58:
                    // 1 sources

                    while (true) {
                        var2_7 ^= var3_6 ^ -669968734;
                        ** continue;
                        break;
                    }
                }
                var3_6 = (var1_5 | var6_2) ^ -1018470255;
            }
lbl64:
            // 2 sources

            block28: while (true) {
                switch (var3_6) {
                    default: {
                        continue block28;
                    }
                    case -634505867: {
                        ** continue;
                    }
                    case 2076215595: {
                        ** continue;
                    }
                    case 958382120: {
                        ** continue;
                    }
                    case -1942679736: {
                        ** continue;
                    }
                    case -1078555879: {
                        ** continue;
                    }
                    case -542633433: {
                        ** continue;
                    }
                    case 120994536: {
                        ** continue;
                    }
                    case -737693264: {
                        ** continue;
                    }
                    case 1140029604: {
                        ** continue;
                    }
                    case -612104968: {
                        ** continue;
                    }
                    case 0x1C11C51: 
                }
                if (var0 < hn.MZ((var2_7 | var3_6 ^ 112685969) ^ (var3_6 ^ 235834501), (var1_5 | var3_6 ^ 112685969) ^ ((var2_7 | var3_6 ^ 112685969) ^ (var3_6 ^ -946040149)))) ** continue;
                ** continue;
                break;
            }
        }
        var3_6 = (var1_5 | var6_2) ^ 210573181;
        ** while (true)
    }
}

