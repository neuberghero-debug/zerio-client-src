/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2960
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class hN {
    private static final Map<String, Integer> a;
    private static final int[] a;
    public static final int b;
    private static final int a;

    private hN() {
        int n2 = b & 0xFC817010 ^ 0x52381FB7;
        int n3 = (n2 | 0xFC817010) ^ 0xA24AB5BE;
        n3 ^= 0xFC81A983;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var8 = -794771623;
        hN.b = mK.a(MethodHandles.lookup().lookupClass(), 2146317361);
        var7_1 = 0;
        var6_6 = 1053123347;
        var7_1 = var8 ^ 141925213;
        if (true) ** GOTO lbl17
lbl7:
        // 1 sources

        while (true) {
            var4_7 = 0;
            if (true) ** GOTO lbl33
            break;
        }
        block22: while (true) {
            switch (var7_1) {
                case -402216682: {
                    var6_6 ^= var7_1 ^ -293360648;
                    break;
                }
                case -657120252: {
                    var7_1 = var8 ^ 950408783;
                }
lbl17:
                // 3 sources

                default: {
                    continue block22;
                }
                case 1568099384: {
                    var2_4 = (var6_6 | var7_1 ^ -1915227295) ^ (var7_1 ^ -1448856464) ^ hN.b;
                    var6_6 ^= 1920925961;
                    var0_2 = "W\n\u0099\u0088\u00e3Z\u0087\u00c9".getBytes("ISO-8859-1");
                    var6_6 ^= 78917708;
                    var1_3 = var0_2.length / 4;
                    break block22;
                }
            }
            var7_1 = var8 ^ -1915227295;
        }
        var7_1 = var8 ^ 134863387;
        if (true) ** GOTO lbl75
        block23: while (true) {
            var7_1 = var8 ^ -633549405;
            ** GOTO lbl36
lbl33:
            // 1 sources

            block24: while (true) {
                var5_8 = (var0_2[var3_5] & (((var6_6 ^= -207495804) | var8) ^ -558039292)) << ((var6_6 | var8) ^ -558039069) | (var0_2[var3_5 + 1] & ((var6_6 | var8) ^ -558039292)) << ((var6_6 | var8) ^ -558039061) | (var0_2[var3_5 + 2] & ((var6_6 | var8) ^ -558039292)) << ((var6_6 | var8) ^ -558039053) | var0_2[var3_5 + 3] & ((var6_6 | var8) ^ -558039292);
                var7_1 = var8 ^ 328618073;
lbl36:
                // 2 sources

                block25: while (true) {
                    switch (var7_1) {
                        case 2005577382: {
                            var6_6 ^= var7_1 ^ 2018619548;
                            var7_1 = var8 ^ 1617249296;
                            continue block25;
                        }
                        case 577262544: {
                            var6_6 ^= var7_1 ^ -885370056;
                            ** break;
                        }
                        case 178025210: {
                            var6_6 ^= var7_1 ^ -70474717;
                            ** GOTO lbl65
                        }
                        case -1329202359: {
                            var3_5 += 4;
                            if (++var4_7 < var1_3) continue block24;
                            ** GOTO lbl60
                        }
                        case -92006157: {
                            hN.a = new HashMap<String, Integer>();
                            return;
                        }
lbl55:
                        // 1 sources

                        var7_1 = var8 ^ -260996661;
                        break;
                        case -769824009: {
                            hN.a[var4_7] = var5_8 ^= var2_4;
                            ** break;
                        }
lbl60:
                        // 1 sources

                        var7_1 = var8 ^ -221713271;
                        break;
                        case 550583954: {
                            hN.a = hN.QW((var6_6 | var7_1 ^ -260996661) ^ (var7_1 ^ -1564745877), var7_1 ^ -260996661 ^ ((var6_6 | var7_1 ^ -260996661) ^ (var7_1 ^ -1020820967)));
                            continue block23;
                        }
lbl65:
                        // 1 sources

                        var7_1 = var8 ^ 707045290;
                        break;
lbl67:
                        // 1 sources

                        var7_1 = var8 ^ -1490415105;
                        continue block25;
                        case -1019810048: {
                            var6_6 ^= var7_1 ^ 1061956798;
                            var7_1 = var8 ^ 45995438;
                        }
                    }
                }
                break;
            }
            break;
        }
        block26: while (true) {
            var7_1 = var8 ^ -169832321;
lbl75:
            // 2 sources

            block27: while (true) {
                switch (var7_1) {
                    default: {
                        continue block27;
                    }
                    case 624963366: {
                        var3_5 = 0;
                        var6_6 ^= 1068435810;
                        ** continue;
                    }
                    case -1418107141: {
                        var6_6 ^= var7_1 ^ -1503698358;
                        continue block26;
                    }
                    case -715413567: {
                        hN.a = new int[var1_3];
                        var7_1 = var8 ^ 2077874594;
                        continue block27;
                    }
                    case -659987134: 
                }
                var6_6 ^= var7_1 ^ 1503009822;
                var7_1 = var8 ^ 100341912;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int fromPng(long l2, String string, byte[] byArray) {
        int n2 = b & 0x3082BBC4 ^ 0x2C938553;
        int n3 = 0;
        int n4 = (n2 | 0x3082BBC4) ^ 0xF39CFE1B;
        n3 = (n2 | 0x3082BBC4) ^ 0x4A7901AC;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 410195855: {
                    n4 ^= n3 ^ 0xDD71EEEE;
                    n3 = (n2 | 0x3082BBC4) ^ 0x7410429;
                    continue block5;
                }
                case 1003666430: {
                    return hN.QV(l2, string, byArray, hN.QW((n4 | n3 ^ 0xB50003A) ^ (n3 ^ 0x57D85E34), (n2 | n3 ^ 0xB50003A) ^ ((n4 | n3 ^ 0xB50003A) ^ (n3 ^ 0x6E271DF6))));
                }
                case 1995095675: 
            }
            n3 = (n2 | 0x3082BBC4) ^ 0x24E0A858;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int fromPngSmooth(long l2, String string, byte[] byArray) {
        int n2 = b & 0x41292011 ^ 0x67F65590;
        int n3 = 0;
        int n4 = (n2 | 0x41292011) ^ 0x53CAA41C;
        n3 = (n2 | 0x41292011) ^ 0xC3A2A0F3;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -28688024: {
                    return hN.QV(l2, "smooth:" + string, byArray, 1);
                }
                case -1537354398: {
                    n3 = (n2 | 0x41292011) ^ 0xA3FEC07F;
                    continue block5;
                }
                case -1006520850: 
            }
            n4 ^= n3 ^ 0x7564F789;
            n3 = (n2 | 0x41292011) ^ 0x99B534F9;
        }
    }

    /*
     * Exception decompiling
     */
    private static int QV(long var0, String var2_1, byte[] var3_2, int var4_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [58[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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

    private static int QW(int n2, int n3) {
        int n4 = 525573434;
        int n5 = 1401865278;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x95A8319)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x5FDFEE90;
        n6 += (n5 | n4) ^ 0x5FDFB42B;
        n6 ^= (n5 | n4) ^ 0x5FDF3CE4;
        n6 ^= (n5 | n4) ^ 0x5FDF3C7E;
        n6 += (n5 | n4) ^ 0x5FDF590E;
        return n6 += (n5 | n4) ^ 0x5FDFDC4F;
    }

    /*
     * Unable to fully structure code
     */
    public static int fromResource(long var0, class_2960 var2_1) {
        block46: {
            block49: {
                block47: {
                    block50: {
                        block48: {
                            break block50;
lbl1:
                            // 1 sources

                            while (true) {
                                var8_4 = (var6_3 | var9_2) ^ 420332398;
                                break block46;
                                break;
                            }
lbl4:
                            // 2 sources

                            block24: while (true) {
                                block0 : switch (var8_4) lbl-1000:
                                // 5 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block24;
                                        }
                                        break;
                                    }
lbl9:
                                    // 1 sources

                                    while (true) {
                                        var8_4 = (var6_3 | var9_2) ^ 1489637090;
                                        break block46;
                                        break;
                                    }
lbl12:
                                    // 1 sources

                                    while (true) {
                                        var8_4 = (var6_3 | var9_2) ^ -1584519783;
                                        break block0;
                                        break;
                                    }
                                    case -757618298: {
                                        var7_8 ^= var8_4 ^ 1804878448;
                                        var8_4 = (var6_3 | var9_2) ^ -521259909;
                                        ** GOTO lbl-1000
                                    }
lbl19:
                                    // 1 sources

                                    while (true) {
                                        var8_4 = (var6_3 | var9_2) ^ 1520931286;
                                        break block46;
                                        break;
                                    }
lbl22:
                                    // 1 sources

                                    while (true) {
                                        var8_4 = (var6_3 | var9_2) ^ -1381717363;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl25:
                                    // 1 sources

                                    while (true) {
                                        var4_6 = hN.a.get(var3_5);
                                        ** continue;
                                        break;
                                    }
                                    case 1434144966: {
                                        var7_8 ^= var8_4 ^ -1837155447;
                                        break block24;
                                    }
                                    case 1397446799: {
                                        var7_8 ^= var8_4 ^ 330303141;
                                        ** GOTO lbl46
                                    }
lbl34:
                                    // 1 sources

                                    while (true) {
                                        var7_8 ^= -1792895160;
                                        ** continue;
                                        break;
                                    }
lbl37:
                                    // 1 sources

                                    while (true) {
                                        var7_8 ^= var8_4 ^ -1854148945;
                                        ** continue;
                                        break;
                                    }
lbl40:
                                    // 1 sources

                                    while (true) {
                                        var8_4 = (var6_3 | var9_2) ^ 2085860468;
                                        break block46;
                                        break;
                                    }
lbl43:
                                    // 1 sources

                                    while (true) {
                                        var7_8 ^= var8_4 ^ 1556824170;
                                        ** continue;
                                        break;
                                    }
lbl46:
                                    // 1 sources

                                    var8_4 = (var6_3 | var9_2) ^ -947887863;
                                    ** GOTO lbl-1000
lbl48:
                                    // 1 sources

                                    while (true) {
                                        var7_8 ^= var8_4 ^ 168681104;
                                        ** GOTO lbl125
                                        break;
                                    }
lbl51:
                                    // 1 sources

                                    while (true) {
                                        hN.a.put(var3_5, -1);
                                        break block47;
                                        break;
                                    }
                                    case 199166081: {
                                        if (var4_6 == null) ** GOTO lbl61
                                        break block48;
                                    }
lbl58:
                                    // 1 sources

                                    while (true) {
                                        var7_8 ^= var8_4 ^ 1324784514;
                                        ** continue;
                                        break;
                                    }
lbl61:
                                    // 1 sources

                                    var8_4 = (var6_3 | var9_2) ^ -1416322364;
                                    ** continue;
                                }
                                break;
                            }
                            var8_4 = (var6_3 | var9_2) ^ -218041654;
                            ** GOTO lbl4
                        }
                        var8_4 = (var6_3 | var9_2) ^ 705188813;
                        ** while (true)
lbl68:
                        // 1 sources

                        while (true) {
                            var3_5 = "res:" + String.valueOf(var2_1);
                            ** continue;
                            break;
                        }
lbl71:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ -1645347483;
                            break block46;
                            break;
                        }
                    }
                    var9_2 = 270520387;
                    var6_3 = hN.b & 270520387 ^ -120899000;
                    var8_4 = 0;
                    var7_8 = (var6_3 | var9_2) ^ -692674909;
                    ** GOTO lbl127
lbl80:
                    // 1 sources

                    while (true) {
                        if (var5_7 == null) {
                            ** continue;
                        }
                        break block49;
                        break;
                    }
                    {
                        case 405917232: {
                            return Math.max(0, var4_6);
                        }
                    }
lbl86:
                    // 3 sources

                    block41: while (true) {
                        switch (var8_4) {
                            default: {
                                continue block41;
                            }
                            case 1498537938: {
                                ** continue;
                            }
                            case -994041318: {
                                ** continue;
                            }
                            case 1385882575: {
                                ** continue;
                            }
                        }
                        break;
                    }
                }
                var8_4 = (var6_3 | var9_2) ^ -1951763596;
                break block46;
            }
            var8_4 = (var6_3 | var9_2) ^ 2086335560;
            break block46;
lbl102:
            // 1 sources

            while (true) {
                var7_8 ^= var8_4 ^ 1589987870;
                ** GOTO lbl123
                break;
            }
        }
        block43: while (true) {
            switch (var8_4) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block43;
                    }
                    break;
                }
                case -506316507: {
                    ** continue;
                }
                case -2071654909: {
                    ** continue;
                }
                case -1569166435: {
                    ** continue;
                }
                case 1937082687: {
                    ** continue;
                }
                case -14335573: {
                    ** continue;
                }
                case 1697777454: {
                    ** continue;
                }
lbl123:
                // 1 sources

                var8_4 = (var6_3 | var9_2) ^ 133872608;
                ** continue;
lbl125:
                // 1 sources

                var8_4 = (var6_3 | var9_2) ^ 1008719953;
                ** GOTO lbl86
lbl127:
                // 1 sources

                var8_4 = (var6_3 | var9_2) ^ -1438312060;
                ** continue;
                case -2071179713: {
                    return hN.fromPng(var0, var3_5, var5_7);
                }
                case -1609173847: {
                    return 0;
                }
            }
            break;
        }
        {
            ** case 1063230274:
        }
lbl134:
        // 1 sources

        var5_7 = hN.QX(var2_1);
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static int fromResourceSmooth(long var0, class_2960 var2_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[SWITCH]], but top level block is 13[SWITCH]
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
    public static boolean failed(String var0) {
        block22: {
            var5_1 = -2143544098;
            var2_2 = hN.b & -2143544098 ^ -99861304;
            var4_3 = 0;
            var3_4 = (var2_2 | var5_1) ^ -1633931282;
            var4_3 = (var2_2 | var5_1) ^ 671929744;
            if (true) ** GOTO lbl18
lbl7:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ -450541763;
                break block22;
lbl10:
                // 2 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 946711577;
                    break block22;
                    break;
                }
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 941057789;
                break block22;
                break;
            }
            block18: while (true) {
                var4_3 = (var2_2 | var5_1) ^ 1591718484;
lbl18:
                // 2 sources

                block19: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block19;
                        }
                        case -905977523: {
                            var3_4 ^= var4_3 ^ 1990053891;
                            continue block18;
                        }
                        case -768546482: {
                            var4_3 = (var2_2 | var5_1) ^ 868474259;
                            continue block19;
                        }
                        case -1528590710: 
                    }
                    break;
                }
                break;
            }
            var1_5 = hN.a.get(var0);
            var4_3 = (var2_2 | var5_1) ^ -1417420139;
            break block22;
lbl32:
            // 2 sources

            while (true) {
                var3_4 ^= -1781708156;
                return v0;
            }
        }
        block21: while (true) {
            switch (var4_3) {
                default: {
                    continue block21;
                }
                case 847767705: {
                    v0 = false;
                    ** GOTO lbl32
                }
                case 521763811: {
                    v0 = true;
                    ** continue;
                }
                case -1037346269: {
                    if (var1_5 == null) ** GOTO lbl10
                    var4_3 = (var2_2 | var5_1) ^ -1623386767;
                    continue block21;
                }
                case 749251684: {
                    if (var1_5 == -1) ** break;
                    ** continue;
                    var4_3 = (var2_2 | var5_1) ^ -745212571;
                    continue block21;
                }
                case -1034841913: {
                    var3_4 ^= var4_3 ^ 1323505449;
                    var4_3 = (var2_2 | var5_1) ^ -927214521;
                    continue block21;
                }
                case 698927547: {
                    var3_4 ^= var4_3 ^ -1525002667;
                    ** continue;
                }
                case 1371528779: {
                    var3_4 ^= var4_3 ^ -1486329585;
                    ** continue;
                }
                case 1694575023: 
            }
            var4_3 = (var2_2 | var5_1) ^ -694906694;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean resourceFailed(class_2960 class_29602) {
        int n2 = b & 0x17979298 ^ 0xD82ECFCC;
        int n3 = 0;
        int n4 = (n2 | 0x17979298) ^ 0x8FC9326E;
        n3 = (n2 | 0x17979298) ^ 0x5BB30F2C;
        block5: while (true) {
            switch (n3) {
                case 163921924: {
                    return hN.failed("res:" + String.valueOf(class_29602));
                }
                case 1565724040: {
                    n4 ^= n3 ^ 0x2EC232A;
                    break;
                }
                case -2079534864: {
                    n3 = (n2 | 0x17979298) ^ 0x82ECD254;
                }
                default: {
                    continue block5;
                }
            }
            n3 = (n2 | 0x17979298) ^ 0xD67A9FD8;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void clear() {
        block13: {
            var3 = 797460879;
            var0_1 = hN.b & 797460879 ^ -1950857530;
            var2_2 = 0;
            ** GOTO lbl32
lbl5:
            // 1 sources

            while (true) {
                var2_2 = (var0_1 | var3) ^ 408235154;
                ** GOTO lbl20
                break;
            }
lbl8:
            // 1 sources

            while (true) {
                var2_2 = (var0_1 | var3) ^ -1609460423;
                ** GOTO lbl20
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                var2_2 = (var0_1 | var3) ^ 940170230;
                if (true) ** GOTO lbl20
                break;
            }
            block10: while (true) {
                block14: {
                    var2_2 = (var0_1 | var3) ^ -1400222678;
                    break block14;
lbl17:
                    // 1 sources

                    while (true) {
                        var1_3 ^= var2_2 ^ -241575807;
                        ** continue;
                        break;
                    }
                }
lbl21:
                // 2 sources

                block12: while (true) {
                    switch (var2_2) {
                        default: {
                            continue block12;
                        }
                        case 53609445: {
                            ** continue;
                        }
                        case -1209179299: {
                            ** continue;
                        }
                        case 262789878: {
                            hN.a.clear();
                            break block13;
                        }
lbl32:
                        // 1 sources

                        var1_3 = (var0_1 | var3) ^ -985768137;
                        continue block10;
                        case -1749969863: {
                            return;
                        }
                        case 1936221313: {
                            var1_3 ^= var2_2 ^ -687659875;
                            break block10;
                        }
                    }
                    break;
                }
                break;
            }
            ** while (true)
        }
        var2_2 = (var0_1 | var3) ^ -590337202;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static byte[] QX(class_2960 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [40[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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

