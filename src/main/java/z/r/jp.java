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
 */
package z.r;

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
import z.r.W;
import z.r.aE;
import z.r.az;
import z.r.gF;
import z.r.gP;
import z.r.hJ;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class jp
extends gF {
    private static final int[] a;
    private static final double a;
    private static final double b;
    private static final int a;
    public static final int f;
    private static final float a;
    private static final /* synthetic */ String a;
    private static final double c;
    private double d;
    private static final /* synthetic */ String k;
    private static final double e;
    private static final double f;
    private static final float b;
    private static final float c;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String s;
    private static final double g;
    private final ke a;
    private static final /* synthetic */ String c;
    private final aE a;
    private static final double h;
    private static final double i;
    private static final NVGColor a;
    private final ke b;
    private double j;
    private static final double k;
    private static final double l;
    private static final double m;
    private static final /* synthetic */ String d;
    private final gP a;
    private double n;
    private static final double o;
    private static final /* synthetic */ String e;
    private static final float[] a;
    private static final /* synthetic */ String f;
    private double p;
    private static final float d;
    private final ke c;
    private static final double q;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private final az a;
    private static final Vector4f a;
    private double r;
    private static final /* synthetic */ String j;
    private static final int b;
    private static final double s;
    private static final int c;
    private boolean a;
    private static final double t;
    private static final double u;
    private double v;
    private int d;
    private static final /* synthetic */ String l;
    private static final int e;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final double w;
    private static final double x;
    private static final double y;
    private double z;
    private static final double A;
    private final gP b;
    private static final double B;
    private static final double C;
    private static final /* synthetic */ String o;
    private static final float[] b;
    private double D;

    /*
     * Exception decompiling
     */
    public jp() {
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
    public static jp get() {
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
        var1_1 = jp.f & -119113295 ^ 1788183868;
        var3_2 = 0;
        if (true) ** GOTO lbl11
        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 4 sources

            {
                default: {
                    continue block5;
                }
lbl8:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -119113295) ^ -1877838077;
                    ** GOTO lbl-1000
                    break;
                }
lbl11:
                // 1 sources

                var2_3 = (var1_1 | -119113295) ^ -413181590;
                ** continue;
lbl13:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -119113295) ^ 73339583;
                    ** GOTO lbl-1000
                    break;
                }
                case -22483198: {
                    var2_3 ^= var3_2 ^ -119802175;
                    var3_2 = (var1_1 | -119113295) ^ -278690844;
                    ** GOTO lbl-1000
                }
                case 362053209: {
                    return;
                }
                case 1793428158: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block10: {
            block11: {
                break block11;
lbl1:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1865353734;
                    break block10;
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    this.a = false;
                    ** continue;
                    break;
                }
            }
            var4_1 = -1763937251;
            var1_2 = jp.f & -1763937251 ^ 614443506;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -942233161;
            var3_3 = (var1_2 | var4_1) ^ -1751131871;
        }
        block9: while (true) {
            block12: {
                block13: {
                    switch (var3_3) {
                        default: {
                            continue block9;
                        }
                        case -755774374: {
                            ** continue;
                        }
                        case 1929355127: {
                            var2_4 ^= var3_3 ^ 578385053;
                            break;
                        }
                        case -638519303: {
                            var2_4 ^= var3_3 ^ -326875495;
                            break block12;
                        }
                        case 557851870: {
                            break block13;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1680617893;
                    continue;
                    {
                        ** case 1568619201:
                    }
lbl31:
                    // 1 sources

                    return;
                }
                var3_3 = (var1_2 | var4_1) ^ -1004510584;
                continue;
            }
            var3_3 = (var1_2 | var4_1) ^ -341784770;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onTick(class_310 var1_1) {
        block39: {
            block37: {
                block38: {
                    block36: {
                        block40: {
                            break block40;
lbl1:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_4 ^ 2041580036;
                                break block36;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -874575169;
                                break block37;
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1653217282;
                                break block37;
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1307979345;
                                break block37;
                                break;
                            }
                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -157422439;
                                break block37;
                                break;
                            }
lbl16:
                            // 2 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -1115174524;
                                break block37;
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1252935205;
                                break block37;
                                break;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                ++this.d;
                                break block38;
                                break;
                            }
lbl25:
                            // 1 sources

                            return;
lbl27:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1015678204;
                                break block37;
lbl30:
                                // 1 sources

                                while (true) {
                                    if (var1_1.field_1687 == null) ** GOTO lbl16
                                    break block39;
                                    break;
                                }
                                break;
                            }
lbl33:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -1531278241;
                                break block37;
                                break;
                            }
lbl36:
                            // 1 sources

                            while (true) {
                                this.a = false;
                                ** continue;
                                break;
                            }
lbl39:
                            // 1 sources

                            return;
lbl41:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -1894059175;
                                break block37;
                                break;
                            }
lbl44:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_4 ^ -1708306839;
                                ** continue;
                                break;
                            }
lbl47:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 2080767473;
                                break block37;
                                break;
                            }
                        }
                        var5_2 = 1613845561;
                        var2_3 = jp.f & 1613845561 ^ 2050661092;
                        var4_4 = 0;
                        var3_5 = (var2_3 | var5_2) ^ -1180070288;
                        ** while (true)
                    }
                    var4_4 = (var2_3 | var5_2) ^ -648389137;
                    break block37;
lbl59:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ 1604845737;
                        ** continue;
                        break;
                    }
lbl62:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ 664966260;
                        ** continue;
                        break;
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ 513795578;
                break block37;
lbl68:
                // 1 sources

                while (true) {
                    if (var1_1.field_1724 != null) ** continue;
                    ** continue;
                    break;
                }
            }
lbl72:
            // 2 sources

            block35: while (true) {
                switch (var4_4) {
                    default: {
                        continue block35;
                    }
                    case 1186060801: {
                        ** continue;
                    }
                    case -182375004: {
                        ** continue;
                    }
                    case -1310403518: {
                        ** continue;
                    }
                    case -1553890542: {
                        ** continue;
                    }
                    case 936243372: {
                        ** continue;
                    }
                    case -561950046: {
                        ** continue;
                    }
                    case 104735500: {
                        ** continue;
                    }
                    case -943974535: {
                        ** continue;
                    }
                    case 1688484615: {
                        ** continue;
                    }
                    case -1935265180: {
                        ** continue;
                    }
                    case 414303999: {
                        ** continue;
                    }
                    case 2021666727: {
                        ** continue;
                    }
                    case 815110360: 
                }
                var3_5 ^= var4_4 ^ -1009813165;
                ** continue;
                break;
            }
        }
        var4_4 = (var2_3 | var5_2) ^ 45871450;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static boolean Fd(class_310 var0, class_1657 var1_1) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void Fe(class_4588 var0, Matrix4f var1_1, class_243 var2_2, double var3_3, double var5_4, int var7_5, int var8_6) {
        var12_7 = -225572708;
        var9_8 = jp.f & -225572708 ^ -339093838;
        var11_9 = 0;
        var10_10 = (var9_8 | var12_7) ^ -1924388854;
        var11_9 = (var9_8 | var12_7) ^ 304027213;
        block9: while (true) {
            switch (var11_9) {
                case -46054806: {
                    jp.Ff(var0, var1_1, var2_2, var3_3, var5_4 * 2.6, var7_5, (int)((double)var8_6 * 0.22));
                    var11_9 = (var9_8 | var12_7) ^ 1153564255;
                    continue block9;
                }
                case 2024978761: {
                    var10_10 ^= var11_9 ^ -1578462048;
                    var11_9 = (var9_8 | var12_7) ^ 110009556;
                    continue block9;
                }
                case -1708750955: {
                    jp.Ff(var0, var1_1, var2_2, var3_3, var5_4, var7_5, var8_6);
                    ** break;
                }
                case -372193037: {
                    var11_9 = (var9_8 | var12_7) ^ -2088933385;
                    continue block9;
                }
                case -1089593119: {
                    var10_10 ^= var11_9 ^ 1307980933;
                    var11_9 = (var9_8 | var12_7) ^ 1642682667;
                    ** GOTO lbl27
                }
lbl26:
                // 1 sources

                var11_9 = (var9_8 | var12_7) ^ -779036464;
lbl27:
                // 3 sources

                default: {
                    continue block9;
                }
                case 710870638: {
                    var10_10 ^= var11_9 ^ 905942660;
                    var11_9 = (var9_8 | var12_7) ^ 362068415;
                    continue block9;
                }
                case -295999743: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void Ff(class_4588 var0, Matrix4f var1_1, class_243 var2_2, double var3_3, double var5_4, int var7_5, int var8_6) {
        block34: {
            block33: {
                var21_7 = -1368736991;
                var18_8 = jp.f & -1368736991 ^ 1839562071;
                var20_9 = 0;
                var19_10 = (var18_8 | var21_7) ^ -853121854;
                var20_9 = (var18_8 | var21_7) ^ -1183924684;
                break block34;
lbl7:
                // 1 sources

                while (true) {
                    var13_13 = 0;
                    ** GOTO lbl12
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    continue;
lbl12:
                    // 2 sources

                    while (true) {
                        var20_9 = (var18_8 | var21_7) ^ -1943139775;
                        break block33;
                        break;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        var20_9 = (var18_8 | var21_7) ^ -1257326172;
                        break block33;
                        break;
                    }
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var20_9 = (var18_8 | var21_7) ^ -1468156619;
                    break block34;
                    break;
                }
                var16_15 = 6.283185307179586 * (double)(var13_13 + 1) / 36.0;
                var20_9 = (var18_8 | var21_7) ^ -1277476682;
                block28: while (true) {
                    block35: {
                        switch (var20_9) {
                            default: {
                                continue block28;
                            }
                            case -1503159584: {
                                ** break;
                            }
                            case 1576648504: {
                                ++var13_13;
                                ** continue;
                            }
                            case -70844670: {
                                var19_10 ^= var20_9 ^ -1291903670;
                                ** GOTO lbl38
                            }
lbl35:
                            // 1 sources

                            var19_10 ^= -1647485209;
                            var19_10 ^= -1908536723;
                            break block35;
lbl38:
                            // 1 sources

                            var20_9 = (var18_8 | var21_7) ^ -1307164593;
                            continue block28;
                            case 1546960833: 
                        }
                        var19_10 ^= var20_9 ^ -387089016;
                        var20_9 = (var18_8 | var21_7) ^ 1233675671;
                        continue;
                    }
                    var19_10 ^= 615842808;
                    jp.Fi(var0, var1_1, jp.Fh(var2_2, var14_14, var9_11), jp.Fh(var2_2, var14_14, var11_12), jp.Fh(var2_2, var16_15, var11_12), jp.Fh(var2_2, var16_15, var9_11), var7_5, var8_6, var7_5, var8_6);
                    var20_9 = (var18_8 | var21_7) ^ 338231413;
                }
lbl49:
                // 1 sources

                while (true) {
                    var19_10 ^= 1030022667;
                    ** continue;
                    break;
                }
            }
            block30: while (true) {
                block37: {
                    block36: {
                        switch (var20_9) {
                            default: {
                                continue block30;
                            }
                            case 1673655606: {
                                var19_10 ^= var20_9 ^ 1007288014;
                                ** GOTO lbl70
                            }
                            case 2065256642: {
                                if (var13_13 >= jp.Fm((var19_10 | var20_9 ^ -713823261) ^ (var20_9 ^ 1957794067), (var18_8 | var20_9 ^ -713823261) ^ ((var19_10 | var20_9 ^ -713823261) ^ (var20_9 ^ -2014969149)))) ** GOTO lbl66
                                break block36;
                            }
                            case -412391735: {
                                var19_10 ^= var20_9 ^ 124666755;
                                break block37;
                            }
lbl66:
                            // 1 sources

                            var20_9 = (var18_8 | var21_7) ^ 142907838;
                            continue block30;
                            case -926965878: {
                                return;
                            }
lbl70:
                            // 1 sources

                            var20_9 = (var18_8 | var21_7) ^ -1795772491;
                            continue block30;
                            case 1524713171: {
                                var14_14 = 6.283185307179586 * (double)var13_13 / 36.0;
                                break block30;
                            }
                            case -1575388560: 
                        }
                        var19_10 ^= var20_9 ^ 1014123006;
                        ** continue;
                    }
                    var20_9 = (var18_8 | var21_7) ^ 1308001543;
                    continue;
                }
                var20_9 = (var18_8 | var21_7) ^ 659579133;
            }
            var19_10 ^= 184897285;
            ** while (true)
        }
        block31: while (true) {
            block38: {
                switch (var20_9) {
                    case -250072046: {
                        if (var8_6 <= 0) {
                            ** break;
                        }
                        ** GOTO lbl110
                    }
                    case -754424195: {
                        var19_10 ^= var20_9 ^ -429910813;
                        var20_9 = (var18_8 | var21_7) ^ -1013543632;
                        continue block31;
                    }
                    case 1200769602: {
                        return;
                    }
lbl99:
                    // 1 sources

                    var20_9 = (var18_8 | var21_7) ^ 855797210;
                    ** GOTO lbl111
                    case -1406484912: {
                        var19_10 ^= var20_9 ^ -58942261;
                        break block38;
                    }
                    case 1451311427: {
                        var20_9 = (var18_8 | var21_7) ^ 1137000743;
                        ** GOTO lbl111
                    }
                    case -588410195: {
                        var19_10 ^= var20_9 ^ 1221683140;
                        ** continue;
                    }
lbl110:
                    // 1 sources

                    var20_9 = (var18_8 | var21_7) ^ 1021810954;
lbl111:
                    // 4 sources

                    default: {
                        continue block31;
                    }
                    case 746156615: 
                }
                var9_11 = var3_3 - var5_4;
                ** break;
lbl116:
                // 1 sources

                var19_10 ^= 1080363088;
                var11_12 = var3_3 + var5_4;
                ** continue;
            }
            var20_9 = (var18_8 | var21_7) ^ 519555941;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void Fg(class_4588 var0, Matrix4f var1_1, class_243 var2_2, double var3_3, double var5_4, double var7_5, double var9_6, int var11_7, int var12_8) {
        var28_9 = -803987716;
        var25_10 = jp.f & -803987716 ^ 863137518;
        var27_11 = 0;
        var26_20 = (var25_10 | var28_9) ^ -1245318493;
        var27_11 = (var25_10 | var28_9) ^ 1092424745;
        ** GOTO lbl92
lbl7:
        // 1 sources

        while (true) {
            var23_18 = new class_243(var2_2.field_1352 + var13_12 * var7_5 + var17_14, var2_2.field_1351, var2_2.field_1350 + var15_13 * var7_5 + var19_15);
            var26_20 ^= -455099083;
            var24_19 = new class_243(var2_2.field_1352 + var13_12 * var7_5 - var17_14, var2_2.field_1351, var2_2.field_1350 + var15_13 * var7_5 - var19_15);
            var27_11 = (var25_10 | var28_9) ^ 1663301025;
            ** GOTO lbl60
            break;
        }
lbl13:
        // 1 sources

        while (true) {
            var27_11 = (var25_10 | var28_9) ^ 757639869;
            if (true) ** GOTO lbl70
            break;
        }
lbl16:
        // 2 sources

        while (true) {
            continue;
            break;
        }
lbl18:
        // 1 sources

        while (true) {
            var26_20 ^= -1078305129;
            var17_14 = -var15_13 * var9_6;
            var19_15 = var13_12 * var9_6;
            var26_20 ^= 291615921;
            var21_16 = new class_243(var2_2.field_1352 + var13_12 * var5_4 - var17_14, var2_2.field_1351, var2_2.field_1350 + var15_13 * var5_4 - var19_15);
            var26_20 ^= -2098749615;
            var22_17 = new class_243(var2_2.field_1352 + var13_12 * var5_4 + var17_14, var2_2.field_1351, var2_2.field_1350 + var15_13 * var5_4 + var19_15);
            var26_20 ^= -118225154;
            ** continue;
            break;
        }
        var27_11 = (var25_10 | var28_9) ^ -645731941;
        block28: while (true) {
            switch (var27_11) {
                case -452667228: {
                    jp.Fi(var0, var1_1, var21_16, var22_17, var23_18, var24_19, var11_7, var12_8, var11_7, var12_8);
                    var27_11 = (var25_10 | var28_9) ^ -1051961778;
                    continue block28;
                }
                case 1779097160: {
                    var26_20 ^= var27_11 ^ -193697589;
                    ** GOTO lbl16
                }
                case -1090223641: {
                    return;
                }
                case -1909247209: {
                    switch (var26_20) {
                        default: {
                            var27_11 = (var25_10 | var28_9) ^ -1719885642;
                            continue block28;
                        }
                        case -753558864: {
                            var27_11 = (var25_10 | var28_9) ^ 979544249;
                            continue block28;
                        }
                        case -658791980: 
                    }
                    var27_11 = (var25_10 | var28_9) ^ 830654746;
                    ** GOTO lbl60
                }
                case -1024149532: {
                    var26_20 ^= var27_11 ^ 2138513165;
                    ** GOTO lbl-1000
                }
                case -1873441953: lbl-1000:
                // 2 sources

                {
                    var27_11 = (var25_10 | var28_9) ^ 2101693929;
                    ** GOTO lbl60
                }
                case 842672304: {
                    var26_20 ^= var27_11 ^ -1029905248;
                    var27_11 = (var25_10 | var28_9) ^ 1282604825;
                }
lbl60:
                // 5 sources

                default: {
                    continue block28;
                }
                case -921381305: {
                    var26_20 ^= var27_11 ^ -1531171417;
                    ** continue;
                }
                case 720672613: 
            }
            var27_11 = (var25_10 | var28_9) ^ 376612442;
        }
        block29: while (true) {
            var27_11 = (var25_10 | var28_9) ^ -1284412711;
lbl70:
            // 2 sources

            block30: while (true) {
                switch (var27_11) {
                    case 1074205735: {
                        if (var12_8 > 0) ** GOTO lbl82
                        ** GOTO lbl91
                    }
                    case -1895583920: {
                        var26_20 ^= var27_11 ^ 1785615925;
                        continue block29;
                    }
                    case -748349201: {
                        var13_12 = Math.cos(var3_3);
                        var15_13 = Math.sin(var3_3);
                        ** continue;
                    }
lbl82:
                    // 1 sources

                    var27_11 = (var25_10 | var28_9) ^ 1478506987;
                    ** GOTO lbl92
                    case -1420409067: {
                        var26_20 ^= var27_11 ^ -343251423;
                        var27_11 = (var25_10 | var28_9) ^ 538142225;
                        ** GOTO lbl92
                    }
                    case -1301583145: {
                        var27_11 = (var25_10 | var28_9) ^ 2088096174;
                        continue block30;
                    }
lbl91:
                    // 1 sources

                    var27_11 = (var25_10 | var28_9) ^ 1022266094;
lbl92:
                    // 5 sources

                    default: {
                        continue block30;
                    }
                    case -812059632: {
                        var26_20 ^= var27_11 ^ -9349422;
                        ** continue;
                    }
                    case -564210621: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void diamond(class_4588 var0, Matrix4f var1_1, class_243 var2_2, class_243 var3_3, double var4_4, int var6_5, int var7_6) {
        block60: {
            var16_7 = -384284638;
            var13_8 = jp.f & -384284638 ^ 1704580457;
            var15_9 = 0;
            ** GOTO lbl159
lbl5:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                var14_14 ^= -1810938136;
                ** continue;
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var15_9 = (var13_8 | var16_7) ^ 640968943;
                ** GOTO lbl39
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var15_9 = (var13_8 | var16_7) ^ -75786688;
                ** GOTO lbl39
                break;
            }
lbl16:
            // 1 sources

            return;
lbl18:
            // 1 sources

            while (true) {
                var14_14 ^= var15_9 ^ -161232155;
                ** GOTO lbl165
                break;
            }
lbl21:
            // 1 sources

            while (true) {
                var14_14 ^= var15_9 ^ -2002193526;
                ** GOTO lbl56
                break;
            }
lbl24:
            // 1 sources

            while (true) {
                var14_14 ^= var15_9 ^ 1512053047;
                ** GOTO lbl122
                break;
            }
            while (true) {
                var15_9 = (var13_8 | var16_7) ^ -1649034174;
                ** GOTO lbl39
                break;
            }
lbl30:
            // 1 sources

            while (true) {
                var11_12 = v0;
                if (true) ** GOTO lbl147
                break;
            }
            block39: while (true) {
                block61: {
                    var15_9 = (var13_8 | var16_7) ^ 546197583;
                    break block61;
lbl36:
                    // 1 sources

                    while (true) {
                        var14_14 ^= var15_9 ^ -1183140856;
                        ** continue;
                        break;
                    }
                }
                block41: while (true) {
                    switch (var15_9) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            default: {
                                continue block41;
                            }
                            break;
                        }
                        case 1062631190: {
                            ** continue;
                        }
lbl47:
                        // 1 sources

                        while (true) {
                            var14_14 ^= var15_9 ^ 1802495804;
                            break block60;
                            break;
                        }
lbl50:
                        // 1 sources

                        while (true) {
                            var14_14 ^= -1570731276;
                            ** GOTO lbl95
                            break;
                        }
lbl53:
                        // 1 sources

                        while (true) {
                            var14_14 ^= var15_9 ^ 1805060989;
                            ** GOTO lbl71
                            break;
                        }
lbl56:
                        // 1 sources

                        var15_9 = (var13_8 | var16_7) ^ 1622508038;
                        ** GOTO lbl132
lbl58:
                        // 9 sources

                        block46: while (true) {
                            block9 : switch (var15_9) lbl-1000:
                            // 4 sources

                            {
                                while (true) {
                                    default: {
                                        continue block46;
                                    }
                                    break;
                                }
                                case -1980259784: {
                                    ** continue;
                                }
                                case -547580846: {
                                    ** continue;
                                }
                                case -823760742: {
                                    ** continue;
                                }
                                case 1453901080: {
                                    ** continue;
                                }
lbl71:
                                // 1 sources

                                var15_9 = (var13_8 | var16_7) ^ 1684963155;
                                ** GOTO lbl-1000
lbl73:
                                // 1 sources

                                while (true) {
                                    var15_9 = (var13_8 | var16_7) ^ 1177021536;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case 1881956649: {
                                    var14_14 ^= var15_9 ^ 52682384;
                                    ** continue;
                                }
                                case -1264275648: {
                                    var14_14 ^= var15_9 ^ -1331870410;
                                    ** GOTO lbl87
                                }
lbl82:
                                // 1 sources

                                return;
lbl84:
                                // 1 sources

                                while (true) {
                                    var12_13 = var11_12.method_1036(var8_10);
                                    break block9;
                                    break;
                                }
lbl87:
                                // 1 sources

                                var15_9 = (var13_8 | var16_7) ^ 416123957;
                                ** continue;
lbl89:
                                // 1 sources

                                while (true) {
                                    var15_9 = (var13_8 | var16_7) ^ -758142339;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case -854094556: {
                                    if (var7_6 > 0) ** continue;
                                    ** continue;
                                }
lbl95:
                                // 1 sources

                                var14_14 ^= -802398646;
                                ** continue;
                                case 1945913071: {
                                    var8_10 = var8_10.method_1021(1.0 / var9_11);
                                    break block46;
                                }
lbl100:
                                // 1 sources

                                while (true) {
                                    var15_9 = (var13_8 | var16_7) ^ -418434993;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case 1489656821: {
                                    var14_14 ^= var15_9 ^ 1659324111;
                                    ** GOTO lbl124
                                }
                            }
                            break;
                        }
                        var15_9 = (var13_8 | var16_7) ^ -1252817250;
                        ** GOTO lbl58
                        {
                            case -1174513344: {
                                var14_14 ^= var15_9 ^ 1015206949;
                                ** continue;
                            }
                        }
                        var15_9 = (var13_8 | var16_7) ^ -2112215563;
                        ** GOTO lbl132
                        while (true) {
                            var15_9 = (var13_8 | var16_7) ^ 851790137;
                            ** GOTO lbl58
                            break;
                        }
                        {
                            case -1413598965: {
                                v0 = new class_243(1.0, 0.0, 0.0);
                                ** GOTO lbl157
                            }
                        }
lbl119:
                        // 1 sources

                        while (true) {
                            var15_9 = (var13_8 | var16_7) ^ 1497199147;
                            ** GOTO lbl58
                            break;
                        }
lbl122:
                        // 1 sources

                        var15_9 = (var13_8 | var16_7) ^ 1762678674;
                        ** GOTO lbl58
lbl124:
                        // 1 sources

                        var15_9 = (var13_8 | var16_7) ^ -594645395;
                        ** GOTO lbl58
lbl126:
                        // 1 sources

                        while (true) {
                            var15_9 = (var13_8 | var16_7) ^ 1416070187;
                            ** GOTO lbl58
                            break;
                        }
                        {
                            case 823636742: {
                                if (!(Math.abs(var8_10.field_1351) > 0.98)) ** continue;
                                ** continue;
                            }
                        }
lbl132:
                        // 4 sources

                        block56: while (true) {
                            switch (var15_9) {
                                default: {
                                    continue block56;
                                }
                                case -1326140227: {
                                    ** continue;
                                }
                                case 1870919838: {
                                    ** continue;
                                }
                                case -97288943: {
                                    ** continue;
                                }
                                ** case -1926471827:
lbl143:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                        case 383929131: {
                            var8_10 = var2_2.method_1020(var3_3);
                            break block39;
                        }
lbl147:
                        // 1 sources

                        var14_14 ^= -240768302;
                        ** continue;
                        case -877808252: {
                            return;
                        }
                        {
                            case -2071360775: {
                                v0 = var8_10.method_1036(new class_243(0.0, 1.0, 0.0)).method_1029();
                                ** GOTO lbl157
                            }
                        }
                        case 177663268: {
                            var14_14 ^= var15_9 ^ -75962131;
                            continue block39;
                        }
lbl157:
                        // 2 sources

                        var14_14 ^= 1497928353;
                        ** continue;
lbl159:
                        // 1 sources

                        var14_14 = (var13_8 | var16_7) ^ 848678645;
                        var15_9 = (var13_8 | var16_7) ^ 1949409300;
                        ** continue;
lbl162:
                        // 1 sources

                        while (true) {
                            var15_9 = (var13_8 | var16_7) ^ 595572209;
                            ** GOTO lbl58
                            break;
                        }
lbl165:
                        // 1 sources

                        var15_9 = (var13_8 | var16_7) ^ 397058170;
                        ** GOTO lbl132
lbl167:
                        // 1 sources

                        while (true) {
                            var15_9 = (var13_8 | var16_7) ^ -1154410381;
                            ** GOTO lbl58
                            break;
                        }
lbl170:
                        // 1 sources

                        while (true) {
                            var9_11 = var8_10.method_1033();
                            ** continue;
                            break;
                        }
                    }
                    break;
                }
                break;
            }
            var14_14 ^= -1543233465;
            ** while (true)
        }
        var15_9 = (var13_8 | var16_7) ^ -1637508220;
        ** while (true)
        {
            ** case -179023522:
        }
lbl179:
        // 1 sources

        ** while (!(var9_11 < 1.0E-4))
lbl180:
        // 1 sources

        ** while (true)
        {
            ** case -1717011073:
        }
lbl182:
        // 1 sources

        ** while (true)
        jp.Fi(var0, var1_1, var2_2.method_1019(var12_13.method_1021(var4_4)), var2_2.method_1019(var11_12.method_1021(var4_4)), var2_2.method_1020(var12_13.method_1021(var4_4)), var2_2.method_1020(var11_12.method_1021(var4_4)), var6_5, var7_6, var6_5, var7_6);
        var15_9 = (var13_8 | var16_7) ^ 1567451606;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static class_243 Fh(class_243 var0, double var1_1, double var3_2) {
        var5_3 = jp.f & -438961315 ^ -34076081;
        var7_4 = 0;
        ** GOTO lbl12
lbl4:
        // 1 sources

        block5: while (true) {
            switch (var7_4) lbl-1000:
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
                    var7_4 = (var5_3 | -438961315) ^ -1429065780;
                    ** GOTO lbl-1000
                    break;
                }
lbl12:
                // 1 sources

                var6_5 = (var5_3 | -438961315) ^ 1923556120;
                var7_4 = (var5_3 | -438961315) ^ 1607701495;
                ** continue;
                case 1462752403: {
                    return new class_243(var0.field_1352 + Math.cos(var1_1) * var3_2, var0.field_1351, var0.field_1350 + Math.sin(var1_1) * var3_2);
                }
                case -1574016856: {
                    break block5;
                }
                case -118722941: {
                    var6_5 ^= var7_4 ^ 769589268;
                    ** continue;
                }
            }
            break;
        }
        var7_4 = (var5_3 | -438961315) ^ 85038556;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void Fi(class_4588 var0, Matrix4f var1_1, class_243 var2_2, class_243 var3_3, class_243 var4_4, class_243 var5_5, int var6_6, int var7_7, int var8_8, int var9_9) {
        block46: {
            var20_10 = 383395955;
            var19_11 = -636090607;
            var16_12 = jp.f & -636090607 ^ 592300328;
            var18_13 = 0;
            var17_14 = (var16_12 | var19_11) ^ -1487941079;
            var18_13 = (var16_12 | var19_11) ^ -71677066;
            break block46;
lbl8:
            // 1 sources

            while (true) {
                var18_13 = (var16_12 | var19_11) ^ -1122630669;
                break block46;
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                var18_13 = (var16_12 | var19_11) ^ -192717975;
                ** GOTO lbl97
                break;
            }
lbl14:
            // 1 sources

            while (true) {
                var18_13 = (var16_12 | var19_11) ^ 1520968216;
                break block46;
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                var18_13 = (var16_12 | var19_11) ^ -4882122;
                ** GOTO lbl97
lbl20:
                // 1 sources

                while (true) {
                    var18_13 = (var16_12 | var19_11) ^ 1547253938;
                    ** GOTO lbl97
                    break;
                }
                break;
            }
lbl23:
            // 1 sources

            while (true) {
                var18_13 = (var16_12 | var19_11) ^ -551260533;
                ** GOTO lbl97
                break;
            }
        }
        block41: while (true) {
            switch (var18_13) {
                case -1888282622: {
                    ** GOTO lbl64
                }
                case -1438177999: {
                    var17_14 ^= var18_13 ^ 75055324;
                    ** break;
                }
                case -119090183: {
                    var17_14 ^= var18_13 ^ 2037856309;
                    ** break;
                }
                case -859033758: {
                    var10_15 = var6_6 >> jp.Fm((var17_14 | var18_13 ^ var20_10) ^ (var18_13 ^ -209361346), (var16_12 | var18_13 ^ var20_10) ^ ((var17_14 | var18_13 ^ var20_10) ^ (var18_13 ^ -1676046976))) & jp.Fm((var17_14 | var18_13 ^ var20_10) ^ (var18_13 ^ -209361359), (var16_12 | var18_13 ^ var20_10) ^ ((var17_14 | var18_13 ^ var20_10) ^ (var18_13 ^ 1717490539)));
                    var11_16 = var6_6 >> jp.Fm((var17_14 | var18_13 ^ var20_10) ^ (var18_13 ^ -209361360), (var16_12 | var18_13 ^ var20_10) ^ ((var17_14 | var18_13 ^ var20_10) ^ (var18_13 ^ 704181874))) & jp.Fm((var17_14 | var18_13 ^ var20_10) ^ (var18_13 ^ -209361357), (var16_12 | var18_13 ^ var20_10) ^ ((var17_14 | var18_13 ^ var20_10) ^ (var18_13 ^ 2131956848)));
                    var12_17 = var6_6 & jp.Fm((var17_14 | var18_13 ^ var20_10) ^ (var18_13 ^ -209361358), (var16_12 | var18_13 ^ var20_10) ^ ((var17_14 | var18_13 ^ var20_10) ^ (var18_13 ^ 155876336)));
                    break block41;
                }
lbl42:
                // 1 sources

                var18_13 = (var16_12 | var19_11) ^ -1077494103;
                ** GOTO lbl76
                case 527593737: {
                    var9_9 = class_3532.method_15340((int)var9_9, (int)0, (int)jp.Fm((var17_14 | var18_13 ^ -983271912) ^ (var18_13 ^ 68917464), (var16_12 | var18_13 ^ -983271912) ^ ((var17_14 | var18_13 ^ -983271912) ^ (var18_13 ^ 435657959))));
                    var18_13 = (var16_12 | var19_11) ^ -1177265550;
                    ** GOTO lbl76
                }
                case 1116443979: {
                    var17_14 ^= var18_13 ^ -1530993808;
                    ** continue;
                }
                case 1179241674: {
                    return;
                }
                case 1913845782: {
                    var17_14 ^= var18_13 ^ -1174328399;
                    ** GOTO lbl62
                }
lbl56:
                // 1 sources

                var18_13 = (var16_12 | var19_11) ^ -466764240;
                continue block41;
                case 602325277: {
                    if (var9_9 != 0) ** GOTO lbl78
                    var18_13 = (var16_12 | var19_11) ^ 1639460822;
                    ** GOTO lbl76
                }
lbl62:
                // 1 sources

                var18_13 = (var16_12 | var19_11) ^ 932438107;
                continue block41;
lbl64:
                // 1 sources

                var18_13 = (var16_12 | var19_11) ^ -658960860;
                continue block41;
                case 15041615: {
                    ** GOTO lbl71
                }
                case -1696079633: {
                    var17_14 ^= var18_13 ^ -381322514;
                    ** continue;
                }
lbl71:
                // 1 sources

                var18_13 = (var16_12 | var19_11) ^ 1360587272;
                continue block41;
                case -1577587423: {
                    if (var7_7 != 0) ** GOTO lbl78
                    var18_13 = (var16_12 | var19_11) ^ 1949095739;
                }
lbl76:
                // 5 sources

                default: {
                    continue block41;
                }
lbl78:
                // 2 sources

                var18_13 = (var16_12 | var19_11) ^ -1991428305;
                continue block41;
                case 1150906768: 
            }
            var7_7 = class_3532.method_15340((int)var7_7, (int)0, (int)jp.Fm((var17_14 | var18_13 ^ -1634765183) ^ (var18_13 ^ 1584492686), (var16_12 | var18_13 ^ -1634765183) ^ ((var17_14 | var18_13 ^ -1634765183) ^ (var18_13 ^ 905723817))));
            var18_13 = (var16_12 | var19_11) ^ 62463168;
        }
        var13_18 = var8_8 >> jp.Fm(((var17_14 ^= 1945726254) | var19_11) ^ 513810809, (var16_12 | var19_11) ^ ((var17_14 | var19_11) ^ 178797120)) & jp.Fm((var17_14 | var19_11) ^ 513810808, (var16_12 | var19_11) ^ ((var17_14 | var19_11) ^ 156431961));
        var14_19 = var8_8 >> jp.Fm((var17_14 | var19_11) ^ 513810811, (var16_12 | var19_11) ^ ((var17_14 | var19_11) ^ 869956412)) & jp.Fm((var17_14 | var19_11) ^ 513810810, (var16_12 | var19_11) ^ ((var17_14 | var19_11) ^ -1694558128));
        var15_20 = var8_8 & jp.Fm((var17_14 | var19_11) ^ 513810789, (var16_12 | var19_11) ^ ((var17_14 | var19_11) ^ 642403209));
        var18_13 = (var16_12 | var19_11) ^ -706149037;
        ** GOTO lbl97
lbl89:
        // 1 sources

        while (true) {
            var18_13 = (var16_12 | var19_11) ^ -1640965337;
            if (true) ** GOTO lbl97
            break;
        }
        block43: while (true) {
            var18_13 = (var16_12 | var19_11) ^ -1911729580;
            if (true) ** GOTO lbl97
            block44: while (true) {
                var18_13 = (var16_12 | var19_11) ^ -964715584;
lbl97:
                // 8 sources

                block45: while (true) {
                    switch (var18_13) {
                        case -874292357: {
                            var17_14 ^= var18_13 ^ 2034799210;
                            ** continue;
                        }
                        case 783731306: {
                            var17_14 ^= var18_13 ^ -1458851854;
                            ** continue;
                        }
                        case -1073909096: {
                            var17_14 ^= var18_13 ^ -523964955;
                            ** GOTO lbl153
                        }
                        case -2018101408: {
                            var17_14 ^= var18_13 ^ -726671017;
                            ** continue;
                        }
                        case 1569473413: {
                            jp.vertex(var0, var1_1, var2_2, var10_15, var11_16, var12_17, var7_7);
                            ** break;
                        }
                        case 1701778462: {
                            jp.vertex(var0, var1_1, var5_5, var13_18, var14_19, var15_20, var9_9);
                            var18_13 = (var16_12 | var19_11) ^ -874612777;
                            continue block45;
                        }
                        case 612082098: {
                            jp.vertex(var0, var1_1, var4_4, var13_18, var14_19, var15_20, var9_9);
                            ** continue;
                        }
                        case 1968348525: {
                            var17_14 ^= var18_13 ^ -146101147;
                            ** GOTO lbl151
                        }
                        case 847491225: {
                            jp.vertex(var0, var1_1, var3_3, var10_15, var11_16, var12_17, var7_7);
                            var18_13 = (var16_12 | var19_11) ^ 2095708249;
                            continue block45;
                        }
                        case 303881120: {
                            return;
                        }
                        case -1486424181: {
                            jp.vertex(var0, var1_1, var4_4, var13_18, var14_19, var15_20, var9_9);
                            ** break;
                        }
                        case 813807854: {
                            var17_14 ^= var18_13 ^ 823341122;
                            ** continue;
                        }
                        case -966729594: {
                            var17_14 ^= var18_13 ^ -1517123722;
                            continue block44;
                        }
                        case 68969039: {
                            var17_14 ^= var18_13 ^ -1279464703;
                            ** GOTO lbl163
                        }
                        case -1935312759: {
                            jp.vertex(var0, var1_1, var3_3, var10_15, var11_16, var12_17, var7_7);
                            ** GOTO lbl147
                        }
lbl145:
                        // 1 sources

                        var18_13 = (var16_12 | var19_11) ^ 1027551167;
                        continue block45;
lbl147:
                        // 1 sources

                        var18_13 = (var16_12 | var19_11) ^ 1151516065;
                        continue block45;
lbl149:
                        // 1 sources

                        var18_13 = (var16_12 | var19_11) ^ -12341898;
                        continue block45;
lbl151:
                        // 1 sources

                        var18_13 = (var16_12 | var19_11) ^ -908296288;
                        continue block45;
lbl153:
                        // 1 sources

                        var18_13 = (var16_12 | var19_11) ^ -1496085316;
                        continue block45;
                        case 266114128: {
                            jp.vertex(var0, var1_1, var2_2, var10_15, var11_16, var12_17, var7_7);
                            continue block43;
                        }
                        case 1025529081: {
                            jp.vertex(var0, var1_1, var5_5, var13_18, var14_19, var15_20, var9_9);
                            var18_13 = (var16_12 | var19_11) ^ 817665090;
                        }
                        default: {
                            continue block45;
                        }
lbl163:
                        // 1 sources

                        var18_13 = (var16_12 | var19_11) ^ -381479783;
                        continue block45;
                        case 82464271: 
                    }
                    var17_14 ^= var18_13 ^ -154358739;
                    var18_13 = (var16_12 | var19_11) ^ 2012919728;
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void vertex(class_4588 var0, Matrix4f var1_1, class_243 var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        block13: {
            block14: {
                break block14;
lbl1:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
lbl3:
                // 1 sources

                while (true) {
                    var9_9 = (var7_8 | var10_7) ^ 170006448;
                    break block13;
lbl6:
                    // 1 sources

                    while (true) {
                        var8_10 ^= var9_9 ^ 1697558364;
                        var9_9 = (var7_8 | var10_7) ^ 696471297;
                        break block13;
                        break;
                    }
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var9_9 = (var7_8 | var10_7) ^ -776234246;
                    break block13;
                    break;
                }
lbl13:
                // 1 sources

                return;
            }
            var10_7 = -1414322490;
            var7_8 = jp.f & -1414322490 ^ -1791193103;
            var9_9 = 0;
            var8_10 = (var7_8 | var10_7) ^ -514888884;
            ** while (true)
        }
lbl22:
        // 2 sources

        block12: while (true) {
            switch (var9_9) {
                default: {
                    continue block12;
                }
                case -1774395146: {
                    ** continue;
                }
                case 1845769485: {
                    break;
                }
                case 2086089381: {
                    ** continue;
                }
                case -1247954873: {
                    ** continue;
                }
            }
            var9_9 = (var7_8 | var10_7) ^ -1008165550;
            continue;
            break;
        }
        var0.method_22918((Matrix4fc)var1_1, (float)var2_2.field_1352, (float)var2_2.field_1351, (float)var2_2.field_1350).method_1336(var3_3, var4_4, var5_5, var6_6);
        var9_9 = (var7_8 | var10_7) ^ -458352525;
        ** while (true)
        {
            ** case 1527887748:
        }
lbl41:
        // 1 sources

        var8_10 ^= var9_9 ^ 565829800;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    static {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [49[UNCONDITIONALDOLOOP], 0[SWITCH], 51[UNCONDITIONALDOLOOP]], but top level block is 16[SWITCH]
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
     */
    public boolean shouldRenderNvg(class_310 var1_1) {
        block42: {
            block41: {
                block40: {
                    block45: {
                        block43: {
                            block44: {
                                block46: {
                                    break block45;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        v0 = true;
                                        break block40;
                                        break;
                                    }
lbl4:
                                    // 1 sources

                                    block24: while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ -1058666241;
lbl6:
                                        // 15 sources

                                        block25: while (true) {
                                            switch (var4_4) lbl-1000:
                                            // 7 sources

                                            {
                                                while (true) {
                                                    default: {
                                                        continue block25;
                                                    }
                                                    break;
                                                }
                                                case -1310223238: {
                                                    ** continue;
                                                }
lbl13:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ 50190304;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case -1604898537: {
                                                    if (!this.a) break;
                                                    break;
                                                }
                                                case 242214450: {
                                                    if (!((Boolean)this.b.getValue()).booleanValue()) break;
                                                    break block41;
                                                }
lbl22:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ 2059401944;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
lbl25:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ 911624346;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
lbl28:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ 1558777828;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case 536186341: {
                                                    break;
                                                }
                                                case 28541286: {
                                                    if (!hJ.ok()) break;
                                                    break block42;
                                                }
                                                case -577473341: {
                                                    break block24;
                                                }
lbl38:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ -726027758;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case 24926167: {
                                                    if (var1_1.field_1755 == null) break block43;
                                                    break block44;
                                                }
lbl44:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ 1575245138;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    var4_4 = (var2_3 | var5_2) ^ 248423950;
                                    ** GOTO lbl6
                                    {
                                        case -1825180845: {
                                            if (!this.isEnabled()) break;
                                            break;
                                        }
                                    }
lbl52:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ -828331168;
                                        ** GOTO lbl6
                                        break;
                                    }
lbl55:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ 1871433120;
                                        ** GOTO lbl6
                                        break;
                                    }
                                    {
                                        case -779607989: {
                                            var3_5 ^= var4_4 ^ 780911655;
                                            break block46;
                                        }
                                        case -860944877: {
                                            ** continue;
                                        }
                                        case -1251801489: {
                                            v0 = false;
                                            break block40;
                                        }
                                    }
                                    var4_4 = (var2_3 | var5_2) ^ -1045226875;
                                    ** GOTO lbl6
                                }
                                var4_4 = (var2_3 | var5_2) ^ 2117822669;
                                ** GOTO lbl6
lbl71:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ -329798318;
                                    ** GOTO lbl6
                                    break;
                                }
                            }
                            var4_4 = (var2_3 | var5_2) ^ 306743412;
                            ** GOTO lbl6
                        }
lbl78:
                        // 2 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 508878076;
                            ** GOTO lbl6
                            break;
                        }
lbl81:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -831554095;
                            ** GOTO lbl6
                            break;
                        }
                        {
                            case 459624101: {
                                var3_5 ^= var4_4 ^ -333056925;
                                ** continue;
                            }
                            case -1055761735: {
                                if (!(var1_1.field_1755 instanceof class_408)) break;
                                ** continue;
                            }
                        }
                    }
                    var5_2 = -892830538;
                    var2_3 = jp.f & -892830538 ^ -1889743691;
                    var4_4 = 0;
                    var3_5 = (var2_3 | var5_2) ^ 205992469;
                    ** while (true)
                    {
                        case -1841780251: {
                            ** continue;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ -1784414790;
                    ** GOTO lbl6
                    {
                        case -108350419: {
                            ** continue;
                        }
                        case -853464233: {
                            ** continue;
                        }
                        case 1518272781: {
                            ** continue;
                        }
                    }
lbl106:
                    // 1 sources

                    return v0;
                }
                var3_5 ^= 471188080;
                ** while (true)
            }
            var4_4 = (var2_3 | var5_2) ^ 408906045;
            ** GOTO lbl6
            {
                case 1854836917: {
                    var3_5 ^= var4_4 ^ -1853000487;
                    ** continue;
                }
            }
lbl117:
            // 7 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -1588433918;
                ** GOTO lbl6
                break;
            }
            {
                case 596333029: {
                    if (var1_1.field_1687 == null) break;
                    ** continue;
                }
                case -679242358: {
                    ** continue;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ 57932452;
            ** GOTO lbl6
            {
                ** case 255521864:
            }
lbl128:
            // 1 sources

            if (var1_1.field_1724 != null) ** break;
            ** while (true)
            ** while (true)
        }
        var4_4 = (var2_3 | var5_2) ^ -802590382;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void renderNvg(W var1_1, class_310 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [127[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static boolean Fj(class_310 var0, W var1_2, double var2_3, double var4_4, double var6_5, float[] var8_1) {
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
    private static NVGColor Fk(int var0, int var1_1) {
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
    private int Fl(double var1_1) {
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

    private static int Fm(int n2, int n3) {
        int n4 = 1528408758;
        int n5 = 187567480;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xBBE9D118)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x5B3FFCEF;
        n6 += (n5 | n4) ^ 0x5B3F5279;
        n6 += (n5 | n4) ^ 0x5B3F108D;
        n6 -= (n5 | n4) ^ 0x5B3F3F23;
        n6 ^= (n5 | n4) ^ 0x5B3F9C9D;
        n6 -= (n5 | n4) ^ 0x5B3FC59B;
        n6 -= (n5 | n4) ^ 0x5B3FA27F;
        n6 += (n5 | n4) ^ 0x5B3F65B5;
        return n6 ^= (n5 | n4) ^ 0x5B3F9772;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int Fn(int n2, int n3, float f2) {
        int n4 = -190494440;
        int n5 = -841990875;
        int n6 = f & 0xCDD03D25 ^ 0xD85EA10F;
        int n7 = 0;
        int n8 = (n6 | n5) ^ 0x94854A76;
        n7 = (n6 | n5) ^ 0x115852A8;
        block5: while (true) {
            switch (n7) {
                default: {
                    continue block5;
                }
                case 1057759312: {
                    n8 ^= n7 ^ 0x3339BB54;
                    n7 = (n6 | n5) ^ 0xE4ABC912;
                    continue block5;
                }
                case -863572089: {
                    n7 = (n6 | n5) ^ 0xE2D29D7F;
                    continue block5;
                }
                case 963998781: 
            }
            break;
        }
        int n9 = class_3532.method_48781((float)f2, (int)(n2 >> jp.Fm((n8 | n7 ^ n4) ^ (n7 ^ 0x145D77BB), (n6 | n7 ^ n4) ^ ((n8 | n7 ^ n4) ^ (n7 ^ 0xC98F9D95))) & jp.Fm((n8 | n7 ^ n4) ^ (n7 ^ 0x145D77B8), (n6 | n7 ^ n4) ^ ((n8 | n7 ^ n4) ^ (n7 ^ 0xD24321BE)))), (int)(n3 >> jp.Fm((n8 | n7 ^ n4) ^ (n7 ^ 0x145D77B9), (n6 | n7 ^ n4) ^ ((n8 | n7 ^ n4) ^ (n7 ^ 0xD52AC651))) & jp.Fm((n8 | n7 ^ n4) ^ (n7 ^ 0x145D7786), (n6 | n7 ^ n4) ^ ((n8 | n7 ^ n4) ^ (n7 ^ 0x1118EA8D)))));
        int n10 = class_3532.method_48781((float)f2, (int)(n2 >> jp.Fm(((n8 ^= 0x9B6DA54D) | n5) ^ 0x3F0583F2, (n6 | n5) ^ ((n8 | n5) ^ 0xF752448B)) & jp.Fm((n8 | n5) ^ 0x3F0583F1, (n6 | n5) ^ ((n8 | n5) ^ 0xD57497A))), (int)(n3 >> jp.Fm((n8 | n5) ^ 0x3F0583F0, (n6 | n5) ^ ((n8 | n5) ^ 0xD2778AB7)) & jp.Fm((n8 | n5) ^ 0x3F0583F7, (n6 | n5) ^ ((n8 | n5) ^ 0xBA1C6343))));
        int n11 = class_3532.method_48781((float)f2, (int)(n2 & jp.Fm(((n8 ^= 0x68E1A937) | n5) ^ 0x1F2403E4, (n6 | n5) ^ ((n8 | n5) ^ 0x4ED04216))), (int)(n3 & jp.Fm((n8 | n5) ^ 0x1F2403E7, (n6 | n5) ^ ((n8 | n5) ^ 0x5899A390))));
        return n9 << jp.Fm(((n8 ^= 0xAE8189A4) | n5) ^ 0x3D258366, (n6 | n5) ^ ((n8 | n5) ^ 0x67081426)) | n10 << jp.Fm((n8 | n5) ^ 0x3D258369, (n6 | n5) ^ ((n8 | n5) ^ 0xF0BA4702)) | n11;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double Fo(double d2) {
        int n2 = f & 0x3C2CC867 ^ 0xE38597A3;
        int n3 = 0;
        int n4 = (n2 | 0x3C2CC867) ^ 0xAC7D058;
        n3 = (n2 | 0x3C2CC867) ^ 0x6750F0C1;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1728237786: {
                    n3 = (n2 | 0x3C2CC867) ^ 0x74FC9A4E;
                    continue block5;
                }
                case 320893343: {
                    double d3 = 1.0 - d2;
                    n4 ^= 0x2CDBEEA8;
                    return 1.0 - d3 * d3 * d3;
                }
                case -1957608023: 
            }
            n4 ^= n3 ^ 0x8AF0C4E1;
            n3 = (n2 | 0x3C2CC867) ^ 0xEC8DAE78;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static double Fp(double d2) {
        int n2 = f & 0x9D9F2DAA ^ 0xDB5523CB;
        int n3 = 0;
        int n4 = (n2 | 0x9D9F2DAA) ^ 0x4966802D;
        n3 = (n2 | 0x9D9F2DAA) ^ 0x4B7A7C68;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1304254800: {
                    double d3 = 1.70158;
                    n4 ^= 0x8E5F4FC0;
                    double d4 = d3 + 1.0;
                    n4 ^= 0xA0506968;
                    double d5 = d2 - 1.0;
                    n4 ^= 0x9B8A3799;
                    return 1.0 + d4 * d5 * d5 * d5 + d3 * d5 * d5;
                }
                case -1801104509: {
                    n3 = (n2 | 0x9D9F2DAA) ^ 0x474F775B;
                    continue block5;
                }
                case -1735370576: 
            }
            n4 ^= n3 ^ 0x939B5FF7;
            n3 = (n2 | 0x9D9F2DAA) ^ 0x6D9D895B;
        }
    }
}

