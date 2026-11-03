/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_408
 *  net.minecraft.class_4588
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 *  org.lwjgl.nanovg.NVGColor
 *  org.lwjgl.nanovg.NanoVG
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_408;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NanoVG;
import z.r.W;
import z.r.aE;
import z.r.az;
import z.r.ex;
import z.r.ft;
import z.r.gF;
import z.r.gP;
import z.r.gj;
import z.r.hJ;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class dh
extends gF {
    private static final double a;
    private static final /* synthetic */ String a;
    private static final float a;
    private final ke a;
    private final float[] a;
    public static final int i;
    private static final /* synthetic */ String b;
    private static final float[] b;
    private static final double b;
    private static final /* synthetic */ String c;
    private static final double c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String k;
    private static final double d;
    private static final double e;
    private final ke b;
    private static final /* synthetic */ String e;
    private final aE a;
    private static final float b;
    private static final double f;
    private static final double g;
    private static final double h;
    private static final int a;
    private static final float c;
    private static final int b;
    private static final int c;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String f;
    private static final int d;
    private static final /* synthetic */ String g;
    private static final double i;
    private final List<ft> a;
    private static final /* synthetic */ String h;
    private static final Vector4f a;
    private static final double j;
    private static final /* synthetic */ String i;
    private static final float d;
    private final az a;
    private static final int e;
    private static final int[] a;
    private static final /* synthetic */ String j;
    private static final double k;
    private static final float[] c;
    private int f;
    private static final String[] a;
    private static final /* synthetic */ String l;
    private final Map<UUID, ex> a;
    private static final double l;
    private static final /* synthetic */ String m;
    private static final double m;
    private static final double n;
    private static final /* synthetic */ String n;
    private final gP a;
    private static final /* synthetic */ String o;
    private static final double o;
    private static final double p;
    private static final float[] d;
    private static final /* synthetic */ String p;
    private final gP b;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final double q;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private static final /* synthetic */ String x;
    private static final double r;
    private final ke c;
    private static final /* synthetic */ String y;
    private final gP c;
    private final ke d;
    private static final NVGColor a;
    private static final int g;
    private static final int h;
    private static final double s;

    /*
     * Exception decompiling
     */
    public dh() {
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
    public static dh get() {
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
    public void onEnable() {
        block10: {
            var1_1 = dh.i & -966397427 ^ 152067422;
            var3_2 = 0;
            ** GOTO lbl20
lbl4:
            // 1 sources

            while (true) {
                var2_3 ^= var3_2 ^ -1066747941;
                break block10;
                break;
            }
lbl7:
            // 1 sources

            block6: while (true) {
                switch (var3_2) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
                    case 2058656277: {
                        ** continue;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | -966397427) ^ 157398960;
                        ** GOTO lbl-1000
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | -966397427) ^ -1245616822;
                        ** continue;
                        break;
                    }
lbl20:
                    // 1 sources

                    var2_3 = (var1_1 | -966397427) ^ 1162100080;
                    ** continue;
                    case -889911981: {
                        return;
                    }
                    case -971749137: {
                        ** continue;
                    }
                }
                break;
            }
        }
        var3_2 = (var1_1 | -966397427) ^ 92338700;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        var4_1 = 350631130;
        var1_2 = dh.i & 350631130 ^ -1043307066;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -1143687732;
        var3_3 = (var1_2 | var4_1) ^ 1204291308;
        block9: while (true) {
            switch (var3_3) {
                case -1152956715: {
                    var2_4 ^= var3_3 ^ 297038211;
                    ** break;
                }
                case 1367825259: {
                    this.a.clear();
                    var3_3 = (var1_2 | var4_1) ^ -66968630;
                    continue block9;
                }
                case 17553090: {
                    this.a.clear();
                    var3_3 = (var1_2 | var4_1) ^ 1857106699;
                    continue block9;
                }
                case 1691501394: {
                    var2_4 ^= var3_3 ^ 1300339137;
                    var3_3 = (var1_2 | var4_1) ^ -721575140;
                    ** GOTO lbl27
                }
lbl23:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -2072957259;
                ** GOTO lbl27
                case -1841401038: {
                    var3_3 = (var1_2 | var4_1) ^ -1323026804;
                }
lbl27:
                // 4 sources

                default: {
                    continue block9;
                }
                case 703878676: {
                    var2_4 ^= var3_3 ^ -1431774676;
                    var3_3 = (var1_2 | var4_1) ^ 1696338952;
                    continue block9;
                }
                case -1326816810: 
            }
            break;
        }
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
     */
    private static boolean jX(class_310 var0, class_1657 var1_1) {
        block43: {
            block42: {
                block41: {
                    block39: {
                        block40: {
                            block37: {
                                block38: {
                                    block36: {
                                        break block38;
lbl1:
                                        // 4 sources

                                        block21: while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ 733629410;
lbl3:
                                            // 14 sources

                                            block22: while (true) {
                                                switch (var4_4) lbl-1000:
                                                // 6 sources

                                                {
                                                    while (true) {
                                                        default: {
                                                            continue block22;
                                                        }
                                                        break;
                                                    }
                                                    case -341408828: {
                                                        break block21;
                                                    }
                                                    case -842255554: {
                                                        v0 = false;
                                                        break block36;
                                                    }
lbl13:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_4 = (var2_3 | var5_2) ^ 193086794;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl16:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_4 = (var2_3 | var5_2) ^ 796529061;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
                                                    case 1285374944: {
                                                        break;
                                                    }
lbl21:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_4 = (var2_3 | var5_2) ^ -1668717442;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl24:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_4 = (var2_3 | var5_2) ^ -1571490943;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
                                                    while (true) {
                                                        var4_4 = (var2_3 | var5_2) ^ -1617258512;
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        var3_5 ^= -811791951;
                                        break block39;
                                        {
                                            case 2050369926: {
                                                ** continue;
                                            }
                                        }
lbl34:
                                        // 1 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ 360220401;
                                            ** GOTO lbl3
                                            break;
                                        }
                                    }
lbl38:
                                    // 2 sources

                                    while (true) {
                                        var3_5 ^= 1881592499;
                                        break block37;
                                        break;
                                    }
lbl41:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ -1863244589;
                                        ** GOTO lbl3
                                        break;
                                    }
lbl44:
                                    // 2 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ 1095419877;
                                        ** GOTO lbl3
                                        break;
                                    }
lbl47:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ -1159474044;
                                        ** GOTO lbl3
                                        break;
                                    }
                                    {
                                        case 1514281183: {
                                            return false;
                                        }
                                    }
                                    var4_4 = (var2_3 | var5_2) ^ -2080147254;
                                    ** GOTO lbl3
                                    {
                                        case 1642090008: {
                                            var3_5 ^= var4_4 ^ 1766515055;
                                            break;
                                        }
                                        case 176649607: {
                                            var3_5 ^= var4_4 ^ -988120010;
                                            ** continue;
                                        }
                                        case -404831383: {
                                            if (var1_1.method_5799()) ** GOTO lbl1
                                            break block40;
                                        }
                                        case 1482028575: {
                                            if (var1_1.method_6128()) ** GOTO lbl1
                                            break block41;
                                        }
                                    }
                                }
                                var5_2 = 1443751346;
                                var2_3 = dh.i & 1443751346 ^ 657418122;
                                var4_4 = 0;
                                var3_5 = (var2_3 | var5_2) ^ 164263771;
                                ** while (true)
                            }
                            return v0;
                        }
                        var4_4 = (var2_3 | var5_2) ^ 1001563226;
                        ** GOTO lbl3
                        {
                            case -713354181: {
                                ** continue;
                            }
                            case -390762422: {
                                var3_5 ^= var4_4 ^ -184612157;
                                ** continue;
                            }
                        }
                    }
                    if (!var1_1.method_5765()) break block42;
                    ** GOTO lbl1
                    {
                        case -1025836537: {
                            v0 = true;
                            ** continue;
                        }
                        case 1649893707: {
                            break block43;
                        }
                    }
lbl90:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 762183525;
                        ** GOTO lbl3
                        break;
                    }
                    {
                        case 605895855: {
                            if (var1_1.method_31549().field_7479) ** continue;
                            ** GOTO lbl44
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ 1551270639;
                    ** GOTO lbl3
                    {
                        case -215179408: {
                            if (!var1_1.method_6101()) ** break;
                            ** continue;
                            break;
                        }
                        case 727278933: {
                            if (var1_1 == var0.field_1724) ** break;
                            ** continue;
                            ** continue;
                        }
                    }
lbl106:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1242227267;
                        ** GOTO lbl3
                        break;
                    }
                    {
                        case 1553312856: {
                            var3_5 ^= var4_4 ^ -1642883357;
                            ** continue;
                        }
                        case 2091754224: {
                            var3_5 ^= var4_4 ^ -1728018032;
                            ** continue;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ 219795004;
                    ** GOTO lbl3
                }
                var4_4 = (var2_3 | var5_2) ^ 2108199485;
                ** GOTO lbl3
            }
            var4_4 = (var2_3 | var5_2) ^ 382708130;
            ** GOTO lbl3
            {
                ** case 912597087:
            }
lbl124:
            // 1 sources

            var3_5 ^= var4_4 ^ 707746518;
            ** while (true)
        }
        var4_4 = (var2_3 | var5_2) ^ 1395841813;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void jY(class_243 var1_1, boolean var2_2) {
        block19: {
            var7_3 = 1335500376;
            var4_4 = dh.i & 1335500376 ^ -999682269;
            var6_5 = 0;
            var5_6 = (var4_4 | var7_3) ^ -557023790;
            var6_5 = (var4_4 | var7_3) ^ -1947394222;
            break block19;
lbl7:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ 699655523;
                break block19;
                break;
            }
lbl10:
            // 1 sources

            block16: while (true) {
                switch (var6_5) {
                    case 1316150127: {
                        var5_6 ^= var6_5 ^ 1223293635;
                        var6_5 = (var4_4 | var7_3) ^ 1881512012;
                        ** break;
                    }
                    case 789093167: {
                        return;
                    }
                    case -1867575547: {
                        var5_6 ^= var6_5 ^ -973954296;
                        ** GOTO lbl40
                    }
                    case -93623268: {
                        this.a.remove(0);
                        ** break;
                    }
                    case 2118392924: {
                        var5_6 ^= var6_5 ^ 332710490;
                        var6_5 = (var4_4 | var7_3) ^ -520977324;
                        ** break;
                    }
                    case -82411207: {
                        this.a.add(new ft(var1_1, this.f, var2_2, var3_7));
                        ** break;
lbl33:
                        // 2 sources

                        var6_5 = (var4_4 | var7_3) ^ -2121743340;
                        continue block16;
                    }
                    case -190938171: {
                        var5_6 ^= var6_5 ^ -234511767;
                        var6_5 = (var4_4 | var7_3) ^ 898724711;
                    }
lbl38:
                    // 4 sources

                    default: {
                        continue block16;
                    }
lbl40:
                    // 1 sources

                    var6_5 = (var4_4 | var7_3) ^ 887922242;
                    continue block16;
                    case -1075869897: 
                }
                if (this.a.size() > dh.kn((var5_6 | var6_5 ^ -263874193) ^ (var6_5 ^ 391238872), (var4_4 | var6_5 ^ -263874193) ^ ((var5_6 | var6_5 ^ -263874193) ^ (var6_5 ^ -1111976475)))) {
                    var6_5 = (var4_4 | var7_3) ^ 996449470;
                    continue;
                }
                var6_5 = (var4_4 | var7_3) ^ -1312947417;
                continue;
                break;
            }
        }
        while (true) {
            switch (var6_5) {
                case -431359464: {
                    var3_7 = (float)((var1_1.field_1352 * 3.7 + var1_1.field_1350 * 5.3 + (double)this.f * 0.61) % 6.283185307179586);
                    ** break;
                }
                case -1620447009: {
                    var5_6 ^= var6_5 ^ 1651651182;
                    ** continue;
                }
lbl57:
                // 1 sources

                var6_5 = (var4_4 | var7_3) ^ 1599410302;
                ** continue;
                case 1142358057: {
                    var6_5 = (var4_4 | var7_3) ^ 1351872420;
                }
            }
        }
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
    private void jZ(class_4588 var1_1, Matrix4f var2_2, ft var3_3, double var4_4) {
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
    private void ka(class_4588 var1_1, Matrix4f var2_2, ft var3_3, double var4_4) {
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
    private static void kb(class_4588 var0, Matrix4f var1_1, class_243 var2_2, double var3_3, double var5_4, int var7_5, int var8_6) {
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
    private static void kc(class_4588 var0, Matrix4f var1_1, class_243 var2_2, double var3_3, double var5_4, double var7_5, double var9_6, int var11_7, int var12_8) {
        block36: {
            block35: {
                var28_9 = 2120841832;
                var25_10 = dh.i & 2120841832 ^ -790590707;
                var27_11 = 0;
                var26_20 = (var25_10 | var28_9) ^ -817868240;
                var27_11 = (var25_10 | var28_9) ^ 1775239830;
                break block35;
lbl7:
                // 2 sources

                while (true) {
                    var27_11 = (var25_10 | var28_9) ^ -418187764;
                    ** GOTO lbl17
                    break;
                }
                while (true) {
                    var27_11 = (var25_10 | var28_9) ^ -240838357;
                    break block35;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var17_14 = -var15_13 * var9_6;
                    var19_15 = var13_12 * var9_6;
                    var27_11 = (var25_10 | var28_9) ^ -949129417;
lbl17:
                    // 2 sources

                    block31: while (true) {
                        switch (var27_11) {
                            default: {
                                continue block31;
                            }
                            case 279163793: {
                                var26_20 ^= var27_11 ^ -1777428781;
                                ** GOTO lbl7
                            }
                            case 435883361: {
                                var27_11 = (var25_10 | var28_9) ^ 1002768273;
                                continue block31;
                            }
                            case 964990042: {
                                ** GOTO lbl37
                            }
                            case 1402615824: {
                                var26_20 ^= var27_11 ^ -1388827290;
                                ** continue;
                            }
                            case -986907396: {
                                var21_16 = new class_243(var2_2.field_1352 + var13_12 * var5_4 - var17_14, var2_2.field_1351, var2_2.field_1350 + var15_13 * var5_4 - var19_15);
                                ** GOTO lbl39
                            }
                            case 414934188: {
                                var26_20 ^= var27_11 ^ 1573638020;
lbl37:
                                // 2 sources

                                var27_11 = (var25_10 | var28_9) ^ 1422725901;
                                continue block31;
                            }
lbl39:
                            // 1 sources

                            var26_20 ^= 1628951012;
                            var22_17 = new class_243(var2_2.field_1352 + var13_12 * var5_4 + var17_14, var2_2.field_1351, var2_2.field_1350 + var15_13 * var5_4 + var19_15);
                            var26_20 ^= -1966494774;
                            var23_18 = new class_243(var2_2.field_1352 + var13_12 * var7_5 + var17_14, var2_2.field_1351, var2_2.field_1350 + var15_13 * var7_5 + var19_15);
                            var26_20 ^= 710191124;
                            var24_19 = new class_243(var2_2.field_1352 + var13_12 * var7_5 - var17_14, var2_2.field_1351, var2_2.field_1350 + var15_13 * var7_5 - var19_15);
                            var27_11 = (var25_10 | var28_9) ^ 1971092740;
                            break block36;
                            case -1440421792: 
                        }
                        switch (var26_20) {
                            default: {
                                var27_11 = (var25_10 | var28_9) ^ -297121540;
                                continue block31;
                            }
                            case -1234644324: {
                                var27_11 = (var25_10 | var28_9) ^ -1384922243;
                                continue block31;
                            }
                            case -1855963628: 
                        }
                        var27_11 = (var25_10 | var28_9) ^ -430792767;
                    }
                    break;
                }
            }
            block32: while (true) {
                switch (var27_11) {
                    default: {
                        continue block32;
                    }
                    case -1757808133: {
                        ** break;
                    }
                    case 1728807084: {
                        var26_20 ^= var27_11 ^ 1500312283;
                        var27_11 = (var25_10 | var28_9) ^ -1367440033;
                        continue block32;
                    }
                    case 256696902: {
                        var26_20 ^= var27_11 ^ 1200990563;
                        ** GOTO lbl83
                    }
lbl72:
                    // 1 sources

                    var27_11 = (var25_10 | var28_9) ^ -1713210431;
                    continue block32;
                    case 1352105522: {
                        if (var12_8 > 0) ** continue;
                        var27_11 = (var25_10 | var28_9) ^ -818402583;
                        continue block32;
                    }
                    case -1462886866: {
                        var13_12 = Math.cos(var3_3);
                        var15_13 = Math.sin(var3_3);
                        var26_20 ^= -243318125;
                        ** continue;
                    }
lbl83:
                    // 1 sources

                    var27_11 = (var25_10 | var28_9) ^ 1445455171;
                    continue block32;
                    case 835834244: {
                        var26_20 ^= var27_11 ^ -1589070577;
                        var27_11 = (var25_10 | var28_9) ^ 1489288433;
                        continue block32;
                    }
lbl89:
                    // 1 sources

                    while (true) {
                        var27_11 = (var25_10 | var28_9) ^ 714452632;
                        break block36;
                        break;
                    }
                    case -1506981988: 
                }
                break;
            }
            return;
        }
        block34: while (true) {
            switch (var27_11) {
                default: {
                    continue block34;
                }
                case -1953134999: {
                    var26_20 ^= var27_11 ^ 199500616;
                    var27_11 = (var25_10 | var28_9) ^ 434325171;
                    continue block34;
                }
                case -730049035: {
                    var26_20 ^= var27_11 ^ -946296317;
                    var27_11 = (var25_10 | var28_9) ^ 366873561;
                    continue block34;
                }
                case -348655436: {
                    return;
                }
                case -418726434: 
            }
            break;
        }
        dh.kf(var0, var1_1, var21_16, var22_17, var23_18, var24_19, var11_7, var12_8, var11_7, var12_8);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void kd(class_4588 var0, Matrix4f var1_1, class_243 var2_2, double var3_3, int var5_4, int var6_5) {
        var15_6 = 2100876621;
        var12_7 = dh.i & 2100876621 ^ -509402796;
        var14_8 = 0;
        var13_9 = (var12_7 | var15_6) ^ -214301736;
        var14_8 = (var12_7 | var15_6) ^ -711566585;
        if (true) ** GOTO lbl71
        block23: while (true) {
            var14_8 = (var12_7 | var15_6) ^ 917887116;
            ** GOTO lbl71
            {
                switch (var14_8) {
                    case 1043356699: {
                        var13_9 ^= var14_8 ^ 425121112;
                        var14_8 = (var12_7 | var15_6) ^ -1634450641;
                        ** break;
                    }
                    case -1007464096: {
                        if (var7_10 >= dh.kn((var13_9 | var14_8 ^ -1093958611) ^ (var14_8 ^ 1778371247), (var12_7 | var14_8 ^ -1093958611) ^ ((var13_9 | var14_8 ^ -1093958611) ^ (var14_8 ^ 74067900)))) {
                            var14_8 = (var12_7 | var15_6) ^ -1014257338;
                            continue block24;
                        }
                        ** GOTO lbl33
                    }
                    case -1009574502: {
                        var13_9 ^= var14_8 ^ 796635313;
                        var14_8 = (var12_7 | var15_6) ^ 1044948029;
                        ** break;
                    }
                    case -423846380: {
                        var8_11 = 6.283185307179586 * (double)var7_10 / 36.0;
                        ** GOTO lbl35
                    }
                    case 1904936023: {
                        var13_9 ^= var14_8 ^ -1341069687;
                        var14_8 = (var12_7 | var15_6) ^ 453471049;
                    }
lbl30:
                    // 5 sources

                    while (true) {
                        default: {
                            continue block24;
                        }
                        break;
                    }
lbl33:
                    // 1 sources

                    var14_8 = (var12_7 | var15_6) ^ -1942949622;
                    continue block24;
lbl35:
                    // 1 sources

                    var13_9 ^= -1751827502;
                    var10_12 = 6.283185307179586 * (double)(var7_10 + 1) / 36.0;
                    var14_8 = (var12_7 | var15_6) ^ -329541470;
                    if (true) ** GOTO lbl44
lbl39:
                    // 2 sources

                    while (true) {
                        var14_8 = (var12_7 | var15_6) ^ 1047062727;
                        ** continue;
                        break;
                    }
                    block27: while (true) {
                        var14_8 = (var12_7 | var15_6) ^ 285570015;
lbl44:
                        // 2 sources

                        block28: while (true) {
                            switch (var14_8) {
                                case 299920895: {
                                    var13_9 ^= var14_8 ^ -1989949566;
                                    var14_8 = (var12_7 | var15_6) ^ 1843122371;
                                }
                                default: {
                                    continue block28;
                                }
                                case -323058046: {
                                    ++var7_10;
                                    ** GOTO lbl39
                                }
                                case -1872747106: {
                                    var13_9 ^= 361079093;
                                    var13_9 ^= -1200676739;
                                    break;
                                }
                                case -1817469829: {
                                    var13_9 ^= var14_8 ^ 476365673;
                                    continue block27;
                                }
                            }
                            dh.kf(var0, var1_1, var2_2, var2_2, dh.ke(var2_2, var10_12, var3_3), dh.ke(var2_2, var8_11, var3_3), var5_4, var6_5, var5_4, 0);
                            var14_8 = (var12_7 | var15_6) ^ 1846569254;
                        }
                        break;
                    }
                    case 1664071282: 
                }
            }
            return;
            while (true) {
                var14_8 = (var12_7 | var15_6) ^ -2100900104;
                if (true) ** GOTO lbl71
                break;
            }
            block30: while (true) {
                var14_8 = (var12_7 | var15_6) ^ 1047242905;
lbl71:
                // 4 sources

                block31: while (true) {
                    switch (var14_8) {
                        default: {
                            continue block31;
                        }
                        case 2138913701: {
                            var13_9 ^= var14_8 ^ 1781985792;
                            var14_8 = (var12_7 | var15_6) ^ -1875393063;
                            continue block31;
                        }
                        case 1837904004: {
                            var7_10 = 0;
                            ** continue;
                        }
                        case 859432473: {
                            if (var6_5 > 0) ** continue;
                            continue block30;
                        }
                        case -1009754684: {
                            var13_9 ^= var14_8 ^ -1343855697;
                            continue block23;
                        }
                        case -535021381: {
                            var13_9 ^= var14_8 ^ -768620256;
                            var14_8 = (var12_7 | var15_6) ^ -830336188;
                            continue block31;
                        }
                        case 674082394: {
                            var14_8 = (var12_7 | var15_6) ^ 497536486;
                            continue block31;
                        }
                        case -888263215: 
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static class_243 ke(class_243 class_2432, double d2, double d3) {
        int n2 = i & 0xF4AB44CF ^ 0x2156D44F;
        int n3 = 0;
        int n4 = (n2 | 0xF4AB44CF) ^ 0xE01456E5;
        n3 = (n2 | 0xF4AB44CF) ^ 0xE0F8B4C0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 352804879: {
                    n3 = (n2 | 0xF4AB44CF) ^ 0xA2C17478;
                    continue block5;
                }
                case 1463722167: {
                    n4 ^= n3 ^ 0x88EE0D5D;
                    n3 = (n2 | 0xF4AB44CF) ^ 0x468C6538;
                    continue block5;
                }
                case -1284263433: 
            }
            break;
        }
        return new class_243(class_2432.field_1352 + Math.cos(d2) * d3, class_2432.field_1351, class_2432.field_1350 + Math.sin(d2) * d3);
    }

    /*
     * Exception decompiling
     */
    private static void kf(class_4588 var0, Matrix4f var1_1, class_243 var2_2, class_243 var3_3, class_243 var4_4, class_243 var5_5, int var6_6, int var7_7, int var8_8, int var9_9) {
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
    private static void vertex(class_4588 var0, Matrix4f var1_1, class_243 var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        block13: {
            break block13;
lbl1:
            // 1 sources

            while (true) {
                var8_10 ^= var9_9 ^ 1562581694;
                ** GOTO lbl28
                break;
            }
        }
        var10_7 = -901916041;
        var7_8 = dh.i & -901916041 ^ 140392979;
        var9_9 = 0;
        var8_10 = (var7_8 | var10_7) ^ 1100856765;
        ** GOTO lbl26
lbl10:
        // 1 sources

        return;
lbl12:
        // 1 sources

        block9: while (true) {
            switch (var9_9) lbl-1000:
            // 5 sources

            {
                while (true) {
                    default: {
                        continue block9;
                    }
                    break;
                }
                case 665568382: {
                    ** continue;
                }
                case -903715313: {
                    ** continue;
                }
lbl21:
                // 1 sources

                while (true) {
                    var9_9 = (var7_8 | var10_7) ^ -227050546;
                    ** GOTO lbl-1000
                    break;
                }
                case -1526671130: {
                    break block9;
                }
lbl26:
                // 1 sources

                var9_9 = (var7_8 | var10_7) ^ 1870602897;
                ** GOTO lbl-1000
lbl28:
                // 1 sources

                var9_9 = (var7_8 | var10_7) ^ 6134904;
                ** GOTO lbl-1000
lbl30:
                // 1 sources

                while (true) {
                    var9_9 = (var7_8 | var10_7) ^ -304857591;
                    ** continue;
                    break;
                }
                case 940081593: {
                    var0.method_22918((Matrix4fc)var1_1, (float)var2_2.field_1352, (float)var2_2.field_1351, (float)var2_2.field_1350).method_1336(var3_3, var4_4, var5_5, var6_6);
                    ** continue;
                }
                case 1689362675: {
                    var8_10 ^= var9_9 ^ -2059856374;
                    ** continue;
                }
            }
            break;
        }
        var9_9 = (var7_8 | var10_7) ^ -1362208124;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean shouldRenderNvg(class_310 var1_1) {
        block42: {
            block45: {
                block48: {
                    block49: {
                        block46: {
                            block43: {
                                block47: {
                                    block44: {
                                        var5_2 = -1193955047;
                                        var2_3 = dh.i & -1193955047 ^ -123459882;
                                        var4_4 = 0;
                                        if (true) ** GOTO lbl57
                                        block25: while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ 1708978568;
lbl7:
                                            // 18 sources

                                            block26: while (true) {
                                                block0 : switch (var4_4) lbl-1000:
                                                // 6 sources

                                                {
                                                    while (true) {
                                                        default: {
                                                            continue block26;
                                                        }
                                                        break;
                                                    }
                                                    case -979025551: {
                                                        break block42;
                                                    }
lbl14:
                                                    // 2 sources

                                                    while (true) {
                                                        var3_5 ^= -1814330596;
                                                        break block0;
                                                        break;
                                                    }
lbl17:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_4 = (var2_3 | var5_2) ^ -788700907;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl20:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_4 = (var2_3 | var5_2) ^ -1415724505;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
                                                    case 469305885: {
                                                        break;
                                                    }
lbl25:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_4 = (var2_3 | var5_2) ^ 1553446824;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
                                                    case -1167586275: {
                                                        var3_5 ^= var4_4 ^ 749530294;
                                                        break block43;
                                                    }
lbl31:
                                                    // 1 sources

                                                    while (true) {
                                                        if (((Boolean)this.c.getValue()).booleanValue()) continue block25;
                                                        break block0;
                                                        break;
                                                    }
                                                    case 79632721: {
                                                        var3_5 ^= var4_4 ^ -714824782;
                                                        ** continue;
                                                    }
lbl37:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_4 = (var2_3 | var5_2) ^ -1524098735;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
                                                    case 763447082: {
                                                        var3_5 ^= var4_4 ^ -61145655;
                                                        break block44;
                                                    }
lbl43:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_4 = (var2_3 | var5_2) ^ 2017246660;
                                                        ** continue;
                                                        break;
                                                    }
                                                    case 671667914: {
                                                        if (!(var1_1.field_1755 instanceof class_408)) break;
                                                        break block25;
                                                    }
                                                    case 2043771819: {
                                                        v0 = true;
                                                        ** GOTO lbl14
                                                    }
                                                    case 89834621: {
                                                        if (!((Boolean)this.d.getValue()).booleanValue()) break;
                                                        continue block25;
                                                    }
                                                    case -1537081225: {
                                                        break block45;
                                                    }
lbl57:
                                                    // 1 sources

                                                    var3_5 = (var2_3 | var5_2) ^ -2053304598;
                                                    break;
                                                    case -2134308325: {
                                                        if (this.a.isEmpty()) break;
                                                        break block46;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ -713756427;
                                            ** GOTO lbl7
                                            break;
                                        }
                                        {
                                            case 2023045502: {
                                                break block47;
                                            }
                                            case -208839007: {
                                                if (var1_1.field_1755 == null) ** continue;
                                                ** continue;
                                            }
                                        }
                                        var4_4 = (var2_3 | var5_2) ^ 1117633474;
                                        ** GOTO lbl7
                                        {
                                            case 1652374241: {
                                                if (!this.isEnabled()) break;
                                                ** continue;
                                            }
                                        }
                                        return v0;
                                    }
                                    var4_4 = (var2_3 | var5_2) ^ -2128294796;
                                    ** GOTO lbl7
                                }
                                var4_4 = (var2_3 | var5_2) ^ -2081484274;
                                ** GOTO lbl7
lbl82:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ -1054535703;
                                    ** GOTO lbl7
                                    break;
                                }
                            }
                            var4_4 = (var2_3 | var5_2) ^ -1702326978;
                            ** GOTO lbl7
                        }
                        var4_4 = (var2_3 | var5_2) ^ 769881084;
                        ** GOTO lbl7
                        {
                            case 2065343953: {
                                if (var1_1.field_1687 == null) break;
                                break block48;
                            }
                        }
lbl94:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1674287832;
                            ** GOTO lbl7
                            break;
                        }
lbl97:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -744233861;
                            ** GOTO lbl7
                            break;
                        }
                        {
                            case -1658239401: {
                                ** continue;
                            }
                        }
                        var4_4 = (var2_3 | var5_2) ^ 873761188;
                        ** GOTO lbl7
                        {
                            case 1399354872: {
                                v0 = false;
                                ** continue;
                            }
                            case 1574809230: {
                                ** continue;
                            }
                            case 1690424055: {
                                ** continue;
                            }
                        }
lbl111:
                        // 7 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -62214514;
                            ** GOTO lbl7
                            break;
                        }
                        {
                            case -857653637: {
                                break block49;
                            }
                        }
lbl116:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -2141155679;
                            ** GOTO lbl7
                            break;
                        }
lbl119:
                        // 1 sources

                        while (true) {
                            var3_5 ^= -1489856977;
                            ** continue;
                            break;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ -38833246;
                    ** GOTO lbl7
                }
                var4_4 = (var2_3 | var5_2) ^ 1028716206;
                ** GOTO lbl7
                {
                    case -719928285: {
                        var3_5 ^= var4_4 ^ 1914982924;
                        ** continue;
                    }
                    case -1883447993: {
                        if (!hJ.ok()) break;
                        ** continue;
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ -485704254;
                ** GOTO lbl7
                {
                    case 969979958: {
                        ** continue;
                    }
                    ** case 727077796:
                }
lbl139:
                // 1 sources

                if (var1_1.field_1724 != null) ** break;
                ** while (true)
                ** while (true)
            }
            var4_4 = (var2_3 | var5_2) ^ 2001300120;
            ** GOTO lbl7
        }
        var4_4 = (var2_3 | var5_2) ^ 192473470;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void renderNvg(W var1_1, class_310 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [137[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private void kg(W var1_1, class_310 var2_2, class_243 var3_3, String var4_4, double var5_5, double var7_6, double var9_7, int var11_8, int var12_9) {
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
    private void kh(W var1_1, class_310 var2_2, class_243 var3_3, String var4_4, double var5_5, double var7_6, int var9_7, int var10_8) {
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
    private void ki(W var1_1, class_310 var2_2, class_243 var3_3, String var4_4, String var5_5, double var6_6, double var8_7, double var10_8, int var12_9, int var13_10) {
        block50: {
            block55: {
                block52: {
                    block47: {
                        block48: {
                            block51: {
                                block46: {
                                    block49: {
                                        block53: {
                                            break block53;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                var19_16 ^= var20_13 ^ 357963229;
                                                break block46;
                                                break;
                                            }
lbl4:
                                            // 1 sources

                                            while (true) {
                                                var19_16 ^= var20_13 ^ 401296429;
                                                break block47;
                                                break;
                                            }
lbl7:
                                            // 1 sources

                                            return;
lbl9:
                                            // 1 sources

                                            while (true) {
                                                var19_16 ^= var20_13 ^ -261818895;
                                                ** GOTO lbl112
                                                break;
                                            }
lbl12:
                                            // 1 sources

                                            while (true) {
                                                NanoVG.nvgText((long)var1_1.a, (float)0.0f, (float)0.0f, (CharSequence)var4_4);
                                                ** GOTO lbl89
                                                break;
                                            }
lbl16:
                                            // 1 sources

                                            while (true) {
                                                var19_16 ^= var20_13 ^ -1246195165;
                                                break block48;
                                                break;
                                            }
lbl19:
                                            // 1 sources

                                            while (true) {
                                                continue;
lbl21:
                                                // 1 sources

                                                while (true) {
                                                    var20_13 = (var18_12 | var21_11) ^ -1272210227;
                                                    ** GOTO lbl56
lbl24:
                                                    // 1 sources

                                                    while (true) {
                                                        var20_13 = (var18_12 | var21_11) ^ 1187725044;
                                                        ** GOTO lbl56
lbl27:
                                                        // 1 sources

                                                        while (true) {
                                                            var20_13 = (var18_12 | var21_11) ^ 1467148991;
                                                            ** GOTO lbl56
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        var21_11 = 1420920257;
                                        var18_12 = dh.i & 1420920257 ^ 20506175;
                                        var20_13 = 0;
                                        var19_16 = (var18_12 | var21_11) ^ -1268018760;
                                        ** GOTO lbl94
lbl36:
                                        // 1 sources

                                        while (true) {
                                            var19_16 ^= var20_13 ^ 309725587;
                                            break block49;
                                            break;
                                        }
                                        var14_14 = Math.cos(var8_7);
                                        var16_15 = Math.sin(var8_7);
                                        var20_13 = (var18_12 | var21_11) ^ -1990442688;
                                        if (true) ** GOTO lbl56
                                        block36: while (true) {
                                            block54: {
                                                var20_13 = (var18_12 | var21_11) ^ 1799271523;
                                                break block54;
lbl46:
                                                // 1 sources

                                                while (true) {
                                                    NanoVG.nvgText((long)var1_1.a, (float)0.0f, (float)3.5f, (CharSequence)var4_4);
                                                    ** GOTO lbl82
                                                    break;
                                                }
lbl50:
                                                // 1 sources

                                                while (true) {
                                                    NanoVG.nvgFontFace((long)var1_1.a, (CharSequence)var5_5);
                                                    ** GOTO lbl96
                                                    break;
                                                }
lbl53:
                                                // 1 sources

                                                while (true) {
                                                    var19_16 ^= var20_13 ^ -241750245;
                                                    ** continue;
                                                    break;
                                                }
                                            }
lbl57:
                                            // 9 sources

                                            block40: while (true) {
                                                switch (var20_13) lbl-1000:
                                                // 6 sources

                                                {
                                                    while (true) {
                                                        default: {
                                                            continue block40;
                                                        }
                                                        break;
                                                    }
                                                    case 2004133208: {
                                                        ** continue;
                                                    }
                                                    case -942562989: {
                                                        ** continue;
                                                    }
                                                    case 326293771: {
                                                        ** continue;
                                                    }
                                                    case -510493902: {
                                                        ** continue;
                                                    }
                                                    case -1801678866: {
                                                        ** continue;
                                                    }
                                                    case 1591429351: {
                                                        ** continue;
                                                    }
                                                    case -588929345: {
                                                        ** continue;
                                                    }
                                                    case 2029475178: {
                                                        ** continue;
                                                    }
                                                    case -995504861: {
                                                        ** continue;
                                                    }
                                                    case 1550612133: {
                                                        ** continue;
                                                    }
lbl82:
                                                    // 1 sources

                                                    var20_13 = (var18_12 | var21_11) ^ 191016728;
                                                    ** GOTO lbl-1000
                                                    case 46861632: {
                                                        return;
                                                    }
                                                    case -419703798: {
                                                        var19_16 ^= var20_13 ^ 1321728232;
                                                        ** continue;
                                                    }
lbl89:
                                                    // 1 sources

                                                    var20_13 = (var18_12 | var21_11) ^ 164991322;
                                                    ** GOTO lbl-1000
                                                    case 606340542: {
                                                        if (this.kk(var1_1, var2_2, var3_3.field_1352 + var14_14 * var10_8, var3_3.field_1351, var3_3.field_1350 + var16_15 * var10_8, -var16_15, var14_14, var14_14, var16_15, var6_6)) break block50;
                                                        break block51;
                                                    }
lbl94:
                                                    // 1 sources

                                                    var20_13 = (var18_12 | var21_11) ^ 735032344;
                                                    break;
lbl96:
                                                    // 1 sources

                                                    var20_13 = (var18_12 | var21_11) ^ -954603959;
                                                    ** GOTO lbl-1000
lbl98:
                                                    // 1 sources

                                                    while (true) {
                                                        var19_16 ^= var20_13 ^ -1003613343;
                                                        ** GOTO lbl110
                                                        break;
                                                    }
                                                    case 1049056156: {
                                                        var19_16 ^= var20_13 ^ 1461483705;
                                                        break block36;
                                                    }
                                                    case 461720338: {
                                                        NanoVG.nvgTextAlign((long)var1_1.a, (int)dh.kn((var19_16 | var20_13 ^ 1328860883) ^ (var20_13 ^ 302744282), (var18_12 | var20_13 ^ 1328860883) ^ ((var19_16 | var20_13 ^ 1328860883) ^ (var20_13 ^ 882927056))));
                                                        continue block36;
                                                    }
lbl107:
                                                    // 1 sources

                                                    while (true) {
                                                        var20_13 = (var18_12 | var21_11) ^ -1838659924;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl110:
                                                    // 1 sources

                                                    var20_13 = (var18_12 | var21_11) ^ 1387621352;
                                                    break;
lbl112:
                                                    // 1 sources

                                                    var20_13 = (var18_12 | var21_11) ^ -1054513135;
                                                    ** continue;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        var20_13 = (var18_12 | var21_11) ^ 1495864616;
                                        ** GOTO lbl57
                                    }
                                    var20_13 = (var18_12 | var21_11) ^ 1906172481;
                                    ** GOTO lbl57
                                    {
                                        case 942920919: {
                                            NanoVG.nvgFillColor((long)var1_1.a, (NVGColor)dh.km(var12_9, var13_10));
                                            ** continue;
                                        }
                                    }
lbl122:
                                    // 1 sources

                                    while (true) {
                                        var20_13 = (var18_12 | var21_11) ^ -172637750;
                                        break block52;
                                        break;
                                    }
                                }
                                var20_13 = (var18_12 | var21_11) ^ -1861211428;
                                ** GOTO lbl57
                            }
                            var20_13 = (var18_12 | var21_11) ^ -1287506955;
                            ** GOTO lbl57
                        }
                        var20_13 = (var18_12 | var21_11) ^ 1837773608;
                        ** GOTO lbl57
                    }
                    var20_13 = (var18_12 | var21_11) ^ 760132245;
                    ** GOTO lbl57
                    {
                        case -1835007562: {
                            var19_16 ^= var20_13 ^ -1584759674;
                            break block55;
                        }
                    }
                }
                block45: while (true) {
                    switch (var20_13) {
                        default: {
                            continue block45;
                        }
                        case 118262807: {
                            ** continue;
                        }
                        case -1609816523: {
                            ** continue;
                        }
                        case 2121683943: {
                            ** continue;
                        }
                    }
                    break;
                }
                {
                    ** case 210825943:
                }
lbl152:
                // 1 sources

                NanoVG.nvgFillColor((long)var1_1.a, (NVGColor)dh.km(0, (int)((float)var13_10 * 0.55f)));
                ** while (true)
            }
            var20_13 = (var18_12 | var21_11) ^ 1312599277;
            ** GOTO lbl57
        }
        var20_13 = (var18_12 | var21_11) ^ 583877287;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void kj(W var1_1, class_310 var2_2, class_243 var3_3, double var4_4, double var6_5, double var8_6, int var10_7, int var11_8) {
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
    private boolean kk(W var1_1, class_310 var2_3, double var3_4, double var5_5, double var7_6, double var9_7, double var11_8, double var13_9, double var15_10, double var17_2) {
        var31_11 = 230255957;
        var28_12 = dh.i & 230255957 ^ -1658036127;
        var30_13 = 0;
        var29_16 = (var28_12 | var31_11) ^ 917907285;
        var30_13 = (var28_12 | var31_11) ^ 371181416;
        if (true) ** GOTO lbl238
        block59: while (true) {
            block85: {
                block84: {
                    block86: {
                        var30_13 = (var28_12 | var31_11) ^ -752493290;
                        break block85;
lbl10:
                        // 1 sources

                        while (true) {
                            var30_13 = (var28_12 | var31_11) ^ 2043604863;
                            break block84;
                            while (true) {
                                var30_13 = (var28_12 | var31_11) ^ -1859539724;
                                break block84;
                                break;
                            }
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var30_13 = (var28_12 | var31_11) ^ -567896285;
                            break block85;
lbl19:
                            // 1 sources

                            while (true) {
                                var30_13 = (var28_12 | var31_11) ^ 1983967656;
                                break block86;
                                break;
                            }
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            var30_13 = (var28_12 | var31_11) ^ -742716921;
                            break block85;
                            while (true) {
                                var30_13 = (var28_12 | var31_11) ^ 2038202690;
                                break block85;
                                break;
                            }
                            break;
                        }
                        while (true) {
                            var30_13 = (var28_12 | var31_11) ^ -125847572;
                            break block85;
lbl31:
                            // 1 sources

                            while (true) {
                                var20_15 = var1_1.e * 0.35f;
                                var30_13 = (var28_12 | var31_11) ^ 802341212;
                                break block86;
lbl35:
                                // 1 sources

                                while (true) {
                                    var29_16 ^= -996713519;
                                    var27_23 = (float)Math.sqrt(var24_20 * var24_20 + var25_21 * var25_21) * 100.0f;
                                    var30_13 = (var28_12 | var31_11) ^ -2022553402;
                                    break block84;
                                    break;
                                }
lbl40:
                                // 4 sources

                                while (true) {
                                    var30_13 = (var28_12 | var31_11) ^ -712622501;
                                    break block86;
                                    break;
                                }
                                break;
                            }
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var30_13 = (var28_12 | var31_11) ^ 1385161514;
                            break block85;
                            break;
                        }
                        while (true) {
                            var30_13 = (var28_12 | var31_11) ^ 1142186603;
                            break block86;
                            break;
                        }
lbl49:
                        // 1 sources

                        while (true) {
                            var30_13 = (var28_12 | var31_11) ^ -1187227773;
                            break block84;
                            break;
                        }
                        while (true) {
                            var30_13 = (var28_12 | var31_11) ^ 2059332181;
                            break block85;
                            break;
                        }
                    }
                    block74: while (true) {
                        switch (var30_13) {
                            case -644673904: {
                                var21_17 = (float)(var17_2 / 100.0 / 0.08);
                                var29_16 ^= 752186002;
                                ** GOTO lbl92
                            }
                            case -530148293: {
                                ** break;
                            }
                            case -643231970: {
                                var29_16 ^= var30_13 ^ 256855514;
                                var30_13 = (var28_12 | var31_11) ^ 1143890917;
                                continue block74;
                            }
                            case 1940627336: {
                                if (dh.d[1] < -var20_15) ** GOTO lbl40
                                ** break;
                            }
                            case -1301304279: {
                                var29_16 ^= var30_13 ^ -1979404927;
                                var30_13 = (var28_12 | var31_11) ^ -350936152;
                                continue block74;
                            }
                            case 1211847470: {
                                var29_16 ^= var30_13 ^ -1649871926;
                                var30_13 = (var28_12 | var31_11) ^ 487558813;
                                continue block74;
                            }
                            case 1628259312: {
                                if (dh.d[0] > var1_1.f + var19_14) ** GOTO lbl40
                                ** continue;
                            }
                            case -1716586363: {
                                if (!(dh.d[1] > var1_1.e + var20_15)) ** continue;
                                ** GOTO lbl40
                            }
                            case -335700771: {
                                var30_13 = (var28_12 | var31_11) ^ -300485891;
                                continue block74;
                            }
lbl88:
                            // 1 sources

                            var30_13 = (var28_12 | var31_11) ^ -178297200;
                            ** GOTO lbl109
lbl90:
                            // 1 sources

                            var30_13 = (var28_12 | var31_11) ^ -55562619;
                            continue block74;
lbl92:
                            // 1 sources

                            var22_18 = (dh.b[0] - dh.d[0]) * var21_17;
                            var29_16 ^= 1921821658;
                            var23_19 = (dh.b[1] - dh.d[1]) * var21_17;
                            var29_16 ^= -1472274405;
                            var24_20 = -(dh.c[0] - dh.d[0]) * var21_17;
                            var29_16 ^= 1197996739;
                            var25_21 = -(dh.c[1] - dh.d[1]) * var21_17;
                            var29_16 ^= -313248135;
                            var26_22 = (float)Math.sqrt(var22_18 * var22_18 + var23_19 * var23_19) * 100.0f;
                            ** continue;
                            case 1759644645: {
                                var30_13 = (var28_12 | var31_11) ^ 68392432;
                                ** GOTO lbl109
                            }
                            case 1990741725: {
                                if (!(dh.d[0] < -var19_14)) ** break;
                                ** continue;
                                var30_13 = (var28_12 | var31_11) ^ 2111568206;
                            }
lbl109:
                            // 4 sources

                            default: {
                                continue block74;
                            }
                            case -2135759896: 
                        }
                        break;
                    }
                    return false;
lbl113:
                    // 3 sources

                    while (true) {
                        var30_13 = (var28_12 | var31_11) ^ -1405848977;
                        break block84;
                        break;
                    }
                    while (true) {
                        var30_13 = (var28_12 | var31_11) ^ -526754754;
                        break block84;
                        break;
                    }
lbl119:
                    // 1 sources

                    while (true) {
                        var30_13 = (var28_12 | var31_11) ^ 16674832;
                        break block85;
                        break;
                    }
lbl122:
                    // 1 sources

                    while (true) {
                        var30_13 = (var28_12 | var31_11) ^ -564113445;
                        break block84;
                        break;
                    }
lbl125:
                    // 1 sources

                    while (true) {
                        var29_16 ^= -171367554;
                        ** continue;
                        break;
                    }
                }
                block80: while (true) {
                    block88: {
                        block89: {
                            block90: {
                                block87: {
                                    switch (var30_13) {
                                        case 1879166876: {
                                            ** break;
                                        }
                                        case 2099720523: {
                                            var29_16 ^= var30_13 ^ 688697713;
                                            var30_13 = (var28_12 | var31_11) ^ 383480067;
                                            continue block80;
                                        }
                                        case -677117105: {
                                            if (!Float.isNaN(var26_22)) {
                                                var30_13 = (var28_12 | var31_11) ^ -1517280567;
                                                continue block80;
                                            }
                                            break block87;
                                        }
                                        case -1161935284: {
                                            var29_16 ^= var30_13 ^ 1809425601;
                                            ** continue;
                                        }
                                        case 920009232: {
                                            var29_16 ^= var30_13 ^ 1929471800;
                                            var30_13 = (var28_12 | var31_11) ^ -1572750344;
                                            continue block80;
                                        }
                                        case 211075457: {
                                            var29_16 ^= var30_13 ^ 495293947;
                                            var30_13 = (var28_12 | var31_11) ^ 488156562;
                                            continue block80;
                                        }
                                        case 612449014: {
                                            NanoVG.nvgTransform((long)var1_1.a, (float)var22_18, (float)var23_19, (float)var24_20, (float)var25_21, (float)dh.d[0], (float)dh.d[1]);
                                            ** GOTO lbl200
                                        }
                                        case 877647853: {
                                            if (!Float.isNaN(var27_23)) ** GOTO lbl202
                                            break block87;
                                        }
                                        case 1536383078: {
                                            var29_16 ^= var30_13 ^ 837927959;
                                            ** GOTO lbl195
                                        }
                                        case -945506629: {
                                            if (var26_22 > 1600.0f) ** GOTO lbl113
                                            var30_13 = (var28_12 | var31_11) ^ -306404631;
                                            continue block80;
                                        }
                                        case -815726377: {
                                            if (!(var27_23 > 1600.0f)) ** continue;
                                            ** GOTO lbl113
                                        }
                                        case 449783219: {
                                            var29_16 ^= var30_13 ^ 1570570253;
                                            var30_13 = (var28_12 | var31_11) ^ 1243180602;
                                            continue block80;
                                        }
                                        case 1138565806: {
                                            return true;
                                        }
                                        case 1073534605: {
                                            return false;
                                        }
                                        case 2037199990: {
                                            if (!(var26_22 < 5.0f)) ** break;
                                            ** continue;
                                            ** break;
                                        }
                                        case 1348910292: {
                                            return false;
                                        }
                                        case -1428277801: {
                                            return false;
                                        }
                                        case -1956242314: {
                                            NanoVG.nvgResetTransform((long)var1_1.a);
                                            ** continue;
                                        }
lbl188:
                                        // 1 sources

                                        var30_13 = (var28_12 | var31_11) ^ 949722751;
                                        ** GOTO lbl212
                                        case 942493628: {
                                            ** GOTO lbl220
                                        }
                                        case 1804688774: {
                                            var29_16 ^= var30_13 ^ 1784383897;
                                            break block88;
                                        }
lbl195:
                                        // 1 sources

                                        var30_13 = (var28_12 | var31_11) ^ -456107773;
                                        ** GOTO lbl212
                                        case -2136620825: {
                                            if (!(var27_23 < 1.0f)) ** continue;
                                            break block89;
                                        }
lbl200:
                                        // 1 sources

                                        var30_13 = (var28_12 | var31_11) ^ -1485989156;
                                        ** GOTO lbl212
lbl202:
                                        // 1 sources

                                        var30_13 = (var28_12 | var31_11) ^ -970050285;
                                        ** GOTO lbl212
                                        case -462192118: {
                                            var29_16 ^= var30_13 ^ -1241728361;
                                            ** continue;
                                        }
lbl207:
                                        // 1 sources

                                        var30_13 = (var28_12 | var31_11) ^ 1390177698;
                                        continue block80;
                                        case 831069978: {
                                            var29_16 ^= var30_13 ^ -1458316362;
                                            var30_13 = (var28_12 | var31_11) ^ 929257634;
                                        }
lbl212:
                                        // 7 sources

                                        default: {
                                            continue block80;
                                        }
                                        case -1524174070: {
                                            break block90;
                                        }
                                        case -283479626: {
                                            NanoVG.nvgFontSize((long)var1_1.a, (float)100.0f);
                                            var30_13 = (var28_12 | var31_11) ^ 654519097;
                                            ** GOTO lbl212
                                        }
lbl220:
                                        // 1 sources

                                        var30_13 = (var28_12 | var31_11) ^ -1443710312;
                                        continue block80;
                                        case 986773417: 
                                    }
                                    var29_16 ^= var30_13 ^ 1591728346;
                                    var30_13 = (var28_12 | var31_11) ^ 1923554499;
                                    continue;
                                }
                                var30_13 = (var28_12 | var31_11) ^ -1419028635;
                                continue;
                            }
                            var30_13 = (var28_12 | var31_11) ^ 1511644110;
                            continue;
                        }
                        var30_13 = (var28_12 | var31_11) ^ -164876045;
                        continue;
                    }
                    var30_13 = (var28_12 | var31_11) ^ -841231967;
                }
            }
            block82: while (true) {
                block91: {
                    switch (var30_13) {
                        default: {
                            continue block82;
                        }
                        case -1952273891: {
                            var30_13 = (var28_12 | var31_11) ^ 959069157;
                            continue block82;
                        }
                        case 342370370: {
                            if (dh.kl(var2_3, var1_1, var3_4, var5_5, var7_6, dh.d)) ** continue;
                            ** continue;
                        }
                        case -419199200: {
                            var29_16 ^= var30_13 ^ 26377655;
                            var30_13 = (var28_12 | var31_11) ^ 424204196;
                            continue block82;
                        }
                        case 1134295638: {
                            var19_14 = var1_1.f * 0.35f;
                            ** continue;
                        }
                        case -457053129: {
                            var29_16 ^= var30_13 ^ -33554965;
                            var30_13 = (var28_12 | var31_11) ^ 408817691;
                            continue block82;
                        }
                        case -2048688786: {
                            if (dh.kl(var2_3, var1_1, var3_4 + var9_7 * 0.08, var5_5, var7_6 + var11_8 * 0.08, dh.b)) ** continue;
                            break;
                        }
                        case 578194278: {
                            return false;
                        }
                        case 1707268761: {
                            var29_16 ^= var30_13 ^ -2131614272;
                            ** continue;
                        }
                        case -1656545947: {
                            var29_16 ^= var30_13 ^ -94718865;
                            ** continue;
                        }
                        case -1533585776: {
                            var29_16 ^= var30_13 ^ -1073099746;
                            break block91;
                        }
                        case 1309042546: {
                            return false;
                        }
                        case -2064270639: {
                            if (dh.kl(var2_3, var1_1, var3_4 + var13_9 * 0.08, var5_5, var7_6 + var15_10 * 0.08, dh.c)) ** continue;
                            ** continue;
                        }
                        case -818770337: {
                            var29_16 ^= var30_13 ^ -1701888371;
                            continue block59;
                        }
                        case 1318629475: {
                            return false;
                        }
                        case -2010034710: {
                            var29_16 ^= var30_13 ^ -1452357482;
                            var30_13 = (var28_12 | var31_11) ^ -1077156333;
                            continue block82;
                        }
                    }
                    var30_13 = (var28_12 | var31_11) ^ 361504927;
                    continue;
                }
                var30_13 = (var28_12 | var31_11) ^ -1982511817;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static boolean kl(class_310 var0, W var1_2, double var2_3, double var4_4, double var6_5, float[] var8_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH]], but top level block is 4[SWITCH]
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
    private static NVGColor km(int var0, int var1_1) {
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

    private static int kn(int n2, int n3) {
        int n4 = -1661360356;
        int n5 = -1973835225;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xC98CC328)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0x9EF9207F;
        n6 -= (n5 | n4) ^ 0x9EF9B7C9;
        n6 -= (n5 | n4) ^ 0x9EF91461;
        n6 += (n5 | n4) ^ 0x9EF96E27;
        n6 += (n5 | n4) ^ 0x9EF9093F;
        n6 ^= (n5 | n4) ^ 0x9EF9A7F8;
        n6 += (n5 | n4) ^ 0x9EF9198E;
        n6 -= (n5 | n4) ^ 0x9EF93753;
        return n6 ^= (n5 | n4) ^ 0x9EF9741A;
    }

    /*
     * Exception decompiling
     */
    private int ko(int var1_1) {
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
    private static int kp(int var0, int var1_1, float var2_2) {
        block11: {
            block12: {
                var10_3 = -1809866701;
                var9_4 = -31092921;
                var6_5 = dh.i & -31092921 ^ -2006291670;
                var8_6 = 0;
                var7_7 = (var6_5 | var9_4) ^ -992299638;
                if (true) ** GOTO lbl23
                block5: while (true) {
                    var8_6 = (var6_5 | var9_4) ^ -1806319589;
lbl9:
                    // 2 sources

                    block6: while (true) {
                        switch (var8_6) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block6;
                                }
                                break;
                            }
                            case 322874552: {
                                break block5;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var5_10 = class_3532.method_48781((float)var2_2, (int)(var0 & dh.kn(((var7_7 ^= -31053966) | var9_4) ^ -1463249969, (var6_5 | var9_4) ^ ((var7_7 | var9_4) ^ -393135261))), (int)(var1_1 & dh.kn((var7_7 | var9_4) ^ -1463249984, (var6_5 | var9_4) ^ ((var7_7 | var9_4) ^ 1933250111))));
                                break block11;
                                break;
                            }
lbl19:
                            // 1 sources

                            return var3_8 << dh.kn(((var7_7 ^= 629485636) | var9_4) ^ -1454857279, (var6_5 | var9_4) ^ ((var7_7 | var9_4) ^ -814557967)) | var4_9 << dh.kn((var7_7 | var9_4) ^ -1454857278, (var6_5 | var9_4) ^ ((var7_7 | var9_4) ^ -638795810)) | var5_10;
lbl21:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl23:
                            // 1 sources

                            var8_6 = (var6_5 | var9_4) ^ -313441321;
                            ** continue;
                            var4_9 = class_3532.method_48781((float)var2_2, (int)(var0 >> dh.kn(((var7_7 ^= -756051826) | var9_4) ^ -1463110661, (var6_5 | var9_4) ^ ((var7_7 | var9_4) ^ -189292983)) & dh.kn((var7_7 | var9_4) ^ -1463110660, (var6_5 | var9_4) ^ ((var7_7 | var9_4) ^ 1169226741))), (int)(var1_1 >> dh.kn((var7_7 | var9_4) ^ -1463110659, (var6_5 | var9_4) ^ ((var7_7 | var9_4) ^ -2098595375)) & dh.kn((var7_7 | var9_4) ^ -1463110658, (var6_5 | var9_4) ^ ((var7_7 | var9_4) ^ -1141836418))));
                            ** continue;
                            case 1782198132: {
                                var3_8 = class_3532.method_48781((float)var2_2, (int)(var0 >> dh.kn((var7_7 | var8_6 ^ var10_3) ^ (var8_6 ^ -1036350405), (var6_5 | var8_6 ^ var10_3) ^ ((var7_7 | var8_6 ^ var10_3) ^ (var8_6 ^ 1352425717))) & dh.kn((var7_7 | var8_6 ^ var10_3) ^ (var8_6 ^ -1036350460), (var6_5 | var8_6 ^ var10_3) ^ ((var7_7 | var8_6 ^ var10_3) ^ (var8_6 ^ -1825152194)))), (int)(var1_1 >> dh.kn((var7_7 | var8_6 ^ var10_3) ^ (var8_6 ^ -1036350459), (var6_5 | var8_6 ^ var10_3) ^ ((var7_7 | var8_6 ^ var10_3) ^ (var8_6 ^ 38575253))) & dh.kn((var7_7 | var8_6 ^ var10_3) ^ (var8_6 ^ -1036350458), (var6_5 | var8_6 ^ var10_3) ^ ((var7_7 | var8_6 ^ var10_3) ^ (var8_6 ^ 110498382)))));
                                break block12;
                            }
                            case -2111700060: {
                                var7_7 ^= var8_6 ^ -1075636922;
                                continue block5;
                            }
                        }
                        break;
                    }
                    break;
                }
                var8_6 = (var6_5 | var9_4) ^ 2085481675;
                ** while (true)
            }
            ** while (true)
        }
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private int kq() {
        int n2 = i & 0x4D7F306E ^ 0xF2C375E2;
        int n3 = 0;
        int n4 = (n2 | 0x4D7F306E) ^ 0x69BC03DC;
        n3 = (n2 | 0x4D7F306E) ^ 0x6032CE33;
        block5: while (true) {
            block6: {
                switch (n3) {
                    default: {
                        continue block5;
                    }
                    case 158052200: {
                        return Math.max(1, Math.round(((Float)this.b.getValue()).floatValue() * 20.0f));
                    }
                    case -1985481139: {
                        n4 ^= n3 ^ 0x5E6D4DA8;
                        break;
                    }
                    case -1613906979: {
                        break block6;
                    }
                }
                n3 = (n2 | 0x4D7F306E) ^ 0xF694DA86;
                continue;
            }
            n3 = (n2 | 0x4D7F306E) ^ 0x765883A3;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var2 = 2086726383;
        dh.i = mK.a(MethodHandles.lookup().lookupClass(), 1877528063);
        var1_1 = 0;
        var0_2 = -1008244474;
        var1_1 = var2 ^ 635021737;
        if (true) ** GOTO lbl39
        block21: while (true) {
            switch (var1_1) {
                case 611716554: {
                    var0_2 ^= var1_1 ^ 1040944705;
                    var1_1 = var2 ^ 1059584064;
                    continue block21;
                }
                case 900022032: {
                    var0_2 ^= var1_1 ^ -1873416116;
                    ** GOTO lbl58
                }
                case 1511007738: {
                    v0 = 0;
                    ** break;
                }
                case 1416241246: {
                    dh.a = new String[]{dh.d, dh.m, dh.o, dh.l, dh.t};
                    ** GOTO lbl60
                }
                case -1186432104: {
                    var0_2 ^= var1_1 ^ -2080454461;
                    ** GOTO lbl54
                }
                case 1555271484: {
                    dh.b = new float[2];
                    var1_1 = var2 ^ 1477895973;
                    ** break;
                }
                case -629701004: {
                    var0_2 ^= var1_1 ^ -1603854026;
                    ** GOTO lbl56
                }
                case -921015079: {
                    dh.a = NVGColor.create();
                    var1_1 = var2 ^ 667986603;
                    ** break;
                }
                case 2131889660: {
                    dh.a = new Vector4f();
                    var1_1 = var2 ^ -1508414309;
                }
lbl39:
                // 5 sources

                default: {
                    continue block21;
                }
                case 1538277444: {
                    var0_2 ^= var1_1 ^ 656302502;
                    ** GOTO lbl52
                }
                case -214627823: {
                    dh.d = new float[2];
                    var1_1 = var2 ^ 1094561420;
                    continue block21;
                }
                case 1029522531: {
                    var0_2 ^= var1_1 ^ 686258426;
                    var1_1 = var2 ^ 550725075;
                    continue block21;
                }
lbl52:
                // 1 sources

                var1_1 = var2 ^ 57861907;
                continue block21;
lbl54:
                // 1 sources

                var1_1 = var2 ^ 671795889;
                continue block21;
lbl56:
                // 1 sources

                var1_1 = var2 ^ -1890197250;
                continue block21;
lbl58:
                // 1 sources

                var1_1 = var2 ^ -1250261450;
                continue block21;
lbl60:
                // 1 sources

                var1_1 = var2 ^ 1237702143;
                continue block21;
                case 1505313606: {
                    ** GOTO lbl68
                }
                case -373089472: {
                    var0_2 ^= var1_1 ^ -783986113;
                    var1_1 = var2 ^ 644927253;
                    continue block21;
                }
lbl68:
                // 1 sources

                var1_1 = var2 ^ -1784417873;
                continue block21;
lbl70:
                // 1 sources

                while (true) {
                    var0_2 ^= -1783801122;
                    var0_2 ^= -465425940;
                    var0_2 ^= -423548340;
                    var0_2 ^= -209688011;
                    v1 = ((var0_2 ^= -438677362) | var2) ^ -84719784 ^ dh.i;
                    var0_2 ^= -686247118;
                    dh.a[v0] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ v1;
                    v0 = v0 + 1;
                    v4 = v3 + 4;
                    v2 = v2;
                    v3 = v4;
                    var0_2 ^= -1664412615;
                    if (v4 < v2.length) ** GOTO lbl161
                    dh.s = 1.5;
                    dh.h = dh.kn(((var0_2 ^= -131459730) | var2) ^ 688293573, var2 ^ ((var0_2 | var2) ^ -1139001316));
                    dh.g = dh.kn((var0_2 | var2) ^ 688293574, var2 ^ ((var0_2 | var2) ^ -348458248));
                    dh.r = 0.62;
                    dh.q = 1.33;
                    dh.p = 1.19;
                    dh.o = 1.26;
                    dh.n = 0.025;
                    dh.m = 0.3;
                    dh.l = 0.05;
                    dh.k = 0.62;
                    dh.e = dh.kn((var0_2 | var2) ^ 688293575, var2 ^ ((var0_2 | var2) ^ -389071822));
                    dh.d = 1600.0f;
                    dh.j = -0.3;
                    dh.i = 0.08;
                    dh.d = dh.kn((var0_2 | var2) ^ 688293592, var2 ^ ((var0_2 | var2) ^ -114943114));
                    dh.c = dh.kn((var0_2 | var2) ^ 688293593, var2 ^ ((var0_2 | var2) ^ 1491025249));
                    dh.b = dh.kn((var0_2 | var2) ^ 688293594, var2 ^ ((var0_2 | var2) ^ 925199894));
                    dh.c = 100.0f;
                    dh.a = dh.kn((var0_2 | var2) ^ 688293595, var2 ^ ((var0_2 | var2) ^ -58816891));
                    dh.h = 0.011;
                    dh.g = 0.52;
                    dh.f = 0.22;
                    dh.b = 0.35f;
                    dh.e = 0.45;
                    dh.d = 0.1;
                    dh.c = 0.86;
                    dh.b = 1.14;
                    dh.a = 0.12f;
                    dh.a = 0.25;
                    dh.k = gj.decode("xXvSgLobsnB+q5yb", dh.kn((var0_2 | var2) ^ 688293596, var2 ^ ((var0_2 | var2) ^ 415038444)));
                    dh.s = gj.decode("gczTFb6GaKycDRwO8Kwmpdoetu0zSXtOIbZ+zPevl8EjCATQnA==", dh.kn((var0_2 | var2) ^ 688293597, var2 ^ ((var0_2 | var2) ^ 629463231)));
                    dh.g = gj.decode("w7lZ/1w=", dh.kn((var0_2 | var2) ^ 688293598, var2 ^ ((var0_2 | var2) ^ 689147599)));
                    dh.q = gj.decode("oSriuXUf", dh.kn((var0_2 | var2) ^ 688293599, var2 ^ ((var0_2 | var2) ^ 1436748405)));
                    dh.y = gj.decode("7gL4KJqv1w==", dh.kn((var0_2 | var2) ^ 688293584, var2 ^ ((var0_2 | var2) ^ 319578962)));
                    dh.e = gj.decode("Bq2kRJ/b", dh.kn((var0_2 | var2) ^ 688293585, var2 ^ ((var0_2 | var2) ^ -1837335651)));
                    dh.w = gj.decode("0OrhbQ==", dh.kn((var0_2 | var2) ^ 688293586, var2 ^ ((var0_2 | var2) ^ -658056370)));
                    dh.u = gj.decode("xBGuRs4=", dh.kn((var0_2 | var2) ^ 688293587, var2 ^ ((var0_2 | var2) ^ 770174680)));
                    dh.c = gj.decode("55Ke7rzSH1gXlKP5nuwUejc=", dh.kn((var0_2 | var2) ^ 688293588, var2 ^ ((var0_2 | var2) ^ -1775882862)));
                    dh.x = gj.decode("CUBVXtsfqQY=", dh.kn((var0_2 | var2) ^ 688293589, var2 ^ ((var0_2 | var2) ^ -1320294630)));
                    dh.r = gj.decode("fARw2c0=", dh.kn((var0_2 | var2) ^ 688293590, var2 ^ ((var0_2 | var2) ^ -1237866605)));
                    dh.f = gj.decode("qopqEvlsX/mf2mXt54IS5stDOcMwZiKPXIrvkoxRDw==", dh.kn((var0_2 | var2) ^ 688293591, var2 ^ ((var0_2 | var2) ^ 199430212)));
                    dh.n = gj.decode("JOxFMnVrdOwxFw==", dh.kn((var0_2 | var2) ^ 688293544, var2 ^ ((var0_2 | var2) ^ 423948191)));
                    dh.i = gj.decode("EcyNZK20rh8=", dh.kn((var0_2 | var2) ^ 688293545, var2 ^ ((var0_2 | var2) ^ -1281267951)));
                    dh.v = gj.decode("yS6+8LtWUi4S0Q5T", dh.kn((var0_2 | var2) ^ 688293546, var2 ^ ((var0_2 | var2) ^ 1061786324)));
                    dh.j = gj.decode("8BzSn7+9yddOJcqXjQ==", dh.kn((var0_2 | var2) ^ 688293547, var2 ^ ((var0_2 | var2) ^ 208122939)));
                    dh.h = gj.decode("6yRnPvCZv+dymGxp", dh.kn((var0_2 | var2) ^ 688293548, var2 ^ ((var0_2 | var2) ^ -518920027)));
                    dh.a = gj.decode("3/MjqFU=", dh.kn((var0_2 | var2) ^ 688293549, var2 ^ ((var0_2 | var2) ^ -1293448608)));
                    dh.p = gj.decode("LsFRWQ==", dh.kn((var0_2 | var2) ^ 688293550, var2 ^ ((var0_2 | var2) ^ -1851323668)));
                    dh.b = gj.decode("sqhTJXlb2lZfZUJDQxrgvh2LPQ9rYbaPydWhvJHmMswlBTNlCw==", dh.kn((var0_2 | var2) ^ 688293551, var2 ^ ((var0_2 | var2) ^ 1051299455)));
                    dh.d = gj.decode("mg==", dh.kn((var0_2 | var2) ^ 688293536, var2 ^ ((var0_2 | var2) ^ -1010990754)));
                    dh.m = gj.decode("TQ==", dh.kn((var0_2 | var2) ^ 688293537, var2 ^ ((var0_2 | var2) ^ 473792449)));
                    dh.o = gj.decode("sA==", dh.kn((var0_2 | var2) ^ 688293538, var2 ^ ((var0_2 | var2) ^ -1605466091)));
                    dh.l = gj.decode("Gg==", dh.kn((var0_2 | var2) ^ 688293539, var2 ^ ((var0_2 | var2) ^ 706997674)));
                    dh.t = gj.decode("/w==", dh.kn((var0_2 | var2) ^ 688293540, var2 ^ ((var0_2 | var2) ^ 1897900939)));
                    var1_1 = var2 ^ -987197065;
                    continue block21;
                    break;
                }
lbl157:
                // 1 sources

                while (true) {
                    var0_2 ^= 2058595635;
                    v3 = 0;
                    v2 = "\u00cbO\u00a8*[1\u00f1\u00de+O\u00c2jU1\\\u00ad\u00fe@\u0007\u0000\u00ae\f\u00bf\u00aaH\u00e7\u00b0\u00ac\u00a4\u008d\u00d0\u0018f\u00b0{\u00cf]\u00b4j\u0081\u00b0\u00a4\u0004\u00117\u00e0~n\u0084$>\u00a2%\u001f\u0081\r\u00e6J\u00e7!\u0015\u00be\u00bc\u008c\u00f8\u00aen\u0096X*>\u0092?\u0086\u00a5\u0018\u0091\u00b3\u000f\u00feM0\u00ad\u0087\u00dc\u0099D\u008d\u0089q(\u008bB_O\u00ed\u00a6\u00af\u00f8\f@\u0011jrx\u00ff\u00b2~u\u00ad\u00fb\u00ba\u00a1\u00ffl\u0015t \u008aS\u009b\u0004j\u0011R\u00eb\u00ac\u0001\u0091A\u00ae\u0088\u0000;P_\u0004\u00e1\u00df\u00fa\u009c0me-7\t\u00bb\u00ean\n\u00fb\u00d3w\u00072\u0080\u0014\u00e9\u001e\u001b\u00be\u00dcM\u00a6w7\u00ff\u00b0\u00e9\\\u00cb\u00f8E\u0014\u009a-1Gq\u00d7X\u00fb\u008c\u0080~1A\u0083\u008b\u00ff\u00ab\u0092b\u00d8\u00f93\u009b\u00fe\u00cf\\a\u00ad\u00bf\u0097:EU!\u00e4\u00a0\u001b\u0019J\u0094\u00a2n\u0014/\u00ce\u00d3ye\u00bf\u00aeKiN\u00ab\u0018#\u0000\u0002Y\u00ac\u0011\u0091\u00a9\u00dcW\u00a5\u00ed#\u0088\u00c3\u0094L?\u00b9-\u00a763CO{\u009bi*\u008bBI\u00d4}\u0004#\u000bE\u0003\b\u00d5+\u00fe\u00deh\u00f5\u00a4\u0085k/<\u001duo\u00a3<d\u00d2z\u00af\u0086\u000e;\u0019\u0086\u0080\\:;\u00e9D\u00e3\u00ad\u00e7\u00c6\u0095\u008c\u00c6".getBytes("ISO-8859-1");
lbl161:
                    // 2 sources

                    var0_2 ^= 1392153614;
                    var0_2 ^= -1738714944;
                    ** continue;
                    break;
                }
lbl164:
                // 1 sources

                while (true) {
                    switch (var0_2) {
                        case -77520775: {
                            var0_2 ^= 197866069;
                            ** GOTO lbl171
                        }
                        default: {
                            var0_2 ^= -37728680;
lbl171:
                            // 2 sources

                            dh.a = new int[(var0_2 | var2) ^ -51709278];
                            ** continue;
                        }
                        case 172165235: 
                    }
                    var0_2 ^= -1971507842;
                }
                case 1128731311: 
            }
            break;
        }
        dh.c = new float[2];
    }

    /*
     * Unable to fully structure code
     */
    private static double kr(double var0) {
        block25: {
            block27: {
                block26: {
                    block24: {
                        block23: {
                            block22: {
                                var9_1 = 195531002;
                                var6_2 = dh.i & 195531002 ^ 658385289;
                                var8_3 = 0;
                                ** GOTO lbl57
lbl5:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl7:
                                // 2 sources

                                while (true) {
                                    var7_4 ^= -270540919;
                                    break block22;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var7_4 ^= var8_3 ^ -1998788787;
                                    break block23;
                                    break;
                                }
                                while (true) {
                                    var8_3 = (var6_2 | var9_1) ^ -1429588494;
                                    break block24;
                                    break;
                                }
                            }
                            var4_6 = v0;
                            ** GOTO lbl47
lbl19:
                            // 1 sources

                            while (true) {
                                var8_3 = (var6_2 | var9_1) ^ 60568004;
                                ** GOTO lbl37
                                break;
                            }
                        }
                        var8_3 = (var6_2 | var9_1) ^ 469058997;
                        break block24;
                        var2_5 = Math.min(1.0, var0 / 0.1);
                        var8_3 = (var6_2 | var9_1) ^ 885322406;
                    }
lbl28:
                    // 4 sources

                    block18: while (true) {
                        switch (var8_3) {
                            default: {
                                continue block18;
                            }
                            case 461065053: {
                                ** continue;
                            }
                            case 877329486: {
                                if (!(var0 > 0.62)) ** continue;
                                break block25;
                            }
lbl37:
                            // 2 sources

                            block19: while (true) {
                                switch (var8_3) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block19;
                                        }
                                        break;
                                    }
                                    case -478803379: {
                                        ** continue;
                                    }
lbl44:
                                    // 1 sources

                                    while (true) {
                                        var8_3 = (var6_2 | var9_1) ^ -107567433;
                                        ** continue;
                                        break;
                                    }
lbl47:
                                    // 1 sources

                                    var7_4 ^= 1575954976;
                                    break block26;
                                    case -1979172827: {
                                        v0 = 1.0;
                                        ** GOTO lbl7
                                    }
                                    case -701948084: {
                                        var7_4 ^= var8_3 ^ 699747665;
                                        ** GOTO lbl65
                                    }
                                    case 740526143: {
                                        ** continue;
                                    }
                                }
                                break;
                            }
lbl57:
                            // 1 sources

                            var7_4 = (var6_2 | var9_1) ^ -811322085;
                            ** continue;
                            case -1070367332: {
                                var7_4 ^= var8_3 ^ 1463241279;
                                break block18;
                            }
                            case -2055894007: {
                                var7_4 ^= var8_3 ^ 309443498;
                                break block27;
                            }
lbl65:
                            // 1 sources

                            var8_3 = (var6_2 | var9_1) ^ -859196490;
                            ** continue;
                        }
                        break;
                    }
                    var8_3 = (var6_2 | var9_1) ^ 538200807;
                    ** GOTO lbl28
                    {
                        ** case 262927132:
                    }
lbl70:
                    // 1 sources

                    v0 = Math.pow((1.0 - var0) / 0.38, 1.6);
                    ** while (true)
                }
                return var2_5 * var4_6;
            }
            var8_3 = (var6_2 | var9_1) ^ -1514700322;
            ** GOTO lbl28
        }
        var8_3 = (var6_2 | var9_1) ^ -275987353;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static double ks(double var0) {
        block23: {
            block22: {
                break block23;
lbl1:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -260471178;
                    if (true) ** GOTO lbl12
lbl4:
                    // 1 sources

                    while (true) {
                        var3_4 ^= var4_3 ^ 500419221;
                        ** GOTO lbl30
                        break;
                    }
                    block16: while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1695855334;
                        if (true) ** GOTO lbl12
                        block17: while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 135723716;
lbl12:
                            // 7 sources

                            block18: while (true) {
                                switch (var4_3) {
                                    default: {
                                        continue block18;
                                    }
                                    case 1626110087: {
                                        ** continue;
                                    }
                                    case -1412852325: {
                                        break;
                                    }
                                    case -1324123861: {
                                        continue block17;
                                    }
                                    case 959717957: {
                                        break block22;
                                    }
                                    case 755533759: {
                                        var3_4 ^= var4_3 ^ -1419251692;
                                        continue block16;
                                    }
                                    case 1403447593: {
                                        var3_4 ^= var4_3 ^ 322242649;
                                        continue block16;
                                    }
                                }
lbl30:
                                // 2 sources

                                var4_3 = (var2_2 | var5_1) ^ -461921082;
                                continue;
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl32:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -1020061736;
                    ** GOTO lbl12
                    break;
                }
lbl35:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 315364980;
                    ** GOTO lbl12
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -1898452768;
                    ** GOTO lbl12
                    break;
                }
            }
            var4_3 = (var2_2 | var5_1) ^ -107896965;
            ** while (true)
        }
        var5_1 = 584525134;
        var2_2 = dh.i & 584525134 ^ -2120258785;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ -180187210;
        ** while (true)
        {
            case 1515122724: {
                return 0.85 + 0.15 * dh.ku(Math.min(1.0, var0 / 0.22));
            }
            ** case 1202244505:
        }
lbl53:
        // 1 sources

        switch (var3_4) {
            default: {
                ** continue;
            }
            case 717894161: {
                ** continue;
            }
            ** case 1453187305:
lbl59:
            // 1 sources

            ** continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static double kt(double var0) {
        block10: {
            var4_1 = dh.i & -887256684 ^ 1969754065;
            var6_2 = 0;
            var5_3 = (var4_1 | -887256684) ^ -1982309801;
            ** GOTO lbl21
lbl5:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl7:
            // 1 sources

            block6: while (true) {
                switch (var6_2) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
                    case -405916492: {
                        ** continue;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var6_2 = (var4_1 | -887256684) ^ 414432097;
                        ** GOTO lbl-1000
                        break;
                    }
lbl17:
                    // 1 sources

                    return 1.0 - var2_4 * var2_4 * var2_4;
                    case 1544945279: {
                        break block10;
                    }
lbl21:
                    // 1 sources

                    var6_2 = (var4_1 | -887256684) ^ -1553436246;
                    ** continue;
                    case -814444487: {
                        var5_3 ^= var6_2 ^ 1446454301;
                        break block6;
                    }
                }
                break;
            }
            ** while (true)
            var2_4 = 1.0 - var0;
            var5_3 ^= 25789125;
            ** while (true)
        }
        var6_2 = (var4_1 | -887256684) ^ 805904364;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static double ku(double d2) {
        int n2 = i & 0xE09B224E ^ 0xBC5E3962;
        int n3 = 0;
        int n4 = (n2 | 0xE09B224E) ^ 0xB85A4A18;
        n3 = (n2 | 0xE09B224E) ^ 0x20D44E79;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -603228905: {
                    n3 = (n2 | 0xE09B224E) ^ 0xC9F61B62;
                    continue block5;
                }
                case -149500657: {
                    double d3 = 1.70158;
                    n4 ^= 0xDC3EDF80;
                    double d4 = d3 + 1.0;
                    n4 ^= 0x83E5FF0C;
                    double d5 = d2 - 1.0;
                    n4 ^= 0x356B45F7;
                    return 1.0 + d4 * d5 * d5 * d5 + d3 * d5 * d5;
                }
                case 891887628: 
            }
            n4 ^= n3 ^ 0x7B8A2732;
            n3 = (n2 | 0xE09B224E) ^ 0xBC9F661;
        }
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ boolean kv(int var1_1, ft var2_2) {
        block29: {
            block30: {
                block28: {
                    block27: {
                        block23: {
                            block22: {
                                block20: {
                                    block25: {
                                        block24: {
                                            block21: {
                                                block26: {
                                                    break block26;
lbl1:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_6 ^= var5_5 ^ -274431751;
                                                        break block20;
                                                        break;
                                                    }
lbl4:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_6 ^= var5_5 ^ -1541338369;
                                                        break block21;
                                                        break;
                                                    }
lbl7:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_6 ^= var5_5 ^ 709572019;
                                                        var5_5 = (var3_4 | var6_3) ^ 2115259396;
                                                        break block22;
                                                        break;
                                                    }
                                                }
                                                var6_3 = -685048219;
                                                var3_4 = dh.i & -685048219 ^ -658609068;
                                                var5_5 = 0;
                                                break block27;
lbl16:
                                                // 1 sources

                                                while (true) {
                                                    v0 = this.f - var2_2.a;
                                                    if (!var2_2.a) break block23;
                                                    break block24;
                                                    break;
                                                }
lbl20:
                                                // 1 sources

                                                while (true) {
                                                    var5_5 = (var3_4 | var6_3) ^ -541010801;
                                                    break block22;
                                                    break;
                                                }
                                                while (true) {
                                                    var5_5 = (var3_4 | var6_3) ^ -1807393143;
                                                    break block22;
                                                    break;
                                                }
lbl26:
                                                // 1 sources

                                                while (true) {
                                                    v1 = true;
                                                    break block25;
                                                    break;
                                                }
                                            }
                                            var5_5 = (var3_4 | var6_3) ^ -1830823061;
                                            break block22;
lbl32:
                                            // 1 sources

                                            while (true) {
                                                v1 = false;
                                                break block25;
                                                break;
                                            }
lbl35:
                                            // 1 sources

                                            while (true) {
                                                if (v0 < v2) ** continue;
                                                ** continue;
                                                break;
                                            }
                                        }
                                        v2 = dh.kn(((var4_6 ^= -1614483751) | var6_3) ^ -1999990189, (var3_4 | var6_3) ^ ((var4_6 | var6_3) ^ -1860970746));
                                        break block28;
                                    }
                                    var4_6 ^= 456587376;
                                    break block29;
                                }
                                var5_5 = (var3_4 | var6_3) ^ -130586910;
                            }
lbl47:
                            // 2 sources

                            block18: while (true) {
                                switch (var5_5) {
                                    default: {
                                        continue block18;
                                    }
                                    case 8268538: {
                                        ** continue;
                                    }
                                    case 1274781948: {
                                        ** continue;
                                    }
                                    case 1396372943: {
                                        ** continue;
                                    }
                                    case -1582648719: {
                                        ** continue;
                                    }
                                    case 663328919: {
                                        ** continue;
                                    }
                                    case 1298212126: {
                                        ** continue;
                                    }
                                    ** case 1408094074:
lbl64:
                                    // 1 sources

                                    break;
                                }
                                var5_5 = (var3_4 | var6_3) ^ -1937503302;
                                continue;
                                break;
                            }
                        }
                        var4_6 ^= -1614483751;
                        break block30;
                    }
                    var4_6 = (var3_4 | var6_3) ^ 1939081438;
                    var5_5 = (var3_4 | var6_3) ^ -1940705009;
                    ** while (true)
                }
lbl75:
                // 2 sources

                while (true) {
                    var4_6 ^= -149425409;
                    ** continue;
                    break;
                }
            }
            v2 = var1_1;
            ** while (true)
        }
        return v1;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ boolean kw(ex var1_1) {
        block20: {
            var5_2 = 849192054;
            var2_3 = dh.i & 849192054 ^ -1281629236;
            var4_4 = 0;
            ** GOTO lbl49
lbl5:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 347824080;
                ** GOTO lbl34
                break;
            }
lbl8:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -2049274306;
                ** GOTO lbl34
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 77322095;
                ** GOTO lbl34
lbl14:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ -278664925;
                    ** continue;
                    break;
                }
lbl17:
                // 1 sources

                while (true) {
                    v0 = false;
                    ** GOTO lbl26
                    break;
                }
                break;
            }
lbl20:
            // 1 sources

            block14: while (true) {
                var4_4 = (var2_3 | var5_2) ^ 748136115;
                ** GOTO lbl34
lbl23:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -2085147975;
                    ** GOTO lbl34
lbl26:
                    // 2 sources

                    while (true) {
                        var3_5 ^= 1306343797;
                        break block20;
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ -1618242036;
                        ** continue;
                        break;
                    }
                    break;
                }
lbl32:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1855216902;
lbl34:
                    // 7 sources

                    block19: while (true) {
                        switch (var4_4) {
                            default: {
                                continue block19;
                            }
                            case -1626848947: {
                                ** continue;
                            }
                            case 807980359: {
                                ** continue;
                            }
                            case -1224462191: {
                                break block14;
                            }
                            case -1140514573: {
                                ** continue;
                            }
                            case -1490765778: {
                                v0 = true;
                                ** continue;
                            }
lbl49:
                            // 1 sources

                            var3_5 = (var2_3 | var5_2) ^ -1193185324;
                            ** continue;
                            case 586433796: {
                                var3_5 ^= var4_4 ^ 1386212714;
                                ** continue;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ 261801741;
            ** while (true)
            {
                ** case 910518720:
            }
lbl57:
            // 1 sources

            ** while (this.f - var1_1.a <= dh.kn((int)((var3_5 | var4_4 ^ 81317302) ^ (var4_4 ^ 1540209420)), (int)((var2_3 | var4_4 ^ 81317302) ^ ((var3_5 | var4_4 ^ 81317302) ^ (var4_4 ^ -79580129)))))
lbl58:
            // 1 sources

            ** while (true)
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ boolean kx(class_1657 var0) {
        var1_1 = dh.i & -1292958064 ^ -771017276;
        var3_2 = 0;
        ** GOTO lbl12
lbl4:
        // 1 sources

        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 3 sources

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
                    var3_2 = (var1_1 | -1292958064) ^ 2082177696;
                    ** GOTO lbl-1000
                    break;
                }
lbl12:
                // 1 sources

                var2_3 = (var1_1 | -1292958064) ^ 579182007;
                ** continue;
lbl14:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -1292958064) ^ 20806386;
                    ** continue;
                    break;
                }
                case -204321498: {
                    var2_3 ^= var3_2 ^ 1639486233;
                    break block5;
                }
                case -1896565388: {
                    ** continue;
                }
            }
            break;
        }
        var3_2 = (var1_1 | -1292958064) ^ -1298259577;
        ** while (true)
        {
            ** case 1081153107:
        }
lbl25:
        // 1 sources

        return true;
    }
}

