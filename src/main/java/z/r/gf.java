/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.function.Function;
import java.util.regex.Pattern;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.br;
import z.r.cw;
import z.r.fF;
import z.r.gj;
import z.r.hI;
import z.r.hi;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class gf {
    private static final Duration a;
    private static final /* synthetic */ String a;
    private static final Pattern a;
    private static final /* synthetic */ String b;
    private static final String c;
    private static final Set<String> a;
    private static final Object a;
    private static Future<?> a;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final int a;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final long a;
    private static final String h;
    private static final /* synthetic */ String i;
    public static final int b;
    private static final /* synthetic */ String j;
    private static long b;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final ExecutorService a;
    private static final /* synthetic */ String p;
    private static final HttpClient a;
    private static final long c;
    private static final int[] a;
    private static final Map<String, cw> a;
    private static final /* synthetic */ String q;
    private static final long d;
    private static final Pattern b;
    private static final /* synthetic */ String r;
    private static final Pattern c;
    private static final /* synthetic */ String s;
    private static String t;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private gf() {
        int n2 = b & 0x3E8D2962 ^ 0x211EC9D2;
        int n3 = (n2 | 0x3E8D2962) ^ 0xA08CADA7;
        block4: while (true) {
            switch (n3) {
                case 1460544063: {
                    n3 ^= 0x9FD985A3;
                    break block4;
                }
                case -1642554890: {
                    n3 ^= 0x851F674D;
                    continue block4;
                }
                default: {
                    n3 ^= 0x5C999E4A;
                }
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public static hI getOrRequest(String var0, String var1_1, long var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [88[UNCONDITIONALDOLOOP], 94[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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

    private static void Tj(String string, String string2, String string3, long l2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    private static void Tk(String var0, br var1_1, boolean var2_2) {
        block56: {
            var8_3 = 953789239;
            var5_4 = gf.b & 953789239 ^ -675979696;
            var7_5 = 0;
            var6_6 = (var5_4 | var8_3) ^ 1718881196;
            var7_5 = (var5_4 | var8_3) ^ 1954709316;
            break block56;
lbl7:
            // 1 sources

            while (true) {
                var7_5 = (var5_4 | var8_3) ^ 482266397;
                break block56;
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var6_6 ^= var7_5 ^ 1024851782;
                var7_5 = (var5_4 | var8_3) ^ 1136818227;
                break block56;
                break;
            }
lbl14:
            // 1 sources

            while (true) {
                var3_7 = gf.a;
                synchronized (var3_7) {
                    try {
                        var7_5 = (var5_4 | var8_3) ^ 368409802;
                        break block57;
lbl20:
                        // 1 sources

                        while (true) {
                            var6_6 ^= var7_5 ^ 759020995;
                            var7_5 = (var5_4 | var8_3) ^ -260154217;
                            break block57;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            if (!var2_2) ** GOTO lbl57
                            var7_5 = (var5_4 | var8_3) ^ 1673303784;
                            break block57;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var7_5 = (var5_4 | var8_3) ^ 1464449756;
                            break block57;
                            break;
                        }
lbl31:
                        // 1 sources

                        while (true) {
                            if (var1_1 == null) ** GOTO lbl57
                            var7_5 = (var5_4 | var8_3) ^ -643660033;
                            break block57;
                            break;
                        }
lbl35:
                        // 1 sources

                        while (true) {
                            var6_6 ^= var7_5 ^ -975709727;
                            var7_5 = (var5_4 | var8_3) ^ -1580969801;
                            break block57;
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            v0 = var1_1.lyrics();
                            block41: while (true) {
                                switch (var6_6) {
                                    case -1105288885: {
                                        var6_6 ^= -1223349020;
                                        continue block41;
                                    }
                                    default: {
                                        var6_6 ^= -452427716;
                                        break block41;
                                    }
                                    case 787497260: {
                                        var6_6 ^= 756402057;
                                        break block41;
                                    }
                                }
                                break;
                            }
                            v1 = new cw(v0, System.currentTimeMillis() + Math.max(-8761146296994487244L << 32 >>> 32 ^ (long)var6_6 & 0xFFFFFFFFL | (-8761146296994487244L >>> 32 ^ (long)var6_6 & 0xFFFFFFFFL) << 32, var1_1.ttlMs()));
                            var6_6 ^= 109060181;
                            gf.a.put(var0, v1);
lbl57:
                            // 3 sources

                            var7_5 = (var5_4 | var8_3) ^ -1561128291;
                            break block57;
                            break;
                        }
lbl59:
                        // 1 sources

                        while (true) {
                            var6_6 ^= var7_5 ^ 127444979;
                            var7_5 = (var5_4 | var8_3) ^ 1952005198;
                            break block57;
                            break;
                        }
lbl63:
                        // 1 sources

                        while (true) {
                            gf.a.remove(var0);
                            var7_5 = (var5_4 | var8_3) ^ -863329842;
                            break block57;
                            break;
                        }
lbl68:
                        // 1 sources

                        while (true) {
                            var6_6 ^= var7_5 ^ 740283052;
                            var7_5 = (var5_4 | var8_3) ^ -561294648;
                            break block57;
                            break;
                        }
lbl72:
                        // 1 sources

                        while (true) {
                            if (!var0.equals(gf.t)) ** GOTO lbl90
                            var7_5 = (var5_4 | var8_3) ^ -177674516;
                            break block57;
                            break;
                        }
lbl76:
                        // 1 sources

                        while (true) {
                            var6_6 ^= var7_5 ^ -1203026944;
                            var7_5 = (var5_4 | var8_3) ^ 913924982;
                            break block57;
                            break;
                        }
lbl80:
                        // 1 sources

                        while (true) {
                            gf.t = "";
                            var7_5 = (var5_4 | var8_3) ^ 602609662;
                            break block57;
                            break;
                        }
lbl84:
                        // 1 sources

                        while (true) {
                            var6_6 ^= var7_5 ^ 1858647314;
                            var7_5 = (var5_4 | var8_3) ^ 336081660;
                            break block57;
                            break;
                        }
lbl88:
                        // 1 sources

                        while (true) {
                            gf.a = null;
lbl90:
                            // 2 sources

                            var7_5 = (var5_4 | var8_3) ^ 1856797445;
                            break block57;
                            break;
                        }
lbl92:
                        // 1 sources

                        while (true) {
                            var6_6 ^= var7_5 ^ -484496641;
                            var7_5 = (var5_4 | var8_3) ^ -675494428;
                            break block57;
                            break;
                        }
lbl96:
                        // 1 sources

                        while (true) {
                            // MONITOREXIT @DISABLED, blocks:[0, 1, 34, 51] lbl97 : MonitorExitStatement: MONITOREXIT : var3_7
                            var6_6 ^= -812273960;
                            break;
                        }
                    }
                    catch (Throwable v2) {
                        var6_6 = (var5_4 | var8_3) ^ 1203794617;
                        var4_8 = v2;
                        // MONITOREXIT @DISABLED, blocks:[1, 34, 31] lbl103 : MonitorExitStatement: MONITOREXIT : var3_7
                        var6_6 ^= 1867433504;
                        throw var4_8;
                    }
                }
                var7_5 = (var5_4 | var8_3) ^ 183238871;
                ** GOTO lbl114
lbl-1000:
                // 1 sources

                {
                    block57: {
                        while (true) {
                            var6_6 ^= var7_5 ^ -1768152693;
                            var7_5 = (var5_4 | var8_3) ^ -1752576929;
                            break block57;
                            break;
                        }
lbl112:
                        // 1 sources

                        return;
                    }
                    block54: while (true) {
                        switch (var7_5) {
                            default: {
                                continue block54;
                            }
                            {
                                case -368540739: {
                                    ** continue;
                                }
                                case 260285408: {
                                    ** continue;
                                }
                                case -1673434721: {
                                    ** continue;
                                }
                                case -1464580693: {
                                    ** continue;
                                }
                                case 643791240: {
                                    ** continue;
                                }
                                case 1580838848: {
                                    ** continue;
                                }
                                case 1561259498: {
                                    ** continue;
                                }
                                case -1952136391: {
                                    ** continue;
                                }
                                case 863461049: {
                                    ** continue;
                                }
                                case 561425855: {
                                    ** continue;
                                }
                                case 177543579: {
                                    ** continue;
                                }
                                case -914056191: {
                                    ** continue;
                                }
                                case -602478455: {
                                    ** continue;
                                }
                                case -336212597: {
                                    ** continue;
                                }
                                case -1856928654: {
                                    ** continue;
                                }
                                case 675363475: {
                                    ** continue;
                                }
                            }
                            case -183369824: {
                                ** continue;
                            }
                            ** case 1752445736:
lbl154:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
        block55: while (true) {
            switch (var7_5) {
                default: {
                    continue block55;
                }
                case -1954578381: {
                    ** continue;
                }
                case -482135446: {
                    ** continue;
                }
                ** case -1136687292:
lbl165:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static br Tl(String var0, String var1_1, long var2_2) throws Exception {
        block86: {
            block87: {
                var13_3 = -1795655787;
                var10_4 = gf.b & -1795655787 ^ -894296213;
                var12_5 = 0;
                var11_6 = (var10_4 | var13_3) ^ 1519834990;
                var12_5 = (var10_4 | var13_3) ^ 550466802;
                break block87;
                while (true) {
                    var11_6 ^= -779170045;
                    v0 = new hI(List.copyOf(var9_7), false);
                    ** GOTO lbl25
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    var11_6 ^= -343752497;
                    var5_9 = var4_8.headers().firstValue(gf.g).map((Function<String, Long>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, Ts(java.lang.String ), (Ljava/lang/String;)Ljava/lang/Long;)()).orElse(v1 | (-3104374148631426003L >>> 32 ^ (long)v2 & 0xFFFFFFFFL) << 32);
                    break block86;
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    var12_5 = (var10_4 | var13_3) ^ 1741213738;
                    ** GOTO lbl188
                    while (true) {
                        var12_5 = (var10_4 | var13_3) ^ -524211463;
                        ** GOTO lbl188
lbl21:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl23:
                        // 1 sources

                        while (true) {
                            v0 = null;
lbl25:
                            // 2 sources

                            v3 = -1802248945949508575L << 32 >>> 32 ^ (long)(var11_6 ^= -1754114839) & 0xFFFFFFFFL;
                            v4 = new br(v0, v3 | (-1802248945949508575L >>> 32 ^ (long)var11_6 & 0xFFFFFFFFL) << 32);
                            var11_6 ^= 726080573;
                            return v4;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            var12_5 = (var10_4 | var13_3) ^ 558196554;
                            ** GOTO lbl121
                            break;
                        }
lbl33:
                        // 1 sources

                        while (true) {
                            var12_5 = (var10_4 | var13_3) ^ -526821988;
                            ** GOTO lbl188
lbl36:
                            // 1 sources

                            while (true) {
                                var12_5 = (var10_4 | var13_3) ^ 681139108;
                                ** GOTO lbl188
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var12_5 = (var10_4 | var13_3) ^ -1392287523;
                    break block87;
                    break;
                }
lbl42:
                // 3 sources

                while (true) {
                    var12_5 = (var10_4 | var13_3) ^ 1902153128;
                    ** GOTO lbl188
                    break;
                }
lbl45:
                // 1 sources

                while (true) {
                    var12_5 = (var10_4 | var13_3) ^ -129237075;
                    ** GOTO lbl121
                    break;
                }
lbl48:
                // 1 sources

                while (true) {
                    var12_5 = (var10_4 | var13_3) ^ 869619725;
                    ** GOTO lbl188
                    break;
                }
lbl51:
                // 1 sources

                while (true) {
                    var12_5 = (var10_4 | var13_3) ^ 2040465345;
                    ** GOTO lbl188
                    break;
                }
lbl54:
                // 1 sources

                while (true) {
                    if (!var9_7.isEmpty()) ** continue;
                    var11_6 ^= -779170045;
                    ** continue;
                    break;
                }
lbl58:
                // 1 sources

                while (true) {
                    block88: {
                        var12_5 = (var10_4 | var13_3) ^ 2017699258;
                        ** GOTO lbl188
                        var12_5 = (var10_4 | var13_3) ^ -1955442128;
                        block65: while (true) {
                            switch (var12_5) {
                                case 93148075: {
                                    if (!var7_12.isEmpty()) {
                                        var12_5 = (var10_4 | var13_3) ^ 830070333;
                                        continue block65;
                                    }
                                    ** GOTO lbl83
                                }
                                case -276586046: {
                                    var11_6 ^= var12_5 ^ -1229751802;
                                    var12_5 = (var10_4 | var13_3) ^ -531417224;
                                    continue block65;
                                }
                                case 1434987983: {
                                    var8_13 = gf.Tq(var5_10, gf.a);
                                    ** break;
                                }
                                case -787276069: {
                                    var11_6 ^= var12_5 ^ -75039440;
                                    ** continue;
                                }
lbl79:
                                // 1 sources

                                var11_6 ^= 223183190;
                                var9_7 = gf.To(var8_13);
                                var11_6 ^= 143209526;
                                ** continue;
lbl83:
                                // 1 sources

                                var12_5 = (var10_4 | var13_3) ^ 266952996;
                                continue block65;
                                case 1991580289: {
                                    var11_6 ^= var12_5 ^ 460443345;
                                    var12_5 = (var10_4 | var13_3) ^ -612946860;
                                }
                                default: {
                                    continue block65;
                                }
lbl90:
                                // 2 sources

                                while (true) {
                                    var12_5 = (var10_4 | var13_3) ^ 605802202;
                                    ** GOTO lbl188
                                    while (true) {
                                        var12_5 = (var10_4 | var13_3) ^ 158876993;
                                        break block88;
                                        break;
                                    }
lbl96:
                                    // 1 sources

                                    while (true) {
                                        var12_5 = (var10_4 | var13_3) ^ -442181764;
                                        ** GOTO lbl188
                                        break;
                                    }
                                    break;
                                }
lbl99:
                                // 1 sources

                                while (true) {
                                    var12_5 = (var10_4 | var13_3) ^ -1863496405;
                                    ** GOTO lbl188
lbl102:
                                    // 1 sources

                                    while (true) {
                                        var12_5 = (var10_4 | var13_3) ^ 1839003167;
                                        ** GOTO lbl188
                                        break;
                                    }
lbl105:
                                    // 1 sources

                                    while (true) {
                                        var7_12 = gf.Tn(var6_11);
                                        var12_5 = (var10_4 | var13_3) ^ -1471191682;
                                        continue block65;
                                        break;
                                    }
lbl109:
                                    // 1 sources

                                    while (true) {
                                        var12_5 = (var10_4 | var13_3) ^ 454967994;
                                        ** GOTO lbl188
                                        break;
                                    }
lbl112:
                                    // 1 sources

                                    while (true) {
                                        var12_5 = (var10_4 | var13_3) ^ -2041559905;
                                        break block88;
lbl115:
                                        // 1 sources

                                        while (true) {
                                            var12_5 = (var10_4 | var13_3) ^ 365427434;
                                            break block88;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                case 1051281543: 
                            }
                            break;
                        }
                        return new br(new hI(List.copyOf(var7_12), true), -2999337407720559996L << (var12_5 ^ 1051281575) >>> (var12_5 ^ 1051281575) ^ (long)var11_6 & 0xFFFFFFFFL | (-2999337407720559996L >>> (var12_5 ^ 1051281575) ^ (long)var11_6 & 0xFFFFFFFFL) << (var12_5 ^ 1051281575));
                    }
lbl122:
                    // 2 sources

                    block75: while (true) {
                        switch (var12_5) {
                            case -4253515: {
                                var6_11 = gf.Tq(var5_10, gf.j);
                                var11_6 ^= -827570380;
                                ** continue;
                            }
                            case -679331138: {
                                var12_5 = (var10_4 | var13_3) ^ 232791000;
                                continue block75;
                            }
                            case -753245145: {
                                if (var5_10.get(gf.r).getAsBoolean()) {
                                    ** continue;
                                }
                                ** GOTO lbl143
                            }
                            case 559963879: {
                                var11_6 ^= var12_5 ^ 623037303;
                                ** continue;
                            }
                            case -652285040: {
                                var11_6 ^= var12_5 ^ 1800966356;
                                ** continue;
                            }
                            case -885160683: {
                                if (var5_10.has(gf.r)) ** continue;
lbl143:
                                // 2 sources

                                var12_5 = (var10_4 | var13_3) ^ -6676200;
                            }
                            default: {
                                continue block75;
                            }
                            case 649166930: {
                                var11_6 ^= var12_5 ^ 858348246;
                                ** continue;
                            }
                            case 1487551328: 
                        }
                        return new br(null, 4459180664230800688L << (var12_5 ^ 1487551296) >>> (var12_5 ^ 1487551296) ^ (long)var11_6 & 0xFFFFFFFFL | (4459180664230800688L >>> (var12_5 ^ 1487551296) ^ (long)var11_6 & 0xFFFFFFFFL) << (var12_5 ^ 1487551296));
                    }
lbl151:
                    // 1 sources

                    while (true) {
                        var12_5 = (var10_4 | var13_3) ^ 1291671217;
                        ** GOTO lbl188
                        break;
                    }
                    break;
                }
            }
            block77: while (true) {
                switch (var12_5) {
                    default: {
                        continue block77;
                    }
                    case 1945706274: {
                        var4_8 = gf.Tm(var0, var1_1, var2_2);
                        break block77;
                    }
                    case -30078195: {
                        var12_5 = (var10_4 | var13_3) ^ -473735322;
                        continue block77;
                    }
                    case 1027154073: {
                        var11_6 ^= var12_5 ^ 1613226229;
                        ** continue;
                    }
                }
                break;
            }
            var12_5 = (var10_4 | var13_3) ^ -255951824;
            ** GOTO lbl188
lbl170:
            // 1 sources

            while (true) {
                v1 = -3104374148631426003L << 32 >>> 32 ^ (long)(var11_6 ^= 91343531) & 0xFFFFFFFFL;
                v2 = var11_6;
                ** continue;
                break;
            }
lbl175:
            // 1 sources

            while (true) {
                var12_5 = (var10_4 | var13_3) ^ 1697508992;
                ** GOTO lbl188
                break;
            }
            while (true) {
                var12_5 = (var10_4 | var13_3) ^ 1691389183;
                if (true) ** GOTO lbl188
                break;
            }
        }
        v5 = -2975410050367673382L << 32 >>> 32 ^ (long)(var11_6 ^= -371395403) & 0xFFFFFFFFL;
        return new br(null, Math.max(v5 | (-2975410050367673382L >>> 32 ^ (long)var11_6 & 0xFFFFFFFFL) << 32, var5_9 * (-2975410050367669318L << 32 >>> 32 ^ (long)var11_6 & 0xFFFFFFFFL | (-2975410050367669318L >>> 32 ^ (long)var11_6 & 0xFFFFFFFFL) << 32)));
        block81: while (true) {
            var12_5 = (var10_4 | var13_3) ^ -1697958331;
lbl188:
            // 18 sources

            block82: while (true) {
                switch (var12_5) {
                    default: {
                        continue block82;
                    }
                    case 579813041: {
                        var12_5 = (var10_4 | var13_3) ^ 278029505;
                        continue block82;
                    }
                    case -1497769403: {
                        if (var4_8.statusCode() == gf.Tv((var11_6 | var12_5 ^ 843165136) ^ (var12_5 ^ 2006897851), (var10_4 | var12_5 ^ 843165136) ^ ((var11_6 | var12_5 ^ 843165136) ^ (var12_5 ^ -1403651880)))) {
                            ** continue;
                        }
                        ** GOTO lbl259
                    }
                    case -161274789: {
                        ** continue;
                    }
                    case -1187860523: {
                        var11_6 ^= var12_5 ^ -58361281;
                        ** continue;
                    }
                    case 1144080826: {
                        gf.Tt();
                        ** continue;
                    }
                    case 1044075782: {
                        var11_6 ^= var12_5 ^ -301711327;
                        ** continue;
                    }
                    case -1845024434: {
                        var4_8 = gf.Tm(var0, var1_1, 0L);
                        ** GOTO lbl42
                    }
                    case -1285125664: {
                        if (var4_8.statusCode() != gf.Tv((var11_6 | var12_5 ^ 664731253) ^ (var12_5 ^ 1262686012), (var10_4 | var12_5 ^ 664731253) ^ ((var11_6 | var12_5 ^ 664731253) ^ (var12_5 ^ -805812392)))) ** GOTO lbl90
                        ** continue;
                    }
                    case -126899794: {
                        var11_6 ^= var12_5 ^ -986119963;
                        continue block81;
                    }
                    case -1171590400: {
                        var11_6 ^= var12_5 ^ -508884826;
                        ** continue;
                    }
                    case 1811877724: {
                        if (var4_8.statusCode() != gf.Tv((var11_6 | var12_5 ^ -16287543) ^ (var12_5 ^ -1730508407), (var10_4 | var12_5 ^ -16287543) ^ ((var11_6 | var12_5 ^ -16287543) ^ (var12_5 ^ -1857925941)))) ** GOTO lbl42
                        var12_5 = (var10_4 | var13_3) ^ -59424434;
                        continue block82;
                    }
                    case -832038082: {
                        if (var2_2 > 0L) ** break;
                        ** continue;
                        var12_5 = (var10_4 | var13_3) ^ 647353937;
                        continue block82;
                    }
                    case -974897851: {
                        var11_6 ^= var12_5 ^ -122514418;
                        ** continue;
                    }
                    case -315676686: {
                        var12_5 = (var10_4 | var13_3) ^ -219928286;
                        continue block82;
                    }
                    case -1486522306: {
                        var5_10 = JsonParser.parseString((String)var4_8.body()).getAsJsonObject();
                        var12_5 = (var10_4 | var13_3) ^ 132420719;
                        ** continue;
                    }
                    case 740185821: {
                        if (var4_8.body() != null) ** continue;
                        ** continue;
                    }
                    case -1143500417: {
                        var11_6 ^= var12_5 ^ 373483419;
                        ** continue;
                    }
                    case -85872347: {
                        var11_6 ^= var12_5 ^ -146092633;
                        ** continue;
                    }
                    case 113591906: {
                        var11_6 ^= var12_5 ^ 1799915636;
                        ** continue;
                    }
                    case -1348799913: {
                        var11_6 ^= var12_5 ^ 156270076;
                        ** continue;
                    }
                    case 1046686307: {
                        if (var4_8.statusCode() != gf.Tv((var11_6 | var12_5 ^ -1432658442) ^ (var12_5 ^ -2042516324), (var10_4 | var12_5 ^ -1432658442) ^ ((var11_6 | var12_5 ^ -1432658442) ^ (var12_5 ^ 418985628)))) ** continue;
                        ** continue;
                    }
lbl259:
                    // 1 sources

                    var12_5 = (var10_4 | var13_3) ^ -666945123;
                    continue block82;
                    case 776209359: {
                        var11_6 ^= var12_5 ^ 770921726;
                        var12_5 = (var10_4 | var13_3) ^ -1257934685;
                        continue block82;
                    }
                    case 996059267: {
                        return new br(null, 6067944756572618587L << (var12_5 ^ 996059299) >>> (var12_5 ^ 996059299) ^ (long)var11_6 & 0xFFFFFFFFL | (6067944756572618587L >>> (var12_5 ^ 996059299) ^ (long)var11_6 & 0xFFFFFFFFL) << (var12_5 ^ 996059299));
                    }
                    case 1310143188: 
                }
                break;
            }
            break;
        }
        return new br(null, -3740776237760117668L << (var12_5 ^ 1310143220) >>> (var12_5 ^ 1310143220) ^ (long)var11_6 & 0xFFFFFFFFL | (-3740776237760117668L >>> (var12_5 ^ 1310143220) ^ (long)var11_6 & 0xFFFFFFFFL) << (var12_5 ^ 1310143220));
    }

    /*
     * Unable to fully structure code
     */
    private static HttpResponse<String> Tm(String var0, String var1_1, long var2_2) throws Exception {
        block41: {
            block46: {
                block48: {
                    block47: {
                        block43: {
                            block45: {
                                block42: {
                                    block44: {
                                        break block47;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var9_5 = (var7_4 | var10_3) ^ -1483317998;
                                            break block41;
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            if (var2_2 <= 0L) ** GOTO lbl14
                                            ** GOTO lbl51
                                            break;
                                        }
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var9_5 = (var7_4 | var10_3) ^ -389717109;
                                            break block41;
                                            break;
                                        }
                                        {
                                            switch (var8_6) {
                                                case -1346998228: {
                                                    var8_6 ^= 1566001917;
                                                    break block20;
                                                }
lbl14:
                                                // 2 sources

                                                while (true) {
                                                    var9_5 = (var7_4 | var10_3) ^ 233858835;
                                                    break block41;
                                                    break;
                                                }
lbl17:
                                                // 2 sources

                                                block22: while (true) {
                                                    switch (var9_5) lbl-1000:
                                                    // 2 sources

                                                    {
                                                        while (true) {
                                                            default: {
                                                                continue block22;
                                                            }
                                                            break;
                                                        }
lbl22:
                                                        // 1 sources

                                                        return var6_8;
                                                        case 1180490756: {
                                                            v0 = new StringBuilder(gf.s);
                                                            continue block20;
                                                        }
lbl27:
                                                        // 1 sources

                                                        while (true) {
                                                            var9_5 = (var7_4 | var10_3) ^ -1599345679;
                                                            ** continue;
                                                            break;
                                                        }
lbl30:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_6 ^= 1582705032;
                                                            break block42;
                                                            break;
                                                        }
lbl33:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_6 ^= 1492143754;
                                                            ** continue;
                                                            break;
                                                        }
                                                        case -916679210: {
                                                            break block43;
                                                        }
                                                        default: {
                                                            var8_6 ^= 936451813;
                                                            continue block20;
                                                        }
lbl41:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_7 = v0.append(gf.i).append(gf.Tr(var0)).append(gf.q).append(gf.Tr(var1_1));
                                                            ** continue;
                                                            break;
                                                        }
lbl44:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_7.append(gf.e).append(Math.max(1L, Math.round((double)var2_2 / 1000.0)));
                                                            ** continue;
                                                            break;
                                                        }
lbl48:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_6 ^= 1127719913;
                                                            break block44;
                                                            break;
                                                        }
lbl51:
                                                        // 1 sources

                                                        var9_5 = (var7_4 | var10_3) ^ 132440639;
                                                        break block41;
lbl53:
                                                        // 1 sources

                                                        while (true) {
                                                            var6_8 = null;
                                                            ** continue;
                                                            break;
                                                        }
lbl56:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_6 ^= 1307650382;
                                                            ** continue;
                                                            break;
                                                        }
                                                        case 448014496: {
                                                            var8_6 ^= var9_5 ^ 165721682;
                                                            break block22;
                                                        }
                                                    }
                                                    break;
                                                }
                                                ** continue;
lbl63:
                                                // 1 sources

                                                while (true) {
                                                    ** GOTO lbl71
                                                    break;
                                                }
lbl65:
                                                // 1 sources

                                                while (true) {
                                                    var8_6 ^= -597041680;
                                                    ** continue;
                                                    break;
                                                }
lbl68:
                                                // 1 sources

                                                while (true) {
                                                    var8_6 ^= var9_5 ^ -748604712;
                                                    break block45;
                                                    break;
                                                }
lbl71:
                                                // 1 sources

                                                var8_6 ^= 1138264813;
                                                break block46;
                                                case -552738477: {
                                                    var8_6 ^= 596647097;
                                                    break block20;
                                                }
                                            }
                                        }
                                        ** while (true)
                                    }
                                    var8_6 ^= -1527258878;
                                    ** while (true)
lbl80:
                                    // 1 sources

                                    while (true) {
                                        var8_6 ^= -1313480041;
                                        ** continue;
                                        break;
                                    }
lbl83:
                                    // 1 sources

                                    while (true) {
                                        var8_6 ^= -1799762851;
                                        ** continue;
                                        break;
                                    }
lbl86:
                                    // 1 sources

                                    while (true) {
                                        var8_6 ^= var9_5 ^ 677565240;
                                        ** continue;
                                        break;
                                    }
                                }
                                var8_6 ^= 979440140;
                                break block48;
lbl92:
                                // 1 sources

                                while (true) {
                                    var9_5 = (var7_4 | var10_3) ^ 799777315;
                                    ** GOTO lbl17
                                    break;
                                }
                            }
                            var9_5 = (var7_4 | var10_3) ^ 1658519231;
                            break block41;
                        }
                        var9_5 = (var7_4 | var10_3) ^ -62709931;
                        ** while (true)
                    }
                    var10_3 = -2035870443;
                    var7_4 = gf.b & -2035870443 ^ 1615999969;
                    var9_5 = 0;
                    var8_6 = (var7_4 | var10_3) ^ 716064852;
                    ** while (true)
                }
                var5_9 = HttpRequest.newBuilder(URI.create(var4_7.toString())).timeout(gf.a).header(gf.b, gf.d).header(gf.l, gf.o).GET().build();
                ** while (true)
            }
            HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8);
            ** while (true)
        }
        block40: while (true) {
            switch (var9_5) {
                default: {
                    continue block40;
                }
                case 1096903399: {
                    ** continue;
                }
                case 1771105595: {
                    ** continue;
                }
                case -2077374134: {
                    ** continue;
                }
                case -351842074: {
                    ** continue;
                }
                case 238179454: {
                    ** continue;
                }
                ** case -518793782:
lbl129:
                // 1 sources

                break;
            }
            var9_5 = (var7_4 | var10_3) ^ -1889019186;
        }
    }

    /*
     * Exception decompiling
     */
    private static List<fF> Tn(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [116[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static List<fF> To(String var0) {
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
    private static String Tp(String var0) {
        var4_1 = -1307760062;
        var1_2 = gf.b & -1307760062 ^ 1268133599;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1846062583;
        var3_3 = (var1_2 | var4_1) ^ -1788386829;
        if (true) ** GOTO lbl-1000
        while (true) lbl-1000:
        // 4 sources

        {
            block11: {
                switch (var3_3) {
                    case -928460011: {
                        if (var0 == null) {
                            ** break;
                        }
                        break block11;
                    }
                    case -85327058: {
                        return "";
                    }
                    case 1311718423: {
                        var2_4 ^= var3_3 ^ -1147435043;
                        var3_3 = (var1_2 | var4_1) ^ 1655231364;
                        break;
                    }
                    case 1861766956: {
                        var3_3 = (var1_2 | var4_1) ^ 866367338;
                        break;
                    }
lbl22:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1608728936;
                    break;
                    case -1724383909: {
                        return gf.c.matcher(var0).replaceAll("").strip();
                    }
                    case -1535348809: {
                        var2_4 ^= var3_3 ^ -948800730;
                        var3_3 = (var1_2 | var4_1) ^ 24456689;
                        break;
                    }
                    case -935552587: {
                        var2_4 ^= var3_3 ^ 1857411047;
                        var3_3 = (var1_2 | var4_1) ^ 859307466;
                    }
                }
                continue;
            }
            var3_3 = (var1_2 | var4_1) ^ -1246752056;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String Tq(JsonObject var0, String var1_1) {
        block27: {
            var6_2 = 1933801117;
            var3_3 = gf.b & 1933801117 ^ -536423732;
            var5_4 = 0;
            var4_6 = (var3_3 | var6_2) ^ 582233407;
            var5_4 = (var3_3 | var6_2) ^ -1480039779;
            if (true) ** GOTO lbl18
lbl7:
            // 2 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -1886661471;
                break block27;
                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ -354008351;
                    break block27;
                    break;
                }
                break;
            }
            block23: while (true) {
                var5_4 = (var3_3 | var6_2) ^ 75176632;
                if (true) ** GOTO lbl18
                block24: while (true) {
                    var5_4 = (var3_3 | var6_2) ^ 1416066855;
lbl18:
                    // 3 sources

                    block25: while (true) {
                        switch (var5_4) {
                            default: {
                                continue block25;
                            }
                            case -1519112017: {
                                if (!var0.has(var1_1)) continue block23;
                                var5_4 = (var3_3 | var6_2) ^ -1740084015;
                                continue block25;
                            }
                            case 1160252051: {
                                var4_6 ^= var5_4 ^ -916210535;
                                var5_4 = (var3_3 | var6_2) ^ 1446233714;
                                continue block25;
                            }
                            case -839193363: {
                                var2_5 = var0.get(var1_1).getAsString();
                                var5_4 = (var3_3 | var6_2) ^ -1724138434;
                                break block23;
                            }
                            case -1491041798: {
                                var4_6 ^= var5_4 ^ 1844126551;
                                var5_4 = (var3_3 | var6_2) ^ 1052580400;
                                continue block25;
                            }
                            case -147002267: {
                                var4_6 ^= var5_4 ^ -1293273559;
                                var5_4 = (var3_3 | var6_2) ^ -1459469442;
                                continue block25;
                            }
                            case 1796184588: {
                                var5_4 = (var3_3 | var6_2) ^ -497718039;
                                continue block25;
                            }
                            case 1418695744: {
                                var5_4 = (var3_3 | var6_2) ^ -1234174898;
                                continue block25;
                            }
                            case 1514517923: {
                                return null;
                            }
                            case 286431796: {
                                if (!var0.get(var1_1).isJsonNull()) continue block24;
                                continue block23;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        }
        block26: while (true) {
            switch (var5_4) {
                default: {
                    continue block26;
                }
                case 430027836: {
                    var4_6 ^= var5_4 ^ 1941502119;
                    var5_4 = (var3_3 | var6_2) ^ -502035699;
                    continue block26;
                }
                case 0x7CCC227C: {
                    var4_6 ^= var5_4 ^ 383086311;
                    var5_4 = (var3_3 | var6_2) ^ 367946414;
                    continue block26;
                }
                case 993952207: {
                    if (var2_5 == null) ** GOTO lbl7
                    var5_4 = (var3_3 | var6_2) ^ 1640748724;
                    continue block26;
                }
                case -1524711023: {
                    if (!var2_5.isBlank()) ** continue;
                    ** continue;
                }
                case -1836310423: {
                    var5_4 = (var3_3 | var6_2) ^ 1448687436;
                    continue block26;
                }
                case -425091981: {
                    v0 = null;
                    break block26;
                }
                case 1786530531: {
                    var4_6 ^= var5_4 ^ -1688385327;
                    var5_4 = (var3_3 | var6_2) ^ -931563758;
                    continue block26;
                }
                case 290749904: {
                    v0 = var2_5;
                }
            }
            break;
        }
        var4_6 ^= 2145412797;
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    private static String Tr(String var0) {
        block15: {
            block16: {
                var4_1 = -1853350297;
                var1_2 = gf.b & -1853350297 ^ -1880831030;
                var3_3 = 0;
                ** GOTO lbl19
lbl5:
                // 4 sources

                block9: while (true) {
                    block0 : switch (var3_3) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            default: {
                                continue block9;
                            }
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1920928679;
                            ** GOTO lbl-1000
                            break;
                        }
lbl13:
                        // 2 sources

                        while (true) {
                            var2_4 ^= -2121471132;
                            break block0;
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 359274522;
                            ** GOTO lbl-1000
                            break;
                        }
lbl19:
                        // 1 sources

                        var2_4 = (var1_2 | var4_1) ^ -268503070;
                        break block15;
                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1361572708;
                            ** continue;
                            break;
                        }
                        case -1970878475: {
                            v0 = "";
                            ** GOTO lbl13
                        }
                        case -1586427135: {
                            if (var0 != null) ** continue;
                            break block9;
                        }
                        case 115768210: {
                            break;
                        }
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ -300052226;
                ** GOTO lbl5
                {
                    case -309078968: {
                        v0 = var0;
                        ** continue;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 132851589;
                ** GOTO lbl5
                {
                    case 1911639825: {
                        var2_4 ^= var3_3 ^ -343412931;
                        ** continue;
                    }
                    case -1744308118: {
                        var2_4 ^= var3_3 ^ 1376586601;
                        break block16;
                    }
                }
                return URLEncoder.encode(v0, StandardCharsets.UTF_8);
            }
            var3_3 = (var1_2 | var4_1) ^ 1050531054;
            ** GOTO lbl5
        }
        var3_3 = (var1_2 | var4_1) ^ -1727355779;
        ** while (true)
        {
            ** case -825545589:
        }
lbl53:
        // 1 sources

        var2_4 ^= var3_3 ^ 1421708455;
        ** while (true)
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static long Ts(String var0) {
        var5_1 = 1117008696;
        var2_2 = gf.b & 1117008696 ^ 508098183;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ 1692622491;
        var4_3 = (var2_2 | var5_1) ^ 171144190;
        if (true) ** GOTO lbl9
        {
            block7: while (true) {
                var4_3 = (var2_2 | var5_1) ^ -1397033226;
lbl9:
                // 2 sources

                block8: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block8;
                        }
                        case 1424983105: {
                            continue block7;
                        }
                        case -228196023: {
                            var3_4 ^= var4_3 ^ -406492759;
                            var4_3 = (var2_2 | var5_1) ^ 294936086;
                            continue block8;
                        }
                        case 1330162089: 
                    }
                    break;
                }
                break;
            }
            var3_4 ^= 246332811;
            return Math.max(0L, Long.parseLong(var0));
        }
    }

    /*
     * Exception decompiling
     */
    private static void Tt() throws InterruptedException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[MONITOR]], but top level block is 51[UNCONDITIONALDOLOOP]
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
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Tu(String string, String string2, String string3, long l2) {
        int n2 = b & 0x6B86554B ^ 0x9B42BF22;
        int n3 = 0;
        int n4 = (n2 | 0x6B86554B) ^ 0xCB03EBCD;
        n3 = (n2 | 0x6B86554B) ^ 0xE0FF76C5;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -192139818: {
                    gf.Tj(string, string2, string3, l2);
                    return;
                }
                case 456755630: {
                    n3 = (n2 | 0x6B86554B) ^ 0x31E9BBA4;
                    continue block5;
                }
                case -902871857: 
            }
            n4 ^= n3 ^ 0xF240EA14;
            n3 = (n2 | 0x6B86554B) ^ 0xF4AD2BD;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var2 = -858172340;
        gf.b = mK.a(MethodHandles.lookup().lookupClass(), 744497331);
        var1_1 = 0;
        var0_2 = -1116203490;
        var1_1 = var2 ^ 828298333;
        ** GOTO lbl94
lbl7:
        // 1 sources

        while (true) {
            var1_1 = var2 ^ -726311257;
            ** GOTO lbl94
lbl10:
            // 1 sources

            while (true) {
                var0_2 ^= 341490726;
                var0_2 ^= 841902008;
                var0_2 ^= 1026824536;
                gf.a = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(v0 | (-1910604923486328076L >>> (var1_1 ^ 1825643848) ^ (long)v1 & 0xFFFFFFFFL) << (var1_1 ^ 1825643848))).followRedirects(HttpClient.Redirect.NORMAL).build();
                var1_1 = var2 ^ 773787750;
                if (true) ** GOTO lbl94
                break;
            }
            break;
        }
        block27: while (true) {
            var1_1 = var2 ^ -913427254;
            ** GOTO lbl94
lbl20:
            // 1 sources

            while (true) {
                var1_1 = var2 ^ -1872029648;
                ** GOTO lbl94
                break;
            }
lbl23:
            // 1 sources

            while (true) {
                v2 = 6583385998141079215L << 32 >>> 32 ^ (long)(var0_2 ^= 1038919555) & 0xFFFFFFFFL;
                gf.d = v2 | (6583385998141079215L >>> 32 ^ (long)var0_2 & 0xFFFFFFFFL) << 32;
                gf.c = 6583385998088812143L << 32 >>> 32 ^ (long)var0_2 & 0xFFFFFFFFL | (6583385998088812143L >>> 32 ^ (long)var0_2 & 0xFFFFFFFFL) << 32;
                gf.a = 6583385998088794407L << 32 >>> 32 ^ (long)var0_2 & 0xFFFFFFFFL | (6583385998088794407L >>> 32 ^ (long)var0_2 & 0xFFFFFFFFL) << 32;
                gf.a = gf.Tv((var0_2 | var2) ^ -234549278, var2 ^ ((var0_2 | var2) ^ -582232438));
                gf.s = gj.decode("EcEa5/QH8t0usNIm6rTdsjSa4+KGDbUHbhA=", gf.Tv((var0_2 | var2) ^ -234549279, var2 ^ ((var0_2 | var2) ^ 835094599)));
                gf.d = gj.decode("zfbcB7qFCiRG1H4z/YVF5JNuYBmYIyZxTFGqHG0eG/5ce8463XxFPJP4sDklBwI=", gf.Tv((var0_2 | var2) ^ -234549280, var2 ^ ((var0_2 | var2) ^ 1508383256)));
                gf.g = gj.decode("CUamuT9+kMwLlvY=", gf.Tv((var0_2 | var2) ^ -234549265, var2 ^ ((var0_2 | var2) ^ 1807585419)));
                gf.r = gj.decode("pGQnt3+rzQdKj/yL", gf.Tv((var0_2 | var2) ^ -234549266, var2 ^ ((var0_2 | var2) ^ 166540529)));
                gf.j = gj.decode("L/EOmMUuUil0CMjA", gf.Tv((var0_2 | var2) ^ -234549267, var2 ^ ((var0_2 | var2) ^ 578561909)));
                gf.a = gj.decode("vynjPbvC4FVG9II=", gf.Tv((var0_2 | var2) ^ -234549268, var2 ^ ((var0_2 | var2) ^ -514409620)));
                gf.i = gj.decode("hR2R7IMKgXINUQAeMQ==", gf.Tv((var0_2 | var2) ^ -234549269, var2 ^ ((var0_2 | var2) ^ -925856959)));
                gf.q = gj.decode("WkrPCnmhHP98YIv/", gf.Tv((var0_2 | var2) ^ -234549270, var2 ^ ((var0_2 | var2) ^ 1037315534)));
                gf.e = gj.decode("oaeLZn3BPO+8OA==", gf.Tv((var0_2 | var2) ^ -234549271, var2 ^ ((var0_2 | var2) ^ -1333292065)));
                gf.b = gj.decode("l6Mg/+jmyHnByg==", gf.Tv((var0_2 | var2) ^ -234549272, var2 ^ ((var0_2 | var2) ^ -544879293)));
                gf.l = gj.decode("O5G43iQJGxcct0npjQ==", gf.Tv((var0_2 | var2) ^ -234549257, var2 ^ ((var0_2 | var2) ^ -316314436)));
                gf.o = gj.decode("NsiPk6b8SA2ZpibAIOfb", gf.Tv((var0_2 | var2) ^ -234549258, var2 ^ ((var0_2 | var2) ^ 1063220630)));
                gf.m = gj.decode("Hy8=", gf.Tv((var0_2 | var2) ^ -234549259, var2 ^ ((var0_2 | var2) ^ 982712817)));
                gf.p = gj.decode("t1HUsOeIrUXTO/Z9yCYdiwNKMjo=", gf.Tv((var0_2 | var2) ^ -234549260, var2 ^ ((var0_2 | var2) ^ -103358725)));
                gf.f = gj.decode("S860vuzWwNncQaeALW2cGZrvUQgI0AfEo+JpxyckZzM6daI=", gf.Tv((var0_2 | var2) ^ -234549261, var2 ^ ((var0_2 | var2) ^ 2037744636)));
                gf.n = gj.decode("jSXiVbQKbDhfNGjzvUWmuuUEdMtP", gf.Tv((var0_2 | var2) ^ -234549262, var2 ^ ((var0_2 | var2) ^ 317708977)));
                gf.k = gj.decode("rh48RdmTi9WIzDajwrO0OlQexu8vc7Y5vA5wl+Y=", gf.Tv((var0_2 | var2) ^ -234549263, var2 ^ ((var0_2 | var2) ^ 1148085702)));
                gf.c = gf.s;
                gf.h = gf.d;
                var1_1 = var2 ^ 1362243802;
                if (true) ** GOTO lbl94
                break;
            }
            block30: while (true) {
                var1_1 = var2 ^ -690001323;
                ** GOTO lbl94
lbl56:
                // 1 sources

                while (true) {
                    var1_1 = var2 ^ -873971708;
                    ** GOTO lbl94
lbl59:
                    // 1 sources

                    while (true) {
                        var1_1 = var2 ^ 990738998;
                        ** GOTO lbl94
lbl62:
                        // 1 sources

                        while (true) {
                            var1_1 = var2 ^ -2096229256;
                            if (true) ** GOTO lbl94
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl65:
                // 1 sources

                while (true) {
                    var0_2 ^= 1199122961;
                    var0_2 ^= 1846937508;
                    v3 = ((var0_2 ^= 1142337500) | var2) ^ 1677683455 ^ gf.b;
                    var0_2 ^= 1678795785;
                    gf.a[v4] = ((v5[v6] & 255) << 24 | ((v5[v6 + 1] & 255) << 16 | ((v5[v6 + 2] & 255) << 8 | v5[v6 + 3] & 255))) ^ v3;
                    v4 = v4 + 1;
                    v5 = v5;
                    v6 = v6 + 4;
                    var0_2 ^= -1422742042;
                    if (v6 + 4 >= v5.length) {
                        ** continue;
                    }
                    ** GOTO lbl170
                    break;
                }
                block35: while (true) {
                    var1_1 = var2 ^ 467570756;
lbl94:
                    // 11 sources

                    block36: while (true) {
                        switch (var1_1) {
                            case 436616729: {
                                v4 = 0;
                                v6 = 0;
                                gf.a = new int[((var0_2 ^= -986762105) | var2) ^ -319031948];
                                var0_2 ^= 1187225604;
                                v5 = "\u0086&\u00d2iTu;A\u0011\u0006\u008d+\u000b\u0005P\u00a3\u00f8\n;\u0090\u00b2\u00d3\u00ebdS\u00b6\u0084\u0007\u000f\u00d8\u00c3\u0007\u00f3\u00c0\u00ed\u00c8\u00be!\u0015\u0011/\u0005\u0093K\u00ee\u0081T@\u00dd=\u00cf\u00e4\u00dc\u0095\u001e^Q?/naN\u00e0\u0010\u00ee;E(\u0013\u00de\u00fb\u001a\u0011\n\u00ee\u00e3:\u00d1\u00b3f\u0087\u00c5+\u0097y\u00ff\u00e6k/N\u008c\u009b,8\u00df\u00c7".getBytes("ISO-8859-1");
                                ** break;
                            }
                            case -396786203: {
                                var0_2 ^= var1_1 ^ 569850342;
                                var1_1 = var2 ^ 1630600852;
                                continue block36;
                            }
                            case -490322902: {
                                var0_2 ^= var1_1 ^ 436463011;
                                var1_1 = var2 ^ 1242455515;
                                continue block36;
                            }
                            case -137089414: {
                                gf.a = new hi(gf.Tv((var0_2 | var1_1 ^ 990738998) ^ (var1_1 ^ 636985883), var1_1 ^ 990738998 ^ ((var0_2 | var1_1 ^ 990738998) ^ (var1_1 ^ -1806544944))), 0.75f, true);
                                var1_1 = var2 ^ 179681942;
                                continue block36;
                            }
                            case -2032727657: {
                                gf.a = Executors.newSingleThreadExecutor((ThreadFactory)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Runnable;)Ljava/lang/Thread;, Tw(java.lang.Runnable ), (Ljava/lang/Runnable;)Ljava/lang/Thread;)());
                                var1_1 = var2 ^ 612422057;
                                continue block36;
                            }
                            case 1405596274: {
                                var0_2 ^= var1_1 ^ 1383831327;
                                var1_1 = var2 ^ 952549568;
                                continue block36;
                            }
                            case -965939494: {
                                var0_2 ^= var1_1 ^ 1020271950;
                                var1_1 = var2 ^ 514262972;
                                continue block36;
                            }
                            case 89612422: {
                                gf.a = Duration.ofSeconds(-1520828351996694877L << (var1_1 ^ 89612454) >>> (var1_1 ^ 89612454) ^ (long)var0_2 & 0xFFFFFFFFL | (-1520828351996694877L >>> (var1_1 ^ 89612454) ^ (long)var0_2 & 0xFFFFFFFFL) << (var1_1 ^ 89612454));
                                var1_1 = var2 ^ -1552341213;
                                continue block36;
                            }
                            case -199256948: {
                                gf.t = "";
                                return;
                            }
                            case 409733867: {
                                gf.c = Pattern.compile(gf.k);
                                var1_1 = var2 ^ 1457027643;
                                continue block36;
                            }
                            case -763472912: {
                                gf.a = new HashSet<E>();
                                var1_1 = var2 ^ -1625364930;
                                continue block36;
                            }
                            case -41451503: {
                                ** break;
                            }
                            case 120656968: {
                                var0_2 ^= var1_1 ^ -610795034;
                                ** continue;
                            }
                            case -687356920: {
                                var0_2 ^= var1_1 ^ -336898865;
                                ** continue;
                            }
                            case 1825643880: {
                                v0 = -1910604923486328076L << (var1_1 ^ 1825643848) >>> (var1_1 ^ 1825643848) ^ (long)var0_2 & 0xFFFFFFFFL;
                                v1 = var0_2;
                                ** continue;
                            }
                            case 1179156143: {
                                gf.a = Pattern.compile(gf.f);
                                ** continue;
                            }
lbl159:
                            // 1 sources

                            var1_1 = var2 ^ 431487227;
                            continue block36;
                            case 1555188860: {
                                var0_2 ^= var1_1 ^ 1980127002;
                                ** continue;
                            }
                            case -1377195304: {
                                gf.a = new Object();
                                continue block35;
                            }
                            case 1339506740: {
                                gf.b = Pattern.compile(gf.n, 2);
                                ** continue;
                            }
lbl170:
                            // 2 sources

                            var0_2 ^= -2111213695;
                            var0_2 ^= -382686414;
                            var0_2 ^= -711062105;
                            var0_2 ^= 484213394;
                            ** continue;
                            case -714167113: {
                                var0_2 ^= var1_1 ^ -1924502778;
                                continue block30;
                            }
                            case 1872786287: {
                                var0_2 ^= var1_1 ^ 293461245;
                                var1_1 = var2 ^ -1970197789;
                            }
                            default: {
                                continue block36;
                            }
                            case -1645517674: {
                                var0_2 ^= var1_1 ^ 743663762;
                                continue block27;
                            }
                            case -1711198601: 
                        }
                        var0_2 ^= var1_1 ^ 492391287;
                        var1_1 = var2 ^ -1610069724;
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    private static int Tv(int n2, int n3) {
        int n4 = -1910087748;
        int n5 = 932400202;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x926FA6F6)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xBFB717DE;
        n6 -= (n5 | n4) ^ 0xBFB7C274;
        n6 -= (n5 | n4) ^ 0xBFB7A281;
        n6 ^= (n5 | n4) ^ 0xBFB7684E;
        n6 += (n5 | n4) ^ 0xBFB75981;
        n6 -= (n5 | n4) ^ 0xBFB7C098;
        return n6 -= (n5 | n4) ^ 0xBFB766B4;
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ Thread Tw(Runnable var0) {
        var5_1 = 553431185;
        var2_2 = gf.b & 553431185 ^ 1538214127;
        var4_3 = 0;
        if (true) ** GOTO lbl29
        block11: while (true) {
            switch (var4_3) lbl-1000:
            // 4 sources

            {
                default: {
                    continue block11;
                }
lbl9:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 1176809264;
                    ** GOTO lbl-1000
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ -1846409596;
                    ** GOTO lbl24
                    break;
                }
                case -1156556698: {
                    var1_5 = new Thread(var0, gf.p);
                    var4_3 = (var2_2 | var5_1) ^ -1079221624;
                    ** GOTO lbl32
                }
lbl19:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ 1927803984;
                    ** GOTO lbl45
                    break;
                }
lbl22:
                // 1 sources

                return var1_5;
lbl24:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 1269604099;
                ** GOTO lbl32
lbl26:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 164584304;
                    ** GOTO lbl32
                    break;
                }
lbl29:
                // 1 sources

                var3_4 = (var2_2 | var5_1) ^ -385408224;
                var4_3 = (var2_2 | var5_1) ^ -284626537;
                ** GOTO lbl-1000
lbl32:
                // 4 sources

                block18: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block18;
                        }
                        case 1915790223: {
                            ** continue;
                        }
                        case -1001153929: {
                            ** continue;
                        }
                        case 810772476: {
                            ** continue;
                        }
                        case 284894172: 
                    }
                    var1_5.setDaemon(true);
                    ** continue;
                    break;
                }
lbl45:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 1795480355;
                ** continue;
                case 1037785039: {
                    var3_4 ^= var4_3 ^ 1803988313;
                    var4_3 = (var2_2 | var5_1) ^ -1058037607;
                    ** GOTO lbl-1000
                }
                case -1795749528: 
            }
            break;
        }
        ** while (true)
    }
}

