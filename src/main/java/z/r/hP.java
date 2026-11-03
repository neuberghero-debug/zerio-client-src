/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.gj;
import z.r.jY;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class hP
implements Runnable {
    private final Object a;
    private static final /* synthetic */ String a;
    private long a;
    private static final int[] a;
    private boolean a;
    private final jY a;
    public static final int a;
    private final BooleanSupplier a;
    private boolean b;
    private final AtomicBoolean a;

    /*
     * Unable to fully structure code
     */
    public hP(jY var1_1, BooleanSupplier var2_2) {
        block22: {
            break block22;
lbl1:
            // 1 sources

            while (true) {
                this.a = new AtomicBoolean(false);
                ** GOTO lbl20
                break;
            }
lbl4:
            // 8 sources

            block13: while (true) {
                switch (var5_5) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block13;
                        }
                        break;
                    }
                    case -1126430071: {
                        ** continue;
                    }
                    case 610369463: {
                        var4_6 ^= var5_5 ^ 593823711;
                        break block13;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ 1447671926;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -718189645: {
                        this.a = var1_1;
                        break;
                    }
lbl20:
                    // 1 sources

                    var5_5 = (var3_4 | var6_3) ^ -124894749;
                    ** continue;
                }
                break;
            }
            var5_5 = (var3_4 | var6_3) ^ 1246672110;
            ** GOTO lbl4
lbl24:
            // 1 sources

            while (true) {
                var5_5 = (var3_4 | var6_3) ^ 1956084178;
                ** GOTO lbl4
                break;
            }
lbl27:
            // 1 sources

            while (true) {
                var5_5 = (var3_4 | var6_3) ^ 862762512;
                ** GOTO lbl4
                break;
            }
            {
                case 1743896254: {
                    var4_6 ^= var5_5 ^ 1913245724;
                    ** continue;
                }
                case -924367396: {
                    return;
                }
            }
lbl35:
            // 1 sources

            while (true) {
                var4_6 ^= 1204839760;
                super();
                ** continue;
                break;
            }
            {
                case -337082737: {
                    var4_6 ^= var5_5 ^ -116853407;
                    break;
                }
            }
lbl42:
            // 1 sources

            while (true) {
                var5_5 = (var3_4 | var6_3) ^ 424238097;
                ** GOTO lbl4
                break;
            }
lbl45:
            // 1 sources

            while (true) {
                var5_5 = (var3_4 | var6_3) ^ 1469627009;
                ** GOTO lbl4
                break;
            }
lbl48:
            // 1 sources

            while (true) {
                var5_5 = (var3_4 | var6_3) ^ -1155628822;
                ** GOTO lbl4
                break;
            }
            {
                case -1408022195: {
                    this.a = new Object();
                    ** continue;
                }
            }
            var5_5 = (var3_4 | var6_3) ^ 1005179156;
            ** GOTO lbl4
            {
                case -919189717: {
                    var4_6 ^= var5_5 ^ 755668108;
                    ** continue;
                }
            }
            var5_5 = (var3_4 | var6_3) ^ 597947860;
            ** while (true)
            {
                case -1533661623: {
                    var4_6 ^= var5_5 ^ 2054853348;
                    ** continue;
                }
            }
        }
        var6_3 = -1788151971;
        var3_4 = hP.a & -1788151971 ^ 171939864;
        var5_5 = 0;
        var4_6 = (var3_4 | var6_3) ^ 1113216478;
        ** while (true)
        {
            ** case -2043239604:
        }
lbl71:
        // 1 sources

        this.a = var2_2;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void startOrResume() {
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
    public void resume() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [29[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    public void pause() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [27[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    @Override
    public void run() {
        block13: {
            break block13;
lbl1:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -1822382793;
                ** GOTO lbl19
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1954746443;
                ** GOTO lbl19
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                hP.QM(3853781130901414272L << (var3_3 ^ 1078927026) >>> (var3_3 ^ 1078927026) ^ (long)var2_4 & 0xFFFFFFFFL | (3853781130901414272L >>> (var3_3 ^ 1078927026) ^ (long)var2_4 & 0xFFFFFFFFL) << (var3_3 ^ 1078927026));
                ** GOTO lbl29
                break;
            }
        }
        var4_1 = 270819588;
        var1_2 = hP.a & 270819588 ^ -212497537;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1229322871;
        ** while (true)
lbl17:
        // 2 sources

        block10: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 1442313522;
lbl19:
            // 4 sources

            block11: while (true) {
                switch (var3_3) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block11;
                        }
                        break;
                    }
                    case 1078926994: {
                        ** continue;
                    }
                    case -1501422003: {
                        var2_4 ^= var3_3 ^ 701066944;
                        break block10;
                    }
lbl29:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1801638034;
                    ** continue;
                    case -1743307795: {
                        var2_4 ^= var3_3 ^ 391924576;
                        ** continue;
                    }
                }
                break;
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ -1287981587;
        ** while (true)
        {
            case 1612009032: {
                this.QJ();
                ** GOTO lbl17
            }
            ** case -2013856972:
        }
lbl40:
        // 1 sources

        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void QJ() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [25[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * Enabled aggressive block sorting
     */
    static {
        var8 = -1542440605;
        hP.a = mK.a(MethodHandles.lookup().lookupClass(), -887334289);
        var7_1 = 0;
        var6_6 = -1893908415;
        var7_1 = var8 ^ -810577902;
        if (true) ** GOTO lbl27
lbl7:
        // 1 sources

        while (true) {
            var6_6 ^= -1279439378;
            var4_7 = 0;
            ** GOTO lbl70
            break;
        }
lbl11:
        // 1 sources

        while (true) {
            var7_1 = var8 ^ -1700982073;
            ** GOTO lbl41
            break;
        }
lbl14:
        // 1 sources

        while (true) {
            continue;
            break;
        }
        block22: while (true) {
            block26: {
                switch (var7_1) {
                    case 1671802580: {
                        var2_4 = (var6_6 | var7_1 ^ -944400457) ^ (var7_1 ^ -634660331) ^ hP.a;
                        break;
                    }
                    case 261629986: {
                        var6_6 ^= var7_1 ^ -81299752;
                        break block26;
                    }
                    case 1807722865: {
                        ** break;
lbl26:
                        // 1 sources

                        var7_1 = var8 ^ -1417146047;
                    }
lbl27:
                    // 3 sources

                    default: {
                        continue block22;
                    }
                }
                var6_6 ^= 781518000;
                break;
            }
            var7_1 = var8 ^ -944400457;
        }
        var0_2 = "\u008c\u00b5\u00b7\u00d7.5\u00e9\u001f\u00c7\u00b8\u0019\u00fe\u00f9\u0087\u0080\u00f2".getBytes("ISO-8859-1");
        var6_6 ^= -511389057;
        var1_3 = var0_2.length / 4;
        var7_1 = var8 ^ 1373952761;
        if (true) ** GOTO lbl46
        block23: while (true) {
            var7_1 = var8 ^ -861177650;
lbl41:
            // 2 sources

            block24: while (true) {
                switch (var7_1) {
                    case -168500326: {
                        var6_6 ^= var7_1 ^ 1672885697;
                        var7_1 = var8 ^ -1387259430;
                    }
lbl46:
                    // 3 sources

                    default: {
                        continue block24;
                    }
                    case 155197625: {
                        hP.a = new int[var1_3];
                        continue block23;
                    }
                    case 1049439140: {
                        var3_5 = 0;
                        ** continue;
                    }
                    case 1757102509: 
                }
                break;
            }
            break;
        }
        var6_6 ^= var7_1 ^ 188933090;
        ** while (true)
        var7_1 = var8 ^ -746151868;
        block25: while (true) {
            block27: {
                switch (var7_1) {
                    case -972458234: {
                        var6_6 ^= var7_1 ^ -641742035;
                        ** break;
                    }
                    case -2004831043: {
                        var6_6 ^= var7_1 ^ 1783840794;
                        var7_1 = var8 ^ 1773907479;
                        ** GOTO lbl81
                    }
                    case 2006358311: {
                        var3_5 += 4;
                        if (++var4_7 >= var1_3) break block27;
lbl70:
                        // 2 sources

                        var5_8 = (var0_2[var3_5] & (((var6_6 ^= 1359272373) | var8) ^ -1481557628)) << ((var6_6 | var8) ^ -1481557661) | (var0_2[var3_5 + 1] & ((var6_6 | var8) ^ -1481557628)) << ((var6_6 | var8) ^ -1481557653) | (var0_2[var3_5 + 2] & ((var6_6 | var8) ^ -1481557628)) << ((var6_6 | var8) ^ -1481557645) | var0_2[var3_5 + 3] & ((var6_6 | var8) ^ -1481557628);
                        var7_1 = var8 ^ 747671006;
                        ** GOTO lbl81
                    }
                    case -944482758: {
                        var6_6 ^= var7_1 ^ 1952676648;
                        ** continue;
                    }
lbl76:
                    // 1 sources

                    var7_1 = var8 ^ 1835930356;
                    ** GOTO lbl81
                    case -844392588: {
                        hP.a[var4_7] = var5_8 ^= var2_4;
                        var7_1 = var8 ^ 1671720793;
                    }
lbl81:
                    // 5 sources

                    default: {
                        continue block25;
                    }
                    case -914478185: 
                }
                hP.a = gj.decode("33ukUD7i5gKgmNKp6whayF0V", hP.QK((var6_6 | var7_1 ^ 1835930356) ^ (var7_1 ^ 1431549948), var7_1 ^ 1835930356 ^ ((var6_6 | var7_1 ^ 1835930356) ^ (var7_1 ^ -681586407))));
                return;
            }
            var7_1 = var8 ^ 1645825637;
        }
    }

    private static int QK(int n2, int n3) {
        int n4 = -1594960228;
        int n5 = 1699732812;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x94D13E53)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xE5EFB63E;
        n6 += (n5 | n4) ^ 0xE5EF1EDE;
        n6 -= (n5 | n4) ^ 0xE5EF0EA1;
        n6 ^= (n5 | n4) ^ 0xE5EF121C;
        n6 -= (n5 | n4) ^ 0xE5EF6D56;
        n6 ^= (n5 | n4) ^ 0xE5EF2134;
        n6 -= (n5 | n4) ^ 0xE5EF262F;
        n6 += (n5 | n4) ^ 0xE5EFE275;
        n6 -= (n5 | n4) ^ 0xE5EF84B9;
        return n6 += (n5 | n4) ^ 0xE5EF07E8;
    }

    /*
     * Exception decompiling
     */
    private void QL() {
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
    private static void QM(long var0) {
        block23: {
            block24: {
                var6_1 = -2077088994;
                var3_2 = hP.a & -2077088994 ^ 427724630;
                var5_3 = 0;
                var4_4 = (var3_2 | var6_1) ^ -649973086;
                var5_3 = (var3_2 | var6_1) ^ -1951212807;
                break block23;
lbl7:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -782660429;
                    break block23;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var4_4 ^= var5_3 ^ -274180051;
                    var5_3 = (var3_2 | var6_1) ^ 1093107298;
                    break block23;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    if (var0 > 0L) break block24;
                    var5_3 = (var3_2 | var6_1) ^ -946301500;
                    break block23;
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var4_4 ^= var5_3 ^ 414860190;
                    var5_3 = (var3_2 | var6_1) ^ 877270099;
                    break block23;
                    break;
                }
lbl22:
                // 1 sources

                return;
            }
            try {
                var5_3 = (var3_2 | var6_1) ^ -1232031741;
                break block23;
lbl28:
                // 1 sources

                while (true) {
                    var4_4 ^= var5_3 ^ -606273202;
                    var5_3 = (var3_2 | var6_1) ^ -862260314;
                    break block23;
                    break;
                }
lbl32:
                // 1 sources

                while (true) {
                    Thread.sleep(var0);
                    var4_4 ^= -18362352;
                    break;
                }
            }
            catch (InterruptedException v0) {
                var4_4 = (var3_2 | var6_1) ^ -72649574;
                var2_5 = v0;
                var4_4 ^= -1884097541;
                Thread.currentThread().interrupt();
            }
            var5_3 = (var3_2 | var6_1) ^ 301247974;
            break block23;
lbl43:
            // 1 sources

            while (true) {
                var4_4 ^= var5_3 ^ -975343588;
                var5_3 = (var3_2 | var6_1) ^ -1210870075;
                break block23;
                break;
            }
lbl47:
            // 1 sources

            return;
        }
        block22: while (true) {
            switch (var5_3) {
                default: {
                    continue block22;
                }
                case 382498215: {
                    ** continue;
                }
                case 1277633517: {
                    ** continue;
                }
                case -598093508: {
                    ** continue;
                }
                case 1525037722: {
                    ** continue;
                }
                case -1456162035: {
                    ** continue;
                }
                {
                    case 737025885: {
                        ** continue;
                    }
                    case 1373920504: {
                        ** continue;
                    }
                }
                case -1937112392: {
                    ** continue;
                }
                ** case 715995547:
lbl71:
                // 1 sources

                ** continue;
            }
            break;
        }
    }
}

