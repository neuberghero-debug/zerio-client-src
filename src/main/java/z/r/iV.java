/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1923
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2547
 *  net.minecraft.class_2596
 *  net.minecraft.class_2680
 *  net.minecraft.class_2767
 *  net.minecraft.class_2818
 *  net.minecraft.class_310
 *  net.minecraft.class_3414
 *  net.minecraft.class_3965
 *  net.minecraft.class_408
 *  net.minecraft.class_4588
 *  net.minecraft.class_7923
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToLongFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2767;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_3965;
import net.minecraft.class_408;
import net.minecraft.class_4588;
import net.minecraft.class_7923;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import z.r.R;
import z.r.W;
import z.r.aE;
import z.r.fO;
import z.r.fc;
import z.r.gF;
import z.r.gH;
import z.r.gP;
import z.r.gj;
import z.r.ig;
import z.r.jx;
import z.r.ke;
import z.r.lG;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class iV
extends gF {
    private static final int a;
    private static final int b;
    private static final /* synthetic */ String a;
    private final ConcurrentHashMap<String, jx> a;
    private static final /* synthetic */ String b;
    private final ke a;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private final gP a;
    private static final /* synthetic */ String e;
    private volatile boolean a;
    private static final /* synthetic */ String f;
    private static final int c;
    private volatile String g;
    private static final int d;
    private static final /* synthetic */ String h;
    private final ke b;
    private static final /* synthetic */ String i;
    private static final int e;
    private static final /* synthetic */ String k;
    private static final int f;
    private static final /* synthetic */ String j;
    private volatile long a;
    private final ke c;
    private static final int g;
    private int h;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private long b;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private final LongAdder a;
    private static final int i;
    private static final /* synthetic */ String r;
    private int j;
    private static final String t;
    private static final int k;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final int l;
    private static final String w;
    private static final /* synthetic */ String x;
    private final gP b;
    private final ke d;
    private static final int m;
    private static final /* synthetic */ String y;
    public static final int w;
    private static final /* synthetic */ String z;
    private volatile int n;
    private volatile int o;
    private static volatile iV a;
    private static final /* synthetic */ String A;
    private static final /* synthetic */ String B;
    private static final /* synthetic */ String C;
    private static final /* synthetic */ String D;
    private static final /* synthetic */ String E;
    private static final String[] a;
    private final ke e;
    private static final int[] a;
    private static final int p;
    private static final /* synthetic */ String F;
    private static final /* synthetic */ String G;
    private static final /* synthetic */ String H;
    private static final int q;
    private static final long c;
    private static final /* synthetic */ String I;
    private static final int r;
    private static final /* synthetic */ String J;
    private static final /* synthetic */ String K;
    private final gP c;
    private int s;
    private static final int t;
    private final ConcurrentHashMap<Long, fO> b;
    private static final /* synthetic */ String L;
    private static final /* synthetic */ String s;
    private final ke f;
    private static final /* synthetic */ String M;
    private static final /* synthetic */ String N;
    private static final /* synthetic */ String O;
    private static final /* synthetic */ String P;
    private final gP d;
    private static final /* synthetic */ String Q;
    private static final int[] b;
    private static final /* synthetic */ String R;
    private static final /* synthetic */ String S;
    private static final /* synthetic */ String T;
    private final aE a;
    private volatile int u;
    private static final /* synthetic */ String U;
    private final gP e;
    private volatile List<R> a;
    private static final /* synthetic */ String V;
    private static final /* synthetic */ String W;
    private static final /* synthetic */ String X;
    private static final double a;
    private static final int v;
    private static final /* synthetic */ String Y;
    private final ke g;
    private static final /* synthetic */ String Z;
    private final ke h;
    private boolean b;
    private final ConcurrentHashMap<Long, int[]> c;
    private static final /* synthetic */ String aa;
    private static final /* synthetic */ String ab;

    /*
     * Enabled aggressive block sorting
     */
    public static iV getInstance() {
        int n2 = w & 0x6516A805 ^ 0xF610BE8A;
        int n3 = 0;
        int n4 = (n2 | 0x6516A805) ^ 0xB73D71E0;
        n3 = (n2 | 0x6516A805) ^ 0x35018891;
        block5: while (true) {
            switch (n3) {
                case -1996975632: {
                    n4 ^= n3 ^ 0xEE389ED2;
                    break;
                }
                case -1038666210: {
                    n3 = (n2 | 0x6516A805) ^ 0x7FEE2F7F;
                }
                default: {
                    continue block5;
                }
                case -243255664: {
                    return a;
                }
            }
            n3 = (n2 | 0x6516A805) ^ 0x696881F;
        }
    }

    /*
     * Exception decompiling
     */
    public iV() {
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
        block43: {
            block44: {
                break block44;
lbl1:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1013589681;
                    ** GOTO lbl47
lbl4:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1026277284;
                        ** GOTO lbl47
                        break;
                    }
lbl7:
                    // 2 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1604941215;
                        ** GOTO lbl47
lbl10:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -819298119;
                            ** GOTO lbl47
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1822834434;
                    ** GOTO lbl47
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ 342060751;
                    break block43;
                    break;
                }
            }
            var4_1 = -1969915035;
            var1_2 = iV.w & -1969915035 ^ 2110330656;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -1204037212;
            ** while (true)
lbl27:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ 679568859;
                ** GOTO lbl94
                break;
            }
lbl30:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1058506594;
                ** GOTO lbl47
                break;
            }
            this.a.reset();
            var3_3 = (var1_2 | var4_1) ^ -1066452903;
            ** GOTO lbl47
lbl36:
            // 1 sources

            block33: while (true) {
                var3_3 = (var1_2 | var4_1) ^ -229463238;
                ** GOTO lbl47
lbl39:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1729040154;
                    if (true) ** GOTO lbl47
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    this.c.clear();
                    ** continue;
                    break;
                }
                block36: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1498953506;
lbl47:
                    // 13 sources

                    block37: while (true) {
                        switch (var3_3) lbl-1000:
                        // 6 sources

                        {
                            while (true) {
                                default: {
                                    continue block37;
                                }
                                break;
                            }
                            case -1501214649: {
                                ** continue;
                            }
                            case -1024016191: {
                                ** continue;
                            }
                            case -1337782099: {
                                ** continue;
                            }
                            case -815622172: {
                                ** continue;
                            }
lbl60:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1323122527;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -1603007750: {
                                break block33;
                            }
                            case -1232857003: {
                                var2_4 ^= var3_3 ^ -1590381695;
                                ** continue;
                            }
lbl68:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1929369026;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -646624757: {
                                switch (var2_4) {
                                    case 1649433014: {
                                        ** continue;
                                    }
                                    case -645388813: {
                                        ** continue;
                                    }
                                    ** default:
lbl78:
                                    // 1 sources

                                    ** continue;
                                }
                            }
                            case -1731039105: {
                                var2_4 ^= var3_3 ^ 22627626;
                                continue block36;
                            }
                            case -301104934: {
                                return;
                            }
lbl84:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1230595888;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 1820639131: {
                                ** continue;
                            }
lbl89:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -21666486;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -1060440057: {
                                break;
                            }
lbl94:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ 298909631;
                            ** continue;
                            case 821559260: {
                                var2_4 ^= var3_3 ^ -855737879;
                                ** GOTO lbl7
                            }
                            case -1325383622: {
                                this.a.clear();
                                ** continue;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            var3_3 = (var1_2 | var4_1) ^ 817883265;
            ** GOTO lbl47
            {
                case 227529823: {
                    this.a = false;
                    break;
                }
            }
        }
        var3_3 = (var1_2 | var4_1) ^ 648557934;
        ** GOTO lbl47
        {
            case -1927107929: {
                var2_4 ^= var3_3 ^ -237386913;
                ** continue;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ 1335783368;
        ** while (true)
        {
            case 1068648252: {
                var2_4 ^= var3_3 ^ 1418204274;
                ** continue;
            }
            case -1011394092: {
                var2_4 ^= var3_3 ^ 632126802;
                ** continue;
            }
            ** case 23599663:
        }
lbl122:
        // 1 sources

        this.b.clear();
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onTick(class_310 var1_1) {
        block91: {
            block100: {
                block96: {
                    block102: {
                        block95: {
                            block101: {
                                block103: {
                                    block97: {
                                        block90: {
                                            block99: {
                                                block104: {
                                                    block93: {
                                                        block92: {
                                                            block98: {
                                                                block94: {
                                                                    break block104;
lbl1:
                                                                    // 1 sources

                                                                    return;
lbl3:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var5_4 = (var3_3 | var6_2) ^ -593524063;
                                                                        break block90;
                                                                        break;
                                                                    }
lbl6:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var5_4 = (var3_3 | var6_2) ^ -1074004159;
                                                                        break block91;
                                                                        break;
                                                                    }
lbl9:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var5_4 = (var3_3 | var6_2) ^ 627981532;
                                                                        break block90;
                                                                        break;
                                                                    }
lbl12:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        this.Nj(var1_1);
                                                                        break block92;
                                                                        break;
                                                                    }
lbl15:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var5_4 = (var3_3 | var6_2) ^ -1687290902;
                                                                        break block91;
                                                                        break;
                                                                    }
lbl18:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (var2_6.equals(this.g)) break block93;
                                                                        break block94;
                                                                        break;
                                                                    }
lbl21:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_5 ^= var5_4 ^ 146215936;
                                                                        break block95;
                                                                        break;
                                                                    }
lbl24:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (++this.s % iV.NJ((var4_5 | var5_4 ^ -1762473912) ^ (var5_4 ^ -1921285945), (var3_3 | var5_4 ^ -1762473912) ^ ((var4_5 | var5_4 ^ -1762473912) ^ (var5_4 ^ 734191704))) != 0) break block92;
                                                                        break block96;
                                                                        break;
                                                                    }
lbl27:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var5_4 = (var3_3 | var6_2) ^ -753481592;
                                                                        break block91;
                                                                        break;
                                                                    }
lbl30:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_5 ^= var5_4 ^ -1315358175;
                                                                        ** GOTO lbl176
                                                                        break;
                                                                    }
lbl33:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var5_4 = (var3_3 | var6_2) ^ 1453328388;
                                                                        break block91;
                                                                        break;
                                                                    }
lbl36:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        this.Ng();
                                                                        ** GOTO lbl161
                                                                        break;
                                                                    }
lbl39:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var5_4 = (var3_3 | var6_2) ^ 460938652;
                                                                        break block90;
                                                                        break;
                                                                    }
lbl42:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (++this.j % iV.NJ((var4_5 | var5_4 ^ 1036940226) ^ (var5_4 ^ 776407386), (var3_3 | var5_4 ^ 1036940226) ^ ((var4_5 | var5_4 ^ 1036940226) ^ (var5_4 ^ 1991646749))) != 0) ** GOTO lbl178
                                                                        break block97;
                                                                        break;
                                                                    }
lbl45:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var5_4 = (var3_3 | var6_2) ^ -208701616;
                                                                        break block91;
lbl48:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            this.Nt(var1_1);
                                                                            ** GOTO lbl166
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                var5_4 = (var3_3 | var6_2) ^ 1429900036;
                                                                break block91;
lbl54:
                                                                // 1 sources

                                                                while (true) {
                                                                    var4_5 ^= var5_4 ^ -957327698;
                                                                    break block98;
                                                                    break;
                                                                }
lbl57:
                                                                // 1 sources

                                                                while (true) {
                                                                    var4_5 ^= var5_4 ^ -798553280;
                                                                    ** GOTO lbl181
                                                                    break;
                                                                }
lbl60:
                                                                // 1 sources

                                                                while (true) {
                                                                    this.Nh(var1_1);
                                                                    ** continue;
                                                                    break;
                                                                }
                                                            }
                                                            var5_4 = (var3_3 | var6_2) ^ -943703950;
                                                            break block91;
                                                        }
                                                        var5_4 = (var3_3 | var6_2) ^ 1648936315;
                                                        break block91;
lbl69:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_5 ^= var5_4 ^ -398960952;
                                                            break block99;
                                                            break;
                                                        }
lbl72:
                                                        // 1 sources

                                                        while (true) {
                                                            var5_4 = (var3_3 | var6_2) ^ -1065033765;
                                                            break block90;
lbl75:
                                                            // 1 sources

                                                            while (var1_1.field_1724 != null) {
                                                                var5_4 = (var3_3 | var6_2) ^ -1817458100;
                                                                break block90;
lbl78:
                                                                // 1 sources

                                                                while (true) {
                                                                    var2_6 = var1_1.field_1687.method_27983().method_29177().toString();
                                                                    ** continue;
                                                                    break;
                                                                }
lbl81:
                                                                // 1 sources

                                                                ** GOTO lbl27
                                                            }
                                                            break block100;
                                                            break;
                                                        }
                                                    }
lbl84:
                                                    // 2 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 654970063;
                                                        break block91;
                                                        break;
                                                    }
lbl87:
                                                    // 1 sources

                                                    while (var1_1.field_1687 != null) {
                                                        ** GOTO lbl155
lbl89:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_5 ^= var5_4 ^ 1753566275;
                                                            ** GOTO lbl183
                                                            break;
                                                        }
lbl92:
                                                        // 1 sources

                                                        while (true) {
                                                            var5_4 = (var3_3 | var6_2) ^ 845600691;
                                                            break block90;
                                                            break;
                                                        }
                                                    }
                                                    break block100;
lbl96:
                                                    // 1 sources

                                                    while (true) {
                                                        this.c.clear();
                                                        ** GOTO lbl168
                                                        break;
                                                    }
lbl99:
                                                    // 1 sources

                                                    while (true) {
                                                        this.b.clear();
                                                        ** GOTO lbl159
                                                        break;
                                                    }
lbl102:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_5 ^= var5_4 ^ 1900191886;
                                                        ** continue;
                                                        break;
                                                    }
lbl105:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 1334314052;
                                                        break block91;
                                                        break;
                                                    }
lbl108:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 798145766;
                                                        break block91;
                                                        break;
                                                    }
lbl111:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 254747900;
                                                        break block91;
                                                        break;
                                                    }
lbl114:
                                                    // 1 sources

                                                    while (true) {
                                                        this.a.reset();
                                                        ** continue;
                                                        break;
                                                    }
lbl117:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_5 ^= var5_4 ^ 769667881;
                                                        break block101;
                                                        break;
                                                    }
lbl120:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_5 ^= var5_4 ^ 1509055494;
                                                        break block102;
                                                        break;
                                                    }
                                                }
                                                var6_2 = -138507904;
                                                var3_3 = iV.w & -138507904 ^ 1471728836;
                                                var5_4 = 0;
                                                var4_5 = (var3_3 | var6_2) ^ 1214712860;
                                                ** while (true)
lbl129:
                                                // 1 sources

                                                while (true) {
                                                    var4_5 ^= var5_4 ^ 719246228;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            var5_4 = (var3_3 | var6_2) ^ -1784120907;
                                            break block91;
                                        }
lbl136:
                                        // 3 sources

                                        block79: while (true) {
                                            switch (var5_4) lbl-1000:
                                            // 4 sources

                                            {
                                                while (true) {
                                                    default: {
                                                        continue block79;
                                                    }
                                                    break;
                                                }
                                                case -975693193: {
                                                    ** continue;
                                                }
                                                case -758058728: {
                                                    ** continue;
                                                }
                                                case 305769324: {
                                                    break block79;
                                                }
                                                case -1361213822: {
                                                    ** GOTO lbl75
                                                }
                                                case 723601253: {
                                                    ** continue;
                                                }
                                                case 926552607: {
                                                    ** GOTO lbl87
                                                }
                                                case -1298739743: {
                                                    ** continue;
                                                }
lbl155:
                                                // 1 sources

                                                var5_4 = (var3_3 | var6_2) ^ -444111192;
                                                ** GOTO lbl-1000
                                                case -322465704: {
                                                    ** continue;
                                                }
lbl159:
                                                // 1 sources

                                                var5_4 = (var3_3 | var6_2) ^ -898423923;
                                                break block91;
lbl161:
                                                // 1 sources

                                                var5_4 = (var3_3 | var6_2) ^ 725117470;
                                                break block91;
lbl163:
                                                // 1 sources

                                                while (true) {
                                                    var4_5 ^= var5_4 ^ -114060116;
                                                    ** continue;
                                                    break;
                                                }
lbl166:
                                                // 1 sources

                                                var5_4 = (var3_3 | var6_2) ^ 949689075;
                                                break block91;
lbl168:
                                                // 1 sources

                                                var5_4 = (var3_3 | var6_2) ^ -715078125;
                                                break block91;
lbl170:
                                                // 1 sources

                                                while (true) {
                                                    var4_5 ^= var5_4 ^ 1314755904;
                                                    break block103;
lbl173:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 1974908014;
                                                        break block91;
                                                        break;
                                                    }
                                                    break;
                                                }
lbl176:
                                                // 1 sources

                                                var5_4 = (var3_3 | var6_2) ^ -34989979;
                                                ** GOTO lbl-1000
lbl178:
                                                // 2 sources

                                                while (true) {
                                                    var5_4 = (var3_3 | var6_2) ^ 833545008;
                                                    break block91;
                                                    break;
                                                }
lbl181:
                                                // 1 sources

                                                var5_4 = (var3_3 | var6_2) ^ -994852222;
                                                break block91;
lbl183:
                                                // 1 sources

                                                var5_4 = (var3_3 | var6_2) ^ -1003840769;
                                                ** continue;
                                            }
                                            break;
                                        }
                                        var5_4 = (var3_3 | var6_2) ^ 1499679558;
                                        ** GOTO lbl136
                                        {
                                            case 865359675: {
                                                return;
                                            }
                                        }
lbl189:
                                        // 1 sources

                                        while (true) {
                                            var4_5 ^= var5_4 ^ -212048388;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    var5_4 = (var3_3 | var6_2) ^ 685011818;
                                    break block91;
                                }
                                var5_4 = (var3_3 | var6_2) ^ -37962287;
                                break block91;
                            }
                            var5_4 = (var3_3 | var6_2) ^ 1036924806;
                            break block91;
lbl201:
                            // 1 sources

                            while (true) {
                                this.g = var2_6;
                                ** continue;
                                break;
                            }
                            {
                                case 1679099784: {
                                    var4_5 ^= var5_4 ^ -907584758;
                                    ** continue;
                                }
                            }
                        }
                        var5_4 = (var3_3 | var6_2) ^ -1762489332;
                        break block91;
                    }
                    var5_4 = (var3_3 | var6_2) ^ 2071047392;
                    break block91;
                }
                var5_4 = (var3_3 | var6_2) ^ 1742933016;
                break block91;
            }
lbl217:
            // 2 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ 1160249381;
                ** continue;
                break;
            }
lbl220:
            // 1 sources

            while (true) {
                this.Nx();
                ** continue;
                break;
            }
            {
                ** case 173331873:
            }
lbl224:
            // 1 sources

            ** while (!this.isEnabled())
lbl225:
            // 1 sources

            ** while (true)
        }
        block89: while (true) {
            switch (var5_4) {
                default: {
                    continue block89;
                }
                case 167931925: {
                    ** continue;
                }
                case 70367892: {
                    ** continue;
                }
                case 1212494469: {
                    ** continue;
                }
                case -819603657: {
                    ** continue;
                }
                case 1632387528: {
                    ** continue;
                }
                case -1591818816: {
                    ** continue;
                }
                case -898565566: {
                    ** continue;
                }
                case -124655304: {
                    ** continue;
                }
                case -546652498: {
                    ** continue;
                }
                case -668176094: {
                    ** continue;
                }
                case -1568389440: {
                    ** continue;
                }
                case 1645655153: {
                    ** continue;
                }
                case -595154982: {
                    ** continue;
                }
                case -1932566236: {
                    ** continue;
                }
                case 813626806: {
                    ** continue;
                }
                case -793460469: {
                    ** continue;
                }
                case -1872903716: {
                    ** continue;
                }
                case -1204369024: {
                    ** continue;
                }
                case -1779038017: {
                    ** continue;
                }
                case 1036906057: {
                    ** continue;
                }
                case 584977367: {
                    ** continue;
                }
                case 614991180: {
                    ** continue;
                }
                case -972017932: {
                    ** continue;
                }
                case 1825781294: {
                    ** continue;
                }
                case 856493894: {
                    ** continue;
                }
                ** case -2113373782:
lbl282:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void Ng() {
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
    private void Nh(class_310 var1_1) {
        block79: {
            block78: {
                block81: {
                    block80: {
                        block82: {
                            block84: {
                                block83: {
                                    break block83;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -1324891688;
                                        break block78;
                                        break;
                                    }
lbl4:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ 928141977;
                                        break block78;
                                        break;
                                    }
lbl7:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -432180025;
                                        break block78;
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -1423811515;
                                        ** GOTO lbl28
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        if (!((Boolean)this.f.getValue()).booleanValue()) ** GOTO lbl43
                                        ** continue;
                                        break;
                                    }
lbl16:
                                    // 1 sources

                                    block44: while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ 506763190;
                                        break block78;
lbl19:
                                        // 1 sources

                                        while (true) {
                                            var5_4 = (var3_3 | var6_2) ^ -653738251;
                                            break block78;
lbl22:
                                            // 1 sources

                                            while (true) {
                                                var4_6 ^= var5_4 ^ 874579295;
                                                ** GOTO lbl60
                                                break;
                                            }
lbl25:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ 1557074126;
                                                break block78;
                                                break;
                                            }
lbl28:
                                            // 5 sources

                                            block48: while (true) {
                                                switch (var5_4) lbl-1000:
                                                // 12 sources

                                                {
                                                    default: {
                                                        continue block48;
                                                    }
lbl32:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_6 ^= var5_4 ^ 305029511;
                                                        break block79;
                                                        break;
                                                    }
                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ -933740843;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl38:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_6 ^= var5_4 ^ -1686032607;
                                                        ** continue;
                                                        break;
                                                    }
lbl41:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl43:
                                                    // 1 sources

                                                    var5_4 = (var3_3 | var6_2) ^ -1852073003;
                                                    break block78;
lbl45:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 1777238100;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl48:
                                                    // 1 sources

                                                    while (true) {
                                                        this.a = this.b;
                                                        ** GOTO lbl227
                                                        break;
                                                    }
lbl51:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_6 ^= var5_4 ^ 813888698;
                                                        break block80;
                                                        break;
                                                    }
lbl54:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ -1759681266;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl57:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 1214790960;
                                                        break block78;
                                                        break;
                                                    }
lbl60:
                                                    // 1 sources

                                                    var5_4 = (var3_3 | var6_2) ^ -1201584885;
                                                    break block78;
lbl62:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 1846444275;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl65:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ -2022616635;
                                                        break block78;
                                                        break;
                                                    }
lbl68:
                                                    // 2 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ -113284117;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
                                                    case -1540799554: {
                                                        var4_6 ^= var5_4 ^ 442774627;
                                                        break block81;
                                                    }
                                                    var2_5 = this.Ni(var1_1);
                                                    var5_4 = (var3_3 | var6_2) ^ 1339468865;
                                                    ** GOTO lbl-1000
                                                    case -2047774964: {
                                                        this.a = false;
                                                        ** GOTO lbl68
                                                    }
lbl80:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 1607609205;
                                                        break block78;
                                                        break;
                                                    }
lbl83:
                                                    // 3 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ -1717626358;
                                                        break block78;
                                                        break;
                                                    }
lbl86:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ -1408170980;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
                                                    case -156179402: {
                                                        if (var2_5 == null) ** continue;
                                                        ** continue;
                                                    }
                                                    case -1057021673: {
                                                        var4_6 ^= var5_4 ^ -37794155;
                                                        ** GOTO lbl235
                                                    }
lbl95:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ -1936730733;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
                                                    case 842608606: {
                                                        this.b = true;
                                                        ** GOTO lbl83
                                                    }
lbl101:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_6 ^= var5_4 ^ -210068645;
                                                        ** continue;
                                                        break;
                                                    }
lbl104:
                                                    // 1 sources

                                                    while (true) {
                                                        this.b = false;
                                                        ** GOTO lbl225
                                                        break;
                                                    }
lbl107:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ -641286111;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl110:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_6 ^= var5_4 ^ 1183556734;
                                                        ** GOTO lbl145
                                                        break;
                                                    }
                                                    case 1735408236: {
                                                        var4_6 ^= var5_4 ^ -143076393;
                                                        ** GOTO lbl120
                                                    }
lbl116:
                                                    // 1 sources

                                                    while (this.b) {
                                                        ** continue;
lbl118:
                                                        // 1 sources

                                                        ** GOTO lbl80
                                                    }
                                                    ** GOTO lbl225
lbl120:
                                                    // 1 sources

                                                    var5_4 = (var3_3 | var6_2) ^ 2123597802;
                                                    ** GOTO lbl-1000
lbl122:
                                                    // 1 sources

                                                    while (true) {
                                                        var2_5 = this.Ni(var1_1);
                                                        break block82;
                                                        break;
                                                    }
                                                    case 2095221489: {
                                                        this.a = var2_5;
                                                        ** continue;
                                                    }
lbl128:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_6 ^= var5_4 ^ -128214084;
                                                        ** continue;
                                                        break;
                                                    }
                                                    case 1088271290: {
                                                        return;
                                                    }
                                                    case 1922342813: {
                                                        var4_6 ^= var5_4 ^ -234036205;
                                                        break block44;
                                                    }
                                                    case -2112786517: {
                                                        var4_6 ^= var5_4 ^ 42538021;
                                                        ** continue;
                                                    }
                                                    case 241739193: {
                                                        this.b = var2_5;
                                                        ** continue;
                                                    }
lbl142:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_6 ^= var5_4 ^ -1879694169;
                                                        ** continue;
                                                        break;
                                                    }
lbl145:
                                                    // 1 sources

                                                    var5_4 = (var3_3 | var6_2) ^ 1483966962;
                                                    break block78;
                                                    case 314606612: {
                                                        var4_6 ^= var5_4 ^ -310831501;
                                                        ** continue;
                                                    }
                                                    case -1788057579: {
                                                        this.a = true;
                                                        ** continue;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    var5_4 = (var3_3 | var6_2) ^ -443069882;
                                    ** GOTO lbl28
                                }
                                var6_2 = -336678977;
                                var3_3 = iV.w & -336678977 ^ -535739167;
                                var5_4 = 0;
                                break block84;
                                {
                                    case 598200618: {
                                        var4_6 ^= var5_4 ^ 641513002;
                                        ** continue;
                                    }
                                }
                            }
                            var4_6 = (var3_3 | var6_2) ^ -1579005351;
                            var5_4 = (var3_3 | var6_2) ^ 768031101;
                            break block78;
                        }
                        var5_4 = (var3_3 | var6_2) ^ 721473256;
                        ** GOTO lbl28
                        {
                            case -2075730261: {
                                if (var2_5 == null) ** GOTO lbl83
                                var5_4 = (var3_3 | var6_2) ^ -1721012126;
                                ** GOTO lbl-1000
                            }
                        }
lbl174:
                        // 1 sources

                        while (true) {
                            if (!this.b) ** break;
                            ** continue;
                            ** continue;
                            break;
                        }
lbl178:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ -1850624673;
                            break block78;
                            break;
                        }
                    }
                    var5_4 = (var3_3 | var6_2) ^ 250310309;
                    break block78;
                }
                var5_4 = (var3_3 | var6_2) ^ 491719625;
                ** GOTO lbl28
            }
lbl188:
            // 2 sources

            block76: while (true) {
                switch (var5_4) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block76;
                        }
                        break;
                    }
                    case -1550331185: {
                        ** continue;
                    }
                    case -171214775: {
                        ** continue;
                    }
                    case 1675553339: {
                        ** continue;
                    }
                    case 2053403690: {
                        ** continue;
                    }
                    case -633554037: {
                        ** continue;
                    }
                    case -592593562: {
                        ** continue;
                    }
                    case 230857528: {
                        ** continue;
                    }
                    case -1272068982: {
                        ** continue;
                    }
                    case -1221525711: {
                        ** continue;
                    }
                    case 1918957045: {
                        ** continue;
                    }
                    case -1282644467: {
                        ** GOTO lbl116
                    }
                    case -451640998: {
                        ** continue;
                    }
                    case 855068938: {
                        ** continue;
                    }
                    case 1526214183: {
                        ** continue;
                    }
                    case -969353598: {
                        ** continue;
                    }
                    case 1821294138: {
                        ** continue;
                    }
lbl225:
                    // 2 sources

                    var5_4 = (var3_3 | var6_2) ^ -2011101756;
                    ** GOTO lbl-1000
lbl227:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ -750689149;
                    ** continue;
                    {
                        ** case 1206840291:
                    }
lbl230:
                    // 1 sources

                    var4_6 ^= var5_4 ^ -763533992;
                    ** continue;
                    case 2051955360: {
                        this.a = true;
                        ** continue;
                    }
lbl235:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 1874407764;
                    ** continue;
                    case 952011644: {
                        var4_6 ^= var5_4 ^ 996787593;
                        ** continue;
                    }
                    case 1402907380: 
                }
                break;
            }
            return;
        }
        var5_4 = (var3_3 | var6_2) ^ 834884724;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private Long Ni(class_310 var1_1) {
        block38: {
            block36: {
                block35: {
                    block34: {
                        block33: {
                            block27: {
                                block29: {
                                    block31: {
                                        block30: {
                                            block32: {
                                                block28: {
                                                    block37: {
                                                        break block37;
lbl1:
                                                        // 1 sources

                                                        while (true) {
                                                            var5_7 ^= var6_4 ^ -1986001666;
                                                            break block27;
                                                            break;
                                                        }
lbl4:
                                                        // 1 sources

                                                        while (var2_5.method_17783() == class_239.class_240.field_1332) {
                                                            break block28;
                                                        }
                                                        break block29;
lbl7:
                                                        // 1 sources

                                                        while (true) {
                                                            if (!this.a.is(iV.s)) break block29;
                                                            break block30;
                                                            break;
                                                        }
lbl10:
                                                        // 1 sources

                                                        while (true) {
                                                            var5_7 ^= 1220193023;
                                                            ** GOTO lbl4
                                                            break;
                                                        }
lbl13:
                                                        // 1 sources

                                                        while (true) {
                                                            if (var1_1.field_1724 != null) break block31;
                                                            ** GOTO lbl82
                                                            break;
                                                        }
lbl16:
                                                        // 1 sources

                                                        while (true) {
                                                            var5_7 ^= var6_4 ^ -1979470916;
                                                            break block32;
                                                            break;
                                                        }
lbl19:
                                                        // 1 sources

                                                        while (true) {
                                                            var6_4 = (var4_3 | var7_2) ^ 1916225421;
                                                            break block33;
                                                            break;
                                                        }
                                                    }
                                                    var7_2 = -247679221;
                                                    var4_3 = iV.w & -247679221 ^ 1057610916;
                                                    var6_4 = 0;
                                                    var5_7 = (var4_3 | var7_2) ^ -1100308395;
                                                    ** while (true)
lbl28:
                                                    // 1 sources

                                                    return var1_1.field_1724.method_24515().method_10063();
                                                }
                                                var5_7 ^= 217702117;
                                                ** GOTO lbl81
                                            }
                                            var6_4 = (var4_3 | var7_2) ^ -1278379415;
                                            break block33;
lbl36:
                                            // 1 sources

                                            while (true) {
                                                var5_7 ^= var6_4 ^ 1770894363;
                                                break block34;
                                                break;
                                            }
                                        }
                                        var6_4 = (var4_3 | var7_2) ^ 1221510875;
                                        break block33;
                                    }
                                    var6_4 = (var4_3 | var7_2) ^ -1533645203;
                                    break block33;
lbl45:
                                    // 1 sources

                                    while (true) {
                                        var6_4 = (var4_3 | var7_2) ^ -1559518578;
                                        break block33;
                                        break;
                                    }
                                }
                                while (true) {
                                    var6_4 = (var4_3 | var7_2) ^ 580430274;
                                    break block33;
                                    break;
                                }
                            }
                            var6_4 = (var4_3 | var7_2) ^ -1185022201;
                            break block33;
lbl55:
                            // 1 sources

                            return null;
                        }
lbl58:
                        // 4 sources

                        block25: while (true) {
                            switch (var6_4) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block25;
                                    }
                                    break;
                                }
                                case 1537970626: {
                                    ** continue;
                                }
                                case -1208796812: {
                                    ** continue;
                                }
                                case 1180696744: {
                                    ** continue;
                                }
                                case 1290831302: {
                                    ** continue;
                                }
                                case 254047503: {
                                    ** continue;
                                }
                                case -744002130: {
                                    ** continue;
                                }
                                case -576366995: {
                                    ** continue;
                                }
                                case -1928677342: {
                                    break block35;
                                }
                                case 1965444176: {
                                    ** continue;
                                }
lbl81:
                                // 1 sources

                                return var2_5.method_17777().method_10063();
lbl82:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ 1320781588;
                                ** continue;
                                case -1316718405: {
                                    var5_7 ^= var6_4 ^ 2106776213;
                                    break block36;
                                }
                                case 1547066657: {
                                    if (!((var3_6 = var1_1.field_1765) instanceof class_3965)) ** continue;
                                    var5_7 ^= 1220193023;
                                    break block25;
                                }
                            }
                            break;
                        }
                        break block38;
                    }
                    var6_4 = (var4_3 | var7_2) ^ 748327425;
                    ** GOTO lbl58
                }
                var6_4 = (var4_3 | var7_2) ^ -266761568;
                ** GOTO lbl58
            }
            var6_4 = (var4_3 | var7_2) ^ -1977895937;
            ** while (true)
        }
        var2_5 = (class_3965)var3_6;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void Nj(class_310 var1_1) {
        block74: {
            block73: {
                block72: {
                    block71: {
                        var15_2 = 169292293;
                        var12_3 = iV.w & 169292293 ^ -1889418628;
                        var14_4 = 0;
                        ** GOTO lbl174
lbl5:
                        // 2 sources

                        while (true) {
                            var14_4 = (var12_3 | var15_2) ^ 1873594484;
                            ** GOTO lbl95
                            break;
                        }
lbl8:
                        // 1 sources

                        while (true) {
                            var13_11 ^= -1924922061;
                            ** GOTO lbl143
                            break;
                        }
lbl11:
                        // 1 sources

                        return;
lbl13:
                        // 1 sources

                        while (true) {
                            var13_11 ^= var14_4 ^ 2086636308;
                            break block71;
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var2_5 = System.currentTimeMillis();
                            ** continue;
                            break;
                        }
                    }
                    var14_4 = (var12_3 | var15_2) ^ -72019932;
                    ** GOTO lbl95
lbl22:
                    // 2 sources

                    while (true) {
                        var14_4 = (var12_3 | var15_2) ^ 1973726355;
                        break block72;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_4 = (var12_3 | var15_2) ^ 0x1C11C711;
                        ** GOTO lbl95
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
                        this.b.entrySet().stream().sorted(Comparator.comparingLong((ToLongFunction<Map.Entry>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)J, Oa(java.util.Map$Entry ), (Ljava/util/Map$Entry;)J)())).limit(this.b.size() - iV.NJ((v0 | var15_2) ^ -982117761, (var12_3 | var15_2) ^ ((v1 | var15_2) ^ -1436958832))).forEach((Consumer<Map.Entry>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, NZ(java.util.Map$Entry ), (Ljava/util/Map$Entry;)V)((iV)this));
                        ** GOTO lbl76
                        break;
                    }
lbl33:
                    // 1 sources

                    while (true) {
                        var13_11 ^= var14_4 ^ -946464435;
                        ** GOTO lbl22
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var10_9 = ((Float)this.e.getValue()).intValue() + 2;
                        ** GOTO lbl136
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        v0 = var13_11 ^= 325920374;
                        v1 = var13_11;
                        var13_11 ^= -1289665132;
                        ** continue;
                        break;
                    }
lbl44:
                    // 1 sources

                    while (true) {
                        if (((Boolean)this.g.getValue()).booleanValue()) ** GOTO lbl68
                        ** GOTO lbl79
                        break;
                    }
lbl47:
                    // 1 sources

                    while (true) {
                        var14_4 = (var12_3 | var15_2) ^ -243472299;
                        ** GOTO lbl154
                        break;
                    }
lbl50:
                    // 1 sources

                    while (true) {
                        var13_11 ^= var14_4 ^ 103107538;
                        ** GOTO lbl150
                        break;
                    }
lbl53:
                    // 1 sources

                    while (true) {
                        var14_4 = (var12_3 | var15_2) ^ 623705107;
                        ** GOTO lbl154
lbl56:
                        // 1 sources

                        while (true) {
                            var14_4 = (var12_3 | var15_2) ^ -1242360374;
                            ** GOTO lbl154
                            break;
                        }
                        break;
                    }
lbl59:
                    // 1 sources

                    while (true) {
                        block75: {
                            this.c.keySet().removeIf((Predicate<Long>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, NY(net.minecraft.class_1923 int java.lang.Long ), (Ljava/lang/Long;)Z)((class_1923)var11_10, (int)var10_9));
                            break block75;
lbl63:
                            // 1 sources

                            while (true) {
                                ** continue;
                                break;
                            }
lbl65:
                            // 1 sources

                            while (true) {
                                var13_11 ^= var14_4 ^ -1738764044;
                                ** GOTO lbl90
                                break;
                            }
                        }
                        var14_4 = (var12_3 | var15_2) ^ 1850092776;
                        ** GOTO lbl95
                        break;
                    }
lbl71:
                    // 1 sources

                    block54: while (true) {
                        switch (var13_11) {
                            case -348439569: {
                                var14_4 = (var12_3 | var15_2) ^ -1039508035;
                                break block54;
                            }
lbl76:
                            // 2 sources

                            while (true) {
                                var14_4 = (var12_3 | var15_2) ^ -652093263;
                                ** GOTO lbl95
                                break;
                            }
lbl79:
                            // 1 sources

                            var14_4 = (var12_3 | var15_2) ^ 1140101915;
                            ** GOTO lbl95
lbl81:
                            // 1 sources

                            while (true) {
                                var14_4 = (var12_3 | var15_2) ^ -1037441816;
                                ** GOTO lbl95
                                break;
                            }
lbl84:
                            // 1 sources

                            while (true) {
                                var13_11 ^= var14_4 ^ 993622728;
                                ** continue;
                                break;
                            }
lbl87:
                            // 1 sources

                            while (true) {
                                var13_11 ^= var14_4 ^ 1935889561;
                                ** continue;
                                break;
                            }
lbl90:
                            // 1 sources

                            var14_4 = (var12_3 | var15_2) ^ 614394546;
                            ** GOTO lbl95
lbl92:
                            // 1 sources

                            while (true) {
                                if (((Boolean)this.g.getValue()).booleanValue()) ** GOTO lbl5
                                break block73;
                                break;
                            }
lbl95:
                            // 11 sources

                            block60: while (true) {
                                block4 : switch (var14_4) lbl-1000:
                                // 4 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block60;
                                        }
                                        break;
                                    }
                                    case 1291007826: {
                                        ** continue;
                                    }
                                    case -863805082: {
                                        ** continue;
                                    }
                                    case 1958928985: {
                                        ** continue;
                                    }
                                    case -1410787121: {
                                        ** continue;
                                    }
                                    case -1814102273: {
                                        break block60;
                                    }
                                    case 1268318864: {
                                        ** continue;
                                    }
                                    case 1448487628: {
                                        ** continue;
                                    }
                                    case -522503671: {
                                        ** continue;
                                    }
                                    case -104896887: {
                                        ** continue;
                                    }
                                    case 1298011797: {
                                        if (this.b.size() <= iV.NJ((var13_11 | var14_4 ^ 1195975824) ^ (var14_4 ^ 956842363), (var12_3 | var14_4 ^ 1195975824) ^ ((var13_11 | var14_4 ^ 1195975824) ^ (var14_4 ^ -1706551125)))) ** continue;
                                        break block74;
                                    }
lbl121:
                                    // 1 sources

                                    while (true) {
                                        var13_11 ^= 1321817904;
                                        ** continue;
                                        break;
                                    }
lbl124:
                                    // 1 sources

                                    while (true) {
                                        var14_4 = (var12_3 | var15_2) ^ -1014708945;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl127:
                                    // 1 sources

                                    while (true) {
                                        var14_4 = (var12_3 | var15_2) ^ 222973373;
                                        break block54;
                                        break;
                                    }
lbl130:
                                    // 1 sources

                                    while (true) {
                                        var13_11 ^= var14_4 ^ 1729799019;
                                        break block4;
                                        break;
                                    }
lbl133:
                                    // 1 sources

                                    while (true) {
                                        var13_11 ^= var14_4 ^ 140435108;
                                        ** continue;
                                        break;
                                    }
lbl136:
                                    // 1 sources

                                    var14_4 = (var12_3 | var15_2) ^ 406155518;
                                    break block54;
lbl138:
                                    // 1 sources

                                    while (true) {
                                        var14_4 = (var12_3 | var15_2) ^ -990973715;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case -1822018196: {
                                        ** continue;
                                    }
lbl143:
                                    // 1 sources

                                    var4_6 = var1_1.field_1724.method_23317();
                                    var6_7 = var1_1.field_1724.method_23318();
                                    var8_8 = var1_1.field_1724.method_23321();
                                    ** continue;
                                    case 320756535: {
                                        var14_4 = (var12_3 | var15_2) ^ 257791236;
                                        break block54;
                                    }
lbl150:
                                    // 1 sources

                                    var14_4 = (var12_3 | var15_2) ^ 1992856820;
                                    ** continue;
                                }
                                break;
                            }
                            var14_4 = (var12_3 | var15_2) ^ 2018012481;
                            ** GOTO lbl95
lbl154:
                            // 3 sources

                            block68: while (true) {
                                switch (var14_4) {
                                    default: {
                                        continue block68;
                                    }
                                    case 981788599: {
                                        ** continue;
                                    }
                                    case -1436873106: {
                                        ** continue;
                                    }
                                    ** case 2114656808:
lbl163:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                            {
                                case -146825412: {
                                    this.b.entrySet().removeIf((Predicate<Map.Entry>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, Ob(long double double double java.util.Map$Entry ), (Ljava/util/Map$Entry;)Z)((long)var2_5, (double)var4_6, (double)var6_7, (double)var8_8));
                                    ** continue;
                                }
                            }
lbl168:
                            // 2 sources

                            while (true) {
                                var14_4 = (var12_3 | var15_2) ^ 1462023605;
                                break block54;
                                break;
                            }
                            {
                                case -1879168782: {
                                    var13_11 ^= var14_4 ^ 1635458080;
                                    ** continue;
                                }
                            }
lbl174:
                            // 1 sources

                            var13_11 = (var12_3 | var15_2) ^ -187843839;
                            ** continue;
                            default: {
                                var14_4 = (var12_3 | var15_2) ^ -1690694437;
                                break block54;
                            }
                        }
                        break;
                    }
                    break block72;
                    {
                        ** case -516825451:
                    }
lbl181:
                    // 1 sources

                    var13_11 ^= var14_4 ^ -1386245979;
                    ** while (true)
                }
                block70: while (true) {
                    switch (var14_4) {
                        default: {
                            continue block70;
                        }
                        case -86810898: {
                            ** continue;
                        }
                        case -2109882432: {
                            ** continue;
                        }
                        case 1300082624: {
                            ** continue;
                        }
                        case -665630776: {
                            ** continue;
                        }
                        case 340655782: {
                            ** continue;
                        }
                        case -1757248893: {
                            ** continue;
                        }
                        ** case -2144704647:
lbl201:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            var14_4 = (var12_3 | var15_2) ^ 480840834;
            ** GOTO lbl95
            var11_10 = var1_1.field_1724.method_31476();
            var13_11 ^= 950555567;
            ** while (true)
        }
        var14_4 = (var12_3 | var15_2) ^ 9034383;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void onInboundPacket(class_2596<?> var1_1, class_2547 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [81[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private void Nk(class_2596<?> var1_1, jx var2_2) {
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
    private int Nl() {
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
    private void Nm(jx var1_1, int var2_2, int var3_3, int var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [26[UNCONDITIONALDOLOOP], 25[UNCONDITIONALDOLOOP], 0[SWITCH]], but top level block is 9[SWITCH]
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
    private int Nn(int var1_1, int var2_2, int var3_3) {
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
    private void No(class_2338 var1_1, class_2680 var2_2, String var3_3) {
        block53: {
            block50: {
                block57: {
                    block56: {
                        block54: {
                            block52: {
                                block55: {
                                    block51: {
                                        block58: {
                                            break block58;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                var7_6 = (var5_5 | var8_4) ^ 616504581;
                                                break block50;
                                                break;
                                            }
lbl4:
                                            // 1 sources

                                            while (true) {
                                                if (var2_2 != null) break block51;
                                                break block52;
                                                break;
                                            }
lbl7:
                                            // 1 sources

                                            while (true) {
                                                var7_6 = (var5_5 | var8_4) ^ 1388831557;
                                                break block50;
                                                break;
                                            }
lbl10:
                                            // 1 sources

                                            return;
lbl12:
                                            // 3 sources

                                            while (true) {
                                                var7_6 = (var5_5 | var8_4) ^ -606617199;
                                                break block53;
                                                break;
                                            }
                                        }
                                        var8_4 = -695502853;
                                        var5_5 = iV.w & -695502853 ^ -86411337;
                                        var7_6 = 0;
                                        var6_7 = (var5_5 | var8_4) ^ -1120210250;
                                        ** while (true)
lbl21:
                                        // 1 sources

                                        while (true) {
                                            var7_6 = (var5_5 | var8_4) ^ 193606443;
                                            break block53;
                                            break;
                                        }
lbl24:
                                        // 1 sources

                                        while (true) {
                                            var7_6 = (var5_5 | var8_4) ^ -1510545362;
                                            break block53;
                                            break;
                                        }
lbl27:
                                        // 1 sources

                                        while (true) {
                                            if (var4_8 >= 0) ** GOTO lbl12
                                            break block54;
                                            break;
                                        }
lbl30:
                                        // 1 sources

                                        while (true) {
                                            var7_6 = (var5_5 | var8_4) ^ 882805212;
                                            break block53;
                                            break;
                                        }
lbl33:
                                        // 1 sources

                                        while (true) {
                                            var6_7 ^= var7_6 ^ 1100519059;
                                            break block55;
                                            break;
                                        }
lbl36:
                                        // 1 sources

                                        while (true) {
                                            var7_6 = (var5_5 | var8_4) ^ -1965908914;
                                            break block53;
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
                                            var6_7 ^= var7_6 ^ 1960563072;
                                            ** continue;
                                            break;
                                        }
lbl44:
                                        // 1 sources

                                        while (true) {
                                            if (var2_2.method_27852(class_2246.field_27160)) ** GOTO lbl12
                                            break block56;
                                            break;
                                        }
                                    }
                                    var7_6 = (var5_5 | var8_4) ^ -1790055115;
                                    break block50;
lbl50:
                                    // 1 sources

                                    while (true) {
                                        if (!var2_2.method_27852(class_2246.field_27159)) ** break;
                                        ** continue;
                                        break block57;
                                        break;
                                    }
                                }
                                var7_6 = (var5_5 | var8_4) ^ 1157457112;
                                break block53;
                            }
                            var7_6 = (var5_5 | var8_4) ^ -1176983730;
                            break block50;
                        }
                        var7_6 = (var5_5 | var8_4) ^ 1199247716;
                        break block53;
                    }
                    var7_6 = (var5_5 | var8_4) ^ -1306723836;
                    break block53;
lbl66:
                    // 1 sources

                    while (true) {
                        var6_7 ^= var7_6 ^ 1738146654;
                        ** continue;
                        break;
                    }
                }
                var7_6 = (var5_5 | var8_4) ^ 1403027588;
                break block53;
                var4_8 = iV.Ns(var2_2);
                var7_6 = (var5_5 | var8_4) ^ -555327968;
                break block53;
lbl75:
                // 1 sources

                while (true) {
                    var7_6 = (var5_5 | var8_4) ^ -461409618;
                    break block53;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    var7_6 = (var5_5 | var8_4) ^ 630080313;
                    break block50;
lbl81:
                    // 1 sources

                    while (true) {
                        var6_7 ^= var7_6 ^ -323837229;
                        var7_6 = (var5_5 | var8_4) ^ -2091000009;
                        break block50;
                        break;
                    }
                    break;
                }
lbl85:
                // 1 sources

                while (true) {
                    this.Np(var1_1, var2_2, var4_8, var3_3);
                    ** continue;
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    var6_7 ^= var7_6 ^ -2075766309;
                    ** GOTO lbl110
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    var6_7 ^= var7_6 ^ 4372064;
                    ** continue;
                    break;
                }
            }
            block45: while (true) {
                switch (var7_6) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block45;
                        }
                        break;
                    }
                    case -615172922: {
                        ** continue;
                    }
                    case 2105977032: {
                        ** continue;
                    }
                    case -630953222: {
                        ** continue;
                    }
                    case 1805032138: {
                        ** continue;
                    }
                    case 1191432369: {
                        ** continue;
                    }
lbl110:
                    // 1 sources

                    var7_6 = (var5_5 | var8_4) ^ -1127061553;
                    ** continue;
                    case -1407413062: {
                        var6_7 ^= var7_6 ^ 633037021;
                        ** continue;
                    }
                    case 1107890224: 
                }
                break;
            }
            return;
lbl117:
            // 1 sources

            while (true) {
                var7_6 = (var5_5 | var8_4) ^ 1334122266;
                break block53;
                break;
            }
lbl120:
            // 1 sources

            return;
        }
        block49: while (true) {
            switch (var7_6) {
                default: {
                    continue block49;
                }
                case -1171909849: {
                    ** continue;
                }
                case 1946807217: {
                    ** continue;
                }
                case -901382621: {
                    ** continue;
                }
                case 540879327: {
                    ** continue;
                }
                case -179223340: {
                    ** continue;
                }
                case 1288146427: {
                    ** continue;
                }
                case -1180670309: {
                    ** continue;
                }
                case -1319214875: {
                    ** continue;
                }
                case -1384384645: {
                    ** continue;
                }
                case 446956881: {
                    ** continue;
                }
                case 621590126: {
                    ** continue;
                }
                ** case 1529716689:
lbl150:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void Np(class_2338 var1_1, class_2680 var2_2, int var3_3, String var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 103[UNCONDITIONALDOLOOP]
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
    private void Nq(class_2338 var1_1, long var2_2, int var4_3, String var5_4) {
        block20: {
            block19: {
                var11_5 = -468302521;
                var8_6 = iV.w & -468302521 ^ 512422647;
                var10_7 = 0;
                ** GOTO lbl49
lbl5:
                // 1 sources

                while (true) {
                    var9_8 ^= var10_7 ^ -2103911627;
                    ** GOTO lbl20
                    break;
                }
lbl8:
                // 1 sources

                block12: while (true) {
                    block21: {
                        var10_7 = (var8_6 | var11_5) ^ 929903662;
                        break block21;
lbl11:
                        // 1 sources

                        return;
                    }
lbl14:
                    // 3 sources

                    block14: while (true) {
                        switch (var10_7) lbl-1000:
                        // 2 sources

                        {
                            default: {
                                continue block14;
                            }
                            case -906771495: {
                                ** continue;
                            }
lbl20:
                            // 1 sources

                            var10_7 = (var8_6 | var11_5) ^ -1812419609;
                            ** GOTO lbl33
lbl22:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                            case 1433378999: {
                                var9_8 ^= var10_7 ^ 346278716;
                                break block12;
                            }
lbl27:
                            // 1 sources

                            while (true) {
                                var10_7 = (var8_6 | var11_5) ^ -60442007;
                                ** GOTO lbl33
                                break;
                            }
                            var6_9 = class_310.method_1551();
                            var9_8 ^= 389277655;
                            ** GOTO lbl47
lbl33:
                            // 3 sources

                            block18: while (true) {
                                switch (var10_7) {
                                    default: {
                                        continue block18;
                                    }
                                    case 50023838: {
                                        ** continue;
                                    }
                                    case -1619026510: {
                                        ** continue;
                                    }
                                    ** case 1835424784:
lbl42:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                            case 1914494680: {
                                var6_9.execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, NU(net.minecraft.class_310 int java.lang.String net.minecraft.class_2338 net.minecraft.class_2338 ), ()V)((class_310)var6_9, (int)var4_3, (String)var5_4, (class_2338)var1_1, (class_2338)var7_10));
                                var10_7 = (var8_6 | var11_5) ^ -2140534461;
                                ** GOTO lbl-1000
                            }
lbl47:
                            // 1 sources

                            var7_10 = class_2338.method_10092((long)var2_2);
                            break block19;
lbl49:
                            // 1 sources

                            var9_8 = (var8_6 | var11_5) ^ -78803046;
                            break block20;
                        }
                        break;
                    }
                    break;
                }
                var10_7 = (var8_6 | var11_5) ^ -1937626833;
                ** GOTO lbl14
                {
                    ** case 2129985204:
                }
lbl54:
                // 1 sources

                var9_8 ^= var10_7 ^ -1582178996;
                ** while (true)
            }
            var10_7 = (var8_6 | var11_5) ^ -1410246848;
            ** while (true)
        }
        var10_7 = (var8_6 | var11_5) ^ 1642162757;
        ** while (true)
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean Nr(class_2767 var0) {
        var5_1 = -1851456241;
        var2_2 = iV.w & -1851456241 ^ -2070195400;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ 1920891247;
        var4_3 = (var2_2 | var5_1) ^ -883079474;
        ** GOTO lbl16
lbl-1000:
        // 1 sources

        {
            block23: {
                block22: {
                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -480831721;
                        break block22;
                        break;
                    }
lbl10:
                    // 2 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1055129376;
                        break block23;
                        break;
                    }
lbl13:
                    // 2 sources

                    while (true) {
                        var3_4 ^= 1007116150;
                        return v0;
                    }
                }
                block20: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block20;
                        }
                        case 1591874033: {
                            ** continue;
                        }
                        case 1994932264: {
                            var3_4 ^= var4_3 ^ 925810528;
                            var4_3 = (var2_2 | var5_1) ^ -1837907070;
                            continue block20;
                        }
                        case 130847933: 
                    }
                    break;
                }
                var1_5 = class_7923.field_41172.method_10221((Object)((class_3414)var0.method_11894().comp_349()));
                var4_3 = (var2_2 | var5_1) ^ -810042931;
            }
            block21: while (true) {
                switch (var4_3) {
                    default: {
                        continue block21;
                    }
                    case 1510534898: {
                        var3_4 ^= var4_3 ^ 1310320170;
                        var4_3 = (var2_2 | var5_1) ^ -328218140;
                        continue block21;
                    }
                    case 2043715291: {
                        if (var1_5 == null) ** GOTO lbl10
                        var4_3 = (var2_2 | var5_1) ^ 250126376;
                        continue block21;
                    }
                    case -1688733929: {
                        var4_3 = (var2_2 | var5_1) ^ 1567084899;
                        continue block21;
                    }
                    case -925333924: {
                        if (var1_5.method_12832().contains(iV.S)) ** break;
                        ** continue;
                        var4_3 = (var2_2 | var5_1) ^ -1259445162;
                        continue block21;
                    }
                    case 558969705: {
                        var3_4 ^= var4_3 ^ -654414893;
                        var4_3 = (var2_2 | var5_1) ^ -1855555505;
                        continue block21;
                    }
                    case 81342320: {
                        v0 = true;
                        ** GOTO lbl13
                    }
                    case 1419991007: {
                        var3_4 ^= var4_3 ^ -1391718555;
                        var4_3 = (var2_2 | var5_1) ^ -1228510019;
                        continue block21;
                    }
                    case 595147650: 
                }
                break;
            }
            v0 = false;
            ** continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static int Ns(class_2680 var0) {
        var4_1 = 1713668108;
        var1_2 = iV.w & 1713668108 ^ -1953505960;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -578550613;
        var3_3 = (var1_2 | var4_1) ^ 1070595845;
        ** GOTO lbl85
        {
            var3_3 = (var1_2 | var4_1) ^ -1033272631;
            block22: while (true) {
                switch (var3_3) {
                    case -2014104019: {
                        if (var0.method_27852(class_2246.field_27162)) {
                            var3_3 = (var1_2 | var4_1) ^ -1369691567;
                            continue block22;
                        }
                        ** GOTO lbl22
                    }
                    case -2118674116: {
                        var2_4 ^= var3_3 ^ 719243473;
                        var3_3 = (var1_2 | var4_1) ^ 2049261123;
                        continue block22;
                    }
                    case -799006119: {
                        var3_3 = (var1_2 | var4_1) ^ 483381531;
                        continue block22;
                    }
lbl22:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -396120715;
                    break;
                    case 148573709: {
                        return 2;
                    }
                    case 1550506358: {
                        if (var0.method_27852(class_2246.field_27161)) continue block21;
                        var3_3 = (var1_2 | var4_1) ^ -1485931580;
                        break;
                    }
                    case -821000391: {
                        if (!var0.method_27852(class_2246.field_27164)) ** GOTO lbl36
                        ** GOTO lbl46
                    }
                    case -211809209: {
                        var2_4 ^= var3_3 ^ 1564917472;
                        ** GOTO lbl68
                    }
lbl36:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 601445748;
                    continue block22;
                    case -1786060001: {
                        return 1;
                    }
                    case 358970731: {
                        var2_4 ^= var3_3 ^ 1437312381;
                        ** GOTO lbl48
                    }
                    case 1616068176: {
                        var2_4 ^= var3_3 ^ 511260026;
                        ** GOTO lbl74
                    }
lbl46:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -87381961;
                    continue block22;
lbl48:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -2016068721;
                    continue block22;
                    case 767975317: {
                        var2_4 ^= var3_3 ^ -429196657;
                        var3_3 = (var1_2 | var4_1) ^ -998418741;
                        break;
                    }
                    case 1752884947: {
                        return 0;
                    }
                    case 1220650648: {
                        var2_4 ^= var3_3 ^ 1231500896;
                        var3_3 = (var1_2 | var4_1) ^ -893455199;
                        break;
                    }
                    case -864647128: {
                        var2_4 ^= var3_3 ^ 1742915215;
                        var3_3 = (var1_2 | var4_1) ^ -1250831505;
                        continue block22;
                    }
                    case 621881853: {
                        return -1;
                    }
                    case 735218583: {
                        return 3;
                    }
lbl68:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 549411429;
                    continue block22;
                    case 1106507533: {
                        var2_4 ^= var3_3 ^ -14391208;
                        var3_3 = (var1_2 | var4_1) ^ -411774127;
                        break;
                    }
lbl74:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1750920049;
                    continue block22;
                    case 130838569: {
                        var2_4 ^= var3_3 ^ 1257392251;
                        var3_3 = (var1_2 | var4_1) ^ -1278933974;
                        break;
                    }
                    case 1524502067: {
                        if (var0.method_27852(class_2246.field_27163)) {
                            var3_3 = (var1_2 | var4_1) ^ 1847084128;
                            continue block22;
                        }
                        var3_3 = (var1_2 | var4_1) ^ -1879252212;
                    }
                }
lbl85:
                // 9 sources

            }
        }
    }

    /*
     * Exception decompiling
     */
    private void Nt(class_310 var1_1) {
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
    private void Nu(class_2818 var1_1, int var2_2, int var3_3) {
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
    private static boolean Nv(class_2680 var0) {
        block34: {
            block35: {
                block29: {
                    block32: {
                        block31: {
                            block33: {
                                block30: {
                                    var4_1 = 154698599;
                                    var1_2 = iV.w & 154698599 ^ 498227948;
                                    var3_3 = 0;
                                    break block35;
lbl5:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 1056623247;
                                        break block29;
                                        break;
                                    }
lbl8:
                                    // 1 sources

                                    while (true) {
                                        if (var0.method_27852(class_2246.field_27160)) break block30;
                                        break block31;
                                        break;
                                    }
lbl11:
                                    // 2 sources

                                    while (true) {
                                        var2_4 ^= -1519844792;
                                        break block32;
                                        break;
                                    }
                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 788484068;
                                        break block29;
                                        break;
                                    }
lbl17:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ -2046506780;
                                        break block33;
                                        break;
                                    }
                                }
lbl21:
                                // 3 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 152705189;
                                    break block29;
                                    break;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ 609305847;
                            break block29;
lbl27:
                            // 1 sources

                            while (true) {
                                v0 = true;
                                ** GOTO lbl11
                                break;
                            }
lbl30:
                            // 1 sources

                            while (true) {
                                v0 = false;
                                ** continue;
                                break;
                            }
lbl33:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1285426679;
                                break block29;
lbl36:
                                // 1 sources

                                while (true) {
                                    if (!var0.method_27852(class_2246.field_27159)) ** continue;
                                    ** GOTO lbl21
                                    break;
                                }
                                break;
                            }
lbl39:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -2226869;
                                break block29;
lbl42:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 911188245;
                                    break block29;
                                    break;
                                }
                                break;
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ 1767772653;
                        break block29;
                    }
                    return v0;
lbl50:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1681784369;
                        break block29;
                        break;
                    }
lbl53:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -156817642;
                        ** continue;
                        break;
                    }
lbl56:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -784175017;
                        ** continue;
                        break;
                    }
                }
lbl60:
                // 3 sources

                block28: while (true) {
                    switch (var3_3) {
                        default: {
                            continue block28;
                        }
                        case -618526248: {
                            ** continue;
                        }
                        case -2038900192: {
                            ** continue;
                        }
                        case 737508090: {
                            ** continue;
                        }
                        case 591401312: {
                            ** continue;
                        }
                        case -1361368602: {
                            ** continue;
                        }
                        case 1961150978: {
                            ** continue;
                        }
                        case 1856807454: {
                            ** continue;
                        }
                        case 346080074: {
                            ** continue;
                        }
                        case 860197899: {
                            ** continue;
                        }
                        case -496705884: {
                            break block34;
                        }
                        case 971743000: {
                            if (iV.Ns(var0) < 0) ** break;
                            ** continue;
                            break;
                        }
                    }
                    ** continue;
                    break;
                }
            }
            var2_4 = (var1_2 | var4_1) ^ 496985654;
            var3_3 = (var1_2 | var4_1) ^ 1930852849;
            ** GOTO lbl60
        }
        var3_3 = (var1_2 | var4_1) ^ -963063241;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void Nw(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [22[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private void Nx() {
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
    private static int Ny(int[] var0, int var1_1) {
        block21: {
            block20: {
                block22: {
                    break block22;
                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1877851870;
                        break block20;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var1_1 = var0[var1_1];
                        break block21;
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 434755360;
                        break block20;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        if (var0[var1_1] == var1_1) ** continue;
                        ** continue;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ 66730243;
                        ** GOTO lbl39
                        break;
                    }
                }
                var5_2 = 1462794881;
                var2_3 = iV.w & 1462794881 ^ -1086858911;
                var4_4 = 0;
                var3_5 = (var2_3 | var5_2) ^ 1368949183;
                ** GOTO lbl46
            }
lbl23:
            // 5 sources

            block16: while (true) {
                switch (var4_4) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block16;
                        }
                        break;
                    }
                    case -402890398: {
                        ** continue;
                    }
                    case -31141459: {
                        ** continue;
                    }
                    case -421647167: {
                        ** continue;
                    }
                    case 2078324056: {
                        break block21;
                    }
                    case 327053268: {
                        var3_5 ^= var4_4 ^ 1712897161;
                        break block16;
                    }
lbl39:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -474255357;
                    ** GOTO lbl-1000
lbl41:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 1974228241;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -1817854947: {
                        return var1_1;
                    }
lbl46:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -2066264391;
                    ** continue;
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ 18033228;
            ** GOTO lbl23
lbl50:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 1821526012;
                ** GOTO lbl23
                break;
            }
        }
        var4_4 = (var2_3 | var5_2) ^ -330722251;
        ** GOTO lbl23
        {
            case 478972898: {
                var0[var1_1] = var0[var0[var1_1]];
                ** continue;
            }
            case 1864743619: {
                var3_5 ^= var4_4 ^ -1446604135;
                ** continue;
            }
            ** case -1969508624:
        }
lbl63:
        // 1 sources

        var3_5 ^= var4_4 ^ 450455663;
        var4_4 = (var2_3 | var5_2) ^ 415996547;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static void Nz(int[] var0, int var1_1, int var2_2) {
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
    private static double NA(double d2) {
        int n2 = w & 0x676A9021 ^ 0x35163C10;
        int n3 = 0;
        int n4 = (n2 | 0x676A9021) ^ 0x9D1BB106;
        n3 = (n2 | 0x676A9021) ^ 0xF3693015;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 380080352: {
                    return d2 * d2;
                }
                case -2078831580: {
                    n3 = (n2 | 0x676A9021) ^ 0x98C3B4E5;
                    continue block5;
                }
                case -272824108: 
            }
            n4 ^= n3 ^ 0xD0222D79;
            n3 = (n2 | 0x676A9021) ^ 0x61D92CD1;
        }
    }

    /*
     * Exception decompiling
     */
    public void render(WorldRenderContext var1_1, class_310 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [253[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static boolean NB(fO var0, class_243 var1_1) {
        var12_2 = -1218377980;
        var9_3 = iV.w & -1218377980 ^ 1719444545;
        var11_4 = 0;
        var10_5 = (var9_3 | var12_2) ^ -359298865;
        var11_4 = (var9_3 | var12_2) ^ -1685291725;
        block13: while (true) {
            switch (var11_4) {
                case -705417063: {
                    var2_6 = class_2338.method_10092((long)var0.a);
                    break block13;
                }
                case 1827789430: {
                    var11_4 = (var9_3 | var12_2) ^ 1884474667;
                }
                default: {
                    continue block13;
                }
                case -2026935698: {
                    var10_5 ^= var11_4 ^ 906554669;
                    var11_4 = (var9_3 | var12_2) ^ 579442652;
                    continue block13;
                }
            }
            break;
        }
        var10_5 ^= -1550039062;
        var3_7 = (double)var2_6.method_10263() + 0.5 - var1_1.field_1352;
        var5_8 = (double)var2_6.method_10264() + 0.5 - var1_1.field_1351;
        var7_9 = (double)var2_6.method_10260() + 0.5 - var1_1.field_1350;
        var11_4 = (var9_3 | var12_2) ^ -1243833010;
        ** GOTO lbl55
        while (true) {
            var11_4 = (var9_3 | var12_2) ^ 312585743;
            if (true) ** GOTO lbl30
            break;
        }
        block15: while (true) {
            var11_4 = (var9_3 | var12_2) ^ 121518618;
lbl30:
            // 2 sources

            while (true) {
                switch (var11_4) {
                    case -264004257: {
                        var10_5 ^= var11_4 ^ -1359959368;
                        ** GOTO lbl46
                    }
                    case -438564534: {
                        var10_5 ^= var11_4 ^ -1150337363;
                        ** break;
                    }
                    case -264548514: {
                        if (!(var3_7 * var3_7 + var5_8 * var5_8 + var7_9 * var7_9 <= 102400.0)) ** continue;
                        continue block15;
                    }
                    case -1053003183: {
                        v0 = false;
                        ** GOTO lbl50
                    }
lbl44:
                    // 1 sources

                    var11_4 = (var9_3 | var12_2) ^ 910284052;
                    break;
lbl46:
                    // 1 sources

                    var11_4 = (var9_3 | var12_2) ^ -1364964467;
                    break;
                    case 1507454152: {
                        v0 = true;
lbl50:
                        // 2 sources

                        var10_5 ^= -842046253;
                        return v0;
                    }
                    case 1117862411: {
                        var10_5 ^= var11_4 ^ -1479215848;
                        var11_4 = (var9_3 | var12_2) ^ 122087451;
                    }
                }
lbl55:
                // 5 sources

            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static boolean overlayActive(class_310 var0) {
        block54: {
            block50: {
                block55: {
                    block45: {
                        block46: {
                            block51: {
                                block53: {
                                    block49: {
                                        block52: {
                                            block47: {
                                                block48: {
                                                    break block52;
lbl1:
                                                    // 1 sources

                                                    while (((Boolean)var1_4.b.getValue()).booleanValue()) {
                                                        var4_3 = (var2_2 | var5_1) ^ -1608251574;
                                                        ** GOTO lbl39
lbl4:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_3 = (var2_2 | var5_1) ^ 495554602;
                                                            ** GOTO lbl39
lbl7:
                                                            // 1 sources

                                                            while (var0.field_1755 instanceof class_408) {
                                                                break block45;
                                                            }
                                                            ** GOTO lbl121
                                                            break;
                                                        }
                                                    }
                                                    ** GOTO lbl121
lbl11:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_5 ^= var4_3 ^ 934412902;
                                                        break block46;
                                                        break;
                                                    }
lbl14:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_5 ^= var4_3 ^ -1341818750;
                                                        break block47;
                                                        break;
                                                    }
lbl17:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_3 = (var2_2 | var5_1) ^ 1376618954;
                                                        ** GOTO lbl39
lbl20:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_3 = (var2_2 | var5_1) ^ 316636943;
                                                            ** GOTO lbl39
                                                            break;
                                                        }
                                                        break;
                                                    }
lbl23:
                                                    // 2 sources

                                                    while (true) {
                                                        var3_5 ^= 1655342419;
                                                        break block48;
                                                        break;
                                                    }
lbl26:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_3 = (var2_2 | var5_1) ^ 450873637;
                                                        ** GOTO lbl39
lbl29:
                                                        // 1 sources

                                                        while (true) {
                                                            var3_5 ^= var4_3 ^ 613847918;
                                                            break block49;
                                                            break;
                                                        }
                                                        break;
                                                    }
lbl32:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_3 = (var2_2 | var5_1) ^ 1691043187;
                                                        ** GOTO lbl39
                                                        break;
                                                    }
                                                }
                                                return v0;
lbl37:
                                                // 1 sources

                                                block36: while (true) {
                                                    var4_3 = (var2_2 | var5_1) ^ 274473020;
lbl39:
                                                    // 16 sources

                                                    block37: while (true) {
                                                        switch (var4_3) lbl-1000:
                                                        // 3 sources

                                                        {
                                                            default: {
                                                                continue block37;
                                                            }
                                                            case -56919883: {
                                                                break block50;
                                                            }
                                                            case 1314914544: {
                                                                ** GOTO lbl1
                                                            }
                                                            case 947141260: {
                                                                ** GOTO lbl7
                                                            }
                                                            case 1544782021: {
                                                                break block36;
                                                            }
                                                            case 519270618: {
                                                                ** continue;
                                                            }
                                                            case 1890511582: {
                                                                ** continue;
                                                            }
                                                            case 1686303617: {
                                                                ** continue;
                                                            }
                                                            case -1375117257: {
                                                                if (var0.field_1755 != null) {
                                                                    ** continue;
                                                                }
                                                                break block45;
                                                            }
                                                            case 2134060549: {
                                                                if (var0.field_1687 == null) ** GOTO lbl121
                                                                break;
                                                            }
lbl64:
                                                            // 1 sources

                                                            while (true) {
                                                                var4_3 = (var2_2 | var5_1) ^ 943557758;
                                                                ** GOTO lbl-1000
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                }
                                                var4_3 = (var2_2 | var5_1) ^ 596398586;
                                                ** GOTO lbl39
                                                {
                                                    case 1289969603: {
                                                        v0 = false;
                                                        ** GOTO lbl23
                                                    }
                                                }
                                            }
                                            var4_3 = (var2_2 | var5_1) ^ -1961285862;
                                            ** GOTO lbl39
lbl75:
                                            // 1 sources

                                            while (true) {
                                                var1_4 = iV.a;
                                                ** continue;
                                                break;
                                            }
                                            {
                                                case 1180743386: {
                                                    ** continue;
                                                }
                                            }
                                            var4_3 = (var2_2 | var5_1) ^ -1357897448;
                                            ** GOTO lbl39
                                        }
                                        var5_1 = 1211333588;
                                        var2_2 = iV.w & 1211333588 ^ 1556051839;
                                        var4_3 = 0;
                                        break block53;
                                        {
                                            case -167146543: {
                                                if (var1_4 == null) ** GOTO lbl121
                                                ** continue;
                                            }
                                        }
lbl90:
                                        // 3 sources

                                        block41: while (true) {
                                            switch (var4_3) {
                                                default: {
                                                    continue block41;
                                                }
                                                case 35261415: {
                                                    ** continue;
                                                }
                                                case 994486285: {
                                                    break block51;
                                                }
                                                case -74150648: {
                                                    break;
                                                }
                                            }
                                            ** continue;
                                            break;
                                        }
lbl101:
                                        // 1 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ 739349793;
                                            ** GOTO lbl39
                                            break;
                                        }
                                    }
                                    var4_3 = (var2_2 | var5_1) ^ -1430850514;
                                    ** GOTO lbl39
                                }
                                var3_5 = (var2_2 | var5_1) ^ -267116534;
                                var4_3 = (var2_2 | var5_1) ^ 1744426994;
                                ** GOTO lbl90
                                {
                                    case -676964123: {
                                        v0 = true;
                                        ** continue;
                                    }
                                }
                            }
                            var4_3 = (var2_2 | var5_1) ^ 1587901464;
                            ** GOTO lbl90
                            {
                                case -206610713: {
                                    break block54;
                                }
                                case 701188853: {
                                    if (var0.field_1724 != null) break block55;
lbl121:
                                    // 6 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 1487329081;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                }
                            }
                        }
                        var4_3 = (var2_2 | var5_1) ^ -1490291977;
                        ** while (true)
                    }
                    var4_3 = (var2_2 | var5_1) ^ 1112280869;
                    ** GOTO lbl39
                }
                var4_3 = (var2_2 | var5_1) ^ 11337530;
                ** GOTO lbl39
            }
            var4_3 = (var2_2 | var5_1) ^ 1970550026;
            ** GOTO lbl39
            {
                case 68790470: {
                    var3_5 ^= var4_3 ^ -1427136354;
                    ** continue;
                }
                case 1094119381: {
                    if (!var1_4.isEnabled()) ** continue;
                    ** continue;
                }
                ** case 246609461:
            }
lbl143:
            // 1 sources

            ** while (true)
        }
        var4_3 = (var2_2 | var5_1) ^ -222945336;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void renderOverlay(W var1_1, class_310 var2_2) {
        block223: {
            block220: {
                block227: {
                    block221: {
                        block230: {
                            block222: {
                                block229: {
                                    block226: {
                                        block232: {
                                            block234: {
                                                block233: {
                                                    block228: {
                                                        block231: {
                                                            block225: {
                                                                block224: {
                                                                    var41_3 = 830573535;
                                                                    var38_4 = iV.w & 830573535 ^ -608641277;
                                                                    var40_5 = 0;
                                                                    var39_27 = (var38_4 | var41_3) ^ 939903986;
                                                                    var40_5 = (var38_4 | var41_3) ^ 1850504125;
                                                                    break block220;
lbl7:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        v0 = iV.NJ(((var39_27 ^= 1396553979) | var41_3) ^ 607945487, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ -765003585));
                                                                        ** GOTO lbl53
                                                                        break;
                                                                    }
lbl10:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var40_5 = (var38_4 | var41_3) ^ -15117702;
                                                                        break block220;
                                                                        break;
                                                                    }
lbl13:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var39_27 ^= -827878855;
                                                                        var6_9 = 16.0f;
                                                                        var39_27 ^= 1093777825;
                                                                        var7_10 = 18.0f;
                                                                        var39_27 ^= 1733897405;
                                                                        var8_11 = 32.0f;
                                                                        var39_27 ^= 563943434;
                                                                        var9_12 = 20.0f;
                                                                        var39_27 ^= 1258457620;
                                                                        var10_13 = 5;
                                                                        var39_27 ^= -597291732;
                                                                        var11_14 = 14.0f;
                                                                        var39_27 ^= -112800194;
                                                                        var12_15 = 20.0f;
                                                                        var39_27 ^= 1067366386;
                                                                        var13_16 = 268.0f;
                                                                        var39_27 ^= 1595558234;
                                                                        var14_17 = var8_11 + var9_12 + (float)var10_13 * var7_10 + var11_14 + var12_15 + (float)var4_7 * var7_10 + var6_9 * 2.0f;
                                                                        var39_27 ^= 40459581;
                                                                        var15_18 = var1_1.s(var13_16);
                                                                        var39_27 ^= 1092796715;
                                                                        var16_19 = var1_1.s(var14_17);
                                                                        var39_27 ^= 1097614567;
                                                                        var17_20 = var1_1.f - var15_18 - var1_1.s(12.0f);
                                                                        var39_27 ^= -369584394;
                                                                        var18_21 = var1_1.s(88.0f);
                                                                        var40_5 = (var38_4 | var41_3) ^ 1907141644;
                                                                        break block221;
                                                                        break;
                                                                    }
lbl42:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        v1 = iV.NJ(((var39_27 ^= 1574855097) | var41_3) ^ 1746965338, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ 1922859854));
                                                                        ** GOTO lbl105
                                                                        break;
                                                                    }
lbl45:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var40_5 = (var38_4 | var41_3) ^ -316284872;
                                                                        break block222;
                                                                        break;
                                                                    }
lbl48:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        v2 = iV.NJ((var39_27 | var41_3) ^ 638883670, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ -1167789747));
                                                                        ** GOTO lbl94
                                                                        break;
                                                                    }
                                                                    while (true) {
                                                                        v0 = iV.NJ(((var39_27 ^= 1396553979) | var41_3) ^ 607945484, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ 1531037857));
lbl53:
                                                                        // 2 sources

                                                                        var39_27 ^= -126720346;
                                                                        var1_1.sectionLabel(iV.B, var19_22, v3, v4, v0);
                                                                        var40_5 = (var38_4 | var41_3) ^ 1778167890;
                                                                        break block222;
                                                                        break;
                                                                    }
lbl57:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var40_5 = (var38_4 | var41_3) ^ -984924686;
                                                                        break block223;
lbl60:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var40_5 = (var38_4 | var41_3) ^ -118235433;
                                                                            break block222;
                                                                            break;
                                                                        }
                                                                        while (true) {
                                                                            v5 = iV.NJ(((var39_27 ^= 1773059808) | var41_3) ^ -366963841, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ -1378287272));
                                                                            break block224;
                                                                            break;
                                                                        }
                                                                        while (true) {
                                                                            v6 = iV.NJ(((var39_27 ^= 858933809) | var41_3) ^ 639813472, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ 1150091044));
                                                                            break block225;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
lbl69:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var39_27 ^= -1602657974;
                                                                        var5_8 = this.NC();
                                                                        ** continue;
                                                                        break;
                                                                    }
lbl73:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var40_5 = (var38_4 | var41_3) ^ -670932505;
                                                                        break block220;
                                                                        break;
                                                                    }
                                                                    while (true) {
                                                                        var39_27 ^= -1581663488;
                                                                        v7 = var31_33 <= 0 ? iV.NJ(((var39_27 ^= 1745190544) | var41_3) ^ 679135057, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ -551629072)) : iV.NJ(((var39_27 ^= 1745190544) | var41_3) ^ 679135056, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ 1647691620));
                                                                        break block226;
                                                                        break;
                                                                    }
lbl80:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var40_5 = (var38_4 | var41_3) ^ 59596935;
                                                                        break block223;
                                                                        break;
                                                                    }
lbl83:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var39_27 ^= 1519777276;
                                                                        v8 = !var22_25 ? iV.NJ(((var39_27 ^= 1631132974) | var41_3) ^ -428559523, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ -1420595885)) : iV.NJ(((var39_27 ^= 1631132974) | var41_3) ^ -428559524, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ -624429501));
                                                                        var39_27 ^= -1632655258;
                                                                        var1_1.textRight((String)v9, var20_23, var21_24 + var1_1.s(8.0f), var1_1.s(11.5f), v8);
                                                                        var40_5 = (var38_4 | var41_3) ^ 939779922;
                                                                        break block227;
                                                                        break;
                                                                    }
lbl90:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var39_27 ^= -1851045471;
                                                                        if (var5_8.growth() > 0L) break block228;
                                                                        v2 = iV.NJ(((var39_27 ^= -1422457894) | var41_3) ^ 638883671, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ 333362237));
lbl94:
                                                                        // 2 sources

                                                                        var39_27 ^= 1178580604;
                                                                        var21_24 = this.NE(var1_1, var19_22, var20_23, var21_24, var7_10, iV.d, v10, v2);
                                                                        var40_5 = (var38_4 | var41_3) ^ -1071169076;
                                                                        break block229;
                                                                        break;
                                                                    }
lbl98:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var39_27 ^= -898973509;
                                                                        var21_24 = this.NE(var1_1, var19_22, var20_23, var21_24, var7_10, iV.y, var25_28, v11);
                                                                        var40_5 = (var38_4 | var41_3) ^ 244240466;
                                                                        ** GOTO lbl557
                                                                        break;
                                                                    }
                                                                    while (true) {
                                                                        v1 = iV.NJ(((var39_27 ^= 1574855097) | var41_3) ^ 1746965339, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ -1811726935));
lbl105:
                                                                        // 2 sources

                                                                        var39_27 ^= 1487284375;
                                                                        var21_24 = this.NE(var1_1, var19_22, var20_23, var21_24, var7_10, iV.b, var23_26, v1);
                                                                        var40_5 = (var38_4 | var41_3) ^ -1502351549;
                                                                        break block229;
                                                                        break;
                                                                    }
lbl109:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var40_5 = (var38_4 | var41_3) ^ 1808296253;
                                                                        break block222;
                                                                        break;
                                                                    }
                                                                }
lbl113:
                                                                // 2 sources

                                                                while (true) {
                                                                    var39_27 ^= 1544321492;
                                                                    var1_1.sectionLabel(iV.Y, var19_22, v12, v13, v5);
                                                                    var40_5 = (var38_4 | var41_3) ^ 582191735;
                                                                    break block227;
                                                                    break;
                                                                }
lbl118:
                                                                // 1 sources

                                                                while (true) {
                                                                    var40_5 = (var38_4 | var41_3) ^ 1492414798;
                                                                    break block222;
                                                                    break;
                                                                }
lbl121:
                                                                // 1 sources

                                                                while (true) {
                                                                    var40_5 = (var38_4 | var41_3) ^ -560346659;
                                                                    break block230;
                                                                    break;
                                                                }
lbl124:
                                                                // 1 sources

                                                                while (true) {
                                                                    var40_5 = (var38_4 | var41_3) ^ -107864288;
                                                                    break block221;
                                                                    break;
                                                                }
lbl127:
                                                                // 1 sources

                                                                while (true) {
                                                                    var40_5 = (var38_4 | var41_3) ^ -443266398;
                                                                    break block227;
                                                                    break;
                                                                }
                                                            }
lbl131:
                                                            // 2 sources

                                                            while (true) {
                                                                var39_27 ^= -836793437;
                                                                var1_1.textRight(v14, var20_23, v15, v16, v6);
                                                                var40_5 = (var38_4 | var41_3) ^ -1497880070;
                                                                break block223;
                                                                break;
                                                            }
lbl136:
                                                            // 1 sources

                                                            while (true) {
                                                                var1_1.textRight(v17, var20_23, v18, v19, v7);
                                                                var40_5 = (var38_4 | var41_3) ^ 1480792371;
                                                                ** GOTO lbl499
                                                                break;
                                                            }
                                                            while (true) {
                                                                v20 = iV.NJ(((var39_27 ^= 693333444) | var41_3) ^ 540329817, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ -819087556));
                                                                ** GOTO lbl335
                                                                break;
                                                            }
lbl143:
                                                            // 1 sources

                                                            while (true) {
                                                                var40_5 = (var38_4 | var41_3) ^ 786492482;
                                                                break block231;
                                                                break;
                                                            }
lbl146:
                                                            // 1 sources

                                                            while (true) {
                                                                var40_5 = (var38_4 | var41_3) ^ 1525577649;
                                                                break block223;
                                                                while (true) {
                                                                    var39_27 ^= 1912600151;
                                                                    v9 = iV.C;
                                                                    break block232;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        block161: while (true) {
                                                            block235: {
                                                                block236: {
                                                                    switch (var40_5) {
                                                                        case -1231228734: {
                                                                            var39_27 ^= var40_5 ^ -126858816;
                                                                            var40_5 = (var38_4 | var41_3) ^ 850396800;
                                                                            break block235;
                                                                        }
                                                                        case -922101409: {
                                                                            var21_24 = this.NG(var1_1, var19_22, var20_23, var21_24, var7_10, (R)var36_36.get(var37_37), var32_34, var34_35);
                                                                            ** break;
                                                                        }
                                                                        case -1887920428: {
                                                                            break;
                                                                        }
                                                                        case -413513825: {
                                                                            if (var37_37 >= var36_36.size()) ** GOTO lbl478
                                                                            var40_5 = (var38_4 | var41_3) ^ 1294282525;
                                                                            break block235;
                                                                        }
lbl169:
                                                                        // 1 sources

                                                                        var40_5 = (var38_4 | var41_3) ^ -616838827;
                                                                        continue block161;
                                                                        case -1998587739: {
                                                                            var39_27 ^= var40_5 ^ -750964428;
                                                                            ** continue;
                                                                        }
                                                                        case -715574371: {
                                                                            if (var37_37 >= var4_7) ** GOTO lbl478
                                                                            break block236;
                                                                        }
                                                                        case -1461366232: {
                                                                            ++var37_37;
                                                                            break block233;
                                                                        }
                                                                        case 545396362: {
                                                                            var39_27 ^= var40_5 ^ 898393625;
                                                                            var40_5 = (var38_4 | var41_3) ^ 1398574583;
                                                                            continue block161;
                                                                        }
                                                                    }
                                                                    var40_5 = (var38_4 | var41_3) ^ 484677696;
                                                                    continue;
                                                                }
                                                                var40_5 = (var38_4 | var41_3) ^ 1958822155;
                                                                continue;
                                                            }
lbl190:
                                                            // 2 sources

                                                        }
lbl191:
                                                        // 1 sources

                                                        while (true) {
                                                            var40_5 = (var38_4 | var41_3) ^ -1214480509;
                                                            break block223;
                                                            break;
                                                        }
lbl194:
                                                        // 1 sources

                                                        while (true) {
                                                            var40_5 = (var38_4 | var41_3) ^ 1080780490;
                                                            break block222;
                                                            break;
                                                        }
lbl197:
                                                        // 1 sources

                                                        while (true) {
                                                            var40_5 = (var38_4 | var41_3) ^ -704681993;
                                                            break block223;
                                                            break;
                                                        }
lbl200:
                                                        // 1 sources

                                                        while (true) {
                                                            var40_5 = (var38_4 | var41_3) ^ -303442255;
                                                            break block222;
                                                            break;
                                                        }
lbl203:
                                                        // 1 sources

                                                        while (true) {
                                                            var40_5 = (var38_4 | var41_3) ^ 1519483993;
                                                            break block230;
lbl206:
                                                            // 1 sources

                                                            while (true) {
                                                                var40_5 = (var38_4 | var41_3) ^ 1833169927;
                                                                break block234;
                                                                break;
                                                            }
lbl209:
                                                            // 1 sources

                                                            while (true) {
                                                                var40_5 = (var38_4 | var41_3) ^ -848775308;
                                                                break block222;
                                                                break;
                                                            }
                                                            break;
                                                        }
lbl212:
                                                        // 2 sources

                                                        while (true) {
                                                            var39_27 ^= 576339573;
                                                            var22_25 = v21;
                                                            var40_5 = (var38_4 | var41_3) ^ -1036742438;
                                                            break block227;
                                                            break;
                                                        }
lbl217:
                                                        // 1 sources

                                                        while (true) {
                                                            var40_5 = (var38_4 | var41_3) ^ -1926998257;
                                                            break block223;
                                                            break;
                                                        }
lbl220:
                                                        // 1 sources

                                                        while (true) {
                                                            var40_5 = (var38_4 | var41_3) ^ 2094719458;
                                                            break block223;
lbl223:
                                                            // 1 sources

                                                            while (true) {
                                                                var40_5 = (var38_4 | var41_3) ^ -1905896451;
                                                                break block223;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    while (true) {
                                                        switch (var39_27) {
                                                            case -1238632137: {
                                                                var39_27 ^= -1422457894;
                                                                ** GOTO lbl48
                                                            }
                                                            case 531501791: {
                                                                var39_27 ^= -1548407704;
                                                                ** continue;
                                                            }
                                                        }
                                                        var39_27 ^= -992200375;
                                                    }
                                                }
lbl238:
                                                // 2 sources

                                                while (true) {
                                                    var40_5 = (var38_4 | var41_3) ^ 1936074618;
                                                    ** GOTO lbl190
                                                    break;
                                                }
lbl241:
                                                // 1 sources

                                                while (true) {
                                                    v11 = iV.NJ(((var39_27 ^= 1386591000) | var41_3) ^ 537166708, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ 937707651));
                                                    ** GOTO lbl98
                                                    break;
                                                }
lbl244:
                                                // 1 sources

                                                while (true) {
                                                    var40_5 = (var38_4 | var41_3) ^ -2021434515;
                                                    break block221;
                                                    break;
                                                }
lbl247:
                                                // 2 sources

                                                while (true) {
                                                    var40_5 = (var38_4 | var41_3) ^ -1526680186;
                                                    break block222;
                                                    break;
                                                }
                                            }
lbl251:
                                            // 2 sources

                                            block179: while (true) {
                                                switch (var40_5) {
                                                    default: {
                                                        continue block179;
                                                    }
                                                    case 1410531336: {
                                                        var37_37 = 0;
                                                        ** continue;
                                                    }
                                                    case -334988775: {
                                                        var39_27 ^= var40_5 ^ -331423015;
                                                        var40_5 = (var38_4 | var41_3) ^ -890515151;
                                                        continue block179;
                                                    }
                                                    case -1761989672: {
                                                        var39_27 ^= var40_5 ^ 993553841;
                                                        var40_5 = (var38_4 | var41_3) ^ -1347756073;
                                                        continue block179;
                                                    }
                                                    case 827461358: 
                                                }
                                                var36_36.sort(Comparator.comparingDouble((ToDoubleFunction<R>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, NN(double double z.r.R ), (Lz/r/R;)D)((double)var32_34, (double)var34_35)));
                                                ** continue;
                                                break;
                                            }
lbl269:
                                            // 1 sources

                                            while (true) {
                                                var40_5 = (var38_4 | var41_3) ^ 2012798326;
                                                break block222;
                                                break;
                                            }
                                        }
lbl273:
                                        // 2 sources

                                        while (true) {
                                            var39_27 ^= -879315574;
                                            ** continue;
                                            break;
                                        }
lbl276:
                                        // 1 sources

                                        while (true) {
                                            if (var23_26 <= 0L) ** continue;
                                            ** continue;
                                            break;
                                        }
lbl279:
                                        // 1 sources

                                        while (true) {
                                            var39_27 ^= 1994380208;
                                            var20_23 = var17_20 + var15_18 - var1_1.s(var6_9);
                                            var39_27 ^= 195739762;
                                            var21_24 = var18_21 + var1_1.s(var6_9);
                                            ** continue;
                                            break;
                                        }
                                    }
lbl286:
                                    // 2 sources

                                    while (true) {
                                        var39_27 ^= -922788332;
                                        ** continue;
                                        break;
                                    }
lbl289:
                                    // 1 sources

                                    while (true) {
                                        var40_5 = (var38_4 | var41_3) ^ -1547275634;
                                        break block227;
lbl292:
                                        // 1 sources

                                        while (true) {
                                            v9 = var5_8.buds() + " buds \u00b7 " + var5_8.budding() + " budding";
                                            ** continue;
                                            break;
                                        }
                                        break;
                                    }
lbl295:
                                    // 1 sources

                                    while (true) {
                                        var39_27 ^= 1082005843;
                                        var28_30 = var27_29[0];
                                        var29_31 = var27_29[1];
                                        var30_32 = var27_29[2];
                                        var31_33 = var27_29[3];
                                        var40_5 = (var38_4 | var41_3) ^ -16632697;
                                        break block222;
                                        break;
                                    }
lbl303:
                                    // 4 sources

                                    while (true) {
                                        var40_5 = (var38_4 | var41_3) ^ 874203089;
                                        break block223;
                                        break;
                                    }
lbl306:
                                    // 1 sources

                                    while (true) {
                                        var40_5 = (var38_4 | var41_3) ^ -1828242001;
                                        break block221;
                                        break;
                                    }
lbl309:
                                    // 1 sources

                                    while (true) {
                                        var40_5 = (var38_4 | var41_3) ^ 1098116822;
                                        break block220;
                                        break;
                                    }
                                }
                                block191: while (true) {
                                    block237: {
                                        switch (var40_5) {
                                            case 1000250899: {
                                                var39_27 ^= var40_5 ^ 676404296;
                                                var40_5 = (var38_4 | var41_3) ^ 1940820079;
                                                continue block191;
                                            }
                                            case 828579499: {
                                                v10 = var5_8.growth();
                                                ** continue;
                                            }
                                            case -1284223571: {
                                                var39_27 ^= var40_5 ^ -2115660619;
                                                var40_5 = (var38_4 | var41_3) ^ 207554673;
                                                break block237;
                                            }
                                            case 1553728307: {
                                                v22 = var5_8.fromCluster();
                                                var39_27 ^= -441779741;
                                                if (var5_8.fromCluster() <= 0L) ** continue;
                                                ** break;
                                            }
                                            case -2011738192: {
                                                var25_28 = var5_8.fromBreak() + var5_8.fromSound();
                                                ** continue;
                                            }
lbl334:
                                            // 1 sources

                                            v20 = iV.NJ(((var39_27 ^= 693333444) | var41_3) ^ 540329816, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ 1734993646));
lbl335:
                                            // 2 sources

                                            var39_27 ^= 342741914;
                                            break;
                                            case 1573531804: {
                                                var39_27 ^= var40_5 ^ -1316956060;
                                                var40_5 = (var38_4 | var41_3) ^ -1490690836;
                                                break block237;
                                            }
                                            case -1403145217: {
                                                var39_27 ^= var40_5 ^ -1265862460;
                                                var40_5 = (var38_4 | var41_3) ^ -891633292;
                                                break block237;
                                            }
                                            case -135866450: {
                                                var39_27 ^= -809191487;
                                                ** continue;
                                            }
                                        }
                                        var21_24 = this.NE(var1_1, var19_22, var20_23, var21_24, var7_10, iV.V, v22, v20);
                                        var40_5 = (var38_4 | var41_3) ^ 1474587680;
                                        continue;
                                    }
lbl352:
                                    // 2 sources

                                }
lbl353:
                                // 1 sources

                                while (true) {
                                    var36_36 = new ArrayList<R>((Collection<R>)var3_6);
                                    var40_5 = (var38_4 | var41_3) ^ 397518278;
                                    ** continue;
                                    break;
                                }
lbl357:
                                // 1 sources

                                while (true) {
                                    var40_5 = (var38_4 | var41_3) ^ -169348895;
                                    break block227;
                                    break;
                                }
lbl360:
                                // 1 sources

                                while (true) {
                                    var40_5 = (var38_4 | var41_3) ^ -1076632940;
                                    break block223;
lbl363:
                                    // 1 sources

                                    while (true) {
                                        var40_5 = (var38_4 | var41_3) ^ -1570289213;
                                        break block223;
                                        break;
                                    }
                                    break;
                                }
lbl366:
                                // 2 sources

                                while (true) {
                                    var40_5 = (var38_4 | var41_3) ^ 108360764;
                                    break block222;
                                    break;
                                }
lbl369:
                                // 1 sources

                                while (true) {
                                    var40_5 = (var38_4 | var41_3) ^ 1322908374;
                                    break block220;
                                    break;
                                }
lbl372:
                                // 1 sources

                                block199: while (true) {
                                    switch (var39_27) {
                                        case 976524857: {
                                            var39_27 ^= -1588288929;
                                            continue block199;
                                        }
                                        default: {
                                            var39_27 ^= 531915553;
                                            break;
                                        }
                                        case -507362545: {
                                            var39_27 ^= 872354949;
                                        }
                                    }
                                    if (!this.a.isEmpty()) ** continue;
                                    v6 = iV.NJ(((var39_27 ^= 858933809) | var41_3) ^ 639813475, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ 562347450));
                                    ** continue;
                                    break;
                                }
lbl385:
                                // 1 sources

                                while (true) {
                                    v19 = var1_1.s(11.5f);
                                    if (var28_30 + var29_31 + var30_32 <= 0) ** continue;
                                    v7 = iV.NJ(((var39_27 ^= -910375536) | var41_3) ^ 679135059, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ 1250443632));
                                    ** continue;
                                    break;
                                }
lbl390:
                                // 1 sources

                                while (true) {
                                    var40_5 = (var38_4 | var41_3) ^ 1511595807;
                                    break block222;
lbl393:
                                    // 1 sources

                                    while (true) {
                                        var40_5 = (var38_4 | var41_3) ^ 86906627;
                                        break block222;
                                        break;
                                    }
                                    break;
                                }
                                while (true) {
                                    v11 = iV.NJ(((var39_27 ^= 1386591000) | var41_3) ^ 537166709, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ -912132052));
                                    ** continue;
                                    break;
                                }
lbl399:
                                // 1 sources

                                while (true) {
                                    var40_5 = (var38_4 | var41_3) ^ 2061691845;
                                    break block223;
                                    break;
                                }
lbl402:
                                // 1 sources

                                while (true) {
                                    if (var25_28 <= 0L) ** continue;
                                    ** continue;
                                    break;
                                }
                            }
                            block206: while (true) {
                                switch (var40_5) {
                                    case -1519734944: {
                                        var39_27 ^= var40_5 ^ 481723747;
                                        ** continue;
                                    }
                                    case 1981578598: {
                                        var39_27 ^= var40_5 ^ -236487667;
                                        ** GOTO lbl366
                                    }
                                    case 2081225102: {
                                        var1_1.line(var19_22, var21_24, var20_23, var21_24, var1_1.s(1.0f), iV.NJ((var39_27 | var40_5 ^ 1301115473) ^ (var40_5 ^ 474107520), (var38_4 | var40_5 ^ 1301115473) ^ ((var39_27 | var40_5 ^ 1301115473) ^ (var40_5 ^ 499991003))));
                                        ** GOTO lbl493
                                    }
                                    case 404672343: {
                                        var21_24 += var1_1.s(var7_10);
                                        var40_5 = (var38_4 | var41_3) ^ 1590915263;
                                        continue block206;
                                    }
                                    case 27522928: {
                                        var1_1.text(iV.ab, var19_22, var21_24 + var1_1.s(var7_10 * 0.5f), var1_1.s(10.0f), iV.NJ((var39_27 | var40_5 ^ 807566511) ^ (var40_5 ^ 797639770), (var38_4 | var40_5 ^ 807566511) ^ ((var39_27 | var40_5 ^ 807566511) ^ (var40_5 ^ -1428163439))));
                                        ** break;
                                    }
                                    case -1754922475: {
                                        ** GOTO lbl247
                                    }
                                    case 881244624: {
                                        var39_27 ^= var40_5 ^ 1403715655;
                                        ** continue;
                                    }
                                    case -1143817963: {
                                        if (!var3_6.isEmpty()) ** GOTO lbl512
                                        ** GOTO lbl498
                                    }
                                    case 271247700: {
                                        var21_24 += var1_1.s(var11_14 * 0.5f);
                                        ** GOTO lbl480
                                    }
                                    case -1871595806: {
                                        var32_34 = var2_2.field_1724.method_23317();
                                        var34_35 = var2_2.field_1724.method_23321();
                                        ** GOTO lbl503
                                    }
                                    case -1543846164: {
                                        var39_27 ^= var40_5 ^ -162448644;
                                        ** GOTO lbl505
                                    }
                                    case 379338727: {
                                        var1_1.textRight(var3_6.size() + " found", var20_23, var21_24 + var1_1.s(8.0f), var1_1.s(10.0f), iV.NJ((var39_27 | var40_5 ^ 656258104) ^ (var40_5 ^ -89863958), (var38_4 | var40_5 ^ 656258104) ^ ((var39_27 | var40_5 ^ 656258104) ^ (var40_5 ^ 1547784711))));
                                        ** GOTO lbl523
                                    }
                                    case 669718295: {
                                        var39_27 ^= var40_5 ^ 592975890;
                                        var40_5 = (var38_4 | var41_3) ^ -342673781;
                                        continue block206;
                                    }
                                    case 130539501: {
                                        var39_27 ^= var40_5 ^ 87744403;
                                        ** continue;
                                    }
                                    case -1313048195: {
                                        var39_27 ^= var40_5 ^ 1501612539;
                                        ** continue;
                                    }
                                    case -23607076: {
                                        var21_24 += var1_1.s(var11_14 * 0.5f);
                                        ** continue;
                                    }
                                    case 968170038: {
                                        var39_27 ^= var40_5 ^ 2045233552;
                                        ** continue;
                                    }
                                    case 329576786: {
                                        var1_1.text(iV.H, var19_22, var21_24 + var1_1.s(var7_10 * 0.5f), var1_1.s(11.5f), iV.NJ((var39_27 | var40_5 ^ 572881549) ^ (var40_5 ^ -243002848), (var38_4 | var40_5 ^ 572881549) ^ ((var39_27 | var40_5 ^ 572881549) ^ (var40_5 ^ -1958399570))));
                                        ** continue;
                                    }
                                    case 374344046: {
                                        var39_27 ^= var40_5 ^ -348629835;
                                        ** continue;
                                    }
                                    case 1589209689: {
                                        switch (var39_27) {
                                            case -1947828483: {
                                                var40_5 = (var38_4 | var41_3) ^ 1241884322;
                                                continue block206;
                                            }
                                            default: {
                                                var40_5 = (var38_4 | var41_3) ^ -1918524743;
                                                continue block206;
                                            }
                                            case 899781937: 
                                        }
                                        var40_5 = (var38_4 | var41_3) ^ -1039350295;
                                        continue block206;
                                    }
lbl478:
                                    // 3 sources

                                    var40_5 = (var38_4 | var41_3) ^ 1826610634;
                                    ** GOTO lbl499
lbl480:
                                    // 1 sources

                                    var40_5 = (var38_4 | var41_3) ^ -58851278;
                                    ** GOTO lbl499
                                    case -1583300416: {
                                        v3 = var21_24 + var1_1.s(8.0f);
                                        v4 = var1_1.s(10.0f);
                                        if (!var3_6.isEmpty()) ** continue;
                                        ** continue;
                                    }
                                    case -1590995183: {
                                        var39_27 ^= var40_5 ^ -1196270681;
                                        ** GOTO lbl501
                                    }
                                    case -1941896535: {
                                        var39_27 ^= var40_5 ^ -771919600;
                                        ** GOTO lbl525
                                    }
lbl493:
                                    // 1 sources

                                    var40_5 = (var38_4 | var41_3) ^ -598554424;
                                    ** GOTO lbl499
                                    case -179678838: {
                                        var39_27 ^= var40_5 ^ -206961077;
                                        ** continue;
                                    }
lbl498:
                                    // 1 sources

                                    var40_5 = (var38_4 | var41_3) ^ 1519552718;
lbl499:
                                    // 6 sources

                                    default: {
                                        continue block206;
                                    }
lbl501:
                                    // 1 sources

                                    var40_5 = (var38_4 | var41_3) ^ -98948945;
                                    continue block206;
lbl503:
                                    // 1 sources

                                    var39_27 ^= -2002607591;
                                    ** continue;
lbl505:
                                    // 1 sources

                                    var40_5 = (var38_4 | var41_3) ^ -475590520;
                                    continue block206;
                                    case 55181576: {
                                        v17 = "C" + var28_30 + " Bd" + var29_31 + " b" + var30_32 + " Bl" + var31_33;
                                        v18 = var21_24 + var1_1.s(var7_10 * 0.5f);
                                        var39_27 ^= -431181354;
                                        ** continue;
                                    }
lbl512:
                                    // 1 sources

                                    var40_5 = (var38_4 | var41_3) ^ -817928689;
                                    continue block206;
                                    case 919693483: {
                                        var21_24 += var1_1.s(var12_15);
                                        ** continue;
                                    }
                                    case -1840943219: {
                                        var39_27 ^= var40_5 ^ -1565360527;
                                        ** continue;
                                    }
                                    case -36918301: {
                                        var40_5 = (var38_4 | var41_3) ^ -1402003422;
                                        continue block206;
                                    }
lbl523:
                                    // 1 sources

                                    var40_5 = (var38_4 | var41_3) ^ 250842709;
                                    continue block206;
lbl525:
                                    // 1 sources

                                    var40_5 = (var38_4 | var41_3) ^ -2018171311;
                                    continue block206;
                                    case -1555190127: {
                                        var39_27 ^= var40_5 ^ 1449653674;
                                        ** continue;
                                    }
                                    case 79424344: {
                                        var39_27 ^= var40_5 ^ -331517353;
                                        var40_5 = (var38_4 | var41_3) ^ -400740723;
                                        continue block206;
                                    }
                                    case 1473708029: 
                                }
                                break;
                            }
                            return;
lbl536:
                            // 1 sources

                            while (true) {
                                var40_5 = (var38_4 | var41_3) ^ -1578468548;
                                break block227;
lbl539:
                                // 1 sources

                                while (true) {
                                    v5 = iV.NJ(((var39_27 ^= 1773059808) | var41_3) ^ -366963842, (var38_4 | var41_3) ^ ((var39_27 | var41_3) ^ 136939894));
                                    ** continue;
                                    break;
                                }
                                break;
                            }
                        }
                        block209: while (true) {
                            switch (var40_5) {
                                case -1591172218: {
                                    var27_29 = this.ND();
                                    ** continue;
                                }
                                case -180940915: {
                                    var39_27 ^= var40_5 ^ 1149316649;
                                    ** continue;
                                }
                                case -1661528920: {
                                    break block209;
                                }
                                case 622859778: {
                                    var39_27 ^= var40_5 ^ -250295560;
                                    ** break;
lbl556:
                                    // 1 sources

                                    var40_5 = (var38_4 | var41_3) ^ 1733217143;
                                }
lbl557:
                                // 3 sources

                                default: {
                                    continue block209;
                                }
                            }
                            break;
                        }
                        var39_27 ^= -185514001;
                        ** while (true)
lbl561:
                        // 1 sources

                        while (true) {
                            var40_5 = (var38_4 | var41_3) ^ 1221431922;
                            ** GOTO lbl352
                            break;
                        }
                    }
                    block211: while (true) {
                        switch (var40_5) {
                            case 36421887: {
                                var39_27 ^= var40_5 ^ -1210319955;
                                var40_5 = (var38_4 | var41_3) ^ 785417366;
                                continue block211;
                            }
                            case 2084209842: {
                                var1_1.roundedRect(var17_20, var18_21, var15_18, var16_19, var1_1.s(14.0f), iV.NJ((var39_27 | var40_5 ^ 1304104813) ^ (var40_5 ^ -738039818), (var38_4 | var40_5 ^ 1304104813) ^ ((var39_27 | var40_5 ^ 1304104813) ^ (var40_5 ^ 1811583180))));
                                ** break;
                            }
                            case 1757340272: {
                                var1_1.shadow(var17_20, var18_21, var15_18, var16_19, var1_1.s(14.0f), var1_1.s(18.0f), iV.NJ((var39_27 | var40_5 ^ 1497328047) ^ (var40_5 ^ -1969605321), (var38_4 | var40_5 ^ 1497328047) ^ ((var39_27 | var40_5 ^ 1497328047) ^ (var40_5 ^ -74500563))));
                                var40_5 = (var38_4 | var41_3) ^ 150822911;
                                continue block211;
                            }
                            case -213614560: {
                                var39_27 ^= var40_5 ^ -1202111066;
                                ** continue;
                            }
                            case -1978305581: {
                                var39_27 ^= var40_5 ^ 1056662927;
                                ** continue;
                            }
                            case -692073193: {
                                var1_1.strokeRoundedRect(var17_20, var18_21, var15_18, var16_19, var1_1.s(14.0f), var1_1.s(1.0f), iV.NJ((var39_27 | var40_5 ^ -415349048) ^ (var40_5 ^ -117895566), (var38_4 | var40_5 ^ -415349048) ^ ((var39_27 | var40_5 ^ -415349048) ^ (var40_5 ^ -1783291307))));
                                ** continue;
                            }
lbl587:
                            // 1 sources

                            var40_5 = (var38_4 | var41_3) ^ 529199705;
                            ** GOTO lbl592
                            case -466408058: {
                                var39_27 ^= var40_5 ^ 1120701871;
                                var40_5 = (var38_4 | var41_3) ^ 755372744;
                            }
lbl592:
                            // 3 sources

                            default: {
                                continue block211;
                            }
                            case -714515639: 
                        }
                        break;
                    }
                    var19_22 = var17_20 + var1_1.s(var6_9);
                    ** while (true)
                    while (true) {
                        var40_5 = (var38_4 | var41_3) ^ -1651044688;
                        break block223;
lbl600:
                        // 1 sources

                        while (true) {
                            var40_5 = (var38_4 | var41_3) ^ -146560101;
                            break block223;
                            break;
                        }
                        break;
                    }
lbl603:
                    // 1 sources

                    while (true) {
                        var40_5 = (var38_4 | var41_3) ^ -1873039279;
                        break block223;
                        break;
                    }
                }
                block215: while (true) {
                    switch (var40_5) {
                        default: {
                            continue block215;
                        }
                        case 506303869: {
                            var21_24 += var1_1.s(var9_12);
                            ** continue;
                        }
                        case 1515431139: {
                            if (!var22_25) ** continue;
                            var39_27 ^= 1912600151;
                            ** continue;
                        }
                        case 965562117: {
                            var39_27 ^= var40_5 ^ 1881721061;
                            var40_5 = (var38_4 | var41_3) ^ 1665881592;
                            continue block215;
                        }
                        case -1728935385: {
                            v12 = var21_24 + var1_1.s(8.0f);
                            v13 = var1_1.s(10.0f);
                            if (!var22_25) ** continue;
                            ** continue;
                        }
                        case -653634136: {
                            var39_27 ^= var40_5 ^ 957785361;
                            ** continue;
                        }
                        case 241053502: {
                            var39_27 ^= var40_5 ^ -1078683526;
                            ** continue;
                        }
                        case -1011206003: {
                            var39_27 ^= var40_5 ^ -1021312318;
                            ** continue;
                        }
                        case 1484762449: 
                    }
                    break;
                }
                var23_26 = var5_8.fromBlockUpdate() + var5_8.fromDelta();
                ** while (true)
lbl639:
                // 1 sources

                while (true) {
                    var4_7 = Math.min(var3_6.size(), ((Float)this.c.getValue()).intValue());
                    ** continue;
                    break;
                }
lbl642:
                // 1 sources

                while (true) {
                    var40_5 = (var38_4 | var41_3) ^ -409036148;
                    break block223;
                    break;
                }
            }
            block218: while (true) {
                switch (var40_5) {
                    default: {
                        continue block218;
                    }
                    case 599506488: {
                        var1_1.a = 1.0f;
                        var40_5 = (var38_4 | var41_3) ^ 1281895182;
                        continue block218;
                    }
                    case -1759376272: {
                        var39_27 ^= var40_5 ^ 1887840123;
                        ** continue;
                    }
                    case -1251990263: {
                        var39_27 ^= var40_5 ^ 726159962;
                        ** continue;
                    }
                    case -1210977071: {
                        var39_27 ^= var40_5 ^ 1337682636;
                        ** continue;
                    }
                    case -1779061662: {
                        var40_5 = (var38_4 | var41_3) ^ 1822151599;
                        continue block218;
                    }
                    case -1161154295: {
                        var1_1.b = ig.hudScale(var2_2);
                        ** continue;
                    }
                    case 77630885: 
                }
                break;
            }
            var3_6 = this.a;
            var39_27 ^= -1840579320;
            ** while (true)
        }
        block219: while (true) {
            switch (var40_5) {
                default: {
                    continue block219;
                }
                case 1990035664: {
                    var21_24 += var1_1.s(var8_11 - var6_9);
                    ** continue;
                }
                case -2124729318: {
                    v14 = this.a.size() + " geodes";
                    v15 = var21_24 + var1_1.s(6.0f);
                    v16 = var1_1.s(10.0f);
                    ** continue;
                }
                case 2108859140: {
                    if (var5_8.fromSound() > 0L) ** GOTO lbl303
                    ** continue;
                }
                case 1507759644: {
                    var39_27 ^= var40_5 ^ -1077840534;
                    ** continue;
                }
                case -341629657: {
                    v21 = false;
                    ** GOTO lbl212
                }
                case 472335699: {
                    v21 = true;
                    ** continue;
                }
                case 1560409637: {
                    var39_27 ^= var40_5 ^ 772608853;
                    ** continue;
                }
                case 1764590673: {
                    var39_27 ^= var40_5 ^ 1014982346;
                    var40_5 = (var38_4 | var41_3) ^ -1742306994;
                    continue block219;
                }
                case 1714344303: {
                    var39_27 ^= var40_5 ^ -777366631;
                    var40_5 = (var38_4 | var41_3) ^ 270203640;
                    continue block219;
                }
                case 1671388817: {
                    var21_24 += var1_1.s(6.0f);
                    ** continue;
                }
                case -130760872: {
                    var39_27 ^= var40_5 ^ -1623791279;
                    ** continue;
                }
                case -1588090770: {
                    var40_5 = (var38_4 | var41_3) ^ -2046067493;
                    continue block219;
                }
                case -811427826: {
                    var39_27 ^= var40_5 ^ 2015763192;
                    ** continue;
                }
                case 1810001806: {
                    var40_5 = (var38_4 | var41_3) ^ 551384561;
                    continue block219;
                }
                case 1147813195: {
                    var1_1.line(var19_22, var21_24, var20_23, var21_24, var1_1.s(1.0f), iV.NJ((var39_27 | var40_5 ^ 1978381972) ^ (var40_5 ^ 675610122), (var38_4 | var40_5 ^ 1978381972) ^ ((var39_27 | var40_5 ^ 1978381972) ^ (var40_5 ^ 2013511500))));
                    break;
                }
                case -614159826: {
                    if (var5_8.fromCluster() <= 0L) ** continue;
                    ** GOTO lbl303
                }
                case 217740356: {
                    var1_1.sectionLabel(iV.Z, var19_22, var21_24 + var1_1.s(6.0f), var1_1.s(11.5f), iV.NJ((var39_27 | var40_5 ^ 1031536539) ^ (var40_5 ^ -1397046490), (var38_4 | var40_5 ^ 1031536539) ^ ((var39_27 | var40_5 ^ 1031536539) ^ (var40_5 ^ 1303784800))));
                    ** continue;
                }
                case -2023539139: {
                    if (var5_8.buds() > 0) ** GOTO lbl303
                    ** continue;
                }
                case 776386600: {
                    var39_27 ^= var40_5 ^ -1541217602;
                    ** continue;
                }
                case 1056105005: {
                    var39_27 ^= -1751524648;
                    if (var5_8.fromBreak() <= 0L) ** break;
                    ** continue;
                    ** continue;
                }
                case 1277534300: {
                    var39_27 ^= var40_5 ^ -608404860;
                    ** continue;
                }
                case 1977584674: {
                    var39_27 ^= var40_5 ^ 601307343;
                    ** continue;
                }
            }
            var40_5 = (var38_4 | var41_3) ^ -1835770994;
        }
    }

    /*
     * Exception decompiling
     */
    private lG NC() {
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
    private int[] ND() {
        block62: {
            block64: {
                block60: {
                    block59: {
                        block67: {
                            block65: {
                                block63: {
                                    block66: {
                                        block61: {
                                            var8_1 = -1726168593;
                                            var5_2 = iV.w & -1726168593 ^ 1201744690;
                                            var7_3 = 0;
                                            ** GOTO lbl54
lbl5:
                                            // 1 sources

                                            while (true) {
                                                var7_3 = (var5_2 | var8_1) ^ 1615655606;
                                                break block59;
                                                break;
                                            }
lbl8:
                                            // 3 sources

                                            block31: while (true) {
                                                switch (var7_3) lbl-1000:
                                                // 4 sources

                                                {
                                                    default: {
                                                        continue block31;
                                                    }
lbl12:
                                                    // 1 sources

                                                    while (true) {
                                                        var7_3 = (var5_2 | var8_1) ^ -1112160094;
                                                        break block60;
                                                        break;
                                                    }
lbl15:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_8 = 0;
                                                        break block31;
                                                        break;
                                                    }
                                                    case -1602947072: {
                                                        v0 = var4_8;
                                                        var1_5[v0] = var1_5[v0] + var3_7[var4_8];
                                                        ++var4_8;
                                                        break block31;
                                                    }
lbl23:
                                                    // 2 sources

                                                    while (true) {
                                                        var7_3 = (var5_2 | var8_1) ^ -1930430978;
                                                        break block60;
                                                        break;
                                                    }
lbl26:
                                                    // 1 sources

                                                    while (var2_6.hasNext()) {
                                                        break block61;
                                                    }
                                                    break block62;
lbl29:
                                                    // 1 sources

                                                    while (true) {
                                                        var7_3 = (var5_2 | var8_1) ^ -485255230;
                                                        break block60;
                                                        break;
                                                    }
lbl32:
                                                    // 1 sources

                                                    while (true) {
                                                        var7_3 = (var5_2 | var8_1) ^ -2076747664;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl35:
                                                    // 1 sources

                                                    while (true) {
                                                        var7_3 = (var5_2 | var8_1) ^ -431838888;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl38:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_4 ^= var7_3 ^ -589418025;
                                                        var7_3 = (var5_2 | var8_1) ^ 1816925589;
                                                        break block59;
                                                        break;
                                                    }
lbl42:
                                                    // 2 sources

                                                    while (true) {
                                                        var7_3 = (var5_2 | var8_1) ^ -255757083;
                                                        break block60;
                                                        break;
                                                    }
lbl45:
                                                    // 1 sources

                                                    while (true) {
                                                        var7_3 = (var5_2 | var8_1) ^ -383891638;
                                                        break block60;
                                                        break;
                                                    }
lbl48:
                                                    // 1 sources

                                                    while (true) {
                                                        var1_5 = new int[4];
                                                        break block63;
                                                        break;
                                                    }
                                                    case 973030055: {
                                                        if (var4_8 >= var1_5.length) break block64;
                                                        break block65;
                                                    }
lbl54:
                                                    // 1 sources

                                                    var6_4 = (var5_2 | var8_1) ^ -1863410012;
                                                    var7_3 = (var5_2 | var8_1) ^ 1720832127;
                                                    break block59;
                                                }
                                                break;
                                            }
                                            var7_3 = (var5_2 | var8_1) ^ 2143936572;
                                            ** GOTO lbl8
                                            {
                                                case -1603007549: {
                                                    var6_4 ^= var7_3 ^ 1085139683;
                                                    ** continue;
                                                }
                                            }
lbl62:
                                            // 1 sources

                                            while (true) {
                                                var6_4 ^= 1768808385;
                                                ** continue;
                                                break;
                                            }
lbl65:
                                            // 1 sources

                                            while (true) {
                                                var7_3 = (var5_2 | var8_1) ^ -1386242871;
                                                break block60;
                                                break;
                                            }
lbl68:
                                            // 1 sources

                                            while (true) {
                                                var3_7 = (int[])var2_6.next();
                                                ** continue;
                                                break;
                                            }
                                            {
                                                case 700782124: {
                                                    var6_4 ^= var7_3 ^ -66587546;
                                                    ** continue;
                                                }
                                            }
lbl74:
                                            // 1 sources

                                            while (true) {
                                                var7_3 = (var5_2 | var8_1) ^ -1286164686;
                                                break block60;
                                                break;
                                            }
lbl77:
                                            // 1 sources

                                            while (true) {
                                                var2_6 = this.c.values().iterator();
                                                break block66;
                                                break;
                                            }
                                        }
                                        var7_3 = (var5_2 | var8_1) ^ 691153091;
                                        break block60;
                                    }
lbl84:
                                    // 2 sources

                                    while (true) {
                                        var7_3 = (var5_2 | var8_1) ^ 1570211039;
                                        break block60;
                                        break;
                                    }
                                }
                                var6_4 ^= 1416117314;
                                ** while (true)
                                {
                                    case -1123252067: {
                                        var6_4 ^= var7_3 ^ 1574267325;
                                        var7_3 = (var5_2 | var8_1) ^ 2143884287;
                                        ** GOTO lbl-1000
                                    }
                                }
lbl94:
                                // 1 sources

                                while (true) {
                                    var6_4 ^= var7_3 ^ -818258443;
                                    ** GOTO lbl23
                                    break;
                                }
lbl97:
                                // 1 sources

                                while (true) {
                                    switch (var6_4) {
                                        case 2014601607: {
                                            ** continue;
                                        }
                                        default: {
                                            ** continue;
                                        }
                                        ** case 442216397:
lbl104:
                                        // 1 sources

                                        ** continue;
                                    }
                                    break;
                                }
lbl105:
                                // 1 sources

                                while (true) {
                                    var6_4 ^= var7_3 ^ 1094131453;
                                    break block67;
                                    break;
                                }
                            }
                            var7_3 = (var5_2 | var8_1) ^ 1655792482;
                            ** GOTO lbl8
                        }
                        var7_3 = (var5_2 | var8_1) ^ -2119558194;
                        break block60;
lbl114:
                        // 1 sources

                        return var1_5;
                    }
                    block54: while (true) {
                        switch (var7_3) {
                            default: {
                                continue block54;
                            }
                            case -1188283520: {
                                ** continue;
                            }
                            case -1074718391: {
                                ** continue;
                            }
                            ** case -1275986326:
lbl126:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
lbl127:
                    // 1 sources

                    while (true) {
                        var6_4 ^= var7_3 ^ -1184881530;
                        ** continue;
                        break;
                    }
                    {
                        ** case 1535816591:
                    }
lbl131:
                    // 1 sources

                    ** while (true)
lbl132:
                    // 1 sources

                    while (true) {
                        var6_4 ^= var7_3 ^ 540138423;
                        ** GOTO lbl42
                        break;
                    }
lbl135:
                    // 1 sources

                    while (true) {
                        var6_4 ^= var7_3 ^ 1905334348;
                        ** continue;
                        break;
                    }
                }
lbl139:
                // 2 sources

                block58: while (true) {
                    switch (var7_3) {
                        default: {
                            continue block58;
                        }
                        case 1018068029: {
                            ** GOTO lbl26
                        }
                        case 1397890561: {
                            ** continue;
                        }
                        case -2111148256: {
                            ** continue;
                        }
                        case 916696245: {
                            ** continue;
                        }
                        case 1827357901: {
                            ** continue;
                        }
                        case 796696346: {
                            ** continue;
                        }
                        case -685158904: {
                            ** continue;
                        }
                        case 1578627121: {
                            ** continue;
                        }
                        case -158350532: {
                            ** continue;
                        }
                        case 1927444278: {
                            ** continue;
                        }
                        ** case 1644700509:
lbl164:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            var7_3 = (var5_2 | var8_1) ^ -159842861;
            ** while (true)
        }
        var7_3 = (var5_2 | var8_1) ^ 143959543;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private float NE(W var1_1, float var2_2, float var3_3, float var4_4, float var5_5, String var6_6, long var7_7, int var9_8) {
        block25: {
            block24: {
                break block25;
lbl1:
                // 3 sources

                block13: while (true) {
                    switch (var13_11) lbl-1000:
                    // 4 sources

                    {
                        default: {
                            continue block13;
                        }
lbl5:
                        // 1 sources

                        while (true) {
                            var13_11 = (var11_10 | var14_9) ^ -1375527815;
                            break block24;
lbl8:
                            // 1 sources

                            while (true) {
                                var13_11 = (var11_10 | var14_9) ^ 2013590982;
                                break block24;
                                break;
                            }
                            break;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            var13_11 = (var11_10 | var14_9) ^ -412220025;
                            ** GOTO lbl-1000
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        while (true) {
                            ** GOTO lbl32
                            break;
                        }
                        case -1552044359: {
                            var1_1.textRight(String.valueOf(var7_7), var3_3, var10_12, var1_1.s(11.5f), var9_8);
                            break block13;
                        }
                        var1_1.text(var6_6, var2_2, var10_12, v0, v1);
                        var13_11 = (var11_10 | var14_9) ^ -1014497967;
                        ** GOTO lbl-1000
                        case -2023427591: {
                            var12_13 ^= var13_11 ^ -825208708;
                            var13_11 = (var11_10 | var14_9) ^ 382794651;
                            ** GOTO lbl-1000
                        }
                        case 143734888: {
                            v0 = var1_1.s(11.5f);
                            if (var7_7 <= 0L) ** continue;
                            break;
                        }
lbl32:
                        // 1 sources

                        v1 = iV.NJ(((var12_13 ^= 987718360) | var14_9) ^ -420081382, (var11_10 | var14_9) ^ ((var12_13 | var14_9) ^ 362894227));
                        ** GOTO lbl56
lbl34:
                        // 1 sources

                        while (true) {
                            var12_13 ^= var13_11 ^ 683207816;
                            ** continue;
                            break;
                        }
                    }
                    break;
                }
                var13_11 = (var11_10 | var14_9) ^ 1755040790;
                ** GOTO lbl1
                {
                    case 561846876: {
                        var12_13 ^= var13_11 ^ 866699647;
                        ** continue;
                    }
                }
                v1 = iV.NJ(((var12_13 ^= 987718360) | var14_9) ^ -420081383, (var11_10 | var14_9) ^ ((var12_13 | var14_9) ^ -2095937207));
                ** GOTO lbl56
lbl44:
                // 1 sources

                while (true) {
                    var13_11 = (var11_10 | var14_9) ^ -830330957;
                    ** GOTO lbl1
                    break;
                }
            }
lbl48:
            // 2 sources

            block22: while (true) {
                switch (var13_11) {
                    default: {
                        continue block22;
                    }
                    case 1107042710: {
                        break block22;
                    }
                    case 2113314607: {
                        ** continue;
                    }
lbl56:
                    // 2 sources

                    var12_13 ^= -1469993588;
                    ** continue;
                }
                break;
            }
            var13_11 = (var11_10 | var14_9) ^ -1844862272;
            ** while (true)
        }
        var14_9 = 762000841;
        var11_10 = iV.w & 762000841 ^ -961212945;
        var13_11 = 0;
        var12_13 = (var11_10 | var14_9) ^ 1137161079;
        ** while (true)
        {
            case -114309516: {
                return var4_4 + var1_1.s(var5_5);
            }
        }
lbl68:
        // 1 sources

        while (true) {
            var13_11 = (var11_10 | var14_9) ^ 1283625814;
            ** continue;
            break;
        }
        {
            ** case 746111166:
        }
lbl72:
        // 1 sources

        var12_13 ^= var13_11 ^ -1185901151;
        ** while (true)
        {
            ** case -1745106903:
        }
lbl75:
        // 1 sources

        var10_12 = var4_4 + var1_1.s(var5_5 * 0.5f);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private float NF(W var1_1, float var2_2, float var3_3, float var4_4, float var5_5, gH var6_6) {
        block53: {
            block54: {
                var14_7 = -1305686819;
                var11_8 = iV.w & -1305686819 ^ 1764337776;
                var13_9 = 0;
                var12_11 = (var11_8 | var14_7) ^ 2091661172;
                var13_9 = (var11_8 | var14_7) ^ 1419905108;
                break block54;
lbl7:
                // 1 sources

                while (true) {
                    var13_9 = (var11_8 | var14_7) ^ 947327771;
                    break block53;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var13_9 = (var11_8 | var14_7) ^ -1308560821;
                    break block54;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var1_1.textRight(var10_14, var3_3, var7_10, v0, v1);
                    var13_9 = (var11_8 | var14_7) ^ 945104329;
                    ** GOTO lbl111
                    break;
                }
lbl17:
                // 1 sources

                block38: while (true) {
                    switch (var13_9) {
                        case -1948255838: {
                            var10_14 = var6_6.in() + "/" + var6_6.edge() + "/" + var6_6.out() + "/" + var6_6.far();
                            ** break;
                        }
                        case -670339057: {
                            var12_11 ^= var13_9 ^ 568548523;
                            var13_9 = (var11_8 | var14_7) ^ 1561610157;
                        }
                        default: {
                            continue block38;
                        }
lbl27:
                        // 1 sources

                        var13_9 = (var11_8 | var14_7) ^ 2068609346;
                        ** GOTO lbl111
                        case 1449684766: {
                            var12_11 ^= var13_9 ^ -1550237702;
                            var13_9 = (var11_8 | var14_7) ^ 1894913375;
                            continue block38;
                        }
                        case -1506170032: 
                    }
                    v2 = !var8_12 ? iV.NJ(((var12_11 ^= 2098836875) | var14_7) ^ -1444630234, (var11_8 | var14_7) ^ ((var12_11 | var14_7) ^ 618744851)) : iV.NJ(((var12_11 ^= 2098836875) | var14_7) ^ -1444630235, (var11_8 | var14_7) ^ ((var12_11 | var14_7) ^ 213472224));
                    var12_11 ^= 826279313;
                    var1_1.text(var9_13, var2_2, var7_10, var1_1.s(10.0f), v2);
                    var13_9 = (var11_8 | var14_7) ^ -1387953181;
                    continue;
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var13_9 = (var11_8 | var14_7) ^ -1919914429;
                    if (true) ** GOTO lbl111
lbl42:
                    // 1 sources

                    while (true) {
                        v1 = fc.accent();
                        ** GOTO lbl47
                        break;
                    }
                    while (true) {
                        v1 = iV.NJ(((var12_11 ^= -1386198508) | var14_7) ^ -442200027, (var11_8 | var14_7) ^ ((var12_11 | var14_7) ^ 1783739251));
lbl47:
                        // 2 sources

                        var12_11 ^= -1698111198;
                        ** continue;
                        break;
                    }
                    break;
                }
lbl49:
                // 1 sources

                block42: while (true) {
                    block55: {
                        block56: {
                            switch (var13_9) {
                                case 2137596165: {
                                    var12_11 ^= var13_9 ^ -467091244;
                                    var13_9 = (var11_8 | var14_7) ^ 777547438;
                                    continue block42;
                                }
                                case -933955556: {
                                    v3 = var6_6.name();
                                    ** break;
                                }
                                case 819753911: {
                                    var12_11 ^= var13_9 ^ 339527023;
                                    var13_9 = (var11_8 | var14_7) ^ 863573217;
                                    ** break;
                                }
                                case -713719213: {
                                    if (var6_6.name().length() > iV.NJ((var12_11 | var13_9 ^ 1733906062) ^ (var13_9 ^ 1880097624), (var11_8 | var13_9 ^ 1733906062) ^ ((var12_11 | var13_9 ^ 1733906062) ^ (var13_9 ^ -1636945587)))) break block55;
                                    var13_9 = (var11_8 | var14_7) ^ -873357494;
                                }
lbl65:
                                // 3 sources

                                default: {
                                    continue block42;
                                }
                                {
                                }
                                case -1737047269: {
                                    var12_11 ^= var13_9 ^ -1130990141;
                                    break block56;
                                }
                                case 201265327: 
                            }
                            v3 = var6_6.name().substring(0, iV.NJ((var12_11 | var13_9 ^ -1177297806) ^ (var13_9 ^ -1436900437), (var11_8 | var13_9 ^ -1177297806) ^ ((var12_11 | var13_9 ^ -1177297806) ^ (var13_9 ^ 2073595393)))) + "\u2026";
lbl73:
                            // 2 sources

                            var12_11 ^= 213162902;
                            var9_13 = v3;
                            var13_9 = (var11_8 | var14_7) ^ 589733106;
                            ** continue;
                        }
                        var13_9 = (var11_8 | var14_7) ^ -254608302;
                        continue;
                    }
                    var13_9 = (var11_8 | var14_7) ^ 1666920422;
                    continue;
                    break;
                }
            }
            while (true) {
                switch (var13_9) {
                    case -1701878108: {
                        var12_11 ^= var13_9 ^ 922704675;
                        ** continue;
                    }
                    case 1227693750: {
                        var7_10 = var4_4 + var1_1.s(var5_5 * 0.5f);
                        ** continue;
                    }
                    case -1349524311: {
                        var13_9 = (var11_8 | var14_7) ^ 1638042201;
                    }
                }
            }
lbl95:
            // 1 sources

            while (true) {
                var12_11 ^= -1386198508;
                ** continue;
                break;
            }
lbl98:
            // 2 sources

            while (true) {
                var12_11 ^= -1256411816;
                var8_12 = v4;
                var13_9 = (var11_8 | var14_7) ^ -2075865608;
                ** continue;
                break;
            }
lbl103:
            // 1 sources

            while (true) {
                var13_9 = (var11_8 | var14_7) ^ 1467258858;
                break block53;
                while (true) {
                    var13_9 = (var11_8 | var14_7) ^ 611668035;
                    break block53;
                    break;
                }
                break;
            }
            block48: while (true) {
                var13_9 = (var11_8 | var14_7) ^ -1718766135;
lbl111:
                // 4 sources

                block49: while (true) {
                    switch (var13_9) {
                        default: {
                            continue block49;
                        }
                        case 1992131262: {
                            v0 = var1_1.s(10.0f);
                            if (!var8_12) ** continue;
                            ** continue;
                        }
                        case -1015494348: {
                            var12_11 ^= var13_9 ^ -605698116;
                            continue block48;
                        }
                        case 1654675764: {
                            var1_1.textRight(iV.NI(var6_6.total()), var3_3 - var1_1.s(78.0f), var7_10, var1_1.s(10.0f), iV.NJ((var12_11 | var13_9 ^ -796092951) ^ (var13_9 ^ -2024412620), (var11_8 | var13_9 ^ -796092951) ^ ((var12_11 | var13_9 ^ -796092951) ^ (var13_9 ^ 1813400460))));
                            var13_9 = (var11_8 | var14_7) ^ 1132245989;
                            continue block49;
                        }
                        case -2141088321: {
                            var12_11 ^= var13_9 ^ 637300557;
                            ** continue;
                        }
                        case -1202626792: {
                            var12_11 ^= var13_9 ^ -1289998275;
                            var13_9 = (var11_8 | var14_7) ^ -1252314315;
                            continue block49;
                        }
                        case 1316413384: 
                    }
                    break;
                }
                break;
            }
            return var4_4 + var1_1.s(var5_5);
        }
        block50: while (true) {
            switch (var13_9) {
                case -384656530: {
                    v4 = true;
                    ** GOTO lbl98
                }
                case 1477038463: {
                    v4 = false;
                    ** continue;
                }
                case -1403421929: {
                    if (var6_6.in() + var6_6.edge() <= 0L) ** continue;
                    var13_9 = (var11_8 | var14_7) ^ 498139691;
                    continue block50;
                }
                case -425922858: {
                    var12_11 ^= var13_9 ^ -2021639711;
                    var13_9 = (var11_8 | var14_7) ^ 306149267;
                    continue block50;
                }
                case -1017446426: {
                    var12_11 ^= var13_9 ^ 187608923;
                    ** continue;
                }
                case -547832642: {
                    var12_11 ^= var13_9 ^ -1102812279;
                    var13_9 = (var11_8 | var14_7) ^ -1557906046;
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private float NG(W var1_1, float var2_2, float var3_3, float var4_4, float var5_5, R var6_6, double var7_7, double var9_8) {
        block64: {
            block59: {
                block65: {
                    block54: {
                        block63: {
                            block56: {
                                block60: {
                                    block52: {
                                        block62: {
                                            block57: {
                                                block58: {
                                                    block61: {
                                                        block53: {
                                                            block55: {
                                                                break block64;
lbl1:
                                                                // 1 sources

                                                                while (true) {
                                                                    var15_15 ^= var16_11 ^ -786675618;
                                                                    break block52;
                                                                    break;
                                                                }
lbl4:
                                                                // 1 sources

                                                                while (true) {
                                                                    var15_15 ^= var16_11 ^ -402261634;
                                                                    ** GOTO lbl65
                                                                    break;
                                                                }
lbl7:
                                                                // 1 sources

                                                                block23: while (true) {
                                                                    switch (var16_11) lbl-1000:
                                                                    // 6 sources

                                                                    {
                                                                        while (true) {
                                                                            default: {
                                                                                continue block23;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case -1581384114: {
                                                                            ** continue;
                                                                        }
lbl14:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var15_15 ^= -1951735150;
                                                                            ** GOTO lbl49
                                                                            break;
                                                                        }
lbl17:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var15_15 ^= -1196457245;
                                                                            ** GOTO lbl31
                                                                            break;
                                                                        }
lbl20:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (var6_6.budding() <= 0) break block53;
                                                                            ** GOTO lbl98
                                                                            break;
                                                                        }
lbl23:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                        case 834362638: {
                                                                            var15_15 ^= var16_11 ^ -1469416303;
                                                                            ** GOTO lbl38
                                                                        }
lbl28:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var15_15 ^= var16_11 ^ -415722278;
                                                                            break block54;
                                                                            break;
                                                                        }
lbl31:
                                                                        // 1 sources

                                                                        var1_1.textRight(v0, var3_3, var11_12, v1, v2);
                                                                        break block55;
lbl33:
                                                                        // 1 sources

                                                                        return var4_4 + var1_1.s(var5_5);
lbl35:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var16_11 = (var14_10 | var17_9) ^ -2073019768;
                                                                            break block56;
                                                                            break;
                                                                        }
lbl38:
                                                                        // 1 sources

                                                                        var16_11 = (var14_10 | var17_9) ^ -889773073;
                                                                        ** GOTO lbl-1000
lbl40:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var15_15 ^= var16_11 ^ 1827288662;
                                                                            ** GOTO lbl85
                                                                            break;
                                                                        }
lbl43:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var15_15 ^= var16_11 ^ 1454097500;
                                                                            ** GOTO lbl51
                                                                            break;
                                                                        }
lbl46:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var15_15 ^= -1202777501;
                                                                            ** continue;
                                                                            break;
                                                                        }
lbl49:
                                                                        // 1 sources

                                                                        if (var6_6.budding() <= 0) break block57;
                                                                        ** GOTO lbl100
lbl51:
                                                                        // 1 sources

                                                                        var16_11 = (var14_10 | var17_9) ^ -1082212025;
                                                                        break block56;
                                                                        var12_13 = (int)Math.sqrt(iV.NA(var6_6.cx() - var7_7) + iV.NA(var6_6.cz() - var9_8));
                                                                        var16_11 = (var14_10 | var17_9) ^ 1809099459;
                                                                        ** GOTO lbl-1000
lbl56:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var16_11 = (var14_10 | var17_9) ^ 844143231;
                                                                            break block58;
                                                                            break;
                                                                        }
lbl59:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var11_12 = var4_4 + var1_1.s(var5_5 * 0.5f);
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                        case 1661931978: {
                                                                            v3 = false;
                                                                            break block23;
                                                                        }
lbl65:
                                                                        // 1 sources

                                                                        var16_11 = (var14_10 | var17_9) ^ 962651655;
                                                                        ** GOTO lbl-1000
lbl67:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var16_11 = (var14_10 | var17_9) ^ -1091488784;
                                                                            break block58;
                                                                            break;
                                                                        }
lbl70:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var16_11 = (var14_10 | var17_9) ^ -840526725;
                                                                            ** GOTO lbl-1000
                                                                            break;
                                                                        }
lbl73:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var15_15 ^= 1628193115;
                                                                            ** GOTO lbl93
                                                                            break;
                                                                        }
                                                                        case -1752603722: {
                                                                            var15_15 ^= var16_11 ^ -567188346;
                                                                            ** GOTO lbl83
                                                                        }
lbl79:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            v0 = var6_6.budding() + "bd \u00b7 " + var12_13 + "m";
                                                                            v1 = var1_1.s(10.0f);
                                                                            break block59;
                                                                            break;
                                                                        }
lbl83:
                                                                        // 1 sources

                                                                        var16_11 = (var14_10 | var17_9) ^ -351426698;
                                                                        ** continue;
lbl85:
                                                                        // 1 sources

                                                                        var16_11 = (var14_10 | var17_9) ^ 1635031118;
                                                                        break block58;
lbl87:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var16_11 = (var14_10 | var17_9) ^ -51567393;
                                                                            break block56;
                                                                            break;
                                                                        }
lbl90:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            v4 = iV.NJ(((var15_15 ^= -1555908771) | var17_9) ^ 1635128210, (var14_10 | var17_9) ^ ((var15_15 | var17_9) ^ -1779570655));
                                                                            ** GOTO lbl73
                                                                            break;
                                                                        }
lbl93:
                                                                        // 1 sources

                                                                        var1_1.text(v5, var2_2, var11_12, v6, v4);
                                                                        ** continue;
lbl95:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var13_14 = v3;
                                                                            ** continue;
                                                                            break;
                                                                        }
lbl98:
                                                                        // 1 sources

                                                                        var15_15 ^= 2124077747;
                                                                        break block60;
lbl100:
                                                                        // 1 sources

                                                                        ** continue;
                                                                        while (true) {
                                                                            var15_15 ^= 1851396827;
                                                                            v7 = "";
                                                                            break block61;
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                                }
lbl105:
                                                                // 2 sources

                                                                while (true) {
                                                                    var15_15 ^= 1727509448;
                                                                    ** continue;
                                                                    break;
                                                                }
                                                            }
                                                            var16_11 = (var14_10 | var17_9) ^ -1125079059;
                                                            break block58;
                                                        }
                                                        v2 = iV.NJ(((var15_15 ^= 2124077747) | var17_9) ^ -445178994, (var14_10 | var17_9) ^ ((var15_15 | var17_9) ^ -596495298));
                                                        ** GOTO lbl17
lbl114:
                                                        // 1 sources

                                                        while (true) {
                                                            var15_15 ^= 1851396827;
                                                            break block62;
                                                            break;
                                                        }
lbl117:
                                                        // 1 sources

                                                        while (true) {
                                                            v8 = (int)var6_6.cx();
                                                            v9 = (int)var6_6.cz();
                                                            if (!var13_14) ** continue;
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
lbl123:
                                                    // 2 sources

                                                    while (true) {
                                                        var15_15 ^= 114058178;
                                                        break block63;
                                                        break;
                                                    }
                                                }
lbl127:
                                                // 3 sources

                                                block49: while (true) {
                                                    switch (var16_11) {
                                                        default: {
                                                            continue block49;
                                                        }
                                                        case 1748987314: {
                                                            ** continue;
                                                        }
                                                        case -425766880: {
                                                            ** continue;
                                                        }
                                                        case 867327013: {
                                                            ** continue;
                                                        }
                                                        case -459357123: {
                                                            ** continue;
                                                        }
                                                        case 991653763: {
                                                            ** continue;
                                                        }
                                                        ** case -1390937875:
lbl142:
                                                        // 1 sources

                                                        ** continue;
                                                    }
                                                    break;
                                                }
                                            }
                                            v4 = iV.NJ(((var15_15 ^= -1555908771) | var17_9) ^ 1635128211, (var14_10 | var17_9) ^ ((var15_15 | var17_9) ^ 94234937));
                                            ** while (true)
                                        }
                                        v7 = iV.u;
                                        ** while (true)
                                        {
                                            case -1869032414: {
                                                if (var6_6.yMin() <= iV.NJ((var15_15 | var16_11 ^ -890076313) ^ (var16_11 ^ 1979606833), (var14_10 | var16_11 ^ -890076313) ^ ((var15_15 | var16_11 ^ -890076313) ^ (var16_11 ^ -410477365)))) {
                                                    ** continue;
                                                }
                                                break block65;
                                            }
                                        }
                                    }
                                    var16_11 = (var14_10 | var17_9) ^ -143126752;
                                    ** GOTO lbl127
                                }
                                v2 = fc.accent();
                                ** while (true)
                                {
                                    ** case -1318956869:
                                }
lbl160:
                                // 1 sources

                                v3 = true;
                                ** while (true)
                            }
                            block50: while (true) {
                                switch (var16_11) {
                                    default: {
                                        continue block50;
                                    }
                                    case -1501375726: {
                                        ** continue;
                                    }
                                    case -451856758: {
                                        ** continue;
                                    }
                                    ** case -568341179:
lbl172:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                        }
                        v5 = v8 + " " + v9 + v7;
                        v6 = var1_1.s(10.0f);
                        ** while (true)
                    }
                    var16_11 = (var14_10 | var17_9) ^ 1776135144;
                    ** while (true)
                }
                var16_11 = (var14_10 | var17_9) ^ -70121085;
                ** while (true)
            }
            var15_15 ^= 162084741;
            ** while (true)
        }
        var17_9 = 1516918597;
        var14_10 = iV.w & 1516918597 ^ 1517270920;
        var16_11 = 0;
        var15_15 = (var14_10 | var17_9) ^ 1031217072;
        ** while (true)
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String NH(class_2596<?> var0) {
        var7_1 = 1578471281;
        var4_2 = iV.w & 1578471281 ^ 33577907;
        var6_3 = 0;
        var5_4 = (var4_2 | var7_1) ^ -1667523421;
        var6_3 = (var4_2 | var7_1) ^ -1010445966;
        if (true) ** GOTO lbl9
        {
            block22: while (true) {
                var6_3 = (var4_2 | var7_1) ^ 2125011077;
lbl9:
                // 2 sources

                block23: while (true) {
                    switch (var6_3) {
                        default: {
                            continue block23;
                        }
                        case -1647309183: {
                            continue block22;
                        }
                        case 549242742: {
                            var5_4 ^= var6_3 ^ 457111920;
                            var6_3 = (var4_2 | var7_1) ^ 1016602691;
                            continue block23;
                        }
                        case 1653473200: 
                    }
                    break;
                }
                break;
            }
            var5_4 ^= 1011632919;
            return var0.method_65080().comp_2231().method_12832();
        }
    }

    /*
     * Exception decompiling
     */
    private static String NI(long var0) {
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

    private static int NJ(int n2, int n3) {
        int n4 = -792385907;
        int n5 = -1409475020;
        int n6 = b[n2 ^ ((n5 | n4) ^ 0xE074522C)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xFBFD9217;
        n6 ^= (n5 | n4) ^ 0xFBFD04D1;
        n6 += (n5 | n4) ^ 0xFBFDD6CD;
        n6 -= (n5 | n4) ^ 0xFBFD591E;
        n6 ^= (n5 | n4) ^ 0xFBFDF443;
        n6 += (n5 | n4) ^ 0xFBFD35F1;
        return n6 -= (n5 | n4) ^ 0xFBFDA6D8;
    }

    /*
     * Unable to fully structure code
     */
    public String getInfoString() {
        block60: {
            block62: {
                block59: {
                    block61: {
                        block58: {
                            break block62;
lbl1:
                            // 2 sources

                            while (true) {
                                var6_3 = (var4_2 | var7_1) ^ -1417429737;
                                break block58;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var2_5 = this.b.values().iterator();
                                ** GOTO lbl1
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                ++var1_4;
                                ** GOTO lbl160
                                break;
                            }
lbl12:
                            // 1 sources

                            while (true) {
                                var5_7 ^= var6_3 ^ -544160201;
                                ** GOTO lbl127
                                break;
                            }
lbl15:
                            // 1 sources

                            while (true) {
                                v0 = String.valueOf(this.a.size());
                                ** GOTO lbl52
                                break;
                            }
                        }
lbl19:
                        // 8 sources

                        block35: while (true) {
                            switch (var6_3) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    default: {
                                        continue block35;
                                    }
                                    break;
                                }
                                case 1441278447: {
                                    ** continue;
                                }
                                case -988867375: {
                                    var5_7 ^= var6_3 ^ -1715065218;
                                    ** GOTO lbl44
                                }
lbl29:
                                // 1 sources

                                while (true) {
                                    var6_3 = (var4_2 | var7_1) ^ 1388811020;
                                    break block59;
lbl32:
                                    // 1 sources

                                    while (true) {
                                        var6_3 = (var4_2 | var7_1) ^ -1700691071;
                                        break block59;
                                        break;
                                    }
                                    break;
                                }
lbl35:
                                // 1 sources

                                while (true) {
                                    var5_7 ^= var6_3 ^ -1708203076;
                                    ** GOTO lbl55
                                    break;
                                }
lbl38:
                                // 1 sources

                                while (true) {
                                    var6_3 = (var4_2 | var7_1) ^ -766322971;
                                    break block59;
lbl41:
                                    // 1 sources

                                    while (true) {
                                        var6_3 = (var4_2 | var7_1) ^ -1544542924;
                                        break block59;
                                        break;
                                    }
                                    break;
                                }
lbl44:
                                // 1 sources

                                var6_3 = (var4_2 | var7_1) ^ 1850209926;
                                ** GOTO lbl-1000
                                case -1474184906: {
                                    var5_7 ^= var6_3 ^ 819553095;
                                    break block35;
                                }
lbl49:
                                // 1 sources

                                while (true) {
                                    var6_3 = (var4_2 | var7_1) ^ 94358437;
                                    ** continue;
                                    break;
                                }
lbl52:
                                // 2 sources

                                while (true) {
                                    var5_7 ^= -1368665854;
                                    break block60;
                                    break;
                                }
lbl55:
                                // 1 sources

                                var6_3 = (var4_2 | var7_1) ^ -756054542;
                                ** GOTO lbl141
lbl57:
                                // 1 sources

                                while (true) {
                                    var6_3 = (var4_2 | var7_1) ^ -2030536244;
                                    ** GOTO lbl141
                                    break;
                                }
lbl60:
                                // 1 sources

                                while (true) {
                                    var6_3 = (var4_2 | var7_1) ^ -1694439111;
                                    break block59;
                                    break;
                                }
                                case -273351703: {
                                    if (var1_4 > 0) {
                                        ** continue;
                                    }
                                    break block61;
                                }
                            }
                            break;
                        }
                        var6_3 = (var4_2 | var7_1) ^ -1969275750;
                        ** GOTO lbl19
lbl69:
                        // 1 sources

                        return null;
lbl71:
                        // 1 sources

                        while (true) {
                            var6_3 = (var4_2 | var7_1) ^ -237655960;
                            ** GOTO lbl141
                            break;
                        }
                        {
                            case -1686124298: {
                                var5_7 ^= var6_3 ^ -2054591932;
                                ** GOTO lbl139
                            }
                            case -548241979: {
                                v0 = var1_4 + " buds";
                                ** continue;
                            }
                        }
                        var1_4 = 0;
                        var5_7 ^= 994656444;
                        ** while (true)
                        while (true) {
                            var6_3 = (var4_2 | var7_1) ^ 1296600109;
                            break block59;
                            break;
                        }
                        {
                            case -1322195981: {
                                var3_6 = (fO)var2_5.next();
                                ** GOTO lbl132
                            }
                        }
lbl89:
                        // 1 sources

                        while (true) {
                            var6_3 = (var4_2 | var7_1) ^ -473584340;
                            ** GOTO lbl141
                            break;
                        }
lbl92:
                        // 1 sources

                        while (true) {
                            var6_3 = (var4_2 | var7_1) ^ -947730359;
                            ** GOTO lbl19
                            break;
                        }
                        {
                            case -64153824: {
                                if (var2_5.hasNext()) ** GOTO lbl134
                            }
                        }
                        var6_3 = (var4_2 | var7_1) ^ -1596975201;
                        ** GOTO lbl19
lbl99:
                        // 1 sources

                        while (true) {
                            var6_3 = (var4_2 | var7_1) ^ -453139796;
                            ** GOTO lbl19
                            break;
                        }
                    }
                    var6_3 = (var4_2 | var7_1) ^ -23016520;
                    ** GOTO lbl19
                }
                block52: while (true) {
                    switch (var6_3) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block52;
                            }
                            break;
                        }
                        case -1599130032: {
                            ** continue;
                        }
                        case 1768442981: {
                            ** continue;
                        }
                        case -1738540451: {
                            ** continue;
                        }
lbl117:
                        // 1 sources

                        while (var3_6.a >= 0) {
                            ** continue;
lbl119:
                            // 1 sources

                            ** GOTO lbl71
                        }
                        {
                            ** GOTO lbl160
                            case -1876139394: {
                                var5_7 ^= var6_3 ^ 2115686942;
                                ** continue;
                            }
                        }
lbl124:
                        // 1 sources

                        while (true) {
                            var5_7 ^= var6_3 ^ 880471828;
                            ** continue;
                            break;
                        }
lbl127:
                        // 1 sources

                        var6_3 = (var4_2 | var7_1) ^ 690681192;
                        ** continue;
                        case 310716929: {
                            if (this.isEnabled()) ** continue;
                            ** continue;
                        }
lbl132:
                        // 1 sources

                        var6_3 = (var4_2 | var7_1) ^ -754744395;
                        ** GOTO lbl141
lbl134:
                        // 1 sources

                        var6_3 = (var4_2 | var7_1) ^ -1819384225;
                        ** GOTO lbl19
                        case 1994871620: {
                            var5_7 ^= var6_3 ^ -95270540;
                            ** continue;
                        }
lbl139:
                        // 1 sources

                        var6_3 = (var4_2 | var7_1) ^ -736418688;
                        ** continue;
lbl141:
                        // 6 sources

                        block56: while (true) {
                            switch (var6_3) {
                                default: {
                                    continue block56;
                                }
                                case -664112571: {
                                    ** continue;
                                }
                                case -381658469: {
                                    ** continue;
                                }
                                case 808860261: {
                                    ** continue;
                                }
                                case -897943807: {
                                    ** continue;
                                }
                                case -1118329179: {
                                    ** GOTO lbl117
                                }
                                ** case -391357220:
lbl156:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                        {
                            ** case 1043338444:
                        }
lbl158:
                        // 1 sources

                        var5_7 ^= var6_3 ^ 1660497507;
                        ** continue;
lbl160:
                        // 2 sources

                        var6_3 = (var4_2 | var7_1) ^ 194635020;
                        ** continue;
                        case -1592894232: {
                            var5_7 ^= var6_3 ^ 1653820197;
                            ** continue;
                        }
                        case -369292916: {
                            ** continue;
                        }
                    }
                    break;
                }
            }
            var7_1 = 999022432;
            var4_2 = iV.w & 999022432 ^ 707559785;
            var6_3 = 0;
            var5_7 = (var4_2 | var7_1) ^ -879092284;
            ** while (true)
        }
        return v0;
    }

    /*
     * Exception decompiling
     */
    private static void NK(class_4588 var0, Matrix4f var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
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
    private static void beacon(class_4588 var0, Matrix4f var1_1, double var2_2, double var4_3, float var6_4, float var7_5, int var8_6) {
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
    static {
        block35: {
            break block35;
lbl1:
            // 1 sources

            while (true) {
                var0_4 = "b\u00a2\u001f\r\u009c\u00eah\u00d5\u001f\u0092)\u00cf\u00d3\u00fd\u00dd\u00f0\u00a4\u00c6\u00da9\u000b\u0096d\u00d1\u00c1p\u00c1\"\u00b6'R|\u0094\u0019Pa\u00145\u00bdy\u0015\u0004\u00a9\u00a0\u00ee\u00c0\\\u0099_\u00eb\u00f0\u00b9A\u00c6\u00fa\u00d5\u00d8\u00cc\u00a2FW\u009b\u0011\u0082\u001a.\u00c9{:\u00ca\u00bd\u00d7\u00ee\u00d6p?\u00d6\u00faBS\u00ed\u00b8[\u00a5o\u009b7\u00b3\u00b4v5\u008f\u001b\u00a2p\u00d1o\u00d0\u0016t\u00fen`\u00f3\u00b85\u00a1\u009fH\"`~T eF\u0006\u00eb\u00bek+\u008b\u0019\u00d3Db\u0018\u0003\u00ec^a\u0003Q\u00d9\u0080\t\u00d4Vl\u00c4\u009fN\u00fa\u00ad\u001f\u00f5\u00a7\u0081\u00e3\u00b9\u0019kh\u0086\u0091\u00f3P\u00ca\u0098\u00bd\u00d9\u001c\u008b\u00df9\tn\u00a7\u0081\u00e8\u00a7\u00a9Zv\u0093\u008c\u00d6\u00fe\u0090#0'\u00b8\u00fdU\u00ffARg@\n\u00f7\u00d5Xc\u001epxP\u0003\u000b\u00e2<\tze4\u00eb-\u00edi\u0002\u00cbaD\u0017p\fX\u00a0\u00d8[\u009a\u0080\u00ab!\u001f\r\u0002\u0088\u00c9\u008f \u000f\u00ed!\u00de\u00e7\u0091\u00bcM@\u00e1\u00aaU\u00a3\u00ff5}\u00a0&\u00e2\u00c0&\u00e3D6\u0088D\u00ea\u00c1\u00db\u00b9\u0094H,2\u00bb\u0091\u00a7p\b\u00b2\u00d52\u00efFP\u0004\u0005\u00d0\u0090b\u009d&\u00f6l\u00be\u0019Js\u0006\u0092;\u00af\u0082\u00ba\u0010\f3\u00b8#\u00fa\u0091\u00dcVP\u00be\u00fb\u00bc\u00beWb\u00bf\u00ad\u00c4\u00f2\u00bc\u0010\u009c\u00afR\u00c5\u0086\u00a9\u009b\u00da\u0081\u00e0\u00d3W \u00049\u00b0\u00e9\u000ft\u00c1\u00b6\u00b09U'si\u0098\u001aE\u00e1\u00fd\u00a3q\u00c1\u00c0\u00c7c\u0001N\u0091\u0013i\u00e0\u00f8\u00f6\u0098\u00f6\u00fc4\u00dc!\u00a8\u0001\u00d1\u00b9\u00ac\u00fd\u00f0u\u00b7\u0089R\u0013s\u00aex\u00a2\u00e7\u00aa\u00fdKM\nb4\u00d1\u00ab\u00f4\u0084\u00f1\u0006r\u00b2\rYz:3\u008f\u00ffPw\u00dc7\u007f\u00d1\u0087\u00b3\u0094\u00da.'I\u0099G\u00ff\u00d5H\u00d4\u00a1\u00fex\u00a2\u00a2\u00e6\u00f0a{@\u00a9\u00faT9\u00a7ye\u00bd\u00a1\u00d8\u0018US\u00abs\u00f8\u0015\u00a8\u00a4\u00f3\u0093\u0083\u00c1\u000e\u00f8\u0084\u0003\u00e9\u00b1\u00af\u0017\u0007n\u00c9\u00bd\u00bf0\u00fc\u00b9$\u0019H9C\u0000Z\u0000\u00be\u007f\u00feI\u001a!\u00b3\u00a7\u007f\u0015!\u00194\u00dfQ\u00a2\u00e7j\u0087~\u0097\u00f1Fq\u0007\u00c9\u0097D\u009e}\u00f9\u00c3\u00ea\u00d0D\u008e\u001b\u0095=l\u00a1b\u0082\u00d1$\u00b5{\u00d0\u00d7?~\u0005SvF\u0018)Xv.\u00b1\u00e3\u0082\u0018\t@\u00b8f\\\u0012b\u00d2\u00cb\u00cd\u00bd\u00f6\f^O\u0095\u00d6y\u0005\u00db\u0004\u00e8 8\u00be\u00a1\u0000\u009f\u0095\u00c8\u0016\u00c7\u0092\u00b8\u0097]\u0001\u00eb:\u00aa[\u009f\u0093>\u00cf_.\u00b4\u00d7\u00c6\u0013\u0005\u008ef\u00d1\u00ad\u0097\u009dJci\u00eb\u0005eXJ2\u00dd\u00a0\u00cc\u00ce\u0010\r\u00a1\u0085\u00cb\u0092X\u00a5\u00ba\u00e2\u0018\u0083\u00b6rL\u0091B\u00f9`p\u00af\u0095\u00be\u0012l\u00b3\u00cf8\u00d8mQZ\u00c5\u00d2\u001fl\u00bd\u0083\u00f3\u00c0[\u00d5#\u00f5>-TaW\u00df\u0086\u00be\u00ed9\u009e\u00d7il0\u008a)\u00ea\u00cc\u00c19j\u00af@\u00e8Zt<<\u00dd\u00eec\u0003\u00cb\u00f2".getBytes("ISO-8859-1");
                var6_10 ^= -1091357483;
                var1_5 = var0_4.length / 4;
                var7_3 = var10 ^ 402213229;
                if (true) ** GOTO lbl-1000
lbl7:
                // 1 sources

                while (true) {
                    var4_8 = 0;
                    ** GOTO lbl61
                    break;
                }
                block25: while (true) {
                    switch (var7_3) lbl-1000:
                    // 2 sources

                    {
                        default: {
                            continue block25;
                        }
                        case -1213017601: {
                            var6_10 ^= var7_3 ^ 1521485336;
                            ** break;
                        }
                        case 308741917: {
                            var3_7 = 0;
                            ** GOTO lbl25
                        }
lbl20:
                        // 1 sources

                        var7_3 = var10 ^ 431550226;
                        continue block25;
                        case -859913550: {
                            iV.b = new int[var1_5];
                            ** GOTO lbl27
                        }
lbl25:
                        // 1 sources

                        var6_10 ^= -992264007;
                        ** continue;
lbl27:
                        // 1 sources

                        var7_3 = var10 ^ -1133692432;
                        continue block25;
                        case 472293730: 
                    }
                    var6_10 ^= var7_3 ^ 1220585682;
                    var7_3 = var10 ^ -949933379;
                }
                break;
            }
        }
        var10 = 199223311;
        var9_1 = -60750427;
        var8_2 = 79669522;
        iV.w = mK.a(MethodHandles.lookup().lookupClass(), 729603671);
        var7_3 = 0;
        var6_10 = 1898168531;
        var7_3 = var10 ^ -1878784193;
        block26: while (true) {
            switch (var7_3) {
                case 47324136: {
                    var6_10 ^= var7_3 ^ 1172270085;
                    var7_3 = var10 ^ 1400107656;
                }
                default: {
                    continue block26;
                }
                case 1487673991: {
                    var2_6 = (var6_10 | var7_3 ^ 1400107656) ^ (var7_3 ^ 75042229) ^ iV.w;
                    var6_10 ^= 1882582892;
                    ** continue;
                }
                case -1680085200: 
            }
            var7_3 = var10 ^ 151909351;
        }
lbl55:
        // 1 sources

        while (true) {
            var7_3 = var10 ^ var9_1;
            ** GOTO lbl76
lbl58:
            // 1 sources

            while (true) {
                var7_3 = var10 ^ -1531278374;
                ** GOTO lbl76
lbl61:
                // 2 sources

                while (true) {
                    var5_9 = (var0_4[var3_7] & (((var6_10 ^= -499415149) | var10) ^ 1879047424)) << ((var6_10 | var10) ^ 1879047655) | (var0_4[var3_7 + 1] & ((var6_10 | var10) ^ 1879047424)) << ((var6_10 | var10) ^ 1879047663) | (var0_4[var3_7 + 2] & ((var6_10 | var10) ^ 1879047424)) << ((var6_10 | var10) ^ 1879047671) | var0_4[var3_7 + 3] & ((var6_10 | var10) ^ 1879047424);
                    var7_3 = var10 ^ -1838898700;
                    ** GOTO lbl76
                    break;
                }
                break;
            }
lbl65:
            // 1 sources

            while (true) {
                var7_3 = var10 ^ -800373484;
                ** GOTO lbl76
                break;
            }
            break;
        }
lbl68:
        // 1 sources

        while (true) {
            var7_3 = var10 ^ -570823762;
            if (true) ** GOTO lbl76
            break;
        }
        while (true) {
            var7_3 = var10 ^ 1500688177;
            if (true) ** GOTO lbl76
            block33: while (true) {
                var7_3 = var10 ^ 378317752;
lbl76:
                // 7 sources

                block34: while (true) {
                    switch (var7_3) {
                        case -1352309803: {
                            var3_7 += 4;
                            if (++var4_8 < var1_5) ** continue;
                            var7_3 = var10 ^ 1272139403;
                            continue block34;
                        }
                        case 918176457: {
                            var6_10 ^= var7_3 ^ 739225425;
                            ** continue;
                        }
                        case 491996087: {
                            iV.a = new String[]{iV.v, iV.J, iV.Q, iV.E};
                            return;
                        }
                        case 1074570884: {
                            var6_10 ^= var7_3 ^ 1225857010;
                            var7_3 = var10 ^ var8_2;
                            continue block34;
                        }
                        case 257966365: {
                            iV.v = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908933), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 620705868)));
                            iV.a = 102400.0;
                            iV.t = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908934), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1922312911)));
                            iV.r = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908935), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -458012204)));
                            iV.c = -8301749160319058881L << (var7_3 ^ 257966397) >>> (var7_3 ^ 257966397) ^ (long)var6_10 & 0xFFFFFFFFL | (-8301749160319058881L >>> (var7_3 ^ 257966397) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ 257966397);
                            iV.q = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908936), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -2002946350)));
                            iV.p = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908929), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 32406102)));
                            iV.m = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908930), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1036526529)));
                            iV.l = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908931), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1494794566)));
                            iV.k = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908932), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -634838734)));
                            iV.i = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908957), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 2069154261)));
                            iV.g = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908958), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 138372260)));
                            iV.f = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908959), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 199782109)));
                            iV.e = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908960), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 546148982)));
                            iV.d = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908953), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 659518782)));
                            iV.c = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908954), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 207330277)));
                            iV.b = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908955), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1794188172)));
                            iV.a = iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908956), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1609939118)));
                            iV.k = gj.decode("2V+nnHtu", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908949), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1820358752))));
                            iV.s = gj.decode("Y5Pq8zgKm7ew", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908950), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1756708206))));
                            iV.m = gj.decode("PDZHiNZYvVQ4", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908951), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 2078941852))));
                            iV.P = gj.decode("8Tv4YBqo30s1GE8tda26RlZQVm/LNdNzvPUqaSd7b+Uq+3pB6CGyumreMPDRA8zvdA==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908952), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1678291082))));
                            iV.i = gj.decode("1OJ5gkmG", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908945), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -688874121))));
                            iV.x = gj.decode("23/J6Z6R/Em9Wjf3vA==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908946), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1978154233))));
                            iV.h = gj.decode("Gfw87fb1CG5vP2HOaQ==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908947), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 837342352))));
                            iV.r = gj.decode("mWaGTg==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690908948), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -2017181383))));
                            iV.L = gj.decode("adfu9LcWlcWyhW5YvZwYUtTe+n669/d8ZDQYrtgpTWQ3TQy0J0WE", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909165), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 945196998))));
                            iV.N = gj.decode("1anUw92qz/aHcWo=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909166), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 302923852))));
                            iV.M = gj.decode("3JYNnYHoiJkaXm7alPl0sRuYpJxuNkj/rlfFzw61DULFyoGl+g==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909167), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 611663557))));
                            iV.q = gj.decode("8dqfzfVaICzzuWiASF8=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909168), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1662376720))));
                            iV.A = gj.decode("Sm+zHpiWMAWdKzzEZ4ViEV8NHrtncvF/7y+SD7WsDBV1g//zpQ5MEQ==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909161), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1679067793))));
                            iV.O = gj.decode("5tJqcsUaBvOKyG+x", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909162), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1486257622))));
                            iV.o = gj.decode("ZHAYtFeu9w==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909163), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1976126487))));
                            iV.I = gj.decode("3jNSyYoOnA==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909164), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1604808567))));
                            iV.a = gj.decode("6AiSfizk+UJkvAwHbvAa", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909157), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 632389657))));
                            iV.c = gj.decode("WWLi/iAB8hS9dZ9x", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909158), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 258196424))));
                            iV.e = gj.decode("MYTQQz+6JRifQz8XhgeDbfj01on+kqfD+sTNUJZMOMlLLeIorrXIHPrchSM=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909159), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1308404894))));
                            iV.F = gj.decode("RNiD4XBblWNUjXdiF7Q=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909160), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -602009344))));
                            iV.K = gj.decode("Q9GChGE0ZDyMa0/YqoTLAS+zOhNxpPM=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909153), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 241237206))));
                            iV.R = gj.decode("JDhWcKvAVu731bo=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909154), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1576674279))));
                            iV.aa = gj.decode("8LneHnV8gdNKvEZJuyd6YexotRSoAh3JuTFH", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909155), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1172681076))));
                            iV.X = gj.decode("X7vfUUqM8fY=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909156), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -316362396))));
                            iV.p = gj.decode("kztO7A0nr0IMG3c=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909181), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 437956343))));
                            iV.D = gj.decode("dg6y+2o=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909182), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1139404930))));
                            iV.z = gj.decode("JS3Ix8I=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909183), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 513232711))));
                            iV.S = gj.decode("c15OGzp3Alc=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909184), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -407463903))));
                            iV.T = gj.decode("3bIk2WdYhg==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909177), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1262903479))));
                            iV.l = gj.decode("B9zw8x0aow==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909178), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -221559295))));
                            iV.Z = gj.decode("4a9OzWqi1aCzeyGBSkjTJR0HdbD1szXv", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909179), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 804019555))));
                            iV.Y = gj.decode("Pd1aJkIW3gB79h1FQa8=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909180), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1104876965))));
                            iV.C = gj.decode("m0Ab8Q==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909173), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1558658348))));
                            iV.b = gj.decode("sVh2K0nRnBu7oQz87mlDFakMAE03Q4xM", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909174), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1044465565))));
                            iV.V = gj.decode("dgTttIbDEZLX6tZ2vW4QJcYXLzXtl3c=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909175), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 87204276))));
                            iV.d = gj.decode("ET+uGnXOqIiMlGTdgwQSWDqm", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909176), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 256827331))));
                            iV.y = gj.decode("fLYunPg6drjSpCQJqg==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909169), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -923677702))));
                            iV.H = gj.decode("1fpID6/d/4SmlbY=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909170), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -459550833))));
                            iV.B = gj.decode("qx7NJI1v", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909171), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -186006390))));
                            iV.ab = gj.decode("UXRE9a191wN0s8SrjF06Vb0mptsoPB9lraf6Fw==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909172), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1130104646))));
                            iV.U = gj.decode("/4JzTvRbR/5YKQ==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909133), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -720786766))));
                            iV.u = gj.decode("Hodhdg==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909134), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 398924459))));
                            iV.G = gj.decode("M9lCrO8Lk7ao", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909135), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -278215000))));
                            iV.j = gj.decode("oWzwwa3yqUcD", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909136), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1788695318))));
                            iV.W = gj.decode("MD6wDhJK1VQx8g==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909129), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -2081176882))));
                            iV.f = gj.decode("T3RqKtKmb4gT", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909130), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1914395850))));
                            iV.n = gj.decode("eAL8vT9RZA==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909131), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1429194605))));
                            iV.v = gj.decode("TEY=", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909132), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 889361544))));
                            iV.J = gj.decode("CQsa/w==", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909125), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1356772134))));
                            iV.Q = gj.decode("hE+r", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909126), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 310429313))));
                            iV.E = gj.decode("G64c", iV.NJ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1690909127), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1177564802))));
                            iV.w = iV.k;
                            iV.t = iV.s;
                            ** continue;
                        }
                        case -702151775: {
                            var6_10 ^= var7_3 ^ -1930583522;
                            continue block33;
                        }
                        case 1387087678: {
                            iV.b[var4_8] = var5_9 ^= var2_6;
                            var7_3 = var10 ^ 1030073030;
                        }
                        default: {
                            continue block34;
                        }
                        case -611013349: {
                            var6_10 ^= var7_3 ^ -1029545946;
                            ** continue;
                        }
                        case -138482262: {
                            iV.a = new int[]{iV.NJ((var6_10 | var7_3 ^ var9_1) ^ (var7_3 ^ 1942515647), var7_3 ^ var9_1 ^ ((var6_10 | var7_3 ^ var9_1) ^ (var7_3 ^ 1978708890))), iV.NJ((var6_10 | var7_3 ^ var9_1) ^ (var7_3 ^ 1942515640), var7_3 ^ var9_1 ^ ((var6_10 | var7_3 ^ var9_1) ^ (var7_3 ^ -188358059))), iV.NJ((var6_10 | var7_3 ^ var9_1) ^ (var7_3 ^ 1942515641), var7_3 ^ var9_1 ^ ((var6_10 | var7_3 ^ var9_1) ^ (var7_3 ^ -2008370461))), iV.NJ((var6_10 | var7_3 ^ var9_1) ^ (var7_3 ^ 1942515642), var7_3 ^ var9_1 ^ ((var6_10 | var7_3 ^ var9_1) ^ (var7_3 ^ -683483110)))};
                            ** continue;
                        }
                        case -1715779077: 
                    }
                    break;
                }
                break;
            }
            var6_10 ^= var7_3 ^ 1630872560;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void NL(class_4588 var0, Matrix4f var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block51: {
            block50: {
                block52: {
                    block53: {
                        block49: {
                            break block53;
lbl1:
                            // 1 sources

                            while (true) {
                                var17_20 ^= var18_9 ^ -1167988012;
                                break block49;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var18_9 = (var16_8 | var20_6) ^ 1911775807;
                                break block50;
                                break;
                            }
                        }
                        var18_9 = (var16_8 | var20_6) ^ 2097098519;
                        break block50;
lbl10:
                        // 1 sources

                        while (true) {
                            var18_9 = (var16_8 | var20_6) ^ -1693532455;
                            break block50;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var17_20 ^= var18_9 ^ -2065495116;
                            break block51;
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            iV.q(var0, var1_1, var13_17, var11_15, var12_16, var13_17, var14_18, var12_16, var13_17, var14_18, var15_19, var13_17, var11_15, var15_19, var7_11, var8_12, var9_13, var6_10);
                            ** GOTO lbl91
                            break;
                        }
lbl19:
                        // 1 sources

                        while (true) {
                            continue;
lbl21:
                            // 1 sources

                            while (true) {
                                var17_20 ^= 365423399;
                                ** GOTO lbl60
lbl24:
                                // 1 sources

                                while (true) {
                                    var18_9 = (var16_8 | var20_6) ^ 1455595370;
                                    break block50;
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                    }
                    var20_6 = 1498203123;
                    var19_7 = -851886308;
                    var16_8 = iV.w & 1498203123 ^ -1125130009;
                    var18_9 = 0;
                    var17_20 = (var16_8 | var20_6) ^ 1431625701;
                    ** GOTO lbl67
lbl34:
                    // 1 sources

                    return;
lbl36:
                    // 1 sources

                    while (true) {
                        var17_20 ^= var18_9 ^ -309552223;
                        ** GOTO lbl84
                        break;
                    }
                    var18_9 = (var16_8 | var20_6) ^ 1835717061;
                    block31: while (true) {
                        switch (var18_9) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                default: {
                                    continue block31;
                                }
                                break;
                            }
lbl45:
                            // 1 sources

                            while (true) {
                                var17_20 ^= var18_9 ^ -1707825543;
                                ** continue;
                                break;
                            }
lbl48:
                            // 1 sources

                            while (true) {
                                var18_9 = (var16_8 | var20_6) ^ 1771708184;
                                ** GOTO lbl-1000
                                break;
                            }
lbl51:
                            // 1 sources

                            while (true) {
                                var18_9 = (var16_8 | var20_6) ^ 1833355403;
                                break block50;
                                break;
                            }
lbl54:
                            // 1 sources

                            while (true) {
                                iV.q(var0, var1_1, var10_14, var11_15, var12_16, var10_14, var11_15, var15_19, var10_14, var14_18, var15_19, var10_14, var14_18, var12_16, var7_11, var8_12, var9_13, var6_10);
                                ** continue;
                                break;
                            }
lbl57:
                            // 1 sources

                            while (true) {
                                var18_9 = (var16_8 | var20_6) ^ 360943085;
                                break block50;
                                break;
                            }
lbl60:
                            // 1 sources

                            var13_17 = (float)var2_2 + 0.82f;
                            var14_18 = (float)var3_3 + 0.82f;
                            var15_19 = (float)var4_4 + 0.82f;
                            ** continue;
lbl64:
                            // 1 sources

                            while (true) {
                                var17_20 ^= var18_9 ^ -2087847833;
                                ** continue;
                                break;
                            }
lbl67:
                            // 1 sources

                            var18_9 = (var16_8 | var20_6) ^ 576717395;
                            ** continue;
                            case -1804206865: {
                                var6_10 = var5_5 >>> iV.NJ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ 1955812318), (var16_8 | var18_9 ^ var19_7) ^ ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ 864751872))) & iV.NJ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ 1955812321), (var16_8 | var18_9 ^ var19_7) ^ ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ 346137004)));
                                var7_11 = var5_5 >> iV.NJ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ 1955812320), (var16_8 | var18_9 ^ var19_7) ^ ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ 270813448))) & iV.NJ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ 1955812323), (var16_8 | var18_9 ^ var19_7) ^ ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ -1329907816)));
                                var8_12 = var5_5 >> iV.NJ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ 1955812322), (var16_8 | var18_9 ^ var19_7) ^ ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ 288196238))) & iV.NJ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ 1955812325), (var16_8 | var18_9 ^ var19_7) ^ ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ -1129598654)));
                                var9_13 = var5_5 & iV.NJ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ 1955812324), (var16_8 | var18_9 ^ var19_7) ^ ((var17_20 | var18_9 ^ var19_7) ^ (var18_9 ^ -475842179)));
                                break block31;
                            }
                            case -1870319054: {
                                var17_20 ^= var18_9 ^ -1693381556;
                                ** continue;
                            }
lbl78:
                            // 1 sources

                            while (true) {
                                iV.q(var0, var1_1, var10_14, var11_15, var15_19, var13_17, var11_15, var15_19, var13_17, var14_18, var15_19, var10_14, var14_18, var15_19, var7_11, var8_12, var9_13, var6_10);
                                ** continue;
                                break;
                            }
lbl81:
                            // 1 sources

                            while (true) {
                                var18_9 = (var16_8 | var20_6) ^ 1948788354;
                                break block50;
                                break;
                            }
lbl84:
                            // 1 sources

                            var18_9 = (var16_8 | var20_6) ^ 526280836;
                            break block50;
lbl86:
                            // 1 sources

                            while (true) {
                                var10_14 = (float)var2_2 + 0.18f;
                                var11_15 = (float)var3_3 + 0.18f;
                                var12_16 = (float)var4_4 + 0.18f;
                                ** continue;
                                break;
                            }
lbl91:
                            // 1 sources

                            var18_9 = (var16_8 | var20_6) ^ -1029591197;
                            break block50;
lbl93:
                            // 1 sources

                            while (true) {
                                var18_9 = (var16_8 | var20_6) ^ 1891386424;
                                break block50;
                                break;
                            }
                        }
                        break;
                    }
                    var17_20 ^= -664506290;
                    ** while (true)
lbl98:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl100:
                    // 1 sources

                    while (true) {
                        var17_20 ^= var18_9 ^ -925709393;
                        break block52;
                        break;
                    }
lbl103:
                    // 1 sources

                    while (true) {
                        iV.q(var0, var1_1, var10_14, var14_18, var12_16, var10_14, var14_18, var15_19, var13_17, var14_18, var15_19, var13_17, var14_18, var12_16, var7_11, var8_12, var9_13, var6_10);
                        ** continue;
                        break;
                    }
lbl106:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl108:
                    // 1 sources

                    while (true) {
                        var17_20 ^= var18_9 ^ 1596362444;
                        ** continue;
                        break;
                    }
                    iV.q(var0, var1_1, var10_14, var11_15, var12_16, var13_17, var11_15, var12_16, var13_17, var11_15, var15_19, var10_14, var11_15, var15_19, var7_11, var8_12, var9_13, var6_10);
                    var18_9 = (var16_8 | var20_6) ^ 1881435721;
                    break block50;
                    {
                        ** case -544218716:
                    }
lbl115:
                    // 1 sources

                    ** while (true)
                    iV.q(var0, var1_1, var10_14, var11_15, var12_16, var10_14, var14_18, var12_16, var13_17, var14_18, var12_16, var13_17, var11_15, var12_16, var7_11, var8_12, var9_13, var6_10);
                    var18_9 = (var16_8 | var20_6) ^ 250350323;
                    break block50;
                }
                var18_9 = (var16_8 | var20_6) ^ 1285491484;
            }
lbl122:
            // 2 sources

            block48: while (true) {
                switch (var18_9) {
                    default: {
                        continue block48;
                    }
                    case 1726045486: {
                        ** continue;
                    }
                    case -1423082339: {
                        ** continue;
                    }
                    case -2129605408: {
                        ** continue;
                    }
                    case -491680909: {
                        ** continue;
                    }
                    case 1062096020: {
                        ** continue;
                    }
                    case -395547110: {
                        ** continue;
                    }
                    case -1944288824: {
                        ** continue;
                    }
                    case -217847548: {
                        ** continue;
                    }
                    case -1867961476: {
                        ** continue;
                    }
                    case -1983396491: {
                        ** continue;
                    }
                    case -1916039746: {
                        ** continue;
                    }
                    case -1318000405: {
                        ** continue;
                    }
                    case -889815994: {
                        ** continue;
                    }
                    ** case -1923897393:
lbl153:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        var18_9 = (var16_8 | var20_6) ^ 924426161;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static void q(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, float var10_10, float var11_11, float var12_12, float var13_13, int var14_14, int var15_15, int var16_16, int var17_17) {
        block29: {
            block30: {
                block32: {
                    block31: {
                        break block31;
lbl1:
                        // 1 sources

                        while (true) {
                            var20_20 = (var18_19 | var21_18) ^ -2017057622;
                            break block29;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var20_20 = (var18_19 | var21_18) ^ -1862696480;
                            break block29;
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var20_20 = (var18_19 | var21_18) ^ 843657665;
                            break block29;
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var20_20 = (var18_19 | var21_18) ^ 230581462;
                            break block29;
lbl13:
                            // 1 sources

                            while (true) {
                                var19_21 ^= var20_20 ^ -964195077;
                                break block30;
                                break;
                            }
                            break;
                        }
                    }
                    var21_18 = -1766126808;
                    var18_19 = iV.w & -1766126808 ^ 160555886;
                    var20_20 = 0;
                    break block32;
lbl21:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl23:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var20_20 = (var18_19 | var21_18) ^ 246122629;
                        break block29;
                        break;
                    }
                    var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var7_7).method_1336(var14_14, var15_15, var16_16, var17_17);
                    var20_20 = (var18_19 | var21_18) ^ 760570666;
                    break block29;
lbl32:
                    // 1 sources

                    while (true) {
                        var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var14_14, var15_15, var16_16, var17_17);
                        ** GOTO lbl84
                        break;
                    }
                }
                var19_21 = (var18_19 | var21_18) ^ -772524528;
                var20_20 = (var18_19 | var21_18) ^ 1501687226;
                break block29;
lbl40:
                // 1 sources

                while (true) {
                    var19_21 ^= var20_20 ^ -172160225;
                    ** continue;
                    break;
                }
lbl43:
                // 1 sources

                while (true) {
                    var20_20 = (var18_19 | var21_18) ^ -1710009014;
                    break block29;
                    break;
                }
                var0.method_22918((Matrix4fc)var1_1, var8_8, var9_9, var10_10).method_1336(var14_14, var15_15, var16_16, var17_17);
                var20_20 = (var18_19 | var21_18) ^ -169636025;
                break block29;
lbl50:
                // 1 sources

                while (true) {
                    var19_21 ^= var20_20 ^ -1348939101;
                    ** continue;
                    break;
                }
lbl53:
                // 1 sources

                while (true) {
                    var0.method_22918((Matrix4fc)var1_1, var11_11, var12_12, var13_13).method_1336(var14_14, var15_15, var16_16, var17_17);
                    ** continue;
                    break;
                }
            }
            var20_20 = (var18_19 | var21_18) ^ -162256274;
            break block29;
lbl60:
            // 1 sources

            return;
        }
        block27: while (true) {
            switch (var20_20) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block27;
                    }
                    break;
                }
                case 1784177705: {
                    ** continue;
                }
                case -1376593233: {
                    ** continue;
                }
                case -1861196821: {
                    ** continue;
                }
                case 256010894: {
                    ** continue;
                }
                case 94944804: {
                    ** continue;
                }
                case -1845129288: {
                    ** continue;
                }
                case 1777320192: {
                    ** continue;
                }
                case 410898372: {
                    ** continue;
                }
lbl84:
                // 1 sources

                var20_20 = (var18_19 | var21_18) ^ -450470610;
                ** continue;
                case -1292990396: {
                    var19_21 ^= var20_20 ^ 902264652;
                    ** continue;
                }
                case 2057156160: {
                    var19_21 ^= var20_20 ^ 775722086;
                    ** continue;
                }
                case -969275692: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static void NM(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11) {
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
    private static /* synthetic */ double NN(double var0, double var2_2, R var4_1) {
        block22: {
            block21: {
                break block21;
lbl1:
                // 2 sources

                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ 985061463;
                    ** GOTO lbl27
                    break;
                }
            }
            var8_3 = -1300709497;
            var5_4 = iV.w & -1300709497 ^ -43707610;
            var7_5 = 0;
            break block22;
lbl9:
            // 1 sources

            while (true) {
                var6_6 ^= var7_5 ^ 1444663410;
                ** GOTO lbl1
                break;
            }
lbl12:
            // 1 sources

            return iV.NA(var4_1.cx() - var0) + iV.NA(var4_1.cz() - var2_2);
        }
        var6_6 = (var5_4 | var8_3) ^ -1614461195;
        var7_5 = (var5_4 | var8_3) ^ -898000431;
        ** GOTO lbl27
lbl18:
        // 1 sources

        while (true) {
            var7_5 = (var5_4 | var8_3) ^ 919017762;
            if (true) ** GOTO lbl27
            break;
        }
        block18: while (true) {
            block23: {
                var7_5 = (var5_4 | var8_3) ^ 1923174250;
                break block23;
lbl24:
                // 1 sources

                while (true) {
                    var6_6 ^= var7_5 ^ 560563239;
                    ** GOTO lbl58
                    break;
                }
            }
            block20: while (true) {
                block25: {
                    block24: {
                        switch (var7_5) {
                            default: {
                                continue block20;
                            }
                            case -682368581: {
                                break block24;
                            }
                            case -976525328: {
                                break block25;
                            }
                            case 783300255: {
                                ** continue;
                            }
                            case 1629279157: {
                                ** continue;
                            }
                            case 889464438: {
                                break;
                            }
                            case -910514555: {
                                ** continue;
                            }
                        }
                        var7_5 = (var5_4 | var8_3) ^ 674127388;
                        continue;
                        {
                            case -1914900275: {
                                var6_6 ^= var7_5 ^ -2070794721;
                                ** continue;
                            }
                            ** case 160669887:
                        }
lbl50:
                        // 1 sources

                        switch (var6_6) {
                            case 1370849900: {
                                ** continue;
                            }
                            default: {
                                continue block18;
                            }
                            case 1622735186: 
                        }
                        var7_5 = (var5_4 | var8_3) ^ -775059144;
                        continue;
                    }
                    var7_5 = (var5_4 | var8_3) ^ -152166632;
                    continue;
                }
                var7_5 = (var5_4 | var8_3) ^ -1637782510;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ int NO(R r2) {
        int n2 = w & 0x908A5E76 ^ 0xC368D067;
        int n3 = 0;
        int n4 = (n2 | 0x908A5E76) ^ 0x9F7312B0;
        n3 = (n2 | 0x908A5E76) ^ 0xDBFBB3F6;
        block5: while (true) {
            switch (n3) {
                case -762972424: {
                    return -(r2.budding() * 4 + r2.clusters() * 2 + r2.buds());
                }
                case -1443692713: {
                    n4 ^= n3 ^ 0x48CEC7DE;
                    n3 = (n2 | 0x908A5E76) ^ 0x16F288F;
                }
                default: {
                    continue block5;
                }
                case 135359873: 
            }
            n3 = (n2 | 0x908A5E76) ^ 0x7A182120;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ int[] NP(Integer var0) {
        var4_1 = 913859837;
        var1_2 = iV.w & 1187393526 ^ 477669841;
        var3_3 = 0;
        if (true) ** GOTO lbl18
        block5: while (true) {
            switch (var3_3) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | 1187393526) ^ 123640346;
                    ** GOTO lbl-1000
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | 1187393526) ^ 776004860;
                    ** GOTO lbl-1000
                    break;
                }
                case 1891519243: {
                    return new int[]{iV.NJ((var2_4 | var3_3 ^ var4_1) ^ (var3_3 ^ 100173834), (var1_2 | var3_3 ^ var4_1) ^ ((var2_4 | var3_3 ^ var4_1) ^ (var3_3 ^ 1734133207))), iV.NJ((var2_4 | var3_3 ^ var4_1) ^ (var3_3 ^ 100173835), (var1_2 | var3_3 ^ var4_1) ^ ((var2_4 | var3_3 ^ var4_1) ^ (var3_3 ^ 882174543)))};
                }
lbl18:
                // 1 sources

                var2_4 = (var1_2 | 1187393526) ^ 930692013;
                var3_3 = (var1_2 | 1187393526) ^ -467989240;
                ** continue;
                case -1159355649: {
                    ** continue;
                }
                case 1503671789: 
            }
            break;
        }
        var2_4 ^= var3_3 ^ 480906245;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Set NQ(Integer n2) {
        int n3 = w & 0x1F629513 ^ 0xA95EFD7E;
        int n4 = 0;
        int n5 = (n3 | 0x1F629513) ^ 0x948EFC6F;
        n4 = (n3 | 0x1F629513) ^ 0x55ED9ED5;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -264448009: {
                    n5 ^= n4 ^ 0x2AFAA2A9;
                    n4 = (n3 | 0x1F629513) ^ 0x53DC29EC;
                    continue block5;
                }
                case -324873069: {
                    return new HashSet();
                }
                case -359439446: 
            }
            n4 = (n3 | 0x1F629513) ^ 0x4F422A88;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ long[] NR(Integer n2) {
        int n3 = w & 0x9A0CC8DA ^ 0x85BC6955;
        int n4 = 0;
        int n5 = (n3 | 0x9A0CC8DA) ^ 0xD5AEBAA4;
        n4 = (n3 | 0x9A0CC8DA) ^ 0x3ED44E12;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case 1818442623: {
                    n5 ^= n4 ^ 0x21F299AD;
                    n4 = (n3 | 0x9A0CC8DA) ^ 0xA385BF1E;
                    continue block5;
                }
                case 1010390721: {
                    return new long[3];
                }
                case -1586976819: 
            }
            n4 = (n3 | 0x9A0CC8DA) ^ 0xF3DFD2A0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ double[] NS(Integer n2) {
        int n3 = w & 0xD9BABBEA ^ 0x855C38F2;
        int n4 = 0;
        int n5 = (n3 | 0xD9BABBEA) ^ 0x1C1A19AC;
        n4 = (n3 | 0xD9BABBEA) ^ 0x7A65797D;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -1692715154: {
                    n5 ^= n4 ^ 0x61B70C20;
                    n4 = (n3 | 0xD9BABBEA) ^ 0xFD025BBD;
                    continue block5;
                }
                case 553443399: {
                    return new double[3];
                }
                case -1482964345: 
            }
            n4 = (n3 | 0xD9BABBEA) ^ 0x46E58C94;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ fO NT(long l2, Long l3) {
        int n2 = w & 0xDBA2090F ^ 0x58AC905D;
        int n3 = 0;
        int n4 = (n2 | 0xDBA2090F) ^ 0x8C28E6C4;
        n3 = (n2 | 0xDBA2090F) ^ 0x418F2046;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1709065959: {
                    n3 = (n2 | 0xDBA2090F) ^ 0x4480A064;
                    continue block5;
                }
                case 1910301836: {
                    return new fO(l2, l2, -1, l);
                }
                case -1624360645: 
            }
            n4 ^= n3 ^ 0x8CF9FB26;
            n3 = (n2 | 0xDBA2090F) ^ 0xAA727DD3;
        }
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void NU(class_310 var0, int var1_1, String var2_2, class_2338 var3_3, class_2338 var4_4) {
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
    private static /* synthetic */ fO NV(long l2, long l3, int n2, String string, Long l4) {
        int n3 = w & 0x8D2C4FDE ^ 0xC00E6711;
        int n4 = 0;
        int n5 = (n3 | 0x8D2C4FDE) ^ 0x17E1756E;
        n4 = (n3 | 0x8D2C4FDE) ^ 0xBC81B01E;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case 1907351489: {
                    n4 = (n3 | 0x8D2C4FDE) ^ 0xB57C349F;
                    continue block5;
                }
                case 2018663232: {
                    n5 ^= n4 ^ 0xA821CA1D;
                    n4 = (n3 | 0x8D2C4FDE) ^ 0xAE58FBE0;
                    continue block5;
                }
                case 1668715583: 
            }
            break;
        }
        return new fO(l2, l3, n2, string);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void NW(jx var1_1, class_2338 var2_2, class_2680 var3_3) {
        block17: {
            break block17;
lbl1:
            // 1 sources

            while (true) {
                var5_7 ^= var6_6 ^ 1551228804;
                ** GOTO lbl40
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var6_6 = (var4_5 | var7_4) ^ 1358105808;
                ** GOTO lbl20
lbl7:
                // 1 sources

                while (true) {
                    var6_6 = (var4_5 | var7_4) ^ -281596905;
                    ** GOTO lbl20
lbl10:
                    // 1 sources

                    return;
                }
                break;
            }
        }
        var7_4 = 1650569293;
        var4_5 = iV.w & 1650569293 ^ 1210668949;
        var6_6 = 0;
        var5_7 = (var4_5 | var7_4) ^ -36004203;
        if (true) ** GOTO lbl42
        block13: while (true) {
            var6_6 = (var4_5 | var7_4) ^ 1392304424;
lbl20:
            // 4 sources

            block14: while (true) {
                switch (var6_6) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block14;
                        }
                        break;
                    }
                    case -1883607767: {
                        ** continue;
                    }
                    case 851438993: {
                        break block13;
                    }
                    case -2057380918: {
                        ** continue;
                    }
                    case -1127530940: {
                        this.Nm(var1_1, var2_2.method_10263(), var2_2.method_10264(), var2_2.method_10260());
                        continue block13;
                    }
                    case 1179149948: {
                        var5_7 ^= var6_6 ^ -1799255170;
                        ** continue;
                    }
lbl37:
                    // 1 sources

                    while (true) {
                        var6_6 = (var4_5 | var7_4) ^ 740397473;
                        ** GOTO lbl-1000
                        break;
                    }
lbl40:
                    // 1 sources

                    var6_6 = (var4_5 | var7_4) ^ -693974631;
                    ** GOTO lbl-1000
lbl42:
                    // 1 sources

                    var6_6 = (var4_5 | var7_4) ^ 1490426444;
                    ** continue;
                    case 949294837: {
                        var5_7 ^= var6_6 ^ 213438882;
                        ** continue;
                    }
                }
                break;
            }
            break;
        }
        var6_6 = (var4_5 | var7_4) ^ -439117068;
        ** while (true)
        {
            ** case 983235341:
        }
lbl50:
        // 1 sources

        this.No(var2_2, var3_3, iV.U);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ jx NX(String string) {
        int n2 = w & 0x85630255 ^ 0xC23E6440;
        int n3 = 0;
        int n4 = (n2 | 0x85630255) ^ 0xC922CE38;
        n3 = (n2 | 0x85630255) ^ 0xA73F44BA;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1558117460: {
                    n4 ^= n3 ^ 0x5BDE3FDB;
                    n3 = (n2 | 0x85630255) ^ 0x13297611;
                    continue block5;
                }
                case 1614815983: {
                    break;
                }
                case -732557244: {
                    return new jx();
                }
            }
            n3 = (n2 | 0x85630255) ^ 0x9BA19A01;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ boolean NY(class_1923 var0, int var1_1, Long var2_2) {
        block29: {
            block23: {
                block28: {
                    break block29;
lbl1:
                    // 1 sources

                    return v0;
lbl3:
                    // 1 sources

                    while (true) {
                        v0 = false;
                        if (true) ** GOTO lbl21
                        break;
                    }
                    block13: while (true) {
                        block27: {
                            block22: {
                                block26: {
                                    block24: {
                                        block25: {
                                            var5_5 = (var3_4 | var6_3) ^ -1520778733;
                                            break block27;
lbl9:
                                            // 1 sources

                                            while (true) {
                                                if (Math.abs(class_1923.method_8325((long)var2_2) - var0.field_9181) > var1_1) break block22;
                                                break block23;
                                                break;
                                            }
lbl12:
                                            // 1 sources

                                            while (true) {
                                                var4_6 ^= var5_5 ^ -1194011639;
                                                break block24;
                                                break;
                                            }
lbl15:
                                            // 1 sources

                                            while (true) {
                                                v0 = true;
                                                break block25;
                                                break;
                                            }
lbl18:
                                            // 1 sources

                                            while (true) {
                                                var4_6 ^= var5_5 ^ 370037553;
                                                break block26;
                                                break;
                                            }
                                        }
                                        var4_6 ^= 1309004;
                                        ** continue;
lbl24:
                                        // 1 sources

                                        while (Math.abs(class_1923.method_8332((long)var2_2) - var0.field_9180) > var1_1) {
                                            break block22;
                                        }
                                        break;
                                    }
                                    var5_5 = (var3_4 | var6_3) ^ 793698556;
                                    break block27;
lbl30:
                                    // 1 sources

                                    while (true) {
                                        var5_5 = (var3_4 | var6_3) ^ -1183988049;
                                        break block27;
                                        break;
                                    }
                                }
                                var5_5 = (var3_4 | var6_3) ^ 365454195;
                                break block27;
                            }
                            var5_5 = (var3_4 | var6_3) ^ 422019172;
                        }
lbl39:
                        // 5 sources

                        block20: while (true) {
                            switch (var5_5) {
                                default: {
                                    continue block20;
                                }
                                case -105432180: {
                                    ** continue;
                                }
                                case 2041408383: {
                                    ** continue;
                                }
                                case 1940068707: {
                                    ** continue;
                                }
                                case 1858761559: {
                                    ** continue;
                                }
                                case 1227201260: {
                                    ** continue;
                                }
                                case 1170897403: {
                                    ** continue;
                                }
                                case -444580048: {
                                    ** GOTO lbl24
                                }
                                case 274489190: {
                                    var4_6 ^= var5_5 ^ 1134065068;
                                    continue block13;
                                }
                                case 1521798252: {
                                    break block28;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    var5_5 = (var3_4 | var6_3) ^ 1286711033;
                    ** GOTO lbl39
                }
                var5_5 = (var3_4 | var6_3) ^ 841452232;
                ** GOTO lbl39
lbl67:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 106509811;
                    ** GOTO lbl39
                    break;
                }
            }
            var5_5 = (var3_4 | var6_3) ^ 624988896;
            ** while (true)
        }
        var6_3 = 472764827;
        var3_4 = iV.w & 472764827 ^ 1087219854;
        var5_5 = 0;
        var4_6 = (var3_4 | var6_3) ^ 1483715015;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void NZ(Map.Entry entry) {
        int n2 = w & 0x425EA5A4 ^ 0xB23BFFA5;
        int n3 = 0;
        int n4 = (n2 | 0x425EA5A4) ^ 0xE6766428;
        n3 = (n2 | 0x425EA5A4) ^ 0x2A962209;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1334129254: {
                    this.b.remove(entry.getKey());
                    return;
                }
                case -655762004: {
                    n3 = (n2 | 0x425EA5A4) ^ 0x78BC0D7A;
                    continue block5;
                }
                case -1966869793: 
            }
            n4 ^= n3 ^ 0xFB47BBA1;
            n3 = (n2 | 0x425EA5A4) ^ 0xBDFACDC3;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ long Oa(Map.Entry var0) {
        block9: {
            var1_1 = iV.w & -147042519 ^ -363398273;
            var3_2 = 0;
            ** GOTO lbl20
lbl4:
            // 1 sources

            while (true) {
                var3_2 = (var1_1 | -147042519) ^ -951850964;
                break block9;
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                var2_3 ^= var3_2 ^ 1028418868;
                ** continue;
                break;
            }
        }
lbl11:
        // 2 sources

        block7: while (true) {
            switch (var3_2) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block7;
                    }
                    break;
                }
                case 920405799: {
                    ** continue;
                }
                case -570897415: {
                    break block7;
                }
lbl20:
                // 1 sources

                var2_3 = (var1_1 | -147042519) ^ -1793724348;
                var3_2 = (var1_1 | -147042519) ^ 579220614;
                ** continue;
                case 943527763: {
                    return ((fO)var0.getValue()).b;
                }
            }
            break;
        }
        var3_2 = (var1_1 | -147042519) ^ -912082856;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean Ob(long var0, double var2_2, double var4_3, double var6_4, Map.Entry var8_1) {
        block29: {
            break block29;
lbl1:
            // 1 sources

            while (true) {
                var19_7 = (var17_6 | var20_5) ^ -1690826523;
                if (true) ** GOTO lbl31
                break;
            }
lbl4:
            // 1 sources

            block22: while (true) {
                switch (var19_7) {
                    case -1844008295: {
                        var18_8 ^= var19_7 ^ 507268385;
                        var19_7 = (var17_6 | var20_5) ^ 550069448;
                        break;
                    }
                    case 1027320734: {
                        v0 = true;
                        ** GOTO lbl24
                    }
                    case -1252869522: {
                        var18_8 ^= var19_7 ^ 964189654;
                        ** break;
                    }
                    case 2132457014: {
                        var18_8 ^= var19_7 ^ 79975437;
                        var19_7 = (var17_6 | var20_5) ^ 1141179106;
                        break;
                    }
lbl20:
                    // 1 sources

                    var19_7 = (var17_6 | var20_5) ^ 547615073;
                    continue block22;
                    case 1028734519: {
                        v0 = false;
lbl24:
                        // 2 sources

                        var18_8 ^= -2068255015;
                        return v0;
                    }
                    case 1509412276: {
                        var19_7 = var11_11 * var11_11 + var13_12 * var13_12 + var15_13 * var15_13 > 102400.0 ? (var17_6 | var20_5) ^ -1880857137 : (var17_6 | var20_5) ^ -1465879240;
                    }
                }
                continue;
                break;
            }
            block23: while (true) {
                var19_7 = (var17_6 | var20_5) ^ -1916462186;
lbl31:
                // 2 sources

                block24: while (true) {
                    switch (var19_7) {
                        case -963317754: {
                            var10_10 = class_2338.method_10092((long)var9_9.a);
                            ** break;
                        }
                        case -2033530957: {
                            if (var0 - var9_9.b > (-4458480687726267313L << (var19_7 ^ -2033530989) >>> (var19_7 ^ -2033530989) ^ (long)var18_8 & 0xFFFFFFFFL | (-4458480687726267313L >>> (var19_7 ^ -2033530989) ^ (long)var18_8 & 0xFFFFFFFFL) << (var19_7 ^ -2033530989))) {
                                continue block23;
                            }
                            ** GOTO lbl46
                        }
lbl41:
                        // 1 sources

                        var18_8 ^= 184634905;
                        ** GOTO lbl58
                        case 2142081991: {
                            var18_8 ^= var19_7 ^ -1228561628;
                            ** continue;
                        }
lbl46:
                        // 1 sources

                        var19_7 = (var17_6 | var20_5) ^ 1868503398;
                        continue block24;
                        case -1875389248: {
                            var18_8 ^= var19_7 ^ -1042886481;
                            var19_7 = (var17_6 | var20_5) ^ 241209863;
                        }
lbl51:
                        // 4 sources

                        while (true) {
                            default: {
                                continue block24;
                            }
                            break;
                        }
                        case 1923995184: {
                            var18_8 ^= var19_7 ^ 1881898167;
                            var19_7 = (var17_6 | var20_5) ^ -614056112;
                            ** GOTO lbl51
                        }
lbl58:
                        // 1 sources

                        var11_11 = (double)var10_10.method_10263() + 0.5 - var2_2;
                        var13_12 = (double)var10_10.method_10264() + 0.5 - var4_3;
                        var15_13 = (double)var10_10.method_10260() + 0.5 - var6_4;
                        var19_7 = (var17_6 | var20_5) ^ 1659402592;
                        ** continue;
lbl63:
                        // 1 sources

                        while (true) {
                            var19_7 = (var17_6 | var20_5) ^ 1650416785;
                            ** continue;
                            break;
                        }
                        case 328359249: 
                    }
                    break;
                }
                break;
            }
            return true;
        }
        var20_5 = 363875926;
        var17_6 = iV.w & 363875926 ^ 148013846;
        var19_7 = 0;
        var18_8 = (var17_6 | var20_5) ^ -645536337;
        var19_7 = (var17_6 | var20_5) ^ 192120024;
        block27: while (true) {
            switch (var19_7) {
                default: {
                    continue block27;
                }
                case 377572238: {
                    var19_7 = (var17_6 | var20_5) ^ -1409466825;
                    continue block27;
                }
                case -1240469151: {
                    var18_8 ^= var19_7 ^ 2033229844;
                    var19_7 = (var17_6 | var20_5) ^ -490449170;
                    continue block27;
                }
                case -13198920: 
            }
            break;
        }
        var9_9 = (fO)var8_1.getValue();
        ** while (true)
    }
}

