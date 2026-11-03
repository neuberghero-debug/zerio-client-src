/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1792
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2350$class_2351
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_408
 *  net.minecraft.class_4588
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.nanovg.NVGColor
 *  org.lwjgl.nanovg.NanoVG
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_408;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NanoVG;
import z.r.H;
import z.r.W;
import z.r.aE;
import z.r.az;
import z.r.cA;
import z.r.gF;
import z.r.gP;
import z.r.hJ;
import z.r.ke;
import z.r.mw;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class gS
extends gF {
    private static final /* synthetic */ String a;
    private final ke a;
    private final ke b;
    private double a;
    private static final float a;
    private final float[] a;
    private boolean a;
    private double b;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private float b;
    private static final double c;
    private float c;
    private double d;
    private static final float d;
    private static final /* synthetic */ String d;
    private String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private double e;
    private static final /* synthetic */ String s;
    private static final double f;
    private class_2350 a;
    private final ke c;
    private static final NVGColor a;
    private double g;
    private float e;
    private static final /* synthetic */ String i;
    private long a;
    private class_1792 a;
    private final ke d;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String l;
    private class_2338 a;
    private final aE a;
    private static final float f;
    private static final String m;
    private final ke e;
    private final az a;
    private float g;
    private static final float h;
    private static final double h;
    private static final double i;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    public static final int c;
    private final float[] b;
    private static final int a;
    private static final float i;
    private static final /* synthetic */ String p;
    private static final float j;
    private static final /* synthetic */ String q;
    private final double[] a;
    private static final double j;
    private static final float k;
    private final ke f;
    private static final /* synthetic */ String r;
    private float l;
    private static final int b;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String k;
    private static final double k;
    private final double[] b;
    private static final double l;
    private final List<cA> a;
    private final gP a;
    private static final float m;
    private static final int[] a;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private static final /* synthetic */ String x;
    private double m;
    private final double[] c;
    private static final double n;

    /*
     * Exception decompiling
     */
    public gS() {
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
    public static gS get() {
        block16: {
            break block16;
lbl1:
            // 1 sources

            while (true) {
                var4_2 = (var2_1 | var5) ^ -390793543;
                block14: while (true) {
                    block17: {
                        switch (var4_2) {
                            case 896493650: {
                                var3_4 ^= var4_2 ^ -1084209975;
                                var4_2 = (var2_1 | var5) ^ -33241783;
                                continue block14;
                            }
                            case 1153761648: {
                                var3_4 ^= var4_2 ^ -607036631;
                                var4_2 = (var2_1 | var5) ^ 1918726711;
                                continue block14;
                            }
                            case -1939658129: {
                                var3_4 ^= var4_2 ^ 326594614;
                                var4_2 = (var2_1 | var5) ^ 1857885447;
                                continue block14;
                            }
                            case -1285125140: {
                                v0 = var1_5 = (gS)var0_3;
                                ** GOTO lbl22
                            }
                            case -1350112036: {
                                v0 = null;
lbl22:
                                // 2 sources

                                var3_4 ^= -422022240;
                                return v0;
                            }
                            case 601840546: {
                                if (!(var0_3 instanceof gS)) break block17;
                                var4_2 = (var2_1 | var5) ^ 1371059332;
                            }
                        }
                        continue;
                    }
                    var4_2 = (var2_1 | var5) ^ -1726046309;
                }
                break;
            }
        }
        var5 = -725378967;
        var2_1 = gS.c & -725378967 ^ -916908341;
        var4_2 = 0;
        var3_4 = (var2_1 | var5) ^ 1798957775;
        var4_2 = (var2_1 | var5) ^ 1712744937;
        block15: while (true) {
            switch (var4_2) {
                case 2080390650: {
                    var0_3 = mw.getInstance().getModuleByName(gS.s);
                    ** continue;
                }
                case -1144129790: {
                    var4_2 = (var2_1 | var5) ^ -607533070;
                    continue block15;
                }
                case 101865753: {
                    var3_4 ^= var4_2 ^ -652253264;
                    var4_2 = (var2_1 | var5) ^ -1579441391;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onEnable() {
        int n2 = c & 0x427E9A22 ^ 0x1C718787;
        int n3 = 0;
        int n4 = (n2 | 0x427E9A22) ^ 0x4E1F4892;
        n3 = (n2 | 0x427E9A22) ^ 0xED586314;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1289225037: {
                    break;
                }
                case 1700763147: {
                    n4 ^= n3 ^ 0x837BC79;
                    n3 = (n2 | 0x427E9A22) ^ 0x49E98B3;
                    continue block5;
                }
                case 1524696852: {
                    return;
                }
            }
            n3 = (n2 | 0x427E9A22) ^ 0x3B2009AC;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        int n2 = 122158619;
        int n3 = c & 0x747FE1B ^ 0x2A9E6FE1;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x9835D532;
        n4 = (n3 | n2) ^ 0x8A7ADE94;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case 383286026: {
                    this.bS();
                    n4 = (n3 | n2) ^ 0xA8FE753;
                    continue block7;
                }
                case -160815206: {
                    n5 ^= n4 ^ 0xC277F49E;
                    n4 = (n3 | n2) ^ 0x390784F1;
                    continue block7;
                }
                case 626006184: {
                    n5 ^= n4 ^ 0xCF63A55F;
                    n4 = (n3 | n2) ^ 0x8BB3848C;
                    continue block7;
                }
                case -1515904657: {
                    n4 = (n3 | n2) ^ 0xD9B5D861;
                    continue block7;
                }
                case -1536394377: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void bS() {
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void onBlockBroken(class_2338 var0) {
        block48: {
            block49: {
                var6_1 = 1475542615;
                var3_2 = gS.c & 1475542615 ^ -1462010852;
                var5_3 = 0;
                var4_5 = (var3_2 | var6_1) ^ -2138648599;
                var5_3 = (var3_2 | var6_1) ^ -580112252;
                break block49;
lbl7:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -2013448909;
                    break block48;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -1882945467;
                    break block48;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -714569340;
                    break block49;
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ 615055879;
                    break block48;
                    break;
                }
                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ 993723890;
                    break block48;
lbl22:
                    // 1 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ 1728087075;
                        break block48;
                        break;
                    }
                    break;
                }
            }
            block37: while (true) {
                switch (var5_3) {
                    default: {
                        continue block37;
                    }
                    case 580374235: {
                        break;
                    }
                    case 714307547: {
                        var1_4 = gS.get();
                        ** continue;
                    }
                    case 1954073632: {
                        var4_5 ^= var5_3 ^ -508062098;
                        ** continue;
                    }
                }
                var5_3 = (var3_2 | var6_1) ^ -1954336129;
            }
lbl40:
            // 1 sources

            while (true) {
                var5_3 = (var3_2 | var6_1) ^ 347513054;
                block39: while (true) {
                    block50: {
                        switch (var5_3) {
                            case -501816619: {
                                return;
                            }
                            case -273385880: {
                                return;
                            }
                            case 16791159: {
                                var4_5 ^= var5_3 ^ -1978763721;
                                break block50;
                            }
                            case 208312487: {
                                ** GOTO lbl63
                            }
                            case -192721581: {
                                if (var2_6.field_1724 != null) ** GOTO lbl59
                                ** GOTO lbl72
                            }
                            case -548459690: {
                                var4_5 ^= var5_3 ^ 973546700;
                                ** GOTO lbl61
                            }
lbl59:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ -17053656;
                            continue block39;
lbl61:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ 502078602;
                            continue block39;
lbl63:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ 192459532;
                            continue block39;
                            case -1183957427: {
                                var4_5 ^= var5_3 ^ -960085692;
                                var5_3 = (var3_2 | var6_1) ^ 273647671;
                            }
                            default: {
                                continue block39;
                            }
                            case 317562305: {
                                if (var2_6.field_1687 != null) ** GOTO lbl74
lbl72:
                                // 2 sources

                                var5_3 = (var3_2 | var6_1) ^ 1184219154;
                                continue block39;
lbl74:
                                // 1 sources

                                var5_3 = (var3_2 | var6_1) ^ -208574728;
                                continue block39;
                            }
                            case -347251071: {
                                var4_5 ^= var5_3 ^ 1538571274;
                                var5_3 = (var3_2 | var6_1) ^ -317299810;
                                continue block39;
                            }
                            case 152079204: 
                        }
                        var1_4.bT(var2_6, var0);
                        var5_3 = (var3_2 | var6_1) ^ 548721929;
                        continue;
                    }
                    var5_3 = (var3_2 | var6_1) ^ -152341189;
                }
                break;
            }
        }
        block40: while (true) {
            block51: {
                switch (var5_3) {
                    case 2013711212: {
                        var4_5 ^= var5_3 ^ 1123589204;
                        ** continue;
                    }
                    case -1833778877: {
                        var4_5 ^= var5_3 ^ -1592084310;
                        var5_3 = (var3_2 | var6_1) ^ 359299458;
                        continue block40;
                    }
                    case 2027414704: {
                        if (var1_4.isEnabled()) {
                            ** break;
                        }
                        break block51;
                    }
                    case 1883207194: {
                        var5_3 = (var3_2 | var6_1) ^ -2027152657;
                        ** GOTO lbl117
                    }
                    case 861577339: {
                        if (hJ.ok()) {
                            ** continue;
                        }
                        break block51;
                    }
                    case -615318440: {
                        if (var1_4 != null) {
                            ** continue;
                        }
                        break block51;
                    }
lbl112:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ -2074426798;
                    ** GOTO lbl117
                    case -993985619: {
                        var4_5 ^= var5_3 ^ 529904936;
                        var5_3 = (var3_2 | var6_1) ^ -1493467408;
                    }
lbl117:
                    // 4 sources

                    default: {
                        continue block40;
                    }
                    case -1448882901: {
                        if (var0 != null) ** continue;
                        break block51;
                    }
                    case -1728349572: {
                        var5_3 = (var3_2 | var6_1) ^ 1448620916;
                        continue block40;
                    }
                    case 2074164237: {
                        var5_3 = (var3_2 | var6_1) ^ -861839836;
                        continue block40;
                    }
                    case 1493205167: {
                        var2_6 = class_310.method_1551();
                        ** continue;
                    }
                    case -359561251: 
                }
                return;
            }
            var5_3 = (var3_2 | var6_1) ^ 1833516828;
        }
    }

    /*
     * Exception decompiling
     */
    private void bT(class_310 var1_1, class_2338 var2_2) {
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[CASE]], but top level block is 20[SWITCH]
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
    private void bU() {
        block63: {
            var8_1 = -841657993;
            var5_2 = gS.c & -841657993 ^ -1519024585;
            var7_3 = 0;
            var6_5 = (var5_2 | var8_1) ^ 853473576;
            var7_3 = (var5_2 | var8_1) ^ -107820780;
            ** GOTO lbl160
lbl7:
            // 1 sources

            while (true) {
                var7_3 = (var5_2 | var8_1) ^ 454916328;
                ** GOTO lbl181
lbl10:
                // 1 sources

                while (true) {
                    var7_3 = (var5_2 | var8_1) ^ -387554664;
                    ** GOTO lbl37
lbl13:
                    // 1 sources

                    while (true) {
                        var7_3 = (var5_2 | var8_1) ^ 990358363;
                        ** GOTO lbl37
                        break;
                    }
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    var3_6 = v0;
                    var7_3 = (var5_2 | var8_1) ^ 1372574607;
                    ** GOTO lbl37
lbl20:
                    // 1 sources

                    while (true) {
                        var7_3 = (var5_2 | var8_1) ^ 1810446651;
                        if (true) ** GOTO lbl37
                        break;
                    }
lbl23:
                    // 1 sources

                    while (true) {
                        var7_3 = (var5_2 | var8_1) ^ 1613079336;
                        break block63;
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var7_3 = (var5_2 | var8_1) ^ 1495441011;
                        break block63;
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        var7_3 = (var5_2 | var8_1) ^ 669482890;
                        break block63;
                        break;
                    }
lbl32:
                    // 1 sources

                    while (true) {
                        var7_3 = (var5_2 | var8_1) ^ -661098564;
                        break block63;
                        break;
                    }
                    block52: while (true) {
                        var7_3 = (var5_2 | var8_1) ^ 1384567223;
lbl37:
                        // 5 sources

                        block53: while (true) {
                            switch (var7_3) {
                                case 85177839: {
                                    if (!(this.c > 0.01f)) ** GOTO lbl86
                                    ** GOTO lbl94
                                }
                                case 1678863014: {
                                    var6_5 ^= var7_3 ^ -2040667128;
                                    var7_3 = (var5_2 | var8_1) ^ -1873884875;
                                    continue block53;
                                }
                                case 2109414978: {
                                    v1 = 0.1f;
                                    ** break;
                                }
                                case -1782948980: {
                                    var6_5 ^= var7_3 ^ 1508790510;
                                    ** GOTO lbl82
                                }
                                case 2033441763: {
                                    v1 = 0.3f;
                                    ** break;
                                }
                                case -688751572: {
                                    var6_5 ^= var7_3 ^ -721101166;
                                    var7_3 = (var5_2 | var8_1) ^ 1131525480;
                                }
                                default: {
                                    continue block53;
                                }
                                case -1137048328: {
                                    var6_5 ^= var7_3 ^ 1159027793;
                                    ** continue;
                                }
                                case 578423069: {
                                    var4_7 = 1.0f - (float)Math.exp(-14.0f * var3_6);
                                    ** continue;
                                }
lbl66:
                                // 2 sources

                                var6_5 ^= 1644953707;
                                var4_7 = v1;
                                var7_3 = (var5_2 | var8_1) ^ 809632267;
                                ** GOTO lbl150
                                case -2044924340: {
                                    this.a = var1_4;
                                    ** GOTO lbl92
                                }
                                case -431268959: {
                                    if (this.a == null) continue block52;
                                    ** continue;
                                }
                                case -1082980672: {
                                    var6_5 ^= var7_3 ^ 1956078676;
                                    ** continue;
                                }
                                case -1367055841: {
                                    this.l = Math.min(1.0f, this.l + var3_6 / 0.14f);
                                    ** GOTO lbl84
                                }
lbl82:
                                // 1 sources

                                var7_3 = (var5_2 | var8_1) ^ 197037270;
                                continue block53;
lbl84:
                                // 1 sources

                                var7_3 = (var5_2 | var8_1) ^ 46813392;
                                continue block53;
lbl86:
                                // 1 sources

                                var7_3 = (var5_2 | var8_1) ^ -1981497903;
                                continue block53;
                                case -281049177: {
                                    var6_5 ^= var7_3 ^ -1408654681;
                                    var7_3 = (var5_2 | var8_1) ^ -812654998;
                                    continue block53;
                                }
lbl92:
                                // 1 sources

                                var7_3 = (var5_2 | var8_1) ^ 2018479355;
                                continue block53;
lbl94:
                                // 1 sources

                                var7_3 = (var5_2 | var8_1) ^ 1422031297;
                                continue block53;
                                case -1187533130: 
                            }
                            var6_5 ^= var7_3 ^ 1534795800;
                            var7_3 = (var5_2 | var8_1) ^ -1798959980;
                        }
                        break;
                    }
                    break;
                }
                break;
            }
lbl100:
            // 1 sources

            while (true) {
                var7_3 = (var5_2 | var8_1) ^ -1764376524;
                ** GOTO lbl181
                break;
            }
lbl103:
            // 1 sources

            while (true) {
                var7_3 = (var5_2 | var8_1) ^ -384102567;
                ** GOTO lbl181
                break;
            }
        }
        block56: while (true) {
            switch (var7_3) {
                case 896383179: {
                    var6_5 ^= var7_3 ^ -1088921046;
                    ** GOTO lbl136
                }
                case -904746755: {
                    var6_5 ^= var7_3 ^ -1175764929;
                    var7_3 = (var5_2 | var8_1) ^ -1445615866;
                    continue block56;
                }
                case -575154820: {
                    var6_5 ^= var7_3 ^ -489741845;
                    ** break;
                }
                case -1260959484: {
                    var6_5 ^= var7_3 ^ -214810946;
                    var7_3 = (var5_2 | var8_1) ^ 1457651157;
                    continue block56;
                }
                case 1142976625: {
                    ** break;
                }
                case -1156306270: {
                    this.b += (this.g - this.b) * var4_7;
                    ** continue;
                }
                case 1837143856: {
                    this.l = Math.max(0.0f, this.l - var3_6 / var4_7);
                    ** break;
                }
lbl131:
                // 1 sources

                var7_3 = (var5_2 | var8_1) ^ -2139799481;
                ** GOTO lbl150
                case -1781865144: {
                    var6_5 ^= var7_3 ^ 1894205991;
                    ** continue;
                }
lbl136:
                // 1 sources

                var7_3 = (var5_2 | var8_1) ^ 324190413;
                ** GOTO lbl150
                case -22603846: {
                    this.a.removeIf((Predicate<cA>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, co(long z.r.cA ), (Lz/r/cA;)Z)((long)var1_4));
                    ** GOTO lbl152
                }
                case 661539087: {
                    this.c = Math.max(0.0f, this.c - var3_6 / 0.3f);
                    ** continue;
                }
lbl145:
                // 2 sources

                var7_3 = (var5_2 | var8_1) ^ -396918772;
                continue block56;
                case 94525307: {
                    var6_5 ^= var7_3 ^ 625030684;
                    var7_3 = (var5_2 | var8_1) ^ -895771016;
                }
lbl150:
                // 5 sources

                default: {
                    continue block56;
                }
lbl152:
                // 1 sources

                var7_3 = (var5_2 | var8_1) ^ 2017407551;
                continue block56;
lbl154:
                // 2 sources

                while (true) {
                    var6_5 ^= -340474945;
                    ** continue;
                    break;
                }
lbl157:
                // 1 sources

                while (true) {
                    var7_3 = (var5_2 | var8_1) ^ -1484899442;
                    ** GOTO lbl181
                    break;
                }
lbl160:
                // 1 sources

                block59: while (true) {
                    switch (var7_3) {
                        default: {
                            continue block59;
                        }
                        case -1687085588: {
                            var6_5 ^= var7_3 ^ 81777417;
                            var7_3 = (var5_2 | var8_1) ^ -2057135603;
                            continue block59;
                        }
                        case 342302307: {
                            var7_3 = (var5_2 | var8_1) ^ 1988414107;
                            continue block59;
                        }
                        case 1754746234: 
                    }
                    break;
                }
                var1_4 = System.nanoTime();
                ** continue;
                while (true) {
                    var7_3 = (var5_2 | var8_1) ^ -1118425237;
                    if (true) ** GOTO lbl181
                    break;
                }
                case -1915718561: 
            }
            break;
        }
        return;
        block61: while (true) {
            var7_3 = (var5_2 | var8_1) ^ -1469609548;
lbl181:
            // 6 sources

            block62: while (true) {
                switch (var7_3) {
                    default: {
                        continue block62;
                    }
                    case 82761774: {
                        v0 = 0.0f;
                        ** GOTO lbl154
                    }
                    case 1167220419: {
                        v0 = Math.min((float)(var1_4 - this.a) / 1.0E9f, 0.1f);
                        ** continue;
                    }
                    case 1250684153: {
                        var6_5 ^= var7_3 ^ -140824655;
                        ** continue;
                    }
                    case 1352923164: {
                        var6_5 ^= var7_3 ^ -1853364303;
                        continue block61;
                    }
                    case -152522849: {
                        if (this.a != 0L) ** continue;
                        ** continue;
                    }
                    case 2065700675: 
                }
                break;
            }
            break;
        }
        var6_5 ^= var7_3 ^ -1174140690;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void bV(class_4588 var1_1, Matrix4f var2_2, class_243 var3_3, int var4_4) {
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
    private void bW(class_243 var1_1) {
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
    private void bX(int n2, double d2, double d3, double d4) {
        int n3 = 724330443;
        int n4 = c & 0x2B2C67CB ^ 0x5752E818;
        int n5 = 0;
        int n6 = (n4 | n3) ^ 0x52C6478C;
        n5 = (n4 | n3) ^ 0x98D86605;
        block11: while (true) {
            switch (n5) {
                default: {
                    continue block11;
                }
                case 357394581: {
                    this.a[n2] = d3;
                    n5 = (n4 | n3) ^ 0xC92F44A4;
                    continue block11;
                }
                case -1095969754: {
                    return;
                }
                case 774175829: {
                    n6 ^= n5 ^ 0x502E28A0;
                    n5 = (n4 | n3) ^ 0xC1D23BFD;
                    continue block11;
                }
                case -1236161665: {
                    n6 ^= n5 ^ 0x340B21AD;
                    n5 = (n4 | n3) ^ 0xE5456F7E;
                    continue block11;
                }
                case -1707376475: {
                    this.c[n2] = d4;
                    n5 = (n4 | n3) ^ 0x515A138E;
                    continue block11;
                }
                case 289906752: {
                    n6 ^= n5 ^ 0xDD6B08A0;
                    n5 = (n4 | n3) ^ 0x58521F80;
                    continue block11;
                }
                case -438896972: {
                    n6 ^= n5 ^ 0x5E6F16B9;
                    n5 = (n4 | n3) ^ 0x6A33874E;
                    continue block11;
                }
                case -408516130: {
                    n5 = (n4 | n3) ^ 0x6E394F9B;
                    continue block11;
                }
                case 657256539: 
            }
            this.b[n2] = d2;
            n5 = (n4 | n3) ^ 0x9AA8196F;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private double bY(int n2) {
        int n3 = c & 0x28A284C6 ^ 0x46CCDB7B;
        int n4 = 0;
        int n5 = (n3 | 0x28A284C6) ^ 0x796CC959;
        n4 = (n3 | 0x28A284C6) ^ 0x1820B3C6;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | 0x28A284C6) ^ 0xDE26A4AA;
            }
            block6: while (true) {
                switch (n4) {
                    default: {
                        continue block6;
                    }
                    case -1329038507: {
                        int n6 = n2 + 1 & 3;
                        n5 ^= 0xD3767D77;
                        double d2 = this.b[n6] - this.b[n2];
                        n5 ^= 0x3772C2D5;
                        double d3 = this.a[n6] - this.a[n2];
                        n5 ^= 0xBF0DE284;
                        double d4 = this.c[n6] - this.c[n2];
                        n5 ^= 0x4F6B7F5;
                        return Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
                    }
                    case -1796020312: {
                        n5 ^= n4 ^ 0x1ABD5FBB;
                        continue block5;
                    }
                    case 1993239609: 
                }
                n4 = (n3 | 0x28A284C6) ^ 0xFA1C3857;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void bZ(class_4588 var1_1, Matrix4f var2_2, int var3_3, double var4_4, double var6_5, double var8_6, int var10_7, int var11_8) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void ca(class_4588 var1_1, Matrix4f var2_2, double var3_3, double var5_4, double var7_5, double var9_6, int var11_7, int var12_8) {
        block51: {
            var26_9 = 1525013241;
            var23_10 = gS.c & 1525013241 ^ -188348341;
            var25_11 = 0;
            var24_13 = (var23_10 | var26_9) ^ -375988325;
            var25_11 = (var23_10 | var26_9) ^ 191912929;
            ** GOTO lbl58
lbl7:
            // 2 sources

            while (true) {
                var24_13 ^= 1589995802;
                var15_14 = v0;
                var24_13 ^= 1172341532;
                var17_15 = 0.0;
                var25_11 = this.a.method_10166() == class_2350.class_2351.field_11052 ? (var23_10 | var26_9) ^ 1568497764 : (var23_10 | var26_9) ^ -783746908;
                ** GOTO lbl109
lbl14:
                // 1 sources

                while (true) {
                    var25_11 = (var23_10 | var26_9) ^ 1840304200;
                    if (true) ** GOTO lbl69
                    break;
                }
                break;
            }
            while (true) {
                var25_11 = (var23_10 | var26_9) ^ 1705954696;
                break block51;
                break;
            }
lbl20:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl22:
            // 1 sources

            while (true) {
                var25_11 = (var23_10 | var26_9) ^ -1583229760;
                break block51;
                break;
            }
            var25_11 = (var23_10 | var26_9) ^ 1605502724;
            block38: while (true) {
                switch (var25_11) {
                    case -932706940: {
                        var24_13 ^= var25_11 ^ 623362504;
                        ** continue;
                    }
                    case -614994928: {
                        v1 = 1.0;
                        ** break;
                    }
                    case 904270719: {
                        var24_13 ^= var25_11 ^ -521817229;
                        ** break;
                    }
                    case -1351841669: {
                        v1 = 0.0;
                        ** break;
                    }
                    case 1536938006: {
                        var24_13 ^= var25_11 ^ -1902612454;
                        var25_11 = (var23_10 | var26_9) ^ 632305387;
                        break;
                    }
                    case -1588208129: {
                        if (this.a.method_10166() == class_2350.class_2351.field_11048) {
                            var25_11 = (var23_10 | var26_9) ^ -889075324;
                            break;
                        }
                        var25_11 = (var23_10 | var26_9) ^ -1518597395;
                        break;
                    }
lbl50:
                    // 2 sources

                    var24_13 ^= -1300973833;
                    var13_12 = v1;
                    var25_11 = (var23_10 | var26_9) ^ -1386037720;
                    break block51;
lbl54:
                    // 1 sources

                    var25_11 = (var23_10 | var26_9) ^ 1368085120;
                    continue block38;
                    case -174620390: {
                        var25_11 = (var23_10 | var26_9) ^ 915398527;
                    }
                }
lbl58:
                // 6 sources

            }
lbl59:
            // 1 sources

            while (true) {
                var25_11 = (var23_10 | var26_9) ^ -177454156;
                break block51;
                break;
            }
            block40: while (true) {
                var19_16 = v2;
                var21_17 = 0.0;
                var25_11 = (var23_10 | var26_9) ^ -1032182521;
                if (true) ** GOTO lbl69
                block41: while (true) {
                    var25_11 = (var23_10 | var26_9) ^ 1099473239;
lbl69:
                    // 3 sources

                    block42: while (true) {
                        switch (var25_11) {
                            case 1507674975: {
                                var21_17 = 1.0;
                                ** break;
                            }
                            case 1016987644: {
                                var24_13 ^= var25_11 ^ 1604698453;
                                var25_11 = (var23_10 | var26_9) ^ 383395021;
                                continue block42;
                            }
                            case -1823012173: {
                                var24_13 ^= var25_11 ^ 965593644;
                                ** GOTO lbl98
                            }
                            case -243550933: {
                                var25_11 = (var23_10 | var26_9) ^ -1489333852;
                                continue block42;
                            }
                            case -398590410: {
                                if (this.a.method_10166() != class_2350.class_2351.field_11052) ** GOTO lbl96
                                var25_11 = (var23_10 | var26_9) ^ 261910480;
                            }
                            default: {
                                continue block42;
                            }
                            {
                            }
                            case -1521718957: {
                                var24_13 ^= var25_11 ^ 210605678;
                                continue block41;
                            }
                            case -1083212884: {
                                gS.ce(var1_1, var2_2, var3_3 - var13_12 * var9_6 - var17_15 * var9_6, var5_4 - var19_16 * var9_6, var7_5 - var15_14 * var9_6 - var21_17 * var9_6, var3_3 + var13_12 * var9_6 - var17_15 * var9_6, var5_4 - var19_16 * var9_6, var7_5 + var15_14 * var9_6 - var21_17 * var9_6, var3_3 + var13_12 * var9_6 + var17_15 * var9_6, var5_4 + var19_16 * var9_6, var7_5 + var15_14 * var9_6 + var21_17 * var9_6, var3_3 - var13_12 * var9_6 + var17_15 * var9_6, var5_4 + var19_16 * var9_6, var7_5 - var15_14 * var9_6 + var21_17 * var9_6, var11_7, var12_8);
                                ** continue;
                            }
lbl96:
                            // 2 sources

                            var25_11 = (var23_10 | var26_9) ^ 1537979304;
                            continue block42;
lbl98:
                            // 1 sources

                            var25_11 = (var23_10 | var26_9) ^ -1183045148;
                            continue block42;
lbl100:
                            // 1 sources

                            while (true) {
                                var25_11 = (var23_10 | var26_9) ^ -2069581049;
                                ** GOTO lbl109
                                break;
                            }
lbl103:
                            // 1 sources

                            while (true) {
                                var25_11 = (var23_10 | var26_9) ^ -1571408996;
                                break block51;
                                break;
                            }
lbl106:
                            // 2 sources

                            while (true) {
                                var24_13 ^= 1114658166;
                                continue block40;
                                break;
                            }
lbl109:
                            // 2 sources

                            block46: while (true) {
                                switch (var25_11) {
                                    default: {
                                        continue block46;
                                    }
                                    case -1550140769: {
                                        var24_13 ^= var25_11 ^ -1820367926;
                                        ** continue;
                                    }
                                    case -788932452: {
                                        v2 = 1.0;
                                        ** GOTO lbl106
                                    }
                                    case 2051238396: {
                                        v2 = 0.0;
                                        ** continue;
                                    }
                                    case 800006751: 
                                }
                                var24_13 ^= var25_11 ^ 525007626;
                                var25_11 = (var23_10 | var26_9) ^ 773718631;
                            }
                            case 1201402655: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            return;
        }
        block47: while (true) {
            switch (var25_11) {
                default: {
                    continue block47;
                }
                case 1598426683: {
                    v0 = 0.0;
                    ** GOTO lbl7
                }
                case 193698127: {
                    v0 = 1.0;
                    ** continue;
                }
                case -1689708685: {
                    var24_13 ^= var25_11 ^ 1694453399;
                    ** continue;
                }
                case 1401251027: {
                    var24_13 ^= var25_11 ^ -303166188;
                    ** continue;
                }
                case 1555163495: {
                    if (this.a.method_10166() != class_2350.class_2351.field_11048) ** continue;
                    var25_11 = (var23_10 | var26_9) ^ 554738309;
                    continue block47;
                }
                case -537429890: 
            }
            break;
        }
        var24_13 ^= var25_11 ^ 541139354;
        ** while (true)
    }

    private static int cb(int n2, int n3) {
        int n4 = 1475535918;
        int n5 = 29003031;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x6BA51056)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x57FA522E;
        n6 += (n5 | n4) ^ 0x57FABE24;
        n6 -= (n5 | n4) ^ 0x57FAEF3F;
        n6 -= (n5 | n4) ^ 0x57FA3B82;
        n6 += (n5 | n4) ^ 0x57FA92DA;
        n6 -= (n5 | n4) ^ 0x57FAA886;
        n6 += (n5 | n4) ^ 0x57FA98AD;
        n6 -= (n5 | n4) ^ 0x57FA0B8B;
        return n6 += (n5 | n4) ^ 0x57FAC3CD;
    }

    /*
     * Exception decompiling
     */
    private void cc(class_4588 var1_1, Matrix4f var2_2, class_243 var3_3, cA var4_4, long var5_5) {
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
    private void cd(class_4588 var1_1, Matrix4f var2_2, double var3_3, double var5_4, double var7_5, double var9_6, double var11_7, double var13_8, double var15_9, double var17_10, double var19_11, double var21_12, double var23_13, int var25_14, int var26_15) {
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
    private static void ce(class_4588 var0, Matrix4f var1_1, double var2_2, double var4_3, double var6_4, double var8_5, double var10_6, double var12_7, double var14_8, double var16_9, double var18_10, double var20_11, double var22_12, double var24_13, int var26_14, int var27_15) {
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
    private static void vertex(class_4588 var0, Matrix4f var1_1, double var2_2, double var4_3, double var6_4, int var8_5, int var9_6, int var10_7, int var11_8) {
        var15_9 = -109521441;
        var12_10 = gS.c & -109521441 ^ 787082998;
        var14_11 = 0;
        ** GOTO lbl29
lbl5:
        // 1 sources

        while (true) {
            var14_11 = (var12_10 | var15_9) ^ 1407562942;
            if (true) ** GOTO lbl10
            break;
        }
        block8: while (true) {
            var14_11 = (var12_10 | var15_9) ^ -1635145398;
lbl10:
            // 3 sources

            block9: while (true) {
                switch (var14_11) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block9;
                        }
                        break;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        var14_11 = (var12_10 | var15_9) ^ -1917841988;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 1917448771: {
                        return;
                    }
lbl20:
                    // 1 sources

                    while (true) {
                        var14_11 = (var12_10 | var15_9) ^ -1706832992;
                        ** continue;
                        break;
                    }
                    case 1634752181: {
                        break block8;
                    }
                    case 1706701919: {
                        var0.method_22918((Matrix4fc)var1_1, (float)var2_2, (float)var4_3, (float)var6_4).method_1336(var8_5, var9_6, var10_7, var11_8);
                        ** continue;
                    }
lbl29:
                    // 1 sources

                    var13_12 = (var12_10 | var15_9) ^ -141870688;
                    continue block8;
                    case 8118868: {
                        var13_12 ^= var14_11 ^ -1455783168;
                        ** continue;
                    }
                    case -1407431871: {
                        var13_12 ^= var14_11 ^ -1929816821;
                        ** continue;
                    }
                }
                break;
            }
            break;
        }
        var14_11 = (var12_10 | var15_9) ^ -8249941;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean shouldRenderNvg(class_310 var1_1) {
        block55: {
            block53: {
                block50: {
                    block52: {
                        break block53;
lbl1:
                        // 8 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1087213719;
                            ** GOTO lbl58
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1946508623;
                            ** GOTO lbl58
lbl7:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1832730142;
                                ** GOTO lbl58
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1479190912;
                                ** GOTO lbl58
lbl13:
                                // 1 sources

                                while (true) {
                                    if (!this.isEnabled()) ** GOTO lbl1
                                    break block50;
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 1639900874;
                                    ** GOTO lbl58
                                    break;
                                }
                                break;
                            }
lbl19:
                            // 1 sources

                            block31: while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 2011690917;
                                ** GOTO lbl58
lbl22:
                                // 1 sources

                                while (true) {
                                    if (!(this.l > 0.01f)) ** GOTO lbl1
                                    ** GOTO lbl94
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    block51: {
                                        var4_4 = (var2_3 | var5_2) ^ -1752383834;
                                        ** GOTO lbl58
lbl28:
                                        // 1 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ -1743061489;
                                            ** GOTO lbl58
                                            break;
                                        }
lbl31:
                                        // 1 sources

                                        while (true) {
                                            if (var1_1.field_1687 == null) ** GOTO lbl1
                                            break block51;
                                            break;
                                        }
lbl34:
                                        // 1 sources

                                        while (true) {
                                            var3_5 ^= var4_4 ^ 1292055874;
                                            ** continue;
                                            break;
                                        }
lbl37:
                                        // 1 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ 179804269;
                                            ** GOTO lbl58
                                            break;
                                        }
lbl40:
                                        // 1 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ -232897603;
                                            ** GOTO lbl58
lbl43:
                                            // 1 sources

                                            while (true) {
                                                v0 = true;
                                                ** GOTO lbl55
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    var4_4 = (var2_3 | var5_2) ^ 1468334038;
                                    ** GOTO lbl58
lbl49:
                                    // 1 sources

                                    while (true) {
                                        if (!hJ.ok()) ** GOTO lbl1
                                        break block52;
                                        break;
                                    }
                                    break;
                                }
lbl52:
                                // 1 sources

                                while (true) {
                                    block54: {
                                        var4_4 = (var2_3 | var5_2) ^ -1318825711;
                                        break block54;
lbl55:
                                        // 2 sources

                                        while (true) {
                                            var3_5 ^= 980969066;
                                            ** GOTO lbl102
                                            break;
                                        }
                                    }
lbl59:
                                    // 7 sources

                                    block43: while (true) {
                                        switch (var4_4) lbl-1000:
                                        // 6 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block43;
                                                }
                                                break;
                                            }
                                            case -1325871049: {
                                                break block31;
                                            }
                                            case -1975447041: {
                                                ** continue;
                                            }
                                            case -1084848543: {
                                                ** continue;
                                            }
                                            case -1868834748: {
                                                ** continue;
                                            }
                                            case 829472944: {
                                                ** continue;
                                            }
                                            case 2137444846: {
                                                ** continue;
                                            }
                                            case -1790593245: {
                                                ** continue;
                                            }
                                            case 1137401765: {
                                                var3_5 ^= var4_4 ^ -275144663;
                                                ** continue;
                                            }
lbl81:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ 1916377282;
                                                ** GOTO lbl-1000
                                                break;
                                            }
                                            case 57999421: {
                                                ** continue;
                                            }
lbl86:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ 355778477;
                                                ** GOTO lbl-1000
                                                break;
                                            }
                                            case -2088615100: {
                                                ** continue;
                                            }
lbl91:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ -1153133769;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl94:
                                            // 1 sources

                                            var4_4 = (var2_3 | var5_2) ^ -469159972;
                                            ** GOTO lbl-1000
                                            case 358771804: {
                                                if (!(var1_1.field_1755 instanceof class_408)) ** GOTO lbl1
                                                break;
                                            }
lbl99:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ -761576092;
                                                ** continue;
                                                break;
                                            }
lbl102:
                                            // 1 sources

                                            return v0;
                                            case 1894814023: {
                                                v0 = false;
                                                ** continue;
                                            }
                                            case -2034054869: {
                                                ** continue;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            var4_4 = (var2_3 | var5_2) ^ -563694946;
                            ** GOTO lbl59
                            break;
                        }
lbl110:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1995282193;
                            ** GOTO lbl59
                            break;
                        }
                        {
                            case 1481523336: {
                                var3_5 ^= var4_4 ^ 608023930;
                                ** continue;
                            }
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ -792118605;
                    ** GOTO lbl59
                    {
                        case 958045567: {
                            if (var1_1.field_1755 == null) break;
                            ** continue;
                        }
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ 1694395557;
                ** GOTO lbl59
            }
            var5_2 = -463731872;
            var2_3 = gS.c & -463731872 ^ -1557909631;
            var4_4 = 0;
            var3_5 = (var2_3 | var5_2) ^ 1616999323;
            ** while (true)
            {
                case 1547222230: {
                    ** continue;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ -703795375;
            ** GOTO lbl59
            {
                case -305416308: {
                    if (!this.a) ** GOTO lbl1
                    ** continue;
                }
                case 934614354: {
                    ** continue;
                }
                case 1820757328: {
                    ** continue;
                }
                case 1444445936: {
                    ** continue;
                }
                case 904358533: {
                    if (!((Boolean)this.d.getValue()).booleanValue()) ** GOTO lbl1
                    ** continue;
                }
                case -1852720912: {
                    break block55;
                }
                ** case -230125492:
            }
lbl150:
            // 1 sources

            if (var1_1.field_1724 != null) ** break;
            ** while (true)
            ** while (true)
        }
        var4_4 = (var2_3 | var5_2) ^ -1531482044;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void renderNvg(W var1_1, class_310 var2_2) {
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
    private void cf(W var1_1, float var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        block42: {
            block43: {
                var13_7 = 1662776937;
                var12_8 = -1007859005;
                var9_9 = gS.c & 1662776937 ^ -390155489;
                var11_10 = 0;
                var10_13 = (var9_9 | var13_7) ^ 244244354;
                var11_10 = (var9_9 | var13_7) ^ 2123766643;
                ** GOTO lbl127
lbl8:
                // 1 sources

                while (true) {
                    var11_10 = (var9_9 | var13_7) ^ 334598740;
                    break block42;
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    var11_10 = (var9_9 | var13_7) ^ 1959710714;
                    break block42;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var11_10 = (var9_9 | var13_7) ^ 1589737787;
                    break block42;
lbl17:
                    // 2 sources

                    while (true) {
                        var11_10 = (var9_9 | var13_7) ^ -985778307;
                        break block42;
                        break;
                    }
                    break;
                }
                while (true) {
                    var11_10 = (var9_9 | var13_7) ^ -9935645;
                    break block43;
                    break;
                }
lbl23:
                // 2 sources

                while (true) {
                    var10_13 ^= -377128043;
                    var8_12 = v0;
                    ** continue;
                    break;
                }
            }
lbl28:
            // 2 sources

            block39: while (true) {
                switch (var11_10) {
                    default: {
                        continue block39;
                    }
                    case 1675119689: {
                        if (!(this.c > 0.0f)) ** continue;
                        var11_10 = (var9_9 | var13_7) ^ -758482264;
                        continue block39;
                    }
                    case 349672348: {
                        var10_13 ^= var11_10 ^ 767933112;
                        ** GOTO lbl51
                    }
                    case 964005335: {
                        var10_13 ^= var11_10 ^ 6792435;
                        ** break;
                    }
                    case 1267684590: {
                        var10_13 ^= var11_10 ^ 1034827011;
                        var11_10 = (var9_9 | var13_7) ^ -2006467786;
                        continue block39;
                    }
                    case -453431010: {
                        v0 = gS.cm(var6_6, gS.cb((var10_13 | var11_10 ^ -2015180937) ^ (var11_10 ^ -1214696942), (var9_9 | var11_10 ^ -2015180937) ^ ((var10_13 | var11_10 ^ -2015180937) ^ (var11_10 ^ 485508085))), this.c);
                        ** GOTO lbl23
                    }
lbl49:
                    // 1 sources

                    var11_10 = (var9_9 | var13_7) ^ 256296545;
                    continue block39;
lbl51:
                    // 1 sources

                    var11_10 = (var9_9 | var13_7) ^ -1912924400;
                    continue block39;
                    case 1715789935: 
                }
                v0 = var6_6;
                ** continue;
                break;
            }
        }
        block40: while (true) {
            switch (var11_10) {
                case -860145560: {
                    NanoVG.nvgLineCap((long)var1_1.a, (int)1);
                    var11_10 = (var9_9 | var13_7) ^ -26369676;
                    continue block40;
                }
                case 780255234: {
                    var10_13 ^= var11_10 ^ -2145579514;
                    ** break;
                }
                case -1068355202: {
                    NanoVG.nvgStroke((long)var1_1.a);
                    var11_10 = (var9_9 | var13_7) ^ -1486733153;
                    continue block40;
                }
                case -129080021: {
                    var10_13 ^= var11_10 ^ -1628672013;
                    var11_10 = (var9_9 | var13_7) ^ 654626583;
                    continue block40;
                }
                case -723285074: {
                    ** break;
                }
                case -1249997244: {
                    NanoVG.nvgBeginPath((long)var1_1.a);
                    var11_10 = (var9_9 | var13_7) ^ 522348282;
                    continue block40;
                }
                case -191000187: {
                    var10_13 ^= var11_10 ^ -397069558;
                    var11_10 = (var9_9 | var13_7) ^ 744173835;
                    continue block40;
                }
                case -1594442582: {
                    var1_1.strokeCircle(var2_2, var3_3, var4_4 + var5_5, var5_5 * 0.8f, (int)(120.0f * this.c) << gS.cb((var10_13 | var11_10 ^ var12_8) ^ (var11_10 ^ 1941356453), (var9_9 | var11_10 ^ var12_8) ^ ((var10_13 | var11_10 ^ var12_8) ^ (var11_10 ^ 413205584))) | var8_12 & gS.cb((var10_13 | var11_10 ^ var12_8) ^ (var11_10 ^ 1941356474), (var9_9 | var11_10 ^ var12_8) ^ ((var10_13 | var11_10 ^ var12_8) ^ (var11_10 ^ -1371645400))));
                    ** GOTO lbl17
                }
                case -501276014: {
                    var10_13 ^= var11_10 ^ 1013406492;
                    var11_10 = (var9_9 | var13_7) ^ 737003009;
                    continue block40;
                }
                case 1633450563: {
                    var10_13 ^= var11_10 ^ 1343189175;
                    var11_10 = (var9_9 | var13_7) ^ 557913008;
                    continue block40;
                }
                case -1619969915: {
                    var10_13 ^= var11_10 ^ 802405263;
                    ** continue;
                }
                case -889264945: {
                    NanoVG.nvgStrokeWidth((long)var1_1.a, (float)var5_5);
                    ** continue;
                }
lbl101:
                // 1 sources

                var11_10 = (var9_9 | var13_7) ^ 564063075;
                ** GOTO lbl108
lbl103:
                // 1 sources

                var11_10 = (var9_9 | var13_7) ^ 1263094741;
                continue block40;
                case 1289598944: {
                    var10_13 ^= var11_10 ^ -54268437;
                    var11_10 = (var9_9 | var13_7) ^ -941384805;
                }
lbl108:
                // 3 sources

                default: {
                    continue block40;
                }
                case -941308300: {
                    NanoVG.nvgArc((long)var1_1.a, (float)var2_2, (float)var3_3, (float)var4_4, (float)-1.5707964f, (float)(-1.5707964f + var7_11), (int)2);
                    var11_10 = (var9_9 | var13_7) ^ -1964798660;
                    continue block40;
                }
                case 969361829: {
                    NanoVG.nvgStrokeColor((long)var1_1.a, (NVGColor)gS.ck(var8_12, (int)(255.0f * var1_1.a)));
                    var11_10 = (var9_9 | var13_7) ^ 161535469;
                    continue block40;
                }
                case 366106123: {
                    var10_13 ^= var11_10 ^ -895913992;
                    var11_10 = (var9_9 | var13_7) ^ -763838758;
                    continue block40;
                }
                case 744254692: {
                    if (this.c > 0.0f) ** break;
                    ** continue;
                    var11_10 = (var9_9 | var13_7) ^ 1063025873;
                    continue block40;
                }
lbl127:
                // 1 sources

                block41: while (true) {
                    switch (var11_10) {
                        case -1792414708: {
                            break;
                        }
                        case -1019987072: {
                            var7_11 = Math.max(0.001f, this.b) * 6.2831855f;
                            var11_10 = (var9_9 | var13_7) ^ -1607425135;
                            ** continue;
                        }
                        case 1112716334: {
                            var10_13 ^= var11_10 ^ -1518391792;
                            ** break;
lbl138:
                            // 1 sources

                            var11_10 = (var9_9 | var13_7) ^ 680250623;
                        }
                        default: {
                            continue block41;
                        }
                    }
                    var11_10 = (var9_9 | var13_7) ^ -1444068527;
                }
                case -903799780: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private String cg() {
        block43: {
            block42: {
                block44: {
                    block41: {
                        block45: {
                            block40: {
                                var5_1 = -788662355;
                                var2_2 = gS.c & -788662355 ^ 1805157862;
                                var4_3 = 0;
                                ** GOTO lbl109
lbl5:
                                // 1 sources

                                while (true) {
                                    var3_5 ^= 488003383;
                                    break block40;
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (true) {
                                    var3_5 ^= var4_3 ^ 784509806;
                                    break block41;
                                    break;
                                }
lbl11:
                                // 1 sources

                                while (true) {
                                    v0 = gS.q;
                                    ** GOTO lbl122
                                    break;
                                }
                            }
                            if (!(var1_4 >= 9.95f)) break block44;
                            break block45;
lbl17:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ 922190760;
                                break block42;
                                break;
                            }
lbl20:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -1046008281;
                                break block42;
lbl23:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 266124905;
                                    break block42;
lbl26:
                                    // 1 sources

                                    while (!(this.e <= 1.0E-5f)) {
                                        var4_3 = (var2_2 | var5_1) ^ -1446726195;
                                        break block42;
lbl29:
                                        // 1 sources

                                        return gS.d;
                                    }
                                    ** GOTO lbl116
                                    break;
                                }
                                break;
                            }
lbl32:
                            // 1 sources

                            while (true) {
                                v0 = gS.o;
                                ** GOTO lbl122
                                break;
                            }
                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ 1823459332;
                                break block42;
                                break;
                            }
lbl38:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -1882229375;
                                break block42;
lbl41:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -1408030268;
                                    break block42;
lbl44:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= var4_3 ^ 1458369481;
                                        break block43;
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
lbl47:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ 1564648439;
                                break block42;
lbl50:
                                // 1 sources

                                return gS.a;
lbl52:
                                // 1 sources

                                return gS.u;
                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -948711846;
                                    break block42;
                                    break;
                                }
lbl57:
                                // 1 sources

                                while (true) {
                                    var3_5 ^= var4_3 ^ 142496998;
                                    ** GOTO lbl104
                                    break;
                                }
                                break;
                            }
                        }
                        var3_5 ^= 417555774;
                        ** while (true)
                    }
                    var4_3 = (var2_2 | var5_1) ^ -913106505;
                    break block42;
lbl66:
                    // 1 sources

                    while (true) {
                        if (!(this.g >= 1.0f)) ** continue;
                        ** GOTO lbl118
                        break;
                    }
lbl69:
                    // 1 sources

                    while (true) {
                        if (!(this.e >= 1.0f)) ** continue;
                        ** GOTO lbl114
                        break;
                    }
                }
                var3_5 ^= 417555774;
                ** while (true)
            }
lbl76:
            // 2 sources

            block37: while (true) {
                switch (var4_3) lbl-1000:
                // 5 sources

                {
                    while (true) {
                        default: {
                            continue block37;
                        }
                        break;
                    }
                    case 1475272235: {
                        ** continue;
                    }
                    case -854952889: {
                        ** GOTO lbl26
                    }
                    case 1833869159: {
                        ** continue;
                    }
                    case -1756217365: {
                        ** continue;
                    }
                    case 1949467246: {
                        ** continue;
                    }
                    case -1497410536: {
                        ** continue;
                    }
                    case 1305515598: {
                        ** continue;
                    }
                    case 846130776: {
                        ** continue;
                    }
                    case 1316047562: {
                        ** continue;
                    }
                    case 979032520: {
                        ** continue;
                    }
                    case 1379484194: {
                        var3_5 ^= var4_3 ^ 1273417904;
                        ** continue;
                    }
lbl104:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1766627192;
                    ** GOTO lbl-1000
                    case 668536571: {
                        var3_5 ^= var4_3 ^ -1496736095;
                        ** continue;
                    }
lbl109:
                    // 1 sources

                    var3_5 = (var2_2 | var5_1) ^ -386116744;
                    ** continue;
                    case -199145082: {
                        var1_4 = (1.0f - this.g) / (this.e * 20.0f);
                        ** continue;
                    }
lbl114:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -601556716;
                    ** GOTO lbl-1000
lbl116:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1238539871;
                    ** GOTO lbl-1000
lbl118:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1020666517;
                    ** continue;
lbl120:
                    // 1 sources

                    return String.format(Locale.US, v0, new Object[]{Float.valueOf(var1_4)});
lbl122:
                    // 2 sources

                    var3_5 ^= -13994976;
                    ** continue;
                    case 953428612: {
                        var3_5 ^= var4_3 ^ 1676764805;
                        ** continue;
                    }
                    case 1015953845: 
                }
                break;
            }
            var3_5 ^= var4_3 ^ 392701703;
            ** while (true)
        }
        var4_3 = (var2_2 | var5_1) ^ -1249067739;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void ch(W var1_1, float var2_2, float var3_3, float var4_4) {
        block36: {
            block35: {
                block40: {
                    block37: {
                        block39: {
                            block38: {
                                break block38;
lbl1:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl3:
                                // 1 sources

                                while (true) {
                                    var7_7 = (var5_6 | var8_5) ^ -1297618438;
                                    ** GOTO lbl50
                                    break;
                                }
lbl6:
                                // 1 sources

                                while (true) {
                                    var7_7 = (var5_6 | var8_5) ^ -1730254296;
                                    ** GOTO lbl50
lbl9:
                                    // 1 sources

                                    while (true) {
                                        var6_8 ^= var7_7 ^ 1611503821;
                                        ** continue;
                                        break;
                                    }
lbl12:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl14:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl16:
                                    // 1 sources

                                    return;
                                }
lbl18:
                                // 1 sources

                                while (true) {
                                    var7_7 = (var5_6 | var8_5) ^ -1966645700;
                                    ** GOTO lbl50
lbl21:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = (var5_6 | var8_5) ^ 1561931855;
                                        ** GOTO lbl50
                                        break;
                                    }
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var6_8 ^= var7_7 ^ -2044665294;
                                        ** GOTO lbl89
                                        break;
                                    }
lbl27:
                                    // 1 sources

                                    while (true) {
                                        var6_8 ^= var7_7 ^ -1640813258;
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
                                NanoVG.nvgText((long)var1_1.a, (float)var2_2, (float)(var3_3 + var1_1.s(0.5f)), (CharSequence)gS.k);
                                var7_7 = (var5_6 | var8_5) ^ -1073456605;
                                ** GOTO lbl50
                                NanoVG.nvgFontSize((long)var1_1.a, (float)var4_4);
                                var7_7 = (var5_6 | var8_5) ^ 1602406737;
                                ** GOTO lbl50
lbl37:
                                // 1 sources

                                while (true) {
                                    var7_7 = (var5_6 | var8_5) ^ -1441608612;
                                    ** GOTO lbl50
lbl40:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = (var5_6 | var8_5) ^ -1027744128;
                                        if (true) ** GOTO lbl50
                                        break;
                                    }
                                    break;
                                }
                            }
                            var8_5 = 541760333;
                            var5_6 = gS.c & 541760333 ^ -1170046729;
                            var7_7 = 0;
                            break block39;
                            block32: while (true) {
                                var7_7 = (var5_6 | var8_5) ^ 1277439830;
lbl50:
                                // 16 sources

                                block33: while (true) {
                                    switch (var7_7) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block33;
                                            }
                                            break;
                                        }
                                        case 2029471103: {
                                            ** continue;
                                        }
                                        case 814597571: {
                                            ** continue;
                                        }
                                        case -413946960: {
                                            ** continue;
                                        }
                                        case -1231572304: {
                                            ** continue;
                                        }
                                        case 149778949: {
                                            ** continue;
                                        }
                                        case 2051981788: {
                                            ** continue;
                                        }
                                        case -1105478841: {
                                            ** continue;
                                        }
                                        case 1017328587: {
                                            break block32;
                                        }
                                        case -2037099255: {
                                            NanoVG.nvgTextLetterSpacing((long)var1_1.a, (float)(var4_4 * 0.18f));
                                            break block35;
                                        }
                                        case 274225059: {
                                            NanoVG.nvgFontFace((long)var1_1.a, (CharSequence)gS.cj());
                                            ** continue;
                                        }
                                        case 2036403579: {
                                            NanoVG.nvgTextLetterSpacing((long)var1_1.a, (float)0.0f);
                                            ** continue;
                                        }
                                        case 580186583: {
                                            var6_8 ^= var7_7 ^ 235937718;
                                            ** continue;
                                        }
                                        case -1670668403: {
                                            var6_8 ^= var7_7 ^ 959703106;
                                            ** continue;
                                        }
                                        case 1319367860: {
                                            var6_8 ^= var7_7 ^ -909999766;
                                            break block36;
                                        }
lbl89:
                                        // 1 sources

                                        var7_7 = (var5_6 | var8_5) ^ -1020553596;
                                        ** continue;
                                        case -160516951: {
                                            NanoVG.nvgTextAlign((long)var1_1.a, (int)gS.cb((var6_8 | var7_7 ^ -702271516) ^ (var7_7 ^ 1911215678), (var5_6 | var7_7 ^ -702271516) ^ ((var6_8 | var7_7 ^ -702271516) ^ (var7_7 ^ 1500863804))));
                                            break block37;
                                        }
                                        case -439856466: {
                                            var6_8 ^= var7_7 ^ -1442366230;
                                            continue block32;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            var7_7 = (var5_6 | var8_5) ^ 639698034;
                            ** GOTO lbl50
                        }
                        var6_8 = (var5_6 | var8_5) ^ -406291725;
                        var7_7 = (var5_6 | var8_5) ^ -2031507404;
                        ** GOTO lbl50
                        {
                            ** case -1267415531:
                        }
lbl104:
                        // 1 sources

                        var6_8 ^= var7_7 ^ -1660051627;
                        break block40;
                    }
                    var7_7 = (var5_6 | var8_5) ^ 238968298;
                    ** GOTO lbl50
                }
                var7_7 = (var5_6 | var8_5) ^ 1021234934;
                ** GOTO lbl50
                NanoVG.nvgFillColor((long)var1_1.a, (NVGColor)gS.ck(gS.cb((var6_8 | var7_7 ^ -954650371) ^ (var7_7 ^ 1774619924), (var5_6 | var7_7 ^ -954650371) ^ ((var6_8 | var7_7 ^ -954650371) ^ (var7_7 ^ -890967926))), (int)(255.0f * var1_1.a)));
                var7_7 = (var5_6 | var8_5) ^ -186028213;
                ** GOTO lbl50
            }
            var7_7 = (var5_6 | var8_5) ^ 72425656;
            ** GOTO lbl50
        }
        var7_7 = (var5_6 | var8_5) ^ 215820623;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private float ci(W var1_1, float var2_2) {
        block42: {
            block45: {
                block44: {
                    block46: {
                        block43: {
                            var7_3 = 1424174520;
                            var4_4 = gS.c & 1424174520 ^ 1062427719;
                            var6_5 = 0;
                            break block45;
lbl5:
                            // 1 sources

                            while (true) {
                                NanoVG.nvgTextLetterSpacing((long)var1_1.a, (float)0.0f);
                                ** GOTO lbl39
                                break;
                            }
lbl8:
                            // 1 sources

                            return var3_7;
lbl10:
                            // 1 sources

                            while (true) {
                                var6_5 = (var4_4 | var7_3) ^ -877242413;
                                break block42;
                                break;
                            }
lbl13:
                            // 3 sources

                            block22: while (true) {
                                switch (var6_5) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block22;
                                        }
                                        break;
                                    }
                                    case -1465642629: {
                                        ** continue;
                                    }
                                    case -880375589: {
                                        ** continue;
                                    }
lbl22:
                                    // 1 sources

                                    while (true) {
                                        var5_6 ^= var6_5 ^ 880854905;
                                        ** GOTO lbl50
                                        break;
                                    }
lbl25:
                                    // 1 sources

                                    while (true) {
                                        var6_5 = (var4_4 | var7_3) ^ -2020052126;
                                        break block42;
                                        break;
                                    }
                                    case 1588242205: {
                                        var5_6 ^= var6_5 ^ 1771491540;
                                        break block43;
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        var6_5 = (var4_4 | var7_3) ^ -538263821;
                                        break block42;
                                        break;
                                    }
lbl34:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl36:
                                    // 1 sources

                                    while (true) {
                                        var6_5 = (var4_4 | var7_3) ^ 1115406686;
                                        break block42;
                                        break;
                                    }
lbl39:
                                    // 1 sources

                                    var6_5 = (var4_4 | var7_3) ^ 1943475652;
                                    ** continue;
lbl41:
                                    // 1 sources

                                    while (true) {
                                        var5_6 ^= var6_5 ^ 1176529993;
                                        ** continue;
                                        break;
                                    }
lbl44:
                                    // 1 sources

                                    while (true) {
                                        var6_5 = (var4_4 | var7_3) ^ 239879665;
                                        break block42;
                                        break;
                                    }
lbl47:
                                    // 1 sources

                                    while (true) {
                                        var6_5 = (var4_4 | var7_3) ^ -607056919;
                                        break block42;
                                        break;
                                    }
lbl50:
                                    // 1 sources

                                    var6_5 = (var4_4 | var7_3) ^ -635411361;
                                    break block42;
lbl52:
                                    // 1 sources

                                    while (true) {
                                        var5_6 ^= var6_5 ^ -1796421743;
                                        break block44;
                                        break;
                                    }
lbl55:
                                    // 1 sources

                                    while (true) {
                                        NanoVG.nvgTextAlign((long)var1_1.a, (int)gS.cb((var5_6 | var6_5 ^ 1768657177) ^ (var6_5 ^ 2117663782), (var4_4 | var6_5 ^ 1768657177) ^ ((var5_6 | var6_5 ^ 1768657177) ^ (var6_5 ^ -390468794))));
                                        ** continue;
                                        break;
                                    }
lbl58:
                                    // 1 sources

                                    while (true) {
                                        var5_6 ^= var6_5 ^ 1139477812;
                                        ** continue;
                                        break;
                                    }
                                    NanoVG.nvgTextLetterSpacing((long)var1_1.a, (float)(var2_2 * 0.18f));
                                    var6_5 = (var4_4 | var7_3) ^ 416313733;
                                    break block42;
lbl64:
                                    // 1 sources

                                    while (true) {
                                        var6_5 = (var4_4 | var7_3) ^ -1145873402;
                                        break block42;
                                        break;
                                    }
                                    case 203712571: {
                                        var5_6 ^= var6_5 ^ -1314233266;
                                        break block22;
                                    }
                                }
                                break;
                            }
                            break block46;
lbl71:
                            // 1 sources

                            while (true) {
                                NanoVG.nvgFontFace((long)var1_1.a, (CharSequence)gS.cj());
                                ** continue;
                                break;
                            }
                        }
                        var6_5 = (var4_4 | var7_3) ^ -682136444;
                        ** GOTO lbl13
                    }
                    var6_5 = (var4_4 | var7_3) ^ -1267337948;
                    ** GOTO lbl13
                }
                var6_5 = (var4_4 | var7_3) ^ 148700137;
                break block42;
lbl83:
                // 1 sources

                while (true) {
                    var5_6 ^= var6_5 ^ 1153115023;
                    ** continue;
                    break;
                }
lbl86:
                // 1 sources

                while (true) {
                    var6_5 = (var4_4 | var7_3) ^ 559536866;
                    ** continue;
                    break;
                }
            }
            var5_6 = (var4_4 | var7_3) ^ 1159467581;
            var6_5 = (var4_4 | var7_3) ^ -746286536;
            break block42;
lbl93:
            // 1 sources

            while (true) {
                var3_7 = NanoVG.nvgTextBounds((long)var1_1.a, (float)0.0f, (float)0.0f, (CharSequence)gS.k, (float[])this.b);
                ** continue;
                break;
            }
lbl96:
            // 1 sources

            while (true) {
                NanoVG.nvgFontSize((long)var1_1.a, (float)var2_2);
                ** continue;
                break;
            }
        }
        block41: while (true) {
            switch (var6_5) {
                default: {
                    continue block41;
                }
                case 1730350202: {
                    ** continue;
                }
                case -1401425977: {
                    ** continue;
                }
                case 1908357134: {
                    ** continue;
                }
                case -1541245418: {
                    ** continue;
                }
                case -1270535636: {
                    ** continue;
                }
                case 1032371361: {
                    ** continue;
                }
                case -1002429959: {
                    ** continue;
                }
                case -1608924404: {
                    ** continue;
                }
                case -127201635: {
                    ** continue;
                }
                case -1512892000: {
                    ** continue;
                }
                ** case 1999603222:
lbl125:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static String cj() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [19[UNCONDITIONALDOLOOP]], but top level block is 0[SWITCH]
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
    private static NVGColor ck(int var0, int var1_1) {
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
     * Unable to fully structure code
     */
    private int cl(long var1_1) {
        block14: {
            block16: {
                block13: {
                    block15: {
                        break block15;
lbl1:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ 1422672148;
                            break block13;
                            break;
                        }
                    }
                    var6_2 = 979634106;
                    var3_3 = gS.c & 979634106 ^ -1249731236;
                    var5_4 = 0;
                    break block16;
                }
lbl10:
                // 3 sources

                block10: while (true) {
                    block17: {
                        switch (var5_4) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block10;
                                }
                                break;
                            }
                            case -1581207194: {
                                return H.get().rainbowTextColor(var1_1);
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ -319831426;
                                ** continue;
                                break;
                            }
                            case 1517419795: {
                                var4_5 ^= var5_4 ^ 1501239196;
                                break;
                            }
                            case 1465898505: {
                                break block17;
                            }
                        }
                        var5_4 = (var3_3 | var6_2) ^ 505818776;
                        continue;
                    }
                    var5_4 = (var3_3 | var6_2) ^ 1160489370;
                    continue;
                    {
                        case 1393122688: {
                            if (!this.a.is(gS.l)) break;
                            ** continue;
                        }
                        case 1874732406: {
                            return (Integer)this.a.getValue();
                        }
                        case -349511958: {
                            var4_5 ^= var5_4 ^ -1912992379;
                            break block14;
                        }
                    }
                    var5_4 = (var3_3 | var6_2) ^ -443063571;
                    continue;
                    {
                        ** case -87214492:
                    }
lbl41:
                    // 1 sources

                    var4_5 ^= var5_4 ^ -655694127;
                    ** continue;
                    break;
                }
            }
            var4_5 = (var3_3 | var6_2) ^ 1405085944;
            var5_4 = (var3_3 | var6_2) ^ -390510089;
            ** GOTO lbl10
        }
        var5_4 = (var3_3 | var6_2) ^ -799491448;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static int cm(int var0, int var1_1, float var2_2) {
        block34: {
            block33: {
                block35: {
                    var11_3 = -231296490;
                    var10_4 = 1134694204;
                    var9_5 = 1322208709;
                    var6_6 = gS.c & 1322208709 ^ 1228738289;
                    var8_7 = 0;
                    ** GOTO lbl49
lbl7:
                    // 2 sources

                    while (true) {
                        var8_7 = (var6_6 | var9_5) ^ 1976407213;
                        break block33;
                        break;
                    }
lbl10:
                    // 2 sources

                    while (true) {
                        var8_7 = (var6_6 | var9_5) ^ 1902658147;
                        break block33;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        var7_9 ^= var8_7 ^ 147693271;
                        ** GOTO lbl7
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var8_7 = (var6_6 | var9_5) ^ -742463279;
                        ** GOTO lbl28
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        ** continue;
                        break;
                    }
lbl23:
                    // 1 sources

                    block24: while (true) {
                        switch (var7_9) {
                            case -641365143: {
                                var8_7 = (var6_6 | var9_5) ^ -1974922474;
                                break block24;
                            }
lbl28:
                            // 3 sources

                            block25: while (true) {
                                switch (var8_7) {
                                    default: {
                                        continue block25;
                                    }
                                    case -1673418972: {
                                        break block34;
                                    }
lbl34:
                                    // 1 sources

                                    while (true) {
                                        var7_9 ^= var8_7 ^ -2113078925;
                                        ** GOTO lbl10
                                        break;
                                    }
                                    default: {
                                        var8_7 = (var6_6 | var9_5) ^ 403215901;
                                        break block24;
                                    }
lbl40:
                                    // 1 sources

                                    while (true) {
                                        var8_7 = (var6_6 | var9_5) ^ -615792344;
                                        break block24;
                                        break;
                                    }
lbl43:
                                    // 1 sources

                                    while (true) {
                                        var8_7 = (var6_6 | var9_5) ^ 1116867852;
                                        break block24;
                                        break;
                                    }
                                    case 1693500594: {
                                        var7_9 ^= var8_7 ^ -1134897959;
                                        break block35;
                                    }
lbl49:
                                    // 1 sources

                                    var7_9 = (var6_6 | var9_5) ^ 1318114551;
                                    ** continue;
                                    case -1124466733: {
                                        var3_8 = class_3532.method_48781((float)var2_2, (int)(var0 >> gS.cb((var7_9 | var8_7 ^ var11_3) ^ (var8_7 ^ 1600769357), (var6_6 | var8_7 ^ var11_3) ^ ((var7_9 | var8_7 ^ var11_3) ^ (var8_7 ^ 976899334))) & gS.cb((var7_9 | var8_7 ^ var11_3) ^ (var8_7 ^ 1600769356), (var6_6 | var8_7 ^ var11_3) ^ ((var7_9 | var8_7 ^ var11_3) ^ (var8_7 ^ 665782827)))), (int)(var1_1 >> gS.cb((var7_9 | var8_7 ^ var11_3) ^ (var8_7 ^ 1600769355), (var6_6 | var8_7 ^ var11_3) ^ ((var7_9 | var8_7 ^ var11_3) ^ (var8_7 ^ -1486174919))) & gS.cb((var7_9 | var8_7 ^ var11_3) ^ (var8_7 ^ 1600769354), (var6_6 | var8_7 ^ var11_3) ^ ((var7_9 | var8_7 ^ var11_3) ^ (var8_7 ^ 1730449079)))));
                                        break block25;
                                    }
                                }
                                break;
                            }
                            ** continue;
lbl55:
                            // 1 sources

                            return var3_8 << gS.cb(((var7_9 ^= -1369058658) | var9_5) ^ 1403003048, (var6_6 | var9_5) ^ ((var7_9 | var9_5) ^ -802539340)) | var4_10 << gS.cb((var7_9 | var9_5) ^ 1403003049, (var6_6 | var9_5) ^ ((var7_9 | var9_5) ^ -485480052)) | var5_11;
lbl57:
                            // 1 sources

                            while (true) {
                                var7_9 ^= var8_7 ^ -338568147;
                                ** continue;
                                break;
                            }
                            case 1467482222: {
                                var8_7 = (var6_6 | var9_5) ^ 711607653;
                                break block24;
                            }
                        }
                        break;
                    }
                    break block33;
                }
                var8_7 = (var6_6 | var9_5) ^ -217665498;
                ** GOTO lbl28
                var5_11 = class_3532.method_48781((float)var2_2, (int)(var0 & gS.cb(((var7_9 ^= 942948760) | var9_5) ^ -209669452, (var6_6 | var9_5) ^ ((var7_9 | var9_5) ^ -569611192))), (int)(var1_1 & gS.cb((var7_9 | var9_5) ^ -209669451, (var6_6 | var9_5) ^ ((var7_9 | var9_5) ^ -140160924))));
                ** while (true)
lbl69:
                // 1 sources

                while (true) {
                    var4_10 = class_3532.method_48781((float)var2_2, (int)(var0 >> gS.cb((var7_9 | var8_7 ^ var10_4) ^ (var8_7 ^ -824315799), (var6_6 | var8_7 ^ var10_4) ^ ((var7_9 | var8_7 ^ var10_4) ^ (var8_7 ^ -355413049))) & gS.cb((var7_9 | var8_7 ^ var10_4) ^ (var8_7 ^ -824315800), (var6_6 | var8_7 ^ var10_4) ^ ((var7_9 | var8_7 ^ var10_4) ^ (var8_7 ^ 360388003)))), (int)(var1_1 >> gS.cb((var7_9 | var8_7 ^ var10_4) ^ (var8_7 ^ -824315817), (var6_6 | var8_7 ^ var10_4) ^ ((var7_9 | var8_7 ^ var10_4) ^ (var8_7 ^ 1039618522))) & gS.cb((var7_9 | var8_7 ^ var10_4) ^ (var8_7 ^ -824315818), (var6_6 | var8_7 ^ var10_4) ^ ((var7_9 | var8_7 ^ var10_4) ^ (var8_7 ^ -105511096)))));
                    ** continue;
                    break;
                }
            }
            block32: while (true) {
                switch (var8_7) {
                    default: {
                        continue block32;
                    }
                    case 1475860968: {
                        ** continue;
                    }
                    case -1800106275: {
                        ** continue;
                    }
                    case 1050086806: {
                        ** continue;
                    }
                    case 1704266384: {
                        ** continue;
                    }
                    case 976411480: {
                        ** continue;
                    }
                    case -977904413: {
                        ** continue;
                    }
                    ** case 225264377:
lbl90:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        var8_7 = (var6_6 | var9_5) ^ 722438983;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double cn(double d2) {
        int n2 = c & 0x9F6CF2B6 ^ 0x387445CA;
        int n3 = 0;
        int n4 = (n2 | 0x9F6CF2B6) ^ 0xCF8D25F0;
        n3 = (n2 | 0x9F6CF2B6) ^ 0x36EF6D92;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 593981346: {
                    double d3 = 1.0 - d2;
                    n4 ^= 0x7331D6F;
                    return 1.0 - d3 * d3 * d3;
                }
                case -1986815380: {
                    n3 = (n2 | 0x9F6CF2B6) ^ 0xBF5B049F;
                    continue block5;
                }
                case 2618209: 
            }
            n4 ^= n3 ^ 0xB8378D4;
            n3 = (n2 | 0x9F6CF2B6) ^ 0x9C1B985C;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ boolean co(long var0, cA var2_1) {
        block22: {
            block21: {
                block19: {
                    block24: {
                        block23: {
                            block20: {
                                break block23;
lbl1:
                                // 1 sources

                                while (true) {
                                    v0 = false;
                                    ** GOTO lbl30
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 666106478;
                                    break block19;
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 1310302665;
                                    break block19;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    if (var0 - var2_1.a <= (1375674679299133909L << (var5_4 ^ 1976544324) >>> (var5_4 ^ 1976544324) ^ (long)var4_5 & 0xFFFFFFFFL | (1375674679299133909L >>> (var5_4 ^ 1976544324) ^ (long)var4_5 & 0xFFFFFFFFL) << (var5_4 ^ 1976544324))) break block20;
                                    break block21;
                                    break;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    var4_5 ^= var5_4 ^ 1591510455;
                                    ** continue;
                                    break;
                                }
                            }
                            var5_4 = (var3_3 | var6_2) ^ -417639760;
                            break block19;
                        }
                        var6_2 = 712316320;
                        var3_3 = gS.c & 712316320 ^ -290831486;
                        var5_4 = 0;
                        break block24;
lbl25:
                        // 1 sources

                        while (true) {
                            var4_5 ^= var5_4 ^ -938389836;
                            break block22;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            v0 = true;
lbl30:
                            // 2 sources

                            var4_5 ^= 1573253680;
                            return v0;
                        }
lbl32:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ -1124194132;
                            break block19;
                            break;
                        }
                    }
                    var4_5 = (var3_3 | var6_2) ^ 1744307917;
                    var5_4 = (var3_3 | var6_2) ^ -527452491;
                    break block19;
lbl39:
                    // 1 sources

                    while (true) {
                        var4_5 ^= var5_4 ^ 1957611987;
                        ** continue;
                        break;
                    }
                }
lbl43:
                // 3 sources

                block18: while (true) {
                    switch (var5_4) {
                        default: {
                            continue block18;
                        }
                        case -917721652: {
                            ** continue;
                        }
                        case 1976544356: {
                            ** continue;
                        }
                        case 165938450: {
                            ** continue;
                        }
                        case 1375829774: {
                            ** continue;
                        }
                        case -1595476373: {
                            ** continue;
                        }
                        case 597051766: {
                            ** continue;
                        }
                        ** case 242278679:
lbl60:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            var5_4 = (var3_3 | var6_2) ^ -848748844;
            ** GOTO lbl43
        }
        var5_4 = (var3_3 | var6_2) ^ -1691288634;
        ** while (true)
    }
}

