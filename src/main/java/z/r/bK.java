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
import z.r.lL;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class bK {
    private static final int[] a;
    public static final int a;
    private static final long a;

    /*
     * Enabled aggressive block sorting
     */
    private bK() {
        int n2 = a & 0xEE70758B ^ 0x78C70BC7;
        int n3 = (n2 | 0xEE70758B) ^ 0xE6B15689;
        n3 ^= 0x39F2BD91;
        n3 ^= 0x938907A8;
    }

    /*
     * Unable to fully structure code
     */
    static short[] legoPlace() {
        block11: {
            block10: {
                block9: {
                    var2 = bK.a & 589747113 ^ -522679812;
                    var4_1 = 0;
                    var3_2 = (var2 | 589747113) ^ -973213117;
                    ** GOTO lbl13
lbl5:
                    // 1 sources

                    block5: while (true) {
                        switch (var4_1) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                default: {
                                    continue block5;
                                }
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var4_1 = (var2 | 589747113) ^ -1801681780;
                                ** GOTO lbl-1000
                                break;
                            }
lbl13:
                            // 1 sources

                            var4_1 = (var2 | 589747113) ^ 1288110397;
                            ** continue;
lbl15:
                            // 1 sources

                            while (true) {
                                var1_4 = bK.si(0.1, 0.72, 0.0016, 6000.0, new double[][]{{2350.0, 0.013, 1.0}, {3550.0, 0.008, 0.6}, {5100.0, 0.005, 0.4}, {830.0, 0.03, 0.55}, {450.0, 0.05, 0.32}});
                                var3_2 ^= 530576783;
                                break block9;
                                break;
                            }
                            case -1355162944: {
                                break block10;
                            }
                            case 2002935665: {
                                var0_3 = bK.si(0.05, 0.28, 0.0012, 7000.0, new double[][]{{3000.0, 0.008, 1.0}, {4600.0, 0.005, 0.6}});
                                break block11;
                            }
                            case -1962222312: {
                                var3_2 ^= var4_1 ^ 622275780;
                                break block5;
                            }
                        }
                        break;
                    }
                    ** while (true)
                }
                return lL.mix(new short[][]{var0_3, lL.concat(new short[][]{lL.silence(0.02), var1_4})});
            }
            var4_1 = (var2 | 589747113) ^ 1760823013;
            ** while (true)
        }
        var3_2 ^= 1457724244;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static short[] cleanBreak() {
        var4 = 2040375609;
        var1_1 = bK.a & 2040375609 ^ -1264831037;
        var3_2 = 0;
        var2_4 = (var1_1 | var4) ^ 596932479;
        var3_2 = (var1_1 | var4) ^ 1798459586;
        block18: while (true) {
            block21: {
                switch (var3_2) {
                    default: {
                        continue block18;
                    }
                    case -1766855367: {
                        break;
                    }
                    case 1827487549: {
                        var2_4 ^= var3_2 ^ -968541992;
                        break block21;
                    }
                    case -711729936: {
                        ** break;
lbl17:
                        // 1 sources

                        var0_3 = bK.si(0.04, 0.24, 0.0012, 5200.0, new double[][]{{1900.0, 0.007, 1.0}, {3200.0, 0.005, 0.5}});
                        var3_2 = (var1_1 | var4) ^ -146028772;
                        if (true) ** GOTO lbl27
                    }
                }
                var3_2 = (var1_1 | var4) ^ -1854897466;
                continue;
            }
            var3_2 = (var1_1 | var4) ^ 672030987;
        }
        block19: while (true) {
            var3_2 = (var1_1 | var4) ^ -2087163418;
lbl27:
            // 2 sources

            block20: while (true) {
                switch (var3_2) {
                    case 1822194973: {
                        var2_4 ^= var3_2 ^ 1418987598;
                        ** break;
                    }
                    case 1139078314: {
                        var2_4 ^= var3_2 ^ 1026278214;
                        ** break;
                    }
                    case -1427583668: {
                        var2_4 ^= var3_2 ^ 2027244347;
                        continue block19;
                    }
                    case -1070205216: {
                        var3_2 = (var1_1 | var4) ^ 465012567;
                        continue block20;
                    }
                    case 181828327: {
                        continue block19;
                    }
lbl43:
                    // 2 sources

                    var3_2 = (var1_1 | var4) ^ 1034439451;
                    default: {
                        continue block20;
                    }
                    case 2114311197: {
                        switch (var2_4) {
                            case 1956760929: {
                                var3_2 = (var1_1 | var4) ^ -1862156058;
                                continue block20;
                            }
                            default: {
                                var3_2 = (var1_1 | var4) ^ 1467314359;
                                continue block20;
                            }
                            case 1512488274: 
                        }
                        var3_2 = (var1_1 | var4) ^ -1099347631;
                        continue block20;
                    }
                    case -433440084: 
                }
                break;
            }
            break;
        }
        return lL.mix(new short[][]{bK.sj(760.0, 340.0, 0.085, 0.7), var0_3});
    }

    /*
     * Unable to fully structure code
     */
    static short[] legoStep() {
        block9: {
            block10: {
                break block10;
lbl1:
                // 1 sources

                return bK.si(0.05, 0.4, 0.001, 4800.0, new double[][]{{1450.0, 0.009, 1.0}, {2500.0, 0.006, 0.55}, {3800.0, 0.004, 0.3}, {680.0, 0.014, 0.45}});
lbl3:
                // 1 sources

                while (true) {
                    var2_1 = (var0 | -106640383) ^ 62588461;
                    if (true) ** GOTO lbl8
                    block7: while (true) {
                        var2_1 = (var0 | -106640383) ^ -414605432;
lbl8:
                        // 3 sources

                        block8: while (true) {
                            switch (var2_1) {
                                default: {
                                    continue block8;
                                }
                                case 452346757: {
                                    ** continue;
                                }
                                case -33236448: {
                                    break block9;
                                }
                                case -367904555: {
                                    var1_2 ^= var2_1 ^ -2090837471;
                                    break;
                                }
                            }
                            continue block7;
                            break;
                        }
                        break;
                    }
                    break;
                }
            }
            var0 = bK.a & -106640383 ^ -1782606835;
            var2_1 = 0;
            var1_2 = (var0 | -106640383) ^ 1743633321;
            ** while (true)
        }
        var2_1 = (var0 | -106640383) ^ 397272280;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static short[] miningTick() {
        var0 = bK.a & -1744549321 ^ 1188221368;
        var2_1 = 0;
        var1_2 = (var0 | -1744549321) ^ -673836043;
        var2_1 = (var0 | -1744549321) ^ 308483607;
        if (true) ** GOTO lbl-1000
        block5: while (true) {
            var2_1 = (var0 | -1744549321) ^ -1313569514;
            block6: while (true) {
                switch (var2_1) lbl-1000:
                // 2 sources

                {
                    default: {
                        continue block6;
                    }
                    case -860500568: {
                        var2_1 = (var0 | -1744549321) ^ -1799147098;
                        continue block6;
                    }
                    case 1242950169: {
                        var1_2 ^= var2_1 ^ -1864061520;
                        continue block5;
                    }
                    case 1868717737: 
                }
                break;
            }
            break;
        }
        return bK.si(0.035, 0.3, 8.0E-4, 4200.0, new double[][]{{1700.0, 0.006, 1.0}, {2900.0, 0.004, 0.45}, {900.0, 0.009, 0.4}});
    }

    /*
     * Unable to fully structure code
     */
    static short[] containerOpen() {
        var2 = bK.a & -872677674 ^ 461782852;
        var4_1 = 0;
        if (true) ** GOTO lbl23
        block5: while (true) {
            switch (var4_1) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
lbl9:
                // 1 sources

                return lL.mix(new short[][]{var0_3, lL.concat(new short[][]{lL.silence(0.055), var1_4})});
lbl11:
                // 1 sources

                while (true) {
                    var4_1 = (var2 | -872677674) ^ -1280641898;
                    ** GOTO lbl-1000
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var3_2 ^= -369718915;
                    ** GOTO lbl28
lbl17:
                    // 1 sources

                    while (true) {
                        var3_2 ^= 540743752;
                        ** continue;
                        break;
                    }
                    break;
                }
lbl20:
                // 1 sources

                while (true) {
                    var4_1 = (var2 | -872677674) ^ -131214583;
                    ** GOTO lbl-1000
                    break;
                }
lbl23:
                // 1 sources

                var3_2 = (var2 | -872677674) ^ -1524054694;
                var4_1 = (var2 | -872677674) ^ -1540400438;
                ** continue;
                case 2144380188: {
                    ** continue;
                }
lbl28:
                // 1 sources

                var1_4 = bK.si(0.05, 0.34, 0.0012, 5000.0, new double[][]{{1250.0, 0.01, 1.0}, {2400.0, 0.006, 0.5}, {620.0, 0.018, 0.6}});
                ** continue;
                case 1750403904: {
                    var3_2 ^= var4_1 ^ 689432972;
                    ** continue;
                }
                case 600976607: 
            }
            break;
        }
        var0_3 = lL.noiseSweep(0.1, 0.05, 500.0, 3400.0);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    static short[] containerClose() {
        int n2 = a & 0xA1C2E085 ^ 0xBC9A4E7;
        int n3 = 0;
        int n4 = (n2 | 0xA1C2E085) ^ 0x1E12A650;
        n3 = (n2 | 0xA1C2E085) ^ 0xA0E9681D;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 186813690: {
                    n3 = (n2 | 0xA1C2E085) ^ 0x842DF46;
                    continue block5;
                }
                case -1099192718: {
                    short[] sArray = lL.noiseSweep(0.09, 0.045, 3200.0, 520.0);
                    n4 ^= 0x9A5473A7;
                    short[] sArray2 = bK.si(0.06, 0.42, 0.0014, 4600.0, new double[][]{{1050.0, 0.012, 1.0}, {1900.0, 0.007, 0.55}, {520.0, 0.024, 0.7}});
                    n4 ^= 0xA418E5BC;
                    return lL.mix(sArray, lL.concat(lL.silence(0.06), sArray2));
                }
                case -1551287391: 
            }
            n4 ^= n3 ^ 0xB17F4536;
            n3 = (n2 | 0xA1C2E085) ^ 0x15B04295;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static short[] pickup() {
        int n2 = a & 0x2F6269F3 ^ 0x7BEA8EBB;
        int n3 = 0;
        int n4 = (n2 | 0x2F6269F3) ^ 0xA44E0720;
        n3 = (n2 | 0x2F6269F3) ^ 0x41F9790;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 2079684715: {
                    break;
                }
                case 1107544978: {
                    n4 ^= n3 ^ 0x36E85AD0;
                    n3 = (n2 | 0x2F6269F3) ^ 0xC094445F;
                    continue block5;
                }
                case -1082217564: {
                    return bK.sj(880.0, 1320.0, 0.055, 0.55);
                }
            }
            n3 = (n2 | 0x2F6269F3) ^ 0x3DE92469;
        }
    }

    private static int sh(int n2, int n3) {
        int n4 = -1589256780;
        int n5 = -355629086;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xD21D88F1)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xEBCDF731;
        n6 -= (n5 | n4) ^ 0xEBCD42D9;
        n6 += (n5 | n4) ^ 0xEBCDD6D9;
        n6 -= (n5 | n4) ^ 0xEBCD84DA;
        n6 ^= (n5 | n4) ^ 0xEBCD3D13;
        return n6 += (n5 | n4) ^ 0xEBCDF1C8;
    }

    /*
     * Unable to fully structure code
     */
    static short[] xpChime() {
        block8: {
            block9: {
                break block9;
                {
                    var2_1 = (var0 | 1229979046) ^ -1498838897;
lbl2:
                    // 3 sources

                    block6: while (true) {
                        switch (var2_1) {
                            default: {
                                continue block6;
                            }
                            case -1907183866: {
                                break block8;
                            }
                            case 2045146473: {
                                return bK.si(0.16, 0.4, 8.0E-4, 9000.0, new double[][]{{2500.0, 0.1, 1.0}, {4150.0, 0.06, 0.4}, {6300.0, 0.045, 0.22}});
                            }
                            case -1321827680: {
                                var1_2 ^= var2_1 ^ -1320158329;
                                break;
                            }
                        }
                        continue block5;
                        break;
                    }
                }
lbl14:
                // 1 sources

                while (true) {
                    var2_1 = (var0 | 1229979046) ^ 1360876256;
                    ** GOTO lbl2
                    break;
                }
            }
            var0 = bK.a & 1229979046 ^ -687689660;
            var2_1 = 0;
            var1_2 = (var0 | 1229979046) ^ -919635237;
            ** while (true)
        }
        var2_1 = (var0 | 1229979046) ^ 1853456198;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    static short[] hurtThump() {
        block13: {
            block12: {
                block11: {
                    block14: {
                        block10: {
                            break block14;
lbl1:
                            // 1 sources

                            while (true) {
                                var2_3 ^= -426938588;
                                break block10;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var3_1 = (var1 | -790866233) ^ -20552488;
                                break block11;
                                break;
                            }
                        }
                        return lL.mix(new short[][]{bK.sj(210.0, 120.0, 0.1, 0.65), var0_2});
lbl9:
                        // 1 sources

                        while (true) {
                            var0_2 = bK.si(0.05, 0.32, 0.003, 900.0, new double[][]{{180.0, 0.05, 1.0}, {320.0, 0.03, 0.6}});
                            ** continue;
                            break;
                        }
                    }
                    var1 = bK.a & -790866233 ^ 44131510;
                    var3_1 = 0;
                    var2_3 = (var1 | -790866233) ^ 1206731175;
                    ** while (true)
lbl17:
                    // 1 sources

                    while (true) {
                        var2_3 ^= var3_1 ^ -245295070;
                        break block12;
                        break;
                    }
                }
lbl21:
                // 3 sources

                block9: while (true) {
                    switch (var3_1) {
                        default: {
                            continue block9;
                        }
                        case 742068783: {
                            break block13;
                        }
                        case 1352998736: {
                            ** continue;
                        }
                        case 817172081: {
                            break;
                        }
                    }
                    ** continue;
                    break;
                }
            }
            var3_1 = (var1 | -790866233) ^ -2108135001;
            ** GOTO lbl21
        }
        var3_1 = (var1 | -790866233) ^ -498567034;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    static short[] levelUp() {
        int n2 = a & 0x5377DC09 ^ 0x36A41F37;
        int n3 = 0;
        int n4 = (n2 | 0x5377DC09) ^ 0x8FFABFE9;
        n3 = (n2 | 0x5377DC09) ^ 0x252F4ED5;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 2032079486: {
                    short[] sArray = bK.si(0.12, 0.42, 8.0E-4, 8000.0, new double[][]{{1047.0, 0.1, 1.0}, {2093.0, 0.06, 0.3}});
                    n4 ^= 0x6DCBD3A1;
                    short[] sArray2 = bK.si(0.4, 0.52, 8.0E-4, 8000.0, new double[][]{{1568.0, 0.22, 1.0}, {3136.0, 0.1, 0.28}, {2093.0, 0.16, 0.22}});
                    n4 ^= 0xA1FF052C;
                    return lL.concat(sArray, sArray2);
                }
                case 1389924842: {
                    n3 = (n2 | 0x5377DC09) ^ 0x8C0036F3;
                    continue block5;
                }
                case -67638836: 
            }
            n4 ^= n3 ^ 0xFB9749CC;
            n3 = (n2 | 0x5377DC09) ^ 0xEE8CD41;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var8 = -1881103873;
        bK.a = mK.a(MethodHandles.lookup().lookupClass(), 1835792303);
        var7_1 = 0;
        var6_2 = 916673451;
        var7_1 = var8 ^ -1776978364;
        if (true) ** GOTO lbl33
        block19: while (true) {
            switch (var7_1) {
                case 543952752: {
                    var6_2 ^= var7_1 ^ -1834114874;
                    ** break;
                }
                case 1549216583: {
                    var3_6 += 4;
                    if (++var4_7 < var1_4) ** GOTO lbl74
                    ** GOTO lbl31
                }
                case -188799330: {
                    var6_2 ^= var7_1 ^ 1396234293;
                    var7_1 = var8 ^ -1829522917;
                    ** break;
                }
                case 487789540: {
                    bK.a[var4_7] = var5_8 ^= var2_5;
                    var7_1 = var8 ^ 587375053;
                    ** break;
                }
lbl24:
                // 1 sources

                var7_1 = var8 ^ 1334535313;
                continue block19;
                case -1394474958: {
                    var6_2 ^= var7_1 ^ -2137645812;
                    var7_1 = var8 ^ -742946120;
                }
lbl29:
                // 4 sources

                default: {
                    continue block19;
                }
lbl31:
                // 1 sources

                var7_1 = var8 ^ -1349734769;
                continue block19;
lbl33:
                // 1 sources

                block20: while (true) {
                    switch (var7_1) {
                        default: {
                            continue block20;
                        }
                        case 435541947: {
                            ** break;
                        }
                        case -1972738223: {
                            var2_5 = (var6_2 | var7_1 ^ 92980910) ^ (var7_1 ^ -1398903861) ^ bK.a;
                            var6_2 ^= 902333525;
                            ** GOTO lbl45
                        }
lbl43:
                        // 1 sources

                        var7_1 = var8 ^ 48871415;
                        continue block20;
lbl45:
                        // 1 sources

                        var0_3 = "!?\u00f7\u0019".getBytes("ISO-8859-1");
                        var6_2 ^= -50797511;
                        var1_4 = var0_3.length / 4;
                        break block20;
                        case -1928784376: 
                    }
                    var6_2 ^= var7_1 ^ 1562365532;
                    var7_1 = var8 ^ 92980910;
                }
                var7_1 = var8 ^ 1610335289;
                block21: while (true) {
                    switch (var7_1) {
                        default: {
                            continue block21;
                        }
                        case 633990708: {
                            var3_6 = 0;
                            var6_2 ^= 1302333068;
                            var4_7 = 0;
                            break;
                        }
                        case -803510842: {
                            var6_2 ^= var7_1 ^ 953603338;
                            ** GOTO lbl77
                        }
                        case 1101067666: {
                            bK.a = new int[var1_4];
                            var7_1 = var8 ^ -477898111;
                            continue block21;
                        }
                        case 1818459006: {
                            var6_2 ^= var7_1 ^ -1451090626;
                            var7_1 = var8 ^ -1440133173;
                            continue block21;
                        }
                    }
lbl74:
                    // 2 sources

                    var5_8 = (var0_3[var3_6] & (((var6_2 ^= -1946950763) | var8) ^ -805635840)) << ((var6_2 | var8) ^ -805635609) | (var0_3[var3_6 + 1] & ((var6_2 | var8) ^ -805635840)) << ((var6_2 | var8) ^ -805635601) | (var0_3[var3_6 + 2] & ((var6_2 | var8) ^ -805635840)) << ((var6_2 | var8) ^ -805635593) | var0_3[var3_6 + 3] & ((var6_2 | var8) ^ -805635840);
                    var7_1 = var8 ^ 2069858145;
                    continue block19;
lbl77:
                    // 1 sources

                    var7_1 = var8 ^ -834644883;
                }
                case -1066678930: 
            }
            break;
        }
        bK.a = -159714803005679489L << (var7_1 ^ -1066678962) >>> (var7_1 ^ -1066678962) ^ (long)var6_2 & 0xFFFFFFFFL | (-159714803005679489L >>> (var7_1 ^ -1066678962) ^ (long)var6_2 & 0xFFFFFFFFL) << (var7_1 ^ -1066678962);
    }

    /*
     * Exception decompiling
     */
    private static short[] si(double var0, double var2_2, double var4_3, double var6_4, double[][] var8_1) {
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
    private static short[] sj(double var0, double var2_1, double var4_2, double var6_3) {
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
    private static short[] sk(double[] var0, double var1_1) {
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
}

