/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class gW {
    private static class_638 a;
    public static final int a;
    private static final long a;
    private static final Map<class_2338, Long> a;

    /*
     * Enabled aggressive block sorting
     */
    private gW() {
        int n2 = a & 0x5548AA0E ^ 0xE7AA9324;
        int n3 = (n2 | 0x5548AA0E) ^ 0x78BC0F2D;
        n3 ^= 0x874A8E00;
        n3 ^= 0x22265F55;
    }

    /*
     * Exception decompiling
     */
    public static class_2338 placementCandidate(class_746 var0, class_1268 var1_1, class_3965 var2_2) {
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
    public static void confirmPlacement(class_2338 var0, class_1269 var1_1) {
        block49: {
            block48: {
                block54: {
                    block52: {
                        block45: {
                            block51: {
                                block53: {
                                    block46: {
                                        block47: {
                                            block44: {
                                                block50: {
                                                    break block50;
lbl1:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ -1307314433;
                                                        break block44;
lbl4:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                        break;
                                                    }
lbl6:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ -612698583;
                                                        break block44;
                                                        break;
                                                    }
lbl9:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 1866213014;
                                                        break block44;
lbl12:
                                                        // 1 sources

                                                        while (true) {
                                                            var5_4 = (var3_3 | var6_2) ^ -639864081;
                                                            break block44;
                                                            break;
                                                        }
lbl15:
                                                        // 1 sources

                                                        while (true) {
                                                            var5_4 = (var3_3 | var6_2) ^ -1689445626;
                                                            break block44;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                                var6_2 = -201689277;
                                                var3_3 = gW.a & -201689277 ^ 495517804;
                                                var5_4 = 0;
                                                break block51;
lbl23:
                                                // 1 sources

                                                while (true) {
                                                    gW.a.put(var0, System.currentTimeMillis());
                                                    break block45;
                                                    break;
                                                }
lbl27:
                                                // 1 sources

                                                while (true) {
                                                    var4_6 ^= var5_4 ^ 716780650;
                                                    break block46;
                                                    break;
                                                }
                                            }
lbl31:
                                            // 10 sources

                                            block31: while (true) {
                                                switch (var5_4) lbl-1000:
                                                // 3 sources

                                                {
                                                    while (true) {
                                                        default: {
                                                            continue block31;
                                                        }
                                                        break;
                                                    }
                                                    case -1865985543: {
                                                        ** continue;
                                                    }
                                                    case 640091520: {
                                                        ** continue;
                                                    }
                                                    case 1652183759: {
                                                        ** continue;
                                                    }
                                                    case 693503686: {
                                                        break block31;
                                                    }
                                                    case 109994314: {
                                                        return;
                                                    }
                                                    case 235418237: {
                                                        ** continue;
                                                    }
                                                    case 1307083152: {
                                                        if (var1_1 != null) {
                                                            ** continue;
                                                        }
                                                        break block45;
                                                    }
                                                    case 1689676905: {
                                                        break block47;
                                                    }
lbl54:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ -340370838;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
                                                    case 588677543: {
                                                        var4_6 ^= var5_4 ^ -1626430109;
                                                        break block48;
                                                    }
lbl60:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 821999505;
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            var5_4 = (var3_3 | var6_2) ^ -1577375907;
                                            ** GOTO lbl31
lbl65:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ 361941801;
                                                ** GOTO lbl31
                                                break;
                                            }
                                            gW.VI(var2_5.field_1687);
                                            var5_4 = (var3_3 | var6_2) ^ 1942176405;
                                            ** GOTO lbl31
                                        }
                                        var5_4 = (var3_3 | var6_2) ^ 1622972846;
                                        ** GOTO lbl31
                                    }
                                    var5_4 = (var3_3 | var6_2) ^ 324942250;
                                    break block52;
lbl77:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -235715310;
                                        ** GOTO lbl31
                                        break;
                                    }
                                    {
                                        case 612467014: {
                                            break block53;
                                        }
                                    }
lbl82:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -1652480608;
                                        ** GOTO lbl31
                                        break;
                                    }
lbl85:
                                    // 1 sources

                                    while (true) {
                                        var2_5 = class_310.method_1551();
                                        ** continue;
                                        break;
                                    }
                                }
                                var4_6 ^= 1970687706;
                                break block54;
lbl91:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ -693276247;
                                    ** GOTO lbl31
                                    break;
                                }
                                {
                                    case -1622675775: {
                                        if (var1_1.method_23665()) {
                                            ** continue;
                                        }
                                        break block45;
                                    }
                                    case -821706498: {
                                        var4_6 ^= var5_4 ^ -1166832092;
                                        ** continue;
                                    }
                                    case -1942473222: {
                                        var4_6 ^= var5_4 ^ 340229000;
                                        ** continue;
                                    }
                                }
                            }
                            var4_6 = (var3_3 | var6_2) ^ 1517382836;
                            var5_4 = (var3_3 | var6_2) ^ 919640441;
                            break block52;
                        }
lbl109:
                        // 4 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ -588384568;
                            ** GOTO lbl31
                            break;
                        }
                        {
                            case 1577078834: {
                                if (var2_5.field_1687 == null) ** GOTO lbl109
                                ** continue;
                            }
                            case 340602117: {
                                var4_6 ^= var5_4 ^ 575781360;
                                ** continue;
                            }
                        }
                    }
lbl119:
                    // 2 sources

                    block41: while (true) {
                        switch (var5_4) {
                            default: {
                                continue block41;
                            }
                            case -1844852866: {
                                ** continue;
                            }
                            case -324710715: {
                                ** continue;
                            }
                            ** case -919867882:
lbl128:
                            // 1 sources

                            break block49;
                        }
                        break;
                    }
                }
                if (!var2_5.field_1687.method_8320(var0).method_27852(class_2246.field_23152)) ** GOTO lbl109
                ** while (true)
                {
                    ** case -362169274:
                }
lbl133:
                // 1 sources

                if (var0 != null) ** break;
                ** while (true)
                ** while (true)
            }
            var5_4 = (var3_3 | var6_2) ^ -109767131;
            ** while (true)
        }
        var5_4 = (var3_3 | var6_2) ^ 1844621329;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static boolean isOwned(class_2338 var0) {
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
    public static void onBlockUpdate(class_638 var0, class_2338 var1_1, class_2680 var2_2) {
        var6_3 = -1301853894;
        var3_4 = gW.a & -1301853894 ^ 292434635;
        var5_5 = 0;
        var4_6 = (var3_4 | var6_3) ^ -465144922;
        var5_5 = (var3_4 | var6_3) ^ -1110125727;
        block15: while (true) {
            block21: {
                block22: {
                    switch (var5_5) {
                        case -1973862249: {
                            if (var2_2 != null) {
                                var5_5 = (var3_4 | var6_3) ^ 30779936;
                                continue block15;
                            }
                            ** GOTO lbl27
                        }
                        case -949863166: {
                            return;
                        }
                        case 1352645904: {
                            gW.a.remove(var1_1);
                            ** GOTO lbl27
                        }
                        case 2014337117: {
                            break block21;
                        }
                        case -1609130919: {
                            if (var1_1 != null) {
                                ** break;
                            }
                            ** GOTO lbl27
                        }
                        case 1073938731: {
                            if (!var2_2.method_27852(class_2246.field_23152)) ** GOTO lbl53
lbl27:
                            // 4 sources

                            var5_5 = (var3_4 | var6_3) ^ -1873389004;
                            break;
                        }
                        case -1296379429: {
                            var5_5 = (var3_4 | var6_3) ^ -210994480;
                            break;
                        }
                        case 247179418: {
                            ** GOTO lbl48
                        }
                        case 251305079: {
                            var4_6 ^= var5_5 ^ -2000853601;
                            var5_5 = (var3_4 | var6_3) ^ 326756258;
                            break;
                        }
                        case 587673540: {
                            gW.VI(var0);
                            var5_5 = (var3_4 | var6_3) ^ -1114249332;
                            break;
                        }
                        case -1258437903: {
                            var5_5 = (var3_4 | var6_3) ^ -470759701;
                            continue block15;
                        }
lbl46:
                        // 1 sources

                        var5_5 = (var3_4 | var6_3) ^ -880860250;
                        continue block15;
lbl48:
                        // 1 sources

                        var5_5 = (var3_4 | var6_3) ^ -1587866982;
                        continue block15;
                        case 590946767: {
                            var4_6 ^= var5_5 ^ 1567800974;
                            break block22;
                        }
lbl53:
                        // 1 sources

                        var5_5 = (var3_4 | var6_3) ^ 127056138;
                        continue block15;
                        case 305424737: {
                            var4_6 ^= var5_5 ^ -97923659;
                            var5_5 = (var3_4 | var6_3) ^ -1872210881;
                        }
                    }
                    continue;
                }
                var5_5 = (var3_4 | var6_3) ^ 1947027193;
                continue;
            }
            var5_5 = (var3_4 | var6_3) ^ 959855468;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void VI(class_638 var0) {
        var4_1 = -199567434;
        var1_2 = gW.a & -199567434 ^ 1549947054;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -98315856;
        var3_3 = (var1_2 | var4_1) ^ -551647142;
        if (true) ** GOTO lbl9
        block11: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 634404396;
lbl9:
            // 2 sources

            block12: while (true) {
                switch (var3_3) {
                    case -1969870761: {
                        var2_4 ^= var3_3 ^ -1108264002;
                        ** break;
                    }
                    case -45778408: {
                        gW.a = var0;
                        ** GOTO lbl-1000
                    }
                    case -2009296542: {
                        return;
                    }
                    case 593780708: {
                        var3_3 = (var1_2 | var4_1) ^ -1405738694;
                        ** GOTO lbl36
                    }
                    case 1347221124: {
                        var2_4 ^= var3_3 ^ 514440518;
                        continue block11;
                    }
lbl25:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 20950438;
                    continue block12;
                    case -643110510: {
                        if (gW.a == var0) lbl-1000:
                        // 2 sources

                        {
                            var3_3 = (var1_2 | var4_1) ^ -25987739;
                        } else {
                            var3_3 = (var1_2 | var4_1) ^ -409600421;
                        }
                        ** GOTO lbl36
                    }
                    case 34185947: {
                        var2_4 ^= var3_3 ^ -201604115;
                        var3_3 = (var1_2 | var4_1) ^ 1950762716;
                    }
lbl36:
                    // 5 sources

                    default: {
                        continue block12;
                    }
                    case 468658661: {
                        var2_4 ^= var3_3 ^ 747125260;
                        var3_3 = (var1_2 | var4_1) ^ 1957950777;
                        continue block12;
                    }
                    case -2000084345: 
                }
                gW.a.clear();
                var3_3 = (var1_2 | var4_1) ^ 1995243497;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    static {
        a = mK.a(MethodHandles.lookup().lookupClass(), -900035066);
        int n2 = 0;
        int n3 = 1867936257;
        n2 = 0x6FA51749 ^ 0x159C2133;
        block5: while (true) {
            switch (n2) {
                default: {
                    continue block5;
                }
                case 1659160699: {
                    n3 ^= n2 ^ 0xC7BB906A;
                    n2 = 0x6FA51749 ^ 0xA87BD2B5;
                    continue block5;
                }
                case 2050569850: {
                    a = 8022725136695583113L << (n2 ^ 0x7A39365A) >>> (n2 ^ 0x7A39365A) ^ (long)n3 & 0xFFFFFFFFL | (8022725136695583113L >>> (n2 ^ 0x7A39365A) ^ (long)n3 & 0xFFFFFFFFL) << (n2 ^ 0x7A39365A);
                    n2 = 0x6FA51749 ^ 0xD41DF32;
                    continue block5;
                }
                case -941701636: 
            }
            break;
        }
        a = new HashMap();
    }
}

