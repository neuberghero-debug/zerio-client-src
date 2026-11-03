/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents$EndMain
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_9779
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_9779;
import z.r.cS;
import z.r.cV;
import z.r.eN;
import z.r.hJ;
import z.r.ki;
import z.r.mA;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class bJ {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), -866091035);
    private static final List<cS> a;
    private static boolean a;

    /*
     * Enabled aggressive block sorting
     */
    private bJ() {
        int n2 = a & 0x4326E140 ^ 0xECED48F;
        int n3 = (n2 | 0x4326E140) ^ 0x7FC0168;
        n3 ^= 0x5252D2E8;
        n3 ^= 0x60FCDC36;
    }

    /*
     * Unable to fully structure code
     */
    public static void add(cS var0) {
        block13: {
            var4_1 = 1584597567;
            var1_2 = bJ.a & 1584597567 ^ 205269069;
            var3_3 = 0;
            ** GOTO lbl33
lbl5:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 234932025;
                break block13;
                break;
            }
lbl8:
            // 1 sources

            while (true) {
                bJ.a.add(var0);
                ** continue;
                break;
            }
        }
lbl13:
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
                case -1251590917: {
                    ** continue;
                }
                case -1752500722: {
                    break block9;
                }
lbl22:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -906634127;
                    ** GOTO lbl-1000
                    break;
                }
                case 1350561094: {
                    var2_4 ^= var3_3 ^ -112567543;
                    ** GOTO lbl31
                }
lbl28:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -350677372;
                    ** GOTO lbl-1000
                    break;
                }
lbl31:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 1293523451;
                ** continue;
lbl33:
                // 1 sources

                var2_4 = (var1_2 | var4_1) ^ 1712755018;
                ** continue;
                case -990443512: {
                    var2_4 ^= var3_3 ^ -884177001;
                    ** continue;
                }
                case 325497732: {
                    return;
                }
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ -1702354313;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static List<cS> modules() {
        int n2 = a & 0x9410233B ^ 0xD5FEDDDA;
        int n3 = 0;
        int n4 = (n2 | 0x9410233B) ^ 0x265A6541;
        n3 = (n2 | 0x9410233B) ^ 0xBAED0A2E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -115885935: {
                    n4 ^= n3 ^ 0x7CC79698;
                    n3 = (n2 | 0x9410233B) ^ 0x398F81F4;
                    continue block5;
                }
                case 1863579093: {
                    break;
                }
                case -328106481: {
                    return a;
                }
            }
            n3 = (n2 | 0x9410233B) ^ 0x2CE9476A;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void install() {
        block40: {
            block41: {
                block37: {
                    block42: {
                        block35: {
                            block36: {
                                block39: {
                                    block38: {
                                        break block42;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            if (!bJ.a) break block35;
                                            break block36;
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            var2_2 = (var0_1 | var3) ^ -308795533;
                                            break block37;
                                            break;
                                        }
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var2_2 = (var0_1 | var3) ^ 889922973;
                                            break block37;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        while (true) {
                                            var1_3 ^= 545060520;
                                            break block38;
                                            break;
                                        }
lbl13:
                                        // 1 sources

                                        while (true) {
                                            var2_2 = (var0_1 | var3) ^ -296438226;
                                            break block37;
                                            break;
                                        }
lbl16:
                                        // 1 sources

                                        while (true) {
                                            var2_2 = (var0_1 | var3) ^ 978868644;
                                            break block37;
lbl19:
                                            // 1 sources

                                            while (true) {
                                                var1_3 ^= var2_2 ^ 239758792;
                                                break block39;
                                                break;
                                            }
lbl22:
                                            // 1 sources

                                            while (true) {
                                                var1_3 ^= var2_2 ^ -1282230414;
                                                ** continue;
                                                break;
                                            }
lbl25:
                                            // 1 sources

                                            while (true) {
                                                var2_2 = (var0_1 | var3) ^ -1374564355;
                                                break block37;
                                                break;
                                            }
lbl28:
                                            // 1 sources

                                            while (true) {
                                                var2_2 = (var0_1 | var3) ^ -862446087;
                                                break block37;
                                                break;
                                            }
lbl31:
                                            // 1 sources

                                            while (true) {
                                                var1_3 ^= var2_2 ^ -1127268694;
                                                ** continue;
                                                break;
                                            }
lbl34:
                                            // 1 sources

                                            return;
                                        }
lbl36:
                                        // 1 sources

                                        while (true) {
                                            var1_3 ^= var2_2 ^ -983094157;
                                            ** continue;
                                            break;
                                        }
lbl39:
                                        // 1 sources

                                        while (true) {
                                            var1_3 ^= -1938311561;
                                            break block40;
                                            break;
                                        }
                                    }
                                    WorldRenderEvents.END_MAIN.register((Object)(WorldRenderEvents.EndMain)LambdaMetafactory.metafactory(null, null, null, (Lnet/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext;)V, rK(net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext ), (Lnet/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext;)V)());
                                    var2_2 = (var0_1 | var3) ^ 1502542308;
                                    break block37;
                                }
                                var2_2 = (var0_1 | var3) ^ -919144418;
                                break block37;
lbl49:
                                // 1 sources

                                while (true) {
                                    var1_3 ^= var2_2 ^ 324168581;
                                    break block41;
                                    break;
                                }
                            }
                            var2_2 = (var0_1 | var3) ^ -647814093;
                            break block37;
lbl55:
                            // 1 sources

                            return;
lbl57:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ 812758895;
                                break block37;
                                break;
                            }
lbl60:
                            // 1 sources

                            while (true) {
                                var1_3 ^= var2_2 ^ 785469125;
                                ** continue;
                                break;
                            }
                        }
                        var2_2 = (var0_1 | var3) ^ 326124642;
                        break block37;
lbl66:
                        // 1 sources

                        while (true) {
                            bJ.a = true;
                            ** continue;
                            break;
                        }
                    }
                    var3 = -2047504432;
                    var0_1 = bJ.a & -2047504432 ^ 967441947;
                    var2_2 = 0;
                    var1_3 = (var0_1 | var3) ^ 1668145786;
                    ** while (true)
                }
lbl76:
                // 3 sources

                block34: while (true) {
                    switch (var2_2) {
                        default: {
                            continue block34;
                        }
                        case 1902502434: {
                            ** continue;
                        }
                        case 1688132584: {
                            ** continue;
                        }
                        case -462223809: {
                            ** continue;
                        }
                        case -640176427: {
                            ** continue;
                        }
                        case -1366443079: {
                            ** continue;
                        }
                        case 1959462853: {
                            ** continue;
                        }
                        case -2019187073: {
                            ** continue;
                        }
                        case -1997088186: {
                            ** continue;
                        }
                        case 334245926: {
                            ** continue;
                        }
                        case 1348851880: {
                            ** continue;
                        }
                        case -1304282996: {
                            ** continue;
                        }
                        case 1403603445: {
                            ** continue;
                        }
                        case -1920186188: 
                    }
                    ** continue;
                    break;
                }
            }
            var2_2 = (var0_1 | var3) ^ 1680494862;
            ** GOTO lbl76
        }
        HudRenderCallback.EVENT.register((Object)(HudRenderCallback)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V, rM(net.minecraft.class_332 net.minecraft.class_9779 ), (Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V)());
        var2_2 = (var0_1 | var3) ^ 264226647;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static void rJ(class_332 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [50[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static void rK(WorldRenderContext var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [54[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    public static void onClientTick() {
        block12: {
            block11: {
                break block12;
lbl1:
                // 4 sources

                block7: while (true) {
                    switch (var2_2) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block7;
                            }
                            break;
                        }
                        case -526268185: {
                            return;
                        }
                        case -525521712: {
                            var1_3 ^= var2_2 ^ -853290957;
                            break block7;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            var2_2 = (var0_1 | var3) ^ 1089484104;
                            ** continue;
                            break;
                        }
                        case -1256207691: {
                            var1_3 ^= var2_2 ^ -927677527;
                            break block11;
                        }
                    }
                    break;
                }
                var2_2 = (var0_1 | var3) ^ 97237975;
                ** GOTO lbl1
lbl19:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ 356700973;
                    ** GOTO lbl1
                    break;
                }
            }
            var2_2 = (var0_1 | var3) ^ 357447450;
            ** GOTO lbl1
        }
        var3 = 1160337821;
        var0_1 = bJ.a & 1160337821 ^ -1310216480;
        var2_2 = 0;
        var1_3 = (var0_1 | var3) ^ -2098077354;
        var2_2 = (var0_1 | var3) ^ -838647910;
        ** while (true)
        {
            case -266058710: {
                bJ.rL(class_310.method_1551());
                ** continue;
            }
            ** case 1005371495:
        }
lbl36:
        // 1 sources

        ** while (true)
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void rL(class_310 var0) {
        var10_1 = 1180322457;
        var7_2 = bJ.a & 1180322457 ^ 1850086693;
        var9_3 = 0;
        var8_4 = (var7_2 | var10_1) ^ 705295270;
        var9_3 = (var7_2 | var10_1) ^ 1182583325;
        block60: while (true) {
            switch (var9_3) {
                default: {
                    continue block60;
                }
                case 673355168: {
                    var9_3 = (var7_2 | var10_1) ^ 1958516155;
                    continue block60;
                }
                case 451070470: {
                    var8_4 ^= var9_3 ^ -1756688223;
                    var9_3 = (var7_2 | var10_1) ^ -1320251656;
                    continue block60;
                }
                case -552545979: {
                    if (var0.field_1724 != null) {
                        var9_3 = (var7_2 | var10_1) ^ -2098907962;
                        continue block60;
                    }
                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ -1883564653;
                        continue block60;
                        break;
                    }
                }
                case -323261573: {
                    var9_3 = (var7_2 | var10_1) ^ -1426843329;
                    continue block60;
                }
                case -995473790: {
                    if (var0.field_1687 == null) ** continue;
                    var9_3 = (var7_2 | var10_1) ^ 331477076;
                    continue block60;
                }
                case -505066962: {
                    var8_4 ^= var9_3 ^ -1283704971;
                    var9_3 = (var7_2 | var10_1) ^ 1980359333;
                    continue block60;
                }
                case 408403224: {
                    ki.a.reset();
                    var9_3 = (var7_2 | var10_1) ^ 1765466651;
                    continue block60;
                }
                case 124042662: {
                    var8_4 ^= var9_3 ^ -546712388;
                    var9_3 = (var7_2 | var10_1) ^ 1175569420;
                    continue block60;
                }
                case 676305841: {
                    return;
                }
                case 2107617257: {
                    var8_4 ^= var9_3 ^ -976409093;
                    var9_3 = (var7_2 | var10_1) ^ -1485685783;
                    continue block60;
                }
                case -919837612: {
                    if (!hJ.ok()) {
                        var9_3 = (var7_2 | var10_1) ^ 1653750400;
                        continue block60;
                    }
                    var9_3 = (var7_2 | var10_1) ^ -1252601830;
                    continue block60;
                }
                case 214721853: {
                    var8_4 ^= var9_3 ^ 1999974111;
                    var9_3 = (var7_2 | var10_1) ^ -1198812676;
                    continue block60;
                }
                case -690631103: {
                    return;
                }
                case -620195929: {
                    var8_4 ^= var9_3 ^ -1002464597;
                    var9_3 = (var7_2 | var10_1) ^ -369108504;
                    continue block60;
                }
                case -2019457451: {
                    if (!var0.field_1724.method_29504()) {
                        var9_3 = (var7_2 | var10_1) ^ 1533646959;
                        continue block60;
                    }
                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ -1253023620;
                        continue block60;
                        break;
                    }
                }
                case 892848082: {
                    var9_3 = (var7_2 | var10_1) ^ 2109815054;
                    continue block60;
                }
                case 329213619: {
                    if (var0.field_1724.method_7325()) ** continue;
                    var9_3 = (var7_2 | var10_1) ^ 734685521;
                    continue block60;
                }
                case -619823167: {
                    var8_4 ^= var9_3 ^ 578117184;
                    var9_3 = (var7_2 | var10_1) ^ 729061233;
                    continue block60;
                }
                case 1160431820: {
                    ki.a.beginTick();
                    var9_3 = (var7_2 | var10_1) ^ -178943117;
                    continue block60;
                }
                case -1693723442: {
                    var8_4 ^= var9_3 ^ 585125647;
                    var9_3 = (var7_2 | var10_1) ^ -2108806424;
                    continue block60;
                }
                case -334465707: {
                    return;
                }
                case 1167341292: {
                    var8_4 ^= var9_3 ^ 940700874;
                    var9_3 = (var7_2 | var10_1) ^ 1883030037;
                    continue block60;
                }
                case 509779368: {
                    ki.a.beginTick();
                    var9_3 = (var7_2 | var10_1) ^ -1921970584;
                    continue block60;
                }
                case -483438123: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ 534509047;
                        continue block60;
                        break;
                    }
                }
                case 1904585290: {
                    switch (var8_4) {
                        case 320742276: {
                            var9_3 = (var7_2 | var10_1) ^ -481411301;
                            continue block60;
                        }
                        default: {
                            var9_3 = (var7_2 | var10_1) ^ 1994881034;
                            continue block60;
                        }
                        case 1556573998: 
                    }
                    var9_3 = (var7_2 | var10_1) ^ -479107638;
                    continue block60;
                }
                case -1928306522: {
                    var8_4 ^= var9_3 ^ -324847543;
lbl118:
                    // 2 sources

                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ 1971528407;
                        continue block60;
                        break;
                    }
                }
                case 414787511: {
                    var8_4 ^= var9_3 ^ -150643911;
                    ** continue;
                }
                case -1926284681: {
                    var8_4 ^= var9_3 ^ -1921025840;
                    ** continue;
                }
                case 467500394: {
                    var9_3 = (var7_2 | var10_1) ^ 1320144989;
                    continue block60;
                }
                case 552701920: {
                    mA.drainPendingAttacks();
                    var9_3 = (var7_2 | var10_1) ^ 1255519751;
                    continue block60;
                }
                case 613149114: {
                    var8_4 ^= var9_3 ^ 1892760131;
                    var9_3 = (var7_2 | var10_1) ^ 230413175;
                    continue block60;
                }
                case 1675988170: 
            }
            break;
        }
        var1_5 = bJ.a.iterator();
        while (true) {
            var9_3 = (var7_2 | var10_1) ^ -100853931;
            block66: while (true) {
                switch (var9_3) {
                    default: {
                        continue block66;
                    }
                    case -1750906648: {
                        var8_4 ^= var9_3 ^ -311509390;
                        var9_3 = (var7_2 | var10_1) ^ 805392213;
                        continue block66;
                    }
                    case 1583288552: {
                        if (var1_5.hasNext()) {
                            var9_3 = (var7_2 | var10_1) ^ 92900294;
                            continue block66;
                        }
                        var9_3 = (var7_2 | var10_1) ^ -2015103893;
                        continue block66;
                    }
                    case 1809306747: {
                        var8_4 ^= var9_3 ^ -832214185;
                        var9_3 = (var7_2 | var10_1) ^ -232773934;
                        continue block66;
                    }
                    case -1669432977: {
                        var2_6 = (cS)var1_5.next();
                        var9_3 = (var7_2 | var10_1) ^ 125803199;
                        break block66;
                    }
                    case -373445674: {
                        var8_4 ^= var9_3 ^ 459731356;
                        var9_3 = (var7_2 | var10_1) ^ -904790639;
                        continue block66;
                    }
                    case -1538285012: {
                        ki.a.tick();
                        var9_3 = (var7_2 | var10_1) ^ 1596990616;
                        continue block66;
                    }
                    case 829324069: {
                        var8_4 ^= var9_3 ^ -275305866;
                        var9_3 = (var7_2 | var10_1) ^ -37993565;
                        continue block66;
                    }
                    case -1813898210: {
                        return;
                    }
                }
                break;
            }
            block67: while (true) {
                switch (var9_3) {
                    default: {
                        continue block67;
                    }
                    case 1763820802: {
                        var8_4 ^= var9_3 ^ 1623132254;
                        var9_3 = (var7_2 | var10_1) ^ -1944189345;
                        continue block67;
                    }
                    case -499099166: {
                        if (var2_6.isEnabled()) {
                            var9_3 = (var7_2 | var10_1) ^ -116259476;
                            continue block67;
                        }
lbl190:
                        // 4 sources

                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ -1899505610;
                            continue block67;
                            break;
                        }
                    }
                    case -1756603695: {
                        var8_4 ^= var9_3 ^ 125865202;
                        var9_3 = (var7_2 | var10_1) ^ -21287299;
                        continue block67;
                    }
                    case -1864011328: {
                        var3_7 = eN.begin();
                        try {
                            var8_4 ^= -1191476821;
                            var2_6.onPortTick();
                            var8_4 ^= 1892693886;
                        }
                        catch (Exception v0) {
                            try {
                                var8_4 = (var7_2 | var10_1) ^ -1385303803;
                                var5_8 = v0;
                                var8_4 ^= 1599836756;
                            }
                            catch (Throwable v1) {
                                var8_4 = (var7_2 | var10_1) ^ -1110984022;
                                var6_9 = v1;
                                var8_4 ^= 1348884968;
                                eN.end(var2_6, cV.g, var3_7);
                                var8_4 ^= 885371402;
                                throw var6_9;
                            }
                            eN.end(var2_6, cV.g, var3_7);
                            var8_4 ^= 1820201108;
                            ** continue;
                        }
                        eN.end(var2_6, cV.g, var3_7);
                        var8_4 ^= 1491558646;
                        ** GOTO lbl190
                    }
                    case -526809205: {
                        var8_4 ^= var9_3 ^ 913834849;
                        var9_3 = (var7_2 | var10_1) ^ -1155816341;
                        continue block67;
                    }
                    case -716833834: 
                }
                break;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void rM(class_332 var0, class_9779 var1_1) {
        block22: {
            break block22;
lbl1:
            // 1 sources

            block14: while (true) {
                var4_4 = (var2_3 | var5_2) ^ -2049257487;
lbl3:
                // 6 sources

                block15: while (true) {
                    switch (var4_4) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block15;
                            }
                            break;
                        }
                        case 2110566998: {
                            continue block14;
                        }
                        case -1057399055: {
                            break block14;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1127111540;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 299541373: {
                            bJ.rJ(var0);
                            return;
                        }
lbl18:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 899064138;
                            ** continue;
                            break;
                        }
                    }
                    break;
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ -2002563603;
            ** GOTO lbl3
lbl23:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -1165374678;
                ** GOTO lbl3
                break;
            }
lbl26:
            // 2 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -2011229536;
                ** GOTO lbl3
                break;
            }
            {
                case 1340486801: {
                    var3_5 ^= var4_4 ^ 1139189456;
                    ** GOTO lbl26
                }
            }
        }
        var5_2 = -1788469495;
        var2_3 = bJ.a & -1788469495 ^ 1881800122;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 829472277;
        ** while (true)
lbl38:
        // 1 sources

        while (true) {
            var4_4 = (var2_3 | var5_2) ^ -771436298;
            ** GOTO lbl3
            break;
        }
        {
            case 661335885: {
                var3_5 ^= var4_4 ^ 1637431022;
                ** continue;
            }
            case 2104552731: {
                break;
            }
            case 1890922570: {
                switch (var3_5) {
                    case 738063615: {
                        ** continue;
                    }
                    case -1004584530: {
                        ** continue;
                    }
                    ** default:
lbl53:
                    // 1 sources

                    ** continue;
                }
            }
        }
        var4_4 = (var2_3 | var5_2) ^ -457876282;
        ** while (true)
        {
            ** case 1237211959:
        }
lbl57:
        // 1 sources

        var3_5 ^= var4_4 ^ -1813651734;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n2 = 0;
        int n3 = 359383517;
        n2 = 0x111BF8D8 ^ 0xDF08B32F;
        block5: while (true) {
            switch (n2) {
                default: {
                    continue block5;
                }
                case -1582677647: {
                    a = (int)new ArrayList();
                    return;
                }
                case -837596169: {
                    n2 = 0x111BF8D8 ^ 0x34A5D9A7;
                    continue block5;
                }
                case 633217407: 
            }
            n3 ^= n2 ^ 0xE6E1BD;
            n2 = 0x111BF8D8 ^ 0xB0B1B9A9;
        }
    }
}

