/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import z.r.iU;
import z.r.ih;
import z.r.ke;
import z.r.lZ;
import z.r.mA;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class jY {
    private final iU a;
    private final ke a;
    private final Object a;
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), -47477243);
    public final Random a;
    private final ih a;
    private final lZ a;
    private final ke b;

    /*
     * Enabled aggressive block sorting
     */
    public jY(ih ih2, ke ke2, iU iU2, ke ke3, Object object) {
        int n2 = 1479638860;
        int n3 = a & 0x58317F4C ^ 0x1799479F;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x11CA77DC;
        n5 ^= 0x7AC2E1C4;
        n4 = (n3 | n2) ^ 0xD71DF200;
        block18: while (true) {
            switch (n4) {
                default: {
                    continue block18;
                }
                case 1206261857: {
                    this.a = new lZ(System.nanoTime());
                    n4 = (n3 | n2) ^ 0x2E00C7B6;
                    continue block18;
                }
                case -292244591: {
                    this.a = ih2;
                    n4 = (n3 | n2) ^ 0xE7CEE2F2;
                    continue block18;
                }
                case -1200120531: {
                    n5 ^= n4 ^ 0xB57E6D22;
                    n4 = (n3 | n2) ^ 0x7EC919DE;
                    continue block18;
                }
                case 626879847: {
                    n5 ^= n4 ^ 0x43D2A313;
                    n4 = (n3 | n2) ^ 0x47CCC80C;
                    continue block18;
                }
                case 1746801700: {
                    n5 ^= n4 ^ 0x7AD7AC84;
                    n4 = (n3 | n2) ^ 0xAE782706;
                    continue block18;
                }
                case 410367955: {
                    this.a = iU2;
                    n4 = (n3 | n2) ^ 0xE074D33D;
                    continue block18;
                }
                case -1775079749: {
                    n5 ^= n4 ^ 0xEC4FC1D5;
                    n4 = (n3 | n2) ^ 0x185F67BE;
                    continue block18;
                }
                case -2002481697: {
                    n5 ^= n4 ^ 0x3F054B93;
                    n4 = (n3 | n2) ^ 0x8F7994CB;
                    continue block18;
                }
                case -238987047: {
                    this.a = object;
                    n4 = (n3 | n2) ^ 0xC98B1164;
                    continue block18;
                }
                case -792663276: {
                    this.a = new Random();
                    n4 = (n3 | n2) ^ 0xEF257F6E;
                    continue block18;
                }
                case -1331953487: {
                    n5 ^= n4 ^ 0xB1464B9A;
                    n4 = (n3 | n2) ^ 0xB12DCC4E;
                    continue block18;
                }
                case 561014273: {
                    this.b = ke2;
                    n4 = (n3 | n2) ^ 0x7AE412B8;
                    continue block18;
                }
                case -1077039902: {
                    n5 ^= n4 ^ 0x4E4336E2;
                    n4 = (n3 | n2) ^ 0x83C4EAFC;
                    continue block18;
                }
                case -595749597: {
                    this.a = ke3;
                    n4 = (n3 | n2) ^ 0x37A76BFB;
                    continue block18;
                }
                case 1907996777: {
                    n5 ^= n4 ^ 0x9AFFD19;
                    n4 = (n3 | n2) ^ 0xC1D558FD;
                    continue block18;
                }
                case -1637079262: 
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public ih getCpsRange() {
        int n2 = a & 0xB668748B ^ 0xA4C96B85;
        int n3 = 0;
        int n4 = (n2 | 0xB668748B) ^ 0x8FE95F8A;
        n3 = (n2 | 0xB668748B) ^ 0x71966EE0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -689686319: {
                    return this.a;
                }
                case -947973777: {
                    n3 = (n2 | 0xB668748B) ^ 0x1DB84C3C;
                    continue block5;
                }
                case -1420741709: 
            }
            n4 ^= n3 ^ 0x83317B51;
            n3 = (n2 | 0xB668748B) ^ 0x600D475E;
        }
    }

    /*
     * Unable to fully structure code
     */
    public long calculateNextClickDelay() {
        block23: {
            block25: {
                block24: {
                    break block25;
lbl1:
                    // 1 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ 417333645;
                        break block23;
lbl4:
                        // 1 sources

                        while (true) {
                            var4_6 ^= var5_3 ^ -1802496737;
                            break block24;
                            break;
                        }
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var2_5 = this.a.getMaximumInt();
                        ** GOTO lbl57
                        break;
                    }
                }
                var5_3 = (var3_2 | var6_1) ^ 1710384014;
                break block23;
lbl13:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ 1697380976;
                    ** GOTO lbl44
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -390073267;
                    ** GOTO lbl44
                    break;
                }
            }
            var6_1 = -1399109200;
            var3_2 = jY.a & -1399109200 ^ 1434522129;
            var5_3 = 0;
            var4_6 = (var3_2 | var6_1) ^ 1795623867;
            ** while (true)
lbl25:
            // 1 sources

            while (true) {
                var4_6 ^= var5_3 ^ -2012079368;
                ** GOTO lbl36
                break;
            }
        }
        block17: while (true) {
            switch (var5_3) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block17;
                    }
                    break;
                }
                case -1201282330: {
                    ** continue;
                }
lbl36:
                // 1 sources

                var5_3 = (var3_2 | var6_1) ^ -1308168989;
                ** GOTO lbl44
lbl38:
                // 1 sources

                while (true) {
                    var4_6 ^= 1267094752;
                    ** continue;
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    var1_4 = this.a.getMinimumInt();
                    ** continue;
                    break;
                }
lbl44:
                // 3 sources

                block21: while (true) {
                    switch (var5_3) {
                        default: {
                            continue block21;
                        }
                        case -1733254719: {
                            ** continue;
                        }
                        case 1335736146: {
                            ** continue;
                        }
                        case 354725884: 
                    }
                    break;
                }
                ** continue;
lbl54:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -2040333621;
                    ** GOTO lbl-1000
                    break;
                }
lbl57:
                // 1 sources

                var5_3 = (var3_2 | var6_1) ^ 1174321495;
                ** continue;
                case -1737934785: {
                    this.a.configureCpsRange(var1_4, var2_5);
                    ** continue;
                }
                case 2079957370: {
                    var4_6 ^= var5_3 ^ 1105792296;
                    ** continue;
                }
                case -444900804: 
            }
            break;
        }
        return this.a.getNextDelayMillis();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void pressClickButton() {
        int n2 = 1990071983;
        int n3 = a & 0x769E16AF ^ 0x7A7C4BCF;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xE7E2395;
        n4 = (n3 | n2) ^ 0xE8155C47;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1925253198: {
                    mA.requestSyntheticAttack(this.a);
                    n4 = (n3 | n2) ^ 0x3B9DCDE8;
                    continue block7;
                }
                case -1762983000: {
                    n4 = (n3 | n2) ^ 0xECEB5C28;
                    continue block7;
                }
                case -1844116537: {
                    n5 ^= n4 ^ 0xFB00D863;
                    n4 = (n3 | n2) ^ 0xF3C0A85D;
                    continue block7;
                }
                case 1164153351: {
                    n5 ^= n4 ^ 0xED7C75B0;
                    n4 = (n3 | n2) ^ 0x51F102E7;
                    continue block7;
                }
                case 789536008: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void releaseClickButton() {
        block12: {
            block13: {
                break block13;
lbl1:
                // 1 sources

                block7: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 808225184;
                    if (true) ** GOTO lbl6
                    block8: while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 2078343779;
lbl6:
                        // 4 sources

                        block9: while (true) {
                            switch (var3_3) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block9;
                                    }
                                    break;
                                }
                                case -296092033: {
                                    break block12;
                                }
                                case 878070229: {
                                    mA.releaseAttackKey();
                                    break block7;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -366789110;
                                    ** continue;
                                    break;
                                }
                                case 2092421950: {
                                    var2_4 ^= var3_3 ^ 1208848530;
                                    continue block8;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ -1564302111;
                ** GOTO lbl6
            }
            var4_1 = 1512112527;
            var1_2 = jY.a & 1512112527 ^ -562726949;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ 1591544601;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ -1326564992;
        ** while (true)
        {
            case -1516997188: {
                return;
            }
            ** case 1855671903:
        }
lbl36:
        // 1 sources

        var2_4 ^= var3_3 ^ -486039077;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private boolean HQ() {
        block42: {
            block37: {
                block36: {
                    block33: {
                        block35: {
                            block39: {
                                block38: {
                                    block34: {
                                        block41: {
                                            block40: {
                                                var5_1 = 1164378628;
                                                var2_2 = jY.a & 1164378628 ^ 2124346279;
                                                var4_3 = 0;
                                                break block40;
lbl5:
                                                // 1 sources

                                                return this.a.matchesHeldItem();
                                                while (true) {
                                                    var4_3 = (var2_2 | var5_1) ^ 990875219;
                                                    break block33;
                                                    break;
                                                }
                                            }
                                            var3_4 = (var2_2 | var5_1) ^ 1641987053;
                                            break block41;
lbl13:
                                            // 1 sources

                                            while (true) {
                                                var4_3 = (var2_2 | var5_1) ^ 2097215112;
                                                break block34;
                                                break;
                                            }
lbl16:
                                            // 1 sources

                                            while (var1_5.field_1755 != null) {
                                                break block35;
lbl18:
                                                // 1 sources

                                                while (true) {
                                                    if (((Boolean)this.b.getValue()).booleanValue()) ** continue;
                                                    ** GOTO lbl43
                                                    break;
                                                }
                                            }
                                            break block42;
                                        }
                                        var4_3 = (var2_2 | var5_1) ^ -1971443173;
                                        break block34;
lbl25:
                                        // 1 sources

                                        while (true) {
                                            var3_4 ^= var4_3 ^ -1775070961;
                                            break block36;
                                            break;
                                        }
                                    }
lbl29:
                                    // 2 sources

                                    block23: while (true) {
                                        switch (var4_3) {
                                            default: {
                                                continue block23;
                                            }
                                            case -176039492: {
                                                break block37;
                                            }
lbl35:
                                            // 1 sources

                                            while (true) {
                                                var3_4 ^= var4_3 ^ 1959222888;
                                                ** GOTO lbl59
                                                break;
                                            }
lbl38:
                                            // 1 sources

                                            return true;
lbl40:
                                            // 1 sources

                                            while (true) {
                                                var4_3 = (var2_2 | var5_1) ^ -607285799;
                                                break block33;
                                                break;
                                            }
lbl43:
                                            // 1 sources

                                            var4_3 = (var2_2 | var5_1) ^ -447558347;
                                            break block33;
lbl45:
                                            // 1 sources

                                            while (true) {
                                                var4_3 = (var2_2 | var5_1) ^ -279751401;
                                                break block33;
                                                break;
                                            }
lbl48:
                                            // 1 sources

                                            while (true) {
                                                var3_4 ^= var4_3 ^ -1729739904;
                                                break block38;
                                                break;
                                            }
lbl51:
                                            // 1 sources

                                            return true;
lbl53:
                                            // 1 sources

                                            while (true) {
                                                var3_4 ^= var4_3 ^ -250401974;
                                                break block39;
                                                break;
                                            }
lbl56:
                                            // 1 sources

                                            while (true) {
                                                var3_4 ^= var4_3 ^ -1705178268;
                                                ** continue;
                                                break;
                                            }
lbl59:
                                            // 1 sources

                                            var4_3 = (var2_2 | var5_1) ^ -1504678025;
                                            break block33;
                                            case 1884009861: {
                                                var3_4 ^= var4_3 ^ -492181351;
                                                ** continue;
                                            }
                                            case 50267439: {
                                                var1_5 = class_310.method_1551();
                                                break block23;
                                            }
                                        }
                                        break;
                                    }
                                    ** while (true)
                                }
                                var4_3 = (var2_2 | var5_1) ^ -2134273148;
                                break block33;
                            }
                            var4_3 = (var2_2 | var5_1) ^ -763139405;
                            break block33;
                        }
                        var4_3 = (var2_2 | var5_1) ^ -216465367;
                    }
lbl77:
                    // 3 sources

                    block32: while (true) {
                        switch (var4_3) {
                            default: {
                                continue block32;
                            }
                            case -13213661: {
                                ** continue;
                            }
                            case -498258655: {
                                ** GOTO lbl16
                            }
                            case -1384343276: {
                                ** continue;
                            }
                            case -1540194690: {
                                ** continue;
                            }
                            case -1931021426: {
                                ** continue;
                            }
                            case -642802480: {
                                ** continue;
                            }
                            case 1156611572: {
                                ** continue;
                            }
                            case -1867733328: {
                                ** continue;
                            }
                            case -779311897: {
                                ** continue;
                            }
                            ** case -1699922286:
lbl100:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
                }
                var4_3 = (var2_2 | var5_1) ^ -1649222010;
                ** GOTO lbl77
            }
            var4_3 = (var2_2 | var5_1) ^ 263472674;
            ** while (true)
        }
        var4_3 = (var2_2 | var5_1) ^ -1368172736;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean canClick() {
        var5_1 = -222835400;
        var2_2 = jY.a & -222835400 ^ -1746673299;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ 1912637716;
        var4_3 = (var2_2 | var5_1) ^ 1953692359;
        ** GOTO lbl39
lbl7:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ 358373652;
            ** GOTO lbl18
            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 452832397;
                ** GOTO lbl18
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 1528307227;
                if (true) ** GOTO lbl18
                break;
            }
            break;
        }
        block16: while (true) {
            var4_3 = (var2_2 | var5_1) ^ -81085191;
lbl18:
            // 4 sources

            block17: while (true) {
                switch (var4_3) {
                    default: {
                        continue block17;
                    }
                    case 215830916: {
                        if (var1_4.field_1724 != null) ** continue;
                        var4_3 = (var2_2 | var5_1) ^ -888163363;
                        continue block17;
                    }
                    case -318094864: {
                        var3_5 ^= var4_3 ^ -1577268883;
                        ** continue;
                    }
                    case 1022910112: {
                        var3_5 ^= var4_3 ^ -438282650;
                        ** continue;
                    }
                    case 1775806208: {
                        var3_5 ^= var4_3 ^ 1978186240;
                        continue block16;
                    }
                    case -1393560730: {
                        return this.HQ();
                    }
                    case -492063639: {
                        return false;
                    }
lbl39:
                    // 1 sources

                    block18: while (true) {
                        switch (var4_3) {
                            default: {
                                continue block18;
                            }
                            case 944988640: {
                                var1_4 = class_310.method_1551();
                                var4_3 = (var2_2 | var5_1) ^ -1641067907;
                                continue block17;
                            }
                            case -2088429638: {
                                var4_3 = (var2_2 | var5_1) ^ -989224144;
                                continue block18;
                            }
                            case 855526989: 
                        }
                        var3_5 ^= var4_3 ^ 219391232;
                        var4_3 = (var2_2 | var5_1) ^ -811299683;
                    }
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
    public boolean isActivationHeld() {
        block19: {
            var5_1 = 1900181997;
            var2_2 = jY.a & 1900181997 ^ 1679134413;
            var4_3 = 0;
            var3_5 = (var2_2 | var5_1) ^ -2119561898;
            var4_3 = (var2_2 | var5_1) ^ -159492095;
            break block19;
lbl7:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ -1770152790;
                ** GOTO lbl35
lbl10:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -646481274;
                    ** GOTO lbl35
                    break;
                }
                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -927104204;
                    ** GOTO lbl35
                    break;
                }
                break;
            }
        }
        block16: while (true) {
            switch (var4_3) {
                default: {
                    continue block16;
                }
                case -2129544220: {
                    var3_5 ^= var4_3 ^ -1368358736;
                    break;
                }
                case -2094422036: {
                    var4_3 = (var2_2 | var5_1) ^ -196721655;
                    continue block16;
                }
                case 126027130: {
                    var1_4 = class_310.method_1551();
                    var4_3 = (var2_2 | var5_1) ^ -2092768220;
                    if (true) ** GOTO lbl35
                }
            }
            var4_3 = (var2_2 | var5_1) ^ 1926560407;
        }
        block17: while (true) {
            var4_3 = (var2_2 | var5_1) ^ -798388684;
lbl35:
            // 5 sources

            block18: while (true) {
                switch (var4_3) {
                    case -1108706087: {
                        var3_5 ^= var4_3 ^ -1875035858;
                        var4_3 = (var2_2 | var5_1) ^ 1991764095;
                    }
                    default: {
                        continue block18;
                    }
                    case -1522634279: {
                        var3_5 ^= var4_3 ^ -497845727;
                        ** continue;
                    }
                    case -483761337: {
                        if (((Boolean)this.a.getValue()).booleanValue()) ** continue;
                        continue block17;
                    }
                    case -166388791: {
                        var3_5 ^= var4_3 ^ 763310041;
                        ** continue;
                    }
                    case -1407154837: {
                        return var1_4.method_1569();
                    }
                    case 65017746: 
                }
                break;
            }
            break;
        }
        return mA.isAttackButtonDown();
    }
}

