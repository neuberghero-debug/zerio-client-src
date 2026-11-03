/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;

@Environment(value=EnvType.CLIENT)
public final class cx {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), 4836851);

    /*
     * Enabled aggressive block sorting
     */
    private cx() {
        int n2 = a & 0x88CF4B92 ^ 0x9BBCCF0F;
        int n3 = (n2 | 0x88CF4B92) ^ 0x3ABC5342;
        n3 ^= 0x7C2C8BC8;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static class_243 screenCenterWorld(class_310 var0, Matrix4f var1_1, Matrix4f var2_2) {
        var11_3 = 1747456956;
        var8_4 = cx.a & 1747456956 ^ -2071776655;
        var10_5 = 0;
        var9_6 = (var8_4 | var11_3) ^ -232348826;
        var10_5 = (var8_4 | var11_3) ^ -1425183592;
        ** GOTO lbl119
lbl7:
        // 1 sources

        while (true) {
            var10_5 = (var8_4 | var11_3) ^ 152225089;
            ** GOTO lbl80
            while (true) {
                var10_5 = (var8_4 | var11_3) ^ -373918642;
                ** GOTO lbl24
                break;
            }
            break;
        }
        while (true) {
            var10_5 = (var8_4 | var11_3) ^ 2041077779;
            ** GOTO lbl119
lbl16:
            // 1 sources

            while (true) {
                var10_5 = (var8_4 | var11_3) ^ 1396587350;
                if (true) ** GOTO lbl24
                break;
            }
            break;
        }
        block39: while (true) {
            var10_5 = (var8_4 | var11_3) ^ -1476459326;
            if (true) ** GOTO lbl119
            {
                var10_5 = (var8_4 | var11_3) ^ 1625373807;
                ** GOTO lbl80
lbl24:
                // 2 sources

                block41: while (true) {
                    switch (var10_5) {
                        case -810743106: {
                            if (!(Math.abs(var7_11) < 1.0E-6f)) ** continue;
                            var10_5 = (var8_4 | var11_3) ^ 584183627;
                            continue block41;
                        }
                        case -830808906: {
                            var9_6 ^= var10_5 ^ 1432620957;
                            var10_5 = (var8_4 | var11_3) ^ -1138697231;
                            continue block41;
                        }
                        case -1012004927: {
                            var9_6 ^= var10_5 ^ 1587222836;
                            ** continue;
                        }
                        case 85804979: {
                            var9_6 ^= var10_5 ^ 220418544;
                            var10_5 = (var8_4 | var11_3) ^ -133836350;
                            ** break;
                        }
                        case 347005503: {
                            var6_10.div(var7_11);
                            var10_5 = (var8_4 | var11_3) ^ 788870204;
                        }
lbl45:
                        // 3 sources

                        default: {
                            continue block41;
                        }
                        case 1395126479: {
                            var9_6 ^= var10_5 ^ 166778337;
                            var10_5 = (var8_4 | var11_3) ^ 587610435;
                            continue block41;
                        }
                        case 1351346188: {
                            return var3_7;
                        }
lbl53:
                        // 1 sources

                        while (true) {
                            var4_8 = new Matrix4f((Matrix4fc)var1_1).invert(new Matrix4f());
                            var9_6 ^= 1012725539;
                            var5_9 = new Matrix4f((Matrix4fc)var2_2).invert(new Matrix4f());
                            var10_5 = (var8_4 | var11_3) ^ -572727462;
                            ** GOTO lbl80
lbl59:
                            // 1 sources

                            block43: while (true) {
                                switch (var10_5) {
                                    default: {
                                        continue block43;
                                    }
                                    case 1550602342: {
                                        var9_6 ^= var10_5 ^ 1498165859;
                                        var10_5 = (var8_4 | var11_3) ^ 281165597;
                                        continue block43;
                                    }
                                    case -776401732: {
                                        var9_6 ^= var10_5 ^ 1559189232;
                                        var10_5 = (var8_4 | var11_3) ^ -1980252817;
                                        continue block43;
                                    }
                                    case -60224288: {
                                        var6_10.mul((Matrix4fc)var4_8).mul((Matrix4fc)var5_9);
                                        var10_5 = (var8_4 | var11_3) ^ 1024606017;
                                        continue block43;
                                    }
                                    case 1700564626: 
                                }
                                var7_11 = var6_10.w();
                                var10_5 = (var8_4 | var11_3) ^ -1081294030;
                                continue block41;
                                break;
                            }
lbl80:
                            // 3 sources

                            block44: while (true) {
                                switch (var10_5) {
                                    default: {
                                        continue block44;
                                    }
                                    case -1748941121: {
                                        var9_6 ^= var10_5 ^ -2098361224;
                                        var10_5 = (var8_4 | var11_3) ^ -1785825802;
                                        continue block44;
                                    }
                                    case 905334237: {
                                        if (!var5_9.isFinite()) {
                                            continue block40;
                                        }
                                        ** GOTO lbl111
                                    }
                                    case -1941303406: {
                                        var9_6 ^= var10_5 ^ -1576333628;
                                        var10_5 = (var8_4 | var11_3) ^ -1548061288;
                                        continue block44;
                                    }
                                    case 2032485899: {
                                        var6_10 = new Vector4f(0.0f, 0.0f, 0.0f, 1.0f);
                                        var10_5 = (var8_4 | var11_3) ^ -1329110117;
                                        ** continue;
                                    }
                                    case 829942951: {
                                        var9_6 ^= var10_5 ^ 1306266301;
                                        var10_5 = (var8_4 | var11_3) ^ 1191008579;
                                        continue block44;
                                    }
                                    case -440797508: {
                                        var10_5 = (var8_4 | var11_3) ^ -648184288;
                                        continue block44;
                                    }
                                    case -1437177154: {
                                        if (var4_8.isFinite()) ** break;
                                        continue block40;
                                        ** continue;
                                    }
lbl111:
                                    // 1 sources

                                    var10_5 = (var8_4 | var11_3) ^ 2070574402;
                                    continue block44;
                                    case 1326532197: 
                                }
                                break;
                            }
                            return var3_7;
                        }
                        case -1080751957: 
                    }
                    break;
                }
            }
            return new class_243(var3_7.field_1352 + (double)var6_10.x(), var3_7.field_1351 + (double)var6_10.y(), var3_7.field_1350 + (double)var6_10.z());
            block45: while (true) {
                var10_5 = (var8_4 | var11_3) ^ 1997425908;
lbl119:
                // 4 sources

                block46: while (true) {
                    switch (var10_5) {
                        default: {
                            continue block46;
                        }
                        case 1117590692: {
                            var3_7 = var0.field_1773.method_19418().method_71156();
                            var9_6 ^= -379339837;
                            ** continue;
                        }
                        case -932539297: {
                            if (var0.field_1773.method_19418() != null) ** continue;
                            continue block45;
                        }
                        case 1911377019: {
                            var9_6 ^= var10_5 ^ -2067499564;
                            var10_5 = (var8_4 | var11_3) ^ 616671138;
                            continue block46;
                        }
                        case -1683652855: {
                            var9_6 ^= var10_5 ^ -2117925544;
                            continue block39;
                        }
                        case -1794944018: {
                            var9_6 ^= var10_5 ^ -470502930;
                            var10_5 = (var8_4 | var11_3) ^ -1372182695;
                            continue block46;
                        }
                        case 1202085733: {
                            var10_5 = (var8_4 | var11_3) ^ -1656324218;
                            continue block46;
                        }
                        case 1263810367: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return class_243.field_1353;
    }
}

