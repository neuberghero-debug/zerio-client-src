/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.W;
import z.r.bN;
import z.r.bq;
import z.r.bw;
import z.r.ca;
import z.r.eD;
import z.r.fc;
import z.r.fk;
import z.r.gj;
import z.r.gu;
import z.r.iI;
import z.r.ij;
import z.r.jA;
import z.r.jq;
import z.r.li;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class lD
extends gu {
    private final eD a;
    private static final /* synthetic */ String a;
    private static final DateTimeFormatter a;
    private static final float a;
    private float b;
    private float c;
    private float d;
    public static final int b;
    private float e;
    private final iI a;
    private boolean a;
    private static final /* synthetic */ String b;
    private float f;
    private final iI b;
    private static final /* synthetic */ String c;
    private static final int[] a;
    private final List<float[]> a;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final float g;
    private static final long a;
    private float i;
    private int a;
    private static final float j;
    private final List<li> b;
    private float k;
    private float l;

    /*
     * Exception decompiling
     */
    public lD(bw var1_1) {
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
    @Override
    public void onShow() {
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
    @Override
    public boolean isModal() {
        int n2 = b & 0xCFA938B5 ^ 0x6ED02F8F;
        int n3 = 0;
        int n4 = (n2 | 0xCFA938B5) ^ 0x642E6FB1;
        n3 = (n2 | 0xCFA938B5) ^ 0x90367B50;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 2144290031: {
                    n3 = (n2 | 0xCFA938B5) ^ 0x7DE97E06;
                    continue block5;
                }
                case -1844428359: {
                    n4 ^= n3 ^ 0xF175565F;
                    n3 = (n2 | 0xCFA938B5) ^ 0x88AE9E8C;
                    continue block5;
                }
                case 1733796147: 
            }
            break;
        }
        return this.a.isModal();
    }

    /*
     * Exception decompiling
     */
    @Override
    public void render(W var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH], 69[UNCONDITIONALDOLOOP]], but top level block is 9[SWITCH]
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
     * Enabled aggressive block sorting
     */
    @Override
    public void renderOverlay(W w2) {
        int n2 = 169032901;
        int n3 = b & 0xA133CC5 ^ 0x59EEA03A;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x7242374E;
        n4 = (n3 | n2) ^ 0x6E39883A;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1619444139: {
                    n5 ^= n4 ^ 0xB4A511DC;
                    n4 = (n3 | n2) ^ 0x6D497413;
                    continue block7;
                }
                case -345007718: {
                    return;
                }
                case 917948652: {
                    this.a.renderMenu(w2);
                    n4 = (n3 | n2) ^ 0x6174242F;
                    continue block7;
                }
                case 902182085: {
                    n4 = (n3 | n2) ^ 0xC48682AA;
                    continue block7;
                }
                case 982227152: 
            }
            n5 ^= n4 ^ 0x3A616BE3;
            n4 = (n3 | n2) ^ 0xB0902565;
        }
    }

    /*
     * Exception decompiling
     */
    private void DV(W var1_1, bN var2_2, long var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[SWITCH], 80[UNCONDITIONALDOLOOP]], but top level block is 23[SWITCH]
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
    private void DW(W var1_1) {
        block22: {
            block23: {
                block24: {
                    break block24;
lbl1:
                    // 1 sources

                    while (true) {
                        var1_1.textCentered(v0, var2_6, var3_7 + var1_1.s(15.0f), var1_1.s(13.0f), lD.Ei((v1 | var8_3) ^ -1638555699, (var5_4 | var8_3) ^ ((v2 | var8_3) ^ -1474233736)));
                        var7_5 = (var5_4 | var8_3) ^ 284965127;
                        break block22;
                        break;
                    }
lbl5:
                    // 1 sources

                    while (true) {
                        var6_9 ^= -425301579;
                        var3_7 = this.e + this.k / 2.0f;
                        var6_9 ^= 167329154;
                        var4_8 = ca.get();
                        var7_5 = (var5_4 | var8_3) ^ 1252836209;
                        break block22;
                        break;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        v0 = "https://trillium.solutions";
                        break block23;
                        break;
                    }
                }
                var9_2 = -1481203893;
                var8_3 = 2032722422;
                var5_4 = lD.b & 2032722422 ^ 278530205;
                var7_5 = 0;
                var6_9 = (var5_4 | var8_3) ^ -150650760;
                var7_5 = (var5_4 | var8_3) ^ 1827541354;
                block16: while (true) {
                    switch (var7_5) {
                        default: {
                            continue block16;
                        }
                        case 357890197: {
                            var7_5 = (var5_4 | var8_3) ^ -733742437;
                            continue block16;
                        }
                        case -306274471: {
                            var2_6 = this.c + this.b / 2.0f;
                            ** continue;
                        }
                        case -1376185500: 
                    }
                    var6_9 ^= var7_5 ^ -218840279;
                    var7_5 = (var5_4 | var8_3) ^ -1811646810;
                }
lbl36:
                // 1 sources

                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ -1490774206;
                    break block22;
                    break;
                }
            }
lbl40:
            // 2 sources

            while (true) {
                var6_9 ^= -877911792;
                v1 = var6_9 ^= -653749899;
                v2 = var6_9;
                var6_9 ^= -2114241618;
                ** continue;
                break;
            }
lbl46:
            // 1 sources

            while (true) {
                var7_5 = (var5_4 | var8_3) ^ 1438193404;
                break block22;
                break;
            }
            while (true) {
                var6_9 ^= 1483639104;
                ** continue;
                break;
            }
        }
        block21: while (true) {
            switch (var7_5) {
                default: {
                    continue block21;
                }
                case 857090702: {
                    var6_9 ^= var7_5 ^ -1225929553;
                    ** continue;
                }
                case -434852068: {
                    var6_9 ^= var7_5 ^ 535196088;
                    ** continue;
                }
                case 1766248696: {
                    var6_9 ^= var7_5 ^ -1645981046;
                    var7_5 = (var5_4 | var8_3) ^ 1389111156;
                    continue block21;
                }
                case 738459395: {
                    if (!var4_8.isOnline()) ** continue;
                    ** break;
                }
                case -560038211: {
                    var1_1.icon(bq.cj, var2_6, var3_7 - var1_1.s(16.0f), var1_1.s(26.0f), fc.withAlpha(lD.Ei((var6_9 | var7_5 ^ var9_2) ^ (var7_5 ^ -1025775757), (var5_4 | var7_5 ^ var9_2) ^ ((var6_9 | var7_5 ^ var9_2) ^ (var7_5 ^ -1498624623))), lD.Ei((var6_9 | var7_5 ^ var9_2) ^ (var7_5 ^ -1025775758), (var5_4 | var7_5 ^ var9_2) ^ ((var6_9 | var7_5 ^ var9_2) ^ (var7_5 ^ -1475418017)))));
                    var7_5 = (var5_4 | var8_3) ^ -1615968541;
                    continue block21;
                }
lbl74:
                // 1 sources

                var6_9 ^= 1483639104;
                v0 = lD.e;
                ** continue;
                case 729206411: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean DX(List<jq> var0, int var1_1) {
        block48: {
            block47: {
                var7_2 = 1814053202;
                var4_3 = lD.b & 1814053202 ^ 1185343269;
                var6_4 = 0;
                var5_7 = (var4_3 | var7_2) ^ -1334023320;
                var6_4 = (var4_3 | var7_2) ^ -470850607;
                ** GOTO lbl129
lbl7:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 2030784936;
                    break block47;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 1756134922;
                    ** GOTO lbl129
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ -2089928419;
                    break block47;
lbl16:
                    // 1 sources

                    while (true) {
                        var6_4 = (var4_3 | var7_2) ^ -1035237257;
                        break block47;
                        break;
                    }
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var5_7 ^= -765521688;
                    var3_6 = var0.get(var1_1 - 1);
                    var6_4 = (var4_3 | var7_2) ^ -1557346586;
                    ** GOTO lbl75
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 1913169734;
                    if (true) ** GOTO lbl129
                    break;
                }
            }
            block39: while (true) {
                switch (var6_4) {
                    case -846585455: {
                        var5_7 ^= var6_4 ^ 927951510;
                        var6_4 = (var4_3 | var7_2) ^ -54219429;
                        continue block39;
                    }
                    case 708176183: {
                        v0 = true;
                        break block48;
                    }
                    case -1417029577: {
                        var5_7 ^= var6_4 ^ 164220621;
                        ** break;
                    }
                    case -1393725696: {
                        if (var2_5.author() == null) ** GOTO lbl98
                        var6_4 = (var4_3 | var7_2) ^ -221447342;
                        ** GOTO lbl75
                    }
lbl44:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 1400971501;
                    ** GOTO lbl75
                    case 1774198487: {
                        var5_7 ^= var6_4 ^ 1471276791;
                        ** GOTO lbl78
                    }
                    case 1026017178: {
                        return false;
                    }
                    case -1839052244: {
                        if (var2_5.isSystem()) ** GOTO lbl74
                        ** GOTO lbl82
                    }
                    case -1242276862: {
                        var5_7 ^= var6_4 ^ -321588258;
                        ** continue;
                    }
                    case 1769872165: {
                        var5_7 ^= var6_4 ^ -1158580025;
                        ** break;
                    }
                    case -1767428447: {
                        if (var3_6.author() == null) ** GOTO lbl98
                        var6_4 = (var4_3 | var7_2) ^ 451454053;
                        ** GOTO lbl75
                    }
                    case -2020222191: {
                        var5_7 ^= var6_4 ^ 0x3B333B34;
                        ** continue;
                    }
lbl67:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ -1797988004;
                    continue block39;
                    case 1534816988: {
                        var6_4 = (var4_3 | var7_2) ^ -1231153961;
                        ** GOTO lbl75
                    }
                    case -667356256: {
                        if (!var3_6.isSystem()) ** GOTO lbl84
lbl74:
                        // 2 sources

                        var6_4 = (var4_3 | var7_2) ^ -628678960;
                    }
lbl75:
                    // 8 sources

                    default: {
                        continue block39;
                    }
                    {
                    }
lbl78:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 1859702612;
                    continue block39;
                    case -305602966: {
                        return false;
                    }
lbl82:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 903714219;
                    continue block39;
lbl84:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ -615335051;
                    continue block39;
                    case -898893288: {
                        var5_7 ^= var6_4 ^ 434412026;
                        ** GOTO lbl103
                    }
                    case 1951286034: {
                        var5_7 ^= var6_4 ^ 1834888085;
                        var6_4 = (var4_3 | var7_2) ^ -131997119;
                        ** GOTO lbl75
                    }
                    case -1272841817: {
                        var5_7 ^= var6_4 ^ 1668784839;
                        ** continue;
                    }
                    case 397260511: {
                        return false;
                    }
lbl98:
                    // 2 sources

                    var6_4 = (var4_3 | var7_2) ^ -382518170;
                    continue block39;
                    case -1769536202: {
                        if (var2_5.author().id().equals(var3_6.author().id())) ** GOTO lbl105
                        ** GOTO lbl117
                    }
lbl103:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 1150488128;
                    continue block39;
lbl105:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 124189088;
                    continue block39;
                    case -1670767579: {
                        var6_4 = (var4_3 | var7_2) ^ -134100522;
                        continue block39;
                    }
                    case 8267811: {
                        if (var2_5.timestamp() - var3_6.timestamp() < (-911988558366808868L << (var6_4 ^ 8267779) >>> (var6_4 ^ 8267779) ^ (long)var5_7 & 0xFFFFFFFFL | (-911988558366808868L >>> (var6_4 ^ 8267779) ^ (long)var5_7 & 0xFFFFFFFFL) << (var6_4 ^ 8267779))) {
                            var6_4 = (var4_3 | var7_2) ^ -1530061457;
                            continue block39;
                        }
                        var6_4 = (var4_3 | var7_2) ^ 131660882;
                        continue block39;
                    }
lbl117:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ -986759360;
                    continue block39;
                    case -93190613: 
                }
                break;
            }
            v0 = false;
        }
        var5_7 ^= 231204532;
        return v0;
        block41: while (true) {
            var6_4 = (var4_3 | var7_2) ^ 1403683189;
            if (true) ** GOTO lbl129
            block42: while (true) {
                var6_4 = (var4_3 | var7_2) ^ 1099937612;
lbl129:
                // 5 sources

                block43: while (true) {
                    switch (var6_4) {
                        default: {
                            continue block43;
                        }
                        case 101357949: {
                            var5_7 ^= var6_4 ^ -647886644;
                            ** continue;
                        }
                        case 1024222722: {
                            if (var1_1 > 0) continue block42;
                            ** continue;
                        }
                        case -1773676132: {
                            var2_5 = var0.get(var1_1);
                            ** continue;
                        }
                        case 791236667: {
                            var5_7 ^= var6_4 ^ -2020398660;
                            var6_4 = (var4_3 | var7_2) ^ -119456021;
                            continue block43;
                        }
                        case -1617300242: {
                            var5_7 ^= var6_4 ^ 1282773726;
                            continue block41;
                        }
                        case 481181745: {
                            return false;
                        }
                        case -1924561754: 
                    }
                    var6_4 = (var4_3 | var7_2) ^ -247524455;
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private float DY(W var1_1, List<jq> var2_2, int var3_3, float var4_4, float var5_5) {
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
    private void DZ(W var1_1, List<jq> var2_2, int var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8) {
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
    private float Ea(W var1_1, ij var2_2, float var3_3, float var4_4) {
        block18: {
            block19: {
                break block19;
lbl1:
                // 1 sources

                while (true) {
                    var10_7 = (var8_6 | var11_5) ^ -1793735861;
                    break block18;
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var10_7 = (var8_6 | var11_5) ^ 1915908159;
                    break block18;
lbl7:
                    // 1 sources

                    while (true) {
                        v0 = var9_11 ^= 65413926;
                        v1 = var9_11;
                        var9_11 ^= -1486950036;
                        var1_1.roundedRect(var3_3, var4_4 - var6_9 / 2.0f, var7_10, var6_9, var1_1.s(4.0f), fc.withAlpha(var2_2.color(), lD.Ei((v0 | var11_5) ^ -1740468920, (var8_6 | var11_5) ^ ((v1 | var11_5) ^ -1994621300))));
                        var10_7 = (var8_6 | var11_5) ^ -691355807;
                        break block18;
                        break;
                    }
                    break;
                }
            }
            var11_5 = 1595530864;
            var8_6 = lD.b & 1595530864 ^ -1253634781;
            var10_7 = 0;
            var9_11 = (var8_6 | var11_5) ^ 1621496183;
            var10_7 = (var8_6 | var11_5) ^ -1370479342;
            block16: while (true) {
                block21: {
                    block20: {
                        switch (var10_7) {
                            default: {
                                continue block16;
                            }
                            case 1360001633: {
                                ** break;
                            }
                            case 480972507: {
                                var5_8 = var1_1.s(10.0f);
                                break block20;
                            }
lbl29:
                            // 1 sources

                            var10_7 = (var8_6 | var11_5) ^ -388207307;
                            continue block16;
                            case 394506822: 
                        }
                        var9_11 ^= var10_7 ^ 2082089946;
                        break block21;
                    }
                    var9_11 ^= -474367966;
                    var6_9 = var1_1.s(14.0f);
                    var9_11 ^= -1652378922;
                    var7_10 = var1_1.textWidth(var2_2.badge(), var5_8) + var1_1.s(11.0f);
                    ** continue;
                }
                var10_7 = (var8_6 | var11_5) ^ -470494808;
            }
        }
        block17: while (true) {
            switch (var10_7) {
                case 697655314: {
                    var9_11 ^= var10_7 ^ 1874967312;
                    ** break;
                }
                case -1388215302: {
                    ** continue;
                }
                case -1922191540: {
                    var9_11 ^= var10_7 ^ -1720172507;
                    var10_7 = (var8_6 | var11_5) ^ -1642610621;
                    continue block17;
                }
                case -1932586556: {
                    var1_1.textCentered(var2_2.badge(), var3_3 + var7_10 / 2.0f, var4_4, var5_8, var2_2.color());
                    ** continue;
                }
lbl58:
                // 1 sources

                var10_7 = (var8_6 | var11_5) ^ 1938869943;
                default: {
                    continue block17;
                }
                case 1783241784: {
                    var9_11 ^= var10_7 ^ -1848671475;
                    var10_7 = (var8_6 | var11_5) ^ 1377721481;
                    continue block17;
                }
                case 1632116528: 
            }
            break;
        }
        return var3_3 + var7_10;
    }

    /*
     * Unable to fully structure code
     */
    private void Eb(W var1_1, String var2_2, float var3_3, float var4_4, float var5_5) {
        block36: {
            block33: {
                block30: {
                    block35: {
                        block31: {
                            block34: {
                                block32: {
                                    break block34;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        var9_8 = (var7_7 | var10_6) ^ -464061773;
                                        break block30;
                                        break;
                                    }
lbl4:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl6:
                                    // 1 sources

                                    while (true) {
                                        var9_8 = (var7_7 | var10_6) ^ 473935843;
                                        break block30;
                                        break;
                                    }
lbl9:
                                    // 1 sources

                                    while (true) {
                                        var9_8 = (var7_7 | var10_6) ^ -226291516;
                                        break block31;
                                        break;
                                    }
lbl12:
                                    // 1 sources

                                    while (true) {
                                        var8_10 ^= var9_8 ^ 2052550985;
                                        ** continue;
                                        break;
                                    }
lbl15:
                                    // 1 sources

                                    while (true) {
                                        var8_10 ^= -1960724628;
                                        break block32;
                                        break;
                                    }
lbl18:
                                    // 1 sources

                                    while (true) {
                                        var9_8 = (var7_7 | var10_6) ^ -858625123;
                                        break block31;
                                        break;
                                    }
                                }
                                var8_10 ^= 1485346176;
                                break block35;
lbl24:
                                // 1 sources

                                return;
lbl26:
                                // 1 sources

                                while (true) {
                                    var8_10 ^= var9_8 ^ -532978422;
                                    var9_8 = (var7_7 | var10_6) ^ 866471484;
                                    break block31;
                                    break;
                                }
                            }
                            var10_6 = 500480533;
                            var7_7 = lD.b & 500480533 ^ -179867083;
                            var9_8 = 0;
                            var8_10 = (var7_7 | var10_6) ^ -1157923561;
                            ** while (true)
lbl36:
                            // 1 sources

                            while (true) {
                                var9_8 = (var7_7 | var10_6) ^ -2109070139;
                                break block30;
                                break;
                            }
lbl39:
                            // 1 sources

                            while (true) {
                                var9_8 = (var7_7 | var10_6) ^ 921745634;
                                break block30;
                                break;
                            }
lbl42:
                            // 1 sources

                            while (true) {
                                var9_8 = (var7_7 | var10_6) ^ 994012041;
                                break block30;
                                break;
                            }
                        }
                        block25: while (true) {
                            switch (var9_8) {
                                default: {
                                    continue block25;
                                }
                                case 822448552: {
                                    ** continue;
                                }
                                case -831343607: {
                                    var6_9 = lD.Ec(var2_2);
                                    ** continue;
                                }
                                case 257223409: {
                                    ** continue;
                                }
                            }
                            break;
                        }
lbl57:
                        // 1 sources

                        while (!var2_2.isEmpty()) {
                            var8_10 ^= 900741528;
                            ** GOTO lbl77
                        }
                        break block36;
                    }
                    var1_1.textCentered(v0, var3_3 + var5_5 / 2.0f, var4_4 + var5_5 / 2.0f, var5_5 * 0.46f, fc.onColor(var6_9));
                    ** while (true)
                }
lbl65:
                // 2 sources

                block27: while (true) {
                    switch (var9_8) {
                        default: {
                            continue block27;
                        }
                        case -957836868: {
                            ** continue;
                        }
                        case 805264193: {
                            ** continue;
                        }
                        case 2141052656: {
                            ** continue;
                        }
                        case 427884678: {
                            ** GOTO lbl57
                        }
lbl77:
                        // 1 sources

                        v0 = var2_2.substring(0, 1).toUpperCase(Locale.ROOT);
                        break block33;
                        case -886619433: {
                            var8_10 ^= var9_8 ^ 98396356;
                            ** continue;
                        }
                        case -504867370: 
                    }
                    break;
                }
                var8_10 ^= var9_8 ^ 173914650;
                ** while (true)
            }
lbl86:
            // 2 sources

            while (true) {
                var8_10 ^= 706874389;
                ** continue;
                break;
            }
lbl89:
            // 1 sources

            while (true) {
                v0 = lD.d;
                ** continue;
                break;
            }
        }
        var8_10 ^= 900741528;
        ** while (true)
        var1_1.roundedRect(var3_3, var4_4, var5_5, var5_5, var5_5 / 2.0f, var6_9);
        var9_8 = (var7_7 | var10_6) ^ -769089164;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static int Ec(String string) {
        int n2 = b & 0x30655D7B ^ 0xFD081664;
        int n3 = 0;
        int n4 = (n2 | 0x30655D7B) ^ 0xF8AD46AB;
        n3 = (n2 | 0x30655D7B) ^ 0xE94B0A4E;
        block5: while (true) {
            switch (n3) {
                case -1530973893: {
                    n4 ^= n3 ^ 0x2DD24145;
                    n3 = (n2 | 0x30655D7B) ^ 0x6677B723;
                    continue block5;
                }
                case 338056497: {
                    n3 = (n2 | 0x30655D7B) ^ 0x59D26E44;
                }
                default: {
                    continue block5;
                }
                case -1692735396: 
            }
            break;
        }
        float f2 = (float)(Math.abs(string.toLowerCase(Locale.ROOT).hashCode()) % lD.Ei((n4 | n3 ^ 0xAB7FB527) ^ (n3 ^ 0xC08CE79F), (n2 | n3 ^ 0xAB7FB527) ^ ((n4 | n3 ^ 0xAB7FB527) ^ (n3 ^ 0xE06F1F1B)))) / 360.0f;
        n4 ^= 0xE3E448C0;
        return jA.hsvToRgb(f2, 0.55f, 0.72f);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block10: {
            var2 = 1010249861;
            lD.b = mK.a(MethodHandles.lookup().lookupClass(), -2044423725);
            var1_1 = 0;
            var0_2 = 1715556343;
            var1_1 = var2 ^ -352875523;
            break block10;
            lD.j = 196.0f;
            v0 = -2907155718574233946L << 32 >>> 32 ^ (long)(var0_2 ^= 973731582) & 0xFFFFFFFFL;
            lD.a = v0 | (-2907155718574233946L >>> 32 ^ (long)var0_2 & 0xFFFFFFFFL) << 32;
            lD.g = 34.0f;
            lD.a = 18.0f;
            lD.e = gj.decode("iM2e6A+Ql9JEU3sShcMUzW+l6v2Kbf0wOq2d2A==", lD.Ei((var0_2 | var2) ^ 416073711, var2 ^ ((var0_2 | var2) ^ 2137449861)));
            lD.d = gj.decode("yw==", lD.Ei((var0_2 | var2) ^ 416073710, var2 ^ ((var0_2 | var2) ^ 123165061)));
            lD.b = gj.decode("Z3Zk4XeCjdjHcHbCJjLwGDncK/M=", lD.Ei((var0_2 | var2) ^ 416073709, var2 ^ ((var0_2 | var2) ^ 694314645)));
            lD.c = gj.decode("KiXosDzYf2Uak8JqIA==", lD.Ei((var0_2 | var2) ^ 416073708, var2 ^ ((var0_2 | var2) ^ -175664012)));
            lD.a = gj.decode("9KlDLBI=", lD.Ei((var0_2 | var2) ^ 416073707, var2 ^ ((var0_2 | var2) ^ 1451578492)));
            var1_1 = var2 ^ -861601885;
        }
        block9: while (true) {
            switch (var1_1) {
                default: {
                    continue block9;
                }
                case -330825743: {
                    return;
                }
                case 616065160: {
                    v1 = 0;
                    v2 = 0;
                    lD.a = new int[((var0_2 ^= 171853845) | var2) ^ 2092396960];
                    var0_2 ^= -1928715772;
                    v3 = "_\u00cc\u0089\u0019Q\u00cb\u0000\u00a6\r\u00ce\u00c6N}{\u001e\u00e9\u00f5l<\u00ba\u0098\u008fs\u00cd[9\u0092@\u00ac\u00a5\u00c9}\u009f*I\u00ef< \u00ecvk\u0099\u00b6F\nZ\u009d\u00fa\u0096O\u0084\u00b8\u0018\u00c8\u00d2\u00c63\u0003lZb\u00dcM\u0091\u00b9\u00e7\u00a4\u00d0\u001a\u00dc3\u00de3\u00c2\u00a7\u008aA\u00e6Z\u00d2\u00c0-\u0001B\u009b\u00d55\u008bp\u0006\u0092\u00dd\u00018g\u0017{\u0005\u009ap\u009fD\u00e2jDa'u\u00ed\u00cc/l\u0019\u00da\u000b\u00a8".getBytes("ISO-8859-1");
                    break block9;
                }
                case -692012168: {
                    var1_1 = var2 ^ -936457038;
                    continue block9;
                }
                case -1501466838: {
                    var0_2 ^= var1_1 ^ 1997997838;
                    var1_1 = var2 ^ -797913228;
                    continue block9;
                }
                case 131781580: {
                    var0_2 ^= 532238055;
                    lD.a = DateTimeFormatter.ofPattern(lD.a).withZone(ZoneId.systemDefault());
                    var1_1 = var2 ^ -1699323985;
                    continue block9;
                }
                case -199623625: {
                    var0_2 ^= var1_1 ^ -121464215;
                    var1_1 = var2 ^ 412047373;
                    continue block9;
                }
                case -258748634: {
                    var0_2 ^= var1_1 ^ 369467088;
                    var1_1 = var2 ^ 1005445961;
                    continue block9;
                }
            }
            break;
        }
lbl53:
        // 2 sources

        var0_2 ^= -891200333;
        var0_2 ^= 160631705;
        var0_2 ^= -351204159;
        var0_2 ^= 604895820;
        var0_2 ^= -2086792629;
        var0_2 ^= 1848426125;
        v4 = var0_2 ^= -292909588;
        var0_2 ^= 1674662668;
        lD.a[v1] = ((v3[v2] & 255) << 24 | ((v3[v2 + 1] & 255) << 16 | ((v3[v2 + 2] & 255) << 8 | v3[v2 + 3] & 255))) ^ ((v4 | var2) ^ -22058070 ^ lD.b);
        v1 = v1 + 1;
        v5 = v2 + 4;
        v3 = v3;
        v2 = v5;
        var0_2 ^= 1820840833;
        if (v5 < v3.length) ** GOTO lbl53
    }

    /*
     * Exception decompiling
     */
    private void Ed(W var1_1, bN var2_2) {
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
    private void Ee(W var1_1, bN var2_2, fk var3_3, float var4_4, float var5_5) {
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
    private static int Ef(ca var0) {
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
    @Override
    public boolean mouseDown(W var1_1, double var2_2, double var4_3, int var6_4) {
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
    private static List<fk> Eg(bN var0) {
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
    private static boolean Eh(float[] var0, double var1_1, double var3_2) {
        block33: {
            var8_3 = -553897599;
            var5_4 = lD.b & -553897599 ^ 1472985908;
            var7_5 = 0;
            ** GOTO lbl75
lbl5:
            // 1 sources

            while (true) {
                var7_5 = (var5_4 | var8_3) ^ -1583092124;
                ** GOTO lbl49
                break;
            }
lbl8:
            // 1 sources

            while (true) {
                var7_5 = (var5_4 | var8_3) ^ 812200399;
                ** GOTO lbl49
lbl11:
                // 1 sources

                while (true) {
                    v0 = true;
                    ** GOTO lbl39
                    break;
                }
                break;
            }
lbl14:
            // 1 sources

            block18: while (true) {
                var7_5 = (var5_4 | var8_3) ^ -202273380;
                ** GOTO lbl49
lbl17:
                // 1 sources

                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ -786960324;
                    ** GOTO lbl49
                    break;
                }
                block20: while (var1_1 >= (double)var0[0]) {
                    block34: {
                        break block34;
lbl22:
                        // 1 sources

                        while (true) {
                            var6_6 ^= var7_5 ^ -288445513;
                            ** GOTO lbl79
                            break;
                        }
                    }
                    var7_5 = (var5_4 | var8_3) ^ -2101158731;
                    ** GOTO lbl49
lbl28:
                    // 1 sources

                    while (true) {
                        var6_6 ^= var7_5 ^ -1073616628;
                        ** continue;
                        break;
                    }
lbl31:
                    // 1 sources

                    while (var3_2 < (double)(var0[1] + var0[3])) {
                        ** continue;
lbl33:
                        // 1 sources

                        ** GOTO lbl17
                    }
                    break block33;
lbl35:
                    // 1 sources

                    return v0;
lbl37:
                    // 1 sources

                    while (true) {
                        v0 = false;
lbl39:
                        // 2 sources

                        var6_6 ^= 614445487;
                        ** continue;
                        break;
                    }
                    block26: while (var3_2 >= (double)var0[1]) {
                        var7_5 = (var5_4 | var8_3) ^ -1707022467;
                        if (true) ** GOTO lbl49
                        block27: while (true) {
                            var7_5 = (var5_4 | var8_3) ^ 88112266;
                            ** GOTO lbl49
                            block28: while (var1_1 < (double)(var0[0] + var0[2])) {
                                ** GOTO lbl77
lbl49:
                                // 10 sources

                                block29: while (true) {
                                    switch (var7_5) lbl-1000:
                                    // 4 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block29;
                                            }
                                            break;
                                        }
                                        case 2119964113: {
                                            ** continue;
                                        }
                                        case 1638868757: {
                                            continue block20;
                                        }
                                        case 739145257: {
                                            ** continue;
                                        }
                                        case 250088329: {
                                            ** continue;
                                        }
                                        case -132547704: {
                                            ** GOTO lbl31
                                        }
                                        case 1538734438: {
                                            break block18;
                                        }
                                        case -624982209: {
                                            ** continue;
                                        }
                                        case 134200045: {
                                            continue block26;
                                        }
                                        case 1951047842: {
                                            continue block28;
                                        }
                                        case 2139747172: {
                                            var6_6 ^= var7_5 ^ -1319104031;
                                            continue block27;
                                        }
lbl75:
                                        // 1 sources

                                        var6_6 = (var5_4 | var8_3) ^ -1723800342;
                                        ** continue;
lbl77:
                                        // 1 sources

                                        var7_5 = (var5_4 | var8_3) ^ -2075606317;
                                        ** GOTO lbl-1000
lbl79:
                                        // 1 sources

                                        var7_5 = (var5_4 | var8_3) ^ -1101996896;
                                        ** GOTO lbl-1000
lbl81:
                                        // 1 sources

                                        while (true) {
                                            var7_5 = (var5_4 | var8_3) ^ 669417533;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            break block33;
                            break;
                        }
                    }
                    break block33;
                }
                break block33;
                break;
            }
            var7_5 = (var5_4 | var8_3) ^ -671071912;
            ** GOTO lbl49
            {
                case 1170152648: {
                    ** continue;
                }
            }
lbl91:
            // 1 sources

            while (true) {
                var7_5 = (var5_4 | var8_3) ^ -1414178025;
                ** GOTO lbl49
                break;
            }
        }
        var7_5 = (var5_4 | var8_3) ^ -1602877231;
        ** while (true)
        {
            case -275330438: {
                ** continue;
            }
            ** case 1564288768:
        }
lbl100:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean mouseUp(W var1_1, double var2_2, double var4_3, int var6_4) {
        block10: {
            block9: {
                block8: {
                    break block10;
lbl1:
                    // 1 sources

                    return this.a.mouseUp(var1_1, var2_2, var4_3, var6_4);
lbl3:
                    // 1 sources

                    while (true) {
                        var8_7 ^= var9_6 ^ 896391685;
                        break block8;
                        break;
                    }
lbl6:
                    // 3 sources

                    block7: while (true) {
                        switch (var9_6) {
                            default: {
                                continue block7;
                            }
                            case 139455761: {
                                break block9;
                            }
                            case 1343755632: {
                                ** continue;
                            }
                            case 1047507388: {
                                break;
                            }
                        }
                        ** continue;
                        break;
                    }
                }
                var9_6 = (var7_5 | 658919763) ^ -1085872497;
                ** GOTO lbl6
            }
            var9_6 = (var7_5 | 658919763) ^ -785300925;
            ** GOTO lbl6
        }
        var7_5 = lD.b & 658919763 ^ -333909330;
        var9_6 = 0;
        var8_7 = (var7_5 | 658919763) ^ 185714340;
        var9_6 = (var7_5 | 658919763) ^ -418308370;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean mouseDrag(W w2, double d2, double d3, int n2, double d4, double d5) {
        int n3 = b & 0xCD84B591 ^ 0x87ACFD2;
        int n4 = 0;
        int n5 = (n3 | 0xCD84B591) ^ 0x181E801A;
        n4 = (n3 | 0xCD84B591) ^ 0x17ACD9BD;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case 526054569: {
                    return this.a.mouseDrag(w2, d2, d3, n2, d4, d5);
                }
                case 599567973: {
                    n5 ^= n4 ^ 0xDE23A4DB;
                    n4 = (n3 | 0xCD84B591) ^ 0xD2A40B7A;
                    continue block5;
                }
                case -632150418: 
            }
            n4 = (n3 | 0xCD84B591) ^ 0xEE4251B6;
        }
    }

    private static int Ei(int n2, int n3) {
        int n4 = -1382333315;
        int n5 = -1211166321;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x58A427CF)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xBFDFA025;
        n6 += (n5 | n4) ^ 0xBFDF938B;
        n6 += (n5 | n4) ^ 0xBFDFE5EA;
        n6 += (n5 | n4) ^ 0xBFDFEFC6;
        n6 -= (n5 | n4) ^ 0xBFDF3513;
        n6 ^= (n5 | n4) ^ 0xBFDFE183;
        n6 += (n5 | n4) ^ 0xBFDF7171;
        n6 += (n5 | n4) ^ 0xBFDF5169;
        return n6 -= (n5 | n4) ^ 0xBFDFC1C7;
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean scroll(W var1_1, double var2_2, double var4_3, double var6_4) {
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
    @Override
    public boolean key(W var1_1, int var2_2, int var3_3) {
        block57: {
            block52: {
                block60: {
                    block59: {
                        block58: {
                            block53: {
                                block54: {
                                    block56: {
                                        block55: {
                                            block51: {
                                                break block57;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl3:
                                                // 1 sources

                                                while (true) {
                                                    var7_6 = (var5_5 | var8_4) ^ 267337269;
                                                    break block51;
lbl6:
                                                    // 2 sources

                                                    while (true) {
                                                        var6_8 ^= -815958867;
                                                        break block52;
                                                        break;
                                                    }
                                                    break;
                                                }
lbl9:
                                                // 1 sources

                                                while (true) {
                                                    var7_6 = (var5_5 | var8_4) ^ 876217213;
                                                    ** GOTO lbl25
                                                    break;
                                                }
lbl12:
                                                // 1 sources

                                                while (true) {
                                                    var7_6 = (var5_5 | var8_4) ^ 1128709760;
                                                    ** GOTO lbl25
lbl15:
                                                    // 1 sources

                                                    return false;
                                                }
                                            }
lbl18:
                                            // 5 sources

                                            block37: while (true) {
                                                switch (var7_6) lbl-1000:
                                                // 5 sources

                                                {
                                                    while (true) {
                                                        default: {
                                                            continue block37;
                                                        }
                                                        break;
                                                    }
                                                    case -2101204381: {
                                                        ** GOTO lbl74
                                                    }
lbl25:
                                                    // 14 sources

                                                    block39: while (true) {
                                                        switch (var7_6) lbl-1000:
                                                        // 5 sources

                                                        {
                                                            while (true) {
                                                                default: {
                                                                    continue block39;
                                                                }
                                                                break;
                                                            }
                                                            case -901398400: {
                                                                ** continue;
                                                            }
                                                            case 164787597: {
                                                                ** continue;
                                                            }
                                                            case 1385381323: {
                                                                var6_8 ^= var7_6 ^ 2017072927;
                                                                break;
                                                            }
lbl37:
                                                            // 1 sources

                                                            while (true) {
                                                                var7_6 = (var5_5 | var8_4) ^ -2066499004;
                                                                ** GOTO lbl-1000
                                                                break;
                                                            }
                                                            case 844861064: {
                                                                return true;
                                                            }
                                                            case -2128470716: {
                                                                var6_8 ^= var7_6 ^ -2034292727;
                                                                ** continue;
                                                            }
lbl45:
                                                            // 1 sources

                                                            while (true) {
                                                                var7_6 = (var5_5 | var8_4) ^ -914348169;
                                                                ** GOTO lbl-1000
                                                                break;
                                                            }
                                                            case -383805379: {
                                                                this.a = true;
                                                                break;
                                                            }
lbl51:
                                                            // 1 sources

                                                            while (true) {
                                                                var7_6 = (var5_5 | var8_4) ^ 392190912;
                                                                ** GOTO lbl-1000
                                                                break;
                                                            }
                                                            case 2005049995: {
                                                                var6_8 ^= var7_6 ^ 499847250;
                                                                break block53;
                                                            }
                                                            case 1636965899: {
                                                                var6_8 ^= var7_6 ^ -977200134;
                                                                break block54;
                                                            }
lbl60:
                                                            // 1 sources

                                                            while (true) {
                                                                var7_6 = (var5_5 | var8_4) ^ 1032108644;
                                                                ** GOTO lbl-1000
                                                                break;
                                                            }
lbl63:
                                                            // 1 sources

                                                            while (true) {
                                                                var7_6 = (var5_5 | var8_4) ^ -1154931783;
                                                                ** continue;
                                                                break;
                                                            }
                                                            case 934036522: {
                                                                if (!this.a.key(var1_1, var2_2, var3_3)) break block39;
                                                                break;
                                                            }
                                                            case 1282136351: {
                                                                if (!var4_7) break;
                                                                ** continue;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    var7_6 = (var5_5 | var8_4) ^ -2000435957;
                                                    ** GOTO lbl25
lbl74:
                                                    // 1 sources

                                                    var7_6 = (var5_5 | var8_4) ^ -447138212;
                                                    ** GOTO lbl-1000
                                                    {
                                                        case 827089016: {
                                                            var6_8 ^= var7_6 ^ -372483971;
                                                            break block55;
                                                        }
                                                    }
                                                    case 1747719040: {
                                                        v0 = true;
                                                        ** GOTO lbl6
                                                    }
lbl82:
                                                    // 2 sources

                                                    while (true) {
                                                        var7_6 = (var5_5 | var8_4) ^ 1963120173;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl85:
                                                    // 1 sources

                                                    while (true) {
                                                        var7_6 = (var5_5 | var8_4) ^ 2136858297;
                                                        ** GOTO lbl25
                                                        break;
                                                    }
                                                    case 455538081: {
                                                        var6_8 ^= var7_6 ^ 1458822071;
                                                        ** continue;
                                                    }
                                                    {
                                                        case -1006929511: {
                                                            ** continue;
                                                        }
                                                    }
                                                    case 2058123705: {
                                                        if (var2_2 != lD.Ei((var6_8 | var7_6 ^ 2094529472) ^ (var7_6 ^ 1521254757), (var5_5 | var7_6 ^ 2094529472) ^ ((var6_8 | var7_6 ^ 2094529472) ^ (var7_6 ^ -414200924)))) break block37;
                                                        ** GOTO lbl82
                                                    }
                                                    while (true) {
                                                        var7_6 = (var5_5 | var8_4) ^ -1393754570;
                                                        ** GOTO lbl25
                                                        break;
                                                    }
                                                    case -423180275: {
                                                        var6_8 ^= var7_6 ^ -1939604252;
                                                        break block56;
                                                    }
lbl102:
                                                    // 1 sources

                                                    while (true) {
                                                        var7_6 = (var5_5 | var8_4) ^ 2092820894;
                                                        ** continue;
                                                        break;
                                                    }
lbl105:
                                                    // 1 sources

                                                    while (true) {
                                                        var7_6 = (var5_5 | var8_4) ^ -908884009;
                                                        ** GOTO lbl25
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            var7_6 = (var5_5 | var8_4) ^ 414780400;
                                            ** GOTO lbl18
                                        }
                                        var7_6 = (var5_5 | var8_4) ^ -1307305246;
                                        ** GOTO lbl25
                                        {
                                            case 1163321412: {
                                                var6_8 ^= var7_6 ^ 1454741419;
                                                break block58;
                                            }
                                        }
                                        var7_6 = (var5_5 | var8_4) ^ -139610512;
                                        ** GOTO lbl25
                                    }
                                    var7_6 = (var5_5 | var8_4) ^ -15201124;
                                    ** GOTO lbl18
                                    {
                                        case 256372055: {
                                            this.a.submit();
                                            ** continue;
                                        }
                                        case -1120305795: {
                                            if (!var4_7) ** continue;
                                            ** continue;
                                        }
                                    }
                                    this.a = true;
                                    var7_6 = (var5_5 | var8_4) ^ -1611801098;
                                    ** GOTO lbl25
                                    {
                                        case -242156088: {
                                            if (var2_2 != lD.Ei((var6_8 | var7_6 ^ -135561295) ^ (var7_6 ^ -779090667), (var5_5 | var7_6 ^ -135561295) ^ ((var6_8 | var7_6 ^ -135561295) ^ (var7_6 ^ 491633352)))) ** break;
                                            ** continue;
                                            break block59;
                                        }
                                        case -1954736688: {
                                            var6_8 ^= var7_6 ^ -505929415;
                                            break block60;
                                        }
                                        case -1919745412: {
                                            ** continue;
                                        }
                                    }
                                    {
                                        case 939517066: {
                                            var6_8 ^= var7_6 ^ 1407138918;
                                            ** continue;
                                        }
                                    }
                                    var7_6 = (var5_5 | var8_4) ^ -818699387;
                                    ** GOTO lbl25
                                }
                                var7_6 = (var5_5 | var8_4) ^ -870036107;
                                ** GOTO lbl25
                            }
                            var7_6 = (var5_5 | var8_4) ^ -1364997176;
                            ** GOTO lbl25
                            {
                                ** case 23580513:
                            }
lbl152:
                            // 1 sources

                            v0 = false;
                            ** while (true)
                        }
                        var7_6 = (var5_5 | var8_4) ^ -247976278;
                        ** GOTO lbl25
                    }
                    var7_6 = (var5_5 | var8_4) ^ 1944895873;
                    ** GOTO lbl18
                    {
                        case 1356597301: {
                            return true;
                        }
                    }
                    var7_6 = (var5_5 | var8_4) ^ -1979883146;
                    ** while (true)
                    {
                        ** case 1992034038:
                    }
lbl165:
                    // 1 sources

                    var6_8 ^= var7_6 ^ 1614605616;
                    ** while (true)
                }
                var7_6 = (var5_5 | var8_4) ^ -1772892035;
                ** while (true)
            }
            var4_7 = v0;
            ** while (true)
        }
        var8_4 = 108757625;
        var5_5 = lD.b & 108757625 ^ -128629844;
        var7_6 = 0;
        var6_8 = (var5_5 | var8_4) ^ 1992943424;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean charTyped(W var1_1, char var2_2) {
        block8: {
            var3_3 = lD.b & -1278740495 ^ 13887028;
            var5_4 = 0;
            break block8;
lbl4:
            // 1 sources

            block5: while (true) {
                switch (var5_4) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
                    case -1636031370: {
                        ** GOTO lbl14
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | -1278740495) ^ -364753768;
                        ** GOTO lbl-1000
                        break;
                    }
lbl14:
                    // 1 sources

                    var5_4 = (var3_3 | -1278740495) ^ -55187872;
                    ** continue;
                    case 1331827093: {
                        var4_5 ^= var5_4 ^ -173246187;
                        ** continue;
                    }
                    case 1502985069: {
                        return this.a.charTyped(var1_1, var2_2);
                    }
                }
                break;
            }
        }
        var4_5 = (var3_3 | -1278740495) ^ -611672320;
        var5_4 = (var3_3 | -1278740495) ^ 766235523;
        ** while (true)
    }
}

