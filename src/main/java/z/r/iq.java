/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents$ClientStarted
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents$ClientStopping
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$EndTick
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$StartTick
 *  net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
 *  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents
 *  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$ModifyGame
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents$Disconnect
 *  net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.minecraft.class_1041
 *  net.minecraft.class_11908
 *  net.minecraft.class_2561
 *  net.minecraft.class_304
 *  net.minecraft.class_304$class_11900
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_3675
 *  net.minecraft.class_3675$class_307
 *  net.minecraft.class_437
 *  net.minecraft.class_634
 *  net.minecraft.class_9779
 *  org.lwjgl.glfw.GLFW
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.class_1041;
import net.minecraft.class_11908;
import net.minecraft.class_2561;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3675;
import net.minecraft.class_437;
import net.minecraft.class_634;
import net.minecraft.class_9779;
import org.lwjgl.glfw.GLFW;
import z.r.H;
import z.r.a;
import z.r.aR;
import z.r.aW;
import z.r.ac;
import z.r.ak;
import z.r.bd;
import z.r.bw;
import z.r.cV;
import z.r.ca;
import z.r.dm;
import z.r.eN;
import z.r.gF;
import z.r.gO;
import z.r.gU;
import z.r.gj;
import z.r.hJ;
import z.r.ig;
import z.r.jH;
import z.r.jI;
import z.r.k;
import z.r.kM;
import z.r.kb;
import z.r.kl;
import z.r.lR;
import z.r.ll;
import z.r.mn;
import z.r.mw;
import z.r.q;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class iq {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static long a;
    private static final /* synthetic */ String e;
    private static boolean a;
    private static final /* synthetic */ String f;
    private static final Set<Integer> a;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private static final /* synthetic */ String x;
    private static final /* synthetic */ String y;
    private static final /* synthetic */ String z;
    private static final /* synthetic */ String A;
    private static final /* synthetic */ String B;
    private static final /* synthetic */ String C;
    private static final /* synthetic */ String D;
    private static final /* synthetic */ String E;
    private static final /* synthetic */ String F;
    private static final /* synthetic */ String G;
    private static final /* synthetic */ String H;
    private static final /* synthetic */ String I;
    private static final /* synthetic */ String J;
    private static final /* synthetic */ String K;
    private static final /* synthetic */ String L;
    private static final /* synthetic */ String M;
    private static final /* synthetic */ String N;
    private static final /* synthetic */ String O;
    private static final /* synthetic */ String P;
    private static final /* synthetic */ String Q;
    private static final /* synthetic */ String R;
    private static final /* synthetic */ String S;
    public static final int a;
    private static final /* synthetic */ String T;
    private static final /* synthetic */ String U;
    private static final /* synthetic */ String V;
    private static final /* synthetic */ String W;
    private static final /* synthetic */ String X;
    private static final int[] a;
    private static final /* synthetic */ String Y;
    private static final /* synthetic */ String Z;
    private static final /* synthetic */ String aa;
    private static final /* synthetic */ String ab;
    private static final /* synthetic */ String ac;
    private static final /* synthetic */ String ad;
    private static class_304 a;
    private static final /* synthetic */ String ae;
    private static final /* synthetic */ String af;
    private static final /* synthetic */ String ag;
    private static boolean b;

    private iq() {
        int n2 = a & 0xB8FC6660 ^ 0x52E2B1FA;
        int n3 = (n2 | 0xB8FC6660) ^ 0x4365E7F5;
        n3 ^= 0xA3BEBAE4;
    }

    /*
     * Exception decompiling
     */
    public static void onLicenseRevoked(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH], 58[UNCONDITIONALDOLOOP]], but top level block is 5[SWITCH]
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
    public static void bootstrap() {
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
    private static void HR(String var0, Runnable var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [20[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    public static void syncClickGuiKeybinding() {
        block43: {
            block39: {
                block41: {
                    block42: {
                        block40: {
                            block44: {
                                break block44;
lbl1:
                                // 1 sources

                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ -72125004;
                                    break block39;
                                    break;
                                }
lbl4:
                                // 1 sources

                                return;
lbl6:
                                // 2 sources

                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ 1116771635;
                                    break block39;
                                    break;
                                }
lbl9:
                                // 1 sources

                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ -436842014;
                                    ** GOTO lbl53
                                    break;
                                }
lbl12:
                                // 1 sources

                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ 809158403;
                                    ** GOTO lbl53
                                    break;
                                }
                            }
                            var4 = -2033871289;
                            var1_1 = iq.a & -2033871289 ^ -209664085;
                            var3_2 = 0;
                            var2_4 = (var1_1 | var4) ^ -1720777467;
                            ** while (true)
lbl21:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | var4) ^ -1507718018;
                                ** GOTO lbl53
                                break;
                            }
lbl24:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_2 ^ -2048150990;
                                break block40;
                                break;
                            }
lbl27:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_2 ^ -1187008448;
                                break block41;
                                break;
                            }
lbl30:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | var4) ^ -524596931;
                                ** GOTO lbl53
                                break;
                            }
lbl33:
                            // 1 sources

                            while (true) {
                                if (var0_3 >= 0) ** GOTO lbl6
                                if (true) ** GOTO lbl61
                                break;
                            }
lbl36:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | var4) ^ 373228288;
                                break block39;
lbl39:
                                // 1 sources

                                while (true) {
                                    var0_3 = iq.Is((var2_4 | var3_2 ^ -1158730803) ^ (var3_2 ^ -1028461175), (var1_1 | var3_2 ^ -1158730803) ^ ((var2_4 | var3_2 ^ -1158730803) ^ (var3_2 ^ 1608614648)));
                                    ** continue;
                                    break;
                                }
lbl42:
                                // 1 sources

                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ -341066341;
                                    break block39;
                                    break;
                                }
                                break;
                            }
                        }
                        var3_2 = (var1_1 | var4) ^ -899874012;
                        break block39;
lbl48:
                        // 1 sources

                        while (true) {
                            iq.a.method_1422(class_3675.method_15985((class_11908)new class_11908(var0_3, 0, 0)));
                            ** continue;
                            break;
                        }
                        block33: while (true) {
                            var3_2 = (var1_1 | var4) ^ 1792726783;
lbl53:
                            // 7 sources

                            block34: while (true) {
                                switch (var3_2) {
                                    default: {
                                        continue block34;
                                    }
                                    case -939585300: {
                                        ** continue;
                                    }
                                    case -1658912496: {
                                        ** continue;
                                    }
lbl61:
                                    // 1 sources

                                    var3_2 = (var1_1 | var4) ^ -1058150490;
                                    break block39;
lbl63:
                                    // 1 sources

                                    return;
                                    case 305366541: {
                                        break block33;
                                    }
lbl67:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_2 ^ -1703443011;
                                        ** continue;
                                        break;
                                    }
                                    case 1374149521: {
                                        if (iq.a != null) continue block33;
                                        ** continue;
                                    }
lbl73:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_2 ^ 1030854071;
                                        break block42;
                                        break;
                                    }
                                    case 153757103: {
                                        var2_4 ^= var3_2 ^ 2094643671;
                                        ** continue;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        var3_2 = (var1_1 | var4) ^ -17829312;
                        ** GOTO lbl53
                    }
                    var3_2 = (var1_1 | var4) ^ 1531751141;
                    break block39;
                    {
                        case 394174162: {
                            var2_4 ^= var3_2 ^ 666120463;
                            ** continue;
                        }
                    }
                }
                var3_2 = (var1_1 | var4) ^ 1766831390;
                ** while (true)
            }
lbl91:
            // 2 sources

            block38: while (true) {
                switch (var3_2) {
                    default: {
                        continue block38;
                    }
                    case -503655185: {
                        ** continue;
                    }
                    case 1033426123: {
                        ** continue;
                    }
                    case 1009433994: {
                        ** continue;
                    }
                    case -1400275702: {
                        ** continue;
                    }
                    case 476998260: {
                        ** continue;
                    }
                    case 209101403: {
                        ** continue;
                    }
                    case -1252703524: {
                        ** continue;
                    }
                    ** case 925380681:
lbl110:
                    // 1 sources

                    break block43;
                }
                break;
            }
            {
                ** case -1635097871:
            }
lbl112:
            // 1 sources

            var0_3 = z.r.H.get().getClickGuiKey();
            ** while (true)
        }
        var3_2 = (var1_1 | var4) ^ -873502107;
        ** while (true)
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    private static void HS(class_310 var0) {
        block409: {
            block407: {
                block404: {
                    block431: {
                        block421: {
                            block426: {
                                block430: {
                                    block429: {
                                        block415: {
                                            block428: {
                                                block406: {
                                                    block410: {
                                                        block408: {
                                                            block405: {
                                                                var15_1 = -1908258884;
                                                                var12_2 = iq.a & -1908258884 ^ 1846994728;
                                                                var14_3 = 0;
                                                                var13_4 = (var12_2 | var15_1) ^ -1558608612;
                                                                var14_3 = (var12_2 | var15_1) ^ 1695847674;
                                                                break block404;
lbl7:
                                                                // 1 sources

                                                                while (true) {
                                                                    var14_3 = (var12_2 | var15_1) ^ 500627116;
                                                                    break block404;
                                                                    break;
                                                                }
lbl10:
                                                                // 1 sources

                                                                while (true) {
                                                                    var13_4 ^= var14_3 ^ 1221632021;
                                                                    var14_3 = (var12_2 | var15_1) ^ -206560771;
                                                                    break block404;
                                                                    break;
                                                                }
lbl14:
                                                                // 1 sources

                                                                while (true) {
                                                                    hJ.tick(hJ.b);
                                                                    var14_3 = (var12_2 | var15_1) ^ 1261443821;
                                                                    break block404;
                                                                    break;
                                                                }
lbl18:
                                                                // 2 sources

                                                                while (true) {
                                                                    var14_3 = (var12_2 | var15_1) ^ -583572568;
                                                                    break block404;
                                                                    break;
                                                                }
lbl21:
                                                                // 1 sources

                                                                block225: while (true) {
                                                                    switch (var13_4) {
                                                                        default: {
                                                                            var14_3 = (var12_2 | var15_1) ^ 747710369;
                                                                            break block225;
                                                                        }
lbl26:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var13_4 ^= var14_3 ^ -338015100;
                                                                            break block405;
                                                                            break;
                                                                        }
                                                                        case -161724379: {
                                                                            var14_3 = (var12_2 | var15_1) ^ -559171495;
                                                                            break block225;
                                                                        }
lbl32:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var13_4 ^= var14_3 ^ -1683767777;
                                                                            break block405;
                                                                            break;
                                                                        }
                                                                        case 501698768: {
                                                                            var14_3 = (var12_2 | var15_1) ^ -1736248753;
                                                                            break block225;
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                break block404;
lbl39:
                                                                // 1 sources

                                                                while (true) {
                                                                    var13_4 ^= var14_3 ^ 756522212;
                                                                    ** GOTO lbl18
                                                                    break;
                                                                }
                                                            }
                                                            var14_3 = (var12_2 | var15_1) ^ 467265591;
                                                            break block404;
lbl45:
                                                            // 1 sources

                                                            while (true) {
                                                                var14_3 = (var12_2 | var15_1) ^ 1054100124;
                                                                break block404;
                                                                break;
                                                            }
lbl48:
                                                            // 1 sources

                                                            while (true) {
                                                                ca.get().tick();
                                                                var14_3 = (var12_2 | var15_1) ^ -1987852399;
                                                                break block404;
                                                                break;
                                                            }
lbl52:
                                                            // 1 sources

                                                            while (true) {
                                                                var13_4 ^= var14_3 ^ 1755138171;
                                                                var14_3 = (var12_2 | var15_1) ^ 1565123596;
                                                                break block404;
                                                                break;
                                                            }
lbl56:
                                                            // 1 sources

                                                            while (true) {
                                                                var1_5 = var0.method_22683().method_4490();
                                                                var14_3 = (var12_2 | var15_1) ^ 196175304;
                                                                break block406;
lbl60:
                                                                // 2 sources

                                                                while (true) {
                                                                    var14_3 = (var12_2 | var15_1) ^ -1275363175;
                                                                    break block406;
                                                                    break;
                                                                }
lbl63:
                                                                // 1 sources

                                                                block234: while (true) {
                                                                    switch (var13_4) {
                                                                        default: {
                                                                            var14_3 = (var12_2 | var15_1) ^ 1120563510;
                                                                            break block234;
                                                                        }
lbl68:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var13_4 ^= var14_3 ^ -1712398886;
                                                                            ** GOTO lbl60
                                                                            break;
                                                                        }
                                                                        case -800442518: {
                                                                            var14_3 = (var12_2 | var15_1) ^ -1419734760;
                                                                            break block234;
                                                                        }
lbl74:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var13_4 ^= var14_3 ^ 1613563591;
                                                                            ** GOTO lbl83
                                                                            break;
                                                                        }
                                                                        case 1880406975: {
                                                                            var14_3 = (var12_2 | var15_1) ^ 1491058394;
                                                                            break block234;
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                break block406;
lbl81:
                                                                // 1 sources

                                                                while (true) {
                                                                    var13_4 ^= var14_3 ^ 1261496273;
lbl83:
                                                                    // 2 sources

                                                                    var14_3 = (var12_2 | var15_1) ^ -1171925654;
                                                                    break block406;
                                                                    break;
                                                                }
lbl85:
                                                                // 1 sources

                                                                while (true) {
                                                                    var14_3 = (var12_2 | var15_1) ^ -305544640;
                                                                    break block406;
                                                                    break;
                                                                }
lbl88:
                                                                // 1 sources

                                                                while (true) {
                                                                    var3_6 = z.r.H.get().getClickGuiKey();
                                                                    var14_3 = (var12_2 | var15_1) ^ -1410286041;
                                                                    break block407;
                                                                    break;
                                                                }
                                                                break;
                                                            }
lbl92:
                                                            // 1 sources

                                                            while (true) {
                                                                var13_4 ^= var14_3 ^ 1287675974;
                                                                var14_3 = (var12_2 | var15_1) ^ 928460133;
                                                                break block407;
                                                                break;
                                                            }
lbl96:
                                                            // 1 sources

                                                            while (true) {
                                                                if (var3_6 >= 0) ** GOTO lbl105
                                                                var14_3 = (var12_2 | var15_1) ^ -940358479;
                                                                break block407;
                                                                break;
                                                            }
lbl100:
                                                            // 1 sources

                                                            while (true) {
                                                                var14_3 = (var12_2 | var15_1) ^ 1907996542;
                                                                break block407;
                                                                break;
                                                            }
lbl103:
                                                            // 1 sources

                                                            while (true) {
                                                                var3_6 = iq.Is((var13_4 | var14_3 ^ 296556414) ^ (var14_3 ^ 1089331299), (var12_2 | var14_3 ^ 296556414) ^ ((var13_4 | var14_3 ^ 296556414) ^ (var14_3 ^ -2006353266)));
lbl105:
                                                                // 2 sources

                                                                var14_3 = (var12_2 | var15_1) ^ 1200614650;
                                                                break block407;
                                                                break;
                                                            }
lbl107:
                                                            // 1 sources

                                                            while (true) {
                                                                var13_4 ^= var14_3 ^ -868555199;
                                                                var14_3 = (var12_2 | var15_1) ^ 352253052;
                                                                break block407;
                                                                break;
                                                            }
lbl111:
                                                            // 1 sources

                                                            while (true) {
                                                                if (GLFW.glfwGetKey((long)var1_5, (int)var3_6) != 1) break block408;
                                                                var14_3 = (var12_2 | var15_1) ^ 1431864095;
                                                                break block407;
                                                                break;
                                                            }
lbl115:
                                                            // 1 sources

                                                            while (true) {
                                                                var13_4 ^= var14_3 ^ -1791998023;
                                                                var14_3 = (var12_2 | var15_1) ^ 1623746298;
                                                                break block407;
                                                                break;
                                                            }
lbl119:
                                                            // 1 sources

                                                            while (true) {
                                                                v0 = true;
                                                                ** GOTO lbl131
                                                                break;
                                                            }
                                                        }
                                                        var14_3 = (var12_2 | var15_1) ^ 2061068798;
                                                        break block407;
lbl125:
                                                        // 1 sources

                                                        while (true) {
                                                            var13_4 ^= var14_3 ^ -1162760872;
                                                            var14_3 = (var12_2 | var15_1) ^ 1177076790;
                                                            break block407;
                                                            break;
                                                        }
lbl129:
                                                        // 1 sources

                                                        while (true) {
                                                            v0 = false;
lbl131:
                                                            // 2 sources

                                                            var13_4 ^= -253461556;
                                                            var4_7 = v0;
                                                            var14_3 = (var12_2 | var15_1) ^ 1959523919;
                                                            break block409;
                                                            break;
                                                        }
lbl135:
                                                        // 1 sources

                                                        while (true) {
                                                            var13_4 ^= var14_3 ^ 1353848780;
                                                            var14_3 = (var12_2 | var15_1) ^ 22672374;
                                                            break block409;
                                                            break;
                                                        }
lbl139:
                                                        // 1 sources

                                                        while (true) {
                                                            if (!var4_7) break block410;
                                                            var14_3 = (var12_2 | var15_1) ^ 2003667023;
                                                            break block409;
                                                            break;
                                                        }
lbl143:
                                                        // 1 sources

                                                        while (true) {
                                                            var14_3 = (var12_2 | var15_1) ^ 1618318296;
                                                            break block409;
                                                            break;
                                                        }
lbl146:
                                                        // 1 sources

                                                        while (true) {
                                                            if (iq.a) break block410;
                                                            var14_3 = (var12_2 | var15_1) ^ 1639401728;
                                                            break block409;
                                                            break;
                                                        }
lbl150:
                                                        // 1 sources

                                                        while (true) {
                                                            var13_4 ^= var14_3 ^ -131820418;
                                                            var14_3 = (var12_2 | var15_1) ^ -1614223724;
                                                            break block409;
                                                            break;
                                                        }
lbl154:
                                                        // 1 sources

                                                        while (true) {
                                                            v1 = true;
                                                            ** GOTO lbl166
                                                            break;
                                                        }
                                                    }
                                                    var14_3 = (var12_2 | var15_1) ^ 57257325;
                                                    break block409;
lbl160:
                                                    // 1 sources

                                                    while (true) {
                                                        var13_4 ^= var14_3 ^ -1694863341;
                                                        var14_3 = (var12_2 | var15_1) ^ -1837341196;
                                                        break block409;
                                                        break;
                                                    }
lbl164:
                                                    // 1 sources

                                                    while (true) {
                                                        block424: {
                                                            block411: {
                                                                block418: {
                                                                    block425: {
                                                                        block422: {
                                                                            block423: {
                                                                                block417: {
                                                                                    block416: {
                                                                                        block414: {
                                                                                            block413: {
                                                                                                block412: {
                                                                                                    v1 = false;
lbl166:
                                                                                                    // 2 sources

                                                                                                    var13_4 ^= -1515996941;
                                                                                                    var5_8 = v1;
lbl168:
                                                                                                    // 2 sources

                                                                                                    while (true) {
                                                                                                        var14_3 = (var12_2 | var15_1) ^ 1033256240;
                                                                                                        break block411;
                                                                                                        break;
                                                                                                    }
lbl171:
                                                                                                    // 2 sources

                                                                                                    while (true) {
                                                                                                        var14_3 = (var12_2 | var15_1) ^ -577025876;
                                                                                                        break block411;
                                                                                                        break;
                                                                                                    }
lbl174:
                                                                                                    // 1 sources

                                                                                                    block260: while (true) {
                                                                                                        switch (var13_4) {
                                                                                                            default: {
                                                                                                                var14_3 = (var12_2 | var15_1) ^ -1304285466;
                                                                                                                break block260;
                                                                                                            }
lbl179:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                var13_4 ^= var14_3 ^ -1927744246;
                                                                                                                break block412;
                                                                                                                break;
                                                                                                            }
                                                                                                            case 1598508811: {
                                                                                                                var14_3 = (var12_2 | var15_1) ^ 1634018626;
                                                                                                                break block260;
                                                                                                            }
lbl185:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                var13_4 ^= var14_3 ^ -628352330;
                                                                                                                break block412;
                                                                                                                break;
                                                                                                            }
                                                                                                            case -1872486256: {
                                                                                                                var14_3 = (var12_2 | var15_1) ^ -1424306848;
                                                                                                                break block260;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                    break block411;
lbl192:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        var13_4 ^= var14_3 ^ -1351446757;
                                                                                                        ** GOTO lbl171
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                var14_3 = (var12_2 | var15_1) ^ -1523401943;
                                                                                                break block411;
lbl198:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    var14_3 = (var12_2 | var15_1) ^ 1558702809;
                                                                                                    break block411;
                                                                                                    break;
                                                                                                }
lbl201:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    if (!iq.a.method_1436()) break block413;
                                                                                                    var14_3 = (var12_2 | var15_1) ^ 1951616636;
                                                                                                    break block411;
                                                                                                    break;
                                                                                                }
lbl205:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    var13_4 ^= var14_3 ^ -809864824;
                                                                                                    var14_3 = (var12_2 | var15_1) ^ 217161888;
                                                                                                    break block411;
                                                                                                    break;
                                                                                                }
lbl209:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    var5_8 = true;
                                                                                                    ** continue;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            var14_3 = (var12_2 | var15_1) ^ 1938852209;
                                                                                            break block411;
lbl215:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var13_4 ^= var14_3 ^ 672115001;
                                                                                                var14_3 = (var12_2 | var15_1) ^ 1911867448;
                                                                                                break block411;
                                                                                                break;
                                                                                            }
lbl219:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                if (!gO.consumeSuppressNextEndClientTick()) ** GOTO lbl228
                                                                                                var14_3 = (var12_2 | var15_1) ^ -1188503709;
                                                                                                break block411;
                                                                                                break;
                                                                                            }
lbl223:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var14_3 = (var12_2 | var15_1) ^ 1376435912;
                                                                                                break block411;
                                                                                                break;
                                                                                            }
lbl226:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var5_8 = false;
lbl228:
                                                                                                // 2 sources

                                                                                                var14_3 = (var12_2 | var15_1) ^ -11044258;
                                                                                                break block411;
                                                                                                break;
                                                                                            }
lbl230:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var13_4 ^= var14_3 ^ -323805444;
                                                                                                var14_3 = (var12_2 | var15_1) ^ -1778663954;
                                                                                                break block411;
                                                                                                break;
                                                                                            }
lbl234:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                if (!var5_8) ** GOTO lbl336
                                                                                                var14_3 = (var12_2 | var15_1) ^ -1622580283;
                                                                                                break block411;
                                                                                                break;
                                                                                            }
lbl238:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var13_4 ^= var14_3 ^ 1213315500;
                                                                                                var14_3 = (var12_2 | var15_1) ^ -284759695;
                                                                                                break block411;
                                                                                                break;
                                                                                            }
lbl242:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var7_11 = var0.field_1755;
                                                                                                if (!(var7_11 instanceof bw)) break block414;
                                                                                                var14_3 = (var12_2 | var15_1) ^ 1674350911;
                                                                                                break block415;
                                                                                                break;
                                                                                            }
lbl247:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var13_4 ^= var14_3 ^ -1252169859;
                                                                                                var14_3 = (var12_2 | var15_1) ^ 1868878610;
                                                                                                break block415;
                                                                                                break;
                                                                                            }
lbl251:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var6_9 = (bw)var7_11;
                                                                                                var13_4 ^= 25766955;
                                                                                                var6_9.beginClose();
                                                                                                ** GOTO lbl336
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var14_3 = (var12_2 | var15_1) ^ -1605821956;
                                                                                        break block415;
lbl259:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var13_4 ^= var14_3 ^ 2046762918;
                                                                                            var14_3 = (var12_2 | var15_1) ^ -1992846719;
                                                                                            break block415;
                                                                                            break;
                                                                                        }
lbl263:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            if (!hJ.ok()) break block416;
                                                                                            var14_3 = (var12_2 | var15_1) ^ -424112020;
                                                                                            break block415;
                                                                                            break;
                                                                                        }
lbl267:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var13_4 ^= var14_3 ^ 104901603;
                                                                                            var14_3 = (var12_2 | var15_1) ^ 1192177066;
                                                                                            break block415;
                                                                                            break;
                                                                                        }
lbl271:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var0.method_1507((class_437)new bw());
                                                                                            ** GOTO lbl336
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    var14_3 = (var12_2 | var15_1) ^ 885276093;
                                                                                    break block415;
lbl277:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var13_4 ^= var14_3 ^ 906424040;
                                                                                        var14_3 = (var12_2 | var15_1) ^ 1808872576;
                                                                                        break block415;
                                                                                        break;
                                                                                    }
lbl281:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (!hJ.hasProtectedModules()) break block417;
                                                                                        var14_3 = (var12_2 | var15_1) ^ 663301747;
                                                                                        break block415;
                                                                                        break;
                                                                                    }
lbl285:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var13_4 ^= var14_3 ^ -1791552890;
                                                                                        var14_3 = (var12_2 | var15_1) ^ -84608855;
                                                                                        break block415;
                                                                                        break;
                                                                                    }
lbl289:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var7_11 = hJ.errMsg();
                                                                                        var14_3 = (var12_2 | var15_1) ^ 1694977013;
                                                                                        break block418;
lbl293:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var13_4 ^= var14_3 ^ -373444569;
                                                                                            var14_3 = (var12_2 | var15_1) ^ 718607975;
                                                                                            break block418;
                                                                                            break;
                                                                                        }
lbl297:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            if (var7_11 == null) ** GOTO lbl306
                                                                                            var14_3 = (var12_2 | var15_1) ^ -1841201995;
                                                                                            break block418;
                                                                                            break;
                                                                                        }
lbl301:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var14_3 = (var12_2 | var15_1) ^ 2060413806;
                                                                                            break block418;
                                                                                            break;
                                                                                        }
lbl304:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            if (!var7_11.isBlank()) ** GOTO lbl313
lbl306:
                                                                                            // 2 sources

                                                                                            var14_3 = (var12_2 | var15_1) ^ -1772892001;
                                                                                            break block418;
                                                                                            break;
                                                                                        }
lbl308:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var14_3 = (var12_2 | var15_1) ^ -1529257108;
                                                                                            break block418;
                                                                                            break;
                                                                                        }
lbl311:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var7_11 = iq.z;
lbl313:
                                                                                            // 2 sources

                                                                                            var14_3 = (var12_2 | var15_1) ^ 1139582601;
                                                                                            break block418;
                                                                                            break;
                                                                                        }
lbl315:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var13_4 ^= var14_3 ^ 674467652;
                                                                                            var14_3 = (var12_2 | var15_1) ^ -2146434748;
                                                                                            break block418;
                                                                                            break;
                                                                                        }
lbl319:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            hJ.fatal((String)var7_11);
                                                                                            var14_3 = (var12_2 | var15_1) ^ -1526807244;
                                                                                            break block418;
                                                                                            break;
                                                                                        }
lbl323:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var13_4 ^= var14_3 ^ 320848644;
                                                                                            var14_3 = (var12_2 | var15_1) ^ -632457292;
                                                                                            break block418;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var14_3 = (var12_2 | var15_1) ^ 589828511;
                                                                                break block415;
lbl330:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var13_4 ^= var14_3 ^ 792993529;
                                                                                    var14_3 = (var12_2 | var15_1) ^ -376591983;
                                                                                    break block415;
                                                                                    break;
                                                                                }
lbl334:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    block419: {
                                                                                        block420: {
                                                                                            iq.HV(var0);
lbl336:
                                                                                            // 5 sources

                                                                                            while (true) {
                                                                                                var14_3 = (var12_2 | var15_1) ^ 1556319841;
                                                                                                break block411;
                                                                                                break;
                                                                                            }
lbl339:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var13_4 ^= var14_3 ^ 373914462;
                                                                                                var14_3 = (var12_2 | var15_1) ^ -1888930243;
                                                                                                break block411;
                                                                                                break;
                                                                                            }
lbl343:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                iq.a = var4_7;
                                                                                                var14_3 = (var12_2 | var15_1) ^ 1291319381;
                                                                                                break block411;
                                                                                                break;
                                                                                            }
lbl347:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var13_4 ^= var14_3 ^ -635428182;
                                                                                                var14_3 = (var12_2 | var15_1) ^ 2133217038;
                                                                                                break block411;
                                                                                                break;
                                                                                            }
lbl351:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                if (hJ.ok()) break block419;
                                                                                                var14_3 = (var12_2 | var15_1) ^ -750484413;
                                                                                                break block411;
                                                                                                break;
                                                                                            }
lbl355:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                var14_3 = (var12_2 | var15_1) ^ 796356507;
                                                                                                break block411;
                                                                                                break;
                                                                                            }
lbl358:
                                                                                            // 1 sources

                                                                                            block303: while (true) {
                                                                                                switch (var13_4) {
                                                                                                    case 1123285750: {
                                                                                                        var14_3 = (var12_2 | var15_1) ^ 415159102;
                                                                                                        break block303;
                                                                                                    }
lbl363:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        var13_4 ^= var14_3 ^ -935145628;
                                                                                                        break block420;
                                                                                                        break;
                                                                                                    }
                                                                                                    default: {
                                                                                                        var14_3 = (var12_2 | var15_1) ^ 1520050591;
                                                                                                        break block303;
                                                                                                    }
lbl369:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        var13_4 ^= var14_3 ^ 142370206;
                                                                                                        break block420;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 248814709: {
                                                                                                        var14_3 = (var12_2 | var15_1) ^ 1594621434;
                                                                                                        break block303;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            break block411;
lbl376:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var13_4 ^= var14_3 ^ 741740528;
                                                                                                ** GOTO lbl355
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var14_3 = (var12_2 | var15_1) ^ 261933959;
                                                                                        break block411;
lbl382:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var14_3 = (var12_2 | var15_1) ^ -677526154;
                                                                                            break block411;
                                                                                            break;
                                                                                        }
lbl385:
                                                                                        // 1 sources

                                                                                        return;
                                                                                    }
                                                                                    var14_3 = (var12_2 | var15_1) ^ -97013417;
                                                                                    break block411;
lbl390:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var13_4 ^= var14_3 ^ -2083829688;
                                                                                        var14_3 = (var12_2 | var15_1) ^ 542952246;
                                                                                        break block411;
                                                                                        break;
                                                                                    }
lbl394:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        ig.onTick(var0);
                                                                                        var14_3 = (var12_2 | var15_1) ^ -1110384290;
                                                                                        break block411;
                                                                                        break;
                                                                                    }
lbl398:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var13_4 ^= var14_3 ^ -1327554513;
                                                                                        var14_3 = (var12_2 | var15_1) ^ -1017832316;
                                                                                        break block411;
                                                                                        break;
                                                                                    }
lbl402:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        jH.tick();
                                                                                        var14_3 = (var12_2 | var15_1) ^ -853407724;
                                                                                        break block411;
                                                                                        break;
                                                                                    }
lbl406:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var13_4 ^= var14_3 ^ 1095800381;
                                                                                        var14_3 = (var12_2 | var15_1) ^ 1068615170;
                                                                                        break block411;
                                                                                        break;
                                                                                    }
lbl410:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var6_10 = z.r.H.get().getMenuKey();
                                                                                        var14_3 = (var12_2 | var15_1) ^ -1746618025;
                                                                                        break block421;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
lbl414:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var13_4 ^= var14_3 ^ 226761053;
                                                                                    var14_3 = (var12_2 | var15_1) ^ 827568320;
                                                                                    break block421;
                                                                                    break;
                                                                                }
lbl418:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (var6_10 == -1) break block422;
                                                                                    var14_3 = (var12_2 | var15_1) ^ 888034532;
                                                                                    break block421;
                                                                                    break;
                                                                                }
lbl422:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var14_3 = (var12_2 | var15_1) ^ -377943607;
                                                                                    break block421;
                                                                                    break;
                                                                                }
lbl425:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (var0.field_1755 != null) break block422;
                                                                                    var14_3 = (var12_2 | var15_1) ^ -1040129561;
                                                                                    break block421;
                                                                                    break;
                                                                                }
lbl429:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var14_3 = (var12_2 | var15_1) ^ -606238389;
                                                                                    break block421;
                                                                                    break;
                                                                                }
lbl432:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (var0.method_22683() == null) break block422;
                                                                                    var14_3 = (var12_2 | var15_1) ^ 771543064;
                                                                                    break block421;
                                                                                    break;
                                                                                }
lbl436:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var13_4 ^= var14_3 ^ -1582334620;
                                                                                    var14_3 = (var12_2 | var15_1) ^ -1151540707;
                                                                                    break block421;
                                                                                    break;
                                                                                }
lbl440:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (GLFW.glfwGetKey((long)var0.method_22683().method_4490(), (int)var6_10) != 1) break block423;
                                                                                    var14_3 = (var12_2 | var15_1) ^ 42769259;
                                                                                    break block421;
                                                                                    break;
                                                                                }
lbl444:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var13_4 ^= var14_3 ^ 874166738;
                                                                                    var14_3 = (var12_2 | var15_1) ^ 1891306002;
                                                                                    break block421;
                                                                                    break;
                                                                                }
lbl448:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    v2 = true;
                                                                                    ** GOTO lbl460
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var14_3 = (var12_2 | var15_1) ^ 314815051;
                                                                            break block421;
lbl454:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var13_4 ^= var14_3 ^ 609587442;
                                                                                var14_3 = (var12_2 | var15_1) ^ 1373687935;
                                                                                break block421;
                                                                                break;
                                                                            }
lbl458:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                v2 = false;
lbl460:
                                                                                // 2 sources

                                                                                var13_4 ^= -770525422;
                                                                                var7_13 = v2;
                                                                                var14_3 = (var12_2 | var15_1) ^ 914523612;
                                                                                break block424;
lbl464:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var13_4 ^= var14_3 ^ 430327224;
                                                                                    var14_3 = (var12_2 | var15_1) ^ -2021384867;
                                                                                    break block424;
                                                                                    break;
                                                                                }
lbl468:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (!var7_13) ** GOTO lbl484
                                                                                    var14_3 = (var12_2 | var15_1) ^ -1713062542;
                                                                                    break block424;
                                                                                    break;
                                                                                }
lbl472:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var14_3 = (var12_2 | var15_1) ^ 903564293;
                                                                                    break block424;
                                                                                    break;
                                                                                }
lbl475:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (iq.b) ** GOTO lbl484
                                                                                    var14_3 = (var12_2 | var15_1) ^ -1905000107;
                                                                                    break block424;
                                                                                    break;
                                                                                }
lbl479:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var14_3 = (var12_2 | var15_1) ^ -1139108614;
                                                                                    break block424;
                                                                                    break;
                                                                                }
lbl482:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var0.method_1507((class_437)new k());
lbl484:
                                                                                    // 3 sources

                                                                                    var14_3 = (var12_2 | var15_1) ^ -1923347106;
                                                                                    break block424;
                                                                                    break;
                                                                                }
lbl486:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var13_4 ^= var14_3 ^ 778739674;
                                                                                    var14_3 = (var12_2 | var15_1) ^ -832211195;
                                                                                    break block424;
                                                                                    break;
                                                                                }
lbl490:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    iq.b = var7_13;
                                                                                    var14_3 = (var12_2 | var15_1) ^ 2059871012;
                                                                                    break block424;
                                                                                    break;
                                                                                }
lbl494:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var13_4 ^= var14_3 ^ 567082321;
                                                                                    var14_3 = (var12_2 | var15_1) ^ -1303776597;
                                                                                    break block424;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                        var14_3 = (var12_2 | var15_1) ^ 792770640;
                                                                        break block421;
lbl501:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var13_4 ^= var14_3 ^ -1869738990;
                                                                            var14_3 = (var12_2 | var15_1) ^ -1039086391;
                                                                            break block421;
                                                                            break;
                                                                        }
lbl505:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            iq.b = false;
lbl507:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var14_3 = (var12_2 | var15_1) ^ 1837981069;
                                                                                break block421;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
lbl510:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var14_3 = (var12_2 | var15_1) ^ -466667203;
                                                                            break block421;
                                                                            break;
                                                                        }
lbl513:
                                                                        // 1 sources

                                                                        block340: while (true) {
                                                                            switch (var13_4) {
                                                                                case 1124607213: {
                                                                                    var14_3 = (var12_2 | var15_1) ^ 1870404763;
                                                                                    break block340;
                                                                                }
lbl518:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var13_4 ^= var14_3 ^ 1968185834;
                                                                                    break block425;
                                                                                    break;
                                                                                }
                                                                                default: {
                                                                                    var14_3 = (var12_2 | var15_1) ^ -1496439751;
                                                                                    break block340;
                                                                                }
lbl524:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var13_4 ^= var14_3 ^ 1010367134;
                                                                                    break block425;
                                                                                    break;
                                                                                }
                                                                                case 1472466335: {
                                                                                    var14_3 = (var12_2 | var15_1) ^ -1818578036;
                                                                                    break block340;
                                                                                }
                                                                            }
                                                                            break;
                                                                        }
                                                                        break block421;
lbl531:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var13_4 ^= var14_3 ^ 584936917;
                                                                            ** GOTO lbl510
                                                                            break;
                                                                        }
                                                                    }
                                                                    var14_3 = (var12_2 | var15_1) ^ -1723890101;
                                                                    break block421;
lbl537:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var14_3 = (var12_2 | var15_1) ^ 1659994692;
                                                                        break block421;
                                                                        break;
                                                                    }
lbl540:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (var0.field_1755 != null) ** GOTO lbl556
                                                                        var14_3 = (var12_2 | var15_1) ^ 1568492824;
                                                                        break block421;
                                                                        break;
                                                                    }
lbl544:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var14_3 = (var12_2 | var15_1) ^ 1683620881;
                                                                        break block421;
                                                                        break;
                                                                    }
lbl547:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (var0.field_1724 == null) ** GOTO lbl556
                                                                        var14_3 = (var12_2 | var15_1) ^ -2045885757;
                                                                        break block421;
                                                                        break;
                                                                    }
lbl551:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var14_3 = (var12_2 | var15_1) ^ -1656877161;
                                                                        break block421;
                                                                        break;
                                                                    }
lbl554:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        iq.HW(var0);
lbl556:
                                                                        // 3 sources

                                                                        var14_3 = (var12_2 | var15_1) ^ -1073323042;
                                                                        break block421;
                                                                        break;
                                                                    }
lbl558:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var13_4 ^= var14_3 ^ 87993878;
                                                                        var14_3 = (var12_2 | var15_1) ^ 1089672650;
                                                                        break block421;
                                                                        break;
                                                                    }
lbl562:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        block427: {
                                                                            var7_14 = mw.getInstance().getModules().iterator();
lbl564:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var14_3 = (var12_2 | var15_1) ^ -2115376410;
                                                                                break block426;
                                                                                break;
                                                                            }
lbl567:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var13_4 ^= var14_3 ^ 615438064;
                                                                                var14_3 = (var12_2 | var15_1) ^ 563144291;
                                                                                break block426;
                                                                                break;
                                                                            }
lbl571:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                if (!var7_14.hasNext()) break block427;
                                                                                var14_3 = (var12_2 | var15_1) ^ -1391192417;
                                                                                break block426;
                                                                                break;
                                                                            }
lbl575:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var13_4 ^= var14_3 ^ -1894559891;
                                                                                var14_3 = (var12_2 | var15_1) ^ -2054755893;
                                                                                break block426;
                                                                                break;
                                                                            }
lbl579:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var8_15 = var7_14.next();
                                                                                var14_3 = (var12_2 | var15_1) ^ -1020333872;
                                                                                break block428;
lbl583:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    var14_3 = (var12_2 | var15_1) ^ -959338870;
                                                                                    break block428;
                                                                                    break;
                                                                                }
lbl586:
                                                                                // 1 sources

                                                                                block358: while (true) {
                                                                                    switch (var13_4) {
                                                                                        case 957937700: {
                                                                                            var14_3 = (var12_2 | var15_1) ^ 239440054;
                                                                                            break block358;
                                                                                        }
lbl591:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var13_4 ^= var14_3 ^ -1303279910;
                                                                                            ** GOTO lbl583
                                                                                            break;
                                                                                        }
                                                                                        case -1031140721: {
                                                                                            var14_3 = (var12_2 | var15_1) ^ 333788537;
                                                                                            break block358;
                                                                                        }
lbl597:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var13_4 ^= var14_3 ^ 1272614161;
                                                                                            ** GOTO lbl606
                                                                                            break;
                                                                                        }
                                                                                        default: {
                                                                                            var14_3 = (var12_2 | var15_1) ^ -1153884482;
                                                                                            break block358;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break block428;
lbl604:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var13_4 ^= var14_3 ^ 1725566566;
lbl606:
                                                                                    // 2 sources

                                                                                    var14_3 = (var12_2 | var15_1) ^ -675550080;
                                                                                    break block428;
                                                                                    break;
                                                                                }
lbl608:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var14_3 = (var12_2 | var15_1) ^ 373798846;
                                                                                    break block428;
                                                                                    break;
                                                                                }
lbl611:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (!var8_15.isEnabled()) ** GOTO lbl642
                                                                                    var14_3 = (var12_2 | var15_1) ^ 1530732162;
                                                                                    break block428;
                                                                                    break;
                                                                                }
lbl615:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var14_3 = (var12_2 | var15_1) ^ 1661482973;
                                                                                    break block428;
                                                                                    break;
                                                                                }
lbl618:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (var8_15 instanceof kM) ** GOTO lbl642
                                                                                    var14_3 = (var12_2 | var15_1) ^ -426300940;
                                                                                    break block428;
                                                                                    break;
                                                                                }
lbl622:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var13_4 ^= var14_3 ^ 728269476;
                                                                                    var14_3 = (var12_2 | var15_1) ^ -1325043722;
                                                                                    break block428;
                                                                                    break;
                                                                                }
lbl626:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var9_16 = eN.begin();
                                                                                    try {
                                                                                        var13_4 ^= 1883125726;
                                                                                        var8_15.onTick(var0);
                                                                                        var13_4 ^= -274007051;
                                                                                    }
                                                                                    catch (Throwable v3) {
                                                                                        var13_4 = (var12_2 | var15_1) ^ -428609492;
                                                                                        var11_18 = v3;
                                                                                        var13_4 ^= -1623469584;
                                                                                        eN.end(var8_15, cV.g, var9_16);
                                                                                        var13_4 ^= -1032564959;
                                                                                        throw var11_18;
                                                                                    }
                                                                                    eN.end(var8_15, cV.g, var9_16);
                                                                                    var13_4 ^= -1136820025;
lbl642:
                                                                                    // 3 sources

                                                                                    var14_3 = (var12_2 | var15_1) ^ -836447553;
                                                                                    break block428;
                                                                                    break;
                                                                                }
lbl644:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var13_4 ^= var14_3 ^ -1803049085;
                                                                                    var14_3 = (var12_2 | var15_1) ^ 1674142136;
                                                                                    break block428;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                        var14_3 = (var12_2 | var15_1) ^ -1143302262;
                                                                        break block426;
lbl651:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var13_4 ^= var14_3 ^ -533811698;
                                                                            var14_3 = (var12_2 | var15_1) ^ 1214852336;
                                                                            break block426;
                                                                            break;
                                                                        }
lbl655:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var7_14 = mw.getInstance().getModuleByName(iq.V);
                                                                            var14_3 = (var12_2 | var15_1) ^ 626911542;
                                                                            break block429;
lbl659:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var13_4 ^= var14_3 ^ 1794984389;
                                                                                var14_3 = (var12_2 | var15_1) ^ 1575928698;
                                                                                break block429;
                                                                                break;
                                                                            }
lbl663:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                if (!(var7_14 instanceof kM)) ** GOTO lbl689
                                                                                var14_3 = (var12_2 | var15_1) ^ -1865200519;
                                                                                break block429;
                                                                                break;
                                                                            }
lbl667:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var14_3 = (var12_2 | var15_1) ^ -1220106396;
                                                                                break block429;
                                                                                break;
                                                                            }
lbl670:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var8_15 = (kM)var7_14;
                                                                                if (!var8_15.isEnabled()) ** GOTO lbl689
                                                                                var14_3 = (var12_2 | var15_1) ^ 894269620;
                                                                                break block430;
                                                                                break;
                                                                            }
lbl675:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var13_4 ^= var14_3 ^ 182807997;
                                                                                var14_3 = (var12_2 | var15_1) ^ 588779035;
                                                                                break block430;
                                                                                break;
                                                                            }
lbl679:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var8_15.tryCompleteActivation(var0);
                                                                                var14_3 = (var12_2 | var15_1) ^ -240100933;
                                                                                break block430;
                                                                                break;
                                                                            }
lbl683:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var13_4 ^= var14_3 ^ -837268302;
                                                                                var14_3 = (var12_2 | var15_1) ^ 1046232609;
                                                                                break block430;
                                                                                break;
                                                                            }
lbl687:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var8_15.onTick(var0);
lbl689:
                                                                                // 3 sources

                                                                                var14_3 = (var12_2 | var15_1) ^ -554385608;
                                                                                break block429;
lbl691:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var13_4 ^= var14_3 ^ -1104014489;
                                                                                    var14_3 = (var12_2 | var15_1) ^ 1913324122;
                                                                                    break block429;
                                                                                    break;
                                                                                }
lbl695:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var9_17 = mw.getInstance().getModuleByName(iq.V);
                                                                                    if (!(var9_17 instanceof kM)) ** GOTO lbl707
                                                                                    var14_3 = (var12_2 | var15_1) ^ -1905756285;
                                                                                    break block431;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
lbl700:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var14_3 = (var12_2 | var15_1) ^ -878830737;
                                                                        break block431;
                                                                        break;
                                                                    }
lbl703:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var8_15 = (kM)var9_17;
                                                                        if (var8_15.isFreecamActive()) {
                                                                            kM.reapplyBodyMovementFromKeys(var0);
                                                                        }
lbl707:
                                                                        // 4 sources

                                                                        var14_3 = (var12_2 | var15_1) ^ -543788093;
                                                                        break block431;
                                                                        break;
                                                                    }
lbl709:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var13_4 ^= var14_3 ^ -1995864172;
                                                                        var14_3 = (var12_2 | var15_1) ^ 1352235521;
                                                                        break block431;
                                                                        break;
                                                                    }
lbl713:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var9_17 = mw.getInstance().getModuleByName(iq.Y);
                                                                        if (!(var9_17 instanceof a)) ** GOTO lbl726
                                                                        var14_3 = (var12_2 | var15_1) ^ -1612939717;
                                                                        break block431;
                                                                        break;
                                                                    }
lbl718:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var13_4 ^= var14_3 ^ -329169506;
                                                                        var14_3 = (var12_2 | var15_1) ^ -617055324;
                                                                        break block431;
                                                                        break;
                                                                    }
lbl722:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var8_15 = (a)var9_17;
                                                                        var13_4 ^= -1645487079;
                                                                        var8_15.tickCamera(var0);
lbl726:
                                                                        // 2 sources

                                                                        var14_3 = (var12_2 | var15_1) ^ 835840311;
                                                                        break block431;
                                                                        break;
                                                                    }
lbl728:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var13_4 ^= var14_3 ^ 1679358343;
                                                                        var14_3 = (var12_2 | var15_1) ^ -1161852549;
                                                                        break block431;
                                                                        break;
                                                                    }
lbl732:
                                                                    // 1 sources

                                                                    return;
                                                                }
                                                                block389: while (true) {
                                                                    switch (var14_3) {
                                                                        default: {
                                                                            continue block389;
                                                                        }
                                                                        case -1957581751: {
                                                                            ** continue;
                                                                        }
                                                                        case -997985829: {
                                                                            ** continue;
                                                                        }
                                                                        case 2081921801: {
                                                                            ** continue;
                                                                        }
                                                                        case -1801876270: {
                                                                            ** continue;
                                                                        }
                                                                        case 2013607715: {
                                                                            ** continue;
                                                                        }
                                                                        case 1250919632: {
                                                                            ** continue;
                                                                        }
                                                                        case -1380302539: {
                                                                            ** continue;
                                                                        }
                                                                        case 1850140408: {
                                                                            ** continue;
                                                                        }
                                                                        case 1252532872: {
                                                                            ** continue;
                                                                        }
                                                                        ** case 874221576:
lbl758:
                                                                        // 1 sources

                                                                        ** continue;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            block390: while (true) {
                                                                switch (var14_3) {
                                                                    default: {
                                                                        continue block390;
                                                                    }
                                                                    case -742335860: {
                                                                        ** continue;
                                                                    }
                                                                    case 869117712: {
                                                                        ** continue;
                                                                    }
                                                                    case 1544866138: {
                                                                        ** continue;
                                                                    }
                                                                    case -1892433154: {
                                                                        ** continue;
                                                                    }
                                                                    case 1162619612: {
                                                                        ** continue;
                                                                    }
                                                                    case 1264868501: {
                                                                        ** continue;
                                                                    }
                                                                    case -1297019547: {
                                                                        ** continue;
                                                                    }
                                                                    case -1710904896: {
                                                                        ** continue;
                                                                    }
                                                                    case -492353764: {
                                                                        ** continue;
                                                                    }
                                                                    case -1647939891: {
                                                                        ** continue;
                                                                    }
                                                                    case -1616760956: {
                                                                        ** continue;
                                                                    }
                                                                    case 1467889887: {
                                                                        ** continue;
                                                                    }
                                                                    case -1134798476: {
                                                                        ** continue;
                                                                    }
                                                                    case 285318626: {
                                                                        ** continue;
                                                                    }
                                                                    case 2074958418: {
                                                                        ** continue;
                                                                    }
                                                                    case 1897890937: {
                                                                        ** continue;
                                                                    }
                                                                    case 22023885: {
                                                                        ** continue;
                                                                    }
                                                                    case -1298830883: {
                                                                        ** continue;
                                                                    }
                                                                    case 1631572353: {
                                                                        ** continue;
                                                                    }
                                                                    case -1566498839: {
                                                                        ** continue;
                                                                    }
                                                                    case -1854887758: {
                                                                        ** continue;
                                                                    }
                                                                    case 1024615423: {
                                                                        ** continue;
                                                                    }
                                                                    case -1054767065: {
                                                                        ** continue;
                                                                    }
                                                                    case -152554366: {
                                                                        ** continue;
                                                                    }
                                                                    case -1261648349: {
                                                                        ** continue;
                                                                    }
                                                                    case -1319298490: {
                                                                        ** continue;
                                                                    }
                                                                    case -506844101: {
                                                                        ** continue;
                                                                    }
                                                                    case 969614026: {
                                                                        ** continue;
                                                                    }
                                                                    case 341923563: {
                                                                        ** continue;
                                                                    }
                                                                    case -838194038: {
                                                                        ** continue;
                                                                    }
                                                                    case 1401292514: {
                                                                        ** continue;
                                                                    }
                                                                    case 755235640: {
                                                                        ** continue;
                                                                    }
                                                                    case 594866088: {
                                                                        ** continue;
                                                                    }
                                                                    ** case -773381698:
lbl831:
                                                                    // 1 sources

                                                                    ** continue;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        block391: while (true) {
                                                            switch (var14_3) {
                                                                default: {
                                                                    continue block391;
                                                                }
                                                                case -657169824: {
                                                                    ** continue;
                                                                }
                                                                case 1775434465: {
                                                                    ** continue;
                                                                }
                                                                case 2008177358: {
                                                                    ** continue;
                                                                }
                                                                case -611472455: {
                                                                    ** continue;
                                                                }
                                                                case 1612900073: {
                                                                    ** continue;
                                                                }
                                                                case 1380741958: {
                                                                    ** continue;
                                                                }
                                                                case 1661659874: {
                                                                    ** continue;
                                                                }
                                                                case 540250297: {
                                                                    ** continue;
                                                                }
                                                                case -1802386280: {
                                                                    ** continue;
                                                                }
                                                                ** case 1545540887:
lbl856:
                                                                // 1 sources

                                                                ** continue;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                                block392: while (true) {
                                                    switch (var14_3) {
                                                        default: {
                                                            continue block392;
                                                        }
                                                        case -437812620: {
                                                            ** continue;
                                                        }
                                                        case 1571645221: {
                                                            ** continue;
                                                        }
                                                        case -1399023990: {
                                                            ** continue;
                                                        }
                                                        case 1161197220: {
                                                            ** continue;
                                                        }
                                                        case -1232512666: {
                                                            ** continue;
                                                        }
                                                        case 1416835798: {
                                                            ** continue;
                                                        }
                                                        ** case 60761596:
lbl875:
                                                        // 1 sources

                                                        ** continue;
                                                    }
                                                    break;
                                                }
                                            }
                                            block393: while (true) {
                                                switch (var14_3) {
                                                    default: {
                                                        continue block393;
                                                    }
                                                    case 762845036: {
                                                        ** continue;
                                                    }
                                                    case 679952694: {
                                                        ** continue;
                                                    }
                                                    case -535595254: {
                                                        ** continue;
                                                    }
                                                    case -38546747: {
                                                        ** continue;
                                                    }
                                                    case 1433401602: {
                                                        ** continue;
                                                    }
                                                    case 971836220: {
                                                        ** continue;
                                                    }
                                                    case -133083134: {
                                                        ** continue;
                                                    }
                                                    case -1251215042: {
                                                        ** continue;
                                                    }
                                                    case -1923166111: {
                                                        ** continue;
                                                    }
                                                    case 146918984: {
                                                        ** continue;
                                                    }
                                                    case 1599309898: {
                                                        ** continue;
                                                    }
                                                    case 544355587: {
                                                        ** continue;
                                                    }
                                                    ** case -1918925308:
lbl906:
                                                    // 1 sources

                                                    ** continue;
                                                }
                                                break;
                                            }
                                        }
                                        block394: while (true) {
                                            switch (var14_3) {
                                                default: {
                                                    continue block394;
                                                }
                                                case -1919256957: {
                                                    ** continue;
                                                }
                                                case -2127416146: {
                                                    ** continue;
                                                }
                                                case 1310719552: {
                                                    ** continue;
                                                }
                                                case 1734440253: {
                                                    ** continue;
                                                }
                                                case 149845968: {
                                                    ** continue;
                                                }
                                                case -1453733354: {
                                                    ** continue;
                                                }
                                                case -627910143: {
                                                    ** continue;
                                                }
                                                case -2054696132: {
                                                    ** continue;
                                                }
                                                case -908080689: {
                                                    ** continue;
                                                }
                                                case 346169109: {
                                                    ** continue;
                                                }
                                                case -847317469: {
                                                    ** continue;
                                                }
                                                ** case 131812909:
lbl935:
                                                // 1 sources

                                                ** continue;
                                            }
                                            break;
                                        }
                                    }
                                    block395: while (true) {
                                        switch (var14_3) {
                                            default: {
                                                continue block395;
                                            }
                                            case -888467830: {
                                                ** continue;
                                            }
                                            case -1279777594: {
                                                ** continue;
                                            }
                                            case 2122689477: {
                                                ** continue;
                                            }
                                            case 1494237400: {
                                                ** continue;
                                            }
                                            case 815945860: {
                                                ** continue;
                                            }
                                            ** case -1671567898:
lbl952:
                                            // 1 sources

                                            ** continue;
                                        }
                                        break;
                                    }
                                }
                                block396: while (true) {
                                    switch (var14_3) {
                                        default: {
                                            continue block396;
                                        }
                                        case -618946808: {
                                            ** continue;
                                        }
                                        case -850466393: {
                                            ** continue;
                                        }
                                        case 535215623: {
                                            ** continue;
                                        }
                                        ** case -804595299:
lbl965:
                                        // 1 sources

                                        ** continue;
                                    }
                                    break;
                                }
                            }
                            block397: while (true) {
                                switch (var14_3) {
                                    default: {
                                        continue block397;
                                    }
                                    case 1874791770: {
                                        ** continue;
                                    }
                                    case -809106977: {
                                        ** continue;
                                    }
                                    case 1128460579: {
                                        ** continue;
                                    }
                                    case 1808797303: {
                                        ** continue;
                                    }
                                    case 1435267126: {
                                        ** continue;
                                    }
                                    ** case -1505768628:
lbl982:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                        }
                        block398: while (true) {
                            switch (var14_3) {
                                default: {
                                    continue block398;
                                }
                                case 2041732843: {
                                    ** continue;
                                }
                                case -553298052: {
                                    ** continue;
                                }
                                case -625429672: {
                                    ** continue;
                                }
                                case 120581749: {
                                    ** continue;
                                }
                                case 743835227: {
                                    ** continue;
                                }
                                case 898330359: {
                                    ** continue;
                                }
                                case -1012254812: {
                                    ** continue;
                                }
                                case 1426720161: {
                                    ** continue;
                                }
                                case -321225513: {
                                    ** continue;
                                }
                                case -1628574290: {
                                    ** continue;
                                }
                                case -57321993: {
                                    ** continue;
                                }
                                case -1078577213: {
                                    ** continue;
                                }
                                case -1055498260: {
                                    ** continue;
                                }
                                case 742796149: {
                                    ** continue;
                                }
                                case -2082751951: {
                                    ** continue;
                                }
                                case 175758977: {
                                    ** continue;
                                }
                                case -2127889625: {
                                    ** continue;
                                }
                                case 1217971077: {
                                    ** continue;
                                }
                                case 2110542896: {
                                    ** continue;
                                }
                                case 2003395063: {
                                    ** continue;
                                }
                                case -1935186440: {
                                    ** continue;
                                }
                                case -1288983900: {
                                    ** continue;
                                }
                                case -1978866771: {
                                    ** continue;
                                }
                                case 1750639999: {
                                    ** continue;
                                }
                                case 1936255019: {
                                    ** continue;
                                }
                                case 777028706: {
                                    ** continue;
                                }
                                ** case -1364856202:
lbl1041:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                    }
                    block399: while (true) {
                        switch (var14_3) {
                            default: {
                                continue block399;
                            }
                            case 1614712895: {
                                ** continue;
                            }
                            case 633928915: {
                                ** continue;
                            }
                            case 834704511: {
                                ** continue;
                            }
                            case -1093689923: {
                                ** continue;
                            }
                            case 1904908679: {
                                ** continue;
                            }
                            case 896441368: {
                                ** continue;
                            }
                            case -544797045: {
                                ** continue;
                            }
                            ** case 1424584391:
lbl1062:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
                }
                block400: while (true) {
                    switch (var14_3) {
                        default: {
                            continue block400;
                        }
                        case -1958579386: {
                            ** continue;
                        }
                        case -209710832: {
                            ** continue;
                        }
                        case 501663297: {
                            ** continue;
                        }
                        case -1519977135: {
                            ** continue;
                        }
                        case 862028820: {
                            ** continue;
                        }
                        case -1027096547: {
                            ** continue;
                        }
                        case 821911525: {
                            ** continue;
                        }
                        case 1993610739: {
                            ** continue;
                        }
                        case -175173749: {
                            ** continue;
                        }
                        case -796742368: {
                            ** continue;
                        }
                        case 1742020653: {
                            ** continue;
                        }
                        ** case -1289813072:
lbl1091:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            block401: while (true) {
                switch (var14_3) {
                    default: {
                        continue block401;
                    }
                    case 1168529819: {
                        ** continue;
                    }
                    case -654193959: {
                        ** continue;
                    }
                    case 698721037: {
                        ** continue;
                    }
                    case -1611706174: {
                        ** continue;
                    }
                    case -1445393594: {
                        ** continue;
                    }
                    case -89648192: {
                        ** continue;
                    }
                    case -1156684637: {
                        ** continue;
                    }
                    case -1902214842: {
                        ** continue;
                    }
                    case -1802531262: {
                        ** continue;
                    }
                    ** case -1468128374:
lbl1116:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        block402: while (true) {
            switch (var14_3) {
                default: {
                    continue block402;
                }
                case -1700982285: {
                    ** continue;
                }
                case -284224438: {
                    ** continue;
                }
                case -1724157965: {
                    ** continue;
                }
                case -1910279068: {
                    ** continue;
                }
                case -1881035076: {
                    ** continue;
                }
                case 1906180392: {
                    ** continue;
                }
                case -314619183: {
                    ** continue;
                }
                ** case 2083160648:
lbl1137:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static void HT(WorldRenderContext var0) {
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
    private static void HU(class_332 var0, class_9779 var1_1) {
        block40: {
            var8_2 = -324802807;
            var5_3 = iq.a & -324802807 ^ 64947924;
            var7_4 = 0;
            var6_8 = (var5_3 | var8_2) ^ 1856765937;
            var7_4 = (var5_3 | var8_2) ^ -691677251;
            if (true) ** GOTO lbl9
            block25: while (true) {
                var7_4 = (var5_3 | var8_2) ^ -108989817;
lbl9:
                // 2 sources

                while (true) {
                    switch (var7_4) {
                        default: {
                            break;
                        }
                        case -76156201: {
                            var6_8 ^= var7_4 ^ 1458913508;
                            continue block25;
                        }
                        case 377427290: {
                            var2_5 = class_310.method_1551();
                            var7_4 = (var5_3 | var8_2) ^ -1967857115;
                            break block40;
                        }
                        case 960114784: {
                            var7_4 = (var5_3 | var8_2) ^ 344593674;
                            break;
                        }
                    }
                }
                break;
            }
            {
                switch (var7_4) {
                    case -228318823: {
                        var6_8 ^= var7_4 ^ -1692492598;
                        var7_4 = (var5_3 | var8_2) ^ -2125340388;
                        continue block27;
                    }
                    case 1505601121: {
                        var6_8 ^= var7_4 ^ 978436686;
                        ** GOTO lbl49
                    }
                    case -1149485390: {
                        var4_7 = (kb)var3_6;
                        if (!var4_7.isEnabled()) ** GOTO lbl47
                        ** GOTO lbl46
                    }
                    case 610239240: {
                        var7_4 = (var5_3 | var8_2) ^ 1417927023;
                        ** break;
                    }
                    case 1932521538: {
                        if (!(var3_6 instanceof kb)) ** GOTO lbl47
                        var7_4 = (var5_3 | var8_2) ^ -878680875;
                    }
lbl42:
                    // 4 sources

                    while (true) {
                        default: {
                            continue block27;
                        }
                        break;
                    }
                    {
                    }
lbl46:
                    // 1 sources

                    var4_7.renderHud2D(var2_5, var0, var1_1.method_60637(false));
lbl47:
                    // 3 sources

                    var7_4 = (var5_3 | var8_2) ^ 496748100;
                    continue block27;
lbl49:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ -1664084065;
                    continue block27;
lbl51:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ -1237171780;
                        ** continue;
                        break;
                    }
lbl54:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ 2030905999;
                        break block40;
                        break;
                    }
lbl57:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ -714870537;
                        break block40;
                        break;
                    }
lbl60:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ 314600570;
                        break block40;
                        while (true) {
                            var7_4 = (var5_3 | var8_2) ^ -1399081358;
                            break block40;
                            break;
                        }
lbl66:
                        // 1 sources

                        while (true) {
                            var7_4 = (var5_3 | var8_2) ^ -1008447354;
                            break block40;
lbl69:
                            // 1 sources

                            while (true) {
                                var7_4 = (var5_3 | var8_2) ^ -1113015080;
                                break block40;
                                break;
                            }
                            while (true) {
                                var7_4 = (var5_3 | var8_2) ^ -2107922935;
                                break block40;
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    case 1856898753: 
                }
            }
            return;
        }
        block37: while (true) {
            switch (var7_4) {
                default: {
                    continue block37;
                }
                case -46167129: {
                    var3_6 = mw.getInstance().getModuleByName(iq.U);
                    ** continue;
                }
                case 740013915: {
                    if (var2_5.field_1724 != null) ** continue;
                    var7_4 = (var5_3 | var8_2) ^ 965115037;
                    continue block37;
                }
                case 983308074: {
                    var6_8 ^= var7_4 ^ -949342784;
                    ** continue;
                }
                case 1699415544: {
                    var6_8 ^= var7_4 ^ -1702724212;
                    ** continue;
                }
                case -696673472: {
                    var6_8 ^= var7_4 ^ -1096971081;
                    var7_4 = (var5_3 | var8_2) ^ 504981919;
                    continue block37;
                }
                case -1762472622: {
                    if (hJ.ok()) ** continue;
                    ** continue;
                }
                case 1839481300: {
                    var6_8 ^= var7_4 ^ 1945343131;
                    ** continue;
                }
                case 1130647983: {
                    var6_8 ^= var7_4 ^ -27771352;
                    ** continue;
                }
                case 1381456645: {
                    return;
                }
                case -236548542: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void HV(class_310 var0) {
        var8_1 = 744617225;
        var5_2 = iq.a & 744617225 ^ -912338668;
        var7_3 = 0;
        var6_6 = (var5_2 | var8_1) ^ 859893542;
        var7_3 = (var5_2 | var8_1) ^ -1959771026;
        if (true) ** GOTO lbl22
lbl7:
        // 1 sources

        while (true) {
            var7_3 = (var5_2 | var8_1) ^ -1365284344;
            ** GOTO lbl31
            break;
        }
        block38: while (true) {
            switch (var7_3) {
                case 350063234: {
                    var1_4 = System.currentTimeMillis();
                    var7_3 = (var5_2 | var8_1) ^ 813008226;
                    if (true) ** GOTO lbl47
                }
                case 1724887411: {
                    break;
                }
                case 565038150: {
                    var6_6 ^= var7_3 ^ -321195922;
                    ** break;
lbl21:
                    // 1 sources

                    var7_3 = (var5_2 | var8_1) ^ -115179617;
                }
lbl22:
                // 3 sources

                default: {
                    continue block38;
                }
            }
            var7_3 = (var5_2 | var8_1) ^ -867026597;
        }
        block39: while (true) {
            var7_3 = (var5_2 | var8_1) ^ -1713134957;
            if (true) ** GOTO lbl31
            block40: while (true) {
                var7_3 = (var5_2 | var8_1) ^ 818144948;
lbl31:
                // 3 sources

                block41: while (true) {
                    switch (var7_3) {
                        case -1186720162: {
                            return;
                        }
                        case -583265367: {
                            var6_6 ^= var7_3 ^ 255785956;
                            ** GOTO lbl58
                        }
                        case -95669696: {
                            var6_6 ^= var7_3 ^ -972982652;
                            ** continue;
                        }
                        case 1948014478: {
                            var3_5 = hJ.errMsg();
                            ** break;
                        }
                        case -578129793: {
                            var6_6 ^= var7_3 ^ 1549416025;
                            var7_3 = (var5_2 | var8_1) ^ -348951536;
                        }
lbl47:
                        // 3 sources

                        default: {
                            continue block41;
                        }
                        case 114071821: {
                            if (var1_4 - iq.a < (-7919474161530409067L << (var7_3 ^ 114071853) >>> (var7_3 ^ 114071853) ^ (long)var6_6 & 0xFFFFFFFFL | (-7919474161530409067L >>> (var7_3 ^ 114071853) ^ (long)var6_6 & 0xFFFFFFFFL) << (var7_3 ^ 114071853))) {
                                continue block40;
                            }
                            ** GOTO lbl56
                        }
lbl54:
                        // 1 sources

                        var7_3 = (var5_2 | var8_1) ^ 822337276;
                        ** GOTO lbl135
lbl56:
                        // 1 sources

                        var7_3 = (var5_2 | var8_1) ^ 397657949;
                        continue block41;
lbl58:
                        // 1 sources

                        var7_3 = (var5_2 | var8_1) ^ 1421599555;
                        continue block41;
                        case -1405012259: {
                            var6_6 ^= var7_3 ^ -200242322;
                            continue block39;
                        }
                        case 1130405653: 
                    }
                    iq.a = var1_4;
                    var7_3 = (var5_2 | var8_1) ^ 1103020992;
                }
                break;
            }
            break;
        }
lbl67:
        // 1 sources

        while (true) {
            var7_3 = (var5_2 | var8_1) ^ 975591795;
            if (true) ** GOTO lbl73
            break;
        }
        block43: while (true) {
            block52: {
                var7_3 = (var5_2 | var8_1) ^ -54965935;
                break block52;
lbl73:
                // 2 sources

                block44: while (true) {
                    block57: {
                        block56: {
                            block53: {
                                block55: {
                                    block54: {
                                        switch (var7_3) {
                                            case 1164833037: {
                                                jH.alert(var3_5);
                                                ** GOTO lbl95
                                            }
                                            case 903536821: {
                                                return;
                                            }
                                            case -673600402: {
                                                if (var0.field_1724 != null) {
                                                    ** break;
                                                }
                                                ** GOTO lbl99
                                            }
                                            case -2003671162: {
                                                var0.field_1705.method_1758((class_2561)var4_7, false);
                                                ** GOTO lbl112
                                            }
                                            case -268973061: {
                                                var6_6 ^= var7_3 ^ 30149709;
                                                break block53;
                                            }
                                            case 544115990: {
                                                var6_6 ^= var7_3 ^ -493198703;
                                                break block54;
                                            }
lbl93:
                                            // 1 sources

                                            var7_3 = (var5_2 | var8_1) ^ -846104565;
                                            continue block44;
lbl95:
                                            // 1 sources

                                            var7_3 = (var5_2 | var8_1) ^ 1589404459;
                                            continue block44;
                                            case 2112260194: {
                                                break block55;
                                            }
lbl99:
                                            // 1 sources

                                            var7_3 = (var5_2 | var8_1) ^ -539944022;
                                            continue block44;
                                            case 475466157: {
                                                var0.field_1724.method_7353((class_2561)var4_7, true);
                                                ** GOTO lbl112
                                            }
                                            case -1287416266: {
                                                var6_6 ^= var7_3 ^ 1737351161;
                                                break block56;
                                            }
                                            case 295088173: {
                                                var6_6 ^= var7_3 ^ 1526143054;
                                                ** continue;
                                            }
                                            case -1931582683: {
                                                if (var0.field_1705 != null) break block57;
lbl112:
                                                // 3 sources

                                                var7_3 = (var5_2 | var8_1) ^ 34094822;
                                            }
lbl113:
                                            // 3 sources

                                            default: {
                                                continue block44;
                                            }
                                            {
                                            }
                                            case 841936567: 
                                        }
                                        var6_6 ^= var7_3 ^ -254148304;
                                        var7_3 = (var5_2 | var8_1) ^ 1629591096;
                                        ** GOTO lbl113
                                    }
                                    var7_3 = (var5_2 | var8_1) ^ -240583504;
                                    continue;
                                }
                                var7_3 = (var5_2 | var8_1) ^ 1701679771;
                                continue;
                            }
                            var7_3 = (var5_2 | var8_1) ^ -1466825712;
                            continue;
                        }
                        var7_3 = (var5_2 | var8_1) ^ -668658264;
                        continue;
                    }
                    var7_3 = (var5_2 | var8_1) ^ -1877377665;
                    continue;
                    break;
                }
            }
            block46: while (true) {
                block58: {
                    switch (var7_3) {
                        default: {
                            continue block46;
                        }
                        case -1287853014: {
                            var4_7 = class_2561.method_43470((String)("[Zerio] " + var3_5));
                            var7_3 = (var5_2 | var8_1) ^ -60209872;
                            ** continue;
                        }
                        case -587453471: {
                            var6_6 ^= var7_3 ^ 1499029131;
                            break;
                        }
                        case 289848396: {
                            var6_6 ^= var7_3 ^ -1114585971;
                            var7_3 = (var5_2 | var8_1) ^ 1589844279;
                            continue block46;
                        }
                        case 2146837830: {
                            var7_3 = (var5_2 | var8_1) ^ 949007184;
                            continue block46;
                        }
                        case -714127795: {
                            var3_5 = iq.l;
                            continue block43;
                        }
                        case 2113773239: {
                            if (var3_5.isBlank()) ** break;
                            continue block43;
                            break block58;
                        }
                    }
                    var7_3 = (var5_2 | var8_1) ^ -1878889558;
                    continue;
                }
                var7_3 = (var5_2 | var8_1) ^ -1844850597;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block15: {
            break block15;
lbl1:
            // 1 sources

            while (true) {
                var0_2 ^= 882831293;
                var0_2 ^= 2066696512;
                var0_2 ^= 337827946;
                var0_2 ^= 1365708137;
                var0_2 ^= 1936254117;
                var0_2 ^= -203311724;
                v0 = var0_2 ^= 1353704956;
                var0_2 ^= 699585926;
                iq.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ ((v0 | var2) ^ 2120095845 ^ iq.a);
                v1 = v1 + 1;
                v4 = v3 + 4;
                v2 = v2;
                v3 = v4;
                var0_2 ^= -211807563;
                if (v4 < v2.length) continue;
                iq.o = gj.decode("8Wdh+ov2jtvC5K+ikLfhLDUCdbLhleenDYa2CRg=", iq.Is(((var0_2 ^= 1560950698) | var2) ^ -757450616, var2 ^ ((var0_2 | var2) ^ 575118073)));
                iq.A = gj.decode("97WK", iq.Is((var0_2 | var2) ^ -757450609, var2 ^ ((var0_2 | var2) ^ -1905599933)));
                iq.K = gj.decode("rGIMyzk+Ow==", iq.Is((var0_2 | var2) ^ -757450610, var2 ^ ((var0_2 | var2) ^ -1309287657)));
                iq.H = gj.decode("nTw3SwjTMSZIHw==", iq.Is((var0_2 | var2) ^ -757450611, var2 ^ ((var0_2 | var2) ^ -1258060575)));
                iq.n = gj.decode("EjL/qHrS+G/OLwg=", iq.Is((var0_2 | var2) ^ -757450612, var2 ^ ((var0_2 | var2) ^ 128116182)));
                iq.f = gj.decode("MdavBUqERDMfyFCoDQ==", iq.Is((var0_2 | var2) ^ -757450621, var2 ^ ((var0_2 | var2) ^ 1343594268)));
                iq.g = gj.decode("AWWMA64AqHGH7t4=", iq.Is((var0_2 | var2) ^ -757450622, var2 ^ ((var0_2 | var2) ^ 1957546829)));
                iq.G = gj.decode("vpkz8ZGr5Rz1SDxMjQ==", iq.Is((var0_2 | var2) ^ -757450623, var2 ^ ((var0_2 | var2) ^ -244182415)));
                iq.B = gj.decode("2ithN1Mpm5YnXMU=", iq.Is((var0_2 | var2) ^ -757450624, var2 ^ ((var0_2 | var2) ^ -2017380143)));
                iq.m = gj.decode("050d1m5gWvrh9dE=", iq.Is((var0_2 | var2) ^ -757450617, var2 ^ ((var0_2 | var2) ^ -1002838607)));
                iq.r = gj.decode("qEGF6V8F16xpWMc=", iq.Is((var0_2 | var2) ^ -757450618, var2 ^ ((var0_2 | var2) ^ -1250861275)));
                iq.ac = gj.decode("mVgYdQ9Kxl4bkHaTBA==", iq.Is((var0_2 | var2) ^ -757450619, var2 ^ ((var0_2 | var2) ^ -1327826073)));
                iq.p = gj.decode("iXOUv73pvdhSK/60", iq.Is((var0_2 | var2) ^ -757450620, var2 ^ ((var0_2 | var2) ^ -1097682448)));
                iq.W = gj.decode("dQkFG6NhUg==", iq.Is((var0_2 | var2) ^ -757450597, var2 ^ ((var0_2 | var2) ^ -560603458)));
                iq.T = gj.decode("Q3KqC7yWX4x/", iq.Is((var0_2 | var2) ^ -757450598, var2 ^ ((var0_2 | var2) ^ 35305967)));
                iq.i = gj.decode("And9qwrSnDk613rdEctv4vw=", iq.Is((var0_2 | var2) ^ -757450599, var2 ^ ((var0_2 | var2) ^ -1024548403)));
                iq.I = gj.decode("3LgnrrQKPm2jpGzXHcCx", iq.Is((var0_2 | var2) ^ -757450600, var2 ^ ((var0_2 | var2) ^ -668480526)));
                iq.a = gj.decode("sOEYkLPmxz63qBc=", iq.Is((var0_2 | var2) ^ -757450593, var2 ^ ((var0_2 | var2) ^ -312089051)));
                iq.q = gj.decode("7k7fPt03HR20Lkrj", iq.Is((var0_2 | var2) ^ -757450594, var2 ^ ((var0_2 | var2) ^ -1057560183)));
                iq.Z = gj.decode("y/l6+rltEVjOH/M=", iq.Is((var0_2 | var2) ^ -757450595, var2 ^ ((var0_2 | var2) ^ 268529801)));
                iq.J = gj.decode("dWNsz0miOHxAfZqSvEai8g==", iq.Is((var0_2 | var2) ^ -757450596, var2 ^ ((var0_2 | var2) ^ -715419941)));
                iq.aa = gj.decode("AyVB85hYHqL2Eu57", iq.Is((var0_2 | var2) ^ -757450605, var2 ^ ((var0_2 | var2) ^ 1853365505)));
                iq.P = gj.decode("uxVboQEA2OQ=", iq.Is((var0_2 | var2) ^ -757450606, var2 ^ ((var0_2 | var2) ^ 1879973842)));
                iq.t = gj.decode("16muOa6FF2V/LpCE", iq.Is((var0_2 | var2) ^ -757450607, var2 ^ ((var0_2 | var2) ^ 421705212)));
                iq.F = gj.decode("p8FAu+jurIrywQ==", iq.Is((var0_2 | var2) ^ -757450608, var2 ^ ((var0_2 | var2) ^ 303932924)));
                iq.z = gj.decode("ao1CdBezZhaBrYXXl3dpLIdp", iq.Is((var0_2 | var2) ^ -757450601, var2 ^ ((var0_2 | var2) ^ -1560463912)));
                iq.V = gj.decode("pgL+J4Wa0Q==", iq.Is((var0_2 | var2) ^ -757450602, var2 ^ ((var0_2 | var2) ^ -860561178)));
                iq.Y = gj.decode("+9NqFspLr9g=", iq.Is((var0_2 | var2) ^ -757450603, var2 ^ ((var0_2 | var2) ^ -1721030977)));
                iq.X = gj.decode("gn8qnCb/R4NafA==", iq.Is((var0_2 | var2) ^ -757450604, var2 ^ ((var0_2 | var2) ^ -122513360)));
                iq.s = gj.decode("z/lYdFLD1Qc=", iq.Is((var0_2 | var2) ^ -757450581, var2 ^ ((var0_2 | var2) ^ -600634786)));
                iq.U = gj.decode("WPvUM2oJo5NKGg==", iq.Is((var0_2 | var2) ^ -757450582, var2 ^ ((var0_2 | var2) ^ -239519131)));
                iq.k = gj.decode("VdyYygH1QYwKwKY0lgJ3", iq.Is((var0_2 | var2) ^ -757450583, var2 ^ ((var0_2 | var2) ^ 739775425)));
                iq.w = gj.decode("/t1F414Rnw8D1lM=", iq.Is((var0_2 | var2) ^ -757450584, var2 ^ ((var0_2 | var2) ^ 733211451)));
                iq.c = gj.decode("zTE3sa0C+M3RiOrQ", iq.Is((var0_2 | var2) ^ -757450577, var2 ^ ((var0_2 | var2) ^ -677122660)));
                iq.D = gj.decode("sZ/QOpB7dwWB5bmilQ==", iq.Is((var0_2 | var2) ^ -757450578, var2 ^ ((var0_2 | var2) ^ -829544126)));
                iq.L = gj.decode("ETRH1tSAZXF4fZ9qcg==", iq.Is((var0_2 | var2) ^ -757450579, var2 ^ ((var0_2 | var2) ^ 810232920)));
                iq.e = gj.decode("Vr0LH/II5xmtd+Rp", iq.Is((var0_2 | var2) ^ -757450580, var2 ^ ((var0_2 | var2) ^ -1223423974)));
                iq.af = gj.decode("XzehsmWscfRpBK8=", iq.Is((var0_2 | var2) ^ -757450589, var2 ^ ((var0_2 | var2) ^ 2143455330)));
                iq.v = gj.decode("EXBQS1SQzs+Rrw==", iq.Is((var0_2 | var2) ^ -757450590, var2 ^ ((var0_2 | var2) ^ 898763138)));
                iq.y = gj.decode("RejMPg==", iq.Is((var0_2 | var2) ^ -757450591, var2 ^ ((var0_2 | var2) ^ -804343490)));
                iq.b = gj.decode("QRVuHFG8dJ4kUU5TIvI=", iq.Is((var0_2 | var2) ^ -757450592, var2 ^ ((var0_2 | var2) ^ 1730881276)));
                iq.ab = gj.decode("d0gN3vJ424s=", iq.Is((var0_2 | var2) ^ -757450585, var2 ^ ((var0_2 | var2) ^ 1079642252)));
                iq.C = gj.decode("sz5QY0yo6DmEaTE=", iq.Is((var0_2 | var2) ^ -757450586, var2 ^ ((var0_2 | var2) ^ 835193265)));
                iq.d = gj.decode("FzqyzahlXCaUmLrZQZErNfYE", iq.Is((var0_2 | var2) ^ -757450587, var2 ^ ((var0_2 | var2) ^ -335620041)));
                iq.Q = gj.decode("T/HSkvCm+F1HqOod", iq.Is((var0_2 | var2) ^ -757450588, var2 ^ ((var0_2 | var2) ^ -804500273)));
                iq.u = gj.decode("SLCoE8rYp2MtXSuR", iq.Is((var0_2 | var2) ^ -757450565, var2 ^ ((var0_2 | var2) ^ -839456794)));
                iq.ae = gj.decode("NjkNV47qSOjRs9/WDGjN4vep0fERZSk=", iq.Is((var0_2 | var2) ^ -757450566, var2 ^ ((var0_2 | var2) ^ 539088372)));
                iq.E = gj.decode("m2CmRNvXhDr12LaX4F8jeA==", iq.Is((var0_2 | var2) ^ -757450567, var2 ^ ((var0_2 | var2) ^ 1939250214)));
                iq.M = gj.decode("ck7H3DUOyvpoJbw=", iq.Is((var0_2 | var2) ^ -757450568, var2 ^ ((var0_2 | var2) ^ -899175994)));
                iq.ad = gj.decode("f0PcEF8VU1k/VxEd5+by", iq.Is((var0_2 | var2) ^ -757450561, var2 ^ ((var0_2 | var2) ^ -1860545167)));
                iq.R = gj.decode("DkVZArYlFUbci9VsnA==", iq.Is((var0_2 | var2) ^ -757450562, var2 ^ ((var0_2 | var2) ^ 1382678108)));
                iq.x = gj.decode("0jCYsA==", iq.Is((var0_2 | var2) ^ -757450563, var2 ^ ((var0_2 | var2) ^ -251977454)));
                iq.ag = gj.decode("Br/AzS8hsB5NPyMX", iq.Is((var0_2 | var2) ^ -757450564, var2 ^ ((var0_2 | var2) ^ 325488722)));
                iq.j = gj.decode("JTgx8l0Us3Ul", iq.Is((var0_2 | var2) ^ -757450573, var2 ^ ((var0_2 | var2) ^ 17114752)));
                iq.l = gj.decode("roqpBjLyzfXPKPSMj1DLF53vgGmY8gi0tq9S2BsWzZYpLkM6H9hC34juRkHUWNsu6qrwvQnKg/GXD9vl4hHq1woezH6KtJaGmA==", iq.Is((var0_2 | var2) ^ -757450574, var2 ^ ((var0_2 | var2) ^ -1321773766)));
                iq.h = gj.decode("GWXJS1+uLfdbp/jx0K3K9lv2", iq.Is((var0_2 | var2) ^ -757450575, var2 ^ ((var0_2 | var2) ^ -1890971152)));
                iq.N = gj.decode("rr0VKdmnigS4ocNIcSFC9lMnRgwliEQtOjsgsnJrw3x5dQ==", iq.Is((var0_2 | var2) ^ -757450576, var2 ^ ((var0_2 | var2) ^ -1834668068)));
                iq.O = gj.decode("We+4faGUhWBNMacxQ28i1ubLdR4=", iq.Is((var0_2 | var2) ^ -757450569, var2 ^ ((var0_2 | var2) ^ -912687981)));
                iq.S = gj.decode("SlhH/Wjs7FCA", iq.Is((var0_2 | var2) ^ -757450570, var2 ^ ((var0_2 | var2) ^ -385613194)));
                var1_1 = var2 ^ 2088474145;
                ** GOTO lbl121
                break;
            }
lbl95:
            // 1 sources

            while (true) {
                var0_2 ^= -594635746;
                v2 = "<\u0000n\u008apD\u00abEonN!l\u00c9\u00ab\u00f6\u00ae\u00eb\u00a9w\u00ef\u00f2a\u0097\u00ef\u00ec[;n\u00d5\u0001\u00a1\u00a0\u001e\u00b4l\u00e8\f\u00fdz\u0089\u00dc\u0084e\u00b0pz\u0007\u00d0L^\bh\u00c3\u00d0\u00e9\u00be\u0085C\u0011\b\u0084\u008d\u0016/\u0087\u00e7k|\u0095F##\u0001#j\u00bc\u0080 \u009f\u00cb\u00d7_\"\u001e\u008c\u0099M\u00c0\u00ce\u0010t|\u00ac'f\u00c5C\u0086X\u00ed\u00b4\u007fP\u00dcp\u0093\u00d0\u0092\u00a4\u00a4\u009b\u009bY%}\u0017\u00f2\u00ad\u00f6\n\u0093\u0097\u00c9\u008e\u0090\u0097\u009a\u0004\u00c5\u00b5\u009eU-\u0012\u0085\u00d3\u00bb\u00b7\u00fcs\u00ddf\u0000\"\u00ef4\u00a2\u00a8+\u00e43\u00eb\u0084\u0015c\u00f5\u001do\u00ee\u00c3A\u0000r\u008a\u00d8V:\u0005_\u00c2\u0081\u0095\u00a7I\u00e5\u0016\u00ab\r\u00cf}v5\u0083_Q\u00c3\u00eb/\u000e\u009b\u00b17\u00ad\u008e)\u0082\u000f\u00deW-U\u00b7\u00dfT $?D\u00ad\u00efw\u00a1\u000b\n'\u0005\u00de\u00bb\u000f\u00c2\u00b7\u009dl\u0092\u00ea]\u0099\u00fd\u00f2lO\u00fe\u00fa\u0004b\u00f5s3\u00b2\u0094\u0088\fp\u00f5\u008c\u009b\u00b0".getBytes("ISO-8859-1");
                ** continue;
                break;
            }
        }
        var2 = -215697453;
        iq.a = mK.a(MethodHandles.lookup().lookupClass(), -1828158549);
        var1_1 = 0;
        var0_2 = 470200308;
        var1_1 = var2 ^ -1182390759;
        block13: while (true) {
            switch (var1_1) {
                case -1889590798: {
                    var0_2 ^= var1_1 ^ 1451060172;
                    var1_1 = var2 ^ 1080582225;
                    continue block13;
                }
                case 1703353825: {
                    v1 = 0;
                    v3 = 0;
                    ** break;
                }
                case 1252168138: {
                    var1_1 = var2 ^ 1376916947;
                    continue block13;
                }
                case -1590255104: {
                    var0_2 ^= var1_1 ^ 1659155453;
                    var1_1 = var2 ^ -1767658958;
                }
lbl121:
                // 3 sources

                default: {
                    continue block13;
                }
lbl123:
                // 1 sources

                while (true) {
                    switch (var0_2) {
                        case -1354905314: {
                            var0_2 ^= -1466724325;
                            ** GOTO lbl130
                        }
                        default: {
                            var0_2 ^= -838874183;
lbl130:
                            // 2 sources

                            iq.a = new int[(var0_2 | var2) ^ -214960179];
                            ** continue;
                        }
                        case -603116536: 
                    }
                    var0_2 ^= -717265579;
                }
                case -1286809726: 
            }
            break;
        }
        iq.a = new HashSet<E>();
    }

    /*
     * Unable to fully structure code
     */
    private static void HW(class_310 var0) {
        block25: {
            block23: {
                block24: {
                    block26: {
                        break block26;
lbl1:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -1454810495;
                            ** GOTO lbl29
lbl4:
                            // 1 sources

                            return;
lbl6:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -1241544832;
                                ** GOTO lbl29
                                break;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_3 ^ 1149113911;
                                ** continue;
                                break;
                            }
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 967850398;
                            break block23;
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_3 ^ 1942576915;
                            break block24;
                            break;
                        }
                    }
                    var5_1 = 1987240383;
                    var2_2 = iq.a & 1987240383 ^ -1901771611;
                    var4_3 = 0;
                    var3_5 = (var2_2 | var5_1) ^ -256312164;
                    ** while (true)
lbl24:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_3 ^ -801863032;
                        break block25;
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -2064597406;
lbl29:
                        // 4 sources

                        block19: while (true) {
                            switch (var4_3) {
                                default: {
                                    continue block19;
                                }
                                case 1258840639: {
                                    ** continue;
                                }
                                case 1472118590: {
                                    ** continue;
                                }
                                case 2047302621: {
                                    ** continue;
                                }
                                case 625630321: 
                            }
                            mw.getInstance().getModules().forEach((Consumer<gF>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, HX(net.minecraft.class_1041 z.r.gF ), (Lz/r/gF;)V)((class_1041)var1_4));
                            ** continue;
                            break;
                        }
                        break;
                    }
lbl42:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -874840518;
                        break block23;
                        break;
                    }
                }
                var4_3 = (var2_2 | var5_1) ^ 140431085;
                break block23;
lbl48:
                // 1 sources

                while (true) {
                    var1_4 = var0.method_22683();
                    ** continue;
                    break;
                }
            }
            block22: while (true) {
                switch (var4_3) {
                    default: {
                        continue block22;
                    }
                    case 892148613: {
                        ** continue;
                    }
                    case -951591903: {
                        ** continue;
                    }
                    ** case -156685486:
lbl61:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        var4_3 = (var2_2 | var5_1) ^ -608323122;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void HX(class_1041 var0, gF var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [36[UNCONDITIONALDOLOOP], 0[SWITCH], 35[UNCONDITIONALDOLOOP]], but top level block is 26[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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
    private static /* synthetic */ void HY() {
        int n2 = a & 0x8F7FF796 ^ 0xDD0F48D;
        int n3 = 0;
        int n4 = (n2 | 0x8F7FF796) ^ 0x3A6C6A92;
        n3 = (n2 | 0x8F7FF796) ^ 0x23506A40;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -971217469: {
                    n4 ^= n3 ^ 0xEDACDE5A;
                    n3 = (n2 | 0x8F7FF796) ^ 0x72D71081;
                    continue block5;
                }
                case -47651042: {
                    HudRenderCallback.EVENT.register(iq::HU);
                    return;
                }
                case -1397776929: 
            }
            n3 = (n2 | 0x8F7FF796) ^ 0x49E3925C;
        }
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void HZ() {
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
    private static /* synthetic */ void Ia() {
        int n2 = a & 0x7873824D ^ 0xBBB3ABC2;
        int n3 = 0;
        int n4 = (n2 | 0x7873824D) ^ 0xAE59F99F;
        n3 = (n2 | 0x7873824D) ^ 0x26C1581D;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1301888437: {
                    n4 ^= n3 ^ 0x2FC56D1A;
                    n3 = (n2 | 0x7873824D) ^ 0x7D0B299C;
                    continue block5;
                }
                case -2030534061: {
                    ClientTickEvents.END_CLIENT_TICK.register(iq::HS);
                    return;
                }
                case -583863342: 
            }
            n3 = (n2 | 0x7873824D) ^ 0x49956984;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Ib() {
        block24: {
            break block24;
lbl1:
            // 1 sources

            while (true) {
                var3_2 = (var1_1 | var4) ^ -1324114414;
                if (true) ** GOTO lbl6
                break;
            }
            block18: while (true) {
                var3_2 = (var1_1 | var4) ^ 1253533551;
lbl6:
                // 2 sources

                block19: while (true) {
                    switch (var3_2) {
                        case -156205501: {
                            var2_4 ^= var3_2 ^ 887184367;
                            var3_2 = (var1_1 | var4) ^ 1210199116;
                            continue block19;
                        }
                        case 496568750: {
                            if (var0_3 < 0) {
                                ** break;
                            }
                            ** GOTO lbl35
                        }
                        case -513241026: {
                            var0_3 = iq.Is((var2_4 | var3_2 ^ -1565289789) ^ (var3_2 ^ 667065757), (var1_1 | var3_2 ^ -1565289789) ^ ((var2_4 | var3_2 ^ -1565289789) ^ (var3_2 ^ -236618153)));
                            ** GOTO lbl35
                        }
                        case -1476569165: {
                            iq.a = KeyBindingHelper.registerKeyBinding((class_304)new class_304(iq.h, class_3675.class_307.field_1668, var0_3, class_304.class_11900.field_62556));
                            ** continue;
                        }
lbl22:
                        // 1 sources

                        var3_2 = (var1_1 | var4) ^ -1463854263;
                        ** GOTO lbl44
                        case -1657021549: {
                            iq.syncClickGuiKeybinding();
                            var3_2 = (var1_1 | var4) ^ 164734157;
                            ** GOTO lbl44
                        }
                        case -459097466: {
                            var2_4 ^= var3_2 ^ -1370577096;
                            var3_2 = (var1_1 | var4) ^ -230264239;
                            ** GOTO lbl44
                        }
                        case 1197482166: {
                            var3_2 = (var1_1 | var4) ^ 246934465;
                            ** GOTO lbl44
                        }
lbl35:
                        // 2 sources

                        var3_2 = (var1_1 | var4) ^ 426706364;
                        ** GOTO lbl44
                        case -435232974: {
                            var2_4 ^= var3_2 ^ -1092396965;
                            continue block18;
                        }
                        case 1590486509: {
                            var2_4 ^= var3_2 ^ 773646072;
                            var3_2 = (var1_1 | var4) ^ 1927585900;
                            continue block19;
                        }
lbl44:
                        // 7 sources

                        while (true) {
                            default: {
                                continue block19;
                            }
                            break;
                        }
lbl47:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | var4) ^ 192790905;
                            ** continue;
                            break;
                        }
                        case -1519903600: 
                    }
                    break;
                }
                break;
            }
            return;
        }
        var4 = 1138426621;
        var1_1 = iq.a & 1138426621 ^ -1346078277;
        var3_2 = 0;
        var2_4 = (var1_1 | var4) ^ 1582208176;
        var3_2 = (var1_1 | var4) ^ -741443312;
        block22: while (true) {
            switch (var3_2) {
                default: {
                    continue block22;
                }
                case 171161803: {
                    var0_3 = z.r.H.get().getClickGuiKey();
                    ** continue;
                }
                case 1007747823: {
                    var3_2 = (var1_1 | var4) ^ -525223040;
                    continue block22;
                }
                case 258916479: 
            }
            var2_4 ^= var3_2 ^ 316142230;
            var3_2 = (var1_1 | var4) ^ -437468364;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void Ic() {
        block9: {
            break block9;
lbl1:
            // 1 sources

            block5: while (true) {
                switch (var2_1) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
                    case 1870467998: {
                        break block5;
                    }
                    case -650237509: {
                        ClientReceiveMessageEvents.MODIFY_GAME.register((Object)(ClientReceiveMessageEvents.ModifyGame)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_2561;Z)Lnet/minecraft/class_2561;, Id(net.minecraft.class_2561 boolean ), (Lnet/minecraft/class_2561;Z)Lnet/minecraft/class_2561;)());
                        return;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var2_1 = (var0 | 1988350209) ^ -1728132563;
                        ** GOTO lbl-1000
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var2_1 = (var0 | 1988350209) ^ 784199688;
                        ** continue;
                        break;
                    }
                    case -166654153: {
                        var1_2 ^= var2_1 ^ -394774676;
                        ** continue;
                    }
                }
                break;
            }
            var2_1 = (var0 | 1988350209) ^ 26400388;
            ** while (true)
        }
        var0 = iq.a & 1988350209 ^ -176088909;
        var2_1 = 0;
        var1_2 = (var0 | 1988350209) ^ -515768726;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ class_2561 Id(class_2561 class_25612, boolean bl2) {
        aR aR2;
        kl kl2;
        block6: {
            int n2 = a & 0x298F6BA2 ^ 0x233A036D;
            int n3 = 0;
            int n4 = (n2 | 0x298F6BA2) ^ 0x587B5309;
            n3 = (n2 | 0x298F6BA2) ^ 0x68D9F761;
            block5: while (true) {
                switch (n3) {
                    default: {
                        continue block5;
                    }
                    case -754457883: {
                        n4 ^= n3 ^ 0x9252F8E6;
                        n3 = (n2 | 0x298F6BA2) ^ 0x6FFF440E;
                        continue block5;
                    }
                    case 1145057249: {
                        kl2 = kl.getInstance();
                        n4 ^= 0x294F2C51;
                        if (!bl2) break block5;
                        n4 ^= 0x2BED4705;
                        aR2 = aR.a;
                        break block6;
                    }
                    case 1130798222: {
                        n3 = (n2 | 0x298F6BA2) ^ 0xF8B8890A;
                        continue block5;
                    }
                }
                break;
            }
            n4 ^= 0x2BED4705;
            aR2 = aR.l;
        }
        n4 ^= 0xA7E4471D;
        return gU.applyForMessages(class_25612, kl2, aR2);
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void Ie() {
        block10: {
            block8: {
                block9: {
                    break block9;
lbl1:
                    // 2 sources

                    block5: while (true) {
                        switch (var2_1) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block5;
                                }
                                break;
                            }
                            case 1275119524: {
                                var1_2 ^= var2_1 ^ 804881898;
                                break block8;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                var2_1 = (var0 | -617073212) ^ 1144832945;
                                ** continue;
                                break;
                            }
                            case 1051604494: {
                                ClientTickEvents.START_CLIENT_TICK.register((Object)(ClientTickEvents.StartTick)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_310;)V, If(net.minecraft.class_310 ), (Lnet/minecraft/class_310;)V)());
                                return;
                            }
                            case -1618920338: {
                                break block5;
                            }
                        }
                        break;
                    }
                    break block10;
                }
                var0 = iq.a & -617073212 ^ 295559003;
                var2_1 = 0;
                var1_2 = (var0 | -617073212) ^ 167488986;
                ** while (true)
            }
            var2_1 = (var0 | -617073212) ^ -451687983;
            ** GOTO lbl1
        }
        var2_1 = (var0 | -617073212) ^ -1749206917;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void If(class_310 var0) {
        block35: {
            var6_1 = 1796958974;
            var3_2 = iq.a & 1796958974 ^ 1105146779;
            var5_3 = 0;
            ** GOTO lbl52
lbl5:
            // 1 sources

            while (true) {
                var5_3 = (var3_2 | var6_1) ^ 1335126396;
                ** GOTO lbl25
lbl8:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ 1733568904;
                    ** GOTO lbl25
                    break;
                }
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                var5_3 = (var3_2 | var6_1) ^ 101395861;
                ** GOTO lbl55
                break;
            }
lbl14:
            // 1 sources

            return;
lbl16:
            // 1 sources

            while (true) {
                var4_4 ^= var5_3 ^ -1314822346;
                var5_3 = (var3_2 | var6_1) ^ 875246689;
                if (true) ** GOTO lbl55
                break;
            }
            block22: while (true) {
                var5_3 = (var3_2 | var6_1) ^ 1529909426;
                if (true) ** GOTO lbl25
                block23: while (true) {
                    var5_3 = (var3_2 | var6_1) ^ 1882903137;
lbl25:
                    // 6 sources

                    block24: while (true) {
                        switch (var5_3) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block24;
                                }
                                break;
                            }
                            case 210457207: {
                                ** continue;
                            }
                            case -1132891071: {
                                var4_4 ^= var5_3 ^ 162680938;
                                ** continue;
                            }
lbl35:
                            // 1 sources

                            while (true) {
                                var5_3 = (var3_2 | var6_1) ^ 5530684;
                                ** GOTO lbl55
                                break;
                            }
lbl38:
                            // 1 sources

                            while (true) {
                                var4_4 ^= var5_3 ^ 979276300;
                                ** GOTO lbl54
                                break;
                            }
                            case 821029709: {
                                var1_5 = mw.getInstance().getModuleByName(iq.V);
                                ** continue;
                            }
lbl44:
                            // 1 sources

                            return;
lbl46:
                            // 1 sources

                            while (true) {
                                var5_3 = (var3_2 | var6_1) ^ -2144386660;
                                ** GOTO lbl55
                                break;
                            }
lbl49:
                            // 1 sources

                            while (true) {
                                var5_3 = (var3_2 | var6_1) ^ 1115299870;
                                ** continue;
                                break;
                            }
lbl52:
                            // 1 sources

                            var4_4 = (var3_2 | var6_1) ^ -596213737;
                            ** continue;
lbl54:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ 1194846937;
lbl55:
                            // 6 sources

                            block31: while (true) {
                                switch (var5_3) {
                                    default: {
                                        continue block31;
                                    }
                                    case 1804279747: {
                                        ** continue;
                                    }
                                    case -950616368: {
                                        ** continue;
                                    }
                                    case 753439014: {
                                        ** continue;
                                    }
                                    case 468035998: {
                                        var4_4 ^= var5_3 ^ -273414562;
                                        ** continue;
                                    }
                                    case 608899715: {
                                        continue block23;
                                    }
                                    case 698702817: {
                                        if (!hJ.ok()) {
                                            break block22;
                                        }
                                        break block35;
                                    }
                                    case 1609846686: {
                                        if (var1_5 instanceof kM) {
                                            ** continue;
                                        }
                                        ** GOTO lbl86
                                    }
                                    case 1842632298: {
                                        var2_6 = (kM)var1_5;
                                        if (var2_6.isFreecamActive()) {
                                            break block31;
                                        }
                                        ** GOTO lbl86
                                    }
                                    case -336577949: {
                                        ** continue;
                                    }
                                }
                                break;
                            }
                            kM.reapplyBodyMovementFromKeys(var0);
lbl86:
                            // 3 sources

                            var5_3 = (var3_2 | var6_1) ^ -1400257233;
                            ** continue;
                            case 459126274: {
                                var4_4 ^= var5_3 ^ 1585450568;
                                continue block22;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            var5_3 = (var3_2 | var6_1) ^ -676982850;
            ** GOTO lbl25
        }
        var5_3 = (var3_2 | var6_1) ^ 1887620605;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void Ig() {
        block8: {
            break block8;
lbl1:
            // 1 sources

            block5: while (true) {
                switch (var2_1) lbl-1000:
                // 3 sources

                {
                    default: {
                        continue block5;
                    }
lbl5:
                    // 1 sources

                    while (true) {
                        var2_1 = (var0 | -723494575) ^ -1817298850;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 1251717784: {
                        ClientTickEvents.END_CLIENT_TICK.register((Object)(ClientTickEvents.EndTick)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_310;)V, Ih(net.minecraft.class_310 ), (Lnet/minecraft/class_310;)V)());
                        return;
                    }
                    case 138698386: {
                        var1_2 ^= var2_1 ^ 522930346;
                        break block5;
                    }
                    case 1313129249: {
                        var2_1 = (var0 | -723494575) ^ -709974547;
                        ** GOTO lbl-1000
                    }
                }
                break;
            }
            var2_1 = (var0 | -723494575) ^ -1754183193;
            ** while (true)
        }
        var0 = iq.a & -723494575 ^ -842352066;
        var2_1 = 0;
        var1_2 = (var0 | -723494575) ^ -465735248;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Ih(class_310 class_3102) {
        int n2 = 2051746504;
        int n3 = a & 0x7A4B2AC8 ^ 0x5C4DC5C4;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x1532E2EA;
        n4 = (n3 | n2) ^ 0xDE9F8684;
        boolean bl2 = true;
        block9: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0xE4038239;
            }
            block10: while (true) {
                switch (n4) {
                    default: {
                        continue block10;
                    }
                    case -1596954296: {
                        n4 = (n3 | n2) ^ 0x3E78AFAA;
                        continue block10;
                    }
                    case 1546107446: {
                        mn.get().tick();
                        n4 = (n3 | n2) ^ 0x4D936CF9;
                        continue block10;
                    }
                    case -1706267147: {
                        dm.tickSave();
                        n4 = (n3 | n2) ^ 0xD93CD269;
                        continue block10;
                    }
                    case -1485619803: {
                        n5 ^= n4 ^ 0xE06B9870;
                        n4 = (n3 | n2) ^ 0x226855FA;
                        continue block10;
                    }
                    case 1077362790: {
                        n5 ^= n4 ^ 0xA9F185BD;
                        continue block9;
                    }
                    case 870089525: {
                        n5 ^= n4 ^ 0x18097874;
                        n4 = (n3 | n2) ^ 0x93884D1;
                        continue block10;
                    }
                    case 2004314909: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void Ii() {
        block9: {
            block11: {
                block8: {
                    block10: {
                        break block10;
lbl1:
                        // 1 sources

                        while (true) {
                            var1_2 ^= var2_1 ^ -326917549;
                            var2_1 = (var0 | -59636056) ^ -2035243070;
                            break block8;
                            break;
                        }
                    }
                    var0 = iq.a & -59636056 ^ -786092124;
                    var2_1 = 0;
                    break block11;
lbl9:
                    // 1 sources

                    while (true) {
                        ClientLifecycleEvents.CLIENT_STOPPING.register((Object)(ClientLifecycleEvents.ClientStopping)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_310;)V, Ij(net.minecraft.class_310 ), (Lnet/minecraft/class_310;)V)());
                        return;
                    }
                }
lbl13:
                // 3 sources

                block7: while (true) {
                    switch (var2_1) {
                        default: {
                            continue block7;
                        }
                        case -576028857: {
                            ** continue;
                        }
                        case -1192546932: {
                            break block9;
                        }
                        case 2076674158: {
                            break;
                        }
                    }
                    ** continue;
                    break;
                }
            }
            var1_2 = (var0 | -59636056) ^ -1146469071;
            var2_1 = (var0 | -59636056) ^ 1167852064;
            ** GOTO lbl13
        }
        var2_1 = (var0 | -59636056) ^ 551375083;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Ij(class_310 var0) {
        var4_1 = 163380566;
        var1_2 = iq.a & 163380566 ^ -1402937484;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1556377002;
        var3_3 = (var1_2 | var4_1) ^ -1098451157;
        if (true) ** GOTO lbl12
        block28: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 38881946;
            if (true) ** GOTO lbl12
            block29: while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1206327374;
lbl12:
                // 3 sources

                block30: while (true) {
                    switch (var3_3) {
                        default: {
                            continue block30;
                        }
                        case 512246532: {
                            var2_4 ^= var3_3 ^ 2065832459;
                            var3_3 = (var1_2 | var4_1) ^ -639810622;
                            continue block30;
                        }
                        case 2019307057: {
                            ll.close();
                            var3_3 = (var1_2 | var4_1) ^ -2006097490;
                            continue block30;
                        }
                        case 326764637: {
                            var3_3 = (var1_2 | var4_1) ^ -881035767;
                            continue block30;
                        }
                        case 884596536: {
                            ca.get().shutdown();
                            var3_3 = (var1_2 | var4_1) ^ 2143186603;
                            continue block30;
                        }
                        case -332382490: {
                            jI.shutdown();
                            var3_3 = (var1_2 | var4_1) ^ 123455723;
                            continue block30;
                        }
                        case 1948368052: {
                            dm.requestSaveNow();
                            var3_3 = (var1_2 | var4_1) ^ 1960062785;
                            continue block30;
                        }
                        case 1391010328: {
                            var2_4 ^= var3_3 ^ -1390448432;
                            continue block29;
                        }
                        case 1497377152: {
                            var2_4 ^= var3_3 ^ 1155367069;
                            continue block29;
                        }
                        case -58601557: {
                            z.r.ac.shutdown();
                            var3_3 = (var1_2 | var4_1) ^ -1284195214;
                            continue block30;
                        }
                        case -367270088: {
                            var3_3 = (var1_2 | var4_1) ^ -1723522994;
                            continue block30;
                        }
                        case -727362666: {
                            var2_4 ^= var3_3 ^ -1178474737;
                            continue block28;
                        }
                        case -1110669709: {
                            var2_4 ^= var3_3 ^ 2019770650;
                            var3_3 = (var1_2 | var4_1) ^ 1103937936;
                            continue block30;
                        }
                        case -767389219: {
                            var2_4 ^= var3_3 ^ -1592644656;
                            var3_3 = (var1_2 | var4_1) ^ 981882087;
                            continue block30;
                        }
                        case -651636681: {
                            var2_4 ^= var3_3 ^ -2094805585;
                            var3_3 = (var1_2 | var4_1) ^ -1865392952;
                            continue block30;
                        }
                        case 1719699839: {
                            var2_4 ^= var3_3 ^ 954053217;
                            var3_3 = (var1_2 | var4_1) ^ -710880953;
                            continue block30;
                        }
                        case -1431881827: {
                            var2_4 ^= var3_3 ^ -1053519184;
                            var3_3 = (var1_2 | var4_1) ^ 1367159005;
                            continue block30;
                        }
                        case 630300376: {
                            var2_4 ^= var3_3 ^ -516136563;
                            var3_3 = (var1_2 | var4_1) ^ -2108314849;
                            continue block30;
                        }
                        case -1753568367: {
                            lR.get().stop();
                            var3_3 = (var1_2 | var4_1) ^ 271612165;
                            continue block30;
                        }
                        case 799626345: {
                            mn.get().shutdown();
                            var3_3 = (var1_2 | var4_1) ^ 1335812208;
                            continue block30;
                        }
                        case -496886010: {
                            continue block28;
                        }
                        case -1347570196: {
                            switch (var2_4) {
                                case -1594166655: {
                                    var3_3 = (var1_2 | var4_1) ^ 2035920096;
                                    continue block30;
                                }
                                case 1808291479: {
                                    var3_3 = (var1_2 | var4_1) ^ -15344274;
                                    continue block30;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ -188950794;
                            continue block30;
                        }
                        case 1026335678: 
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void Ik() {
        block9: {
            block10: {
                break block10;
lbl1:
                // 1 sources

                while (true) {
                    var1_2 ^= var2_1 ^ -2113042591;
                    var2_1 = (var0 | -780072028) ^ -929343134;
                    ** GOTO lbl10
                    break;
                }
lbl5:
                // 1 sources

                while (true) {
                    ClientPlayConnectionEvents.DISCONNECT.register((Object)(ClientPlayConnectionEvents.Disconnect)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_634;Lnet/minecraft/class_310;)V, Il(net.minecraft.class_634 net.minecraft.class_310 ), (Lnet/minecraft/class_634;Lnet/minecraft/class_310;)V)());
                    return;
                }
lbl8:
                // 1 sources

                while (true) {
                    var2_1 = (var0 | -780072028) ^ 1591049984;
lbl10:
                    // 3 sources

                    block8: while (true) {
                        switch (var2_1) {
                            default: {
                                continue block8;
                            }
                            case -1033134632: {
                                ** continue;
                            }
                            case -1926352642: {
                                break block9;
                            }
                            case 459282076: {
                                break;
                            }
                        }
                        ** continue;
                        break;
                    }
                    break;
                }
            }
            var0 = iq.a & -780072028 ^ -746895362;
            var2_1 = 0;
            var1_2 = (var0 | -780072028) ^ -1784511598;
            ** while (true)
        }
        var2_1 = (var0 | -780072028) ^ 294703654;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Il(class_634 class_6342, class_310 class_3102) {
        int n2 = -1547815851;
        int n3 = a & 0xA3BE3455 ^ 0xCE20F313;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x7CD9E952;
        n4 = (n3 | n2) ^ 0x7F1984CE;
        boolean bl2 = true;
        block9: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0x2AECAF33;
            }
            block10: while (true) {
                switch (n4) {
                    default: {
                        continue block10;
                    }
                    case -79113625: {
                        n5 ^= n4 ^ 0x2D19960F;
                        n4 = (n3 | n2) ^ 0x4410E127;
                        continue block10;
                    }
                    case -1441378278: {
                        n5 ^= n4 ^ 0x984562B3;
                        n4 = (n3 | n2) ^ 0x7F00F23C;
                        continue block10;
                    }
                    case -984459164: {
                        bd.clear();
                        n4 = (n3 | n2) ^ 0x14F62530;
                        continue block10;
                    }
                    case -1414654352: {
                        dm.requestSaveNow();
                        n4 = (n3 | n2) ^ 0x45A8A74D;
                        continue block10;
                    }
                    case -611114845: {
                        n5 ^= n4 ^ 0xC0E49AB0;
                        continue block9;
                    }
                    case -1868074087: {
                        n4 = (n3 | n2) ^ 0x342DD7F4;
                        continue block10;
                    }
                    case -1866594965: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void Im() {
        var0 = iq.a & 1422229413 ^ 1926934328;
        var2_1 = 0;
        if (true) ** GOTO lbl19
        block5: while (true) {
            var2_1 = (var0 | 1422229413) ^ -187890056;
            block6: while (true) {
                switch (var2_1) lbl-1000:
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
                        var2_1 = (var0 | 1422229413) ^ -632598997;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 1604757503: {
                        continue block5;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var2_1 = (var0 | 1422229413) ^ 695818306;
                        ** continue;
                        break;
                    }
lbl19:
                    // 1 sources

                    var1_2 = (var0 | 1422229413) ^ 157319253;
                    ** continue;
                    case -2112685627: {
                        var1_2 ^= var2_1 ^ -785692887;
                        ** continue;
                    }
                    case -1399541354: 
                }
                break;
            }
            break;
        }
        ClientLifecycleEvents.CLIENT_STARTED.register((Object)(ClientLifecycleEvents.ClientStarted)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_310;)V, In(net.minecraft.class_310 ), (Lnet/minecraft/class_310;)V)());
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void In(class_310 class_3102) {
        int n2 = a & 0xB498CC76 ^ 0xB7364D91;
        int n3 = 0;
        int n4 = (n2 | 0xB498CC76) ^ 0xBF5F0983;
        n3 = (n2 | 0xB498CC76) ^ 0xF3FDAAD3;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1449840237: {
                    z.r.ac.request(class_3102.method_1548().method_1676());
                    return;
                }
                case -1503634321: {
                    n4 ^= n3 ^ 0xE35403A4;
                    n3 = (n2 | 0xB498CC76) ^ 0x1E2BFC64;
                    continue block5;
                }
                case 1145268004: 
            }
            n3 = (n2 | 0xB498CC76) ^ 0x11DE9198;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Io() {
        int n2 = a & 0x6C7E2A7B ^ 0xCC3C4C4;
        int n3 = 0;
        int n4 = (n2 | 0x6C7E2A7B) ^ 0x7F3FB693;
        n3 = (n2 | 0x6C7E2A7B) ^ 0x79381A1D;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 478666593: {
                    lR.get().start();
                    return;
                }
                case 365425890: {
                    n3 = (n2 | 0x6C7E2A7B) ^ 0x9ADF4220;
                    continue block5;
                }
                case -165630753: 
            }
            n4 ^= n3 ^ 0xA0C20C1B;
            n3 = (n2 | 0x6C7E2A7B) ^ 0x7078319E;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Ip() {
        int n2 = a & 0x66C19654 ^ 0x52287FA6;
        int n3 = 0;
        int n4 = (n2 | 0x66C19654) ^ 0x32440CA8;
        n3 = (n2 | 0x66C19654) ^ 0xA8CF9A6C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -843180892: {
                    n4 ^= n3 ^ 0x5C1D9C14;
                    n3 = (n2 | 0x66C19654) ^ 0x827A0181;
                    continue block5;
                }
                case -567908966: {
                    n3 = (n2 | 0x66C19654) ^ 0xBB57EB52;
                    continue block5;
                }
                case -191627657: 
            }
            break;
        }
        ca.get().start();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Iq() {
        int n2 = a & 0xAD1A14C2 ^ 0x86B213CB;
        int n3 = 0;
        int n4 = (n2 | 0xAD1A14C2) ^ 0x89DE7E7D;
        n3 = (n2 | 0xAD1A14C2) ^ 0x8CD8DB2D;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1196800184: {
                    n4 ^= n3 ^ 0x710F5961;
                    n3 = (n2 | 0xAD1A14C2) ^ 0x4D64DD99;
                    continue block5;
                }
                case 593677542: {
                    n3 = (n2 | 0xAD1A14C2) ^ 0xE8EFAF73;
                    continue block5;
                }
                case -488715694: 
            }
            break;
        }
        mn.get().start(class_310.method_1551().method_1548().method_1676());
    }

    private static /* synthetic */ void Ir() {
        int n2 = a & 0x3E52C656 ^ 0x5875408F;
        int n3 = 0;
        int n4 = (n2 | 0x3E52C656) ^ 0xC8379C29;
        n3 = (n2 | 0x3E52C656) ^ 0x5318F859;
        block5: while (true) {
            block6: {
                switch (n3) {
                    default: {
                        continue block5;
                    }
                    case 762265222: {
                        break;
                    }
                    case 1604439524: {
                        n4 ^= n3 ^ 0xEB60FA62;
                        break block6;
                    }
                    case 641356202: {
                        ClientPlayConnectionEvents.JOIN.register(iq::It);
                        return;
                    }
                }
                n3 = (n2 | 0x3E52C656) ^ 0x21D60B3B;
                continue;
            }
            n3 = (n2 | 0x3E52C656) ^ 0x584D9775;
        }
    }

    private static int Is(int n2, int n3) {
        int n4 = -653995459;
        int n5 = 1350284213;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xF80A3CE1)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xD97F4918;
        n6 -= (n5 | n4) ^ 0xD97F300D;
        n6 += (n5 | n4) ^ 0xD97FF3D0;
        n6 -= (n5 | n4) ^ 0xD97F59D3;
        n6 ^= (n5 | n4) ^ 0xD97FB653;
        n6 ^= (n5 | n4) ^ 0xD97F402E;
        n6 ^= (n5 | n4) ^ 0xD97FB671;
        return n6 -= (n5 | n4) ^ 0xD97FAF72;
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void It(class_634 var0, PacketSender var1_1, class_310 var2_2) {
        var6_3 = 1053338999;
        var3_4 = iq.a & 1053338999 ^ -1832024609;
        var5_5 = 0;
        ** GOTO lbl74
lbl5:
        // 1 sources

        while (true) {
            z.r.q.onJoin(var2_2);
            ** GOTO lbl76
            break;
        }
lbl8:
        // 1 sources

        while (true) {
            var4_6 ^= var5_5 ^ 727204658;
            ** GOTO lbl54
            break;
        }
lbl11:
        // 1 sources

        while (true) {
            var5_5 = (var3_4 | var6_3) ^ -1181710199;
            ** GOTO lbl36
lbl14:
            // 1 sources

            while (true) {
                var5_5 = (var3_4 | var6_3) ^ -1963656205;
                ** GOTO lbl36
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                var5_5 = (var3_4 | var6_3) ^ 1252528720;
                ** GOTO lbl36
lbl20:
                // 1 sources

                block32: while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 1530811836;
                    ** GOTO lbl36
lbl23:
                    // 1 sources

                    while (true) {
                        var4_6 ^= var5_5 ^ -1863859786;
                        continue block32;
                        break;
                    }
lbl26:
                    // 1 sources

                    return;
                }
                break;
            }
            break;
        }
lbl28:
        // 1 sources

        while (true) {
            var5_5 = (var3_4 | var6_3) ^ -1011621936;
            if (true) ** GOTO lbl36
            break;
        }
        block36: while (true) {
            var5_5 = (var3_4 | var6_3) ^ -2105734269;
            if (true) ** GOTO lbl36
            block37: while (true) {
                var5_5 = (var3_4 | var6_3) ^ -2009569350;
lbl36:
                // 8 sources

                block38: while (true) {
                    switch (var5_5) lbl-1000:
                    // 10 sources

                    {
                        while (true) {
                            default: {
                                continue block38;
                            }
                            break;
                        }
                        case 922077765: {
                            ** continue;
                        }
                        case 123544950: {
                            ** continue;
                        }
                        case -575247321: {
                            ** continue;
                        }
                        case -930241288: {
                            ** continue;
                        }
                        case 1119804634: {
                            ** continue;
                        }
                        case -1827168089: {
                            continue block37;
                        }
                        ** case -194658385:
lbl54:
                        // 2 sources

                        var5_5 = (var3_4 | var6_3) ^ 494752714;
                        ** GOTO lbl-1000
lbl56:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 1964159632;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 1018209916: {
                            var4_6 ^= var5_5 ^ 991901743;
                            ** GOTO lbl78
                        }
lbl62:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 1669054936;
                            ** GOTO lbl-1000
                            break;
                        }
lbl65:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ -59543259;
                            ** GOTO lbl-1000
                            break;
                        }
lbl68:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 106783026;
                            ** GOTO lbl-1000
                            break;
                        }
lbl71:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 1983908103;
                            ** GOTO lbl-1000
                            break;
                        }
lbl74:
                        // 1 sources

                        var4_6 = (var3_4 | var6_3) ^ -2119754733;
                        ** continue;
lbl76:
                        // 1 sources

                        var5_5 = (var3_4 | var6_3) ^ 1422338246;
                        ** GOTO lbl-1000
lbl78:
                        // 2 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 769264984;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 2105438767: {
                            var4_6 ^= var5_5 ^ -646910815;
                            ** continue;
                        }
                        case -874569873: {
                            hJ.onWorldJoin();
                            ** continue;
                        }
lbl87:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ -1839364942;
                            ** continue;
                            break;
                        }
                        case 876172812: {
                            ** continue;
                        }
                        case -1198469939: {
                            var4_6 ^= var5_5 ^ 1139014851;
                            break block36;
                        }
                        case 416881482: {
                            ** continue;
                        }
                        case -1548681675: {
                            switch (var4_6) {
                                default: {
                                    ** continue;
                                }
                                case -1004961310: {
                                    ** continue;
                                }
                                ** case -635760899:
lbl104:
                                // 1 sources

                                continue block36;
                            }
                        }
                        case -436996029: {
                            switch (var4_6) {
                                case 1063956972: {
                                    ** continue;
                                }
                                default: {
                                    ** continue;
                                }
                                ** case -388627336:
lbl112:
                                // 1 sources

                                ** continue;
                            }
                        }
                        case -368409287: {
                            var4_6 ^= var5_5 ^ 784899150;
                            ** continue;
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
lbl116:
        // 2 sources

        while (true) {
            var5_5 = (var3_4 | var6_3) ^ -1508591947;
            ** continue;
            break;
        }
        {
            ** case 747645261:
        }
lbl120:
        // 1 sources

        var4_6 ^= var5_5 ^ -1937334934;
        ** while (true)
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void Iu() {
        var4 = 156732482;
        var1_1 = iq.a & 156732482 ^ 1968627388;
        var3_2 = 0;
        var2_3 = (var1_1 | var4) ^ 936093531;
        var3_2 = (var1_1 | var4) ^ -1462669456;
        ** GOTO lbl55
lbl-1000:
        // 1 sources

        {
            block26: {
                block27: {
                    while (true) {
                        var3_2 = (var1_1 | var4) ^ 1852778263;
                        break block26;
                        break;
                    }
lbl10:
                    // 2 sources

                    while (true) {
                        switch (var2_3) {
                            case 189926329: {
                                var3_2 = (var1_1 | var4) ^ -904329897;
                                break;
                            }
                            case 2108279595: {
                                var3_2 = (var1_1 | var4) ^ 1171782835;
                                break;
                            }
                            default: {
                                var3_2 = (var1_1 | var4) ^ 110052252;
                                break;
                            }
                        }
                        break block27;
                        break;
                    }
lbl22:
                    // 2 sources

                    while (true) {
                        var3_2 = (var1_1 | var4) ^ -516672814;
                        break block27;
                        break;
                    }
lbl-1000:
                    // 1 sources

                    {
                        while (true) {
                            var2_3 ^= 145560607;
                            return;
                        }
                    }
                }
lbl29:
                // 2 sources

                block24: while (true) {
                    switch (var3_2) {
                        default: {
                            continue block24;
                        }
                        case 1807664672: {
                            var2_3 ^= var3_2 ^ -515912490;
                            var3_2 = (var1_1 | var4) ^ -729820052;
                            continue block24;
                        }
                        case -1456993646: {
                            var0_4.getMethod(iq.O, new Class[0]).invoke(null, new Object[0]);
                            ** GOTO lbl10
                        }
                        case -1219568727: {
                            var2_3 ^= var3_2 ^ 653218107;
                            ** continue;
                        }
                        case 947921485: {
                            var2_3 ^= var3_2 ^ 1417537633;
                            ** GOTO lbl22
                        }
                        case 2077793634: {
                            var2_3 ^= var3_2 ^ -101439812;
                            ** continue;
                        }
                        case -1671173076: {
                            var3_2 = (var1_1 | var4) ^ -1494937848;
                            continue block24;
                        }
                        case -609037834: 
                    }
                    ** continue;
                    break;
                }
            }
            block25: while (true) {
                switch (var3_2) {
                    default: {
                        continue block25;
                    }
                    case -712593010: {
                        ** continue;
                    }
                    case 322501097: {
                        var2_3 ^= var3_2 ^ -1626799556;
                        var3_2 = (var1_1 | var4) ^ 494149674;
                        continue block25;
                    }
                    case 1612971732: 
                }
                break;
            }
            var0_4 = Class.forName(iq.N);
            var3_2 = (var1_1 | var4) ^ 384375006;
            ** continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void Iv() {
        block8: {
            block9: {
                break block9;
lbl1:
                // 1 sources

                while (true) {
                    var2_1 = (var0 | -1862613538) ^ 1573596768;
                    break block8;
                    break;
                }
            }
            var0 = iq.a & -1862613538 ^ -1349448081;
            var2_1 = 0;
            var1_2 = (var0 | -1862613538) ^ -1553154676;
            ** GOTO lbl17
        }
lbl10:
        // 2 sources

        block6: while (true) {
            switch (var2_1) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block6;
                    }
                    break;
                }
                case -1378948477: {
                    break block6;
                }
lbl17:
                // 1 sources

                var2_1 = (var0 | -1862613538) ^ 305472892;
                ** continue;
                case 444725073: {
                    var1_2 ^= var2_1 ^ -1788123226;
                    ** continue;
                }
            }
            break;
        }
        var2_1 = (var0 | -1862613538) ^ -1518716754;
        ** while (true)
        {
            ** case -500112993:
        }
lbl25:
        // 1 sources

        ClientTickEvents.START_CLIENT_TICK.register((Object)(ClientTickEvents.StartTick)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_310;)V, Iw(net.minecraft.class_310 ), (Lnet/minecraft/class_310;)V)());
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void Iw(class_310 var0) {
        block37: {
            block30: {
                block35: {
                    block32: {
                        block36: {
                            block34: {
                                block31: {
                                    block33: {
                                        break block37;
lbl1:
                                        // 1 sources

                                        while (var1_4 instanceof aW) {
                                            break block30;
                                        }
                                        break block32;
lbl4:
                                        // 1 sources

                                        while (true) {
                                            var5_3 = (var3_2 | var6_1) ^ -136187691;
                                            break block31;
                                            break;
                                        }
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var2_5 = (aW)var1_4;
                                            if (!var2_5.isEnabled()) break block32;
                                            break block33;
                                            break;
                                        }
lbl11:
                                        // 1 sources

                                        while (true) {
                                            var1_4 = mw.getInstance().getModuleByName(iq.S);
                                            var5_3 = (var3_2 | var6_1) ^ 807271569;
                                            break block31;
                                            break;
                                        }
lbl15:
                                        // 1 sources

                                        return;
lbl17:
                                        // 1 sources

                                        while (true) {
                                            var5_3 = (var3_2 | var6_1) ^ -844055858;
                                            break block31;
lbl20:
                                            // 1 sources

                                            while (true) {
                                                var5_3 = (var3_2 | var6_1) ^ -1382611657;
                                                break block31;
                                                break;
                                            }
                                            break;
                                        }
lbl23:
                                        // 2 sources

                                        block22: while (true) {
                                            switch (var5_3) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    default: {
                                                        continue block22;
                                                    }
                                                    break;
                                                }
                                                case 334177950: {
                                                    ** continue;
                                                }
lbl30:
                                                // 1 sources

                                                while (true) {
                                                    var5_3 = (var3_2 | var6_1) ^ 1491314610;
                                                    ** continue;
                                                    break;
                                                }
                                                case 74249159: {
                                                    var4_6 ^= var5_3 ^ -271082169;
                                                    break block34;
                                                }
                                                case -1600322451: {
                                                    break block35;
                                                }
                                            }
                                            break;
                                        }
lbl38:
                                        // 1 sources

                                        while (true) {
                                            var4_6 ^= var5_3 ^ 1185915903;
                                            ** continue;
                                            break;
                                        }
lbl41:
                                        // 1 sources

                                        while (true) {
                                            var5_3 = (var3_2 | var6_1) ^ -1282658915;
                                            break block31;
                                            break;
                                        }
lbl44:
                                        // 1 sources

                                        while (hJ.ok()) {
                                            break block36;
lbl46:
                                            // 1 sources

                                            while (true) {
                                                var4_6 ^= var5_3 ^ 1366606907;
                                                ** continue;
                                                break;
                                            }
lbl49:
                                            // 1 sources

                                            ** GOTO lbl41
                                        }
                                        break block32;
                                    }
                                    var2_5.onPreMovementTick(var0);
                                    break block32;
                                }
lbl55:
                                // 4 sources

                                block29: while (true) {
                                    switch (var5_3) {
                                        default: {
                                            continue block29;
                                        }
                                        case 902699281: {
                                            ** GOTO lbl1
                                        }
                                        case 1441375976: {
                                            ** continue;
                                        }
                                        case 1274187330: {
                                            ** continue;
                                        }
                                        case -933011634: {
                                            ** continue;
                                        }
                                        case 262099722: {
                                            ** GOTO lbl44
                                        }
                                        case -1191475335: {
                                            ** continue;
                                        }
                                        case -1065820302: {
                                            ** continue;
                                        }
                                        case -1272552520: {
                                            ** continue;
                                        }
                                    }
                                    break;
                                }
                            }
                            var5_3 = (var3_2 | var6_1) ^ -342522559;
                            ** GOTO lbl23
                        }
                        var5_3 = (var3_2 | var6_1) ^ 1280884839;
                        ** GOTO lbl55
                    }
                    var5_3 = (var3_2 | var6_1) ^ 939949229;
                    ** GOTO lbl55
                }
                var5_3 = (var3_2 | var6_1) ^ -65908712;
                ** while (true)
            }
            var5_3 = (var3_2 | var6_1) ^ 1082467494;
            ** while (true)
        }
        var6_1 = -128048421;
        var3_2 = iq.a & -128048421 ^ 1618772884;
        var5_3 = 0;
        var4_6 = (var3_2 | var6_1) ^ -1027104643;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Ix() {
        int n2 = a & 0x3905F42B ^ 0x9120398;
        int n3 = 0;
        int n4 = (n2 | 0x3905F42B) ^ 0x14D389E3;
        n3 = (n2 | 0x3905F42B) ^ 0xD262EB08;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1196878491: {
                    n4 ^= n3 ^ 0x5029DC36;
                    n3 = (n2 | 0x3905F42B) ^ 0x730444EE;
                    continue block5;
                }
                case 1242805077: {
                    ClientTickEvents.START_CLIENT_TICK.register(iq::Iy);
                    return;
                }
                case -344646477: 
            }
            n3 = (n2 | 0x3905F42B) ^ 0x7E411D20;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Iy(class_310 var0) {
        var6_1 = 1801191440;
        var3_2 = iq.a & 1801191440 ^ -585504111;
        var5_3 = 0;
        var4_6 = (var3_2 | var6_1) ^ -1495569717;
        var5_3 = (var3_2 | var6_1) ^ 2077883071;
        if (true) ** GOTO lbl38
        {
            var5_3 = (var3_2 | var6_1) ^ 875638650;
lbl8:
            // 2 sources

            block18: while (true) {
                switch (var5_3) {
                    case -841980600: {
                        var4_6 ^= var5_3 ^ 229932577;
                        ** break;
                    }
                    case 583757942: {
                        if (var1_4 instanceof ak) {
                            continue block17;
                        }
                        ** GOTO lbl30
                    }
                    case -1699926154: {
                        var2_5 = (ak)var1_4;
                        if (!var2_5.isEnabled()) ** GOTO lbl30
                        ** GOTO lbl29
                    }
                    case -882063893: {
                        var5_3 = (var3_2 | var6_1) ^ 1710278119;
                    }
                    default: {
                        continue block18;
                    }
lbl25:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ 152199454;
                    continue block18;
                    case -162559089: {
                        return;
                    }
lbl29:
                    // 1 sources

                    var2_5.onStartTick(var0);
lbl30:
                    // 3 sources

                    var5_3 = (var3_2 | var6_1) ^ 848138201;
                    continue block18;
                    case 1417053339: 
                }
                var4_6 ^= var5_3 ^ 1035336987;
                var5_3 = (var3_2 | var6_1) ^ -577332505;
                continue;
                break;
            }
        }
        block19: while (true) {
            var5_3 = (var3_2 | var6_1) ^ 374309040;
lbl38:
            // 2 sources

            block20: while (true) {
                switch (var5_3) {
                    case -384669151: {
                        var4_6 ^= var5_3 ^ -1772762259;
                        ** break;
                    }
                    case 1212539763: {
                        return;
                    }
                    case 221746800: {
                        var4_6 ^= var5_3 ^ 656064242;
                        var5_3 = (var3_2 | var6_1) ^ -1031394283;
                        continue block20;
                    }
                    case -2071719890: {
                        ** GOTO lbl58
                    }
                    case 873373581: {
                        var1_4 = mw.getInstance().getModuleByName(iq.ae);
                        var5_3 = (var3_2 | var6_1) ^ -1423217142;
                        ** continue;
                    }
lbl55:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ -1223161374;
                    default: {
                        continue block20;
                    }
lbl58:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ -227902239;
                    continue block20;
                    case 397724861: {
                        var4_6 ^= var5_3 ^ 312092311;
                        var5_3 = (var3_2 | var6_1) ^ -883722980;
                        continue block20;
                    }
                    case 1037813380: 
                }
                if (!hJ.ok()) continue block19;
                var5_3 = (var3_2 | var6_1) ^ -387373524;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void Iz() {
        var0 = iq.a & 485612056 ^ 1452391040;
        var2_1 = 0;
        ** GOTO lbl19
lbl4:
        // 1 sources

        while (true) {
            var1_2 ^= var2_1 ^ 981562054;
            if (true) ** GOTO lbl14
            break;
        }
        block6: while (true) {
            switch (var2_1) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block6;
                    }
                    break;
                }
                case 201695932: {
                    ** continue;
                }
lbl14:
                // 1 sources

                var2_1 = (var0 | 485612056) ^ -88283693;
                ** GOTO lbl-1000
lbl16:
                // 1 sources

                while (true) {
                    var2_1 = (var0 | 485612056) ^ 1391745060;
                    ** GOTO lbl-1000
                    break;
                }
lbl19:
                // 1 sources

                var1_2 = (var0 | 485612056) ^ 2092098560;
                var2_1 = (var0 | 485612056) ^ 1179175948;
                ** continue;
                case 414791316: {
                    ** continue;
                }
                case -1538449589: 
            }
            break;
        }
        ClientTickEvents.START_CLIENT_TICK.register((Object)(ClientTickEvents.StartTick)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_310;)V, IA(net.minecraft.class_310 ), (Lnet/minecraft/class_310;)V)());
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void IA(class_310 var0) {
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
    private static /* synthetic */ void IB() {
        int n2 = a & 0x28E5B12C ^ 0x1EADAC69;
        int n3 = 0;
        int n4 = (n2 | 0x28E5B12C) ^ 0x21AD51FD;
        n3 = (n2 | 0x28E5B12C) ^ 0xDA6BDEE;
        block5: while (true) {
            switch (n3) {
                case -1698596046: {
                    n4 ^= n3 ^ 0x163A163E;
                    n3 = (n2 | 0x28E5B12C) ^ 0xA1E499A;
                }
                default: {
                    continue block5;
                }
                case 888403191: {
                    mw.getInstance().init();
                    return;
                }
                case 860553347: 
            }
            n3 = (n2 | 0x28E5B12C) ^ 0xA42CC65F;
        }
    }
}

