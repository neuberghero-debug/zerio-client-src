/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1113
 *  net.minecraft.class_1113$class_1114
 *  net.minecraft.class_3419
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.openal.AL10
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.nio.ShortBuffer;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1113;
import net.minecraft.class_3419;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;
import z.r.eV;
import z.r.gj;
import z.r.if;
import z.r.lO;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class hr {
    private static final int a;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final Set<String> a;
    private static final float a;
    private static final /* synthetic */ String c;
    private static final Set<String> b;
    private static final /* synthetic */ String d;
    private static final Map<eV, Integer> a;
    private static final /* synthetic */ String e;
    private static boolean a;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static int[] a;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    public static final int b;
    private static boolean b;
    private static final Map<eV, Long> b;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String s;
    private static final int[] b;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;

    /*
     * Enabled aggressive block sorting
     */
    private hr() {
        int n2 = b & 0xCEF5A997 ^ 0xDDF457A3;
        int n3 = (n2 | 0xCEF5A997) ^ 0xF481BCF1;
        n3 ^= 0x5F8374F2;
        n3 ^= 0x92A3A7D6;
    }

    /*
     * Exception decompiling
     */
    public static boolean replace(class_1113 var0) {
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
    public static void preview(lO var0) {
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
    private static boolean Or(eV var0, lO var1_1, class_1113 var2_2, float var3_3, float var4_4) {
        block76: {
            var13_5 = -1500514697;
            var10_6 = hr.b & -1500514697 ^ 1150794526;
            var12_7 = 0;
            var11_8 = (var10_6 | var13_5) ^ 929930956;
            var12_7 = (var10_6 | var13_5) ^ -95348044;
            break block76;
lbl7:
            // 1 sources

            while (true) {
                var12_7 = (var10_6 | var13_5) ^ -801062722;
                break block76;
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var11_8 ^= var12_7 ^ 341795408;
                var12_7 = (var10_6 | var13_5) ^ 1133440424;
                break block76;
                break;
            }
lbl14:
            // 1 sources

            while (true) {
                block77: {
                    block78: {
                        var5_9 = if.get();
                        var12_7 = (var10_6 | var13_5) ^ -785319048;
                        break block77;
lbl18:
                        // 1 sources

                        while (true) {
                            var11_8 ^= var12_7 ^ -1960434226;
                            var12_7 = (var10_6 | var13_5) ^ -1776961938;
                            break block77;
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            if (var5_9.isGroupEnabled(var1_1)) break block78;
                            var12_7 = (var10_6 | var13_5) ^ 1222610974;
                            break block77;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var11_8 ^= var12_7 ^ -397812452;
                            var12_7 = (var10_6 | var13_5) ^ 1466318301;
                            break block77;
                            break;
                        }
lbl30:
                        // 1 sources

                        return false;
                    }
                    var12_7 = (var10_6 | var13_5) ^ 371883730;
                    break block77;
lbl35:
                    // 1 sources

                    while (true) {
                        var11_8 ^= var12_7 ^ 612047195;
                        var12_7 = (var10_6 | var13_5) ^ -620192012;
                        break block77;
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        block79: {
                            block82: {
                                block80: {
                                    var6_10 = System.currentTimeMillis();
                                    var11_8 ^= -834860287;
                                    var8_11 = (Long)hr.b.get((Object)var0);
                                    var12_7 = (var10_6 | var13_5) ^ -3476459;
                                    break block79;
lbl45:
                                    // 1 sources

                                    while (true) {
                                        var11_8 ^= var12_7 ^ -1822142314;
                                        var12_7 = (var10_6 | var13_5) ^ 1510506940;
                                        break block79;
                                        break;
                                    }
lbl49:
                                    // 1 sources

                                    while (true) {
                                        if (var8_11 == null) break block80;
                                        var12_7 = (var10_6 | var13_5) ^ -727254840;
                                        break block79;
                                        break;
                                    }
lbl53:
                                    // 1 sources

                                    while (true) {
                                        var12_7 = (var10_6 | var13_5) ^ 1357539184;
                                        break block79;
                                        break;
                                    }
lbl56:
                                    // 1 sources

                                    while (true) {
                                        if (var6_10 - var8_11 >= var0.m) break block80;
                                        var12_7 = (var10_6 | var13_5) ^ 622117955;
                                        break block79;
                                        break;
                                    }
lbl60:
                                    // 1 sources

                                    while (true) {
                                        var11_8 ^= var12_7 ^ 1911138804;
                                        var12_7 = (var10_6 | var13_5) ^ -259271145;
                                        break block79;
                                        break;
                                    }
lbl64:
                                    // 1 sources

                                    return true;
                                }
                                try {
                                    block81: {
                                        var12_7 = (var10_6 | var13_5) ^ 1647229938;
                                        break block79;
lbl70:
                                        // 1 sources

                                        while (true) {
                                            var11_8 ^= var12_7 ^ 1997680741;
                                            var12_7 = (var10_6 | var13_5) ^ 1196651244;
                                            break block79;
                                            break;
                                        }
lbl74:
                                        // 1 sources

                                        while (true) {
                                            hr.Ov();
                                            var12_7 = (var10_6 | var13_5) ^ -1433211272;
                                            break block79;
                                            break;
                                        }
lbl78:
                                        // 1 sources

                                        while (true) {
                                            var11_8 ^= var12_7 ^ -404411638;
                                            var12_7 = (var10_6 | var13_5) ^ -944622741;
                                            break block79;
                                            break;
                                        }
lbl82:
                                        // 1 sources

                                        while (true) {
                                            if (var2_2.method_4787()) ** GOTO lbl93
                                            var12_7 = (var10_6 | var13_5) ^ 1353610937;
                                            break block79;
                                            break;
                                        }
lbl86:
                                        // 1 sources

                                        while (true) {
                                            var11_8 ^= var12_7 ^ -61772017;
                                            var12_7 = (var10_6 | var13_5) ^ -1410844320;
                                            break block79;
                                            break;
                                        }
lbl90:
                                        // 1 sources

                                        while (true) {
                                            var11_8 ^= 1247864521;
                                            if (var2_2.method_4777() != class_1113.class_1114.field_5478) break block81;
lbl93:
                                            // 2 sources

                                            var12_7 = (var10_6 | var13_5) ^ 319538134;
                                            break block79;
                                            break;
                                        }
lbl95:
                                        // 1 sources

                                        while (true) {
                                            var11_8 ^= var12_7 ^ -1948258205;
                                            var12_7 = (var10_6 | var13_5) ^ -1848458836;
                                            break block79;
                                            break;
                                        }
lbl99:
                                        // 1 sources

                                        while (true) {
                                            v0 = true;
                                            ** GOTO lbl111
                                            break;
                                        }
                                    }
                                    var12_7 = (var10_6 | var13_5) ^ 701248446;
                                    break block79;
lbl105:
                                    // 1 sources

                                    while (true) {
                                        var11_8 ^= var12_7 ^ -1323827189;
                                        var12_7 = (var10_6 | var13_5) ^ 501224135;
                                        break block79;
                                        break;
                                    }
lbl109:
                                    // 1 sources

                                    while (true) {
                                        v0 = false;
lbl111:
                                        // 2 sources

                                        var11_8 ^= -1226323354;
                                        var9_12 = v0;
                                        var12_7 = (var10_6 | var13_5) ^ -553972058;
                                        break block82;
lbl115:
                                        // 1 sources

                                        while (true) {
                                            var11_8 ^= var12_7 ^ 1916272161;
                                            var12_7 = (var10_6 | var13_5) ^ 1522076764;
                                            break block82;
                                            break;
                                        }
lbl119:
                                        // 1 sources

                                        while (true) {
                                            var11_8 ^= 1519020671;
                                            var11_8 ^= -2137987258;
                                            var11_8 ^= 497626118;
                                            hr.Os(var0, hr.Ot(var3_3, var4_4), var9_12, var2_2.method_4784(), var2_2.method_4779(), var2_2.method_4778(), hr.Ou(var2_2.method_4774()));
                                            var12_7 = (var10_6 | var13_5) ^ -933411972;
                                            break block82;
                                            break;
                                        }
lbl126:
                                        // 1 sources

                                        while (true) {
                                            var11_8 ^= var12_7 ^ -7481146;
                                            var12_7 = (var10_6 | var13_5) ^ -1922922646;
                                            break block82;
                                            break;
                                        }
lbl130:
                                        // 1 sources

                                        while (true) {
                                            hr.b.put(var0, var6_10);
                                            var11_8 ^= 1940604807;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                catch (Throwable v1) {
                                    var11_8 = (var10_6 | var13_5) ^ -125254147;
                                    var9_13 = v1;
                                    var11_8 ^= 172448128;
                                    hr.Oy(var9_13);
                                    var11_8 ^= 1690857405;
                                    return false;
                                }
                                var12_7 = (var10_6 | var13_5) ^ 1847410162;
                                break block82;
lbl144:
                                // 1 sources

                                while (true) {
                                    var11_8 ^= var12_7 ^ -145788966;
                                    var12_7 = (var10_6 | var13_5) ^ 1187156992;
                                    break block82;
                                    break;
                                }
lbl148:
                                // 1 sources

                                return true;
                            }
                            block72: while (true) {
                                switch (var12_7) {
                                    default: {
                                        continue block72;
                                    }
                                    {
                                        case 946139609: {
                                            ** continue;
                                        }
                                        case -1138298077: {
                                            ** continue;
                                        }
                                        case 784514051: {
                                            ** continue;
                                        }
                                        case 1811773461: {
                                            ** continue;
                                        }
                                    }
                                    case -2004696435: {
                                        ** continue;
                                    }
                                    ** case -1604490369:
lbl166:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                        }
                        block73: while (true) {
                            switch (var12_7) {
                                default: {
                                    continue block73;
                                }
                                case 425003882: {
                                    ** continue;
                                }
                                case -1130922301: {
                                    ** continue;
                                }
                                case 842598327: {
                                    ** continue;
                                }
                                case -1233807345: {
                                    ** continue;
                                }
                                case -1014285508: {
                                    ** continue;
                                }
                                case 370420072: {
                                    ** continue;
                                }
                                {
                                    case -2068757363: {
                                        ** continue;
                                    }
                                    case -1580429933: {
                                        ** continue;
                                    }
                                    case 1275924743: {
                                        ** continue;
                                    }
                                    case 556649492: {
                                        ** continue;
                                    }
                                    case -1238267450: {
                                        ** continue;
                                    }
                                    case 1299695135: {
                                        ** continue;
                                    }
                                    case -174834519: {
                                        ** continue;
                                    }
                                    case 2001551059: {
                                        ** continue;
                                    }
                                    case -816591679: {
                                        ** continue;
                                    }
                                    ** case -75502152:
lbl203:
                                    // 1 sources

                                    ** continue;
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
                block74: while (true) {
                    switch (var12_7) {
                        default: {
                            continue block74;
                        }
                        case 934216711: {
                            ** continue;
                        }
                        case 1888110865: {
                            ** continue;
                        }
                        case -1371508895: {
                            ** continue;
                        }
                        case -1309031774: {
                            ** continue;
                        }
                        case -256540243: {
                            ** continue;
                        }
                        ** case 1033331083:
lbl220:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
                break;
            }
        }
        block75: while (true) {
            switch (var12_7) {
                default: {
                    continue block75;
                }
                case 483321291: {
                    ** continue;
                }
                case 920600513: {
                    ** continue;
                }
                ** case -1525607721:
lbl231:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static void Os(eV var0, float var1_1, boolean var2_2, double var3_3, double var5_4, double var7_5, float var9_6) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static float Ot(float var0, float var1_1) {
        var5_2 = -1001704310;
        var2_3 = hr.b & -1001704310 ^ -1105655974;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 1220499322;
        var4_4 = (var2_3 | var5_2) ^ -966630684;
        ** GOTO lbl12
lbl7:
        // 1 sources

        while (true) {
            var4_4 = (var2_3 | var5_2) ^ 1136889455;
            if (true) ** GOTO lbl12
            break;
        }
        block10: while (true) {
            var4_4 = (var2_3 | var5_2) ^ 657810709;
lbl12:
            // 3 sources

            block11: while (true) {
                switch (var4_4) {
                    case 943281470: {
                        var4_4 = (var2_3 | var5_2) ^ -1365644627;
                        continue block11;
                    }
                    case -1114064459: {
                        if (var1_1 <= 0.0f) {
                            var4_4 = (var2_3 | var5_2) ^ -1871084418;
                            continue block11;
                        }
                        ** GOTO lbl28
                    }
                    case 1354947959: {
                        var3_5 ^= var4_4 ^ -1219611975;
                        ** continue;
                    }
                    case 1847767972: {
                        var3_5 ^= var4_4 ^ -295079748;
                        continue block10;
                    }
lbl28:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 230816235;
                    continue block11;
                    case -207958479: {
                        var3_5 ^= var4_4 ^ -1808025810;
                        var4_4 = (var2_3 | var5_2) ^ -1715705865;
                    }
                    default: {
                        continue block11;
                    }
                    case -647081265: {
                        return var0;
                    }
                    case 1743212589: 
                }
                break;
            }
            break;
        }
        return var0 * (1.0f + (ThreadLocalRandom.current().nextFloat() * 2.0f - 1.0f) * var1_1);
    }

    /*
     * Exception decompiling
     */
    private static float Ou(class_3419 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [29[CATCHBLOCK]], but top level block is 1[SWITCH]
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
    private static void Ov() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [118[UNCONDITIONALDOLOOP], 4[SWITCH]], but top level block is 42[SWITCH]
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void Ow(eV var0, short[] var1_1) {
        block18: {
            break block18;
lbl1:
            // 1 sources

            block15: while (true) {
                switch (var6_5) {
                    case -987860104: {
                        var3_7.put(var1_1).flip();
                        ** break;
                    }
                    case 913705115: {
                        AL10.alBufferData((int)var2_6, (int)hr.Oz((var5_8 | var6_5 ^ var8_2) ^ (var6_5 ^ 811143228), (var4_4 | var6_5 ^ var8_2) ^ ((var5_8 | var6_5 ^ var8_2) ^ (var6_5 ^ -781311207))), (ShortBuffer)var3_7, (int)hr.Oz((var5_8 | var6_5 ^ var8_2) ^ (var6_5 ^ 811143203), (var4_4 | var6_5 ^ var8_2) ^ ((var5_8 | var6_5 ^ var8_2) ^ (var6_5 ^ -1990853062))));
                        ** break;
                    }
                    case 206900600: {
                        var5_8 ^= var6_5 ^ -1633984017;
                        ** GOTO lbl20
                    }
                    case 711354205: {
                        var5_8 ^= var6_5 ^ -1911133482;
                        ** GOTO lbl36
                    }
lbl16:
                    // 1 sources

                    var6_5 = (var4_4 | var7_3) ^ 1805841062;
                    continue block15;
lbl18:
                    // 1 sources

                    var6_5 = (var4_4 | var7_3) ^ 1543468721;
                    continue block15;
lbl20:
                    // 1 sources

                    var6_5 = (var4_4 | var7_3) ^ -1301285100;
                    continue block15;
                    case -711456566: {
                        hr.a.put(var0, var2_6);
                        var6_5 = (var4_4 | var7_3) ^ 299911404;
                        ** GOTO lbl30
                    }
                    case 1007192431: {
                        var5_8 ^= var6_5 ^ 1494318083;
                        var6_5 = (var4_4 | var7_3) ^ 1367471941;
                    }
lbl30:
                    // 3 sources

                    default: {
                        continue block15;
                    }
                    case 1981265714: {
                        var5_8 ^= var6_5 ^ -262200101;
                        var6_5 = (var4_4 | var7_3) ^ -1798749491;
                        continue block15;
                    }
lbl36:
                    // 1 sources

                    var6_5 = (var4_4 | var7_3) ^ -1561752410;
                    continue block15;
                    case -213992173: 
                }
                return;
            }
lbl40:
            // 1 sources

            while (true) {
                var3_7 = BufferUtils.createShortBuffer((int)var1_1.length);
                var6_5 = (var4_4 | var7_3) ^ 1301387395;
                ** continue;
                break;
            }
        }
        var8_2 = 1350625039;
        var7_3 = 1727459220;
        var4_4 = hr.b & 1727459220 ^ 1737962826;
        var6_5 = 0;
        var5_8 = (var4_4 | var7_3) ^ -19832643;
        var6_5 = (var4_4 | var7_3) ^ -814188470;
        block17: while (true) {
            switch (var6_5) {
                case -1466988652: {
                    var6_5 = (var4_4 | var7_3) ^ -77394788;
                    ** break;
                }
                case -1667959998: {
                    var5_8 ^= var6_5 ^ -1499156020;
                    var6_5 = (var4_4 | var7_3) ^ 531675364;
                }
lbl59:
                // 3 sources

                default: {
                    continue block17;
                }
                case 2017937210: 
            }
            break;
        }
        var2_6 = AL10.alGenBuffers();
        var5_8 ^= 572352511;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block38: {
            break block38;
lbl1:
            // 2 sources

            while (true) {
                var5_8 = (var0_3[var3_6] & (((var6_9 ^= 1037575118) | var9) ^ -538528414)) << ((var6_9 | var9) ^ -538528379) | (var0_3[var3_6 + 1] & ((var6_9 | var9) ^ -538528414)) << ((var6_9 | var9) ^ -538528371) | (var0_3[var3_6 + 2] & ((var6_9 | var9) ^ -538528414)) << ((var6_9 | var9) ^ -538528363) | var0_3[var3_6 + 3] & ((var6_9 | var9) ^ -538528414);
                var7_2 = var9 ^ -2064850808;
                ** GOTO lbl46
                break;
            }
lbl5:
            // 1 sources

            while (true) {
                var7_2 = var9 ^ 232692722;
                ** GOTO lbl46
                break;
            }
lbl8:
            // 1 sources

            while (true) {
                var6_9 ^= -12024860;
                var4_7 = 0;
                ** GOTO lbl1
                break;
            }
lbl12:
            // 1 sources

            while (true) {
                switch (var7_2) {
                    case -160641732: {
                        var3_6 = 0;
                        ** continue;
                    }
                    case -781396723: {
                        hr.b = new int[var1_4];
                        var7_2 = var9 ^ 1822833642;
                        break;
                    }
                    case 571712130: {
                        var6_9 ^= var7_2 ^ 993145041;
                        var7_2 = var9 ^ 248145040;
                        break;
                    }
                    case -1291810185: {
                        var6_9 ^= var7_2 ^ -1438713028;
                        var7_2 = var9 ^ 701136033;
                    }
                }
                continue;
                break;
            }
lbl29:
            // 1 sources

            while (true) {
                var7_2 = var9 ^ 565971033;
                ** GOTO lbl46
                break;
            }
lbl32:
            // 1 sources

            while (true) {
                var0_3 = "\u00b9\u00b1xd\u00dd\u00b8\u00af\u00bb\u0098\u0011\u001e\u0091\u00ae\u00efY\u008a\u00c1\u00db\u00bb\u00c3:\u0096U\b\u00b3\u00de\b\u0019.\u00952\u0083\u00ac\u0080\u00f7\u00c0t\u00ea'\u00af\u00c0p\u00d3k,0t\u00cfwc+\u008dM\u0091y\u00d4\u0081:\u0013\u00928\u0085\u0007\t`\u00bf\u00b0v\u008f\u00e8#J\u00c6\tX\u00fe\u00dd\u00bfL\u00b0\u00af5\u00c5\u00fd#\u00c2*\u00e7\u0088T\u00c6\u0015\u00a2\u00b4o\u0099\u0014\u00d8\u008aL\u009a\u001e\u00fb\u00c5:\u00cf'}g\u00f0Q\u00c0\u00954xW\u00fe\u00a6\u00c6\u00b3\u00fc\u0017\u0013\u00b3\u00a8\u0081\u00db\u00a3\u00e1\u0007\\\u00a1\u00fd\u00da\u00ed\u00a4\u0006R$\u000e\u00ddF\u00f3\u00eeI\u0097A,H\u00f2\u00c5Q\u0013\u008d$\u00ed\u00d6\u0095\u008dqs=\u00b6\u00e6".getBytes("ISO-8859-1");
                var6_9 ^= -559662084;
                var1_4 = var0_3.length / 4;
                var7_2 = var9 ^ -38464737;
                ** continue;
                break;
            }
lbl38:
            // 1 sources

            while (true) {
                var7_2 = var9 ^ -450440527;
                ** GOTO lbl46
lbl41:
                // 1 sources

                while (true) {
                    var7_2 = var9 ^ 1809779301;
                    if (true) ** GOTO lbl46
                    break;
                }
                break;
            }
            block35: while (true) {
                var7_2 = var9 ^ -2029362277;
lbl46:
                // 6 sources

                block36: while (true) {
                    switch (var7_2) {
                        case 1487720966: {
                            hr.b = Set.of(hr.q, hr.u, hr.n, hr.e);
                            ** continue;
                        }
                        case -265833052: {
                            hr.a = (int)new EnumMap<eV, V>(eV.class);
                            var7_2 = var9 ^ 1153808415;
                            continue block36;
                        }
                        case -1651216880: {
                            var6_9 ^= var7_2 ^ 1932301510;
                            var7_2 = var9 ^ -445490222;
                            continue block36;
                        }
                        case -1267090440: {
                            var6_9 ^= var7_2 ^ 114636523;
                            var7_2 = var9 ^ 796984377;
                            continue block36;
                        }
                        case 1392610114: {
                            hr.b[var4_7] = var5_8 ^= var2_5;
                            ** break;
                        }
                        case -31802940: {
                            hr.b = new EnumMap<eV, V>(eV.class);
                            return;
                        }
                        case 1673461567: {
                            hr.a = 16.0f;
                            hr.a = hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543060), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 1625251272)));
                            hr.r = gj.decode("am9cT+ksalyk", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543061), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -729469931))));
                            hr.l = gj.decode("ONMN+VSwq+pPotplRlDc", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543062), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1394131860))));
                            hr.c = gj.decode("YHsgkFB/nq3yJ2YwdN/wG1dr", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543063), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 1626305614))));
                            hr.j = gj.decode("vK8Jv2HKHgWNS60dtPS3N8ZplwC5kMqMtRlmkQ==", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543064), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -203615851))));
                            hr.i = gj.decode("z5h3FHsjxb7ndKfbX/0S3mVksLzt", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543065), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 121932940))));
                            hr.b = gj.decode("dXHXPelJ3yqphH/97bLS2OwF", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543066), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -42166807))));
                            hr.m = gj.decode("ngbIgfr2", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543067), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -766454249))));
                            hr.s = gj.decode("8qTzSuGt", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543068), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 1190377860))));
                            hr.h = gj.decode("kPBS7EXu", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543069), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1263095511))));
                            hr.d = gj.decode("fwFttdE=", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543070), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 1087379778))));
                            hr.f = gj.decode("8fjYDxY=", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543071), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 785984323))));
                            hr.g = gj.decode("G3ic+A==", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543072), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 1257919605))));
                            hr.p = gj.decode("sSJkXTD23NEGgQx/dyygvGCmbNz50gfZMcsR8kvo3ivE9iQGt5vrkQ==", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543073), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -16529021))));
                            hr.k = gj.decode("LV+VJj+wH/Zukg6RscBo9g==", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543074), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -308725537))));
                            hr.o = gj.decode("2yzbztw8lLCmThVIphrMNFNKC0Busw==", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543075), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 1850853326))));
                            hr.t = gj.decode("ncWccdi7vFaM2YSHE+L+exc=", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543076), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1290886956))));
                            hr.a = gj.decode("zmzdQodQL5bU6lY+p44Jqm+ijEeFMw==", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543077), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 1834347726))));
                            hr.q = gj.decode("HyEtP7l3sLKb/sK3D1ByPbA=", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543078), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -2037712148))));
                            hr.u = gj.decode("EBMMjjEjswJSTgJdgtrduy7AG8xg3J0=", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543079), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1189520429))));
                            hr.n = gj.decode("0V3lWr4omodwfE4MFcLkOjwF", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543080), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -557677609))));
                            hr.e = gj.decode("jEcMYgusXc075e5Y38Qf+aWO8tVq53U=", hr.Oz((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -595543081), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 986466618))));
                            var7_2 = var9 ^ -708982419;
                            continue block36;
                        }
                        case 981492524: {
                            var6_9 ^= var7_2 ^ -2015410318;
                            ** GOTO lbl111
                        }
                        case -1688008318: {
                            var6_9 ^= var7_2 ^ -1644819510;
                            ** continue;
                        }
                        case 987032143: {
                            var3_6 += 4;
                            if (++var4_7 >= var1_4) ** break;
                            ** continue;
                            ** continue;
                        }
lbl106:
                        // 1 sources

                        var7_2 = var9 ^ 1110630285;
                        ** GOTO lbl112
                        case 1531597077: {
                            var6_9 ^= var7_2 ^ -2010478579;
                            ** GOTO lbl117
                        }
lbl111:
                        // 1 sources

                        var7_2 = var9 ^ var8_1;
lbl112:
                        // 3 sources

                        default: {
                            continue block36;
                        }
                        case 169572592: {
                            var6_9 ^= var7_2 ^ -928132287;
                            ** continue;
                        }
lbl117:
                        // 1 sources

                        var7_2 = var9 ^ -1935197473;
                        continue block36;
                        case -942048356: {
                            var6_9 ^= var7_2 ^ -2001336293;
                            continue block35;
                        }
                        case -763876753: 
                    }
                    hr.a = (int)Set.of(hr.k, hr.o, hr.t, hr.a);
                    var7_2 = var9 ^ 411027969;
                }
                break;
            }
        }
        var9 = -542723683;
        var8_1 = -1139257694;
        hr.b = mK.a(MethodHandles.lookup().lookupClass(), 1353141573);
        var7_2 = 0;
        var6_9 = 1448597050;
        var7_2 = var9 ^ 829743053;
        block37: while (true) {
            switch (var7_2) {
                default: {
                    continue block37;
                }
                case -288199088: {
                    var7_2 = var9 ^ -2018953905;
                    continue block37;
                }
                case 1477412050: {
                    var6_9 ^= var7_2 ^ 1281642675;
                    var7_2 = var9 ^ 1324838560;
                    continue block37;
                }
                case -1856905411: 
            }
            break;
        }
        var2_5 = (var6_9 | var7_2 ^ 1324838560) ^ (var7_2 ^ -1156870272) ^ hr.b;
        var6_9 ^= 1465352089;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static int Ox() {
        block32: {
            var8 = 758632825;
            var7_1 = -1872376088;
            var4_2 = hr.b & -1872376088 ^ -1537131683;
            var6_3 = 0;
            var5_8 = (var4_2 | var7_1) ^ -2046041076;
            var6_3 = (var4_2 | var7_1) ^ 86033611;
            break block32;
lbl8:
            // 1 sources

            while (true) {
                var6_3 = (var4_2 | var7_1) ^ -849055687;
                if (true) ** GOTO lbl13
                break;
            }
            block22: while (true) {
                var6_3 = (var4_2 | var7_1) ^ -2040823910;
lbl13:
                // 2 sources

                block23: while (true) {
                    switch (var6_3) {
                        case 2030145476: {
                            return 0;
                        }
                        case -1321377092: {
                            var3_7 = var0_4[var2_6];
                            ** break;
                        }
                        case -1472065564: {
                            var5_8 ^= var6_3 ^ -961797819;
                            ** break;
                        }
                        case 707497421: {
                            var5_8 ^= var6_3 ^ -556591343;
                            var6_3 = (var4_2 | var7_1) ^ -1745617535;
                            break;
                        }
                        case 842956903: {
                            var5_8 ^= var6_3 ^ -396863427;
                            ** continue;
                        }
lbl30:
                        // 1 sources

                        var6_3 = (var4_2 | var7_1) ^ 89693505;
                        continue block23;
lbl32:
                        // 1 sources

                        var6_3 = (var4_2 | var7_1) ^ 1575303323;
                        ** GOTO lbl-1000
                        case 597033596: {
                            if (var2_6 >= var1_5) continue block22;
                            var6_3 = (var4_2 | var7_1) ^ 472379417;
                        }
                    }
lbl37:
                    // 4 sources

                }
                break;
            }
lbl38:
            // 1 sources

            while (true) {
                var6_3 = (var4_2 | var7_1) ^ 154656876;
                if (true) ** GOTO lbl52
                break;
            }
            block26: while (true) {
                var6_3 = (var4_2 | var7_1) ^ 280484750;
                ** GOTO lbl52
lbl44:
                // 2 sources

                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ -1639026128;
                    ** GOTO lbl37
                    break;
                }
lbl47:
                // 1 sources

                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ -746844195;
                    if (true) ** GOTO lbl52
                    break;
                }
                block29: while (true) {
                    var6_3 = (var4_2 | var7_1) ^ 667617333;
lbl52:
                    // 4 sources

                    block30: while (true) {
                        switch (var6_3) lbl-1000:
                        // 2 sources

                        {
                            default: {
                                continue block30;
                            }
                            case 1887487873: {
                                var5_8 ^= var6_3 ^ -647552878;
                                ** continue;
                            }
                            case 1729753120: {
                                return var3_7;
                            }
                            case -377436314: {
                                var5_8 ^= var6_3 ^ -1530847582;
                                ** continue;
                            }
                            case -1817249848: {
                                ++var2_6;
                                ** GOTO lbl44
                            }
                            case -1529731981: {
                                var5_8 ^= var6_3 ^ 1938115018;
                                continue block29;
                            }
                            case -1118691439: 
                        }
                        if (AL10.alGetSourcei((int)var3_7, (int)hr.Oz((var5_8 | var6_3 ^ var8) ^ (var6_3 ^ 200681251), (var4_2 | var6_3 ^ var8) ^ ((var5_8 | var6_3 ^ var8) ^ (var6_3 ^ -1908526735)))) == hr.Oz((var5_8 | var6_3 ^ var8) ^ (var6_3 ^ 200681248), (var4_2 | var6_3 ^ var8) ^ ((var5_8 | var6_3 ^ var8) ^ (var6_3 ^ -941667648)))) continue block26;
                        var6_3 = (var4_2 | var7_1) ^ -991610756;
                    }
                    break;
                }
                break;
            }
        }
        block31: while (true) {
            switch (var6_3) {
                default: {
                    continue block31;
                }
                case 833792847: {
                    var5_8 ^= var6_3 ^ -2101931975;
                    var6_3 = (var4_2 | var7_1) ^ 624545374;
                    continue block31;
                }
                case -1320862922: {
                    var6_3 = (var4_2 | var7_1) ^ -2049485646;
                    continue block31;
                }
                case -1856228957: 
            }
            break;
        }
        var0_4 = hr.a;
        var1_5 = var0_4.length;
        var2_6 = 0;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static void Oy(Throwable var0) {
        block16: {
            block17: {
                break block17;
lbl1:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1889563093;
                    break block16;
lbl4:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1950171130;
                        break block16;
                        break;
                    }
                    break;
                }
lbl7:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1628165836;
                    break block16;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -1241881995;
                    ** GOTO lbl39
                    break;
                }
lbl13:
                // 1 sources

                return;
lbl15:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ 996217164;
                    ** continue;
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 150078764;
                    break block16;
                    break;
                }
            }
            var4_1 = -146611074;
            var1_2 = hr.b & -146611074 ^ 1142050310;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -971979530;
            ** while (true)
        }
        block14: while (true) {
            switch (var3_3) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block14;
                    }
                    break;
                }
                case -2014142549: {
                    ** continue;
                }
                case -2089823868: {
                    ** continue;
                }
                case -6231214: {
                    ** continue;
                }
lbl39:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 796760051;
                ** continue;
                case -667977331: {
                    hr.b = true;
                    ** continue;
                }
                case 1772537674: {
                    ** continue;
                }
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void invalidate() {
        var3 = 1588901819;
        var0_1 = hr.b & 1588901819 ^ -1381030693;
        var2_2 = 0;
        ** GOTO lbl45
lbl5:
        // 1 sources

        while (true) {
            var2_2 = (var0_1 | var3) ^ 2122479369;
            ** GOTO lbl17
            break;
        }
lbl8:
        // 1 sources

        while (true) {
            var2_2 = (var0_1 | var3) ^ -880324137;
            if (true) ** GOTO lbl17
            break;
        }
        block13: while (true) {
            block20: {
                var2_2 = (var0_1 | var3) ^ -74623190;
                break block20;
lbl14:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ 1823455187;
                    ** GOTO lbl25
                    break;
                }
            }
lbl18:
            // 2 sources

            block15: while (true) {
                switch (var2_2) lbl-1000:
                // 6 sources

                {
                    while (true) {
                        default: {
                            continue block15;
                        }
                        break;
                    }
                    case -157565296: {
                        ** continue;
                    }
lbl25:
                    // 1 sources

                    var2_2 = (var0_1 | var3) ^ 147362841;
                    ** GOTO lbl-1000
                    case 70443217: {
                        hr.a = false;
                        ** continue;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ 153356651;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -146106671: {
                        var1_3 ^= var2_2 ^ 1632291804;
                        ** continue;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ 150282538;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 876144172: {
                        hr.a.clear();
                        ** continue;
                    }
                    case -466429091: {
                        hr.a = null;
                        ** continue;
                    }
lbl45:
                    // 1 sources

                    var1_3 = (var0_1 | var3) ^ -914306461;
                    var2_2 = (var0_1 | var3) ^ 2126108516;
                    ** GOTO lbl-1000
                    case -2130288481: {
                        break block13;
                    }
lbl50:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ 462253222;
                        ** continue;
                        break;
                    }
                    case -143186974: {
                        return;
                    }
                    case 516812164: {
                        var1_3 ^= var2_2 ^ 1233430170;
                        continue block13;
                    }
                    case -2126659342: {
                        var1_3 ^= var2_2 ^ 98595704;
                        ** continue;
                    }
                }
                break;
            }
            break;
        }
        var2_2 = (var0_1 | var3) ^ -512599425;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static void shutdown() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [64[UNCONDITIONALDOLOOP], 51[UNCONDITIONALDOLOOP]], but top level block is 65[UNCONDITIONALDOLOOP]
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

    private static int Oz(int n2, int n3) {
        int n4 = 1591432380;
        int n5 = 1250227480;
        int n6 = b[n2 ^ ((n5 | n4) ^ 0x3E0602E1)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x5EDF30DF;
        n6 ^= (n5 | n4) ^ 0x5EDF5D61;
        n6 -= (n5 | n4) ^ 0x5EDF2342;
        n6 += (n5 | n4) ^ 0x5EDFAA6A;
        n6 ^= (n5 | n4) ^ 0x5EDF4DE4;
        n6 -= (n5 | n4) ^ 0x5EDF1FDC;
        n6 ^= (n5 | n4) ^ 0x5EDF38A4;
        return n6 ^= (n5 | n4) ^ 0x5EDF486E;
    }
}

