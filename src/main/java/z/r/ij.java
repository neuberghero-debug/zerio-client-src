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
 * Exception performing whole class analysis.
 */
@Environment(value=EnvType.CLIENT)
public final class ij
extends Enum<ij> {
    public static final /* enum */ ij a;
    private final String b;
    private static final /* synthetic */ String c;
    public static final int s;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ ij[] g;
    private static final /* synthetic */ String h;
    private static final int[] t;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String k;
    private final int l;
    public static final /* enum */ ij m;
    private static final /* synthetic */ String n;
    public static final /* enum */ ij o;
    public static final /* enum */ ij p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;

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
     * Enabled aggressive block sorting
     */
    public static ij[] values() {
        int n2 = s & 0x84240BA4 ^ 0xCBB9FA35;
        int n3 = 0;
        int n4 = (n2 | 0x84240BA4) ^ 0x5CF65422;
        n3 = (n2 | 0x84240BA4) ^ 0xCFE31E84;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -254045222: {
                    n4 ^= n3 ^ 0x579A8E4A;
                    n3 = (n2 | 0x84240BA4) ^ 0xFB86BA56;
                    continue block5;
                }
                case 876298723: {
                    return (ij[])g.clone();
                }
                case 6219057: 
            }
            n3 = (n2 | 0x84240BA4) ^ 0x3F66686F;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ij valueOf(String string) {
        int n2 = s & 0x8B8788A6 ^ 0xE0847EDF;
        int n3 = 0;
        int n4 = (n2 | 0x8B8788A6) ^ 0x8898FA97;
        n3 = (n2 | 0x8B8788A6) ^ 0x2980EDBD;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1610534528: {
                    n4 ^= n3 ^ 0xDBF2CEC2;
                    n3 = (n2 | 0x8B8788A6) ^ 0x8629A6B1;
                    continue block5;
                }
                case 1840142414: {
                    return Enum.valueOf(ij.class, string);
                }
                case -1039723710: 
            }
            n3 = (n2 | 0x8B8788A6) ^ 0xB479307F;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private ij(String string2, int n3) {
        int n4 = s & 0xD76BD48F ^ 0x12282246;
        int n5 = (n4 | 0xD76BD48F) ^ 0x99ABB81;
        n5 ^= 0xCE9DFE1F;
        super(string, n2);
        this.b = string2;
        this.l = n3;
    }

    /*
     * Exception decompiling
     */
    public String label() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH], 2[CASE]], but top level block is 4[SWITCH]
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
    public String badge() {
        var4_1 = 1673246911;
        var1_2 = ij.s & 1673246911 ^ 588491896;
        var3_3 = 0;
        ** GOTO lbl25
lbl5:
        // 1 sources

        while (true) {
            v0 = "";
            ** GOTO lbl34
            break;
        }
lbl8:
        // 1 sources

        block10: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 628538105;
lbl10:
            // 5 sources

            block11: while (true) {
                switch (var3_3) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block11;
                        }
                        break;
                    }
                    case -291006310: {
                        ** continue;
                    }
                    case 1117606172: {
                        break block10;
                    }
lbl19:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 556199395;
                        ** GOTO lbl-1000
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -367434705;
                        ** continue;
                        break;
                    }
lbl25:
                    // 1 sources

                    var2_4 = (var1_2 | var4_1) ^ 894000182;
                    ** continue;
lbl27:
                    // 1 sources

                    return v0;
                    case -1425330076: {
                        var2_4 ^= var3_3 ^ 85274489;
                        ** continue;
                    }
                    case 40401214: {
                        v0 = this.b;
lbl34:
                        // 2 sources

                        var2_4 ^= 1688617360;
                        ** continue;
                    }
                }
                break;
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ -927953765;
        ** GOTO lbl10
lbl38:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 1641268673;
            ** GOTO lbl10
            break;
        }
        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -295501895;
            ** GOTO lbl10
            break;
        }
        {
            case -1985816368: {
                if (!this.privileged()) ** continue;
                ** continue;
            }
        }
lbl47:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1927535515;
            ** continue;
            break;
        }
        {
            case -1915141306: {
                var2_4 ^= var3_3 ^ 585358958;
                ** continue;
            }
            ** case 1187841542:
        }
lbl54:
        // 1 sources

        var2_4 ^= var3_3 ^ -369648850;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean hasBadge() {
        block9: {
            break block9;
lbl1:
            // 2 sources

            block5: while (true) {
                switch (var3_2) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
                    case -1457788860: {
                        var2_3 ^= var3_2 ^ -1601510091;
                        break block5;
                    }
                    case -2057703932: {
                        return this.privileged();
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | -78671594) ^ 2094154644;
                        ** continue;
                        break;
                    }
                }
                break;
            }
            var3_2 = (var1_1 | -78671594) ^ 2122724282;
            ** GOTO lbl1
        }
        var1_1 = ij.s & -78671594 ^ -644461382;
        var3_2 = 0;
        var2_3 = (var1_1 | -78671594) ^ -1951304070;
        ** while (true)
lbl21:
        // 1 sources

        while (true) {
            var3_2 = (var1_1 | -78671594) ^ 1388590586;
            ** continue;
            break;
        }
        {
            ** case -2029150678:
        }
lbl25:
        // 1 sources

        ** while (true)
    }

    private static int KK(int n2, int n3) {
        int n4 = 835839712;
        int n5 = -202086109;
        int n6 = t[n2 ^ ((n5 | n4) ^ 0xA5A23771)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xF3F5CD17;
        n6 += (n5 | n4) ^ 0xF3F5431F;
        n6 ^= (n5 | n4) ^ 0xF3F53404;
        n6 += (n5 | n4) ^ 0xF3F57FA2;
        n6 ^= (n5 | n4) ^ 0xF3F51EFE;
        n6 -= (n5 | n4) ^ 0xF3F5FFFB;
        n6 -= (n5 | n4) ^ 0xF3F503B7;
        n6 -= (n5 | n4) ^ 0xF3F51297;
        n6 -= (n5 | n4) ^ 0xF3F530E7;
        return n6 ^= (n5 | n4) ^ 0xF3F54C38;
    }

    /*
     * Unable to fully structure code
     */
    public boolean privileged() {
        block26: {
            block23: {
                block25: {
                    break block25;
lbl1:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 1501069122;
                        break block23;
                        break;
                    }
                }
                var4_1 = -1214723943;
                var1_2 = ij.s & -1214723943 ^ 162653440;
                var3_3 = 0;
                break block26;
lbl9:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1228982743;
                    ** GOTO lbl37
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 381963567;
            ** GOTO lbl37
lbl15:
            // 1 sources

            return v0;
        }
        var2_4 = (var1_2 | var4_1) ^ -1423536709;
        var3_3 = (var1_2 | var4_1) ^ -791461467;
        ** GOTO lbl37
lbl21:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1954892241;
            if (true) ** GOTO lbl37
            break;
        }
        do {
            block24: {
                var3_3 = (var1_2 | var4_1) ^ 461202424;
                ** GOTO lbl37
lbl27:
                // 1 sources

                block16: while (true) {
                    block27: {
                        var3_3 = (var1_2 | var4_1) ^ 202975216;
                        break block27;
lbl30:
                        // 2 sources

                        while (true) {
                            var2_4 ^= 884307651;
                            ** continue;
                            break;
                        }
lbl33:
                        // 1 sources

                        while (this != ij.m) {
                            ** continue;
lbl35:
                            // 1 sources

                            ** GOTO lbl21
                        }
                        break block24;
                    }
lbl38:
                    // 3 sources

                    block19: while (true) {
                        switch (var3_3) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block19;
                                }
                                break;
                            }
                            case -1530622367: {
                                ** continue;
                            }
                            case 885218230: {
                                break block16;
                            }
                            case 1869261884: {
                                ** continue;
                            }
                            case -1281308055: {
                                ** GOTO lbl33
                            }
lbl51:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -470077066;
                                ** continue;
                                break;
                            }
                        }
                        break;
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ -923310068;
                ** GOTO lbl38
            }
lbl57:
            // 2 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1620760035;
                ** continue;
                break;
            }
            {
                case -1451384650: {
                    v0 = false;
                    ** GOTO lbl30
                }
                case 151444400: {
                    var2_4 ^= var3_3 ^ -293976306;
                    ** continue;
                }
                case 1547885807: {
                    v0 = true;
                    ** continue;
                }
                case -551339910: {
                    var2_4 ^= var3_3 ^ 580897113;
                    ** continue;
                }
                ** case 2001634709:
            }
lbl73:
            // 1 sources

        } while (this != ij.p);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public int color() {
        int n2 = s & 0x20C300A6 ^ 0x7C42AE22;
        int n3 = 0;
        int n4 = (n2 | 0x20C300A6) ^ 0x1284D96E;
        n3 = (n2 | 0x20C300A6) ^ 0x4A0EB6A3;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 919410693: {
                    n3 = (n2 | 0x20C300A6) ^ 0x761FCD09;
                    continue block5;
                }
                case 1712262638: {
                    return this.l;
                }
                case 182215599: 
            }
            n4 ^= n3 ^ 0x68A2FDD5;
            n3 = (n2 | 0x20C300A6) ^ 0x1ACCA348;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int selfColor() {
        int n2 = s & 0xF19B9717 ^ 0x459353D3;
        int n3 = 0;
        int n4 = (n2 | 0xF19B9717) ^ 0x56222DCF;
        n3 = (n2 | 0xF19B9717) ^ 0xC962154D;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1023001242: {
                    n3 = (n2 | 0xF19B9717) ^ 0x4D3A7112;
                    continue block5;
                }
                case 840059519: {
                    return ij.KK((n4 | n3 ^ 0xC389DD68) ^ (n3 ^ 0x95DE051A), (n2 | n3 ^ 0xC389DD68) ^ ((n4 | n3 ^ 0xC389DD68) ^ (n3 ^ 0x323E4BE5)));
                }
                case -1197365563: 
            }
            n4 ^= n3 ^ 0x6A085F3F;
            n3 = (n2 | 0xF19B9717) ^ 0xC7899DA8;
        }
    }

    /*
     * Exception decompiling
     */
    public static ij parse(String var0) {
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
    private static /* synthetic */ ij[] KL() {
        int n2 = s & 0x8B9B140B ^ 0xDAB5A122;
        int n3 = 0;
        int n4 = (n2 | 0x8B9B140B) ^ 0x393123BF;
        n3 = (n2 | 0x8B9B140B) ^ 0x6D6504B8;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1227181677: {
                    n3 = (n2 | 0x8B9B140B) ^ 0x869A58A2;
                    continue block5;
                }
                case 1562766729: {
                    n4 ^= n3 ^ 0xAD1800C3;
                    n3 = (n2 | 0x8B9B140B) ^ 0x8C6F0D83;
                    continue block5;
                }
                case 1473296552: 
            }
            break;
        }
        return new ij[]{m, p, o, a};
    }
}

