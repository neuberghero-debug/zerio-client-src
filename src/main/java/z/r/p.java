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
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.TextAttribute;
import java.awt.font.TextLayout;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.aN;
import z.r.cG;
import z.r.fa;
import z.r.gw;
import z.r.lc;
import z.r.lj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class p {
    private static final String[] a;
    static final Color a;
    static final Color b;
    private static final float[][] a;
    static final Color c;
    static final Color d;
    static final Color e;
    static final Color f;
    static final Color g;
    static final Color h;
    static final Color i;
    static final Color j;
    static final Color k;
    private static final String a;
    private static final Object[] a;
    static final Color l;
    public static final int c;
    private static final int[] a;
    static final int a;
    static final Color m;
    static final Color n;
    static final Color o;
    static final int b;
    static final Color p;

    /*
     * Enabled aggressive block sorting
     */
    private p() {
        int n2 = c & 0x95F3A63A ^ 0x4ABE4238;
        int n3 = (n2 | 0x95F3A63A) ^ 0xBE3D6ADC;
        n3 ^= 0x98118D30;
        n3 ^= 0xECF65557;
    }

    /*
     * Enabled aggressive block sorting
     */
    static Font font(int n2, int n3) {
        int n4 = c & 0xEC6EBCED ^ 0xCA82E3C5;
        int n5 = 0;
        int n6 = (n4 | 0xEC6EBCED) ^ 0x7107BB84;
        n5 = (n4 | 0xEC6EBCED) ^ 0x55DB5A7B;
        block5: while (true) {
            switch (n5) {
                default: {
                    continue block5;
                }
                case 236830834: {
                    return new Font(z.r.p.a((n6 | n5 ^ 0xE2737C9F) ^ (n5 ^ 0xEAAE12A9), (n4 | n5 ^ 0xE2737C9F) ^ ((n6 | n5 ^ 0xE2737C9F) ^ (n5 ^ 0xE243C370))), n2, n3);
                }
                case -468954755: {
                    n6 ^= n5 ^ 0x5E15615B;
                    n5 = (n4 | 0xEC6EBCED) ^ 0xE0F33F9F;
                    continue block5;
                }
                case -1154112106: 
            }
            n5 = (n4 | 0xEC6EBCED) ^ 0xAE2AE90;
        }
    }

    /*
     * Unable to fully structure code
     */
    static Font tracked(int var0, int var1_1, double var2_2) {
        block22: {
            block23: {
                break block23;
lbl1:
                // 1 sources

                while (true) {
                    var6_6 ^= var7_5 ^ -1862147846;
                    var7_5 = (var5_4 | var8_3) ^ -522589954;
                    ** GOTO lbl22
                    break;
                }
lbl5:
                // 1 sources

                return z.r.p.font(var0, var1_1).deriveFont(var4_7);
lbl7:
                // 1 sources

                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ 1569272705;
                    break block22;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var4_7 = new HashMap<TextAttribute, Double>();
                    var7_5 = (var5_4 | var8_3) ^ 900494575;
                    break block22;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ -1157479341;
                    ** GOTO lbl22
                    break;
                }
lbl17:
                // 1 sources

                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ -1847667917;
                    break block22;
                    break;
                }
lbl20:
                // 1 sources

                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ -1761618575;
lbl22:
                    // 3 sources

                    block18: while (true) {
                        switch (var7_5) {
                            default: {
                                continue block18;
                            }
                            case 1591718756: {
                                ** continue;
                            }
                            case 84156361: {
                                ** continue;
                            }
                            ** case 1931616838:
lbl31:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
                    break;
                }
lbl32:
                // 1 sources

                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ 121918750;
                    break block22;
lbl35:
                    // 1 sources

                    while (true) {
                        var4_7.put(TextAttribute.TRACKING, var2_2);
                        ** continue;
                        break;
                    }
                    break;
                }
            }
            var8_3 = -1046661353;
            var5_4 = z.r.p.c & -1046661353 ^ 1699861558;
            var7_5 = 0;
            var6_6 = (var5_4 | var8_3) ^ -302508658;
            ** while (true)
        }
        block21: while (true) {
            switch (var7_5) {
                default: {
                    continue block21;
                }
                case 1946362884: {
                    ** continue;
                }
                case -493247959: {
                    ** continue;
                }
                case -797867048: {
                    var6_6 ^= var7_5 ^ 1732382937;
                    ** continue;
                }
                case -1202404170: 
            }
            break;
        }
        var6_6 ^= var7_5 ^ -1922861697;
        ** while (true)
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static int textWidth(String var0, Font var1_1) {
        block18: {
            break block18;
lbl1:
            // 1 sources

            block15: while (true) {
                block19: {
                    block20: {
                        switch (var5_4) {
                            case -1541304282: {
                                break block19;
                            }
                            case 822420684: {
                                return 0;
                            }
                            case 374437847: {
                                if (!var0.isEmpty()) break block20;
                                ** GOTO lbl24
                            }
                            case -195308154: {
                                if (var0 != null) {
                                    ** break;
                                }
                                ** GOTO lbl24
                            }
                            case 1625148276: {
                                var4_5 ^= var5_4 ^ 1890867001;
                                var5_4 = (var3_3 | var6_2) ^ -860161551;
                                continue block15;
                            }
                            case 409125360: {
                                var4_5 ^= var5_4 ^ -1830540800;
                                var5_4 = (var3_3 | var6_2) ^ 165939387;
                                continue block15;
                            }
lbl22:
                            // 1 sources

                            var5_4 = (var3_3 | var6_2) ^ 1503546651;
                            ** GOTO lbl25
lbl24:
                            // 2 sources

                            var5_4 = (var3_3 | var6_2) ^ -1654516151;
lbl25:
                            // 3 sources

                            default: {
                                continue block15;
                            }
                            case -199349387: {
                                return (int)Math.ceil(new TextLayout(var0, var1_1, var2_6).getAdvance());
                            }
                            case 318508603: 
                        }
                        var4_5 ^= var5_4 ^ 667727116;
                        ** break;
lbl32:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ 161609288;
                        continue;
                    }
                    var5_4 = (var3_3 | var6_2) ^ -280767738;
                    continue;
                }
                var5_4 = (var3_3 | var6_2) ^ -336680214;
                continue;
                break;
            }
        }
        var6_2 = -1112634323;
        var3_3 = z.r.p.c & -1112634323 ^ -862593736;
        var5_4 = 0;
        var4_5 = (var3_3 | var6_2) ^ -174736485;
        var5_4 = (var3_3 | var6_2) ^ 406313463;
        block16: while (true) {
            switch (var5_4) {
                default: {
                    continue block16;
                }
                case -1571361938: {
                    var2_6 = new FontRenderContext(null, true, true);
                    var5_4 = (var3_3 | var6_2) ^ -438494003;
                    ** continue;
                }
                case 1263862988: {
                    var4_5 ^= var5_4 ^ 1780679248;
                    var5_4 = (var3_3 | var6_2) ^ 1609119315;
                    continue block16;
                }
                case -444070710: 
            }
            var5_4 = (var3_3 | var6_2) ^ -1226122767;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void lockWidth(JLabel var0) {
        block19: {
            break block19;
lbl1:
            // 1 sources

            while (true) {
                var4_6 ^= 1428018864;
                var2_5 = new Dimension(var1_4, var0.getPreferredSize().height);
                var5_3 = (var3_2 | var6_1) ^ 285886878;
                if (true) ** GOTO lbl8
                block16: while (true) {
                    var5_3 = (var3_2 | var6_1) ^ 1352753356;
lbl8:
                    // 2 sources

                    block17: while (true) {
                        switch (var5_3) {
                            case -821408896: {
                                var0.setPreferredSize(var2_5);
                                ** GOTO lbl30
                            }
                            case 176178833: {
                                var4_6 ^= var5_3 ^ -900554198;
                                ** GOTO lbl32
                            }
                            case -1086002902: {
                                var0.setMaximumSize(var2_5);
                                ** break;
                            }
                            case 193918474: {
                                var0.setMinimumSize(var2_5);
                                ** GOTO lbl34
                            }
                            case -17842056: {
                                var4_6 ^= var5_3 ^ 894857817;
                                ** GOTO lbl38
                            }
lbl25:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ -446312585;
                            ** GOTO lbl39
                            case -1334065859: {
                                var4_6 ^= var5_3 ^ -737414832;
                                ** GOTO lbl36
                            }
lbl30:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ 1604209883;
                            ** GOTO lbl39
lbl32:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ 1490516958;
                            ** GOTO lbl39
lbl34:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ -1642455723;
                            ** GOTO lbl39
lbl36:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ -462716948;
                            ** GOTO lbl39
lbl38:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ 552583782;
lbl39:
                            // 7 sources

                            default: {
                                continue block17;
                            }
                            case 1912575155: {
                                var4_6 ^= var5_3 ^ 1958678582;
                                continue block16;
                            }
                            case -1221397960: 
                        }
                        break;
                    }
                    break;
                }
                return;
            }
        }
        var6_1 = -295401052;
        var3_2 = z.r.p.c & -295401052 ^ 667254854;
        var5_3 = 0;
        var4_6 = (var3_2 | var6_1) ^ 468999507;
        var5_3 = (var3_2 | var6_1) ^ 1425849577;
        block18: while (true) {
            switch (var5_3) {
                case -1155975921: {
                    var5_3 = (var3_2 | var6_1) ^ 1772049443;
                    continue block18;
                }
                case -1167539131: {
                    var1_4 = z.r.p.textWidth(var0.getText(), var0.getFont()) + 4;
                    ** continue;
                }
                case -2038768187: {
                    var4_6 ^= var5_3 ^ -32723441;
                    var5_3 = (var3_2 | var6_1) ^ 1435323811;
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static void enableAntialiasing(Graphics2D var0) {
        block53: {
            block55: {
                block54: {
                    break block55;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl3:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1055274107;
                        break block53;
                        break;
                    }
lbl6:
                    // 1 sources

                    block33: while (true) {
                        switch (var2_4) {
                            default: {
                                ** continue;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 1698382642;
                                ** GOTO lbl28
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 30267157;
                                ** GOTO lbl121
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -792427320;
                                ** GOTO lbl28
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1598118547;
                                break block33;
                                break;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -985834767;
                                break block33;
lbl25:
                                // 1 sources

                                while (true) {
                                    var0.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                                    ** GOTO lbl128
                                    break;
                                }
                                break;
                            }
lbl28:
                            // 2 sources

                            var3_3 = (var1_2 | var4_1) ^ 1660650700;
                            break block33;
                            case 1178375248: {
                                var3_3 = (var1_2 | var4_1) ^ 1873880887;
                                break block33;
                            }
lbl33:
                            // 1 sources

                            while (true) {
                                var0.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                                break block54;
                                break;
                            }
lbl36:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 511296447;
                                break block33;
lbl39:
                                // 2 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1797425188;
                                    break block33;
                                    break;
                                }
                                break;
                            }
lbl42:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1466563498;
                                break block33;
                                break;
                            }
                            case 1831492814: {
                                var3_3 = (var1_2 | var4_1) ^ -625627691;
                                break block33;
                            }
                        }
                        break;
                    }
                    break block53;
lbl49:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1927974670;
                        break block53;
                        break;
                    }
lbl52:
                    // 1 sources

                    while (true) {
                        var0.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
                        ** GOTO lbl141
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -778017373;
                break block53;
                var0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                var3_3 = (var1_2 | var4_1) ^ 1632076291;
                break block53;
lbl61:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ 546373390;
                    ** GOTO lbl116
                    break;
                }
lbl64:
                // 2 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1296801321;
                    break block53;
lbl67:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -632664536;
                        break block53;
                        break;
                    }
                    break;
                }
            }
            var4_1 = 141259983;
            var1_2 = z.r.p.c & 141259983 ^ 1038206641;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ 255757361;
            ** while (true)
lbl76:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ -47573082;
                ** GOTO lbl121
                break;
            }
        }
lbl80:
        // 3 sources

        block50: while (true) {
            switch (var3_3) lbl-1000:
            // 6 sources

            {
                while (true) {
                    default: {
                        continue block50;
                    }
                    break;
                }
                case 935971565: {
                    ** continue;
                }
                case -1456045789: {
                    ** continue;
                }
                case 1381683656: {
                    ** continue;
                }
                case -408831785: {
                    ** continue;
                }
                case -413246678: {
                    ** continue;
                }
                case 1325496817: {
                    ** continue;
                }
                case 1786907989: {
                    break block50;
                }
                case 1594913331: {
                    ** continue;
                }
                case 939595126: {
                    ** continue;
                }
                case -1162907105: {
                    ** continue;
                }
                case -120148978: {
                    ** continue;
                }
                case 1554806012: {
                    ** GOTO lbl39
                }
                case -172209653: {
                    ** continue;
                }
                case 435659749: {
                    ** continue;
                }
                case -330591396: {
                    var2_4 ^= var3_3 ^ -836019618;
                    break;
                }
lbl116:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 99279753;
                ** GOTO lbl-1000
                case -51233414: {
                    var2_4 ^= var3_3 ^ -756327245;
                    ** continue;
                }
lbl121:
                // 2 sources

                var3_3 = (var1_2 | var4_1) ^ -2025552672;
                ** GOTO lbl-1000
                case 1655352428: {
                    return;
                }
lbl125:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 605836570;
                    ** GOTO lbl-1000
                    break;
                }
lbl128:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 401497843;
                ** GOTO lbl-1000
                case 705013772: {
                    var2_4 ^= var3_3 ^ 1300074198;
                    ** continue;
                }
                case 1889560790: {
                    switch (var2_4) {
                        case 476845950: {
                            ** continue;
                        }
                        case 1860468291: {
                            ** continue;
                        }
                        ** default:
lbl140:
                        // 1 sources

                        ** continue;
                    }
                }
lbl141:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -933774092;
                ** continue;
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ -1325518017;
        ** GOTO lbl80
        {
            case -1927952960: {
                ** GOTO lbl64
            }
        }
        var3_3 = (var1_2 | var4_1) ^ 170015762;
        ** while (true)
        {
            ** case 596784448:
        }
lbl150:
        // 1 sources

        var2_4 ^= var3_3 ^ 1806170777;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    static void paintMark(Graphics2D var0, double var1_1, double var3_2, double var5_3, Color var7_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 87[UNCONDITIONALDOLOOP]
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
    static JComponent mark(int var0) {
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
    static JLabel wordmark(int var0) {
        block40: {
            block41: {
                block39: {
                    block42: {
                        break block42;
lbl1:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -336231626;
                            break block39;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -236629903;
                            break block39;
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 1491941866;
                            break block40;
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 598722969;
                            break block39;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 240493416;
                            break block39;
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_3 ^ -2012099030;
                            ** continue;
                            break;
                        }
lbl19:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_3 ^ -217265532;
                            ** continue;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 1829997735;
                            break block40;
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_3 ^ 231351799;
                            ** continue;
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            continue;
lbl32:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -472826631;
                                break block39;
                                break;
                            }
                            break;
                        }
lbl35:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_3 ^ -1890682592;
                            ** continue;
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var1_4.setForeground(z.r.p.o);
                            ** continue;
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_3 ^ -1169003678;
                            break block41;
                            break;
                        }
lbl46:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl48:
                        // 1 sources

                        return var1_4;
                        var1_4.setAlignmentX(0.0f);
                        var4_3 = (var2_2 | var5_1) ^ 1633378164;
                        break block39;
                        z.r.p.lockWidth(var1_4);
                        var4_3 = (var2_2 | var5_1) ^ -116162135;
                        break block39;
                        var1_4.setFont(z.r.p.tracked(1, var0, 0.14));
                        var4_3 = (var2_2 | var5_1) ^ -1519226868;
                        break block39;
lbl59:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -606451391;
                            break block40;
                            break;
                        }
                        var1_4 = new JLabel(z.r.p.a((var3_5 | var4_3 ^ 2016229850) ^ (var4_3 ^ 421533565), (var2_2 | var4_3 ^ 2016229850) ^ ((var3_5 | var4_3 ^ 2016229850) ^ (var4_3 ^ -124402891))));
                        var4_3 = (var2_2 | var5_1) ^ -1747932733;
                        break block39;
lbl65:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_3 ^ -603472200;
                            ** continue;
                            break;
                        }
                    }
                    var5_1 = -1759774129;
                    var2_2 = z.r.p.c & -1759774129 ^ -1479497678;
                    var4_3 = 0;
                    var3_5 = (var2_2 | var5_1) ^ 735376116;
                    ** while (true)
                }
lbl75:
                // 2 sources

                block37: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block37;
                        }
                        case 1321761750: {
                            ** continue;
                        }
                        case -1804323866: {
                            ** continue;
                        }
                        case -696212213: {
                            ** continue;
                        }
                        case 1409992326: {
                            ** continue;
                        }
                        case 1546549577: {
                            ** continue;
                        }
                        case 2046872206: {
                            ** continue;
                        }
                        case 313100915: {
                            ** continue;
                        }
                        case -1181853417: {
                            ** continue;
                        }
                        case 1178511886: {
                            ** continue;
                        }
                        ** case 537613244:
lbl98:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            var4_3 = (var2_2 | var5_1) ^ -841273103;
            ** while (true)
        }
        block38: while (true) {
            switch (var4_3) {
                default: {
                    continue block38;
                }
                case -624396584: {
                    ** continue;
                }
                case -281623659: {
                    ** continue;
                }
                ** case 1812050750:
lbl112:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static JLabel label(String var0, int var1_1, int var2_2, Color var3_3) {
        block22: {
            block23: {
                var8_4 = -2017919835;
                var5_5 = z.r.p.c & -2017919835 ^ 1294618792;
                var7_6 = 0;
                var6_8 = (var5_5 | var8_4) ^ 1574206057;
                var7_6 = (var5_5 | var8_4) ^ 12741356;
                break block23;
lbl7:
                // 1 sources

                while (true) {
                    var7_6 = (var5_5 | var8_4) ^ 1775753707;
                    break block22;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var7_6 = (var5_5 | var8_4) ^ 69979170;
                    break block23;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var7_6 = (var5_5 | var8_4) ^ -994546611;
                    break block22;
                    break;
                }
            }
            block20: while (true) {
                switch (var7_6) {
                    default: {
                        continue block20;
                    }
                    case -879677297: {
                        var4_7 = new JLabel(var0);
                        break block20;
                    }
                    case -441274742: {
                        var6_8 ^= var7_6 ^ 947469797;
                        ** continue;
                    }
                    case -814180799: {
                        var7_6 = (var5_5 | var8_4) ^ 705188391;
                        continue block20;
                    }
                }
                break;
            }
            var7_6 = (var5_5 | var8_4) ^ -1783985543;
            ** GOTO lbl63
        }
        block21: while (true) {
            switch (var7_6) {
                case -1117959002: {
                    var4_7.setFont(z.r.p.font(var2_2, var1_1));
                    var7_6 = (var5_5 | var8_4) ^ 198353837;
                    continue block21;
                }
                case -999792896: {
                    var6_8 ^= var7_6 ^ -2083589920;
                    ** break;
                }
                case 1511028436: {
                    var6_8 ^= var7_6 ^ 343011782;
                    var7_6 = (var5_5 | var8_4) ^ 1927786507;
                    continue block21;
                }
                case -1502796474: {
                    var6_8 ^= var7_6 ^ 2089560344;
                    var7_6 = (var5_5 | var8_4) ^ -1221143272;
                    continue block21;
                }
                case 618722603: {
                    var6_8 ^= var7_6 ^ -97317199;
                    ** GOTO lbl62
                }
                case -1652819813: {
                    var4_7.setForeground(var3_3);
                    var7_6 = (var5_5 | var8_4) ^ 831104471;
                    continue block21;
                }
lbl57:
                // 1 sources

                var7_6 = (var5_5 | var8_4) ^ 1388381238;
                ** GOTO lbl63
                case -30189190: {
                    var6_8 ^= var7_6 ^ -1948409909;
                    ** continue;
                }
lbl62:
                // 1 sources

                var7_6 = (var5_5 | var8_4) ^ -279321168;
lbl63:
                // 4 sources

                default: {
                    continue block21;
                }
                case 184717536: {
                    var4_7.setAlignmentX(0.0f);
                    ** continue;
                }
                case 2022451637: {
                    var4_7.setMaximumSize(new Dimension(z.r.p.a((var6_8 | var7_6 ^ -13314800) ^ (var7_6 ^ 2123754904), (var5_5 | var7_6 ^ -13314800) ^ ((var6_8 | var7_6 ^ -13314800) ^ (var7_6 ^ -1221359785))), var4_7.getPreferredSize().height));
                    var7_6 = (var5_5 | var8_4) ^ -346420858;
                    continue block21;
                }
                case 551754013: 
            }
            break;
        }
        return var4_7;
    }

    /*
     * Unable to fully structure code
     */
    static JLabel eyebrow(String var0) {
        block34: {
            block33: {
                break block33;
lbl1:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ 1182558422;
                    ** GOTO lbl66
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    z.r.p.lockWidth(var1_5);
                    ** GOTO lbl90
                    break;
                }
lbl7:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 470844751;
                    ** GOTO lbl46
lbl10:
                    // 1 sources

                    while (true) {
                        var3_4 ^= var4_3 ^ 2065898736;
                        ** GOTO lbl88
                        break;
                    }
                    break;
                }
            }
            var5_1 = -1679286533;
            var2_2 = z.r.p.c & -1679286533 ^ -829805993;
            var4_3 = 0;
            break block34;
lbl18:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 1065904690;
                ** GOTO lbl46
lbl21:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 1465131816;
                    ** GOTO lbl46
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ -1804767571;
                    ** continue;
                    break;
                }
                break;
            }
lbl27:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 507712451;
                ** GOTO lbl46
lbl30:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 2120097042;
                    ** GOTO lbl46
lbl33:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -318226426;
                        ** GOTO lbl46
                        break;
                    }
                    break;
                }
                break;
            }
        }
        var3_4 = (var2_2 | var5_1) ^ 824313597;
        var4_3 = (var2_2 | var5_1) ^ 584606931;
        if (true) ** GOTO lbl77
        block27: while (true) {
            block35: {
                var4_3 = (var2_2 | var5_1) ^ -1636261052;
                break block35;
lbl43:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ 557021859;
                    ** GOTO lbl92
                    break;
                }
            }
            block29: while (true) {
                switch (var4_3) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block29;
                        }
                        break;
                    }
                    case -1006978128: {
                        ** continue;
                    }
                    case -530426675: {
                        ** continue;
                    }
                    case 1100127675: {
                        ** continue;
                    }
                    case 1206564530: {
                        ** continue;
                    }
                    case -1582029843: {
                        var3_4 ^= var4_3 ^ 1233122332;
                        ** continue;
                    }
lbl63:
                    // 1 sources

                    while (true) {
                        var1_5 = new JLabel(var0);
                        ** continue;
                        break;
                    }
lbl66:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1076915063;
                    ** GOTO lbl77
                    case 1089260699: {
                        var1_5.setFont(z.r.p.tracked(1, z.r.p.a((var3_4 | var4_3 ^ -620440992) ^ (var4_3 ^ 853575935), (var2_2 | var4_3 ^ -620440992) ^ ((var3_4 | var4_3 ^ -620440992) ^ (var4_3 ^ -728622625))), 0.2));
                        continue block27;
                    }
                    case -2000806441: {
                        var1_5.setForeground(z.r.p.p);
                        ** continue;
                    }
                    case -1045877444: {
                        var1_5.setAlignmentX(0.0f);
                        ** continue;
                    }
lbl77:
                    // 3 sources

                    block32: while (true) {
                        switch (var4_3) {
                            default: {
                                continue block32;
                            }
                            case -1544193785: {
                                ** continue;
                            }
                            case -47031764: {
                                ** GOTO lbl94
                            }
                            case 1613081206: {
                                break;
                            }
                        }
                        ** continue;
                        break;
                    }
lbl88:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1626934684;
                    ** GOTO lbl-1000
lbl90:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1744795571;
                    ** GOTO lbl-1000
lbl92:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -596583677;
                    ** continue;
lbl94:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 2082424824;
                    ** continue;
                    case 853704441: {
                        var3_4 ^= var4_3 ^ -1340551403;
                        ** continue;
                    }
                    case 60483068: 
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
    static JLabel fieldLabel(String var0) {
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
    static void styleInput(JTextField var0, int var1_1, int var2_2) {
        block45: {
            block47: {
                block46: {
                    block44: {
                        block43: {
                            var8_3 = 1055878068;
                            var7_4 = 1422497182;
                            var6_5 = 1940463384;
                            var3_6 = z.r.p.c & 1940463384 ^ -2012961909;
                            var5_7 = 0;
                            ** GOTO lbl106
lbl7:
                            // 1 sources

                            while (true) {
                                var4_8 ^= var5_7 ^ 1476491419;
                                break block43;
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                v0 = new cG(z.r.p.i, z.r.p.a((var4_8 | var5_7 ^ var8_3) ^ (var5_7 ^ 1397485803), (var3_6 | var5_7 ^ var8_3) ^ ((var4_8 | var5_7 ^ var8_3) ^ (var5_7 ^ -2033093758))), 1.4f);
                                v1 = z.r.p.a((var4_8 | var5_7 ^ var8_3) ^ (var5_7 ^ 1397485796), (var3_6 | var5_7 ^ var8_3) ^ ((var4_8 | var5_7 ^ var8_3) ^ (var5_7 ^ 1546361716)));
                                v2 = z.r.p.a((var4_8 | var5_7 ^ var8_3) ^ (var5_7 ^ 1397485797), (var3_6 | var5_7 ^ var8_3) ^ ((var4_8 | var5_7 ^ var8_3) ^ (var5_7 ^ 5206526)));
                                v3 = z.r.p.a((var4_8 | var5_7 ^ var8_3) ^ (var5_7 ^ 1397485798), (var3_6 | var5_7 ^ var8_3) ^ ((var4_8 | var5_7 ^ var8_3) ^ (var5_7 ^ 2100991849)));
                                v4 = z.r.p.a((var4_8 | var5_7 ^ var8_3) ^ (var5_7 ^ 1397485799), (var3_6 | var5_7 ^ var8_3) ^ ((var4_8 | var5_7 ^ var8_3) ^ (var5_7 ^ -957035573)));
                                ** GOTO lbl91
                                break;
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                var5_7 = (var3_6 | var6_5) ^ -1226061001;
                                break block44;
lbl20:
                                // 1 sources

                                while (true) {
                                    var4_8 ^= var5_7 ^ 1782092746;
                                    break block45;
                                    break;
                                }
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                var5_7 = (var3_6 | var6_5) ^ -685351553;
                                break block44;
lbl26:
                                // 1 sources

                                while (true) {
                                    var4_8 ^= var5_7 ^ 628637797;
                                    ** GOTO lbl109
                                    break;
                                }
lbl29:
                                // 1 sources

                                while (true) {
                                    var4_8 ^= var5_7 ^ -1427106291;
                                    ** GOTO lbl96
                                    break;
                                }
                                break;
                            }
lbl32:
                            // 1 sources

                            while (true) {
                                var5_7 = (var3_6 | var6_5) ^ -130051202;
                                break block44;
lbl35:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl37:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl41:
                                // 1 sources

                                while (true) {
                                    var5_7 = (var3_6 | var6_5) ^ -1452782684;
                                    break block44;
                                    break;
                                }
                                var0.setFont(z.r.p.font(0, z.r.p.a((var4_8 | var5_7 ^ -1309141820) ^ (var5_7 ^ 1477111609), (var3_6 | var5_7 ^ -1309141820) ^ ((var4_8 | var5_7 ^ -1309141820) ^ (var5_7 ^ 996708934)))));
                                var5_7 = (var3_6 | var6_5) ^ -1055700278;
                                break block44;
lbl47:
                                // 1 sources

                                while (true) {
                                    var5_7 = (var3_6 | var6_5) ^ -166494558;
                                    break block44;
lbl50:
                                    // 1 sources

                                    while (true) {
                                        var4_8 ^= var5_7 ^ -1610511403;
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        var5_7 = (var3_6 | var6_5) ^ 972862535;
                        break block44;
lbl56:
                        // 1 sources

                        while (true) {
                            var4_8 ^= var5_7 ^ -1372823134;
                            break block46;
                            break;
                        }
lbl59:
                        // 1 sources

                        while (true) {
                            var0.setCaretColor(z.r.p.o);
                            ** GOTO lbl89
                            break;
                        }
                    }
lbl63:
                    // 10 sources

                    block39: while (true) {
                        block0 : switch (var5_7) lbl-1000:
                        // 6 sources

                        {
                            default: {
                                continue block39;
                            }
                            case 59911397: {
                                ** continue;
                            }
                            case 1296463020: {
                                ** continue;
                            }
                            case 2051867949: {
                                ** continue;
                            }
                            case 1897602892: {
                                ** continue;
                            }
                            case -1097690643: {
                                ** continue;
                            }
                            case -1034875940: {
                                ** continue;
                            }
                            case 747365092: {
                                ** continue;
                            }
                            case -1816235963: {
                                ** continue;
                            }
                            case 230605113: {
                                ** continue;
                            }
                            case -928073544: {
                                ** continue;
                            }
                            case -395713373: {
                                ** continue;
                            }
lbl89:
                            // 1 sources

                            var5_7 = (var3_6 | var6_5) ^ -2115978570;
                            ** GOTO lbl-1000
lbl91:
                            // 1 sources

                            var4_8 ^= 524968042;
                            ** GOTO lbl98
lbl93:
                            // 1 sources

                            while (true) {
                                var0.setBorder(BorderFactory.createCompoundBorder(v0, BorderFactory.createEmptyBorder(v1, v2, v3, v4)));
                                break block0;
                                break;
                            }
lbl96:
                            // 1 sources

                            var5_7 = (var3_6 | var6_5) ^ 83847476;
                            ** GOTO lbl-1000
lbl98:
                            // 1 sources

                            var4_8 ^= 610600087;
                            ** continue;
                            case 75245371: {
                                var0.setBackground(z.r.p.m);
                                break block47;
                            }
                            case -513451091: {
                                var4_8 ^= var5_7 ^ 1349198757;
                                break block39;
                            }
lbl106:
                            // 1 sources

                            var4_8 = (var3_6 | var6_5) ^ -1269343692;
                            var5_7 = (var3_6 | var6_5) ^ 937704845;
                            ** GOTO lbl-1000
lbl109:
                            // 1 sources

                            var5_7 = (var3_6 | var6_5) ^ 1746128862;
                            ** GOTO lbl-1000
                            case 1388704831: {
                                return;
                            }
                            case 660638342: {
                                var0.setSelectionColor(new Color(z.r.p.a((var4_8 | var5_7 ^ var7_4) ^ (var5_7 ^ -1116877247), (var3_6 | var5_7 ^ var7_4) ^ ((var4_8 | var5_7 ^ var7_4) ^ (var5_7 ^ 2070577863))), z.r.p.a((var4_8 | var5_7 ^ var7_4) ^ (var5_7 ^ -1116877242), (var3_6 | var5_7 ^ var7_4) ^ ((var4_8 | var5_7 ^ var7_4) ^ (var5_7 ^ -218568586))), z.r.p.a((var4_8 | var5_7 ^ var7_4) ^ (var5_7 ^ -1116877241), (var3_6 | var5_7 ^ var7_4) ^ ((var4_8 | var5_7 ^ var7_4) ^ (var5_7 ^ 1078918012)))));
                                break;
                            }
                        }
                        break;
                    }
                    var5_7 = (var3_6 | var6_5) ^ -3041120;
                    ** GOTO lbl63
                }
                var5_7 = (var3_6 | var6_5) ^ 331635512;
                ** GOTO lbl63
            }
            var5_7 = (var3_6 | var6_5) ^ -1967742761;
            ** GOTO lbl63
            {
                case -867597802: {
                    var5_7 = (var3_6 | var6_5) ^ -1221774942;
                    ** GOTO lbl-1000
                }
            }
            var5_7 = (var3_6 | var6_5) ^ -1550827197;
            ** GOTO lbl63
lbl129:
            // 1 sources

            while (true) {
                var5_7 = (var3_6 | var6_5) ^ -1927149666;
                ** GOTO lbl63
                break;
            }
        }
        var5_7 = (var3_6 | var6_5) ^ -590531299;
        ** GOTO lbl63
        {
            case 985593169: {
                var4_8 ^= var5_7 ^ -825650182;
                ** continue;
            }
            case -11348305: {
                z.r.p.fixed(var0, var1_1, var2_2);
                ** continue;
            }
        }
        var0.setOpaque(false);
        var5_7 = (var3_6 | var6_5) ^ 449373238;
        ** GOTO lbl63
        {
            case 1480457944: {
                var4_8 ^= var5_7 ^ 0x11D91191;
                ** continue;
            }
        }
        var5_7 = (var3_6 | var6_5) ^ 1161768566;
        ** GOTO lbl63
        var0.setForeground(z.r.p.o);
        var5_7 = (var3_6 | var6_5) ^ 855836451;
        ** while (true)
        {
            case 1283493433: {
                var4_8 ^= var5_7 ^ -209685748;
                ** continue;
            }
            ** case 1989130245:
        }
lbl156:
        // 1 sources

        var0.setSelectedTextColor(z.r.p.o);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static JTextField input(int var0, int var1_1) {
        block14: {
            var6_2 = -1709081363;
            var3_3 = z.r.p.c & -1709081363 ^ 1305215783;
            var5_4 = 0;
            var4_6 = (var3_3 | var6_2) ^ 528624706;
            var5_4 = (var3_3 | var6_2) ^ -1521255909;
            if (true) ** GOTO lbl-1000
lbl7:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -1443492911;
                break block14;
                break;
            }
            block12: while (true) {
                block15: {
                    switch (var5_4) lbl-1000:
                    // 2 sources

                    {
                        default: {
                            continue block12;
                        }
                        case 2059273716: {
                            break;
                        }
                        case 273765179: {
                            var2_5 = new aN();
                            var5_4 = (var3_3 | var6_2) ^ 1582649276;
                            break block12;
                        }
                        case 428915263: {
                            var4_6 ^= var5_4 ^ -124968831;
                            break block15;
                        }
                    }
                    var5_4 = (var3_3 | var6_2) ^ -964835888;
                    continue;
                }
                var5_4 = (var3_3 | var6_2) ^ -809751340;
            }
        }
        block13: while (true) {
            switch (var5_4) {
                default: {
                    continue block13;
                }
                case -2118635437: {
                    var4_6 ^= var5_4 ^ -326674707;
                    var5_4 = (var3_3 | var6_2) ^ -1659650738;
                    continue block13;
                }
                case 1981510718: {
                    var4_6 ^= var5_4 ^ 216753670;
                    var5_4 = (var3_3 | var6_2) ^ -1873413795;
                    continue block13;
                }
                case 1123992225: {
                    z.r.p.styleInput(var2_5, var0, var1_1);
                    ** continue;
                }
                case 1337493170: 
            }
            break;
        }
        return var2_5;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static JPasswordField passwordInput(int n2, int n3) {
        int n4 = -1491463619;
        int n5 = c & 0xA71A123D ^ 0x16E72517;
        int n6 = 0;
        int n7 = (n5 | n4) ^ 0x18B3919C;
        n6 = (n5 | n4) ^ 0x6BF12FA3;
        boolean bl2 = true;
        block11: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n6 = (n5 | n4) ^ 0xA57AE19;
            }
            block12: while (true) {
                switch (n6) {
                    default: {
                        continue block12;
                    }
                    case -603055972: {
                        n6 = (n5 | n4) ^ 0x8726777E;
                        continue block12;
                    }
                    case 819544129: {
                        n7 ^= n6 ^ 0xE85A7893;
                        continue block11;
                    }
                    case -1113024218: 
                }
                break;
            }
            break;
        }
        lc lc2 = new lc();
        n6 = (n5 | n4) ^ 0x50C37BA1;
        boolean bl3 = true;
        block13: while (true) {
            if (!bl3 || (bl3 = false) || !true) {
                n6 = (n5 | n4) ^ 0x2C4D3404;
            }
            block14: while (true) {
                switch (n6) {
                    default: {
                        continue block14;
                    }
                    case -885364958: {
                        z.r.p.styleInput(lc2, n2, n3);
                        n6 = (n5 | n4) ^ 0xCDEC94BC;
                        continue block14;
                    }
                    case 2048107395: {
                        n7 ^= n6 ^ 0x2AC6225E;
                        continue block13;
                    }
                    case -415478626: {
                        n7 ^= n6 ^ 0x7ABF184B;
                        n6 = (n5 | n4) ^ 0x7CC5501D;
                        continue block14;
                    }
                    case -1682832581: 
                }
                break;
            }
            break;
        }
        return lc2;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static JButton primaryButton(String var0, int var1_1, int var2_2) {
        var7_3 = 1484537129;
        var4_4 = z.r.p.c & 1484537129 ^ 2092260902;
        var6_5 = 0;
        var5_7 = (var4_4 | var7_3) ^ -668560258;
        var6_5 = (var4_4 | var7_3) ^ 942791894;
        if (true) ** GOTO lbl25
        block11: while (true) {
            switch (var6_5) {
                case 1628795080: {
                    var5_7 ^= var6_5 ^ -1914872551;
                    ** break;
                }
                case 1671470937: {
                    z.r.p.fixed(var3_6, var1_1, var2_2);
                    ** break;
                }
lbl15:
                // 1 sources

                var6_5 = (var4_4 | var7_3) ^ 199084757;
                continue block11;
                case 219406781: {
                    var5_7 ^= var6_5 ^ -1372688810;
                    var6_5 = (var4_4 | var7_3) ^ 526246006;
                }
lbl20:
                // 3 sources

                default: {
                    continue block11;
                }
lbl22:
                // 1 sources

                var6_5 = (var4_4 | var7_3) ^ 501747687;
                continue block11;
lbl-1000:
                // 1 sources

                {
                    var6_5 = (var4_4 | var7_3) ^ 1253296818;
lbl25:
                    // 2 sources

                    block14: while (true) {
                        switch (var6_5) {
                            default: {
                                continue block14;
                            }
                            case 911127965: {
                                var3_6 = new lj(var0, true);
                                var6_5 = (var4_4 | var7_3) ^ 1911463570;
                                ** GOTO lbl20
                            }
                            case 1154262009: {
                                var6_5 = (var4_4 | var7_3) ^ -1467778569;
                                continue block14;
                            }
                            case -729938216: 
                        }
                        break;
                    }
                    var5_7 ^= var6_5 ^ -1330026068;
                    ** while (true)
                }
                case 1998632442: 
            }
            break;
        }
        return var3_6;
    }

    private static int a(int n2, int n3) {
        int n4 = 1794270335;
        int n5 = -1154831032;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x121ED6E5)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xFBFA75F3;
        n6 ^= (n5 | n4) ^ 0xFBFAD74A;
        n6 ^= (n5 | n4) ^ 0xFBFAE9BA;
        n6 ^= (n5 | n4) ^ 0xFBFAB5F9;
        n6 += (n5 | n4) ^ 0xFBFA84C2;
        n6 += (n5 | n4) ^ 0xFBFA28DF;
        n6 += (n5 | n4) ^ 0xFBFA3473;
        return n6 -= (n5 | n4) ^ 0xFBFA5B1A;
    }

    /*
     * Exception decompiling
     */
    static JButton secondaryButton(String var0, int var1_1, int var2_2) {
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
    static JComponent divider(String var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
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
    private static JComponent rule() {
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
    static void fixed(JComponent var0, int var1_1, int var2_2) {
        var7_3 = -1842257664;
        var4_4 = z.r.p.c & -1842257664 ^ 1913016029;
        var6_5 = 0;
        var5_6 = (var4_4 | var7_3) ^ 1597136863;
        var6_5 = (var4_4 | var7_3) ^ 222249159;
        block17: while (true) {
            switch (var6_5) {
                case -16240870: {
                    var6_5 = (var4_4 | var7_3) ^ -267789750;
                    continue block17;
                }
                case 37664151: {
                    var5_6 ^= var6_5 ^ 563300740;
                    var6_5 = (var4_4 | var7_3) ^ 2012171225;
                }
                default: {
                    continue block17;
                }
                case -2049432572: 
            }
            break;
        }
        var3_7 = new Dimension(var1_1, var2_2);
        var6_5 = (var4_4 | var7_3) ^ -107799803;
        if (true) ** GOTO lbl-1000
        while (true) {
            var6_5 = (var4_4 | var7_3) ^ 1321075741;
            ** GOTO lbl28
lbl23:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ -1941851948;
                if (true) ** GOTO lbl28
                break;
            }
            block20: while (true) {
                var6_5 = (var4_4 | var7_3) ^ -779201341;
lbl28:
                // 3 sources

                block21: while (true) {
                    switch (var6_5) lbl-1000:
                    // 2 sources

                    {
                        default: {
                            continue block21;
                        }
                        case 2050171652: {
                            var0.setAlignmentX(0.0f);
                            var6_5 = (var4_4 | var7_3) ^ 1131687535;
                            continue block21;
                        }
                        case 2121719561: {
                            var5_6 ^= var6_5 ^ -1255078651;
                            var6_5 = (var4_4 | var7_3) ^ -656419296;
                            continue block21;
                        }
                        case 1573171325: {
                            var5_6 ^= var6_5 ^ 623923424;
                            var6_5 = (var4_4 | var7_3) ^ -2012984103;
                            continue block21;
                        }
                        case -1131844672: {
                            var0.setPreferredSize(var3_7);
                            ** continue;
                        }
                        case 2114536524: {
                            var5_6 ^= var6_5 ^ 887650935;
                            var6_5 = (var4_4 | var7_3) ^ 1900782713;
                            continue block21;
                        }
                        case -2088973404: {
                            var0.setMaximumSize(var3_7);
                            var6_5 = (var4_4 | var7_3) ^ -1342972000;
                            continue block21;
                        }
                        case 719895037: {
                            var0.setMinimumSize(var3_7);
                            var6_5 = (var4_4 | var7_3) ^ -1942082671;
                            continue block21;
                        }
                        case -1320992334: {
                            var5_6 ^= var6_5 ^ 107256418;
                            continue block20;
                        }
                        case 599341854: {
                            return;
                        }
                        case 195327192: 
                    }
                    break;
                }
                break;
            }
            var5_6 ^= var6_5 ^ 2094338342;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static gw frame(String var0, int var1_1, int var2_2) {
        block80: {
            block81: {
                block77: {
                    block79: {
                        block78: {
                            var11_3 = -1681353428;
                            var8_4 = z.r.p.c & -1681353428 ^ -1842703981;
                            var10_5 = 0;
                            var9_9 = (var8_4 | var11_3) ^ 1227248510;
                            var10_5 = (var8_4 | var11_3) ^ 1956287315;
                            if (true) ** GOTO lbl204
                            while (true) {
                                var10_5 = (var8_4 | var11_3) ^ 1520650991;
                                break block77;
lbl10:
                                // 1 sources

                                while (true) {
                                    var10_5 = (var8_4 | var11_3) ^ 1309864781;
                                    break block77;
                                    break;
                                }
                                break;
                            }
lbl13:
                            // 2 sources

                            while (true) {
                                var10_5 = (var8_4 | var11_3) ^ 1975507213;
                                break block78;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var10_5 = (var8_4 | var11_3) ^ -1676839352;
                                break block78;
                                while (true) {
                                    var10_5 = (var8_4 | var11_3) ^ 1743018500;
                                    break block78;
                                    break;
                                }
                                break;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                var10_5 = (var8_4 | var11_3) ^ 1549944067;
                                break block79;
lbl25:
                                // 1 sources

                                while (true) {
                                    var10_5 = (var8_4 | var11_3) ^ 70585576;
                                    break block80;
                                    break;
                                }
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var10_5 = (var8_4 | var11_3) ^ 846985836;
                                ** GOTO lbl77
                                break;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                var10_5 = (var8_4 | var11_3) ^ -1399382591;
                                break block79;
                                break;
                            }
lbl34:
                            // 1 sources

                            while (true) {
                                var10_5 = (var8_4 | var11_3) ^ 1641968387;
                                break block77;
                                break;
                            }
lbl37:
                            // 1 sources

                            while (true) {
                                var10_5 = (var8_4 | var11_3) ^ -1097481185;
                                if (true) ** GOTO lbl77
                                break;
                            }
                        }
                        while (true) {
                            switch (var10_5) {
                                case 1316294559: {
                                    var9_9 ^= var10_5 ^ -1387202304;
                                    ** break;
                                }
                                case 666122814: {
                                    if (!var4_7) ** continue;
                                    ** GOTO lbl58
                                }
lbl49:
                                // 1 sources

                                var10_5 = (var8_4 | var11_3) ^ -1134645375;
                                break;
                                case 1979215778: {
                                    var3_6.setBackground(z.r.p.k);
                                    ** GOTO lbl13
                                }
                                case 132637687: {
                                    var5_8 = new fa(var4_7);
                                    var10_5 = (var8_4 | var11_3) ^ -1418973606;
                                    ** GOTO lbl183
                                }
lbl58:
                                // 1 sources

                                var10_5 = (var8_4 | var11_3) ^ -1948243702;
                                break;
                                case -66138181: {
                                    var9_9 ^= var10_5 ^ 545944387;
                                    var10_5 = (var8_4 | var11_3) ^ -300746211;
                                    break;
                                }
                                case 1446837465: {
                                    var3_6.setBackground(new Color(0, 0, 0, 0));
                                    ** continue;
                                }
                                case 269139125: {
                                    var9_9 ^= var10_5 ^ -863109043;
                                    var10_5 = (var8_4 | var11_3) ^ -841586330;
                                    break;
                                }
                                case -296399694: {
                                    var9_9 ^= var10_5 ^ -1786785787;
                                    ** continue;
                                }
                            }
lbl74:
                            // 6 sources

                        }
                        block66: while (true) {
                            var10_5 = (var8_4 | var11_3) ^ 333597004;
lbl77:
                            // 3 sources

                            block67: while (true) {
                                switch (var10_5) {
                                    case -2129573868: {
                                        var9_9 ^= var10_5 ^ 1242284399;
                                        ** GOTO lbl113
                                    }
                                    case -1014739693: {
                                        var7_11.setLayout(new BoxLayout(var7_11, 1));
                                        ** break;
                                    }
                                    case 1247237267: {
                                        var9_9 ^= var10_5 ^ -1789619957;
                                        var10_5 = (var8_4 | var11_3) ^ 1421661503;
                                        continue block67;
                                    }
                                    case -1450086445: {
                                        var7_11.setOpaque(false);
                                        continue block66;
                                    }
                                    case -1667921060: {
                                        var9_9 ^= var10_5 ^ 2115235725;
                                        ** GOTO lbl115
                                    }
                                    case -2012685069: {
                                        var9_9 ^= var10_5 ^ -1364036046;
                                        ** break;
                                    }
                                    case 405500673: {
                                        var9_9 ^= var10_5 ^ 2116463508;
                                        ** continue;
                                    }
                                    case -816430976: {
                                        var5_8.add((Component)var7_11, z.r.p.a((var9_9 | var10_5 ^ 1419695532) ^ (var10_5 ^ 502520735), (var8_4 | var10_5 ^ 1419695532) ^ ((var9_9 | var10_5 ^ 1419695532) ^ (var10_5 ^ 220749843))));
                                        var10_5 = (var8_4 | var11_3) ^ 125771491;
                                        break;
                                    }
lbl105:
                                    // 1 sources

                                    var10_5 = (var8_4 | var11_3) ^ 452713899;
                                    break;
                                    case -1233736738: {
                                        var3_6.setContentPane(var5_8);
                                        var10_5 = (var8_4 | var11_3) ^ 303053292;
                                        break;
                                    }
lbl111:
                                    // 1 sources

                                    var10_5 = (var8_4 | var11_3) ^ 1483659436;
                                    continue block67;
lbl113:
                                    // 1 sources

                                    var10_5 = (var8_4 | var11_3) ^ -2105230918;
                                    continue block67;
lbl115:
                                    // 1 sources

                                    var10_5 = (var8_4 | var11_3) ^ 765214305;
                                    continue block67;
                                    case -1980060589: {
                                        var9_9 ^= var10_5 ^ 1629594081;
                                        ** continue;
                                    }
                                    case 426650629: {
                                        var7_11.setBorder(BorderFactory.createEmptyBorder(var2_2, var2_2, var2_2 - 4, var2_2));
                                        var10_5 = (var8_4 | var11_3) ^ -776093396;
                                        continue block67;
                                    }
                                    case 629100960: {
                                        return new gw(var3_6, var7_11, var1_1);
                                    }
                                }
lbl126:
                                // 5 sources

                            }
                            break;
                        }
lbl127:
                        // 1 sources

                        while (true) {
                            var10_5 = (var8_4 | var11_3) ^ 546542632;
                            break block77;
                            break;
                        }
lbl130:
                        // 1 sources

                        while (true) {
                            var10_5 = (var8_4 | var11_3) ^ -100017257;
                            break block77;
                            break;
                        }
                    }
                    block71: while (true) {
                        block82: {
                            switch (var10_5) {
                                default: {
                                    continue block71;
                                }
                                case -198367116: {
                                    var3_6.setUndecorated(true);
                                    ** GOTO lbl156
                                }
                                case 930973822: {
                                    var4_7 = z.r.p.perPixelTranslucent();
                                    ** break;
                                }
                                case -947334980: {
                                    var9_9 ^= var10_5 ^ -1482537744;
                                    break block82;
                                }
                                case -665972625: {
                                    var9_9 ^= var10_5 ^ -965208632;
                                    ** continue;
                                }
lbl150:
                                // 1 sources

                                var10_5 = (var8_4 | var11_3) ^ -710960608;
                                ** GOTO lbl74
                                case -1135136504: {
                                    var3_6.setResizable(false);
                                    var10_5 = (var8_4 | var11_3) ^ 1134855632;
                                    continue block71;
                                }
lbl156:
                                // 1 sources

                                var10_5 = (var8_4 | var11_3) ^ 211867326;
                                continue block71;
                                case -1756740863: 
                            }
                            var9_9 ^= var10_5 ^ -844515500;
                            var10_5 = (var8_4 | var11_3) ^ 666739895;
                            continue;
                        }
                        var10_5 = (var8_4 | var11_3) ^ 1875361227;
                    }
                }
                block72: while (true) {
                    switch (var10_5) {
                        case 814136293: {
                            var9_9 ^= var10_5 ^ -1712665994;
                            ** continue;
                        }
                        case -1926165468: {
                            var9_9 ^= var10_5 ^ 2048699227;
                            ** continue;
                        }
                        case -97196356: {
                            var9_9 ^= var10_5 ^ -1071147791;
                            ** continue;
                        }
                        case -1149697641: {
                            var5_8.setLayout(new BorderLayout());
                            ** break;
                        }
                        case -1052123312: {
                            var9_9 ^= var10_5 ^ -77943523;
                            var10_5 = (var8_4 | var11_3) ^ -1268914805;
                        }
lbl183:
                        // 3 sources

                        default: {
                            continue block72;
                        }
lbl185:
                        // 1 sources

                        var10_5 = (var8_4 | var11_3) ^ 383490459;
                        continue block72;
                        case 1642286632: {
                            if (!var4_7) ** continue;
                            ** continue;
                        }
                        case 800550964: {
                            v0 = 0;
                            break block81;
                        }
                        case -705141006: 
                    }
                    break;
                }
                v0 = z.r.p.a((var9_9 | var10_5 ^ 1311831006) ^ (var10_5 ^ -2084134188), (var8_4 | var10_5 ^ 1311831006) ^ ((var9_9 | var10_5 ^ 1311831006) ^ (var10_5 ^ 679834042)));
            }
            var9_9 ^= -720825962;
            var6_10 = v0;
            ** while (true)
lbl199:
            // 1 sources

            while (true) {
                var10_5 = (var8_4 | var11_3) ^ 94392287;
                break block80;
                break;
            }
            while (true) {
                var10_5 = (var8_4 | var11_3) ^ -828019127;
lbl204:
                // 2 sources

                block75: while (true) {
                    switch (var10_5) {
                        default: {
                            continue block75;
                        }
                        case -277870868: {
                            var10_5 = (var8_4 | var11_3) ^ 722797479;
                            continue block75;
                        }
                        case 1431305206: {
                            var3_6 = new JFrame(var0);
                            ** continue;
                        }
                        case -1325427176: 
                    }
                    break;
                }
                var9_9 ^= var10_5 ^ 1242019998;
            }
        }
        block76: while (true) {
            switch (var10_5) {
                default: {
                    continue block76;
                }
                case -1612736169: {
                    var9_9 ^= var10_5 ^ 748852050;
                    var10_5 = (var8_4 | var11_3) ^ 1587289323;
                    continue block76;
                }
                case -982087340: {
                    var5_8.setBorder(BorderFactory.createEmptyBorder(var6_10, var6_10, var6_10, var6_10));
                    var10_5 = (var8_4 | var11_3) ^ 1133231032;
                    continue block76;
                }
                case -1639261600: {
                    var7_11 = new JPanel();
                    var10_5 = (var8_4 | var11_3) ^ -2084444482;
                    ** GOTO lbl126
                }
                case -664719865: 
            }
            break;
        }
        var9_9 ^= var10_5 ^ 470401159;
        ** while (true)
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean perPixelTranslucent() {
        var4 = -579028252;
        var1_1 = z.r.p.c & -579028252 ^ -242120725;
        var3_2 = 0;
        var2_3 = (var1_1 | var4) ^ 883677943;
        var3_2 = (var1_1 | var4) ^ -38463415;
        if (true) ** GOTO lbl9
        {
            block7: while (true) {
                var3_2 = (var1_1 | var4) ^ -1218264138;
lbl9:
                // 2 sources

                block8: while (true) {
                    switch (var3_2) {
                        default: {
                            continue block8;
                        }
                        case 4761510: {
                            continue block7;
                        }
                        case 1251966041: {
                            var2_3 ^= var3_2 ^ 501178957;
                            var3_2 = (var1_1 | var4) ^ 1732269056;
                            continue block8;
                        }
                        case -1698829329: 
                    }
                    break;
                }
                break;
            }
            var2_3 ^= 987767838;
            var0_4 = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
            var2_3 ^= 2049809935;
            var2_3 ^= 505321545;
            return var0_4.isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency.PERPIXEL_TRANSLUCENT);
        }
    }

    /*
     * Exception decompiling
     */
    private static void paintRoundedBackground(JComponent var0, Graphics var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [19[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
}

