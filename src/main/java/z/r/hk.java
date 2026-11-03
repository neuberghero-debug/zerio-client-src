/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.net.http.HttpHeaders;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class hk {
    private static final String[] a;
    private static final Object[] a;
    public static final int a;
    private static volatile long a;
    private static volatile boolean a;
    private static final long b;

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
     * Enabled aggressive block sorting
     */
    private hk() {
        int n2 = a & 0x8CF13DF5 ^ 0x5DA46F3A;
        int n3 = (n2 | 0x8CF13DF5) ^ 0xA332CABB;
        n3 ^= 0x560778FD;
        n3 ^= 0x70F45A3F;
    }

    /*
     * Enabled aggressive block sorting
     */
    static long nowMillis() {
        int n2 = a & 0xF6D84516 ^ 0x25E0685A;
        int n3 = 0;
        int n4 = (n2 | 0xF6D84516) ^ 0x540F5428;
        n3 = (n2 | 0xF6D84516) ^ 0x707A9103;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 502336878: {
                    n4 ^= n3 ^ 0xAA33412E;
                    n3 = (n2 | 0xF6D84516) ^ 0x328866F4;
                    continue block5;
                }
                case -2021458851: {
                    break;
                }
                case -982512726: {
                    return System.currentTimeMillis() + a;
                }
            }
            n3 = (n2 | 0xF6D84516) ^ 0xEA096030;
        }
    }

    /*
     * Unable to fully structure code
     */
    static long nowSeconds() {
        block10: {
            break block10;
lbl1:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0 = hk.a & 143303853 ^ -1406262483;
        var2_1 = 0;
        var1_2 = (var0 | 143303853) ^ -1385249117;
        ** GOTO lbl19
lbl8:
        // 1 sources

        while (true) {
            var1_2 ^= var2_1 ^ -1261464257;
            ** continue;
            break;
        }
        var2_1 = (var0 | 143303853) ^ 263134005;
        block7: while (true) {
            switch (var2_1) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block7;
                    }
                    break;
                }
                case -625076286: {
                    ** continue;
                }
lbl19:
                // 1 sources

                var2_1 = (var0 | 143303853) ^ 1453548762;
                ** GOTO lbl-1000
lbl21:
                // 1 sources

                while (true) {
                    var2_1 = (var0 | 143303853) ^ 1980805231;
                    ** continue;
                    break;
                }
                case -1560167272: {
                    return hk.nowMillis() / (8048464643778273307L << (var2_1 ^ -1560167240) >>> (var2_1 ^ -1560167240) ^ (long)var1_2 & 0xFFFFFFFFL | (8048464643778273307L >>> (var2_1 ^ -1560167240) ^ (long)var1_2 & 0xFFFFFFFFL) << (var2_1 ^ -1560167240));
                }
                case -99761289: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    static long offsetMillis() {
        block10: {
            break block10;
lbl1:
            // 1 sources

            while (true) {
                continue;
lbl3:
                // 1 sources

                while (true) {
                    var1_2 ^= var2_1 ^ -128876560;
                    ** GOTO lbl17
                    break;
                }
                var2_1 = (var0 | -681100829) ^ 1718482658;
                block7: while (true) {
                    switch (var2_1) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block7;
                            }
                            break;
                        }
                        case -1316843747: {
                            ** continue;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var2_1 = (var0 | -681100829) ^ 1870284915;
                            ** GOTO lbl-1000
                            break;
                        }
lbl17:
                        // 1 sources

                        var2_1 = (var0 | -681100829) ^ 1862811776;
                        ** continue;
                        case -1192806017: {
                            return hk.a;
                        }
                        case -1198182004: 
                    }
                    break;
                }
                break;
            }
            ** while (true)
        }
        var0 = hk.a & -681100829 ^ 1135497629;
        var2_1 = 0;
        var1_2 = (var0 | -681100829) ^ -1063808518;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean synced() {
        int n2 = a & 0xF7245DF1 ^ 0x60748546;
        int n3 = 0;
        int n4 = (n2 | 0xF7245DF1) ^ 0xB0CA7E60;
        n3 = (n2 | 0xF7245DF1) ^ 0x4F18F95C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1200872277: {
                    n3 = (n2 | 0xF7245DF1) ^ 0x61B7D333;
                    continue block5;
                }
                case 1610021345: {
                    return a;
                }
                case -1765601596: 
            }
            n4 ^= n3 ^ 0x3852B804;
            n3 = (n2 | 0xF7245DF1) ^ 0xA8822416;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static void observe(HttpHeaders var0) {
        var4_1 = 206752726;
        var1_2 = hk.a & 206752726 ^ -2070558683;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 658552169;
        var3_3 = (var1_2 | var4_1) ^ -277108953;
        block11: while (true) {
            block13: {
                switch (var3_3) {
                    default: {
                        continue block11;
                    }
                    case -1373032770: {
                        return;
                    }
                    case -1740109218: {
                        var0.firstValue(hk.a((var2_4 | var3_3 ^ -1810185848) ^ (var3_3 ^ 665476092), (var1_2 | var3_3 ^ -1810185848) ^ ((var2_4 | var3_3 ^ -1810185848) ^ (var3_3 ^ 1231100502)))).ifPresent((Consumer<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, observe(java.lang.String ), (Ljava/lang/String;)V)());
                        var3_3 = (var1_2 | var4_1) ^ -171762124;
                        continue block11;
                    }
                    case 1536992122: {
                        var2_4 ^= var3_3 ^ 882806114;
                        var3_3 = (var1_2 | var4_1) ^ 996151463;
                        continue block11;
                    }
                    case -2078245563: {
                        var2_4 ^= var3_3 ^ 1213884055;
                        var3_3 = (var1_2 | var4_1) ^ 346014121;
                        continue block11;
                    }
                    case -1074230285: {
                        var2_4 ^= var3_3 ^ -1403257534;
                        var3_3 = (var1_2 | var4_1) ^ 734158199;
                        continue block11;
                    }
                    case 1672244432: {
                        break;
                    }
                    case 2031408579: {
                        var2_4 ^= var3_3 ^ 1113063839;
                        var3_3 = (var1_2 | var4_1) ^ 587130185;
                        continue block11;
                    }
                    case -1212687536: {
                        return;
                    }
                    case -1491757440: {
                        if (var0 == null) {
                            ** break;
lbl39:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -682923891;
                            continue block11;
                        }
                        break block13;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 858734596;
                continue;
            }
            var3_3 = (var1_2 | var4_1) ^ 150451890;
        }
    }

    /*
     * Exception decompiling
     */
    private static String a(int var0, int var1_1) {
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
    static void observe(String var0) {
        block58: {
            block56: {
                block57: {
                    var8_1 = 1911236788;
                    var5_2 = hk.a & 1911236788 ^ 1865290795;
                    var7_3 = 0;
                    var6_4 = (var5_2 | var8_1) ^ 79591252;
                    var7_3 = (var5_2 | var8_1) ^ 2043436102;
                    break block56;
lbl7:
                    // 1 sources

                    while (true) {
                        var7_3 = (var5_2 | var8_1) ^ 1660080167;
                        break block56;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var6_4 ^= var7_3 ^ -1348526011;
                        var7_3 = (var5_2 | var8_1) ^ 727779877;
                        break block56;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        if (var0 == null) ** GOTO lbl23
                        var7_3 = (var5_2 | var8_1) ^ 1732799338;
                        break block56;
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var7_3 = (var5_2 | var8_1) ^ -5618626;
                        break block56;
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        if (!var0.isBlank()) break block57;
lbl23:
                        // 2 sources

                        var7_3 = (var5_2 | var8_1) ^ 462412115;
                        break block56;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var6_4 ^= var7_3 ^ 1387327304;
                        var7_3 = (var5_2 | var8_1) ^ 67791281;
                        break block56;
                        break;
                    }
lbl29:
                    // 1 sources

                    return;
                }
                try {
                    block59: {
                        var7_3 = (var5_2 | var8_1) ^ 215250696;
                        break block56;
lbl35:
                        // 1 sources

                        while (true) {
                            var6_4 ^= var7_3 ^ 302785275;
                            var7_3 = (var5_2 | var8_1) ^ -1209722459;
                            break block56;
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var6_4 ^= 1280152712;
                            var1_5 = ZonedDateTime.parse(var0.trim(), DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
                            var6_4 ^= -1547680643;
                            var3_7 = var1_5 - System.currentTimeMillis();
                            var7_3 = (var5_2 | var8_1) ^ -1277222129;
                            break block58;
                            break;
                        }
lbl46:
                        // 1 sources

                        while (true) {
                            var6_4 ^= var7_3 ^ 118636007;
                            var7_3 = (var5_2 | var8_1) ^ 1043882214;
                            break block58;
                            break;
                        }
lbl50:
                        // 1 sources

                        while (true) {
                            if (Math.abs(var3_7) > (-8337538872281881384L << (var7_3 ^ 1104632953) >>> (var7_3 ^ 1104632953) ^ (long)var6_4 & 0xFFFFFFFFL | (-8337538872281881384L >>> (var7_3 ^ 1104632953) ^ (long)var6_4 & 0xFFFFFFFFL) << (var7_3 ^ 1104632953))) ** GOTO lbl95
                            var7_3 = (var5_2 | var8_1) ^ 131253554;
                            break block58;
                            break;
                        }
lbl55:
                        // 1 sources

                        while (true) {
                            var6_4 ^= var7_3 ^ -302615119;
                            var7_3 = (var5_2 | var8_1) ^ 346076261;
                            break block58;
                            break;
                        }
lbl59:
                        // 1 sources

                        while (true) {
                            hk.a = var3_7;
                            var7_3 = (var5_2 | var8_1) ^ -2119351939;
                            break block58;
                            break;
                        }
lbl63:
                        // 2 sources

                        while (true) {
                            var7_3 = (var5_2 | var8_1) ^ -1469391551;
                            break block58;
                            break;
                        }
lbl66:
                        // 1 sources

                        block46: while (true) {
                            switch (var6_4) {
                                case 427856100: {
                                    var7_3 = (var5_2 | var8_1) ^ 830405866;
                                    break block46;
                                }
lbl71:
                                // 1 sources

                                while (true) {
                                    var6_4 ^= var7_3 ^ -614839191;
                                    break block59;
                                    break;
                                }
                                case -56068939: {
                                    var7_3 = (var5_2 | var8_1) ^ -386052230;
                                    break block46;
                                }
lbl77:
                                // 1 sources

                                while (true) {
                                    var6_4 ^= var7_3 ^ 1101131110;
                                    break block59;
                                    break;
                                }
                                default: {
                                    var7_3 = (var5_2 | var8_1) ^ -1144086824;
                                    break block46;
                                }
                            }
                            break;
                        }
                        break block58;
lbl84:
                        // 1 sources

                        while (true) {
                            var6_4 ^= var7_3 ^ -280818361;
                            ** GOTO lbl63
                            break;
                        }
                    }
                    var7_3 = (var5_2 | var8_1) ^ 2089357267;
                    break block58;
lbl90:
                    // 1 sources

                    while (true) {
                        var7_3 = (var5_2 | var8_1) ^ -1529562804;
                        break block58;
                        break;
                    }
lbl93:
                    // 1 sources

                    while (true) {
                        hk.a = true;
lbl95:
                        // 2 sources

                        var6_4 ^= -1289327839;
                        break;
                    }
                }
                catch (Exception v0) {
                    var6_4 = (var5_2 | var8_1) ^ 1082280774;
                    var1_6 = v0;
                }
                var7_3 = (var5_2 | var8_1) ^ -1976713270;
                break block56;
lbl102:
                // 1 sources

                while (true) {
                    var6_4 ^= var7_3 ^ -1059901428;
                    var7_3 = (var5_2 | var8_1) ^ 1083745373;
                    break block56;
                    break;
                }
lbl106:
                // 1 sources

                return;
            }
            block54: while (true) {
                switch (var7_3) {
                    default: {
                        continue block54;
                    }
                    case 102981881: {
                        ** continue;
                    }
                    case 488500376: {
                        ** continue;
                    }
                    case 1418606234: {
                        ** continue;
                    }
                    case 413620181: {
                        ** continue;
                    }
                    case -2142930815: {
                        ** continue;
                    }
                    case 1684071916: {
                        ** continue;
                    }
                    case 2078627086: {
                        ** continue;
                    }
                    {
                        case 1933265847: {
                            ** continue;
                        }
                        case -938859238: {
                            ** continue;
                        }
                    }
                    case -171801739: {
                        ** continue;
                    }
                    ** case 1064802530:
lbl134:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        block55: while (true) {
            switch (var7_3) {
                default: {
                    continue block55;
                }
                {
                    case -869261392: {
                        ** continue;
                    }
                    case 1104632921: {
                        ** continue;
                    }
                    case 2017327501: {
                        ** continue;
                    }
                    case 1800374490: {
                        ** continue;
                    }
                    case -29196862: {
                        ** continue;
                    }
                    case -679091714: {
                        ** continue;
                    }
                    case 1318174805: {
                        ** continue;
                    }
                    case -1760398395: {
                        ** continue;
                    }
                    case -1004428697: {
                        ** continue;
                    }
                    case 0x366336C: {
                        ** continue;
                    }
                    ** case -616856077:
lbl161:
                    // 1 sources

                    ** continue;
                }
            }
            break;
        }
    }
}

