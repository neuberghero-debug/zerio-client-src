/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1109
 *  net.minecraft.class_1113
 *  net.minecraft.class_1923
 *  net.minecraft.class_310
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_4588
 *  net.minecraft.class_638
 *  net.minecraft.class_6606
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package z.r;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.lang.invoke.MethodHandles;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1109;
import net.minecraft.class_1113;
import net.minecraft.class_1923;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_4588;
import net.minecraft.class_638;
import net.minecraft.class_6606;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import z.r.aS;
import z.r.dA;
import z.r.gF;
import z.r.gP;
import z.r.gj;
import z.r.jH;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class hs
extends gF {
    private static final /* synthetic */ String k;
    private static final byte a;
    private static volatile hs a;
    private static final /* synthetic */ String a;
    private static final int a;
    private static final /* synthetic */ String b;
    private static final int b;
    private static final /* synthetic */ String c;
    private static final byte b;
    private class_638 a;
    private static final /* synthetic */ String s;
    private static final byte c;
    private static final int[] a;
    private static final int c;
    private final ke a;
    private static final int d;
    private static final /* synthetic */ String d;
    private static final byte d;
    private static final /* synthetic */ String e;
    private volatile long[] a;
    private final Long2ObjectOpenHashMap<byte[]> a;
    private static final int e;
    private static final int f;
    private static final ConcurrentLinkedQueue<aS> a;
    private static final int g;
    private final gP a;
    private static final int h;
    private final LongOpenHashSet a;
    private static final byte e;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final /* synthetic */ String f;
    private int l;
    public static final int n;
    private static final int m;
    private final ke b;
    private static final /* synthetic */ String g;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block23: {
            var2 = 12737584;
            hs.n = mK.a(MethodHandles.lookup().lookupClass(), -1562299254);
            var1_1 = 0;
            var0_2 = 760693615;
            var1_1 = var2 ^ -1173811700;
            if (true) ** GOTO lbl29
            block15: while (true) {
                switch (var1_1) {
                    case -1161080260: {
                        ** break;
                    }
                    case 1230239305: {
                        var0_2 ^= var1_1 ^ 1019223339;
                        ** break;
                    }
lbl14:
                    // 1 sources

                    var1_1 = var2 ^ -1681071646;
                    continue block15;
                    case -1693532718: {
                        var0_2 ^= var1_1 ^ -411016318;
                        var1_1 = var2 ^ 1059281035;
                        continue block15;
                    }
lbl20:
                    // 1 sources

                    var1_1 = var2 ^ -900728672;
                    continue block15;
                    case 1071711419: {
                        v0 = 0;
                        hs.a = new int[((var0_2 ^= -1767246264) | var2) ^ -940409025];
                        var0_2 ^= 398426766;
                        v1 = 0;
                        v2 = "+=\u00cd\u00a9>\u00ccqx\u001c2D\u0098+LFs\u00fb\u0012\u00d6\u00f7e\u00d1\u00d0N9\u00b9\u00e5\u00e1\u00f5\u00ff\u00e5\u00a4!\u0011~?A\u00a2\u00f8aj\u00f3\u00b4\u0099\u00132o\u0016Q]|\u00e6X\u00da\u00a5\u00cbX\u0013\u0007\u00cfI\u00a0:\u00a2\u009e\u00e5\u00a0\"\u00ae]\u00c6[\u0083\u0096\u001cz\u00a3k\u009b\u0001\u00d3JboG\u00a9\u00b7\u00be=\u00c1\u001a\u00146*\u00b4$\u00b3\u00e3=\u000e\u00cf\u00d1&u\u00ef[\u00ad\u00bc\u00c4\u00f5\u00a4\u00ac\u00caVxk\u00c9\u00cb\u00ce\u00ef\u008a\u00f79;y\u0086\u0093\u001c/g\u00fda\u0080\u00b6\u0081\u00b3\u00af\u00c86#\u0098\u00ae_})\u00ec7uDO\u0081\u00f6.\u00c6d\u00ef\u00f5\u00b9\u00ad\u009c\u0093%\u00a1\u00f7@\u00b9\u00b1\u0016MJ\f\u00c3h\fVz\u00f7\u00e7\u0007'\u00a3g\u007f7\u00ef\u008cg\u001d2\u00fb}\u009f\u0003\u00b2`\u00f6\u00f2l\u00efSw\u00bc\u00b7\u001ea\u0080P\u0007E\u0095\u00f2:\u00edn\u00a7\u00e0\u00ed\bM38w'\u00d8\u008d\u0084\u0099W\u0084\u00173\tr\u00d3\u00feW\u00b6\u00fc\u00f6\u0094\u0095E\u0007+y\u00ed\u00cd\u0094\"\u00e3\u00d6\u00ec\u00c9\u00bd\u00acX\u00e3\u00d7\u00e9`\u00e5\u00ff\u00f1B\u00fb\u0001j7\u0080x\u00ferk\u00d8m$\u00d3\u0004I\u00eem(\u00b0(bO\u00bfD".getBytes("ISO-8859-1");
                        ** GOTO lbl43
                    }
lbl29:
                    // 3 sources

                    while (true) {
                        default: {
                            continue block15;
                        }
                        break;
                    }
lbl32:
                    // 1 sources

                    while (true) {
                        v3 = ((var0_2 ^= 1209765290) | var2) ^ 1088496637 ^ hs.n;
                        var0_2 ^= 1468660194;
                        hs.a[v0] = (v4 | (v5 | (v6 | v2[v1 + 3] & 255))) ^ v3;
                        v0 = v0 + 1;
                        v2 = v2;
                        v1 = v1 + 4;
                        var0_2 ^= 828855305;
                        if (v1 + 4 >= v2.length) ** GOTO lbl83
lbl43:
                        // 2 sources

                        var0_2 ^= 267799714;
                        var0_2 ^= 369219523;
                        v4 = (v2[v1] & 255) << 24;
                        var0_2 ^= 1827530899;
                        v5 = (v2[v1 + 1] & 255) << 16;
                        var0_2 ^= -762154673;
                        v6 = (v2[v1 + 2] & 255) << 8;
                        break block23;
lbl54:
                        // 2 sources

                        while (true) {
                            hs.m = hs.OJ((var0_2 | var2) ^ -1182680677, var2 ^ ((var0_2 | var2) ^ -1314821717));
                            hs.k = hs.OJ((var0_2 | var2) ^ -1182680678, var2 ^ ((var0_2 | var2) ^ 1825993454));
                            hs.j = hs.OJ((var0_2 | var2) ^ -1182680699, var2 ^ ((var0_2 | var2) ^ 1570733958));
                            hs.i = hs.OJ((var0_2 | var2) ^ -1182680700, var2 ^ ((var0_2 | var2) ^ -1404968566));
                            hs.e = (byte)hs.OJ((var0_2 | var2) ^ -1182680697, var2 ^ ((var0_2 | var2) ^ 697415788));
                            hs.h = hs.OJ((var0_2 | var2) ^ -1182680698, var2 ^ ((var0_2 | var2) ^ 1068323260));
                            hs.g = hs.OJ((var0_2 | var2) ^ -1182680703, var2 ^ ((var0_2 | var2) ^ 465108318));
                            hs.f = hs.OJ((var0_2 | var2) ^ -1182680704, var2 ^ ((var0_2 | var2) ^ -1287407467));
                            hs.e = hs.OJ((var0_2 | var2) ^ -1182680701, var2 ^ ((var0_2 | var2) ^ -1289393595));
                            hs.d = (byte)hs.OJ((var0_2 | var2) ^ -1182680702, var2 ^ ((var0_2 | var2) ^ 1717184675));
                            hs.d = hs.OJ((var0_2 | var2) ^ -1182680691, var2 ^ ((var0_2 | var2) ^ -743737873));
                            hs.c = hs.OJ((var0_2 | var2) ^ -1182680692, var2 ^ ((var0_2 | var2) ^ -633720277));
                            hs.c = (byte)hs.OJ((var0_2 | var2) ^ -1182680689, var2 ^ ((var0_2 | var2) ^ 754905386));
                            hs.b = (byte)hs.OJ((var0_2 | var2) ^ -1182680690, var2 ^ ((var0_2 | var2) ^ -388892651));
                            hs.b = hs.OJ((var0_2 | var2) ^ -1182680695, var2 ^ ((var0_2 | var2) ^ -882375089));
                            hs.a = hs.OJ((var0_2 | var2) ^ -1182680696, var2 ^ ((var0_2 | var2) ^ 666946729));
                            hs.a = (byte)hs.OJ((var0_2 | var2) ^ -1182680693, var2 ^ ((var0_2 | var2) ^ 2093930911));
                            hs.k = gj.decode("3PctyFQuny1Amm4Q", hs.OJ((var0_2 | var2) ^ -1182680694, var2 ^ ((var0_2 | var2) ^ -1769293658)));
                            hs.s = gj.decode("ESywulQKKOimt7q/pQ==", hs.OJ((var0_2 | var2) ^ -1182680587, var2 ^ ((var0_2 | var2) ^ -1986132498)));
                            hs.d = gj.decode("6gCbgFI=", hs.OJ((var0_2 | var2) ^ -1182680588, var2 ^ ((var0_2 | var2) ^ -323438029)));
                            hs.e = gj.decode("3cNAqg==", hs.OJ((var0_2 | var2) ^ -1182680585, var2 ^ ((var0_2 | var2) ^ -995791543)));
                            hs.b = gj.decode("u5HY1Z4t71hchHjwj8oF4goQSlqe3hkMvuyF", hs.OJ((var0_2 | var2) ^ -1182680586, var2 ^ ((var0_2 | var2) ^ -1662941774)));
                            hs.a = gj.decode("4GBqpu6gUg==", hs.OJ((var0_2 | var2) ^ -1182680591, var2 ^ ((var0_2 | var2) ^ -748191205)));
                            hs.g = gj.decode("V4XGQHWVELZrSTe91UkCBsOuAtkE9JAjeKyMUNQShpkJoA==", hs.OJ((var0_2 | var2) ^ -1182680592, var2 ^ ((var0_2 | var2) ^ 1614171861)));
                            hs.f = gj.decode("7Z1DEjwK", hs.OJ((var0_2 | var2) ^ -1182680589, var2 ^ ((var0_2 | var2) ^ -1031813080)));
                            hs.c = gj.decode("5VtNcNOnnUCi30v7DHCvmTA83PuyzJJtwUEhUoX1ZJGUMh/MI1WeGGEq22c8HfUxzPRcUSE5CPv/", hs.OJ((var0_2 | var2) ^ -1182680590, var2 ^ ((var0_2 | var2) ^ -1637274124)));
                            var1_1 = var2 ^ 1234283129;
                            ** continue;
                            break;
                        }
lbl83:
                        // 1 sources

                        while (true) {
                            switch (var0_2) {
                                default: {
                                    var0_2 ^= 2044851522;
                                    ** GOTO lbl54
                                }
                                case 975474896: {
                                    var0_2 ^= -895488309;
                                    ** continue;
                                }
                                case 647644286: 
                            }
                            var0_2 ^= 1408759486;
                        }
                        break;
                    }
                    case -896686960: 
                }
                break;
            }
            hs.a = (byte)new ConcurrentLinkedQueue<E>();
            return;
lbl97:
            // 2 sources

            while (true) {
                var0_2 ^= -75308705;
                ** continue;
                break;
            }
        }
        block21: while (true) {
            switch (var0_2) {
                case -884868656: {
                    var0_2 ^= 1286303729;
                    continue block21;
                }
                case 129836866: {
                    var0_2 ^= 1871316054;
                    ** GOTO lbl97
                }
            }
            break;
        }
        var0_2 ^= 1929364387;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static hs getInstance() {
        block9: {
            break block9;
lbl1:
            // 1 sources

            block5: while (true) {
                var2_1 = (var0 | -1553835784) ^ 53219184;
lbl3:
                // 2 sources

                block6: while (true) {
                    switch (var2_1) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block6;
                            }
                            break;
                        }
                        case -1606612568: {
                            break block5;
                        }
                        case -457025906: {
                            return hs.a;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var2_1 = (var0 | -1553835784) ^ 1205030998;
                            ** continue;
                            break;
                        }
                    }
                    break;
                }
                break;
            }
            var2_1 = (var0 | -1553835784) ^ -270243536;
            ** while (true)
            {
                ** case 134885582:
            }
lbl18:
            // 1 sources

            var1_2 ^= var2_1 ^ -1696129213;
            ** while (true)
        }
        var0 = hs.n & -1553835784 ^ -420609778;
        var2_1 = 0;
        var1_2 = (var0 | -1553835784) ^ -1360335632;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public hs() {
        var4_1 = 1050375425;
        var1_2 = hs.n & 1050375425 ^ 1900077811;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1186039937;
        var2_4 ^= 1007476625;
        super(hs.k, hs.s, dA.P);
        var3_3 = (var1_2 | var4_1) ^ -1329264646;
        ** GOTO lbl24
lbl9:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 253369662;
            if (true) ** GOTO lbl24
            break;
        }
        block28: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 1096997195;
            ** GOTO lbl24
lbl15:
            // 2 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -1341124669;
                if (true) ** GOTO lbl24
                break;
            }
            block30: while (true) {
                var3_3 = (var1_2 | var4_1) ^ 663604458;
                if (true) ** GOTO lbl24
                block31: while (true) {
                    this.a = this.addSetting(new gP(hs.d, 90.0f, 0.0f, 200.0f, 5.0f, hs.e).description(hs.b));
                    var3_3 = (var1_2 | var4_1) ^ 1799285549;
lbl24:
                    // 6 sources

                    block32: while (true) {
                        switch (var3_3) {
                            case 1031236567: {
                                var2_4 ^= var3_3 ^ 930730253;
                                ** GOTO lbl15
                            }
                            case 1482046233: {
                                var2_4 ^= var3_3 ^ 82063693;
                                var3_3 = (var1_2 | var4_1) ^ -693758143;
                                continue block32;
                            }
                            case -808716240: {
                                var3_3 = (var1_2 | var4_1) ^ -1363592719;
                                continue block32;
                            }
                            case 1500848890: {
                                var2_4 ^= var3_3 ^ -427493576;
                                var3_3 = (var1_2 | var4_1) ^ -2140073267;
                                continue block32;
                            }
                            case -5577410: {
                                this.a = (byte)new Long2ObjectOpenHashMap();
                                var3_3 = (var1_2 | var4_1) ^ 346224659;
                                continue block32;
                            }
                            case 1442363937: {
                                var2_4 ^= 2095601911;
                                var2_4 ^= -1849623986;
                                this.a = this.addSetting(new ke(hs.f, true).description(hs.c));
                                var3_3 = (var1_2 | var4_1) ^ 648992009;
                                continue block32;
                            }
                            case -160520859: {
                                var2_4 ^= var3_3 ^ 1632144085;
                                var3_3 = (var1_2 | var4_1) ^ 706956754;
                                continue block32;
                            }
                            case 409004176: {
                                var2_4 ^= var3_3 ^ 189377212;
                                ** GOTO lbl-1000
                            }
                            case 1284839216: {
                                var2_4 ^= var3_3 ^ 1161909411;
                                var3_3 = (var1_2 | var4_1) ^ -915946596;
                                continue block32;
                            }
                            case 379197815: {
                                var2_4 ^= var3_3 ^ 1151488180;
                                ** continue;
                            }
                            case -1451368270: {
                                this.a = new long[0];
                                var3_3 = (var1_2 | var4_1) ^ 1638956839;
                                continue block32;
                            }
                            case -820056055: {
                                var2_4 ^= var3_3 ^ -1081257238;
                                var3_3 = (var1_2 | var4_1) ^ -1683367534;
                                continue block32;
                            }
                            case -782053886: {
                                hs.a = this;
                                var3_3 = (var1_2 | var4_1) ^ 860807363;
                                continue block32;
                            }
                            case 350559454: {
                                var2_4 ^= var3_3 ^ -478030471;
                                ** continue;
                            }
                            case 1265800663: {
                                switch (var2_4) {
                                    default: {
                                        var3_3 = (var1_2 | var4_1) ^ 1118608420;
                                        continue block32;
                                    }
                                    case 1587286289: {
                                        var3_3 = (var1_2 | var4_1) ^ 1740316515;
                                        continue block32;
                                    }
                                    case -592810362: 
                                }
                                var3_3 = (var1_2 | var4_1) ^ 1765928580;
                                ** GOTO lbl104
                            }
                            case -462279071: {
                                var2_4 ^= 466539440;
                                var2_4 ^= -1190114041;
                                continue block31;
                            }
                            case 1052323512: {
                                this.a = new LongOpenHashSet();
                                continue block30;
                            }
                            case 1803096032: {
                                var2_4 ^= var3_3 ^ -1217418635;
                                continue block28;
                            }
                            case -1229179793: {
                                return;
                            }
                            case 510363860: lbl-1000:
                            // 2 sources

                            {
                                var3_3 = (var1_2 | var4_1) ^ 883515940;
                            }
lbl104:
                            // 3 sources

                            default: {
                                continue block32;
                            }
                            case 1891756749: 
                        }
                        var2_4 ^= 1896844706;
                        var2_4 ^= -927907522;
                        this.b = this.addSetting(new ke(hs.a, false).description(hs.g));
                        var3_3 = (var1_2 | var4_1) ^ -1984605546;
                    }
                    break;
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
    public static void offerLight(int var0, int var1_1, class_6606 var2_2) {
        var7_3 = -113949809;
        var4_4 = hs.n & -113949809 ^ 1303606714;
        var6_5 = 0;
        var5_7 = (var4_4 | var7_3) ^ -410124592;
        var6_5 = (var4_4 | var7_3) ^ 382106647;
        block19: while (true) {
            switch (var6_5) {
                case -1976828227: {
                    var5_7 ^= var6_5 ^ 1759098284;
                    var6_5 = (var4_4 | var7_3) ^ 1608011012;
                }
                default: {
                    continue block19;
                }
                case -1569768773: {
                    var3_6 = hs.a;
                    break block19;
                }
                case -344912984: {
                    ** break;
lbl18:
                    // 1 sources

                    var6_5 = (var4_4 | var7_3) ^ 2006747394;
                    continue block19;
                }
            }
            break;
        }
        var6_5 = (var4_4 | var7_3) ^ -1106043271;
        if (true) ** GOTO lbl27
        block20: while (true) {
            var6_5 = (var4_4 | var7_3) ^ 1415445961;
            if (true) ** GOTO lbl27
            block21: while (true) {
                var6_5 = (var4_4 | var7_3) ^ -1323914636;
lbl27:
                // 3 sources

                block22: while (true) {
                    switch (var6_5) {
                        default: {
                            continue block22;
                        }
                        case 500143031: {
                            var5_7 ^= var6_5 ^ -557441619;
                            var6_5 = (var4_4 | var7_3) ^ -873337983;
                            continue block22;
                        }
                        case -1444246922: {
                            var5_7 ^= var6_5 ^ -1306070631;
                            var6_5 = (var4_4 | var7_3) ^ -1665089453;
                            continue block22;
                        }
                        case -1998818367: {
                            var6_5 = (var4_4 | var7_3) ^ 216059890;
                            continue block22;
                        }
                        case -1493167988: {
                            var6_5 = (var4_4 | var7_3) ^ -1104431142;
                            continue block22;
                        }
                        case 1635235820: {
                            hs.a.offer(new aS(var0, var1_1, var2_2));
                            var6_5 = (var4_4 | var7_3) ^ -528948216;
                            continue block22;
                        }
                        case 1285676491: {
                            var5_7 ^= var6_5 ^ 425666093;
                            var6_5 = (var4_4 | var7_3) ^ 386236917;
                            continue block22;
                        }
                        case 1134346341: {
                            if (var3_6 == null) continue block21;
                            var6_5 = (var4_4 | var7_3) ^ 1969947774;
                            continue block22;
                        }
                        case 35512159: {
                            if (var2_2 == null) continue block21;
                            var6_5 = (var4_4 | var7_3) ^ 1521968947;
                            continue block22;
                        }
                        case -245909427: {
                            if (var3_6.isEnabled()) continue block20;
                            continue block21;
                        }
                        case 1134848454: {
                            var5_7 ^= var6_5 ^ 1681654050;
                            var6_5 = (var4_4 | var7_3) ^ -5592864;
                            continue block22;
                        }
                        case -357370294: {
                            return;
                        }
                        case 910597182: 
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void onEnable() {
        int n2 = -1333297173;
        int n3 = n & 0xB0877FEB ^ 0xBA6DB8B5;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x64FC6946;
        n4 = (n3 | n2) ^ 0xE1666806;
        boolean bl2 = true;
        block7: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0xF03ABB11;
            }
            block8: while (true) {
                switch (n4) {
                    case 443521180: {
                        this.OB();
                        n4 = (n3 | n2) ^ 0x73C2D517;
                        continue block8;
                    }
                    case -642383434: {
                        n5 ^= n4 ^ 0xEBE606A1;
                        n4 = (n3 | n2) ^ 0xA0806763;
                    }
                    default: {
                        continue block8;
                    }
                    case -919786776: {
                        n5 ^= n4 ^ 0x5D9BF08D;
                        continue block7;
                    }
                    case 1535743993: {
                        n4 = (n3 | n2) ^ 0x6359FE49;
                        continue block8;
                    }
                    case 1255490798: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onDisable() {
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
    private void OB() {
        block34: {
            block36: {
                block35: {
                    var4_1 = 650872634;
                    var1_2 = hs.n & 650872634 ^ 124099994;
                    var3_3 = 0;
                    ** GOTO lbl96
lbl5:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 467419405;
                        break block34;
                        break;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 513765143;
                        break block34;
lbl13:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1773652192;
                            break block34;
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            this.a.clear();
                            ** GOTO lbl80
                            break;
                        }
lbl19:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            this.a.clear();
                            ** continue;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -42670444;
                            ** GOTO lbl88
                            break;
                        }
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1148391506;
                        break block34;
                        break;
                    }
                    this.a = new long[0];
                    var3_3 = (var1_2 | var4_1) ^ -822008803;
                    break block34;
lbl33:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 578904771;
                        ** GOTO lbl86
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 591726913;
                        break block35;
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        hs.a.clear();
                        ** continue;
                        break;
                    }
lbl42:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -1656752686;
                        break block36;
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -1409575887;
                break block34;
                this.a = null;
                var3_3 = (var1_2 | var4_1) ^ -1534534466;
                break block34;
lbl51:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1812506582;
                    break block34;
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -1839578859;
        }
lbl57:
        // 2 sources

        block31: while (true) {
            switch (var3_3) lbl-1000:
            // 6 sources

            {
                while (true) {
                    default: {
                        continue block31;
                    }
                    break;
                }
                case -921561670: {
                    ** continue;
                }
                case 537879312: {
                    ** continue;
                }
                case -1944843381: {
                    ** continue;
                }
                case -1105819510: {
                    ** continue;
                }
                case 1010032311: {
                    ** continue;
                }
                case -2090384636: {
                    ** continue;
                }
                case 1045088055: {
                    ** continue;
                }
                case -1246372177: {
                    ** continue;
                }
                case 963702957: {
                    ** continue;
                }
lbl80:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 430266509;
                ** GOTO lbl-1000
                case -387007577: {
                    var2_4 ^= var3_3 ^ 440647549;
                }
                var3_3 = (var1_2 | var4_1) ^ -285373952;
                ** GOTO lbl-1000
lbl86:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -1984242578;
                ** GOTO lbl-1000
lbl88:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 132185258;
                ** GOTO lbl-1000
lbl90:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 770786630;
                    ** continue;
                    break;
                }
                case -1314412390: {
                    var2_4 ^= var3_3 ^ -462839932;
                    break block31;
                }
lbl96:
                // 1 sources

                var2_4 = (var1_2 | var4_1) ^ -46666920;
                ** continue;
                case -1273444464: {
                    return;
                }
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ -1711728848;
        ** while (true)
        {
            case 169794300: {
                ** continue;
            }
            case -1370143788: {
                this.l = 0;
                ** continue;
            }
            ** case -1671204844:
        }
lbl108:
        // 1 sources

        var2_4 ^= var3_3 ^ 388091963;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onTick(class_310 var1_1) {
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
    private void OC(class_310 var1_1, aS var2_2, int var3_3, int var4_4) {
        block42: {
            block43: {
                break block43;
lbl1:
                // 1 sources

                while (true) {
                    var12_7 = (var10_6 | var13_5) ^ 925741079;
                    break block42;
                    break;
                }
lbl4:
                // 2 sources

                while (true) {
                    var12_7 = (var10_6 | var13_5) ^ 2067310001;
                    break block42;
                    break;
                }
lbl7:
                // 1 sources

                while (true) {
                    var12_7 = (var10_6 | var13_5) ^ -1834760853;
                    break block42;
lbl10:
                    // 1 sources

                    while (true) {
                        var12_7 = (var10_6 | var13_5) ^ 221921220;
                        ** GOTO lbl16
                        break;
                    }
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var12_7 = (var10_6 | var13_5) ^ 1517484958;
                    break block42;
lbl16:
                    // 2 sources

                    block36: while (true) {
                        switch (var12_7) {
                            case 60760664: {
                                if (!hs.OF(var8_10, var4_4, var3_3)) ** GOTO lbl23
                                ** GOTO lbl32
                            }
                            case 1209776229: {
                                this.OG(var1_1, var5_8, var2_2.chunkX(), var2_2.chunkZ());
lbl23:
                                // 2 sources

                                var12_7 = (var10_6 | var13_5) ^ 796781577;
                                ** GOTO lbl37
                            }
                            case 255525203: {
                                hs.OD(var9_11.method_38601(), var9_11.method_38604(), var9_11.method_38606(), var8_10);
                                ** GOTO lbl39
                            }
                            case -942372878: {
                                var11_12 ^= var12_7 ^ 1862245536;
                                var12_7 = (var10_6 | var13_5) ^ -273236642;
                                ** GOTO lbl37
                            }
lbl32:
                            // 1 sources

                            var12_7 = (var10_6 | var13_5) ^ -733115739;
                            ** GOTO lbl37
                            case 2136460381: {
                                var11_12 ^= var12_7 ^ 865681319;
                                var12_7 = (var10_6 | var13_5) ^ -155010168;
                            }
lbl37:
                            // 9 sources

                            default: {
                                continue block36;
                            }
lbl39:
                            // 1 sources

                            var12_7 = (var10_6 | var13_5) ^ 1043152169;
                            continue block36;
                            case 766783614: {
                                var12_7 = (var10_6 | var13_5) ^ -1310588226;
                                ** GOTO lbl37
                            }
                            case 374278021: {
                                if (this.a.contains(var5_8)) ** GOTO lbl48
                                var12_7 = (var10_6 | var13_5) ^ -1934549958;
                                ** GOTO lbl37
lbl48:
                                // 1 sources

                                var12_7 = (var10_6 | var13_5) ^ -1872209617;
                                ** GOTO lbl37
                            }
                            case -695970094: {
                                var11_12 ^= var12_7 ^ 1061380519;
                                var12_7 = (var10_6 | var13_5) ^ 650662962;
                                ** GOTO lbl37
                            }
                            case 1771168756: {
                                var11_12 ^= var12_7 ^ 1818354732;
                                ** continue;
                            }
                            case 1967695585: {
                                var11_12 ^= var12_7 ^ -1952366399;
                                var12_7 = (var10_6 | var13_5) ^ -93939581;
                                continue block36;
                            }
                            case -188512993: {
                                return;
                            }
                            case -550375703: 
                        }
                        return;
                    }
                    break;
                }
lbl65:
                // 1 sources

                while (true) {
                    var11_12 ^= -2046986661;
                    var8_10 = (byte[])this.a.get(var5_8);
                    ** continue;
                    break;
                }
lbl69:
                // 2 sources

                while (true) {
                    var12_7 = (var10_6 | var13_5) ^ 1595140835;
                    break block42;
                    break;
                }
            }
            var13_5 = 142162585;
            var10_6 = hs.n & 142162585 ^ -239032245;
            var12_7 = 0;
            var11_12 = (var10_6 | var13_5) ^ -195197707;
            var12_7 = (var10_6 | var13_5) ^ 1473395598;
            block40: while (true) {
                switch (var12_7) {
                    default: {
                        continue block40;
                    }
                    case 497063945: {
                        var5_8 = class_1923.method_8331((int)var2_2.chunkX(), (int)var2_2.chunkZ());
                        var11_12 ^= -376427871;
                        ** break;
                    }
                    case -1372880555: {
                        var12_7 = (var10_6 | var13_5) ^ 2137206777;
                        continue block40;
                    }
lbl89:
                    // 1 sources

                    var7_9 = var3_3 + 2;
                    ** continue;
                    case -2036689630: 
                }
                var11_12 ^= var12_7 ^ -360810412;
                var12_7 = (var10_6 | var13_5) ^ -463920430;
            }
        }
        block41: while (true) {
            switch (var12_7) {
                default: {
                    continue block41;
                }
                case 1801093040: {
                    var9_11 = var2_2.data();
                    var12_7 = (var10_6 | var13_5) ^ -2035386746;
                    ** continue;
                }
                case -1494593480: {
                    var11_12 ^= var12_7 ^ 1264343254;
                    break;
                }
                case -273288459: {
                    if (var8_10.length == var7_9) ** GOTO lbl4
                    ** GOTO lbl69
                }
                case 499031882: {
                    this.a.put(var5_8, (Object)var8_10);
                    ** continue;
                }
                case -1110267987: {
                    var11_12 ^= var12_7 ^ 1348775747;
                    var12_7 = (var10_6 | var13_5) ^ -465099375;
                    continue block41;
                }
                case -2101272726: {
                    var11_12 ^= var12_7 ^ -3795996;
                    ** continue;
                }
                case -1532652658: {
                    var12_7 = (var10_6 | var13_5) ^ 374097966;
                    continue block41;
                }
                case -824964404: {
                    var11_12 ^= var12_7 ^ 451498804;
                    ** continue;
                }
                case 1012172505: {
                    var8_10 = new byte[var7_9];
                    var12_7 = (var10_6 | var13_5) ^ 1143676278;
                    continue block41;
                }
                case -1551154875: {
                    if (var8_10 != null) ** break;
                    ** continue;
                    var12_7 = (var10_6 | var13_5) ^ 1566320981;
                    continue block41;
                }
            }
            var12_7 = (var10_6 | var13_5) ^ -978502654;
        }
    }

    /*
     * Exception decompiling
     */
    private static void OD(BitSet var0, BitSet var1_1, List<byte[]> var2_2, byte[] var3_3) {
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
    private static byte OE(byte[] var0) {
        block63: {
            var10_1 = 2112581637;
            var7_2 = hs.n & 2112581637 ^ -1772996003;
            var9_3 = 0;
            var8_10 = (var7_2 | var10_1) ^ -477393817;
            var9_3 = (var7_2 | var10_1) ^ 1384293520;
            break block63;
lbl7:
            // 1 sources

            while (true) {
                var9_3 = (var7_2 | var10_1) ^ 334863232;
                ** GOTO lbl104
                break;
            }
lbl10:
            // 1 sources

            block46: while (true) {
                switch (var9_3) {
                    case 1376154149: {
                        var8_10 ^= var9_3 ^ 479080197;
                        var9_3 = (var7_2 | var10_1) ^ 1728940675;
                        continue block46;
                    }
                    case -65416888: {
                        if (var6_9 != -1) {
                            var9_3 = (var7_2 | var10_1) ^ -497313988;
                            continue block46;
                        }
                        ** GOTO lbl70
                    }
                    case 289671509: {
                        var1_4 = false;
                        ** GOTO lbl35
                    }
                    case -876839444: {
                        var9_3 = (var7_2 | var10_1) ^ -289443064;
                        continue block46;
                    }
                    case -1631185234: {
                        var8_10 ^= var9_3 ^ -402425391;
                        ** GOTO lbl47
                    }
                    case -1728646946: {
                        if (var1_4) ** GOTO lbl72
                        ** GOTO lbl39
                    }
                    case 1900831574: {
                        if (var6_9 != 0) ** GOTO lbl76
lbl35:
                        // 2 sources

                        var9_3 = (var7_2 | var10_1) ^ 940118675;
                    }
lbl36:
                    // 3 sources

                    default: {
                        continue block46;
                    }
                    {
                    }
lbl39:
                    // 1 sources

                    var9_3 = (var7_2 | var10_1) ^ 1067687875;
                    continue block46;
                    case 497085793: {
                        var9_3 = (var7_2 | var10_1) ^ 1923837002;
                        continue block46;
                    }
                    case 1420211620: {
                        var8_10 ^= var9_3 ^ 221939833;
                        ** GOTO lbl74
                    }
lbl47:
                    // 1 sources

                    var9_3 = (var7_2 | var10_1) ^ -278998611;
                    continue block46;
                    case -1067915874: {
                        var9_3 = (var7_2 | var10_1) ^ -1187395996;
                        continue block46;
                    }
                    case -940414770: {
                        var8_10 ^= var9_3 ^ 1659781462;
                        var9_3 = (var7_2 | var10_1) ^ 65186581;
                        ** GOTO lbl36
                    }
                    case 1371671195: {
                        var8_10 ^= var9_3 ^ 1016880431;
                        var9_3 = (var7_2 | var10_1) ^ -249721904;
                        continue block46;
                    }
                    case 1187167289: {
                        if (!var2_5) {
                            var9_3 = (var7_2 | var10_1) ^ -1371967290;
                            continue block46;
                        }
                        ** GOTO lbl72
                    }
                    case 279292912: {
                        ++var5_8;
                        ** GOTO lbl83
                    }
                    case -1924131305: {
                        var2_5 = false;
lbl70:
                        // 2 sources

                        var9_3 = (var7_2 | var10_1) ^ -1375926152;
                        continue block46;
                    }
lbl72:
                    // 2 sources

                    var9_3 = (var7_2 | var10_1) ^ 1631415539;
                    continue block46;
lbl74:
                    // 1 sources

                    var9_3 = (var7_2 | var10_1) ^ -1900603125;
                    continue block46;
lbl76:
                    // 1 sources

                    var9_3 = (var7_2 | var10_1) ^ 877070257;
                    continue block46;
lbl78:
                    // 1 sources

                    while (true) {
                        var8_10 ^= -357376475;
                        var3_6 = var0;
                        var4_7 = var3_6.length;
                        var5_8 = 0;
lbl83:
                        // 2 sources

                        var9_3 = (var7_2 | var10_1) ^ -1655869131;
                        ** GOTO lbl104
                        break;
                    }
                    case 250016141: 
                }
                break;
            }
            return 1;
lbl87:
            // 1 sources

            while (true) {
                var9_3 = (var7_2 | var10_1) ^ 497698335;
                ** GOTO lbl104
                break;
            }
lbl90:
            // 1 sources

            while (true) {
                var9_3 = (var7_2 | var10_1) ^ -1028549394;
                ** GOTO lbl104
                break;
            }
            while (true) {
                var9_3 = (var7_2 | var10_1) ^ -1187382100;
                break block63;
                break;
            }
            while (true) {
                var9_3 = (var7_2 | var10_1) ^ -1021040608;
                if (true) ** GOTO lbl104
                break;
            }
lbl99:
            // 2 sources

            while (true) {
                var9_3 = (var7_2 | var10_1) ^ -289904192;
                break block63;
                break;
            }
            block54: while (true) {
                var9_3 = (var7_2 | var10_1) ^ -546815104;
lbl104:
                // 6 sources

                block55: while (true) {
                    switch (var9_3) {
                        default: {
                            continue block55;
                        }
                        case 107330213: {
                            if (var1_4) {
                                var9_3 = (var7_2 | var10_1) ^ -662115564;
                                continue block55;
                            }
                            ** GOTO lbl156
                        }
                        case 1656097640: {
                            var8_10 ^= var9_3 ^ -1328837239;
                            ** continue;
                        }
                        case 1432562362: {
                            var8_10 ^= var9_3 ^ -372802920;
                            ** continue;
                        }
                        case 1021268605: {
                            var8_10 ^= var9_3 ^ -2139422113;
                            ** GOTO lbl158
                        }
                        case 1028320947: {
                            var8_10 ^= var9_3 ^ 737824328;
                            var9_3 = (var7_2 | var10_1) ^ 1881880682;
                            continue block55;
                        }
                        case -1010844482: {
                            if (!var2_5) ** continue;
                            var9_3 = (var7_2 | var10_1) ^ -1432858393;
                            continue block55;
                        }
                        case -497992638: {
                            if (var5_8 >= var4_7) continue block54;
                            ** continue;
                        }
                        case -1882176969: {
                            var6_9 = var3_6[var5_8];
                            var9_3 = (var7_2 | var10_1) ^ -1419915271;
                            ** continue;
                        }
                        case -668559511: {
                            var8_10 ^= var9_3 ^ 807150025;
                            var9_3 = (var7_2 | var10_1) ^ 1011140323;
                            continue block55;
                        }
                        case -334568995: {
                            v0 = 3;
                            ** GOTO lbl154
                        }
                        case 546519517: {
                            var8_10 ^= var9_3 ^ 731513690;
                            var9_3 = (var7_2 | var10_1) ^ -107036424;
                            continue block55;
                        }
                        case 661885257: {
                            var8_10 ^= var9_3 ^ 1649750912;
                            var9_3 = (var7_2 | var10_1) ^ -199150282;
                            continue block55;
                        }
                        case -1804526668: {
                            v0 = 1;
lbl154:
                            // 2 sources

                            var8_10 ^= 903413016;
                            return v0;
                        }
lbl156:
                        // 1 sources

                        var9_3 = (var7_2 | var10_1) ^ 668855604;
                        continue block55;
lbl158:
                        // 1 sources

                        var9_3 = (var7_2 | var10_1) ^ 1804231145;
                        continue block55;
                        case 198856555: 
                    }
                    break;
                }
                break;
            }
            return 2;
        }
        block56: while (true) {
            switch (var9_3) {
                default: {
                    continue block56;
                }
                case -48024670: {
                    var1_4 = true;
                    var8_10 ^= 2000463020;
                    var2_5 = true;
                    ** continue;
                }
                case -1839397229: {
                    if (var0.length == hs.OJ((var8_10 | var9_3 ^ -273254762) ^ (var9_3 ^ 2144146880), (var7_2 | var9_3 ^ -273254762) ^ ((var8_10 | var9_3 ^ -273254762) ^ (var9_3 ^ 2070604224)))) ** continue;
                    ** GOTO lbl99
                }
                case 228612385: {
                    var8_10 ^= var9_3 ^ -251188928;
                    var9_3 = (var7_2 | var10_1) ^ -378018602;
                    continue block56;
                }
                case -1384522035: {
                    var9_3 = (var7_2 | var10_1) ^ -228908164;
                    continue block56;
                }
                case 289608605: {
                    var8_10 ^= var9_3 ^ 1578167734;
                    var9_3 = (var7_2 | var10_1) ^ -1596786486;
                    continue block56;
                }
                case 378314379: {
                    if (var0 != null) ** break;
                    ** continue;
                    var9_3 = (var7_2 | var10_1) ^ 1545276276;
                    continue block56;
                }
                case 1187153649: {
                    var8_10 ^= var9_3 ^ 1500350604;
                    var9_3 = (var7_2 | var10_1) ^ 47729151;
                    continue block56;
                }
                case -1545572055: {
                    var9_3 = (var7_2 | var10_1) ^ 1839627470;
                    continue block56;
                }
                case 1596555927: 
            }
            break;
        }
        return 0;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean OF(byte[] var0, int var1_1, int var2_2) {
        block53: {
            var9_3 = 859719887;
            var6_4 = hs.n & 859719887 ^ 185118716;
            var8_5 = 0;
            var7_6 = (var6_4 | var9_3) ^ -1102727533;
            var8_5 = (var6_4 | var9_3) ^ 168128076;
            break block53;
            {
                switch (var8_5) {
                    case 1584417049: {
                        var7_6 ^= var8_5 ^ 1859354444;
                        var8_5 = (var6_4 | var9_3) ^ 972000802;
                        continue block38;
                    }
                    case 47276509: {
                        var4_8 = (var1_1 + var3_7 - 1) * hs.OJ((var7_6 | var8_5 ^ 837757202) ^ (var8_5 ^ 557907247), (var6_4 | var8_5 ^ 837757202) ^ ((var7_6 | var8_5 ^ 837757202) ^ (var8_5 ^ -698564714)));
                        var5_9 = var4_8 + hs.OJ(((var7_6 ^= 1131559443) | var9_3) ^ 1674686181, (var6_4 | var9_3) ^ ((var7_6 | var9_3) ^ 1150516515));
                        var8_5 = (var6_4 | var9_3) ^ -94885989;
                        ** GOTO lbl83
                    }
                    case 162156113: {
                        if (var3_7 > var2_2) ** GOTO lbl23
                        ** GOTO lbl25
                    }
                    case 393127086: {
                        var7_6 ^= var8_5 ^ -1763373934;
                        ** GOTO lbl31
                    }
lbl23:
                    // 1 sources

                    var8_5 = (var6_4 | var9_3) ^ 743459665;
                    continue block38;
lbl25:
                    // 1 sources

                    var8_5 = (var6_4 | var9_3) ^ 1699653350;
                    continue block38;
                    case -1863884019: {
                        var7_6 ^= var8_5 ^ 1284609398;
                        var8_5 = (var6_4 | var9_3) ^ 848601518;
                        continue block38;
                    }
lbl31:
                    // 1 sources

                    var8_5 = (var6_4 | var9_3) ^ -859628572;
                    continue block38;
lbl33:
                    // 2 sources

                    default: {
                        continue block38;
                    }
lbl35:
                    // 4 sources

                    while (true) {
                        var8_5 = (var6_4 | var9_3) ^ -1375860180;
                        ** GOTO lbl83
lbl38:
                        // 1 sources

                        while (true) {
                            var8_5 = (var6_4 | var9_3) ^ 880414549;
                            ** GOTO lbl83
                            break;
                        }
                        break;
                    }
                    case -134351845: 
                }
            }
            return false;
lbl43:
            // 1 sources

            while (true) {
                var8_5 = (var6_4 | var9_3) ^ 836009689;
                ** GOTO lbl83
                while (true) {
                    var8_5 = (var6_4 | var9_3) ^ 599477789;
                    ** GOTO lbl83
                    break;
                }
                break;
            }
lbl49:
            // 1 sources

            while (true) {
                var8_5 = (var6_4 | var9_3) ^ 122703562;
                break block53;
lbl52:
                // 2 sources

                while (true) {
                    var8_5 = (var6_4 | var9_3) ^ -1411805966;
                    ** GOTO lbl33
                    break;
                }
                break;
            }
lbl55:
            // 1 sources

            while (true) {
                var8_5 = (var6_4 | var9_3) ^ 1057480684;
                ** GOTO lbl83
lbl58:
                // 2 sources

                while (true) {
                    var8_5 = (var6_4 | var9_3) ^ -146392025;
                    ** GOTO lbl83
lbl61:
                    // 2 sources

                    while (true) {
                        var8_5 = (var6_4 | var9_3) ^ -797642613;
                        if (true) ** GOTO lbl83
                        break;
                    }
                    break;
                }
                break;
            }
        }
        block49: while (true) {
            switch (var8_5) {
                default: {
                    continue block49;
                }
                case 825983411: {
                    var8_5 = (var6_4 | var9_3) ^ -903131167;
                    continue block49;
                }
                case 1013883189: {
                    var3_7 = 1;
                    ** GOTO lbl52
                }
                case -250240994: 
            }
            break;
        }
        var7_6 ^= var8_5 ^ -2005974931;
        ** while (true)
        block50: while (true) {
            var8_5 = (var6_4 | var9_3) ^ 1541242216;
            if (true) ** GOTO lbl83
            block51: while (true) {
                var8_5 = (var6_4 | var9_3) ^ -313011655;
lbl83:
                // 10 sources

                block52: while (true) {
                    switch (var8_5) {
                        default: {
                            continue block52;
                        }
                        case -347463820: {
                            var8_5 = (var6_4 | var9_3) ^ 980070491;
                            continue block52;
                        }
                        case -1539930804: {
                            var7_6 ^= var8_5 ^ -1020482492;
                            var8_5 = (var6_4 | var9_3) ^ 1800751077;
                            continue block52;
                        }
                        case -697745978: {
                            if (var5_9 < hs.OJ((var7_6 | var8_5 ^ -447253239) ^ (var8_5 ^ -1321729488), (var6_4 | var8_5 ^ -447253239) ^ ((var7_6 | var8_5 ^ -447253239) ^ (var8_5 ^ -1734876496)))) ** continue;
                            var8_5 = (var6_4 | var9_3) ^ -1626838349;
                            continue block52;
                        }
                        case 183144742: {
                            var7_6 ^= var8_5 ^ 1844492334;
                            continue block51;
                        }
                        case 411410914: {
                            ** GOTO lbl58
                        }
                        case -1765743149: {
                            var7_6 ^= var8_5 ^ 1539698614;
                            var8_5 = (var6_4 | var9_3) ^ 1159154234;
                            continue block52;
                        }
                        case -2028017311: {
                            var7_6 ^= var8_5 ^ 1020188565;
                            ** GOTO lbl61
                        }
                        case -1050228636: {
                            var7_6 ^= var8_5 ^ -1547421636;
                            var8_5 = (var6_4 | var9_3) ^ 1771446413;
                            continue block52;
                        }
                        case 1653843104: {
                            var7_6 ^= var8_5 ^ -503433061;
                            ** continue;
                        }
                        case 1349232666: {
                            ** GOTO lbl35
                        }
                        case 2116658629: {
                            ++var3_7;
                            ** continue;
                        }
                        case 1625526935: {
                            var7_6 ^= var8_5 ^ -1781786530;
                            ** continue;
                        }
                        case 1386794866: {
                            if (var5_9 < hs.OJ((var7_6 | var8_5 ^ 1637255101) ^ (var8_5 ^ 1912197510), (var6_4 | var8_5 ^ 1637255101) ^ ((var7_6 | var8_5 ^ 1637255101) ^ (var8_5 ^ -931469518)))) ** GOTO lbl35
                            ** continue;
                        }
                        case 256172202: {
                            var8_5 = (var6_4 | var9_3) ^ -580849665;
                            continue block52;
                        }
                        case -430047232: {
                            if (var4_8 > hs.OJ((var7_6 | var8_5 ^ -715110193) ^ (var8_5 ^ -988864777), (var6_4 | var8_5 ^ -715110193) ^ ((var7_6 | var8_5 ^ -715110193) ^ (var8_5 ^ 552005684)))) ** GOTO lbl35
                            ** continue;
                        }
                        case -155343456: {
                            var7_6 ^= var8_5 ^ -1851290456;
                            ** continue;
                        }
                        case 22306724: {
                            if (var0[var3_7] == 2) ** break;
                            ** continue;
                            continue block50;
                        }
                        case -864496680: {
                            switch (var7_6) {
                                default: {
                                    var8_5 = (var6_4 | var9_3) ^ 1504529247;
                                    continue block52;
                                }
                                case 1444846194: {
                                    var8_5 = (var6_4 | var9_3) ^ -847033761;
                                    continue block52;
                                }
                                case -1234279515: 
                            }
                            var8_5 = (var6_4 | var9_3) ^ -1138751842;
                            continue block52;
                        }
                        case 70856723: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private void OG(class_310 var1_1, long var2_2, int var4_3, int var5_4) {
        block60: {
            block57: {
                block63: {
                    block62: {
                        block58: {
                            block61: {
                                block59: {
                                    var11_5 = -411975687;
                                    var8_6 = hs.n & -411975687 ^ -1088449820;
                                    var10_7 = 0;
                                    ** GOTO lbl96
                                    while (true) {
                                        var10_7 = (var8_6 | var11_5) ^ -1270215399;
                                        break block57;
                                        break;
                                    }
lbl8:
                                    // 1 sources

                                    while (true) {
                                        var9_8 ^= var10_7 ^ 767573033;
                                        break block58;
                                        break;
                                    }
lbl11:
                                    // 1 sources

                                    while (true) {
                                        continue;
lbl13:
                                        // 1 sources

                                        while (true) {
                                            var10_7 = (var8_6 | var11_5) ^ -2075450467;
                                            break block59;
                                            break;
                                        }
lbl16:
                                        // 1 sources

                                        while (true) {
                                            var10_7 = (var8_6 | var11_5) ^ -919626235;
                                            break block59;
                                            break;
                                        }
                                        break;
                                    }
lbl19:
                                    // 1 sources

                                    while (true) {
                                        var10_7 = (var8_6 | var11_5) ^ -891398654;
                                        break block57;
                                        break;
                                    }
lbl22:
                                    // 2 sources

                                    while (true) {
                                        var10_7 = (var8_6 | var11_5) ^ 937366637;
                                        break block57;
                                        break;
                                    }
lbl25:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    while (true) {
                                        var10_7 = (var8_6 | var11_5) ^ -2030036567;
                                        break block57;
                                        break;
                                    }
lbl30:
                                    // 1 sources

                                    while (true) {
                                        var9_8 ^= var10_7 ^ -711565336;
                                        ** GOTO lbl72
                                        break;
                                    }
lbl33:
                                    // 1 sources

                                    while (true) {
                                        var10_7 = (var8_6 | var11_5) ^ 1653174590;
                                        break block57;
                                        break;
                                    }
lbl36:
                                    // 1 sources

                                    return;
lbl38:
                                    // 1 sources

                                    while (true) {
                                        var9_8 ^= var10_7 ^ 74571319;
                                        ** continue;
                                        break;
                                    }
lbl41:
                                    // 1 sources

                                    while (true) {
                                        var10_7 = (var8_6 | var11_5) ^ 2084636564;
                                        break block57;
                                        break;
                                    }
lbl44:
                                    // 1 sources

                                    while (true) {
                                        var10_7 = (var8_6 | var11_5) ^ -544432582;
                                        break block57;
                                        break;
                                    }
lbl47:
                                    // 1 sources

                                    while (true) {
                                        var9_8 ^= var10_7 ^ -1737082243;
                                        ** GOTO lbl88
                                        break;
                                    }
                                    var7_10 = (var5_4 << 4) + hs.OJ(((var9_8 ^= 581644555) | var11_5) ^ -417457411, (var8_6 | var11_5) ^ ((var9_8 | var11_5) ^ -1778582700));
                                    var10_7 = (var8_6 | var11_5) ^ -1885154527;
                                    break block59;
lbl53:
                                    // 1 sources

                                    while (true) {
                                        var9_8 ^= var10_7 ^ -1405467198;
                                        ** GOTO lbl90
                                        break;
                                    }
                                }
                                block42: while (true) {
                                    switch (var10_7) lbl-1000:
                                    // 4 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block42;
                                            }
                                            break;
                                        }
                                        case 911221240: {
                                            ** continue;
                                        }
                                        case 1893559516: {
                                            ** continue;
                                        }
lbl66:
                                        // 1 sources

                                        while (true) {
                                            var10_7 = (var8_6 | var11_5) ^ -631922124;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl69:
                                        // 1 sources

                                        while (true) {
                                            var10_7 = (var8_6 | var11_5) ^ -155622108;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl72:
                                        // 1 sources

                                        var10_7 = (var8_6 | var11_5) ^ 1178190302;
                                        ** continue;
lbl74:
                                        // 1 sources

                                        while (true) {
                                            if (this.a.add(var2_2)) ** continue;
                                            ** GOTO lbl22
                                            break;
                                        }
lbl77:
                                        // 1 sources

                                        while (true) {
                                            var9_8 ^= var10_7 ^ 1593100728;
                                            ** GOTO lbl83
                                            break;
                                        }
                                        case 623517129: {
                                            var9_8 ^= var10_7 ^ 2062222300;
                                            ** continue;
                                        }
lbl83:
                                        // 1 sources

                                        var10_7 = (var8_6 | var11_5) ^ 1204107129;
                                        break block57;
lbl85:
                                        // 1 sources

                                        while (true) {
                                            this.OH();
                                            break block60;
                                            break;
                                        }
lbl88:
                                        // 1 sources

                                        var10_7 = (var8_6 | var11_5) ^ 1211846073;
                                        break block57;
lbl90:
                                        // 1 sources

                                        var10_7 = (var8_6 | var11_5) ^ -1238371753;
                                        break block57;
lbl92:
                                        // 1 sources

                                        while (true) {
                                            if (this.a.size() < hs.OJ((var9_8 | var10_7 ^ -1373506989) ^ (var10_7 ^ -1102833839), (var8_6 | var10_7 ^ -1373506989) ^ ((var9_8 | var10_7 ^ -1373506989) ^ (var10_7 ^ -2025575338)))) ** break;
                                            ** continue;
                                            break block61;
                                            break;
                                        }
lbl96:
                                        // 1 sources

                                        var9_8 = (var8_6 | var11_5) ^ -1710375812;
                                        break block62;
lbl98:
                                        // 1 sources

                                        return;
                                        case -1186562525: {
                                            break block42;
                                        }
                                        case 164027097: {
                                            return;
                                        }
lbl104:
                                        // 1 sources

                                        while (true) {
                                            var9_8 ^= 2121669171;
                                            break block63;
                                            break;
                                        }
                                    }
                                    break;
                                }
                                var9_8 ^= -152290073;
                                ** while (true)
lbl109:
                                // 1 sources

                                while (true) {
                                    var9_8 ^= var10_7 ^ -651791689;
                                    ** continue;
                                    break;
                                }
lbl112:
                                // 1 sources

                                while (true) {
                                    if (((Boolean)this.a.getValue()).booleanValue()) ** continue;
                                    ** continue;
                                    break;
                                }
                                {
                                    ** case 2067045472:
                                }
lbl116:
                                // 1 sources

                                jH.module(this, var6_9 + " 64 " + var7_10);
                                ** while (true)
lbl118:
                                // 1 sources

                                while (true) {
                                    var10_7 = (var8_6 | var11_5) ^ -143885838;
                                    break block57;
                                    break;
                                }
                            }
                            var10_7 = (var8_6 | var11_5) ^ 1426382891;
                            break block57;
lbl124:
                            // 1 sources

                            while (true) {
                                var9_8 ^= var10_7 ^ 2000305889;
                                ** continue;
                                break;
                            }
                        }
                        var10_7 = (var8_6 | var11_5) ^ 1696392563;
                        break block57;
                        var6_9 = (var4_3 << 4) + hs.OJ((var9_8 | var10_7 ^ 2098390391) ^ (var10_7 ^ 2113355890), (var8_6 | var10_7 ^ 2098390391) ^ ((var9_8 | var10_7 ^ 2098390391) ^ (var10_7 ^ 608496931)));
                        ** while (true)
                    }
                    var10_7 = (var8_6 | var11_5) ^ -1846074246;
                    break block57;
                }
                var1_1.method_1483().method_4873((class_1113)class_1109.method_4757((class_3414)((class_3414)class_3417.field_14622.comp_349()), (float)1.5f, (float)0.8f));
                ** while (true)
            }
lbl140:
            // 2 sources

            block56: while (true) {
                switch (var10_7) {
                    default: {
                        continue block56;
                    }
                    case 2021631572: {
                        ** continue;
                    }
                    case -1704764786: {
                        ** continue;
                    }
                    case -1434755114: {
                        ** continue;
                    }
                    case -1220218300: {
                        ** continue;
                    }
                    case 899803647: {
                        ** continue;
                    }
                    case 135513615: {
                        ** continue;
                    }
                    case 1854446471: {
                        ** continue;
                    }
                    case -1644769597: {
                        ** continue;
                    }
                    case 1261810404: {
                        ** continue;
                    }
                    case -1195734908: {
                        ** continue;
                    }
                    case 1229999530: {
                        ** continue;
                    }
                    case 552804807: {
                        ** continue;
                    }
                    case 243815648: {
                        ** continue;
                    }
                    case -2093041559: {
                        ** continue;
                    }
                    ** case -928994416:
lbl173:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        var10_7 = (var8_6 | var11_5) ^ -235410659;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void OH() {
        int n2 = -1702583625;
        int n3 = n & 0x9A84A2B7 ^ 0x3EA31C88;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xA7689F0E;
        n4 = (n3 | n2) ^ 0x6EC39E2A;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -2082663853: {
                    this.a = this.a.toLongArray();
                    n4 = (n3 | n2) ^ 0xA4C0A065;
                    continue block7;
                }
                case 442965722: {
                    n5 ^= n4 ^ 0xF9900BF1;
                    n4 = (n3 | n2) ^ 0x20D705C;
                    continue block7;
                }
                case -798744427: {
                    n4 = (n3 | n2) ^ 0xF2AA3A5C;
                    continue block7;
                }
                case 1275954403: {
                    n5 ^= n4 ^ 0xECFE0606;
                    n4 = (n3 | n2) ^ 0x3D7AACEC;
                    continue block7;
                }
                case -1129656605: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void OI(class_1923 var1_1) {
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
    public void render(WorldRenderContext var1_1, class_310 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [196[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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

    private static int OJ(int n2, int n3) {
        int n4 = 1579501846;
        int n5 = -795032755;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xCED22E51)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xDEBD90B9;
        n6 += (n5 | n4) ^ 0xDEBD6FB3;
        n6 += (n5 | n4) ^ 0xDEBDB018;
        n6 -= (n5 | n4) ^ 0xDEBDCE37;
        n6 ^= (n5 | n4) ^ 0xDEBD823B;
        n6 += (n5 | n4) ^ 0xDEBD3EDD;
        n6 ^= (n5 | n4) ^ 0xDEBDB102;
        n6 += (n5 | n4) ^ 0xDEBD7188;
        n6 ^= (n5 | n4) ^ 0xDEBDA124;
        return n6 ^= (n5 | n4) ^ 0xDEBD480D;
    }

    /*
     * Exception decompiling
     */
    private static void OK(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7) {
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
    private static void OL(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        block35: {
            var19_7 = -1200732660;
            var18_8 = 1231080631;
            var17_9 = 83654452;
            var14_10 = hs.n & -1200732660 ^ -121375807;
            var16_11 = 0;
            var15_18 = (var14_10 | var19_7) ^ -910702655;
            var16_11 = (var14_10 | var19_7) ^ -668915142;
            if (true) ** GOTO lbl24
lbl9:
            // 1 sources

            while (true) {
                var16_11 = (var14_10 | var19_7) ^ -1563888654;
                ** GOTO lbl97
lbl12:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
                break;
            }
lbl14:
            // 1 sources

            while (true) {
                var16_11 = (var14_10 | var19_7) ^ -174647920;
                ** GOTO lbl97
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                var15_18 ^= 1229728664;
                var12_16 = 1.0f;
                var16_11 = (var14_10 | var19_7) ^ -767875843;
                ** GOTO lbl87
                break;
            }
            block27: while (true) {
                var16_11 = (var14_10 | var19_7) ^ 1449033306;
lbl24:
                // 2 sources

                block28: while (true) {
                    switch (var16_11) {
                        case 550428151: {
                            var16_11 = (var14_10 | var19_7) ^ 314718829;
                        }
                        default: {
                            continue block28;
                        }
                        case -1364096617: {
                            var7_12 = var4_4 - var2_2;
                            var15_18 ^= -480196252;
                            break block27;
                        }
                        case -366096992: {
                            var15_18 ^= var16_11 ^ 843228331;
                            continue block27;
                        }
                    }
                    break;
                }
                break;
            }
            var8_13 = var5_5 - var3_3;
            var15_18 ^= -1916602865;
            var9_14 = Math.sqrt(var7_12 * var7_12 + var8_13 * var8_13);
            var15_18 ^= -27396245;
            var11_15 = 0.0f;
            ** while (true)
            var16_11 = (var14_10 | var19_7) ^ -945036299;
            block29: while (true) {
                switch (var16_11) {
                    case 1694461960: {
                        var15_18 ^= var16_11 ^ 1543103756;
                        var16_11 = (var14_10 | var19_7) ^ 1149093621;
                        continue block29;
                    }
                    case -1698737390: {
                        var15_18 ^= var16_11 ^ -676402311;
                        ** break;
                    }
                    case -1131269832: {
                        var0.method_22918((Matrix4fc)var1_1, var2_2, 64.0f, var3_3).method_1336(hs.OJ((var15_18 | var16_11 ^ var17_9) ^ (var16_11 ^ 269650800), (var14_10 | var16_11 ^ var17_9) ^ ((var15_18 | var16_11 ^ var17_9) ^ (var16_11 ^ -1665780137))), hs.OJ((var15_18 | var16_11 ^ var17_9) ^ (var16_11 ^ 269650801), (var14_10 | var16_11 ^ var17_9) ^ ((var15_18 | var16_11 ^ var17_9) ^ (var16_11 ^ 1328163239))), hs.OJ((var15_18 | var16_11 ^ var17_9) ^ (var16_11 ^ 269650802), (var14_10 | var16_11 ^ var17_9) ^ ((var15_18 | var16_11 ^ var17_9) ^ (var16_11 ^ 1121555682))), var6_6).method_22914(var11_15, 0.0f, var12_16).method_75298(2.0f);
                        var16_11 = (var14_10 | var19_7) ^ 2123915375;
                        continue block29;
                    }
                    case -2038982750: {
                        var15_18 ^= var16_11 ^ -2085795841;
                        var16_11 = (var14_10 | var19_7) ^ 165772662;
                        continue block29;
                    }
                    case 722248729: {
                        var13_17 = (float)(1.0 / var9_14);
                        var16_11 = (var14_10 | var19_7) ^ -1492425358;
                        if (true) ** GOTO lbl97
                    }
                    case 1063692076: {
                        if (var9_14 > 1.0E-5) {
                            ** continue;
                        }
                        break block35;
                    }
lbl70:
                    // 1 sources

                    var16_11 = (var14_10 | var19_7) ^ 680766921;
                    ** GOTO lbl87
                    case 1061426232: {
                        var15_18 ^= var16_11 ^ 1028748870;
                        ** GOTO lbl85
                    }
                    case -250705221: {
                        var0.method_22918((Matrix4fc)var1_1, var4_4, 64.0f, var5_5).method_1336(hs.OJ((var15_18 | var16_11 ^ var18_8) ^ (var16_11 ^ 1478402209), (var14_10 | var16_11 ^ var18_8) ^ ((var15_18 | var16_11 ^ var18_8) ^ (var16_11 ^ 798222859))), hs.OJ((var15_18 | var16_11 ^ var18_8) ^ (var16_11 ^ 1478402214), (var14_10 | var16_11 ^ var18_8) ^ ((var15_18 | var16_11 ^ var18_8) ^ (var16_11 ^ -1334266815))), hs.OJ((var15_18 | var16_11 ^ var18_8) ^ (var16_11 ^ 1478402215), (var14_10 | var16_11 ^ var18_8) ^ ((var15_18 | var16_11 ^ var18_8) ^ (var16_11 ^ -453456701))), var6_6).method_22914(var11_15, 0.0f, var12_16).method_75298(2.0f);
                        var16_11 = (var14_10 | var19_7) ^ 1649452255;
                        ** GOTO lbl87
                    }
                    case 718590768: {
                        var15_18 ^= var16_11 ^ 834380225;
                        ** break;
lbl83:
                        // 1 sources

                        var16_11 = (var14_10 | var19_7) ^ -947302175;
                        ** GOTO lbl87
                    }
lbl85:
                    // 1 sources

                    var16_11 = (var14_10 | var19_7) ^ -740076588;
                    continue block29;
lbl87:
                    // 6 sources

                    default: {
                        continue block29;
                    }
                    case -797156860: 
                }
                break;
            }
            return;
        }
lbl92:
        // 2 sources

        while (true) {
            var16_11 = (var14_10 | var19_7) ^ -1676638267;
            ** GOTO lbl87
            break;
        }
        block32: while (true) {
            var16_11 = (var14_10 | var19_7) ^ 1062789565;
lbl97:
            // 4 sources

            block33: while (true) {
                switch (var16_11) {
                    default: {
                        continue block33;
                    }
                    case -944302480: {
                        var12_16 = var8_13 * var13_17;
                        ** continue;
                    }
                    case 1608815295: {
                        var15_18 ^= var16_11 ^ 835204785;
                        ** continue;
                    }
                    case 226026077: {
                        var15_18 ^= var16_11 ^ 1631659053;
                        continue block32;
                    }
                    case 1512506431: 
                }
                break;
            }
            break;
        }
        var11_15 = var7_12 * var13_17;
        ** while (true)
    }
}

