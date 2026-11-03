/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 *  net.minecraft.class_408
 *  org.lwjgl.glfw.GLFW
 */
package z.r;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_408;
import org.lwjgl.glfw.GLFW;
import z.r.H;
import z.r.S;
import z.r.W;
import z.r.ad;
import z.r.dm;
import z.r.fE;
import z.r.fs;
import z.r.kf;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class hc {
    private static float a;
    private static final int[] a;
    private static final float b;
    private static final /* synthetic */ String a;
    private static float c;
    private static final List<fE> a;
    private static boolean a;
    public static final int a;
    private static boolean b;
    private static float d;
    private static boolean c;
    private static float e;
    private static final List<fs> b;
    private static S a;
    private static ad a;
    private static ad b;

    private hc() {
        int n2 = a & 0xA46BC53 ^ 0x9E34A62D;
        int n3 = (n2 | 0xA46BC53) ^ 0xCC4A283D;
        n3 ^= 0xC038246A;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean isEditMode(class_310 var0) {
        block22: {
            block23: {
                var4_1 = -42392507;
                var1_2 = hc.a & -42392507 ^ -2096695392;
                var3_3 = 0;
                ** GOTO lbl40
lbl5:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1925785619;
                    ** GOTO lbl25
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1941367589;
                    ** GOTO lbl25
lbl11:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 726487352;
                        ** GOTO lbl25
                        break;
                    }
lbl14:
                    // 2 sources

                    while (true) {
                        var2_4 ^= 914044011;
                        break block22;
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -577846520;
                        break block23;
                        break;
                    }
                    break;
                }
lbl20:
                // 1 sources

                block16: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1103453740;
                    if (true) ** GOTO lbl25
                    block17: while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1970862868;
lbl25:
                        // 8 sources

                        block18: while (true) {
                            switch (var3_3) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block18;
                                    }
                                    break;
                                }
                                case -1979249423: {
                                    ** continue;
                                }
                                case 1932976958: {
                                    break block16;
                                }
lbl34:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -109822331;
                                    ** continue;
                                    break;
                                }
                                case 134348973: {
                                    if (!H.get().isMasterEnabled()) continue block17;
                                    ** continue;
                                }
lbl40:
                                // 1 sources

                                var2_4 = (var1_2 | var4_1) ^ 840306335;
                                ** continue;
                                case -1095063095: {
                                    var2_4 ^= var3_3 ^ 1266218339;
                                    ** continue;
                                }
                                case -773501895: {
                                    v0 = true;
                                    ** GOTO lbl14
                                }
                                case -734877987: {
                                    if (var0.field_1755 instanceof class_408) ** break;
                                    continue block17;
                                    ** continue;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ -142739640;
                ** GOTO lbl25
            }
            var3_3 = (var1_2 | var4_1) ^ 1681886108;
            ** GOTO lbl25
        }
        return v0;
lbl59:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 781892572;
            ** continue;
            break;
        }
        {
            case -1690272647: {
                v0 = false;
                ** continue;
            }
            case 1917394952: {
                var2_4 ^= var3_3 ^ 633401329;
                ** continue;
            }
            ** case 101435744:
        }
lbl69:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static void beginFrame() {
        block16: {
            var3 = 232762009;
            var0_1 = hc.a & 232762009 ^ -1635408085;
            var2_2 = 0;
            ** GOTO lbl36
lbl5:
            // 2 sources

            block9: while (true) {
                switch (var2_2) lbl-1000:
                // 6 sources

                {
                    while (true) {
                        default: {
                            continue block9;
                        }
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ -129553249;
                        ** GOTO lbl-1000
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ -1422811425;
                        ** GOTO lbl-1000
                        break;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ 331243059;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 888025444: {
                        return;
                    }
                    case 1738048292: {
                        var1_3 ^= var2_2 ^ 1652913295;
                        ** continue;
                    }
                    case 40049469: {
                        hc.a.clear();
                        ** continue;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ -1291880841;
                        ** GOTO lbl-1000
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ 2005159732;
                        ** continue;
                        break;
                    }
                    case 317786691: {
                        hc.b.clear();
                        ** continue;
                    }
lbl36:
                    // 1 sources

                    var1_3 = (var0_1 | var3) ^ -816671125;
                    ** continue;
                    case -1939738232: {
                        var1_3 ^= var2_2 ^ 2047023171;
                        break block9;
                    }
                    case -396631921: {
                        var1_3 ^= var2_2 ^ 185005883;
                        break block16;
                    }
                }
                break;
            }
            var2_2 = (var0_1 | var3) ^ -1926322696;
            ** GOTO lbl5
            {
                ** case 757127628:
            }
lbl47:
            // 1 sources

            ** while (true)
        }
        var2_2 = (var0_1 | var3) ^ -1648577402;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static void register(ad var0, float var1_1, float var2_2, float var3_3, float var4_4) {
        var8_5 = -930936659;
        var5_6 = hc.a & -930936659 ^ -1792433571;
        var7_7 = 0;
        ** GOTO lbl67
lbl5:
        // 1 sources

        while (true) {
            var7_7 = (var5_6 | var8_5) ^ 2042750902;
            ** GOTO lbl51
            break;
        }
lbl8:
        // 1 sources

        return;
        while (true) {
            var7_7 = (var5_6 | var8_5) ^ -923453219;
            ** GOTO lbl51
lbl13:
            // 1 sources

            while (true) {
                var7_7 = (var5_6 | var8_5) ^ 2088076366;
                ** GOTO lbl51
                break;
            }
            break;
        }
lbl16:
        // 1 sources

        while (true) {
            var7_7 = (var5_6 | var8_5) ^ -315656269;
            ** GOTO lbl51
lbl19:
            // 1 sources

            while (true) {
                var7_7 = (var5_6 | var8_5) ^ -747462494;
                ** GOTO lbl51
                break;
            }
lbl22:
            // 1 sources

            while (true) {
                hc.a.add(new fE(var0, var1_1, var2_2, var3_3, var4_4));
                ** continue;
                break;
            }
            break;
        }
lbl26:
        // 1 sources

        while (true) {
            var7_7 = (var5_6 | var8_5) ^ -1623977525;
            ** GOTO lbl51
lbl29:
            // 1 sources

            while (true) {
                var6_8 ^= var7_7 ^ 2002554189;
                ** continue;
                break;
            }
            break;
        }
lbl32:
        // 1 sources

        while (true) {
            block29: {
                var7_7 = (var5_6 | var8_5) ^ -131208434;
                ** GOTO lbl51
lbl35:
                // 1 sources

                while (true) {
                    var7_7 = (var5_6 | var8_5) ^ -1835525776;
                    ** GOTO lbl51
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    if (var3_3 <= 0.0f) break block29;
                    var7_7 = (var5_6 | var8_5) ^ 17118527;
                    ** GOTO lbl51
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    var6_8 ^= var7_7 ^ -2028259479;
                    ** continue;
                    break;
                }
            }
lbl46:
            // 2 sources

            while (true) {
                var7_7 = (var5_6 | var8_5) ^ 1768048320;
                ** GOTO lbl51
                break;
            }
            break;
        }
lbl49:
        // 1 sources

        while (true) {
            var7_7 = (var5_6 | var8_5) ^ -1601391177;
lbl51:
            // 11 sources

            block28: while (true) {
                switch (var7_7) {
                    default: {
                        continue block28;
                    }
                    case 814013774: {
                        ** continue;
                    }
                    case 2099715914: {
                        ** continue;
                    }
                    case -1579274573: {
                        ** continue;
                    }
                    case 358519328: {
                        ** continue;
                    }
                    case 249104991: {
                        ** continue;
                    }
                    case 1328788365: {
                        ** continue;
                    }
lbl67:
                    // 1 sources

                    var6_8 = (var5_6 | var8_5) ^ -1913138735;
                    ** continue;
                    case -1536537269: {
                        var6_8 ^= var7_7 ^ -185665760;
                        ** continue;
                    }
                    case 1117764406: {
                        return;
                    }
                    case -592535614: {
                        ** continue;
                    }
                    case 629555699: {
                        if (!(var4_4 <= 0.0f)) ** continue;
                        ** continue;
                    }
                    case -1261835203: 
                }
                break;
            }
            break;
        }
        var6_8 ^= var7_7 ^ 525378437;
        ** while (true)
    }

    private static int Qv(int n2, int n3) {
        int n4 = 1245006410;
        int n5 = 117367327;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x7A3A5D99)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x4EFFD0BA;
        n6 -= (n5 | n4) ^ 0x4EFFF20D;
        n6 ^= (n5 | n4) ^ 0x4EFF28E4;
        n6 -= (n5 | n4) ^ 0x4EFFF834;
        n6 -= (n5 | n4) ^ 0x4EFFB8C5;
        n6 += (n5 | n4) ^ 0x4EFFE65B;
        n6 ^= (n5 | n4) ^ 0x4EFFE30C;
        n6 ^= (n5 | n4) ^ 0x4EFF4DB2;
        n6 ^= (n5 | n4) ^ 0x4EFF0561;
        return n6 -= (n5 | n4) ^ 0x4EFFFB22;
    }

    /*
     * Unable to fully structure code
     */
    public static void registerZone(float var0, float var1_1, float var2_2, float var3_3, S var4_4) {
        block26: {
            block27: {
                block25: {
                    block29: {
                        block28: {
                            break block28;
lbl1:
                            // 1 sources

                            return;
lbl3:
                            // 1 sources

                            while (!(var3_3 <= 0.0f)) {
                                break block25;
                            }
                            break block27;
lbl6:
                            // 1 sources

                            while (true) {
                                var7_7 = (var5_6 | var8_5) ^ -506530037;
lbl8:
                                // 9 sources

                                block18: while (true) {
                                    switch (var7_7) lbl-1000:
                                    // 4 sources

                                    {
                                        default: {
                                            continue block18;
                                        }
                                        case 272874803: {
                                            break;
                                        }
                                        case 472501428: {
                                            ** continue;
                                        }
                                        case -1262136339: {
                                            ** GOTO lbl3
                                        }
lbl18:
                                        // 1 sources

                                        while (true) {
                                            var7_7 = (var5_6 | var8_5) ^ 463341904;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl21:
                                        // 1 sources

                                        while (true) {
                                            var7_7 = (var5_6 | var8_5) ^ 593200416;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                    }
                                    var7_7 = (var5_6 | var8_5) ^ 2132446089;
                                    continue;
                                    {
                                        case -2097303498: {
                                            if (var4_4 != null) break block26;
                                            break block27;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        var8_5 = 1501969306;
                        var5_6 = hc.a & 1501969306 ^ -438093785;
                        var7_7 = 0;
                        break block29;
                        {
                            case -392242599: {
                                if (!(var2_2 <= 0.0f)) {
                                    break;
                                }
                                break block27;
                            }
                            case 223746964: {
                                return;
                            }
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var7_7 = (var5_6 | var8_5) ^ -256827349;
                            ** GOTO lbl8
                            break;
                        }
                        {
                            case -558055777: {
                                var6_8 ^= var7_7 ^ -1765744467;
                                ** continue;
                            }
                        }
                        var7_7 = (var5_6 | var8_5) ^ -220495821;
                        ** GOTO lbl8
                    }
                    var6_8 = (var5_6 | var8_5) ^ 2090339748;
                    var7_7 = (var5_6 | var8_5) ^ 1973864724;
                    ** GOTO lbl8
lbl52:
                    // 1 sources

                    while (true) {
                        var7_7 = (var5_6 | var8_5) ^ 360309222;
                        ** GOTO lbl8
                        break;
                    }
                    {
                        case -428264721: {
                            hc.b.add(new fs(var0, var1_1, var2_2, var3_3, var4_4));
                            ** continue;
                        }
                        case 1620438899: {
                            var6_8 ^= var7_7 ^ 1346818490;
                            ** continue;
                        }
                    }
                }
                var7_7 = (var5_6 | var8_5) ^ -307984756;
                ** GOTO lbl8
            }
            var7_7 = (var5_6 | var8_5) ^ -388887519;
            ** GOTO lbl8
            {
                case 255638412: {
                    var7_7 = (var5_6 | var8_5) ^ 1226991698;
                    ** GOTO lbl-1000
                }
                case 355809182: {
                    var6_8 ^= var7_7 ^ -588555141;
                    ** continue;
                }
                case 1666782673: {
                    var6_8 ^= var7_7 ^ -1557176837;
                    ** continue;
                }
                ** case -2008943957:
            }
lbl78:
            // 1 sources

            var7_7 = (var5_6 | var8_5) ^ -1631703442;
            ** GOTO lbl8
        }
        var7_7 = (var5_6 | var8_5) ^ -1653418804;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static boolean isZoneActive() {
        block17: {
            block16: {
                var3 = -853606225;
                var0_1 = hc.a & -853606225 ^ 941035140;
                var2_2 = 0;
                ** GOTO lbl30
lbl5:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ 531134754;
                    ** GOTO lbl34
                    break;
                }
lbl8:
                // 1 sources

                block10: while (true) {
                    var2_2 = (var0_1 | var3) ^ 2036535721;
lbl10:
                    // 4 sources

                    block11: while (true) {
                        switch (var2_2) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                default: {
                                    continue block11;
                                }
                                break;
                            }
                            case -670392099: {
                                ** continue;
                            }
                            case -1220153469: {
                                if (hc.a == null) ** GOTO lbl25
                                break block10;
                            }
lbl20:
                            // 1 sources

                            return v0;
lbl22:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ 1913904617;
                                ** GOTO lbl-1000
                                break;
                            }
lbl25:
                            // 1 sources

                            var2_2 = (var0_1 | var3) ^ -772063099;
                            ** GOTO lbl-1000
lbl27:
                            // 2 sources

                            while (true) {
                                var1_3 ^= 1044094873;
                                ** continue;
                                break;
                            }
lbl30:
                            // 1 sources

                            var1_3 = (var0_1 | var3) ^ -1953294274;
                            ** continue;
                            case -1894984890: {
                                break block16;
                            }
lbl34:
                            // 1 sources

                            var2_2 = (var0_1 | var3) ^ 1247469868;
                            ** continue;
                            case -654296729: {
                                v0 = false;
                                ** GOTO lbl27
                            }
                            case 753159722: {
                                var1_3 ^= var2_2 ^ -19639978;
                                break block17;
                            }
                        }
                        break;
                    }
                    break;
                }
                var2_2 = (var0_1 | var3) ^ 16000991;
                ** GOTO lbl10
            }
            var2_2 = (var0_1 | var3) ^ 622177906;
            ** GOTO lbl10
        }
        var2_2 = (var0_1 | var3) ^ 606025672;
        ** while (true)
        {
            case -2072240378: {
                v0 = true;
                ** continue;
            }
            ** case -34920080:
        }
lbl54:
        // 1 sources

        var1_3 ^= var2_2 ^ 802895372;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean onMouseScroll(class_310 var0, double var1_1) {
        var12_2 = 1257896906;
        var9_3 = hc.a & 1257896906 ^ 671594561;
        var11_4 = 0;
        var10_9 = (var9_3 | var12_2) ^ -1879132182;
        var11_4 = (var9_3 | var12_2) ^ -1319093533;
        ** GOTO lbl89
lbl7:
        // 1 sources

        while (true) {
            var11_4 = (var9_3 | var12_2) ^ 1863377593;
            ** GOTO lbl62
            break;
        }
lbl-1000:
        // 3 sources

        {
            block51: {
                block52: {
                    switch (var11_4) {
                        case 104632207: {
                            var10_9 ^= var11_4 ^ 1960629129;
                            var11_4 = (var9_3 | var12_2) ^ 149743310;
                            break block51;
                        }
                        case 1645419781: {
                            if (var6_8.contains(var3_5, var4_6)) break;
                            var11_4 = (var9_3 | var12_2) ^ -247566319;
                            break block51;
                        }
                        case 2122337713: {
                            var7_10 = H.get();
                            var10_9 ^= 822892005;
                            var8_11 = var7_10.layoutScale(var6_8.slot());
                            break block52;
                        }
                        case 1642710838: {
                            var10_9 ^= var11_4 ^ -1216085102;
                            var11_4 = (var9_3 | var12_2) ^ 343914106;
                            break block51;
                        }
                        case 871002317: {
                            --var5_7;
                            ** GOTO lbl46
                        }
                        case -1681814566: {
                            var10_9 ^= var11_4 ^ 1206202053;
                            ** break;
lbl34:
                            // 1 sources

                            var11_4 = (var9_3 | var12_2) ^ 1494584070;
                            continue block36;
                        }
                    }
                    var11_4 = (var9_3 | var12_2) ^ 186006781;
                    continue;
                }
                var11_4 = (var9_3 | var12_2) ^ 1582385474;
                ** GOTO lbl136
            }
lbl42:
            // 2 sources

            ** while (true)
        }
lbl43:
        // 1 sources

        while (true) {
            var11_4 = (var9_3 | var12_2) ^ -240531942;
            ** GOTO lbl89
lbl46:
            // 2 sources

            while (true) {
                var11_4 = (var9_3 | var12_2) ^ 1620661751;
                ** GOTO lbl62
                break;
            }
            while (true) {
                var11_4 = (var9_3 | var12_2) ^ -564423212;
                ** GOTO lbl89
lbl52:
                // 1 sources

                while (true) {
                    var11_4 = (var9_3 | var12_2) ^ 1173495398;
                    ** GOTO lbl89
                    break;
                }
                break;
            }
            break;
        }
lbl55:
        // 2 sources

        while (true) {
            var10_9 ^= -2106149620;
            var7_10.setLayoutScale(v0, v1);
            var11_4 = (var9_3 | var12_2) ^ 1592880158;
            if (true) ** GOTO lbl136
            break;
        }
        block43: while (true) {
            var11_4 = (var9_3 | var12_2) ^ 2129991004;
lbl62:
            // 3 sources

            block44: while (true) {
                switch (var11_4) {
                    case 1643646398: {
                        if (var5_7 < 0) continue block43;
                        ** continue;
                    }
                    case 204068086: {
                        var6_8 = (fE)hc.a.get(var5_7);
                        ** break;
                    }
                    case 99555698: {
                        var10_9 ^= var11_4 ^ -1133786738;
                        ** break;
                    }
                    case 336260759: {
                        var10_9 ^= var11_4 ^ 172227563;
                        var11_4 = (var9_3 | var12_2) ^ -384441985;
                        ** GOTO lbl84
                    }
lbl77:
                    // 1 sources

                    var11_4 = (var9_3 | var12_2) ^ 1824748612;
                    ** GOTO lbl42
lbl79:
                    // 1 sources

                    var11_4 = (var9_3 | var12_2) ^ 1725312829;
                    continue block44;
                    case 174501436: {
                        var10_9 ^= var11_4 ^ 489064409;
                        var11_4 = (var9_3 | var12_2) ^ 185071221;
                    }
lbl84:
                    // 3 sources

                    default: {
                        continue block44;
                    }
lbl86:
                    // 1 sources

                    while (true) {
                        var5_7 = hc.a.size() - 1;
                        ** continue;
                        break;
                    }
lbl89:
                    // 4 sources

                    block46: while (true) {
                        switch (var11_4) {
                            case -1628548078: {
                                var3_5 = (float)var0.field_1729.method_1603();
                                var10_9 ^= -348682719;
                                ** GOTO lbl118
                            }
                            case -1264292321: {
                                var10_9 ^= var11_4 ^ 12980627;
                                ** GOTO lbl126
                            }
                            case 789439917: {
                                ** GOTO lbl116
                            }
                            case -905218883: {
                                if (hc.isEditMode(var0)) {
                                    ** continue;
                                }
                                ** GOTO lbl112
                            }
                            case 1885255020: {
                                if (var1_1 != 0.0) ** continue;
                                ** break;
                            }
                            case 399954350: {
                                var10_9 ^= var11_4 ^ 1226480546;
                                var11_4 = (var9_3 | var12_2) ^ -1594585226;
                            }
                            default: {
                                continue block46;
                            }
lbl112:
                            // 2 sources

                            var11_4 = (var9_3 | var12_2) ^ -1951213445;
                            continue block46;
                            case -610287320: {
                                ** GOTO lbl124
                            }
lbl116:
                            // 1 sources

                            var11_4 = (var9_3 | var12_2) ^ 446779047;
                            continue block46;
lbl118:
                            // 1 sources

                            var4_6 = (float)var0.field_1729.method_1604();
                            var10_9 ^= 2053621730;
                            ** continue;
                            case -515038288: {
                                var10_9 ^= var11_4 ^ 1479573230;
                                ** continue;
                            }
lbl124:
                            // 1 sources

                            var11_4 = (var9_3 | var12_2) ^ 2099849829;
                            continue block46;
lbl126:
                            // 1 sources

                            var11_4 = (var9_3 | var12_2) ^ -200167463;
                            continue block46;
                            case -1688846895: 
                        }
                        break;
                    }
                    return false;
lbl130:
                    // 1 sources

                    while (true) {
                        var11_4 = (var9_3 | var12_2) ^ 1555817656;
                        ** GOTO lbl136
                        break;
                    }
lbl133:
                    // 1 sources

                    while (true) {
                        v1 = var8_11 * 1.08f;
                        ** GOTO lbl55
                        break;
                    }
lbl136:
                    // 3 sources

                    block49: while (true) {
                        switch (var11_4) {
                            default: {
                                continue block49;
                            }
                            case 228351235: {
                                v0 = var6_8.slot();
                                if (!(var1_1 > 0.0)) ** GOTO lbl153
                                ** GOTO lbl160
                            }
                            case 910434163: {
                                var10_9 ^= var11_4 ^ -1392268228;
                                ** GOTO lbl162
                            }
                            case 2095356246: {
                                dm.requestSave();
                                ** continue;
                            }
                            case 873371605: {
                                var10_9 ^= var11_4 ^ -1951260470;
                                ** GOTO lbl164
                            }
lbl153:
                            // 1 sources

                            var10_9 ^= -1699066215;
                            v1 = var8_11 / 1.08f;
                            ** continue;
                            case 883864201: {
                                var10_9 ^= var11_4 ^ -1902625908;
                                var11_4 = (var9_3 | var12_2) ^ 1734584008;
                                continue block49;
                            }
lbl160:
                            // 1 sources

                            var10_9 ^= -1699066215;
                            ** continue;
lbl162:
                            // 1 sources

                            var11_4 = (var9_3 | var12_2) ^ 280045972;
                            continue block49;
lbl164:
                            // 1 sources

                            var11_4 = (var9_3 | var12_2) ^ 370893469;
                            continue block49;
                            case 2051986015: 
                        }
                        break;
                    }
                    return true;
                    case -2081809740: 
                }
                break;
            }
            break;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    static {
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
    public static void processInput(class_310 var0) {
        block122: {
            var11_1 = -411857836;
            var8_2 = hc.a & -411857836 ^ 2051546055;
            var10_3 = 0;
            var9_11 = (var8_2 | var11_1) ^ 1662176131;
            var10_3 = (var8_2 | var11_1) ^ 802777356;
            ** GOTO lbl308
lbl7:
            // 1 sources

            while (true) {
                var10_3 = (var8_2 | var11_1) ^ -2054799316;
                ** GOTO lbl41
                break;
            }
lbl10:
            // 2 sources

            while (true) {
                var3_6 = v0;
                var10_3 = (var8_2 | var11_1) ^ 1871716017;
                if (true) ** GOTO lbl347
                break;
            }
            block99: while (true) {
                switch (var10_3) {
                    case 1745917626: {
                        var2_5 = var0.field_1755 instanceof class_408;
                        ** break;
                    }
                    case -1037342849: {
                        var9_11 ^= var10_3 ^ -101635964;
                        var10_3 = (var8_2 | var11_1) ^ 549716755;
                        ** GOTO lbl37
                    }
                    case -551857554: {
                        var9_11 ^= var10_3 ^ 369016391;
                        var10_3 = (var8_2 | var11_1) ^ -1644737793;
                        ** GOTO lbl37
                    }
                    case -2070138394: {
                        var9_11 ^= var10_3 ^ -926241047;
                        ** break;
lbl30:
                        // 1 sources

                        var10_3 = (var8_2 | var11_1) ^ -1754592915;
                        continue block99;
                    }
lbl32:
                    // 1 sources

                    var10_3 = (var8_2 | var11_1) ^ -1750851814;
                    ** GOTO lbl-1000
                    case 1653396776: {
                        if (var1_4.method_4490() == 0L) ** GOTO lbl39
                        var10_3 = (var8_2 | var11_1) ^ 2078780977;
                    }
lbl37:
                    // 4 sources

                    default: {
                        continue block99;
                    }
lbl39:
                    // 1 sources

                    var10_3 = (var8_2 | var11_1) ^ 1028716712;
                    continue block99;
lbl41:
                    // 1 sources

                    block100: while (true) {
                        switch (var10_3) {
                            case -1255617168: {
                                var9_11 ^= var10_3 ^ -1090057474;
                                ** break;
                            }
                            case 93793688: {
                                ** GOTO lbl111
                            }
                            case -1367593456: {
                                var9_11 ^= var10_3 ^ -1660109475;
                                ** GOTO lbl247
                            }
                            case -1728959405: {
                                var9_11 ^= var10_3 ^ 1086398858;
                                ** GOTO lbl192
                            }
                            case 1199443571: {
                                hc.c = false;
                                hc.a = false;
                                ** break;
                            }
                            case -988302282: {
                                hc.a = null;
                                ** GOTO lbl230
                            }
                            case 1623086305: {
                                var9_11 ^= var10_3 ^ -70379281;
                                var10_3 = (var8_2 | var11_1) ^ 279883159;
                                ** GOTO lbl228
                            }
                            case 1961391194: {
                                hc.a.on(var4_7, var5_8, kf.d);
                                ** GOTO lbl197
                            }
                            case 235287809: {
                                if (!var3_6) {
                                    ** continue;
                                }
                                ** GOTO lbl186
                            }
lbl72:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -238678169;
                            ** GOTO lbl228
                            case 1912467544: {
                                if (hc.a == null) ** GOTO lbl197
                                ** GOTO lbl91
                            }
                            case -158230544: {
                                ** GOTO lbl109
                            }
                            case -1722854152: {
                                ** GOTO lbl113
                            }
lbl81:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -1614427338;
                            continue block100;
                            case 239268006: {
                                hc.b = var3_6;
                                ** GOTO lbl237
                            }
                            case 247304368: {
                                hc.a = null;
                                ** GOTO lbl150
                            }
                            case 405958113: {
                                ** GOTO lbl221
                            }
lbl91:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ 2116513553;
                            continue block100;
                            case -1368363: {
                                var9_11 ^= var10_3 ^ -1127007992;
                                var10_3 = (var8_2 | var11_1) ^ -80995967;
                                continue block100;
                            }
                            case -347490995: {
                                if (!var3_6) ** GOTO lbl176
                                ** GOTO lbl134
                            }
                            case -534015215: {
                                if (hc.b) ** GOTO lbl176
                                ** GOTO lbl136
                            }
                            case 2063458299: {
                                ** GOTO lbl199
                            }
                            case -1012698468: {
                                var9_11 ^= var10_3 ^ -770200162;
                                var10_3 = (var8_2 | var11_1) ^ -1207594588;
                                ** GOTO lbl228
                            }
lbl109:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -1458639305;
                            continue block100;
lbl111:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -543698352;
                            continue block100;
lbl113:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -1031484524;
                            continue block100;
                            case -271240640: {
                                dm.save();
                                ** GOTO lbl186
                            }
                            case -135128134: {
                                var9_11 ^= var10_3 ^ 1388857672;
                                ** GOTO lbl163
                            }
                            case -1321644143: {
                                var10_3 = (var8_2 | var11_1) ^ 525339846;
                                continue block100;
                            }
                            case -12129417: {
                                var9_11 ^= var10_3 ^ -32234193;
                                ** GOTO lbl132
                            }
                            case 217015736: {
                                if (hc.b) {
                                    var10_3 = (var8_2 | var11_1) ^ 4027552;
                                    continue block100;
                                }
                                ** GOTO lbl186
                            }
lbl132:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -664571815;
                            continue block100;
lbl134:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ 1313001542;
                            continue block100;
lbl136:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -414584266;
                            continue block100;
                            case 1450537440: {
                                hc.drag(var4_7, var5_8, var6_9, var7_10);
                                ** GOTO lbl249
                            }
                            case -380090597: {
                                var10_3 = (var8_2 | var11_1) ^ 1890359218;
                                ** GOTO lbl228
                            }
                            case 1040143427: {
                                if (!(var7_10 > 0.0f)) ** GOTO lbl249
                                ** GOTO lbl178
                            }
                            case 1089452984: {
                                if (!var3_6) ** GOTO lbl197
                                ** GOTO lbl251
                            }
lbl150:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ 1020849483;
                            continue block100;
                            case 202985896: {
                                var9_11 ^= var10_3 ^ 935792141;
                                ** GOTO lbl211
                            }
                            case -1881733019: {
                                if (var3_6) {
                                    var10_3 = (var8_2 | var11_1) ^ -85151153;
                                    continue block100;
                                }
                                ** GOTO lbl249
                            }
                            case 1887083473: {
                                var9_11 ^= var10_3 ^ 920592656;
                                ** GOTO lbl172
                            }
lbl163:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -1903792241;
                            continue block100;
                            case 703323529: {
                                if (hc.a != null) ** GOTO lbl249
                                ** GOTO lbl205
                            }
                            case 205701464: {
                                hc.b = null;
                                var10_3 = (var8_2 | var11_1) ^ 1246974631;
                                ** GOTO lbl228
                            }
lbl172:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -1311994925;
                            continue block100;
                            case 2110965733: {
                                hc.Qw(var4_7, var5_8);
lbl176:
                                // 3 sources

                                var10_3 = (var8_2 | var11_1) ^ 143230061;
                                continue block100;
                            }
lbl178:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ 166332455;
                            continue block100;
                            case -1705357864: {
                                var9_11 ^= var10_3 ^ -1693940864;
                                var10_3 = (var8_2 | var11_1) ^ -129012216;
                                continue block100;
                            }
                            case 120910303: {
                                if (hc.b != null) ** GOTO lbl223
lbl186:
                                // 4 sources

                                var10_3 = (var8_2 | var11_1) ^ -211628417;
                                continue block100;
                            }
                            case 2023796259: {
                                var10_3 = (var8_2 | var11_1) ^ -695188898;
                                continue block100;
                            }
lbl192:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ 980167649;
                            continue block100;
                            case -2124615482: {
                                var10_3 = (var8_2 | var11_1) ^ -1080810385;
                                continue block100;
                            }
lbl197:
                            // 3 sources

                            var10_3 = (var8_2 | var11_1) ^ -1895758842;
                            continue block100;
lbl199:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -208340369;
                            continue block100;
                            case -1161593337: {
                                var9_11 ^= var10_3 ^ 975710853;
                                var10_3 = (var8_2 | var11_1) ^ -214344049;
                                continue block100;
                            }
lbl205:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ 371448012;
                            continue block100;
                            case -60731662: {
                                hc.a.on(var4_7, var5_8, kf.f);
                                var10_3 = (var8_2 | var11_1) ^ 1737077636;
                                continue block100;
                            }
lbl211:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -247894159;
                            continue block100;
                            case -408119396: {
                                var10_3 = (var8_2 | var11_1) ^ -1953240179;
                                continue block100;
                            }
                            case 552357255: {
                                if (var6_9 > 0.0f) {
                                    var10_3 = (var8_2 | var11_1) ^ 1714735919;
                                    continue block100;
                                }
                                ** GOTO lbl249
                            }
lbl221:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -2102831054;
                            continue block100;
lbl223:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ 1169744336;
                            continue block100;
                            case 655945614: {
                                if (hc.a == null) ** GOTO lbl230
                                var10_3 = (var8_2 | var11_1) ^ 977904929;
                            }
lbl228:
                            // 7 sources

                            default: {
                                continue block100;
                            }
lbl230:
                            // 2 sources

                            var10_3 = (var8_2 | var11_1) ^ 1696715279;
                            continue block100;
                            case 1320621060: {
                                if (hc.b != null) {
                                    var10_3 = (var8_2 | var11_1) ^ -2015677964;
                                    continue block100;
                                }
                                ** GOTO lbl249
                            }
lbl237:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ 9470210;
                            continue block100;
                            case -986563850: {
                                var9_11 ^= var10_3 ^ 486618927;
                                var10_3 = (var8_2 | var11_1) ^ 52089125;
                                continue block100;
                            }
                            case -188373567: {
                                var9_11 ^= var10_3 ^ 2060575615;
                                var10_3 = (var8_2 | var11_1) ^ 338832026;
                                continue block100;
                            }
lbl247:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -243422506;
                            continue block100;
lbl249:
                            // 6 sources

                            var10_3 = (var8_2 | var11_1) ^ 1359458759;
                            continue block100;
lbl251:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ 416745547;
                            continue block100;
lbl253:
                            // 1 sources

                            while (true) {
                                var10_3 = (var8_2 | var11_1) ^ 2124031761;
                                ** GOTO lbl308
                                break;
                            }
lbl256:
                            // 1 sources

                            while (true) {
                                var9_11 ^= -1882745852;
                                var7_10 = var1_4.method_4507();
                                var10_3 = (var8_2 | var11_1) ^ 197016086;
                                continue block100;
                                break;
                            }
lbl261:
                            // 1 sources

                            while (true) {
                                var10_3 = (var8_2 | var11_1) ^ 239640974;
                                ** GOTO lbl283
                                break;
                            }
                            while (true) {
                                var10_3 = (var8_2 | var11_1) ^ -1256248696;
                                ** GOTO lbl308
                                break;
                            }
                            case 72844886: 
                        }
                        break;
                    }
                    return;
                    while (true) {
                        var10_3 = (var8_2 | var11_1) ^ 363515131;
                        ** GOTO lbl283
                        break;
                    }
lbl272:
                    // 1 sources

                    while (true) {
                        var10_3 = (var8_2 | var11_1) ^ -898388852;
                        ** GOTO lbl347
lbl275:
                        // 1 sources

                        while (true) {
                            var10_3 = (var8_2 | var11_1) ^ -597559354;
                            ** GOTO lbl347
                            break;
                        }
                        break;
                    }
lbl278:
                    // 1 sources

                    while (true) {
                        var5_8 = (float)var0.field_1729.method_1604();
                        var9_11 ^= -278491189;
                        var6_9 = var1_4.method_4480();
                        ** continue;
                        break;
                    }
lbl283:
                    // 2 sources

                    while (true) lbl-1000:
                    // 4 sources

                    {
                        switch (var10_3) {
                            case 400933004: {
                                v0 = true;
                                break block122;
                            }
                            case 1163485728: {
                                if (GLFW.glfwGetMouseButton((long)var1_4.method_4490(), (int)0) != 1) ** continue;
                                ** continue;
                            }
                            case -355380436: {
                                var9_11 ^= var10_3 ^ -1837348642;
                                var10_3 = (var8_2 | var11_1) ^ 1181307414;
                                break;
                            }
                            case 1759477965: {
                                var9_11 ^= var10_3 ^ -1975840409;
                                ** GOTO lbl306
                            }
                            case -1189950015: {
                                v0 = false;
                                break block122;
                            }
                            case -248299943: {
                                var9_11 ^= var10_3 ^ -1986124373;
                                ** break;
lbl304:
                                // 1 sources

                                var10_3 = (var8_2 | var11_1) ^ -392274085;
                            }
                        }
                        continue;
lbl306:
                        // 1 sources

                        var10_3 = (var8_2 | var11_1) ^ -1172111881;
                    }
lbl308:
                    // 3 sources

                    block110: while (true) {
                        switch (var10_3) {
                            case -794626341: {
                                ** GOTO lbl334
                            }
                            case -361916421: {
                                var9_11 ^= var10_3 ^ -1270473272;
                                ** GOTO lbl327
                            }
                            case -1519152763: {
                                var9_11 ^= var10_3 ^ -255328988;
                                ** break;
                            }
                            case 1248114015: {
                                var9_11 ^= var10_3 ^ -92105562;
                                ** GOTO lbl336
                            }
                            case 1714317055: {
                                hc.Qx();
                                var10_3 = (var8_2 | var11_1) ^ 353765420;
                                ** GOTO lbl328
                            }
lbl325:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -997996893;
                            ** GOTO lbl328
lbl327:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -2018923789;
lbl328:
                            // 4 sources

                            default: {
                                continue block110;
                            }
                            case -2115913530: {
                                var1_4 = var0.method_22683();
                                var10_3 = (var8_2 | var11_1) ^ 543215033;
                                continue block99;
                            }
lbl334:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ 1510477394;
                            continue block110;
lbl336:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -1722418904;
                            continue block110;
                            case -169415801: {
                                var9_11 ^= var10_3 ^ 559313692;
                                ** continue;
                            }
                            case 1006131572: {
                                if (!H.get().isMasterEnabled()) ** continue;
                                var10_3 = (var8_2 | var11_1) ^ 178091088;
                                continue block110;
                            }
                            case 2027042084: 
                        }
                        break;
                    }
                    return;
lbl347:
                    // 3 sources

                    block111: while (true) {
                        switch (var10_3) {
                            case -1863614106: {
                                var9_11 ^= var10_3 ^ -194474444;
                                ** break;
                            }
                            case -949864591: {
                                if (var2_5) ** GOTO lbl402
                                ** GOTO lbl384
                            }
                            case 1116397934: {
                                var9_11 ^= var10_3 ^ 0x1E10E000;
                                ** GOTO lbl380
                            }
                            case 889729883: {
                                if (hc.b != null) {
                                    ** continue;
                                }
                                ** GOTO lbl382
                            }
                            case 1045966224: {
                                hc.b = var3_6;
                                ** GOTO lbl393
                            }
                            case -337420127: {
                                var4_7 = (float)var0.field_1729.method_1603();
                                ** GOTO lbl386
                            }
                            case 1936168181: {
                                dm.save();
                                ** break;
                            }
                            case 1247346204: {
                                var9_11 ^= var10_3 ^ -937958551;
                                ** continue;
                            }
                            case -860574162: {
                                var9_11 ^= var10_3 ^ -1526729975;
                                var10_3 = (var8_2 | var11_1) ^ -1054625209;
                                ** GOTO lbl391
                            }
lbl378:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ 941205670;
                            ** GOTO lbl391
lbl380:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ 720721089;
                            ** GOTO lbl391
lbl382:
                            // 2 sources

                            var10_3 = (var8_2 | var11_1) ^ -488642725;
                            continue block111;
lbl384:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -1255972405;
                            continue block111;
lbl386:
                            // 1 sources

                            var9_11 ^= -878662850;
                            ** continue;
                            case 497318028: {
                                var9_11 ^= var10_3 ^ 554177381;
                                var10_3 = (var8_2 | var11_1) ^ -1312880190;
                            }
lbl391:
                            // 5 sources

                            default: {
                                continue block111;
                            }
lbl393:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ -1108246855;
                            continue block111;
                            case 1321506325: {
                                hc.Qx();
                                var10_3 = (var8_2 | var11_1) ^ 869216761;
                                continue block111;
                            }
                            case 588933137: {
                                var10_3 = (var8_2 | var11_1) ^ -1944319198;
                                continue block111;
                            }
lbl402:
                            // 1 sources

                            var10_3 = (var8_2 | var11_1) ^ 17375455;
                            continue block111;
                            case -26034424: {
                                var9_11 ^= var10_3 ^ 1750837462;
                                var10_3 = (var8_2 | var11_1) ^ 345571190;
                                continue block111;
                            }
                            case -712062186: 
                        }
                        break;
                    }
                    return;
                    case -541090620: 
                }
                break;
            }
            return;
        }
        block112: while (true) {
            switch (var9_11) {
                default: {
                    var9_11 ^= 1250849402;
                    ** GOTO lbl10
                }
                case -888853713: {
                    var9_11 ^= 1655248933;
                    continue block112;
                }
                case 450498725: 
            }
            break;
        }
        var9_11 ^= 1789787653;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static void Qw(float var0, float var1_1) {
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
    private static void drag(float var0, float var1_1, float var2_2, float var3_3) {
        block210: {
            var27_4 = 2015063486;
            var24_5 = hc.a & 2015063486 ^ 531263119;
            var26_6 = 0;
            var25_11 = (var24_5 | var27_4) ^ 132254833;
            var26_6 = (var24_5 | var27_4) ^ 1673476003;
            ** GOTO lbl486
            while (true) {
                var26_6 = (var24_5 | var27_4) ^ -1530599711;
                ** GOTO lbl273
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var26_6 = (var24_5 | var27_4) ^ -13096422;
                break block210;
lbl13:
                // 1 sources

                while (true) {
                    var26_6 = (var24_5 | var27_4) ^ 1598662858;
                    ** GOTO lbl65
                    break;
                }
                while (true) {
                    var26_6 = (var24_5 | var27_4) ^ -720825780;
                    ** GOTO lbl65
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var26_6 = (var24_5 | var27_4) ^ -1667057172;
                    ** GOTO lbl549
                    break;
                }
lbl22:
                // 1 sources

                while (true) {
                    var17_21 = var13_17.h() + var9_13 * 2.0f;
                    var25_11 ^= 686367889;
                    var18_22 = var4_7 + hc.a - var14_18;
                    var25_11 ^= -1812829977;
                    var19_23 = var14_18 + var16_20 - var4_7;
                    var25_11 ^= 1892267058;
                    var20_24 = var5_8 + hc.e - var15_19;
                    var25_11 ^= -2024837811;
                    var21_25 = var15_19 + var17_21 - var5_8;
                    var26_6 = (var24_5 | var27_4) ^ -235627969;
                    ** GOTO lbl591
                    break;
                }
                break;
            }
lbl34:
            // 1 sources

            while (true) {
                var26_6 = (var24_5 | var27_4) ^ 1093135298;
                ** GOTO lbl273
                break;
            }
            while (true) {
                var26_6 = (var24_5 | var27_4) ^ 1571857918;
                break block210;
lbl40:
                // 1 sources

                while (true) {
                    var25_11 ^= -1427542608;
                    var15_19 = var13_17.y() - var9_13;
                    var25_11 ^= -1708146252;
                    var16_20 = var13_17.w() + var9_13 * 2.0f;
                    var25_11 ^= -2136680136;
                    ** continue;
                    break;
                }
                break;
            }
lbl47:
            // 1 sources

            while (true) {
                var26_6 = (var24_5 | var27_4) ^ 744184213;
                ** GOTO lbl502
                break;
            }
            while (true) {
                var26_6 = (var24_5 | var27_4) ^ 1959295525;
                ** GOTO lbl157
                break;
            }
lbl53:
            // 1 sources

            while (true) {
                var26_6 = (var24_5 | var27_4) ^ 1685775567;
                ** GOTO lbl273
                break;
            }
lbl56:
            // 1 sources

            while (true) {
                var26_6 = (var24_5 | var27_4) ^ -1702318040;
                ** GOTO lbl237
                break;
            }
lbl59:
            // 1 sources

            while (true) {
                var26_6 = (var24_5 | var27_4) ^ -1467360610;
                ** GOTO lbl273
                break;
            }
            while (true) {
                var26_6 = (var24_5 | var27_4) ^ 963163483;
                break block210;
lbl65:
                // 2 sources

                block157: while (true) {
                    switch (var26_6) {
                        case -257119705: {
                            ** break;
                        }
                        case -1431142925: {
                            var26_6 = (var24_5 | var27_4) ^ -1005604495;
                            ** GOTO lbl121
                        }
                        case -1145774386: {
                            if (Math.abs(var5_8 + hc.e / 2.0f - var3_3 / 2.0f) > 0.5f) {
                                ** continue;
                            }
                            ** GOTO lbl149
                        }
                        case 1082904326: {
                            ** GOTO lbl142
                        }
lbl78:
                        // 1 sources

                        var26_6 = (var24_5 | var27_4) ^ 789327784;
                        continue block157;
                        case 552781685: {
                            ** GOTO lbl123
                        }
                        case 437102413: {
                            if (!(Math.abs(var4_7 + hc.a / 2.0f - var2_2 / 2.0f) > 0.5f)) ** GOTO lbl140
                            ** GOTO lbl131
                        }
                        case -858786541: {
                            if (!hc.a) ** GOTO lbl140
                            ** GOTO lbl138
                        }
                        case 1097838439: {
                            var11_15 = false;
                            ** break;
                        }
                        case -695830939: {
                            if (var10_14 >= 3) ** GOTO lbl182
                            var26_6 = (var24_5 | var27_4) ^ 1052065204;
                            ** GOTO lbl121
                        }
                        case 1091457547: {
                            var25_11 ^= var26_6 ^ -100560249;
                            var26_6 = (var24_5 | var27_4) ^ 1054130392;
                            continue block157;
                        }
                        case -2091567144: {
                            hc.c = false;
                            ** GOTO lbl149
                        }
                        case -1355104279: {
                            var25_11 ^= var26_6 ^ 476528059;
                            var26_6 = (var24_5 | var27_4) ^ 1060151481;
                            continue block157;
                        }
                        case 692878073: {
                            var25_11 ^= var26_6 ^ -142826012;
                            ** GOTO lbl125
                        }
lbl109:
                        // 1 sources

                        var25_11 ^= -1278573277;
                        var12_16 = 0;
                        ** break;
                        case 1870332539: {
                            var25_11 ^= var26_6 ^ -160117181;
                            var26_6 = (var24_5 | var27_4) ^ -1455613478;
                            ** GOTO lbl121
                        }
                        case 2132684277: {
                            ** GOTO lbl133
                        }
                        case 1219566536: {
                            var25_11 ^= var26_6 ^ -1438851642;
                            var26_6 = (var24_5 | var27_4) ^ 537472823;
                        }
lbl121:
                        // 5 sources

                        default: {
                            continue block157;
                        }
lbl123:
                        // 1 sources

                        var26_6 = (var24_5 | var27_4) ^ -51488665;
                        continue block157;
lbl125:
                        // 1 sources

                        var26_6 = (var24_5 | var27_4) ^ 1954880381;
                        continue block157;
                        case 1445525145: {
                            var25_11 ^= var26_6 ^ 1140238449;
                            var26_6 = (var24_5 | var27_4) ^ -1284203860;
                            continue block157;
                        }
lbl131:
                        // 1 sources

                        var26_6 = (var24_5 | var27_4) ^ -1894267496;
                        continue block157;
lbl133:
                        // 1 sources

                        var26_6 = (var24_5 | var27_4) ^ 1706477810;
                        continue block157;
                        case 1354186775: {
                            hc.a = false;
                            ** GOTO lbl140
                        }
lbl138:
                        // 1 sources

                        var26_6 = (var24_5 | var27_4) ^ 10830410;
                        continue block157;
lbl140:
                        // 3 sources

                        var26_6 = (var24_5 | var27_4) ^ 923432055;
                        continue block157;
lbl142:
                        // 1 sources

                        var25_11 ^= 1968998772;
                        var25_11 ^= 278877836;
                        H.get().setLayoutPixel(hc.b, Math.round(var4_7), Math.round(var5_8), Math.round(var2_2), Math.round(var3_3), Math.round(hc.a), Math.round(hc.e));
                        var26_6 = (var24_5 | var27_4) ^ 1459033414;
                        continue block157;
                        case 1605517448: {
                            if (hc.c) ** continue;
lbl149:
                            // 3 sources

                            var26_6 = (var24_5 | var27_4) ^ -796798890;
                            continue block157;
                        }
lbl151:
                        // 2 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 1026546355;
                            ** GOTO lbl273
                            break;
                        }
lbl154:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 1298545851;
                            break block210;
lbl157:
                            // 2 sources

                            block160: while (true) {
                                switch (var26_6) {
                                    default: {
                                        continue block160;
                                    }
                                    case -1634965278: {
                                        var13_17 = (fE)hc.a.get(var12_16);
                                        ** GOTO lbl188
                                    }
                                    case 1223299028: {
                                        if (var11_15) ** continue;
                                        ** break;
                                    }
                                    case 99083200: {
                                        var25_11 ^= var26_6 ^ 1433308541;
                                        ** GOTO lbl172
                                    }
lbl170:
                                    // 1 sources

                                    var26_6 = (var24_5 | var27_4) ^ 61619972;
                                    continue block160;
lbl172:
                                    // 1 sources

                                    var26_6 = (var24_5 | var27_4) ^ 1326467238;
                                    continue block160;
                                    case 1091114245: {
                                        ** GOTO lbl182
                                    }
                                    case 1892644470: {
                                        ++var10_14;
                                        ** GOTO lbl516
                                    }
                                    case -2132324106: {
                                        var25_11 ^= var26_6 ^ 793706022;
                                        ** GOTO lbl201
                                    }
lbl182:
                                    // 2 sources

                                    var26_6 = (var24_5 | var27_4) ^ 697538854;
                                    continue block157;
                                    case 2081902779: {
                                        var25_11 ^= var26_6 ^ -1361295821;
                                        var26_6 = (var24_5 | var27_4) ^ 1051884218;
                                        continue block160;
                                    }
lbl188:
                                    // 1 sources

                                    var26_6 = (var24_5 | var27_4) ^ -1136925154;
                                    ** GOTO lbl237
                                    case 816523033: {
                                        if (var12_16 < hc.a.size()) {
                                            var26_6 = (var24_5 | var27_4) ^ -10731703;
                                            continue block160;
                                        }
                                        ** GOTO lbl199
                                    }
                                    case 192091546: {
                                        var25_11 ^= var26_6 ^ 1085787946;
                                        var26_6 = (var24_5 | var27_4) ^ 259267017;
                                        continue block160;
                                    }
lbl199:
                                    // 1 sources

                                    var26_6 = (var24_5 | var27_4) ^ 1844505594;
                                    continue block160;
lbl201:
                                    // 1 sources

                                    var26_6 = (var24_5 | var27_4) ^ -516487331;
                                    continue block160;
                                    case 306938949: 
                                }
                                var25_11 ^= var26_6 ^ -1731413537;
                                var26_6 = (var24_5 | var27_4) ^ 928079979;
                                continue;
                                break;
                            }
                            break;
                        }
lbl207:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ -1867631763;
                            break block210;
lbl210:
                            // 1 sources

                            while (true) {
                                var26_6 = (var24_5 | var27_4) ^ 1312214641;
                                ** GOTO lbl237
                                break;
                            }
lbl213:
                            // 1 sources

                            while (true) {
                                var26_6 = (var24_5 | var27_4) ^ -1437180078;
                                break block210;
                                break;
                            }
                            break;
                        }
lbl216:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 103295367;
                            ** GOTO lbl273
                            break;
                        }
lbl219:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ -1867810984;
                            break block210;
                            break;
                        }
lbl222:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ -651788551;
                            ** GOTO lbl273
                            break;
                        }
lbl225:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 814631336;
                            ** GOTO lbl549
                            break;
                        }
lbl228:
                        // 1 sources

                        while (true) {
                            var25_11 ^= 528693354;
                            var6_9 = Math.max(5.0f, var3_3 * 0.006f);
                            var25_11 ^= 2133468774;
                            var7_10 = Math.max(6.0f, var3_3 * 0.008f);
                            ** continue;
                            break;
                        }
lbl234:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 622587273;
                            if (true) ** GOTO lbl273
                            break;
                        }
lbl237:
                        // 4 sources

                        block170: while (true) {
                            switch (var26_6) {
                                case -449585257: {
                                    var14_18 = var13_17.x() - var9_13;
                                    ** continue;
                                }
                                case -104160630: {
                                    var25_11 ^= var26_6 ^ 1555255304;
                                    ** continue;
                                }
                                case 831365582: {
                                    ++var12_16;
                                    ** break;
                                }
                                case 521240224: {
                                    ** GOTO lbl592
                                }
                                case 127476277: {
                                    var25_11 ^= var26_6 ^ -1082642053;
                                    ** continue;
                                }
lbl253:
                                // 2 sources

                                var26_6 = (var24_5 | var27_4) ^ 2052885631;
                                ** continue;
                                case -1014986335: {
                                    var25_11 ^= var26_6 ^ 203683467;
                                    break;
                                }
                                case 1950419740: {
                                    if (var13_17.slot() == hc.b) {
                                        var26_6 = (var24_5 | var27_4) ^ -731056258;
                                        continue block170;
                                    }
                                    var26_6 = (var24_5 | var27_4) ^ 2015513994;
                                    continue block170;
                                }
                                case -1411934015: {
                                    var25_11 ^= var26_6 ^ 1043191044;
                                    var26_6 = (var24_5 | var27_4) ^ 1621758239;
                                }
                                default: {
                                    continue block170;
                                }
                            }
                            var26_6 = (var24_5 | var27_4) ^ 200959139;
                            continue;
                            break;
                        }
                        block171: while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 721796162;
lbl273:
                            // 9 sources

                            block172: while (true) {
                                switch (var26_6) {
                                    case 946324754: {
                                        var25_11 ^= var26_6 ^ 1739584700;
                                        ** GOTO lbl381
                                    }
                                    case -776844443: {
                                        var4_7 = var7_10;
                                        ** GOTO lbl388
                                    }
                                    case -1171079243: {
                                        var4_7 = var2_2 - var7_10 - hc.a;
                                        ** GOTO lbl415
                                    }
                                    case -1324119938: {
                                        if (Math.abs(var4_7 + hc.a - (var2_2 - var7_10)) <= var6_9) {
                                            var26_6 = (var24_5 | var27_4) ^ 1931092834;
                                            continue block172;
                                        }
                                        ** GOTO lbl415
                                    }
                                    case 993170200: {
                                        v0 = false;
                                        ** GOTO lbl361
                                    }
                                    case -260386989: {
                                        var5_8 = var7_10;
                                        ** GOTO lbl398
                                    }
                                    case -1037971470: {
                                        var25_11 ^= var26_6 ^ -1678515676;
                                        ** break;
                                    }
                                    case 550205515: {
                                        var25_11 ^= var26_6 ^ 2053896823;
                                        ** GOTO lbl379
                                    }
                                    case 269890823: {
                                        v0 = true;
                                        ** GOTO lbl361
                                    }
                                    case 1117041932: {
                                        ** GOTO lbl346
                                    }
                                    case 953133118: {
                                        var25_11 ^= var26_6 ^ 982305218;
                                        ** GOTO lbl426
                                    }
                                    case -684542687: {
                                        v1 = true;
                                        ** GOTO lbl430
                                    }
                                    case 477794418: {
                                        ** break;
                                    }
                                    case 855692428: {
                                        var8_12 = Math.max(24.0f, var3_3 * 0.03f);
                                        ** GOTO lbl403
                                    }
lbl317:
                                    // 1 sources

                                    var26_6 = (var24_5 | var27_4) ^ 746575247;
                                    continue block172;
lbl319:
                                    // 1 sources

                                    var26_6 = (var24_5 | var27_4) ^ 1873631928;
                                    continue block172;
                                    case 1405401648: {
                                        var5_8 = var3_3 / 2.0f - hc.e / 2.0f;
                                        ** GOTO lbl344
                                    }
                                    case -1927979479: {
                                        if (!hc.c) ** GOTO lbl344
                                        ** GOTO lbl392
                                    }
                                    case -834980241: {
                                        var25_11 ^= var26_6 ^ -879263376;
                                        ** continue;
                                    }
                                    case -1590684268: {
                                        if (Math.abs(var5_8 + hc.e - (var3_3 - var7_10)) <= var6_9) {
                                            ** continue;
                                        }
                                        ** GOTO lbl421
                                    }
                                    case -1307364119: {
                                        var25_11 ^= var26_6 ^ 1408768825;
                                        ** GOTO lbl426
                                    }
                                    case -860640211: {
                                        if (Math.abs(var5_8 - var7_10) <= var6_9) {
                                            ** continue;
                                        }
                                        ** GOTO lbl398
                                    }
                                    case 522291868: {
                                        var26_6 = (var24_5 | var27_4) ^ -561284565;
                                        continue block172;
                                    }
lbl344:
                                    // 2 sources

                                    var26_6 = (var24_5 | var27_4) ^ -71095969;
                                    continue block172;
lbl346:
                                    // 1 sources

                                    switch (var25_11) {
                                        case -1128250725: {
                                            var26_6 = (var24_5 | var27_4) ^ 1198835585;
                                            continue block172;
                                        }
                                        case -642994202: {
                                            var25_11 ^= var26_6 ^ -665184923;
                                            var26_6 = (var24_5 | var27_4) ^ 1287371571;
                                            continue block172;
                                        }
                                        case 1520468534: {
                                            ** GOTO lbl465
                                        }
                                        default: {
                                            var26_6 = (var24_5 | var27_4) ^ -844604586;
                                            continue block172;
                                        }
                                        case 757377353: {
                                            ** GOTO lbl375
                                        }
lbl361:
                                        // 2 sources

                                        var25_11 ^= -99672808;
                                        hc.a = v0;
                                        ** GOTO lbl461
                                        case 300900568: {
                                            var25_11 ^= var26_6 ^ 26367083;
                                            ** GOTO lbl151
                                        }
                                        case -612398754: {
                                            var25_11 ^= var26_6 ^ -537549274;
                                            ** continue;
                                        }
                                        case -218574222: {
                                            ** continue;
                                        }
                                        case -2072492320: {
                                            var25_11 ^= var26_6 ^ -213870294;
                                            ** GOTO lbl443
                                        }
lbl375:
                                        // 1 sources

                                        var26_6 = (var24_5 | var27_4) ^ -1375132454;
                                        continue block172;
                                        case 1212432111: {
                                            ** GOTO lbl417
                                        }
lbl379:
                                        // 1 sources

                                        var26_6 = (var24_5 | var27_4) ^ -827791423;
                                        continue block172;
lbl381:
                                        // 1 sources

                                        var26_6 = (var24_5 | var27_4) ^ -1291271278;
                                        continue block172;
                                        case 465668976: {
                                            var26_6 = (var24_5 | var27_4) ^ 2082223439;
                                            continue block172;
                                        }
                                        case -327254167: {
                                            if (Math.abs(var4_7 - var7_10) <= var6_9) ** GOTO lbl390
lbl388:
                                            // 2 sources

                                            var26_6 = (var24_5 | var27_4) ^ 1601181684;
                                            continue block172;
lbl390:
                                            // 1 sources

                                            var26_6 = (var24_5 | var27_4) ^ 1386202870;
                                            continue block172;
                                        }
lbl392:
                                        // 1 sources

                                        var26_6 = (var24_5 | var27_4) ^ 1673658317;
                                        continue block172;
                                        case 1421792253: {
                                            var25_11 ^= var26_6 ^ 1185793638;
                                            var26_6 = (var24_5 | var27_4) ^ -223465066;
                                            continue block172;
                                        }
lbl398:
                                        // 2 sources

                                        var26_6 = (var24_5 | var27_4) ^ -1924940339;
                                        continue block172;
                                        case -1499655866: {
                                            if (!hc.a) ** GOTO lbl407
                                            ** GOTO lbl463
                                        }
lbl403:
                                        // 1 sources

                                        var25_11 ^= -965167501;
                                        ** GOTO lbl437
                                        case -2139673667: {
                                            var4_7 = var2_2 / 2.0f - hc.a / 2.0f;
lbl407:
                                            // 2 sources

                                            var26_6 = (var24_5 | var27_4) ^ -1316988464;
                                            continue block172;
                                        }
                                        case -1194316506: {
                                            if (!(Math.abs(var4_7 + hc.a / 2.0f - var2_2 / 2.0f) <= var6_9)) {
                                                var26_6 = (var24_5 | var27_4) ^ -120659680;
                                                continue block172;
                                            }
                                            var26_6 = (var24_5 | var27_4) ^ -1113939891;
                                            continue block172;
                                        }
lbl415:
                                        // 2 sources

                                        var26_6 = (var24_5 | var27_4) ^ 1205643949;
                                        continue block172;
lbl417:
                                        // 1 sources

                                        var26_6 = (var24_5 | var27_4) ^ -3390462;
                                        continue block172;
                                        case 61299440: {
                                            var5_8 = var3_3 - var7_10 - hc.e;
lbl421:
                                            // 2 sources

                                            var26_6 = (var24_5 | var27_4) ^ -1508392871;
                                            continue block172;
                                        }
                                        case 211897565: {
                                            var26_6 = (var24_5 | var27_4) ^ -980824054;
                                            continue block172;
                                        }
lbl426:
                                        // 2 sources

                                        var26_6 = (var24_5 | var27_4) ^ 1620763939;
                                        continue block172;
                                        case -2059360569: {
                                            v1 = false;
lbl430:
                                            // 2 sources

                                            var25_11 ^= -1300349015;
                                            hc.c = v1;
                                            continue block171;
                                        }
                                        case 663512011: {
                                            var25_11 ^= var26_6 ^ 587615411;
                                            var26_6 = (var24_5 | var27_4) ^ -84162184;
                                            continue block172;
                                        }
lbl437:
                                        // 1 sources

                                        var9_13 = Math.max(3.0f, var3_3 * 0.004f);
                                        var26_6 = (var24_5 | var27_4) ^ -1216499592;
                                        ** GOTO lbl502
                                        case -1367037091: 
                                    }
                                    var26_6 = (var24_5 | var27_4) ^ 1851002727;
                                    continue block172;
lbl443:
                                    // 1 sources

                                    var26_6 = (var24_5 | var27_4) ^ -1815801642;
                                    continue block172;
                                    case 2039694904: {
                                        if (Math.abs(var5_8 + hc.e / 2.0f - var3_3 / 2.0f) <= var6_9) ** continue;
                                        var26_6 = (var24_5 | var27_4) ^ 1480002676;
                                        continue block172;
                                    }
                                    case -2022338913: {
                                        var25_11 ^= var26_6 ^ -559439031;
                                        var26_6 = (var24_5 | var27_4) ^ 1149893799;
                                    }
                                    default: {
                                        continue block172;
                                    }
                                    case 1050444925: {
                                        var25_11 ^= var26_6 ^ 853392361;
                                        var26_6 = (var24_5 | var27_4) ^ -949271911;
                                        continue block172;
                                    }
                                    case -160922029: 
                                }
                                var25_11 ^= var26_6 ^ 1585722399;
                                ** continue;
lbl461:
                                // 1 sources

                                var26_6 = (var24_5 | var27_4) ^ -1982600724;
                                continue;
lbl463:
                                // 1 sources

                                var26_6 = (var24_5 | var27_4) ^ 939479376;
                                continue;
lbl465:
                                // 1 sources

                                var26_6 = (var24_5 | var27_4) ^ -1883135764;
                            }
                            break;
                        }
lbl467:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 202393730;
                            ** GOTO lbl549
                            break;
                        }
lbl470:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 1899201329;
                            break block210;
                            break;
                        }
lbl473:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ -1884175548;
                            ** GOTO lbl482
                            break;
                        }
lbl476:
                        // 1 sources

                        while (true) {
                            var23_27 = Math.min(var8_12, Math.min(hc.a + var16_20, hc.e + var17_21) * 0.35f);
                            ** continue;
                            break;
                        }
                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 752653919;
                            break block210;
                            break;
                        }
lbl482:
                        // 1 sources

                        block178: while (true) {
                            switch (var26_6) {
                                case 470046748: {
                                    var26_6 = (var24_5 | var27_4) ^ -1734891881;
                                }
lbl486:
                                // 3 sources

                                default: {
                                    continue block178;
                                }
                                case -416495320: {
                                    var25_11 ^= var26_6 ^ -25039848;
                                    ** continue;
                                }
                                case -267735813: 
                            }
                            break;
                        }
                        var4_7 = var0 - hc.d;
                        var25_11 ^= 1024136292;
                        var5_8 = var1_1 - hc.c;
                        ** continue;
lbl496:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ -965658900;
                            break block210;
lbl499:
                            // 1 sources

                            while (true) {
                                var26_6 = (var24_5 | var27_4) ^ 585657939;
                                break block210;
                                break;
                            }
                            break;
                        }
lbl502:
                        // 2 sources

                        block181: while (true) {
                            switch (var26_6) {
                                default: {
                                    continue block181;
                                }
                                case 260386569: {
                                    hc.a = null;
                                    ** continue;
                                }
                                case 936985061: {
                                    var10_14 = 0;
                                    ** break;
                                }
                                case -926490681: {
                                    var25_11 ^= var26_6 ^ -1988932289;
                                    var26_6 = (var24_5 | var27_4) ^ 1883127990;
                                    continue block181;
                                }
lbl516:
                                // 2 sources

                                var26_6 = (var24_5 | var27_4) ^ 281046468;
                                continue block157;
                                case 1407202858: 
                            }
                            var25_11 ^= var26_6 ^ 1466700059;
                            var26_6 = (var24_5 | var27_4) ^ 1214393946;
                        }
lbl522:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ -596071019;
                            break block210;
                            break;
                        }
lbl525:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 992106298;
                            ** GOTO lbl549
                            break;
                        }
lbl528:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 444052052;
                            break block210;
                            break;
                        }
lbl531:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 1470386109;
                            break block210;
                            break;
                        }
                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 1976899654;
                            ** GOTO lbl549
lbl537:
                            // 1 sources

                            while (true) {
                                var26_6 = (var24_5 | var27_4) ^ -1900309596;
                                ** GOTO lbl549
                                break;
                            }
                            break;
                        }
lbl540:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 1295421590;
                            break block210;
                            break;
                        }
lbl543:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 2137386018;
                            break block210;
lbl546:
                            // 1 sources

                            while (true) {
                                var26_6 = (var24_5 | var27_4) ^ 937130562;
                                break block210;
                                break;
                            }
                            break;
                        }
lbl549:
                        // 6 sources

                        block191: while (true) {
                            switch (var26_6) {
                                case 748626566: {
                                    if (var19_23 <= 0.0f) break block191;
                                    ** break;
                                }
                                case -1947089172: {
                                    if (var18_22 <= 0.0f) break block191;
                                    ** continue;
                                }
                                case -1063496152: {
                                    if (var20_24 <= 0.0f) break block191;
                                    ** continue;
                                }
                                case 1778100380: {
                                    var26_6 = (var24_5 | var27_4) ^ -1087948393;
                                    continue block191;
                                }
lbl563:
                                // 1 sources

                                var26_6 = (var24_5 | var27_4) ^ 373344035;
                                break;
                                case -251593701: {
                                    var25_11 ^= var26_6 ^ -1614635314;
                                    ** continue;
                                }
                                case 1150892165: {
                                    var25_11 ^= var26_6 ^ 710629968;
                                    ** continue;
                                }
                                case 1940596541: {
                                    var26_6 = (var24_5 | var27_4) ^ 1394887993;
                                    continue block191;
                                }
                                case -1907362432: {
                                    var25_11 ^= var26_6 ^ 1605061438;
                                    var26_6 = (var24_5 | var27_4) ^ -196433581;
                                    break;
                                }
                                case -722304250: {
                                    var22_26 = Math.min(Math.min(var18_22, var19_23), Math.min(var20_24, var21_25));
                                    ** break;
                                }
                                case 1328883223: {
                                    break block191;
                                }
lbl583:
                                // 1 sources

                                var25_11 ^= 1241123815;
                                ** continue;
                                case -484845997: {
                                    if (!(var21_25 <= 0.0f)) ** continue;
                                    ** continue;
                                }
                                case 175011833: {
                                    var25_11 ^= var26_6 ^ -1052186589;
                                    var26_6 = (var24_5 | var27_4) ^ -1421218631;
                                }
                            }
lbl591:
                            // 5 sources

                        }
lbl592:
                        // 7 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ -2039362251;
                            ** continue;
                            break;
                        }
lbl595:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 380819043;
                            break block210;
                            break;
                        }
lbl598:
                        // 1 sources

                        while (true) {
                            var26_6 = (var24_5 | var27_4) ^ 1168044522;
                            break block210;
                            while (true) {
                                var26_6 = (var24_5 | var27_4) ^ 31055709;
                                break block210;
lbl604:
                                // 4 sources

                                while (true) {
                                    var26_6 = (var24_5 | var27_4) ^ 599326479;
                                    break block210;
                                    break;
                                }
lbl607:
                                // 1 sources

                                while (true) {
                                    var26_6 = (var24_5 | var27_4) ^ -252760132;
                                    break block210;
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        case 188642498: 
                    }
                    break;
                }
                break;
            }
            return;
        }
        block198: while (true) {
            switch (var26_6) {
                default: {
                    continue block198;
                }
                case 975543893: {
                    ** GOTO lbl592
                }
                case -1890303997: {
                    var11_15 = true;
                    ** continue;
                }
                case -1547451862: {
                    var4_7 = var14_18 + var16_20;
                    ** GOTO lbl604
                }
                case 673128450: {
                    var5_8 = var15_19 - hc.e;
                    ** GOTO lbl604
                }
                case -284157721: {
                    var25_11 ^= var26_6 ^ -1759204715;
                    ** continue;
                }
                case 2120397026: {
                    var25_11 ^= var26_6 ^ 372662163;
                    ** continue;
                }
                case 1543737520: {
                    var25_11 ^= var26_6 ^ 1627562296;
                    ** continue;
                }
                case 1707924971: {
                    var4_7 = var14_18 - hc.a;
                    ** GOTO lbl604
                }
                case 853365508: {
                    if (var22_26 != var18_22) ** continue;
                    ** continue;
                }
                case 1399323104: {
                    var25_11 ^= var26_6 ^ 1995159453;
                    ** continue;
                }
                case 571198017: {
                    var25_11 ^= var26_6 ^ -1797891384;
                    ** continue;
                }
                case 1188289252: {
                    var25_11 ^= var26_6 ^ 1133555293;
                    ** continue;
                }
                case 1214256637: {
                    var25_11 ^= var26_6 ^ -562905168;
                    ** continue;
                }
                case 14582685: {
                    if (var22_26 != var19_23) ** continue;
                    ** continue;
                }
                case -283812654: {
                    var25_11 ^= var26_6 ^ -807770602;
                    ** continue;
                }
                case -2138880603: {
                    if (var22_26 != var20_24) ** continue;
                    ** continue;
                }
                case -705875731: {
                    var5_8 = var15_19 + var17_21;
                    ** continue;
                }
                case 0xE88EC8E: {
                    var25_11 ^= var26_6 ^ 1508236448;
                    ** continue;
                }
                case 1565721068: {
                    hc.a = var13_17.slot();
                    ** continue;
                }
                case 848166697: {
                    if (!(var22_26 > var23_27)) ** continue;
                    ** continue;
                }
                case 1762245084: {
                    var25_11 ^= var26_6 ^ -47973050;
                    ** continue;
                }
                case -1177921197: 
            }
            break;
        }
        var25_11 ^= var26_6 ^ -1131860502;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void Qx() {
        var3 = 1292427828;
        var0_1 = hc.a & 1292427828 ^ -1728362987;
        var2_2 = 0;
        var1_3 = (var0_1 | var3) ^ -1040167500;
        var2_2 = (var0_1 | var3) ^ -1388428469;
        if (true) ** GOTO lbl9
        block13: while (true) {
            var2_2 = (var0_1 | var3) ^ 213915153;
lbl9:
            // 2 sources

            block14: while (true) {
                switch (var2_2) {
                    default: {
                        continue block14;
                    }
                    case -1677041351: {
                        var1_3 ^= var2_2 ^ 1954697177;
                        var2_2 = (var0_1 | var3) ^ 1228645223;
                        continue block14;
                    }
                    case 1252710246: {
                        var1_3 ^= var2_2 ^ 794319993;
                        var2_2 = (var0_1 | var3) ^ 1155102253;
                        continue block14;
                    }
                    case -129140955: {
                        var1_3 ^= var2_2 ^ -1911137741;
                        var2_2 = (var0_1 | var3) ^ 276457215;
                        continue block14;
                    }
                    case 1478336722: {
                        var1_3 ^= var2_2 ^ 2031785253;
                        var2_2 = (var0_1 | var3) ^ 976425951;
                        continue block14;
                    }
                    case -847150902: {
                        hc.a = null;
                        var2_2 = (var0_1 | var3) ^ -2048506137;
                        continue block14;
                    }
                    case 1892001150: {
                        var2_2 = (var0_1 | var3) ^ 1106347788;
                        continue block14;
                    }
                    case -1799338670: {
                        hc.b = null;
                        var2_2 = (var0_1 | var3) ^ 632721680;
                        continue block14;
                    }
                    case -406260246: {
                        hc.a = null;
                        var2_2 = (var0_1 | var3) ^ 1216381743;
                        continue block14;
                    }
                    case -1787075302: {
                        var1_3 ^= var2_2 ^ 101597728;
                        continue block13;
                    }
                    case -784601052: {
                        hc.c = false;
                        hc.a = false;
                        var2_2 = (var0_1 | var3) ^ -1756286637;
                        continue block14;
                    }
                    case -1725788136: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public static void renderOverlay(W var0, class_310 var1_1) {
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
    private static fE Qy(ad var0) {
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
    private static String Qz(ad var0) {
        var10_1 = -1936695804;
        var7_2 = hc.a & -1936695804 ^ -2056443649;
        var9_3 = 0;
        var8_10 = (var7_2 | var10_1) ^ 1092682807;
        var9_3 = (var7_2 | var10_1) ^ -2005067479;
        if (true) ** GOTO lbl-1000
lbl7:
        // 2 sources

        while (true) {
            var9_3 = (var7_2 | var10_1) ^ 1751263606;
            ** GOTO lbl47
            break;
        }
        block28: while (true) {
            block39: {
                switch (var9_3) lbl-1000:
                // 2 sources

                {
                    default: {
                        continue block28;
                    }
                    case 92301270: {
                        ** break;
                    }
                    case -1807901910: {
                        var8_10 ^= var9_3 ^ 2019104321;
                        break block39;
                    }
lbl19:
                    // 1 sources

                    var9_3 = (var7_2 | var10_1) ^ 432072149;
                    continue block28;
                    case 79828936: 
                }
                var1_4 = var0.name().toLowerCase().split(hc.a);
                var8_10 ^= -713108485;
                var2_5 = new StringBuilder();
                var8_10 ^= -134034536;
                var3_6 = var1_4;
                var4_7 = var3_6.length;
                var5_8 = 0;
                break;
            }
            var9_3 = (var7_2 | var10_1) ^ -1992333001;
        }
lbl33:
        // 2 sources

        while (true) {
            var9_3 = (var7_2 | var10_1) ^ 1069013396;
            ** GOTO lbl102
            break;
        }
lbl36:
        // 1 sources

        while (true) {
            var9_3 = (var7_2 | var10_1) ^ -337367377;
            if (true) ** GOTO lbl102
            break;
        }
        block31: while (true) {
            var9_3 = (var7_2 | var10_1) ^ 1072569190;
            if (true) ** GOTO lbl102
lbl42:
            // 1 sources

            while (true) {
                var9_3 = (var7_2 | var10_1) ^ -1647313488;
                if (true) ** GOTO lbl47
                break;
            }
            block33: while (true) {
                var9_3 = (var7_2 | var10_1) ^ -2092023869;
lbl47:
                // 3 sources

                block34: while (true) {
                    switch (var9_3) {
                        case 639811938: {
                            var2_5.append(Character.toUpperCase(var6_9.charAt(0))).append(var6_9, 1, var6_9.length());
                            ** GOTO lbl84
                        }
                        case 246628668: {
                            var8_10 ^= var9_3 ^ 1825681279;
                            ** GOTO lbl91
                        }
                        case -442542199: {
                            var8_10 ^= var9_3 ^ -1608511472;
                            ** break;
                        }
                        case 866414105: {
                            var8_10 ^= var9_3 ^ 2024668488;
                            ** continue;
                        }
                        case 2062324341: {
                            var9_3 = (var7_2 | var10_1) ^ -1390905214;
                            break;
                        }
                        case -669982553: {
                            var8_10 ^= var9_3 ^ -3323523;
                            var9_3 = (var7_2 | var10_1) ^ 925059588;
                            break;
                        }
                        case -1159842565: {
                            ** break;
                        }
                        case 53512374: {
                            var8_10 ^= var9_3 ^ -1358338276;
                            var9_3 = (var7_2 | var10_1) ^ 609225209;
                            break;
                        }
lbl75:
                        // 1 sources

                        var9_3 = (var7_2 | var10_1) ^ -1411399779;
                        break;
                        case 551880317: {
                            var2_5.append((char)hc.Qv((var8_10 | var9_3 ^ -1401595783) ^ (var9_3 ^ -118297009), (var7_2 | var9_3 ^ -1401595783) ^ ((var8_10 | var9_3 ^ -1401595783) ^ (var9_3 ^ -1634111250))));
                            ** GOTO lbl7
                        }
                        case -1448249594: {
                            ++var5_8;
                            ** continue;
                        }
lbl84:
                        // 2 sources

                        var9_3 = (var7_2 | var10_1) ^ -1899104695;
                        continue block34;
                        case 1277813111: {
                            if (var2_5.length() > 0) ** break;
                            ** continue;
                            var9_3 = (var7_2 | var10_1) ^ -149820278;
                            continue block34;
                        }
lbl91:
                        // 1 sources

                        var9_3 = (var7_2 | var10_1) ^ -1043030136;
                        continue block34;
                        case 271745871: {
                            if (!var6_9.isEmpty()) continue block33;
                            var9_3 = (var7_2 | var10_1) ^ 1441635928;
                        }
                    }
lbl96:
                    // 7 sources

                }
                break;
            }
lbl97:
            // 1 sources

            while (true) {
                var9_3 = (var7_2 | var10_1) ^ -1101459226;
                ** GOTO lbl96
                break;
            }
            block37: while (true) {
                var9_3 = (var7_2 | var10_1) ^ 2096098302;
lbl102:
                // 4 sources

                block38: while (true) {
                    switch (var9_3) {
                        default: {
                            continue block38;
                        }
                        case -1561459265: {
                            var8_10 ^= var9_3 ^ -1545508243;
                            var9_3 = (var7_2 | var10_1) ^ -60607545;
                            continue block38;
                        }
                        case -1307351655: {
                            var8_10 ^= var9_3 ^ -727192843;
                            continue block37;
                        }
                        case 1906199864: {
                            var6_9 = var3_6[var5_8];
                            ** continue;
                        }
                        case -1303730325: {
                            var8_10 ^= var9_3 ^ 1940397464;
                            ** continue;
                        }
                        case 1712934992: {
                            if (var5_8 >= var4_7) continue block31;
                            var9_3 = (var7_2 | var10_1) ^ 789805888;
                            continue block38;
                        }
                        case -250440447: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return var2_5.toString();
    }
}

