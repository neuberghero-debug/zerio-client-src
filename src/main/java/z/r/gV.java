/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.loader.api.FabricLoader
 */
package z.r;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class gV {
    private static final String[] a;
    private static final Object[] a;
    private static final int[] a;
    public static final int a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private gV() {
        int n2 = a & 0x3C057F92 ^ 0xFC655312;
        int n3 = (n2 | 0x3C057F92) ^ 0xE54DA64F;
        n3 ^= 0x69217D31;
        n3 ^= 0xEEA5C051;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Path root() {
        int n2 = a & 0x5097C12A ^ 0x712D7F21;
        int n3 = 0;
        int n4 = (n2 | 0x5097C12A) ^ 0xD94A3538;
        n3 = (n2 | 0x5097C12A) ^ 0xDFE58775;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 464684159: {
                    n4 ^= n3 ^ 0x94DF0CE4;
                    n3 = (n2 | 0x5097C12A) ^ 0xFAD8637E;
                    continue block5;
                }
                case -1369802658: {
                    n3 = (n2 | 0x5097C12A) ^ 0x6A0D7B54;
                    continue block5;
                }
                case -1956144043: 
            }
            break;
        }
        return FabricLoader.getInstance().getGameDir().resolve(gV.a((n4 | n3 ^ 0xDBF05D7F) ^ (n3 ^ 0x489CB9B6), (n2 | n3 ^ 0xDBF05D7F) ^ ((n4 | n3 ^ 0xDBF05D7F) ^ (n3 ^ 0x98B0A0D4))));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Path configs() {
        int n2 = a & 0x36D95D72 ^ 0x89123E96;
        int n3 = 0;
        int n4 = (n2 | 0x36D95D72) ^ 0x66B45016;
        n3 = (n2 | 0x36D95D72) ^ 0x2C0777E1;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1814296553: {
                    n3 = (n2 | 0x36D95D72) ^ 0x22F65671;
                    continue block5;
                }
                case -1657984633: {
                    n4 ^= n3 ^ 0xA850C8E0;
                    n3 = (n2 | 0x36D95D72) ^ 0xCAECA7AA;
                    continue block5;
                }
                case 1966594140: 
            }
            break;
        }
        return gV.root().resolve(gV.a((n4 | n3 ^ 0x43EE852E) ^ (n3 ^ 0x3F88E1E3), (n2 | n3 ^ 0x43EE852E) ^ ((n4 | n3 ^ 0x43EE852E) ^ (n3 ^ 0xAD1C785D))));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Path profiles() {
        int n2 = a & 0xF2F0702B ^ 0xDE860D5D;
        int n3 = 0;
        int n4 = (n2 | 0xF2F0702B) ^ 0x99365FF3;
        n3 = (n2 | 0xF2F0702B) ^ 0x32CF427E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -868663551: {
                    n3 = (n2 | 0xF2F0702B) ^ 0xAB6C7196;
                    continue block5;
                }
                case -91784346: {
                    return gV.root().resolve(gV.a((n4 | n3 ^ 0x8770B4D) ^ (n3 ^ 0xBD18E496), (n2 | n3 ^ 0x8770B4D) ^ ((n4 | n3 ^ 0x8770B4D) ^ (n3 ^ 0x1F837FA2))));
                }
                case 1436159209: 
            }
            n4 ^= n3 ^ 0x21F117FF;
            n3 = (n2 | 0xF2F0702B) ^ 0x4710619;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Path sharedConfigs() {
        int n2 = a & 0x8BF73DDA ^ 0x541C00BF;
        int n3 = 0;
        int n4 = (n2 | 0x8BF73DDA) ^ 0x654C003C;
        n3 = (n2 | 0x8BF73DDA) ^ 0xAEE3061B;
        block5: while (true) {
            switch (n3) {
                case 24746559: {
                    return gV.root().resolve(gV.a((n4 | n3 ^ 0x8A8EA7E5) ^ (n3 ^ 0x3EE201AA), (n2 | n3 ^ 0x8A8EA7E5) ^ ((n4 | n3 ^ 0x8A8EA7E5) ^ (n3 ^ 0xBE11DA1F))));
                }
                case 487675006: {
                    n4 ^= n3 ^ 0xA6DE1570;
                    break;
                }
                case 1897675748: {
                    n3 = (n2 | 0x8BF73DDA) ^ 0xC2EE6981;
                }
                default: {
                    continue block5;
                }
            }
            n3 = (n2 | 0x8BF73DDA) ^ 0xDE86A7C0;
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

    private static int a(int n2, int n3) {
        int n4 = 1550387519;
        int n5 = 1912626752;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x77AD3818)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x7E699037;
        n6 ^= (n5 | n4) ^ 0x7E69272D;
        n6 ^= (n5 | n4) ^ 0x7E69A326;
        n6 -= (n5 | n4) ^ 0x7E691BCE;
        n6 += (n5 | n4) ^ 0x7E697E18;
        n6 += (n5 | n4) ^ 0x7E697146;
        n6 -= (n5 | n4) ^ 0x7E696807;
        n6 -= (n5 | n4) ^ 0x7E69E3AA;
        return n6 += (n5 | n4) ^ 0x7E6963F6;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Path logs() {
        int n2 = a & 0x8271220E ^ 0xBA53ED66;
        int n3 = 0;
        int n4 = (n2 | 0x8271220E) ^ 0x9485D920;
        n3 = (n2 | 0x8271220E) ^ 0xFCDAB052;
        while (true) {
            switch (n3) {
                case -1131307462: {
                    return gV.root().resolve(gV.a((n4 | n3 ^ 0x3EE0BC34) ^ (n3 ^ 0xEF0413B9), (n2 | n3 ^ 0x3EE0BC34) ^ ((n4 | n3 ^ 0x3EE0BC34) ^ (n3 ^ 0x82741A9A))));
                }
                case 1185505084: {
                    n3 = (n2 | 0x8271220E) ^ 0x946CD992;
                    break;
                }
                case 773797628: {
                    n4 ^= n3 ^ 0xE7794B7A;
                    n3 = (n2 | 0x8271220E) ^ 0x6E27154;
                }
            }
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static Path socialsFile() {
        int n2 = -480005631;
        int n3 = a & 0x4206DBB3 ^ 0x62682AC9;
        int n4 = 0;
        int n5 = (n3 | 0x4206DBB3) ^ 0x12DBC6F2;
        n4 = (n3 | 0x4206DBB3) ^ 0xB82198A0;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -632331429: {
                    n4 = (n3 | 0x4206DBB3) ^ 0x98C8B356;
                    continue block5;
                }
                case -89765715: {
                    n5 ^= n4 ^ 0x645B615E;
                    n4 = (n3 | 0x4206DBB3) ^ 0xC30B9249;
                    continue block5;
                }
                case -1587189326: 
            }
            break;
        }
        return FabricLoader.getInstance().getGameDir().resolve(gV.a((n5 | n4 ^ n2) ^ (n4 ^ 0xFB4F5005), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x34C24DB2)))).resolve(gV.a((n5 | n4 ^ n2) ^ (n4 ^ 0xFB4F5006), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x16AE4DB2)))).resolve(gV.a((n5 | n4 ^ n2) ^ (n4 ^ 0xFB4F5007), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x919C4DB2))));
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
     * Enabled aggressive block sorting
     */
    public static Path licenseFile() {
        int n2 = a & 0x695D8C82 ^ 0xE80C1500;
        int n3 = 0;
        int n4 = (n2 | 0x695D8C82) ^ 0xAD6D1410;
        n3 = (n2 | 0x695D8C82) ^ 0x58BF9F2D;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1310588241: {
                    break;
                }
                case 881639522: {
                    n4 ^= n3 ^ 0xBEE27977;
                    n3 = (n2 | 0x695D8C82) ^ 0xBF229A00;
                    continue block5;
                }
                case 1451165570: {
                    return gV.root().resolve(gV.a((n4 | n3 ^ 0x3F228B00) ^ (n3 ^ 0xD445D44), (n2 | n3 ^ 0x3F228B00) ^ ((n4 | n3 ^ 0x3F228B00) ^ (n3 ^ 0x6B6C2687))));
                }
            }
            n3 = (n2 | 0x695D8C82) ^ 0xDDD15DE0;
        }
    }

    /*
     * Exception decompiling
     */
    public static void initializeAndMigrate() throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [111[UNCONDITIONALDOLOOP]], but top level block is 112[UNCONDITIONALDOLOOP]
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
     * Unable to fully structure code
     */
    private static void copyIfMissing(Path var0, Path var1_1) throws IOException {
        block34: {
            block37: {
                block39: {
                    block32: {
                        block31: {
                            block36: {
                                block38: {
                                    block33: {
                                        block35: {
                                            break block38;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                var3_5 ^= var4_4 ^ -1874772484;
                                                break block31;
                                                break;
                                            }
lbl4:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ 1614969504;
                                                break block32;
                                                break;
                                            }
lbl7:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ 785201551;
                                                break block32;
                                                break;
                                            }
lbl10:
                                            // 1 sources

                                            while (true) {
                                                var3_5 ^= var4_4 ^ 172259469;
                                                break block33;
                                                break;
                                            }
lbl13:
                                            // 1 sources

                                            while (true) {
                                                var3_5 ^= var4_4 ^ 94558225;
                                                break block34;
                                                break;
                                            }
lbl16:
                                            // 1 sources

                                            while (true) {
                                                var3_5 ^= var4_4 ^ 483219650;
                                                break block35;
                                                break;
                                            }
lbl19:
                                            // 2 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ 322189133;
                                                break block32;
                                                break;
                                            }
                                        }
                                        var4_4 = (var2_3 | var5_2) ^ -1016506792;
                                        break block32;
lbl25:
                                        // 1 sources

                                        while (Files.exists(var1_1, new LinkOption[0])) {
                                            ** GOTO lbl19
                                        }
                                        break block39;
lbl28:
                                        // 1 sources

                                        while (true) {
                                            var3_5 ^= var4_4 ^ 262522093;
                                            break block36;
                                            break;
                                        }
                                    }
                                    var4_4 = (var2_3 | var5_2) ^ 1372723962;
                                    break block32;
lbl34:
                                    // 1 sources

                                    while (true) {
                                        if (Files.isRegularFile(var0, new LinkOption[0])) ** break;
                                        ** continue;
                                        break block37;
                                        break;
                                    }
lbl38:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ -419695258;
                                        break block32;
                                        break;
                                    }
                                }
                                var5_2 = 1585589754;
                                var2_3 = gV.a & 1585589754 ^ -1020506208;
                                var4_4 = 0;
                                var3_5 = (var2_3 | var5_2) ^ 1561436909;
                                ** while (true)
lbl47:
                                // 1 sources

                                return;
                            }
                            var4_4 = (var2_3 | var5_2) ^ -1784298155;
                            break block32;
                        }
                        var4_4 = (var2_3 | var5_2) ^ -249514374;
                        break block32;
lbl55:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1537382258;
                            break block32;
                            break;
                        }
lbl58:
                        // 1 sources

                        while (true) {
                            Files.createDirectories(var1_1.getParent(), new FileAttribute[0]);
                            ** continue;
                            break;
                        }
lbl62:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
lbl65:
                    // 5 sources

                    block30: while (true) {
                        switch (var4_4) {
                            default: {
                                continue block30;
                            }
                            case -862299977: {
                                ** continue;
                            }
                            case 1741236227: {
                                ** continue;
                            }
                            case -1075047078: {
                                ** continue;
                            }
                            case 1821288188: {
                                ** continue;
                            }
                            case -2079524728: {
                                ** continue;
                            }
                            case 961911452: {
                                ** GOTO lbl25
                            }
                            case -1851286829: {
                                ** continue;
                            }
                            case 482818466: {
                                ** continue;
                            }
                            case 781113728: {
                                ** continue;
                            }
                            case -245148043: {
                                ** continue;
                            }
                            case 1242278575: {
                                ** continue;
                            }
                            case -1904446208: {
                                ** continue;
                            }
                            case -702186725: {
                                return;
                            }
                        }
                        break;
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ 1309275433;
                ** GOTO lbl65
            }
            var4_4 = (var2_3 | var5_2) ^ -1201190919;
            ** GOTO lbl65
        }
        var4_4 = (var2_3 | var5_2) ^ 160109793;
        ** GOTO lbl65
        Files.copy(var0, var1_1, new CopyOption[]{StandardCopyOption.COPY_ATTRIBUTES});
        var4_4 = (var2_3 | var5_2) ^ -1289697018;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ boolean lambda$initializeAndMigrate$0(Path var0) {
        block9: {
            block8: {
                break block9;
                {
                    var3_2 = (var1_1 | -1351753339) ^ 1116422714;
lbl2:
                    // 3 sources

                    block6: while (true) {
                        switch (var3_2) {
                            default: {
                                continue block6;
                            }
                            case -1377522753: {
                                return Files.isRegularFile(var0, new LinkOption[0]);
                            }
                            case -801390592: {
                                break block8;
                            }
                            case 1648983291: {
                                var2_3 ^= var3_2 ^ -594099377;
                                break;
                            }
                        }
                        continue block5;
                        break;
                    }
                }
lbl14:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -1351753339) ^ 1062480261;
                    ** GOTO lbl2
                    break;
                }
            }
            var3_2 = (var1_1 | -1351753339) ^ -1926851202;
            ** while (true)
        }
        var1_1 = gV.a & -1351753339 ^ 1281533952;
        var3_2 = 0;
        var2_3 = (var1_1 | -1351753339) ^ -1136435911;
        ** while (true)
    }
}

