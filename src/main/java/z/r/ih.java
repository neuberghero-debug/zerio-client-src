/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.gP;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class ih {
    protected final gP a;
    protected final Random a;
    public static final int d = mK.a(MethodHandles.lookup().lookupClass(), -11099644);
    protected final gP b;

    /*
     * Unable to fully structure code
     */
    public ih(gP var1_1, gP var2_2) {
        block20: {
            block19: {
                var6_3 = -1193091518;
                var3_4 = ih.d & -1193091518 ^ -61327173;
                var5_5 = 0;
                break block20;
lbl5:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 1788451193;
                    ** GOTO lbl19
lbl8:
                    // 1 sources

                    while (true) {
                        var4_6 ^= var5_5 ^ -1610923309;
                        if (true) ** GOTO lbl31
                        break;
                    }
                    break;
                }
                block12: while (true) {
                    block21: {
                        var5_5 = (var3_4 | var6_3) ^ -99992426;
                        break block21;
lbl14:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            this.b = var2_2;
                            ** GOTO lbl39
                            break;
                        }
                    }
lbl20:
                    // 4 sources

                    block15: while (true) {
                        switch (var5_5) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                default: {
                                    continue block15;
                                }
                                break;
                            }
                            case 657789657: {
                                ** continue;
                            }
                            case 116441709: {
                                ** continue;
                            }
                            case -1771870334: {
                                ** continue;
                            }
lbl31:
                            // 1 sources

                            var5_5 = (var3_4 | var6_3) ^ 1451329713;
                            ** GOTO lbl-1000
                            case -2103749533: {
                                var4_6 ^= var5_5 ^ -1446681328;
                                break block19;
                            }
                            case 685565141: {
                                var4_6 ^= var5_5 ^ 1197925122;
                                ** continue;
                            }
lbl39:
                            // 1 sources

                            var5_5 = (var3_4 | var6_3) ^ 2120329880;
                            ** GOTO lbl-1000
lbl41:
                            // 1 sources

                            while (true) {
                                var5_5 = (var3_4 | var6_3) ^ -1712106134;
                                ** continue;
                                break;
                            }
                            case -1434749366: {
                                this.a = var1_1;
                                break block12;
                            }
                            case 1695132561: {
                                var4_6 ^= var5_5 ^ 1949567009;
                                continue block12;
                            }
                        }
                        break;
                    }
                    break;
                }
                var5_5 = (var3_4 | var6_3) ^ -735700434;
                ** GOTO lbl20
            }
            var5_5 = (var3_4 | var6_3) ^ -1347674568;
            ** GOTO lbl20
lbl55:
            // 1 sources

            while (true) {
                super();
                ** continue;
                break;
            }
            this.a = new Random();
            var5_5 = (var3_4 | var6_3) ^ -607130590;
            ** while (true)
        }
        var4_6 = (var3_4 | var6_3) ^ 2146551258;
        var4_6 ^= 93146828;
        ** while (true)
        {
            ** case 1398202563:
        }
lbl66:
        // 1 sources

    }

    /*
     * Enabled aggressive block sorting
     */
    public double getMinimumValue() {
        int n2 = d & 0xF55625C3 ^ 0x9CE22C14;
        int n3 = 0;
        int n4 = (n2 | 0xF55625C3) ^ 0x66BD47C3;
        n3 = (n2 | 0xF55625C3) ^ 0x121E4E41;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1831163421: {
                    return Math.min(((Float)this.a.getValue()).floatValue(), ((Float)this.b.getValue()).floatValue());
                }
                case 2033006747: {
                    n4 ^= n3 ^ 0x858CF557;
                    n3 = (n2 | 0xF55625C3) ^ 0x90D37BCA;
                    continue block5;
                }
                case -269982826: 
            }
            n3 = (n2 | 0xF55625C3) ^ 0x84DB154C;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public double getMaximumValue() {
        int n2 = d & 0xF0476D7D ^ 0x7BFB920F;
        int n3 = 0;
        int n4 = (n2 | 0xF0476D7D) ^ 0x1AE372DA;
        n3 = (n2 | 0xF0476D7D) ^ 0x1D5B5698;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 788289346: {
                    n4 ^= n3 ^ 0x7E2C51B1;
                    n3 = (n2 | 0xF0476D7D) ^ 0x208983A1;
                    continue block5;
                }
                case -612991778: {
                    return Math.max(((Float)this.a.getValue()).floatValue(), ((Float)this.b.getValue()).floatValue());
                }
                case -425416217: 
            }
            n3 = (n2 | 0xF0476D7D) ^ 0xD503A83D;
        }
    }

    /*
     * Unable to fully structure code
     */
    public int getMinimumInt() {
        block9: {
            block8: {
                break block9;
                {
                    var3_2 = (var1_1 | -917169211) ^ 1130716543;
lbl2:
                    // 3 sources

                    block6: while (true) {
                        switch (var3_2) {
                            default: {
                                continue block6;
                            }
                            case -1493807180: {
                                break block8;
                            }
                            case -1642929488: {
                                return (int)this.getMinimumValue();
                            }
                            case 227956549: {
                                var2_3 ^= var3_2 ^ -1984101736;
                                break;
                            }
                        }
                        continue block5;
                        break;
                    }
                }
lbl14:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -917169211) ^ 2072113275;
                    ** GOTO lbl2
                    break;
                }
            }
            var3_2 = (var1_1 | -917169211) ^ -790501238;
            ** while (true)
        }
        var1_1 = ih.d & -917169211 ^ 360101710;
        var3_2 = 0;
        var2_3 = (var1_1 | -917169211) ^ -639107248;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public int getMaximumInt() {
        int n2 = d & 0x32AD17D7 ^ 0x6B6F398;
        int n3 = 0;
        int n4 = (n2 | 0x32AD17D7) ^ 0xDD74CB1F;
        n3 = (n2 | 0x32AD17D7) ^ 0xBF0B7F93;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1984657332: {
                    n3 = (n2 | 0x32AD17D7) ^ 0x274DC5A0;
                    continue block5;
                }
                case 301085311: {
                    n4 ^= n3 ^ 0x35D804F1;
                    n3 = (n2 | 0x32AD17D7) ^ 0xF10567E5;
                    continue block5;
                }
                case -944074694: 
            }
            break;
        }
        return (int)this.getMaximumValue();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public double getRandomValue() {
        var5_1 = ih.d & 1345811621 ^ 1253204554;
        var7_2 = 0;
        var6_3 = (var5_1 | 1345811621) ^ 161258874;
        var7_2 = (var5_1 | 1345811621) ^ -502056180;
        if (true) ** GOTO lbl11
        block5: while (true) {
            switch (var7_2) {
                case -406970220: {
                    var6_3 ^= var7_2 ^ 78405568;
                    var7_2 = (var5_1 | 1345811621) ^ -2128760783;
                }
lbl11:
                // 3 sources

                default: {
                    continue block5;
                }
                case -1197191709: {
                    var7_2 = (var5_1 | 1345811621) ^ -1123461509;
                    continue block5;
                }
                case -609564962: 
            }
            break;
        }
        var1_4 = this.getMinimumValue();
        var6_3 ^= 1944633412;
        var3_5 = this.getMaximumValue();
        var6_3 ^= 2108468611;
        return var1_4 + (var3_5 - var1_4) * this.a.nextDouble();
    }

    /*
     * Unable to fully structure code
     */
    public gP minimumSetting() {
        block28: {
            block29: {
                break block29;
lbl1:
                // 2 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -951636975;
                    ** GOTO lbl50
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1885870917;
                    ** GOTO lbl50
                    break;
                }
lbl7:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 221544375;
                    ** GOTO lbl50
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -668218416;
                    break block28;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ 1063156473;
                    ** GOTO lbl1
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 195986527;
                    ** GOTO lbl50
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -895359767;
                    ** GOTO lbl50
                    break;
                }
lbl22:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ 1680399499;
                    ** continue;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1351297423;
                    ** GOTO lbl50
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 848640852;
                    ** GOTO lbl50
                    break;
                }
            }
            var4_1 = -709112284;
            var1_2 = ih.d & -709112284 ^ 117021905;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ 543155813;
            ** while (true)
lbl37:
            // 1 sources

            return this.a;
lbl39:
            // 1 sources

            while (true) {
                switch (var2_4) {
                    default: {
                        ** continue;
                    }
                    case -140232560: {
                        ** continue;
                    }
                    ** case -2028009760:
lbl46:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        block26: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1713750996;
lbl50:
            // 8 sources

            block27: while (true) {
                switch (var3_3) {
                    default: {
                        continue block27;
                    }
                    case 1483487822: {
                        continue block26;
                    }
                    case -623926974: {
                        ** continue;
                    }
                    case 280818404: {
                        ** continue;
                    }
                    case -598386006: {
                        ** continue;
                    }
                    case 492452380: {
                        ** continue;
                    }
                    case -445717087: {
                        ** continue;
                    }
                    case -2022639750: {
                        ** continue;
                    }
                    ** case 1310843609:
lbl69:
                    // 1 sources

                    ** continue;
                }
                break;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public gP maximumSetting() {
        int n2 = d & 0x2BA9DF7B ^ 0x1E6414B9;
        int n3 = 0;
        int n4 = (n2 | 0x2BA9DF7B) ^ 0x6969B67C;
        n3 = (n2 | 0x2BA9DF7B) ^ 0x1C5A1255;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 337312361: {
                    n4 ^= n3 ^ 0xFD00EBB7;
                    n3 = (n2 | 0x2BA9DF7B) ^ 0xF8587573;
                    continue block5;
                }
                case 599248302: {
                    n3 = (n2 | 0x2BA9DF7B) ^ 0x2BF72592;
                    continue block5;
                }
                case -944395640: 
            }
            break;
        }
        return this.b;
    }
}

