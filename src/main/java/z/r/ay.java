/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_4588
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1309;
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
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class ay
extends gF {
    private double a;
    private static final /* synthetic */ String a;
    private double b;
    private static final /* synthetic */ String s;
    public static final int e;
    private static final /* synthetic */ String b;
    private final ke a;
    private static final /* synthetic */ String c;
    private double c;
    private class_1309 a;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final double d;
    private static final /* synthetic */ String k;
    private final az a;
    private static final /* synthetic */ String f;
    private long a;
    private static final double e;
    private static final /* synthetic */ String g;
    private static final double f;
    private static final /* synthetic */ String h;
    private static final int a;
    private static final int b;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String l;
    private final gP a;
    private static final double g;
    private static final double h;
    private static final int[] a;
    private final ke b;
    private static final int c;
    private static final double i;
    private final aE a;
    private static final /* synthetic */ String m;
    private static final double j;
    private static final double k;
    private final gP b;
    private static final int d;
    private static final /* synthetic */ String n;
    private final gP c;
    private static final /* synthetic */ String o;
    private double l;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private final gP d;
    private static final double m;
    private static final /* synthetic */ String t;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ay() {
        var4_1 = 863557406;
        var1_2 = ay.e & 863557406 ^ 667838240;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -1470753194;
        var2_4 ^= 1057819199;
        super(ay.k, ay.s, dA.l);
        var3_3 = (var1_2 | var4_1) ^ -209265847;
        if (true) ** GOTO lbl131
        block31: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 503657850;
            if (true) ** GOTO lbl14
            block32: while (true) {
                var3_3 = (var1_2 | var4_1) ^ -309403114;
lbl14:
                // 2 sources

                block33: while (true) {
                    switch (var3_3) {
                        case -1962432696: {
                            ** break;
                        }
                        case 1166182919: {
                            ** break;
                        }
                        case -998757257: {
                            var2_4 ^= var3_3 ^ -2062425107;
                            var3_3 = (var1_2 | var4_1) ^ -1084256237;
                            continue block33;
                        }
                        case 901962260: {
                            ** GOTO lbl75
                        }
                        case 2137093312: {
                            ** GOTO lbl63
                        }
                        case -1842031639: {
                            ** GOTO lbl102
                        }
lbl30:
                        // 1 sources

                        var2_4 ^= 1053645821;
                        var2_4 ^= 1612512136;
                        this.b = this.addSetting(new gP(ay.t, 1.0f, 0.1f, 3.0f, 0.1f, ay.o).description(ay.b));
                        continue block32;
lbl34:
                        // 1 sources

                        switch (var2_4) {
                            case 1448232711: {
                                var3_3 = (var1_2 | var4_1) ^ -1773319746;
                                break;
                            }
                            case -350605952: {
                                var2_4 ^= var3_3 ^ 1794817956;
                                ** GOTO lbl113
                            }
                            case -679472197: {
                                var2_4 ^= var3_3 ^ -952495883;
                                continue block31;
                            }
                            case -938124491: {
                                var2_4 ^= var3_3 ^ -1676264164;
                                var3_3 = (var1_2 | var4_1) ^ 175076019;
                                break;
                            }
                            case -749900628: {
                                var2_4 ^= var3_3 ^ -1462619571;
                                var3_3 = (var1_2 | var4_1) ^ -2077814040;
                                break;
                            }
                            case 239106524: {
                                var2_4 ^= var3_3 ^ 1890314395;
                                var3_3 = (var1_2 | var4_1) ^ 102047028;
                                break;
                            }
                            case 2144460509: {
                                var3_3 = (var1_2 | var4_1) ^ -55936938;
                                break;
                            }
                            case 1032947085: {
                                this.a = this.addSetting(new ke(ay.h, true));
                                var3_3 = (var1_2 | var4_1) ^ -41385885;
                                break;
                            }
lbl63:
                            // 1 sources

                            var2_4 ^= -311346505;
                            var2_4 ^= 148684548;
                            ** GOTO lbl120
                            case 704365124: {
                                this.b = this.addSetting(new ke(ay.j, false));
                                ** GOTO lbl73
                            }
                            case -630188760: {
                                var2_4 ^= var3_3 ^ 116249410;
                                var3_3 = (var1_2 | var4_1) ^ 1218413566;
                                break;
                            }
lbl73:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -457991278;
                            break;
lbl75:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -1513478953;
                            break;
                            case -337896897: {
                                var2_4 ^= var3_3 ^ 1552624796;
                                var3_3 = (var1_2 | var4_1) ^ -1124511626;
                                break;
                            }
                            case -1277565482: {
                                ** GOTO lbl115
                            }
                            case -898205859: {
                                var2_4 ^= var3_3 ^ 622038419;
                                var3_3 = (var1_2 | var4_1) ^ -426895063;
                                break;
                            }
                            case -95187628: {
                                ** GOTO lbl125
                            }
                            case -1401350873: {
                                this.a = this.addSetting(new az(ay.d, ay.qP((var2_4 | var3_3 ^ -1627274695) ^ (var3_3 ^ 862582242), (var1_2 | var3_3 ^ -1627274695) ^ ((var2_4 | var3_3 ^ -1627274695) ^ (var3_3 ^ 1365545860)))));
                                var3_3 = (var1_2 | var4_1) ^ -528554875;
                                break;
                            }
                            case -781128169: {
                                this.a.description(ay.e);
                                var3_3 = (var1_2 | var4_1) ^ 968789730;
                                break;
                            }
                            default: {
                                var3_3 = (var1_2 | var4_1) ^ -588981570;
                                break;
                            }
                        }
                        ** GOTO lbl131
lbl102:
                        // 1 sources

                        var2_4 ^= 231402146;
                        var2_4 ^= 220451730;
                        this.a = this.addSetting(new gP(ay.i, 1.0f, 0.4f, 2.5f, 0.05f, ay.q).description(ay.l));
                        var3_3 = (var1_2 | var4_1) ^ -601690879;
                        ** GOTO lbl131
                        case -1739325358: {
                            var2_4 ^= var3_3 ^ -1108797435;
                            var3_3 = (var1_2 | var4_1) ^ -1685593575;
                            ** GOTO lbl131
                        }
                        case -883650712: {
                            var2_4 ^= var3_3 ^ 1902864352;
lbl113:
                            // 2 sources

                            var3_3 = (var1_2 | var4_1) ^ 37498154;
                            ** GOTO lbl131
                        }
lbl115:
                        // 1 sources

                        var2_4 ^= -1537958405;
                        var2_4 ^= 731669770;
                        this.c = this.addSetting(new gP(ay.c, 0.16f, 0.0f, 1.0f, 0.02f).description(ay.p));
                        var3_3 = (var1_2 | var4_1) ^ -844268950;
                        ** GOTO lbl131
lbl120:
                        // 1 sources

                        this.d = this.addSetting(new gP(ay.r, 235.0f, 20.0f, 255.0f, 5.0f, ay.m).description(ay.n));
                        var3_3 = (var1_2 | var4_1) ^ -1332213;
                        ** GOTO lbl131
                        case -1582055808: {
                            var2_4 ^= var3_3 ^ 63634357;
lbl125:
                            // 2 sources

                            var3_3 = (var1_2 | var4_1) ^ 1920761145;
                            ** GOTO lbl131
                        }
                        case -2002688211: {
                            var2_4 ^= 1598899993;
                            this.a = this.addSetting(new aE(ay.g, ay.a, new String[]{ay.a, ay.f}));
                            var3_3 = (var1_2 | var4_1) ^ -1347750036;
                        }
lbl131:
                        // 10 sources

                        default: {
                            continue block33;
                        }
                        case 837544458: 
                    }
                    break;
                }
                break;
            }
            break;
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

    private static int qP(int n2, int n3) {
        int n4 = 163751168;
        int n5 = 1685348037;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x499AE09F)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x6DF61DFE;
        n6 -= (n5 | n4) ^ 0x6DF62E00;
        n6 += (n5 | n4) ^ 0x6DF6E56A;
        n6 -= (n5 | n4) ^ 0x6DF6C0AF;
        n6 += (n5 | n4) ^ 0x6DF68290;
        n6 -= (n5 | n4) ^ 0x6DF6A9ED;
        n6 += (n5 | n4) ^ 0x6DF67494;
        return n6 ^= (n5 | n4) ^ 0x6DF60A24;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onEnable() {
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
    public void onDisable() {
        var4_1 = 937112568;
        var1_2 = ay.e & 937112568 ^ 91823735;
        var3_3 = 0;
        ** GOTO lbl26
lbl5:
        // 1 sources

        block7: while (true) {
            switch (var3_3) lbl-1000:
            // 5 sources

            {
                while (true) {
                    default: {
                        continue block7;
                    }
                    break;
                }
                case 1523914467: {
                    ** GOTO lbl15
                }
lbl12:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -675816901;
                    ** GOTO lbl-1000
                    break;
                }
lbl15:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 1963428254;
                ** GOTO lbl-1000
lbl17:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 528418327;
                    ** GOTO lbl-1000
                    break;
                }
                case 679754216: {
                    var2_4 ^= var3_3 ^ 92026504;
                    ** continue;
                }
lbl23:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -19025238;
                    ** continue;
                    break;
                }
lbl26:
                // 1 sources

                var2_4 = (var1_2 | var4_1) ^ 1986714009;
                break block7;
                case 1123858017: {
                    var2_4 ^= var3_3 ^ 1682433679;
                    ** continue;
                }
                case -920220331: {
                    this.qQ();
                    ** continue;
                }
                case -531831356: {
                    return;
                }
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ 1831741724;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void qQ() {
        int n2 = -161114388;
        int n3 = e & 0xF66596EC ^ 0x2A7F8BEB;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xEDC199F3;
        n4 = (n3 | n2) ^ 0x5CC58D71;
        block13: while (true) {
            switch (n4) {
                default: {
                    continue block13;
                }
                case -710564882: {
                    this.c = 0.0;
                    n4 = (n3 | n2) ^ 0x9AB69123;
                    continue block13;
                }
                case 1690898124: {
                    n5 ^= n4 ^ 0xD7561543;
                    n4 = (n3 | n2) ^ 0x1D6AF869;
                    continue block13;
                }
                case 774953165: {
                    this.l = 0.0;
                    n4 = (n3 | n2) ^ 0x41F3ADE;
                    continue block13;
                }
                case -600197450: {
                    return;
                }
                case -1165038570: {
                    this.a = null;
                    n4 = (n3 | n2) ^ 0xB4313947;
                    continue block13;
                }
                case -485136506: {
                    this.a = 0L;
                    n4 = (n3 | n2) ^ 0xB4892207;
                    continue block13;
                }
                case 1246668456: {
                    n5 ^= n4 ^ 0x7E42FDEE;
                    n4 = (n3 | n2) ^ 0xD04F4722;
                    continue block13;
                }
                case 1455686305: {
                    n5 ^= n4 ^ 0x17FBCFC4;
                    n4 = (n3 | n2) ^ 0x44F173F9;
                    continue block13;
                }
                case -94329551: {
                    n5 ^= n4 ^ 0xC3B2014;
                    n4 = (n3 | n2) ^ 0x2BDA3C01;
                    continue block13;
                }
                case 1257684456: {
                    n5 ^= n4 ^ 0x1BCE3F77;
                    n4 = (n3 | n2) ^ 0x22462959;
                    continue block13;
                }
                case -1564863842: 
            }
            n4 = (n3 | n2) ^ 0xA8BB9D4E;
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
    private class_1309 qR(class_310 var1_1) {
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
    private void qS(class_4588 var1_1, Matrix4f var2_2, class_243 var3_3, class_243 var4_4) {
        block52: {
            var34_5 = 97929485;
            var31_6 = ay.e & 97929485 ^ -309452900;
            var33_7 = 0;
            var32_25 = (var31_6 | var34_5) ^ 570919566;
            var33_7 = (var31_6 | var34_5) ^ 1171411456;
            if (true) ** GOTO lbl168
lbl7:
            // 1 sources

            while (true) {
                var32_25 ^= 2136709945;
                var19_17 = Math.sin(var17_16) * var10_11;
                var32_25 ^= -603588675;
                var21_18 = Math.cos(var17_16) * var10_11;
                var32_25 ^= -1393750624;
                var23_19 = 0.1 + var7_9 * Math.abs(Math.sin(var16_15));
                var32_25 ^= -1230023293;
                var25_20 = var4_4.method_1031(var19_17, var23_19, var21_18);
                var32_25 ^= -1402796295;
                var26_21 = var9_10.method_1020(var25_20);
                var32_25 ^= -1300646419;
                var27_22 = var26_21.method_1033();
                var33_7 = (var31_6 | var34_5) ^ 61146725;
                break block52;
                break;
            }
lbl22:
            // 1 sources

            while (true) {
                var9_10 = var4_4.method_1031(0.0, var7_9 / 2.0, 0.0);
                var32_25 ^= -337036441;
                var10_11 = var5_8 * (1.2 - 0.5 * this.c);
                var32_25 ^= 1105392594;
                var12_12 = 0.1 * (double)((Float)this.a.getValue()).floatValue();
                var32_25 ^= 1645893741;
                var14_13 = this.alpha(1.0);
                var32_25 ^= -1201504669;
                var15_14 = this.alpha(0.2);
                var32_25 ^= -721028614;
                var16_15 = 0;
                if (true) ** GOTO lbl91
                break;
            }
lbl35:
            // 1 sources

            while (true) {
                var7_9 = this.a.method_17682();
                var32_25 ^= -524066873;
                ** continue;
                break;
            }
lbl39:
            // 1 sources

            block41: while (true) {
                block53: {
                    switch (var33_7) {
                        case 931491379: {
                            var32_25 ^= var33_7 ^ -1253660492;
                            ** break;
                        }
                        case 1263778692: {
                            var32_25 ^= var33_7 ^ 356902724;
                            ** GOTO lbl62
                        }
                        case -2097137364: {
                            var17_16 = Math.toRadians((double)var16_15 + this.a);
                            ** continue;
                        }
                        case 1156057878: {
                            var32_25 ^= var33_7 ^ 442402131;
                            var33_7 = (var31_6 | var34_5) ^ 1860069041;
                            ** break;
                        }
lbl54:
                        // 1 sources

                        var33_7 = (var31_6 | var34_5) ^ 1321427227;
                        continue block41;
                        case -1558364538: {
                            if (var16_15 >= ay.qP((var32_25 | var33_7 ^ -1496615029) ^ (var33_7 ^ -2002363872), (var31_6 | var33_7 ^ -1496615029) ^ ((var32_25 | var33_7 ^ -1496615029) ^ (var33_7 ^ -2086318490)))) break block53;
                            var33_7 = (var31_6 | var34_5) ^ -1456057205;
                        }
lbl59:
                        // 3 sources

                        default: {
                            continue block41;
                        }
                        {
                        }
lbl62:
                        // 1 sources

                        var33_7 = (var31_6 | var34_5) ^ 1000357222;
                        continue block41;
                        case -696360197: 
                    }
                    return;
                }
                var33_7 = (var31_6 | var34_5) ^ -1500650471;
                continue;
                break;
            }
            while (true) {
                var33_7 = (var31_6 | var34_5) ^ -1063567479;
                break block52;
                break;
            }
            block43: while (true) {
                block8 : switch (var33_7) {
                    case -1460492772: {
                        var16_15 += 20;
                        ** break;
                    }
                    case -1959816416: {
                        var32_25 ^= var33_7 ^ 666535761;
                        ** GOTO lbl101
                    }
                    case 1837304314: {
                        var32_25 ^= var33_7 ^ 441166022;
                        ** GOTO lbl-1000
                    }
                    case -1380392862: {
                        ay.qV(var1_1, var2_2, var25_20, var3_3, var12_12 * 5.0, var30_24, var15_14);
                        var33_7 = (var31_6 | var34_5) ^ -60931387;
                        break;
                    }
                    case -524459991: {
                        ay.qU(var1_1, var2_2, var25_20, var29_23, var12_12, var30_24, var14_13);
                        var33_7 = (var31_6 | var34_5) ^ -543012914;
                        break;
                    }
lbl91:
                    // 2 sources

                    var33_7 = (var31_6 | var34_5) ^ -631557714;
                    ** continue;
                    case 293608792: lbl-1000:
                    // 2 sources

                    {
                        var33_7 = (var31_6 | var34_5) ^ -1526539824;
                        break;
                    }
                    case 153754984: {
                        var33_7 = (var31_6 | var34_5) ^ 1160575361;
                        break;
                    }
                    case 1510361601: {
                        var32_25 ^= var33_7 ^ 1146401962;
lbl101:
                        // 2 sources

                        var33_7 = (var31_6 | var34_5) ^ -453754123;
                        break;
                    }
                    case 620740177: {
                        var32_25 ^= var33_7 ^ -2015140766;
                        var33_7 = (var31_6 | var34_5) ^ 224608180;
                        break;
                    }
                    case 846993491: {
                        var32_25 ^= var33_7 ^ -1562207332;
                        var33_7 = (var31_6 | var34_5) ^ 1080475647;
                        break;
                    }
                    case 1222411853: {
                        switch (var32_25) {
                            default: {
                                var33_7 = (var31_6 | var34_5) ^ 1727122621;
                                break block8;
                            }
                            case -563884546: {
                                var33_7 = (var31_6 | var34_5) ^ -2141366681;
                                break block8;
                            }
                            case -1769731363: {
                                var33_7 = (var31_6 | var34_5) ^ -1210575460;
                                continue block43;
                            }
                        }
                    }
                }
lbl122:
                // 11 sources

            }
lbl123:
            // 1 sources

            while (true) {
                var29_23 = v0;
                var32_25 ^= 679152880;
                var30_24 = this.qX((double)var16_15 / 360.0);
                var33_7 = (var31_6 | var34_5) ^ -920526388;
                ** GOTO lbl122
                break;
            }
lbl129:
            // 1 sources

            while (true) {
                var5_8 = (double)this.a.method_17681() * 1.5 * (double)((Float)this.a.getValue()).floatValue();
                var32_25 ^= 632949879;
                ** continue;
                break;
            }
        }
        block47: while (true) {
            block54: {
                switch (var33_7) {
                    case 1358547731: {
                        if (!(var27_22 < 1.0E-4)) ** continue;
                        ** break;
                    }
                    case 759521300: {
                        var32_25 ^= var33_7 ^ -1885338482;
                        break block54;
                    }
                    case -831463850: {
                        var32_25 ^= var33_7 ^ 1821752012;
                        ** GOTO lbl154
                    }
                    case -841327136: {
                        v0 = new class_243(0.0, 1.0, 0.0);
                        break block47;
                    }
lbl148:
                    // 1 sources

                    var33_7 = (var31_6 | var34_5) ^ 598639051;
                    default: {
                        continue block47;
                    }
                    case -293905928: {
                        var32_25 ^= var33_7 ^ 700960021;
                        ** GOTO lbl156
                    }
lbl154:
                    // 1 sources

                    var33_7 = (var31_6 | var34_5) ^ 537133693;
                    continue block47;
lbl156:
                    // 1 sources

                    var33_7 = (var31_6 | var34_5) ^ -1121479538;
                    continue block47;
                    case -1060449278: 
                }
                v0 = var26_21.method_1021(1.0 / var27_22);
                break;
            }
            var33_7 = (var31_6 | var34_5) ^ 756321183;
        }
        var32_25 ^= 461477025;
        ** while (true)
        block48: while (true) {
            var33_7 = (var31_6 | var34_5) ^ 1746259862;
lbl168:
            // 2 sources

            block49: while (true) {
                switch (var33_7) {
                    default: {
                        continue block49;
                    }
                    case -1475605091: {
                        break;
                    }
                    case 1318866893: {
                        var32_25 ^= var33_7 ^ 1771842137;
                        continue block48;
                    }
                    case -2050256885: {
                        ** continue;
                    }
                }
                var33_7 = (var31_6 | var34_5) ^ -1555951536;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void qT(class_4588 var1_1, Matrix4f var2_2, class_243 var3_3, class_243 var4_4) {
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void qU(class_4588 var0, Matrix4f var1_1, class_243 var2_2, class_243 var3_3, double var4_4, int var6_5, int var7_6) {
        block49: {
            block50: {
                block48: {
                    var19_7 = -1147199034;
                    var16_8 = ay.e & -1147199034 ^ -1888869056;
                    var18_9 = 0;
                    var17_14 = (var16_8 | var19_7) ^ 1466222067;
                    var18_9 = (var16_8 | var19_7) ^ 307405046;
                    ** GOTO lbl88
lbl7:
                    // 1 sources

                    while (true) {
                        var18_9 = (var16_8 | var19_7) ^ 1451383308;
                        ** GOTO lbl114
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        v0[1] = var2_2.method_1019(var9_11.method_1021(var4_4));
                        var17_14 ^= 520045693;
                        v0[2] = var2_2.method_1020(var8_10.method_1021(var4_4));
                        break block48;
                        break;
                    }
                    while (true) {
                        var18_9 = (var16_8 | var19_7) ^ 1085382298;
                        ** GOTO lbl114
                        break;
                    }
                }
                block36: while (true) {
                    switch (var17_14) {
                        default: {
                            var17_14 ^= -2135030993;
                            break block36;
                        }
                        case 1736071930: {
                            var17_14 ^= -1762301675;
                            break block36;
                        }
                        case 633627886: {
                            var17_14 ^= -1112058593;
                            continue block36;
                        }
                    }
                    break;
                }
                v0[3] = var2_2.method_1020(var9_11.method_1021(var4_4));
                var12_15 = v0;
                var17_14 ^= -1517985927;
                var13_16 = 0;
                break block50;
lbl35:
                // 1 sources

                while (true) {
                    var18_9 = (var16_8 | var19_7) ^ 1417949528;
                    ** GOTO lbl49
                    break;
                }
                while (true) {
                    var18_9 = (var16_8 | var19_7) ^ 528528809;
                    ** GOTO lbl49
lbl41:
                    // 1 sources

                    while (true) {
                        var18_9 = (var16_8 | var19_7) ^ -1027399079;
                        if (true) ** GOTO lbl49
                        break;
                    }
                    break;
                }
                block40: while (true) {
                    var18_9 = (var16_8 | var19_7) ^ 1529783153;
                    if (true) ** GOTO lbl49
                    do {
                        var18_9 = (var16_8 | var19_7) ^ -625857066;
lbl49:
                        // 5 sources

                        block42: while (true) {
                            switch (var18_9) {
                                case -1714691171: {
                                    var17_14 ^= var18_9 ^ 734426922;
                                    ** GOTO lbl76
                                }
                                case -1381137104: {
                                    ** GOTO lbl90
                                }
                                case -344255330: {
                                    v1 = var3_3.method_1036(new class_243(0.0, 1.0, 0.0)).method_1029();
                                    ** break;
                                }
                                case 2101086111: {
                                    v1 = new class_243(1.0, 0.0, 0.0);
                                    ** break;
                                }
                                case 1699547152: {
                                    var17_14 ^= var18_9 ^ 1576140267;
                                    ** continue;
                                }
                                case 943669298: {
                                    return;
                                }
lbl67:
                                // 2 sources

                                var17_14 ^= -2061717482;
                                var8_10 = v1;
                                var17_14 ^= -965829497;
                                var9_11 = var8_10.method_1036(var3_3).method_1029();
                                break block40;
                                case -1229637462: {
                                    var17_14 ^= var18_9 ^ 1139809346;
                                    var18_9 = (var16_8 | var19_7) ^ -1486909803;
                                    ** GOTO lbl88
                                }
lbl76:
                                // 1 sources

                                var18_9 = (var16_8 | var19_7) ^ -2017434124;
                                ** GOTO lbl88
                                case -456030537: {
                                    var17_14 ^= var18_9 ^ -596806836;
                                    ** continue;
                                }
                                case -1602252689: {
                                    var17_14 ^= var18_9 ^ -1854792556;
                                    var18_9 = (var16_8 | var19_7) ^ 1628360438;
                                    ** GOTO lbl88
                                }
                                case 413182803: {
                                    if (var7_6 > 0) ** continue;
                                    var18_9 = (var16_8 | var19_7) ^ 640992859;
                                }
lbl88:
                                // 6 sources

                                default: {
                                    continue block42;
                                }
lbl90:
                                // 1 sources

                                var18_9 = (var16_8 | var19_7) ^ 155852140;
                                continue block42;
                                case -554570960: 
                            }
                            break;
                        }
                    } while (!(Math.abs(var3_3.field_1351) > 0.98));
                }
                var17_14 ^= 379534404;
                var10_12 = var2_2.method_1019(var3_3.method_1021(var4_4 * 2.0));
                var17_14 ^= 536174294;
                var11_13 = var2_2.method_1020(var3_3.method_1021(var4_4 * 2.0));
                var17_14 ^= 1179163858;
                v0 = new class_243[4];
                var17_14 ^= -585951822;
                v0[0] = var2_2.method_1019(var8_10.method_1021(var4_4));
                var17_14 ^= 2080553911;
                ** while (true)
lbl105:
                // 1 sources

                while (true) {
                    var18_9 = (var16_8 | var19_7) ^ 101596781;
                    ** GOTO lbl114
lbl108:
                    // 1 sources

                    while (true) {
                        var17_14 ^= -803790240;
                        break block49;
                        break;
                    }
                    break;
                }
            }
lbl112:
            // 2 sources

            while (true) {
                var18_9 = (var16_8 | var19_7) ^ 1522008488;
lbl114:
                // 4 sources

                block46: while (true) {
                    switch (var18_9) {
                        default: {
                            continue block46;
                        }
                        case -11617444: {
                            var17_14 ^= var18_9 ^ -2093493947;
                            ** continue;
                        }
                        case -1565513633: {
                            var14_17 = var12_15[var13_16];
                            ** continue;
                        }
                        case -377651254: {
                            return;
                        }
                        case -17744811: {
                            if (var13_16 >= 4) ** continue;
                            ** continue;
                        }
                        case -448322450: {
                            var17_14 ^= var18_9 ^ -1434911003;
                            var18_9 = (var16_8 | var19_7) ^ 1091443091;
                            continue block46;
                        }
                        case -1175381077: 
                    }
                    var17_14 ^= var18_9 ^ -688004352;
                    var18_9 = (var16_8 | var19_7) ^ 491720089;
                }
                break;
            }
        }
        var15_18 = var12_15[(var13_16 + 1) % 4];
        var18_9 = (var16_8 | var19_7) ^ 1087999929;
        block47: while (true) {
            switch (var18_9) {
                default: {
                    continue block47;
                }
                case -14243201: {
                    var17_14 ^= var18_9 ^ 927092774;
                    var18_9 = (var16_8 | var19_7) ^ 1620461799;
                    continue block47;
                }
                case -1665919106: {
                    var17_14 ^= var18_9 ^ 48906597;
                    var18_9 = (var16_8 | var19_7) ^ -1839008845;
                    continue block47;
                }
                case 765318773: {
                    ++var13_16;
                    ** continue;
                }
                case -96071206: {
                    var17_14 ^= var18_9 ^ 1549319640;
                    break;
                }
                case -546738911: {
                    ay.qW(var0, var1_1, var10_12, var14_17, var15_18, var15_18, var6_5, var7_6);
                    var18_9 = (var16_8 | var19_7) ^ 1169765404;
                    continue block47;
                }
                case -905127861: {
                    ay.qW(var0, var1_1, var11_13, var15_18, var14_17, var14_17, var6_5, var7_6);
                    var18_9 = (var16_8 | var19_7) ^ 592130744;
                    continue block47;
                }
            }
            var18_9 = (var16_8 | var19_7) ^ 1978924429;
        }
    }

    /*
     * Exception decompiling
     */
    private static void qV(class_4588 var0, Matrix4f var1_1, class_243 var2_2, class_243 var3_3, double var4_4, int var6_5, int var7_6) {
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
    private static void qW(class_4588 var0, Matrix4f var1_1, class_243 var2_2, class_243 var3_3, class_243 var4_4, class_243 var5_5, int var6_6, int var7_7) {
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
    private static void vertex(class_4588 class_45882, Matrix4f matrix4f, class_243 class_2432, int n2, int n3, int n4, int n5) {
        int n6 = 872636502;
        int n7 = e & 0x34036056 ^ 0xFA076D9A;
        int n8 = 0;
        int n9 = (n7 | n6) ^ 0xA66BA5D7;
        n8 = (n7 | n6) ^ 0x4B573C8C;
        block7: while (true) {
            switch (n8) {
                default: {
                    continue block7;
                }
                case 35327664: {
                    return;
                }
                case 937031882: {
                    n9 ^= n8 ^ 0xA43E0233;
                    n8 = (n7 | n6) ^ 0xFC1C636E;
                    continue block7;
                }
                case 184307580: {
                    n9 ^= n8 ^ 0xA4CCC2F;
                    n8 = (n7 | n6) ^ 0x42A7F181;
                    continue block7;
                }
                case -1253027502: {
                    break;
                }
                case -1130324897: {
                    class_45882.method_22918((Matrix4fc)matrix4f, (float)class_2432.field_1352, (float)class_2432.field_1351, (float)class_2432.field_1350).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0xC9DE9514;
                    continue block7;
                }
            }
            n8 = (n7 | n6) ^ 0xF4FB22A2;
        }
    }

    /*
     * Unable to fully structure code
     */
    private int qX(double var1_1) {
        block36: {
            block38: {
                block40: {
                    block39: {
                        block37: {
                            block41: {
                                break block41;
                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 318326949;
                                    ** GOTO lbl73
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 1566694278;
                                    ** GOTO lbl73
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ -1672704687;
                                    ** GOTO lbl73
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 316254478;
                                    ** GOTO lbl73
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 1046615715;
                                    ** GOTO lbl73
lbl16:
                                    // 1 sources

                                    while (true) {
                                        var4_5 ^= var5_4 ^ 369133879;
                                        break block36;
                                        break;
                                    }
lbl19:
                                    // 1 sources

                                    while (true) {
                                        var4_5 ^= var5_4 ^ -1525460862;
                                        break block37;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var6_2 = -1273223887;
                            var3_3 = ay.e & -1273223887 ^ 1320076116;
                            var5_4 = 0;
                            var4_5 = (var3_3 | var6_2) ^ -1359291379;
                            ** while (true)
lbl28:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ 1819829346;
                                ** GOTO lbl73
                                break;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ -2133609141;
                                ** GOTO lbl73
                                break;
                            }
lbl34:
                            // 1 sources

                            while (true) {
                                if (!((Boolean)this.b.getValue()).booleanValue()) ** continue;
                                break block38;
                                break;
                            }
lbl37:
                            // 1 sources

                            while (true) {
                                var4_5 ^= var5_4 ^ 994411379;
                                break block39;
                                break;
                            }
lbl40:
                            // 1 sources

                            while (true) {
                                var4_5 ^= var5_4 ^ -1237860322;
                                break block40;
                                break;
                            }
lbl43:
                            // 1 sources

                            while (true) {
                                var4_5 ^= var5_4 ^ -2098213388;
                                break block39;
                                break;
                            }
lbl46:
                            // 1 sources

                            return class_3532.method_15369((float)((float)((this.b + var1_1) % 1.0)), (float)0.85f, (float)1.0f) & ay.qP((var4_5 | var5_4 ^ -83194283) ^ (var5_4 ^ -681082619), (var3_3 | var5_4 ^ -83194283) ^ ((var4_5 | var5_4 ^ -83194283) ^ (var5_4 ^ -1728042075)));
lbl48:
                            // 1 sources

                            return (Integer)this.a.getValue() & ay.qP((var4_5 | var5_4 ^ -2104695454) ^ (var5_4 ^ -1522291983), (var3_3 | var5_4 ^ -2104695454) ^ ((var4_5 | var5_4 ^ -2104695454) ^ (var5_4 ^ 335491633)));
                        }
                        var5_4 = (var3_3 | var6_2) ^ -1314370543;
                        ** GOTO lbl73
                    }
                    var5_4 = (var3_3 | var6_2) ^ -896436459;
                    ** GOTO lbl73
                }
                var5_4 = (var3_3 | var6_2) ^ -936499418;
                ** GOTO lbl73
lbl59:
                // 1 sources

                while (true) {
                    switch (var4_5) {
                        case -2002811559: {
                            ** continue;
                        }
                        default: {
                            ** continue;
                        }
                        ** case 1025950702:
lbl66:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            var5_4 = (var3_3 | var6_2) ^ 778550763;
            ** GOTO lbl73
        }
        block34: while (true) {
            var5_4 = (var3_3 | var6_2) ^ 1168215448;
lbl73:
            // 12 sources

            block35: while (true) {
                switch (var5_4) {
                    default: {
                        continue block35;
                    }
                    case 2121093694: {
                        ** continue;
                    }
                    case -791061858: {
                        ** continue;
                    }
                    case -328774021: {
                        ** continue;
                    }
                    case 1660054052: {
                        ** continue;
                    }
                    case -1832484073: {
                        ** continue;
                    }
                    case -330846256: {
                        ** continue;
                    }
                    case -1545650957: {
                        ** continue;
                    }
                    case 1326885732: {
                        ** continue;
                    }
                    case 915456083: {
                        ** continue;
                    }
                    case 875532384: {
                        ** continue;
                    }
                    case -1155568915: {
                        ** continue;
                    }
                    ** case -1059261994:
lbl100:
                    // 1 sources

                    continue block34;
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private int alpha(double var1_1) {
        var3_2 = ay.e & 1733931070 ^ -355586019;
        var5_3 = 0;
        if (true) ** GOTO lbl15
lbl4:
        // 1 sources

        return class_3532.method_15340((int)((int)Math.round((double)((Float)this.d.getValue()).floatValue() * this.c * var1_1)), (int)0, (int)ay.qP((var4_4 | var5_3 ^ -2076666749) ^ (var5_3 ^ 552781460), (var3_2 | var5_3 ^ -2076666749) ^ ((var4_4 | var5_3 ^ -2076666749) ^ (var5_3 ^ 1083339314))));
        block6: while (true) {
            var5_3 = (var3_2 | 1733931070) ^ 213816450;
            block7: while (true) {
                switch (var5_3) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block7;
                        }
                        break;
                    }
                    case -480172867: {
                        ** continue;
                    }
lbl15:
                    // 1 sources

                    var4_4 = (var3_2 | 1733931070) ^ 49114311;
                    var5_3 = (var3_2 | 1733931070) ^ 401043771;
                    ** GOTO lbl-1000
lbl18:
                    // 1 sources

                    while (true) {
                        var5_3 = (var3_2 | 1733931070) ^ -675157303;
                        ** continue;
                        break;
                    }
                    case 941513462: {
                        var4_4 ^= var5_3 ^ 835341149;
                        continue block6;
                    }
                    case -130498300: 
                }
                break;
            }
            break;
        }
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private double qY() {
        block28: {
            var8_1 = -2031277756;
            var5_2 = ay.e & -2031277756 ^ 1993188379;
            var7_3 = 0;
            var6_4 = (var5_2 | var8_1) ^ 1057580285;
            var7_3 = (var5_2 | var8_1) ^ 1449976200;
            if (true) ** GOTO lbl70
lbl7:
            // 1 sources

            while (true) {
                var7_3 = (var5_2 | var8_1) ^ -940065564;
                break block28;
lbl10:
                // 1 sources

                while (true) {
                    var7_3 = (var5_2 | var8_1) ^ -1382004175;
                    break block28;
                    break;
                }
                break;
            }
            while (true) {
                var7_3 = (var5_2 | var8_1) ^ -1447232118;
                if (true) ** GOTO lbl23
                break;
            }
lbl16:
            // 2 sources

            while (true) {
                var6_4 ^= 402551183;
                var3_6 = v0;
                var7_3 = (var5_2 | var8_1) ^ 1949587997;
                break block28;
                break;
            }
            block23: while (true) {
                var7_3 = (var5_2 | var8_1) ^ -1697641686;
lbl23:
                // 3 sources

                block24: while (true) {
                    block29: {
                        switch (var7_3) {
                            default: {
                                continue block24;
                            }
                            case 1815979637: {
                                if (this.a != 0L) ** continue;
                                break block29;
                            }
                            case 1599164629: {
                                var6_4 ^= var7_3 ^ 183407298;
                                ** break;
                            }
                            case -1630102317: {
                                v0 = 0.004166666666666667;
                                ** GOTO lbl16
                            }
                            case -1541599185: {
                                var6_4 ^= var7_3 ^ -1048455357;
                                continue block23;
                            }
                            case 170898373: {
                                v0 = (double)(var1_5 - this.a) / 1.0E9;
                                ** continue;
                            }
lbl42:
                            // 1 sources

                            var7_3 = (var5_2 | var8_1) ^ -54387046;
                            continue block24;
                            case -966541050: 
                        }
                        var6_4 ^= var7_3 ^ -1814297839;
                        var7_3 = (var5_2 | var8_1) ^ 1748709772;
                        continue;
                    }
                    var7_3 = (var5_2 | var8_1) ^ 814640217;
                    continue;
                    break;
                }
                break;
            }
        }
        block25: while (true) {
            switch (var7_3) {
                default: {
                    continue block25;
                }
                case -2099644606: {
                    var6_4 ^= var7_3 ^ 495209539;
                    ** continue;
                }
                case 2062384119: {
                    var6_4 ^= var7_3 ^ 623332183;
                    ** continue;
                }
                case 1531832174: {
                    this.a = var1_5;
                    var7_3 = (var5_2 | var8_1) ^ -1946102104;
                    continue block25;
                }
                case 823792059: {
                    return Math.max(0.004166666666666667, Math.min(0.05, var3_6));
                }
                block26: while (true) {
                    var7_3 = (var5_2 | var8_1) ^ 919617711;
lbl70:
                    // 2 sources

                    block27: while (true) {
                        switch (var7_3) {
                            default: {
                                continue block27;
                            }
                            case -1602138921: {
                                var7_3 = (var5_2 | var8_1) ^ 1586092086;
                                continue block27;
                            }
                            case -1069683216: {
                                var1_5 = System.nanoTime();
                                break block26;
                            }
                            case -1469811351: {
                                var6_4 ^= var7_3 ^ -1657726102;
                                continue block26;
                            }
                        }
                        break;
                    }
                    break;
                }
                var7_3 = (var5_2 | var8_1) ^ 1391508848;
                ** continue;
            }
            break;
        }
    }
}

