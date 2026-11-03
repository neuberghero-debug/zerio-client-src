/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2350
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  net.minecraft.class_638
 */
package z.r;

import java.util.List;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_638;
import z.r.gz;
import z.r.h;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class kC {
    private static final int a;
    public static final int e;
    private static final class_2350[] a;
    public static final int b;
    private static final int c;
    private static final int[] a;
    public static final int d;

    /*
     * Enabled aggressive block sorting
     */
    private kC() {
        int n2 = e & 0x9B23D6EE ^ 0x76DFB4B6;
        int n3 = (n2 | 0x9B23D6EE) ^ 0x4B45FFA5;
        n3 ^= 0xF264F220;
        n3 ^= 0x9A311FCD;
    }

    /*
     * Exception decompiling
     */
    public static int scanChunk(class_638 var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, boolean var6_6, h var7_7) {
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
    public static boolean hasAnchor(class_2818 var0, int var1_1, int var2_2) {
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
     * Enabled aggressive block sorting
     */
    private static void Gt(class_638 var0, class_2338.class_2339 var1_1, List<long[]> var2_2, Set<Long> var3_3, h var4_4, int var5_5, int var6_6, int var7_7, int var8_8, boolean var9_9, boolean var10_10, boolean var11_11, boolean var12_12) {
        var21_13 = 613726434;
        var20_14 = 361164945;
        var17_15 = kC.e & 361164945 ^ 288230280;
        var19_16 = 0;
        var18_20 = (var17_15 | var20_14) ^ -528901085;
        var19_16 = (var17_15 | var20_14) ^ 1574578032;
        if (true) ** GOTO lbl137
        block50: while (true) {
            continue;
lbl10:
            // 1 sources

            while (true) {
                var19_16 = (var17_15 | var20_14) ^ 365286744;
                ** GOTO lbl153
                break;
            }
            var19_16 = (var17_15 | var20_14) ^ -899750917;
            block52: while (true) {
                switch (var19_16) {
                    case -1666060800: {
                        if (!var10_10) ** GOTO lbl82
                        ** GOTO lbl84
                    }
                    case -825239050: {
                        ** GOTO lbl69
                    }
                    case 46078915: {
                        var18_20 ^= var19_16 ^ -1753259769;
                        ** GOTO lbl88
                    }
                    case 913641487: {
                        if (var13_17 != kC.Gv((var18_20 | var19_16 ^ 603185310) ^ (var19_16 ^ 1231195768), (var17_15 | var19_16 ^ 603185310) ^ ((var18_20 | var19_16 ^ 603185310) ^ (var19_16 ^ 31054393)))) ** GOTO lbl84
                        ** GOTO lbl86
                    }
                    case -1161418880: {
                        ** break;
                    }
                    case -777457316: {
                        var4_4.crystal(var5_5, var6_6, var7_7, true);
                        ** GOTO lbl131
                    }
lbl32:
                    // 1 sources

                    var19_16 = (var17_15 | var20_14) ^ -1829783244;
                    continue block52;
                    case -153717906: {
                        var4_4.crystal(var5_5, var6_6, var7_7, false);
                        ** GOTO lbl131
                    }
                    case 1334812209: {
                        var19_16 = (var17_15 | var20_14) ^ -1423772791;
                        continue block52;
                    }
                    case -1545179582: {
                        ** GOTO lbl61
                    }
                    case -1602327153: {
                        if (!var9_9) ** GOTO lbl82
                        ** GOTO lbl114
                    }
                    case 353207122: {
                        ** break;
                    }
                    case -1098119152: {
                        if (var12_12) ** GOTO lbl65
                        ** GOTO lbl82
                    }
                    case 1164284994: {
                        var19_16 = (var17_15 | var20_14) ^ -1125649708;
                        ** GOTO lbl58
                    }
lbl53:
                    // 1 sources

                    var19_16 = (var17_15 | var20_14) ^ 601615254;
                    continue block52;
                    case -1454831283: {
                        if (var14_18 != 0) ** GOTO lbl80
                        var19_16 = (var17_15 | var20_14) ^ 1687944272;
                    }
lbl58:
                    // 6 sources

                    default: {
                        continue block52;
                    }
                    {
                    }
lbl61:
                    // 1 sources

                    var19_16 = (var17_15 | var20_14) ^ -1244621290;
                    continue block52;
                    case -2025766227: {
                        if (var14_18 == kC.Gv((var18_20 | var19_16 ^ -1832406468) ^ (var19_16 ^ -128525093), (var17_15 | var19_16 ^ -1832406468) ^ ((var18_20 | var19_16 ^ -1832406468) ^ (var19_16 ^ -1125562940)))) ** GOTO lbl67
lbl65:
                        // 2 sources

                        var19_16 = (var17_15 | var20_14) ^ -1085668490;
                        continue block52;
lbl67:
                        // 1 sources

                        var19_16 = (var17_15 | var20_14) ^ 1512138152;
                        continue block52;
                    }
lbl69:
                    // 1 sources

                    var19_16 = (var17_15 | var20_14) ^ -478639881;
                    continue block52;
                    case -834896599: {
                        var18_20 ^= var19_16 ^ -619494815;
                        var19_16 = (var17_15 | var20_14) ^ 348003474;
                        continue block52;
                    }
                    case 17884939: {
                        var15_19 = class_2338.method_10064((int)var5_5, (int)var6_6, (int)var7_7);
                        ** continue;
                    }
                    case -1849241524: {
                        if (!var11_11) ** GOTO lbl82
lbl80:
                        // 2 sources

                        var19_16 = (var17_15 | var20_14) ^ -1352082407;
                        ** GOTO lbl58
lbl82:
                        // 4 sources

                        var19_16 = (var17_15 | var20_14) ^ -2313569;
                        continue block52;
                    }
lbl84:
                    // 2 sources

                    var19_16 = (var17_15 | var20_14) ^ 1355509723;
                    continue block52;
lbl86:
                    // 1 sources

                    var19_16 = (var17_15 | var20_14) ^ 1604977158;
                    continue block52;
lbl88:
                    // 1 sources

                    var19_16 = (var17_15 | var20_14) ^ 2101179190;
                    continue block52;
                    case 1899300809: {
                        ** GOTO lbl102
                    }
                    case -1761583104: {
                        var18_20 ^= var19_16 ^ -808033771;
                        var19_16 = (var17_15 | var20_14) ^ -2079015206;
                        continue block52;
                    }
                    case -167131241: {
                        var19_16 = (var17_15 | var20_14) ^ -1006236987;
                        continue block52;
                    }
                    case -361608954: {
                        var18_20 ^= var19_16 ^ -626413838;
                        continue block50;
                    }
lbl102:
                    // 1 sources

                    var19_16 = (var17_15 | var20_14) ^ -2073547819;
                    continue block52;
                    case -1427834641: {
                        var18_20 ^= var19_16 ^ 1035750518;
                        ** GOTO lbl110
                    }
                    case 1241840031: {
                        var19_16 = (var17_15 | var20_14) ^ -1994451559;
                        continue block52;
                    }
lbl110:
                    // 1 sources

                    var19_16 = (var17_15 | var20_14) ^ 99973687;
                    continue block52;
                    case 1754499247: {
                        if (var13_17 == 0) ** GOTO lbl116
lbl114:
                        // 2 sources

                        var19_16 = (var17_15 | var20_14) ^ 10713291;
                        ** GOTO lbl58
lbl116:
                        // 1 sources

                        var19_16 = (var17_15 | var20_14) ^ -1236757029;
                        continue block52;
                    }
                    case 274432430: {
                        switch (kC.classify(var0, var1_1, var5_5, var6_6, var7_7, var8_8).ordinal()) {
                            default: {
                                break;
                            }
                            case 3: {
                                var19_16 = (var17_15 | var20_14) ^ -611154256;
                                continue block52;
                            }
                            case 2: {
                                var19_16 = (var17_15 | var20_14) ^ -614391185;
                                continue block52;
                            }
                            case 1: {
                                var19_16 = (var17_15 | var20_14) ^ -475579378;
                                continue block52;
                            }
                        }
lbl131:
                        // 4 sources

                        while (true) {
                            var19_16 = (var17_15 | var20_14) ^ -2102486119;
                            ** GOTO lbl58
                            break;
                        }
                    }
lbl134:
                    // 3 sources

                    while (true) {
                        var19_16 = (var17_15 | var20_14) ^ -1808869462;
                        ** GOTO lbl153
                        break;
                    }
lbl137:
                    // 1 sources

                    block56: while (true) {
                        switch (var19_16) {
                            default: {
                                continue block56;
                            }
                            case 823281779: {
                                var13_17 = var5_5 & kC.Gv((var18_20 | var19_16 ^ var21_13) ^ (var19_16 ^ -834282430), (var17_15 | var19_16 ^ var21_13) ^ ((var18_20 | var19_16 ^ var21_13) ^ (var19_16 ^ 1115720699)));
                                var14_18 = var7_7 & kC.Gv((var18_20 | var19_16 ^ var21_13) ^ (var19_16 ^ -834282429), (var17_15 | var19_16 ^ var21_13) ^ ((var18_20 | var19_16 ^ var21_13) ^ (var19_16 ^ -722765390)));
                                var19_16 = (var17_15 | var20_14) ^ 387047514;
                                continue block52;
                            }
                            case 576746024: {
                                var18_20 ^= var19_16 ^ 214489616;
                                var19_16 = (var17_15 | var20_14) ^ 616346602;
                                continue block56;
                            }
                            case 1215618281: 
                        }
                        var19_16 = (var17_15 | var20_14) ^ 936282545;
                    }
lbl153:
                    // 2 sources

                    block57: while (true) {
                        switch (var19_16) {
                            default: {
                                continue block57;
                            }
                            case -2122306509: {
                                var18_20 ^= var19_16 ^ -1215736411;
                                var19_16 = (var17_15 | var20_14) ^ 1341312472;
                                continue block57;
                            }
                            case 169542966: {
                                var19_16 = (var17_15 | var20_14) ^ 807381068;
                                continue block57;
                            }
                            case 632378325: {
                                var2_2.add(new long[]{var15_19, var8_8});
                                ** GOTO lbl134
                            }
                            case 1515992641: {
                                ** continue;
                            }
                            case 1251967710: {
                                if (var2_2.size() >= kC.Gv((var18_20 | var19_16 ^ 1595503183) ^ (var19_16 ^ -1780936263), (var17_15 | var19_16 ^ 1595503183) ^ ((var18_20 | var19_16 ^ 1595503183) ^ (var19_16 ^ -1604935832)))) ** GOTO lbl134
                                var19_16 = (var17_15 | var20_14) ^ 505399694;
                                continue block57;
                            }
                            case 7024321: {
                                var18_20 ^= var19_16 ^ 592275487;
                                var19_16 = (var17_15 | var20_14) ^ 1597077831;
                                continue block57;
                            }
                            case 196162071: {
                                var19_16 = (var17_15 | var20_14) ^ -239049518;
                                continue block57;
                            }
                            case -462512309: 
                        }
                        if (var3_3.add(var15_19)) ** break;
                        ** continue;
                        var19_16 = (var17_15 | var20_14) ^ 532020911;
                    }
                    case -1850063549: {
                        return;
                    }
                    case -537913246: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static boolean Gu(class_638 var0, int var1_1, int var2_2) {
        var6_3 = -1574850452;
        var3_4 = kC.e & -1574850452 ^ 43088402;
        var5_5 = 0;
        if (true) ** GOTO lbl45
        block9: while (true) {
            var5_5 = (var3_4 | var6_3) ^ -998255581;
lbl7:
            // 2 sources

            block10: while (true) {
                switch (var5_5) lbl-1000:
                // 6 sources

                {
                    default: {
                        continue block10;
                    }
                    case 930336824: {
                        var4_6 ^= var5_5 ^ -1901118140;
                        continue block9;
                    }
lbl14:
                    // 2 sources

                    while (true) {
                        var4_6 ^= 743102215;
                        ** GOTO lbl28
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ -99473254;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -1741063632: {
                        v0 = true;
                        ** GOTO lbl14
                    }
                    case 1487131364: {
                        break block9;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ 982024270;
                        ** GOTO lbl-1000
                        break;
                    }
lbl28:
                    // 1 sources

                    return v0;
                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ -1782437306;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 1724788317: {
                        v0 = false;
                        ** continue;
                    }
lbl35:
                    // 1 sources

                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ 1068609802;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -1660925068: {
                        if (var0.method_2935().method_12126(var1_1, var2_2, false) == null) ** continue;
                        var5_5 = (var3_4 | var6_3) ^ 2023490716;
                        ** GOTO lbl-1000
                    }
                    case -634519838: {
                        var4_6 ^= var5_5 ^ 1676743582;
                        ** continue;
                    }
lbl45:
                    // 1 sources

                    var4_6 = (var3_4 | var6_3) ^ 1986047810;
                    ** continue;
                }
                break;
            }
            break;
        }
        var5_5 = (var3_4 | var6_3) ^ 321878376;
        ** while (true)
        {
            ** case -1315011818:
        }
lbl50:
        // 1 sources

        var4_6 ^= var5_5 ^ 792361788;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static gz classify(class_638 var0, class_2338.class_2339 var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
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
    public static Set<Long> deduceCrystals(class_638 var0, List<long[]> var1_1, Set<Long> var2_2, int var3_3, boolean var4_4, Set<Long> var5_5) {
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

    private static int Gv(int n2, int n3) {
        int n4 = -30647146;
        int n5 = 532556916;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xDF161758)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xFFBE656D;
        n6 += (n5 | n4) ^ 0xFFBED711;
        n6 ^= (n5 | n4) ^ 0xFFBEF093;
        n6 += (n5 | n4) ^ 0xFFBEFD0E;
        n6 += (n5 | n4) ^ 0xFFBEFEBD;
        n6 += (n5 | n4) ^ 0xFFBE5B15;
        n6 += (n5 | n4) ^ 0xFFBE6FEF;
        n6 += (n5 | n4) ^ 0xFFBE7EEE;
        n6 -= (n5 | n4) ^ 0xFFBE06E2;
        return n6 += (n5 | n4) ^ 0xFFBE2922;
    }

    /*
     * Exception decompiling
     */
    public static boolean isLocalMax(class_638 var0, class_2338.class_2339 var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
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
    public static boolean foreignLit(class_638 var0, class_2338.class_2339 var1_1, int var2_2, int var3_3, int var4_4) {
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
    static {
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
    public static boolean anchorAdjacent(class_638 var0, class_2338.class_2339 var1_1, int var2_2, int var3_3, int var4_4) {
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
     * Enabled aggressive block sorting
     */
    public static boolean isAnchorBlock(class_2680 var0) {
        var4_1 = 728573125;
        var1_2 = kC.e & 728573125 ^ -2138796201;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -1090546614;
        var3_3 = (var1_2 | var4_1) ^ 1306198860;
        if (true) ** GOTO lbl12
        block11: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1070791027;
            if (true) ** GOTO lbl12
            block12: while (true) {
                var3_3 = (var1_2 | var4_1) ^ 696231733;
lbl12:
                // 3 sources

                block13: while (true) {
                    switch (var3_3) {
                        case 605076623: {
                            var2_4 ^= var3_3 ^ 412913642;
                            var3_3 = (var1_2 | var4_1) ^ -1988923999;
                            continue block13;
                        }
                        case 580829814: {
                            if (!var0.method_27852(class_2246.field_27159)) {
                                var3_3 = (var1_2 | var4_1) ^ 348025554;
                                continue block13;
                            }
                            ** GOTO lbl45
                        }
                        case -2104358686: {
                            v0 = false;
                            ** GOTO lbl41
                        }
                        case -1085022971: {
                            var3_3 = (var1_2 | var4_1) ^ -1806758221;
                            continue block13;
                        }
                        case 1807788378: {
                            var2_4 ^= var3_3 ^ -1498717406;
                            continue block12;
                        }
                        case 590975984: {
                            var2_4 ^= var3_3 ^ -296593016;
                            var3_3 = (var1_2 | var4_1) ^ 1718798708;
                            break;
                        }
                        case -432624485: {
                            var3_3 = (var1_2 | var4_1) ^ -1879239848;
                            break;
                        }
                        case -845191517: {
                            v0 = true;
lbl41:
                            // 2 sources

                            var2_4 ^= -541206078;
                            return v0;
                        }
                        case 1067622756: {
                            if (!var0.method_27852(class_2246.field_27160)) continue block11;
lbl45:
                            // 2 sources

                            var3_3 = (var1_2 | var4_1) ^ -1999356889;
                        }
                    }
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static boolean isGeodeBody(class_2680 var0) {
        block73: {
            block64: {
                block71: {
                    block67: {
                        block68: {
                            block65: {
                                block72: {
                                    block69: {
                                        block70: {
                                            block66: {
                                                block59: {
                                                    block63: {
                                                        block61: {
                                                            block62: {
                                                                block60: {
                                                                    break block65;
lbl1:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_3 = (var1_2 | var4_1) ^ 221736562;
                                                                        ** GOTO lbl46
lbl4:
                                                                        // 1 sources

                                                                        while (!var0.method_27852(class_2246.field_27163)) {
                                                                            break block59;
                                                                        }
                                                                        ** GOTO lbl64
lbl7:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_3 = (var1_2 | var4_1) ^ 959993887;
                                                                            ** GOTO lbl46
lbl10:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var2_4 ^= var3_3 ^ -184980535;
                                                                                break block60;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
lbl13:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_3 = (var1_2 | var4_1) ^ -907884744;
                                                                        ** GOTO lbl46
lbl16:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_3 = (var1_2 | var4_1) ^ 1824055267;
                                                                            ** GOTO lbl46
                                                                            break;
                                                                        }
lbl19:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_3 = (var1_2 | var4_1) ^ 568308950;
                                                                            ** GOTO lbl46
                                                                            break;
                                                                        }
lbl22:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var2_4 ^= var3_3 ^ 2033218832;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                var3_3 = (var1_2 | var4_1) ^ 1747920268;
                                                                ** GOTO lbl46
lbl28:
                                                                // 1 sources

                                                                while (true) {
                                                                    var2_4 ^= 743258051;
                                                                    break block61;
lbl31:
                                                                    // 1 sources

                                                                    while (!var0.method_27852(class_2246.field_27159)) {
                                                                        ** continue;
lbl33:
                                                                        // 1 sources

                                                                        ** GOTO lbl19
                                                                    }
                                                                    ** GOTO lbl64
lbl35:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var2_4 ^= -1174273153;
                                                                        ** GOTO lbl4
                                                                        break;
                                                                    }
lbl38:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var2_4 ^= -949855810;
                                                                        ** GOTO lbl67
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl41:
                                                                // 1 sources

                                                                while (true) {
                                                                    var3_3 = (var1_2 | var4_1) ^ -661047820;
                                                                    ** GOTO lbl46
                                                                    break;
                                                                }
lbl44:
                                                                // 1 sources

                                                                block45: while (true) {
                                                                    var3_3 = (var1_2 | var4_1) ^ -1523734525;
lbl46:
                                                                    // 24 sources

                                                                    block46: while (true) {
                                                                        switch (var3_3) lbl-1000:
                                                                        // 3 sources

                                                                        {
                                                                            default: {
                                                                                continue block46;
                                                                            }
                                                                            case 817149248: {
                                                                                break block45;
                                                                            }
                                                                            case 1691764053: {
                                                                                ** continue;
                                                                            }
                                                                            case 63935133: {
                                                                                break;
                                                                            }
                                                                            case -961897952: {
                                                                                break block62;
                                                                            }
                                                                            case -1020103057: {
                                                                                ** continue;
                                                                            }
                                                                            case -590358328: {
                                                                                ** GOTO lbl31
                                                                            }
                                                                            case 1023947136: {
                                                                                break block63;
                                                                            }
lbl64:
                                                                            // 8 sources

                                                                            while (true) {
                                                                                var3_3 = (var1_2 | var4_1) ^ -2049472788;
                                                                                ** GOTO lbl-1000
                                                                                break;
                                                                            }
lbl67:
                                                                            // 1 sources

                                                                            if (var0.method_27852(class_2246.field_27162)) ** GOTO lbl64
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl69:
                                                                // 2 sources

                                                                while (true) {
                                                                    var3_3 = (var1_2 | var4_1) ^ -753926830;
                                                                    ** GOTO lbl46
                                                                    break;
                                                                }
                                                                {
                                                                    case -1205832727: {
                                                                        var2_4 ^= var3_3 ^ -1804778454;
                                                                        break;
                                                                    }
                                                                }
lbl75:
                                                                // 1 sources

                                                                return v0;
lbl77:
                                                                // 1 sources

                                                                while (true) {
                                                                    var3_3 = (var1_2 | var4_1) ^ 2126204712;
                                                                    ** GOTO lbl46
                                                                    break;
                                                                }
                                                            }
                                                            var3_3 = (var1_2 | var4_1) ^ 1160781815;
                                                            ** GOTO lbl46
                                                        }
                                                        if (var0.method_27852(class_2246.field_27160)) ** GOTO lbl64
                                                        ** while (true)
                                                    }
                                                    var2_4 ^= -126991803;
                                                    break block66;
                                                    {
                                                        case 1332570005: {
                                                            ** continue;
                                                        }
                                                    }
                                                    var2_4 ^= -838767344;
                                                    break block67;
                                                    {
                                                        case -678265940: {
                                                            var2_4 ^= var3_3 ^ 284172818;
                                                            var3_3 = (var1_2 | var4_1) ^ -695033686;
                                                            ** GOTO lbl-1000
                                                        }
                                                    }
lbl97:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_3 = (var1_2 | var4_1) ^ 866441640;
                                                        ** GOTO lbl46
                                                        break;
                                                    }
                                                    {
                                                        case 1020423996: {
                                                            var2_4 ^= var3_3 ^ -221052372;
                                                            break;
                                                        }
                                                        case 1344077831: {
                                                            var2_4 ^= var3_3 ^ 170161509;
                                                            ** continue;
                                                        }
                                                        case -414939113: {
                                                            break;
                                                        }
                                                    }
                                                    var3_3 = (var1_2 | var4_1) ^ 1523429712;
                                                    ** GOTO lbl46
                                                    {
                                                        case 472400339: {
                                                            var2_4 ^= var3_3 ^ -1945669809;
                                                            ** continue;
                                                        }
                                                        case -179889956: {
                                                            ** continue;
                                                        }
                                                    }
                                                }
                                                var3_3 = (var1_2 | var4_1) ^ 1526507163;
                                                ** GOTO lbl46
                                                {
                                                    case 63737287: {
                                                        ** continue;
                                                    }
                                                }
lbl120:
                                                // 1 sources

                                                while (true) {
                                                    var3_3 = (var1_2 | var4_1) ^ 870321150;
                                                    ** GOTO lbl46
                                                    break;
                                                }
lbl123:
                                                // 1 sources

                                                while (true) {
                                                    var3_3 = (var1_2 | var4_1) ^ -863031940;
                                                    ** GOTO lbl46
                                                    break;
                                                }
                                                {
                                                    case 1714965344: {
                                                        var2_4 ^= var3_3 ^ -1638528731;
                                                        break block68;
                                                    }
                                                    case -1436868969: {
                                                        v0 = true;
                                                        break block69;
                                                    }
                                                }
                                                var2_4 ^= 1370934565;
                                                break block70;
lbl134:
                                                // 1 sources

                                                while (true) {
                                                    var3_3 = (var1_2 | var4_1) ^ -1454673281;
                                                    ** GOTO lbl46
                                                    break;
                                                }
                                                {
                                                    case -1597530336: {
                                                        break block71;
                                                    }
                                                    case -1440756543: {
                                                        var2_4 ^= var3_3 ^ -1759771002;
                                                        ** continue;
                                                    }
                                                }
lbl142:
                                                // 2 sources

                                                while (true) {
                                                    var3_3 = (var1_2 | var4_1) ^ 1599429919;
                                                    ** GOTO lbl46
                                                    break;
                                                }
                                            }
                                            if (var0.method_27852(class_2246.field_27161)) ** GOTO lbl64
                                            break block72;
lbl148:
                                            // 1 sources

                                            while (true) {
                                                if (var0.method_27852(class_2246.field_29032)) ** GOTO lbl64
                                                break block64;
                                                break;
                                            }
                                            {
                                                case -1798788787: {
                                                    var2_4 ^= var3_3 ^ 1041647528;
                                                    break;
                                                }
                                            }
                                            var3_3 = (var1_2 | var4_1) ^ -1708108382;
                                            ** GOTO lbl46
                                            {
                                                case 1257257581: {
                                                    switch (var2_4) {
                                                        case 1450666267: {
                                                            ** continue;
                                                        }
                                                        case 2002428779: {
                                                            ** continue;
                                                        }
                                                        ** default:
lbl163:
                                                        // 1 sources

                                                        ** continue;
                                                    }
                                                }
                                                case 1097265867: {
                                                    ** continue;
                                                }
                                            }
                                            var3_3 = (var1_2 | var4_1) ^ -1707914504;
                                            ** GOTO lbl46
                                            {
                                                case 1433463363: {
                                                    var2_4 ^= var3_3 ^ -1160290188;
                                                    ** continue;
                                                }
                                            }
                                        }
                                        if (!var0.method_27852(class_2246.field_27164)) break block73;
                                        ** GOTO lbl64
                                    }
lbl175:
                                    // 2 sources

                                    while (true) {
                                        var2_4 ^= -418750526;
                                        ** continue;
                                        break;
                                    }
                                    {
                                        case -1023188572: {
                                            var2_4 ^= var3_3 ^ -1833587583;
                                            ** continue;
                                        }
                                        ** case -237968717:
                                    }
lbl182:
                                    // 1 sources

                                    v0 = false;
                                    ** while (true)
                                }
                                var3_3 = (var1_2 | var4_1) ^ 1315814547;
                                ** GOTO lbl46
                            }
                            var4_1 = -1731099081;
                            var1_2 = kC.e & -1731099081 ^ -1988147960;
                            var3_3 = 0;
                            var2_4 = (var1_2 | var4_1) ^ -813126108;
                            ** while (true)
                        }
                        var3_3 = (var1_2 | var4_1) ^ -1527253313;
                        ** GOTO lbl46
                    }
                    if (!var0.method_27852(class_2246.field_27114)) ** break;
                    ** while (true)
                    ** while (true)
                }
                var2_4 ^= 1023658567;
                ** while (true)
            }
            var3_3 = (var1_2 | var4_1) ^ -3699617;
            ** GOTO lbl46
        }
        var3_3 = (var1_2 | var4_1) ^ -47611286;
        ** while (true)
    }
}

