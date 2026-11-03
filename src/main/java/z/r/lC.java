/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1297
 *  net.minecraft.class_238
 *  net.minecraft.class_4588
 *  org.joml.Matrix4f
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_4588;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class lC {
    private static final int[] a;
    public static final int b;
    private static final int a;

    private static int EJ(int n2, int n3) {
        int n4 = -758432691;
        int n5 = 472803816;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x38847450)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xDEEFE2EE;
        n6 += (n5 | n4) ^ 0xDEEF6478;
        n6 += (n5 | n4) ^ 0xDEEF13E1;
        n6 ^= (n5 | n4) ^ 0xDEEF56B9;
        n6 ^= (n5 | n4) ^ 0xDEEF4555;
        n6 -= (n5 | n4) ^ 0xDEEFF063;
        n6 -= (n5 | n4) ^ 0xDEEF857A;
        n6 -= (n5 | n4) ^ 0xDEEF2305;
        n6 ^= (n5 | n4) ^ 0xDEEFABF6;
        return n6 += (n5 | n4) ^ 0xDEEF2716;
    }

    /*
     * Enabled aggressive block sorting
     */
    private lC() {
        int n2 = b & 0xBCBAF629 ^ 0x1FBD878F;
        int n3 = (n2 | 0xBCBAF629) ^ 0x8EB69E6F;
        n3 ^= 0xCF3B9459;
        n3 ^= 0x7549077D;
    }

    /*
     * Exception decompiling
     */
    static void render(WorldRenderContext var0, class_1297 var1_1, int var2_2, boolean var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [96[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block29: {
            block28: {
                break block29;
lbl1:
                // 1 sources

                while (true) {
                    var1_3 = var0_2.length / 4;
                    var7_1 = var8 ^ 1295228524;
                    break block28;
                    break;
                }
lbl5:
                // 1 sources

                while (true) {
                    var7_1 = var8 ^ 1688781648;
                    break block28;
                    break;
                }
lbl8:
                // 1 sources

                block21: while (true) {
                    var5_8 = (var0_2[var3_6] & (((var6_5 ^= -471218125) | var8) ^ 1864892236)) << ((var6_5 | var8) ^ 1864892331) | (var0_2[var3_6 + 1] & ((var6_5 | var8) ^ 1864892236)) << ((var6_5 | var8) ^ 1864892323) | (var0_2[var3_6 + 2] & ((var6_5 | var8) ^ 1864892236)) << ((var6_5 | var8) ^ 1864892347) | var0_2[var3_6 + 3] & ((var6_5 | var8) ^ 1864892236);
                    var7_1 = var8 ^ -1074781310;
                    block22: while (true) {
                        block30: {
                            switch (var7_1) {
                                case -2095416525: {
                                    lC.a = lC.EJ((var6_5 | var7_1 ^ -383810560) ^ (var7_1 ^ -1701540421), var7_1 ^ -383810560 ^ ((var6_5 | var7_1 ^ -383810560) ^ (var7_1 ^ -1223024433)));
                                    return;
                                }
                                case -705307471: {
                                    var6_5 ^= var7_1 ^ -1246229453;
                                    ** GOTO lbl33
                                }
                                case -2050021013: {
                                    var6_5 ^= var7_1 ^ -723498505;
                                    ** break;
                                }
                                case -1052661579: {
                                    lC.a[var4_7] = var5_8 ^= var2_4;
                                    break block30;
                                }
                                case 982734186: {
                                    var3_6 += 4;
                                    if (++var4_7 < var1_3) continue block21;
                                    var7_1 = var8 ^ -271919528;
                                }
lbl29:
                                // 3 sources

                                default: {
                                    continue block22;
                                }
lbl31:
                                // 1 sources

                                var7_1 = var8 ^ -383810560;
                                continue block22;
lbl33:
                                // 1 sources

                                var7_1 = var8 ^ -1421584506;
                                continue block22;
                                case 436501840: 
                            }
                            var6_5 ^= var7_1 ^ -1717541407;
                            var7_1 = var8 ^ 1352051289;
                            ** GOTO lbl29
                        }
                        var7_1 = var8 ^ 1879147107;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    var0_2 = "q\u00952\u00e7\t\u00b1\u00e9\u00e8\u0010{\u00e9`E\u0001\u00b2\u00df\u0011\u0000\u008a\u00edMCk\u009bh)U\u0082\u00ef\u00d4\u00cd&2\u00861\u001c?\u00aamv\u00d9\u00b3\u00e0\u008f".getBytes("ISO-8859-1");
                    var6_5 ^= -328715883;
                    ** continue;
                    break;
                }
lbl46:
                // 1 sources

                while (true) {
                    var4_7 = 0;
                    ** continue;
                    break;
                }
            }
            block26: while (true) {
                switch (var7_1) {
                    default: {
                        continue block26;
                    }
                    case -1536657180: {
                        var6_5 ^= var7_1 ^ -1325058367;
                        var7_1 = var8 ^ 1298309296;
                        continue block26;
                    }
                    case 246234211: {
                        lC.a = new int[var1_3];
                        break;
                    }
                    case 657875295: {
                        var6_5 ^= var7_1 ^ 1720532052;
                        ** continue;
                    }
                    case 661086083: {
                        var3_6 = 0;
                        var6_5 ^= -1523938208;
                        ** continue;
                    }
                }
                var7_1 = var8 ^ -831682601;
            }
        }
        var8 = 1778777907;
        lC.b = mK.a(MethodHandles.lookup().lookupClass(), 1226263858);
        var7_1 = 0;
        var6_5 = -1243060643;
        var7_1 = var8 ^ -2086001749;
        block27: while (true) {
            switch (var7_1) {
                default: {
                    continue block27;
                }
                case 600692857: {
                    var2_4 = (var6_5 | var7_1 ^ 1237854026) ^ (var7_1 ^ 617232822) ^ lC.b;
                    break block27;
                }
                case -374350696: {
                    var7_1 = var8 ^ 672027095;
                    continue block27;
                }
                case 1108061924: {
                    var6_5 ^= var7_1 ^ 1840999665;
                    var7_1 = var8 ^ 1237854026;
                    continue block27;
                }
            }
            break;
        }
        var6_5 ^= 587646514;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static void EK(class_4588 var0, Matrix4f var1_1, double var2_2, double var4_3, double var6_4, double var8_5, int var10_6, int var11_7, int var12_8, int var13_9) {
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
    private static void EL(class_4588 var0, Matrix4f var1_1, class_238 var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        block58: {
            break block58;
lbl1:
            // 1 sources

            while (true) {
                var15_9 = (var13_8 | var16_7) ^ 285594144;
                ** GOTO lbl67
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                block59: {
                    var8_11 = (float)var2_2.field_1322;
                    var14_16 ^= 1216556485;
                    var9_12 = (float)var2_2.field_1321;
                    var14_16 ^= -1081416214;
                    var10_13 = (float)var2_2.field_1320;
                    var14_16 ^= -616695449;
                    break block59;
lbl12:
                    // 1 sources

                    while (true) {
                        var15_9 = (var13_8 | var16_7) ^ 1365844552;
                        ** GOTO lbl67
                        break;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        var15_9 = (var13_8 | var16_7) ^ 295460871;
                        ** GOTO lbl67
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var15_9 = (var13_8 | var16_7) ^ 780740923;
                        ** GOTO lbl67
lbl21:
                        // 1 sources

                        while (true) {
                            var15_9 = (var13_8 | var16_7) ^ 939786250;
                            ** GOTO lbl67
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var15_9 = (var13_8 | var16_7) ^ 1697945705;
                            if (true) ** GOTO lbl67
                            break;
                        }
                        break;
                    }
                }
                var11_14 = (float)var2_2.field_1325;
                var15_9 = (var13_8 | var16_7) ^ 559780062;
                block53: while (true) {
                    switch (var15_9) {
                        default: {
                            continue block53;
                        }
                        case 245837575: {
                            ** break;
                        }
                        case -1449271979: {
                            ** GOTO lbl45
                        }
                        case -743755515: {
                            var14_16 ^= var15_9 ^ -1856748653;
                            ** GOTO lbl43
                        }
                        case 1930440852: {
                            var14_16 ^= var15_9 ^ -956716323;
lbl43:
                            // 2 sources

                            var15_9 = (var13_8 | var16_7) ^ -2040044916;
                            continue block53;
                        }
lbl45:
                        // 1 sources

                        var15_9 = (var13_8 | var16_7) ^ 641987559;
                        continue block53;
                        case 163138622: {
                            var12_15 = (float)var2_2.field_1324;
                            ** continue;
                        }
                        case 1708272143: {
                            switch (var14_16) {
                                default: {
                                    var15_9 = (var13_8 | var16_7) ^ 1413004558;
                                    continue block53;
                                }
                                case -1215096797: {
                                    var15_9 = (var13_8 | var16_7) ^ 1558875981;
                                    continue block53;
                                }
                                case 246782950: 
                            }
                            var15_9 = (var13_8 | var16_7) ^ -61763876;
                            continue block53;
                        }
                        case 2076312279: 
                    }
                    var14_16 ^= var15_9 ^ -1497896612;
lbl63:
                    // 2 sources

                    var15_9 = (var13_8 | var16_7) ^ 1244173782;
                }
                block54: while (true) {
                    var15_9 = (var13_8 | var16_7) ^ 2011649147;
lbl67:
                    // 7 sources

                    block55: while (true) {
                        switch (var15_9) {
                            case 348610776: {
                                lC.line(var0, var1_1, var10_13, var11_14, var12_15, var7_10, var11_14, var12_15, var3_3, var4_4, var5_5, var6_6);
                                var15_9 = (var13_8 | var16_7) ^ 1726304865;
                                continue block55;
                            }
                            case 1056927225: {
                                var14_16 ^= var15_9 ^ 1273997816;
                                var15_9 = (var13_8 | var16_7) ^ 1814076851;
                                continue block55;
                            }
                            case 1046929374: {
                                var14_16 ^= var15_9 ^ -13956880;
                                var15_9 = (var13_8 | var16_7) ^ -283055182;
                                continue block55;
                            }
                            case -776161864: {
                                lC.line(var0, var1_1, var7_10, var8_11, var9_12, var7_10, var11_14, var9_12, var3_3, var4_4, var5_5, var6_6);
                                var15_9 = (var13_8 | var16_7) ^ 617206436;
                                continue block55;
                            }
                            case 1138369130: {
                                lC.line(var0, var1_1, var10_13, var8_11, var12_15, var10_13, var11_14, var12_15, var3_3, var4_4, var5_5, var6_6);
                                continue block54;
                            }
                            case -1742927830: {
                                lC.line(var0, var1_1, var7_10, var8_11, var12_15, var7_10, var11_14, var12_15, var3_3, var4_4, var5_5, var6_6);
                                var15_9 = (var13_8 | var16_7) ^ 566126466;
                                continue block55;
                            }
                            case 1138808521: {
                                lC.line(var0, var1_1, var7_10, var11_14, var12_15, var7_10, var11_14, var9_12, var3_3, var4_4, var5_5, var6_6);
                                var15_9 = (var13_8 | var16_7) ^ 57595084;
                                continue block55;
                            }
                            case 1226829240: {
                                var14_16 ^= var15_9 ^ -1504417550;
                                var15_9 = (var13_8 | var16_7) ^ 1813670160;
                                continue block55;
                            }
                            case 1255024560: {
                                var14_16 ^= var15_9 ^ -1684184374;
                                ** GOTO lbl123
                            }
                            case 402571219: {
                                var14_16 ^= var15_9 ^ 1421658910;
                                ** GOTO lbl133
                            }
                            case 747924245: {
                                var14_16 ^= var15_9 ^ -1547163407;
                                ** break;
                            }
                            case 187919741: {
                                var14_16 ^= var15_9 ^ 1356805962;
                                ** GOTO lbl128
                            }
                            case 1478355874: {
                                var14_16 ^= var15_9 ^ 421568491;
                                var15_9 = (var13_8 | var16_7) ^ -1209550861;
                            }
                            default: {
                                continue block55;
                            }
lbl117:
                            // 1 sources

                            var15_9 = (var13_8 | var16_7) ^ -28964255;
                            continue block55;
                            case 24352482: {
                                var14_16 ^= var15_9 ^ 971456629;
                                var15_9 = (var13_8 | var16_7) ^ -1753093653;
                                continue block55;
                            }
lbl123:
                            // 1 sources

                            var15_9 = (var13_8 | var16_7) ^ 993910529;
                            continue block55;
                            case 5271523: {
                                var14_16 ^= var15_9 ^ 1933379478;
                                ** GOTO lbl135
                            }
lbl128:
                            // 1 sources

                            var15_9 = (var13_8 | var16_7) ^ -1235315556;
                            continue block55;
                            case -1059433365: {
                                lC.line(var0, var1_1, var7_10, var8_11, var9_12, var10_13, var8_11, var9_12, var3_3, var4_4, var5_5, var6_6);
                                ** continue;
                            }
lbl133:
                            // 1 sources

                            var15_9 = (var13_8 | var16_7) ^ 40614169;
                            continue block55;
lbl135:
                            // 1 sources

                            var15_9 = (var13_8 | var16_7) ^ 1968605960;
                            continue block55;
                            case -1199876558: {
                                lC.line(var0, var1_1, var10_13, var11_14, var9_12, var10_13, var11_14, var12_15, var3_3, var4_4, var5_5, var6_6);
                                ** continue;
                            }
                            case 1521235153: {
                                lC.line(var0, var1_1, var7_10, var11_14, var9_12, var10_13, var11_14, var9_12, var3_3, var4_4, var5_5, var6_6);
                                ** continue;
                            }
                            case -1717294267: {
                                lC.line(var0, var1_1, var10_13, var8_11, var9_12, var10_13, var11_14, var9_12, var3_3, var4_4, var5_5, var6_6);
                                ** continue;
                            }
                            case 239392859: {
                                var14_16 ^= var15_9 ^ 1940890767;
                                var15_9 = (var13_8 | var16_7) ^ -1265356698;
                                continue block55;
                            }
                            case 764479168: {
                                lC.line(var0, var1_1, var10_13, var8_11, var9_12, var10_13, var8_11, var12_15, var3_3, var4_4, var5_5, var6_6);
                                var15_9 = (var13_8 | var16_7) ^ 2073318380;
                                continue block55;
                            }
                            case -1687253057: {
                                return;
                            }
                            case 2051412198: {
                                lC.line(var0, var1_1, var7_10, var8_11, var12_15, var7_10, var8_11, var9_12, var3_3, var4_4, var5_5, var6_6);
                                var15_9 = (var13_8 | var16_7) ^ 799723578;
                                continue block55;
                            }
                            case 1490871456: {
                                var14_16 ^= var15_9 ^ 883665075;
                                var15_9 = (var13_8 | var16_7) ^ 1438428991;
                                continue block55;
                            }
                            case 1416555573: {
                                var14_16 ^= var15_9 ^ 398674840;
                                ** continue;
                            }
                            case 2123603345: 
                        }
                        lC.line(var0, var1_1, var10_13, var8_11, var12_15, var7_10, var8_11, var12_15, var3_3, var4_4, var5_5, var6_6);
                        var15_9 = (var13_8 | var16_7) ^ 1999002489;
                    }
                    break;
                }
                break;
            }
lbl171:
            // 1 sources

            while (true) {
                var14_16 ^= 1086062335;
                ** continue;
                break;
            }
        }
        var16_7 = 16418625;
        var13_8 = lC.b & 16418625 ^ 793950873;
        var15_9 = 0;
        var14_16 = (var13_8 | var16_7) ^ -302107688;
        var15_9 = (var13_8 | var16_7) ^ 30109555;
        block57: while (true) {
            switch (var15_9) {
                default: {
                    continue block57;
                }
                case 775016618: {
                    var15_9 = (var13_8 | var16_7) ^ -1027076040;
                    continue block57;
                }
                case -2075924613: {
                    var7_10 = (float)var2_2.field_1323;
                    ** continue;
                }
                case -315445279: 
            }
            var14_16 ^= var15_9 ^ 1292662705;
            var15_9 = (var13_8 | var16_7) ^ -1413916510;
        }
    }

    /*
     * Exception decompiling
     */
    private static void line(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11) {
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

