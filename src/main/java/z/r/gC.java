/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.dw;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class gC {
    private static final String[] a;
    public static final int a;
    private static final Object[] a;
    private static boolean a;
    private static volatile Map<String, byte[]> a;

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

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static synchronized void clear() {
        block18: {
            block17: {
                var4 = -1323031360;
                var1_1 = gC.a & -1323031360 ^ 1531614292;
                var3_2 = 0;
                var2_4 = (var1_1 | var4) ^ -68298591;
                var3_2 = (var1_1 | var4) ^ -1359332297;
                break block17;
lbl7:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | var4) ^ 1100264687;
                    break block17;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | var4) ^ 21418963;
                    break block18;
                    break;
                }
            }
            block15: while (true) {
                switch (var3_2) {
                    case 1435797731: {
                        var3_2 = (var1_1 | var4) ^ -1169518611;
                    }
                    default: {
                        continue block15;
                    }
                    case 1092893497: {
                        var2_4 ^= var3_2 ^ 626101537;
                        ** continue;
                    }
                    case -1158021061: 
                }
                break;
            }
            var0_3 = gC.a;
            var3_2 = (var1_1 | var4) ^ -1100811744;
        }
        block16: while (true) {
            switch (var3_2) {
                case -128330202: {
                    var2_4 ^= var3_2 ^ -176443424;
                    var3_2 = (var1_1 | var4) ^ 968727939;
                    continue block16;
                }
                case 1158432500: {
                    var2_4 ^= var3_2 ^ -1748645487;
                    var3_2 = (var1_1 | var4) ^ -532188045;
                    continue block16;
                }
                case -1026348713: {
                    var0_3.values().forEach((Consumer<byte[]>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$clear$0(byte[] ), ([B)V)());
                    ** continue;
                }
                case 455721127: {
                    gC.a = Map.of();
                    var3_2 = (var1_1 | var4) ^ 53961458;
                    ** break;
                }
                case -98015481: {
                    var2_4 ^= var3_2 ^ -18973574;
                    var3_2 = (var1_1 | var4) ^ -1740051141;
                }
lbl47:
                // 3 sources

                default: {
                    continue block16;
                }
                case 1663457775: 
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private gC() {
        int n2 = a & 0xF9FF64B ^ 0x9C79CED6;
        int n3 = (n2 | 0xF9FF64B) ^ 0xFD95C76D;
        n3 ^= 0xA24D2C5C;
        n3 ^= 0x1DA60C2F;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static synchronized void install(ClassLoader var0, Map<String, byte[]> var1_1) throws Exception {
        var7_2 = -282702393;
        var4_3 = gC.a & -282702393 ^ -546470063;
        var6_4 = 0;
        var5_7 = (var4_3 | var7_2) ^ 1672521139;
        var6_4 = (var4_3 | var7_2) ^ -1906073093;
        ** GOTO lbl48
lbl7:
        // 1 sources

        while (true) {
            var6_4 = (var4_3 | var7_2) ^ 1705271914;
            if (true) ** GOTO lbl12
            break;
        }
        block22: while (true) {
            var6_4 = (var4_3 | var7_2) ^ -1725917197;
lbl12:
            // 2 sources

            block23: while (true) {
                switch (var6_4) {
                    case -1697927747: {
                        var5_7 ^= var6_4 ^ 650433228;
                        ** break;
                    }
                    case -1628497383: {
                        gC.a = Map.copyOf(new LinkedHashMap<String, byte[]>(var1_1));
                        ** continue;
                    }
                    case 1716475940: {
                        var5_7 ^= var6_4 ^ -2097915157;
                        ** break;
                    }
                    case -1438862769: {
                        if (gC.a) continue block22;
                        var6_4 = (var4_3 | var7_2) ^ 982651780;
                        break;
                    }
                    case -2119490921: {
                        return;
                    }
                    case 1896640044: {
                        var6_4 = (var4_3 | var7_2) ^ -2013115491;
                        break;
                    }
lbl32:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 1431535000;
                    break;
lbl34:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 2126835008;
                    continue block23;
                    case -770748754: {
                        var2_5 = new URL(null, gC.a((var5_7 | var6_4 ^ 1026098025) ^ (var6_4 ^ -792455174), (var4_3 | var6_4 ^ 1026098025) ^ ((var5_7 | var6_4 ^ 1026098025) ^ (var6_4 ^ 1961131694))), new dw());
                        var3_6 = var0.getClass().getMethod(gC.a(((var5_7 ^= 931321027) | var7_2) ^ 306956629, (var4_3 | var7_2) ^ ((var5_7 | var7_2) ^ 136290304)), new Class[]{URL.class});
                        var6_4 = (var4_3 | var7_2) ^ 1078507491;
                        break block22;
                    }
                    case -973218733: {
                        var5_7 ^= var6_4 ^ -1955911163;
                        var6_4 = (var4_3 | var7_2) ^ 761299321;
                        break;
                    }
                    case 2003665994: {
                        var5_7 ^= var6_4 ^ -186262306;
                        var6_4 = (var4_3 | var7_2) ^ 1635833294;
                    }
                }
lbl48:
                // 7 sources

            }
            break;
        }
        block24: while (true) {
            block25: {
                switch (var6_4) {
                    case -369532961: {
                        var5_7 ^= var6_4 ^ 844418993;
                        ** break;
                    }
                    case 2091731771: {
                        var5_7 ^= var6_4 ^ -449969342;
                        ** GOTO lbl76
                    }
lbl57:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 455360260;
                    ** GOTO lbl77
                    case -1087932364: {
                        var5_7 ^= var6_4 ^ 939568104;
                        var6_4 = (var4_3 | var7_2) ^ 884340380;
                        ** GOTO lbl77
                    }
                    case -464785197: {
                        var3_6.invoke((Object)var0, new Object[]{var2_5});
                        ** GOTO lbl79
                    }
                    case -1317794558: {
                        gC.a = true;
                        break block25;
                    }
                    case -1842021652: {
                        return;
                    }
                    case -874890933: {
                        var3_6.setAccessible(true);
                        var6_4 = (var4_3 | var7_2) ^ 378966024;
                        ** GOTO lbl77
                    }
lbl76:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 1310442197;
lbl77:
                    // 5 sources

                    default: {
                        continue block24;
                    }
lbl79:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ -2084403988;
                    continue block24;
                    case -2000996995: 
                }
                var5_7 ^= var6_4 ^ -745898947;
                var6_4 = (var4_3 | var7_2) ^ 1834693947;
                continue;
            }
            var6_4 = (var4_3 | var7_2) ^ 2010446506;
        }
    }

    /*
     * Exception decompiling
     */
    static {
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
    private static /* synthetic */ void lambda$clear$0(byte[] var0) {
        block9: {
            block10: {
                break block10;
lbl1:
                // 1 sources

                while (true) {
                    var2_3 ^= var3_2 ^ -1709791802;
                    break block9;
                    break;
                }
            }
            var1_1 = gC.a & -1808972977 ^ -600180875;
            var3_2 = 0;
            var2_3 = (var1_1 | -1808972977) ^ 453476660;
            ** GOTO lbl18
        }
        var3_2 = (var1_1 | -1808972977) ^ -1465281881;
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
                case -1701024234: {
                    ** continue;
                }
lbl18:
                // 1 sources

                var3_2 = (var1_1 | -1808972977) ^ 783205084;
                ** GOTO lbl-1000
lbl20:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -1808972977) ^ 1184995689;
                    ** continue;
                    break;
                }
                case -225233501: {
                    ** continue;
                }
                case 1955882456: 
            }
            break;
        }
        Arrays.fill(var0, (byte)0);
    }
}

