/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10192
 *  net.minecraft.class_1304
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1887
 *  net.minecraft.class_1890
 *  net.minecraft.class_1893
 *  net.minecraft.class_2960
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 *  net.minecraft.class_7923
 *  net.minecraft.class_9334
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.Locale;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10192;
import net.minecraft.class_1304;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1887;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_2960;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.minecraft.class_9334;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class ae {
    private static final /* synthetic */ String a;
    private static final int[] a;
    private static final /* synthetic */ String b;
    public static final int a;
    private static final /* synthetic */ String c;

    /*
     * Enabled aggressive block sorting
     */
    private ae() {
        int n2 = a & 0x595FEC99 ^ 0x80A836FB;
        int n3 = (n2 | 0x595FEC99) ^ 0xBBB15EE2;
        n3 ^= 0x98463317;
        n3 ^= 0xC8ACD456;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean isAxe(class_1792 var0) {
        block28: {
            block29: {
                var5_1 = -1210778105;
                var2_2 = ae.a & -1210778105 ^ 1386401027;
                var4_3 = 0;
                var3_4 = (var2_2 | var5_1) ^ -1105776485;
                var4_3 = (var2_2 | var5_1) ^ -248034274;
                break block28;
lbl7:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -2045183659;
                    break block28;
                    break;
                }
lbl10:
                // 3 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -56818434;
                    break block29;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -765596409;
                    break block29;
                    break;
                }
                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -1311004988;
                    break block28;
                    break;
                }
            }
            block25: while (true) {
                switch (var4_3) {
                    case 631968256: {
                        var3_4 ^= var4_3 ^ 632826100;
                        var4_3 = (var2_2 | var5_1) ^ 2063077359;
                        continue block25;
                    }
                    case -915609276: {
                        var3_4 ^= var4_3 ^ 1520212418;
                        ** GOTO lbl52
                    }
                    case 1462171661: {
                        if (var1_5.isEmpty()) ** GOTO lbl10
                        var4_3 = (var2_2 | var5_1) ^ 145671412;
                        continue block25;
                    }
                    case -10994701: {
                        ** break;
                    }
                    case 1734851913: {
                        v0 = false;
                        ** GOTO lbl50
                    }
                    case -1715058221: {
                        var4_3 = (var2_2 | var5_1) ^ -1596979446;
                        continue block25;
                    }
                    case 191626233: {
                        var3_4 ^= var4_3 ^ 192463117;
                        var4_3 = (var2_2 | var5_1) ^ -1869528498;
                        continue block25;
                    }
                    case -1781463906: {
                        if (var1_5 == null) ** GOTO lbl10
                        ** GOTO lbl56
                    }
                    case -1928400664: {
                        v0 = true;
lbl50:
                        // 2 sources

                        var3_4 ^= -728615537;
                        return v0;
                    }
lbl52:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 1646787481;
                    break;
lbl54:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -854162217;
                    continue block25;
lbl56:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 1848686292;
                    continue block25;
                    case 987790288: {
                        if (var1_5.contains(ae.c)) ** break;
                        ** continue;
                        ** continue;
                    }
                }
lbl62:
                // 3 sources

            }
        }
        block27: while (true) {
            switch (var4_3) {
                case 1911424594: {
                    var3_4 ^= var4_3 ^ 1917255910;
                    ** GOTO lbl81
                }
                case 1177377219: {
                    var3_4 ^= var4_3 ^ -2026452801;
                    var4_3 = (var2_2 | var5_1) ^ 1270381208;
                    continue block27;
                }
                case -1135704673: {
                    var1_5 = class_7923.field_41178.method_10221((Object)var0).method_12832();
                    ** break;
                }
                case 1746441293: {
                    if (var0 != null) ** continue;
                    ** continue;
                }
lbl79:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 1050285635;
                ** GOTO lbl62
lbl81:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 1099615539;
                ** GOTO lbl88
                case -1233374668: {
                    return false;
                }
                case -681980185: {
                    var3_4 ^= var4_3 ^ 622254655;
                    var4_3 = (var2_2 | var5_1) ^ -1611764918;
                }
lbl88:
                // 3 sources

                default: {
                    continue block27;
                }
                case 113357593: 
            }
            var4_3 = (var2_2 | var5_1) ^ 548352480;
        }
    }

    private static int sL(int n2, int n3) {
        int n4 = -2139637212;
        int n5 = -2141696458;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xA8C275F0)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x807F986A;
        n6 ^= (n5 | n4) ^ 0x807F02F6;
        n6 ^= (n5 | n4) ^ 0x807F0C07;
        n6 += (n5 | n4) ^ 0x807FF7EC;
        n6 += (n5 | n4) ^ 0x807FD6CF;
        return n6 ^= (n5 | n4) ^ 0x807F2626;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block42: {
            block43: {
                block41: {
                    var9 = -1445903776;
                    var8_1 = -469250220;
                    ae.a = mK.a(MethodHandles.lookup().lookupClass(), 104003114);
                    var7_2 = 0;
                    ** GOTO lbl61
lbl6:
                    // 1 sources

                    while (true) {
                        var3_7 = 0;
                        ** GOTO lbl51
                        break;
                    }
lbl9:
                    // 2 sources

                    block20: while (true) {
                        switch (var7_2) lbl-1000:
                        // 5 sources

                        {
                            while (true) {
                                default: {
                                    continue block20;
                                }
                                break;
                            }
                            case 1356532085: {
                                ae.a[var4_8] = var5_9 ^= var2_5;
                                break block20;
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                var6_6 ^= -1992536084;
                                ** GOTO lbl23
lbl20:
                                // 1 sources

                                while (true) {
                                    var7_2 = var8_1 ^ -646598686;
                                    break block41;
                                    break;
                                }
lbl23:
                                // 1 sources

                                var0_3 = "\u00b1\u00bd\u00fcd\u0096\u00b4\u0096\u0004\u00ce\u00d9\u001f\u00ba".getBytes("ISO-8859-1");
                                var6_6 ^= -302507204;
                                ** GOTO lbl38
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var7_2 = var8_1 ^ -1496677406;
                                ** GOTO lbl111
                                break;
                            }
lbl29:
                            // 1 sources

                            while (true) {
                                var4_8 = 0;
                                break block42;
                                break;
                            }
lbl32:
                            // 1 sources

                            while (true) {
                                var6_6 ^= var7_2 ^ -1213697547;
                                ** GOTO lbl56
                                break;
                            }
lbl35:
                            // 1 sources

                            while (true) {
                                var7_2 = var8_1 ^ -1260599775;
                                ** GOTO lbl-1000
                                break;
                            }
lbl38:
                            // 1 sources

                            var1_4 = var0_3.length / 4;
                            break;
lbl40:
                            // 1 sources

                            while (true) {
                                var7_2 = var8_1 ^ -1579990453;
                                ** GOTO lbl-1000
                                break;
                            }
lbl43:
                            // 1 sources

                            while (true) {
                                var7_2 = var8_1 ^ 1640547567;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -2050028613: {
                                var3_7 += 4;
                                if (++var4_8 >= var1_4) {
                                    ** continue;
                                }
                                break block42;
                            }
lbl51:
                            // 1 sources

                            var6_6 ^= 119441260;
                            ** continue;
lbl53:
                            // 1 sources

                            while (true) {
                                var7_2 = var8_1 ^ var9;
                                ** continue;
                                break;
                            }
lbl56:
                            // 1 sources

                            var7_2 = var8_1 ^ -951678280;
                            break block41;
lbl58:
                            // 1 sources

                            while (true) {
                                var6_6 ^= var7_2 ^ -1874563852;
                                break block43;
                                break;
                            }
lbl61:
                            // 1 sources

                            var6_6 = 2097081810;
                            ** continue;
                        }
                        break;
                    }
                    var7_2 = var8_1 ^ 1753203348;
                    ** GOTO lbl9
lbl65:
                    // 1 sources

                    while (true) {
                        var7_2 = var8_1 ^ 234622086;
                        ** continue;
                        break;
                    }
                    {
                        case -1938289216: {
                            var6_6 ^= var7_2 ^ 34121766;
                            ** continue;
                        }
                    }
lbl71:
                    // 1 sources

                    while (true) {
                        var5_9 = (var0_3[var3_7] & (((var6_6 ^= -1809035868) | var8_1) ^ -300949592)) << ((var6_6 | var8_1) ^ -300949681) | (var0_3[var3_7 + 1] & ((var6_6 | var8_1) ^ -300949592)) << ((var6_6 | var8_1) ^ -300949689) | (var0_3[var3_7 + 2] & ((var6_6 | var8_1) ^ -300949592)) << ((var6_6 | var8_1) ^ -300949665) | var0_3[var3_7 + 3] & ((var6_6 | var8_1) ^ -300949592);
                        ** continue;
                        break;
                    }
lbl74:
                    // 1 sources

                    while (true) {
                        var7_2 = var8_1 ^ -1457807865;
                        if (true) ** GOTO lbl111
                        break;
                    }
                    {
                        case -369376302: {
                            var6_6 ^= var7_2 ^ -207148144;
                            ** continue;
                        }
                    }
                    var7_2 = var8_1 ^ 1332900723;
                    break block41;
lbl82:
                    // 1 sources

                    while (true) {
                        ae.a = new int[var1_4];
                        ** continue;
                        break;
                    }
                }
lbl86:
                // 2 sources

                block36: while (true) {
                    switch (var7_2) {
                        default: {
                            continue block36;
                        }
                        case 884731834: {
                            ** continue;
                        }
                        case -1418347481: {
                            ** continue;
                        }
                        case 1030906038: {
                            ** continue;
                        }
                        ** case 591480300:
lbl97:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            var7_2 = var8_1 ^ -792977170;
            ** while (true)
lbl101:
            // 1 sources

            while (true) {
                var6_6 ^= var7_2 ^ 1220564521;
                ** continue;
                break;
            }
            {
                case 1305906484: {
                    ae.c = gj.decode("m9mekg==", ae.sL((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -1824728788), var7_2 ^ var9 ^ ((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ 355191035))));
                    ae.b = gj.decode("FAn4Dx9vgQiK", ae.sL((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -1824728787), var7_2 ^ var9 ^ ((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -1041318885))));
                    ae.a = gj.decode("EFboVqtDrE5B/eKxs1xOPw==", ae.sL((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -1824728786), var7_2 ^ var9 ^ ((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ 448396492))));
                    return;
                }
            }
            block38: while (true) {
                var7_2 = var8_1 ^ -601016224;
lbl111:
                // 3 sources

                block39: while (true) {
                    switch (var7_2) {
                        default: {
                            continue block39;
                        }
                        case 1120750774: {
                            continue block38;
                        }
                        case 942339892: {
                            ** continue;
                        }
                        case 1293701459: 
                    }
                    break;
                }
                break;
            }
            var2_5 = (var6_6 | var7_2 ^ -1457807865) ^ (var7_2 ^ -312317831) ^ ae.a;
            ** while (true)
        }
        ** while (true)
        {
            ** case 1171557663:
        }
lbl125:
        // 1 sources

        var6_6 ^= var7_2 ^ -1381839822;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean isArmor(class_1799 var0) {
        var5_1 = -275800818;
        var2_2 = ae.a & -275800818 ^ -1502963987;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ 24245623;
        var4_3 = (var2_2 | var5_1) ^ 1805307555;
        if (true) ** GOTO lbl13
        block21: while (true) {
            block30: {
                var4_3 = (var2_2 | var5_1) ^ -1854700377;
                break block30;
lbl10:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -79252490;
                    if (true) ** GOTO lbl57
                    break;
                }
            }
            block23: while (true) {
                block31: {
                    switch (var4_3) {
                        default: {
                            continue block23;
                        }
                        case -1007188936: {
                            return false;
                        }
                        case -2072686260: {
                            ** break;
                        }
                        case 2124159816: {
                            if (var0 != null) {
                                var4_3 = (var2_2 | var5_1) ^ 1814531512;
                                continue block23;
                            }
                            ** GOTO lbl34
                        }
lbl27:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -1382298085;
                        continue block23;
                        case -2084040105: {
                            var4_3 = (var2_2 | var5_1) ^ -211435588;
                            continue block23;
                        }
                        case 478814291: {
                            if (!var0.method_7960()) break block31;
lbl34:
                            // 2 sources

                            var4_3 = (var2_2 | var5_1) ^ 269586948;
                            continue block23;
                        }
                        case -127509: {
                            var3_4 ^= var4_3 ^ -1432184596;
                            ** GOTO lbl46
                        }
                        case -2037496263: {
                            var1_5 = (class_10192)var0.method_58694(class_9334.field_54196);
                            ** continue;
                        }
                        case 1114919412: {
                            var3_4 ^= var4_3 ^ 1155050814;
                            continue block21;
                        }
lbl46:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 739777495;
                        continue block23;
                        case -1014352633: 
                    }
                    var3_4 ^= var4_3 ^ 1796313522;
                    var4_3 = (var2_2 | var5_1) ^ 1768020438;
                    continue;
                }
                var4_3 = (var2_2 | var5_1) ^ 744860392;
            }
            break;
        }
        block24: while (true) {
            var4_3 = (var2_2 | var5_1) ^ 929998992;
lbl57:
            // 2 sources

            block25: while (true) {
                switch (var4_3) {
                    case -1919141637: {
                        var3_4 ^= var4_3 ^ 397872865;
                        ** break;
                    }
                    case -662620289: {
                        var3_4 ^= var4_3 ^ 1118437733;
                        var4_3 = (var2_2 | var5_1) ^ 823116576;
                        continue block25;
                    }
                    case 1302773791: {
                        v0 = true;
                        ** GOTO lbl87
                    }
                    case 739399197: {
                        if (var1_5 == null) continue block24;
                        var4_3 = (var2_2 | var5_1) ^ -2022061747;
                        continue block25;
                    }
                    case -356494693: {
                        if (var1_5.comp_3174().method_46643()) ** break;
                        continue block24;
                        var4_3 = (var2_2 | var5_1) ^ 1651746580;
                        continue block25;
                    }
                    case 346631193: {
                        var3_4 ^= var4_3 ^ -1205735488;
                        var4_3 = (var2_2 | var5_1) ^ -1006777870;
                        continue block25;
                    }
lbl82:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1572249616;
                    default: {
                        continue block25;
                    }
                    case -555721521: {
                        v0 = false;
lbl87:
                        // 2 sources

                        var3_4 ^= -1888238449;
                        return v0;
                    }
                    case 1754683042: 
                }
                var4_3 = (var2_2 | var5_1) ^ 87018868;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static boolean isChestplate(class_1799 var0) {
        block45: {
            block39: {
                block48: {
                    block44: {
                        block46: {
                            block41: {
                                block40: {
                                    block43: {
                                        block42: {
                                            break block45;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                var3_5 ^= var4_3 ^ -2005536628;
                                                break block39;
                                                break;
                                            }
lbl4:
                                            // 1 sources

                                            while (true) {
                                                var3_5 ^= var4_3 ^ -1432240923;
                                                ** GOTO lbl14
                                                break;
                                            }
lbl7:
                                            // 7 sources

                                            block23: while (true) {
                                                switch (var4_3) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        default: {
                                                            continue block23;
                                                        }
                                                        break;
                                                    }
                                                    case -1972867431: {
                                                        ** continue;
                                                    }
lbl14:
                                                    // 1 sources

                                                    var4_3 = (var2_2 | var5_1) ^ -669185772;
                                                    ** GOTO lbl76
lbl16:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var0 == null) break block40;
                                                        break block41;
                                                        break;
                                                    }
lbl19:
                                                    // 1 sources

                                                    while (true) {
                                                        var1_4 = (class_10192)var0.method_58694(class_9334.field_54196);
                                                        break block42;
                                                        break;
                                                    }
                                                    case 1432161967: {
                                                        v0 = false;
                                                        break block43;
                                                    }
                                                    case 1989643414: {
                                                        break block23;
                                                    }
                                                    case -248554043: {
                                                        if (var1_4.comp_3174() != class_1304.field_6174) ** GOTO lbl97
                                                        ** GOTO lbl93
                                                    }
                                                    case -1577581913: {
                                                        if (var1_4 == null) ** GOTO lbl97
                                                        break block44;
                                                    }
lbl33:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_3 = (var2_2 | var5_1) ^ -1313829867;
                                                        ** continue;
                                                        break;
                                                    }
lbl36:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_3 = (var2_2 | var5_1) ^ -387674613;
                                                        ** GOTO lbl76
                                                        break;
                                                    }
lbl39:
                                                    // 1 sources

                                                    return v0;
lbl41:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_3 = (var2_2 | var5_1) ^ -2015490181;
                                                        ** GOTO lbl76
                                                        break;
                                                    }
                                                    case 1318683801: {
                                                        var3_5 ^= var4_3 ^ 1283725964;
                                                        ** continue;
                                                    }
                                                }
                                                break;
                                            }
                                            var4_3 = (var2_2 | var5_1) ^ 1859563576;
                                            ** GOTO lbl7
                                        }
                                        var4_3 = (var2_2 | var5_1) ^ -1233968226;
                                        ** GOTO lbl7
                                    }
lbl53:
                                    // 2 sources

                                    while (true) {
                                        var3_5 ^= 1524795586;
                                        ** continue;
                                        break;
                                    }
lbl56:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 1040314202;
                                        ** GOTO lbl7
                                        break;
                                    }
lbl59:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ -1811337324;
                                        ** GOTO lbl76
                                        break;
                                    }
                                }
lbl63:
                                // 2 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -1388134335;
                                    if (true) ** GOTO lbl76
                                    break;
                                }
lbl66:
                                // 1 sources

                                while (var0.method_7960()) {
                                    ** continue;
lbl68:
                                    // 1 sources

                                    ** GOTO lbl63
                                }
                                break block46;
                                block36: while (true) {
                                    block47: {
                                        var4_3 = (var2_2 | var5_1) ^ 122164340;
                                        break block47;
lbl73:
                                        // 1 sources

                                        while (true) {
                                            var3_5 ^= var4_3 ^ -1350979217;
                                            ** continue;
                                            break;
                                        }
                                    }
lbl77:
                                    // 4 sources

                                    block38: while (true) {
                                        switch (var4_3) {
                                            default: {
                                                continue block38;
                                            }
                                            case 851127740: {
                                                ** continue;
                                            }
                                            case -1242376020: {
                                                ** continue;
                                            }
                                            case -1719103958: {
                                                ** continue;
                                            }
                                            case 1998414838: {
                                                ** continue;
                                            }
                                            case 200327785: {
                                                ** GOTO lbl66
                                            }
                                            case -82207526: {
                                                ** continue;
                                            }
lbl93:
                                            // 1 sources

                                            var4_3 = (var2_2 | var5_1) ^ -782210716;
                                            ** GOTO lbl7
                                            case 1206183145: {
                                                return false;
                                            }
lbl97:
                                            // 2 sources

                                            var4_3 = (var2_2 | var5_1) ^ 361857892;
                                            ** GOTO lbl7
                                            case 405267078: {
                                                continue block36;
                                            }
                                            case -1733166711: 
                                        }
                                        break;
                                    }
                                    break;
                                }
                                var3_5 ^= var4_3 ^ -753056373;
                                break block48;
                            }
                            var4_3 = (var2_2 | var5_1) ^ 705377617;
                            ** GOTO lbl77
                        }
                        var4_3 = (var2_2 | var5_1) ^ 1692430631;
                        ** GOTO lbl77
                    }
                    var4_3 = (var2_2 | var5_1) ^ -378642069;
                    ** GOTO lbl7
                }
                var4_3 = (var2_2 | var5_1) ^ 108094423;
                ** while (true)
            }
            var4_3 = (var2_2 | var5_1) ^ -895163566;
            ** while (true)
            {
                case 776561128: {
                    v0 = true;
                    ** continue;
                }
                ** case 696962659:
            }
lbl123:
            // 1 sources

            var3_5 ^= var4_3 ^ -1425311327;
            ** while (true)
        }
        var5_1 = 460907932;
        var2_2 = ae.a & 460907932 ^ -1919849351;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ -1612400511;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int armorSlotIndex(class_1799 var0) {
        block38: {
            block37: {
                block36: {
                    var6_1 = -1776974074;
                    var3_2 = ae.a & -1776974074 ^ -793031899;
                    var5_3 = 0;
                    var4_4 = (var3_2 | var6_1) ^ -1714006291;
                    var5_3 = (var3_2 | var6_1) ^ -1371769000;
                    break block36;
                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ -1242873988;
                        break block36;
                        break;
                    }
                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ 1354943094;
                        break block37;
                        break;
                    }
                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ -1468844670;
                        break block38;
                        break;
                    }
                }
                block30: while (true) {
                    switch (var5_3) {
                        case -1495053064: {
                            ** GOTO lbl46
                        }
                        case 2021898367: {
                            ** break;
                        }
                        case 1416799393: {
                            var4_4 ^= var5_3 ^ -1171762075;
                            var5_3 = (var3_2 | var6_1) ^ -2186743;
                            continue block30;
                        }
                        case 1486353154: {
                            var4_4 ^= var5_3 ^ -1330968660;
                            ** GOTO lbl52
                        }
lbl30:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ -1909965787;
                        continue block30;
                        case 1381378520: {
                            if (!var0.method_7960()) ** continue;
                            ** GOTO lbl-1000
                        }
                        case 2031491059: {
                            if (var0 != null) {
                                var5_3 = (var3_2 | var6_1) ^ 1885111263;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var5_3 = (var3_2 | var6_1) ^ -2100466810;
                            }
                        }
                        default: {
                            continue block30;
                        }
                        case 1666510939: {
                            var4_4 ^= var5_3 ^ -1027093622;
                            var5_3 = (var3_2 | var6_1) ^ 2103312485;
                            continue block30;
                        }
lbl46:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ -2065045761;
                        continue block30;
                        case -1411264702: {
                            var1_5 = (class_10192)var0.method_58694(class_9334.field_54196);
                            var5_3 = (var3_2 | var6_1) ^ -1398846934;
                            break block38;
                        }
lbl52:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ -1347823404;
                        continue block30;
                        case 694250798: 
                    }
                    break;
                }
                return -1;
lbl56:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ 1693337221;
                    break block38;
                    break;
                }
            }
lbl60:
            // 2 sources

            block32: while (true) {
                switch (var5_3) {
                    default: {
                        continue block32;
                    }
                    case 388522841: {
                        var4_4 ^= var5_3 ^ -875785410;
                        ** break;
                    }
                    case -2038626991: {
                        var4_4 ^= var5_3 ^ 109615128;
                        var5_3 = (var3_2 | var6_1) ^ -170846973;
                        continue block32;
                    }
                    case -229638471: {
                        if (var2_6.method_46643()) ** continue;
                        var5_3 = (var3_2 | var6_1) ^ -1047024514;
                        continue block32;
                    }
lbl75:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ 261151734;
                    continue block32;
                    case -1460185142: {
                        var4_4 ^= var5_3 ^ 878723965;
                        var5_3 = (var3_2 | var6_1) ^ 619721118;
                        continue block32;
                    }
                    case -651225903: {
                        return -1;
                    }
                    case 594467364: 
                }
                return 3 - var2_6.method_5927();
            }
        }
        block33: while (true) {
            switch (var5_3) {
                default: {
                    continue block33;
                }
                case 2127362725: {
                    var4_4 ^= var5_3 ^ -580054174;
                    ** continue;
                }
                case -1466789223: {
                    var4_4 ^= var5_3 ^ 123564008;
                    ** break;
                }
                case -1303279198: {
                    var2_6 = var1_5.comp_3174();
                    ** GOTO lbl101
                }
lbl99:
                // 1 sources

                var5_3 = (var3_2 | var6_1) ^ 295577751;
                continue block33;
lbl101:
                // 1 sources

                var5_3 = (var3_2 | var6_1) ^ 2118686957;
                ** continue;
                case 2048951565: {
                    var4_4 ^= var5_3 ^ 1603419703;
                    ** GOTO lbl110
                }
                case -1781643175: {
                    if (var1_5 != null) ** continue;
                    var5_3 = (var3_2 | var6_1) ^ 2116902334;
                    continue block33;
                }
lbl110:
                // 1 sources

                var5_3 = (var3_2 | var6_1) ^ 1131513726;
                continue block33;
                case -954079312: 
            }
            break;
        }
        return -1;
    }

    /*
     * Exception decompiling
     */
    public static double armorValue(class_1799 var0) {
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
    public static double armorScore(class_1799 var0) {
        block42: {
            block41: {
                var6_1 = 1716812922;
                var3_2 = ae.a & 1716812922 ^ 161303829;
                var5_3 = 0;
                ** GOTO lbl109
lbl5:
                // 1 sources

                while (true) {
                    var4_5 ^= var5_3 ^ 1647937781;
                    ** GOTO lbl99
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -1797414812;
                    break block41;
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ 889682972;
                    ** GOTO lbl32
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -1387067512;
                    ** GOTO lbl32
                    break;
                }
            }
lbl18:
            // 2 sources

            block27: while (true) {
                switch (var5_3) lbl-1000:
                // 10 sources

                {
                    while (true) {
                        default: {
                            continue block27;
                        }
                        break;
                    }
lbl23:
                    // 1 sources

                    while (true) {
                        var1_4 += (double)ae.getEnchantmentLevel(var0, (class_5321<class_1887>)class_1893.field_9095) * 0.1;
                        ** GOTO lbl43
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ -257102876;
                        ** GOTO lbl-1000
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        var4_5 ^= var5_3 ^ -650171352;
                        ** continue;
                        break;
                    }
lbl32:
                    // 7 sources

                    block32: while (true) {
                        switch (var5_3) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block32;
                                }
                                break;
                            }
                            case -1151590108: {
                                ** continue;
                            }
                            case 634959187: {
                                ** continue;
                            }
                            case -1030849801: {
                                ** continue;
                            }
lbl43:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ -1787084823;
                            ** continue;
                            case -63235105: {
                                if (var0 != null) ** GOTO lbl56
lbl47:
                                // 3 sources

                                while (true) {
                                    var5_3 = (var3_2 | var6_1) ^ -130909956;
                                    ** GOTO lbl-1000
                                    break;
                                }
                            }
lbl50:
                            // 1 sources

                            while (true) {
                                var5_3 = (var3_2 | var6_1) ^ -1831512871;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -89767274: {
                                var4_5 ^= var5_3 ^ -1334538126;
                                ** GOTO lbl77
                            }
lbl56:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ 956482408;
                            ** GOTO lbl-1000
                            case 1633361382: {
                                var1_4 += (double)ae.getEnchantmentLevel(var0, (class_5321<class_1887>)class_1893.field_9107) * 0.1;
                                ** continue;
                            }
                            case -123098649: {
                                var4_5 ^= var5_3 ^ 1524399605;
                                break block32;
                            }
                            case -1619945829: {
                                ** continue;
                            }
                            case 1697322489: {
                                var1_4 += (double)ae.getEnchantmentLevel(var0, (class_5321<class_1887>)class_1893.field_9129) * 0.1;
                                ** GOTO lbl81
                            }
                            while (true) {
                                var5_3 = (var3_2 | var6_1) ^ -1291438582;
                                ** GOTO lbl-1000
                                break;
                            }
                        }
                        break;
                    }
                    var5_3 = (var3_2 | var6_1) ^ 1241892908;
                    ** GOTO lbl32
lbl74:
                    // 1 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ -1813616992;
                        ** GOTO lbl-1000
                        break;
                    }
lbl77:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ 243687577;
                    ** GOTO lbl32
                    case -600830393: {
                        ** continue;
                    }
lbl81:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ -1753951080;
                    ** GOTO lbl32
                    {
                        ** case 1524236643:
                    }
lbl84:
                    // 1 sources

                    return var1_4;
                    case -49796698: {
                        if (ae.isArmor(var0)) ** continue;
                        ** GOTO lbl47
                    }
                    case 1692163025: {
                        return 0.0;
                    }
                    case -863942467: {
                        var1_4 = ae.armorValue(var0);
                        break block27;
                    }
lbl93:
                    // 1 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ -1528509206;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -589608075: {
                        var4_5 ^= var5_3 ^ -994472341;
                        break block42;
                    }
lbl99:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ 183920774;
                    ** GOTO lbl32
                    case 1457503767: {
                        ** continue;
                    }
                    case -83829477: {
                        var4_5 ^= var5_3 ^ 782688205;
                        ** continue;
                    }
lbl106:
                    // 1 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ 184624814;
                        ** GOTO lbl-1000
                        break;
                    }
lbl109:
                    // 1 sources

                    var4_5 = (var3_2 | var6_1) ^ -673829910;
                    ** continue;
lbl111:
                    // 1 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ -1276284104;
                        ** continue;
                        break;
                    }
                }
                break;
            }
            var5_3 = (var3_2 | var6_1) ^ -729719717;
            ** while (true)
            {
                case -1745943165: {
                    var4_5 ^= var5_3 ^ 576820987;
                    ** continue;
                }
                ** case -885411435:
            }
lbl120:
            // 1 sources

            if (!var0.method_7960()) ** break;
            ** while (true)
            ** while (true)
        }
        var5_3 = (var3_2 | var6_1) ^ -1554238014;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int getEnchantmentLevel(class_1799 var0, String var1_1) {
        block40: {
            var9_2 = 1863726795;
            var6_3 = ae.a & 1863726795 ^ 1954673291;
            var8_4 = 0;
            var7_5 = (var6_3 | var9_2) ^ -320335858;
            var8_4 = (var6_3 | var9_2) ^ -1394022148;
            break block40;
lbl7:
            // 1 sources

            while (true) {
                var7_5 ^= 805795650;
                var4_8 = var3_7.method_57534().iterator();
                ** GOTO lbl-1000
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                var8_4 = (var6_3 | var9_2) ^ 181697878;
                break block40;
lbl14:
                // 2 sources

                while (true) {
                    var8_4 = (var6_3 | var9_2) ^ -1501666810;
                    break block40;
                    break;
                }
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                var8_4 = (var6_3 | var9_2) ^ 1893269705;
                ** GOTO lbl96
                break;
            }
lbl20:
            // 1 sources

            block31: while (true) {
                switch (var8_4) {
                    case -727637984: {
                        var7_5 ^= var8_4 ^ 1800361154;
                        ** break;
                    }
                    case 621207583: {
                        if (var5_9.method_40230().map((Function<class_5321, Boolean>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, sM(net.minecraft.class_2960 net.minecraft.class_5321 ), (Lnet/minecraft/class_5321;)Ljava/lang/Boolean;)((class_2960)var2_6)).orElse(false).booleanValue()) {
                            var8_4 = (var6_3 | var9_2) ^ -179156864;
                            ** break;
                        }
                        var8_4 = (var6_3 | var9_2) ^ -1422469397;
                        ** break;
                    }
lbl31:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ 1128782055;
                    continue block31;
                    case 1020276268: lbl-1000:
                    // 2 sources

                    {
                        var8_4 = (var6_3 | var9_2) ^ -485578320;
                        ** GOTO lbl96
                    }
                    case 787385878: {
                        var7_5 ^= var8_4 ^ -811521288;
                        ** GOTO lbl44
                    }
                    case -1966752181: {
                        var7_5 ^= var8_4 ^ 542972833;
                        var8_4 = (var6_3 | var9_2) ^ 1813452512;
                    }
lbl42:
                    // 4 sources

                    default: {
                        continue block31;
                    }
lbl44:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ 1519458004;
                    continue block31;
                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ 1176997176;
                        if (true) ** GOTO lbl96
                        break;
                    }
                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ -492924296;
                        break block40;
lbl52:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ -1511470390;
                            break block40;
                            break;
                        }
                        break;
                    }
lbl55:
                    // 1 sources

                    while (true) {
                        var7_5 ^= 1758015054;
                        var3_7 = class_1890.method_57532((class_1799)var0);
                        ** continue;
                        break;
                    }
                    case 327213099: 
                }
                break;
            }
            return var3_7.method_57536(var5_9);
        }
        block36: while (true) {
            switch (var8_4) {
                default: {
                    continue block36;
                }
                case 1967360925: {
                    if (var0 == null) ** GOTO lbl14
                    ** continue;
                }
                case -746643913: {
                    var8_4 = (var6_3 | var9_2) ^ -383464111;
                    continue block36;
                }
                case -639003443: {
                    var7_5 ^= var8_4 ^ -702675727;
                    var8_4 = (var6_3 | var9_2) ^ 1446915082;
                    continue block36;
                }
                case -1766638694: {
                    var7_5 ^= var8_4 ^ 2116366208;
                    ** continue;
                }
                case -629195775: {
                    var8_4 = (var6_3 | var9_2) ^ -1667395320;
                    continue block36;
                }
                case -485857341: {
                    if (!var0.method_7960()) ** continue;
                    ** continue;
                }
                case 1622976041: {
                    var2_6 = class_2960.method_60655((String)ae.b, (String)var1_1);
                    ** continue;
                }
                case -1660328781: {
                    var7_5 ^= var8_4 ^ 2117056932;
                    var8_4 = (var6_3 | var9_2) ^ 522932450;
                    continue block36;
                }
                case 698997441: 
            }
            break;
        }
        return 0;
        block37: while (true) {
            var8_4 = (var6_3 | var9_2) ^ -488641809;
lbl96:
            // 4 sources

            block38: while (true) {
                switch (var8_4) {
                    default: {
                        continue block38;
                    }
                    case 1564309980: {
                        if (!var4_8.hasNext()) ** continue;
                        continue block37;
                    }
                    case -1667670149: {
                        var7_5 ^= var8_4 ^ -985455304;
                        ** break;
                    }
                    case 967867379: {
                        var7_5 ^= var8_4 ^ -996727883;
                        var8_4 = (var6_3 | var9_2) ^ 570569438;
                        continue block38;
                    }
                    case -1656218588: {
                        var7_5 ^= var8_4 ^ -1707886997;
                        ** continue;
                    }
                    case 256833026: {
                        var5_9 = (class_6880)var4_8.next();
                        var8_4 = (var6_3 | var9_2) ^ 1366915293;
                        ** continue;
                    }
lbl117:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ 581603095;
                    continue block38;
                    case 1570096149: 
                }
                break;
            }
            break;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int getEnchantmentLevel(class_1799 var0, class_5321<class_1887> var1_1) {
        block46: {
            var8_2 = 24926231;
            var5_3 = ae.a & 24926231 ^ 180561810;
            var7_4 = 0;
            var6_6 = (var5_3 | var8_2) ^ 1960850973;
            var7_4 = (var5_3 | var8_2) ^ -1236076339;
            ** GOTO lbl133
lbl7:
            // 1 sources

            while (true) {
                var3_7 = var2_5.method_57534().iterator();
                ** GOTO lbl-1000
                break;
            }
lbl-1000:
            // 7 sources

            {
                block0 : switch (var7_4) {
                    case -1728178194: {
                        var6_6 ^= var7_4 ^ 644619644;
                        ** break;
                    }
                    case 1316906525: {
                        var6_6 ^= var7_4 ^ 1891270405;
                        ** GOTO lbl58
                    }
                    case -987448255: {
                        if (var3_7.hasNext()) {
                            ** break;
                        }
                        ** GOTO lbl44
                    }
lbl21:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ -824458282;
                    break;
                    case -1417649727: {
                        ** GOTO lbl58
                    }
                    case -1847870479: {
                        ** GOTO lbl42
                    }
                    case -1896342452: {
                        var6_6 ^= var7_4 ^ -1900852031;
                        ** GOTO lbl32
                    }
                    case 1222027052: {
                        var6_6 ^= var7_4 ^ -713572915;
lbl32:
                        // 2 sources

                        var7_4 = (var5_3 | var8_2) ^ -1708866458;
                        break;
                    }
lbl34:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ -1602281898;
                    continue block37;
                    case -1395577563: {
                        var4_8 = (class_6880)var3_7.next();
                        var7_4 = (var5_3 | var8_2) ^ 1748390692;
                        break block46;
                    }
                    case 426703829: {
                        return 0;
                    }
lbl42:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ -1490136398;
                    continue block37;
lbl44:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ 768261064;
                    continue block37;
                    case 1274877725: {
                        switch (var6_6) {
                            case -297946743: {
                                var7_4 = (var5_3 | var8_2) ^ 1126815931;
                                break block0;
                            }
                            case 404694640: {
                                var7_4 = (var5_3 | var8_2) ^ 1166088586;
                                break block0;
                            }
                            default: {
                                var7_4 = (var5_3 | var8_2) ^ -2063113253;
                                break;
                            }
                        }
                        continue block37;
                    }
lbl58:
                    // 2 sources

                    var7_4 = (var5_3 | var8_2) ^ 1073899658;
                    continue block37;
                    case 641057887: {
                        var6_6 ^= var7_4 ^ -676364494;
                        var7_4 = (var5_3 | var8_2) ^ 311526466;
                        continue block37;
                    }
                }
lbl64:
                // 6 sources

                ** while (true)
            }
lbl65:
            // 1 sources

            while (true) {
                var6_6 ^= 465149266;
                ** continue;
                break;
            }
lbl68:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        block41: while (true) {
            block47: {
                switch (var7_4) {
                    case -592408876: {
                        var6_6 ^= var7_4 ^ -1419102248;
                        break block47;
                    }
                    case 1674128563: {
                        var6_6 ^= var7_4 ^ 924878284;
                        ** break;
                    }
                    case 362362002: {
                        var6_6 ^= var7_4 ^ 947366405;
                        ** GOTO lbl84
                    }
lbl82:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ -1077761885;
                    continue block41;
lbl84:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ -1575759974;
                    continue block41;
                    case -1444106227: {
                        return var2_5.method_57536(var4_8);
                    }
                    case 984568522: lbl-1000:
                    // 2 sources

                    {
                        var7_4 = (var5_3 | var8_2) ^ -1828624263;
                        ** GOTO lbl64
                    }
                    case -1271015628: {
                        var7_4 = var4_8.method_40225(var1_1) != false ? (var5_3 | var8_2) ^ 510020357 : (var5_3 | var8_2) ^ -682626749;
                    }
                }
                continue;
            }
            var7_4 = (var5_3 | var8_2) ^ 827338077;
        }
        var7_4 = (var5_3 | var8_2) ^ 65253604;
        block42: while (true) {
            switch (var7_4) {
                case 1018797596: {
                    var6_6 ^= var7_4 ^ -293605674;
                    ** break;
                }
                case 1661534509: {
                    return 0;
                }
                case -1112701094: {
                    var7_4 = (var5_3 | var8_2) ^ 927392139;
                    continue block42;
                }
                case -68223518: {
                    var6_6 ^= var7_4 ^ 1297360722;
                    var7_4 = (var5_3 | var8_2) ^ 1760984762;
                    break;
                }
lbl112:
                // 1 sources

                var7_4 = (var5_3 | var8_2) ^ -694352530;
                break;
                case 136105843: {
                    var2_5 = class_1890.method_57532((class_1799)var0);
                    ** continue;
                }
                case 945055147: {
                    var6_6 ^= var7_4 ^ -560235870;
                    ** continue;
                }
                case 244149030: {
                    var7_4 = (var5_3 | var8_2) ^ 933413681;
                    break;
                }
                case -580748551: {
                    if (var0 != null) {
                        var7_4 = (var5_3 | var8_2) ^ 91362481;
                        break;
                    }
                    ** GOTO lbl132
                }
                case 1012776102: {
                    if (!var0.method_7960()) {
                        var7_4 = (var5_3 | var8_2) ^ 866851388;
                        break;
                    }
lbl132:
                    // 3 sources

                    var7_4 = (var5_3 | var8_2) ^ -267287947;
                }
            }
lbl133:
            // 8 sources

        }
    }

    /*
     * Unable to fully structure code
     */
    public static boolean isTotem(class_1799 var0) {
        block25: {
            block26: {
                block27: {
                    block29: {
                        block28: {
                            break block28;
lbl1:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 393693729;
                                break block25;
lbl4:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= -668349649;
                                    break block26;
                                    break;
                                }
                                break;
                            }
                        }
                        var4_1 = 1822231618;
                        var1_2 = ae.a & 1822231618 ^ 1024465546;
                        var3_3 = 0;
                        break block29;
                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1415231177;
                            break block25;
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 296233164;
                            break block25;
                            break;
                        }
lbl18:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -1643063153;
                            ** GOTO lbl70
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 605855982;
                            break block25;
                            break;
                        }
                    }
                    var2_4 = (var1_2 | var4_1) ^ 1078683003;
                    var3_3 = (var1_2 | var4_1) ^ -1315319339;
                    break block25;
lbl28:
                    // 1 sources

                    while (true) {
                        if (!var0.method_7960()) ** continue;
                        break block27;
                        break;
                    }
lbl31:
                    // 1 sources

                    return class_7923.field_41178.method_10221((Object)var0.method_7909()).method_12832().toLowerCase(Locale.ROOT).contains(ae.a);
lbl33:
                    // 1 sources

                    while (true) {
                        if (var0 == null) break block27;
                        ** continue;
lbl36:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1012978522;
                            break block25;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    return false;
lbl41:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -2004697645;
                        break block25;
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 1230765784;
                break block25;
            }
            var2_4 ^= -469795722;
            ** while (true)
        }
        block23: while (true) {
            switch (var3_3) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block23;
                    }
                    break;
                }
                case 1815426566: {
                    ** continue;
                }
                case 700950531: {
                    ** continue;
                }
                case -872100065: {
                    ** continue;
                }
                case -182476007: {
                    ** continue;
                }
                case 1501675044: {
                    ** continue;
                }
                case 1793742059: {
                    ** continue;
                }
                case -1872180178: {
                    ** continue;
                }
lbl70:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -302656796;
                ** continue;
                case 885448722: {
                    var2_4 ^= var3_3 ^ -608772923;
                    ** continue;
                }
                case 1107152272: 
            }
            break;
        }
        var2_4 ^= var3_3 ^ 927380194;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ Boolean sM(class_2960 var0, class_5321 var1_1) {
        var2_2 = ae.a & 2130326430 ^ 1359906311;
        var4_3 = 0;
        ** GOTO lbl16
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
lbl9:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | 2130326430) ^ -622944773;
                    ** continue;
                    break;
                }
                case -1524618652: {
                    break block5;
                }
                case 1251570610: {
                    return var1_1.method_29177().equals((Object)var0);
                }
lbl16:
                // 1 sources

                var3_4 = (var2_2 | 2130326430) ^ -123682667;
                ** continue;
            }
            break;
        }
        var4_3 = (var2_2 | 2130326430) ^ 397479442;
        ** GOTO lbl4
        {
            ** case 1750055309:
        }
lbl21:
        // 1 sources

        var3_4 ^= var4_3 ^ 430295211;
        var4_3 = (var2_2 | 2130326430) ^ 895992877;
        ** while (true)
    }
}

