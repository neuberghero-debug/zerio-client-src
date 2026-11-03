/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_5134
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_5134;

@Environment(value=EnvType.CLIENT)
public final class cO {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), -1855339700);

    /*
     * Enabled aggressive block sorting
     */
    private cO() {
        int n2 = a & 0xA2C3479D ^ 0xD9CC4FFE;
        int n3 = (n2 | 0xA2C3479D) ^ 0xAC3FED;
        n3 ^= 0xE40AD043;
        n3 ^= 0xC14036EF;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static float getBlastDamage(class_243 var0, class_1309 var1_1, float var2_2) {
        block47: {
            var15_3 = 1744544798;
            var12_4 = cO.a & 1744544798 ^ 1298435931;
            var14_5 = 0;
            var13_6 = (var12_4 | var15_3) ^ 1422308859;
            var14_5 = (var12_4 | var15_3) ^ 673921205;
            ** GOTO lbl114
lbl7:
            // 1 sources

            while (true) {
                var14_5 = (var12_4 | var15_3) ^ 602493362;
                break block47;
lbl10:
                // 2 sources

                while (true) {
                    var14_5 = (var12_4 | var15_3) ^ -1775282458;
                    break block47;
                    break;
                }
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var13_6 ^= -665083360;
                var8_10 = (1.0 - var5_8 / var3_7) * (double)var7_9;
                var13_6 ^= -1143555747;
                var10_11 = (float)((var8_10 * var8_10 + var8_10) / 2.0 * 7.0 * var3_7 + 1.0);
                var13_6 ^= -608706222;
                var11_12 = (float)var1_1.method_45325(class_5134.field_23725);
                var14_5 = (var12_4 | var15_3) ^ 1065342687;
                ** GOTO lbl100
                break;
            }
lbl22:
            // 2 sources

            while (true) {
                var14_5 = (var12_4 | var15_3) ^ -1099682277;
                break block47;
                break;
            }
lbl25:
            // 1 sources

            while (true) {
                var14_5 = (var12_4 | var15_3) ^ 449970160;
                ** GOTO lbl32
                break;
            }
lbl28:
            // 1 sources

            while (true) {
                var13_6 ^= 258348476;
                var5_8 = Math.sqrt(var1_1.method_5707(var0));
                var14_5 = (var12_4 | var15_3) ^ 734059866;
lbl32:
                // 2 sources

                block40: while (true) {
                    switch (var14_5) {
                        case 1730281717: {
                            if (var5_8 > var3_7) {
                                var14_5 = (var12_4 | var15_3) ^ 980683685;
                                continue block40;
                            }
                            ** GOTO lbl42
                        }
                        case 1145008645: {
                            var13_6 ^= var14_5 ^ 726100457;
                            ** GOTO lbl47
                        }
lbl42:
                        // 1 sources

                        var14_5 = (var12_4 | var15_3) ^ -610078985;
                        ** GOTO lbl55
                        case -1793825187: {
                            var7_9 = cO.getExposure(var0, (class_1297)var1_1);
                            ** continue;
                        }
lbl47:
                        // 1 sources

                        var14_5 = (var12_4 | var15_3) ^ 148746154;
                        ** GOTO lbl55
                        case 1435215098: {
                            var13_6 ^= var14_5 ^ -1209812457;
                            ** continue;
                        }
                        case -1268956760: {
                            var13_6 ^= var14_5 ^ 630717678;
                            var14_5 = (var12_4 | var15_3) ^ -85210878;
                        }
lbl55:
                        // 4 sources

                        default: {
                            continue block40;
                        }
                        case 1965969583: 
                    }
                    break;
                }
                return 0.0f;
            }
        }
        block41: while (true) {
            switch (var14_5) {
                case -103745095: {
                    var14_5 = (var12_4 | var15_3) ^ 645630420;
                    continue block41;
                }
                case 1233397387: {
                    var10_11 = cO.applyResistance(var10_11, var1_1);
                    ** break;
                }
                case -125394131: {
                    var13_6 ^= var14_5 ^ 230193779;
                    var14_5 = (var12_4 | var15_3) ^ -988857203;
                    continue block41;
                }
                case 1350596992: {
                    var13_6 ^= var14_5 ^ -1093845779;
                    var14_5 = (var12_4 | var15_3) ^ 448811969;
                    ** GOTO lbl100
                }
                case -1328423944: {
                    var13_6 ^= var14_5 ^ -175342756;
                    ** GOTO lbl22
                }
                case -597785666: {
                    var13_6 ^= var14_5 ^ -196262418;
                    ** GOTO lbl10
                }
                case 1967127710: {
                    var10_11 = cO.applyArmorReduction(var10_11, var1_1.method_6096(), var11_12);
                    ** continue;
                }
                case -1136639932: {
                    var13_6 ^= var14_5 ^ 1013556833;
                    ** continue;
                }
lbl88:
                // 1 sources

                var14_5 = (var12_4 | var15_3) ^ -1753674638;
                ** GOTO lbl100
                case -779386556: {
                    switch (var13_6) {
                        case 1816374090: {
                            var14_5 = (var12_4 | var15_3) ^ -1281282847;
                            continue block41;
                        }
                        case 1069015202: {
                            var14_5 = (var12_4 | var15_3) ^ -742396133;
                            break;
                        }
                        default: {
                            var14_5 = (var12_4 | var15_3) ^ -550603609;
                        }
                    }
                }
lbl100:
                // 6 sources

                default: {
                    continue block41;
                }
                case 1276575469: {
                    ** continue;
                }
                case -1427074094: 
            }
            break;
        }
        return Math.max(0.0f, var10_11);
        while (true) {
            var14_5 = (var12_4 | var15_3) ^ -895876116;
            if (true) ** GOTO lbl114
            break;
        }
        block43: while (true) {
            var14_5 = (var12_4 | var15_3) ^ -1515482858;
            if (true) ** GOTO lbl114
            block44: while (true) {
                var14_5 = (var12_4 | var15_3) ^ 1612256827;
lbl114:
                // 4 sources

                block45: while (true) {
                    switch (var14_5) {
                        default: {
                            continue block45;
                        }
                        case -388902368: {
                            var13_6 ^= var14_5 ^ -759771622;
                            continue block44;
                        }
                        case -1520063309: {
                            var13_6 ^= var14_5 ^ 1876626739;
                            var14_5 = (var12_4 | var15_3) ^ -315517059;
                            continue block45;
                        }
                        case 266778980: {
                            if (!var1_1.method_5655()) ** continue;
                            var14_5 = (var12_4 | var15_3) ^ 147714120;
                            continue block45;
                        }
                        case 1731354391: {
                            var13_6 ^= var14_5 ^ 1588913091;
                            continue block43;
                        }
                        case 1205114858: {
                            var14_5 = (var12_4 | var15_3) ^ -2026996353;
                            continue block45;
                        }
                        case -2100414430: {
                            var3_7 = (double)var2_2 * 2.0;
                            ** continue;
                        }
                        case -900448695: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return 0.0f;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static float getExplosionDamage(class_243 var0, class_1309 var1_1, float var2_2) {
        var14_3 = 1877156360;
        var11_4 = cO.a & 1877156360 ^ -1964187035;
        var13_5 = 0;
        var12_8 = (var11_4 | var14_3) ^ -1542166968;
        var13_5 = (var11_4 | var14_3) ^ 551975560;
        if (true) ** GOTO lbl67
        block25: while (true) {
            switch (var13_5) {
                case -1292810999: {
                    var12_8 ^= var13_5 ^ -1527605614;
                    var13_5 = (var11_4 | var14_3) ^ 650763059;
                    ** break;
                }
                case -920241826: {
                    if (var5_7 >= var3_6) {
                        var13_5 = (var11_4 | var14_3) ^ -1513102110;
                        ** break;
                    }
                    var13_5 = (var11_4 | var14_3) ^ 2124815521;
                    ** break;
                }
                case 1243612815: {
                    var12_8 ^= var13_5 ^ 501218628;
                    var13_5 = (var11_4 | var14_3) ^ 1925765684;
                }
lbl22:
                // 5 sources

                default: {
                    continue block25;
                }
                case -1857421620: {
                    var12_8 ^= var13_5 ^ 2057863200;
                    var13_5 = (var11_4 | var14_3) ^ -1346879289;
                    continue block25;
                }
                case 1079485098: {
                    var7_9 = cO.getExposure(var0, (class_1297)var1_1);
                    var12_8 ^= -2051065363;
                    var8_10 = (1.0 - var5_7 / var3_6) * (double)var7_9;
                    var12_8 ^= -689240742;
                    var10_11 = (float)((var8_10 * var8_10 + var8_10) / 2.0 * 7.0 * (double)var2_2 + 1.0);
                    var13_5 = (var11_4 | var14_3) ^ -1036417955;
                    ** GOTO lbl85
                }
lbl36:
                // 1 sources

                while (true) {
                    var13_5 = (var11_4 | var14_3) ^ -1153060259;
                    ** GOTO lbl50
                    break;
                }
                while (true) {
                    var13_5 = (var11_4 | var14_3) ^ -1275277740;
                    ** GOTO lbl50
lbl42:
                    // 1 sources

                    while (true) {
                        var13_5 = (var11_4 | var14_3) ^ 1895732939;
                        ** GOTO lbl50
                        break;
                    }
                    break;
                }
lbl45:
                // 1 sources

                while (true) {
                    var12_8 ^= -1586351677;
                    var5_7 = var1_1.method_73189().method_1022(var0);
                    var13_5 = (var11_4 | var14_3) ^ 1562290020;
                    continue block25;
                    break;
                }
lbl50:
                // 3 sources

                block30: while (true) {
                    switch (var13_5) {
                        case 1783744577: {
                            var12_8 ^= var13_5 ^ 581046073;
                            ** continue;
                        }
                        case 1544760377: {
                            var12_8 ^= var13_5 ^ -481626514;
                            ** continue;
                        }
                        case 891199454: {
                            if (!var1_1.method_5655()) ** continue;
                            ** break;
                        }
                        case -821454619: {
                            ** GOTO lbl69
                        }
                        case -975166650: {
                            var12_8 ^= var13_5 ^ -1185789597;
                            ** GOTO lbl74
                        }
lbl66:
                        // 1 sources

                        var13_5 = (var11_4 | var14_3) ^ -2051134932;
lbl67:
                        // 3 sources

                        default: {
                            continue block30;
                        }
lbl69:
                        // 1 sources

                        var13_5 = (var11_4 | var14_3) ^ 705675563;
                        continue block30;
                        case -1626245978: {
                            var3_6 = (double)var2_2 * 2.0;
                            ** continue;
                        }
lbl74:
                        // 1 sources

                        var13_5 = (var11_4 | var14_3) ^ -621707853;
                        continue block30;
                        case 1420447792: 
                    }
                    break;
                }
                return 0.0f;
lbl78:
                // 1 sources

                while (true) {
                    var13_5 = (var11_4 | var14_3) ^ -172320116;
                    if (true) ** GOTO lbl85
                    break;
                }
                case -1658374055: 
            }
            break;
        }
        return 0.0f;
        block32: while (true) {
            var13_5 = (var11_4 | var14_3) ^ 1953829159;
lbl85:
            // 3 sources

            block33: while (true) {
                switch (var13_5) {
                    default: {
                        continue block33;
                    }
                    case 441809121: {
                        var10_11 = cO.applyResistance(var10_11, var1_1);
                        ** GOTO lbl107
                    }
                    case 769025584: {
                        var12_8 ^= var13_5 ^ -1421017095;
                        var13_5 = (var11_4 | var14_3) ^ 2071416390;
                        continue block33;
                    }
                    case -1684343990: {
                        var12_8 ^= var13_5 ^ -1614814886;
                        ** continue;
                    }
                    case -367288271: {
                        var12_8 ^= var13_5 ^ -797308483;
                        ** break;
                    }
                    case -1801933781: {
                        var10_11 = cO.applyArmorReduction(var10_11, var1_1.method_6096(), var1_1.method_18396());
                        continue block32;
                    }
lbl105:
                    // 1 sources

                    var13_5 = (var11_4 | var14_3) ^ 558937600;
                    continue block33;
lbl107:
                    // 1 sources

                    var13_5 = (var11_4 | var14_3) ^ 99893852;
                    continue block33;
                    case -826321811: 
                }
                break;
            }
            break;
        }
        return Math.max(0.0f, var10_11);
    }

    /*
     * Exception decompiling
     */
    public static float getExposure(class_243 var0, class_1297 var1_1) {
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
    public static float applyArmorReduction(float var0, float var1_1, float var2_2) {
        block10: {
            var5_3 = cO.a & 702067828 ^ -15192086;
            var7_4 = 0;
            ** GOTO lbl20
lbl4:
            // 1 sources

            block5: while (true) {
                switch (var7_4) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
                    case 1362839617: {
                        var3_6 = 2.0f + var2_2 / 4.0f;
                        break block5;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | 702067828) ^ -8654246;
                        ** GOTO lbl-1000
                        break;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | 702067828) ^ -1885641822;
                        ** continue;
                        break;
                    }
lbl20:
                    // 1 sources

                    var6_5 = (var5_3 | 702067828) ^ -569829949;
                    ** continue;
                    var4_7 = class_3532.method_15363((float)(var1_1 - var0 / var3_6), (float)(var1_1 * 0.2f), (float)20.0f);
                    var6_5 ^= -1134628267;
                    ** GOTO lbl28
                    case 1883495516: {
                        var6_5 ^= var7_4 ^ -942082201;
                        break block10;
                    }
lbl28:
                    // 1 sources

                    return var0 * (1.0f - var4_7 / 25.0f);
                }
                break;
            }
            var6_5 ^= -1191576514;
            ** while (true)
            {
                ** case 10702244:
            }
lbl32:
            // 1 sources

            ** while (true)
        }
        var7_4 = (var5_3 | 702067828) ^ -1360791617;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static float applyResistance(float var0, class_1309 var1_1) {
        var7_2 = -2000426821;
        var4_3 = cO.a & -2000426821 ^ 2066616593;
        var6_4 = 0;
        ** GOTO lbl39
lbl5:
        // 1 sources

        while (true) {
            var3_6 = Math.max(0.0f, 1.0f - (float)var2_5 * 0.2f);
            ** GOTO lbl41
lbl8:
            // 1 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ -1515468410;
                ** GOTO lbl27
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ -900952477;
                ** GOTO lbl27
                break;
            }
lbl14:
            // 2 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ -960782924;
                ** GOTO lbl27
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                var0 *= var3_6;
                ** GOTO lbl14
                break;
            }
lbl20:
            // 1 sources

            return var0;
lbl22:
            // 1 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ -1597178175;
                ** GOTO lbl27
                break;
            }
            break;
        }
lbl25:
        // 1 sources

        block16: while (true) {
            var6_4 = (var4_3 | var7_2) ^ 236264445;
lbl27:
            // 6 sources

            block17: while (true) {
                switch (var6_4) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block17;
                        }
                        break;
                    }
                    case -2120930585: {
                        break block16;
                    }
                    case 1581527101: {
                        ** continue;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var6_4 = (var4_3 | var7_2) ^ 2054869852;
                        ** continue;
                        break;
                    }
lbl39:
                    // 1 sources

                    var5_7 = (var4_3 | var7_2) ^ 685977067;
                    ** continue;
lbl41:
                    // 1 sources

                    var5_7 ^= 686619652;
                    ** continue;
                    case 1028940815: {
                        var5_7 ^= var6_4 ^ -1912522513;
                        ** continue;
                    }
                    case 1366624221: {
                        var5_7 ^= var6_4 ^ 1255689325;
                        ** continue;
                    }
                    case -168107450: {
                        var5_7 ^= var6_4 ^ -1284021850;
                        ** continue;
                    }
                }
                break;
            }
            break;
        }
        var6_4 = (var4_3 | var7_2) ^ -1432682906;
        ** while (true)
lbl54:
        // 1 sources

        while (true) {
            var5_7 ^= 1851883492;
            ** continue;
            break;
        }
        {
            case 1529022330: {
                if (var1_1.method_6059(class_1294.field_5907)) ** break;
                ** continue;
                ** continue;
            }
            ** case 832796632:
        }
lbl62:
        // 1 sources

        var2_5 = var1_1.method_6112(class_1294.field_5907).method_5578() + 1;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean canSeePosition(class_243 var0, class_243 var1_1) {
        block29: {
            break block29;
lbl-1000:
            // 3 sources

            {
                switch (var6_4) {
                    case -1158126610: {
                        var5_7 ^= var6_4 ^ 949449969;
                        ** break;
                    }
                    case -1460329113: {
                        v0 = true;
                        break block21;
                    }
                    case 1849368761: {
                        var5_7 ^= var6_4 ^ 1835253268;
                        var6_4 = (var4_3 | var7_2) ^ -754201960;
                        break;
                    }
lbl12:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ -1326919738;
                    continue block21;
                    case -1178955821: {
                        var5_7 ^= var6_4 ^ -1159589506;
                        ** break;
                    }
                    case -169858316: {
                        v0 = false;
                        break block21;
                    }
lbl20:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ -1910586101;
                    continue block21;
                    case -887742407: {
                        var6_4 = var3_6.method_17783() == class_239.class_240.field_1333 ? (var4_3 | var7_2) ^ 365285190 : (var4_3 | var7_2) ^ -1035706324;
                    }
                }
lbl24:
                // 4 sources

                ** while (true)
            }
            var5_7 ^= 286773058;
            return v0;
            {
                var6_4 = (var4_3 | var7_2) ^ -2080872092;
                block24: while (true) {
                    switch (var6_4) {
                        case -133790053: {
                            var3_6 = var2_5.field_1687.method_17742(new class_3959(var0, var1_1, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)var2_5.field_1724));
                            ** break;
                        }
                        case 217629155: {
                            var5_7 ^= var6_4 ^ 651368296;
                            var6_4 = (var4_3 | var7_2) ^ 841025736;
                        }
lbl36:
                        // 4 sources

                        default: {
                            continue block24;
                        }
lbl38:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -1056535535;
                        ** GOTO lbl24
                        case 1011527498: {
                            return false;
                        }
                        case -1905141983: {
                            var5_7 ^= var6_4 ^ 1902158808;
                            continue block23;
                        }
                        case 715879860: {
                            var5_7 ^= var6_4 ^ 477270819;
                            var6_4 = (var4_3 | var7_2) ^ 1202995381;
                            ** GOTO lbl36
                        }
                        case 1239410487: 
                    }
                    if (var2_5.field_1687 != null) {
                        var6_4 = (var4_3 | var7_2) ^ -175163170;
                        continue;
                    }
                    var6_4 = (var4_3 | var7_2) ^ 1364564555;
                }
            }
lbl55:
            // 1 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ 1996893724;
                ** GOTO lbl36
                break;
            }
        }
        var7_2 = 989522347;
        var4_3 = cO.a & 989522347 ^ 1665445620;
        var6_4 = 0;
        var5_7 = (var4_3 | var7_2) ^ -1144587929;
        var6_4 = (var4_3 | var7_2) ^ -42396142;
        block27: while (true) {
            switch (var6_4) {
                default: {
                    continue block27;
                }
                case 885722680: {
                    var5_7 ^= var6_4 ^ 536722490;
                    var6_4 = (var4_3 | var7_2) ^ -1782375971;
                    continue block27;
                }
                case -297929182: {
                    var2_5 = class_310.method_1551();
                    ** continue;
                }
                case -2037909011: 
            }
            var6_4 = (var4_3 | var7_2) ^ 1328931271;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean hasLineOfSight(class_1297 var0) {
        block18: {
            block19: {
                var7_1 = -570032095;
                var4_2 = cO.a & -570032095 ^ 706907465;
                var6_3 = 0;
                var5_5 = (var4_2 | var7_1) ^ -166874134;
                var6_3 = (var4_2 | var7_1) ^ 849639839;
                break block19;
                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ 2127050515;
                    break block18;
                    break;
                }
            }
            block16: while (true) {
                switch (var6_3) {
                    default: {
                        continue block16;
                    }
                    case 1180684343: {
                        var1_4 = class_310.method_1551();
                        var6_3 = (var4_2 | var7_1) ^ 2058322930;
                        break block16;
                    }
                    case -1646104486: {
                        var5_5 ^= var6_3 ^ -1465682054;
                        break;
                    }
                    case -863832842: {
                        ** break;
lbl24:
                        // 1 sources

                        var6_3 = (var4_2 | var7_1) ^ 1673854259;
                        continue block16;
                    }
                }
                var6_3 = (var4_2 | var7_1) ^ -1200005794;
            }
        }
        block17: while (true) {
            block20: {
                block21: {
                    switch (var6_3) {
                        case 553929478: {
                            return false;
                        }
                        case 1476017179: {
                            break block20;
                        }
                        case 2101496177: {
                            if (var1_4.field_1724 == null) ** GOTO lbl50
                            ** GOTO lbl55
                        }
                        case -1980144666: {
                            var5_5 ^= var6_3 ^ -1410061861;
                            var6_3 = (var4_2 | var7_1) ^ -551369105;
                            continue block17;
                        }
                        case 1367574097: {
                            var2_6 = var1_4.field_1724.method_33571();
                            var5_5 ^= 94961927;
                            var3_7 = var0.method_33571();
                            var5_5 ^= 1198903375;
                            return cO.canSeePosition(var2_6, var3_7);
                        }
                        case -711427632: {
                            if (var1_4.field_1687 != null) ** continue;
lbl50:
                            // 2 sources

                            var6_3 = (var4_2 | var7_1) ^ 2011164303;
                            ** GOTO lbl56
                        }
                        case -2071392613: {
                            var5_5 ^= var6_3 ^ -561227608;
                            break block21;
                        }
lbl55:
                        // 1 sources

                        var6_3 = (var4_2 | var7_1) ^ -1445154446;
lbl56:
                        // 3 sources

                        default: {
                            continue block17;
                        }
                        case -2131838342: 
                    }
                    var5_5 ^= var6_3 ^ 2078497974;
                    ** break;
lbl61:
                    // 1 sources

                    var6_3 = (var4_2 | var7_1) ^ -1348138184;
                    continue;
                }
                var6_3 = (var4_2 | var7_1) ^ -2090548200;
                continue;
            }
            var6_3 = (var4_2 | var7_1) ^ 733934777;
        }
    }
}

