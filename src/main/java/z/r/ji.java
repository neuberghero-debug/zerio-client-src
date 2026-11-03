/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.lang.invoke.LambdaMetafactory;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.cM;
import z.r.hM;
import z.r.ha;
import z.r.jP;
import z.r.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class ji {
    private static final Object[] a;
    private static final String[] a;
    public static final int b;
    private static final int[] a;
    private static final int a;

    /*
     * Enabled aggressive block sorting
     */
    private ji() {
        int n2 = b & 0x38EB1C6F ^ 0x34CD9D9C;
        int n3 = (n2 | 0x38EB1C6F) ^ 0xF4553CFB;
        n3 ^= 0x288196AA;
        n3 ^= 0x869F1F27;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static boolean prompt(Path var0) throws Exception {
        var5_1 = -2095204989;
        var2_2 = ji.b & -2095204989 ^ -11013062;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ 483305415;
        var4_3 = (var2_2 | var5_1) ^ 117226161;
        if (true) ** GOTO lbl-1000
        block11: while (true) {
            block14: {
                switch (var4_3) lbl-1000:
                // 2 sources

                {
                    default: {
                        continue block11;
                    }
                    case -106737910: {
                        var4_3 = (var2_2 | var5_1) ^ -1307049028;
                        continue block11;
                    }
                    case -1815381305: {
                        var1_4 = new CompletableFuture<T>();
                        break;
                    }
                    case 1296561671: {
                        var3_5 ^= var4_3 ^ 48265608;
                        break block14;
                    }
                }
                break;
            }
            var4_3 = (var2_2 | var5_1) ^ 1821675388;
        }
        var4_3 = (var2_2 | var5_1) ^ 312040137;
        block12: while (true) {
            switch (var4_3) {
                case -635885640: {
                    SwingUtilities.invokeLater((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$prompt$0(java.nio.file.Path java.util.concurrent.CompletableFuture ), ()V)((Path)var0, var1_4));
                    ** break;
                }
                case -305746062: {
                    var3_5 ^= var4_3 ^ -1263029002;
                    ** GOTO lbl35
                }
lbl33:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 403326068;
                ** GOTO lbl36
lbl35:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 625398275;
lbl36:
                // 4 sources

                default: {
                    continue block12;
                }
                case -413814321: {
                    var3_5 ^= var4_3 ^ 2085898331;
                    var4_3 = (var2_2 | var5_1) ^ 277449241;
                    ** GOTO lbl36
                }
                case -271155294: 
            }
            break;
        }
        return (Boolean)var1_4.get();
    }

    private static int a(int n2, int n3) {
        int n4 = 1751802852;
        int n5 = -1984483777;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xCBDABB49)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xE9FFDFB6;
        n6 -= (n5 | n4) ^ 0xE9FF4C91;
        n6 += (n5 | n4) ^ 0xE9FF56C5;
        n6 -= (n5 | n4) ^ 0xE9FF9253;
        n6 -= (n5 | n4) ^ 0xE9FF2A1A;
        n6 += (n5 | n4) ^ 0xE9FF5C7E;
        return n6 -= (n5 | n4) ^ 0xE9FF31B8;
    }

    /*
     * Exception decompiling
     */
    private static void show(Path var0, CompletableFuture<Boolean> var1_1) {
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
    private static void setStatus(JTextArea var0, String var1_1, Color var2_2) {
        block18: {
            block19: {
                var6_3 = -290653258;
                var3_4 = ji.b & -290653258 ^ 1179137715;
                var5_5 = 0;
                if (true) ** GOTO lbl40
lbl5:
                // 1 sources

                return;
                block10: while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 72715036;
                    ** GOTO lbl22
lbl10:
                    // 1 sources

                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ 1157478129;
                        ** GOTO lbl22
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ -1822192446;
                        if (true) ** GOTO lbl22
                        break;
                    }
                    block13: while (true) {
                        block20: {
                            var5_5 = (var3_4 | var6_3) ^ 910266877;
                            break block20;
lbl19:
                            // 1 sources

                            while (true) {
                                var0.setText(var1_1);
                                ** continue;
                                break;
                            }
                        }
lbl23:
                        // 3 sources

                        block15: while (true) {
                            switch (var5_5) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block15;
                                    }
                                    break;
                                }
                                case -356944725: {
                                    ** continue;
                                }
                                case -514381518: {
                                    ** continue;
                                }
                                case 1450664999: {
                                    ** continue;
                                }
lbl34:
                                // 1 sources

                                while (true) {
                                    var5_5 = (var3_4 | var6_3) ^ -537136127;
                                    ** continue;
                                    break;
                                }
                                case 823593910: {
                                    var4_6 ^= var5_5 ^ -2092572127;
                                    break block18;
                                }
lbl40:
                                // 1 sources

                                var4_6 = (var3_4 | var6_3) ^ -61691691;
                                break block19;
                                case -1441707706: {
                                    var4_6 ^= var5_5 ^ -1455081007;
                                    continue block13;
                                }
                                case 2106553205: {
                                    var4_6 ^= var5_5 ^ 810067847;
                                    continue block10;
                                }
                                case -659722678: {
                                    var0.setForeground(var2_2);
                                    break block10;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                ** while (true)
            }
            var5_5 = (var3_4 | var6_3) ^ 263968389;
            ** GOTO lbl23
        }
        var5_5 = (var3_4 | var6_3) ^ -1197761648;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static JTextArea statusArea(String var0) {
        var6_1 = -292280096;
        var5_2 = 616847595;
        var2_3 = ji.b & -292280096 ^ -2050857958;
        var4_4 = 0;
        var3_6 = (var2_3 | var6_1) ^ -178509943;
        var4_4 = (var2_3 | var6_1) ^ 1656542542;
        if (true) ** GOTO lbl110
lbl8:
        // 1 sources

        while (true) {
            var4_4 = (var2_3 | var6_1) ^ 629546225;
            if (true) ** GOTO lbl16
            break;
        }
        block28: while (true) {
            var4_4 = (var2_3 | var6_1) ^ -523820401;
            if (true) ** GOTO lbl16
            block29: while (true) {
                var4_4 = (var2_3 | var6_1) ^ -1915835730;
lbl16:
                // 4 sources

                block30: while (true) {
                    switch (var4_4) {
                        case 1645790804: {
                            var1_5.setFont(p.font(0, ji.a((var3_6 | var4_4 ^ -1936920908) ^ (var4_4 ^ -1098663677), (var2_3 | var4_4 ^ -1936920908) ^ ((var3_6 | var4_4 ^ -1936920908) ^ (var4_4 ^ 2055129474)))));
                            ** GOTO lbl95
                        }
                        case 625241847: {
                            var3_6 ^= var4_4 ^ -1337570477;
                            var4_4 = (var2_3 | var6_1) ^ -213912939;
                            continue block30;
                        }
                        case 949275089: {
                            var3_6 ^= var4_4 ^ 28263169;
                            ** GOTO lbl72
                        }
                        case 1227701998: {
                            var1_5.setEditable(false);
                            ** break;
                        }
                        case 281904738: {
                            var3_6 ^= var4_4 ^ 1095051368;
                            ** GOTO lbl84
                        }
                        case 814744408: {
                            var1_5.setOpaque(false);
                            ** GOTO lbl93
                        }
                        case 1677987507: {
                            var1_5.setWrapStyleWord(true);
                            ** GOTO lbl86
                        }
                        case -2037819683: {
                            var3_6 ^= var4_4 ^ -556843377;
                            ** break;
                        }
lbl43:
                        // 1 sources

                        var4_4 = (var2_3 | var6_1) ^ -896400883;
                        ** GOTO lbl91
                        case -749901845: {
                            var3_6 ^= var4_4 ^ 178678750;
                            ** GOTO lbl70
                        }
                        case -1852241984: {
                            var3_6 ^= var4_4 ^ 2085393097;
                            continue block29;
                        }
                        case 252792437: {
                            var3_6 ^= var4_4 ^ -428192633;
                            ** continue;
                        }
lbl54:
                        // 1 sources

                        var4_4 = (var2_3 | var6_1) ^ -1493478892;
                        continue block30;
                        case 1739366465: {
                            var3_6 ^= var4_4 ^ -2146261226;
                            var4_4 = (var2_3 | var6_1) ^ 18349815;
                            ** GOTO lbl91
                        }
                        case 985184784: {
                            var1_5.setLineWrap(true);
                            ** GOTO lbl78
                        }
                        case -289304051: {
                            var1_5.setBorder(null);
                            continue block28;
                        }
                        case -900698101: {
                            p.fixed(var1_5, ji.a((var3_6 | var4_4 ^ var5_2) ^ (var4_4 ^ 378145368), (var2_3 | var4_4 ^ var5_2) ^ ((var3_6 | var4_4 ^ var5_2) ^ (var4_4 ^ -301220835))), ji.a((var3_6 | var4_4 ^ var5_2) ^ (var4_4 ^ 378145371), (var2_3 | var4_4 ^ var5_2) ^ ((var3_6 | var4_4 ^ var5_2) ^ (var4_4 ^ 107938596))));
                            var4_4 = (var2_3 | var6_1) ^ 1916239314;
                            ** GOTO lbl91
                        }
lbl70:
                        // 1 sources

                        var4_4 = (var2_3 | var6_1) ^ 318149639;
                        continue block30;
lbl72:
                        // 1 sources

                        var4_4 = (var2_3 | var6_1) ^ -1949146551;
                        continue block30;
                        case 485072495: {
                            var1_5.setFocusable(false);
                            var4_4 = (var2_3 | var6_1) ^ 1375535212;
                            continue block30;
                        }
lbl78:
                        // 1 sources

                        var4_4 = (var2_3 | var6_1) ^ -683498197;
                        continue block30;
                        case -1104450410: {
                            var3_6 ^= var4_4 ^ 836229735;
                            var4_4 = (var2_3 | var6_1) ^ -714156310;
                            continue block30;
                        }
lbl84:
                        // 1 sources

                        var4_4 = (var2_3 | var6_1) ^ -549032030;
                        continue block30;
lbl86:
                        // 1 sources

                        var4_4 = (var2_3 | var6_1) ^ -14947688;
                        continue block30;
                        case -48170755: {
                            var1_5.setForeground(p.c);
                            var4_4 = (var2_3 | var6_1) ^ 2119134010;
                        }
lbl91:
                        // 5 sources

                        default: {
                            continue block30;
                        }
lbl93:
                        // 1 sources

                        var4_4 = (var2_3 | var6_1) ^ 1016793873;
                        continue block30;
lbl95:
                        // 1 sources

                        var4_4 = (var2_3 | var6_1) ^ -2005218117;
                        continue block30;
                        case 821978374: {
                            return var1_5;
                        }
                        case -1646194392: 
                    }
                    var3_6 ^= var4_4 ^ -821755249;
                    var4_4 = (var2_3 | var6_1) ^ -551024132;
                    continue;
                    break;
                }
                break;
            }
            break;
        }
        block31: while (true) {
            switch (var4_4) {
                case -1922385484: {
                    break;
                }
                case 1764299004: {
                    var3_6 ^= var4_4 ^ 926455491;
                    var4_4 = (var2_3 | var6_1) ^ 1747176420;
                }
lbl110:
                // 3 sources

                default: {
                    continue block31;
                }
                case -2013944034: {
                    var1_5 = new JTextArea(var0);
                    ** break;
lbl115:
                    // 1 sources

                    var4_4 = (var2_3 | var6_1) ^ 1767848487;
                    ** continue;
                }
            }
            var4_4 = (var2_3 | var6_1) ^ -2030076922;
        }
    }

    /*
     * Exception decompiling
     */
    private static String a(int var0, int var1_1) {
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
    private static /* synthetic */ void lambda$show$13(boolean[] var0, boolean[] var1_1, JFrame var2_2, CompletableFuture var3_3, boolean[] var4_4, List var5_5, JTextArea var6_6, JButton var7_7, Path var8_8, Runnable var9_9, ActionEvent var10_10) {
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
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$show$12(boolean[] blArray, List list, boolean[] blArray2, boolean[] blArray3, JTextArea jTextArea, JButton jButton, List list2, Runnable runnable, int[] nArray, Throwable throwable) {
        int n2 = b & 0x16F23C5E ^ 0xEF709530;
        int n3 = 0;
        int n4 = (n2 | 0x16F23C5E) ^ 0xED212B9C;
        n3 = (n2 | 0x16F23C5E) ^ 0xB7630700;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1217510014: {
                    n3 = (n2 | 0x16F23C5E) ^ 0xB7A09F5D;
                    continue block5;
                }
                case 1300929813: {
                    SwingUtilities.invokeLater(() -> {
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
                         *     at org.benf.cfr.reader.entities.Method.getAnalysis(Method.java:520)
                         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:351)
                         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:167)
                         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:105)
                         *     at org.benf.cfr.reader.bytecode.analysis.parse.rewriters.ExpressionRewriterHelper.applyForwards(ExpressionRewriterHelper.java:12)
                         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.StaticFunctionInvokation.applyExpressionRewriterToArgs(StaticFunctionInvokation.java:103)
                         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.StaticFunctionInvokation.applyExpressionRewriter(StaticFunctionInvokation.java:90)
                         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:103)
                         *     at org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredExpressionStatement.rewriteExpressions(StructuredExpressionStatement.java:70)
                         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewrite(LambdaRewriter.java:88)
                         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.rewriteLambdas(Op04StructuredStatement.java:1137)
                         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:912)
                         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:208)
                         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
                         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
                         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
                         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
                         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
                         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
                         *     at org.benf.cfr.reader.Main.main(Main.java:54)
                         */
                        throw new IllegalStateException("Decompilation failed");
                    });
                    return;
                }
                case 1213342243: 
            }
            n4 ^= n3 ^ 0xE936CF0C;
            n3 = (n2 | 0x16F23C5E) ^ 0xB278206B;
        }
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ int[] lambda$show$10(List var0, Path var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [33[UNCONDITIONALDOLOOP]], but top level block is 34[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$show$9(ha ha2) {
        int n2 = b & 0x795474AD ^ 0x5ADF7606;
        int n3 = 0;
        int n4 = (n2 | 0x795474AD) ^ 0xAB953EEB;
        n3 = (n2 | 0x795474AD) ^ 0xA6CABB60;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1898425486: {
                    n4 ^= n3 ^ 0x7976BE16;
                    n3 = (n2 | 0x795474AD) ^ 0xE04F87C6;
                    continue block5;
                }
                case -1684999831: {
                    ha2.failed(ji.a((n4 | n3 ^ 0xE2C485C4) ^ (n3 ^ 0xB50D905D), (n2 | n3 ^ 0xE2C485C4) ^ ((n4 | n3 ^ 0xE2C485C4) ^ (n3 ^ 0x6FE9726B))));
                    return;
                }
                case -585773617: 
            }
            n3 = (n2 | 0x795474AD) ^ 0xF50725DD;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$show$8(ha ha2) {
        int n2 = b & 0x9343C31 ^ 0xB2D995E1;
        int n3 = 0;
        int n4 = (n2 | 0x9343C31) ^ 0xD8ED0C56;
        n3 = (n2 | 0x9343C31) ^ 0xC20DD19F;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 2045799534: {
                    n3 = (n2 | 0x9343C31) ^ 0x54F754DA;
                    continue block5;
                }
                case -284497621: {
                    n4 ^= n3 ^ 0x9ABF8208;
                    n3 = (n2 | 0x9343C31) ^ 0xB127232E;
                    continue block5;
                }
                case 182099679: 
            }
            break;
        }
        ha2.busy(ji.a((n4 | n3 ^ 0x3EEA2EE) ^ (n3 ^ 0x4406F4F2), (n2 | n3 ^ 0x3EEA2EE) ^ ((n4 | n3 ^ 0x3EEA2EE) ^ (n3 ^ 0x5426DD9B))));
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void lambda$show$7(ha var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void lambda$show$6(List var0) {
        block31: {
            block30: {
                block32: {
                    var9_1 = 766738542;
                    var4_2 = ji.b & 766738542 ^ -844125602;
                    var8_3 = 0;
                    var7_4 = (var4_2 | var9_1) ^ 1594456348;
                    var8_3 = (var4_2 | var9_1) ^ 1328013871;
                    break block32;
lbl7:
                    // 2 sources

                    block23: while (true) {
                        var8_3 = (var4_2 | var9_1) ^ -706796116;
                        break block30;
                        while (true) {
                            try {
                                var8_3 = (var4_2 | var9_1) ^ -2014411286;
                                break block31;
                            }
                            catch (Exception v0) {
                                var7_4 = (var4_2 | var9_1) ^ -878802516;
                                var3_7 = v0;
                                var6_9 = var3_7.getMessage();
                                var5_8 = var2_6.a.displayName();
                                cM.error(ji.a(((var7_4 ^= -1749402618) | var9_1) ^ -321778823, (var4_2 | var9_1) ^ ((var7_4 | var9_1) ^ 1373451648)) + var5_8 + ji.a((var7_4 | var9_1) ^ -321778824, (var4_2 | var9_1) ^ ((var7_4 | var9_1) ^ -1290783360)) + var6_9, (Throwable)var3_7);
                                var7_4 ^= 169549095;
                                SwingUtilities.invokeLater((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$show$5(z.r.ha ), ()V)((ha)var2_6));
                            }
lbl22:
                            // 2 sources

                            while (true) {
                                var7_4 ^= 1811425578;
                                continue block23;
                                break;
                            }
                            break;
                        }
                        while (true) {
                            var8_3 = (var4_2 | var9_1) ^ -667125970;
                            break block30;
                            break;
                        }
                        break;
                    }
                }
                block27: while (true) {
                    switch (var8_3) {
                        default: {
                            continue block27;
                        }
                        case -1567078319: {
                            var8_3 = (var4_2 | var9_1) ^ 565865900;
                            continue block27;
                        }
                        case -872036398: {
                            var7_4 ^= var8_3 ^ -1362411671;
                            var8_3 = (var4_2 | var9_1) ^ -1503731138;
                            continue block27;
                        }
                        case 1273055296: 
                    }
                    break;
                }
                var1_5 = var0.iterator();
                ** GOTO lbl7
            }
            block28: while (true) {
                switch (var8_3) {
                    default: {
                        continue block28;
                    }
                    case 945852370: {
                        var7_4 ^= var8_3 ^ -1578731920;
                        var8_3 = (var4_2 | var9_1) ^ -553932245;
                        continue block28;
                    }
                    case 860094549: {
                        if (!var1_5.hasNext()) ** continue;
                        var8_3 = (var4_2 | var9_1) ^ 1475424654;
                        continue block28;
                    }
                    case -1169253392: {
                        var7_4 ^= var8_3 ^ 366661414;
                        var8_3 = (var4_2 | var9_1) ^ 26033446;
                        continue block28;
                    }
                    case -332228776: {
                        var2_6 = (ha)var1_5.next();
                        var8_3 = (var4_2 | var9_1) ^ -1593897663;
                        break block28;
                    }
                    case 897834320: {
                        var7_4 ^= var8_3 ^ 736169550;
                        var8_3 = (var4_2 | var9_1) ^ -561836386;
                        continue block28;
                    }
                    case 859612384: {
                        return;
                    }
                }
                break;
            }
        }
        block29: while (true) {
            switch (var8_3) {
                default: {
                    continue block29;
                }
                case 1296082751: {
                    var7_4 ^= var8_3 ^ 1667236041;
                    var8_3 = (var4_2 | var9_1) ^ -1128905784;
                    continue block29;
                }
                case 1359604150: {
                    if (!var2_6.b) ** continue;
                    var8_3 = (var4_2 | var9_1) ^ -1282029395;
                    continue block29;
                }
                case 1579836115: {
                    var7_4 ^= var8_3 ^ 1176004689;
                    var8_3 = (var4_2 | var9_1) ^ -1022444077;
                    continue block29;
                }
                case 783357869: {
                    ** continue;
                }
                case 1783705492: {
                    var7_4 ^= var8_3 ^ -1477001359;
                    var8_3 = (var4_2 | var9_1) ^ 287608511;
                    continue block29;
                }
                case -56941375: 
            }
            break;
        }
        var3_7 = jP.resolveLatest(var2_6.a);
        var7_4 ^= -1930365618;
        SwingUtilities.invokeLater((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$show$4(z.r.ha z.r.hM ), ()V)((ha)var2_6, (hM)var3_7));
        var7_4 ^= 849167875;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    static {
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
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$show$5(ha ha2) {
        int n2 = b & 0xF2F79062 ^ 0x1A3E0868;
        int n3 = 0;
        int n4 = (n2 | 0xF2F79062) ^ 0x2002E5CD;
        n3 = (n2 | 0xF2F79062) ^ 0x850FA7CF;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1330641368: {
                    ha2.unavailable(ji.a((n4 | n3 ^ 0x4247964A) ^ (n3 ^ 0x1F2E4CCB), (n2 | n3 ^ 0x4247964A) ^ ((n4 | n3 ^ 0x4247964A) ^ (n3 ^ 0x16424024))));
                    return;
                }
                case 2146451365: {
                    n3 = (n2 | 0xF2F79062) ^ 0x41134465;
                    continue block5;
                }
                case -1142105073: 
            }
            n4 ^= n3 ^ 0xCD027F8E;
            n3 = (n2 | 0xF2F79062) ^ 0x4A4F9E42;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void lambda$show$4(ha var0, hM var1_1) {
        var2_2 = ji.b & 585493983 ^ 2142302673;
        var4_3 = 0;
        var3_4 = (var2_2 | 585493983) ^ -1824617395;
        if (true) ** GOTO lbl15
        block5: while (true) {
            var4_3 = (var2_2 | 585493983) ^ 983029586;
            block6: while (true) {
                switch (var4_3) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
                    case 1164061325: {
                        var0.available(var1_1);
                        return;
                    }
lbl15:
                    // 1 sources

                    var4_3 = (var2_2 | 585493983) ^ 1542206011;
                    ** GOTO lbl-1000
lbl17:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | 585493983) ^ -2140112245;
                        ** continue;
                        break;
                    }
                    case -8026284: {
                        var3_4 ^= var4_3 ^ -1023339267;
                        continue block5;
                    }
                    case 605671396: 
                }
                break;
            }
            break;
        }
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$show$3(Runnable runnable, ActionEvent actionEvent) {
        int n2 = b & 0xD12E8290 ^ 0xB17074F;
        int n3 = 0;
        int n4 = (n2 | 0xD12E8290) ^ 0xD83FFA21;
        n3 = (n2 | 0xD12E8290) ^ 0x1354BD0B;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1171203439: {
                    n4 ^= n3 ^ 0xB670461E;
                    n3 = (n2 | 0xD12E8290) ^ 0xDBA46069;
                    continue block5;
                }
                case -932496684: {
                    n3 = (n2 | 0xD12E8290) ^ 0x9EF0A2B0;
                    continue block5;
                }
                case 10217398: 
            }
            break;
        }
        runnable.run();
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void lambda$show$2(List var0, JButton var1_1) {
        block34: {
            block27: {
                block28: {
                    block30: {
                        block32: {
                            block26: {
                                block29: {
                                    block31: {
                                        block33: {
                                            break block33;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                var9_4 = (var4_3 | var10_2) ^ -1150832396;
                                                break block26;
                                                break;
                                            }
lbl4:
                                            // 1 sources

                                            while (true) {
                                                v0 = ji.a(((var8_8 ^= -1275038459) | var10_2) ^ -1353257092, (var4_3 | var10_2) ^ ((var8_8 | var10_2) ^ 1212384260));
                                                break block27;
                                                break;
                                            }
lbl7:
                                            // 1 sources

                                            while (true) {
                                                v1 = ji.a(((var8_8 ^= 1845694568) | var10_2) ^ -300489873, (var4_3 | var10_2) ^ ((var8_8 | var10_2) ^ -1675589616));
                                                break block28;
                                                break;
                                            }
lbl10:
                                            // 1 sources

                                            while (true) {
                                                var8_8 ^= var9_4 ^ -2068982525;
                                                ** continue;
                                                break;
                                            }
lbl13:
                                            // 1 sources

                                            while (true) {
                                                var7_7 = v0;
                                                var5_6 = var2_5;
                                                v1 = ji.a(((var8_8 ^= -146391746) | var10_2) ^ -300489878, (var4_3 | var10_2) ^ ((var8_8 | var10_2) ^ 579766288)) + var5_6 + var7_7;
                                                break block28;
lbl18:
                                                // 1 sources

                                                while (true) {
                                                    var8_8 ^= var9_4 ^ -158534637;
                                                    break block29;
                                                    break;
                                                }
lbl21:
                                                // 1 sources

                                                while (true) {
                                                    break block30;
                                                    break;
                                                }
                                                break;
                                            }
lbl23:
                                            // 1 sources

                                            while (true) {
                                                var9_4 = (var4_3 | var10_2) ^ 2061866677;
                                                break block31;
                                                break;
                                            }
                                        }
                                        var10_2 = -1237879893;
                                        var4_3 = ji.b & -1237879893 ^ 1857547763;
                                        var9_4 = 0;
                                        break block34;
lbl31:
                                        // 1 sources

                                        while (true) {
                                            var8_8 ^= var9_4 ^ 242040318;
                                            ** continue;
                                            break;
                                        }
                                        while (true) {
                                            var8_8 ^= 759519315;
                                            break block32;
                                            break;
                                        }
lbl37:
                                        // 1 sources

                                        return;
                                    }
lbl40:
                                    // 2 sources

                                    block22: while (true) {
                                        switch (var9_4) {
                                            default: {
                                                continue block22;
                                            }
                                            case -570882379: {
                                                break;
                                            }
                                            case -1474675861: {
                                                ** continue;
                                            }
lbl48:
                                            // 1 sources

                                            while (true) {
                                                ** continue;
                                                break;
                                            }
                                        }
                                        var9_4 = (var4_3 | var10_2) ^ 1454228624;
                                        continue;
                                        break;
                                    }
                                }
                                var9_4 = (var4_3 | var10_2) ^ -1758777958;
                            }
lbl55:
                            // 3 sources

                            block24: while (true) {
                                switch (var9_4) {
                                    default: {
                                        continue block24;
                                    }
                                    case -440150800: {
                                        ** continue;
                                    }
                                    case 604640994: {
                                        ** continue;
                                    }
                                    case 1771885153: {
                                        ** continue;
                                    }
                                    case 1171279631: {
                                        if (var2_5 != 0L) ** continue;
                                    }
                                }
                                break;
                            }
lbl67:
                            // 1 sources

                            while (true) {
                                ** continue;
                                break;
                            }
                        }
                        ** while (var2_5 != 1L)
lbl71:
                        // 1 sources

                        ** while (true)
                    }
                    v0 = ji.a(((var8_8 ^= -1275038459) | var10_2) ^ -1353257091, (var4_3 | var10_2) ^ ((var8_8 | var10_2) ^ -1590655996));
                    break block27;
                }
                var8_8 ^= 1502289901;
                var1_1.setText(v1);
                var9_4 = (var4_3 | var10_2) ^ -625088231;
                ** GOTO lbl55
            }
            ** while (true)
            {
                ** case -2074973874:
            }
lbl83:
            // 1 sources

            var2_5 = var0.stream().filter((Predicate<ha>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, selectedForInstall(), (Lz/r/ha;)Z)()).count();
            var9_4 = (var4_3 | var10_2) ^ 460598027;
            ** while (true)
            ** while (true)
        }
        var8_8 = (var4_3 | var10_2) ^ 1221066679;
        var9_4 = (var4_3 | var10_2) ^ 592378190;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void lambda$show$1(CompletableFuture var0, boolean[] var1_1, List var2_2, JFrame var3_3, boolean[] var4_4) {
        block38: {
            block37: {
                block41: {
                    block40: {
                        block35: {
                            block36: {
                                block39: {
                                    var8_5 = -1553168601;
                                    var5_6 = ji.b & -1553168601 ^ 163112365;
                                    var7_7 = 0;
                                    break block39;
lbl5:
                                    // 1 sources

                                    while (var2_2.stream().anyMatch((Predicate<ha>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, requiredUnsatisfied(), (Lz/r/ha;)Z)())) {
                                        block34: {
                                            ** GOTO lbl68
lbl7:
                                            // 1 sources

                                            while (true) {
                                                var6_8 ^= var7_7 ^ 2081469194;
                                                break block34;
                                                break;
                                            }
lbl10:
                                            // 1 sources

                                            return;
lbl12:
                                            // 1 sources

                                            while (true) {
                                                var6_8 ^= var7_7 ^ -1155364034;
                                                break block35;
                                                break;
                                            }
                                        }
                                        var7_7 = (var5_6 | var8_5) ^ 1456387829;
                                        break block36;
                                    }
                                    break block40;
                                }
                                var6_8 = (var5_6 | var8_5) ^ 1021223876;
                                ** GOTO lbl51
                            }
lbl23:
                            // 11 sources

                            block25: while (true) {
                                switch (var7_7) lbl-1000:
                                // 9 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block25;
                                        }
                                        break;
                                    }
                                    case -1584029178: {
                                        ** GOTO lbl5
                                    }
                                    case -1363941250: {
                                        ** continue;
                                    }
                                    case -1614490788: {
                                        ** continue;
                                    }
                                    case 730860024: {
                                        ** continue;
                                    }
lbl36:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = (var5_6 | var8_5) ^ -2140344745;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl39:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = (var5_6 | var8_5) ^ -1752196785;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case -47034022: {
                                        if (!var1_1[0]) break block37;
                                        break;
                                    }
lbl45:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = (var5_6 | var8_5) ^ 876098803;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl48:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = (var5_6 | var8_5) ^ -834223030;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl51:
                                    // 1 sources

                                    var7_7 = (var5_6 | var8_5) ^ -1104939006;
                                    ** GOTO lbl-1000
lbl53:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = (var5_6 | var8_5) ^ 174671273;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case -1982398322: {
                                        if (var0.isDone()) {
                                            ** continue;
                                        }
                                        break block38;
                                    }
                                    case 366944173: {
                                        break block25;
                                    }
                                    case -1758245333: {
                                        var6_8 ^= var7_7 ^ -156279790;
                                        ** continue;
                                    }
lbl65:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = (var5_6 | var8_5) ^ 573302561;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl68:
                                    // 1 sources

                                    var7_7 = (var5_6 | var8_5) ^ 1769375560;
                                    ** continue;
                                    case 1759786870: {
                                        return;
                                    }
                                }
                                break;
                            }
                            var7_7 = (var5_6 | var8_5) ^ 1979857440;
                            ** GOTO lbl23
                            {
                                case 1014202080: {
                                    var3_3.dispose();
                                    break;
                                }
                                case 1706697701: {
                                    var0.complete(var4_4[0]);
                                    break;
                                }
                                case -1910519664: {
                                    return;
                                }
                            }
                            var7_7 = (var5_6 | var8_5) ^ 643354477;
                            ** GOTO lbl23
                            {
                                case 472937705: {
                                    var6_8 ^= var7_7 ^ -847484408;
                                    ** continue;
                                }
                                case -1031118617: {
                                    var6_8 ^= var7_7 ^ 1426134925;
                                    ** continue;
                                }
                                case -570499697: {
                                    var6_8 ^= var7_7 ^ -1791014964;
                                    ** continue;
                                }
                                case -1918621502: {
                                    var6_8 ^= var7_7 ^ -1921765521;
                                    break;
                                }
                            }
                            var7_7 = (var5_6 | var8_5) ^ -682290784;
                            ** GOTO lbl23
                            {
                                case -1335701332: {
                                    var6_8 ^= var7_7 ^ -2062327918;
                                    break block41;
                                }
                            }
                            var7_7 = (var5_6 | var8_5) ^ 635645759;
                            ** GOTO lbl23
                            {
                                case 2056218699: {
                                    return;
                                }
                            }
                            var7_7 = (var5_6 | var8_5) ^ 463353603;
                            ** GOTO lbl23
                            {
                                ** case 2091513359:
                            }
lbl109:
                            // 1 sources

                            var6_8 ^= var7_7 ^ 307537941;
                            ** while (true)
                        }
                        var7_7 = (var5_6 | var8_5) ^ -1021783847;
                        ** GOTO lbl23
                    }
                    var7_7 = (var5_6 | var8_5) ^ -1211329722;
                    ** GOTO lbl23
                }
                var7_7 = (var5_6 | var8_5) ^ -780955676;
                ** GOTO lbl23
            }
            var7_7 = (var5_6 | var8_5) ^ 1020242308;
            ** GOTO lbl23
        }
        var7_7 = (var5_6 | var8_5) ^ 89067473;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void lambda$prompt$0(Path var0, CompletableFuture var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

