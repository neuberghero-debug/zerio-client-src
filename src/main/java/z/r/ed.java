/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 *  net.minecraft.class_408
 *  net.minecraft.class_437
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_408;
import net.minecraft.class_437;
import z.r.H;
import z.r.W;
import z.r.bq;
import z.r.bw;
import z.r.gu;
import z.r.jd;
import z.r.je;
import z.r.lS;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class ed
extends gu {
    private final je a;
    public static final int a;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private final je b;
    private static final /* synthetic */ String e;
    private static final int[] a;
    private static final /* synthetic */ String f;
    private final jd a;
    private static final /* synthetic */ String g;

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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public ed(bw bw2) {
        int n2 = 228501190;
        int n3 = a & 0xD9EA6C6 ^ 0xE63BAA6;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x4F188DAE;
        n5 ^= 0xA1EA8BA1;
        super(bw2);
        n4 = (n3 | n2) ^ 0x28D4776F;
        boolean bl2 = true;
        block10: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0xFAA15416;
            }
            block11: while (true) {
                switch (n4) {
                    case -1115595399: {
                        n5 ^= n4 ^ 0x6DF26C4F;
                        n4 = (n3 | n2) ^ 0x149DEB63;
                        continue block11;
                    }
                    case 459429253: {
                        this.a = new je(f, bq.bN, lS.g, () -> {
                            /*
                             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                             * 
                             * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [25[UNCONDITIONALDOLOOP], 0[SWITCH]], but top level block is 5[SWITCH]
                             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
                             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
                             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
                             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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
                        });
                        n4 = (n3 | n2) ^ 0xD99E3E8D;
                        continue block11;
                    }
                    case -178328848: {
                        n5 ^= n4 ^ 0x416FA329;
                        n4 = (n3 | n2) ^ 0x2161D7C7;
                        continue block11;
                    }
                    case -698253205: {
                        n5 ^= n4 ^ 0xF1924185;
                        n4 = (n3 | n2) ^ 0x760058F1;
                        continue block11;
                    }
                    case 2046813719: {
                        this.b = new je(e, lS.d, ed::gi);
                        continue block10;
                    }
                    case -1290486104: {
                        this.a = new jd(ed::gl, ed::gk);
                        n4 = (n3 | n2) ^ 0xB27EE39F;
                    }
                    default: {
                        continue block11;
                    }
                    case 657181065: {
                        n5 ^= n4 ^ 0x8EFC1B56;
                        n4 = (n3 | n2) ^ 0xBCEB004E;
                        continue block11;
                    }
                    case 782133537: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void render(W var1_1) {
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
    @Override
    public boolean mouseDown(W var1_1, double var2_2, double var4_3, int var6_4) {
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
    @Override
    public boolean mouseUp(W var1_1, double var2_2, double var4_3, int var6_4) {
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
    private static /* synthetic */ void gi() {
        block9: {
            block10: {
                break block10;
lbl1:
                // 1 sources

                while (true) {
                    var2_1 = (var0 | 1421544746) ^ -663772602;
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
                            case 535451492: {
                                var1_2 ^= var2_1 ^ 1329425272;
                                break block9;
                            }
                            case -1289108850: {
                                class_310.method_1551().method_1507((class_437)new class_408("", false));
                                return;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var2_1 = (var0 | 1421544746) ^ -921306481;
                                ** continue;
                                break;
                            }
                            case 244322221: {
                                break;
                            }
                        }
                        ** continue;
                        break;
                    }
                    break;
                }
            }
            var0 = ed.a & 1421544746 ^ -2100845333;
            var2_1 = 0;
            var1_2 = (var0 | 1421544746) ^ 1400944557;
            ** while (true)
        }
        var2_1 = (var0 | 1421544746) ^ 1708552037;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void gk(Boolean var0) {
        var1_1 = ed.a & 489887290 ^ -2113868206;
        var3_2 = 0;
        var2_3 = (var1_1 | 489887290) ^ 503844562;
        var3_2 = (var1_1 | 489887290) ^ -273890998;
        block5: while (true) {
            switch (var3_2) {
                case -518486314: {
                    var2_3 ^= var3_2 ^ 1679239274;
                    var3_2 = (var1_1 | 489887290) ^ -18159200;
                    ** break;
                }
                case 1889484592: {
                    var3_2 = (var1_1 | 489887290) ^ 2116778156;
                }
lbl13:
                // 3 sources

                default: {
                    continue block5;
                }
                case 1641617370: 
            }
            break;
        }
        H.get().setMasterEnabled(var0);
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ Boolean gl() {
        block11: {
            block10: {
                break block11;
lbl1:
                // 1 sources

                while (true) {
                    var1_2 ^= var2_1 ^ -348203217;
                    break block10;
                    break;
                }
lbl4:
                // 1 sources

                block6: while (true) {
                    switch (var2_1) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block6;
                            }
                            break;
                        }
                        case 1107869035: {
                            ** continue;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            var2_1 = (var0 | -1516925305) ^ -1140383993;
                            ** GOTO lbl-1000
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var2_1 = (var0 | -1516925305) ^ -34123052;
                            ** continue;
                            break;
                        }
                        case 66646200: {
                            ** continue;
                        }
                        case 1047171730: {
                            return H.get().isMasterEnabled();
                        }
                    }
                    break;
                }
            }
            var2_1 = (var0 | -1516925305) ^ -2120909523;
            ** while (true)
        }
        var0 = ed.a & -1516925305 ^ 460220730;
        var2_1 = 0;
        var1_2 = (var0 | -1516925305) ^ -874790225;
        ** while (true)
    }

    private static int gm(int n2, int n3) {
        int n4 = 18725745;
        int n5 = -1947950674;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x25954CFF)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x8BFD1E23;
        n6 += (n5 | n4) ^ 0x8BFD06B6;
        n6 += (n5 | n4) ^ 0x8BFD3F3A;
        n6 += (n5 | n4) ^ 0x8BFDC13A;
        n6 -= (n5 | n4) ^ 0x8BFD98E0;
        n6 -= (n5 | n4) ^ 0x8BFDB334;
        n6 -= (n5 | n4) ^ 0x8BFD09A9;
        n6 += (n5 | n4) ^ 0x8BFD4F23;
        n6 += (n5 | n4) ^ 0x8BFD74D5;
        return n6 -= (n5 | n4) ^ 0x8BFDDBD0;
    }
}

