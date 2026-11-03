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
 *  net.minecraft.class_1802
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_304
 *  net.minecraft.class_3532
 *  org.lwjgl.glfw.GLFW
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1802;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_3532;
import org.lwjgl.glfw.GLFW;
import z.r.aE;
import z.r.bM;
import z.r.dX;
import z.r.eA;
import z.r.ej;
import z.r.gP;
import z.r.gj;
import z.r.iD;
import z.r.ix;
import z.r.kQ;
import z.r.ke;
import z.r.ko;
import z.r.lw;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class iL
extends bM {
    private int a;
    private static final /* synthetic */ String a;
    private static final int[] a;
    private int b;
    private final ke a;
    private static final /* synthetic */ String s;
    public static final int h;
    private boolean a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private int c;
    private final ke b;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String d;
    private class_1309 a;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private final ke c;
    private int d;
    private static final float a;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final double a;
    private static final int e;
    private final dX a;
    private static final float b;
    private boolean b;
    private static final int f;
    private static final double b;
    private static iL a;
    private boolean c;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String l;
    private boolean d;
    private final aE a;
    private final gP a;
    private static final int g;
    private static final /* synthetic */ String m;
    private final ke d;
    private final ke e;
    private final ke f;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private boolean e;
    private static final /* synthetic */ String p;
    private boolean f;
    private static final /* synthetic */ String q;
    private final ej a;
    private static final /* synthetic */ String r;
    private final gP b;
    private final ke g;
    private boolean g;
    private boolean h;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private class_1268 a;
    private kQ a;
    private boolean i;
    private final gP c;
    private final ke h;

    /*
     * Exception decompiling
     */
    public iL() {
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
    public static iL instance() {
        int n2 = h & 0x43501BF9 ^ 0x8399B915;
        int n3 = 0;
        int n4 = (n2 | 0x43501BF9) ^ 0x8B4036E2;
        n3 = (n2 | 0x43501BF9) ^ 0xE9BBE5C7;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -2118349335: {
                    n4 ^= n3 ^ 0x8A65FCC9;
                    n3 = (n2 | 0x43501BF9) ^ 0x3A031301;
                    continue block5;
                }
                case 711089722: {
                    n3 = (n2 | 0x43501BF9) ^ 0x42653614;
                    continue block5;
                }
                case -103110404: 
            }
            break;
        }
        return a;
    }

    /*
     * Unable to fully structure code
     */
    public boolean wantsRotation() {
        var4_1 = -2085219490;
        var1_2 = iL.h & -2085219490 ^ -460472875;
        var3_3 = 0;
        ** GOTO lbl39
lbl5:
        // 1 sources

        while (true) {
            v0 = false;
            if (true) ** GOTO lbl34
            break;
        }
        block12: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 1495982079;
lbl10:
            // 2 sources

            block13: while (true) {
                switch (var3_3) lbl-1000:
                // 8 sources

                {
                    default: {
                        continue block13;
                    }
                    case 1007690843: {
                        ** continue;
                    }
                    case 1560654218: {
                        continue block12;
                    }
                    case 2010728465: {
                        if (this.a == kQ.c) ** GOTO lbl22
                        var3_3 = (var1_2 | var4_1) ^ 1873159305;
                        ** GOTO lbl-1000
lbl22:
                        // 2 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -284307711;
                            ** GOTO lbl-1000
                            break;
                        }
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -609248380;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -1144199379: {
                        v0 = true;
                        ** GOTO lbl34
                    }
lbl31:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -547772944;
                        ** GOTO lbl-1000
                        break;
                    }
lbl34:
                    // 2 sources

                    var2_4 ^= -1981110534;
                    return v0;
lbl36:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1700595034;
                        ** GOTO lbl-1000
                        break;
                    }
lbl39:
                    // 1 sources

                    var2_4 = (var1_2 | var4_1) ^ -95003006;
                    var3_3 = (var1_2 | var4_1) ^ -1162211755;
                    ** GOTO lbl-1000
                    case -1097506784: {
                        var2_4 ^= var3_3 ^ 1815406297;
                        break block12;
                    }
                    case 954604079: {
                        if (!this.a.active()) ** continue;
                        ** continue;
                    }
                    case -2099070331: {
                        var2_4 ^= var3_3 ^ 1743520390;
                        var3_3 = (var1_2 | var4_1) ^ 1551063282;
                        ** GOTO lbl-1000
                    }
                    case -2011587754: {
                        ** continue;
                    }
                }
                break;
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ -1872300082;
        ** while (true)
        {
            ** case 145912030:
        }
lbl57:
        // 1 sources

        var2_4 ^= var3_3 ^ -306394915;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public double[] computeAdjustment(double var1_1) {
        var3_2 = iL.h & -1130610658 ^ -60550383;
        var5_3 = 0;
        if (true) ** GOTO lbl14
        block5: while (true) {
            var5_3 = (var3_2 | -1130610658) ^ 1042147382;
            block6: while (true) {
                switch (var5_3) lbl-1000:
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
                        var5_3 = (var3_2 | -1130610658) ^ -28096222;
                        ** GOTO lbl-1000
                        break;
                    }
lbl14:
                    // 1 sources

                    var4_4 = (var3_2 | -1130610658) ^ 588119533;
                    var5_3 = (var3_2 | -1130610658) ^ 1902010426;
                    ** continue;
                    case -1918749915: {
                        continue block5;
                    }
                    case 45029949: {
                        return this.a.step(var1_1);
                    }
                    case -1025393879: 
                }
                break;
            }
            break;
        }
        var4_4 ^= var5_3 ^ 1025026629;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static Boolean forcedKeyState(class_304 var0) {
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

    private static int Pn(int n2, int n3) {
        int n4 = 1753362999;
        int n5 = 2135895421;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x760FE0FF)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x7FCFB4E0;
        n6 += (n5 | n4) ^ 0x7FCF206E;
        n6 -= (n5 | n4) ^ 0x7FCFE562;
        n6 -= (n5 | n4) ^ 0x7FCFC14E;
        n6 += (n5 | n4) ^ 0x7FCFAC05;
        n6 -= (n5 | n4) ^ 0x7FCF21FD;
        n6 ^= (n5 | n4) ^ 0x7FCFBD2D;
        n6 += (n5 | n4) ^ 0x7FCF62AD;
        return n6 ^= (n5 | n4) ^ 0x7FCF86AA;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block21: {
            block20: {
                block19: {
                    block18: {
                        block22: {
                            break block22;
lbl1:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -2034903183;
                                break block18;
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

                            return;
lbl8:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1498484171;
                                break block18;
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
                                var2_4 ^= var3_3 ^ 1343998766;
                                ** continue;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 136164145;
                                break block19;
                                break;
                            }
                        }
                        var4_1 = -102016032;
                        var1_2 = iL.h & -102016032 ^ -736606253;
                        var3_3 = 0;
                        var2_4 = (var1_2 | var4_1) ^ 50689404;
                        ** while (true)
                        this.Px();
                        var3_3 = (var1_2 | var4_1) ^ -1909390014;
                        break block18;
lbl28:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 743786271;
                            break block20;
                            break;
                        }
                        this.h = true;
                        var3_3 = (var1_2 | var4_1) ^ -1328066274;
                    }
lbl34:
                    // 4 sources

                    block17: while (true) {
                        switch (var3_3) {
                            default: {
                                continue block17;
                            }
                            case -1592323693: {
                                ** continue;
                            }
                            case -1380484449: {
                                ** continue;
                            }
                            case 2068744322: {
                                break block21;
                            }
                            case 1532341702: {
                                ** continue;
                            }
                            case 154507078: {
                                ** continue;
                            }
                            case 1294733037: {
                                ** continue;
                            }
                            case 1942641329: {
                                break;
                            }
                        }
                        ** continue;
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 1347167596;
                ** GOTO lbl34
            }
            var3_3 = (var1_2 | var4_1) ^ 1558990432;
            ** GOTO lbl34
        }
        var3_3 = (var1_2 | var4_1) ^ -187774795;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onCombatTick() {
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
    private boolean Po() {
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
    private void Pp() {
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
    private void Pq() {
        block154: {
            block156: {
                block157: {
                    block152: {
                        block155: {
                            block153: {
                                var12_1 = -1261625790;
                                var9_2 = iL.h & -1261625790 ^ 328668457;
                                var11_3 = 0;
                                var10_13 = (var9_2 | var12_1) ^ -848670253;
                                var11_3 = (var9_2 | var12_1) ^ -2026235316;
                                ** GOTO lbl319
                                while (true) {
                                    var11_3 = (var9_2 | var12_1) ^ -1719412809;
                                    break block152;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl-1000:
                                // 4 sources

                                {
                                    block159: {
                                        block158: {
                                            switch (var11_3) {
                                                case 859943120: {
                                                    this.Pt();
                                                    break block158;
                                                }
                                                case -2117883366: {
                                                    this.Ps(var3_7.method_1005());
                                                    break block158;
                                                }
                                                case -839084506: {
                                                    var10_13 ^= var11_3 ^ 597656506;
                                                    break;
                                                }
                                                case 2054972773: {
                                                    if (this.f) ** GOTO lbl46
                                                    var11_3 = (var9_2 | var12_1) ^ -1596513316;
                                                    break block159;
                                                }
                                                case 386415799: {
                                                    var10_13 ^= var11_3 ^ -110417621;
                                                    var11_3 = (var9_2 | var12_1) ^ 907851121;
                                                    break block159;
                                                }
                                                case 146669951: {
                                                    var10_13 ^= var11_3 ^ -2020213458;
                                                    var11_3 = (var9_2 | var12_1) ^ 2061117021;
                                                    break block159;
                                                }
                                                case 669674006: {
                                                    var7_11 = iD.autoMaceActive();
                                                    var11_3 = (var9_2 | var12_1) ^ -1901449467;
                                                    ** GOTO lbl478
                                                }
                                                case -855295690: {
                                                    if (!((Boolean)this.f.getValue()).booleanValue()) ** GOTO lbl46
                                                    var11_3 = (var9_2 | var12_1) ^ 1873007226;
                                                    break block159;
                                                }
                                                case 1386370348: {
                                                    var10_13 ^= var11_3 ^ 1096848352;
                                                    var11_3 = (var9_2 | var12_1) ^ -1875544707;
                                                    break block159;
                                                }
lbl46:
                                                // 2 sources

                                                var11_3 = (var9_2 | var12_1) ^ 2049149261;
                                                continue block117;
                                                case -662909679: {
                                                    var11_3 = (var9_2 | var12_1) ^ -844924402;
                                                    break block159;
                                                }
                                            }
                                            var11_3 = (var9_2 | var12_1) ^ -2069975109;
                                            continue;
                                        }
                                        var11_3 = (var9_2 | var12_1) ^ -444773817;
                                        continue;
                                    }
lbl57:
                                    // 2 sources

                                    ** while (true)
                                }
lbl58:
                                // 1 sources

                                while (true) {
                                    var11_3 = (var9_2 | var12_1) ^ 1948073465;
                                    break block153;
                                    break;
                                }
lbl61:
                                // 1 sources

                                while (true) {
                                    var11_3 = (var9_2 | var12_1) ^ 1717955248;
                                    break block152;
lbl64:
                                    // 1 sources

                                    while (true) {
                                        var11_3 = (var9_2 | var12_1) ^ -655356272;
                                        break block152;
                                        break;
                                    }
                                    break;
                                }
lbl67:
                                // 1 sources

                                while (true) {
                                    var10_13 ^= 999479404;
                                    var5_9 = iL.a.field_1724.method_18798();
                                    var11_3 = (var9_2 | var12_1) ^ -1418765425;
                                    ** GOTO lbl512
                                    break;
                                }
lbl72:
                                // 1 sources

                                while (true) {
                                    var11_3 = (var9_2 | var12_1) ^ -102291616;
                                    break block154;
                                    break;
                                }
                            }
lbl76:
                            // 3 sources

                            block124: while (true) {
                                switch (var11_3) {
                                    case -1826472505: {
                                        var10_13 ^= var11_3 ^ 70213944;
                                        ** GOTO lbl132
                                    }
                                    case 955873123: {
                                        if (this.g) ** GOTO lbl161
                                        ** GOTO lbl170
                                    }
                                    case 669065859: {
                                        var10_13 ^= var11_3 ^ -1360203513;
                                        ** GOTO lbl146
                                    }
                                    case 1587292694: {
                                        var10_13 ^= var11_3 ^ -1737793717;
                                        ** GOTO lbl139
                                    }
                                    case -1400830312: {
                                        ** break;
                                    }
                                    case -1753882899: {
                                        var10_13 ^= var11_3 ^ 813444935;
                                        ** GOTO lbl159
                                    }
                                    case 1381767108: {
                                        if (this.c > iL.Pn((var10_13 | var11_3 ^ -426702458) ^ (var11_3 ^ -1538042210), (var9_2 | var11_3 ^ -426702458) ^ ((var10_13 | var11_3 ^ -426702458) ^ (var11_3 ^ 764008075)))) ** GOTO lbl183
                                        ** GOTO lbl185
                                    }
                                    case -1855694279: {
                                        var10_13 ^= var11_3 ^ 1369043387;
                                        ** GOTO lbl168
                                    }
                                    case -1260931330: {
                                        this.Pw();
                                        ** GOTO lbl122
                                    }
                                    case 2006687798: {
                                        this.b = -1;
                                        ** GOTO lbl157
                                    }
                                    case 1891332385: {
                                        return;
                                    }
                                    case -2086137855: {
                                        this.a.release();
                                        ** break;
                                    }
                                    case -696276039: {
                                        var10_13 ^= var11_3 ^ -1709445968;
                                        ** GOTO lbl152
                                    }
                                    case 862653698: {
                                        if (this.PE(this.a)) ** GOTO lbl203
                                        ** GOTO lbl137
                                    }
lbl118:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ 1674822762;
                                    continue block124;
lbl120:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ -444397393;
                                    continue block124;
lbl122:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ -1792609939;
                                    continue block124;
                                    case 1107598333: {
                                        if (this.c <= iL.Pn((var10_13 | var11_3 ^ -154565185) ^ (var11_3 ^ -1274291548), (var9_2 | var11_3 ^ -154565185) ^ ((var10_13 | var11_3 ^ -154565185) ^ (var11_3 ^ -402768641)))) ** GOTO lbl199
                                        ** GOTO lbl183
                                    }
                                    case -11286095: {
                                        if (!iL.a.field_1724.method_6047().method_31574(class_1802.field_49814)) {
                                            var11_3 = (var9_2 | var12_1) ^ -1816915095;
                                            continue block124;
                                        }
                                        break block155;
                                    }
lbl132:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ 1217189594;
                                    continue block124;
                                    case -417754323: {
                                        var11_3 = (var9_2 | var12_1) ^ -170163050;
                                        ** GOTO lbl210
                                    }
lbl137:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ 548061574;
                                    continue block124;
lbl139:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ -949719478;
                                    continue block124;
                                    case -917695957: {
                                        var10_13 ^= var11_3 ^ -1526765674;
                                        ** GOTO lbl163
                                    }
                                    case -1010687342: {
                                        return;
                                    }
lbl146:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ -2068573591;
                                    continue block124;
                                    case -737355007: {
                                        var10_13 ^= var11_3 ^ -2125457462;
                                        var11_3 = (var9_2 | var12_1) ^ -1110635061;
                                        continue block124;
                                    }
lbl152:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ 1379835505;
                                    continue block124;
                                    case 797599622: {
                                        var2_6 = lw.findInHotbar(class_1802.field_49814);
                                        ** continue;
                                    }
lbl157:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ 555690192;
                                    continue block124;
lbl159:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ 880217962;
                                    continue block124;
lbl161:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ -1874969112;
                                    continue block124;
lbl163:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ -1893308408;
                                    continue block124;
                                    case -292180616: {
                                        if (!var1_4) ** GOTO lbl185
                                        ** GOTO lbl205
                                    }
lbl168:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ -1069236387;
                                    continue block124;
lbl170:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ -1634992201;
                                    continue block124;
                                    case -438206182: {
                                        var2_5 = iL.a.field_1724.method_33571();
                                        ** GOTO lbl212
                                    }
                                    case 168956576: {
                                        this.Pt();
                                        var11_3 = (var9_2 | var12_1) ^ -381471363;
                                        ** GOTO lbl210
                                    }
                                    case -884958150: {
                                        var10_13 ^= var11_3 ^ -1178317354;
                                        var11_3 = (var9_2 | var12_1) ^ 50899349;
                                        continue block124;
                                    }
lbl183:
                                    // 2 sources

                                    var11_3 = (var9_2 | var12_1) ^ 2090828625;
                                    continue block124;
lbl185:
                                    // 2 sources

                                    var11_3 = (var9_2 | var12_1) ^ 1355189318;
                                    continue block124;
                                    case 693428444: {
                                        var10_13 ^= var11_3 ^ 344537132;
                                        ** GOTO lbl201
                                    }
                                    case 586804742: {
                                        var10_13 ^= var11_3 ^ 835791394;
                                        ** continue;
                                    }
                                    case 1410739200: {
                                        this.g = true;
                                        var11_3 = (var9_2 | var12_1) ^ 620569260;
                                        continue block124;
                                    }
                                    case -1968885895: {
                                        return;
                                    }
lbl199:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ 2123500864;
                                    continue block124;
lbl201:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ -473353365;
                                    continue block124;
lbl203:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ 1637922002;
                                    continue block124;
lbl205:
                                    // 1 sources

                                    var11_3 = (var9_2 | var12_1) ^ 459151859;
                                    continue block124;
                                    case -1765787717: {
                                        var10_13 ^= var11_3 ^ -920909377;
                                        var11_3 = (var9_2 | var12_1) ^ 1031417874;
                                    }
lbl210:
                                    // 5 sources

                                    default: {
                                        continue block124;
                                    }
lbl212:
                                    // 1 sources

                                    var10_13 ^= -931691431;
                                    var3_7 = this.a.method_5829();
                                    var10_13 ^= 550082028;
                                    var4_8 = iL.PB(var2_5, var3_7);
                                    ** continue;
                                    case 610995202: {
                                        var10_13 ^= var11_3 ^ -1761930850;
                                        var11_3 = (var9_2 | var12_1) ^ -1739228947;
                                        ** GOTO lbl210
                                    }
                                    case -2095279763: 
                                }
                                var10_13 ^= var11_3 ^ -1787665911;
                                var11_3 = (var9_2 | var12_1) ^ 1498067475;
                                continue;
                                break;
                            }
lbl225:
                            // 1 sources

                            while (true) {
                                var11_3 = (var9_2 | var12_1) ^ -50328858;
                                break block154;
                                break;
                            }
                            while (true) {
                                var11_3 = (var9_2 | var12_1) ^ -1279126332;
                                break block156;
                                break;
                            }
lbl231:
                            // 1 sources

                            while (true) {
                                var11_3 = (var9_2 | var12_1) ^ 1180894278;
                                break block154;
                                break;
                            }
                            while (true) {
                                var11_3 = (var9_2 | var12_1) ^ 1017499202;
                                break block156;
                                break;
                            }
lbl237:
                            // 1 sources

                            while (true) {
                                var11_3 = (var9_2 | var12_1) ^ 384927547;
                                ** GOTO lbl512
                                break;
                            }
lbl240:
                            // 1 sources

                            while (true) {
                                var11_3 = (var9_2 | var12_1) ^ 872339840;
                                break block154;
                                break;
                            }
                            var11_3 = (var9_2 | var12_1) ^ 1140228632;
                            block132: while (true) {
                                block160: {
                                    switch (var11_3) {
                                        case 17416987: {
                                            if (var2_6 < 0) break block132;
                                            break;
                                        }
                                        case -729596133: {
                                            lw.selectSlotSynced(var2_6);
                                            break block132;
                                        }
                                        case 349198582: {
                                            var11_3 = (var9_2 | var12_1) ^ 1666982000;
                                        }
                                        default: {
                                            continue block132;
                                        }
                                        case -198599309: {
                                            var10_13 ^= var11_3 ^ 1186562287;
                                            break block160;
                                        }
                                    }
                                    var11_3 = (var9_2 | var12_1) ^ -1559279715;
                                    continue;
                                }
                                var11_3 = (var9_2 | var12_1) ^ -1227432848;
                            }
                        }
                        var11_3 = (var9_2 | var12_1) ^ 649807186;
                        ** GOTO lbl76
lbl267:
                        // 1 sources

                        while (true) {
                            var11_3 = (var9_2 | var12_1) ^ 166627953;
                            break block154;
                            break;
                        }
                    }
                    block134: while (true) {
                        switch (var11_3) {
                            case 1763687748: {
                                ** break;
                            }
                            case 401545138: {
                                var10_13 ^= var11_3 ^ -1090866896;
                                ** GOTO lbl342
                            }
                            case 1409856694: {
                                if (iL.a.field_1724.method_5799()) ** GOTO lbl312
                                ** GOTO lbl297
                            }
                            case -1952298584: {
                                var10_13 ^= var11_3 ^ 611659132;
                                ** break;
                            }
                            case 185266091: {
                                if (!iL.a.field_1724.method_5765()) ** GOTO lbl330
                                ** GOTO lbl312
                            }
                            case 1802451225: {
                                var10_13 ^= var11_3 ^ 239971682;
                                ** continue;
                            }
                            case 777832668: {
                                var11_3 = (var9_2 | var12_1) ^ -1126829888;
                                ** GOTO lbl319
                            }
                            case 820315431: {
                                ** GOTO lbl334
                            }
lbl295:
                            // 1 sources

                            var11_3 = (var9_2 | var12_1) ^ -557800913;
                            ** GOTO lbl319
lbl297:
                            // 1 sources

                            var11_3 = (var9_2 | var12_1) ^ 76777642;
                            ** GOTO lbl319
lbl299:
                            // 1 sources

                            var10_13 ^= -1344838444;
                            ** GOTO lbl311
                            case -1776514889: {
                                if (!iL.a.field_1724.method_24828()) {
                                    ** continue;
                                }
                                ** GOTO lbl312
                            }
                            case -119092476: {
                                v0 = false;
                                break block157;
                            }
                            case 542722564: {
                                if (iL.a.field_1724.method_6101()) ** GOTO lbl312
                                ** GOTO lbl338
                            }
lbl311:
                            // 1 sources

                            if (!iL.a.field_1724.method_6128()) ** continue;
lbl312:
                            // 5 sources

                            var11_3 = (var9_2 | var12_1) ^ -1607464743;
                            ** GOTO lbl319
                            case -776276517: {
                                ** GOTO lbl336
                            }
                            case 1865355771: {
                                ++this.c;
                                var11_3 = (var9_2 | var12_1) ^ 376831974;
                            }
lbl319:
                            // 7 sources

                            default: {
                                continue block134;
                            }
                            case -1582636915: {
                                var10_13 ^= var11_3 ^ -1852230513;
                                ** GOTO lbl340
                            }
                            case -241720220: {
                                var10_13 ^= var11_3 ^ 1484915430;
                                var11_3 = (var9_2 | var12_1) ^ 1329189999;
                                continue block134;
                            }
                            case -1286826047: {
                                ** GOTO lbl332
                            }
lbl330:
                            // 1 sources

                            var11_3 = (var9_2 | var12_1) ^ 1179171599;
                            continue block134;
lbl332:
                            // 1 sources

                            var11_3 = (var9_2 | var12_1) ^ -1752803985;
                            continue block134;
lbl334:
                            // 1 sources

                            var11_3 = (var9_2 | var12_1) ^ -592435598;
                            continue block134;
lbl336:
                            // 1 sources

                            var11_3 = (var9_2 | var12_1) ^ -472405027;
                            continue block134;
lbl338:
                            // 1 sources

                            var11_3 = (var9_2 | var12_1) ^ 1014847171;
                            continue block134;
lbl340:
                            // 1 sources

                            var11_3 = (var9_2 | var12_1) ^ 566466524;
                            continue block134;
lbl342:
                            // 1 sources

                            var11_3 = (var9_2 | var12_1) ^ -1996364938;
                            continue block134;
                            case 1054800925: 
                        }
                        break;
                    }
                    v0 = true;
                }
                var10_13 ^= 1267849144;
                var1_4 = v0;
                var11_3 = (var9_2 | var12_1) ^ 885231110;
                ** while (true)
lbl351:
                // 1 sources

                while (true) {
                    var11_3 = (var9_2 | var12_1) ^ 349656540;
                    break block156;
                    break;
                }
lbl354:
                // 1 sources

                while (true) {
                    var11_3 = (var9_2 | var12_1) ^ 1466919034;
                    break block156;
                    break;
                }
lbl357:
                // 1 sources

                while (true) {
                    var11_3 = (var9_2 | var12_1) ^ -1210315071;
                    ** GOTO lbl512
                    break;
                }
lbl360:
                // 1 sources

                while (true) {
                    var11_3 = (var9_2 | var12_1) ^ 292515181;
                    break block156;
                    break;
                }
lbl363:
                // 1 sources

                while (true) {
                    var11_3 = (var9_2 | var12_1) ^ -1451019939;
                    break block156;
                    break;
                }
lbl366:
                // 1 sources

                while (true) {
                    var11_3 = (var9_2 | var12_1) ^ -1697696495;
                    ** GOTO lbl512
                    while (true) {
                        var11_3 = (var9_2 | var12_1) ^ -784102622;
                        if (true) ** GOTO lbl512
                        break;
                    }
                    break;
                }
            }
            block142: while (true) {
                switch (var11_3) {
                    case 321352559: {
                        ++this.a;
                        ** GOTO lbl416
                    }
                    case 1387052862: {
                        var10_13 ^= var11_3 ^ -1953302165;
                        var11_3 = (var9_2 | var12_1) ^ -1392207182;
                        continue block142;
                    }
                    case -525306095: {
                        var10_13 ^= var11_3 ^ -1432263341;
                        ** continue;
                    }
                    case -921551131: {
                        return;
                    }
                    case -1559737673: {
                        if (!eA.isWithinAngle(ko.wireYaw(), ko.wirePitch(), var8_12[0], var8_12[1], 4.0f)) ** continue;
                        ** break;
                    }
                    case -1498385914: {
                        this.a = 0;
                        ** GOTO lbl416
                    }
                    case 185780573: {
                        var10_13 ^= var11_3 ^ 31449722;
                        var11_3 = (var9_2 | var12_1) ^ -1527223292;
                        ** GOTO lbl421
                    }
                    case 509357622: {
                        if (var6_10) ** continue;
                        ** GOTO lbl410
                    }
                    case 69012399: {
                        var10_13 ^= var11_3 ^ 248520840;
                        ** continue;
                    }
                    case 450594265: {
                        return;
                    }
                    case 1809972052: {
                        var10_13 ^= var11_3 ^ -280554589;
                        ** continue;
                    }
lbl408:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ -1127360970;
                    continue block142;
lbl410:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ -248396178;
                    continue block142;
                    case 708393346: {
                        this.Pr(var3_7, var5_9);
                        var11_3 = (var9_2 | var12_1) ^ -445407147;
                        ** GOTO lbl421
                    }
lbl416:
                    // 2 sources

                    var11_3 = (var9_2 | var12_1) ^ -599858113;
                    continue block142;
                    case 1190058245: {
                        var10_13 ^= var11_3 ^ -1709779451;
                        var11_3 = (var9_2 | var12_1) ^ 2127372686;
                    }
lbl421:
                    // 4 sources

                    default: {
                        continue block142;
                    }
                    case -1954885335: 
                }
                var10_13 ^= var11_3 ^ -510858559;
                var11_3 = (var9_2 | var12_1) ^ -1645861143;
            }
        }
        block143: while (true) {
            block161: {
                switch (var11_3) {
                    case 963981422: {
                        var10_13 ^= var11_3 ^ -1485881419;
                        ** continue;
                    }
                    case 1390597162: {
                        this.a.aim(var4_8, ((Float)this.a.getValue()).floatValue());
                        ** continue;
                    }
                    case 1312307211: {
                        var10_13 ^= var11_3 ^ -1743310150;
                        ** continue;
                    }
                    case 992379737: {
                        return;
                    }
                    case 1679020341: {
                        var10_13 ^= var11_3 ^ 1013556087;
                        ** break;
                    }
                    case -1426632878: {
                        this.a.release();
                        ** GOTO lbl484
                    }
                    case 1490630441: {
                        var10_13 ^= var11_3 ^ -1456243385;
                        ** GOTO lbl482
                    }
                    case 1062026447: {
                        if (this.f) {
                            ** continue;
                        }
                        ** GOTO lbl477
                    }
                    case -239330515: {
                        var11_3 = (var9_2 | var12_1) ^ -911346949;
                        continue block143;
                    }
                    case -1104046822: {
                        this.a.release();
                        var11_3 = (var9_2 | var12_1) ^ -741552546;
                        ** GOTO lbl478
                    }
                    case -961036493: {
                        var10_13 ^= var11_3 ^ -1396018741;
                        ** GOTO lbl480
                    }
                    case 1910064237: {
                        return;
                    }
                    case 1256134029: {
                        var10_13 ^= var11_3 ^ 1194765684;
                        ** GOTO lbl471
                    }
lbl469:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ -1929798606;
                    ** GOTO lbl478
lbl471:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ -335412183;
                    ** GOTO lbl478
                    case -2078161173: {
                        if (var7_11) {
                            ** continue;
                        }
                        ** GOTO lbl495
                    }
lbl477:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ 1153550884;
lbl478:
                    // 9 sources

                    default: {
                        continue block143;
                    }
lbl480:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ -2003688540;
                    continue block143;
lbl482:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ -972662010;
                    continue block143;
lbl484:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ -284809150;
                    continue block143;
                    case -7774264: {
                        var10_13 ^= var11_3 ^ -134897953;
                        var11_3 = (var9_2 | var12_1) ^ 489181241;
                        ** GOTO lbl478
                    }
                    case -216083121: {
                        var10_13 ^= var11_3 ^ 235387904;
                        break block161;
                    }
                    case 2121461136: {
                        if (var6_10) ** GOTO lbl497
lbl495:
                        // 2 sources

                        var11_3 = (var9_2 | var12_1) ^ 1902682200;
                        ** GOTO lbl478
lbl497:
                        // 1 sources

                        var11_3 = (var9_2 | var12_1) ^ 1213612195;
                        ** GOTO lbl478
                    }
                    case 1541217090: 
                }
                var8_12 = eA.getRotationsTo(var2_5, var4_8);
                ** continue;
            }
            var11_3 = (var9_2 | var12_1) ^ -448935103;
        }
        while (true) {
            block162: {
                var11_3 = (var9_2 | var12_1) ^ 53311441;
                break block162;
lbl508:
                // 1 sources

                while (true) {
                    var6_10 = v1;
                    var11_3 = (var9_2 | var12_1) ^ -1084154348;
                    ** GOTO lbl57
                    break;
                }
            }
            block147: while (true) {
                switch (var11_3) {
                    default: {
                        continue block147;
                    }
                    case 201130: {
                        if (!(var5_9.field_1351 < 0.0)) ** continue;
                        ** continue;
                    }
                    case 481314020: {
                        var10_13 ^= var11_3 ^ 537182655;
                        ** continue;
                    }
                    case 1721537609: {
                        var10_13 ^= var11_3 ^ 1329727165;
                        ** continue;
                    }
                    case -1259181894: {
                        v1 = true;
                        ** GOTO lbl531
                    }
                    case -1590781872: {
                        v1 = false;
lbl531:
                        // 2 sources

                        var10_13 ^= -159238363;
                        ** continue;
                    }
                    case 756034170: 
                }
                break;
            }
            var10_13 ^= var11_3 ^ 80656526;
        }
    }

    /*
     * Exception decompiling
     */
    private void Pr(class_238 var1_1, class_243 var2_2) {
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
    private void Ps(class_243 var1_1) {
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
    private void Pt() {
        block35: {
            block34: {
                block33: {
                    block37: {
                        block36: {
                            block32: {
                                break block37;
lbl1:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 1115686248;
                                    break block32;
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -992994447;
                                    break block33;
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -361490136;
                                    break block34;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1802598851;
                                    break block34;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 1137380418;
                                    break block34;
                                    break;
                                }
lbl16:
                                // 1 sources

                                return;
lbl18:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -1120998792;
                                    break block35;
                                    break;
                                }
lbl21:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 715793378;
                                    ** continue;
                                    break;
                                }
lbl24:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1752642164;
                                    break block34;
                                    break;
                                }
lbl27:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 1141808410;
                                    break block36;
                                    break;
                                }
lbl30:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 519891982;
                                    ** continue;
                                    break;
                                }
lbl33:
                                // 1 sources

                                while (true) {
                                    this.a = false;
                                    ** GOTO lbl82
                                    break;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ -1146473288;
                            break block34;
lbl39:
                            // 1 sources

                            while (true) {
                                this.b = false;
                                ** continue;
                                break;
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ -1450840071;
                        break block34;
                    }
                    var4_1 = -1376099961;
                    var1_2 = iL.h & -1376099961 ^ -330549774;
                    var3_3 = 0;
                    var2_4 = (var1_2 | var4_1) ^ 223677897;
                    ** while (true)
lbl51:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1183934949;
                        break block34;
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 1622888786;
            }
lbl57:
            // 5 sources

            block29: while (true) {
                switch (var3_3) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block29;
                        }
                        break;
                    }
                    case 2032539445: {
                        ** continue;
                    }
                    case 2054600827: {
                        ** continue;
                    }
                    case 126512351: {
                        ** continue;
                    }
                    case 1418781676: {
                        ** continue;
                    }
                    case 2037445578: {
                        break block29;
                    }
                    case -453605525: {
                        ** continue;
                    }
                    case -605249922: {
                        ** continue;
                    }
                    case 611081194: {
                        ** continue;
                    }
                    case 1448362319: {
                        ** continue;
                    }
                    case -1372227147: {
                        ** continue;
                    }
lbl82:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 151581340;
                    ** continue;
                    case -1216016707: {
                        this.i = false;
                        break;
                    }
                }
                break;
            }
            var3_3 = (var1_2 | var4_1) ^ -913166819;
            ** GOTO lbl57
lbl89:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 907209609;
                ** GOTO lbl57
                break;
            }
            {
                case -1924848475: {
                    this.d = false;
                    ** continue;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -1797758270;
            ** GOTO lbl57
            {
                ** case 1148951054:
            }
lbl98:
            // 1 sources

            this.c = false;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ 1518041930;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static double Pu(double var0, double var2_2, float var4_1) {
        var7_3 = iL.h & -1347221151 ^ -1793416127;
        var9_4 = 0;
        ** GOTO lbl14
lbl4:
        // 1 sources

        while (true) {
            var8_6 ^= 260697977;
            ** GOTO lbl23
            break;
        }
lbl7:
        // 1 sources

        block6: while (true) {
            switch (var9_4) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block6;
                    }
                    break;
                }
                case 1521577914: {
                    break block6;
                }
lbl14:
                // 1 sources

                var8_6 = (var7_3 | -1347221151) ^ 1892677001;
                var9_4 = (var7_3 | -1347221151) ^ -452279589;
                ** GOTO lbl-1000
lbl17:
                // 1 sources

                while (true) {
                    var9_4 = (var7_3 | -1347221151) ^ 239998339;
                    ** continue;
                    break;
                }
                case -94363208: {
                    var8_6 ^= var9_4 ^ 1081698023;
                    ** continue;
                }
lbl23:
                // 1 sources

                return var0 * Math.cos(var5_5) - var2_2 * Math.sin(var5_5);
            }
            break;
        }
        var9_4 = (var7_3 | -1347221151) ^ 1172016345;
        ** while (true)
        {
            ** case -1309296414:
        }
lbl27:
        // 1 sources

        var5_5 = Math.toRadians(var4_1);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static double Pv(double var0, double var2_2, float var4_1) {
        var7_3 = iL.h & 62177265 ^ -384019467;
        var9_4 = 0;
        ** GOTO lbl22
lbl4:
        // 1 sources

        return var2_2 * Math.cos(var5_5) + var0 * Math.sin(var5_5);
lbl6:
        // 1 sources

        block6: while (true) {
            switch (var9_4) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block6;
                    }
                    break;
                }
                case -1930690528: {
                    var8_6 ^= var9_4 ^ 1747734529;
                    break block6;
                }
                case -246888822: {
                    var5_5 = Math.toRadians(var4_1);
                    ** GOTO lbl20
                }
lbl17:
                // 1 sources

                while (true) {
                    var9_4 = (var7_3 | 62177265) ^ 1733361621;
                    ** GOTO lbl-1000
                    break;
                }
lbl20:
                // 1 sources

                var8_6 ^= 1494393123;
                ** continue;
lbl22:
                // 1 sources

                var8_6 = (var7_3 | 62177265) ^ 1925108030;
                var9_4 = (var7_3 | 62177265) ^ -1201925668;
                ** continue;
                case 1407249961: {
                    ** continue;
                }
            }
            break;
        }
        var9_4 = (var7_3 | 62177265) ^ 452213119;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block28: {
            var9 = -2079275178;
            var8_1 = 1529817273;
            iL.h = mK.a(MethodHandles.lookup().lookupClass(), 1813040993);
            var7_2 = 0;
            var6_6 = 383478776;
            var7_2 = var9 ^ -639257024;
            break block28;
lbl-1000:
            // 3 sources

            {
                switch (var7_2) {
                    case -1378249717: {
                        var6_6 ^= var7_2 ^ -255169051;
                        ** break;
                    }
                    case -878476618: {
                        var6_6 ^= var7_2 ^ -1437090554;
                        var7_2 = var9 ^ 905988101;
                        break;
                    }
                    case 1520628561: {
                        var3_7 = 0;
                        ** GOTO lbl21
                    }
lbl19:
                    // 1 sources

                    var7_2 = var9 ^ -558746617;
                    continue block19;
lbl21:
                    // 1 sources

                    var6_6 ^= 433374188;
                    var4_8 = 0;
                    break block19;
                    case -1307537581: {
                        iL.a = new int[var1_4];
                        var7_2 = var9 ^ 701059933;
                        continue block19;
                    }
                }
lbl28:
                // 3 sources

                ** while (true)
            }
            while (true) {
                var5_9 = (var0_3[var3_7] & (((var6_6 ^= -649534301) | var9) ^ -1523322976)) << ((var6_6 | var9) ^ -1523323065) | (var0_3[var3_7 + 1] & ((var6_6 | var9) ^ -1523322976)) << ((var6_6 | var9) ^ -1523323057) | (var0_3[var3_7 + 2] & ((var6_6 | var9) ^ -1523322976)) << ((var6_6 | var9) ^ -1523323049) | var0_3[var3_7 + 3] & ((var6_6 | var9) ^ -1523322976);
                var7_2 = var9 ^ 1998579124;
                ** GOTO lbl63
                break;
            }
        }
        while (true) {
            switch (var7_2) {
                case 1584173831: {
                    var2_5 = (var6_6 | var7_2 ^ -629386159) ^ (var7_2 ^ 1091065976) ^ iL.h;
                    var6_6 ^= -56671100;
                    ** break;
                }
                case 1576366358: {
                    var7_2 = var9 ^ 2110796289;
                    break;
                }
lbl43:
                // 1 sources

                var0_3 = "\u0016\u00f2L!4\u00fa\u00bd\u00e3B\u00e1\u00b3\u00a7\u00ee\u00e7\u001d\u00bd\u00d9M\u0013\u00d6RG\u0011<\u0088hp2\u00b4\u00da\u000f\u00b3x\u00a5\u0094\u00fb\u00d1fY\u009f\u00e4Q'\u001b\u00d2\u0088\u00e3\u00e6d]\u00f4\u00f6M\u000b\u000fX\u0082U\u0093\u00fe\u0081y\u0001B\u00d3\u000f\u00ba\u00de(\u000eQ\u0083{\u00f5\u0011\u0006\"\u0019P\u0000\u0006\u00a4\u00cc#\u00a8\u0099\u00c9xG\u00c0C[$\u00c1\u0096\u00fb\u00f8\u00c8\u00f8\b\u000b\u00a0:t\u00c4\u00c4\u00d2\u0016\u00fd\u00f7\u00afU\u00dc\u009c\u009eH\u00fd\u0086\u0084K*\u000f\u009bkZ_\u009bH".getBytes("ISO-8859-1");
                var6_6 ^= 1243837981;
                var1_4 = var0_3.length / 4;
                var7_2 = var9 ^ 1337148896;
                ** GOTO lbl28
                case -104794793: {
                    var6_6 ^= var7_2 ^ -2131795416;
                    var7_2 = var9 ^ -629386159;
                }
            }
        }
lbl52:
        // 1 sources

        while (true) {
            var7_2 = var9 ^ 1134179157;
            if (true) ** GOTO lbl63
            break;
        }
        block24: while (true) {
            var7_2 = var9 ^ -557596754;
            ** GOTO lbl63
lbl58:
            // 1 sources

            while (true) {
                var7_2 = var9 ^ var8_1;
                if (true) ** GOTO lbl63
                break;
            }
            block26: while (true) {
                var7_2 = var9 ^ -1031166989;
lbl63:
                // 5 sources

                block27: while (true) {
                    switch (var7_2) {
                        default: {
                            continue block27;
                        }
                        case -947194877: {
                            var6_6 ^= var7_2 ^ 2068850423;
                            ** continue;
                        }
                        case -1942537877: {
                            iL.a[var4_8] = var5_9 ^= var2_5;
                            continue block26;
                        }
                        case 1523808504: {
                            var3_7 += 4;
                            if (++var4_8 < var1_4) ** continue;
                            ** continue;
                        }
                        case 1184457893: {
                            var6_6 ^= var7_2 ^ 2047340247;
                            continue block24;
                        }
                        case -217111838: {
                            var6_6 ^= var7_2 ^ 383339571;
                            var7_2 = var9 ^ 136838717;
                            continue block27;
                        }
                        case -549457937: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        iL.g = iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162937), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ -2101791338)));
        iL.b = 1.6;
        iL.f = iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162936), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 729481143)));
        iL.b = 84.0f;
        iL.e = iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162939), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 508395828)));
        iL.a = 0.8;
        iL.a = 4.0f;
        iL.k = gj.decode("lpJ7Kf7yYS+uZSKuBhLJoSd1oZ1L", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162938), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ -1985117619))));
        iL.s = gj.decode("rqmrsRsnwzpOuQXMDW0FT9vxslfNMBQcUPLrHRbLZZw=", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162941), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ -1675350202))));
        iL.i = gj.decode("lyIWTqlRSQ==", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162940), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ -1408950846))));
        iL.a = gj.decode("YZtPbJNW6Vo=", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162943), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ -1942231596))));
        iL.t = gj.decode("tCbTfQ==", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162942), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ -653342985))));
        iL.f = gj.decode("7MKn2ZxEYXnUqA==", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162913), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 1479687304))));
        iL.u = gj.decode("qXsmo9L1dhT2w6JD", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162912), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 2134169239))));
        iL.q = gj.decode("bMMu8dcGXW9COhfoCNPUSlWHrU7hWSmANwFCfOCJiyAAxWrZukqH9Y/VDuvu", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162915), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 455581000))));
        iL.c = gj.decode("eei1gtGI6KOwhHwH", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162914), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ -1994740950))));
        iL.j = gj.decode("0h8KuA==", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162917), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 2088054486))));
        iL.o = gj.decode("s97m3+U2QQeNZgMJvOLFShV4trdi1Gqn7DQLCbY5wdIW8h6l/f/+c6UNfPgOCrOLxR7RXa2TWw08HX6WvJo=", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162916), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ -246714726))));
        iL.e = gj.decode("p1z9UcnJVTSFmw==", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162919), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 1098850208))));
        iL.h = gj.decode("u+6cC2UHXQQhOCNa", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162918), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 658612395))));
        iL.n = gj.decode("Nojz0TkCK1fT", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162921), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 861161635))));
        iL.r = gj.decode("Awg6jeSxf0y+", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162920), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 16271311))));
        iL.g = gj.decode("neYPfy1bqOabbDGvFW0ktJRdRZzPIcivixb6MDR7guTnTLAl9CZngdu7TGFsFpvnU7BxAnbTRorfalvYjvQDaUO5qg==", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162923), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 1066055043))));
        iL.p = gj.decode("easp22Sp+g==", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162922), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 874844637))));
        iL.m = gj.decode("xkCuvg==", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162925), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 1692734679))));
        iL.d = gj.decode("/g9JjTbWOM3YH1Q3V0E=", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162924), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ -657927042))));
        iL.l = gj.decode("JMaW70H9BTsCb97I24aymg==", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162927), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 619763096))));
        iL.b = gj.decode("r40Bu/GP8zq2sg==", iL.Pn((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ 307162926), var7_2 ^ var8_1 ^ ((var6_6 | var7_2 ^ var8_1) ^ (var7_2 ^ -1425902458))));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void Pw() {
        var4_1 = 157990213;
        var1_2 = iL.h & 157990213 ^ 1679010306;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1791995401;
        var3_3 = (var1_2 | var4_1) ^ 821559136;
        if (true) ** GOTO lbl9
        block17: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -170825076;
lbl9:
            // 2 sources

            block18: while (true) {
                switch (var3_3) {
                    case -1210721560: {
                        var2_4 ^= var3_3 ^ -155799087;
                        var3_3 = (var1_2 | var4_1) ^ 157910658;
                        continue block18;
                    }
                    case -648822968: {
                        var2_4 ^= var3_3 ^ -1054206290;
                        var3_3 = (var1_2 | var4_1) ^ -1883981403;
                        continue block18;
                    }
                    case -845039079: {
                        this.Pt();
                        var3_3 = (var1_2 | var4_1) ^ -831417257;
                        continue block18;
                    }
                    case 136705277: {
                        this.a = null;
                        var3_3 = (var1_2 | var4_1) ^ 1070638979;
                        continue block18;
                    }
                    case 512486907: {
                        var2_4 ^= var3_3 ^ 1139309520;
                        ** GOTO lbl66
                    }
                    case -1559614704: {
                        var2_4 ^= var3_3 ^ 2036407675;
                        ** break;
                    }
                    case -489748766: {
                        this.a.release();
                        ** break;
                    }
lbl36:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 949730221;
                    continue block18;
                    case -1944532288: {
                        var2_4 ^= var3_3 ^ 880516814;
                        ** GOTO lbl56
                    }
                    case 1678916037: {
                        this.a = kQ.c;
                        ** GOTO lbl58
                    }
                    case 1440744682: {
                        this.Py();
                        ** GOTO lbl60
                    }
                    case -1031637125: {
                        var2_4 ^= var3_3 ^ 1773932580;
                        continue block17;
                    }
                    case 1386944708: {
                        var2_4 ^= var3_3 ^ -1806335655;
                        var3_3 = (var1_2 | var4_1) ^ 401023348;
                        continue block18;
                    }
lbl54:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1945129660;
                    continue block18;
lbl56:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1700678586;
                    continue block18;
lbl58:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -513575545;
                    continue block18;
lbl60:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -626104913;
                    continue block18;
                    case 1569472551: {
                        var3_3 = (var1_2 | var4_1) ^ -1272446961;
                    }
                    default: {
                        continue block18;
                    }
lbl66:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -1596324514;
                    continue block18;
                    case -1733634613: {
                        return;
                    }
                    case 2057084467: 
                }
                this.b = -1;
                var3_3 = (var1_2 | var4_1) ^ -1342584772;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void Px() {
        block75: {
            block76: {
                var4_1 = -265165440;
                var1_2 = iL.h & -265165440 ^ 340857535;
                var3_3 = 0;
                ** GOTO lbl90
lbl5:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ 1512038342;
                    ** GOTO lbl75
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 763536;
                    ** GOTO lbl143
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -1240392481;
                    ** GOTO lbl75
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

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1801037538;
                    ** GOTO lbl143
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1897521808;
                    ** GOTO lbl143
                    break;
                }
                this.b = -1;
                var3_3 = (var1_2 | var4_1) ^ 1666599804;
                ** GOTO lbl143
lbl25:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 968007933;
                    ** GOTO lbl143
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    if (this.a == kQ.c) ** GOTO lbl58
                    ** continue;
                    break;
                }
lbl31:
                // 2 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 25428141;
                    ** GOTO lbl143
lbl34:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1786855787;
                        ** GOTO lbl143
                        break;
                    }
lbl37:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1666462195;
                        ** GOTO lbl143
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    block74: {
                        var3_3 = (var1_2 | var4_1) ^ -2075223108;
                        ** GOTO lbl143
lbl43:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1286852129;
                            ** GOTO lbl143
                            break;
                        }
lbl46:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -1440238360;
                            break block74;
                            break;
                        }
lbl49:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -721706193;
                            ** GOTO lbl143
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ -1561567375;
                    ** GOTO lbl143
lbl55:
                    // 1 sources

                    while (true) {
                        this.Pt();
                        ** continue;
                        break;
                    }
lbl58:
                    // 2 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1300476570;
                        ** GOTO lbl143
                        break;
                    }
lbl61:
                    // 1 sources

                    while (true) {
                        this.a = kQ.c;
                        ** continue;
                        break;
                    }
lbl64:
                    // 1 sources

                    while (true) {
                        this.a = null;
                        ** continue;
                        break;
                    }
                    break;
                }
lbl67:
                // 1 sources

                block56: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1160401252;
                    ** GOTO lbl143
lbl70:
                    // 1 sources

                    while (true) {
                        switch (var2_4) {
                            default: {
                                var3_3 = (var1_2 | var4_1) ^ 1631577497;
                                break block56;
                            }
lbl75:
                            // 2 sources

                            var3_3 = (var1_2 | var4_1) ^ 1012368305;
                            break block56;
lbl77:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -1122891875;
                                break block75;
                                break;
                            }
lbl80:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1053888553;
                                break block56;
lbl83:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 1643764371;
                                    var3_3 = (var1_2 | var4_1) ^ -50744428;
                                    break block56;
                                    break;
                                }
                                break;
                            }
                            case -2117648192: {
                                var3_3 = (var1_2 | var4_1) ^ 1554744521;
                                break block56;
                            }
lbl90:
                            // 1 sources

                            var2_4 = (var1_2 | var4_1) ^ 1381748286;
                            ** continue;
                            case 894534897: {
                                var3_3 = (var1_2 | var4_1) ^ -473413175;
                                break block56;
                            }
                        }
                        break;
                    }
                    break;
                }
                ** GOTO lbl143
lbl96:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1415562513;
                    ** GOTO lbl143
                    break;
                }
lbl99:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -15958418;
                    ** GOTO lbl31
                    break;
                }
lbl102:
                // 1 sources

                return;
lbl104:
                // 1 sources

                block64: while (true) {
                    switch (var2_4) {
                        case -1707108243: {
                            ** continue;
                        }
lbl108:
                        // 1 sources

                        while (true) {
                            this.Py();
                            ** continue;
                            break;
                        }
lbl111:
                        // 1 sources

                        while (true) {
                            this.a.release();
                            var3_3 = (var1_2 | var4_1) ^ 1627722131;
                            break block64;
                            break;
                        }
lbl115:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 1806003682;
                            ** continue;
                            break;
                        }
lbl118:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -1684801996;
                            break block76;
                            break;
                        }
lbl121:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 226109602;
                            ** continue;
                            break;
                        }
lbl124:
                        // 2 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -748509687;
                            break block64;
                            break;
                        }
                        default: {
                            var3_3 = (var1_2 | var4_1) ^ -1516411816;
                            break block64;
                        }
                        case -1507182207: {
                            var3_3 = (var1_2 | var4_1) ^ 1898759476;
                            break block64;
                        }
                    }
                    break;
                }
                ** GOTO lbl143
lbl134:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -1790024130;
                    ** GOTO lbl124
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -195107289;
            ** GOTO lbl143
        }
        block72: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -56567730;
lbl143:
            // 19 sources

            block73: while (true) {
                switch (var3_3) {
                    default: {
                        continue block73;
                    }
                    case -1462078602: {
                        ** continue;
                    }
                    case -1790045658: {
                        ** continue;
                    }
                    case 895424616: {
                        ** continue;
                    }
                    case -168429806: {
                        ** continue;
                    }
                    case 2056776399: {
                        ** continue;
                    }
                    case -1175304923: {
                        ** continue;
                    }
                    case -1319393573: {
                        ** continue;
                    }
                    case -1195230818: {
                        ** continue;
                    }
                    case 1453172942: {
                        ** continue;
                    }
                    case 655577526: {
                        ** continue;
                    }
                    case 1374458855: {
                        ** continue;
                    }
                    case -1624747683: {
                        ** continue;
                    }
                    case -937004018: {
                        ** continue;
                    }
                    case 398048886: {
                        ** continue;
                    }
                    case 3084696: {
                        ** continue;
                    }
                    case 147927025: {
                        ** continue;
                    }
                    case 545936528: {
                        ** continue;
                    }
                    case 143148075: {
                        ** continue;
                    }
                    case -1787501012: {
                        ** continue;
                    }
                    case -1759003453: {
                        ** continue;
                    }
                    case 1628391722: {
                        ** continue;
                    }
                    case 1883204611: {
                        continue block72;
                    }
                    case -2057489781: {
                        ** continue;
                    }
                    case -1759132084: {
                        ** continue;
                    }
                    case -842836158: {
                        var2_4 ^= var3_3 ^ -497950867;
                        ** continue;
                    }
                    case -193310417: {
                        ** continue;
                    }
                    case 1607585104: 
                }
                break;
            }
            break;
        }
        var2_4 ^= var3_3 ^ 395276513;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void Py() {
        var4_1 = -560534255;
        var1_2 = iL.h & -560534255 ^ 802643447;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1614045046;
        var3_3 = (var1_2 | var4_1) ^ 156547929;
        if (true) ** GOTO lbl15
        block11: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1883998326;
            ** GOTO lbl15
lbl10:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 624182974;
                if (true) ** GOTO lbl15
                break;
            }
            block13: while (true) {
                var3_3 = (var1_2 | var4_1) ^ 529888961;
lbl15:
                // 4 sources

                block14: while (true) {
                    block17: {
                        switch (var3_3) {
                            case -622609591: {
                                return;
                            }
                            case -1246301093: {
                                var2_4 ^= var3_3 ^ -502694886;
                                var3_3 = (var1_2 | var4_1) ^ 1198240366;
                                continue block14;
                            }
                            case 998046235: {
                                var2_4 ^= var3_3 ^ 1732566268;
                                ** break;
                            }
                            case -1873350747: {
                                var2_4 ^= var3_3 ^ -2094264823;
                                ** continue;
                            }
                            case -1195618407: {
                                if (!this.e) break block17;
                                var3_3 = (var1_2 | var4_1) ^ -995424276;
                            }
                            default: {
                                continue block14;
                            }
                            {
                            }
                            case 1236460288: {
                                iL.a.field_1690.field_1903.method_23481(false);
                                continue block13;
                            }
                            case -159168850: {
                                var3_3 = (var1_2 | var4_1) ^ 1247873452;
                                continue block14;
                            }
                            case -532509898: {
                                var2_4 ^= var3_3 ^ -1132810799;
                                continue block11;
                            }
lbl44:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -1234886921;
                            continue block14;
                            case 1885571709: 
                        }
                        this.e = false;
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1870729810;
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private boolean Pz() {
        block58: {
            block50: {
                block53: {
                    block46: {
                        block52: {
                            block56: {
                                block57: {
                                    block44: {
                                        block55: {
                                            block51: {
                                                block45: {
                                                    block49: {
                                                        block48: {
                                                            block47: {
                                                                block54: {
                                                                    break block54;
lbl1:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_5 ^= var4_3 ^ -1857189960;
                                                                        break block44;
                                                                        break;
                                                                    }
lbl4:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var3_5 ^= 954386702;
                                                                        break block45;
                                                                        break;
                                                                    }
lbl7:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_3 = (var2_2 | var5_1) ^ -1706352476;
                                                                        break block46;
                                                                        break;
                                                                    }
lbl10:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        v0 = false;
                                                                        ** GOTO lbl4
                                                                        break;
                                                                    }
lbl13:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_5 ^= var4_3 ^ 20334416;
                                                                        break block47;
                                                                        break;
                                                                    }
lbl16:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        v0 = true;
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var5_1 = 1289098358;
                                                                var2_2 = iL.h & 1289098358 ^ -661352544;
                                                                var4_3 = 0;
                                                                break block55;
lbl24:
                                                                // 1 sources

                                                                while (GLFW.glfwGetKey((long)iL.a.method_22683().method_4490(), (int)var1_4) == 1) {
                                                                    break block48;
                                                                }
                                                                break block56;
lbl27:
                                                                // 1 sources

                                                                while (true) {
                                                                    var4_3 = (var2_2 | var5_1) ^ 243886319;
                                                                    break block46;
lbl30:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_5 ^= var4_3 ^ -303548115;
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl33:
                                                                // 1 sources

                                                                while (true) {
                                                                    var4_3 = (var2_2 | var5_1) ^ 518022806;
                                                                    break block46;
lbl36:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if ((Integer)this.a.getValue() > 0) break block49;
                                                                        break block50;
                                                                        break;
                                                                    }
lbl39:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        v1 = iL.Pn((var3_5 | var4_3 ^ -1959545912) ^ (var4_3 ^ -2116399290), (var2_2 | var4_3 ^ -1959545912) ^ ((var3_5 | var4_3 ^ -1959545912) ^ (var4_3 ^ -2053876349)));
                                                                        break block51;
                                                                        break;
                                                                    }
lbl42:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_5 ^= var4_3 ^ 1114096529;
                                                                        break block52;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            var4_3 = (var2_2 | var5_1) ^ 447138484;
                                                            break block57;
lbl48:
                                                            // 1 sources

                                                            while (true) {
                                                                var3_5 ^= var4_3 ^ -1431417257;
                                                                ** GOTO lbl129
                                                                break;
                                                            }
lbl51:
                                                            // 1 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var4_3 = (var2_2 | var5_1) ^ 399284913;
                                                        break block57;
                                                    }
                                                    var4_3 = (var2_2 | var5_1) ^ -511374852;
                                                    break block46;
                                                }
                                                return v0;
                                            }
lbl62:
                                            // 2 sources

                                            while (true) {
                                                var3_5 ^= 99956714;
                                                ** continue;
                                                break;
                                            }
                                        }
                                        var3_5 = (var2_2 | var5_1) ^ -1933482810;
                                        var4_3 = (var2_2 | var5_1) ^ 995659902;
                                        break block46;
                                    }
                                    var4_3 = (var2_2 | var5_1) ^ 4003039;
                                }
lbl72:
                                // 4 sources

                                block37: while (true) {
                                    switch (var4_3) {
                                        default: {
                                            continue block37;
                                        }
                                        case -1226037769: {
                                            ** continue;
                                        }
                                        case -1909631497: {
                                            ** continue;
                                        }
                                        case -887487161: {
                                            ** continue;
                                        }
                                        case -965716670: {
                                            ** continue;
                                        }
                                        case -588543191: {
                                            ** GOTO lbl24
                                        }
                                        ** case 1619135552:
lbl87:
                                        // 1 sources

                                        ** continue;
                                    }
                                    break;
                                }
                                var1_4 = v1;
                                var4_3 = (var2_2 | var5_1) ^ 1782233601;
                                ** GOTO lbl72
lbl91:
                                // 1 sources

                                while (true) {
                                    v1 = (Integer)this.a.getValue();
                                    ** continue;
                                    break;
                                }
                            }
                            var4_3 = (var2_2 | var5_1) ^ -1135307850;
                            ** GOTO lbl72
lbl97:
                            // 1 sources

                            while (this.a.is(iL.t)) {
                                break block53;
lbl99:
                                // 1 sources

                                return true;
                            }
                            break block58;
                        }
                        var4_3 = (var2_2 | var5_1) ^ 456341576;
                    }
lbl105:
                    // 5 sources

                    block41: while (true) {
                        switch (var4_3) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block41;
                                }
                                break;
                            }
                            case 1456694982: {
                                ** continue;
                            }
                            case -1036584608: {
                                ** continue;
                            }
                            case -941250626: {
                                ** continue;
                            }
                            case 1221794144: {
                                ** continue;
                            }
                            case -410120312: {
                                break block41;
                            }
                            case -566717641: {
                                ** continue;
                            }
                            case -765462759: {
                                ** GOTO lbl97
                            }
                            case 1184743250: {
                                ** continue;
                            }
lbl126:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ 49155265;
                                ** continue;
                                break;
                            }
lbl129:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ 1392232961;
                            ** continue;
                            case -42732028: {
                                var3_5 ^= var4_3 ^ -845197029;
                                ** continue;
                            }
                        }
                        break;
                    }
                    var4_3 = (var2_2 | var5_1) ^ 564488690;
                    ** GOTO lbl105
                }
                var4_3 = (var2_2 | var5_1) ^ -1979320016;
                ** GOTO lbl105
            }
            var4_3 = (var2_2 | var5_1) ^ -1811577194;
            ** GOTO lbl105
        }
        var4_3 = (var2_2 | var5_1) ^ -1436292125;
        ** while (true)
        {
            case 1028888074: {
                var3_5 ^= var4_3 ^ 937905403;
                ** continue;
            }
            ** case 1991603221:
        }
lbl149:
        // 1 sources

        var3_5 ^= var4_3 ^ 327271812;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private boolean PA(double var1_1) {
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
    private static class_243 PB(class_243 class_2432, class_238 class_2383) {
        int n2 = h & 0x287C859F ^ 0x47C54079;
        int n3 = 0;
        int n4 = (n2 | 0x287C859F) ^ 0xF9517B80;
        n3 = (n2 | 0x287C859F) ^ 0x9B2EC509;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1917348602: {
                    n4 ^= n3 ^ 0xC75568CA;
                    n3 = (n2 | 0x287C859F) ^ 0xDDD08806;
                    continue block5;
                }
                case -1305653767: {
                    n4 ^= 0x5A3C6677;
                    n4 ^= 0x360B2F01;
                    n4 ^= 0x15F2B7E8;
                    n4 ^= 0xD9D9CF6;
                    return new class_243(class_3532.method_15350((double)class_2432.field_1352, (double)class_2383.field_1323, (double)class_2383.field_1320), class_3532.method_15350((double)class_2432.field_1351, (double)class_2383.field_1322, (double)class_2383.field_1325), class_3532.method_15350((double)class_2432.field_1350, (double)class_2383.field_1321, (double)class_2383.field_1324));
                }
                case -187498250: 
            }
            n3 = (n2 | 0x287C859F) ^ 0xE24A50F9;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double PC(class_243 class_2432, class_238 class_2383) {
        int n2 = h & 0x9EB5D970 ^ 0x8C6F78A8;
        int n3 = 0;
        int n4 = (n2 | 0x9EB5D970) ^ 0xFD4415B3;
        n3 = (n2 | 0x9EB5D970) ^ 0x54EB7CC6;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 897853234: {
                    double d2 = Math.max(Math.max(class_2383.field_1323 - class_2432.field_1352, 0.0), class_2432.field_1352 - class_2383.field_1320);
                    n4 ^= 0x173CD273;
                    double d3 = Math.max(Math.max(class_2383.field_1322 - class_2432.field_1351, 0.0), class_2432.field_1351 - class_2383.field_1325);
                    n4 ^= 0xA17D6F42;
                    double d4 = Math.max(Math.max(class_2383.field_1321 - class_2432.field_1350, 0.0), class_2432.field_1350 - class_2383.field_1324);
                    n4 ^= 0xA78A09FA;
                    return Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
                }
                case 766124090: {
                    n4 ^= n3 ^ 0x35023003;
                    n3 = (n2 | 0x9EB5D970) ^ 0xAB7BDECA;
                    continue block5;
                }
                case -904624834: 
            }
            n3 = (n2 | 0x9EB5D970) ^ 0xB355D9C2;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private class_1309 PD(double var1_1) {
        block46: {
            block45: {
                var18_2 = 1170341606;
                var15_3 = iL.h & 1170341606 ^ 713849759;
                var17_4 = 0;
                var16_13 = (var15_3 | var18_2) ^ -1695856256;
                var17_4 = (var15_3 | var18_2) ^ 428953430;
                if (true) ** GOTO lbl14
                while (true) {
                    var17_4 = (var15_3 | var18_2) ^ 1115440099;
                    ** GOTO lbl132
                    break;
                }
                block36: while (true) {
                    switch (var17_4) {
                        case 1985786025: {
                            var17_4 = (var15_3 | var18_2) ^ 2041987051;
                        }
lbl14:
                        // 3 sources

                        default: {
                            continue block36;
                        }
                        case 377208852: {
                            var16_13 ^= var17_4 ^ -968115294;
                            var17_4 = (var15_3 | var18_2) ^ -1108708187;
                            continue block36;
                        }
                        case -769160358: 
                    }
                    break;
                }
                var3_5 = null;
                var16_13 ^= 504076139;
                var4_6 = var1_1;
                var16_13 ^= -1316955919;
                var6_7 = iL.a.field_1724.method_5829().method_1009(var1_1, 4.0, var1_1);
                var16_13 ^= -409271078;
                var7_8 = iL.a.field_1687.method_8390(class_1309.class, var6_7, (Predicate<class_1309>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, PI(net.minecraft.class_1309 ), (Lnet/minecraft/class_1309;)Z)()).iterator();
                break block46;
lbl29:
                // 1 sources

                while (true) {
                    var16_13 ^= -1597894690;
                    var13_12 = Math.sqrt(var9_10 * var9_10 + var11_11 * var11_11);
                    var17_4 = (var15_3 | var18_2) ^ 1137057017;
                    break block45;
                    break;
                }
lbl34:
                // 2 sources

                while (true) {
                    var17_4 = (var15_3 | var18_2) ^ 1419975148;
                    break block45;
                    break;
                }
lbl37:
                // 1 sources

                block39: while (true) {
                    block50: {
                        block48: {
                            block47: {
                                block49: {
                                    switch (var17_4) {
                                        case 1510046534: {
                                            var16_13 ^= var17_4 ^ 992429479;
                                            var17_4 = (var15_3 | var18_2) ^ 1974473854;
                                            continue block39;
                                        }
                                        case 394513290: {
                                            var9_10 = var8_9.method_23317() - iL.a.field_1724.method_23317();
                                            break block47;
                                        }
                                        case 186911479: {
                                            var16_13 ^= var17_4 ^ 390936433;
                                            break block48;
                                        }
                                        case -1965993135: {
                                            var16_13 ^= var17_4 ^ 257516972;
                                            break block49;
                                        }
                                        case -1899666471: {
                                            var16_13 ^= var17_4 ^ 428610896;
                                            ** GOTO lbl64
                                        }
                                        case 1613870855: {
                                            if (!this.PF((class_1297)var8_9)) {
                                                var17_4 = (var15_3 | var18_2) ^ 1643023148;
                                                ** break;
                                            }
                                            break block50;
                                        }
                                        case 444459905: {
                                            var17_4 = var8_9.method_23318() - iL.a.field_1724.method_23318() > 3.0 ? (var15_3 | var18_2) ^ -451105618 : (var15_3 | var18_2) ^ 1693054216;
                                        }
lbl62:
                                        // 3 sources

                                        default: {
                                            continue block39;
                                        }
lbl64:
                                        // 1 sources

                                        var17_4 = (var15_3 | var18_2) ^ 268191992;
                                        continue block39;
                                        case 1681233777: {
                                            break block46;
                                        }
                                        case 1044838586: {
                                            break block46;
                                        }
                                        case 237204691: 
                                    }
                                    var16_13 ^= var17_4 ^ -359826225;
                                    var17_4 = (var15_3 | var18_2) ^ 200829070;
                                    continue;
                                }
                                var17_4 = (var15_3 | var18_2) ^ 1368065861;
                                continue;
                            }
                            var16_13 ^= 1146632027;
                            var11_11 = var8_9.method_23321() - iL.a.field_1724.method_23321();
                            ** continue;
                        }
                        var17_4 = (var15_3 | var18_2) ^ 2018391157;
                        continue;
                    }
                    var17_4 = (var15_3 | var18_2) ^ 902595769;
                    continue;
lbl87:
                    // 1 sources

                    while (true) {
                        var17_4 = (var15_3 | var18_2) ^ -775810541;
                        ** GOTO lbl132
                        break;
                    }
                    break;
                }
            }
            block41: while (true) {
                block51: {
                    switch (var17_4) {
                        case 18944816: {
                            var16_13 ^= var17_4 ^ -660025606;
                            ** GOTO lbl117
                        }
                        case 372075562: {
                            if (!(var13_12 < var4_6)) ** GOTO lbl34
                            var17_4 = (var15_3 | var18_2) ^ -1640255879;
                            continue block41;
                        }
                        case -827003583: {
                            var4_6 = var13_12;
                            var17_4 = (var15_3 | var18_2) ^ 1861020879;
                            continue block41;
                        }
                        case 738976518: {
                            var16_13 ^= var17_4 ^ -1299515926;
                            ** break;
                        }
                        case 997123603: {
                            var16_13 ^= var17_4 ^ -661339391;
                            var17_4 = (var15_3 | var18_2) ^ 1115495223;
                        }
                        default: {
                            continue block41;
                        }
lbl112:
                        // 1 sources

                        var17_4 = (var15_3 | var18_2) ^ 2044761045;
                        continue block41;
                        case -235515514: {
                            var16_13 ^= var17_4 ^ 679447628;
                            break block51;
                        }
lbl117:
                        // 1 sources

                        var17_4 = (var15_3 | var18_2) ^ 1902046955;
                        continue block41;
                        case 766567624: {
                            break block41;
                        }
                        case 512954644: 
                    }
                    var3_5 = var8_9;
                    ** continue;
                }
                var17_4 = (var15_3 | var18_2) ^ -1585900866;
            }
        }
        var17_4 = (var15_3 | var18_2) ^ -2089941182;
        if (true) ** GOTO lbl132
        block42: while (true) {
            var17_4 = (var15_3 | var18_2) ^ 1176918591;
lbl132:
            // 4 sources

            block43: while (true) {
                switch (var17_4) {
                    case 1583120238: {
                        if (!var7_8.hasNext()) ** continue;
                        continue block42;
                    }
                    case 703309248: {
                        var16_13 ^= var17_4 ^ -1455803978;
                        ** continue;
                    }
                    case 766622748: {
                        var16_13 ^= var17_4 ^ -861063868;
                        ** break;
                    }
                    case -1106252308: {
                        var8_9 = (class_1309)var7_8.next();
                        var17_4 = (var15_3 | var18_2) ^ -519529434;
                        ** continue;
                    }
lbl147:
                    // 1 sources

                    var17_4 = (var15_3 | var18_2) ^ -688962721;
                    ** GOTO lbl152
                    case -324798275: {
                        var16_13 ^= var17_4 ^ 529863262;
                        var17_4 = (var15_3 | var18_2) ^ 831619217;
                    }
lbl152:
                    // 3 sources

                    default: {
                        continue block43;
                    }
                    case -1188905824: 
                }
                break;
            }
            break;
        }
        return var3_5;
    }

    /*
     * Unable to fully structure code
     */
    private boolean PE(class_1309 var1_1) {
        block42: {
            block41: {
                block44: {
                    block43: {
                        var5_2 = -922726834;
                        var2_3 = iL.h & -922726834 ^ 1617059415;
                        var4_4 = 0;
                        ** GOTO lbl101
lbl5:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 609581685;
                            ** GOTO lbl71
lbl8:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_4 ^ 286161914;
                                break block41;
                                break;
                            }
lbl11:
                            // 1 sources

                            while (true) {
                                v0 = true;
                                break block42;
                                break;
                            }
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 542431534;
                            ** GOTO lbl71
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1195154608;
                            ** GOTO lbl71
                            break;
                        }
lbl20:
                        // 1 sources

                        while (true) {
                            if (!(iL.a.field_1724.method_5858((class_1297)var1_1) < 1024.0)) ** GOTO lbl69
                            ** GOTO lbl108
                            break;
                        }
lbl23:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -742989066;
                            ** GOTO lbl71
lbl26:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -901548113;
                                ** GOTO lbl71
                                break;
                            }
lbl29:
                            // 1 sources

                            while (true) {
                                var3_5 ^= 907551052;
                                break block43;
                                break;
                            }
                            break;
                        }
lbl32:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -281269781;
                            ** GOTO lbl71
lbl35:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1837586985;
                                ** GOTO lbl71
                                break;
                            }
lbl38:
                            // 1 sources

                            while (true) {
                                v0 = false;
                                break block42;
                                break;
                            }
lbl41:
                            // 1 sources

                            while (true) {
                                if (var1_1 != null) {
                                    break block44;
                                }
                                ** GOTO lbl69
                                break;
                            }
                            break;
                        }
                    }
                    if (var1_1.method_73183() == iL.a.field_1687) {
                        ** continue;
lbl48:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ -1852235644;
                            ** continue;
                            break;
                        }
lbl51:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ -689052450;
                            ** continue;
                            break;
                        }
                    }
                    ** GOTO lbl69
                }
                var4_4 = (var2_3 | var5_2) ^ 533219817;
                ** GOTO lbl71
                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -2066188533;
                    ** GOTO lbl71
                    break;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ -543553572;
            ** GOTO lbl71
        }
        var3_5 ^= -1967495847;
        if (true) ** GOTO lbl94
        block33: while (true) {
            if (var1_1.method_5805()) ** continue;
lbl69:
            // 5 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 356894371;
lbl71:
                // 12 sources

                block35: while (true) {
                    switch (var4_4) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            default: {
                                continue block35;
                            }
                            break;
                        }
                        case -64513796: {
                            ** continue;
                        }
                        case 931269181: {
                            break block33;
                        }
                        case -1369521425: {
                            ** continue;
                        }
                        case 922245507: {
                            ** continue;
                        }
                        case 987020457: {
                            ** continue;
                        }
                        case -156624970: {
                            ** continue;
                        }
                        case 2091959170: {
                            ** continue;
                        }
                        case -520764014: {
                            ** continue;
                        }
                        case 589375984: {
                            continue block33;
                        }
lbl94:
                        // 1 sources

                        return v0;
lbl95:
                        // 1 sources

                        while (true) {
                            var3_5 ^= 790583759;
                            ** continue;
                            break;
                        }
                        case -919173263: {
                            var3_5 ^= var4_4 ^ -433463618;
                            ** continue;
                        }
lbl101:
                        // 1 sources

                        var3_5 = (var2_3 | var5_2) ^ -1613501216;
                        var4_4 = (var2_3 | var5_2) ^ -555723678;
                        ** GOTO lbl-1000
                        case -2065365898: {
                            ** continue;
                        }
                        case -852024278: {
                            ** continue;
                        }
lbl108:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ -1781359139;
                        ** GOTO lbl-1000
                        case -966064485: {
                            var3_5 ^= var4_4 ^ 1702367998;
                            ** continue;
                        }
lbl113:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 160930765;
                            ** continue;
                            break;
                        }
                        case 1840916820: {
                            ** continue;
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
        var4_4 = (var2_3 | var5_2) ^ 789141700;
        ** while (true)
        {
            ** case 106854324:
        }
lbl121:
        // 1 sources

        ** while (var1_1.method_31481())
lbl122:
        // 1 sources

        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private boolean PF(class_1297 var1_1) {
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
    private boolean PG(class_1657 var1_1) {
        block20: {
            break block20;
            {
                var5_4 = (var3_3 | var6_2) ^ 1328816954;
lbl2:
                // 2 sources

                block16: while (true) {
                    switch (var5_4) {
                        case -1104552604: {
                            v0 = true;
                            ** GOTO lbl30
                        }
                        case -1530550866: {
                            if (var2_5.equals(var1_1.method_5781())) {
                                var5_4 = (var3_3 | var6_2) ^ -325591523;
                                continue block16;
                            }
                            ** GOTO lbl32
                        }
                        case -846390106: {
                            if (var2_5 != null) {
                                var5_4 = (var3_3 | var6_2) ^ -1622281514;
                                ** break;
                            }
                            ** GOTO lbl32
                        }
                        case -368370584: {
                            var4_6 ^= var5_4 ^ 2051167790;
                            continue block15;
                        }
                        case -1838394208: {
                            var4_6 ^= var5_4 ^ 35987174;
                            var5_4 = (var3_3 | var6_2) ^ -1059956775;
                            ** break;
                        }
                        case -508135317: {
                            var5_4 = (var3_3 | var6_2) ^ -633458925;
                        }
lbl26:
                        // 4 sources

                        default: {
                            continue block16;
                        }
                        case 835692935: {
                            v0 = false;
lbl30:
                            // 2 sources

                            var4_6 ^= -1032345624;
                            return v0;
                        }
lbl32:
                        // 2 sources

                        var5_4 = (var3_3 | var6_2) ^ -1796172075;
                        continue block16;
                        case -28828949: 
                    }
                    var4_6 ^= var5_4 ^ -1335137959;
                    var5_4 = (var3_3 | var6_2) ^ -1284073957;
                    continue;
                    break;
                }
            }
        }
        var6_2 = 247040672;
        var3_3 = iL.h & 247040672 ^ 2129823805;
        var5_4 = 0;
        var4_6 = (var3_3 | var6_2) ^ -2117511686;
        var5_4 = (var3_3 | var6_2) ^ 1087528166;
        block17: while (true) {
            switch (var5_4) {
                default: {
                    continue block17;
                }
                case 345814951: {
                    var4_6 ^= var5_4 ^ 1000037046;
                    var5_4 = (var3_3 | var6_2) ^ -1699888848;
                    continue block17;
                }
                case 1042929243: {
                    var5_4 = (var3_3 | var6_2) ^ 1785150746;
                    continue block17;
                }
                case -464106611: 
            }
            break;
        }
        var2_5 = iL.a.field_1724.method_5781();
        var5_4 = (var3_3 | var6_2) ^ -2135715754;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean PH(class_1297 var0) {
        block28: {
            break block28;
lbl1:
            // 1 sources

            while (true) {
                var5_3 = (var3_2 | var6_1) ^ -429784186;
                ** GOTO lbl59
                break;
            }
        }
        var6_1 = -1090559957;
        var3_2 = iL.h & -1090559957 ^ -1654260492;
        var5_3 = 0;
        var4_4 = (var3_2 | var6_1) ^ -436215077;
        var5_3 = (var3_2 | var6_1) ^ 1656943066;
        block20: while (true) {
            block30: {
                block32: {
                    block31: {
                        block29: {
                            switch (var5_3) {
                                default: {
                                    continue block20;
                                }
                                case -631630170: {
                                    var1_5 = (class_1657)var0;
                                    var4_4 ^= -1278898615;
                                    ** break;
                                }
                                case -163397017: {
                                    var4_4 ^= var5_3 ^ -1801783182;
                                    var5_3 = (var3_2 | var6_1) ^ 661572037;
                                    continue block20;
                                }
                                case -1735314118: {
                                    return false;
                                }
                                case -284567613: {
                                    if (var0 instanceof class_1657) {
                                        var5_3 = (var3_2 | var6_1) ^ 1304944834;
                                        continue block20;
                                    }
                                    break block29;
                                }
                                case -583201499: {
                                    break block30;
                                }
lbl31:
                                // 1 sources

                                var2_6 = ix.get();
                                ** continue;
                                case -231203779: {
                                    var4_4 ^= var5_3 ^ -1934078901;
                                    break block31;
                                }
                                case 416504940: 
                            }
                            var4_4 ^= var5_3 ^ 183311460;
                            break block32;
                        }
                        var5_3 = (var3_2 | var6_1) ^ 1237139096;
                        continue;
                    }
                    var5_3 = (var3_2 | var6_1) ^ 1705372249;
                    continue;
                }
                var5_3 = (var3_2 | var6_1) ^ 1358310204;
                continue;
            }
            var5_3 = (var3_2 | var6_1) ^ -1490247533;
        }
lbl51:
        // 1 sources

        while (true) {
            var5_3 = (var3_2 | var6_1) ^ -445796490;
            ** GOTO lbl59
lbl54:
            // 1 sources

            while (true) {
                var5_3 = (var3_2 | var6_1) ^ -1671466539;
                if (true) ** GOTO lbl59
                break;
            }
            break;
        }
        block23: while (true) {
            var5_3 = (var3_2 | var6_1) ^ 1353214524;
lbl59:
            // 4 sources

            block24: while (true) {
                block33: {
                    switch (var5_3) {
                        default: {
                            continue block24;
                        }
                        case 1519539081: {
                            v0 = true;
                            ** GOTO lbl88
                        }
                        case -1536328193: {
                            ** break;
                        }
                        case -980786378: {
                            if (var2_6 != null) {
                                var5_3 = (var3_2 | var6_1) ^ 462586112;
                                continue block24;
                            }
                            break block33;
                        }
                        case -940357216: {
                            if (var2_6.isFriend(var1_5.method_7334().name())) {
                                ** continue;
                            }
                            break block33;
                        }
                        case 1503526777: {
                            var4_4 ^= var5_3 ^ -1332123517;
                            var5_3 = (var3_2 | var6_1) ^ 2054528969;
                            continue block24;
                        }
lbl81:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ 2014098783;
                        continue block24;
                        case 597724458: {
                            var4_4 ^= var5_3 ^ 210978785;
                            ** continue;
                        }
                        case -279472445: {
                            v0 = false;
lbl88:
                            // 2 sources

                            var4_4 ^= -1808785400;
                            return v0;
                        }
                        case -1838458592: 
                    }
                    var4_4 ^= var5_3 ^ -1118268437;
                    continue block23;
                }
                var5_3 = (var3_2 | var6_1) ^ 764716511;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ boolean PI(class_1309 var0) {
        block10: {
            break block10;
            {
                var3_2 = (var1_1 | -1061274498) ^ 163580405;
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
                        case 31898845: {
                            continue block5;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | -1061274498) ^ 168889085;
                            ** GOTO lbl-1000
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | -1061274498) ^ -719731934;
                            ** continue;
                            break;
                        }
                        case -583043574: {
                            var2_3 ^= var3_2 ^ -1218374120;
                            ** continue;
                        }
                        case -554797822: {
                            return true;
                        }
                    }
                    break;
                }
            }
        }
        var1_1 = iL.h & -1061274498 ^ -1805418569;
        var3_2 = 0;
        var2_3 = (var1_1 | -1061274498) ^ 162784532;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ Boolean PJ(class_304 var0, boolean var1_1) {
        var2_2 = iL.h & 557540294 ^ 719131851;
        var4_3 = 0;
        ** GOTO lbl17
lbl4:
        // 1 sources

        block5: while (true) {
            switch (var4_3) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
                case 1414933039: {
                    var3_4 ^= var4_3 ^ -183240831;
                    break block5;
                }
                case 1887055906: {
                    return iL.forcedKeyState(var0);
                }
lbl14:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | 557540294) ^ 2141806048;
                    ** GOTO lbl-1000
                    break;
                }
lbl17:
                // 1 sources

                var3_4 = (var2_2 | 557540294) ^ -687987536;
                var4_3 = (var2_2 | 557540294) ^ 1207304001;
                ** continue;
                case 1812629646: {
                    ** continue;
                }
            }
            break;
        }
        var4_3 = (var2_2 | 557540294) ^ 1535461357;
        ** while (true)
    }
}

