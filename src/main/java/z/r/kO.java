/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint
 */
package z.r;

import dev.jnic.KERseB.JNICLoader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import z.r.fN;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
@Environment(value=EnvType.CLIENT)
public final class kO
implements PreLaunchEntrypoint {
    private static Object[] a;
    public static int a;
    private static String[] a;

    public kO() {
        int n2 = a & 0xD02769C2 ^ 0x556A5C00;
        int n3 = (n2 | 0xD02769C2) ^ 0x6A69D9C8;
        n3 ^= 0x342A636C;
    }

    /*
     * Unable to fully structure code
     */
    public void onPreLaunch() {
        block13: {
            break block13;
lbl1:
            // 1 sources

            block7: while (true) {
                switch (var3_3) lbl-1000:
                // 5 sources

                {
                    while (true) {
                        default: {
                            continue block7;
                        }
                        break;
                    }
                    case -635795882: {
                        return;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1329186542;
                        ** GOTO lbl-1000
                        break;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -122600288;
                        ** GOTO lbl-1000
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1513752167;
                        ** GOTO lbl-1000
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -860989433;
                        ** continue;
                        break;
                    }
                    case -1284429880: {
                        var2_4 ^= var3_3 ^ -640147064;
                        break block7;
                    }
                    case -820427043: {
                        var2_4 ^= var3_3 ^ 865648163;
                        ** continue;
                    }
                    case 1225470553: {
                        fN.bootstrap();
                        ** continue;
                    }
                }
                break;
            }
            var3_3 = (var1_2 | var4_1) ^ 919883158;
            ** while (true)
        }
        var4_1 = 2131899342;
        var1_2 = kO.a & 2131899342 ^ 1473211977;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -1948042618;
        ** while (true)
        {
            ** case -2022818961:
        }
lbl38:
        // 1 sources

        ** while (true)
    }

    static native void verifySingleInstallation() throws Exception;

    static native void verifyRuntimeEnvironment();

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
    static Path modsDirectory() {
        block8: {
            block10: {
                block9: {
                    break block9;
lbl1:
                    // 1 sources

                    while (true) {
                        var2_1 = (var0 | 1073507674) ^ -1586647618;
                        break block8;
                        break;
                    }
                }
                var0 = kO.a & 1073507674 ^ -1703823668;
                var2_1 = 0;
                break block10;
lbl8:
                // 1 sources

                return FabricLoader.getInstance().getGameDir().resolve(kO.a((var1_2 | var2_1 ^ 560742202) ^ (var2_1 ^ -564518438), (var0 | var2_1 ^ 560742202) ^ ((var1_2 | var2_1 ^ 560742202) ^ (var2_1 ^ -822816700))));
            }
            var1_2 = (var0 | 1073507674) ^ 46564424;
            var2_1 = (var0 | 1073507674) ^ 699047889;
        }
        block7: while (true) {
            block11: {
                switch (var2_1) {
                    default: {
                        continue block7;
                    }
                    case -1772658673: {
                        break block11;
                    }
                    case 512774752: {
                        ** continue;
                    }
                    case -757264971: {
                        var1_2 ^= var2_1 ^ -1401934143;
                        break;
                    }
                }
                ** continue;
            }
            var2_1 = (var0 | 1073507674) ^ 1830875755;
        }
    }

    private static native List<Path> findZerioJars(Path var0) throws Exception;

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
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$findZerioJars$2(Path path) {
        int n2 = a & 0x5649D611 ^ 0x60C622C1;
        int n3 = 0;
        int n4 = (n2 | 0x5649D611) ^ 0x91D35721;
        n3 = (n2 | 0x5649D611) ^ 0x781BEC4B;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1595490344: {
                    return Files.isRegularFile(path, new LinkOption[0]);
                }
                case 228862797: {
                    n4 ^= n3 ^ 0xDE90A61E;
                    n3 = (n2 | 0x5649D611) ^ 0xD6294909;
                    continue block5;
                }
                case 248781466: 
            }
            n3 = (n2 | 0x5649D611) ^ 0x7B6BDD9C;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$verifySingleInstallation$1(String string, String string2) {
        int n2 = a & 0x430127C ^ 0x655BDD34;
        int n3 = 0;
        int n4 = (n2 | 0x430127C) ^ 0xA4A61CDA;
        n3 = (n2 | 0x430127C) ^ 0xCE5B8FA0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1702542665: {
                    String string3 = string2;
                    String string4 = string;
                    return string4 + kO.a((n4 | n3 ^ 0x614AAF35) ^ (n3 ^ 0x17B18CFC), (n2 | n3 ^ 0x614AAF35) ^ ((n4 | n3 ^ 0x614AAF35) ^ (n3 ^ 0x1F325DCA))) + string3;
                }
                case -1423945508: {
                    n3 = (n2 | 0x430127C) ^ 0x12495FB3;
                    continue block5;
                }
                case 1999798479: 
            }
            n4 ^= n3 ^ 0xFF307EA6;
            n3 = (n2 | 0x430127C) ^ 0x16235;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$verifySingleInstallation$0(Path path) {
        int n2 = a & 0x4D2C5472 ^ 0xCC52279A;
        int n3 = 0;
        int n4 = (n2 | 0x4D2C5472) ^ 0xCAF13E84;
        n3 = (n2 | 0x4D2C5472) ^ 0xD9254E97;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 341522797: {
                    n3 = (n2 | 0x4D2C5472) ^ 0x9EA18E7C;
                    continue block5;
                }
                case -1036233662: {
                    return path.getFileName().toString();
                }
                case 1407187334: 
            }
            n4 ^= n3 ^ 0xC244A28F;
            n3 = (n2 | 0x4D2C5472) ^ 0xF4223B8;
        }
    }

    public static native /* synthetic */ void $jnicLoader();

    static {
        JNICLoader.init();
        kO.$jnicLoader();
        kO.$jnicClinit();
    }
}

