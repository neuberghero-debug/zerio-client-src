/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class jh {
    private static final String[] a;
    public static final boolean a;
    public static final boolean b;
    public static final int a;
    private static final Object[] a;
    public static final boolean c;
    public static final String a;
    private static final int[] a;
    public static final String b;

    /*
     * Enabled aggressive block sorting
     */
    private jh() {
        int n2 = a & 0xE896655B ^ 0xB6D520F5;
        int n3 = (n2 | 0xE896655B) ^ 0x56BAA3DE;
        n3 ^= 0x7E0B1D3A;
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

    private static int a(int n2, int n3) {
        int n4 = 1483092500;
        int n5 = 154398658;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xE92CF05C)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x597742C6;
        n6 -= (n5 | n4) ^ 0x59774584;
        n6 += (n5 | n4) ^ 0x5977E377;
        n6 -= (n5 | n4) ^ 0x5977BCD9;
        n6 ^= (n5 | n4) ^ 0x59772012;
        n6 += (n5 | n4) ^ 0x597760B1;
        n6 ^= (n5 | n4) ^ 0x5977AA3B;
        n6 -= (n5 | n4) ^ 0x5977D161;
        n6 += (n5 | n4) ^ 0x59771B06;
        return n6 ^= (n5 | n4) ^ 0x5977A972;
    }

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
     * Unable to fully structure code
     */
    public static void announce() {
        block11: {
            block10: {
                break block11;
lbl1:
                // 1 sources

                return;
lbl3:
                // 2 sources

                block6: while (true) {
                    switch (var2_1) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block6;
                            }
                            break;
                        }
                        case -1500197439: {
                            ** continue;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var2_1 = (var0 | -1643537512) ^ 988111480;
                            ** continue;
                            break;
                        }
                        case -989274718: {
                            var1_2 ^= var2_1 ^ -1592173948;
                            break block10;
                        }
                        case 1545390144: {
                            break;
                        }
                    }
                    ** continue;
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var2_1 = (var0 | -1643537512) ^ -1544456294;
                    ** GOTO lbl3
                    break;
                }
            }
            var2_1 = (var0 | -1643537512) ^ 1501131291;
            ** while (true)
        }
        var0 = jh.a & -1643537512 ^ -34855614;
        var2_1 = 0;
        var1_2 = (var0 | -1643537512) ^ -1485024678;
        ** while (true)
    }
}

