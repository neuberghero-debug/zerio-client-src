/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.W;
import z.r.bT;
import z.r.bq;
import z.r.fc;
import z.r.gF;
import z.r.gj;
import z.r.hT;
import z.r.jd;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class lg
extends hT {
    private boolean a;
    public static final int a;
    private final Runnable a;
    public final gF a;
    private final jd a;
    private static final /* synthetic */ String a;
    private static final int[] a;
    private final bT a;

    /*
     * Enabled aggressive block sorting
     */
    public lg(gF gF2, Runnable runnable) {
        int n2 = 2110738797;
        int n3 = a & 0x7DCF516D ^ 0xBA704342;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x8C5C927C;
        n5 ^= 0xA657D98C;
        n4 = (n3 | n2) ^ 0x5579A28B;
        block12: while (true) {
            switch (n4) {
                default: {
                    continue block12;
                }
                case 744510929: {
                    this.a = new jd(gF2::isEnabled, arg_0 -> lg.Bf(gF2, arg_0));
                    n4 = (n3 | n2) ^ 0x4954547B;
                    continue block12;
                }
                case -936292487: {
                    n5 ^= n4 ^ 0x85897C8A;
                    n4 = (n3 | n2) ^ 0xD39F06BE;
                    continue block12;
                }
                case 143876333: {
                    n5 ^= n4 ^ 0x4F185104;
                    n4 = (n3 | n2) ^ 0xF7B4BFBF;
                    continue block12;
                }
                case 139193552: {
                    this.a = runnable;
                    n4 = (n3 | n2) ^ 0x37CE1C16;
                    continue block12;
                }
                case 1258740200: {
                    this.a = new bT(bq.A, runnable);
                    n4 = (n3 | n2) ^ 0x3AB69867;
                    continue block12;
                }
                case -751416753: {
                    return;
                }
                case -1748930066: {
                    this.a = gF2;
                    n4 = (n3 | n2) ^ 0xF76C3382;
                    continue block12;
                }
                case -985019640: {
                    n5 ^= n4 ^ 0x13BE8A3C;
                    n4 = (n3 | n2) ^ 0x2CC91920;
                    continue block12;
                }
                case -1433996828: {
                    n5 ^= n4 ^ 0xEE42610F;
                    n4 = (n3 | n2) ^ 0x683E2281;
                    continue block12;
                }
                case -1230305516: 
            }
            n5 ^= n4 ^ 0x92B086EC;
            n4 = (n3 | n2) ^ 0xB4F98A87;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    protected void draw(W var1_1) {
        block125: {
            block122: {
                block126: {
                    block123: {
                        block124: {
                            block127: {
                                break block127;
                                while (true) {
                                    var20_5 = (var18_4 | var21_3) ^ -1406298062;
                                    break block122;
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    var20_5 = (var18_4 | var21_3) ^ 1823117229;
                                    ** GOTO lbl344
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    var20_5 = (var18_4 | var21_3) ^ 1909091947;
                                    break block123;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var19_12 ^= 1315819632;
                                    var14_19 = this.Bd(var1_1, this.a.getDescription(), var13_18, this.g - var5_9 * 2.0f);
                                    var19_12 ^= 752906967;
                                    var15_20 = this.h + var1_1.s(34.0f);
                                    var19_12 ^= -855485638;
                                    var16_22 = var14_19.iterator();
                                    if (true) ** GOTO lbl-1000
                                    break;
                                }
lbl18:
                                // 1 sources

                                while (true) {
                                    var19_12 ^= -542211194;
                                    v0 = 0.55f;
                                    break block124;
                                    break;
                                }
                                while (true) {
                                    var19_12 ^= -542211194;
                                    v0 = var2_6 * 0.12f;
                                    break block124;
                                    break;
                                }
lbl26:
                                // 1 sources

                                block87: while (true) {
                                    block128: {
                                        switch (var20_5) {
                                            case -449187379: {
                                                var19_12 ^= var20_5 ^ 1075184405;
                                                var20_5 = (var18_4 | var21_3) ^ 476435511;
                                                continue block87;
                                            }
                                            case 787025150: {
                                                v1 = fc.border();
                                                v2 = fc.withAlpha(lg.Be((var19_12 | var20_5 ^ var22_2) ^ (var20_5 ^ -718542499), (var18_4 | var20_5 ^ var22_2) ^ ((var19_12 | var20_5 ^ var22_2) ^ (var20_5 ^ 712367327))), lg.Be((var19_12 | var20_5 ^ var22_2) ^ (var20_5 ^ -718542498), (var18_4 | var20_5 ^ var22_2) ^ ((var19_12 | var20_5 ^ var22_2) ^ (var20_5 ^ -2013035887))));
                                                var19_12 ^= -2020709860;
                                                break block128;
                                            }
                                            case 603517801: {
                                                var19_12 ^= var20_5 ^ -1733518967;
                                                var20_5 = (var18_4 | var21_3) ^ -802139903;
                                                break;
                                            }
                                            case -490960440: {
                                                var1_1.roundedRect(this.e, this.h, this.g, this.f, var4_8, fc.mix(var8_13, fc.surfaceHover(), Math.max(var2_6 * 0.75f, var6_10)));
                                                var20_5 = (var18_4 | var21_3) ^ -584995178;
                                            }
                                        }
                                        continue;
                                    }
                                    if (!var7_11) ** continue;
                                    ** continue;
                                    break;
                                }
lbl48:
                                // 1 sources

                                while (true) {
                                    var20_5 = (var18_4 | var21_3) ^ -1101273541;
                                    break block122;
                                    break;
                                }
lbl51:
                                // 1 sources

                                while (true) {
                                    var20_5 = (var18_4 | var21_3) ^ 2003007508;
                                    break block125;
                                    break;
                                }
                            }
                            var22_2 = -262120427;
                            var21_3 = -561426197;
                            var18_4 = lg.a & -561426197 ^ -19853866;
                            var20_5 = 0;
                            var19_12 = (var18_4 | var21_3) ^ -1437139660;
                            var20_5 = (var18_4 | var21_3) ^ 1489899938;
                            block90: while (true) {
                                switch (var20_5) {
                                    case -1508422563: {
                                        var20_5 = (var18_4 | var21_3) ^ -24656234;
                                        break;
                                    }
                                    case 420946658: {
                                        var2_6 = this.c.value();
                                        var19_12 ^= 1815521924;
                                        var3_7 = this.a.isEnabled();
                                        var19_12 ^= -1825698547;
                                        var4_8 = var1_1.s(12.0f);
                                        var19_12 ^= 170228855;
                                        var5_9 = var1_1.s(13.0f);
                                        var19_12 ^= 930806124;
                                        var6_10 = this.b.value();
                                        var19_12 ^= -302030938;
                                        break block90;
                                    }
                                    case 6200169: {
                                        var19_12 ^= var20_5 ^ -1022352763;
                                        var20_5 = (var18_4 | var21_3) ^ -405897443;
                                    }
                                }
                            }
                            var7_11 = var1_1.a.isKeyboardFocused(this);
                            ** while (true)
                            block91: while (true) {
                                switch (var20_5) {
                                    case -163071195: {
                                        var19_12 ^= var20_5 ^ -354911612;
                                        var20_5 = (var18_4 | var21_3) ^ 974741871;
                                        continue block91;
                                    }
                                    case 496323996: {
                                        var1_1.text(var17_24, this.e + var5_9, var15_20, var13_18, lg.Be((var19_12 | var20_5 ^ -1021567625) ^ (var20_5 ^ -954094033), (var18_4 | var20_5 ^ -1021567625) ^ ((var19_12 | var20_5 ^ -1021567625) ^ (var20_5 ^ -1704717702))));
                                        ** break;
                                    }
                                    case -994034544: {
                                        var15_20 += var1_1.s(14.0f);
                                        ** break;
                                    }
                                    case -1301756516: lbl-1000:
                                    // 2 sources

                                    {
                                        var20_5 = (var18_4 | var21_3) ^ 202162326;
                                        break block126;
                                    }
lbl99:
                                    // 1 sources

                                    var20_5 = (var18_4 | var21_3) ^ 144631514;
                                    break;
                                    case 1316076539: {
                                        var19_12 ^= var20_5 ^ -219926418;
                                        var20_5 = (var18_4 | var21_3) ^ 1286707299;
                                        break;
                                    }
lbl105:
                                    // 1 sources

                                    var20_5 = (var18_4 | var21_3) ^ -1331108348;
                                    continue block91;
                                    case 1165568509: {
                                        var19_12 ^= var20_5 ^ -1936517585;
                                        var20_5 = (var18_4 | var21_3) ^ -481554333;
                                        continue block91;
                                    }
                                }
lbl111:
                                // 4 sources

                            }
lbl112:
                            // 1 sources

                            while (true) {
                                var20_5 = (var18_4 | var21_3) ^ -1414361017;
                                break block125;
                                break;
                            }
lbl115:
                            // 2 sources

                            while (true) {
                                var20_5 = (var18_4 | var21_3) ^ -1011815607;
                                ** GOTO lbl344
                                break;
                            }
                            while (true) {
                                var20_5 = (var18_4 | var21_3) ^ -768786825;
                                break block125;
                                break;
                            }
lbl121:
                            // 1 sources

                            while (true) {
                                var20_5 = (var18_4 | var21_3) ^ -1280767926;
                                break block123;
                                break;
                            }
                            while (true) {
                                var20_5 = (var18_4 | var21_3) ^ 2064181927;
                                break block126;
                                break;
                            }
lbl127:
                            // 1 sources

                            while (true) {
                                var20_5 = (var18_4 | var21_3) ^ -990393873;
                                ** GOTO lbl344
                                break;
                            }
lbl130:
                            // 1 sources

                            while (true) {
                                var20_5 = (var18_4 | var21_3) ^ 558705751;
                                ** GOTO lbl344
                                break;
                            }
lbl133:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl135:
                            // 1 sources

                            block101: while (true) {
                                block129: {
                                    switch (var20_5) {
                                        case -1479174369: {
                                            var1_1.a = var17_23 * (0.16f + 0.84f * var2_6);
                                            ** break;
                                        }
                                        case -859521155: {
                                            var19_12 ^= var20_5 ^ 505962251;
                                            ** GOTO lbl150
                                        }
lbl143:
                                        // 1 sources

                                        var20_5 = (var18_4 | var21_3) ^ 898047080;
                                        ** GOTO lbl148
                                        case -895323072: {
                                            var19_12 ^= var20_5 ^ -276356908;
                                            var20_5 = (var18_4 | var21_3) ^ 485649613;
                                        }
lbl148:
                                        // 3 sources

                                        default: {
                                            continue block101;
                                        }
lbl150:
                                        // 1 sources

                                        var20_5 = (var18_4 | var21_3) ^ 1494010592;
                                        continue block101;
                                        case -500485838: {
                                            var1_1.a = var17_23;
                                            ** GOTO lbl115
                                        }
                                        case -1212174692: {
                                            this.a.render(var1_1);
                                            break block129;
                                        }
                                        case -883015273: 
                                    }
                                    var19_12 ^= var20_5 ^ -1284131153;
                                    var20_5 = (var18_4 | var21_3) ^ 1231483747;
                                    continue;
                                }
                                var20_5 = (var18_4 | var21_3) ^ 880486847;
                                continue;
                                break;
                            }
lbl165:
                            // 1 sources

                            while (true) {
                                var20_5 = (var18_4 | var21_3) ^ -363823017;
                                break block126;
                                break;
                            }
lbl168:
                            // 1 sources

                            while (true) {
                                v3 = var1_1.s(26.0f);
                                ** GOTO lbl220
                                break;
                            }
                        }
                        block104: while (true) {
                            switch (var19_12) {
                                case 547503646: {
                                    var19_12 ^= -1084864526;
                                    break block104;
                                }
                                default: {
                                    var19_12 ^= 1383722840;
                                    break block104;
                                }
                                case -287563095: {
                                    var19_12 ^= 1708238678;
                                    continue block104;
                                }
                            }
                            break;
                        }
                        var9_14 = fc.mix(v1, v2, v0);
                        ** while (true)
                        var20_5 = (var18_4 | var21_3) ^ -957653533;
                        block105: while (true) {
                            block130: {
                                switch (var20_5) {
                                    case 942800924: {
                                        var19_12 ^= var20_5 ^ -1323585562;
                                        var20_5 = (var18_4 | var21_3) ^ -1062758901;
                                        ** break;
                                    }
                                    case -845024701: {
                                        var19_12 ^= var20_5 ^ -280725557;
                                        break block130;
                                    }
                                    case 1048497140: {
                                        var1_1.strokeRoundedRect(this.e, this.h, this.g, this.f, var4_8, var1_1.s(1.0f), var9_14);
                                        var20_5 = (var18_4 | var21_3) ^ 863547324;
                                    }
lbl198:
                                    // 3 sources

                                    default: {
                                        continue block105;
                                    }
                                    case 336383350: 
                                }
                                var10_15 = var1_1.s(15.0f) - var1_1.s(1.0f);
                                break;
                            }
                            var20_5 = (var18_4 | var21_3) ^ -355102583;
                        }
                        var20_5 = (var18_4 | var21_3) ^ -1253014484;
                        break block125;
lbl208:
                        // 1 sources

                        while (true) {
                            var20_5 = (var18_4 | var21_3) ^ -389756372;
                            break block126;
                            break;
                        }
lbl211:
                        // 1 sources

                        while (true) {
                            var20_5 = (var18_4 | var21_3) ^ -1457820981;
                            break block126;
                            break;
                        }
lbl214:
                        // 1 sources

                        while (true) {
                            block131: {
                                var11_16 = v4;
                                var19_12 ^= -1065144987;
                                if (this.a.hasSettings()) break block131;
                                var19_12 ^= -110533217;
                                v3 = 0.0f;
lbl220:
                                // 2 sources

                                var19_12 ^= -2054561927;
                                var12_17 = this.g - var5_9 * 2.0f - v3;
                                ** continue;
                            }
                            var19_12 ^= -110533217;
                            ** continue;
                            break;
                        }
lbl226:
                        // 1 sources

                        while (true) {
                            var20_5 = (var18_4 | var21_3) ^ -1147112446;
                            ** GOTO lbl111
                            break;
                        }
                    }
                    block110: while (true) {
                        switch (var20_5) {
                            default: {
                                continue block110;
                            }
                            case -691894228: {
                                var19_12 ^= var20_5 ^ 1852670264;
                                ** continue;
                            }
                            case -1894567020: {
                                var19_12 ^= var20_5 ^ -803061123;
                                ** break;
                            }
                            case 1299207605: {
                                var13_18 = var1_1.s(11.5f);
                                ** continue;
                            }
lbl243:
                            // 1 sources

                            var20_5 = (var18_4 | var21_3) ^ -935491396;
                            continue block110;
                            case 920966467: 
                        }
                        var1_1.text(var1_1.ellipsize(this.a.getDisplayName(), var10_15, var12_17), this.e + var5_9, this.h + var1_1.s(17.0f), var10_15, var11_16);
                        var20_5 = (var18_4 | var21_3) ^ 672912851;
                    }
lbl249:
                    // 1 sources

                    while (true) {
                        var20_5 = (var18_4 | var21_3) ^ 611112629;
                        break block125;
                        break;
                    }
lbl252:
                    // 1 sources

                    while (true) {
                        var20_5 = (var18_4 | var21_3) ^ 272759113;
                        break block122;
                        break;
                    }
                }
                block113: while (true) {
                    switch (var20_5) {
                        case 371038163: {
                            var16_21 = this.h + this.f - var1_1.s(28.0f);
                            ** break;
                        }
                        case -2049853608: {
                            var19_12 ^= var20_5 ^ 1499757239;
                            ** continue;
                        }
lbl264:
                        // 1 sources

                        var20_5 = (var18_4 | var21_3) ^ -111970380;
                        ** GOTO lbl344
                        case -220881559: {
                            var19_12 ^= var20_5 ^ 46395666;
                            ** continue;
                        }
                        case 1472345908: {
                            if (!var16_22.hasNext()) ** continue;
                            var20_5 = (var18_4 | var21_3) ^ -718099419;
                        }
                        default: {
                            continue block113;
                        }
                        case 344579496: {
                            var17_24 = var16_22.next();
                            ** continue;
                        }
                        case 736883162: 
                    }
                    break;
                }
                var19_12 ^= var20_5 ^ -1306662841;
                ** while (true)
            }
            block114: while (true) {
                block132: {
                    switch (var20_5) {
                        case 1080668056: {
                            v5 = fc.surface();
                            break;
                        }
                        case 1391773133: {
                            var19_12 ^= var20_5 ^ -2103790539;
                            var20_5 = (var18_4 | var21_3) ^ -1095699865;
                            continue block114;
                        }
                        case -291986250: {
                            v5 = fc.mix(fc.surface(), fc.accent(lg.Be((var19_12 | var20_5 ^ 806483037) ^ (var20_5 ^ 0x141A4114), (var18_4 | var20_5 ^ 806483037) ^ ((var19_12 | var20_5 ^ 806483037) ^ (var20_5 ^ 1164831870)))), 0.42f);
                            break;
                        }
                        case 1082309572: {
                            var19_12 ^= var20_5 ^ 350630055;
                            break block132;
                        }
                        case 1119543187: {
                            var19_12 ^= var20_5 ^ -1831555477;
                            ** continue;
                        }
                        case 2122855040: {
                            if (!var3_7) ** continue;
                            var20_5 = (var18_4 | var21_3) ^ -1134329236;
                        }
                        default: {
                            continue block114;
                        }
                    }
                    var19_12 ^= 364615768;
                    break;
                }
                var20_5 = (var18_4 | var21_3) ^ -2142146689;
            }
            var8_13 = v5;
            var20_5 = (var18_4 | var21_3) ^ 467708978;
            ** while (true)
lbl312:
            // 1 sources

            while (true) {
                var20_5 = (var18_4 | var21_3) ^ 829430566;
                break block125;
                break;
            }
lbl315:
            // 1 sources

            while (true) {
                var20_5 = (var18_4 | var21_3) ^ 336653148;
                if (true) ** GOTO lbl344
                break;
            }
        }
        block117: while (true) {
            switch (var20_5) {
                default: {
                    continue block117;
                }
                case -1984289301: {
                    v4 = lg.Be((var19_12 | var20_5 ^ 1462990080) ^ (var20_5 ^ 1394098781), (var18_4 | var20_5 ^ 1462990080) ^ ((var19_12 | var20_5 ^ 1462990080) ^ (var20_5 ^ 716948375)));
                    ** GOTO lbl337
                }
                case -625636534: {
                    var19_12 ^= var20_5 ^ -434468839;
                    ** continue;
                }
                case 1433128376: {
                    if (!var3_7) ** continue;
                    ** continue;
                }
                case 1267325395: {
                    var19_12 ^= var20_5 ^ 1800561888;
                    ** continue;
                }
                case -810989863: {
                    v4 = fc.mix(lg.Be((var19_12 | var20_5 ^ 287315506) ^ (var20_5 ^ 353050984), (var18_4 | var20_5 ^ 287315506) ^ ((var19_12 | var20_5 ^ 287315506) ^ (var20_5 ^ -690791519))), fc.accent(), 0.16f);
lbl337:
                    // 2 sources

                    var19_12 ^= 1214763259;
                    ** continue;
                }
                case 754213768: 
            }
            break;
        }
        var19_12 ^= var20_5 ^ 274424027;
        ** while (true)
        block118: while (true) {
            var20_5 = (var18_4 | var21_3) ^ 1898951255;
lbl344:
            // 7 sources

            block119: while (true) {
                switch (var20_5) {
                    case 1943675708: {
                        if (this.a.hasSettings()) ** break;
                        ** continue;
                        var20_5 = (var18_4 | var21_3) ^ 2128870592;
                        continue block119;
                    }
                    case 1030338230: {
                        var19_12 ^= var20_5 ^ -496736839;
                        ** continue;
                    }
                    case -2143641281: {
                        var19_12 ^= var20_5 ^ -1185322651;
                        ** continue;
                    }
                    case 126495307: {
                        var19_12 ^= var20_5 ^ 67014462;
                        ** GOTO lbl386
                    }
                    case -355879261: {
                        this.a.frame(this.e + this.g - var5_9 - var1_1.s(20.0f), this.h + var1_1.s(8.0f), var1_1.s(20.0f), var1_1.s(20.0f));
                        ** continue;
                    }
                    case 2009758339: {
                        this.a.render(var1_1);
                        continue block118;
                    }
                    case 1769772756: {
                        var19_12 ^= var20_5 ^ -373915987;
                        ** break;
                    }
                    case -1879642200: {
                        var19_12 ^= var20_5 ^ 1396224419;
                        ** GOTO lbl384
                    }
                    case -543919704: {
                        var17_23 = var1_1.a;
                        ** GOTO lbl390
                    }
lbl375:
                    // 1 sources

                    var20_5 = (var18_4 | var21_3) ^ -1995233412;
                    default: {
                        continue block119;
                    }
                    case -1837903278: {
                        var19_12 ^= var20_5 ^ 619862482;
                        ** continue;
                    }
                    case 812779871: {
                        this.a.frame(this.e + var5_9, var16_21, var1_1.s(36.0f), var1_1.s(18.0f));
                        ** GOTO lbl388
                    }
lbl384:
                    // 1 sources

                    var20_5 = (var18_4 | var21_3) ^ -1929150781;
                    continue block119;
lbl386:
                    // 1 sources

                    var20_5 = (var18_4 | var21_3) ^ -827632480;
                    continue block119;
lbl388:
                    // 1 sources

                    var20_5 = (var18_4 | var21_3) ^ -1750742229;
                    continue block119;
lbl390:
                    // 1 sources

                    var20_5 = (var18_4 | var21_3) ^ 840819330;
                    ** continue;
                    case 976131088: 
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
        block26: {
            break block26;
lbl1:
            // 1 sources

            while (true) {
                var4_7 = 0;
                if (true) ** GOTO lbl58
                break;
            }
        }
        var8 = 2033499669;
        lg.a = mK.a(MethodHandles.lookup().lookupClass(), 980011427);
        var7_1 = 0;
        var6_2 = -290667509;
        var7_1 = var8 ^ -2117543686;
        block20: while (true) {
            switch (var7_1) {
                case -1425774542: {
                    var6_2 ^= var7_1 ^ -206339314;
                    var7_1 = var8 ^ 1199605578;
                    ** break;
                }
                case -117676305: {
                    var7_1 = var8 ^ -768551385;
                }
lbl18:
                // 3 sources

                default: {
                    continue block20;
                }
                case 1051998559: 
            }
            break;
        }
        var2_5 = (var6_2 | var7_1 ^ 1199605578) ^ (var7_1 ^ 1947448586) ^ lg.a;
        var6_2 ^= -1904162265;
        var0_3 = "S\u00be[L\u0002\nb7_\u00e1\u009c\u000b>\u00ff\u00e3G\u0084\u0084\u0018D\u00a0\u0011\u00eb\u00e0\u0005\u00efJ\u0083G\u00f1\u00e8g\u00ec\u00f6m\u00a7!2t \u00f8=ps".getBytes("ISO-8859-1");
        var6_2 ^= 2019625119;
        var1_4 = var0_3.length / 4;
        var7_1 = var8 ^ -1687565586;
        ** GOTO lbl68
lbl28:
        // 1 sources

        while (true) {
            var7_1 = var8 ^ -426740325;
            if (true) ** GOTO lbl68
            break;
        }
        block22: while (true) {
            switch (var7_1) {
                case 473152365: {
                    lg.a[var4_7] = var5_8 ^= var2_5;
                    ** GOTO lbl54
                }
                case -912513950: {
                    var3_6 += 4;
                    if (++var4_7 >= var1_4) {
                        ** break;
                    }
                    ** GOTO lbl58
                }
                case -189310545: {
                    var6_2 ^= var7_1 ^ -1674635512;
                    var7_1 = var8 ^ 490396206;
                }
                default: {
                    continue block22;
                }
lbl46:
                // 1 sources

                var7_1 = var8 ^ -1920735302;
                continue block22;
                case 1474343849: {
                    var6_2 ^= var7_1 ^ -437947716;
                    ** GOTO lbl56
                }
                case -1281330915: {
                    var6_2 ^= var7_1 ^ -819391494;
                    ** GOTO lbl61
                }
lbl54:
                // 1 sources

                var7_1 = var8 ^ -896217336;
                continue block22;
lbl56:
                // 1 sources

                var7_1 = var8 ^ 1694958968;
                continue block22;
lbl58:
                // 2 sources

                var5_8 = (var0_3[var3_6] & (((var6_2 ^= -829643790) | var8) ^ -46727672)) << ((var6_2 | var8) ^ -46727441) | (var0_3[var3_6 + 1] & ((var6_2 | var8) ^ -46727672)) << ((var6_2 | var8) ^ -46727449) | (var0_3[var3_6 + 2] & ((var6_2 | var8) ^ -46727672)) << ((var6_2 | var8) ^ -46727425) | var0_3[var3_6 + 3] & ((var6_2 | var8) ^ -46727672);
                var7_1 = var8 ^ 785649084;
                continue block22;
lbl61:
                // 1 sources

                var7_1 = var8 ^ -1331127689;
                continue block22;
                case 1678664763: 
            }
            break;
        }
        lg.a = gj.decode("Uw==", lg.Be((var6_2 | var7_1 ^ 490396206) ^ (var7_1 ^ 457302223), var7_1 ^ 490396206 ^ ((var6_2 | var7_1 ^ 490396206) ^ (var7_1 ^ 820560459))));
        return;
        while (true) {
            var7_1 = var8 ^ -7566023;
lbl68:
            // 3 sources

            block24: while (true) {
                switch (var7_1) {
                    default: {
                        continue block24;
                    }
                    case -1616589938: {
                        var6_2 ^= var7_1 ^ 1194046515;
                        var7_1 = var8 ^ 1587976428;
                        continue block24;
                    }
                    case 663889657: {
                        var3_6 = 0;
                        var6_2 ^= -1819760857;
                        ** continue;
                    }
                    case -2034748628: {
                        lg.a = new int[var1_4];
                        ** continue;
                    }
                    case -497191685: 
                }
                break;
            }
            var6_2 ^= var7_1 ^ -366050070;
        }
    }

    /*
     * Exception decompiling
     */
    private List<String> Bd(W var1_1, String var2_2, float var3_3, float var4_4) {
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
    public boolean wantsTooltip() {
        int n2 = a & 0x5622287 ^ 0x517F7231;
        int n3 = 0;
        int n4 = (n2 | 0x5622287) ^ 0xAF87C442;
        n3 = (n2 | 0x5622287) ^ 0x42C9C15;
        block5: while (true) {
            switch (n3) {
                case 1161396066: {
                    return this.a;
                }
                case 678495812: {
                    n4 ^= n3 ^ 0x2244B4E0;
                    n3 = (n2 | 0x5622287) ^ 0x10460DD5;
                }
                default: {
                    continue block5;
                }
                case 1364455074: 
            }
            n3 = (n2 | 0x5622287) ^ 0x7D0E74F3;
        }
    }

    private static int Be(int n2, int n3) {
        int n4 = 169155740;
        int n5 = -285183068;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xEB6C44F5)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xEF1560BA;
        n6 -= (n5 | n4) ^ 0xEF157E8E;
        n6 -= (n5 | n4) ^ 0xEF15E5EF;
        n6 -= (n5 | n4) ^ 0xEF15CBF8;
        n6 ^= (n5 | n4) ^ 0xEF1511CF;
        return n6 ^= (n5 | n4) ^ 0xEF153089;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean mouseDown(W var1_1, double var2_2, double var4_3, int var6_4) {
        block85: {
            block84: {
                block83: {
                    block79: {
                        block87: {
                            block82: {
                                block78: {
                                    block74: {
                                        block86: {
                                            block75: {
                                                block81: {
                                                    block80: {
                                                        block73: {
                                                            break block86;
lbl1:
                                                            // 1 sources

                                                            while (true) {
                                                                var9_7 = (var7_6 | var10_5) ^ 116197659;
                                                                ** GOTO lbl89
lbl4:
                                                                // 1 sources

                                                                while (true) {
                                                                    var8_8 ^= var9_7 ^ 1160167701;
                                                                    break block73;
                                                                    break;
                                                                }
lbl7:
                                                                // 1 sources

                                                                while (true) {
                                                                    this.a.run();
                                                                    var9_7 = (var7_6 | var10_5) ^ -1381002402;
                                                                    ** GOTO lbl89
                                                                    break;
                                                                }
lbl11:
                                                                // 1 sources

                                                                while (true) {
                                                                    var9_7 = (var7_6 | var10_5) ^ 1305856290;
                                                                    ** GOTO lbl89
                                                                    break;
                                                                }
lbl14:
                                                                // 1 sources

                                                                while (true) {
                                                                    var9_7 = (var7_6 | var10_5) ^ 1258207627;
                                                                    ** GOTO lbl89
                                                                    break;
                                                                }
lbl17:
                                                                // 1 sources

                                                                while (true) {
                                                                    var8_8 ^= var9_7 ^ -2100269298;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl20:
                                                                // 1 sources

                                                                while (true) {
                                                                    var9_7 = (var7_6 | var10_5) ^ -444932547;
                                                                    ** GOTO lbl89
                                                                    break;
                                                                }
                                                                break;
                                                            }
lbl23:
                                                            // 1 sources

                                                            while (true) {
                                                                var9_7 = (var7_6 | var10_5) ^ 1161598142;
                                                                ** GOTO lbl89
                                                                break;
                                                            }
                                                        }
                                                        var9_7 = (var7_6 | var10_5) ^ 1991503914;
                                                        ** GOTO lbl89
                                                        while (true) {
                                                            var9_7 = (var7_6 | var10_5) ^ 1940762665;
                                                            ** GOTO lbl89
lbl32:
                                                            // 1 sources

                                                            while (true) {
                                                                var9_7 = (var7_6 | var10_5) ^ 1012389429;
                                                                ** GOTO lbl89
                                                                break;
                                                            }
lbl35:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_8 ^= var9_7 ^ -414212538;
                                                                ** GOTO lbl135
                                                                break;
                                                            }
lbl38:
                                                            // 1 sources

                                                            while (true) {
                                                                var9_7 = (var7_6 | var10_5) ^ 944874027;
                                                                ** GOTO lbl89
lbl41:
                                                                // 1 sources

                                                                while (true) {
                                                                    var8_8 ^= var9_7 ^ 602162202;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl44:
                                                                // 1 sources

                                                                while (true) {
                                                                    var9_7 = (var7_6 | var10_5) ^ 41806771;
                                                                    ** GOTO lbl89
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        }
lbl47:
                                                        // 1 sources

                                                        block51: while (true) {
                                                            var9_7 = (var7_6 | var10_5) ^ -1592389154;
                                                            ** GOTO lbl89
lbl50:
                                                            // 1 sources

                                                            while (true) {
                                                                var9_7 = (var7_6 | var10_5) ^ -685692416;
                                                                ** GOTO lbl89
                                                                break;
                                                            }
lbl53:
                                                            // 1 sources

                                                            while (this.a.mouseDown(var1_1, var2_2, var4_3, var6_4)) {
                                                                ** continue;
lbl55:
                                                                // 1 sources

                                                                ** GOTO lbl20
                                                            }
                                                            break block74;
lbl57:
                                                            // 1 sources

                                                            while (true) {
                                                                var9_7 = (var7_6 | var10_5) ^ 1271340980;
                                                                ** GOTO lbl89
lbl60:
                                                                // 1 sources

                                                                while (true) {
                                                                    var8_8 ^= var9_7 ^ -281852130;
                                                                    ** continue;
                                                                    break;
                                                                }
                                                                block56: while (this.a.mouseDown(var1_1, var2_2, var4_3, var6_4)) {
                                                                    block77: {
                                                                        block76: {
                                                                            break block75;
lbl65:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var8_8 ^= var9_7 ^ -134195384;
                                                                                break block76;
                                                                                break;
                                                                            }
lbl68:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var9_7 = (var7_6 | var10_5) ^ 281542232;
                                                                                break block77;
                                                                                break;
                                                                            }
lbl71:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var8_8 ^= var9_7 ^ -757725292;
                                                                                ** continue;
                                                                                break;
                                                                            }
lbl74:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var8_8 ^= var9_7 ^ -257028684;
                                                                                break block78;
                                                                                break;
                                                                            }
lbl77:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var8_8 ^= var9_7 ^ -351367364;
                                                                                ** continue;
                                                                                break;
                                                                            }
lbl80:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var9_7 = (var7_6 | var10_5) ^ -1565061623;
                                                                                break block77;
                                                                                break;
                                                                            }
                                                                        }
                                                                        var9_7 = (var7_6 | var10_5) ^ -667208902;
                                                                        break block77;
lbl86:
                                                                        // 1 sources

                                                                        while (this.a.hasSettings()) {
                                                                            break block79;
                                                                        }
                                                                        break block80;
                                                                    }
lbl90:
                                                                    // 15 sources

                                                                    block64: while (true) {
                                                                        switch (var9_7) lbl-1000:
                                                                        // 5 sources

                                                                        {
                                                                            while (true) {
                                                                                default: {
                                                                                    continue block64;
                                                                                }
                                                                                break;
                                                                            }
                                                                            case -273560747: {
                                                                                ** continue;
                                                                            }
                                                                            case -1595058836: {
                                                                                ** continue;
                                                                            }
                                                                            case -270997441: {
                                                                                break block81;
                                                                            }
                                                                            case 1104430696: {
                                                                                ** continue;
                                                                            }
                                                                            case 1478828042: {
                                                                                ** continue;
                                                                            }
                                                                            case -1145899220: {
                                                                                ** continue;
                                                                            }
                                                                            case 2145628702: {
                                                                                ** GOTO lbl53
                                                                            }
                                                                            case 912867533: {
                                                                                ** continue;
                                                                            }
                                                                            case -259377387: {
                                                                                continue block56;
                                                                            }
                                                                            case -822981090: {
                                                                                ** continue;
                                                                            }
                                                                            case -157752957: {
                                                                                break block51;
                                                                            }
                                                                            case -55652206: {
                                                                                ** continue;
                                                                            }
                                                                            case 2108184655: {
                                                                                ** continue;
                                                                            }
                                                                            case -1716244598: {
                                                                                ** continue;
                                                                            }
                                                                            case -1088285308: {
                                                                                ** GOTO lbl86
                                                                            }
lbl125:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var9_7 = (var7_6 | var10_5) ^ 1385958231;
                                                                                ** GOTO lbl-1000
                                                                                break;
                                                                            }
lbl128:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var9_7 = (var7_6 | var10_5) ^ -2133450351;
                                                                                ** GOTO lbl-1000
                                                                                break;
                                                                            }
                                                                            case -1382547345: {
                                                                                return true;
                                                                            }
                                                                            case -140425284: {
                                                                                return true;
                                                                            }
lbl135:
                                                                            // 1 sources

                                                                            var9_7 = (var7_6 | var10_5) ^ -1746295118;
                                                                            ** GOTO lbl-1000
lbl137:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var9_7 = (var7_6 | var10_5) ^ -396575547;
                                                                                ** continue;
                                                                                break;
                                                                            }
                                                                            case -2130171902: {
                                                                                if (var6_4 != 0) break block82;
                                                                                break block83;
                                                                            }
                                                                            case 1786696759: {
                                                                                this.setPressed(true);
                                                                                ** continue;
                                                                            }
                                                                            case -127702391: {
                                                                                this.a.toggle();
                                                                                ** continue;
                                                                            }
                                                                            case 1541633638: {
                                                                                this.requestFocus(var1_1);
                                                                                break block84;
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                break block85;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        var9_7 = (var7_6 | var10_5) ^ -1027847127;
                                                        ** GOTO lbl90
                                                        {
                                                            case 535359550: {
                                                                ** continue;
                                                            }
                                                        }
                                                    }
                                                    while (true) {
                                                        var9_7 = (var7_6 | var10_5) ^ 619434429;
                                                        ** GOTO lbl90
                                                        break;
                                                    }
lbl161:
                                                    // 1 sources

                                                    while (true) {
                                                        var9_7 = (var7_6 | var10_5) ^ -423851951;
                                                        ** GOTO lbl90
                                                        break;
                                                    }
                                                }
                                                var9_7 = (var7_6 | var10_5) ^ 1391342946;
                                                ** GOTO lbl90
                                                {
                                                    case 1840041452: {
                                                        return true;
                                                    }
                                                    case -2062656484: {
                                                        return false;
                                                    }
                                                }
                                            }
                                            var9_7 = (var7_6 | var10_5) ^ 1106325157;
                                            ** GOTO lbl90
                                        }
                                        var10_5 = -1138771913;
                                        var7_6 = lg.a & -1138771913 ^ -1455208953;
                                        var9_7 = 0;
                                        break block87;
                                        {
                                            case 1498388691: {
                                                var8_8 ^= var9_7 ^ -1348419671;
                                                ** continue;
                                            }
                                            case 1426277106: {
                                                var8_8 ^= var9_7 ^ -766052353;
                                                ** continue;
                                            }
                                            case 1032445862: {
                                                if (var6_4 != 1) ** continue;
                                                ** continue;
                                            }
                                        }
                                    }
                                    while (true) {
                                        var9_7 = (var7_6 | var10_5) ^ -57952161;
                                        ** GOTO lbl90
                                        break;
                                    }
                                    {
                                        case 1701104909: {
                                            if (!this.a.hasSettings()) ** continue;
                                            ** continue;
                                        }
                                    }
                                }
                                var9_7 = (var7_6 | var10_5) ^ 498248539;
                                ** GOTO lbl90
                                {
                                    case 474607593: {
                                        var8_8 ^= var9_7 ^ -370746436;
                                        ** continue;
                                    }
                                    case -873722339: {
                                        if (this.contains(var2_2, var4_3)) ** continue;
                                        ** continue;
                                    }
                                    case -2112830656: {
                                        var8_8 ^= var9_7 ^ 190400415;
                                        ** continue;
                                    }
                                    case -272370336: {
                                        return true;
                                    }
                                }
lbl209:
                                // 1 sources

                                while (true) {
                                    var9_7 = (var7_6 | var10_5) ^ -789367845;
                                    ** GOTO lbl90
                                    break;
                                }
                            }
                            var9_7 = (var7_6 | var10_5) ^ -181582910;
                            ** GOTO lbl90
                        }
                        var8_8 = (var7_6 | var10_5) ^ -485156645;
                        var9_7 = (var7_6 | var10_5) ^ 1384584712;
                        ** GOTO lbl90
                    }
                    var9_7 = (var7_6 | var10_5) ^ -1057511816;
                    ** GOTO lbl90
                }
                var9_7 = (var7_6 | var10_5) ^ 1062157687;
                ** GOTO lbl90
            }
            var9_7 = (var7_6 | var10_5) ^ -1959346438;
            ** GOTO lbl90
        }
        var9_7 = (var7_6 | var10_5) ^ -468687132;
        ** while (true)
        {
            case 1215479285: {
                var8_8 ^= var9_7 ^ -2115374202;
                ** continue;
            }
            case 284192105: {
                var8_8 ^= var9_7 ^ -603029118;
                ** continue;
            }
            ** case 716593285:
        }
lbl238:
        // 1 sources

        return true;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public boolean mouseUp(W var1_1, double var2_2, double var4_3, int var6_4) {
        var11_5 = -884787055;
        var8_6 = lg.a & -884787055 ^ 183482283;
        var10_7 = 0;
        var9_9 = (var8_6 | var11_5) ^ -1544478970;
        var10_7 = (var8_6 | var11_5) ^ -15462515;
        block17: while (true) {
            switch (var10_7) {
                default: {
                    continue block17;
                }
                case 888909878: {
                    var10_7 = (var8_6 | var11_5) ^ -1694371532;
                    continue block17;
                }
                case 1357794959: {
                    var9_9 ^= var10_7 ^ 639422092;
                    break;
                }
                case 231610141: {
                    var7_8 = this.a.mouseUp(var1_1, var2_2, var4_3, var6_4);
                    break block17;
                }
            }
            var10_7 = (var8_6 | var11_5) ^ -970872666;
        }
        var10_7 = (var8_6 | var11_5) ^ -298378864;
        if (true) ** GOTO lbl25
        block18: while (true) {
            var10_7 = (var8_6 | var11_5) ^ -1567144664;
lbl25:
            // 2 sources

            block19: while (true) {
                switch (var10_7) {
                    case 77619817: {
                        ** break;
                    }
                    case 1769536147: {
                        var9_9 ^= var10_7 ^ 777700247;
                        var10_7 = (var8_6 | var11_5) ^ -179688286;
                        continue block19;
                    }
                    case 77060011: {
                        var9_9 ^= var10_7 ^ -541686337;
                        var10_7 = (var8_6 | var11_5) ^ 1740953617;
                        continue block19;
                    }
                    case 634955307: {
                        var9_9 ^= var10_7 ^ -744955525;
                        var10_7 = (var8_6 | var11_5) ^ -685133526;
                        continue block19;
                    }
                    case 672204004: {
                        if (!this.f) continue block18;
                        var10_7 = (var8_6 | var11_5) ^ -566509888;
                        continue block19;
                    }
                    case -631115235: {
                        this.setPressed(false);
                        var10_7 = (var8_6 | var11_5) ^ -814192624;
                        continue block19;
                    }
                    case -1406441558: {
                        var7_8 = true;
                        continue block18;
                    }
                    case 366215547: {
                        var9_9 ^= var10_7 ^ -822783121;
                        var10_7 = (var8_6 | var11_5) ^ 294538662;
                    }
                    default: {
                        continue block19;
                    }
lbl57:
                    // 1 sources

                    var10_7 = (var8_6 | var11_5) ^ -469845153;
                    continue block19;
                    case 482741905: {
                        if (var6_4 == 0) ** break;
                        continue block18;
                        var10_7 = (var8_6 | var11_5) ^ -816849454;
                        continue block19;
                    }
                    case 1051038489: 
                }
                break;
            }
            break;
        }
        return var7_8;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean isFocusable() {
        block9: {
            block10: {
                break block10;
lbl1:
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
                        case -1774260007: {
                            return true;
                        }
lbl8:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 284704176) ^ -1430057629;
                            ** GOTO lbl-1000
                            break;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 284704176) ^ 617124693;
                            ** continue;
                            break;
                        }
                        case 406154991: {
                            break block9;
                        }
                        case 2044453390: {
                            var2_3 ^= var3_2 ^ 1077364922;
                            break block5;
                        }
                    }
                    break;
                }
                ** while (true)
            }
            var1_1 = lg.a & 284704176 ^ 752213290;
            var3_2 = 0;
            var2_3 = (var1_1 | 284704176) ^ 1798460947;
            ** while (true)
        }
        var3_2 = (var1_1 | 284704176) ^ 1160126388;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean key(W var1_1, int var2_2, int var3_3) {
        block41: {
            block40: {
                block44: {
                    block42: {
                        block43: {
                            block46: {
                                block45: {
                                    break block45;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        var5_7 ^= var6_6 ^ -659079942;
                                        break block40;
                                        break;
                                    }
                                }
                                var7_4 = -1552819408;
                                var4_5 = lg.a & -1552819408 ^ 931481574;
                                var6_6 = 0;
                                var5_7 = (var4_5 | var7_4) ^ 1649749460;
                                break block46;
lbl10:
                                // 1 sources

                                while (true) {
                                    if (var2_2 == lg.Be((var5_7 | var6_6 ^ 1028434923) ^ (var6_6 ^ 700298413), (var4_5 | var6_6 ^ 1028434923) ^ ((var5_7 | var6_6 ^ 1028434923) ^ (var6_6 ^ 631843290)))) break block41;
                                    var6_6 = (var4_5 | var7_4) ^ 1073009706;
                                    ** GOTO lbl79
                                    break;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    var5_7 ^= var6_6 ^ -237107974;
                                    break block42;
                                    break;
                                }
                                while (true) {
                                    var6_6 = (var4_5 | var7_4) ^ -1429415869;
                                    ** GOTO lbl79
lbl20:
                                    // 1 sources

                                    while (true) {
                                        var5_7 ^= var6_6 ^ -1095503958;
                                        var6_6 = (var4_5 | var7_4) ^ 207206592;
                                        ** GOTO lbl79
                                        break;
                                    }
lbl24:
                                    // 1 sources

                                    while (true) {
                                        if (var1_1.a.isFocused(this)) break block43;
                                        ** GOTO lbl110
                                        break;
                                    }
lbl27:
                                    // 1 sources

                                    while (true) {
                                        var6_6 = (var4_5 | var7_4) ^ -959064599;
                                        ** GOTO lbl79
                                        break;
                                    }
                                    break;
                                }
                            }
                            var6_6 = (var4_5 | var7_4) ^ 45418541;
                            ** GOTO lbl79
                        }
                        var6_6 = (var4_5 | var7_4) ^ -1178757994;
                        ** GOTO lbl79
lbl36:
                        // 1 sources

                        return true;
lbl38:
                        // 1 sources

                        while (true) {
                            var6_6 = (var4_5 | var7_4) ^ -809280495;
                            ** GOTO lbl79
lbl41:
                            // 1 sources

                            while (true) {
                                if (var2_2 == lg.Be((var5_7 | var6_6 ^ 17478730) ^ (var6_6 ^ 368814851), (var4_5 | var6_6 ^ 17478730) ^ ((var5_7 | var6_6 ^ 17478730) ^ (var6_6 ^ -1293374346)))) break block41;
                                ** continue;
                                break;
                            }
                            break;
                        }
lbl44:
                        // 1 sources

                        while (true) {
                            var6_6 = (var4_5 | var7_4) ^ 701017901;
                            ** GOTO lbl79
lbl47:
                            // 1 sources

                            while (true) {
                                var6_6 = (var4_5 | var7_4) ^ 361672844;
                                ** GOTO lbl79
lbl50:
                                // 1 sources

                                while (true) {
                                    var5_7 ^= var6_6 ^ -1710689528;
                                    break block44;
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                    }
                    var6_6 = (var4_5 | var7_4) ^ 1714642695;
                    ** GOTO lbl79
                }
                var6_6 = (var4_5 | var7_4) ^ 1593627790;
                ** GOTO lbl79
lbl59:
                // 1 sources

                while (true) {
                    var6_6 = (var4_5 | var7_4) ^ -1214104011;
                    ** GOTO lbl79
                    break;
                }
            }
            var6_6 = (var4_5 | var7_4) ^ -2095465819;
            ** GOTO lbl79
lbl65:
            // 1 sources

            return false;
lbl67:
            // 1 sources

            while (true) {
                var6_6 = (var4_5 | var7_4) ^ 980968413;
                ** GOTO lbl79
                break;
            }
        }
        block35: while (true) {
            var6_6 = (var4_5 | var7_4) ^ -274284517;
            if (true) ** GOTO lbl79
lbl74:
            // 1 sources

            while (true) {
                var5_7 ^= var6_6 ^ 398339086;
                ** continue;
                break;
            }
            block37: while (true) {
                var6_6 = (var4_5 | var7_4) ^ 1809588816;
lbl79:
                // 16 sources

                block38: while (true) {
                    switch (var6_6) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block38;
                            }
                            break;
                        }
                        case 104108544: {
                            ** continue;
                        }
                        case -1640140581: {
                            ** continue;
                        }
                        case 2016838631: {
                            ** continue;
                        }
                        case 490276789: {
                            ** continue;
                        }
                        case -385283208: {
                            ** continue;
                        }
                        case -775520015: {
                            ** continue;
                        }
                        case -1568968838: {
                            ** continue;
                        }
                        case -1920091093: {
                            ** continue;
                        }
                        case -1146329290: {
                            ** continue;
                        }
                        case -1254041637: {
                            ** continue;
                        }
                        case 1481842669: {
                            ** continue;
                        }
                        case 1897925151: {
                            continue block37;
                        }
                        case -2013197348: {
                            ** continue;
                        }
lbl110:
                        // 1 sources

                        var6_6 = (var4_5 | var7_4) ^ -1312731658;
                        ** continue;
                        case 5759427: {
                            this.a.toggle();
                            ** continue;
                        }
                        case -601227866: {
                            if (var2_2 != lg.Be((var5_7 | var6_6 ^ 2136483478) ^ (var6_6 ^ 1806252510), (var4_5 | var6_6 ^ 2136483478) ^ ((var5_7 | var6_6 ^ 2136483478) ^ (var6_6 ^ 25049553)))) ** continue;
                            continue block35;
                        }
                        case 887907667: {
                            return false;
                        }
                        case 239618912: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        var5_7 ^= var6_6 ^ -544929159;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void Bf(gF var0, Boolean var1_1) {
        block16: {
            var5_2 = 2095882746;
            var2_3 = lg.a & 2095882746 ^ 1991503378;
            var4_4 = 0;
            var3_5 = (var2_3 | var5_2) ^ 1780333690;
            ** GOTO lbl29
lbl6:
            // 1 sources

            return;
lbl8:
            // 1 sources

            while (true) {
                var3_5 ^= var4_4 ^ -1817078243;
                ** GOTO lbl40
                break;
            }
lbl11:
            // 1 sources

            block11: while (true) {
                var4_4 = (var2_3 | var5_2) ^ -1678392530;
lbl13:
                // 3 sources

                block12: while (true) {
                    switch (var4_4) lbl-1000:
                    // 5 sources

                    {
                        while (true) {
                            default: {
                                continue block12;
                            }
                            break;
                        }
                        case 1884741486: {
                            ** continue;
                        }
                        case 1276759337: {
                            ** continue;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 853942995;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 501783105: {
                            ** continue;
                        }
                        case 1321793731: {
                            break block11;
                        }
lbl29:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ 1662481851;
                        ** GOTO lbl-1000
                        case -746630192: {
                            var0.toggleManually();
                            continue block11;
                        }
                        case -452317996: {
                            var3_5 ^= var4_4 ^ -154670224;
                            break block16;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 808916793;
                            ** GOTO lbl-1000
                            break;
                        }
lbl40:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ 131338410;
                        ** continue;
                    }
                    break;
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ -1384072150;
            ** GOTO lbl13
            {
                ** case 2032926544:
            }
lbl45:
            // 1 sources

            if (var1_1.booleanValue() != var0.isEnabled()) ** break;
            ** while (true)
            ** while (true)
        }
        var4_4 = (var2_3 | var5_2) ^ 245969044;
        ** while (true)
    }
}

