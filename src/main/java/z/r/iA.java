/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class iA {
    private double a;
    private long a;
    public static final int b = mK.a(MethodHandles.lookup().lookupClass(), -224719429);
    private int a;
    private double b;

    /*
     * Enabled aggressive block sorting
     */
    public iA() {
        int n2 = b & 0x5BAEC902 ^ 0x5299E550;
        int n3 = (n2 | 0x5BAEC902) ^ 0x5B6A81F4;
        n3 ^= 0x30CEE077;
    }

    /*
     * Exception decompiling
     */
    public float update(float var1_1, float var2_2, double var3_3, double var5_4) {
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
    public void reset() {
        int n2 = b & 0xA7AF6554 ^ 0x242E95D0;
        int n3 = 0;
        int n4 = (n2 | 0xA7AF6554) ^ 0x94A0CDB9;
        n3 = (n2 | 0xA7AF6554) ^ 0x2AF22B8C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 73465971: {
                    this.a = 0L;
                    this.b = 0.0;
                    this.a = 0.0;
                    this.a = 0;
                    return;
                }
                case -1923228072: {
                    n3 = (n2 | 0xA7AF6554) ^ 0xD01272FF;
                    continue block5;
                }
                case 2008909611: 
            }
            n4 ^= n3 ^ 0x4C5C4D2C;
            n3 = (n2 | 0xA7AF6554) ^ 0xA3CEF5A7;
        }
    }

    /*
     * Exception decompiling
     */
    private double PK() {
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
    private static double PL(double var0) {
        block27: {
            block28: {
                block29: {
                    break block29;
lbl1:
                    // 1 sources

                    while (true) {
                        var6_3 = (var4_2 | var7_1) ^ -752556234;
                        break block27;
lbl4:
                        // 1 sources

                        while (true) {
                            var6_3 = (var4_2 | var7_1) ^ -651221774;
                            break block27;
                            break;
                        }
                        break;
                    }
                }
                var7_1 = 293457790;
                var4_2 = iA.b & 293457790 ^ 817508562;
                var6_3 = 0;
                var5_4 = (var4_2 | var7_1) ^ -441923307;
                ** GOTO lbl56
lbl13:
                // 1 sources

                while (true) {
                    var5_4 ^= var6_3 ^ -49660106;
                    break block28;
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
                    var6_3 = (var4_2 | var7_1) ^ -2009739911;
                    break block27;
                    break;
                }
lbl21:
                // 1 sources

                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ 1585753616;
                    break block27;
lbl24:
                    // 2 sources

                    while (true) {
                        var6_3 = (var4_2 | var7_1) ^ -1233379241;
                        break block27;
                        break;
                    }
                    break;
                }
            }
lbl28:
            // 2 sources

            while (true) {
                var6_3 = (var4_2 | var7_1) ^ -303090692;
                break block27;
lbl31:
                // 1 sources

                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ -1705592786;
                    break block27;
                    break;
                }
                break;
            }
lbl34:
            // 1 sources

            return var2_5 * var2_5 * var2_5 * 1.2;
lbl36:
            // 1 sources

            while (true) {
                var5_4 ^= var6_3 ^ -1235231869;
                ** GOTO lbl24
                break;
            }
            var2_5 = iA.PM(var0, 0.0, 1.0) * 0.6 + 0.2;
            var5_4 ^= 1112820042;
            ** while (true)
        }
        block25: while (true) {
            switch (var6_3) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block25;
                    }
                    break;
                }
                case -1414969392: {
                    ** continue;
                }
                case -388965620: {
                    ** continue;
                }
                case -602878974: {
                    ** continue;
                }
                case -488957752: {
                    ** continue;
                }
lbl56:
                // 1 sources

                var6_3 = (var4_2 | var7_1) ^ -1194245314;
                ** continue;
                case -1993425728: {
                    ** continue;
                }
                case -2021400663: {
                    switch (var5_4) {
                        default: {
                            ** continue;
                        }
                        case 1474402281: {
                            ** continue;
                        }
                        ** case -732481813:
lbl67:
                        // 1 sources

                        ** continue;
                    }
                }
                case -1177931129: {
                    ** continue;
                }
                case 1870352878: 
            }
            break;
        }
        var5_4 ^= var6_3 ^ -717714419;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double PM(double d2, double d3, double d4) {
        int n2 = b & 0x7950D9D3 ^ 0x6BF610BF;
        int n3 = 0;
        int n4 = (n2 | 0x7950D9D3) ^ 0x6DF930AE;
        n3 = (n2 | 0x7950D9D3) ^ 0x57D89DD6;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 741229609: {
                    n3 = (n2 | 0x7950D9D3) ^ 0x2248B718;
                    continue block5;
                }
                case -175563504: {
                    return Math.max(d3, Math.min(d4, d2));
                }
                case 1505652455: 
            }
            n4 ^= n3 ^ 0x91C556BE;
            n3 = (n2 | 0x7950D9D3) ^ 0x8E7FC4EF;
        }
    }
}

