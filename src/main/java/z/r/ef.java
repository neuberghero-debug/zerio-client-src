/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1043
 *  net.minecraft.class_1044
 *  net.minecraft.class_11659
 *  net.minecraft.class_11659$class_11660
 *  net.minecraft.class_12075
 *  net.minecraft.class_12249
 *  net.minecraft.class_156
 *  net.minecraft.class_1799
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_7833
 *  org.joml.Matrix4f
 *  org.joml.Quaternionfc
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_12249;
import net.minecraft.class_156;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_7833;
import org.joml.Matrix4f;
import org.joml.Quaternionfc;
import z.r.aE;
import z.r.aH;
import z.r.az;
import z.r.dA;
import z.r.ec;
import z.r.gF;
import z.r.gP;
import z.r.gj;
import z.r.hE;
import z.r.hJ;
import z.r.iG;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class ef
extends gF {
    private long a;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private final ke a;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String d;
    private int a;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    public static final int c;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final float a;
    private static final /* synthetic */ String j;
    private static final long b;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static volatile ef a;
    private final ke b;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private int b;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private class_1043 a;
    private static final /* synthetic */ String t;
    private final ke c;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private static final int[] a;
    private static final /* synthetic */ String x;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String y;
    private long c;
    private final gP a;
    private final gP b;
    private static final class_2960 a;
    private final aE a;
    private static final /* synthetic */ String z;
    private final ke d;
    private static final float b;
    private final gP c;
    private final az a;
    private final ke e;
    private final az b;
    private final ke f;
    private class_1043 b;
    private static final float c;
    private static final /* synthetic */ String A;
    private final gP d;
    private final az c;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ef() {
        block51: {
            var5_1 = 547591924;
            var2_2 = ef.c & 547591924 ^ -1681656215;
            var4_3 = 0;
            var3_5 = (var2_2 | var5_1) ^ -1389244507;
            var3_5 ^= -1918742505;
            super(ef.k, ef.s, dA.l);
            var4_3 = (var2_2 | var5_1) ^ 1238673786;
            ** GOTO lbl-1000
lbl9:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 410543435;
                ** GOTO lbl106
                break;
            }
lbl12:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ -918336571;
                break block51;
                break;
            }
lbl15:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 935787211;
                break block51;
                break;
            }
lbl18:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 70195816;
                ** GOTO lbl106
                break;
            }
        }
        block42: while (true) {
            switch (var4_3) lbl-1000:
            // 2 sources

            {
                default: {
                    continue block42;
                }
                case -1628693201: {
                    this.a = this.addSetting(new aE(ef.e, ef.q, new String[]{ef.q, ef.n, ef.z, ef.y}));
                    ** GOTO lbl72
                }
                case -500758444: {
                    var3_5 ^= var4_3 ^ 1527995621;
                    ** GOTO lbl62
                }
                case -1483077554: {
                    this.d = this.addSetting(new ke(ef.w, true));
                    var4_3 = (var2_2 | var5_1) ^ -1802221099;
                    continue block42;
                }
                case 438588913: {
                    this.c = this.addSetting(new gP(ef.x, 1.0f, 0.5f, 3.0f, 0.05f, ef.c).description(ef.b));
                    ** break;
                }
                case 596064561: {
                    this.d = this.addSetting(new gP(ef.m, 1.0f, 0.0f, 3.0f, 0.05f, ef.c).description(ef.d));
                    ** GOTO lbl78
                }
                case 796376872: {
                    var3_5 ^= var4_3 ^ 1974143111;
                    ** GOTO lbl80
                }
                case -231252089: {
                    var3_5 ^= var4_3 ^ 887571222;
                    ** continue;
                }
lbl48:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 2054912279;
                continue block42;
                case -1485211617: {
                    var1_4 = this.addSetting(new iG(ef.l));
                    ** continue;
                }
                case 1923136824: {
                    ef.a = this;
                    ** continue;
                }
                case -1943729098: {
                    var3_5 ^= var4_3 ^ 1395275806;
                    ** GOTO lbl66
                }
                case 1882678525: {
                    var3_5 ^= var4_3 ^ 1341528289;
                    ** GOTO lbl64
                }
lbl62:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -1580752116;
                continue block42;
lbl64:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -1738223668;
                continue block42;
lbl66:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 621800402;
                continue block42;
                case 79557443: {
                    var3_5 ^= var4_3 ^ -61197063;
                    var4_3 = (var2_2 | var5_1) ^ 477757107;
                    continue block42;
                }
lbl72:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -875261440;
                continue block42;
                case -1046966294: {
                    var3_5 ^= var4_3 ^ 986514198;
                    var4_3 = (var2_2 | var5_1) ^ 610883430;
                    continue block42;
                }
lbl78:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 1506082473;
                continue block42;
lbl80:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 479891170;
                continue block42;
                case -1618304613: 
            }
            this.b = this.addSetting(new gP(ef.v, 100.0f, 10.0f, 200.0f, 5.0f, ef.r).description(ef.u));
            var4_3 = (var2_2 | var5_1) ^ -1084357186;
        }
lbl86:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ -1913776805;
            ** GOTO lbl106
            break;
        }
lbl89:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ 1897703915;
            ** GOTO lbl106
lbl92:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 1241381766;
                if (true) ** GOTO lbl106
                break;
            }
            break;
        }
        block46: while (true) {
            var4_3 = (var2_2 | var5_1) ^ 1936114165;
            ** GOTO lbl106
lbl98:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ -866571121;
                ** GOTO lbl106
lbl101:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 847837532;
                    if (true) ** GOTO lbl106
                    break;
                }
                break;
            }
            block49: while (true) {
                var4_3 = (var2_2 | var5_1) ^ -131971888;
lbl106:
                // 9 sources

                block50: while (true) {
                    switch (var4_3) {
                        case 876949757: {
                            this.e = this.addSetting(new ke(ef.h, true));
                            ** continue;
                        }
                        case -232911493: {
                            this.c = var1_4.add(new az(ef.o, ef.fW((var3_5 | var4_3 ^ -759325809) ^ (var4_3 ^ -374868855), (var2_2 | var4_3 ^ -759325809) ^ ((var3_5 | var4_3 ^ -759325809) ^ (var4_3 ^ 736824739)))));
                            var4_3 = (var2_2 | var5_1) ^ 665697411;
                            continue block50;
                        }
                        case -1217481332: {
                            this.b = var1_4.add(new az(ef.i, ef.fW((var3_5 | var4_3 ^ -1748163720) ^ (var4_3 ^ 579538045), (var2_2 | var4_3 ^ -1748163720) ^ ((var3_5 | var4_3 ^ -1748163720) ^ (var4_3 ^ -1736613152)))));
                            ** continue;
                        }
                        case -1550085194: {
                            var3_5 ^= var4_3 ^ -1577212044;
                            ** continue;
                        }
                        case -1592677237: {
                            var3_5 ^= var4_3 ^ 95549905;
                            ** break;
                        }
                        case -2090653663: {
                            var3_5 ^= var4_3 ^ 1882365987;
                            var4_3 = (var2_2 | var5_1) ^ -1884895744;
                            continue block50;
                        }
                        case -1989472351: {
                            var3_5 ^= var4_3 ^ -2043638547;
                            var4_3 = (var2_2 | var5_1) ^ 997628113;
                            continue block50;
                        }
                        case 906879910: {
                            this.a = this.addSetting(new gP(ef.g, 100.0f, 0.0f, 200.0f, 10.0f, ef.r).description(ef.a));
                            var4_3 = (var2_2 | var5_1) ^ 947969756;
                            continue block50;
                        }
                        case -833592598: {
                            var3_5 ^= var4_3 ^ -961781052;
                            ** continue;
                        }
                        case 1136767533: {
                            this.a = var1_4.add(new az(ef.p, ef.fW((var3_5 | var4_3 ^ 1667376345) ^ (var4_3 ^ 1199320020), (var2_2 | var4_3 ^ 1667376345) ^ ((var3_5 | var4_3 ^ 1667376345) ^ (var4_3 ^ 1065257351)))));
                            var4_3 = (var2_2 | var5_1) ^ 1974703127;
                            continue block50;
                        }
                        case -979970356: {
                            var3_5 ^= var4_3 ^ 1867696240;
                            ** GOTO lbl172
                        }
                        case 2008734322: {
                            var3_5 ^= var4_3 ^ -421331299;
                            continue block49;
                        }
                        case -930793720: {
                            var3_5 ^= var4_3 ^ -199543832;
                            ** GOTO lbl167
                        }
                        case 494933624: {
                            this.c = this.addSetting(new ke(ef.A, true));
                            ** GOTO lbl165
                        }
                        case -2137690580: {
                            this.f = this.addSetting(new ke(ef.f, true));
                            var4_3 = (var2_2 | var5_1) ^ 452090486;
                            continue block50;
                        }
                        case -1672590722: {
                            var3_5 ^= var4_3 ^ 313563660;
                            var4_3 = (var2_2 | var5_1) ^ 210584433;
                            continue block50;
                        }
lbl163:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 149791607;
                        ** GOTO lbl173
lbl165:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 2121605169;
                        ** GOTO lbl173
lbl167:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -1503403899;
                        ** GOTO lbl173
                        case -1290906230: {
                            this.a = this.addSetting(new ke(ef.t, false));
                            ** continue;
                        }
lbl172:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 1680743550;
lbl173:
                        // 5 sources

                        default: {
                            continue block50;
                        }
                        case -1077089131: {
                            var3_5 ^= var4_3 ^ -2099491911;
                            ** continue;
                        }
                        case -889233642: {
                            this.b = this.addSetting(new ke(ef.j, false));
                            continue block46;
                        }
                        case -540153213: 
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ef getInstance() {
        int n2 = c & 0x779DBF0E ^ 0xEE8AE021;
        int n3 = 0;
        int n4 = (n2 | 0x779DBF0E) ^ 0xA505740;
        n3 = (n2 | 0x779DBF0E) ^ 0x399825F8;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -972563753: {
                    n3 = (n2 | 0x779DBF0E) ^ 0xAF918F28;
                    continue block5;
                }
                case 1343123463: {
                    n4 ^= n3 ^ 0x1834530D;
                    n3 = (n2 | 0x779DBF0E) ^ 0x21245380;
                    continue block5;
                }
                case -558125905: 
            }
            break;
        }
        return a;
    }

    private static int fW(int n2, int n3) {
        int n4 = -1181781192;
        int n5 = 1815748652;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x99F53D3A)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xFDBF4D7E;
        n6 ^= (n5 | n4) ^ 0xFDBFB54F;
        n6 -= (n5 | n4) ^ 0xFDBFD036;
        n6 ^= (n5 | n4) ^ 0xFDBFD3C6;
        n6 += (n5 | n4) ^ 0xFDBF910B;
        n6 += (n5 | n4) ^ 0xFDBFB95A;
        n6 ^= (n5 | n4) ^ 0xFDBFCC49;
        return n6 += (n5 | n4) ^ 0xFDBF53B5;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onEnable() {
        int n2 = c & 0xA38074E ^ 0x1057F6E8;
        int n3 = 0;
        int n4 = (n2 | 0xA38074E) ^ 0xE85F13F6;
        n3 = (n2 | 0xA38074E) ^ 0xDD774239;
        block5: while (true) {
            block6: {
                switch (n3) {
                    default: {
                        continue block5;
                    }
                    case 801250193: {
                        n4 ^= n3 ^ 0x1063EA7F;
                        break block6;
                    }
                    case -955730473: {
                        break;
                    }
                    case 743017224: {
                        return;
                    }
                }
                n3 = (n2 | 0xA38074E) ^ 0x35BDEC7F;
                continue;
            }
            n3 = (n2 | 0xA38074E) ^ 0x36367CE6;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block31: {
            block33: {
                var4_1 = -778286231;
                var1_2 = ef.c & -778286231 ^ -501444745;
                var3_3 = 0;
                ** GOTO lbl53
lbl5:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -32849636;
                    ** GOTO lbl51
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -1992671237;
                    var3_3 = (var1_2 | var4_1) ^ 991059991;
                    ** GOTO lbl33
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    this.b.close();
                    ** GOTO lbl67
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ 1954523548;
                    ** GOTO lbl81
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -855515880;
                    ** GOTO lbl57
                    break;
                }
lbl21:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 298771483;
                    ** GOTO lbl33
lbl24:
                    // 2 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 623532903;
                        ** GOTO lbl33
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                block24: while (true) {
                    block32: {
                        var3_3 = (var1_2 | var4_1) ^ 734169679;
                        break block32;
lbl30:
                        // 1 sources

                        while (true) {
                            this.a = null;
                            ** GOTO lbl24
                            break;
                        }
                    }
lbl34:
                    // 5 sources

                    block26: while (true) {
                        switch (var3_3) lbl-1000:
                        // 8 sources

                        {
                            while (true) {
                                default: {
                                    continue block26;
                                }
                                break;
                            }
                            case -955782275: {
                                ** continue;
                            }
                            case -492760064: {
                                ** continue;
                            }
                            case -1431220609: {
                                ** continue;
                            }
                            case 903293349: {
                                ** continue;
                            }
                            case -692677608: {
                                ** continue;
                            }
                            case 135506431: {
                                ** continue;
                            }
lbl51:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -599113862;
                            ** GOTO lbl-1000
lbl53:
                            // 1 sources

                            var2_4 = (var1_2 | var4_1) ^ 641430945;
                            ** continue;
                            case 1808083926: {
                                return;
                            }
lbl57:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -1738939223;
                            ** GOTO lbl-1000
lbl59:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 199853447;
                                ** GOTO lbl-1000
                                break;
                            }
lbl62:
                            // 2 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 289266559;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -497931420: {
                                break block31;
                            }
lbl67:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ 882582530;
                            ** GOTO lbl-1000
                            case -884882888: {
                                var2_4 ^= var3_3 ^ 1703393907;
                                break block24;
                            }
lbl72:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1496154368;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -126530824: {
                                var2_4 ^= var3_3 ^ -1049075559;
                                ** continue;
                            }
                            case 1883786405: {
                                if (this.b == null) ** GOTO lbl62
                                ** continue;
                            }
lbl81:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -1889839101;
                            ** continue;
                            case -664910544: {
                                var2_4 ^= var3_3 ^ -1711880951;
                                break;
                            }
                        }
                        break;
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ -2083224614;
                ** GOTO lbl34
                {
                    case -930173080: {
                        if (this.a != null) ** break;
                        ** continue;
                        break block33;
                    }
                    case 0x7CC7977C: {
                        this.a.close();
                        ** continue;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -74488192;
                ** GOTO lbl34
            }
            var3_3 = (var1_2 | var4_1) ^ -968104230;
            ** GOTO lbl34
            {
                ** case 802615301:
            }
lbl101:
            // 1 sources

            this.b = null;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ 954010951;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static boolean fX() {
        block39: {
            block34: {
                block33: {
                    block31: {
                        block36: {
                            block32: {
                                block37: {
                                    block35: {
                                        break block37;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var3_2 = (var1_1 | var4) ^ 534665618;
                                            ** GOTO lbl32
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            block30: {
                                                var0_3 = ef.a;
                                                var3_2 = (var1_1 | var4) ^ -1644776019;
                                                ** GOTO lbl32
lbl8:
                                                // 1 sources

                                                while (true) {
                                                    var3_2 = (var1_1 | var4) ^ -1679742494;
                                                    ** GOTO lbl32
                                                    break;
                                                }
lbl11:
                                                // 1 sources

                                                while (true) {
                                                    var2_4 ^= var3_2 ^ -222790870;
                                                    break block30;
                                                    break;
                                                }
lbl14:
                                                // 1 sources

                                                while (true) {
                                                    var2_4 ^= var3_2 ^ -1403665270;
                                                    break block31;
                                                    break;
                                                }
lbl17:
                                                // 3 sources

                                                while (true) {
                                                    var3_2 = (var1_1 | var4) ^ 244002268;
                                                    ** GOTO lbl32
                                                    break;
                                                }
                                            }
                                            var3_2 = (var1_1 | var4) ^ 294836426;
                                            ** GOTO lbl32
lbl23:
                                            // 1 sources

                                            while (true) {
                                                if (!hJ.ok()) ** GOTO lbl17
                                                ** continue;
                                                break;
                                            }
                                            break;
                                        }
lbl26:
                                        // 1 sources

                                        while (true) {
                                            block38: {
                                                var3_2 = (var1_1 | var4) ^ -1748127514;
                                                break block38;
lbl29:
                                                // 1 sources

                                                while (true) {
                                                    var2_4 ^= var3_2 ^ 960479412;
                                                    break block32;
                                                    break;
                                                }
                                            }
lbl33:
                                            // 4 sources

                                            block26: while (true) {
                                                switch (var3_2) {
                                                    default: {
                                                        continue block26;
                                                    }
                                                    case 1175014978: {
                                                        ** continue;
                                                    }
                                                    case 1075761677: {
                                                        ** continue;
                                                    }
                                                    case 1278364425: {
                                                        break;
                                                    }
                                                    case -1004428675: {
                                                        ** continue;
                                                    }
                                                    case -1947810887: {
                                                        ** continue;
                                                    }
                                                    case -713763277: {
                                                        ** continue;
                                                    }
                                                    case -525132363: {
                                                        if (!var0_3.isEnabled()) ** GOTO lbl17
                                                        break block33;
                                                    }
                                                    case -963931544: {
                                                        v0 = false;
                                                        break block34;
                                                    }
                                                }
                                                var3_2 = (var1_1 | var4) ^ 994895450;
                                                continue;
                                                break;
                                            }
                                            break;
                                        }
lbl57:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_2 ^ 1459888604;
                                            break block35;
                                            break;
                                        }
lbl60:
                                        // 3 sources

                                        block28: while (true) {
                                            switch (var3_2) {
                                                default: {
                                                    continue block28;
                                                }
                                                case -1789600953: {
                                                    ** continue;
                                                }
                                                case 1788639122: {
                                                    break block36;
                                                }
                                                case 1402970259: {
                                                    break;
                                                }
                                            }
                                            ** continue;
                                            break;
                                        }
                                    }
                                    var3_2 = (var1_1 | var4) ^ 1319837864;
                                    ** GOTO lbl60
                                }
                                var4 = -1685882141;
                                var1_1 = ef.c & -1685882141 ^ 1132301164;
                                var3_2 = 0;
                                break block39;
                                {
                                    case -898817243: {
                                        if (var0_3 != null) ** break;
                                        ** continue;
                                        ** continue;
                                    }
                                }
                            }
                            var3_2 = (var1_1 | var4) ^ 494168455;
                            ** GOTO lbl33
                        }
                        var3_2 = (var1_1 | var4) ^ -2006951044;
                        ** GOTO lbl60
                        {
                            ** case -1163740036:
                        }
lbl90:
                        // 1 sources

                        v0 = true;
                        break block34;
                    }
                    var3_2 = (var1_1 | var4) ^ 1633503123;
                    ** GOTO lbl33
                }
                var3_2 = (var1_1 | var4) ^ 1343830102;
                ** while (true)
lbl98:
                // 1 sources

                return v0;
            }
            var2_4 ^= 1414910283;
            ** while (true)
        }
        var2_4 = (var1_1 | var4) ^ -177872292;
        var3_2 = (var1_1 | var4) ^ -1318876035;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean shouldForceGlint() {
        block26: {
            break block26;
lbl1:
            // 4 sources

            while (true) {
                var3_2 = (var1_1 | var4) ^ 1353959933;
                ** GOTO lbl12
lbl4:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | var4) ^ -815081684;
                    if (true) ** GOTO lbl12
                    break;
                }
                break;
            }
            block21: while (true) {
                var3_2 = (var1_1 | var4) ^ -108403099;
                if (true) ** GOTO lbl12
                block22: while (true) {
                    var3_2 = (var1_1 | var4) ^ 985567317;
lbl12:
                    // 4 sources

                    block23: while (true) {
                        switch (var3_2) {
                            case 1377896376: {
                                if (!((Boolean)var0_3.b.getValue()).booleanValue()) ** GOTO lbl1
                                var3_2 = (var1_1 | var4) ^ 584007474;
                                continue block23;
                            }
                            case 377548263: {
                                if (!var0_3.isEnabled()) ** GOTO lbl1
                                ** break;
                            }
                            case 181788874: {
                                var2_4 ^= var3_2 ^ -740669331;
                                var3_2 = (var1_1 | var4) ^ 812172541;
                                continue block23;
                            }
lbl25:
                            // 1 sources

                            var3_2 = (var1_1 | var4) ^ -345674180;
                            break;
                            case 1899848361: {
                                var3_2 = (var1_1 | var4) ^ -750790143;
                                break;
                            }
                            case -412088108: {
                                var3_2 = (var1_1 | var4) ^ 1468664489;
                                continue block23;
                            }
                            case -1842004657: {
                                if (!hJ.ok()) ** GOTO lbl1
                                ** continue;
                            }
                            case -1794310629: {
                                var2_4 ^= var3_2 ^ 1275287228;
                                continue block22;
                            }
                            case 1010225539: {
                                if (var0_3 != null) ** break;
                                ** continue;
                                var3_2 = (var1_1 | var4) ^ -1266526897;
                                break;
                            }
                            case 741596561: {
                                var2_4 ^= var3_2 ^ 766661566;
                                continue block21;
                            }
                            case -16668749: {
                                v0 = false;
                                ** GOTO lbl55
                            }
                            case 786061786: {
                                var3_2 = (var1_1 | var4) ^ -1751240610;
                                continue block23;
                            }
                            case -170396901: {
                                v0 = true;
lbl55:
                                // 2 sources

                                var2_4 ^= 728578815;
                                return v0;
                            }
                        }
lbl57:
                        // 5 sources

                    }
                    break;
                }
                break;
            }
        }
        var4 = 1169498720;
        var1_1 = ef.c & 1169498720 ^ -2129979514;
        var3_2 = 0;
        var2_4 = (var1_1 | var4) ^ 1139351998;
        var3_2 = (var1_1 | var4) ^ -2127024241;
        block25: while (true) {
            switch (var3_2) {
                default: {
                    continue block25;
                }
                case -1908412422: {
                    var0_3 = ef.a;
                    ** break;
                }
                case 1149704297: {
                    ** GOTO lbl75
                }
lbl73:
                // 1 sources

                var3_2 = (var1_1 | var4) ^ -376640905;
                ** GOTO lbl57
lbl75:
                // 1 sources

                var3_2 = (var1_1 | var4) ^ 1378296364;
                continue block25;
                case -1751640630: 
            }
            var2_4 ^= var3_2 ^ -793032105;
            var3_2 = (var1_1 | var4) ^ 1266735132;
        }
    }

    /*
     * Exception decompiling
     */
    public static boolean shouldBlackoutItem() {
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
    public static double overrideGlintStrength(double var0) {
        block24: {
            block21: {
                block25: {
                    block22: {
                        block23: {
                            block27: {
                                block20: {
                                    block26: {
                                        break block26;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            v0 = var0;
                                            break block20;
                                            break;
                                        }
                                    }
                                    var5_1 = -1068524934;
                                    var2_2 = ef.c & -1068524934 ^ 610549665;
                                    var4_3 = 0;
                                    var3_4 = (var2_2 | var5_1) ^ 509258538;
                                    break block27;
                                }
lbl11:
                                // 2 sources

                                while (true) {
                                    var3_4 ^= 2123251578;
                                    break block21;
                                    break;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    var3_4 ^= var4_3 ^ -344424297;
                                    break block22;
                                    break;
                                }
lbl17:
                                // 1 sources

                                while (true) {
                                    var3_4 ^= var4_3 ^ -1389298345;
                                    break block23;
lbl20:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 1385701165;
                                        break block24;
                                        break;
                                    }
                                    break;
                                }
                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 1771553448;
                                    break block24;
                                    break;
                                }
                            }
                            var4_3 = (var2_2 | var5_1) ^ -1611608021;
                            break block24;
lbl29:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ 748084203;
                                break block24;
                                break;
                            }
lbl32:
                            // 1 sources

                            while (true) {
                                var3_4 ^= var4_3 ^ -745029804;
                                ** continue;
                                break;
                            }
                        }
                        var4_3 = (var2_2 | var5_1) ^ 1083930548;
                        break block24;
lbl38:
                        // 1 sources

                        while (true) {
                            if (!ef.fX()) ** continue;
                            break block25;
                            break;
                        }
                    }
                    var4_3 = (var2_2 | var5_1) ^ 969913855;
                    break block24;
                }
                var4_3 = (var2_2 | var5_1) ^ 389054635;
                break block24;
            }
            return v0;
lbl49:
            // 1 sources

            while (true) {
                v0 = 1.0;
                ** continue;
                break;
            }
        }
        block19: while (true) {
            switch (var4_3) {
                default: {
                    continue block19;
                }
                case 2074046416: {
                    ** continue;
                }
                case -1527461809: {
                    ** continue;
                }
                case -1225285418: {
                    ** continue;
                }
                case -1913094829: {
                    ** continue;
                }
                case -211861680: {
                    ** continue;
                }
                case -576714236: {
                    ** continue;
                }
                ** case -923180016:
lbl70:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public static int armorBaseTint(class_1799 var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
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
    public static boolean auraEnabled() {
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
     * Exception decompiling
     */
    public static boolean skinGlintFor(Object var0) {
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
    public static void submitAura(class_4587 var0, class_11659 var1_1, class_12075 var2_2) {
        block41: {
            var12_3 = -1497795220;
            var9_4 = ef.c & -1497795220 ^ -786787611;
            var11_5 = 0;
            var10_6 = (var9_4 | var12_3) ^ 2084450993;
            var11_5 = (var9_4 | var12_3) ^ 1064512328;
            break block41;
lbl7:
            // 1 sources

            while (true) {
                var11_5 = (var9_4 | var12_3) ^ 1057049462;
                ** GOTO lbl26
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var11_5 = (var9_4 | var12_3) ^ 1484366260;
                if (true) ** GOTO lbl26
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                v0 = -4808288688687185843L << 32 >>> 32 ^ (long)(var10_6 ^= -573797236) & 0xFFFFFFFFL;
                var7_10 = 1.0f + 0.06f * (float)Math.sin((double)(var4_8 % (v0 | (-4808288688687185843L >>> 32 ^ (long)var10_6 & 0xFFFFFFFFL) << 32)) / 1700.0 * 6.283185307179586);
                var10_6 ^= -1193179053;
                var8_11 = 0.55f * var7_10;
                var11_5 = (var9_4 | var12_3) ^ 2100967480;
                ** GOTO lbl77
                break;
            }
lbl21:
            // 1 sources

            while (true) {
                var11_5 = (var9_4 | var12_3) ^ 1466997703;
                break block41;
                break;
            }
            block35: while (true) {
                var11_5 = (var9_4 | var12_3) ^ 107511825;
lbl26:
                // 3 sources

                block36: while (true) {
                    switch (var11_5) {
                        case 1366018764: {
                            var10_6 ^= var11_5 ^ 820806689;
                            var11_5 = (var9_4 | var12_3) ^ -1576234833;
                            continue block36;
                        }
                        case 162218848: {
                            var0.method_46416(0.0f, 0.3f, 0.0f);
                            ** GOTO lbl76
                        }
                        case -1772194162: {
                            var0.method_22907((Quaternionfc)var2_2.field_63081);
                            ** break;
                        }
                        case -1346218407: {
                            var0.method_22903();
                            var11_5 = (var9_4 | var12_3) ^ 1708632518;
                            continue block36;
                        }
                        case -1838391765: {
                            var10_6 ^= var11_5 ^ -660137445;
                            var11_5 = (var9_4 | var12_3) ^ -32459635;
                            continue block36;
                        }
                        case -445952082: {
                            var0.method_22909();
                            var11_5 = (var9_4 | var12_3) ^ -183468356;
                            continue block36;
                        }
                        case -237799428: {
                            var1_1.method_73483(var0, class_12249.method_76016((class_2960)ef.a), (class_11659.class_11660)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_4587$class_4665;Lnet/minecraft/class_4588;)V, ge(float net.minecraft.class_4587$class_4665 net.minecraft.class_4588 ), (Lnet/minecraft/class_4587$class_4665;Lnet/minecraft/class_4588;)V)((float)var8_11));
                            var11_5 = (var9_4 | var12_3) ^ -1353800026;
                            continue block36;
                        }
                        case 1438082882: {
                            var0.method_22907((Quaternionfc)class_7833.field_40718.rotation(var6_9));
                            var11_5 = (var9_4 | var12_3) ^ -843082997;
                            continue block36;
                        }
                        case 1492472139: {
                            var10_6 ^= var11_5 ^ -1730343757;
                            var11_5 = (var9_4 | var12_3) ^ 315668547;
                            continue block36;
                        }
                        case 44796241: {
                            var10_6 ^= var11_5 ^ -1931355159;
                            ** continue;
                        }
                        case -433358639: {
                            var10_6 ^= var11_5 ^ -1139988239;
                            ** GOTO lbl79
                        }
                        case 973366502: {
                            var10_6 ^= var11_5 ^ -618270632;
                            continue block35;
                        }
                        case -1971204139: {
                            var10_6 ^= var11_5 ^ -1467000939;
                            ** continue;
                        }
lbl74:
                        // 1 sources

                        var11_5 = (var9_4 | var12_3) ^ -1496302303;
                        ** GOTO lbl77
lbl76:
                        // 1 sources

                        var11_5 = (var9_4 | var12_3) ^ 294686524;
lbl77:
                        // 4 sources

                        default: {
                            continue block36;
                        }
lbl79:
                        // 1 sources

                        var11_5 = (var9_4 | var12_3) ^ 1642430819;
                        continue block36;
lbl81:
                        // 1 sources

                        block37: while (true) {
                            switch (var11_5) {
                                default: {
                                    continue block37;
                                }
                                case 1117254423: {
                                    var10_6 ^= var11_5 ^ 1422528791;
                                    ** GOTO lbl101
                                }
                                case 1193165821: {
                                    var4_8 = class_156.method_658();
                                    ** break;
                                }
                                case 167654106: {
                                    var10_6 ^= var11_5 ^ 1988484148;
                                    var11_5 = (var9_4 | var12_3) ^ -1331317744;
                                    continue block37;
                                }
lbl95:
                                // 1 sources

                                v1 = 6956102529978036213L << 32 >>> 32 ^ (long)(var10_6 ^= -466462470) & 0xFFFFFFFFL;
                                var6_9 = (float)(var4_8 % (v1 | (6956102529978036213L >>> 32 ^ (long)var10_6 & 0xFFFFFFFFL) << 32)) / 26000.0f * 6.2831855f;
                                ** continue;
                                case -1454026041: 
                            }
                            ** GOTO lbl103
lbl101:
                            // 1 sources

                            var11_5 = (var9_4 | var12_3) ^ 1592698154;
                            continue;
lbl103:
                            // 1 sources

                            var3_7.gc();
                            var11_5 = (var9_4 | var12_3) ^ -28981961;
                            continue;
                            break;
                        }
                        while (true) {
                            var11_5 = (var9_4 | var12_3) ^ 1616168068;
                            break block41;
lbl109:
                            // 1 sources

                            while (true) {
                                var11_5 = (var9_4 | var12_3) ^ 1215366928;
                                break block41;
                                break;
                            }
                            break;
                        }
                        case -927286117: 
                    }
                    break;
                }
                break;
            }
            return;
        }
        block40: while (true) {
            switch (var11_5) {
                default: {
                    continue block40;
                }
                case 943878181: {
                    var10_6 ^= var11_5 ^ 138534980;
                    var11_5 = (var9_4 | var12_3) ^ -92356623;
                    continue block40;
                }
                case -1745931415: {
                    var10_6 ^= var11_5 ^ -1823568443;
                    ** continue;
                }
                case -1077219075: {
                    var3_7 = ef.a;
                    var11_5 = (var9_4 | var12_3) ^ -1255406342;
                    ** continue;
                }
                case -1597281238: {
                    if (ef.auraEnabled()) ** continue;
                    var11_5 = (var9_4 | var12_3) ^ -805730360;
                    continue block40;
                }
                case 1605800644: {
                    var10_6 ^= var11_5 ^ 1024440133;
                    ** continue;
                }
                case -926360411: {
                    var11_5 = (var9_4 | var12_3) ^ -1475517143;
                    continue block40;
                }
                case 231032860: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static void fY(class_4587.class_4665 var0, class_4588 var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
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
    public static class_1044 textureFor(class_2960 var0) {
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
    public static Matrix4f glintTransform(float var0) {
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
    private Matrix4f fZ(float var1_1) {
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
    private float ga() {
        block22: {
            block24: {
                block21: {
                    block23: {
                        block20: {
                            break block23;
lbl1:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 190588616;
                                ** GOTO lbl38
                                break;
                            }
lbl4:
                            // 1 sources

                            while (this.a.is(ef.q)) {
                                ** continue;
lbl6:
                                // 1 sources

                                ** GOTO lbl1
                            }
                            break block24;
lbl8:
                            // 1 sources

                            while (true) {
                                v0 = 2.0f;
                                break block20;
                                break;
                            }
lbl11:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -262385070;
                                break block21;
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1264634932;
                                ** GOTO lbl38
                                break;
                            }
                        }
lbl18:
                        // 2 sources

                        while (true) {
                            var2_4 ^= 1698363435;
                            return v0;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            v0 = 1.0f;
                            ** continue;
                            break;
                        }
                    }
                    var4_1 = 1077458420;
                    var1_2 = ef.c & 1077458420 ^ -2112370072;
                    var3_3 = 0;
                    var2_4 = (var1_2 | var4_1) ^ 959286524;
                    ** while (true)
lbl30:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 1981189204;
                        break block22;
                        break;
                    }
lbl33:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 152012488;
                        if (true) ** GOTO lbl38
                        break;
                    }
                    block18: while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1803567985;
lbl38:
                        // 7 sources

                        block19: while (true) {
                            switch (var3_3) {
                                default: {
                                    continue block19;
                                }
                                case -886015692: {
                                    ** GOTO lbl4
                                }
                                case -766631476: {
                                    ** continue;
                                }
                                case -916203212: {
                                    ** continue;
                                }
                                case -408048575: {
                                    ** continue;
                                }
                                case 1328088882: {
                                    ** continue;
                                }
                                case -1447052147: {
                                    var2_4 ^= var3_3 ^ 403652058;
                                    ** continue;
                                }
                                case -1990249528: {
                                    continue block18;
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 275897904;
                ** GOTO lbl38
            }
            var3_3 = (var1_2 | var4_1) ^ -1927874354;
            ** GOTO lbl38
        }
        var3_3 = (var1_2 | var4_1) ^ 630346685;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private class_1044 gb() {
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
    private void gc() {
        block59: {
            break block59;
            while (true) {
                var7_3 = (var5_2 | var8_1) ^ -5198890;
                ** GOTO lbl13
lbl4:
                // 1 sources

                while (true) {
                    var7_3 = (var5_2 | var8_1) ^ -112070220;
                    ** GOTO lbl13
                    break;
                }
lbl7:
                // 1 sources

                while (true) {
                    var7_3 = (var5_2 | var8_1) ^ 351027711;
                    ** GOTO lbl13
                    break;
                }
                break;
            }
lbl10:
            // 2 sources

            while (true) {
                var7_3 = (var5_2 | var8_1) ^ 748894843;
                ** GOTO lbl123
lbl13:
                // 4 sources

                block47: while (true) {
                    block60: {
                        switch (var7_3) {
                            case 1792424770: {
                                return;
                            }
                            case -323004125: {
                                var6_7 ^= var7_3 ^ -188498719;
                                var7_3 = (var5_2 | var8_1) ^ -1763359964;
                                continue block47;
                            }
                            case -1786635796: {
                                var6_7 ^= var7_3 ^ -1872838057;
                                var7_3 = (var5_2 | var8_1) ^ 1949254709;
                                continue block47;
                            }
                            case -2011415469: {
                                this.a = var1_4;
                                ** break;
                            }
                            case -1931275843: {
                                var6_7 ^= var7_3 ^ -92398420;
                                ** continue;
                            }
                            case -408383805: {
                                this.a.method_4524();
                                break block60;
                            }
                            case -152586678: {
                                var6_7 ^= var7_3 ^ 1024587368;
                                ** GOTO lbl64
                            }
                            case 220745755: {
                                var6_7 ^= var7_3 ^ -1607586713;
                                ** break;
                            }
                            case -1521699745: {
                                this.a = var2_5;
                                var7_3 = (var5_2 | var8_1) ^ -1954847077;
                                ** GOTO lbl62
                            }
                            case -515255135: {
                                var6_7 ^= var7_3 ^ -1914887960;
                                var7_3 = (var5_2 | var8_1) ^ 1429427958;
                                ** GOTO lbl62
                            }
lbl48:
                            // 1 sources

                            var7_3 = (var5_2 | var8_1) ^ -1145713880;
                            continue block47;
lbl50:
                            // 1 sources

                            var7_3 = (var5_2 | var8_1) ^ 332476268;
                            continue block47;
                            case 605659722: {
                                var6_7 ^= var7_3 ^ -169469136;
                                ** continue;
                            }
                            case -1770063208: {
                                var6_7 ^= var7_3 ^ 1998325355;
                                var7_3 = (var5_2 | var8_1) ^ 468942708;
                                ** GOTO lbl62
                            }
                            case 1271540097: {
                                this.a = new hE(var4_6);
                                var7_3 = (var5_2 | var8_1) ^ -400635587;
                            }
lbl62:
                            // 5 sources

                            default: {
                                continue block47;
                            }
lbl64:
                            // 1 sources

                            var7_3 = (var5_2 | var8_1) ^ 746338166;
                            continue block47;
                            case 84541443: {
                                if (this.a == null) ** continue;
                                var7_3 = (var5_2 | var8_1) ^ 987815229;
                                continue block47;
                            }
                            case 847595521: {
                                class_310.method_1551().method_1531().method_4616(ef.a, (class_1044)this.a);
                                break block60;
                            }
                            case 169164424: 
                        }
                        this.a.method_4526(var4_6);
                        var7_3 = (var5_2 | var8_1) ^ -1843761462;
                        continue;
                    }
                    var7_3 = (var5_2 | var8_1) ^ -230283692;
                    continue;
                    break;
                }
                break;
            }
lbl80:
            // 1 sources

            while (true) {
                var7_3 = (var5_2 | var8_1) ^ -1891022770;
                ** GOTO lbl159
                break;
            }
        }
        var8_1 = 449394279;
        var5_2 = ef.c & 449394279 ^ 481327445;
        var7_3 = 0;
        var6_7 = (var5_2 | var8_1) ^ 1347907565;
        var7_3 = (var5_2 | var8_1) ^ 238987001;
        block49: while (true) {
            switch (var7_3) {
                case 1831583386: {
                    var1_4 = this.signature();
                    ** break;
                }
                case 281532814: {
                    var7_3 = (var5_2 | var8_1) ^ -72227581;
                    continue block49;
                }
lbl97:
                // 1 sources

                var7_3 = (var5_2 | var8_1) ^ 877790630;
                ** GOTO lbl159
                case -448226700: {
                    var6_7 ^= var7_3 ^ 1847125756;
                    var7_3 = (var5_2 | var8_1) ^ 1943192045;
                }
            }
        }
lbl103:
        // 2 sources

        while (true) {
            var7_3 = (var5_2 | var8_1) ^ -834465471;
            ** GOTO lbl159
lbl106:
            // 1 sources

            while (true) {
                var7_3 = (var5_2 | var8_1) ^ 1681467778;
                ** GOTO lbl123
                break;
            }
lbl109:
            // 1 sources

            while (true) {
                var7_3 = (var5_2 | var8_1) ^ 1736812362;
                if (true) ** GOTO lbl159
                break;
            }
            break;
        }
        block53: while (true) {
            var7_3 = (var5_2 | var8_1) ^ -1494867770;
            if (true) ** GOTO lbl159
lbl115:
            // 1 sources

            while (true) {
                var6_7 ^= 1071812538;
                var4_6 = aH.paintAura(this.gd(), (Integer)this.c.getValue(), (Integer)this.b.getValue(), (Integer)this.a.getValue(), ((Float)this.b.getValue()).floatValue() / 100.0f);
                var7_3 = (var5_2 | var8_1) ^ -2004384273;
                ** continue;
                break;
            }
lbl120:
            // 1 sources

            while (true) {
                var6_7 ^= 1623903460;
                ** continue;
                break;
            }
lbl123:
            // 3 sources

            block56: while (true) {
                switch (var7_3) {
                    default: {
                        continue block56;
                    }
                    case -271375529: {
                        var6_7 ^= 2131040598;
                        ** continue;
                    }
                    case -1921267055: {
                        var6_7 ^= var7_3 ^ -473414549;
                        var7_3 = (var5_2 | var8_1) ^ 1707715029;
                        continue block56;
                    }
                    case 513893778: {
                        if (var2_5 - this.a >= (-6464510125170658596L << (var7_3 ^ 513893810) >>> (var7_3 ^ 513893810) ^ (long)var6_7 & 0xFFFFFFFFL | (-6464510125170658596L >>> (var7_3 ^ 513893810) ^ (long)var6_7 & 0xFFFFFFFFL) << (var7_3 ^ 513893810))) ** GOTO lbl10
                        var7_3 = (var5_2 | var8_1) ^ -1820150298;
                        continue block56;
                    }
                    case -68700662: {
                        if (this.a != null) ** break;
                        ** continue;
                        ** continue;
                    }
                    case 1763899263: {
                        var6_7 ^= var7_3 ^ -223272192;
                        var7_3 = (var5_2 | var8_1) ^ -450967171;
                        continue block56;
                    }
                    case 2059425525: {
                        var7_3 = (var5_2 | var8_1) ^ 5774053;
                        continue block56;
                    }
                    case 844776716: {
                        var6_7 ^= var7_3 ^ -587562509;
                        break;
                    }
                    case 2066798242: {
                        return;
                    }
                }
                var7_3 = (var5_2 | var8_1) ^ -248882144;
                continue;
                break;
            }
            block57: while (true) {
                var7_3 = (var5_2 | var8_1) ^ -1413302146;
lbl159:
                // 6 sources

                block58: while (true) {
                    switch (var7_3) {
                        default: {
                            continue block58;
                        }
                        case -1061848627: {
                            var2_5 = class_156.method_658();
                            var7_3 = (var5_2 | var8_1) ^ 2010875912;
                            ** continue;
                        }
                        case 2038224957: {
                            return;
                        }
                        case 715881169: {
                            var6_7 ^= var7_3 ^ 1861863323;
                            continue block57;
                        }
                        case -1205903439: {
                            var7_3 = (var5_2 | var8_1) ^ 563567334;
                            continue block58;
                        }
                        case 1064183185: {
                            if (var1_4 != this.a) ** GOTO lbl103
                            ** continue;
                        }
                        case -1850722503: {
                            var6_7 ^= var7_3 ^ 1276765586;
                            ** continue;
                        }
                        case -1254373623: {
                            if (this.a != null) ** break;
                            ** continue;
                            continue block53;
                        }
                        case -793088458: 
                    }
                    var6_7 ^= var7_3 ^ 1825315163;
                    var7_3 = (var5_2 | var8_1) ^ -565442886;
                }
                break;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block34: {
            break block34;
lbl1:
            // 2 sources

            while (true) {
                continue;
lbl3:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
                break;
            }
lbl5:
            // 1 sources

            while (true) {
                var7_3 = var9_1 ^ -1093141983;
                ** GOTO lbl96
                break;
            }
            var5_9 = (var0_4[var3_7] & (((var6_10 ^= -1209720927) | var9_1) ^ 2011101485)) << ((var6_10 | var9_1) ^ 2011101642) | (var0_4[var3_7 + 1] & ((var6_10 | var9_1) ^ 2011101485)) << ((var6_10 | var9_1) ^ 2011101634) | (var0_4[var3_7 + 2] & ((var6_10 | var9_1) ^ 2011101485)) << ((var6_10 | var9_1) ^ 2011101658) | var0_4[var3_7 + 3] & ((var6_10 | var9_1) ^ 2011101485);
            var7_3 = var9_1 ^ 659300409;
            block28: while (true) {
                block35: {
                    switch (var7_3) {
                        default: {
                            continue block28;
                        }
                        case 742778950: {
                            var6_10 ^= var7_3 ^ 701036271;
                            var7_3 = var9_1 ^ var8_2;
                            continue block28;
                        }
                        case 1368555: {
                            var6_10 ^= var7_3 ^ -1036644844;
                            var7_3 = var9_1 ^ -434139070;
                            continue block28;
                        }
                        case 1335012643: {
                            var6_10 ^= var7_3 ^ -794763741;
                            var7_3 = var9_1 ^ var10;
                            continue block28;
                        }
                        case -1052290672: {
                            ef.a[var4_8] = var5_9 ^= var2_6;
                            var7_3 = var9_1 ^ 1433060127;
                            continue block28;
                        }
                        case 1289342641: {
                            ef.c = 0.55f;
                            ef.b = 0.16f;
                            ef.b = 9007714038733460647L << (var7_3 ^ 1289342609) >>> (var7_3 ^ 1289342609) ^ (long)var6_10 & 0xFFFFFFFFL | (9007714038733460647L >>> (var7_3 ^ 1289342609) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ 1289342609);
                            ef.a = 4.0f;
                            ef.k = gj.decode("jHHXxVuhYxmDR5s=", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877902), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1078008601))));
                            ef.s = gj.decode("IW4TGuO8VgmhH2wjZ67vunKiOzVPowCOfS6WmyUnGQ==", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877903), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1692680505))));
                            ef.e = gj.decode("PEK1ubg=", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877896), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1417744956))));
                            ef.q = gj.decode("F+2effS3", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877897), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -2042004312))));
                            ef.n = gj.decode("NlIdU4gY", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877898), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1645295428))));
                            ef.z = gj.decode("R2orl1bo", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877899), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1360774451))));
                            ef.y = gj.decode("BDQQqNveNg==", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877908), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 503385294))));
                            ef.m = gj.decode("OWaHTDQ=", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877909), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1080339138))));
                            ef.c = gj.decode("Ypg/r9U=", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877910), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1255981680))));
                            ef.d = gj.decode("55x466eoKNI0kT2KotL9zZ22Cg1UjlDHGOeTmNPq0/T2hbPnLw==", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877911), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1270337167))));
                            ef.x = gj.decode("7EhYDEVGjQ84X30E", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877904), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 903291836))));
                            ef.b = gj.decode("zNN5elbuyutk8fs6TCh+38002746P6D6qJGSwVBSJOejKzYsMvDA+8CT", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877905), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 938059841))));
                            ef.v = gj.decode("Yo73uYOkEiM9", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877906), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1552162680))));
                            ef.r = gj.decode("UKYlzkw2", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877907), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1895419444))));
                            ef.u = gj.decode("CwdFb60Pv9DqdnuETBj/KAhEwxxpmLg=", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877916), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -369201671))));
                            ef.w = gj.decode("D/q+l5Hw7kdEGyHegg==", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877917), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1046806187))));
                            ef.l = gj.decode("YUgRW0XW", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877918), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1091082205))));
                            ef.o = gj.decode("3PC8C/C24Q==", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877919), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -677979755))));
                            ef.i = gj.decode("zdyIfp73GWmu", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877912), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 2003947024))));
                            ef.p = gj.decode("3L7yOuA=", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877913), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1732598028))));
                            ef.g = gj.decode("q8kgh5cXhlQpwzc1", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877914), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1672092557))));
                            ef.a = gj.decode("NyNpZGfugusl5yrR48IUan7AQFBXOL1AknmIAtk2Rv9cUDo=", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877915), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -312882485))));
                            ef.h = gj.decode("OIYEHdP58QdbmQ==", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877924), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 734926410))));
                            ef.f = gj.decode("KwQPOQ==", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877925), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 978386456))));
                            ef.t = gj.decode("+FuHjgRKTFtlJA==", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877926), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1216302775))));
                            ef.j = gj.decode("K5xSj+ZHrkg6", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877927), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1965477485))));
                            ef.A = gj.decode("w08PUl56ZYNDJfE=", ef.fW((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1472877920), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1869963795))));
                            var7_3 = var9_1 ^ 186460564;
                            continue block28;
                        }
                        case -1817602007: {
                            v0 = new int[]{ef.fW((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -2009129520), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 926928354))), ef.fW((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -2009129517), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1314342133))), ef.fW((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -2009129518), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -773785949))), ef.fW((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -2009129507), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1729607517))), ef.fW((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -2009129508), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 830547668)))};
                            v1 = gj.text(v0);
                            v2 = new int[ef.fW(((var6_10 ^= -1157299096) | var9_1) ^ -2087484962, var9_1 ^ ((var6_10 | var9_1) ^ -1480648338))];
                            v2[0] = ef.fW((var6_10 | var9_1) ^ -2087484961, var9_1 ^ ((var6_10 | var9_1) ^ 1225884790));
                            v2[1] = ef.fW((var6_10 | var9_1) ^ -2087484968, var9_1 ^ ((var6_10 | var9_1) ^ 707685537));
                            v2[2] = ef.fW((var6_10 | var9_1) ^ -2087484967, var9_1 ^ ((var6_10 | var9_1) ^ -2042864090));
                            v2[3] = ef.fW((var6_10 | var9_1) ^ -2087484966, var9_1 ^ ((var6_10 | var9_1) ^ 793344921));
                            v2[4] = ef.fW((var6_10 | var9_1) ^ -2087484965, var9_1 ^ ((var6_10 | var9_1) ^ -2082753031));
                            v2[5] = ef.fW((var6_10 | var9_1) ^ -2087484988, var9_1 ^ ((var6_10 | var9_1) ^ 319617909));
                            v2[ef.fW((int)((var6_10 | var9_1) ^ -2087484987), (int)(var9_1 ^ ((var6_10 | var9_1) ^ -1239786808)))] = ef.fW((var6_10 | var9_1) ^ -2087484986, var9_1 ^ ((var6_10 | var9_1) ^ -1692332849));
                            v2[ef.fW((int)((var6_10 | var9_1) ^ -2087484985), (int)(var9_1 ^ ((var6_10 | var9_1) ^ 831282624)))] = ef.fW((var6_10 | var9_1) ^ -2087484992, var9_1 ^ ((var6_10 | var9_1) ^ 1057506708));
                            v2[ef.fW((int)((var6_10 | var9_1) ^ -2087484991), (int)(var9_1 ^ ((var6_10 | var9_1) ^ -1480391665)))] = ef.fW((var6_10 | var9_1) ^ -2087484990, var9_1 ^ ((var6_10 | var9_1) ^ -2089919038));
                            v2[ef.fW((int)((var6_10 | var9_1) ^ -2087484989), (int)(var9_1 ^ ((var6_10 | var9_1) ^ 186158406)))] = ef.fW((var6_10 | var9_1) ^ -2087484980, var9_1 ^ ((var6_10 | var9_1) ^ -1422658152));
                            var6_10 ^= -1453477749;
                            ** continue;
                        }
                        case 2042643914: {
                            var3_7 += 4;
                            if (++var4_8 < var1_5) ** GOTO lbl1
                            break;
                        }
                        case 1915880141: {
                            var6_10 ^= var7_3 ^ 133558931;
                            break block35;
                        }
                    }
                    var7_3 = var9_1 ^ 1758096625;
                    continue;
                }
                var7_3 = var9_1 ^ 1587053592;
            }
lbl93:
            // 1 sources

            while (true) {
                var1_5 = var0_4.length / 4;
                var7_3 = var9_1 ^ 1050418215;
lbl96:
                // 2 sources

                block30: while (true) {
                    switch (var7_3) {
                        case -1718666253: {
                            var6_10 ^= var7_3 ^ 397251508;
                            ** break;
                        }
                        case 570132709: {
                            ef.a = new int[var1_5];
                            ** continue;
                        }
lbl104:
                        // 1 sources

                        var7_3 = var9_1 ^ -854981490;
                        default: {
                            continue block30;
                        }
                        case -363674276: {
                            var3_7 = 0;
                            var6_10 ^= -779110570;
                            var4_8 = 0;
                            ** continue;
                        }
                        case 432332277: 
                    }
                    var6_10 ^= var7_3 ^ 947947629;
                    var7_3 = var9_1 ^ 111364407;
                }
                break;
            }
        }
        var10 = 1803620195;
        var9_1 = 660128210;
        var8_2 = -1259251205;
        ef.c = mK.a(MethodHandles.lookup().lookupClass(), -94112370);
        var7_3 = 0;
        var6_10 = 1730514172;
        var7_3 = var9_1 ^ 986369024;
        block31: while (true) {
            switch (var7_3) {
                default: {
                    continue block31;
                }
                case -395785082: {
                    var2_6 = (var6_10 | var7_3 ^ -818934444) ^ (var7_3 ^ 899092118) ^ ef.c;
                    var6_10 ^= 1103013544;
                    var0_4 = "*\u0097IER\u00b8\u0013\u00a4\u0090\u00ac\u00d5<\u008e\u008a\u0098\u00bc\u00d7\u00d8\u0013P\u0006U\u00fa8\u00dd#\u00e5\u00fe\u00a7\u0017\u00be\u00fa\u0080\u0005\u00d3\u00c4kHE8\u00b4\u0085\u00c6\u00c2\u008a\u0005-\u00b7\u00a1j\u008f\u00efj\u00df\u00e5\u0096\u00f59M\u00a4m\u0097/\u0003\b\u0014\u00a1h\u008eU\u000fsy\u00d7\u00bfsH\u00d2\u00de\u00cc\u000er9\u00e3d\u0019\u00d0\u00d6^\u00be\u00aa\u00f7\u008aK\u00a85\u001e(\u00a2D\u001b\u00b0\u009bv\u0017\u00f7\u00d5\u00bdV\u00cf{uw\u00a2\u0085\u00fc[\u0089\u0093\u0007\u0081\u00f3M\u0001\u00a3\u00b1\u001a\u00cc\tC~@xO.Q\u00f7\u00eee\u009e\u00e6>\r\u00b0\u00b9\u00b7\u00e6j\u00cb\u001a\u0099\u00f3\u00b2rb\u00c4-\u00c5\u00a2\u0098d\u00cd\u001c\u0090\u00cd\u00a4r\u00f8P6\u00d0\u00e1\u00be\u0098M1\u00dd\u00a7\u00a4\u0096q\u00b5\u0096\u0011\u00d8\u00c0\u00b3\u008etR\u000f\u00c5\u00e4\u0085AQA\u0093\u0092xl\u00a8\u00c5\u009f\u00c6\u0005\u0095\u007f\u00c8\u0081\u008d\u00a6PJ\u00cc\u008dt\u00e7\u0095\u00e9\u00fc\u0091D\u00cb\\\u00ba<\u00c2".getBytes("ISO-8859-1");
                    var6_10 ^= -1429680011;
                    ** continue;
                }
                case -859368553: {
                    var6_10 ^= var7_3 ^ -598866930;
                    var7_3 = var9_1 ^ -818934444;
                    continue block31;
                }
                case 496111058: 
            }
            var7_3 = var9_1 ^ -341847483;
        }
lbl141:
        // 2 sources

        while (true) {
            ef.a = class_2960.method_60655((String)v1, (String)v3);
            return;
        }
        v3 = gj.text(v2);
        block33: while (true) {
            switch (var6_10) {
                case 1792310907: {
                    var6_10 ^= 106395361;
                    ** GOTO lbl141
                }
                case 1697222847: {
                    var6_10 ^= 29873454;
                    continue block33;
                }
            }
            break;
        }
        var6_10 ^= -762789225;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private int signature() {
        var5_1 = 1962129052;
        var2_2 = ef.c & 1962129052 ^ 1769521190;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ -348353277;
        var4_3 = (var2_2 | var5_1) ^ -635616162;
        block19: while (true) {
            switch (var4_3) {
                default: {
                    continue block19;
                }
                case -1235540286: {
                    var3_4 ^= var4_3 ^ -1033562525;
                    ** break;
                }
                case -1478053152: {
                    var4_3 = (var2_2 | var5_1) ^ -878653316;
                    continue block19;
                }
lbl16:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -1343431707;
                continue block19;
                case -770232997: 
            }
            break;
        }
        var1_5 = this.gd().ordinal();
        var4_3 = (var2_2 | var5_1) ^ -206678269;
        if (true) ** GOTO lbl24
        block20: while (true) {
            var4_3 = (var2_2 | var5_1) ^ 2042634235;
lbl24:
            // 2 sources

            block21: while (true) {
                switch (var4_3) {
                    default: {
                        continue block21;
                    }
                    case -1803062476: {
                        var3_4 ^= var4_3 ^ 1874484564;
                        var4_3 = (var2_2 | var5_1) ^ 446334084;
                        continue block21;
                    }
                    case 526493112: {
                        var1_5 = ef.fW((var3_4 | var4_3 ^ 1804735268) ^ (var4_3 ^ -1914956730), (var2_2 | var4_3 ^ 1804735268) ^ ((var3_4 | var4_3 ^ 1804735268) ^ (var4_3 ^ 2118553204))) * var1_5 + (Integer)this.b.getValue();
                        var4_3 = (var2_2 | var5_1) ^ -377715318;
                        continue block21;
                    }
                    case 2076018687: {
                        var1_5 = ef.fW((var3_4 | var4_3 ^ 256782691) ^ (var4_3 ^ -385057215), (var2_2 | var4_3 ^ 256782691) ^ ((var3_4 | var4_3 ^ 256782691) ^ (var4_3 ^ -1042220107))) * var1_5 + (Integer)this.c.getValue();
                        var4_3 = (var2_2 | var5_1) ^ 559847707;
                        continue block21;
                    }
                    case 71035205: {
                        var3_4 ^= var4_3 ^ 1310491006;
                        var4_3 = (var2_2 | var5_1) ^ -1099560904;
                        continue block21;
                    }
                    case 1966659920: {
                        var1_5 = ef.fW((var3_4 | var4_3 ^ 30109644) ^ (var4_3 ^ -293002845), (var2_2 | var4_3 ^ 30109644) ^ ((var3_4 | var4_3 ^ 30109644) ^ (var4_3 ^ 1077251499))) * var1_5 + Float.floatToIntBits(((Float)this.b.getValue()).floatValue());
                        continue block20;
                    }
                    case 1554345893: {
                        var3_4 ^= var4_3 ^ 952697314;
                        var4_3 = (var2_2 | var5_1) ^ 1654280966;
                        continue block21;
                    }
                    case -1098829888: {
                        var3_4 ^= var4_3 ^ 2019813555;
                        var4_3 = (var2_2 | var5_1) ^ 147009518;
                        continue block21;
                    }
                    case -1014104442: {
                        var1_5 = ef.fW((var3_4 | var4_3 ^ -1216460774) ^ (var4_3 ^ 1379421783), (var2_2 | var4_3 ^ -1216460774) ^ ((var3_4 | var4_3 ^ -1216460774) ^ (var4_3 ^ 399078563))) * var1_5 + Float.floatToIntBits(((Float)this.a.getValue()).floatValue());
                        var4_3 = (var2_2 | var5_1) ^ 1722677862;
                        continue block21;
                    }
                    case 1734439482: {
                        var1_5 = ef.fW((var3_4 | var4_3 ^ 328385702) ^ (var4_3 ^ 2127612837), (var2_2 | var4_3 ^ 328385702) ^ ((var3_4 | var4_3 ^ 328385702) ^ (var4_3 ^ -142734701))) * var1_5 + (Integer)this.a.getValue();
                        var4_3 = (var2_2 | var5_1) ^ -1015359106;
                        continue block21;
                    }
                    case 458624216: {
                        var3_4 ^= var4_3 ^ -1609753647;
                        var4_3 = (var2_2 | var5_1) ^ 1787497240;
                        continue block21;
                    }
                    case -1906990659: {
                        var3_4 ^= var4_3 ^ -99091564;
                        var4_3 = (var2_2 | var5_1) ^ 105279809;
                        continue block21;
                    }
                    case 393280934: 
                }
                break;
            }
            break;
        }
        return var1_5;
    }

    /*
     * Exception decompiling
     */
    private ec gd() {
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
    private static /* synthetic */ void ge(float var0, class_4587.class_4665 var1_1, class_4588 var2_2) {
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
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

