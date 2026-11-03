/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.fv;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class fM
extends Record {
    private final String a;
    private static final /* synthetic */ String b;
    private final long a;
    private final String c;
    private static final int a;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private final String g;
    private static final int b;
    private final String h;
    private static final int c;
    private static final /* synthetic */ String i;
    private final String j;
    private final String k;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private final List<fv> a;
    private static final int d;
    private static final /* synthetic */ String o;
    private static final int[] a;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    public static final int e;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String t;

    /*
     * Exception decompiling
     */
    public fM(String var1_1, String var2_2, String var3_3, String var4_4, String var5_5, String var6_6, long var7_7, List<fv> var9_8) {
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
    private static String text(String var0) {
        var5_1 = 1709939487;
        var2_2 = fM.e & 1709939487 ^ 517285784;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ 512872271;
        var4_3 = (var2_2 | var5_1) ^ 1302120000;
        if (true) ** GOTO lbl77
        {
            var4_3 = (var2_2 | var5_1) ^ -1325168694;
            block22: while (true) {
                switch (var4_3) {
                    case -1134394761: {
                        if (var1_4.length() < 2) {
                            var4_3 = (var2_2 | var5_1) ^ 23488203;
                            continue block22;
                        }
                        ** GOTO lbl42
                    }
                    case 1061405068: {
                        var3_5 ^= var4_3 ^ -1119963526;
                        var4_3 = (var2_2 | var5_1) ^ 370100768;
                        ** GOTO lbl43
                    }
                    case 880627739: {
                        var3_5 ^= var4_3 ^ -1559715536;
                        var4_3 = (var2_2 | var5_1) ^ -1013105176;
                        ** GOTO lbl43
                    }
                    case 2124011860: {
                        var3_5 ^= var4_3 ^ 1523757186;
                        var4_3 = (var2_2 | var5_1) ^ 263434573;
                        ** GOTO lbl43
                    }
                    case -1583824161: {
                        if (var1_4.length() > fM.fE((var3_5 | var4_3 ^ -999073344) ^ (var4_3 ^ -2132417464), (var2_2 | var4_3 ^ -999073344) ^ ((var3_5 | var4_3 ^ -999073344) ^ (var4_3 ^ 557045019)))) {
                            continue block21;
                        }
                        ** GOTO lbl49
                    }
                    case 1777399231: {
                        v0 = var1_4;
                        ** GOTO lbl45
                    }
                    case 801319373: {
                        v0 = var1_4.substring(0, fM.fE((var3_5 | var4_3 ^ 1244181202) ^ (var4_3 ^ -1934988357), (var2_2 | var4_3 ^ 1244181202) ^ ((var3_5 | var4_3 ^ 1244181202) ^ (var4_3 ^ 860664941))));
                        ** GOTO lbl45
                    }
                    case -822331307: {
                        var3_5 ^= var4_3 ^ 1283542947;
                        ** GOTO lbl47
                    }
                    case 1884032722: {
                        return null;
                    }
lbl42:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -621466293;
lbl43:
                    // 7 sources

                    default: {
                        continue block22;
                    }
lbl45:
                    // 2 sources

                    var3_5 ^= 1830976684;
                    return v0;
lbl47:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 1346147922;
                    continue block22;
lbl49:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 1086094867;
                    continue block22;
                    case -1526033708: 
                }
                break;
            }
        }
        var3_5 ^= var4_3 ^ -168436425;
        var4_3 = (var2_2 | var5_1) ^ -563643072;
        ** GOTO lbl43
        block24: while (true) {
            block28: {
                block27: {
                    block29: {
                        switch (var4_3) {
                            case 1053333401: {
                                if (var0 != null) break block27;
                                break block28;
                            }
                            case -153964223: {
                                var3_5 ^= var4_3 ^ 1458297796;
                                break block29;
                            }
                            case 1323972138: {
                                var3_5 ^= var4_3 ^ 1650317591;
                                var4_3 = (var2_2 | var5_1) ^ -480505748;
                                ** break;
                            }
                            case -1666994189: {
                                var1_4 = var0.trim();
                                var4_3 = (var2_2 | var5_1) ^ 1266872196;
                                ** GOTO lbl43
                            }
                            case 845380063: {
                                var4_3 = (var2_2 | var5_1) ^ -1993535778;
                                continue block24;
                            }
                            case 1691438145: {
                                var3_5 ^= var4_3 ^ 1878504885;
                                var4_3 = (var2_2 | var5_1) ^ -40757885;
                            }
lbl77:
                            // 4 sources

                            default: {
                                continue block24;
                            }
                            case -2106742244: 
                        }
                        return null;
                    }
                    var4_3 = (var2_2 | var5_1) ^ 1094133766;
                    continue;
                }
                var4_3 = (var2_2 | var5_1) ^ 823495093;
                continue;
            }
            var4_3 = (var2_2 | var5_1) ^ 456061918;
        }
    }

    /*
     * Exception decompiling
     */
    private static String key(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[CASE]], but top level block is 9[SWITCH]
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
    private static List<fv> fD(List<fv> var0) {
        block105: {
            block107: {
                block106: {
                    block104: {
                        var10_1 = 642545261;
                        var7_2 = fM.e & 642545261 ^ -2073049405;
                        var9_3 = 0;
                        var8_4 = (var7_2 | var10_1) ^ 1730480951;
                        var9_3 = (var7_2 | var10_1) ^ -1134422797;
                        ** GOTO lbl104
                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ 816372946;
                            ** GOTO lbl104
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ 40024171;
                            ** GOTO lbl204
                            break;
                        }
lbl13:
                        // 2 sources

                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ 20363862;
                            break block104;
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ -652092826;
                            ** GOTO lbl204
                            break;
                        }
lbl19:
                        // 1 sources

                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ -1288835232;
                            break block104;
                            while (true) {
                                var9_3 = (var7_2 | var10_1) ^ 1684798418;
                                break block104;
                                break;
                            }
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ 1425679328;
                            ** GOTO lbl204
                            break;
                        }
lbl28:
                        // 2 sources

                        while (true) {
                            var8_4 ^= -436409493;
                            var6_10 = v0;
                            var9_3 = (var7_2 | var10_1) ^ -1846039404;
                            ** GOTO lbl204
                            break;
                        }
                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ -1426489463;
                            break block105;
                            break;
                        }
                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ 1361100045;
                            break block105;
                            break;
                        }
lbl39:
                        // 2 sources

                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ 1715761828;
                            ** GOTO lbl204
                            break;
                        }
lbl42:
                        // 1 sources

                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ -345725127;
                            break block105;
lbl45:
                            // 1 sources

                            while (true) {
                                var9_3 = (var7_2 | var10_1) ^ 1510828612;
                                break block105;
lbl48:
                                // 1 sources

                                while (true) {
                                    var9_3 = (var7_2 | var10_1) ^ 705203747;
                                    ** GOTO lbl157
                                    break;
                                }
                                break;
                            }
                            break;
                        }
lbl51:
                        // 1 sources

                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ -573287817;
                            ** GOTO lbl204
                            break;
                        }
                    }
                    block78: while (true) {
                        switch (var9_3) {
                            case -1973581967: {
                                if (!var5_9.startsWith(fM.m)) ** continue;
                                ** GOTO lbl13
                            }
                            case 356653455: {
                                v0 = false;
                                ** GOTO lbl28
                            }
                            case -1938135217: {
                                var8_4 ^= var9_3 ^ -792831449;
                                var9_3 = (var7_2 | var10_1) ^ 104359057;
                                continue block78;
                            }
                            case -1487319879: {
                                var8_4 ^= var9_3 ^ 1301557009;
                                var9_3 = (var7_2 | var10_1) ^ 1432941556;
                                continue block78;
                            }
                            case -1604873602: {
                                if (!var5_9.startsWith(fM.t)) ** break;
                                ** continue;
                                ** break;
                            }
                            case -217643749: {
                                v0 = true;
                                ** continue;
                            }
                            case -1039921859: {
                                var8_4 ^= var9_3 ^ 684289685;
                                ** continue;
                            }
lbl81:
                            // 1 sources

                            var9_3 = (var7_2 | var10_1) ^ 776969264;
                            continue block78;
                            case -2011141409: {
                                var9_3 = (var7_2 | var10_1) ^ 741503390;
                            }
                        }
lbl85:
                        // 3 sources

                    }
lbl86:
                    // 1 sources

                    while (true) {
                        var5_9 = var3_7.url().trim();
                        var9_3 = (var7_2 | var10_1) ^ 706056608;
                        ** GOTO lbl85
                        break;
                    }
lbl90:
                    // 2 sources

                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ 217339390;
                        if (true) ** GOTO lbl104
                        break;
                    }
lbl93:
                    // 1 sources

                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ -1599107005;
                        break block105;
                        break;
                    }
lbl96:
                    // 1 sources

                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ -1149675839;
                        break block105;
lbl99:
                        // 1 sources

                        while (true) {
                            var9_3 = (var7_2 | var10_1) ^ -667898243;
                            break block105;
                            break;
                        }
                        break;
                    }
                    block85: while (true) {
                        var9_3 = (var7_2 | var10_1) ^ 737166146;
lbl104:
                        // 4 sources

                        block86: while (true) {
                            switch (var9_3) {
                                case -1386406192: {
                                    var9_3 = (var7_2 | var10_1) ^ -1347299958;
                                    continue block86;
                                }
                                case -1432640751: {
                                    var8_4 ^= var9_3 ^ 1099488524;
                                    continue block85;
                                }
                                case -1765332419: {
                                    var8_4 ^= var9_3 ^ 1391104684;
                                    var9_3 = (var7_2 | var10_1) ^ -2132045285;
                                    continue block86;
                                }
                                case 646210804: {
                                    var1_5 = new ArrayList<fv>(2);
                                    var8_4 ^= 751400662;
                                    var2_6 = var0.iterator();
                                    break block106;
                                }
                                case 854554380: {
                                    var8_4 ^= var9_3 ^ -326563528;
                                    var9_3 = (var7_2 | var10_1) ^ -1475671850;
                                }
                                default: {
                                    continue block86;
                                }
                                case 165552997: {
                                    if (!var0.isEmpty()) ** continue;
                                    ** GOTO lbl90
                                }
                                case 437117468: {
                                    var9_3 = (var7_2 | var10_1) ^ -1803517469;
                                    continue block86;
                                }
                                case 241499705: {
                                    if (var0 != null) ** break;
                                    ** continue;
                                    var9_3 = (var7_2 | var10_1) ^ 187885631;
                                    continue block86;
                                }
                                case -1918913107: {
                                    return List.of();
                                }
                            }
                            break;
                        }
                        break;
                    }
lbl139:
                    // 1 sources

                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ -1520042447;
                        ** GOTO lbl157
                        break;
                    }
lbl142:
                    // 1 sources

                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ -1171401591;
                        break block105;
                        break;
                    }
lbl145:
                    // 1 sources

                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ 2139680275;
                        break block105;
                        break;
                    }
lbl148:
                    // 1 sources

                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ -1881767966;
                        ** GOTO lbl204
                        break;
                    }
lbl151:
                    // 1 sources

                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ -1103856750;
                        ** GOTO lbl204
                        break;
                    }
lbl154:
                    // 1 sources

                    while (true) {
                        var9_3 = (var7_2 | var10_1) ^ 1103320989;
                        break block105;
lbl157:
                        // 4 sources

                        block93: while (true) {
                            switch (var9_3) {
                                default: {
                                    continue block93;
                                }
                                case 318625690: {
                                    var8_4 ^= var9_3 ^ -2081210012;
                                    var9_3 = (var7_2 | var10_1) ^ 358208869;
                                    continue block93;
                                }
                                case 1161948187: {
                                    var8_4 ^= var9_3 ^ 63635335;
                                    ** continue;
                                }
                                case -1288297590: {
                                    var3_7 = var2_6.next();
                                    ** continue;
                                }
                                case -1939375924: {
                                    if (var2_6.hasNext()) {
                                        ** break;
                                    }
                                    break block107;
                                }
                                case -966191556: {
                                    var8_4 ^= var9_3 ^ 1833684743;
                                    ** continue;
                                }
lbl178:
                                // 1 sources

                                var9_3 = (var7_2 | var10_1) ^ -1265491595;
                                continue block93;
                                case 50989278: 
                            }
                            return List.copyOf(var1_5);
                        }
                        break;
                    }
lbl182:
                    // 1 sources

                    while (true) {
                        var8_4 ^= -89245205;
                        ** continue;
                        break;
                    }
                }
lbl186:
                // 8 sources

                while (true) {
                    var9_3 = (var7_2 | var10_1) ^ 1611063507;
                    ** GOTO lbl157
                    break;
                }
lbl189:
                // 1 sources

                while (true) {
                    var9_3 = (var7_2 | var10_1) ^ -1226650192;
                    ** GOTO lbl204
                    break;
                }
lbl192:
                // 1 sources

                while (true) {
                    var9_3 = (var7_2 | var10_1) ^ -2037796483;
                    ** GOTO lbl204
                    break;
                }
            }
lbl196:
            // 2 sources

            while (true) {
                var9_3 = (var7_2 | var10_1) ^ -483517708;
                ** continue;
                break;
            }
lbl199:
            // 1 sources

            while (true) {
                var9_3 = (var7_2 | var10_1) ^ -1543296112;
                if (true) ** GOTO lbl204
                break;
            }
            block100: while (true) {
                var9_3 = (var7_2 | var10_1) ^ 108654259;
lbl204:
                // 12 sources

                block101: while (true) {
                    switch (var9_3) {
                        default: {
                            continue block101;
                        }
                        case 2075894936: {
                            ** GOTO lbl186
                        }
                        case 408653181: {
                            var9_3 = (var7_2 | var10_1) ^ -1990568737;
                            continue block101;
                        }
                        case -1532375120: {
                            var4_8 = var4_8.substring(0, fM.fE((var8_4 | var9_3 ^ -2098873891) ^ (var9_3 ^ 475022705), (var7_2 | var9_3 ^ -2098873891) ^ ((var8_4 | var9_3 ^ -2098873891) ^ (var9_3 ^ 1852681555))));
                            ** GOTO lbl39
                        }
                        case 277691231: {
                            if (var4_8.length() > fM.fE((var8_4 | var9_3 ^ 918637874) ^ (var9_3 ^ -1468747367), (var7_2 | var9_3 ^ 918637874) ^ ((var8_4 | var9_3 ^ 918637874) ^ (var9_3 ^ 762454657)))) ** break;
                            ** continue;
                            ** continue;
                        }
                        case 932731515: {
                            var8_4 ^= var9_3 ^ -1541977741;
                            var9_3 = (var7_2 | var10_1) ^ 774793756;
                            continue block101;
                        }
                        case -1609164708: {
                            var8_4 ^= var9_3 ^ 565837694;
                            ** continue;
                        }
                        case 700025101: {
                            var9_3 = (var7_2 | var10_1) ^ 46545247;
                            continue block101;
                        }
                        case -2008965901: {
                            if (var4_8.isEmpty()) ** GOTO lbl186
                            ** continue;
                        }
                        case -76205180: {
                            ** GOTO lbl186
                        }
                        case 792044080: {
                            if (!var6_10) ** GOTO lbl186
                            ** continue;
                        }
                        case -1542631804: {
                            var8_4 ^= var9_3 ^ -1220233772;
                            ** continue;
                        }
                        case 2135829641: {
                            if (var5_9.length() <= fM.fE((var8_4 | var9_3 ^ 1493326564) ^ (var9_3 ^ 1175725900), (var7_2 | var9_3 ^ 1493326564) ^ ((var8_4 | var9_3 ^ 1493326564) ^ (var9_3 ^ -265554977)))) continue block100;
                            ** continue;
                        }
                        case 551962514: {
                            var1_5.add(new fv(var4_8, var5_9));
                            ** continue;
                        }
                        case 40689023: {
                            var8_4 ^= var9_3 ^ -2111819758;
                            ** continue;
                        }
                        case -225061617: {
                            var8_4 ^= var9_3 ^ 1926838370;
                            var9_3 = (var7_2 | var10_1) ^ 1562035563;
                            continue block101;
                        }
                        case -1070889909: 
                    }
                    break;
                }
                break;
            }
            var8_4 ^= var9_3 ^ -763267756;
            ** while (true)
        }
        block102: while (true) {
            switch (var9_3) {
                default: {
                    continue block102;
                }
                case 2120177810: {
                    var8_4 ^= var9_3 ^ -1851909913;
                    var9_3 = (var7_2 | var10_1) ^ 526372733;
                    continue block102;
                }
                case -1606689108: {
                    var9_3 = (var7_2 | var10_1) ^ 841809089;
                    continue block102;
                }
                case 211192166: {
                    var8_4 ^= var9_3 ^ -646215978;
                    ** continue;
                }
                case -60646229: {
                    ** continue;
                }
                case -1188021870: {
                    if (var1_5.size() != 2) ** continue;
                    var9_3 = (var7_2 | var10_1) ^ -1849848981;
                    continue block102;
                }
                case 1292587478: {
                    var8_4 ^= var9_3 ^ -806396984;
                    ** continue;
                }
                case 113272492: {
                    var4_8 = var3_7.label().trim();
                    ** continue;
                }
                case -1807545810: {
                    if (var3_7.label() == null) ** GOTO lbl186
                    ** continue;
                }
                case 936541572: {
                    var8_4 ^= var9_3 ^ 1226681103;
                    ** continue;
                }
                case 488022062: {
                    if (var3_7.url() != null) ** continue;
                    ** continue;
                }
                case -145798174: {
                    var8_4 ^= var9_3 ^ 1333780148;
                    ** continue;
                }
                case 474096230: {
                    if (var3_7 == null) ** GOTO lbl186
                    var9_3 = (var7_2 | var10_1) ^ 106178627;
                    continue block102;
                }
                case -639166212: {
                    var8_4 ^= var9_3 ^ 1526928098;
                    ** continue;
                }
                case -408116878: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    JsonObject toJson() {
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
    @Override
    public final String toString() {
        int n2 = e & 0xA937C188 ^ 0x8288E18B;
        int n3 = 0;
        int n4 = (n2 | 0xA937C188) ^ 0x653E634F;
        n3 = (n2 | 0xA937C188) ^ 0xDF4ACD5;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 2062545310: {
                    n4 ^= n3 ^ 0x71C314CF;
                    n3 = (n2 | 0xA937C188) ^ 0x50804A56;
                    continue block5;
                }
                case -1505014434: {
                    n3 = (n2 | 0xA937C188) ^ 0xD1501015;
                    continue block5;
                }
                case -79713315: 
            }
            break;
        }
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fM.class, "details;state;largeImage;largeImageText;smallImage;smallImageText;startEpochSeconds;buttons", "h", "g", "a", "j", "c", "k", "a", "a"}, this);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final int hashCode() {
        block9: {
            break block9;
lbl1:
            // 1 sources

            while (true) {
                var3_2 = (var1_1 | 1862077531) ^ 828216649;
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
                        case -811533902: {
                            ** GOTO lbl13
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 1862077531) ^ -1325578065;
                            ** GOTO lbl-1000
                            break;
                        }
lbl13:
                        // 1 sources

                        var3_2 = (var1_1 | 1862077531) ^ -861958908;
                        ** continue;
                        case 845341183: {
                            var2_3 ^= var3_2 ^ 1524899356;
                            ** continue;
                        }
                        case 1308632148: {
                            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fM.class, "details;state;largeImage;largeImageText;smallImage;smallImageText;startEpochSeconds;buttons", "h", "g", "a", "j", "c", "k", "a", "a"}, this);
                        }
                    }
                    break;
                }
                break;
            }
        }
        var1_1 = fM.e & 1862077531 ^ -133930822;
        var3_2 = 0;
        var2_3 = (var1_1 | 1862077531) ^ 805639681;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean equals(Object object) {
        int n2 = e & 0xC77DBF1B ^ 0xC8102A7C;
        int n3 = 0;
        int n4 = (n2 | 0xC77DBF1B) ^ 0xCB3051E9;
        n3 = (n2 | 0xC77DBF1B) ^ 0x5E78119;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -895861146: {
                    n3 = (n2 | 0xC77DBF1B) ^ 0xE2D9E0AB;
                    continue block5;
                }
                case 1810095785: {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fM.class, "details;state;largeImage;largeImageText;smallImage;smallImageText;startEpochSeconds;buttons", "h", "g", "a", "j", "c", "k", "a", "a"}, this, object);
                }
                case 765747156: 
            }
            n4 ^= n3 ^ 0xBB823E6E;
            n3 = (n2 | 0xC77DBF1B) ^ 0xA49E61D6;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public String details() {
        int n2 = e & 0x85B106B2 ^ 0xC833D64F;
        int n3 = 0;
        int n4 = (n2 | 0x85B106B2) ^ 0x16586794;
        n3 = (n2 | 0x85B106B2) ^ 0x8CD58A4B;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1097227444: {
                    n3 = (n2 | 0x85B106B2) ^ 0xA6EB758F;
                    continue block5;
                }
                case 1800971120: {
                    n4 ^= n3 ^ 0xA2C38970;
                    n3 = (n2 | 0x85B106B2) ^ 0x4B6BDF13;
                    continue block5;
                }
                case -2032662036: 
            }
            break;
        }
        return this.h;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public String state() {
        int n2 = e & 0xB50A7F09 ^ 0xC3A38DAD;
        int n3 = 0;
        int n4 = (n2 | 0xB50A7F09) ^ 0xCC6CFDE0;
        n3 = (n2 | 0xB50A7F09) ^ 0xF4C706B0;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0xB50A7F09) ^ 0xC3A5C889;
            }
            block6: while (true) {
                switch (n3) {
                    default: {
                        continue block6;
                    }
                    case -628822640: {
                        n4 ^= n3 ^ 0xE865BB9B;
                        continue block5;
                    }
                    case 57473309: {
                        n3 = (n2 | 0xB50A7F09) ^ 0x2D2F123D;
                        continue block6;
                    }
                    case 873346852: 
                }
                break;
            }
            break;
        }
        return this.g;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block20: {
            var2 = -1302029596;
            fM.e = mK.a(MethodHandles.lookup().lookupClass(), 2101056131);
            var1_1 = 0;
            var0_2 = 401249115;
            var1_1 = var2 ^ 451776402;
            block13: while (true) {
                switch (var1_1) {
                    case -2083778768: {
                        v0 = 0;
                        v1 = 0;
                        v2 = "\u00b5\u00c1\u00f3\u009a\u00ab\u00f1\u001d\u001f{\u00b8]\u00aaH\u0081\u0018\u0001\u00bf\u00bac;|\u00edg!]\u00a4\u00fb\u00cd\u00055\u00b0\u00d9I\u008et\u0091\u00f1\u00c1\u00c5\u00d2\u00ab@\u008b4$:\u00cd\u00aa\u00ed\u0095\u0088r\u00eeN\u00f5\u00e28N^\u008d3\u00e7\u00fe\u00ae9 j\u00a2y\u00b3\u007fa0b$\u00b5I\u00f0\u00beVd{\u00acD\u00b6C\u00b8\u00df\u00ea-+\u00f3".getBytes("ISO-8859-1");
                        ** break;
                    }
                    case -1340623558: {
                        ** GOTO lbl29
                    }
                    case -1883819632: {
                        var0_2 ^= var1_1 ^ -1929172718;
                        ** GOTO lbl27
                    }
                    case -1246009255: {
                        var0_2 ^= var1_1 ^ 216231991;
                        var1_1 = var2 ^ 41103326;
                        ** break;
                    }
                    case -316069263: {
                        fM.a = new int[(var0_2 | var1_1 ^ 1598926997) ^ (var1_1 ^ 508555658)];
                        var1_1 = var2 ^ 1037282164;
                    }
lbl25:
                    // 3 sources

                    default: {
                        continue block13;
                    }
lbl27:
                    // 1 sources

                    var1_1 = var2 ^ 833131988;
                    continue block13;
lbl29:
                    // 1 sources

                    var1_1 = var2 ^ -933712065;
                    continue block13;
                    case 2050766299: {
                        var0_2 ^= var1_1 ^ 99383074;
                        var1_1 = var2 ^ 1598926997;
                        continue block13;
                    }
                    case -1467411082: 
                }
                var1_1 = var2 ^ 132117181;
            }
lbl38:
            // 1 sources

            while (true) {
                var0_2 ^= -1115098107;
                v3 = ((var0_2 ^= -1929869961) | var2) ^ -1896906594 ^ fM.e;
                var0_2 ^= 380702117;
                break block20;
                break;
            }
lbl54:
            // 1 sources

            while (true) {
                var0_2 ^= 640169174;
                var0_2 ^= 169728181;
                ** continue;
                break;
            }
lbl59:
            // 1 sources

            while (true) {
                var0_2 ^= 190710254;
                var0_2 ^= -542602453;
                ** continue;
                break;
            }
lbl65:
            // 2 sources

            while (true) {
                var0_2 ^= -532525560;
                ** continue;
                break;
            }
lbl68:
            // 2 sources

            while (true) {
                if (v4 < v5) ** continue;
                fM.d = fM.fE(((var0_2 ^= -1683288282) | var2) ^ -1259658303, var2 ^ ((var0_2 | var2) ^ 294298610));
                fM.c = fM.fE((var0_2 | var2) ^ -1259658302, var2 ^ ((var0_2 | var2) ^ 818102205));
                fM.b = fM.fE((var0_2 | var2) ^ -1259658301, var2 ^ ((var0_2 | var2) ^ 1750234154));
                fM.a = fM.fE((var0_2 | var2) ^ -1259658292, var2 ^ ((var0_2 | var2) ^ 619295343));
                fM.t = gj.decode("qgmx45hTrig=", fM.fE((var0_2 | var2) ^ -1259658291, var2 ^ ((var0_2 | var2) ^ 72317073)));
                fM.m = gj.decode("XWq1bwaWcQ==", fM.fE((var0_2 | var2) ^ -1259658290, var2 ^ ((var0_2 | var2) ^ -603474258)));
                fM.q = gj.decode("u1O1w2MtMA==", fM.fE((var0_2 | var2) ^ -1259658289, var2 ^ ((var0_2 | var2) ^ 2207292)));
                fM.f = gj.decode("QdqSUU0=", fM.fE((var0_2 | var2) ^ -1259658296, var2 ^ ((var0_2 | var2) ^ 975043439)));
                fM.r = gj.decode("O4utObE=", fM.fE((var0_2 | var2) ^ -1259658295, var2 ^ ((var0_2 | var2) ^ 1953438690)));
                fM.n = gj.decode("8S1/X5F7yI613g==", fM.fE((var0_2 | var2) ^ -1259658294, var2 ^ ((var0_2 | var2) ^ -387142424)));
                fM.o = gj.decode("Ufor/AGxjoGjjlo=", fM.fE((var0_2 | var2) ^ -1259658293, var2 ^ ((var0_2 | var2) ^ 1739468629)));
                fM.l = gj.decode("bWrETd2n0vR9VA==", fM.fE((var0_2 | var2) ^ -1259658284, var2 ^ ((var0_2 | var2) ^ 1320213897)));
                fM.p = gj.decode("Sqrs2yT+rzfdn1o=", fM.fE((var0_2 | var2) ^ -1259658283, var2 ^ ((var0_2 | var2) ^ 363694090)));
                fM.d = gj.decode("wffDVbU7t50Obw==", fM.fE((var0_2 | var2) ^ -1259658282, var2 ^ ((var0_2 | var2) ^ 662114174)));
                fM.e = gj.decode("FeidP2Dd", fM.fE((var0_2 | var2) ^ -1259658281, var2 ^ ((var0_2 | var2) ^ 1235643235)));
                fM.i = gj.decode("6H8JZwU=", fM.fE((var0_2 | var2) ^ -1259658288, var2 ^ ((var0_2 | var2) ^ 2054418604)));
                fM.b = gj.decode("mcP8", fM.fE((var0_2 | var2) ^ -1259658287, var2 ^ ((var0_2 | var2) ^ 2068486924)));
                fM.s = gj.decode("NZOPNv7Tbw==", fM.fE((var0_2 | var2) ^ -1259658286, var2 ^ ((var0_2 | var2) ^ 158996094)));
                return;
            }
        }
        fM.a[v0] = ((v2[v1] & 255) << 24 | ((v2[v1 + 1] & 255) << 16 | ((v2[v1 + 2] & 255) << 8 | v2[v1 + 3] & 255))) ^ v3;
        v0 = v0 + 1;
        v2 = v2;
        v1 = v1 + 4;
        v5 = v2.length;
        block19: while (true) {
            switch (var0_2) {
                default: {
                    var0_2 ^= 1594930863;
                    continue block19;
                }
                case -1215859790: {
                    var0_2 ^= -816326242;
                    ** GOTO lbl68
                }
                case -325679817: 
            }
            break;
        }
        var0_2 ^= 1061180537;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public String largeImage() {
        int n2 = e & 0x9198124C ^ 0xCE28D7D5;
        int n3 = 0;
        int n4 = (n2 | 0x9198124C) ^ 0xD171F4B;
        n3 = (n2 | 0x9198124C) ^ 0xAF8D7148;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 85162848: {
                    n4 ^= n3 ^ 0x3576208B;
                    n3 = (n2 | 0x9198124C) ^ 0xD8668084;
                    continue block5;
                }
                case 1882564245: {
                    n3 = (n2 | 0x9198124C) ^ 0xDAABACBD;
                    continue block5;
                }
                case 132011865: 
            }
            break;
        }
        return this.a;
    }

    /*
     * Unable to fully structure code
     */
    public String largeImageText() {
        var1_1 = fM.e & 1025481075 ^ 218733141;
        var3_2 = 0;
        ** GOTO lbl15
lbl4:
        // 1 sources

        while (true) {
            var3_2 = (var1_1 | 1025481075) ^ -900904612;
            if (true) ** GOTO lbl9
            break;
        }
        block6: while (true) {
            var3_2 = (var1_1 | 1025481075) ^ 1955611497;
lbl9:
            // 3 sources

            block7: while (true) {
                switch (var3_2) {
                    default: {
                        continue block7;
                    }
                    case 1234163742: {
                        break block6;
                    }
lbl15:
                    // 1 sources

                    var2_3 = (var1_1 | 1025481075) ^ 1863519802;
                    continue block6;
                    case -145567189: {
                        return this.j;
                    }
                    case 1223673567: {
                        var2_3 ^= var3_2 ^ -679718412;
                        ** continue;
                    }
                }
                break;
            }
            break;
        }
        var3_2 = (var1_1 | 1025481075) ^ 1978686888;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public String smallImage() {
        block10: {
            block11: {
                block9: {
                    break block11;
lbl1:
                    // 1 sources

                    while (true) {
                        var2_3 ^= var3_2 ^ 530926356;
                        break block9;
                        break;
                    }
lbl4:
                    // 2 sources

                    block6: while (true) {
                        switch (var3_2) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block6;
                                }
                                break;
                            }
                            case 635889127: {
                                ** continue;
                            }
                            case 398157976: {
                                break block10;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | -925008580) ^ -43608218;
                                ** continue;
                                break;
                            }
                            case -195162225: {
                                return this.c;
                            }
                        }
                        break;
                    }
                }
                var3_2 = (var1_1 | -925008580) ^ 511963249;
                ** GOTO lbl4
            }
            var1_1 = fM.e & -925008580 ^ -503195910;
            var3_2 = 0;
            var2_3 = (var1_1 | -925008580) ^ -1786629644;
            ** while (true)
        }
        var3_2 = (var1_1 | -925008580) ^ -818210279;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public String smallImageText() {
        int n2 = e & 0xEE096312 ^ 0x108DD38F;
        int n3 = 0;
        int n4 = (n2 | 0xEE096312) ^ 0xF53A1FDB;
        n3 = (n2 | 0xEE096312) ^ 0x38A8537E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 758214381: {
                    n4 ^= n3 ^ 0x64A4FAF3;
                    n3 = (n2 | 0xEE096312) ^ 0x4B7346D8;
                    continue block5;
                }
                case -1241598649: {
                    return this.k;
                }
                case -970612511: 
            }
            n3 = (n2 | 0xEE096312) ^ 0xD3BC9D72;
        }
    }

    private static int fE(int n2, int n3) {
        int n4 = -1206483788;
        int n5 = 1285201331;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xB208609F)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xFC9E8B56;
        n6 += (n5 | n4) ^ 0xFC9EBE64;
        n6 ^= (n5 | n4) ^ 0xFC9EE035;
        n6 -= (n5 | n4) ^ 0xFC9E94A1;
        n6 -= (n5 | n4) ^ 0xFC9E4232;
        return n6 += (n5 | n4) ^ 0xFC9EA634;
    }

    /*
     * Enabled aggressive block sorting
     */
    public long startEpochSeconds() {
        int n2 = e & 0xA77AE2 ^ 0xF56FBDF7;
        int n3 = 0;
        int n4 = (n2 | 0xA77AE2) ^ 0xABE5149D;
        n3 = (n2 | 0xA77AE2) ^ 0x8AD38666;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 951641830: {
                    return this.a;
                }
                case 2134669713: {
                    n3 = (n2 | 0xA77AE2) ^ 0x334C20BA;
                    continue block5;
                }
                case -962338995: 
            }
            n4 ^= n3 ^ 0x5EE16E5A;
            n3 = (n2 | 0xA77AE2) ^ 0xCD571911;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public List<fv> buttons() {
        int n2 = e & 0x4546867D ^ 0xE8B2F278;
        int n3 = 0;
        int n4 = (n2 | 0x4546867D) ^ 0x24B7C56;
        n3 = (n2 | 0x4546867D) ^ 0xE8030D53;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 100006702: {
                    n3 = (n2 | 0x4546867D) ^ 0xE5155388;
                    continue block5;
                }
                case 149136885: {
                    n4 ^= n3 ^ 0x67EC0261;
                    n3 = (n2 | 0x4546867D) ^ 0xBC3E2E0D;
                    continue block5;
                }
                case 1372117104: 
            }
            break;
        }
        return this.a;
    }
}

