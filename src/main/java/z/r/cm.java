/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class cm {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), 273291560);

    /*
     * Exception decompiling
     */
    private cm() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
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
     * Unable to fully structure code
     */
    public static float wrapAngleTo180(float var0) {
        block28: {
            var4_1 = -1803772234;
            var1_2 = cm.a & -1803772234 ^ 1775012917;
            var3_3 = 0;
            ** GOTO lbl72
lbl5:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 57982002;
                ** GOTO lbl33
lbl8:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -837886908;
                    ** GOTO lbl63
                    break;
                }
lbl11:
                // 1 sources

                while (var0 < -180.0f) {
                    ** GOTO lbl74
                }
                ** GOTO lbl68
lbl14:
                // 2 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -248222961;
                    ** GOTO lbl33
lbl17:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -174818181;
                        var3_3 = (var1_2 | var4_1) ^ -1912130168;
                        ** GOTO lbl33
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -1599924554;
                        if (true) ** GOTO lbl70
                        break;
                    }
                    break;
                }
                break;
            }
            block21: while (true) {
                var3_3 = (var1_2 | var4_1) ^ -465392625;
                if (true) ** GOTO lbl33
                block22: while (true) {
                    block29: {
                        var3_3 = (var1_2 | var4_1) ^ -2012376738;
                        break block29;
lbl30:
                        // 1 sources

                        while (true) {
                            var0 += 360.0f;
                            ** GOTO lbl68
                            break;
                        }
                    }
lbl34:
                    // 3 sources

                    block24: while (true) {
                        switch (var3_3) lbl-1000:
                        // 7 sources

                        {
                            while (true) {
                                default: {
                                    continue block24;
                                }
                                break;
                            }
                            case 1978732521: {
                                ** continue;
                            }
                            case 1945873215: {
                                ** GOTO lbl11
                            }
                            case 214496696: {
                                ** continue;
                            }
                            case 237447969: {
                                ** continue;
                            }
                            case 431895224: {
                                ** continue;
                            }
                            case 2014261740: {
                                return var0;
                            }
lbl51:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -203704938;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -1976595016: {
                                break block28;
                            }
                            case -1142675285: {
                                var0 -= 360.0f;
                                ** GOTO lbl14
                            }
                            case 1902653590: {
                                if (var0 >= 180.0f) ** break;
                                ** continue;
                                break block21;
                            }
lbl63:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -1936413151;
                            ** GOTO lbl-1000
                            case -306041313: {
                                var0 %= 360.0f;
                                continue block22;
                            }
lbl68:
                            // 2 sources

                            var3_3 = (var1_2 | var4_1) ^ -1105695078;
                            ** GOTO lbl-1000
lbl70:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ 272543912;
                            ** GOTO lbl-1000
lbl72:
                            // 1 sources

                            var2_4 = (var1_2 | var4_1) ^ 1822195091;
                            ** continue;
lbl74:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -1933360295;
                            ** GOTO lbl-1000
lbl76:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -2047627429;
                                ** continue;
                                break;
                            }
                            case 1900010990: {
                                continue block21;
                            }
                            case 1139077165: {
                                var2_4 ^= var3_3 ^ -906807563;
                                ** continue;
                            }
                            case -24632699: {
                                ** continue;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            var3_3 = (var1_2 | var4_1) ^ 2010321679;
            ** GOTO lbl34
        }
        var3_3 = (var1_2 | var4_1) ^ 1176024604;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static double wrapAngleTo180(double var0) {
        var5_1 = 2039449997;
        var2_2 = cm.a & 2039449997 ^ 1109264490;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ -1763534032;
        var4_3 = (var2_2 | var5_1) ^ -1078850629;
        if (true) ** GOTO lbl9
        block15: while (true) {
            var4_3 = (var2_2 | var5_1) ^ -1797800144;
lbl9:
            // 2 sources

            block16: while (true) {
                switch (var4_3) {
                    case 311673267: {
                        var3_4 ^= var4_3 ^ 52312414;
                        var4_3 = (var2_2 | var5_1) ^ 2113294277;
                        continue block16;
                    }
                    case 1603844662: {
                        return var0;
                    }
                    case 969025734: {
                        var3_4 ^= var4_3 ^ 148987907;
                        ** break;
                    }
                    case -1266061620: {
                        ** GOTO lbl58
                    }
                    case 1692712383: {
                        var3_4 ^= var4_3 ^ -2013466623;
                        ** break;
                    }
                    case 107595306: {
                        var0 %= 360.0;
                        ** GOTO lbl45
                    }
                    case -1003650476: {
                        ** GOTO lbl34
                    }
lbl30:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -785462535;
                    continue block16;
lbl32:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1487480678;
                    continue block16;
lbl34:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 1762412636;
                    continue block16;
                    case 1286803463: {
                        var0 -= 360.0;
                        ** GOTO lbl49
                    }
                    case 1956955219: {
                        var4_3 = (var2_2 | var5_1) ^ 925669864;
                        ** GOTO lbl50
                    }
                    case -280480033: {
                        var3_4 ^= var4_3 ^ 725469817;
                        ** GOTO lbl60
                    }
lbl45:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 528168016;
                    continue block16;
                    case -590786187: {
                        if (var0 >= 180.0) ** GOTO lbl56
lbl49:
                        // 2 sources

                        var4_3 = (var2_2 | var5_1) ^ 1113432361;
                    }
lbl50:
                    // 3 sources

                    default: {
                        continue block16;
                    }
                    {
                    }
                    case 861834580: {
                        var0 += 360.0;
                        continue block15;
                    }
lbl56:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 255544764;
                    continue block16;
lbl58:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 1220609211;
                    continue block16;
lbl60:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 604451801;
                    continue block16;
                    case -1431223530: 
                }
                if (var0 < -180.0) ** break;
                continue block15;
                var4_3 = (var2_2 | var5_1) ^ -820582621;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static float clamp(float var0, float var1_1, float var2_2) {
        block25: {
            block22: {
                block23: {
                    block24: {
                        break block24;
lbl1:
                        // 1 sources

                        return v0;
                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 885775965;
                            break block22;
lbl6:
                            // 1 sources

                            while (true) {
                                v0 = Math.min(var0, var2_2);
                                break block23;
                                break;
                            }
                            break;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 1298369358;
                            break block22;
lbl12:
                            // 1 sources

                            while (true) {
                                var5_5 = (var3_4 | var6_3) ^ -231167470;
                                break block22;
                                break;
                            }
lbl15:
                            // 1 sources

                            while (true) {
                                var4_6 ^= var5_5 ^ -2133127337;
                                ** continue;
                                break;
                            }
lbl18:
                            // 1 sources

                            while (true) {
                                var5_5 = (var3_4 | var6_3) ^ -909773652;
                                break block22;
                                break;
                            }
lbl21:
                            // 1 sources

                            while (true) {
                                var5_5 = (var3_4 | var6_3) ^ -1298355773;
                                break block22;
                                break;
                            }
lbl24:
                            // 1 sources

                            while (true) {
                                var5_5 = (var3_4 | var6_3) ^ -1867367944;
                                break block22;
                                break;
                            }
lbl27:
                            // 1 sources

                            while (true) {
                                v0 = var1_1;
                                break block23;
                                break;
                            }
lbl30:
                            // 1 sources

                            while (true) {
                                var4_6 ^= var5_5 ^ -1852541262;
                                ** continue;
                                break;
                            }
                            break;
                        }
                    }
                    var6_3 = -340655410;
                    var3_4 = cm.a & -340655410 ^ 452171882;
                    var5_5 = 0;
                    break block25;
lbl38:
                    // 1 sources

                    while (true) {
                        var4_6 ^= var5_5 ^ -109880764;
                        ** continue;
                        break;
                    }
                }
                var4_6 ^= 64476667;
                ** while (true)
            }
lbl45:
            // 2 sources

            block21: while (true) {
                switch (var5_5) {
                    default: {
                        continue block21;
                    }
                    case 164311292: {
                        ** continue;
                    }
                    case -818395981: {
                        ** continue;
                    }
                    case 184573694: {
                        ** continue;
                    }
                    case 1232024365: {
                        ** continue;
                    }
                    case 842427970: {
                        ** continue;
                    }
                    case -1232072288: {
                        ** continue;
                    }
                    case 1799463702: 
                }
                if (!(var0 < var1_1)) ** continue;
                ** continue;
                break;
            }
        }
        var4_6 = (var3_4 | var6_3) ^ -1452991726;
        var5_5 = (var3_4 | var6_3) ^ -252460016;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static double clamp(double var0, double var2_2, double var4_1) {
        block18: {
            block17: {
                block14: {
                    block16: {
                        block15: {
                            block13: {
                                var9_3 = -18303548;
                                var6_4 = cm.a & -18303548 ^ 1093735248;
                                var8_5 = 0;
                                ** GOTO lbl26
lbl5:
                                // 2 sources

                                while (true) {
                                    var7_6 ^= 2139580455;
                                    break block13;
                                    break;
                                }
lbl8:
                                // 5 sources

                                block10: while (true) {
                                    switch (var8_5) lbl-1000:
                                    // 3 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block10;
                                            }
                                            break;
                                        }
                                        case 401943079: {
                                            v0 = Math.min(var0, var4_1);
                                            ** GOTO lbl5
                                        }
                                        case 103862104: {
                                            v0 = var2_2;
                                            ** continue;
                                        }
                                        case 122016446: {
                                            if (var0 < var2_2) break block14;
                                            var8_5 = (var6_4 | var9_3) ^ -1160682856;
                                            ** GOTO lbl-1000
                                        }
                                        case -99654836: {
                                            var7_6 ^= var8_5 ^ -823272413;
                                            break block15;
                                        }
lbl26:
                                        // 1 sources

                                        var7_6 = (var6_4 | var9_3) ^ 1304544508;
                                        break block16;
lbl28:
                                        // 1 sources

                                        while (true) {
                                            var8_5 = (var6_4 | var9_3) ^ -401826317;
                                            ** continue;
                                            break;
                                        }
                                        case 1160303948: {
                                            var7_6 ^= var8_5 ^ -588103594;
                                            ** continue;
                                        }
                                        case -1040197141: {
                                            var7_6 ^= var8_5 ^ 1478839537;
                                            break block17;
                                        }
                                        case -665041825: {
                                            break block10;
                                        }
                                    }
                                    break;
                                }
                                break block18;
                            }
                            return v0;
                        }
                        var8_5 = (var6_4 | var9_3) ^ -121870998;
                        ** GOTO lbl8
                    }
                    var8_5 = (var6_4 | var9_3) ^ 665187211;
                    ** GOTO lbl8
                }
                var8_5 = (var6_4 | var9_3) ^ 1040608831;
                ** GOTO lbl8
            }
            var8_5 = (var6_4 | var9_3) ^ -104236916;
            ** GOTO lbl8
        }
        var8_5 = (var6_4 | var9_3) ^ 100062360;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double sqrt(double d2) {
        int n2 = a & 0x140D4031 ^ 0xCBF34A0A;
        int n3 = 0;
        int n4 = (n2 | 0x140D4031) ^ 0xAB2DE47B;
        n3 = (n2 | 0x140D4031) ^ 0x9F084D31;
        while (true) {
            switch (n3) {
                case -1094470331: {
                    n4 ^= n3 ^ 0x37F7A3ED;
                    n3 = (n2 | 0x140D4031) ^ 0xE095CB45;
                    break;
                }
                case 1063944574: {
                    return Math.sqrt(d2);
                }
                case 1089931018: {
                    n3 = (n2 | 0x140D4031) ^ 0x613CFF7E;
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public static double randomRange(Random var0, double var1_1, double var3_2) {
        var5_3 = cm.a & 1870846438 ^ -1224533035;
        var7_4 = 0;
        ** GOTO lbl12
lbl4:
        // 1 sources

        block5: while (true) {
            switch (var7_4) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
                ** case 1284431508:
lbl10:
                // 1 sources

                var7_4 = (var5_3 | 1870846438) ^ 1289805122;
                ** GOTO lbl-1000
lbl12:
                // 1 sources

                var6_5 = (var5_3 | 1870846438) ^ -1473270306;
                break block5;
lbl14:
                // 1 sources

                while (true) {
                    var7_4 = (var5_3 | 1870846438) ^ 442017038;
                    ** continue;
                    break;
                }
                case -1285355851: {
                    var6_5 ^= var7_4 ^ 1536601579;
                    ** continue;
                }
                case -438599943: {
                    return var1_1 + (var3_2 - var1_1) * var0.nextDouble();
                }
            }
            break;
        }
        var7_4 = (var5_3 | 1870846438) ^ -1290992285;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static int randomExclusiveUpper(Random var0, int var1_1, int var2_2) {
        block15: {
            block14: {
                block16: {
                    var6_3 = 141224047;
                    var3_4 = cm.a & 141224047 ^ -2030824447;
                    var5_5 = 0;
                    ** GOTO lbl29
                    block9: while (var2_2 <= var1_1) {
                        ** GOTO lbl19
lbl7:
                        // 1 sources

                        while (true) {
                            var4_6 ^= var5_5 ^ 756765183;
                            ** GOTO lbl27
                            break;
                        }
lbl10:
                        // 4 sources

                        block11: while (true) {
                            switch (var5_5) lbl-1000:
                            // 4 sources

                            {
                                while (true) {
                                    default: {
                                        continue block11;
                                    }
                                    break;
                                }
                                case 354730343: {
                                    continue block9;
                                }
                                case 1434171764: {
                                    ** continue;
                                }
lbl19:
                                // 1 sources

                                var5_5 = (var3_4 | var6_3) ^ 774809615;
                                ** GOTO lbl-1000
lbl21:
                                // 1 sources

                                while (true) {
                                    var5_5 = (var3_4 | var6_3) ^ -2007507630;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case 111747389: {
                                    var4_6 ^= var5_5 ^ -1295724311;
                                    break block14;
                                }
lbl27:
                                // 1 sources

                                var5_5 = (var3_4 | var6_3) ^ 1141046127;
                                ** continue;
lbl29:
                                // 1 sources

                                var4_6 = (var3_4 | var6_3) ^ -1080376346;
                                break block15;
                                case 1776682635: {
                                    ** continue;
                                }
                                case -889452800: {
                                    return var1_1 + var0.nextInt(var2_2 - var1_1);
                                }
                                case -1596959648: {
                                    var4_6 ^= var5_5 ^ -1161939337;
                                    ** break;
                                }
                                case -1223759673: {
                                    return var1_1;
                                }
                            }
                            break;
                        }
                    }
                    break block16;
lbl41:
                    // 1 sources

                    var5_5 = (var3_4 | var6_3) ^ 972035240;
                    ** GOTO lbl10
                }
                var5_5 = (var3_4 | var6_3) ^ -612023013;
                ** GOTO lbl10
            }
            var5_5 = (var3_4 | var6_3) ^ -1680196344;
            ** GOTO lbl10
        }
        var5_5 = (var3_4 | var6_3) ^ -417793308;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static double random(Random random, double d2, double d3) {
        int n2 = a & 0x4B2B55E4 ^ 0xFEFD8073;
        int n3 = 0;
        int n4 = (n2 | 0x4B2B55E4) ^ 0x23E9C1D9;
        n3 = (n2 | 0x4B2B55E4) ^ 0xAEE4402C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1360762331: {
                    n3 = (n2 | 0x4B2B55E4) ^ 0xDC1F0BAE;
                    continue block5;
                }
                case 601939545: {
                    n4 ^= n3 ^ 0x1FF5D2AD;
                    n3 = (n2 | 0x4B2B55E4) ^ 0x78319D95;
                    continue block5;
                }
                case -2016524190: 
            }
            break;
        }
        return cm.randomRange(random, d2, d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float floor(float f2) {
        int n2 = a & 0x60D0E7E7 ^ 0x3620EFCD;
        int n3 = 0;
        int n4 = (n2 | 0x60D0E7E7) ^ 0x439BA881;
        n3 = (n2 | 0x60D0E7E7) ^ 0x23B47B83;
        while (true) {
            switch (n3) {
                case -2009600775: {
                    return (float)Math.floor(f2);
                }
                case 1430557804: {
                    n3 = (n2 | 0x60D0E7E7) ^ 0x33F1F01A;
                    break;
                }
                case 1157701621: {
                    n4 ^= n3 ^ 0x463190CC;
                    n3 = (n2 | 0x60D0E7E7) ^ 0xFEC70316;
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static float towardZero(float var0, float var1_1) {
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
     * Unable to fully structure code
     */
    public static double abs(double var0) {
        block8: {
            block9: {
                break block9;
lbl1:
                // 1 sources

                while (true) {
                    var4_2 = (var2_1 | -2079881784) ^ 1396304697;
                    break block8;
                    break;
                }
            }
            var2_1 = cm.a & -2079881784 ^ 2117323036;
            var4_2 = 0;
            var3_3 = (var2_1 | -2079881784) ^ 1978174193;
            ** GOTO lbl15
        }
lbl10:
        // 2 sources

        block6: while (true) {
            switch (var4_2) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block6;
                    }
                    break;
                }
lbl15:
                // 1 sources

                var4_2 = (var2_1 | -2079881784) ^ 803025827;
                ** continue;
                case 665208997: {
                    var3_3 ^= var4_2 ^ 595295972;
                    ** continue;
                }
                case -1391581467: {
                    return Math.abs(var0);
                }
                case -773128577: 
            }
            break;
        }
        var4_2 = (var2_1 | -2079881784) ^ -644774535;
        ** while (true)
    }
}

