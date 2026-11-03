/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1421
 *  net.minecraft.class_1429
 *  net.minecraft.class_1473
 *  net.minecraft.class_1510
 *  net.minecraft.class_1531
 *  net.minecraft.class_1571
 *  net.minecraft.class_1588
 *  net.minecraft.class_1621
 *  net.minecraft.class_1646
 *  net.minecraft.class_1657
 *  net.minecraft.class_270
 *  net.minecraft.class_310
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1421;
import net.minecraft.class_1429;
import net.minecraft.class_1473;
import net.minecraft.class_1510;
import net.minecraft.class_1531;
import net.minecraft.class_1571;
import net.minecraft.class_1588;
import net.minecraft.class_1621;
import net.minecraft.class_1646;
import net.minecraft.class_1657;
import net.minecraft.class_270;
import net.minecraft.class_310;
import z.r.gj;
import z.r.ix;
import z.r.ke;
import z.r.mp;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class ld {
    private final ke a;
    private final ke b;
    private final ke c;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final int[] a;
    private static final /* synthetic */ String c;
    public static final int a;
    private final ke d;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private final ke e;
    private final ke f;
    private static final /* synthetic */ String f;
    private final ke g;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;

    /*
     * Enabled aggressive block sorting
     */
    private ld(ke ke2, ke ke3, ke ke4, ke ke5, ke ke6, ke ke7, ke ke8) {
        int n2 = -1826250240;
        int n3 = a & 0x9325A200 ^ 0x654A7107;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x9124D12E;
        n5 ^= 0xB98D9EA3;
        n4 = (n3 | n2) ^ 0x201C2CE2;
        block18: while (true) {
            switch (n4) {
                default: {
                    continue block18;
                }
                case -676998107: {
                    this.f = ke2;
                    n4 = (n3 | n2) ^ 0x7C7FE6AD;
                    continue block18;
                }
                case -680271899: {
                    n5 ^= n4 ^ 0xA16397B7;
                    n4 = (n3 | n2) ^ 0x20CA2722;
                    continue block18;
                }
                case -1576199457: {
                    this.d = ke8;
                    n4 = (n3 | n2) ^ 0x789B13CF;
                    continue block18;
                }
                case -1979330825: {
                    n5 ^= n4 ^ 0x7FAFC2FA;
                    n4 = (n3 | n2) ^ 0xCB74E8B5;
                    continue block18;
                }
                case -1961880150: {
                    n5 ^= n4 ^ 0x3F78E626;
                    n4 = (n3 | n2) ^ 0x5638715E;
                    continue block18;
                }
                case -1683117347: {
                    n5 ^= n4 ^ 0x3F9312C4;
                    n4 = (n3 | n2) ^ 0xFFD0C821;
                    continue block18;
                }
                case 146750246: {
                    this.e = ke7;
                    n4 = (n3 | n2) ^ 0x3A014F9A;
                    continue block18;
                }
                case 1008409522: {
                    this.b = ke5;
                    n4 = (n3 | n2) ^ 0xB8F14660;
                    continue block18;
                }
                case -1879777080: {
                    n5 ^= n4 ^ 0x92D11CA;
                    n4 = (n3 | n2) ^ 0x148E8FCA;
                    continue block18;
                }
                case 156273011: {
                    this.a = ke4;
                    n4 = (n3 | n2) ^ 0x7D6A3DF0;
                    continue block18;
                }
                case -1588100519: {
                    this.g = ke3;
                    n4 = (n3 | n2) ^ 0xF408AF3A;
                    continue block18;
                }
                case -848380771: {
                    n5 ^= n4 ^ 0x91DE7CF6;
                    n4 = (n3 | n2) ^ 0x5562E9D8;
                    continue block18;
                }
                case -471761715: {
                    return;
                }
                case 57105469: {
                    n5 ^= n4 ^ 0xB3843D38;
                    n4 = (n3 | n2) ^ 0xFE3F7A74;
                    continue block18;
                }
                case -865032487: {
                    this.c = ke6;
                    n4 = (n3 | n2) ^ 0x6CC259DA;
                    continue block18;
                }
                case 1335801191: 
            }
            n5 ^= n4 ^ 0xC060E918;
            n4 = (n3 | n2) ^ 0x3B1F55DE;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ld createForModule(mp mp2) {
        int n2 = a & 0xC48279C5 ^ 0xAB5BED4B;
        int n3 = 0;
        int n4 = (n2 | 0xC48279C5) ^ 0xC125395F;
        n3 = (n2 | 0xC48279C5) ^ 0xB7AF76D0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1275170395: {
                    n4 ^= n3 ^ 0x3739C6AB;
                    n3 = (n2 | 0xC48279C5) ^ 0x61C79329;
                    continue block5;
                }
                case -1910739226: {
                    n4 ^= 0x7D9DFDFA;
                    n4 ^= 0xA5598057;
                    n4 ^= 0xC5DCF364;
                    n4 ^= 0xA0F2FCBA;
                    n4 ^= 0x5836E5B2;
                    n4 ^= 0x7A000FBC;
                    n4 ^= 0x45BAAF71;
                    n4 ^= 0x364AC9BA;
                    return new ld(ld.Ag(mp2, c, true), ld.Ag(mp2, f, false), ld.Ag(mp2, a, false), ld.Ag(mp2, e, false), ld.Ag(mp2, d, false), ld.Ag(mp2, b, false), ld.Ag(mp2, h, false));
                }
                case 1484032799: 
            }
            n3 = (n2 | 0xC48279C5) ^ 0xA3DA7394;
        }
    }

    /*
     * Exception decompiling
     */
    private static ke Ag(mp var0, String var1_1, boolean var2_2) {
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
    public ke playersSetting() {
        int n2 = a & 0xE3B67840 ^ 0xB15B6B56;
        int n3 = 0;
        int n4 = (n2 | 0xE3B67840) ^ 0x5878F17A;
        n3 = (n2 | 0xE3B67840) ^ 0x48353183;
        block5: while (true) {
            switch (n3) {
                case 803256553: {
                    return this.f;
                }
                case -670700538: {
                    n4 ^= n3 ^ 0x4D78A780;
                    break;
                }
                case -1144370475: {
                    n3 = (n2 | 0xE3B67840) ^ 0x2BFA9750;
                }
                default: {
                    continue block5;
                }
            }
            n3 = (n2 | 0xE3B67840) ^ 0xDC1FC3BF;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public ke mobsSetting() {
        int n2 = a & 0x238C6585 ^ 0xC858467D;
        int n3 = 0;
        int n4 = (n2 | 0x238C6585) ^ 0x92D2EC51;
        n3 = (n2 | 0x238C6585) ^ 0xACF87DF9;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1193548292: {
                    n3 = (n2 | 0x238C6585) ^ 0xFEECAF2D;
                    continue block5;
                }
                case 355518672: {
                    n4 ^= n3 ^ 0x4B1A57E;
                    n3 = (n2 | 0x238C6585) ^ 0x3082E7EF;
                    continue block5;
                }
                case -614563822: 
            }
            break;
        }
        return this.g;
    }

    /*
     * Enabled aggressive block sorting
     */
    public ke peacefulSetting() {
        int n2 = a & 0x3AAB8BAA ^ 0xCE8A88A4;
        int n3 = 0;
        int n4 = (n2 | 0x3AAB8BAA) ^ 0x9B1ACF;
        n3 = (n2 | 0x3AAB8BAA) ^ 0x74A20F6C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1920851576: {
                    n4 ^= n3 ^ 0x2604AEA0;
                    n3 = (n2 | 0x3AAB8BAA) ^ 0xA6465ADA;
                    continue block5;
                }
                case -1979087678: {
                    n3 = (n2 | 0x3AAB8BAA) ^ 0x8CD655D6;
                    continue block5;
                }
                case 1491980660: 
            }
            break;
        }
        return this.a;
    }

    /*
     * Unable to fully structure code
     */
    public ke neutralSetting() {
        block7: {
            var1_1 = ld.a & -1837312701 ^ 2101709971;
            var3_2 = 0;
            var2_3 = (var1_1 | -1837312701) ^ 287966763;
            ** GOTO lbl12
lbl5:
            // 2 sources

            block5: while (true) {
                switch (var3_2) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
                    case -233513946: {
                        break block5;
                    }
lbl12:
                    // 1 sources

                    var3_2 = (var1_1 | -1837312701) ^ 224985589;
                    ** continue;
                    case -714228496: {
                        var2_3 ^= var3_2 ^ -189451676;
                        break block7;
                    }
                }
                break;
            }
            var3_2 = (var1_1 | -1837312701) ^ 705716515;
            ** GOTO lbl5
            {
                ** case -341643222:
            }
lbl20:
            // 1 sources

            return this.b;
        }
        var3_2 = (var1_1 | -1837312701) ^ 350170617;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public ke ignoreNakedSetting() {
        int n2 = a & 0x46245F32 ^ 0xD309AE85;
        int n3 = 0;
        int n4 = (n2 | 0x46245F32) ^ 0x6DB9E31D;
        n3 = (n2 | 0x46245F32) ^ 0xDA03E606;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1032147587: {
                    n4 ^= n3 ^ 0x20228B9C;
                    n3 = (n2 | 0x46245F32) ^ 0x77E2272;
                    continue block5;
                }
                case 221125041: {
                    n3 = (n2 | 0x46245F32) ^ 0x155752CA;
                    continue block5;
                }
                case -799810107: 
            }
            break;
        }
        return this.c;
    }

    /*
     * Unable to fully structure code
     */
    public ke ignoreInvisibleSetting() {
        block9: {
            break block9;
            {
                var2_3 ^= var3_2 ^ 814056044;
                var3_2 = (var1_1 | 1784170195) ^ -2014353687;
lbl3:
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
                        case 1731608534: {
                            continue block5;
                        }
                        case 243392274: {
                            break block5;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 1784170195) ^ 1952387269;
                            ** continue;
                            break;
                        }
                        case -47077058: {
                            return this.e;
                        }
                    }
                    break;
                }
            }
            var3_2 = (var1_1 | 1784170195) ^ 501805057;
            ** while (true)
        }
        var1_1 = ld.a & 1784170195 ^ 1352043796;
        var3_2 = 0;
        var2_3 = (var1_1 | 1784170195) ^ 71579243;
        ** while (true)
    }

    private static int Ah(int n2, int n3) {
        int n4 = -1930486125;
        int n5 = 1859043695;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xD0EDE55E)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xEEEF4217;
        n6 -= (n5 | n4) ^ 0xEEEF25FA;
        n6 ^= (n5 | n4) ^ 0xEEEFCA03;
        n6 += (n5 | n4) ^ 0xEEEF11EF;
        n6 += (n5 | n4) ^ 0xEEEF4C30;
        n6 -= (n5 | n4) ^ 0xEEEF098F;
        n6 += (n5 | n4) ^ 0xEEEF7CEC;
        n6 -= (n5 | n4) ^ 0xEEEF6530;
        return n6 -= (n5 | n4) ^ 0xEEEF45B4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public ke ignoreBehindWallsSetting() {
        int n2 = a & 0x1E9D47F ^ 0xA708EF1;
        int n3 = 0;
        int n4 = (n2 | 0x1E9D47F) ^ 0xBE3767D4;
        n3 = (n2 | 0x1E9D47F) ^ 0x5540C469;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1589189270: {
                    n3 = (n2 | 0x1E9D47F) ^ 0x285913A6;
                    continue block5;
                }
                case 597740889: {
                    n4 ^= n3 ^ 0x5BE9F441;
                    n3 = (n2 | 0x1E9D47F) ^ 0xC4FCFDB5;
                    continue block5;
                }
                case -821746870: 
            }
            break;
        }
        return this.d;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean isValidTarget(class_1297 var1_1) {
        var10_2 = -535190361;
        var7_3 = ld.a & -535190361 ^ 2028448275;
        var9_4 = 0;
        var8_11 = (var7_3 | var10_2) ^ 834607937;
        var9_4 = (var7_3 | var10_2) ^ -570590583;
        if (true) ** GOTO lbl20
lbl7:
        // 1 sources

        while (true) {
            var9_4 = (var7_3 | var10_2) ^ 746830165;
            ** GOTO lbl489
            break;
        }
lbl10:
        // 2 sources

        while (true) {
            var8_11 ^= 1200026031;
            var6_10 = v0;
            var9_4 = (var7_3 | var10_2) ^ 1349780172;
            ** GOTO lbl489
            break;
        }
lbl15:
        // 1 sources

        while (true) {
            var9_4 = (var7_3 | var10_2) ^ 121232687;
            ** GOTO lbl353
            break;
        }
        while (true) {
            var9_4 = (var7_3 | var10_2) ^ 1946413857;
lbl20:
            // 2 sources

            block146: while (true) {
                switch (var9_4) {
                    case 620942398: {
                        var9_4 = (var7_3 | var10_2) ^ -1227249793;
                    }
                    default: {
                        continue block146;
                    }
                    case -1929624170: {
                        var2_5 = class_310.method_1551();
                        var9_4 = (var7_3 | var10_2) ^ -1973357687;
                        ** GOTO lbl353
                    }
                    case 1311115720: {
                        var8_11 ^= var9_4 ^ 1279204447;
                        break block146;
                    }
                }
                break;
            }
        }
lbl34:
        // 1 sources

        while (true) {
            var9_4 = (var7_3 | var10_2) ^ 1951872012;
            ** GOTO lbl293
            break;
        }
        while (true) {
            var9_4 = (var7_3 | var10_2) ^ -1124592338;
            ** GOTO lbl353
            break;
        }
lbl40:
        // 1 sources

        while (true) {
            var9_4 = (var7_3 | var10_2) ^ -273075539;
            ** GOTO lbl353
            break;
        }
lbl43:
        // 1 sources

        while (true) {
            var9_4 = (var7_3 | var10_2) ^ 1172039964;
            ** GOTO lbl51
            break;
        }
lbl46:
        // 1 sources

        while (true) {
            var9_4 = (var7_3 | var10_2) ^ 1511327062;
            if (true) ** GOTO lbl470
            break;
        }
        block152: while (true) {
            var9_4 = (var7_3 | var10_2) ^ -1630883186;
lbl51:
            // 2 sources

            block153: while (true) {
                switch (var9_4) {
                    case -40254824: {
                        if (!(var1_1 instanceof class_1531)) ** GOTO lbl139
                        ** GOTO lbl85
                    }
                    case -1491924630: {
                        var8_11 ^= var9_4 ^ 96599334;
                        continue block152;
                    }
                    case -84723295: {
                        if (!var3_6.method_5767()) ** GOTO lbl157
                        ** GOTO lbl79
                    }
                    case 1348710188: {
                        ** GOTO lbl98
                    }
                    case -979066801: {
                        if (var2_5.field_1724.method_6057(var1_1)) ** GOTO lbl110
                        ** GOTO lbl137
                    }
                    case 1231480406: {
                        if (((Boolean)this.d.getValue()).booleanValue()) {
                            ** break;
                        }
                        ** GOTO lbl110
                    }
                    case -1121695829: {
                        if (var3_6.method_6032() <= 0.0f) ** GOTO lbl133
                        ** GOTO lbl87
                    }
lbl74:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ -1466170981;
                    continue block153;
                    case -1325718692: {
                        var8_11 ^= var9_4 ^ 2008811716;
                        ** GOTO lbl112
                    }
lbl79:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ 621040373;
                    continue block153;
                    case 1054624369: {
                        var8_11 ^= var9_4 ^ -1501709660;
                        var9_4 = (var7_3 | var10_2) ^ -1315354399;
                        continue block153;
                    }
lbl85:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ 1724548146;
                    continue block153;
lbl87:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ 1984397449;
                    continue block153;
                    case -742021391: {
                        var8_11 ^= var9_4 ^ -1629690403;
                        ** GOTO lbl105
                    }
                    case -1640682875: {
                        var8_11 ^= var9_4 ^ -1132124548;
                        ** GOTO lbl120
                    }
                    case -570688446: {
                        var8_11 ^= var9_4 ^ 2114155916;
                        ** GOTO lbl141
                    }
lbl98:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ 1029377784;
                    continue block153;
                    case 1714756665: {
                        if (var3_6 instanceof class_1657) {
                            var9_4 = (var7_3 | var10_2) ^ -1444034813;
                            continue block153;
                        }
                        ** GOTO lbl273
                    }
lbl105:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ 237962508;
                    continue block153;
                    case 609563427: {
                        var8_11 ^= var9_4 ^ 1335655572;
                        ** GOTO lbl159
                    }
lbl110:
                    // 2 sources

                    var9_4 = (var7_3 | var10_2) ^ 1609344989;
                    continue block153;
lbl112:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ 790913773;
                    continue block153;
                    case -1835077082: {
                        if (!((Boolean)this.e.getValue()).booleanValue()) ** GOTO lbl157
                        ** GOTO lbl135
                    }
                    case 1812379947: {
                        var8_11 ^= var9_4 ^ -452628930;
                        ** continue;
                    }
lbl120:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ -1277224905;
                    continue block153;
                    case 1129590218: {
                        var8_11 ^= var9_4 ^ 817152391;
                        ** GOTO lbl143
                    }
                    case 1332737775: {
                        var9_4 = (var7_3 | var10_2) ^ 34379542;
                        continue block153;
                    }
                    case 758344322: {
                        if (var3_6.method_29504()) ** GOTO lbl133
                        var9_4 = (var7_3 | var10_2) ^ -592798316;
                    }
                    default: {
                        continue block153;
                    }
lbl133:
                    // 2 sources

                    var9_4 = (var7_3 | var10_2) ^ 1208258027;
                    continue block153;
lbl135:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ -1215276968;
                    continue block153;
lbl137:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ 725223494;
                    continue block153;
lbl139:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ -1795614820;
                    continue block153;
lbl141:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ 1657104747;
                    continue block153;
lbl143:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ 148544906;
                    continue block153;
                    case -265997507: {
                        var4_7 = var3_6 instanceof class_1657;
                        ** continue;
                    }
                    case 1360161204: {
                        var9_4 = (var7_3 | var10_2) ^ -1297440878;
                        continue block153;
                    }
                    case -1900532162: {
                        ** GOTO lbl161
                    }
                    case 1016189409: {
                        var8_11 ^= var9_4 ^ -328656674;
                        var9_4 = (var7_3 | var10_2) ^ 90598447;
                        continue block153;
                    }
lbl157:
                    // 2 sources

                    var9_4 = (var7_3 | var10_2) ^ -970726202;
                    continue block153;
lbl159:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ 1784765585;
                    continue block153;
lbl161:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ -708000715;
                    continue block153;
                    case 1247097125: {
                        var4_8 = (class_1657)var3_6;
                        if (ix.get() == null) ** GOTO lbl273
                        ** continue;
                    }
                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -682209068;
                        ** GOTO lbl353
                        break;
                    }
lbl170:
                    // 2 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -1658587632;
                        ** GOTO lbl489
                        break;
                    }
lbl-1000:
                    // 7 sources

                    {
                        switch (var9_4) {
                            case -721195818: {
                                ** GOTO lbl205
                            }
                            case -1589717078: {
                                v0 = false;
                                ** GOTO lbl10
                            }
                            case 409019208: {
                                v0 = true;
                                ** continue;
                            }
                            case 183628015: {
                                if (!(var3_6 instanceof class_1473)) ** GOTO lbl195
                                ** GOTO lbl193
                            }
                            case -972353282: {
                                if (var3_6 instanceof class_1646) ** GOTO lbl193
                                ** GOTO lbl203
                            }
                            case 918255773: {
                                var8_11 ^= var9_4 ^ -2104334550;
                                break;
                            }
                            case -617210902: {
                                if (!(var3_6 instanceof class_1429)) ** GOTO lbl201
lbl193:
                                // 3 sources

                                var9_4 = (var7_3 | var10_2) ^ -795184113;
                                ** GOTO lbl216
                            }
lbl195:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ -2048546198;
                            continue block156;
                            case 2098857181: {
                                var8_11 ^= var9_4 ^ 61656849;
                                var9_4 = (var7_3 | var10_2) ^ 1505851677;
                                continue block156;
                            }
lbl201:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 1143236220;
                            continue block156;
lbl203:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 771539553;
                            continue block156;
lbl205:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ -233939368;
                            continue block156;
                            case -1126446901: {
                                var9_4 = (var7_3 | var10_2) ^ 1056226889;
                                ** GOTO lbl216
                            }
                            case 677763768: {
                                var8_11 ^= var9_4 ^ 1456673140;
                                var9_4 = (var7_3 | var10_2) ^ -526479873;
                                ** GOTO lbl216
                            }
                        }
                        var9_4 = (var7_3 | var10_2) ^ 600421725;
                        continue;
lbl216:
                        // 5 sources

                        ** while (true)
                    }
lbl217:
                    // 3 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ 895704566;
                        ** GOTO lbl489
lbl220:
                        // 1 sources

                        while (true) {
                            var9_4 = (var7_3 | var10_2) ^ -735969264;
                            ** GOTO lbl489
                            break;
                        }
lbl223:
                        // 1 sources

                        while (true) {
                            var9_4 = (var7_3 | var10_2) ^ -1943562443;
                            ** GOTO lbl489
                            break;
                        }
                        break;
                    }
                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ 185861007;
                        ** GOTO lbl489
lbl229:
                        // 1 sources

                        while (true) {
                            var9_4 = (var7_3 | var10_2) ^ -471057648;
                            ** GOTO lbl489
                            break;
                        }
                        break;
                    }
lbl232:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -8875562;
                        ** GOTO lbl353
                        break;
                    }
lbl235:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ 695305343;
                        ** GOTO lbl489
                        break;
                    }
lbl238:
                    // 2 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ 232178738;
                        ** GOTO lbl353
                        break;
                    }
lbl241:
                    // 2 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ 686256583;
                        ** GOTO lbl489
lbl244:
                        // 1 sources

                        while (true) {
                            var9_4 = (var7_3 | var10_2) ^ -1580857539;
                            ** GOTO lbl489
lbl247:
                            // 1 sources

                            while (true) {
                                var9_4 = (var7_3 | var10_2) ^ 133771903;
                                ** GOTO lbl489
                                break;
                            }
                            while (true) {
                                var9_4 = (var7_3 | var10_2) ^ -1300928461;
                                ** GOTO lbl489
                                break;
                            }
                            break;
                        }
                        break;
                    }
lbl253:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -737428036;
                        ** GOTO lbl489
                        break;
                    }
lbl256:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -834349526;
                        ** GOTO lbl216
                        break;
                    }
lbl259:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ 2017434762;
                        ** GOTO lbl489
                        break;
                    }
lbl262:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -1259273049;
                        ** GOTO lbl353
                        break;
                    }
lbl265:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -1059882889;
                        ** GOTO lbl489
lbl268:
                        // 1 sources

                        while (true) {
                            var9_4 = (var7_3 | var10_2) ^ -252658394;
                            ** GOTO lbl489
                            break;
                        }
                        break;
                    }
lbl271:
                    // 1 sources

                    while (true) {
                        if (ix.get().isFriend(var4_8.method_5477().getString())) ** GOTO lbl275
lbl273:
                        // 3 sources

                        var9_4 = (var7_3 | var10_2) ^ -1146387587;
                        continue block153;
lbl275:
                        // 1 sources

                        var9_4 = (var7_3 | var10_2) ^ -361846846;
                        ** GOTO lbl470
                        break;
                    }
lbl277:
                    // 2 sources

                    while (true) {
                        var8_11 ^= 644379539;
                        var5_9 = v1;
                        ** continue;
                        break;
                    }
lbl281:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -1700009721;
                        ** GOTO lbl293
                        break;
                    }
lbl284:
                    // 2 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -869389574;
                        ** GOTO lbl489
                        break;
                    }
lbl287:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -999391402;
                        continue block153;
                        break;
                    }
lbl290:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -506949774;
                        ** GOTO lbl353
                        break;
                    }
lbl293:
                    // 2 sources

                    block182: while (true) {
                        switch (var9_4) {
                            case -805937214: {
                                ** GOTO lbl336
                            }
                            case -764516936: {
                                if (!(var3_6 instanceof class_1571)) {
                                    var9_4 = (var7_3 | var10_2) ^ -191741609;
                                    continue block182;
                                }
                                ** GOTO lbl343
                            }
                            case 1438303746: {
                                var8_11 ^= var9_4 ^ -692993752;
                                ** break;
                            }
                            case -22368734: {
                                var8_11 ^= var9_4 ^ 2107746568;
                                ** GOTO lbl338
                            }
                            case -1753074172: {
                                v1 = true;
                                ** GOTO lbl277
                            }
                            case 208531424: {
                                ** GOTO lbl345
                            }
                            case 1649690544: {
                                var9_4 = (var7_3 | var10_2) ^ -674926632;
                                continue block182;
                            }
                            case -1935107397: {
                                var8_11 ^= var9_4 ^ -1297032166;
                                var9_4 = (var7_3 | var10_2) ^ -689131189;
                                ** GOTO lbl330
                            }
                            case 792379759: {
                                if (var3_6 instanceof class_1621) ** GOTO lbl343
                                var9_4 = (var7_3 | var10_2) ^ 923398517;
                                ** GOTO lbl330
                            }
                            case -342636830: {
                                if (!(var3_6 instanceof class_1510)) ** GOTO lbl329
                                ** GOTO lbl343
                            }
lbl327:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 983869958;
                            ** GOTO lbl330
lbl329:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ -1387960139;
lbl330:
                            // 5 sources

                            default: {
                                continue block182;
                            }
                            case 773005308: {
                                if (!(var3_6 instanceof class_1588)) {
                                    ** continue;
                                }
                                ** GOTO lbl343
                            }
lbl336:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 714197775;
                            continue block182;
lbl338:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 1870502067;
                            continue block182;
                            case -1034222415: 
                        }
                        v1 = false;
                        ** continue;
lbl343:
                        // 4 sources

                        var9_4 = (var7_3 | var10_2) ^ 106234005;
                        continue;
lbl345:
                        // 1 sources

                        var9_4 = (var7_3 | var10_2) ^ 325871701;
                    }
lbl347:
                    // 2 sources

                    while (true) {
                        var8_11 ^= -2096522270;
                        return v2;
                    }
                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ 337120416;
                        ** GOTO lbl489
                        break;
                    }
lbl353:
                    // 9 sources

                    block185: while (true) {
                        switch (var9_4) {
                            default: {
                                continue block185;
                            }
                            case -181835131: {
                                var8_11 ^= var9_4 ^ 1747506349;
                                ** continue;
                            }
                            case 1141357465: {
                                var8_11 ^= var9_4 ^ 1398935448;
                                ** continue;
                            }
                            case -1387180207: {
                                ** GOTO lbl414
                            }
                            case 712537633: {
                                var8_11 ^= var9_4 ^ 448814563;
                                ** GOTO lbl423
                            }
                            case 799669859: {
                                var8_11 ^= var9_4 ^ -721604908;
                                ** GOTO lbl416
                            }
                            case 390503450: {
                                if (!(var1_1 instanceof class_1309)) ** continue;
                                var9_4 = (var7_3 | var10_2) ^ 673977582;
                                continue block185;
                            }
                            case -791430567: {
                                var8_11 ^= var9_4 ^ -2111264074;
                                var9_4 = (var7_3 | var10_2) ^ -718182373;
                                continue block185;
                            }
                            case 1923046718: {
                                var8_11 ^= var9_4 ^ -349772030;
                                var9_4 = (var7_3 | var10_2) ^ 1570483000;
                                continue block185;
                            }
                            case -1781333942: {
                                var8_11 ^= var9_4 ^ -2047025409;
                                ** continue;
                            }
                            case 826794938: {
                                if (!(var1_1 instanceof class_1421)) ** GOTO lbl408
                                ** GOTO lbl432
                            }
                            case -1907563154: {
                                ** break;
                            }
                            case 126304097: {
                                if (var1_1 == var2_5.field_1724) {
                                    ** continue;
                                }
                                ** GOTO lbl421
                            }
lbl395:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ -910668531;
                            continue block185;
                            case -3771496: {
                                if (((Boolean)this.a.getValue()).booleanValue()) ** GOTO lbl408
                                ** GOTO lbl403
                            }
                            case 423043525: {
                                var8_11 ^= var9_4 ^ -355166045;
                                ** GOTO lbl425
                            }
lbl403:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 1991461849;
                            continue block185;
                            case -1557713535: {
                                if (var2_5.field_1724 != null) ** continue;
                                ** GOTO lbl238
                            }
lbl408:
                            // 2 sources

                            var9_4 = (var7_3 | var10_2) ^ 1831644925;
                            continue block185;
                            case -1520171633: {
                                if (var1_1 != null) ** break;
                                ** continue;
                                ** GOTO lbl430
                            }
lbl414:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 1540916022;
                            continue block185;
lbl416:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ -870743966;
                            continue block185;
                            case -1176695327: {
                                var8_11 ^= var9_4 ^ 2092632193;
                                ** continue;
                            }
lbl421:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 1092789078;
                            continue block185;
lbl423:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 86881227;
                            continue block185;
lbl425:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 215419914;
                            continue block185;
                            case 768525996: {
                                var3_6 = (class_1309)var1_1;
                                ** continue;
                            }
lbl430:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 1437524454;
                            continue block185;
lbl432:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ -762849130;
                            continue block185;
                            case -198663491: {
                                return false;
                            }
                            case 887500501: {
                                return false;
                            }
lbl438:
                            // 1 sources

                            while (true) {
                                var9_4 = (var7_3 | var10_2) ^ 1862617760;
                                ** GOTO lbl489
lbl441:
                                // 1 sources

                                while (true) {
                                    var9_4 = (var7_3 | var10_2) ^ 29393070;
                                    ** GOTO lbl489
                                    break;
                                }
lbl444:
                                // 1 sources

                                while (true) {
                                    var9_4 = (var7_3 | var10_2) ^ -420528388;
                                    ** GOTO lbl489
                                    break;
                                }
                                break;
                            }
                            case 1276029456: {
                                return false;
                            }
                            case -1707423780: {
                                return false;
                            }
                            case -154096709: {
                                return false;
                            }
lbl453:
                            // 1 sources

                            while (true) {
                                var9_4 = (var7_3 | var10_2) ^ 135139902;
                                ** GOTO lbl489
                                break;
                            }
                            case -36561540: 
                        }
                        break;
                    }
                    return false;
lbl458:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -1658231635;
                        ** GOTO lbl489
                        break;
                    }
lbl461:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ 701070283;
                        ** GOTO lbl489
                        break;
                    }
                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ 531194096;
                        ** GOTO lbl489
                        break;
                    }
lbl467:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -2096506112;
                        if (true) ** GOTO lbl489
                        break;
                    }
lbl470:
                    // 2 sources

                    block194: while (true) {
                        switch (var9_4) {
                            default: {
                                continue block194;
                            }
                            case 311495029: {
                                var8_11 ^= var9_4 ^ 2083030619;
                                ** GOTO lbl483
                            }
                            case -1561678879: {
                                ** break;
                            }
                            case 2003080149: {
                                ** continue;
                            }
lbl481:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ -1885651614;
                            continue block194;
lbl483:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 1703302117;
                            continue block194;
                            case -1652949678: 
                        }
                        break;
                    }
                    return false;
                    block195: while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -2131364473;
lbl489:
                        // 28 sources

                        block196: while (true) {
                            switch (var9_4) {
                                case 1496951178: {
                                    var8_11 ^= var9_4 ^ -1819745999;
                                    ** GOTO lbl607
                                }
                                case 454268327: {
                                    var9_4 = (var7_3 | var10_2) ^ 849550311;
                                    continue block196;
                                }
                                case 1708939431: {
                                    var8_11 ^= var9_4 ^ -12668054;
                                    ** continue;
                                }
                                case -4612578: {
                                    if (ld.Ai((class_1657)var3_6)) {
                                        ** continue;
                                    }
                                    ** GOTO lbl603
                                }
                                case -784935556: {
                                    v2 = false;
                                    ** GOTO lbl347
                                }
                                case 752725671: {
                                    var8_11 ^= var9_4 ^ -380493030;
                                    ** continue;
                                }
                                case -16343864: {
                                    if (!var6_10) ** GOTO lbl170
                                    ** continue;
                                }
                                case -202658504: {
                                    var8_11 ^= var9_4 ^ 962258307;
                                    ** continue;
                                }
                                case -1745165289: {
                                    var9_4 = (var7_3 | var10_2) ^ 122040489;
                                    continue block196;
                                }
                                case 695357611: {
                                    if (((Boolean)this.g.getValue()).booleanValue()) ** GOTO lbl241
                                    ** continue;
                                }
                                case -779212088: {
                                    var8_11 ^= var9_4 ^ -802967657;
                                    ** continue;
                                }
                                case 1627361184: {
                                    if (!((Boolean)this.a.getValue()).booleanValue()) ** break;
                                    ** continue;
                                    ** continue;
                                }
                                case -899893936: {
                                    if (var6_10) ** GOTO lbl217
                                    ** GOTO lbl633
                                }
                                case 747184984: {
                                    var9_4 = (var7_3 | var10_2) ^ 1675217667;
                                    continue block196;
                                }
                                case -845352127: {
                                    var8_11 ^= var9_4 ^ 1832951774;
                                    var9_4 = (var7_3 | var10_2) ^ 380837166;
                                    continue block196;
                                }
                                case 504401995: {
                                    var8_11 ^= var9_4 ^ -1901556195;
                                    ** continue;
                                }
                                case -1799474115: {
                                    var8_11 ^= var9_4 ^ 1698309247;
                                    ** GOTO lbl637
                                }
                                case -113299943: {
                                    if (((Boolean)this.f.getValue()).booleanValue()) ** continue;
                                    var9_4 = (var7_3 | var10_2) ^ 489365304;
                                    continue block196;
                                }
                                case 942462656: {
                                    if (((Boolean)this.c.getValue()).booleanValue()) {
                                        ** continue;
                                    }
                                    ** GOTO lbl603
                                }
                                case -1754323366: {
                                    var8_11 ^= var9_4 ^ 1847605540;
                                    continue block195;
                                }
                                case 1357714462: {
                                    v2 = true;
                                    ** continue;
                                }
                                case 146874151: {
                                    var8_11 ^= var9_4 ^ -1491857066;
                                    ** GOTO lbl284
                                }
                                case 754193163: {
                                    var9_4 = (var7_3 | var10_2) ^ -779223524;
                                    continue block196;
                                }
                                case -296963175: {
                                    v3 = true;
                                    ** GOTO lbl611
                                }
                                case -252593015: {
                                    var8_11 ^= var9_4 ^ 267971553;
                                    ** continue;
                                }
                                case 1250608772: {
                                    var8_11 ^= var9_4 ^ 1880413440;
                                    ** continue;
                                }
                                case -1467241349: {
                                    var8_11 ^= var9_4 ^ -129973649;
                                    var9_4 = (var7_3 | var10_2) ^ -29064113;
                                    continue block196;
                                }
                                case 1867458822: {
                                    if (!((Boolean)this.a.getValue()).booleanValue()) ** continue;
                                    ** GOTO lbl217
                                }
                                case -2134887875: {
                                    if (!var5_9) ** break;
                                    ** continue;
                                    ** continue;
                                }
                                case -803676304: {
                                    var8_11 ^= var9_4 ^ 2049252349;
                                    ** continue;
                                }
                                case 1708575258: {
                                    var9_4 = (var7_3 | var10_2) ^ -1744821993;
                                    continue block196;
                                }
                                case -413741497: {
                                    var8_11 ^= var9_4 ^ -836553081;
                                    ** continue;
                                }
                                case 579705695: {
                                    var9_4 = (var7_3 | var10_2) ^ -1750038607;
                                    continue block196;
                                }
                                case -320364009: {
                                    var8_11 ^= var9_4 ^ 1278987912;
                                    ** break;
                                }
                                case 112929528: {
                                    if (!var4_7) ** continue;
                                    ** continue;
                                }
lbl603:
                                // 2 sources

                                var9_4 = (var7_3 | var10_2) ^ 1871743213;
                                ** GOTO lbl638
                                case -439045745: {
                                    ** continue;
                                }
lbl607:
                                // 1 sources

                                var9_4 = (var7_3 | var10_2) ^ -1475167575;
                                ** GOTO lbl638
                                case -53012028: {
                                    v3 = false;
lbl611:
                                    // 2 sources

                                    var8_11 ^= -1523078728;
                                    return v3;
                                }
                                case 2013944624: {
                                    if (ld.Aj(var2_5, (class_1657)var3_6)) ** continue;
                                    ** continue;
                                }
lbl616:
                                // 1 sources

                                var9_4 = (var7_3 | var10_2) ^ 69777267;
                                continue block196;
                                case 2079749559: {
                                    if (var5_9) ** break;
                                    ** continue;
                                    ** continue;
                                }
                                case 886146125: {
                                    switch (var8_11) {
                                        default: {
                                            var9_4 = (var7_3 | var10_2) ^ -264326768;
                                            continue block196;
                                        }
                                        case 677034800: {
                                            var9_4 = (var7_3 | var10_2) ^ -1276423408;
                                            continue block196;
                                        }
                                        case -23977816: 
                                    }
                                    var9_4 = (var7_3 | var10_2) ^ 1816238730;
                                    continue block196;
                                }
lbl633:
                                // 1 sources

                                var9_4 = (var7_3 | var10_2) ^ -630049304;
                                continue block196;
                                case 1259666855: {
                                    var8_11 ^= var9_4 ^ -1773727290;
lbl637:
                                    // 2 sources

                                    var9_4 = (var7_3 | var10_2) ^ -730427921;
                                }
lbl638:
                                // 4 sources

                                default: {
                                    continue block196;
                                }
                                case 1960327554: {
                                    return false;
                                }
                                case -730064926: {
                                    return false;
                                }
                                case 135205777: {
                                    return false;
                                }
                                case -1691982412: 
                            }
                            break;
                        }
                        break;
                    }
                    return false;
                    case -673461158: {
                        return false;
                    }
                    case 1260435072: 
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
    static {
        block30: {
            block24: {
                block27: {
                    block26: {
                        block28: {
                            block25: {
                                block29: {
                                    var2 = -40451952;
                                    ld.a = mK.a(MethodHandles.lookup().lookupClass(), -640288188);
                                    var1_1 = 0;
                                    ** GOTO lbl49
lbl5:
                                    // 1 sources

                                    while (true) {
                                        ** GOTO lbl66
                                        break;
                                    }
lbl7:
                                    // 1 sources

                                    while (true) {
                                        var0_2 ^= 940788207;
                                        break block24;
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var1_1 = var2 ^ -534517814;
                                        ** GOTO lbl22
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        var0_2 ^= 545481605;
                                        if (true) break block25;
                                        break;
                                    }
                                    block13: while (true) {
                                        block31: {
                                            var1_1 = var2 ^ 1927788207;
                                            break block31;
lbl19:
                                            // 1 sources

                                            while (true) {
                                                var0_2 ^= var1_1 ^ 528242997;
                                                ** GOTO lbl33
                                                break;
                                            }
                                        }
lbl23:
                                        // 5 sources

                                        block15: while (true) {
                                            switch (var1_1) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    default: {
                                                        continue block15;
                                                    }
                                                    break;
                                                }
                                                case 1562738914: {
                                                    ** continue;
                                                }
lbl30:
                                                // 1 sources

                                                while (true) {
                                                    var0_2 ^= 872406100;
                                                    ** GOTO lbl59
                                                    break;
                                                }
lbl33:
                                                // 1 sources

                                                var1_1 = var2 ^ -436579459;
                                                ** continue;
lbl35:
                                                // 1 sources

                                                while (true) {
                                                    ld.a[v0] = ((v1[v2] & 255) << 24 | ((v1[v2 + 1] & 255) << 16 | ((v1[v2 + 2] & 255) << 8 | v1[v2 + 3] & 255))) ^ ((v3 | var2) ^ 936736486 ^ ld.a);
                                                    v0 = v0 + 1;
                                                    v4 = v2 + 4;
                                                    v1 = v1;
                                                    v2 = v4;
                                                    break block26;
                                                    break;
                                                }
                                                case 220371135: {
                                                    break block27;
                                                }
lbl46:
                                                // 1 sources

                                                while (true) {
                                                    var0_2 ^= 80844288;
                                                    ** continue;
                                                    break;
                                                }
lbl49:
                                                // 1 sources

                                                var0_2 = -1596415047;
                                                break block28;
lbl51:
                                                // 1 sources

                                                while (true) {
                                                    var0_2 ^= -153083029;
                                                    break block29;
                                                    break;
                                                }
lbl54:
                                                // 2 sources

                                                while (true) {
                                                    var0_2 ^= 1805453244;
                                                    ** continue;
                                                    break;
                                                }
                                                case 853040803: {
                                                    break block13;
                                                }
lbl59:
                                                // 1 sources

                                                ** continue;
lbl60:
                                                // 1 sources

                                                while (true) {
                                                    ** continue;
                                                    break;
                                                }
                                                case 2079585182: {
                                                    var0_2 ^= var1_1 ^ 1641873272;
                                                    break block30;
                                                }
lbl66:
                                                // 1 sources

                                                ld.c = gj.decode("R83Nqvjg/Q==", ld.Ah(((var0_2 ^= -1150168305) | var2) ^ -1011553680, var2 ^ ((var0_2 | var2) ^ -2036811715)));
                                                ld.f = gj.decode("dPdSzQ==", ld.Ah((var0_2 | var2) ^ -1011553679, var2 ^ ((var0_2 | var2) ^ 316139325)));
                                                ld.a = gj.decode("M+CZRULCaHI=", ld.Ah((var0_2 | var2) ^ -1011553678, var2 ^ ((var0_2 | var2) ^ -1711420082)));
                                                ld.e = gj.decode("TzGqe5ilxA==", ld.Ah((var0_2 | var2) ^ -1011553677, var2 ^ ((var0_2 | var2) ^ 117676584)));
                                                ld.d = gj.decode("ePhxu/qM526WsOyR", ld.Ah((var0_2 | var2) ^ -1011553676, var2 ^ ((var0_2 | var2) ^ -2005955728)));
                                                ld.b = gj.decode("HMPRdLUFKQW2G064Po2FxQ==", ld.Ah((var0_2 | var2) ^ -1011553675, var2 ^ ((var0_2 | var2) ^ -731910497)));
                                                ld.h = gj.decode("Lk/rI5zuLC2eTqFtt8t1guOk4Q==", ld.Ah((var0_2 | var2) ^ -1011553674, var2 ^ ((var0_2 | var2) ^ 1026367618)));
                                                ld.g = gj.decode("o3FJQlH4wg3wDMX3FqKH", ld.Ah((var0_2 | var2) ^ -1011553673, var2 ^ ((var0_2 | var2) ^ 646619166)));
                                                return;
                                                case 409768941: {
                                                    ld.a = new int[(var0_2 | var1_1 ^ -436579459) ^ (var1_1 ^ -439196291)];
                                                    ** continue;
                                                }
                                                case 498411354: {
                                                    var0_2 ^= var1_1 ^ 667570700;
                                                    continue block13;
                                                }
lbl81:
                                                // 1 sources

                                                while (true) {
                                                    if (v4 < v1.length) ** GOTO lbl54
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    var1_1 = var2 ^ -2040188146;
                                    ** GOTO lbl23
                                }
                                ** while (true)
                            }
                            v3 = var0_2 ^= -1993454355;
                            ** while (true)
                            {
                                ** case -1888389569:
                            }
lbl92:
                            // 1 sources

                            v0 = 0;
                            v2 = 0;
                            v1 = "\u00d1\u0001k=\u00de+\u00b1\u001e@\u00e7\u00e8\u00df[\u0011\u0003m\u001e\u0019:\u00c1\u00b7\u00f3M\u00d2\u0089K=m\u0081T\u0089\u00f4".getBytes("ISO-8859-1");
                            ** while (true)
                        }
                        var1_1 = var2 ^ -816931277;
                        ** GOTO lbl23
                    }
                    var0_2 ^= -398843082;
                    ** while (true)
                }
                var1_1 = var2 ^ -1598865294;
                ** GOTO lbl23
            }
            var0_2 ^= -740873422;
            ** while (true)
        }
        var1_1 = var2 ^ -256616401;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static boolean Ai(class_1657 var0) {
        block63: {
            block69: {
                block65: {
                    block64: {
                        block68: {
                            block70: {
                                block66: {
                                    block67: {
                                        block71: {
                                            block62: {
                                                break block71;
                                                while (true) {
                                                    var6_3 = (var4_2 | var7_1) ^ 826252376;
                                                    break block62;
                                                    break;
                                                }
                                                while (true) {
                                                    var6_3 = (var4_2 | var7_1) ^ 380217375;
                                                    ** GOTO lbl157
                                                    break;
                                                }
lbl7:
                                                // 1 sources

                                                while (true) {
                                                    var6_3 = (var4_2 | var7_1) ^ -1697104379;
                                                    ** GOTO lbl157
                                                    break;
                                                }
lbl10:
                                                // 1 sources

                                                while (true) {
                                                    var6_3 = (var4_2 | var7_1) ^ 609378536;
                                                    break block63;
                                                    break;
                                                }
lbl13:
                                                // 1 sources

                                                while (true) {
                                                    var6_3 = (var4_2 | var7_1) ^ -497211152;
                                                    ** GOTO lbl46
                                                    break;
                                                }
lbl16:
                                                // 1 sources

                                                while (true) {
                                                    var5_7 ^= var6_3 ^ -1556299602;
                                                    break block64;
                                                    break;
                                                }
                                            }
lbl20:
                                            // 4 sources

                                            block37: while (true) {
                                                switch (var6_3) lbl-1000:
                                                // 3 sources

                                                {
                                                    while (true) {
                                                        default: {
                                                            continue block37;
                                                        }
                                                        break;
                                                    }
lbl25:
                                                    // 1 sources

                                                    while (true) {
                                                        var1_4 = class_1304.field_54086.iterator();
                                                        break block65;
                                                        break;
                                                    }
lbl28:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_7 ^= var6_3 ^ 1978493466;
                                                        ** continue;
                                                        break;
                                                    }
                                                    case 1591831235: {
                                                        var5_7 ^= var6_3 ^ 265523721;
                                                        break block66;
                                                    }
                                                    case -462498681: {
                                                        if (var2_5.method_46643()) ** continue;
                                                        break block37;
                                                    }
lbl37:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_7 ^= var6_3 ^ -542457516;
                                                        ** GOTO lbl56
                                                        break;
                                                    }
lbl40:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_3 = (var4_2 | var7_1) ^ -2076397571;
                                                        ** GOTO lbl46
                                                        break;
                                                    }
lbl43:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_3 = (var4_2 | var7_1) ^ 1990416444;
                                                        break block63;
                                                        break;
                                                    }
lbl46:
                                                    // 3 sources

                                                    block44: while (true) {
                                                        switch (var6_3) {
                                                            default: {
                                                                continue block44;
                                                            }
                                                            case -1920737685: {
                                                                ** continue;
                                                            }
                                                            case -337487514: {
                                                                ** continue;
                                                            }
                                                            case 1837394000: {
                                                                ** continue;
                                                            }
                                                        }
                                                        break;
                                                    }
lbl56:
                                                    // 1 sources

                                                    var6_3 = (var4_2 | var7_1) ^ 395684250;
                                                    break block63;
lbl58:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_3 = (var4_2 | var7_1) ^ -1951391204;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl61:
                                                    // 1 sources

                                                    while (true) {
                                                        if (!var1_4.hasNext()) ** continue;
                                                        ** continue;
                                                        break;
                                                    }
lbl64:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_7 ^= var6_3 ^ -485943838;
                                                        break block67;
                                                        break;
                                                    }
lbl67:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_3 = (var4_2 | var7_1) ^ 39493323;
                                                        ** continue;
                                                        break;
                                                    }
lbl70:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_3 = (var4_2 | var7_1) ^ -838545079;
                                                        ** continue;
                                                        break;
                                                    }
lbl73:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_3 = (var4_2 | var7_1) ^ -2103473077;
                                                        ** GOTO lbl157
                                                        break;
                                                    }
lbl76:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_7 ^= var6_3 ^ 1336044588;
                                                        ** continue;
                                                        break;
                                                    }
lbl79:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_3 = (var4_2 | var7_1) ^ 1252909950;
                                                        break block63;
                                                        break;
                                                    }
                                                    case 2107363544: {
                                                        var5_7 ^= var6_3 ^ -503638421;
                                                        break block68;
                                                    }
lbl85:
                                                    // 2 sources

                                                    while (true) {
                                                        var6_3 = (var4_2 | var7_1) ^ -1186830139;
                                                        break block63;
                                                        break;
                                                    }
lbl88:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var3_6.method_7960()) ** GOTO lbl85
                                                        break block69;
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            var6_3 = (var4_2 | var7_1) ^ 306521667;
                                            ** GOTO lbl20
                                        }
                                        var7_1 = 1725331097;
                                        var4_2 = ld.a & 1725331097 ^ 264946698;
                                        var6_3 = 0;
                                        var5_7 = (var4_2 | var7_1) ^ -731021350;
                                        ** while (true)
lbl99:
                                        // 1 sources

                                        while (true) {
                                            var5_7 ^= var6_3 ^ -841627314;
                                            break block70;
                                            break;
                                        }
                                    }
                                    var6_3 = (var4_2 | var7_1) ^ -46876986;
                                    break block63;
                                }
                                var6_3 = (var4_2 | var7_1) ^ -984365996;
                                ** GOTO lbl20
                            }
                            var6_3 = (var4_2 | var7_1) ^ -971586257;
                            ** GOTO lbl157
lbl111:
                            // 1 sources

                            return true;
lbl113:
                            // 1 sources

                            while (true) {
                                var2_5 = (class_1304)var1_4.next();
                                ** continue;
                                break;
                            }
                        }
                        var6_3 = (var4_2 | var7_1) ^ 1427567310;
                        ** while (true)
lbl119:
                        // 1 sources

                        while (true) {
                            if (var3_6 != null) ** break;
                            ** continue;
                            ** continue;
                            break;
                        }
                        {
                            case -1433586993: {
                                var3_6 = var0.method_6118(var2_5);
                                ** continue;
                            }
                            case -1579538478: {
                                var5_7 ^= var6_3 ^ -120901506;
                                ** continue;
                            }
                        }
                    }
                    var6_3 = (var4_2 | var7_1) ^ 736015987;
                    ** GOTO lbl157
                }
lbl133:
                // 3 sources

                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ -1288223848;
                    ** GOTO lbl157
                    break;
                }
                {
                    ** case 986186837:
                }
lbl137:
                // 1 sources

                ** GOTO lbl133
            }
            var6_3 = (var4_2 | var7_1) ^ 1843079029;
        }
lbl141:
        // 2 sources

        block60: while (true) {
            switch (var6_3) {
                default: {
                    continue block60;
                }
                case -694378914: {
                    ** continue;
                }
                case 1267504755: {
                    break block60;
                }
                case 33935854: {
                    ** continue;
                }
                case 1660556563: {
                    ** continue;
                }
                case 427667111: {
                    ** continue;
                }
                case 2018205441: {
                    ** continue;
                }
lbl157:
                // 6 sources

                block61: while (true) {
                    switch (var6_3) {
                        default: {
                            continue block61;
                        }
                        case -184104802: {
                            ** continue;
                        }
                        case -314475824: {
                            ** continue;
                        }
                        case -588663549: {
                            ** continue;
                        }
                        case 2037866116: {
                            ** continue;
                        }
                        case -1446497356: {
                            ** continue;
                        }
                        ** case 1140867304:
lbl172:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
                case -1830141859: {
                    return false;
                }
                case 628299237: {
                    var5_7 ^= var6_3 ^ -518556522;
                    ** continue;
                }
            }
            break;
        }
        var6_3 = (var4_2 | var7_1) ^ 220521352;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static boolean Aj(class_310 var0, class_1657 var1_1) {
        block34: {
            block35: {
                block37: {
                    block36: {
                        block33: {
                            block38: {
                                break block38;
lbl1:
                                // 1 sources

                                while (true) {
                                    var4_6 ^= var5_4 ^ 1638822977;
                                    break block33;
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl6:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 1992003165;
                                    break block34;
                                    break;
                                }
lbl9:
                                // 1 sources

                                while (true) {
                                    v0 = false;
                                    break block35;
                                    break;
                                }
lbl12:
                                // 1 sources

                                while (true) {
                                    v0 = true;
                                    break block35;
                                    break;
                                }
lbl15:
                                // 2 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 310648963;
                                    break block34;
lbl18:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -1237163574;
                                        break block34;
                                        break;
                                    }
                                    break;
                                }
lbl21:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ -920776395;
                                    break block36;
                                    break;
                                }
lbl24:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 79189159;
                                    break block34;
                                    break;
                                }
lbl27:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 1312725925;
                                    break block34;
                                    break;
                                }
lbl30:
                                // 1 sources

                                return v0;
lbl32:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 705488114;
                                    break block36;
                                    break;
                                }
lbl35:
                                // 1 sources

                                while (true) {
                                    var4_6 ^= var5_4 ^ 262724477;
                                    ** continue;
                                    break;
                                }
lbl38:
                                // 1 sources

                                while (true) {
                                    var4_6 ^= var5_4 ^ -890165507;
                                    break block37;
                                    break;
                                }
                                var2_5 = var0.field_1724.method_5781();
                                var5_4 = (var3_3 | var6_2) ^ 767908387;
                                break block34;
                            }
                            var6_2 = 261179067;
                            var3_3 = ld.a & 261179067 ^ 990055197;
                            var5_4 = 0;
                            var4_6 = (var3_3 | var6_2) ^ 182758000;
                            ** while (true)
lbl50:
                            // 1 sources

                            while (true) {
                                var4_6 ^= var5_4 ^ 429174617;
                                ** continue;
                                break;
                            }
lbl53:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ -542806380;
                                break block34;
                                break;
                            }
                        }
                        var5_4 = (var3_3 | var6_2) ^ -534607055;
                        break block34;
                    }
lbl60:
                    // 2 sources

                    block31: while (true) {
                        switch (var5_4) {
                            default: {
                                continue block31;
                            }
                            case 1256450596: {
                                ** continue;
                            }
                            case -158507382: {
                                ** continue;
                            }
                            ** case 362785613:
lbl69:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
                }
                var5_4 = (var3_3 | var6_2) ^ 1970316699;
                ** while (true)
            }
            var4_6 ^= 1171062308;
            ** while (true)
        }
        block32: while (true) {
            switch (var5_4) {
                default: {
                    continue block32;
                }
                case 307631516: {
                    ** continue;
                }
                case -1982779787: {
                    ** continue;
                }
                case 1227407842: {
                    ** continue;
                }
                case 756510524: {
                    ** continue;
                }
                case 992680728: {
                    ** continue;
                }
                case 1907217434: {
                    ** continue;
                }
                case -533323477: {
                    if (!var2_5.method_1206((class_270)var1_1.method_5781())) ** GOTO lbl15
                    ** continue;
                }
                case -541997938: 
            }
            break;
        }
        if (var2_5 != null) ** break;
        ** while (true)
        ** while (true)
    }
}

