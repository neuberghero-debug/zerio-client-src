/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class gj {
    private static final int[] a;
    public static final int a;

    /*
     * Enabled aggressive block sorting
     */
    private gj() {
        int n2 = a & 0x3E3CD2E ^ 0xC0B33552;
        int n3 = (n2 | 0x3E3CD2E) ^ 0x141D73AA;
        n3 ^= 0x153D5BE0;
        n3 ^= 0x86844E40;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static String text(int ... var0) {
        var7_1 = 1615992971;
        var4_2 = gj.a & 1615992971 ^ -1331201527;
        var6_3 = 0;
        var5_7 = (var4_2 | var7_1) ^ -967068153;
        var6_3 = (var4_2 | var7_1) ^ 95234158;
        if (true) ** GOTO lbl11
        block25: while (true) {
            switch (var6_3) {
                case -178629915: {
                    var6_3 = (var4_2 | var7_1) ^ -344772271;
                }
lbl11:
                // 3 sources

                default: {
                    continue block25;
                }
                case 461655002: {
                    var5_7 ^= var6_3 ^ -1525303370;
                    var6_3 = (var4_2 | var7_1) ^ -2098036957;
                    continue block25;
                }
                case 1912931752: 
            }
            break;
        }
        var1_4 = new char[var0.length];
        var5_7 ^= -242255608;
        var2_5 = 0;
        if (true) ** GOTO lbl57
        block26: while (true) {
            switch (var6_3) {
                case 933588969: {
                    ** GOTO lbl64
                }
                case 697976089: {
                    if (var3_6 <= gj.UD((var5_7 | var6_3 ^ 1237867922) ^ (var6_3 ^ 867750745), (var4_2 | var6_3 ^ 1237867922) ^ ((var5_7 | var6_3 ^ 1237867922) ^ (var6_3 ^ 206913369)))) ** GOTO lbl41
                    ** GOTO lbl45
                }
                case 1959019394: {
                    var1_4[var2_5] = (char)var3_6;
                    ** break;
                }
                case 1901770027: {
                    var5_7 ^= var6_3 ^ 1267874835;
                    var6_3 = (var4_2 | var7_1) ^ -2077017847;
                    ** GOTO lbl62
                }
                case -950259704: {
                    var5_7 ^= var6_3 ^ 368397947;
                    ** GOTO lbl47
                }
lbl39:
                // 1 sources

                var6_3 = (var4_2 | var7_1) ^ 294683919;
                continue block26;
lbl41:
                // 1 sources

                var6_3 = (var4_2 | var7_1) ^ -2119315552;
                continue block26;
                case 1471781443: {
                    if (var3_6 >= gj.UD((var5_7 | var6_3 ^ 938181320) ^ (var6_3 ^ 1302006786), (var4_2 | var6_3 ^ 938181320) ^ ((var5_7 | var6_3 ^ 938181320) ^ (var6_3 ^ 288051969)))) ** GOTO lbl49
lbl45:
                    // 2 sources

                    var6_3 = (var4_2 | var7_1) ^ 933972611;
                    ** GOTO lbl62
                }
lbl47:
                // 1 sources

                var6_3 = (var4_2 | var7_1) ^ -813440530;
                continue block26;
lbl49:
                // 1 sources

                var6_3 = (var4_2 | var7_1) ^ -950921886;
                continue block26;
                case 685566251: {
                    var5_7 ^= var6_3 ^ 1175106587;
                    var6_3 = (var4_2 | var7_1) ^ -1488002872;
                    continue block26;
                }
                case 1824076316: {
                    ++var2_5;
lbl57:
                    // 2 sources

                    var6_3 = (var4_2 | var7_1) ^ -93203827;
                    ** GOTO lbl91
                }
                case -513278076: {
                    var5_7 ^= var6_3 ^ 65508245;
                    var6_3 = (var4_2 | var7_1) ^ -1672591209;
                }
lbl62:
                // 4 sources

                default: {
                    continue block26;
                }
lbl64:
                // 1 sources

                var6_3 = (var4_2 | var7_1) ^ -647151726;
                continue block26;
lbl66:
                // 1 sources

                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ -1088892327;
                    ** GOTO lbl75
                    while (true) {
                        var6_3 = (var4_2 | var7_1) ^ 804104548;
                        ** GOTO lbl75
                        break;
                    }
                    break;
                }
lbl72:
                // 1 sources

                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ -668232800;
                    continue block26;
                    break;
                }
lbl75:
                // 2 sources

                block30: while (true) {
                    switch (var6_3) {
                        case 1659743059: {
                            if (var2_5 >= var0.length) ** continue;
                            ** continue;
                        }
                        case -551889937: {
                            var5_7 ^= var6_3 ^ -534906204;
                            var6_3 = (var4_2 | var7_1) ^ 1238296506;
                            continue block30;
                        }
                        case 1341106386: {
                            var5_7 ^= var6_3 ^ 302960789;
                            var6_3 = (var4_2 | var7_1) ^ 1269548149;
                            ** break;
                        }
                        case 176596998: {
                            var5_7 ^= var6_3 ^ -503748520;
                            var6_3 = (var4_2 | var7_1) ^ -1843736104;
                        }
lbl91:
                        // 4 sources

                        default: {
                            continue block30;
                        }
                        case -1151549698: {
                            var3_6 = var0[var2_5];
                            ** continue;
                        }
                        case -1187406543: 
                    }
                    break;
                }
                return new String(var1_4);
                case 1064606565: 
            }
            break;
        }
        throw new IllegalArgumentException();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block11: {
            break block11;
lbl1:
            // 1 sources

            while (true) {
                var0_2 ^= -1178783508;
                var0_2 ^= -1973293653;
                var0_2 ^= 1032256485;
                var0_2 ^= -1304492695;
                var0_2 ^= 1261001592;
                var0_2 ^= -205771167;
                v0 = ((var0_2 ^= -328840864) | var2) ^ 1640999551 ^ gj.a;
                var0_2 ^= 2035859003;
                gj.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ v0;
                v1 = v1 + 1;
                v2 = v2;
                v3 = v3 + 4;
                var0_2 ^= -1848729207;
                if (v3 + 4 < v2.length) continue;
                var0_2 ^= -819409329;
                return;
            }
        }
        var2 = 1193385159;
        gj.a = mK.a(MethodHandles.lookup().lookupClass(), -1051928969);
        var1_1 = 0;
        var0_2 = -1312173928;
        var1_1 = var2 ^ -897967285;
        block10: while (true) {
            switch (var1_1) {
                case 1845596483: {
                    gj.a = new int[5];
                    ** break;
                }
                case -1557451822: {
                    var0_2 ^= var1_1 ^ -460378244;
                    var1_1 = var2 ^ 1353191418;
                    continue block10;
                }
                case -1068271348: {
                    ** GOTO lbl67
                }
                case -1923381364: {
                    var1_1 = var2 ^ -3670104;
                    continue block10;
                }
                case 394892093: {
                    v1 = 0;
                    v3 = 0;
                    v2 = "-\b0JNU\u0083/\u00a4e\u00f1z\b\u00fbJ\u0017\u00bbPZ\u009a".getBytes("ISO-8859-1");
                    ** continue;
                }
                case -1192860817: {
                    var0_2 ^= var1_1 ^ -1454933428;
                    var1_1 = var2 ^ -2022513205;
                    continue block10;
                }
lbl64:
                // 1 sources

                var1_1 = var2 ^ -469059819;
                default: {
                    continue block10;
                }
lbl67:
                // 1 sources

                var1_1 = var2 ^ -2145128845;
                continue block10;
                case -956140876: 
            }
            var0_2 ^= var1_1 ^ 1865796856;
            var1_1 = var2 ^ 689966468;
        }
    }

    private static int UD(int n2, int n3) {
        int n4 = -184285464;
        int n5 = -2115273133;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xE375471)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xF5EF0707;
        n6 += (n5 | n4) ^ 0xF5EFA2DD;
        n6 -= (n5 | n4) ^ 0xF5EFD6F8;
        n6 -= (n5 | n4) ^ 0xF5EF5CAD;
        n6 += (n5 | n4) ^ 0xF5EF644B;
        n6 ^= (n5 | n4) ^ 0xF5EF6A97;
        return n6 -= (n5 | n4) ^ 0xF5EF7B0E;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static String decode(String var0, int var1_1) {
        block25: {
            break block25;
            while (true) {
                var7_4 = (var5_3 | var8_2) ^ 1237778997;
                ** GOTO lbl6
                break;
            }
lbl4:
            // 1 sources

            block22: while (true) {
                var7_4 = (var5_3 | var8_2) ^ 462404821;
lbl6:
                // 2 sources

                block23: while (true) {
                    switch (var7_4) {
                        case -595465645: {
                            var3_6 ^= var3_6 << gj.UD((var6_8 | var7_4 ^ 857211348) ^ (var7_4 ^ -924701891), (var5_3 | var7_4 ^ 857211348) ^ ((var6_8 | var7_4 ^ 857211348) ^ (var7_4 ^ -1096185046)));
                            ** GOTO lbl49
                        }
                        case 1724470892: {
                            var6_8 ^= var7_4 ^ -620984725;
                            var7_4 = (var5_3 | var8_2) ^ 595465604;
                            continue block23;
                        }
                        case -1237778974: {
                            var6_8 ^= var7_4 ^ 296446090;
                            var7_4 = (var5_3 | var8_2) ^ 1908044108;
                            continue block23;
                        }
                        case -1166790719: {
                            var6_8 ^= var7_4 ^ -1641840842;
                            ** break;
                        }
                        case -253919993: {
                            v0 = var4_7;
                            var2_5[v0] = (byte)(var2_5[v0] ^ (byte)(var3_6 >>> ((var4_7 & 3) << 3)));
                            ** GOTO lbl53
                        }
                        case -1529554431: {
                            var3_6 ^= var3_6 << 5;
                            ** GOTO lbl57
                        }
                        case 1746920392: {
                            var6_8 ^= var7_4 ^ -2020769026;
                            var7_4 = (var5_3 | var8_2) ^ 1529554390;
                            continue block23;
                        }
                        case -1207885862: {
                            var6_8 ^= var7_4 ^ -2086512885;
                            var7_4 = (var5_3 | var8_2) ^ -1572521107;
                            continue block23;
                        }
                        case 1572521146: {
                            var3_6 ^= var3_6 >>> gj.UD((var6_8 | var7_4 ^ -1306316995) ^ (var7_4 ^ 1509623171), (var5_3 | var7_4 ^ -1306316995) ^ ((var6_8 | var7_4 ^ -1306316995) ^ (var7_4 ^ -1675905763)));
                            ** GOTO lbl51
                        }
                        case -1385315229: {
                            var6_8 ^= var7_4 ^ 1881381867;
                            var7_4 = (var5_3 | var8_2) ^ 253919952;
                            continue block23;
                        }
                        case 1748706267: {
                            if (var4_7 >= var2_5.length) ** continue;
                            ** GOTO lbl55
                        }
lbl47:
                        // 1 sources

                        var7_4 = (var5_3 | var8_2) ^ 1732088599;
                        ** GOTO lbl65
lbl49:
                        // 1 sources

                        var7_4 = (var5_3 | var8_2) ^ 1207885837;
                        ** GOTO lbl65
lbl51:
                        // 1 sources

                        var7_4 = (var5_3 | var8_2) ^ -1746920417;
                        ** GOTO lbl65
lbl53:
                        // 1 sources

                        var7_4 = (var5_3 | var8_2) ^ 1166790678;
                        ** GOTO lbl65
lbl55:
                        // 1 sources

                        var7_4 = (var5_3 | var8_2) ^ -1724470853;
                        ** GOTO lbl65
lbl57:
                        // 1 sources

                        var7_4 = (var5_3 | var8_2) ^ 1385315252;
                        ** GOTO lbl65
                        case -1732088640: {
                            ++var4_7;
                            continue block22;
                        }
                        case -462404862: {
                            var6_8 ^= var7_4 ^ 1970124189;
                            var7_4 = (var5_3 | var8_2) ^ -1748706292;
                        }
lbl65:
                        // 8 sources

                        default: {
                            continue block23;
                        }
                        case -1908044133: 
                    }
                    break;
                }
                return new String(var2_5, StandardCharsets.UTF_8);
            }
        }
        var8_2 = -275125369;
        var5_3 = gj.a & -275125369 ^ -1771053738;
        var7_4 = 0;
        var6_8 = (var5_3 | var8_2) ^ -1136404739;
        var7_4 = (var5_3 | var8_2) ^ -18121348;
        block24: while (true) {
            switch (var7_4) {
                default: {
                    continue block24;
                }
                case 1252707537: {
                    var6_8 ^= var7_4 ^ -1803527808;
                    var7_4 = (var5_3 | var8_2) ^ -1377094099;
                    continue block24;
                }
                case 18121387: {
                    var7_4 = (var5_3 | var8_2) ^ -1252707578;
                    continue block24;
                }
                case 1377094138: 
            }
            break;
        }
        var2_5 = Base64.getDecoder().decode(var0);
        var3_6 = var1_1 ^ gj.UD(((var6_8 ^= 2132253726) | var8_2) ^ 339853679, (var5_3 | var8_2) ^ ((var6_8 | var8_2) ^ 1352875193));
        var6_8 ^= 143912473;
        var4_7 = 0;
        ** while (true)
    }
}

