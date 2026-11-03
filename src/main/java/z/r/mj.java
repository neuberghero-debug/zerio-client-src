/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2382
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import z.r.eA;
import z.r.iP;
import z.r.ko;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class mj {
    private static int a;
    private static final float[] a;
    private static final int[] a;
    private static final int b;
    public static final int c;
    private static final float[] b;

    /*
     * Enabled aggressive block sorting
     */
    private mj() {
        int n2 = c & 0xAC4A2D04 ^ 0xB6052D64;
        int n3 = (n2 | 0xAC4A2D04) ^ 0x9C5B516F;
        n3 ^= 0x1592E865;
        n3 ^= 0x205081C4;
    }

    /*
     * Exception decompiling
     */
    static void record() {
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
    public static void forget() {
        int n2 = 1022804415;
        int n3 = c & 0x3CF6C1BF ^ 0x34C8900C;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x5EBC391E;
        n4 = (n3 | n2) ^ 0x7DEFB034;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case 1091658123: {
                    n4 = (n3 | n2) ^ 0xB9DD482B;
                    continue block7;
                }
                case -997295848: {
                    n5 ^= n4 ^ 0xCC5FD7CB;
                    n4 = (n3 | n2) ^ 0xC2724EE2;
                    continue block7;
                }
                case -24338595: {
                    return;
                }
                case -2061264492: {
                    n5 ^= n4 ^ 0x6BEF7C3A;
                    n4 = (n3 | n2) ^ 0xACC69CA9;
                    continue block7;
                }
                case -1875358442: 
            }
            a = 0;
            n4 = (n3 | n2) ^ 0xF870A8A7;
        }
    }

    /*
     * Exception decompiling
     */
    public static boolean grimAccepts(class_2338 var0) {
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
    private static boolean xb(class_238 class_2383, class_243 class_2432, double d2, float f2, float f3) {
        int n2 = c & 0x7A9E3352 ^ 0x588985A4;
        int n3 = 0;
        int n4 = (n2 | 0x7A9E3352) ^ 0x473EBC0C;
        n3 = (n2 | 0x7A9E3352) ^ 0xC49CF06C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 873080845: {
                    n4 ^= n3 ^ 0xDC6AEADB;
                    n3 = (n2 | 0x7A9E3352) ^ 0x8427C28C;
                    continue block5;
                }
                case -21465734: {
                    class_243 class_2433 = class_243.method_1030((float)f3, (float)f2);
                    n4 ^= 0x30F194A4;
                    return class_2383.method_992(class_2432, class_2432.method_1019(class_2433.method_1021(d2))).isPresent();
                }
                case -1107081318: 
            }
            n3 = (n2 | 0x7A9E3352) ^ 0x4E959FFB;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean grimReachesEntity(class_238 var0, double var1_1) {
        var9_2 = 2023047210;
        var6_3 = mj.c & 2023047210 ^ 1597182574;
        var8_4 = 0;
        var7_7 = (var6_3 | var9_2) ^ 878460405;
        var8_4 = (var6_3 | var9_2) ^ 1901029115;
        if (true) ** GOTO lbl28
lbl7:
        // 1 sources

        while (true) {
            var7_7 ^= 1145941948;
            var5_8 = var3_5.field_1724.method_33571();
            var8_4 = (var6_3 | var9_2) ^ -305061466;
            ** GOTO lbl38
            break;
        }
lbl12:
        // 1 sources

        while (true) {
            var8_4 = (var6_3 | var9_2) ^ 1121875923;
            ** GOTO lbl78
            break;
        }
lbl15:
        // 2 sources

        while (true) {
            var8_4 = (var6_3 | var9_2) ^ -1444594951;
            if (true) ** GOTO lbl38
            break;
        }
lbl18:
        // 2 sources

        while (true) {
            var8_4 = (var6_3 | var9_2) ^ -102971695;
            ** GOTO lbl78
            break;
        }
        block29: while (true) {
            switch (var8_4) {
                case -2560479: {
                    var7_7 ^= var8_4 ^ 1001444733;
                    ** break;
                }
                case 251147413: {
                    var8_4 = (var6_3 | var9_2) ^ -2140160945;
                }
lbl28:
                // 3 sources

                default: {
                    continue block29;
                }
lbl30:
                // 1 sources

                var8_4 = (var6_3 | var9_2) ^ -1296032310;
                continue block29;
                case -847818844: 
            }
            break;
        }
        var3_5 = class_310.method_1551();
        var8_4 = (var6_3 | var9_2) ^ -1603835599;
        if (true) ** GOTO lbl78
        block30: while (true) {
            var8_4 = (var6_3 | var9_2) ^ 783548047;
lbl38:
            // 3 sources

            block31: while (true) {
                switch (var8_4) {
                    case -1883646499: {
                        v0 = false;
                        ** GOTO lbl68
                    }
                    case -1838779448: {
                        var7_7 ^= var8_4 ^ 1475000002;
                        var8_4 = (var6_3 | var9_2) ^ 1872939692;
                        continue block31;
                    }
                    case -172377818: {
                        v0 = true;
                        ** GOTO lbl68
                    }
                    case -1110764539: {
                        var7_7 ^= var8_4 ^ -1945361733;
                        var8_4 = (var6_3 | var9_2) ^ -1978733752;
                        continue block31;
                    }
                    case -1059280926: {
                        var7_7 ^= 560153808;
                        ** break;
                    }
                    case 1359260897: {
                        var7_7 ^= var8_4 ^ 1885857841;
                        var8_4 = (var6_3 | var9_2) ^ -1083443828;
                    }
                    default: {
                        continue block31;
                    }
lbl62:
                    // 1 sources

                    if (!mj.xb(var4_6, var5_8, var1_1, mj.a[1], mj.b[1])) ** GOTO lbl15
                    ** GOTO lbl70
                    case 269850818: {
                        if (mj.xb(var4_6, var5_8, var1_1, mj.a[0], mj.b[0])) ** break;
                        ** continue;
                        continue block30;
                    }
lbl68:
                    // 2 sources

                    var7_7 ^= -559431601;
                    return v0;
lbl70:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ -1032042901;
                    continue block31;
                    case -699242345: 
                }
                var7_7 ^= var8_4 ^ -409641431;
                var8_4 = (var6_3 | var9_2) ^ -267483213;
            }
            break;
        }
        block32: while (true) {
            var8_4 = (var6_3 | var9_2) ^ 96494958;
lbl78:
            // 4 sources

            block33: while (true) {
                switch (var8_4) {
                    default: {
                        continue block33;
                    }
                    case -158534917: {
                        var8_4 = (var6_3 | var9_2) ^ -1534155677;
                        continue block33;
                    }
                    case 1030301117: {
                        var4_6 = var0.method_1014(0.03);
                        ** continue;
                    }
                    case -1001772675: {
                        var7_7 ^= var8_4 ^ -1586195342;
                        ** continue;
                    }
                    case -540001441: {
                        var7_7 ^= var8_4 ^ -917881103;
                        var8_4 = (var6_3 | var9_2) ^ -534866238;
                        continue block33;
                    }
                    case -1616264020: {
                        if (var3_5.field_1724 == null) ** GOTO lbl18
                        var8_4 = (var6_3 | var9_2) ^ -1992580971;
                        continue block33;
                    }
                    case -616958451: {
                        if (mj.a >= 2) ** break;
                        ** continue;
                        var8_4 = (var6_3 | var9_2) ^ -1141015789;
                        continue block33;
                    }
                    case -2039769921: {
                        var7_7 ^= var8_4 ^ 653395574;
                        continue block32;
                    }
                    case 2054633216: 
                }
                break;
            }
            break;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public static class_3965 trace() {
        block26: {
            break block26;
lbl1:
            // 1 sources

            block13: while (true) {
                switch (var3_2) lbl-1000:
                // 6 sources

                {
                    while (true) {
                        default: {
                            continue block13;
                        }
                        break;
                    }
lbl6:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | var4) ^ 103003470;
                        ** GOTO lbl-1000
                        break;
                    }
lbl9:
                    // 2 sources

                    while (true) {
                        var2_4 ^= 2108431930;
                        ** GOTO lbl27
                        break;
                    }
                    while (true) {
                        var3_2 = (var1_1 | var4) ^ -781018991;
                        ** GOTO lbl-1000
                        break;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_2 ^ 440361432;
                        ** GOTO lbl43
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | var4) ^ -348491224;
                        ** GOTO lbl51
                        break;
                    }
                    case -813171120: {
                        v0 = mj.trace(ko.wireYaw(), ko.wirePitch());
                        ** GOTO lbl9
                    }
                    case 609363959: {
                        v0 = null;
                        ** continue;
                    }
lbl27:
                    // 1 sources

                    return v0;
lbl28:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | var4) ^ -1464913399;
                        ** GOTO lbl-1000
                        break;
                    }
lbl31:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | var4) ^ 918055343;
                        ** GOTO lbl-1000
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | var4) ^ -1941700470;
                        ** continue;
                        break;
                    }
                    case -14933327: {
                        var2_4 ^= var3_2 ^ -254306793;
                        ** continue;
                    }
                    case 1971033973: {
                        var2_4 ^= var3_2 ^ -980411986;
                        break block13;
                    }
lbl43:
                    // 1 sources

                    var3_2 = (var1_1 | var4) ^ -2123223341;
                    ** GOTO lbl51
lbl45:
                    // 1 sources

                    while (true) {
                        var0_3 = class_310.method_1551();
                        ** continue;
                        break;
                    }
                    case 676138862: {
                        var2_4 ^= var3_2 ^ -1733918283;
                        ** continue;
                    }
lbl51:
                    // 3 sources

                    block24: while (true) {
                        switch (var3_2) {
                            default: {
                                continue block24;
                            }
                            case 302376407: {
                                ** continue;
                            }
                            case -1214283950: {
                                ** continue;
                            }
                            ** case 2018359596:
lbl60:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
lbl61:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | var4) ^ 1319168173;
                        ** continue;
                        break;
                    }
                    case 1368434166: {
                        if (var0_3.field_1724 != null) ** continue;
                        ** continue;
                    }
                }
                break;
            }
            var3_2 = (var1_1 | var4) ^ -580014072;
            ** while (true)
        }
        var4 = -1188133457;
        var1_1 = mj.c & -1188133457 ^ -381742127;
        var3_2 = 0;
        var2_4 = (var1_1 | var4) ^ -618630962;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static class_3965 trace(float var0, float var1_1) {
        var8_2 = 1784234138;
        var5_3 = mj.c & 1784234138 ^ 1888239387;
        var7_4 = 0;
        var6_8 = (var5_3 | var8_2) ^ -55350755;
        var7_4 = (var5_3 | var8_2) ^ 121181820;
        if (true) ** GOTO lbl-1000
lbl7:
        // 1 sources

        while (true) {
            var7_4 = (var5_3 | var8_2) ^ -708936498;
            ** GOTO lbl42
            break;
        }
        while (true) {
            switch (var7_4) lbl-1000:
            // 2 sources

            {
                default: {
                    break;
                }
                case 2112121319: {
                    var7_4 = (var5_3 | var8_2) ^ 1541677448;
                    break;
                }
                case 1483596597: {
                    var2_5 = class_310.method_1551();
                    var7_4 = (var5_3 | var8_2) ^ 1357787881;
                    if (true) ** GOTO lbl42
                }
                case 557407763: {
                    var6_8 ^= var7_4 ^ 1890172133;
                    var7_4 = (var5_3 | var8_2) ^ 581999790;
                    break;
                }
            }
        }
        block17: while (true) {
            var7_4 = (var5_3 | var8_2) ^ -702188286;
            ** GOTO lbl42
lbl29:
            // 1 sources

            while (true) {
                var6_8 ^= -226863119;
                var4_7 = var3_6.method_1019(class_243.method_1030((float)var1_1, (float)var0).method_1021(var2_5.field_1724.method_55754()));
                var6_8 ^= -1902517169;
                return var2_5.field_1687.method_17742(new class_3959(var3_6, var4_7, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)var2_5.field_1724));
            }
            while (true) {
                var7_4 = (var5_3 | var8_2) ^ -1234744638;
                ** GOTO lbl42
lbl37:
                // 1 sources

                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ -1611519177;
                    if (true) ** GOTO lbl42
                    break;
                }
                break;
            }
            block21: while (true) {
                var7_4 = (var5_3 | var8_2) ^ -742913139;
lbl42:
                // 6 sources

                block22: while (true) {
                    switch (var7_4) {
                        default: {
                            continue block22;
                        }
                        case -1393030503: {
                            var6_8 ^= var7_4 ^ -2136170537;
                            ** continue;
                        }
                        case -1352465579: {
                            var3_6 = var2_5.field_1724.method_33571();
                            ** continue;
                        }
                        case 1978456839: {
                            if (var2_5.field_1687 != null) ** continue;
                            continue block17;
                        }
                        case 1250723910: {
                            var7_4 = (var5_3 | var8_2) ^ 254911644;
                            continue block22;
                        }
                        case 708005234: {
                            var6_8 ^= var7_4 ^ -134635453;
                            continue block21;
                        }
                        case -860211879: {
                            var6_8 ^= var7_4 ^ -1130915168;
                            ** continue;
                        }
                        case -1452968938: {
                            if (var2_5.field_1724 != null) ** break;
                            continue block17;
                            var7_4 = (var5_3 | var8_2) ^ 810678237;
                            continue block22;
                        }
                        case -449882964: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static iP faceTarget(class_2338 class_23382, class_2350 class_23502) {
        int n2 = c & 0x31700261 ^ 0x25C3F07C;
        int n3 = 0;
        int n4 = (n2 | 0x31700261) ^ 0x776C5E02;
        n3 = (n2 | 0x31700261) ^ 0x774EB796;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1712362477: {
                    n4 ^= n3 ^ 0xB8E390C5;
                    n3 = (n2 | 0x31700261) ^ 0x87FA7D9C;
                    continue block5;
                }
                case 1119700459: {
                    n3 = (n2 | 0x31700261) ^ 0xAC1C9E6E;
                    continue block5;
                }
                case -1307996191: 
            }
            break;
        }
        n4 ^= 0x4E98C68B;
        class_243 class_2432 = class_243.method_24953((class_2382)class_23382).method_1031((double)class_23502.method_10148() * 0.5, (double)class_23502.method_10164() * 0.5, (double)class_23502.method_10165() * 0.5);
        n4 ^= 0x67477722;
        return new iP(class_23382, class_23502, class_2432);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static iP facing(class_2338 var0) {
        var5_1 = 746408837;
        var2_2 = mj.c & 746408837 ^ 1284294215;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ -288233131;
        var4_3 = (var2_2 | var5_1) ^ -875685922;
        while (true) {
            switch (var4_3) {
                case -1134009162: {
                    var1_4 = mj.trace();
                    var4_3 = (var2_2 | var5_1) ^ 1031448639;
                    ** GOTO lbl29
                }
                case 1146508046: {
                    var3_5 ^= var4_3 ^ 1797054079;
                    var4_3 = (var2_2 | var5_1) ^ -795497615;
                }
                default: {
                    break;
                }
                case -1489774567: {
                    var4_3 = (var2_2 | var5_1) ^ 682335433;
                    break;
                }
            }
        }
lbl21:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ 1044229851;
            if (true) ** GOTO lbl29
            break;
        }
        block19: while (true) {
            var4_3 = (var2_2 | var5_1) ^ 2017356259;
            if (true) ** GOTO lbl29
            block20: while (true) {
                var4_3 = (var2_2 | var5_1) ^ -783093799;
lbl29:
                // 4 sources

                block21: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block21;
                        }
                        case -1103208521: {
                            var4_3 = (var2_2 | var5_1) ^ 157977796;
                            continue block21;
                        }
                        case 348366372: {
                            var3_5 ^= var4_3 ^ -723596307;
                            ** continue;
                        }
                        case -1544942287: {
                            if (var1_4 == null) continue block20;
                            var4_3 = (var2_2 | var5_1) ^ 1642618719;
                            continue block21;
                        }
                        case -436458115: {
                            if (var1_4.method_17783() != class_239.class_240.field_1332) continue block20;
                            var4_3 = (var2_2 | var5_1) ^ -758935440;
                            continue block21;
                        }
                        case 1367828472: {
                            var3_5 ^= var4_3 ^ -890522628;
                            var4_3 = (var2_2 | var5_1) ^ -820526346;
                            continue block21;
                        }
                        case 219517080: {
                            var4_3 = (var2_2 | var5_1) ^ -1996365126;
                            continue block21;
                        }
                        case -1112596450: {
                            var3_5 ^= var4_3 ^ -675401662;
                            var4_3 = (var2_2 | var5_1) ^ 854812618;
                            continue block21;
                        }
                        case 1704411907: {
                            if (var1_4.method_17777().equals((Object)var0)) continue block19;
                            continue block20;
                        }
                        case 1388339484: {
                            return mj.faceTarget(var0, var1_4.method_17780());
                        }
                        case 1578018829: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean sees(iP var0) {
        block24: {
            block22: {
                block23: {
                    var6_1 = 2112643802;
                    var3_2 = mj.c & 2112643802 ^ 120202029;
                    var5_3 = 0;
                    ** GOTO lbl12
lbl5:
                    // 1 sources

                    block13: while (true) {
                        switch (var5_3) lbl-1000:
                        // 3 sources

                        {
                            default: {
                                continue block13;
                            }
                            case 177727791: {
                                var1_5 = class_310.method_1551();
                                break block22;
                            }
lbl12:
                            // 1 sources

                            var4_4 = (var3_2 | var6_1) ^ -2129221345;
                            ** GOTO lbl32
                            case -744575171: {
                                var4_4 ^= var5_3 ^ 184145961;
                                ** GOTO lbl22
                            }
lbl17:
                            // 5 sources

                            block15: while (true) {
                                switch (var5_3) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block15;
                                        }
                                        break;
                                    }
lbl22:
                                    // 1 sources

                                    var5_3 = (var3_2 | var6_1) ^ 1970899664;
                                    ** GOTO lbl-1000
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var5_3 = (var3_2 | var6_1) ^ -257753537;
                                        ** continue;
                                        break;
                                    }
                                    case -1114422970: {
                                        if (var1_5.field_1724 != null) break block15;
                                        break block23;
                                    }
lbl30:
                                    // 1 sources

                                    return mj.matches(mj.trace(var2_6[0], var2_6[1]), var0);
lbl32:
                                    // 1 sources

                                    var5_3 = (var3_2 | var6_1) ^ 661855133;
                                    ** GOTO lbl-1000
                                    case -837570011: {
                                        var4_4 ^= var5_3 ^ 254699596;
                                        ** continue;
                                    }
                                }
                                break;
                            }
                            var5_3 = (var3_2 | var6_1) ^ -1308765734;
                            ** GOTO lbl17
lbl39:
                            // 1 sources

                            while (true) {
                                var5_3 = (var3_2 | var6_1) ^ 1268349631;
                                ** GOTO lbl17
                                break;
                            }
lbl42:
                            // 1 sources

                            while (true) {
                                var5_3 = (var3_2 | var6_1) ^ -1031986503;
                                ** GOTO lbl17
                                break;
                            }
                            case 1486714978: {
                                break block13;
                            }
                        }
                        break;
                    }
                    break block24;
                }
                var5_3 = (var3_2 | var6_1) ^ 1575852513;
                ** GOTO lbl17
                {
                    case 880220480: {
                        return false;
                    }
                }
            }
            var5_3 = (var3_2 | var6_1) ^ -1807005587;
            ** while (true)
lbl56:
            // 1 sources

            while (true) {
                var4_4 ^= -929146616;
                ** continue;
                break;
            }
            {
                case -341496942: {
                    var4_4 ^= var5_3 ^ -1421883375;
                    ** continue;
                }
                case -1890804288: {
                    var2_6 = eA.getRotationsTo(var1_5.field_1724.method_33571(), var0.aim());
                    ** continue;
                }
                ** case 570685982:
            }
lbl66:
            // 1 sources

            var4_4 ^= var5_3 ^ -1156318940;
            ** while (true)
        }
        var5_3 = (var3_2 | var6_1) ^ -1401893694;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static boolean matches(class_3965 var0, iP var1_1) {
        block44: {
            block45: {
                block40: {
                    block36: {
                        block38: {
                            block37: {
                                block42: {
                                    block43: {
                                        block41: {
                                            block39: {
                                                break block45;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    v0 = true;
                                                    break block36;
                                                    break;
                                                }
lbl4:
                                                // 1 sources

                                                while (true) {
                                                    if (var0 == null) break block37;
                                                    break block38;
                                                    break;
                                                }
lbl7:
                                                // 1 sources

                                                while (true) {
                                                    var3_5 ^= var4_4 ^ 1004961530;
                                                    ** GOTO lbl109
                                                    break;
                                                }
lbl10:
                                                // 1 sources

                                                while (var0.method_17783() == class_239.class_240.field_1332) {
                                                    break block39;
                                                }
                                                break block37;
lbl13:
                                                // 1 sources

                                                while (true) {
                                                    var3_5 ^= var4_4 ^ -1157904189;
                                                    break block40;
                                                    break;
                                                }
lbl16:
                                                // 1 sources

                                                while (true) {
                                                    var3_5 ^= var4_4 ^ 850495038;
                                                    break block41;
                                                    break;
                                                }
lbl19:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ -1850134942;
                                                    ** GOTO lbl82
                                                    break;
                                                }
lbl22:
                                                // 1 sources

                                                while (true) {
                                                    var3_5 ^= var4_4 ^ -1309387067;
                                                    break block42;
                                                    break;
                                                }
                                            }
                                            var4_4 = (var2_3 | var5_2) ^ -1154139191;
                                            ** GOTO lbl82
lbl28:
                                            // 1 sources

                                            while (true) {
                                                if (!var0.method_17777().equals((Object)var1_1.against())) break block37;
                                                break block43;
                                                break;
                                            }
lbl31:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ -1194435150;
                                                ** GOTO lbl82
                                                break;
                                            }
                                        }
                                        var4_4 = (var2_3 | var5_2) ^ -1984217645;
                                        ** GOTO lbl82
                                    }
                                    var4_4 = (var2_3 | var5_2) ^ -2131604208;
                                    ** GOTO lbl82
lbl40:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= var4_4 ^ 1211944818;
                                        ** continue;
                                        break;
                                    }
lbl43:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= -1392605983;
                                        ** GOTO lbl10
                                        break;
                                    }
                                }
                                var4_4 = (var2_3 | var5_2) ^ -1303811846;
                                ** GOTO lbl82
                            }
                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 611252421;
                                ** GOTO lbl82
                                break;
                            }
                        }
                        var4_4 = (var2_3 | var5_2) ^ 675766501;
                        ** GOTO lbl82
                    }
lbl57:
                    // 2 sources

                    while (true) {
                        var3_5 ^= -465433673;
                        break block44;
                        break;
                    }
lbl60:
                    // 1 sources

                    while (true) {
                        var3_5 ^= -1247873038;
                        ** continue;
                        break;
                    }
lbl63:
                    // 1 sources

                    while (true) {
                        var3_5 ^= 2005997724;
                        ** GOTO lbl114
                        break;
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ -808733552;
                ** GOTO lbl82
lbl69:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -670305681;
                    if (true) ** GOTO lbl82
                    break;
                }
            }
            var5_2 = 1023776886;
            var2_3 = mj.c & 1023776886 ^ -1369728340;
            var4_4 = 0;
            var3_5 = (var2_3 | var5_2) ^ 522767775;
            ** while (true)
        }
        return v0;
        block32: while (true) {
            var4_4 = (var2_3 | var5_2) ^ -312448304;
lbl82:
            // 11 sources

            block33: while (true) {
                switch (var4_4) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block33;
                        }
                        break;
                    }
                    case -1303022816: {
                        ** continue;
                    }
                    case 126994252: {
                        ** continue;
                    }
                    case 920954669: {
                        ** continue;
                    }
                    case -909479576: {
                        ** continue;
                    }
                    case 786871452: {
                        continue block32;
                    }
                    case -1759970789: {
                        ** continue;
                    }
                    case -1691262405: {
                        ** continue;
                    }
                    case 1379921966: {
                        ** continue;
                    }
                    case 74096951: {
                        ** continue;
                    }
                    case 1068357614: {
                        ** continue;
                    }
                    case 219607556: {
                        ** continue;
                    }
lbl109:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 1989536662;
                    ** GOTO lbl-1000
lbl111:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 218819038;
                        ** continue;
                        break;
                    }
lbl114:
                    // 1 sources

                    if (var0.method_17780() != var1_1.face()) ** continue;
                    ** continue;
                    case 1733585041: {
                        var3_5 ^= var4_4 ^ 1184809577;
                        ** continue;
                    }
                    case 1888759406: 
                }
                break;
            }
            break;
        }
        v0 = false;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static boolean blockedBy(class_243 var0, class_243 var1_1, class_2338 var2_2) {
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
    public static boolean useOn(class_3965 var0) {
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

    private static int xc(int n2, int n3) {
        int n4 = -801449403;
        int n5 = -1134865240;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x3875703F)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xFC7B3C0F;
        n6 -= (n5 | n4) ^ 0xFC7BB1BA;
        n6 -= (n5 | n4) ^ 0xFC7BDF69;
        n6 += (n5 | n4) ^ 0xFC7BABE0;
        n6 += (n5 | n4) ^ 0xFC7B1840;
        n6 -= (n5 | n4) ^ 0xFC7B0B1F;
        return n6 += (n5 | n4) ^ 0xFC7B2959;
    }
}

