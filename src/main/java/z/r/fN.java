/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import dev.jnic.KERseB.JNICLoader;
import java.net.http.HttpRequest;
import java.util.concurrent.ScheduledExecutorService;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.U;
import z.r.cM;
import z.r.ms;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
@Environment(value=EnvType.CLIENT)
public final class fN {
    private static int[] a;
    private static ScheduledExecutorService a;
    public static int c;
    private static volatile long a;
    private static volatile boolean a;
    private static volatile ms a;
    private static long b;
    private static Object[] a;
    private static volatile String a;
    private static volatile String b;
    private static String[] a;
    private static volatile boolean b;
    private static volatile U a;
    private static volatile boolean c;
    private static int a;
    private static volatile String c;
    private static volatile int b;
    private static volatile String d;

    /*
     * Enabled aggressive block sorting
     */
    private fN() {
        int n2 = c & 0xA03314FE ^ 0x54F58C64;
        int n3 = (n2 | 0xA03314FE) ^ 0xD7CCCA41;
        n3 ^= 0xF14C4306;
        n3 ^= 0xF0F23FCF;
    }

    static synchronized native void bootstrap();

    static native void startPayload();

    public static native boolean isReady();

    /*
     * Exception decompiling
     */
    private static String a(int var0, int var1_1) {
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

    private static int a(int n2, int n3) {
        int n4 = -1530540548;
        int n5 = -1348622281;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x6EF82FB9)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xAFDD32E6;
        n6 ^= (n5 | n4) ^ 0xAFDD7146;
        n6 += (n5 | n4) ^ 0xAFDD0181;
        n6 -= (n5 | n4) ^ 0xAFDD6558;
        n6 += (n5 | n4) ^ 0xAFDDCA95;
        n6 -= (n5 | n4) ^ 0xAFDD9C48;
        n6 += (n5 | n4) ^ 0xAFDD139D;
        n6 ^= (n5 | n4) ^ 0xAFDD52FA;
        return n6 += (n5 | n4) ^ 0xAFDD70CC;
    }

    public static native boolean isLicensed();

    /*
     * Unable to fully structure code
     */
    public static String error() {
        block19: {
            block20: {
                break block20;
lbl1:
                // 1 sources

                block9: while (true) {
                    block21: {
                        var2_2 = (var0_1 | var3) ^ 508474387;
                        break block21;
lbl4:
                        // 1 sources

                        while (true) {
                            v0 = "";
                            ** GOTO lbl28
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var1_3 ^= var2_2 ^ -1919618381;
                            ** GOTO lbl34
                            break;
                        }
                    }
lbl11:
                    // 4 sources

                    block12: while (true) {
                        switch (var2_2) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                default: {
                                    continue block12;
                                }
                                break;
                            }
                            case -438638628: {
                                break block9;
                            }
                            case -347698366: {
                                ** continue;
                            }
                            case -516075766: {
                                ** continue;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ 339046491;
                                ** GOTO lbl-1000
                                break;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ 447290565;
                                ** GOTO lbl-1000
                                break;
                            }
lbl28:
                            // 2 sources

                            while (true) {
                                var1_3 ^= -1741829071;
                                break block19;
                                break;
                            }
                            case -704535253: {
                                var1_3 ^= var2_2 ^ -1163388782;
                                ** continue;
                            }
lbl34:
                            // 1 sources

                            var2_2 = (var0_1 | var3) ^ -1387226426;
                            ** continue;
                        }
                        break;
                    }
                    break;
                }
                var2_2 = (var0_1 | var3) ^ -1511255205;
                ** GOTO lbl11
            }
            var3 = -296568320;
            var0_1 = fN.c & -296568320 ^ -1222509799;
            var2_2 = 0;
            var1_3 = (var0_1 | var3) ^ -668215386;
            ** while (true)
        }
        return v0;
lbl46:
        // 1 sources

        while (true) {
            var2_2 = (var0_1 | var3) ^ 1778147686;
            ** GOTO lbl11
            break;
        }
        {
            case 1378050527: {
                v0 = fN.b;
                ** continue;
            }
            case 1520429122: {
                var1_3 ^= var2_2 ^ 1991213102;
                ** continue;
            }
        }
lbl55:
        // 1 sources

        while (true) {
            var2_2 = (var0_1 | var3) ^ 695361074;
            ** continue;
            break;
        }
        {
            ** case -1768973697:
        }
lbl59:
        // 1 sources

        ** while (fN.b != null)
lbl60:
        // 1 sources

        ** while (true)
    }

    public static native String payloadProof();

    public static native String payloadDevice();

    public static native void authorize(HttpRequest.Builder var0);

    public static native void authorize(HttpRequest.Builder var0, byte[] var1);

    /*
     * Enabled aggressive block sorting
     */
    public static String releaseId() {
        int n2 = c & 0xA776B575 ^ 0xC953C43A;
        int n3 = 0;
        int n4 = (n2 | 0xA776B575) ^ 0xD6D1D669;
        n3 = (n2 | 0xA776B575) ^ 0x940AB880;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 2071809535: {
                    n3 = (n2 | 0xA776B575) ^ 0xD29DA2B3;
                    continue block5;
                }
                case -26344090: {
                    return U.releaseId();
                }
                case 1038768076: 
            }
            n4 ^= n3 ^ 0x258A0071;
            n3 = (n2 | 0xA776B575) ^ 0x1119F019;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static String apiBase() {
        block26: {
            block24: {
                block25: {
                    break block26;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | var4) ^ -725813484;
                        ** GOTO lbl27
                        break;
                    }
lbl4:
                    // 1 sources

                    block14: while (true) {
                        switch (var3_2) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                default: {
                                    continue block14;
                                }
                                break;
                            }
                            case 373024838: {
                                break block24;
                            }
lbl11:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_2 ^ -1763741666;
                                ** GOTO lbl26
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | var4) ^ -1147747932;
                                ** GOTO lbl27
                                break;
                            }
                            case -1046909445: {
                                var2_4 ^= var3_2 ^ -1112191841;
                                ** GOTO lbl58
                            }
lbl20:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | var4) ^ -386066535;
                                ** GOTO lbl-1000
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                v0 = "";
                                ** GOTO lbl45
                                break;
                            }
lbl26:
                            // 1 sources

                            var3_2 = (var1_1 | var4) ^ 1612103671;
lbl27:
                            // 4 sources

                            block20: while (true) {
                                switch (var3_2) lbl-1000:
                                // 3 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block20;
                                        }
                                        break;
                                    }
                                    case 1162886779: {
                                        ** continue;
                                    }
                                    case -1123241378: {
                                        ** continue;
                                    }
                                    case -486634033: {
                                        var2_4 ^= var3_2 ^ 758317582;
                                        ** continue;
                                    }
                                    while (true) {
                                        var3_2 = (var1_1 | var4) ^ 473461264;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case -449481348: {
                                        var2_4 ^= var3_2 ^ 720960189;
                                        ** GOTO lbl48
                                    }
lbl45:
                                    // 2 sources

                                    while (true) {
                                        var2_4 ^= 44575376;
                                        ** GOTO lbl57
                                        break;
                                    }
lbl48:
                                    // 1 sources

                                    var3_2 = (var1_1 | var4) ^ 1137331585;
                                    ** continue;
                                    case -1630519256: {
                                        if (var0_3 != null) ** continue;
                                        break block25;
                                    }
                                    case 712640715: {
                                        v0 = var0_3.apiBase();
                                        break;
                                    }
                                }
                                ** continue;
lbl57:
                                // 1 sources

                                return v0;
                            }
lbl58:
                            // 1 sources

                            var3_2 = (var1_1 | var4) ^ -1401429759;
                            ** continue;
                            case 1387339486: {
                                var0_3 = fN.a;
                                break block14;
                            }
                        }
                        break;
                    }
                    ** while (true)
                }
                var3_2 = (var1_1 | var4) ^ 468945571;
                ** while (true)
            }
            var3_2 = (var1_1 | var4) ^ 1063227940;
            ** while (true)
        }
        var4 = -1710818482;
        var1_1 = fN.c & -1710818482 ^ -289231401;
        var3_2 = 0;
        var2_4 = (var1_1 | var4) ^ -682833483;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    static /* synthetic */ void $jnicClinit() {
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
     * Unable to fully structure code
     */
    public static void tick() {
        block11: {
            block12: {
                break block12;
lbl1:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
lbl3:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ -2057581082;
                    break block11;
                    break;
                }
            }
            var3 = -1659802961;
            var0_1 = fN.c & -1659802961 ^ 13298413;
            var2_2 = 0;
            var1_3 = (var0_1 | var3) ^ -107152709;
            var2_2 = (var0_1 | var3) ^ -91817557;
            break block11;
            fN.isLicensed();
            var2_2 = (var0_1 | var3) ^ 1543207363;
        }
        block9: while (true) {
            switch (var2_2) lbl-1000:
            // 3 sources

            {
                default: {
                    continue block9;
                }
                case 411051785: {
                    ** continue;
                }
                ** case 1734153028:
lbl24:
                // 1 sources

                var2_2 = (var0_1 | var3) ^ 416994481;
                ** GOTO lbl-1000
                case -2063516066: {
                    var1_3 ^= var2_2 ^ -1164145349;
                    ** continue;
                }
                case -970943700: {
                    var1_3 ^= var2_2 ^ 796418182;
                    var2_2 = (var0_1 | var3) ^ 1150201217;
                    ** GOTO lbl-1000
                }
                case -648722578: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void reportInitFailure(String var0, Throwable var1_1) {
        var2_2 = fN.c & 461509947 ^ 506109913;
        var5_3 = 0;
        var4_4 = (var2_2 | 461509947) ^ -879950226;
        var5_3 = (var2_2 | 461509947) ^ -1321098034;
        block5: while (true) {
            switch (var5_3) {
                default: {
                    continue block5;
                }
                case 1987804780: {
                    var4_4 ^= var5_3 ^ 1133315964;
                    break;
                }
                case -1360315595: {
                    var5_3 = (var2_2 | 461509947) ^ 1775362455;
                    continue block5;
                }
                case -2090123702: {
                    var3_5 = var0;
                    cM.error(fN.a((var4_4 | var5_3 ^ -1729549455) ^ (var5_3 ^ 1609667131), (var2_2 | var5_3 ^ -1729549455) ^ ((var4_4 | var5_3 ^ -1729549455) ^ (var5_3 ^ 441930766))) + var3_5, var1_1);
                    ** break;
lbl19:
                    // 1 sources

                    var4_4 ^= -1435805922;
                    return;
                }
            }
            var5_3 = (var2_2 | 461509947) ^ -1665031759;
        }
    }

    private static native void refreshSession() throws Exception;

    private static native void heartbeat();

    public static synchronized native void logout();

    public static synchronized native void close();

    private static synchronized native void revoke(String var0, boolean var1);

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void lambda$logout$1(ms var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [26[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * Exception decompiling
     */
    private static /* synthetic */ Thread lambda$static$0(Runnable var0) {
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
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static native /* synthetic */ void $jnicLoader();

    static {
        JNICLoader.init();
        fN.$jnicLoader();
        fN.$jnicClinit();
    }
}

