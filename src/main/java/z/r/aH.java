/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1011
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1011;
import z.r.ec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class aH {
    private static final int a;
    private static final int[] a;
    public static final int c;
    private static final float a;
    private static final long a;
    public static final int b;

    /*
     * Enabled aggressive block sorting
     */
    private aH() {
        int n2 = c & 0xA84CA28 ^ 0xCAEFA6F5;
        int n3 = (n2 | 0xA84CA28) ^ 0x8942D31A;
        n3 ^= 0xAC305298;
        n3 ^= 0x57B980D0;
    }

    /*
     * Exception decompiling
     */
    public static class_1011 paint(ec var0, int var1_1, int var2_2, int var3_3, float var4_4, float var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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
     * Exception decompiling
     */
    private static void ui(float[] var0, int var1_1, int var2_2, int var3_3, float var4_4) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void uj(float[] var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        block44: {
            var18_7 = -741605540;
            var15_8 = aH.c & -741605540 ^ -1244260645;
            var17_9 = 0;
            var16_18 = (var15_8 | var18_7) ^ -1788284886;
            var17_9 = (var15_8 | var18_7) ^ 2010159654;
            block31: while (true) {
                switch (var17_9) {
                    case -1056160675: {
                        var16_18 ^= var17_9 ^ -407437952;
                        var17_9 = (var15_8 | var18_7) ^ -1869133421;
                        ** break;
                    }
                    case -2146474503: {
                        var17_9 = (var15_8 | var18_7) ^ 919845762;
                    }
lbl14:
                    // 3 sources

                    default: {
                        continue block31;
                    }
                    case 1732818508: 
                }
                break;
            }
            var7_10 = var3_3 * 0.85f;
            var16_18 ^= 1099428695;
            var8_11 = (int)Math.ceil(var3_3 * 3.0f);
            var16_18 ^= 431595774;
            var9_12 = -var8_11;
            ** GOTO lbl135
lbl23:
            // 1 sources

            while (true) {
                var17_9 = (var15_8 | var18_7) ^ 1209981416;
                break block44;
                break;
            }
lbl26:
            // 1 sources

            while (true) {
                var17_9 = (var15_8 | var18_7) ^ 629631805;
                ** GOTO lbl75
                break;
            }
lbl29:
            // 1 sources

            block34: while (true) {
                switch (var17_9) {
                    case 2078362858: {
                        if (var9_12 <= var8_11) {
                            var17_9 = (var15_8 | var18_7) ^ 531977961;
                            continue block34;
                        }
                        ** GOTO lbl46
                    }
                    case 579042512: {
                        var16_18 ^= var17_9 ^ 1672651180;
                        var17_9 = (var15_8 | var18_7) ^ -1942047947;
                        ** GOTO lbl53
                    }
                    case 970323963: {
                        var10_13 = -var8_11;
                        ** GOTO lbl66
                    }
                    case 1301626802: {
                        var16_18 ^= var17_9 ^ 455526641;
                        ** GOTO lbl48
                    }
lbl46:
                    // 1 sources

                    var17_9 = (var15_8 | var18_7) ^ -1169506195;
                    continue block34;
lbl48:
                    // 1 sources

                    var17_9 = (var15_8 | var18_7) ^ 2010484527;
                    continue block34;
                    case -395663050: {
                        var16_18 ^= var17_9 ^ -118440665;
                        var17_9 = (var15_8 | var18_7) ^ -838203356;
                    }
lbl53:
                    // 3 sources

                    default: {
                        continue block34;
                    }
lbl55:
                    // 2 sources

                    while (true) {
                        var17_9 = (var15_8 | var18_7) ^ 1976428105;
                        ** GOTO lbl75
lbl58:
                        // 1 sources

                        while (true) {
                            var17_9 = (var15_8 | var18_7) ^ -1417234347;
                            ** GOTO lbl75
                            break;
                        }
                        break;
                    }
                    case -2146799376: 
                }
                break;
            }
            return;
lbl63:
            // 1 sources

            while (true) {
                var17_9 = (var15_8 | var18_7) ^ -1412322485;
                ** GOTO lbl75
lbl66:
                // 2 sources

                while (true) {
                    var17_9 = (var15_8 | var18_7) ^ 927469786;
                    break block44;
                    break;
                }
                break;
            }
lbl69:
            // 1 sources

            while (true) {
                var16_18 ^= 754095207;
                var13_16 = var11_14 * var11_14 + var12_15 * var12_15;
                var16_18 ^= 1716100665;
                var14_17 = (float)Math.exp(-var13_16 / (2.0f * var7_10 * var7_10));
                var17_9 = (var15_8 | var18_7) ^ 1942202811;
lbl75:
                // 5 sources

                block40: while (true) {
                    switch (var17_9) {
                        default: {
                            continue block40;
                        }
                        case -765946654: {
                            ++var10_13;
                            ** continue;
                        }
                        case -1680629108: {
                            var16_18 ^= var17_9 ^ 372516973;
                            ** continue;
                        }
                        case -2078517660: {
                            var16_18 ^= var17_9 ^ 637657362;
                            ** continue;
                        }
                        case 1602497406: {
                            aH.uw(var0, (int)var1_1 + var10_13, (int)var2_2 + var9_12, var14_17 * var4_4, var14_17 * var5_5, var14_17 * var6_6);
                            ** GOTO lbl55
                        }
                        case 1544443028: {
                            if (var14_17 > 0.003f) ** break;
                            ** continue;
                            var17_9 = (var15_8 | var18_7) ^ -1942710795;
                            continue block40;
                        }
                        case 1549354890: {
                            var14_17 += 0.1f * (float)Math.exp(-var13_16 / (2.0f * var7_10 * var7_10 * 9.0f));
                            break;
                        }
                        case 2079025706: {
                            var17_9 = (var15_8 | var18_7) ^ -1470376799;
                            continue block40;
                        }
                        case -2112743018: {
                            var16_18 ^= var17_9 ^ 1192766376;
                            ** continue;
                        }
                    }
                    var17_9 = (var15_8 | var18_7) ^ 1812749651;
                }
                break;
            }
lbl107:
            // 1 sources

            while (true) {
                var12_15 = (float)((int)var2_2 + var9_12) + 0.5f - var2_2;
                ** continue;
                break;
            }
        }
        block42: while (true) {
            block47: {
                block45: {
                    block46: {
                        switch (var17_9) {
                            default: {
                                continue block42;
                            }
                            case 969865479: {
                                var11_14 = (float)((int)var1_1 + var10_13) + 0.5f - var1_1;
                                break block45;
                            }
                            case -1533516273: {
                                var16_18 ^= var17_9 ^ -591302289;
                                var17_9 = (var15_8 | var18_7) ^ -837744936;
                                continue block42;
                            }
                            case -1077860809: {
                                ++var9_12;
                                break;
                            }
                            case -751196681: {
                                var16_18 ^= var17_9 ^ -284913865;
                                ** continue;
                            }
                            case 1951225839: {
                                if (var10_13 > var8_11) break block46;
                                break block47;
                            }
                            case -1063784699: {
                                var16_18 ^= var17_9 ^ -1392440152;
                                var17_9 = (var15_8 | var18_7) ^ -2087540688;
                                continue block42;
                            }
                        }
lbl135:
                        // 2 sources

                        var17_9 = (var15_8 | var18_7) ^ -715357425;
                        ** continue;
                    }
                    var17_9 = (var15_8 | var18_7) ^ 619076136;
                    continue;
                }
                var16_18 ^= -1249578694;
                ** continue;
            }
            var17_9 = (var15_8 | var18_7) ^ 1397201360;
        }
    }

    /*
     * Exception decompiling
     */
    private static void uk(float[] var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
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
    private static void ul(float[] var0, int var1_1, int var2_2) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void um(float[] var0) {
        block57: {
            block56: {
                var13_1 = 970860031;
                var10_2 = aH.c & 970860031 ^ 616417362;
                var12_3 = 0;
                var11_13 = (var10_2 | var13_1) ^ 785515973;
                var12_3 = (var10_2 | var13_1) ^ -842633885;
                if (true) ** GOTO lbl-1000
lbl7:
                // 1 sources

                while (true) {
                    var12_3 = (var10_2 | var13_1) ^ 2004399008;
                    break block56;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var12_3 = (var10_2 | var13_1) ^ -1427166789;
                    break block57;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var3_6 = 0;
                    if (true) ** GOTO lbl69
                    break;
                }
                block39: while (true) {
                    switch (var12_3) {
                        case -1056149027: {
                            var11_13 ^= var12_3 ^ -1287812402;
                            ** GOTO lbl32
                        }
                        case 1881619064: {
                            var11_13 ^= var12_3 ^ 1039931087;
                            ** break;
                        }
                        case 969051110: {
                            if (var1_4 < aH.uz((var11_13 | var12_3 ^ 1879577) ^ (var12_3 ^ -1979710362), (var10_2 | var12_3 ^ 1879577) ^ ((var11_13 | var12_3 ^ 1879577) ^ (var12_3 ^ -1679310947)))) {
                                var12_3 = (var10_2 | var13_1) ^ -894296684;
                                continue block39;
                            }
                            var12_3 = (var10_2 | var13_1) ^ 1306056583;
                            ** GOTO lbl41
                        }
lbl30:
                        // 1 sources

                        var12_3 = (var10_2 | var13_1) ^ 1462257705;
                        ** GOTO lbl41
lbl32:
                        // 1 sources

                        var12_3 = (var10_2 | var13_1) ^ 71132697;
                        ** GOTO lbl41
                        case -1703553151: {
                            var2_5 = (float)var1_4 / 256.0f;
                            var11_13 ^= -816370857;
                            ** continue;
                        }
                        case -145887125: {
                            var11_13 ^= var12_3 ^ 28910903;
                            var12_3 = (var10_2 | var13_1) ^ -1484113282;
                        }
lbl41:
                        // 6 sources

                        while (true) {
                            default: {
                                continue block39;
                            }
                            break;
                        }
lbl44:
                        // 2 sources

                        while (true) {
                            var12_3 = (var10_2 | var13_1) ^ -226768249;
                            break block57;
lbl47:
                            // 1 sources

                            while (true) {
                                var9_12 = (var1_4 * aH.uz(((var11_13 ^= 367411005) | var13_1) ^ 2011422083, (var10_2 | var13_1) ^ ((var11_13 | var13_1) ^ 1134927010)) + var3_6) * 3;
                                var12_3 = (var10_2 | var13_1) ^ 538330117;
                                break block56;
                                break;
                            }
lbl51:
                            // 2 sources

                            while (true) {
                                var12_3 = (var10_2 | var13_1) ^ -1074058449;
                                break block57;
                                break;
                            }
                            break;
                        }
                        block44: while (true) {
                            switch (var12_3) lbl-1000:
                            // 2 sources

                            {
                                default: {
                                    continue block44;
                                }
                                case -426097500: {
                                    var11_13 ^= var12_3 ^ 567808432;
                                    break;
                                }
                                case -264666980: {
                                    var12_3 = (var10_2 | var13_1) ^ -614094501;
                                    continue block44;
                                }
                                case 1871944094: {
                                    var1_4 = 0;
                                    ** break;
                                }
                            }
                            var12_3 = (var10_2 | var13_1) ^ 1382839393;
                        }
lbl69:
                        // 2 sources

                        while (true) {
                            var12_3 = (var10_2 | var13_1) ^ -408313134;
                            break block57;
                            break;
                        }
lbl72:
                        // 1 sources

                        while (true) {
                            var12_3 = (var10_2 | var13_1) ^ -1287845510;
                            break block56;
lbl75:
                            // 1 sources

                            while (true) {
                                var12_3 = (var10_2 | var13_1) ^ 2146820371;
                                break block56;
                                break;
                            }
                            break;
                        }
lbl78:
                        // 1 sources

                        while (true) {
                            var8_11 = 0.09f + 0.91f * var7_10 * var7_10 * var7_10;
                            ** continue;
                            break;
                        }
lbl81:
                        // 1 sources

                        while (true) {
                            var6_9 = aH.uD(2.0f * (var4_7 + var2_5));
                            var11_13 ^= -792355158;
                            var7_10 = 0.5f + 0.5f * (float)Math.sin(25.132742f * (var4_7 + var2_5) + var5_8);
                            var11_13 ^= 2117128933;
                            ** continue;
                            break;
                        }
lbl87:
                        // 1 sources

                        while (true) {
                            var12_3 = (var10_2 | var13_1) ^ -51143646;
                            ** continue;
                            break;
                        }
                        case 1792517590: 
                    }
                    break;
                }
                return;
            }
            block51: while (true) {
                switch (var12_3) {
                    default: {
                        continue block51;
                    }
                    case 501852666: {
                        var11_13 ^= var12_3 ^ 521782477;
                        ** continue;
                    }
                    case 1250385503: {
                        ++var3_6;
                        ** continue;
                    }
                    case -1899830139: {
                        var11_13 ^= var12_3 ^ 1881284859;
                        ** continue;
                    }
                    case 1107954924: 
                }
                break;
            }
            aH.uy(var0, var9_12, var6_9, 0.85f, var8_11 * 0.75f);
            ** while (true)
lbl109:
            // 1 sources

            while (true) {
                var5_8 = (aH.ut(var4_7, var2_5, 2, 3, aH.uz(((var11_13 ^= 1427618836) | var13_1) ^ -1243461758, (var10_2 | var13_1) ^ ((var11_13 | var13_1) ^ 873211971))) - 0.5f) * 2.2f;
                var11_13 ^= 1083500741;
                ** continue;
                break;
            }
        }
        while (true) {
            block58: {
                block19 : switch (var12_3) {
                    default: {
                        break;
                    }
                    case -631877843: {
                        ** GOTO lbl51
                    }
                    case -1509352980: {
                        var4_7 = (float)var3_6 / 256.0f;
                        ** continue;
                    }
                    case 952194787: {
                        if (var3_6 < aH.uz((var11_13 | var12_3 ^ 18838300) ^ (var12_3 ^ -1893512862), (var10_2 | var12_3 ^ 18838300) ^ ((var11_13 | var12_3 ^ 18838300) ^ (var12_3 ^ -507112924)))) {
                            var12_3 = (var10_2 | var13_1) ^ 985135655;
                            break;
                        }
                        break block58;
                    }
                    case -813422728: {
                        var12_3 = (var10_2 | var13_1) ^ 87997212;
                        break;
                    }
                    case 193004545: {
                        var11_13 ^= var12_3 ^ -2046921368;
                        ** continue;
                    }
                    case 63996043: {
                        var11_13 ^= var12_3 ^ 642247619;
                        ** GOTO lbl44
                    }
                    case -894300504: {
                        var11_13 ^= var12_3 ^ 1294916323;
                        ** continue;
                    }
                    case 122165208: {
                        var11_13 ^= var12_3 ^ 1885336186;
                        var12_3 = (var10_2 | var13_1) ^ -1678314477;
                        break;
                    }
                    case -239527998: {
                        var11_13 ^= var12_3 ^ -1615038062;
                        ** continue;
                    }
                    case -1760508860: {
                        ++var1_4;
                        ** break;
                    }
                    case -2113616176: {
                        switch (var11_13) {
                            default: {
                                var12_3 = (var10_2 | var13_1) ^ -145890473;
                                break block19;
                            }
                            case -193249576: {
                                var12_3 = (var10_2 | var13_1) ^ 914287102;
                                break block19;
                            }
                            case -1610762186: 
                        }
                        var12_3 = (var10_2 | var13_1) ^ 1043295604;
                        break;
                    }
                }
                continue;
lbl162:
                // 2 sources

                ** continue;
            }
            var12_3 = (var10_2 | var13_1) ^ -867763651;
        }
    }

    /*
     * Exception decompiling
     */
    private static void un(float[] var0, int var1_1) {
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
    private static float uo(float var0, float var1_1) {
        block8: {
            block9: {
                var3_2 = aH.c & 1916066341 ^ -1754040774;
                var5_3 = 0;
                var4_4 = (var3_2 | 1916066341) ^ -1029424547;
                ** GOTO lbl18
lbl5:
                // 2 sources

                block5: while (true) {
                    switch (var5_3) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block5;
                            }
                            break;
                        }
                        case 798672017: {
                            break block5;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var4_4 ^= -2141259066;
                            break block8;
                            break;
                        }
                        case 1940853419: {
                            var4_4 ^= var5_3 ^ -1132020068;
                            break block9;
                        }
lbl18:
                        // 1 sources

                        var5_3 = (var3_2 | 1916066341) ^ -655541586;
                        ** continue;
                        case 973064950: {
                            var2_5 = var0 - 0.5f;
                            ** continue;
                        }
                    }
                    break;
                }
                var5_3 = (var3_2 | 1916066341) ^ -2066158444;
                ** GOTO lbl5
            }
            var5_3 = (var3_2 | 1916066341) ^ -829934391;
            ** while (true)
        }
        return (float)Math.exp(-(var2_5 * var2_5) / (2.0f * var1_1 * var1_1));
    }

    /*
     * Exception decompiling
     */
    public static class_1011 paintAura(ec var0, int var1_1, int var2_2, int var3_3, float var4_4) {
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static float up(float f2, float f3, float f4, int n2) {
        int n3 = c & 0xB0C669D6 ^ 0xFA56443C;
        int n4 = 0;
        int n5 = (n3 | 0xB0C669D6) ^ 0x9A4F97CC;
        n4 = (n3 | 0xB0C669D6) ^ 0x82FF4C75;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | 0xB0C669D6) ^ 0xC1114985;
            }
            block6: while (true) {
                switch (n4) {
                    default: {
                        continue block6;
                    }
                    case 1119819120: {
                        n5 ^= n4 ^ 0x3060BCE7;
                        continue block5;
                    }
                    case 2015961483: {
                        n4 = (n3 | 0xB0C669D6) ^ 0xB869788E;
                        continue block6;
                    }
                    case 1002906747: 
                }
                break;
            }
            break;
        }
        float f5 = Math.abs((float)Math.cos(f3 * f2 + f4));
        n5 ^= 0x4CF3D627;
        return (float)Math.pow(f5, n2);
    }

    /*
     * Unable to fully structure code
     */
    private static float uq(float var0, float var1_1, float var2_2) {
        var4_3 = aH.c & 1155579960 ^ -898992327;
        var6_4 = 0;
        ** GOTO lbl18
lbl4:
        // 1 sources

        block5: while (true) {
            switch (var6_4) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    var5_5 ^= -29846753;
                    ** GOTO lbl21
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | 1155579960) ^ -1695219639;
                    ** GOTO lbl-1000
                    break;
                }
                case 1411381104: {
                    var5_5 ^= var6_4 ^ -1882985447;
                    break block5;
                }
lbl18:
                // 1 sources

                var5_5 = (var4_3 | 1155579960) ^ 1848405695;
                var6_4 = (var4_3 | 1155579960) ^ -1108835889;
                ** continue;
lbl21:
                // 1 sources

                return (float)Math.pow(var3_6, var2_2);
                case 1929541366: {
                    ** continue;
                }
            }
            break;
        }
        var6_4 = (var4_3 | 1155579960) ^ 1123912667;
        ** while (true)
        {
            ** case -1944617758:
        }
lbl27:
        // 1 sources

        var3_6 = Math.max(0.0f, 1.0f - var0 / var1_1);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static class_1011 ur(float[] var0, float var1_1) {
        block42: {
            block41: {
                var14_2 = 835059427;
                var13_3 = -1841625941;
                var12_4 = -1203883329;
                var9_5 = aH.c & -1841625941 ^ 700225278;
                var11_6 = 0;
                var10_14 = (var9_5 | var13_3) ^ 1076550981;
                var11_6 = (var9_5 | var13_3) ^ 1399741147;
                if (true) ** GOTO lbl76
                while (true) {
                    break block41;
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    var11_6 = (var9_5 | var13_3) ^ -744326918;
                    if (true) ** GOTO lbl47
                    break;
                }
            }
            var11_6 = (var9_5 | var13_3) ^ -314538798;
            block29: while (true) {
                switch (var11_6) {
                    case -1200897123: {
                        if (var3_8 >= aH.uz((var10_14 | var11_6 ^ 709936950) ^ (var11_6 ^ 705197860), (var9_5 | var11_6 ^ 709936950) ^ ((var10_14 | var11_6 ^ 709936950) ^ (var11_6 ^ -274461840)))) ** continue;
                        ** break;
                    }
                    case 700709795: {
                        var10_14 ^= var11_6 ^ 1966545958;
                        ** GOTO lbl37
                    }
lbl24:
                    // 1 sources

                    var11_6 = (var9_5 | var13_3) ^ -1797673978;
                    ** GOTO lbl39
                    case 1459556909: {
                        var10_14 ^= var11_6 ^ -60754713;
                        var11_6 = (var9_5 | var13_3) ^ 1358369617;
                        ** GOTO lbl39
                    }
                    case 795228921: {
                        var10_14 ^= var11_6 ^ 370453250;
                        var11_6 = (var9_5 | var13_3) ^ 910817963;
                        ** GOTO lbl39
                    }
                    case -1913230252: {
                        var4_9 = 0;
                        ** break;
                    }
lbl37:
                    // 1 sources

                    var11_6 = (var9_5 | var13_3) ^ 64247138;
                    continue block29;
lbl39:
                    // 5 sources

                    default: {
                        continue block29;
                    }
lbl41:
                    // 1 sources

                    while (true) {
                        var10_14 ^= -882205418;
                        var3_8 = 0;
                        break block42;
                        break;
                    }
                    block32: while (true) {
                        var11_6 = (var9_5 | var13_3) ^ 1647998553;
lbl47:
                        // 2 sources

                        while (true) {
                            switch (var11_6) {
                                case -645537626: {
                                    ++var4_9;
                                    ** break;
                                }
                                case 1822392903: {
                                    var10_14 ^= var11_6 ^ -1782835087;
                                    continue block32;
                                }
lbl55:
                                // 2 sources

                                var11_6 = (var9_5 | var13_3) ^ -682975884;
                                ** GOTO lbl101
                                case 1746791941: {
                                    var10_14 ^= var11_6 ^ 858397254;
                                    var11_6 = (var9_5 | var13_3) ^ -1850040085;
                                    break;
                                }
                                case 704984596: {
                                    var2_7.method_61941(var4_9, var3_8, aH.uz((var10_14 | var11_6 ^ var12_4) ^ (var11_6 ^ -131692060), (var9_5 | var11_6 ^ var12_4) ^ ((var10_14 | var11_6 ^ var12_4) ^ (var11_6 ^ -126494125))) | var6_11 << aH.uz((var10_14 | var11_6 ^ var12_4) ^ (var11_6 ^ -131692059), (var9_5 | var11_6 ^ var12_4) ^ ((var10_14 | var11_6 ^ var12_4) ^ (var11_6 ^ -1492584449))) | var7_12 << aH.uz((var10_14 | var11_6 ^ var12_4) ^ (var11_6 ^ -131692058), (var9_5 | var11_6 ^ var12_4) ^ ((var10_14 | var11_6 ^ var12_4) ^ (var11_6 ^ -2119048922))) | var8_13);
                                    var11_6 = (var9_5 | var13_3) ^ -685763400;
                                }
                            }
                        }
                        break;
                    }
                    block34: while (true) {
                        switch (var11_6) {
                            case -1543570872: {
                                var2_7 = new class_1011(aH.uz((var10_14 | var11_6 ^ var14_2) ^ (var11_6 ^ 874067175), (var9_5 | var11_6 ^ var14_2) ^ ((var10_14 | var11_6 ^ var14_2) ^ (var11_6 ^ -556133081))), aH.uz((var10_14 | var11_6 ^ var14_2) ^ (var11_6 ^ 874067168), (var9_5 | var11_6 ^ var14_2) ^ ((var10_14 | var11_6 ^ var14_2) ^ (var11_6 ^ -673221003))), true);
                                ** continue;
                            }
                            case -1450887419: {
                                var10_14 ^= var11_6 ^ -637904158;
                                break;
                            }
                            case -388903900: {
                                ** break;
lbl75:
                                // 1 sources

                                var11_6 = (var9_5 | var13_3) ^ 305832442;
                            }
lbl76:
                            // 3 sources

                            default: {
                                continue block34;
                            }
                        }
                        var11_6 = (var9_5 | var13_3) ^ 406940855;
                    }
                    case -347568722: 
                }
                break;
            }
            return var2_7;
lbl82:
            // 1 sources

            while (true) {
                var6_11 = aH.us(var0[var5_10] * var1_1);
                var10_14 ^= 139919568;
                var7_12 = aH.us(var0[var5_10 + 1] * var1_1);
                var10_14 ^= -1000336312;
                var8_13 = aH.us(var0[var5_10 + 2] * var1_1);
                ** continue;
                break;
            }
            while (true) {
                var11_6 = (var9_5 | var13_3) ^ -862282944;
                if (true) ** GOTO lbl101
                break;
            }
        }
lbl93:
        // 2 sources

        while (true) {
            var11_6 = (var9_5 | var13_3) ^ -1837339300;
            ** GOTO lbl39
            break;
        }
        block38: while (true) {
            var11_6 = (var9_5 | var13_3) ^ -917707905;
            if (true) ** GOTO lbl101
            block39: while (true) {
                var11_6 = (var9_5 | var13_3) ^ -2007689566;
lbl101:
                // 4 sources

                block40: while (true) {
                    switch (var11_6) {
                        default: {
                            continue block40;
                        }
                        case 871006301: {
                            var10_14 ^= var11_6 ^ 1510308753;
                            var11_6 = (var9_5 | var13_3) ^ 760862266;
                            continue block40;
                        }
                        case 1544062386: {
                            if (var4_9 >= aH.uz((var10_14 | var11_6 ^ -835485415) ^ (var11_6 ^ -1481641720), (var9_5 | var11_6 ^ -835485415) ^ ((var10_14 | var11_6 ^ -835485415) ^ (var11_6 ^ 1159285007)))) ** continue;
                            continue block39;
                        }
                        case 1998917055: {
                            var10_14 ^= var11_6 ^ -768201062;
                            continue block38;
                        }
                        case 1928557952: {
                            ++var3_8;
                            ** continue;
                        }
                        case 1827998603: {
                            var10_14 ^= var11_6 ^ -1402970416;
                            var11_6 = (var9_5 | var13_3) ^ -407432371;
                            continue block40;
                        }
                        case -1763295035: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        var5_10 = (var3_8 * aH.uz((var10_14 | var11_6 ^ 81609838) ^ (var11_6 ^ 75878202), (var9_5 | var11_6 ^ 81609838) ^ ((var10_14 | var11_6 ^ 81609838) ^ (var11_6 ^ -1083667884))) + var4_9) * 3;
        var10_14 ^= -950414214;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static int us(float var0) {
        block10: {
            block11: {
                break block11;
lbl1:
                // 1 sources

                return (int)(Math.sqrt(aH.uE(var0)) * 255.0 + 0.5);
lbl3:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 155570085) ^ -1305114124;
lbl5:
                    // 2 sources

                    block7: while (true) {
                        switch (var3_2) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block7;
                                }
                                break;
                            }
                            case -1322537359: {
                                ** continue;
                            }
                            case 1379638566: {
                                var2_3 ^= var3_2 ^ -541967529;
                                break block10;
                            }
lbl15:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | 155570085) ^ -1681505647;
                                ** continue;
                                break;
                            }
                            case 2076726851: {
                                break;
                            }
                        }
                        ** continue;
                        break;
                    }
                    break;
                }
            }
            var1_1 = aH.c & 155570085 ^ -910304970;
            var3_2 = 0;
            var2_3 = (var1_1 | 155570085) ^ 115970119;
            ** while (true)
        }
        var3_2 = (var1_1 | 155570085) ^ 2027319750;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static float ut(float var0, float var1_1, int var2_2, int var3_3, int var4_4) {
        block38: {
            block39: {
                block37: {
                    block40: {
                        break block40;
lbl1:
                        // 1 sources

                        block19: while (true) {
                            var11_7 = (var9_6 | var12_5) ^ -942067268;
                            ** GOTO lbl24
lbl4:
                            // 1 sources

                            block20: while (true) {
                                var11_7 = (var9_6 | var12_5) ^ -638003183;
                                ** GOTO lbl24
lbl7:
                                // 1 sources

                                while (true) {
                                    var10_12 ^= var11_7 ^ -851128623;
                                    break block37;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var10_12 ^= var11_7 ^ 222071073;
                                    ** GOTO lbl40
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var10_12 ^= var11_7 ^ -1822179500;
                                    ** GOTO lbl102
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var11_7 = (var9_6 | var12_5) ^ 2115743733;
                                    if (true) ** GOTO lbl24
                                    break;
                                }
lbl19:
                                // 1 sources

                                while (true) {
                                    var10_12 ^= var11_7 ^ 2043266926;
                                    ** continue;
                                    break;
                                }
                                block26: while (true) {
                                    var11_7 = (var9_6 | var12_5) ^ -2108648472;
lbl24:
                                    // 10 sources

                                    block27: while (true) {
                                        switch (var11_7) lbl-1000:
                                        // 3 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block27;
                                                }
                                                break;
                                            }
                                            case 2017955139: {
                                                ** continue;
                                            }
                                            case 1138558379: {
                                                ** continue;
                                            }
                                            case 1036922647: {
                                                ** continue;
                                            }
                                            case 135000936: {
                                                ** continue;
                                            }
lbl37:
                                            // 1 sources

                                            while (true) {
                                                var11_7 = (var9_6 | var12_5) ^ -62670508;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl40:
                                            // 1 sources

                                            var11_7 = (var9_6 | var12_5) ^ 1078053999;
                                            ** continue;
                                            case 570878390: {
                                                var7_10 <<= 1;
                                                ** continue;
                                            }
                                            case 106383682: {
                                                if (var8_11 >= var3_3) continue block26;
                                                break block38;
                                            }
lbl48:
                                            // 1 sources

                                            while (true) {
                                                var11_7 = (var9_6 | var12_5) ^ -2083190560;
                                                break block39;
                                                break;
                                            }
                                            case 148274231: {
                                                var10_12 ^= var11_7 ^ 161592512;
                                                ** GOTO lbl96
                                            }
lbl54:
                                            // 1 sources

                                            while (true) {
                                                var11_7 = (var9_6 | var12_5) ^ -1473115241;
                                                break block39;
                                                break;
                                            }
                                            case -1048243446: {
                                                var5_8 += var6_9 * aH.uu(var0, var1_1, var7_10, var4_4 * aH.uz((var10_12 | var11_7 ^ -32294093) ^ (var11_7 ^ 846135535), (var9_6 | var11_7 ^ -32294093) ^ ((var10_12 | var11_7 ^ -32294093) ^ (var11_7 ^ -2129149869))) + var8_11);
                                                break block19;
                                            }
                                            case 53362223: {
                                                ++var8_11;
                                                continue block20;
                                            }
                                            case -708693759: {
                                                return var5_8;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        var11_7 = (var9_6 | var12_5) ^ -1219968824;
                        ** GOTO lbl24
lbl67:
                        // 1 sources

                        while (true) {
                            var11_7 = (var9_6 | var12_5) ^ -1138441696;
                            break block39;
                            break;
                        }
lbl70:
                        // 1 sources

                        while (true) {
                            var11_7 = (var9_6 | var12_5) ^ -1177946691;
                            ** GOTO lbl24
                            break;
                        }
                    }
                    var12_5 = 1066805305;
                    var9_6 = aH.c & 1066805305 ^ -1248944938;
                    var11_7 = 0;
                    var10_12 = (var9_6 | var12_5) ^ 1864147647;
                    ** while (true)
lbl79:
                    // 1 sources

                    while (true) {
                        var10_12 ^= 2006304076;
                        ** GOTO lbl94
                        break;
                    }
lbl82:
                    // 1 sources

                    while (true) {
                        var10_12 ^= -129793840;
                        var7_10 = var2_2;
                        ** continue;
                        break;
                    }
                }
                var11_7 = (var9_6 | var12_5) ^ -1129282864;
                ** GOTO lbl24
            }
            block36: while (true) {
                switch (var11_7) {
                    default: {
                        continue block36;
                    }
lbl94:
                    // 1 sources

                    var8_11 = 0;
                    ** continue;
lbl96:
                    // 1 sources

                    var11_7 = (var9_6 | var12_5) ^ -1650961079;
                    ** GOTO lbl24
                    case 397195112: {
                        var5_8 = 0.0f;
                        var6_9 = 0.5f;
                        ** continue;
                    }
lbl102:
                    // 1 sources

                    var11_7 = (var9_6 | var12_5) ^ 1784450558;
                    ** GOTO lbl24
                    case 62553823: {
                        var10_12 ^= var11_7 ^ 1854667081;
                        ** continue;
                    }
                    case 1011594271: {
                        ** continue;
                    }
                }
                break;
            }
        }
        var11_7 = (var9_6 | var12_5) ^ -1214951529;
        ** while (true)
        {
            case -2133872: {
                var6_9 *= 0.5f;
                ** continue;
            }
            ** case 0x666664EE:
        }
lbl116:
        // 1 sources

        var10_12 ^= var11_7 ^ -315533561;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static float uu(float var0, float var1_1, int var2_2, int var3_3) {
        block19: {
            block18: {
                block20: {
                    block21: {
                        var14_4 = aH.c & 509563897 ^ 378086628;
                        var16_5 = 0;
                        ** GOTO lbl41
lbl4:
                        // 1 sources

                        while (true) {
                            var15_13 ^= 338908818;
                            break block18;
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var11_11 = aH.uv(var6_6 + 1, var7_7, var2_2, var3_3);
                            ** GOTO lbl31
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            continue;
lbl12:
                            // 1 sources

                            while (true) {
                                var15_13 ^= 2057851914;
                                ** continue;
                                break;
                            }
lbl15:
                            // 1 sources

                            while (true) {
                                var15_13 ^= -1252651741;
                                break block19;
                                break;
                            }
lbl18:
                            // 1 sources

                            while (true) {
                                var8_8 = aH.uA(var4_14 - (float)var6_6);
                                var9_9 = aH.uA(var5_15 - (float)var7_7);
                                ** continue;
                                break;
                            }
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl24:
                        // 1 sources

                        block12: while (true) {
                            switch (var16_5) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    default: {
                                        continue block12;
                                    }
                                    break;
                                }
                                case 1747783428: {
                                    ** continue;
                                }
lbl31:
                                // 1 sources

                                var15_13 ^= 1718885064;
                                break block20;
lbl33:
                                // 1 sources

                                while (true) {
                                    var16_5 = (var14_4 | 509563897) ^ 1996386208;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl36:
                                // 1 sources

                                return aH.uC(aH.uC(var10_10, var11_11, var8_8), aH.uC(var12_12, var13_16, var8_8), var9_9);
lbl38:
                                // 1 sources

                                while (true) {
                                    var16_5 = (var14_4 | 509563897) ^ 1995602169;
                                    ** continue;
                                    break;
                                }
lbl41:
                                // 1 sources

                                var15_13 = (var14_4 | 509563897) ^ 1410189950;
                                ** continue;
                                case -607746662: {
                                    var15_13 ^= var16_5 ^ -1748783864;
                                    ** continue;
                                }
                                case 1746999389: {
                                    break block21;
                                }
                            }
                            break;
                        }
                        var6_6 = (int)Math.floor(var4_14);
                        var7_7 = (int)Math.floor(var5_15);
                        var15_13 ^= -1939205323;
                        ** while (true)
lbl52:
                        // 1 sources

                        while (true) {
                            var15_13 ^= -23803725;
                            ** continue;
                            break;
                        }
                    }
                    var16_5 = (var14_4 | 509563897) ^ -988155289;
                    ** while (true)
                }
                var12_12 = aH.uv(var6_6, var7_7 + 1, var2_2, var3_3);
                ** while (true)
            }
            var13_16 = aH.uv(var6_6 + 1, var7_7 + 1, var2_2, var3_3);
            ** while (true)
        }
        var10_10 = aH.uv(var6_6, var7_7, var2_2, var3_3);
        ** while (true)
        var4_14 = var0 * (float)var2_2;
        var5_15 = var1_1 * (float)var2_2;
        var15_13 ^= 121912085;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static float uv(int var0, int var1_1, int var2_2, int var3_3) {
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
    private static void uw(float[] var0, int var1_1, int var2_2, float var3_3, float var4_4, float var5_5) {
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
    private static float[] ux(int var0) {
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
    private static void uy(float[] var0, int var1_1, float var2_2, float var3_3, float var4_4) {
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

    private static int uz(int n2, int n3) {
        int n4 = 1673860832;
        int n5 = 1764765523;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x67E9D780)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x6BF5A84D;
        n6 ^= (n5 | n4) ^ 0x6BF54560;
        n6 ^= (n5 | n4) ^ 0x6BF5A57E;
        n6 ^= (n5 | n4) ^ 0x6BF5B229;
        n6 += (n5 | n4) ^ 0x6BF5F3DC;
        return n6 += (n5 | n4) ^ 0x6BF5F915;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float uA(float f2) {
        int n2 = c & 0xF013549C ^ 0xA38D296B;
        int n3 = 0;
        int n4 = (n2 | 0xF013549C) ^ 0x999A3F54;
        n3 = (n2 | 0xF013549C) ^ 0x8A87C6ED;
        block5: while (true) {
            switch (n3) {
                case -1832947766: {
                    return f2 * f2 * (3.0f - 2.0f * f2);
                }
                case -168883625: {
                    n4 ^= n3 ^ 0x39603701;
                    n3 = (n2 | 0xF013549C) ^ 0x61201235;
                }
                default: {
                    continue block5;
                }
                case 2031663890: 
            }
            n3 = (n2 | 0xF013549C) ^ 0x67077A8;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float uB(float f2, float f3, float f4) {
        int n2 = c & 0x88EBC14D ^ 0x4D995177;
        int n3 = 0;
        int n4 = (n2 | 0x88EBC14D) ^ 0x8443699E;
        n3 = (n2 | 0x88EBC14D) ^ 0x7DD0EEA0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 2119438784: {
                    return aH.uA(aH.uE((f4 - f2) / (f3 - f2)));
                }
                case 256682782: {
                    n4 ^= n3 ^ 0x81F04647;
                    n3 = (n2 | 0x88EBC14D) ^ 0xB3AFC0BF;
                    continue block5;
                }
                case -1339342881: 
            }
            n3 = (n2 | 0x88EBC14D) ^ 0xC2B77A61;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float uC(float f2, float f3, float f4) {
        int n2 = c & 0x4AF2C9CE ^ 0x31FA1A58;
        int n3 = 0;
        int n4 = (n2 | 0x4AF2C9CE) ^ 0x88AC30F7;
        n3 = (n2 | 0x4AF2C9CE) ^ 0xE5076AD5;
        block5: while (true) {
            switch (n3) {
                case -363134778: {
                    return f2 + (f3 - f2) * f4;
                }
                case -1021424963: {
                    n4 ^= n3 ^ 0x98812AB9;
                    n3 = (n2 | 0x4AF2C9CE) ^ 0x91A1DB18;
                }
                default: {
                    continue block5;
                }
                case -1627541237: 
            }
            n3 = (n2 | 0x4AF2C9CE) ^ 0xB8E49163;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float uD(float f2) {
        int n2 = c & 0xE8EFD56B ^ 0x6E942FBC;
        int n3 = 0;
        int n4 = (n2 | 0xE8EFD56B) ^ 0x53E33C9D;
        n3 = (n2 | 0xE8EFD56B) ^ 0x6A9BAD31;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1767714931: {
                    return f2 - (float)Math.floor(f2);
                }
                case -2073799986: {
                    n3 = (n2 | 0xE8EFD56B) ^ 0x1CD007B5;
                    continue block5;
                }
                case -231737270: 
            }
            n4 ^= n3 ^ 0x57C32AF9;
            n3 = (n2 | 0xE8EFD56B) ^ 0x87A2CF8C;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block44: {
            block43: {
                block42: {
                    var9 = 1477122676;
                    var8_1 = -1284747444;
                    aH.c = mK.a(MethodHandles.lookup().lookupClass(), -735751518);
                    var7_2 = 0;
                    ** GOTO lbl49
lbl6:
                    // 1 sources

                    while (true) {
                        var7_2 = var9 ^ -740488817;
                        break block42;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var6_6 ^= var7_2 ^ 1009896876;
                        ** GOTO lbl97
                        break;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var2_5 = (var6_6 | var7_2 ^ 563084875) ^ (var7_2 ^ 828659067) ^ aH.c;
                        ** GOTO lbl47
lbl15:
                        // 1 sources

                        while (true) {
                            var7_2 = var9 ^ -1384573789;
                            break block42;
                            break;
                        }
lbl18:
                        // 1 sources

                        while (true) {
                            var6_6 ^= var7_2 ^ -2144921297;
                            break block43;
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            var5_9 = (var0_3[var3_7] & (((var6_6 ^= -2042442930) | var9) ^ -59777534)) << ((var6_6 | var9) ^ -59777307) | (var0_3[var3_7 + 1] & ((var6_6 | var9) ^ -59777534)) << ((var6_6 | var9) ^ -59777299) | (var0_3[var3_7 + 2] & ((var6_6 | var9) ^ -59777534)) << ((var6_6 | var9) ^ -59777291) | var0_3[var3_7 + 3] & ((var6_6 | var9) ^ -59777534);
                            ** GOTO lbl103
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var3_7 += 4;
                            if (++var4_8 >= var1_4) ** GOTO lbl51
lbl27:
                            // 2 sources

                            while (true) {
                                ** continue;
                                break;
                            }
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var0_3 = "'\u0000^\u00b8s7\u00f4+P?&\u00ccd\u00a6\u00e1\u00dc%\u00a3 W'\n\u00df\u0014\u00fd\u001f\u000b\u0086f\u00f63\u00b2BjM~\u00cf\u00d8(\u0086>\u00ef\u00a7\u00f0\u00d9\u00c7\u00f5\u00aa\u00cc\u00c2\u00a4\u00f6\u00b3\u00c0DK\\\u00cbpa\u00e9c^,\u008cd\u0013\u0000\u00b0\u00f9\u0010\u00d2/\u001e51\u00da\u00f1O\u0098\u00c4\u001d\u00ad\u0084\u008f\u0018\u00c1W\u00b2D\\\u00ceUt\u00b4b\u001a\u0097\u00e4\u00fc\u00cd\u000f_b\u00bd\u0099\u00abS\u00e3o1\u00ba\u009b\u00a1'&\u00d8\u00f2iL{\u00f0GP*\u00e1\u00e3\u0090\u00e7\u008d\u00f1X\u00e6e\u0019cR\u00bc\r\u009c\u00b1\u00a6E\u00cd\u00b8\u00a3&\u0098\u009e\u00c9\u0018Y\u00b9\u00d3\u00dc\n\u00e0\u0088!cZ66\u00ba\u0004K\u001b\u0007\"\u00f2\r\u00d5\u00ec<\u008eP\u0084j5\u00b8>\u0093\u00b6\u0002\u00da\u0090\u0099\u00bd`\u0095\u0018\n\u0082@\u00cb\u0083\u00b2s\u00ec:\u00b8\u00f8\u00a9\u00f6}\u009f`\u00bc1\u00c0\u00f9\u0001\u00e91\u001b$8\u008f\u00faU!h\u008f\u0096k\u001aHz".getBytes("ISO-8859-1");
                            ** GOTO lbl56
                            break;
                        }
lbl32:
                        // 1 sources

                        while (true) {
                            var7_2 = var9 ^ var8_1;
                            ** GOTO lbl78
                            break;
                        }
                        break;
                    }
lbl35:
                    // 1 sources

                    while (true) {
                        var7_2 = var9 ^ -864287907;
                        ** GOTO lbl108
                        break;
                    }
lbl38:
                    // 1 sources

                    while (true) {
                        var6_6 ^= var7_2 ^ -284964078;
                        ** continue;
                        break;
                    }
                }
                block31: while (true) {
                    switch (var7_2) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block31;
                            }
                            break;
                        }
lbl47:
                        // 1 sources

                        var6_6 ^= 382341272;
                        ** continue;
lbl49:
                        // 1 sources

                        var6_6 = 743111218;
                        ** continue;
lbl51:
                        // 1 sources

                        var7_2 = var9 ^ -1916864591;
                        ** GOTO lbl78
                        case -177074473: {
                            var6_6 ^= var7_2 ^ 1312240397;
                            ** continue;
                        }
lbl56:
                        // 1 sources

                        var6_6 ^= -983241563;
                        ** GOTO lbl99
lbl58:
                        // 1 sources

                        while (true) {
                            var7_2 = var9 ^ -1532365512;
                            ** GOTO lbl78
                            break;
                        }
                        case -1510233839: {
                            var3_7 = 0;
                            var6_6 ^= 1635142652;
                            ** GOTO lbl101
                        }
lbl65:
                        // 1 sources

                        while (true) {
                            var6_6 ^= var7_2 ^ -906886545;
                            ** continue;
                            break;
                        }
lbl68:
                        // 1 sources

                        while (true) {
                            aH.a[var4_8] = var5_9 ^= var2_5;
                            break block44;
                            break;
                        }
lbl71:
                        // 1 sources

                        while (true) {
                            aH.b = aH.uz((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ -1075804664), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 643424536)));
                            aH.a = 620152408084198737L << (var7_2 ^ -345549544) >>> (var7_2 ^ -345549544) ^ (long)var6_6 & 0xFFFFFFFFL | (620152408084198737L >>> (var7_2 ^ -345549544) ^ (long)var6_6 & 0xFFFFFFFFL) << (var7_2 ^ -345549544);
                            aH.a = 6.2831855f;
                            aH.a = aH.uz((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ -1075804665), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 1814767354)));
                            return;
                        }
lbl78:
                        // 6 sources

                        block37: while (true) {
                            switch (var7_2) {
                                default: {
                                    continue block37;
                                }
                                case -494646713: {
                                    ** continue;
                                }
                                case -56430772: {
                                    ** continue;
                                }
                                case -709497403: {
                                    ** continue;
                                }
                                case 756259401: {
                                    ** continue;
                                }
                                case 895228901: {
                                    ** continue;
                                }
                                ** case -345549512:
lbl93:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
lbl94:
                        // 1 sources

                        while (true) {
                            var7_2 = var9 ^ -536243930;
                            ** GOTO lbl108
                            break;
                        }
lbl97:
                        // 1 sources

                        var7_2 = var9 ^ 563084875;
                        ** GOTO lbl108
lbl99:
                        // 1 sources

                        var1_4 = var0_3.length / 4;
                        ** continue;
lbl101:
                        // 1 sources

                        var4_8 = 0;
                        ** continue;
lbl103:
                        // 1 sources

                        var7_2 = var9 ^ -1165012941;
                        ** GOTO lbl78
lbl105:
                        // 1 sources

                        while (true) {
                            var7_2 = var9 ^ -868038457;
                            ** GOTO lbl-1000
                            break;
                        }
lbl108:
                        // 3 sources

                        block40: while (true) {
                            switch (var7_2) {
                                default: {
                                    continue block40;
                                }
                                case -1207792814: {
                                    ** continue;
                                }
                                case 2038752319: {
                                    ** continue;
                                }
                                ** case -1804134103:
lbl117:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
lbl118:
                        // 1 sources

                        while (true) {
                            var7_2 = var9 ^ -34557083;
                            ** continue;
                            break;
                        }
                        case -1807101261: {
                            var6_6 ^= var7_2 ^ 125893607;
                            ** continue;
                        }
                        case -1948904453: 
                    }
                    break;
                }
                aH.a = new int[var1_4];
                ** while (true)
            }
            var7_2 = var9 ^ 1834418577;
            ** GOTO lbl78
        }
        var7_2 = var9 ^ 1964539965;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static float uE(float var0) {
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

