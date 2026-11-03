/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.W;
import z.r.ap;
import z.r.bq;
import z.r.fc;
import z.r.fu;
import z.r.hT;
import z.r.lS;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class je
extends hT {
    private static final int[] a;
    private String a;
    private Runnable a;
    private lS a;
    public static final int a;
    private bq a;

    /*
     * Enabled aggressive block sorting
     */
    public je(String string, lS lS2, Runnable runnable) {
        int n2 = a & 0x8AA852E5 ^ 0xE394ABBC;
        int n3 = (n2 | 0x8AA852E5) ^ 0x19960719;
        n3 ^= 0x8CDA60F8;
        this(string, null, lS2, runnable);
        n3 ^= 0x75F3926E;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public je(String var1_1, bq var2_2, lS var3_3, Runnable var4_4) {
        var8_5 = -637063807;
        var5_6 = je.a & -637063807 ^ 1636347307;
        var7_7 = 0;
        var6_8 = (var5_6 | var8_5) ^ 1283840892;
        var6_8 ^= 939598778;
        super();
        var7_7 = (var5_6 | var8_5) ^ -2045300878;
        ** GOTO lbl14
lbl9:
        // 1 sources

        while (true) {
            var7_7 = (var5_6 | var8_5) ^ 1676789096;
            if (true) ** GOTO lbl14
            break;
        }
        block13: while (true) {
            var7_7 = (var5_6 | var8_5) ^ 264095813;
lbl14:
            // 3 sources

            block14: while (true) {
                switch (var7_7) {
                    default: {
                        continue block14;
                    }
                    case 1306371642: {
                        var6_8 ^= var7_7 ^ 559390397;
                        var7_7 = (var5_6 | var8_5) ^ -1058399998;
                        continue block14;
                    }
                    case 1245511152: {
                        this.a = var1_1;
                        var7_7 = (var5_6 | var8_5) ^ -1139358456;
                        continue block14;
                    }
                    case 996521129: {
                        this.a = var3_3;
                        var7_7 = (var5_6 | var8_5) ^ 1342913668;
                        continue block14;
                    }
                    case 2107146969: {
                        var6_8 ^= var7_7 ^ -649785004;
                        var7_7 = (var5_6 | var8_5) ^ -1313648549;
                        continue block14;
                    }
                    case -701194500: {
                        this.a = var2_2;
                        var7_7 = (var5_6 | var8_5) ^ -1236137071;
                        continue block14;
                    }
                    case -198023698: {
                        var6_8 ^= var7_7 ^ 790482755;
                        var7_7 = (var5_6 | var8_5) ^ 224326840;
                        continue block14;
                    }
                    case -1417375441: {
                        var6_8 ^= var7_7 ^ 835157728;
                        ** continue;
                    }
                    case -1736546109: {
                        this.a = var4_4;
                        continue block13;
                    }
                    case 1201236131: {
                        var6_8 ^= var7_7 ^ -1062798852;
                        var7_7 = (var5_6 | var8_5) ^ 767243095;
                        continue block14;
                    }
                    case -154052333: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void setLabel(String var1_1) {
        var5_2 = -643545356;
        var2_3 = je.a & -643545356 ^ -1237811310;
        var4_4 = 0;
        if (true) ** GOTO lbl18
        block7: while (true) {
            var4_4 = (var2_3 | var5_2) ^ 814019189;
            if (true) ** GOTO lbl10
            block8: while (true) {
                var4_4 = (var2_3 | var5_2) ^ -187090670;
lbl10:
                // 3 sources

                block9: while (true) {
                    switch (var4_4) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block9;
                            }
                            break;
                        }
                        case -910538086: {
                            var3_5 ^= var4_4 ^ -2040803966;
                            break block7;
                        }
lbl18:
                        // 1 sources

                        var3_5 = (var2_3 | var5_2) ^ -321373986;
                        var4_4 = (var2_3 | var5_2) ^ 1786986001;
                        ** GOTO lbl-1000
lbl21:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 906376556;
                            ** continue;
                            break;
                        }
                        case -818377341: {
                            var3_5 ^= var4_4 ^ 1467508376;
                            continue block8;
                        }
                        case 301987611: {
                            this.a = var1_1;
                            continue block7;
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
        var4_4 = (var2_3 | var5_2) ^ -297563923;
        ** while (true)
        {
            case 191186660: {
                return;
            }
            ** case -1791016473:
        }
lbl35:
        // 1 sources

        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void setIcon(bq bq2) {
        int n2 = -1849446852;
        int n3 = a & 0x91C3AE3C ^ 0xCD6D2097;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xB7F55E56;
        n4 = (n3 | n2) ^ 0x592EF29;
        boolean bl2 = true;
        block7: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0x47E6E3C5;
            }
            block8: while (true) {
                switch (n4) {
                    default: {
                        continue block8;
                    }
                    case -662879850: {
                        n4 = (n3 | n2) ^ 0xA15384AF;
                        continue block8;
                    }
                    case -1710666374: {
                        n5 ^= n4 ^ 0x146F6EEF;
                        n4 = (n3 | n2) ^ 0xBF1AEC6B;
                        continue block8;
                    }
                    case 2092706320: {
                        n5 ^= n4 ^ 0x5D6459A;
                        n4 = (n3 | n2) ^ 0x70A5C958;
                        continue block8;
                    }
                    case -1387632665: {
                        this.a = bq2;
                        continue block7;
                    }
                    case 1660240596: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void setStyle(lS var1_1) {
        block17: {
            block15: {
                block13: {
                    block14: {
                        block16: {
                            break block16;
lbl1:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_4 ^ 249150054;
                                break block13;
                                break;
                            }
                        }
                        var5_2 = 1298155695;
                        var2_3 = je.a & 1298155695 ^ 105413366;
                        var4_4 = 0;
                        break block17;
lbl9:
                        // 1 sources

                        return;
lbl11:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 223345310;
                            break block14;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ -1812902205;
                            ** continue;
                            break;
                        }
                    }
lbl20:
                    // 5 sources

                    block12: while (true) {
                        switch (var4_4) {
                            default: {
                                continue block12;
                            }
                            case 1549462594: {
                                ** continue;
                            }
                            case -639794239: {
                                break block15;
                            }
                            case 1109885025: {
                                ** continue;
                            }
                            case -293210440: {
                                ** continue;
                            }
                            case -878432176: {
                                break;
                            }
                        }
                        ** continue;
                        break;
                    }
                    this.a = var1_1;
                    var4_4 = (var2_3 | var5_2) ^ -2066986321;
                    ** GOTO lbl20
                }
                var4_4 = (var2_3 | var5_2) ^ -1578267577;
                ** GOTO lbl20
            }
            var4_4 = (var2_3 | var5_2) ^ 322082493;
            ** GOTO lbl20
        }
        var3_5 = (var2_3 | var5_2) ^ 1662608858;
        var4_4 = (var2_3 | var5_2) ^ -1766459074;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block15: {
            var2 = -1772241079;
            je.a = mK.a(MethodHandles.lookup().lookupClass(), -275739750);
            var1_1 = 0;
            var0_2 = 309852951;
            var1_1 = var2 ^ -186086773;
            if (true) ** GOTO lbl-1000
            {
                var0_2 ^= 501769863;
                var0_2 ^= 817927899;
                v0 = ((var0_2 ^= 1802841692) | var2) ^ 1514638914 ^ je.a;
                var0_2 ^= -855452486;
                je.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ v0;
                v1 = v1 + 1;
                v2 = v2;
                v3 = v3 + 4;
                var0_2 ^= 1048591498;
                if (v3 + 4 < v2.length) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var0_2 ^= 1753461062;
                        var0_2 ^= 1068029060;
                        var0_2 ^= 1669993494;
                        var0_2 ^= -2122430492;
                        continue block9;
                        break;
                    }
                }
                break block15;
            }
            block11: while (true) {
                var1_1 = var2 ^ -1786603623;
                block12: while (true) {
                    switch (var1_1) lbl-1000:
                    // 2 sources

                    {
                        default: {
                            continue block12;
                        }
                        case 1156558365: {
                            var0_2 ^= var1_1 ^ -1887423549;
                            continue block11;
                        }
                        case 1656042946: {
                            var1_1 = var2 ^ -760082092;
                            continue block12;
                        }
                        case 64956624: 
                    }
                    break;
                }
                break;
            }
            v1 = 0;
            v3 = 0;
            v2 = "\u00b85U\u00c2\u0011\u00b0\u00a1a\u00f2\u00ab2\u00b8S\u00f6\u00d8\u00ef\u0088\u0006\u00ac@\u00a2\u00ff\u0001\u00b6\u0004\u008eL\u001c\u00811\u00bcd\u00e5\u0000\u00dd\u00e5Pk\u00dcT\u00f0\u0001;\u00ee\u0095#\u00feQ".getBytes("ISO-8859-1");
            je.a = new int[((var0_2 ^= -302428979) | var2) ^ -1224884415];
            var0_2 ^= -2012132714;
            ** while (true)
        }
        block13: while (true) {
            switch (var0_2) {
                case 121118361: {
                    var0_2 ^= 1573733751;
                    continue block13;
                }
                default: {
                    var0_2 ^= 1877177543;
                    return;
                }
                case -1427260801: 
            }
            break;
        }
        var0_2 ^= -780722709;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    protected void draw(W var1_1) {
        block117: {
            block119: {
                block118: {
                    block120: {
                        var20_2 = -451790648;
                        var19_3 = -41858797;
                        var18_4 = -159299163;
                        var17_5 = 1296748625;
                        var14_6 = je.a & 1296748625 ^ 1369687165;
                        var16_7 = 0;
                        var15_20 = (var14_6 | var17_5) ^ 50091330;
                        var16_7 = (var14_6 | var17_5) ^ 1052825514;
                        ** GOTO lbl200
lbl10:
                        // 1 sources

                        while (true) {
                            var16_7 = (var14_6 | var17_5) ^ -425294314;
                            ** GOTO lbl230
                            break;
                        }
lbl13:
                        // 1 sources

                        block86: while (true) {
                            switch (var16_7) {
                                case 1852109198: {
                                    var1_1.strokeRoundedRect(this.e, this.h, this.g, this.f, var5_11, var1_1.s(1.0f), fc.mix(fc.border(), var6_12, 0.35f * var4_10));
                                    ** break;
                                }
                                case -2039932882: {
                                    var15_20 ^= var16_7 ^ 1005309177;
                                    ** GOTO lbl143
                                }
                                case 2041582336: {
                                    var15_20 ^= var16_7 ^ -1343405842;
                                    var16_7 = (var14_6 | var17_5) ^ 1141613005;
                                }
lbl24:
                                // 6 sources

                                default: {
                                    continue block86;
                                }
lbl26:
                                // 1 sources

                                var16_7 = (var14_6 | var17_5) ^ -227281197;
                                continue block86;
                                case 1950667771: {
                                    var15_20 ^= var16_7 ^ 981144087;
                                    ** GOTO lbl119
                                }
                                case 1469564004: {
                                    var15_20 ^= var16_7 ^ -1203356203;
                                    ** GOTO lbl117
                                }
                                case -1869683990: {
                                    var15_20 ^= var16_7 ^ -49590271;
                                    ** GOTO lbl141
                                }
                                case 1011646232: {
                                    if (this.g) {
                                        var16_7 = (var14_6 | var17_5) ^ 1326991366;
                                        continue block86;
                                    }
                                    ** GOTO lbl50
                                }
                                case 317955195: {
                                    var15_20 ^= var16_7 ^ -1351530324;
                                    var16_7 = (var14_6 | var17_5) ^ 1267484393;
                                    continue block86;
                                }
                                case 207593595: {
                                    var15_20 ^= var16_7 ^ 1259477768;
                                    var16_7 = (var14_6 | var17_5) ^ -172802844;
                                    continue block86;
                                }
lbl50:
                                // 1 sources

                                var16_7 = (var14_6 | var17_5) ^ -612185005;
                                continue block86;
                                case -716775762: {
                                    v0 = fc.withAlpha(var6_12, je.Hi((var15_20 | var16_7 ^ -1744040193) ^ (var16_7 ^ -1993486752), (var14_6 | var16_7 ^ -1744040193) ^ ((var15_20 | var16_7 ^ -1744040193) ^ (var16_7 ^ -660986691))));
                                    break block117;
                                }
                                case -869194907: {
                                    var15_20 ^= var16_7 ^ -816512118;
                                    var16_7 = (var14_6 | var17_5) ^ -994514106;
                                    ** GOTO lbl24
                                }
                                case 1570769363: {
                                    var15_20 ^= var16_7 ^ 451785376;
                                    var16_7 = (var14_6 | var17_5) ^ -1187621052;
                                    ** GOTO lbl24
                                }
                                case -455244999: {
                                    v1 = fc.onColor(var6_12);
                                    ** GOTO lbl109
                                }
                                case 375886484: {
                                    v0 = var6_12;
                                    break block117;
                                }
                                case -574403072: {
                                    var1_1.strokeRoundedRect(this.e, this.h, this.g, this.f, var5_11, var1_1.s(1.0f), fc.mix(fc.border(), je.Hi((var15_20 | var16_7 ^ -1870029231) ^ (var16_7 ^ 296581345), (var14_6 | var16_7 ^ -1870029231) ^ ((var15_20 | var16_7 ^ -1870029231) ^ (var16_7 ^ -1411734774))), var4_10));
                                    break block118;
                                }
                                case 714620077: {
                                    break block118;
                                }
                                case -1470568295: {
                                    v1 = fc.mix(je.Hi((var15_20 | var16_7 ^ var20_2) ^ (var16_7 ^ 1679283699), (var14_6 | var16_7 ^ var20_2) ^ ((var15_20 | var16_7 ^ var20_2) ^ (var16_7 ^ 100116428))), je.Hi((var15_20 | var16_7 ^ var20_2) ^ (var16_7 ^ 1679283698), (var14_6 | var16_7 ^ var20_2) ^ ((var15_20 | var16_7 ^ var20_2) ^ (var16_7 ^ 796425206))), var4_10);
                                    ** GOTO lbl109
                                }
                                case -1348984146: {
                                    var15_20 ^= var16_7 ^ 673951094;
                                    var16_7 = (var14_6 | var17_5) ^ 2004084944;
                                    continue block86;
                                }
                                case 278931784: {
                                    switch (this.a.ordinal()) {
                                        case 1: {
                                            var16_7 = (var14_6 | var17_5) ^ 699336582;
                                            ** GOTO lbl24
                                        }
                                        case 2: {
                                            var16_7 = (var14_6 | var17_5) ^ 340972856;
                                            continue block86;
                                        }
                                        case 0: {
                                            var16_7 = (var14_6 | var17_5) ^ -849004905;
                                            continue block86;
                                        }
                                    }
                                    break block118;
                                }
                                case -1722597573: {
                                    switch (this.a.ordinal()) {
                                        default: {
                                            var16_7 = (var14_6 | var17_5) ^ 609994621;
                                            continue block86;
                                        }
                                        case 0: {
                                            var16_7 = (var14_6 | var17_5) ^ 4971950;
                                            continue block86;
                                        }
                                        case 2: {
                                            var16_7 = (var14_6 | var17_5) ^ -1044539910;
                                            continue block86;
                                        }
                                        case 1: 
                                    }
                                    var16_7 = (var14_6 | var17_5) ^ 1370780678;
                                    continue block86;
                                }
                                case -1144284684: {
                                    v1 = fc.mix(je.Hi((var15_20 | var16_7 ^ var18_4) ^ (var16_7 ^ 2005181596), (var14_6 | var16_7 ^ var18_4) ^ ((var15_20 | var16_7 ^ var18_4) ^ (var16_7 ^ -1695795457))), je.Hi((var15_20 | var16_7 ^ var18_4) ^ (var16_7 ^ 2005181597), (var14_6 | var16_7 ^ var18_4) ^ ((var15_20 | var16_7 ^ var18_4) ^ (var16_7 ^ 523508733))), var4_10);
lbl109:
                                    // 3 sources

                                    var15_20 ^= 1369961777;
                                    var7_13 = v1;
                                    var16_7 = (var14_6 | var17_5) ^ 1563490460;
                                    break block119;
                                }
                                case -1672068729: {
                                    var15_20 ^= var16_7 ^ -618923276;
                                    var16_7 = (var14_6 | var17_5) ^ -434090615;
                                    continue block86;
                                }
lbl117:
                                // 1 sources

                                var16_7 = (var14_6 | var17_5) ^ -2144822659;
                                continue block86;
lbl119:
                                // 1 sources

                                var16_7 = (var14_6 | var17_5) ^ 1902211407;
                                continue block86;
                                case 966860070: {
                                    var15_20 ^= var16_7 ^ 337952157;
                                    var16_7 = (var14_6 | var17_5) ^ 1296825653;
                                    continue block86;
                                }
                                case -1313689002: {
                                    var15_20 ^= var16_7 ^ 2017393762;
                                    var16_7 = (var14_6 | var17_5) ^ 865019379;
                                    ** GOTO lbl24
                                }
                                case 747283762: {
                                    var1_1.roundedRect(this.e, this.h, this.g, this.f, var5_11, fc.mix(fc.surface(), fc.surfaceHover(), var4_10));
                                    var16_7 = (var14_6 | var17_5) ^ -329685461;
                                    continue block86;
                                }
                                case 1236861253: {
                                    var15_20 ^= var16_7 ^ -1503069964;
                                    var16_7 = (var14_6 | var17_5) ^ -316650177;
                                    continue block86;
                                }
                                case -1328834238: {
                                    var1_1.roundedRect(this.e, this.h, this.g, this.f, var5_11, fc.mix(fc.surface(), fc.withAlpha(je.Hi((var15_20 | var16_7 ^ var19_3) ^ (var16_7 ^ -566983167), (var14_6 | var16_7 ^ var19_3) ^ ((var15_20 | var16_7 ^ var19_3) ^ (var16_7 ^ 637871204))), je.Hi((var15_20 | var16_7 ^ var19_3) ^ (var16_7 ^ -566983166), (var14_6 | var16_7 ^ var19_3) ^ ((var15_20 | var16_7 ^ var19_3) ^ (var16_7 ^ -987952264)))), var4_10));
                                    var16_7 = (var14_6 | var17_5) ^ 175902745;
                                    continue block86;
                                }
lbl141:
                                // 1 sources

                                var16_7 = (var14_6 | var17_5) ^ 1638378341;
                                continue block86;
lbl143:
                                // 1 sources

                                var16_7 = (var14_6 | var17_5) ^ -2001925421;
                                continue block86;
lbl145:
                                // 2 sources

                                while (true) {
                                    var16_7 = (var14_6 | var17_5) ^ 35653992;
                                    ** GOTO lbl230
                                    break;
                                }
lbl148:
                                // 1 sources

                                while (true) {
                                    var16_7 = (var14_6 | var17_5) ^ 1240678671;
                                    ** GOTO lbl230
                                    break;
                                }
lbl151:
                                // 1 sources

                                while (true) {
                                    var16_7 = (var14_6 | var17_5) ^ 910752910;
                                    break block119;
                                    break;
                                }
lbl154:
                                // 1 sources

                                while (true) {
                                    var16_7 = (var14_6 | var17_5) ^ -645185184;
                                    break block119;
lbl157:
                                    // 1 sources

                                    while (true) {
                                        var12_18 = var9_15 + v2;
                                        var15_20 ^= -862438630;
                                        var13_19 = this.e + (this.g - var12_18) / 2.0f;
                                        var16_7 = (var14_6 | var17_5) ^ -696964096;
                                        ** GOTO lbl230
                                        break;
                                    }
lbl163:
                                    // 1 sources

                                    while (true) {
                                        var16_7 = (var14_6 | var17_5) ^ -1807732896;
                                        ** GOTO lbl230
                                        break;
                                    }
lbl166:
                                    // 1 sources

                                    while (true) {
                                        v2 = 0.0f;
                                        ** GOTO lbl198
                                        break;
                                    }
                                    break;
                                }
lbl169:
                                // 2 sources

                                while (true) {
                                    var7_13 = v0;
                                    var16_7 = (var14_6 | var17_5) ^ 1739248905;
                                    ** GOTO lbl368
lbl173:
                                    // 1 sources

                                    while (true) {
                                        var16_7 = (var14_6 | var17_5) ^ -442945037;
                                        break block119;
                                        break;
                                    }
                                    break;
                                }
lbl176:
                                // 1 sources

                                while (true) {
                                    var16_7 = (var14_6 | var17_5) ^ -1037357335;
                                    ** GOTO lbl230
                                    break;
                                }
lbl179:
                                // 1 sources

                                while (true) {
                                    var16_7 = (var14_6 | var17_5) ^ -859608000;
                                    ** GOTO lbl230
                                    break;
                                }
                                while (true) {
                                    var15_20 ^= 997601321;
                                    v3 = 0.82f;
                                    ** GOTO lbl221
                                    break;
                                }
lbl186:
                                // 1 sources

                                while (true) {
                                    var16_7 = (var14_6 | var17_5) ^ 1957162455;
                                    ** GOTO lbl230
                                    break;
                                }
lbl189:
                                // 1 sources

                                while (true) {
                                    var11_17 = var1_1.s(6.0f);
                                    var15_20 ^= -1291940993;
                                    if (this.a != null) {
                                        var15_20 ^= 2114707824;
                                        v2 = var10_16 + var11_17;
                                    } else {
                                        var15_20 ^= 2114707824;
                                        ** continue;
                                    }
lbl198:
                                    // 2 sources

                                    var15_20 ^= 559972061;
                                    ** continue;
                                    break;
                                }
lbl200:
                                // 1 sources

                                block102: while (true) {
                                    switch (var16_7) {
                                        case 1663763415: {
                                            break;
                                        }
                                        case -472371352: {
                                            var2_8 = this.c.value();
                                            var15_20 ^= -2116048817;
                                            var3_9 = this.b.value();
                                            var15_20 ^= 684136042;
                                            if (var1_1.a.isKeyboardFocused(this)) ** continue;
                                            var15_20 ^= 997601321;
                                            break block102;
                                        }
                                        case -2090130797: {
                                            var15_20 ^= var16_7 ^ -1792237033;
                                            ** break;
lbl215:
                                            // 1 sources

                                            var16_7 = (var14_6 | var17_5) ^ -1103889643;
                                        }
                                        default: {
                                            continue block102;
                                        }
                                    }
                                    var16_7 = (var14_6 | var17_5) ^ -561973522;
                                }
                                v3 = 0.0f;
lbl221:
                                // 2 sources

                                var15_20 ^= 1241362768;
                                var4_10 = Math.max(var2_8, v3);
                                var15_20 ^= 445307049;
                                var5_11 = var1_1.s(8.0f);
                                var16_7 = (var14_6 | var17_5) ^ -61621537;
                                break block120;
lbl227:
                                // 2 sources

                                while (true) {
                                    var16_7 = (var14_6 | var17_5) ^ -1494313926;
                                    break block119;
                                    break;
                                }
lbl230:
                                // 8 sources

                                block104: while (true) {
                                    switch (var16_7) {
                                        case -1614742892: {
                                            var15_20 ^= var16_7 ^ 2090780944;
                                            ** GOTO lbl265
                                        }
                                        case 692861354: {
                                            var1_1.text(this.a, var13_19, this.h + this.f / 2.0f, var8_14, var7_13);
                                            ** continue;
                                        }
                                        case 363708009: {
                                            var15_20 ^= var16_7 ^ 1729814601;
                                            ** continue;
                                        }
                                        case 337155442: {
                                            var15_20 ^= var16_7 ^ 1722796882;
                                            ** break;
                                        }
                                        case 451715213: {
                                            var1_1.restore();
                                            ** continue;
                                        }
lbl247:
                                        // 1 sources

                                        var16_7 = (var14_6 | var17_5) ^ 2033641717;
                                        ** GOTO lbl252
                                        case -1952515971: {
                                            var15_20 ^= var16_7 ^ -1198258492;
                                            var16_7 = (var14_6 | var17_5) ^ 1351792206;
                                        }
lbl252:
                                        // 3 sources

                                        default: {
                                            continue block104;
                                        }
                                        case 618478728: {
                                            var1_1.icon(this.a, var13_19 + var10_16 / 2.0f, this.h + this.f / 2.0f, var10_16, var7_13);
                                            ** GOTO lbl260
                                        }
                                        case -1152560533: {
                                            var13_19 += var10_16 + var11_17;
                                            ** GOTO lbl145
                                        }
lbl260:
                                        // 1 sources

                                        var16_7 = (var14_6 | var17_5) ^ 1212574228;
                                        continue block104;
                                        case -911475939: {
                                            var15_20 ^= var16_7 ^ -833998970;
                                            ** continue;
                                        }
lbl265:
                                        // 1 sources

                                        var16_7 = (var14_6 | var17_5) ^ 1191671024;
                                        continue block104;
                                        case 226058803: {
                                            if (this.a != null) ** break;
                                            ** continue;
                                            ** continue;
                                        }
                                        case 1607195925: {
                                            var15_20 ^= var16_7 ^ 1936246767;
                                            ** continue;
                                        }
                                        case -1859602371: 
                                    }
                                    break;
                                }
                                return;
lbl276:
                                // 1 sources

                                while (true) {
                                    var16_7 = (var14_6 | var17_5) ^ 1682622811;
                                    continue block86;
                                    break;
                                }
                                case 434140592: 
                            }
                            break;
                        }
                        throw new MatchException(null, null);
lbl281:
                        // 1 sources

                        while (true) {
                            var15_20 ^= 978072467;
                            ** continue;
                            break;
                        }
lbl284:
                        // 1 sources

                        while (true) {
                            var16_7 = (var14_6 | var17_5) ^ -747408169;
                            break block120;
                            break;
                        }
lbl287:
                        // 1 sources

                        while (true) {
                            var16_7 = (var14_6 | var17_5) ^ -1323398318;
                            break block119;
                            break;
                        }
lbl290:
                        // 1 sources

                        while (true) {
                            var9_15 = var1_1.textWidth(this.a, var8_14);
                            var15_20 ^= 2123267835;
                            var10_16 = var1_1.s(15.0f);
                            ** continue;
                            break;
                        }
                    }
                    block110: while (true) {
                        switch (var16_7) {
                            default: {
                                continue block110;
                            }
                            case -1581748574: {
                                var15_20 ^= var16_7 ^ 1411799053;
                                ** break;
                            }
                            case -1140956426: {
                                var15_20 ^= var16_7 ^ 619850990;
                                var16_7 = (var14_6 | var17_5) ^ -964155263;
                                continue block110;
                            }
                            case -1687945988: {
                                var1_1.scaleCanvas(1.0f - 0.03f * var3_9, this.e + this.g / 2.0f, this.h + this.f / 2.0f);
                                ** continue;
                            }
                            case -1334495050: {
                                var6_12 = fc.accent();
                                ** continue;
                            }
                            case -1902600022: {
                                var15_20 ^= var16_7 ^ 1876177786;
                                var16_7 = (var14_6 | var17_5) ^ -308351797;
                                continue block110;
                            }
lbl317:
                            // 1 sources

                            var16_7 = (var14_6 | var17_5) ^ 1107682572;
                            continue block110;
                            case 535703921: 
                        }
                        var1_1.save();
                        var16_7 = (var14_6 | var17_5) ^ -434784629;
                    }
                }
lbl324:
                // 2 sources

                while (true) {
                    var16_7 = (var14_6 | var17_5) ^ -1847920872;
                    ** continue;
                    break;
                }
            }
            block112: while (true) {
                switch (var16_7) {
                    case -1056380217: {
                        var16_7 = (var14_6 | var17_5) ^ -1627718192;
                        continue block112;
                    }
                    case 14363873: {
                        var15_20 ^= var16_7 ^ 1824830424;
                        var16_7 = (var14_6 | var17_5) ^ 2140722796;
                        continue block112;
                    }
                    case -1022285395: {
                        var7_13 = je.Hi((var15_20 | var16_7 ^ -1906574852) ^ (var16_7 ^ 1072578243), (var14_6 | var16_7 ^ -1906574852) ^ ((var15_20 | var16_7 ^ -1906574852) ^ (var16_7 ^ 869201940)));
                        ** GOTO lbl227
                    }
                    case -1200429682: {
                        var1_1.roundedRect(this.e, this.h, this.g, this.f, var5_11, fc.mix(var7_13, -1, 0.08f * var4_10));
                        var16_7 = (var14_6 | var17_5) ^ 1689190470;
                        continue block112;
                    }
                    case 577962513: {
                        if (!this.g) ** break;
                        ** continue;
                        ** break;
                    }
                    case 1805854963: {
                        var15_20 ^= var16_7 ^ -1182028756;
                        ** continue;
                    }
                    case -2074045155: {
                        var1_1.strokeRoundedRect(this.e, this.h, this.g, this.f, var5_11, var1_1.s(1.0f), fc.withAlpha(-1, (int)(24.0f + 24.0f * var4_10)));
                        ** continue;
                    }
                    case 977338740: {
                        var15_20 ^= var16_7 ^ -795130651;
                        ** continue;
                    }
lbl357:
                    // 1 sources

                    var16_7 = (var14_6 | var17_5) ^ -1662828870;
                    ** GOTO lbl368
                    case -319463633: {
                        ** continue;
                    }
                    case -1278278540: {
                        var8_14 = var1_1.s(13.0f);
                        var15_20 ^= 346817286;
                        ** continue;
                    }
                    case -83541945: {
                        var15_20 ^= var16_7 ^ -114567814;
                        var16_7 = (var14_6 | var17_5) ^ -299577335;
                    }
lbl368:
                    // 4 sources

                    default: {
                        continue block112;
                    }
                    case 960812091: 
                }
                break;
            }
            var15_20 ^= var16_7 ^ 282329881;
            ** while (true)
        }
        while (true) {
            switch (var15_20) {
                case -32126034: {
                    var15_20 ^= -1050316720;
                    ** GOTO lbl169
                }
                case -393106967: {
                    var15_20 ^= 1592807295;
                    ** continue;
                }
            }
            var15_20 ^= -141190210;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public boolean mouseDown(W var1_1, double var2_2, double var4_3, int var6_4) {
        var10_5 = 198510948;
        var7_6 = je.a & 198510948 ^ -1815032339;
        var9_7 = 0;
        var8_8 = (var7_6 | var10_5) ^ 807298744;
        var9_7 = (var7_6 | var10_5) ^ 836389974;
        if (true) ** GOTO lbl50
        block26: while (true) {
            var9_7 = (var7_6 | var10_5) ^ -477625877;
            if (true) ** GOTO lbl21
            block27: while (true) {
                var9_7 = (var7_6 | var10_5) ^ 461613718;
                ** GOTO lbl21
lbl13:
                // 1 sources

                while (true) {
                    var9_7 = (var7_6 | var10_5) ^ 1264301003;
                    ** GOTO lbl21
lbl16:
                    // 1 sources

                    while (true) {
                        var9_7 = (var7_6 | var10_5) ^ -597681569;
                        if (true) ** GOTO lbl21
                        break;
                    }
                    break;
                }
                block30: while (true) {
                    var9_7 = (var7_6 | var10_5) ^ -1724571962;
lbl21:
                    // 5 sources

                    block31: while (true) {
                        switch (var9_7) {
                            case 1203099570: {
                                var8_8 ^= var9_7 ^ -2004174088;
                                var9_7 = (var7_6 | var10_5) ^ 1792380285;
                                continue block31;
                            }
                            case 48288555: {
                                ** break;
                            }
                            case -1593092600: {
                                var8_8 ^= var9_7 ^ -2122176117;
                                ** GOTO lbl60
                            }
                            case -760729255: {
                                ** GOTO lbl75
                            }
                            case 1036118900: {
                                var8_8 ^= var9_7 ^ -212638696;
                                var9_7 = (var7_6 | var10_5) ^ 1488862903;
                                continue block31;
                            }
                            case -795967962: {
                                var8_8 ^= var9_7 ^ -1034884924;
                                var9_7 = (var7_6 | var10_5) ^ 323906130;
                                continue block31;
                            }
                            case -1316927367: {
                                return true;
                            }
                            case -2003064897: {
                                this.requestFocus(var1_1);
                                ** continue;
                            }
                            case -1202310442: {
                                var8_8 ^= var9_7 ^ 888928212;
                                var9_7 = (var7_6 | var10_5) ^ 710182292;
                            }
lbl50:
                            // 12 sources

                            default: {
                                continue block31;
                            }
lbl52:
                            // 1 sources

                            switch (var8_8) {
                                default: {
                                    var9_7 = (var7_6 | var10_5) ^ -833544283;
                                    ** GOTO lbl50
                                }
                                case -444756474: {
                                    return false;
                                }
                                case 1434767944: {
                                    var8_8 ^= var9_7 ^ 400641345;
lbl60:
                                    // 2 sources

                                    var9_7 = (var7_6 | var10_5) ^ 1232993460;
                                    ** GOTO lbl50
                                }
                                case 2043516324: {
                                    var9_7 = (var7_6 | var10_5) ^ 987667429;
                                    ** GOTO lbl50
                                }
                                case -1481924203: 
                            }
                            var9_7 = (var7_6 | var10_5) ^ -1088688113;
                            ** GOTO lbl50
                            case -186006982: {
                                if (!this.contains(var2_2, var4_3)) continue block27;
                                ** continue;
                            }
                            case -251641712: {
                                this.setPressed(true);
                                var9_7 = (var7_6 | var10_5) ^ 595853115;
                                ** GOTO lbl50
                            }
lbl75:
                            // 1 sources

                            var9_7 = (var7_6 | var10_5) ^ 2124956651;
                            ** GOTO lbl50
                            case 617496034: {
                                var8_8 ^= var9_7 ^ -1205866637;
                                continue block30;
                            }
                            case -322227272: {
                                if (!this.g) continue block27;
                                var9_7 = (var7_6 | var10_5) ^ -47703392;
                                ** GOTO lbl50
                            }
                            case -2141821061: {
                                continue block30;
                            }
                            case -1441824325: {
                                var9_7 = (var7_6 | var10_5) ^ -1508628839;
                                ** GOTO lbl50
                            }
                            case -1016335526: {
                                if (var6_4 == 0) ** break;
                                continue block27;
                                continue block26;
                            }
                            case 2019412998: {
                                var9_7 = (var7_6 | var10_5) ^ 1998519893;
                                ** GOTO lbl50
                            }
                            case 1727911757: 
                        }
                        var9_7 = (var7_6 | var10_5) ^ 1866207191;
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    private static int Hi(int n2, int n3) {
        int n4 = -1946037280;
        int n5 = 2018182892;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x5F7F1CDD)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xFC4B93FC;
        n6 -= (n5 | n4) ^ 0xFC4BF846;
        n6 -= (n5 | n4) ^ 0xFC4BCD23;
        n6 -= (n5 | n4) ^ 0xFC4BDADF;
        n6 += (n5 | n4) ^ 0xFC4B9CCC;
        n6 += (n5 | n4) ^ 0xFC4B6972;
        n6 += (n5 | n4) ^ 0xFC4BF014;
        return n6 += (n5 | n4) ^ 0xFC4BB858;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    @Override
    public boolean isFocusable() {
        int n2 = a & 0x823FC21 ^ 0xE58C2D54;
        int n3 = 0;
        int n4 = (n2 | 0x823FC21) ^ 0xDEF79B86;
        n3 = (n2 | 0x823FC21) ^ 0xC863C8B4;
        block5: while (true) {
            switch (n3) {
                case 634140097: {
                    n3 = (n2 | 0x823FC21) ^ 0x683CDF5A;
                }
                default: {
                    continue block5;
                }
                case -2053955025: {
                    n4 ^= n3 ^ 0x28246E48;
                    n3 = (n2 | 0x823FC21) ^ 0xE8AA7523;
                    continue block5;
                }
                case 84248662: 
            }
            break;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean key(W var1_1, int var2_2, int var3_3) {
        block60: {
            block58: {
                block52: {
                    block59: {
                        block57: {
                            block56: {
                                block53: {
                                    block61: {
                                        block55: {
                                            block54: {
                                                break block61;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    var6_6 = (var4_5 | var7_4) ^ 568452958;
                                                    break block52;
                                                    break;
                                                }
lbl4:
                                                // 1 sources

                                                while (true) {
                                                    if (var2_2 == je.Hi((var5_7 | var6_6 ^ -175508162) ^ (var6_6 ^ 1419220835), (var4_5 | var6_6 ^ -175508162) ^ ((var5_7 | var6_6 ^ -175508162) ^ (var6_6 ^ -315180783)))) break block53;
                                                    break block54;
                                                    break;
                                                }
lbl7:
                                                // 1 sources

                                                while (true) {
                                                    var6_6 = (var4_5 | var7_4) ^ -429577139;
                                                    break block52;
                                                    break;
                                                }
lbl10:
                                                // 1 sources

                                                while (true) {
                                                    if (var2_2 == je.Hi((var5_7 | var6_6 ^ -1883391511) ^ (var6_6 ^ 782490549), (var4_5 | var6_6 ^ -1883391511) ^ ((var5_7 | var6_6 ^ -1883391511) ^ (var6_6 ^ -232771157)))) break block53;
                                                    break block55;
                                                    break;
                                                }
                                            }
                                            var6_6 = (var4_5 | var7_4) ^ -1929747792;
                                            break block52;
lbl16:
                                            // 1 sources

                                            while (true) {
                                                var6_6 = (var4_5 | var7_4) ^ -275551862;
                                                break block52;
                                                break;
                                            }
lbl19:
                                            // 2 sources

                                            while (true) {
                                                var6_6 = (var4_5 | var7_4) ^ -427742099;
                                                break block52;
                                                break;
                                            }
lbl22:
                                            // 1 sources

                                            while (true) {
                                                if (!var1_1.a.isFocused(this)) break block55;
                                                break block56;
                                                break;
                                            }
lbl25:
                                            // 1 sources

                                            while (true) {
                                                if (this.a == null) ** GOTO lbl19
                                                break block57;
                                                break;
                                            }
                                        }
                                        while (true) {
                                            var6_6 = (var4_5 | var7_4) ^ 1963267638;
                                            break block52;
                                            break;
                                        }
lbl32:
                                        // 1 sources

                                        while (true) {
                                            var6_6 = (var4_5 | var7_4) ^ 1683194;
                                            break block52;
                                            break;
                                        }
                                    }
                                    var7_4 = -247376744;
                                    var4_5 = je.a & -247376744 ^ -1664582800;
                                    var6_6 = 0;
                                    var5_7 = (var4_5 | var7_4) ^ -29719193;
                                    ** while (true)
lbl41:
                                    // 1 sources

                                    while (true) {
                                        this.a.run();
                                        ** continue;
                                        break;
                                    }
                                }
                                while (true) {
                                    var6_6 = (var4_5 | var7_4) ^ 407603131;
                                    break block52;
                                    break;
                                }
lbl48:
                                // 1 sources

                                while (true) {
                                    var6_6 = (var4_5 | var7_4) ^ -871226904;
                                    break block52;
                                    break;
                                }
lbl51:
                                // 1 sources

                                while (true) {
                                    if (var2_2 == je.Hi((var5_7 | var6_6 ^ 506170489) ^ (var6_6 ^ -1086984665), (var4_5 | var6_6 ^ 506170489) ^ ((var5_7 | var6_6 ^ 506170489) ^ (var6_6 ^ -1493293219)))) ** continue;
                                    break block58;
                                    break;
                                }
lbl54:
                                // 1 sources

                                while (true) {
                                    var6_6 = (var4_5 | var7_4) ^ -372818115;
                                    break block52;
                                    break;
                                }
lbl57:
                                // 1 sources

                                while (true) {
                                    var6_6 = (var4_5 | var7_4) ^ -1453231827;
                                    break block52;
                                    break;
                                }
lbl60:
                                // 1 sources

                                while (true) {
                                    var6_6 = (var4_5 | var7_4) ^ 1949294078;
                                    break block52;
                                    break;
                                }
lbl63:
                                // 1 sources

                                return true;
lbl65:
                                // 1 sources

                                while (true) {
                                    var5_7 ^= var6_6 ^ 1833472627;
                                    break block59;
                                    break;
                                }
lbl68:
                                // 1 sources

                                return false;
lbl70:
                                // 1 sources

                                while (true) {
                                    var5_7 ^= var6_6 ^ 2048744365;
                                    ** continue;
                                    break;
                                }
                            }
                            var6_6 = (var4_5 | var7_4) ^ 575723085;
                            break block52;
lbl76:
                            // 1 sources

                            while (true) {
                                var5_7 ^= var6_6 ^ 396080728;
                                ** continue;
                                break;
                            }
lbl79:
                            // 1 sources

                            while (true) {
                                var5_7 ^= var6_6 ^ 550351337;
                                ** continue;
                                break;
                            }
lbl82:
                            // 1 sources

                            while (true) {
                                var5_7 ^= var6_6 ^ 605573826;
                                ** continue;
                                break;
                            }
lbl85:
                            // 1 sources

                            while (true) {
                                var6_6 = (var4_5 | var7_4) ^ -1493124308;
                                break block52;
lbl88:
                                // 1 sources

                                while (true) {
                                    continue;
lbl90:
                                    // 1 sources

                                    while (true) {
                                        var6_6 = (var4_5 | var7_4) ^ -2093641079;
                                        break block52;
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        var6_6 = (var4_5 | var7_4) ^ 953429342;
                        break block52;
                    }
                    var6_6 = (var4_5 | var7_4) ^ -622704070;
                    break block52;
                    fu.play(ap.D);
                    var6_6 = (var4_5 | var7_4) ^ -626423344;
                    break block52;
lbl102:
                    // 1 sources

                    while (true) {
                        if (!this.g) ** continue;
                        ** continue;
                        break;
                    }
                }
lbl106:
                // 3 sources

                block51: while (true) {
                    switch (var6_6) {
                        default: {
                            continue block51;
                        }
                        case 1420299989: {
                            ** continue;
                        }
                        case 1899175240: {
                            ** continue;
                        }
                        case 80257446: {
                            ** continue;
                        }
                        case 2130505073: {
                            ** continue;
                        }
                        case -601319258: {
                            ** continue;
                        }
                        case 836460048: {
                            ** continue;
                        }
                        case 1523172564: {
                            ** continue;
                        }
                        case -278210335: {
                            ** continue;
                        }
                        case -543577675: {
                            break block60;
                        }
                        case 307893874: {
                            ** continue;
                        }
                        case -36646654: {
                            ** continue;
                        }
                        case -1981373946: {
                            ** continue;
                        }
                        case -1999869490: {
                            ** continue;
                        }
                        case 660665896: {
                            ** continue;
                        }
                        case 464278453: {
                            ** continue;
                        }
                        case -444401597: {
                            ** continue;
                        }
                        case 457724821: {
                            ** continue;
                        }
                        case 336478405: {
                            ** continue;
                        }
                        case -987934042: {
                            ** continue;
                        }
                        case -596285416: {
                            break;
                        }
                        case 657143234: {
                            ** continue;
                        }
                    }
                    var6_6 = (var4_5 | var7_4) ^ -117318050;
                    continue;
                    break;
                }
            }
            var6_6 = (var4_5 | var7_4) ^ 565975008;
            ** GOTO lbl106
        }
        var6_6 = (var4_5 | var7_4) ^ 312715033;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean mouseUp(W var1_1, double var2_2, double var4_3, int var6_4) {
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
}

