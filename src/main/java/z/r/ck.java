/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents$Load
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents$Unload
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1923
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_243
 *  net.minecraft.class_2818
 *  net.minecraft.class_310
 *  net.minecraft.class_4588
 *  net.minecraft.class_638
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package z.r;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.ArrayDeque;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1923;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_4588;
import net.minecraft.class_638;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import z.r.O;
import z.r.az;
import z.r.dA;
import z.r.gF;
import z.r.gP;
import z.r.gj;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class ck
extends gF {
    private static final /* synthetic */ String a;
    private static final int[] a;
    private final ke a;
    private final Long2IntOpenHashMap a;
    public static final int k;
    private class_1923 a;
    private final LongArrayList a;
    private final gP a;
    private static final int a;
    private static final int b;
    private final gP b;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String b;
    private int c;
    private final az a;
    private static volatile ck a;
    private final ke b;
    private final ArrayDeque<Long> a;
    private static final int d;
    private final az b;
    private final gP c;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final int e;
    private int f;
    private static final float a;
    private final az c;
    private final Long2ObjectOpenHashMap<List<O>> a;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final int g;
    private static final int[] b;
    private static final int[] c;
    private static final float b;
    private final gP d;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final int[] e;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final int h;
    private static final int[] d;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final float c;
    private static final /* synthetic */ String n;
    private final class_2338.class_2339 a;
    private final LongOpenHashSet a;
    private boolean a;
    private static final int i;
    private static final /* synthetic */ String o;
    private final ke c;
    private final LongArrayList b;
    private static final /* synthetic */ String p;
    private static final float d;
    private final LongOpenHashSet b;
    private static final int j;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void onClientBlockChanged(class_2818 var0, class_2338 var1_1) {
        block105: {
            block106: {
                block103: {
                    block102: {
                        block107: {
                            block104: {
                                var15_2 = 864311835;
                                var12_3 = ck.k & 864311835 ^ -496869091;
                                var14_4 = 0;
                                var13_6 = (var12_3 | var15_2) ^ -378911241;
                                var14_4 = (var12_3 | var15_2) ^ -1280917297;
                                break block107;
                                while (true) {
                                    break block102;
                                    break;
                                }
lbl9:
                                // 2 sources

                                while (true) {
                                    var6_10 = v0;
                                    var14_4 = var4_8 == ck.mN(((var13_6 ^= 296309706) | var15_2) ^ -1804517065, (var12_3 | var15_2) ^ ((var13_6 | var15_2) ^ -1306726641)) ? (var12_3 | var15_2) ^ -1621026385 : (var12_3 | var15_2) ^ -2109965185;
                                    ** GOTO lbl286
                                    break;
                                }
lbl13:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl15:
                                // 1 sources

                                while (true) {
                                    var14_4 = (var12_3 | var15_2) ^ 1665118594;
                                    break block103;
                                    break;
                                }
lbl18:
                                // 1 sources

                                while (true) {
                                    var14_4 = (var12_3 | var15_2) ^ -1645812047;
                                    break block104;
                                    break;
                                }
lbl21:
                                // 2 sources

                                while (true) {
                                    var8_12 = v1;
                                    if (var5_9 == ck.mN(((var13_6 ^= 686389843) | var15_2) ^ -804002446, (var12_3 | var15_2) ^ ((var13_6 | var15_2) ^ 275429276))) {
                                        var14_4 = (var12_3 | var15_2) ^ -1473052186;
                                        break block105;
                                    }
                                    var14_4 = (var12_3 | var15_2) ^ -494134988;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var7_11 = v2;
                                    var14_4 = (var12_3 | var15_2) ^ -1510633747;
                                    break block103;
                                    break;
                                }
lbl32:
                                // 2 sources

                                while (true) {
                                    var14_4 = (var12_3 | var15_2) ^ -878455138;
                                    break block106;
                                    break;
                                }
lbl35:
                                // 1 sources

                                while (true) {
                                    var14_4 = (var12_3 | var15_2) ^ 677074503;
                                    break block106;
                                    break;
                                }
lbl38:
                                // 1 sources

                                while (true) {
                                    var14_4 = (var12_3 | var15_2) ^ 11616922;
                                    break block104;
                                    break;
                                }
lbl41:
                                // 1 sources

                                while (true) {
                                    var14_4 = (var12_3 | var15_2) ^ 1454097574;
                                    break block107;
                                    break;
                                }
                            }
                            block78: while (true) {
                                switch (var14_4) {
                                    case -796713755: {
                                        if (var4_8 != 0) {
                                            var14_4 = (var12_3 | var15_2) ^ 1717496109;
                                            break;
                                        }
                                        var14_4 = (var12_3 | var15_2) ^ 1683386725;
                                        break;
                                    }
                                    case -1783066062: {
                                        var13_6 ^= var14_4 ^ -1546323236;
                                        ** continue;
                                    }
                                    case -212387451: {
                                        v0 = 0;
                                        ** GOTO lbl9
                                    }
                                    case 1845534126: {
                                        v0 = -1;
                                        ** continue;
                                    }
                                    case -1750070662: {
                                        var13_6 ^= var14_4 ^ -1579392364;
                                        ** continue;
                                    }
                                    case -1072463939: {
                                        var13_6 ^= var14_4 ^ 1984847677;
                                        var14_4 = (var12_3 | var15_2) ^ 593848314;
                                        continue block78;
                                    }
                                }
lbl69:
                                // 4 sources

                            }
                            var14_4 = (var12_3 | var15_2) ^ 461338813;
                            block80: while (true) {
                                block108: {
                                    switch (var14_4) {
                                        case -392625246: {
                                            var13_6 ^= var14_4 ^ -421300929;
                                            var14_4 = (var12_3 | var15_2) ^ 1466107344;
                                            continue block80;
                                        }
                                        case -1534755121: {
                                            if (var11_15 <= var9_13) {
                                                var14_4 = (var12_3 | var15_2) ^ -4303130;
                                                break;
                                            }
                                            break block108;
                                        }
                                        case -1997053287: {
                                            ++var10_14;
                                            ** GOTO lbl32
                                        }
                                        case 1597803522: {
                                            ++var11_15;
                                            ** GOTO lbl13
                                        }
                                        case 1838592871: {
                                            var13_6 ^= var14_4 ^ -228260104;
                                            var14_4 = (var12_3 | var15_2) ^ 2064718214;
                                            break;
                                        }
                                        case 1369771102: {
                                            var2_5.mB(class_1923.method_8331((int)(var3_7.field_9181 + var10_14), (int)(var3_7.field_9180 + var11_15)));
                                            var14_4 = (var12_3 | var15_2) ^ -1630827265;
                                            break;
                                        }
                                        case 207105529: {
                                            var13_6 ^= var14_4 ^ 1596733740;
                                            var14_4 = (var12_3 | var15_2) ^ -1572636863;
                                            break;
                                        }
                                        case 1831729120: {
                                            var13_6 ^= var14_4 ^ 807638440;
                                            ** break;
lbl103:
                                            // 1 sources

                                            var14_4 = (var12_3 | var15_2) ^ -1394936035;
                                        }
                                    }
                                    continue;
                                }
                                var14_4 = (var12_3 | var15_2) ^ -1636775816;
                            }
                        }
                        block81: while (true) {
                            switch (var14_4) {
                                default: {
                                    continue block81;
                                }
                                case 1077984208: {
                                    ** break;
                                }
                                case -1074850414: {
                                    var13_6 ^= var14_4 ^ -1338115010;
                                    ** continue;
                                }
lbl118:
                                // 1 sources

                                var14_4 = (var12_3 | var15_2) ^ 1275686541;
                                continue block81;
                                case -1521631303: 
                            }
                            break;
                        }
                        var2_5 = ck.a;
                        var14_4 = (var12_3 | var15_2) ^ 759953818;
                        ** GOTO lbl192
lbl124:
                        // 1 sources

                        while (true) {
                            var14_4 = (var12_3 | var15_2) ^ 1176485092;
                            break block106;
                            break;
                        }
                        while (true) {
                            var14_4 = (var12_3 | var15_2) ^ 845034910;
                            break block103;
                            break;
                        }
lbl130:
                        // 1 sources

                        while (true) {
                            var14_4 = (var12_3 | var15_2) ^ -1551865793;
                            break block105;
                            break;
                        }
lbl133:
                        // 1 sources

                        while (true) {
                            var14_4 = (var12_3 | var15_2) ^ -215297280;
                            break block106;
                            break;
                        }
lbl136:
                        // 2 sources

                        while (true) {
                            var13_6 ^= 927668047;
                            var9_13 = v3;
                            var13_6 ^= 1707659958;
                            var10_14 = var6_10;
                            ** continue;
                            break;
                        }
                    }
                    var14_4 = (var12_3 | var15_2) ^ 399083316;
                    block87: while (true) {
                        switch (var14_4) {
                            case -1844431862: {
                                if (var2_5.isEnabled()) ** continue;
                                ** GOTO lbl-1000
                            }
                            case 1282652346: {
                                var3_7 = var0.method_12004();
                                ** GOTO lbl196
                            }
                            case 1694004641: {
                                var13_6 ^= var14_4 ^ -1699053268;
                                ** GOTO lbl202
                            }
                            case -1829618196: {
                                var13_6 ^= var14_4 ^ -1542641110;
                                ** break;
                            }
                            case -559054203: {
                                var13_6 ^= var14_4 ^ 1511624877;
                                ** GOTO lbl167
                            }
lbl161:
                            // 1 sources

                            var14_4 = (var12_3 | var15_2) ^ -1048079582;
                            ** GOTO lbl192
                            case -466617301: {
                                var13_6 ^= var14_4 ^ 214717211;
                                var14_4 = (var12_3 | var15_2) ^ -1098836677;
                                ** GOTO lbl192
                            }
lbl167:
                            // 1 sources

                            var14_4 = (var12_3 | var15_2) ^ -16450824;
                            ** GOTO lbl192
                            case 1298624036: {
                                if (!(var0.method_12200() instanceof class_638)) ** GOTO lbl174
                                ** GOTO lbl194
                            }
                            case 1501540728: {
                                if (class_310.method_1551().field_1687 == var0.method_12200()) ** GOTO lbl179
lbl174:
                                // 2 sources

                                var14_4 = (var12_3 | var15_2) ^ 1628718835;
                                ** GOTO lbl192
                            }
                            case 1085962627: {
                                var14_4 = (var12_3 | var15_2) ^ -1432761753;
                                continue block87;
                            }
lbl179:
                            // 1 sources

                            var14_4 = (var12_3 | var15_2) ^ -1759637826;
                            continue block87;
                            case -1971167087: {
                                var13_6 ^= var14_4 ^ 1480947621;
                                var14_4 = (var12_3 | var15_2) ^ -120664827;
                                ** GOTO lbl192
                            }
                            case -471543535: {
                                ** GOTO lbl200
                            }
                            case 216170983: {
                                if (var2_5 != null) {
                                    var14_4 = (var12_3 | var15_2) ^ 268610062;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var14_4 = (var12_3 | var15_2) ^ 2036603790;
                                }
                            }
lbl192:
                            // 9 sources

                            default: {
                                continue block87;
                            }
lbl194:
                            // 1 sources

                            var14_4 = (var12_3 | var15_2) ^ -1285815652;
                            continue block87;
lbl196:
                            // 1 sources

                            var4_8 = var1_1.method_10263() & ck.mN(((var13_6 ^= 441682968) | var15_2) ^ 1548305809, (var12_3 | var15_2) ^ ((var13_6 | var15_2) ^ 1054731849));
                            var5_9 = var1_1.method_10260() & ck.mN(((var13_6 ^= 1529091841) | var15_2) ^ 342442128, (var12_3 | var15_2) ^ ((var13_6 | var15_2) ^ -206941773));
                            var14_4 = (var12_3 | var15_2) ^ 871695522;
                            ** GOTO lbl69
lbl200:
                            // 1 sources

                            var14_4 = (var12_3 | var15_2) ^ 1643532053;
                            continue block87;
lbl202:
                            // 1 sources

                            var14_4 = (var12_3 | var15_2) ^ -1080704091;
                            continue block87;
lbl204:
                            // 2 sources

                            while (true) {
                                var13_6 ^= 514799675;
                                ** continue;
                                break;
                            }
lbl207:
                            // 1 sources

                            while (true) {
                                var14_4 = (var12_3 | var15_2) ^ 1448335360;
                                if (true) ** GOTO lbl286
                                break;
                            }
                            case 187217434: {
                                return;
                            }
                            case 845277245: 
                        }
                        break;
                    }
                    return;
lbl214:
                    // 1 sources

                    while (true) {
                        var14_4 = (var12_3 | var15_2) ^ -949697002;
                        break block103;
                        break;
                    }
lbl217:
                    // 1 sources

                    while (true) {
                        var14_4 = (var12_3 | var15_2) ^ 1742148035;
                        break block105;
                        break;
                    }
                }
                while (true) {
                    switch (var14_4) {
                        case -1044885887: {
                            var13_6 ^= var14_4 ^ -1688139712;
                            ** continue;
                        }
                        case 1444148722: {
                            var13_6 ^= var14_4 ^ -455893452;
                            ** continue;
                        }
                        case 880983305: {
                            v1 = 0;
                            ** GOTO lbl21
                        }
                        case -1864775011: {
                            if (var5_9 != 0) ** continue;
                            var14_4 = (var12_3 | var15_2) ^ 1812927813;
                            break;
                        }
                        case -1264073652: {
                            v1 = -1;
                            ** continue;
                        }
                        case -1612091814: {
                            var13_6 ^= var14_4 ^ -986699621;
                            var14_4 = (var12_3 | var15_2) ^ 1195491155;
                        }
                    }
                }
            }
            block93: while (true) {
                switch (var14_4) {
                    case -1241921541: {
                        if (var10_14 > var7_11) break;
                        ** continue;
                    }
                    case 944090497: {
                        var13_6 ^= var14_4 ^ 1836957639;
                        ** continue;
                    }
                    case -608359080: {
                        var13_6 ^= var14_4 ^ 520944668;
                        var14_4 = (var12_3 | var15_2) ^ 516207643;
                    }
                    default: {
                        continue block93;
                    }
                    case -316485884: {
                        var11_15 = var8_12;
                        ** continue;
                    }
                    case -1475512832: {
                        var13_6 ^= var14_4 ^ -388330886;
                        ** continue;
                    }
                    case 13412383: {
                        return;
                    }
                }
                var14_4 = (var12_3 | var15_2) ^ 1542130975;
            }
        }
        block94: while (true) {
            switch (var14_4) lbl-1000:
            // 2 sources

            {
                default: {
                    continue block94;
                }
                case -1808700708: {
                    v3 = 0;
                    ** GOTO lbl136
                }
                case 1540717305: {
                    var13_6 ^= var14_4 ^ -1857291001;
                    ** continue;
                }
                case 1348866848: {
                    v3 = 1;
                    ** continue;
                }
                case 292184619: 
            }
            break;
        }
        var13_6 ^= var14_4 ^ -604707371;
        ** while (true)
        while (true) {
            var14_4 = (var12_3 | var15_2) ^ -1940276591;
lbl286:
            // 3 sources

            block96: while (true) {
                switch (var14_4) {
                    default: {
                        continue block96;
                    }
                    case -1514822881: {
                        v2 = 1;
                        ** GOTO lbl204
                    }
                    case 2143273358: {
                        v2 = 0;
                        ** continue;
                    }
                    case 1820811952: {
                        var13_6 ^= var14_4 ^ -960829047;
                        ** continue;
                    }
                    case 1910114144: 
                }
                break;
            }
            var13_6 ^= var14_4 ^ -605582247;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ck() {
        var4_1 = 477983526;
        var1_2 = ck.k & 477983526 ^ -1556438809;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -1760616949;
        ** GOTO lbl214
lbl6:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1341019154;
            ** GOTO lbl42
            break;
        }
lbl9:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 609318720;
            ** GOTO lbl42
            break;
        }
lbl12:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1418197296;
            if (true) ** GOTO lbl42
            break;
        }
        block51: while (true) {
            super(ck.k, ck.s, dA.q);
            var3_3 = (var1_2 | var4_1) ^ -100480734;
            ** GOTO lbl42
lbl19:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -817792164;
                ** GOTO lbl42
                break;
            }
lbl22:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -1063424022;
                ** GOTO lbl42
                break;
            }
lbl25:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 960452756;
                if (true) ** GOTO lbl42
                break;
            }
            block55: while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1296901097;
                ** GOTO lbl42
lbl31:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 433776049;
                    ** GOTO lbl42
                    break;
                }
lbl34:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 738555130;
                    if (true) ** GOTO lbl42
                    break;
                }
                block58: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -377304566;
                    if (true) ** GOTO lbl42
                    block59: while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1474747372;
lbl42:
                        // 12 sources

                        block60: while (true) {
                            switch (var3_3) {
                                case 1165834949: {
                                    var2_4 ^= var3_3 ^ -1390366509;
                                    ** GOTO lbl129
                                }
                                case 1040918140: {
                                    var2_4 ^= var3_3 ^ 782284073;
                                    var3_3 = (var1_2 | var4_1) ^ 1451697689;
                                    continue block60;
                                }
                                case 675759957: {
                                    var2_4 ^= var3_3 ^ -2102668605;
                                    ** GOTO lbl115
                                }
                                case -231550962: {
                                    var2_4 ^= var3_3 ^ 1282635608;
                                    var3_3 = (var1_2 | var4_1) ^ -1278933889;
                                    continue block60;
                                }
                                case -459114681: {
                                    ck.a = this;
                                    ** GOTO lbl113
                                }
                                case -1820686563: {
                                    var2_4 ^= var3_3 ^ -1491883452;
                                    var3_3 = (var1_2 | var4_1) ^ 1541244064;
                                    continue block60;
                                }
                                case -28547804: {
                                    var2_4 ^= var3_3 ^ 2058337794;
                                    ** break;
                                }
                                case 213579672: {
                                    this.a = new Long2ObjectOpenHashMap();
                                    var3_3 = (var1_2 | var4_1) ^ -1927763491;
                                    continue block60;
                                }
                                case -2042582157: {
                                    this.a = new LongOpenHashSet();
                                    ** GOTO lbl136
                                }
                                case -355057072: {
                                    this.a = new Long2IntOpenHashMap();
                                    ** GOTO lbl204
                                }
                                case 90631820: {
                                    var2_4 ^= var3_3 ^ 1517014074;
                                    ** GOTO lbl145
                                }
lbl81:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ 1437184439;
                                ** GOTO lbl150
                                case -1691450201: {
                                    this.b = new LongArrayList();
                                    ** GOTO lbl134
                                }
                                case 1220253614: {
                                    var2_4 ^= var3_3 ^ 1456717571;
                                    ** break;
                                }
                                case 845634106: {
                                    var2_4 ^= var3_3 ^ 1547504339;
                                    ** GOTO lbl158
                                }
                                case 1459436013: {
                                    var2_4 ^= var3_3 ^ -1661341762;
                                    ** continue;
                                }
                                case 1705316569: {
                                    var2_4 ^= var3_3 ^ 1991998313;
                                    var3_3 = (var1_2 | var4_1) ^ -2014321736;
                                    ** GOTO lbl150
                                }
                                case 336065847: {
                                    var2_4 ^= var3_3 ^ 2057386210;
                                    ** GOTO lbl156
                                }
lbl102:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ -1472158740;
                                continue block60;
                                case -1200193062: {
                                    this.d = this.addSetting(new gP(ck.f, 2.0f, 2.0f, 12.0f, 1.0f, ck.b).description(ck.e));
                                    ** GOTO lbl121
                                }
                                case -1182621290: {
                                    var2_4 ^= var3_3 ^ 1096170425;
                                    ** continue;
                                }
                                case 909568879: {
                                    this.b = this.addSetting(new ke(ck.h, true));
                                    continue block59;
                                }
lbl113:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ -1757891406;
                                continue block60;
lbl115:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ 306830894;
                                continue block60;
                                case 1883146427: {
                                    var2_4 ^= var3_3 ^ 526433853;
                                    var3_3 = (var1_2 | var4_1) ^ -1958871673;
                                    continue block60;
                                }
lbl121:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ 834776087;
                                continue block60;
                                case -1387047565: {
                                    this.a = new ArrayDeque<E>();
                                    ** GOTO lbl175
                                }
                                case -610483367: {
                                    this.a = new class_2338.class_2339();
                                    ** continue;
                                }
lbl129:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ -1991698296;
                                continue block60;
                                case -1388958263: {
                                    this.a.defaultReturnValue(ck.mN((var2_4 | var3_3 ^ -1320460561) ^ (var3_3 ^ -241417878), (var1_2 | var3_3 ^ -1320460561) ^ ((var2_4 | var3_3 ^ -1320460561) ^ (var3_3 ^ 1231459144))));
                                    ** GOTO lbl173
                                }
lbl134:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ -623189186;
                                continue block60;
lbl136:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ 1093899971;
                                continue block60;
                                case 390025227: {
                                    this.b = new LongOpenHashSet();
                                    var3_3 = (var1_2 | var4_1) ^ -1953703543;
                                    continue block60;
                                }
                                case 948965471: {
                                    this.a = new LongArrayList();
                                    ** GOTO lbl171
                                }
lbl145:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ 1394097029;
                                continue block60;
                                case -1499130282: {
                                    this.b = this.addSetting(new gP(ck.l, 64.0f, 16.0f, 192.0f, 16.0f, ck.b).description(ck.d));
                                    var3_3 = (var1_2 | var4_1) ^ 117265009;
                                }
lbl150:
                                // 4 sources

                                default: {
                                    continue block60;
                                }
                                case -392615925: {
                                    var2_4 ^= var3_3 ^ 1372689023;
                                    var3_3 = (var1_2 | var4_1) ^ 391624618;
                                    continue block60;
                                }
lbl156:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ 118059581;
                                continue block60;
lbl158:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ 304916116;
                                continue block60;
                                case -1593279199: {
                                    this.c = this.addSetting(new gP(ck.j, 8.0f, 3.0f, 64.0f, 1.0f, ck.b).description(ck.a));
                                    continue block58;
                                }
                                case -369568258: {
                                    this.c = this.addSetting(new ke(ck.m, false));
                                    var3_3 = (var1_2 | var4_1) ^ -1172759189;
                                    continue block60;
                                }
                                case -142636910: {
                                    var2_4 ^= var3_3 ^ 39619425;
                                    var3_3 = (var1_2 | var4_1) ^ 1692610750;
                                    continue block60;
                                }
lbl171:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ 1207991157;
                                continue block60;
lbl173:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ 2001090620;
                                continue block60;
lbl175:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ -235175664;
                                continue block60;
                                case -1900126224: {
                                    var2_4 ^= var3_3 ^ 1844376818;
                                    ** GOTO lbl183
                                }
                                case -328742814: {
                                    this.a = this.addSetting(new az(ck.g, ck.mN((var2_4 | var3_3 ^ -266683580) ^ (var3_3 ^ 1372562442), (var1_2 | var3_3 ^ -266683580) ^ ((var2_4 | var3_3 ^ -266683580) ^ (var3_3 ^ 746400889)))));
                                    ** continue;
                                }
lbl183:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ 511151814;
                                continue block60;
                                case 876744288: {
                                    this.c = this.addSetting(new az(ck.c, ck.mN((var2_4 | var3_3 ^ 675249478) ^ (var3_3 ^ -353868151), (var1_2 | var3_3 ^ 675249478) ^ ((var2_4 | var3_3 ^ 675249478) ^ (var3_3 ^ 1262019272)))));
                                    ** continue;
                                }
                                case 1317303031: {
                                    var2_4 ^= var3_3 ^ -2018856363;
                                    ** continue;
                                }
                                case 57273328: {
                                    this.b = this.addSetting(new az(ck.n, ck.mN((var2_4 | var3_3 ^ 521443542) ^ (var3_3 ^ 2126613331), (var1_2 | var3_3 ^ 521443542) ^ ((var2_4 | var3_3 ^ 521443542) ^ (var3_3 ^ -87155502)))));
                                    continue block55;
                                }
                                case 2145557517: {
                                    var2_4 ^= var3_3 ^ -662600636;
                                    var3_3 = (var1_2 | var4_1) ^ -1139402729;
                                    continue block60;
                                }
                                case 888351342: {
                                    var2_4 ^= var3_3 ^ -493665679;
                                    ** continue;
                                }
                                case -1473756083: {
                                    this.a = this.addSetting(new ke(ck.o, true));
                                    ** continue;
                                }
lbl204:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ -138124215;
                                continue block60;
                                case 258889737: {
                                    this.a = this.addSetting(new gP(ck.i, 70.0f, 0.0f, 255.0f, 1.0f, ck.b).description(ck.p));
                                    var3_3 = (var1_2 | var4_1) ^ -2123049573;
                                    continue block60;
                                }
                                case -935736357: {
                                    var2_4 ^= var3_3 ^ -2047867613;
                                    var3_3 = (var1_2 | var4_1) ^ 1203526361;
                                    continue block60;
                                }
lbl214:
                                // 1 sources

                                block61: while (true) {
                                    switch (var2_4) {
                                        case 518046796: {
                                            var2_4 ^= -1593353137;
                                            continue block51;
                                        }
                                        default: {
                                            var2_4 ^= 974397140;
                                            continue block61;
                                        }
                                        case 678489580: 
                                    }
                                    break;
                                }
                                var2_4 ^= -942340126;
                                continue block51;
                                case -121394882: 
                            }
                            break;
                        }
                        break;
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
    @Override
    public void onEnable() {
        int n2 = 447178881;
        int n3 = k & 0x1AA76881 ^ 0xB2B55EE7;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x8BFC4F21;
        n4 = (n3 | n2) ^ 0xC55E044B;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case 1545627748: {
                    return;
                }
                case -1420622462: {
                    this.mw();
                    n4 = (n3 | n2) ^ 0x22279F8F;
                    continue block7;
                }
                case 2146007724: {
                    n4 = (n3 | n2) ^ 0xEF3D90FA;
                    continue block7;
                }
                case -1735335576: {
                    n5 ^= n4 ^ 0xB61EA074;
                    n4 = (n3 | n2) ^ 0xE6971683;
                    continue block7;
                }
                case 1435168285: 
            }
            n5 ^= n4 ^ 0xAC062815;
            n4 = (n3 | n2) ^ 0x11E47B65;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        int n2 = -2038012401;
        int n3 = k & 0x8686660F ^ 0x7BB9F177;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x9AC14F29;
        n4 = (n3 | n2) ^ 0x884FBE62;
        boolean bl2 = true;
        block7: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0x6163E2D9;
            }
            block8: while (true) {
                switch (n4) {
                    case -1796194975: {
                        this.mw();
                        n4 = (n3 | n2) ^ 0x7D0CF27A;
                        continue block8;
                    }
                    case 1802712324: {
                        n5 ^= n4 ^ 0x25ECA752;
                        n4 = (n3 | n2) ^ 0x6B4FCA1E;
                        continue block8;
                    }
                    case -2102196987: {
                        n5 ^= n4 ^ 0xF52409D7;
                        continue block7;
                    }
                    case 2012236061: {
                        n4 = (n3 | n2) ^ 0x94CCC27B;
                    }
                    default: {
                        continue block8;
                    }
                    case -1629743706: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void mw() {
        block25: {
            block24: {
                block22: {
                    block23: {
                        break block23;
lbl1:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1134679414;
                            ** GOTO lbl23
lbl4:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -1703149772;
                                break block22;
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 1867875180;
                                ** GOTO lbl37
                                break;
                            }
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -2099678192;
                            ** GOTO lbl23
                            break;
                        }
lbl13:
                        // 1 sources

                        return;
                    }
                    var4_1 = -1089012181;
                    var1_2 = ck.k & -1089012181 ^ 1518596684;
                    var3_3 = 0;
                    var2_4 = (var1_2 | var4_1) ^ -138837108;
                    ** while (true)
lbl21:
                    // 1 sources

                    block18: while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1499493070;
lbl23:
                        // 10 sources

                        block19: while (true) {
                            switch (var3_3) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block19;
                                    }
                                    break;
                                }
                                case -2112011892: {
                                    ** continue;
                                }
                                case 1971336874: {
                                    ** continue;
                                }
                                case -1212722836: {
                                    ** continue;
                                }
                                case 1493726045: {
                                    var2_4 ^= var3_3 ^ 1412846351;
                                    break block18;
                                }
lbl37:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ 852325917;
                                ** continue;
                                case -1404553816: {
                                    var2_4 ^= var3_3 ^ -1774358593;
                                    break;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    var3_3 = (var1_2 | var4_1) ^ 788661416;
                    ** GOTO lbl23
lbl44:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 2106245091;
                        ** GOTO lbl23
                        break;
                    }
                    {
                        case 1235010696: {
                            this.a.clear();
                            break;
                        }
                        case 2102299263: {
                            ** continue;
                        }
                        case -795477305: {
                            this.a.clear();
                            ** continue;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1210101507;
                    ** GOTO lbl23
                    {
                        case 1085687691: {
                            this.a = null;
                            break block24;
                        }
                        case 1137300709: {
                            var2_4 ^= var3_3 ^ 1251305310;
                            break block25;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ -1978152763;
                    ** GOTO lbl23
                }
                var3_3 = (var1_2 | var4_1) ^ -1240778009;
                ** GOTO lbl23
            }
            var3_3 = (var1_2 | var4_1) ^ 1407175623;
            ** GOTO lbl23
        }
        var3_3 = (var1_2 | var4_1) ^ -1088308764;
        ** while (true)
        {
            ** case -849704846:
        }
lbl75:
        // 1 sources

        this.a.clear();
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
     * Enabled aggressive block sorting
     */
    private int mx() {
        int n2 = k & 0x99EF1FD3 ^ 0xD23A1C90;
        int n3 = 0;
        int n4 = (n2 | 0x99EF1FD3) ^ 0x6044B28;
        n3 = (n2 | 0x99EF1FD3) ^ 0x68FAA26F;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 678856803: {
                    n4 ^= n3 ^ 0xE64D6EFE;
                    n3 = (n2 | 0x99EF1FD3) ^ 0xEA559897;
                    continue block5;
                }
                case -1291469380: {
                    break;
                }
                case 833259332: {
                    return (int)Math.ceil((double)((Float)this.b.getValue()).floatValue() / 16.0);
                }
            }
            n3 = (n2 | 0x99EF1FD3) ^ 0xF38997B0;
        }
    }

    /*
     * Exception decompiling
     */
    private void my(class_1923 var1_1) {
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
    private void mz(class_1923 var1_1) {
        block29: {
            block26: {
                block27: {
                    block28: {
                        break block28;
lbl1:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1392255265;
                            break block26;
                            break;
                        }
                    }
                    var5_2 = -1654834574;
                    var2_3 = ck.k & -1654834574 ^ -1405447454;
                    var4_4 = 0;
                    var3_5 = (var2_3 | var5_2) ^ 964698284;
                    var4_4 = (var2_3 | var5_2) ^ -1031771875;
                    break block26;
lbl11:
                    // 1 sources

                    return;
lbl13:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ -576818133;
                        break block27;
                        break;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        this.mA(var1_1.method_8324());
                        ** GOTO lbl55
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        this.mA(class_1923.method_8331((int)(var1_1.field_9181 + 1), (int)var1_1.field_9180));
                        ** GOTO lbl68
                        break;
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 874484904;
                        break block26;
                        break;
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ -1363779687;
                break block26;
lbl30:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ 903143196;
                    ** GOTO lbl57
                    break;
                }
                this.mA(class_1923.method_8331((int)var1_1.field_9181, (int)(var1_1.field_9180 - 1)));
                var4_4 = (var2_3 | var5_2) ^ -1993318856;
            }
lbl36:
            // 3 sources

            block23: while (true) {
                switch (var4_4) lbl-1000:
                // 7 sources

                {
                    default: {
                        continue block23;
                    }
                    case 1403365396: {
                        ** continue;
                    }
                    case 293777854: {
                        ** continue;
                    }
                    case -757266302: {
                        ** continue;
                    }
                    case 331998571: {
                        ** continue;
                    }
                    case -1251211100: {
                        ** continue;
                    }
                    case 276587565: {
                        ** continue;
                    }
                    ** case 2147472367:
lbl53:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -1392702644;
                    ** GOTO lbl-1000
lbl55:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -2072518846;
                    ** GOTO lbl-1000
lbl57:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 1872933488;
                    ** GOTO lbl-1000
                    case -1990185382: {
                        this.mA(class_1923.method_8331((int)var1_1.field_9181, (int)(var1_1.field_9180 + 1)));
                        ** continue;
                    }
                    case 956851632: {
                        var3_5 ^= var4_4 ^ -1285426785;
                        break block23;
                    }
lbl65:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -743649562;
                        ** GOTO lbl-1000
                        break;
                    }
lbl68:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -2138234627;
                    ** GOTO lbl-1000
                    case 2129732021: {
                        var3_5 ^= var4_4 ^ 1813215306;
                        ** continue;
                    }
                    case 877651146: {
                        var3_5 ^= var4_4 ^ 31853447;
                        var4_4 = (var2_3 | var5_2) ^ -287698202;
                        ** GOTO lbl-1000
                    }
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ 135508566;
            ** GOTO lbl36
            {
                case 1859351572: {
                    this.mA(class_1923.method_8331((int)(var1_1.field_9181 - 1), (int)var1_1.field_9180));
                    break block29;
                }
                ** case 1039309327:
            }
lbl83:
            // 1 sources

            var3_5 ^= var4_4 ^ 1638135848;
            ** while (true)
        }
        var4_4 = (var2_3 | var5_2) ^ -1014064313;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void mA(long var1_1) {
        block16: {
            var6_2 = 1875852787;
            var3_3 = ck.k & 1875852787 ^ -415853770;
            var5_4 = 0;
            ** GOTO lbl23
            block9: while (this.a.add(var1_1)) {
                ** GOTO lbl19
lbl7:
                // 3 sources

                block10: while (true) {
                    switch (var5_4) lbl-1000:
                    // 5 sources

                    {
                        while (true) {
                            default: {
                                continue block10;
                            }
                            break;
                        }
                        case -1406682310: {
                            continue block9;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ 1138230477;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 1348393726: {
                            return;
                        }
lbl19:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ -1024071507;
                        ** GOTO lbl-1000
                        case -1241373012: {
                            ** break;
                        }
lbl23:
                        // 1 sources

                        var4_5 = (var3_3 | var6_2) ^ -1934037028;
                        var5_4 = (var3_3 | var6_2) ^ 1509792091;
                        ** GOTO lbl-1000
                        case -1376838972: {
                            var4_5 ^= var5_4 ^ 1127075083;
                            ** continue;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ -1079941879;
                            ** continue;
                            break;
                        }
                    }
                    break;
                }
            }
            break block16;
lbl33:
            // 1 sources

            var5_4 = (var3_3 | var6_2) ^ 1108387123;
            ** GOTO lbl7
            {
                case -1812405614: {
                    var4_5 ^= var5_4 ^ -1115053059;
                    ** continue;
                }
            }
        }
lbl39:
        // 2 sources

        while (true) {
            var5_4 = (var3_3 | var6_2) ^ 2080857445;
            ** GOTO lbl7
            break;
        }
        {
            case -167806957: {
                this.a.addLast(var1_1);
                ** continue;
            }
        }
lbl45:
        // 1 sources

        while (true) {
            var5_4 = (var3_3 | var6_2) ^ 436258788;
            ** continue;
            break;
        }
        {
            ** case 755652442:
        }
lbl49:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void mB(long var1_1) {
        block17: {
            var6_2 = 1637843411;
            var3_3 = ck.k & 1637843411 ^ 1177582043;
            var5_4 = 0;
            ** GOTO lbl42
lbl5:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -688521988;
                ** GOTO lbl20
                break;
            }
lbl8:
            // 2 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -816519567;
                if (true) ** GOTO lbl20
                break;
            }
            block11: while (true) {
                var5_4 = (var3_3 | var6_2) ^ 1408442506;
                if (true) ** GOTO lbl20
lbl14:
                // 1 sources

                while (true) {
                    if (!this.a.add(var1_1)) ** GOTO lbl8
                    ** continue;
                    break;
                }
                block13: while (true) {
                    var4_5 ^= var5_4 ^ 1988515561;
                    var5_4 = (var3_3 | var6_2) ^ -724782038;
lbl20:
                    // 6 sources

                    block14: while (true) {
                        switch (var5_4) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block14;
                                }
                                break;
                            }
                            case 98038091: {
                                ** continue;
                            }
                            case -1320549081: {
                                break block17;
                            }
                            case -1460985942: {
                                continue block13;
                            }
                            case 1129850630: {
                                this.a.addFirst(var1_1);
                                ** continue;
                            }
lbl34:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ -217063589;
                                ** continue;
                                break;
                            }
                            case -1800395136: {
                                continue block11;
                            }
                            case 877451601: {
                                var4_5 ^= var5_4 ^ 171745930;
                                break block11;
                            }
lbl42:
                            // 1 sources

                            var4_5 = (var3_3 | var6_2) ^ 288744746;
                            ** continue;
                            case -1284289039: {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            var5_4 = (var3_3 | var6_2) ^ 1650985104;
            ** GOTO lbl20
        }
        var5_4 = (var3_3 | var6_2) ^ 619175645;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void mC(class_638 var1_1, class_1923 var2_2) {
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
    private void mD(class_1923 var1_1) {
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
    private void mE(class_2818 var1_1, class_638 var2_2) {
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
    static {
        block44: {
            break block44;
lbl1:
            // 1 sources

            while (true) {
                var6_7 ^= -1561584957;
                var4_8 = 0;
                ** GOTO lbl147
                break;
            }
        }
        var9 = 379274342;
        var8_1 = 925444320;
        ck.k = mK.a(MethodHandles.lookup().lookupClass(), -1121957520);
        var7_2 = 0;
        var6_7 = -1080210867;
        var7_2 = var9 ^ -1291201944;
        block32: while (true) {
            block45: {
                block46: {
                    switch (var7_2) {
                        default: {
                            continue block32;
                        }
                        case 1693429446: {
                            var6_7 ^= var7_2 ^ 961910573;
                            break block45;
                        }
                        case -1517119986: {
                            break;
                        }
                        case -1382974086: {
                            var2_5 = (var6_7 | var7_2 ^ -1156957924) ^ (var7_2 ^ -129039246) ^ ck.k;
                            ** break;
lbl24:
                            // 1 sources

                            var6_7 ^= 274550955;
                            var0_3 = "\u0017\u00bet\u00dd\u0092\u00e9\u00ce&SGq=\u00b5S\u008d\u00eb\u00bb\u0000\u00ddIgwGL\u00bd\u00bf\u0097N\u0001I\u0085/9]}QJ\u00fd\u0011\u00dc\u00b9\u00bey\u00e3\u0099\u00a8\u00c4\u00b7~\u00f0 `\u0083#\rYHL\u00f0\u00e8m)\u008bC\u0099OD\u008d\u00a8\u009cw\u0096\u00f81?\u00ca\u00e7\u00b3<\u00fe\u00cf\u0006e\u0097\u00ee\u00f0\u00a8Gt\u0090\u001d^\u009a\u00d7\u009f\u00b8\u00b1\u0007\u0089W\u00a3\u00ffPV\u0089\u00b9\u00a4\t=\u009f\u001c\u0012\u00cd%\u00d6$\u008a\u0083\u00cd{D\u00e8\u000f\r]4{\u00dc\u00d3S\u0011\u00c5\u00af\u009f\u0002\u00c9\u0081\u00fc\u009cf!\u001d\u0014q\u00cd\u000f\u00be\u00c1\u00e3b3\u0011\u0095\u00c1I--\u0093\u00ea\u00ae\u000e\u00ae\u00d2Hz\u001a&\u00a9\u007f\u00ab=D\u000e\u001c\u0097xn\u0092r$\u0084-ika\u00c7\u00b4\u00d4\u00ee\u0019f}\u009e\u00df\u00a8\u00d6f\u00e9\u009a{n0m\u0094&\u00c6J$i'D\u00e7\u0010\u00e8\u00b1!\u00a2K8+\u0017\u00d5\u00c4\u0003\u00e8\u0087\u00d5\b\u00c2\u0015\u00fa1\u008bw\u00cb\u00bd\u00ca\u0016\u00fam\u009c\u0015\u00e2\u00f9Cjo]\u0099Gl\u007fC\u0080\u00e8\u00ee\u00fa!\u001dS\u00d9\u0096\u0091\u00f0".getBytes("ISO-8859-1");
                            var6_7 ^= -236622677;
                            break block46;
                        }
                    }
                    var7_2 = var9 ^ 1920264864;
                    continue;
                }
                var1_4 = var0_3.length / 4;
                var7_2 = var9 ^ -792518206;
                if (true) ** GOTO lbl54
            }
            var7_2 = var9 ^ -1156957924;
        }
        block33: while (true) {
            switch (var7_2) {
                case 1092467482: {
                    var3_6 = 0;
                    ** continue;
                }
                case 667172412: {
                    ck.e = new int[var1_4];
                    ** break;
                }
                case -731020008: {
                    var6_7 ^= var7_2 ^ -1189053996;
                    var7_2 = var9 ^ 1468465020;
                    break;
                }
lbl49:
                // 1 sources

                var7_2 = var9 ^ -1024016002;
                continue block33;
                case -967285340: {
                    var6_7 ^= var7_2 ^ 1529033551;
                    var7_2 = var9 ^ 828340826;
                }
            }
lbl54:
            // 4 sources

        }
lbl55:
        // 1 sources

        while (true) {
            var7_2 = var9 ^ 1316414583;
            if (true) ** GOTO lbl75
            break;
        }
        block35: while (true) {
            var7_2 = var9 ^ -406488234;
            ** GOTO lbl75
lbl61:
            // 1 sources

            while (true) {
                var7_2 = var9 ^ -30824397;
                ** GOTO lbl75
                break;
            }
lbl64:
            // 1 sources

            while (true) {
                var7_2 = var9 ^ -1451605445;
                if (true) ** GOTO lbl75
                break;
            }
            block38: while (true) {
                var7_2 = var9 ^ 1160062981;
                if (true) ** GOTO lbl75
                block39: while (true) {
                    var7_2 = var9 ^ -1730725018;
                    if (true) ** GOTO lbl75
                    block40: while (true) {
                        var7_2 = var9 ^ -1594811095;
lbl75:
                        // 7 sources

                        block41: while (true) {
                            block47: {
                                switch (var7_2) {
                                    case 565341318: {
                                        ck.j = ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572030), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ 534116544)));
                                        ck.d = 0.8f;
                                        ck.i = ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572031), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ 442819362)));
                                        ck.c = 1.25f;
                                        ck.h = ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572032), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ 1809008904)));
                                        ck.b = 12.0f;
                                        ck.g = ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572025), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -1956795217)));
                                        ck.a = 2.0f;
                                        ck.e = ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572026), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -505235692)));
                                        ck.d = ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572027), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ 67660455)));
                                        ck.b = ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572028), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ 198621194)));
                                        ck.a = ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572005), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -82810650)));
                                        ck.k = gj.decode("nc1cjohKyyo=", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572006), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ 196347387))));
                                        ck.s = gj.decode("7NEu7wTNLwDXdyI9nL+9puPJGUMjFPEQBSMa+5DGM/tElHP7K/U5/3y/yA==", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572007), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -1383909238))));
                                        ck.h = gj.decode("gsxMlKEwBq4t", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572008), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -1240572041))));
                                        ck.o = gj.decode("gga796simzLB", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572001), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -444449746))));
                                        ck.f = gj.decode("lqVqTafYpRFR", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572002), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -211007600))));
                                        ck.b = gj.decode("VtASmQ==", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572003), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -1686984446))));
                                        ck.e = gj.decode("V8VbrzZk1WS80bB3Fb956sXYmoK0xN23+OsKsBf+kq2hLuNzFpaMwV73Wls=", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572004), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ 1157205507))));
                                        ck.j = gj.decode("PN9nXBp7+z4pZA==", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572013), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -1475018513))));
                                        ck.a = gj.decode("R9EbiH6S9ftZyOg57uUpIX9bYszkthkMYKdD5WOrFbZsef412ImcYHgYD7KhPRmBkhEW81eOCCqpMA==", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572014), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ 1341268437))));
                                        ck.l = gj.decode("O3p7WwE=", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572015), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -1394922860))));
                                        ck.d = gj.decode("x4cXRem1PSrRAsnbG/oGAq2AhCiLjT5q", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572016), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -707287707))));
                                        ck.i = gj.decode("yxrhF+DuSVAW9Q==", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572009), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -1213119188))));
                                        ck.p = gj.decode("/BCBjWlQR97PsBTMvQ1LBxocLF6sXQ/r", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572010), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ 1638599945))));
                                        ck.m = gj.decode("raRYOncrHA==", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572011), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -2131796539))));
                                        ck.g = gj.decode("joIh9jTEjjqW", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174572012), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ 1173947949))));
                                        ck.c = gj.decode("5/52dwdrD/7X", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174571925), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -1137106914))));
                                        ck.n = gj.decode("+14qiMqrMqPJ+w==", ck.mN((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ -174571926), var7_2 ^ var8_1 ^ ((var6_7 | var7_2 ^ var8_1) ^ (var7_2 ^ 1340754835))));
                                        ** GOTO lbl151
                                    }
                                    case -390927275: {
                                        var6_7 ^= var7_2 ^ -1675928848;
                                        var7_2 = var9 ^ var8_1;
                                        continue block41;
                                    }
                                    case -1075771811: {
                                        var6_7 ^= var7_2 ^ -659354819;
                                        ** GOTO lbl153
                                    }
                                    case 1291381406: {
                                        ck.c = new int[]{1, 1, -1, -1};
                                        continue block40;
                                    }
                                    case 929872525: {
                                        ck.b = new int[]{0, 0, 1, -1};
                                        ** GOTO lbl162
                                    }
                                    case 79754385: {
                                        var3_6 += 4;
                                        if (++var4_8 >= var1_4) {
                                            ** continue;
                                        }
                                        ** GOTO lbl147
                                    }
                                    case -918854881: {
                                        ck.e[var4_8] = var5_9 ^= var2_5;
                                        ** continue;
                                    }
                                    case 1404988515: {
                                        var6_7 ^= var7_2 ^ -84274692;
                                        ** GOTO lbl149
                                    }
                                    case -1974439624: {
                                        var6_7 ^= var7_2 ^ 1644963026;
                                        continue block39;
                                    }
                                    case -948656169: {
                                        ck.d = new int[]{1, -1, 1, -1};
                                        return;
                                    }
                                    case -1891494307: {
                                        ClientChunkEvents.CHUNK_UNLOAD.register((Object)(ClientChunkEvents.Unload)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_638;Lnet/minecraft/class_2818;)V, mS(net.minecraft.class_638 net.minecraft.class_2818 ), (Lnet/minecraft/class_638;Lnet/minecraft/class_2818;)V)());
                                        ** GOTO lbl169
                                    }
                                    case -1907589376: {
                                        ck.a = new int[]{1, -1, 0, 0};
                                        continue block38;
                                    }
                                    case 1941923465: {
                                        var6_7 ^= var7_2 ^ -238817262;
                                        ** GOTO lbl174
                                    }
lbl147:
                                    // 2 sources

                                    var5_9 = (var0_3[var3_6] & (((var6_7 ^= -1098672086) | var9) ^ -2136175)) << ((var6_7 | var9) ^ -2136202) | (var0_3[var3_6 + 1] & ((var6_7 | var9) ^ -2136175)) << ((var6_7 | var9) ^ -2136194) | (var0_3[var3_6 + 2] & ((var6_7 | var9) ^ -2136175)) << ((var6_7 | var9) ^ -2136218) | var0_3[var3_6 + 3] & ((var6_7 | var9) ^ -2136175);
                                    ** continue;
lbl149:
                                    // 1 sources

                                    var7_2 = var9 ^ 569900779;
                                    ** GOTO lbl167
lbl151:
                                    // 1 sources

                                    var7_2 = var9 ^ -197968832;
                                    ** GOTO lbl167
lbl153:
                                    // 1 sources

                                    var7_2 = var9 ^ 307998967;
                                    ** GOTO lbl167
                                    case -492275674: {
                                        var6_7 ^= var7_2 ^ 218037388;
                                        continue block35;
                                    }
                                    case -245481680: {
                                        ClientChunkEvents.CHUNK_LOAD.register((Object)(ClientChunkEvents.Load)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_638;Lnet/minecraft/class_2818;)V, mT(net.minecraft.class_638 net.minecraft.class_2818 ), (Lnet/minecraft/class_638;Lnet/minecraft/class_2818;)V)());
                                        var7_2 = var9 ^ 1696867055;
                                        ** GOTO lbl167
                                    }
lbl162:
                                    // 1 sources

                                    var7_2 = var9 ^ 2134831098;
                                    ** GOTO lbl167
                                    case -1234544305: {
                                        var6_7 ^= var7_2 ^ -456917842;
                                        var7_2 = var9 ^ -772807759;
                                    }
lbl167:
                                    // 8 sources

                                    default: {
                                        continue block41;
                                    }
lbl169:
                                    // 1 sources

                                    var7_2 = var9 ^ -1664404130;
                                    continue block41;
                                    case 1772465052: {
                                        var6_7 ^= var7_2 ^ -915314443;
                                        break block47;
                                    }
lbl174:
                                    // 1 sources

                                    var7_2 = var9 ^ -1713810885;
                                    continue block41;
                                    case 1491968017: 
                                }
                                var6_7 ^= var7_2 ^ -2126760613;
                                var7_2 = var9 ^ -543152263;
                                ** GOTO lbl167
                            }
                            var7_2 = var9 ^ 1516482296;
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private boolean mF(class_638 var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block36: {
            block38: {
                block35: {
                    block34: {
                        block37: {
                            block33: {
                                block32: {
                                    var9_6 = -245617237;
                                    var6_7 = ck.k & -245617237 ^ 256907859;
                                    var8_8 = 0;
                                    break block38;
lbl5:
                                    // 1 sources

                                    return v0;
lbl7:
                                    // 1 sources

                                    while (true) {
                                        v0 = false;
                                        ** GOTO lbl64
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (!this.mG(var1_1, var2_2 + 1, var3_3, var4_4, var5_5)) {
                                        break block32;
lbl12:
                                        // 1 sources

                                        while (true) {
                                            var8_8 = (var6_7 | var9_6) ^ 1067959155;
                                            ** GOTO lbl40
                                            break;
                                        }
lbl15:
                                        // 1 sources

                                        while (!this.mG(var1_1, var2_2, var3_3 + 1, var4_4, var5_5)) {
                                            block39: {
                                                break block39;
lbl17:
                                                // 1 sources

                                                while (true) {
                                                    var7_9 ^= 237091501;
                                                    break block33;
                                                    break;
                                                }
                                            }
                                            var8_8 = (var6_7 | var9_6) ^ -1661591098;
                                            ** GOTO lbl40
lbl23:
                                            // 1 sources

                                            while (true) {
                                                var8_8 = (var6_7 | var9_6) ^ -2096095276;
                                                ** GOTO lbl40
                                                break;
                                            }
                                        }
                                        break block34;
                                    }
                                    break block34;
lbl28:
                                    // 1 sources

                                    while (true) {
                                        var7_9 ^= var8_8 ^ 832252580;
                                        ** GOTO lbl75
                                        break;
                                    }
                                }
                                var8_8 = (var6_7 | var9_6) ^ 1326852386;
                                ** GOTO lbl40
lbl34:
                                // 1 sources

                                block23: while (true) {
                                    if (!this.mG(var1_1, var2_2, var3_3 - 1, var4_4, var5_5)) break block35;
                                    break block34;
lbl37:
                                    // 1 sources

                                    while (true) {
                                        var7_9 ^= var8_8 ^ -929436640;
                                        ** GOTO lbl73
                                        break;
                                    }
lbl40:
                                    // 9 sources

                                    block25: while (true) {
                                        switch (var8_8) lbl-1000:
                                        // 5 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block25;
                                                }
                                                break;
                                            }
                                            case 1666464813: {
                                                break block36;
                                            }
                                            case 307071497: {
                                                ** continue;
                                            }
                                            case -426425362: {
                                                ** GOTO lbl10
                                            }
                                            case 1930505110: {
                                                ** continue;
                                            }
                                            case -2141620308: {
                                                break block37;
                                            }
                                            case -1928272840: {
                                                ** continue;
                                            }
                                            case 1672093245: {
                                                ** continue;
                                            }
                                            case 2085363759: {
                                                ** continue;
                                            }
                                            case 44301573: {
                                                var7_9 ^= var8_8 ^ 136559189;
                                                break block23;
                                            }
lbl64:
                                            // 2 sources

                                            while (true) {
                                                var7_9 ^= 1954295682;
                                                ** continue;
                                                break;
                                            }
                                            case -1337321767: {
                                                var7_9 ^= var8_8 ^ -1100239756;
                                                ** continue;
                                            }
lbl70:
                                            // 1 sources

                                            while (true) {
                                                var8_8 = (var6_7 | var9_6) ^ 1166071623;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl73:
                                            // 1 sources

                                            var8_8 = (var6_7 | var9_6) ^ -1677196330;
                                            ** GOTO lbl-1000
lbl75:
                                            // 1 sources

                                            var8_8 = (var6_7 | var9_6) ^ 2131052631;
                                            ** GOTO lbl-1000
lbl77:
                                            // 1 sources

                                            while (true) {
                                                var8_8 = (var6_7 | var9_6) ^ 1917639619;
                                                ** continue;
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                }
                                var8_8 = (var6_7 | var9_6) ^ -317606414;
                                ** GOTO lbl40
                            }
                            if (!this.mG(var1_1, var2_2 - 1, var3_3, var4_4, var5_5)) {
                                ** continue;
                            }
                            break block34;
                        }
                        var7_9 ^= -1131688292;
                        ** GOTO lbl15
                    }
                    var8_8 = (var6_7 | var9_6) ^ -1253408176;
                    ** GOTO lbl40
                    {
                        case 1243004331: {
                            var7_9 ^= var8_8 ^ 1083636475;
                            ** continue;
                        }
                    }
lbl95:
                    // 1 sources

                    while (true) {
                        var8_8 = (var6_7 | var9_6) ^ 432634901;
                        ** GOTO lbl40
                        break;
                    }
                    {
                        case -1057227640: {
                            var7_9 ^= var8_8 ^ 447629869;
                            ** continue;
                        }
                    }
                }
                var8_8 = (var6_7 | var9_6) ^ -33570050;
                ** GOTO lbl40
                {
                    ** case -1159927620:
                }
lbl105:
                // 1 sources

                v0 = true;
                ** while (true)
            }
            var7_9 = (var6_7 | var9_6) ^ 682975982;
            var8_8 = (var6_7 | var9_6) ^ -1941105555;
            ** while (true)
        }
        var7_9 ^= -1422659043;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean mG(class_638 var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block19: {
            break block19;
lbl1:
            // 1 sources

            block15: while (true) {
                switch (var9_8) {
                    case -38580479: {
                        v0 = false;
                        ** GOTO lbl25
                    }
                    case -1847137500: {
                        if (var6_10 == ck.mN((var8_9 | var9_8 ^ -1059255974) ^ (var9_8 ^ -1928588769), (var7_7 | var9_8 ^ -1059255974) ^ ((var8_9 | var9_8 ^ -1059255974) ^ (var9_8 ^ -1286156617)))) ** GOTO lbl23
                        ** GOTO lbl27
                    }
                    case -896659942: {
                        ** GOTO lbl30
                    }
                    case 1262171171: {
                        if (var6_10 >= var4_4 + var5_5) {
                            var9_8 = (var7_7 | var10_6) ^ 1125320236;
                            continue block15;
                        }
                        ** GOTO lbl23
                    }
                    case 24465730: {
                        v0 = true;
                        ** GOTO lbl25
                    }
                    case 1019059109: {
                        var8_9 ^= var9_8 ^ 1859847383;
                        var9_8 = (var7_7 | var10_6) ^ -1000793894;
                        continue block15;
                    }
lbl23:
                    // 2 sources

                    var9_8 = (var7_7 | var10_6) ^ 1581454184;
                    ** GOTO lbl28
lbl25:
                    // 2 sources

                    var8_9 ^= 1300302125;
                    return v0;
lbl27:
                    // 1 sources

                    var9_8 = (var7_7 | var10_6) ^ -1624113692;
lbl28:
                    // 5 sources

                    default: {
                        continue block15;
                    }
lbl30:
                    // 1 sources

                    var9_8 = (var7_7 | var10_6) ^ 512018397;
                    continue block15;
                    case 201121942: {
                        var8_9 ^= var9_8 ^ -120201407;
                        var9_8 = (var7_7 | var10_6) ^ -1475560193;
                        ** GOTO lbl28
                    }
                    case 380433874: 
                }
                var8_9 ^= var9_8 ^ -444216827;
                var9_8 = (var7_7 | var10_6) ^ 1422566076;
                ** GOTO lbl28
                break;
            }
        }
        var10_6 = 1362879102;
        var7_7 = ck.k & 1362879102 ^ 346927604;
        var9_8 = 0;
        var8_9 = (var7_7 | var10_6) ^ -928671229;
        var9_8 = (var7_7 | var10_6) ^ -160872383;
        block17: while (true) {
            switch (var9_8) {
                default: {
                    continue block17;
                }
                case -814266720: {
                    var8_9 ^= var9_8 ^ -1088113127;
                    var9_8 = (var7_7 | var10_6) ^ -408081754;
                    continue block17;
                }
                case -1546208321: {
                    var9_8 = (var7_7 | var10_6) ^ -1698122402;
                    continue block17;
                }
                case -1307387560: 
            }
            break;
        }
        var6_10 = this.mJ(var1_1, var2_2, var3_3);
        var9_8 = (var7_7 | var10_6) ^ 1761765467;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private O mH(class_638 var1_1, int var2_2, int var3_3, int var4_4) {
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
    private boolean mI(class_638 var1_1, int var2_2, int var3_3) {
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
    private int mJ(class_638 var1_1, int var2_2, int var3_3) {
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
    private static long mK(int n2, int n3) {
        int n4 = k & 0x7872DDCF ^ 0x40C740BC;
        int n5 = 0;
        int n6 = (n4 | 0x7872DDCF) ^ 0xAB8F920F;
        n5 = (n4 | 0x7872DDCF) ^ 0xC1E032D5;
        block5: while (true) {
            switch (n5) {
                case 0xA3C33AA: {
                    n6 ^= n5 ^ 0x6D5260B2;
                    break;
                }
                case 1096159824: {
                    return (long)n2 << ck.mN((n6 | n5 ^ 0x3924CF9F) ^ (n5 ^ 0x5EF5D0EB), (n4 | n5 ^ 0x3924CF9F) ^ ((n6 | n5 ^ 0x3924CF9F) ^ (n5 ^ 0xE426A62C))) | (long)n3 & (-5470152913363279081L << (n5 ^ 0x41561270) >>> (n5 ^ 0x41561270) ^ (long)n6 & 0xFFFFFFFFL | (-5470152913363279081L >>> (n5 ^ 0x41561270) ^ (long)n6 & 0xFFFFFFFFL) << (n5 ^ 0x41561270));
                }
                case -1189613782: {
                    n5 = (n4 | 0x7872DDCF) ^ 0x72CBEE55;
                }
                default: {
                    continue block5;
                }
            }
            n5 = (n4 | 0x7872DDCF) ^ 0x39A1CFAF;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int mL(long l2) {
        int n2 = k & 0x9204D312 ^ 0xF3E90EB6;
        int n3 = 0;
        int n4 = (n2 | 0x9204D312) ^ 0x269BCB8A;
        n3 = (n2 | 0x9204D312) ^ 0xBD6699B;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 406076399: {
                    n4 ^= n3 ^ 0x475A33DE;
                    n3 = (n2 | 0x9204D312) ^ 0x7EC87F87;
                    continue block5;
                }
                case -1926913999: {
                    return (int)(l2 >> ck.mN((n4 | n3 ^ 0x1F217323) ^ (n3 ^ 0xF4EC607B), (n2 | n3 ^ 0x1F217323) ^ ((n4 | n3 ^ 0x1F217323) ^ (n3 ^ 0xDCF96024))));
                }
                case -130304467: 
            }
            n3 = (n2 | 0x9204D312) ^ 0xEBD9E459;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int mM(long l2) {
        int n2 = k & 0xF5C2B845 ^ 0xD9070B2B;
        int n3 = 0;
        int n4 = (n2 | 0xF5C2B845) ^ 0x8AD7F56C;
        n3 = (n2 | 0xF5C2B845) ^ 0x3EC15E22;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1022958259: {
                    n3 = (n2 | 0xF5C2B845) ^ 0x3A9A2DD1;
                    continue block5;
                }
                case -950167874: {
                    n4 ^= n3 ^ 0x13717937;
                    n3 = (n2 | 0xF5C2B845) ^ 0x3C9916C;
                    continue block5;
                }
                case -32626173: 
            }
            break;
        }
        return (int)l2;
    }

    private static int mN(int n2, int n3) {
        int n4 = -1280754009;
        int n5 = 861265699;
        int n6 = e[n2 ^ ((n5 | n4) ^ 0x5028E0ED)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xB3FD8F58;
        n6 -= (n5 | n4) ^ 0xB3FD34B0;
        n6 += (n5 | n4) ^ 0xB3FD41D5;
        n6 ^= (n5 | n4) ^ 0xB3FD375A;
        n6 += (n5 | n4) ^ 0xB3FDC5E5;
        n6 -= (n5 | n4) ^ 0xB3FD3374;
        n6 -= (n5 | n4) ^ 0xB3FD6BA2;
        n6 -= (n5 | n4) ^ 0xB3FDDA0F;
        n6 -= (n5 | n4) ^ 0xB3FD6C58;
        return n6 -= (n5 | n4) ^ 0xB3FDB64D;
    }

    /*
     * Exception decompiling
     */
    public void render(WorldRenderContext var1_1, class_310 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [194[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private float mO(O var1_1, class_243 var2_2, float var3_3, boolean var4_4, boolean var5_5) {
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
    private int mP(O var1_1, int var2_2) {
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
     * Enabled aggressive block sorting
     */
    private static void mQ(class_4588 class_45882, Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6, int n2, int n3, int n4, int n5) {
        int n6 = -1870531061;
        int n7 = k & 0x9081F60B ^ 0x3A00D573;
        int n8 = 0;
        int n9 = (n7 | n6) ^ 0xF64EE241;
        n8 = (n7 | n6) ^ 0x62DE54B5;
        block21: while (true) {
            switch (n8) {
                default: {
                    continue block21;
                }
                case 275651954: {
                    n9 ^= n8 ^ 0xBEEDF2D6;
                    n8 = (n7 | n6) ^ 0xFB141298;
                    continue block21;
                }
                case -187335521: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f2, f6, f5).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0x6F2B9B09;
                    continue block21;
                }
                case 1100342755: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f4, f6, f5).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0xE12325A5;
                    continue block21;
                }
                case 2040530670: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f4, f6, f5).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0x70C09AA5;
                    continue block21;
                }
                case -901681698: {
                    n9 ^= n8 ^ 0x1A307125;
                    n8 = (n7 | n6) ^ 0x6BEB2AB4;
                    continue block21;
                }
                case 1520413635: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f4, f6, f3).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0xAAEFEA09;
                    continue block21;
                }
                case -654876907: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f2, f6, f5).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0xB583B252;
                    continue block21;
                }
                case 1768775476: {
                    n9 ^= n8 ^ 0xEAD51B0;
                    n8 = (n7 | n6) ^ 0x4E548BE4;
                    continue block21;
                }
                case 996817915: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f2, f6, f3).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0x73737F83;
                    continue block21;
                }
                case -781525553: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f4, f6, f3).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0xBEAF9223;
                    continue block21;
                }
                case 251807017: {
                    n9 ^= n8 ^ 0x61FBA59F;
                    n8 = (n7 | n6) ^ 0xDCF52889;
                    continue block21;
                }
                case 1537397470: {
                    n9 ^= n8 ^ 0x8458DB2F;
                    n8 = (n7 | n6) ^ 0x6276A86E;
                    continue block21;
                }
                case -846875096: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f2, f6, f3).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0xD3ECA84F;
                    continue block21;
                }
                case -710251406: {
                    n9 ^= n8 ^ 0xA80AF7FD;
                    n8 = (n7 | n6) ^ 0xC321F195;
                    continue block21;
                }
                case -664820786: {
                    n8 = (n7 | n6) ^ 0x24CC7E66;
                    continue block21;
                }
                case -906852104: {
                    n9 ^= n8 ^ 0xF37D7B5A;
                    n8 = (n7 | n6) ^ 0xE01E5CB8;
                    continue block21;
                }
                case 70149464: {
                    n9 ^= n8 ^ 0x87098B17;
                    n8 = (n7 | n6) ^ 0x81EBCC80;
                    continue block21;
                }
                case -1639085795: {
                    n9 ^= n8 ^ 0x9B6FE6F0;
                    n8 = (n7 | n6) ^ 0x77044153;
                    continue block21;
                }
                case 1718935538: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void mR(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11) {
        block47: {
            block45: {
                block46: {
                    block48: {
                        break block48;
lbl1:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ 687823121;
                            break block45;
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
                            var14_14 = (var12_13 | var15_12) ^ 1027979877;
                            ** GOTO lbl87
                            break;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ -1692649537;
                            ** GOTO lbl87
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ 1418778026;
                            ** GOTO lbl132
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ 2088868260;
                            break block46;
                            break;
                        }
                    }
                    var15_12 = -54274964;
                    var12_13 = ck.k & -54274964 ^ -1140573953;
                    var14_14 = 0;
                    var13_15 = (var12_13 | var15_12) ^ -117946779;
                    ** while (true)
lbl24:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ -1039618988;
                        ** GOTO lbl87
lbl27:
                        // 1 sources

                        while (true) {
                            var0.method_22918((Matrix4fc)var1_1, var2_2, var7_7, var3_3).method_1336(var8_8, var9_9, var10_10, 0);
                            ** continue;
                            break;
                        }
lbl31:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ -121851931;
                            ** GOTO lbl87
lbl34:
                            // 1 sources

                            while (true) {
                                var13_15 ^= var14_14 ^ 180735871;
                                break block47;
                                break;
                            }
lbl37:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                            break;
                        }
                        break;
                    }
                }
                var14_14 = (var12_13 | var15_12) ^ 1343973203;
                ** GOTO lbl87
lbl42:
                // 1 sources

                while (true) {
                    var14_14 = (var12_13 | var15_12) ^ -558880191;
                    ** GOTO lbl87
lbl45:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ 1789654496;
                        ** GOTO lbl87
                        break;
                    }
lbl48:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ 1971590979;
                        ** GOTO lbl87
                        break;
                    }
                    break;
                }
                var0.method_22918((Matrix4fc)var1_1, var4_4, var6_6, var5_5).method_1336(var8_8, var9_9, var10_10, var11_11);
                var14_14 = (var12_13 | var15_12) ^ -1012268724;
                ** GOTO lbl87
lbl55:
                // 1 sources

                return;
lbl57:
                // 1 sources

                while (true) {
                    var13_15 ^= var14_14 ^ 1032506509;
                    ** continue;
                    break;
                }
                var0.method_22918((Matrix4fc)var1_1, var4_4, var7_7, var5_5).method_1336(var8_8, var9_9, var10_10, 0);
                var14_14 = (var12_13 | var15_12) ^ 1530692234;
                ** GOTO lbl87
lbl64:
                // 1 sources

                while (true) {
                    var0.method_22918((Matrix4fc)var1_1, var2_2, var6_6, var3_3).method_1336(var8_8, var9_9, var10_10, var11_11);
                    ** GOTO lbl130
                    break;
                }
            }
            var14_14 = (var12_13 | var15_12) ^ 601585939;
            ** GOTO lbl87
lbl71:
            // 1 sources

            while (true) {
                var0.method_22918((Matrix4fc)var1_1, var2_2, var7_7, var3_3).method_1336(var8_8, var9_9, var10_10, 0);
                ** GOTO lbl125
                break;
            }
lbl75:
            // 1 sources

            while (true) {
                var14_14 = (var12_13 | var15_12) ^ -951361567;
                ** GOTO lbl87
                break;
            }
        }
        var14_14 = (var12_13 | var15_12) ^ -1824129999;
        ** GOTO lbl87
lbl81:
        // 1 sources

        while (true) {
            var14_14 = (var12_13 | var15_12) ^ -54628811;
            if (true) ** GOTO lbl87
            break;
        }
        block41: while (true) {
            var13_15 ^= var14_14 ^ -50088401;
            var14_14 = (var12_13 | var15_12) ^ -1125374559;
lbl87:
            // 15 sources

            block42: while (true) {
                switch (var14_14) lbl-1000:
                // 5 sources

                {
                    while (true) {
                        default: {
                            continue block42;
                        }
                        break;
                    }
                    case 7967434: {
                        ** continue;
                    }
                    case -1992037444: {
                        ** continue;
                    }
                    case -1476690315: {
                        ** continue;
                    }
                    case 999072542: {
                        ** continue;
                    }
                    case -1358629460: {
                        ** continue;
                    }
                    case -560150945: {
                        ** continue;
                    }
                    case -1394828372: {
                        ** continue;
                    }
                    case 1742457664: {
                        ** continue;
                    }
                    case -1771304673: {
                        ** continue;
                    }
                    case 75191066: {
                        ** continue;
                    }
                    case 1053773995: {
                        ** continue;
                    }
                    case 1076615518: {
                        ** continue;
                    }
                    case -104671544: {
                        continue block41;
                    }
                    case 1870790862: {
                        var0.method_22918((Matrix4fc)var1_1, var4_4, var6_6, var5_5).method_1336(var8_8, var9_9, var10_10, var11_11);
                        ** continue;
                    }
lbl122:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ 576404128;
                        ** GOTO lbl-1000
                        break;
                    }
lbl125:
                    // 1 sources

                    var14_14 = (var12_13 | var15_12) ^ -282089300;
                    ** GOTO lbl-1000
                    case 1064172979: {
                        var13_15 ^= var14_14 ^ 547912933;
                        ** continue;
                    }
lbl130:
                    // 1 sources

                    var14_14 = (var12_13 | var15_12) ^ 84224567;
                    ** GOTO lbl-1000
lbl132:
                    // 1 sources

                    var14_14 = (var12_13 | var15_12) ^ 1405290835;
                    ** continue;
                    case -1048426854: {
                        var13_15 ^= var14_14 ^ 1366298668;
                        ** continue;
                    }
                    case -551778836: {
                        var0.method_22918((Matrix4fc)var1_1, var2_2, var6_6, var3_3).method_1336(var8_8, var9_9, var10_10, var11_11);
                        ** continue;
                    }
                    case 333993043: {
                        var13_15 ^= var14_14 ^ 1849845169;
                        ** continue;
                    }
                    case 578279102: 
                }
                break;
            }
            break;
        }
        var0.method_22918((Matrix4fc)var1_1, var4_4, var7_7, var5_5).method_1336(var8_8, var9_9, var10_10, 0);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void mS(class_638 var0, class_2818 var1_1) {
        block29: {
            block28: {
                block30: {
                    break block30;
lbl1:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ -1955491567;
                        ** GOTO lbl35
lbl4:
                        // 1 sources

                        while (true) {
                            var4_5 ^= var5_4 ^ -2136206581;
                            ** GOTO lbl49
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ 710151816;
                            if (true) ** GOTO lbl19
lbl10:
                            // 1 sources

                            while (true) {
                                var4_5 ^= var5_4 ^ -1685828869;
                                break block28;
                                break;
                            }
                            break;
                        }
                        block19: while (true) {
                            block31: {
                                var5_4 = (var3_3 | var6_2) ^ 1337344359;
                                break block31;
lbl16:
                                // 1 sources

                                while (true) {
                                    var4_5 ^= var5_4 ^ 605192977;
                                    ** GOTO lbl33
                                    break;
                                }
                            }
lbl20:
                            // 3 sources

                            block21: while (true) {
                                switch (var5_4) lbl-1000:
                                // 5 sources

                                {
                                    default: {
                                        continue block21;
                                    }
                                    case -125297976: {
                                        ** continue;
                                    }
                                    case -971529281: {
                                        ** continue;
                                    }
                                    case -1082324312: {
                                        ** continue;
                                    }
lbl30:
                                    // 1 sources

                                    while (true) {
                                        var2_6 = ck.a;
                                        continue block19;
                                        break;
                                    }
lbl33:
                                    // 1 sources

                                    var5_4 = (var3_3 | var6_2) ^ -1446588407;
                                    ** GOTO lbl-1000
lbl35:
                                    // 2 sources

                                    block24: while (true) {
                                        switch (var5_4) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block24;
                                                }
                                                break;
                                            }
                                            case -464719512: {
                                                ** continue;
                                            }
lbl42:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ -507760603;
                                                ** GOTO lbl-1000
                                                break;
                                            }
                                            case -977452337: {
                                                if (var2_6 != null) break block29;
                                                var5_4 = (var3_3 | var6_2) ^ 1898575888;
                                                ** GOTO lbl-1000
                                            }
lbl49:
                                            // 1 sources

                                            var5_4 = (var3_3 | var6_2) ^ 1921194336;
                                            ** GOTO lbl-1000
                                            case 519605158: {
                                                var2_6.a.remove(var1_1.method_12004().method_8324());
                                                ** continue;
                                            }
lbl55:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ 1400023751;
                                                ** continue;
                                                break;
                                            }
                                            case 1451387786: {
                                                var4_5 ^= var5_4 ^ -755140777;
                                                ** continue;
                                            }
                                            case 1710785503: {
                                                return;
                                            }
                                            case 1011862206: {
                                                break block19;
                                            }
                                            case 1772221610: 
                                        }
                                        break;
                                    }
                                    var4_5 ^= var5_4 ^ -555851094;
                                    ** continue;
                                    case -1653975769: {
                                        return;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        var5_4 = (var3_3 | var6_2) ^ -559960315;
                        ** continue;
                        break;
                    }
                }
                var6_2 = -1827776115;
                var3_3 = ck.k & -1827776115 ^ 607540139;
                var5_4 = 0;
                var4_5 = (var3_3 | var6_2) ^ 1214867510;
                ** while (true)
            }
            var5_4 = (var3_3 | var6_2) ^ -758720400;
            ** GOTO lbl20
        }
        var5_4 = (var3_3 | var6_2) ^ 138629383;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void mT(class_638 var0, class_2818 var1_1) {
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

