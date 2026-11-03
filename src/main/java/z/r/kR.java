/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_238
 *  net.minecraft.class_310
 *  net.minecraft.class_3966
 *  net.minecraft.class_5134
 *  net.minecraft.class_9285
 *  net.minecraft.class_9285$class_9287
 *  net.minecraft.class_9334
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_5134;
import net.minecraft.class_9285;
import net.minecraft.class_9334;
import z.r.aE;
import z.r.az;
import z.r.bO;
import z.r.cS;
import z.r.eS;
import z.r.fP;
import z.r.fw;
import z.r.gP;
import z.r.gg;
import z.r.gj;
import z.r.hC;
import z.r.hP;
import z.r.iU;
import z.r.ih;
import z.r.jY;
import z.r.kU;
import z.r.ke;
import z.r.ki;
import z.r.lC;
import z.r.lM;
import z.r.ld;
import z.r.mw;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class kR
extends cS {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private final fP a;
    private final gP a;
    private final bO a;
    private static final /* synthetic */ String c;
    private boolean a;
    private final aE a;
    private static final /* synthetic */ String d;
    private final hP a;
    private float a;
    private static final /* synthetic */ String e;
    private float b;
    private final ke a;
    private static final /* synthetic */ String f;
    private float c;
    private boolean b;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private final ke b;
    private static final /* synthetic */ String i;
    private final ke c;
    private static final /* synthetic */ String s;
    public final ld a;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String l;
    private fw a;
    private static final /* synthetic */ String m;
    private float d;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String t;
    private long a;
    private final fP b;
    private final Random a;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private static final /* synthetic */ String x;
    private static final int[] a;
    private final ke d;
    private final ih a;
    private static final /* synthetic */ String y;
    private static final /* synthetic */ String z;
    private class_1309 a;
    private static final /* synthetic */ String A;
    private static final /* synthetic */ String B;
    private boolean c;
    private static final /* synthetic */ String C;
    private final az a;
    private static final /* synthetic */ String D;
    private static final /* synthetic */ String E;
    private static final /* synthetic */ String F;
    private final fP c;
    private static final /* synthetic */ String G;
    private final ke e;
    private final ke f;
    private static final /* synthetic */ String H;
    private final az b;
    private static final /* synthetic */ String I;
    private boolean d;
    private static final boolean e;
    private static final /* synthetic */ String J;
    private static final /* synthetic */ String K;
    private static final /* synthetic */ String L;
    private static final /* synthetic */ String M;
    private static final /* synthetic */ String N;
    private final iU a;
    private static final /* synthetic */ String O;
    private boolean f;
    private final jY a;
    private static final /* synthetic */ String P;
    private static final /* synthetic */ String Q;
    private static final /* synthetic */ String R;
    private static final /* synthetic */ String S;
    private final iU b;
    private static final /* synthetic */ String T;
    private static final /* synthetic */ String U;
    public static final int a;
    private static final /* synthetic */ String V;
    private final ke g;
    private final aE b;
    private static final /* synthetic */ String W;
    private static final /* synthetic */ String X;
    private final gP b;
    private final gP c;
    private final ke h;
    private static final /* synthetic */ String Y;
    private final aE c;
    private float e;
    private static final /* synthetic */ String Z;
    private final lM a;
    private static final /* synthetic */ String aa;
    private float f;
    private static final /* synthetic */ String ab;
    private static final /* synthetic */ String ac;

    /*
     * Exception decompiling
     */
    public kR() {
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
    private ke Fq(String var1_1, boolean var2_2, String var3_3) {
        block25: {
            block23: {
                block24: {
                    block26: {
                        var8_4 = -524265969;
                        var5_5 = kR.a & -524265969 ^ -92263167;
                        var7_6 = 0;
                        if (true) ** GOTO lbl42
                        block13: while (true) {
                            switch (var7_6) lbl-1000:
                            // 4 sources

                            {
                                default: {
                                    continue block13;
                                }
                                case -1215606645: {
                                    var4_8 = new ke(var1_1, var2_2);
                                    break block23;
                                }
lbl12:
                                // 1 sources

                                return this.addSetting(var4_8);
lbl14:
                                // 1 sources

                                while (true) {
                                    var7_6 = (var5_5 | var8_4) ^ 1083364557;
                                    ** GOTO lbl20
                                    break;
                                }
lbl17:
                                // 1 sources

                                while (true) {
                                    var7_6 = (var5_5 | var8_4) ^ -1034928223;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl20:
                                // 5 sources

                                block18: while (true) {
                                    switch (var7_6) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block18;
                                            }
                                            break;
                                        }
                                        case -566368795: {
                                            ** continue;
                                        }
                                        case 2120732965: {
                                            if (var3_3 != null) {
                                                ** continue;
                                            }
                                            break block24;
                                        }
                                        case -268547823: {
                                            var6_7 ^= var7_6 ^ -2081268266;
                                            break block25;
                                        }
                                        case -1719140643: {
                                            var4_8.description(var3_3);
                                            break block24;
                                        }
                                        case 948977838: {
                                            ** GOTO lbl47
                                        }
                                        case -1168987198: {
                                            break block26;
                                        }
lbl42:
                                        // 1 sources

                                        var6_7 = (var5_5 | var8_4) ^ 1680289637;
                                        ** continue;
lbl44:
                                        // 1 sources

                                        while (true) {
                                            var7_6 = (var5_5 | var8_4) ^ 620600042;
                                            ** continue;
                                            break;
                                        }
lbl47:
                                        // 1 sources

                                        var7_6 = (var5_5 | var8_4) ^ 1522847060;
                                        ** GOTO lbl-1000
lbl49:
                                        // 1 sources

                                        while (true) {
                                            var7_6 = (var5_5 | var8_4) ^ 1296772996;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case 93908781: {
                                            var6_7 ^= var7_6 ^ 1321320791;
                                            break block18;
                                        }
                                    }
                                    break;
                                }
                                ** continue;
                                case -1610304933: {
                                    var6_7 ^= var7_6 ^ 1850239699;
                                    break block13;
                                }
                            }
                            break;
                        }
                        ** while (true)
                    }
                    var7_6 = (var5_5 | var8_4) ^ 1665630674;
                    ** GOTO lbl20
                }
                var7_6 = (var5_5 | var8_4) ^ -10973150;
                ** GOTO lbl20
            }
            var7_6 = (var5_5 | var8_4) ^ 356398622;
            ** GOTO lbl20
        }
        var7_6 = (var5_5 | var8_4) ^ -2069385686;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private gP Fr(String var1_1, float var2_2, float var3_3, float var4_4, float var5_5, String var6_6, String var7_7, String var8_8) {
        block23: {
            break block23;
lbl1:
            // 2 sources

            while (true) {
                var12_11 = (var10_10 | var13_9) ^ -616952770;
                ** GOTO lbl9
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var12_11 = (var10_10 | var13_9) ^ 1938075249;
                if (true) ** GOTO lbl9
                break;
            }
            block19: while (true) {
                var12_11 = (var10_10 | var13_9) ^ 621115555;
lbl9:
                // 4 sources

                block20: while (true) {
                    switch (var12_11) {
                        case -68230360: {
                            var9_12.unit(var7_7);
                            ** GOTO lbl1
                        }
                        case 1631648384: {
                            if (var7_7 != null) ** break;
                            ** continue;
                            var12_11 = (var10_10 | var13_9) ^ 23479826;
                            continue block20;
                        }
                        case 562749789: {
                            var9_12.description(var8_8);
                            ** break;
                        }
                        case 1966897415: {
                            var12_11 = (var10_10 | var13_9) ^ 1590795427;
                            continue block20;
                        }
                        case 1479767567: {
                            var11_13 ^= var12_11 ^ -1918446290;
                            var12_11 = (var10_10 | var13_9) ^ 505120638;
                            continue block20;
                        }
                        case 1516111197: {
                            if (var8_8 != null) {
                                var12_11 = (var10_10 | var13_9) ^ 174523641;
                                continue block20;
                            }
                            ** GOTO lbl41
                        }
                        case -601566874: {
                            var11_13 ^= var12_11 ^ -1941067839;
                            ** continue;
                        }
                        case 215995279: {
                            return this.addSetting(var9_12);
                        }
lbl41:
                        // 2 sources

                        var12_11 = (var10_10 | var13_9) ^ -1551913832;
                        default: {
                            continue block20;
                        }
                        case -1537117760: {
                            var11_13 ^= var12_11 ^ 672688002;
                            continue block19;
                        }
                        case 2117942252: 
                    }
                    var12_11 = (var10_10 | var13_9) ^ -2068472106;
                    continue;
                    break;
                }
                break;
            }
        }
        var13_9 = 2065398942;
        var10_10 = kR.a & 2065398942 ^ 89222634;
        var12_11 = 0;
        var11_13 = (var10_10 | var13_9) ^ -168244294;
        var12_11 = (var10_10 | var13_9) ^ 55699019;
        block21: while (true) {
            switch (var12_11) {
                default: {
                    continue block21;
                }
                case -2035595058: {
                    var11_13 ^= var12_11 ^ 1869273953;
                    var12_11 = (var10_10 | var13_9) ^ 1206456225;
                    continue block21;
                }
                case 951218783: {
                    var9_12 = new gP(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6);
                    var12_11 = (var10_10 | var13_9) ^ 661130225;
                    ** continue;
                }
                case 2081070005: 
            }
            var12_11 = (var10_10 | var13_9) ^ -101698256;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public class_1309 getTarget() {
        int n2 = a & 0x91165769 ^ 0xABC4A60C;
        int n3 = 0;
        int n4 = (n2 | 0x91165769) ^ 0x1D5A2DEB;
        n3 = (n2 | 0x91165769) ^ 0x4DFA7DC0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 703955730: {
                    n4 ^= n3 ^ 0xBB29722B;
                    n3 = (n2 | 0x91165769) ^ 0x2319C598;
                    continue block5;
                }
                case -164853075: {
                    n3 = (n2 | 0x91165769) ^ 0x9223747F;
                    continue block5;
                }
                case -1731251467: 
            }
            break;
        }
        return this.a;
    }

    /*
     * Unable to fully structure code
     */
    public float getAimSpeedValue() {
        var1_1 = kR.a & 333228070 ^ 635049671;
        var3_2 = 0;
        var2_3 = (var1_1 | 333228070) ^ -1996772326;
        ** GOTO lbl15
lbl5:
        // 1 sources

        return ((Float)this.b.getValue()).floatValue();
        {
            switch (var3_2) lbl-1000:
            // 4 sources

            {
                default: {
                    continue block6;
                }
                case 56325189: {
                    ** continue;
                }
lbl12:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 333228070) ^ 881183394;
                    ** GOTO lbl-1000
                    break;
                }
lbl15:
                // 1 sources

                var3_2 = (var1_1 | 333228070) ^ 1719749712;
                ** GOTO lbl-1000
                case 1365242551: {
                    var3_2 = (var1_1 | 333228070) ^ -2042247987;
                    ** GOTO lbl-1000
                }
                case -1315210710: 
            }
        }
        var2_3 ^= var3_2 ^ -420408818;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onEnable() {
        block28: {
            block27: {
                block26: {
                    block25: {
                        break block28;
lbl1:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -768349497;
                            break block25;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -1806868279;
                            break block26;
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1175093205;
                            break block27;
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1920853036;
                            break block27;
lbl13:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 1883993294;
                                ** continue;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 374356974;
                                break block27;
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                this.a.startOrResume();
                                ** continue;
                                break;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -2096009308;
                                break block27;
                                break;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -646353468;
                                break block27;
                                break;
                            }
lbl28:
                            // 1 sources

                            return;
lbl30:
                            // 1 sources

                            while (true) {
                                this.a = 0.0f;
                                ** continue;
                                break;
                            }
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ -740747645;
                    break block27;
                }
                var3_3 = (var1_2 | var4_1) ^ 2110317467;
                break block27;
lbl39:
                // 1 sources

                while (true) {
                    this.f = 0.0f;
                    ** continue;
                    break;
                }
            }
lbl43:
            // 2 sources

            block23: while (true) {
                switch (var3_3) {
                    default: {
                        continue block23;
                    }
                    case 1727448595: {
                        ** continue;
                    }
                    case 1017037939: {
                        ** continue;
                    }
                    case -839757829: {
                        break;
                    }
                    case -89473924: {
                        ** continue;
                    }
                    case 1817623892: {
                        ** continue;
                    }
                    case 747514648: {
                        ** continue;
                    }
                    case -1035515828: {
                        ** continue;
                    }
                    case -108669950: {
                        ** continue;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 1160058795;
                continue;
                break;
            }
lbl65:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -1828618033;
                ** continue;
                break;
            }
        }
        var4_1 = -1241306473;
        var1_2 = kR.a & -1241306473 ^ -1953584315;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -1294071627;
        ** while (true)
        {
            ** case -1444966343:
        }
lbl75:
        // 1 sources

        var2_4 ^= var3_3 ^ 1555030414;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onDisable() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [30[CASE]], but top level block is 38[SWITCH]
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
    @Override
    public void onPortTick() {
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
    public boolean isAttackCooldownReady() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[SWITCH], 57[UNCONDITIONALDOLOOP]], but top level block is 27[SWITCH]
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
    public boolean canAttack() {
        block63: {
            block69: {
                block66: {
                    block65: {
                        block70: {
                            block68: {
                                block67: {
                                    block64: {
                                        break block70;
lbl1:
                                        // 1 sources

                                        return false;
                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ -929230945;
                                            break block63;
                                            break;
                                        }
lbl6:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_3 ^ 1969439507;
                                            break block64;
                                            break;
                                        }
lbl9:
                                        // 2 sources

                                        while (true) {
                                            var2_4 ^= 1159784545;
                                            break block65;
                                            break;
                                        }
lbl12:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ -1935669602;
                                            break block63;
                                            break;
                                        }
                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 1817936106;
                                            break block63;
                                            break;
                                        }
lbl18:
                                        // 1 sources

                                        while (true) {
                                            if (kR.a.field_1755 == null) ** continue;
                                            ** GOTO lbl175
                                            break;
                                        }
lbl21:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ -1354594519;
                                            break block63;
                                            break;
                                        }
lbl24:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_3 ^ -225824707;
                                            break block66;
                                            break;
                                        }
lbl27:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ -1949172276;
                                            break block63;
                                            break;
                                        }
lbl30:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ -1837469556;
                                            break block63;
                                            break;
                                        }
lbl33:
                                        // 1 sources

                                        while (true) {
                                            if (this.f) ** continue;
                                            ** continue;
                                            break;
                                        }
lbl36:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 901701997;
                                            break block63;
                                            break;
                                        }
lbl39:
                                        // 1 sources

                                        return false;
                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ -1887668736;
                                            break block63;
                                            break;
                                        }
                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ -1360166124;
                                            break block63;
                                            break;
                                        }
lbl47:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_3 ^ -1824952449;
                                            break block67;
                                            break;
                                        }
lbl50:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_3 ^ 249679508;
                                            break block68;
                                            break;
                                        }
lbl53:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_3 ^ 1534981013;
                                            ** continue;
                                            break;
                                        }
lbl56:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_3 ^ 1931980218;
                                            break block69;
                                            break;
                                        }
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ 930146709;
                                    break block63;
                                }
                                var3_3 = (var1_2 | var4_1) ^ 178373122;
                                break block63;
lbl65:
                                // 1 sources

                                while (true) {
                                    v0 = true;
                                    ** GOTO lbl9
                                    break;
                                }
lbl68:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1340969988;
                                    break block63;
                                    break;
                                }
lbl71:
                                // 1 sources

                                return false;
                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 2024893528;
                                    break block63;
                                    break;
                                }
lbl76:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 119088745;
                                    break block63;
                                    break;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ 2107268545;
                            break block63;
lbl82:
                            // 1 sources

                            return false;
                        }
                        var4_1 = -219093237;
                        var1_2 = kR.a & -219093237 ^ 1772293041;
                        var3_3 = 0;
                        var2_4 = (var1_2 | var4_1) ^ -694712385;
                        ** while (true)
lbl90:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1614667641;
                            break block63;
                            break;
                        }
lbl93:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -1725346809;
                            ** continue;
                            break;
                        }
                    }
                    return v0;
lbl98:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 1551769588;
                        ** continue;
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -1340481143;
                break block63;
lbl104:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1089917799;
                    break block63;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -2077275509;
                    ** GOTO lbl173
                    break;
                }
lbl110:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -818779896;
                    var3_3 = (var1_2 | var4_1) ^ 440778338;
                    break block63;
                    break;
                }
lbl114:
                // 1 sources

                while (true) {
                    if (kR.a.field_1687 != null) ** continue;
                    ** continue;
                    break;
                }
lbl117:
                // 1 sources

                while (true) {
                    if (this.d) ** continue;
                    ** continue;
                    break;
                }
lbl120:
                // 1 sources

                while (true) {
                    if (this.isAttackCooldownReady()) ** continue;
                    ** continue;
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 28007238;
        }
        block60: while (true) {
            switch (var3_3) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block60;
                    }
                    break;
                }
                case -94849795: {
                    ** continue;
                }
                case 1157284642: {
                    ** continue;
                }
                case -508145191: {
                    ** continue;
                }
                case 1428057263: {
                    ** continue;
                }
                case 1273630258: {
                    ** continue;
                }
                case 1474109980: {
                    ** continue;
                }
                case 1881281143: {
                    ** continue;
                }
                case 862904356: {
                    ** continue;
                }
                case -2092792861: {
                    ** continue;
                }
                case 234219943: {
                    ** continue;
                }
                case -789003297: {
                    ** continue;
                }
                case -246272583: {
                    ** continue;
                }
                case 1273070663: {
                    ** continue;
                }
                case -51721774: {
                    ** continue;
                }
                case 1955568059: {
                    ** continue;
                }
                case -833810730: {
                    ** continue;
                }
                case 1770626871: {
                    ** continue;
                }
                case -1750569135: {
                    ** continue;
                }
                case -863828434: {
                    ** continue;
                }
                case -2039893382: {
                    ** continue;
                }
                case 1420912786: {
                    ** continue;
                }
lbl173:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 722152548;
                ** GOTO lbl-1000
lbl175:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -167377380;
                ** GOTO lbl-1000
lbl177:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1406218841;
                    ** continue;
                    break;
                }
                case 1680985916: {
                    var2_4 ^= var3_3 ^ 2084890369;
                    ** continue;
                }
                case 2001987877: 
            }
            break;
        }
        v0 = false;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean canClickAttack() {
        var4_1 = -354610299;
        var1_2 = kR.a & -354610299 ^ 1671278817;
        var3_3 = 0;
        if (true) ** GOTO lbl27
        block9: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 1652563975;
lbl7:
            // 2 sources

            block10: while (true) {
                switch (var3_3) lbl-1000:
                // 6 sources

                {
                    default: {
                        continue block10;
                    }
                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1206871571;
                        ** GOTO lbl-1000
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1016236056;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 0x488C484: {
                        return false;
                    }
lbl19:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -279611551;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -1553274517: {
                        continue block9;
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1160236312;
                        ** GOTO lbl-1000
                        break;
                    }
lbl27:
                    // 1 sources

                    var2_4 = (var1_2 | var4_1) ^ 1782118923;
                    break block9;
                    case -1990355998: {
                        var2_4 ^= var3_3 ^ -963142378;
                        ** continue;
                    }
                    case -1359315203: {
                        var2_4 ^= var3_3 ^ 428593216;
                        ** continue;
                    }
                    case 1404254207: {
                        return this.canAttack();
                    }
                    case 1405954568: {
                        var2_4 ^= var3_3 ^ -1644801894;
                        var3_3 = (var1_2 | var4_1) ^ -1200716774;
                        ** GOTO lbl-1000
                    }
                    case 682673165: {
                        if (!((Boolean)this.a.getValue()).booleanValue()) ** continue;
                    }
                }
                break;
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ 1219975822;
        ** while (true)
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private boolean Fs() {
        block38: {
            break block38;
lbl1:
            // 1 sources

            return true;
lbl3:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 2042859547;
                ** GOTO lbl65
                break;
            }
lbl6:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ -67201464;
                ** continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                block36: {
                    block34: {
                        block35: {
                            block37: {
                                block32: {
                                    block33: {
                                        var3_3 = (var1_2 | var4_1) ^ -1140131321;
                                        break block34;
lbl12:
                                        // 1 sources

                                        while (true) {
                                            if (this.isEnabled()) break block32;
                                            break block33;
                                            break;
                                        }
lbl15:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 825623040;
                                            break block34;
                                            break;
                                        }
lbl18:
                                        // 1 sources

                                        while (true) {
                                            v0 = false;
                                            break block35;
                                            break;
                                        }
lbl21:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 388983764;
                                            break block34;
                                            while (true) {
                                                var3_3 = (var1_2 | var4_1) ^ 1719049583;
                                                break block34;
                                                break;
                                            }
lbl27:
                                            // 1 sources

                                            while (true) {
                                                if (this.canClickAttack()) ** continue;
                                                break block36;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ 1510241271;
                                    break block34;
lbl33:
                                    // 1 sources

                                    return v0;
lbl35:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -1181724569;
                                        break block34;
                                        break;
                                    }
lbl38:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ -1997530092;
                                        break block37;
                                        break;
                                    }
lbl41:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ -1340399588;
                                        ** continue;
                                        break;
                                    }
lbl44:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -657315719;
                                        break block34;
                                        break;
                                    }
lbl47:
                                    // 1 sources

                                    while (true) {
                                        v0 = true;
                                        break block35;
                                        break;
                                    }
lbl50:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ -2020795702;
                                        ** continue;
                                        break;
                                    }
                                }
                                var3_3 = (var1_2 | var4_1) ^ -2054710042;
                                break block34;
lbl56:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 1159214369;
                                    ** continue;
                                    break;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ -48420531;
                            break block34;
                        }
                        var2_4 ^= -1628084636;
                        ** continue;
                    }
lbl66:
                    // 2 sources

                    block31: while (true) {
                        switch (var3_3) {
                            default: {
                                continue block31;
                            }
                            case -427728938: {
                                ** continue;
                            }
                            case -1312702279: {
                                ** continue;
                            }
                            case 1848053169: {
                                ** continue;
                            }
                            case -1368076851: {
                                ** continue;
                            }
                            case 258307503: {
                                ** continue;
                            }
                            case -1026602267: {
                                ** continue;
                            }
                            case -1917637087: {
                                ** continue;
                            }
                            case 715814043: {
                                ** continue;
                            }
                            case 1378926896: {
                                ** continue;
                            }
                            case -1063766526: {
                                ** continue;
                            }
                            case 1807591377: {
                                ** continue;
                            }
                        }
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 360191795;
                ** continue;
                break;
            }
        }
        var4_1 = 1469451478;
        var1_2 = kR.a & 1469451478 ^ -743089792;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 646782729;
        ** while (true)
    }

    private static int Ft(int n2, int n3) {
        int n4 = -1996129624;
        int n5 = 1604349384;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x2D10FDD8)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xDFA59D6D;
        n6 += (n5 | n4) ^ 0xDFA50A67;
        n6 -= (n5 | n4) ^ 0xDFA5042B;
        n6 -= (n5 | n4) ^ 0xDFA5BD09;
        n6 -= (n5 | n4) ^ 0xDFA5AD52;
        n6 -= (n5 | n4) ^ 0xDFA59566;
        n6 -= (n5 | n4) ^ 0xDFA53287;
        n6 -= (n5 | n4) ^ 0xDFA58267;
        n6 ^= (n5 | n4) ^ 0xDFA5DE49;
        return n6 ^= (n5 | n4) ^ 0xDFA5267E;
    }

    /*
     * Exception decompiling
     */
    private boolean Fu() {
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
    public boolean isValidTarget(class_1309 var1_1) {
        var7_2 = -2103797519;
        var4_3 = kR.a & -2103797519 ^ 907162683;
        var6_4 = 0;
        var5_7 = (var4_3 | var7_2) ^ -272125198;
        var6_4 = (var4_3 | var7_2) ^ -27671160;
        block55: while (true) {
            switch (var6_4) {
                case 1220770163: {
                    ** break;
                }
                case -90713583: {
                    if (var1_1.method_29504()) {
                        ** break;
                    }
                    ** GOTO lbl153
                }
                case -1615719315: {
                    var5_7 ^= var6_4 ^ -1271711338;
                    ** GOTO lbl149
                }
                case 1302827260: {
                    var5_7 ^= var6_4 ^ 83793678;
                    ** GOTO lbl106
                }
lbl20:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 1468104161;
                continue block55;
                case -518274790: {
                    var5_7 ^= var6_4 ^ 962135110;
                    ** GOTO lbl64
                }
                case -1628822732: {
                    var5_7 ^= var6_4 ^ -1933814287;
                    var6_4 = (var4_3 | var7_2) ^ 1869789801;
                    continue block55;
                }
                case -1930417660: {
                    var5_7 ^= var6_4 ^ -2114444665;
                    ** GOTO lbl50
                }
                case -1014509941: {
                    return false;
                }
                case -1608111547: {
                    if (!((Boolean)this.g.getValue()).booleanValue()) ** GOTO lbl220
                    ** GOTO lbl174
                }
                case -1518595219: {
                    return false;
                }
                case 1287544129: {
                    var5_7 ^= var6_4 ^ 266065609;
                    ** GOTO lbl139
                }
                case -647787911: {
                    var5_7 ^= var6_4 ^ -1897313355;
                    ** GOTO lbl155
                }
                case -909432749: {
                    var6_4 = (var4_3 | var7_2) ^ 870000073;
                    break;
                }
                case -639105390: {
                    return false;
                }
lbl50:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 333885334;
                continue block55;
                case -1399576282: {
                    if (var1_1 == null) ** GOTO lbl68
                    ** GOTO lbl99
                }
                case -938690565: {
                    var5_7 ^= var6_4 ^ 1084609689;
                    ** GOTO lbl101
                }
                case -666805034: {
                    ** GOTO lbl129
                }
                case 1755319921: {
                    var5_7 ^= var6_4 ^ 937728844;
                    var6_4 = (var4_3 | var7_2) ^ -216724879;
                    continue block55;
                }
lbl64:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 437163485;
                continue block55;
                case -42000154: {
                    if (kR.a.field_1724 != null) ** GOTO lbl70
lbl68:
                    // 2 sources

                    var6_4 = (var4_3 | var7_2) ^ 1325774286;
                    continue block55;
lbl70:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 1878603394;
                    continue block55;
                }
                case -858766902: {
                    return false;
                }
                case -1242471406: {
                    var5_7 ^= var6_4 ^ 1648972854;
                    var6_4 = (var4_3 | var7_2) ^ 1683117573;
                    continue block55;
                }
                case 909372515: {
                    return false;
                }
                case -2035198269: {
                    if (hC.angleDifference((class_1297)kR.a.field_1724, (class_1297)var1_1) > (int)((Float)this.a.getValue()).floatValue() / 2) {
                        var6_4 = (var4_3 | var7_2) ^ 119240876;
                        continue block55;
                    }
                    var6_4 = (var4_3 | var7_2) ^ 57399529;
                    continue block55;
                }
                case -2059298510: {
                    if (var1_1 instanceof class_1657) {
                        var6_4 = (var4_3 | var7_2) ^ -566578550;
                        continue block55;
                    }
                    ** GOTO lbl220
                }
                case 1170948992: {
                    var5_7 ^= var6_4 ^ -1276216763;
                    ** GOTO lbl162
                }
                case 1946113047: {
                    if (this.Fw(var1_1)) {
                        var6_4 = (var4_3 | var7_2) ^ 2123762432;
                        continue block55;
                    }
                    ** GOTO lbl131
                }
lbl99:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 1859903533;
                continue block55;
lbl101:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 808184376;
                continue block55;
                case -961001628: {
                    var6_4 = (var4_3 | var7_2) ^ 1275948778;
                    break;
                }
lbl106:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 588412449;
                continue block55;
                case -1786197286: {
                    var2_5 = true;
                    ** GOTO lbl133
                }
                case -107017931: {
                    var5_7 ^= var6_4 ^ 351781373;
                    var6_4 = (var4_3 | var7_2) ^ -2136387432;
                    continue block55;
                }
                case -493605095: {
                    return false;
                }
                case -758584578: {
                    if (var1_1.equals((Object)kR.a.field_1724.method_5854())) {
                        var6_4 = (var4_3 | var7_2) ^ -1168544086;
                        continue block55;
                    }
                    ** GOTO lbl157
                }
                case 1167046282: {
                    var5_7 ^= 1598330173;
                    if (!hC.isBlocking(var1_1)) ** GOTO lbl220
                    ** GOTO lbl151
                }
                case 1576950245: {
                    var5_7 ^= var6_4 ^ 1902099098;
                    ** GOTO lbl137
                }
lbl129:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 1273338909;
                continue block55;
lbl131:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 678469583;
                continue block55;
lbl133:
                // 1 sources

                var5_7 ^= -1775080022;
                var3_6 = kR.FN();
                var6_4 = (var4_3 | var7_2) ^ 971605742;
                if (true) ** GOTO lbl184
lbl137:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 381458110;
                continue block55;
lbl139:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 7531176;
                continue block55;
                case 214159953: {
                    var5_7 ^= var6_4 ^ -1550055595;
                    var6_4 = (var4_3 | var7_2) ^ 1964864112;
                    continue block55;
                }
                case 798891637: {
                    var5_7 ^= var6_4 ^ -875342581;
                    var6_4 = (var4_3 | var7_2) ^ -446329363;
                    continue block55;
                }
lbl149:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ -983176980;
                continue block55;
lbl151:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ -79877113;
                continue block55;
lbl153:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 690530454;
                continue block55;
lbl155:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 1139588806;
                continue block55;
lbl157:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ -345709282;
                continue block55;
                case -1316895657: {
                    var5_7 ^= var6_4 ^ 1364854651;
                    ** GOTO lbl166
                }
lbl162:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 1410241506;
                continue block55;
                case -1226287533: {
                    return this.Fv(var1_1);
                }
lbl166:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 2051734833;
                continue block55;
                case 1409233174: {
                    if (!(var1_1.method_6032() <= 0.0f)) ** GOTO lbl172
lbl170:
                    // 2 sources

                    var6_4 = (var4_3 | var7_2) ^ 980063999;
                    continue block55;
lbl172:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 1881340831;
                    continue block55;
                }
lbl174:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 2136052904;
                continue block55;
                case -176815555: {
                    if (var1_1.equals((Object)kR.a.field_1724)) {
                        var6_4 = (var4_3 | var7_2) ^ -212729989;
                        continue block55;
                    }
                    var6_4 = (var4_3 | var7_2) ^ -1727749490;
                }
            }
            continue;
            block56: while (true) {
                var6_4 = (var4_3 | var7_2) ^ 946431577;
lbl184:
                // 2 sources

                block57: while (true) {
                    block84: {
                        block81: {
                            block83: {
                                block82: {
                                    switch (var6_4) {
                                        case 1232869372: {
                                            var5_7 ^= var6_4 ^ -1062034254;
                                            var6_4 = (var4_3 | var7_2) ^ -2105391889;
                                            continue block57;
                                        }
                                        case -532512019: {
                                            if (!var3_6.isEnabled()) break block81;
                                            ** GOTO lbl214
                                        }
                                        case -1888273899: {
                                            var5_7 ^= var6_4 ^ -640228605;
                                            continue block56;
                                        }
                                        case 609615439: {
                                            break block82;
                                        }
                                        case -199324371: {
                                            var2_5 = false;
                                            break block81;
                                        }
                                        case -445680017: {
                                            if (var3_6.canHandleMaceAttack()) {
                                                var6_4 = (var4_3 | var7_2) ^ 1828074965;
                                                ** break;
                                            }
                                            break block81;
                                        }
                                        case -1896621406: {
                                            if (var3_6 == null) break block81;
                                            var6_4 = (var4_3 | var7_2) ^ -1474783669;
                                        }
lbl209:
                                        // 3 sources

                                        default: {
                                            continue block57;
                                        }
                                        {
                                        }
                                        case 661785287: {
                                            return false;
                                        }
lbl214:
                                        // 1 sources

                                        var6_4 = (var4_3 | var7_2) ^ -1831910732;
                                        continue block57;
                                        case -630421202: {
                                            break block83;
                                        }
                                        case 874051604: {
                                            if (var2_5) ** GOTO lbl226
lbl220:
                                            // 4 sources

                                            var6_4 = (var4_3 | var7_2) ^ -98246214;
                                            continue block55;
                                        }
                                        case 233749216: {
                                            var5_7 ^= var6_4 ^ -1044320157;
                                            break block84;
                                        }
lbl226:
                                        // 1 sources

                                        var6_4 = (var4_3 | var7_2) ^ -1150024165;
                                        continue block57;
                                        case 511847088: 
                                    }
                                    var6_4 = (var4_3 | var7_2) ^ 1457012246;
                                    continue;
                                }
                                var6_4 = (var4_3 | var7_2) ^ 1408617108;
                                continue;
                            }
                            var6_4 = (var4_3 | var7_2) ^ 1115959766;
                            continue;
                        }
                        var6_4 = (var4_3 | var7_2) ^ -1660153;
                        continue;
                    }
                    var6_4 = (var4_3 | var7_2) ^ -1847019972;
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private boolean Fv(class_1309 var1_1) {
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
    private boolean Fw(class_1309 var1_1) {
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
    private double Fx() {
        int n2 = a & 0x8F2BEEAD ^ 0xAC4F423;
        int n3 = 0;
        int n4 = (n2 | 0x8F2BEEAD) ^ 0x3EE20927;
        n3 = (n2 | 0x8F2BEEAD) ^ 0x9C73A67A;
        block5: while (true) {
            block6: {
                switch (n3) {
                    default: {
                        continue block5;
                    }
                    case -1861175407: {
                        n4 ^= n3 ^ 0xDF08B260;
                        break;
                    }
                    case -1166086767: {
                        return 3.0 + (double)((Float)this.c.getValue()).floatValue();
                    }
                    case 329013461: {
                        break block6;
                    }
                }
                n3 = (n2 | 0x8F2BEEAD) ^ 0x3591133E;
                continue;
            }
            n3 = (n2 | 0x8F2BEEAD) ^ 0x1EFF493E;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void Fy() {
        block19: {
            block21: {
                block20: {
                    var4_1 = -1654939813;
                    var1_2 = kR.a & -1654939813 ^ 1530102839;
                    var3_3 = 0;
                    ** GOTO lbl38
lbl5:
                    // 7 sources

                    block13: while (true) {
                        switch (var3_3) lbl-1000:
                        // 5 sources

                        {
                            while (true) {
                                default: {
                                    continue block13;
                                }
                                break;
                            }
                            case 1361053996: {
                                return;
                            }
                            case 299305638: {
                                var2_4 ^= var3_3 ^ -2074519016;
                                break block19;
                            }
                            case 642684370: {
                                this.d = 0.85f + this.a.nextFloat() * 0.3f;
                                break block13;
                            }
                            case -1072458472: {
                                var2_4 ^= var3_3 ^ -1354927860;
                                ** GOTO lbl24
                            }
lbl21:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1906600365;
                                ** GOTO lbl-1000
                                break;
                            }
lbl24:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -113964371;
                            ** GOTO lbl-1000
lbl26:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 2039364287;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -602808521: {
                                var2_4 ^= var3_3 ^ 663637830;
                                break block20;
                            }
lbl32:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -827550247;
                                ** continue;
                                break;
                            }
                            case -1631565895: {
                                var2_4 ^= var3_3 ^ 704826485;
                                ** continue;
                            }
lbl38:
                            // 1 sources

                            var2_4 = (var1_2 | var4_1) ^ 1330065126;
                            break block21;
                        }
                        break;
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1102829766;
                    ** GOTO lbl5
lbl42:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 526912103;
                        ** GOTO lbl5
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 857377362;
                ** GOTO lbl5
                {
                    case -1805206026: {
                        break;
                    }
                    case 2028287491: {
                        this.e = 0.85f + this.a.nextFloat() * 0.3f;
                        break;
                    }
                    case -1728154989: {
                        var2_4 ^= var3_3 ^ -1408791081;
                        ** continue;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 1199959532;
                ** GOTO lbl5
                {
                    case -329181907: {
                        this.c = 0.8f + this.a.nextFloat() * 0.4f;
                        ** continue;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 57294920;
                ** GOTO lbl5
            }
            var3_3 = (var1_2 | var4_1) ^ 1260200585;
            ** GOTO lbl5
        }
        var3_3 = (var1_2 | var4_1) ^ -1482774148;
        ** while (true)
        {
            ** case -1493850688:
        }
lbl70:
        // 1 sources

        this.b = 0.85f + this.a.nextFloat() * 0.3f;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void Fz() {
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
    private boolean FA() {
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
    private double[] FB(class_1309 var1_1) {
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
    private void FC() {
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
    private void FD() {
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
     */
    private boolean FE() {
        block44: {
            block45: {
                block43: {
                    var7_1 = -461764521;
                    var4_2 = kR.a & -461764521 ^ -1034738327;
                    var6_3 = 0;
                    ** GOTO lbl109
lbl5:
                    // 1 sources

                    while (true) {
                        v0 = true;
                        break block43;
                        break;
                    }
                    while (true) {
                        var6_3 = (var4_2 | var7_1) ^ -1081644651;
                        ** GOTO lbl70
                        break;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var6_3 = (var4_2 | var7_1) ^ 1499465884;
                        ** GOTO lbl49
                        break;
                    }
                }
lbl15:
                // 2 sources

                while (true) {
                    var5_4 ^= -1688085780;
                    return v0;
                }
lbl18:
                // 1 sources

                while (true) {
                    var5_4 ^= var6_3 ^ -14501766;
                    if (true) ** GOTO lbl88
                    break;
                }
                block26: while (true) {
                    var6_3 = (var4_2 | var7_1) ^ 230515514;
lbl23:
                    // 5 sources

                    block27: while (true) {
                        block0 : switch (var6_3) lbl-1000:
                        // 4 sources

                        {
                            default: {
                                continue block27;
                            }
                            case -2044109606: {
                                ** continue;
                            }
                            case 1083029955: {
                                ** continue;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                var6_3 = (var4_2 | var7_1) ^ -1493789508;
                                ** GOTO lbl-1000
                                break;
                            }
lbl34:
                            // 1 sources

                            while (true) {
                                var5_4 ^= var6_3 ^ 1273465047;
                                ** GOTO lbl86
                                break;
                            }
                            case 1613949078: {
                                var5_4 ^= var6_3 ^ 1156135710;
                                break block44;
                            }
lbl40:
                            // 1 sources

                            while (true) {
                                var5_4 ^= var6_3 ^ 1999163255;
                                ** GOTO lbl107
                                break;
                            }
lbl43:
                            // 1 sources

                            while (true) {
                                if (!((var3_5 = ki.a.getActiveController()) instanceof kU)) ** continue;
                                ** GOTO lbl62
                                break;
                            }
lbl46:
                            // 1 sources

                            while (true) {
                                var2_7 = (kU)var3_5;
                                ** GOTO lbl81
                                break;
                            }
lbl49:
                            // 3 sources

                            block34: while (true) {
                                switch (var6_3) {
                                    default: {
                                        continue block34;
                                    }
                                    case 74730560: {
                                        ** continue;
                                    }
                                    case -1088739869: {
                                        ** continue;
                                    }
                                    ** case 1293854269:
lbl58:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
lbl59:
                            // 1 sources

                            while (true) {
                                var6_3 = (var4_2 | var7_1) ^ 2065754366;
                                ** GOTO lbl70
                                break;
                            }
lbl62:
                            // 1 sources

                            var6_3 = (var4_2 | var7_1) ^ 942753596;
                            ** GOTO lbl70
lbl64:
                            // 1 sources

                            while (true) {
                                var6_3 = (var4_2 | var7_1) ^ 1095465853;
                                ** GOTO lbl-1000
                                break;
                            }
lbl67:
                            // 1 sources

                            while (true) {
                                v1 = var2_7;
                                ** GOTO lbl83
                                break;
                            }
lbl70:
                            // 3 sources

                            block38: while (true) {
                                switch (var6_3) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block38;
                                        }
                                        break;
                                    }
                                    case 1509704938: {
                                        ** continue;
                                    }
                                    case -1654930047: {
                                        ** continue;
                                    }
                                    case -1490004478: {
                                        break block0;
                                    }
lbl81:
                                    // 1 sources

                                    var5_4 ^= 529124685;
                                    ** continue;
lbl83:
                                    // 2 sources

                                    while (true) {
                                        var5_4 ^= -1171060891;
                                        ** GOTO lbl102
                                        break;
                                    }
lbl86:
                                    // 1 sources

                                    var6_3 = (var4_2 | var7_1) ^ -1528112034;
                                    ** continue;
lbl88:
                                    // 1 sources

                                    var6_3 = (var4_2 | var7_1) ^ -21921495;
                                    ** GOTO lbl-1000
lbl90:
                                    // 1 sources

                                    while (true) {
                                        var6_3 = (var4_2 | var7_1) ^ -502308545;
                                        ** GOTO lbl49
                                        break;
                                    }
                                    case 415935574: {
                                        if (var1_6 == null) break block26;
                                        ** continue;
                                    }
                                    case 1116860705: {
                                        v1 = null;
                                        ** continue;
                                    }
                                    case -565548477: 
                                }
                                break;
                            }
                            var5_4 ^= var6_3 ^ -740791501;
                            ** continue;
lbl102:
                            // 1 sources

                            var1_6 = v1;
                            ** continue;
                            case -1412072380: {
                                var5_4 ^= var6_3 ^ -1894862900;
                                continue block26;
                            }
lbl107:
                            // 1 sources

                            var6_3 = (var4_2 | var7_1) ^ -1419408574;
                            ** continue;
lbl109:
                            // 1 sources

                            var5_4 = (var4_2 | var7_1) ^ 1004866624;
                            ** continue;
                        }
                        break;
                    }
                    break;
                }
                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ 1303269691;
                    ** GOTO lbl23
                    break;
                }
                {
                    case 2084178978: {
                        if (!var1_6.equals(this.a)) ** continue;
                        break block45;
                    }
                }
                var6_3 = (var4_2 | var7_1) ^ -1707007651;
                ** GOTO lbl23
                {
                    ** case -339325371:
                }
lbl120:
                // 1 sources

                v0 = false;
                ** while (true)
            }
            var6_3 = (var4_2 | var7_1) ^ -2041985559;
            ** GOTO lbl23
        }
        var6_3 = (var4_2 | var7_1) ^ 1616015781;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void resetTargeting() {
        block109: {
            block112: {
                block104: {
                    block97: {
                        block103: {
                            block107: {
                                block108: {
                                    block110: {
                                        block106: {
                                            block101: {
                                                block105: {
                                                    block102: {
                                                        block111: {
                                                            block100: {
                                                                block98: {
                                                                    block99: {
                                                                        break block110;
lbl1:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
lbl3:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var2_4 ^= var3_3 ^ -1069267424;
                                                                            break block97;
                                                                            break;
                                                                        }
lbl6:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var2_4 ^= -1476771577;
                                                                            break block98;
                                                                            break;
                                                                        }
lbl9:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_3 = (var1_2 | var4_1) ^ 353815778;
                                                                            ** GOTO lbl173
                                                                            break;
                                                                        }
lbl12:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_3 = (var1_2 | var4_1) ^ 1477352770;
                                                                            ** GOTO lbl173
                                                                            break;
                                                                        }
lbl15:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_3 = (var1_2 | var4_1) ^ 521870602;
                                                                            ** GOTO lbl173
                                                                            break;
                                                                        }
lbl18:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            ki.a.releaseController(this.a);
                                                                            break block99;
                                                                            break;
                                                                        }
lbl21:
                                                                        // 1 sources

                                                                        while (this.a.isRelativeMode()) {
                                                                            break block100;
                                                                        }
                                                                        break block106;
lbl24:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var2_4 ^= var3_3 ^ 1466657240;
                                                                            ** GOTO lbl243
                                                                            break;
                                                                        }
                                                                    }
lbl28:
                                                                    // 3 sources

                                                                    while (true) {
                                                                        var3_3 = (var1_2 | var4_1) ^ 1970230023;
                                                                        ** GOTO lbl173
lbl31:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var2_4 ^= var3_3 ^ -232473804;
                                                                            ** GOTO lbl238
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
                                                                            var2_4 ^= var3_3 ^ 1081455935;
                                                                            break block101;
                                                                            break;
                                                                        }
lbl39:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            this.a = null;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                        this.f = 0.0f;
                                                                        var3_3 = (var1_2 | var4_1) ^ 1214224807;
                                                                        ** GOTO lbl173
lbl45:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var2_4 ^= var3_3 ^ 1750961290;
                                                                            break block102;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    this.a.setLinearAcceleration(true);
                                                                    var3_3 = (var1_2 | var4_1) ^ 1504471473;
                                                                    ** GOTO lbl173
                                                                }
                                                                if (!this.a.isComplete()) break block106;
                                                                break block111;
lbl54:
                                                                // 1 sources

                                                                while (true) {
                                                                    var2_4 ^= 1384915095;
                                                                    ** GOTO lbl21
                                                                    break;
                                                                }
                                                            }
                                                            var3_3 = (var1_2 | var4_1) ^ -475333895;
                                                            ** GOTO lbl173
                                                        }
lbl61:
                                                        // 3 sources

                                                        while (true) {
                                                            var3_3 = (var1_2 | var4_1) ^ -1602831124;
                                                            ** GOTO lbl173
                                                            break;
                                                        }
lbl64:
                                                        // 1 sources

                                                        while (true) {
                                                            var2_4 ^= var3_3 ^ -870408852;
                                                            break block103;
                                                            break;
                                                        }
lbl67:
                                                        // 1 sources

                                                        while (true) {
                                                            var3_3 = (var1_2 | var4_1) ^ 316817843;
                                                            ** GOTO lbl173
lbl70:
                                                            // 1 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
lbl72:
                                                            // 1 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
lbl74:
                                                            // 1 sources

                                                            while (true) {
                                                                var3_3 = (var1_2 | var4_1) ^ 368692231;
                                                                ** GOTO lbl173
                                                                break;
                                                            }
lbl77:
                                                            // 1 sources

                                                            while (true) {
                                                                var3_3 = (var1_2 | var4_1) ^ 1133526848;
                                                                ** GOTO lbl173
lbl80:
                                                                // 1 sources

                                                                block69: while (true) {
                                                                    var3_3 = (var1_2 | var4_1) ^ 1825784382;
                                                                    ** GOTO lbl173
lbl83:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_3 = (var1_2 | var4_1) ^ -1527663770;
                                                                        ** GOTO lbl173
                                                                        break;
                                                                    }
lbl86:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var2_4 ^= var3_3 ^ 42836296;
                                                                        break block104;
                                                                        break;
                                                                    }
lbl89:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var2_4 ^= -268181794;
                                                                        break block105;
lbl92:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_3 = (var1_2 | var4_1) ^ 976691445;
                                                                            ** GOTO lbl173
                                                                            break;
                                                                        }
lbl95:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var2_4 ^= var3_3 ^ -571743274;
                                                                            ** continue;
                                                                            break;
                                                                        }
lbl98:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            eS.a.release(this);
                                                                            break block106;
                                                                            break;
                                                                        }
lbl102:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_3 = (var1_2 | var4_1) ^ 1046761017;
                                                                            ** GOTO lbl173
                                                                            break;
                                                                        }
lbl105:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var2_4 ^= var3_3 ^ 2040406377;
                                                                            continue block69;
                                                                            break;
                                                                        }
lbl108:
                                                                        // 1 sources

                                                                        return;
lbl110:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_3 = (var1_2 | var4_1) ^ 1968049518;
                                                                            ** GOTO lbl173
                                                                            break;
                                                                        }
lbl113:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_3 = (var1_2 | var4_1) ^ -59388450;
                                                                            ** GOTO lbl173
                                                                            break;
                                                                        }
lbl116:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (this.a == null) break block106;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl119:
                                                                // 1 sources

                                                                while (true) {
                                                                    var3_3 = (var1_2 | var4_1) ^ -2104644295;
                                                                    ** GOTO lbl173
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    var3_3 = (var1_2 | var4_1) ^ -1245960947;
                                                    ** GOTO lbl173
lbl125:
                                                    // 1 sources

                                                    while (true) {
                                                        if (this.a == null) ** GOTO lbl28
                                                        break block107;
                                                        break;
                                                    }
                                                }
                                                if (ki.a.getActiveController() != this.a) ** GOTO lbl61
                                                ** while (true)
lbl131:
                                                // 1 sources

                                                while (true) {
                                                    var3_3 = (var1_2 | var4_1) ^ 802898085;
                                                    ** GOTO lbl173
                                                    break;
                                                }
                                            }
                                            var3_3 = (var1_2 | var4_1) ^ -1140472235;
                                            ** GOTO lbl173
lbl137:
                                            // 1 sources

                                            while (true) {
                                                var3_3 = (var1_2 | var4_1) ^ 586756257;
                                                ** GOTO lbl173
                                                break;
                                            }
lbl140:
                                            // 1 sources

                                            while (true) {
                                                var3_3 = (var1_2 | var4_1) ^ 2011529541;
                                                ** GOTO lbl173
lbl143:
                                                // 1 sources

                                                while (true) {
                                                    var2_4 ^= var3_3 ^ 598344011;
                                                    ** continue;
                                                    break;
                                                }
lbl146:
                                                // 1 sources

                                                while (true) {
                                                    if (ki.a.getActiveController() != null) ** break;
                                                    ** continue;
                                                    break block108;
                                                    break;
                                                }
lbl150:
                                                // 1 sources

                                                while (true) {
                                                    var2_4 ^= var3_3 ^ -1160260521;
                                                    break block109;
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        var3_3 = (var1_2 | var4_1) ^ 1960193917;
                                        ** GOTO lbl173
lbl156:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ -1397213291;
                                            ** GOTO lbl173
                                            break;
                                        }
                                    }
                                    var4_1 = 1140928977;
                                    var1_2 = kR.a & 1140928977 ^ -1374140486;
                                    var3_3 = 0;
                                    var2_4 = (var1_2 | var4_1) ^ 347453205;
                                    ** while (true)
lbl165:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 503541784;
                                        if (true) ** GOTO lbl173
                                        break;
                                    }
lbl168:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ -1350113077;
                                        ** continue;
                                        break;
                                    }
                                    block93: while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 844940747;
lbl173:
                                        // 38 sources

                                        block94: while (true) {
                                            switch (var3_3) lbl-1000:
                                            // 3 sources

                                            {
                                                while (true) {
                                                    default: {
                                                        continue block94;
                                                    }
                                                    break;
                                                }
                                                case -2100677179: {
                                                    ** continue;
                                                }
                                                case 1377612206: {
                                                    ** continue;
                                                }
                                                case -82855143: {
                                                    ** continue;
                                                }
                                                case 1537561334: {
                                                    ** continue;
                                                }
                                                case -69157892: {
                                                    ** continue;
                                                }
                                                case -599412176: {
                                                    ** continue;
                                                }
                                                case -857716902: {
                                                    ** continue;
                                                }
                                                case -266729501: {
                                                    ** continue;
                                                }
                                                case -1587946607: {
                                                    ** continue;
                                                }
                                                case -615296205: {
                                                    ** continue;
                                                }
                                                case -797099582: {
                                                    break block93;
                                                }
                                                case -1212866998: {
                                                    ** continue;
                                                }
                                                case -50645432: {
                                                    ** continue;
                                                }
                                                case 1846174719: {
                                                    ** continue;
                                                }
                                                case -735160562: {
                                                    ** continue;
                                                }
                                                case -1697687418: {
                                                    ** continue;
                                                }
                                                case -251499791: {
                                                    ** continue;
                                                }
                                                case -994860586: {
                                                    ** continue;
                                                }
                                                case 1315949335: {
                                                    ** continue;
                                                }
                                                case -1239946567: {
                                                    ** continue;
                                                }
                                                case -1044236450: {
                                                    ** continue;
                                                }
                                                case 282201797: {
                                                    ** continue;
                                                }
                                                case 1165562717: {
                                                    ** continue;
                                                }
                                                case 1706858985: {
                                                    ** continue;
                                                }
                                                case -1339151990: {
                                                    ** continue;
                                                }
                                                case 1256768669: {
                                                    ** continue;
                                                }
                                                case 1255410313: {
                                                    ** continue;
                                                }
                                                case -1686756100: {
                                                    break block103;
                                                }
                                                case -1688765803: {
                                                    ** continue;
                                                }
                                                case 908251520: {
                                                    ** continue;
                                                }
lbl238:
                                                // 1 sources

                                                var3_3 = (var1_2 | var4_1) ^ -2146233340;
                                                ** GOTO lbl-1000
                                                case 229870850: {
                                                    var2_4 ^= var3_3 ^ -1438004219;
                                                    continue block93;
                                                }
lbl243:
                                                // 1 sources

                                                var3_3 = (var1_2 | var4_1) ^ -1952059886;
                                                ** continue;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ -1419746138;
                                    ** GOTO lbl173
                                }
                                var3_3 = (var1_2 | var4_1) ^ -1530036878;
                                ** GOTO lbl173
                            }
                            var3_3 = (var1_2 | var4_1) ^ 1995373697;
                            ** GOTO lbl173
                        }
                        var3_3 = (var1_2 | var4_1) ^ -1814324055;
                        ** GOTO lbl173
                        {
                            case -1711475010: {
                                var2_4 ^= var3_3 ^ -777769738;
                                ** continue;
                            }
                        }
                        this.a.setScaleAxesProportionally(true);
                        var3_3 = (var1_2 | var4_1) ^ 1329638506;
                        ** GOTO lbl173
                        {
                            case -1125818106: {
                                this.f = false;
                                ** continue;
                            }
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1392252669;
                    ** GOTO lbl173
                    {
                        case 1821694658: {
                            if (this.FE()) ** break;
                            ** continue;
                            ** continue;
                        }
                        case -1728607366: {
                            ** continue;
                        }
                        case 309115429: {
                            var2_4 ^= var3_3 ^ 1088461490;
                            break block112;
                        }
                        case -1383511877: {
                            this.a = 0.0f;
                            ** continue;
                        }
                    }
lbl280:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 894051528;
                        ** GOTO lbl173
                        break;
                    }
                    this.a = null;
                    var3_3 = (var1_2 | var4_1) ^ 1580686961;
                    ** GOTO lbl173
                    {
                        case -1505300900: {
                            var2_4 ^= var3_3 ^ -688176095;
                            ** continue;
                        }
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -20219586;
                ** GOTO lbl173
            }
            var3_3 = (var1_2 | var4_1) ^ 715839021;
            ** GOTO lbl173
            {
                case 1117864046: {
                    var2_4 ^= var3_3 ^ -1800132537;
                    ** continue;
                }
            }
        }
        var3_3 = (var1_2 | var4_1) ^ -667179397;
        ** while (true)
        {
            ** case 2109926226:
        }
lbl302:
        // 1 sources

        switch (var2_4) {
            case -772467303: {
                ** continue;
            }
            default: {
                ** continue;
            }
            ** case -15351815:
lbl308:
            // 1 sources

            ** continue;
        }
    }

    /*
     * Exception decompiling
     */
    private void FF() {
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
    private boolean FG() {
        var6_1 = -2036071096;
        var3_2 = kR.a & -2036071096 ^ 674865106;
        var5_3 = 0;
        var4_4 = (var3_2 | var6_1) ^ -469204986;
        var5_3 = (var3_2 | var6_1) ^ 708161188;
        ** GOTO lbl72
lbl7:
        // 1 sources

        block25: while (true) {
            switch (var4_4) {
                default: {
                    var4_4 ^= 749316040;
                    continue block25;
                }
                case -566311356: {
                    var4_4 ^= -258616330;
                    break;
                }
                case 576864498: {
                    var4_4 ^= -256253915;
                }
            }
            if (!this.a.equals((Object)var2_6.method_17782())) ** GOTO lbl33
            var4_4 ^= -1680607825;
            v0 = true;
            ** GOTO lbl67
            break;
        }
lbl21:
        // 1 sources

        while (true) {
            var5_3 = (var3_2 | var6_1) ^ 1535138121;
            if (true) ** GOTO lbl72
            break;
        }
        block27: while (true) {
            var5_3 = (var3_2 | var6_1) ^ 220542991;
            if (true) ** GOTO lbl72
            block28: while (true) {
                var5_3 = (var3_2 | var6_1) ^ -1131028685;
                ** GOTO lbl72
lbl30:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -1295919708;
                    ** GOTO lbl42
lbl33:
                    // 2 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ -1169275819;
                        ** GOTO lbl42
lbl36:
                        // 1 sources

                        while (true) {
                            var5_3 = (var3_2 | var6_1) ^ -62257281;
                            ** GOTO lbl42
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -818844688;
                    if (true) ** GOTO lbl72
lbl42:
                    // 4 sources

                    block33: while (true) {
                        block37: {
                            switch (var5_3) {
                                default: {
                                    continue block33;
                                }
                                case -398022211: {
                                    var2_6 = (class_3966)var1_5;
                                    ** continue;
                                }
                                case -1476172538: {
                                    var4_4 ^= var5_3 ^ 533327372;
                                    var5_3 = (var3_2 | var6_1) ^ 954748126;
                                    continue block33;
                                }
                                case 477907582: {
                                    var4_4 ^= var5_3 ^ -322590117;
                                    break;
                                }
                                case 351525775: {
                                    var4_4 ^= var5_3 ^ -1893716448;
                                    ** continue;
                                }
                                case -1772760316: {
                                    if (!(var1_5 instanceof class_3966)) ** continue;
                                    ** continue;
                                }
                                case 1391958181: {
                                    v0 = false;
                                    break block37;
                                }
                            }
                            var5_3 = (var3_2 | var6_1) ^ 1190868583;
                            continue;
                        }
                        var4_4 ^= 1796678367;
                        return v0;
                    }
                    break;
                }
                block34: while (true) {
                    var5_3 = (var3_2 | var6_1) ^ 1562373922;
lbl72:
                    // 6 sources

                    block35: while (true) {
                        switch (var5_3) {
                            default: {
                                continue block35;
                            }
                            case -43931039: {
                                if (!this.Fw(this.a)) {
                                    continue block28;
                                }
                                ** GOTO lbl110
                            }
                            case -1550276651: {
                                var5_3 = (var3_2 | var6_1) ^ 1406940603;
                                continue block35;
                            }
                            case 1636627498: {
                                var1_5 = ki.a.getExtendedReachRayTrace();
                                var5_3 = (var3_2 | var6_1) ^ 113179356;
                                ** continue;
                            }
                            case -2071449218: {
                                var5_3 = (var3_2 | var6_1) ^ -596331368;
                                continue block35;
                            }
                            case 880285826: {
                                var4_4 ^= var5_3 ^ -1773196008;
                                ** continue;
                            }
                            case 304627945: {
                                var4_4 ^= var5_3 ^ -551511850;
                                var5_3 = (var3_2 | var6_1) ^ 43915924;
                                continue block35;
                            }
                            case -180500845: {
                                var5_3 = (var3_2 | var6_1) ^ 405803512;
                                continue block35;
                            }
                            case -207458056: {
                                if (this.a == null) continue block28;
                                ** continue;
                            }
                            case 1925786434: {
                                var4_4 ^= var5_3 ^ -10868007;
                                continue block34;
                            }
                            case -1232237022: {
                                if (this.FE()) ** break;
                                continue block28;
                                continue block27;
                            }
lbl110:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ -1698330792;
                            continue block35;
                            case -1406958258: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            break;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onPortWorldRender(WorldRenderContext var1_1) {
        block64: {
            block62: {
                block68: {
                    block65: {
                        block67: {
                            block63: {
                                block66: {
                                    block61: {
                                        var7_2 = -1875770208;
                                        var4_3 = kR.a & -1875770208 ^ -234338889;
                                        var6_4 = 0;
                                        ** GOTO lbl150
lbl5:
                                        // 1 sources

                                        while (true) {
                                            v0 = (Integer)this.a.getValue();
                                            ** GOTO lbl148
                                            break;
                                        }
lbl8:
                                        // 1 sources

                                        return;
lbl10:
                                        // 1 sources

                                        while (true) {
                                            if (!((Boolean)this.b.getValue()).booleanValue()) break block61;
                                            break block62;
                                            break;
                                        }
lbl13:
                                        // 1 sources

                                        while (true) {
                                            var5_5 ^= var6_4 ^ 2127254903;
                                            break block63;
                                            break;
                                        }
lbl16:
                                        // 1 sources

                                        while (true) {
                                            var2_6 = v0;
                                            ** GOTO lbl132
                                            break;
                                        }
lbl19:
                                        // 1 sources

                                        while (true) {
                                            var6_4 = (var4_3 | var7_2) ^ 1943543542;
                                            break block64;
                                            break;
                                        }
                                    }
lbl23:
                                    // 3 sources

                                    while (true) {
                                        var6_4 = (var4_3 | var7_2) ^ 115408678;
                                        break block65;
                                        while (true) {
                                            var6_4 = (var4_3 | var7_2) ^ 1775577174;
                                            break block65;
                                            break;
                                        }
                                        break;
                                    }
lbl29:
                                    // 1 sources

                                    while (true) {
                                        var3_7 = kR.K.equals(this.c.getValue());
                                        ** GOTO lbl143
                                        break;
                                    }
lbl32:
                                    // 1 sources

                                    while (true) {
                                        var6_4 = (var4_3 | var7_2) ^ -313350348;
                                        break block65;
                                        break;
                                    }
lbl35:
                                    // 2 sources

                                    while (true) {
                                        var6_4 = (var4_3 | var7_2) ^ -395524105;
                                        break block64;
                                        break;
                                    }
lbl38:
                                    // 1 sources

                                    while (true) {
                                        var6_4 = (var4_3 | var7_2) ^ 516592020;
                                        break block65;
lbl41:
                                        // 1 sources

                                        while (true) {
                                            var5_5 ^= var6_4 ^ -183684080;
                                            break block66;
                                            break;
                                        }
                                        break;
                                    }
lbl44:
                                    // 1 sources

                                    while (true) {
                                        var6_4 = (var4_3 | var7_2) ^ 1305801689;
                                        break block64;
                                        break;
                                    }
lbl47:
                                    // 1 sources

                                    while (true) {
                                        var6_4 = (var4_3 | var7_2) ^ 1642593992;
                                        break block64;
                                        break;
                                    }
lbl50:
                                    // 1 sources

                                    while (true) {
                                        var5_5 ^= var6_4 ^ 1119094578;
                                        break block67;
                                        break;
                                    }
                                }
                                var6_4 = (var4_3 | var7_2) ^ 1577488271;
                                break block65;
lbl56:
                                // 1 sources

                                while (true) {
                                    var6_4 = (var4_3 | var7_2) ^ -16483767;
                                    break block65;
lbl59:
                                    // 1 sources

                                    while (true) {
                                        var6_4 = (var4_3 | var7_2) ^ 858118670;
                                        break block65;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var6_4 = (var4_3 | var7_2) ^ -96754939;
                            break block65;
lbl65:
                            // 1 sources

                            while (true) {
                                var5_5 ^= var6_4 ^ 407172458;
                                break block68;
                                break;
                            }
                            while (true) {
                                var6_4 = (var4_3 | var7_2) ^ -224154838;
                                break block65;
lbl71:
                                // 1 sources

                                while (true) {
                                    var6_4 = (var4_3 | var7_2) ^ 2023980470;
                                    break block65;
                                    break;
                                }
lbl74:
                                // 1 sources

                                while (true) {
                                    if (!this.FG()) ** continue;
                                    ** continue;
                                    break;
                                }
                                break;
                            }
lbl77:
                            // 1 sources

                            while (true) {
                                var6_4 = (var4_3 | var7_2) ^ 924555006;
                                break block64;
                                break;
                            }
                        }
                        var6_4 = (var4_3 | var7_2) ^ 540695263;
                    }
lbl83:
                    // 5 sources

                    block55: while (true) {
                        switch (var6_4) {
                            default: {
                                continue block55;
                            }
                            case 222183422: {
                                break block55;
                            }
                            case -771743896: {
                                ** continue;
                            }
                            case -1405302216: {
                                ** continue;
                            }
                            case 994879840: {
                                ** continue;
                            }
                            case 526967427: {
                                ** continue;
                            }
                            case 0x99EE9D: {
                                ** continue;
                            }
                            case -186991983: {
                                ** continue;
                            }
                            case -1054892103: {
                                ** continue;
                            }
                            case -1678807583: {
                                ** continue;
                            }
                            case 134342322: {
                                ** continue;
                            }
lbl107:
                            // 1 sources

                            while (true) {
                                var5_5 ^= var6_4 ^ -311840887;
                                ** GOTO lbl35
                                break;
                            }
                        }
                        break;
                    }
                    var6_4 = (var4_3 | var7_2) ^ 2127441807;
                    ** GOTO lbl83
                }
                var6_4 = (var4_3 | var7_2) ^ -2082111280;
                ** GOTO lbl83
            }
            var6_4 = (var4_3 | var7_2) ^ -914953001;
            ** GOTO lbl83
        }
lbl119:
        // 2 sources

        block57: while (true) {
            switch (var6_4) lbl-1000:
            // 4 sources

            {
                default: {
                    continue block57;
                }
                case 1644478229: {
                    break block57;
                }
                case 441877056: {
                    ** continue;
                }
                case 1451386390: {
                    ** continue;
                }
lbl129:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ -186777235;
                    ** GOTO lbl-1000
                    break;
                }
lbl132:
                // 1 sources

                var5_5 ^= -642759107;
                ** continue;
lbl134:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ -1053412052;
                    ** continue;
                    break;
                }
                {
                    case -1969670143: {
                        if (this.a == null) ** GOTO lbl23
                        ** continue;
                    }
                    case 1910490471: {
                        v0 = (Integer)this.b.getValue();
                        ** GOTO lbl148
                    }
                }
lbl143:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ -1874920798;
                ** GOTO lbl-1000
                case 115623130: {
                    var5_5 ^= var6_4 ^ -1946833638;
                    break block57;
                }
lbl148:
                // 2 sources

                var5_5 ^= -1956452912;
                ** continue;
lbl150:
                // 1 sources

                var5_5 = (var4_3 | var7_2) ^ -1408967633;
                ** continue;
                case -1074874770: {
                    lC.render(var1_1, (class_1297)this.a, var2_6, var3_7);
                    ** continue;
                }
                {
                    case -1930139080: {
                        var5_5 ^= var6_4 ^ -1589546935;
                        ** continue;
                    }
                    case -319761373: {
                        ** continue;
                    }
                    ** case 856453275:
                }
lbl161:
                // 1 sources

                if (kR.a.field_1755 == null) ** continue;
                ** continue;
                case 1299995501: {
                    switch (var5_5) {
                        case -593493147: {
                            ** continue;
                        }
                        default: {
                            ** continue;
                        }
                        case 1674334581: 
                    }
                    var6_4 = (var4_3 | var7_2) ^ -1531436127;
                    ** GOTO lbl-1000
                }
                case -987638967: {
                    return;
                }
            }
            break;
        }
        var6_4 = (var4_3 | var7_2) ^ -1085923622;
        ** while (true)
        {
            case -2115871935: {
                var5_5 ^= var6_4 ^ 995113709;
                ** continue;
            }
            ** case -1814185089:
        }
lbl180:
        // 1 sources

        var5_5 ^= var6_4 ^ -150031151;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Comparator<class_1309> FH() {
        int n2 = a & 0x45E06F84 ^ 0xC9959192;
        int n3 = 0;
        int n4 = (n2 | 0x45E06F84) ^ 0x46B91B7C;
        n3 = (n2 | 0x45E06F84) ^ 0x96B37C45;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1531347923: {
                    n3 = (n2 | 0x45E06F84) ^ 0x3D3138F2;
                    continue block5;
                }
                case 1662108177: {
                    class_310 class_3102 = class_310.method_1551();
                    n4 ^= 0x6C6A96C8;
                    return Comparator.comparingInt(arg_0 -> kR.FR(class_3102, arg_0));
                }
                case -255539356: 
            }
            n4 ^= n3 ^ 0x4AB62335;
            n3 = (n2 | 0x45E06F84) ^ 0xAEE43D87;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Comparator<class_1309> FI() {
        int n2 = a & 0x232CD300 ^ 0x5064F6B0;
        int n3 = 0;
        int n4 = (n2 | 0x232CD300) ^ 0x9C31CD45;
        n3 = (n2 | 0x232CD300) ^ 0x3AE8C33E;
        block5: while (true) {
            switch (n3) {
                case 427808149: {
                    class_310 class_3102 = class_310.method_1551();
                    n4 ^= 0x31C3AA6A;
                    return Comparator.comparingDouble(class_13092 -> {
                        int n2 = a & 0x1B8774FA ^ 0x1704C7A5;
                        int n3 = 0;
                        int n4 = (n2 | 0x1B8774FA) ^ 0xD4213EC9;
                        n3 = (n2 | 0x1B8774FA) ^ 0xDB0B2060;
                        block5: while (true) {
                            switch (n3) {
                                default: {
                                    continue block5;
                                }
                                case 645050580: {
                                    n4 ^= n3 ^ 0x9C7F0F49;
                                    n3 = (n2 | 0x1B8774FA) ^ 0xCEAD00DD;
                                    continue block5;
                                }
                                case -785713374: {
                                    return class_3102.field_1724.method_5739((class_1297)class_13092);
                                }
                                case -997402721: 
                            }
                            n3 = (n2 | 0x1B8774FA) ^ 0x39F5472B;
                        }
                    });
                }
                case -1436812304: {
                    n4 ^= n3 ^ 0x88EA3B1F;
                    n3 = (n2 | 0x232CD300) ^ 0x6A132225;
                }
                default: {
                    continue block5;
                }
                case 1233400974: 
            }
            n3 = (n2 | 0x232CD300) ^ 0xD9370C40;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static Comparator<class_1309> FJ() {
        int n2 = a & 0x83287256 ^ 0xE0F0D431;
        int n3 = 0;
        int n4 = (n2 | 0x83287256) ^ 0xCFA09B51;
        n3 = (n2 | 0x83287256) ^ 0xEFEFF0FC;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 202835595: {
                    n3 = (n2 | 0x83287256) ^ 0x3888B942;
                    continue block5;
                }
                case -1594118260: {
                    class_310 class_3102 = class_310.method_1551();
                    n4 ^= 0xD2B5B654;
                    return (arg_0, arg_1) -> kR.FP(class_3102, arg_0, arg_1);
                }
                case -613396683: 
            }
            n4 ^= n3 ^ 0xAF30F848;
            n3 = (n2 | 0x83287256) ^ 0x430359FB;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static float FK(class_1309 var0) {
        block68: {
            var9_1 = -1657792679;
            var6_2 = kR.a & -1657792679 ^ 2048411511;
            var8_3 = 0;
            var7_9 = (var6_2 | var9_1) ^ -1115206973;
            var8_3 = (var6_2 | var9_1) ^ -413022432;
            ** GOTO lbl159
            while (true) {
                var8_3 = (var6_2 | var9_1) ^ 353913867;
                ** GOTO lbl172
lbl10:
                // 1 sources

                while (true) {
                    var8_3 = (var6_2 | var9_1) ^ 1069841197;
                    ** GOTO lbl58
                    break;
                }
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var8_3 = (var6_2 | var9_1) ^ 786287797;
                ** GOTO lbl172
                break;
            }
lbl16:
            // 1 sources

            while (true) {
                var8_3 = (var6_2 | var9_1) ^ -326491935;
                ** GOTO lbl159
                break;
            }
            while (true) {
                var8_3 = (var6_2 | var9_1) ^ 1421590517;
                ** GOTO lbl58
lbl22:
                // 1 sources

                while (true) {
                    var8_3 = (var6_2 | var9_1) ^ -208590121;
                    ** GOTO lbl31
                    break;
                }
                break;
            }
lbl25:
            // 1 sources

            while (true) {
                var8_3 = (var6_2 | var9_1) ^ 953674846;
                break block68;
                break;
            }
lbl28:
            // 1 sources

            while (true) {
                var8_3 = (var6_2 | var9_1) ^ -613977607;
                ** GOTO lbl172
lbl31:
                // 2 sources

                block53: while (true) {
                    block69: {
                        switch (var8_3) {
                            case 212434344: {
                                if (!var5_8.comp_2395().equals((Object)class_5134.field_23721)) ** GOTO lbl38
                                ** GOTO lbl40
                            }
                            case 178379089: {
                                var2_5 += (float)var5_8.comp_2396().comp_2449();
lbl38:
                                // 2 sources

                                var8_3 = (var6_2 | var9_1) ^ -592389671;
                                ** GOTO lbl41
                            }
lbl40:
                            // 1 sources

                            var8_3 = (var6_2 | var9_1) ^ -176693857;
lbl41:
                            // 3 sources

                            default: {
                                continue block53;
                            }
                            case 172985056: {
                                break block69;
                            }
                            case -1236280068: {
                                ** GOTO lbl149
                            }
                            case 1025242700: {
                                var7_9 ^= var8_3 ^ 55186371;
                                ** continue;
                            }
                            case 596151974: 
                        }
                        var7_9 ^= var8_3 ^ -1688933398;
                        ** break;
lbl53:
                        // 1 sources

                        var8_3 = (var6_2 | var9_1) ^ 1232571267;
                        continue;
                    }
                    var8_3 = (var6_2 | var9_1) ^ -174485970;
                    continue;
                    break;
                }
lbl58:
                // 3 sources

                block54: while (true) {
                    switch (var8_3) {
                        case -1570699468: {
                            var7_9 ^= var8_3 ^ -1779802342;
                            ** break;
                        }
                        case -1057215406: {
                            var5_8 = (class_9285.class_9287)var4_7.next();
                            var8_3 = (var6_2 | var9_1) ^ -1037852365;
                            ** continue;
                        }
lbl67:
                        // 1 sources

                        var8_3 = (var6_2 | var9_1) ^ 407421038;
                        default: {
                            continue block54;
                        }
                        case -1417418614: {
                            var7_9 ^= var8_3 ^ 444936295;
                            ** continue;
                        }
                        case -412051695: 
                    }
                    if (var4_7.hasNext()) ** continue;
                    while (true) {
                        var8_3 = (var6_2 | var9_1) ^ 1914665608;
                        ** GOTO lbl131
                        break;
                    }
lbl78:
                    // 1 sources

                    while (true) {
                        var8_3 = (var6_2 | var9_1) ^ 41727085;
                        break block68;
                        break;
                    }
                    break;
                }
                break;
            }
lbl81:
            // 1 sources

            while (true) {
                var8_3 = (var6_2 | var9_1) ^ 1133401095;
                ** GOTO lbl172
lbl84:
                // 1 sources

                while (true) {
                    var7_9 ^= 2033436791;
                    var3_6 = (class_9285)var1_4.method_58694(class_9334.field_49636);
                    var8_3 = (var6_2 | var9_1) ^ 70497208;
                    ** GOTO lbl154
lbl89:
                    // 1 sources

                    while (true) {
                        var8_3 = (var6_2 | var9_1) ^ -1515078286;
                        ** GOTO lbl131
                        break;
                    }
                    break;
                }
                break;
            }
lbl92:
            // 1 sources

            while (true) {
                var8_3 = (var6_2 | var9_1) ^ 50096472;
                ** GOTO lbl159
                break;
            }
        }
        block61: while (true) {
            switch (var8_3) {
                case -940590303: {
                    var8_3 = (var6_2 | var9_1) ^ -1911176261;
                    continue block61;
                }
                case 436933424: {
                    var7_9 ^= var8_3 ^ 1405610054;
                    ** GOTO lbl117
                }
                case -45817070: {
                    if (var4_7 != null) {
                        ** break;
                    }
                    ** GOTO lbl119
                }
                case 1898812612: {
                    var2_5 = (float)((double)var2_5 * (1.375 * (double)(var4_7.method_5578() + 1)));
                    ** GOTO lbl119
                }
                case -1665125890: {
                    if (var4_7.method_5584() > 0) {
                        ** continue;
                    }
                    ** GOTO lbl119
                }
lbl115:
                // 1 sources

                var8_3 = (var6_2 | var9_1) ^ -1436545344;
                ** GOTO lbl120
lbl117:
                // 1 sources

                var8_3 = (var6_2 | var9_1) ^ 569339231;
                ** GOTO lbl120
lbl119:
                // 3 sources

                var8_3 = (var6_2 | var9_1) ^ -449625009;
lbl120:
                // 4 sources

                default: {
                    continue block61;
                }
                case 1431853503: {
                    var8_3 = (var6_2 | var9_1) ^ 1677223553;
                    continue block61;
                }
                case -754598083: {
                    var7_9 ^= var8_3 ^ -1579957943;
                    ** continue;
                }
lbl128:
                // 1 sources

                while (true) {
                    var8_3 = (var6_2 | var9_1) ^ 1267952380;
                    ** GOTO lbl172
                    break;
                }
lbl131:
                // 2 sources

                block63: while (true) {
                    switch (var8_3) {
                        case 1518987789: {
                            var4_7 = var3_6.comp_2393().iterator();
                            ** GOTO lbl149
                        }
                        case 1233677515: {
                            if (var3_6 == null) ** continue;
                            var8_3 = (var6_2 | var9_1) ^ 259808610;
                            continue block63;
                        }
                        case -1926812169: {
                            var7_9 ^= var8_3 ^ -786006899;
                            ** break;
                        }
                        case -1764414053: {
                            var4_7 = var0.method_6112(class_1294.field_5910);
                            var8_3 = (var6_2 | var9_1) ^ 742254658;
                            continue block61;
                        }
lbl147:
                        // 1 sources

                        var8_3 = (var6_2 | var9_1) ^ 1777171172;
                        ** GOTO lbl154
lbl149:
                        // 2 sources

                        var8_3 = (var6_2 | var9_1) ^ 1566134347;
                        ** continue;
                        case -83106617: {
                            var7_9 ^= var8_3 ^ 2084922676;
                            var8_3 = (var6_2 | var9_1) ^ -1229964364;
                        }
lbl154:
                        // 4 sources

                        default: {
                            continue block63;
                        }
                        case -263976419: 
                    }
                    break;
                }
                var7_9 ^= var8_3 ^ -942714317;
                ** continue;
lbl159:
                // 3 sources

                block64: while (true) {
                    switch (var8_3) {
                        default: {
                            continue block64;
                        }
                        case 330463134: {
                            var1_4 = var0.method_6047();
                            var8_3 = (var6_2 | var9_1) ^ -2001289960;
                            break block64;
                        }
                        case -37470681: {
                            var7_9 ^= var8_3 ^ -677456211;
                            ** continue;
                        }
                        case 408522847: {
                            ** continue;
                        }
                    }
                    break;
                }
lbl172:
                // 6 sources

                block65: while (true) {
                    switch (var8_3) {
                        default: {
                            continue block65;
                        }
                        case 610215558: {
                            var2_5 = 0.0f;
                            ** continue;
                        }
                        case -1128922248: {
                            return 0.0f;
                        }
                        case -773481526: {
                            if (!var1_4.method_7960()) ** continue;
                            ** continue;
                        }
                        case 2005854823: {
                            var7_9 ^= var8_3 ^ 1005370999;
                            ** continue;
                        }
                        case -366994572: {
                            var7_9 ^= var8_3 ^ 1102946365;
                            ** continue;
                        }
                        case -1263846013: 
                    }
                    break;
                }
                var7_9 ^= var8_3 ^ -1329874193;
                ** continue;
                case -556320224: 
            }
            break;
        }
        return var2_5;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static Comparator<class_1309> FL() {
        int n2 = a & 0x774B7763 ^ 0xB6A0A5DA;
        int n3 = 0;
        int n4 = (n2 | 0x774B7763) ^ 0xEC689850;
        n3 = (n2 | 0x774B7763) ^ 0xA6872318;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1366086883: {
                    n3 = (n2 | 0x774B7763) ^ 0x48B00166;
                    continue block5;
                }
                case -1084492131: {
                    n4 ^= n3 ^ 0x22BB46F0;
                    n3 = (n2 | 0x774B7763) ^ 0xACA2B58F;
                    continue block5;
                }
                case 1531527796: 
            }
            break;
        }
        class_310 class_3102 = class_310.method_1551();
        n4 ^= 0xFE584D2C;
        return (arg_0, arg_1) -> kR.FO(class_3102, arg_0, arg_1);
    }

    /*
     * Exception decompiling
     */
    private static double FM(class_1309 var0) {
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
        block27: {
            block26: {
                break block27;
lbl1:
                // 1 sources

                while (true) {
                    var7_2 = var8_1 ^ 1940910234;
                    break block26;
                    break;
                }
lbl4:
                // 1 sources

                block20: while (true) {
                    var5_8 = (var0_3[var3_6] & (((var6_9 ^= -1673689973) | var8_1) ^ -405048028)) << ((var6_9 | var8_1) ^ -405047869) | (var0_3[var3_6 + 1] & ((var6_9 | var8_1) ^ -405048028)) << ((var6_9 | var8_1) ^ -405047861) | (var0_3[var3_6 + 2] & ((var6_9 | var8_1) ^ -405048028)) << ((var6_9 | var8_1) ^ -405047853) | var0_3[var3_6 + 3] & ((var6_9 | var8_1) ^ -405048028);
                    var7_2 = var8_1 ^ 1199502835;
                    block21: while (true) {
                        switch (var7_2) {
                            default: {
                                continue block21;
                            }
                            case -2015110290: {
                                kR.a[var4_7] = var5_8 ^= var2_5;
                                var7_2 = var8_1 ^ -853849572;
                                continue block21;
                            }
                            case -1864638849: {
                                var6_9 ^= var7_2 ^ 1640594680;
                                var7_2 = var8_1 ^ var9;
                                continue block21;
                            }
                            case 1321810901: {
                                var6_9 ^= var7_2 ^ 945546301;
                                var7_2 = var8_1 ^ 1281685770;
                                continue block21;
                            }
                            case -810121021: {
                                var3_6 += 4;
                                if (++var4_7 < var1_4) continue block20;
                                var7_2 = var8_1 ^ 319401910;
                                continue block21;
                            }
                            case -995326918: {
                                var6_9 ^= var7_2 ^ 772005721;
                                var7_2 = var8_1 ^ 70363815;
                                continue block21;
                            }
lbl32:
                            // 1 sources

                            while (true) {
                                var7_2 = var8_1 ^ 2007729035;
                                break block26;
                                break;
                            }
lbl35:
                            // 1 sources

                            while (true) {
                                var1_4 = var0_3.length / 4;
                                ** continue;
                                break;
                            }
                            case -441136902: 
                        }
                        break;
                    }
                    break;
                }
                kR.e = kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519597), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1787638172)));
                kR.k = gj.decode("+YwL2CJRbDlh4A==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519598), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 2088269901))));
                kR.s = gj.decode("nBeioKbgHgJGYfakFW6DUFaK9yGrbG69HIyzLe+LfHOdxgcWGlcF5CR1Np4iiouJaRzX", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519587), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1841752918))));
                kR.e = gj.decode("CAx9Ybr0EcKt", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519588), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 106692871))));
                kR.c = gj.decode("GijYew==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519585), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -665678561))));
                kR.P = gj.decode("YVCeOzzstQxxSF0npZ28rKw7AHCSxnHRxr192+HziVLKoGWudA==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519586), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1417224545))));
                kR.b = gj.decode("3M7HCy//f0RQJzF4GPTasd5CscsocA==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519591), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 955004569))));
                kR.G = gj.decode("b0Dlzg==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519592), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -2144001071))));
                kR.r = gj.decode("Pv9J", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519589), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 277235699))));
                kR.a = gj.decode("RknsCWiZ+VkgaZs5w2l2sXAl7P66UhMBBYM4uMvs8/qmOImCC9FWRFZyjHWq1Q==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519590), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -2077098484))));
                kR.z = gj.decode("nDqgOZh8MnmrVY0nz3pxYWnkunv7SQ==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519611), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 900883949))));
                kR.A = gj.decode("mgIPw8w0a0/T8Ndhlqad3Y3bkYQ42PJTsOCTy945prOHU/9D5dF3fyNJxsqN4A==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519612), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1383776238))));
                kR.M = gj.decode("g6udlrPjRzuM+3v2JaMW1SE/B4o=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519609), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 729929171))));
                kR.N = gj.decode("9sRuyemFMx55FzRNYjxaF+VC/tij8vCtXMpRaUASoPZRVe3mQOa2YRro1hJkHu863oknjj2W/YQW6qU6rJ+ASGty3rRAKojwGwXZvU9eiw3VYszgRw==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519610), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -309560561))));
                kR.R = gj.decode("zWDgaI6D9Jnl", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519615), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 503866664))));
                kR.H = gj.decode("PURQZ88SlwIFJTe5inRI4HPY1enRVtEz043kEKiULzPbelBg58keqn+8ANKGtSLwZBl18tmrBOJJjK3Yr2bRVLQfy0T5Zio=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519616), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -2067554940))));
                kR.T = gj.decode("9xg1JNAn91QH9ik=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519613), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1833834908))));
                kR.y = gj.decode("My1d0f5YQ0w=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519614), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1710704894))));
                kR.O = gj.decode("rYa/", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519603), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 994656360))));
                kR.X = gj.decode("2rTTc3M=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519604), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1065741122))));
                kR.W = gj.decode("O4I8kl8l", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519601), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -750081576))));
                kR.V = gj.decode("k3AsbYCf", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519602), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 472465251))));
                kR.o = gj.decode("3RSt0PnwLZlKHX3lBWjkj2kfaahAfvjhdeMYprXEBsLlnyua3hl2hRhlLybrt//eHpec8U0ot2dpMxkMBKCvGqzyhRrvAlsENlyUZaFujUyGrsjHYhOkohXEvKoMHds=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519607), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1321101320))));
                kR.l = gj.decode("7LZBw4iGXAKW75c=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519608), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 553623736))));
                kR.U = gj.decode("zIdiqz+c", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519605), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 2084242736))));
                kR.ab = gj.decode("EcbPyqMMVQ==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519606), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 756547761))));
                kR.S = gj.decode("p3PD960BpGA+SRbj/4OmRSYBtnZzkTb67KbFJHO/Hwq1MV9ynd5jwmzbzKqyjPpSrFdEm+/VReqXGZ5fFxlbh7b+eOUjhjSrrjdZdPvfR/BWTuRtJrgCwNQ9pwM/cao=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519563), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 788564237))));
                kR.w = gj.decode("HTFqX2VCfY/W3tf0", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519564), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1197710758))));
                kR.g = gj.decode("VdCFew5N4AslOrPpztdDj3e2EHLurm1kkXt1Q9V0dOgPw0X5JX30+yNppIYEzODCgt3ec+URZh46qUjSWsWwb/VLijPd43JED7cM0ubKFAdG65TFNRQ0o0WuEhPNAEyRT6pgmXQ4wkoUKONMVkqr", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519561), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -27413683))));
                kR.q = gj.decode("HSx81ghd8Bf2DaGu9w==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519562), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1200120584))));
                kR.Y = gj.decode("tgXDu0MYNr7BYnIUBL6hMjFzLm0h9H9lSCK0FqTtP/ttAigKJMmzizDxGH9MIl55udUPwS7vnig+f79WzT7RRqJqq98qGPiNBI97GfOQuUr78Ae/JbiGdeJeOWMCCA==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519567), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1938706734))));
                kR.ac = gj.decode("0+gfim0KANQO6bAcRDuoZA==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519568), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1557208031))));
                kR.x = gj.decode("vIMcbkjHQhEMp8L/", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519565), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 910359421))));
                kR.D = gj.decode("cJjZG/NT+KVvjK8aJexbVYFT/UZR+u/qE+G0RKX0ByVvnuVk8oMzL6sBod6Xe5kZ/+099eo=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519566), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -196482423))));
                kR.L = gj.decode("CTOc+IyRc1Y2US6gmKThha3SnNKnqw==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519555), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 748107956))));
                kR.n = gj.decode("jT271IoKRUORdygDcjrM2jK59TzniqdBs46B1vD9y2FkbggCve0ONzNIpLc=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519556), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1279661821))));
                kR.v = gj.decode("nwNgj0Z37YgB+KPGrxh9t8rmd/885Q==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519553), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1936445885))));
                kR.C = gj.decode("h2omH5ktVvD5HCaPBnJMLXtWNqvi2+claVrDum92jfcjYfeAXtqn/WORFcoOBEZ8+x2WAfyxjS9ZlGVgBg==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519554), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 945088390))));
                kR.Q = gj.decode("UfqQi24CDrMePjWtgsvEzfPjsaUW/g==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519559), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1469688199))));
                kR.B = gj.decode("i+1eXpyA8AU1XW6hkEK6pkXwWdw=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519560), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1792273329))));
                kR.I = gj.decode("Ad7E2W/nOvteYBnoagNVr4M=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519557), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1580218224))));
                kR.Z = gj.decode("MuhBYfaTQz8=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519558), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 558549859))));
                kR.p = gj.decode("UOxjMn8JGg==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519579), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 224866643))));
                kR.i = gj.decode("jVRIblaMbVYcQmZCXUwIrO1n", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519580), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1459219900))));
                kR.aa = gj.decode("uTf43f3VNY2QftA=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519577), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 612938652))));
                kR.E = gj.decode("jfo2lxErCgtGM/3d", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519578), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1923423210))));
                kR.d = gj.decode("7bg+W8hrZzAOOgzg", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519583), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1442513083))));
                kR.j = gj.decode("KuUvysKDHVS1emA=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519584), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1133215719))));
                kR.K = gj.decode("ceWJpQ==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519581), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -626984812))));
                kR.F = gj.decode("oTeB", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519582), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1446654969))));
                kR.t = gj.decode("MldCHYoL4LtGJmcycuw=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519571), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -322417259))));
                kR.m = gj.decode("JIxYHvsiMBygak+jvMDx19MjTaV+C4Chg7HTCoeguYLVI/ow8h4lealWUR8kQlQr", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519572), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 60165370))));
                kR.J = gj.decode("hwhf4kJuIOwyZkvXXA==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519569), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1668789270))));
                kR.u = gj.decode("bfunq24tZw11ToG4", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519570), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1830125420))));
                kR.f = gj.decode("viEIaJNzJw==", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519575), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1300604912))));
                kR.h = gj.decode("hy3k7kI3YHM=", kR.Ft((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1661519576), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1803606395))));
                return;
            }
            block24: while (true) {
                switch (var7_2) {
                    default: {
                        continue block24;
                    }
                    case -1269689820: {
                        kR.a = new int[var1_4];
                        var7_2 = var8_1 ^ -1822369672;
                        continue block24;
                    }
                    case -260210349: {
                        var6_9 ^= var7_2 ^ 1619624813;
                        var7_2 = var8_1 ^ 931161069;
                        continue block24;
                    }
                    case 280144305: {
                        var6_9 ^= var7_2 ^ 1086439959;
                        ** continue;
                    }
                    case -193334718: 
                }
                break;
            }
            var3_6 = 0;
            var6_9 ^= 10582283;
            var4_7 = 0;
            ** while (true)
        }
        var9 = 1718008115;
        var8_1 = -2083360311;
        kR.a = mK.a(MethodHandles.lookup().lookupClass(), 1088091297);
        var7_2 = 0;
        var6_9 = 1345716300;
        var7_2 = var8_1 ^ -987738515;
        block25: while (true) {
            switch (var7_2) {
                default: {
                    continue block25;
                }
                case 1190281124: {
                    var7_2 = var8_1 ^ 422300002;
                    continue block25;
                }
                case -1694910293: {
                    var6_9 ^= var7_2 ^ 1694862031;
                    var7_2 = var8_1 ^ -509771931;
                    continue block25;
                }
                case 1649348268: 
            }
            break;
        }
        var2_5 = (var6_9 | var7_2 ^ -509771931) ^ (var7_2 ^ 1603945265) ^ kR.a;
        var6_9 ^= -1518762350;
        var0_3 = "\u00aeW!=\u00d7\u00b5kh\u00fdI;\u0002t\u001fx\u008ea?C:\u00c0'2\u00f6\u00c5o\u00a3~\bdP#?\b\u00bb\u000f\u0001\u008f}S/\u0005\u0015\u00a7\u00e9 \u00bfaZ\u00f7\u00aa'[\u0083wH#\u00b9Q\u00ef\u008d\u0007\u0097\u00a8\u0018u\u0000\ry\u00bd\u00ea\u00a1\u00f0%U\u0014\u00f5t\u00b22\u00ce8UUT\u001d\u00d6t\u00f6\u00ab\u0010H\u00fa\u00b2c\u008d\u00far\u00c3\u00fb\u00ce\u00d5\u00dd\u008b~\u00ee\u00e8\f\u00ceq\u00ae\u00d9\u00dd.\u00c7\u00e7\u00b6\u0002\u00dc\u00b8\u00de'Q\u00cd\u00d9 \u0090\u00ac$\u00f7]s\u0012\u00cd\u009bSX\u00cfd=\u00d9\u00efc\u0081\u00aeV\u00c8\u008ba\u0092\u00c3\u00dc\u00e3\u00c6\u0011\u000e\u00fa\u0084\u0086+\u00ff\u00d2\u00f6\u00b8\u00dd\u00c1a\u00d1\u00cfk\u00a8\u00e1C\"\u00ee\u0005\u009b|\u00cd\u00f1\u0084\u001ef\u00d7-\u00bb\u0001\u00d4\u00d8\u00be\u00be\u000fQ\u00d5\u00a4\u001b\u0093\f%@\u00d7\u00ee\u0013\u00ba<\u00cd+\u0000U\u00a3\u00f5\u00c0h\u00bd_\u00fb\u008agi\u008a\u0016\u008d>\u00fcE{]\u0095;u\u0017\t\u0083\u00de\u00aab\u00c8\u0012,\u0013\u00ed\u00ad~\u00d9/\u00f8:\u00a0".getBytes("ISO-8859-1");
        var6_9 ^= -1293859464;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static gg FN() {
        block15: {
            var5 = 1978623490;
            var2_1 = kR.a & 1978623490 ^ 215197473;
            var4_2 = 0;
            var3_4 = (var2_1 | var5) ^ 1992994372;
            var4_2 = (var2_1 | var5) ^ -2036115747;
            if (true) ** GOTO lbl33
lbl7:
            // 2 sources

            block11: while (true) {
                block14: {
                    switch (var4_2) {
                        default: {
                            continue block11;
                        }
                        case -1528744053: {
                            var3_4 ^= var4_2 ^ 1527362820;
                            ** break;
                        }
                        case -2066691532: {
                            var3_4 ^= var4_2 ^ -1949681509;
                            ** GOTO lbl22
                        }
lbl17:
                        // 1 sources

                        var4_2 = (var2_1 | var5) ^ 171594098;
                        continue block11;
                        case 2009445969: {
                            v0 = null;
                            break block14;
                        }
lbl22:
                        // 1 sources

                        var4_2 = (var2_1 | var5) ^ 682779965;
                        continue block11;
                        case 1431142942: 
                    }
                    var0_3 = (gg)var1_5;
                    var3_4 ^= -252547040;
                    v0 = var0_3;
                }
                var3_4 ^= 519884953;
                return v0;
            }
            block12: while (true) {
                var4_2 = (var2_1 | var5) ^ 769981897;
lbl33:
                // 2 sources

                block13: while (true) {
                    switch (var4_2) {
                        default: {
                            continue block13;
                        }
                        case -77811202: {
                            var4_2 = (var2_1 | var5) ^ -1458967902;
                            continue block13;
                        }
                        case -722072191: {
                            var3_4 ^= var4_2 ^ 136976057;
                            continue block12;
                        }
                        case 1343953642: 
                    }
                    break;
                }
                break;
            }
            var1_5 = mw.getInstance().getModuleByName(kR.h);
            if (!(var1_5 instanceof gg)) break block15;
            var4_2 = (var2_1 | var5) ^ -114348777;
            ** GOTO lbl7
        }
        var4_2 = (var2_1 | var5) ^ -652291928;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    static class_238 boxOf(class_1297 class_12972) {
        int n2 = a & 0xBE5D7720 ^ 0x7C3B3ED2;
        int n3 = 0;
        int n4 = (n2 | 0xBE5D7720) ^ 0x1D79F4E3;
        n3 = (n2 | 0xBE5D7720) ^ 0xA58C979B;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1542711401: {
                    break;
                }
                case -771230844: {
                    n4 ^= n3 ^ 0xC9E04D28;
                    n3 = (n2 | 0xBE5D7720) ^ 0x2A348CC3;
                    continue block5;
                }
                case -733220047: {
                    return class_12972.method_5829();
                }
            }
            n3 = (n2 | 0xBE5D7720) ^ 0x2C788C76;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ int FO(class_310 var0, class_1309 var1_1, class_1309 var2_2) {
        var6_3 = -1639643716;
        var3_4 = kR.a & -1639643716 ^ 1693704849;
        var5_5 = 0;
        var4_6 = (var3_4 | var6_3) ^ -2093061297;
        var5_5 = (var3_4 | var6_3) ^ -577889669;
        if (true) ** GOTO lbl15
        block11: while (true) {
            var5_5 = (var3_4 | var6_3) ^ -1123664075;
            if (true) ** GOTO lbl15
            block12: while (true) {
                var5_5 = (var3_4 | var6_3) ^ -412986237;
                if (true) ** GOTO lbl15
                block13: while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 140181205;
lbl15:
                    // 4 sources

                    block14: while (true) {
                        switch (var5_5) {
                            case 1139923080: {
                                var5_5 = (var3_4 | var6_3) ^ 1038543792;
                                continue block14;
                            }
                            case -1022292979: {
                                if (!(var2_2 instanceof class_1657)) continue block12;
                                continue block13;
                            }
                            case 595197382: {
                                var5_5 = (var3_4 | var6_3) ^ 1504577760;
                                continue block14;
                            }
                            case -1487278243: {
                                var4_6 ^= var5_5 ^ 1675442918;
                                var5_5 = (var3_4 | var6_3) ^ 425248760;
                                ** break;
                            }
                            case -156427928: {
                                var4_6 ^= var5_5 ^ 196634649;
                                var5_5 = (var3_4 | var6_3) ^ 1194101738;
                                ** break;
                            }
                            case -407953339: {
                                if (var1_1 instanceof class_1657) ** break;
                                continue block12;
                                continue block11;
                            }
                            case 429241150: {
                                var4_6 ^= var5_5 ^ 12584648;
                                var5_5 = (var3_4 | var6_3) ^ -1844586006;
                            }
lbl41:
                            // 4 sources

                            default: {
                                continue block14;
                            }
                            case 1828339287: {
                                return Float.compare(var0.field_1724.method_5739((class_1297)var1_1), var0.field_1724.method_5739((class_1297)var2_2));
                            }
                            case -1176802217: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            break;
        }
        return Double.compare(kR.FM(var1_1), kR.FM(var2_2));
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ int FP(class_310 var0, class_1309 var1_1, class_1309 var2_2) {
        var6_3 = 443353287;
        var3_4 = kR.a & 443353287 ^ -1971440720;
        var5_5 = 0;
        ** GOTO lbl52
lbl5:
        // 1 sources

        while (true) {
            var5_5 = (var3_4 | var6_3) ^ -33221019;
            ** GOTO lbl18
lbl8:
            // 1 sources

            while (true) {
                if (!(var2_2 instanceof class_1657)) ** GOTO lbl16
                if (true) ** GOTO lbl30
                break;
            }
lbl11:
            // 1 sources

            return Float.compare(kR.FK(var1_1), kR.FK(var2_2));
        }
        block14: while (true) {
            var5_5 = (var3_4 | var6_3) ^ 219144522;
            ** GOTO lbl18
lbl16:
            // 1 sources

            block15: while (true) {
                var5_5 = (var3_4 | var6_3) ^ 396214428;
lbl18:
                // 3 sources

                block16: while (true) {
                    switch (var5_5) lbl-1000:
                    // 7 sources

                    {
                        while (true) {
                            default: {
                                continue block16;
                            }
                            break;
                        }
                        case -149617299: {
                            ** continue;
                        }
                        case -1415582820: {
                            ** continue;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 1213846366;
                            ** GOTO lbl-1000
                            break;
                        }
lbl30:
                        // 1 sources

                        var5_5 = (var3_4 | var6_3) ^ 70915460;
                        ** GOTO lbl-1000
                        case -769202007: {
                            return Float.compare(var0.field_1724.method_5739((class_1297)var1_1), var0.field_1724.method_5739((class_1297)var2_2));
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 1835679386;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -1754211651: {
                            ** continue;
                        }
                        case -1552359506: {
                            var4_6 ^= var5_5 ^ 1291892455;
                            ** continue;
                        }
                        case 1899232593: {
                            ** GOTO lbl47
                        }
lbl44:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ -347289946;
                            ** GOTO lbl-1000
                            break;
                        }
lbl47:
                        // 1 sources

                        var5_5 = (var3_4 | var6_3) ^ 956818521;
                        ** GOTO lbl-1000
lbl49:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 836817003;
                            ** continue;
                            break;
                        }
lbl52:
                        // 1 sources

                        var4_6 = (var3_4 | var6_3) ^ -1511589447;
                        ** continue;
                        case 1685728658: {
                            if (!(var1_1 instanceof class_1657)) continue block15;
                            continue block14;
                        }
                        case -1914504341: {
                            var4_6 ^= var5_5 ^ -2007289169;
                            ** continue;
                        }
                        case -1639633293: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        var4_6 ^= var5_5 ^ -808028777;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ int FR(class_310 var0, class_1309 var1_1) {
        block9: {
            break block9;
lbl1:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_2 = kR.a & 711090020 ^ -1521238422;
        var4_3 = 0;
        var3_4 = (var2_2 | 711090020) ^ 1436875724;
        ** GOTO lbl19
        var4_3 = (var2_2 | 711090020) ^ -2008492618;
        block6: while (true) {
            switch (var4_3) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block6;
                    }
                    break;
                }
                case 542797685: {
                    return hC.angleDifference((class_1297)var0.field_1724, (class_1297)var1_1);
                }
lbl16:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | 711090020) ^ -1893101541;
                    ** GOTO lbl-1000
                    break;
                }
lbl19:
                // 1 sources

                var4_3 = (var2_2 | 711090020) ^ 1869438410;
                ** continue;
                case 658189016: {
                    var3_4 ^= var4_3 ^ -45749508;
                    ** continue;
                }
                case -1071734108: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ boolean FS() {
        block20: {
            block19: {
                block18: {
                    block22: {
                        block21: {
                            break block21;
lbl1:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 1376323851;
                                break block18;
                                break;
                            }
                        }
                        var4_1 = 1187198963;
                        var1_2 = kR.a & 1187198963 ^ -2119787024;
                        var3_3 = 0;
                        break block22;
lbl9:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -1929466862;
                            break block19;
                            break;
                        }
                    }
                    var2_4 = (var1_2 | var4_1) ^ -2069550437;
                    var3_3 = (var1_2 | var4_1) ^ 218760007;
                    break block20;
                }
                var3_3 = (var1_2 | var4_1) ^ -1483343148;
                break block20;
lbl19:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -307162495;
                    break block20;
lbl22:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1873408657;
                        break block20;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (!((Boolean)this.a.getValue()).booleanValue()) {
                        ** continue;
lbl27:
                        // 1 sources

                        ** GOTO lbl22
                    }
                    ** GOTO lbl49
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 1876718114;
        }
        block14: while (true) {
            switch (var3_3) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block14;
                    }
                    break;
                }
                case 710323570: {
                    ** continue;
                }
                case 517590868: {
                    ** continue;
                }
                case 1618101543: {
                    ** GOTO lbl25
                }
lbl43:
                // 2 sources

                while (true) {
                    var2_4 ^= -1559387048;
                    ** GOTO lbl54
                    break;
                }
                case -1472475695: {
                    v0 = false;
                    ** GOTO lbl43
                }
lbl49:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -650219353;
                ** GOTO lbl-1000
lbl51:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1633576345;
                    ** continue;
                    break;
                }
lbl54:
                // 1 sources

                return v0;
                case -890389324: {
                    ** continue;
                }
                case -1471263390: {
                    var2_4 ^= var3_3 ^ 979971620;
                    ** continue;
                }
                case 1497769364: 
            }
            break;
        }
        v0 = true;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean FT() {
        var4_1 = 333789667;
        var1_2 = kR.a & 333789667 ^ 1501982193;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -333334863;
        var3_3 = (var1_2 | var4_1) ^ -1256241496;
        ** GOTO lbl30
        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 1423265313;
            if (true) ** GOTO lbl12
            break;
        }
        block10: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1709729754;
lbl12:
            // 2 sources

            block11: while (true) {
                switch (var3_3) {
                    case -1041177131: {
                        if (((Boolean)this.a.getValue()).booleanValue()) ** continue;
                        var3_3 = (var1_2 | var4_1) ^ 679631289;
                        continue block11;
                    }
                    case 700057506: {
                        v0 = false;
                        ** break;
                    }
                    case -2092415324: {
                        v0 = true;
                        ** break;
                    }
                    case -285721765: {
                        var3_3 = (var1_2 | var4_1) ^ 1150071543;
                        continue block11;
                    }
                    case 1936008266: {
                        var2_4 ^= var3_3 ^ -516750650;
                        var3_3 = (var1_2 | var4_1) ^ -659604649;
                    }
lbl30:
                    // 3 sources

                    default: {
                        continue block11;
                    }
                    case 527159044: {
                        var2_4 ^= var3_3 ^ 250581604;
                        continue block10;
                    }
lbl35:
                    // 2 sources

                    var2_4 ^= -257323359;
                    return v0;
                    case 254948306: 
                }
                var2_4 ^= var3_3 ^ -1654385314;
                var3_3 = (var1_2 | var4_1) ^ 1918728785;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ boolean FU() {
        block27: {
            block26: {
                block23: {
                    block24: {
                        block25: {
                            block29: {
                                block28: {
                                    break block28;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -1001121554;
                                        break block23;
lbl4:
                                        // 1 sources

                                        while (true) {
                                            v0 = false;
                                            ** GOTO lbl24
                                            break;
                                        }
                                        break;
                                    }
                                }
                                var4_1 = -140325753;
                                var1_2 = kR.a & -140325753 ^ 38847468;
                                var3_3 = 0;
                                break block29;
lbl12:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -656796803;
                                    break block23;
                                    break;
                                }
lbl15:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -707167852;
                                    break block24;
                                    break;
                                }
lbl18:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 790598809;
                                    break block23;
lbl21:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 530989133;
                                        break block23;
                                        break;
                                    }
lbl24:
                                    // 2 sources

                                    while (true) {
                                        var2_4 ^= -1503612389;
                                        break block25;
                                        break;
                                    }
lbl27:
                                    // 1 sources

                                    while (true) {
                                        v0 = true;
                                        ** continue;
                                        break;
                                    }
lbl30:
                                    // 1 sources

                                    while (((Boolean)this.f.getValue()).booleanValue()) {
                                        ** continue;
lbl32:
                                        // 1 sources

                                        ** GOTO lbl21
                                    }
                                    break block26;
lbl34:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -882424174;
                                        break block23;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var2_4 = (var1_2 | var4_1) ^ -2051590497;
                            var3_3 = (var1_2 | var4_1) ^ -878728443;
                            break block23;
                        }
                        return v0;
lbl43:
                        // 1 sources

                        while (((Boolean)this.d.getValue()).booleanValue()) {
                            break block27;
                        }
                        break block26;
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1219741394;
                }
lbl49:
                // 3 sources

                block22: while (true) {
                    switch (var3_3) {
                        default: {
                            continue block22;
                        }
                        case 1013802218: {
                            ** continue;
                        }
                        case -397111390: {
                            ** continue;
                        }
                        case 866572033: {
                            ** continue;
                        }
                        case 1016433021: {
                            ** continue;
                        }
                        case -655533194: {
                            ** continue;
                        }
                        case -1086256835: {
                            ** GOTO lbl30
                        }
                        case 791207058: {
                            ** GOTO lbl43
                        }
                        case 1624440534: {
                            var2_4 ^= var3_3 ^ 1080391275;
                            ** continue;
                        }
                        case 1413251514: 
                    }
                    var2_4 ^= var3_3 ^ 1955268871;
                    ** continue;
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -1759497927;
            ** GOTO lbl49
        }
        var3_3 = (var1_2 | var4_1) ^ -1546760619;
        ** while (true)
    }
}

