/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10185
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10185;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import z.r.G;
import z.r.hh;
import z.r.jy;
import z.r.kM;
import z.r.mw;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class ko {
    private static class_241 a;
    private static double a;
    private static final /* synthetic */ String a;
    private static Object a;
    private static float a;
    private static float b;
    private static float c;
    private static double b;
    private static double c;
    private static long a;
    private static final double d;
    private static final double e;
    private static float d;
    public static final int c;
    private static long b;
    private static final int[] a;
    private static final int a;
    private static int b;
    private static double f;
    private static boolean a;
    private static boolean b;
    private static double g;
    private static final double h;

    /*
     * Enabled aggressive block sorting
     */
    private ko() {
        int n2 = c & 0x3505749E ^ 0x813ADC03;
        int n3 = (n2 | 0x3505749E) ^ 0x16F61ED6;
        n3 ^= 0x49C1F89D;
        n3 ^= 0x3BF2494C;
    }

    private static int Dm(int n2, int n3) {
        int n4 = -1421636630;
        int n5 = 1639903261;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x84ED96E0)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xEBFF54E0;
        n6 ^= (n5 | n4) ^ 0xEBFF6867;
        n6 -= (n5 | n4) ^ 0xEBFFF8B8;
        n6 -= (n5 | n4) ^ 0xEBFF3092;
        n6 += (n5 | n4) ^ 0xEBFF10B2;
        n6 -= (n5 | n4) ^ 0xEBFFE98A;
        n6 += (n5 | n4) ^ 0xEBFF621E;
        return n6 -= (n5 | n4) ^ 0xEBFFF34C;
    }

    /*
     * Exception decompiling
     */
    public static boolean available() {
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
    private static boolean Dn() {
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
    private static boolean Do() {
        var5 = 238257111;
        var2_1 = ko.c & 238257111 ^ 1612061244;
        var4_2 = 0;
        var3_4 = (var2_1 | var5) ^ -1561423330;
        var4_2 = (var2_1 | var5) ^ 558549294;
        if (true) ** GOTO lbl43
lbl7:
        // 1 sources

        while (true) {
            var4_2 = (var2_1 | var5) ^ -1114709871;
            ** GOTO lbl19
lbl10:
            // 1 sources

            block12: while (true) {
                block17: {
                    block18: {
                        var4_2 = (var2_1 | var5) ^ -1963913586;
                        break block18;
lbl13:
                        // 1 sources

                        while (true) {
                            var3_4 ^= 1413026869;
                            if (!var0_5.isFreecamActive()) continue block12;
                            var3_4 ^= 1561246311;
                            v0 = true;
                            break block17;
                            break;
                        }
                    }
                    block14: while (true) {
                        switch (var4_2) {
                            default: {
                                continue block14;
                            }
                            case -742818962: {
                                var3_4 ^= var4_2 ^ -2021626021;
                                var4_2 = (var2_1 | var5) ^ 438532302;
                                continue block14;
                            }
                            case 1947525937: {
                                var0_5 = (kM)var1_3;
                                ** continue;
                            }
                            case 933937281: {
                                v0 = false;
                                break block14;
                            }
                            case -456747663: {
                                var3_4 ^= var4_2 ^ -1178063082;
                                var4_2 = (var2_1 | var5) ^ 1503484798;
                                continue block14;
                            }
                        }
                        break;
                    }
                }
                var3_4 ^= -1410075894;
                return v0;
            }
            break;
        }
        block15: while (true) {
            var4_2 = (var2_1 | var5) ^ 2004827934;
lbl43:
            // 2 sources

            block16: while (true) {
                switch (var4_2) {
                    default: {
                        continue block16;
                    }
                    case -1888039755: {
                        var3_4 ^= var4_2 ^ -1771413803;
                        continue block15;
                    }
                    case 1333613265: {
                        break;
                    }
                    case 424191201: {
                        var1_3 = mw.getInstance().getModuleByName(ko.a);
                        if (var1_3 instanceof kM) ** break;
                        ** continue;
                        ** continue;
                    }
                }
                var4_2 = (var2_1 | var5) ^ -515811510;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public static boolean claim(Object var0, int var1_1, double var2_2, double var4_3, double var6_4) {
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
    public static boolean drivenBy(Object var0) {
        block29: {
            block24: {
                block25: {
                    block31: {
                        block27: {
                            block30: {
                                block28: {
                                    block26: {
                                        block23: {
                                            break block30;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                var2_4 ^= var3_3 ^ -1649526504;
                                                break block23;
                                                break;
                                            }
lbl4:
                                            // 1 sources

                                            while (true) {
                                                var3_3 = (var1_2 | var4_1) ^ -291913432;
                                                break block24;
lbl7:
                                                // 1 sources

                                                while (true) {
                                                    v0 = false;
                                                    break block25;
                                                    break;
                                                }
lbl10:
                                                // 2 sources

                                                while (true) {
                                                    var3_3 = (var1_2 | var4_1) ^ 1519877683;
                                                    break block24;
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        var3_3 = (var1_2 | var4_1) ^ 1253193772;
                                        break block24;
lbl16:
                                        // 1 sources

                                        while (true) {
                                            if (ko.a != var0) ** GOTO lbl10
                                            break block26;
                                            break;
                                        }
lbl19:
                                        // 1 sources

                                        while (true) {
                                            if (ko.b) ** break;
                                            ** continue;
                                            break block27;
                                            break;
                                        }
lbl23:
                                        // 1 sources

                                        while (true) {
                                            v0 = true;
                                            break block25;
                                            break;
                                        }
lbl26:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_3 ^ 759112958;
                                            break block28;
                                            break;
                                        }
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ -368679979;
                                    break block24;
lbl32:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ 1205825486;
                                        break block29;
                                        break;
                                    }
                                }
                                var3_3 = (var1_2 | var4_1) ^ 1708064890;
                                break block24;
lbl38:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -646513601;
                                    break block24;
                                    break;
                                }
                            }
                            var4_1 = 482756674;
                            var1_2 = ko.c & 482756674 ^ -1668570746;
                            var3_3 = 0;
                            break block31;
                        }
                        var3_3 = (var1_2 | var4_1) ^ -1892750331;
                        break block24;
lbl49:
                        // 1 sources

                        return v0;
                    }
                    var2_4 = (var1_2 | var4_1) ^ -1742326574;
                    var3_3 = (var1_2 | var4_1) ^ -1419788931;
                    break block24;
                }
                var2_4 ^= 1381494765;
                ** while (true)
            }
lbl59:
            // 2 sources

            block22: while (true) {
                switch (var3_3) {
                    default: {
                        continue block22;
                    }
                    case -967272459: {
                        ** continue;
                    }
                    case -696397334: {
                        ** continue;
                    }
                    case 1918249198: {
                        ** continue;
                    }
                    case 1695200012: {
                        ** continue;
                    }
                    case -117380676: {
                        ** continue;
                    }
                    case 1992919571: {
                        ** continue;
                    }
                    case 333514179: {
                        ** continue;
                    }
                    case 1169757689: {
                        ** continue;
                    }
                    ** case 932205755:
lbl80:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ -104506678;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static boolean routeManualItemUse() {
        block34: {
            block33: {
                block35: {
                    block36: {
                        break block36;
lbl1:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_2 ^ -961134624;
                            ** GOTO lbl73
                            break;
                        }
                    }
                    var5 = 102005663;
                    var2_1 = ko.c & 102005663 ^ 1430090604;
                    var4_2 = 0;
                    var3_5 = (var2_1 | var5) ^ -126583304;
                    ** GOTO lbl40
lbl10:
                    // 1 sources

                    while (true) {
                        var4_2 = (var2_1 | var5) ^ -870373831;
                        break block33;
lbl13:
                        // 1 sources

                        while (true) {
                            var1_4 = ko.a;
                            if (!(var1_4 instanceof jy)) ** GOTO lbl33
                            break block34;
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            v0 = false;
                            break block35;
                            break;
                        }
                        break;
                    }
lbl20:
                    // 1 sources

                    while (true) {
                        var4_2 = (var2_1 | var5) ^ 1368496413;
                        break block33;
lbl23:
                        // 1 sources

                        while (true) {
                            var4_2 = (var2_1 | var5) ^ 100986699;
                            break block33;
                            break;
                        }
                        break;
                    }
lbl26:
                    // 3 sources

                    block23: while (true) {
                        switch (var4_2) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block23;
                                }
                                break;
                            }
                            case -1510849751: {
                                ** continue;
                            }
lbl33:
                            // 2 sources

                            while (true) {
                                var4_2 = (var2_1 | var5) ^ -221300522;
                                ** continue;
                                break;
                            }
                            case 1382513409: {
                                break block23;
                            }
lbl38:
                            // 1 sources

                            return v0;
lbl40:
                            // 1 sources

                            var4_2 = (var2_1 | var5) ^ -250769934;
                            break block33;
lbl42:
                            // 1 sources

                            while (true) {
                                var4_2 = (var2_1 | var5) ^ 703618832;
                                break block33;
                                break;
                            }
                            case 1324871264: {
                                v0 = true;
                                break block35;
                            }
lbl48:
                            // 1 sources

                            while (true) {
                                var4_2 = (var2_1 | var5) ^ -2030071726;
                                break block33;
                                break;
                            }
                        }
                        break;
                    }
                    var4_2 = (var2_1 | var5) ^ -1163904803;
                    ** GOTO lbl26
                }
                var3_5 ^= 244902385;
                ** while (true)
            }
lbl57:
            // 3 sources

            block29: while (true) {
                switch (var4_2) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block29;
                        }
                        break;
                    }
                    case -1692246586: {
                        ** continue;
                    }
                    case -1506740723: {
                        break block29;
                    }
                    case 1362728116: {
                        ** continue;
                    }
                    case -51924490: {
                        ** continue;
                    }
lbl70:
                    // 3 sources

                    while (true) {
                        var4_2 = (var2_1 | var5) ^ 454590994;
                        ** continue;
                        break;
                    }
lbl73:
                    // 1 sources

                    var4_2 = (var2_1 | var5) ^ 432706975;
                    ** GOTO lbl26
                    case 1277557229: {
                        var3_5 ^= var4_2 ^ 794920228;
                        ** continue;
                    }
                }
                break;
            }
            var4_2 = (var2_1 | var5) ^ 1128944630;
            ** GOTO lbl57
            {
                case -775754835: {
                    if (ko.a == null) ** GOTO lbl70
                    ** continue;
                }
            }
lbl83:
            // 1 sources

            while (true) {
                var4_2 = (var2_1 | var5) ^ -1411724791;
                ** continue;
                break;
            }
            {
                case 2127373551: {
                    ** continue;
                }
            }
        }
        var4_2 = (var2_1 | var5) ^ 89784574;
        ** while (true)
        {
            ** case -308460766:
        }
lbl92:
        // 1 sources

        var0_3 = (jy)var1_4;
        if (!var0_3.routeManualItemUse()) ** GOTO lbl70
        ** while (true)
        {
            case 111993570: {
                if (ko.b) ** break;
                ** continue;
                ** continue;
            }
            ** case 343353353:
        }
lbl100:
        // 1 sources

        var3_5 ^= var4_2 ^ -233094239;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static boolean guardManualInteractions() {
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
    public static boolean guardManualWorldInteractions() {
        var5 = -8432162;
        var2_1 = ko.c & -8432162 ^ 490038992;
        var4_2 = 0;
        var3_3 = (var2_1 | var5) ^ -1390431325;
        var4_2 = (var2_1 | var5) ^ -483539128;
        block19: while (true) {
            switch (var4_2) {
                case 1932649983: {
                    var3_3 ^= var4_2 ^ 1825328618;
                    ** break;
                }
                case 2069963910: {
                    if (ko.a != null) ** GOTO lbl52
                    ** GOTO lbl40
                }
                case -376203209: {
                    var1_4 = ko.a;
                    if (!(var1_4 instanceof jy)) ** GOTO lbl54
                    var4_2 = (var2_1 | var5) ^ 888892600;
                    ** GOTO lbl56
                }
                case 475181206: {
                    var4_2 = (var2_1 | var5) ^ -589488494;
                    ** GOTO lbl32
                }
                case -89403065: {
                    if (ko.b) ** GOTO lbl36
                    ** GOTO lbl34
                }
                case 482476372: {
                    var3_3 ^= var4_2 ^ -284241359;
                    ** GOTO lbl38
                }
                case -1208256189: {
                    var3_3 ^= var4_2 ^ -632154795;
                    ** GOTO lbl46
                }
lbl31:
                // 1 sources

                var4_2 = (var2_1 | var5) ^ -65872709;
lbl32:
                // 3 sources

                default: {
                    continue block19;
                }
lbl34:
                // 1 sources

                var4_2 = (var2_1 | var5) ^ -474122614;
                continue block19;
lbl36:
                // 1 sources

                var4_2 = (var2_1 | var5) ^ 1216614045;
                continue block19;
lbl38:
                // 1 sources

                var4_2 = (var2_1 | var5) ^ -1467089500;
                continue block19;
lbl40:
                // 1 sources

                var4_2 = (var2_1 | var5) ^ -1941007839;
                continue block19;
                case -636674997: {
                    var3_3 ^= var4_2 ^ 1622257619;
                    var4_2 = (var2_1 | var5) ^ 384626665;
                    continue block19;
                }
lbl46:
                // 1 sources

                var4_2 = (var2_1 | var5) ^ -2078387368;
                continue block19;
                case 597846348: {
                    var3_3 ^= var4_2 ^ -1444064367;
                    var4_2 = (var2_1 | var5) ^ 97822361;
                    continue block19;
                }
lbl52:
                // 1 sources

                var4_2 = (var2_1 | var5) ^ 628255637;
                continue block19;
lbl54:
                // 1 sources

                do {
                    var4_2 = (var2_1 | var5) ^ -2024391888;
lbl56:
                    // 2 sources

                    block21: while (true) {
                        switch (var4_2) {
                            case 2015972590: {
                                var3_3 ^= var4_2 ^ -1033680187;
                                ** break;
                            }
                            case -740117611: {
                                v0 = true;
                                ** GOTO lbl75
                            }
                            case -880534682: {
                                var4_2 = (var2_1 | var5) ^ 2003098862;
                            }
                            default: {
                                continue block21;
                            }
lbl68:
                            // 1 sources

                            var4_2 = (var2_1 | var5) ^ 748536907;
                            continue block21;
                            case -2011452624: 
                        }
                        break;
                    }
                    var0_5 = (jy)var1_4;
                } while (var0_5.guardManualInteractions());
                var3_3 ^= -1169553877;
                v0 = false;
lbl75:
                // 2 sources

                var3_3 ^= 1654538928;
                return v0;
                case 57518949: {
                    return ko.a;
                }
                case 1475512954: 
            }
            break;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean renderSilentBody() {
        block26: {
            var5 = 1131800526;
            var2_1 = ko.c & 1131800526 ^ -879946763;
            var4_2 = 0;
            var3_3 = (var2_1 | var5) ^ -605048434;
            var4_2 = (var2_1 | var5) ^ -151366103;
            block19: while (true) {
                switch (var4_2) {
                    case 151461433: {
                        if (G.enabled()) {
                            var4_2 = (var2_1 | var5) ^ 2142479386;
                            continue block19;
                        }
                        ** GOTO lbl34
                    }
                    case -1269935131: {
                        var3_3 ^= var4_2 ^ 448253431;
                        ** break;
                    }
                    case 1023910358: {
                        ** GOTO lbl48
                    }
lbl18:
                    // 1 sources

                    var4_2 = (var2_1 | var5) ^ 1856857700;
                    continue block19;
                    case -776030069: {
                        var3_3 ^= var4_2 ^ -1843931959;
                        var4_2 = (var2_1 | var5) ^ 1998636844;
                        ** GOTO lbl45
                    }
                    case 1508908655: {
                        var1_5 = ko.a;
                        if (!(var1_5 instanceof jy)) ** GOTO lbl79
                        ** GOTO lbl38
                    }
                    case 197629354: {
                        var3_3 ^= var4_2 ^ -1102256626;
                        ** GOTO lbl36
                    }
                    case -1509057291: {
                        var3_3 ^= var4_2 ^ -1099826817;
                        ** GOTO lbl40
                    }
lbl34:
                    // 1 sources

                    var4_2 = (var2_1 | var5) ^ 1844472586;
                    continue block19;
lbl36:
                    // 1 sources

                    var4_2 = (var2_1 | var5) ^ -1023743546;
                    continue block19;
lbl38:
                    // 1 sources

                    var4_2 = (var2_1 | var5) ^ -1203409034;
                    if (true) ** GOTO lbl-1000
lbl40:
                    // 1 sources

                    var4_2 = (var2_1 | var5) ^ -1844582000;
                    continue block19;
                    case -1126354733: {
                        if (!ko.b) ** GOTO lbl54
                        var4_2 = (var2_1 | var5) ^ -1069915563;
                    }
lbl45:
                    // 3 sources

                    default: {
                        continue block19;
                    }
                    {
                    }
lbl48:
                    // 1 sources

                    var4_2 = (var2_1 | var5) ^ 440618868;
                    continue block19;
                    case 1725537068: {
                        var3_3 ^= var4_2 ^ 62568563;
                        var4_2 = (var2_1 | var5) ^ -1900824343;
                        continue block19;
                    }
lbl54:
                    // 1 sources

                    var4_2 = (var2_1 | var5) ^ -1390121773;
                    continue block19;
lbl56:
                    // 1 sources

                    while (true) {
                        v0 = true;
                        break block26;
                        break;
                    }
                    case -1521446501: {
                        return true;
                    }
                    block21: while (true) {
                        switch (var4_2) lbl-1000:
                        // 2 sources

                        {
                            default: {
                                continue block21;
                            }
                            case 1218045150: {
                                var0_4 = (jy)var1_5;
                                if (!var0_4.renderSilentBody()) break;
                                var3_3 ^= 56903865;
                                ** continue;
                            }
                            case -67661626: {
                                var3_3 ^= var4_2 ^ -124528513;
                                ** GOTO lbl81
                            }
                            case 1941477513: {
                                var4_2 = (var2_1 | var5) ^ -2090593503;
                                continue block21;
                            }
                            case 1527158834: {
                                v0 = false;
                                break block26;
                            }
                        }
lbl79:
                        // 2 sources

                        var4_2 = (var2_1 | var5) ^ 805988153;
                        continue;
lbl81:
                        // 1 sources

                        var4_2 = (var2_1 | var5) ^ -1862570035;
                    }
                    case 1162759958: 
                }
                break;
            }
            return false;
        }
        var3_3 ^= -1575122351;
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    public static void resetOwner(Object var0) {
        block17: {
            block15: {
                block14: {
                    block16: {
                        break block16;
lbl1:
                        // 4 sources

                        block9: while (true) {
                            switch (var3_3) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    default: {
                                        continue block9;
                                    }
                                    break;
                                }
                                case -1117138524: {
                                    ko.Dp();
                                }
                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -475177673;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case 650863272: {
                                    break block14;
                                }
                                case 2029875953: {
                                    if (ko.a != var0) ** continue;
                                    break block15;
                                }
                                case -1411602455: {
                                    break;
                                }
lbl18:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1555633874;
                                    ** continue;
                                    break;
                                }
                                case -3871123: {
                                    return;
                                }
                                case -871140574: {
                                    var2_4 ^= var3_3 ^ 1587488233;
                                    ** continue;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ 396945661;
                            continue;
                            break;
                        }
                    }
                    var4_1 = 1538427743;
                    var1_2 = ko.c & 1538427743 ^ -2086956833;
                    var3_3 = 0;
                    break block17;
                }
                var3_3 = (var1_2 | var4_1) ^ 1725057659;
                ** GOTO lbl1
lbl36:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 612332978;
                    ** GOTO lbl1
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -42927753;
            ** GOTO lbl1
            {
                ** case 941016808:
            }
lbl43:
            // 1 sources

            var2_4 ^= var3_3 ^ 282811567;
            ** while (true)
        }
        var2_4 = (var1_2 | var4_1) ^ -1891144950;
        var3_3 = (var1_2 | var4_1) ^ 1885813814;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static void release(Object object) {
        int n2 = -2141167258;
        int n3 = c & 0x80606166 ^ 0x1632ED9B;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xCDE41F96;
        n4 = (n3 | n2) ^ 0x31B244;
        boolean bl2 = true;
        block9: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0x7251B61F;
            }
            block10: while (true) {
                switch (n4) {
                    default: {
                        continue block10;
                    }
                    case -825574487: {
                        if (a != object) continue block9;
                        n4 = (n3 | n2) ^ 0x23DFDCB4;
                        continue block10;
                    }
                    case -1773969477: {
                        n4 = (n3 | n2) ^ 0x45B94392;
                        continue block10;
                    }
                    case -1246940853: {
                        n4 = (n3 | n2) ^ 0xFB46AFA4;
                        continue block10;
                    }
                    case -467444768: {
                        n5 ^= n4 ^ 0x73642F4E;
                        n4 = (n3 | n2) ^ 0x81EE23BF;
                        continue block10;
                    }
                    case -741626259: {
                        n5 ^= n4 ^ 0x90866E8;
                        n4 = (n3 | n2) ^ 0x58B85656;
                        continue block10;
                    }
                    case 1832141403: {
                        ko.Dp();
                        continue block9;
                    }
                    case 396152384: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static void Dp() {
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
    public static void reset() {
        block68: {
            block70: {
                block73: {
                    block72: {
                        block71: {
                            block69: {
                                break block73;
lbl1:
                                // 1 sources

                                while (true) {
                                    var1_3 ^= var2_2 ^ 238437192;
                                    break block68;
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    var2_2 = (var0_1 | var3) ^ -2089253448;
                                    ** GOTO lbl45
                                    break;
                                }
lbl7:
                                // 1 sources

                                return;
lbl9:
                                // 1 sources

                                while (true) {
                                    var2_2 = (var0_1 | var3) ^ 1165744990;
                                    ** GOTO lbl45
lbl12:
                                    // 1 sources

                                    while (true) {
                                        var1_3 ^= var2_2 ^ 1319463858;
                                        break block69;
                                        break;
                                    }
                                    break;
                                }
lbl15:
                                // 1 sources

                                while (true) {
                                    var2_2 = (var0_1 | var3) ^ 1909822695;
                                    ** GOTO lbl45
lbl18:
                                    // 1 sources

                                    while (true) {
                                        var1_3 ^= var2_2 ^ -834869109;
                                        ** GOTO lbl90
                                        break;
                                    }
lbl21:
                                    // 1 sources

                                    while (true) {
                                        var1_3 ^= var2_2 ^ 113653413;
                                        break block70;
                                        break;
                                    }
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var2_2 = (var0_1 | var3) ^ 1725324405;
                                        ** GOTO lbl45
lbl27:
                                        // 1 sources

                                        while (true) {
                                            var1_3 ^= var2_2 ^ -575961113;
                                            ** GOTO lbl85
                                            break;
                                        }
lbl30:
                                        // 2 sources

                                        while (true) {
                                            var2_2 = (var0_1 | var3) ^ -1609962956;
                                            ** GOTO lbl45
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            var2_2 = (var0_1 | var3) ^ 1957110140;
                            if (true) ** GOTO lbl45
                            block50: while (true) {
                                block74: {
                                    var2_2 = (var0_1 | var3) ^ -215555547;
                                    break block74;
lbl39:
                                    // 1 sources

                                    while (true) {
                                        var1_3 ^= var2_2 ^ -1415058558;
                                        break block68;
                                        break;
                                    }
lbl42:
                                    // 1 sources

                                    while (true) {
                                        ko.a = 0.0f;
                                        ** continue;
                                        break;
                                    }
                                }
lbl46:
                                // 18 sources

                                block53: while (true) {
                                    switch (var2_2) lbl-1000:
                                    // 6 sources

                                    {
                                        default: {
                                            continue block53;
                                        }
                                        case 581382720: {
                                            break block50;
                                        }
                                        case -1909818598: {
                                            ** continue;
                                        }
                                        case 1942836259: {
                                            ** continue;
                                        }
                                        case -449999701: {
                                            break block71;
                                        }
                                        case 1529418510: {
                                            ** continue;
                                        }
                                        case 1801778632: {
                                            ** continue;
                                        }
                                        case -966069390: {
                                            ** continue;
                                        }
                                        case -1104595018: {
                                            break;
                                        }
                                        case 2089249349: {
                                            ** continue;
                                        }
                                        case 553126351: {
                                            ** GOTO lbl30
                                        }
                                        case -1895632759: {
                                            ** continue;
                                        }
                                        case -1165740893: {
                                            ** continue;
                                        }
                                        case 1038207854: {
                                            ** continue;
                                        }
                                        case 215551448: {
                                            var1_3 ^= var2_2 ^ -1563611444;
                                            break block72;
                                        }
                                        case -1622322841: {
                                            ko.b = false;
                                            continue block50;
                                        }
lbl82:
                                        // 2 sources

                                        while (true) {
                                            var2_2 = (var0_1 | var3) ^ 1895636852;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl85:
                                        // 1 sources

                                        var2_2 = (var0_1 | var3) ^ -1993685901;
                                        ** GOTO lbl-1000
lbl87:
                                        // 1 sources

                                        while (true) {
                                            var2_2 = (var0_1 | var3) ^ 1459251663;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl90:
                                        // 1 sources

                                        var2_2 = (var0_1 | var3) ^ 1520945550;
                                        ** GOTO lbl-1000
                                        case -1915469151: {
                                            var1_3 ^= var2_2 ^ 1171627157;
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            var2_2 = (var0_1 | var3) ^ 1104599115;
                            ** GOTO lbl46
lbl97:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ -553130446;
                                ** GOTO lbl46
                                break;
                            }
lbl100:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ -1529414413;
                                ** GOTO lbl46
                                break;
                            }
                            {
                                case 1049401272: {
                                    var1_3 ^= var2_2 ^ 222388516;
                                    ** GOTO lbl82
                                }
                            }
lbl106:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ -583931373;
                                ** GOTO lbl46
                                break;
                            }
lbl109:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ -1049397179;
                                ** GOTO lbl46
                                break;
                            }
                            {
                                case 1993681806: {
                                    ko.c = 0.0;
                                    ** continue;
                                }
                                case -412439801: {
                                    ko.a = false;
                                    ** continue;
                                }
                            }
                            var2_2 = (var0_1 | var3) ^ -1038211949;
                            ** GOTO lbl46
lbl120:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ -788291769;
                                ** GOTO lbl46
                                break;
                            }
lbl123:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ -1801774539;
                                ** GOTO lbl46
                                break;
                            }
                            {
                                case -1957114239: {
                                    ko.a = null;
                                    ** continue;
                                }
                            }
lbl129:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ -581378627;
                                ** GOTO lbl46
                                break;
                            }
                        }
                        var2_2 = (var0_1 | var3) ^ 1622326938;
                        ** GOTO lbl46
                    }
                    var2_2 = (var0_1 | var3) ^ 412435706;
                    ** GOTO lbl46
lbl138:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ -918592266;
                        ** GOTO lbl46
                        break;
                    }
                    {
                        case -1725320312: {
                            ko.f = 0.0;
                            ** continue;
                        }
                        case 385805452: {
                            switch (var1_3) {
                                default: {
                                    ** continue;
                                }
                                case 648041980: {
                                    ** continue;
                                }
                                case -1584756226: 
                            }
                            var2_2 = (var0_1 | var3) ^ 966073487;
                            ** GOTO lbl-1000
                        }
                    }
lbl153:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ -1365596495;
                        ** GOTO lbl46
                        break;
                    }
                    {
                        case 1365592396: {
                            var1_3 ^= var2_2 ^ -771163747;
                            ** continue;
                        }
                    }
lbl159:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ 1915465052;
                        ** GOTO lbl46
                        break;
                    }
                }
                var3 = -176198947;
                var0_1 = ko.c & -176198947 ^ 788262305;
                var2_2 = 0;
                var1_3 = (var0_1 | var3) ^ -648037887;
                ** while (true)
                {
                    case 1609958857: {
                        switch (var1_3) {
                            case 953688895: {
                                ** continue;
                            }
                            default: {
                                ** continue;
                            }
                            ** case 2122244975:
lbl175:
                            // 1 sources

                            ** continue;
                        }
                    }
                    case -1520949645: {
                        ko.a = null;
                        ** continue;
                    }
                    case 583927278: {
                        ko.b = 0.0f;
                        ** continue;
                    }
                }
lbl182:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ -1942832162;
                    ** GOTO lbl46
                    break;
                }
                {
                    case 918588171: {
                        var1_3 ^= var2_2 ^ 377131580;
                        ** continue;
                    }
                }
            }
            var2_2 = (var0_1 | var3) ^ -385809551;
            ** GOTO lbl46
            {
                case -1459255758: {
                    var1_3 ^= var2_2 ^ 1390043821;
                    ** continue;
                }
            }
        }
        var2_2 = (var0_1 | var3) ^ 449995606;
        ** while (true)
        {
            ** case 788295866:
        }
lbl198:
        // 1 sources

        var1_3 ^= var2_2 ^ -219427592;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    static void tick() {
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
    public static boolean active() {
        int n2 = c & 0x325CEB03 ^ 0xF010343B;
        int n3 = 0;
        int n4 = (n2 | 0x325CEB03) ^ 0x3D245341;
        n3 = (n2 | 0x325CEB03) ^ 0x9B224A18;
        block5: while (true) {
            switch (n3) {
                case 1112209433: {
                    n4 ^= n3 ^ 0xB46CA1A8;
                    n3 = (n2 | 0x325CEB03) ^ 0x375D5851;
                }
                default: {
                    continue block5;
                }
                case -989747350: {
                    return b;
                }
                case 1769911587: 
            }
            n3 = (n2 | 0x325CEB03) ^ 0xB0160722;
        }
    }

    /*
     * Exception decompiling
     */
    public static boolean diverged() {
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
    public static float wireYaw() {
        block38: {
            block41: {
                block40: {
                    block39: {
                        block42: {
                            block43: {
                                block37: {
                                    break block43;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_2 ^ 161732124;
                                        break block37;
                                        break;
                                    }
lbl4:
                                    // 1 sources

                                    while (true) {
                                        var3_2 = (var1_1 | var4) ^ 119636865;
                                        break block38;
                                        break;
                                    }
lbl7:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_2 ^ -1804219742;
                                        break block39;
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var3_2 = (var1_1 | var4) ^ -69395131;
                                        break block38;
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_2 ^ 1219472885;
                                        ** continue;
                                        break;
                                    }
lbl16:
                                    // 1 sources

                                    return v0;
lbl18:
                                    // 1 sources

                                    while (true) {
                                        var3_2 = (var1_1 | var4) ^ 1677437447;
                                        break block38;
                                        break;
                                    }
                                }
                                var3_2 = (var1_1 | var4) ^ -1540146704;
                                break block38;
                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ -2103603759;
                                    break block38;
                                    break;
                                }
lbl27:
                                // 1 sources

                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ -1407530285;
                                    break block38;
                                    break;
                                }
lbl30:
                                // 1 sources

                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ -1168896746;
                                    break block40;
                                    break;
                                }
lbl33:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_2 ^ 2085985705;
                                    break block41;
                                    break;
                                }
                            }
                            var4 = 1849872756;
                            var1_1 = ko.c & 1849872756 ^ -1879639337;
                            var3_2 = 0;
                            var2_4 = (var1_1 | var4) ^ -1639283310;
                            ** while (true)
lbl42:
                            // 1 sources

                            while (true) {
                                v0 = ko.d;
                                ** GOTO lbl99
                                break;
                            }
lbl45:
                            // 1 sources

                            while (true) {
                                if (var0_3.field_1724 == null) break block42;
                                ** continue;
                                break;
                            }
lbl48:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | var4) ^ 2080568046;
                                break block38;
                                break;
                            }
lbl51:
                            // 1 sources

                            while (true) {
                                v0 = 0.0f;
                                ** GOTO lbl99
                                break;
                            }
lbl54:
                            // 1 sources

                            while (true) {
                                v0 = var0_3.field_1724.method_36454();
                                ** GOTO lbl99
                                break;
                            }
                        }
                        var3_2 = (var1_1 | var4) ^ 1493784853;
                        break block38;
lbl60:
                        // 1 sources

                        while (true) {
                            var0_3 = class_310.method_1551();
                            ** continue;
                            break;
                        }
                    }
                    var3_2 = (var1_1 | var4) ^ -533749524;
                }
lbl66:
                // 2 sources

                block34: while (true) {
                    switch (var3_2) {
                        default: {
                            continue block34;
                        }
                        case -145523867: {
                            ** continue;
                        }
                        case 265902875: {
                            ** continue;
                        }
                        case 1436743393: {
                            ** GOTO lbl97
                        }
                    }
                    break;
                }
            }
            var3_2 = (var1_1 | var4) ^ 1826447213;
        }
        block35: while (true) {
            switch (var3_2) lbl-1000:
            // 2 sources

            {
                default: {
                    continue block35;
                }
                case 1227198856: {
                    ** continue;
                }
                case -1224760606: {
                    ** continue;
                }
                case -1812723431: {
                    ** continue;
                }
                case 1271251463: {
                    ** continue;
                }
                case 1139552548: {
                    ** continue;
                }
                case 338421426: {
                    ** continue;
                }
                case -388532106: {
                    ** continue;
                }
lbl97:
                // 1 sources

                var3_2 = (var1_1 | var4) ^ 413499538;
                ** continue;
lbl99:
                // 3 sources

                var2_4 ^= 1353845166;
                ** continue;
                case -1945284112: {
                    var2_4 ^= var3_2 ^ 1918721767;
                    ** continue;
                }
                case -2094291814: {
                    if (!ko.b) ** continue;
                    var3_2 = (var1_1 | var4) ^ -1496094081;
                    ** GOTO lbl-1000
                }
                case 1835759142: 
            }
            break;
        }
        var2_4 ^= var3_2 ^ -742572379;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static float wirePitch() {
        var4 = -625733282;
        var1_1 = ko.c & -625733282 ^ -211852744;
        var3_2 = 0;
        var2_4 = (var1_1 | var4) ^ 613417145;
        var3_2 = (var1_1 | var4) ^ -69133753;
        if (true) ** GOTO lbl57
lbl7:
        // 1 sources

        while (true) {
            var3_2 = (var1_1 | var4) ^ -104358232;
            if (true) ** GOTO lbl15
            break;
        }
        block18: while (true) {
            var3_2 = (var1_1 | var4) ^ 1409541767;
            if (true) ** GOTO lbl15
            block19: while (true) {
                var3_2 = (var1_1 | var4) ^ 2125654996;
lbl15:
                // 4 sources

                block20: while (true) {
                    switch (var3_2) {
                        case -1531050466: {
                            var2_4 ^= var3_2 ^ -756225914;
                            ** GOTO lbl43
                        }
                        case -1342401031: {
                            var2_4 ^= var3_2 ^ -1066412818;
                            continue block19;
                        }
                        case 37285334: {
                            v0 = var0_3.field_1724.method_36455();
                            ** GOTO lbl49
                        }
                        case -2058512214: {
                            v0 = 0.0f;
                            ** GOTO lbl49
                        }
                        case -2107458249: {
                            var2_4 ^= var3_2 ^ -302908384;
                            ** continue;
                        }
                        case 1235104223: {
                            var2_4 ^= var3_2 ^ 1348443728;
                            ** GOTO lbl45
                        }
                        case -1249192957: {
                            var2_4 ^= var3_2 ^ -1014108814;
                            var3_2 = (var1_1 | var4) ^ -1299366117;
                            ** break;
                        }
                        case 1232227429: {
                            var3_2 = ko.b != false ? (var1_1 | var4) ^ -1302248799 : (var1_1 | var4) ^ 1598125408;
                        }
lbl41:
                        // 3 sources

                        default: {
                            continue block20;
                        }
lbl43:
                        // 1 sources

                        var3_2 = (var1_1 | var4) ^ -88085526;
                        continue block20;
lbl45:
                        // 1 sources

                        var3_2 = (var1_1 | var4) ^ -595045470;
                        continue block20;
                        case 662118620: {
                            v0 = ko.c;
lbl49:
                            // 3 sources

                            var2_4 ^= -1238109306;
                            return v0;
                        }
                        case 21010580: 
                    }
                    if (var0_3.field_1724 == null) continue block18;
                    var3_2 = (var1_1 | var4) ^ 2040385097;
                    continue;
                    break;
                }
                break;
            }
            break;
        }
        block21: while (true) {
            var3_2 = (var1_1 | var4) ^ 149732036;
lbl57:
            // 2 sources

            block22: while (true) {
                switch (var3_2) {
                    default: {
                        continue block22;
                    }
                    case -216806982: {
                        var0_3 = class_310.method_1551();
                        break block21;
                    }
                    case 1993017: {
                        var3_2 = (var1_1 | var4) ^ 289784067;
                        continue block22;
                    }
                    case -356863363: {
                        var2_4 ^= var3_2 ^ -845489704;
                        continue block21;
                    }
                }
                break;
            }
            break;
        }
        var3_2 = (var1_1 | var4) ^ 1316333437;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static float renderYaw(float var0) {
        block38: {
            block41: {
                block42: {
                    block43: {
                        block37: {
                            block39: {
                                block40: {
                                    block36: {
                                        break block43;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var3_4 ^= var4_3 ^ 1616188263;
                                            break block36;
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ -1360363111;
                                            ** GOTO lbl85
                                            break;
                                        }
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ 402739920;
                                            break block37;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        while (true) {
                                            if (var1_5.field_1724 == null) break block38;
                                            break block39;
                                            break;
                                        }
lbl13:
                                        // 1 sources

                                        return class_3532.method_17821((float)var0, (float)ko.b, (float)ko.d);
lbl15:
                                        // 1 sources

                                        while (true) {
                                            var3_4 ^= var4_3 ^ 1380292099;
                                            break block40;
                                            break;
                                        }
lbl18:
                                        // 1 sources

                                        while (true) {
                                            var1_5 = class_310.method_1551();
                                            var4_3 = (var2_2 | var5_1) ^ -537941561;
                                            ** GOTO lbl85
                                            break;
                                        }
lbl22:
                                        // 1 sources

                                        while (true) {
                                            v0 = 0.0f;
                                            break block41;
                                            break;
                                        }
lbl25:
                                        // 1 sources

                                        while (true) {
                                            v0 = var1_5.field_1724.method_36454();
                                            break block41;
                                            break;
                                        }
                                    }
                                    var4_3 = (var2_2 | var5_1) ^ -1146121514;
                                    break block37;
                                }
                                var4_3 = (var2_2 | var5_1) ^ 1094873600;
                                ** GOTO lbl85
                            }
                            var4_3 = (var2_2 | var5_1) ^ 1946648372;
                            ** GOTO lbl85
lbl37:
                            // 1 sources

                            while (true) {
                                var3_4 ^= var4_3 ^ 1876376293;
                                ** continue;
                                break;
                            }
                        }
lbl41:
                        // 2 sources

                        block27: while (true) {
                            switch (var4_3) {
                                default: {
                                    continue block27;
                                }
                                case 571289574: {
                                    ** continue;
                                }
                                case -714773151: {
                                    ** continue;
                                }
                                case 1993059687: {
                                    break block42;
                                }
                            }
                            break;
                        }
                    }
                    var5_1 = 717382583;
                    var2_2 = ko.c & 717382583 ^ 1686674437;
                    var4_3 = 0;
                    var3_4 = (var2_2 | var5_1) ^ -296793563;
                    ** while (true)
lbl57:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 978957074;
                        ** GOTO lbl85
                        break;
                    }
                }
                var4_3 = (var2_2 | var5_1) ^ 1288163409;
                ** while (true)
lbl63:
                // 1 sources

                return v0;
lbl65:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -407772009;
                    ** GOTO lbl85
                    break;
                }
            }
            var3_4 ^= -579206680;
            ** while (true)
        }
        var4_3 = (var2_2 | var5_1) ^ -517860688;
        ** GOTO lbl85
lbl74:
        // 1 sources

        while (true) {
            var3_4 ^= var4_3 ^ -802613636;
            ** continue;
            break;
        }
        while (true) {
            var4_3 = (var2_2 | var5_1) ^ 931066203;
            if (true) ** GOTO lbl85
            break;
        }
lbl80:
        // 1 sources

        while (true) {
            if (ko.b) ** continue;
            ** continue;
            break;
        }
        block34: while (true) {
            var4_3 = (var2_2 | var5_1) ^ 601577985;
lbl85:
            // 9 sources

            block35: while (true) {
                switch (var4_3) {
                    default: {
                        continue block35;
                    }
                    case -1071612370: {
                        ** continue;
                    }
                    case 797478327: {
                        ** continue;
                    }
                    case 1504972524: {
                        ** continue;
                    }
                    case 1094401546: {
                        ** continue;
                    }
                    case -1988420832: {
                        ** continue;
                    }
                    case 1418939557: {
                        ** continue;
                    }
                    case 449675395: {
                        ** continue;
                    }
                    case 1293002166: {
                        ** continue;
                    }
                    case -1880560377: {
                        var3_4 ^= var4_3 ^ 1158446072;
                        break;
                    }
                    case -1322953104: {
                        var3_4 ^= var4_3 ^ 1553120408;
                        continue block34;
                    }
                }
                var4_3 = (var2_2 | var5_1) ^ 804372925;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static float renderPitch(float var0) {
        block25: {
            break block25;
lbl1:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 1711960859;
                ** GOTO lbl38
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ -2091859614;
                ** GOTO lbl38
                break;
            }
            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 67063854;
                ** GOTO lbl38
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 783596161;
                if (true) ** GOTO lbl38
                break;
            }
        }
        var5_1 = 1381380524;
        var2_2 = ko.c & 1381380524 ^ -1406809951;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ -553071892;
        var4_3 = (var2_2 | var5_1) ^ -212579324;
        block21: while (true) {
            switch (var4_3) {
                default: {
                    continue block21;
                }
                case 1883642868: {
                    var3_4 ^= var4_3 ^ -1392519507;
                    var4_3 = (var2_2 | var5_1) ^ 1742583183;
                    continue block21;
                }
                case 220444073: {
                    var4_3 = (var2_2 | var5_1) ^ -1909333415;
                    continue block21;
                }
                case -1716892638: 
            }
            break;
        }
        var1_5 = class_310.method_1551();
        ** while (true)
        block22: while (true) {
            var4_3 = (var2_2 | var5_1) ^ -330054482;
            if (true) ** GOTO lbl38
            block23: while (true) {
                var4_3 = (var2_2 | var5_1) ^ -1973738258;
lbl38:
                // 6 sources

                block24: while (true) {
                    switch (var4_3) {
                        case 304364803: {
                            var3_4 ^= var4_3 ^ -1368748696;
                            var4_3 = (var2_2 | var5_1) ^ -379685583;
                            continue block24;
                        }
                        case -1736602954: {
                            var3_4 ^= var4_3 ^ -192116634;
                            var4_3 = (var2_2 | var5_1) ^ -168626008;
                            continue block24;
                        }
                        case -792509652: {
                            var3_4 ^= var4_3 ^ 1821242183;
                            ** break;
                        }
                        case -1075087406: {
                            v0 = var1_5.field_1724.method_36455();
                            ** GOTO lbl72
                        }
                        case 388598940: {
                            v0 = 0.0f;
                            ** GOTO lbl72
                        }
                        case -41375357: {
                            var3_4 ^= var4_3 ^ -1221498486;
                            ** GOTO lbl74
                        }
                        case 1949097283: {
                            var3_4 ^= var4_3 ^ 86898493;
                            ** continue;
                        }
                        case 193265925: {
                            if (ko.b) ** continue;
                            continue block23;
                        }
lbl66:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 1100779135;
                        default: {
                            continue block24;
                        }
                        case 2099722447: {
                            if (var1_5.field_1724 == null) continue block22;
                            ** continue;
                        }
lbl72:
                        // 2 sources

                        var3_4 ^= 590639892;
                        return v0;
lbl74:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 1292951939;
                        continue block24;
                        case -1285089234: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return class_3532.method_16439((float)var0, (float)ko.a, (float)ko.c);
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static class_243 wireDirection() {
        int n2 = c & 0xE6027ED3 ^ 0xB6302459;
        int n3 = 0;
        int n4 = (n2 | 0xE6027ED3) ^ 0xF6738F4;
        n3 = (n2 | 0xE6027ED3) ^ 0xCC602A96;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 739938767: {
                    n4 ^= n3 ^ 0xF7F75437;
                    n3 = (n2 | 0xE6027ED3) ^ 0xF069ECAC;
                    continue block5;
                }
                case 978474061: {
                    n3 = (n2 | 0xE6027ED3) ^ 0xDA28EF14;
                    continue block5;
                }
                case 106664567: 
            }
            break;
        }
        return class_243.method_1030((float)ko.wirePitch(), (float)ko.wireYaw());
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static float physicsYaw(Object var0, float var1_1) {
        var6_2 = -1654747755;
        var3_3 = ko.c & -1654747755 ^ -737531766;
        var5_4 = 0;
        var4_5 = (var3_3 | var6_2) ^ 748145716;
        var5_4 = (var3_3 | var6_2) ^ 1138981926;
        ** GOTO lbl48
lbl7:
        // 1 sources

        while (true) {
            var5_4 = (var3_3 | var6_2) ^ 1905424009;
            ** GOTO lbl48
            {
                var5_4 = (var3_3 | var6_2) ^ 267537751;
                block21: while (true) {
                    block27: {
                        switch (var5_4) {
                            case -618880048: {
                                v0 = var1_1;
                                break;
                            }
                            case -905375716: {
                                v0 = ko.d;
                                break;
                            }
                            case -760422200: {
                                var4_5 ^= var5_4 ^ -615032070;
                                ** break;
                            }
                            case -415461109: {
                                if (var0 == var2_6.field_1724) continue block20;
                                var5_4 = (var3_3 | var6_2) ^ -1350801921;
                                break block27;
                            }
lbl26:
                            // 1 sources

                            var5_4 = (var3_3 | var6_2) ^ 391626115;
                            break block27;
                            case -676501230: {
                                var4_5 ^= var5_4 ^ -754562294;
                                var5_4 = (var3_3 | var6_2) ^ 979516564;
                                break block27;
                            }
                            case 1914882144: {
                                var4_5 ^= var5_4 ^ 2077848146;
                                var5_4 = (var3_3 | var6_2) ^ 104992335;
                                continue block21;
                            }
                        }
                        var4_5 ^= -1050874098;
                        return v0;
                    }
lbl39:
                    // 2 sources

                }
            }
lbl40:
            // 2 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ 1596792192;
                ** GOTO lbl48
                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ 813975095;
                    if (true) ** GOTO lbl48
                    break;
                }
                break;
            }
            break;
        }
        block25: while (true) {
            var5_4 = (var3_3 | var6_2) ^ -330196488;
lbl48:
            // 5 sources

            block26: while (true) {
                switch (var5_4) {
                    default: {
                        continue block26;
                    }
                    case -29563768: {
                        if (hh.properMovement()) ** continue;
                        ** GOTO lbl40
                    }
                    case 1869806419: {
                        var4_5 ^= var5_4 ^ -370470931;
                        var5_4 = (var3_3 | var6_2) ^ -991232545;
                        continue block26;
                    }
                    case -1631727175: {
                        var5_4 = (var3_3 | var6_2) ^ -1305717044;
                        continue block26;
                    }
                    case -1395860714: {
                        var5_4 = (var3_3 | var6_2) ^ 593643799;
                        continue block26;
                    }
                    case 500246425: {
                        var2_6 = class_310.method_1551();
                        var5_4 = (var3_3 | var6_2) ^ 183747725;
                        ** GOTO lbl39
                    }
                    case -304419928: {
                        var4_5 ^= var5_4 ^ -953547116;
                        ** break;
                    }
                    case 431247424: {
                        if (ko.b) ** break;
                        ** continue;
                        ** continue;
                    }
                    case -2106347489: {
                        var4_5 ^= var5_4 ^ 1021836692;
                        continue block25;
                    }
lbl79:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ -1064334842;
                    continue block26;
                    case 823080039: 
                }
                break;
            }
            break;
        }
        return var1_1;
    }

    /*
     * Exception decompiling
     */
    public static class_10185 remapKeys(class_10185 var0, class_241 var1_1) {
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
     * Enabled aggressive block sorting
     */
    public static class_241 remappedMoveVector() {
        int n2 = c & 0x16968DF ^ 0x90040817;
        int n3 = 0;
        int n4 = (n2 | 0x16968DF) ^ 0xB2B49265;
        n3 = (n2 | 0x16968DF) ^ 0x6D689D3D;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -66718238: {
                    n3 = (n2 | 0x16968DF) ^ 0x635EAC9D;
                    continue block5;
                }
                case -231488446: {
                    n4 ^= n3 ^ 0x4625EC53;
                    n3 = (n2 | 0x16968DF) ^ 0x64B8602F;
                    continue block5;
                }
                case -170587920: 
            }
            break;
        }
        return a;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double Dq(double d2, double d3, float f2) {
        int n2 = c & 0x80D3039E ^ 0xC736A8DF;
        int n3 = 0;
        int n4 = (n2 | 0x80D3039E) ^ 0xA9DA2D5;
        n3 = (n2 | 0x80D3039E) ^ 0x4C29B9A3;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1948380548: {
                    n3 = (n2 | 0x80D3039E) ^ 0x2121EFC9;
                    continue block5;
                }
                case -422165482: {
                    n4 ^= n3 ^ 0x5D329502;
                    n3 = (n2 | 0x80D3039E) ^ 0x3FE35A33;
                    continue block5;
                }
                case -132845076: 
            }
            break;
        }
        double d4 = Math.toRadians(f2);
        n4 ^= 0xFCEFC39E;
        return d2 * Math.cos(d4) - d3 * Math.sin(d4);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static double Dr(double d2, double d3, float f2) {
        int n2 = c & 0x7BCD8E49 ^ 0xF5EBA722;
        int n3 = 0;
        int n4 = (n2 | 0x7BCD8E49) ^ 0x548624F8;
        n3 = (n2 | 0x7BCD8E49) ^ 0xFAED54D3;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 2032577965: {
                    double d4 = Math.toRadians(f2);
                    n4 ^= 0x7A83ACA0;
                    return d3 * Math.cos(d4) + d2 * Math.sin(d4);
                }
                case 84081592: {
                    n3 = (n2 | 0x7BCD8E49) ^ 0x7691F2DA;
                    continue block5;
                }
                case -1988207183: 
            }
            n4 ^= n3 ^ 0xF518D15C;
            n3 = (n2 | 0x7BCD8E49) ^ 0x86C902C6;
        }
    }

    /*
     * Exception decompiling
     */
    public static void withWireRotation(Runnable var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [45[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
}

