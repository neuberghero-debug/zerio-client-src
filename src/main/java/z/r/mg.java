/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$StartTick
 *  net.minecraft.class_310
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.class_310;
import z.r.bJ;
import z.r.bM;
import z.r.cV;
import z.r.eN;
import z.r.hJ;
import z.r.he;
import z.r.ko;
import z.r.mj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class mg {
    private static final List<bM> a;
    public static final int a;
    private static boolean a;

    /*
     * Enabled aggressive block sorting
     */
    private mg() {
        int n2 = a & 0x6C0DAEC6 ^ 0x6394D349;
        int n3 = (n2 | 0x6C0DAEC6) ^ 0x62909D28;
        n3 ^= 0xC142577A;
        n3 ^= 0x66261EA9;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void add(bM bM2) {
        int n2 = -1386657796;
        int n3 = a & 0xAD5947FC ^ 0xC55C2F5F;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x18D94478;
        n4 = (n3 | n2) ^ 0x94DFF38B;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case 1614614765: {
                    n5 ^= n4 ^ 0xAFC9772;
                    n4 = (n3 | n2) ^ 0x626F07D4;
                    continue block7;
                }
                case 2038602868: {
                    n4 = (n3 | n2) ^ 0x8D607F12;
                    continue block7;
                }
                case -1537124543: {
                    n5 ^= n4 ^ 0x5ECB073E;
                    n4 = (n3 | n2) ^ 0xE4CDB2D2;
                    continue block7;
                }
                case 160488749: {
                    return;
                }
                case -1892521941: 
            }
            a.add(bM2);
            n4 = (n3 | n2) ^ 0x493C38BE;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static List<bM> modules() {
        int n2 = a & 0x96330B29 ^ 0x43571FFA;
        int n3 = 0;
        int n4 = (n2 | 0x96330B29) ^ 0xC242EEC;
        n3 = (n2 | 0x96330B29) ^ 0xC80FB78C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 528001143: {
                    break;
                }
                case -1106473957: {
                    n4 ^= n3 ^ 0xFE0FECEE;
                    n3 = (n2 | 0x96330B29) ^ 0xE9059848;
                    continue block5;
                }
                case 1047693235: {
                    return a;
                }
            }
            n3 = (n2 | 0x96330B29) ^ 0x697B93E0;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void install() {
        var3 = 1995413180;
        var0_1 = mg.a & 1995413180 ^ 1348542505;
        var2_2 = 0;
        var1_3 = (var0_1 | var3) ^ -1335501838;
        var2_2 = (var0_1 | var3) ^ 286603786;
        if (true) ** GOTO lbl9
        block13: while (true) {
            var2_2 = (var0_1 | var3) ^ 257040504;
lbl9:
            // 2 sources

            block14: while (true) {
                switch (var2_2) {
                    case -85632811: {
                        var1_3 ^= var2_2 ^ -1254191407;
                        var2_2 = (var0_1 | var3) ^ 487282042;
                        continue block14;
                    }
                    case -1019218912: {
                        var1_3 ^= var2_2 ^ -1703376308;
                        var2_2 = (var0_1 | var3) ^ 230936144;
                        continue block14;
                    }
                    case -2124427073: {
                        ClientTickEvents.START_CLIENT_TICK.register((Object)(ClientTickEvents.StartTick)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_310;)V, xd(net.minecraft.class_310 ), (Lnet/minecraft/class_310;)V)());
                        ** GOTO lbl36
                    }
                    case 1577028140: {
                        var1_3 ^= var2_2 ^ 1146646697;
                        var2_2 = (var0_1 | var3) ^ -139434494;
                        continue block14;
                    }
                    case 1810162631: {
                        if (mg.a) {
                            ** break;
                        }
                        ** GOTO lbl45
                    }
                    case -877070861: {
                        mg.a = true;
                        var2_2 = (var0_1 | var3) ^ 722484369;
                        continue block14;
                    }
lbl34:
                    // 1 sources

                    var2_2 = (var0_1 | var3) ^ -1244642659;
                    ** GOTO lbl37
lbl36:
                    // 1 sources

                    var2_2 = (var0_1 | var3) ^ 1596777297;
lbl37:
                    // 3 sources

                    default: {
                        continue block14;
                    }
                    case 700667372: {
                        var1_3 ^= var2_2 ^ -338176257;
                        continue block13;
                    }
                    case 1744473271: {
                        var2_2 = (var0_1 | var3) ^ -1945440664;
                        continue block14;
                    }
lbl45:
                    // 1 sources

                    var2_2 = (var0_1 | var3) ^ -1963229095;
                    continue block14;
                    case -65784092: {
                        var1_3 ^= var2_2 ^ -1959454840;
                        var2_2 = (var0_1 | var3) ^ -1118354610;
                        continue block14;
                    }
                    case 2042468037: {
                        return;
                    }
                    case 2066512109: 
                }
                break;
            }
            break;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    private static void xd(class_310 var0) {
        block111: {
            block115: {
                block114: {
                    block113: {
                        block112: {
                            var10_1 = 438939408;
                            var7_2 = mg.a & 438939408 ^ -1757378853;
                            var9_3 = 0;
                            var8_4 = (var7_2 | var10_1) ^ 709963351;
                            var9_3 = (var7_2 | var10_1) ^ -741687426;
                            break block111;
lbl7:
                            // 1 sources

                            while (true) {
                                var9_3 = (var7_2 | var10_1) ^ 1703988461;
                                break block111;
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var8_4 ^= var9_3 ^ 403176793;
                                var9_3 = (var7_2 | var10_1) ^ -2065988595;
                                break block111;
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                if (var0.field_1724 == null) ** GOTO lbl23
                                var9_3 = (var7_2 | var10_1) ^ 642408759;
                                break block111;
                                break;
                            }
lbl18:
                            // 1 sources

                            while (true) {
                                var9_3 = (var7_2 | var10_1) ^ 1449578206;
                                break block111;
                                break;
                            }
lbl21:
                            // 1 sources

                            while (true) {
                                if (var0.field_1687 != null) break block112;
lbl23:
                                // 2 sources

                                var9_3 = (var7_2 | var10_1) ^ 217464157;
                                break block111;
                                break;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var8_4 ^= var9_3 ^ 1234830377;
                                var9_3 = (var7_2 | var10_1) ^ 981522037;
                                break block111;
                                break;
                            }
lbl29:
                            // 1 sources

                            while (true) {
                                mj.forget();
                                var9_3 = (var7_2 | var10_1) ^ -2025747143;
                                break block111;
                                break;
                            }
lbl33:
                            // 1 sources

                            while (true) {
                                var8_4 ^= var9_3 ^ -271329566;
                                var9_3 = (var7_2 | var10_1) ^ 249295410;
                                break block111;
                                break;
                            }
lbl37:
                            // 1 sources

                            while (true) {
                                ko.reset();
                                var9_3 = (var7_2 | var10_1) ^ -1305152941;
                                break block111;
                                break;
                            }
lbl41:
                            // 1 sources

                            while (true) {
                                var8_4 ^= var9_3 ^ -945941551;
                                var9_3 = (var7_2 | var10_1) ^ -2114921828;
                                break block111;
                                break;
                            }
lbl45:
                            // 1 sources

                            return;
                        }
                        var9_3 = (var7_2 | var10_1) ^ 1707715842;
                        break block111;
lbl50:
                        // 1 sources

                        while (true) {
                            var8_4 ^= var9_3 ^ -173776963;
                            var9_3 = (var7_2 | var10_1) ^ -263000005;
                            break block111;
                            break;
                        }
lbl54:
                        // 1 sources

                        while (true) {
                            if (hJ.ok()) break block113;
                            var9_3 = (var7_2 | var10_1) ^ 1868844734;
                            break block111;
                            break;
                        }
lbl58:
                        // 1 sources

                        while (true) {
                            var8_4 ^= var9_3 ^ 871580714;
                            var9_3 = (var7_2 | var10_1) ^ 994927460;
                            break block111;
                            break;
                        }
lbl62:
                        // 1 sources

                        return;
                    }
                    var9_3 = (var7_2 | var10_1) ^ 342499324;
                    break block111;
lbl67:
                    // 1 sources

                    while (true) {
                        var8_4 ^= var9_3 ^ -795258123;
                        var9_3 = (var7_2 | var10_1) ^ 782000197;
                        break block111;
                        break;
                    }
lbl71:
                    // 1 sources

                    while (true) {
                        if (!he.suppressAutomation()) break block114;
                        var9_3 = (var7_2 | var10_1) ^ -1937603907;
                        break block111;
                        break;
                    }
lbl75:
                    // 1 sources

                    while (true) {
                        var8_4 ^= var9_3 ^ 295561590;
                        var9_3 = (var7_2 | var10_1) ^ -254048332;
                        break block111;
                        break;
                    }
lbl79:
                    // 1 sources

                    while (true) {
                        ko.reset();
                        var9_3 = (var7_2 | var10_1) ^ -959910535;
                        break block111;
                        break;
                    }
lbl83:
                    // 1 sources

                    while (true) {
                        var8_4 ^= var9_3 ^ -440192012;
                        var9_3 = (var7_2 | var10_1) ^ -1724761441;
                        break block111;
                        break;
                    }
lbl87:
                    // 1 sources

                    while (true) {
                        mj.record();
                        var9_3 = (var7_2 | var10_1) ^ -1505611267;
                        break block111;
                        break;
                    }
lbl91:
                    // 1 sources

                    while (true) {
                        var8_4 ^= var9_3 ^ -1313467807;
                        var9_3 = (var7_2 | var10_1) ^ 1282191347;
                        break block111;
                        break;
                    }
lbl95:
                    // 1 sources

                    return;
                }
                var9_3 = (var7_2 | var10_1) ^ 1213634934;
                break block111;
lbl100:
                // 1 sources

                while (true) {
                    var8_4 ^= var9_3 ^ -1721146890;
                    var9_3 = (var7_2 | var10_1) ^ 292013920;
                    break block111;
                    break;
                }
lbl104:
                // 1 sources

                while (true) {
                    ko.tick();
                    var9_3 = (var7_2 | var10_1) ^ -261110324;
                    break block111;
                    break;
                }
lbl108:
                // 1 sources

                while (true) {
                    var8_4 ^= var9_3 ^ 551674086;
                    var9_3 = (var7_2 | var10_1) ^ 606548221;
                    break block111;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    mj.record();
                    var9_3 = (var7_2 | var10_1) ^ 1429475768;
                    break block111;
                    break;
                }
lbl116:
                // 1 sources

                while (true) {
                    var8_4 ^= var9_3 ^ 857876205;
                    var9_3 = (var7_2 | var10_1) ^ 1406714374;
                    break block111;
                    break;
                }
lbl120:
                // 1 sources

                while (true) {
                    if (var0.field_1724.method_29504()) ** GOTO lbl129
                    var9_3 = (var7_2 | var10_1) ^ 1710305142;
                    break block111;
                    break;
                }
lbl124:
                // 1 sources

                while (true) {
                    var9_3 = (var7_2 | var10_1) ^ -1683321420;
                    break block111;
                    break;
                }
lbl127:
                // 1 sources

                while (true) {
                    if (!var0.field_1724.method_7325()) break block115;
lbl129:
                    // 2 sources

                    var9_3 = (var7_2 | var10_1) ^ 1565378201;
                    break block111;
                    break;
                }
lbl131:
                // 1 sources

                while (true) {
                    var8_4 ^= var9_3 ^ 1133137848;
                    var9_3 = (var7_2 | var10_1) ^ -137286931;
                    break block111;
                    break;
                }
lbl135:
                // 1 sources

                return;
            }
            var9_3 = (var7_2 | var10_1) ^ -1275932544;
            break block111;
lbl140:
            // 1 sources

            while (true) {
                var8_4 ^= var9_3 ^ -1000702141;
                var9_3 = (var7_2 | var10_1) ^ 662531905;
                break block111;
                break;
            }
lbl144:
            // 1 sources

            while (true) {
                block116: {
                    block118: {
                        block117: {
                            var1_5 = mg.a.iterator();
lbl146:
                            // 2 sources

                            while (true) {
                                var9_3 = (var7_2 | var10_1) ^ 906768457;
                                break block116;
                                break;
                            }
lbl149:
                            // 1 sources

                            while (true) {
                                var8_4 ^= var9_3 ^ 1716729992;
                                var9_3 = (var7_2 | var10_1) ^ -166459332;
                                break block116;
                                break;
                            }
lbl153:
                            // 1 sources

                            while (true) {
                                if (!var1_5.hasNext()) break block117;
                                var9_3 = (var7_2 | var10_1) ^ 2050395608;
                                break block116;
                                break;
                            }
lbl157:
                            // 1 sources

                            while (true) {
                                var8_4 ^= var9_3 ^ 707868696;
                                var9_3 = (var7_2 | var10_1) ^ 1468935241;
                                break block116;
                                break;
                            }
lbl161:
                            // 1 sources

                            while (true) {
                                var2_6 = var1_5.next();
                                var9_3 = (var7_2 | var10_1) ^ -2018679216;
                                break block118;
lbl165:
                                // 1 sources

                                while (true) {
                                    var8_4 ^= var9_3 ^ -1843193502;
                                    var9_3 = (var7_2 | var10_1) ^ 810101803;
                                    break block118;
                                    break;
                                }
lbl169:
                                // 1 sources

                                while (true) {
                                    if (!var2_6.isEnabled()) ** GOTO lbl201
                                    var9_3 = (var7_2 | var10_1) ^ -1165833984;
                                    break block118;
                                    break;
                                }
lbl173:
                                // 1 sources

                                while (true) {
                                    var8_4 ^= var9_3 ^ 611780755;
                                    var9_3 = (var7_2 | var10_1) ^ -8477442;
                                    break block118;
                                    break;
                                }
lbl177:
                                // 1 sources

                                while (true) {
                                    var3_7 = eN.begin();
                                    try {
                                        var8_4 ^= 1140557792;
                                        var2_6.onCombatTick();
                                        var8_4 ^= 2037149153;
                                    }
                                    catch (Exception v0) {
                                        try {
                                            var8_4 = (var7_2 | var10_1) ^ 1411923525;
                                            var5_8 = v0;
                                            var8_4 ^= 1362256124;
                                        }
                                        catch (Throwable v1) {
                                            var8_4 = (var7_2 | var10_1) ^ -1916322725;
                                            var6_9 = v1;
                                            var8_4 ^= -1493624064;
                                            eN.end(var2_6, cV.g, var3_7);
                                            var8_4 ^= 281279834;
                                            throw var6_9;
                                        }
                                        eN.end(var2_6, cV.g, var3_7);
                                        var8_4 ^= 60520931;
                                    }
                                    eN.end(var2_6, cV.g, var3_7);
                                    var8_4 ^= 990610505;
                                    var9_3 = (var7_2 | var10_1) ^ -675332429;
                                    break block118;
                                    break;
                                }
lbl204:
                                // 1 sources

                                while (true) {
                                    var8_4 ^= var9_3 ^ -1033241472;
                                    var9_3 = (var7_2 | var10_1) ^ -1431948540;
                                    break block118;
                                    break;
                                }
                                break;
                            }
                        }
                        var9_3 = (var7_2 | var10_1) ^ -2125974877;
                        break block116;
lbl211:
                        // 1 sources

                        while (true) {
                            var8_4 ^= var9_3 ^ -1625521641;
                            var9_3 = (var7_2 | var10_1) ^ 3868712;
                            break block116;
                            break;
                        }
lbl215:
                        // 1 sources

                        while (true) {
                            bJ.onClientTick();
                            var9_3 = (var7_2 | var10_1) ^ -1958971967;
                            break block116;
                            break;
                        }
lbl219:
                        // 1 sources

                        while (true) {
                            var8_4 ^= var9_3 ^ 1780000587;
                            var9_3 = (var7_2 | var10_1) ^ 37065508;
                            break block116;
                            break;
                        }
lbl223:
                        // 1 sources

                        return;
                    }
                    block108: while (true) {
                        switch (var9_3) {
                            default: {
                                continue block108;
                            }
                            case 415549835: {
                                ** continue;
                            }
                            case -1356823568: {
                                ** continue;
                            }
                            case 636184283: {
                                ** continue;
                            }
                            case 1612122917: {
                                ** continue;
                            }
                            case 1222021480: {
                                ** continue;
                            }
                            ** case 902798559:
lbl241:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
                }
                block109: while (true) {
                    switch (var9_3) {
                        default: {
                            continue block109;
                        }
                        case -1452957806: {
                            ** continue;
                        }
                        case 1769842663: {
                            ** continue;
                        }
                        case -446750205: {
                            ** continue;
                        }
                        case -924351598: {
                            ** continue;
                        }
                        case 505519480: {
                            ** continue;
                        }
                        case -1621973005: {
                            ** continue;
                        }
                        case 341170714: {
                            ** continue;
                        }
                        ** case -1654899457:
lbl262:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
                break;
            }
        }
        block110: while (true) {
            switch (var9_3) {
                default: {
                    continue block110;
                }
                case 1285755045: {
                    ** continue;
                }
                case -84319434: {
                    ** continue;
                }
                case 464661462: {
                    ** continue;
                }
                case -1188835604: {
                    ** continue;
                }
                case -921739003: {
                    ** continue;
                }
                case -1818258810: {
                    ** continue;
                }
                case -1511425618: {
                    ** continue;
                }
                case 405283554: {
                    ** continue;
                }
                case -1850581527: {
                    ** continue;
                }
                case 761093512: {
                    ** continue;
                }
                case 513373511: {
                    ** continue;
                }
                case -90176807: {
                    ** continue;
                }
                case 1866162144: {
                    ** continue;
                }
                case -267525787: {
                    ** continue;
                }
                case -1541092161: {
                    ** continue;
                }
                case -1962692569: {
                    ** continue;
                }
                case -1309290594: {
                    ** continue;
                }
                case 334179686: {
                    ** continue;
                }
                case 1873946735: {
                    ** continue;
                }
                case 1503740578: {
                    ** continue;
                }
                case 106665284: {
                    ** continue;
                }
                case 959159846: {
                    ** continue;
                }
                case -754647000: {
                    ** continue;
                }
                case -683723091: {
                    ** continue;
                }
                case -1911658309: {
                    ** continue;
                }
                case 1862691351: {
                    ** continue;
                }
                case -1152475354: {
                    ** continue;
                }
                case -899826077: {
                    ** continue;
                }
                case -860787235: {
                    ** continue;
                }
                case -90668883: {
                    ** continue;
                }
                case 79897199: {
                    ** continue;
                }
                case -1037801150: {
                    ** continue;
                }
                case 1756923190: {
                    ** continue;
                }
                case 748388187: {
                    ** continue;
                }
                ** case -1206599526:
lbl337:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    static {
        a = mK.a(MethodHandles.lookup().lookupClass(), 884283645);
        int n2 = 0;
        int n3 = -1802236281;
        n2 = 0x7F3C9AC4 ^ 0x3561C6FB;
        block5: while (true) {
            switch (n2) {
                case 2026771107: {
                    a = new ArrayList<bM>();
                    return;
                }
                case 1247632447: {
                    n2 = 0x7F3C9AC4 ^ 0x3D400513;
                }
                default: {
                    continue block5;
                }
                case 1115463639: 
            }
            n3 ^= n2 ^ 0xB3712861;
            n2 = 0x7F3C9AC4 ^ 0x7F28867;
        }
    }
}

