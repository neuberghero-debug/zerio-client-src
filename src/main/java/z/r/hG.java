/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2350
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  net.minecraft.class_638
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_638;
import z.r.hb;
import z.r.hl;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class hG {
    private static final double a;
    private static final int a;
    private static final int b;
    private static final double b;
    private static final int c;
    public static final int d;
    private static final int[] a;
    private static final int e;
    private static final double c;
    private static final double d;
    private static final int f;
    private static final double e;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final double f;
    public static final int k;
    private static final long[] a;
    private static final hb a;
    public static final int l;
    private static final class_2350[] a;

    /*
     * Enabled aggressive block sorting
     */
    private hG() {
        int n2 = l & 0xDE35340E ^ 0xA6CC3E77;
        int n3 = (n2 | 0xDE35340E) ^ 0x396ED36F;
        n3 ^= 0x7B2B55EE;
        n3 ^= 0x2C191196;
    }

    private static int Tx(int n2, int n3) {
        int n4 = -109011526;
        int n5 = 2052227715;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xE123612F)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xFBD26801;
        n6 += (n5 | n4) ^ 0xFBD28A3B;
        n6 += (n5 | n4) ^ 0xFBD297E4;
        n6 += (n5 | n4) ^ 0xFBD2CBA4;
        n6 -= (n5 | n4) ^ 0xFBD20839;
        return n6 -= (n5 | n4) ^ 0xFBD26206;
    }

    /*
     * Exception decompiling
     */
    public static hb scanChunk(class_638 var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
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
    private static class_2338 Ty(class_2818 var0, int var1_1, int var2_2, int var3_3, int var4_4) {
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
    private static hb Tz(class_638 var0, int var1_1, int var2_2, class_2338 var3_3, int var4_4, int var5_5, int var6_6) {
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
    private static int TA(class_638 var0, class_2338.class_2339 var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
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
     */
    private static boolean TB(class_2680 var0) {
        block29: {
            block26: {
                block24: {
                    block27: {
                        block25: {
                            block28: {
                                break block28;
lbl1:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 336560226;
                                    break block24;
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    v0 = true;
                                    break block25;
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 2054603467;
                                    break block24;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -821129874;
                                    break block24;
lbl13:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ 1897997506;
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var4_1 = -1684860481;
                            var1_2 = hG.l & -1684860481 ^ 1812760247;
                            var3_3 = 0;
                            var2_4 = (var1_2 | var4_1) ^ 658654836;
                            ** GOTO lbl64
lbl22:
                            // 1 sources

                            while (!var0.method_26215()) {
                                ** continue;
lbl24:
                                // 1 sources

                                ** GOTO lbl1
                            }
                            break block29;
lbl26:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -542348283;
                                break block26;
                                break;
                            }
                        }
lbl30:
                        // 2 sources

                        while (true) {
                            var2_4 ^= 1872183318;
                            break block27;
                            break;
                        }
lbl33:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1446469848;
                            break block24;
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            v0 = false;
                            ** continue;
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1485050731;
                            break block24;
                            break;
                        }
                    }
                    return v0;
                }
lbl45:
                // 4 sources

                block22: while (true) {
                    switch (var3_3) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block22;
                            }
                            break;
                        }
                        case -166153946: {
                            ** continue;
                        }
                        case 1448544407: {
                            ** continue;
                        }
                        case -2048305804: {
                            ** GOTO lbl22
                        }
                        case -342878243: {
                            ** continue;
                        }
                        case 788409621: {
                            ** continue;
                        }
                        case 1551422513: {
                            ** continue;
                        }
                        case -1491368748: {
                            ** continue;
                        }
lbl64:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ -1545124978;
                        ** continue;
                        case 458462449: {
                            var2_4 ^= var3_3 ^ -368978463;
                            ** continue;
                        }
                        case 814815953: {
                            if (!var0.method_27852(class_2246.field_10382)) break block22;
                        }
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ -456391858;
                ** GOTO lbl45
                break block29;
            }
            var3_3 = (var1_2 | var4_1) ^ 159852185;
            ** GOTO lbl45
        }
        var3_3 = (var1_2 | var4_1) ^ -782124374;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static hb TC(class_638 var0, class_2818 var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
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
    private static void TD(class_638 var0, class_2338.class_2339 var1_1, List<class_2338> var2_2, Set<Long> var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, int var9_9, boolean var10_10, boolean var11_11, boolean var12_12, boolean var13_13) {
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
    private static boolean TE(class_2818 var0, int var1_1, int var2_2) {
        block58: {
            var11_3 = 1820359046;
            var8_4 = hG.l & 1820359046 ^ -1787626667;
            var10_5 = 0;
            var9_11 = (var8_4 | var11_3) ^ -271243265;
            var10_5 = (var8_4 | var11_3) ^ -1150367299;
            ** GOTO lbl114
lbl7:
            // 1 sources

            while (true) {
                var10_5 = (var8_4 | var11_3) ^ -213912152;
                ** GOTO lbl137
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var10_5 = (var8_4 | var11_3) ^ 329548713;
                break block58;
lbl13:
                // 1 sources

                while (true) {
                    var10_5 = (var8_4 | var11_3) ^ -1101437855;
                    break block58;
                    while (true) {
                        var10_5 = (var8_4 | var11_3) ^ 1268022076;
                        break block58;
                        break;
                    }
                    break;
                }
                break;
            }
lbl19:
            // 1 sources

            while (true) {
                var10_5 = (var8_4 | var11_3) ^ 1783792759;
                ** GOTO lbl78
                break;
            }
lbl22:
            // 1 sources

            while (true) {
                var10_5 = (var8_4 | var11_3) ^ 2101077885;
                ** GOTO lbl114
                break;
            }
        }
        block43: while (true) {
            switch (var10_5) {
                default: {
                    continue block43;
                }
                case 809694057: {
                    var9_11 ^= var10_5 ^ 764209432;
                    var10_5 = (var8_4 | var11_3) ^ -298047290;
                    continue block43;
                }
                case 332321553: {
                    if (var7_10 + hG.Tx((var9_11 | var10_5 ^ 2135861911) ^ (var10_5 ^ 1737805849), (var8_4 | var10_5 ^ 2135861911) ^ ((var9_11 | var10_5 ^ 2135861911) ^ (var10_5 ^ -1968682141))) >= var1_1) ** continue;
                    var10_5 = (var8_4 | var11_3) ^ -534738396;
                    continue block43;
                }
                case 1435863247: {
                    ** break;
                }
                case -1234796309: {
                    var9_11 ^= var10_5 ^ -1415013734;
                    ** break;
                }
                case -1561163590: {
                    var9_11 ^= var10_5 ^ -2097134973;
                    ** GOTO lbl51
                }
lbl46:
                // 1 sources

                var10_5 = (var8_4 | var11_3) ^ -504249034;
                continue block43;
                case -296322946: {
                    var9_11 ^= var10_5 ^ 981236571;
                    ** continue;
                }
lbl51:
                // 1 sources

                var10_5 = (var8_4 | var11_3) ^ -2029375762;
                continue block43;
                case 469974753: {
                    if (var6_9.method_19523((Predicate<class_2680>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, TR(net.minecraft.class_2680 ), (Lnet/minecraft/class_2680;)Z)())) {
                        ** continue;
                    }
                    ** GOTO lbl75
                }
                case 2063127865: {
                    if (var7_10 <= var2_2) {
                        var10_5 = (var8_4 | var11_3) ^ -844101442;
                        continue block43;
                    }
                    ** GOTO lbl75
                }
                case 500330995: {
                    var9_11 ^= var10_5 ^ 1862530;
                    var10_5 = (var8_4 | var11_3) ^ -1469615336;
                    continue block43;
                }
lbl66:
                // 2 sources

                while (true) {
                    var10_5 = (var8_4 | var11_3) ^ 1760781879;
                    ** GOTO lbl78
                    break;
                }
lbl69:
                // 1 sources

                while (true) {
                    var9_11 ^= 413399582;
                    var4_7 = var0.method_31607();
                    var9_11 ^= -440001162;
                    var5_8 = 0;
                    ** GOTO lbl66
                    break;
                }
lbl75:
                // 5 sources

                while (true) {
                    var10_5 = (var8_4 | var11_3) ^ 575307230;
                    ** GOTO lbl137
                    break;
                }
lbl78:
                // 2 sources

                block47: while (true) {
                    switch (var10_5) {
                        default: {
                            continue block47;
                        }
                        case -1012909363: {
                            var9_11 ^= var10_5 ^ -2083333833;
                            var10_5 = (var8_4 | var11_3) ^ 905232954;
                            continue block47;
                        }
                        case -456379879: {
                            if (var5_8 >= var3_6.length) ** GOTO lbl92
                            ** GOTO lbl94
                        }
                        case -939116051: {
                            var6_9 = var3_6[var5_8];
                            ** continue;
                        }
lbl92:
                        // 1 sources

                        var10_5 = (var8_4 | var11_3) ^ 771668174;
                        continue block47;
lbl94:
                        // 1 sources

                        var10_5 = (var8_4 | var11_3) ^ 1045610778;
                        continue block47;
                        case -804502759: {
                            var9_11 ^= var10_5 ^ 348699955;
                            ** continue;
                        }
                        case -1795056160: {
                            var9_11 ^= var10_5 ^ -68151058;
                            var10_5 = (var8_4 | var11_3) ^ 423545294;
                            continue block47;
                        }
lbl103:
                        // 1 sources

                        while (true) {
                            var10_5 = (var8_4 | var11_3) ^ -572456212;
                            ** GOTO lbl137
                            break;
                        }
                        case -1751089248: 
                    }
                    break;
                }
                return false;
lbl108:
                // 1 sources

                while (true) {
                    var10_5 = (var8_4 | var11_3) ^ 722935797;
                    ** GOTO lbl137
lbl111:
                    // 1 sources

                    while (true) {
                        var10_5 = (var8_4 | var11_3) ^ 1593865069;
                        continue block43;
                        break;
                    }
                    break;
                }
lbl114:
                // 2 sources

                block51: while (true) {
                    switch (var10_5) {
                        default: {
                            continue block51;
                        }
                        case -2134303574: {
                            var3_6 = var0.method_12006();
                            ** continue;
                        }
                        case -969020333: {
                            var9_11 ^= var10_5 ^ -1157744853;
                            ** continue;
                        }
                        case 1184641642: 
                    }
                    var10_5 = (var8_4 | var11_3) ^ 1003427716;
                }
lbl127:
                // 1 sources

                while (true) {
                    var10_5 = (var8_4 | var11_3) ^ -1344913917;
                    ** GOTO lbl137
                    break;
                }
lbl130:
                // 1 sources

                while (true) {
                    var10_5 = (var8_4 | var11_3) ^ 1999305470;
                    if (true) ** GOTO lbl137
                    break;
                }
                case 1135321014: 
            }
            break;
        }
        return true;
        block54: while (true) {
            var10_5 = (var8_4 | var11_3) ^ -897542697;
lbl137:
            // 7 sources

            block55: while (true) {
                switch (var10_5) {
                    default: {
                        continue block55;
                    }
                    case -181953539: {
                        if (var6_9 == null) ** GOTO lbl75
                        var10_5 = (var8_4 | var11_3) ^ -947604476;
                        continue block55;
                    }
                    case -689576926: {
                        ++var5_8;
                        ** continue;
                    }
                    case 538179899: {
                        if (!var6_9.method_38292()) continue block54;
                        ** continue;
                    }
                    case -2059987277: {
                        var7_10 = var4_7 + (var5_8 << 4);
                        ** continue;
                    }
                    case 1378141652: {
                        var9_11 ^= var10_5 ^ -1175242667;
                        ** continue;
                    }
                    case -1965555415: {
                        ** continue;
                    }
                    case 248319615: {
                        var9_11 ^= var10_5 ^ -2136340671;
                        var10_5 = (var8_4 | var11_3) ^ 148201514;
                        continue block55;
                    }
                    case 930246144: {
                        var9_11 ^= var10_5 ^ -44607048;
                        var10_5 = (var8_4 | var11_3) ^ 2026237284;
                        continue block55;
                    }
                    case 980832211: {
                        var9_11 ^= var10_5 ^ -777932206;
                        ** continue;
                    }
                    case -541555191: 
                }
                break;
            }
            break;
        }
        var9_11 ^= var10_5 ^ 2136795587;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static boolean TF(class_638 var0, class_2338.class_2339 var1_1, List<class_2338> var2_2) {
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
    private static double[] TG(double[][] var0, double[] var1_1) {
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
    private static List<List<class_2338>> TH(List<class_2338> var0, double var1_1, int var3_2) {
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
     */
    private static int TI(int[] var0, int var1_1) {
        block24: {
            block23: {
                var5_2 = -725328371;
                var2_3 = hG.l & -725328371 ^ -870922387;
                var4_4 = 0;
                var3_5 = (var2_3 | var5_2) ^ 743093403;
                ** GOTO lbl53
lbl6:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ -1702351401;
                    break block23;
                    break;
                }
lbl9:
                // 1 sources

                return var1_1;
            }
            var4_4 = (var2_3 | var5_2) ^ 972382705;
            ** GOTO lbl31
lbl14:
            // 2 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -1026140007;
                ** GOTO lbl31
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                var1_1 = var0[var1_1];
                ** GOTO lbl14
                break;
            }
lbl20:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 944070356;
                ** GOTO lbl31
                break;
            }
lbl23:
            // 1 sources

            while (true) {
                var0[var1_1] = var0[var0[var1_1]];
                ** continue;
                break;
            }
lbl26:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -321850562;
                ** GOTO lbl31
                break;
            }
lbl29:
            // 1 sources

            block18: while (true) {
                var4_4 = (var2_3 | var5_2) ^ -495397595;
lbl31:
                // 7 sources

                block19: while (true) {
                    switch (var4_4) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block19;
                            }
                            break;
                        }
                        case -1147524459: {
                            ** continue;
                        }
                        case -460095047: {
                            ** continue;
                        }
                        case -2101534263: {
                            ** continue;
                        }
                        case -450642276: {
                            ** continue;
                        }
                        case 805710931: {
                            ** continue;
                        }
lbl46:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1740136068;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 1051593288: {
                            if (var0[var1_1] != var1_1) {
                                ** continue;
                            }
                            break block24;
                        }
lbl53:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ 1733096952;
                        ** continue;
                        case 1283497169: {
                            var3_5 ^= var4_4 ^ 971544423;
                            break block18;
                        }
                        case 1150385681: {
                            var3_5 ^= var4_4 ^ -529044244;
                            ** continue;
                        }
                    }
                    break;
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ 1584135844;
            ** GOTO lbl31
        }
        var4_4 = (var2_3 | var5_2) ^ -1873394756;
        ** while (true)
        {
            ** case 503351284:
        }
lbl67:
        // 1 sources

        var3_5 ^= var4_4 ^ -990037657;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static void TJ(int[] var0, int var1_1, int var2_2) {
        block28: {
            block29: {
                block27: {
                    block31: {
                        block30: {
                            break block30;
lbl1:
                            // 1 sources

                            while (true) {
                                var7_5 = (var5_4 | var8_3) ^ -1643681986;
                                break block27;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var7_5 = (var5_4 | var8_3) ^ 575827992;
                                break block27;
                                break;
                            }
                        }
                        var8_3 = -716022010;
                        var5_4 = hG.l & -716022010 ^ -1191608649;
                        var7_5 = 0;
                        break block31;
lbl12:
                        // 2 sources

                        block15: while (true) {
                            switch (var7_5) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block15;
                                    }
                                    break;
                                }
lbl17:
                                // 1 sources

                                while (true) {
                                    var7_5 = (var5_4 | var8_3) ^ -1401542612;
                                    break block27;
                                    break;
                                }
lbl20:
                                // 1 sources

                                while (true) {
                                    var0[var3_6] = var4_7;
                                    ** GOTO lbl42
                                    break;
                                }
lbl23:
                                // 1 sources

                                while (true) {
                                    var7_5 = (var5_4 | var8_3) ^ -1623669539;
                                    ** continue;
                                    break;
                                }
                                case 1656994666: {
                                    var6_8 ^= var7_5 ^ -1435130272;
                                    break block28;
                                }
lbl29:
                                // 1 sources

                                while (true) {
                                    if (var3_6 != var4_7) {
                                        ** continue;
                                    }
                                    ** GOTO lbl42
                                    break;
                                }
                                case -2057985350: {
                                    var3_6 = hG.TI(var0, var1_1);
                                    var4_7 = hG.TI(var0, var2_2);
                                    ** continue;
                                }
lbl37:
                                // 1 sources

                                return;
lbl39:
                                // 1 sources

                                while (true) {
                                    var7_5 = (var5_4 | var8_3) ^ -1255305144;
                                    break block27;
                                    break;
                                }
lbl42:
                                // 2 sources

                                var7_5 = (var5_4 | var8_3) ^ -420430249;
                                break block27;
                                case 1705269216: {
                                    break block15;
                                }
                            }
                            break;
                        }
                        ** while (true)
lbl47:
                        // 1 sources

                        while (true) {
                            var6_8 ^= var7_5 ^ -572805063;
                            ** continue;
                            break;
                        }
                    }
                    var6_8 = (var5_4 | var8_3) ^ 247157651;
                    var7_5 = (var5_4 | var8_3) ^ -1738594217;
                    ** GOTO lbl12
lbl54:
                    // 1 sources

                    while (true) {
                        var6_8 ^= var7_5 ^ -1615937888;
                        break block29;
                        break;
                    }
                }
lbl58:
                // 2 sources

                block25: while (true) {
                    switch (var7_5) {
                        default: {
                            continue block25;
                        }
                        case -542568529: {
                            ** continue;
                        }
                        case 1222045695: {
                            ** continue;
                        }
                        case 1456424536: {
                            ** continue;
                        }
                        case 1368217499: {
                            ** continue;
                        }
                        case 453755360: {
                            ** continue;
                        }
                        ** case 1677465737:
lbl73:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            var7_5 = (var5_4 | var8_3) ^ -1422640657;
            ** while (true)
        }
        var7_5 = (var5_4 | var8_3) ^ 2024725773;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static long TK(class_2338 var0, int var1_1) {
        var2_2 = hG.l & 692145256 ^ -1206431646;
        var4_3 = 0;
        var3_4 = (var2_2 | 692145256) ^ 1107438658;
        var4_3 = (var2_2 | 692145256) ^ -1932560817;
        block5: while (true) {
            switch (var4_3) {
                case 899164709: {
                    var4_3 = (var2_2 | 692145256) ^ 116908375;
                    ** break;
                }
                case -1079984835: {
                    var3_4 ^= var4_3 ^ -324468955;
                    var4_3 = (var2_2 | 692145256) ^ -5795817;
                }
lbl13:
                // 3 sources

                default: {
                    continue block5;
                }
                case 1190186109: 
            }
            break;
        }
        var3_4 ^= 1633258829;
        var3_4 ^= 552452825;
        return hG.TL(Math.floorDiv(var0.method_10263(), var1_1), Math.floorDiv(var0.method_10264(), var1_1), Math.floorDiv(var0.method_10260(), var1_1));
    }

    /*
     * Unable to fully structure code
     */
    private static long TL(int var0, int var1_1, int var2_2) {
        block10: {
            block9: {
                var6_3 = -577438412;
                var3_4 = hG.l & 122906334 ^ -76142882;
                var5_5 = 0;
                var4_6 = (var3_4 | 122906334) ^ 1282521710;
                ** GOTO lbl22
lbl6:
                // 1 sources

                while (true) {
                    var4_6 ^= var5_5 ^ -32476232;
                    break block9;
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | 122906334) ^ -1760404114;
                    break block10;
                    break;
                }
            }
            var5_5 = (var3_4 | 122906334) ^ 632356148;
        }
        block7: while (true) {
            switch (var5_5) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block7;
                    }
                    break;
                }
                case 1751464880: {
                    ** continue;
                }
lbl22:
                // 1 sources

                var5_5 = (var3_4 | 122906334) ^ -1099423003;
                ** continue;
                case 1091519547: {
                    ** continue;
                }
                case -624452630: {
                    return (long)(var0 & hG.Tx((var4_6 | var5_5 ^ var6_3) ^ (var5_5 ^ -414870621), (var3_4 | var5_5 ^ var6_3) ^ ((var4_6 | var5_5 ^ var6_3) ^ (var5_5 ^ 347138851)))) << hG.Tx((var4_6 | var5_5 ^ var6_3) ^ (var5_5 ^ -414870620), (var3_4 | var5_5 ^ var6_3) ^ ((var4_6 | var5_5 ^ var6_3) ^ (var5_5 ^ 120099604))) | (long)(var2_2 & hG.Tx((var4_6 | var5_5 ^ var6_3) ^ (var5_5 ^ -414870619), (var3_4 | var5_5 ^ var6_3) ^ ((var4_6 | var5_5 ^ var6_3) ^ (var5_5 ^ -941661565)))) << hG.Tx((var4_6 | var5_5 ^ var6_3) ^ (var5_5 ^ -414870618), (var3_4 | var5_5 ^ var6_3) ^ ((var4_6 | var5_5 ^ var6_3) ^ (var5_5 ^ 1638787077))) | (long)(var1_1 & hG.Tx((var4_6 | var5_5 ^ var6_3) ^ (var5_5 ^ -414870617), (var3_4 | var5_5 ^ var6_3) ^ ((var4_6 | var5_5 ^ var6_3) ^ (var5_5 ^ 1106736328))));
                }
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static long TM(int n2, int n3) {
        int n4 = l & 0x1D5D9408 ^ 0x883B684A;
        int n5 = 0;
        int n6 = (n4 | 0x1D5D9408) ^ 0xB4EE8C15;
        n5 = (n4 | 0x1D5D9408) ^ 0x24FF9E6D;
        block5: while (true) {
            block6: {
                switch (n5) {
                    default: {
                        continue block5;
                    }
                    case 2034353035: {
                        return (long)(n2 >> 3) << hG.Tx((n6 | n5 ^ 0x641C5783) ^ (n5 ^ 0xBC4DA2EC), (n4 | n5 ^ 0x641C5783) ^ ((n6 | n5 ^ 0x641C5783) ^ (n5 ^ 0x4CC4A870))) | (long)(n3 >> 3) & (-4415462933173706716L << (n5 ^ 0x7941C3AB) >>> (n5 ^ 0x7941C3AB) ^ (long)n6 & 0xFFFFFFFFL | (-4415462933173706716L >>> (n5 ^ 0x7941C3AB) ^ (long)n6 & 0xFFFFFFFFL) << (n5 ^ 0x7941C3AB));
                    }
                    case -1182768601: {
                        break;
                    }
                    case -1607566303: {
                        n6 ^= n5 ^ 0x4B0613A5;
                        break block6;
                    }
                }
                n5 = (n4 | 0x1D5D9408) ^ 0x3D51806B;
                continue;
            }
            n5 = (n4 | 0x1D5D9408) ^ 0xE43E3FC1;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static long[] TN(List<class_2338> var0) {
        var6_1 = -96423694;
        var3_2 = hG.l & -96423694 ^ 525292889;
        var5_3 = 0;
        var4_4 = (var3_2 | var6_1) ^ 1050395760;
        var5_3 = (var3_2 | var6_1) ^ -343562016;
        if (true) ** GOTO lbl37
        block13: while (true) {
            var5_3 = (var3_2 | var6_1) ^ 339462056;
            if (true) ** GOTO lbl12
            block14: while (true) {
                var5_3 = (var3_2 | var6_1) ^ -2085396515;
lbl12:
                // 2 sources

                block15: while (true) {
                    switch (var5_3) {
                        case 2096933414: {
                            var1_5[var2_6] = var0.get(var2_6).method_10063();
                            ++var2_6;
                            continue block13;
                        }
                        case 1358080672: {
                            if (var2_6 < var1_5.length) {
                                var5_3 = (var3_2 | var6_1) ^ 1002879696;
                                continue block15;
                            }
                            ** GOTO lbl30
                        }
                        case 1485874364: {
                            var4_4 ^= var5_3 ^ -597450497;
                            var5_3 = (var3_2 | var6_1) ^ 1550691634;
                            continue block15;
                        }
                        case -997634261: {
                            var4_4 ^= var5_3 ^ -2026154188;
                            continue block14;
                        }
lbl30:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ -1478536889;
                        continue block15;
                        case -344706477: {
                            var4_4 ^= var5_3 ^ -1463408052;
                            var5_3 = (var3_2 | var6_1) ^ -1346543781;
                        }
                        default: {
                            continue block15;
                        }
lbl37:
                        // 1 sources

                        block16: while (true) {
                            switch (var5_3) {
                                default: {
                                    continue block16;
                                }
                                case 1778030649: {
                                    var1_5 = new long[var0.size()];
                                    var4_4 ^= -1186130880;
                                    var2_6 = 0;
                                    continue block13;
                                }
                                case 348806427: {
                                    var5_3 = (var3_2 | var6_1) ^ 1483172878;
                                    continue block16;
                                }
                                case -1490511371: 
                            }
                            var4_4 ^= var5_3 ^ 637913534;
                            var5_3 = (var3_2 | var6_1) ^ -1766494782;
                        }
                        case -1558030135: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return var1_5;
    }

    /*
     * Exception decompiling
     */
    private static boolean TO(class_638 var0, int var1_1, int var2_2) {
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
    private static /* synthetic */ List TP(Integer var0) {
        var1_1 = hG.l & 87159093 ^ -1460513338;
        var3_2 = 0;
        var2_3 = (var1_1 | 87159093) ^ -1760114417;
        var3_2 = (var1_1 | 87159093) ^ -1786560984;
        if (true) ** GOTO lbl10
        block5: while (true) {
            switch (var3_2) {
                case 946916319: {
                    var3_2 = (var1_1 | 87159093) ^ -1620579860;
                }
lbl10:
                // 3 sources

                default: {
                    continue block5;
                }
                case 848567323: {
                    var2_3 ^= var3_2 ^ -1760821051;
                    var3_2 = (var1_1 | 87159093) ^ 414581148;
                    continue block5;
                }
                case -1253706645: 
            }
            break;
        }
        return new ArrayList<E>();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var9 = -1445974181;
        var8_1 = -885070786;
        hG.l = mK.a(MethodHandles.lookup().lookupClass(), -1779305360);
        var7_2 = 0;
        var6_9 = 1957061179;
        var7_2 = var8_1 ^ -1953719210;
        if (true) ** GOTO lbl-1000
lbl8:
        // 1 sources

        while (true) {
            var7_2 = var8_1 ^ 1176848077;
            ** GOTO lbl53
lbl11:
            // 1 sources

            while (true) {
                var7_2 = var8_1 ^ 734669756;
                ** GOTO lbl53
                break;
            }
            break;
        }
lbl14:
        // 1 sources

        while (true) {
            var7_2 = var8_1 ^ -489550668;
            ** GOTO lbl53
lbl17:
            // 1 sources

            while (true) {
                var7_2 = var8_1 ^ -741582450;
                ** GOTO lbl53
                break;
            }
lbl20:
            // 1 sources

            while (true) {
                var7_2 = var8_1 ^ -1128210760;
                ** GOTO lbl53
                break;
            }
            break;
        }
        block30: while (true) {
            block37: {
                block38: {
                    switch (var7_2) lbl-1000:
                    // 2 sources

                    {
                        default: {
                            continue block30;
                        }
                        case 1187955158: {
                            var2_5 = (var6_9 | var7_2 ^ -1913641496) ^ (var7_2 ^ 1133821473) ^ hG.l;
                            ** break;
                        }
                        case 1937995624: {
                            var6_9 ^= var7_2 ^ 1089138206;
                            break block37;
                        }
lbl33:
                        // 1 sources

                        var6_9 ^= -1644063224;
                        break block38;
                        case 1085438056: 
                    }
                    var7_2 = var8_1 ^ -1195535530;
                    continue;
                }
                var0_3 = "bW#l\u00d1\u0013\u00f5\t\u008eX\u000b\u00a5\u00bb\u00d91\u00f5\u00adO.\u00d97\u00b30e\u000ey\u0086\u001e\u00c6\u0017\u009fV J\u00cf\u00fa8v\u00b5P{\u007fF,!\u00e5j\u00db2JU2\u00e6\u00c5?5\u00d3~\u00c9\u0007\u00af=T!g\u00fet\u00ed\u008fM\u008c\u00dc\u009c\u00a2'w\u00f5\u00c9\u0086\u00dc\u00a7\u00cc6\u00c1\u00ba\u001bw\u0091\u0003m\u00dbL\u00c4\u0004\u00d2mo[\u0099h%\u00c7\u00ff\u00b8\u00bf3\u0096\u00b1\u0000\u008a\u00bb\u00d4\u0002\u00c2\u000b\u00e0S\u001a\u001bB@w\u00d9\u00c2\u0090\u00be\u00a3\u009f#g\u00fa\u00ea\u008cp\u00fc*\u0080\u00e6\u00f4\u00d3\u0018\u00c6\u00c57\u000f^\u00bd,\u00cb\u00a9L\u0091i\u00db\u00c6\u0001I\u0081J\u00d8}\u00b2-\u009eZ+,\u0082\u00e6@\u0018\b\u00a7\u00bf\u00dc\u0013\u00e7k\u00b5\u000e\u0016k\u008f\u00bc\u0098\u0088\u00c1\u00b5\u00cd?\u00f9S\u0098E3F@W\u00c1\u0011@U\u001a\u008e\u00b1/\u00e5+".getBytes("ISO-8859-1");
                var6_9 ^= 745517579;
                var1_4 = var0_3.length / 4;
                var7_2 = var8_1 ^ 137948371;
                if (true) ** GOTO lbl119
            }
            var7_2 = var8_1 ^ -1913641496;
        }
lbl47:
        // 1 sources

        while (true) {
            var6_9 ^= 110784084;
            var4_7 = 0;
            if (true) ** GOTO lbl73
            block32: while (true) {
                var7_2 = var8_1 ^ var9;
lbl53:
                // 6 sources

                block33: while (true) {
                    switch (var7_2) {
                        case 703391882: {
                            hG.a[var4_7] = var5_8 ^= var2_5;
                            var7_2 = var8_1 ^ -866550307;
                            continue block33;
                        }
                        case -1398038317: {
                            hG.a = new long[0];
                            ** continue;
                        }
                        case 124230115: {
                            var6_9 ^= var7_2 ^ 770786040;
                            ** continue;
                        }
                        case -520827006: {
                            var3_6 += 4;
                            if (++var4_7 >= var1_4) {
                                ** continue;
                            }
                            ** GOTO lbl73
                        }
                        case -1927568653: {
                            var6_9 ^= var7_2 ^ -676474770;
                            continue block32;
                        }
lbl73:
                        // 2 sources

                        var5_8 = (var0_3[var3_6] & (((var6_9 ^= -1999645356) | var8_1) ^ -616630911)) << ((var6_9 | var8_1) ^ -616630938) | (var0_3[var3_6 + 1] & ((var6_9 | var8_1) ^ -616630911)) << ((var6_9 | var8_1) ^ -616630930) | (var0_3[var3_6 + 2] & ((var6_9 | var8_1) ^ -616630911)) << ((var6_9 | var8_1) ^ -616630922) | var0_3[var3_6 + 3] & ((var6_9 | var8_1) ^ -616630911);
                        var7_2 = var8_1 ^ -1839475601;
                        continue block33;
                        case 2013149830: {
                            hG.a = class_2350.values();
                            var7_2 = var8_1 ^ 1765512102;
                            break;
                        }
                        case 418561456: {
                            var6_9 ^= var7_2 ^ 628875038;
                            ** continue;
                        }
                        case -1576700008: {
                            var6_9 ^= var7_2 ^ -1973612256;
                            var7_2 = var8_1 ^ 457493515;
                            break;
                        }
                        case -809268259: {
                            var6_9 ^= var7_2 ^ 668757909;
                            var7_2 = var8_1 ^ 1737835757;
                            continue block33;
                        }
                        case 1499803729: {
                            var6_9 ^= var7_2 ^ -79938018;
                            ** continue;
                        }
                        case -797300683: {
                            hG.a = new hb(hl.f, hG.a, 0);
                            return;
                        }
                        case 1659816805: {
                            hG.k = hG.Tx((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1285504153), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 842125503)));
                            hG.f = 11.0;
                            hG.j = hG.Tx((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1285504156), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1906671342)));
                            hG.i = hG.Tx((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1285504155), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -811261909)));
                            hG.h = hG.Tx((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1285504158), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1888401097)));
                            hG.g = hG.Tx((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1285504157), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 2121364356)));
                            hG.e = 7.0;
                            hG.f = hG.Tx((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1285504160), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -258851448)));
                            hG.d = 0.72;
                            hG.c = 6.0;
                            hG.e = hG.Tx((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1285504159), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1524300440)));
                            hG.d = hG.Tx((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1285504130), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -262156444)));
                            hG.c = hG.Tx((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1285504129), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 676150581)));
                            hG.b = 3.0;
                            hG.b = hG.Tx((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1285504132), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 676325038)));
                            hG.a = hG.Tx((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1285504131), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -650831608)));
                            hG.a = 1.35;
                            var7_2 = var8_1 ^ 83718115;
                        }
                    }
                }
                break;
            }
            break;
        }
        block34: while (true) {
            var7_2 = var8_1 ^ -2025357027;
lbl119:
            // 2 sources

            block35: while (true) {
                switch (var7_2) {
                    default: {
                        continue block35;
                    }
                    case 850015965: {
                        var6_9 ^= var7_2 ^ -956590127;
                        continue block34;
                    }
                    case -1023014675: {
                        var6_9 ^= var7_2 ^ 1553841407;
                        var7_2 = var8_1 ^ 141005012;
                        continue block35;
                    }
                    case -1017547542: {
                        hG.a = new int[var1_4];
                        var7_2 = var8_1 ^ -107687197;
                        continue block35;
                    }
                    case 1283024163: 
                }
                break;
            }
            break;
        }
        var3_6 = 0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ List TQ(Long l2) {
        int n2 = l & 0xEC3DFCBF ^ 0x490755F4;
        int n3 = 0;
        int n4 = (n2 | 0xEC3DFCBF) ^ 0xB3743A31;
        n3 = (n2 | 0xEC3DFCBF) ^ 0xA4938A0E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -856235884: {
                    n4 ^= n3 ^ 0xC90E985;
                    n3 = (n2 | 0xEC3DFCBF) ^ 0xB397B094;
                    continue block5;
                }
                case 1588088171: {
                    return new ArrayList();
                }
                case 1236039665: 
            }
            n3 = (n2 | 0xEC3DFCBF) ^ 0x21C91D6B;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ boolean TR(class_2680 var0) {
        block26: {
            block28: {
                block25: {
                    block27: {
                        block24: {
                            break block27;
lbl1:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -2042803080;
                                break block24;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                v0 = false;
                                break block25;
                                break;
                            }
                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 2074051513;
                                break block26;
                                break;
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ 1280140219;
                        break block26;
                    }
                    var4_1 = -1727167722;
                    var1_2 = hG.l & -1727167722 ^ -576955165;
                    var3_3 = 0;
                    break block28;
lbl18:
                    // 1 sources

                    while (true) {
                        if (!var0.method_27852(class_2246.field_22423)) ** continue;
                        ** GOTO lbl57
                        break;
                    }
                }
lbl22:
                // 2 sources

                while (true) {
                    var2_4 ^= 572921676;
                    ** GOTO lbl68
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1267574350;
                    break block26;
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -142072487;
                    ** continue;
                    break;
                }
            }
            var2_4 = (var1_2 | var4_1) ^ -739939329;
            var3_3 = (var1_2 | var4_1) ^ 1045832097;
            break block26;
lbl35:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ 1084921812;
                ** GOTO lbl71
                break;
            }
        }
        block19: while (true) {
            switch (var3_3) lbl-1000:
            // 6 sources

            {
                while (true) {
                    default: {
                        continue block19;
                    }
                    break;
                }
                case -1100682205: {
                    ** continue;
                }
                case 1985843064: {
                    ** continue;
                }
                case -1672189702: {
                    ** continue;
                }
                case 287370947: {
                    ** continue;
                }
                case -1509794738: {
                    ** continue;
                }
lbl54:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1677276116;
                    ** GOTO lbl-1000
                    break;
                }
lbl57:
                // 2 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -860016332;
                    ** GOTO lbl-1000
                    break;
                }
                case -473170346: {
                    ** continue;
                }
                case -1848591284: {
                    if (var0.method_27852(class_2246.field_10092)) ** continue;
                    ** GOTO lbl69
                }
lbl65:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1103738637;
                    ** GOTO lbl-1000
                    break;
                }
lbl68:
                // 1 sources

                return v0;
lbl69:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 1535381273;
                ** GOTO lbl-1000
lbl71:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -1413459825;
                ** continue;
                case -1777305159: {
                    v0 = true;
                    ** continue;
                }
                case -2045128466: 
            }
            break;
        }
        ** while (true)
    }
}

