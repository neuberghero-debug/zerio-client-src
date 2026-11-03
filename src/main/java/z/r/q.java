/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import z.r.dr;
import z.r.ho;
import z.r.jS;
import z.r.lN;

@Environment(value=EnvType.CLIENT)
public final class q {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), -707540755);

    /*
     * Enabled aggressive block sorting
     */
    private q() {
        int n2 = a & 0x8349113 ^ 0xF2DAFF77;
        int n3 = (n2 | 0x8349113) ^ 0xE5476666;
        n3 ^= 0x37C7923A;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void onJoin(class_310 var0) {
        var6_1 = 1218022554;
        var3_2 = q.a & 1218022554 ^ 753064082;
        var5_3 = 0;
        var4_5 = (var3_2 | var6_1) ^ 1151335706;
        var5_3 = (var3_2 | var6_1) ^ -525685628;
        ** GOTO lbl47
lbl7:
        // 1 sources

        while (true) {
            var5_3 = (var3_2 | var6_1) ^ -798510666;
            ** GOTO lbl78
            break;
        }
        while (true) {
            var5_3 = (var3_2 | var6_1) ^ -2094969027;
            ** GOTO lbl47
            break;
        }
lbl13:
        // 1 sources

        while (true) {
            var5_3 = (var3_2 | var6_1) ^ -1088535978;
            ** GOTO lbl21
            break;
        }
lbl16:
        // 1 sources

        while (true) {
            var5_3 = (var3_2 | var6_1) ^ 1328463521;
            ** GOTO lbl47
            break;
        }
lbl19:
        // 1 sources

        while (true) {
            var5_3 = (var3_2 | var6_1) ^ -259649696;
lbl21:
            // 2 sources

            block32: while (true) {
                switch (var5_3) {
                    case 1389176566: {
                        var4_5 ^= var5_3 ^ 523196242;
                        var5_3 = (var3_2 | var6_1) ^ 1403693452;
                        continue block32;
                    }
                    case -1669475334: {
                        var4_5 ^= var5_3 ^ -900172518;
                        ** continue;
                    }
                    case -739926324: {
                        var4_5 ^= 2089092710;
                        jS.get().mine().thenCompose((Function<List, CompletionStage>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, aE(java.lang.String java.util.List ), (Ljava/util/List;)Ljava/util/concurrent/CompletionStage;)((String)var2_6)).whenComplete((BiConsumer<ho, Throwable>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, aC(net.minecraft.class_310 z.r.ho java.lang.Throwable ), (Lz/r/ho;Ljava/lang/Throwable;)V)((class_310)var0));
                        var5_3 = (var3_2 | var6_1) ^ 1043790444;
                    }
                    default: {
                        continue block32;
                    }
                    case 1062302998: 
                }
                break;
            }
            return;
        }
lbl39:
        // 1 sources

        while (true) {
            var5_3 = (var3_2 | var6_1) ^ -277336519;
            if (true) ** GOTO lbl47
            break;
        }
lbl42:
        // 1 sources

        while (true) {
            var5_3 = (var3_2 | var6_1) ^ -283244096;
            ** GOTO lbl78
            break;
        }
        block35: while (true) {
            var5_3 = (var3_2 | var6_1) ^ -1370517836;
lbl47:
            // 5 sources

            block36: while (true) {
                switch (var5_3) {
                    default: {
                        continue block36;
                    }
                    case -1940819938: {
                        var5_3 = (var3_2 | var6_1) ^ 810763051;
                        continue block36;
                    }
                    case -270888025: {
                        var4_5 ^= var5_3 ^ 267453621;
                        var5_3 = (var3_2 | var6_1) ^ -267742086;
                        continue block36;
                    }
                    case 1554554801: {
                        var4_5 ^= var5_3 ^ 239327346;
                        ** continue;
                    }
                    case -1028369874: {
                        var4_5 ^= var5_3 ^ -1123215148;
                        ** continue;
                    }
                    case 601186875: {
                        if (var0 != null) ** continue;
                        continue block35;
                    }
                    case -2088504669: {
                        return;
                    }
                    case -1661908768: 
                }
                break;
            }
            break;
        }
        var1_4 = var0.method_1558();
        var5_3 = (var3_2 | var6_1) ^ 1564361005;
        if (true) ** GOTO lbl78
        block37: while (true) {
            var5_3 = (var3_2 | var6_1) ^ 1939221556;
            if (true) ** GOTO lbl78
            block38: while (true) {
                var5_3 = (var3_2 | var6_1) ^ -1358310208;
lbl78:
                // 5 sources

                block39: while (true) {
                    switch (var5_3) {
                        default: {
                            continue block39;
                        }
                        case -1007548326: {
                            var4_5 ^= var5_3 ^ 817591415;
                            var5_3 = (var3_2 | var6_1) ^ -95808097;
                            continue block39;
                        }
                        case -2082089638: {
                            if (var1_4 == null) continue block38;
                            var5_3 = (var3_2 | var6_1) ^ -1728543727;
                            continue block39;
                        }
                        case -201107317: {
                            var5_3 = (var3_2 | var6_1) ^ 717144683;
                            continue block39;
                        }
                        case 1037764339: {
                            if (!var1_4.field_3761.isBlank()) continue block37;
                            continue block38;
                        }
                        case 527298734: {
                            var4_5 ^= var5_3 ^ 1632609536;
                            ** continue;
                        }
                        case 1115087083: {
                            var5_3 = (var3_2 | var6_1) ^ 1361107561;
                            continue block39;
                        }
                        case -1130599124: {
                            var2_6 = q.aB(var1_4.field_3761);
                            ** continue;
                        }
                        case 835034551: {
                            var4_5 ^= var5_3 ^ -1308202706;
                            ** continue;
                        }
                        case 1178935025: {
                            if (var1_4.field_3761 != null) ** break;
                            continue block38;
                            var5_3 = (var3_2 | var6_1) ^ 781007985;
                            continue block39;
                        }
                        case -1766733563: 
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
    private static String aB(String var0) {
        block17: {
            block16: {
                block18: {
                    block19: {
                        break block19;
lbl1:
                        // 1 sources

                        return v0;
                        {
                            var3_3 = (var1_2 | var4_1) ^ -961943527;
lbl4:
                            // 4 sources

                            block11: while (true) {
                                switch (var3_3) lbl-1000:
                                // 4 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block11;
                                        }
                                        break;
                                    }
                                    case 622117637: {
                                        v0 = var0.trim().toLowerCase(Locale.ROOT);
                                        break block16;
                                    }
                                    case -1981654912: {
                                        var2_4 ^= var3_3 ^ -1722220984;
                                        break block10;
                                    }
                                    case -1986396321: {
                                        var2_4 ^= var3_3 ^ -1725736553;
                                        break block17;
                                    }
lbl18:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -1542246207;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl21:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -1385177395;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case 1238336502: {
                                        var2_4 ^= var3_3 ^ 517579391;
                                        ** continue;
                                    }
                                    case 571061538: {
                                        continue block10;
                                    }
                                    case 729111342: {
                                        ** if (var0 != null) goto lbl-1000
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        var3_3 = (var1_2 | var4_1) ^ 117413040;
                                        ** continue;
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        break block18;
                                    }
                                    case -1700437656: {
                                        v0 = "";
                                        break block16;
                                    }
                                }
                                break;
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ -1435326230;
                        ** GOTO lbl4
                    }
                    var4_1 = -1926863900;
                    var1_2 = q.a & -1926863900 ^ 191261131;
                    var3_3 = 0;
                    var2_4 = (var1_2 | var4_1) ^ -1343211457;
                    ** while (true)
                }
                var3_3 = (var1_2 | var4_1) ^ 109327215;
                ** GOTO lbl4
            }
            var2_4 ^= 1949252375;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ 365103751;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void aC(class_310 var0, ho var1_1, Throwable var2_2) {
        var6_3 = 1878118619;
        var3_4 = q.a & 1878118619 ^ -222987748;
        var5_5 = 0;
        var4_6 = (var3_4 | var6_3) ^ 95340681;
        var5_5 = (var3_4 | var6_3) ^ -820466817;
        block13: while (true) {
            block16: {
                switch (var5_5) {
                    case 820859296: {
                        var5_5 = (var3_4 | var6_3) ^ -1996671052;
                        continue block13;
                    }
                    case 1997065579: {
                        var4_6 ^= var5_5 ^ 1889627774;
                        ** break;
                    }
                    case -282940141: {
                        return;
                    }
lbl16:
                    // 1 sources

                    var5_5 = (var3_4 | var6_3) ^ 1640921903;
                    continue block13;
                    case 710844939: {
                        if (var1_1 != null) {
                            var5_5 = (var3_4 | var6_3) ^ -1289599836;
                            continue block13;
                        }
                        break block16;
                    }
                    case 508091591: {
                        return;
                    }
                    case 1289207419: {
                        var4_6 ^= var5_5 ^ -1531622193;
                        var5_5 = (var3_4 | var6_3) ^ -1471906376;
                        continue block13;
                    }
                    case 1471252327: {
                        var0.execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, aD(z.r.ho ), ()V)((ho)var1_1));
                        var5_5 = (var3_4 | var6_3) ^ 1277191261;
                        ** break;
                    }
                    case -1277845886: {
                        var4_6 ^= var5_5 ^ -438459452;
                        var5_5 = (var3_4 | var6_3) ^ 282548172;
                    }
lbl36:
                    // 3 sources

                    default: {
                        continue block13;
                    }
                    case -185323611: {
                        var4_6 ^= var5_5 ^ -2058113601;
                        ** GOTO lbl44
                    }
                    case -1241613844: {
                        var5_5 = (var3_4 | var6_3) ^ -710190892;
                        continue block13;
                    }
lbl44:
                    // 1 sources

                    var5_5 = (var3_4 | var6_3) ^ -507697640;
                    continue block13;
                    case -1640267280: 
                }
                if (var2_2 == null) {
                    var5_5 = (var3_4 | var6_3) ^ 1242268467;
                    continue;
                }
            }
            var5_5 = (var3_4 | var6_3) ^ 184669562;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void aD(ho var0) {
        block15: {
            block16: {
                block18: {
                    block17: {
                        break block17;
lbl1:
                        // 1 sources

                        while (true) {
                            var2_4 ^= 2035713004;
                            break block15;
                            break;
                        }
lbl4:
                        // 1 sources

                        return;
                    }
                    var4_1 = -341096396;
                    var1_2 = q.a & -341096396 ^ 1599599549;
                    var3_3 = 0;
                    break block18;
lbl11:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -552115040;
                        if (true) ** GOTO lbl20
                        break;
                    }
                    block10: while (true) {
                        block19: {
                            var3_3 = (var1_2 | var4_1) ^ -131182702;
                            break block19;
lbl17:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 410133454;
                                break block16;
                                break;
                            }
                        }
lbl21:
                        // 3 sources

                        block12: while (true) {
                            switch (var3_3) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block12;
                                    }
                                    break;
                                }
                                case 552115997: {
                                    ** continue;
                                }
                                case -1226820377: {
                                    ** continue;
                                }
                                case 1367265106: {
                                    ** continue;
                                }
lbl32:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1367264017;
                                    ** continue;
                                    break;
                                }
                                case 131183663: {
                                    var2_4 ^= var3_3 ^ 74982731;
                                    ** continue;
                                }
                                case -160145907: {
                                    continue block10;
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
                var2_4 = (var1_2 | var4_1) ^ -1133174453;
                var3_3 = (var1_2 | var4_1) ^ 160146864;
                ** GOTO lbl21
            }
            var3_3 = (var1_2 | var4_1) ^ 1226821466;
            ** while (true)
        }
        lN.getInstance().applyJson(var0.configJson(), var0.meta().q);
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ CompletionStage aE(String var0, List var1_1) {
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
    private static /* synthetic */ boolean aF(String var0, dr var1_1) {
        var5_2 = 1843857587;
        var2_3 = q.a & 1843857587 ^ 2123527564;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -1500261667;
        var4_4 = (var2_3 | var5_2) ^ -1293590020;
        if (true) ** GOTO lbl13
        block11: while (true) {
            block14: {
                var4_4 = (var2_3 | var5_2) ^ -311855084;
                break block14;
lbl10:
                // 2 sources

                while (true) {
                    var3_5 ^= -1606441290;
                    return v0;
                }
            }
            block13: while (true) {
                switch (var4_4) {
                    default: {
                        continue block13;
                    }
                    case -1835137621: {
                        var3_5 ^= var4_4 ^ 1125055271;
                        var4_4 = (var2_3 | var5_2) ^ -766974591;
                        continue block13;
                    }
                    case -1731481797: {
                        var4_4 = (var2_3 | var5_2) ^ 1627100453;
                        continue block13;
                    }
                    case 520939674: {
                        if (!q.aB(var1_1.c).equals(var0)) continue block11;
                        var4_4 = (var2_3 | var5_2) ^ -734425670;
                        continue block13;
                    }
                    case -1412501499: {
                        var3_5 ^= var4_4 ^ 2052984457;
                        var4_4 = (var2_3 | var5_2) ^ -2125368795;
                        continue block13;
                    }
                    case -854451133: {
                        var4_4 = (var2_3 | var5_2) ^ 293589066;
                        continue block13;
                    }
                    case -22671462: {
                        v0 = true;
                        ** GOTO lbl10
                    }
                    case -1379952578: {
                        v0 = false;
                        ** continue;
                    }
                    case 1056230315: {
                        if (var1_1.a) ** break;
                        continue block11;
                        var4_4 = (var2_3 | var5_2) ^ -415444348;
                        continue block13;
                    }
                    case 1854451189: 
                }
                var3_5 ^= var4_4 ^ 90380808;
                var4_4 = (var2_3 | var5_2) ^ 1090762260;
            }
            break;
        }
    }
}

