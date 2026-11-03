/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1684
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_4588
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1684;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import z.r.aE;
import z.r.az;
import z.r.dA;
import z.r.gF;
import z.r.gP;
import z.r.hZ;
import z.r.kA;
import z.r.ke;
import z.r.lb;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class eE
extends gF {
    public static final int h;
    private final gP a;
    private static final /* synthetic */ String k;
    private final List<kA> a;
    private static final double a;
    private static final /* synthetic */ String a;
    private final aE a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final int a;
    private final gP b;
    private final gP c;
    private static final /* synthetic */ String d;
    private final ke a;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final double b;
    private static final /* synthetic */ String g;
    private static final int b;
    private static final /* synthetic */ String h;
    private static final int c;
    private final Map<UUID, lb> a;
    private static final /* synthetic */ String i;
    private static final double c;
    private static final int[] a;
    private final ke b;
    private static final int d;
    private static final /* synthetic */ String j;
    private static final int e;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String m;
    private int f;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final int g;
    private static final /* synthetic */ String r;
    private final az a;

    private static int iB(int n2, int n3) {
        int n4 = 1233423062;
        int n5 = 1117326215;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xC02185AD)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x4B9D71AE;
        n6 += (n5 | n4) ^ 0x4B9D05B0;
        n6 -= (n5 | n4) ^ 0x4B9D13E9;
        n6 += (n5 | n4) ^ 0x4B9DFCCD;
        n6 -= (n5 | n4) ^ 0x4B9DA6FF;
        return n6 ^= (n5 | n4) ^ 0x4B9D865D;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public eE() {
        int n2 = 1561913927;
        int n3 = h & 0x5D18EA47 ^ 0x69113EF3;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xBFE69D01;
        n5 ^= 0x96CF09EA;
        super(k, s, dA.l);
        n4 = (n3 | n2) ^ 0xD70810BD;
        block22: while (true) {
            switch (n4) {
                default: {
                    continue block22;
                }
                case -1441665462: {
                    n5 ^= n4 ^ 0x59027B06;
                    n4 = (n3 | n2) ^ 0x44D7AD89;
                    continue block22;
                }
                case 113253556: {
                    n5 ^= n4 ^ 0x82051478;
                    n4 = (n3 | n2) ^ 0x7ADF4E1A;
                    continue block22;
                }
                case -215836544: {
                    this.b = this.addSetting(new ke(r, true));
                    n4 = (n3 | n2) ^ 0xD1B50408;
                    continue block22;
                }
                case -724997688: {
                    n5 ^= 0x78862643;
                    this.a = this.addSetting(new gP(q, 128.0f, 16.0f, 256.0f, 8.0f, g).description(b));
                    n4 = (n3 | n2) ^ 0x1EC895DD;
                    continue block22;
                }
                case -1792229890: {
                    n5 ^= n4 ^ 0x44C7ADE8;
                    n4 = (n3 | n2) ^ 0x849F5A6;
                    continue block22;
                }
                case -1328135827: {
                    n5 ^= n4 ^ 0x6D9D9EBA;
                    n4 = (n3 | n2) ^ 0x8E3B6677;
                    continue block22;
                }
                case -533686239: {
                    n5 ^= n4 ^ 0x8E5D52D2;
                    n4 = (n3 | n2) ^ 0xD512E1A7;
                    continue block22;
                }
                case 822693300: {
                    this.a = new HashMap();
                    n4 = (n3 | n2) ^ 0x836D7B5;
                    continue block22;
                }
                case -1397949697: {
                    n5 ^= n4 ^ 0x52C2573F;
                    n4 = (n3 | n2) ^ 0xC2045880;
                    continue block22;
                }
                case 1966025026: {
                    n5 ^= n4 ^ 0xA20C0AF1;
                    n4 = (n3 | n2) ^ 0x2EAAAE8D;
                    continue block22;
                }
                case -1475666096: {
                    n5 ^= 0x43E20763;
                    this.c = this.addSetting(new gP(l, 1.8f, 0.5f, 5.0f, 0.1f, m).description(j));
                    n4 = (n3 | n2) ^ 0xE8354309;
                    continue block22;
                }
                case 2120920732: {
                    n5 ^= 0x2A05451E;
                    this.b = this.addSetting(new gP(a, 0.18f, 0.05f, 0.6f, 0.01f, h).description(o));
                    n4 = (n3 | n2) ^ 0x9D2966D6;
                    continue block22;
                }
                case 1674668842: {
                    n5 ^= n4 ^ 0x3150BA19;
                    n4 = (n3 | n2) ^ 0x4C10B343;
                    continue block22;
                }
                case 1968180049: {
                    this.a = this.addSetting(new ke(e, true));
                    n4 = (n3 | n2) ^ 0xCDCFBF9A;
                    continue block22;
                }
                case 1347196782: {
                    n5 ^= n4 ^ 0x912189E9;
                    n4 = (n3 | n2) ^ 0xA9D0973F;
                    continue block22;
                }
                case -1088575881: {
                    this.a = this.addSetting(new az(n, eE.iB((n5 | n4 ^ 0xE2054C30) ^ (n4 ^ 0x6B7C52EA), (n3 | n4 ^ 0xE2054C30) ^ ((n5 | n4 ^ 0xE2054C30) ^ (n4 ^ 0xEBD4432D)))));
                    n4 = (n3 | n2) ^ 0x2D556999;
                    continue block22;
                }
                case 969823102: {
                    n5 ^= 0x3DEC45E3;
                    this.a = this.addSetting(new aE(i, p, p, c, d, f));
                    n4 = (n3 | n2) ^ 0xC01E9CAA;
                    continue block22;
                }
                case 1404260474: {
                    this.a = new ArrayList();
                    n4 = (n3 | n2) ^ 0x7BD9E243;
                    continue block22;
                }
                case -1123589539: {
                    n5 ^= n4 ^ 0x9C590AC6;
                    n4 = (n3 | n2) ^ 0x373506B;
                    continue block22;
                }
                case 130461933: 
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onEnable() {
        int n2 = h & 0xF10AE29C ^ 0x8EE6D943;
        int n3 = 0;
        int n4 = (n2 | 0xF10AE29C) ^ 0x45A198E1;
        n3 = (n2 | 0xF10AE29C) ^ 0xE0CF1C7F;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -596324430: {
                    n4 ^= n3 ^ 0xC3AA5ACC;
                    n3 = (n2 | 0xF10AE29C) ^ 0xC4A4B4D3;
                    continue block5;
                }
                case 522315680: {
                    n3 = (n2 | 0xF10AE29C) ^ 0x239A346D;
                    continue block5;
                }
                case 994725644: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block18: {
            break block18;
lbl1:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl3:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ -2094687882;
                if (true) ** GOTO lbl31
                break;
            }
            block11: while (true) {
                block19: {
                    var3_3 = (var1_2 | var4_1) ^ -1321035134;
                    break block19;
lbl9:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 71096197;
                        ** GOTO lbl36
                        break;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        this.a.clear();
                        ** GOTO lbl29
                        break;
                    }
                }
lbl16:
                // 3 sources

                block14: while (true) {
                    switch (var3_3) lbl-1000:
                    // 5 sources

                    {
                        while (true) {
                            default: {
                                continue block14;
                            }
                            break;
                        }
                        case 1775854473: {
                            ** continue;
                        }
                        case -1629889142: {
                            ** continue;
                        }
                        case -32923328: {
                            ** continue;
                        }
                        case 1483673153: {
                            ** continue;
                        }
lbl29:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 1754582946;
                        ** GOTO lbl-1000
lbl31:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 1065449966;
                        ** GOTO lbl-1000
                        case 259700749: {
                            var2_4 ^= var3_3 ^ -617560587;
                            continue block11;
                        }
lbl36:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 238490662;
                        ** GOTO lbl-1000
lbl38:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1712859409;
                            ** continue;
                            break;
                        }
                        case -693310163: {
                            return;
                        }
                        case -1912604718: {
                            ** continue;
                        }
                    }
                    break;
                }
                break;
            }
lbl45:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -367951747;
                ** GOTO lbl16
                break;
            }
            this.a.clear();
            var3_3 = (var1_2 | var4_1) ^ -113792475;
            ** while (true)
        }
        var4_1 = 1709445163;
        var1_2 = eE.h & 1709445163 ^ 1653237678;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -433160207;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onTick(class_310 var1_1) {
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
    public void renderWorld(WorldRenderContext var1_1, class_310 var2_2) {
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
    private void iC(class_4588 var1_1, Matrix4f var2_2, lb var3_3, class_1684 var4_4, float var5_5, double var6_6, double var8_7, class_243 var10_8) {
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
    private List<hZ> iD(List<hZ> var1_1, double var2_2) {
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[UNCONDITIONALDOLOOP], 13[UNCONDITIONALDOLOOP], 0[SWITCH]], but top level block is 4[SWITCH]
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
    private static List<hZ> iE(List<hZ> var0) {
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
    private static class_243 iF(class_243 var0, class_243 var1_1, class_243 var2_2, class_243 var3_3, double var4_4) {
        block12: {
            block11: {
                block10: {
                    block13: {
                        break block13;
lbl1:
                        // 1 sources

                        while (true) {
                            var12_6 = (var10_5 | 142790815) ^ -965426827;
                            break block10;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var11_7 ^= var12_6 ^ 1653819129;
                            break block11;
                            break;
                        }
                    }
                    var10_5 = eE.h & 142790815 ^ 1236722142;
                    var12_6 = 0;
                    var11_7 = (var10_5 | 142790815) ^ 1864255100;
                    ** while (true)
lbl12:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
lbl15:
                // 3 sources

                block8: while (true) {
                    switch (var12_6) {
                        default: {
                            continue block8;
                        }
                        case -1957136248: {
                            ** continue;
                        }
                        case -1883098966: {
                            break block12;
                        }
                        case -753323773: {
                            break;
                        }
                    }
                    ** continue;
                    break;
                }
lbl26:
                // 1 sources

                return new class_243(0.5 * (2.0 * var1_1.field_1352 + (-var0.field_1352 + var2_2.field_1352) * var4_4 + (2.0 * var0.field_1352 - 5.0 * var1_1.field_1352 + 4.0 * var2_2.field_1352 - var3_3.field_1352) * var6_8 + (-var0.field_1352 + 3.0 * var1_1.field_1352 - 3.0 * var2_2.field_1352 + var3_3.field_1352) * var8_9), 0.5 * (2.0 * var1_1.field_1351 + (-var0.field_1351 + var2_2.field_1351) * var4_4 + (2.0 * var0.field_1351 - 5.0 * var1_1.field_1351 + 4.0 * var2_2.field_1351 - var3_3.field_1351) * var6_8 + (-var0.field_1351 + 3.0 * var1_1.field_1351 - 3.0 * var2_2.field_1351 + var3_3.field_1351) * var8_9), 0.5 * (2.0 * var1_1.field_1350 + (-var0.field_1350 + var2_2.field_1350) * var4_4 + (2.0 * var0.field_1350 - 5.0 * var1_1.field_1350 + 4.0 * var2_2.field_1350 - var3_3.field_1350) * var6_8 + (-var0.field_1350 + 3.0 * var1_1.field_1350 - 3.0 * var2_2.field_1350 + var3_3.field_1350) * var8_9));
                var6_8 = var4_4 * var4_4;
                var8_9 = var6_8 * var4_4;
                var11_7 ^= -1892944875;
                ** while (true)
            }
            var12_6 = (var10_5 | 142790815) ^ -1699757860;
            ** GOTO lbl15
        }
        var12_6 = (var10_5 | 142790815) ^ -1024554665;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void iG(class_4588 var1_1, Matrix4f var2_2, List<hZ> var3_3, double var4_4, double var6_5, class_243 var8_6, float var9_7, float var10_8) {
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
    private void iH(class_4588 var1_1, Matrix4f var2_2, kA var3_3, double var4_4) {
        block31: {
            block30: {
                var14_5 = 70367874;
                var11_6 = eE.h & 70367874 ^ -2122358996;
                var13_7 = 0;
                var12_9 = (var11_6 | var14_5) ^ -6092392;
                var13_7 = (var11_6 | var14_5) ^ 1727129902;
                if (true) ** GOTO lbl-1000
                while (true) {
                    var13_7 = (var11_6 | var14_5) ^ -1160893749;
                    break block30;
                    break;
                }
                block24: while (true) {
                    block32: {
                        switch (var13_7) lbl-1000:
                        // 2 sources

                        {
                            default: {
                                continue block24;
                            }
                            case -477227392: {
                                ** break;
                            }
                            case 1792739562: {
                                var12_9 ^= var13_7 ^ 1231376556;
                                break block32;
                            }
lbl19:
                            // 1 sources

                            var13_7 = (var11_6 | var14_5) ^ -274401468;
                            continue block24;
                            case -5316780: 
                        }
                        var6_8 = (var4_4 - (double)var3_3.a) / 14.0;
                        var13_7 = (var11_6 | var14_5) ^ -585633239;
                        break block30;
                    }
                    var13_7 = (var11_6 | var14_5) ^ 2060525818;
                }
lbl28:
                // 1 sources

                while (true) {
                    var13_7 = (var11_6 | var14_5) ^ -1378928060;
                    break block31;
                    break;
                }
lbl31:
                // 1 sources

                while (true) {
                    var13_7 = (var11_6 | var14_5) ^ -1022631627;
                    break block31;
                    break;
                }
            }
            block27: while (true) lbl-1000:
            // 7 sources

            {
                block34: {
                    block35: {
                        block33: {
                            switch (var13_7) {
                                case 1068619109: {
                                    var12_9 ^= var13_7 ^ 1359442066;
                                    break;
                                }
                                case 1756979579: {
                                    var8_10 = 1.0 - Math.pow(1.0 - var6_8, 3.0);
                                    break block33;
                                }
                                case 1483214215: {
                                    var12_9 ^= var13_7 ^ 673938962;
                                    break block34;
                                }
                                case -1473036801: {
                                    if (!(var6_8 < 0.0)) {
                                        var13_7 = (var11_6 | var14_5) ^ 773421802;
                                        continue block27;
                                    }
                                    break block35;
                                }
                                case -1397258508: {
                                    return;
                                }
                                case -1419344572: {
                                    var13_7 = (var11_6 | var14_5) ^ -952753544;
                                    continue block27;
                                }
                                case 746912028: {
                                    var12_9 ^= var13_7 ^ 1902429939;
                                    var13_7 = (var11_6 | var14_5) ^ 701004122;
                                    ** GOTO lbl-1000
                                }
                                case 1112137174: {
                                    if (!(var6_8 >= 1.0)) ** continue;
                                    break block35;
                                }
                            }
                            var13_7 = (var11_6 | var14_5) ^ -305750315;
                            continue;
                        }
                        var12_9 ^= 602614852;
                        var10_11 = this.iM(var3_3.travelled(), 1.0);
                        ** continue;
                    }
                    var13_7 = (var11_6 | var14_5) ^ -1443166542;
                    continue;
                }
                var13_7 = (var11_6 | var14_5) ^ 760005201;
            }
        }
        block28: while (true) {
            switch (var13_7) {
                default: {
                    continue block28;
                }
                case 356738974: {
                    var12_9 ^= var13_7 ^ -1300269896;
                    var13_7 = (var11_6 | var14_5) ^ -1475231787;
                    continue block28;
                }
                case 1182015131: {
                    var12_9 ^= var13_7 ^ -535296974;
                    var13_7 = (var11_6 | var14_5) ^ -1508321615;
                    continue block28;
                }
                case 762200187: {
                    this.iI(var1_1, var2_2, var3_3.pos(), (0.25 + 1.55 * var8_10) * 0.6, 0.07, var10_11, (int)(110.0 * (1.0 - var6_8) * (1.0 - var6_8)));
                    var13_7 = (var11_6 | var14_5) ^ -160348182;
                    continue block28;
                }
                case 1930344516: {
                    var12_9 ^= var13_7 ^ 1098166403;
                    ** continue;
                }
                case 593963295: {
                    this.iI(var1_1, var2_2, var3_3.pos(), 0.25 + 1.55 * var8_10, 0.1, var10_11, (int)(200.0 * (1.0 - var6_8) * (1.0 - var6_8)));
                    break;
                }
                case 682673642: {
                    return;
                }
            }
            var13_7 = (var11_6 | var14_5) ^ -1875077072;
        }
    }

    /*
     * Exception decompiling
     */
    private void iI(class_4588 var1_1, Matrix4f var2_2, class_243 var3_3, double var4_4, double var6_5, int var8_6, int var9_7) {
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
    private static void iJ(class_4588 var0, Matrix4f var1_1, class_243 var2_2, class_243 var3_3, class_243 var4_4, class_243 var5_5, int var6_6, int var7_7, int var8_8, int var9_9) {
        var20_10 = 2050653689;
        var19_11 = 1180284026;
        var16_12 = eE.h & 2050653689 ^ 927381651;
        var18_13 = 0;
        var17_20 = (var16_12 | var20_10) ^ 906140018;
        var18_13 = (var16_12 | var20_10) ^ 396552698;
        ** GOTO lbl150
lbl8:
        // 1 sources

        block35: while (true) {
            switch (var18_13) {
                case -1821786097: {
                    eE.vertex(var0, var1_1, var5_5, var13_17, var14_18, var15_19, var9_9);
                    ** GOTO lbl42
                }
                case -1028511294: {
                    var17_20 ^= var18_13 ^ -1237624522;
                    ** break;
                }
                case -551096422: {
                    var17_20 ^= var18_13 ^ -1717402814;
                    ** break;
                }
                case -1870123981: {
                    var17_20 ^= var18_13 ^ 2065599385;
                    var18_13 = (var16_12 | var20_10) ^ 1071861492;
                    ** GOTO lbl81
                }
lbl23:
                // 1 sources

                var18_13 = (var16_12 | var20_10) ^ 707277913;
                continue block35;
lbl25:
                // 1 sources

                var18_13 = (var16_12 | var20_10) ^ 1455700698;
                continue block35;
                case -1768982459: {
                    eE.vertex(var0, var1_1, var4_4, var13_17, var14_18, var15_19, var9_9);
                    var18_13 = (var16_12 | var20_10) ^ 1888161258;
                    continue block35;
                }
                case -718602091: {
                    eE.vertex(var0, var1_1, var3_3, var10_14, var11_15, var12_16, var7_7);
                    var18_13 = (var16_12 | var20_10) ^ 1127427093;
                    ** GOTO lbl81
                }
                case 533323716: {
                    var17_20 ^= var18_13 ^ -1364308347;
                    ** GOTO lbl70
                }
                case -596914333: {
                    eE.vertex(var0, var1_1, var2_2, var10_14, var11_15, var12_16, var7_7);
                    var18_13 = (var16_12 | var20_10) ^ 878745848;
                    ** GOTO lbl81
                }
lbl42:
                // 1 sources

                var18_13 = (var16_12 | var20_10) ^ -1110649799;
                continue block35;
                case 1260283139: {
                    var17_20 ^= var18_13 ^ -358726175;
                    ** GOTO lbl63
                }
                case 1187071394: {
                    eE.vertex(var0, var1_1, var2_2, var10_14, var11_15, var12_16, var7_7);
                    var18_13 = (var16_12 | var20_10) ^ -269037112;
                    ** GOTO lbl81
                }
                case 700106529: {
                    eE.vertex(var0, var1_1, var5_5, var13_17, var14_18, var15_19, var9_9);
                    var18_13 = (var16_12 | var20_10) ^ -1604840863;
                    continue block35;
                }
                case 1431751074: {
                    eE.vertex(var0, var1_1, var4_4, var13_17, var14_18, var15_19, var9_9);
                    var18_13 = (var16_12 | var20_10) ^ 1623999423;
                    continue block35;
                }
                case 531807812: {
                    var17_20 ^= var18_13 ^ 1655852301;
                    var18_13 = (var16_12 | var20_10) ^ 406335341;
                    continue block35;
                }
lbl63:
                // 1 sources

                var18_13 = (var16_12 | var20_10) ^ -1437205138;
                continue block35;
                case 267776017: {
                    var17_20 ^= var18_13 ^ 409270196;
                    ** GOTO lbl72
                }
                case 1084076815: {
                    return;
                }
lbl70:
                // 1 sources

                var18_13 = (var16_12 | var20_10) ^ 968865881;
                continue block35;
lbl72:
                // 1 sources

                var18_13 = (var16_12 | var20_10) ^ -334021132;
                continue block35;
                case 1011732974: {
                    var17_20 ^= var18_13 ^ -1260596005;
                    var18_13 = (var16_12 | var20_10) ^ -370047554;
                    ** GOTO lbl81
                }
                case 2060983876: {
                    var17_20 ^= var18_13 ^ 1583833784;
                    var18_13 = (var16_12 | var20_10) ^ -1558891880;
                }
lbl81:
                // 7 sources

                default: {
                    continue block35;
                }
                case 1732694678: 
            }
            eE.vertex(var0, var1_1, var3_3, var10_14, var11_15, var12_16, var7_7);
            var18_13 = (var16_12 | var20_10) ^ 1622614591;
            continue;
            break;
        }
lbl87:
        // 1 sources

        while (true) {
            var13_17 = var8_8 >> eE.iB(((var17_20 ^= 841558729) | var20_10) ^ -196709494, (var16_12 | var20_10) ^ ((var17_20 | var20_10) ^ -1096579498)) & eE.iB((var17_20 | var20_10) ^ -196709495, (var16_12 | var20_10) ^ ((var17_20 | var20_10) ^ 1227326317));
            var14_18 = var8_8 >> eE.iB((var17_20 | var20_10) ^ -196709496, (var16_12 | var20_10) ^ ((var17_20 | var20_10) ^ 555618356)) & eE.iB((var17_20 | var20_10) ^ -196709489, (var16_12 | var20_10) ^ ((var17_20 | var20_10) ^ -982610705));
            var15_19 = var8_8 & eE.iB((var17_20 | var20_10) ^ -196709490, (var16_12 | var20_10) ^ ((var17_20 | var20_10) ^ 1930073906));
            var18_13 = (var16_12 | var20_10) ^ 94823359;
            ** continue;
            break;
        }
        {
            var18_13 = (var16_12 | var20_10) ^ -1806230520;
            block38: while (true) {
                switch (var18_13) {
                    case -1996253006: {
                        var17_20 ^= var18_13 ^ -1063460990;
                        var18_13 = (var16_12 | var20_10) ^ 317529389;
                        continue block38;
                    }
                    case -349576717: {
                        var17_20 ^= var18_13 ^ 1382598197;
                        var18_13 = (var16_12 | var20_10) ^ 416829913;
                        continue block38;
                    }
                    case -237475410: {
                        var17_20 ^= var18_13 ^ 517024163;
                        ** break;
                    }
                    case 1738976290: {
                        if (var7_7 != 0) ** GOTO lbl147
                        ** GOTO lbl137
                    }
                    case 1838407894: {
                        return;
                    }
                    case 1013172611: {
                        var10_14 = var6_6 >> eE.iB((var17_20 | var18_13 ^ var19_11) ^ (var18_13 ^ -937117692), (var16_12 | var18_13 ^ var19_11) ^ ((var17_20 | var18_13 ^ var19_11) ^ (var18_13 ^ 1638320273))) & eE.iB((var17_20 | var18_13 ^ var19_11) ^ (var18_13 ^ -937117691), (var16_12 | var18_13 ^ var19_11) ^ ((var17_20 | var18_13 ^ var19_11) ^ (var18_13 ^ 995837475)));
                        var11_15 = var6_6 >> eE.iB((var17_20 | var18_13 ^ var19_11) ^ (var18_13 ^ -937117690), (var16_12 | var18_13 ^ var19_11) ^ ((var17_20 | var18_13 ^ var19_11) ^ (var18_13 ^ 1517058788))) & eE.iB((var17_20 | var18_13 ^ var19_11) ^ (var18_13 ^ -937117689), (var16_12 | var18_13 ^ var19_11) ^ ((var17_20 | var18_13 ^ var19_11) ^ (var18_13 ^ -29971767)));
                        var12_16 = var6_6 & eE.iB((var17_20 | var18_13 ^ var19_11) ^ (var18_13 ^ -937117688), (var16_12 | var18_13 ^ var19_11) ^ ((var17_20 | var18_13 ^ var19_11) ^ (var18_13 ^ 850211809)));
                        ** continue;
                    }
                    case 1759253505: {
                        ** break;
                    }
                    case 766167217: {
                        var17_20 ^= var18_13 ^ -1269767858;
                        ** GOTO lbl143
                    }
                    case -1981330384: {
                        var7_7 = class_3532.method_15340((int)var7_7, (int)0, (int)eE.iB((var17_20 | var18_13 ^ -203607607) ^ (var18_13 ^ -132104267), (var16_12 | var18_13 ^ -203607607) ^ ((var17_20 | var18_13 ^ -203607607) ^ (var18_13 ^ 2129056690))));
                        ** GOTO lbl141
                    }
                    case -167759077: {
                        var17_20 ^= var18_13 ^ 1461135158;
                        var18_13 = (var16_12 | var20_10) ^ -157699637;
                        break;
                    }
                    case 1755515900: {
                        var9_9 = class_3532.method_15340((int)var9_9, (int)0, (int)eE.iB((var17_20 | var18_13 ^ 312047109) ^ (var18_13 ^ -1671071620), (var16_12 | var18_13 ^ 312047109) ^ ((var17_20 | var18_13 ^ 312047109) ^ (var18_13 ^ 895211746))));
                        continue block37;
                    }
lbl132:
                    // 1 sources

                    var18_13 = (var16_12 | var20_10) ^ 400422407;
                    break;
                    case 1534565809: {
                        var18_13 = (var16_12 | var20_10) ^ 1823347986;
                        break;
                    }
lbl137:
                    // 1 sources

                    var18_13 = (var16_12 | var20_10) ^ 604594250;
                    break;
lbl139:
                    // 1 sources

                    var18_13 = (var16_12 | var20_10) ^ -1988178208;
                    continue block38;
lbl141:
                    // 1 sources

                    var18_13 = (var16_12 | var20_10) ^ -1901685675;
                    continue block38;
lbl143:
                    // 1 sources

                    var18_13 = (var16_12 | var20_10) ^ 1125987448;
                    continue block38;
                    case 332458217: {
                        if (var9_9 == 0) ** GOTO lbl149
lbl147:
                        // 2 sources

                        var18_13 = (var16_12 | var20_10) ^ 1389638986;
                        break;
lbl149:
                        // 1 sources

                        var18_13 = (var16_12 | var20_10) ^ -159554231;
                    }
                }
lbl150:
                // 8 sources

            }
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static void vertex(class_4588 class_45882, Matrix4f matrix4f, class_243 class_2432, int n2, int n3, int n4, int n5) {
        int n6 = 172790506;
        int n7 = h & 0xA4C92EA ^ 0xC20821E3;
        int n8 = 0;
        int n9 = (n7 | n6) ^ 0xF5005B09;
        n8 = (n7 | n6) ^ 0x63C43033;
        boolean bl2 = true;
        block7: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n8 = (n7 | n6) ^ 0xD7C80FB4;
            }
            block8: while (true) {
                switch (n8) {
                    default: {
                        continue block8;
                    }
                    case -1450671144: {
                        n8 = (n7 | n6) ^ 0xC350C7AF;
                        continue block8;
                    }
                    case 495238239: {
                        class_45882.method_22918((Matrix4fc)matrix4f, (float)class_2432.field_1352, (float)class_2432.field_1351, (float)class_2432.field_1350).method_1336(n2, n3, n4, n5);
                        n8 = (n7 | n6) ^ 0x3DAF0B4C;
                        continue block8;
                    }
                    case 152859716: {
                        n9 ^= n8 ^ 0xFD578E28;
                        continue block7;
                    }
                    case -136071001: {
                        n9 ^= n8 ^ 0x17B6B445;
                        n8 = (n7 | n6) ^ 0x3FA8881E;
                        continue block8;
                    }
                    case -169591819: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double iK(hZ hZ2, double d2, double d3) {
        int n2 = h & 0x8F30EE54 ^ 0xF553D54C;
        int n3 = 0;
        int n4 = (n2 | 0x8F30EE54) ^ 0xC7A83149;
        n3 = (n2 | 0x8F30EE54) ^ 0x5471A29A;
        block5: while (true) {
            switch (n3) {
                case -1425908282: {
                    n3 = (n2 | 0x8F30EE54) ^ 0x5A27621D;
                    continue block5;
                }
                case -1521181375: {
                    n4 ^= n3 ^ 0x8B6CC7E5;
                    n3 = (n2 | 0x8F30EE54) ^ 0xFE4F5711;
                }
                default: {
                    continue block5;
                }
                case 20752461: 
            }
            break;
        }
        return class_3532.method_15350((double)(1.0 - (d2 - (double)hZ2.tick()) / d3), (double)0.0, (double)1.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double iL(float f2, double d2) {
        int n2 = h & 0x754B5C4D ^ 0x20E47D25;
        int n3 = 0;
        int n4 = (n2 | 0x754B5C4D) ^ 0x573EEC65;
        n3 = (n2 | 0x754B5C4D) ^ 0x6D2FFD9B;
        block5: while (true) {
            block6: {
                switch (n3) {
                    default: {
                        continue block5;
                    }
                    case 415269110: {
                        break block6;
                    }
                    case 708233612: {
                        n4 ^= n3 ^ 0x40F7585C;
                        break;
                    }
                    case -803925909: {
                        return 0.5 * (double)f2 * (0.3 + 0.7 * d2);
                    }
                }
                n3 = (n2 | 0x754B5C4D) ^ 0xA5FA6D06;
                continue;
            }
            n3 = (n2 | 0x754B5C4D) ^ 0x5FD9B4E1;
        }
    }

    /*
     * Unable to fully structure code
     */
    private int iM(double var1_1, double var3_2) {
        block36: {
            block38: {
                block35: {
                    var11_3 = 858624722;
                    var10_4 = -2017677431;
                    var9_5 = -1671516259;
                    var6_6 = eE.h & -2017677431 ^ 447445676;
                    var8_7 = 0;
                    ** GOTO lbl107
lbl7:
                    // 1 sources

                    while (true) {
                        if (!this.a.is(eE.f)) break block35;
                        ** GOTO lbl79
                        break;
                    }
lbl10:
                    // 1 sources

                    return eE.iN(eE.iB((var7_8 | var8_7 ^ var9_5) ^ (var8_7 ^ 396603847), (var6_6 | var8_7 ^ var9_5) ^ ((var7_8 | var8_7 ^ var9_5) ^ (var8_7 ^ -148271549))), eE.iB((var7_8 | var8_7 ^ var9_5) ^ (var8_7 ^ 396603846), (var6_6 | var8_7 ^ var9_5) ^ ((var7_8 | var8_7 ^ var9_5) ^ (var8_7 ^ 1513775817))), (float)var3_2);
lbl12:
                    // 1 sources

                    while (true) {
                        var8_7 = (var6_6 | var10_4) ^ -954455451;
                        break block36;
                        break;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        block37: {
                            var8_7 = (var6_6 | var10_4) ^ 739230017;
                            break block36;
lbl18:
                            // 1 sources

                            while (true) {
                                var8_7 = (var6_6 | var10_4) ^ -1516941304;
                                break block36;
                                break;
                            }
lbl21:
                            // 1 sources

                            while (true) {
                                break block37;
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                var7_8 ^= var8_7 ^ -1248777588;
                                break block38;
                                break;
                            }
                        }
                        return class_3532.method_15369((float)var5_9, (float)0.85f, (float)1.0f) & eE.iB(((var7_8 ^= -1709189742) | var10_4) ^ 872473007, (var6_6 | var10_4) ^ ((var7_8 | var10_4) ^ -182222678));
                    }
                }
                var8_7 = (var6_6 | var10_4) ^ 117123533;
                break block36;
lbl31:
                // 1 sources

                while (true) {
                    block39: {
                        var8_7 = (var6_6 | var10_4) ^ -1678726938;
                        break block36;
lbl34:
                        // 1 sources

                        while (true) {
                            var7_8 ^= var8_7 ^ 1705141514;
                            break block39;
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var7_8 ^= var8_7 ^ -1070441951;
                            ** GOTO lbl69
                            break;
                        }
                    }
                    var8_7 = (var6_6 | var10_4) ^ 724484854;
                    break block36;
lbl43:
                    // 1 sources

                    while (true) {
                        var7_8 ^= var8_7 ^ 1214830917;
                        ** continue;
                        break;
                    }
                    break;
                }
lbl46:
                // 1 sources

                while (true) {
                    var8_7 = (var6_6 | var10_4) ^ -2074214471;
                    break block36;
                    break;
                }
            }
            var8_7 = (var6_6 | var10_4) ^ -3694844;
        }
lbl52:
        // 2 sources

        block29: while (true) {
            switch (var8_7) lbl-1000:
            // 7 sources

            {
                while (true) {
                    default: {
                        continue block29;
                    }
                    break;
                }
                case 1487132104: {
                    ** continue;
                }
                case 467795988: {
                    ** continue;
                }
                case 200862865: {
                    ** continue;
                }
                case 2024794347: {
                    ** continue;
                }
                case -222103484: {
                    ** continue;
                }
                case -398757087: {
                    ** continue;
                }
lbl69:
                // 1 sources

                var8_7 = (var6_6 | var10_4) ^ -842045766;
                ** GOTO lbl-1000
                case -1265549989: {
                    return eE.iN(eE.iB((var7_8 | var8_7 ^ var11_3) ^ (var8_7 ^ -1999581995), (var6_6 | var8_7 ^ var11_3) ^ ((var7_8 | var8_7 ^ var11_3) ^ (var8_7 ^ 239497646))), eE.iB((var7_8 | var8_7 ^ var11_3) ^ (var8_7 ^ -1999582006), (var6_6 | var8_7 ^ var11_3) ^ ((var7_8 | var8_7 ^ var11_3) ^ (var8_7 ^ 1063649454))), (float)var3_2);
                }
lbl73:
                // 1 sources

                while (true) {
                    var8_7 = (var6_6 | var10_4) ^ -418375866;
                    ** GOTO lbl-1000
                    break;
                }
                while (true) {
                    var8_7 = (var6_6 | var10_4) ^ 1181345667;
                    ** GOTO lbl-1000
                    break;
                }
lbl79:
                // 1 sources

                var8_7 = (var6_6 | var10_4) ^ 2005175436;
                ** GOTO lbl-1000
                case 69083420: {
                    var7_8 ^= var8_7 ^ -1263235373;
                    ** continue;
                }
                case -640280530: {
                    var7_8 ^= var8_7 ^ -1500477417;
                    ** continue;
                }
                case 1618501801: {
                    if (!this.a.is(eE.d)) ** continue;
                    ** continue;
                }
                while (true) {
                    var8_7 = (var6_6 | var10_4) ^ -1807281348;
                    ** GOTO lbl-1000
                    break;
                }
                case -1280295188: {
                    break block29;
                }
lbl95:
                // 1 sources

                while (true) {
                    var8_7 = (var6_6 | var10_4) ^ -1683890511;
                    ** continue;
                    break;
                }
                case -1723541920: {
                    var7_8 ^= var8_7 ^ 1285000057;
                    ** continue;
                }
                case 72308555: {
                    var5_9 = (float)(var1_1 * 0.045 % 1.0);
                    ** continue;
                }
                case 1383110935: {
                    if (!this.a.is(eE.c)) ** continue;
                    ** continue;
                }
lbl107:
                // 1 sources

                var7_8 = (var6_6 | var10_4) ^ -1176869945;
                ** continue;
            }
            break;
        }
        var8_7 = (var6_6 | var10_4) ^ 1836910569;
        ** while (true)
        {
            ** case 975876005:
        }
lbl112:
        // 1 sources

        return (Integer)this.a.getValue() & eE.iB((var7_8 | var8_7 ^ -1114243028) ^ (var8_7 ^ 1181437441), (var6_6 | var8_7 ^ -1114243028) ^ ((var7_8 | var8_7 ^ -1114243028) ^ (var8_7 ^ 190782411)));
    }

    /*
     * Unable to fully structure code
     */
    private static int iN(int var0, int var1_1, float var2_2) {
        block18: {
            block19: {
                block17: {
                    var10_3 = 136482673;
                    var9_4 = 95972849;
                    var6_5 = eE.h & 136482673 ^ -663261342;
                    var8_6 = 0;
                    ** GOTO lbl43
lbl6:
                    // 1 sources

                    return var3_7 << eE.iB(((var7_10 ^= 553483599) | var10_3) ^ -266608355, (var6_5 | var10_3) ^ ((var7_10 | var10_3) ^ -1591279081)) | var4_8 << eE.iB((var7_10 | var10_3) ^ -266608356, (var6_5 | var10_3) ^ ((var7_10 | var10_3) ^ 1339400959)) | var5_9;
lbl8:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var8_6 = (var6_5 | var10_3) ^ -705884685;
                        break block17;
lbl13:
                        // 1 sources

                        while (true) {
                            var7_10 ^= var8_6 ^ 1820239657;
                            ** GOTO lbl39
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        break;
                    }
                    var3_7 = class_3532.method_48781((float)var2_2, (int)(var0 >> eE.iB((var7_10 | var8_6 ^ var9_4) ^ (var8_6 ^ -1730845807), (var6_5 | var8_6 ^ var9_4) ^ ((var7_10 | var8_6 ^ var9_4) ^ (var8_6 ^ -1207347434))) & eE.iB((var7_10 | var8_6 ^ var9_4) ^ (var8_6 ^ -1730845808), (var6_5 | var8_6 ^ var9_4) ^ ((var7_10 | var8_6 ^ var9_4) ^ (var8_6 ^ 1220367189)))), (int)(var1_1 >> eE.iB((var7_10 | var8_6 ^ var9_4) ^ (var8_6 ^ -1730845805), (var6_5 | var8_6 ^ var9_4) ^ ((var7_10 | var8_6 ^ var9_4) ^ (var8_6 ^ 84258412))) & eE.iB((var7_10 | var8_6 ^ var9_4) ^ (var8_6 ^ -1730845806), (var6_5 | var8_6 ^ var9_4) ^ ((var7_10 | var8_6 ^ var9_4) ^ (var8_6 ^ 228748025)))));
                    break block19;
                }
lbl21:
                // 4 sources

                block12: while (true) {
                    switch (var8_6) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block12;
                            }
                            break;
                        }
                        case 228254336: {
                            ** continue;
                        }
                        case -150963851: {
                            break block12;
                        }
                        case 138939231: {
                            ** continue;
                        }
                        case 1738277999: {
                            ** continue;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            ** continue;
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            var5_9 = class_3532.method_48781((float)var2_2, (int)(var0 & eE.iB(((var7_10 ^= 1016319528) | var10_3) ^ -792293103, (var6_5 | var10_3) ^ ((var7_10 | var10_3) ^ -1927547715))), (int)(var1_1 & eE.iB((var7_10 | var10_3) ^ -792293104, (var6_5 | var10_3) ^ ((var7_10 | var10_3) ^ -1450730015))));
                            ** continue;
                            break;
                        }
lbl39:
                        // 1 sources

                        var8_6 = (var6_5 | var10_3) ^ -1075057892;
                        ** continue;
lbl41:
                        // 1 sources

                        while (true) {
                            ** continue;
                            break;
                        }
lbl43:
                        // 1 sources

                        var7_10 = (var6_5 | var10_3) ^ 145824481;
                        break block18;
                    }
                    break;
                }
                var8_6 = (var6_5 | var10_3) ^ -801119188;
                ** GOTO lbl21
            }
            var4_8 = class_3532.method_48781((float)var2_2, (int)(var0 >> eE.iB(((var7_10 ^= 1897553664) | var10_3) ^ -464006883, (var6_5 | var10_3) ^ ((var7_10 | var10_3) ^ 640662588)) & eE.iB((var7_10 | var10_3) ^ -464006884, (var6_5 | var10_3) ^ ((var7_10 | var10_3) ^ -482473222))), (int)(var1_1 >> eE.iB((var7_10 | var10_3) ^ -464006881, (var6_5 | var10_3) ^ ((var7_10 | var10_3) ^ -1721594665)) & eE.iB((var7_10 | var10_3) ^ -464006882, (var6_5 | var10_3) ^ ((var7_10 | var10_3) ^ -1010741869))));
            ** while (true)
        }
        var8_6 = (var6_5 | var10_3) ^ 796366342;
        ** GOTO lbl21
        var2_2 = class_3532.method_15363((float)var2_2, (float)0.0f, (float)1.0f);
        var8_6 = (var6_5 | var10_3) ^ 25625809;
        ** while (true)
        {
            ** case -638522462:
        }
lbl57:
        // 1 sources

        var7_10 ^= var8_6 ^ 2079535705;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private List<class_1684> iO(class_310 var1_1, class_243 var2_2, double var3_3) {
        block29: {
            break block29;
lbl1:
            // 2 sources

            while (true) {
                var13_6 = (var11_5 | var14_4) ^ -637787307;
                if (true) ** GOTO lbl65
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var12_12 ^= 1698022786;
                var9_10 = var1_1.field_1687.method_8390(class_1684.class, var5_7, (Predicate<class_1684>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, iR(net.minecraft.class_1684 ), (Lnet/minecraft/class_1684;)Z)()).iterator();
                ** GOTO lbl1
                break;
            }
lbl8:
            // 1 sources

            block23: while (true) {
                switch (var13_6) {
                    case 1315752668: {
                        var8_9.add(var10_11);
                        break;
                    }
                    case 1650464539: {
                        var12_12 ^= var13_6 ^ 1385938281;
                        var13_6 = (var11_5 | var14_4) ^ -233968241;
                        continue block23;
                    }
                    case 421462282: {
                        var12_12 ^= var13_6 ^ -1341269806;
                        var13_6 = (var11_5 | var14_4) ^ 1438922542;
                        continue block23;
                    }
                    case -1438922623: {
                        ** continue;
                    }
                    case 233968160: {
                        if (!(var10_11.method_5707(var2_2) <= var6_8)) break;
                        var13_6 = (var11_5 | var14_4) ^ -1380163952;
                    }
                    default: {
                        continue block23;
                    }
                    case 1380163903: {
                        var13_6 = (var11_5 | var14_4) ^ -1315752589;
                        continue block23;
                    }
                }
                var13_6 = (var11_5 | var14_4) ^ -421462363;
                continue;
                break;
            }
lbl34:
            // 1 sources

            while (true) {
                var8_9 = new ArrayList<class_1684>();
                ** continue;
                break;
            }
        }
        var14_4 = -1017974364;
        var11_5 = eE.h & -1017974364 ^ -1074815313;
        var13_6 = 0;
        var12_12 = (var11_5 | var14_4) ^ -11589550;
        var13_6 = (var11_5 | var14_4) ^ -2120886300;
        block25: while (true) {
            switch (var13_6) {
                default: {
                    continue block25;
                }
                case 1651168622: {
                    var5_7 = new class_238(var2_2.field_1352 - var3_3, var2_2.field_1351 - var3_3, var2_2.field_1350 - var3_3, var2_2.field_1352 + var3_3, var2_2.field_1351 + var3_3, var2_2.field_1350 + var3_3);
                    var12_12 ^= -156004965;
                    var6_8 = var3_3 * var3_3;
                    var12_12 ^= -618236618;
                    ** continue;
                }
                case 2120886347: {
                    var13_6 = (var11_5 | var14_4) ^ 294046801;
                    continue block25;
                }
                case -294046722: 
            }
            var12_12 ^= var13_6 ^ -703803882;
            var13_6 = (var11_5 | var14_4) ^ -1651168575;
        }
        block26: while (true) {
            var13_6 = (var11_5 | var14_4) ^ 2104795047;
            if (true) ** GOTO lbl65
            block27: while (true) {
                var13_6 = (var11_5 | var14_4) ^ -1930028715;
lbl65:
                // 3 sources

                block28: while (true) {
                    switch (var13_6) {
                        default: {
                            continue block28;
                        }
                        case -2104795128: {
                            var12_12 ^= var13_6 ^ 822147365;
                            var13_6 = (var11_5 | var14_4) ^ 1918136538;
                            continue block28;
                        }
                        case -1211743084: {
                            var12_12 ^= var13_6 ^ 1698827963;
                            var13_6 = (var11_5 | var14_4) ^ 228448640;
                            continue block28;
                        }
                        case -228448721: {
                            var10_11 = (class_1684)var9_10.next();
                            var13_6 = (var11_5 | var14_4) ^ -1650464588;
                            ** continue;
                        }
                        case 637787386: {
                            var12_12 ^= var13_6 ^ 1835984255;
                            continue block27;
                        }
                        case 1930028794: {
                            if (!var9_10.hasNext()) continue block26;
                            var13_6 = (var11_5 | var14_4) ^ 1211743035;
                            continue block28;
                        }
                        case -1918136459: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return var8_9;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static class_243 iP(class_1684 class_16842) {
        int n2 = h & 0x7E6CAD65 ^ 0xE1EAA482;
        int n3 = 0;
        int n4 = (n2 | 0x7E6CAD65) ^ 0x23F2CE1B;
        n3 = (n2 | 0x7E6CAD65) ^ 0x50DFE70F;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -210417038: {
                    return class_16842.method_73189().method_1031(0.0, (double)class_16842.method_17682() * 0.5, 0.0);
                }
                case -1355724056: {
                    n3 = (n2 | 0x7E6CAD65) ^ 0x39C9E45D;
                    continue block5;
                }
                case -970503750: 
            }
            n4 ^= n3 ^ 0x7C74AEF4;
            n3 = (n2 | 0x7E6CAD65) ^ 0xC9BE795;
        }
    }

    /*
     * Unable to fully structure code
     */
    private int iQ() {
        block9: {
            break block9;
            {
                var3_2 = (var1_1 | 1157389010) ^ -1277503233;
                block6: while (true) {
                    switch (var3_2) lbl-1000:
                    // 3 sources

                    {
                        default: {
                            continue block6;
                        }
lbl6:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 1157389010) ^ -762160870;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -333076952: {
                            var2_3 ^= var3_2 ^ -382033427;
                            var3_2 = (var1_1 | 1157389010) ^ 1141459721;
                            ** GOTO lbl-1000
                        }
                        case -1922226227: {
                            continue block5;
                        }
                        case 469120478: 
                    }
                    break;
                }
            }
            return Math.max(1, Math.round(((Float)this.c.getValue()).floatValue() * 20.0f));
        }
        var1_1 = eE.h & 1157389010 ^ 530802181;
        var3_2 = 0;
        var2_3 = (var1_1 | 1157389010) ^ -1269851372;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean iR(class_1684 class_16842) {
        int n2 = h & 0xFF15C7BD ^ 0x6F6539B;
        int n3 = 0;
        int n4 = (n2 | 0xFF15C7BD) ^ 0x46CF5E40;
        n3 = (n2 | 0xFF15C7BD) ^ 0x596C0F17;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1499735896: {
                    n3 = (n2 | 0xFF15C7BD) ^ 0x3515131D;
                    continue block5;
                }
                case 1699216754: {
                    return true;
                }
                case -891108190: 
            }
            n4 ^= n3 ^ 0x99B03162;
            n3 = (n2 | 0xFF15C7BD) ^ 0x9AB02ACD;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean iS(kA var1_1) {
        var5_2 = -1488720079;
        var2_3 = eE.h & -1488720079 ^ 1729250855;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 1741226517;
        var4_4 = (var2_3 | var5_2) ^ -1701653631;
        ** GOTO lbl12
        while (true) {
            var4_4 = (var2_3 | var5_2) ^ -1869443420;
            if (true) ** GOTO lbl12
            break;
        }
        block10: while (true) {
            var4_4 = (var2_3 | var5_2) ^ 1153905192;
lbl12:
            // 3 sources

            block11: while (true) {
                block12: {
                    switch (var4_4) {
                        case 1056395351: {
                            var3_5 ^= var4_4 ^ -2109704982;
                            var4_4 = (var2_3 | var5_2) ^ -331093134;
                            continue block11;
                        }
                        case 2109815990: {
                            var4_4 = (var2_3 | var5_2) ^ -643514528;
                            continue block11;
                        }
                        case 2009162131: {
                            var3_5 ^= var4_4 ^ 1214638646;
                            break block12;
                        }
                        case 150934527: {
                            v0 = true;
                            ** GOTO lbl32
                        }
                        case 185599045: {
                            if (this.f - var1_1.a <= eE.iB((var3_5 | var4_4 ^ -1403786380) ^ (var4_4 ^ 1069802912), (var2_3 | var4_4 ^ -1403786380) ^ ((var3_5 | var4_4 ^ -1403786380) ^ (var4_4 ^ -1473426080)))) ** continue;
                            continue block10;
                        }
                        case -2135432816: {
                            v0 = false;
lbl32:
                            // 2 sources

                            var3_5 ^= 297709905;
                            return v0;
                        }
                        case -1550525153: {
                            var3_5 ^= var4_4 ^ -1674553670;
                            ** break;
lbl37:
                            // 1 sources

                            var4_4 = (var2_3 | var5_2) ^ -273875768;
                        }
                    }
                    continue;
                }
                var4_4 = (var2_3 | var5_2) ^ 1742999207;
            }
            break;
        }
    }
}

