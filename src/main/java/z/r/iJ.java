/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.lang.invoke.LambdaMetafactory;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.U;
import z.r.cQ;
import z.r.cW;
import z.r.dl;
import z.r.eU;
import z.r.eq;
import z.r.fH;
import z.r.fx;
import z.r.gh;
import z.r.ms;
import z.r.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class iJ {
    private static final String a;
    private static final Color a;
    private static final int[] a;
    private static final Cursor a;
    private static final Color b;
    private static final Color c;
    private static final Color d;
    private static final Color e;
    private static final Color f;
    private static final String[] a;
    private static final String b;
    private static final Color g;
    private static final Color h;
    private static final Object[] a;
    private static final Color i;
    public static final int c;
    private static final int a;
    private static final Color j;
    private static final Color k;
    private static final Color l;
    private static final int b;

    /*
     * Enabled aggressive block sorting
     */
    private iJ() {
        int n2 = c & 0x1A17BB8A ^ 0xDC331B6D;
        int n3 = (n2 | 0x1A17BB8A) ^ 0x7178C69D;
        n3 ^= 0x6A16164;
        n3 ^= 0x1665A4B1;
    }

    /*
     * Enabled aggressive block sorting
     */
    static ms prompt(U u2, String string) throws Exception {
        CompletableFuture completableFuture;
        int n2 = -2033968943;
        int n3 = c & 0x86C418D1 ^ 0x560F30BC;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x7543CCB1;
        n4 = (n3 | n2) ^ 0x85A77A17;
        block11: while (true) {
            switch (n4) {
                default: {
                    continue block11;
                }
                case 1128146909: {
                    completableFuture = new CompletableFuture();
                    n4 = (n3 | n2) ^ 0xECABCAE6;
                    break block11;
                }
                case -1598376814: {
                    n5 ^= n4 ^ 0x9D64D114;
                    n4 = (n3 | n2) ^ 0x95F11F20;
                    continue block11;
                }
                case 1399341802: {
                    n4 = (n3 | n2) ^ 0x76758C6F;
                    continue block11;
                }
            }
            break;
        }
        block12: while (true) {
            switch (n4) {
                default: {
                    continue block12;
                }
                case -1627875796: {
                    n5 ^= n4 ^ 0xD1D223BC;
                    n4 = (n3 | n2) ^ 0x65EB02D8;
                    continue block12;
                }
                case -1289471451: {
                    return (ms)completableFuture.get();
                }
                case 2093016222: {
                    SwingUtilities.invokeLater(() -> {
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
                    });
                    n4 = (n3 | n2) ^ 0x4837AED1;
                    continue block12;
                }
                case 979694107: 
            }
            n5 ^= n4 ^ 0xEA2257B4;
            n4 = (n3 | n2) ^ 0xAA0FDC63;
        }
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
     * Exception decompiling
     */
    static void fatal(String var0) {
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
    private static void show(U var0, String var1_1, CompletableFuture<ms> var2_2) {
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
    private static void enableDrag(JFrame jFrame, JComponent jComponent) {
        eU eU2;
        int n2 = 1621632371;
        int n3 = c & 0x60A82573 ^ 0x5C456D1C;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x7AE563CC;
        n4 = (n3 | n2) ^ 0xEDF1D1E1;
        block13: while (true) {
            switch (n4) {
                default: {
                    continue block13;
                }
                case -1584814617: {
                    eU2 = new eU(jFrame);
                    n4 = (n3 | n2) ^ 0x5162DA64;
                    break block13;
                }
                case 348932030: {
                    n5 ^= n4 ^ 0x377C9D06;
                    n4 = (n3 | n2) ^ 0xDD64C898;
                    continue block13;
                }
                case -1860387682: {
                    n4 = (n3 | n2) ^ 0x68212AC1;
                    continue block13;
                }
            }
            break;
        }
        block14: while (true) {
            switch (n4) {
                default: {
                    continue block14;
                }
                case 764393243: {
                    n5 ^= n4 ^ 0x59C4CE00;
                    n4 = (n3 | n2) ^ 0xE12EF630;
                    continue block14;
                }
                case -955985725: {
                    n5 ^= n4 ^ 0xE7557D50;
                    n4 = (n3 | n2) ^ 0x222EC34B;
                    continue block14;
                }
                case -1496921381: {
                    n5 ^= n4 ^ 0x2BA291BE;
                    n4 = (n3 | n2) ^ 0x1B3843B1;
                    continue block14;
                }
                case 1589882420: {
                    jComponent.addMouseMotionListener(eU2);
                    n4 = (n3 | n2) ^ 0xDA2BA7A4;
                    continue block14;
                }
                case 1742024398: {
                    return;
                }
                case -1648125105: 
            }
            jComponent.addMouseListener(eU2);
            n4 = (n3 | n2) ^ 0xBBE9BDBC;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static JComponent logo(int var0) {
        block22: {
            break block22;
lbl1:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var6_1) ^ 2003412907;
                ** GOTO lbl25
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                iJ.lockSize(var1_5, iJ.a((var3_6 | var4_4 ^ var5_2) ^ (var4_4 ^ 1270388785), (var2_3 | var4_4 ^ var5_2) ^ ((var3_6 | var4_4 ^ var5_2) ^ (var4_4 ^ -25776563))), var0 + iJ.a((var3_6 | var4_4 ^ var5_2) ^ (var4_4 ^ 1270388782), (var2_3 | var4_4 ^ var5_2) ^ ((var3_6 | var4_4 ^ var5_2) ^ (var4_4 ^ -649738136))));
                ** continue;
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                var3_6 ^= var4_4 ^ -1801708608;
                if (true) ** GOTO lbl19
                break;
            }
            block14: while (true) {
                switch (var4_4) lbl-1000:
                // 4 sources

                {
                    default: {
                        continue block14;
                    }
                    case 2059890918: {
                        ** continue;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var6_1) ^ 1632402860;
                        ** GOTO lbl-1000
                        break;
                    }
lbl19:
                    // 1 sources

                    var4_4 = (var2_3 | var6_1) ^ 963679730;
                    ** GOTO lbl-1000
lbl21:
                    // 1 sources

                    return var1_5;
lbl23:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var6_1) ^ -762607492;
lbl25:
                        // 2 sources

                        block19: while (true) {
                            switch (var4_4) lbl-1000:
                            // 3 sources

                            {
                                default: {
                                    continue block19;
                                }
                                case -363844658: {
                                    ** continue;
                                }
                                case -325839510: {
                                    ** continue;
                                }
lbl33:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var6_1) ^ 1400629301;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case 1835300131: {
                                    var3_6 ^= var4_4 ^ 82052186;
                                    var4_4 = (var2_3 | var6_1) ^ 1438635665;
                                    ** GOTO lbl-1000
                                }
                                case -930718988: 
                            }
                            break;
                        }
                        var3_6 ^= var4_4 ^ -1934709669;
                        ** continue;
                        break;
                    }
                    case -559709965: {
                        var4_4 = (var2_3 | var6_1) ^ -987198023;
                        ** GOTO lbl-1000
                    }
                    case -2036373331: 
                }
                break;
            }
            var1_5 = new eq(var0);
            ** while (true)
        }
        var6_1 = -1951419042;
        var5_2 = 1644142224;
        var2_3 = iJ.c & -1951419042 ^ 1045122131;
        var4_4 = 0;
        var3_6 = (var2_3 | var6_1) ^ 1727035985;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static JComponent fieldRow(String var0, JComponent var1_1) {
        block37: {
            var9_2 = -607003097;
            var8_3 = 2007026409;
            var7_4 = -713493134;
            var4_5 = iJ.c & -607003097 ^ 2012706612;
            var6_6 = 0;
            var5_9 = (var4_5 | var9_2) ^ -502934528;
            var6_6 = (var4_5 | var9_2) ^ 1578541031;
            if (true) ** GOTO lbl17
lbl9:
            // 1 sources

            while (true) {
                var6_6 = (var4_5 | var9_2) ^ -1929512353;
                break block37;
                break;
            }
            block28: while (true) {
                switch (var6_6) {
                    case 1417978033: {
                        var5_9 ^= var6_6 ^ -1225852260;
                        var6_6 = (var4_5 | var9_2) ^ -1852790752;
                    }
lbl17:
                    // 3 sources

                    default: {
                        continue block28;
                    }
                    case -1579065136: {
                        var6_6 = (var4_5 | var9_2) ^ -1418502266;
                        continue block28;
                    }
                    case 1852266263: 
                }
                break;
            }
            var2_7 = new JPanel(new BorderLayout(iJ.a((var5_9 | var6_6 ^ -1246328528) ^ (var6_6 ^ -273045866), (var4_5 | var6_6 ^ -1246328528) ^ ((var5_9 | var6_6 ^ -1246328528) ^ (var6_6 ^ -483182336))), 0));
            var6_6 = (var4_5 | var9_2) ^ 466810090;
            break block37;
lbl26:
            // 1 sources

            while (true) {
                var6_6 = (var4_5 | var9_2) ^ 1056526216;
                ** GOTO lbl64
lbl29:
                // 1 sources

                while (true) {
                    var6_6 = (var4_5 | var9_2) ^ 429791521;
                    ** GOTO lbl64
                    break;
                }
                break;
            }
lbl32:
            // 1 sources

            while (true) {
                var6_6 = (var4_5 | var9_2) ^ -1707683275;
                ** GOTO lbl64
                break;
            }
lbl35:
            // 1 sources

            while (true) {
                var6_6 = (var4_5 | var9_2) ^ 1075354296;
                ** GOTO lbl64
                break;
            }
lbl38:
            // 1 sources

            while (true) {
                var6_6 = (var4_5 | var9_2) ^ 2122593852;
                if (true) ** GOTO lbl64
                break;
            }
        }
        block34: while (true) {
            block38: {
                switch (var6_6) {
                    case 1930036584: {
                        var5_9 ^= var6_6 ^ 1501057483;
                        ** break;
                    }
                    case 1177635399: {
                        var2_7.setOpaque(false);
                        ** continue;
                    }
lbl50:
                    // 1 sources

                    var6_6 = (var4_5 | var9_2) ^ 1921429716;
                    default: {
                        continue block34;
                    }
                    case -467334179: {
                        var5_9 ^= var6_6 ^ 1175536268;
                        break block38;
                    }
                    case -1921953821: 
                }
                var3_8 = new JLabel(var0);
                ** continue;
            }
            var6_6 = (var4_5 | var9_2) ^ -1178159760;
        }
        block35: while (true) {
            var6_6 = (var4_5 | var9_2) ^ -245443486;
lbl64:
            // 6 sources

            block36: while (true) {
                switch (var6_6) {
                    default: {
                        continue block36;
                    }
                    case 766233793: {
                        var2_7.add((Component)var1_1, iJ.a((var5_9 | var6_6 ^ -159771930) ^ (var6_6 ^ 1129143524), (var4_5 | var6_6 ^ -159771930) ^ ((var5_9 | var6_6 ^ -159771930) ^ (var6_6 ^ -421278647))));
                        var6_6 = (var4_5 | var9_2) ^ -84980111;
                        continue block36;
                    }
                    case 1707158786: {
                        var5_9 ^= var6_6 ^ -819060229;
                        ** continue;
                    }
                    case 85504326: {
                        var5_9 ^= var6_6 ^ 128526914;
                        var6_6 = (var4_5 | var9_2) ^ 1401351161;
                        continue block36;
                    }
                    case -632404833: {
                        var5_9 ^= var6_6 ^ -535189183;
                        var6_6 = (var4_5 | var9_2) ^ -765709322;
                        continue block36;
                    }
                    case -1074829937: {
                        var5_9 ^= var6_6 ^ 1334528768;
                        var6_6 = (var4_5 | var9_2) ^ 205728502;
                        continue block36;
                    }
                    case 923361481: {
                        var5_9 ^= var6_6 ^ -85077178;
                        var6_6 = (var4_5 | var9_2) ^ -542047105;
                        continue block36;
                    }
                    case -1056001857: {
                        var5_9 ^= var6_6 ^ -2100385159;
                        continue block35;
                    }
                    case -1401875250: {
                        iJ.lockSize(var2_7, iJ.a((var5_9 | var6_6 ^ var8_3) ^ (var6_6 ^ 226616523), (var4_5 | var6_6 ^ var8_3) ^ ((var5_9 | var6_6 ^ var8_3) ^ (var6_6 ^ 1284237910))), iJ.a((var5_9 | var6_6 ^ var8_3) ^ (var6_6 ^ 226616520), (var4_5 | var6_6 ^ var8_3) ^ ((var5_9 | var6_6 ^ var8_3) ^ (var6_6 ^ 1051800791))));
                        var6_6 = (var4_5 | var9_2) ^ -922836994;
                        continue block36;
                    }
                    case -1279340787: {
                        var2_7.add((Component)var3_8, iJ.a((var5_9 | var6_6 ^ 1752109354) ^ (var6_6 ^ -44138765), (var4_5 | var6_6 ^ 1752109354) ^ ((var5_9 | var6_6 ^ 1752109354) ^ (var6_6 ^ 1107684957))));
                        ** break;
                    }
                    case -2123118325: {
                        var5_9 ^= var6_6 ^ 1265075989;
                        var6_6 = (var4_5 | var9_2) ^ 1279864890;
                        continue block36;
                    }
                    case 245967701: {
                        var3_8.setPreferredSize(new Dimension(iJ.a((var5_9 | var6_6 ^ var7_4) ^ (var6_6 ^ -1887700074), (var4_5 | var6_6 ^ var7_4) ^ ((var5_9 | var6_6 ^ var7_4) ^ (var6_6 ^ 773020644))), iJ.a((var5_9 | var6_6 ^ var7_4) ^ (var6_6 ^ -1887700079), (var4_5 | var6_6 ^ var7_4) ^ ((var5_9 | var6_6 ^ var7_4) ^ (var6_6 ^ -1164412700)))));
                        ** continue;
                    }
                    case -429267434: {
                        var3_8.setForeground(iJ.k);
                        ** continue;
                    }
                    case -206252607: {
                        var3_8.setFont(p.font(1, iJ.a((var5_9 | var6_6 ^ 677710822) ^ (var6_6 ^ 1380451611), (var4_5 | var6_6 ^ 677710822) ^ ((var5_9 | var6_6 ^ 677710822) ^ (var6_6 ^ -155761028)))));
                        ** continue;
                    }
lbl114:
                    // 1 sources

                    var6_6 = (var4_5 | var9_2) ^ 632929192;
                    continue block36;
                    case 541522760: 
                }
                break;
            }
            break;
        }
        return var2_7;
    }

    /*
     * Exception decompiling
     */
    private static void styleField(JTextField var0) {
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
    private static JLabel websiteLink() {
        var6 = 1102724514;
        var5_1 = 459670510;
        var2_2 = iJ.c & 459670510 ^ 250995785;
        var4_3 = 0;
        var3_6 = (var2_2 | var5_1) ^ -1784127984;
        var4_3 = (var2_2 | var5_1) ^ 1472309667;
        if (true) ** GOTO lbl69
lbl8:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ 1873415;
            ** GOTO lbl17
            break;
        }
lbl11:
        // 1 sources

        while (true) {
            var1_5 = p.font(0, iJ.a(((var3_6 ^= -340858365) | var5_1) ^ 1106328945, (var2_2 | var5_1) ^ ((var3_6 | var5_1) ^ -785546634)));
            var4_3 = (var2_2 | var5_1) ^ -1037510456;
            if (true) ** GOTO lbl60
            block30: while (true) {
                var4_3 = (var2_2 | var5_1) ^ 1481090305;
lbl17:
                // 2 sources

                block31: while (true) {
                    switch (var4_3) {
                        case 535523816: {
                            var3_6 ^= var4_3 ^ 86489857;
                            ** break;
                        }
                        case -1088718143: {
                            var3_6 ^= var4_3 ^ -1224638777;
                            var4_3 = (var2_2 | var5_1) ^ 292944844;
                            continue block31;
                        }
                        case 1081797300: {
                            var3_6 ^= var4_3 ^ 2022809524;
                            var4_3 = (var2_2 | var5_1) ^ 1160501667;
                            continue block31;
                        }
                        case 1524383308: {
                            var0_4.setPreferredSize(new Dimension(p.textWidth(iJ.a((var3_6 | var4_3 ^ var6) ^ (var4_3 ^ 344709687), (var2_2 | var4_3 ^ var6) ^ ((var3_6 | var4_3 ^ var6) ^ (var4_3 ^ -1805757860))), var1_5) + iJ.a((var3_6 | var4_3 ^ var6) ^ (var4_3 ^ -608322754), (var2_2 | var4_3 ^ var6) ^ ((var3_6 | var4_3 ^ var6) ^ (var4_3 ^ -242398849))), iJ.a((var3_6 | var4_3 ^ var6) ^ (var4_3 ^ -608322753), (var2_2 | var4_3 ^ var6) ^ ((var3_6 | var4_3 ^ var6) ^ (var4_3 ^ 1409128171)))));
                            ** GOTO lbl48
                        }
                        case -1975141238: {
                            var0_4.setFont(var1_5);
                            ** GOTO lbl46
                        }
                        case -388866219: {
                            var0_4.setCursor(iJ.a);
                            var4_3 = (var2_2 | var5_1) ^ 1603079515;
                            continue block31;
                        }
lbl40:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -148522822;
                        ** GOTO lbl60
                        case -572571865: {
                            var3_6 ^= var4_3 ^ -116637463;
                            var4_3 = (var2_2 | var5_1) ^ -1783473307;
                            ** GOTO lbl60
                        }
lbl46:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -1602437001;
                        ** GOTO lbl60
lbl48:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -1595106002;
                        ** GOTO lbl60
                        case 1672255525: {
                            var0_4.setForeground(iJ.d);
                            ** continue;
                        }
                        case -1081399400: {
                            var3_6 ^= var4_3 ^ 1653300791;
                            var4_3 = (var2_2 | var5_1) ^ 2086371274;
                            ** GOTO lbl60
                        }
                        case 1202733806: {
                            var3_6 ^= var4_3 ^ -1198217305;
                            var4_3 = (var2_2 | var5_1) ^ -9667316;
                        }
lbl60:
                        // 8 sources

                        default: {
                            continue block31;
                        }
                        case 243407907: {
                            var0_4.addMouseListener(new fx(var0_4));
                            continue block30;
                        }
                        case -526673181: 
                    }
                    break;
                }
                break;
            }
            return var0_4;
        }
        block32: while (true) {
            var4_3 = (var2_2 | var5_1) ^ -1379165056;
lbl69:
            // 2 sources

            block33: while (true) {
                block34: {
                    switch (var4_3) {
                        case 982180653: {
                            break;
                        }
                        case -1304659089: {
                            var4_3 = (var2_2 | var5_1) ^ 1697525782;
                            continue block33;
                        }
                        case 1641172908: {
                            var3_6 ^= var4_3 ^ -744718437;
                            break;
                        }
                        case 2061096953: {
                            var0_4 = new JLabel(iJ.a((var3_6 | var4_3 ^ 1639961623) ^ (var4_3 ^ 345400220), (var2_2 | var4_3 ^ 1639961623) ^ ((var3_6 | var4_3 ^ 1639961623) ^ (var4_3 ^ -1612059672))));
                            ** continue;
                        }
                        case -188885413: {
                            switch (var3_6) {
                                default: {
                                    var4_3 = (var2_2 | var5_1) ^ 2116397123;
                                    continue block33;
                                }
                                case -828747011: {
                                    var4_3 = (var2_2 | var5_1) ^ 267643104;
                                    continue block33;
                                }
                                case -1973437953: 
                            }
                            var4_3 = (var2_2 | var5_1) ^ 396676895;
                        }
                        default: {
                            continue block33;
                        }
                        case 139667696: {
                            var3_6 ^= var4_3 ^ 1546668861;
                            continue block32;
                        }
                        case 268701455: {
                            var3_6 ^= var4_3 ^ -2121362317;
                            continue block32;
                        }
                        case 1211518540: {
                            break block34;
                        }
                    }
                    var4_3 = (var2_2 | var5_1) ^ -347459148;
                    continue;
                }
                var4_3 = (var2_2 | var5_1) ^ 628950210;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static void lockSize(JComponent var0, int var1_1, int var2_2) {
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
    private static Throwable unwrap(Throwable var0) {
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
    private static void setStatus(JTextArea var0, String var1_1, Color var2_2) {
        var6_3 = -453065539;
        var3_4 = iJ.c & -453065539 ^ -1701250800;
        var5_5 = 0;
        var4_6 = (var3_4 | var6_3) ^ -1720671393;
        var5_5 = (var3_4 | var6_3) ^ -889998335;
        ** GOTO lbl20
lbl7:
        // 1 sources

        while (true) {
            var5_5 = (var3_4 | var6_3) ^ -653276454;
            if (true) ** GOTO lbl20
            break;
        }
lbl10:
        // 2 sources

        while (true) {
            var4_6 ^= 1828256275;
            var0.setText(v0);
            ** continue;
            break;
        }
        while (true) {
            var4_6 ^= -271028815;
            v0 = var1_1;
            ** GOTO lbl10
            break;
        }
        block12: while (true) {
            var5_5 = (var3_4 | var6_3) ^ 1784037217;
lbl20:
            // 3 sources

            block13: while (true) {
                switch (var5_5) {
                    case -1800879396: {
                        if (var1_1 != null) ** continue;
                        var4_6 ^= -271028815;
                        v0 = "";
                        ** continue;
                    }
                    case -216382617: {
                        return;
                    }
                    case 364850826: {
                        var4_6 ^= var5_5 ^ -1951349573;
                        ** break;
                    }
                    case 670119783: {
                        var4_6 ^= var5_5 ^ -1618237731;
                        var5_5 = (var3_4 | var6_3) ^ 233094874;
                        continue block13;
                    }
                    case 873286076: {
                        var5_5 = (var3_4 | var6_3) ^ -348007625;
                        continue block13;
                    }
lbl39:
                    // 1 sources

                    var5_5 = (var3_4 | var6_3) ^ 170515464;
                    break;
                    case 186112778: {
                        var4_6 ^= var5_5 ^ 1792876790;
                        continue block12;
                    }
                    case -187227723: {
                        var0.setForeground(var2_2);
                        var5_5 = (var3_4 | var6_3) ^ -169269577;
                    }
                }
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static JTextArea statusArea(String var0) {
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void paintHint(JComponent var0, Graphics var1_1, String var2_2) {
        var11_3 = 554815358;
        var8_4 = iJ.c & 554815358 ^ 491851537;
        var10_5 = 0;
        var9_6 = (var8_4 | var11_3) ^ -1548919022;
        var10_5 = (var8_4 | var11_3) ^ -205245953;
        ** GOTO lbl14
lbl-1000:
        // 1 sources

        {
            block28: {
                while (true) {
                    continue;
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    var3_7.dispose();
                    var9_6 ^= -49581650;
                    var10_5 = (var8_4 | var11_3) ^ -817073146;
                    break block28;
                    break;
                }
lbl14:
                // 1 sources

                block25: while (true) {
                    switch (var10_5) {
                        default: {
                            continue block25;
                        }
                        case -829030784: {
                            var10_5 = (var8_4 | var11_3) ^ -1163242138;
                            continue block25;
                        }
                        case -2013554151: {
                            var9_6 ^= var10_5 ^ -726581182;
                            var10_5 = (var8_4 | var11_3) ^ -844345418;
                            continue block25;
                        }
                        case -251821879: 
                    }
                    break;
                }
                var3_7 = (Graphics2D)var1_1.create();
                ** continue;
            }
lbl29:
            // 2 sources

            block26: while (true) {
                switch (var10_5) {
                    default: {
                        continue block26;
                    }
                    case 844089808: {
                        var9_6 ^= var10_5 ^ -1429154305;
                        var10_5 = (var8_4 | var11_3) ^ 750538540;
                        continue block26;
                    }
                    case 300777555: {
                        var3_7.drawString(var2_2, var4_8.left, var6_10);
                        var9_6 ^= 774947427;
                        ** continue;
                    }
                    case -232932487: {
                        var9_6 ^= var10_5 ^ -1789925418;
                        var10_5 = (var8_4 | var11_3) ^ -2136361843;
                        continue block26;
                    }
                    case -1107788814: 
                }
                return;
            }
            var10_5 = (var8_4 | var11_3) ^ 1955704228;
            block27: while (true) {
                switch (var10_5) {
                    default: {
                        continue block27;
                    }
                    case 1237344987: {
                        var9_6 ^= var10_5 ^ 1518780951;
                        var10_5 = (var8_4 | var11_3) ^ 779513731;
                        continue block27;
                    }
                    case 321364220: {
                        p.enableAntialiasing(var3_7);
                        var10_5 = (var8_4 | var11_3) ^ -1843132053;
                        continue block27;
                    }
                    case -1351236076: {
                        var9_6 ^= var10_5 ^ -280546631;
                        var10_5 = (var8_4 | var11_3) ^ -2029475335;
                        continue block27;
                    }
                    case -1168546170: {
                        var3_7.setColor(iJ.e);
                        var10_5 = (var8_4 | var11_3) ^ -863839853;
                        continue block27;
                    }
                    case -237824276: {
                        var9_6 ^= var10_5 ^ -1490711271;
                        var10_5 = (var8_4 | var11_3) ^ -781451517;
                        continue block27;
                    }
                    case -331730820: {
                        var3_7.setFont(var0.getFont());
                        var10_5 = (var8_4 | var11_3) ^ 1916079239;
                        continue block27;
                    }
                    case 1332003832: {
                        var9_6 ^= var10_5 ^ -1701045295;
                        var10_5 = (var8_4 | var11_3) ^ 931074110;
                        continue block27;
                    }
                    case 170843969: 
                }
                break;
            }
            var4_8 = var0.getInsets();
            var9_6 ^= -1127754096;
            var5_9 = var3_7.getFontMetrics();
            var9_6 ^= -1335610352;
            var6_10 = (var0.getHeight() + var5_9.getAscent() - var5_9.getDescent()) / 2;
            var10_5 = (var8_4 | var11_3) ^ 253626031;
            ** continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void lambda$show$16(Runnable var0, ActionEvent var1_1) {
        block8: {
            break block8;
lbl1:
            // 2 sources

            block5: while (true) {
                switch (var4_3) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
                    case -1518399946: {
                        var3_4 ^= var4_3 ^ -2039661250;
                        break block5;
                    }
                    case -380124613: {
                        var0.run();
                        return;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | 57408316) ^ 579137931;
                        ** continue;
                        break;
                    }
                }
                break;
            }
            var4_3 = (var2_2 | 57408316) ^ 1856781702;
            ** GOTO lbl1
        }
        var2_2 = iJ.c & 57408316 ^ -2035065695;
        var4_3 = 0;
        var3_4 = (var2_2 | 57408316) ^ 1583509263;
        var4_3 = (var2_2 | 57408316) ^ -1304195000;
        ** while (true)
        {
            ** case 901279733:
        }
lbl24:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void lambda$show$15(cW var0, ActionEvent var1_1) {
        var2_2 = iJ.c & 864367724 ^ -585886502;
        var4_3 = 0;
        ** GOTO lbl15
lbl4:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | 864367724) ^ -506683812;
            if (true) ** GOTO lbl9
            break;
        }
        block6: while (true) {
            var4_3 = (var2_2 | 864367724) ^ -1830302083;
lbl9:
            // 3 sources

            block7: while (true) {
                switch (var4_3) {
                    default: {
                        continue block7;
                    }
                    case 1836251779: {
                        break block6;
                    }
lbl15:
                    // 1 sources

                    var3_4 = (var2_2 | 864367724) ^ -1388409988;
                    continue block6;
                    case -558140847: {
                        var3_4 ^= var4_3 ^ -528323304;
                        ** continue;
                    }
                    case 509192866: {
                        var0.requestFocusInWindow();
                        return;
                    }
                }
                break;
            }
            break;
        }
        var4_3 = (var2_2 | 864367724) ^ 556680879;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void lambda$show$14(Runnable var0, ActionEvent var1_1) {
        var2_2 = iJ.c & 1831989386 ^ 865866882;
        var4_3 = 0;
        if (true) ** GOTO lbl21
        block5: while (true) {
            switch (var4_3) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | 1831989386) ^ 48810063;
                    ** GOTO lbl-1000
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | 1831989386) ^ -2020777613;
                    ** GOTO lbl-1000
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | 1831989386) ^ -1811125835;
                    ** continue;
                    break;
                }
                case -131033607: {
                    var3_4 ^= var4_3 ^ -1981180525;
                    ** continue;
                }
lbl21:
                // 1 sources

                var3_4 = (var2_2 | 1831989386) ^ -1767423350;
                ** continue;
                case -340681409: {
                    var0.run();
                    return;
                }
                case 2102738117: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void lambda$show$13(Runnable var0, ActionEvent var1_1) {
        block9: {
            var2_2 = iJ.c & -893460562 ^ -825120071;
            var4_3 = 0;
            ** GOTO lbl14
lbl4:
            // 1 sources

            while (true) {
                var3_4 ^= var4_3 ^ 700024199;
                ** GOTO lbl16
                break;
            }
lbl7:
            // 1 sources

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
                    case -2018290863: {
                        ** continue;
                    }
lbl14:
                    // 1 sources

                    var3_4 = (var2_2 | -893460562) ^ -17771448;
                    break block9;
lbl16:
                    // 1 sources

                    var4_3 = (var2_2 | -893460562) ^ 762386029;
                    ** GOTO lbl-1000
lbl18:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | -893460562) ^ 1229761774;
                        ** continue;
                        break;
                    }
                    case -1472394672: {
                        ** continue;
                    }
                    case -477173294: 
                }
                break;
            }
            var0.run();
            return;
        }
        var4_3 = (var2_2 | -893460562) ^ 1724052975;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$show$12(dl var0, cW var1_1, gh var2_2, fH var3_3, JTextArea var4_4, U var5_5, CompletableFuture var6_6, JFrame var7_7) {
        var11_8 = -1893557120;
        var8_9 = iJ.c & -1893557120 ^ -1824871295;
        var10_10 = 0;
        var9_11 = (var8_9 | var11_8) ^ 841429649;
        var10_10 = (var8_9 | var11_8) ^ 817612873;
        ** GOTO lbl62
lbl7:
        // 1 sources

        while (true) {
            var10_10 = (var8_9 | var11_8) ^ 330322817;
            ** GOTO lbl18
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var10_10 = (var8_9 | var11_8) ^ -1362797179;
            if (true) ** GOTO lbl18
            break;
        }
        block19: while (true) {
            var10_10 = (var8_9 | var11_8) ^ -560322660;
            if (true) ** GOTO lbl18
            block20: while (true) {
                var10_10 = (var8_9 | var11_8) ^ 1242212442;
lbl18:
                // 4 sources

                block21: while (true) {
                    switch (var10_10) {
                        case -718269221: {
                            iJ.setStatus(var4_4, iJ.a((var9_11 | var10_10 ^ 1511163995) ^ (var10_10 ^ -1415322177), (var8_9 | var10_10 ^ 1511163995) ^ ((var9_11 | var10_10 ^ 1511163995) ^ (var10_10 ^ 389625531))), iJ.f);
                            var10_10 = (var8_9 | var11_8) ^ -51150947;
                            continue block21;
                        }
                        case 190122100: {
                            var9_11 ^= var10_10 ^ -1284831470;
                            ** break;
                        }
                        case 838852868: {
                            var0.setEnabled(false);
                            var10_10 = (var8_9 | var11_8) ^ 938489302;
                            continue block21;
                        }
                        case 1674167068: {
                            var9_11 ^= var10_10 ^ 728021531;
                            ** GOTO lbl40
                        }
                        case 765216317: {
                            var9_11 ^= var10_10 ^ -877022958;
                            var10_10 = (var8_9 | var11_8) ^ -154512852;
                            continue block21;
                        }
lbl38:
                        // 1 sources

                        var10_10 = (var8_9 | var11_8) ^ 1915922819;
                        ** GOTO lbl62
lbl40:
                        // 1 sources

                        var10_10 = (var8_9 | var11_8) ^ 1269397789;
                        ** GOTO lbl62
                        case -318237438: {
                            var3_3.setLoading(true);
                            ** break;
                        }
                        case -1463121577: {
                            var9_11 ^= var10_10 ^ 1907077528;
                            ** continue;
                        }
lbl48:
                        // 1 sources

                        var10_10 = (var8_9 | var11_8) ^ 942659047;
                        continue block21;
                        case -1491768986: {
                            var9_11 ^= var10_10 ^ 793887013;
                            continue block20;
                        }
                        case -728513124: {
                            var9_11 ^= 1892717238;
                            CompletableFuture.supplyAsync((Supplier<ms>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$show$9(z.r.U javax.swing.JTextArea ), ()Lz/r/ms;)((U)var5_5, (JTextArea)var4_4)).whenComplete((BiConsumer)(BiConsumer<ms, Throwable>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$show$11(java.util.concurrent.CompletableFuture z.r.fH javax.swing.JFrame z.r.dl z.r.cW z.r.gh javax.swing.JTextArea z.r.ms java.lang.Throwable ), (Lz/r/ms;Ljava/lang/Throwable;)V)((CompletableFuture)var6_6, (fH)var3_3, (JFrame)var7_7, (dl)var0, (cW)var1_1, (gh)var2_2, (JTextArea)var4_4));
                            var10_10 = (var8_9 | var11_8) ^ -1297679684;
                            continue block21;
                        }
                        case -295155225: {
                            var2_2.setEnabled(false);
                            var10_10 = (var8_9 | var11_8) ^ -1804618507;
                        }
lbl62:
                        // 5 sources

                        default: {
                            continue block21;
                        }
                        case 1101044509: {
                            var9_11 ^= var10_10 ^ 1364879610;
                            var10_10 = (var8_9 | var11_8) ^ 1901262182;
                            continue block21;
                        }
                        case -528970633: {
                            var9_11 ^= var10_10 ^ 1980135435;
                            ** continue;
                        }
                        case -1350470456: {
                            var10_10 = (var8_9 | var11_8) ^ 2135044342;
                            continue block21;
                        }
                        case -1937051904: {
                            var1_1.setEnabled(false);
                            continue block19;
                        }
                        case 1777397421: 
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$show$11(CompletableFuture completableFuture, fH fH2, JFrame jFrame, dl dl2, cW cW2, gh gh2, JTextArea jTextArea, ms ms2, Throwable throwable) {
        int n2 = c & 0x33A53FE1 ^ 0x3C327472;
        int n3 = 0;
        int n4 = (n2 | 0x33A53FE1) ^ 0xEE3F301C;
        n3 = (n2 | 0x33A53FE1) ^ 0xC6064646;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -105825867: {
                    break;
                }
                case 1727488830: {
                    n4 ^= n3 ^ 0x35B9F817;
                    n3 = (n2 | 0x33A53FE1) ^ 0xCF055D1A;
                    continue block5;
                }
                case -256761111: {
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
            }
            n3 = (n2 | 0x33A53FE1) ^ 0x59401CCD;
        }
    }

    private static int a(int n2, int n3) {
        int n4 = 1094513900;
        int n5 = -943303237;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xB9F9FB50)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xC7FEF166;
        n6 ^= (n5 | n4) ^ 0xC7FE6C24;
        n6 -= (n5 | n4) ^ 0xC7FE59AE;
        n6 -= (n5 | n4) ^ 0xC7FEAE80;
        n6 -= (n5 | n4) ^ 0xC7FE12EF;
        return n6 -= (n5 | n4) ^ 0xC7FE7931;
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ ms lambda$show$9(U var0, JTextArea var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [30[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * Unable to fully structure code
     */
    private static /* synthetic */ void lambda$show$8(JTextArea var0, cQ var1_1) {
        block11: {
            var6_2 = 252858568;
            var2_3 = iJ.c & 252858568 ^ -1745271103;
            var5_4 = 0;
            ** GOTO lbl23
lbl5:
            // 1 sources

            while (true) {
                iJ.setStatus(var0, iJ.a((v0 | var6_2) ^ 1053276493, (var2_3 | var6_2) ^ ((v1 | var6_2) ^ 172916740)) + var3_6 + iJ.a((v2 | var6_2) ^ 1053276492, (var2_3 | var6_2) ^ ((v3 | var6_2) ^ 116621316)), iJ.f);
                return;
            }
lbl8:
            // 1 sources

            block6: while (true) {
                var5_4 = (var2_3 | var6_2) ^ 24577537;
                block7: while (true) {
                    switch (var5_4) lbl-1000:
                    // 3 sources

                    {
                        default: {
                            continue block7;
                        }
                        case -761261293: {
                            break block11;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var5_4 = (var2_3 | var6_2) ^ -924799646;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -1634971448: {
                            var4_5 ^= var5_4 ^ 617480455;
                            var5_4 = (var2_3 | var6_2) ^ 1297827290;
                            ** GOTO lbl-1000
                        }
lbl23:
                        // 1 sources

                        var4_5 = (var2_3 | var6_2) ^ 1302738221;
                        ** continue;
                        case 1461451691: {
                            break block6;
                        }
                    }
                    break;
                }
                break;
            }
            ** while (true)
lbl28:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        ** while (true)
        var3_6 = var1_1.userCode();
        v0 = var4_5 ^= -404118426;
        v1 = var4_5;
        v2 = var4_5;
        v3 = var4_5;
        var4_5 ^= -592606449;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void lambda$show$7(dl var0, cW var1_1, JTextArea var2_2, fH var3_3, gh var4_4, U var5_5, CompletableFuture var6_6, JFrame var7_7) {
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
    private static /* synthetic */ void lambda$show$6(CompletableFuture completableFuture, gh gh2, JFrame jFrame, dl dl2, cW cW2, fH fH2, JTextArea jTextArea, ms ms2, Throwable throwable) {
        int n2 = c & 0x1735CFC1 ^ 0xF14F5CF7;
        int n3 = 0;
        int n4 = (n2 | 0x1735CFC1) ^ 0xCCF20D40;
        n3 = (n2 | 0x1735CFC1) ^ 0xA35F72CC;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1675060873: {
                    n4 ^= n3 ^ 0x74A87A6E;
                    n3 = (n2 | 0x1735CFC1) ^ 0xEFE0E957;
                    continue block5;
                }
                case 1411427643: {
                    n3 = (n2 | 0x1735CFC1) ^ 0x94A8B97E;
                    continue block5;
                }
                case 413087392: 
            }
            break;
        }
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ ms lambda$show$4(U var0, String var1_1, char[] var2_2) {
        var8_3 = -863035334;
        var5_4 = iJ.c & -863035334 ^ -1742912486;
        var7_5 = 0;
        var6_6 = (var5_4 | var8_3) ^ 1803526258;
        var7_5 = (var5_4 | var8_3) ^ 728296066;
        ** GOTO lbl14
lbl-1000:
        // 1 sources

        {
            block12: {
                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ -463324899;
                    break block12;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    Arrays.fill(var2_2, '\u0000');
                    var6_6 ^= -1945918342;
                    return var3_7;
                }
            }
            block11: while (true) {
                switch (var7_5) {
                    default: {
                        continue block11;
                    }
                    case -134771016: {
                        ** continue;
                    }
                    case 956128551: {
                        var6_6 ^= var7_5 ^ -1097233090;
                        var7_5 = (var5_4 | var8_3) ^ 874841421;
                        continue block11;
                    }
                    case -390438537: 
                }
                break;
            }
            var3_7 = var0.signIn(var1_1, var2_2);
            var6_6 ^= 621937640;
            ** continue;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$show$3(JFrame var0) {
        var1_1 = iJ.c & -1744979621 ^ 937568501;
        var3_2 = 0;
        var2_3 = (var1_1 | -1744979621) ^ 49535413;
        var3_2 = (var1_1 | -1744979621) ^ -1119001577;
        if (true) ** GOTO lbl-1000
        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 2 sources

            {
                default: {
                    continue block5;
                }
                case 179494376: {
                    var3_2 = (var1_1 | -1744979621) ^ 439280909;
                    continue block5;
                }
                case -1378788110: {
                    var2_3 ^= var3_2 ^ -777314336;
                    var3_2 = (var1_1 | -1744979621) ^ -477693175;
                    continue block5;
                }
                case 1417233142: 
            }
            break;
        }
        var0.setExtendedState(1);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$show$2(CompletableFuture var0, JFrame var1_1) {
        var5_2 = -718058169;
        var2_3 = iJ.c & -718058169 ^ -1640530498;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -988096819;
        var4_4 = (var2_3 | var5_2) ^ -46627793;
        block22: while (true) {
            switch (var4_4) {
                default: {
                    continue block22;
                }
                case -1608574208: {
                    ** break;
                }
                case 510624940: {
                    ** GOTO lbl31
                }
                case -266591054: {
                    var3_5 ^= var4_4 ^ -1252159100;
                    ** GOTO lbl69
                }
                case -1996363886: {
                    var0.completeExceptionally(new IllegalStateException(iJ.a((var3_5 | var4_4 ^ 1546824405) ^ (var4_4 ^ -305956879), (var2_3 | var4_4 ^ 1546824405) ^ ((var3_5 | var4_4 ^ 1546824405) ^ (var4_4 ^ -30775934)))));
                    ** GOTO lbl67
                }
                case 640303319: {
                    var3_5 ^= var4_4 ^ -218191949;
                    ** GOTO lbl69
                }
                case 484020660: {
                    ** GOTO lbl45
                }
                case 470119509: {
                    var3_5 ^= var4_4 ^ -314917351;
                    ** GOTO lbl45
                }
lbl29:
                // 1 sources

                var4_4 = (var2_3 | var5_2) ^ -1089873770;
                continue block22;
lbl31:
                // 1 sources

                switch (var3_5) {
                    case 460457716: {
                        var4_4 = (var2_3 | var5_2) ^ -1020130902;
                        continue block22;
                    }
                    case 319108968: {
                        var3_5 ^= var4_4 ^ 8027307;
                        ** GOTO lbl78
                    }
                    case 571472336: {
                        var4_4 = (var2_3 | var5_2) ^ 1504827034;
                        continue block22;
                    }
                    case -2037994651: {
                        var3_5 ^= var4_4 ^ 2030433916;
                        var4_4 = (var2_3 | var5_2) ^ -1521624173;
                        continue block22;
                    }
lbl45:
                    // 2 sources

                    var4_4 = (var2_3 | var5_2) ^ -1051133613;
                    continue block22;
                    case 1716816457: {
                        var3_5 ^= var4_4 ^ -1563818865;
                        ** GOTO lbl74
                    }
                    case 2054858348: {
                        if (!var0.isDone()) ** GOTO lbl59
                        ** GOTO lbl65
                    }
                    case -1545867874: {
                        var1_1.dispose();
                        ** GOTO lbl76
                    }
                    case 1371011684: {
                        var3_5 ^= var4_4 ^ 560282913;
                        ** GOTO lbl63
                    }
lbl59:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -1184630858;
                    continue block22;
                    case 1614718313: {
                        return;
                    }
lbl63:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 1446419053;
                    continue block22;
lbl65:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -869119337;
                    continue block22;
lbl67:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -1007752117;
                    continue block22;
lbl69:
                    // 2 sources

                    var4_4 = (var2_3 | var5_2) ^ 2133354239;
                    continue block22;
                    case 1373814696: {
                        var4_4 = (var2_3 | var5_2) ^ -115524312;
                        continue block22;
                    }
lbl74:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 2095878241;
                    continue block22;
lbl76:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -1904179301;
                    continue block22;
lbl78:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -1696847799;
                    continue block22;
                }
                var4_4 = (var2_3 | var5_2) ^ 791370061;
                continue block22;
                case 1173050806: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void lambda$fatal$1(String var0) {
        var1_1 = iJ.c & 2102441678 ^ -1347386565;
        var3_2 = 0;
        ** GOTO lbl11
lbl4:
        // 1 sources

        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 3 sources

            {
                default: {
                    continue block5;
                }
lbl8:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 2102441678) ^ 2137596562;
                    ** GOTO lbl-1000
                    break;
                }
lbl11:
                // 1 sources

                var2_3 = (var1_1 | 2102441678) ^ 1695867439;
                ** continue;
                case -2137418387: {
                    break block5;
                }
                case -1240368890: {
                    var2_3 ^= var3_2 ^ 1729880309;
                    var3_2 = (var1_1 | 2102441678) ^ 2043703328;
                    ** GOTO lbl-1000
                }
            }
            break;
        }
        var3_2 = (var1_1 | 2102441678) ^ 1239535353;
        ** while (true)
        {
            ** case -2044672033:
        }
lbl22:
        // 1 sources

        JOptionPane.showMessageDialog(null, var0, iJ.a((var2_3 | var3_2 ^ -76517103) ^ (var3_2 ^ 1223644863), (var1_1 | var3_2 ^ -76517103) ^ ((var2_3 | var3_2 ^ -76517103) ^ (var3_2 ^ -80965937))), 0);
    }
}

