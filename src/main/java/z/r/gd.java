/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_2338
 *  net.minecraft.class_2374
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_3486
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  org.lwjgl.glfw.GLFW
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3486;
import net.minecraft.class_3959;
import org.lwjgl.glfw.GLFW;
import z.r.aQ;
import z.r.bM;
import z.r.dR;
import z.r.dX;
import z.r.eB;
import z.r.ej;
import z.r.gP;
import z.r.gj;
import z.r.ix;
import z.r.ke;
import z.r.lw;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class gd
extends bM {
    private final ke a;
    private static final float a;
    private final dX a;
    private static final /* synthetic */ String s;
    private static gd a;
    public static final int k;
    private boolean a;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private int a;
    private static final int[] a;
    private final ke b;
    private static final /* synthetic */ String d;
    private eB a;
    private static final long a;
    private static final /* synthetic */ String e;
    private int b;
    private class_1268 a;
    private dR a;
    private boolean b;
    private String f;
    private static final float b;
    private static final /* synthetic */ String k;
    private final ke c;
    private static final int c;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private int d;
    private long b;
    private float c;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final long c;
    private final gP a;
    private static final double a;
    private static final /* synthetic */ String l;
    private float d;
    private static final long d;
    private static final /* synthetic */ String m;
    private int e;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private int f;
    private class_243 a;
    private int g;
    private final ke d;
    private final gP b;
    private static final double b;
    private final gP c;
    private final ke e;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private boolean c;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String t;
    private static final int h;
    private boolean d;
    private static final int i;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final int j;
    private boolean e;
    private final ej a;

    /*
     * Exception decompiling
     */
    public gd() {
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
    public static gd instance() {
        int n2 = k & 0xFF7E535A ^ 0xD70CCDE6;
        int n3 = 0;
        int n4 = (n2 | 0xFF7E535A) ^ 0xA7599FB7;
        n3 = (n2 | 0xFF7E535A) ^ 0x20742437;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -777740880: {
                    n4 ^= n3 ^ 0xAD8B0B07;
                    n3 = (n2 | 0xFF7E535A) ^ 0x7536C235;
                    continue block5;
                }
                case -552928311: {
                    n3 = (n2 | 0xFF7E535A) ^ 0x2EDA424E;
                    continue block5;
                }
                case -1974985269: 
            }
            break;
        }
        return a;
    }

    /*
     * Unable to fully structure code
     */
    public boolean wantsRotation() {
        block22: {
            var4_1 = 1283598648;
            var1_2 = gd.k & 1283598648 ^ -1271155157;
            var3_3 = 0;
            ** GOTO lbl27
lbl5:
            // 1 sources

            return v0;
lbl7:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -357556045;
                ** GOTO lbl16
                break;
            }
lbl10:
            // 1 sources

            block13: while (true) {
                block21: {
                    var3_3 = (var1_2 | var4_1) ^ 96682130;
                    break block21;
lbl13:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 824008181;
                        ** GOTO lbl25
                        break;
                    }
                }
lbl17:
                // 6 sources

                block15: while (true) {
                    switch (var3_3) lbl-1000:
                    // 3 sources

                    {
                        default: {
                            continue block15;
                        }
                        case 2115828340: {
                            break block13;
                        }
                        case 661357072: {
                            ** continue;
                        }
lbl25:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 120355008;
                        ** GOTO lbl-1000
lbl27:
                        // 1 sources

                        var2_4 = (var1_2 | var4_1) ^ -649756825;
                        break;
                    }
                    break;
                }
                break;
            }
            var3_3 = (var1_2 | var4_1) ^ -2129229023;
            ** GOTO lbl17
            {
                case -438937875: {
                    if (this.a == eB.h) break;
                    ** continue;
                }
                case 797445612: {
                    v0 = false;
                    break block22;
                }
            }
            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1435776384;
                ** GOTO lbl17
                break;
            }
        }
lbl41:
        // 2 sources

        while (true) {
            var2_4 ^= 1908511678;
            ** continue;
            break;
        }
        {
            case -73938949: {
                v0 = true;
                ** continue;
            }
        }
lbl47:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -751586601;
            ** GOTO lbl17
            break;
        }
        {
            case -109510743: {
                if (!this.a.active()) ** continue;
                var3_3 = (var1_2 | var4_1) ^ -607109845;
                ** GOTO lbl-1000
            }
            case 369860488: {
                ** continue;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ -2102966961;
        ** GOTO lbl17
        {
            case -1456502085: {
                var2_4 ^= var3_3 ^ -1084664482;
                ** continue;
            }
        }
lbl61:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 426633686;
            ** continue;
            break;
        }
        {
            ** case 2108503066:
        }
lbl65:
        // 1 sources

        var2_4 ^= var3_3 ^ 1625753005;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public double[] computeAdjustment(double d2) {
        int n2 = k & 0x77B3D3B6 ^ 0xAFBF075C;
        int n3 = 0;
        int n4 = (n2 | 0x77B3D3B6) ^ 0x42F20E30;
        n3 = (n2 | 0x77B3D3B6) ^ 0xD2713ACB;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 768535861: {
                    n3 = (n2 | 0x77B3D3B6) ^ 0x302C628F;
                    continue block5;
                }
                case -812403343: {
                    n4 ^= n3 ^ 0x622579BE;
                    n3 = (n2 | 0x77B3D3B6) ^ 0x1588A417;
                    continue block5;
                }
                case -365464599: 
            }
            break;
        }
        return this.a.step(d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        int n2 = 1781842001;
        int n3 = k & 0x6A34C051 ^ 0xBE3AF4E7;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xFD65EEC5;
        n4 = (n3 | n2) ^ 0x6F92D0B2;
        block9: while (true) {
            switch (n4) {
                default: {
                    continue block9;
                }
                case -636853617: {
                    this.e = false;
                    n4 = (n3 | n2) ^ 0xBB0387D0;
                    continue block9;
                }
                case 1537298756: {
                    return;
                }
                case 1161655079: {
                    n5 ^= n4 ^ 0x37AEAC9F;
                    n4 = (n3 | n2) ^ 0xA59FA5B3;
                    continue block9;
                }
                case -1907254901: {
                    this.UP();
                    n4 = (n3 | n2) ^ 0xB3858D4B;
                    continue block9;
                }
                case -1850989499: {
                    n4 = (n3 | n2) ^ 0xAD98534F;
                    continue block9;
                }
                case 1403430840: {
                    n5 ^= n4 ^ 0x7737D04;
                    n4 = (n3 | n2) ^ 0x706F6D7C;
                    continue block9;
                }
                case 1304132028: 
            }
            n5 ^= n4 ^ 0xB95988D6;
            n4 = (n3 | n2) ^ 0x24349678;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onCombatTick() {
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
    private void idle() {
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
    private void UG() {
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
    private void UH() {
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
    private void UI() {
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
    private void UJ() {
        block23: {
            block26: {
                block24: {
                    block25: {
                        break block25;
lbl1:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1875953149;
                            break block23;
lbl4:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 335176699;
                                break block23;
lbl7:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -935128714;
                                    ** GOTO lbl61
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl12:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -507688651;
                                    break block23;
                                    break;
                                }
                                this.b = System.currentTimeMillis();
                                var3_3 = (var1_2 | var4_1) ^ 1542551575;
                                break block23;
lbl18:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 520674352;
                                    ** continue;
                                    break;
                                }
lbl21:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 1205537281;
                                    break block23;
lbl24:
                                    // 1 sources

                                    return;
lbl26:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ 1779968650;
                                        break block24;
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                    }
                    var4_1 = -1444756430;
                    var1_2 = gd.k & -1444756430 ^ -856332639;
                    var3_3 = 0;
                    break block26;
                }
                var3_3 = (var1_2 | var4_1) ^ 1963853679;
                break block23;
lbl37:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -758238239;
                    break block23;
                    break;
                }
            }
            var2_4 = (var1_2 | var4_1) ^ 719882254;
            var3_3 = (var1_2 | var4_1) ^ -294012266;
        }
        block21: while (true) {
            switch (var3_3) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block21;
                    }
                    break;
                }
                case -1439896398: {
                    ** continue;
                }
                case -1728454180: {
                    ** continue;
                }
                case -1241080156: {
                    ** continue;
                }
                case -32668344: {
                    ** continue;
                }
                case 1060754770: {
                    ** continue;
                }
                case 59661349: {
                    ** continue;
                }
lbl61:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 694004347;
                ** continue;
                case 2111364272: {
                    var2_4 ^= var3_3 ^ -897567259;
                    ** continue;
                }
                case 206221190: {
                    this.a = eB.a;
                    ** continue;
                }
                case -995472184: 
            }
            break;
        }
        this.f = 0;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void UK() {
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

    private static int UL(int n2, int n3) {
        int n4 = -1375238542;
        int n5 = 761696780;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x5B5266C8)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xAF676A18;
        n6 += (n5 | n4) ^ 0xAF674AC4;
        n6 -= (n5 | n4) ^ 0xAF67887D;
        n6 -= (n5 | n4) ^ 0xAF67956C;
        n6 ^= (n5 | n4) ^ 0xAF6749AD;
        n6 ^= (n5 | n4) ^ 0xAF673EE5;
        n6 += (n5 | n4) ^ 0xAF67E294;
        return n6 -= (n5 | n4) ^ 0xAF672A6B;
    }

    /*
     * Exception decompiling
     */
    private void UM() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [81[UNCONDITIONALDOLOOP], 4[SWITCH], 74[UNCONDITIONALDOLOOP]], but top level block is 22[SWITCH]
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
    private void UN() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[SWITCH], 51[UNCONDITIONALDOLOOP]], but top level block is 22[SWITCH]
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
    private void UO() {
        var4_1 = 1507831072;
        var1_2 = gd.k & 1507831072 ^ 960164721;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1043385441;
        var3_3 = (var1_2 | var4_1) ^ 189379788;
        if (true) ** GOTO lbl28
        block9: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1635961958;
            block10: while (true) {
                switch (var3_3) {
                    case 1924549565: {
                        var3_3 = (var1_2 | var4_1) ^ -1599851718;
                        ** break;
                    }
                    case -648295349: {
                        var2_4 ^= var3_3 ^ -436564922;
                        var3_3 = (var1_2 | var4_1) ^ 809512471;
                        ** break;
                    }
                    case -58380256: {
                        this.a = eB.h;
                        var3_3 = (var1_2 | var4_1) ^ 320071283;
                        ** break;
                    }
                    case 1793857794: {
                        var2_4 ^= var3_3 ^ -333157137;
                        continue block9;
                    }
                    case 1237307750: {
                        this.a.release();
                        var3_3 = (var1_2 | var4_1) ^ -1836298451;
                    }
lbl28:
                    // 6 sources

                    default: {
                        continue block10;
                    }
                    case -344739748: {
                        var2_4 ^= var3_3 ^ -647977814;
                        var3_3 = (var1_2 | var4_1) ^ -2055549103;
                        continue block10;
                    }
                    case -410858261: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block29: {
            block28: {
                var10 = -2142754269;
                var9_1 = 1610184755;
                var8_2 = -542027216;
                gd.k = mK.a(MethodHandles.lookup().lookupClass(), 637076415);
                var7_3 = 0;
                var6_10 = -1211812867;
                var7_3 = var9_1 ^ -1725919026;
                break block29;
lbl9:
                // 2 sources

                while (true) {
                    var5_9 = (var0_4[var3_7] & (((var6_10 ^= 756494511) | var9_1) ^ -537265780)) << ((var6_10 | var9_1) ^ -537265813) | (var0_4[var3_7 + 1] & ((var6_10 | var9_1) ^ -537265780)) << ((var6_10 | var9_1) ^ -537265821) | (var0_4[var3_7 + 2] & ((var6_10 | var9_1) ^ -537265780)) << ((var6_10 | var9_1) ^ -537265797) | var0_4[var3_7 + 3] & ((var6_10 | var9_1) ^ -537265780);
                    var7_3 = var9_1 ^ -1807246331;
                    ** GOTO lbl-1000
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var7_3 = var9_1 ^ -568097162;
                    break block28;
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
lbl19:
            // 2 sources

            block22: while (true) {
                block31: {
                    block30: {
                        switch (var7_3) {
                            default: {
                                continue block22;
                            }
                            case -2116354491: {
                                var3_7 = 0;
                                var6_10 ^= -590309055;
                                break;
                            }
                            case -989601753: {
                                gd.a = new int[var1_5];
                                break block30;
                            }
                            case -813189724: {
                                var6_10 ^= var7_3 ^ -1434106029;
                                break block31;
                            }
                            case -432861272: {
                                var6_10 ^= var7_3 ^ 286830936;
                                ** continue;
                            }
                        }
                        var4_8 = 0;
                        ** GOTO lbl9
                    }
                    var7_3 = var9_1 ^ -1177913445;
                    continue;
                }
                var7_3 = var9_1 ^ -1694853100;
                continue;
                break;
            }
lbl44:
            // 1 sources

            while (true) {
                var7_3 = var9_1 ^ 1909976298;
                break block29;
                break;
            }
            var7_3 = var9_1 ^ 860887966;
            block24: while (true) {
                switch (var7_3) lbl-1000:
                // 2 sources

                {
                    default: {
                        continue block24;
                    }
                    case -876682186: {
                        var6_10 ^= var7_3 ^ -880337314;
                        var7_3 = var9_1 ^ 595441046;
                        continue block24;
                    }
                    case 1823040429: {
                        var3_7 += 4;
                        if (++var4_8 >= var1_5) ** break;
                        ** continue;
                        var7_3 = var9_1 ^ -291551847;
                        continue block24;
                    }
                    case 2089078181: {
                        gd.a[var4_8] = var5_9 ^= var2_6;
                        break;
                    }
                    case -1491731801: {
                        var6_10 ^= var7_3 ^ -1975832480;
                        ** continue;
                    }
                    case -2142754301: {
                        gd.j = gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633024), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 829468607)));
                        gd.i = gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633023), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1964087895)));
                        gd.h = gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633018), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1893353113)));
                        gd.b = 3.0;
                        gd.d = -7468039451841908181L << (var7_3 ^ var10) >>> (var7_3 ^ var10) ^ (long)var6_10 & 0xFFFFFFFFL | (-7468039451841908181L >>> (var7_3 ^ var10) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ var10);
                        gd.a = 2.75;
                        gd.c = -7468039451841907425L << (var7_3 ^ var10) >>> (var7_3 ^ var10) ^ (long)var6_10 & 0xFFFFFFFFL | (-7468039451841907425L >>> (var7_3 ^ var10) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ var10);
                        gd.c = gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633017), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1305332659)));
                        gd.b = 2.5f;
                        gd.a = -7468039451841908627L << (var7_3 ^ var10) >>> (var7_3 ^ var10) ^ (long)var6_10 & 0xFFFFFFFFL | (-7468039451841908627L >>> (var7_3 ^ var10) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ var10);
                        gd.a = 84.0f;
                        gd.k = gj.decode("JY9/yfx7jnPlj+jpNUB6/g==", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633020), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 425437117))));
                        gd.s = gj.decode("6lQsIWJ4h9LIQIivJkqlV3psmKb4VgYqu+Q8cIWYG+OcsKqhwY11PiwNw5Yd", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633019), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -68806842))));
                        gd.t = gj.decode("JTsSt32ZoOwj", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417632998), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 199704287))));
                        gd.v = gj.decode("u3F1hdJW6BsFOfo=", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417632997), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 541633415))));
                        gd.o = gj.decode("kb8A7cr1b7A/bpOx", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633000), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1110179169))));
                        gd.e = gj.decode("hFlRrw==", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417632999), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1983221384))));
                        gd.i = gj.decode("cVMictqDZlqsnzU/Df2inKQsrlLxPkIQcrantia4i2u7u0MXB/d2cp/Awxd7ce05", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417632994), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1693310174))));
                        gd.j = gj.decode("XsBJB0fDbCByAjwp", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417632993), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 87848857))));
                        gd.c = gj.decode("KjYDuE6qdyjWSYgZtyDF1tQalzE9m3koeMwf9Rz0+p4TYkhtzLzkoYmSV5EWmLbBfNoYdFS/t/cDh7kuoA==", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417632996), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1156571023))));
                        gd.l = gj.decode("nL781soPyg5YHQ==", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417632995), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1466066252))));
                        gd.b = gj.decode("Wgg2XIesaYhE4uHb", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633006), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 86677068))));
                        gd.a = gj.decode("SsIcGcSNfMLviBLJ", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633005), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 30219054))));
                        gd.r = gj.decode("rLtEBCd+Xj0cIA==", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633008), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1951240005))));
                        gd.u = gj.decode("NFyYkjvN6tTGsjwNlrjEOV33JZ/+wTvgXqNUeONh/0d1hzqbHoD/DeUMNkIr4303mRoeRWB0lFx8eQY5bsyX", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633007), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -746753519))));
                        gd.m = gj.decode("IaF/K5WKIoHSuQ==", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633002), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1626654923))));
                        gd.n = gj.decode("fdslJUo9lhfMCbfhzFjtRUmA2vY72sPgdZiTX7fhu+p6AsoopO5pRuRUtKQSCAWEmxd+xszvjYQ=", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633001), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1733169249))));
                        gd.h = gj.decode("mmx950jpiIyvGk3BHM0yKZu16QipU+ZUkoz/jVd/ZYjdHYGicKajJj2B+iZT06qtkuI=", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633004), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1072959893))));
                        gd.p = gj.decode("brMUZbpX3iOeTf1jsG5Bkep5nZ6OAVxWNiRcRxHfJ0OtuwhkAnG/gqZHbVbM4wGkhxcwcSLtYEwKqexCUDy3+Q==", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417633003), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -2104895236))));
                        gd.d = gj.decode("8RiXlpWZAaax7Wk8Px1cq7C6uvFdioPd3j+KvF5M", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417632982), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1792900431))));
                        gd.q = gj.decode("Pw8CYQgB1U6EyQKOVmJdeBukbcX7oesP+/TT", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417632981), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -221707080))));
                        gd.g = gj.decode("AZD6BsREOre9sTXGUwMEbDitoZM38Zx03A==", gd.UL((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1417632984), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 83496441))));
                        return;
                    }
                    case -1318699606: {
                        var6_10 ^= var7_3 ^ -1926910504;
                        ** break;
lbl108:
                        // 1 sources

                        var7_3 = var9_1 ^ var8_2;
                        continue block24;
                    }
                }
                var7_3 = var9_1 ^ -118717804;
            }
lbl112:
            // 1 sources

            while (true) {
                var6_10 ^= -205045695;
                var1_5 = var0_4.length / 4;
                var7_3 = var9_1 ^ -1870738025;
                ** continue;
                break;
            }
lbl117:
            // 1 sources

            while (true) {
                var0_4 = "R\u00bd\u0097=\u00fd\u00cd\u00bc\u0096[\u00fcz^\u00d2\u00e7\u00bb\u0090O\u0089{n\u00c6K\u00f8\u00c1\u00803\u00e8\u00d4\u00b2\f\u00b4\u00dd\u00a0X\u00ea\u009b\u0006v\u0004\u00c7\u00c5\u00058\u00bf~\u009b\u00f3Y{P/\u009dFG\u00a2\u00b0\u00a3'\fF$1r\u001d[Q}\u0097\u00bc|\u00b5\u0082\u00d5N>X\u009f\u00d7\u00e7\u00e8~G\u00a9\u0000\u008f*\u0082\u00f4\u00cd4l\u00bb\u0094\u00b5\u0083\u00a2\u00a4\u00d2\u0093\u000f1@\u0006\b\u000f\u0004\u00bf\u0098\u0018DX\u00d3i\u00f3OPy\u0000J4\"\u00b1d\u00d9\u009c\u00f6Yq\u00da\u0002,\u00f1\u00a0D\u00db\u00ce\u0091\u00f3\u008b\u0000".getBytes("ISO-8859-1");
                ** continue;
                break;
            }
        }
        block27: while (true) {
            switch (var7_3) {
                default: {
                    continue block27;
                }
                case 774804697: {
                    var2_6 = (var6_10 | var7_3 ^ 1909976298) ^ (var7_3 ^ 225316481) ^ gd.k;
                    var6_10 ^= 908520681;
                    ** continue;
                }
                case -842631051: {
                    var6_10 ^= var7_3 ^ 1426363323;
                    ** continue;
                }
                case -958797571: 
            }
            var7_3 = var9_1 ^ -1841364922;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void UP() {
        block53: {
            block57: {
                block56: {
                    block55: {
                        block54: {
                            block51: {
                                block47: {
                                    block48: {
                                        block50: {
                                            block52: {
                                                block49: {
                                                    block58: {
                                                        break block58;
lbl1:
                                                        // 1 sources

                                                        while (true) {
                                                            var2_4 ^= var3_3 ^ -1858188838;
                                                            break block47;
                                                            break;
                                                        }
lbl4:
                                                        // 1 sources

                                                        return;
lbl6:
                                                        // 1 sources

                                                        while (true) {
                                                            var3_3 = (var1_2 | var4_1) ^ -1330156331;
                                                            break block48;
                                                            break;
                                                        }
lbl9:
                                                        // 1 sources

                                                        while (true) {
                                                            var3_3 = (var1_2 | var4_1) ^ -1644335138;
                                                            break block48;
                                                            break;
                                                        }
lbl12:
                                                        // 1 sources

                                                        while (true) {
                                                            if (this.e < 0) break block49;
                                                            break block50;
                                                            break;
                                                        }
lbl15:
                                                        // 1 sources

                                                        while (true) {
                                                            var2_4 ^= var3_3 ^ 2029525136;
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
                                                    var4_1 = -923907803;
                                                    var1_2 = gd.k & -923907803 ^ 333995137;
                                                    var3_3 = 0;
                                                    var2_4 = (var1_2 | var4_1) ^ -1407879327;
                                                    var3_3 = (var1_2 | var4_1) ^ -330937779;
                                                    break block48;
lbl25:
                                                    // 1 sources

                                                    while (true) {
                                                        if (gd.a.field_1724 == null) break block49;
                                                        break block51;
                                                        break;
                                                    }
lbl28:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl30:
                                                    // 1 sources

                                                    while (true) {
                                                        var2_4 ^= var3_3 ^ 2125207559;
                                                        break block52;
                                                        break;
                                                    }
lbl33:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl35:
                                                    // 1 sources

                                                    while (true) {
                                                        var2_4 ^= var3_3 ^ 1360947032;
                                                        break block53;
                                                        break;
                                                    }
                                                }
lbl39:
                                                // 2 sources

                                                while (true) {
                                                    var3_3 = (var1_2 | var4_1) ^ -2142563709;
                                                    break block48;
                                                    break;
                                                }
lbl42:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl44:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                                this.a.release();
                                                var3_3 = (var1_2 | var4_1) ^ -2071962605;
                                                break block48;
lbl49:
                                                // 1 sources

                                                while (true) {
                                                    var2_4 ^= var3_3 ^ 804296596;
                                                    break block54;
                                                    break;
                                                }
                                            }
                                            var3_3 = (var1_2 | var4_1) ^ 326942302;
                                            break block48;
lbl55:
                                            // 1 sources

                                            while (true) {
                                                var3_3 = (var1_2 | var4_1) ^ 886939389;
                                                break block48;
lbl58:
                                                // 1 sources

                                                while (true) {
                                                    var3_3 = (var1_2 | var4_1) ^ -584344132;
                                                    break block48;
                                                    break;
                                                }
lbl61:
                                                // 1 sources

                                                while (true) {
                                                    this.a = eB.h;
                                                    ** continue;
                                                    break;
                                                }
lbl64:
                                                // 1 sources

                                                while (true) {
                                                    var3_3 = (var1_2 | var4_1) ^ -1848579334;
                                                    break block48;
                                                    break;
                                                }
lbl67:
                                                // 1 sources

                                                while (true) {
                                                    var2_4 ^= var3_3 ^ -876921106;
                                                    break block55;
                                                    break;
                                                }
lbl70:
                                                // 1 sources

                                                while (true) {
                                                    this.e = -1;
                                                    ** continue;
                                                    break;
                                                }
lbl73:
                                                // 1 sources

                                                while (true) {
                                                    lw.selectSlotSynced(this.e);
                                                    ** continue;
                                                    break;
                                                }
                                                break;
                                            }
                                            this.b = -1;
                                            var3_3 = (var1_2 | var4_1) ^ 919986173;
                                            break block48;
                                            this.UQ();
                                            var3_3 = (var1_2 | var4_1) ^ 406345927;
                                            break block48;
                                        }
                                        var3_3 = (var1_2 | var4_1) ^ -1118188869;
                                        break block48;
lbl85:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_3 ^ 525161873;
                                            break block56;
                                            break;
                                        }
                                    }
lbl89:
                                    // 9 sources

                                    block46: while (true) {
                                        switch (var3_3) {
                                            default: {
                                                continue block46;
                                            }
                                            case 113623065: {
                                                ** continue;
                                            }
                                            case 1723307806: {
                                                break;
                                            }
                                            case 1248775341: {
                                                ** continue;
                                            }
                                            case -806722796: {
                                                ** continue;
                                            }
                                            case -314867112: {
                                                ** continue;
                                            }
                                            case -737819551: {
                                                ** continue;
                                            }
                                            case -235697720: {
                                                ** continue;
                                            }
                                            case 1175663227: {
                                                ** continue;
                                            }
                                            case -684657344: {
                                                ** continue;
                                            }
                                            case -929897477: {
                                                ** continue;
                                            }
                                            case 1601044918: {
                                                ** continue;
                                            }
                                            case 1801007472: {
                                                ** continue;
                                            }
                                            case 927202479: {
                                                ** continue;
                                            }
                                            case -1079083033: {
                                                ** continue;
                                            }
                                            case 238638372: {
                                                ** continue;
                                            }
                                            case -707548748: {
                                                ** continue;
                                            }
                                            case -281820328: {
                                                ** continue;
                                            }
                                            case 1245624159: {
                                                ** continue;
                                            }
                                            case 933763048: {
                                                break block57;
                                            }
                                            case -1009384094: {
                                                ** continue;
                                            }
                                        }
                                        var3_3 = (var1_2 | var4_1) ^ 267098564;
                                        continue;
                                        {
                                            ** case 1537560358:
                                        }
lbl136:
                                        // 1 sources

                                        var2_4 ^= var3_3 ^ 700150745;
                                        ** continue;
                                        break;
                                    }
                                }
                                var3_3 = (var1_2 | var4_1) ^ 706597997;
                                ** GOTO lbl89
                            }
                            var3_3 = (var1_2 | var4_1) ^ 215918821;
                            ** GOTO lbl89
                            this.a = 0;
                            var3_3 = (var1_2 | var4_1) ^ 1681924674;
                            ** GOTO lbl89
                        }
                        var3_3 = (var1_2 | var4_1) ^ -1853845240;
                        ** GOTO lbl89
                    }
                    var3_3 = (var1_2 | var4_1) ^ -324165366;
                    ** GOTO lbl89
                }
                var3_3 = (var1_2 | var4_1) ^ 335822513;
                ** GOTO lbl89
            }
            var3_3 = (var1_2 | var4_1) ^ 238941201;
            ** GOTO lbl89
        }
        var3_3 = (var1_2 | var4_1) ^ -707327871;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void UQ() {
        block24: {
            block26: {
                block27: {
                    break block27;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -940605838;
                        break block24;
                        break;
                    }
lbl4:
                    // 2 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1419914396;
                        break block24;
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        block25: {
                            var3_3 = (var1_2 | var4_1) ^ 34503427;
                            break block24;
lbl10:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 2065112487;
                                break block25;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                this.a = false;
                                ** GOTO lbl4
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1803745179;
                                break block24;
                                break;
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ 1270092602;
                        break block24;
lbl22:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1759837888;
                            break block24;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            gd.a.field_1690.field_1903.method_23481(false);
                            ** continue;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 1493532946;
                            break block26;
                            break;
                        }
lbl31:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 520572314;
                            ** continue;
                            break;
                        }
lbl34:
                        // 1 sources

                        return;
lbl36:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1196386681;
                            break block24;
                            break;
                        }
                        break;
                    }
                }
                var4_1 = 1855790787;
                var1_2 = gd.k & 1855790787 ^ 1407990860;
                var3_3 = 0;
                var2_4 = (var1_2 | var4_1) ^ 599070982;
                var3_3 = (var1_2 | var4_1) ^ -1950079587;
                break block24;
            }
            var3_3 = (var1_2 | var4_1) ^ -291617835;
        }
        block23: while (true) {
            switch (var3_3) {
                default: {
                    continue block23;
                }
                case -343918934: {
                    ** continue;
                }
                case 2113095116: {
                    ** continue;
                }
                case 877211125: {
                    ** continue;
                }
                case -727650901: {
                    ** continue;
                }
                case 951211958: {
                    ** continue;
                }
                case -197584046: {
                    ** continue;
                }
                case -1855750886: {
                    ** continue;
                }
                case 387563535: {
                    if (this.a) ** break;
                    ** continue;
                    ** continue;
                }
                case -1206763331: 
            }
            break;
        }
        var2_4 ^= var3_3 ^ 679832496;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private boolean UR(class_1792 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [18[UNCONDITIONALDOLOOP]], but top level block is 19[UNCONDITIONALDOLOOP]
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
    private boolean US(class_1792 var1_1) {
        block46: {
            var6_2 = 1444976829;
            var3_3 = gd.k & 1444976829 ^ 892176136;
            var5_4 = 0;
            var4_6 = (var3_3 | var6_2) ^ -131109182;
            var5_4 = (var3_3 | var6_2) ^ 1711417614;
            break block46;
lbl7:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -1987816730;
                ** GOTO lbl93
                break;
            }
            while (true) {
                var5_4 = (var3_3 | var6_2) ^ 768137125;
                break block46;
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -524513588;
                ** GOTO lbl93
                break;
            }
lbl16:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -956397647;
                break block46;
                break;
            }
lbl19:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ 1233472787;
                ** GOTO lbl93
                break;
            }
        }
        block40: while (true) {
            block47: {
                switch (var5_4) {
                    case 288339635: {
                        var5_4 = (var3_3 | var6_2) ^ 253482555;
                        continue block40;
                    }
                    case -152715831: {
                        return true;
                    }
                    case -931108811: {
                        this.a = class_1268.field_5808;
                        ** GOTO lbl79
                    }
                    case -766569671: {
                        var2_5 = lw.findInHotbar(var1_1);
                        var5_4 = (var3_3 | var6_2) ^ -827342323;
                        if (true) ** GOTO lbl93
                    }
                    case 981389846: {
                        var4_6 ^= var5_4 ^ -834235910;
                        var5_4 = (var3_3 | var6_2) ^ -2117590412;
                        continue block40;
                    }
                    case -946241528: {
                        this.a = class_1268.field_5810;
                        ** break;
                    }
                    case -1157470927: {
                        if (!gd.a.field_1724.method_6047().method_31574(var1_1)) ** continue;
                        var5_4 = (var3_3 | var6_2) ^ -1779867471;
                        continue block40;
                    }
                    case -1589472924: {
                        var4_6 ^= var5_4 ^ 1456441614;
                        ** continue;
                    }
                    case 2091270670: {
                        var4_6 ^= var5_4 ^ -155675696;
                        ** GOTO lbl77
                    }
lbl54:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 1297305003;
                    break;
                    case -1653587692: {
                        var4_6 ^= var5_4 ^ -974118179;
                        ** break;
                    }
                    case 1378040245: {
                        if (!gd.a.field_1724.method_6079().method_31574(var1_1)) {
                            var5_4 = (var3_3 | var6_2) ^ -362946903;
                            break;
                        }
                        ** GOTO lbl72
                    }
                    case -1311565812: {
                        return true;
                    }
lbl66:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ -869270900;
                    continue block40;
                    case 2016823686: {
                        var4_6 ^= var5_4 ^ -1951833724;
                        var5_4 = (var3_3 | var6_2) ^ 621717000;
                        break;
                    }
lbl72:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 193715635;
                    continue block40;
                    case -490406132: {
                        var4_6 ^= var5_4 ^ -1085674157;
                        break block47;
                    }
lbl77:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ -1330372683;
                    continue block40;
lbl79:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ -697364775;
                    continue block40;
                    case 1524975640: {
                        var4_6 ^= var5_4 ^ 817148618;
                        var5_4 = (var3_3 | var6_2) ^ -1520268156;
                    }
                }
                continue;
            }
            var5_4 = (var3_3 | var6_2) ^ -1079117944;
        }
        block41: while (true) {
            var5_4 = (var3_3 | var6_2) ^ 1073792939;
            if (true) ** GOTO lbl93
            block42: while (true) {
                var5_4 = (var3_3 | var6_2) ^ -399426477;
lbl93:
                // 6 sources

                block43: while (true) {
                    switch (var5_4) {
                        case 1612296984: {
                            if (this.e >= 0) continue block42;
                            var5_4 = (var3_3 | var6_2) ^ 1390284461;
                            continue block43;
                        }
                        case 2012818953: {
                            var4_6 ^= var5_4 ^ -466575309;
                            ** GOTO lbl139
                        }
                        case -1349092794: {
                            if (var2_5 < 0) {
                                var5_4 = (var3_3 | var6_2) ^ -402602377;
                                continue block43;
                            }
                            ** GOTO lbl131
                        }
                        case -1182638672: {
                            var4_6 ^= var5_4 ^ -437815491;
                            var5_4 = (var3_3 | var6_2) ^ -658774533;
                            continue block43;
                        }
                        case 636719376: {
                            var5_4 = (var3_3 | var6_2) ^ -1819020743;
                            continue block43;
                        }
                        case 873136151: {
                            this.d = true;
                            var5_4 = (var3_3 | var6_2) ^ 1198238616;
                            continue block43;
                        }
                        case -1752100495: {
                            lw.selectSlotSynced(var2_5);
                            var5_4 = (var3_3 | var6_2) ^ -2063299808;
                            continue block43;
                        }
                        case 433983955: {
                            return gd.a.field_1724.method_5998(this.a).method_31574(var1_1);
                        }
                        case 809907237: {
                            var4_6 ^= var5_4 ^ 284088373;
                            ** continue;
                        }
                        case -232188771: {
                            var4_6 ^= var5_4 ^ -633635135;
                            var5_4 = (var3_3 | var6_2) ^ 1126604714;
                            continue block43;
                        }
lbl131:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ 13939124;
                        break;
                        case -22426277: {
                            this.a = class_1268.field_5808;
                            continue block41;
                        }
                        case -457282172: {
                            this.e = gd.a.field_1724.method_31548().method_67532();
                            continue block42;
                        }
lbl139:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ 389295269;
                        break;
                        case -1624417846: {
                            var4_6 ^= var5_4 ^ -1449936952;
                            ** continue;
                        }
                        case 1051251374: {
                            return false;
                        }
                        case -1625512978: {
                            var4_6 ^= var5_4 ^ -669381615;
                            ** continue;
                        }
                        case 925718550: {
                            var4_6 ^= var5_4 ^ -254575312;
                            var5_4 = (var3_3 | var6_2) ^ 1861455470;
                        }
                    }
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private boolean UT() {
        block39: {
            block37: {
                var5_1 = -333535429;
                var2_2 = gd.k & -333535429 ^ 2031103148;
                var4_3 = 0;
                ** GOTO lbl70
lbl5:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -242996885;
                    break block37;
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ -559535711;
                    ** continue;
                    break;
                }
lbl11:
                // 1 sources

                block19: while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 1007644637;
                    break block37;
lbl14:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 1251759506;
                        ** GOTO lbl46
lbl17:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 1265121873;
                            ** GOTO lbl46
                            break;
                        }
                        break;
                    }
                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 763047822;
                        break block37;
                        break;
                    }
                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -2010008292;
                        ** GOTO lbl46
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        if (GLFW.glfwGetKey((long)gd.a.method_22683().method_4490(), (int)var1_5) != 1) ** continue;
                        ** continue;
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        block38: {
                            var4_3 = (var2_2 | var5_1) ^ 578315954;
                            break block37;
lbl32:
                            // 1 sources

                            while (true) {
                                continue;
lbl34:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -1930289521;
                                    break block38;
                                    break;
                                }
                                var1_5 = v0;
                                var4_3 = (var2_2 | var5_1) ^ -812047479;
                                break block38;
lbl40:
                                // 1 sources

                                while (true) {
                                    v1 = true;
                                    ** GOTO lbl61
                                    break;
                                }
                                break;
                            }
lbl43:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -300023316;
                                break block37;
                                break;
                            }
                        }
lbl47:
                        // 2 sources

                        block30: while (true) {
                            switch (var4_3) {
                                default: {
                                    continue block30;
                                }
                                case -1216153043: {
                                    ** continue;
                                }
                                case -637291341: {
                                    ** continue;
                                }
lbl55:
                                // 1 sources

                                while (true) {
                                    var3_4 ^= var4_3 ^ -1836719357;
                                    break block39;
                                    break;
                                }
                                case -1233742354: {
                                    var3_4 ^= var4_3 ^ 1812957704;
                                    break block19;
                                }
lbl61:
                                // 2 sources

                                while (true) {
                                    var3_4 ^= -1758626193;
                                    ** GOTO lbl100
                                    break;
                                }
                                case 1911337264: {
                                    v1 = false;
                                    ** continue;
                                }
lbl67:
                                // 1 sources

                                while (true) {
                                    if ((Integer)this.a.getValue() > 0) ** continue;
                                    ** continue;
                                    break;
                                }
lbl70:
                                // 1 sources

                                var3_4 = (var2_2 | var5_1) ^ -513354982;
                                ** GOTO lbl98
                                case 847744054: {
                                    var3_4 ^= var4_3 ^ 476505171;
                                    ** continue;
                                }
                                case 1966021283: {
                                    var3_4 ^= var4_3 ^ -1353317051;
                                    ** continue;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                var4_3 = (var2_2 | var5_1) ^ 656218892;
                ** while (true)
            }
lbl81:
            // 2 sources

            block34: while (true) {
                switch (var4_3) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block34;
                        }
                        break;
                    }
                    case 318811731: {
                        ** continue;
                    }
                    case -1055801246: {
                        ** continue;
                    }
                    case -474886266: {
                        ** continue;
                    }
lbl92:
                    // 2 sources

                    while (true) {
                        var3_4 ^= 1099477466;
                        ** continue;
                        break;
                    }
                    case 211453652: {
                        v0 = gd.UL((var3_4 | var4_3 ^ -528211473) ^ (var4_3 ^ 384928091), (var2_2 | var4_3 ^ -528211473) ^ ((var3_4 | var4_3 ^ -528211473) ^ (var4_3 ^ 1808826887)));
                        ** GOTO lbl92
                    }
lbl98:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1288892508;
                    ** continue;
lbl100:
                    // 1 sources

                    return v1;
                    case -798654415: {
                        var3_4 ^= var4_3 ^ 499320771;
                        ** continue;
                    }
                    case -546911987: {
                        v0 = (Integer)this.a.getValue();
                        ** continue;
                    }
                    case 1312006171: {
                        ** continue;
                    }
                }
                break;
            }
        }
        var4_3 = (var2_2 | var5_1) ^ 514809913;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void UU(String var1_1) {
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
    private boolean UV() {
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
    private class_1309 UW() {
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
    private static boolean UX(class_1297 var0) {
        var6_1 = -964577425;
        var3_2 = gd.k & -964577425 ^ -388843697;
        var5_3 = 0;
        var4_4 = (var3_2 | var6_1) ^ -922496090;
        var5_3 = (var3_2 | var6_1) ^ -1710634931;
        if (true) ** GOTO lbl36
        block19: while (true) {
            switch (var5_3) {
                case 1960476450: {
                    var5_3 = (var3_2 | var6_1) ^ -157685583;
                    ** GOTO lbl36
                }
                case 1702698100: {
                    var1_5 = (class_1657)var0;
                    var4_4 ^= 1505083720;
                    ** break;
                }
                case 1567263186: {
                    var4_4 ^= var5_3 ^ 1592660749;
                    var5_3 = (var3_2 | var6_1) ^ -1885778886;
                    ** GOTO lbl36
                }
                case 407527390: {
                    var4_4 ^= var5_3 ^ 417626963;
                    var5_3 = (var3_2 | var6_1) ^ 1818961554;
                    ** GOTO lbl36
                }
                case -2101833219: {
                    if (!(var0 instanceof class_1657)) {
                        var5_3 = (var3_2 | var6_1) ^ -1279705411;
                    } else {
                        var5_3 = (var3_2 | var6_1) ^ 217530815;
                        continue block19;
                    }
                }
lbl30:
                // 1 sources

                var2_6 = ix.get();
                var5_3 = (var3_2 | var6_1) ^ 1333996330;
                ** GOTO lbl-1000
                case -500894000: {
                    var4_4 ^= var5_3 ^ -1845932314;
                    var5_3 = (var3_2 | var6_1) ^ -1951487205;
                }
lbl36:
                // 7 sources

                default: {
                    continue block19;
                }
                case 1632303957: 
            }
            break;
        }
        return false;
        {
            var5_3 = (var3_2 | var6_1) ^ 1330675533;
            block21: while (true) lbl-1000:
            // 6 sources

            {
                block24: {
                    switch (var5_3) {
                        case -1585199070: {
                            var4_4 ^= var5_3 ^ -1182799413;
                            ** break;
                        }
                        case 1495765629: {
                            var4_4 ^= var5_3 ^ 1104917396;
                            var5_3 = (var3_2 | var6_1) ^ -1916356044;
                            continue block21;
                        }
                        case -1588552635: {
                            var4_4 ^= var5_3 ^ -819253699;
                            ** break;
                        }
                        case -1390622910: {
                            v0 = false;
                            ** GOTO lbl66
                        }
                        case 744484324: {
                            var5_3 = (var3_2 | var6_1) ^ -1156735269;
                            break;
                        }
lbl59:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ 1137668141;
                        break;
                        case -1486261520: {
                            if (var2_6 == null) continue block20;
                            break block24;
                        }
                        case 1662324059: {
                            v0 = true;
lbl66:
                            // 2 sources

                            var4_4 ^= 1240436966;
                            return v0;
                        }
lbl68:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ 1236977055;
                        continue block21;
                        case 1440623028: {
                            if (var2_6.isFriend(var1_5.method_7334().name())) ** break;
                            continue block20;
                            var5_3 = (var3_2 | var6_1) ^ -1208736494;
                        }
                    }
                    continue;
                }
                var5_3 = (var3_2 | var6_1) ^ -1030989173;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private dR UY(class_1309 var1_1) {
        block43: {
            block42: {
                break block43;
lbl1:
                // 1 sources

                while (true) {
                    var8_4 = (var6_3 | var9_2) ^ -1100630735;
                    ** GOTO lbl85
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var4_7 = 0;
                    break block42;
                    break;
                }
lbl7:
                // 1 sources

                while (true) {
                    var8_4 = (var6_3 | var9_2) ^ -1292959460;
                    ** GOTO lbl85
                    break;
                }
            }
lbl11:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var7_9 ^= 101182064;
                var3_6 = null;
                var7_9 ^= -1388216227;
                ** continue;
                break;
            }
lbl18:
            // 1 sources

            while (true) {
                var8_4 = (var6_3 | var9_2) ^ -910960771;
                ** GOTO lbl85
                break;
            }
            var8_4 = (var6_3 | var9_2) ^ 526784919;
            block35: while (true) {
                switch (var8_4) {
                    case 1884556034: {
                        var7_9 ^= var8_4 ^ 1966066236;
                        ** GOTO lbl52
                    }
                    case 678016687: {
                        var7_9 ^= var8_4 ^ -362169199;
                        ** GOTO lbl65
                    }
                    case 1389029892: {
                        var5_8 = var1_1.method_18798().method_1021((double)var3_6.ticks());
                        ** GOTO lbl63
                    }
                    case -1609447812: {
                        var7_9 ^= var8_4 ^ 1499121289;
                        ** GOTO lbl67
                    }
                    case 303093858: {
                        var3_6 = this.UZ(var2_5);
                        ** GOTO lbl69
                    }
                    case 804131375: {
                        if (var4_7 < 2) {
                            var8_4 = (var6_3 | var9_2) ^ -1759614652;
                            continue block35;
                        }
                        ** GOTO lbl50
                    }
                    case 1021751409: {
                        return null;
                    }
                    case -39354942: {
                        var7_9 ^= var8_4 ^ 214912773;
                        var8_4 = (var6_3 | var9_2) ^ -855496201;
                        ** GOTO lbl70
                    }
lbl50:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ 1120969257;
                    ** GOTO lbl70
lbl52:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ -306366993;
                    ** GOTO lbl70
                    case -1305402145: {
                        var7_9 ^= var8_4 ^ -246604712;
                        ** GOTO lbl72
                    }
                    case -1114778249: {
                        var7_9 ^= var8_4 ^ -1900318568;
                        var8_4 = (var6_3 | var9_2) ^ -2087620710;
                        ** GOTO lbl70
                    }
                    case 1920333340: {
                        return var3_6;
                    }
lbl63:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ 1715239777;
                    if (true) ** GOTO lbl85
lbl65:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ -1385756791;
                    ** GOTO lbl70
lbl67:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ -1868968508;
                    ** GOTO lbl70
lbl69:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ 222755636;
lbl70:
                    // 9 sources

                    default: {
                        continue block35;
                    }
lbl72:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ 1434921813;
                    continue block35;
                    case -353307458: 
                }
                if (var3_6 != null) break;
                var8_4 = (var6_3 | var9_2) ^ 49941148;
            }
            var8_4 = (var6_3 | var9_2) ^ -819735319;
            ** GOTO lbl70
            block37: while (true) {
                var8_4 = (var6_3 | var9_2) ^ 713837507;
                if (true) ** GOTO lbl85
                block38: while (true) {
                    var8_4 = (var6_3 | var9_2) ^ 1193480779;
lbl85:
                    // 6 sources

                    block39: while (true) {
                        switch (var8_4) {
                            default: {
                                continue block39;
                            }
                            case -128660064: {
                                var8_4 = (var6_3 | var9_2) ^ 973904643;
                                continue block39;
                            }
                            case 228122359: {
                                if (!(var5_8.method_1027() > 64.0)) continue block37;
                                continue block38;
                            }
                            case 221047974: {
                                var7_9 ^= var8_4 ^ -324995928;
                                ** continue;
                            }
                            case -1778674648: {
                                var7_9 ^= var8_4 ^ 320562848;
                                ** continue;
                            }
                            case 1992558742: {
                                var2_5 = var1_1.method_73189().method_1031(var5_8.field_1352, 0.0, var5_8.field_1350);
                                var8_4 = (var6_3 | var9_2) ^ -1302645939;
                                continue block39;
                            }
                            case -2055519000: {
                                var5_8 = var5_8.method_1029().method_1021(8.0);
                                continue block37;
                            }
                            case -649354102: {
                                var7_9 ^= var8_4 ^ -1016349314;
                                ** continue;
                            }
                            case 17984218: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            ++var4_7;
            ** while (true)
        }
        var9_2 = 257050593;
        var6_3 = gd.k & 257050593 ^ -1137188918;
        var8_4 = 0;
        var7_9 = (var6_3 | var9_2) ^ 1775351897;
        var8_4 = (var6_3 | var9_2) ^ -870999050;
        block40: while (true) {
            switch (var8_4) {
                default: {
                    continue block40;
                }
                case 807498794: {
                    var7_9 ^= var8_4 ^ -1082781058;
                    var8_4 = (var6_3 | var9_2) ^ 581100482;
                    continue block40;
                }
                case -1646969815: {
                    var2_5 = var1_1.method_73189();
                    ** continue;
                }
                case 1935819805: 
            }
            var8_4 = (var6_3 | var9_2) ^ -1890145343;
        }
    }

    /*
     * Exception decompiling
     */
    private dR UZ(class_243 var1_1) {
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
    private aQ Va(float var1_1, float var2_2) {
        block19: {
            block25: {
                block26: {
                    block21: {
                        block23: {
                            block20: {
                                block24: {
                                    block22: {
                                        break block26;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var8_4 = (var6_3 | -1642188827) ^ -1923715656;
                                            break block19;
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            var7_5 ^= 715695166;
                                            break block20;
                                            break;
                                        }
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var7_5 ^= -274884157;
                                            break block21;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        while (true) {
                                            var8_4 = (var6_3 | -1642188827) ^ 832488197;
                                            break block19;
                                            break;
                                        }
lbl13:
                                        // 1 sources

                                        return this.Vb(var3_6, var5_8);
lbl15:
                                        // 1 sources

                                        while (true) {
                                            v0 = var4_7.field_1351;
                                            break block22;
                                            break;
                                        }
lbl18:
                                        // 1 sources

                                        while (true) {
                                            if (!gd.a.field_1724.method_24828()) break block23;
                                            ** continue;
                                            break;
                                        }
lbl21:
                                        // 1 sources

                                        while (true) {
                                            var7_5 ^= 1094869843;
                                            break block24;
                                            break;
                                        }
                                    }
lbl25:
                                    // 2 sources

                                    while (true) {
                                        var7_5 ^= 2143165818;
                                        break block25;
                                        break;
                                    }
lbl28:
                                    // 1 sources

                                    while (true) {
                                        var7_5 ^= var8_4 ^ -770578382;
                                        ** continue;
                                        break;
                                    }
                                }
                                var4_7 = gd.a.field_1724.method_60478();
                                ** while (true)
lbl34:
                                // 1 sources

                                while (true) {
                                    var3_6 = new class_243(gd.a.field_1724.method_23317(), gd.a.field_1724.method_23320() - 0.1, gd.a.field_1724.method_23321());
                                    ** continue;
                                    break;
                                }
                            }
                            v0 = 0.0;
                            ** while (true)
                        }
                        var7_5 ^= 715695166;
                        ** while (true)
lbl43:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | -1642188827) ^ 2090606987;
                            break block19;
                            break;
                        }
                    }
                    v1 = class_243.method_1030((float)var1_1, (float)var2_2).method_1021(1.5);
                    v2 = var4_7.field_1352;
                    var7_5 ^= -1054666676;
                    ** while (true)
                }
                var6_3 = gd.k & -1642188827 ^ -257591207;
                var8_4 = 0;
                var7_5 = (var6_3 | -1642188827) ^ -1394002611;
                ** while (true)
lbl56:
                // 1 sources

                while (true) {
                    var7_5 ^= -2073929658;
                    ** continue;
                    break;
                }
            }
            var5_8 = v1.method_1031(v2, v0, var4_7.field_1350);
            ** while (true)
        }
        block18: while (true) {
            switch (var8_4) {
                default: {
                    continue block18;
                }
                case -2111611274: {
                    ** continue;
                }
                case 1944654405: {
                    ** continue;
                }
                ** case -819872520:
lbl72:
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
    private aQ Vb(class_243 var1_1, class_243 var2_2) {
        block54: {
            block56: {
                block55: {
                    block53: {
                        break block56;
                        while (true) {
                            break block53;
                            break;
                        }
lbl3:
                        // 1 sources

                        while (true) {
                            var9_5 = (var7_4 | var10_3) ^ -503987540;
                            break block54;
                            break;
                        }
lbl6:
                        // 1 sources

                        while (true) {
                            var9_5 = (var7_4 | var10_3) ^ 1207635169;
                            break block54;
                            break;
                        }
                    }
                    var9_5 = (var7_4 | var10_3) ^ -2142454819;
                    block40: while (true) {
                        switch (var9_5) {
                            case 1705718569: {
                                var8_9 ^= var9_5 ^ -1061558533;
                                ** GOTO lbl40
                            }
                            case 1345635270: {
                                var8_9 ^= var9_5 ^ -1066750658;
                                ** GOTO lbl56
                            }
                            case -1012741624: {
                                if (!gd.a.field_1687.method_8316(class_2338.method_49638((class_2374)var1_1)).method_15767(class_3486.field_15517)) ** continue;
                                ** GOTO lbl42
                            }
                            case 1881138255: {
                                if (var3_6 <= gd.UL((var8_9 | var9_5 ^ 1357039262) ^ (var9_5 ^ 1993697032), (var7_4 | var9_5 ^ 1357039262) ^ ((var8_9 | var9_5 ^ 1357039262) ^ (var9_5 ^ -1434703017)))) {
                                    var9_5 = (var7_4 | var10_3) ^ 1288279945;
                                    ** break;
                                }
                                ** GOTO lbl54
                            }
                            case -949404759: {
                                v0 = 0.99;
                                ** GOTO lbl46
                            }
                            case 808746366: {
                                var8_9 ^= var9_5 ^ 1238195610;
                                ** GOTO lbl38
                            }
                            case -55488214: {
                                var8_9 ^= var9_5 ^ -1520122101;
                                var9_5 = (var7_4 | var10_3) ^ -1147874978;
                            }
lbl36:
                            // 5 sources

                            default: {
                                continue block40;
                            }
lbl38:
                            // 1 sources

                            var9_5 = (var7_4 | var10_3) ^ -1084284673;
                            continue block40;
lbl40:
                            // 1 sources

                            var9_5 = (var7_4 | var10_3) ^ 216141496;
                            continue block40;
lbl42:
                            // 1 sources

                            var9_5 = (var7_4 | var10_3) ^ -1066417534;
                            continue block40;
                            case 1894416543: {
                                v0 = 0.8;
lbl46:
                                // 2 sources

                                var8_9 ^= -173218845;
                                var4_7 = v0;
                                var9_5 = (var7_4 | var10_3) ^ -1247044564;
                                break block55;
                            }
                            case -1131272075: {
                                var8_9 ^= var9_5 ^ -448283052;
                                var9_5 = (var7_4 | var10_3) ^ 202861160;
                                ** break;
                            }
lbl54:
                            // 1 sources

                            var9_5 = (var7_4 | var10_3) ^ 751380785;
                            continue block40;
lbl56:
                            // 1 sources

                            var9_5 = (var7_4 | var10_3) ^ -1176029548;
                            continue block40;
                            while (true) {
                                var9_5 = (var7_4 | var10_3) ^ -411971059;
                                break block54;
lbl61:
                                // 1 sources

                                while (true) {
                                    var9_5 = (var7_4 | var10_3) ^ -1829370727;
                                    break block54;
                                    break;
                                }
                                break;
                            }
                            case -988095389: 
                        }
                        break;
                    }
                    return null;
lbl66:
                    // 1 sources

                    while (true) {
                        var9_5 = (var7_4 | var10_3) ^ -1178463270;
                        break block54;
lbl69:
                        // 2 sources

                        while (true) {
                            var9_5 = (var7_4 | var10_3) ^ 425122270;
                            ** GOTO lbl36
                            break;
                        }
                        break;
                    }
                }
                block46: while (true) {
                    switch (var9_5) {
                        case -1751217331: {
                            var8_9 ^= var9_5 ^ 1400192085;
                            ** break;
                        }
                        case 1988488225: {
                            var2_2 = var2_2.method_1031(0.0, -0.03, 0.0).method_1021(var4_7);
                            ** GOTO lbl87
                        }
lbl81:
                        // 1 sources

                        var9_5 = (var7_4 | var10_3) ^ 944350655;
                        default: {
                            continue block46;
                        }
                        case 1152667464: {
                            var6_8 = gd.a.field_1687.method_17742(new class_3959(var1_1, var1_1.method_1019(var2_2), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)gd.a.field_1724));
                            ** continue;
                        }
lbl87:
                        // 1 sources

                        var9_5 = (var7_4 | var10_3) ^ -345808454;
                        continue block46;
                        case -917080357: 
                    }
                    var8_9 ^= var9_5 ^ 1380005272;
                    var9_5 = (var7_4 | var10_3) ^ 175638230;
                }
lbl93:
                // 1 sources

                while (true) {
                    var9_5 = (var7_4 | var10_3) ^ -739243506;
                    break block54;
lbl96:
                    // 1 sources

                    while (true) {
                        var9_5 = (var7_4 | var10_3) ^ 1324948735;
                        break block54;
                        break;
                    }
                    break;
                }
            }
            var10_3 = 553460433;
            var7_4 = gd.k & 553460433 ^ 1553844455;
            var9_5 = 0;
            var8_9 = (var7_4 | var10_3) ^ 128303897;
            var9_5 = (var7_4 | var10_3) ^ -419162108;
            block49: while (true) {
                switch (var9_5) {
                    default: {
                        continue block49;
                    }
                    case -698166245: {
                        var8_9 ^= var9_5 ^ -86869233;
                        var9_5 = (var7_4 | var10_3) ^ -361333677;
                        continue block49;
                    }
                    case -1678118157: {
                        var9_5 = (var7_4 | var10_3) ^ -1432404244;
                        continue block49;
                    }
                    case -1769236828: 
                }
                break;
            }
            var3_6 = 1;
            ** GOTO lbl69
        }
        block50: while (true) {
            switch (var9_5) {
                case -1685309190: {
                    var8_9 ^= var9_5 ^ -1110729234;
                    var9_5 = (var7_4 | var10_3) ^ -690363409;
                    continue block50;
                }
                case -985663187: {
                    var1_1 = var1_1.method_1019(var2_2);
                    ** continue;
                }
                case 1747670383: {
                    var8_9 ^= var9_5 ^ 1334367067;
                    var9_5 = (var7_4 | var10_3) ^ 2018656326;
                    continue block50;
                }
                case 839185928: {
                    if (var6_8.method_17783() == class_239.class_240.field_1332) {
                        ** continue;
                    }
                    ** GOTO lbl150
                }
                case 990307862: {
                    var8_9 ^= var9_5 ^ -251026005;
                    ** continue;
                }
                case -1440478952: {
                    ++var3_6;
                    ** continue;
                }
                case -1660409765: {
                    var8_9 ^= var9_5 ^ -380909458;
                    var9_5 = (var7_4 | var10_3) ^ -467402713;
                    continue block50;
                }
                case -301207954: {
                    var8_9 ^= var9_5 ^ 1048938880;
                    ** continue;
                }
lbl150:
                // 1 sources

                var9_5 = (var7_4 | var10_3) ^ 197852428;
                default: {
                    continue block50;
                }
                case -1730549040: {
                    if (!(var1_1.field_1351 < (double)(gd.a.field_1687.method_31607() - gd.UL((var8_9 | var9_5 ^ -1205549055) ^ (var9_5 ^ 487799184), (var7_4 | var9_5 ^ -1205549055) ^ ((var8_9 | var9_5 ^ -1205549055) ^ (var9_5 ^ 1737792207)))))) ** continue;
                    var9_5 = (var7_4 | var10_3) ^ 349618072;
                    continue block50;
                }
                case 2000099323: {
                    var8_9 ^= var9_5 ^ -1068341816;
                    ** continue;
                }
                case -1358044935: {
                    return new aQ(var6_8.method_17784(), var3_6);
                }
                case 78621361: 
            }
            break;
        }
        return null;
    }
}

