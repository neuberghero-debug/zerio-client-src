/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2960
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;
import z.r.W;
import z.r.gj;
import z.r.hN;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class hQ {
    public static final int a;
    private static final /* synthetic */ String a;
    private static final int[] a;
    private static final String[] a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;

    /*
     * Enabled aggressive block sorting
     */
    private hQ() {
        int n2 = a & 0xAF2E450D ^ 0xE578099;
        int n3 = (n2 | 0xAF2E450D) ^ 0x8F27DEA5;
        n3 ^= 0x9AA319D0;
    }

    /*
     * Exception decompiling
     */
    public static boolean draw(W var0, class_2960 var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block14: {
            var2 = -95265382;
            hQ.a = mK.a(MethodHandles.lookup().lookupClass(), 1605068807);
            var1_1 = 0;
            var0_2 = -1383938823;
            var1_1 = var2 ^ -1282721973;
            break block14;
lbl7:
            // 1 sources

            while (true) {
                hQ.c = gj.decode("gsCLYw==", hQ.QP(((var0_2 ^= 2020019765) | var2) ^ 2029998669, var2 ^ ((var0_2 | var2) ^ 1627082662)));
                hQ.a = gj.decode("vv39nSE=", hQ.QP((var0_2 | var2) ^ 2029998668, var2 ^ ((var0_2 | var2) ^ -2045199676)));
                hQ.d = gj.decode("psz36lf6", hQ.QP((var0_2 | var2) ^ 2029998671, var2 ^ ((var0_2 | var2) ^ -1349957686)));
                hQ.b = gj.decode("2lerl6X+", hQ.QP((var0_2 | var2) ^ 2029998670, var2 ^ ((var0_2 | var2) ^ 1758331952)));
                var1_1 = var2 ^ 1405697529;
                break block14;
                break;
            }
lbl14:
            // 1 sources

            while (true) {
                var0_2 ^= -815704785;
                var0_2 ^= -824856708;
                var0_2 ^= -606718216;
                var0_2 ^= 66758960;
                var0_2 ^= 711076564;
                var0_2 ^= -1966089652;
                v0 = var0_2 ^= -1612435258;
                var0_2 ^= 1866457234;
                hQ.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ ((v0 | var2) ^ -885022041 ^ hQ.a);
                v1 = v1 + 1;
                v2 = v2;
                v3 = v3 + 4;
                var0_2 ^= -1980873385;
                if (v3 + 4 < v2.length) continue;
                ** continue;
                break;
            }
        }
        block13: while (true) {
            switch (var1_1) {
                default: {
                    continue block13;
                }
                case -533338978: {
                    var1_1 = var2 ^ -74196458;
                    continue block13;
                }
                case 29460364: {
                    var0_2 ^= var1_1 ^ 1098886549;
                    var1_1 = var2 ^ 886367310;
                    continue block13;
                }
                case -1449435037: {
                    var0_2 ^= var1_1 ^ -1100854628;
                    var1_1 = var2 ^ -386911071;
                    continue block13;
                }
                case -1016211712: {
                    var0_2 ^= var1_1 ^ 1280500235;
                    var1_1 = var2 ^ 443005188;
                    continue block13;
                }
                case -830031404: {
                    hQ.a = new int[4];
                    var1_1 = var2 ^ -376832529;
                    continue block13;
                }
                case 494228424: {
                    v1 = 0;
                    v3 = 0;
                    v2 = "\u0011\u00ce\u00d6\u0001Q\\t\u00a1\u00d3\u00a3^qJ\u00e0\u0099\u00f8".getBytes("ISO-8859-1");
                    ** continue;
                }
                case 312633659: {
                    hQ.a = new String[]{"", hQ.c, hQ.a, hQ.d, hQ.b};
                    return;
                }
                case 1238985425: {
                    var1_1 = var2 ^ 960465562;
                    continue block13;
                }
                case 333160565: 
            }
            var0_2 ^= var1_1 ^ -453640746;
            var1_1 = var2 ^ -416870830;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static int QO(long var0, class_2960 var2_1) {
        block33: {
            block32: {
                block31: {
                    break block33;
lbl1:
                    // 1 sources

                    while (true) {
                        var8_10 = hN.fromResource(var0, var7_9);
                        var11_4 = (var9_3 | var12_2) ^ -1278725025;
                        break block31;
                        break;
                    }
lbl5:
                    // 1 sources

                    while (true) {
                        var11_4 = (var9_3 | var12_2) ^ 409731262;
                        break block31;
                        break;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        var11_4 = (var9_3 | var12_2) ^ -2110350977;
                        break block31;
                        while (true) {
                            var11_4 = (var9_3 | var12_2) ^ -1527456362;
                            break block31;
                            break;
                        }
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var7_9 = class_2960.method_60655((String)var2_1.method_12836(), (String)("textures/block/" + var2_1.method_12832() + var6_8 + ".png"));
                        var10_11 ^= -1356783913;
                        ** continue;
                        break;
                    }
                }
                block26: while (true) {
                    switch (var11_4) {
                        case -370575744: {
                            var10_11 ^= var11_4 ^ -2078014287;
                            var11_4 = (var9_3 | var12_2) ^ -1175824863;
                        }
                        default: {
                            continue block26;
                        }
                        case -819252631: {
                            var10_11 ^= var11_4 ^ -44055202;
                            ** continue;
                        }
                        case 1941172033: {
                            ++var5_7;
                            break block32;
                        }
                        case -516155679: {
                            if (var8_10 <= 0) ** continue;
                            ** continue;
                        }
                        case -669525088: {
                            var10_11 ^= var11_4 ^ -432504101;
                            var11_4 = (var9_3 | var12_2) ^ -1964771042;
                            continue block26;
                        }
                        case -768230946: {
                            return var8_10;
                        }
                    }
                    break;
                }
lbl41:
                // 1 sources

                block27: while (true) {
                    switch (var11_4) {
                        default: {
                            continue block27;
                        }
                        case -624726216: {
                            var10_11 ^= var11_4 ^ -2000446623;
                            var11_4 = (var9_3 | var12_2) ^ 1645524550;
                            continue block27;
                        }
                        case 164321721: {
                            if (var5_7 < var4_6) {
                                var11_4 = (var9_3 | var12_2) ^ -1660375868;
                                continue block27;
                            }
                            ** GOTO lbl65
                        }
                        case -153664709: {
                            var10_11 ^= var11_4 ^ -1982196447;
                            var11_4 = (var9_3 | var12_2) ^ -453240805;
                            continue block27;
                        }
                        case -1893468188: {
                            var6_8 = var3_5[var5_7];
                            ** GOTO lbl67
                        }
                        case 1503146047: {
                            var10_11 ^= var11_4 ^ -1047531392;
                            var11_4 = (var9_3 | var12_2) ^ 511601910;
                            continue block27;
                        }
lbl65:
                        // 1 sources

                        var11_4 = (var9_3 | var12_2) ^ 843571136;
                        continue block27;
lbl67:
                        // 1 sources

                        var10_11 ^= 308537352;
                        var10_11 ^= 1752065316;
                        var10_11 ^= -193290252;
                        ** continue;
                        case 1973519113: 
                    }
                    return 0;
                }
            }
lbl74:
            // 2 sources

            while (true) {
                var11_4 = (var9_3 | var12_2) ^ -1323532089;
                ** continue;
                break;
            }
        }
        var12_2 = 1214213023;
        var9_3 = hQ.a & 1214213023 ^ 599912173;
        var11_4 = 0;
        var10_11 = (var9_3 | var12_2) ^ -836094505;
        var11_4 = (var9_3 | var12_2) ^ 294590995;
        block29: while (true) {
            switch (var11_4) {
                default: {
                    continue block29;
                }
                case -856684666: {
                    var10_11 ^= var11_4 ^ 453741225;
                    var11_4 = (var9_3 | var12_2) ^ 670186252;
                    continue block29;
                }
                case 1278072051: {
                    var3_5 = hQ.a;
                    var4_6 = var3_5.length;
                    var5_7 = 0;
                    ** continue;
                }
                case 2052126188: 
            }
            var11_4 = (var9_3 | var12_2) ^ -1490032519;
        }
    }

    private static int QP(int n2, int n3) {
        int n4 = -1235063624;
        int n5 = -185380274;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x7156F14C)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xF6F3AED6;
        n6 ^= (n5 | n4) ^ 0xF6F3A6B5;
        n6 -= (n5 | n4) ^ 0xF6F32D99;
        n6 += (n5 | n4) ^ 0xF6F38F6B;
        n6 -= (n5 | n4) ^ 0xF6F39C95;
        n6 ^= (n5 | n4) ^ 0xF6F35529;
        n6 ^= (n5 | n4) ^ 0xF6F39019;
        n6 ^= (n5 | n4) ^ 0xF6F37D6E;
        return n6 -= (n5 | n4) ^ 0xF6F32DAE;
    }
}

