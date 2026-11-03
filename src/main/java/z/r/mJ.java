/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1293
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_5321
 *  org.lwjgl.nanovg.NVGColor
 *  org.lwjgl.nanovg.NVGPaint
 *  org.lwjgl.nanovg.NanoVG
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1293;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_5321;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NVGPaint;
import org.lwjgl.nanovg.NanoVG;
import z.r.H;
import z.r.W;
import z.r.ad;
import z.r.as;
import z.r.bq;
import z.r.eo;
import z.r.gF;
import z.r.gj;
import z.r.hc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class mJ {
    private static final /* synthetic */ String a;
    public static final int a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final List<String[]> a;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final NVGPaint a;
    private static final /* synthetic */ String j;
    private static final DateTimeFormatter a;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final int[] a;
    private static final NVGColor a;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final List<String[]> b;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final NVGColor b;
    private static final /* synthetic */ String w;
    private static final /* synthetic */ String x;
    private static final NVGColor c;
    private static final /* synthetic */ String y;
    private static final List<gF> c;
    private static final /* synthetic */ String z;
    private static final /* synthetic */ String A;
    private static final /* synthetic */ String B;
    private static final List<String[]> d;
    private static final /* synthetic */ String C;
    private static final /* synthetic */ String D;

    /*
     * Enabled aggressive block sorting
     */
    private mJ() {
        int n2 = a & 0x208EAB50 ^ 0x87C751E3;
        int n3 = (n2 | 0x208EAB50) ^ 0x34C49887;
        block4: while (true) {
            switch (n3) {
                case -1271597734: {
                    n3 ^= 0x189B29AD;
                    continue block4;
                }
                default: {
                    n3 ^= 0x6A176C61;
                    break block4;
                }
                case -1827970188: {
                    n3 ^= 0xFCD2BF15;
                }
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int fill(H h2) {
        int n2 = a & 0xC7DE0E91 ^ 0x26CD4B5F;
        int n3 = 0;
        int n4 = (n2 | 0xC7DE0E91) ^ 0xE4999A16;
        n3 = (n2 | 0xC7DE0E91) ^ 0xA0FB86BA;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 323492126: {
                    n4 ^= n3 ^ 0x580BCBE3;
                    n3 = (n2 | 0xC7DE0E91) ^ 0x408E4010;
                    continue block5;
                }
                case 1193593189: {
                    n3 = (n2 | 0xC7DE0E91) ^ 0xF49756C1;
                    continue block5;
                }
                case -1487859761: 
            }
            break;
        }
        return as.panel(h2);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static int fillDeep(H h2) {
        int n2 = a & 0x4979A933 ^ 0xCA4858B0;
        int n3 = 0;
        int n4 = (n2 | 0x4979A933) ^ 0x33E5E931;
        n3 = (n2 | 0x4979A933) ^ 0xC779DEF;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -694662107: {
                    n4 ^= n3 ^ 0x5FAA8619;
                    n3 = (n2 | 0x4979A933) ^ 0x148C1BB9;
                    continue block5;
                }
                case -955358116: {
                    n3 = (n2 | 0x4979A933) ^ 0x1DE1B596;
                    continue block5;
                }
                case -537533942: 
            }
            break;
        }
        return as.inset(h2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int stroke(H h2) {
        int n2 = a & 0x72338B60 ^ 0x55DAC2CD;
        int n3 = 0;
        int n4 = (n2 | 0x72338B60) ^ 0xDA3C764A;
        n3 = (n2 | 0x72338B60) ^ 0xB947C071;
        block5: while (true) {
            switch (n3) {
                case -826537060: {
                    n3 = (n2 | 0x72338B60) ^ 0x86A2475A;
                }
                default: {
                    continue block5;
                }
                case -245789513: {
                    n4 ^= n3 ^ 0xAF387DEA;
                    break;
                }
                case -2098446720: {
                    return as.border();
                }
            }
            n3 = (n2 | 0x72338B60) ^ 0xF517F56D;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void card(W var0, H var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        block10: {
            block11: {
                var10_7 = 1392229774;
                var7_8 = mJ.a & 1392229774 ^ 2056382209;
                var9_9 = 0;
                ** GOTO lbl14
lbl5:
                // 1 sources

                block7: while (true) {
                    var9_9 = (var7_8 | var10_7) ^ -659036137;
                    ** GOTO lbl10
lbl8:
                    // 1 sources

                    while (true) {
                        var9_9 = (var7_8 | var10_7) ^ -1775967825;
lbl10:
                        // 5 sources

                        block9: while (true) {
                            switch (var9_9) {
                                default: {
                                    continue block9;
                                }
lbl14:
                                // 1 sources

                                var8_10 = (var7_8 | var10_7) ^ -1241075305;
                                break block10;
                                case -320922080: {
                                    var8_10 ^= var9_9 ^ -1505284132;
                                    break block7;
                                }
                                case -1572071528: {
                                    var8_10 ^= var9_9 ^ -2135305385;
                                    break block11;
                                }
                                case 2035119642: {
                                    return;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                var9_9 = (var7_8 | var10_7) ^ -1260107922;
                ** GOTO lbl10
            }
            var9_9 = (var7_8 | var10_7) ^ 62294421;
            ** GOTO lbl10
        }
        var9_9 = (var7_8 | var10_7) ^ -297704858;
        ** while (true)
        {
            case -1799709207: {
                ** continue;
            }
            ** case -836781855:
        }
lbl35:
        // 1 sources

        as.largeCard(var0, var1_1, var2_2, var3_3, var4_4, var5_5);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    static {
        block73: {
            block60: {
                block75: {
                    block64: {
                        block63: {
                            block69: {
                                block76: {
                                    block70: {
                                        block61: {
                                            block62: {
                                                block65: {
                                                    block71: {
                                                        block72: {
                                                            block68: {
                                                                block74: {
                                                                    block66: {
                                                                        block67: {
                                                                            break block76;
lbl1:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var0_2 ^= -1557662364;
                                                                                break block60;
                                                                                break;
                                                                            }
lbl4:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var0_2 ^= 651827873;
                                                                                break block61;
                                                                                break;
                                                                            }
lbl7:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var1_1 = var2 ^ -454598051;
                                                                                ** GOTO lbl54
                                                                                break;
                                                                            }
lbl10:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                mJ.a = new int[((var0_2 ^= -563925794) | var2) ^ -620759258];
                                                                                break block61;
                                                                                break;
                                                                            }
lbl13:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var1_1 = var2 ^ -1286708501;
                                                                                ** GOTO lbl54
lbl16:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var1_1 = var2 ^ -1870046120;
                                                                                    ** GOTO lbl54
lbl19:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var0_2 ^= var1_1 ^ 1795377095;
                                                                                        ** GOTO lbl133
                                                                                        break;
                                                                                    }
lbl22:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
lbl24:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var1_1 = var2 ^ -24359367;
                                                                                ** GOTO lbl54
                                                                                break;
                                                                            }
                                                                            mJ.d = new ArrayList<E>();
                                                                            var1_1 = var2 ^ -422663162;
                                                                            ** GOTO lbl54
lbl30:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var0_2 ^= -85264598;
                                                                                break block62;
                                                                                break;
                                                                            }
lbl33:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                mJ.a = new ArrayList<E>();
                                                                                return;
                                                                            }
lbl36:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var1_1 = var2 ^ 2017653426;
                                                                                ** GOTO lbl54
                                                                                break;
                                                                            }
lbl39:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var0_2 ^= var1_1 ^ 158895610;
                                                                                break block63;
                                                                                break;
                                                                            }
lbl42:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var0_2 ^= 2124238328;
                                                                                break block64;
                                                                                break;
                                                                            }
lbl45:
                                                                            // 1 sources

                                                                            block41: while (true) {
                                                                                block77: {
                                                                                    var1_1 = var2 ^ 1462138519;
                                                                                    break block77;
lbl48:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var0_2 ^= var1_1 ^ 485184036;
                                                                                        ** continue;
                                                                                        break;
                                                                                    }
lbl51:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        mJ.b = new ArrayList<E>();
                                                                                        ** GOTO lbl138
                                                                                        break;
                                                                                    }
                                                                                }
lbl55:
                                                                                // 11 sources

                                                                                block44: while (true) {
                                                                                    block0 : switch (var1_1) lbl-1000:
                                                                                    // 5 sources

                                                                                    {
                                                                                        while (true) {
                                                                                            default: {
                                                                                                continue block44;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        case 2089621487: {
                                                                                            ** continue;
                                                                                        }
                                                                                        case 1773147373: {
                                                                                            ** continue;
                                                                                        }
                                                                                        case 1396901264: {
                                                                                            ** continue;
                                                                                        }
                                                                                        case 904501178: {
                                                                                            ** continue;
                                                                                        }
                                                                                        case 611465279: {
                                                                                            ** continue;
                                                                                        }
                                                                                        case -1945115793: {
                                                                                            ** continue;
                                                                                        }
                                                                                        case -1564703564: {
                                                                                            v0 = 0;
                                                                                            v1 = 0;
                                                                                            break block65;
                                                                                        }
lbl76:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            ** GOTO lbl125
                                                                                            break;
                                                                                        }
                                                                                        case 1441168780: {
                                                                                            var0_2 ^= var1_1 ^ 1547501753;
                                                                                            break block66;
                                                                                        }
lbl81:
                                                                                        // 1 sources

                                                                                        break block0;
lbl83:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var1_1 = var2 ^ 1618326028;
                                                                                            ** GOTO lbl-1000
                                                                                            break;
                                                                                        }
lbl86:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            mJ.a[v0] = ((v2[v1] & 255) << 24 | ((v2[v1 + 1] & 255) << 16 | ((v2[v1 + 2] & 255) << 8 | v2[v1 + 3] & 255))) ^ ((v3 | var2) ^ -360005734 ^ mJ.a);
                                                                                            v0 = v0 + 1;
                                                                                            v4 = v1 + 4;
                                                                                            v2 = v2;
                                                                                            v1 = v4;
                                                                                            ** continue;
                                                                                            break;
                                                                                        }
lbl95:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var0_2 ^= -1669867496;
                                                                                            break block67;
                                                                                            break;
                                                                                        }
lbl98:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var0_2 ^= -607873557;
                                                                                            break block68;
                                                                                            break;
                                                                                        }
                                                                                        case 1855315062: {
                                                                                            mJ.a = NVGPaint.create();
                                                                                            ** continue;
                                                                                        }
lbl104:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var1_1 = var2 ^ 979898848;
                                                                                            ** GOTO lbl-1000
                                                                                            break;
                                                                                        }
                                                                                        case 1041831003: {
                                                                                            var0_2 ^= var1_1 ^ 541162442;
                                                                                            break block69;
                                                                                        }
                                                                                        case -1415505209: {
                                                                                            mJ.a = DateTimeFormatter.ofPattern(mJ.e);
                                                                                            break block41;
                                                                                        }
                                                                                        case 1249323614: {
                                                                                            var0_2 ^= var1_1 ^ 8863500;
                                                                                            break block70;
                                                                                        }
                                                                                        case 267924931: {
                                                                                            mJ.b = NVGColor.create();
                                                                                            break block71;
                                                                                        }
                                                                                        case 863429613: {
                                                                                            mJ.c = new ArrayList<E>();
                                                                                            ** continue;
                                                                                        }
lbl122:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            v2 = "\u00ae\u00af\\&Y\u00afyH\u00d9\u008e\u00ec\u00842\u0091\u00d6\u0086F\u00c0\u00a7\u0016\u00e1&\u00d0:\u00f5\u00bb\u000b\u0013 \u00e1y\u008f\u00c9ln\u0094\u00b1gi\u00e1~\u0081\u00e0\bl\u0092\u00cb\u00b3\u00dd\u008f\u0085o=\t\u008a\u00fekx\u00b9\u000er=\u00e7f\u00c7b\u00022\u00e5j\u000b\t\u00d8\u00ad\u00a2\u00a0\u001e\u00a9\u00ca\u00cd*\u00b2K=}\u00deSy\u001c\u001f\u001b\u00b3+^3\u00ecBk)\u001b\u0080\u0014\u00ecz\u00bbi\u00a9\u0098\u00ce\u0013\u0086\u00ba\u00bd\u0084\u00f9^\u00b7e\u00f7>5\u0089\u001b\u00aa\u00f0\u0016\u00b1\t\u00b3\u001c9\u0081\u00ad\u0011\u00ffx\u00a6zv\u00d0&b\u0001A\u0090\u00e8\u00fb\u00bb\u0011\u00f30b\f\u00e4cRr\u00df\u0010\u0094\u0096%\u001f\u009c\u00d9\u000e\u00c0:\u00fa}\u007f\u00ca\u00ec.-\u00dd\u009c\u0096\u00fb\u0091\r\u00ed\u00a3S9\u00b6\u00c9\u00d0\u00b4\u0097\u00e3\u0095\u00cb\u00de\u00a9\u00b30\u00d9\u001d{\u00ab\u00e8\u00f9\tI!a\u0083\u00f3\u0090\u00c2\u0097\u00a8\u001c\u00ff\u009d\u00e9Q\u008e\u00e9\u00a1\u00dd\u00056\u00ce\u00aa2\u00ce\u00eeoh\u00a4\u0087t\u0000\u0005\u00fd\u001c\u000b~\u00df\u0000\u00c6\u008a\u0086D\u00c1\u0006N\u008d{\u00c9\u00f8=\u00f4th\u00d9V\u009b".getBytes("ISO-8859-1");
                                                                                            break block72;
                                                                                            break;
                                                                                        }
lbl125:
                                                                                        // 1 sources

                                                                                        v3 = var0_2 ^= 435570958;
                                                                                        break block73;
                                                                                        case 1009834496: {
                                                                                            var0_2 ^= var1_1 ^ 1360004016;
                                                                                            break block74;
                                                                                        }
lbl130:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var0_2 ^= 1446876729;
                                                                                            ** GOTO lbl122
                                                                                            break;
                                                                                        }
lbl133:
                                                                                        // 1 sources

                                                                                        var1_1 = var2 ^ -1268012432;
                                                                                        ** GOTO lbl-1000
                                                                                        case -407323037: {
                                                                                            var0_2 ^= var1_1 ^ -1950627817;
                                                                                            ** continue;
                                                                                        }
lbl138:
                                                                                        // 1 sources

                                                                                        var1_1 = var2 ^ 1028048997;
                                                                                        ** continue;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                            var1_1 = var2 ^ -834112227;
                                                                            ** GOTO lbl55
                                                                        }
                                                                        ** while (true)
                                                                    }
                                                                    var1_1 = var2 ^ 1902079169;
                                                                    ** GOTO lbl55
                                                                    {
                                                                        case -527013914: {
                                                                            var0_2 ^= var1_1 ^ 13032914;
                                                                            ** continue;
                                                                        }
                                                                    }
lbl150:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var0_2 ^= -1642682917;
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var1_1 = var2 ^ -1984072810;
                                                                ** GOTO lbl55
                                                            }
                                                            ** while (true)
                                                        }
lbl159:
                                                        // 2 sources

                                                        while (true) {
                                                            var0_2 ^= -1990637935;
                                                            break block75;
                                                            break;
                                                        }
                                                    }
                                                    var1_1 = var2 ^ -283647556;
                                                    ** GOTO lbl55
                                                }
                                                ** while (true)
                                                {
                                                    case 971913128: {
                                                        mJ.a = NVGColor.create();
                                                        ** continue;
                                                    }
                                                }
                                            }
                                            ** while (true)
                                        }
                                        switch (var0_2) {
                                            default: {
                                                ** continue;
                                            }
                                            case -1594116849: {
                                                ** continue;
                                            }
                                            ** case 1249244513:
lbl179:
                                            // 1 sources

                                            ** continue;
                                        }
                                    }
                                    var1_1 = var2 ^ 1458673001;
                                    ** GOTO lbl55
                                }
                                var2 = -620857850;
                                mJ.a = mK.a(MethodHandles.lookup().lookupClass(), -782618365);
                                var1_1 = 0;
                                var0_2 = -1399868508;
                                ** while (true)
lbl189:
                                // 1 sources

                                while (true) {
                                    var1_1 = var2 ^ -1502387735;
                                    ** GOTO lbl55
                                    break;
                                }
                            }
                            var1_1 = var2 ^ -376924693;
                            ** GOTO lbl55
                        }
                        var1_1 = var2 ^ -485473874;
                        ** GOTO lbl55
lbl198:
                        // 1 sources

                        while (true) {
                            ** continue;
                            break;
                        }
                    }
                    ** while (v4 < v2.length)
lbl203:
                    // 1 sources

                    ** while (true)
                    {
                        case -1915223919: {
                            ** continue;
                        }
                    }
                    mJ.B = gj.decode("xRnYazQ=", mJ.AS(((var0_2 ^= -859830971) | var2) ^ 986457852, var2 ^ ((var0_2 | var2) ^ 302048512)));
                    mJ.h = gj.decode("b7Bc2Q==", mJ.AS((var0_2 | var2) ^ 986457851, var2 ^ ((var0_2 | var2) ^ -1308827086)));
                    mJ.z = gj.decode("pDk=", mJ.AS((var0_2 | var2) ^ 986457850, var2 ^ ((var0_2 | var2) ^ -373239438)));
                    mJ.t = gj.decode("Opi0", mJ.AS((var0_2 | var2) ^ 986457849, var2 ^ ((var0_2 | var2) ^ 1540667218)));
                    mJ.p = gj.decode("U99Y", mJ.AS((var0_2 | var2) ^ 986457848, var2 ^ ((var0_2 | var2) ^ 211488975)));
                    mJ.c = gj.decode("bBNojQ==", mJ.AS((var0_2 | var2) ^ 986457847, var2 ^ ((var0_2 | var2) ^ 681449723)));
                    mJ.d = gj.decode("3hI=", mJ.AS((var0_2 | var2) ^ 986457846, var2 ^ ((var0_2 | var2) ^ 994881312)));
                    mJ.C = gj.decode("SeMV", mJ.AS((var0_2 | var2) ^ 986457845, var2 ^ ((var0_2 | var2) ^ 1506829005)));
                    mJ.n = gj.decode("SwJ5TQ==", mJ.AS((var0_2 | var2) ^ 986457844, var2 ^ ((var0_2 | var2) ^ -776869033)));
                    mJ.m = gj.decode("psK2", mJ.AS((var0_2 | var2) ^ 986457843, var2 ^ ((var0_2 | var2) ^ -1602732232)));
                    mJ.i = gj.decode("fw==", mJ.AS((var0_2 | var2) ^ 986457842, var2 ^ ((var0_2 | var2) ^ -1531668789)));
                    mJ.b = gj.decode("Hw==", mJ.AS((var0_2 | var2) ^ 986457841, var2 ^ ((var0_2 | var2) ^ 1979741621)));
                    mJ.q = gj.decode("dA==", mJ.AS((var0_2 | var2) ^ 986457840, var2 ^ ((var0_2 | var2) ^ -552726009)));
                    mJ.D = gj.decode("SwLr/a+f", mJ.AS((var0_2 | var2) ^ 986457839, var2 ^ ((var0_2 | var2) ^ -2134088855)));
                    mJ.g = gj.decode("5aFtdQ==", mJ.AS((var0_2 | var2) ^ 986457838, var2 ^ ((var0_2 | var2) ^ -478139554)));
                    mJ.o = gj.decode("RgTEz2E=", mJ.AS((var0_2 | var2) ^ 986457837, var2 ^ ((var0_2 | var2) ^ 292927384)));
                    mJ.j = gj.decode("nJ+wSN9OqrDK0g==", mJ.AS((var0_2 | var2) ^ 986457836, var2 ^ ((var0_2 | var2) ^ 125937913)));
                    mJ.w = gj.decode("Bhd4NzL7OIH8", mJ.AS((var0_2 | var2) ^ 986457835, var2 ^ ((var0_2 | var2) ^ 79928176)));
                    mJ.k = gj.decode("98GZq2UW", mJ.AS((var0_2 | var2) ^ 986457834, var2 ^ ((var0_2 | var2) ^ -208469978)));
                    mJ.v = gj.decode("26bq+yg1", mJ.AS((var0_2 | var2) ^ 986457833, var2 ^ ((var0_2 | var2) ^ -1634441859)));
                    mJ.r = gj.decode("G81Jidko", mJ.AS((var0_2 | var2) ^ 986457832, var2 ^ ((var0_2 | var2) ^ 494626706)));
                    mJ.x = gj.decode("8dT7L8673lU0ow==", mJ.AS((var0_2 | var2) ^ 986457831, var2 ^ ((var0_2 | var2) ^ -211629128)));
                    mJ.A = gj.decode("XdCoubBg", mJ.AS((var0_2 | var2) ^ 986457830, var2 ^ ((var0_2 | var2) ^ -304144173)));
                    mJ.a = gj.decode("jCCGIQfu", mJ.AS((var0_2 | var2) ^ 986457829, var2 ^ ((var0_2 | var2) ^ -1248730432)));
                    mJ.y = gj.decode("QAeMIb+P4w==", mJ.AS((var0_2 | var2) ^ 986457828, var2 ^ ((var0_2 | var2) ^ -1472510304)));
                    mJ.l = gj.decode("uaLIc5E=", mJ.AS((var0_2 | var2) ^ 986457827, var2 ^ ((var0_2 | var2) ^ 500377432)));
                    mJ.s = gj.decode("YpHqhQ==", mJ.AS((var0_2 | var2) ^ 986457826, var2 ^ ((var0_2 | var2) ^ 801861727)));
                    mJ.u = gj.decode("5w==", mJ.AS((var0_2 | var2) ^ 986457825, var2 ^ ((var0_2 | var2) ^ 464959838)));
                    mJ.f = gj.decode("2LQi5g==", mJ.AS((var0_2 | var2) ^ 986457824, var2 ^ ((var0_2 | var2) ^ -754242454)));
                    mJ.e = gj.decode("HPVnfNKJCVU=", mJ.AS((var0_2 | var2) ^ 986457759, var2 ^ ((var0_2 | var2) ^ -1250678075)));
                    var1_1 = var2 ^ -1894249590;
                    ** GOTO lbl55
                    {
                        case -1165245430: {
                            mJ.c = NVGColor.create();
                            ** continue;
                        }
                    }
lbl241:
                    // 1 sources

                    while (true) {
                        var1_1 = var2 ^ -721009723;
                        ** continue;
                        break;
                    }
                }
                var0_2 ^= -1269736653;
                ** while (true)
            }
            ** while (true)
        }
        var0_2 ^= 1142773481;
        ** while (true)
        {
            ** case 347472667:
        }
lbl253:
        // 1 sources

        var0_2 ^= var1_1 ^ -1076137839;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static NVGColor AP(int var0, NVGColor var1_1) {
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
    public static void begin(W var0, float var1_1, float var2_2, float var3_3) {
        block54: {
            block57: {
                block59: {
                    block58: {
                        block56: {
                            block55: {
                                block60: {
                                    break block60;
lbl1:
                                    // 2 sources

                                    while (true) {
                                        var6_6 = (var4_5 | var7_4) ^ -1322143608;
                                        break block54;
                                        break;
                                    }
lbl4:
                                    // 1 sources

                                    while (true) {
                                        var6_6 = (var4_5 | var7_4) ^ 1382453776;
                                        break block54;
                                        break;
                                    }
                                }
                                var7_4 = -2080256296;
                                var4_5 = mJ.a & -2080256296 ^ 105888089;
                                var6_6 = 0;
                                var5_7 = (var4_5 | var7_4) ^ -101727762;
                                ** GOTO lbl39
lbl13:
                                // 1 sources

                                while (true) {
                                    var5_7 ^= var6_6 ^ -864979866;
                                    break block55;
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var5_7 ^= var6_6 ^ 1402647539;
                                    break block56;
                                    break;
                                }
lbl19:
                                // 1 sources

                                while (true) {
                                    var5_7 ^= var6_6 ^ -967486733;
                                    ** GOTO lbl1
                                    break;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    var6_6 = (var4_5 | var7_4) ^ 1951776383;
                                    break block54;
                                    break;
                                }
lbl25:
                                // 1 sources

                                block35: while (true) {
                                    switch (var5_7) {
                                        case 1469773457: {
                                            var6_6 = (var4_5 | var7_4) ^ 1754619187;
                                            break block35;
                                        }
lbl30:
                                        // 1 sources

                                        while (true) {
                                            var5_7 ^= var6_6 ^ -349204347;
                                            break block56;
                                            break;
                                        }
lbl33:
                                        // 1 sources

                                        while (true) {
                                            var6_6 = (var4_5 | var7_4) ^ 1131882894;
                                            break block35;
                                            break;
                                        }
lbl36:
                                        // 1 sources

                                        while (true) {
                                            var5_7 ^= var6_6 ^ -307713122;
                                            break block57;
                                            break;
                                        }
lbl39:
                                        // 1 sources

                                        var6_6 = (var4_5 | var7_4) ^ -1295469693;
                                        break block35;
lbl41:
                                        // 1 sources

                                        while (true) {
                                            var6_6 = (var4_5 | var7_4) ^ 570315506;
                                            break block35;
                                            break;
                                        }
lbl44:
                                        // 1 sources

                                        while (true) {
                                            var6_6 = (var4_5 | var7_4) ^ 1918125420;
                                            break block35;
                                            break;
                                        }
                                        default: {
                                            var6_6 = (var4_5 | var7_4) ^ -971323709;
                                            break block35;
                                        }
lbl50:
                                        // 1 sources

                                        while (true) {
                                            var5_7 ^= var6_6 ^ -461977203;
                                            break block55;
                                            break;
                                        }
lbl53:
                                        // 1 sources

                                        while (true) {
                                            var0.translate(var1_1, var2_2);
                                            ** continue;
                                            break;
                                        }
lbl56:
                                        // 1 sources

                                        return;
lbl58:
                                        // 1 sources

                                        while (true) {
                                            var6_6 = (var4_5 | var7_4) ^ -511711143;
                                            break block35;
                                            break;
                                        }
lbl61:
                                        // 1 sources

                                        while (true) {
                                            var5_7 ^= var6_6 ^ -1379992922;
                                            break block58;
                                            break;
                                        }
                                        case -706148839: {
                                            var6_6 = (var4_5 | var7_4) ^ 1661850113;
                                            break block35;
                                        }
                                    }
                                    break;
                                }
                                break block54;
lbl68:
                                // 1 sources

                                while (true) {
                                    var5_7 ^= var6_6 ^ -83451864;
                                    break block59;
                                    break;
                                }
lbl71:
                                // 1 sources

                                while (true) {
                                    var6_6 = (var4_5 | var7_4) ^ 600885283;
                                    break block54;
lbl74:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    break;
                                }
lbl76:
                                // 1 sources

                                while (true) {
                                    var6_6 = (var4_5 | var7_4) ^ -479984238;
                                    break block54;
                                    break;
                                }
                            }
                            var6_6 = (var4_5 | var7_4) ^ 251617184;
                            break block54;
                        }
                        var6_6 = (var4_5 | var7_4) ^ 727717040;
                        break block54;
                    }
                    var6_6 = (var4_5 | var7_4) ^ -1777134419;
                    break block54;
lbl88:
                    // 1 sources

                    while (true) {
                        var0.scaleCanvas(var3_3, 0.0f, 0.0f);
                        ** continue;
                        break;
                    }
                }
                var6_6 = (var4_5 | var7_4) ^ -346548111;
                break block54;
lbl94:
                // 1 sources

                while (true) {
                    switch (var5_7) {
                        case 87937125: {
                            ** continue;
                        }
                        default: {
                            ** continue;
                        }
                        ** case 588722996:
lbl101:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
lbl103:
            // 2 sources

            while (true) {
                var6_6 = (var4_5 | var7_4) ^ 50994991;
                break block54;
                break;
            }
            var0.save();
            var6_6 = (var4_5 | var7_4) ^ -871190346;
        }
        block53: while (true) {
            switch (var6_6) {
                default: {
                    continue block53;
                }
                case 1731204992: {
                    ** continue;
                }
                case 1697380939: {
                    ** continue;
                }
                case -287661334: {
                    ** continue;
                }
                case -735482423: {
                    ** continue;
                }
                case -2059017994: {
                    ** continue;
                }
                case 881282138: {
                    ** continue;
                }
                case -448647720: {
                    ** continue;
                }
                case -1389368471: {
                    ** continue;
                }
                case 1247629167: {
                    ** continue;
                }
                case 1079327002: {
                    ** continue;
                }
                case -986130857: {
                    ** continue;
                }
                case -1516292102: {
                    ** continue;
                }
                case -199509323: {
                    ** continue;
                }
                case -233160282: {
                    ** continue;
                }
                case -1481528021: {
                    ** continue;
                }
                case 1830283176: {
                    ** continue;
                }
                case -2001690503: {
                    ** continue;
                }
                case 274525044: {
                    ** continue;
                }
                ** case 931024721:
lbl150:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void locationMarker(W var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        block17: {
            var10_7 = -1637069830;
            var7_8 = mJ.a & -1637069830 ^ 194908940;
            var9_9 = 0;
            ** GOTO lbl25
lbl5:
            // 1 sources

            while (true) {
                var9_9 = (var7_8 | var10_7) ^ 1196376509;
                ** GOTO lbl16
lbl8:
                // 1 sources

                while (true) {
                    var8_10 ^= var9_9 ^ -2104739303;
                    break block17;
                    break;
                }
                break;
            }
lbl11:
            // 1 sources

            block11: while (true) {
                var9_9 = (var7_8 | var10_7) ^ 440844166;
                if (true) ** GOTO lbl16
                block12: while (true) {
                    var9_9 = (var7_8 | var10_7) ^ -832734346;
lbl16:
                    // 6 sources

                    block13: while (true) {
                        switch (var9_9) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block13;
                                }
                                break;
                            }
                            case -659482045: {
                                break block11;
                            }
                            case -1215536394: {
                                ** continue;
                            }
lbl25:
                            // 1 sources

                            var8_10 = (var7_8 | var10_7) ^ 2010880299;
                            ** continue;
lbl27:
                            // 1 sources

                            while (true) {
                                var9_9 = (var7_8 | var10_7) ^ -1992567019;
                                ** continue;
                                break;
                            }
                            case -1740515946: {
                                var8_10 ^= var9_9 ^ 291185172;
                                continue block12;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            var9_9 = (var7_8 | var10_7) ^ 129994344;
            ** GOTO lbl16
            {
                case -2051480456: {
                    return;
                }
            }
lbl37:
            // 1 sources

            while (true) {
                var9_9 = (var7_8 | var10_7) ^ 678574344;
                ** GOTO lbl16
                break;
            }
            {
                case -701426405: {
                    mJ.locationDot(var0, var1_1, var2_2, var4_4, var6_6);
                    ** continue;
                }
                case 382045419: {
                    var8_10 ^= var9_9 ^ -284601855;
                    ** continue;
                }
            }
        }
        var9_9 = (var7_8 | var10_7) ^ 1238322917;
        ** while (true)
        {
            ** case 1369645192:
        }
lbl50:
        // 1 sources

        mJ.viewCone(var0, var1_1, var2_2, var3_3, var5_5, var6_6);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static void viewCone(W var0, float var1_1, float var2_2, float var3_3, float var4_4, int var5_5) {
        block39: {
            block38: {
                break block39;
lbl1:
                // 1 sources

                while (true) {
                    NanoVG.nvgSave((long)var6_12);
                    var10_11 = (var8_10 | var14_6) ^ -1308749041;
                    ** GOTO lbl13
                    break;
                }
lbl5:
                // 2 sources

                block24: while (true) {
                    switch (var10_11) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block24;
                            }
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            NanoVG.nvgTranslate((long)var6_12, (float)var1_1, (float)var2_2);
                            ** GOTO lbl25
                            break;
                        }
lbl13:
                        // 14 sources

                        block27: while (true) {
                            switch (var10_11) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    default: {
                                        continue block27;
                                    }
                                    break;
                                }
                                case -665110094: {
                                    ** continue;
                                }
                                case -503148014: {
                                    ** continue;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    var10_11 = (var8_10 | var14_6) ^ -842741060;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl25:
                                // 1 sources

                                var10_11 = (var8_10 | var14_6) ^ 1090520722;
                                ** continue;
                                case -1043534400: {
                                    var9_13 ^= var10_11 ^ 1226441578;
                                    break;
                                }
                                case 632607947: {
                                    mJ.AQ(var6_12, var4_4, 0.55f, var5_5 & mJ.AS((var9_13 | var10_11 ^ var11_9) ^ (var10_11 ^ 176059005), (var8_10 | var10_11 ^ var11_9) ^ ((var9_13 | var10_11 ^ var11_9) ^ (var10_11 ^ -918944565))) | mJ.AS((var9_13 | var10_11 ^ var11_9) ^ (var10_11 ^ 176059006), (var8_10 | var10_11 ^ var11_9) ^ ((var9_13 | var10_11 ^ var11_9) ^ (var10_11 ^ -1948480222))), var5_5 & mJ.AS((var9_13 | var10_11 ^ var11_9) ^ (var10_11 ^ 176059007), (var8_10 | var10_11 ^ var11_9) ^ ((var9_13 | var10_11 ^ var11_9) ^ (var10_11 ^ 349152923))));
                                    ** continue;
                                }
                                case -1816521385: {
                                    var9_13 ^= var10_11 ^ -213171975;
                                    ** GOTO lbl72
                                }
                                case -105262064: {
                                    mJ.AQ(var6_12, var4_4 * 0.94f, 0.26f, var5_5 & mJ.AS((var9_13 | var10_11 ^ var12_8) ^ (var10_11 ^ -156081657), (var8_10 | var10_11 ^ var12_8) ^ ((var9_13 | var10_11 ^ var12_8) ^ (var10_11 ^ 1495201855))) | mJ.AS((var9_13 | var10_11 ^ var12_8) ^ (var10_11 ^ -156081658), (var8_10 | var10_11 ^ var12_8) ^ ((var9_13 | var10_11 ^ var12_8) ^ (var10_11 ^ 1788409772))), var5_5 & mJ.AS((var9_13 | var10_11 ^ var12_8) ^ (var10_11 ^ -156081659), (var8_10 | var10_11 ^ var12_8) ^ ((var9_13 | var10_11 ^ var12_8) ^ (var10_11 ^ -269892516))));
                                    break block27;
                                }
                                case 804146296: {
                                    break block24;
                                }
                                case -115562594: {
                                    NanoVG.nvgRotate((long)var6_12, (float)var3_3);
                                    ** GOTO lbl79
                                }
                            }
                            break;
                        }
                        var10_11 = (var8_10 | var14_6) ^ 1681704981;
                        ** GOTO lbl13
lbl46:
                        // 1 sources

                        while (true) {
                            var10_11 = (var8_10 | var14_6) ^ -103304918;
                            ** continue;
                            break;
                        }
                        {
                            case -385864884: {
                                NanoVG.nvgRestore((long)var6_12);
                                ** GOTO lbl74
                            }
                        }
lbl52:
                        // 1 sources

                        while (true) {
                            var10_11 = (var8_10 | var14_6) ^ 1702452475;
                            ** GOTO lbl13
                            break;
                        }
                        {
                            case 1139492242: {
                                var9_13 ^= var10_11 ^ -1329048296;
                                break block38;
                            }
                        }
lbl58:
                        // 1 sources

                        while (true) {
                            var10_11 = (var8_10 | var14_6) ^ -2044336551;
                            ** GOTO lbl13
                            break;
                        }
lbl61:
                        // 1 sources

                        while (true) {
                            var10_11 = (var8_10 | var14_6) ^ -1132704263;
                            ** GOTO lbl13
                            break;
                        }
                        {
                            case 977410046: {
                                var9_13 ^= var10_11 ^ 1994864444;
                                ** GOTO lbl70
                            }
                        }
lbl67:
                        // 1 sources

                        while (true) {
                            var10_11 = (var8_10 | var14_6) ^ 910014577;
                            ** GOTO lbl13
                            break;
                        }
lbl70:
                        // 1 sources

                        var10_11 = (var8_10 | var14_6) ^ -1216416601;
                        ** GOTO lbl13
lbl72:
                        // 1 sources

                        var10_11 = (var8_10 | var14_6) ^ -1480127493;
                        ** GOTO lbl13
lbl74:
                        // 1 sources

                        var10_11 = (var8_10 | var14_6) ^ 496343673;
                        ** GOTO lbl13
                        case -1034484430: {
                            var9_13 ^= var10_11 ^ -148830600;
                            ** continue;
                        }
lbl79:
                        // 1 sources

                        var10_11 = (var8_10 | var14_6) ^ -2082294876;
                        ** GOTO lbl13
lbl81:
                        // 1 sources

                        while (true) {
                            var10_11 = (var8_10 | var14_6) ^ -1486718859;
                            ** GOTO lbl13
                            break;
                        }
lbl84:
                        // 1 sources

                        while (true) {
                            var10_11 = (var8_10 | var14_6) ^ -1615711701;
                            ** GOTO lbl13
                            break;
                        }
                        {
                            case -1721506617: {
                                return;
                            }
                            case 990348048: {
                                var9_13 ^= var10_11 ^ -187593455;
                                ** continue;
                            }
                        }
                    }
                    break;
                }
                var10_11 = (var8_10 | var14_6) ^ -1674978599;
                ** GOTO lbl5
                {
                    case -276771612: {
                        var9_13 ^= var10_11 ^ -1163842319;
                        ** continue;
                    }
                }
lbl97:
                // 1 sources

                while (true) {
                    var10_11 = (var8_10 | var14_6) ^ 1905300371;
                    ** continue;
                    break;
                }
                {
                    case 1749247898: {
                        mJ.AQ(var6_12, var4_4 * 1.08f, 0.6f, mJ.AS((var9_13 | var10_11 ^ var13_7) ^ (var10_11 ^ -951096958), (var8_10 | var10_11 ^ var13_7) ^ ((var9_13 | var10_11 ^ var13_7) ^ (var10_11 ^ -226163350))), mJ.AS((var9_13 | var10_11 ^ var13_7) ^ (var10_11 ^ -951096947), (var8_10 | var10_11 ^ var13_7) ^ ((var9_13 | var10_11 ^ var13_7) ^ (var10_11 ^ 2097681022))));
                        ** continue;
                    }
                    case 528406905: {
                        var9_13 ^= var10_11 ^ 1818894466;
                        ** continue;
                    }
                }
                var10_11 = (var8_10 | var14_6) ^ 2076838688;
                ** GOTO lbl13
            }
            var10_11 = (var8_10 | var14_6) ^ -954385620;
            ** while (true)
            {
                ** case -1482068287:
            }
lbl112:
            // 1 sources

            var6_12 = var0.a;
            ** while (true)
            {
                ** case -576951217:
            }
lbl115:
            // 1 sources

            var9_13 ^= var10_11 ^ 894288481;
            ** while (true)
        }
        var14_6 = 1312311051;
        var13_7 = 645603473;
        var12_8 = -1216244965;
        var11_9 = 1804374976;
        var8_10 = mJ.a & 1312311051 ^ 1347854315;
        var10_11 = 0;
        var9_13 = (var8_10 | var14_6) ^ 1697463639;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static void AQ(long var0, float var2_1, float var3_2, int var4_3, int var5_4) {
        block39: {
            block38: {
                break block39;
lbl1:
                // 1 sources

                while (true) {
                    var8_7 = (var6_6 | var9_5) ^ -1692370063;
                    ** GOTO lbl31
lbl4:
                    // 1 sources

                    return;
lbl6:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    block41: {
                        block37: {
                            var8_7 = (var6_6 | var9_5) ^ -2123547284;
                            ** GOTO lbl31
lbl13:
                            // 1 sources

                            while (true) {
                                var8_7 = (var6_6 | var9_5) ^ 2050345200;
                                ** GOTO lbl31
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var8_7 = (var6_6 | var9_5) ^ 400628004;
                                ** GOTO lbl31
lbl19:
                                // 1 sources

                                while (true) {
                                    var8_7 = (var6_6 | var9_5) ^ -1730643958;
                                    ** GOTO lbl31
lbl22:
                                    // 1 sources

                                    while (true) {
                                        var7_8 ^= var8_7 ^ 66823247;
                                        ** GOTO lbl51
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
lbl25:
                            // 1 sources

                            block30: while (true) {
                                block40: {
                                    var8_7 = (var6_6 | var9_5) ^ -1852876311;
                                    break block40;
lbl28:
                                    // 1 sources

                                    while (true) {
                                        var7_8 ^= var8_7 ^ 1831399022;
                                        ** GOTO lbl49
                                        break;
                                    }
                                }
lbl32:
                                // 10 sources

                                block32: while (true) {
                                    switch (var8_7) lbl-1000:
                                    // 5 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block32;
                                            }
                                            break;
                                        }
                                        case -636556041: {
                                            ** continue;
                                        }
                                        case 1310944240: {
                                            ** continue;
                                        }
                                        case -402332088: {
                                            ** continue;
                                        }
                                        case 2122891776: {
                                            break;
                                        }
                                        case -1042173741: {
                                            ** continue;
                                        }
                                        case 1899691131: {
                                            ** continue;
                                        }
lbl49:
                                        // 1 sources

                                        var8_7 = (var6_6 | var9_5) ^ -154488478;
                                        ** GOTO lbl-1000
lbl51:
                                        // 1 sources

                                        var8_7 = (var6_6 | var9_5) ^ -1218437732;
                                        ** GOTO lbl-1000
                                        case -1860153892: {
                                            var7_8 ^= var8_7 ^ 1759484549;
                                            break block30;
                                        }
lbl56:
                                        // 1 sources

                                        while (true) {
                                            var8_7 = (var6_6 | var9_5) ^ 1858450096;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case 1732085606: {
                                            NanoVG.nvgClosePath((long)var0);
                                            break block37;
                                        }
                                        case 2019449918: {
                                            var7_8 ^= var8_7 ^ -414484002;
                                            ** continue;
                                        }
lbl65:
                                        // 1 sources

                                        while (true) {
                                            var8_7 = (var6_6 | var9_5) ^ 1353755523;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            var8_7 = (var6_6 | var9_5) ^ -1312385892;
                            ** GOTO lbl32
                        }
                        var8_7 = (var6_6 | var9_5) ^ 1040469951;
                        ** GOTO lbl32
                        {
                            case 1690666013: {
                                NanoVG.nvgFillPaint((long)var0, (NVGPaint)mJ.a);
                                break block41;
                            }
                            case 1628360570: {
                                NanoVG.nvgMoveTo((long)var0, (float)0.0f, (float)0.0f);
                                break block38;
                            }
                        }
lbl79:
                        // 1 sources

                        while (true) {
                            var8_7 = (var6_6 | var9_5) ^ -1628753898;
                            ** GOTO lbl32
                            break;
                        }
                    }
                    var8_7 = (var6_6 | var9_5) ^ -2017746094;
                    ** GOTO lbl32
                    break;
                }
                NanoVG.nvgLineTo((long)var0, (float)(var2_1 * var3_2), (float)(-var2_1));
                var8_7 = (var6_6 | var9_5) ^ -277641797;
                ** GOTO lbl32
            }
            var8_7 = (var6_6 | var9_5) ^ -1897987305;
            ** GOTO lbl32
            {
                case 154095118: {
                    NanoVG.nvgLineTo((long)var0, (float)(-var2_1 * var3_2), (float)(-var2_1));
                    ** continue;
                }
                case 1852483205: {
                    var7_8 ^= var8_7 ^ -293830382;
                    break;
                }
                case 278297303: {
                    var7_8 ^= var8_7 ^ 669001302;
                    ** continue;
                }
                case -1179144451: {
                    var7_8 ^= var8_7 ^ 715036560;
                    ** continue;
                }
                case -1354452032: {
                    var7_8 ^= var8_7 ^ 2103467227;
                    ** continue;
                }
            }
            var8_7 = (var6_6 | var9_5) ^ 1179799953;
            ** GOTO lbl32
            {
                case 1216733936: {
                    NanoVG.nvgLinearGradient((long)var0, (float)0.0f, (float)0.0f, (float)0.0f, (float)(-var2_1), (NVGColor)mJ.AP(var4_3, mJ.b), (NVGColor)mJ.AP(var5_4, mJ.a), (NVGPaint)mJ.a);
                    ** continue;
                }
            }
            var8_7 = (var6_6 | var9_5) ^ 636162971;
            ** GOTO lbl32
            NanoVG.nvgBeginPath((long)var0);
            var8_7 = (var6_6 | var9_5) ^ 1352748204;
            ** while (true)
            {
                case -1353362193: {
                    var7_8 ^= var8_7 ^ 1483211535;
                    ** continue;
                }
                ** case -2049951844:
            }
lbl121:
            // 1 sources

            NanoVG.nvgFill((long)var0);
            ** while (true)
        }
        var9_5 = 1357180768;
        var6_6 = mJ.a & 1357180768 ^ -1088311220;
        var8_7 = 0;
        var7_8 = (var6_6 | var9_5) ^ -800026717;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static void locationDot(W var0, float var1_1, float var2_2, float var3_3, int var4_4) {
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
    private static void AR(long l2, float f2, float f3, float f4, int n2) {
        int n3 = -301778651;
        int n4 = a & 0xEE033925 ^ 0x2E790CEF;
        int n5 = 0;
        int n6 = (n4 | n3) ^ 0xF7C30772;
        n5 = (n4 | n3) ^ 0x76D3CCDD;
        block13: while (true) {
            switch (n5) {
                default: {
                    continue block13;
                }
                case 1400317888: {
                    NanoVG.nvgCircle((long)l2, (float)f2, (float)f3, (float)f4);
                    n5 = (n4 | n3) ^ 0x39AE3036;
                    continue block13;
                }
                case 1266844380: {
                    NanoVG.nvgFill((long)l2);
                    n5 = (n4 | n3) ^ 0xE0F95657;
                    continue block13;
                }
                case -673903143: {
                    n6 ^= n5 ^ 0x862D6353;
                    n5 = (n4 | n3) ^ 0xE8CE0E82;
                    continue block13;
                }
                case -1614851: {
                    return;
                }
                case 953458224: {
                    n6 ^= n5 ^ 0xB27BC69D;
                    n5 = (n4 | n3) ^ 0xA5F9BF33;
                    continue block13;
                }
                case 2073272930: {
                    NanoVG.nvgBeginPath((long)l2);
                    n5 = (n4 | n3) ^ 0xD149D794;
                    continue block13;
                }
                case 174475995: {
                    n6 ^= n5 ^ 0xB539F6BA;
                    n5 = (n4 | n3) ^ 0x95E89F8D;
                    continue block13;
                }
                case 243428280: {
                    n6 ^= n5 ^ 0x8EDEC602;
                    n5 = (n4 | n3) ^ 0x119C6612;
                    continue block13;
                }
                case -1733758670: {
                    n5 = (n4 | n3) ^ 0xE41D7734;
                    continue block13;
                }
                case 112538477: {
                    NanoVG.nvgFillColor((long)l2, (NVGColor)mJ.AP(n2, c));
                    n5 = (n4 | n3) ^ 0xD6AFA3DF;
                    continue block13;
                }
                case 1060301435: 
            }
            n6 ^= n5 ^ 0xCCE14DCE;
            n5 = (n4 | n3) ^ 0xBD0C1A2F;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static void watermark(W var0, H var1_1, long var2_2) {
        block49: {
            block48: {
                var22_3 = 593542466;
                var19_4 = mJ.a & 593542466 ^ 1516603319;
                var21_5 = 0;
                var20_21 = (var19_4 | var22_3) ^ 398187998;
                var21_5 = (var19_4 | var22_3) ^ -1728474740;
                if (true) ** GOTO lbl92
lbl-1000:
                // 5 sources

                {
                    block50: {
                        block51: {
                            switch (var21_5) {
                                case -43086512: {
                                    var0.text(var12_14, var18_20 + var15_17, var7_9 / 2.0f, var13_15, as.muted());
                                    ** break;
                                }
                                case 1092503360: {
                                    var20_21 ^= var21_5 ^ 1935067962;
                                    break;
                                }
                                case -1124038355: {
                                    var20_21 ^= var21_5 ^ 1370861484;
                                    ** break;
                                }
                                case -1823750277: {
                                    hc.register(ad.H, var5_7, var6_8, var16_18 * var4_6, var7_9 * var4_6);
                                    var21_5 = (var19_4 | var22_3) ^ 981203127;
                                    break block50;
                                }
                                case 716893609: {
                                    return;
                                }
                                case -367294962: {
                                    var0.restore();
                                    var21_5 = (var19_4 | var22_3) ^ 501568822;
                                    break block50;
                                }
                                case -1102319458: {
                                    var20_21 ^= var21_5 ^ 558808093;
                                    var21_5 = (var19_4 | var22_3) ^ -1853998599;
                                    break block50;
                                }
lbl31:
                                // 1 sources

                                var21_5 = (var19_4 | var22_3) ^ -949503014;
                                continue block33;
                                case 1313524440: {
                                    var20_21 ^= var21_5 ^ -1479392021;
                                    var21_5 = (var19_4 | var22_3) ^ -2046086489;
                                    break block50;
                                }
lbl37:
                                // 1 sources

                                var21_5 = (var19_4 | var22_3) ^ -986820759;
                                continue block33;
                                case -1140718547: {
                                    as.divider(var0, var18_20, var7_9 * 0.28f, var18_20, var7_9 * 0.72f);
                                    break block51;
                                }
                                case 1719724737: {
                                    var20_21 ^= var21_5 ^ -696618476;
                                    var21_5 = (var19_4 | var22_3) ^ -399607668;
                                    break block50;
                                }
                            }
                            var21_5 = (var19_4 | var22_3) ^ 1373590110;
                            continue;
                        }
                        var21_5 = (var19_4 | var22_3) ^ 892302639;
                        continue;
                    }
lbl52:
                    // 2 sources

                    ** while (true)
                }
lbl53:
                // 1 sources

                while (true) {
                    var20_21 ^= 1589679513;
                    var10_12 = var0.s(13.0f);
                    var20_21 ^= -1775683354;
                    var11_13 = var0.textWidth(mJ.B, var10_12);
                    var20_21 ^= -820262002;
                    var12_14 = mJ.h;
                    var20_21 ^= -1047720295;
                    var13_15 = var0.s(10.0f);
                    var20_21 ^= -372696736;
                    var14_16 = var0.textWidth(var12_14, var13_15);
                    var20_21 ^= -134165495;
                    var15_17 = var0.s(7.0f);
                    var20_21 ^= 184190614;
                    var16_18 = var8_10 + var9_11 + var15_17 + var11_13 + var15_17 + 1.0f + var15_17 + var14_16 + var8_10;
                    var21_5 = (var19_4 | var22_3) ^ 918049256;
                    break block48;
                    break;
                }
lbl70:
                // 1 sources

                while (true) {
                    var21_5 = (var19_4 | var22_3) ^ -376570718;
                    break block49;
                    break;
                }
lbl73:
                // 1 sources

                while (true) {
                    var8_10 = var0.s(8.0f);
                    var20_21 ^= -62264281;
                    var9_11 = var0.s(17.0f);
                    ** continue;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    var21_5 = (var19_4 | var22_3) ^ 1501826321;
                    break block48;
                    break;
                }
lbl81:
                // 1 sources

                while (true) {
                    var20_21 ^= -225743337;
                    var5_7 = var1_1.layoutX(ad.H, (int)var0.f);
                    var20_21 ^= -1896525408;
                    var6_8 = var1_1.layoutY(ad.H, (int)var0.e);
                    var20_21 ^= -1255057998;
                    var7_9 = var0.s(29.0f);
                    var20_21 ^= -87569013;
                    ** continue;
                    break;
                }
                block40: while (true) {
                    var21_5 = (var19_4 | var22_3) ^ -1031806481;
lbl92:
                    // 2 sources

                    block41: while (true) {
                        switch (var21_5) {
                            default: {
                                continue block41;
                            }
                            case -6256855: {
                                var20_21 ^= var21_5 ^ 517670001;
                                continue block40;
                            }
                            case -1189454312: {
                                var4_6 = var1_1.layoutScale(ad.H);
                                ** continue;
                            }
                            case -476303749: 
                        }
                        var21_5 = (var19_4 | var22_3) ^ -2067449634;
                    }
                    break;
                }
lbl105:
                // 1 sources

                while (true) {
                    var21_5 = (var19_4 | var22_3) ^ -1725015284;
                    break block48;
                    break;
                }
lbl108:
                // 1 sources

                while (true) {
                    var21_5 = (var19_4 | var22_3) ^ -1803077143;
                    break block48;
lbl111:
                    // 1 sources

                    while (true) {
                        var21_5 = (var19_4 | var22_3) ^ -1843472750;
                        break block48;
                        break;
                    }
                    break;
                }
lbl114:
                // 1 sources

                while (true) {
                    var21_5 = (var19_4 | var22_3) ^ -1467267905;
                    break block49;
                    break;
                }
            }
            block46: while (true) {
                switch (var21_5) {
                    default: {
                        continue block46;
                    }
                    case -270367202: {
                        var20_21 ^= var21_5 ^ 2056764791;
                        ** continue;
                    }
                    case -498342661: {
                        var17_19 = var8_10 + var9_11 + var15_17;
                        var21_5 = (var19_4 | var22_3) ^ 149156065;
                        break block46;
                    }
                    case 1214501986: {
                        var20_21 ^= var21_5 ^ 1092626670;
                        ** continue;
                    }
                    case 585216742: {
                        var20_21 ^= var21_5 ^ -425447878;
                        var21_5 = (var19_4 | var22_3) ^ 1461586765;
                        continue block46;
                    }
                    case 1306390047: {
                        var20_21 ^= var21_5 ^ 2079135384;
                        var21_5 = (var19_4 | var22_3) ^ -1887515134;
                        continue block46;
                    }
                    case 746304698: {
                        as.compactCard(var0, var1_1, 0.0f, 0.0f, var16_18, var7_9);
                        ** continue;
                    }
                    case -377788059: {
                        eo.render(var0, var8_10, (var7_9 - var9_11) / 2.0f, var9_11);
                        var21_5 = (var19_4 | var22_3) ^ 856058773;
                        continue block46;
                    }
                    case -199527947: {
                        mJ.begin(var0, var5_7, var6_8, var4_6);
                        ** continue;
                    }
                }
                break;
            }
        }
        block47: while (true) {
            switch (var21_5) {
                default: {
                    continue block47;
                }
                case -739312824: {
                    var18_20 = var17_19 + var11_13 + var15_17;
                    var21_5 = (var19_4 | var22_3) ^ -966445350;
                    ** GOTO lbl52
                }
                case -1830272171: {
                    var0.text(mJ.B, var17_19, var7_9 / 2.0f, var10_12, as.primary());
                    var21_5 = (var19_4 | var22_3) ^ 1713480354;
                    continue block47;
                }
                case 491003221: {
                    var20_21 ^= var21_5 ^ -824594833;
                    ** continue;
                }
                case 1938181910: 
            }
            break;
        }
        var20_21 ^= var21_5 ^ 1607809519;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static void statChip(W var0, H var1_1, long var2_2, ad var4_3, String var5_4, String var6_5) {
        block65: {
            block67: {
                block66: {
                    break block67;
lbl1:
                    // 1 sources

                    while (true) {
                        var20_8 = (var18_7 | var21_6) ^ -893148970;
                        break block65;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var19_20 ^= 1145764706;
                        if (var6_5 == null) break block66;
                        var19_20 ^= 1145644632;
                        v0 = var0.s(5.0f) + var15_17;
                        ** GOTO lbl170
                        break;
                    }
                    while (true) {
                        var20_8 = (var18_7 | var21_6) ^ 1210152221;
                        ** GOTO lbl146
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var20_8 = (var18_7 | var21_6) ^ 532130276;
                        ** GOTO lbl146
                        break;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var19_20 ^= 1009696398;
                        var9_11 = var1_1.layoutY(var4_3, (int)var0.e);
                        var19_20 ^= -376322632;
                        var10_12 = var0.s(25.0f);
                        var19_20 ^= -1354270919;
                        var11_13 = var0.s(9.0f);
                        var19_20 ^= 1636167494;
                        var12_14 = var0.s(13.0f);
                        var19_20 ^= -1159823054;
                        var13_15 = var0.s(10.0f);
                        var19_20 ^= 1316856392;
                        var14_16 = var0.textWidth(var5_4, var12_14);
                        ** continue;
                        break;
                    }
                }
                while (true) {
                    switch (var19_20) {
                        case -1778643410: {
                            var19_20 ^= 1145644632;
                            ** GOTO lbl38
                        }
                        case -143908818: {
                            var19_20 ^= 608440318;
lbl38:
                            // 2 sources

                            v0 = 0.0f;
                            ** GOTO lbl170
                        }
                    }
                    var19_20 ^= 523035816;
                }
            }
            var21_6 = -717349204;
            var18_7 = mJ.a & -717349204 ^ -1326070328;
            var20_8 = 0;
            var19_20 = (var18_7 | var21_6) ^ -1366373924;
            var20_8 = (var18_7 | var21_6) ^ -1187995304;
            block49: while (true) {
                switch (var20_8) {
                    case 1288666804: {
                        ** break;
                    }
                    case -1431058064: {
                        var7_9 = var1_1.layoutScale(var4_3);
                        var19_20 ^= 1528697886;
                        var8_10 = var1_1.layoutX(var4_3, (int)var0.f);
                        ** continue;
                    }
lbl57:
                    // 1 sources

                    var20_8 = (var18_7 | var21_6) ^ 34686673;
                    continue block49;
                    case -135358147: {
                        var19_20 ^= var20_8 ^ 300750145;
                        var20_8 = (var18_7 | var21_6) ^ 1598822044;
                    }
                }
            }
lbl63:
            // 1 sources

            while (true) {
                var20_8 = (var18_7 | var21_6) ^ -1890333985;
                ** GOTO lbl146
lbl66:
                // 1 sources

                while (true) {
                    var20_8 = (var18_7 | var21_6) ^ -1658791127;
                    ** GOTO lbl146
                    break;
                }
                break;
            }
lbl69:
            // 1 sources

            while (true) {
                var20_8 = (var18_7 | var21_6) ^ 1527167914;
                break block65;
                break;
            }
lbl72:
            // 1 sources

            while (true) {
                var20_8 = (var18_7 | var21_6) ^ -1749650925;
                ** GOTO lbl180
                break;
            }
lbl75:
            // 2 sources

            while (true) {
                var19_20 ^= -883668431;
                var15_17 = v1;
                ** continue;
                break;
            }
lbl79:
            // 1 sources

            while (true) {
                var20_8 = (var18_7 | var21_6) ^ -219700048;
                ** GOTO lbl146
                break;
            }
lbl82:
            // 1 sources

            while (true) {
                var20_8 = (var18_7 | var21_6) ^ -2056531881;
                break block65;
                break;
            }
lbl85:
            // 1 sources

            while (true) {
                var20_8 = (var18_7 | var21_6) ^ -1988955754;
                ** GOTO lbl180
                break;
            }
lbl88:
            // 1 sources

            while (true) {
                var20_8 = (var18_7 | var21_6) ^ -178343741;
                ** GOTO lbl180
                break;
            }
        }
        block59: while (true) {
            switch (var20_8) {
                default: {
                    continue block59;
                }
                case -1359387578: {
                    var19_20 ^= var20_8 ^ -412087172;
                    var20_8 = (var18_7 | var21_6) ^ -846431515;
                    continue block59;
                }
                case 1888751547: {
                    var19_20 ^= var20_8 ^ -431888662;
                    ** GOTO lbl125
                }
                case 1060929338: {
                    var0.restore();
                    var20_8 = (var18_7 | var21_6) ^ -996827925;
                    continue block59;
                }
                case 1526018110: {
                    ** break;
                }
                case 259143624: {
                    if (var6_5 != null) {
                        var20_8 = (var18_7 | var21_6) ^ -1358237742;
                        continue block59;
                    }
                    ** GOTO lbl127
                }
                case -1506543065: {
                    var19_20 ^= var20_8 ^ -1022674044;
                    ** GOTO lbl129
                }
                case 1931930659: {
                    var19_20 ^= var20_8 ^ 1424895310;
                    ** continue;
                }
lbl120:
                // 1 sources

                var20_8 = (var18_7 | var21_6) ^ -1508140160;
                continue block59;
                case 1407468652: {
                    var0.text(var6_5, var17_19 + var14_16 + var0.s(5.0f), var10_12 / 2.0f, var13_15, as.secondary());
                    ** GOTO lbl127
                }
lbl125:
                // 1 sources

                var20_8 = (var18_7 | var21_6) ^ -502440406;
                continue block59;
lbl127:
                // 2 sources

                var20_8 = (var18_7 | var21_6) ^ -2032585777;
                continue block59;
lbl129:
                // 1 sources

                var20_8 = (var18_7 | var21_6) ^ -91363292;
                continue block59;
                case 829047559: {
                    var19_20 ^= var20_8 ^ -535191070;
                    var20_8 = (var18_7 | var21_6) ^ -715719214;
                    continue block59;
                }
                case 947102985: {
                    var0.text(var5_4, var17_19, var10_12 / 2.0f, var12_14, as.primary());
                    var20_8 = (var18_7 | var21_6) ^ 1405887947;
                    continue block59;
                }
                case 547955262: {
                    hc.register(var4_3, var8_10, var9_11, var16_18 * var7_9, var10_12 * var7_9);
                    ** continue;
                }
lbl142:
                // 2 sources

                while (true) {
                    var16_18 = var11_13 + var14_16 + v0 + var11_13;
                    var20_8 = (var18_7 | var21_6) ^ -633240031;
                    ** GOTO lbl-1000
                    break;
                }
lbl146:
                // 5 sources

                block61: while (true) {
                    switch (var20_8) {
                        default: {
                            continue block61;
                        }
                        case -364349944: {
                            var19_20 ^= var20_8 ^ 1329279421;
                            ** continue;
                        }
                        case 1759446213: {
                            v1 = var0.textWidth(var6_5, var13_15);
                            ** GOTO lbl75
                        }
                        case -1109480719: {
                            var19_20 ^= var20_8 ^ 201137240;
                            break;
                        }
                        case 2058097971: {
                            var19_20 ^= var20_8 ^ -863001702;
                            ** continue;
                        }
                        case 108986986: {
                            v1 = 0.0f;
                            ** continue;
                        }
                        case 119044956: {
                            if (var6_5 == null) ** continue;
                            ** continue;
                        }
                    }
                    var20_8 = (var18_7 | var21_6) ^ -209658490;
                }
lbl170:
                // 2 sources

                while (true) {
                    switch (var19_20) {
                        case -748368454: {
                            var19_20 ^= -1560422287;
                            ** GOTO lbl142
                        }
                        case -776656778: {
                            var19_20 ^= 1468963949;
                            ** continue;
                        }
                    }
                    var19_20 ^= 826201074;
                }
lbl180:
                // 3 sources

                block63: while (true) {
                    switch (var20_8) lbl-1000:
                    // 2 sources

                    {
                        default: {
                            continue block63;
                        }
                        case 10579759: {
                            var19_20 ^= var20_8 ^ -961551177;
                            var20_8 = (var18_7 | var21_6) ^ 88492682;
                            continue block63;
                        }
                        case 801003981: {
                            var19_20 ^= var20_8 ^ -1714233260;
                            ** continue;
                        }
                        case -256273050: {
                            as.compactCard(var0, var1_1, 0.0f, 0.0f, var16_18, var10_12);
                            break;
                        }
                        case 2089627258: {
                            mJ.begin(var0, var8_10, var9_11, var7_9);
                            ** continue;
                        }
                        case 1648995839: {
                            var17_19 = var11_13;
                            ** continue;
                        }
                        case 300992571: {
                            var19_20 ^= var20_8 ^ 1366398975;
                            ** continue;
                        }
                    }
                    var20_8 = (var18_7 | var21_6) ^ -468772905;
                }
                case 401768902: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    static void infoBar(W var0, class_310 var1_1, H var2_2, long var3_3, double var5_4) {
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
    static void coordinates(W var0, class_310 var1_1, H var2_2, long var3_3, class_243 var5_4, double var6_5) {
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

    private static int AS(int n2, int n3) {
        int n4 = -242175654;
        int n5 = 2045563974;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x19CFA47E)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xF9FC5365;
        n6 -= (n5 | n4) ^ 0xF9FC8C30;
        n6 += (n5 | n4) ^ 0xF9FC8B37;
        n6 ^= (n5 | n4) ^ 0xF9FCDFA4;
        n6 ^= (n5 | n4) ^ 0xF9FC5C58;
        return n6 -= (n5 | n4) ^ 0xF9FC0480;
    }

    /*
     * Exception decompiling
     */
    static void moduleList(W var0, H var1_1, long var2_2) {
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
    private static float AT(float var0, float var1_1, float var2_2, float var3_3, int var4_4) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static float AU(W var0, gF var1_1, H var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8) {
        block16: {
            var14_9 = 1192783431;
            var11_10 = mJ.a & 1192783431 ^ -1472571110;
            var13_11 = 0;
            var12_12 = (var11_10 | var14_9) ^ 2131510269;
            var13_11 = (var11_10 | var14_9) ^ -306457446;
            if (true) ** GOTO lbl-1000
lbl7:
            // 2 sources

            while (true) {
                var13_11 = (var11_10 | var14_9) ^ -1686768962;
                break block16;
                break;
            }
            block14: while (true) {
                switch (var13_11) lbl-1000:
                // 2 sources

                {
                    default: {
                        continue block14;
                    }
                    case 1285633333: {
                        var12_12 ^= var13_11 ^ 669239256;
                        var13_11 = (var11_10 | var14_9) ^ -986628562;
                        continue block14;
                    }
                    case 42052549: {
                        var13_11 = (var11_10 | var14_9) ^ -1550103958;
                        continue block14;
                    }
                    case 705380721: 
                }
                break;
            }
            var9_13 = mJ.AV(var1_1, var2_2);
            var12_12 ^= 2065211383;
            var10_14 = var0.textWidth(var1_1.getDisplayName(), var3_3);
            var13_11 = (var11_10 | var14_9) ^ -995307924;
        }
        block15: while (true) {
            switch (var13_11) {
                case 608169109: {
                    ** break;
                }
                case -352015546: {
                    var10_14 += var5_5 + var0.textWidth(var9_13, var4_4);
                    ** GOTO lbl7
                }
                case 731296051: {
                    var12_12 ^= var13_11 ^ -2028693275;
                    ** break;
                }
lbl37:
                // 1 sources

                var13_11 = (var11_10 | var14_9) ^ 71226393;
                continue block15;
                case -199199519: {
                    if (var9_13 != null) ** break;
                    ** continue;
                    var13_11 = (var11_10 | var14_9) ^ -888826934;
                }
                default: {
                    continue block15;
                }
lbl45:
                // 1 sources

                var13_11 = (var11_10 | var14_9) ^ 454691774;
                continue block15;
                case 1951370721: {
                    var12_12 ^= var13_11 ^ -1113926517;
                    var13_11 = (var11_10 | var14_9) ^ -691441050;
                    continue block15;
                }
                case 972229945: 
            }
            break;
        }
        return var10_14 + var6_6 * 2.0f + var7_7 + var8_8;
    }

    /*
     * Exception decompiling
     */
    private static String AV(gF var0, H var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH], 78[UNCONDITIONALDOLOOP]], but top level block is 16[SWITCH]
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
     * Exception decompiling
     */
    static void potions(W var0, class_310 var1_1, H var2_2, long var3_3) {
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
    static void hotkeys(W var0, H var1_1, long var2_2) {
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
    private static void AW(W var0, H var1_1, long var2_2, ad var4_3, bq var5_4, String var6_5, List<String[]> var7_6) {
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
    private static String[] AX(class_1293 var0) {
        var7_1 = 1642181704;
        var4_2 = mJ.a & 1642181704 ^ 1733290707;
        var6_3 = 0;
        var5_4 = (var4_2 | var7_1) ^ 2001566013;
        var6_3 = (var4_2 | var7_1) ^ 1385459354;
        if (true) ** GOTO lbl12
        block14: while (true) {
            var6_3 = (var4_2 | var7_1) ^ -64107878;
            if (true) ** GOTO lbl12
            block15: while (true) {
                var6_3 = (var4_2 | var7_1) ^ 428529821;
lbl12:
                // 3 sources

                block16: while (true) {
                    switch (var6_3) {
                        default: {
                            continue block16;
                        }
                        case 1621498993: {
                            continue block15;
                        }
                        case -683143552: {
                            var5_4 ^= var6_3 ^ 2107464041;
                            continue block14;
                        }
                        case -1232738862: {
                            var5_4 ^= var6_3 ^ 1426353310;
                            continue block15;
                        }
                        case -1084616246: {
                            var5_4 ^= var6_3 ^ -1622439259;
                            continue block14;
                        }
                        case -1681771455: {
                            var6_3 = (var4_2 | var7_1) ^ -375919150;
                            continue block16;
                        }
                        case -1904733431: {
                            var1_5 = var0.method_5579();
                            var5_4 ^= 1824483910;
                            var5_4 ^= -207748530;
                            var5_4 ^= 15809822;
                            var2_6 = var1_5.method_40230().map((Function<class_5321, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, Ba(net.minecraft.class_5321 ), (Lnet/minecraft/class_5321;)Ljava/lang/String;)()).orElseGet((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, AZ(net.minecraft.class_1293 ), ()Ljava/lang/String;)((class_1293)var0));
                            var3_7 = var0.method_5584() / mJ.AS(((var5_4 ^= -1712074980) | var7_1) ^ -1748834316, (var4_2 | var7_1) ^ ((var5_4 | var7_1) ^ 761686197));
                            return new String[]{var2_6, var3_7 / mJ.AS((var5_4 | var7_1) ^ 500213326, (var4_2 | var7_1) ^ ((var5_4 | var7_1) ^ -461463057)) + ":" + String.format(Locale.US, mJ.s, new Object[]{var3_7 % mJ.AS(((var5_4 ^= -1959565939) | var7_1) ^ 500213327, (var4_2 | var7_1) ^ ((var5_4 | var7_1) ^ -93100265))})};
                        }
                        case 897290305: {
                            var6_3 = (var4_2 | var7_1) ^ 122282666;
                            continue block16;
                        }
                        case 2120558150: 
                    }
                    switch (var5_4) {
                        case -1013648383: {
                            var6_3 = (var4_2 | var7_1) ^ -1331171237;
                            continue block16;
                        }
                        case 279087078: {
                            var6_3 = (var4_2 | var7_1) ^ -659165423;
                            continue block16;
                        }
                    }
                    var6_3 = (var4_2 | var7_1) ^ -781575415;
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static String AY(String var0) {
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
    static String time() {
        block9: {
            block10: {
                break block10;
lbl1:
                // 1 sources

                return mJ.a.format(LocalTime.now());
lbl3:
                // 1 sources

                while (true) {
                    var2_1 = (var0 | 1472441770) ^ 1952206418;
                    break block9;
                    break;
                }
            }
            var0 = mJ.a & 1472441770 ^ 1263848640;
            var2_1 = 0;
            var1_2 = (var0 | 1472441770) ^ 249585549;
            ** GOTO lbl19
        }
lbl12:
        // 2 sources

        block7: while (true) {
            switch (var2_1) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block7;
                    }
                    break;
                }
                case 730571704: {
                    ** continue;
                }
lbl19:
                // 1 sources

                var2_1 = (var0 | 1472441770) ^ 607684874;
                ** continue;
                case -950833258: {
                    var1_2 ^= var2_1 ^ -262426561;
                    ** continue;
                }
                case 2079286496: 
            }
            break;
        }
        var2_1 = (var0 | 1472441770) ^ -1736146308;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static String formatTps(class_310 var0) {
        var4_1 = -1338455958;
        var1_2 = mJ.a & -1338455958 ^ 677034552;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1263915006;
        var3_3 = (var1_2 | var4_1) ^ 355852923;
        block13: while (true) {
            block16: {
                block15: {
                    switch (var3_3) {
                        case -1349544601: {
                            return mJ.z;
                        }
                        case 1241883703: {
                            v0 = mJ.z;
                            break block15;
                        }
                        case 1705672676: {
                            var2_4 ^= var3_3 ^ 2069735409;
                            var3_3 = (var1_2 | var4_1) ^ -226533811;
                            continue block13;
                        }
                        case -1387325439: {
                            break block16;
                        }
                        case -915664362: {
                            if (var0.method_1542()) {
                                var3_3 = (var1_2 | var4_1) ^ -136962567;
                                continue block13;
                            }
                            ** GOTO lbl34
                        }
                        case 898835512: {
                            var2_4 ^= var3_3 ^ 1745709778;
                            ** GOTO lbl38
                        }
                        case 1336731523: {
                            var2_4 ^= var3_3 ^ 1364934550;
                            var3_3 = (var1_2 | var4_1) ^ 124432434;
                            continue block13;
                        }
                        case 140965810: {
                            if (var0.field_1687 != null) ** GOTO lbl48
                            ** GOTO lbl36
                        }
lbl34:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ -573536866;
                        ** GOTO lbl49
lbl36:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ -1914053054;
                        ** GOTO lbl49
lbl38:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 401960733;
                        ** GOTO lbl49
                        case -999497071: {
                            var2_4 ^= var3_3 ^ 399446949;
                            var3_3 = (var1_2 | var4_1) ^ -1340338744;
                            ** GOTO lbl49
                        }
                        case 1030399360: {
                            var2_4 ^= var3_3 ^ -1574555789;
                            var3_3 = (var1_2 | var4_1) ^ 1897326700;
                            ** GOTO lbl49
                        }
lbl48:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ -2062524422;
lbl49:
                        // 7 sources

                        default: {
                            continue block13;
                        }
                        case -1089451448: 
                    }
                    v0 = mJ.f;
                }
                var2_4 ^= -1296351046;
                return v0;
            }
            var3_3 = (var1_2 | var4_1) ^ 2081822955;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String AZ(class_1293 class_12932) {
        int n2 = a & 0x3DE1EAA3 ^ 0xDF94D116;
        int n3 = 0;
        int n4 = (n2 | 0x3DE1EAA3) ^ 0x74144FE7;
        n3 = (n2 | 0x3DE1EAA3) ^ 0x3CCCB1BE;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1019655671: {
                    n3 = (n2 | 0x3DE1EAA3) ^ 0xAE648C44;
                    continue block5;
                }
                case 1368487923: {
                    n4 ^= n3 ^ 0x171ADEAD;
                    n3 = (n2 | 0x3DE1EAA3) ^ 0xEC6B8257;
                    continue block5;
                }
                case 329152992: 
            }
            break;
        }
        return class_2561.method_43471((String)class_12932.method_5586()).getString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String Ba(class_5321 class_53212) {
        int n2 = a & 0x9DA23F98 ^ 0xD9B00E9A;
        int n3 = 0;
        int n4 = (n2 | 0x9DA23F98) ^ 0xB762F0D9;
        n3 = (n2 | 0x9DA23F98) ^ 0xD2563D2F;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -953545441: {
                    return mJ.AY(class_53212.method_29177().method_12832());
                }
                case 407431465: {
                    n4 ^= n3 ^ 0xC3E2FDAC;
                    n3 = (n2 | 0x9DA23F98) ^ 0x1A983285;
                    continue block5;
                }
                case 266601141: 
            }
            n3 = (n2 | 0x9DA23F98) ^ 0xC5FAD6B3;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ double Bb(W var0, H var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, gF var8_8) {
        block7: {
            block9: {
                block8: {
                    break block8;
lbl1:
                    // 1 sources

                    while (true) {
                        var10_11 ^= var11_10 ^ -704991821;
                        break block7;
                        break;
                    }
lbl4:
                    // 2 sources

                    block6: while (true) {
                        switch (var11_10) {
                            default: {
                                continue block6;
                            }
                            case 265234984: {
                                break;
                            }
                            case -1859190690: {
                                ** continue;
                            }
                        }
                        var11_10 = (var9_9 | -1430765551) ^ 718685481;
                        continue;
                        break;
                    }
                }
                var9_9 = mJ.a & -1430765551 ^ 424232294;
                var11_10 = 0;
                break block9;
                {
                    ** case 743431326:
                }
lbl19:
                // 1 sources

                return -mJ.AU(var0, var8_8, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7);
            }
            var10_11 = (var9_9 | -1430765551) ^ -593887270;
            var11_10 = (var9_9 | -1430765551) ^ -1271500961;
            ** GOTO lbl4
        }
        var11_10 = (var9_9 | -1430765551) ^ -1749640727;
        ** while (true)
    }
}

