/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1799
 *  net.minecraft.class_310
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class aM {
    private static final int[] a;
    public static final int a;

    private static int uF(int n2, int n3) {
        int n4 = 1531666343;
        int n5 = 2006917154;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x619F0D19)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x7FDFC231;
        n6 -= (n5 | n4) ^ 0x7FDF3398;
        n6 -= (n5 | n4) ^ 0x7FDF1DC6;
        n6 -= (n5 | n4) ^ 0x7FDFDFDA;
        n6 += (n5 | n4) ^ 0x7FDF8C34;
        n6 += (n5 | n4) ^ 0x7FDF9401;
        n6 -= (n5 | n4) ^ 0x7FDF8C00;
        return n6 -= (n5 | n4) ^ 0x7FDFB407;
    }

    /*
     * Enabled aggressive block sorting
     */
    private aM() {
        int n2 = a & 0xD6946BBB ^ 0xF20577A9;
        int n3 = (n2 | 0xD6946BBB) ^ 0x8AD6E73B;
        n3 ^= 0xBEACB027;
        n3 ^= 0x3A8B0159;
    }

    /*
     * Unable to fully structure code
     */
    public static int selectedSlot() {
        block31: {
            block30: {
                block32: {
                    block29: {
                        block33: {
                            var4 = 740046744;
                            var1_1 = aM.a & 740046744 ^ -226153273;
                            var3_2 = 0;
                            break block33;
lbl5:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | var4) ^ 1904147039;
                                break block29;
                                break;
                            }
lbl8:
                            // 1 sources

                            while (true) {
                                v0 = var0_4.field_1724.method_31548().field_7545;
                                break block30;
                                break;
                            }
                            while (true) {
                                var3_2 = (var1_1 | var4) ^ -1267827732;
                                break block31;
                                break;
                            }
                        }
                        var2_3 = (var1_1 | var4) ^ -234150790;
                        ** while (true)
lbl17:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | var4) ^ 1411443791;
                            break block31;
lbl20:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | var4) ^ -1944465318;
                                break block31;
                                break;
                            }
                            break;
                        }
                    }
lbl24:
                    // 2 sources

                    block18: while (true) {
                        switch (var3_2) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block18;
                                }
                                break;
                            }
lbl29:
                            // 1 sources

                            return v0;
lbl31:
                            // 1 sources

                            while (true) {
                                v0 = 0;
                                break block30;
                                break;
                            }
lbl34:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | var4) ^ 151752262;
                                ** continue;
                                break;
                            }
                            case -1880898176: {
                                ** continue;
                            }
lbl39:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | var4) ^ 994343867;
                                break block18;
                                break;
                            }
                            case -141119079: {
                                var2_3 ^= var3_2 ^ -553810502;
                                break block32;
                            }
lbl45:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | var4) ^ -1137863095;
                                break block18;
                                break;
                            }
                            case 1313258783: {
                                var0_4 = class_310.method_1551();
                                var3_2 = (var1_1 | var4) ^ -486274972;
                                break block18;
                            }
                        }
                        break;
                    }
                    break block31;
lbl53:
                    // 1 sources

                    while (true) {
                        var2_3 ^= var3_2 ^ 297377878;
                        ** continue;
                        break;
                    }
                }
                var3_2 = (var1_1 | var4) ^ -1327791424;
                ** while (true)
            }
            var2_3 ^= -366237417;
            ** while (true)
lbl62:
            // 1 sources

            while (true) {
                var2_3 ^= var3_2 ^ 601675147;
                ** continue;
                break;
            }
lbl65:
            // 1 sources

            while (true) {
                if (var0_4.field_1724 != null) ** continue;
                ** continue;
                break;
            }
        }
        block28: while (true) {
            switch (var3_2) {
                default: {
                    continue block28;
                }
                case 1118874006: {
                    ** continue;
                }
                case -1430400112: {
                    ** continue;
                }
                case 496580539: {
                    ** continue;
                }
                case 1257456691: {
                    ** continue;
                }
                case -975616924: {
                    ** continue;
                }
                case 1921314693: 
            }
            break;
        }
        var2_3 ^= var3_2 ^ 464223805;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static void selectSlot(int var0) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static class_1799 hotbarStack(int var0) {
        block22: {
            var5_1 = -1170406546;
            var2_2 = aM.a & -1170406546 ^ -1870244054;
            var4_3 = 0;
            var3_5 = (var2_2 | var5_1) ^ -665016851;
            var4_3 = (var2_2 | var5_1) ^ 313904243;
            break block22;
            {
                var4_3 = (var2_2 | var5_1) ^ 1402729665;
lbl8:
                // 2 sources

                block18: while (true) {
                    switch (var4_3) {
                        case -363727814: {
                            if (var1_4.field_1724 == null) ** GOTO lbl37
                            ** GOTO lbl43
                        }
                        case -2091505381: {
                            if (var0 <= aM.uF((var3_5 | var4_3 ^ 963324533) ^ (var4_3 ^ 665520346), (var2_2 | var4_3 ^ 963324533) ^ ((var3_5 | var4_3 ^ 963324533) ^ (var4_3 ^ 1183479888)))) ** GOTO lbl26
                            ** GOTO lbl37
                        }
                        case 110956422: {
                            ** break;
                        }
                        case -107213521: {
                            var3_5 ^= var4_3 ^ -431868378;
                            continue block17;
                        }
lbl21:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 971603573;
                        continue block18;
                        case 1808833117: {
                            var4_3 = (var2_2 | var5_1) ^ 235563321;
                            continue block18;
                        }
lbl26:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -1519804090;
                        continue block18;
                        case 1680334889: {
                            var3_5 ^= var4_3 ^ 1278772649;
                            var4_3 = (var2_2 | var5_1) ^ 1357816660;
                            ** GOTO lbl35
                        }
                        case -1263190441: {
                            if (var0 < 0) ** GOTO lbl37
                            var4_3 = (var2_2 | var5_1) ^ -1138599704;
                        }
lbl35:
                        // 3 sources

                        default: {
                            continue block18;
                        }
lbl37:
                        // 3 sources

                        var4_3 = (var2_2 | var5_1) ^ 1126390337;
                        continue block18;
                        case 534181416: {
                            var3_5 ^= var4_3 ^ 390984800;
                            var4_3 = (var2_2 | var5_1) ^ -1376229522;
                            continue block18;
                        }
lbl43:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -781202125;
                        continue block18;
                        case -383474769: {
                            return class_1799.field_8037;
                        }
lbl47:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 2039678588;
                            break block22;
                            break;
                        }
                        case 390541312: 
                    }
                    break;
                }
            }
            return var1_4.field_1724.method_31548().method_5438(var0);
lbl52:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ -560416953;
                ** continue;
                break;
            }
        }
        block21: while (true) {
            switch (var4_3) {
                default: {
                    continue block21;
                }
                case -1475699939: {
                    var4_3 = (var2_2 | var5_1) ^ 164154710;
                    continue block21;
                }
                case -1020505838: {
                    var1_4 = class_310.method_1551();
                    ** continue;
                }
                case -1284007368: 
            }
            break;
        }
        var3_5 ^= var4_3 ^ -83206329;
        ** while (true)
    }
}

