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
import z.r.cm;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class ep {
    private final float a;
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), -1375447109);
    private final float b;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ep(float var1_1, float var2_2) {
        var6_3 = 1457071113;
        var3_4 = ep.a & 1457071113 ^ -668040902;
        var5_5 = 0;
        var4_6 = (var3_4 | var6_3) ^ 627908187;
        var4_6 ^= 1919777707;
        super();
        var5_5 = (var3_4 | var6_3) ^ -2137905985;
        ** GOTO lbl14
lbl9:
        // 1 sources

        while (true) {
            var5_5 = (var3_4 | var6_3) ^ 677441136;
            if (true) ** GOTO lbl14
            break;
        }
        block9: while (true) {
            var5_5 = (var3_4 | var6_3) ^ -994853375;
lbl14:
            // 3 sources

            block10: while (true) {
                switch (var5_5) {
                    default: {
                        continue block10;
                    }
                    case -157332661: {
                        this.b = var2_2;
                        var5_5 = (var3_4 | var6_3) ^ -262524320;
                        continue block10;
                    }
                    case 1138716: {
                        this.a = var1_1;
                        var5_5 = (var3_4 | var6_3) ^ 2040536460;
                        continue block10;
                    }
                    case -1486899017: {
                        var4_6 ^= var5_5 ^ 532315235;
                        ** continue;
                    }
                    case 782604123: {
                        var4_6 ^= var5_5 ^ 872815253;
                        continue block9;
                    }
                    case 1584234884: {
                        var4_6 ^= var5_5 ^ 1571656793;
                        var5_5 = (var3_4 | var6_3) ^ -554777305;
                        continue block10;
                    }
                    case 441195322: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public ep(double d2, double d3) {
        int n2 = a & 0xDDB0604 ^ 0x5334E6A1;
        int n3 = (n2 | 0xDDB0604) ^ 0x8D42EE5F;
        n3 ^= 0x1D63962A;
        this((float)d2, (float)d3);
        n3 ^= 0xC892C0F2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float getYaw() {
        int n2 = a & 0xA4E9081F ^ 0x4BAA5DC4;
        int n3 = 0;
        int n4 = (n2 | 0xA4E9081F) ^ 0x2B27D8EB;
        n3 = (n2 | 0xA4E9081F) ^ 0x1746B430;
        block5: while (true) {
            switch (n3) {
                case -122820113: {
                    break;
                }
                case 1402719476: {
                    n4 ^= n3 ^ 0x94244DFF;
                    n3 = (n2 | 0xA4E9081F) ^ 0xC68B834B;
                }
                default: {
                    continue block5;
                }
                case 694214292: {
                    return this.a;
                }
            }
            n3 = (n2 | 0xA4E9081F) ^ 0xBC70912B;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public float getPitch() {
        int n2 = a & 0x9D1527C3 ^ 0x4C516239;
        int n3 = 0;
        int n4 = (n2 | 0x9D1527C3) ^ 0x991CDF92;
        n3 = (n2 | 0x9D1527C3) ^ 0x57389B7B;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1972503424: {
                    n3 = (n2 | 0x9D1527C3) ^ 0xA2647C6B;
                    continue block5;
                }
                case 1425436237: {
                    return this.b;
                }
                case 2133924752: 
            }
            n4 ^= n3 ^ 0xF56B00FA;
            n3 = (n2 | 0x9D1527C3) ^ 0x89A309B6;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public ep add(ep ep2) {
        int n2 = a & 0xC15DDA00 ^ 0x5E3317E6;
        int n3 = 0;
        int n4 = (n2 | 0xC15DDA00) ^ 0x28075365;
        n3 = (n2 | 0xC15DDA00) ^ 0x4BDC7B86;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 305186945: {
                    return new ep(this.a + ep2.a, this.b + ep2.b);
                }
                case 1527004532: {
                    n4 ^= n3 ^ 0x10910183;
                    n3 = (n2 | 0xC15DDA00) ^ 0xCD4F1767;
                    continue block5;
                }
                case -1801214880: 
            }
            n3 = (n2 | 0xC15DDA00) ^ 0x847BE292;
        }
    }

    /*
     * Unable to fully structure code
     */
    public ep subtract(ep var1_1) {
        block25: {
            block26: {
                break block26;
lbl1:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1189905030;
                    ** GOTO lbl44
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1374151895;
                    ** GOTO lbl44
                    break;
                }
lbl7:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1700529684;
                    ** GOTO lbl44
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ -1979216920;
                    ** GOTO lbl34
                    break;
                }
            }
            var5_2 = -1592588172;
            var2_3 = ep.a & -1592588172 ^ 1352507722;
            var4_4 = 0;
            var3_5 = (var2_3 | var5_2) ^ -1028045380;
            ** while (true)
lbl19:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 290618454;
                ** GOTO lbl44
                break;
            }
lbl22:
            // 1 sources

            while (true) {
                var3_5 ^= var4_4 ^ 1567682581;
                break block25;
                break;
            }
lbl25:
            // 1 sources

            block20: while (true) {
                switch (var3_5) {
                    default: {
                        ** continue;
                    }
lbl29:
                    // 1 sources

                    return new ep(this.a - var1_1.a, this.b - var1_1.b);
                    case 858188994: {
                        var4_4 = (var2_3 | var5_2) ^ -2063296483;
                        break block20;
                    }
lbl34:
                    // 2 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 754437752;
                        break block20;
                        break;
                    }
                    case 659017987: {
                        var4_4 = (var2_3 | var5_2) ^ -878276546;
                        break block20;
                    }
                }
                break;
            }
            ** GOTO lbl44
        }
        while (true) {
            var4_4 = (var2_3 | var5_2) ^ -223687133;
lbl44:
            // 6 sources

            block24: while (true) {
                switch (var4_4) {
                    default: {
                        continue block24;
                    }
                    case 53831517: {
                        ** continue;
                    }
                    case 1217188868: {
                        ** continue;
                    }
                    case 976828736: {
                        ** continue;
                    }
                    case -523381464: {
                        ** continue;
                    }
                    case 1602728535: {
                        ** continue;
                    }
                    case -580360442: {
                        ** continue;
                    }
                    case 1799114898: {
                        ** continue;
                    }
                    case 1956327779: 
                }
                break;
            }
            var3_5 ^= var4_4 ^ 377202992;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public ep normalizeYaw() {
        int n2 = a & 0x99053695 ^ 0x4C452C49;
        int n3 = 0;
        int n4 = (n2 | 0x99053695) ^ 0x9E74151C;
        n3 = (n2 | 0x99053695) ^ 0x37822E84;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1919278216: {
                    n4 ^= n3 ^ 0x1C2CD9DF;
                    n3 = (n2 | 0x99053695) ^ 0x3B9C3ED5;
                    continue block5;
                }
                case -356052903: {
                    n3 = (n2 | 0x99053695) ^ 0xAF20E255;
                    continue block5;
                }
                case -421986296: 
            }
            break;
        }
        return new ep(cm.wrapAngleTo180(this.a), this.b);
    }

    /*
     * Unable to fully structure code
     */
    public double magnitude() {
        block7: {
            var1_1 = ep.a & 623548087 ^ 909829886;
            var3_2 = 0;
            ** GOTO lbl9
lbl4:
            // 2 sources

            block5: while (true) {
                switch (var3_2) lbl-1000:
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

                    var2_3 = (var1_1 | 623548087) ^ -1963596446;
                    var3_2 = (var1_1 | 623548087) ^ -1495033758;
                    ** continue;
                    case -1848021347: {
                        break block5;
                    }
                    case -807449738: {
                        var2_3 ^= var3_2 ^ -759636801;
                        break block7;
                    }
                }
                break;
            }
            var3_2 = (var1_1 | 623548087) ^ -119161463;
            ** GOTO lbl4
            {
                ** case -1073522414:
            }
lbl20:
            // 1 sources

            return Math.abs(this.a) + Math.abs(this.b);
        }
        var3_2 = (var1_1 | 623548087) ^ -147214355;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean isWithin(ep var1_1, float var2_2) {
        block22: {
            block23: {
                break block23;
lbl1:
                // 2 sources

                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ -1162142241;
                    break block22;
lbl4:
                    // 2 sources

                    while (true) {
                        var7_5 = (var5_4 | var8_3) ^ 996462244;
                        break block22;
                        break;
                    }
                    break;
                }
            }
            var8_3 = 1567201870;
            var5_4 = ep.a & 1567201870 ^ 263902286;
            var7_5 = 0;
            var6_8 = (var5_4 | var8_3) ^ -1593130725;
            var7_5 = (var5_4 | var8_3) ^ -545081311;
            block19: while (true) {
                switch (var7_5) {
                    default: {
                        continue block19;
                    }
                    case -2139527569: {
                        var7_5 = (var5_4 | var8_3) ^ 1502564727;
                        continue block19;
                    }
                    case 108302137: {
                        var6_8 ^= var7_5 ^ 1584849486;
                        var7_5 = (var5_4 | var8_3) ^ 1815516735;
                        continue block19;
                    }
                    case 869091441: 
                }
                break;
            }
            var3_6 = Math.abs(cm.wrapAngleTo180(this.a) - cm.wrapAngleTo180(var1_1.a));
            var6_8 ^= 1458121977;
            var4_7 = Math.abs(this.b - var1_1.b);
            var7_5 = (var5_4 | var8_3) ^ 1064101224;
            break block22;
lbl30:
            // 2 sources

            while (true) {
                var6_8 ^= -1746737690;
                return v0;
            }
        }
        block21: while (true) {
            switch (var7_5) {
                default: {
                    continue block21;
                }
                case 1780560629: {
                    var7_5 = (var5_4 | var8_3) ^ 1796824009;
                    continue block21;
                }
                case 694217884: {
                    if (var3_6 < var2_2) ** GOTO lbl1
                    var7_5 = (var5_4 | var8_3) ^ 903539899;
                    continue block21;
                }
                case 1688146154: {
                    var6_8 ^= var7_5 ^ -414932378;
                    var7_5 = (var5_4 | var8_3) ^ 1766582018;
                    continue block21;
                }
                case 1919296262: {
                    if (!(var4_7 < var2_2)) ** GOTO lbl4
                    var7_5 = (var5_4 | var8_3) ^ 513004959;
                    continue block21;
                }
                case 917518668: {
                    v0 = false;
                    ** GOTO lbl30
                }
                case 1097337809: {
                    var6_8 ^= var7_5 ^ -1028408995;
                    var7_5 = (var5_4 | var8_3) ^ 544359247;
                    continue block21;
                }
                case 1620523814: {
                    var6_8 ^= var7_5 ^ -1814463970;
                    var7_5 = (var5_4 | var8_3) ^ 1989882578;
                    continue block21;
                }
                case -448740463: {
                    var7_5 = (var5_4 | var8_3) ^ 765328712;
                    continue block21;
                }
                case 887260551: {
                    if (var3_6 > 360.0f - var2_2) ** break;
                    ** continue;
                    ** continue;
                }
                case 2139725057: 
            }
            break;
        }
        v0 = true;
        ** while (true)
    }
}

