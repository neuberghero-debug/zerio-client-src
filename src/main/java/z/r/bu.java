/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents$Load
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents$Disconnect
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1792
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_2487
 *  net.minecraft.class_2591
 *  net.minecraft.class_2622
 *  net.minecraft.class_2672
 *  net.minecraft.class_2818
 *  net.minecraft.class_310
 *  net.minecraft.class_4588
 *  net.minecraft.class_634
 *  net.minecraft.class_638
 *  net.minecraft.class_6603$class_6605
 *  net.minecraft.class_7923
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2487;
import net.minecraft.class_2591;
import net.minecraft.class_2622;
import net.minecraft.class_2672;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_4588;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_6603;
import net.minecraft.class_7923;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import z.r.aE;
import z.r.az;
import z.r.gF;
import z.r.gP;
import z.r.gj;
import z.r.iG;
import z.r.jE;
import z.r.ke;
import z.r.ku;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class bu
extends gF {
    private final aE a;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private final gP a;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private final ke a;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String k;
    private final Map<String, ku> a;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private static final /* synthetic */ String x;
    private static final int a;
    private static final /* synthetic */ String y;
    private static final /* synthetic */ String z;
    private static final /* synthetic */ String A;
    private final Map<Long, jE> b;
    private static final /* synthetic */ String B;
    private static final /* synthetic */ String C;
    private static final /* synthetic */ String D;
    private static final /* synthetic */ String E;
    private static final /* synthetic */ String F;
    private static final /* synthetic */ String G;
    private static final /* synthetic */ String H;
    private static final /* synthetic */ String I;
    private static final float a;
    private static final /* synthetic */ String J;
    private static final /* synthetic */ String K;
    private static final /* synthetic */ String L;
    private static final /* synthetic */ String M;
    private static final /* synthetic */ String N;
    private static final /* synthetic */ String O;
    private final ku a;
    private static final /* synthetic */ String P;
    private static final /* synthetic */ String Q;
    private final iG a;
    private static final /* synthetic */ String R;
    private static final /* synthetic */ String S;
    private final az a;
    private static final /* synthetic */ String T;
    private static final /* synthetic */ String U;
    private static final /* synthetic */ String V;
    private static final /* synthetic */ String W;
    private static final /* synthetic */ String X;
    private static volatile bu a;
    private static final /* synthetic */ String Y;
    private static final /* synthetic */ String Z;
    private static final /* synthetic */ String aa;
    private static final /* synthetic */ String ab;
    private static final /* synthetic */ String ac;
    private static final /* synthetic */ String ad;
    private final gP b;
    private final ke b;
    private static final /* synthetic */ String ae;
    public static final int b;
    private static final int[] a;
    private static final /* synthetic */ String af;
    private static final /* synthetic */ String ag;
    private static final /* synthetic */ String ah;

    /*
     * Enabled aggressive block sorting
     */
    public static bu getInstance() {
        int n2 = b & 0x1D96FF8A ^ 0x21B95480;
        int n3 = 0;
        int n4 = (n2 | 0x1D96FF8A) ^ 0x26F054F7;
        n3 = (n2 | 0x1D96FF8A) ^ 0x1DE5F5A6;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -2021660420: {
                    n4 ^= n3 ^ 0xAA3A0CD9;
                    n3 = (n2 | 0x1D96FF8A) ^ 0x4C35BD6E;
                    continue block5;
                }
                case 1904886500: {
                    return a;
                }
                case 542771756: 
            }
            n3 = (n2 | 0x1D96FF8A) ^ 0xBAC01776;
        }
    }

    /*
     * Exception decompiling
     */
    public bu() {
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
    public iG getBlockEntitiesGroup() {
        block9: {
            var1_1 = bu.b & -1196723032 ^ -840194171;
            var3_2 = 0;
            ** GOTO lbl17
lbl4:
            // 1 sources

            block5: while (true) {
                switch (var3_2) lbl-1000:
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
                        var3_2 = (var1_1 | -1196723032) ^ 392226097;
                        ** GOTO lbl-1000
                        break;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | -1196723032) ^ -1400546884;
                        ** continue;
                        break;
                    }
                    case -1830261739: {
                        ** continue;
                    }
lbl17:
                    // 1 sources

                    var2_3 = (var1_1 | -1196723032) ^ 1380606290;
                    break block9;
                    case -359984484: {
                        var2_3 ^= var3_2 ^ -177747615;
                        ** continue;
                    }
                    case 1366208017: 
                }
                break;
            }
            return this.a;
        }
        var3_2 = (var1_1 | -1196723032) ^ 1862507448;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private ku py(String var1_1, String var2_2, class_1792 var3_3, int var4_4, boolean var5_5) {
        block14: {
            break block14;
lbl1:
            // 1 sources

            while (true) {
                var9_8 = (var7_7 | var10_6) ^ -1483628928;
                block12: while (true) {
                    switch (var9_8) {
                        case 1514809182: {
                            var8_9 ^= var9_8 ^ 409661687;
                            var9_8 = (var7_7 | var10_6) ^ -1215955489;
                            continue block12;
                        }
                        case 1247691777: {
                            this.a.put(var1_1, var6_10);
                            var9_8 = (var7_7 | var10_6) ^ 826717977;
                            ** break;
                        }
                        case -862122297: {
                            var8_9 ^= var9_8 ^ -1229703638;
                            var9_8 = (var7_7 | var10_6) ^ -1314933640;
                        }
lbl17:
                        // 3 sources

                        default: {
                            continue block12;
                        }
                        case 1279528358: 
                    }
                    break;
                }
                return var6_10;
            }
        }
        var10_6 = -1126622754;
        var7_7 = bu.b & -1126622754 ^ 1975691344;
        var9_8 = 0;
        var8_9 = (var7_7 | var10_6) ^ -1102300550;
        var9_8 = (var7_7 | var10_6) ^ 1633028310;
        block13: while (true) {
            switch (var9_8) {
                default: {
                    continue block13;
                }
                case 1540133721: {
                    var8_9 ^= var9_8 ^ 1398070373;
                    var9_8 = (var7_7 | var10_6) ^ -460908309;
                    continue block13;
                }
                case -1668435704: {
                    var9_8 = (var7_7 | var10_6) ^ -1508431225;
                    continue block13;
                }
                case 425500981: 
            }
            break;
        }
        var6_10 = this.pz(var2_2, var3_3, var4_4, var5_5);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private ku pz(String var1_1, class_1792 var2_2, int var3_3, boolean var4_4) {
        var11_5 = 393360342;
        var8_6 = bu.b & 393360342 ^ -1711676395;
        var10_7 = 0;
        var9_8 = (var8_6 | var11_5) ^ 1619824199;
        var10_7 = (var8_6 | var11_5) ^ 408637383;
        ** GOTO lbl32
lbl7:
        // 1 sources

        while (true) {
            var10_7 = (var8_6 | var11_5) ^ 1457171770;
            if (true) ** GOTO lbl32
            break;
        }
        block12: while (true) {
            var9_8 ^= 1101923482;
            var7_11 = var5_9.add(new az(bu.t, var3_3));
            var10_7 = (var8_6 | var11_5) ^ -47036925;
            if (true) ** GOTO lbl30
            block13: while (true) {
                switch (var10_7) {
                    case 1657385428: {
                        var9_8 ^= var10_7 ^ -1786587980;
                        ** break;
                    }
                    case 1477896132: {
                        this.a.add(var5_9);
                        var10_7 = (var8_6 | var11_5) ^ 183723822;
                        continue block13;
                    }
lbl25:
                    // 1 sources

                    var10_7 = (var8_6 | var11_5) ^ -940765165;
                    ** GOTO lbl30
                    case -1794600711: {
                        var9_8 ^= var10_7 ^ 2004742469;
                        var10_7 = (var8_6 | var11_5) ^ -1666932564;
                    }
lbl30:
                    // 4 sources

                    default: {
                        continue block13;
                    }
lbl32:
                    // 2 sources

                    block14: while (true) {
                        switch (var10_7) {
                            default: {
                                continue block14;
                            }
                            case -2019510256: {
                                var10_7 = (var8_6 | var11_5) ^ -380417599;
                                continue block14;
                            }
                            case 1990770198: {
                                var9_8 ^= var10_7 ^ -582978206;
                                ** continue;
                            }
                            case -920560915: 
                        }
                        break;
                    }
                    var5_9 = new iG(var1_1, var2_2);
                    var9_8 ^= 1778490634;
                    var6_10 = var5_9.add(new ke(bu.z, var4_4));
                    continue block12;
                    case 56579963: 
                }
                break;
            }
            break;
        }
        return new ku(var6_10, var7_11);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private ku pA(String var1_1) {
        block36: {
            break block36;
lbl1:
            // 1 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ 1141731208;
                ** GOTO lbl48
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ -1570598551;
                ** GOTO lbl19
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ 470172764;
                ** GOTO lbl48
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                block37: {
                    var6_4 = (var4_3 | var7_2) ^ -1549162155;
                    break block37;
lbl13:
                    // 1 sources

                    while (true) {
                        var6_4 = (var4_3 | var7_2) ^ 2129492271;
                        ** GOTO lbl48
lbl16:
                        // 1 sources

                        while (true) {
                            var6_4 = (var4_3 | var7_2) ^ -1980225990;
                            ** GOTO lbl48
                            break;
                        }
                        break;
                    }
                }
                block31: while (true) {
                    switch (var6_4) {
                        case 1103923884: {
                            var5_7 ^= var6_4 ^ -1307944638;
                            var6_4 = (var4_3 | var7_2) ^ 29570711;
                            continue block31;
                        }
                        case -65214099: {
                            var3_6 = var1_1.indexOf(bu.pM((var5_7 | var6_4 ^ 29532351) ^ (var6_4 ^ 404104524), (var4_3 | var6_4 ^ 29532351) ^ ((var5_7 | var6_4 ^ 29532351) ^ (var6_4 ^ 2046990906))));
                            var6_4 = (var4_3 | var7_2) ^ 1181596254;
                            if (true) ** GOTO lbl48
                        }
                        case 1584821935: {
                            var5_7 ^= var6_4 ^ 1281669566;
                            var6_4 = (var4_3 | var7_2) ^ -805141516;
                            ** break;
                        }
                        case 1957002017: {
                            var5_7 ^= var6_4 ^ 212961486;
                            ** continue;
                        }
                        case 769481742: {
                            var6_4 = var2_5 != null ? (var4_3 | var7_2) ^ -1988451109 : (var4_3 | var7_2) ^ -1139583658;
                        }
lbl39:
                        // 3 sources

                        default: {
                            continue block31;
                        }
                        case 1606241939: 
                    }
                    break;
                }
                return var2_5;
                block32: while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 1588909025;
                    if (true) ** GOTO lbl48
                    block33: while (true) {
                        var6_4 = (var4_3 | var7_2) ^ -1541748431;
lbl48:
                        // 7 sources

                        block34: while (true) {
                            switch (var6_4) {
                                default: {
                                    continue block34;
                                }
                                case -1514216560: {
                                    if (var2_5 == null) continue block33;
                                    var6_4 = (var4_3 | var7_2) ^ -782891617;
                                    continue block34;
                                }
                                case -1553265637: {
                                    var5_7 ^= var6_4 ^ 42573375;
                                    var6_4 = (var4_3 | var7_2) ^ 1482767466;
                                    continue block34;
                                }
                                case 1948776896: {
                                    if (var3_6 >= 0) ** break;
                                    continue block33;
                                    var6_4 = (var4_3 | var7_2) ^ 1358806024;
                                    continue block34;
                                }
                                case -2093832491: {
                                    return this.a;
                                }
                                case -505832538: {
                                    var2_5 = (ku)this.a.get(var1_1.substring(var3_6 + 1));
                                    continue block32;
                                }
                                case -1145936476: {
                                    var5_7 ^= var6_4 ^ 908583502;
                                    ** continue;
                                }
                                case 1506088651: {
                                    var5_7 ^= var6_4 ^ -1364134055;
                                    ** continue;
                                }
                                case -1390255118: {
                                    var5_7 ^= var6_4 ^ 213971414;
                                    ** continue;
                                }
                                case 747231845: {
                                    var5_7 ^= var6_4 ^ -1246611099;
                                    ** continue;
                                }
                                case -1177374606: 
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                return var2_5;
            }
        }
        var7_2 = -35763758;
        var4_3 = bu.b & -35763758 ^ 2103418602;
        var6_4 = 0;
        var5_7 = (var4_3 | var7_2) ^ 116541860;
        var6_4 = (var4_3 | var7_2) ^ -1460608000;
        block35: while (true) {
            switch (var6_4) {
                default: {
                    continue block35;
                }
                case 561627084: {
                    var2_5 = (ku)this.a.get(var1_1);
                    ** continue;
                }
                case 1429158906: {
                    var6_4 = (var4_3 | var7_2) ^ 853692851;
                    continue block35;
                }
                case -818049463: 
            }
            var5_7 ^= var6_4 ^ -1160407404;
            var6_4 = (var4_3 | var7_2) ^ -593076170;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onEnable() {
        block32: {
            block28: {
                block30: {
                    block29: {
                        block27: {
                            block31: {
                                break block31;
lbl1:
                                // 1 sources

                                return;
lbl3:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 664602935;
                                    break block27;
                                    break;
                                }
lbl6:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 302402929;
                                    break block28;
                                    break;
                                }
lbl9:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -228097495;
                                    break block27;
                                    break;
                                }
lbl12:
                                // 1 sources

                                while (true) {
                                    this.b.clear();
                                    ** GOTO lbl44
                                    break;
                                }
lbl15:
                                // 1 sources

                                while (true) {
                                    var3_4 ^= var4_3 ^ -2023434252;
                                    ** continue;
                                    break;
                                }
lbl18:
                                // 1 sources

                                while (true) {
                                    var3_4 ^= var4_3 ^ 1150876956;
                                    break block29;
                                    break;
                                }
                            }
                            var5_1 = -793029839;
                            var2_2 = bu.b & -793029839 ^ 1845278381;
                            var4_3 = 0;
                            break block32;
lbl26:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ 670378010;
                                break block28;
                                break;
                            }
lbl29:
                            // 1 sources

                            while (true) {
                                var1_5 = class_310.method_1551();
                                ** continue;
                                break;
                            }
                        }
lbl33:
                        // 3 sources

                        block22: while (true) {
                            switch (var4_3) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block22;
                                    }
                                    break;
                                }
                                case -631046518: {
                                    ** continue;
                                }
                                case 1184539701: {
                                    ** continue;
                                }
                                case 261649812: {
                                    ** continue;
                                }
lbl44:
                                // 1 sources

                                var4_3 = (var2_2 | var5_1) ^ -1150987384;
                                ** continue;
                                case -706496188: {
                                    var3_4 ^= var4_3 ^ 1544487442;
                                    ** continue;
                                }
                                case -612931972: {
                                    break block30;
                                }
                            }
                            break;
                        }
                    }
                    var4_3 = (var2_2 | var5_1) ^ 1676559292;
                    break block28;
lbl54:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl56:
                    // 1 sources

                    while (true) {
                        var3_4 ^= var4_3 ^ -1094907625;
                        ** continue;
                        break;
                    }
                }
                var4_3 = (var2_2 | var5_1) ^ 672943865;
                ** GOTO lbl33
            }
lbl63:
            // 2 sources

            block26: while (true) {
                switch (var4_3) {
                    default: {
                        continue block26;
                    }
                    case -268846388: {
                        ** continue;
                    }
                    case -636821593: {
                        ** continue;
                    }
                    case -1643006975: {
                        ** continue;
                    }
                    ** case 765737485:
lbl74:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        var3_4 = (var2_2 | var5_1) ^ 105689660;
        var4_3 = (var2_2 | var5_1) ^ 646484417;
        ** while (true)
        var1_5.execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, pC(), ()V)((bu)this));
        var4_3 = (var2_2 | var5_1) ^ -799289936;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        int n2 = -5369809;
        int n3 = b & 0xFFAE102F ^ 0xC53EE709;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x1755BD5E;
        n4 = (n3 | n2) ^ 0xE1C6534D;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case 1940951954: {
                    n5 ^= n4 ^ 0x51EC7956;
                    n4 = (n3 | n2) ^ 0x3C143AF8;
                    continue block7;
                }
                case 1053392745: {
                    n5 ^= n4 ^ 0xBE167FA;
                    n4 = (n3 | n2) ^ 0x3710F3A7;
                    continue block7;
                }
                case -1012216361: {
                    this.b.clear();
                    n4 = (n3 | n2) ^ 0xC1778846;
                    continue block7;
                }
                case 511222882: {
                    n4 = (n3 | n2) ^ 0x8C0E64BD;
                    continue block7;
                }
                case -928119672: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void onBlockEntityUpdatePacket(class_2622 var1_1) {
        block34: {
            block36: {
                block35: {
                    var8_2 = 1398242263;
                    var5_3 = bu.b & 1398242263 ^ -1574935099;
                    var7_4 = 0;
                    var6_5 = (var5_3 | var8_2) ^ -923112973;
                    var7_4 = (var5_3 | var8_2) ^ 2072037294;
                    break block34;
lbl7:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ -697813906;
                        break block34;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var6_5 ^= var7_4 ^ -1461015800;
                        var7_4 = (var5_3 | var8_2) ^ -944737844;
                        break block34;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        if (this.isEnabled()) break block35;
                        var7_4 = (var5_3 | var8_2) ^ -1859458620;
                        break block34;
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var6_5 ^= var7_4 ^ -1148303864;
                        var7_4 = (var5_3 | var8_2) ^ 432086701;
                        break block34;
                        break;
                    }
lbl22:
                    // 1 sources

                    return;
                }
                try {
                    var7_4 = (var5_3 | var8_2) ^ 1665299602;
                    break block34;
lbl28:
                    // 1 sources

                    while (true) {
                        var6_5 ^= var7_4 ^ 1730338066;
                        var7_4 = (var5_3 | var8_2) ^ 74545406;
                        break block34;
                        break;
                    }
lbl32:
                    // 1 sources

                    while (true) {
                        block37: {
                            var2_6 = var1_1.method_11293();
                            var6_5 ^= 2012322654;
                            var3_8 = class_7923.field_41181.method_10221((Object)var1_1.method_11291());
                            var7_4 = (var5_3 | var8_2) ^ -1637747532;
                            break block36;
lbl38:
                            // 1 sources

                            while (true) {
                                var6_5 ^= var7_4 ^ -1961524672;
                                var7_4 = (var5_3 | var8_2) ^ 1628161277;
                                break block36;
                                break;
                            }
lbl42:
                            // 1 sources

                            while (true) {
                                if (var3_8 == null) break block37;
                                var7_4 = (var5_3 | var8_2) ^ 209722409;
                                break block36;
                                break;
                            }
lbl46:
                            // 1 sources

                            while (true) {
                                var6_5 ^= var7_4 ^ 812434586;
                                var7_4 = (var5_3 | var8_2) ^ 1293730600;
                                break block36;
                                break;
                            }
lbl50:
                            // 1 sources

                            while (true) {
                                v0 = var3_8.toString();
                                ** GOTO lbl62
                                break;
                            }
                        }
                        var7_4 = (var5_3 | var8_2) ^ 1673480976;
                        break block36;
lbl56:
                        // 1 sources

                        while (true) {
                            var6_5 ^= var7_4 ^ 1599312803;
                            var7_4 = (var5_3 | var8_2) ^ 14492514;
                            break block36;
                            break;
                        }
lbl60:
                        // 1 sources

                        while (true) {
                            v0 = var1_1.method_11291().toString();
lbl62:
                            // 2 sources

                            var6_5 ^= 1794486277;
                            var4_9 = v0;
                            var6_5 ^= 657293191;
                            this.pD(var2_6, var4_9, var1_1.method_11290(), true);
                            var6_5 ^= 1425892612;
                            break;
                        }
                        break;
                    }
                }
                catch (Exception v1) {
                    var6_5 = (var5_3 | var8_2) ^ -178995062;
                    var2_7 = v1;
                }
                var6_5 ^= 651824364;
                return;
            }
            block32: while (true) {
                switch (var7_4) {
                    default: {
                        continue block32;
                    }
                    {
                        case 1830194019: {
                            ** continue;
                        }
                        case -1837319382: {
                            ** continue;
                        }
                        case -564226: {
                            ** continue;
                        }
                        case -1100235521: {
                            ** continue;
                        }
                        case -1865927481: {
                            ** continue;
                        }
                        ** case -206938955:
lbl89:
                        // 1 sources

                        ** continue;
                    }
                }
                break;
            }
        }
        block33: while (true) {
            switch (var7_4) {
                default: {
                    continue block33;
                }
                case -1997031303: {
                    ** continue;
                }
                case 622807993: {
                    ** continue;
                }
                case 885460507: {
                    ** continue;
                }
                case 1650300435: {
                    ** continue;
                }
                case -357146246: {
                    ** continue;
                }
                {
                    case -1875571899: {
                        ** continue;
                    }
                    ** case -150599895:
lbl108:
                    // 1 sources

                    ** continue;
                }
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block45: {
            block44: {
                block40: {
                    block42: {
                        block41: {
                            block43: {
                                block39: {
                                    block37: {
                                        block38: {
                                            var2 = 1202513448;
                                            bu.b = mK.a(MethodHandles.lookup().lookupClass(), -1347022061);
                                            var1_1 = 0;
                                            ** GOTO lbl146
lbl5:
                                            // 1 sources

                                            while (true) {
                                                var1_1 = var2 ^ -54636491;
                                                break block37;
lbl8:
                                                // 1 sources

                                                while (true) {
                                                    var0_2 ^= 81634557;
                                                    ** GOTO lbl135
                                                    break;
                                                }
                                                break;
                                            }
lbl11:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl13:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl15:
                                            // 1 sources

                                            return;
lbl17:
                                            // 1 sources

                                            while (true) {
                                                v0 = ":\u00b6g\u00c1\u0011\u0011\u0083\u0097&9\u00d2\u00eb\u00b0\u00f1\u008bf\u00f3\u0093m\u00b2\u0013\u0000RC\u00b9\u00d3\u00de\u00b0\u00bbj\u00c59\u00a5v>\u0089\u00c1\u00e4=^\u0002\u0082\u00cf\u0011\u00bb\u00c8}O\u0017 \t\u00c7\u00db\u0098\u00d6(O\u00b1\nCu\u0012\u00e4n^$\u0010\u0090\u00e5\u00c9\u00f2\u00ddCg\u00e0Y\u001e\u00beK\u00f6*\u0000\u00f9\u0096hu\u00eb\u00c1y\u00b7\u00e5K\u00b0k\u0090\u00d9\u00fa\u0084\u00ae\u00f7\u00ed\u00e0c\u0085P`m%\u00d1kI2+\u0004\u009c\u00b5\"\u00d4]m\u0082\u00da\u00c8Q_0\u00caye\u00b6Pi\u00ae-<s\u0098\u00ae\u00bfPz\u0091\u00a3\u00c1\u00f6\u00d0\u00e7\u00f8$\u0012\u0083\u00bb\u008bN\u008bx\u00dft\u00e8\u0015y\u00e09\u00ca\u00ff\u00d0\u0085\u00eeBL\n\u00d3,$\u008c\u00b3\u00ad\u0089t\u00ca\u00a9\u00e2\u001b\u009a\ni\u00c5r\u001f\u00ff@:\u00fd\u0083\u00d1\fD\n\u00c1;\u0017L\u00a1\u000b\u00ef\u00d2z\u007f\u00cahq\u0004\u007f\u00c6\u0099\u00b9\u0082\t\u009dw&\u009bG[\u00c3e\u0099h7\u009a\u00f2\u0014\u00e7\u009eh}\u00d9*\u00c1\u00fe\u00b97]?jT\u00bcS\u00f9\\\u0088Z\u00a9\u00a4\u00fe\u00b2a#\u0092\u00e7\u00c5\u00e0\u00d6Y_\u00c3\t9p\u0015EF(\u0096\u00f0\u00ff5\u00ba\u0080\u00bf~\u0003/\u0083\u001dS\u00c5V\u00ba\u00c8M\u0001\u00a0\u009a\u00e4\u0090\u0016:\u00f1S\u00dc\u009bt\u0015\u001b00P\u00b0\u00fe\u00ff\u0098o\u000f\u00bd_[\u00ce\u00fe\u00a6\u00b0mq\u00a8A\u00c0\u00fb\u000b\u00cdH93'9p\u00c3\u009e\u00c0\u0095m\u0087SD\u00da,q\u0082$\u0089\u001b\n\u00bb\u0088:\u00cc\u0004K]O\u00bd\u00ff1\u0015\u00e9\u000e,r4\u000e\u008dahE0\u00cf\u00c1\"mg\u009a\u008c\u0089g\u009d\u00e1\u00d2V+,\u0016\u00d0|? \u00e0[\u00d3\u0012\u000en\u00b0\u00d5\u00fe\u0005\u00d4\u00d9\u00ecdF\u00cd\u0002\u00a3\u00e0\u0012Q_U\u00a1\u00c0\u00f0\u00038=$#F\u0085\u00b4v\f\f#".getBytes("ISO-8859-1");
                                                break block38;
                                                break;
                                            }
                                            bu.a = 0.002f;
                                            bu.a = bu.pM(((var0_2 ^= -1459534785) | var2) ^ -864489330, var2 ^ ((var0_2 | var2) ^ 1670774171));
                                            bu.k = gj.decode("J8uGjmtNcAR5ObYXrMctUQ7v", bu.pM((var0_2 | var2) ^ -864489327, var2 ^ ((var0_2 | var2) ^ 972925533)));
                                            bu.s = gj.decode("BXJuA6O+j2FQTwKvczp2hXbi7eAz+Kd0NMI5kj7siRcFo4UWk8fc4WI=", bu.pM((var0_2 | var2) ^ -864489328, var2 ^ ((var0_2 | var2) ^ 964551934)));
                                            bu.af = gj.decode("OMw6oWTLsfpSak5tQNY=", bu.pM((var0_2 | var2) ^ -864489325, var2 ^ ((var0_2 | var2) ^ -58763103)));
                                            bu.J = gj.decode("ZIrgHg==", bu.pM((var0_2 | var2) ^ -864489326, var2 ^ ((var0_2 | var2) ^ -1323909052)));
                                            bu.D = gj.decode("zAMVUg==", bu.pM((var0_2 | var2) ^ -864489323, var2 ^ ((var0_2 | var2) ^ 1863423107)));
                                            bu.u = gj.decode("MzN/22xGpw==", bu.pM((var0_2 | var2) ^ -864489324, var2 ^ ((var0_2 | var2) ^ 380098749)));
                                            bu.aa = gj.decode("nMJSKkk=", bu.pM((var0_2 | var2) ^ -864489321, var2 ^ ((var0_2 | var2) ^ 498753920)));
                                            bu.S = gj.decode("vH5bcw==", bu.pM((var0_2 | var2) ^ -864489322, var2 ^ ((var0_2 | var2) ^ 256426930)));
                                            bu.h = gj.decode("AJ8rzh6W8u4ZsnRVreQ0bu25XDSDMezb5MabGTqUYlpoQ5FqZYhXWpiCAQ==", bu.pM((var0_2 | var2) ^ -864489319, var2 ^ ((var0_2 | var2) ^ -930707162)));
                                            bu.ad = gj.decode("cDucml03Mk7iKckSLcZV", bu.pM((var0_2 | var2) ^ -864489320, var2 ^ ((var0_2 | var2) ^ -683280566)));
                                            bu.W = gj.decode("jeYTlCwiLOpCLCvlomTnqniAUOkKd1I=", bu.pM((var0_2 | var2) ^ -864489317, var2 ^ ((var0_2 | var2) ^ -190334954)));
                                            bu.ab = gj.decode("f74tZbzS1w==", bu.pM((var0_2 | var2) ^ -864489318, var2 ^ ((var0_2 | var2) ^ -2060820278)));
                                            bu.T = gj.decode("HJOKz2VX8HeoKKQ=", bu.pM((var0_2 | var2) ^ -864489315, var2 ^ ((var0_2 | var2) ^ 248194802)));
                                            bu.m = gj.decode("JfLTltDwjlWbCA==", bu.pM((var0_2 | var2) ^ -864489316, var2 ^ ((var0_2 | var2) ^ 1323857307)));
                                            bu.Y = gj.decode("+lcFH0SgrEhFoEEQdAXT", bu.pM((var0_2 | var2) ^ -864489313, var2 ^ ((var0_2 | var2) ^ 1436616980)));
                                            bu.j = gj.decode("bKobaxE=", bu.pM((var0_2 | var2) ^ -864489314, var2 ^ ((var0_2 | var2) ^ 372897917)));
                                            bu.ac = gj.decode("obgi0fTw+mqX6fqIokrTirvq+tQ5sW4=", bu.pM((var0_2 | var2) ^ -864489247, var2 ^ ((var0_2 | var2) ^ 1297112462)));
                                            bu.F = gj.decode("njMMr7f4d8Vedi3OXA==", bu.pM((var0_2 | var2) ^ -864489248, var2 ^ ((var0_2 | var2) ^ -840632626)));
                                            bu.Z = gj.decode("nqMC+yS8NUDIdj9YktlLxIr+0QEf", bu.pM((var0_2 | var2) ^ -864489245, var2 ^ ((var0_2 | var2) ^ -466436418)));
                                            bu.a = gj.decode("CDb/lCm3pnnPi0k=", bu.pM((var0_2 | var2) ^ -864489246, var2 ^ ((var0_2 | var2) ^ 1542305107)));
                                            bu.I = gj.decode("/9SBQY27+ZHEGEhvITuc+EWx9kIO", bu.pM((var0_2 | var2) ^ -864489243, var2 ^ ((var0_2 | var2) ^ -81981634)));
                                            bu.p = gj.decode("I2WWRdHwa/baDdo=", bu.pM((var0_2 | var2) ^ -864489244, var2 ^ ((var0_2 | var2) ^ -1662151936)));
                                            bu.x = gj.decode("jCXsVTrrtKNwvlLjoV2/sw==", bu.pM((var0_2 | var2) ^ -864489241, var2 ^ ((var0_2 | var2) ^ 1325244098)));
                                            bu.V = gj.decode("egx0mtZu", bu.pM((var0_2 | var2) ^ -864489242, var2 ^ ((var0_2 | var2) ^ -617316682)));
                                            bu.o = gj.decode("4538CChdk7v1rIT5Jh7xgCrm0zhN", bu.pM((var0_2 | var2) ^ -864489239, var2 ^ ((var0_2 | var2) ^ -1931681261)));
                                            bu.L = gj.decode("SwNuWfH0MA==", bu.pM((var0_2 | var2) ^ -864489240, var2 ^ ((var0_2 | var2) ^ 285279122)));
                                            bu.r = gj.decode("beOr1RePlHpb9GBEEBQPoA==", bu.pM((var0_2 | var2) ^ -864489237, var2 ^ ((var0_2 | var2) ^ -879367524)));
                                            bu.H = gj.decode("QJVK6a5L", bu.pM((var0_2 | var2) ^ -864489238, var2 ^ ((var0_2 | var2) ^ 178994915)));
                                            bu.y = gj.decode("bXBPjhbFn7GFMPLgNKD+IEI=", bu.pM((var0_2 | var2) ^ -864489235, var2 ^ ((var0_2 | var2) ^ -20090389)));
                                            bu.K = gj.decode("7MX4520GUw==", bu.pM((var0_2 | var2) ^ -864489236, var2 ^ ((var0_2 | var2) ^ -1129897626)));
                                            bu.M = gj.decode("Y8pzjNcJo5fiKS54ZAqy0tdaKXJ/qUQ=", bu.pM((var0_2 | var2) ^ -864489233, var2 ^ ((var0_2 | var2) ^ -456644123)));
                                            bu.C = gj.decode("5W9jMT9WQ3Wu8hF4dwse7A==", bu.pM((var0_2 | var2) ^ -864489234, var2 ^ ((var0_2 | var2) ^ -78368440)));
                                            bu.v = gj.decode("p5Axa1Nu85Gm8MlDE2fBebNgog==", bu.pM((var0_2 | var2) ^ -864489231, var2 ^ ((var0_2 | var2) ^ 217070492)));
                                            bu.N = gj.decode("EEdc0aaIdyiu", bu.pM((var0_2 | var2) ^ -864489232, var2 ^ ((var0_2 | var2) ^ 1106753410)));
                                            bu.g = gj.decode("AOlusRd3XrHpREJuSSZWQDo=", bu.pM((var0_2 | var2) ^ -864489229, var2 ^ ((var0_2 | var2) ^ -1466929776)));
                                            bu.E = gj.decode("guUydnGhkOiItXfsd9pioqsOZDrctrw=", bu.pM((var0_2 | var2) ^ -864489230, var2 ^ ((var0_2 | var2) ^ 1856011003)));
                                            bu.f = gj.decode("ofLjG9r5N1c/CrLUIw==", bu.pM((var0_2 | var2) ^ -864489227, var2 ^ ((var0_2 | var2) ^ 1978823635)));
                                            bu.w = gj.decode("92pqGpJ+81TLZlsKHjXlHTo=", bu.pM((var0_2 | var2) ^ -864489228, var2 ^ ((var0_2 | var2) ^ -1333007845)));
                                            bu.i = gj.decode("3ribA1rceQ==", bu.pM((var0_2 | var2) ^ -864489225, var2 ^ ((var0_2 | var2) ^ -1120284252)));
                                            bu.R = gj.decode("996/r2j4SUZPwBf8F7YroKIgS+zGbhH0N+s=", bu.pM((var0_2 | var2) ^ -864489226, var2 ^ ((var0_2 | var2) ^ 909317564)));
                                            bu.O = gj.decode("tmFnqo7IQVsVIU/5mco4fw==", bu.pM((var0_2 | var2) ^ -864489223, var2 ^ ((var0_2 | var2) ^ -1294310135)));
                                            bu.l = gj.decode("zMin5HFqBehFDHzGWXg=", bu.pM((var0_2 | var2) ^ -864489224, var2 ^ ((var0_2 | var2) ^ 1100187871)));
                                            bu.A = gj.decode("3dyw4A==", bu.pM((var0_2 | var2) ^ -864489221, var2 ^ ((var0_2 | var2) ^ -1747122546)));
                                            bu.B = gj.decode("7q++BNSbvVqUnC9gKHzVw7Ra9wIgZQ==", bu.pM((var0_2 | var2) ^ -864489222, var2 ^ ((var0_2 | var2) ^ -864836529)));
                                            bu.d = gj.decode("TJyvh6H9vY0M6BdtCZWZC7JwCA==", bu.pM((var0_2 | var2) ^ -864489219, var2 ^ ((var0_2 | var2) ^ 377944551)));
                                            bu.Q = gj.decode("7SB+u+q/2Mm+lx4SEA==", bu.pM((var0_2 | var2) ^ -864489220, var2 ^ ((var0_2 | var2) ^ -247248643)));
                                            bu.c = gj.decode("Ht62", bu.pM((var0_2 | var2) ^ -864489217, var2 ^ ((var0_2 | var2) ^ 805191899)));
                                            bu.U = gj.decode("A+HxQJ0MhSJHrkmhTAaV", bu.pM((var0_2 | var2) ^ -864489218, var2 ^ ((var0_2 | var2) ^ 922505655)));
                                            bu.e = gj.decode("rURBOOo=", bu.pM((var0_2 | var2) ^ -864489279, var2 ^ ((var0_2 | var2) ^ -1654805696)));
                                            bu.ah = gj.decode("O92YaFYTWN5u7uBRwu2ffA==", bu.pM((var0_2 | var2) ^ -864489280, var2 ^ ((var0_2 | var2) ^ 1854132985)));
                                            bu.X = gj.decode("rOCEbalm", bu.pM((var0_2 | var2) ^ -864489277, var2 ^ ((var0_2 | var2) ^ -1044125821)));
                                            bu.b = gj.decode("7YqdbTbJpeBk9UEeAWW1aUE=", bu.pM((var0_2 | var2) ^ -864489278, var2 ^ ((var0_2 | var2) ^ -1473540032)));
                                            bu.P = gj.decode("aoHUgR1q5w==", bu.pM((var0_2 | var2) ^ -864489275, var2 ^ ((var0_2 | var2) ^ -2104381166)));
                                            bu.n = gj.decode("u6DkKTWng19E/mRHzq3D", bu.pM((var0_2 | var2) ^ -864489276, var2 ^ ((var0_2 | var2) ^ -385080629)));
                                            bu.q = gj.decode("ZpGdCtQ=", bu.pM((var0_2 | var2) ^ -864489273, var2 ^ ((var0_2 | var2) ^ -374109803)));
                                            bu.ae = gj.decode("8nmAJCT57VWuXSPbkIi6S/xUWkD/bRA=", bu.pM((var0_2 | var2) ^ -864489274, var2 ^ ((var0_2 | var2) ^ 248514099)));
                                            bu.G = gj.decode("XtxcL/w4yPy9bWUISQ==", bu.pM((var0_2 | var2) ^ -864489271, var2 ^ ((var0_2 | var2) ^ 1668175306)));
                                            bu.ag = gj.decode("oLoD21A=", bu.pM((var0_2 | var2) ^ -864489272, var2 ^ ((var0_2 | var2) ^ -774081352)));
                                            bu.z = gj.decode("9gH05TRGPw==", bu.pM((var0_2 | var2) ^ -864489269, var2 ^ ((var0_2 | var2) ^ 1195747443)));
                                            bu.t = gj.decode("4UiGYr0=", bu.pM((var0_2 | var2) ^ -864489270, var2 ^ ((var0_2 | var2) ^ 2008171746)));
                                            var1_1 = var2 ^ -644174314;
                                            break block37;
lbl84:
                                            // 1 sources

                                            while (true) {
                                                var0_2 ^= -1293017898;
                                                break block39;
                                                break;
                                            }
lbl87:
                                            // 1 sources

                                            while (true) {
                                                ** continue;
                                                break;
                                            }
lbl89:
                                            // 1 sources

                                            while (true) {
                                                var0_2 ^= var1_1 ^ 516204240;
                                                ** GOTO lbl148
                                                break;
                                            }
                                            bu.a = new int[((var0_2 ^= 89187989) | var2) ^ -671285632];
                                            var0_2 ^= -1462452816;
                                            ** while (true)
                                        }
                                        while (true) {
                                            var0_2 ^= -48837667;
                                            ** continue;
                                            break;
                                        }
lbl99:
                                        // 1 sources

                                        while (true) {
                                            var0_2 ^= -213620904;
                                            ** GOTO lbl138
                                            break;
                                        }
lbl102:
                                        // 1 sources

                                        while (true) {
                                            var1_1 = var2 ^ -1321950855;
                                            break block37;
                                            break;
                                        }
lbl105:
                                        // 1 sources

                                        while (true) {
                                            ** GOTO lbl131
                                            break;
                                        }
                                    }
lbl108:
                                    // 4 sources

                                    block28: while (true) {
                                        switch (var1_1) lbl-1000:
                                        // 4 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block28;
                                                }
                                                break;
                                            }
                                            case -1156401635: {
                                                ** continue;
                                            }
                                            case -1640609730: {
                                                ** continue;
                                            }
                                            case -611360793: {
                                                ** continue;
                                            }
lbl119:
                                            // 1 sources

                                            while (true) {
                                                var1_1 = var2 ^ -154746112;
                                                ** GOTO lbl-1000
                                                break;
                                            }
                                            case 411991724: {
                                                ClientChunkEvents.CHUNK_LOAD.register((Object)(ClientChunkEvents.Load)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_638;Lnet/minecraft/class_2818;)V, pT(net.minecraft.class_638 net.minecraft.class_2818 ), (Lnet/minecraft/class_638;Lnet/minecraft/class_2818;)V)());
                                                ** GOTO lbl133
                                            }
lbl125:
                                            // 1 sources

                                            while (true) {
                                                var0_2 ^= 1515561303;
                                                break block39;
                                                break;
                                            }
lbl128:
                                            // 1 sources

                                            while (true) {
                                                var0_2 ^= 120180046;
                                                break block40;
                                                break;
                                            }
lbl131:
                                            // 1 sources

                                            v1 = ((var0_2 ^= 2121538954) | var2) ^ 45481102 ^ bu.b;
                                            break block41;
lbl133:
                                            // 1 sources

                                            var1_1 = var2 ^ -846795361;
                                            ** GOTO lbl-1000
lbl135:
                                            // 1 sources

                                            v2 = (v0[v3] & 255) << 24;
                                            break block42;
lbl138:
                                            // 1 sources

                                            if (v3 + 4 < v0.length) ** continue;
                                            ** continue;
                                            case -1976955977: {
                                                var0_2 ^= var1_1 ^ -853818479;
                                                break block28;
                                            }
                                            case 1830216779: {
                                                ClientPlayConnectionEvents.DISCONNECT.register((Object)(ClientPlayConnectionEvents.Disconnect)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_634;Lnet/minecraft/class_310;)V, pS(net.minecraft.class_634 net.minecraft.class_310 ), (Lnet/minecraft/class_634;Lnet/minecraft/class_310;)V)());
                                                ** continue;
                                            }
lbl146:
                                            // 1 sources

                                            var0_2 = 1668066786;
                                            break block43;
lbl148:
                                            // 1 sources

                                            var1_1 = var2 ^ 1596102788;
                                            ** continue;
                                            case -157792431: {
                                                var0_2 ^= var1_1 ^ 56129218;
                                                break block44;
                                            }
lbl153:
                                            // 1 sources

                                            while (true) {
                                                v4 = v0[v3 + 3] & 255;
                                                break block40;
                                                break;
                                            }
lbl157:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl159:
                                            // 1 sources

                                            while (true) {
                                                ** continue;
                                                break;
                                            }
                                            v5 = (v0[v3 + 2] & 255) << 8;
                                            var0_2 ^= -1378538299;
                                            ** continue;
                                        }
                                        break;
                                    }
                                    var1_1 = var2 ^ 716833379;
                                    ** GOTO lbl108
                                }
                                ** while (true)
                            }
                            var1_1 = var2 ^ -1675380273;
                            ** GOTO lbl108
                        }
                        var0_2 ^= -659199801;
                        break block45;
lbl175:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var0_2 ^= -236249656;
                    ** while (true)
                }
                switch (var0_2) {
                    case -599537257: {
                        ** continue;
                    }
                    case 457430354: {
                        ** continue;
                    }
                    ** default:
lbl187:
                    // 1 sources

                    ** continue;
                }
                {
                    case 1007367231: {
                        v6 = 0;
                        v3 = 0;
                        ** continue;
                    }
                    ** case -1318443736:
                }
lbl193:
                // 1 sources

                var0_2 ^= var1_1 ^ -1952910526;
                ** while (true)
            }
            var1_1 = var2 ^ 2074595863;
            ** while (true)
            v7 = (v0[v3 + 1] & 255) << 16;
            var0_2 ^= 1117671662;
            ** while (true)
        }
        bu.a[v6] = (v2 | (v7 | (v5 | v4))) ^ v1;
        v6 = v6 + 1;
        v0 = v0;
        v3 = v3 + 4;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void onChunkDataPacket(class_2672 var1_1) {
        block19: {
            block20: {
                var8_2 = 106368038;
                var5_3 = bu.b & 106368038 ^ 1438907772;
                var7_4 = 0;
                var6_5 = (var5_3 | var8_2) ^ 1437177922;
                var7_4 = (var5_3 | var8_2) ^ -445463907;
                break block19;
lbl7:
                // 1 sources

                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ -270870316;
                    break block19;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var6_5 ^= var7_4 ^ -863746270;
                    var7_4 = (var5_3 | var8_2) ^ 1319790762;
                    break block19;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    if (this.isEnabled()) break block20;
                    var7_4 = (var5_3 | var8_2) ^ 556711026;
                    break block19;
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var6_5 ^= var7_4 ^ 159590441;
                    var7_4 = (var5_3 | var8_2) ^ 2037783880;
                    break block19;
                    break;
                }
lbl22:
                // 1 sources

                return;
            }
            try {
                var7_4 = (var5_3 | var8_2) ^ -1546825137;
                break block19;
lbl28:
                // 1 sources

                while (true) {
                    var6_5 ^= var7_4 ^ 856024572;
                    var7_4 = (var5_3 | var8_2) ^ -568221876;
                    break block19;
                    break;
                }
lbl32:
                // 1 sources

                while (true) {
                    var2_6 = var1_1.method_38598();
                    var6_5 ^= -1470170617;
                    var3_8 = var1_1.method_11523();
                    var6_5 ^= 426393347;
                    var4_9 = var1_1.method_11524();
                    var6_5 ^= -1440587950;
                    var2_6.method_38587(var3_8, var4_9).accept((class_6603.class_6605)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_2338;Lnet/minecraft/class_2591;Lnet/minecraft/class_2487;)V, pR(net.minecraft.class_2338 net.minecraft.class_2591 net.minecraft.class_2487 ), (Lnet/minecraft/class_2338;Lnet/minecraft/class_2591;Lnet/minecraft/class_2487;)V)((bu)this));
                    var6_5 ^= 1105175348;
                    break;
                }
            }
            catch (Exception v0) {
                var6_5 = (var5_3 | var8_2) ^ -1124693659;
                var2_7 = v0;
            }
            var6_5 ^= 365345050;
            return;
        }
        block18: while (true) {
            switch (var7_4) {
                default: {
                    continue block18;
                }
                case -1297793053: {
                    ** continue;
                }
                case -1207097942: {
                    ** continue;
                }
                case 427660756: {
                    ** continue;
                }
                case 1996046604: {
                    ** continue;
                }
                case 782360630: {
                    ** continue;
                }
                {
                    case -199577807: {
                        ** continue;
                    }
                    ** case -1980341710:
lbl65:
                    // 1 sources

                    ** continue;
                }
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void pB(class_2818 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [68[UNCONDITIONALDOLOOP]], but top level block is 69[UNCONDITIONALDOLOOP]
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
    private void pC() {
        block67: {
            block65: {
                block66: {
                    var10_1 = -223357436;
                    var7_2 = bu.b & -223357436 ^ -686202832;
                    var9_3 = 0;
                    var8_10 = (var7_2 | var10_1) ^ 1085328102;
                    var9_3 = (var7_2 | var10_1) ^ 748733463;
                    break block66;
                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ -2006971394;
                        break block65;
                        break;
                    }
                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ 1761149500;
                        break block66;
lbl13:
                        // 1 sources

                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ -417534341;
                            break block66;
                            break;
                        }
                        break;
                    }
                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ 831996523;
                        ** GOTO lbl112
                        break;
                    }
lbl19:
                    // 2 sources

                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ -1122473841;
                        break block67;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var3_6 = var1_4.field_1724.method_31476();
                        var8_10 ^= 482756962;
                        var4_7 = -var2_5;
                        ** GOTO lbl36
lbl27:
                        // 2 sources

                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ 536996213;
                            ** GOTO lbl74
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ -2014260778;
                            break block65;
lbl33:
                            // 2 sources

                            while (true) {
                                var9_3 = (var7_2 | var10_1) ^ 681444054;
                                break block65;
                                break;
                            }
lbl36:
                            // 2 sources

                            while (true) {
                                var9_3 = (var7_2 | var10_1) ^ -1692392912;
                                if (true) ** GOTO lbl112
                                break;
                            }
                            break;
                        }
                        break;
                    }
                }
                block53: while (true) {
                    switch (var9_3) {
                        default: {
                            continue block53;
                        }
                        case -1111475161: {
                            var8_10 ^= var9_3 ^ 349565656;
                            var9_3 = (var7_2 | var10_1) ^ 1102518675;
                            continue block53;
                        }
                        case -1622739960: {
                            var8_10 ^= var9_3 ^ 447471919;
                            var9_3 = (var7_2 | var10_1) ^ -211891215;
                            continue block53;
                        }
                        case -618712541: {
                            ** break;
                        }
                        case 81870277: {
                            var1_4 = class_310.method_1551();
                            var9_3 = (var7_2 | var10_1) ^ 352465299;
                            break block67;
                        }
lbl58:
                        // 1 sources

                        var9_3 = (var7_2 | var10_1) ^ 1249888787;
                        continue block53;
                        case -1418186323: {
                            var8_10 ^= var9_3 ^ 1054146035;
                            ** continue;
                        }
                        case -1240928345: {
                            if (this.isEnabled()) ** continue;
                            var9_3 = (var7_2 | var10_1) ^ 1556596633;
                            continue block53;
                        }
                        case 279124047: 
                    }
                    break;
                }
                return;
lbl69:
                // 1 sources

                while (true) {
                    var9_3 = (var7_2 | var10_1) ^ 377013523;
                    break block67;
                    break;
                }
lbl72:
                // 1 sources

                while (true) {
                    var9_3 = (var7_2 | var10_1) ^ -90260932;
lbl74:
                    // 2 sources

                    block56: while (true) {
                        switch (var9_3) {
                            case 1687423074: {
                                var9_3 = (var7_2 | var10_1) ^ 2089222324;
                                continue block56;
                            }
                            case -675406015: {
                                var8_10 ^= var9_3 ^ 114242375;
                                var9_3 = (var7_2 | var10_1) ^ -84323023;
                                continue block56;
                            }
                            case 489859697: {
                                if (var6_9 == null) ** GOTO lbl27
                                var9_3 = (var7_2 | var10_1) ^ -1825833386;
                                continue block56;
                            }
                            case 222733061: {
                                ++var5_8;
                                ** GOTO lbl33
                            }
                            case 220285960: {
                                var8_10 ^= var9_3 ^ 2070631558;
                                var9_3 = (var7_2 | var10_1) ^ -359834555;
                            }
                            default: {
                                continue block56;
                            }
                            case -1959201152: 
                        }
                        break;
                    }
                    this.pB(var6_9);
                    ** continue;
                    break;
                }
                while (true) {
                    var9_3 = (var7_2 | var10_1) ^ -384562059;
                    break block67;
                    break;
                }
lbl101:
                // 1 sources

                while (true) {
                    var9_3 = (var7_2 | var10_1) ^ -876836905;
                    break block65;
                    break;
                }
lbl104:
                // 1 sources

                while (true) {
                    var9_3 = (var7_2 | var10_1) ^ -400063337;
                    break block67;
lbl107:
                    // 1 sources

                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ -1836991603;
                        break block67;
                        break;
                    }
                    break;
                }
                block61: while (true) {
                    var9_3 = (var7_2 | var10_1) ^ 1381294924;
lbl112:
                    // 3 sources

                    block62: while (true) {
                        switch (var9_3) {
                            default: {
                                continue block62;
                            }
                            case 1822413828: {
                                var8_10 ^= var9_3 ^ -842171236;
                                var9_3 = (var7_2 | var10_1) ^ 1184830998;
                                continue block62;
                            }
                            case -39465072: {
                                var8_10 ^= var9_3 ^ 1835567275;
                                continue block61;
                            }
                            case -970410913: {
                                var8_10 ^= var9_3 ^ -371594872;
                                var9_3 = (var7_2 | var10_1) ^ -397407951;
                                continue block62;
                            }
                            case -1323245534: {
                                if (var4_7 > var2_5) ** continue;
                                var9_3 = (var7_2 | var10_1) ^ 169490852;
                                continue block62;
                            }
                            case 535822085: {
                                return;
                            }
                            case -1511320200: 
                        }
                        break;
                    }
                    break;
                }
                var5_8 = -var2_5;
                ** while (true)
            }
            block63: while (true) {
                switch (var9_3) {
                    default: {
                        continue block63;
                    }
                    case 1006858723: {
                        var6_9 = var1_4.field_1687.method_2935().method_21730(var3_6.field_9181 + var4_7, var3_6.field_9180 + var5_8);
                        ** continue;
                    }
                    case 1884235746: {
                        if (var5_8 > var2_5) ** continue;
                        var9_3 = (var7_2 | var10_1) ^ 1251600864;
                        continue block63;
                    }
                    case 198123360: {
                        ++var4_7;
                        ** continue;
                    }
                    case -1121574956: {
                        var8_10 ^= var9_3 ^ -1738474601;
                        ** continue;
                    }
                    case 2145385930: {
                        var8_10 ^= var9_3 ^ -868367710;
                        var9_3 = (var7_2 | var10_1) ^ -59709100;
                        continue block63;
                    }
                    case -551422750: 
                }
                break;
            }
            var8_10 ^= var9_3 ^ 1566319657;
            ** while (true)
        }
        block64: while (true) {
            switch (var9_3) {
                default: {
                    continue block64;
                }
                case 514587201: {
                    var8_10 ^= var9_3 ^ -317045035;
                    ** continue;
                }
                case -1860918057: {
                    if (var1_4.field_1724 != null) ** continue;
                    ** GOTO lbl19
                }
                case -490879065: {
                    var8_10 ^= var9_3 ^ -1087023740;
                    ** continue;
                }
                case 1435393680: {
                    var9_3 = (var7_2 | var10_1) ^ 1722503907;
                    continue block64;
                }
                case -507038937: {
                    if (var1_4.field_1687 != null) ** break;
                    ** continue;
                    var9_3 = (var7_2 | var10_1) ^ -1573803868;
                    continue block64;
                }
                case 1698581945: {
                    var2_5 = Math.min(bu.pM((var8_10 | var9_3 ^ -1752065091) ^ (var9_3 ^ -1996192296), (var7_2 | var9_3 ^ -1752065091) ^ ((var8_10 | var9_3 ^ -1752065091) ^ (var9_3 ^ -256762496))), (int)Math.ceil((double)((Float)this.b.getValue()).floatValue() / 16.0) + 2);
                    var8_10 ^= 2126496790;
                    ** continue;
                }
                case 1252499131: {
                    var8_10 ^= var9_3 ^ -1411013760;
                    ** continue;
                }
                case 530084515: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void pD(class_2338 var1_1, String var2_2, class_2487 var3_3, boolean var4_4) {
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
    private static String pE(class_2487 var0) {
        var5_1 = -685173513;
        var2_2 = bu.b & -685173513 ^ 2138264215;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ -1418036213;
        var4_3 = (var2_2 | var5_1) ^ 1647716419;
        ** GOTO lbl18
lbl7:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ -840156850;
            ** GOTO lbl58
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ 1640721819;
            if (true) ** GOTO lbl18
            break;
        }
lbl13:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ -1823098225;
            if (true) ** GOTO lbl58
            break;
        }
        block22: while (true) {
            var4_3 = (var2_2 | var5_1) ^ 900744509;
lbl18:
            // 3 sources

            block23: while (true) {
                block32: {
                    switch (var4_3) {
                        case -1655865676: {
                            ** break;
                        }
                        case -1632617620: {
                            if (var0 != null) {
                                var4_3 = (var2_2 | var5_1) ^ 840719358;
                                continue block23;
                            }
                            ** GOTO lbl49
                        }
                        case -848884471: {
                            break block32;
                        }
                        case -989454422: {
                            var3_5 ^= var4_3 ^ -1142171627;
                            continue block22;
                        }
                        case -1774734707: {
                            var3_5 ^= var4_3 ^ -147760588;
                            ** continue;
                        }
                        case 549496364: {
                            var3_5 ^= var4_3 ^ -458964847;
                            ** break;
                        }
lbl38:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 1766646906;
                        continue block23;
                        case -892660790: {
                            return "";
                        }
                        case -4283892: {
                            var1_4 = var0.toString();
                            ** continue;
                        }
lbl45:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 12973307;
                        continue block23;
                        case -496171949: {
                            if (!var0.method_33133()) ** GOTO lbl51
lbl49:
                            // 2 sources

                            var4_3 = (var2_2 | var5_1) ^ 981289309;
                            break;
lbl51:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ -541331237;
                        }
                    }
                    continue;
                }
                var4_3 = (var2_2 | var5_1) ^ 488002212;
            }
            break;
        }
        block24: while (true) {
            var4_3 = (var2_2 | var5_1) ^ -782598295;
lbl58:
            // 3 sources

            block25: while (true) {
                switch (var4_3) {
                    case 1385855342: {
                        return var1_4;
                    }
                    case -863167281: {
                        var3_5 ^= var4_3 ^ -2128291044;
                        break;
                    }
                    case 773925278: {
                        return var1_4.substring(0, bu.pM((var3_5 | var4_3 ^ -116900503) ^ (var4_3 ^ -1034050637), (var2_2 | var4_3 ^ -116900503) ^ ((var3_5 | var4_3 ^ -116900503) ^ (var4_3 ^ 807194833)))) + "...";
                    }
                    case 848785337: {
                        var3_5 ^= var4_3 ^ 363360314;
                        ** continue;
                    }
                    case -949242880: {
                        var3_5 ^= var4_3 ^ -474573161;
                        continue block24;
                    }
                    case 1815014520: {
                        if (var1_4.length() <= bu.pM((var3_5 | var4_3 ^ -1157105521) ^ (var4_3 ^ -1601813414), (var2_2 | var4_3 ^ -1157105521) ^ ((var3_5 | var4_3 ^ -1157105521) ^ (var4_3 ^ 405276947)))) break block24;
                        var4_3 = (var2_2 | var5_1) ^ 940630775;
                    }
lbl76:
                    // 3 sources

                    default: {
                        continue block25;
                    }
                }
                var4_3 = (var2_2 | var5_1) ^ -1377751143;
            }
            break;
        }
        var4_3 = (var2_2 | var5_1) ^ 871778872;
        ** GOTO lbl76
    }

    /*
     * Unable to fully structure code
     */
    private void pF() {
        block64: {
            block62: {
                block67: {
                    block65: {
                        block63: {
                            block60: {
                                block58: {
                                    block61: {
                                        block59: {
                                            block66: {
                                                block57: {
                                                    break block66;
lbl1:
                                                    // 1 sources

                                                    while (this.b.size() <= bu.pM((var5_4 | var6_3 ^ 1824581929) ^ (var6_3 ^ 1998190313), (var4_2 | var6_3 ^ 1824581929) ^ ((var5_4 | var6_3 ^ 1824581929) ^ (var6_3 ^ -1835610729)))) {
                                                        break block57;
lbl3:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl5:
                                                        // 1 sources

                                                        while (true) {
                                                            var6_3 = (var4_2 | var7_1) ^ 1126368624;
                                                            break block58;
                                                            break;
                                                        }
                                                    }
                                                    break block67;
lbl9:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 ^= var6_3 ^ 595467542;
                                                        break block59;
                                                        break;
                                                    }
                                                    var1_5 = new ArrayList<Map.Entry<K, V>>(this.b.entrySet());
                                                    var6_3 = (var4_2 | var7_1) ^ 1926501559;
                                                    break block64;
lbl15:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_3 = (var4_2 | var7_1) ^ 913193556;
                                                        break block60;
                                                        break;
                                                    }
lbl18:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_3 = (var4_2 | var7_1) ^ 354167742;
                                                        break block58;
                                                        break;
                                                    }
lbl21:
                                                    // 2 sources

                                                    while (true) {
                                                        var6_3 = (var4_2 | var7_1) ^ 1575182393;
                                                        break block60;
                                                        break;
                                                    }
                                                }
                                                var6_3 = (var4_2 | var7_1) ^ 921645736;
                                                break block58;
lbl27:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl29:
                                                // 1 sources

                                                while (true) {
                                                    var3_7 = 0;
                                                    ** GOTO lbl104
                                                    break;
                                                }
lbl32:
                                                // 1 sources

                                                while (true) {
                                                    var5_4 ^= var6_3 ^ 1213072694;
                                                    break block61;
                                                    break;
                                                }
lbl35:
                                                // 1 sources

                                                while (true) {
                                                    var5_4 ^= var6_3 ^ -642550300;
                                                    ** continue;
                                                    break;
                                                }
lbl38:
                                                // 1 sources

                                                while (true) {
                                                    if (var3_7 >= var2_6) ** GOTO lbl21
                                                    ** GOTO lbl99
                                                    break;
                                                }
lbl41:
                                                // 1 sources

                                                while (true) {
                                                    var5_4 ^= var6_3 ^ -485977366;
                                                    ** GOTO lbl97
                                                    break;
                                                }
lbl44:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var7_1 = -36572692;
                                            var4_2 = bu.b & -36572692 ^ 1396810736;
                                            var6_3 = 0;
                                            var5_4 = (var4_2 | var7_1) ^ 2070390318;
                                            ** while (true)
                                        }
                                        var6_3 = (var4_2 | var7_1) ^ 1976633280;
                                        break block60;
lbl55:
                                        // 1 sources

                                        while (true) {
                                            var6_3 = (var4_2 | var7_1) ^ 1275580576;
                                            break block60;
                                            break;
                                        }
lbl58:
                                        // 1 sources

                                        while (true) {
                                            var5_4 ^= var6_3 ^ -1736713137;
                                            break block62;
                                            break;
                                        }
lbl61:
                                        // 1 sources

                                        while (true) {
                                            var6_3 = (var4_2 | var7_1) ^ -918220328;
                                            break block60;
                                            break;
                                        }
lbl64:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        this.b.remove(((Map.Entry)var1_5.get(var3_7)).getKey());
                                        var6_3 = (var4_2 | var7_1) ^ -1934414932;
                                        break block60;
lbl70:
                                        // 1 sources

                                        while (true) {
                                            if (var3_7 < var1_5.size()) ** break;
                                            ** continue;
                                            ** continue;
                                            break;
                                        }
lbl74:
                                        // 1 sources

                                        while (true) {
                                            var6_3 = (var4_2 | var7_1) ^ -1623946429;
                                            break block58;
lbl77:
                                            // 1 sources

                                            while (true) {
                                                var5_4 ^= var6_3 ^ -394917844;
                                                break block63;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    var6_3 = (var4_2 | var7_1) ^ 1858136889;
                                }
lbl83:
                                // 3 sources

                                block48: while (true) {
                                    switch (var6_3) {
                                        default: {
                                            continue block48;
                                        }
                                        case -1861150523: {
                                            ** GOTO lbl1
                                        }
                                        case -1124927860: {
                                            ** continue;
                                        }
                                        case 1625651391: {
                                            ** continue;
                                        }
                                        case 1436628696: {
                                            ** continue;
                                        }
                                        case -918634156: {
                                            ** continue;
                                        }
lbl97:
                                        // 1 sources

                                        var6_3 = (var4_2 | var7_1) ^ -585263825;
                                        break block64;
lbl99:
                                        // 1 sources

                                        var6_3 = (var4_2 | var7_1) ^ 1809767782;
                                        break block60;
lbl101:
                                        // 1 sources

                                        while (true) {
                                            var5_4 ^= var6_3 ^ -1944586200;
                                            break block48;
                                            break;
                                        }
lbl104:
                                        // 2 sources

                                        while (true) {
                                            var6_3 = (var4_2 | var7_1) ^ -1281851593;
                                            break block60;
                                            break;
                                        }
lbl107:
                                        // 1 sources

                                        return;
                                        case -355608510: {
                                            ** continue;
                                        }
                                        case -1092912747: {
                                            return;
                                        }
                                    }
                                    break;
                                }
                                var6_3 = (var4_2 | var7_1) ^ -815505379;
                                break block64;
lbl115:
                                // 1 sources

                                while (true) {
                                    var5_4 ^= var6_3 ^ -27187510;
                                    ** continue;
                                    break;
                                }
lbl118:
                                // 1 sources

                                while (true) {
                                    ++var3_7;
                                    ** continue;
                                    break;
                                }
lbl121:
                                // 1 sources

                                while (true) {
                                    var5_4 ^= var6_3 ^ 939046558;
                                    break block65;
                                    break;
                                }
                            }
lbl125:
                            // 3 sources

                            block55: while (true) {
                                switch (var6_3) {
                                    default: {
                                        continue block55;
                                    }
                                    case 1279888587: {
                                        ** continue;
                                    }
                                    case -1979648964: {
                                        ** continue;
                                    }
                                    case 1760648939: {
                                        ** continue;
                                    }
                                    case -1277811876: {
                                        ** continue;
                                    }
                                    case -910177880: {
                                        ** continue;
                                    }
                                    case 915726884: {
                                        ** continue;
                                    }
                                    case -1573743675: {
                                        ** continue;
                                    }
                                    case 1499780949: {
                                        ** continue;
                                    }
                                    case 1935857744: {
                                        ** continue;
                                    }
                                    case -1810944358: {
                                        ** continue;
                                    }
                                }
                                break;
                            }
                            var2_6 = this.b.size() - bu.pM((var5_4 | var6_3 ^ -849059315) ^ (var6_3 ^ -728399922), (var4_2 | var6_3 ^ -849059315) ^ ((var5_4 | var6_3 ^ -849059315) ^ (var6_3 ^ -1936045552)));
                            var5_4 ^= 1091315985;
                            ** while (true)
                        }
                        var6_3 = (var4_2 | var7_1) ^ 1091209833;
                        ** GOTO lbl83
                    }
                    var6_3 = (var4_2 | var7_1) ^ -1498078039;
                    ** GOTO lbl125
                }
                var6_3 = (var4_2 | var7_1) ^ -1435450076;
                ** while (true)
            }
            var6_3 = (var4_2 | var7_1) ^ -1759466217;
            ** while (true)
            var1_5.sort(Comparator.comparingLong((ToLongFunction<Map.Entry>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)J, pQ(java.util.Map$Entry ), (Ljava/util/Map$Entry;)J)()));
            var6_3 = (var4_2 | var7_1) ^ 933351245;
        }
        block56: while (true) {
            switch (var6_3) {
                default: {
                    continue block56;
                }
                case 583821011: {
                    ** continue;
                }
                case -1928992949: {
                    ** continue;
                }
                case 817206241: {
                    ** continue;
                }
                ** case -932168527:
lbl178:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void onTick(class_310 var1_1) {
        var8_2 = 1964954938;
        var5_3 = bu.b & 1964954938 ^ -1155951762;
        var7_4 = 0;
        var6_5 = (var5_3 | var8_2) ^ 1106996226;
        var7_4 = (var5_3 | var8_2) ^ -1734616175;
        ** GOTO lbl48
lbl7:
        // 3 sources

        while (true) {
            var7_4 = (var5_3 | var8_2) ^ -1860781793;
            ** GOTO lbl48
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var7_4 = (var5_3 | var8_2) ^ 1584753866;
            if (true) ** GOTO lbl48
            break;
        }
        {
            switch (var7_4) {
                case -677954050: {
                    var6_5 ^= var7_4 ^ -38946703;
                    var7_4 = (var5_3 | var8_2) ^ -258337908;
                    continue block23;
                }
                case -1573375803: {
                    var6_5 ^= var7_4 ^ 313451483;
                    ** GOTO lbl35
                }
                case -1807079997: {
                    this.b.entrySet().removeIf((Predicate<Map.Entry>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, pP(net.minecraft.class_243 double net.minecraft.class_310 java.util.Map$Entry ), (Ljava/util/Map$Entry;)Z)((class_243)var4_7, (double)var2_6, (class_310)var1_1));
                    var7_4 = (var5_3 | var8_2) ^ 680061568;
                    ** break;
                }
                case 260424946: {
                    this.pF();
                    var7_4 = (var5_3 | var8_2) ^ 1562896315;
                    ** break;
                }
                case -1646172254: {
                    var6_5 ^= var7_4 ^ 40315818;
                    var7_4 = (var5_3 | var8_2) ^ 1800794813;
                }
lbl33:
                // 5 sources

                default: {
                    continue block23;
                }
lbl35:
                // 1 sources

                var7_4 = (var5_3 | var8_2) ^ -952868073;
                continue block23;
                case 942388329: 
            }
        }
        return;
lbl39:
        // 1 sources

        while (true) {
            var7_4 = (var5_3 | var8_2) ^ 1660858588;
            ** GOTO lbl33
            break;
        }
lbl42:
        // 1 sources

        while (true) {
            var6_5 ^= -1593687127;
            var4_7 = new class_243(var1_1.field_1724.method_23317(), var1_1.field_1724.method_23318(), var1_1.field_1724.method_23321());
            ** continue;
            break;
        }
        block27: while (true) {
            var7_4 = (var5_3 | var8_2) ^ -1140312946;
lbl48:
            // 4 sources

            block28: while (true) {
                switch (var7_4) {
                    default: {
                        continue block28;
                    }
                    case -1048998480: {
                        if (!this.isEnabled()) ** GOTO lbl7
                        var7_4 = (var5_3 | var8_2) ^ -1619854044;
                        continue block28;
                    }
                    case 1736707311: {
                        var7_4 = (var5_3 | var8_2) ^ -350875655;
                        continue block28;
                    }
                    case 336189575: {
                        var6_5 ^= var7_4 ^ 1086661789;
                        ** GOTO lbl84
                    }
                    case -1041160263: {
                        if (var1_1.field_1687 != null) continue block27;
                        ** GOTO lbl7
                    }
                    case -70269084: {
                        if (var1_1.field_1724 != null) ** break;
                        ** continue;
                        ** break;
                    }
                    case -1490375369: {
                        var7_4 = (var5_3 | var8_2) ^ 1055846599;
                        continue block28;
                    }
                    case 1125639152: {
                        var6_5 ^= var7_4 ^ -380516633;
                        var7_4 = (var5_3 | var8_2) ^ -1001796329;
                        continue block28;
                    }
                    case 1617767002: {
                        var7_4 = (var5_3 | var8_2) ^ 80744474;
                        continue block28;
                    }
                    case 1846111841: {
                        var6_5 ^= var7_4 ^ -422254256;
                        ** continue;
                    }
lbl82:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ 1479899721;
                    continue block28;
lbl84:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ 1046895310;
                    continue block28;
                    case 995498601: {
                        var2_6 = ((Float)this.b.getValue()).floatValue() * ((Float)this.b.getValue()).floatValue();
                        ** continue;
                    }
                    case -1586840652: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public void render(WorldRenderContext var1_1, class_310 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [201[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private boolean pG(jE var1_1, class_243 var2_2, double var3_3) {
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
    private int[] pH(jE var1_1) {
        block75: {
            block74: {
                block76: {
                    block77: {
                        break block77;
lbl1:
                        // 1 sources

                        while (true) {
                            var15_4 = (var13_3 | var16_2) ^ 1543980086;
                            break block74;
                            break;
                        }
lbl4:
                        // 2 sources

                        while (true) {
                            var15_4 = (var13_3 | var16_2) ^ -1499974259;
                            break block74;
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var15_4 = (var13_3 | var16_2) ^ -1388227194;
                            break block75;
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var11_14 = var8_11 & bu.pM(((var14_16 ^= -1605205311) | var16_2) ^ -501028325, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ 1147540307));
                            var12_15 = var8_11 >>> bu.pM(((var14_16 ^= -1307273004) | var16_2) ^ 1076292184, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ 1741679174)) & bu.pM((var14_16 | var16_2) ^ 1076292185, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ 1671726136));
                            ** continue;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var15_4 = (var13_3 | var16_2) ^ -790149369;
                            break block76;
                            break;
                        }
                    }
                    var16_2 = 1506991546;
                    var13_3 = bu.b & 1506991546 ^ 2098117457;
                    var15_4 = 0;
                    var14_16 = (var13_3 | var16_2) ^ 917522335;
                    var15_4 = (var13_3 | var16_2) ^ -944681072;
                    block53: while (true) {
                        block78: {
                            switch (var15_4) {
                                case -416490817: {
                                    var14_16 ^= var15_4 ^ 1705826494;
                                    var15_4 = (var13_3 | var16_2) ^ -1790326397;
                                }
                                default: {
                                    continue block53;
                                }
                                case -392743304: {
                                    var2_5 = this.pA(var1_1.a);
                                    break;
                                }
                                case -1167085461: {
                                    break block78;
                                }
                            }
                            var15_4 = (var13_3 | var16_2) ^ 2106454184;
                            ** GOTO lbl-1000
                        }
                        var15_4 = (var13_3 | var16_2) ^ -1695406780;
                    }
lbl40:
                    // 1 sources

                    while (true) {
                        var15_4 = (var13_3 | var16_2) ^ 1976324897;
                        break block74;
lbl43:
                        // 1 sources

                        while (true) {
                            var15_4 = (var13_3 | var16_2) ^ 786205957;
                            break block74;
                            break;
                        }
                        break;
                    }
lbl46:
                    // 1 sources

                    while (true) {
                        var15_4 = (var13_3 | var16_2) ^ 795454076;
                        break block74;
                        break;
                    }
lbl49:
                    // 1 sources

                    while (true) {
                        var15_4 = (var13_3 | var16_2) ^ -1853212446;
                        break block75;
                        break;
                    }
lbl52:
                    // 1 sources

                    while (true) {
                        var6_9 = var3_6 & bu.pM(((var14_16 ^= 1650099638) | var16_2) ^ -1037572078, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ 852901416));
                        var7_10 = var3_6 >>> bu.pM(((var14_16 ^= -1311772989) | var16_2) ^ 1646971476, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ 513431928)) & bu.pM((var14_16 | var16_2) ^ 1646971477, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ -866632683));
                        var15_4 = (var13_3 | var16_2) ^ -1865344951;
                        break block75;
                        break;
                    }
lbl57:
                    // 2 sources

                    while (true) {
                        var15_4 = (var13_3 | var16_2) ^ -358744316;
                        break block74;
                        break;
                    }
lbl60:
                    // 1 sources

                    while (true) {
                        var15_4 = (var13_3 | var16_2) ^ -881643934;
                        break block76;
                        break;
                    }
lbl63:
                    // 1 sources

                    while (true) {
                        var15_4 = (var13_3 | var16_2) ^ -901072935;
                        break block75;
                        break;
                    }
                }
                block62: while (true) lbl-1000:
                // 5 sources

                {
                    block79: {
                        switch (var15_4) {
                            case 1181315527: {
                                var3_6 = (Integer)var2_5.a.getValue();
                                ** break;
                            }
                            case 5443411: {
                                var14_16 ^= var15_4 ^ -930688747;
                                var15_4 = (var13_3 | var16_2) ^ 563465257;
                                continue block62;
                            }
                            case -1388726020: {
                                return null;
                            }
lbl78:
                            // 1 sources

                            var4_7 = var3_6 >> bu.pM(((var14_16 ^= 1117716268) | var16_2) ^ -972568534, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ 324499103)) & bu.pM((var14_16 | var16_2) ^ -972568555, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ 701623687));
                            var5_8 = var3_6 >> bu.pM(((var14_16 ^= 2116711712) | var16_2) ^ -533731308, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ -1000169309)) & bu.pM((var14_16 | var16_2) ^ -533731305, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ -220126532));
                            ** continue;
                            case -1230122599: {
                                var14_16 ^= var15_4 ^ -1231563235;
                                ** continue;
                            }
                            case 1548432338: {
                                if (!((Boolean)var2_5.a.getValue()).booleanValue()) {
                                    ** continue;
                                }
                                break block79;
                            }
                            case -5411616: {
                                var14_16 ^= var15_4 ^ 2013821320;
                                ** break;
lbl91:
                                // 1 sources

                                var15_4 = (var13_3 | var16_2) ^ 1001885244;
                            }
                        }
                        continue;
                    }
                    var15_4 = (var13_3 | var16_2) ^ -2106354917;
                }
lbl96:
                // 1 sources

                while (true) {
                    var10_13 = var8_11 >> bu.pM(((var14_16 ^= 160368343) | var16_2) ^ 1109583960, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ 932321650)) & bu.pM((var14_16 | var16_2) ^ 1109583963, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ -1978755213));
                    ** continue;
                    break;
                }
lbl99:
                // 2 sources

                while (true) {
                    var15_4 = (var13_3 | var16_2) ^ -1594875851;
                    break block74;
lbl102:
                    // 2 sources

                    while (true) {
                        var15_4 = (var13_3 | var16_2) ^ -1367296119;
                        break block75;
                        break;
                    }
lbl105:
                    // 1 sources

                    while (true) {
                        var15_4 = (var13_3 | var16_2) ^ 296071295;
                        break block74;
lbl108:
                        // 1 sources

                        while (true) {
                            var15_4 = (var13_3 | var16_2) ^ -1865133034;
                            break block74;
lbl111:
                            // 1 sources

                            while (true) {
                                var15_4 = (var13_3 | var16_2) ^ 1536205189;
                                break block74;
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl114:
                // 2 sources

                while (true) {
                    var15_4 = (var13_3 | var16_2) ^ 168354814;
                    break block75;
                    break;
                }
lbl117:
                // 1 sources

                while (true) {
                    var15_4 = (var13_3 | var16_2) ^ -931161371;
                    break block75;
                    break;
                }
            }
            block71: while (true) {
                switch (var15_4) {
                    default: {
                        continue block71;
                    }
                    case -616117642: {
                        var15_4 = (var13_3 | var16_2) ^ 650508180;
                        continue block71;
                    }
                    case 1260256035: {
                        if (var12_15 != 0) ** GOTO lbl99
                        ** continue;
                    }
                    case 1528498287: {
                        var4_7 = (var4_7 + var9_12) / 2;
                        ** continue;
                    }
                    case 135441626: {
                        var14_16 ^= var15_4 ^ -249888338;
                        ** continue;
                    }
                    case -1245640098: {
                        var5_8 = (var5_8 + var10_13) / 2;
                        ** continue;
                    }
                    case 642670206: {
                        break;
                    }
                    case -318067731: {
                        var7_10 = Math.min(var7_10, var12_15);
                        ** GOTO lbl102
                    }
                    case 567917517: {
                        var14_16 ^= var15_4 ^ -464877391;
                        var15_4 = (var13_3 | var16_2) ^ 918750424;
                        continue block71;
                    }
                    case -109085376: {
                        var14_16 ^= var15_4 ^ 1280418626;
                        ** GOTO lbl4
                    }
                    case 1082190942: {
                        var14_16 ^= var15_4 ^ -738511578;
                        ** continue;
                    }
                    case 1004319488: {
                        var12_15 = bu.pM((var14_16 | var15_4 ^ 1645113018) ^ (var15_4 ^ -296162), (var13_3 | var15_4 ^ 1645113018) ^ ((var14_16 | var15_4 ^ 1645113018) ^ (var15_4 ^ 2146618160)));
                        ** continue;
                    }
                    case 1387746695: {
                        var6_9 = (var6_9 + var11_14) / 2;
                        ** continue;
                    }
                    case 1392669438: {
                        var14_16 ^= var15_4 ^ 1277862246;
                        var15_4 = (var13_3 | var16_2) ^ -937429595;
                        continue block71;
                    }
                    case -584130610: {
                        ** GOTO lbl57
                    }
                    case 1820020612: {
                        var14_16 ^= var15_4 ^ -129679699;
                        ** continue;
                    }
                    case -1757216513: {
                        switch (var14_16) {
                            case -736589908: {
                                var15_4 = (var13_3 | var16_2) ^ -2069790021;
                                continue block71;
                            }
                            default: {
                                var15_4 = (var13_3 | var16_2) ^ -1380342450;
                                continue block71;
                            }
                            case -1641917736: 
                        }
                        var15_4 = (var13_3 | var16_2) ^ 1029575589;
                        continue block71;
                    }
                    case -798532939: {
                        var14_16 ^= var15_4 ^ 1036741960;
                        ** continue;
                    }
                }
                var15_4 = (var13_3 | var16_2) ^ 1174555899;
            }
        }
        block72: while (true) {
            switch (var15_4) {
                default: {
                    continue block72;
                }
                case 2010520581: {
                    var14_16 ^= var15_4 ^ 1565798801;
                    ** continue;
                }
                case 1963831005: {
                    var7_10 = bu.pM((var14_16 | var15_4 ^ 752841575) ^ (var15_4 ^ 856573130), (var13_3 | var15_4 ^ 752841575) ^ ((var14_16 | var15_4 ^ 752841575) ^ (var15_4 ^ 841005750)));
                    ** GOTO lbl114
                }
                case -317724750: {
                    var14_16 ^= var15_4 ^ -780870031;
                    ** continue;
                }
                case -794842499: {
                    if (var7_10 == 0) ** break;
                    ** continue;
                    ** continue;
                }
                case -1215018974: {
                    if (var1_1.b) ** break;
                    ** continue;
                    ** continue;
                }
                case -1247714018: {
                    var15_4 = (var13_3 | var16_2) ^ 148066598;
                    continue block72;
                }
                case -329988327: {
                    var14_16 ^= var15_4 ^ 2076807676;
                    var15_4 = (var13_3 | var16_2) ^ -824283305;
                    continue block72;
                }
                case -748795790: {
                    var14_16 ^= var15_4 ^ 350322807;
                    var15_4 = (var13_3 | var16_2) ^ -135966255;
                    continue block72;
                }
                case -1291808596: {
                    var8_11 = (Integer)this.a.getValue();
                    var9_12 = var8_11 >> bu.pM(((var14_16 ^= -1465667610) | var16_2) ^ 1110436371, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ 389773002)) & bu.pM((var14_16 | var16_2) ^ 1110436380, (var13_3 | var16_2) ^ ((var14_16 | var16_2) ^ -1313888723));
                    ** continue;
                }
                case -1975800278: 
            }
            break;
        }
        return new int[]{var4_7, var5_8, var6_9, var7_10};
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public String getInfoString() {
        var7_1 = 446622964;
        var4_2 = bu.b & 446622964 ^ -76143760;
        var6_3 = 0;
        var5_7 = (var4_2 | var7_1) ^ -737411186;
        var6_3 = (var4_2 | var7_1) ^ -1562719011;
        if (true) ** GOTO lbl100
lbl7:
        // 1 sources

        while (true) {
            block37: {
                block38: {
                    block39: {
                        switch (var6_3) {
                            case -528702851: {
                                break block37;
                            }
                            case -1588442634: {
                                var5_7 ^= var6_3 ^ 1116963455;
                                break block38;
                            }
                            case 486210208: {
                                ** break;
                            }
                            case 2107565387: {
                                ++var1_4;
                                ** GOTO lbl24
                            }
                            case 1640897035: {
                                var5_7 ^= var6_3 ^ -1041483979;
                                break block39;
                            }
                            case -401729782: {
                                if (var3_6.b) ** GOTO lbl26
lbl24:
                                // 2 sources

                                var6_3 = (var4_2 | var7_1) ^ 1521264130;
                                break;
lbl26:
                                // 1 sources

                                var6_3 = (var4_2 | var7_1) ^ 461524361;
                            }
                        }
                        continue;
                    }
                    var6_3 = (var4_2 | var7_1) ^ 334559486;
                    continue;
                }
                var6_3 = (var4_2 | var7_1) ^ -419162796;
                continue;
            }
            var6_3 = (var4_2 | var7_1) ^ -2040526145;
            continue;
            break;
        }
lbl37:
        // 1 sources

        while (true) {
            var2_5 = this.b.values().iterator();
            ** break;
lbl40:
            // 2 sources

            var6_3 = (var4_2 | var7_1) ^ -232428984;
            if (true) ** GOTO lbl64
            block27: while (true) {
                var6_3 = (var4_2 | var7_1) ^ -680408052;
                block28: while (true) {
                    block40: {
                        block41: {
                            switch (var6_3) {
                                case 165381564: {
                                    var5_7 ^= var6_3 ^ 1768800217;
                                    ** break;
                                }
                                case 1823994828: {
                                    if (!var2_5.hasNext()) break block40;
                                    var6_3 = (var4_2 | var7_1) ^ -113401646;
                                    ** GOTO lbl64
                                }
                                case -72054434: {
                                    var3_6 = (jE)var2_5.next();
                                    var6_3 = (var4_2 | var7_1) ^ -1708067329;
                                    ** continue;
                                }
                                case 1135483863: {
                                    var5_7 ^= var6_3 ^ -1420412980;
                                    continue block27;
                                }
                                case 46354214: {
                                    var5_7 ^= var6_3 ^ 563516404;
                                    break block41;
                                }
lbl63:
                                // 1 sources

                                var6_3 = (var4_2 | var7_1) ^ -1756816328;
lbl64:
                                // 4 sources

                                default: {
                                    continue block28;
                                }
                                case 747578360: 
                            }
                            return this.b.size() + " (" + var1_4 + " ghost)";
                        }
                        var6_3 = (var4_2 | var7_1) ^ 0x4A66AA;
                        continue;
                    }
                    var6_3 = (var4_2 | var7_1) ^ -1202654173;
                }
                break;
            }
            break;
        }
        block29: while (true) {
            var6_3 = (var4_2 | var7_1) ^ -747328964;
            if (true) ** GOTO lbl79
            block30: while (true) {
                var6_3 = (var4_2 | var7_1) ^ 1262484723;
lbl79:
                // 2 sources

                block31: while (true) {
                    block43: {
                        block42: {
                            switch (var6_3) {
                                case 1765884640: {
                                    var5_7 ^= var6_3 ^ -297062;
                                    continue block30;
                                }
                                case 305477841: {
                                    var5_7 ^= var6_3 ^ 1823251098;
                                    var6_3 = (var4_2 | var7_1) ^ 632717470;
                                    continue block31;
                                }
                                case 680150472: {
                                    var1_4 = 0;
                                    break block42;
                                }
                                case -1329523961: {
                                    if (!this.isEnabled()) {
                                        var6_3 = (var4_2 | var7_1) ^ -372517083;
                                        ** break;
                                    }
                                    break block43;
                                }
                                case -565678230: {
                                    return null;
                                }
                                case 1495540521: {
                                    var6_3 = (var4_2 | var7_1) ^ -1832932076;
                                }
lbl100:
                                // 4 sources

                                default: {
                                    continue block31;
                                }
                                case 1207004216: 
                            }
                            var5_7 ^= var6_3 ^ 928431735;
                            continue block29;
                        }
                        var5_7 ^= -1033201801;
                        ** continue;
                    }
                    var6_3 = (var4_2 | var7_1) ^ -1139833908;
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static void pI(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11) {
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
    private static void pJ(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11, float var12_12) {
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
     * Unable to fully structure code
     */
    private static void pK(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11, boolean var12_12) {
        block47: {
            block45: {
                block42: {
                    block48: {
                        block44: {
                            block43: {
                                block41: {
                                    var16_13 = -1777324608;
                                    var13_14 = bu.b & -1777324608 ^ 1343843819;
                                    var15_15 = 0;
                                    ** GOTO lbl74
lbl5:
                                    // 1 sources

                                    while (true) {
                                        var14_16 ^= var15_15 ^ 1475371036;
                                        break block41;
                                        break;
                                    }
lbl8:
                                    // 1 sources

                                    while (true) {
                                        var15_15 = (var13_14 | var16_13) ^ 2006613373;
                                        ** GOTO lbl48
                                        break;
                                    }
                                }
                                var15_15 = (var13_14 | var16_13) ^ 1360546671;
                                ** GOTO lbl48
lbl14:
                                // 1 sources

                                while (true) {
                                    var15_15 = (var13_14 | var16_13) ^ -769667138;
                                    ** GOTO lbl48
lbl17:
                                    // 1 sources

                                    while (true) {
                                        var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                                        ** GOTO lbl102
                                        break;
                                    }
lbl21:
                                    // 1 sources

                                    while (true) {
                                        var14_16 ^= var15_15 ^ -1291672114;
                                        ** continue;
                                        break;
                                    }
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var15_15 = (var13_14 | var16_13) ^ -617522823;
                                        ** GOTO lbl48
                                        break;
                                    }
lbl27:
                                    // 1 sources

                                    while (true) {
                                        var14_16 ^= var15_15 ^ 466835576;
                                        ** GOTO lbl76
                                        break;
                                    }
lbl30:
                                    // 1 sources

                                    while (true) {
                                        var14_16 ^= var15_15 ^ 996366957;
                                        ** continue;
                                        break;
                                    }
lbl33:
                                    // 1 sources

                                    while (true) {
                                        var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                                        ** GOTO lbl98
                                        break;
                                    }
lbl37:
                                    // 1 sources

                                    return;
                                }
lbl39:
                                // 1 sources

                                block33: while (true) {
                                    var15_15 = (var13_14 | var16_13) ^ -723581260;
                                    ** GOTO lbl48
lbl42:
                                    // 1 sources

                                    while (true) {
                                        block46: {
                                            var15_15 = (var13_14 | var16_13) ^ 936148455;
                                            break block46;
lbl45:
                                            // 1 sources

                                            while (true) {
                                                var14_16 ^= var15_15 ^ -1718029187;
                                                break block42;
                                                break;
                                            }
                                        }
lbl49:
                                        // 12 sources

                                        block36: while (true) {
                                            switch (var15_15) lbl-1000:
                                            // 5 sources

                                            {
                                                while (true) {
                                                    default: {
                                                        continue block36;
                                                    }
                                                    break;
                                                }
                                                case 67543637: {
                                                    ** continue;
                                                }
                                                case -1833508469: {
                                                    ** continue;
                                                }
                                                case -319933881: {
                                                    ** continue;
                                                }
                                                case 41618580: {
                                                    ** continue;
                                                }
                                                case -1734465912: {
                                                    ** continue;
                                                }
                                                case 46558047: {
                                                    ** continue;
                                                }
                                                case -886183709: {
                                                    ** continue;
                                                }
                                                case 844565791: {
                                                    ** continue;
                                                }
                                                case 1208111741: {
                                                    var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                                                    break block43;
                                                }
lbl74:
                                                // 1 sources

                                                var14_16 = (var13_14 | var16_13) ^ 1700570412;
                                                break;
lbl76:
                                                // 1 sources

                                                var15_15 = (var13_14 | var16_13) ^ 489981192;
                                                ** GOTO lbl-1000
                                                case 1179851686: {
                                                    var14_16 ^= var15_15 ^ -68865908;
                                                    break block33;
                                                }
lbl81:
                                                // 1 sources

                                                while (true) {
                                                    var15_15 = (var13_14 | var16_13) ^ 1317489507;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case -506130420: {
                                                    var14_16 ^= var15_15 ^ 210113191;
                                                    break;
                                                }
                                                case 216996309: {
                                                    var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                                                    break block44;
                                                }
                                                case -1124463755: {
                                                    var14_16 ^= var15_15 ^ -1997605436;
                                                    break;
                                                }
                                                case 1085318582: {
                                                    var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                                                    break block45;
                                                }
lbl98:
                                                // 1 sources

                                                var15_15 = (var13_14 | var16_13) ^ 989290412;
                                                ** GOTO lbl-1000
                                                case -2042338010: {
                                                    ** continue;
                                                }
lbl102:
                                                // 1 sources

                                                var15_15 = (var13_14 | var16_13) ^ -198084671;
                                                ** continue;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                var15_15 = (var13_14 | var16_13) ^ 1152355424;
                                ** GOTO lbl49
                            }
                            var15_15 = (var13_14 | var16_13) ^ -1634148268;
                            ** GOTO lbl49
                        }
                        var15_15 = (var13_14 | var16_13) ^ -1874168243;
                        ** GOTO lbl49
                        {
                            case 220738706: {
                                if (var12_12) {
                                    ** continue;
                                }
                                break block47;
                            }
                        }
                        var15_15 = (var13_14 | var16_13) ^ 1348274381;
                        ** GOTO lbl49
                        {
                            case -214239505: {
                                var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                                ** continue;
                            }
                        }
                        var15_15 = (var13_14 | var16_13) ^ -1642381418;
                        ** GOTO lbl49
                        {
                            case 1216449983: {
                                var14_16 ^= var15_15 ^ -488964295;
                                ** continue;
                            }
                        }
lbl127:
                        // 1 sources

                        while (true) {
                            var15_15 = (var13_14 | var16_13) ^ 623090436;
                            ** GOTO lbl49
                            break;
                        }
                        {
                            case -1585246058: {
                                var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                                break block48;
                            }
                            case 573053482: {
                                var14_16 ^= var15_15 ^ 1263997758;
                                ** continue;
                            }
                        }
                        var15_15 = (var13_14 | var16_13) ^ -621382594;
                        ** GOTO lbl49
                        {
                            ** case -2029967740:
                        }
lbl140:
                        // 1 sources

                        var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                    }
                    var15_15 = (var13_14 | var16_13) ^ -731750017;
                    ** GOTO lbl49
                }
                var15_15 = (var13_14 | var16_13) ^ -1767258019;
                ** GOTO lbl49
            }
            var15_15 = (var13_14 | var16_13) ^ 1793287838;
            ** GOTO lbl49
        }
        var15_15 = (var13_14 | var16_13) ^ -464625420;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static void pL(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7, int var8_8, int var9_9, int var10_10, boolean var11_11) {
        block68: {
            block67: {
                block64: {
                    block65: {
                        block69: {
                            block66: {
                                break block69;
lbl1:
                                // 1 sources

                                while (true) {
                                    var14_14 = (var12_13 | var15_12) ^ 274111263;
                                    break block64;
lbl4:
                                    // 1 sources

                                    while (true) {
                                        if (!var11_11) break block65;
                                        break block66;
                                        break;
                                    }
lbl7:
                                    // 1 sources

                                    while (true) {
                                        var13_15 ^= var14_14 ^ 1737532172;
                                        break block67;
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    break;
                                }
lbl12:
                                // 1 sources

                                while (true) {
                                    var14_14 = (var12_13 | var15_12) ^ -1513719437;
                                    break block64;
lbl15:
                                    // 1 sources

                                    while (true) {
                                        var13_15 ^= var14_14 ^ -1404451901;
                                        ** GOTO lbl188
                                        break;
                                    }
lbl18:
                                    // 1 sources

                                    while (true) {
                                        var14_14 = (var12_13 | var15_12) ^ 285583628;
                                        break block64;
lbl21:
                                        // 2 sources

                                        while (true) {
                                            var14_14 = (var12_13 | var15_12) ^ -1669566223;
                                            break block64;
                                            break;
                                        }
lbl24:
                                        // 1 sources

                                        while (true) {
                                            var13_15 ^= var14_14 ^ -709301093;
                                            ** GOTO lbl182
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
lbl27:
                                // 1 sources

                                while (true) {
                                    var14_14 = (var12_13 | var15_12) ^ 827728953;
                                    break block64;
                                    break;
                                }
lbl30:
                                // 1 sources

                                while (true) {
                                    var14_14 = (var12_13 | var15_12) ^ -1622174846;
                                    break block64;
lbl33:
                                    // 1 sources

                                    while (true) {
                                        var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var6_6).method_1336(var7_7, var8_8, var9_9, var10_10);
                                        ** GOTO lbl21
                                        break;
                                    }
lbl37:
                                    // 1 sources

                                    while (true) {
                                        var13_15 ^= var14_14 ^ -1072238379;
                                        ** GOTO lbl188
                                        break;
                                    }
                                    break;
                                }
lbl40:
                                // 1 sources

                                while (true) {
                                    var14_14 = (var12_13 | var15_12) ^ -686155911;
                                    break block64;
                                    break;
                                }
lbl43:
                                // 1 sources

                                while (true) {
                                    var14_14 = (var12_13 | var15_12) ^ 291659796;
                                    break block64;
lbl46:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl48:
                                    // 1 sources

                                    while (true) {
                                        var14_14 = (var12_13 | var15_12) ^ -1427806308;
                                        break block64;
lbl51:
                                        // 1 sources

                                        while (true) {
                                            var13_15 ^= var14_14 ^ 236037805;
                                            ** GOTO lbl190
                                            break;
                                        }
lbl54:
                                        // 1 sources

                                        while (true) {
                                            var14_14 = (var12_13 | var15_12) ^ 462918577;
                                            break block64;
                                            break;
                                        }
lbl57:
                                        // 1 sources

                                        while (true) {
                                            var0.method_22918((Matrix4fc)var1_1, var2_2, var5_5, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                                            ** continue;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            var14_14 = (var12_13 | var15_12) ^ 1028163955;
                            break block64;
                            var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                            var14_14 = (var12_13 | var15_12) ^ 1325009362;
                            break block64;
lbl68:
                            // 2 sources

                            while (true) {
                                var14_14 = (var12_13 | var15_12) ^ 1394287625;
                                break block64;
lbl71:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl73:
                                // 1 sources

                                while (true) {
                                    var13_15 ^= var14_14 ^ 891838958;
                                    ** GOTO lbl162
                                    break;
                                }
lbl76:
                                // 1 sources

                                while (true) {
                                    var14_14 = (var12_13 | var15_12) ^ -212378177;
                                    break block64;
                                    break;
                                }
                                var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var6_6).method_1336(var7_7, var8_8, var9_9, var10_10);
                                var14_14 = (var12_13 | var15_12) ^ -968537934;
                                break block64;
                                break;
                            }
                        }
                        var15_12 = 1433267151;
                        var12_13 = bu.b & 1433267151 ^ -1328948956;
                        var14_14 = 0;
                        var13_15 = (var12_13 | var15_12) ^ 1348453310;
                        ** while (true)
lbl89:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ -1186704174;
                            ** GOTO lbl68
                            break;
                        }
lbl92:
                        // 1 sources

                        while (true) {
                            var0.method_22918((Matrix4fc)var1_1, var2_2, var5_5, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                            ** continue;
                            break;
                        }
lbl96:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ -911793988;
                            break block64;
                            break;
                        }
                        var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                        var14_14 = (var12_13 | var15_12) ^ -1965083384;
                        break block64;
lbl103:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ 842556253;
                            break block64;
                            break;
                        }
lbl106:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ 999607693;
                            ** continue;
                            break;
                        }
                    }
                    var14_14 = (var12_13 | var15_12) ^ -1017327679;
                }
lbl112:
                // 3 sources

                block61: while (true) {
                    switch (var14_14) lbl-1000:
                    // 6 sources

                    {
                        while (true) {
                            default: {
                                continue block61;
                            }
                            break;
                        }
                        case -1088327934: {
                            ** continue;
                        }
                        case -293967778: {
                            ** continue;
                        }
                        case -942303054: {
                            ** continue;
                        }
                        case -994320426: {
                            ** continue;
                        }
                        case 1771146014: {
                            ** continue;
                        }
                        case -558136967: {
                            ** continue;
                        }
                        case 1594399859: {
                            ** continue;
                        }
                        case 586673302: {
                            ** continue;
                        }
                        case 47316871: {
                            ** continue;
                        }
                        case 1789028461: {
                            ** continue;
                        }
                        case -440704784: {
                            ** continue;
                        }
                        case -417282813: {
                            ** continue;
                        }
                        case 1011538771: {
                            ** continue;
                        }
                        case -454536477: {
                            ** continue;
                        }
                        case 1345028764: {
                            ** continue;
                        }
                        case 112895568: {
                            ** continue;
                        }
                        case 917582894: {
                            ** continue;
                        }
                        case -1493770266: {
                            switch (var13_15) {
                                default: {
                                    ** continue;
                                }
                                case -1455531138: {
                                    ** continue;
                                }
                                ** case 2035806975:
lbl158:
                                // 1 sources

                                ** continue;
                            }
                        }
lbl159:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ -1746874895;
                            ** GOTO lbl-1000
                            break;
                        }
lbl162:
                        // 1 sources

                        var14_14 = (var12_13 | var15_12) ^ 1254921453;
                        ** GOTO lbl-1000
                        case 1645032990: {
                            var13_15 ^= var14_14 ^ -1403539077;
                            ** continue;
                        }
                        case -1156058563: {
                            var13_15 ^= var14_14 ^ -1065849388;
                            ** continue;
                        }
                        case -460350469: {
                            var0.method_22918((Matrix4fc)var1_1, var2_2, var5_5, var6_6).method_1336(var7_7, var8_8, var9_9, var10_10);
                            ** continue;
                        }
                        case 866693981: {
                            var13_15 ^= var14_14 ^ 1254304697;
                            ** continue;
                        }
                        case -928681316: {
                            var13_15 ^= var14_14 ^ 2073649763;
                            break block68;
                        }
                        case 1130371200: {
                            return;
                        }
lbl182:
                        // 1 sources

                        var14_14 = (var12_13 | var15_12) ^ -1232215185;
                        ** GOTO lbl-1000
                        case -519300448: {
                            var0.method_22918((Matrix4fc)var1_1, var2_2, var5_5, var6_6).method_1336(var7_7, var8_8, var9_9, var10_10);
                            ** continue;
                        }
lbl188:
                        // 2 sources

                        var14_14 = (var12_13 | var15_12) ^ 315440876;
                        ** GOTO lbl-1000
lbl190:
                        // 1 sources

                        var14_14 = (var12_13 | var15_12) ^ 727087766;
                        ** continue;
                        case 2134036199: {
                            break block61;
                        }
                    }
                    break;
                }
                ** while (true)
            }
            var14_14 = (var12_13 | var15_12) ^ 350347599;
            ** GOTO lbl112
        }
        var14_14 = (var12_13 | var15_12) ^ -147061656;
        ** while (true)
    }

    private static int pM(int n2, int n3) {
        int n4 = -1018030139;
        int n5 = 1314662498;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xD48B282D)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xCF5E3904;
        n6 ^= (n5 | n4) ^ 0xCF5E9B6E;
        n6 ^= (n5 | n4) ^ 0xCF5E62FD;
        n6 += (n5 | n4) ^ 0xCF5ED762;
        n6 -= (n5 | n4) ^ 0xCF5EEEEB;
        return n6 += (n5 | n4) ^ 0xCF5EB40C;
    }

    /*
     * Exception decompiling
     */
    private static void pN(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7, int var8_8, int var9_9, int var10_10, boolean var11_11) {
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
    private static void pO(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11) {
        var15_12 = 273295183;
        var12_13 = bu.b & 273295183 ^ 408613275;
        var14_14 = 0;
        var13_15 = (var12_13 | var15_12) ^ 277976463;
        ** GOTO lbl73
lbl6:
        // 1 sources

        while (true) {
            var14_14 = (var12_13 | var15_12) ^ -363109507;
            ** GOTO lbl52
            break;
        }
lbl9:
        // 1 sources

        block18: while (true) {
            block33: {
                var14_14 = (var12_13 | var15_12) ^ -2029451549;
                break block33;
lbl12:
                // 1 sources

                while (true) {
                    block34: {
                        var14_14 = (var12_13 | var15_12) ^ -753688381;
                        break block33;
lbl15:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ 1138826184;
                            break block33;
                            break;
                        }
lbl18:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ 72611336;
                            break block34;
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ -1376307444;
                            ** GOTO lbl97
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ -842936146;
                            break block33;
                            break;
                        }
                    }
                    var14_14 = (var12_13 | var15_12) ^ 553439708;
                    break block33;
lbl30:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ -1440964962;
                        break block33;
                        break;
                    }
lbl33:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl35:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ 618829376;
                        break block33;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var14_14 = (var12_13 | var15_12) ^ -381247650;
                    break block33;
lbl41:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ -1621634518;
                        break block33;
lbl44:
                        // 1 sources

                        return;
                    }
                    break;
                }
                bu.pK(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var3_3, var7_7, var8_8, var9_9, var10_10, var11_11, false);
                var14_14 = (var12_13 | var15_12) ^ 177085609;
                break block33;
lbl49:
                // 1 sources

                while (true) {
                    var13_15 ^= var14_14 ^ -211899685;
                    ** continue;
                    break;
                }
            }
lbl53:
            // 2 sources

            block31: while (true) {
                switch (var14_14) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block31;
                        }
                        break;
                    }
                    case -247709399: {
                        ** continue;
                    }
                    case -234777438: {
                        ** continue;
                    }
                    case -1304008383: {
                        ** continue;
                    }
                    case 471469932: {
                        ** continue;
                    }
                    case 950412803: {
                        ** continue;
                    }
                    case 1595645887: {
                        ** continue;
                    }
                    case 1590661606: {
                        bu.pN(var0, var1_1, var4_4, var2_2, var3_3, var5_5, var6_6, var8_8, var9_9, var10_10, var11_11, false);
                        ** continue;
                    }
lbl73:
                    // 1 sources

                    var14_14 = (var12_13 | var15_12) ^ -379144458;
                    ** GOTO lbl-1000
                    case -884386020: {
                        bu.pK(var0, var1_1, var2_2, var6_6, var4_4, var5_5, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, true);
                        break block18;
                    }
                    case 1018716575: {
                        var13_15 ^= var14_14 ^ 1859211322;
                        ** continue;
                    }
                    case -1621888708: {
                        var13_15 ^= var14_14 ^ -1867942470;
                        var14_14 = (var12_13 | var15_12) ^ 1184196153;
                        ** GOTO lbl-1000
                    }
                    case 1539042327: {
                        bu.pL(var0, var1_1, var2_2, var3_3, var4_4, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, false);
                        ** continue;
                    }
                    case 315943798: {
                        var13_15 ^= var14_14 ^ -1720198422;
                        ** continue;
                    }
                    case -249796479: {
                        bu.pN(var0, var1_1, var7_7, var2_2, var3_3, var5_5, var6_6, var8_8, var9_9, var10_10, var11_11, true);
                        ** continue;
                    }
                    case -711252111: {
                        var13_15 ^= var14_14 ^ -1991494230;
                        ** continue;
                    }
lbl97:
                    // 1 sources

                    var14_14 = (var12_13 | var15_12) ^ 71366835;
                    ** continue;
                }
                break;
            }
            break;
        }
        var14_14 = (var12_13 | var15_12) ^ 1195468896;
        ** while (true)
        {
            ** case -2029181451:
        }
lbl102:
        // 1 sources

        bu.pL(var0, var1_1, var5_5, var3_3, var4_4, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, true);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean pP(class_243 var0, double var1_1, class_310 var3_2, Map.Entry var4_3) {
        block22: {
            var10_4 = -408165208;
            var7_5 = bu.b & -408165208 ^ 265753975;
            var9_6 = 0;
            var8_7 = (var7_5 | var10_4) ^ -1904321424;
            var9_6 = (var7_5 | var10_4) ^ -1123586680;
            break block22;
            while (true) {
                var8_7 ^= 26683961;
                v0 = false;
lbl10:
                // 2 sources

                while (true) {
                    var8_7 ^= -1678857663;
                    var5_8.b = v0;
                    var9_6 = (var7_5 | var10_4) ^ -2038647181;
                    ** GOTO lbl49
                    break;
                }
                break;
            }
            {
                var9_6 = (var7_5 | var10_4) ^ 1688392811;
                if (true) ** GOTO lbl19
                block18: while (true) {
                    var9_6 = (var7_5 | var10_4) ^ 973927005;
lbl19:
                    // 2 sources

                    while (true) {
                        switch (var9_6) {
                            case 1621305921: {
                                var8_7 ^= var9_6 ^ -1212188485;
                                ** break;
                            }
                            case 2095084076: {
                                return true;
                            }
                            case -1956830828: {
                                if (var3_2.field_1687.method_8321(var6_9) != null) ** continue;
                                var8_7 ^= 26683961;
                                v0 = true;
                                ** continue;
                            }
                            case 1598243007: {
                                return false;
                            }
                            case 1770210188: {
                                var8_7 ^= var9_6 ^ 1498861712;
                                var9_6 = (var7_5 | var10_4) ^ -1329810112;
                                break;
                            }
                            case 1117158824: {
                                if (!(var0.method_1028((double)var6_9.method_10263() + 0.5, (double)var6_9.method_10264() + 0.5, (double)var6_9.method_10260() + 0.5) > var1_1)) continue block18;
                                var9_6 = (var7_5 | var10_4) ^ -1889738818;
                                break;
                            }
lbl41:
                            // 1 sources

                            var9_6 = (var7_5 | var10_4) ^ -1826650157;
                            break;
                            case -705493086: {
                                var8_7 ^= var9_6 ^ -1942729379;
                                continue block17;
                            }
                            case -2020825770: {
                                var8_7 ^= var9_6 ^ -919797224;
                                var9_6 = (var7_5 | var10_4) ^ -1385592745;
                            }
                        }
lbl49:
                        // 7 sources

                    }
                    break;
                }
            }
        }
        block21: while (true) {
            switch (var9_6) {
                case 1392023671: {
                    var9_6 = (var7_5 | var10_4) ^ 995734717;
                    continue block21;
                }
                case -727301822: {
                    var8_7 ^= var9_6 ^ -1050743264;
                    var9_6 = (var7_5 | var10_4) ^ 554197013;
                }
                default: {
                    continue block21;
                }
                case -822635030: 
            }
            break;
        }
        var5_8 = (jE)var4_3.getValue();
        var8_7 ^= 255686902;
        var6_9 = var5_8.a;
        var9_6 = (var7_5 | var10_4) ^ 1752387753;
        ** GOTO lbl49
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ long pQ(Map.Entry entry) {
        int n2 = b & 0xE8FC42D1 ^ 0xF6AC7AAC;
        int n3 = 0;
        int n4 = (n2 | 0xE8FC42D1) ^ 0x59C712A7;
        n3 = (n2 | 0xE8FC42D1) ^ 0x33F73A7;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1650332534: {
                    n4 ^= n3 ^ 0xD4B89685;
                    n3 = (n2 | 0xE8FC42D1) ^ 0xB25AFE2B;
                    continue block5;
                }
                case -37549734: {
                    n3 = (n2 | 0xE8FC42D1) ^ 0x635D9677;
                    continue block5;
                }
                case 1285981398: 
            }
            break;
        }
        return ((jE)entry.getValue()).a;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void pR(class_2338 var1_1, class_2591 var2_2, class_2487 var3_3) {
        block26: {
            var9_4 = 1142658303;
            var6_5 = bu.b & 1142658303 ^ -196550252;
            var8_6 = 0;
            var7_9 = (var6_5 | var9_4) ^ 902741042;
            var8_6 = (var6_5 | var9_4) ^ -1885973794;
            while (true) {
                switch (var8_6) {
                    case -1338570456: {
                        var7_9 ^= var8_6 ^ 494479445;
                        var8_6 = (var6_5 | var9_4) ^ -679478190;
                    }
                    default: {
                        break;
                    }
                    case 589564333: {
                        var4_7 = class_7923.field_41181.method_10221((Object)var2_2);
                        var8_6 = (var6_5 | var9_4) ^ -1522160050;
                        break block26;
                    }
                    case 2077075233: {
                        var8_6 = (var6_5 | var9_4) ^ 1147993303;
                        break;
                    }
                }
            }
            while (true) {
                var8_6 = (var6_5 | var9_4) ^ 94331062;
                break block26;
                break;
            }
lbl24:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl26:
            // 1 sources

            while (true) {
                var8_6 = (var6_5 | var9_4) ^ 151284194;
                break block26;
                break;
            }
lbl29:
            // 2 sources

            while (true) {
                var7_9 ^= 1597690590;
                ** continue;
                break;
            }
            var5_8 = v0;
            var8_6 = (var6_5 | var9_4) ^ -709645868;
            block24: while (true) {
                switch (var8_6) {
                    default: {
                        continue block24;
                    }
                    case -1628211210: {
                        var7_9 ^= var8_6 ^ 579574180;
                        ** break;
                    }
                    case 568876075: {
                        var7_9 ^= var8_6 ^ -352069392;
                        ** GOTO lbl46
                    }
lbl44:
                    // 1 sources

                    var8_6 = (var6_5 | var9_4) ^ -1907544276;
                    continue block24;
lbl46:
                    // 1 sources

                    var8_6 = (var6_5 | var9_4) ^ 657511053;
                    continue block24;
                    case -747952270: {
                        this.pD(var1_1, var5_8, var3_3, true);
                        var8_6 = (var6_5 | var9_4) ^ 1789428233;
                        continue block24;
                    }
                    case 2048318163: 
                }
                break;
            }
            return;
        }
        block25: while (true) {
            switch (var8_6) {
                default: {
                    continue block25;
                }
                case 815908203: {
                    if (var4_7 == null) ** continue;
                    var8_6 = (var6_5 | var9_4) ^ 2011051066;
                    continue block25;
                }
                case 1360944049: {
                    var7_9 ^= var8_6 ^ -439833859;
                    break;
                }
                case -238774967: {
                    var7_9 ^= var8_6 ^ -866055390;
                    var8_6 = (var6_5 | var9_4) ^ -687353273;
                    continue block25;
                }
                case -2088386107: {
                    var7_9 ^= var8_6 ^ -1105174610;
                    ** continue;
                }
                case 593242040: {
                    v0 = var2_2.toString();
                    ** GOTO lbl29
                }
                case -44065763: {
                    v0 = var4_7.toString();
                    ** continue;
                }
            }
            var8_6 = (var6_5 | var9_4) ^ -990236524;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void pS(class_634 var0, class_310 var1_1) {
        var6_2 = -1980353612;
        var3_3 = bu.b & -1980353612 ^ 1860796481;
        var5_4 = 0;
        var4_6 = (var3_3 | var6_2) ^ 571810939;
        var5_4 = (var3_3 | var6_2) ^ -1418956910;
        block13: while (true) {
            switch (var5_4) {
                case 1150540903: {
                    var5_4 = (var3_3 | var6_2) ^ -813243030;
                    ** break;
                }
                case 544822943: {
                    var4_6 ^= var5_4 ^ 1414657601;
                    var5_4 = (var3_3 | var6_2) ^ 2012433471;
                }
lbl14:
                // 3 sources

                default: {
                    continue block13;
                }
                case -1743978550: 
            }
            break;
        }
        var2_5 = bu.a;
        var5_4 = (var3_3 | var6_2) ^ 1124780010;
        if (true) ** GOTO lbl22
        block14: while (true) {
            var5_4 = (var3_3 | var6_2) ^ 201358257;
lbl22:
            // 2 sources

            block15: while (true) {
                switch (var5_4) {
                    case -405758399: {
                        var5_4 = (var3_3 | var6_2) ^ -779865608;
                        continue block15;
                    }
                    case -469776316: {
                        var4_6 ^= var5_4 ^ 1097222318;
                        var5_4 = (var3_3 | var6_2) ^ -628150017;
                        continue block15;
                    }
                    case -1393200097: {
                        var4_6 ^= var5_4 ^ 1185783497;
                        ** break;
                    }
                    case 1048281613: {
                        var2_5.b.clear();
                        continue block14;
                    }
                    case -1972756154: {
                        if (var2_5 != null) ** break;
                        continue block14;
                        var5_4 = (var3_3 | var6_2) ^ 137309620;
                    }
                    default: {
                        continue block15;
                    }
lbl43:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 1704301235;
                    continue block15;
                    case 896566026: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void pT(class_638 var0, class_2818 var1_1) {
        block58: {
            block59: {
                block57: {
                    block60: {
                        block56: {
                            break block60;
lbl1:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ -965579959;
                                ** GOTO lbl118
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ -973537457;
                                ** GOTO lbl118
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ 212372004;
                                ** GOTO lbl118
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ -1893430445;
                                ** GOTO lbl72
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var4_5 ^= var5_4 ^ -1362880848;
                                ** GOTO lbl145
                                break;
                            }
lbl16:
                            // 1 sources

                            return;
lbl18:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ 674713636;
                                ** GOTO lbl72
                                break;
                            }
lbl21:
                            // 1 sources

                            while (true) {
                                var4_5 ^= var5_4 ^ -1794166325;
                                break block56;
                                break;
                            }
lbl24:
                            // 1 sources

                            while (true) {
                                if (var0 instanceof class_638) break block57;
                                ** continue;
                                break;
                            }
lbl27:
                            // 1 sources

                            while (true) {
                                var4_5 ^= var5_4 ^ 856084852;
                                ** GOTO lbl147
                                break;
                            }
lbl30:
                            // 1 sources

                            while (true) {
                                continue;
lbl32:
                                // 1 sources

                                while (true) {
                                    var4_5 ^= var5_4 ^ -175726110;
                                    ** continue;
                                    break;
                                }
                                break;
                            }
                        }
                        var5_4 = (var3_3 | var6_2) ^ 1100278323;
                        ** GOTO lbl72
lbl38:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ 1436779573;
                            ** GOTO lbl72
                            break;
                        }
                    }
                    var6_2 = -1574337908;
                    var3_3 = bu.b & -1574337908 ^ -89481085;
                    var5_4 = 0;
                    var4_5 = (var3_3 | var6_2) ^ 799664097;
                    ** while (true)
lbl47:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ 590606080;
                        ** GOTO lbl118
                        break;
                    }
                    var2_6 = bu.a;
                    var5_4 = (var3_3 | var6_2) ^ 1058050251;
                    ** GOTO lbl72
lbl53:
                    // 2 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ 221787781;
                        ** GOTO lbl118
lbl56:
                        // 1 sources

                        while (true) {
                            switch (var4_5) {
                                case 532105852: {
                                    ** continue;
                                }
                                default: {
                                    ** continue;
                                }
                                ** case -721271442:
lbl63:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                        break;
                    }
                }
                var5_4 = (var3_3 | var6_2) ^ 1213385486;
                ** GOTO lbl72
lbl67:
                // 1 sources

                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ -1698387716;
                    if (true) ** GOTO lbl72
                    break;
                }
                block47: while (true) {
                    var5_4 = (var3_3 | var6_2) ^ 1917144727;
lbl72:
                    // 10 sources

                    block48: while (true) {
                        switch (var5_4) lbl-1000:
                        // 5 sources

                        {
                            while (true) {
                                default: {
                                    continue block48;
                                }
                                break;
                            }
                            case -1292277375: {
                                ** continue;
                            }
                            case 1972316636: {
                                ** continue;
                            }
                            case -2085156339: {
                                ** continue;
                            }
                            case -1153480516: {
                                ** continue;
                            }
                            case 1617889907: {
                                ** continue;
                            }
                            case -1358420294: {
                                break block58;
                            }
lbl89:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ -334001141;
                                ** GOTO lbl-1000
                                break;
                            }
lbl92:
                            // 1 sources

                            while (true) {
                                var4_5 ^= var5_4 ^ 1887412207;
                                ** GOTO lbl147
                                break;
                            }
lbl95:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ 1641430166;
                                ** GOTO lbl118
                                break;
                            }
                            case 1084791621: {
                                class_310.method_1551().execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, pU(z.r.bu net.minecraft.class_2818 ), ()V)((bu)var2_6, (class_2818)var1_1));
                                ** continue;
                            }
                            case 381431428: {
                                return;
                            }
lbl103:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ 564980866;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -620278259: {
                                return;
                            }
                            case 1029324574: {
                                if (var2_6.isEnabled()) break block47;
                                continue block47;
                            }
                            case 1728456374: {
                                if (var2_6 != null) ** break;
                                continue block47;
                                ** continue;
                            }
                            case -761466197: {
                                var4_5 ^= var5_4 ^ -2019031292;
                                ** continue;
                            }
lbl118:
                            // 8 sources

                            block54: while (true) {
                                switch (var5_4) {
                                    default: {
                                        continue block54;
                                    }
                                    case 759737092: {
                                        ** continue;
                                    }
                                    case -644330097: {
                                        ** continue;
                                    }
                                    case -1686266343: {
                                        ** continue;
                                    }
                                    case -141323254: {
                                        ** continue;
                                    }
                                    case -167565141: {
                                        ** continue;
                                    }
                                    case 1209996801: {
                                        ** GOTO lbl53
                                    }
                                    case -1997607912: {
                                        var4_5 ^= var5_4 ^ 1260854585;
                                        ** continue;
                                    }
lbl137:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -1649572807;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case 1062428096: {
                                        var4_5 ^= var5_4 ^ -1964636975;
                                        ** continue;
                                    }
                                    case 1020905926: {
                                        break block59;
                                    }
                                }
                                break;
                            }
lbl145:
                            // 1 sources

                            var5_4 = (var3_3 | var6_2) ^ -1174193718;
                            ** continue;
lbl147:
                            // 2 sources

                            var5_4 = (var3_3 | var6_2) ^ -672986741;
                            ** GOTO lbl118
                        }
                        break;
                    }
                    break;
                }
                var5_4 = (var3_3 | var6_2) ^ 2031921282;
                ** GOTO lbl72
                {
                    ** case -977587644:
                }
lbl152:
                // 1 sources

                var4_5 ^= var5_4 ^ 626756087;
                ** while (true)
            }
            var5_4 = (var3_3 | var6_2) ^ -1296780146;
            ** while (true)
        }
        var5_4 = (var3_3 | var6_2) ^ -940466799;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void pU(bu var0, class_2818 var1_1) {
        block7: {
            var2_2 = bu.b & 1565085928 ^ -1968674474;
            var4_3 = 0;
            ** GOTO lbl11
lbl4:
            // 2 sources

            block5: while (true) {
                switch (var4_3) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
                    case -555949516: {
                        break block5;
                    }
lbl11:
                    // 1 sources

                    var3_4 = (var2_2 | 1565085928) ^ 122588639;
                    var4_3 = (var2_2 | 1565085928) ^ 20290506;
                    ** continue;
                    case 980219941: {
                        var3_4 ^= var4_3 ^ -217613418;
                        break block7;
                    }
                }
                break;
            }
            var4_3 = (var2_2 | 1565085928) ^ -444235301;
            ** GOTO lbl4
            {
                ** case 752032312:
            }
lbl20:
            // 1 sources

            var0.pB(var1_1);
            return;
        }
        var4_3 = (var2_2 | 1565085928) ^ -214277178;
        ** while (true)
    }
}

