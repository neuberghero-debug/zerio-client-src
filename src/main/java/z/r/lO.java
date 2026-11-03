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
public final class lO
extends Enum<lO> {
    private static final /* synthetic */ String a;
    private static final int[] B;
    public static final /* enum */ lO b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    public static final /* enum */ lO e;
    private static final /* synthetic */ String f;
    public static final /* enum */ lO g;
    public static final /* enum */ lO h;
    private static final /* synthetic */ String i;
    public static final /* enum */ lO j;
    private static final /* synthetic */ lO[] k;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    public static final int A;
    private static final /* synthetic */ String r;
    public static final /* enum */ lO s;
    private final String t;
    public static final /* enum */ lO u;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private static final /* synthetic */ String x;
    private static final /* synthetic */ String y;
    public static final /* enum */ lO z;

    private static int DT(int n2, int n3) {
        int n4 = -1157996402;
        int n5 = -13226337;
        int n6 = B[n2 ^ ((n5 | n4) ^ 0x9E6B5D18)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xFFFEBCA3;
        n6 ^= (n5 | n4) ^ 0xFFFE12AB;
        n6 -= (n5 | n4) ^ 0xFFFEE874;
        n6 ^= (n5 | n4) ^ 0xFFFE7B66;
        n6 -= (n5 | n4) ^ 0xFFFEC315;
        return n6 += (n5 | n4) ^ 0xFFFEAAC9;
    }

    /*
     * Unable to fully structure code
     */
    public static lO[] values() {
        block8: {
            var0 = lO.A & 726749668 ^ -293160446;
            var2_1 = 0;
            break block8;
lbl4:
            // 1 sources

            block5: while (true) {
                switch (var2_1) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
                    case 828260888: {
                        ** GOTO lbl14
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var2_1 = (var0 | 726749668) ^ 1171042841;
                        ** GOTO lbl-1000
                        break;
                    }
lbl14:
                    // 1 sources

                    var2_1 = (var0 | 726749668) ^ 1828377272;
                    ** continue;
                    case -2094192290: {
                        var1_2 ^= var2_1 ^ -472857742;
                        ** continue;
                    }
                    case -1441052161: {
                        return (lO[])lO.k.clone();
                    }
                }
                break;
            }
        }
        var1_2 = (var0 | 726749668) ^ 2010493184;
        var2_1 = (var0 | 726749668) ^ -561399298;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static lO valueOf(String string) {
        int n2 = A & 0x1C5EB094 ^ 0x5E3A6DE4;
        int n3 = 0;
        int n4 = (n2 | 0x1C5EB094) ^ 0x9254AB1C;
        n3 = (n2 | 0x1C5EB094) ^ 0x31635889;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1864213885: {
                    n3 = (n2 | 0x1C5EB094) ^ 0x7CE357E5;
                    continue block5;
                }
                case 580758033: {
                    n4 ^= n3 ^ 0xC07D8AA6;
                    n3 = (n2 | 0x1C5EB094) ^ 0xFC6F80EF;
                    continue block5;
                }
                case -1575912165: 
            }
            break;
        }
        return Enum.valueOf(lO.class, string);
    }

    /*
     * Unable to fully structure code
     */
    private lO(String var3_3) {
        var7_4 = -114291374;
        var4_5 = lO.A & -114291374 ^ 1854737707;
        var6_6 = 0;
        ** GOTO lbl31
lbl5:
        // 1 sources

        while (true) {
            var6_6 = (var4_5 | var7_4) ^ -31154182;
            ** GOTO lbl13
            break;
        }
lbl8:
        // 1 sources

        while (true) {
            super(var1_1, var2_2);
            ** GOTO lbl18
            break;
        }
lbl11:
        // 1 sources

        block8: while (true) {
            var6_6 = (var4_5 | var7_4) ^ 2014281559;
lbl13:
            // 3 sources

            block9: while (true) {
                switch (var6_6) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block9;
                        }
                        break;
                    }
lbl18:
                    // 1 sources

                    var6_6 = (var4_5 | var7_4) ^ 621054585;
                    ** continue;
                    case -2018348500: {
                        return;
                    }
                    case -625375486: {
                        var5_7 ^= var6_6 ^ -402716247;
                        break block8;
                    }
                    case 2138538878: {
                        this.t = var3_3;
                        ** continue;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var5_7 ^= -1096257652;
                        ** continue;
                        break;
                    }
lbl31:
                    // 1 sources

                    var5_7 = (var4_5 | var7_4) ^ 348401027;
                    ** continue;
                }
                break;
            }
            break;
        }
        var6_6 = (var4_5 | var7_4) ^ -2134209019;
        ** while (true)
        {
            ** case 26841729:
        }
lbl36:
        // 1 sources

        var5_7 ^= var6_6 ^ 784625692;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public String jsonKey() {
        block10: {
            break block10;
            {
                var3_2 = (var1_1 | -758113517) ^ 76021744;
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
                        case 327460656: {
                            var2_3 ^= var3_2 ^ -1051536378;
                            continue block5;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | -758113517) ^ -1171943364;
                            ** GOTO lbl-1000
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | -758113517) ^ -512362385;
                            ** continue;
                            break;
                        }
                        case 1221906275: {
                            ** continue;
                        }
                        case -159997777: 
                    }
                    break;
                }
            }
            return this.t;
        }
        var1_1 = lO.A & -758113517 ^ -228503985;
        var3_2 = 0;
        var2_3 = (var1_1 | -758113517) ^ 1620618918;
        ** while (true)
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
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ lO[] DU() {
        int n2 = 1329949685;
        int n3 = A & 0x54AC06E3 ^ 0xC021760B;
        int n4 = 0;
        int n5 = (n3 | 0x54AC06E3) ^ 0x3176C653;
        n4 = (n3 | 0x54AC06E3) ^ 0x6CC059A;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case 468282646: {
                    lO[] lOArray = new lO[lO.DT((n5 | n4 ^ n2) ^ (n4 ^ 0xA7C0C96A), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xE83188E6)))];
                    lOArray[0] = g;
                    lOArray[1] = s;
                    lOArray[2] = j;
                    lOArray[3] = b;
                    lOArray[4] = z;
                    lOArray[5] = h;
                    lOArray[lO.DT((int)((n5 | n4 ^ n2) ^ (n4 ^ 0xA7C0C96B)), (int)((n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xC49C5945))))] = e;
                    lOArray[lO.DT((int)((n5 | n4 ^ n2) ^ (n4 ^ 0xA7C0C968)), (int)((n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x812AFA5B))))] = u;
                    return lOArray;
                }
                case -765365391: {
                    n4 = (n3 | 0x54AC06E3) ^ 0xC6C3572A;
                    continue block5;
                }
                case 309207489: 
            }
            n5 ^= n4 ^ 0x2EA50643;
            n4 = (n3 | 0x54AC06E3) ^ 0xCF441BFD;
        }
    }
}

