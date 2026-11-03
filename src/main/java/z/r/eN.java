/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.cV;
import z.r.gF;
import z.r.mm;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class eN {
    private static final cV[] a;
    private static int a;
    private static float a;
    private static boolean a;
    private static final long a;
    private static final List<mm> a;
    private static int b;
    public static final int c;
    private static long b;
    private static final float b;
    private static final Map<String, mm> a;
    private static float c;
    private static float d;
    private static final long c;
    private static final Comparator<mm> a;
    private static long d;
    private static final float e;
    private static float f;

    /*
     * Enabled aggressive block sorting
     */
    private eN() {
        int n2 = c & 0x8FF3FFBE ^ 0x6018F5A4;
        int n3 = (n2 | 0x8FF3FFBE) ^ 0x31AD16D4;
        n3 ^= 0x27DE3601;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean isEnabled() {
        int n2 = c & 0x3043E905 ^ 0x40CBBCE;
        int n3 = 0;
        int n4 = (n2 | 0x3043E905) ^ 0x900EBE76;
        n3 = (n2 | 0x3043E905) ^ 0x914482FE;
        block5: while (true) {
            switch (n3) {
                case -1525974735: {
                    break;
                }
                case 985902914: {
                    return a;
                }
                case -1143161437: {
                    n4 ^= n3 ^ 0x10E028E3;
                    n3 = (n2 | 0x3043E905) ^ 0xE8C548D;
                }
                default: {
                    continue block5;
                }
            }
            n3 = (n2 | 0x3043E905) ^ 0x8F93466C;
        }
    }

    /*
     * Exception decompiling
     */
    public static void setEnabled(boolean var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [23[UNCONDITIONALDOLOOP]], but top level block is 36[SIMPLE_IF_TAKEN]
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void setWindowSeconds(float var0) {
        var7_1 = -271089883;
        var6_2 = -1602120864;
        var3_3 = eN.c & -271089883 ^ 1050613874;
        var5_4 = 0;
        var4_5 = (var3_3 | var7_1) ^ -1220497576;
        var5_4 = (var3_3 | var7_1) ^ 1289186861;
        ** GOTO lbl32
lbl8:
        // 1 sources

        while (true) {
            var5_4 = (var3_3 | var7_1) ^ 1071385031;
            if (true) ** GOTO lbl13
            break;
        }
        block12: while (true) {
            var5_4 = (var3_3 | var7_1) ^ 1199790530;
lbl13:
            // 2 sources

            block13: while (true) {
                switch (var5_4) {
                    default: {
                        continue block13;
                    }
                    case -1602120896: {
                        eN.b = Math.max(-5095422864724600474L << (var5_4 ^ var6_2) >>> (var5_4 ^ var6_2) ^ (long)var4_5 & 0xFFFFFFFFL | (-5095422864724600474L >>> (var5_4 ^ var6_2) ^ (long)var4_5 & 0xFFFFFFFFL) << (var5_4 ^ var6_2), Math.min(-5095422861040117274L << (var5_4 ^ var6_2) >>> (var5_4 ^ var6_2) ^ (long)var4_5 & 0xFFFFFFFFL | (-5095422861040117274L >>> (var5_4 ^ var6_2) ^ (long)var4_5 & 0xFFFFFFFFL) << (var5_4 ^ var6_2), var1_6));
                        var5_4 = (var3_3 | var7_1) ^ -908504971;
                        continue block13;
                    }
                    case 906374914: {
                        var4_5 ^= var5_4 ^ 1255986045;
                        ** continue;
                    }
                    case -1201920331: {
                        var4_5 ^= var5_4 ^ -1833566358;
                        var5_4 = (var3_3 | var7_1) ^ 1600056375;
                        continue block13;
                    }
                    case -1073514832: {
                        return;
                    }
lbl32:
                    // 1 sources

                    block14: while (true) {
                        switch (var5_4) {
                            case 793615694: {
                                var1_6 = (long)(var0 * 1.0E9f);
                                continue block12;
                            }
                            case 89743843: {
                                var4_5 ^= var5_4 ^ -563739659;
                                break;
                            }
                            case -1291316902: {
                                ** break;
lbl42:
                                // 1 sources

                                var5_4 = (var3_3 | var7_1) ^ -91873644;
                            }
                            default: {
                                continue block14;
                            }
                        }
                        var5_4 = (var3_3 | var7_1) ^ -795680199;
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
    private static void hL() {
        block48: {
            var3 = 1967253851;
            var0_1 = eN.c & 1967253851 ^ 596977114;
            var2_2 = 0;
            var1_3 = (var0_1 | var3) ^ 944621660;
            ** GOTO lbl110
lbl6:
            // 1 sources

            while (true) {
                eN.a.clear();
                ** GOTO lbl102
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var2_2 = (var0_1 | var3) ^ 1696777570;
                ** GOTO lbl69
lbl12:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ -1631466653;
                    ** GOTO lbl69
                    break;
                }
lbl17:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ 1591886062;
                    ** GOTO lbl69
                    break;
                }
lbl20:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ -227439886;
                    break block48;
                    break;
                }
lbl23:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ -1599827051;
                    ** GOTO lbl69
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ 2087963860;
                    ** GOTO lbl69
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ -1368110118;
                    ** GOTO lbl120
                    break;
                }
lbl32:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ -520422778;
                    ** continue;
                    break;
                }
                break;
            }
lbl35:
            // 1 sources

            while (true) {
                var2_2 = (var0_1 | var3) ^ -2064179775;
                ** GOTO lbl69
lbl38:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ 1103103362;
                    ** continue;
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    eN.f = 0.0f;
                    ** continue;
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ 341943195;
                    ** GOTO lbl69
lbl47:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ -1914343897;
                        ** GOTO lbl69
                        break;
                    }
lbl50:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ -399944450;
                        ** GOTO lbl69
                        break;
                    }
                    break;
                }
                break;
            }
            eN.a.clear();
            var2_2 = (var0_1 | var3) ^ 1828463149;
            ** GOTO lbl69
lbl56:
            // 1 sources

            block39: while (true) {
                var2_2 = (var0_1 | var3) ^ -1948169482;
                ** GOTO lbl69
lbl59:
                // 1 sources

                while (true) {
                    eN.c = 0.0f;
                    ** continue;
                    break;
                }
lbl62:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ 1584282351;
                    ** continue;
                    break;
                }
lbl65:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
lbl67:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ 791313454;
lbl69:
                    // 15 sources

                    block44: while (true) {
                        switch (var2_2) lbl-1000:
                        // 7 sources

                        {
                            while (true) {
                                default: {
                                    continue block44;
                                }
                                break;
                            }
                            case -752672050: {
                                ** continue;
                            }
                            case -384555336: {
                                ** continue;
                            }
                            case -97483780: {
                                ** continue;
                            }
                            case -1610827483: {
                                ** continue;
                            }
                            case 318187705: {
                                ** continue;
                            }
                            case 1672760896: {
                                ** continue;
                            }
                            case -275286833: {
                                ** continue;
                            }
                            case 691514677: {
                                ** continue;
                            }
                            case 195436815: {
                                ** continue;
                            }
                            case -680427954: {
                                ** continue;
                            }
                            case 1493144053: {
                                eN.a = 0;
                                ** continue;
                            }
                            case -1167873550: {
                                var1_3 ^= var2_2 ^ 1005590701;
                                break block39;
                            }
                            case -618580960: {
                                return;
                            }
lbl102:
                            // 1 sources

                            var2_2 = (var0_1 | var3) ^ -930529070;
                            ** GOTO lbl-1000
                            case 1301672898: {
                                eN.a = 0.0f;
                                ** continue;
                            }
lbl107:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ 977280537;
                                ** GOTO lbl-1000
                                break;
                            }
lbl110:
                            // 1 sources

                            var2_2 = (var0_1 | var3) ^ -1080570507;
                            ** GOTO lbl-1000
                            case -63658195: {
                                eN.d = System.nanoTime();
                                ** GOTO lbl118
                            }
lbl115:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ -1527329003;
                                ** GOTO lbl-1000
                                break;
                            }
lbl118:
                            // 1 sources

                            var2_2 = (var0_1 | var3) ^ -1108636103;
                            ** GOTO lbl-1000
lbl120:
                            // 1 sources

                            var2_2 = (var0_1 | var3) ^ -1740465900;
                            ** continue;
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            var2_2 = (var0_1 | var3) ^ -1944018215;
            ** GOTO lbl69
            {
                case -935190354: {
                    ** continue;
                }
                case 455725046: {
                    var1_3 ^= var2_2 ^ 2083620543;
                    ** continue;
                }
                case -67809534: {
                    eN.d = 0.0f;
                    ** continue;
                }
            }
        }
        var2_2 = (var0_1 | var3) ^ -1393239557;
        ** GOTO lbl69
        {
            case -901880862: {
                var1_3 ^= var2_2 ^ 1500806238;
                ** continue;
            }
            case -215814118: {
                var1_3 ^= var2_2 ^ 224722812;
                ** continue;
            }
        }
        eN.b = 0;
        var2_2 = (var0_1 | var3) ^ -843693015;
        ** while (true)
        {
            ** case -1084445431:
        }
lbl145:
        // 1 sources

        var1_3 ^= var2_2 ^ 1792454562;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static long begin() {
        block24: {
            block22: {
                block23: {
                    block21: {
                        break block24;
lbl1:
                        // 1 sources

                        while (true) {
                            var1_3 ^= var2_2 ^ -1418647137;
                            break block21;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var2_2 = (var0_1 | var3) ^ -1136983252;
                            break block22;
                            break;
                        }
                        while (true) {
                            var2_2 = (var0_1 | var3) ^ 1398398095;
                            break block22;
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var2_2 = (var0_1 | var3) ^ 78741329;
                            break block22;
                            break;
                        }
lbl13:
                        // 2 sources

                        while (true) {
                            var1_3 ^= 874359631;
                            break block23;
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var2_2 = (var0_1 | var3) ^ 602485789;
                            break block22;
lbl19:
                            // 1 sources

                            while (true) {
                                if (!eN.a) ** continue;
                                var2_2 = (var0_1 | var3) ^ -848948535;
                                break block22;
                                break;
                            }
                            break;
                        }
                    }
                    var2_2 = (var0_1 | var3) ^ 1961731731;
                    break block22;
lbl26:
                    // 1 sources

                    while (true) {
                        var1_3 ^= var2_2 ^ 894363609;
                        ** continue;
                        break;
                    }
                }
                return v0;
lbl31:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ 2034566184;
                    break block22;
lbl34:
                    // 1 sources

                    while (true) {
                        v0 = System.nanoTime();
                        ** GOTO lbl13
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ -794556390;
                    ** continue;
                    break;
                }
            }
            block20: while (true) {
                switch (var2_2) {
                    default: {
                        continue block20;
                    }
                    case -910810141: {
                        ** continue;
                    }
                    case -1637973955: {
                        ** continue;
                    }
                    case 1468657061: {
                        ** continue;
                    }
                    case 651492416: {
                        ** continue;
                    }
                    case -1190737039: {
                        ** continue;
                    }
                    case -475333820: {
                        ** continue;
                    }
                    case -301835777: 
                }
                break;
            }
            v0 = 0L;
            ** while (true)
        }
        var3 = -1704493208;
        var0_1 = eN.c & -1704493208 ^ 451475788;
        var2_2 = 0;
        var1_3 = (var0_1 | var3) ^ 1879875559;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static void end(gF var0, cV var1_1, long var2_2) {
        block22: {
            var7_3 = -1213969400;
            var4_4 = eN.c & -1213969400 ^ -1909648186;
            var6_5 = 0;
            if (true) ** GOTO lbl40
lbl5:
            // 1 sources

            return;
            block12: while (true) {
                block21: {
                    var6_5 = (var4_4 | var7_3) ^ 1333955717;
                    break block21;
lbl10:
                    // 1 sources

                    while (true) {
                        var6_5 = (var4_4 | var7_3) ^ -5628104;
                        break block21;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var5_6 ^= var6_5 ^ 783474880;
                        ** GOTO lbl45
                        break;
                    }
                }
lbl17:
                // 3 sources

                block15: while (true) {
                    switch (var6_5) lbl-1000:
                    // 6 sources

                    {
                        while (true) {
                            default: {
                                continue block15;
                            }
                            break;
                        }
                        case -308926802: {
                            ** continue;
                        }
                        case -709459691: {
                            ** continue;
                        }
                        case -239414066: {
                            ** continue;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var6_5 = (var4_4 | var7_3) ^ 335292007;
                            ** GOTO lbl-1000
                            break;
                        }
lbl31:
                        // 1 sources

                        while (true) {
                            var6_5 = (var4_4 | var7_3) ^ -754787728;
                            ** GOTO lbl-1000
                            break;
                        }
                        while (true) {
                            var6_5 = (var4_4 | var7_3) ^ 1646258891;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -1403946327: {
                            eN.end(var0.getName(), var1_1, var2_2);
                            break block12;
                        }
lbl40:
                        // 1 sources

                        var5_6 = (var4_4 | var7_3) ^ 1603856634;
                        break block22;
lbl42:
                        // 1 sources

                        while (true) {
                            var6_5 = (var4_4 | var7_3) ^ -838603840;
                            ** GOTO lbl-1000
                            break;
                        }
lbl45:
                        // 1 sources

                        var6_5 = (var4_4 | var7_3) ^ 1379629664;
                        ** continue;
                        case 1074217974: {
                            var5_6 ^= var6_5 ^ 1667742414;
                            continue block12;
                        }
                    }
                    break;
                }
                break;
            }
            var6_5 = (var4_4 | var7_3) ^ 1310164992;
            ** GOTO lbl17
            {
                case -575490555: {
                    var5_6 ^= var6_5 ^ -1553497496;
                    ** continue;
                }
                case 1907275534: {
                    return;
                }
                case -265301941: {
                    if (var2_2 != 0L) ** continue;
                    ** continue;
                }
                ** case 1823442622:
            }
lbl61:
            // 1 sources

            var5_6 ^= var6_5 ^ -1940494100;
            ** while (true)
        }
        var6_5 = (var4_4 | var7_3) ^ 1780211163;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static void end(String var0, cV var1_1, long var2_2) {
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
    public static void onFrame() {
        block37: {
            block38: {
                block35: {
                    block33: {
                        block34: {
                            block36: {
                                break block36;
lbl1:
                                // 1 sources

                                while (true) {
                                    var3_3 ^= var4_2 ^ 0xBBB9BF;
                                    ** GOTO lbl74
                                    break;
                                }
                            }
                            var5 = 1854293659;
                            var2_1 = eN.c & 1854293659 ^ 1296141719;
                            var4_2 = 0;
                            var3_3 = (var2_1 | var5) ^ 238285174;
                            ** GOTO lbl72
lbl10:
                            // 1 sources

                            while (true) {
                                var4_2 = (var2_1 | var5) ^ -1770790417;
                                break block33;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var4_2 = (var2_1 | var5) ^ 359599158;
                                break block33;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (!eN.a) {
                                break block34;
                            }
                            break block37;
lbl19:
                            // 1 sources

                            while (true) {
                                var4_2 = (var2_1 | var5) ^ 889623412;
                                break block33;
lbl22:
                                // 2 sources

                                while (true) {
                                    var4_2 = (var2_1 | var5) ^ -1890465033;
                                    break block33;
                                    break;
                                }
                                break;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var0_4 = System.nanoTime();
                                ** continue;
                                break;
                            }
                        }
                        var4_2 = (var2_1 | var5) ^ 1302601406;
                        break block38;
lbl31:
                        // 1 sources

                        while (true) {
                            var3_3 ^= var4_2 ^ 2077114262;
                            break block35;
                            break;
                        }
                    }
lbl35:
                    // 3 sources

                    block27: while (true) {
                        switch (var4_2) {
                            default: {
                                continue block27;
                            }
                            case 1522621675: {
                                break block27;
                            }
                            case -105632144: {
                                var3_3 ^= var4_2 ^ 1883897524;
                                ** continue;
                            }
lbl44:
                            // 1 sources

                            while (true) {
                                ++eN.a;
                                ** GOTO lbl70
                                break;
                            }
                        }
                        break;
                    }
                    var4_2 = (var2_1 | var5) ^ -268876297;
                    ** GOTO lbl35
                }
                var4_2 = (var2_1 | var5) ^ 704715853;
            }
lbl52:
            // 4 sources

            block29: while (true) {
                switch (var4_2) lbl-1000:
                // 5 sources

                {
                    default: {
                        continue block29;
                    }
                    case -1318228206: {
                        ** continue;
                    }
                    case -1324818773: {
                        ** GOTO lbl16
                    }
                    case 1170658258: {
                        ** continue;
                    }
                    case 1707088764: {
                        ** continue;
                    }
                    case 2048929755: {
                        break block29;
                    }
                    case 188313936: {
                        ** continue;
                    }
                    case -1209211161: {
                        return;
                    }
lbl70:
                    // 1 sources

                    var4_2 = (var2_1 | var5) ^ 168285411;
                    ** GOTO lbl-1000
lbl72:
                    // 1 sources

                    var4_2 = (var2_1 | var5) ^ 367517764;
                    ** GOTO lbl-1000
lbl74:
                    // 1 sources

                    var4_2 = (var2_1 | var5) ^ -556854988;
                    ** GOTO lbl-1000
                    case 576966945: {
                        var3_3 ^= var4_2 ^ -1262030243;
                        var4_2 = (var2_1 | var5) ^ -668259976;
                        ** GOTO lbl-1000
                    }
                    {
                        case -2143384984: {
                            eN.hM(var0_4);
                            ** GOTO lbl22
                        }
                    }
lbl83:
                    // 1 sources

                    while (true) {
                        var4_2 = (var2_1 | var5) ^ -1205493661;
                        ** continue;
                        break;
                    }
                }
                break;
            }
            var4_2 = (var2_1 | var5) ^ -559243123;
            ** GOTO lbl52
            {
                case -673026052: {
                    return;
                }
            }
lbl90:
            // 1 sources

            while (true) {
                var4_2 = (var2_1 | var5) ^ 1694416591;
                ** GOTO lbl52
                break;
            }
            {
                ** case -88202545:
            }
lbl94:
            // 1 sources

            var3_3 ^= var4_2 ^ -1846050980;
            ** while (true)
            {
                case -527039128: {
                    var3_3 ^= var4_2 ^ 1228977549;
                    ** continue;
                }
            }
        }
        var4_2 = (var2_1 | var5) ^ -1787171504;
        ** while (true)
        {
            ** case 2057880489:
        }
lbl103:
        // 1 sources

        if (var0_4 - eN.d >= eN.b) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static void onTick() {
        block27: {
            block24: {
                block28: {
                    block23: {
                        break block28;
lbl1:
                        // 1 sources

                        return;
lbl3:
                        // 1 sources

                        while (true) {
                            var1_3 ^= var2_2 ^ 810309178;
                            break block23;
                            break;
                        }
lbl6:
                        // 1 sources

                        while (true) {
                            var2_2 = (var0_1 | var3) ^ -860088167;
                            break block24;
                            break;
                        }
                    }
                    var2_2 = (var0_1 | var3) ^ 60374348;
                    break block24;
lbl12:
                    // 1 sources

                    while (true) {
                        block26: {
                            block25: {
                                var2_2 = (var0_1 | var3) ^ -472667567;
                                break block24;
lbl15:
                                // 1 sources

                                while (true) {
                                    ++eN.b;
                                    break block25;
                                    break;
                                }
lbl18:
                                // 1 sources

                                while (true) {
                                    var1_3 ^= var2_2 ^ -2077597279;
                                    break block26;
                                    break;
                                }
                            }
                            var2_2 = (var0_1 | var3) ^ 887976445;
                            break block24;
                        }
                        var2_2 = (var0_1 | var3) ^ 1052639472;
                        break block24;
lbl27:
                        // 1 sources

                        while (true) {
                            var1_3 ^= var2_2 ^ -1547423555;
                            break block27;
                            break;
                        }
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ -1343608803;
                        break block24;
                        break;
                    }
                }
                var3 = -7345420;
                var0_1 = eN.c & -7345420 ^ 199620745;
                var2_2 = 0;
                var1_3 = (var0_1 | var3) ^ 800159632;
                ** while (true)
lbl39:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ 556924548;
                    ** continue;
                    break;
                }
            }
lbl43:
            // 3 sources

            block20: while (true) {
                switch (var2_2) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block20;
                        }
                        break;
                    }
                    case -2088756545: {
                        ** continue;
                    }
                    case 1633167398: {
                        ** continue;
                    }
                    case -59324495: {
                        ** continue;
                    }
                    case -19211076: {
                        ** continue;
                    }
                    case 1342558944: {
                        break block20;
                    }
                    case -889025792: {
                        ** continue;
                    }
                    case 473714860: {
                        ** continue;
                    }
                    case 861135460: {
                        return;
                    }
lbl64:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ -1632120101;
                        ** continue;
                        break;
                    }
                }
                break;
            }
            var2_2 = (var0_1 | var3) ^ 20260417;
            ** GOTO lbl43
        }
        var2_2 = (var0_1 | var3) ^ 2087706690;
        ** while (true)
        {
            ** case -1051592179:
        }
lbl73:
        // 1 sources

        ** while (eN.a)
lbl74:
        // 1 sources

        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void hM(long var0) {
        block133: {
            block134: {
                block132: {
                    var18_1 = -1846176502;
                    var15_2 = eN.c & -1846176502 ^ 1031982889;
                    var17_3 = 0;
                    var16_14 = (var15_2 | var18_1) ^ -1771391425;
                    var17_3 = (var15_2 | var18_1) ^ 353854378;
                    ** GOTO lbl286
lbl7:
                    // 1 sources

                    block99: while (true) {
                        switch (var17_3) {
                            case -1608159643: {
                                var16_14 ^= var17_3 ^ 140691589;
                                ** GOTO lbl37
                            }
                            case -1142248218: {
                                if (var11_10.a < 0.005f) {
                                    ** break;
                                }
                                ** GOTO lbl113
                            }
                            case -2141928704: {
                                var16_14 ^= var17_3 ^ -1982053290;
                                ** GOTO lbl121
                            }
                            case -407768909: {
                                var16_14 ^= var17_3 ^ 727673174;
                                var17_3 = (var15_2 | var18_1) ^ 102593485;
                                ** GOTO lbl131
                            }
                            case 1690051453: {
                                var9_8 += var11_10.a;
                                ** GOTO lbl59
                            }
                            case 1766221683: {
                                var16_14 ^= var17_3 ^ 1337110019;
                                ** GOTO lbl123
                            }
                            case -141646325: {
                                var11_10.b = Math.max((float)var11_10.a / 1000000.0f, var11_10.b * 0.5f);
                                ** GOTO lbl125
                            }
                            case -284907368: {
                                var16_14 ^= var17_3 ^ -283879326;
                                ** GOTO lbl71
                            }
lbl35:
                            // 1 sources

                            var17_3 = (var15_2 | var18_1) ^ -97285799;
                            continue block99;
lbl37:
                            // 1 sources

                            var17_3 = (var15_2 | var18_1) ^ 1249474848;
                            continue block99;
                            case 266936043: {
                                var16_14 ^= var17_3 ^ 1531588518;
                                ** GOTO lbl61
                            }
                            case 391880941: {
                                var16_14 ^= var17_3 ^ -561735321;
                                ** GOTO lbl103
                            }
                            case -1551415146: {
                                var11_10.a = 0L;
                                var17_3 = (var15_2 | var18_1) ^ 1514549144;
                                continue block99;
                            }
                            case 1299785008: {
                                var7_7 += var11_10.a[cV.i.ordinal()] + var11_10.a[cV.f.ordinal()];
                                var17_3 = (var15_2 | var18_1) ^ 500347214;
                                continue block99;
                            }
                            case -2141182304: {
                                ** GOTO lbl369
                            }
                            case -345623175: {
                                var16_14 ^= var17_3 ^ 1226010390;
                                var17_3 = (var15_2 | var18_1) ^ -1682040975;
                                ** GOTO lbl131
                            }
lbl59:
                            // 1 sources

                            var17_3 = (var15_2 | var18_1) ^ -1306607168;
                            continue block99;
lbl61:
                            // 1 sources

                            var17_3 = (var15_2 | var18_1) ^ -897127353;
                            continue block99;
                            case 726842426: {
                                var10_9.remove();
                                ** GOTO lbl101
                            }
                            case 1204049522: {
                                ** GOTO lbl137
                            }
                            case 1279107312: {
                                var11_10.a = var12_11;
                                ** GOTO lbl95
                            }
lbl71:
                            // 1 sources

                            var17_3 = (var15_2 | var18_1) ^ 2001878028;
                            continue block99;
                            case 855470779: {
                                var16_14 ^= var17_3 ^ -1989852170;
                                var17_3 = (var15_2 | var18_1) ^ -649331626;
                                ** GOTO lbl131
                            }
                            case -895098073: {
                                ** GOTO lbl369
                            }
                            case 642369626: {
                                var14_13 = (float)var11_10.a[var13_12] / 1000000.0f / var4_5;
                                var17_3 = (var15_2 | var18_1) ^ -1722633396;
                                break block132;
                            }
                            case 381290059: {
                                Arrays.fill(var11_10.a, 0L);
                                var17_3 = (var15_2 | var18_1) ^ 1495713295;
                                ** GOTO lbl131
                            }
                            case -456058588: {
                                var16_14 ^= var17_3 ^ 327640797;
                                var17_3 = (var15_2 | var18_1) ^ 510695357;
                                continue block99;
                            }
                            case 1771549125: {
                                var16_14 ^= var17_3 ^ -1032553983;
                                var17_3 = (var15_2 | var18_1) ^ -1420961440;
                                continue block99;
                            }
lbl95:
                            // 1 sources

                            var17_3 = (var15_2 | var18_1) ^ -1064305419;
                            continue block99;
                            case 2133202257: {
                                var16_14 ^= var17_3 ^ -1958899956;
                                var17_3 = (var15_2 | var18_1) ^ -259065317;
                                ** GOTO lbl131
                            }
lbl101:
                            // 1 sources

                            var17_3 = (var15_2 | var18_1) ^ -1431535674;
                            continue block99;
lbl103:
                            // 1 sources

                            var17_3 = (var15_2 | var18_1) ^ 1033369995;
                            continue block99;
                            case 1664477754: {
                                if (var13_12 < eN.a.length) {
                                    var17_3 = (var15_2 | var18_1) ^ 1452403282;
                                } else {
                                    var17_3 = (var15_2 | var18_1) ^ -325343865;
                                    continue block99;
                                }
                            }
                            case -1683535483: {
                                if (var11_10.b < 0.05f) ** GOTO lbl115
lbl113:
                                // 2 sources

                                var17_3 = (var15_2 | var18_1) ^ -1895125616;
                                continue block99;
lbl115:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ -726550440;
                                continue block99;
                            }
                            case 2105025502: {
                                var16_14 ^= var17_3 ^ -1237214708;
                                var17_3 = (var15_2 | var18_1) ^ -2075712278;
                                continue block99;
                            }
lbl121:
                            // 1 sources

                            var17_3 = (var15_2 | var18_1) ^ -557697775;
                            continue block99;
lbl123:
                            // 1 sources

                            var17_3 = (var15_2 | var18_1) ^ -1767546095;
                            continue block99;
lbl125:
                            // 1 sources

                            var17_3 = (var15_2 | var18_1) ^ -731877650;
                            continue block99;
                            case 2003907436: {
                                eN.a.add(var11_10);
                                var17_3 = (var15_2 | var18_1) ^ 1391687603;
                            }
lbl131:
                            // 8 sources

                            default: {
                                continue block99;
                            }
                            case 1366063788: {
                                var16_14 ^= var17_3 ^ 1335235237;
                                var17_3 = (var15_2 | var18_1) ^ -238387237;
                                continue block99;
                            }
lbl137:
                            // 1 sources

                            var17_3 = (var15_2 | var18_1) ^ 642815662;
                            continue block99;
                            case 967900097: 
                        }
                        var5_6 += var11_10.a[cV.g.ordinal()];
                        var17_3 = (var15_2 | var18_1) ^ -1026438534;
                        continue;
                        break;
                    }
lbl143:
                    // 1 sources

                    while (true) {
                        var16_14 ^= 1604716651;
                        var9_8 = 0.0f;
                        var17_3 = (var15_2 | var18_1) ^ 1965919657;
                        ** GOTO lbl-1000
                        break;
                    }
                    {
                        var17_3 = (var15_2 | var18_1) ^ -1787627982;
lbl149:
                        // 2 sources

                        block102: while (true) {
                            switch (var17_3) {
                                case 430477283: {
                                    var16_14 ^= var17_3 ^ -1398366489;
                                    ** GOTO lbl181
                                }
                                case 1575251195: {
                                    var16_14 ^= var17_3 ^ 535880216;
                                    ** GOTO lbl204
                                }
                                case 541698860: {
                                    v0 = 0.0f;
                                    ** GOTO lbl194
                                }
                                case 53202770: {
                                    eN.a = 0;
                                    var17_3 = (var15_2 | var18_1) ^ -658602988;
                                    ** GOTO lbl250
                                }
                                case 385901306: {
                                    if (eN.a <= 0) ** GOTO lbl173
                                    ** GOTO lbl206
                                }
                                case -571005469: {
                                    v1 = (float)var7_7 / 1000000.0f / (float)eN.a;
                                    ** GOTO lbl277
                                }
                                case 1433325885: {
                                    var16_14 ^= var17_3 ^ -201032220;
                                    ** GOTO lbl192
                                }
lbl173:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ -392622570;
                                continue block102;
                                case -1089800739: {
                                    v0 = (float)var5_6 / 1000000.0f / (float)eN.b;
                                    ** GOTO lbl194
                                }
                                case -1616024049: {
                                    var16_14 ^= var17_3 ^ -366981343;
                                    ** GOTO lbl252
                                }
lbl181:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ -1092874119;
                                continue block102;
                                case -924777515: {
                                    eN.b = 0;
                                    ** GOTO lbl202
                                }
                                case 1454541262: {
                                    var16_14 ^= var17_3 ^ -1758843822;
                                    ** GOTO lbl213
                                }
                                case -1396110493: {
                                    var16_14 ^= var17_3 ^ 699129740;
                                    ** GOTO lbl275
                                }
lbl192:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ -1921169360;
                                continue block102;
lbl194:
                                // 2 sources

                                var16_14 ^= -36561730;
                                ** GOTO lbl217
                                case 2043217279: {
                                    if (eN.b <= 0) ** GOTO lbl267
                                    ** GOTO lbl215
                                }
                                case 1939775335: {
                                    var16_14 ^= var17_3 ^ 178694969;
                                    ** GOTO lbl208
                                }
lbl202:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ 289330248;
                                continue block102;
lbl204:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ 54230421;
                                continue block102;
lbl206:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ -794097278;
                                continue block102;
lbl208:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ -1648462841;
                                continue block102;
                                case 679815449: {
                                    var16_14 ^= var17_3 ^ -1462848708;
                                    ** GOTO lbl245
                                }
lbl213:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ -1395729410;
                                continue block102;
lbl215:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ 467460997;
                                continue block102;
lbl217:
                                // 1 sources

                                eN.f = v0;
                                var17_3 = (var15_2 | var18_1) ^ -1537257272;
                                continue block102;
                                case -874500321: {
                                    var16_14 ^= var17_3 ^ 1406034719;
                                    var17_3 = (var15_2 | var18_1) ^ -1426604591;
                                    ** GOTO lbl250
                                }
                                case 288949461: {
                                    eN.a.sort(eN.a);
                                    ** GOTO lbl254
                                }
                                case -1093885250: {
                                    eN.c = var9_8;
                                    var17_3 = (var15_2 | var18_1) ^ 1981280308;
                                    continue block102;
                                }
                                case 1699306303: {
                                    var16_14 ^= var17_3 ^ -797326439;
                                    var17_3 = (var15_2 | var18_1) ^ 1964432638;
                                    continue block102;
                                }
                                case 523307366: {
                                    if (var10_9.hasNext()) {
                                        var17_3 = (var15_2 | var18_1) ^ 576368932;
                                    } else {
                                        var17_3 = (var15_2 | var18_1) ^ -347777307;
                                        continue block102;
                                    }
                                }
                                case 1834800809: {
                                    var16_14 ^= var17_3 ^ -868844944;
                                    var17_3 = (var15_2 | var18_1) ^ 1610676936;
                                    continue block102;
                                }
lbl245:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ -1002513836;
                                continue block102;
                                case -1507115858: {
                                    var16_14 ^= var17_3 ^ -552400656;
                                    var17_3 = (var15_2 | var18_1) ^ 50146038;
                                }
lbl250:
                                // 5 sources

                                default: {
                                    continue block102;
                                }
lbl252:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ -1805122595;
                                continue block102;
lbl254:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ -535579696;
                                continue block102;
                                case 814389019: {
                                    v1 = 0.0f;
                                    ** GOTO lbl277
                                }
                                case 698342646: {
                                    var11_10 = (mm)var10_9.next();
                                    var16_14 ^= -954768935;
                                    ** GOTO lbl269
                                }
                                case 576048221: {
                                    var16_14 ^= var17_3 ^ 1760778417;
                                    var17_3 = (var15_2 | var18_1) ^ -1564027315;
                                    continue block102;
                                }
lbl267:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ -831963060;
                                continue block102;
lbl269:
                                // 1 sources

                                var12_11 = 0.0f;
                                var16_14 ^= 123429641;
                                var13_12 = 0;
lbl272:
                                // 2 sources

                                while (true) {
                                    var17_3 = (var15_2 | var18_1) ^ 1034099755;
                                    ** continue;
                                    break;
                                }
lbl275:
                                // 1 sources

                                var17_3 = (var15_2 | var18_1) ^ -1617577486;
                                continue block102;
lbl277:
                                // 2 sources

                                var16_14 ^= -139402759;
                                eN.a = v1;
                                continue block101;
lbl280:
                                // 1 sources

                                while (true) {
                                    var17_3 = (var15_2 | var18_1) ^ -2038448208;
                                    ** GOTO lbl286
                                    break;
                                }
lbl283:
                                // 1 sources

                                while (true) {
                                    var17_3 = (var15_2 | var18_1) ^ 1650550459;
                                    ** GOTO lbl414
                                    break;
                                }
lbl286:
                                // 2 sources

                                block106: while (true) {
                                    switch (var17_3) {
                                        default: {
                                            continue block106;
                                        }
                                        case 2007191915: {
                                            var16_14 ^= var17_3 ^ -862586098;
                                            ** continue;
                                        }
                                        case 998793371: {
                                            var2_4 = var0 - eN.d;
                                            break block106;
                                        }
                                        case -1461666687: {
                                            var17_3 = (var15_2 | var18_1) ^ -900428224;
                                            continue block106;
                                        }
                                    }
                                    break;
                                }
                                var17_3 = (var15_2 | var18_1) ^ 1839075814;
                                break block133;
lbl301:
                                // 1 sources

                                while (true) {
                                    var7_7 = 0L;
                                    ** continue;
                                    break;
                                }
lbl304:
                                // 2 sources

                                while (true) {
                                    var16_14 ^= 1245121879;
                                    eN.d = v2;
                                    var17_3 = (var15_2 | var18_1) ^ 1636924799;
                                    ** GOTO lbl414
                                    break;
                                }
lbl309:
                                // 1 sources

                                while (true) {
                                    var17_3 = (var15_2 | var18_1) ^ -302992293;
                                    break block134;
                                    break;
                                }
lbl312:
                                // 1 sources

                                while (true) {
                                    var17_3 = (var15_2 | var18_1) ^ 391892254;
                                    break block132;
                                    break;
                                }
                                case 576874201: 
                            }
                            break;
                        }
                    }
                    return;
                }
                block111: while (true) {
                    switch (var17_3) {
                        case -1150187996: {
                            ++var13_12;
                            ** continue;
                        }
                        case 1671038325: {
                            var12_11 += var11_10.a[var13_12];
                            ** break;
                        }
                        case 1107485154: {
                            var16_14 ^= var17_3 ^ 1382200727;
                            ** GOTO lbl340
                        }
                        case -1431563723: {
                            v3 = var13_12;
                            var11_10.a[v3] = var11_10.a[v3] + (var14_13 - var11_10.a[var13_12]) * 0.6f;
                            var17_3 = (var15_2 | var18_1) ^ -704823;
                            ** GOTO lbl338
                        }
                        case 614820967: {
                            var16_14 ^= var17_3 ^ 44154434;
                            ** continue;
                        }
lbl337:
                        // 1 sources

                        var17_3 = (var15_2 | var18_1) ^ -742028846;
lbl338:
                        // 3 sources

                        default: {
                            continue block111;
                        }
lbl340:
                        // 1 sources

                        var17_3 = (var15_2 | var18_1) ^ -563226018;
                        continue block111;
                        case 1848792825: 
                    }
                    var16_14 ^= var17_3 ^ -206893680;
                    var17_3 = (var15_2 | var18_1) ^ 109467919;
                }
lbl346:
                // 1 sources

                while (true) {
                    var17_3 = (var15_2 | var18_1) ^ -1937476462;
                    ** GOTO lbl414
                    break;
                }
lbl349:
                // 1 sources

                while (true) {
                    var17_3 = (var15_2 | var18_1) ^ 475797269;
                    ** GOTO lbl414
lbl352:
                    // 1 sources

                    while (true) {
                        var17_3 = (var15_2 | var18_1) ^ 334975114;
                        ** GOTO lbl414
                        break;
                    }
                    break;
                }
            }
            block115: while (true) {
                block135: {
                    switch (var17_3) lbl-1000:
                    // 2 sources

                    {
                        default: {
                            continue block115;
                        }
                        case 1342663536: {
                            var10_9 = eN.a.values().iterator();
                            ** break;
                        }
                        case -873839789: {
                            eN.a.clear();
                            ** GOTO lbl371
                        }
                        case -925216126: {
                            var16_14 ^= var17_3 ^ -107097009;
                            break block135;
                        }
lbl369:
                        // 3 sources

                        var17_3 = (var15_2 | var18_1) ^ -1616768138;
                        ** continue;
lbl371:
                        // 1 sources

                        var17_3 = (var15_2 | var18_1) ^ 861744411;
                        continue block115;
                        case -1901399504: 
                    }
                    var16_14 ^= var17_3 ^ 1259044409;
                    ** continue;
                }
                var17_3 = (var15_2 | var18_1) ^ 1981652088;
            }
lbl379:
            // 1 sources

            while (true) {
                var17_3 = (var15_2 | var18_1) ^ -1556912235;
                ** GOTO lbl414
lbl382:
                // 1 sources

                while (true) {
                    var16_14 ^= 1195785257;
                    ** continue;
                    break;
                }
                while (true) {
                    var17_3 = (var15_2 | var18_1) ^ -2030193374;
                    ** GOTO lbl414
                    break;
                }
                break;
            }
        }
        block119: while (true) {
            block136: {
                switch (var17_3) {
                    default: {
                        continue block119;
                    }
                    case -798372147: {
                        var16_14 ^= var17_3 ^ 1859986830;
                        var17_3 = (var15_2 | var18_1) ^ -1245491097;
                        continue block119;
                    }
                    case -1139797793: {
                        var16_14 ^= var17_3 ^ 1985136977;
                        break block136;
                    }
                    case 137662284: {
                        eN.d = var0;
                        break;
                    }
                    case 1507305444: {
                        var4_5 = (float)var2_4 / 1.0E9f;
                        var17_3 = (var15_2 | var18_1) ^ -55017173;
                        if (true) ** GOTO lbl414
                    }
                }
                var17_3 = (var15_2 | var18_1) ^ 31969268;
                continue;
            }
            var17_3 = (var15_2 | var18_1) ^ -467633969;
        }
        block120: while (true) {
            var17_3 = (var15_2 | var18_1) ^ -27680029;
lbl414:
            // 9 sources

            block121: while (true) {
                switch (var17_3) {
                    case -1025747095: {
                        v2 = (float)var2_4 / 1000000.0f / (float)eN.a;
                        ** GOTO lbl304
                    }
                    case 1095720448: {
                        var16_14 ^= var17_3 ^ 163449291;
                        ** break;
                    }
                    case -1375694943: {
                        var16_14 ^= var17_3 ^ 2098826335;
                        var17_3 = (var15_2 | var18_1) ^ 2133559362;
                        continue block121;
                    }
                    case -914290933: {
                        if (var4_5 <= 0.0f) {
                            ** continue;
                        }
                        ** GOTO lbl451
                    }
                    case -543770224: {
                        v2 = 0.0f;
                        ** continue;
                    }
                    case 516208830: {
                        var5_6 = 0L;
                        ** continue;
                    }
                    case -1582577602: {
                        if (eN.a <= 0) ** continue;
                        ** continue;
                    }
                    case 829664185: {
                        var16_14 ^= var17_3 ^ 192702188;
                        continue block120;
                    }
lbl442:
                    // 1 sources

                    var17_3 = (var15_2 | var18_1) ^ 1953945632;
                    default: {
                        continue block121;
                    }
                    case -1994379714: {
                        var16_14 ^= var17_3 ^ -701713872;
                        ** continue;
                    }
                    case 990538249: {
                        var16_14 ^= var17_3 ^ -401380873;
                        ** continue;
                    }
lbl451:
                    // 1 sources

                    var17_3 = (var15_2 | var18_1) ^ 886567189;
                    continue block121;
                    case -597253548: {
                        var16_14 ^= var17_3 ^ 1140622406;
                        ** continue;
                    }
                    case 1135508936: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static List<mm> rows() {
        int n2 = c & 0x4133D36C ^ 0x9C8512F3;
        int n3 = 0;
        int n4 = (n2 | 0x4133D36C) ^ 0x59689025;
        n3 = (n2 | 0x4133D36C) ^ 0x6CCD3262;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1317346915: {
                    n3 = (n2 | 0x4133D36C) ^ 0xA8FD8E27;
                    continue block5;
                }
                case 1967807960: {
                    n4 ^= n3 ^ 0xF10DD3EB;
                    n3 = (n2 | 0x4133D36C) ^ 0xC6994FCE;
                    continue block5;
                }
                case 456039473: 
            }
            break;
        }
        return a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float frameMs() {
        int n2 = c & 0x7EEB22D1 ^ 0xDE398365;
        int n3 = 0;
        int n4 = (n2 | 0x7EEB22D1) ^ 0xCED0A5ED;
        n3 = (n2 | 0x7EEB22D1) ^ 0x4E20FAE9;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -266450868: {
                    return d;
                }
                case -1327802084: {
                    n3 = (n2 | 0x7EEB22D1) ^ 0x5F79A8F1;
                    continue block5;
                }
                case -1585313020: 
            }
            n4 ^= n3 ^ 0x50EF9CD0;
            n3 = (n2 | 0x7EEB22D1) ^ 0xEE5EBB9;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float clientMsPerFrame() {
        int n2 = c & 0x1D4EE8E9 ^ 0xAD7F7868;
        int n3 = 0;
        int n4 = (n2 | 0x1D4EE8E9) ^ 0x60FA2847;
        n3 = (n2 | 0x1D4EE8E9) ^ 0x26A769F1;
        block5: while (true) {
            switch (n3) {
                case -1717031538: {
                    n4 ^= n3 ^ 0x7B19656C;
                    n3 = (n2 | 0x1D4EE8E9) ^ 0x7EAB84D9;
                }
                default: {
                    continue block5;
                }
                case -1009484752: {
                    return a;
                }
                case -1680305896: 
            }
            n3 = (n2 | 0x1D4EE8E9) ^ 0x24D7D567;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float clientMsPerTick() {
        int n2 = c & 0xDE523A30 ^ 0xC064B2D3;
        int n3 = 0;
        int n4 = (n2 | 0xDE523A30) ^ 0x13FC0B4E;
        n3 = (n2 | 0xDE523A30) ^ 0x255D217F;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1165727013: {
                    return f;
                }
                case -81028212: {
                    n3 = (n2 | 0xDE523A30) ^ 0x41AE80B1;
                    continue block5;
                }
                case -1613219262: 
            }
            n4 ^= n3 ^ 0xA84087AB;
            n3 = (n2 | 0xDE523A30) ^ 0x9B0D2FD6;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float totalMsPerSecond() {
        int n2 = c & 0xED1EC0D8 ^ 0x2DB4F482;
        int n3 = 0;
        int n4 = (n2 | 0xED1EC0D8) ^ 0x9F16AA51;
        n3 = (n2 | 0xED1EC0D8) ^ 0xB61A67E2;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -400913081: {
                    n4 ^= n3 ^ 0xFA1235DB;
                    n3 = (n2 | 0xED1EC0D8) ^ 0xE87B7336;
                    continue block5;
                }
                case 1537512248: {
                    n3 = (n2 | 0xED1EC0D8) ^ 0x5A4799D;
                    continue block5;
                }
                case 96831468: 
            }
            break;
        }
        return c;
    }

    /*
     * Exception decompiling
     */
    public static float frameShare() {
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
    private static /* synthetic */ String hN(mm mm2) {
        int n2 = c & 0xFD191C88 ^ 0x7302EA8F;
        int n3 = 0;
        int n4 = (n2 | 0xFD191C88) ^ 0x11DEECC4;
        n3 = (n2 | 0xFD191C88) ^ 0x209A097D;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1037733685: {
                    return mm2.a;
                }
                case -545130510: {
                    n3 = (n2 | 0xFD191C88) ^ 0x51B5A950;
                    continue block5;
                }
                case -1364305953: 
            }
            n4 ^= n3 ^ 0xA25868F2;
            n3 = (n2 | 0xFD191C88) ^ 0xC2C171BA;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ double hO(mm mm2) {
        int n2 = c & 0x9386260A ^ 0x9417330E;
        int n3 = 0;
        int n4 = (n2 | 0x9386260A) ^ 0x3BAA7BFA;
        n3 = (n2 | 0x9386260A) ^ 0x1CE4997E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -486704845: {
                    n4 ^= n3 ^ 0xA1D8E451;
                    n3 = (n2 | 0x9386260A) ^ 0x4F363CA9;
                    continue block5;
                }
                case -660534361: {
                    return -mm2.a;
                }
                case -1955352976: 
            }
            n3 = (n2 | 0x9386260A) ^ 0x756A4E3D;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var3 = -1356144647;
        var2_1 = 1044155414;
        eN.c = mK.a(MethodHandles.lookup().lookupClass(), -609200014);
        var1_2 = 0;
        var0_3 = -702514275;
        var1_2 = var2_1 ^ -1860807729;
        if (true) ** GOTO lbl13
        block13: while (true) {
            var1_2 = var2_1 ^ -1068850549;
            if (true) ** GOTO lbl13
            block14: while (true) {
                var1_2 = var2_1 ^ 819047752;
lbl13:
                // 3 sources

                block15: while (true) {
                    switch (var1_2) {
                        case -25809251: {
                            eN.a = new ArrayList<E>();
                            ** break;
                        }
                        case 250421598: {
                            var0_3 ^= var1_2 ^ 1098811320;
                            var1_2 = var2_1 ^ -9213788;
                            continue block15;
                        }
                        case -1051728718: {
                            eN.a = cV.values();
                            var1_2 = var2_1 ^ 1010351537;
                            continue block15;
                        }
                        case -1701756130: {
                            var0_3 ^= var1_2 ^ -395281185;
                            var1_2 = var2_1 ^ 458431079;
                            continue block15;
                        }
                        case 628070001: {
                            var0_3 ^= -881800267;
                            var0_3 ^= -1600918007;
                            eN.a = Comparator.comparingDouble((ToDoubleFunction<mm>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, hO(z.r.mm ), (Lz/r/mm;)D)()).thenComparing((Function<mm, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, hN(z.r.mm ), (Lz/r/mm;)Ljava/lang/String;)(), String.CASE_INSENSITIVE_ORDER);
                            var1_2 = var2_1 ^ -1836276796;
                            continue block15;
                        }
                        case -1268631335: {
                            eN.a = new HashMap<K, V>();
                            var1_2 = var2_1 ^ 625375345;
                            continue block15;
                        }
                        case -563943312: {
                            eN.b = 8072829451476580765L << (var1_2 ^ -563943344) >>> (var1_2 ^ -563943344) ^ (long)var0_3 & 0xFFFFFFFFL | (8072829451476580765L >>> (var1_2 ^ -563943344) ^ (long)var0_3 & 0xFFFFFFFFL) << (var1_2 ^ -563943344);
                            return;
                        }
lbl44:
                        // 1 sources

                        var1_2 = var2_1 ^ -1532113144;
                        ** GOTO lbl49
                        case 33829287: {
                            var0_3 ^= var1_2 ^ -1286377170;
                            var1_2 = var2_1 ^ -1973504817;
                        }
lbl49:
                        // 3 sources

                        default: {
                            continue block15;
                        }
                        case -1356144679: {
                            eN.e = 0.005f;
                            eN.c = -3017275832461244131L << (var1_2 ^ var3) >>> (var1_2 ^ var3) ^ (long)var0_3 & 0xFFFFFFFFL | (-3017275832461244131L >>> (var1_2 ^ var3) ^ (long)var0_3 & 0xFFFFFFFFL) << (var1_2 ^ var3);
                            eN.b = 0.6f;
                            eN.a = -3017275836162799203L << (var1_2 ^ var3) >>> (var1_2 ^ var3) ^ (long)var0_3 & 0xFFFFFFFFL | (-3017275836162799203L >>> (var1_2 ^ var3) ^ (long)var0_3 & 0xFFFFFFFFL) << (var1_2 ^ var3);
                            continue block14;
                        }
                        case 461042791: {
                            var0_3 ^= var1_2 ^ 992277286;
                            continue block13;
                        }
                        case -1397739566: 
                    }
                    var0_3 ^= var1_2 ^ -855581567;
                    var1_2 = var2_1 ^ -530684826;
                }
                break;
            }
            break;
        }
    }
}

