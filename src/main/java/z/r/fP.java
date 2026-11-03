/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.lM;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class fP {
    private static final int[] a;
    public static final int a;
    private final double a;
    private final Random a;
    private double b;
    private double c;
    private final double d;
    private final lM a;

    /*
     * Exception decompiling
     */
    public fP(double var1_1, double var3_2) {
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
    public double getCurrentOffset() {
        block9: {
            var1_1 = fP.a & 401195663 ^ -1068194024;
            var3_2 = 0;
            ** GOTO lbl18
lbl4:
            // 1 sources

            block5: while (true) {
                var3_2 = (var1_1 | 401195663) ^ -1163745798;
lbl6:
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
                        case 1921365051: {
                            break block9;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 401195663) ^ -1518840924;
                            ** continue;
                            break;
                        }
                        case 1834959461: {
                            return this.b;
                        }
lbl18:
                        // 1 sources

                        var2_3 = (var1_1 | 401195663) ^ 618316759;
                        ** continue;
                        case 119754217: {
                            var2_3 ^= var3_2 ^ -1707462393;
                            break block5;
                        }
                    }
                    break;
                }
                break;
            }
            ** while (true)
        }
        var3_2 = (var1_1 | 401195663) ^ -790713738;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block15: {
            break block15;
lbl1:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl3:
            // 1 sources

            while (true) {
                var0_1 ^= 1590086229;
                var0_1 ^= -472249076;
                v0 = var0_1 ^= -2124175541;
                var0_1 ^= 1917016402;
                fP.a[v1] = (v2 | ((v3[v4 + 1] & 255) << 16 | ((v3[v4 + 2] & 255) << 8 | v3[v4 + 3] & 255))) ^ ((v0 | -1744852698) ^ -1727061999 ^ fP.a);
                v1 = v1 + 1;
                v5 = v4 + 4;
                v3 = v3;
                v4 = v5;
                var0_1 ^= -1795738226;
                if (v5 >= v3.length) {
                    var0_1 ^= -1957055429;
                    return;
                }
                ** GOTO lbl53
                break;
            }
        }
        fP.a = mK.a(MethodHandles.lookup().lookupClass(), -1192509495);
        var1 = 0;
        var0_1 = -1519989779;
        var1 = -1744852698 ^ 2012562471;
        block11: while (true) {
            switch (var1) {
                default: {
                    continue block11;
                }
                case -536154879: {
                    ** break;
                }
                case 1017244055: {
                    v1 = 0;
                    var0_1 ^= -1311501830;
                    ** GOTO lbl49
                }
lbl47:
                // 1 sources

                var1 = -1744852698 ^ -120637726;
                continue block11;
lbl49:
                // 1 sources

                fP.a = new int[2];
                var0_1 ^= 532422377;
                v4 = 0;
                v3 = "\u00f81\u00e5p\r\u00ee\u00ac\u00fb".getBytes("ISO-8859-1");
lbl53:
                // 2 sources

                var0_1 ^= 2021561506;
                var0_1 ^= -1269568312;
                ** continue;
                case 1865457604: 
            }
            var0_1 ^= var1 ^ 1740746580;
            var1 = -1744852698 ^ -1419886415;
        }
lbl60:
        // 2 sources

        while (true) {
            var0_1 ^= 1835490860;
            ** continue;
            break;
        }
        v2 = (v3[v4] & 255) << 24;
        block13: while (true) {
            switch (var0_1) {
                case -808285180: {
                    var0_1 ^= 2072062600;
                    ** GOTO lbl60
                }
                default: {
                    var0_1 ^= 1543631670;
                    continue block13;
                }
                case -1393781755: 
            }
            break;
        }
        var0_1 ^= 1333720712;
        ** while (true)
    }

    private static int fT(int n2, int n3) {
        int n4 = -1758285410;
        int n5 = -1929030579;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x124BF4D9)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0x9F37ABFA;
        n6 -= (n5 | n4) ^ 0x9F376AF1;
        n6 -= (n5 | n4) ^ 0x9F375B4C;
        n6 ^= (n5 | n4) ^ 0x9F37BF8C;
        n6 -= (n5 | n4) ^ 0x9F3747FE;
        n6 += (n5 | n4) ^ 0x9F37225A;
        n6 ^= (n5 | n4) ^ 0x9F376521;
        n6 += (n5 | n4) ^ 0x9F378B39;
        return n6 += (n5 | n4) ^ 0x9F378A72;
    }

    /*
     * Exception decompiling
     */
    public void update() {
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
}

