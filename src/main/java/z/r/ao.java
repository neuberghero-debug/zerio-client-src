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
import z.r.bM;
import z.r.gP;
import z.r.he;
import z.r.jJ;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class ao
extends bM {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private final ke a;
    static final double a;
    public static final int a;
    private static final /* synthetic */ String s;
    private static ao a;
    private final gP a;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final int[] a;
    private final gP b;
    private static final /* synthetic */ String k;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ao() {
        var4_1 = -449230214;
        var1_2 = ao.a & -449230214 ^ 1406789926;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -1184703037;
        var2_4 ^= 1205278621;
        super(ao.k, ao.s);
        var3_3 = (var1_2 | var4_1) ^ 204724699;
        if (true) ** GOTO lbl12
        block14: while (true) {
            this.a = this.addSetting(new gP(ao.f, 4.5f, 4.5f, 6.0f, 0.01f, ao.b).description(ao.a));
            var3_3 = (var1_2 | var4_1) ^ -1756814929;
lbl12:
            // 2 sources

            block15: while (true) {
                switch (var3_3) {
                    default: {
                        continue block15;
                    }
                    case -190757013: {
                        he.setRangeExtender(new jJ(this));
                        var3_3 = (var1_2 | var4_1) ^ 801970851;
                        continue block15;
                    }
                    case -2094065042: {
                        var2_4 ^= var3_3 ^ 428948583;
                        var3_3 = (var1_2 | var4_1) ^ -650609847;
                        continue block15;
                    }
                    case 1622198993: {
                        var2_4 ^= var3_3 ^ -1186773494;
                        var3_3 = (var1_2 | var4_1) ^ 305480509;
                        continue block15;
                    }
                    case -98513621: {
                        var2_4 ^= -1713689505;
                        this.b = this.addSetting(new gP(ao.d, 3.25f, 3.0f, 6.0f, 0.01f, ao.b).description(ao.e));
                        var3_3 = (var1_2 | var4_1) ^ 1960243472;
                        continue block15;
                    }
                    case -70634843: {
                        var2_4 ^= var3_3 ^ -1495718854;
                        var3_3 = (var1_2 | var4_1) ^ 232334933;
                        continue block15;
                    }
                    case 1160536950: {
                        var2_4 ^= var3_3 ^ -1283963682;
                        var3_3 = (var1_2 | var4_1) ^ 1191075767;
                        continue block15;
                    }
                    case -667618851: {
                        var2_4 ^= var3_3 ^ -1908719659;
                        var3_3 = (var1_2 | var4_1) ^ -86214430;
                        continue block15;
                    }
                    case -1324895031: {
                        ao.a = this;
                        var3_3 = (var1_2 | var4_1) ^ -1487847946;
                        continue block15;
                    }
                    case -439572413: {
                        this.a = this.addSetting(new ke(ao.c, true));
                        var3_3 = (var1_2 | var4_1) ^ -1294628856;
                        continue block15;
                    }
                    case 784437303: {
                        var2_4 ^= -978118931;
                        continue block14;
                    }
                    case 1353242248: {
                        var2_4 ^= var3_3 ^ 862605199;
                        var3_3 = (var1_2 | var4_1) ^ 56142869;
                        continue block15;
                    }
                    case 220566428: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ao instance() {
        int n2 = a & 0x1785ACEF ^ 0x19CE2FC0;
        int n3 = 0;
        int n4 = (n2 | 0x1785ACEF) ^ 0x2AD38E6E;
        n3 = (n2 | 0x1785ACEF) ^ 0xC9132615;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 586738242: {
                    return a;
                }
                case -690189830: {
                    break;
                }
                case 440966845: {
                    n4 ^= n3 ^ 0x32A33511;
                    n3 = (n2 | 0x1785ACEF) ^ 0x3D3745AD;
                    continue block5;
                }
            }
            n3 = (n2 | 0x1785ACEF) ^ 0x5873152;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onCombatTick() {
        block7: {
            var1_1 = ao.a & -715347541 ^ 774270296;
            var3_2 = 0;
            ** GOTO lbl14
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
                    case 1718142104: {
                        var2_3 ^= var3_2 ^ -2041509388;
                        break block7;
                    }
                    case -1865829898: {
                        break block5;
                    }
lbl14:
                    // 1 sources

                    var2_3 = (var1_1 | -715347541) ^ 913881610;
                    var3_2 = (var1_1 | -715347541) ^ 1874287629;
                    ** continue;
                    case -1391226247: {
                        return;
                    }
                }
                break;
            }
            var3_2 = (var1_1 | -715347541) ^ -1726600861;
            ** GOTO lbl4
        }
        var3_2 = (var1_1 | -715347541) ^ 1382907778;
        ** while (true)
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

    private static int ru(int n2, int n3) {
        int n4 = 293544542;
        int n5 = 1386709777;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x54FFF405)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0x53FF4739;
        n6 ^= (n5 | n4) ^ 0x53FF4254;
        n6 ^= (n5 | n4) ^ 0x53FF5777;
        n6 ^= (n5 | n4) ^ 0x53FF9E5D;
        n6 -= (n5 | n4) ^ 0x53FF1E86;
        n6 ^= (n5 | n4) ^ 0x53FFD270;
        n6 ^= (n5 | n4) ^ 0x53FF13BF;
        n6 -= (n5 | n4) ^ 0x53FF8070;
        n6 += (n5 | n4) ^ 0x53FF144C;
        return n6 ^= (n5 | n4) ^ 0x53FFF3F9;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static double entityRange(Object var0, double var1_1) {
        block35: {
            var9_2 = -1436410234;
            var6_3 = ao.a & -1436410234 ^ -1324197561;
            var8_4 = 0;
            var7_7 = (var6_3 | var9_2) ^ -1750252154;
            var8_4 = (var6_3 | var9_2) ^ 1000674908;
            ** GOTO lbl64
lbl7:
            // 1 sources

            while (true) {
                var8_4 = (var6_3 | var9_2) ^ 1871855708;
                if (true) ** GOTO lbl64
                break;
            }
            block28: while (true) {
                switch (var8_4) {
                    case -2095474136: {
                        var7_7 ^= var8_4 ^ -2079788650;
                        ** break;
                    }
                    case -787582965: {
                        var4_6 = ((Float)var3_5.b.getValue()).floatValue();
                        var8_4 = (var6_3 | var9_2) ^ 1473433429;
                        break block35;
                    }
                    case -1089253066: {
                        if (var3_5 == null) ** GOTO lbl59
                        ** GOTO lbl27
                    }
                    case -604632365: {
                        ** GOTO lbl36
                    }
lbl24:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ 73469681;
lbl25:
                    // 5 sources

                    default: {
                        continue block28;
                    }
lbl27:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ 1619285268;
                    continue block28;
                    case 771687234: {
                        var8_4 = (var6_3 | var9_2) ^ 1100398282;
                        ** GOTO lbl25
                    }
                    case -85663475: {
                        if (var0 != ao.a.field_1724) ** GOTO lbl59
                        var8_4 = (var6_3 | var9_2) ^ -854548341;
                        ** GOTO lbl25
                    }
lbl36:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ 1092418337;
                    continue block28;
                    case 1716187514: {
                        if (ao.a.field_1724 != null) {
                            var8_4 = (var6_3 | var9_2) ^ -1769120635;
                            continue block28;
                        }
                        ** GOTO lbl59
                    }
                    case -1573984620: {
                        var8_4 = (var6_3 | var9_2) ^ -583487811;
                        ** GOTO lbl25
                    }
                    case 1344699740: {
                        var7_7 ^= var8_4 ^ -2090942013;
                        var8_4 = (var6_3 | var9_2) ^ 1807097758;
                        continue block28;
                    }
                    case -93412122: {
                        if (var3_5.isEnabled()) {
                            var8_4 = (var6_3 | var9_2) ^ 425507155;
                            continue block28;
                        }
                        ** GOTO lbl59
                    }
                    case 1986199372: {
                        var7_7 ^= var8_4 ^ -989561423;
                        var8_4 = (var6_3 | var9_2) ^ 1786523596;
                        continue block28;
                    }
lbl59:
                    // 4 sources

                    var8_4 = (var6_3 | var9_2) ^ -346807653;
                    continue block28;
lbl61:
                    // 2 sources

                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ -933170221;
                        break block35;
                        break;
                    }
lbl64:
                    // 2 sources

                    block31: while (true) {
                        switch (var8_4) {
                            default: {
                                continue block31;
                            }
                            case -2021288847: {
                                var7_7 ^= var8_4 ^ 190084403;
                                ** continue;
                            }
                            case -2133374565: {
                                var8_4 = (var6_3 | var9_2) ^ 1022872502;
                                continue block31;
                            }
                            case -723509349: 
                        }
                        break;
                    }
                    var3_5 = ao.a;
                    var8_4 = (var6_3 | var9_2) ^ 946587119;
                    continue block28;
                    case -792444839: 
                }
                break;
            }
            return var1_1;
        }
        block32: while (true) {
            switch (var8_4) {
                default: {
                    continue block32;
                }
                case 1930603540: {
                    var7_7 ^= var8_4 ^ 1684250709;
                    var8_4 = (var6_3 | var9_2) ^ -1267665696;
                    continue block32;
                }
                case 93703061: {
                    if (!((Boolean)var3_5.a.getValue()).booleanValue()) ** GOTO lbl61
                    var8_4 = (var6_3 | var9_2) ^ -1544524101;
                    continue block32;
                }
                case -343034242: {
                    var4_6 = Math.min(var4_6, 3.0);
                    ** continue;
                }
                case -325021550: {
                    var7_7 ^= var8_4 ^ 1320757642;
                    var8_4 = (var6_3 | var9_2) ^ -1092119470;
                    continue block32;
                }
                case 411185532: {
                    var8_4 = (var6_3 | var9_2) ^ 1358948793;
                    continue block32;
                }
                case 251833127: 
            }
            break;
        }
        return Math.max(var1_1, var4_6);
    }

    /*
     * Unable to fully structure code
     */
    public static double blockRange(Object var0, double var1_1) {
        block42: {
            block41: {
                var7_2 = -1301463450;
                var4_3 = ao.a & -1301463450 ^ 373791495;
                var6_4 = 0;
                ** GOTO lbl29
lbl5:
                // 1 sources

                while (true) {
                    if (ao.a.field_1724 == null) break block41;
                    ** GOTO lbl37
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 1832142406;
                    ** GOTO lbl17
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    var5_6 ^= var6_4 ^ 298104984;
                    ** continue;
                    break;
                }
            }
lbl15:
            // 3 sources

            block26: while (true) {
                var6_4 = (var4_3 | var7_2) ^ 930310451;
lbl17:
                // 8 sources

                block27: while (true) {
                    block0 : switch (var6_4) lbl-1000:
                    // 9 sources

                    {
                        while (true) {
                            default: {
                                continue block27;
                            }
                            break;
                        }
                        case 1350272759: {
                            ** continue;
                        }
                        case -611985897: {
                            ** continue;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var5_6 ^= var6_4 ^ 1893144044;
                            ** GOTO lbl82
                            break;
                        }
lbl29:
                        // 1 sources

                        var5_6 = (var4_3 | var7_2) ^ -1053161595;
                        ** GOTO lbl57
lbl31:
                        // 1 sources

                        while (true) {
                            var6_4 = (var4_3 | var7_2) ^ 1012327728;
                            ** GOTO lbl-1000
                            break;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            var6_4 = (var4_3 | var7_2) ^ -1338296548;
                            ** GOTO lbl-1000
                            break;
                        }
lbl37:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -803799246;
                        ** GOTO lbl-1000
lbl39:
                        // 2 sources

                        block32: while (true) {
                            switch (var6_4) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block32;
                                    }
                                    break;
                                }
                                case -1294236419: {
                                    break block32;
                                }
                                case -1428548831: {
                                    ** continue;
                                }
                                while (true) {
                                    var6_4 = (var4_3 | var7_2) ^ -581273971;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl51:
                                // 1 sources

                                while (true) {
                                    var6_4 = (var4_3 | var7_2) ^ 1441729536;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case -1463595522: {
                                    if (var0 == ao.a.field_1724) break block0;
                                    continue block26;
                                }
lbl57:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ 78920602;
                                ** continue;
                                case 1864431107: {
                                    var5_6 ^= var6_4 ^ -920916441;
                                    ** continue;
                                }
lbl62:
                                // 1 sources

                                while (true) {
                                    var6_4 = (var4_3 | var7_2) ^ -1354514704;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl65:
                                // 1 sources

                                while (true) {
                                    var6_4 = (var4_3 | var7_2) ^ -434882160;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case 422314391: {
                                    return Math.max(var1_1, (double)((Float)var3_5.a.getValue()).floatValue());
                                }
                            }
                            break;
                        }
                        var6_4 = (var4_3 | var7_2) ^ 481668166;
                        ** GOTO lbl39
                        {
                            ** case 1885692481:
                        }
lbl73:
                        // 1 sources

                        var3_5 = ao.a;
                        break block42;
                        case 106203259: {
                            break block26;
                        }
                        case -300942426: {
                            return var1_1;
                        }
                        case 1798687210: {
                            var5_6 ^= var6_4 ^ -1842275110;
                            ** continue;
                        }
lbl82:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -972366554;
                        ** continue;
lbl84:
                        // 1 sources

                        while (true) {
                            var6_4 = (var4_3 | var7_2) ^ 805024187;
                            ** continue;
                            break;
                        }
                    }
                    break;
                }
                break;
            }
            var6_4 = (var4_3 | var7_2) ^ -1741551613;
            ** GOTO lbl17
        }
        var6_4 = (var4_3 | var7_2) ^ 1844078960;
        ** GOTO lbl17
lbl92:
        // 1 sources

        while (true) {
            var6_4 = (var4_3 | var7_2) ^ 1934567946;
            ** GOTO lbl17
            break;
        }
lbl95:
        // 1 sources

        while (true) {
            var6_4 = (var4_3 | var7_2) ^ 1482704065;
            ** GOTO lbl17
            break;
        }
        {
            case -614729439: {
                if (var3_5 == null) ** GOTO lbl15
                ** continue;
            }
            case 777893732: {
                if (var3_5.isEnabled()) ** break;
                ** continue;
                ** continue;
            }
            case -987720339: {
                var5_6 ^= var6_4 ^ -437798212;
                ** continue;
            }
            case -478104729: {
                return var1_1;
            }
            case -1975952809: {
                if (!((Boolean)var3_5.a.getValue()).booleanValue()) ** continue;
                ** continue;
            }
        }
        var6_4 = (var4_3 | var7_2) ^ -649115292;
        ** GOTO lbl17
        {
            case 1719222357: {
                break;
            }
            case -2128816556: {
                var5_6 ^= var6_4 ^ 1365952048;
                ** continue;
            }
        }
        var6_4 = (var4_3 | var7_2) ^ 514650777;
        ** while (true)
        {
            ** case -1718350116:
        }
lbl123:
        // 1 sources

        ** while (true)
    }

    /*
     * Exception decompiling
     */
    static double grimBudgetUsed() {
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
}

