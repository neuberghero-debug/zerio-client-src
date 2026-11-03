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
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import z.r.bd;
import z.r.kl;

@Environment(value=EnvType.CLIENT)
public final class iT {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), -86294611);

    /*
     * Enabled aggressive block sorting
     */
    private iT() {
        int n2 = a & 0xCF027FEF ^ 0x35343DB8;
        int n3 = (n2 | 0xCF027FEF) ^ 0xC9D9312A;
        n3 ^= 0xE1FEBEED;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static UUID forTierLookup(UUID var0) {
        block46: {
            break block46;
lbl1:
            // 1 sources

            while (true) {
                var7_3 = (var5_2 | var8_1) ^ -999482760;
                block36: while (true) {
                    switch (var7_3) {
                        case -915286915: {
                            var6_7 ^= var7_3 ^ -1282251046;
                            var7_3 = (var5_2 | var8_1) ^ -1474176044;
                            continue block36;
                        }
                        case 970122629: {
                            var6_7 ^= var7_3 ^ 1515836707;
                            ** break;
                        }
                        case 1317524815: {
                            return var0;
                        }
                        case -1332759963: {
                            var6_7 ^= var7_3 ^ 541043907;
                            var7_3 = (var5_2 | var8_1) ^ -1288164686;
                            break;
                        }
                        case 1436427305: {
                            var4_8 = bd.uuidForName(var3_6);
                            break block36;
                        }
lbl21:
                        // 1 sources

                        var7_3 = (var5_2 | var8_1) ^ 1100369012;
                        continue block36;
                        case -1138117751: {
                            if (var3_6 == null) {
                                var7_3 = (var5_2 | var8_1) ^ 1295011224;
                                continue block36;
                            }
                            var7_3 = (var5_2 | var8_1) ^ 885926784;
                        }
                    }
                }
                var6_7 ^= -1372677159;
                return var4_8.orElse(var0);
            }
        }
        var8_1 = -1188202915;
        var5_2 = iT.a & -1188202915 ^ -862798944;
        var7_3 = 0;
        var6_7 = (var5_2 | var8_1) ^ -604856219;
        var7_3 = (var5_2 | var8_1) ^ 157431116;
        block37: while (true) {
            switch (var7_3) {
                default: {
                    continue block37;
                }
                case -186791247: {
                    ** GOTO lbl62
                }
                case 264484640: {
                    return null;
                }
                case 115654691: {
                    if (var0 == null) {
                        ** break;
                    }
                    ** GOTO lbl64
                }
                case 1242460823: {
                    var1_4 = kl.getInstance();
                    ** GOTO lbl66
                }
lbl52:
                // 1 sources

                var7_3 = (var5_2 | var8_1) ^ -811028348;
                continue block37;
                case 840388473: {
                    var6_7 ^= var7_3 ^ 2022004306;
                    var7_3 = (var5_2 | var8_1) ^ -226735907;
                    continue block37;
                }
                case 2559594: {
                    var6_7 ^= var7_3 ^ -1223391273;
                    var7_3 = (var5_2 | var8_1) ^ -1213100694;
                    continue block37;
                }
lbl62:
                // 1 sources

                var7_3 = (var5_2 | var8_1) ^ 369956495;
                continue block37;
lbl64:
                // 1 sources

                var7_3 = (var5_2 | var8_1) ^ -40308329;
                continue block37;
lbl66:
                // 1 sources

                var7_3 = (var5_2 | var8_1) ^ -2140359415;
                break block37;
                case -340596366: 
            }
            var6_7 ^= var7_3 ^ -867802604;
            var7_3 = (var5_2 | var8_1) ^ -77905954;
        }
        block38: while (true) {
            switch (var7_3) {
                case 2050109922: {
                    if (var1_4.isEnabled()) ** GOTO lbl91
                    ** GOTO lbl96
                }
                case -184529559: {
                    var7_3 = (var5_2 | var8_1) ^ -2020749793;
                    continue block38;
                }
                case 1490679523: {
                    var6_7 ^= var7_3 ^ -482745143;
                    ** GOTO lbl93
                }
                case -662654460: {
                    if (var1_4 == null) ** GOTO lbl96
                    ** GOTO lbl102
                }
                case 311837680: {
                    var2_5 = class_310.method_1551();
                    ** GOTO lbl104
                }
                case -716468869: {
                    return var0;
                }
lbl91:
                // 1 sources

                var7_3 = (var5_2 | var8_1) ^ -699475192;
                ** GOTO lbl94
lbl93:
                // 1 sources

                var7_3 = (var5_2 | var8_1) ^ 687108742;
lbl94:
                // 3 sources

                default: {
                    continue block38;
                }
lbl96:
                // 2 sources

                var7_3 = (var5_2 | var8_1) ^ -1520039650;
                continue block38;
                case 2110999284: {
                    var6_7 ^= var7_3 ^ -21290897;
                    var7_3 = (var5_2 | var8_1) ^ 624905721;
                    continue block38;
                }
lbl102:
                // 1 sources

                var7_3 = (var5_2 | var8_1) ^ 146780820;
                continue block38;
lbl104:
                // 1 sources

                var7_3 = (var5_2 | var8_1) ^ -436695125;
                ** GOTO lbl121
                case 737223925: 
            }
            var6_7 ^= var7_3 ^ -756674068;
            var7_3 = (var5_2 | var8_1) ^ -282477555;
        }
        while (true) {
            var7_3 = (var5_2 | var8_1) ^ 495348807;
            ** GOTO lbl121
            break;
        }
lbl113:
        // 1 sources

        while (true) {
            var7_3 = (var5_2 | var8_1) ^ -1663160175;
            ** GOTO lbl121
            break;
        }
lbl116:
        // 1 sources

        while (true) {
            var7_3 = (var5_2 | var8_1) ^ -675171289;
            if (true) ** GOTO lbl121
            break;
        }
        block42: while (true) {
            var7_3 = (var5_2 | var8_1) ^ 1265610275;
lbl121:
            // 5 sources

            block43: while (true) {
                switch (var7_3) {
                    default: {
                        continue block43;
                    }
                    case 411946622: {
                        if (var2_5 != null) ** continue;
                        ** continue;
                    }
                    case 407334998: {
                        var6_7 ^= var7_3 ^ -590731155;
                        var7_3 = (var5_2 | var8_1) ^ -449695357;
                        continue block43;
                    }
                    case 712920026: {
                        var3_6 = var1_4.wornNameFor(var0, var2_5);
                        ** continue;
                    }
                    case -533097542: {
                        var6_7 ^= var7_3 ^ -1589576782;
                        ** continue;
                    }
                    case 1633800044: {
                        var6_7 ^= var7_3 ^ -1519168780;
                        continue block42;
                    }
                    case -1227861538: 
                }
                break;
            }
            break;
        }
        return var0;
    }
}

