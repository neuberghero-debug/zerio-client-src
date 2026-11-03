/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1011
 *  net.minecraft.class_1058
 *  net.minecraft.class_1799
 *  net.minecraft.class_1921
 *  net.minecraft.class_2960
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1011;
import net.minecraft.class_1058;
import net.minecraft.class_1799;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import z.r.dU;
import z.r.iN;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class jC {
    public static final int b;
    private static final int[] a;
    static final int a;
    private static final float[] a;
    private static final float[] b;
    private static final Map<class_2960, class_1011> a;

    /*
     * Enabled aggressive block sorting
     */
    private jC() {
        int n2 = b & 0xBCB28BD5 ^ 0x125D7A12;
        int n3 = (n2 | 0xBCB28BD5) ^ 0x9A808006;
        n3 ^= 0xD7CDD87F;
    }

    /*
     * Exception decompiling
     */
    static int[] bake(class_1799 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [37[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static void clear() {
        var5 = -574430;
        var2_1 = jC.b & -574430 ^ -1671031171;
        var4_2 = 0;
        var3_5 = (var2_1 | var5) ^ 1810734150;
        var4_2 = (var2_1 | var5) ^ 195948910;
        ** GOTO lbl86
lbl-1000:
        // 6 sources

        {
            switch (var4_2) {
                case -989576613: {
                    if (var1_4 != null) {
                        ** break;
                    }
                    ** GOTO lbl25
                }
                case -1908554626: {
                    var1_4.close();
                    ** GOTO lbl25
                }
lbl15:
                // 1 sources

                var4_2 = (var2_1 | var5) ^ -1597586754;
                continue block23;
                case 626862758: {
                    var3_5 ^= var4_2 ^ -2129648935;
                    break;
                }
                case -1090654679: {
                    var3_5 ^= var4_2 ^ 1924099541;
                    ** GOTO lbl27
                }
                case -1432189359: {
                    if (true) ** GOTO lbl83
                }
lbl25:
                // 2 sources

                var4_2 = (var2_1 | var5) ^ 1091227734;
                continue block23;
lbl27:
                // 1 sources

                var4_2 = (var2_1 | var5) ^ 1431681070;
                continue block23;
                case 1597111489: {
                    var4_2 = (var2_1 | var5) ^ 1909127681;
                    continue block23;
                }
            }
            var4_2 = (var2_1 | var5) ^ 989035556;
            continue;
lbl34:
            // 2 sources

            ** while (true)
        }
lbl35:
        // 1 sources

        while (true) {
            var4_2 = (var2_1 | var5) ^ -626387751;
            ** GOTO lbl34
            break;
        }
        while (true) {
            block35: {
                var4_2 = (var2_1 | var5) ^ 53415256;
                break block35;
lbl41:
                // 1 sources

                while (true) {
                    var4_2 = (var2_1 | var5) ^ -166089665;
                    if (true) ** GOTO lbl49
                    break;
                }
                block28: while (true) {
                    var4_2 = (var2_1 | var5) ^ 497553531;
                    if (true) ** GOTO lbl49
                    block29: while (true) {
                        var4_2 = (var2_1 | var5) ^ -1406487047;
lbl49:
                        // 4 sources

                        block30: while (true) {
                            block36: {
                                switch (var4_2) {
                                    case -931722278: {
                                        var3_5 ^= var4_2 ^ -1706874995;
                                        var4_2 = (var2_1 | var5) ^ 501591369;
                                        continue block30;
                                    }
                                    case -696813847: {
                                        var3_5 ^= var4_2 ^ 697297686;
                                        continue block29;
                                    }
                                    case -497078780: {
                                        var3_5 ^= var4_2 ^ 1975007352;
                                        break;
                                    }
                                    case -900409100: {
                                        return;
                                    }
                                    case -502099146: {
                                        jC.a.clear();
                                        ** continue;
                                    }
                                    case 166629952: {
                                        var3_5 ^= var4_2 ^ -2094931351;
                                        var4_2 = (var2_1 | var5) ^ 899933835;
                                    }
                                    default: {
                                        continue block30;
                                    }
                                    case 1134484649: {
                                        var1_4 = (class_1011)var0_3.next();
                                        ** continue;
                                    }
                                    case 1407028102: {
                                        if (var0_3.hasNext()) {
                                            continue block28;
                                        }
                                        break block36;
                                    }
                                }
                                var4_2 = (var2_1 | var5) ^ -1133911338;
                                continue;
                            }
                            var4_2 = (var2_1 | var5) ^ 931149221;
                            continue;
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl83:
                // 2 sources

                while (true) {
                    var4_2 = (var2_1 | var5) ^ 696273046;
                    ** continue;
                    break;
                }
            }
            block32: while (true) {
                switch (var4_2) {
                    default: {
                        continue block32;
                    }
                    case -195375343: {
                        var4_2 = (var2_1 | var5) ^ -1899949478;
                        continue block32;
                    }
                    case -52939993: {
                        var0_3 = jC.a.values().iterator();
                        ** continue;
                    }
                    case 1899375653: 
                }
                break;
            }
            var3_5 ^= var4_2 ^ 955016094;
        }
    }

    /*
     * Exception decompiling
     */
    private static dU Li(class_1058 var0, boolean var1_1) {
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
    private static dU Lj(class_1921 var0) {
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
    private static class_2960 Lk(class_1921 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * Exception decompiling
     */
    private static class_1011 Ll(class_2960 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [48[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * Exception decompiling
     */
    private static int[] Lm(List<iN> var0, boolean var1_1) {
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
    private static float Ln(float var0, float var1_1, float var2_2) {
        var9_3 = -1882602721;
        var6_4 = jC.b & -1882602721 ^ 1706103586;
        var8_5 = 0;
        var7_6 = (var6_4 | var9_3) ^ -970678699;
        var8_5 = (var6_4 | var9_3) ^ 866316639;
        if (true) ** GOTO lbl57
        block19: while (true) {
            switch (var8_5) {
                case 171821418: {
                    var0 /= var3_7;
                    var8_5 = (var6_4 | var9_3) ^ 415212234;
                    continue block19;
                }
                case 710752746: {
                    var7_6 ^= var8_5 ^ 1178155160;
                    ** break;
                }
                case -248095112: {
                    var7_6 ^= var8_5 ^ -1432335149;
                    ** GOTO lbl49
                }
                case -760963304: {
                    var7_6 ^= var8_5 ^ -1836048081;
                    ** break;
                }
                case 809657473: {
                    var7_6 ^= var8_5 ^ 319561502;
                    ** GOTO lbl27
                }
lbl25:
                // 1 sources

                var8_5 = (var6_4 | var9_3) ^ -440133035;
                continue block19;
lbl27:
                // 1 sources

                var8_5 = (var6_4 | var9_3) ^ -1346175917;
                continue block19;
                case 614422385: {
                    var2_2 /= var3_7;
                    var8_5 = (var6_4 | var9_3) ^ -979047723;
                    continue block19;
                }
                case -146378251: {
                    var7_6 ^= var8_5 ^ -1404814826;
                    var8_5 = (var6_4 | var9_3) ^ 914528785;
                    continue block19;
                }
                case -1164849480: {
                    var7_6 ^= var8_5 ^ 1321146624;
                    var8_5 = (var6_4 | var9_3) ^ -882473906;
                }
lbl40:
                // 4 sources

                while (true) {
                    default: {
                        continue block19;
                    }
                    break;
                }
lbl43:
                // 1 sources

                var8_5 = (var6_4 | var9_3) ^ -443619685;
                continue block19;
                case 565189708: {
                    if (var3_7 < 1.0E-5f) ** GOTO lbl51
                    var8_5 = (var6_4 | var9_3) ^ 1029524519;
                    ** GOTO lbl40
                }
lbl49:
                // 1 sources

                var8_5 = (var6_4 | var9_3) ^ -834023565;
                continue block19;
lbl51:
                // 1 sources

                var8_5 = (var6_4 | var9_3) ^ -541345858;
                continue block19;
                case -646231762: {
                    var1_1 /= var3_7;
                    var8_5 = (var6_4 | var9_3) ^ 1432886663;
                    continue block19;
                }
lbl57:
                // 1 sources

                block21: while (true) {
                    switch (var8_5) {
                        default: {
                            continue block21;
                        }
                        case -598007200: {
                            var8_5 = (var6_4 | var9_3) ^ 30900845;
                            continue block21;
                        }
                        case -298954414: {
                            var7_6 ^= var8_5 ^ 201786355;
                            var8_5 = (var6_4 | var9_3) ^ -1333487061;
                            continue block21;
                        }
                        case 1602046228: 
                    }
                    break;
                }
                var3_7 = (float)Math.sqrt(var0 * var0 + var1_1 * var1_1 + var2_2 * var2_2);
                var8_5 = (var6_4 | var9_3) ^ 516918599;
                ** continue;
                case 175584676: {
                    var4_8 = Math.max(0.0f, var0 * jC.a[0] + var1_1 * jC.a[1] + var2_2 * jC.a[2]);
                    var7_6 ^= -1761871489;
                    var5_9 = Math.max(0.0f, var0 * jC.b[0] + var1_1 * jC.b[1] + var2_2 * jC.b[2]);
                    var7_6 ^= 1907920222;
                    return Math.min(1.0f, 0.4f + 0.6f * (var4_8 + var5_9));
                }
                case 1077620588: 
            }
            break;
        }
        return 1.0f;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean Lo(int[] var0, float[] var1_1, dU var2_2, float[] var3_3, float[] var4_4, float[] var5_5, int var6_6, float var7_7) {
        block167: {
            block163: {
                block168: {
                    block166: {
                        block164: {
                            block162: {
                                block165: {
                                    break block168;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        var43_52 = var42_51 >>> jC.Lp(((var46_54 ^= 1546187136) | var50_12) ^ -1025405811, (var45_15 | var50_12) ^ ((var46_54 | var50_12) ^ 1984951120)) & jC.Lp((var46_54 | var50_12) ^ -1025405810, (var45_15 | var50_12) ^ ((var46_54 | var50_12) ^ 946482017));
                                        var44_53 = var38_47 + var43_52 * (jC.Lp(((var46_54 ^= 414988894) | var50_12) ^ -623270253, (var45_15 | var50_12) ^ ((var46_54 | var50_12) ^ 329933859)) - var38_47) / jC.Lp((var46_54 | var50_12) ^ -623270252, (var45_15 | var50_12) ^ ((var46_54 | var50_12) ^ -1325331940));
                                        var47_16 = (var45_15 | var50_12) ^ -737864754;
                                        ** GOTO lbl384
                                        break;
                                    }
lbl6:
                                    // 1 sources

                                    while (true) {
                                        var38_47 = var37_46 * var23_32 / jC.Lp(((var46_54 ^= -610085918) | var50_12) ^ -1413380843, (var45_15 | var50_12) ^ ((var46_54 | var50_12) ^ 881445648));
                                        var47_16 = (var45_15 | var50_12) ^ 1352903221;
                                        if (true) ** GOTO lbl60
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var46_54 ^= -1594806445;
                                        var12_21 = (var5_5[0] + 0.5f) * 96.0f;
                                        var13_22 = (0.5f - var5_5[1]) * 96.0f;
                                        var46_54 ^= 1365682243;
                                        var14_23 = (var10_19 - var8_17) * (var13_22 - var9_18) - (var11_20 - var9_18) * (var12_21 - var8_17);
                                        var47_16 = (var45_15 | var50_12) ^ -207084930;
                                        ** GOTO lbl-1000
lbl18:
                                        // 1 sources

                                        while (true) {
                                            var46_54 ^= -563673651;
                                            var24_33 = false;
                                            var46_54 ^= 1015572268;
                                            var25_34 = var18_27;
                                            ** GOTO lbl125
                                            break;
                                        }
                                        break;
                                    }
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var40_49 = (int)((float)((var36_45 >> jC.Lp(((var46_54 ^= -1260934953) | var50_12) ^ -202658767, (var45_15 | var50_12) ^ ((var46_54 | var50_12) ^ 923498804)) & jC.Lp((var46_54 | var50_12) ^ -202658766, (var45_15 | var50_12) ^ ((var46_54 | var50_12) ^ 986792612))) * var21_30) / 255.0f * var7_7);
                                        var41_50 = (int)((float)((var36_45 & jC.Lp(((var46_54 ^= -1826357677) | var50_12) ^ -490142174, (var45_15 | var50_12) ^ ((var46_54 | var50_12) ^ 647771586))) * var22_31) / 255.0f * var7_7);
                                        var47_16 = (var45_15 | var50_12) ^ 1117022949;
                                        break block162;
                                        break;
                                    }
lbl29:
                                    // 1 sources

                                    while (true) {
                                        var29_38 = ((var10_19 - var28_37) * (var13_22 - var26_35) - (var11_20 - var26_35) * (var12_21 - var28_37)) * var15_24;
                                        var46_54 ^= 1792847388;
                                        var30_39 = ((var12_21 - var28_37) * (var9_18 - var26_35) - (var13_22 - var26_35) * (var8_17 - var28_37)) * var15_24;
                                        var46_54 ^= 957980503;
                                        var31_40 = 1.0f - var29_38 - var30_39;
                                        var47_16 = (var45_15 | var50_12) ^ 537084613;
                                        break block163;
                                        break;
                                    }
lbl37:
                                    // 1 sources

                                    while (true) {
                                        var47_16 = (var45_15 | var50_12) ^ -604596851;
                                        break block164;
                                        break;
                                    }
                                    block109: while (true) {
                                        switch (var47_16) {
                                            case -1881794075: {
                                                var46_54 ^= var47_16 ^ -351894066;
                                                ** break;
                                            }
                                            case -1105922230: {
                                                var46_54 ^= var47_16 ^ -1271022954;
                                                var47_16 = (var45_15 | var50_12) ^ 1934744428;
                                                ** break;
                                            }
lbl49:
                                            // 1 sources

                                            var47_16 = (var45_15 | var50_12) ^ 925620993;
                                            continue block109;
                                            case -1645836781: {
                                                if (var38_47 < jC.Lp((var46_54 | var47_16 ^ 526635601) ^ (var47_16 ^ 1041173145), (var45_15 | var47_16 ^ 526635601) ^ ((var46_54 | var47_16 ^ 526635601) ^ (var47_16 ^ -175140773)))) {
                                                    var47_16 = (var45_15 | var50_12) ^ 647953762;
                                                    ** break;
                                                }
                                                var47_16 = (var45_15 | var50_12) ^ 1633764506;
                                                ** break;
                                            }
                                            case -936796131: {
                                                var46_54 ^= var47_16 ^ 664134127;
                                                var47_16 = (var45_15 | var50_12) ^ -1620190862;
                                            }
lbl60:
                                            // 6 sources

                                            default: {
                                                continue block109;
                                            }
                                            case -644053378: {
                                                var39_48 = (int)((float)((var36_45 >> jC.Lp((var46_54 | var47_16 ^ var52_10) ^ (var47_16 ^ 505774812), (var45_15 | var47_16 ^ var52_10) ^ ((var46_54 | var47_16 ^ var52_10) ^ (var47_16 ^ 1713990241))) & jC.Lp((var46_54 | var47_16 ^ var52_10) ^ (var47_16 ^ 505774811), (var45_15 | var47_16 ^ var52_10) ^ ((var46_54 | var47_16 ^ var52_10) ^ (var47_16 ^ 2091154870)))) * var20_29) / 255.0f * var7_7);
                                                ** continue;
                                            }
                                            case 1910146061: 
                                        }
                                        break;
                                    }
                                    ** GOTO lbl515
lbl67:
                                    // 1 sources

                                    while (true) {
                                        var47_16 = (var45_15 | var50_12) ^ 2130279088;
                                        break block165;
                                        break;
                                    }
lbl70:
                                    // 2 sources

                                    while (true) {
                                        var47_16 = (var45_15 | var50_12) ^ -187198313;
                                        break block165;
lbl73:
                                        // 1 sources

                                        while (true) {
                                            var47_16 = (var45_15 | var50_12) ^ 1456587087;
                                            break block165;
                                            break;
                                        }
                                        break;
                                    }
lbl76:
                                    // 1 sources

                                    while (true) {
                                        var47_16 = (var45_15 | var50_12) ^ 1653560392;
                                        break block162;
                                        break;
                                    }
lbl79:
                                    // 1 sources

                                    while (true) {
                                        var47_16 = (var45_15 | var50_12) ^ 563649054;
                                        break block166;
                                        break;
                                    }
lbl82:
                                    // 1 sources

                                    while (true) {
                                        var47_16 = (var45_15 | var50_12) ^ -1416950468;
                                        break block167;
                                        break;
                                    }
lbl85:
                                    // 1 sources

                                    while (true) {
                                        var47_16 = (var45_15 | var50_12) ^ -1243463612;
                                        break block167;
                                        break;
                                    }
lbl88:
                                    // 1 sources

                                    while (true) {
                                        var47_16 = (var45_15 | var50_12) ^ -333496174;
                                        break block163;
                                        break;
                                    }
lbl91:
                                    // 1 sources

                                    while (true) {
                                        var27_36 = var16_25;
                                        ** GOTO lbl477
                                        break;
                                    }
lbl94:
                                    // 1 sources

                                    while (true) {
                                        var17_26 = Math.min(jC.Lp(((var46_54 ^= 2068356693) | var50_12) ^ -1700060148, (var45_15 | var50_12) ^ ((var46_54 | var50_12) ^ -2018145179)), (int)Math.ceil(Math.max(var8_17, Math.max(var10_19, var12_21))));
                                        var46_54 ^= 1547691394;
                                        var18_27 = Math.max(0, (int)Math.floor(Math.min(var9_18, Math.min(var11_20, var13_22))));
                                        var19_28 = Math.min(jC.Lp(((var46_54 ^= -240282158) | var50_12) ^ -1212611553, (var45_15 | var50_12) ^ ((var46_54 | var50_12) ^ 1694989889)), (int)Math.ceil(Math.max(var9_18, Math.max(var11_20, var13_22))));
                                        ** continue;
                                        break;
                                    }
lbl100:
                                    // 1 sources

                                    while (true) {
                                        var47_16 = (var45_15 | var50_12) ^ 1726837993;
                                        ** GOTO lbl384
                                        break;
                                    }
lbl103:
                                    // 1 sources

                                    block121: while (true) {
                                        switch (var47_16) {
                                            case -333539036: {
                                                var46_54 ^= var47_16 ^ 478348591;
                                                ** break;
                                            }
                                            case 198039633: {
                                                var46_54 ^= var47_16 ^ -2105888008;
                                                ** GOTO lbl116
                                            }
                                            case 1224999908: {
                                                var28_37 = (float)var27_36 + 0.5f;
                                                ** GOTO lbl118
                                            }
lbl114:
                                            // 1 sources

                                            var47_16 = (var45_15 | var50_12) ^ -2134699175;
                                            break;
lbl116:
                                            // 1 sources

                                            var47_16 = (var45_15 | var50_12) ^ -1481417061;
                                            break;
lbl118:
                                            // 1 sources

                                            var46_54 ^= 1286523785;
                                            ** continue;
                                            case -1765255606: {
                                                if (var27_36 > var17_26) ** GOTO lbl127
                                                ** GOTO lbl129
                                            }
                                            case 1853115942: {
                                                ++var25_34;
lbl125:
                                                // 2 sources

                                                var47_16 = (var45_15 | var50_12) ^ 1708983938;
                                                break block164;
                                            }
lbl127:
                                            // 1 sources

                                            var47_16 = (var45_15 | var50_12) ^ 44680283;
                                            continue block121;
lbl129:
                                            // 1 sources

                                            var47_16 = (var45_15 | var50_12) ^ -444955346;
                                            continue block121;
                                            case 1474080120: {
                                                var46_54 ^= var47_16 ^ 609729996;
                                                var47_16 = (var45_15 | var50_12) ^ 2021591861;
                                            }
                                        }
                                        continue;
                                        break;
                                    }
lbl135:
                                    // 1 sources

                                    while (true) {
                                        var37_46 = var36_45 >>> jC.Lp(((var46_54 ^= 1135509133) | var50_12) ^ -220002645, (var45_15 | var50_12) ^ ((var46_54 | var50_12) ^ -888092569)) & jC.Lp((var46_54 | var50_12) ^ -220002636, (var45_15 | var50_12) ^ ((var46_54 | var50_12) ^ 1687385174));
                                        ** continue;
                                        break;
                                    }
lbl138:
                                    // 1 sources

                                    while (true) {
                                        var47_16 = (var45_15 | var50_12) ^ -1005025930;
                                        break block166;
                                        break;
                                    }
lbl141:
                                    // 1 sources

                                    while (true) {
                                        var47_16 = (var45_15 | var50_12) ^ 1301703942;
                                        break block164;
                                        break;
                                    }
                                }
                                block125: while (true) {
                                    switch (var47_16) {
                                        default: {
                                            continue block125;
                                        }
                                        case -599630848: {
                                            var20_29 = var6_6 >> jC.Lp((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ 58940050), (var45_15 | var47_16 ^ var48_14) ^ ((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ -1476849800))) & jC.Lp((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ 58940061), (var45_15 | var47_16 ^ var48_14) ^ ((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ -1381462884)));
                                            var21_30 = var6_6 >> jC.Lp((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ 58940060), (var45_15 | var47_16 ^ var48_14) ^ ((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ 1388106270))) & jC.Lp((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ 58940063), (var45_15 | var47_16 ^ var48_14) ^ ((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ -1661698410)));
                                            var22_31 = var6_6 & jC.Lp((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ 58940062), (var45_15 | var47_16 ^ var48_14) ^ ((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ 1236048326)));
                                            var23_32 = var6_6 >>> jC.Lp((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ 58940057), (var45_15 | var47_16 ^ var48_14) ^ ((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ 636411639))) & jC.Lp((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ 58940056), (var45_15 | var47_16 ^ var48_14) ^ ((var46_54 | var47_16 ^ var48_14) ^ (var47_16 ^ -1656058168)));
                                            ** continue;
                                        }
                                        case -341365284: {
                                            var46_54 ^= var47_16 ^ 1079619940;
                                            ** break;
                                        }
                                        case -1873926193: {
                                            var46_54 ^= var47_16 ^ -783488583;
                                            ** GOTO lbl178
                                        }
lbl161:
                                        // 1 sources

                                        var47_16 = (var45_15 | var50_12) ^ 854917503;
                                        continue block125;
                                        case 442550760: {
                                            var46_54 ^= var47_16 ^ 883742646;
                                            var47_16 = (var45_15 | var50_12) ^ -529695805;
                                            continue block125;
                                        }
                                        case 787414151: {
                                            if (var16_25 > var17_26) ** GOTO lbl70
                                            ** continue;
                                        }
                                        case -1201234896: {
                                            var47_16 = (var45_15 | var50_12) ^ -786297096;
                                            continue block125;
                                        }
                                        case 1066750855: {
                                            if (var18_27 <= var19_28) ** break;
                                            ** continue;
                                            var47_16 = (var45_15 | var50_12) ^ 84963491;
                                            continue block125;
                                        }
lbl178:
                                        // 1 sources

                                        var47_16 = (var45_15 | var50_12) ^ -1067867656;
                                        continue block125;
                                        case 249177788: 
                                    }
                                    break;
                                }
                                return false;
lbl182:
                                // 2 sources

                                while (true) {
                                    var47_16 = (var45_15 | var50_12) ^ 1556820470;
                                    break block163;
                                    break;
                                }
lbl185:
                                // 2 sources

                                while (true) {
                                    var47_16 = (var45_15 | var50_12) ^ -278697658;
                                    ** GOTO lbl384
                                    break;
                                }
lbl188:
                                // 2 sources

                                while (true) {
                                    var47_16 = (var45_15 | var50_12) ^ 1260223207;
                                    break block163;
                                    break;
                                }
                            }
                            block129: while (true) {
                                block171: {
                                    block169: {
                                        block170: {
                                            block172: {
                                                switch (var47_16) {
                                                    case 245647349: {
                                                        var46_54 ^= var47_16 ^ 305654061;
                                                        ** GOTO lbl218
                                                    }
                                                    case -618528953: {
                                                        var46_54 ^= var47_16 ^ -572734483;
                                                        var47_16 = (var45_15 | var50_12) ^ -2027770682;
                                                        continue block129;
                                                    }
                                                    case -1119690110: {
                                                        var1_1[var32_41] = var33_42;
                                                        ** break;
                                                    }
                                                    case -168999632: {
                                                        var42_51 = var0[var32_41];
                                                        ** continue;
                                                    }
                                                    case 41190649: {
                                                        var46_54 ^= var47_16 ^ -461721548;
                                                        break block169;
                                                    }
                                                    case 189674963: {
                                                        if (var38_47 >= jC.Lp((var46_54 | var47_16 ^ -1983159919) ^ (var47_16 ^ -242403246), (var45_15 | var47_16 ^ -1983159919) ^ ((var46_54 | var47_16 ^ -1983159919) ^ (var47_16 ^ 1084575227)))) ** GOTO lbl252
                                                        break block170;
                                                    }
                                                    case -551265074: {
                                                        var0[var32_41] = var38_47 << jC.Lp((var46_54 | var47_16 ^ var54_8) ^ (var47_16 ^ 972422119), (var45_15 | var47_16 ^ var54_8) ^ ((var46_54 | var47_16 ^ var54_8) ^ (var47_16 ^ 1265222689))) | Math.min(jC.Lp((var46_54 | var47_16 ^ var54_8) ^ (var47_16 ^ 972422118), (var45_15 | var47_16 ^ var54_8) ^ ((var46_54 | var47_16 ^ var54_8) ^ (var47_16 ^ 742007633))), var39_48) << jC.Lp((var46_54 | var47_16 ^ var54_8) ^ (var47_16 ^ 972422117), (var45_15 | var47_16 ^ var54_8) ^ ((var46_54 | var47_16 ^ var54_8) ^ (var47_16 ^ 636207978))) | Math.min(jC.Lp((var46_54 | var47_16 ^ var54_8) ^ (var47_16 ^ 972422116), (var45_15 | var47_16 ^ var54_8) ^ ((var46_54 | var47_16 ^ var54_8) ^ (var47_16 ^ 780397709))), var40_49) << jC.Lp((var46_54 | var47_16 ^ var54_8) ^ (var47_16 ^ 972422115), (var45_15 | var47_16 ^ var54_8) ^ ((var46_54 | var47_16 ^ var54_8) ^ (var47_16 ^ 891645669))) | Math.min(jC.Lp((var46_54 | var47_16 ^ var54_8) ^ (var47_16 ^ 972422114), (var45_15 | var47_16 ^ var54_8) ^ ((var46_54 | var47_16 ^ var54_8) ^ (var47_16 ^ 1791849792))), var41_50);
                                                        ** continue;
                                                    }
lbl216:
                                                    // 1 sources

                                                    var47_16 = (var45_15 | var50_12) ^ 899064376;
                                                    break block171;
lbl218:
                                                    // 1 sources

                                                    var47_16 = (var45_15 | var50_12) ^ 831717809;
                                                    break block171;
                                                    case 1771434425: {
                                                        var24_33 = true;
                                                        ** GOTO lbl515
                                                    }
                                                    case -1942484681: {
                                                        var46_54 ^= var47_16 ^ -1564405836;
                                                        break;
                                                    }
                                                    case -1406978150: {
                                                        var46_54 ^= var47_16 ^ 875309110;
                                                        ** break;
lbl229:
                                                        // 1 sources

                                                        break block172;
                                                    }
                                                }
                                                var47_16 = (var45_15 | var50_12) ^ 1408614397;
                                                continue;
                                            }
                                            var47_16 = (var45_15 | var50_12) ^ -436639572;
                                            continue;
                                        }
                                        var47_16 = (var45_15 | var50_12) ^ -322709114;
                                        continue;
                                    }
                                    var47_16 = (var45_15 | var50_12) ^ 458889295;
                                    continue;
                                }
lbl242:
                                // 2 sources

                            }
lbl243:
                            // 1 sources

                            while (true) {
                                var47_16 = (var45_15 | var50_12) ^ 722399625;
                                break block163;
                                while (true) {
                                    var47_16 = (var45_15 | var50_12) ^ 1144731818;
                                    break block163;
                                    break;
                                }
                                break;
                            }
lbl249:
                            // 1 sources

                            while (true) {
                                var47_16 = (var45_15 | var50_12) ^ 1527652487;
                                ** GOTO lbl384
lbl252:
                                // 2 sources

                                while (true) {
                                    var47_16 = (var45_15 | var50_12) ^ -535618934;
                                    ** GOTO lbl242
                                    break;
                                }
                                break;
                            }
                        }
                        block135: while (true) {
                            switch (var47_16) {
                                case 893503730: {
                                    var47_16 = var25_34 > var19_28 ? (var45_15 | var50_12) ^ 758524243 : (var45_15 | var50_12) ^ 14717229;
                                }
                                default: {
                                    continue block135;
                                }
                                case -1014926292: {
                                    var46_54 ^= var47_16 ^ -495718790;
                                    ** break;
                                }
                                case -1955963907: {
                                    var46_54 ^= var47_16 ^ 1719149830;
                                    ** continue;
                                }
                                case -1558105991: {
                                    var26_35 = (float)var25_34 + 0.5f;
                                    var46_54 ^= -763710724;
                                    ** continue;
                                }
lbl272:
                                // 1 sources

                                var47_16 = (var45_15 | var50_12) ^ 828173904;
                                continue block135;
                                case -296235950: {
                                    var46_54 ^= var47_16 ^ 1378454762;
                                    ** continue;
                                }
                                case -538201297: 
                            }
                            break;
                        }
                        return var24_33;
lbl279:
                        // 1 sources

                        while (true) {
                            var47_16 = (var45_15 | var50_12) ^ 1378821118;
                            break block167;
                            break;
                        }
                    }
                    block137: while (true) {
                        switch (var47_16) lbl-1000:
                        // 2 sources

                        {
                            default: {
                                continue block137;
                            }
                            case -949151425: {
                                var15_24 = 1.0f / var14_23;
                                ** GOTO lbl307
                            }
                            case 488603393: {
                                var46_54 ^= var47_16 ^ 1704689799;
                                var47_16 = (var45_15 | var50_12) ^ -1298416433;
                                continue block137;
                            }
                            case 1546445232: {
                                if (Math.abs(var14_23) < 1.0E-6f) {
                                    ** continue;
                                }
                                ** GOTO lbl301
                            }
                            case -818952351: {
                                var46_54 ^= var47_16 ^ -568619207;
                                ** continue;
                            }
lbl301:
                            // 1 sources

                            var47_16 = (var45_15 | var50_12) ^ 2138073034;
                            continue block137;
                            case -1849214283: {
                                var46_54 ^= var47_16 ^ -410736390;
                                var47_16 = (var45_15 | var50_12) ^ 702170176;
                                continue block137;
                            }
lbl307:
                            // 1 sources

                            var46_54 ^= 1708207334;
                            var16_25 = Math.max(0, (int)Math.floor(Math.min(var8_17, Math.min(var10_19, var12_21))));
                            ** continue;
                            case 716167177: 
                        }
                        break;
                    }
                    return false;
lbl312:
                    // 1 sources

                    while (true) {
                        var10_19 = (var4_4[0] + 0.5f) * 96.0f;
                        var11_20 = (0.5f - var4_4[1]) * 96.0f;
                        ** continue;
                        break;
                    }
lbl316:
                    // 1 sources

                    while (true) {
                        var47_16 = (var45_15 | var50_12) ^ 1322477142;
                        ** GOTO lbl384
                        break;
                    }
lbl319:
                    // 1 sources

                    while (true) {
                        var47_16 = (var45_15 | var50_12) ^ -1396258424;
                        break block167;
                        break;
                    }
lbl322:
                    // 1 sources

                    while (true) {
                        var47_16 = (var45_15 | var50_12) ^ 1605537806;
                        ** GOTO lbl384
                        break;
                    }
lbl325:
                    // 1 sources

                    while (true) {
                        var35_44 = var29_38 * var3_3[4] + var30_39 * var4_4[4] + var31_40 * var5_5[4];
                        var46_54 ^= 1795800450;
                        var36_45 = var2_2.sample(var34_43, var35_44);
                        ** continue;
                        break;
                    }
                }
                var54_8 = 1570834572;
                var53_9 = -1689181578;
                var52_10 = 1528418876;
                var51_11 = 182418900;
                var50_12 = -2105191358;
                var49_13 = 926689722;
                var48_14 = 1590102082;
                var45_15 = jC.b & -2105191358 ^ 1823952253;
                var47_16 = 0;
                var46_54 = (var45_15 | var50_12) ^ 431890635;
                var47_16 = (var45_15 | var50_12) ^ -1316817463;
                block143: while (true) {
                    switch (var47_16) {
                        default: {
                            continue block143;
                        }
                        case 1597352118: {
                            var47_16 = (var45_15 | var50_12) ^ -1530377729;
                            continue block143;
                        }
                        case 1249842304: {
                            var46_54 ^= var47_16 ^ 316389795;
                            var47_16 = (var45_15 | var50_12) ^ 1368399216;
                            continue block143;
                        }
                        case -1087946737: 
                    }
                    break;
                }
                var8_17 = (var3_3[0] + 0.5f) * 96.0f;
                var9_18 = (0.5f - var3_3[1]) * 96.0f;
                var46_54 ^= 322404257;
                ** while (true)
lbl358:
                // 1 sources

                while (true) {
                    var47_16 = (var45_15 | var50_12) ^ 596956802;
                    break block163;
                    break;
                }
lbl361:
                // 1 sources

                while (true) {
                    var47_16 = (var45_15 | var50_12) ^ -868053608;
                    break block163;
                    break;
                }
lbl364:
                // 1 sources

                while (true) {
                    var47_16 = (var45_15 | var50_12) ^ -928889776;
                    break block163;
                    break;
                }
lbl367:
                // 1 sources

                while (true) {
                    var47_16 = (var45_15 | var50_12) ^ -144495797;
                    ** GOTO lbl384
                    break;
                }
lbl370:
                // 1 sources

                while (true) {
                    var47_16 = (var45_15 | var50_12) ^ 57337000;
                    if (true) ** GOTO lbl384
                    break;
                }
lbl373:
                // 1 sources

                while (true) {
                    var47_16 = (var45_15 | var50_12) ^ 747645493;
                    break block163;
                    break;
                }
lbl376:
                // 1 sources

                while (true) {
                    var46_54 ^= -1802793351;
                    ** continue;
                    break;
                }
lbl379:
                // 1 sources

                while (true) {
                    var47_16 = (var45_15 | var50_12) ^ -572683177;
                    break block163;
                    break;
                }
                block152: while (true) {
                    var47_16 = (var45_15 | var50_12) ^ 465534119;
lbl384:
                    // 9 sources

                    block153: while (true) {
                        switch (var47_16) {
                            default: {
                                continue block153;
                            }
                            case -1604043991: {
                                var46_54 ^= var47_16 ^ 397770313;
                                ** continue;
                            }
                            case 30684217: {
                                var46_54 ^= var47_16 ^ 1341651242;
                                ** continue;
                            }
                            case -1246134792: {
                                var40_49 = (var40_49 * var38_47 + (var42_51 >> jC.Lp((var46_54 | var47_16 ^ var49_13) ^ (var47_16 ^ 1583378924), (var45_15 | var47_16 ^ var49_13) ^ ((var46_54 | var47_16 ^ var49_13) ^ (var47_16 ^ 1946942624))) & jC.Lp((var46_54 | var47_16 ^ var49_13) ^ (var47_16 ^ 1583378927), (var45_15 | var47_16 ^ var49_13) ^ ((var46_54 | var47_16 ^ var49_13) ^ (var47_16 ^ -1511757023)))) * var43_52 * (jC.Lp((var46_54 | var47_16 ^ var49_13) ^ (var47_16 ^ 1583378926), (var45_15 | var47_16 ^ var49_13) ^ ((var46_54 | var47_16 ^ var49_13) ^ (var47_16 ^ -126965055))) - var38_47) / jC.Lp((var46_54 | var47_16 ^ var49_13) ^ (var47_16 ^ 1583378921), (var45_15 | var47_16 ^ var49_13) ^ ((var46_54 | var47_16 ^ var49_13) ^ (var47_16 ^ -1412024531)))) / var44_53;
                                var47_16 = (var45_15 | var50_12) ^ 931395827;
                                continue block153;
                            }
                            case -2007357034: {
                                var41_50 = (var41_50 * var38_47 + (var42_51 & jC.Lp((var46_54 | var47_16 ^ var51_11) ^ (var47_16 ^ 1052486971), (var45_15 | var47_16 ^ var51_11) ^ ((var46_54 | var47_16 ^ var51_11) ^ (var47_16 ^ 82452509)))) * var43_52 * (jC.Lp((var46_54 | var47_16 ^ var51_11) ^ (var47_16 ^ 1052486968), (var45_15 | var47_16 ^ var51_11) ^ ((var46_54 | var47_16 ^ var51_11) ^ (var47_16 ^ -1834595616))) - var38_47) / jC.Lp((var46_54 | var47_16 ^ var51_11) ^ (var47_16 ^ 1052486969), (var45_15 | var47_16 ^ var51_11) ^ ((var46_54 | var47_16 ^ var51_11) ^ (var47_16 ^ 159355490)))) / var44_53;
                                ** GOTO lbl185
                            }
                            case -304236073: {
                                var38_47 = var44_53;
                                ** continue;
                            }
                            case 433354292: {
                                var39_48 = (var39_48 * var38_47 + (var42_51 >> jC.Lp((var46_54 | var47_16 ^ var53_9) ^ (var47_16 ^ -1704594559), (var45_15 | var47_16 ^ var53_9) ^ ((var46_54 | var47_16 ^ var53_9) ^ (var47_16 ^ 1742696339))) & jC.Lp((var46_54 | var47_16 ^ var53_9) ^ (var47_16 ^ -1704594558), (var45_15 | var47_16 ^ var53_9) ^ ((var46_54 | var47_16 ^ var53_9) ^ (var47_16 ^ 1696717949)))) * var43_52 * (jC.Lp((var46_54 | var47_16 ^ var53_9) ^ (var47_16 ^ -1704594557), (var45_15 | var47_16 ^ var53_9) ^ ((var46_54 | var47_16 ^ var53_9) ^ (var47_16 ^ -1796175671))) - var38_47) / jC.Lp((var46_54 | var47_16 ^ var53_9) ^ (var47_16 ^ -1704594500), (var45_15 | var47_16 ^ var53_9) ^ ((var46_54 | var47_16 ^ var53_9) ^ (var47_16 ^ -1187441805)))) / var44_53;
                                ** continue;
                            }
                            case -1325019791: {
                                var46_54 ^= var47_16 ^ -613678932;
                                ** continue;
                            }
                            case 984764081: {
                                var46_54 ^= var47_16 ^ -703890255;
                                continue block152;
                            }
                            case -184016424: {
                                if (var44_53 > 0) ** break;
                                ** continue;
                                ** continue;
                            }
                            case -650861172: 
                        }
                        break;
                    }
                    break;
                }
                var46_54 ^= var47_16 ^ 76295473;
                ** while (true)
lbl420:
                // 1 sources

                while (true) {
                    var47_16 = (var45_15 | var50_12) ^ 1643676570;
                    break block167;
                    break;
                }
                while (true) {
                    var47_16 = (var45_15 | var50_12) ^ 1851487578;
                    break block167;
                    break;
                }
            }
lbl427:
            // 2 sources

            block156: while (true) {
                block173: {
                    switch (var47_16) {
                        case 640656289: {
                            var46_54 ^= var47_16 ^ 909348457;
                            ** GOTO lbl182
                        }
                        case 862638376: {
                            ++var27_36;
                            ** break;
                        }
                        case -516423034: {
                            var32_41 = var25_34 * jC.Lp((var46_54 | var47_16 ^ 1673352900) ^ (var47_16 ^ 128036276), (var45_15 | var47_16 ^ 1673352900) ^ ((var46_54 | var47_16 ^ 1673352900) ^ (var47_16 ^ -695212498))) + var27_36;
                            break block173;
                        }
                        case -853308419: {
                            ** GOTO lbl515
                        }
                        case 44572141: {
                            var47_16 = (var45_15 | var50_12) ^ 31079266;
                            continue block156;
                        }
                        case -1037600950: {
                            var46_54 ^= var47_16 ^ -766831449;
                            ** continue;
                        }
                        case -1433639467: {
                            var46_54 ^= var47_16 ^ -1876138962;
                            ** GOTO lbl479
                        }
                        case -977687306: {
                            var46_54 ^= var47_16 ^ -707408101;
                            ** continue;
                        }
                        case 586535143: {
                            if (!(var31_40 < 0.0f)) ** continue;
                            ** continue;
                        }
                        case 638916911: {
                            var46_54 ^= var47_16 ^ -1384818887;
                            ** GOTO lbl188
                        }
                        case 2028923562: {
                            var46_54 ^= var47_16 ^ -313499756;
                            ** continue;
                        }
                        case -278043107: {
                            if (!(var30_39 < 0.0f)) {
                                ** continue;
                            }
                            ** GOTO lbl515
                        }
                        case -1300468599: {
                            var47_16 = (var45_15 | var50_12) ^ 553736045;
                            continue block156;
                        }
                        case -810153454: {
                            if (!(var29_38 < 0.0f)) {
                                ** continue;
                            }
                            ** GOTO lbl515
                        }
                        case -827056198: {
                            ** continue;
                        }
                        case 795677327: {
                            var46_54 ^= var47_16 ^ 1602496366;
                            ** continue;
                        }
lbl477:
                        // 2 sources

                        var47_16 = (var45_15 | var50_12) ^ -1184108537;
                        ** continue;
lbl479:
                        // 1 sources

                        var47_16 = (var45_15 | var50_12) ^ 261054457;
                        default: {
                            continue block156;
                        }
                        case -1515575400: 
                    }
                    switch (var46_54) {
                        default: {
                            var47_16 = (var45_15 | var50_12) ^ -1772505131;
                            continue block156;
                        }
                        case -148549742: {
                            var47_16 = (var45_15 | var50_12) ^ -929497378;
                            continue block156;
                        }
                        case 253929934: 
                    }
                    ** continue;
                }
                var46_54 ^= -354709244;
                var33_42 = var29_38 * var3_3[2] + var30_39 * var4_4[2] + var31_40 * var5_5[2];
                ** continue;
                break;
            }
        }
        block157: while (true) {
            switch (var47_16) {
                default: {
                    continue block157;
                }
                case 1532304699: {
                    if (!(var33_42 < var1_1[var32_41])) ** continue;
                    ** continue;
                }
                case -1130856831: {
                    var46_54 ^= var47_16 ^ -1769638209;
                    ** continue;
                }
                case -2132006875: {
                    var46_54 ^= var47_16 ^ 686469793;
                    ** continue;
                }
                case 1114739959: {
                    ** break;
                }
                case -1890591003: {
                    var46_54 ^= var47_16 ^ 1699030473;
                    ** continue;
                }
lbl515:
                // 6 sources

                var47_16 = (var45_15 | var50_12) ^ -1042657296;
                ** continue;
                case 1161580611: 
            }
            break;
        }
        var34_43 = var29_38 * var3_3[3] + var30_39 * var4_4[3] + var31_40 * var5_5[3];
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block37: {
                block38: {
                    block34: {
                        block36: {
                            block40: {
                                block39: {
                                    block35: {
                                        block32: {
                                            block31: {
                                                block30: {
                                                    var2 = -1820994083;
                                                    jC.b = mK.a(MethodHandles.lookup().lookupClass(), 1613247191);
                                                    var1_1 = 0;
                                                    ** GOTO lbl68
lbl5:
                                                    // 1 sources

                                                    while (true) {
                                                        var0_2 ^= -2100012330;
                                                        ** GOTO lbl73
                                                        break;
                                                    }
lbl8:
                                                    // 1 sources

                                                    while (true) {
                                                        var1_1 = var2 ^ 2044405960;
                                                        break block30;
lbl11:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                        break;
                                                    }
lbl13:
                                                    // 1 sources

                                                    while (true) {
                                                        v0 = ((var0_2 ^= -1093783749) | var2) ^ -30903733 ^ jC.b;
                                                        ** continue;
                                                        break;
                                                    }
lbl16:
                                                    // 1 sources

                                                    while (true) {
                                                        jC.a = new int[((var0_2 ^= -1731897709) | var2) ^ -1082794030];
                                                        ** GOTO lbl33
                                                        break;
                                                    }
                                                }
lbl20:
                                                // 5 sources

                                                block16: while (true) {
                                                    switch (var1_1) lbl-1000:
                                                    // 5 sources

                                                    {
                                                        while (true) {
                                                            default: {
                                                                continue block16;
                                                            }
                                                            break;
                                                        }
                                                        case -1832722971: {
                                                            ** continue;
                                                        }
lbl27:
                                                        // 1 sources

                                                        while (true) {
                                                            break block31;
                                                            break;
                                                        }
                                                        case 1028753403: {
                                                            var0_2 ^= var1_1 ^ 439768251;
                                                            break block32;
                                                        }
lbl33:
                                                        // 1 sources

                                                        var0_2 ^= 504144296;
                                                        break block33;
lbl35:
                                                        // 1 sources

                                                        while (true) {
                                                            var1_1 = var2 ^ 28772408;
                                                            ** GOTO lbl-1000
                                                            break;
                                                        }
                                                        case 722288083: {
                                                            var0_2 ^= var1_1 ^ 1046166480;
                                                            ** continue;
                                                        }
lbl41:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl43:
                                                        // 1 sources

                                                        while (true) {
                                                            var0_2 ^= 1035945172;
                                                            break block34;
                                                            break;
                                                        }
lbl46:
                                                        // 2 sources

                                                        while (true) {
                                                            var0_2 ^= -672892054;
                                                            break block35;
                                                            break;
                                                        }
                                                        jC.a = jC.Lp(((var0_2 ^= 338197649) | var2) ^ -234290012, var2 ^ ((var0_2 | var2) ^ 1163611150));
                                                        var1_1 = var2 ^ -1373351386;
                                                        ** GOTO lbl-1000
lbl52:
                                                        // 1 sources

                                                        while (true) {
                                                            var1_1 = var2 ^ -620581088;
                                                            ** GOTO lbl-1000
                                                            break;
                                                        }
lbl55:
                                                        // 1 sources

                                                        while (true) {
                                                            var1_1 = var2 ^ 1950653461;
                                                            ** continue;
                                                            break;
                                                        }
                                                        case 1143799962: {
                                                            jC.b = jC.Lq(-0.2f, 1.0f, 0.7f);
                                                            break block36;
                                                        }
lbl61:
                                                        // 1 sources

                                                        while (true) {
                                                            var0_2 ^= -23891594;
                                                            ** continue;
                                                            break;
                                                        }
lbl65:
                                                        // 1 sources

                                                        while (true) {
                                                            ** continue;
                                                            break;
                                                        }
lbl68:
                                                        // 1 sources

                                                        var0_2 = -143359573;
                                                        ** continue;
                                                        case -757484317: {
                                                            var0_2 ^= var1_1 ^ -2000230971;
                                                            break block37;
                                                        }
lbl73:
                                                        // 1 sources

                                                        jC.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ v0;
                                                        v1 = v1 + 1;
                                                        v4 = v3 + 4;
                                                        v2 = v2;
                                                        v3 = v4;
                                                        var0_2 ^= 1630226437;
                                                        break block38;
                                                        case 1450811110: {
                                                            jC.a = jC.Lq(0.2f, 1.0f, -0.7f);
                                                            break block39;
                                                        }
lbl84:
                                                        // 1 sources

                                                        while (true) {
                                                            var0_2 ^= -1811837762;
                                                            ** continue;
                                                            break;
                                                        }
                                                        case -357630699: {
                                                            jC.a = (int[])new HashMap<K, V>();
                                                            return;
                                                        }
                                                        case -416200248: {
                                                            ** continue;
                                                        }
                                                        case 1215789821: {
                                                            var0_2 ^= var1_1 ^ -1683541343;
                                                            break block16;
                                                        }
                                                    }
                                                    break;
                                                }
                                                ** while (true)
lbl96:
                                                // 1 sources

                                                while (true) {
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            var0_2 ^= 851609786;
                                            break block40;
                                        }
                                        var1_1 = var2 ^ -989050053;
                                        ** GOTO lbl20
lbl104:
                                        // 1 sources

                                        while (true) {
                                            ** continue;
                                            break;
                                        }
                                        v1 = 0;
                                        v3 = 0;
                                        ** while (true)
                                    }
                                    var0_2 ^= -281381084;
                                    ** while (true)
                                }
                                var1_1 = var2 ^ 1101816126;
                                ** GOTO lbl20
                            }
                            ** while (true)
                        }
                        var1_1 = var2 ^ -1200035826;
                        ** GOTO lbl20
                    }
                    ** while (true)
                }
                if (v4 < v2.length) ** GOTO lbl46
                ** while (true)
            }
            var1_1 = var2 ^ -682044089;
            ** while (true)
        }
        v2 = "\u00078\u00bb\u00a3Fj\u0003hl\u00bb\u00e5,q!\u0017\u0010\u0093d\u00c0{\u008b\u00c1\u0082`DaPW2\u00a5\u007fr8\u00f4\u00fa\u00e8\u00c7\u00e0\u00a2\u00e2\t\u00a8\b\u00e0\u00dc\u00f0\u00ef\u00b1\u00b0\u00b2\u00a9>\b\u0016\u00f8\u00b9G\u00f1a\u0092\u00af,\u00e3\u009c\u0000\u00af^\u000b\t\u0097b\u00ec]_\u00b0\u00a4\u00ee\u00d3\u00c2%\u00f4^\u00d3\u0084R?\u00ffe_\u00e5\u00c2\u007fR\u008a\u001f\t'\u00f7Y_\"qR\u008dlT\u008b\u0006_\u00ac\u00eeY\u00fd\u0007\u0080ake\u00b6\u008ai\u009b\u0003\u0016\u0098JW\u00a3\u00b5\u0083\u00cc&\u00bc\u00b4\u00a7,m[6'0\u00d1\u00f7\u00c6cij-\u00ac\u008e\u00a1\u00cf:\u00c2\u00cb1\u00a1\u001b\u0013\u00b2\u00e4C\u0012\u0096\u0083\u0010\u00f4^\u008a\u00c1\u0012\u0017\u0081\u00a9;\u0080\u009a\u000f\u00bff\u00c5\u00e7\u00a2K\\O\u00ea\u0000".getBytes("ISO-8859-1");
        ** while (true)
    }

    private static int Lp(int n2, int n3) {
        int n4 = 508176490;
        int n5 = -1797322928;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xDBA3FC2D)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0x9EDFE3BA;
        n6 ^= (n5 | n4) ^ 0x9EDFFAD3;
        n6 -= (n5 | n4) ^ 0x9EDF50C2;
        n6 ^= (n5 | n4) ^ 0x9EDFECB3;
        n6 += (n5 | n4) ^ 0x9EDF97FD;
        n6 ^= (n5 | n4) ^ 0x9EDFC47D;
        n6 -= (n5 | n4) ^ 0x9EDF7A1F;
        n6 -= (n5 | n4) ^ 0x9EDFBCE8;
        n6 ^= (n5 | n4) ^ 0x9EDF97D0;
        return n6 -= (n5 | n4) ^ 0x9EDF4617;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float[] Lq(float f2, float f3, float f4) {
        int n2 = b & 0xE5BD865A ^ 0xCE4387EE;
        int n3 = 0;
        int n4 = (n2 | 0xE5BD865A) ^ 0xA04818D0;
        n3 = (n2 | 0xE5BD865A) ^ 0xC2C9B9B6;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1831866211: {
                    float f5 = (float)Math.sqrt(f2 * f2 + f3 * f3 + f4 * f4);
                    n4 ^= 0x552406B2;
                    return new float[]{f2 / f5, f3 / f5, f4 / f5};
                }
                case -379174752: {
                    n4 ^= n3 ^ 0x23BD1269;
                    n3 = (n2 | 0xE5BD865A) ^ 0x7D307763;
                    continue block5;
                }
                case 758529608: 
            }
            n3 = (n2 | 0xE5BD865A) ^ 0x699C75E;
        }
    }
}

