/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1109
 *  net.minecraft.class_1113
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1109;
import net.minecraft.class_1113;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import z.r.aE;
import z.r.al;
import z.r.az;
import z.r.dA;
import z.r.gF;
import z.r.ke;
import z.r.mw;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class er
extends gF {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private final al a;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private final al b;
    private final az a;
    private final aE a;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String s;
    private static final int[] a;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final int a;
    private static final /* synthetic */ String k;
    private static final int b;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private final ke a;
    private static volatile er a;
    private final ke b;
    private static final /* synthetic */ String p;
    private final ke c;
    public static final int c;
    private static final /* synthetic */ String q;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public er() {
        int n2 = 70370941;
        int n3 = c & 0x431C67D ^ 0xED26254;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x25C8A521;
        n5 ^= 0xCDFFB384;
        super(k, s, dA.P);
        n4 = (n3 | n2) ^ 0xA9377235;
        block20: while (true) {
            switch (n4) {
                default: {
                    continue block20;
                }
                case 882941211: {
                    this.b = this.addSetting(new ke(q, true));
                    n4 = (n3 | n2) ^ 0xFD37CDC5;
                    continue block20;
                }
                case -205247560: {
                    n5 ^= n4 ^ 0x949A0D41;
                    n4 = (n3 | n2) ^ 0x616B670;
                    continue block20;
                }
                case -383049175: {
                    n5 ^= n4 ^ 0x2D7326E1;
                    n4 = (n3 | n2) ^ 0x79332;
                    continue block20;
                }
                case -1480289208: {
                    n5 ^= n4 ^ 0x52C21077;
                    n4 = (n3 | n2) ^ 0x44A9BD70;
                    continue block20;
                }
                case 149245965: {
                    this.a = this.addSetting(new ke(c, true));
                    n4 = (n3 | n2) ^ 0xD812D7BC;
                    continue block20;
                }
                case -1270631541: {
                    n5 ^= n4 ^ 0xE8BFA517;
                    n4 = (n3 | n2) ^ 0x3A537B66;
                    continue block20;
                }
                case 1247435533: {
                    this.b = this.addSetting(new al(g, h, er.fQ((n5 | n4 ^ 0x4E6B9D70) ^ (n4 ^ 0x877FA70), (n3 | n4 ^ 0x4E6B9D70) ^ ((n5 | n4 ^ 0x4E6B9D70) ^ (n4 ^ 0x5EDEEA19)))));
                    n4 = (n3 | n2) ^ 0x351EFF3C;
                    continue block20;
                }
                case -2110983452: {
                    this.a = this.addSetting(new az(j, er.fQ((n5 | n4 ^ 0x861D3499) ^ (n4 ^ 0x2CD4398), (n3 | n4 ^ 0x861D3499) ^ ((n5 | n4 ^ 0x861D3499) ^ (n4 ^ 0x4C9969CD)))));
                    n4 = (n3 | n2) ^ 0xBAB055F6;
                    continue block20;
                }
                case -247408472: {
                    a = this;
                    n4 = (n3 | n2) ^ 0xE7D8C454;
                    continue block20;
                }
                case -689884735: {
                    n5 ^= n4 ^ 0xD265E9E;
                    n4 = (n3 | n2) ^ 0x2EDE98BE;
                    continue block20;
                }
                case 539852483: {
                    this.c = this.addSetting(new ke(p, true));
                    n4 = (n3 | n2) ^ 0x57B05B7E;
                    continue block20;
                }
                case 1005394241: {
                    n5 ^= n4 ^ 0x2F65A83F;
                    n4 = (n3 | n2) ^ 0x4140522C;
                    continue block20;
                }
                case 1497611523: {
                    n5 ^= n4 ^ 0x13B0F8D6;
                    n4 = (n3 | n2) ^ 0xFFB33ED5;
                    continue block20;
                }
                case 229765930: {
                    this.a = this.addSetting(new al(m, i, 4));
                    n4 = (n3 | n2) ^ 0xE7598D87;
                    continue block20;
                }
                case 1088584508: {
                    n5 ^= n4 ^ 0x6C1AB91C;
                    n4 = (n3 | n2) ^ 0x3421557;
                    continue block20;
                }
                case 1337177169: {
                    this.a = this.addSetting(new aE(o, a, a, f, l));
                    n4 = (n3 | n2) ^ 0x4E119D41;
                    continue block20;
                }
                case -374707206: {
                    n5 ^= n4 ^ 0x13378AD0;
                    n4 = (n3 | n2) ^ 0x8CDF1499;
                    continue block20;
                }
                case 250901839: 
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static er getInstance() {
        block31: {
            break block31;
lbl1:
            // 2 sources

            block25: while (true) {
                switch (var4_5) {
                    case -1923490986: {
                        var4_5 ^= -525363544;
                        return v0;
                    }
                    case 1275309278: {
                        var4_5 ^= -995668496;
                        continue block25;
                    }
                }
                var4_5 ^= 1170712574;
                return v0;
            }
lbl11:
            // 1 sources

            block26: while (true) {
                switch (var5_2) {
                    default: {
                        continue block26;
                    }
                    case 40095641: {
                        v0 = var2_6 = (er)var1_4;
                        ** GOTO lbl1
                    }
                    case 962699552: {
                        var4_5 ^= var5_2 ^ -350345530;
                        var5_2 = (var3_1 | var6) ^ 1859490836;
                        continue block26;
                    }
                    case 298280609: {
                        v0 = null;
                        ** continue;
                    }
                    case -316829338: {
                        var4_5 ^= var5_2 ^ 339467426;
                        var5_2 = (var3_1 | var6) ^ 211473166;
                        continue block26;
                    }
                    case 1938301371: {
                        if (!(var1_4 instanceof er)) {
                            var5_2 = (var3_1 | var6) ^ -264231735;
                            continue block26;
                        }
                        var5_2 = (var3_1 | var6) ^ 534418023;
                        continue block26;
                    }
                    case 42411976: 
                }
                var4_5 ^= var5_2 ^ -73307636;
                var5_2 = (var3_1 | var6) ^ 524188214;
                continue;
                break;
            }
        }
        var6 = 475370660;
        var3_1 = er.c & 475370660 ^ 223916459;
        var5_2 = 0;
        var4_5 = (var3_1 | var6) ^ 493465171;
        var5_2 = (var3_1 | var6) ^ -706646631;
        block27: while (true) {
            switch (var5_2) {
                default: {
                    continue block27;
                }
                case -927147978: {
                    var5_2 = (var3_1 | var6) ^ 453235320;
                    continue block27;
                }
                case 106850263: {
                    var4_5 ^= var5_2 ^ -713370614;
                    var5_2 = (var3_1 | var6) ^ 785899159;
                    continue block27;
                }
                case 864709432: 
            }
            break;
        }
        var0_3 = er.a;
        var5_2 = (var3_1 | var6) ^ -1898580901;
        block28: while (true) {
            switch (var5_2) {
                case 1301961354: {
                    if (var0_3 != null) {
                        var5_2 = (var3_1 | var6) ^ -726834108;
                        continue block28;
                    }
                    ** GOTO lbl79
                }
                case -1655638199: {
                    var1_4 = mw.getInstance().getModuleByName(er.k);
                    var5_2 = (var3_1 | var6) ^ 607917199;
                    ** continue;
                }
                case -1819786764: {
                    var4_5 ^= var5_2 ^ 414395389;
                    var5_2 = (var3_1 | var6) ^ 1355280165;
                    continue block28;
                }
                case -906964501: {
                    var4_5 ^= var5_2 ^ 1461959718;
                    var5_2 = (var3_1 | var6) ^ -935185116;
                }
                default: {
                    continue block28;
                }
lbl79:
                // 1 sources

                var5_2 = (var3_1 | var6) ^ 1307188861;
                continue block28;
                case 1354214354: {
                    var4_5 ^= var5_2 ^ -1365477234;
                    var5_2 = (var3_1 | var6) ^ -2146614554;
                    continue block28;
                }
                case -719355765: 
            }
            break;
        }
        return var0_3;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onEnable() {
        block8: {
            block9: {
                var1_1 = er.c & 1992103153 ^ 1854243238;
                var3_2 = 0;
                break block9;
lbl4:
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
                        case -1934424929: {
                            return;
                        }
                        case 1894753940: {
                            break block8;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 1992103153) ^ -233926296;
                            ** continue;
                            break;
                        }
                        case 685679856: {
                            var2_3 ^= var3_2 ^ -1280971226;
                            break;
                        }
                    }
                    ** continue;
                    break;
                }
            }
            var2_3 = (var1_1 | 1992103153) ^ 340452203;
            var3_2 = (var1_1 | 1992103153) ^ 240268131;
            ** GOTO lbl4
        }
        var3_2 = (var1_1 | 1992103153) ^ 1449341191;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block9: {
            block10: {
                break block10;
lbl1:
                // 1 sources

                while (true) {
                    var2_3 ^= var3_2 ^ -1025852868;
                    ** GOTO lbl13
                    break;
                }
lbl4:
                // 1 sources

                block6: while (true) {
                    switch (var3_2) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block6;
                            }
                            break;
                        }
                        case -1991612019: {
                            break block9;
                        }
                        case 1718298056: {
                            ** continue;
                        }
lbl13:
                        // 1 sources

                        var3_2 = (var1_1 | -1656922135) ^ -961612511;
                        ** GOTO lbl-1000
lbl15:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | -1656922135) ^ 1953863284;
                            ** continue;
                            break;
                        }
                        case 999361240: {
                            return;
                        }
                    }
                    break;
                }
            }
            var1_1 = er.c & -1656922135 ^ 1679471225;
            var3_2 = 0;
            var2_3 = (var1_1 | -1656922135) ^ -363315891;
            ** while (true)
        }
        var3_2 = (var1_1 | -1656922135) ^ -1688937935;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public boolean tryIntercept(String var1_1) {
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
     * Exception decompiling
     */
    private void fO(String[] var1_1) {
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
    private void show(class_310 var1_1, class_2561 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [55[UNCONDITIONALDOLOOP]], but top level block is 0[SWITCH]
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
    private void fP(class_310 var1_1) {
        block23: {
            block19: {
                block21: {
                    block20: {
                        block22: {
                            break block22;
lbl1:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1714790171;
                                break block19;
lbl4:
                                // 1 sources

                                while (true) {
                                    if (!((Boolean)this.b.getValue()).booleanValue()) break block20;
                                    break block21;
                                    break;
                                }
                                break;
                            }
                        }
                        var5_2 = 403936550;
                        var2_3 = er.c & 403936550 ^ -736224610;
                        var4_4 = 0;
                        break block23;
lbl12:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1090257456;
                            break block19;
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ 1716624924;
                            ** GOTO lbl50
                            break;
                        }
lbl18:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1502528669;
                            break block19;
                            break;
                        }
                    }
lbl22:
                    // 2 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1179407180;
                        break block19;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ -1169855071;
                        ** continue;
                        break;
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ -31545662;
                break block19;
lbl31:
                // 1 sources

                while (true) {
                    this.fS(var1_1, class_3417.field_14709, 1.0f);
                    ** continue;
                    break;
                }
            }
lbl35:
            // 2 sources

            block17: while (true) {
                switch (var4_4) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block17;
                        }
                        break;
                    }
                    case 1662804590: {
                        ** continue;
                    }
                    case -1033559320: {
                        ** continue;
                    }
                    case 1705784074: {
                        ** continue;
                    }
                    case -2054071517: {
                        ** continue;
                    }
                    case -1171652443: {
                        ** continue;
                    }
lbl50:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -1135059983;
                    ** continue;
                    case 1615316047: {
                        return;
                    }
                    case 570505596: 
                }
                break;
            }
            ** while (true)
        }
        var3_5 = (var2_3 | var5_2) ^ 1428655653;
        var4_4 = (var2_3 | var5_2) ^ 511360342;
        ** while (true)
    }

    private static int fQ(int n2, int n3) {
        int n4 = -986703437;
        int n5 = 1919102436;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xA2AD6A75)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xF7738D20;
        n6 -= (n5 | n4) ^ 0xF773BFDA;
        n6 += (n5 | n4) ^ 0xF7734871;
        n6 -= (n5 | n4) ^ 0xF7732F54;
        n6 ^= (n5 | n4) ^ 0xF77331D5;
        n6 ^= (n5 | n4) ^ 0xF7733D76;
        n6 += (n5 | n4) ^ 0xF7731FDC;
        n6 ^= (n5 | n4) ^ 0xF7737EB1;
        n6 -= (n5 | n4) ^ 0xF773EC45;
        return n6 ^= (n5 | n4) ^ 0xF773A0CC;
    }

    /*
     * Unable to fully structure code
     */
    private void fR(class_310 var1_1) {
        block20: {
            block22: {
                block19: {
                    block21: {
                        break block21;
lbl1:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ 1138768540;
                            break block19;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1783285047;
                            ** GOTO lbl40
                            break;
                        }
lbl7:
                        // 1 sources

                        return;
lbl9:
                        // 1 sources

                        while (true) {
                            this.fS(var1_1, class_3417.field_15008, 1.0f);
                            break block20;
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1198611780;
                            ** GOTO lbl40
lbl15:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -1122454703;
                                ** GOTO lbl40
                                break;
                            }
                            break;
                        }
lbl18:
                        // 1 sources

                        while (true) {
                            if (((Boolean)this.b.getValue()).booleanValue()) {
                                ** continue;
                            }
                            break block20;
                            break;
                        }
                    }
                    var5_2 = 629127244;
                    var2_3 = er.c & 629127244 ^ -1888642121;
                    var4_4 = 0;
                    break block22;
                }
                var4_4 = (var2_3 | var5_2) ^ -1295139282;
                ** GOTO lbl40
            }
            var3_5 = (var2_3 | var5_2) ^ -890335656;
            var4_4 = (var2_3 | var5_2) ^ -1778556263;
            ** GOTO lbl40
        }
        var4_4 = (var2_3 | var5_2) ^ -1601141240;
        if (true) ** GOTO lbl40
        block16: while (true) {
            var3_5 ^= var4_4 ^ 936884087;
            var4_4 = (var2_3 | var5_2) ^ -1506830719;
lbl40:
            // 7 sources

            block17: while (true) {
                switch (var4_4) {
                    default: {
                        continue block17;
                    }
                    case 401676611: {
                        ** continue;
                    }
                    case -986349880: {
                        ** continue;
                    }
                    case 156249470: {
                        ** continue;
                    }
                    case 308742318: {
                        ** continue;
                    }
                    case 981653862: {
                        ** continue;
                    }
                    case 498206161: {
                        ** continue;
                    }
                    ** case 267337207:
lbl57:
                    // 1 sources

                    continue block16;
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void fS(class_310 class_3102, class_3414 class_34142, float f2) {
        int n2 = 1482244541;
        int n3 = c & 0x585941BD ^ 0xB3CA1AAE;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xF0E28960;
        n4 = (n3 | n2) ^ 0x6B16A743;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case 472330454: {
                    class_3102.method_1483().method_4873((class_1113)class_1109.method_4757((class_3414)class_34142, (float)f2, (float)1.0f));
                    n4 = (n3 | n2) ^ 0x8B8889EC;
                    continue block7;
                }
                case 1884541523: {
                    n5 ^= n4 ^ 0x11AB745E;
                    n4 = (n3 | n2) ^ 0x2C8EDAB5;
                    continue block7;
                }
                case 132558260: {
                    n5 ^= n4 ^ 0x8B4961CD;
                    n4 = (n3 | n2) ^ 0xE7FC6B69;
                    continue block7;
                }
                case -682262262: {
                    return;
                }
                case -1865548548: 
            }
            n4 = (n3 | n2) ^ 0xFC3DF60B;
        }
    }
}

