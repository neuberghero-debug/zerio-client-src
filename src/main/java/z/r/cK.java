/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import z.r.ge;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class cK {
    public static final int a;
    public static final int b;
    public static final double a;
    public static final int d;
    private static final double b;
    public static final class_2350[] a;
    private static final int[] a;
    public static final class_2350[] b;
    public static final int c;

    /*
     * Enabled aggressive block sorting
     */
    private cK() {
        int n2 = d & 0x6C31D6AE ^ 0x5609422;
        int n3 = (n2 | 0x6C31D6AE) ^ 0x77901E5;
        n3 ^= 0x34A003DC;
        n3 ^= 0x21303E93;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static class_2350 headingFromYaw(float f2) {
        int n2 = d & 0xC309E9F5 ^ 0xBA948018;
        int n3 = 0;
        int n4 = (n2 | 0xC309E9F5) ^ 0x433699F7;
        n3 = (n2 | 0xC309E9F5) ^ 0x447DBF4E;
        block5: while (true) {
            switch (n3) {
                case -1075816781: {
                    n3 = (n2 | 0xC309E9F5) ^ 0xDDB5CE7F;
                }
                default: {
                    continue block5;
                }
                case -968374090: {
                    return class_2350.method_10150((double)class_3532.method_15393((float)f2));
                }
                case 640165762: 
            }
            n4 ^= n3 ^ 0x888687A6;
            n3 = (n2 | 0xC309E9F5) ^ 0x3DDA214B;
        }
    }

    /*
     * Exception decompiling
     */
    public static float yawOf(class_2350 var0) {
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
    public static class_2350 right(class_2350 var0) {
        var1_1 = cK.d & -147654469 ^ 127814200;
        var3_2 = 0;
        if (true) ** GOTO lbl11
        block5: while (true) {
            var3_2 = (var1_1 | -147654469) ^ 664382822;
lbl6:
            // 2 sources

            block6: while (true) {
                switch (var3_2) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
lbl11:
                    // 1 sources

                    var2_3 = (var1_1 | -147654469) ^ -237717905;
                    continue block5;
lbl13:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | -147654469) ^ -86493753;
                        ** continue;
                        break;
                    }
                    case 224841596: {
                        var2_3 ^= var3_2 ^ -1399269464;
                        break block5;
                    }
                    case 819469118: {
                        return var0.method_10170();
                    }
                }
                break;
            }
            break;
        }
        var3_2 = (var1_1 | -147654469) ^ -949558907;
        ** while (true)
        {
            ** case -802727971:
        }
lbl24:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static class_2338 drillAim(class_2338 var0) {
        block8: {
            block10: {
                block9: {
                    break block9;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | 638745521) ^ 1195551895;
                        break block8;
                        break;
                    }
                }
                var1_1 = cK.d & 638745521 ^ 1315575667;
                var3_2 = 0;
                break block10;
lbl8:
                // 1 sources

                return var0.method_10084();
            }
            var2_3 = (var1_1 | 638745521) ^ 499422789;
            var3_2 = (var1_1 | 638745521) ^ 1222682545;
        }
        block7: while (true) {
            switch (var3_2) {
                default: {
                    continue block7;
                }
                case 647682114: {
                    break;
                }
                case 691589988: {
                    ** continue;
                }
                case 347440103: {
                    var2_3 ^= var3_2 ^ 1419126750;
                    ** continue;
                }
            }
            var3_2 = (var1_1 | 638745521) ^ 2060450836;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static class_2338 floorUnder(class_2338 var0) {
        block10: {
            break block10;
            {
                switch (var3_2) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
lbl5:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | 167916749) ^ -1142586781;
                        ** GOTO lbl-1000
                        break;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | 167916749) ^ -1874464585;
                        ** GOTO lbl-1000
                        break;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | 167916749) ^ -910283722;
                        ** continue;
                        break;
                    }
                    case -1038576677: {
                        ** continue;
                    }
                    case -1337770610: {
                        var2_3 ^= var3_2 ^ 1757717376;
                        ** continue;
                    }
                    case -1679601830: 
                }
            }
            return var0.method_10074();
        }
        var1_1 = cK.d & 167916749 ^ 27700065;
        var3_2 = 0;
        var2_3 = (var1_1 | 167916749) ^ 256145145;
        ** while (true)
    }

    private static int pV(int n2, int n3) {
        int n4 = -1465998855;
        int n5 = 398919685;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x2047FCF8)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xBFDF078C;
        n6 ^= (n5 | n4) ^ 0xBFDF040D;
        n6 += (n5 | n4) ^ 0xBFDFD8CD;
        n6 -= (n5 | n4) ^ 0xBFDFD614;
        n6 ^= (n5 | n4) ^ 0xBFDF1AC8;
        return n6 += (n5 | n4) ^ 0xBFDF81B9;
    }

    /*
     * Exception decompiling
     */
    public static boolean reachedCell(class_243 var0, class_2338 var1_1, class_2350 var2_2) {
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
    public static class_243 laneCentre(class_2338 class_23382, double d2) {
        int n2 = d & 0x55C65127 ^ 0x10355E8B;
        int n3 = 0;
        int n4 = (n2 | 0x55C65127) ^ 0xE5E89486;
        n3 = (n2 | 0x55C65127) ^ 0xDC7DDACC;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1685046837: {
                    n4 ^= n3 ^ 0x515D7D68;
                    n3 = (n2 | 0x55C65127) ^ 0x16C41F54;
                    continue block5;
                }
                case -1987410589: {
                    n3 = (n2 | 0x55C65127) ^ 0xCE676664;
                    continue block5;
                }
                case 1127432443: 
            }
            break;
        }
        return new class_243((double)class_23382.method_10263() + 0.5, (double)class_23382.method_10264() + d2, (double)class_23382.method_10260() + 0.5);
    }

    /*
     * Unable to fully structure code
     */
    public static List<class_2338> requiredCells(class_2338 var0, class_2350 var1_1, ge var2_2) {
        block23: {
            block24: {
                block19: {
                    block22: {
                        block21: {
                            block20: {
                                break block24;
lbl1:
                                // 1 sources

                                while (true) {
                                    var4_6 ^= var5_5 ^ 230311342;
                                    var5_5 = (var3_4 | var6_3) ^ -1459482587;
                                    break block19;
                                    break;
                                }
lbl5:
                                // 1 sources

                                while (true) {
                                    var4_6 ^= var5_5 ^ -770659112;
                                    break block20;
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (true) {
                                    v0 = cK.crossSection(var0, var1_1);
                                    break block21;
                                    break;
                                }
                            }
                            var5_5 = (var3_4 | var6_3) ^ 913699113;
                            break block19;
                        }
lbl15:
                        // 2 sources

                        while (true) {
                            var4_6 ^= -1996203530;
                            break block22;
                            break;
                        }
lbl18:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 2096264940;
                            break block19;
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            v0 = cK.walkway(var0);
                            ** continue;
                            break;
                        }
                    }
                    return v0;
                }
lbl27:
                // 2 sources

                block15: while (true) {
                    switch (var5_5) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            default: {
                                continue block15;
                            }
                            break;
                        }
                        case -1073692391: {
                            ** continue;
                        }
                        case 1462538089: {
                            ** continue;
                        }
                        case -2099451488: {
                            ** continue;
                        }
                        case 1697516276: {
                            ** continue;
                        }
                        case 1220582151: {
                            ** continue;
                        }
lbl42:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 1662935682;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 497748140: {
                            if (var2_2 != ge.d) break block23;
                            ** GOTO lbl51
                        }
lbl48:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 1324413809;
                            ** GOTO lbl-1000
                            break;
                        }
lbl51:
                        // 1 sources

                        var5_5 = (var3_4 | var6_3) ^ -337758052;
                        ** continue;
                        case 431011087: {
                            var4_6 ^= var5_5 ^ -737529416;
                            break block15;
                        }
                    }
                    break;
                }
                ** while (true)
            }
            var6_3 = 735725701;
            var3_4 = cK.d & 735725701 ^ 558674305;
            var5_5 = 0;
            var4_6 = (var3_4 | var6_3) ^ -410323325;
            ** while (true)
        }
        var5_5 = (var3_4 | var6_3) ^ 846089354;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static List<class_2338> transitCells(class_2338 var0, class_2338 var1_1, class_2350 var2_2) {
        block46: {
            block45: {
                var9_3 = 824293478;
                var6_4 = cK.d & 824293478 ^ -1681315683;
                var8_5 = 0;
                var7_9 = (var6_4 | var9_3) ^ -702697038;
                var8_5 = (var6_4 | var9_3) ^ -836500236;
                break block46;
lbl7:
                // 1 sources

                while (true) {
                    var8_5 = (var6_4 | var9_3) ^ -882979840;
                    ** GOTO lbl104
                    while (true) {
                        var8_5 = (var6_4 | var9_3) ^ -2013063714;
                        break block45;
lbl13:
                        // 2 sources

                        while (true) {
                            var8_5 = (var6_4 | var9_3) ^ 1751046347;
                            break block45;
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    var8_5 = (var6_4 | var9_3) ^ -1813982418;
                    break block46;
                    break;
                }
lbl19:
                // 2 sources

                while (true) {
                    var8_5 = (var6_4 | var9_3) ^ 1029806924;
                    break block45;
                    break;
                }
                while (true) {
                    var8_5 = (var6_4 | var9_3) ^ 1499143729;
                    ** GOTO lbl104
                    break;
                }
            }
            block39: while (true) {
                switch (var8_5) {
                    case -973182318: {
                        ++var5_8;
                        ** GOTO lbl13
                    }
                    case 2106387914: {
                        if (var5_8 <= -var4_7 + 2 - 1) {
                            ** break;
                        }
                        ** GOTO lbl142
                    }
                    case -542299791: {
                        ** GOTO lbl142
                    }
                    case -1789808508: {
                        var7_9 ^= var8_5 ^ -2081930743;
                        var8_5 = (var6_4 | var9_3) ^ -1918510620;
                        continue block39;
                    }
                    case 2087336798: {
                        var7_9 ^= var8_5 ^ -961521344;
                        var8_5 = (var6_4 | var9_3) ^ 2115490413;
                        continue block39;
                    }
                    case -2037898317: {
                        var7_9 ^= var8_5 ^ 1006457097;
                        var8_5 = (var6_4 | var9_3) ^ -1872369357;
                        continue block39;
                    }
                    case 911307636: {
                        ++var5_8;
                        ** GOTO lbl19
                    }
                    case 910975259: {
                        var3_6.add(var1_1.method_10086(var5_8));
                        var8_5 = (var6_4 | var9_3) ^ -947682399;
                        continue block39;
                    }
                    case 730616268: {
                        if (var5_8 >= var4_7) ** continue;
                        var8_5 = (var6_4 | var9_3) ^ 1489561540;
                        continue block39;
                    }
                    case -325349433: {
                        var7_9 ^= var8_5 ^ -1890032330;
                        var8_5 = (var6_4 | var9_3) ^ -1917269109;
                        continue block39;
                    }
                    case -484352197: {
                        var7_9 ^= var8_5 ^ 1033357168;
                        var8_5 = (var6_4 | var9_3) ^ 1720598534;
                        continue block39;
                    }
                    case -742957004: {
                        var7_9 ^= var8_5 ^ 2144661671;
                        var8_5 = (var6_4 | var9_3) ^ -966437579;
                        continue block39;
                    }
                    case -580388615: {
                        var3_6.add(var0.method_10086(2 + var5_8));
                        var8_5 = (var6_4 | var9_3) ^ 1467103032;
                        continue block39;
                    }
lbl78:
                    // 1 sources

                    var8_5 = (var6_4 | var9_3) ^ 783812731;
                    break;
                    case 871017761: {
                        var7_9 ^= var8_5 ^ -69113877;
                        var8_5 = (var6_4 | var9_3) ^ 1682215310;
                    }
                }
            }
        }
        block40: while (true) {
            switch (var8_5) {
                default: {
                    continue block40;
                }
                case 1976417291: {
                    var8_5 = (var6_4 | var9_3) ^ -345782071;
                    continue block40;
                }
                case 671706065: {
                    var3_6 = new ArrayList<class_2338>(cK.walkway(var1_1));
                    var7_9 ^= 1953330389;
                    var4_7 = var1_1.method_10264() - var0.method_10264();
                    var8_5 = (var6_4 | var9_3) ^ -2100513538;
                    if (true) ** GOTO lbl104
                }
                case 1351249974: {
                    var7_9 ^= var8_5 ^ -1795144197;
                    break block40;
                }
            }
            break;
        }
        ** while (true)
        block41: while (true) {
            var8_5 = (var6_4 | var9_3) ^ -940938347;
lbl104:
            // 4 sources

            block42: while (true) {
                switch (var8_5) {
                    default: {
                        continue block42;
                    }
                    case 724619505: {
                        var7_9 ^= var8_5 ^ 1881227087;
                        var8_5 = (var6_4 | var9_3) ^ 1897380528;
                        continue block42;
                    }
                    case 1998541498: {
                        if (var4_7 < 0) {
                            var8_5 = (var6_4 | var9_3) ^ 487733027;
                            continue block42;
                        }
                        ** GOTO lbl142
                    }
                    case -491608370: {
                        var7_9 ^= var8_5 ^ -82755766;
                        var8_5 = (var6_4 | var9_3) ^ -856233403;
                        continue block42;
                    }
                    case 1891071231: {
                        var5_8 = 2;
                        ** continue;
                    }
                    case -1296484236: {
                        if (var4_7 <= 0) ** continue;
                        continue block41;
                    }
                    case 958729217: {
                        var7_9 ^= var8_5 ^ -976765181;
                        var8_5 = (var6_4 | var9_3) ^ 156270731;
                        continue block42;
                    }
                    case 2080625514: {
                        var7_9 ^= var8_5 ^ 283046558;
                        ** break;
                    }
                    case -1493463076: {
                        var7_9 ^= var8_5 ^ 177741647;
                        ** continue;
                    }
                    case -1983856324: {
                        var5_8 = 0;
                        ** continue;
                    }
lbl140:
                    // 1 sources

                    var8_5 = (var6_4 | var9_3) ^ 841578947;
                    continue block42;
lbl142:
                    // 3 sources

                    var8_5 = (var6_4 | var9_3) ^ -1864800242;
                    continue block42;
                    case -889322929: 
                }
                break;
            }
            break;
        }
        return var3_6;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static List<class_2338> walkway(class_2338 var0) {
        var5_1 = 1453938428;
        var2_2 = cK.d & 1453938428 ^ -240570460;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ -347044040;
        var4_3 = (var2_2 | var5_1) ^ 1699314073;
        if (true) ** GOTO lbl40
        {
            switch (var4_3) {
                case 1010231687: {
                    var1_4.add(var0);
                    var4_3 = (var2_2 | var5_1) ^ -185986776;
                    continue block13;
                }
                case -19189863: {
                    var1_4.add(var0.method_10084());
                    var4_3 = (var2_2 | var5_1) ^ -704731340;
                    ** break;
                }
                case 576182472: {
                    var3_5 ^= var4_3 ^ 2133647130;
                    var4_3 = (var2_2 | var5_1) ^ -878733701;
                    ** break;
                }
                case 9579015: {
                    var3_5 ^= var4_3 ^ 1980210467;
                    var4_3 = (var2_2 | var5_1) ^ 158486629;
                    ** break;
                }
                case 54750932: {
                    var3_5 ^= var4_3 ^ 1873237711;
                    var4_3 = (var2_2 | var5_1) ^ 1891100413;
                }
lbl29:
                // 6 sources

                default: {
                    continue block13;
                }
                case -2028037887: 
            }
        }
        return var1_4;
lbl33:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ -147106309;
            ** GOTO lbl29
            break;
        }
        block16: while (true) {
            switch (var4_3) {
                case -1830812059: {
                    var4_3 = (var2_2 | var5_1) ^ -666102229;
                }
lbl40:
                // 3 sources

                default: {
                    continue block16;
                }
                case 440314319: {
                    var1_4 = new ArrayList<class_2338>(2);
                    ** continue;
                }
                case 803563991: 
            }
            var3_5 ^= var4_3 ^ 227174152;
            var4_3 = (var2_2 | var5_1) ^ -308816333;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static List<class_2338> crossSection(class_2338 var0, class_2350 var1_1) {
        block29: {
            break block29;
lbl1:
            // 1 sources

            while (true) {
                var8_4 = (var6_3 | var9_2) ^ 1973291015;
                if (true) ** GOTO lbl57
                break;
            }
        }
        var9_2 = -1484715799;
        var6_3 = cK.d & -1484715799 ^ -144737307;
        var8_4 = 0;
        var7_9 = (var6_3 | var9_2) ^ -593789276;
        var8_4 = (var6_3 | var9_2) ^ 710491237;
        block24: while (true) {
            switch (var8_4) {
                case -578402424: {
                    var8_4 = (var6_3 | var9_2) ^ -1573832987;
                    ** break;
                }
                case 1441680648: {
                    var7_9 ^= var8_4 ^ -862418383;
                    var8_4 = (var6_3 | var9_2) ^ 1663914031;
                }
lbl18:
                // 3 sources

                default: {
                    continue block24;
                }
                case -1796068414: 
            }
            break;
        }
        var2_5 = cK.right(var1_1);
        var3_6 = new ArrayList<class_2338>(cK.pV(((var7_9 ^= 136635602) | var9_2) ^ 537885678, (var6_3 | var9_2) ^ ((var7_9 | var9_2) ^ -750234977)));
        var7_9 ^= 1584758455;
        var4_7 = 0;
        if (true) ** GOTO lbl90
        block25: while (true) {
            switch (var8_4) {
                case -485004006: {
                    var7_9 ^= var8_4 ^ 1651760774;
                    ** GOTO lbl50
                }
                case 560827709: {
                    if (var4_7 >= 3) ** GOTO lbl45
                    ** GOTO lbl43
                }
                case -392022375: {
                    var7_9 ^= var8_4 ^ -1374876068;
                    var8_4 = (var6_3 | var9_2) ^ -692914480;
                    ** break;
                }
                case -277674602: {
                    var7_9 ^= var8_4 ^ -898739799;
                    var8_4 = (var6_3 | var9_2) ^ -373164582;
                }
lbl41:
                // 3 sources

                default: {
                    continue block25;
                }
lbl43:
                // 1 sources

                var8_4 = (var6_3 | var9_2) ^ 413957755;
                continue block25;
lbl45:
                // 1 sources

                var8_4 = (var6_3 | var9_2) ^ 348657399;
                continue block25;
                case 505318967: {
                    var5_8 = -1;
                    ** GOTO lbl86
                }
lbl50:
                // 1 sources

                var8_4 = (var6_3 | var9_2) ^ -1723340480;
                continue block25;
                block26: while (true) {
                    var8_4 = (var6_3 | var9_2) ^ -1199309161;
                    if (true) ** GOTO lbl57
                    block27: while (true) {
                        var8_4 = (var6_3 | var9_2) ^ 1556190498;
lbl57:
                        // 3 sources

                        block28: while (true) {
                            switch (var8_4) {
                                case 1331463546: {
                                    var7_9 ^= var8_4 ^ -2120140957;
                                    var8_4 = (var6_3 | var9_2) ^ 873373963;
                                    ** break;
                                }
                                case -1796130766: {
                                    ++var5_8;
                                    ** GOTO lbl86
                                }
                                case 1695029697: {
                                    var7_9 ^= var8_4 ^ 236443200;
                                    ** continue;
                                }
                                case 707572778: {
                                    var7_9 ^= var8_4 ^ -2023527735;
                                    continue block27;
                                }
                                case -2109639702: {
                                    var3_6.add(var0.method_10086(var4_7).method_10079(var2_5, var5_8));
                                    var8_4 = (var6_3 | var9_2) ^ -1486642949;
                                    ** break;
                                }
                                case 1354554134: {
                                    var7_9 ^= var8_4 ^ -1762866572;
                                    var8_4 = (var6_3 | var9_2) ^ 1663976415;
                                    ** break;
                                }
                                case -1424036145: {
                                    if (var5_8 > 1) continue block26;
                                    var8_4 = (var6_3 | var9_2) ^ -1831378388;
                                }
lbl84:
                                // 5 sources

                                default: {
                                    continue block28;
                                }
lbl86:
                                // 2 sources

                                var8_4 = (var6_3 | var9_2) ^ -571224121;
                                continue block28;
                                case -1009657114: 
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                ++var4_7;
lbl90:
                // 2 sources

                var8_4 = (var6_3 | var9_2) ^ 528305524;
                continue block25;
                case 1855492781: 
            }
            break;
        }
        return var3_6;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static List<class_2338> horizontalDrillFootprint(class_2338 var0, class_2350 var1_1) {
        block35: {
            block33: {
                block34: {
                    break block35;
lbl1:
                    // 2 sources

                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ 1989316840;
                        break block33;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ -501472308;
                        break block34;
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ -823468833;
                        break block33;
                        break;
                    }
                }
lbl11:
                // 2 sources

                block26: while (true) {
                    switch (var8_4) {
                        case 326732716: {
                            var3_7.add(var0.method_10086(var4_8).method_10079(var2_6, var5_9));
                            var8_4 = (var6_3 | var9_2) ^ -889866661;
                            continue block26;
                        }
                        case -2132149007: {
                            var7_5 ^= var8_4 ^ -1376926472;
                            var8_4 = (var6_3 | var9_2) ^ 1015423951;
                            continue block26;
                        }
                        case 1371316083: {
                            ++var4_8;
                            ** GOTO lbl1
                        }
                        case -452321736: {
                            var7_5 ^= var8_4 ^ 704052775;
                            ** break;
                        }
                        case -840725585: {
                            if (var5_9 <= 1) {
                                ** break;
                            }
                            ** GOTO lbl42
                        }
                        case 1048800697: {
                            var7_5 ^= var8_4 ^ -545540689;
                            ** continue;
                        }
lbl35:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ 230048392;
                        continue block26;
                        case 575269611: {
                            ++var5_9;
                            ** GOTO lbl78
                        }
lbl40:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ -1357491054;
                        continue block26;
lbl42:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ 643396992;
                        continue block26;
                        case 161930723: {
                            var7_5 ^= var8_4 ^ -3794613;
                            var8_4 = (var6_3 | var9_2) ^ 2118334224;
                        }
                    }
                    continue;
                    break;
                }
                while (true) {
                    var8_4 = (var6_3 | var9_2) ^ 1891487626;
                    break block33;
                    break;
                }
lbl51:
                // 1 sources

                while (true) {
                    var3_7 = new ArrayList<class_2338>(cK.pV(((var7_5 ^= 1966822721) | var9_2) ^ -245002645, (var6_3 | var9_2) ^ ((var7_5 | var9_2) ^ -1372769102)));
                    var7_5 ^= 42702548;
                    var4_8 = -1;
                    ** continue;
                    break;
                }
            }
            block29: while (true) {
                switch (var8_4) {
                    case 2000446144: {
                        var7_5 ^= var8_4 ^ 1146075948;
                        ** break;
                    }
                    case -518687556: {
                        if (var4_8 > 1) ** continue;
                        var8_4 = (var6_3 | var9_2) ^ 1489226403;
                        continue block29;
                    }
                    case 1500330123: {
                        var7_5 ^= var8_4 ^ 2105998809;
                        ** continue;
                    }
lbl69:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ -468253967;
lbl70:
                    // 3 sources

                    default: {
                        continue block29;
                    }
                    case 1598187497: {
                        var7_5 ^= var8_4 ^ -1501139581;
                        var8_4 = (var6_3 | var9_2) ^ -467136492;
                        ** GOTO lbl70
                    }
                    case -873944430: {
                        var5_9 = -1;
lbl78:
                        // 2 sources

                        var8_4 = (var6_3 | var9_2) ^ 293389786;
                        ** continue;
                    }
                    case -875054985: 
                }
                break;
            }
            return var3_7;
        }
        var9_2 = 788334689;
        var6_3 = cK.d & 788334689 ^ 186097730;
        var8_4 = 0;
        var7_5 = (var6_3 | var9_2) ^ 2081744335;
        var8_4 = (var6_3 | var9_2) ^ 1020321174;
        block31: while (true) {
            switch (var8_4) {
                default: {
                    continue block31;
                }
                case 321877493: {
                    var8_4 = (var6_3 | var9_2) ^ -2002553094;
                    continue block31;
                }
                case 215196562: {
                    var2_6 = cK.right(var1_1);
                    ** continue;
                }
                case -1487085927: 
            }
            var7_5 ^= var8_4 ^ -987949734;
            var8_4 = (var6_3 | var9_2) ^ 590089201;
        }
    }

    /*
     * Exception decompiling
     */
    public static List<class_2338> downwardDrillFootprint(class_2338 var0, class_2350 var1_1) {
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
    static {
        block47: {
            block48: {
                block49: {
                    block46: {
                        break block49;
lbl1:
                        // 1 sources

                        while (true) {
                            var6_4 ^= 1240120497;
                            var0_5 = "\u00bb\u0095\u00faQ\u00cf\u00ba\u00baw9\u0093\u0003\u00b9*\u00d4\u008b\u0087\u00f1Z0\u00fe\u00d5\u0099\u00ea\u00d5\f\u00bd\u00848".getBytes("ISO-8859-1");
                            var6_4 ^= 808544047;
                            break block46;
                            break;
                        }
lbl6:
                        // 1 sources

                        while (true) {
                            var7_2 = var8_1 ^ 105231449;
                            break block47;
lbl9:
                            // 2 sources

                            while (true) {
                                var5_9 = (var0_5[var3_7] & (((var6_4 ^= 1180721325) | var8_1) ^ -1342902527)) << ((var6_4 | var8_1) ^ -1342902298) | (var0_5[var3_7 + 1] & ((var6_4 | var8_1) ^ -1342902527)) << ((var6_4 | var8_1) ^ -1342902290) | (var0_5[var3_7 + 2] & ((var6_4 | var8_1) ^ -1342902527)) << ((var6_4 | var8_1) ^ -1342902282) | var0_5[var3_7 + 3] & ((var6_4 | var8_1) ^ -1342902527);
                                var7_2 = var8_1 ^ -1492366215;
                                break block47;
                                break;
                            }
                            break;
                        }
                    }
                    var1_6 = var0_5.length / 4;
                    var7_2 = var8_1 ^ -1070533461;
                    while (true) {
                        switch (var7_2) {
                            case -1179885942: {
                                var6_4 ^= var7_2 ^ -1937252833;
                                ** break;
                            }
                            case 1821973995: {
                                var3_7 = 0;
                                var7_2 = var8_1 ^ -1755553011;
                                break block48;
                            }
lbl25:
                            // 1 sources

                            var7_2 = var8_1 ^ -473328719;
                            break;
                            case 1137481507: {
                                cK.a = new int[var1_6];
                                var7_2 = var8_1 ^ 922538192;
                                break;
                            }
                            case 1331722993: {
                                var6_4 ^= var7_2 ^ 484124317;
                                var7_2 = var8_1 ^ -862185095;
                            }
                        }
                    }
lbl35:
                    // 1 sources

                    while (true) {
                        var7_2 = var8_1 ^ -1198828200;
                        break block47;
lbl38:
                        // 1 sources

                        while (true) {
                            var7_2 = var8_1 ^ -1325511694;
                            break block47;
                            break;
                        }
                        break;
                    }
                }
                var9 = -682829829;
                var8_1 = -1890546086;
                cK.d = mK.a(MethodHandles.lookup().lookupClass(), -2114825429);
                var7_2 = 0;
                var6_4 = -748491471;
                var7_2 = var8_1 ^ -133709594;
                block42: while (true) {
                    switch (var7_2) {
                        default: {
                            continue block42;
                        }
                        case 1630902754: {
                            var2_3 = (var6_4 | var7_2 ^ -295364680) ^ (var7_2 ^ -396611206) ^ cK.d;
                            ** continue;
                        }
                        case 1999795671: {
                            var6_4 ^= var7_2 ^ 780619908;
                            var7_2 = var8_1 ^ -295364680;
                            continue block42;
                        }
                        case 2002210492: 
                    }
                    var7_2 = var8_1 ^ -127730803;
                }
lbl62:
                // 1 sources

                while (true) {
                    var7_2 = var8_1 ^ -1164254461;
                    break block47;
                    break;
                }
            }
            block44: while (true) {
                block50: {
                    switch (var7_2) {
                        case -1623473508: {
                            var6_4 ^= var7_2 ^ 1875170552;
                            ** break;
                        }
                        case 1172749737: {
                            var6_4 ^= var7_2 ^ 956202917;
                            ** break;
                        }
                        case -694784900: {
                            var4_8 = 0;
                            ** GOTO lbl9
                        }
                        case 403500375: {
                            break block50;
                        }
                        case 439249650: {
                            var7_2 = var8_1 ^ 1506206246;
                            break;
                        }
                        case 353575383: {
                            var6_4 ^= var7_2 ^ -1720688529;
                            break block50;
                        }
lbl85:
                        // 2 sources

                        var7_2 = var8_1 ^ -1786846040;
                        break;
                        case 1652709778: {
                            switch (var6_4) {
                                case -1507638170: {
                                    var7_2 = var8_1 ^ 275467462;
                                    continue block44;
                                }
                                default: {
                                    var7_2 = var8_1 ^ -894028813;
                                    continue block44;
                                }
                                case 1054273639: 
                            }
                            var7_2 = var8_1 ^ -1706840179;
                        }
                    }
                    continue;
                }
                var7_2 = var8_1 ^ -304949304;
            }
        }
        block45: while (true) {
            switch (var7_2) {
                case -1995097597: {
                    var6_4 ^= var7_2 ^ 642318512;
                    var7_2 = var8_1 ^ var9;
                    continue block45;
                }
                case 1068418472: {
                    var6_4 ^= var7_2 ^ -485161013;
                    ** break;
                }
                case 902458713: {
                    v0 = new class_2350[cK.pV((var6_4 | var7_2 ^ -1164254461) ^ (var7_2 ^ 84268832), var7_2 ^ -1164254461 ^ ((var6_4 | var7_2 ^ -1164254461) ^ (var7_2 ^ 971339252)))];
                    v0[0] = class_2350.field_11043;
                    v0[1] = class_2350.field_11034;
                    v0[2] = class_2350.field_11035;
                    v0[3] = class_2350.field_11039;
                    v0[4] = class_2350.field_11036;
                    v0[5] = class_2350.field_11033;
                    cK.b = v0;
                    var7_2 = var8_1 ^ 987869196;
                    continue block45;
                }
                case 677167651: {
                    var6_4 ^= var7_2 ^ -1299750675;
                    var7_2 = var8_1 ^ 1275334465;
                    continue block45;
                }
                case 188565587: {
                    var3_7 += 4;
                    if (++var4_8 >= var1_6) ** break;
                    ** continue;
                    ** continue;
                }
lbl131:
                // 1 sources

                var7_2 = var8_1 ^ -2073180663;
                default: {
                    continue block45;
                }
                case -1017872101: {
                    cK.a[var4_8] = var5_9 ^= var2_3;
                    ** continue;
                }
                case 1478252961: {
                    cK.c = cK.pV((var6_4 | var7_2 ^ var9) ^ (var7_2 ^ 140292957), var7_2 ^ var9 ^ ((var6_4 | var7_2 ^ var9) ^ (var7_2 ^ 315957155)));
                    cK.b = 0.15;
                    cK.a = 0.9;
                    cK.b = cK.pV((var6_4 | var7_2 ^ var9) ^ (var7_2 ^ 140292954), var7_2 ^ var9 ^ ((var6_4 | var7_2 ^ var9) ^ (var7_2 ^ -916740901)));
                    cK.a = cK.pV((var6_4 | var7_2 ^ var9) ^ (var7_2 ^ 140292955), var7_2 ^ var9 ^ ((var6_4 | var7_2 ^ var9) ^ (var7_2 ^ -308773130)));
                    ** GOTO lbl150
                }
                case -430452296: {
                    var6_4 ^= var7_2 ^ 64488248;
                    ** continue;
                }
                case -1246675370: {
                    var6_4 ^= var7_2 ^ -359706874;
                    ** continue;
                }
lbl150:
                // 1 sources

                var7_2 = var8_1 ^ 1762090978;
                continue block45;
                case 937155330: 
            }
            break;
        }
        cK.a = new class_2350[]{class_2350.field_11043, class_2350.field_11034, class_2350.field_11035, class_2350.field_11039};
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static List<class_2338> observationHalo(List<class_2338> var0) {
        block45: {
            block46: {
                break block46;
lbl1:
                // 1 sources

                block29: while (true) {
                    var12_3 = (var10_2 | var13_1) ^ -1667981952;
                    ** GOTO lbl61
lbl4:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl6:
                    // 1 sources

                    while (true) {
                        var12_3 = (var10_2 | var13_1) ^ -299912759;
                        ** GOTO lbl61
                        break;
                    }
                    var12_3 = (var10_2 | var13_1) ^ 1180478362;
                    block32: while (true) {
                        switch (var12_3) {
                            case 1241386796: {
                                var11_13 ^= var12_3 ^ -66652924;
                                ** break;
                            }
                            case -90097803: {
                                var11_13 ^= var12_3 ^ -975859438;
                                var12_3 = (var10_2 | var13_1) ^ 1712601199;
                            }
lbl18:
                            // 5 sources

                            default: {
                                continue block32;
                            }
lbl20:
                            // 1 sources

                            var12_3 = (var10_2 | var13_1) ^ 1014591277;
                            continue block32;
                            case -2138770494: {
                                var4_7 = var3_6.next();
                                var11_13 ^= 777953736;
                                var5_8 = class_2350.values();
                                var6_9 = var5_8.length;
                                var7_10 = 0;
                                continue block29;
                            }
                            case -727136393: {
                                var11_13 ^= var12_3 ^ -2120509011;
                                var12_3 = (var10_2 | var13_1) ^ 1097929447;
                                ** GOTO lbl18
                            }
                            case -622222208: {
                                if (!var3_6.hasNext()) ** GOTO lbl37
                                var12_3 = (var10_2 | var13_1) ^ -184314941;
                                ** GOTO lbl18
lbl37:
                                // 1 sources

                                var12_3 = (var10_2 | var13_1) ^ 1750424472;
                                ** GOTO lbl18
                            }
lbl39:
                            // 2 sources

                            while (true) {
                                var12_3 = (var10_2 | var13_1) ^ -1224391114;
                                break block45;
                                break;
                            }
lbl42:
                            // 1 sources

                            while (true) {
                                var12_3 = (var10_2 | var13_1) ^ 1232878079;
                                ** GOTO lbl61
                                break;
                            }
lbl45:
                            // 1 sources

                            while (true) {
                                var11_13 ^= -911951184;
                                var9_12 = var4_7.method_10093(var8_11);
                                var12_3 = (var10_2 | var13_1) ^ 1173495865;
                                break block45;
                                break;
                            }
lbl50:
                            // 1 sources

                            while (true) {
                                var12_3 = (var10_2 | var13_1) ^ -1552950897;
                                ** GOTO lbl61
                                while (true) {
                                    var12_3 = (var10_2 | var13_1) ^ 1842992687;
                                    if (true) ** GOTO lbl61
                                    break;
                                }
                                break;
                            }
lbl56:
                            // 1 sources

                            while (true) {
                                var12_3 = (var10_2 | var13_1) ^ 884822763;
                                break block45;
                                break;
                            }
                            block40: while (true) {
                                var12_3 = (var10_2 | var13_1) ^ 814431083;
lbl61:
                                // 6 sources

                                block41: while (true) {
                                    switch (var12_3) {
                                        default: {
                                            continue block41;
                                        }
                                        case 529679712: {
                                            if (var7_10 >= var6_9) ** continue;
                                            ** continue;
                                        }
                                        case 543752559: {
                                            var11_13 ^= var12_3 ^ 1106869343;
                                            ** continue;
                                        }
                                        case -176052976: {
                                            var11_13 ^= var12_3 ^ -441488159;
                                            continue block40;
                                        }
                                        case -786150720: {
                                            var11_13 ^= var12_3 ^ 342280823;
                                            ** continue;
                                        }
                                        case 1390554406: {
                                            ** GOTO lbl4
                                        }
                                        case -1938380924: 
                                    }
                                    break;
                                }
                                break;
                            }
                            var8_11 = var5_8[var7_10];
                            ** continue;
                            case -41120248: 
                        }
                        break;
                    }
                    break;
                }
                return var1_4;
lbl84:
                // 1 sources

                while (true) {
                    var12_3 = (var10_2 | var13_1) ^ -795769958;
                    break block45;
                    break;
                }
            }
            var13_1 = 750065899;
            var10_2 = cK.d & 750065899 ^ -1135764403;
            var12_3 = 0;
            var11_13 = (var10_2 | var13_1) ^ -1514731091;
            var12_3 = (var10_2 | var13_1) ^ -1692825671;
            block43: while (true) {
                switch (var12_3) {
                    default: {
                        continue block43;
                    }
                    case -994252825: {
                        var1_4 = new ArrayList<class_2338>(var0.size() * 4);
                        var11_13 ^= 259289384;
                        var2_5 = new HashSet<class_2338>(var0);
                        var11_13 ^= 841559807;
                        ** break;
                    }
                    case 669260630: {
                        var12_3 = (var10_2 | var13_1) ^ 392609;
                        continue block43;
                    }
lbl106:
                    // 1 sources

                    var3_6 = var0.iterator();
                    ** continue;
                    case -1124572850: 
                }
                var11_13 ^= var12_3 ^ -1071249945;
                var12_3 = (var10_2 | var13_1) ^ 2017557256;
            }
        }
        block44: while (true) {
            switch (var12_3) {
                default: {
                    continue block44;
                }
                case -819493180: {
                    var1_4.add(var9_12);
                    ** GOTO lbl39
                }
                case 1819025269: {
                    if (var2_5.add(var9_12)) ** break;
                    ** continue;
                    var12_3 = (var10_2 | var13_1) ^ 1944100428;
                    continue block44;
                }
                case -820182365: {
                    break;
                }
                case -116409130: {
                    var11_13 ^= var12_3 ^ 701775386;
                    ** continue;
                }
                case -2009018876: {
                    ++var7_10;
                    ** continue;
                }
                case 200858329: {
                    var11_13 ^= var12_3 ^ 1664702052;
                    ** continue;
                }
            }
            var12_3 = (var10_2 | var13_1) ^ 1943673387;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int progressAlong(class_2338 class_23382, class_2338 class_23383, class_2350 class_23502) {
        int n2 = d & 0xF9EAC126 ^ 0x2D5FA43A;
        int n3 = 0;
        int n4 = (n2 | 0xF9EAC126) ^ 0x8EFC2889;
        n3 = (n2 | 0xF9EAC126) ^ 0xDB65C68B;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 678914879: {
                    n4 ^= n3 ^ 0x32D3677B;
                    n3 = (n2 | 0xF9EAC126) ^ 0x3B9DFB33;
                    continue block5;
                }
                case 647635893: {
                    n3 = (n2 | 0xF9EAC126) ^ 0xD5888E01;
                    continue block5;
                }
                case -966648307: 
            }
            break;
        }
        n4 ^= 0xD5CA0118;
        n4 ^= 0x8FEE337F;
        return (class_23383.method_10263() - class_23382.method_10263()) * class_23502.method_10148() + (class_23383.method_10260() - class_23382.method_10260()) * class_23502.method_10165();
    }

    /*
     * Unable to fully structure code
     */
    public static int lateralOffset(class_2338 var0, class_2338 var1_1, class_2350 var2_2) {
        block33: {
            block35: {
                block34: {
                    break block34;
lbl1:
                    // 2 sources

                    while (true) {
                        var6_5 = (var4_4 | var7_3) ^ 2072014435;
                        break block33;
                        break;
                    }
lbl4:
                    // 2 sources

                    while (true) {
                        var6_5 = (var4_4 | var7_3) ^ -1719631524;
                        break block33;
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var6_5 = (var4_4 | var7_3) ^ 777357310;
                        break block33;
                        break;
                    }
                }
                var7_3 = 227485648;
                var4_4 = cK.d & 227485648 ^ 1975105294;
                var6_5 = 0;
                break block35;
                {
                    var6_5 = (var4_4 | var7_3) ^ -1097016374;
lbl16:
                    // 2 sources

                    block22: while (true) {
                        switch (var6_5) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block22;
                                }
                                break;
                            }
lbl21:
                            // 1 sources

                            block24: while (true) {
                                switch (var5_7) {
                                    case 227392012: {
                                        ** continue;
                                    }
                                    default: {
                                        var6_5 = (var4_4 | var7_3) ^ 2132797317;
                                        break block24;
                                    }
                                    case -1021088748: {
                                        var3_6 = cK.right(var2_2);
                                        ** GOTO lbl48
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        var5_7 ^= var6_5 ^ -2103717462;
                                        ** GOTO lbl1
                                        break;
                                    }
lbl34:
                                    // 1 sources

                                    while (true) {
                                        var5_7 ^= var6_5 ^ 1436978237;
                                        ** GOTO lbl4
                                        break;
                                    }
lbl37:
                                    // 1 sources

                                    while (true) {
                                        var5_7 ^= -614485971;
                                        ** GOTO lbl43
                                        break;
                                    }
lbl40:
                                    // 1 sources

                                    while (true) {
                                        var5_7 ^= -1086496132;
                                        ** continue;
                                        break;
                                    }
lbl43:
                                    // 1 sources

                                    return (var1_1.method_10263() - var0.method_10263()) * var3_6.method_10148() + (var1_1.method_10260() - var0.method_10260()) * var3_6.method_10165();
                                    case -1755457500: {
                                        var6_5 = (var4_4 | var7_3) ^ -70675780;
                                        break block24;
                                    }
                                }
                                break;
                            }
                            break block33;
lbl48:
                            // 1 sources

                            var6_5 = (var4_4 | var7_3) ^ 998453559;
                            break block33;
lbl50:
                            // 1 sources

                            while (true) {
                                var6_5 = (var4_4 | var7_3) ^ 1009781105;
                                ** continue;
                                break;
                            }
lbl53:
                            // 1 sources

                            while (true) {
                                var5_7 ^= var6_5 ^ -1488023699;
                                ** continue;
                                break;
                            }
                            case 1099939503: {
                                var5_7 ^= var6_5 ^ 941675828;
                                continue block21;
                            }
                            case 1479324375: {
                                ** continue;
                            }
                        }
                        break;
                    }
                }
lbl61:
                // 1 sources

                while (true) {
                    var6_5 = (var4_4 | var7_3) ^ 95412790;
                    break block33;
                    break;
                }
            }
            var5_7 = (var4_4 | var7_3) ^ -1823669151;
            var6_5 = (var4_4 | var7_3) ^ 630392073;
            ** while (true)
        }
        block32: while (true) {
            switch (var6_5) {
                default: {
                    continue block32;
                }
                case -465619326: {
                    ** continue;
                }
                case 1178371817: {
                    ** continue;
                }
                case 104847805: {
                    ** continue;
                }
                case 1407856672: {
                    ** continue;
                }
                case 2014336488: {
                    ** continue;
                }
                case -2039077534: {
                    ** continue;
                }
                ** case 44060763:
lbl86:
                // 1 sources

                ** continue;
            }
            break;
        }
    }
}

