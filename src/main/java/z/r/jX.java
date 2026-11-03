/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import dev.jnic.KERseB.JNICLoader;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.hK;
import z.r.iO;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
@Environment(value=EnvType.CLIENT)
public final class jX {
    private static int[] a;
    private static String[] a;
    private static Object[] a;
    public static int a;

    /*
     * Enabled aggressive block sorting
     */
    private jX() {
        int n2 = a & 0x77832EEE ^ 0xF35A58CE;
        int n3 = (n2 | 0x77832EEE) ^ 0xDF845B42;
        n3 ^= 0x476B138C;
        n3 ^= 0xC1109D51;
    }

    static native int inject(byte[] var0) throws Exception;

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

    private static native boolean dependencyReady(String var0, Map<String, hK> var1, Set<String> var2);

    private static native iO readArchive(byte[] var0) throws Exception;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$readArchive$4(byte[] byArray) {
        int n2 = a & 0xC094642E ^ 0xB9D65919;
        int n3 = 0;
        int n4 = (n2 | 0xC094642E) ^ 0x827372FB;
        n3 = (n2 | 0xC094642E) ^ 0x30F9A2AB;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -919609452: {
                    n3 = (n2 | 0xC094642E) ^ 0x40547E00;
                    continue block5;
                }
                case 1298743085: {
                    Arrays.fill(byArray, (byte)0);
                    return;
                }
                case -1182661825: 
            }
            n4 ^= n3 ^ 0x6FBF3F1D;
            n3 = (n2 | 0xC094642E) ^ 0xB4BF4212;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$readArchive$3(hK hK2) {
        int n2 = a & 0x5FAAD93E ^ 0x21AEE422;
        int n3 = 0;
        int n4 = (n2 | 0x5FAAD93E) ^ 0xEAAF1480;
        n3 = (n2 | 0x5FAAD93E) ^ 0x38623A3E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1304844625: {
                    n4 ^= n3 ^ 0x3318DEE0;
                    n3 = (n2 | 0x5FAAD93E) ^ 0x7CF2F7FC;
                    continue block5;
                }
                case 56363714: {
                    Arrays.fill(hK2.bytes(), (byte)0);
                    return;
                }
                case 1204602624: 
            }
            n3 = (n2 | 0x5FAAD93E) ^ 0x3268A46F;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void lambda$inject$2(hK var0) {
        var1_1 = jX.a & 1858582984 ^ 565618351;
        var3_2 = 0;
        ** GOTO lbl22
lbl4:
        // 1 sources

        while (true) {
            var3_2 = (var1_1 | 1858582984) ^ 1250731817;
            if (true) ** GOTO lbl13
            break;
        }
        block6: while (true) {
            block9: {
                var3_2 = (var1_1 | 1858582984) ^ 891325442;
                break block9;
lbl10:
                // 1 sources

                while (true) {
                    Arrays.fill(var0.bytes(), (byte)0);
                    return;
                }
            }
lbl14:
            // 2 sources

            block8: while (true) {
                switch (var3_2) {
                    default: {
                        continue block8;
                    }
                    case 1524052973: {
                        break block6;
                    }
                    case 628824262: {
                        ** continue;
                    }
lbl22:
                    // 1 sources

                    var2_3 = (var1_1 | 1858582984) ^ 800522544;
                    continue block6;
                    case -1654054151: {
                        var2_3 ^= var3_2 ^ -840984879;
                        ** continue;
                    }
                }
                break;
            }
            break;
        }
        var3_2 = (var1_1 | 1858582984) ^ -224486122;
        ** while (true)
    }

    private static int a(int n2, int n3) {
        int n4 = 2021189173;
        int n5 = -1494672834;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xCC29A5C7)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xFEF93ABC;
        n6 -= (n5 | n4) ^ 0xFEF902F3;
        n6 ^= (n5 | n4) ^ 0xFEF95D00;
        n6 += (n5 | n4) ^ 0xFEF927B8;
        n6 -= (n5 | n4) ^ 0xFEF91D57;
        n6 += (n5 | n4) ^ 0xFEF94C6D;
        n6 -= (n5 | n4) ^ 0xFEF9DD29;
        return n6 ^= (n5 | n4) ^ 0xFEF96253;
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
    private static /* synthetic */ void lambda$inject$1(byte[] var0) {
        block8: {
            block7: {
                break block7;
lbl1:
                // 1 sources

                while (true) {
                    Arrays.fill(var0, (byte)0);
                    return;
                }
            }
            var1_1 = jX.a & -1769703758 ^ 1538088309;
            var3_2 = 0;
            break block8;
lbl8:
            // 2 sources

            block6: while (true) {
                switch (var3_2) {
                    default: {
                        continue block6;
                    }
                    case 1700534496: {
                        break;
                    }
                    case -1616567326: {
                        ** continue;
                    }
                }
                var3_2 = (var1_1 | -1769703758) ^ 580140046;
                continue;
                break;
            }
        }
        var2_3 = (var1_1 | -1769703758) ^ 1782912996;
        var3_2 = (var1_1 | -1769703758) ^ -1158584553;
        ** GOTO lbl8
        {
            ** case -46578695:
        }
lbl23:
        // 1 sources

        var2_3 ^= var3_2 ^ -885071066;
        var3_2 = (var1_1 | -1769703758) ^ 1074289685;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$inject$0(Map map, Set set, String string) {
        int n2 = a & 0x660F95ED ^ 0x5A2FAA18;
        int n3 = 0;
        int n4 = (n2 | 0x660F95ED) ^ 0xBDBD25A1;
        n3 = (n2 | 0x660F95ED) ^ 0xE9154F4E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1509849103: {
                    return jX.dependencyReady(string, map, set);
                }
                case -1757744973: {
                    n3 = (n2 | 0x660F95ED) ^ 0xDD2109DD;
                    continue block5;
                }
                case -1559316960: 
            }
            n4 ^= n3 ^ 0x1D125F2D;
            n3 = (n2 | 0x660F95ED) ^ 0xD82E380C;
        }
    }

    public static native /* synthetic */ void $jnicLoader();

    static {
        JNICLoader.init();
        jX.$jnicLoader();
        jX.$jnicClinit();
    }
}

