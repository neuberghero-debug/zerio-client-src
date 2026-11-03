/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;

@Environment(value=EnvType.CLIENT)
public final class eA {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), 989701785);

    /*
     * Unable to fully structure code
     */
    private eA() {
        block10: {
            block8: {
                block9: {
                    break block9;
lbl1:
                    // 1 sources

                    while (true) {
                        var2_2 ^= 478005199;
                        break block8;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var2_2 ^= 779959281;
                        ** GOTO lbl18
                        break;
                    }
                }
                var1_1 = eA.a & -716806470 ^ -1829499783;
                break block10;
            }
            return;
        }
        var2_2 = (var1_1 | -716806470) ^ -2122156153;
        while (true) {
            switch (var2_2) {
                case -1812402550: {
                    ** continue;
                }
lbl18:
                // 2 sources

                while (true) {
                    super();
                    ** continue;
                    break;
                }
                default: {
                    var2_2 ^= -750159237;
                    ** continue;
                }
                case -226857200: 
            }
            var2_2 ^= 1124949083;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static float[] getRotationsTo(class_243 var0, class_243 var1_1) {
        block16: {
            block15: {
                block14: {
                    var12_2 = eA.a & -229232182 ^ 2100065431;
                    var14_3 = 0;
                    ** GOTO lbl32
lbl4:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl6:
                    // 1 sources

                    while (true) {
                        var6_7 = var1_1.field_1350 - var0.field_1350;
                        ** GOTO lbl37
                        break;
                    }
                    var14_3 = (var12_2 | -229232182) ^ 1845890105;
                    block7: while (true) {
                        switch (var14_3) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                default: {
                                    continue block7;
                                }
                                break;
                            }
lbl15:
                            // 1 sources

                            while (true) {
                                var14_3 = (var12_2 | -229232182) ^ -857397161;
                                ** GOTO lbl-1000
                                break;
                            }
lbl18:
                            // 1 sources

                            while (true) {
                                var13_4 ^= 1164537002;
                                ** GOTO lbl34
                                break;
                            }
lbl21:
                            // 1 sources

                            while (true) {
                                var13_4 ^= 368062048;
                                ** continue;
                                break;
                            }
lbl24:
                            // 1 sources

                            while (true) {
                                var14_3 = (var12_2 | -229232182) ^ 615395439;
                                ** continue;
                                break;
                            }
lbl27:
                            // 1 sources

                            while (true) {
                                var4_6 = var1_1.field_1351 - var0.field_1351;
                                ** continue;
                                break;
                            }
                            case -607107664: {
                                ** continue;
                            }
lbl32:
                            // 1 sources

                            var13_4 = (var12_2 | -229232182) ^ -82526171;
                            ** continue;
lbl34:
                            // 1 sources

                            var10_9 = (float)Math.toDegrees(Math.atan2(var6_7, var2_5)) - 90.0f;
                            var13_4 ^= 870315258;
                            ** GOTO lbl42
lbl37:
                            // 1 sources

                            var13_4 ^= -1392159659;
                            break block14;
                            case 865820040: {
                                var2_5 = var1_1.field_1352 - var0.field_1352;
                                break block15;
                            }
lbl42:
                            // 1 sources

                            var11_10 = (float)(-Math.toDegrees(Math.atan2(var4_6, var8_8)));
                            var13_4 ^= -17281027;
                            break block16;
                            case -1854375450: {
                                var13_4 ^= var14_3 ^ -578548374;
                                break block7;
                            }
                        }
                        break;
                    }
                    ** while (true)
                }
                var8_8 = Math.sqrt(var2_5 * var2_5 + var6_7 * var6_7);
                ** while (true)
            }
            var13_4 ^= -1609522597;
            ** while (true)
        }
        return new float[]{var10_9, var11_10};
    }

    /*
     * Exception decompiling
     */
    public static float[] getRotationsToEntity(class_1297 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
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
     * Enabled aggressive block sorting
     */
    public static float smoothAngle(float f2, float f3, float f4) {
        int n2 = a & 0x81FCA20 ^ 0xE6F01AC1;
        int n3 = 0;
        int n4 = (n2 | 0x81FCA20) ^ 0xAA914E21;
        n3 = (n2 | 0x81FCA20) ^ 0xDF8AC247;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -922569611: {
                    float f5 = class_3532.method_15393((float)(f3 - f2));
                    n4 ^= 0x30B8C188;
                    float f6 = class_3532.method_15363((float)f5, (float)(-f4), (float)f4);
                    n4 ^= 0xAF5C2B3B;
                    return f2 + f6;
                }
                case -10179248: {
                    n4 ^= n3 ^ 0x1A5D82B2;
                    n3 = (n2 | 0x81FCA20) ^ 0x27FD6E94;
                    continue block5;
                }
                case 829757606: 
            }
            n3 = (n2 | 0x81FCA20) ^ 0x119B77B1;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static float addJitter(float var0, float var1_1) {
        block8: {
            break block8;
lbl1:
            // 1 sources

            block5: while (true) {
                switch (var4_3) lbl-1000:
                // 3 sources

                {
                    default: {
                        continue block5;
                    }
                    case -179113199: {
                        var3_4 ^= var4_3 ^ 1469559785;
                        break block5;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | 884628152) ^ 392489454;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -161634566: {
                        return var0 + (float)(ThreadLocalRandom.current().nextGaussian() * (double)var1_1);
                    }
                    case 731879251: {
                        var4_3 = (var2_2 | 884628152) ^ -911635028;
                        ** GOTO lbl-1000
                    }
                }
                break;
            }
            var4_3 = (var2_2 | 884628152) ^ -895035321;
            ** while (true)
        }
        var2_2 = eA.a & 884628152 ^ 207842317;
        var4_3 = 0;
        var3_4 = (var2_2 | 884628152) ^ -1665844211;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void applySmoothRotation(float var0, float var1_1, float var2_2, float var3_3) {
        block52: {
            block53: {
                block54: {
                    block51: {
                        var20_4 = 1173724732;
                        var17_5 = eA.a & 1173724732 ^ 937339166;
                        var19_6 = 0;
                        var18_17 = (var17_5 | var20_4) ^ 1806458037;
                        var19_6 = (var17_5 | var20_4) ^ 463384413;
                        break block54;
lbl7:
                        // 1 sources

                        while (true) {
                            var13_14 = var11_13 * var11_13 * var11_13 * 1.2;
                            var18_17 ^= 82747452;
                            var15_15 = var7_10 - var5_8;
                            var18_17 ^= -1613849586;
                            var16_16 = var8_11 - var6_9;
                            var19_6 = (var17_5 | var20_4) ^ 642736504;
                            break block51;
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            var18_17 ^= 2100087212;
                            var7_10 = eA.smoothAngle(var5_8, var0, var2_2);
                            var18_17 ^= -239496158;
                            var8_11 = eA.smoothAngle(var6_9, var1_1, var2_2 * 0.8f);
                            var19_6 = (var17_5 | var20_4) ^ 1882668833;
                            break block52;
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            var19_6 = (var17_5 | var20_4) ^ 897545925;
                            break block53;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var19_6 = (var17_5 | var20_4) ^ 1496220868;
                            break block54;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var19_6 = (var17_5 | var20_4) ^ 534564297;
                            break block53;
                            break;
                        }
lbl31:
                        // 1 sources

                        while (true) {
                            var19_6 = (var17_5 | var20_4) ^ -1939501295;
                            break block52;
                            break;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            var19_6 = (var17_5 | var20_4) ^ -935461212;
                            break block53;
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var19_6 = (var17_5 | var20_4) ^ 1435969952;
                            break block51;
                            break;
                        }
lbl40:
                        // 2 sources

                        while (true) {
                            var19_6 = (var17_5 | var20_4) ^ -866413452;
                            break block52;
                            break;
                        }
                        while (true) {
                            var19_6 = (var17_5 | var20_4) ^ -1111152312;
                            break block53;
                            break;
                        }
                    }
                    block45: while (true) {
                        switch (var19_6) {
                            case 448587842: {
                                var18_17 ^= var19_6 ^ 1332492247;
                                var19_6 = (var17_5 | var20_4) ^ -2029446871;
                                continue block45;
                            }
                            case -1868350254: {
                                var15_15 = (float)((double)Math.round((double)var15_15 / var13_14) * var13_14);
                                var19_6 = (var17_5 | var20_4) ^ 1833129852;
                                continue block45;
                            }
                            case -252271081: {
                                var16_16 = (float)((double)Math.round((double)var16_16 / var13_14) * var13_14);
                                var19_6 = (var17_5 | var20_4) ^ -328458632;
                                continue block45;
                            }
                            case 1370545734: {
                                var18_17 ^= var19_6 ^ 728366329;
                                ** break;
                            }
                            case 2005099759: {
                                var18_17 ^= var19_6 ^ -908592960;
                                var19_6 = (var17_5 | var20_4) ^ 1793300067;
                                continue block45;
                            }
lbl68:
                            // 1 sources

                            var19_6 = (var17_5 | var20_4) ^ -413367316;
                            ** GOTO lbl77
                            case 577279646: {
                                var4_7.field_1724.method_36457(class_3532.method_15363((float)(var6_9 + var16_16), (float)-90.0f, (float)90.0f));
                                var19_6 = (var17_5 | var20_4) ^ 8182737;
                                ** GOTO lbl77
                            }
                            case -1684823738: {
                                var18_17 ^= var19_6 ^ -338665492;
                                var19_6 = (var17_5 | var20_4) ^ -636576702;
                            }
lbl77:
                            // 4 sources

                            default: {
                                continue block45;
                            }
                            case 651028465: {
                                var18_17 ^= var19_6 ^ 385653108;
                                ** continue;
                            }
                            case -1376705668: {
                                var4_7.field_1724.method_36456(var5_8 + var15_15);
                                var19_6 = (var17_5 | var20_4) ^ 1362254031;
                                continue block45;
                            }
                            case 488384861: 
                        }
                        break;
                    }
                    return;
lbl88:
                    // 1 sources

                    while (true) {
                        var19_6 = (var17_5 | var20_4) ^ -1572852862;
                        break block52;
                        break;
                    }
                }
                block47: while (true) {
                    switch (var19_6) {
                        default: {
                            continue block47;
                        }
                        case 1818300515: {
                            var19_6 = (var17_5 | var20_4) ^ 1068013898;
                            continue block47;
                        }
                        case 1213671028: {
                            var18_17 ^= var19_6 ^ -1089869540;
                            ** continue;
                        }
                        case 785464314: 
                    }
                    break;
                }
                var4_7 = class_310.method_1551();
                ** while (true)
lbl105:
                // 1 sources

                while (true) {
                    var11_13 = var9_12 * 0.6 + 0.2;
                    var18_17 ^= -579541212;
                    ** continue;
                    break;
                }
            }
            block49: while (true) {
                switch (var19_6) {
                    case -902130058: {
                        var18_17 ^= var19_6 ^ 1219318076;
                        ** GOTO lbl132
                    }
                    case 1747153655: {
                        var18_17 ^= var19_6 ^ 1714830450;
                        ** break;
                    }
                    case -817054893: {
                        var5_8 = var4_7.field_1724.method_36454();
                        var18_17 ^= -1781168519;
                        var6_9 = var4_7.field_1724.method_36455();
                        ** continue;
                    }
                    case 1115736571: {
                        var18_17 ^= var19_6 ^ 183841614;
                        ** continue;
                    }
lbl126:
                    // 1 sources

                    var19_6 = (var17_5 | var20_4) ^ -387549955;
                    default: {
                        continue block49;
                    }
                    case -1625699389: {
                        if (var4_7.field_1724 != null) ** continue;
                        ** continue;
                    }
lbl132:
                    // 1 sources

                    var19_6 = (var17_5 | var20_4) ^ -1196227475;
                    continue block49;
                    case -1077788262: 
                }
                break;
            }
            return;
        }
        block50: while (true) {
            switch (var19_6) {
                default: {
                    continue block50;
                }
                case 130580511: {
                    var18_17 ^= var19_6 ^ -719724934;
                    var19_6 = (var17_5 | var20_4) ^ 1395880482;
                    continue block50;
                }
                case -705384638: {
                    var9_12 = (Double)var4_7.field_1690.method_42495().method_41753();
                    var18_17 ^= 1532883579;
                    ** continue;
                }
                case -1454524805: {
                    var18_17 ^= var19_6 ^ -2905;
                    var19_6 = (var17_5 | var20_4) ^ 808758138;
                    continue block50;
                }
                case -1146868918: {
                    var18_17 ^= var19_6 ^ 1804275555;
                    var19_6 = (var17_5 | var20_4) ^ -1576333188;
                    continue block50;
                }
                case -73781201: {
                    var18_17 ^= var19_6 ^ -1389858061;
                    ** continue;
                }
                case 617401628: {
                    if (!(var3_3 > 0.0f)) ** GOTO lbl40
                    var19_6 = (var17_5 | var20_4) ^ -558757563;
                    continue block50;
                }
                case -708864836: {
                    var8_11 = eA.addJitter(var8_11, var3_3 * 0.5f);
                    ** continue;
                }
                case 1204491332: 
            }
            break;
        }
        var7_10 = eA.addJitter(var7_10, var3_3);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static float yawDelta(float var0, float var1_1) {
        block7: {
            break block7;
lbl1:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | 540893336) ^ 555706512;
                block6: while (true) {
                    block8: {
                        switch (var4_3) {
                            default: {
                                continue block6;
                            }
                            case -903872466: {
                                break;
                            }
                            case -1595261641: {
                                var3_4 ^= var4_3 ^ -2017890172;
                                break block8;
                            }
                        }
                        var4_3 = (var2_2 | 540893336) ^ 1272272265;
                        continue;
                    }
                    var4_3 = (var2_2 | 540893336) ^ 214364242;
                }
                break;
            }
        }
        var2_2 = eA.a & 540893336 ^ -885036890;
        var4_3 = 0;
        var3_4 = (var2_2 | 540893336) ^ -1783046026;
        ** while (true)
        {
            ** case -403072788:
        }
lbl23:
        // 1 sources

        return Math.abs(class_3532.method_15393((float)(var1_1 - var0)));
    }

    /*
     * Unable to fully structure code
     */
    public static float pitchDelta(float var0, float var1_1) {
        block8: {
            block6: {
                block7: {
                    var2_2 = eA.a & 1553933603 ^ -201224895;
                    var4_3 = 0;
                    ** GOTO lbl10
lbl4:
                    // 3 sources

                    block5: while (true) {
                        switch (var4_3) {
                            default: {
                                continue block5;
                            }
                            case 598976989: {
                                break block6;
                            }
lbl10:
                            // 1 sources

                            var3_4 = (var2_2 | 1553933603) ^ -1697745065;
                            break block7;
                            case -1510192759: {
                                return Math.abs(var1_1 - var0);
                            }
                            case -1915375414: {
                                var3_4 ^= var4_3 ^ -1410046260;
                                break block5;
                            }
                        }
                        break;
                    }
                    break block8;
                }
                var4_3 = (var2_2 | 1553933603) ^ -550763330;
                ** GOTO lbl4
            }
            var4_3 = (var2_2 | 1553933603) ^ 1900682665;
            ** GOTO lbl4
        }
        var4_3 = (var2_2 | 1553933603) ^ 1499718890;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static boolean isWithinAngle(float var0, float var1_1, float var2_2, float var3_3, float var4_4) {
        block24: {
            block26: {
                block25: {
                    break block26;
lbl1:
                    // 2 sources

                    while (true) {
                        var6_8 ^= 489937271;
                        ** GOTO lbl62
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var7_7 = (var5_6 | var8_5) ^ 64352384;
                        ** GOTO lbl43
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        if (!(eA.pitchDelta(var1_1, var3_3) <= var4_4)) break block24;
                        ** GOTO lbl58
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var7_7 = (var5_6 | var8_5) ^ -1152146489;
                        ** GOTO lbl43
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var7_7 = (var5_6 | var8_5) ^ -1384420525;
                        ** GOTO lbl43
                        break;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var6_8 ^= var7_7 ^ -794031803;
                        ** continue;
                        break;
                    }
lbl19:
                    // 1 sources

                    while (true) {
                        var6_8 ^= var7_7 ^ 1103180655;
                        break block25;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var7_7 = (var5_6 | var8_5) ^ 1139935466;
                        ** GOTO lbl43
                        break;
                    }
                }
                var7_7 = (var5_6 | var8_5) ^ 843152834;
                ** GOTO lbl43
lbl28:
                // 1 sources

                while (true) {
                    var6_8 ^= var7_7 ^ 935747988;
                    ** continue;
                    break;
                }
lbl31:
                // 1 sources

                while (true) {
                    var7_7 = (var5_6 | var8_5) ^ -1102047429;
                    ** GOTO lbl43
                    break;
                }
            }
            var8_5 = -1489392838;
            var5_6 = eA.a & -1489392838 ^ -6834991;
            var7_7 = 0;
            var6_8 = (var5_6 | var8_5) ^ 1958959890;
            ** while (true)
        }
        block21: while (true) {
            var7_7 = (var5_6 | var8_5) ^ 604385405;
lbl43:
            // 7 sources

            block22: while (true) {
                switch (var7_7) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block22;
                        }
                        break;
                    }
                    case 1106225344: {
                        ** continue;
                    }
                    case -259021934: {
                        ** continue;
                    }
                    case -1380000387: {
                        ** continue;
                    }
                    case -608596090: {
                        ** continue;
                    }
                    case 1156324412: {
                        ** GOTO lbl60
                    }
lbl58:
                    // 1 sources

                    var7_7 = (var5_6 | var8_5) ^ 1375822470;
                    ** GOTO lbl-1000
lbl60:
                    // 1 sources

                    var7_7 = (var5_6 | var8_5) ^ 254811241;
                    ** continue;
lbl62:
                    // 1 sources

                    return v0;
                    case 1388631208: {
                        if (!(eA.yawDelta(var0, var2_2) <= var4_4)) continue block21;
                        ** continue;
                    }
                    case -1135757551: {
                        ** continue;
                    }
                    case -60141701: {
                        v0 = false;
                        ** GOTO lbl1
                    }
                    case -838942151: 
                }
                break;
            }
            break;
        }
        v0 = true;
        ** while (true)
    }
}

