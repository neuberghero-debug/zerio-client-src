/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.BiConsumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.L;
import z.r.bP;
import z.r.dA;
import z.r.gF;
import z.r.gj;
import z.r.if;
import z.r.lO;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class bD
extends gF {
    private static final /* synthetic */ String a;
    private final Map<lO, bP> a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private final L a;
    public static final int a;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String t;
    private static final int[] a;
    private static final /* synthetic */ String u;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public bD() {
        var4_1 = 1216905934;
        var1_2 = bD.a & 1216905934 ^ -1754745926;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 437838261;
        var2_4 ^= -989976250;
        super(bD.k, bD.s, dA.u);
        var3_3 = (var1_2 | var4_1) ^ 1160168768;
        if (true) ** GOTO lbl157
        block39: while (true) {
            switch (var3_3) {
                case 413718028: {
                    var2_4 ^= var3_3 ^ -1706320407;
                    ** GOTO lbl98
                }
                case 1711500229: {
                    var2_4 ^= var3_3 ^ 1165502757;
                    ** GOTO lbl141
                }
                case 1380554028: {
                    var2_4 ^= var3_3 ^ -886383979;
                    ** GOTO lbl102
                }
                case -527423275: {
                    this.sR(lO.b, bD.l, bD.a, bD.i);
                    var3_3 = (var1_2 | var4_1) ^ 1436694579;
                    continue block39;
                }
                case 240245710: {
                    ** break;
                }
                case 991842534: {
                    this.sR(lO.h, bD.j, bD.n, bD.m);
                    ** GOTO lbl39
                }
                case -1974826035: {
                    var2_4 ^= var3_3 ^ 27038004;
                    ** GOTO lbl41
                }
lbl32:
                // 1 sources

                switch (var2_4) {
                    case -379786156: {
                        var3_3 = (var1_2 | var4_1) ^ 1430834388;
                        break;
                    }
                    case -1139759955: {
                        var2_4 ^= var3_3 ^ 1738529087;
                        ** GOTO lbl110
                    }
lbl39:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -952080910;
                    break;
lbl41:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1603423631;
                    break;
                    case -196157610: {
                        this.sR(lO.g, bD.h, bD.d, bD.i);
                        ** GOTO lbl87
                    }
                    case -1866626931: {
                        var2_4 ^= var3_3 ^ -1964232611;
                        ** GOTO lbl100
                    }
                    case -429469738: {
                        var2_4 ^= var3_3 ^ 100360367;
                        ** GOTO lbl93
                    }
                    case 1485469065: {
                        var3_3 = (var1_2 | var4_1) ^ 1294326087;
                        break;
                    }
                    case -684222261: {
                        var2_4 ^= var3_3 ^ 1374515550;
                        var3_3 = (var1_2 | var4_1) ^ -1457711345;
                        break;
                    }
                    case -1969193174: {
                        var2_4 ^= var3_3 ^ 2038803644;
                        ** GOTO lbl-1000
                    }
                    case -27983712: {
                        this.a.description(bD.g);
                        var3_3 = (var1_2 | var4_1) ^ -1918818606;
                        break;
                    }
                    case -1697745218: {
                        var2_4 ^= var3_3 ^ -501124036;
                        ** GOTO lbl120
                    }
                    case -1629804711: {
                        this.sR(lO.e, bD.r, bD.e, bD.m);
                        var3_3 = (var1_2 | var4_1) ^ -1175726021;
                        break;
                    }
                    case -493644630: {
                        this.sR(lO.j, bD.f, bD.c, bD.i);
                        var3_3 = (var1_2 | var4_1) ^ 1330985843;
                        break;
                    }
                    case 1995810033: {
                        this.a = this.addSetting(new L());
                        var3_3 = (var1_2 | var4_1) ^ 1677203283;
                        break;
                    }
                    case 573839898: {
                        this.a.section(bD.k);
                        var3_3 = (var1_2 | var4_1) ^ -25376428;
                        break;
                    }
lbl87:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1103560497;
                    break;
                    case 1527456561: {
                        this.syncFromState();
                        var3_3 = (var1_2 | var4_1) ^ 156705126;
                        break;
                    }
lbl93:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -453582056;
                    break;
                    case 1921549234: {
                        this.sR(lO.u, bD.o, bD.b, bD.o);
                        ** GOTO lbl129
                    }
lbl98:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1093899431;
                    break;
lbl100:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1064868651;
                    break;
lbl102:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -35870236;
                    break;
                    case -692088168: lbl-1000:
                    // 2 sources

                    {
                        var3_3 = (var1_2 | var4_1) ^ -776378320;
                        break;
                    }
                    case -944423501: {
                        var3_3 = (var1_2 | var4_1) ^ 1672334583;
                        break;
                    }
lbl110:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 566080350;
                    break;
                    default: {
                        var3_3 = (var1_2 | var4_1) ^ 189593318;
                        break;
                    }
                }
                ** GOTO lbl157
                case -1913296922: {
                    var2_4 ^= var3_3 ^ 1079796945;
                    var3_3 = (var1_2 | var4_1) ^ 1031481172;
                    ** GOTO lbl157
                }
lbl120:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 1887199652;
                ** GOTO lbl157
                case -1349201318: {
                    this.a = new EnumMap<lO, V>(lO.class);
                    ** GOTO lbl143
                }
                case -2139423119: {
                    this.sR(lO.z, bD.p, bD.q, bD.m);
                    var3_3 = (var1_2 | var4_1) ^ 965639208;
                    ** GOTO lbl157
                }
lbl129:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -101069156;
                ** GOTO lbl157
                case -727431912: {
                    var2_4 ^= var3_3 ^ -721086276;
                    ** GOTO lbl159
                }
                case 563378858: {
                    var2_4 ^= var3_3 ^ 598515408;
                    var3_3 = (var1_2 | var4_1) ^ 732327080;
                    ** GOTO lbl157
                }
                case -1136296183: {
                    var2_4 ^= var3_3 ^ 574010810;
                    ** GOTO lbl159
                }
lbl141:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -1386205108;
                ** GOTO lbl157
lbl143:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 148843317;
                ** GOTO lbl157
                case -897500962: {
                    this.sR(lO.s, bD.t, bD.u, bD.i);
                    var3_3 = (var1_2 | var4_1) ^ 1377686552;
                    ** GOTO lbl157
                }
                case 638680418: {
                    var2_4 ^= var3_3 ^ -2052335858;
                    var3_3 = (var1_2 | var4_1) ^ -2065461041;
                    ** GOTO lbl157
                }
                case -1641132849: {
                    var2_4 ^= var3_3 ^ -1567379701;
                    ** break;
lbl156:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 359238432;
                }
lbl157:
                // 13 sources

                default: {
                    continue block39;
                }
lbl159:
                // 2 sources

                var3_3 = (var1_2 | var4_1) ^ -2023569801;
                continue block39;
                case -1832031559: 
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void sR(lO var1_1, String var2_2, String var3_3, String var4_4) {
        var9_5 = 1593565255;
        var6_6 = bD.a & 1593565255 ^ 1211270058;
        var8_7 = 0;
        var7_9 = (var6_6 | var9_5) ^ 1041237490;
        var8_7 = (var6_6 | var9_5) ^ -1406669132;
        if (true) ** GOTO lbl19
        block15: while (true) {
            switch (var8_7) {
                case -290787384: {
                    var5_8 = this.addSetting(new bP(var1_1, var2_2));
                    var8_7 = (var6_6 | var9_5) ^ 269692741;
                    ** GOTO lbl28
                }
                case -220459685: {
                    break;
                }
                case -2050344894: {
                    var7_9 ^= var8_7 ^ 1700291045;
                    ** break;
lbl18:
                    // 1 sources

                    var8_7 = (var6_6 | var9_5) ^ -1336865753;
                }
lbl19:
                // 3 sources

                default: {
                    continue block15;
                }
            }
            var8_7 = (var6_6 | var9_5) ^ -617489491;
        }
lbl23:
        // 1 sources

        while (true) {
            var8_7 = (var6_6 | var9_5) ^ -364673497;
            if (true) ** GOTO lbl28
            break;
        }
        block17: while (true) {
            var8_7 = (var6_6 | var9_5) ^ 2008359670;
lbl28:
            // 3 sources

            block18: while (true) {
                switch (var8_7) {
                    case 1323879594: {
                        var7_9 ^= var8_7 ^ 968500316;
                        ** break;
                    }
                    case 284474433: {
                        var7_9 ^= var8_7 ^ 1262587389;
                        ** continue;
                    }
                    case -1262983736: {
                        var5_8.section(var4_4);
                        ** GOTO lbl52
                    }
                    case -1940521048: {
                        this.a.put(var1_1, var5_8);
                        continue block17;
                    }
                    case -324531539: {
                        var5_8.description(var3_3);
                        ** GOTO lbl50
                    }
lbl48:
                    // 1 sources

                    var8_7 = (var6_6 | var9_5) ^ -1303123646;
                    ** GOTO lbl57
lbl50:
                    // 1 sources

                    var8_7 = (var6_6 | var9_5) ^ 1309630382;
                    ** GOTO lbl57
lbl52:
                    // 1 sources

                    var8_7 = (var6_6 | var9_5) ^ -1864348063;
                    ** GOTO lbl57
                    case 693027097: {
                        var7_9 ^= var8_7 ^ 894131490;
                        var8_7 = (var6_6 | var9_5) ^ 742232907;
                    }
lbl57:
                    // 5 sources

                    default: {
                        continue block18;
                    }
                    case -837046898: {
                        var7_9 ^= var8_7 ^ 483573758;
                        var8_7 = (var6_6 | var9_5) ^ -760341433;
                        continue block18;
                    }
                    case 1925607588: 
                }
                break;
            }
            break;
        }
    }

    private static int sS(int n2, int n3) {
        int n4 = 375575405;
        int n5 = 1888731676;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xAB53168C)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x76F31949;
        n6 -= (n5 | n4) ^ 0x76F3D000;
        n6 ^= (n5 | n4) ^ 0x76F39CB4;
        n6 -= (n5 | n4) ^ 0x76F329DF;
        n6 += (n5 | n4) ^ 0x76F3E315;
        return n6 += (n5 | n4) ^ 0x76F30607;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block26: {
            block25: {
                break block26;
                {
                    var7_2 = var8_1 ^ 8423818;
                    block20: while (true) {
                        switch (var7_2) {
                            case -90065201: {
                                var6_3 ^= var7_2 ^ 1107733523;
                                continue block19;
                            }
                            case 414030207: {
                                bD.a[var4_8] = var5_9 ^= var2_6;
                                ** break;
                            }
                            case 1120683139: {
                                var6_3 ^= var7_2 ^ -1145652383;
                                ** GOTO lbl20
                            }
                            case 1883497335: {
                                var6_3 ^= var7_2 ^ 15550976;
                                var7_2 = var8_1 ^ 2072812287;
                            }
                            default: {
                                continue block20;
                            }
lbl18:
                            // 1 sources

                            var7_2 = var8_1 ^ -1719618225;
                            continue block20;
lbl20:
                            // 1 sources

                            var7_2 = var8_1 ^ var9;
                            continue block20;
                            case 1671531018: {
                                var3_7 += 4;
                                if (++var4_8 < var1_5) ** GOTO lbl30
                                var7_2 = var8_1 ^ 569198339;
                                continue block20;
                            }
lbl27:
                            // 1 sources

                            while (true) {
                                var7_2 = var8_1 ^ 1179890194;
                                break block25;
                                break;
                            }
lbl30:
                            // 2 sources

                            while (true) {
                                var5_9 = (var0_4[var3_7] & (((var6_3 ^= -938888277) | var8_1) ^ 1877588801)) << ((var6_3 | var8_1) ^ 1877588902) | (var0_4[var3_7 + 1] & ((var6_3 | var8_1) ^ 1877588801)) << ((var6_3 | var8_1) ^ 1877588910) | (var0_4[var3_7 + 2] & ((var6_3 | var8_1) ^ 1877588801)) << ((var6_3 | var8_1) ^ 1877588918) | var0_4[var3_7 + 3] & ((var6_3 | var8_1) ^ 1877588801);
                                var7_2 = var8_1 ^ 325247223;
                                continue block20;
                                break;
                            }
                            case -1167144549: 
                        }
                        break;
                    }
                }
                bD.k = gj.decode("vTfuoMQ+r4k1Gg==", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385309), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ -7155166))));
                bD.s = gj.decode("RjGcDhdcWopni6g9B5+QgiD51oBpNJXTB7MDJFiE2lYWiPL5Do2ogJmV", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385308), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ -2131280245))));
                bD.g = gj.decode("h9gbMiKVRb17JU90R8yis18BoM4eBG4HwUMWyort6R3NGh9QtKkVJe0=", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385311), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ -1460855047))));
                bD.h = gj.decode("0298Fhglr4lLhNM=", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385310), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 1107722849))));
                bD.d = gj.decode("3qjXe3LtIrkLgzO/dNN9NLEg0M0yFIoUnT7x/KE=", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385305), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 1642933092))));
                bD.i = gj.decode("6N/0GWA=", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385304), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ -931049771))));
                bD.t = gj.decode("ebeP8xTv8QXo3lw=", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385307), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ -187365912))));
                bD.u = gj.decode("XciGtq3EYwOZ5A/LhuLP/TmKud+nklyesI7g2Vs=", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385306), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 261911195))));
                bD.f = gj.decode("qOXL3GsCTzFK", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385301), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 491020072))));
                bD.c = gj.decode("26NXzd8vukQZKQEFrL6vmJo7E/20QAifvqU=", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385300), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 388572786))));
                bD.l = gj.decode("gZkkZpAuZX7/LIU=", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385303), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ -1464010750))));
                bD.a = gj.decode("8r9oEAbmiiNEMN6aPkHtD2r5zBz3ORTsxh/pWmEyow==", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385302), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 1135724948))));
                bD.p = gj.decode("Vd/GDWhaK7llaA==", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385297), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ -1942623677))));
                bD.q = gj.decode("8Gpa0N8QAq/oBlyWV8ZTwUpKttFdwdfsC3kToakBPvBacAY=", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385296), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ -1855803825))));
                bD.m = gj.decode("bE0Noux1Bz3gkz4=", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385299), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ -2002233753))));
                bD.j = gj.decode("nXd/erZcIQ==", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385298), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 76039692))));
                bD.n = gj.decode("aj9CW2PYJQ/cjdSSshZSozVfKb/i2g4Ux2nTJZ5PXOrp9FdKEFlKhMDv3G44", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385293), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ -1747597250))));
                bD.r = gj.decode("RExGfVGevLp1jd0=", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385292), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 912534986))));
                bD.e = gj.decode("6+TrYHcJvltwYHxRfGEiOq+NvUtcipdqSjSU8N4Es9ro6Lum", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385295), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 71922803))));
                bD.o = gj.decode("wSNHMoqs", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385294), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 1165238357))));
                bD.b = gj.decode("KUJkcaeNT0IawQ+LzdCg8DxCzvCFtCtg+nPjVEAo/z6QHCod/yM=", bD.sS((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 410385289), var7_2 ^ var9 ^ ((var6_3 | var7_2 ^ var9) ^ (var7_2 ^ 1411137776))));
                return;
            }
lbl58:
            // 2 sources

            block23: while (true) {
                switch (var7_2) {
                    default: {
                        continue block23;
                    }
                    case -1153733775: {
                        bD.a = new int[var1_5];
                        ** continue;
                    }
                    case 690017489: {
                        var3_7 = 0;
                        var6_3 ^= -1275315455;
                        var4_8 = 0;
                        ** continue;
                    }
                    case -1964022391: {
                        var6_3 ^= var7_2 ^ 18823920;
                        var7_2 = var8_1 ^ -669357839;
                        continue block23;
                    }
                    case 628273554: 
                }
                var6_3 ^= var7_2 ^ -404510537;
                var7_2 = var8_1 ^ 1241634641;
                continue;
                break;
            }
        }
        var9 = -649082341;
        var8_1 = 1663107968;
        bD.a = mK.a(MethodHandles.lookup().lookupClass(), -1256174578);
        var7_2 = 0;
        var6_3 = -598932902;
        var7_2 = var8_1 ^ -589276797;
        block24: while (true) {
            block27: {
                switch (var7_2) {
                    default: {
                        continue block24;
                    }
                    case -1077847549: {
                        break;
                    }
                    case 1054522018: {
                        var6_3 ^= var7_2 ^ -1515163911;
                        break block27;
                    }
                    case 2045074431: {
                        ** break;
lbl96:
                        // 1 sources

                        var2_6 = (var6_3 | var7_2 ^ 449075327) ^ (var7_2 ^ -1472188228) ^ bD.a;
                        var6_3 ^= -424928727;
                        var0_4 = "\u00bbL\u0012\u00d5\u00a4\u00d8\u00b4R\u00eb<\u00e8\r\u00f6EB\u00d6I7\u00c5\u000fS\u0003\u0098H=\u00f8s\u00b7JS\u00del\u00fc\u00b9\u0010\u00d8\u0090\u00a3\u000b\u0010P\u00caR\u00a5R\u00d6\u00e0\u00d0\u00f8^\u00c7\u00dc\u0089z\u00eaR\u008cU\u00dc6\u00c9\u00be\u00d0b\u0095\u00db\u00ab\u00fd\u0085\u00ce\b\u00a7\t\u0084j\u000b\u0098\u00bb\fc\u00aa\u00d0:S".getBytes("ISO-8859-1");
                        var6_3 ^= -589841696;
                        var1_5 = var0_4.length / 4;
                        var7_2 = var8_1 ^ -372349431;
                        ** continue;
                    }
                }
                var7_2 = var8_1 ^ 1576778018;
                continue;
            }
            var7_2 = var8_1 ^ 449075327;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onEnable() {
        block14: {
            block15: {
                block13: {
                    break block15;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 193452450;
                        break block13;
                        break;
                    }
lbl4:
                    // 1 sources

                    return;
lbl6:
                    // 1 sources

                    while (true) {
                        if.get().setEnabled(true);
                        ** continue;
                        break;
                    }
                }
lbl10:
                // 3 sources

                block10: while (true) {
                    switch (var3_3) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block10;
                            }
                            break;
                        }
                        case 1121758367: {
                            break block14;
                        }
                        case 1281579677: {
                            ** continue;
                        }
                        case 923504249: {
                            ** continue;
                        }
                        case 541603007: {
                            var2_4 ^= var3_3 ^ -1098064381;
                            ** GOTO lbl27
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 865658216;
                            ** GOTO lbl-1000
                            break;
                        }
lbl27:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 1223700876;
                        ** continue;
                        case 1954309719: {
                            var2_4 ^= var3_3 ^ 2129391155;
                            break;
                        }
                    }
                    ** continue;
                    break;
                }
            }
            var4_1 = 2003308245;
            var1_2 = bD.a & 2003308245 ^ 1289467701;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -194850169;
            var3_3 = (var1_2 | var4_1) ^ 1025971050;
            ** GOTO lbl10
        }
        var3_3 = (var1_2 | var4_1) ^ 1605602122;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        var4_1 = -1803645426;
        var1_2 = bD.a & -1803645426 ^ -1504167523;
        var3_3 = 0;
        ** GOTO lbl35
lbl5:
        // 1 sources

        while (true) {
            if.get().setEnabled(false);
            ** GOTO lbl22
            break;
        }
lbl8:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -573543459;
            ** GOTO lbl55
            break;
        }
lbl11:
        // 1 sources

        while (true) {
            var2_4 ^= var3_3 ^ 716831187;
            ** GOTO lbl46
            break;
        }
lbl14:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -271360061;
            if (true) ** GOTO lbl55
            break;
        }
        block29: while (true) {
            switch (var2_4) {
                case 536327127: {
                    var3_3 = (var1_2 | var4_1) ^ -332572384;
                    ** GOTO lbl55
                }
lbl22:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -1980824308;
                ** GOTO lbl55
lbl24:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -588494727;
                    ** GOTO lbl55
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    switch (var2_4) {
                        default: {
                            ** continue;
                        }
                        case -1100442346: {
                            ** continue;
                        }
                        ** case 826247144:
lbl34:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
lbl35:
                // 1 sources

                var2_4 = (var1_2 | var4_1) ^ -2025768841;
                break block29;
lbl37:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1239726667;
                    ** GOTO lbl55
                    break;
                }
                case 506474277: {
                    var3_3 = (var1_2 | var4_1) ^ -1775750457;
                    ** GOTO lbl55
lbl43:
                    // 2 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -606629270;
                        ** GOTO lbl55
                        break;
                    }
lbl46:
                    // 1 sources

                    block34: while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -906503578;
                        ** GOTO lbl55
lbl49:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -528580549;
                            ** GOTO lbl75
                            break;
                        }
lbl52:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 2081745885;
                            ** GOTO lbl43
                            break;
                        }
lbl55:
                        // 13 sources

                        block37: while (true) {
                            switch (var3_3) lbl-1000:
                            // 2 sources

                            {
                                default: {
                                    continue block37;
                                }
                                case 1887956816: {
                                    ** continue;
                                }
                                case -1368699510: {
                                    continue block29;
                                }
                                case 1806619714: {
                                    ** continue;
                                }
                                case -1818096963: {
                                    ** continue;
                                }
                                case -1340951439: {
                                    ** continue;
                                }
                                case -6683180: {
                                    break;
                                }
                                case 1504567388: {
                                    ** continue;
                                }
                                case 542543192: {
                                    ** continue;
                                }
                            }
lbl75:
                            // 2 sources

                            var3_3 = (var1_2 | var4_1) ^ 635221282;
                            continue;
                            {
                                case 1515447999: {
                                    var2_4 ^= var3_3 ^ 1482529580;
                                    ** continue;
                                }
                                case -887787254: {
                                    var2_4 ^= var3_3 ^ -1377266155;
                                    ** GOTO lbl-1000
                                }
                                case 1788016614: {
                                    var2_4 ^= var3_3 ^ 1146799065;
                                    continue block34;
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ 107744238;
        ** GOTO lbl55
lbl88:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -2089846125;
            ** GOTO lbl55
            break;
        }
        {
            case 1839803893: {
                ** continue;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ 2104217237;
        ** GOTO lbl55
lbl95:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -956739377;
            ** continue;
            break;
        }
lbl-1000:
        // 2 sources

        {
            case 1066515091: {
                var3_3 = (var1_2 | var4_1) ^ 404091413;
                ** GOTO lbl-1000
            }
            case 2139710969: {
                ** continue;
            }
            ** case 890357004:
        }
lbl104:
        // 1 sources

    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void syncFromState() {
        var5_1 = 1114872075;
        var2_2 = bD.a & 1114872075 ^ 592080897;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ 1724395008;
        var4_3 = (var2_2 | var5_1) ^ 753810724;
        block15: while (true) {
            switch (var4_3) {
                default: {
                    continue block15;
                }
                case 2100819708: {
                    var1_4 = if.get();
                    var4_3 = (var2_2 | var5_1) ^ -2116594502;
                    break block15;
                }
                case 1335215151: {
                    var4_3 = (var2_2 | var5_1) ^ 132149327;
                    continue block15;
                }
                case 1687914820: {
                    var3_5 ^= var4_3 ^ 475315977;
                    var4_3 = (var2_2 | var5_1) ^ 508301303;
                    continue block15;
                }
            }
            break;
        }
        block16: while (true) {
            switch (var4_3) {
                case 1753105809: {
                    var3_5 ^= var4_3 ^ -512413116;
                    var4_3 = (var2_2 | var5_1) ^ 107330253;
                    continue block16;
                }
                case -1830215712: {
                    super.setEnabled(var1_4.isEnabled());
                    var4_3 = (var2_2 | var5_1) ^ 184925338;
                    continue block16;
                }
                case 20272241: {
                    var3_5 ^= var4_3 ^ -1837935563;
                    var4_3 = (var2_2 | var5_1) ^ 1298689322;
                    continue block16;
                }
                case -491999823: {
                    var3_5 ^= var4_3 ^ 1991774911;
                    var4_3 = (var2_2 | var5_1) ^ -242030869;
                    continue block16;
                }
                case 1696482246: {
                    this.a.sync(var1_4.getVolume() * 100.0f);
                    var4_3 = (var2_2 | var5_1) ^ 1649323386;
                    ** break;
                }
                case 773035041: {
                    this.a.forEach((BiConsumer<lO, bP>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, sT(z.r.if z.r.lO z.r.bP ), (Lz/r/lO;Lz/r/bP;)V)((if)var1_4));
                    var4_3 = (var2_2 | var5_1) ^ 2086044302;
                }
lbl46:
                // 3 sources

                default: {
                    continue block16;
                }
                case 523074437: {
                    var3_5 ^= var4_3 ^ -751375698;
                    var4_3 = (var2_2 | var5_1) ^ -558335774;
                    continue block16;
                }
                case -1111260695: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void sT(if var0, lO var1_1, bP var2_2) {
        var3_3 = bD.a & -168097292 ^ -1786751089;
        var5_4 = 0;
        ** GOTO lbl12
lbl4:
        // 1 sources

        block5: while (true) {
            switch (var5_4) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    var5_4 = (var3_3 | -168097292) ^ -1089846596;
                    ** GOTO lbl-1000
                    break;
                }
lbl12:
                // 1 sources

                var4_5 = (var3_3 | -168097292) ^ -1809945933;
                ** continue;
lbl14:
                // 1 sources

                while (true) {
                    var5_4 = (var3_3 | -168097292) ^ 642618181;
                    ** continue;
                    break;
                }
                case -742994758: {
                    var4_5 ^= var5_4 ^ -189721291;
                    break block5;
                }
                case 1257315651: {
                    ** continue;
                }
            }
            break;
        }
        var5_4 = (var3_3 | -168097292) ^ 1327807526;
        ** while (true)
        {
            ** case -1159732263:
        }
lbl25:
        // 1 sources

        var2_2.sync(var0.isGroupEnabled(var1_1));
    }
}

