/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1268
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2769
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 *  net.minecraft.class_4969
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2769;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_4969;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class gi {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), 723059138);
    private static final class_310 a;

    public gi() {
        int n2 = a & 0xF9206B73 ^ 0x5C2F9E27;
        int n3 = (n2 | 0xF9206B73) ^ 0x6C2E8955;
        n3 ^= 0xEAD877BD;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean isBlockAt(class_2338 var0, class_2248 var1_1) {
        block20: {
            block22: {
                block21: {
                    break block21;
lbl1:
                    // 7 sources

                    block11: while (true) {
                        switch (var4_4) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                default: {
                                    continue block11;
                                }
                                break;
                            }
                            case -1149319383: {
                                var3_5 ^= var4_4 ^ 1273706686;
                                break block11;
                            }
                            case 812619706: {
                                break block20;
                            }
lbl11:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 2063965612;
                                ** GOTO lbl-1000
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -654112117;
                                ** continue;
                                break;
                            }
                        }
                        break;
                    }
                    var4_4 = (var2_3 | var5_2) ^ 540168277;
                    ** GOTO lbl1
lbl19:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -853970579;
                        ** GOTO lbl1
                        break;
                    }
                    {
                        case -2039252101: {
                            break;
                        }
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1715646460;
                        ** GOTO lbl1
                        break;
                    }
                    {
                        case -582699390: {
                            v0 = true;
                            break block22;
                        }
                        case -1289764071: {
                            var3_5 ^= var4_4 ^ 1204102479;
                            ** continue;
                        }
                    }
lbl33:
                    // 1 sources

                    return v0;
lbl35:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 1174938110;
                        ** GOTO lbl1
                        break;
                    }
lbl38:
                    // 2 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1499868716;
                        ** GOTO lbl1
                        break;
                    }
                    {
                        case 1542403843: {
                            var3_5 ^= var4_4 ^ -1418016620;
                            ** continue;
                        }
                        case 611707996: {
                            if (gi.a.field_1687 == null) ** GOTO lbl38
                            ** continue;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ 1315513806;
                    ** GOTO lbl1
                    {
                        case 992567196: {
                            if (gi.a.field_1687.method_8320(var0).method_26204() == var1_1) ** break;
                            ** continue;
                            ** continue;
                        }
                        ** case 1691072211:
                    }
lbl54:
                    // 1 sources

                    v0 = false;
                    break block22;
                }
                var5_2 = -2056067517;
                var2_3 = gi.a & -2056067517 ^ 2017779924;
                var4_4 = 0;
                var3_5 = (var2_3 | var5_2) ^ -800783917;
                ** while (true)
            }
            var3_5 ^= 1120118550;
            ** while (true)
        }
        var4_4 = (var2_3 | var5_2) ^ -966805173;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static boolean isAnchorCharged(class_2338 var0) {
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
    public static boolean isAnchorUncharged(class_2338 var0) {
        block31: {
            block30: {
                block34: {
                    block32: {
                        block33: {
                            break block33;
lbl1:
                            // 2 sources

                            while (true) {
                                var2_4 ^= -371004974;
                                break block30;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1191635940;
                                break block31;
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 2120821259;
                                break block31;
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -302184860;
                                break block31;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 1146006739;
                                ** continue;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var2_4 ^= 261765889;
                                break block32;
lbl19:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1566008085;
                                    break block31;
                                    break;
                                }
                                break;
                            }
                        }
                        var4_1 = 2001088576;
                        var1_2 = gi.a & 2001088576 ^ -1928784093;
                        var3_3 = 0;
                        break block34;
                    }
                    if ((Integer)gi.a.field_1687.method_8320(var0).method_11654((class_2769)class_4969.field_23153) == 0) {
                        ** continue;
lbl30:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1222458451;
                            break block31;
                            break;
                        }
lbl33:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 779853093;
                            ** continue;
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -409297827;
                            break block31;
                            break;
                        }
                    }
                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -14118613;
                        break block31;
                        break;
                    }
lbl42:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -1395413987;
                        ** continue;
                        break;
                    }
lbl45:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1264869199;
                        break block31;
                        break;
                    }
                }
                var2_4 = (var1_2 | var4_1) ^ -1903210173;
                var3_3 = (var1_2 | var4_1) ^ -227566322;
                break block31;
            }
            return v0;
lbl54:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ 352179922;
                ** continue;
                break;
            }
lbl57:
            // 1 sources

            while (true) {
                v0 = true;
                ** GOTO lbl1
                break;
            }
lbl60:
            // 1 sources

            while (true) {
                v0 = false;
                ** continue;
                break;
            }
lbl63:
            // 1 sources

            while (true) {
                if (!gi.isBlockAt(var0, class_2246.field_23152)) ** continue;
                ** continue;
                break;
            }
        }
        block28: while (true) {
            switch (var3_3) {
                default: {
                    continue block28;
                }
                case 1272223698: {
                    ** continue;
                }
                case 416656190: {
                    ** continue;
                }
                case 313667847: {
                    ** continue;
                }
                case -1203118969: {
                    ** continue;
                }
                case 220244589: {
                    ** continue;
                }
                case 6792776: {
                    ** continue;
                }
                case -1215165648: {
                    ** continue;
                }
                case -2128208536: {
                    ** continue;
                }
                ** case 1575463816:
lbl88:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void interactBlock(class_3965 var0, boolean var1_1) {
        block14: {
            block15: {
                break block15;
lbl1:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ -1695421629;
                    ** GOTO lbl30
                    break;
                }
lbl4:
                // 1 sources

                return;
lbl6:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 232612239;
                    break block14;
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 55014822;
                    break block14;
                    break;
                }
            }
            var5_2 = 1785198769;
            var2_3 = gi.a & 1785198769 ^ -155754516;
            var4_4 = 0;
            var3_5 = (var2_3 | var5_2) ^ -729506614;
            ** while (true)
        }
        block11: while (true) {
            switch (var4_4) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block11;
                    }
                    break;
                }
                case -358910238: {
                    ** continue;
                }
                case 1200866895: {
                    ** continue;
                }
                case -215310734: {
                    ** GOTO lbl35
                }
lbl30:
                // 1 sources

                var4_4 = (var2_3 | var5_2) ^ -780935307;
                ** GOTO lbl-1000
lbl32:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1184613966;
                    ** GOTO lbl-1000
                    break;
                }
lbl35:
                // 1 sources

                var4_4 = (var2_3 | var5_2) ^ 342657311;
                ** continue;
                case -38761893: {
                    var3_5 ^= var4_4 ^ 394543485;
                    ** continue;
                }
                case 797188232: 
            }
            break;
        }
        gi.interactBlock(var0, class_1268.field_5808, var1_1);
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static void interactBlock(class_3965 var0, class_1268 var1_1, boolean var2_2) {
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
    static {
        int n2 = 0;
        int n3 = -1698016176;
        n2 = 0xD618B7F7 ^ 0x83C1D1F4;
        block5: while (true) {
            switch (n2) {
                default: {
                    continue block5;
                }
                case 1440310787: {
                    n2 = 0xD618B7F7 ^ 0xF201B66D;
                    continue block5;
                }
                case 2131744689: {
                    a = class_310.method_1551();
                    return;
                }
                case 605618586: 
            }
            n3 ^= n2 ^ 0xDBE16F78;
            n2 = 0xD618B7F7 ^ 0xA9176046;
        }
    }
}

