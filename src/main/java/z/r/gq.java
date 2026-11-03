/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1011
 *  net.minecraft.class_310
 */
package z.r;

import com.google.gson.JsonObject;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiConsumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1011;
import net.minecraft.class_310;
import z.r.aV;
import z.r.dO;
import z.r.gj;
import z.r.ma;
import z.r.mk;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class gq {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final Duration a;
    private static final HttpClient a;
    private static final ExecutorService a;
    private static final int[] a;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String l;
    public static final int a;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;

    private static int Rf(int n2, int n3) {
        int n4 = -435728310;
        int n5 = -1265974081;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xDBD1AD77)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xF68F9EB0;
        n6 += (n5 | n4) ^ 0xF68F499C;
        n6 += (n5 | n4) ^ 0xF68FC8D5;
        n6 -= (n5 | n4) ^ 0xF68F3269;
        n6 ^= (n5 | n4) ^ 0xF68FD894;
        n6 ^= (n5 | n4) ^ 0xF68F2C61;
        n6 -= (n5 | n4) ^ 0xF68F4721;
        n6 ^= (n5 | n4) ^ 0xF68FF33E;
        n6 -= (n5 | n4) ^ 0xF68FFC27;
        return n6 ^= (n5 | n4) ^ 0xF68F01BE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private gq() {
        int n2 = a & 0xFF97F7AE ^ 0x5B00C771;
        int n3 = (n2 | 0xFF97F7AE) ^ 0x26DC17E1;
        n3 ^= 0x84D9878D;
    }

    /*
     * Exception decompiling
     */
    public static void fetchBytesAsync(String var0, String var1_1, int var2_2, BiConsumer<Integer, Optional<dO>> var3_3) {
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
    public static void fetchAsync(String var0, String var1_1, int var2_2, class_310 var3_3, BiConsumer<Integer, Optional<ma>> var4_4) {
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
    public static void registerBytesAsync(byte[] var0, long var1_1, int var3_2, class_310 var4_3, BiConsumer<Integer, Optional<ma>> var5_4) {
        block32: {
            block30: {
                block35: {
                    block34: {
                        break block34;
lbl1:
                        // 1 sources

                        while (true) {
                            var8_7 = (var6_6 | var9_5) ^ 1620182229;
                            ** GOTO lbl35
lbl4:
                            // 1 sources

                            while (var0 != null) {
                                break block30;
                            }
                            ** GOTO lbl79
                            break;
                        }
                    }
                    var9_5 = 1466775971;
                    var6_6 = gq.a & 1466775971 ^ 601729853;
                    var8_7 = 0;
                    break block35;
lbl12:
                    // 1 sources

                    while (true) {
                        var8_7 = (var6_6 | var9_5) ^ -1130138987;
                        ** GOTO lbl35
                        break;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        block36: {
                            block33: {
                                block31: {
                                    var8_7 = (var6_6 | var9_5) ^ -1992894677;
                                    ** GOTO lbl35
lbl18:
                                    // 1 sources

                                    while (true) {
                                        var7_8 ^= var8_7 ^ -315387051;
                                        break block31;
                                        break;
                                    }
lbl21:
                                    // 1 sources

                                    while (true) {
                                        var8_7 = (var6_6 | var9_5) ^ 1278637778;
                                        ** GOTO lbl35
                                        break;
                                    }
                                }
                                var8_7 = (var6_6 | var9_5) ^ 286507241;
                                ** GOTO lbl35
lbl27:
                                // 1 sources

                                while (var5_4 != null) {
                                    break block32;
                                }
                                break block36;
lbl30:
                                // 1 sources

                                while (true) {
                                    var7_8 ^= var8_7 ^ 1284002404;
                                    if (true) ** GOTO lbl56
                                    break;
                                }
                                block25: while (true) {
                                    var8_7 = (var6_6 | var9_5) ^ -38028795;
lbl35:
                                    // 13 sources

                                    block26: while (true) {
                                        switch (var8_7) lbl-1000:
                                        // 3 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block26;
                                                }
                                                break;
                                            }
                                            case -713817308: {
                                                ** GOTO lbl4
                                            }
                                            case 393199466: {
                                                break block25;
                                            }
                                            case -1778130525: {
                                                ** continue;
                                            }
                                            case 1691150738: {
                                                ** GOTO lbl27
                                            }
                                            case 897492331: {
                                                ** continue;
                                            }
                                            case -677225246: {
                                                break block33;
                                            }
                                            case -250919298: {
                                                break;
                                            }
                                            case -1335841791: {
                                                ** continue;
                                            }
lbl56:
                                            // 1 sources

                                            var8_7 = (var6_6 | var9_5) ^ -2066276391;
                                            ** GOTO lbl-1000
                                            case 1003212141: {
                                                if (var0.length != 0) continue block25;
                                                break;
                                            }
lbl61:
                                            // 1 sources

                                            while (true) {
                                                var8_7 = (var6_6 | var9_5) ^ 1115889364;
                                                ** continue;
                                                break;
                                            }
                                            case -215309210: {
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                }
                                var8_7 = (var6_6 | var9_5) ^ 321999405;
                                ** GOTO lbl35
                            }
                            var8_7 = (var6_6 | var9_5) ^ -1568032613;
                            ** GOTO lbl35
                            {
                                case -882980566: {
                                    var4_3.execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, Rn(byte[] net.minecraft.class_310 java.util.function.BiConsumer int long ), ()V)((byte[])var0, (class_310)var4_3, var5_4, (int)var3_2, (long)var1_1));
                                    ** continue;
                                }
                            }
                            var8_7 = (var6_6 | var9_5) ^ -503424484;
                            ** GOTO lbl35
                            {
                                case -1975123526: {
                                    var7_8 ^= var8_7 ^ 2076219864;
                                    ** continue;
                                }
                            }
                        }
                        while (true) {
                            var8_7 = (var6_6 | var9_5) ^ 1080453119;
                            ** GOTO lbl35
                            break;
                        }
                        {
                            case -20222828: {
                                return;
                            }
                        }
                        break;
                    }
                }
                var7_8 = (var6_6 | var9_5) ^ -1259148161;
                var8_7 = (var6_6 | var9_5) ^ -2030633535;
                ** GOTO lbl35
            }
            var8_7 = (var6_6 | var9_5) ^ -946006082;
            ** GOTO lbl35
            {
                case 1726905174: {
                    if (var4_3 == null) ** continue;
                    ** continue;
                }
            }
        }
        var8_7 = (var6_6 | var9_5) ^ -1604327587;
        ** while (true)
        {
            ** case 932961344:
        }
lbl99:
        // 1 sources

        var7_8 ^= var8_7 ^ -906089308;
        ** while (true)
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static class_1011 Rg(byte[] var0) throws IOException {
        var7_1 = 1665301774;
        var4_2 = gq.a & 1665301774 ^ 364233059;
        var6_3 = 0;
        var5_4 = (var4_2 | var7_1) ^ -771829866;
        var6_3 = (var4_2 | var7_1) ^ -1514515368;
        if (true) ** GOTO lbl9
        {
            block19: while (true) {
                var6_3 = (var4_2 | var7_1) ^ -446877101;
lbl9:
                // 2 sources

                block20: while (true) {
                    switch (var6_3) {
                        default: {
                            continue block20;
                        }
                        case -766662345: {
                            continue block19;
                        }
                        case -1834299588: {
                            var5_4 ^= var6_3 ^ -444807515;
                            var6_3 = (var4_2 | var7_1) ^ -774992431;
                            continue block20;
                        }
                        case -1506185026: 
                    }
                    break;
                }
                break;
            }
            var5_4 ^= -1842945512;
            return class_1011.method_49277((byte[])var0);
        }
    }

    /*
     * Exception decompiling
     */
    private static mk Rh(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [110[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static mk Ri(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [64[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static String Rj(JsonObject var0, String var1_1) {
        block32: {
            block31: {
                var6_2 = -2102191420;
                var3_3 = gq.a & -2102191420 ^ 1745553040;
                var5_4 = 0;
                var4_5 = (var3_3 | var6_2) ^ 1248730218;
                var5_4 = (var3_3 | var6_2) ^ 803104278;
                break block31;
lbl7:
                // 1 sources

                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ 948579268;
                    break block31;
lbl10:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ 1408788653;
                        break block31;
                        break;
                    }
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ -1954315267;
                    break block32;
                    break;
                }
            }
            block24: while (true) {
                switch (var5_4) {
                    case 489314974: {
                        var2_6 = var0.get(var1_1).getAsString();
                        ** break;
                    }
                    case -1245273592: {
                        var4_5 ^= var5_4 ^ -1167489903;
                        var5_4 = (var3_3 | var6_2) ^ 362462625;
                        ** GOTO lbl52
                    }
                    case -14572683: {
                        if (var0.has(var1_1)) {
                            ** continue;
                        }
                        ** GOTO lbl36
                    }
                    case -926785490: {
                        if (var0.get(var1_1).isJsonNull()) {
                            ** break;
                        }
                        ** GOTO lbl41
                    }
lbl34:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ -1452715522;
                    break block32;
lbl36:
                    // 2 sources

                    var5_4 = (var3_3 | var6_2) ^ -1447497568;
                    continue block24;
                    case -983205694: {
                        var5_4 = (var3_3 | var6_2) ^ 1602075868;
                        continue block24;
                    }
lbl41:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ -2006737599;
                    continue block24;
                    case 1124331124: {
                        var4_5 ^= var5_4 ^ 835177344;
                        ** continue;
                    }
                    case -1186761095: {
                        var5_4 = (var3_3 | var6_2) ^ 578387706;
                        continue block24;
                    }
                    case 1658356629: {
                        var4_5 ^= var5_4 ^ -1863597263;
                        var5_4 = (var3_3 | var6_2) ^ -141474742;
                    }
lbl52:
                    // 3 sources

                    default: {
                        continue block24;
                    }
lbl54:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ -659682163;
                        break block32;
lbl57:
                        // 2 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ 356254870;
                            break block32;
                            break;
                        }
                        break;
                    }
                    case -768527088: 
                }
                break;
            }
            return null;
        }
        block27: while (true) {
            block33: {
                switch (var5_4) {
                    default: {
                        continue block27;
                    }
                    case -1617379901: {
                        v0 = var2_6;
                        break;
                    }
                    case 809358264: {
                        var5_4 = (var3_3 | var6_2) ^ -1969685421;
                        continue block27;
                    }
                    case -7923134: {
                        var4_5 ^= var5_4 ^ 280745947;
                        ** continue;
                    }
                    case 1631100201: {
                        v0 = null;
                        break;
                    }
                    case 840241753: {
                        if (var2_6 == null) ** GOTO lbl57
                        var5_4 = (var3_3 | var6_2) ^ -628699796;
                        continue block27;
                    }
                    case 1729808542: {
                        var4_5 ^= var5_4 ^ -2010774265;
                        var5_4 = (var3_3 | var6_2) ^ 1965269783;
                        continue block27;
                    }
                    case 1612964487: {
                        if (var2_6.isBlank()) {
                            ** continue;
                        }
                        break block33;
                    }
                    case 1137856298: {
                        var4_5 ^= var5_4 ^ -1229019032;
                        ** continue;
                    }
                }
                var4_5 ^= 1319957283;
                return v0;
            }
            var5_4 = (var3_3 | var6_2) ^ -1918773686;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String Rk(String var0) {
        block17: {
            block16: {
                var4_1 = -684466563;
                var1_2 = gq.a & -684466563 ^ -129156106;
                var3_3 = 0;
                if (true) ** GOTO lbl17
                block9: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 482957324;
lbl7:
                    // 4 sources

                    block10: while (true) {
                        switch (var3_3) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                default: {
                                    continue block10;
                                }
                                break;
                            }
lbl12:
                            // 1 sources

                            return v0;
                            case -296838869: {
                                var2_4 ^= var3_3 ^ -278630800;
                                continue block9;
                            }
lbl17:
                            // 1 sources

                            var2_4 = (var1_2 | var4_1) ^ 1819611220;
                            var3_3 = (var1_2 | var4_1) ^ 236636624;
                            ** GOTO lbl-1000
lbl20:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -72188859;
                                ** GOTO lbl-1000
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1273702831;
                                ** continue;
                                break;
                            }
                            case -1901262330: {
                                v0 = "https://" + var0.substring(gq.Rf((var2_4 | var3_3 ^ 1503581307) ^ (var3_3 ^ 1946979699), (var1_2 | var3_3 ^ 1503581307) ^ ((var2_4 | var3_3 ^ 1503581307) ^ (var3_3 ^ 525949653))));
                                break block9;
                            }
                            case 80577466: {
                                v0 = var0;
                                break block9;
                            }
                            case -474568717: {
                                if (var0.startsWith(gq.k)) {
                                    ** continue;
                                }
                                break block16;
                            }
                        }
                        break;
                    }
                    break;
                }
                var2_4 ^= 1487414446;
                ** while (true)
            }
            var3_3 = (var1_2 | var4_1) ^ 1868734466;
            ** GOTO lbl7
            {
                case 1265314222: {
                    var2_4 ^= var3_3 ^ 193320867;
                    break;
                }
                case -245025233: {
                    break block17;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 1909650937;
            ** GOTO lbl7
            {
                ** case -1877123075:
            }
lbl49:
            // 1 sources

            var2_4 ^= var3_3 ^ -789339664;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ 288450260;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block35: {
            break block35;
lbl1:
            // 1 sources

            while (true) {
                var6_5 ^= -560797168;
                var1_6 = var0_3.length / 4;
                var7_2 = var9 ^ -2118471327;
                if (true) ** GOTO lbl-1000
                block26: while (true) {
                    switch (var7_2) lbl-1000:
                    // 2 sources

                    {
                        default: {
                            continue block26;
                        }
                        case -2117956305: {
                            var6_5 ^= var7_2 ^ 1551056320;
                            ** break;
                        }
                        case -1010641666: {
                            var3_7 = 0;
                            var6_5 ^= -1377142551;
                            var4_8 = 0;
                            break block26;
                        }
lbl18:
                        // 1 sources

                        var7_2 = var9 ^ 601179308;
                        continue block26;
                        case 1638736179: {
                            var6_5 ^= var7_2 ^ 494010089;
                            var7_2 = var9 ^ -1721149503;
                            continue block26;
                        }
                        case 2038351763: 
                    }
                    gq.a = new int[var1_6];
                    var7_2 = var9 ^ 1641356669;
                }
                while (true) {
                    var5_9 = (var0_3[var3_7] & (((var6_5 ^= -471963535) | var9) ^ -453528671)) << ((var6_5 | var9) ^ -453528762) | (var0_3[var3_7 + 1] & ((var6_5 | var9) ^ -453528671)) << ((var6_5 | var9) ^ -453528754) | (var0_3[var3_7 + 2] & ((var6_5 | var9) ^ -453528671)) << ((var6_5 | var9) ^ -453528746) | var0_3[var3_7 + 3] & ((var6_5 | var9) ^ -453528671);
                    var7_2 = var9 ^ 1948410669;
                    ** GOTO lbl48
                    break;
                }
                break;
            }
lbl32:
            // 1 sources

            while (true) {
                var6_5 ^= -797804236;
                var0_3 = "\u00a58K\u00d2\u0012V\u00b2\u0005L\u00b8UMg\u0082^\u00b5n\u0006,\u00ef\u009e?\u0088\u00f6n\u00a3=\u0086\u00d7BW\u0096\u0084\u0019\u00ff\u0007b\u009b\u0006\u00c8Gp\u00f0\u0087\u00d4Vd\u00fcU\u008bP1\u00d8Oj\u00833\u00fcI\u00cb\u00ec\u00bb\u001e\u00c5\u0002ai[\u001a\u00faj\u000b".getBytes("ISO-8859-1");
                ** continue;
                break;
            }
lbl36:
            // 1 sources

            while (true) {
                gq.a = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(v0 | (-6106425490300363173L >>> (var7_2 ^ 795905329) ^ (long)v1 & 0xFFFFFFFFL) << (var7_2 ^ 795905329))).followRedirects(HttpClient.Redirect.NORMAL).build();
                var7_2 = var9 ^ -600100660;
                if (true) ** GOTO lbl48
                break;
            }
            block30: while (true) {
                var7_2 = var9 ^ 283532710;
                ** GOTO lbl48
lbl43:
                // 1 sources

                while (true) {
                    var7_2 = var9 ^ var8_1;
                    if (true) ** GOTO lbl48
                    break;
                }
                block32: while (true) {
                    var7_2 = var9 ^ 663864927;
lbl48:
                    // 5 sources

                    block33: while (true) {
                        block36: {
                            switch (var7_2) {
                                default: {
                                    continue block33;
                                }
                                case -1078904717: {
                                    gq.e = gj.decode("165b6aAH0ZPojP7WMTF+", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214342), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ -317875922))));
                                    gq.j = gj.decode("pDb0", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214337), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ -611781125))));
                                    gq.d = gj.decode("HriNYA==", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214336), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ -741110521))));
                                    gq.p = gj.decode("135hzZQ=", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214339), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 665995122))));
                                    gq.a = gj.decode("+iHPEPLpqpg1lRnI", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214338), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 408906432))));
                                    gq.i = gj.decode("ecZ7UtPVoJ0R", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214349), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ -1435315650))));
                                    gq.l = gj.decode("uJ2GBTSBe3SbbCo=", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214348), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ -1640319092))));
                                    gq.b = gj.decode("zYjG659fkE4=", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214351), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1528217352))));
                                    gq.m = gj.decode("hXT96JS8xQ==", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214350), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 581204325))));
                                    gq.o = gj.decode("wS+AYjOmc31wXozXdw==", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214345), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ -1510264714))));
                                    gq.n = gj.decode("EC2Z2NomqMC4OOCVz3V4", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214344), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1259719988))));
                                    gq.k = gj.decode("ptEx5DmY5Q==", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214347), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 196440780))));
                                    gq.f = gj.decode("JPOiROTylhJwHQ==", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214346), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 2057153843))));
                                    gq.g = gj.decode("WtoR8Os=", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214357), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1994170897))));
                                    gq.c = gj.decode("OWTEug4WxvQ3Q0n4kOxlRk0=", gq.Rf((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 1687214356), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ -1609842010))));
                                    gq.h = gq.e;
                                    var7_2 = var9 ^ 693218915;
                                    continue block33;
                                }
                                case -1808403585: {
                                    var6_5 ^= var7_2 ^ 2044364646;
                                    var7_2 = var9 ^ 1833512282;
                                    continue block33;
                                }
                                case 1761144684: {
                                    var6_5 ^= var7_2 ^ 1724510980;
                                    var7_2 = var9 ^ 344860516;
                                    continue block33;
                                }
                                case -252588556: {
                                    var6_5 ^= var7_2 ^ 1894023804;
                                    var7_2 = var9 ^ -815325885;
                                    continue block33;
                                }
                                case -1923171064: {
                                    gq.a[var4_8] = var5_9 ^= var2_4;
                                    break block36;
                                }
                                case 795905297: {
                                    v0 = -6106425490300363173L << (var7_2 ^ 795905329) >>> (var7_2 ^ 795905329) ^ (long)var6_5 & 0xFFFFFFFFL;
                                    v1 = var6_5;
                                    ** break;
                                }
                                case -918143439: {
                                    var6_5 ^= var7_2 ^ -1804671141;
                                    var7_2 = var9 ^ 272219364;
                                    continue block33;
                                }
                                case -1729567707: {
                                    var6_5 ^= var7_2 ^ -1984022556;
                                    ** continue;
                                }
                                case 1009557662: {
                                    var6_5 ^= var7_2 ^ -239606249;
                                    continue block32;
                                }
                                case -191252682: {
                                    var3_7 += 4;
                                    if (++var4_8 < var1_6) ** continue;
                                    var7_2 = var9 ^ 2030007415;
                                    continue block33;
                                }
                                case -947497459: {
                                    gq.a = Executors.newSingleThreadExecutor(new aV());
                                    return;
                                }
lbl109:
                                // 1 sources

                                var6_5 ^= -399112705;
                                var6_5 ^= 2143545918;
                                var6_5 ^= -2065465974;
                                ** continue;
                                case -265409354: 
                            }
                            gq.a = Duration.ofSeconds(3122351159454781918L << (var7_2 ^ -265409386) >>> (var7_2 ^ -265409386) ^ (long)var6_5 & 0xFFFFFFFFL | (3122351159454781918L >>> (var7_2 ^ -265409386) ^ (long)var6_5 & 0xFFFFFFFFL) << (var7_2 ^ -265409386));
                            continue block30;
                        }
                        var7_2 = var9 ^ -1997570242;
                    }
                    break;
                }
                break;
            }
        }
        var9 = -535326638;
        var8_1 = 1604757537;
        gq.a = mK.a(MethodHandles.lookup().lookupClass(), -394424188);
        var7_2 = 0;
        var6_5 = 1722756742;
        var7_2 = var9 ^ -1920119430;
        block34: while (true) {
            switch (var7_2) {
                default: {
                    continue block34;
                }
                case -1675167894: {
                    var2_4 = (var6_5 | var7_2 ^ 2083612472) ^ (var7_2 ^ -1940890312) ^ gq.a;
                    ** continue;
                }
                case 1838865704: {
                    var7_2 = var9 ^ 1583689010;
                    continue block34;
                }
                case -1099776672: 
            }
            var6_5 ^= var7_2 ^ -1114583965;
            var7_2 = var9 ^ 2083612472;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String Rl(String var0) {
        var6_1 = -1368381760;
        var3_2 = gq.a & -1368381760 ^ 657385336;
        var5_3 = 0;
        var4_4 = (var3_2 | var6_1) ^ 171310695;
        var5_3 = (var3_2 | var6_1) ^ -1435034626;
        ** GOTO lbl74
lbl-1000:
        // 1 sources

        {
            block27: {
                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ 1419654274;
                    break block27;
                    break;
                }
lbl10:
                // 1 sources

                block22: while (true) {
                    block28: {
                        switch (var4_4) {
                            case 158174768: {
                                var4_4 ^= 637785556;
                                continue block22;
                            }
                            case 123711839: {
                                var4_4 ^= -1136214068;
                                break;
                            }
                            default: {
                                var4_4 ^= 1159182493;
                                break;
                            }
                        }
                        var4_4 ^= -2130431734;
                        var4_4 ^= 1912143071;
                        var4_4 ^= -137231518;
                        var1_5 = v0.uri(URI.create(var0)).timeout(gq.a).header(gq.f, gq.e).GET().build();
                        var4_4 ^= -342473819;
                        HttpResponse.BodyHandlers.ofString();
                        var2_7 = null;
                        var5_3 = (var3_2 | var6_1) ^ 1188182541;
                        break block28;
lbl33:
                        // 2 sources

                        while (true) {
                            var5_3 = (var3_2 | var6_1) ^ 1683504331;
                            break block28;
                            break;
                        }
lbl36:
                        // 2 sources

                        while (true) {
                            var4_4 ^= -507857125;
                            return v1;
                        }
                    }
                    block25: while (true) {
                        switch (var5_3) {
                            default: {
                                continue block25;
                            }
                            case -374546955: {
                                var4_4 ^= var5_3 ^ 147216992;
                                var5_3 = (var3_2 | var6_1) ^ 47423682;
                                continue block25;
                            }
                            case -1381152966: {
                                if (var2_7.statusCode() != gq.Rf((var4_4 | var5_3 ^ 64840186) ^ (var5_3 ^ 789448821), (var3_2 | var5_3 ^ 64840186) ^ ((var4_4 | var5_3 ^ 64840186) ^ (var5_3 ^ -1556857280)))) ** GOTO lbl33
                                var5_3 = (var3_2 | var6_1) ^ -455456277;
                                continue block25;
                            }
                            case 1269083667: {
                                var5_3 = (var3_2 | var6_1) ^ 1732426575;
                                continue block25;
                            }
                            case -935568201: {
                                if (var2_7.body() != null) ** break;
                                ** continue;
                                var5_3 = (var3_2 | var6_1) ^ 1515995500;
                                continue block25;
                            }
                            case -182278508: {
                                var4_4 ^= var5_3 ^ -572035073;
                                var5_3 = (var3_2 | var6_1) ^ -268351152;
                                continue block25;
                            }
                            case 1602203304: {
                                v1 = (String)var2_7.body();
                                ** GOTO lbl36
                            }
                            case -886645965: {
                                var4_4 ^= var5_3 ^ -471657896;
                                var5_3 = (var3_2 | var6_1) ^ 2018595879;
                                continue block25;
                            }
                            case -684739617: 
                        }
                        break;
                    }
                    v1 = null;
                    ** continue;
                    break;
                }
            }
            block26: while (true) {
                switch (var5_3) {
                    default: {
                        continue block26;
                    }
                    case 84540422: {
                        ** continue;
                    }
                    case -69151878: {
                        var4_4 ^= var5_3 ^ -1247590151;
                        var5_3 = (var3_2 | var6_1) ^ -484173131;
                        continue block26;
                    }
                    case 1281031501: 
                }
                break;
            }
            v0 = HttpRequest.newBuilder();
            ** continue;
        }
    }

    /*
     * Exception decompiling
     */
    private static byte[] Rm(String var0) {
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
     * Exception decompiling
     */
    private static /* synthetic */ void Rn(byte[] var0, class_310 var1_1, BiConsumer var2_2, int var3_3, long var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [27[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static /* synthetic */ String Ro() {
        int n2 = a & 0x6F784FF8 ^ 0x49A12082;
        int n3 = 0;
        int n4 = (n2 | 0x6F784FF8) ^ 0x99A7DC21;
        n3 = (n2 | 0x6F784FF8) ^ 0x7CE1DEE0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 419173329: {
                    n4 ^= n3 ^ 0x6CA55EB7;
                    n3 = (n2 | 0x6F784FF8) ^ 0xFBE0325E;
                    continue block5;
                }
                case 320385306: {
                    n3 = (n2 | 0x6F784FF8) ^ 0x77057C2B;
                    continue block5;
                }
                case -1810276956: 
            }
            break;
        }
        return c;
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void Rp(String var0, class_310 var1_1, BiConsumer var2_2, int var3_3) {
        block43: {
            block40: {
                block41: {
                    block42: {
                        break block42;
                        while (true) {
                            var7_6 = (var5_5 | var8_4) ^ 1304915233;
                            ** GOTO lbl61
lbl4:
                            // 1 sources

                            while (true) {
                                var6_8 ^= var7_6 ^ 888238312;
                                ** GOTO lbl26
                                break;
                            }
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var4_7 = gq.Rh(var0);
                            ** GOTO lbl85
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var7_6 = (var5_5 | var8_4) ^ -1881931148;
                            ** GOTO lbl61
                            break;
                        }
lbl13:
                        // 1 sources

                        block25: while (true) {
                            switch (var7_6) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    default: {
                                        continue block25;
                                    }
                                    break;
                                }
                                case 1994703105: {
                                    ** continue;
                                }
lbl20:
                                // 1 sources

                                while (true) {
                                    gq.registerBytesAsync(var4_7.bytes(), var4_7.durationMs(), var3_3, var1_1, var2_2);
                                    break block40;
                                    break;
                                }
lbl23:
                                // 1 sources

                                while (true) {
                                    var7_6 = (var5_5 | var8_4) ^ 2118128327;
                                    ** GOTO lbl61
                                    break;
                                }
lbl26:
                                // 1 sources

                                var7_6 = (var5_5 | var8_4) ^ 885746286;
                                ** GOTO lbl61
lbl28:
                                // 1 sources

                                while (true) {
                                    var6_8 ^= var7_6 ^ 1154267528;
                                    ** GOTO lbl60
                                    break;
                                }
lbl31:
                                // 1 sources

                                while (true) {
                                    var6_8 ^= var7_6 ^ 1039456488;
                                    ** continue;
                                    break;
                                }
lbl34:
                                // 1 sources

                                while (true) {
                                    var7_6 = (var5_5 | var8_4) ^ 1641246333;
                                    ** GOTO lbl61
lbl37:
                                    // 1 sources

                                    while (true) {
                                        var1_1.execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, Rq(java.util.function.BiConsumer int ), ()V)((BiConsumer)var2_2, (int)var3_3));
                                        var7_6 = (var5_5 | var8_4) ^ 1423160234;
                                        ** GOTO lbl61
                                        break;
                                    }
                                    break;
                                }
lbl41:
                                // 1 sources

                                while (true) {
                                    var7_6 = (var5_5 | var8_4) ^ -1990248714;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl44:
                                // 1 sources

                                while (true) {
                                    var7_6 = (var5_5 | var8_4) ^ -845927342;
                                    ** continue;
                                    break;
                                }
lbl47:
                                // 1 sources

                                while (true) {
                                    var7_6 = (var5_5 | var8_4) ^ -2110134720;
                                    ** GOTO lbl61
lbl50:
                                    // 1 sources

                                    return;
lbl52:
                                    // 1 sources

                                    while (true) {
                                        var6_8 ^= var7_6 ^ -615382092;
                                        var7_6 = (var5_5 | var8_4) ^ 1515770731;
                                        ** GOTO lbl61
                                        break;
                                    }
lbl56:
                                    // 1 sources

                                    while (var4_7 == null) {
                                        ** continue;
lbl58:
                                        // 1 sources

                                        ** GOTO lbl10
                                    }
                                    break block41;
                                    break;
                                }
lbl60:
                                // 1 sources

                                var7_6 = (var5_5 | var8_4) ^ 1202359126;
lbl61:
                                // 13 sources

                                block39: while (true) {
                                    switch (var7_6) {
                                        default: {
                                            continue block39;
                                        }
                                        case -1300456746: {
                                            ** continue;
                                        }
                                        case -881812071: {
                                            ** continue;
                                        }
                                        case 735670788: {
                                            ** continue;
                                        }
                                        case 1457518831: {
                                            ** continue;
                                        }
                                        case 1886385539: {
                                            break;
                                        }
                                        case -1511840612: {
                                            ** continue;
                                        }
                                        case -2114198224: {
                                            ** continue;
                                        }
                                        case 155616045: {
                                            ** continue;
                                        }
                                        case -1637312118: {
                                            ** GOTO lbl56
                                        }
                                    }
                                    var7_6 = (var5_5 | var8_4) ^ -1498983659;
                                    continue;
                                    break;
                                }
lbl85:
                                // 1 sources

                                var7_6 = (var5_5 | var8_4) ^ -1173461372;
                                ** GOTO lbl61
                                {
                                    case -1206813535: {
                                        if (var4_7 != null) ** continue;
                                        break;
                                    }
                                    case 1495049442: {
                                        var4_7 = gq.Ri(var0);
                                        break block41;
                                    }
                                }
                                case 1023143066: {
                                    var6_8 ^= var7_6 ^ -1491165055;
                                    ** continue;
                                }
                                case 841997221: 
                            }
                            break;
                        }
                        break block43;
                        {
                            case 2105676215: {
                                return;
                            }
                        }
                        var7_6 = (var5_5 | var8_4) ^ -151161638;
                        ** GOTO lbl61
                        {
                            case -1419230115: {
                                var6_8 ^= var7_6 ^ 1938027746;
                                ** continue;
                            }
                        }
                    }
                    var8_4 = -1767356969;
                    var5_5 = gq.a & -1767356969 ^ -73682122;
                    var7_6 = 0;
                    var6_8 = (var5_5 | var8_4) ^ -538818422;
                    ** while (true)
                    {
                        ** case 1169527155:
                    }
lbl112:
                    // 1 sources

                    var6_8 ^= var7_6 ^ 1150463368;
                    ** while (true)
                }
                var7_6 = (var5_5 | var8_4) ^ -731740685;
                ** GOTO lbl61
            }
            var7_6 = (var5_5 | var8_4) ^ -1453060328;
            ** while (true)
        }
        var7_6 = (var5_5 | var8_4) ^ -1019208851;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Rq(BiConsumer biConsumer, int n2) {
        int n3 = a & 0x186FA8C3 ^ 0xA9F6C0FD;
        int n4 = 0;
        int n5 = (n3 | 0x186FA8C3) ^ 0xB828B313;
        n4 = (n3 | 0x186FA8C3) ^ 0x3E2D8FAD;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -1114215822: {
                    biConsumer.accept(n2, Optional.empty());
                    return;
                }
                case -2016254126: {
                    n4 = (n3 | 0x186FA8C3) ^ 0xF29582C8;
                    continue block5;
                }
                case 1265265207: 
            }
            n5 ^= n4 ^ 0xA786ECBD;
            n4 = (n3 | 0x186FA8C3) ^ 0x469828D;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Rr(BiConsumer biConsumer, int n2) {
        int n3 = a & 0xCA59F03F ^ 0x96C19F61;
        int n4 = 0;
        int n5 = (n3 | 0xCA59F03F) ^ 0xB596BAF9;
        n4 = (n3 | 0xCA59F03F) ^ 0x785C582F;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -1501190320: {
                    break;
                }
                case 1033615035: {
                    n5 ^= n4 ^ 0x9F912729;
                    n4 = (n3 | 0xCA59F03F) ^ 0x63ED4E57;
                    continue block5;
                }
                case -1120620248: {
                    biConsumer.accept(n2, Optional.empty());
                    return;
                }
            }
            n4 = (n3 | 0xCA59F03F) ^ 0xE34249C4;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Rs(String var0, BiConsumer var1_1, int var2_2) {
        block30: {
            break block30;
lbl1:
            // 2 sources

            while (true) {
                var1_1.accept(v0, v1 /* !! */ );
                var6_5 = (var4_4 | var7_3) ^ -1573953266;
                if (true) ** GOTO lbl25
                break;
            }
lbl5:
            // 1 sources

            while (true) {
                v1 /* !! */  = Optional.of(new dO(var3_6.bytes(), var3_6.durationMs()));
lbl7:
                // 2 sources

                while (true) {
                    switch (var5_7) {
                        case -865022610: {
                            var5_7 ^= -790942034;
                            ** GOTO lbl1
                        }
                        case -1258341971: {
                            var5_7 ^= 1598294237;
                            ** continue;
                        }
                    }
                    var5_7 ^= 636129330;
                    continue;
                    break;
                }
                break;
            }
            block22: while (true) {
                var6_5 = (var4_4 | var7_3) ^ -624087193;
                ** GOTO lbl25
lbl20:
                // 1 sources

                while (true) {
                    var6_5 = (var4_4 | var7_3) ^ -875369656;
                    if (true) ** GOTO lbl25
                    break;
                }
                block24: while (true) {
                    var6_5 = (var4_4 | var7_3) ^ -139685504;
lbl25:
                    // 4 sources

                    block25: while (true) {
                        switch (var6_5) {
                            case -1568834232: {
                                ** break;
                            }
                            case 1953175990: {
                                return;
                            }
                            case 465009138: {
                                var5_7 ^= var6_5 ^ -1672139754;
                                ** break;
                            }
                            case 1854023601: {
                                var3_6 = gq.Ri(var0);
                                continue block22;
                            }
                            case 496407536: {
                                var5_7 ^= var6_5 ^ 722764796;
                                ** continue;
                            }
                            case 1209361278: {
                                v0 = var2_2;
                                if (var3_6 == null) {
                                    break;
                                }
                                ** GOTO lbl52
                            }
lbl45:
                            // 1 sources

                            var6_5 = (var4_4 | var7_3) ^ -784607921;
                            continue block25;
lbl47:
                            // 1 sources

                            var6_5 = (var4_4 | var7_3) ^ 798330093;
                            continue block25;
                            case 1702157721: {
                                var5_7 ^= var6_5 ^ 2046145741;
                                continue block24;
                            }
lbl52:
                            // 1 sources

                            var5_7 ^= 1743393360;
                            ** continue;
                            case -1876132333: {
                                if (var3_6 != null) ** break;
                                var6_5 = (var4_4 | var7_3) ^ 499421110;
                                continue block25;
                            }
                        }
                        var5_7 ^= 1743393360;
                        v1 /* !! */  = Optional.empty();
                        ** continue;
lbl61:
                        // 2 sources

                    }
                    break;
                }
                break;
            }
lbl62:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ -1542550772;
                ** GOTO lbl61
                break;
            }
        }
        var7_3 = -1439649666;
        var4_4 = gq.a & -1439649666 ^ -1111899406;
        var6_5 = 0;
        var5_7 = (var4_4 | var7_3) ^ 1776384639;
        var6_5 = (var4_4 | var7_3) ^ 597509646;
        block28: while (true) {
            switch (var6_5) {
                default: {
                    continue block28;
                }
                case -1675315984: {
                    break;
                }
                case -986045889: {
                    var3_6 = gq.Rh(var0);
                    ** continue;
                }
                case 1126449078: {
                    var5_7 ^= var6_5 ^ -1517988679;
                    ** break;
lbl83:
                    // 1 sources

                    var6_5 = (var4_4 | var7_3) ^ 2055459009;
                    continue block28;
                }
            }
            var6_5 = (var4_4 | var7_3) ^ -56767160;
        }
    }
}

