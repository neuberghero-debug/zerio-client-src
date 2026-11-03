/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1802
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1802;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import z.r.ki;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class hC {
    private static final int[] a;
    public static final int a;

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
    private hC() {
        int n2 = a & 0x34D45CBF ^ 0x97B53FCB;
        int n3 = (n2 | 0x34D45CBF) ^ 0xA41E5D54;
        n3 ^= 0x51108933;
        n3 ^= 0xFF541343;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean willSmash(class_1297 var0) {
        block24: {
            var6_1 = -323866104;
            var3_2 = hC.a & -323866104 ^ 1872794136;
            var5_3 = 0;
            var4_5 = (var3_2 | var6_1) ^ 912903232;
            var5_3 = (var3_2 | var6_1) ^ 512025009;
            if (true) ** GOTO lbl23
            block19: while (true) {
                switch (var5_3) {
                    case 1437991042: {
                        var1_4 = var0.method_23318() - var0.field_6036;
                        ** break;
                    }
                    case -252176203: {
                        var4_5 ^= var5_3 ^ -1957437431;
                        ** GOTO lbl25
                    }
                    case 889308790: {
                        var4_5 ^= var5_3 ^ -513161671;
                        var5_3 = (var3_2 | var6_1) ^ 1363915936;
                        ** GOTO lbl23
                    }
lbl19:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ -1593894737;
                    break block24;
                    case -1090976072: {
                        var5_3 = var0 != null ? (var3_2 | var6_1) ^ 524987053 : (var3_2 | var6_1) ^ -304515538;
                    }
lbl23:
                    // 5 sources

                    default: {
                        continue block19;
                    }
lbl25:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ -1174097254;
                    continue block19;
                    case -248097879: {
                        var5_3 = (var3_2 | var6_1) ^ -625773458;
                        continue block19;
                    }
                    case 40617014: {
                        var4_5 ^= var5_3 ^ -1511019331;
                        var5_3 = (var3_2 | var6_1) ^ 63539608;
                        ** GOTO lbl23
                    }
lbl34:
                    // 2 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ -137630734;
                        break block24;
                        break;
                    }
                    case -327468160: 
                }
                break;
            }
            return false;
lbl39:
            // 2 sources

            while (true) {
                var4_5 ^= 1655218951;
                return v0;
            }
        }
        block23: while (true) {
            switch (var5_3) {
                default: {
                    continue block23;
                }
                case 268023424: {
                    if (!(var1_4 < 0.0)) ** GOTO lbl34
                    var5_3 = (var3_2 | var6_1) ^ 904677561;
                    continue block23;
                }
                case 1164106396: {
                    v0 = false;
                    ** GOTO lbl39
                }
                case 410606058: {
                    var4_5 ^= var5_3 ^ -115679370;
                    var5_3 = (var3_2 | var6_1) ^ -1429182332;
                    continue block23;
                }
                case -631309663: {
                    var5_3 = (var3_2 | var6_1) ^ 1065849480;
                    continue block23;
                }
                case 1330490039: {
                    var4_5 ^= var5_3 ^ 866984292;
                    var5_3 = (var3_2 | var6_1) ^ -531954536;
                    continue block23;
                }
                case -801824624: {
                    if (var0.field_6017 >= 1.5) ** break;
                    ** continue;
                    var5_3 = (var3_2 | var6_1) ^ 83762663;
                    continue block23;
                }
                case -1364098945: {
                    v0 = true;
                    ** continue;
                }
                case -347295745: 
            }
            var4_5 ^= var5_3 ^ 170862947;
            var5_3 = (var3_2 | var6_1) ^ 1090728551;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static class_1268 shieldHand(class_1309 var0) {
        var4_1 = 2054315695;
        var1_2 = hC.a & 2054315695 ^ -1205220349;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -1641970598;
        var3_3 = (var1_2 | var4_1) ^ 1229600160;
        ** GOTO lbl62
lbl7:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -880555624;
            ** GOTO lbl18
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 2100087442;
            ** GOTO lbl18
lbl13:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -227998708;
                if (true) ** GOTO lbl18
                break;
            }
            break;
        }
        block20: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 1366089968;
lbl18:
            // 4 sources

            block21: while (true) {
                switch (var3_3) {
                    case -336659185: {
                        var2_4 ^= var3_3 ^ 1764003280;
                        var3_3 = (var1_2 | var4_1) ^ -1068389109;
                        continue block21;
                    }
                    case 838342455: {
                        if (var0.method_5998(class_1268.field_5810).method_31574(class_1802.field_8255)) {
                            ** break;
                        }
                        ** GOTO lbl69
                    }
                    case 975860644: {
                        if (!var0.method_5998(class_1268.field_5808).method_31574(class_1802.field_8255)) ** GOTO lbl49
                        ** GOTO lbl57
                    }
                    case 1566806191: {
                        var2_4 ^= var3_3 ^ 114566947;
                        ** continue;
                    }
                    case -471348299: {
                        var2_4 ^= var3_3 ^ -1329515655;
                        ** GOTO lbl65
                    }
                    case -1288574193: {
                        var3_3 = (var1_2 | var4_1) ^ -2069913660;
                        continue block21;
                    }
                    case 2128888171: {
                        var2_4 ^= var3_3 ^ 432526959;
                        var3_3 = (var1_2 | var4_1) ^ 2099502350;
                        ** GOTO lbl62
                    }
                    case 1484333321: {
                        var2_4 ^= var3_3 ^ -1812198834;
                        ** continue;
                    }
lbl47:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -534069651;
                    ** GOTO lbl62
lbl49:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -1491579392;
                    ** GOTO lbl62
                    case 441540802: {
                        var2_4 ^= var3_3 ^ 2018409586;
                        ** continue;
                    }
                    case 1635246607: {
                        var2_4 ^= var3_3 ^ 627018672;
                        continue block20;
                    }
lbl57:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 429659418;
                    ** GOTO lbl62
                    case -2024275039: {
                        if (var0 == null) ** GOTO lbl67
                        var3_3 = (var1_2 | var4_1) ^ -1576861786;
                    }
lbl62:
                    // 7 sources

                    default: {
                        continue block21;
                    }
                    {
                    }
lbl65:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 2054470263;
                    continue block21;
lbl67:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -1693696864;
                    continue block21;
lbl69:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 294986656;
                    continue block21;
                    case -2146474792: {
                        return class_1268.field_5808;
                    }
                    case -2024336323: {
                        return class_1268.field_5810;
                    }
                    case -1424540065: {
                        return null;
                    }
                    case 135453347: 
                }
                break;
            }
            break;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public static float shieldUseTicks(class_1309 var0, class_1268 var1_1) {
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
    public static boolean isBlocking(class_1309 var0) {
        block23: {
            break block23;
lbl1:
            // 2 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 566583537;
                ** GOTO lbl18
lbl4:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 367984674;
                    ** GOTO lbl18
                    break;
                }
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 922466430;
                ** GOTO lbl18
lbl10:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -1649359018;
                    if (true) ** GOTO lbl18
                    break;
                }
                block19: while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 2102412217;
                    if (true) ** GOTO lbl18
                    block20: while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 612611085;
lbl18:
                        // 6 sources

                        block21: while (true) {
                            switch (var4_3) {
                                case -2066504601: {
                                    if (!(hC.shieldUseTicks(var0, var1_4) > 0.0f)) ** GOTO lbl1
                                    ** continue;
                                }
                                case -1668694258: {
                                    var3_5 ^= var4_3 ^ 195985573;
                                    continue block20;
                                }
                                case -1714459662: {
                                    v0 = false;
                                    ** GOTO lbl31
                                }
                                case 553392297: {
                                    v0 = true;
lbl31:
                                    // 2 sources

                                    var3_5 ^= 1051085919;
                                    return v0;
                                }
                                case -1465655331: {
                                    var3_5 ^= var4_3 ^ 1065672822;
                                    ** continue;
                                }
                                case -1008044212: {
                                    var4_3 = (var2_2 | var5_1) ^ 966753176;
                                    continue block21;
                                }
                                case -1950914687: {
                                    var3_5 ^= var4_3 ^ -501758852;
                                    continue block19;
                                }
                                case -1071866810: {
                                    if (var1_4 != null) ** break;
                                    ** continue;
                                    var4_3 = (var2_2 | var5_1) ^ 2124851379;
                                }
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        }
        var5_1 = -2058838166;
        var2_2 = hC.a & -2058838166 ^ 1006952349;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ -319645250;
        var4_3 = (var2_2 | var5_1) ^ 942256642;
        block22: while (true) {
            switch (var4_3) {
                default: {
                    continue block22;
                }
                case -1389966510: {
                    var3_5 ^= var4_3 ^ -1889380095;
                    break;
                }
                case 1815328962: {
                    var1_4 = hC.shieldHand(var0);
                    ** continue;
                }
                case -2056950275: {
                    var4_3 = (var2_2 | var5_1) ^ 275387565;
                    continue block22;
                }
            }
            var4_3 = (var2_2 | var5_1) ^ -780179651;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int angleDifference(class_1297 var0, class_1297 var1_1) {
        block53: {
            block54: {
                break block54;
lbl1:
                // 1 sources

                while (true) {
                    switch (var11_4) {
                        case -1682046551: {
                            v0 = var8_9;
                            break block53;
                        }
                        case -1125550841: {
                            var10_8 ^= var11_4 ^ -944410489;
                            var11_4 = (var9_3 | var12_2) ^ -1234357248;
                            break;
                        }
                        case 1382705722: {
                            var10_8 ^= var11_4 ^ 2035343484;
                            var11_4 = (var9_3 | var12_2) ^ 1824717398;
                            break;
                        }
                        case 1236589: {
                            v0 = hC.VG((var10_8 | var11_4 ^ 1970718430) ^ (var11_4 ^ 263531402), (var9_3 | var11_4 ^ 1970718430) ^ ((var10_8 | var11_4 ^ 1970718430) ^ (var11_4 ^ 300508470))) - var8_9;
                            ** break;
                        }
                        case -1700525092: {
                            var10_8 ^= var11_4 ^ -1315012198;
                            var11_4 = (var9_3 | var12_2) ^ -143776366;
                            break;
                        }
                        case 1091686399: {
                            var11_4 = var8_9 > hC.VG((var10_8 | var11_4 ^ 880138060) ^ (var11_4 ^ 1152170077), (var9_3 | var11_4 ^ 880138060) ^ ((var10_8 | var11_4 ^ 880138060) ^ (var11_4 ^ 1607056860))) ? (var9_3 | var12_2) ^ 1842933795 : (var9_3 | var12_2) ^ -1525247547;
                        }
                    }
                    continue;
                    break;
                }
                while (true) {
                    var11_4 = (var9_3 | var12_2) ^ -289158542;
                    ** GOTO lbl49
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    var11_4 = (var9_3 | var12_2) ^ 1983238633;
                    ** GOTO lbl49
lbl30:
                    // 2 sources

                    while (true) {
                        var11_4 = (var9_3 | var12_2) ^ -2007047809;
                        ** GOTO lbl49
                        break;
                    }
                    break;
                }
lbl33:
                // 1 sources

                while (true) {
                    var11_4 = (var9_3 | var12_2) ^ -1812613409;
                    ** GOTO lbl49
                    break;
                }
lbl36:
                // 1 sources

                while (true) {
                    var11_4 = (var9_3 | var12_2) ^ 441336036;
                    if (true) ** GOTO lbl49
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var4_6 = var1_1.method_23317() - var0.method_23317();
                    var10_8 ^= -1285643842;
                    var6_7 = var1_1.method_23321() - var0.method_23321();
                    ** continue;
                    break;
                }
                block48: while (true) {
                    var11_4 = (var9_3 | var12_2) ^ 179839849;
                    if (true) ** GOTO lbl49
                    block49: while (true) {
                        var11_4 = (var9_3 | var12_2) ^ -108185603;
lbl49:
                        // 7 sources

                        block50: while (true) {
                            switch (var11_4) {
                                case 632415332: {
                                    var2_5 = -90.0 + Math.toDegrees(Math.atan(var6_7 / var4_6));
                                    ** GOTO lbl143
                                }
                                case 119980297: {
                                    ** GOTO lbl112
                                }
                                case -990064401: {
                                    if (!(var4_6 < 0.0)) ** GOTO lbl30
                                    ** GOTO lbl145
                                }
                                case -315442405: {
                                    if (var6_7 > 0.0) ** break;
                                    ** continue;
                                    var11_4 = (var9_3 | var12_2) ^ -739398515;
                                    continue block50;
                                }
                                case 1686719776: {
                                    var10_8 ^= var11_4 ^ 1263533131;
                                    var11_4 = (var9_3 | var12_2) ^ 716677356;
                                    continue block50;
                                }
                                case 470316688: {
                                    var10_8 ^= var11_4 ^ 1275164938;
                                    var11_4 = (var9_3 | var12_2) ^ -758308965;
                                    continue block50;
                                }
                                case 2132941440: {
                                    var10_8 ^= var11_4 ^ -1313903209;
                                    ** GOTO lbl120
                                }
                                case -362111488: {
                                    var10_8 ^= var11_4 ^ -897600348;
                                    ** GOTO lbl149
                                }
                                case -37431146: {
                                    var10_8 ^= var11_4 ^ -1379018996;
                                    var11_4 = (var9_3 | var12_2) ^ 2098970815;
                                    continue block50;
                                }
                                case -2125911530: {
                                    var11_4 = (var9_3 | var12_2) ^ 633714173;
                                    continue block50;
                                }
                                case -712954081: {
                                    var10_8 ^= var11_4 ^ -1043888509;
                                    ** GOTO lbl125
                                }
                                case -192475508: {
                                    var10_8 ^= var11_4 ^ 2118508445;
                                    ** continue;
                                }
                                case -228285556: {
                                    if (!(var6_7 < 0.0)) continue block48;
                                    continue block49;
                                }
                                case -1972946112: {
                                    if (!(var6_7 < 0.0)) ** GOTO lbl143
                                    ** GOTO lbl147
                                }
                                case -759607806: {
                                    var2_5 = 90.0 + Math.toDegrees(Math.atan(var6_7 / var4_6));
                                    ** GOTO lbl143
                                }
                                case 441645999: {
                                    if (!(var4_6 > 0.0)) ** GOTO lbl106
                                    var11_4 = (var9_3 | var12_2) ^ 587060448;
                                    ** GOTO lbl136
                                }
                                case -573875437: {
                                    if (var6_7 > 0.0) ** continue;
lbl106:
                                    // 2 sources

                                    var11_4 = (var9_3 | var12_2) ^ 66844019;
                                    ** GOTO lbl136
                                }
                                case 993204898: {
                                    if (var4_6 < 0.0) {
                                        ** continue;
                                    }
                                    ** GOTO lbl143
                                }
lbl112:
                                // 1 sources

                                var11_4 = (var9_3 | var12_2) ^ -867180195;
                                continue block50;
                                case 401156026: {
                                    var8_9 = (int)(Math.abs(var2_5 - (double)var0.method_36454()) % 360.0);
                                    ** GOTO lbl130
                                }
                                case 1158513718: {
                                    var10_8 ^= var11_4 ^ -611713861;
                                    ** GOTO lbl132
                                }
lbl120:
                                // 1 sources

                                var11_4 = (var9_3 | var12_2) ^ 85481587;
                                continue block50;
                                case -1336278719: {
                                    var2_5 = Math.toDegrees(-Math.atan(var4_6 / var6_7));
                                    ** GOTO lbl143
                                }
lbl125:
                                // 1 sources

                                var11_4 = (var9_3 | var12_2) ^ 1618175107;
                                continue block50;
                                case 250727426: {
                                    var11_4 = (var9_3 | var12_2) ^ -520623697;
                                    ** GOTO lbl136
                                }
lbl130:
                                // 1 sources

                                var11_4 = (var9_3 | var12_2) ^ 1268092664;
                                ** continue;
lbl132:
                                // 1 sources

                                var11_4 = (var9_3 | var12_2) ^ 1193736894;
                                continue block50;
                                case 613504882: {
                                    var11_4 = (var9_3 | var12_2) ^ 864037648;
                                }
lbl136:
                                // 5 sources

                                default: {
                                    continue block50;
                                }
                                case 431960461: {
                                    var11_4 = (var9_3 | var12_2) ^ -315752368;
                                    continue block50;
                                }
                                case -1760583812: {
                                    var2_5 = Math.toDegrees(-Math.atan(var4_6 / var6_7));
lbl143:
                                    // 6 sources

                                    var11_4 = (var9_3 | var12_2) ^ 488007167;
                                    continue block50;
                                }
lbl145:
                                // 1 sources

                                var11_4 = (var9_3 | var12_2) ^ -1301184567;
                                continue block50;
lbl147:
                                // 1 sources

                                var11_4 = (var9_3 | var12_2) ^ -262522122;
                                continue block50;
lbl149:
                                // 1 sources

                                var11_4 = (var9_3 | var12_2) ^ -527049659;
                                continue block50;
                                case 394990160: 
                            }
                            if (!(var4_6 > 0.0)) ** break;
                            var11_4 = (var9_3 | var12_2) ^ -344683153;
                        }
                        break;
                    }
                    break;
                }
            }
            var12_2 = 1969494195;
            var9_3 = hC.a & 1969494195 ^ -751244450;
            var11_4 = 0;
            var10_8 = (var9_3 | var12_2) ^ -359913903;
            var11_4 = (var9_3 | var12_2) ^ 1953441698;
            block51: while (true) {
                switch (var11_4) {
                    default: {
                        continue block51;
                    }
                    case 635027833: {
                        var2_5 = 0.0;
                        ** break;
                    }
                    case -2095850403: {
                        var11_4 = (var9_3 | var12_2) ^ 1134141318;
                        continue block51;
                    }
lbl171:
                    // 1 sources

                    var10_8 ^= 1229570042;
                    ** continue;
                    case -1260034951: 
                }
                var10_8 ^= var11_4 ^ 2094415069;
                var11_4 = (var9_3 | var12_2) ^ -760923514;
            }
        }
        var10_8 ^= 129239085;
        return v0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static double managedYawMiss(class_1297 var0) {
        block20: {
            break block20;
lbl1:
            // 1 sources

            block15: while (true) {
                switch (var16_3) {
                    case 242189658: {
                        if (var1_4.field_1724 != null) {
                            var16_3 = (var14_2 | var17_1) ^ -1329688416;
                            continue block15;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1518464852: {
                        var16_3 = (var14_2 | var17_1) ^ -518762492;
                        continue block15;
                    }
                    case 311355401: {
                        var15_7 ^= var16_3 ^ 1093298253;
                        var16_3 = (var14_2 | var17_1) ^ -464454994;
                        ** GOTO lbl27
                    }
                    case -1683518600: {
                        var15_7 ^= var16_3 ^ -1161929135;
                        ** GOTO lbl31
                    }
                    case -999751258: {
                        var15_7 ^= var16_3 ^ 1553769840;
                        var16_3 = (var14_2 | var17_1) ^ 1389992378;
                        ** GOTO lbl27
                    }
                    case 187379696: {
                        if (var0 != null) {
                            var16_3 = (var14_2 | var17_1) ^ 777420370;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var16_3 = (var14_2 | var17_1) ^ 1905849484;
                        }
                    }
lbl27:
                    // 5 sources

                    default: {
                        continue block15;
                    }
                    case 1237072913: {
                        return 1.7976931348623157E308;
                    }
lbl31:
                    // 1 sources

                    var16_3 = (var14_2 | var17_1) ^ -1551678491;
                    continue block15;
                    case -1192827314: 
                }
                var2_10 = var1_4.field_1724.method_5739(var0);
                var15_7 ^= -69564875;
                var4_11 = ki.a.getManagedYaw();
                var15_7 ^= 112712243;
                var6_9 = Math.cos(Math.toRadians(var4_11 + 90.0)) * var2_10;
                var15_7 ^= -440810722;
                var8_5 = Math.sin(Math.toRadians(var4_11 + 90.0)) * var2_10;
                var15_7 ^= -439186548;
                var10_6 = var1_4.field_1724.method_23317() + var6_9;
                var15_7 ^= -806576983;
                var12_8 = var1_4.field_1724.method_23321() + var8_5;
                var15_7 ^= 1914914212;
                return hC.distance(var10_6, 0.0, var12_8, var0.method_23317(), 0.0, var0.method_23321());
            }
        }
        var17_1 = -1069777036;
        var14_2 = hC.a & -1069777036 ^ -365227100;
        var16_3 = 0;
        var15_7 = (var14_2 | var17_1) ^ -477978014;
        var16_3 = (var14_2 | var17_1) ^ -110514770;
        block16: while (true) {
            switch (var16_3) {
                default: {
                    continue block16;
                }
                case 324457050: {
                    var16_3 = (var14_2 | var17_1) ^ -1881581691;
                    continue block16;
                }
                case 1709582449: {
                    var15_7 ^= var16_3 ^ 557054522;
                    var16_3 = (var14_2 | var17_1) ^ -942641083;
                    continue block16;
                }
                case 770641841: 
            }
            break;
        }
        var1_4 = class_310.method_1551();
        var16_3 = (var14_2 | var17_1) ^ -122578947;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static class_243 closestPointOnBox(class_1297 var0, class_238 var1_1, double var2_2, double var4_3, double var6_4) {
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
    public static double pitchTo(class_1297 var0, double var1_1, double var3_2, double var5_3) {
        block14: {
            block15: {
                block13: {
                    var15_4 = hC.a & 667001102 ^ 914934058;
                    var17_5 = 0;
                    var16_6 = (var15_4 | 667001102) ^ 739063061;
                    ** GOTO lbl27
lbl5:
                    // 1 sources

                    return Math.atan2(var11_7, var13_8) * 180.0 / 3.141592653589793;
lbl7:
                    // 1 sources

                    while (true) {
                        var13_8 = Math.sqrt(var7_9 * var7_9 + var9_10 * var9_10);
                        ** GOTO lbl29
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var17_5 = (var15_4 | 667001102) ^ 1808063343;
                        break block13;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var9_10 = var0.method_23321() - var5_3;
                        ** GOTO lbl37
                        break;
                    }
                }
lbl17:
                // 2 sources

                block9: while (true) {
                    switch (var17_5) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block9;
                            }
                            break;
                        }
                        case 836422737: {
                            break block14;
                        }
                        case -1848417942: {
                            var16_6 ^= var17_5 ^ -1683016812;
                            ** continue;
                        }
lbl27:
                        // 1 sources

                        var17_5 = (var15_4 | 667001102) ^ 101918079;
                        ** continue;
lbl29:
                        // 1 sources

                        var16_6 ^= -1860068601;
                        ** continue;
lbl31:
                        // 1 sources

                        while (true) {
                            var16_6 ^= 2130521907;
                            ** continue;
                            break;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            var16_6 ^= -411597551;
                            ** continue;
                            break;
                        }
lbl37:
                        // 1 sources

                        var16_6 ^= 828413419;
                        break block15;
                        case 1544368705: {
                            var7_9 = var0.method_23317() - var1_1;
                            break block9;
                        }
                    }
                    break;
                }
                ** while (true)
            }
            var11_7 = var0.method_5829().field_1322 + 1.6 - var3_2;
            ** while (true)
        }
        var17_5 = (var15_4 | 667001102) ^ -1508210620;
        ** while (true)
    }

    private static int VG(int n2, int n3) {
        int n4 = 1100982627;
        int n5 = 1655677999;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x197F6672)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x63BF40C1;
        n6 += (n5 | n4) ^ 0x63BF2F2C;
        n6 ^= (n5 | n4) ^ 0x63BFCD0B;
        n6 -= (n5 | n4) ^ 0x63BF3FAA;
        n6 += (n5 | n4) ^ 0x63BFAA53;
        n6 -= (n5 | n4) ^ 0x63BFD20E;
        n6 -= (n5 | n4) ^ 0x63BFAB87;
        n6 += (n5 | n4) ^ 0x63BFF866;
        n6 -= (n5 | n4) ^ 0x63BF6974;
        return n6 ^= (n5 | n4) ^ 0x63BF1E06;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double distance(double d2, double d3, double d4, double d5, double d6, double d7) {
        int n2 = a & 0xBC5CDC03 ^ 0xF2CDE59F;
        int n3 = 0;
        int n4 = (n2 | 0xBC5CDC03) ^ 0x872336B6;
        n3 = (n2 | 0xBC5CDC03) ^ 0x89B72DC5;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 216072310: {
                    double d8 = d2 - d5;
                    n4 ^= 0xF18FA4C7;
                    double d9 = d3 - d6;
                    n4 ^= 0x7C021B75;
                    double d10 = d4 - d7;
                    n4 ^= 0xEFD37B6;
                    return Math.sqrt(d8 * d8 + d9 * d9 + d10 * d10);
                }
                case 1117201276: {
                    n4 ^= n3 ^ 0x35A7086A;
                    n3 = (n2 | 0xBC5CDC03) ^ 0xF23CFDE9;
                    continue block5;
                }
                case 2003488858: 
            }
            n3 = (n2 | 0xBC5CDC03) ^ 0xBC4ADEE3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double VH(double d2, double d3, double d4) {
        int n2 = a & 0xA6539A53 ^ 0x91CEE398;
        int n3 = 0;
        int n4 = (n2 | 0xA6539A53) ^ 0xA60127DF;
        n3 = (n2 | 0xA6539A53) ^ 0x1648BD18;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 624397386: {
                    n4 ^= n3 ^ 0xD14C78AC;
                    n3 = (n2 | 0xA6539A53) ^ 0xD377A643;
                    continue block5;
                }
                case 1688755608: {
                    return Math.max(d3, Math.min(d4, d2));
                }
                case -1583921469: 
            }
            n3 = (n2 | 0xA6539A53) ^ 0x92E87791;
        }
    }
}

