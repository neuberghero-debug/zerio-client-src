/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 *  net.minecraft.class_638
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_638;
import z.r.H;
import z.r.W;
import z.r.ad;
import z.r.as;
import z.r.bq;
import z.r.fZ;
import z.r.gj;
import z.r.hc;
import z.r.jH;
import z.r.mJ;
import z.r.w;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class dH {
    private static final /* synthetic */ String a;
    private static final String b;
    private static w a;
    private static final int[] a;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    public static final int a;
    private static class_638 a;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;

    private static int oc(int n2, int n3) {
        int n4 = -1806254887;
        int n5 = -1632909657;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x61313299)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x9EFF2E7B;
        n6 += (n5 | n4) ^ 0x9EFF7426;
        n6 += (n5 | n4) ^ 0x9EFFB627;
        n6 -= (n5 | n4) ^ 0x9EFFA312;
        n6 += (n5 | n4) ^ 0x9EFF8803;
        n6 += (n5 | n4) ^ 0x9EFF68B0;
        return n6 += (n5 | n4) ^ 0x9EFFDCCF;
    }

    /*
     * Enabled aggressive block sorting
     */
    private dH() {
        int n2 = a & 0xE7CC925F ^ 0xC539A5F2;
        int n3 = (n2 | 0xE7CC925F) ^ 0x64EFA7D7;
        n3 ^= 0x8B9AF807;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static void tick(class_310 var0) {
        block62: {
            break block62;
lbl1:
            // 1 sources

            while (true) {
                var6_3 = (var4_2 | var7_1) ^ 1063378671;
                ** GOTO lbl44
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var6_3 = (var4_2 | var7_1) ^ 2067193632;
                ** GOTO lbl92
                break;
            }
        }
        var7_1 = 902353321;
        var4_2 = dH.a & 902353321 ^ -1561162497;
        var6_3 = 0;
        var5_5 = (var4_2 | var7_1) ^ 1114583740;
        var6_3 = (var4_2 | var7_1) ^ 0x5EE995EE;
        block47: while (true) {
            block63: {
                switch (var6_3) {
                    default: {
                        continue block47;
                    }
                    case 106070060: {
                        var5_5 ^= var6_3 ^ 1802077625;
                        break;
                    }
                    case 2112492684: {
                        var1_4 = H.get();
                        var6_3 = (var4_2 | var7_1) ^ 2095341054;
                        ** GOTO lbl44
                    }
                    case -384612335: {
                        break block63;
                    }
                }
                var6_3 = (var4_2 | var7_1) ^ -904869517;
                continue;
            }
            var6_3 = (var4_2 | var7_1) ^ -1314365997;
        }
lbl31:
        // 2 sources

        while (true) {
            var6_3 = (var4_2 | var7_1) ^ -678706697;
            ** GOTO lbl92
            break;
        }
lbl34:
        // 1 sources

        while (true) {
            var6_3 = (var4_2 | var7_1) ^ 887008992;
            ** GOTO lbl44
            break;
        }
lbl37:
        // 2 sources

        while (true) {
            var5_5 ^= 1606408409;
            var3_7 = v0;
            var6_3 = (var4_2 | var7_1) ^ 1587374013;
            if (true) ** GOTO lbl92
            break;
        }
        block51: while (true) {
            var6_3 = (var4_2 | var7_1) ^ -1621702084;
lbl44:
            // 4 sources

            block52: while (true) {
                switch (var6_3) {
                    case -1613158515: {
                        ** GOTO lbl83
                    }
                    case 682366915: {
                        var5_5 ^= var6_3 ^ -1809493700;
                        var6_3 = (var4_2 | var7_1) ^ 1869818972;
                        continue block52;
                    }
                    case -2094763233: {
                        var2_6 = dH.oe(var0.field_1687);
                        var6_3 = (var4_2 | var7_1) ^ 1851426673;
                        ** GOTO lbl176
                    }
                    case -887193599: {
                        var5_5 ^= var6_3 ^ -1594533242;
                        ** continue;
                    }
                    case -1658918518: {
                        if (var0.field_1687 == null) {
                            continue block51;
                        }
                        ** GOTO lbl77
                    }
                    case -1456515064: {
                        if (!var1_4.isWeather()) continue block51;
                        var6_3 = (var4_2 | var7_1) ^ 706901046;
                        ** GOTO lbl88
                    }
                    case -1646745143: {
                        var6_3 = (var4_2 | var7_1) ^ 719598709;
                        continue block52;
                    }
                    case -2003107056: {
                        if (var1_4.isMasterEnabled()) ** break;
                        continue block51;
                        ** GOTO lbl90
                    }
                    case -1909933956: {
                        var5_5 ^= var6_3 ^ 2144982748;
                        ** continue;
                    }
lbl77:
                    // 1 sources

                    var6_3 = (var4_2 | var7_1) ^ 970089859;
                    continue block52;
                    case 1860446439: {
                        var5_5 ^= var6_3 ^ 2104721946;
                        var6_3 = (var4_2 | var7_1) ^ 256837385;
                        continue block52;
                    }
lbl83:
                    // 1 sources

                    var6_3 = (var4_2 | var7_1) ^ 517309943;
                    continue block52;
                    case -662048349: {
                        dH.a = null;
                        var6_3 = (var4_2 | var7_1) ^ -652282600;
                    }
lbl88:
                    // 3 sources

                    default: {
                        continue block52;
                    }
lbl90:
                    // 1 sources

                    var6_3 = (var4_2 | var7_1) ^ 673446514;
                    continue block52;
lbl92:
                    // 3 sources

                    block53: while (true) {
                        switch (var6_3) {
                            case -1295390703: {
                                dH.od(var2_6);
                                ** GOTO lbl31
                            }
                            case -2135250517: {
                                var5_5 ^= var6_3 ^ -40290168;
                                ** break;
                            }
                            case 461011998: {
                                var5_5 ^= var6_3 ^ 1863059137;
                                var6_3 = (var4_2 | var7_1) ^ 1926016266;
                                continue block53;
                            }
                            case -379078078: {
                                var5_5 ^= var6_3 ^ -1759618544;
                                ** GOTO lbl134
                            }
                            case -986287883: {
                                dH.a = var2_6;
                                var6_3 = (var4_2 | var7_1) ^ 2066905427;
                                continue block53;
                            }
                            case -859265876: {
                                var5_5 ^= var6_3 ^ -1195450765;
                                ** GOTO lbl136
                            }
lbl114:
                            // 1 sources

                            var6_3 = (var4_2 | var7_1) ^ 2103511029;
                            ** GOTO lbl128
                            case -482016300: {
                                var5_5 ^= var6_3 ^ -211803398;
                                ** break;
                            }
                            case -859045153: {
                                var5_5 ^= var6_3 ^ 224761215;
                                ** GOTO lbl150
                            }
lbl122:
                            // 1 sources

                            var6_3 = (var4_2 | var7_1) ^ 124812789;
                            continue block53;
                            case 1774051672: {
                                if (var2_6 != dH.a) ** break;
                                ** continue;
                                var6_3 = (var4_2 | var7_1) ^ -1400856095;
                            }
lbl128:
                            // 3 sources

                            default: {
                                continue block53;
                            }
                            case 1618025480: {
                                var5_5 ^= var6_3 ^ -1924430819;
                                var6_3 = (var4_2 | var7_1) ^ -797783789;
                                continue block53;
                            }
lbl134:
                            // 1 sources

                            var6_3 = (var4_2 | var7_1) ^ 675937198;
                            continue block53;
lbl136:
                            // 1 sources

                            var6_3 = (var4_2 | var7_1) ^ 0x53335EE;
                            continue block53;
                            case -895755766: {
                                dH.a = var2_6;
                                ** continue;
                            }
                            case -1333092342: {
                                if (!var3_7) {
                                    var6_3 = (var4_2 | var7_1) ^ 420299658;
                                    continue block53;
                                }
                                ** GOTO lbl158
                            }
                            case -1359503755: {
                                var5_5 ^= var6_3 ^ 252597449;
                                var6_3 = (var4_2 | var7_1) ^ -565756761;
                                continue block53;
                            }
lbl150:
                            // 1 sources

                            var6_3 = (var4_2 | var7_1) ^ 1410139076;
                            continue block53;
                            case -1615649199: {
                                dH.a = var0.field_1687;
                                var6_3 = (var4_2 | var7_1) ^ 1421860395;
                                continue block53;
                            }
                            case -470294981: {
                                return;
                            }
lbl158:
                            // 1 sources

                            var6_3 = (var4_2 | var7_1) ^ 926970964;
                            continue block53;
                            case 1736971500: 
                        }
                        break;
                    }
                    return;
lbl162:
                    // 1 sources

                    while (true) {
                        var6_3 = (var4_2 | var7_1) ^ -697689657;
                        if (true) ** GOTO lbl176
                        break;
                    }
                    while (true) {
                        var6_3 = (var4_2 | var7_1) ^ 2144628846;
                        if (true) ** GOTO lbl176
                        block56: while (true) {
                            var6_3 = (var4_2 | var7_1) ^ -879112489;
                            if (true) ** GOTO lbl176
                            block57: while (true) {
                                var6_3 = (var4_2 | var7_1) ^ -967342568;
                                if (true) ** GOTO lbl176
                                block58: while (true) {
                                    var6_3 = (var4_2 | var7_1) ^ -1942545371;
lbl176:
                                    // 6 sources

                                    block59: while (true) {
                                        switch (var6_3) {
                                            default: {
                                                continue block59;
                                            }
                                            case 1907186663: {
                                                if (var0.field_1687 == dH.a) continue block58;
                                                ** continue;
                                            }
                                            case -643802482: {
                                                var5_5 ^= var6_3 ^ 731130294;
                                                continue block57;
                                            }
                                            case 2086867752: {
                                                v0 = false;
                                                ** GOTO lbl37
                                            }
                                            case -936465007: {
                                                v0 = true;
                                                ** continue;
                                            }
                                            case 1003340250: {
                                                var5_5 ^= var6_3 ^ -862044178;
                                                continue block56;
                                            }
                                            case 1636877368: 
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        var5_5 ^= var6_3 ^ -1765590516;
                    }
                    case -1196041482: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n2 = 1730490877;
        a = mK.a(MethodHandles.lookup().lookupClass(), 1646003341);
        int n3 = 0;
        int n4 = -1102792064;
        n3 = n2 ^ 0xD8327B9A;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 983107435: {
                    int n5 = 0;
                    int n6 = 0;
                    a = new int[((n4 ^= 0x16812DB9) | n2) ^ 0xF7EDB9F6];
                    n4 ^= 0x77CEB4A8;
                    byte[] byArray = "\u00dc\u00f1\u001b\u0019\u0019\u00e1Q\u0097/\u00f1\u0003Z\u00b4\u00f9\u00abJ2I\u009d(\u00d2\f\u0000\u00da[\u00eaE\u0081\u00de\u00b4\u00ceZ\u0092\u00ec\u0093\u00f5\u00ba\u00b7\u00d6C\u00a6,\u0005,".getBytes("ISO-8859-1");
                    do {
                        n4 ^= 0x33C88122;
                        n4 ^= 0x75500BE0;
                        n4 ^= 0x173F5F;
                        n4 ^= 0x1C90B958;
                        n4 ^= 0x989C9E78;
                        n4 ^= 0xE07F7CE3;
                        int n7 = n4 ^= 0xE9012F0E;
                        n4 ^= 0x12CA8CDE;
                        dH.a[n5] = ((byArray[n6] & 0xFF) << 24 | ((byArray[n6 + 1] & 0xFF) << 16 | ((byArray[n6 + 2] & 0xFF) << 8 | byArray[n6 + 3] & 0xFF))) ^ ((n7 | n2) ^ 0x3C31C0E3 ^ a);
                        n5 = n5 + 1;
                        byArray = byArray;
                        n6 = n6 + 4;
                        n4 ^= 0xD9374D8E;
                    } while (n6 + 4 < byArray.length);
                    d = gj.decode("/+mV2LlR3NaZPsI=", dH.oc(((n4 ^= 0x25AE4CDC) | n2) ^ 0x1863BD98, n2 ^ ((n4 | n2) ^ 0x641ADAF)));
                    a = gj.decode("Uy6m2w==", dH.oc((n4 | n2) ^ 0x1863BD9F, n2 ^ ((n4 | n2) ^ 0xA7F2B208)));
                    f = gj.decode("PbFvqXPICKiko2i7", dH.oc((n4 | n2) ^ 0x1863BD9E, n2 ^ ((n4 | n2) ^ 0xCE0A0451)));
                    g = gj.decode("SZYhjeF05XcjVWrb", dH.oc((n4 | n2) ^ 0x1863BD9D, n2 ^ ((n4 | n2) ^ 0x56E00712)));
                    h = gj.decode("mcVVfzMFb+U5TpDhKrWZAg==", dH.oc((n4 | n2) ^ 0x1863BD9C, n2 ^ ((n4 | n2) ^ 0xB80A3DAD)));
                    e = gj.decode("fw/xuaOwQWigvUc=", dH.oc((n4 | n2) ^ 0x1863BD93, n2 ^ ((n4 | n2) ^ 0x23560E67)));
                    c = gj.decode("+M134AlaIy1UKvhw", dH.oc((n4 | n2) ^ 0x1863BD92, n2 ^ ((n4 | n2) ^ 0x807C2038)));
                    i = gj.decode("J1rF2LG8gw==", dH.oc((n4 | n2) ^ 0x1863BD91, n2 ^ ((n4 | n2) ^ 0x84B433EE)));
                    b = d;
                    return;
                }
                case -1088992665: {
                    n3 = n2 ^ 0x38930C0B;
                    continue block5;
                }
                case 1605778934: 
            }
            n4 ^= n3 ^ 0x61BF135E;
            n3 = n2 ^ 0x5DBC3696;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void od(w var0) {
        var4_1 = -2022694589;
        var1_2 = dH.a & -2022694589 ^ -1692959778;
        var3_3 = 0;
        ** GOTO lbl44
lbl5:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 301823848;
            ** GOTO lbl25
            break;
        }
lbl8:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -2027520660;
            ** GOTO lbl25
            break;
        }
lbl11:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 258770501;
            ** GOTO lbl25
lbl14:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -2000932736;
                ** GOTO lbl25
                break;
            }
            break;
        }
lbl17:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 723575434;
            ** GOTO lbl25
lbl20:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -59670725;
                ** GOTO lbl25
                break;
            }
            break;
        }
lbl23:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 1800693791;
lbl25:
            // 7 sources

            block25: while (true) {
                switch (var3_3) lbl-1000:
                // 5 sources

                {
                    while (true) {
                        default: {
                            continue block25;
                        }
                        break;
                    }
                    case -1877213798: {
                        jH.show(fZ.i, bq.aS, dH.d, dH.g, dH.h);
lbl32:
                        // 4 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -614861765;
                            ** GOTO lbl-1000
                            break;
                        }
                    }
lbl35:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -690961180;
                        ** GOTO lbl-1000
                        break;
                    }
lbl38:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 118986402;
                        ** GOTO lbl-1000
                        break;
                    }
lbl41:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1597232111;
                        ** continue;
                        break;
                    }
lbl44:
                    // 1 sources

                    var2_4 = (var1_2 | var4_1) ^ 1994930473;
                    ** continue;
                    case -1269327531: {
                        var2_4 ^= var3_3 ^ 2020828708;
                        ** continue;
                    }
                    case 399199071: {
                        jH.show(fZ.c, bq.aS, dH.d, dH.e, dH.c);
                        ** GOTO lbl32
                    }
                    case 1143902180: {
                        var2_4 ^= var3_3 ^ 2051180454;
                        ** continue;
                    }
                    case 1235730235: {
                        ** continue;
                    }
                    case 407963315: {
                        switch (var0.ordinal()) {
                            default: {
                                ** GOTO lbl32
                            }
                            case 0: {
                                ** continue;
                            }
                            case 2: {
                                ** continue;
                            }
                            ** case 1:
lbl66:
                            // 1 sources

                            ** continue;
                        }
                    }
                    case 1661338852: {
                        return;
                    }
                    case -1738478211: {
                        ** continue;
                    }
                    case -199027776: {
                        jH.show(fZ.i, bq.aS, dH.d, dH.a, dH.f);
                        ** continue;
                    }
                    case -1903555401: {
                        ** continue;
                    }
                    case 1069242318: 
                }
                break;
            }
            break;
        }
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static w oe(class_638 var0) {
        block28: {
            block23: {
                block27: {
                    block21: {
                        block20: {
                            block24: {
                                block25: {
                                    block22: {
                                        block26: {
                                            var4_1 = 2016229158;
                                            var1_2 = dH.a & 2016229158 ^ 176560556;
                                            var3_3 = 0;
                                            break block26;
lbl5:
                                            // 1 sources

                                            while (var0.method_8419()) {
                                                break block20;
lbl7:
                                                // 1 sources

                                                while (true) {
                                                    var2_4 ^= var3_3 ^ -98170028;
                                                    break block21;
                                                    break;
                                                }
lbl10:
                                                // 1 sources

                                                while (true) {
                                                    var3_3 = (var1_2 | var4_1) ^ -2074482799;
                                                    break block22;
                                                    break;
                                                }
                                            }
                                            break block27;
                                        }
                                        var2_4 = (var1_2 | var4_1) ^ -309881853;
                                        ** GOTO lbl41
                                    }
lbl18:
                                    // 10 sources

                                    block16: while (true) {
                                        switch (var3_3) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block16;
                                                }
                                                break;
                                            }
                                            case -1897225721: {
                                                ** GOTO lbl5
                                            }
                                            case -413584162: {
                                                ** continue;
                                            }
                                            case -1112304713: {
                                                var2_4 ^= var3_3 ^ 1525895641;
                                                break block23;
                                            }
                                            case -17377217: {
                                                var2_4 ^= var3_3 ^ -29764624;
                                                break block16;
                                            }
                                            case -1119459878: {
                                                return w.i;
                                            }
                                            case 1644198848: {
                                                if (var0.method_8546()) {
                                                    ** continue;
                                                }
                                                break block24;
                                            }
                                            case 1268390463: {
                                                break block25;
                                            }
lbl41:
                                            // 1 sources

                                            var3_3 = (var1_2 | var4_1) ^ 825566609;
                                            ** continue;
                                        }
                                        break;
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ -1395363931;
                                    ** GOTO lbl18
                                }
                                var3_3 = (var1_2 | var4_1) ^ 1479056202;
                                ** GOTO lbl18
                            }
                            var3_3 = (var1_2 | var4_1) ^ -954422247;
                            ** GOTO lbl18
                            {
                                case 579314916: {
                                    var2_4 ^= var3_3 ^ -1322574825;
                                    break block28;
                                }
                                case -559758453: {
                                    return w.f;
                                }
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ -1644819600;
                        ** GOTO lbl18
                        {
                            case -696561653: {
                                return w.e;
                            }
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ -1542587355;
                    ** GOTO lbl18
                }
                var3_3 = (var1_2 | var4_1) ^ 602813139;
                ** GOTO lbl18
            }
            var3_3 = (var1_2 | var4_1) ^ -196764247;
            ** GOTO lbl18
lbl70:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -941008268;
                ** GOTO lbl18
                break;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ 414139502;
        ** while (true)
        {
            ** case 1497435517:
        }
lbl77:
        // 1 sources

        var2_4 ^= var3_3 ^ 2011553989;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static void render(W var0, class_310 var1_1, H var2_2, long var3_3) {
        block63: {
            var21_4 = 1898050208;
            var18_5 = dH.a & 1898050208 ^ -1804124080;
            var20_6 = 0;
            var19_20 = (var18_5 | var21_4) ^ 566568710;
            var20_6 = (var18_5 | var21_4) ^ -772339445;
            if (true) ** GOTO lbl-1000
            {
                switch (var20_6) {
                    case -537107600: {
                        var19_20 ^= var20_6 ^ 1148273877;
                        var20_6 = (var18_5 | var21_4) ^ 2054932093;
                        continue block48;
                    }
                    case -1752383819: {
                        var0.text(dH.i, var17_19, var10_12 / 2.0f, var13_15, as.primary());
                        ** GOTO lbl44
                    }
                    case 591617564: {
                        var19_20 ^= var20_6 ^ 1644205411;
                        ** break;
                    }
                    case -758752846: {
                        var19_20 ^= var20_6 ^ 1056201572;
                        ** break;
                    }
                    case -1895025523: {
                        hc.register(ad.k, var6_8, var7_9, var16_18 * var5_7, var10_12 * var5_7);
                        var20_6 = (var18_5 | var21_4) ^ -863382303;
                        ** GOTO lbl63
                    }
lbl25:
                    // 1 sources

                    var20_6 = (var18_5 | var21_4) ^ 752666253;
                    continue block48;
                    case 972957201: {
                        var19_20 ^= var20_6 ^ -1726639920;
                        var20_6 = (var18_5 | var21_4) ^ -391247308;
                        ** GOTO lbl63
                    }
                    case 694745196: {
                        var0.restore();
                        var20_6 = (var18_5 | var21_4) ^ 713789824;
                        ** GOTO lbl63
                    }
                    case -643091331: {
                        as.divider(var0, var17_19, var0.s(7.0f), var17_19, var10_12 - var0.s(7.0f));
                        var20_6 = (var18_5 | var21_4) ^ 665955138;
                        ** GOTO lbl63
                    }
                    case 787420189: {
                        var19_20 ^= var20_6 ^ -1430089834;
                        ** GOTO lbl58
                    }
lbl42:
                    // 1 sources

                    var20_6 = (var18_5 | var21_4) ^ -666770338;
                    continue block48;
lbl44:
                    // 1 sources

                    var20_6 = (var18_5 | var21_4) ^ -1436856165;
                    continue block48;
                    case 758519470: {
                        var0.text(var8_10.c, var17_19 + var15_17, var10_12 / 2.0f, var13_15, var9_11);
                        var20_6 = (var18_5 | var21_4) ^ -35375277;
                        ** GOTO lbl63
                    }
                    case 1596760683: {
                        var19_20 ^= var20_6 ^ 1097767867;
                        var20_6 = (var18_5 | var21_4) ^ -1379905637;
                        ** GOTO lbl63
                    }
                    case 1488436587: {
                        var17_19 += var0.textWidth(dH.i, var13_15) + var15_17;
                        var20_6 = (var18_5 | var21_4) ^ -701190932;
                        continue block48;
                    }
lbl58:
                    // 1 sources

                    var20_6 = (var18_5 | var21_4) ^ 1660636229;
                    continue block48;
                    case 143902115: {
                        var19_20 ^= var20_6 ^ -633336858;
                        var20_6 = (var18_5 | var21_4) ^ -601945444;
                    }
lbl63:
                    // 9 sources

                    default: {
                        continue block48;
                    }
                    case 500824260: 
                }
            }
            return;
lbl67:
            // 3 sources

            while (true) {
                var19_20 ^= -43906819;
                var9_11 = v0;
                var19_20 ^= 1323898578;
                var10_12 = var0.s(28.0f);
                var19_20 ^= 1390411572;
                var11_13 = var0.s(10.0f);
                var19_20 ^= -392062899;
                var12_14 = var0.s(13.0f);
                var19_20 ^= -290049889;
                var13_15 = var0.s(11.5f);
                var19_20 ^= -27526117;
                var14_16 = var0.s(7.0f);
                var19_20 ^= 192371894;
                var15_17 = var0.s(9.0f);
                var19_20 ^= -38788414;
                var19_20 ^= 1165345418;
                var16_18 = var11_13 + var12_14 + var14_16 + var0.textWidth(dH.i, var13_15) + var15_17 * 2.0f + var0.textWidth(var8_10.c, var13_15) + var11_13;
                var20_6 = (var18_5 | var21_4) ^ 1359569953;
                ** GOTO lbl133
lbl87:
                // 1 sources

                while (true) {
                    var20_6 = (var18_5 | var21_4) ^ 1184403742;
                    break block63;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    var20_6 = (var18_5 | var21_4) ^ 437406247;
                    break block63;
lbl93:
                    // 1 sources

                    while (true) {
                        var20_6 = (var18_5 | var21_4) ^ -1266290754;
                        break block63;
                        break;
                    }
                    break;
                }
                break;
            }
lbl96:
            // 1 sources

            while (true) {
                var20_6 = (var18_5 | var21_4) ^ -1644364599;
                ** GOTO lbl168
                break;
            }
lbl99:
            // 1 sources

            while (true) {
                var7_9 = var2_2.layoutY(ad.k, (int)var0.e);
                var19_20 ^= 29371641;
                var8_10 = dH.oe(var1_1.field_1687);
                var20_6 = (var18_5 | var21_4) ^ 63836143;
                ** GOTO lbl194
                break;
            }
        }
        block56: while (true) {
            block64: {
                switch (var20_6) {
                    case -393411153: {
                        mJ.begin(var0, var6_8, var7_9, var5_7);
                        ** continue;
                    }
                    case -278546217: {
                        var17_19 = var11_13 + var12_14 + var14_16;
                        var20_6 = (var18_5 | var21_4) ^ -610736403;
                        ** GOTO lbl63
                    }
                    case 1106386254: {
                        as.compactCard(var0, var2_2, 0.0f, 0.0f, var16_18, var10_12);
                        ** break;
                    }
                    case -1159791955: {
                        var0.icon(bq.aS, var11_13 + var12_14 / 2.0f, var10_12 / 2.0f, var12_14, dH.oc((var19_20 | var20_6 ^ -872478707) ^ (var20_6 ^ 951307385), (var18_5 | var20_6 ^ -872478707) ^ ((var19_20 | var20_6 ^ -872478707) ^ (var20_6 ^ -1666094845))));
                        var20_6 = (var18_5 | var21_4) ^ 1556628124;
                        ** GOTO lbl133
                    }
lbl122:
                    // 1 sources

                    var20_6 = (var18_5 | var21_4) ^ 464314245;
                    ** GOTO lbl133
                    case -287625867: {
                        var19_20 ^= var20_6 ^ -1330139386;
                        break block64;
                    }
                    case -1276156946: {
                        var19_20 ^= var20_6 ^ -1865965284;
                        ** continue;
                    }
                    case -1535207727: {
                        var19_20 ^= var20_6 ^ 1514542029;
                        var20_6 = (var18_5 | var21_4) ^ 502986591;
                    }
lbl133:
                    // 5 sources

                    default: {
                        continue block56;
                    }
                    case -1447055252: 
                }
                var19_20 ^= var20_6 ^ 1462801980;
                ** continue;
            }
            var20_6 = (var18_5 | var21_4) ^ 1336477789;
        }
lbl141:
        // 1 sources

        while (true) {
            var20_6 = (var18_5 | var21_4) ^ 462449305;
            if (true) ** GOTO lbl168
            break;
        }
lbl144:
        // 1 sources

        while (true) {
            var19_20 ^= -279113945;
            ** continue;
            break;
        }
lbl147:
        // 1 sources

        while (true) {
            var19_20 ^= -5202253;
            var6_8 = var2_2.layoutX(ad.k, (int)var0.f);
            ** continue;
            break;
        }
        block60: while (true) {
            switch (var20_6) lbl-1000:
            // 2 sources

            {
                default: {
                    continue block60;
                }
                case 612432891: {
                    ** break;
                }
                case -1213691798: {
                    var5_7 = var2_2.layoutScale(ad.k);
                    ** continue;
                }
lbl160:
                // 1 sources

                var20_6 = (var18_5 | var21_4) ^ -553207344;
                continue block60;
                case 712067872: 
            }
            var19_20 ^= var20_6 ^ -643530527;
            var20_6 = (var18_5 | var21_4) ^ 1121942170;
        }
        block61: while (true) {
            var20_6 = (var18_5 | var21_4) ^ -2127828956;
lbl168:
            // 3 sources

            block62: while (true) {
                switch (var20_6) {
                    case -487045633: {
                        v0 = dH.oc((var19_20 | var20_6 ^ -1814448289) ^ (var20_6 ^ 1749253945), (var18_5 | var20_6 ^ -1814448289) ^ ((var19_20 | var20_6 ^ -1814448289) ^ (var20_6 ^ -94267127)));
                        ** GOTO lbl67
                    }
                    case -729864739: {
                        var19_20 ^= var20_6 ^ 1216313686;
                        ** continue;
                    }
                    case 1007800401: {
                        var19_20 ^= var20_6 ^ 768443403;
                        ** continue;
                    }
                    case -1470137926: {
                        var19_20 ^= var20_6 ^ -1182585376;
                        ** break;
                    }
                    case -1929070702: {
                        v0 = as.secondary();
                        ** GOTO lbl67
                    }
                    case 1753943609: {
                        v0 = dH.oc((var19_20 | var20_6 ^ 430636185) ^ (var20_6 ^ -500157186), (var18_5 | var20_6 ^ 430636185) ^ ((var19_20 | var20_6 ^ 430636185) ^ (var20_6 ^ -1254979129)));
                        ** continue;
                    }
                    case -155583201: {
                        var19_20 ^= var20_6 ^ -732254690;
                        continue block61;
                    }
                    case -2056448685: {
                        var19_20 ^= var20_6 ^ -1800322807;
                        var20_6 = (var18_5 | var21_4) ^ 395294479;
                    }
lbl194:
                    // 3 sources

                    default: {
                        continue block62;
                    }
                    case 1952193236: {
                        switch (var8_10.ordinal()) {
                            case 0: {
                                var20_6 = (var18_5 | var21_4) ^ 1562938186;
                                continue block62;
                            }
                            default: {
                                var20_6 = (var18_5 | var21_4) ^ 554227501;
                                continue block62;
                            }
                            case 1: {
                                var20_6 = (var18_5 | var21_4) ^ -916053343;
                                continue block62;
                            }
                            case 2: 
                        }
                        var20_6 = (var18_5 | var21_4) ^ 1880811427;
                        continue block62;
                    }
lbl210:
                    // 1 sources

                    var20_6 = (var18_5 | var21_4) ^ 2020820322;
                    continue block62;
                    case -286812055: 
                }
                break;
            }
            break;
        }
        throw new MatchException(null, null);
    }
}

