/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2960
 *  net.minecraft.class_7923
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2960;
import net.minecraft.class_7923;
import z.r.W;
import z.r.hQ;
import z.r.jC;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class fn {
    private static int a;
    private static long a;
    private static final int b;
    public static final int d;
    private static final int[] a;
    private static final int c;
    private static final long b;
    private static final Map<class_1792, Integer> a;

    private fn() {
        int n2 = d & 0xA18B45A6 ^ 0xDC5DF41;
        int n3 = (n2 | 0xA18B45A6) ^ 0x98ACD0A7;
        n3 ^= 0xAD245CBF;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block31: {
            block30: {
                break block31;
lbl1:
                // 2 sources

                while (true) {
                    var5_8 = (var0_3[var3_6] & (((var6_9 ^= -739656946) | var9) ^ 938409221)) << ((var6_9 | var9) ^ 938409442) | (var0_3[var3_6 + 1] & ((var6_9 | var9) ^ 938409221)) << ((var6_9 | var9) ^ 938409450) | (var0_3[var3_6 + 2] & ((var6_9 | var9) ^ 938409221)) << ((var6_9 | var9) ^ 938409458) | var0_3[var3_6 + 3] & ((var6_9 | var9) ^ 938409221);
                    var7_2 = var9 ^ 351640802;
                    break block30;
                    break;
                }
lbl5:
                // 1 sources

                while (true) {
                    var7_2 = var9 ^ 210016619;
                    break block30;
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var7_2 = var9 ^ 1374969823;
                    break block30;
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    var6_9 ^= -1225990931;
                    var4_7 = 0;
                    ** GOTO lbl1
                    break;
                }
lbl-1000:
                // 3 sources

                {
                    switch (var7_2) {
                        case 32774128: {
                            var6_9 ^= var7_2 ^ 1971862478;
                            var7_2 = var9 ^ 1423771747;
                            continue block25;
                        }
                        case 827313724: {
                            fn.a = new int[var1_4];
                            var7_2 = var9 ^ 878373602;
                            continue block25;
                        }
                        case 1634989425: {
                            var3_6 = 0;
                            ** continue;
                        }
                        case -1101559174: {
                            var6_9 ^= var7_2 ^ 1557308834;
                            var7_2 = var9 ^ 81867566;
                        }
                    }
lbl30:
                    // 3 sources

                    ** while (true)
                }
            }
            block27: while (true) {
                switch (var7_2) {
                    case -555459320: {
                        var6_9 ^= var7_2 ^ 516631122;
                        var7_2 = var9 ^ 595091969;
                        continue block27;
                    }
                    case 1683661517: {
                        fn.a[var4_7] = var5_8 ^= var2_5;
                        ** GOTO lbl62
                    }
                    case 1048637936: {
                        fn.b = -6335887309293653233L << (var7_2 ^ 1048637904) >>> (var7_2 ^ 1048637904) ^ (long)var6_9 & 0xFFFFFFFFL | (-6335887309293653233L >>> (var7_2 ^ 1048637904) ^ (long)var6_9 & 0xFFFFFFFFL) << (var7_2 ^ 1048637904);
                        fn.c = fn.bK((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 1020493787), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1762949813)));
                        fn.b = fn.bK((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 1020493786), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1364435330)));
                        ** break;
                    }
                    case 959079545: {
                        var3_6 += 4;
                        if (++var4_7 >= var1_4) ** break;
                        ** continue;
                        ** GOTO lbl60
                    }
                    case -1586933405: {
                        var6_9 ^= var7_2 ^ -126314856;
                        ** GOTO lbl68
                    }
                    case 680835045: {
                        var6_9 ^= var7_2 ^ 2054990102;
                        ** continue;
                    }
lbl58:
                    // 1 sources

                    var7_2 = var9 ^ -347430886;
                    ** GOTO lbl63
lbl60:
                    // 1 sources

                    var7_2 = var9 ^ -1798853519;
                    ** GOTO lbl63
lbl62:
                    // 1 sources

                    var7_2 = var9 ^ 490359543;
lbl63:
                    // 4 sources

                    default: {
                        continue block27;
                    }
                    case 559636976: {
                        var6_9 ^= var7_2 ^ -1604664307;
                        ** continue;
                    }
lbl68:
                    // 1 sources

                    var7_2 = var9 ^ var8_1;
                    continue block27;
lbl70:
                    // 1 sources

                    while (true) {
                        var6_9 ^= 2009560499;
                        var1_4 = var0_3.length / 4;
                        var7_2 = var9 ^ -1946585240;
                        ** GOTO lbl30
                        break;
                    }
                    case 383164179: 
                }
                break;
            }
            fn.a = (int)new HashMap<K, V>();
            return;
        }
        var9 = 900660498;
        var8_1 = 187567330;
        fn.d = mK.a(MethodHandles.lookup().lookupClass(), 434417692);
        var7_2 = 0;
        var6_9 = 412466660;
        var7_2 = var9 ^ -506586953;
        block29: while (true) {
            switch (var7_2) {
                default: {
                    continue block29;
                }
                case 693269629: {
                    var2_5 = (var6_9 | var7_2 ^ 486312303) ^ (var7_2 ^ -795659738) ^ fn.d;
                    var6_9 ^= 206597437;
                    var0_3 = "\u001a\u00cb\u008a\u00efM4\u00a4\u0097\u000b\u00a8\u0003\u00e7\u009b\u00a5`\u0013~\u0013X\u00d5FT\u0083\u00be".getBytes("ISO-8859-1");
                    ** continue;
                }
                case 369474914: {
                    var6_9 ^= var7_2 ^ -1542362889;
                    var7_2 = var9 ^ 486312303;
                    continue block29;
                }
                case -731847259: 
            }
            var7_2 = var9 ^ 598425712;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean draw(W var0, class_1799 var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        var9_6 = 2060268792;
        var6_7 = fn.d & 2060268792 ^ 745504496;
        var8_8 = 0;
        var7_9 = (var6_7 | var9_6) ^ -2129251682;
        var8_8 = (var6_7 | var9_6) ^ -1470589272;
        ** GOTO lbl43
        {
            var8_8 = (var6_7 | var9_6) ^ -375775729;
            if (true) ** GOTO lbl11
            block12: while (true) {
                var8_8 = (var6_7 | var9_6) ^ 77188323;
lbl11:
                // 2 sources

                block13: while (true) {
                    switch (var8_8) {
                        case 1765541061: {
                            return fn.draw(var0, var1_1.method_7909(), var2_2, var3_3, var4_4, var5_5);
                        }
                        case -1753915145: {
                            if (var1_1 == null) continue block12;
                            var8_8 = (var6_7 | var9_6) ^ -1534480614;
                            continue block13;
                        }
                        case -1300013024: {
                            var7_9 ^= var8_8 ^ 740692493;
                            var8_8 = (var6_7 | var9_6) ^ 399735357;
                            continue block13;
                        }
                        case -590898040: {
                            if (var1_1.method_7960()) {
                                continue block12;
                            }
                            ** GOTO lbl38
                        }
                        case 1636119889: {
                            return false;
                        }
                        case -692590512: {
                            var8_8 = (var6_7 | var9_6) ^ -384985356;
                            continue block13;
                        }
                        case -1746737140: {
                            var7_9 ^= var8_8 ^ 987315336;
                            continue block11;
                        }
                        case -630795806: {
                            var8_8 = (var6_7 | var9_6) ^ -1574378896;
                            break;
                        }
lbl38:
                        // 1 sources

                        var8_8 = (var6_7 | var9_6) ^ -865329448;
                        continue block13;
                        case 2054599195: {
                            var7_9 ^= var8_8 ^ 275785596;
                            var8_8 = (var6_7 | var9_6) ^ 527059881;
                        }
                    }
lbl43:
                    // 4 sources

                }
                break;
            }
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean draw(W var0, class_2960 var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        var11_6 = -894091482;
        var8_7 = fn.d & -894091482 ^ -386423914;
        var10_8 = 0;
        var9_11 = (var8_7 | var11_6) ^ -1558812908;
        var10_8 = (var8_7 | var11_6) ^ -1421297423;
        ** GOTO lbl154
lbl7:
        // 1 sources

        while (true) {
            var10_8 = (var8_7 | var11_6) ^ 1372504220;
            ** GOTO lbl122
            break;
        }
        while (true) {
            var10_8 = (var8_7 | var11_6) ^ 1385032397;
            ** GOTO lbl27
            break;
        }
lbl13:
        // 2 sources

        while (true) {
            var10_8 = (var8_7 | var11_6) ^ 438300381;
            ** GOTO lbl27
lbl16:
            // 2 sources

            while (true) {
                var10_8 = (var8_7 | var11_6) ^ -834056016;
                ** GOTO lbl27
                break;
            }
            break;
        }
lbl19:
        // 1 sources

        while (true) {
            var10_8 = (var8_7 | var11_6) ^ 756724020;
            if (true) ** GOTO lbl154
            break;
        }
        block51: while (true) {
            var9_11 ^= 645337982;
            var7_10 = (class_2248)class_7923.field_41175.method_63535(var1_1);
            var10_8 = (var8_7 | var11_6) ^ -2020283173;
            ** GOTO lbl138
lbl27:
            // 3 sources

            block52: while (true) {
                switch (var10_8) {
                    case 2091793162: {
                        if (!fn.bH(var0, var6_9, var2_2, var3_3, var4_4, var5_5)) ** continue;
                        ** GOTO lbl80
                    }
                    case 1769815918: {
                        if (var6_9 != class_1802.field_8162) ** GOTO lbl61
                        ** GOTO lbl114
                    }
                    case -1938371962: {
                        var9_11 ^= var10_8 ^ -2016159506;
                        ** GOTO lbl16
                    }
                    case 1524960742: {
                        var10_8 = (var8_7 | var11_6) ^ -2088075048;
                        continue block52;
                    }
                    case 802873127: {
                        if (var6_9 != class_1802.field_8162) ** GOTO lbl118
                        ** GOTO lbl108
                    }
                    case -1199942277: {
                        var9_11 ^= var10_8 ^ -1181226440;
                        ** GOTO lbl63
                    }
                    case -253210261: {
                        ** break;
                    }
                    case -1557271125: {
                        var9_11 ^= var10_8 ^ 248916488;
                        ** GOTO lbl13
                    }
                    case -571762186: {
                        var9_11 ^= var10_8 ^ -170777296;
                        ** GOTO lbl75
                    }
                    case 1523115980: {
                        ** continue;
                    }
lbl57:
                    // 1 sources

                    switch (var9_11) {
                        case -209858065: {
                            var10_8 = (var8_7 | var11_6) ^ 1239044637;
                            break;
                        }
lbl61:
                        // 1 sources

                        var10_8 = (var8_7 | var11_6) ^ 924591680;
                        break;
lbl63:
                        // 1 sources

                        var10_8 = (var8_7 | var11_6) ^ 802359410;
                        break;
                        case 616492806: {
                            var10_8 = (var8_7 | var11_6) ^ -1074973823;
                            break;
                        }
                        case 1589199276: {
                            var9_11 ^= var10_8 ^ 367544400;
                            var10_8 = (var8_7 | var11_6) ^ -811455472;
                            break;
                        }
                        case -962108753: {
                            var6_9 = (class_1792)class_7923.field_41178.method_63535(var1_1);
                            ** GOTO lbl118
                        }
lbl75:
                        // 1 sources

                        var10_8 = (var8_7 | var11_6) ^ -1772518212;
                        break;
                        case -1158987650: {
                            var9_11 ^= var10_8 ^ -186979864;
                            ** continue;
                        }
lbl80:
                        // 1 sources

                        var10_8 = (var8_7 | var11_6) ^ -1269891558;
                        break;
                        case 1812711347: {
                            var10_8 = (var8_7 | var11_6) ^ 743496985;
                            break;
                        }
                        case -728580788: {
                            var10_8 = (var8_7 | var11_6) ^ 1344077768;
                            break;
                        }
                        case -589247562: {
                            if (var6_9 != null) {
                                var10_8 = (var8_7 | var11_6) ^ 1750922113;
                                break;
                            }
                            ** GOTO lbl108
                        }
                        case 1427803191: {
                            if (var6_9 != null) {
                                var10_8 = (var8_7 | var11_6) ^ -1340951984;
                                break;
                            }
                            ** GOTO lbl114
                        }
                        case -2102703049: {
                            ** GOTO lbl116
                        }
                        case -628910723: {
                            var9_11 ^= var10_8 ^ -564602638;
                            var10_8 = (var8_7 | var11_6) ^ 27766872;
                            break;
                        }
                        default: {
                            var10_8 = (var8_7 | var11_6) ^ 1719760176;
                            break;
                        }
                    }
                    ** GOTO lbl119
lbl108:
                    // 2 sources

                    var10_8 = (var8_7 | var11_6) ^ -2030274555;
                    ** GOTO lbl119
                    case -1916838650: {
                        var9_11 ^= var10_8 ^ 1367661163;
                        var10_8 = (var8_7 | var11_6) ^ 907506688;
                        ** GOTO lbl119
                    }
lbl114:
                    // 2 sources

                    var10_8 = (var8_7 | var11_6) ^ 812919499;
                    ** GOTO lbl119
lbl116:
                    // 1 sources

                    var10_8 = (var8_7 | var11_6) ^ -986881903;
                    ** GOTO lbl119
lbl118:
                    // 2 sources

                    var10_8 = (var8_7 | var11_6) ^ -1338025862;
lbl119:
                    // 8 sources

                    while (true) {
                        default: {
                            continue block52;
                        }
                        break;
                    }
lbl122:
                    // 1 sources

                    block54: while (true) {
                        switch (var10_8) {
                            case 167590473: {
                                if (var7_10 == null) ** GOTO lbl146
                                ** GOTO lbl144
                            }
                            case -1153859798: {
                                var6_9 = var7_10.method_8389();
                                ** GOTO lbl146
                            }
                            case 1835225965: {
                                var9_11 ^= var10_8 ^ -1262756180;
                                ** break;
                            }
                            case 1038764227: {
                                if (var7_10 == class_2246.field_10124) ** GOTO lbl146
                                ** GOTO lbl148
                            }
                            case 1795173334: {
                                var10_8 = (var8_7 | var11_6) ^ -685901963;
                            }
lbl138:
                            // 3 sources

                            default: {
                                continue block54;
                            }
lbl140:
                            // 1 sources

                            var10_8 = (var8_7 | var11_6) ^ -485849601;
                            continue block54;
                            case 777531008: 
                        }
                        ** continue;
lbl144:
                        // 1 sources

                        var10_8 = (var8_7 | var11_6) ^ -2114481056;
                        continue;
lbl146:
                        // 3 sources

                        var10_8 = (var8_7 | var11_6) ^ 1732829872;
                        ** continue;
lbl148:
                        // 1 sources

                        var10_8 = (var8_7 | var11_6) ^ -995126986;
                    }
                    case -987449404: {
                        return fn.bI(var0, var6_9, var1_1, var2_2, var3_3, var4_4, var5_5);
                    }
                    case 626365350: {
                        return true;
                    }
lbl154:
                    // 2 sources

                    block55: while (true) {
                        switch (var10_8) {
                            case -523729790: {
                                var9_11 ^= var10_8 ^ -275013339;
                                ** continue;
                            }
                            case 799384277: {
                                var9_11 ^= var10_8 ^ 377803098;
                                ** break;
                            }
                            case 281393114: {
                                var9_11 ^= var10_8 ^ -1560303055;
                                var10_8 = (var8_7 | var11_6) ^ 1994053048;
                                continue block55;
                            }
lbl166:
                            // 1 sources

                            var10_8 = (var8_7 | var11_6) ^ -398520870;
                            default: {
                                continue block55;
                            }
                            case 1103038279: {
                                ** GOTO lbl174
                            }
                            case 46707308: {
                                var6_9 = null;
                                continue block51;
                            }
lbl174:
                            // 1 sources

                            var10_8 = (var8_7 | var11_6) ^ 171916084;
                            continue block55;
                            case -940765566: {
                                if (var1_1 == null) {
                                    var10_8 = (var8_7 | var11_6) ^ -97384340;
                                    continue block55;
                                }
                                var10_8 = (var8_7 | var11_6) ^ -984474269;
                                continue block55;
                            }
                            case -1674745330: 
                        }
                        break;
                    }
                    return false;
                    case -347074578: 
                }
                break;
            }
            break;
        }
        return hQ.draw(var0, var1_1, var2_2, var3_3, var4_4, var5_5);
    }

    /*
     * Unable to fully structure code
     */
    public static boolean draw(W var0, class_1792 var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        block28: {
            block27: {
                block29: {
                    break block29;
lbl1:
                    // 1 sources

                    return fn.bI(var0, var1_1, class_7923.field_41178.method_10221((Object)var1_1), var2_2, var3_3, var4_4, var5_5);
lbl3:
                    // 1 sources

                    while (true) {
                        var7_9 ^= var8_8 ^ 1533521907;
                        break block27;
                        break;
                    }
lbl6:
                    // 7 sources

                    block17: while (true) {
                        block30: {
                            switch (var8_8) lbl-1000:
                            // 4 sources

                            {
                                default: {
                                    continue block17;
                                }
                                case -1181127948: {
                                    ** continue;
                                }
                                case 53733047: {
                                    ** continue;
                                }
                                case 725888590: {
                                    if (var1_1 != class_1802.field_8162) break;
                                    break block28;
                                }
                                while (true) {
                                    var8_8 = (var6_7 | var9_6) ^ -495231732;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case 791547000: {
                                    break block30;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    var8_8 = (var6_7 | var9_6) ^ 1197040909;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case -755370429: {
                                    var7_9 ^= var8_8 ^ -1949012499;
                                    ** continue;
                                }
                                case -441571060: {
                                    var7_9 ^= var8_8 ^ -834034405;
                                    var8_8 = (var6_7 | var9_6) ^ 1955516900;
                                    ** GOTO lbl-1000
                                }
                            }
                            var8_8 = (var6_7 | var9_6) ^ 1328062102;
                            continue;
                        }
                        var8_8 = (var6_7 | var9_6) ^ -587310840;
                        continue;
lbl37:
                        // 1 sources

                        while (true) {
                            var8_8 = (var6_7 | var9_6) ^ -372105002;
                            continue block17;
                            break;
                        }
                        {
                            case -1735075150: {
                                return false;
                            }
                            case -1020202140: {
                                if (var1_1 == null) break block28;
                                ** continue;
                            }
                        }
                        break;
                    }
lbl45:
                    // 1 sources

                    while (true) {
                        var8_8 = (var6_7 | var9_6) ^ -253512761;
                        ** GOTO lbl6
                        break;
                    }
lbl48:
                    // 1 sources

                    while (true) {
                        var8_8 = (var6_7 | var9_6) ^ 1716835659;
                        ** GOTO lbl6
                        break;
                    }
                }
                var9_6 = -574574051;
                var6_7 = fn.d & -574574051 ^ 1192042426;
                var8_8 = 0;
                var7_9 = (var6_7 | var9_6) ^ -1713122924;
                ** while (true)
lbl57:
                // 1 sources

                while (true) {
                    var8_8 = (var6_7 | var9_6) ^ 1613757777;
                    ** GOTO lbl6
                    break;
                }
lbl60:
                // 1 sources

                while (true) {
                    var8_8 = (var6_7 | var9_6) ^ 979605171;
                    ** GOTO lbl6
                    break;
                }
lbl63:
                // 1 sources

                while (true) {
                    var8_8 = (var6_7 | var9_6) ^ -192310799;
                    ** GOTO lbl6
                    break;
                }
                {
                    case 908042089: {
                        ** continue;
                    }
                    case -1421644197: {
                        return true;
                    }
                    case 1035395763: {
                        var7_9 ^= var8_8 ^ -1645133396;
                        ** continue;
                    }
                    case -1075690770: {
                        if (!fn.bH(var0, var1_1, var2_2, var3_3, var4_4, var5_5)) ** continue;
                        ** continue;
                    }
                    ** case -1864031959:
                }
lbl77:
                // 1 sources

                var7_9 ^= var8_8 ^ -805819969;
                ** while (true)
            }
            var8_8 = (var6_7 | var9_6) ^ 486362331;
            ** GOTO lbl6
        }
        var8_8 = (var6_7 | var9_6) ^ 221530620;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static void clear() {
        block19: {
            break block19;
lbl1:
            // 1 sources

            while (true) {
                var2_2 = (var0_1 | var3) ^ 783955553;
                if (true) ** GOTO lbl21
                break;
            }
            block10: while (true) {
                var2_2 = (var0_1 | var3) ^ 1986080741;
                ** GOTO lbl21
lbl7:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ -1016199108;
                    ** continue;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    fn.a.clear();
                    ** GOTO lbl35
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ -1844013768;
                    if (true) ** GOTO lbl37
                    break;
                }
                block14: while (true) {
                    block20: {
                        var2_2 = (var0_1 | var3) ^ 459495753;
                        break block20;
lbl19:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
lbl22:
                    // 3 sources

                    block16: while (true) {
                        switch (var2_2) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                default: {
                                    continue block16;
                                }
                                break;
                            }
                            case -599832673: {
                                ** continue;
                            }
                            case -1963111811: {
                                ** continue;
                            }
                            case -1986867175: {
                                ** continue;
                            }
                            case -460282187: {
                                ** continue;
                            }
lbl35:
                            // 1 sources

                            var2_2 = (var0_1 | var3) ^ 1023713854;
                            ** GOTO lbl-1000
lbl37:
                            // 1 sources

                            var2_2 = (var0_1 | var3) ^ 1963898241;
                            ** continue;
                            case -783693411: {
                                return;
                            }
                            case -1023975998: {
                                var1_3 ^= var2_2 ^ -648279906;
                                continue block14;
                            }
                            case 1260500179: {
                                continue block10;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            jC.clear();
            var2_2 = (var0_1 | var3) ^ 600619107;
            ** GOTO lbl22
lbl49:
            // 1 sources

            while (true) {
                var2_2 = (var0_1 | var3) ^ -1261286609;
                ** continue;
                break;
            }
        }
        var3 = 1835267836;
        var0_1 = fn.d & 1835267836 ^ -23938732;
        var2_2 = 0;
        var1_3 = (var0_1 | var3) ^ 1380086784;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static boolean bH(W var0, class_1792 var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
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
    private static boolean bI(W var0, class_1792 var1_1, class_2960 var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
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
    private static Integer bJ(W var0, class_1792 var1_1) {
        block37: {
            var9_2 = -1560167494;
            var6_3 = fn.d & -1560167494 ^ 198423329;
            var8_4 = 0;
            var7_8 = (var6_3 | var9_2) ^ -232549247;
            var8_4 = (var6_3 | var9_2) ^ -421310893;
            break block37;
lbl7:
            // 2 sources

            while (true) {
                var8_4 = (var6_3 | var9_2) ^ -158256044;
                ** GOTO lbl13
                break;
            }
            while (true) {
                var8_4 = (var6_3 | var9_2) ^ -1249631589;
                ** GOTO lbl65
lbl13:
                // 2 sources

                block33: while (true) {
                    switch (var8_4) {
                        default: {
                            continue block33;
                        }
                        case 1604541274: {
                            var4_6 = fn.upload(var0.a, var5_7);
                            ** GOTO lbl7
                        }
                        case 1564643311: {
                            var7_8 ^= var8_4 ^ -1858834543;
                            var8_4 = (var6_3 | var9_2) ^ -432535521;
                            continue block33;
                        }
                        case -334433417: {
                            var8_4 = (var6_3 | var9_2) ^ -193928991;
                            continue block33;
                        }
                        case 1307292580: {
                            fn.a.put(var1_1, var4_6);
                            var8_4 = (var6_3 | var9_2) ^ -501402574;
                            continue block33;
                        }
                        case -1490389226: {
                            if (var5_7 != null) ** break;
                            ** continue;
                            var8_4 = (var6_3 | var9_2) ^ 1203980492;
                            continue block33;
                        }
                        case 835897751: {
                            var7_8 ^= var8_4 ^ -1760215843;
                            var8_4 = (var6_3 | var9_2) ^ 217697453;
                            continue block33;
                        }
                        case 1238273929: {
                            var7_8 ^= var8_4 ^ -961346332;
                            var8_4 = (var6_3 | var9_2) ^ 321041951;
                            continue block33;
                        }
                        case -1192161884: 
                    }
                    return var4_6;
                }
                break;
            }
        }
        block34: while (true) {
            switch (var8_4) {
                default: {
                    continue block34;
                }
                case 1378699530: {
                    var7_8 ^= var8_4 ^ 2008777841;
                    var8_4 = (var6_3 | var9_2) ^ 1523110393;
                    continue block34;
                }
                case 1295054312: {
                    var8_4 = (var6_3 | var9_2) ^ -100732239;
                    continue block34;
                }
                case -249861566: 
            }
            break;
        }
        var2_5 = System.nanoTime();
        var8_4 = (var6_3 | var9_2) ^ 1797860775;
        if (true) ** GOTO lbl65
        block35: while (true) {
            var8_4 = (var6_3 | var9_2) ^ -663290460;
lbl65:
            // 3 sources

            block36: while (true) {
                switch (var8_4) {
                    default: {
                        continue block36;
                    }
                    case 179960417: {
                        var7_8 ^= var8_4 ^ -2054149330;
                        var8_4 = (var6_3 | var9_2) ^ 910531731;
                        continue block36;
                    }
                    case -1618923649: {
                        var7_8 ^= var8_4 ^ -499677483;
                        var8_4 = (var6_3 | var9_2) ^ -1462865445;
                        continue block36;
                    }
                    case -220518628: {
                        fn.a = 0;
                        continue block35;
                    }
                    case -1651103960: {
                        var4_6 = -1;
                        var7_8 ^= 439339563;
                        var5_7 = jC.bake(new class_1799((class_1935)var1_1));
                        var8_4 = (var6_3 | var9_2) ^ -1711181268;
                        ** continue;
                    }
                    case -1326699787: {
                        if (var2_5 - fn.a > (7805613994380887954L << (var8_4 ^ -1326699819) >>> (var8_4 ^ -1326699819) ^ (long)var7_8 & 0xFFFFFFFFL | (7805613994380887954L >>> (var8_4 ^ -1326699819) ^ (long)var7_8 & 0xFFFFFFFFL) << (var8_4 ^ -1326699819))) ** break;
                        continue block35;
                        var8_4 = (var6_3 | var9_2) ^ 877827268;
                        continue block36;
                    }
                    case 652350893: {
                        ++fn.a;
                        var8_4 = (var6_3 | var9_2) ^ -1586871846;
                        continue block36;
                    }
                    case 52284000: {
                        fn.a = var2_5;
                        var8_4 = (var6_3 | var9_2) ^ -2072460163;
                        continue block36;
                    }
                    case -514542854: {
                        var7_8 ^= var8_4 ^ -1016142441;
                        var8_4 = (var6_3 | var9_2) ^ 264779645;
                        continue block36;
                    }
                    case 799768518: {
                        var7_8 ^= var8_4 ^ 1377687148;
                        var8_4 = (var6_3 | var9_2) ^ 1493736615;
                        continue block36;
                    }
                    case 1940211231: {
                        var7_8 ^= var8_4 ^ 1759515924;
                        var8_4 = (var6_3 | var9_2) ^ 612413900;
                        continue block36;
                    }
                    case -1057319396: {
                        var7_8 ^= var8_4 ^ -791713585;
                        var8_4 = (var6_3 | var9_2) ^ 457150798;
                        continue block36;
                    }
                    case 509057312: {
                        var7_8 ^= var8_4 ^ 505721740;
                        var8_4 = (var6_3 | var9_2) ^ -1926124010;
                        continue block36;
                    }
                    case -1890383241: {
                        if (fn.a < 4) ** continue;
                        var8_4 = (var6_3 | var9_2) ^ 1250363713;
                        continue block36;
                    }
                    case -1541698362: 
                }
                break;
            }
            break;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    private static int upload(long var0, int[] var2_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [61[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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

    private static int bK(int n2, int n3) {
        int n4 = -646041693;
        int n5 = 817915234;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x46131CD3)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xF9FEB2FB;
        n6 -= (n5 | n4) ^ 0xF9FE688E;
        n6 -= (n5 | n4) ^ 0xF9FEBAAD;
        n6 -= (n5 | n4) ^ 0xF9FECE7A;
        n6 += (n5 | n4) ^ 0xF9FE3618;
        n6 ^= (n5 | n4) ^ 0xF9FEA0A8;
        n6 ^= (n5 | n4) ^ 0xF9FE2F00;
        return n6 -= (n5 | n4) ^ 0xF9FEDE3E;
    }
}

