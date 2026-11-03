/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_310
 *  net.minecraft.class_5250
 *  net.minecraft.class_5348$class_5246
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.regex.Pattern;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_5348;
import z.r.aR;
import z.r.bQ;
import z.r.gL;
import z.r.gj;
import z.r.kl;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class gU {
    public static final int a;
    private static final int[] a;
    private static final /* synthetic */ String a;
    private static final ConcurrentMap<String, Pattern> a;
    private static final /* synthetic */ String b;

    /*
     * Enabled aggressive block sorting
     */
    private gU() {
        int n2 = a & 0x49A25312 ^ 0x13B02ACF;
        int n3 = (n2 | 0x49A25312) ^ 0x1B3643FE;
        n3 ^= 0xEDAC70D0;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static class_2561 apply(class_2561 var0, kl var1_1, aR var2_2) {
        var6_3 = 875384669;
        var3_4 = gU.a & 875384669 ^ 304997287;
        var5_5 = 0;
        var4_6 = (var3_4 | var6_3) ^ 864377947;
        var5_5 = (var3_4 | var6_3) ^ -147256262;
        ** GOTO lbl41
lbl7:
        // 2 sources

        while (true) {
            var5_5 = (var3_4 | var6_3) ^ 207825066;
            if (true) ** GOTO lbl15
            break;
        }
        block12: while (true) {
            var5_5 = (var3_4 | var6_3) ^ 0x5DD55D2D;
            if (true) ** GOTO lbl15
            block13: while (true) {
                var5_5 = (var3_4 | var6_3) ^ 1816705498;
lbl15:
                // 3 sources

                block14: while (true) {
                    switch (var5_5) {
                        case 2089632501: {
                            var5_5 = (var3_4 | var6_3) ^ -1796133881;
                            continue block14;
                        }
                        case 978241365: {
                            var4_6 ^= var5_5 ^ -668557974;
                            ** break;
                        }
                        case -779108802: {
                            if (var0 == null) ** GOTO lbl7
                            var5_5 = (var3_4 | var6_3) ^ 1252044042;
                            continue block14;
                        }
                        case -1055595579: {
                            var5_5 = (var3_4 | var6_3) ^ -1981173385;
                            continue block14;
                        }
lbl30:
                        // 1 sources

                        var5_5 = (var3_4 | var6_3) ^ -1657831022;
                        ** GOTO lbl41
                        case -1562590216: {
                            if (gU.VK(var1_1, var2_2)) continue block13;
                            ** continue;
                        }
                        case 1516590629: {
                            var4_6 ^= var5_5 ^ -848808497;
                            continue block12;
                        }
                        case -1077649784: {
                            var4_6 ^= var5_5 ^ 2099630773;
                            var5_5 = (var3_4 | var6_3) ^ -408792639;
                        }
lbl41:
                        // 4 sources

                        default: {
                            continue block14;
                        }
                        case -1425904019: {
                            return var0;
                        }
                        case 1811460818: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return gU.VL(var0, var1_1, var2_2);
    }

    /*
     * Exception decompiling
     */
    public static class_2561 applyForKnownPlayer(class_2561 var0, String var1_1, UUID var2_2, kl var3_3, aR var4_4) {
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
    public static class_2561 applyForMessages(class_2561 var0, kl var1_1, aR var2_2) {
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
    public static class_5250 protectedDisplay(String var0, kl var1_1, aR var2_2, class_2583 var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [32[UNCONDITIONALDOLOOP], 0[SWITCH], 31[UNCONDITIONALDOLOOP]], but top level block is 8[SWITCH]
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
    private static boolean VK(kl var0, aR var1_1) {
        block29: {
            block30: {
                block31: {
                    block27: {
                        block32: {
                            block28: {
                                break block32;
lbl1:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ -1768140697;
                                    break block27;
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ -1350795586;
                                    break block27;
lbl7:
                                    // 1 sources

                                    while (true) {
                                        if (!var0.coversArea(var1_1)) break block28;
                                        break block29;
                                        break;
                                    }
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 792344562;
                                    break block27;
                                    break;
                                }
lbl13:
                                // 1 sources

                                return v0;
                            }
                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 446091977;
                                break block27;
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -1084016662;
                                break block27;
                                break;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_4 ^ -1124220077;
                                ** continue;
                                break;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 898140662;
                                break block27;
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_4 ^ -1784054854;
                                break block30;
                                break;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                v0 = true;
                                break block31;
                                break;
                            }
lbl34:
                            // 1 sources

                            while (true) {
                                v0 = false;
                                break block31;
                                break;
                            }
lbl37:
                            // 1 sources

                            while (true) {
                                if (var0 == null) ** continue;
                                ** continue;
                                break;
                            }
lbl40:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -1736062030;
                                break block27;
                                break;
                            }
                        }
                        var5_2 = 1382307202;
                        var2_3 = gU.a & 1382307202 ^ 692643334;
                        var4_4 = 0;
                        var3_5 = (var2_3 | var5_2) ^ 263759920;
                        ** while (true)
lbl49:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ 1149333688;
                            ** continue;
                            break;
                        }
                    }
lbl53:
                    // 3 sources

                    block26: while (true) {
                        switch (var4_4) {
                            default: {
                                continue block26;
                            }
                            case -1005600660: {
                                ** continue;
                            }
                            case 1323597424: {
                                ** continue;
                            }
                            case 1643783503: {
                                ** continue;
                            }
                            case -737113800: {
                                ** continue;
                            }
                            case -471253964: {
                                ** continue;
                            }
                            case -302995487: {
                                ** continue;
                            }
                            case 569106634: {
                                ** continue;
                            }
                            case 1414971508: {
                                ** continue;
                            }
                            ** case -1719232860:
lbl74:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
                }
                var3_5 ^= 1958964985;
                ** while (true)
            }
            var4_4 = (var2_3 | var5_2) ^ 1518802764;
            ** GOTO lbl53
        }
        var4_4 = (var2_3 | var5_2) ^ -487956190;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static class_2561 VL(class_2561 var0, kl var1_1, aR var2_2) {
        block16: {
            break block16;
lbl1:
            // 1 sources

            block13: while (true) {
                switch (var7_5) {
                    case -949938621: {
                        var6_8 ^= var7_5 ^ 1586951777;
                        ** GOTO lbl24
                    }
                    case -1892422262: {
                        return var0;
                    }
                    case -1555619011: {
                        if (var4_7.isEmpty()) {
                            var7_5 = (var5_4 | var8_3) ^ -1877546833;
                            ** break;
                        }
                        ** GOTO lbl22
                    }
                    case -366568395: {
                        var6_8 ^= var7_5 ^ -998890594;
                        var7_5 = (var5_4 | var8_3) ^ -1199574662;
                        ** break;
                    }
                    case 1371208246: {
                        var6_8 ^= var7_5 ^ 165061189;
                        var7_5 = (var5_4 | var8_3) ^ -198124079;
                    }
lbl20:
                    // 4 sources

                    default: {
                        continue block13;
                    }
lbl22:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ -1118739751;
                    continue block13;
lbl24:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ -666627226;
                    continue block13;
                    case -284684394: 
                }
                return gU.VM(var0, var4_7);
            }
        }
        var8_3 = 1416894144;
        var5_4 = gU.a & 1416894144 ^ 388234348;
        var7_5 = 0;
        var6_8 = (var5_4 | var8_3) ^ -1454781150;
        var7_5 = (var5_4 | var8_3) ^ 1885601131;
        block14: while (true) {
            switch (var7_5) {
                case 655623047: {
                    var7_5 = (var5_4 | var8_3) ^ -2072534542;
                    continue block14;
                }
                case -495602378: {
                    var3_6 = class_310.method_1551();
                    break block14;
                }
                case -754950370: {
                    var6_8 ^= var7_5 ^ 2093131762;
                    var7_5 = (var5_4 | var8_3) ^ -1258140710;
                }
                default: {
                    continue block14;
                }
            }
            break;
        }
        var6_8 ^= 873993232;
        var4_7 = var1_1.scrubTargetsSorted(var3_6, var2_2);
        var7_5 = (var5_4 | var8_3) ^ 114099418;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block16: {
            var2 = 25770668;
            gU.a = mK.a(MethodHandles.lookup().lookupClass(), -182543325);
            var1_1 = 0;
            var0_2 = -1376697610;
            var1_1 = var2 ^ 1456533927;
            break block16;
lbl7:
            // 1 sources

            while (true) {
                gU.b = gj.decode("wuK9", gU.VQ(((var0_2 ^= 337803997) | var2) ^ -2125843350, var2 ^ ((var0_2 | var2) ^ 456047089)));
                gU.a = gj.decode("Na9lIR3hwz2nHR5bRHN0+xcV", gU.VQ((var0_2 | var2) ^ -2125843349, var2 ^ ((var0_2 | var2) ^ 1574384812)));
                var1_1 = var2 ^ 1421727579;
                break block16;
                break;
            }
lbl12:
            // 1 sources

            block12: while (true) {
                block17: {
                    var0_2 ^= 1019971252;
                    var0_2 ^= -80171257;
                    v0 = (v1[v2] & 255) << 24;
                    var0_2 ^= 1828828277;
                    break block17;
lbl19:
                    // 2 sources

                    while (true) {
                        var0_2 ^= 155487138;
                        var0_2 ^= 1383628125;
                        v3 = var0_2 ^= 669212017;
                        var0_2 ^= -1741706138;
                        gU.a[v4] = (v0 | (v5 | ((v1[v2 + 2] & 255) << 8 | v1[v2 + 3] & 255))) ^ ((v3 | var2) ^ 340295043 ^ gU.a);
                        v4 = v4 + 1;
                        v1 = v1;
                        v2 = v2 + 4;
                        var0_2 ^= -1430102741;
                        if (v2 + 4 < v1.length) continue block12;
                        ** continue;
                        break;
                    }
                }
                v5 = (v1[v2 + 1] & 255) << 16;
                block14: while (true) {
                    switch (var0_2) {
                        case 257173563: {
                            var0_2 ^= -1157323783;
                            continue block14;
                        }
                        default: {
                            var0_2 ^= -756879036;
                            ** GOTO lbl19
                        }
                        case 17708083: 
                    }
                    break;
                }
                var0_2 ^= -457128187;
                ** continue;
                break;
            }
        }
        block15: while (true) {
            switch (var1_1) {
                default: {
                    continue block15;
                }
                case -1440870195: {
                    v4 = 0;
                    v2 = 0;
                    var0_2 ^= 1144724846;
                    gU.a = new int[2];
                    var0_2 ^= 589221438;
                    v1 = "\u0087\u0084n\u00d0\u00af\u00a1\u0094\u00be".getBytes("ISO-8859-1");
                    ** continue;
                }
                case 1238012233: {
                    gU.a = (int)new ConcurrentHashMap<K, V>();
                    return;
                }
                case 1429532151: {
                    var0_2 ^= var1_1 ^ 1246579157;
                    var1_1 = var2 ^ 1212394469;
                    continue block15;
                }
                case 1465502475: {
                    var1_1 = var2 ^ 360946744;
                    continue block15;
                }
                case 336242324: 
            }
            var0_2 ^= var1_1 ^ 1965203143;
            var1_1 = var2 ^ -1416156575;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static class_5250 VM(class_2561 var0, List<bQ> var1_1) {
        var7_2 = 1550715026;
        var4_3 = gU.a & 1550715026 ^ 631411698;
        var6_4 = 0;
        var5_5 = (var4_3 | var7_2) ^ -929946586;
        var6_4 = (var4_3 | var7_2) ^ -858271573;
        block13: while (true) {
            switch (var6_4) {
                default: {
                    continue block13;
                }
                case 1229352541: {
                    var2_6 = class_2561.method_43473();
                    var5_5 ^= 1173089859;
                    ** break;
                }
                case -1024862273: {
                    var5_5 ^= var6_4 ^ -1391737669;
                    ** GOTO lbl20
                }
lbl17:
                // 1 sources

                var3_7 = var0.method_10866();
                var6_4 = (var4_3 | var7_2) ^ -1427578291;
                ** GOTO lbl46
lbl20:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 883488175;
                continue block13;
                case -1321645223: 
            }
            var6_4 = (var4_3 | var7_2) ^ -1090040755;
        }
        {
            var6_4 = (var4_3 | var7_2) ^ 1122990598;
            block15: while (true) {
                switch (var6_4) {
                    case -2125591442: {
                        var2_6.method_10862(var3_7);
                        continue block14;
                    }
                    case -687441473: {
                        var5_5 ^= var6_4 ^ 1627679284;
                        ** break;
                    }
                    case -541509662: {
                        var0.method_27658((class_5348.class_5246)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_2583;Ljava/lang/String;)Ljava/util/Optional;, VU(net.minecraft.class_2583 net.minecraft.class_5250 java.util.List net.minecraft.class_2583 java.lang.String ), (Lnet/minecraft/class_2583;Ljava/lang/String;)Ljava/util/Optional;)((class_2583)var3_7, (class_5250)var2_6, var1_1), class_2583.field_24360);
                        ** GOTO lbl41
                    }
lbl39:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ -56584292;
                    ** GOTO lbl46
lbl41:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 1730933872;
                    ** GOTO lbl46
                    case 449146754: {
                        var5_5 ^= var6_4 ^ 2071422507;
                        var6_4 = (var4_3 | var7_2) ^ -1238355217;
                    }
lbl46:
                    // 5 sources

                    default: {
                        continue block15;
                    }
                    case 1057087988: {
                        var5_5 ^= var6_4 ^ -729635761;
                        var6_4 = (var4_3 | var7_2) ^ -1571312624;
                        continue block15;
                    }
                    case -874600163: 
                }
                break;
            }
        }
        return var2_6;
    }

    /*
     * Exception decompiling
     */
    private static void VN(class_5250 var0, String var1_1, List<bQ> var2_2, class_2583 var3_3) {
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
    private static gL VO(String var0, List<bQ> var1_1, int var2_2) {
        var10_3 = -1544177314;
        var7_4 = gU.a & -1544177314 ^ 876539745;
        var9_5 = 0;
        var8_10 = (var7_4 | var10_3) ^ 1280905213;
        var9_5 = (var7_4 | var10_3) ^ -1858952615;
        ** GOTO lbl138
lbl7:
        // 1 sources

        while (true) {
            var9_5 = (var7_4 | var10_3) ^ -493833758;
            ** GOTO lbl80
lbl10:
            // 3 sources

            while (true) {
                var9_5 = (var7_4 | var10_3) ^ -1017336846;
                ** GOTO lbl80
                while (true) {
                    var9_5 = (var7_4 | var10_3) ^ 772885599;
                    ** GOTO lbl80
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var9_5 = (var7_4 | var10_3) ^ 744367841;
                    if (true) ** GOTO lbl80
                    break;
                }
                break;
            }
            break;
        }
        while (true) {
            block52: {
                var9_5 = (var7_4 | var10_3) ^ 2044800278;
                break block52;
lbl24:
                // 2 sources

                block41: while (true) {
                    var9_5 = (var7_4 | var10_3) ^ -1766714027;
                    ** GOTO lbl80
                    var9_5 = (var7_4 | var10_3) ^ -492398668;
                    block42: while (true) {
                        switch (var9_5) {
                            case -617325842: {
                                if (var4_7.hasNext()) {
                                    var9_5 = (var7_4 | var10_3) ^ -1702322468;
                                    continue block42;
                                }
                                ** GOTO lbl45
                            }
                            case 1317033715: {
                                var8_10 ^= var9_5 ^ -605234569;
                                var9_5 = (var7_4 | var10_3) ^ 1825285521;
                                continue block42;
                            }
                            case 1431922891: {
                                var5_8 = var4_7.next();
                                var8_10 ^= -1365689987;
                                var6_9 = gU.VP(var5_8.token()).matcher(var0);
                                var9_5 = (var7_4 | var10_3) ^ 919719471;
                                if (true) ** GOTO lbl80
                            }
lbl45:
                            // 1 sources

                            var9_5 = (var7_4 | var10_3) ^ 692591329;
                            ** GOTO lbl53
                            case 762798499: {
                                var8_10 ^= var9_5 ^ -1437690058;
                                ** continue;
                            }
                            case -1632115298: {
                                var8_10 ^= var9_5 ^ 1030701740;
                                var9_5 = (var7_4 | var10_3) ^ -209133589;
                            }
lbl53:
                            // 4 sources

                            default: {
                                continue block42;
                            }
                            case 1148657812: 
                        }
                        break;
                    }
                    return var3_6;
lbl57:
                    // 1 sources

                    block44: while (true) {
                        switch (var8_10) {
                            default: {
                                var8_10 ^= 1899302703;
                                break;
                            }
                            case 1382745662: {
                                var8_10 ^= 938390033;
                                continue block44;
                            }
                            case -1569524802: {
                                var8_10 ^= 144331231;
                            }
                        }
                        if (var6_9.start() != var3_6.start()) continue block41;
                        ** continue;
                        break;
                    }
                    break;
                }
                block45: while (true) {
                    var9_5 = (var7_4 | var10_3) ^ -1592729967;
                    if (true) ** GOTO lbl80
lbl72:
                    // 3 sources

                    while (true) {
                        var9_5 = (var7_4 | var10_3) ^ -109074036;
                        ** GOTO lbl53
                        break;
                    }
                    block47: while (true) {
                        var9_5 = (var7_4 | var10_3) ^ 1949221671;
                        if (true) ** GOTO lbl80
                        block48: while (true) {
                            var9_5 = (var7_4 | var10_3) ^ -58630239;
lbl80:
                            // 9 sources

                            block49: while (true) {
                                switch (var9_5) {
                                    default: {
                                        continue block49;
                                    }
                                    case -1318912038: {
                                        if (var3_6 == null) ** GOTO lbl10
                                        continue block48;
                                    }
                                    case -1009697704: {
                                        var8_10 ^= var9_5 ^ -884249209;
                                        var9_5 = (var7_4 | var10_3) ^ -1071356368;
                                        continue block49;
                                    }
                                    case 2010880335: {
                                        ** continue;
                                    }
                                    case -1062178755: {
                                        if (var6_9.find(var2_2)) ** continue;
                                        var9_5 = (var7_4 | var10_3) ^ 298014505;
                                        continue block49;
                                    }
                                    case -1505974186: {
                                        var8_10 ^= var9_5 ^ -585744913;
                                        var9_5 = (var7_4 | var10_3) ^ -1779727179;
                                        continue block49;
                                    }
                                    case 384770542: {
                                        ** break;
                                    }
                                    case 571767754: {
                                        ** GOTO lbl72
                                    }
                                    case -2127679152: {
                                        var8_10 ^= var9_5 ^ 1187571589;
                                        var9_5 = (var7_4 | var10_3) ^ 2001702722;
                                        continue block49;
                                    }
                                    case 1433357981: {
                                        ** GOTO lbl72
                                    }
                                    case 922960062: {
                                        var3_6 = new gL(var6_9.start(), var6_9.end(), var5_8);
                                        ** GOTO lbl24
                                    }
                                    case 1266589918: {
                                        var9_5 = (var7_4 | var10_3) ^ 1369155359;
                                        continue block49;
                                    }
                                    case 1956861069: {
                                        var9_5 = (var7_4 | var10_3) ^ -2130919487;
                                        continue block49;
                                    }
lbl120:
                                    // 1 sources

                                    var8_10 ^= 214362969;
                                    if (var5_8.token().length() > var3_6.target().token().length()) ** break;
                                    ** continue;
                                    ** GOTO lbl10
                                    case 558754346: {
                                        var8_10 ^= var9_5 ^ -183061502;
                                        ** continue;
                                    }
                                    case -429631392: {
                                        if (var6_9.start() >= var3_6.start()) ** break;
                                        ** continue;
                                        continue block47;
                                    }
                                    case -1683891810: {
                                        var8_10 ^= var9_5 ^ -1754844473;
                                        continue block45;
                                    }
                                    case -1712409824: 
                                }
                                var8_10 ^= var9_5 ^ 916420785;
                                var9_5 = (var7_4 | var10_3) ^ 110952613;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
            }
            block50: while (true) {
                switch (var9_5) {
                    default: {
                        continue block50;
                    }
                    case 650992934: {
                        var9_5 = (var7_4 | var10_3) ^ 817321149;
                        continue block50;
                    }
                    case -836840855: {
                        var3_6 = null;
                        var8_10 ^= -150900793;
                        var4_7 = var1_1.iterator();
                        ** continue;
                    }
                    case -2025280574: 
                }
                break;
            }
            var8_10 ^= var9_5 ^ -178468658;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static Pattern VP(String var0) {
        block10: {
            break block10;
lbl1:
            // 1 sources

            return gU.a.computeIfAbsent(var0, (Function<String, Pattern>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, VT(java.lang.String ), (Ljava/lang/String;)Ljava/util/regex/Pattern;)());
            {
                var3_2 = (var1_1 | 1652189158) ^ -1251221677;
lbl4:
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
                        case 779148387: {
                            ** continue;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 1652189158) ^ 540455071;
                            ** continue;
                            break;
                        }
                        case -829149012: {
                            var2_3 ^= var3_2 ^ -102629256;
                            break block6;
                        }
                        case 1539923808: {
                            continue block6;
                        }
                    }
                    break;
                }
            }
            var3_2 = (var1_1 | 1652189158) ^ 1435448220;
            ** while (true)
        }
        var1_1 = gU.a & 1652189158 ^ 432400541;
        var3_2 = 0;
        var2_3 = (var1_1 | 1652189158) ^ 1788890753;
        ** while (true)
    }

    private static int VQ(int n2, int n3) {
        int n4 = -744795258;
        int n5 = 1313384667;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xE14E3419)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xDFDBE137;
        n6 ^= (n5 | n4) ^ 0xDFDB6258;
        n6 -= (n5 | n4) ^ 0xDFDB7B76;
        n6 -= (n5 | n4) ^ 0xDFDB0721;
        n6 ^= (n5 | n4) ^ 0xDFDBE448;
        n6 ^= (n5 | n4) ^ 0xDFDBC4FD;
        n6 -= (n5 | n4) ^ 0xDFDB6CB8;
        n6 -= (n5 | n4) ^ 0xDFDB5B16;
        n6 ^= (n5 | n4) ^ 0xDFDBAECF;
        return n6 ^= (n5 | n4) ^ 0xDFDB6FAF;
    }

    /*
     * Exception decompiling
     */
    private static String VR(String var0, List<bQ> var1_1) {
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
    private static void VS(class_5250 var0, String var1_1, class_2583 var2_2) {
        var6_3 = -163156767;
        var3_4 = gU.a & -163156767 ^ -1548279181;
        var5_5 = 0;
        var4_6 = (var3_4 | var6_3) ^ 1754554586;
        var5_5 = (var3_4 | var6_3) ^ 759658777;
        ** GOTO lbl21
lbl7:
        // 1 sources

        while (true) {
            var5_5 = (var3_4 | var6_3) ^ 1256733150;
            ** GOTO lbl21
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var5_5 = (var3_4 | var6_3) ^ 1514389298;
            ** GOTO lbl21
            break;
        }
lbl13:
        // 1 sources

        while (true) {
            var5_5 = (var3_4 | var6_3) ^ 1774870023;
            if (true) ** GOTO lbl21
            break;
        }
        block16: while (true) {
            var5_5 = (var3_4 | var6_3) ^ -1475052849;
            if (true) ** GOTO lbl21
            block17: while (true) {
                var5_5 = (var3_4 | var6_3) ^ -1764783317;
lbl21:
                // 6 sources

                block18: while (true) {
                    switch (var5_5) {
                        case -1380658751: {
                            return;
                        }
                        case -423814595: {
                            if (var1_1 == null) continue block17;
                            var5_5 = (var3_4 | var6_3) ^ 599883118;
                            continue block18;
                        }
                        case -625993750: {
                            ** break;
                        }
                        case 224566146: {
                            var4_6 ^= var5_5 ^ -1623519108;
                            var5_5 = (var3_4 | var6_3) ^ 290092238;
                            continue block18;
                        }
                        case -1640156940: {
                            return;
                        }
                        case 1348733232: {
                            var4_6 ^= var5_5 ^ -1397261893;
                            ** continue;
                        }
                        case -882708490: {
                            if (!var1_1.isEmpty()) ** break;
                            continue block17;
                            var5_5 = (var3_4 | var6_3) ^ -1483511869;
                        }
                        default: {
                            continue block18;
                        }
lbl46:
                        // 1 sources

                        var5_5 = (var3_4 | var6_3) ^ -90835599;
                        continue block18;
                        case 1608717372: {
                            var4_6 ^= var5_5 ^ 622071413;
                            ** continue;
                        }
                        case 1631118808: {
                            var4_6 ^= var5_5 ^ 1893215878;
                            ** continue;
                        }
                        case -1122019539: {
                            var0.method_10852((class_2561)class_2561.method_43470((String)var1_1).method_10862(var2_2));
                            continue block16;
                        }
                        case -734653539: 
                    }
                    var5_5 = (var3_4 | var6_3) ^ 1016430853;
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ Pattern VT(String var0) {
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
     * Exception decompiling
     */
    private static /* synthetic */ Optional VU(class_2583 var0, class_5250 var1_1, List var2_2, class_2583 var3_3, String var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[UNCONDITIONALDOLOOP], 16[UNCONDITIONALDOLOOP], 0[SWITCH]], but top level block is 6[SWITCH]
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
}

