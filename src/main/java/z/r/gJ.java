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
import z.r.jU;

/*
 * Exception performing whole class analysis.
 */
@Environment(value=EnvType.CLIENT)
public final class gJ
extends Enum<gJ> {
    private static final /* synthetic */ String a;
    public static final /* enum */ gJ b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ gJ[] e;
    public static final /* enum */ gJ f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final int[] U;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    public static final /* enum */ gJ p;
    private static final /* synthetic */ String q;
    public static final /* enum */ gJ r;
    private static final /* synthetic */ String s;
    public static final /* enum */ gJ t;
    private static final /* synthetic */ String u;
    public static final /* enum */ gJ v;
    public static final int T;
    public static final /* enum */ gJ w;
    public static final /* enum */ gJ x;
    private static final /* synthetic */ String y;
    private final jU z;
    private static final /* synthetic */ String A;
    private static final /* synthetic */ String B;
    private final int C;
    public static final /* enum */ gJ D;
    public static final /* enum */ gJ E;
    public static final /* enum */ gJ F;
    private static final /* synthetic */ String G;
    private static final /* synthetic */ String H;
    private static final /* synthetic */ String I;
    private static final /* synthetic */ String J;
    private static final /* synthetic */ String K;
    private static final /* synthetic */ String L;
    public static final /* enum */ gJ M;
    private static final /* synthetic */ String N;
    public static final /* enum */ gJ O;
    private static final /* synthetic */ String P;
    private static final /* synthetic */ String Q;
    public static final /* enum */ gJ R;
    private static final /* synthetic */ String S;

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
     * Unable to fully structure code
     */
    public static gJ[] values() {
        block9: {
            block10: {
                var0 = gJ.T & -908247244 ^ 1864424564;
                var2_1 = 0;
                break block10;
lbl4:
                // 1 sources

                return (gJ[])gJ.e.clone();
lbl6:
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
                        case -833056339: {
                            ** continue;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var2_1 = (var0 | -908247244) ^ -836332546;
                            ** continue;
                            break;
                        }
                        case 568028298: {
                            var1_2 ^= var2_1 ^ -242002746;
                            break block9;
                        }
                        case -79715947: {
                            break;
                        }
                    }
                    ** continue;
                    break;
                }
            }
            var1_2 = (var0 | -908247244) ^ 2128132774;
            var2_1 = (var0 | -908247244) ^ 348282593;
            ** GOTO lbl6
        }
        var2_1 = (var0 | -908247244) ^ 564489945;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static gJ valueOf(String string) {
        int n2 = T & 0x983F4A3E ^ 0x87E2D778;
        int n3 = 0;
        int n4 = (n2 | 0x983F4A3E) ^ 0x5F62FB4A;
        n3 = (n2 | 0x983F4A3E) ^ 0x834249BA;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 135407370: {
                    return Enum.valueOf(gJ.class, string);
                }
                case 482186948: {
                    n3 = (n2 | 0x983F4A3E) ^ 0x1E285991;
                    continue block5;
                }
                case -2116581649: 
            }
            n4 ^= n3 ^ 0x3FBCB98F;
            n3 = (n2 | 0x983F4A3E) ^ 0x97EDF874;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private gJ(jU var3_3, int var4_4) {
        var8_5 = 205366525;
        var5_6 = gJ.T & 205366525 ^ 39101328;
        var7_7 = 0;
        var6_8 = (var5_6 | var8_5) ^ 146384436;
        var6_8 ^= -360028750;
        super(var1_1, var2_2);
        var7_7 = (var5_6 | var8_5) ^ -1718201164;
        if (true) ** GOTO lbl11
        block8: while (true) {
            var7_7 = (var5_6 | var8_5) ^ -2026897971;
lbl11:
            // 2 sources

            block9: while (true) {
                switch (var7_7) {
                    default: {
                        continue block9;
                    }
                    case -1991091664: {
                        this.C = var4_4;
                        var7_7 = (var5_6 | var8_5) ^ -341324228;
                        continue block9;
                    }
                    case -1746144439: {
                        var6_8 ^= var7_7 ^ 424597544;
                        var7_7 = (var5_6 | var8_5) ^ 1531774660;
                        continue block9;
                    }
                    case 1429250361: {
                        this.z = var3_3;
                        var7_7 = (var5_6 | var8_5) ^ 2030935710;
                        continue block9;
                    }
                    case 2003843427: {
                        var6_8 ^= var7_7 ^ 417095108;
                        continue block8;
                    }
                    case -438670911: {
                        var6_8 ^= var7_7 ^ 451280287;
                        var7_7 = (var5_6 | var8_5) ^ -193155913;
                        continue block9;
                    }
                    case -100594870: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public jU severity() {
        var4_1 = -965727239;
        var1_2 = gJ.T & -965727239 ^ 1546887640;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 417423319;
        var3_3 = (var1_2 | var4_1) ^ -691381713;
        if (true) ** GOTO lbl12
        block14: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1180062758;
            if (true) ** GOTO lbl12
            block15: while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1437535305;
lbl12:
                // 3 sources

                block16: while (true) {
                    switch (var3_3) {
                        default: {
                            continue block16;
                        }
                        case 146403798: {
                            var3_3 = (var1_2 | var4_1) ^ 1237294674;
                            continue block16;
                        }
                        case 1268656659: {
                            var2_4 ^= var3_3 ^ 1206577050;
                            continue block14;
                        }
                        case -1748224597: {
                            continue block15;
                        }
                        case -1021367293: {
                            var2_4 ^= var3_3 ^ -1019065029;
                            continue block15;
                        }
                        case 1618404143: {
                            var2_4 ^= var3_3 ^ -790296358;
                            continue block14;
                        }
                        case 1742340131: {
                            var3_3 = (var1_2 | var4_1) ^ 733583775;
                            continue block16;
                        }
                        case -1948473424: {
                            switch (var2_4) {
                                case 1815053327: {
                                    var3_3 = (var1_2 | var4_1) ^ -1779596822;
                                    continue block16;
                                }
                                default: {
                                    var3_3 = (var1_2 | var4_1) ^ 493651962;
                                    continue block16;
                                }
                                case -963447762: 
                            }
                            var3_3 = (var1_2 | var4_1) ^ -1106949930;
                            continue block16;
                        }
                        case -171298202: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return this.z;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public int defaultRgb() {
        int n2 = T & 0xFB8E3D65 ^ 0x8DDD4487;
        int n3 = 0;
        int n4 = (n2 | 0xFB8E3D65) ^ 0x368FABEE;
        n3 = (n2 | 0xFB8E3D65) ^ 0x2B54D5A9;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -729044914: {
                    n3 = (n2 | 0xFB8E3D65) ^ 0x565BC9E6;
                    continue block5;
                }
                case -1450920959: {
                    n4 ^= n3 ^ 0x87E595B6;
                    n3 = (n2 | 0xFB8E3D65) ^ 0x2597CC6C;
                    continue block5;
                }
                case -632770165: 
            }
            break;
        }
        return this.C;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean dangerous() {
        var4_1 = 145178752;
        var1_2 = gJ.T & 145178752 ^ -632496594;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 666541749;
        var3_3 = (var1_2 | var4_1) ^ -1727250621;
        block11: while (true) {
            switch (var3_3) {
                case -1185522031: {
                    ** break;
                }
                case -247743706: {
                    if (this.z != jU.h) ** GOTO lbl40
                    ** GOTO lbl-1000
                }
                case 1331828538: {
                    v0 = false;
                    ** GOTO lbl25
                }
                case 612151219: {
                    if (this.z == jU.a) lbl-1000:
                    // 2 sources

                    {
                        var3_3 = (var1_2 | var4_1) ^ 300285683;
                    } else {
                        var3_3 = (var1_2 | var4_1) ^ 1673101375;
                    }
                }
                default: {
                    continue block11;
                }
                case 1878057696: {
                    v0 = true;
lbl25:
                    // 2 sources

                    var2_4 ^= 860237744;
                    return v0;
                }
lbl27:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 735339912;
                continue block11;
                case -888528803: {
                    var2_4 ^= var3_3 ^ -1951667153;
                    var3_3 = (var1_2 | var4_1) ^ -1256244146;
                    continue block11;
                }
                case 1139007981: {
                    var3_3 = (var1_2 | var4_1) ^ 137599936;
                    continue block11;
                }
                case -1545791168: {
                    var2_4 ^= var3_3 ^ -478358222;
                    var3_3 = (var1_2 | var4_1) ^ -1785869932;
                    continue block11;
                }
lbl40:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 2033371118;
                continue block11;
                case -757316242: 
            }
            var2_4 ^= var3_3 ^ -378442350;
            var3_3 = (var1_2 | var4_1) ^ -23891683;
        }
    }

    /*
     * Exception decompiling
     */
    public boolean hardBlock() {
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

    private static int eY(int n2, int n3) {
        int n4 = 1362760097;
        int n5 = 1516868627;
        int n6 = U[n2 ^ ((n5 | n4) ^ 0xAD6EE6A3)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x5B7B836B;
        n6 -= (n5 | n4) ^ 0x5B7BC5A9;
        n6 += (n5 | n4) ^ 0x5B7B2754;
        n6 ^= (n5 | n4) ^ 0x5B7BA95C;
        n6 -= (n5 | n4) ^ 0x5B7B638B;
        n6 ^= (n5 | n4) ^ 0x5B7B14B1;
        n6 += (n5 | n4) ^ 0x5B7BFA00;
        return n6 ^= (n5 | n4) ^ 0x5B7BA6D0;
    }

    /*
     * Exception decompiling
     */
    public String reason() {
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
    private static /* synthetic */ gJ[] eZ() {
        int n2 = 1647896620;
        int n3 = T & 0xA68CDF5E ^ 0x5D30BB64;
        int n4 = 0;
        int n5 = (n3 | 0xA68CDF5E) ^ 0xD809407D;
        n4 = (n3 | 0xA68CDF5E) ^ 0x1FFDB63D;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -1585644649: {
                    n5 ^= n4 ^ 0x16E63B02;
                    n4 = (n3 | 0xA68CDF5E) ^ 0x3B08C80C;
                    continue block5;
                }
                case -994822286: {
                    gJ[] gJArray = new gJ[gJ.eY((n5 | n4 ^ n2) ^ (n4 ^ 0x840EBBBC), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xB7C46FE6)))];
                    gJArray[0] = x;
                    gJArray[1] = p;
                    gJArray[2] = b;
                    gJArray[3] = R;
                    gJArray[4] = D;
                    gJArray[5] = t;
                    gJArray[gJ.eY((int)((n5 | n4 ^ n2) ^ (n4 ^ 0x840EBBBD)), (int)((n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xEA436B37))))] = M;
                    gJArray[gJ.eY((int)((n5 | n4 ^ n2) ^ (n4 ^ 0x840EBBBE)), (int)((n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x30A4383C))))] = w;
                    gJArray[gJ.eY((int)((n5 | n4 ^ n2) ^ (n4 ^ 0x840EBBBF)), (int)((n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x3FF14C85))))] = v;
                    gJArray[gJ.eY((int)((n5 | n4 ^ n2) ^ (n4 ^ 0x840EBBB8)), (int)((n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x46302EC5))))] = r;
                    gJArray[gJ.eY((int)((n5 | n4 ^ n2) ^ (n4 ^ 0x840EBBB9)), (int)((n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x58DE4F5D))))] = E;
                    gJArray[gJ.eY((int)((n5 | n4 ^ n2) ^ (n4 ^ 0x840EBBBA)), (int)((n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x8C5A70D5))))] = F;
                    gJArray[gJ.eY((int)((n5 | n4 ^ n2) ^ (n4 ^ 0x840EBBBB)), (int)((n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x31174C91))))] = f;
                    gJArray[gJ.eY((int)((n5 | n4 ^ n2) ^ (n4 ^ 0x840EBBB4)), (int)((n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xE85B38DF))))] = O;
                    return gJArray;
                }
                case -532592317: 
            }
            n4 = (n3 | 0xA68CDF5E) ^ 0x5EC004E9;
        }
    }
}

