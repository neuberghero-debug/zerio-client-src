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
import z.r.lP;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class iU {
    public static final int a;
    private static final /* synthetic */ String a;
    private static final int[] a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private final lP a;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public iU(lP var1_1) {
        var5_2 = -53833660;
        var2_3 = iU.a & -53833660 ^ 293737712;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 121971378;
        block10: while (true) {
            switch (var3_5) {
                case -91244986: {
                    var3_5 ^= -2137598809;
                    ** break;
                }
                case -1958803253: {
                    var3_5 ^= 1572790558;
                    continue block10;
                }
            }
            break;
        }
        var3_5 ^= 1475913060;
lbl14:
        // 2 sources

        super();
        var4_4 = (var2_3 | var5_2) ^ -685938580;
        if (true) ** GOTO lbl19
        block11: while (true) {
            var4_4 = (var2_3 | var5_2) ^ 1827785864;
lbl19:
            // 2 sources

            block12: while (true) {
                switch (var4_4) {
                    default: {
                        continue block12;
                    }
                    case 1056660950: {
                        this.a = var1_1;
                        continue block11;
                    }
                    case 718797976: {
                        var3_5 ^= var4_4 ^ -1261712199;
                        var4_4 = (var2_3 | var5_2) ^ -1020147422;
                        continue block12;
                    }
                    case -1858381700: {
                        var3_5 ^= var4_4 ^ -229172416;
                        var4_4 = (var2_3 | var5_2) ^ 2107547021;
                        continue block12;
                    }
                    case -2141976199: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public lP setting() {
        block9: {
            break block9;
            {
                var3_2 = (var1_1 | 1131645850) ^ -542204875;
                block6: while (true) {
                    switch (var3_2) lbl-1000:
                    // 3 sources

                    {
                        default: {
                            continue block6;
                        }
                        case -327461777: {
                            continue block5;
                        }
lbl8:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 1131645850) ^ -1215766604;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -2074273810: {
                            var2_3 ^= var3_2 ^ 927551810;
                            var3_2 = (var1_1 | 1131645850) ^ 1922976010;
                            ** GOTO lbl-1000
                        }
                        case 695059153: {
                            return this.a;
                        }
                    }
                    break;
                }
            }
        }
        var1_1 = iU.a & 1131645850 ^ 448987985;
        var3_2 = 0;
        var2_3 = (var1_1 | 1131645850) ^ -22124608;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public boolean isValid(class_1799 var1_1, boolean var2_2) {
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
    public boolean matches(class_1799 class_17992) {
        int n2 = a & 0x3BA7E614 ^ 0x181028FC;
        int n3 = 0;
        int n4 = (n2 | 0x3BA7E614) ^ 0x2F0CF994;
        n3 = (n2 | 0x3BA7E614) ^ 0x33326B7;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1076580272: {
                    n4 ^= n3 ^ 0x4693A914;
                    n3 = (n2 | 0x3BA7E614) ^ 0x91B66B79;
                    continue block5;
                }
                case -1442740859: {
                    return this.isValid(class_17992, false);
                }
                case 948226123: 
            }
            n3 = (n2 | 0x3BA7E614) ^ 0x7B9CA14C;
        }
    }

    /*
     * Exception decompiling
     */
    static {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: CONTINUE without a while class org.benf.cfr.reader.bytecode.analysis.parse.statement.AssignmentPreMutation
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getTargetStartBlock(GotoStatement.java:102)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getStructuredStatement(GotoStatement.java:116)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.getStructuredStatementPlaceHolder(Op03SimpleStatement.java:550)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:727)
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

    private static int Ne(int n2, int n3) {
        int n4 = 285263788;
        int n5 = -2054297175;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xC3F97716)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x958DD835;
        n6 ^= (n5 | n4) ^ 0x958D34CE;
        n6 ^= (n5 | n4) ^ 0x958DD8AE;
        n6 -= (n5 | n4) ^ 0x958DC6DB;
        n6 ^= (n5 | n4) ^ 0x958DF93E;
        n6 += (n5 | n4) ^ 0x958DA435;
        return n6 ^= (n5 | n4) ^ 0x958D873F;
    }

    /*
     * Unable to fully structure code
     */
    public boolean matchesHeldItem() {
        block39: {
            block38: {
                block37: {
                    block33: {
                        block32: {
                            block36: {
                                block35: {
                                    block34: {
                                        break block38;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var3_5 ^= var4_3 ^ -1235560870;
                                            break block32;
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ -1098976047;
                                            break block33;
                                            break;
                                        }
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ 1565065685;
                                            break block33;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl12:
                                        // 1 sources

                                        while (true) {
                                            var3_5 ^= var4_3 ^ -1893362085;
                                            ** continue;
                                            break;
                                        }
                                        var1_4 = class_310.method_1551();
                                        var4_3 = (var2_2 | var5_1) ^ -440983120;
                                        break block33;
lbl18:
                                        // 1 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ 517811630;
                                            break block33;
                                            break;
                                        }
lbl21:
                                        // 1 sources

                                        while (true) {
                                            if (!this.matches(var1_4.field_1724.method_6047())) break block34;
                                            ** continue;
                                            break;
                                        }
lbl24:
                                        // 1 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ -1857218165;
                                            break block35;
                                            break;
                                        }
lbl27:
                                        // 1 sources

                                        while (true) {
                                            var3_5 ^= var4_3 ^ -2000250157;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 1521093981;
                                        break block33;
lbl34:
                                        // 1 sources

                                        while (true) {
                                            v0 = false;
                                            break block36;
                                            break;
                                        }
lbl37:
                                        // 1 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ -773428039;
                                            break block33;
lbl40:
                                            // 1 sources

                                            while (true) {
                                                v0 = true;
                                                break block36;
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
lbl43:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= var4_3 ^ -1710040222;
                                        break block37;
                                        break;
                                    }
                                }
lbl47:
                                // 3 sources

                                block29: while (true) {
                                    switch (var4_3) {
                                        default: {
                                            continue block29;
                                        }
                                        case -1125603371: {
                                            ** continue;
                                        }
                                        case -6372341: {
                                            ** continue;
                                        }
                                        ** case 1513539533:
lbl56:
                                        // 1 sources

                                        ** continue;
                                    }
                                    break;
                                }
                            }
                            var3_5 ^= 1762771535;
                            break block39;
                        }
                        var4_3 = (var2_2 | var5_1) ^ -1033442109;
                    }
lbl63:
                    // 2 sources

                    block30: while (true) {
                        switch (var4_3) {
                            default: {
                                continue block30;
                            }
                            case 785186806: {
                                ** continue;
                            }
                            case -1848519909: {
                                ** continue;
                            }
                            case 446542591: {
                                ** continue;
                            }
                            case -1775050861: {
                                ** continue;
                            }
                            case 1963272855: {
                                ** continue;
                            }
                            case -710478872: {
                                ** continue;
                            }
                            case -484072757: {
                                ** continue;
                            }
                            case 152908421: {
                                if (var1_4.field_1724 == null) ** continue;
                            }
                        }
                        break;
                    }
                }
                var4_3 = (var2_2 | var5_1) ^ 0x77937993;
                ** GOTO lbl47
lbl86:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 887429709;
                    ** continue;
                    break;
                }
            }
            var5_1 = 1130487364;
            var2_2 = iU.a & 1130487364 ^ -931527678;
            var4_3 = 0;
            var3_5 = (var2_2 | var5_1) ^ 918004388;
            ** while (true)
        }
        return v0;
        var4_3 = (var2_2 | var5_1) ^ 677280909;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static boolean Nf(String var0, class_1799 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [169[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
}

