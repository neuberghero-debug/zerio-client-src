/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1299
 *  net.minecraft.class_1922
 *  net.minecraft.class_1923
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2281
 *  net.minecraft.class_2315
 *  net.minecraft.class_2336
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_2586
 *  net.minecraft.class_2636
 *  net.minecraft.class_2680
 *  net.minecraft.class_2682
 *  net.minecraft.class_2745
 *  net.minecraft.class_2769
 *  net.minecraft.class_2818
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_408
 *  net.minecraft.class_638
 *  net.minecraft.class_7923
 *  net.minecraft.class_8961
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1299;
import net.minecraft.class_1922;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2281;
import net.minecraft.class_2315;
import net.minecraft.class_2336;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2586;
import net.minecraft.class_2636;
import net.minecraft.class_2680;
import net.minecraft.class_2682;
import net.minecraft.class_2745;
import net.minecraft.class_2769;
import net.minecraft.class_2818;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_408;
import net.minecraft.class_638;
import net.minecraft.class_7923;
import net.minecraft.class_8961;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import z.r.W;
import z.r.aE;
import z.r.aa;
import z.r.ah;
import z.r.cZ;
import z.r.cn;
import z.r.cr;
import z.r.cv;
import z.r.d;
import z.r.fD;
import z.r.gF;
import z.r.gP;
import z.r.gZ;
import z.r.gp;
import z.r.hJ;
import z.r.hw;
import z.r.ik;
import z.r.j;
import z.r.ke;
import z.r.mb;
import z.r.mc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class lu
extends gF {
    private static final /* synthetic */ String a;
    private final cr a;
    private boolean[] a;
    private static final /* synthetic */ String b;
    private int a;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private final IdentityHashMap<class_2248, Boolean> a;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String l;
    private static final int b;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private final ke a;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final int c;
    private final Vector4f a;
    private final gP a;
    private final ke b;
    private static final /* synthetic */ String t;
    private final gP b;
    private static final int d;
    private static final /* synthetic */ String u;
    private static final int e;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private static final /* synthetic */ String x;
    private static final int f;
    private boolean[] b;
    private static final /* synthetic */ String y;
    private final HashMap<Long, cv> a;
    private static final /* synthetic */ String z;
    private volatile j[] a;
    private static final int g;
    private final ke c;
    private static final Set<class_2248> a;
    private static final Predicate<class_2680> a;
    private static final /* synthetic */ String A;
    private int h;
    private static final /* synthetic */ String B;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final /* synthetic */ String C;
    private final HashMap<UUID, fD> b;
    private boolean[] c;
    private static final /* synthetic */ String D;
    private static final long a;
    private static final /* synthetic */ String k;
    private static final int l;
    private static final /* synthetic */ String E;
    private static final /* synthetic */ String F;
    private static final int m;
    private final HashMap<Long, gp> c;
    private static final /* synthetic */ String G;
    private final gP c;
    private static final int n;
    private final ke d;
    private static final /* synthetic */ String H;
    private static final /* synthetic */ String I;
    private static final int o;
    private static final /* synthetic */ String J;
    private final ke e;
    private class_2248[] a;
    private final float[] a;
    private static final int p;
    private final HashSet<Long> a;
    private static final /* synthetic */ String K;
    private final float[] b;
    private final int[] a;
    private static final /* synthetic */ String L;
    private final ArrayList<j> a;
    private static final int q;
    private boolean[] d;
    private final int[] b;
    private boolean a;
    private int[] c;
    private static final int[] f;
    private static final /* synthetic */ String M;
    private static final int r;
    private static final /* synthetic */ String N;
    private static volatile lu a;
    private boolean[] e;
    private static final /* synthetic */ String O;
    private static final /* synthetic */ String P;
    private static final Set<class_2248> b;
    private final int[] d;
    private static final /* synthetic */ String Q;
    private final ke f;
    private static final /* synthetic */ String R;
    private static final /* synthetic */ String S;
    private static final int s;
    private static final /* synthetic */ String T;
    private static final int t;
    private static final j[] b;
    private static final int u;
    private final float[] c;
    private static final /* synthetic */ String U;
    private final aE a;
    private final IdentityHashMap<class_2248, Integer> b;
    private class_638 a;
    private static final /* synthetic */ String V;
    private static final int v;
    public static final int N;
    private static final /* synthetic */ String W;
    private final gP d;
    private final int[] e;
    private static final int w;
    private static final /* synthetic */ String X;
    private final ke g;
    private static final /* synthetic */ String Y;
    private static final /* synthetic */ String Z;
    private static final /* synthetic */ String aa;
    private final IdentityHashMap<class_2248, Integer> c;
    private static final /* synthetic */ String ab;
    private static final int x;
    private static final int y;
    private static final /* synthetic */ String ac;
    private static final /* synthetic */ String ad;
    private static final /* synthetic */ String ae;
    private static final /* synthetic */ String af;
    private final gP e;
    private mc a;
    private static final /* synthetic */ String ag;
    private static final /* synthetic */ String ah;
    private static final /* synthetic */ String ai;
    private static final /* synthetic */ String aj;
    private static final /* synthetic */ String ak;
    private static final /* synthetic */ String al;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String am;
    private final gP f;
    private static final /* synthetic */ String an;
    private final IdentityHashMap<class_2680, cn> d;
    private int z;
    private boolean[] f;
    private int A;
    private static final /* synthetic */ String ao;
    private static final int B;
    private static final /* synthetic */ String ap;
    private static final int C;
    private int D;
    private static final /* synthetic */ String aq;
    private static final int E;
    private static final Set<class_2248> c;
    private short[] a;
    private final float[] d;
    private static final /* synthetic */ String ar;
    private static final int F;
    private final ArrayDeque<Long> a;
    private static final /* synthetic */ String as;
    private final ke h;
    private static final /* synthetic */ String at;
    private static final /* synthetic */ String au;
    private static final /* synthetic */ String av;
    private static final /* synthetic */ String aw;
    private static final int G;
    private static final /* synthetic */ String ax;
    private static final /* synthetic */ String ay;
    private static final int H;
    private static final /* synthetic */ String az;
    private final float[] e;
    private static final /* synthetic */ String aA;
    private final gP g;
    private final gP h;
    private final ke i;
    private static final /* synthetic */ String aB;
    private static final int I;
    private static final /* synthetic */ String aC;
    private final gP i;
    private static final int J;
    private final ke j;
    private static final int K;
    private static final int L;
    private boolean[] g;
    private static final /* synthetic */ String aD;
    private static final /* synthetic */ String aE;
    private static final /* synthetic */ String aF;
    private static final /* synthetic */ String aG;
    private static final int M;
    private static final /* synthetic */ String aH;
    private static final /* synthetic */ String aI;
    private final ke k;

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
    public lu() {
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
    public static lu getInstance() {
        int n2 = N & 0x2B91AA12 ^ 0x1BE1939E;
        int n3 = 0;
        int n4 = (n2 | 0x2B91AA12) ^ 0x9789CDD2;
        n3 = (n2 | 0x2B91AA12) ^ 0x678189D0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1550856782: {
                    n3 = (n2 | 0x2B91AA12) ^ 0x71478246;
                    continue block5;
                }
                case 877627429: {
                    return a;
                }
                case 1253456344: 
            }
            n4 ^= n3 ^ 0x57BCD78C;
            n3 = (n2 | 0x2B91AA12) ^ 0xFBE33BB;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onEnable() {
        int n2 = -1800029532;
        int n3 = N & 0x94B5BAA4 ^ 0xA48D2619;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xEE0D7E16;
        n4 = (n3 | n2) ^ 0xEF67FE7F;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1792637103: {
                    n5 ^= n4 ^ 0x36DE1249;
                    n4 = (n3 | n2) ^ 0x8749B1BD;
                    continue block7;
                }
                case 1008787964: {
                    n5 ^= n4 ^ 0x471FC868;
                    n4 = (n3 | n2) ^ 0x10BAD01E;
                    continue block7;
                }
                case 871632640: {
                    return;
                }
                case -1543016797: {
                    this.xj(null);
                    n4 = (n3 | n2) ^ 0x219B39EC;
                    continue block7;
                }
                case 1541030082: 
            }
            n4 = (n3 | n2) ^ 0x889D5F41;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block14: {
            break block14;
lbl1:
            // 1 sources

            return;
lbl3:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ -221727308;
                ** GOTO lbl18
                break;
            }
lbl6:
            // 2 sources

            block9: while (true) {
                switch (var3_3) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block9;
                        }
                        break;
                    }
                    case 1340667600: {
                        ** continue;
                    }
                    case 606453655: {
                        ** continue;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 435582130;
                        ** GOTO lbl-1000
                        break;
                    }
lbl18:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -1120589714;
                    ** GOTO lbl-1000
lbl20:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 452048439;
                        ** continue;
                        break;
                    }
                    case -399742839: {
                        var2_4 ^= var3_3 ^ -1174965829;
                        break block9;
                    }
                    case -349459956: {
                        ** continue;
                    }
                }
                break;
            }
            var3_3 = (var1_2 | var4_1) ^ 829759708;
            ** GOTO lbl6
        }
        var4_1 = 575704764;
        var1_2 = lu.N & 575704764 ^ -790801870;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -692752755;
        ** while (true)
lbl36:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -688365271;
            ** continue;
            break;
        }
        {
            ** case -1012335006:
        }
lbl40:
        // 1 sources

        this.xj(null);
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
    public static void onClientBlockChanged(class_2818 var0, class_2338 var1_1, class_2680 var2_2, class_2680 var3_3) {
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
    static boolean isRelevantActivityChange(class_2680 var0, class_2680 var1_1) {
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
    private aa xh(class_2680 var1_1, class_2680 var2_2) {
        block34: {
            block32: {
                block33: {
                    break block32;
lbl1:
                    // 9 sources

                    block18: while (true) {
                        switch (var5_5) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block18;
                                }
                                break;
                            }
lbl6:
                            // 1 sources

                            while (true) {
                                var5_5 = (var3_4 | var6_3) ^ -761717077;
                                ** continue;
                                break;
                            }
                            case -1836875603: {
                                var4_6 ^= var5_5 ^ 676720131;
                                break;
                            }
                            case -1092987306: {
                                return lu.xi(var1_1, var2_2, this.xz(var1_1), this.xz(var2_2));
                            }
                        }
lbl14:
                        // 2 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ -1658601882;
                            continue block18;
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 1504528913;
                            continue block18;
                            break;
                        }
                        break;
                    }
lbl20:
                    // 1 sources

                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ 1039410478;
                        ** GOTO lbl1
                        break;
                    }
                    {
                        case 1394557461: {
                            break block33;
                        }
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ 1562988291;
                        ** GOTO lbl1
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ 2021537778;
                        ** GOTO lbl1
                        break;
                    }
                }
lbl32:
                // 2 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 1008164664;
                    ** GOTO lbl1
                    break;
                }
                {
                    case 617488764: {
                        var4_6 ^= var5_5 ^ 1913603300;
                        ** continue;
                    }
                    case -67890179: {
                        var4_6 ^= var5_5 ^ -1526089530;
                        ** continue;
                    }
                }
lbl41:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 1411899657;
                    ** GOTO lbl1
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ -835480029;
                    ** GOTO lbl1
                    break;
                }
lbl47:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 285844642;
                    ** GOTO lbl1
                    break;
                }
                {
                    case 946121204: {
                        return z.r.aa.a;
                    }
                    case -1210779556: {
                        var4_6 ^= var5_5 ^ -347778250;
                        ** continue;
                    }
                }
lbl55:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ -1176308406;
                    ** GOTO lbl1
                    break;
                }
                {
                    case 1232126911: {
                        var4_6 ^= var5_5 ^ -1202168917;
                        ** continue;
                    }
                    case -1286537906: {
                        if (var1_1.method_26204() == var2_2.method_26204()) {
                            ** continue;
                        }
                        break block34;
                    }
                }
            }
            var6_3 = -905664677;
            var3_4 = lu.N & -905664677 ^ -1560431547;
            var5_5 = 0;
            var4_6 = (var3_4 | var6_3) ^ -748172561;
            ** while (true)
            {
                case -689248153: {
                    switch (var4_6) {
                        case 966426032: {
                            ** continue;
                        }
                        default: {
                            ** continue;
                        }
                        ** case 986032166:
lbl78:
                        // 1 sources

                        ** continue;
                    }
                }
                case 2011040057: {
                    ** continue;
                }
                ** case -687238543:
            }
lbl82:
            // 1 sources

            ** while (true)
        }
        var5_5 = (var3_4 | var6_3) ^ -1551010592;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static aa xi(class_2680 var0, class_2680 var1_1, int var2_2, int var3_3) {
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
    private void xj(class_638 var1_1) {
        block69: {
            block66: {
                block68: {
                    block59: {
                        block65: {
                            block62: {
                                block67: {
                                    block63: {
                                        block60: {
                                            block58: {
                                                block57: {
                                                    block61: {
                                                        block64: {
                                                            break block64;
lbl1:
                                                            // 1 sources

                                                            while (true) {
                                                                var4_4 = (var2_3 | var5_2) ^ -992725199;
                                                                ** GOTO lbl25
lbl4:
                                                                // 1 sources

                                                                while (true) {
                                                                    var4_4 = (var2_3 | var5_2) ^ 988509949;
                                                                    ** GOTO lbl25
lbl7:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        this.a.clear();
                                                                        ** GOTO lbl39
                                                                        break;
                                                                    }
lbl10:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_5 ^= var4_4 ^ -583530358;
                                                                        break block57;
                                                                        break;
                                                                    }
lbl13:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl15:
                                                                // 1 sources

                                                                while (true) {
                                                                    var4_4 = (var2_3 | var5_2) ^ -1915661793;
                                                                    ** GOTO lbl25
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        var5_2 = -57061667;
                                                        var2_3 = lu.N & -57061667 ^ 427245382;
                                                        var4_4 = 0;
                                                        break block65;
lbl23:
                                                        // 1 sources

                                                        block43: while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ -57321544;
lbl25:
                                                            // 30 sources

                                                            block44: while (true) {
                                                                switch (var4_4) lbl-1000:
                                                                // 6 sources

                                                                {
                                                                    while (true) {
                                                                        default: {
                                                                            continue block44;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 76056260: {
                                                                        ** continue;
                                                                    }
                                                                    case -147878715: {
                                                                        ** continue;
                                                                    }
                                                                    case -778193360: {
                                                                        ** continue;
                                                                    }
                                                                    case 1495287742: {
                                                                        this.a = lu.b;
                                                                        break block58;
                                                                    }
lbl39:
                                                                    // 1 sources

                                                                    var4_4 = (var2_3 | var5_2) ^ -1792084473;
                                                                    ** GOTO lbl-1000
lbl41:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ -1598181859;
                                                                        ** GOTO lbl-1000
                                                                        break;
                                                                    }
                                                                    case 1400103017: {
                                                                        var3_5 ^= var4_4 ^ 1523290529;
                                                                        break block59;
                                                                    }
                                                                    case -574451028: {
                                                                        var3_5 ^= var4_4 ^ -988596080;
                                                                        break block43;
                                                                    }
                                                                    case 833764718: {
                                                                        this.b.clear();
                                                                        ** continue;
                                                                    }
                                                                    case 1474890319: {
                                                                        this.d.clear();
                                                                        break block60;
                                                                    }
                                                                    case -951480947: {
                                                                        var3_5 ^= var4_4 ^ 1996828302;
                                                                        break block61;
                                                                    }
                                                                    case 23734375: {
                                                                        this.a = false;
                                                                        break;
                                                                    }
                                                                    case 300614917: {
                                                                        this.a.clear();
                                                                        break;
                                                                    }
                                                                    case -905161694: {
                                                                        var3_5 ^= var4_4 ^ -1200087550;
                                                                        break block62;
                                                                    }
                                                                    case -954988254: {
                                                                        var3_5 ^= var4_4 ^ -419184344;
                                                                        break block63;
                                                                    }
lbl71:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ 181465882;
                                                                        ** GOTO lbl-1000
                                                                        break;
                                                                    }
lbl74:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ -334202150;
                                                                        ** GOTO lbl-1000
                                                                        break;
                                                                    }
lbl77:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ -637589484;
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                    case 604002251: {
                                                                        var3_5 ^= var4_4 ^ 1804417264;
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        var4_4 = (var2_3 | var5_2) ^ -867351887;
                                                        ** GOTO lbl25
                                                        {
                                                            case 180591748: {
                                                                break block66;
                                                            }
                                                            case -600970878: {
                                                                return;
                                                            }
                                                            case -2015364651: {
                                                                this.z = 0;
                                                                ** continue;
                                                            }
                                                            case 1564660162: {
                                                                this.h = 0;
                                                                break;
                                                            }
                                                        }
                                                        var4_4 = (var2_3 | var5_2) ^ 55672626;
                                                        ** GOTO lbl25
lbl97:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ 1703953784;
                                                            ** GOTO lbl25
                                                            break;
                                                        }
lbl100:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ 2048951818;
                                                            ** GOTO lbl25
                                                            break;
                                                        }
                                                    }
                                                    var4_4 = (var2_3 | var5_2) ^ -1441368688;
                                                    ** GOTO lbl25
                                                    {
                                                        case -22150931: {
                                                            var3_5 ^= var4_4 ^ 1174698952;
                                                            ** continue;
                                                        }
                                                        case 45892929: {
                                                            var3_5 ^= var4_4 ^ 1162351348;
                                                            break;
                                                        }
                                                    }
                                                    var4_4 = (var2_3 | var5_2) ^ 499879506;
                                                    ** GOTO lbl25
                                                    {
                                                        case 1882074560: {
                                                            var3_5 ^= var4_4 ^ 1210770969;
                                                            ** continue;
                                                        }
                                                        case -1737540953: {
                                                            ++this.a;
                                                            ** continue;
                                                        }
                                                        case 311692355: {
                                                            this.c.clear();
                                                            break block67;
                                                        }
                                                    }
                                                }
                                                var4_4 = (var2_3 | var5_2) ^ -109577957;
                                                ** GOTO lbl25
                                            }
                                            var4_4 = (var2_3 | var5_2) ^ 1596766538;
                                            ** GOTO lbl25
                                            {
                                                case 959138030: {
                                                    this.a = null;
                                                    break block68;
                                                }
                                            }
lbl132:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ 567449181;
                                                ** GOTO lbl25
                                                break;
                                            }
lbl135:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ 744671727;
                                                ** GOTO lbl25
                                                break;
                                            }
lbl138:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ 938683389;
                                                ** GOTO lbl25
                                                break;
                                            }
                                            {
                                                case 1758562776: {
                                                    var3_5 ^= var4_4 ^ -1477318825;
                                                    ** continue;
                                                }
                                            }
                                            var4_4 = (var2_3 | var5_2) ^ 258149642;
                                            ** GOTO lbl25
lbl146:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ 985068114;
                                                ** GOTO lbl25
                                                break;
                                            }
lbl149:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ 936092045;
                                                ** GOTO lbl25
                                                break;
                                            }
                                        }
                                        var4_4 = (var2_3 | var5_2) ^ -12371298;
                                        ** GOTO lbl25
                                    }
                                    var4_4 = (var2_3 | var5_2) ^ -278170724;
                                    ** GOTO lbl25
                                }
                                var4_4 = (var2_3 | var5_2) ^ -1366515786;
                                ** GOTO lbl25
                                this.c.clear();
                                var4_4 = (var2_3 | var5_2) ^ -1547220711;
                                ** GOTO lbl25
                            }
                            var4_4 = (var2_3 | var5_2) ^ -1151186555;
                            ** GOTO lbl25
                            {
                                case -533401203: {
                                    this.A = this.xl();
                                    break block69;
                                }
                            }
                            var4_4 = (var2_3 | var5_2) ^ -1528874911;
                            ** GOTO lbl25
                        }
                        var3_5 = (var2_3 | var5_2) ^ -1099759802;
                        var4_4 = (var2_3 | var5_2) ^ -147004581;
                        ** GOTO lbl25
                        {
                            case -1660615498: {
                                var3_5 ^= var4_4 ^ 2105698759;
                                ** continue;
                            }
                            case 1881668101: {
                                var3_5 ^= var4_4 ^ 938798596;
                                ** continue;
                            }
                            case 1580742342: {
                                var3_5 ^= var4_4 ^ -513246032;
                                ** continue;
                            }
                            case -902504878: {
                                this.a = var1_1;
                                ** continue;
                            }
                            case -1563179371: {
                                var3_5 ^= var4_4 ^ 423679942;
                                ** continue;
                            }
                            case 1502468483: {
                                this.a.clear();
                                ** continue;
                            }
                            case 1588628027: {
                                var3_5 ^= var4_4 ^ 485657840;
                                ** continue;
                            }
                            case 1184708186: {
                                this.a.clear();
                                ** continue;
                            }
                        }
                        var4_4 = (var2_3 | var5_2) ^ 540929395;
                        ** GOTO lbl25
                    }
                    var4_4 = (var2_3 | var5_2) ^ -1535990180;
                    ** GOTO lbl25
                    {
                        ** case -224628011:
                    }
lbl206:
                    // 1 sources

                    var3_5 ^= var4_4 ^ -1850558295;
                    ** while (true)
                }
                var4_4 = (var2_3 | var5_2) ^ -1555040796;
                ** GOTO lbl25
            }
            var4_4 = (var2_3 | var5_2) ^ 1627028329;
            ** GOTO lbl25
        }
        var4_4 = (var2_3 | var5_2) ^ -1915189798;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void xk(long var1_1) {
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
    private int xl() {
        var1_1 = lu.N & -572314019 ^ -1707318145;
        var3_2 = 0;
        ** GOTO lbl17
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
                case -2144414750: {
                    break block5;
                }
lbl11:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -572314019) ^ 1607581085;
                    ** GOTO lbl-1000
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -572314019) ^ -2087499278;
                    ** continue;
                    break;
                }
lbl17:
                // 1 sources

                var2_3 = (var1_1 | -572314019) ^ 2096348216;
                ** continue;
                case 1550591885: {
                    return lu.xS((var2_3 | var3_2 ^ -2121332272) ^ (var3_2 ^ 247018464), (var1_1 | var3_2 ^ -2121332272) ^ ((var2_3 | var3_2 ^ -2121332272) ^ (var3_2 ^ -1455471209))) * ((Float)this.d.getValue()).intValue() + ((String)this.a.getValue()).hashCode();
                }
            }
            break;
        }
        var3_2 = (var1_1 | -572314019) ^ -1264953686;
        ** while (true)
        {
            ** case 1801795797:
        }
lbl24:
        // 1 sources

        var2_3 ^= var3_2 ^ 1312362583;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void xm(class_310 var1_1) {
        block66: {
            block63: {
                block65: {
                    block67: {
                        break block67;
lbl1:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ 812533679;
                            ** GOTO lbl101
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ 1801416102;
                            ** GOTO lbl66
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            block69: {
                                block64: {
                                    var5_4 = (var3_3 | var6_2) ^ 749376555;
                                    ** GOTO lbl101
lbl10:
                                    // 1 sources

                                    while (true) {
                                        this.a.clear();
                                        ** GOTO lbl92
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -1028883507;
                                        ** GOTO lbl66
lbl16:
                                        // 1 sources

                                        while (true) {
                                            var4_5 ^= var5_4 ^ -1657704681;
                                            break block63;
                                            break;
                                        }
lbl19:
                                        // 1 sources

                                        while (true) {
                                            ++this.a;
                                            ** GOTO lbl99
                                            break;
                                        }
lbl22:
                                        // 1 sources

                                        while (true) {
                                            var4_5 ^= var5_4 ^ -272703383;
                                            break block64;
                                            break;
                                        }
lbl25:
                                        // 1 sources

                                        while (true) {
                                            var5_4 = (var3_3 | var6_2) ^ -1760618840;
                                            ** GOTO lbl66
lbl28:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                            break;
                                        }
lbl30:
                                        // 1 sources

                                        while (true) {
                                            var5_4 = (var3_3 | var6_2) ^ 1148845321;
                                            ** GOTO lbl66
                                            break;
                                        }
                                        break;
                                    }
lbl33:
                                    // 1 sources

                                    while (true) {
                                        var4_5 ^= var5_4 ^ -1910339237;
                                        ** continue;
                                        break;
                                    }
lbl36:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ 1275893210;
                                        ** GOTO lbl66
                                        break;
                                    }
lbl39:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ 649939598;
                                        ** GOTO lbl101
lbl42:
                                        // 1 sources

                                        while (true) {
                                            var4_5 ^= var5_4 ^ 2050935734;
                                            break block63;
                                            break;
                                        }
lbl45:
                                        // 1 sources

                                        while (true) {
                                            var4_5 ^= var5_4 ^ -1683543878;
                                            ** continue;
                                            break;
                                        }
lbl48:
                                        // 1 sources

                                        while (true) {
                                            var2_6 = this.xl();
                                            ** GOTO lbl97
lbl51:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ 748433302;
                                                ** GOTO lbl66
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
lbl54:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -1532524760;
                                        ** GOTO lbl66
                                        break;
                                    }
                                }
                                var5_4 = (var3_3 | var6_2) ^ 322152151;
                                ** GOTO lbl66
lbl60:
                                // 1 sources

                                block53: while (true) {
                                    block68: {
                                        var5_4 = (var3_3 | var6_2) ^ 1461945665;
                                        break block68;
lbl63:
                                        // 1 sources

                                        while (true) {
                                            this.a = null;
                                            ** continue;
                                            break;
                                        }
                                    }
lbl67:
                                    // 12 sources

                                    block55: while (true) {
                                        switch (var5_4) lbl-1000:
                                        // 4 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block55;
                                                }
                                                break;
                                            }
                                            case 2018642102: {
                                                ** continue;
                                            }
                                            case -777969955: {
                                                ** continue;
                                            }
                                            case -1583964687: {
                                                ** continue;
                                            }
                                            case 1764093876: {
                                                ** continue;
                                            }
                                            case 509211731: {
                                                ** continue;
                                            }
                                            case -1508556077: {
                                                break;
                                            }
                                            case -304220614: {
                                                ** continue;
                                            }
                                            case 911719355: {
                                                ** continue;
                                            }
                                            case -1273134955: {
                                                break block53;
                                            }
                                            case -1446128212: {
                                                ** continue;
                                            }
lbl92:
                                            // 1 sources

                                            var5_4 = (var3_3 | var6_2) ^ 485175720;
                                            ** GOTO lbl-1000
                                            case 778000263: {
                                                var4_5 ^= var5_4 ^ 1340878459;
                                                ** continue;
                                            }
lbl97:
                                            // 1 sources

                                            var5_4 = (var3_3 | var6_2) ^ -1801378564;
                                            ** GOTO lbl-1000
lbl99:
                                            // 1 sources

                                            var5_4 = (var3_3 | var6_2) ^ -740582193;
                                            ** continue;
lbl101:
                                            // 3 sources

                                            block57: while (true) {
                                                switch (var5_4) {
                                                    default: {
                                                        continue block57;
                                                    }
                                                    case -1673315851: {
                                                        ** continue;
                                                    }
                                                    case -1970260780: {
                                                        ** continue;
                                                    }
                                                    case -1772820656: {
                                                        ** continue;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                }
                                var5_4 = (var3_3 | var6_2) ^ -1057420834;
                                ** GOTO lbl67
                                {
                                    case 770794963: {
                                        if (var2_6 == this.A) {
                                            break;
                                        }
                                        break block65;
                                    }
                                    case 293539480: {
                                        var4_5 ^= var5_4 ^ -368310719;
                                        ** continue;
                                    }
                                }
lbl120:
                                // 2 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 561766338;
                                    ** GOTO lbl67
                                    break;
                                }
                                {
                                    case 619062556: {
                                        var4_5 ^= var5_4 ^ -658054022;
                                        break block69;
                                    }
                                }
lbl126:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 459861642;
                                    ** GOTO lbl67
                                    break;
                                }
                                {
                                    case 901930961: {
                                        var4_5 ^= var5_4 ^ -765174338;
                                        ** continue;
                                    }
                                    case 732730321: {
                                        var4_5 ^= var5_4 ^ -66906963;
                                        ** continue;
                                    }
                                }
                                this.xp(var1_1);
                                var5_4 = (var3_3 | var6_2) ^ -1642572185;
                                ** GOTO lbl67
                            }
                            var5_4 = (var3_3 | var6_2) ^ 151429355;
                            ** GOTO lbl67
                            {
                                case -1275538544: {
                                    return;
                                }
                                case -151853407: {
                                    this.A = var2_6;
                                    break block66;
                                }
                            }
lbl146:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ -1856839510;
                                ** GOTO lbl67
                                break;
                            }
                            {
                                case -1685738311: {
                                    switch (var4_5) {
                                        case 790562224: {
                                            ** continue;
                                        }
                                        default: {
                                            ** continue;
                                        }
                                        ** case 683507472:
lbl156:
                                        // 1 sources

                                        ** continue;
                                    }
                                }
                                case -24670606: {
                                    return;
                                }
                            }
                            var5_4 = (var3_3 | var6_2) ^ -1417576989;
                            ** GOTO lbl67
                            break;
                        }
lbl161:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ 859015921;
                            ** GOTO lbl67
                            break;
                        }
                        {
                            case -1982989942: {
                                var4_5 ^= var5_4 ^ 1697094467;
                                ** continue;
                            }
                            case -1771938579: {
                                var4_5 ^= var5_4 ^ 167923558;
                                ** continue;
                            }
                        }
                    }
                    var6_2 = 821563947;
                    var3_3 = lu.N & 821563947 ^ -1970904742;
                    var5_4 = 0;
                    var4_5 = (var3_3 | var6_2) ^ -1231146335;
                    ** while (true)
                }
                var5_4 = (var3_3 | var6_2) ^ -1935030080;
                ** GOTO lbl67
            }
            var5_4 = (var3_3 | var6_2) ^ 0xEE3F3EE;
            ** GOTO lbl67
            {
                ** case 2047310501:
            }
lbl183:
            // 1 sources

            this.a.clear();
            ** while (true)
        }
        var5_4 = (var3_3 | var6_2) ^ -1891881814;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void xn(long var1_1, boolean var3_2) {
        var8_3 = 167704901;
        var5_4 = lu.N & 167704901 ^ -370127264;
        var7_5 = 0;
        var6_7 = (var5_4 | var8_3) ^ 2070437142;
        var7_5 = (var5_4 | var8_3) ^ 521058587;
        ** GOTO lbl69
lbl7:
        // 2 sources

        while (true) {
            var7_5 = (var5_4 | var8_3) ^ 1059221122;
            if (true) ** GOTO lbl69
            break;
        }
        block34: while (true) {
            var7_5 = (var5_4 | var8_3) ^ 481889144;
            if (true) ** GOTO lbl69
            block35: while (true) {
                var7_5 = (var5_4 | var8_3) ^ -1838823562;
                if (true) ** GOTO lbl69
lbl16:
                // 1 sources

                block36: while (true) {
                    switch (var7_5) {
                        case -1491089624: {
                            var6_7 ^= var7_5 ^ -2027235761;
                            var7_5 = (var5_4 | var8_3) ^ 130428458;
                            continue block36;
                        }
                        case 503012299: {
                            var6_7 ^= var7_5 ^ 1815206010;
                            var7_5 = (var5_4 | var8_3) ^ -1179035335;
                            continue block36;
                        }
                        case -557085538: {
                            ** break;
                        }
                        case -298266289: {
                            this.a.remove(var4_6);
                            var7_5 = (var5_4 | var8_3) ^ -200956754;
                            break;
                        }
                        case 1346872924: {
                            ** GOTO lbl7
                        }
                        case -589048768: {
                            if (var4_6 == null) {
                                var7_5 = (var5_4 | var8_3) ^ -955547827;
                                continue block36;
                            }
                            ** GOTO lbl44
                        }
                        case 787841064: {
                            var6_7 ^= var7_5 ^ 397036797;
                            var7_5 = (var5_4 | var8_3) ^ 926249979;
                            continue block36;
                        }
lbl44:
                        // 1 sources

                        var7_5 = (var5_4 | var8_3) ^ 1323382861;
                        continue block36;
                        case -699846535: {
                            var6_7 ^= var7_5 ^ -169994669;
                            var7_5 = (var5_4 | var8_3) ^ 891104037;
                        }
                    }
                    continue;
                    break;
                }
                block37: while (true) {
                    var7_5 = (var5_4 | var8_3) ^ 1942027276;
                    ** GOTO lbl69
lbl53:
                    // 1 sources

                    while (true) {
                        var7_5 = (var5_4 | var8_3) ^ 1561447042;
                        ** GOTO lbl69
                        break;
                    }
lbl56:
                    // 2 sources

                    while (true) {
                        var6_7 ^= 436882831;
                        var4_6 = v0;
                        var7_5 = (var5_4 | var8_3) ^ 1069010716;
                        ** continue;
                        break;
                    }
                    while (true) {
                        var7_5 = (var5_4 | var8_3) ^ 507516889;
                        if (true) ** GOTO lbl69
                        break;
                    }
                    block41: while (true) {
                        var7_5 = (var5_4 | var8_3) ^ 692411367;
                        if (true) ** GOTO lbl69
                        block42: while (true) {
                            var7_5 = (var5_4 | var8_3) ^ 1976457498;
lbl69:
                            // 9 sources

                            block43: while (true) {
                                switch (var7_5) {
                                    case -138483524: {
                                        var6_7 ^= var7_5 ^ 622519517;
                                        ** GOTO lbl132
                                    }
                                    case 1963587026: {
                                        return;
                                    }
                                    case -1707211927: {
                                        if (var3_2) {
                                            var7_5 = (var5_4 | var8_3) ^ -754408508;
                                            continue block43;
                                        }
                                        ** GOTO lbl101
                                    }
                                    case -179833827: {
                                        if (!var3_2) ** continue;
                                        ** continue;
                                    }
                                    case -1061444478: {
                                        return;
                                    }
                                    case -1259391513: {
                                        var6_7 ^= var7_5 ^ 1716205958;
                                        var7_5 = (var5_4 | var8_3) ^ -989359232;
                                        continue block43;
                                    }
                                    case -152025474: {
                                        ** break;
                                    }
                                    case 2073770003: {
                                        if (this.a.size() < lu.xS((var6_7 | var7_5 ^ 1919271254) ^ (var7_5 ^ -381473853), (var5_4 | var7_5 ^ 1919271254) ^ ((var6_7 | var7_5 ^ 1919271254) ^ (var7_5 ^ 782876214)))) ** GOTO lbl109
                                        ** GOTO lbl123
                                    }
                                    case 191411092: {
                                        this.a.addLast(var1_1);
                                        continue block42;
                                    }
                                    case -1965971455: {
                                        v0 = (Long)this.a.pollFirst();
                                        ** GOTO lbl56
                                    }
lbl101:
                                    // 1 sources

                                    var7_5 = (var5_4 | var8_3) ^ -1232502957;
                                    break;
                                    case -1674533249: {
                                        var6_7 ^= var7_5 ^ -1873005204;
                                        continue block41;
                                    }
                                    case -426905837: {
                                        var6_7 ^= var7_5 ^ -46458451;
                                        continue block37;
                                    }
lbl109:
                                    // 2 sources

                                    var7_5 = (var5_4 | var8_3) ^ 60405154;
                                    break;
                                    case 2106920733: {
                                        if (!this.a.add(var1_1)) ** break;
                                        ** continue;
                                        var7_5 = (var5_4 | var8_3) ^ -1076287686;
                                        break;
                                    }
                                    case -690187801: {
                                        var6_7 ^= var7_5 ^ -1099116572;
                                        continue block35;
                                    }
                                    case -752301772: {
                                        var6_7 ^= var7_5 ^ 928687166;
                                        var7_5 = (var5_4 | var8_3) ^ -1804865416;
                                        break;
                                    }
lbl123:
                                    // 1 sources

                                    var7_5 = (var5_4 | var8_3) ^ 259199094;
                                    break;
                                    case -2048949251: {
                                        v0 = (Long)this.a.pollLast();
                                        ** continue;
                                    }
                                    case 1445451871: {
                                        var6_7 ^= var7_5 ^ 2046347213;
                                        var7_5 = (var5_4 | var8_3) ^ -1661531465;
                                        break;
                                    }
lbl132:
                                    // 1 sources

                                    var7_5 = (var5_4 | var8_3) ^ -493466383;
                                    break;
                                    case 754543845: {
                                        this.a.addFirst(var1_1);
                                        continue block42;
                                    }
                                    case -362329401: {
                                        var6_7 ^= var7_5 ^ 1970676617;
                                        continue block34;
                                    }
lbl140:
                                    // 1 sources

                                    var7_5 = (var5_4 | var8_3) ^ 987117137;
                                    continue block43;
                                    case 1601667126: {
                                        var6_7 ^= var7_5 ^ 1141101048;
                                        var7_5 = (var5_4 | var8_3) ^ 1664046948;
                                        break;
                                    }
                                    case 989224097: {
                                        var6_7 ^= var7_5 ^ 562171247;
                                        var7_5 = (var5_4 | var8_3) ^ 1814133912;
                                    }
                                }
                            }
                            break;
                        }
                        break;
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
    private void xo(int var1_1, int var2_2) {
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
    private void xp(class_310 var1_1) {
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
    private void xq(class_310 var1_1, int var2_2, int var3_3) {
        block17: {
            block18: {
                break block18;
lbl1:
                // 1 sources

                return;
lbl3:
                // 1 sources

                while (true) {
                    var6_6 = (var4_5 | var7_4) ^ 1481708756;
                    break block17;
lbl6:
                    // 2 sources

                    while (true) {
                        var6_6 = (var4_5 | var7_4) ^ 284946020;
                        break block17;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var6_6 = (var4_5 | var7_4) ^ 1506830134;
                        break block17;
                        break;
                    }
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var6_6 = (var4_5 | var7_4) ^ -807109068;
                    break block17;
                    break;
                }
            }
            var7_4 = -1640488775;
            var4_5 = lu.N & -1640488775 ^ -189465893;
            var6_6 = 0;
            var5_7 = (var4_5 | var7_4) ^ 139278657;
            ** while (true)
        }
lbl22:
        // 2 sources

        block14: while (true) {
            switch (var6_6) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block14;
                    }
                    break;
                }
                case 755581426: {
                    ** continue;
                }
                case 827884751: {
                    break block14;
                }
                case -1486053939: {
                    ** GOTO lbl36
                }
lbl33:
                // 1 sources

                while (true) {
                    var6_6 = (var4_5 | var7_4) ^ -743064823;
                    ** GOTO lbl-1000
                    break;
                }
lbl36:
                // 1 sources

                var6_6 = (var4_5 | var7_4) ^ 1466747248;
                ** continue;
            }
            break;
        }
        var6_6 = (var4_5 | var7_4) ^ 936944863;
        ** while (true)
        {
            case -1445973109: {
                this.xn(class_1923.method_8331((int)var2_2, (int)var3_3), false);
                ** GOTO lbl6
            }
            case -1494356433: {
                if (var1_1.field_1687.method_2935().method_21730(var2_2, var3_3) != null) ** break;
                ** continue;
                ** continue;
            }
            case -916169180: {
                var5_7 ^= var6_6 ^ -1261480129;
                ** continue;
            }
            ** case -297331553:
        }
lbl51:
        // 1 sources

        var5_7 ^= var6_6 ^ 590628673;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void xr(class_310 var1_1) {
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
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void xs(class_310 var1_1, long var2_2) {
        var8_3 = -1527139909;
        var5_4 = lu.N & -1527139909 ^ 1550862584;
        var7_5 = 0;
        var6_7 = (var5_4 | var8_3) ^ -619594498;
        var7_5 = (var5_4 | var8_3) ^ -1036742344;
        ** GOTO lbl59
lbl7:
        // 1 sources

        while (true) {
            var7_5 = (var5_4 | var8_3) ^ 1913852000;
            if (true) ** GOTO lbl71
            break;
        }
        block28: while (true) {
            block39: {
                block38: {
                    var7_5 = (var5_4 | var8_3) ^ 217050852;
                    break block39;
                    {
                        var7_5 = (var5_4 | var8_3) ^ 1306279669;
                        block30: while (true) {
                            cfr_temp_0 = 0;
                            while (true) {
                                switch (cfr_temp_0 == 0 ? var7_5 : cfr_temp_0) {
                                    case -851744064: {
                                        return;
                                    }
                                    case -595851459: {
                                        var6_7 ^= var7_5 ^ -624111639;
                                        ** GOTO lbl46
                                    }
                                    case -452381149: {
                                        cfr_temp_0 = 1053649091;
                                        if (this.a.step(var1_1)) {
                                            continue block29;
                                        }
                                        break block38;
                                    }
                                    case 590755140: {
                                        var7_5 = (var5_4 | var8_3) ^ 220690435;
                                        ** GOTO lbl59
                                    }
                                    case -237075976: {
                                        if (System.nanoTime() >= var2_2) ** GOTO lbl40
                                        var7_5 = (var5_4 | var8_3) ^ -1096474693;
                                        ** GOTO lbl59
                                    }
                                    case -1322924274: {
                                        var6_7 ^= var7_5 ^ -1136091345;
                                        ** GOTO lbl54
                                    }
                                    case -394160605: {
                                        if (this.a != null) ** GOTO lbl52
lbl40:
                                        // 2 sources

                                        var7_5 = (var5_4 | var8_3) ^ -1420050040;
                                        ** GOTO lbl59
                                    }
                                    case 1113384512: {
                                        var6_7 ^= var7_5 ^ 1156329108;
                                        var7_5 = (var5_4 | var8_3) ^ 435212248;
                                        ** GOTO lbl59
                                    }
lbl46:
                                    // 1 sources

                                    var7_5 = (var5_4 | var8_3) ^ 343437272;
                                    ** GOTO lbl59
                                    case 250892764: {
                                        var4_6 = this.a.a;
                                        var7_5 = (var5_4 | var8_3) ^ -1631851955;
                                        ** GOTO lbl121
                                    }
lbl52:
                                    // 1 sources

                                    var7_5 = (var5_4 | var8_3) ^ -540029761;
                                    continue block30;
lbl54:
                                    // 1 sources

                                    var7_5 = (var5_4 | var8_3) ^ -233986009;
                                    continue block30;
                                    case 1470249075: {
                                        var6_7 ^= var7_5 ^ -1032751017;
                                        var7_5 = (var5_4 | var8_3) ^ 834835259;
                                    }
lbl59:
                                    // 9 sources

                                    default: {
                                        continue block30;
                                    }
lbl61:
                                    // 1 sources

                                    while (true) {
                                        var7_5 = (var5_4 | var8_3) ^ 1710150285;
                                        break block39;
                                        break;
                                    }
                                    case 1053649091: 
                                }
                                break;
                            }
                            break;
                        }
                    }
                    ** GOTO lbl69
                }
lbl67:
                // 2 sources

                while (true) {
                    if (true) ** continue;
lbl69:
                    // 2 sources

                    var7_5 = (var5_4 | var8_3) ^ 545652422;
                    ** GOTO lbl59
                    break;
                }
            }
            block35: while (true) {
                switch (var7_5) {
                    case -1726534794: {
                        this.a = null;
                        var7_5 = (var5_4 | var8_3) ^ -2065043381;
                        continue block35;
                    }
                    case -266987745: {
                        cfr_temp_0 = 1053649091;
                        ** continue;
                    }
                    case 1648497590: {
                        var6_7 ^= var7_5 ^ 0x36399936;
                        ** break;
                    }
                    case 1189037556: {
                        this.c.put(this.a.a, var4_6);
                        ** continue;
                    }
                    case 2014316976: {
                        var6_7 ^= var7_5 ^ 1971933403;
                        ** GOTO lbl114
                    }
                    case 1700134892: {
                        var7_5 = (var5_4 | var8_3) ^ -647470022;
                        continue block35;
                    }
                    case -859146697: {
                        var4_6.a = this.h;
                        var7_5 = (var5_4 | var8_3) ^ 930320808;
                        break;
                    }
                    case -1897207397: {
                        var6_7 ^= var7_5 ^ -1180589480;
                        ** continue;
                    }
                    case 955059566: {
                        if (this.c.size() > lu.xS((var6_7 | var7_5 ^ -1676362539) ^ (var7_5 ^ 170940474), (var5_4 | var7_5 ^ -1676362539) ^ ((var6_7 | var7_5 ^ -1676362539) ^ (var7_5 ^ -21724516)))) {
                            ** break;
                        }
                        ** GOTO lbl112
                    }
lbl105:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ 808685516;
                    break;
                    case 1723190638: {
                        var6_7 ^= var7_5 ^ -631785819;
                        continue block28;
                    }
                    case 630300097: {
                        this.xQ(var1_1);
lbl112:
                        // 2 sources

                        var7_5 = (var5_4 | var8_3) ^ -1706281835;
                        break;
                    }
lbl114:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ -1005259627;
                    break;
lbl116:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ -1716779497;
                    continue block35;
                    case -880121773: {
                        var6_7 ^= var7_5 ^ 346870673;
                        var7_5 = (var5_4 | var8_3) ^ -1171866609;
                    }
                }
lbl121:
                // 7 sources

            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private int xt(class_310 class_3102) {
        int n2 = N & 0x5B2B5629 ^ 0x1FE73B28;
        int n3 = 0;
        int n4 = (n2 | 0x5B2B5629) ^ 0x451F948C;
        n3 = (n2 | 0x5B2B5629) ^ 0x598D2515;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 107108924: {
                    n3 = (n2 | 0x5B2B5629) ^ 0x1693A5A5;
                    continue block5;
                }
                case 35222396: {
                    int n5 = (int)Math.ceil((double)((Float)this.i.getValue()).floatValue() / 16.0) + 1;
                    n4 ^= 0xFD897D7;
                    return Math.max(2, Math.min(class_3102.field_1690.method_38521(), n5));
                }
                case 1232919180: 
            }
            n4 ^= n3 ^ 0x74B2FC67;
            n3 = (n2 | 0x5B2B5629) ^ 0x5DF60C55;
        }
    }

    /*
     * Exception decompiling
     */
    private boolean xu(class_310 var1_1, int var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [37[UNCONDITIONALDOLOOP]], but top level block is 38[UNCONDITIONALDOLOOP]
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
    private void xv(int var1_1) {
        block71: {
            block75: {
                block73: {
                    block72: {
                        block70: {
                            block74: {
                                var5_2 = 45431891;
                                var2_3 = lu.N & 45431891 ^ -1216163080;
                                var4_4 = 0;
                                ** GOTO lbl109
lbl5:
                                // 1 sources

                                while (true) {
                                    this.a = new short[var1_1];
                                    break block70;
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 889237382;
                                    ** GOTO lbl49
                                    break;
                                }
lbl11:
                                // 1 sources

                                block42: while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 1600472312;
                                    ** GOTO lbl49
lbl14:
                                    // 1 sources

                                    while (true) {
                                        this.d = new boolean[var1_1];
                                        ** GOTO lbl80
                                        break;
                                    }
lbl17:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= var4_4 ^ 146915156;
                                        break block71;
                                        break;
                                    }
lbl20:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ 435282903;
                                        ** GOTO lbl49
lbl23:
                                        // 1 sources

                                        while (true) {
                                            this.a = new boolean[var1_1];
                                            ** continue;
                                            break;
                                        }
                                        break;
                                    }
lbl26:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ 843406382;
                                        ** GOTO lbl49
lbl29:
                                        // 2 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ 2068920059;
                                            ** GOTO lbl49
lbl32:
                                            // 1 sources

                                            while (true) {
                                                continue;
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
                                                var4_4 = (var2_3 | var5_2) ^ -957774270;
                                                ** GOTO lbl49
lbl39:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ 1192828860;
                                                    ** GOTO lbl49
lbl42:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_5 ^= var4_4 ^ 1612505460;
                                                        break block72;
                                                        break;
                                                    }
lbl45:
                                                    // 1 sources

                                                    return;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
lbl47:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ -1515493041;
lbl49:
                                        // 27 sources

                                        block56: while (true) {
                                            switch (var4_4) lbl-1000:
                                            // 8 sources

                                            {
                                                while (true) {
                                                    default: {
                                                        continue block56;
                                                    }
                                                    break;
                                                }
                                                case -1053459436: {
                                                    ** continue;
                                                }
                                                case 1938586547: {
                                                    ** GOTO lbl29
                                                }
                                                case -681909400: {
                                                    ** continue;
                                                }
                                                case -2101915267: {
                                                    ** continue;
                                                }
                                                case 1872483513: {
                                                    break block42;
                                                }
                                                case -1533569435: {
                                                    ** continue;
                                                }
                                                case 75404576: {
                                                    ** continue;
                                                }
                                                case -284331068: {
                                                    ** continue;
                                                }
                                                case 1828402047: {
                                                    ** continue;
                                                }
                                                case -776470927: {
                                                    ** continue;
                                                }
lbl74:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ -1278645285;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case 834963735: {
                                                    this.b.clear();
                                                    break block73;
                                                }
lbl80:
                                                // 1 sources

                                                var4_4 = (var2_3 | var5_2) ^ 1882224644;
                                                ** GOTO lbl-1000
                                                case -1790689510: {
                                                    var3_5 ^= var4_4 ^ 919611606;
                                                    ** continue;
                                                }
                                                case -1454821411: {
                                                    var3_5 ^= var4_4 ^ -1232701091;
                                                    break block74;
                                                }
lbl88:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ 1488620863;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
lbl91:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ 520016166;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case -1371136724: {
                                                    this.c = new int[var1_1];
                                                    ** continue;
                                                }
                                                case -815302204: {
                                                    if (this.a.length == var1_1) break block70;
                                                    break;
                                                }
lbl100:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ -936591169;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
lbl103:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ 353982919;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case -388843005: {
                                                    var3_5 ^= var4_4 ^ -1407926052;
                                                    ** continue;
                                                }
lbl109:
                                                // 1 sources

                                                var3_5 = (var2_3 | var5_2) ^ -997614926;
                                                break;
lbl111:
                                                // 2 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ -668194238;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                var4_4 = (var2_3 | var5_2) ^ 1711276170;
                                ** GOTO lbl49
lbl116:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 1423697993;
                                    ** GOTO lbl49
                                    break;
                                }
                                {
                                    case -2047696171: {
                                        var3_5 ^= var4_4 ^ -1755507046;
                                        break;
                                    }
                                    case -1565612228: {
                                        var3_5 ^= var4_4 ^ 1223771018;
                                        ** GOTO lbl111
                                    }
                                    case 390703846: {
                                        var3_5 ^= var4_4 ^ 1228244909;
                                        ** continue;
                                    }
                                    case 1058449104: {
                                        ** continue;
                                    }
                                }
lbl130:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 2117028857;
                                    ** GOTO lbl49
                                    break;
                                }
lbl133:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 2061091282;
                                    ** GOTO lbl49
                                    break;
                                }
                                this.c = new boolean[var1_1];
                                var4_4 = (var2_3 | var5_2) ^ -1564567658;
                                ** GOTO lbl49
lbl139:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ -174847250;
                                    ** GOTO lbl49
                                    break;
                                }
                                {
                                    case -912739070: {
                                        var3_5 ^= var4_4 ^ -293602256;
                                        ** continue;
                                    }
                                    case 303863732: {
                                        var3_5 ^= var4_4 ^ -1272686204;
                                        ** continue;
                                    }
                                    case 352938349: {
                                        var3_5 ^= var4_4 ^ -1025612874;
                                        break block75;
                                    }
                                }
                                var4_4 = (var2_3 | var5_2) ^ -615723644;
                                ** GOTO lbl49
                                {
                                    case -479455566: {
                                        var3_5 ^= var4_4 ^ 1419828120;
                                        ** continue;
                                    }
                                    case -1750726517: {
                                        var3_5 ^= var4_4 ^ -660334556;
                                        ** continue;
                                    }
                                }
                                var4_4 = (var2_3 | var5_2) ^ -2002692053;
                                ** GOTO lbl49
                                this.g = new boolean[var1_1];
                                var4_4 = (var2_3 | var5_2) ^ 538048112;
                                ** GOTO lbl49
                            }
                            var4_4 = (var2_3 | var5_2) ^ 2026932031;
                            ** GOTO lbl49
                        }
                        var4_4 = (var2_3 | var5_2) ^ 586400225;
                        ** GOTO lbl49
                    }
                    var4_4 = (var2_3 | var5_2) ^ 320891038;
                    ** GOTO lbl49
                    {
                        case 2140880452: {
                            var3_5 ^= var4_4 ^ -2023676523;
                            ** continue;
                        }
                        case -256974521: {
                            this.D = 0;
                            ** continue;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ -2039253012;
                    ** GOTO lbl49
                    {
                        case -947419393: {
                            var3_5 ^= var4_4 ^ -531293138;
                            break;
                        }
                        case 497052407: {
                            this.b = new boolean[var1_1];
                            ** continue;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ -1890436106;
                    ** GOTO lbl49
lbl189:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 1988264687;
                        ** GOTO lbl49
                        break;
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ -1002732216;
                ** GOTO lbl49
            }
            var4_4 = (var2_3 | var5_2) ^ 1626152339;
            ** GOTO lbl49
            {
                case -857290752: {
                    switch (var3_5) {
                        case -279799383: {
                            ** continue;
                        }
                        case 1996790028: {
                            ** continue;
                        }
                        ** default:
lbl205:
                        // 1 sources

                        ** continue;
                    }
                }
            }
        }
        var4_4 = (var2_3 | var5_2) ^ -1441295348;
        ** GOTO lbl49
lbl209:
        // 1 sources

        while (true) {
            var4_4 = (var2_3 | var5_2) ^ -1593945059;
            ** continue;
            break;
        }
        {
            case 954582285: {
                this.a = new class_2248[var1_1];
                ** continue;
            }
            case 1109652501: {
                this.f = new boolean[var1_1];
                ** continue;
            }
            case 1902016697: {
                var3_5 ^= var4_4 ^ 1871803814;
                ** continue;
            }
            ** case -848412887:
        }
lbl222:
        // 1 sources

        this.e = new boolean[var1_1];
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void xw(mc var1_1, int var2_2) {
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
    private void xx(gp var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [18[CASE]], but top level block is 29[SWITCH]
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
    private void xy(class_310 var1_1, gp var2_2, class_2586 var3_3) {
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
    private int xz(class_2680 var1_1) {
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
    private static int xA(class_2680 var0) {
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
    private boolean xB(class_2680 var1_1) {
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
    private boolean xC(mc var1_1) {
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
    private int xD(int var1_1, class_2248 var2_2, int var3_3) {
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
    private static boolean xE(class_2680 var0) {
        block35: {
            block36: {
                block34: {
                    block37: {
                        break block37;
lbl1:
                        // 1 sources

                        return v0;
lbl3:
                        // 1 sources

                        while (true) {
                            v0 = true;
lbl5:
                            // 2 sources

                            while (true) {
                                var2_4 ^= 401654298;
                                ** continue;
                                break;
                            }
                            break;
                        }
lbl8:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 1189141689;
                            break block34;
                            break;
                        }
                    }
                    var4_1 = 632147657;
                    var1_2 = lu.N & 632147657 ^ 1491561086;
                    var3_3 = 0;
                    var2_4 = (var1_2 | var4_1) ^ 770281078;
                    var3_3 = (var1_2 | var4_1) ^ -633486311;
                    break block35;
lbl18:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 256024031;
                        break block35;
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 1279695846;
                        break block36;
                        break;
                    }
lbl24:
                    // 1 sources

                    return true;
                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 416895195;
                        break block35;
lbl29:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1823432782;
                            break block35;
                            break;
                        }
lbl32:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 2101367914;
                            ** continue;
                            break;
                        }
                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -2094072978;
                            break block35;
                            break;
                        }
                        break;
                    }
lbl38:
                    // 2 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1091705293;
                        break block35;
                        break;
                    }
lbl41:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1887900294;
                        break block35;
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -567234897;
                break block35;
lbl47:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ 352399232;
                    ** GOTO lbl91
                    break;
                }
lbl50:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -725692486;
                    break block35;
                    break;
                }
lbl53:
                // 1 sources

                while (true) {
                    if (var0.method_11654((class_2769)class_2281.field_10770) == class_2745.field_12571) ** continue;
                    ** continue;
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 87245548;
        }
lbl59:
        // 2 sources

        block31: while (true) {
            switch (var3_3) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block31;
                    }
                    break;
                }
                case 2027727891: {
                    ** continue;
                }
                case -1479398682: {
                    break block31;
                }
                case 224984185: {
                    ** continue;
                }
                case -1918994556: {
                    ** continue;
                }
                case -1454300859: {
                    ** continue;
                }
                case -289443507: {
                    ** continue;
                }
                case -1023276852: {
                    ** continue;
                }
                case 1698086436: {
                    ** continue;
                }
                case 1985160276: {
                    ** continue;
                }
lbl82:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 2102553362;
                    ** GOTO lbl-1000
                    break;
                }
                case 12420589: {
                    v0 = false;
                    ** continue;
                }
                case 1923969824: {
                    if (var0.method_28498((class_2769)class_2281.field_10770)) ** continue;
                    ** GOTO lbl38
                }
lbl91:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 0xBBCCAAB;
                ** continue;
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ -260990597;
        ** while (true)
        {
            case -20900463: {
                var2_4 ^= var3_3 ^ 467054386;
                ** continue;
            }
            ** case -1545650096:
        }
lbl99:
        // 1 sources

        if (var0.method_26204() instanceof class_2281) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean xF(class_2248 var0) {
        block18: {
            var4_1 = -1241024661;
            var1_2 = lu.N & -1241024661 ^ -1384456212;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -1908177210;
            var3_3 = (var1_2 | var4_1) ^ 315078882;
            if (true) ** GOTO lbl9
            block15: while (true) {
                var3_3 = (var1_2 | var4_1) ^ -2069817353;
lbl9:
                // 2 sources

                block16: while (true) {
                    switch (var3_3) {
                        case 546938601: {
                            v0 = true;
                            break block18;
                        }
                        case 57685061: {
                            if (var0 instanceof class_2315) ** GOTO lbl31
                            ** GOTO lbl39
                        }
                        case 1004464152: {
                            var3_3 = (var1_2 | var4_1) ^ -1139815510;
                            continue block16;
                        }
                        case -205215187: {
                            var2_4 ^= var3_3 ^ 462004971;
                            var3_3 = (var1_2 | var4_1) ^ -1612291834;
                            continue block16;
                        }
                        case -1380432115: {
                            ** GOTO lbl41
                        }
                        case 1376988597: {
                            var2_4 ^= var3_3 ^ 591140040;
                            ** GOTO lbl34
                        }
                        case -1719724979: {
                            if (!(var0 instanceof class_2336)) continue block15;
lbl31:
                            // 2 sources

                            var3_3 = (var1_2 | var4_1) ^ 69912672;
                        }
                        default: {
                            continue block16;
                        }
lbl34:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 637594530;
                        continue block16;
                        case -1152043121: {
                            var2_4 ^= var3_3 ^ 1394097993;
                            ** GOTO lbl43
                        }
lbl39:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 1287345602;
                        continue block16;
lbl41:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ -311635366;
                        continue block16;
lbl43:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ -2072680136;
                        continue block16;
                        case 990549719: 
                    }
                    break;
                }
                break;
            }
            v0 = false;
        }
        block17: while (true) {
            switch (var2_4) {
                case -1807919225: {
                    var2_4 ^= -619387017;
                    continue block17;
                }
                case 1926692568: {
                    var2_4 ^= -1200851476;
                    return v0;
                }
            }
            break;
        }
        var2_4 ^= -1505346286;
        return v0;
    }

    /*
     * Exception decompiling
     */
    private void xG(gp var1_1, class_638 var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8) {
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
    private void xH(gp var1_1, int var2_2, int var3_3) {
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
    private void xI(int var1_1, int var2_2) {
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
    private cn xJ(class_2680 var1_1) {
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
    private void xK(gp var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7) {
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
    private static void xL(gp var0, gZ var1_1) {
        block67: {
            var10_2 = -623150650;
            var7_3 = lu.N & -623150650 ^ -373777689;
            var9_4 = 0;
            var8_10 = (var7_3 | var10_2) ^ 910884471;
            var9_4 = (var7_3 | var10_2) ^ 1305893653;
            ** GOTO lbl57
lbl7:
            // 1 sources

            while (true) {
                var8_10 ^= -1518896201;
                var5_8 = Math.max(0, Math.min(var3_6.g, var1_1.g) - Math.max(var3_6.d, var1_1.d) + 1);
                var8_10 ^= -1431472922;
                var6_9 = var4_7 * var5_8;
                var9_4 = (var7_3 | var10_2) ^ 1684865414;
                block50: while (true) {
                    switch (var9_4) {
                        case -363128228: {
                            var8_10 ^= var9_4 ^ -996446654;
                            ** break;
                        }
                        case 1676584549: {
                            ** GOTO lbl120
                        }
lbl20:
                        // 1 sources

                        var9_4 = (var7_3 | var10_2) ^ 1151966596;
                        continue block50;
                        case 5556787: {
                            var8_10 ^= var9_4 ^ 1148855294;
                            ** break;
                        }
                        case 707049253: {
                            if (!((double)var6_9 >= (double)Math.min(var3_6.f, var1_1.f) * 0.7)) ** GOTO lbl71
                            ** GOTO lbl46
                        }
                        case 432012174: {
                            var8_10 ^= var9_4 ^ 1561540916;
                            var9_4 = (var7_3 | var10_2) ^ -1716266275;
                            ** GOTO lbl44
                        }
                        case 2070552260: {
                            var9_4 = var1_1.b <= var3_6.b ? (var7_3 | var10_2) ^ -498859927 : (var7_3 | var10_2) ^ 295756219;
                            ** GOTO lbl44
                        }
lbl35:
                        // 1 sources

                        var9_4 = (var7_3 | var10_2) ^ -1743430270;
                        continue block50;
                        case -1085118877: {
                            var0.a.remove(var2_5);
                            ** GOTO lbl48
                        }
                        case -444026069: {
                            var8_10 ^= var9_4 ^ 556935298;
                            var9_4 = (var7_3 | var10_2) ^ -2137922269;
                        }
lbl44:
                        // 4 sources

                        default: {
                            continue block50;
                        }
lbl46:
                        // 1 sources

                        var9_4 = (var7_3 | var10_2) ^ 510871756;
                        continue block50;
lbl48:
                        // 1 sources

                        var9_4 = (var7_3 | var10_2) ^ -72404524;
                        continue block50;
                        case -1617495455: {
                            var8_10 ^= var9_4 ^ -593659851;
                            var9_4 = (var7_3 | var10_2) ^ -773894974;
                            continue block50;
                        }
lbl54:
                        // 1 sources

                        while (true) {
                            var9_4 = (var7_3 | var10_2) ^ 1552688643;
                            break block67;
                            break;
                        }
lbl57:
                        // 1 sources

                        while (true) {
                            switch (var9_4) {
                                case -1238523662: {
                                    var9_4 = (var7_3 | var10_2) ^ 1971806453;
                                }
                                default: {
                                    break;
                                }
                                case -2027663207: {
                                    var2_5 = 0;
                                    ** GOTO lbl191
                                }
                                case -1904436462: {
                                    var8_10 ^= var9_4 ^ 1611844074;
                                    var9_4 = (var7_3 | var10_2) ^ 2095033214;
                                    break;
                                }
                            }
                        }
lbl71:
                        // 2 sources

                        while (true) {
                            var9_4 = (var7_3 | var10_2) ^ -770113971;
                            ** GOTO lbl194
                            break;
                        }
                        case 1648894266: 
                    }
                    break;
                }
                break;
            }
            return;
lbl76:
            // 1 sources

            while (true) {
                var9_4 = (var7_3 | var10_2) ^ 1443152684;
                ** GOTO lbl194
                break;
            }
        }
        block55: while (true) {
            switch (var9_4) {
                case -978794082: {
                    ** GOTO lbl136
                }
                case 10110961: {
                    var8_10 ^= var9_4 ^ -1088175329;
                    ** break;
                }
                case -1975886369: {
                    var8_10 ^= var9_4 ^ 1469123316;
                    ** GOTO lbl138
                }
                case -1527373570: {
                    var8_10 ^= var9_4 ^ 303321897;
                    ** GOTO lbl161
                }
                case 625498104: {
                    if (var0.a.size() <= lu.xS((var8_10 | var9_4 ^ -7131586) ^ (var9_4 ^ 1385547000), (var7_3 | var9_4 ^ -7131586) ^ ((var8_10 | var9_4 ^ -7131586) ^ (var9_4 ^ 1769360572)))) ** GOTO lbl140
                    ** GOTO lbl163
                }
                case -980288024: {
                    ** break;
                }
lbl98:
                // 1 sources

                var9_4 = (var7_3 | var10_2) ^ 1500826820;
                ** GOTO lbl152
                case 130349144: {
                    var0.a.add(var2_5, var1_1);
                    ** GOTO lbl142
                }
                case 1262864071: {
                    var0.a.remove(lu.xS((var8_10 | var9_4 ^ -1851867391) ^ (var9_4 ^ 1016616388), (var7_3 | var9_4 ^ -1851867391) ^ ((var8_10 | var9_4 ^ -1851867391) ^ (var9_4 ^ 3242187))));
                    ** GOTO lbl140
                }
                case -383622936: {
                    if (var2_5 >= var0.a.size()) ** GOTO lbl120
                    ** GOTO lbl144
                }
                case 297916600: {
                    var8_10 ^= var9_4 ^ 523605445;
                    ** GOTO lbl122
                }
                case -1485316636: {
                    var8_10 ^= var9_4 ^ 295022131;
                    ** GOTO lbl124
                }
lbl116:
                // 1 sources

                var8_10 ^= 250891645;
                if (((gZ)var0.a.get((int)var2_5)).a >= var1_1.a) {
                    ** continue;
                }
                ** GOTO lbl173
lbl120:
                // 2 sources

                var9_4 = (var7_3 | var10_2) ^ -77480938;
                continue block55;
lbl122:
                // 1 sources

                var9_4 = (var7_3 | var10_2) ^ 1047135759;
                continue block55;
lbl124:
                // 1 sources

                var9_4 = (var7_3 | var10_2) ^ 852528050;
                continue block55;
                case -1567672541: {
                    var2_5 = 0;
                    ** GOTO lbl167
                }
                case -159345798: {
                    var8_10 ^= var9_4 ^ -1245917168;
                    var9_4 = (var7_3 | var10_2) ^ -558650337;
                    continue block55;
                }
                case -476965394: {
                    var8_10 ^= var9_4 ^ -14499532;
                    ** GOTO lbl169
                }
lbl136:
                // 1 sources

                var9_4 = (var7_3 | var10_2) ^ -1329709792;
                continue block55;
lbl138:
                // 1 sources

                var9_4 = (var7_3 | var10_2) ^ -62979137;
                continue block55;
lbl140:
                // 2 sources

                var9_4 = (var7_3 | var10_2) ^ 438522597;
                continue block55;
lbl142:
                // 1 sources

                var9_4 = (var7_3 | var10_2) ^ 226191517;
                continue block55;
lbl144:
                // 1 sources

                var9_4 = (var7_3 | var10_2) ^ 1808518521;
                continue block55;
                case -1875888482: {
                    var8_10 ^= var9_4 ^ -230626726;
                    ** GOTO lbl165
                }
                case -505894654: {
                    var8_10 ^= var9_4 ^ -469601671;
                    var9_4 = (var7_3 | var10_2) ^ 904220029;
                }
lbl152:
                // 3 sources

                default: {
                    continue block55;
                }
                case -919900075: {
                    ++var2_5;
                    ** GOTO lbl167
                }
                case 772473118: {
                    var3_6 = (gZ)var0.a.get(var2_5);
                    var9_4 = (var7_3 | var10_2) ^ 1827423863;
                    ** GOTO lbl194
                }
lbl161:
                // 1 sources

                var9_4 = (var7_3 | var10_2) ^ -1815374334;
                continue block55;
lbl163:
                // 1 sources

                var9_4 = (var7_3 | var10_2) ^ 1045639801;
                continue block55;
lbl165:
                // 1 sources

                var9_4 = (var7_3 | var10_2) ^ -705627399;
                continue block55;
lbl167:
                // 2 sources

                var9_4 = (var7_3 | var10_2) ^ 1594743577;
                continue block55;
lbl169:
                // 1 sources

                var9_4 = (var7_3 | var10_2) ^ 316250895;
                continue block55;
                case 1748004325: {
                    if (var2_5 < var0.a.size()) ** GOTO lbl175
lbl173:
                    // 2 sources

                    var9_4 = (var7_3 | var10_2) ^ 1908516408;
                    continue block55;
lbl175:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ -365288609;
                    continue block55;
                }
lbl177:
                // 1 sources

                while (true) {
                    var9_4 = (var7_3 | var10_2) ^ -1441598732;
                    ** GOTO lbl194
                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ 1113736696;
                        ** GOTO lbl194
lbl183:
                        // 1 sources

                        while (true) {
                            var8_10 ^= -830511418;
                            ** continue;
                            break;
                        }
lbl186:
                        // 1 sources

                        while (true) {
                            var8_10 ^= -1244120003;
                            var4_7 = Math.max(0, Math.min(var3_6.b, var1_1.b) - Math.max(var3_6.a, var1_1.a) + 1);
                            var8_10 ^= -1535530865;
                            ** continue;
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl191:
                // 2 sources

                while (true) {
                    var9_4 = (var7_3 | var10_2) ^ 409595401;
                    continue block55;
                    break;
                }
lbl194:
                // 5 sources

                block61: while (true) {
                    switch (var9_4) {
                        default: {
                            continue block61;
                        }
                        case 318315159: {
                            var8_10 ^= 701747370;
                            ** continue;
                        }
                        case -1439350684: {
                            if (Math.abs(var3_6.c - var1_1.c) <= 1) ** continue;
                            ** continue;
                        }
                        case 702743978: {
                            var8_10 ^= var9_4 ^ -1693985014;
                            ** continue;
                        }
                        case -1760051824: {
                            var8_10 ^= var9_4 ^ 543350853;
                            break;
                        }
                        case -1375782709: {
                            ++var2_5;
                            ** continue;
                        }
                        case 1374226707: {
                            var8_10 ^= var9_4 ^ 716738168;
                            var9_4 = (var7_3 | var10_2) ^ -658707630;
                            continue block61;
                        }
                        case -1181106657: {
                            var8_10 ^= var9_4 ^ 2014615215;
                            var9_4 = (var7_3 | var10_2) ^ -385687184;
                            continue block61;
                        }
                        case 591859893: {
                            ** continue;
                        }
                    }
                    var9_4 = (var7_3 | var10_2) ^ 1372502915;
                }
                case -836847974: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void xM(int var1_1, cr var2_2) {
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
    private static String xN(class_2636 var0, class_638 var1_1, class_2338 var2_2, boolean var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [47[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String xO(class_8961 var0) {
        var10_1 = 1195638861;
        var7_2 = lu.N & 1195638861 ^ -1488232975;
        var9_3 = 0;
        var8_4 = (var7_2 | var10_1) ^ 788989106;
        var9_3 = (var7_2 | var10_1) ^ 1908040224;
        ** GOTO lbl101
lbl-1000:
        // 1 sources

        {
            block57: {
                block56: {
                    block55: {
                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ -1292345977;
                            break block55;
                            break;
                        }
                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ -1208690817;
                            break block56;
                            break;
                        }
lbl13:
                        // 2 sources

                        while (true) {
                            var8_4 ^= -1087975957;
                            var4_9 = v0;
                            var9_3 = (var7_2 | var10_1) ^ -967515696;
                            break block57;
                            break;
                        }
                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ 1396224266;
                            break block57;
                            break;
                        }
lbl21:
                        // 2 sources

                        while (true) {
                            block58: {
                                var8_4 ^= 730614541;
                                var5_10 = v1;
                                var9_3 = (var7_2 | var10_1) ^ 1752285297;
                                break block58;
                                while (true) {
                                    var9_3 = (var7_2 | var10_1) ^ 1143767707;
                                    break block58;
                                    break;
                                }
lbl29:
                                // 2 sources

                                while (true) {
                                    block59: {
                                        var8_4 ^= 629398615;
                                        var6_11 = v2;
                                        var9_3 = (var7_2 | var10_1) ^ 836593089;
                                        break block59;
lbl34:
                                        // 2 sources

                                        while (true) {
                                            var9_3 = (var7_2 | var10_1) ^ 2126522886;
                                            break block59;
                                            break;
                                        }
lbl-1000:
                                        // 1 sources

                                        {
                                            while (true) {
                                                var8_4 ^= 712013310;
                                                return lu.an;
                                            }
                                        }
                                    }
                                    block50: while (true) {
                                        switch (var9_3) {
                                            default: {
                                                continue block50;
                                            }
                                            case -695060420: {
                                                var8_4 ^= var9_3 ^ 308717490;
                                                var9_3 = (var7_2 | var10_1) ^ -1352974086;
                                                continue block50;
                                            }
                                            case 1209277703: {
                                                if (var6_11 == null) ** GOTO lbl34
                                                var9_3 = (var7_2 | var10_1) ^ 879053784;
                                                continue block50;
                                            }
                                            case -752216539: {
                                                var9_3 = (var7_2 | var10_1) ^ -1246780053;
                                                continue block50;
                                            }
                                            case 1390475414: {
                                                if (class_7923.field_41177.method_10250(var6_11)) ** break;
                                                ** continue;
                                                var9_3 = (var7_2 | var10_1) ^ 541800685;
                                                continue block50;
                                            }
                                            case -956013296: {
                                                var8_4 ^= var9_3 ^ -614730045;
                                                var9_3 = (var7_2 | var10_1) ^ -1217886495;
                                                continue block50;
                                            }
                                            case 1344789276: {
                                                var8_4 ^= -1292917043;
                                                return ((class_1299)class_7923.field_41177.method_63535(var6_11)).method_5897().getString() + " Trial Spawner";
                                            }
                                            case -1718650885: {
                                                var8_4 ^= var9_3 ^ -2069105753;
                                                var9_3 = (var7_2 | var10_1) ^ -1877697599;
                                                continue block50;
                                            }
                                            case 2002503228: 
                                        }
                                        break;
                                    }
                                    ** continue;
                                    break;
                                }
                            }
                            block51: while (true) {
                                switch (var9_3) {
                                    default: {
                                        continue block51;
                                    }
                                    case -1891721844: {
                                        var8_4 ^= var9_3 ^ 792118607;
                                        var9_3 = (var7_2 | var10_1) ^ 1659659795;
                                        continue block51;
                                    }
                                    case -2052899858: {
                                        if (var5_10 != null) ** continue;
                                        var9_3 = (var7_2 | var10_1) ^ -909515012;
                                        continue block51;
                                    }
                                    case 780581633: {
                                        var8_4 ^= var9_3 ^ 1919275561;
                                        var9_3 = (var7_2 | var10_1) ^ 1087869582;
                                        continue block51;
                                    }
                                    case -1483157645: {
                                        v2 = null;
                                        ** GOTO lbl29
                                    }
                                    case -1553735834: {
                                        var8_4 ^= var9_3 ^ -8341938;
                                        var9_3 = (var7_2 | var10_1) ^ -98511448;
                                        continue block51;
                                    }
                                    case 493848661: 
                                }
                                break;
                            }
                            v2 = class_2960.method_12829((String)var5_10);
                            ** continue;
                            break;
                        }
                    }
                    block52: while (true) {
                        switch (var9_3) {
                            default: {
                                continue block52;
                            }
                            case -1762312227: {
                                ** continue;
                            }
                            case 1438056570: {
                                var8_4 ^= var9_3 ^ 463123557;
                                var9_3 = (var7_2 | var10_1) ^ -1218279130;
                                continue block52;
                            }
                            case 1345180891: 
                        }
                        break;
                    }
                    var1_5 = var0.method_55150();
                    var8_4 ^= 231282179;
                    var2_7 = var1_5.method_55174().method_55194(var0.method_55151());
                    var8_4 ^= 1185974744;
                    var3_8 = var2_7.method_10562(lu.au).orElse(null);
                    var9_3 = (var7_2 | var10_1) ^ 688459576;
                }
                block53: while (true) {
                    switch (var9_3) {
                        default: {
                            continue block53;
                        }
                        case -834252091: {
                            var8_4 ^= var9_3 ^ -1184983583;
                            var9_3 = (var7_2 | var10_1) ^ -82318250;
                            continue block53;
                        }
                        case 475574699: {
                            if (var3_8 != null) ** continue;
                            var9_3 = (var7_2 | var10_1) ^ 1074233854;
                            continue block53;
                        }
                        case -1488397309: {
                            var8_4 ^= var9_3 ^ 1535357473;
                            var9_3 = (var7_2 | var10_1) ^ 1175948925;
                            continue block53;
                        }
                        case -1588014208: {
                            v0 = null;
                            ** GOTO lbl13
                        }
                        case 1354467970: {
                            var8_4 ^= var9_3 ^ -1401887584;
                            var9_3 = (var7_2 | var10_1) ^ 1129751184;
                            continue block53;
                        }
                        case -1541800083: 
                    }
                    break;
                }
                v0 = var3_8.method_10562(lu.aa).orElse(null);
                ** continue;
            }
            block54: while (true) {
                switch (var9_3) {
                    default: {
                        continue block54;
                    }
                    case 555465773: {
                        var8_4 ^= var9_3 ^ -308143946;
                        var9_3 = (var7_2 | var10_1) ^ 313041561;
                        continue block54;
                    }
                    case -169345180: {
                        if (var4_9 != null) ** continue;
                        var9_3 = (var7_2 | var10_1) ^ 783102987;
                        continue block54;
                    }
                    case -907908618: {
                        var8_4 ^= var9_3 ^ -828739144;
                        var9_3 = (var7_2 | var10_1) ^ -478159941;
                        continue block54;
                    }
                    case 70288966: {
                        v1 = null;
                        ** GOTO lbl21
                    }
                    case -1267208969: {
                        var8_4 ^= var9_3 ^ -1290799943;
                        var9_3 = (var7_2 | var10_1) ^ -991818339;
                        continue block54;
                    }
                    case 598560864: 
                }
                break;
            }
            v1 = var4_9.method_10558(lu.Z).orElse(null);
            ** continue;
        }
    }

    /*
     * Exception decompiling
     */
    private void xP(class_310 var1_1) {
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
    private void xQ(class_310 var1_1) {
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
    private void xR(class_310 var1_1) {
        block60: {
            block58: {
                block59: {
                    var8_2 = 369861503;
                    var5_3 = lu.N & 369861503 ^ 2052375460;
                    var7_4 = 0;
                    ** GOTO lbl140
lbl5:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ -887579036;
                        ** GOTO lbl83
                        break;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        var4_8 = 0;
                        ** GOTO lbl73
                        break;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ 1718713430;
                        break block58;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ -815023777;
                        ** GOTO lbl83
lbl17:
                        // 1 sources

                        while (true) {
                            this.yn(var1_1);
                            ** GOTO lbl112
                            break;
                        }
                        break;
                    }
lbl20:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ -1080697576;
                        break block58;
                        break;
                    }
lbl23:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ -2113897707;
                        ** GOTO lbl83
lbl26:
                        // 1 sources

                        while (true) {
                            var6_5 ^= var7_4 ^ -1775260044;
                            ** GOTO lbl136
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            this.ym(var1_1);
                            ** GOTO lbl71
                            break;
                        }
lbl32:
                        // 1 sources

                        while (true) {
                            var7_4 = (var5_3 | var8_2) ^ 1479371537;
                            ** GOTO lbl83
                            break;
                        }
                        break;
                    }
lbl35:
                    // 1 sources

                    while (true) {
                        var6_5 ^= var7_4 ^ -925651296;
                        break block59;
                        break;
                    }
lbl38:
                    // 1 sources

                    while (true) {
                        var6_5 ^= var7_4 ^ -580698661;
                        ** GOTO lbl102
                        break;
                    }
lbl41:
                    // 1 sources

                    while (true) {
                        var6_5 ^= var7_4 ^ -92803825;
                        ** GOTO lbl114
                        break;
                    }
lbl44:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ 1388488267;
                        ** GOTO lbl83
                        break;
                    }
lbl47:
                    // 1 sources

                    while (true) {
                        var6_5 ^= 1387549667;
                        break block60;
                        break;
                    }
lbl50:
                    // 1 sources

                    while (true) {
                        var6_5 ^= var7_4 ^ -1783535583;
                        ** GOTO lbl107
                        break;
                    }
                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ 1807141513;
                        break block58;
                        break;
                    }
                }
                var7_4 = (var5_3 | var8_2) ^ 1308176097;
                break block58;
lbl59:
                // 1 sources

                while (true) {
                    var6_5 ^= var7_4 ^ -203379489;
                    ** GOTO lbl134
                    break;
                }
            }
            block47: while (true) {
                switch (var7_4) lbl-1000:
                // 5 sources

                {
                    default: {
                        continue block47;
                    }
                    case -311831775: {
                        ** continue;
                    }
                    case 187754008: {
                        ** continue;
                    }
lbl71:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ -2020158808;
                    ** GOTO lbl83
lbl73:
                    // 2 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ 1970210279;
                        ** GOTO lbl-1000
                        break;
                    }
lbl76:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ -918806028;
                        ** GOTO lbl83
                        break;
                    }
                    case 866569502: {
                        return;
                    }
lbl81:
                    // 1 sources

                    block51: while (true) {
                        var7_4 = (var5_3 | var8_2) ^ -1750803926;
lbl83:
                        // 11 sources

                        block52: while (true) {
                            switch (var7_4) lbl-1000:
                            // 7 sources

                            {
                                while (true) {
                                    default: {
                                        continue block52;
                                    }
                                    break;
                                }
                                case -1717504900: {
                                    ** continue;
                                }
                                case -104255145: {
                                    ** continue;
                                }
                                case -551966847: {
                                    ** continue;
                                }
                                case -1253605989: {
                                    ** continue;
                                }
                                case -369411627: {
                                    ** continue;
                                }
                                case -1321968992: {
                                    ** continue;
                                }
                                case 1277906088: {
                                    ** continue;
                                }
lbl102:
                                // 1 sources

                                var7_4 = (var5_3 | var8_2) ^ -2120171520;
                                ** GOTO lbl-1000
lbl104:
                                // 1 sources

                                while (true) {
                                    var7_4 = (var5_3 | var8_2) ^ -1589230466;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl107:
                                // 1 sources

                                var7_4 = (var5_3 | var8_2) ^ -369217771;
                                ** GOTO lbl-1000
                                case -1751003926: {
                                    this.a.clear();
                                    ** continue;
                                }
lbl112:
                                // 1 sources

                                var7_4 = (var5_3 | var8_2) ^ 449371180;
                                ** GOTO lbl-1000
lbl114:
                                // 1 sources

                                var7_4 = (var5_3 | var8_2) ^ -531868585;
                                ** GOTO lbl-1000
                                case -1218199029: {
                                    var6_5 ^= var7_4 ^ 877594122;
                                    ** GOTO lbl165
                                }
                                case -60843798: {
                                    var6_5 ^= var7_4 ^ 866785257;
                                    ** continue;
                                }
lbl122:
                                // 1 sources

                                while (true) {
                                    var7_4 = (var5_3 | var8_2) ^ -1708457988;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case 1687633875: {
                                    var6_5 ^= var7_4 ^ 143020259;
                                    break block51;
                                }
                                case 748504500: {
                                    var6_5 ^= var7_4 ^ -871687046;
                                    ** continue;
                                }
                                case -56321: {
                                    if (var4_8 >= var2_6) ** continue;
                                    ** continue;
                                }
lbl134:
                                // 1 sources

                                var7_4 = (var5_3 | var8_2) ^ 130564359;
                                ** GOTO lbl-1000
lbl136:
                                // 1 sources

                                var7_4 = (var5_3 | var8_2) ^ -402712701;
                                ** continue;
                            }
                            break;
                        }
                        break;
                    }
                    var7_4 = (var5_3 | var8_2) ^ 1546567524;
                    ** GOTO lbl83
lbl140:
                    // 1 sources

                    var6_5 = (var5_3 | var8_2) ^ 1309619151;
                    ** continue;
                    {
                        case 645040366: {
                            this.xT(var1_1);
                            ** continue;
                        }
                    }
                    case 405708713: {
                        var3_7[var4_8] = (j)this.a.get(var2_6 - var4_8 - 1);
                        ++var4_8;
                        ** continue;
                    }
                    {
                        case 2039980792: {
                            this.yc(var1_1);
                            ** continue;
                        }
                        case 577854619: {
                            this.a.sort(Comparator.comparingDouble((ToDoubleFunction<j>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, yw(z.r.j ), (Lz/r/j;)D)()));
                            ** continue;
                        }
                    }
                    case -1043710233: {
                        this.a = var3_7;
                        var7_4 = (var5_3 | var8_2) ^ -1825165090;
                        ** GOTO lbl-1000
                    }
lbl159:
                    // 1 sources

                    while (true) {
                        var6_5 ^= -2094891359;
                        ** continue;
                        break;
                    }
lbl162:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ 846507863;
                        ** GOTO lbl83
                        break;
                    }
lbl165:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ 1248956856;
                    ** continue;
                    {
                        case 875459143: {
                            var2_6 = Math.min(((Float)this.a.getValue()).intValue(), this.a.size());
                            ** continue;
                        }
                    }
                    case 367602038: {
                        var6_5 ^= var7_4 ^ 1846492320;
                        ** continue;
                    }
                    case -462087165: 
                }
                break;
            }
            var6_5 ^= var7_4 ^ 841402304;
            ** while (true)
            {
                ** case -1642874968:
            }
lbl177:
            // 1 sources

            this.xX(var1_1);
            ** while (true)
        }
        var3_7 = new j[var2_6];
        ** while (true)
    }

    private static int xS(int n2, int n3) {
        int n4 = 2043158235;
        int n5 = 1383253869;
        int n6 = f[n2 ^ ((n5 | n4) ^ 0xF6DC3540)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0x7BFA8754;
        n6 ^= (n5 | n4) ^ 0x7BFAE2DF;
        n6 += (n5 | n4) ^ 0x7BFA9130;
        n6 -= (n5 | n4) ^ 0x7BFA0008;
        n6 -= (n5 | n4) ^ 0x7BFACFAF;
        n6 ^= (n5 | n4) ^ 0x7BFA612A;
        return n6 += (n5 | n4) ^ 0x7BFA5D13;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void xT(class_310 var1_1) {
        block80: {
            block81: {
                block79: {
                    var10_2 = -1540702175;
                    var7_3 = lu.N & -1540702175 ^ 1035916553;
                    var9_4 = 0;
                    var8_10 = (var7_3 | var10_2) ^ 1294269469;
                    var9_4 = (var7_3 | var10_2) ^ -530419450;
                    break block81;
                    {
                        var9_4 = (var7_3 | var10_2) ^ -380248383;
lbl8:
                        // 2 sources

                        while (true) {
                            switch (var9_4) {
                                case -9249204: {
                                    ** GOTO lbl223
                                }
                                case 1003324724: {
                                    var8_10 ^= var9_4 ^ 245415677;
                                    continue block47;
                                }
                                case 1424690152: {
                                    this.yo(var1_1, lu.xS((var8_10 | var9_4 ^ -255734839) ^ (var9_4 ^ 926285903), (var7_3 | var9_4 ^ -255734839) ^ ((var8_10 | var9_4 ^ -255734839) ^ (var9_4 ^ 2126261192))), (double)var5_8.c + 0.5, (double)var5_8.a + 1.6, (double)var5_8.b + 0.5, lu.q, (String)var6_9);
                                    var9_4 = (var7_3 | var10_2) ^ 1496233286;
                                }
                                default: {
                                    break;
                                }
                                case -460300177: {
                                    var8_10 ^= var9_4 ^ -869307829;
                                    ** break;
lbl23:
                                    // 1 sources

                                    var9_4 = (var7_3 | var10_2) ^ 1120668517;
                                    break;
                                }
                            }
                            continue;
                            break;
                        }
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ 498412621;
                        break block79;
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -816385319;
                        break block80;
                        break;
                    }
lbl32:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -78939349;
                        break block81;
                        break;
                    }
lbl35:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ 6085357;
                        break block79;
                        break;
                    }
lbl38:
                    // 2 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -805233717;
                        ** GOTO lbl147
                        break;
                    }
lbl41:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -1490992669;
                        break block80;
lbl44:
                        // 1 sources

                        while (true) {
                            var9_4 = (var7_3 | var10_2) ^ -1246281507;
                            break block80;
                            while (true) {
                                var9_4 = (var7_3 | var10_2) ^ 882352428;
                                break block80;
                                break;
                            }
                            break;
                        }
                        while (true) {
                            var9_4 = (var7_3 | var10_2) ^ 1045849943;
                            break block80;
                            break;
                        }
                        break;
                    }
                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -588438509;
                        break block81;
                        break;
                    }
                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -1709722138;
                        break block80;
                        break;
                    }
lbl59:
                    // 1 sources

                    while (true) {
                        var9_4 = (var7_3 | var10_2) ^ -504353979;
                        break block80;
                        break;
                    }
                }
lbl63:
                // 2 sources

                block61: while (true) {
                    switch (var9_4) {
                        case -1609827996: {
                            var5_8 = (d)var4_7.next();
                            ** break;
                        }
                        case -1948464: {
                            var8_10 ^= var9_4 ^ 599481384;
                            var9_4 = (var7_3 | var10_2) ^ -1104972548;
                            continue block61;
                        }
                        case -1109258300: {
                            if (!var4_7.hasNext()) ** GOTO lbl86
                            var9_4 = (var7_3 | var10_2) ^ -1642155917;
                        }
                        default: {
                            continue block61;
                        }
                        {
                        }
lbl78:
                        // 1 sources

                        var9_4 = (var7_3 | var10_2) ^ -2096814650;
                        break block80;
                        case 597714266: {
                            var8_10 ^= var9_4 ^ 101231861;
                            ** continue;
                        }
                        case 584903568: {
                            var8_10 ^= var9_4 ^ 796650251;
                            ** continue;
                        }
lbl86:
                        // 1 sources

                        var9_4 = (var7_3 | var10_2) ^ 1113362937;
                        continue block61;
                        case 60662229: 
                    }
                    ** GOTO lbl38
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    var8_10 ^= 387555492;
                    var4_7 = var3_6.d.iterator();
                    ** GOTO lbl223
                    break;
                }
lbl94:
                // 1 sources

                while (true) {
                    var9_4 = (var7_3 | var10_2) ^ 1723376976;
                    ** GOTO lbl147
                    break;
                }
lbl97:
                // 1 sources

                while (true) {
                    var9_4 = (var7_3 | var10_2) ^ -850864668;
                    break block81;
                    break;
                }
lbl100:
                // 1 sources

                while (true) {
                    var9_4 = (var7_3 | var10_2) ^ -2130854679;
                    break block80;
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    var9_4 = (var7_3 | var10_2) ^ -338204072;
                    break block81;
                    break;
                }
lbl106:
                // 1 sources

                while (true) {
                    var9_4 = (var7_3 | var10_2) ^ -2075777726;
                    ** GOTO lbl147
                    break;
                }
lbl109:
                // 1 sources

                while (true) {
                    var6_9 = v0;
                    var9_4 = (var7_3 | var10_2) ^ -2039263203;
                    ** continue;
                    break;
                }
lbl113:
                // 1 sources

                while (true) {
                    var9_4 = (var7_3 | var10_2) ^ 2009394082;
                    break block80;
                    break;
                }
lbl116:
                // 1 sources

                while (true) {
                    var9_4 = (var7_3 | var10_2) ^ 416199448;
                    break block80;
                    break;
                }
            }
            block71: while (true) {
                switch (var9_4) {
                    default: {
                        continue block71;
                    }
                    case -111955882: {
                        if (((Boolean)this.b.getValue()).booleanValue()) ** continue;
                        ** continue;
                    }
                    case 1632891194: {
                        var8_10 ^= var9_4 ^ 112869950;
                        ** continue;
                    }
                    case 1449770865: {
                        var2_5 = this.c.values().iterator();
                        ** continue;
                    }
                    case 327593276: {
                        var8_10 ^= var9_4 ^ 860308517;
                        ** break;
                    }
                    case 1895170253: {
                        var8_10 ^= var9_4 ^ 1944579343;
                        ** continue;
                    }
                    case 1574741039: {
                        var9_4 = (var7_3 | var10_2) ^ -1372030955;
                        continue block71;
                    }
lbl142:
                    // 1 sources

                    var9_4 = (var7_3 | var10_2) ^ 1156408703;
                    continue block71;
lbl144:
                    // 2 sources

                    while (true) {
                        var8_10 ^= 145466895;
                        ** continue;
                        break;
                    }
lbl147:
                    // 3 sources

                    block73: while (true) {
                        switch (var9_4) {
                            default: {
                                continue block73;
                            }
                            case 972615787: {
                                if (var2_5.hasNext()) {
                                    ** break;
                                }
                                ** GOTO lbl170
                            }
                            case -1079890565: {
                                var8_10 ^= var9_4 ^ -1212419895;
                                ** continue;
                            }
                            case 1841286882: {
                                var8_10 ^= var9_4 ^ -179747632;
                                ** continue;
                            }
                            case -440757599: {
                                var3_6 = (gp)var2_5.next();
                                ** continue;
                            }
lbl164:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 1733623787;
                            continue block73;
                            case -622187838: {
                                var8_10 ^= var9_4 ^ -2063919049;
                                var9_4 = (var7_3 | var10_2) ^ 1476675464;
                                continue block73;
                            }
lbl170:
                            // 1 sources

                            var9_4 = (var7_3 | var10_2) ^ 35453010;
                            continue block73;
                            case -620334983: 
                        }
                        break;
                    }
                    return;
                    case 1190505986: 
                }
                break;
            }
            return;
        }
        block74: while (true) {
            block82: {
                switch (var9_4) {
                    default: {
                        continue block74;
                    }
                    case -1519360463: {
                        var8_10 ^= var9_4 ^ 1959210573;
                        break block82;
                    }
                    case -897958261: {
                        if (!this.yl((double)var5_8.c + 0.5, (double)var5_8.a + 1.6, (double)var5_8.b + 0.5, 2.0)) ** continue;
                        ** continue;
                    }
                    case 1927817200: {
                        if (!((Boolean)this.g.getValue()).booleanValue()) ** continue;
                        var9_4 = (var7_3 | var10_2) ^ -1666794372;
                        continue block74;
                    }
                    case 134845940: {
                        v0 = "";
                        ** GOTO lbl144
                    }
                    case 774793243: {
                        break;
                    }
                    case 1052504303: {
                        var8_10 ^= var9_4 ^ -956075609;
                        var9_4 = (var7_3 | var10_2) ^ 1513290487;
                        continue block74;
                    }
                    case 1027828160: {
                        var8_10 ^= var9_4 ^ 985488591;
                        ** continue;
                    }
                    case -2081901954: {
                        var8_10 ^= var9_4 ^ 1436667661;
                        ** continue;
                    }
                    case 665411791: {
                        var8_10 ^= var9_4 ^ 120772221;
                        ** continue;
                    }
                    case 446665930: {
                        v0 = var5_8.a + " \u2022 centered setup";
                        ** continue;
                    }
                    case -1993772027: {
                        var8_10 ^= var9_4 ^ -1154129830;
                        ** continue;
                    }
                    case -410243106: {
                        if (!((float)var5_8.a > ((Float)this.e.getValue()).floatValue())) ** continue;
                        ** continue;
                    }
                    case 555247957: {
                        var8_10 ^= var9_4 ^ 25419751;
                        ** continue;
                    }
                    case 1548680812: {
                        break;
                    }
                }
lbl223:
                // 4 sources

                var9_4 = (var7_3 | var10_2) ^ -1620951367;
                ** continue;
            }
            var9_4 = (var7_3 | var10_2) ^ -1819230926;
        }
    }

    /*
     * Exception decompiling
     */
    private void xU(class_310 var1_1, gp var2_2, ik var3_3, int var4_4, int var5_5) {
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
    private static boolean xV(class_638 var0, int var1_1, int var2_2, int var3_3) {
        block37: {
            var9_4 = -952624810;
            var6_5 = lu.N & -952624810 ^ 1378749413;
            var8_6 = 0;
            var7_9 = (var6_5 | var9_4) ^ -1536810341;
            var8_6 = (var6_5 | var9_4) ^ 810132069;
            if (true) ** GOTO lbl27
lbl7:
            // 1 sources

            while (true) {
                var8_6 = (var6_5 | var9_4) ^ 391401031;
                ** GOTO lbl73
lbl10:
                // 2 sources

                while (true) {
                    var8_6 = (var6_5 | var9_4) ^ 967681232;
                    break block37;
lbl13:
                    // 1 sources

                    while (true) {
                        var8_6 = (var6_5 | var9_4) ^ -944889471;
                        break block37;
                        break;
                    }
                    break;
                }
                break;
            }
lbl16:
            // 1 sources

            while (true) {
                var8_6 = (var6_5 | var9_4) ^ 1107629845;
                ** GOTO lbl73
                break;
            }
            block29: while (true) {
                switch (var8_6) {
                    case 923081912: {
                        var4_7 = var1_1 - var3_3 >> 4;
                        ** GOTO lbl10
                    }
                    case -1955408208: {
                        var7_9 ^= var8_6 ^ 217713834;
                        var8_6 = (var6_5 | var9_4) ^ -533002417;
                    }
lbl27:
                    // 3 sources

                    default: {
                        continue block29;
                    }
                    case -411584110: 
                }
                var8_6 = (var6_5 | var9_4) ^ 1548537159;
            }
lbl32:
            // 2 sources

            while (true) {
                var8_6 = (var6_5 | var9_4) ^ 1143710084;
                ** GOTO lbl73
                break;
            }
        }
        block31: while (true) {
            switch (var8_6) {
                case -1018604871: {
                    if (var4_7 <= var1_1 + var3_3 >> 4) {
                        ** break;
                    }
                    ** GOTO lbl61
                }
                case -725116595: {
                    var7_9 ^= var8_6 ^ 2094090616;
                    ** continue;
                }
                case 277887606: {
                    var5_8 = var2_2 - var3_3 >> 4;
                    ** GOTO lbl32
                }
                case -292307161: {
                    var7_9 ^= var8_6 ^ 1101228703;
                    ** GOTO lbl59
                }
                case -837115063: {
                    var7_9 ^= var8_6 ^ 211334874;
                    ** break;
lbl54:
                    // 1 sources

                    var8_6 = (var6_5 | var9_4) ^ 1225575931;
                }
                default: {
                    continue block31;
                }
lbl57:
                // 1 sources

                var8_6 = (var6_5 | var9_4) ^ 66683578;
                continue block31;
lbl59:
                // 1 sources

                var8_6 = (var6_5 | var9_4) ^ 343361870;
                continue block31;
lbl61:
                // 1 sources

                var8_6 = (var6_5 | var9_4) ^ 421836990;
                continue block31;
                case -1640835572: 
            }
            break;
        }
        return true;
lbl65:
        // 1 sources

        while (true) {
            var8_6 = (var6_5 | var9_4) ^ -1263849919;
            ** GOTO lbl73
lbl68:
            // 1 sources

            while (true) {
                var8_6 = (var6_5 | var9_4) ^ 186534446;
                if (true) ** GOTO lbl73
                break;
            }
            break;
        }
        block34: while (true) {
            var8_6 = (var6_5 | var9_4) ^ 612710659;
lbl73:
            // 6 sources

            block35: while (true) {
                switch (var8_6) {
                    default: {
                        continue block35;
                    }
                    case 1256796201: {
                        ++var5_8;
                        ** continue;
                    }
                    case -1259046592: {
                        var7_9 ^= var8_6 ^ 254271780;
                        var8_6 = (var6_5 | var9_4) ^ -1646842914;
                        continue block35;
                    }
                    case -205839628: {
                        var7_9 ^= var8_6 ^ 279957302;
                        ** continue;
                    }
                    case 317173470: {
                        var7_9 ^= var8_6 ^ 450557834;
                        ** continue;
                    }
                    case -601861671: {
                        ++var4_7;
                        ** continue;
                    }
                    case -1827292557: {
                        var7_9 ^= var8_6 ^ 1999065660;
                        ** continue;
                    }
                    case -1749801500: {
                        if (var0.method_2935().method_21730(var4_7, var5_8) != null) ** GOTO lbl106
                        ** GOTO lbl108
                    }
                    case -1066773072: {
                        if (var5_8 > var2_2 + var3_3 >> 4) continue block34;
                        ** continue;
                    }
                    case -1791292190: {
                        var7_9 ^= var8_6 ^ -891650871;
                        var8_6 = (var6_5 | var9_4) ^ 1082801683;
                        continue block35;
                    }
lbl106:
                    // 1 sources

                    var8_6 = (var6_5 | var9_4) ^ 1674207927;
                    continue block35;
lbl108:
                    // 1 sources

                    var8_6 = (var6_5 | var9_4) ^ -975588055;
                    continue block35;
                    case 1670722998: 
                }
                break;
            }
            break;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    private hw xW(class_638 var1_1, int var2_2, int var3_3, int var4_4) {
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
    private void xX(class_310 var1_1) {
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
    private static boolean xY(gp var0, cv var1_1, gp var2_2, cv var3_3, gp var4_4, cv var5_5) {
        var17_6 = 1948759655;
        var14_7 = lu.N & 1948759655 ^ -1408966424;
        var16_8 = 0;
        var15_11 = (var14_7 | var17_6) ^ 1157797321;
        var16_8 = (var14_7 | var17_6) ^ -828016959;
        if (true) ** GOTO lbl46
        block25: while (true) {
            switch (var16_8) {
                case 909915367: {
                    var15_11 ^= var16_8 ^ -1907497615;
                    var16_8 = (var14_7 | var17_6) ^ -174014710;
                    ** break;
                }
                case 1022914726: {
                    var10_12 = var0.centerX(var1_1) - var4_4.centerX(var5_5);
                    ** GOTO lbl28
                }
                case -190147526: {
                    var15_11 ^= var16_8 ^ -258980090;
                    var16_8 = (var14_7 | var17_6) ^ -1059092919;
                    ** break;
                }
                case -781031074: {
                    var15_11 ^= var16_8 ^ 1549350518;
                    var16_8 = (var14_7 | var17_6) ^ 1184565219;
                }
lbl23:
                // 4 sources

                default: {
                    continue block25;
                }
                case -2015737410: {
                    var15_11 ^= var16_8 ^ 1343832382;
                    ** GOTO lbl37
                }
lbl28:
                // 1 sources

                var15_11 ^= -2043305509;
                var12_13 = var0.centerZ(var1_1) - var4_4.centerZ(var5_5);
                var16_8 = (var14_7 | var17_6) ^ -37322949;
                ** GOTO lbl72
                case -274246569: {
                    if (!(var6_9 * var6_9 + var8_10 * var8_10 > 676.0)) {
                        var16_8 = (var14_7 | var17_6) ^ 760586161;
                        continue block25;
                    }
                    ** GOTO lbl42
                }
lbl37:
                // 1 sources

                var16_8 = (var14_7 | var17_6) ^ 327197368;
                continue block25;
                case -1162022644: {
                    var15_11 ^= -1926537432;
                    if (!(Math.abs(var2_2.centerY(var3_3) - var4_4.centerY(var5_5)) > 18.0)) ** GOTO lbl44
lbl42:
                    // 2 sources

                    var16_8 = (var14_7 | var17_6) ^ -904150520;
                    continue block25;
lbl44:
                    // 1 sources

                    var16_8 = (var14_7 | var17_6) ^ 143483605;
                    continue block25;
                }
lbl46:
                // 1 sources

                block26: while (true) {
                    switch (var16_8) {
                        case 1076844329: {
                            var15_11 ^= var16_8 ^ 1062791253;
                            var16_8 = (var14_7 | var17_6) ^ 729916192;
                            ** break;
                        }
                        case 847413294: {
                            var16_8 = (var14_7 | var17_6) ^ -1140284986;
                        }
lbl54:
                        // 3 sources

                        default: {
                            continue block26;
                        }
                        case -676964913: 
                    }
                    break;
                }
                var6_9 = var2_2.centerX(var3_3) - var4_4.centerX(var5_5);
                var15_11 ^= -37247030;
                var8_10 = var2_2.centerZ(var3_3) - var4_4.centerZ(var5_5);
                var16_8 = (var14_7 | var17_6) ^ 2080227153;
                continue block25;
lbl62:
                // 1 sources

                while (true) {
                    if (!(Math.abs(var0.centerY(var1_1) - var4_4.centerY(var5_5)) <= 26.0)) break;
                    var16_8 = (var14_7 | var17_6) ^ 928646908;
                    ** if (true) goto lbl69
                    break;
                }
lbl-1000:
                // 1 sources

                {
                    block28: while (true) {
                        var16_8 = (var14_7 | var17_6) ^ 80727941;
                        ** GOTO lbl72
                        break;
                    }
                }
lbl69:
                // 1 sources

                ** GOTO lbl72
                {
                    block29: while (true) {
                        var16_8 = (var14_7 | var17_6) ^ 1709538928;
lbl72:
                        // 4 sources

                        block30: while (true) {
                            switch (var16_8) {
                                default: {
                                    continue block30;
                                }
                                case 1638262100: {
                                    v0 = true;
                                    ** GOTO lbl104
                                }
                                case -1348225595: {
                                    ** break;
                                }
                                case -118998678: {
                                    var15_11 ^= var16_8 ^ -1692814807;
                                    ** GOTO lbl106
                                }
                                case -1715304289: {
                                    var15_11 ^= var16_8 ^ 1381104214;
                                    ** GOTO lbl93
                                }
                                case -880938989: {
                                    var15_11 ^= var16_8 ^ 15631066;
                                    var16_8 = (var14_7 | var17_6) ^ -1652419653;
                                    continue block30;
                                }
lbl91:
                                // 1 sources

                                var15_11 ^= 1676774211;
                                ** continue;
lbl93:
                                // 1 sources

                                var16_8 = (var14_7 | var17_6) ^ -2041799581;
                                continue block30;
                                case 31558100: {
                                    var15_11 ^= var16_8 ^ 137104271;
                                    var16_8 = (var14_7 | var17_6) ^ -2052377445;
                                    continue block30;
                                }
                                case 2039267956: {
                                    if (!(var10_12 * var10_12 + var12_13 * var12_13 <= 1764.0)) continue block29;
                                    continue block28;
                                }
                                case 2053859980: 
                            }
                            v0 = false;
lbl104:
                            // 2 sources

                            var15_11 ^= -1540901014;
                            return v0;
lbl106:
                            // 1 sources

                            var16_8 = (var14_7 | var17_6) ^ 1401176874;
                        }
                        break;
                    }
                }
                case 159861221: 
            }
            break;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    private void xZ(class_310 var1_1, mb var2_2) {
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
    private String ya(mb var1_1, int var2_2) {
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
    private static void yb(StringBuilder var0, String var1_1) {
        var5_2 = -246105660;
        var2_3 = lu.N & -246105660 ^ 1163924137;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 643704506;
        var4_4 = (var2_3 | var5_2) ^ 1215060999;
        block11: while (true) {
            switch (var4_4) {
                case -494766026: {
                    var4_4 = (var2_3 | var5_2) ^ -1086866478;
                    continue block11;
                }
                case -1218382677: {
                    var3_5 ^= var4_4 ^ 1163106407;
                    var4_4 = (var2_3 | var5_2) ^ 571102155;
                    continue block11;
                }
                case -406945362: {
                    if (var0.length() > 0) {
                        var4_4 = (var2_3 | var5_2) ^ 402047963;
                        continue block11;
                    }
                    ** GOTO lbl34
                }
                case 682137307: {
                    var0.append(var1_1);
                    var4_4 = (var2_3 | var5_2) ^ 1108627270;
                    continue block11;
                }
                case -1122441238: {
                    ** GOTO lbl37
                }
                case 651545490: {
                    var3_5 ^= var4_4 ^ -834550168;
                    var4_4 = (var2_3 | var5_2) ^ 315243075;
                    continue block11;
                }
                case 1245904959: {
                    var0.append(lu.ab);
lbl34:
                    // 2 sources

                    var4_4 = (var2_3 | var5_2) ^ 1602268270;
                }
                default: {
                    continue block11;
                }
lbl37:
                // 1 sources

                var4_4 = (var2_3 | var5_2) ^ -744394625;
                continue block11;
                case -679548890: {
                    return;
                }
                case -1426843773: 
            }
            var3_5 ^= var4_4 ^ 1580414214;
            var4_4 = (var2_3 | var5_2) ^ -572773066;
        }
    }

    /*
     * Exception decompiling
     */
    private void yc(class_310 var1_1) {
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
    private static int yd(int[] var0, int var1_1) {
        block34: {
            block33: {
                break block34;
lbl1:
                // 1 sources

                block25: while (true) {
                    var6_4 = (var4_3 | var7_2) ^ -1339892340;
                    if (true) ** GOTO lbl6
                    block26: while (true) {
                        var6_4 = (var4_3 | var7_2) ^ 1113808809;
lbl6:
                        // 2 sources

                        block27: while (true) {
                            switch (var6_4) {
                                case -1123164138: {
                                    if (var0[var2_5] == var2_5) continue block25;
                                    var6_4 = (var4_3 | var7_2) ^ 1484441668;
                                    continue block27;
                                }
                                case -66550261: {
                                    var2_5 = var0[var2_5];
                                    break block33;
                                }
                                case 1330405939: {
                                    var5_7 ^= var6_4 ^ -1292178341;
                                    var6_4 = (var4_3 | var7_2) ^ 491874259;
                                    continue block27;
                                }
                                case -1491830789: {
                                    var5_7 ^= var6_4 ^ 2085097911;
                                    ** break;
                                }
                                case -1940923998: {
                                    var5_7 ^= var6_4 ^ -1187558728;
                                    ** break;
                                }
                                case -813927562: {
                                    var3_6 = var0[var1_1];
                                    var6_4 = (var4_3 | var7_2) ^ -200054227;
                                    ** GOTO lbl74
                                }
                                case -499132308: {
                                    if (var0[var1_1] == var1_1) ** GOTO lbl35
                                    var6_4 = (var4_3 | var7_2) ^ 928360169;
                                    ** GOTO lbl45
                                }
lbl33:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ 57031092;
                                ** GOTO lbl45
lbl35:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ 1931568669;
                                ** GOTO lbl45
lbl37:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ -1150822328;
                                continue block27;
                                case 1987511745: {
                                    var5_7 ^= var6_4 ^ -1389665395;
                                    continue block26;
                                }
                                case -935650986: {
                                    var5_7 ^= var6_4 ^ -1968527472;
                                    var6_4 = (var4_3 | var7_2) ^ 806538441;
                                }
lbl45:
                                // 6 sources

                                default: {
                                    continue block27;
                                }
                                case 1141467127: 
                            }
                            break;
                        }
                        break;
                    }
                    return var2_5;
                }
                {
                    var6_4 = (var4_3 | var7_2) ^ -837950424;
                    block30: while (true) {
                        switch (var6_4) {
                            case 1621555038: {
                                ** continue;
                            }
                            case 2005524976: {
                                var1_1 = var3_6;
                                ** break;
                            }
                            case 828595095: {
                                var5_7 ^= var6_4 ^ -645458127;
                                var6_4 = (var4_3 | var7_2) ^ -1998102961;
                                continue block30;
                            }
                            case 192796050: {
                                var5_7 ^= var6_4 ^ -748218352;
                                ** GOTO lbl69
                            }
lbl64:
                            // 1 sources

                            var6_4 = (var4_3 | var7_2) ^ 1578416840;
                            break;
                            case 998573417: {
                                var0[var1_1] = var2_5;
                                continue block29;
                            }
lbl69:
                            // 1 sources

                            var6_4 = (var4_3 | var7_2) ^ -991184170;
                            continue block30;
                            case -1585838729: {
                                var5_7 ^= var6_4 ^ 782480637;
                                var6_4 = (var4_3 | var7_2) ^ -1614264095;
                            }
                        }
lbl74:
                        // 4 sources

                    }
                }
            }
lbl76:
            // 2 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ -1994802562;
                ** GOTO lbl45
                break;
            }
        }
        var7_2 = -580251249;
        var4_3 = lu.N & -580251249 ^ -414269648;
        var6_4 = 0;
        var5_7 = (var4_3 | var7_2) ^ 2057165141;
        var6_4 = (var4_3 | var7_2) ^ -1945776541;
        block32: while (true) {
            switch (var6_4) {
                case -1329569621: {
                    var2_5 = var1_1;
                    ** continue;
                }
                case 1936421340: {
                    var6_4 = (var4_3 | var7_2) ^ -634686318;
                    continue block32;
                }
                case 625330989: {
                    var5_7 ^= var6_4 ^ -912032717;
                    var6_4 = (var4_3 | var7_2) ^ 1336860436;
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    private static void ye(int[] var0, byte[] var1_1, int var2_2, int var3_3) {
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
    private static double yf(class_638 var0, ah var1_1, int var2_2) {
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
    private static boolean yg(class_638 var0, class_2338 var1_1) {
        block24: {
            break block24;
lbl1:
            // 2 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ 535425805;
                if (true) ** GOTO lbl18
                break;
            }
            block20: while (true) {
                block25: {
                    var5_4 = (var3_3 | var6_2) ^ -1082348379;
                    break block25;
lbl7:
                    // 2 sources

                    while (true) {
                        switch (var4_6) {
                            default: {
                                var4_6 ^= 524814970;
                                return v0;
                            }
                            case 1332975671: {
                                var4_6 ^= -1941236248;
                                return v0;
                            }
                            case -334385739: 
                        }
                        var4_6 ^= 84876298;
                        continue;
                        break;
                    }
                }
lbl19:
                // 2 sources

                block22: while (true) {
                    switch (var5_4) {
                        default: {
                            continue block22;
                        }
                        case -1347568278: {
                            v0 = false;
                            ** GOTO lbl7
                        }
                        case 1216265389: {
                            var4_6 ^= var5_4 ^ -685045568;
                            var5_4 = (var3_3 | var6_2) ^ -1921890361;
                            continue block22;
                        }
                        case 1455799613: {
                            if (!var2_5.method_26227().method_15769()) ** GOTO lbl1
                            var5_4 = (var3_3 | var6_2) ^ -1911540598;
                            continue block22;
                        }
                        case 1691047519: {
                            var4_6 ^= var5_4 ^ 560269239;
                            var5_4 = (var3_3 | var6_2) ^ 1887409022;
                            continue block22;
                        }
                        case -1412929148: {
                            v0 = true;
                            ** continue;
                        }
                        case -1000470025: {
                            var4_6 ^= var5_4 ^ -2114955233;
                            var5_4 = (var3_3 | var6_2) ^ 1947879312;
                            continue block22;
                        }
                        case 1432724127: {
                            var4_6 ^= -711617589;
                            if (var2_5.method_26234((class_1922)class_2682.field_12294, class_2338.field_10980)) ** break;
                            ** continue;
                            continue block20;
                        }
                        case 1437060720: 
                    }
                    var4_6 ^= var5_4 ^ -2144182853;
                    var5_4 = (var3_3 | var6_2) ^ -1898817435;
                    continue;
                    break;
                }
                break;
            }
        }
        var6_2 = -651790240;
        var3_3 = lu.N & -651790240 ^ 1402458842;
        var5_4 = 0;
        var4_6 = (var3_3 | var6_2) ^ -1959003128;
        var5_4 = (var3_3 | var6_2) ^ -993138684;
        block23: while (true) {
            switch (var5_4) {
                default: {
                    continue block23;
                }
                case 528093950: {
                    var5_4 = (var3_3 | var6_2) ^ -992196606;
                    continue block23;
                }
                case 527151864: {
                    var4_6 ^= var5_4 ^ 289001452;
                    var5_4 = (var3_3 | var6_2) ^ 137153258;
                    continue block23;
                }
                case -744804336: 
            }
            break;
        }
        var2_5 = var0.method_8320(var1_1);
        var5_4 = (var3_3 | var6_2) ^ -1815525801;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean yh(gZ var0, gZ var1_1) {
        block41: {
            block42: {
                break block42;
                while (true) {
                    var10_4 = (var8_3 | var11_2) ^ 1275824692;
                    break block41;
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var3_7 = Math.max(0, Math.max(var0.d - var1_1.g - 1, var1_1.d - var0.g - 1));
                    var9_5 ^= 1365374378;
                    var4_8 = Math.min(var0.b, var1_1.b) - Math.max(var0.a, var1_1.a) + 1;
                    var9_5 ^= 1941139424;
                    var5_9 = Math.min(var0.g, var1_1.g) - Math.max(var0.d, var1_1.d) + 1;
                    var9_5 ^= -971311799;
                    var6_10 = Math.max(1, Math.min(var0.b - var0.a + 1, var1_1.b - var1_1.a + 1) / 2);
                    var9_5 ^= -456929592;
                    var7_11 = Math.max(1, Math.min(var0.g - var0.d + 1, var1_1.g - var1_1.d + 1) / 2);
                    var10_4 = (var8_3 | var11_2) ^ 1020991381;
                    break block41;
                    break;
                }
            }
            var11_2 = -1608866710;
            var8_3 = lu.N & -1608866710 ^ -695567224;
            var10_4 = 0;
            var9_5 = (var8_3 | var11_2) ^ 1885748587;
            var10_4 = (var8_3 | var11_2) ^ -1928534059;
            block33: while (true) {
                switch (var10_4) {
                    case -427657489: {
                        var2_6 = Math.max(0, Math.max(var0.a - var1_1.b - 1, var1_1.a - var0.b - 1));
                        ** break;
                    }
                    case -574310193: {
                        var9_5 ^= var10_4 ^ 969453935;
                        var10_4 = (var8_3 | var11_2) ^ 544344055;
                        continue block33;
                    }
                    case 1767056380: {
                        if (Math.abs(var0.e - var1_1.e) <= 2) ** GOTO lbl52
                        ** GOTO lbl73
                    }
                    case -566557441: {
                        var10_4 = (var8_3 | var11_2) ^ 2049487933;
                        continue block33;
                    }
lbl37:
                    // 1 sources

                    var9_5 ^= -703539771;
                    ** continue;
                    case 387057295: {
                        ** break;
                    }
                    case -319375555: {
                        var9_5 ^= var10_4 ^ 225051801;
                        ** GOTO lbl54
                    }
lbl44:
                    // 1 sources

                    var10_4 = (var8_3 | var11_2) ^ -1614160106;
                    continue block33;
                    case 2073434943: {
                        var10_4 = (var8_3 | var11_2) ^ -928380351;
                        continue block33;
                    }
                    case 1043396267: {
                        var9_5 ^= var10_4 ^ 949553625;
                        ** GOTO lbl76
                    }
lbl52:
                    // 1 sources

                    var10_4 = (var8_3 | var11_2) ^ 1037827751;
                    continue block33;
lbl54:
                    // 1 sources

                    var10_4 = (var8_3 | var11_2) ^ 270043653;
                    continue block33;
                    case 1486436667: {
                        var9_5 ^= var10_4 ^ 81217795;
                        var10_4 = (var8_3 | var11_2) ^ 1169434207;
                        ** GOTO lbl67
                    }
                    case -1934473001: {
                        if (var0.d >> 4 != var1_1.d >> 4) ** GOTO lbl66
                        var10_4 = (var8_3 | var11_2) ^ -1375484463;
                        ** GOTO lbl67
                    }
                    case -1132255527: {
                        if (var0.a >> 4 == var1_1.a >> 4) ** GOTO lbl69
lbl66:
                        // 2 sources

                        var10_4 = (var8_3 | var11_2) ^ 443304919;
                    }
lbl67:
                    // 5 sources

                    default: {
                        continue block33;
                    }
lbl69:
                    // 1 sources

                    var10_4 = (var8_3 | var11_2) ^ 681703445;
                    continue block33;
                    case -893236379: {
                        if (Math.abs(var0.c - var1_1.c) <= 1) ** GOTO lbl82
lbl73:
                        // 2 sources

                        var10_4 = (var8_3 | var11_2) ^ 727598117;
                        continue block33;
                    }
lbl76:
                    // 1 sources

                    var10_4 = (var8_3 | var11_2) ^ 1012447119;
                    continue block33;
                    case -884932019: {
                        var9_5 ^= var10_4 ^ 754457745;
                        var10_4 = (var8_3 | var11_2) ^ 1243208243;
                        ** GOTO lbl67
                    }
lbl82:
                    // 1 sources

                    var10_4 = (var8_3 | var11_2) ^ -511116699;
                    continue block33;
lbl84:
                    // 2 sources

                    while (true) {
                        var9_5 ^= 1941693107;
                        return v0;
                    }
lbl87:
                    // 1 sources

                    while (true) {
                        var10_4 = (var8_3 | var11_2) ^ -1037348997;
                        break block41;
                        break;
                    }
                    case -1288774987: {
                        return false;
                    }
lbl92:
                    // 2 sources

                    while (true) {
                        var10_4 = (var8_3 | var11_2) ^ -62256323;
                        break block41;
                        break;
                    }
                    case -689374435: 
                }
                break;
            }
            return false;
        }
        block38: while (true) {
            switch (var10_4) {
                case 884061073: {
                    v0 = false;
                    ** GOTO lbl84
                }
                case -823868814: {
                    var10_4 = (var8_3 | var11_2) ^ -1231073385;
                    continue block38;
                }
                case -901649537: {
                    var9_5 ^= var10_4 ^ 751592205;
                    var10_4 = (var8_3 | var11_2) ^ -413410869;
                    continue block38;
                }
                case -1435108231: {
                    v0 = true;
                    ** continue;
                }
                case -1826310489: {
                    if (var5_9 >= var7_11) ** GOTO lbl126
                    ** GOTO lbl136
                }
                case 1074115453: {
                    if (var3_7 != 0) ** GOTO lbl92
                    var10_4 = (var8_3 | var11_2) ^ -1677046105;
                    continue block38;
                }
                case -1164871970: {
                    var10_4 = (var8_3 | var11_2) ^ 1706969677;
                    continue block38;
                }
                case 760751394: {
                    if (var4_8 >= var6_10) ** break;
                    ** continue;
lbl126:
                    // 2 sources

                    var10_4 = (var8_3 | var11_2) ^ -2125059940;
                    ** GOTO lbl137
                }
                case 1787867725: {
                    var10_4 = (var8_3 | var11_2) ^ -607987256;
                    continue block38;
                }
                case 181467095: {
                    var9_5 ^= var10_4 ^ -302717007;
                    ** continue;
                }
                case 297870625: {
                    if (var2_6 == 0) ** continue;
lbl136:
                    // 2 sources

                    var10_4 = (var8_3 | var11_2) ^ 947797656;
                }
lbl137:
                // 3 sources

                default: {
                    continue block38;
                }
                case 2009912438: 
            }
            var9_5 ^= var10_4 ^ -1863793648;
            var10_4 = (var8_3 | var11_2) ^ 1559167123;
        }
    }

    /*
     * Exception decompiling
     */
    private boolean yi(double var1_1, double var3_2, double var5_3, double var7_4) {
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
    private boolean yj(int var1_1, double var2_2, double var4_3, double var6_4, double var8_5, double var10_6) {
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
    private boolean yk(double var1_1, double var3_2, double var5_3, double var7_4) {
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
    private boolean yl(double var1_1, double var3_2, double var5_3, double var7_4) {
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
    private void ym(class_310 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [95[UNCONDITIONALDOLOOP], 86[UNCONDITIONALDOLOOP]], but top level block is 96[UNCONDITIONALDOLOOP]
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
    private void yn(class_310 var1_1) {
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
    private void yo(class_310 var1_1, int var2_2, double var3_3, double var5_4, double var7_5, String var9_6, String var10_7) {
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
    private static int yp(boolean var0) {
        block22: {
            block18: {
                block20: {
                    block17: {
                        block21: {
                            block19: {
                                block24: {
                                    block23: {
                                        break block23;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            if (!var0) break block17;
                                            break block18;
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_3 ^ 1566617838;
                                            break block19;
                                            break;
                                        }
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ -332869707;
                                            break block20;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_3 ^ -787114226;
                                            break block21;
                                            break;
                                        }
                                    }
                                    var4_1 = 309995437;
                                    var1_2 = lu.N & 309995437 ^ -1390626786;
                                    var3_3 = 0;
                                    break block24;
lbl18:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ -1209476736;
                                        ** continue;
                                        break;
                                    }
                                }
                                var2_4 = (var1_2 | var4_1) ^ 1353035960;
                                var3_3 = (var1_2 | var4_1) ^ 849361;
                                break block20;
                            }
                            var3_3 = (var1_2 | var4_1) ^ -466405842;
                            break block20;
lbl28:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1075869362;
                                break block20;
                                break;
                            }
lbl31:
                            // 2 sources

                            while (true) {
                                var2_4 ^= -1005449969;
                                break block22;
                                break;
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ -1042397853;
                        break block20;
                    }
                    var3_3 = (var1_2 | var4_1) ^ 835874315;
                }
lbl40:
                // 2 sources

                block16: while (true) {
                    switch (var3_3) {
                        default: {
                            continue block16;
                        }
                        case 1531808145: {
                            ** continue;
                        }
                        case -10565363: {
                            ** continue;
                        }
                        case -397304006: {
                            ** continue;
                        }
                        case -1901276748: {
                            ** continue;
                        }
                        case -1083028882: {
                            ** continue;
                        }
                        case 1398173706: {
                            v0 = 0;
                            ** GOTO lbl31
                        }
                        case 2124479196: 
                    }
                    v0 = 1;
                    ** continue;
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 1462706309;
            ** while (true)
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    public boolean shouldRenderNvg(class_310 var1_1) {
        block62: {
            var5_2 = -1142973063;
            var2_3 = lu.N & -1142973063 ^ 624466839;
            var4_4 = 0;
            ** GOTO lbl96
lbl5:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 440093225;
                ** GOTO lbl114
                break;
            }
lbl8:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 935071673;
                ** GOTO lbl114
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 1849444737;
                ** GOTO lbl114
                break;
            }
lbl14:
            // 1 sources

            block33: while (true) {
                var4_4 = (var2_3 | var5_2) ^ 208482965;
                ** GOTO lbl114
lbl17:
                // 1 sources

                while (true) {
                    if (!(var1_1.field_1755 instanceof class_408)) ** GOTO lbl42
                    ** GOTO lbl64
                    break;
                }
lbl20:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ 1405630590;
                    ** GOTO lbl45
                    break;
                }
                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 470844259;
                    ** GOTO lbl114
                    break;
                }
lbl26:
                // 2 sources

                while (true) {
                    var3_5 ^= 823740522;
                    ** GOTO lbl48
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    switch (var3_5) {
                        case -508071: {
                            var4_4 = (var2_3 | var5_2) ^ -1650190700;
                            break block33;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1153132072;
                            break block33;
                            break;
                        }
lbl37:
                        // 2 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1528103169;
                            break block33;
lbl40:
                            // 1 sources

                            while (true) {
                                if (this.a.length > 0) ** continue;
lbl42:
                                // 6 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 1985625918;
                                    break block33;
                                    break;
                                }
                                break;
                            }
lbl45:
                            // 2 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -810944244;
                                break block33;
                                break;
                            }
                            break;
                        }
lbl48:
                        // 1 sources

                        return v0;
lbl49:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 822921105;
                            break block33;
lbl52:
                            // 1 sources

                            while (true) {
                                v0 = true;
                                ** GOTO lbl26
                                break;
                            }
lbl55:
                            // 1 sources

                            while (true) {
                                if (!this.isEnabled()) ** GOTO lbl42
                                ** continue;
                                break;
                            }
lbl58:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 314562187;
                                break block33;
                                break;
                            }
                            break;
                        }
lbl61:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1551772444;
                            break block33;
                            break;
                        }
lbl64:
                        // 2 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -982032569;
                            break block33;
                            break;
                        }
lbl67:
                        // 1 sources

                        while (true) {
                            if (var1_1.field_1755 == null) ** continue;
                            ** continue;
                            break;
                        }
lbl70:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1180777304;
                            break block33;
                            break;
                        }
lbl73:
                        // 1 sources

                        while (true) {
                            if (var1_1.field_1724 == null) ** GOTO lbl42
                            ** GOTO lbl91
                            break;
                        }
                        case -1239554422: {
                            var4_4 = (var2_3 | var5_2) ^ -1179496366;
                            break block33;
                        }
lbl79:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 805427473;
                            break block33;
                            break;
                        }
lbl82:
                        // 1 sources

                        while (true) {
                            if (var1_1.field_1687 == null) ** GOTO lbl42
                            ** GOTO lbl98
                            break;
                        }
lbl85:
                        // 1 sources

                        while (true) {
                            v0 = false;
                            ** continue;
                            break;
                        }
lbl88:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1769675226;
                            break block33;
                            break;
                        }
lbl91:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ -132077679;
                        break block33;
lbl93:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ 1682952924;
                            ** continue;
                            break;
                        }
lbl96:
                        // 1 sources

                        var3_5 = (var2_3 | var5_2) ^ 1074241702;
                        ** continue;
lbl98:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ 801387306;
                        break block33;
lbl100:
                        // 1 sources

                        while (true) {
                            if (hJ.ok()) ** break;
                            ** continue;
                            break block62;
                            break;
                        }
                        default: {
                            var4_4 = (var2_3 | var5_2) ^ 944468340;
                            break block33;
                        }
                    }
                    break;
                }
                break;
            }
            if (true) ** GOTO lbl114
            block59: while (true) {
                block63: {
                    var4_4 = (var2_3 | var5_2) ^ -193919340;
                    break block63;
lbl111:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ -681397595;
                        ** continue;
                        break;
                    }
                }
lbl115:
                // 2 sources

                block61: while (true) {
                    switch (var4_4) {
                        default: {
                            continue block61;
                        }
                        case -2008838074: {
                            ** continue;
                        }
                        case -1513826858: {
                            ** continue;
                        }
                        case -478038813: {
                            ** continue;
                        }
                        case 105762733: {
                            ** continue;
                        }
                        case -79365673: {
                            break;
                        }
                        case 1884710643: {
                            ** continue;
                        }
                        case -1896654738: {
                            ** continue;
                        }
                        case -1388295820: {
                            ** continue;
                        }
                        case -1282232982: {
                            ** continue;
                        }
                        case 1205811310: {
                            ** continue;
                        }
                        case -695957979: {
                            ** continue;
                        }
                        case -1875137323: {
                            ** continue;
                        }
                        case -107043673: {
                            ** continue;
                        }
                        case 1267636587: {
                            ** continue;
                        }
                        case -775694722: {
                            ** continue;
                        }
                        case -1879161106: {
                            ** continue;
                        }
                        case -911892287: {
                            ** continue;
                        }
                        case -867222285: {
                            ** continue;
                        }
                        case 2055782584: {
                            ** continue;
                        }
                        case -2018185589: {
                            var3_5 ^= var4_4 ^ -1317872053;
                            ** GOTO lbl37
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ 1940955916;
                    continue;
                    {
                        case 454385920: {
                            ** continue;
                        }
                        case -322590262: {
                            ** continue;
                        }
                        case -1544610660: {
                            continue block59;
                        }
                    }
                    break;
                }
                break;
            }
        }
        var4_4 = (var2_3 | var5_2) ^ 1396323893;
        ** while (true)
        {
            ** case 576424299:
        }
lbl172:
        // 1 sources

        var3_5 ^= var4_4 ^ -2119715820;
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
     * Unable to fully structure code
     */
    private boolean yq(double var1_1, double var3_2, double var5_3, class_243 var7_4, float var8_5, float var9_6, float[] var10_7) {
        block68: {
            block64: {
                block70: {
                    block63: {
                        block66: {
                            block71: {
                                block65: {
                                    block69: {
                                        block67: {
                                            block62: {
                                                block73: {
                                                    block72: {
                                                        var17_8 = -1121716851;
                                                        var14_9 = lu.N & -1121716851 ^ -873503786;
                                                        var16_10 = 0;
                                                        break block72;
lbl5:
                                                        // 1 sources

                                                        while (true) {
                                                            var16_10 = (var14_9 | var17_8) ^ 2034727136;
                                                            ** GOTO lbl40
lbl8:
                                                            // 1 sources

                                                            while (true) {
                                                                var15_14 ^= var16_10 ^ 1645989842;
                                                                break block62;
                                                                break;
                                                            }
                                                            break;
                                                        }
lbl11:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl13:
                                                        // 1 sources

                                                        while (true) {
                                                            var16_10 = (var14_9 | var17_8) ^ -283388700;
                                                            ** GOTO lbl40
                                                            break;
                                                        }
lbl16:
                                                        // 1 sources

                                                        return false;
lbl18:
                                                        // 1 sources

                                                        while (true) {
                                                            var15_14 ^= -1198166820;
                                                            ** continue;
                                                            break;
                                                        }
lbl21:
                                                        // 1 sources

                                                        while (true) {
                                                            var16_10 = (var14_9 | var17_8) ^ -703200423;
                                                            break block63;
                                                            break;
                                                        }
lbl24:
                                                        // 1 sources

                                                        while (true) {
                                                            var15_14 ^= var16_10 ^ -1737218899;
                                                            break block64;
                                                            break;
                                                        }
lbl27:
                                                        // 1 sources

                                                        while (!(var12_12 > 1.15f)) {
                                                            break block65;
                                                        }
                                                        break block73;
                                                    }
                                                    var15_14 = (var14_9 | var17_8) ^ -937499709;
                                                    ** while (true)
lbl33:
                                                    // 1 sources

                                                    while (true) {
                                                        var10_7[1] = (1.0f - (var13_13 * 0.5f + 0.5f)) * var9_6;
                                                        ** GOTO lbl60
                                                        break;
                                                    }
lbl36:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl38:
                                                    // 1 sources

                                                    block42: while (true) {
                                                        var16_10 = (var14_9 | var17_8) ^ 134879644;
lbl40:
                                                        // 14 sources

                                                        block43: while (true) {
                                                            switch (var16_10) lbl-1000:
                                                            // 3 sources

                                                            {
                                                                while (true) {
                                                                    default: {
                                                                        continue block43;
                                                                    }
                                                                    break;
                                                                }
                                                                case 1652851425: {
                                                                    ** continue;
                                                                }
                                                                case 1716231984: {
                                                                    break block42;
                                                                }
                                                                case -1042207123: {
                                                                    ** GOTO lbl27
                                                                }
                                                                case 284435259: {
                                                                    ** continue;
                                                                }
lbl53:
                                                                // 1 sources

                                                                while (true) {
                                                                    var16_10 = (var14_9 | var17_8) ^ -1233228993;
                                                                    ** GOTO lbl-1000
                                                                    break;
                                                                }
lbl56:
                                                                // 1 sources

                                                                while (true) {
                                                                    this.a.mul((Matrix4fc)cZ.a).mul((Matrix4fc)cZ.c);
                                                                    break block66;
                                                                    break;
                                                                }
lbl60:
                                                                // 1 sources

                                                                var16_10 = (var14_9 | var17_8) ^ 402386831;
                                                                ** continue;
                                                                case 389513495: {
                                                                    break block67;
                                                                }
lbl64:
                                                                // 1 sources

                                                                while (true) {
                                                                    var15_14 ^= var16_10 ^ 1081509598;
                                                                    break block68;
                                                                    break;
                                                                }
lbl67:
                                                                // 1 sources

                                                                while (true) {
                                                                    var15_14 ^= var16_10 ^ -479396844;
                                                                    break block69;
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    var16_10 = (var14_9 | var17_8) ^ -470277479;
                                                    ** GOTO lbl40
lbl72:
                                                    // 1 sources

                                                    while (true) {
                                                        var15_14 ^= var16_10 ^ -119089520;
                                                        break block70;
                                                        break;
                                                    }
                                                    {
                                                        case 197235907: {
                                                            var10_7[0] = (var12_12 * 0.5f + 0.5f) * var8_5;
                                                            break;
                                                        }
                                                    }
lbl78:
                                                    // 1 sources

                                                    while (true) {
                                                        var16_10 = (var14_9 | var17_8) ^ 1713771635;
                                                        break block63;
                                                        break;
                                                    }
                                                    var13_13 = this.a.y() * var11_11;
                                                    var16_10 = (var14_9 | var17_8) ^ -1016065495;
                                                    ** GOTO lbl40
lbl84:
                                                    // 1 sources

                                                    while (true) {
                                                        if (this.a.w() <= 0.05f) {
                                                            ** continue;
                                                        }
                                                        break block71;
                                                        break;
                                                    }
                                                }
lbl89:
                                                // 4 sources

                                                while (true) {
                                                    var16_10 = (var14_9 | var17_8) ^ 1524331630;
                                                    ** GOTO lbl40
                                                    break;
                                                }
lbl92:
                                                // 1 sources

                                                while (true) {
                                                    var11_11 = 1.0f / this.a.w();
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            var16_10 = (var14_9 | var17_8) ^ -198286564;
                                            ** GOTO lbl40
lbl98:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var16_10 = (var14_9 | var17_8) ^ -725658577;
                                        ** GOTO lbl40
                                    }
                                    var16_10 = (var14_9 | var17_8) ^ -1609910643;
                                    break block63;
                                    var12_12 = this.a.x() * var11_11;
                                    var15_14 ^= 472580733;
                                    ** while (true)
                                    {
                                        case -1523285071: {
                                            var15_14 ^= var16_10 ^ 871098990;
                                            ** continue;
                                        }
                                    }
lbl112:
                                    // 1 sources

                                    while (true) {
                                        var16_10 = (var14_9 | var17_8) ^ -388467000;
                                        ** GOTO lbl40
                                        break;
                                    }
lbl115:
                                    // 1 sources

                                    while (true) {
                                        var16_10 = (var14_9 | var17_8) ^ -1581475523;
                                        break block63;
                                        break;
                                    }
                                }
                                var16_10 = (var14_9 | var17_8) ^ -1717278481;
                                ** GOTO lbl40
lbl121:
                                // 1 sources

                                while (true) {
                                    var16_10 = (var14_9 | var17_8) ^ 1864051444;
                                    break block63;
                                    break;
                                }
lbl124:
                                // 1 sources

                                while (true) {
                                    var16_10 = (var14_9 | var17_8) ^ 1041160626;
                                    ** GOTO lbl40
                                    break;
                                }
                            }
                            var16_10 = (var14_9 | var17_8) ^ 1815972669;
                            break block63;
lbl130:
                            // 1 sources

                            while (true) {
                                var16_10 = (var14_9 | var17_8) ^ -411122277;
                                ** GOTO lbl40
                                break;
                            }
                            {
                                case -401336240: {
                                    var15_14 ^= var16_10 ^ -2062020618;
                                    ** continue;
                                }
                                case 726705136: {
                                    if (!(var13_13 > 1.15f)) break;
                                    ** GOTO lbl89
                                }
                            }
                            this.a.set((float)(var1_1 - var7_4.field_1352), (float)(var3_2 - var7_4.field_1351), (float)(var5_3 - var7_4.field_1350), 1.0f);
                            var16_10 = (var14_9 | var17_8) ^ 346329618;
                            break block63;
                        }
                        var16_10 = (var14_9 | var17_8) ^ -271232696;
                        break block63;
                        {
                            case 1017112054: {
                                var15_14 ^= var16_10 ^ 1050193325;
                                ** continue;
                            }
                        }
                        var16_10 = (var14_9 | var17_8) ^ -1653902018;
                        ** GOTO lbl40
                    }
lbl152:
                    // 4 sources

                    block60: while (true) {
                        switch (var16_10) {
                            default: {
                                continue block60;
                            }
                            case 1608859986: {
                                ** continue;
                            }
                            case -347380275: {
                                ** continue;
                            }
                            case -1752254179: {
                                ** continue;
                            }
                            case 272279191: {
                                ** continue;
                            }
                            case -1714822228: {
                                ** continue;
                            }
                            case -1863000789: {
                                ** continue;
                            }
                            case -772789331: {
                                ** continue;
                            }
                            case 1582526178: {
                                ** continue;
                            }
                            case 1726251487: {
                                ** continue;
                            }
                            case -1814922014: {
                                var15_14 ^= var16_10 ^ 754644;
                                ** continue;
                            }
                            case 704246918: {
                                ** continue;
                            }
                        }
                        break;
                    }
                    {
                        case 864570539: {
                            var15_14 ^= var16_10 ^ -1787596576;
                            ** continue;
                        }
                    }
                }
                var16_10 = (var14_9 | var17_8) ^ -1727302144;
                ** GOTO lbl152
                {
                    case 471323974: {
                        if (var13_13 < -1.15f) ** GOTO lbl89
                        ** continue;
                    }
                }
                var16_10 = (var14_9 | var17_8) ^ -865617036;
                ** while (true)
                {
                    case 412168772: {
                        if (!(var12_12 < -1.15f)) ** break;
                        ** continue;
                        ** continue;
                    }
                }
            }
            var16_10 = (var14_9 | var17_8) ^ 1751207618;
            ** GOTO lbl152
            {
                case -2035773633: {
                    ** continue;
                }
                case -135926205: {
                    return false;
                }
                ** case 1234279648:
            }
lbl202:
            // 1 sources

            return true;
        }
        var16_10 = (var14_9 | var17_8) ^ 773839986;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private boolean yr(float var1_1, float var2_2, float var3_3, float var4_4, int var5_5) {
        block50: {
            block44: {
                block45: {
                    block46: {
                        block42: {
                            block49: {
                                block47: {
                                    block48: {
                                        block40: {
                                            block43: {
                                                block41: {
                                                    block39: {
                                                        break block43;
lbl1:
                                                        // 11 sources

                                                        block23: while (true) {
                                                            switch (var10_8) lbl-1000:
                                                            // 5 sources

                                                            {
                                                                while (true) {
                                                                    default: {
                                                                        continue block23;
                                                                    }
                                                                    break;
                                                                }
lbl6:
                                                                // 1 sources

                                                                while (true) {
                                                                    var10_8 = (var8_7 | var11_6) ^ 1537736368;
                                                                    ** GOTO lbl-1000
                                                                    break;
                                                                }
                                                                case -384093848: {
                                                                    var9_11 ^= var10_8 ^ 993833763;
                                                                    break;
                                                                }
lbl12:
                                                                // 1 sources

                                                                while (true) {
                                                                    var10_8 = (var8_7 | var11_6) ^ -287618778;
                                                                    ** GOTO lbl-1000
                                                                    break;
                                                                }
lbl15:
                                                                // 1 sources

                                                                while (true) {
                                                                    var10_8 = (var8_7 | var11_6) ^ -1736757390;
                                                                    ** GOTO lbl-1000
                                                                    break;
                                                                }
lbl18:
                                                                // 1 sources

                                                                while (true) {
                                                                    var10_8 = (var8_7 | var11_6) ^ 1315688921;
                                                                    ** continue;
                                                                    break;
                                                                }
                                                                case 124515259: {
                                                                    var9_11 ^= var10_8 ^ -1545673890;
                                                                    break block39;
                                                                }
                                                            }
                                                            var10_8 = (var8_7 | var11_6) ^ 2128573150;
                                                            continue;
                                                            break;
                                                        }
lbl26:
                                                        // 1 sources

                                                        while (true) {
                                                            var10_8 = (var8_7 | var11_6) ^ -1398667085;
                                                            break block40;
                                                            break;
                                                        }
lbl29:
                                                        // 1 sources

                                                        while (true) {
                                                            var9_11 ^= var10_8 ^ 783581750;
                                                            break block41;
                                                            break;
                                                        }
lbl32:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl34:
                                                        // 2 sources

                                                        while (true) {
                                                            var10_8 = (var8_7 | var11_6) ^ 152520431;
                                                            ** GOTO lbl1
                                                            break;
                                                        }
                                                        {
                                                            case -20956842: {
                                                                var9_11 ^= var10_8 ^ -352317067;
                                                                break block44;
                                                            }
                                                            case -1401913079: {
                                                                if (var3_3 + var6_9 > this.e[var7_10]) {
                                                                    ** continue;
                                                                }
                                                                break block45;
                                                            }
                                                            case 1495137927: {
                                                                return true;
                                                            }
                                                            case 332241608: {
                                                                if (var7_10 < var5_5) {
                                                                    break;
                                                                }
                                                                break block46;
                                                            }
                                                        }
                                                        var6_9 = 3.0f;
                                                        var9_11 ^= 365531289;
                                                        break block47;
                                                    }
                                                    var10_8 = (var8_7 | var11_6) ^ -1362460354;
                                                    ** GOTO lbl1
lbl56:
                                                    // 1 sources

                                                    while (true) {
                                                        var10_8 = (var8_7 | var11_6) ^ -256078846;
                                                        ** GOTO lbl1
                                                        break;
                                                    }
                                                }
                                                var10_8 = (var8_7 | var11_6) ^ 521242746;
                                                break block40;
                                                {
                                                    case 978390484: {
                                                        if (var1_1 - var6_9 < this.d[var7_10]) {
                                                            break;
                                                        }
                                                        break block45;
                                                    }
                                                }
                                                var10_8 = (var8_7 | var11_6) ^ 1592175177;
                                                ** GOTO lbl1
                                                {
                                                    case 1873563851: {
                                                        return false;
                                                    }
                                                }
                                            }
                                            var11_6 = -1231808511;
                                            var8_7 = lu.N & -1231808511 ^ -145522759;
                                            var10_8 = 0;
                                            var9_11 = (var8_7 | var11_6) ^ 1037140304;
                                            ** while (true)
                                            {
                                                case 201634620: {
                                                    if (var2_2 - var6_9 < this.a[var7_10]) {
                                                        ** continue;
                                                    }
                                                    break block45;
                                                }
                                                case 1114012894: {
                                                    break block48;
                                                }
                                                case -1995960985: {
                                                    ++var7_10;
                                                    ** GOTO lbl34
                                                }
                                                case -1456351760: {
                                                    var9_11 ^= var10_8 ^ 1859551128;
                                                    ** continue;
                                                }
                                                case 180083789: {
                                                    ** continue;
                                                }
                                                case -1898434102: {
                                                    var9_11 ^= var10_8 ^ 355891024;
                                                    ** continue;
                                                }
                                            }
                                        }
lbl94:
                                        // 2 sources

                                        block34: while (true) {
                                            switch (var10_8) {
                                                default: {
                                                    continue block34;
                                                }
                                                case 1177926941: {
                                                    ** continue;
                                                }
                                                case -389613629: {
                                                    ** continue;
                                                }
                                                ** case 1534424842:
lbl103:
                                                // 1 sources

                                                break block42;
                                            }
                                            break;
                                        }
                                        {
                                            case 420230815: {
                                                if (!(var4_4 + var6_9 > this.b[var7_10])) break block45;
                                                break block49;
                                            }
                                        }
                                        var10_8 = (var8_7 | var11_6) ^ -43211788;
                                        ** GOTO lbl1
                                        {
                                            ** case -1178816928:
                                        }
lbl110:
                                        // 1 sources

                                        break block50;
                                    }
                                    var10_8 = (var8_7 | var11_6) ^ -70005627;
                                    ** GOTO lbl1
                                }
                                var7_10 = 0;
                                ** while (true)
                            }
                            var10_8 = (var8_7 | var11_6) ^ -1246690457;
                            ** GOTO lbl1
                        }
                        var10_8 = (var8_7 | var11_6) ^ -1310539100;
                        ** while (true)
                    }
                    var10_8 = (var8_7 | var11_6) ^ 2031046259;
                    ** GOTO lbl1
                }
                var10_8 = (var8_7 | var11_6) ^ 516706001;
                ** GOTO lbl1
            }
            var10_8 = (var8_7 | var11_6) ^ -467999375;
            ** GOTO lbl1
        }
        var10_8 = (var8_7 | var11_6) ^ -846826899;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static int ys(int var0) {
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
    private static /* synthetic */ ah yt(Integer var0) {
        block10: {
            block7: {
                block8: {
                    block9: {
                        break block9;
lbl1:
                        // 1 sources

                        return new ah();
lbl3:
                        // 3 sources

                        block6: while (true) {
                            switch (var3_2) {
                                default: {
                                    continue block6;
                                }
                                case 229342832: {
                                    break block7;
                                }
                                case 102168335: {
                                    ** continue;
                                }
                                case 1448081952: {
                                    var2_3 ^= var3_2 ^ 976914831;
                                    break;
                                }
                            }
                            break block8;
                            break;
                        }
                    }
                    var1_1 = lu.N & 1685831168 ^ 857435961;
                    var3_2 = 0;
                    break block10;
                }
                var3_2 = (var1_1 | 1685831168) ^ 1902970934;
                ** GOTO lbl3
            }
            var3_2 = (var1_1 | 1685831168) ^ 557057305;
            ** GOTO lbl3
        }
        var2_3 = (var1_1 | 1685831168) ^ 1491467437;
        var3_2 = (var1_1 | 1685831168) ^ 2060484937;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ ArrayList yu(Long var0) {
        block8: {
            block6: {
                block7: {
                    var1_1 = lu.N & 971545953 ^ -602661709;
                    var3_2 = 0;
                    ** GOTO lbl12
lbl4:
                    // 3 sources

                    block5: while (true) {
                        switch (var3_2) {
                            default: {
                                continue block5;
                            }
                            case 1462130704: {
                                break block6;
                            }
                            case 61234946: {
                                return new ArrayList<E>(lu.xS((var2_3 | var3_2 ^ 978240099) ^ (var3_2 ^ 863791112), (var1_1 | var3_2 ^ 978240099) ^ ((var2_3 | var3_2 ^ 978240099) ^ (var3_2 ^ 1917283835))));
                            }
lbl12:
                            // 1 sources

                            var2_3 = (var1_1 | 971545953) ^ 1988349513;
                            break block7;
                            case 1454557882: {
                                var2_3 ^= var3_2 ^ 2039596122;
                                break block5;
                            }
                        }
                        break;
                    }
                    break block8;
                }
                var3_2 = (var1_1 | 971545953) ^ -1428503069;
                ** GOTO lbl4
            }
            var3_2 = (var1_1 | 971545953) ^ -1420929207;
            ** GOTO lbl4
        }
        var3_2 = (var1_1 | 971545953) ^ -27606287;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ int yv(Long var0, Long var1_1) {
        block29: {
            block31: {
                block30: {
                    block28: {
                        var6_2 = 469862039;
                        var3_3 = lu.N & 469862039 ^ 1197585529;
                        var5_4 = 0;
                        ** GOTO lbl44
lbl5:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ -1286675978;
                            break block28;
                            break;
                        }
lbl8:
                        // 1 sources

                        return v0;
lbl10:
                        // 1 sources

                        while (true) {
                            v0 = Integer.compare(class_1923.method_8332((long)var0), class_1923.method_8332((long)var1_1));
                            break block29;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var4_6 ^= var5_4 ^ -996907454;
                            ** GOTO lbl46
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ -235540889;
                            break block28;
                            break;
                        }
lbl19:
                        // 1 sources

                        while (true) {
                            var4_6 ^= var5_4 ^ 1912113051;
                            var5_4 = (var3_3 | var6_2) ^ -1071369978;
                            break block30;
                            break;
                        }
lbl23:
                        // 1 sources

                        while (true) {
                            var4_6 ^= var5_4 ^ -2074422110;
                            ** continue;
                            break;
                        }
                    }
lbl27:
                    // 2 sources

                    block20: while (true) {
                        switch (var5_4) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                default: {
                                    continue block20;
                                }
                                break;
                            }
                            case -101956649: {
                                ** continue;
                            }
                            case 194883797: {
                                ** continue;
                            }
                            case -1366009704: {
                                ** continue;
                            }
lbl38:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ -1500646104;
                                ** GOTO lbl-1000
                                break;
                            }
lbl41:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ 363661188;
                                break block30;
                                break;
                            }
lbl44:
                            // 1 sources

                            var4_6 = (var3_3 | var6_2) ^ -2071160110;
                            ** continue;
lbl46:
                            // 1 sources

                            var5_4 = (var3_3 | var6_2) ^ 1822481892;
                            ** GOTO lbl-1000
                            case 1638299565: {
                                var4_6 ^= var5_4 ^ -1364221638;
                                ** continue;
                            }
lbl51:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ 1425802794;
                                ** continue;
                                break;
                            }
lbl54:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ -690609451;
                                break block30;
                                break;
                            }
                            case 868313883: {
                                v0 = var2_5;
                                break block29;
                            }
                            case -332441847: {
                                if (var2_5 == 0) break block31;
                            }
                        }
                        break;
                    }
lbl62:
                    // 1 sources

                    while (true) {
                        var2_5 = Integer.compare(class_1923.method_8325((long)var0), class_1923.method_8325((long)var1_1));
                        ** continue;
                        break;
                    }
                }
                block27: while (true) {
                    switch (var5_4) {
                        default: {
                            continue block27;
                        }
                        case -1984457686: {
                            ** continue;
                        }
                        case -1622833159: {
                            ** continue;
                        }
                        case 1254928763: {
                            ** continue;
                        }
                    }
                    break;
                }
            }
            var5_4 = (var3_3 | var6_2) ^ 1053278546;
            ** while (true)
        }
        var4_6 ^= -1110848749;
        ** while (true)
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ double yw(j var0) {
        var1_1 = lu.N & 659647978 ^ -1639170426;
        var3_2 = 0;
        if (true) ** GOTO lbl14
        block5: while (true) {
            var3_2 = (var1_1 | 659647978) ^ -1537204830;
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
lbl11:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | 659647978) ^ -72508877;
                        ** GOTO lbl-1000
                        break;
                    }
lbl14:
                    // 1 sources

                    var2_3 = (var1_1 | 659647978) ^ -470111567;
                    var3_2 = (var1_1 | 659647978) ^ -454585266;
                    ** continue;
                    case 1538976672: {
                        continue block5;
                    }
                    case 457007692: {
                        var2_3 ^= var3_2 ^ -749336829;
                        ** continue;
                    }
                    case 1156638173: 
                }
                break;
            }
            break;
        }
        return var0.a;
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ boolean yx(long var0, long var2_2, fD var4_1) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean yy(long var0, long var2_2, cv var4_1) {
        block14: {
            var8_3 = 1843352983;
            var5_4 = lu.N & 1843352983 ^ 618098482;
            var7_5 = 0;
            var6_6 = (var5_4 | var8_3) ^ 233256453;
            var7_5 = (var5_4 | var8_3) ^ -381849402;
            if (true) ** GOTO lbl41
            block11: while (true) {
                var7_5 = (var5_4 | var8_3) ^ -1383059111;
                block12: while (true) {
                    switch (var7_5) {
                        case 518326442: {
                            var6_6 ^= var7_5 ^ -1923884318;
                            var7_5 = (var5_4 | var8_3) ^ -1485884461;
                            continue block12;
                        }
                        case 800511531: {
                            var6_6 ^= var7_5 ^ -1140849565;
                            var7_5 = (var5_4 | var8_3) ^ 1657089941;
                            continue block12;
                        }
                        case -894415772: {
                            v0 = true;
                            break block14;
                        }
                        case -1068544274: {
                            if (var4_1.b == 0) {
                                var7_5 = (var5_4 | var8_3) ^ 1933211421;
                                continue block12;
                            }
                            var7_5 = (var5_4 | var8_3) ^ 1114220956;
                            ** break;
                        }
                        case -1866875634: {
                            var4_1.prune(var0, var2_2);
                            var7_5 = (var5_4 | var8_3) ^ 537274679;
                            ** break;
                        }
                        case -2065559695: {
                            var7_5 = (var5_4 | var8_3) ^ -276639025;
                            continue block12;
                        }
                        case 1306089088: {
                            var6_6 ^= var7_5 ^ 595961867;
                            continue block11;
                        }
                        case -2107789960: {
                            var6_6 ^= var7_5 ^ 1845732388;
                            var7_5 = (var5_4 | var8_3) ^ -43597127;
                        }
lbl41:
                        // 5 sources

                        default: {
                            continue block12;
                        }
                        case 253382690: 
                    }
                    break;
                }
                break;
            }
            v0 = false;
        }
        var6_6 ^= 1863685062;
        return v0;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ fD yz(UUID uUID) {
        int n2 = N & 0xACC3A3E4 ^ 0x33EC9AAC;
        int n3 = 0;
        int n4 = (n2 | 0xACC3A3E4) ^ 0x6EE075B6;
        n3 = (n2 | 0xACC3A3E4) ^ 0xAABD7B97;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 357744763: {
                    n3 = (n2 | 0xACC3A3E4) ^ 0x1B843CF3;
                    continue block5;
                }
                case -1536456929: {
                    n4 ^= n3 ^ 0x2C8D14BA;
                    n3 = (n2 | 0xACC3A3E4) ^ 0x4621ABE2;
                    continue block5;
                }
                case -103935986: 
            }
            break;
        }
        return new fD();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ cv yA(Long l2) {
        int n2 = N & 0xE7967CB6 ^ 0x6DA74D4C;
        int n3 = 0;
        int n4 = (n2 | 0xE7967CB6) ^ 0x5EEBEC15;
        n3 = (n2 | 0xE7967CB6) ^ 0xA8F17B89;
        block5: while (true) {
            switch (n3) {
                case 1195771511: {
                    n3 = (n2 | 0xE7967CB6) ^ 0x3274E73F;
                    continue block5;
                }
                case -574383423: {
                    n4 ^= n3 ^ 0xD9231A25;
                    n3 = (n2 | 0xE7967CB6) ^ 0xFEBA851B;
                }
                default: {
                    continue block5;
                }
                case 286128357: 
            }
            break;
        }
        return new cv();
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void yB(class_638 var0, class_2818 var1_1) {
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void yC(class_638 var0, class_2818 var1_1) {
        var6_2 = 1732216729;
        var3_3 = lu.N & 1732216729 ^ 1396954639;
        var5_4 = 0;
        var4_5 = (var3_3 | var6_2) ^ 245481905;
        var5_4 = (var3_3 | var6_2) ^ 611230494;
        if (true) ** GOTO lbl18
        block17: while (true) {
            switch (var5_4) {
                case 112908221: {
                    var4_5 ^= var5_4 ^ -201446334;
                    var5_4 = (var3_3 | var6_2) ^ 1573911827;
                    continue block17;
                }
                case 716188300: {
                    var2_6 = lu.a;
                    break block17;
                }
                case 1393652865: {
                    var5_4 = (var3_3 | var6_2) ^ 1908736034;
                }
lbl18:
                // 3 sources

                default: {
                    continue block17;
                }
            }
            break;
        }
        var5_4 = (var3_3 | var6_2) ^ 1110625237;
        if (true) ** GOTO lbl64
        block18: while (true) {
            switch (var5_4) {
                case 894245962: {
                    var4_5 ^= var5_4 ^ -1203307894;
                    var5_4 = (var3_3 | var6_2) ^ -1533465878;
                    continue block18;
                }
                case 75741858: {
                    var5_4 = (var3_3 | var6_2) ^ 580260224;
                    continue block18;
                }
                case -45322590: {
                    ** break;
                }
                case 1441383967: {
                    if (var2_6.isEnabled()) {
                        var5_4 = (var3_3 | var6_2) ^ -1082438279;
                        break;
                    }
                    ** GOTO lbl63
                }
                case 124843801: {
                    var2_6.xo(var1_1.method_12004().field_9181, var1_1.method_12004().field_9180);
                    ** GOTO lbl63
                }
                case 457139321: {
                    return;
                }
                case -939222298: {
                    ** GOTO lbl55
                }
                case 560759931: {
                    var4_5 ^= var5_4 ^ 1998808039;
                    ** GOTO lbl57
                }
                case 1480535414: {
                    if (var0 != var2_6.a) ** GOTO lbl63
                    ** GOTO lbl53
                }
lbl51:
                // 1 sources

                var5_4 = (var3_3 | var6_2) ^ 1880039558;
                continue block18;
lbl53:
                // 1 sources

                var5_4 = (var3_3 | var6_2) ^ -1976321731;
                continue block18;
lbl55:
                // 1 sources

                var5_4 = (var3_3 | var6_2) ^ 792787689;
                continue block18;
lbl57:
                // 1 sources

                var5_4 = (var3_3 | var6_2) ^ 1816179686;
                continue block18;
                case -739836555: {
                    if (var2_6 != null) {
                        var5_4 = (var3_3 | var6_2) ^ 1945922877;
                        continue block18;
                    }
lbl63:
                    // 5 sources

                    var5_4 = (var3_3 | var6_2) ^ 1444107236;
                }
            }
lbl64:
            // 4 sources

        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ boolean yD(class_2680 var0) {
        block29: {
            block25: {
                block28: {
                    block30: {
                        block27: {
                            block26: {
                                break block30;
lbl1:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -644825745;
                                    break block25;
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -903554265;
                                    break block25;
lbl7:
                                    // 1 sources

                                    while (var0.method_26204() != class_2246.field_10543) {
                                        break block26;
                                    }
                                    ** GOTO lbl75
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    if (var0.method_26204() != class_2246.field_10243) break block27;
                                    ** GOTO lbl75
                                    break;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ -911976169;
                            break block25;
lbl16:
                            // 1 sources

                            while (true) {
                                v0 = true;
                                ** GOTO lbl73
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 2051838123;
                                break block25;
                                break;
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ 656193305;
                        break block25;
                    }
                    var4_1 = 505185638;
                    var1_2 = lu.N & 505185638 ^ -29119397;
                    var3_3 = 0;
                    var2_4 = (var1_2 | var4_1) ^ -612932200;
                    ** while (true)
lbl31:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 756822143;
                        break block28;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 2042674558;
                        break block25;
                        break;
                    }
lbl37:
                    // 1 sources

                    while (true) {
                        v0 = false;
                        ** GOTO lbl73
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 1399600363;
                break block25;
lbl43:
                // 1 sources

                return v0;
lbl45:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -2129336657;
                    break block29;
                    break;
                }
lbl48:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -322559212;
                    ** continue;
                    break;
                }
            }
lbl52:
            // 2 sources

            block23: while (true) {
                switch (var3_3) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block23;
                        }
                        break;
                    }
                    case 302319075: {
                        ** GOTO lbl7
                    }
                    case -2079113772: {
                        ** continue;
                    }
                    case -1389127276: {
                        ** continue;
                    }
                    case 412682509: {
                        ** continue;
                    }
                    case 880506456: {
                        break block23;
                    }
                    case -2019618815: {
                        ** continue;
                    }
                    case 667881488: {
                        ** continue;
                    }
                    case -649913754: {
                        ** continue;
                    }
lbl73:
                    // 2 sources

                    var2_4 ^= 594045322;
                    ** continue;
lbl75:
                    // 2 sources

                    var3_3 = (var1_2 | var4_1) ^ -423189390;
                    ** continue;
                    case 939258984: {
                        var2_4 ^= var3_3 ^ -103575324;
                        ** continue;
                    }
                }
                break;
            }
            var2_4 ^= -836213620;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ -329602916;
        ** while (true)
    }
}

