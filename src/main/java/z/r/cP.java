/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 */
package z.r;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import z.r.bv;
import z.r.fM;
import z.r.fv;
import z.r.gF;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class cP
extends gF {
    private static final /* synthetic */ String a;
    private boolean a;
    private static final /* synthetic */ String b;
    private static final int[] a;
    private long a;
    private static final int a;
    private static final /* synthetic */ String c;
    private static final String d;
    private int b;
    private static final /* synthetic */ String k;
    private static final long b;
    private static final int c;
    private static final /* synthetic */ String s;
    private static final String e;
    private static final String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private int d;
    private static final String i;
    private static final /* synthetic */ String j;
    public static final int e;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final String n;
    private bv a;
    private boolean b;
    private static final /* synthetic */ String o;

    /*
     * Exception decompiling
     */
    public cP() {
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
    public void onEnable() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [42[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        int n2 = 458296532;
        int n3 = e & 0x1B510CD4 ^ 0xFC7C4594;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x84AE2216;
        n4 = (n3 | n2) ^ 0xB7D6862D;
        boolean bl2 = true;
        block11: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0xE4F785C7;
            }
            block12: while (true) {
                switch (n4) {
                    default: {
                        continue block12;
                    }
                    case 642450849: {
                        this.a.stop();
                        n4 = (n3 | n2) ^ 0x6543AE7E;
                        continue block12;
                    }
                    case 1597918905: {
                        if (this.a == null) continue block11;
                        n4 = (n3 | n2) ^ 0xB4B10ADD;
                        continue block12;
                    }
                    case 1219218425: {
                        n4 = (n3 | n2) ^ 0x8EAFAA62;
                        continue block12;
                    }
                    case 1271678729: {
                        n5 ^= n4 ^ 0xBBD23971;
                        n4 = (n3 | n2) ^ 0xD9364875;
                        continue block12;
                    }
                    case -1707154518: {
                        n5 ^= n4 ^ 0x6A209DD2;
                        n4 = (n3 | n2) ^ 0x1B422D07;
                        continue block12;
                    }
                    case 1909647286: {
                        n5 ^= n4 ^ 0x65E57284;
                        n4 = (n3 | n2) ^ 0xA043036D;
                        continue block12;
                    }
                    case 462080019: {
                        n5 ^= n4 ^ 0x625DA4C2;
                        n4 = (n3 | n2) ^ 0x709BDDD7;
                        continue block12;
                    }
                    case -465608493: {
                        this.a = null;
                        continue block11;
                    }
                    case -1880715261: 
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
    public void onTick(class_310 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [49[UNCONDITIONALDOLOOP]], but top level block is 51[UNCONDITIONALDOLOOP]
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

    private static int qk(int n2, int n3) {
        int n4 = -1745591445;
        int n5 = 1366047854;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xE18B66BB)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xD7FC16D3;
        n6 -= (n5 | n4) ^ 0xD7FC0FD4;
        n6 ^= (n5 | n4) ^ 0xD7FC5C48;
        n6 ^= (n5 | n4) ^ 0xD7FC999E;
        n6 -= (n5 | n4) ^ 0xD7FC9C4D;
        n6 ^= (n5 | n4) ^ 0xD7FC6484;
        n6 -= (n5 | n4) ^ 0xD7FC57CF;
        n6 += (n5 | n4) ^ 0xD7FC8144;
        return n6 -= (n5 | n4) ^ 0xD7FC7FF8;
    }

    /*
     * Unable to fully structure code
     */
    private fM ql() {
        block10: {
            block12: {
                block11: {
                    block9: {
                        var1_1 = cP.e & -1258057122 ^ 1447784640;
                        var3_2 = 0;
                        break block11;
lbl4:
                        // 1 sources

                        while (true) {
                            var2_3 ^= var3_2 ^ -1876484089;
                            break block9;
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var2_3 ^= -818004029;
                            v0(cP.h, null, cP.c, cP.g, null, null, this.a, List.of(new fv(cP.b, cP.k), new fv(cP.l, cP.s)));
                            var2_3 ^= 156349960;
                            break block10;
                            break;
                        }
                    }
                    var3_2 = (var1_1 | -1258057122) ^ 426242519;
                    break block12;
lbl15:
                    // 1 sources

                    while (true) {
                        ** continue;
                        break;
                    }
                }
                var2_3 = (var1_1 | -1258057122) ^ -18528742;
                var3_2 = (var1_1 | -1258057122) ^ 1410063748;
            }
            block8: while (true) {
                switch (var3_2) {
                    default: {
                        continue block8;
                    }
                    case 1675685540: {
                        ** continue;
                    }
                    case -1556074662: {
                        break;
                    }
                    case -299105527: {
                        ** continue;
                    }
                }
                var3_2 = (var1_1 | -1258057122) ^ -1800725382;
            }
        }
        return v0;
    }
}

