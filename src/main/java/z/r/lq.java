/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.H;
import z.r.W;
import z.r.Z;
import z.r.bq;
import z.r.bw;
import z.r.dm;
import z.r.eo;
import z.r.fc;
import z.r.gF;
import z.r.gj;
import z.r.gu;
import z.r.hJ;
import z.r.hT;
import z.r.iI;
import z.r.jA;
import z.r.jd;
import z.r.lh;
import z.r.mw;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class lq
extends gu {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private final Z a;
    private static final /* synthetic */ String d;
    private final iI a;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    public static final int a;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private float a;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final int[] a;
    private final jd a;
    private final jA a;
    private final Z b;
    private final Z c;
    private final float[] a;
    private float b;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private static final /* synthetic */ String x;
    private final lh a;
    private final List<hT> a;
    private final Z d;
    private static final /* synthetic */ String y;
    private static final /* synthetic */ String z;
    private final Z[] a;
    private final Z e;
    private final Z f;
    private final float[] b;
    private static final /* synthetic */ String A;
    private final jd b;

    /*
     * Exception decompiling
     */
    public lq(bw var1_1) {
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
    public void onShow() {
        block14: {
            block13: {
                var4_1 = 490606049;
                var1_2 = lq.a & 490606049 ^ 1307875402;
                var3_3 = 0;
                ** GOTO lbl33
lbl5:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -252415610;
                    break block13;
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -1021226804;
                    ** continue;
                    break;
                }
            }
lbl12:
            // 3 sources

            block9: while (true) {
                switch (var3_3) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block9;
                        }
                        break;
                    }
                    case 73656548: {
                        ** continue;
                    }
                    case -918319685: {
                        var2_4 ^= var3_3 ^ 900666110;
                        break block9;
                    }
                    case -379626500: {
                        this.a.reset();
                        break block14;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1799548848;
                        ** GOTO lbl-1000
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -705870431;
                        ** continue;
                        break;
                    }
                    case -1391793043: {
                        return;
                    }
lbl33:
                    // 1 sources

                    var2_4 = (var1_2 | var4_1) ^ 1368715041;
                    ** continue;
                }
                break;
            }
            var3_3 = (var1_2 | var4_1) ^ -1264466409;
            ** GOTO lbl12
        }
        var3_3 = (var1_2 | var4_1) ^ 1503491343;
        ** while (true)
        {
            ** case -2011965366:
        }
lbl41:
        // 1 sources

        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @Override
    public void render(W var1_1) {
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
    private float zC(W var1_1) {
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
    private float zD(W var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        block60: {
            block61: {
                block59: {
                    break block61;
lbl1:
                    // 1 sources

                    while (true) {
                        var16_9 = (var14_8 | var17_7) ^ 1065590132;
                        break block59;
                        break;
                    }
                    while (true) {
                        var16_9 = (var14_8 | var17_7) ^ -812658199;
                        break block60;
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var16_9 = (var14_8 | var17_7) ^ -2073351048;
                        break block59;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var16_9 = (var14_8 | var17_7) ^ -1818180454;
                        break block59;
                        break;
                    }
lbl13:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl15:
                    // 1 sources

                    block51: while (true) {
                        switch (var16_9) {
                            default: {
                                continue block51;
                            }
                            case 462030055: {
                                var15_11 ^= var16_9 ^ 2063549584;
                                var16_9 = (var14_8 | var17_7) ^ -135673680;
                                continue block51;
                            }
                            case -1751635690: {
                                this.zN(var1_1, var2_2, var3_3, bq.bc, lq.k, lq.h);
                                var16_9 = (var14_8 | var17_7) ^ -1312651986;
                                continue block51;
                            }
                            case -815727331: {
                                var15_11 ^= var16_9 ^ -316251350;
                                var16_9 = (var14_8 | var17_7) ^ -389163807;
                                continue block51;
                            }
                            case -828933927: {
                                var15_11 ^= var16_9 ^ -29179873;
                                ** break;
                            }
                            case -2000931513: {
                                this.zM(var1_1, var2_2, var3_3, var4_4, var7_10);
                                var16_9 = (var14_8 | var17_7) ^ -1338703638;
                                continue block51;
                            }
lbl38:
                            // 1 sources

                            var16_9 = (var14_8 | var17_7) ^ 628064300;
                            continue block51;
                            case 1513782747: 
                        }
                        var8_12 = var2_2 + var5_5;
                        var15_11 ^= -1299867759;
                        var9_13 = var3_3 + this.zK(var1_1);
                        var16_9 = (var14_8 | var17_7) ^ -2068556557;
                        ** GOTO lbl124
                        break;
                    }
                }
                block52: while (true) {
                    block65: {
                        block64: {
                            block63: {
                                block62: {
                                    switch (var16_9) {
                                        default: {
                                            continue block52;
                                        }
                                        case 1087791235: {
                                            var15_11 ^= var16_9 ^ -1222096016;
                                            break block62;
                                        }
                                        case -1777962678: {
                                            var15_11 ^= var16_9 ^ 584462177;
                                            break;
                                        }
                                        case -79769201: {
                                            var13_17.render(var1_1);
                                            break block63;
                                        }
                                        case -319473299: {
                                            var15_11 ^= var16_9 ^ -1637898926;
                                            break block64;
                                        }
                                        case -935660824: {
                                            ++var12_16;
                                            ** GOTO lbl112
                                        }
                                        case 391682841: {
                                            var13_17.frame(var8_12, var9_13, var6_6, Z.height(var1_1));
                                            break block65;
                                        }
                                        case 157306272: {
                                            var9_13 += Z.height(var1_1) + var1_1.s(7.0f);
                                            ** continue;
                                        }
                                        case 1607424894: {
                                            var15_11 ^= var16_9 ^ -881506909;
                                            ** continue;
                                        }
                                    }
                                    var16_9 = (var14_8 | var17_7) ^ 1983230039;
                                    continue;
                                }
                                var16_9 = (var14_8 | var17_7) ^ -1217458401;
                                continue;
                            }
                            var16_9 = (var14_8 | var17_7) ^ -380400451;
                            continue;
                        }
                        var16_9 = (var14_8 | var17_7) ^ 1745708782;
                        continue;
                    }
                    var16_9 = (var14_8 | var17_7) ^ 547006089;
                }
lbl89:
                // 1 sources

                while (true) {
                    var16_9 = (var14_8 | var17_7) ^ -1520585831;
                    break block60;
lbl92:
                    // 1 sources

                    while (true) {
                        var16_9 = (var14_8 | var17_7) ^ 23481662;
                        break block60;
lbl95:
                        // 1 sources

                        while (true) {
                            var16_9 = (var14_8 | var17_7) ^ -872760627;
                            break block60;
                            break;
                        }
                        break;
                    }
                    break;
                }
                var16_9 = (var14_8 | var17_7) ^ 618617124;
                block56: while (true) {
                    block66: {
                        switch (var16_9) {
                            case 2092404024: {
                                break;
                            }
                            case 1101107798: {
                                var15_11 ^= var16_9 ^ 741213528;
                                break block66;
                            }
                            case -69097212: {
                                ** GOTO lbl13
                            }
                            case -574136713: {
                                var10_14 = this.a;
                                var11_15 = var10_14.length;
                                var12_16 = 0;
lbl112:
                                // 2 sources

                                var16_9 = (var14_8 | var17_7) ^ 1436575253;
                                break block60;
                            }
                            case 1535812819: {
                                switch (var15_11) {
                                    case -1866303019: {
                                        var16_9 = (var14_8 | var17_7) ^ -1052773166;
                                        continue block56;
                                    }
                                    default: {
                                        var16_9 = (var14_8 | var17_7) ^ 1056206753;
                                        continue block56;
                                    }
                                    case -1845469765: 
                                }
                                var16_9 = (var14_8 | var17_7) ^ -1016584856;
                            }
lbl124:
                            // 3 sources

                            default: {
                                continue block56;
                            }
                            case -1100347099: {
                                var15_11 ^= var16_9 ^ -138506452;
                                ** continue;
                            }
                            case -1136797537: {
                                var15_11 ^= var16_9 ^ 107507771;
                                break block66;
                            }
                        }
                        var16_9 = (var14_8 | var17_7) ^ -1567448192;
                        continue;
                    }
                    var16_9 = (var14_8 | var17_7) ^ 65171663;
                }
            }
            var17_7 = 994434451;
            var14_8 = lq.a & 994434451 ^ 2119268710;
            var16_9 = 0;
            var15_11 = (var14_8 | var17_7) ^ 710474657;
            var16_9 = (var14_8 | var17_7) ^ 179082990;
            block57: while (true) {
                switch (var16_9) {
                    case -797218190: {
                        var7_10 = this.zC(var1_1);
                        var16_9 = (var14_8 | var17_7) ^ 1692399888;
                        ** continue;
                    }
                    case 1979280153: {
                        var16_9 = (var14_8 | var17_7) ^ -1057093556;
                    }
                    default: {
                        continue block57;
                    }
                    case -1079249477: 
                }
                var15_11 ^= var16_9 ^ -1943308431;
                var16_9 = (var14_8 | var17_7) ^ -1355901051;
            }
        }
        block58: while (true) {
            switch (var16_9) {
                default: {
                    continue block58;
                }
                case -1327879138: {
                    var15_11 ^= var16_9 ^ 215325209;
                    var16_9 = (var14_8 | var17_7) ^ 95101832;
                    continue block58;
                }
                case 2117316809: {
                    if (var12_16 >= var11_15) ** continue;
                    var16_9 = (var14_8 | var17_7) ^ 1619664011;
                    continue block58;
                }
                case 534765948: {
                    var15_11 ^= var16_9 ^ -236614448;
                    var16_9 = (var14_8 | var17_7) ^ -314643939;
                    continue block58;
                }
                case -636989842: {
                    var15_11 ^= var16_9 ^ 777511313;
                    ** continue;
                }
                case 720739298: {
                    var15_11 ^= var16_9 ^ 1643184500;
                    ** continue;
                }
                case -1263581382: {
                    return var3_3 + var7_10;
                }
                case -1838475286: {
                    var13_17 = var10_14[var12_16];
                    ** continue;
                }
                case 2063523455: 
            }
            break;
        }
        var9_13 -= var1_1.s(7.0f);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private float zE(W w2, float f2) {
        int n2 = a & 0xADEC8E94 ^ 0xFC2BAF95;
        int n3 = 0;
        int n4 = (n2 | 0xADEC8E94) ^ 0x54FDE81C;
        n3 = (n2 | 0xADEC8E94) ^ 0xD576AC62;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -563034626: {
                    n4 ^= n3 ^ 0x6379703E;
                    n3 = (n2 | 0xADEC8E94) ^ 0xB4532F9C;
                    continue block5;
                }
                case 681116663: {
                    n3 = (n2 | 0xADEC8E94) ^ 0x239F6A6B;
                    continue block5;
                }
                case 1237090313: 
            }
            break;
        }
        n4 ^= 0x3A95E424;
        n4 ^= 0x54023AC1;
        return this.zK(w2) + w2.s(26.0f) + jA.height(w2, f2) + w2.s(14.0f) + this.zL(w2) + w2.s(8.0f);
    }

    /*
     * Exception decompiling
     */
    private float zF(W var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
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
     * Enabled aggressive block sorting
     */
    private float zG(W w2) {
        int n2 = a & 0x5DBB2143 ^ 0x238938D5;
        int n3 = 0;
        int n4 = (n2 | 0x5DBB2143) ^ 0x494A07E2;
        n3 = (n2 | 0x5DBB2143) ^ 0x1093B453;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 243448406: {
                    n4 ^= n3 ^ 0xF0569427;
                    n3 = (n2 | 0x5DBB2143) ^ 0x57A89FEE;
                    continue block5;
                }
                case 672376377: {
                    return this.zK(w2) + w2.s(40.0f) + w2.s(6.0f) + this.zL(w2) + w2.s(8.0f);
                }
                case 1864928644: 
            }
            n3 = (n2 | 0x5DBB2143) ^ 0x71398381;
        }
    }

    /*
     * Exception decompiling
     */
    private float zH(W var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
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
    private float zI(W var1_1) {
        var2_2 = lq.a & 60836037 ^ 1554305328;
        var4_3 = 0;
        if (true) ** GOTO lbl19
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
                case -290876630: {
                    ** GOTO lbl17
                }
lbl11:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | 60836037) ^ -1475293329;
                    ** GOTO lbl-1000
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | 60836037) ^ -1324528929;
                    ** GOTO lbl-1000
                    break;
                }
lbl17:
                // 1 sources

                var4_3 = (var2_2 | 60836037) ^ 2023068634;
                ** continue;
lbl19:
                // 1 sources

                var3_4 = (var2_2 | 60836037) ^ -1791925765;
                ** continue;
                case 657541679: {
                    var3_4 ^= var4_3 ^ 559846662;
                    ** continue;
                }
                case -139192678: 
            }
            break;
        }
        return var1_1.s(96.0f);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block23: {
            var2 = -468578338;
            lq.a = mK.a(MethodHandles.lookup().lookupClass(), 921738817);
            var1_1 = 0;
            var0_2 = 1544300344;
            var1_1 = var2 ^ -155530050;
            if (true) ** GOTO lbl69
lbl7:
            // 2 sources

            while (true) {
                var0_2 ^= 377997794;
                var0_2 ^= -404013938;
                var0_2 ^= -1584148123;
                var0_2 ^= -630757637;
                var0_2 ^= -496745947;
                v0 = ((var0_2 ^= -805810094) | var2) ^ 1245039480 ^ lq.a;
                var0_2 ^= -1209782049;
                lq.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ v0;
                v1 = v1 + 1;
                v2 = v2;
                v3 = v3 + 4;
                var0_2 ^= -1140652269;
                if (v3 + 4 >= v2.length) {
                    lq.o = gj.decode("SWPFQ3oKvcetvBI=", lq.zS(((var0_2 ^= 527402272) | var2) ^ -61184617, var2 ^ ((var0_2 | var2) ^ 506901397)));
                    lq.w = gj.decode("DjaKuLo1", lq.zS((var0_2 | var2) ^ -61184618, var2 ^ ((var0_2 | var2) ^ -1940607512)));
                    lq.t = gj.decode("Eskbd6EDCJ3XA+pF0bw=", lq.zS((var0_2 | var2) ^ -61184619, var2 ^ ((var0_2 | var2) ^ 1915187042)));
                    lq.a = gj.decode("kdo4ha0zOhwS", lq.zS((var0_2 | var2) ^ -61184620, var2 ^ ((var0_2 | var2) ^ 1868786215)));
                    lq.l = gj.decode("ShsuV74mhLKB", lq.zS((var0_2 | var2) ^ -61184613, var2 ^ ((var0_2 | var2) ^ 1532989414)));
                    lq.v = gj.decode("pr274NOHTjAu7ppD", lq.zS((var0_2 | var2) ^ -61184614, var2 ^ ((var0_2 | var2) ^ 915980744)));
                    lq.f = gj.decode("uajrpCZGhSV9PoVMog==", lq.zS((var0_2 | var2) ^ -61184615, var2 ^ ((var0_2 | var2) ^ -1252189123)));
                    lq.n = gj.decode("zVoQqHDNIg==", lq.zS((var0_2 | var2) ^ -61184616, var2 ^ ((var0_2 | var2) ^ -411647821)));
                    lq.d = gj.decode("my20a2q57cA=", lq.zS((var0_2 | var2) ^ -61184609, var2 ^ ((var0_2 | var2) ^ 309958807)));
                    lq.i = gj.decode("QqFAdQi/2ZJ49c3E+/y5i59OMmwol6qOcKPX70YPhTXUghr0vJXDm8ilrGNagqkyxVZexXxS5yurww==", lq.zS((var0_2 | var2) ^ -61184610, var2 ^ ((var0_2 | var2) ^ -552859432)));
                    lq.k = gj.decode("aKSH403tngKPcg==", lq.zS((var0_2 | var2) ^ -61184611, var2 ^ ((var0_2 | var2) ^ -1399468127)));
                    lq.h = gj.decode("EnW6dkGksFOsyLPC2DFif4ht8LaZdVzlPGf3TA==", lq.zS((var0_2 | var2) ^ -61184612, var2 ^ ((var0_2 | var2) ^ 269204839)));
                    lq.x = gj.decode("vuaSKgY=", lq.zS((var0_2 | var2) ^ -61184605, var2 ^ ((var0_2 | var2) ^ -1052069437)));
                    lq.r = gj.decode("F7ncLkw3neAM+9z3BUN2CK5FgHYLug4M/ONXSHZy", lq.zS((var0_2 | var2) ^ -61184606, var2 ^ ((var0_2 | var2) ^ -254229580)));
                    lq.g = gj.decode("CdLS7MPP1M4SBsTn", lq.zS((var0_2 | var2) ^ -61184607, var2 ^ ((var0_2 | var2) ^ -2075715851)));
                    lq.c = gj.decode("Z8vBNSI=", lq.zS((var0_2 | var2) ^ -61184608, var2 ^ ((var0_2 | var2) ^ -72805776)));
                    lq.A = gj.decode("BYv2maUp9E9SPc5RoA==", lq.zS((var0_2 | var2) ^ -61184601, var2 ^ ((var0_2 | var2) ^ -764438728)));
                    lq.q = gj.decode("PIDumMmtLm00o9c8yd9siLPN8UzqxyZi3GYXz/NVatBng0tOVA==", lq.zS((var0_2 | var2) ^ -61184602, var2 ^ ((var0_2 | var2) ^ 777306236)));
                    lq.b = gj.decode("HO2wD6Y=", lq.zS((var0_2 | var2) ^ -61184603, var2 ^ ((var0_2 | var2) ^ -1240745264)));
                    lq.m = gj.decode("Qi7kva6Glf7AaQ7vgd/2gMYg9PtP7T/aiNwvJA==", lq.zS((var0_2 | var2) ^ -61184604, var2 ^ ((var0_2 | var2) ^ 181939929)));
                    lq.y = gj.decode("oRbn/4L3mncr2dDDgw==", lq.zS((var0_2 | var2) ^ -61184597, var2 ^ ((var0_2 | var2) ^ -1429332320)));
                    lq.p = gj.decode("+wV9hxZzpnabYFagbWwukUVZ5W2Iuvj3", lq.zS((var0_2 | var2) ^ -61184598, var2 ^ ((var0_2 | var2) ^ -1078460930)));
                    lq.j = gj.decode("N0d3kEhMRC64hkO06b4xlnpd3EwU", lq.zS((var0_2 | var2) ^ -61184599, var2 ^ ((var0_2 | var2) ^ 1459946888)));
                    lq.s = gj.decode("W+W2Iy7gOdhknvG99VzgB8IUMSm0v5P8iqsTx4l3RbchYdDYOwWgPGp/BdBiPoDYsvX7Qq+Ff5zh+VA=", lq.zS((var0_2 | var2) ^ -61184600, var2 ^ ((var0_2 | var2) ^ -537235397)));
                    lq.u = gj.decode("Yw8F4C/7i2phHGfP", lq.zS((var0_2 | var2) ^ -61184593, var2 ^ ((var0_2 | var2) ^ -1269033170)));
                    lq.e = gj.decode("KV7tKtRocUmgSCUCJxLe9Fg=", lq.zS((var0_2 | var2) ^ -61184594, var2 ^ ((var0_2 | var2) ^ 1809832515)));
                    lq.z = gj.decode("MpuzlNbeC+qf5XoAdUonJQ==", lq.zS((var0_2 | var2) ^ -61184595, var2 ^ ((var0_2 | var2) ^ -1326596506)));
                    return;
                }
                break block23;
                break;
            }
            block19: while (true) {
                var1_1 = var2 ^ 1835902662;
lbl69:
                // 2 sources

                block20: while (true) {
                    switch (var1_1) {
                        case -899621395: {
                            var0_2 ^= var1_1 ^ 1692583847;
                            continue block19;
                        }
                        case 1760915801: {
                            var0_2 ^= var1_1 ^ -1481954829;
                            continue block19;
                        }
                        case 173557363: {
                            v1 = 0;
                            v3 = 0;
                            lq.a = new int[((var0_2 ^= 1668157764) | var2) ^ -168677423];
                            var0_2 ^= -949831015;
                            v2 = "\u00d9\u00d7\u00f0\u0092b\u00fe\u00e2Q\u0085\u00c2\u001ezr\u00b2\u008f\u00d6\u0089>6e\u00bb\u00a6C_\u0017\u0005\f~\u0014X\"\u00e3KCTb\u008c\u00d2\u00b6W9\u00f7\u00a9\u00db\u00e8\u0002\u00fb\r\u0083X\u00de\u0001\u00b2\u00ca\u00d1\u00a0\u00ac(U\u00ca\u00a8(4h;\"B\u00e3_\u0085\u0000\u0010\u0083\u00a4j\u0002\u00ca\u00a0\u0084\u00cf\u00b2\u0093\u001a\u00af\u00d9;\u000eU\u00d8[KTBH\u0088\u0088U3\u009f\u00190Y\u00ba\u009c\u00eab\u0095\u00d1\u00ad\u001a \u00fa\u00fej\u0089\u00c4O;\u0080\u0083\u00eaF\u009c\u009dF%\u0080+\u00d2,_\u0086\u0082\u00bf\u00a8riz\u00f9\u00ceB\u00a8\u00ec\u0000\u00c5\u008d\u00f5\u00e4\u00dd\u00b6\u00b5`Z\u00dd\u00e7B\u00adqn\u00e4\u00bb<\u00cb'\u00a2\u00c9\u0016\u00e32\u00ff\u00b2!\u00e4\u0000\u00e4\u00dcV)\u00d9|\u00c2/\u00d5n\u00e7\u00cbR\\".getBytes("ISO-8859-1");
                            break block19;
                        }
                        case -1759855512: {
                            break;
                        }
                        case -1988122344: {
                            var1_1 = var2 ^ -297121363;
                            continue block20;
                        }
                        case 313049952: {
                            var1_1 = var2 ^ 1929950134;
                            continue block20;
                        }
                        case -1131065121: {
                            var0_2 ^= var1_1 ^ -129216;
                            break;
                        }
                        case 616563908: {
                            switch (var0_2) {
                                case -1940261679: {
                                    var1_1 = var2 ^ 1485266689;
                                    continue block20;
                                }
                                default: {
                                    var1_1 = var2 ^ 779276851;
                                    ** break;
                                }
                                case -831094369: 
                            }
                            var1_1 = var2 ^ -1930985849;
                            ** break;
                        }
lbl106:
                        // 3 sources

                        default: {
                            continue block20;
                        }
                    }
                    var1_1 = var2 ^ -1059976422;
                }
                break;
            }
        }
        while (true) {
            switch (var0_2) {
                case -793604005: {
                    var0_2 ^= 469897229;
                    ** GOTO lbl7
                }
                default: {
                    var0_2 ^= -1394383031;
                    ** continue;
                }
                case 1546877199: 
            }
            var0_2 ^= 2070871011;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private float zJ(W var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        block99: {
            block97: {
                block101: {
                    block98: {
                        block100: {
                            block96: {
                                var26_7 = -1928381847;
                                var23_8 = lq.a & -1928381847 ^ 1426900954;
                                var25_9 = 0;
                                var24_10 = (var23_8 | var26_7) ^ -1053098135;
                                var25_9 = (var23_8 | var26_7) ^ 724871132;
                                break block98;
lbl7:
                                // 2 sources

                                while (true) {
                                    var1_1.text(v0, var8_12 + var22_25, var21_24, v1, v2);
                                    var25_9 = (var23_8 | var26_7) ^ -1630969671;
                                    ** GOTO lbl108
lbl11:
                                    // 2 sources

                                    while (true) {
                                        var25_9 = (var23_8 | var26_7) ^ 610510775;
                                        break block96;
                                        break;
                                    }
                                    break;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    var15_19 = var1_1.s(18.0f);
                                    var24_10 ^= -1543135625;
                                    var16_20 = var2_2 + var4_4 - var5_5 - var14_18;
                                    var25_9 = (var23_8 | var26_7) ^ 979947772;
                                    ** GOTO lbl178
                                    break;
                                }
lbl20:
                                // 1 sources

                                while (true) {
                                    var25_9 = (var23_8 | var26_7) ^ -917633108;
                                    break block97;
                                    break;
                                }
lbl23:
                                // 1 sources

                                while (true) {
                                    var24_10 ^= -9159904;
                                    var10_14 = var1_1.s(24.0f);
                                    var24_10 ^= 807360838;
                                    var11_15 = var3_3 + var1_1.s(13.0f);
                                    var25_9 = (var23_8 | var26_7) ^ 450455033;
                                    break block97;
                                    break;
                                }
lbl30:
                                // 1 sources

                                while (true) {
                                    var25_9 = (var23_8 | var26_7) ^ -815273521;
                                    break block97;
lbl33:
                                    // 1 sources

                                    while (true) {
                                        var24_10 ^= 742913204;
                                        var14_18 = var1_1.textWidth(var12_16, var13_17) + var1_1.s(16.0f);
                                        var24_10 ^= -928907540;
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
lbl38:
                                // 1 sources

                                while (true) {
                                    var25_9 = (var23_8 | var26_7) ^ 808785101;
                                    break block96;
                                    break;
                                }
lbl41:
                                // 1 sources

                                while (true) {
                                    var25_9 = (var23_8 | var26_7) ^ -510249950;
                                    break block98;
                                    break;
                                }
                            }
                            block75: while (true) {
                                switch (var25_9) {
                                    case 1643052577: {
                                        ** break;
                                    }
                                    case -1007100498: {
                                        var1_1.text(lq.e, var8_12, var21_24 + var1_1.s(15.0f), var1_1.s(10.0f), lq.zS((var24_10 | var25_9 ^ 1324869575) ^ (var25_9 ^ 1873960342), (var23_8 | var25_9 ^ 1324869575) ^ ((var24_10 | var25_9 ^ 1324869575) ^ (var25_9 ^ -1270966344))));
                                        var25_9 = (var23_8 | var26_7) ^ -2142836602;
                                        continue block75;
                                    }
                                    case -1317535421: {
                                        var24_10 ^= var25_9 ^ -1477678827;
                                        var25_9 = (var23_8 | var26_7) ^ 291687476;
                                        continue block75;
                                    }
                                    case 762359171: {
                                        var24_10 ^= var25_9 ^ -775638114;
                                        ** GOTO lbl11
                                    }
                                    case 1565071229: {
                                        ** GOTO lbl98
                                    }
                                    case 1137090370: {
                                        var24_10 ^= var25_9 ^ -1282838443;
                                        var25_9 = (var23_8 | var26_7) ^ -1636990640;
                                        continue block75;
                                    }
lbl66:
                                    // 1 sources

                                    switch (var24_10) {
                                        default: {
                                            var25_9 = (var23_8 | var26_7) ^ 910468721;
                                            break;
                                        }
                                        case -865258545: {
                                            var1_1.text(String.valueOf(var18_22), var8_12, var21_24, var1_1.s(15.0f), lq.zS((var24_10 | var25_9 ^ 1096944038) ^ (var25_9 ^ 839332852), (var23_8 | var25_9 ^ 1096944038) ^ ((var24_10 | var25_9 ^ 1096944038) ^ (var25_9 ^ 953045644))));
                                            ** continue;
                                        }
                                        case -314905802: {
                                            var24_10 ^= var25_9 ^ -1089320107;
                                            ** GOTO lbl90
                                        }
                                        case -1565825121: {
                                            var25_9 = (var23_8 | var26_7) ^ -1124196749;
                                            break;
                                        }
                                        case -110340020: {
                                            var25_9 = (var23_8 | var26_7) ^ -927419954;
                                            break;
                                        }
                                        case 1130528427: {
                                            var1_1.text(lq.z, var8_12 + var22_25, var21_24 + var1_1.s(15.0f), var1_1.s(10.0f), lq.zS((var24_10 | var25_9 ^ -831699774) ^ (var25_9 ^ -1621573741), (var23_8 | var25_9 ^ -831699774) ^ ((var24_10 | var25_9 ^ -831699774) ^ (var25_9 ^ 505175824))));
                                            var25_9 = (var23_8 | var26_7) ^ 2138850659;
                                            break;
                                        }
                                        case -1802520152: {
                                            var25_9 = (var23_8 | var26_7) ^ -260091272;
                                            break;
                                        }
                                    }
                                    ** GOTO lbl108
lbl90:
                                    // 1 sources

                                    var25_9 = (var23_8 | var26_7) ^ 519512661;
                                    ** GOTO lbl108
                                    case 364334645: {
                                        v0 = String.valueOf(var19_23);
                                        v1 = var1_1.s(15.0f);
                                        break block99;
                                    }
                                    case 1643241864: {
                                        var24_10 ^= var25_9 ^ 1005362981;
lbl98:
                                        // 2 sources

                                        var25_9 = (var23_8 | var26_7) ^ -1126104614;
                                        ** GOTO lbl108
                                    }
                                    case -1569473896: {
                                        var24_10 ^= var25_9 ^ 1815801592;
                                        var25_9 = (var23_8 | var26_7) ^ -1433913472;
                                        ** GOTO lbl108
                                    }
                                    case -347383414: {
                                        var24_10 ^= var25_9 ^ -403161823;
                                        ** break;
lbl107:
                                        // 1 sources

                                        ** continue;
                                    }
lbl108:
                                    // 7 sources

                                    while (true) {
                                        default: {
                                            continue block75;
                                        }
                                        break;
                                    }
lbl111:
                                    // 1 sources

                                    while (true) {
                                        var21_24 = var17_21 + var1_1.s(18.0f);
                                        var24_10 ^= 1671982072;
                                        var22_25 = var6_6 / 2.0f;
                                        var25_9 = (var23_8 | var26_7) ^ 1819803320;
                                        ** continue;
                                        break;
                                    }
lbl117:
                                    // 1 sources

                                    block78: while (true) {
                                        switch (var24_10) {
                                            case 906228866: {
                                                var24_10 ^= 1354834776;
                                                continue block78;
                                            }
                                            case 1892778857: {
                                                var24_10 ^= -764972316;
                                                ** break;
                                            }
                                        }
                                        var24_10 ^= 946844383;
                                        ** break;
lbl127:
                                        // 2 sources

                                        v2 = lq.zS((var24_10 | var26_7) ^ -1104509507, (var23_8 | var26_7) ^ ((var24_10 | var26_7) ^ 239899423));
                                        break block100;
                                        break;
                                    }
lbl129:
                                    // 1 sources

                                    while (true) {
                                        var25_9 = (var23_8 | var26_7) ^ 74324668;
                                        ** GOTO lbl141
                                        break;
                                    }
lbl132:
                                    // 1 sources

                                    while (true) {
                                        var25_9 = (var23_8 | var26_7) ^ 971297912;
                                        if (true) ** GOTO lbl178
                                        break;
                                    }
lbl135:
                                    // 1 sources

                                    while (true) {
                                        var25_9 = (var23_8 | var26_7) ^ 293775983;
                                        break block97;
                                        break;
                                    }
lbl138:
                                    // 1 sources

                                    while (true) {
                                        var25_9 = (var23_8 | var26_7) ^ 1958498110;
                                        break block101;
                                        break;
                                    }
lbl141:
                                    // 2 sources

                                    block83: while (true) {
                                        switch (var25_9) {
                                            default: {
                                                continue block83;
                                            }
                                            case -32691171: {
                                                var8_12 = var2_2 + var5_5;
                                                ** break;
                                            }
                                            case -674080441: {
                                                this.zM(var1_1, var2_2, var3_3, var4_4, var7_11);
                                                ** continue;
                                            }
                                            case -647895737: {
                                                var24_10 ^= var25_9 ^ -1401283038;
                                                var25_9 = (var23_8 | var26_7) ^ 587387878;
                                                continue block83;
                                            }
lbl155:
                                            // 1 sources

                                            var24_10 ^= 614255880;
                                            var9_13 = fc.accent();
                                            ** continue;
                                            case 1694276656: 
                                        }
                                        var24_10 ^= var25_9 ^ -1896152411;
                                        var25_9 = (var23_8 | var26_7) ^ 182298300;
                                        continue;
                                        break;
                                    }
                                    case 2005387387: 
                                }
                                break;
                            }
                            return var3_3 + var7_11;
lbl164:
                            // 1 sources

                            while (true) {
                                var25_9 = (var23_8 | var26_7) ^ -1234901684;
                                break block101;
                                break;
                            }
lbl167:
                            // 2 sources

                            while (true) {
                                if (var19_23 > 0L) ** break;
                                ** continue;
                                var24_10 ^= 946844383;
                                v2 = fc.mix(var9_13, -1, 0.2f);
                                break block100;
                                break;
                            }
lbl173:
                            // 1 sources

                            while (true) {
                                var25_9 = (var23_8 | var26_7) ^ 379694376;
                                break block101;
                                break;
                            }
                            while (true) {
                                var25_9 = (var23_8 | var26_7) ^ 292602121;
lbl178:
                                // 3 sources

                                block88: while (true) {
                                    switch (var25_9) {
                                        default: {
                                            continue block88;
                                        }
                                        case -864076046: {
                                            var1_1.roundedRect(var16_20, var11_15 + (var10_14 - var15_19) / 2.0f, var14_18, var15_19, var15_19 / 2.0f, fc.withAlpha(var9_13, lq.zS((var24_10 | var25_9 ^ 1097860251) ^ (var25_9 ^ 1623554782), (var23_8 | var25_9 ^ 1097860251) ^ ((var24_10 | var25_9 ^ 1097860251) ^ (var25_9 ^ -549775272)))));
                                            ** break;
                                        }
                                        case -2141427088: {
                                            var1_1.textCentered(var12_16, var16_20 + var14_18 / 2.0f, var11_15 + var10_14 / 2.0f, var13_17, fc.mix(var9_13, -1, 0.25f));
                                            var25_9 = (var23_8 | var26_7) ^ 1290475914;
                                            continue block88;
                                        }
                                        case -454349949: {
                                            var17_21 = var11_15 + var10_14 + var1_1.s(12.0f);
                                            ** continue;
                                        }
                                        case -1847269775: {
                                            var24_10 ^= var25_9 ^ 1871410663;
                                            ** continue;
                                        }
                                        case -76509802: {
                                            var24_10 ^= var25_9 ^ -1582852064;
                                            ** GOTO lbl200
                                        }
lbl198:
                                        // 1 sources

                                        var25_9 = (var23_8 | var26_7) ^ 645886573;
                                        continue block88;
lbl200:
                                        // 1 sources

                                        var25_9 = (var23_8 | var26_7) ^ 1565758859;
                                        continue block88;
                                        case -412668153: 
                                    }
                                    break;
                                }
                                var24_10 ^= var25_9 ^ -808487609;
                            }
lbl205:
                            // 1 sources

                            while (true) {
                                var25_9 = (var23_8 | var26_7) ^ -337633111;
                                break block97;
                                break;
                            }
lbl208:
                            // 1 sources

                            while (true) {
                                var19_23 = mw.getInstance().getModules().stream().filter((Predicate<gF>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isEnabled(), (Lz/r/gF;)Z)()).count();
                                var24_10 ^= 2075526;
                                ** continue;
                                break;
                            }
                        }
                        block91: while (true) {
                            switch (var24_10) {
                                case -1349982740: {
                                    var24_10 ^= 525908411;
                                    ** GOTO lbl7
                                }
                                case -535858802: {
                                    var24_10 ^= -1128390254;
                                    continue block91;
                                }
                            }
                            break;
                        }
                        var24_10 ^= 1635588976;
                        ** while (true)
                    }
                    block92: while (true) {
                        switch (var25_9) {
                            default: {
                                continue block92;
                            }
                            case -163882969: {
                                ** break;
                            }
                            case -340204960: {
                                var24_10 ^= var25_9 ^ 1563481352;
                                ** continue;
                            }
lbl233:
                            // 1 sources

                            var25_9 = (var23_8 | var26_7) ^ 917970331;
                            continue block92;
                            case 1016712153: 
                        }
                        break;
                    }
                    var7_11 = this.zI(var1_1);
                    var25_9 = (var23_8 | var26_7) ^ -1175231541;
                    ** while (true)
                }
                block93: while (true) {
                    switch (var25_9) {
                        default: {
                            continue block93;
                        }
                        case -1201519066: {
                            var1_1.line(var8_12, var17_21, var8_12 + var6_6, var17_21, var1_1.s(1.0f), fc.divider());
                            ** continue;
                        }
                        case -1447841595: {
                            var24_10 ^= var25_9 ^ 1663891113;
                            ** continue;
                        }
                        case 1802181303: {
                            var18_22 = mw.getInstance().getModules().size();
                            var24_10 ^= -1088933889;
                            ** continue;
                        }
                        case -877767981: 
                    }
                    var24_10 ^= var25_9 ^ 878869276;
                    var25_9 = (var23_8 | var26_7) ^ 1701689821;
                }
            }
            block94: while (true) {
                switch (var25_9) {
                    default: {
                        continue block94;
                    }
                    case -863152748: {
                        var1_1.text(lq.u, var8_12 + var10_14 + var1_1.s(10.0f), var11_15 + var10_14 / 2.0f, var1_1.s(13.0f), lq.zS((var24_10 | var25_9 ^ 1099067389) ^ (var25_9 ^ 16225343), (var23_8 | var25_9 ^ 1099067389) ^ ((var24_10 | var25_9 ^ 1099067389) ^ (var25_9 ^ 2022312190))));
                        ** continue;
                    }
                    case -1207782107: {
                        var12_16 = "v" + hJ.b;
                        ** break;
                    }
                    case 308811316: {
                        var24_10 ^= var25_9 ^ 221113365;
                        ** continue;
                    }
                    case -942237182: {
                        var24_10 ^= var25_9 ^ -551997703;
                        ** continue;
                    }
                    case 921689938: {
                        var24_10 ^= var25_9 ^ 103566032;
                        ** GOTO lbl281
                    }
lbl278:
                    // 1 sources

                    var24_10 ^= -1270096893;
                    var13_17 = var1_1.s(10.0f);
                    ** continue;
lbl281:
                    // 1 sources

                    var25_9 = (var23_8 | var26_7) ^ 1695369950;
                    continue block94;
                    case 339867735: 
                }
                break;
            }
            eo.render(var1_1, var8_12, var11_15, var10_14);
            ** while (true)
        }
        block95: while (true) {
            switch (var24_10) {
                default: {
                    var24_10 ^= -1481389569;
                    ** GOTO lbl167
                }
                case -1755574195: {
                    var24_10 ^= 1508931734;
                    continue block95;
                }
                case -1868759568: 
            }
            break;
        }
        var24_10 ^= 2139881859;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private float zK(W w2) {
        int n2 = a & 0x89BB295E ^ 0xF623114A;
        int n3 = 0;
        int n4 = (n2 | 0x89BB295E) ^ 0x1517B3FA;
        n3 = (n2 | 0x89BB295E) ^ 0xC6C4158C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 380324469: {
                    return w2.s(50.0f);
                }
                case 1464165350: {
                    n4 ^= n3 ^ 0xAB38DFCB;
                    n3 = (n2 | 0x89BB295E) ^ 0xE910732B;
                    continue block5;
                }
                case 964635858: 
            }
            n3 = (n2 | 0x89BB295E) ^ 0xA8FE5AB8;
        }
    }

    /*
     * Exception decompiling
     */
    private float zL(W var1_1) {
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
    private void zM(W var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        block17: {
            break block17;
lbl1:
            // 1 sources

            while (true) {
                var9_8 = (var7_7 | var10_6) ^ -1767271764;
                ** GOTO lbl26
                break;
            }
        }
        var10_6 = 911178162;
        var7_7 = lq.a & 911178162 ^ 244230493;
        var9_8 = 0;
        var8_10 = (var7_7 | var10_6) ^ 1475460504;
        var9_8 = (var7_7 | var10_6) ^ 466935212;
        block14: while (true) {
            switch (var9_8) {
                case 622535763: {
                    var9_8 = (var7_7 | var10_6) ^ -999521346;
                    continue block14;
                }
                case -89949631: {
                    var8_10 ^= var9_8 ^ -224570825;
                    var9_8 = (var7_7 | var10_6) ^ 1734297192;
                }
                default: {
                    continue block14;
                }
                case 1502658455: 
            }
            break;
        }
        var6_9 = var1_1.s(12.0f);
        var9_8 = (var7_7 | var10_6) ^ -145462444;
        if (true) ** GOTO lbl45
        block15: while (true) {
            var9_8 = (var7_7 | var10_6) ^ -1801860019;
lbl26:
            // 2 sources

            block16: while (true) {
                switch (var9_8) {
                    case -912551253: {
                        var8_10 ^= var9_8 ^ -931146311;
                        continue block15;
                    }
                    case 1505548681: {
                        var1_1.strokeRoundedRect(var2_2, var3_3, var4_4, var5_5, var6_9, var1_1.s(1.0f), fc.border());
                        var9_8 = (var7_7 | var10_6) ^ 825016267;
                        continue block16;
                    }
                    case -2047979333: {
                        var8_10 ^= var9_8 ^ 268587532;
                        var9_8 = (var7_7 | var10_6) ^ 1735598198;
                        ** break;
                    }
                    case 266552884: {
                        var8_10 ^= var9_8 ^ -429627880;
                        ** continue;
                    }
                    case -1437190734: {
                        var1_1.roundedRect(var2_2, var3_3, var4_4, var5_5, var6_9, fc.surface());
                        var9_8 = (var7_7 | var10_6) ^ -1155421884;
                    }
lbl45:
                    // 4 sources

                    default: {
                        continue block16;
                    }
                    case -1469682861: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void zN(W var1_1, float var2_2, float var3_3, bq var4_4, String var5_5, String var6_6) {
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
    private void zO(W var1_1, jd var2_2, float[] var3_3, String var4_4, String var5_5, boolean var6_6, float var7_7, float var8_8, float var9_9, float var10_10) {
        block42: {
            block41: {
                var18_11 = -1433762267;
                var15_12 = lq.a & -1433762267 ^ -1344497522;
                var17_13 = 0;
                var16_17 = (var15_12 | var18_11) ^ 1432042226;
                var17_13 = (var15_12 | var18_11) ^ 756965949;
                break block41;
lbl7:
                // 1 sources

                while (true) {
                    var17_13 = (var15_12 | var18_11) ^ -335750956;
                    break block41;
                    break;
                }
lbl10:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
                while (true) {
                    break block42;
                    break;
                }
            }
            block36: while (true) {
                switch (var17_13) {
                    default: {
                        continue block36;
                    }
                    case 1143096955: {
                        var11_14 = this.zL(var1_1);
                        var16_17 ^= 374056575;
                        var12_15 = var7_7 + var1_1.s(6.0f);
                        var16_17 ^= -922407029;
                        var13_16 = var9_9 - var1_1.s(12.0f);
                        ** break;
                    }
                    case -2101281646: {
                        var17_13 = (var15_12 | var18_11) ^ 1830864090;
                        continue block36;
                    }
lbl29:
                    // 1 sources

                    var17_13 = (var15_12 | var18_11) ^ -1688401377;
                    ** GOTO lbl87
                    case -1023518091: 
                }
                break;
            }
            var16_17 ^= var17_13 ^ -1002545132;
            ** while (true)
            var17_13 = (var15_12 | var18_11) ^ -690590518;
            block37: while (true) {
                block43: {
                    switch (var17_13) {
                        case -951435073: {
                            break block43;
                        }
                        case 214076530: {
                            var16_17 ^= var17_13 ^ -1193718377;
                            var17_13 = (var15_12 | var18_11) ^ 1171760568;
                            continue block37;
                        }
                        case -1573879953: {
                            var1_1.roundedRect(var12_15, var8_8, var13_16, var11_14, var1_1.s(8.0f), fc.hover());
                            ** GOTO lbl10
                        }
                        case -2116344566: {
                            var16_17 ^= var17_13 ^ 285558894;
                            var17_13 = (var15_12 | var18_11) ^ -52351242;
                            continue block37;
                        }
                        case 217923115: {
                            var3_3[3] = var11_14;
                            var17_13 = (var15_12 | var18_11) ^ 772127653;
                            continue block37;
                        }
                        case -1246186071: {
                            var16_17 ^= var17_13 ^ -623910463;
                            var17_13 = (var15_12 | var18_11) ^ -1557946236;
                            continue block37;
                        }
                        case 1074021235: {
                            var14_18 = var7_7 + var10_10;
                            var17_13 = (var15_12 | var18_11) ^ 29612295;
                            ** GOTO lbl106
                        }
                        case -354663151: {
                            var16_17 ^= var17_13 ^ -790591237;
                            ** break;
                        }
                        case 1396682841: {
                            if (var1_1.hover(var12_15, var8_8, var13_16, var11_14)) ** break;
                            ** continue;
                            var17_13 = (var15_12 | var18_11) ^ 1754586640;
                            continue block37;
                        }
                        case 881038512: {
                            var16_17 ^= var17_13 ^ -305312091;
                            var17_13 = (var15_12 | var18_11) ^ -1799084115;
                            continue block37;
                        }
                        case 2030629477: {
                            var16_17 ^= var17_13 ^ -1014154300;
                            var17_13 = (var15_12 | var18_11) ^ -270869028;
                            continue block37;
                        }
                        case 991607042: {
                            var3_3[0] = var12_15;
                            var17_13 = (var15_12 | var18_11) ^ 1157815230;
                            continue block37;
                        }
                        case -2085601013: {
                            var3_3[1] = var8_8;
                            var17_13 = (var15_12 | var18_11) ^ -1558441251;
                            continue block37;
                        }
lbl86:
                        // 1 sources

                        var17_13 = (var15_12 | var18_11) ^ 745463716;
lbl87:
                        // 3 sources

                        default: {
                            continue block37;
                        }
                        case -368493801: 
                    }
                    var3_3[2] = var13_16;
                    ** break;
lbl92:
                    // 1 sources

                    var17_13 = (var15_12 | var18_11) ^ 442903302;
                    continue;
                }
                var17_13 = (var15_12 | var18_11) ^ 233759168;
            }
lbl97:
            // 1 sources

            while (true) {
                var17_13 = (var15_12 | var18_11) ^ 1090752309;
                ** GOTO lbl106
                break;
            }
        }
        v0 = lq.zS(((var16_17 ^= 367059278) | var18_11) ^ -78731789, (var15_12 | var18_11) ^ ((var16_17 | var18_11) ^ 963679439));
        block39: while (true) {
            var16_17 ^= 846785313;
            var1_1.text(var4_4, var14_18, v1, v2, v0);
            var17_13 = (var15_12 | var18_11) ^ 61561879;
lbl106:
            // 3 sources

            block40: while (true) {
                switch (var17_13) {
                    default: {
                        continue block40;
                    }
                    case -349023402: {
                        var16_17 ^= var17_13 ^ 88811598;
                        var17_13 = (var15_12 | var18_11) ^ -1855067348;
                        continue block40;
                    }
                    case -1738019141: {
                        var1_1.text(var5_5, var14_18, var8_8 + var1_1.s(30.0f), var1_1.s(10.0f), lq.zS((var16_17 | var17_13 ^ 854419614) ^ (var17_13 ^ 1931219603), (var15_12 | var17_13 ^ 854419614) ^ ((var16_17 | var17_13 ^ 854419614) ^ (var17_13 ^ -119290325))));
                        var17_13 = (var15_12 | var18_11) ^ 1546923989;
                        continue block40;
                    }
                    case -1373812824: {
                        var16_17 ^= var17_13 ^ -1067922944;
                        ** continue;
                    }
                    case -1401568584: {
                        var16_17 ^= var17_13 ^ -1934462905;
                        var17_13 = (var15_12 | var18_11) ^ 934899732;
                        continue block40;
                    }
                    case -202722950: {
                        var16_17 ^= var17_13 ^ -1496117646;
                        var17_13 = (var15_12 | var18_11) ^ 827079213;
                        continue block40;
                    }
                    case 350743210: {
                        var2_2.render(var1_1);
                        var17_13 = (var15_12 | var18_11) ^ 1156369913;
                        continue block40;
                    }
                    case -287501926: {
                        v1 = var8_8 + var1_1.s(15.0f);
                        v2 = var1_1.s(13.0f);
                        if (!var6_6) ** continue;
                        v0 = lq.zS(((var16_17 ^= 367059278) | var18_11) ^ -78731792, (var15_12 | var18_11) ^ ((var16_17 | var18_11) ^ -450622441));
                        continue block39;
                    }
                    case -1634556798: {
                        var2_2.frame(var7_7 + var9_9 - var10_10 - var1_1.s(38.0f), var8_8 + (var11_14 - var1_1.s(20.0f)) / 2.0f, var1_1.s(38.0f), var1_1.s(20.0f));
                        var17_13 = (var15_12 | var18_11) ^ 1610550946;
                        continue block40;
                    }
                    case -266235891: {
                        var16_17 ^= var17_13 ^ 711297365;
                        var17_13 = (var15_12 | var18_11) ^ -1153862651;
                        continue block40;
                    }
                    case 1051948419: 
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
    private static boolean zP(float[] var0, double var1_1, double var3_2) {
        var8_3 = -330856161;
        var5_4 = lq.a & -330856161 ^ 1058359582;
        var7_5 = 0;
        var6_6 = (var5_4 | var8_3) ^ -241575875;
        var7_5 = (var5_4 | var8_3) ^ -779877726;
        if (true) ** GOTO lbl9
        block17: while (true) {
            var7_5 = (var5_4 | var8_3) ^ -520678503;
lbl9:
            // 2 sources

            block18: while (true) {
                switch (var7_5) {
                    case -2142112905: {
                        var6_6 ^= var7_5 ^ 1665381813;
                        ** GOTO lbl37
                    }
                    case 1971336426: {
                        if (var3_2 >= (double)var0[1]) {
                            var7_5 = (var5_4 | var8_3) ^ 965263583;
                            continue block18;
                        }
                        ** GOTO lbl70
                    }
                    case 404680088: {
                        var6_6 ^= var7_5 ^ -243383986;
                        var7_5 = (var5_4 | var8_3) ^ 768642820;
                        continue block18;
                    }
                    case -958461504: {
                        var7_5 = (var5_4 | var8_3) ^ 1183689197;
                        break;
                    }
                    case -1917162655: {
                        v0 = false;
                        ** GOTO lbl31
                    }
                    case -762886629: {
                        v0 = true;
lbl31:
                        // 2 sources

                        var6_6 ^= 1369187409;
                        return v0;
                    }
                    case -1722141343: {
                        if (var0[2] > 0.0f) {
                            continue block17;
                        }
                        ** GOTO lbl70
                    }
lbl37:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ 1712192638;
                    break;
                    case 785632189: {
                        var7_5 = (var5_4 | var8_3) ^ 2131114600;
                        continue block18;
                    }
                    case 1915658077: {
                        if (var1_1 < (double)(var0[0] + var0[2])) {
                            var7_5 = (var5_4 | var8_3) ^ 1590978398;
                            break;
                        }
                        ** GOTO lbl70
                    }
                    case -849493855: {
                        if (!(var1_1 >= (double)var0[0])) ** GOTO lbl70
                        ** GOTO lbl52
                    }
                    case 1712188500: {
                        ** GOTO lbl54
                    }
lbl52:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ -1722145461;
                    continue block18;
lbl54:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ -1921427902;
                    continue block18;
                    case 530635398: {
                        var7_5 = (var5_4 | var8_3) ^ 839518654;
                        break;
                    }
                    case -1585205695: {
                        var7_5 = (var5_4 | var8_3) ^ -1965556235;
                        continue block18;
                    }
                    case 1568869083: {
                        var6_6 ^= var7_5 ^ -1260149235;
                        var7_5 = (var5_4 | var8_3) ^ 1928176254;
                        break;
                    }
                    case -1176870670: {
                        if (var3_2 < (double)(var0[1] + var0[3])) {
                            var7_5 = (var5_4 | var8_3) ^ -414636921;
                            break;
                        }
lbl70:
                        // 6 sources

                        var7_5 = (var5_4 | var8_3) ^ -1563114556;
                    }
                }
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public boolean mouseDown(W var1_1, double var2_2, double var4_3, int var6_4) {
        block74: {
            var12_5 = -2032553606;
            var9_6 = lq.a & -2032553606 ^ -217634792;
            var11_7 = 0;
            var10_8 = (var9_6 | var12_5) ^ 622314313;
            var11_7 = (var9_6 | var12_5) ^ 1644810079;
            ** GOTO lbl76
lbl7:
            // 1 sources

            while (true) {
                var11_7 = (var9_6 | var12_5) ^ 433595064;
                break block74;
                break;
            }
            while (true) {
                var11_7 = (var9_6 | var12_5) ^ 1043536785;
                ** GOTO lbl123
                break;
            }
lbl13:
            // 2 sources

            while (true) {
                var11_7 = (var9_6 | var12_5) ^ 2115522536;
                ** GOTO lbl123
                break;
            }
lbl16:
            // 1 sources

            while (true) {
                var11_7 = (var9_6 | var12_5) ^ -28557528;
                break block74;
                break;
            }
lbl19:
            // 1 sources

            while (true) {
                var11_7 = (var9_6 | var12_5) ^ 660996469;
                ** GOTO lbl123
lbl22:
                // 2 sources

                while (true) {
                    var11_7 = (var9_6 | var12_5) ^ -191402653;
                    ** GOTO lbl123
                    break;
                }
                break;
            }
lbl25:
            // 1 sources

            while (true) {
                var11_7 = (var9_6 | var12_5) ^ -1617010646;
                ** GOTO lbl200
                break;
            }
lbl28:
            // 1 sources

            while (true) {
                var11_7 = (var9_6 | var12_5) ^ 508955694;
                ** GOTO lbl123
                break;
            }
lbl31:
            // 1 sources

            while (true) {
                var11_7 = (var9_6 | var12_5) ^ -882944829;
                ** GOTO lbl123
                break;
            }
        }
        block60: while (true) {
            switch (var11_7) {
                case -1124196108: {
                    var10_8 ^= var11_7 ^ -335442611;
                    var11_7 = (var9_6 | var12_5) ^ 814828550;
                    continue block60;
                }
                case -1353034823: {
                    var10_8 ^= var11_7 ^ 123409358;
                    var11_7 = (var9_6 | var12_5) ^ -1480112859;
                    continue block60;
                }
                case 1880447785: {
                    var10_8 ^= var11_7 ^ 177460124;
                    ** break;
                }
                case -1524453522: {
                    ** GOTO lbl78
                }
                case 1435426012: {
                    if (this.a.mouseDown(var1_1, var2_2, var4_3, var6_4)) {
                        ** break;
                    }
                    ** GOTO lbl85
                }
lbl54:
                // 1 sources

                var11_7 = (var9_6 | var12_5) ^ 2057670288;
                ** GOTO lbl76
                case -1748221013: {
                    var11_7 = (var9_6 | var12_5) ^ 1016854396;
                    continue block60;
                }
lbl59:
                // 1 sources

                var11_7 = (var9_6 | var12_5) ^ 1260493198;
                continue block60;
                case 364175437: {
                    if (!this.a.isListening()) ** GOTO lbl85
                    var11_7 = (var9_6 | var12_5) ^ 1392317972;
                    ** GOTO lbl76
                }
                case -884716026: {
                    if (!(var4_3 > (double)(this.b + this.a))) ** GOTO lbl83
                    ** GOTO lbl-1000
                }
                case -558668157: {
                    if (var4_3 < (double)this.b) lbl-1000:
                    // 2 sources

                    {
                        var11_7 = (var9_6 | var12_5) ^ -632225228;
                    } else {
                        var11_7 = (var9_6 | var12_5) ^ 1611922129;
                    }
                    ** GOTO lbl76
                }
                case -1921370134: {
                    var11_7 = this.a.barMouseDown(var1_1, var2_2, var4_3, (float)(this.y + this.B - var1_1.s(4.0f)), this.b, this.a) != false ? (var9_6 | var12_5) ^ -545083639 : (var9_6 | var12_5) ^ -124224220;
                }
lbl76:
                // 8 sources

                default: {
                    continue block60;
                }
lbl78:
                // 1 sources

                var11_7 = (var9_6 | var12_5) ^ -1571723866;
                continue block60;
                case -1781107163: {
                    var11_7 = (var9_6 | var12_5) ^ -212419786;
                    ** GOTO lbl76
                }
lbl83:
                // 1 sources

                var11_7 = (var9_6 | var12_5) ^ 1485171395;
                continue block60;
lbl85:
                // 2 sources

                var11_7 = (var9_6 | var12_5) ^ -2016746925;
                continue block60;
                case 256361566: {
                    var10_8 ^= var11_7 ^ 1247714708;
                    ** GOTO lbl103
                }
                case 76087884: {
                    var10_8 ^= var11_7 ^ -1538146157;
                    var11_7 = (var9_6 | var12_5) ^ -496281289;
                    continue block60;
                }
                case 1343814751: {
                    var7_9 = this.a.iterator();
                    ** GOTO lbl13
                }
                case 677189235: {
                    var10_8 ^= var11_7 ^ -1131717574;
                    ** continue;
                }
                case 764328782: {
                    var10_8 ^= var11_7 ^ 1055293007;
                    ** continue;
                }
lbl103:
                // 1 sources

                var11_7 = (var9_6 | var12_5) ^ 695001081;
                continue block60;
                case -951126660: {
                    return true;
                }
                case 160663122: {
                    return false;
                }
lbl109:
                // 1 sources

                while (true) {
                    var11_7 = (var9_6 | var12_5) ^ -207010081;
                    ** GOTO lbl123
lbl112:
                    // 1 sources

                    while (true) {
                        var11_7 = (var9_6 | var12_5) ^ -1983089439;
                        if (true) ** GOTO lbl123
                        break;
                    }
                    break;
                }
lbl115:
                // 1 sources

                while (true) {
                    var11_7 = (var9_6 | var12_5) ^ -27415678;
                    ** GOTO lbl200
                    break;
                }
                block65: while (true) {
                    var11_7 = (var9_6 | var12_5) ^ -606735734;
                    if (true) ** GOTO lbl123
                    block66: while (true) {
                        var11_7 = (var9_6 | var12_5) ^ -468373401;
lbl123:
                        // 10 sources

                        block67: while (true) {
                            switch (var11_7) {
                                case 1812649340: {
                                    if (var7_9.hasNext()) {
                                        ** continue;
                                    }
                                    ** GOTO lbl164
                                }
                                case -376851116: {
                                    var10_8 ^= var11_7 ^ 355424980;
                                    var11_7 = (var9_6 | var12_5) ^ 177770807;
                                    continue block67;
                                }
                                case -45668275: {
                                    this.b.toggle();
                                    var11_7 = (var9_6 | var12_5) ^ -1719392975;
                                    continue block67;
                                }
                                case -1983383918: {
                                    var10_8 ^= var11_7 ^ 44355204;
                                    var11_7 = (var9_6 | var12_5) ^ -1680511994;
                                    continue block67;
                                }
                                case 913621857: {
                                    var10_8 ^= var11_7 ^ 911351314;
                                    var11_7 = (var9_6 | var12_5) ^ -1947807644;
                                    continue block67;
                                }
                                case -118097317: {
                                    if (!lq.zP(this.a, var2_2, var4_3)) ** continue;
                                    ** continue;
                                }
                                case 55104537: {
                                    var10_8 ^= var11_7 ^ 1066475271;
                                    ** GOTO lbl176
                                }
                                case 1851497547: {
                                    var10_8 ^= var11_7 ^ -658531925;
                                    ** continue;
                                }
                                case 2084137246: {
                                    if (var6_4 != 0) ** GOTO lbl22
                                    var11_7 = (var9_6 | var12_5) ^ 626344688;
                                    continue block67;
                                }
                                case -762643574: {
                                    var10_8 ^= var11_7 ^ 979159799;
                                    ** GOTO lbl181
                                }
                                case 332040477: {
                                    var8_10 = (hT)var7_9.next();
                                    ** GOTO lbl174
                                }
lbl164:
                                // 1 sources

                                var11_7 = (var9_6 | var12_5) ^ -1045726693;
                                ** GOTO lbl182
                                case -793135089: {
                                    if (lq.zP(this.b, var2_2, var4_3)) ** break;
                                    ** continue;
                                    var11_7 = (var9_6 | var12_5) ^ 729177807;
                                    ** GOTO lbl182
                                }
                                case 211556324: {
                                    var10_8 ^= var11_7 ^ -338027156;
                                    ** continue;
                                }
lbl174:
                                // 1 sources

                                var11_7 = (var9_6 | var12_5) ^ 1282966283;
                                ** GOTO lbl216
lbl176:
                                // 1 sources

                                var11_7 = (var9_6 | var12_5) ^ -1535762384;
                                ** GOTO lbl182
                                case 2115227035: {
                                    var10_8 ^= var11_7 ^ -979181723;
                                    continue block66;
                                }
lbl181:
                                // 1 sources

                                var11_7 = (var9_6 | var12_5) ^ 254427937;
lbl182:
                                // 5 sources

                                default: {
                                    continue block67;
                                }
                                case -592844875: {
                                    var10_8 ^= var11_7 ^ -1530057389;
                                    continue block65;
                                }
                                case -907238677: {
                                    var10_8 ^= var11_7 ^ 557486998;
                                    ** continue;
                                }
                                case 738872304: {
                                    this.a.toggle();
                                    var11_7 = (var9_6 | var12_5) ^ -79450466;
                                    continue block67;
                                }
                                case 74907557: {
                                    return true;
                                }
                                case 1403623754: {
                                    return false;
                                }
                                case 1015082425: 
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                return true;
lbl200:
                // 2 sources

                block68: while (true) {
                    switch (var11_7) {
                        case -1351929230: {
                            if (var8_10.mouseDown(var1_1, var2_2, var4_3, var6_4)) {
                                var11_7 = (var9_6 | var12_5) ^ 1647382112;
                                continue block68;
                            }
                            ** GOTO lbl213
                        }
                        case -1779517670: {
                            var10_8 ^= var11_7 ^ -239195643;
                            ** continue;
                        }
                        case -1146668431: {
                            var10_8 ^= var11_7 ^ -1784456168;
                            ** GOTO lbl215
                        }
lbl213:
                        // 1 sources

                        var11_7 = (var9_6 | var12_5) ^ -1601235186;
                        ** GOTO lbl216
lbl215:
                        // 1 sources

                        var11_7 = (var9_6 | var12_5) ^ 1488227080;
lbl216:
                        // 4 sources

                        default: {
                            continue block68;
                        }
                        case 1749145936: {
                            ** continue;
                        }
                        case 1464905332: {
                            var10_8 ^= var11_7 ^ 1233576693;
                            ** continue;
                        }
                        case 159519480: 
                    }
                    break;
                }
                return true;
                case -301491262: 
            }
            break;
        }
        return true;
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean mouseUp(W var1_1, double var2_2, double var4_3, int var6_4) {
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
    @Override
    public boolean mouseDrag(W var1_1, double var2_2, double var4_3, int var6_4, double var7_5, double var9_6) {
        block38: {
            break block38;
lbl1:
            // 1 sources

            while (true) {
                var15_9 = (var13_8 | var16_7) ^ -248283399;
                ** GOTO lbl86
                while (true) {
                    var15_9 = (var13_8 | var16_7) ^ 131736636;
                    ** GOTO lbl86
                    break;
                }
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                var15_9 = (var13_8 | var16_7) ^ -1184437897;
                ** GOTO lbl54
                break;
            }
        }
        var16_7 = -831721333;
        var13_8 = lq.a & -831721333 ^ -1775766789;
        var15_9 = 0;
        var14_10 = (var13_8 | var16_7) ^ -797431935;
        var15_9 = (var13_8 | var16_7) ^ -136982708;
        block28: while (true) {
            switch (var15_9) {
                case -1895183311: {
                    var14_10 ^= var15_9 ^ -2048358986;
                    ** break;
                }
                case 2079365798: {
                    var15_9 = !this.a.barMouseDrag(var4_3, (float)this.w) ? (var13_8 | var16_7) ^ 1365655242 : (var13_8 | var16_7) ^ 1426627672;
                    ** GOTO lbl25
                }
lbl24:
                // 1 sources

                var15_9 = (var13_8 | var16_7) ^ -2079907249;
lbl25:
                // 3 sources

                default: {
                    continue block28;
                }
                case 700071351: {
                    ** GOTO lbl40
                }
                case 1516818612: {
                    var11_11 = this.a.iterator();
                    ** GOTO lbl-1000
                }
                case 980935945: {
                    var14_10 ^= var15_9 ^ -1355225948;
                    ** GOTO lbl38
                }
                case -1956155741: {
                    var14_10 ^= var15_9 ^ -1686102080;
                    ** GOTO lbl42
                }
lbl38:
                // 1 sources

                var15_9 = (var13_8 | var16_7) ^ -1516279715;
                continue block28;
lbl40:
                // 1 sources

                var15_9 = (var13_8 | var16_7) ^ -468183054;
                continue block28;
lbl42:
                // 1 sources

                var15_9 = (var13_8 | var16_7) ^ 1913684365;
                continue block28;
                case -1400933514: 
            }
            break;
        }
        return true;
lbl46:
        // 1 sources

        while (true) {
            var15_9 = (var13_8 | var16_7) ^ -1011675314;
            ** GOTO lbl86
            break;
        }
lbl49:
        // 1 sources

        while (true) {
            var15_9 = (var13_8 | var16_7) ^ 1223750552;
            if (true) ** GOTO lbl54
            break;
        }
        block31: while (true) {
            var15_9 = (var13_8 | var16_7) ^ -1402226592;
lbl54:
            // 3 sources

            block32: while (true) {
                switch (var15_9) {
                    case 1912883867: {
                        if (var12_12.mouseDrag(var1_1, var2_2, var4_3, var6_4, var7_5, var9_6)) {
                            ** continue;
                        }
                        ** GOTO lbl66
                    }
                    case -1767964317: {
                        var14_10 ^= var15_9 ^ 903132791;
                        ** GOTO lbl68
                    }
                    case -437213746: {
                        var14_10 ^= var15_9 ^ 1279026992;
                        ** continue;
                    }
lbl66:
                    // 1 sources

                    var15_9 = (var13_8 | var16_7) ^ 1000298293;
                    ** GOTO lbl76
lbl68:
                    // 1 sources

                    var15_9 = (var13_8 | var16_7) ^ -233594410;
                    ** GOTO lbl76
                    case 374119689: {
                        var14_10 ^= var15_9 ^ 840026091;
                        continue block31;
                    }
                    case 1728650124: lbl-1000:
                    // 2 sources

                    {
                        var15_9 = (var13_8 | var16_7) ^ -173411723;
                        if (true) ** GOTO lbl95
                    }
lbl76:
                    // 4 sources

                    default: {
                        continue block32;
                    }
                    case 746345261: 
                }
                break;
            }
            break;
        }
        return true;
        block34: while (true) {
            block39: {
                var15_9 = (var13_8 | var16_7) ^ 596084028;
                break block39;
lbl83:
                // 1 sources

                while (true) {
                    var15_9 = (var13_8 | var16_7) ^ -937201678;
                    ** GOTO lbl76
                    break;
                }
            }
            block36: while (true) {
                switch (var15_9) {
                    case 794594306: {
                        if (!var11_11.hasNext()) ** continue;
                        ** continue;
                    }
                    case 501022133: {
                        var14_10 ^= var15_9 ^ -1504152296;
                        var15_9 = (var13_8 | var16_7) ^ 432866285;
                    }
lbl95:
                    // 3 sources

                    default: {
                        continue block36;
                    }
                    case 734396558: {
                        var14_10 ^= var15_9 ^ 500371519;
                        ** continue;
                    }
                    case -945622762: {
                        var12_12 = (hT)var11_11.next();
                        ** continue;
                    }
                    case -642394425: {
                        var14_10 ^= var15_9 ^ -853575788;
                        continue block34;
                    }
                    case -35096633: 
                }
                break;
            }
            break;
        }
        return false;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    @Override
    public boolean scroll(W w2, double d2, double d3, double d4) {
        int n2 = a & 0x39EBDF07 ^ 0x1305BA78;
        int n3 = 0;
        int n4 = (n2 | 0x39EBDF07) ^ 0x7431516E;
        n3 = (n2 | 0x39EBDF07) ^ 0x9FD92669;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1539909354: {
                    n3 = (n2 | 0x39EBDF07) ^ 0x19141B61;
                    continue block5;
                }
                case 586933278: {
                    n4 ^= n3 ^ 0x3256E8E5;
                    n3 = (n2 | 0x39EBDF07) ^ 0xCA762DE9;
                    continue block5;
                }
                case -241577322: 
            }
            break;
        }
        return this.a.scroll(d4, w2.s(46.0f));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public boolean key(W var1_1, int var2_2, int var3_3) {
        var4_4 = lq.a & 2121361913 ^ -1118611315;
        var6_5 = 0;
        var5_6 = (var4_4 | 2121361913) ^ -1852621154;
        var6_5 = (var4_4 | 2121361913) ^ 380377077;
        if (true) ** GOTO lbl10
        block5: while (true) {
            switch (var6_5) {
                case -371233272: {
                    var6_5 = (var4_4 | 2121361913) ^ -1400874102;
                }
lbl10:
                // 3 sources

                default: {
                    continue block5;
                }
                case 1408442999: {
                    var5_6 ^= var6_5 ^ -1525055787;
                    var6_5 = (var4_4 | 2121361913) ^ -2057300758;
                    continue block5;
                }
                case 2048093463: 
            }
            break;
        }
        return this.a.key(var1_1, var2_2, var3_3);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean isModal() {
        int n2 = a & 0xAD9FA907 ^ 0x976EB97C;
        int n3 = 0;
        int n4 = (n2 | 0xAD9FA907) ^ 0x7BF78909;
        n3 = (n2 | 0xAD9FA907) ^ 0xADBB3C36;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 909644188: {
                    n4 ^= n3 ^ 0x5A843860;
                    n3 = (n2 | 0xAD9FA907) ^ 0x1E7FB73C;
                    continue block5;
                }
                case -1585443261: {
                    return this.a.isListening();
                }
                case 306480457: 
            }
            n3 = (n2 | 0xAD9FA907) ^ 0x89C7A8E3;
        }
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void zQ(Integer var0) {
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
    private static /* synthetic */ Integer zR() {
        int n2 = a & 0xB96BD2E7 ^ 0x8B6CA7CD;
        int n3 = 0;
        int n4 = (n2 | 0xB96BD2E7) ^ 0x380C4A2F;
        n3 = (n2 | 0xB96BD2E7) ^ 0x9264CD0A;
        block5: while (true) {
            switch (n3) {
                case -1660337840: {
                    n4 ^= n3 ^ 0x766F83A9;
                    n3 = (n2 | 0xB96BD2E7) ^ 0x6227E0A9;
                    continue block5;
                }
                case -649586874: {
                    return H.get().getClickGuiKey();
                }
                case 688601829: {
                    n3 = (n2 | 0xB96BD2E7) ^ 0x2666B6BF;
                }
            }
        }
    }

    private static int zS(int n2, int n3) {
        int n4 = -2033261159;
        int n5 = -1429701997;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xBF6B85C7)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xAECE831A;
        n6 ^= (n5 | n4) ^ 0xAECECBDD;
        n6 ^= (n5 | n4) ^ 0xAECEA5FD;
        n6 += (n5 | n4) ^ 0xAECE2B36;
        n6 += (n5 | n4) ^ 0xAECEDC73;
        n6 -= (n5 | n4) ^ 0xAECE62CF;
        n6 ^= (n5 | n4) ^ 0xAECEE18E;
        n6 += (n5 | n4) ^ 0xAECE4F73;
        n6 -= (n5 | n4) ^ 0xAECEE86D;
        return n6 += (n5 | n4) ^ 0xAECE3482;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void zT(Float f2) {
        int n2 = a & 0xA1F9F4F6 ^ 0xB2DCE49B;
        int n3 = 0;
        int n4 = (n2 | 0xA1F9F4F6) ^ 0xA8043B;
        n3 = (n2 | 0xA1F9F4F6) ^ 0x7812C0BB;
        while (true) {
            switch (n3) {
                case -1760366609: {
                    n4 ^= n3 ^ 0xB1104D6D;
                    n3 = (n2 | 0xA1F9F4F6) ^ 0x14E21273;
                    break;
                }
                case -1491081588: {
                    dm.setTooltipDelay(f2.floatValue() / 1000.0f);
                    return;
                }
                case -873515964: {
                    n3 = (n2 | 0xA1F9F4F6) ^ 0x24EF1B10;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Float zU() {
        int n2 = a & 0xD80EDE53 ^ 0x4E900DB7;
        int n3 = 0;
        int n4 = (n2 | 0xD80EDE53) ^ 0x9910D24D;
        n3 = (n2 | 0xD80EDE53) ^ 0x47887DA3;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1726569900: {
                    n3 = (n2 | 0xD80EDE53) ^ 0xABCAD8E5;
                    continue block5;
                }
                case -881799759: {
                    return Float.valueOf(dm.getTooltipDelay() * 1000.0f);
                }
                case 1968441106: 
            }
            n4 ^= n3 ^ 0xBCBA6CD5;
            n3 = (n2 | 0xD80EDE53) ^ 0x15EE1246;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void zV(Float var0) {
        block8: {
            block9: {
                var1_1 = lq.a & -1742281978 ^ 145007404;
                var3_2 = 0;
                ** GOTO lbl18
lbl4:
                // 2 sources

                block5: while (true) {
                    switch (var3_2) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block5;
                            }
                            break;
                        }
                        case 1928903298: {
                            var2_3 ^= var3_2 ^ -415424895;
                            break block8;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | -1742281978) ^ -362915412;
                            ** continue;
                            break;
                        }
                        case 2130668997: {
                            dm.setScrollSpeed(var0.floatValue() / 100.0f);
                            return;
                        }
lbl18:
                        // 1 sources

                        var2_3 = (var1_1 | -1742281978) ^ -1836581132;
                        break block9;
                        case 114347842: {
                            break block5;
                        }
                    }
                    break;
                }
                ** while (true)
            }
            var3_2 = (var1_1 | -1742281978) ^ -1636422548;
            ** GOTO lbl4
        }
        var3_2 = (var1_1 | -1742281978) ^ -430338325;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Float zW() {
        var0 = lq.a & -1132819778 ^ -2102383690;
        var2_1 = 0;
        var1_2 = (var0 | -1132819778) ^ -721130648;
        var2_1 = (var0 | -1132819778) ^ 596845593;
        block5: while (true) {
            switch (var2_1) {
                case -1654026329: {
                    var2_1 = (var0 | -1132819778) ^ 1447158173;
                    ** break;
                }
                case -390378973: {
                    var1_2 ^= var2_1 ^ 182425894;
                    var2_1 = (var0 | -1132819778) ^ 227931051;
                }
lbl13:
                // 3 sources

                default: {
                    continue block5;
                }
                case -1284548587: 
            }
            break;
        }
        return Float.valueOf(dm.getScrollSpeed() * 100.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void zX(Float f2) {
        int n2 = a & 0xE103BA01 ^ 0x146BE663;
        int n3 = 0;
        int n4 = (n2 | 0xE103BA01) ^ 0x29CEFBD;
        n3 = (n2 | 0xE103BA01) ^ 0x759089E1;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1140550355: {
                    dm.setHudScale(f2.floatValue() / 100.0f);
                    return;
                }
                case -2131003518: {
                    n3 = (n2 | 0xE103BA01) ^ 0xC6F3FC0;
                    continue block5;
                }
                case -117128797: 
            }
            n4 ^= n3 ^ 0x23EDFE81;
            n3 = (n2 | 0xE103BA01) ^ 0x496F6B4E;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Float zY() {
        int n2 = a & 0xA72AA518 ^ 0xDCF94B5A;
        int n3 = 0;
        int n4 = (n2 | 0xA72AA518) ^ 0x7EB81674;
        n3 = (n2 | 0xA72AA518) ^ 0xFACC772F;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 87529589: {
                    n3 = (n2 | 0xA72AA518) ^ 0xF2BCFC4;
                    continue block5;
                }
                case -254795618: {
                    n4 ^= n3 ^ 0x7BB7A9E3;
                    n3 = (n2 | 0xA72AA518) ^ 0x6DC70908;
                    continue block5;
                }
                case -1841502638: 
            }
            break;
        }
        return Float.valueOf(dm.getHudScale() * 100.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void zZ(Float f2) {
        int n2 = a & 0xC0AA891B ^ 0x842934CE;
        int n3 = 0;
        int n4 = (n2 | 0xC0AA891B) ^ 0x890CF323;
        n3 = (n2 | 0xC0AA891B) ^ 0x3ADF6785;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -25896358: {
                    n3 = (n2 | 0xC0AA891B) ^ 0xBD179C2B;
                    continue block5;
                }
                case -1414327614: {
                    dm.setGuiScale(f2.floatValue() / 100.0f);
                    return;
                }
                case 2042372596: 
            }
            n4 ^= n3 ^ 0x70CEB592;
            n3 = (n2 | 0xC0AA891B) ^ 0x6F18AF1D;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ Float Aa() {
        block9: {
            block10: {
                break block10;
lbl1:
                // 1 sources

                while (true) {
                    var2_1 = (var0 | 513203205) ^ 56426855;
                    break block9;
lbl4:
                    // 1 sources

                    while (true) {
                        var2_1 = (var0 | 513203205) ^ -2077402636;
                        break block9;
                        break;
                    }
                    break;
                }
            }
            var0 = lq.a & 513203205 ^ 104486289;
            var2_1 = 0;
            var1_2 = (var0 | 513203205) ^ 403216243;
            ** GOTO lbl18
        }
        block7: while (true) {
            switch (var2_1) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block7;
                    }
                    break;
                }
lbl18:
                // 1 sources

                var2_1 = (var0 | 513203205) ^ -908975781;
                ** continue;
                case -680723250: {
                    ** continue;
                }
                case -1701608351: {
                    var1_2 ^= var2_1 ^ 581971251;
                    ** continue;
                }
                case 501472498: 
            }
            break;
        }
        return Float.valueOf(dm.getGuiScale() * 100.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Ab(Float f2) {
        int n2 = a & 0xE1D6140C ^ 0x2DAE1B54;
        int n3 = 0;
        int n4 = (n2 | 0xE1D6140C) ^ 0x1A7E8ABA;
        n3 = (n2 | 0xE1D6140C) ^ 0xB8039AD5;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1111127797: {
                    n4 ^= n3 ^ 0x26019B5A;
                    n3 = (n2 | 0xE1D6140C) ^ 0x733BFADD;
                    continue block5;
                }
                case -1631197823: {
                    dm.setBlurIntensity(f2.floatValue() / 100.0f);
                    return;
                }
                case 1442678153: 
            }
            n3 = (n2 | 0xE1D6140C) ^ 0x503B9657;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Float Ac() {
        int n2 = a & 0xD98577E4 ^ 0xC6C2694;
        int n3 = 0;
        int n4 = (n2 | 0xD98577E4) ^ 0xAB51919E;
        n3 = (n2 | 0xD98577E4) ^ 0x2F13DCAE;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 816616541: {
                    n4 ^= n3 ^ 0x39F58255;
                    n3 = (n2 | 0xD98577E4) ^ 0x73FAE54;
                    continue block5;
                }
                case -218191014: {
                    n3 = (n2 | 0xD98577E4) ^ 0xED41E3A9;
                    continue block5;
                }
                case -623715936: 
            }
            break;
        }
        return Float.valueOf(dm.getBlurIntensity() * 100.0f);
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void Ad(Float var0) {
        block9: {
            block10: {
                break block10;
lbl1:
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
lbl6:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | -1635989800) ^ 911994743;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -1474029174: {
                            var2_3 ^= var3_2 ^ 51283830;
                            break block9;
                        }
                        case -1658697496: {
                            dm.setGuiOpacity(var0.floatValue() / 100.0f);
                            return;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | -1635989800) ^ -176369778;
                            ** continue;
                            break;
                        }
                        case 1795373427: {
                            break block5;
                        }
                    }
                    break;
                }
                ** while (true)
            }
            var1_1 = lq.a & -1635989800 ^ -1941457347;
            var3_2 = 0;
            var2_3 = (var1_1 | -1635989800) ^ 937887469;
            ** while (true)
        }
        var3_2 = (var1_1 | -1635989800) ^ 56475157;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Float Ae() {
        int n2 = a & 0xF8AFF09B ^ 0x5BDED0EA;
        int n3 = 0;
        int n4 = (n2 | 0xF8AFF09B) ^ 0x9083AE8D;
        n3 = (n2 | 0xF8AFF09B) ^ 0x7A2C1931;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0xF8AFF09B) ^ 0xC86AE35D;
            }
            block6: while (true) {
                switch (n3) {
                    default: {
                        continue block6;
                    }
                    case -446556310: {
                        n4 ^= n3 ^ 0x100E4A5;
                        continue block5;
                    }
                    case -2116818486: {
                        n3 = (n2 | 0xF8AFF09B) ^ 0x1E9DE791;
                        continue block6;
                    }
                    case 865407910: 
                }
                break;
            }
            break;
        }
        return Float.valueOf(dm.getGuiOpacity() * 100.0f);
    }
}

