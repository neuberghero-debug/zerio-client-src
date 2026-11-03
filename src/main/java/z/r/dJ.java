/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2382
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 *  net.minecraft.class_638
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import z.r.ak;
import z.r.cb;
import z.r.dz;
import z.r.eA;
import z.r.eI;
import z.r.ey;
import z.r.gJ;
import z.r.gt;
import z.r.hq;
import z.r.jQ;
import z.r.jR;
import z.r.jg;
import z.r.mB;
import z.r.mD;
import z.r.me;
import z.r.mf;
import z.r.mj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class dJ {
    private me a;
    private static final /* synthetic */ String a;
    private static final int a;
    private static final /* synthetic */ String b;
    private static final int[] a;
    private static final /* synthetic */ String c;
    private int b;
    private class_243 a;
    private boolean a;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private final jQ a;
    private static final /* synthetic */ String f;
    private cb a;
    private mf a;
    private String g;
    private static final int c;
    private static final int d;
    private final List<class_2338> a;
    private int e;
    private final List<class_2338> b;
    private static final /* synthetic */ String h;
    private int f;
    private static final /* synthetic */ String i;
    private int g;
    private static final int h;
    private static final int i;
    public static final int q;
    private int j;
    private static final /* synthetic */ String j;
    private boolean b;
    private static final /* synthetic */ String k;
    private int k;
    private static final /* synthetic */ String l;
    private int l;
    private final ak a;
    private static final int m;
    private final jR a;
    private final ey a;
    private final Random a;
    private final Map<Long, Long> a;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private String o;
    private class_2350 a;
    private boolean c;
    private static final /* synthetic */ String p;
    private static final int n;
    private static final /* synthetic */ String q;
    private gt a;
    private final eI a;
    private int o;
    private final dz a;
    private static final int p;
    private mB a;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String s;

    /*
     * Exception decompiling
     */
    public dJ(ak var1_1, jQ var2_2, eI var3_3, jR var4_4, dz var5_5, ey var6_6) {
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
    public boolean idle() {
        block16: {
            block15: {
                block14: {
                    var4_1 = -266869149;
                    var1_2 = dJ.q & -266869149 ^ -2047642337;
                    var3_3 = 0;
                    ** GOTO lbl22
lbl5:
                    // 2 sources

                    while (true) {
                        var2_4 ^= -473036606;
                        ** GOTO lbl21
                        break;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -1323446737;
                        break block14;
                        break;
                    }
                    block11: while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -977775260;
lbl13:
                        // 7 sources

                        block12: while (true) {
                            switch (var3_3) {
                                default: {
                                    continue block12;
                                }
                                case -610144465: {
                                    break block11;
                                }
                                case -790942252: {
                                    ** continue;
                                }
lbl21:
                                // 1 sources

                                return v0;
lbl22:
                                // 1 sources

                                var2_4 = (var1_2 | var4_1) ^ -1204208927;
                                break block15;
                            }
                            break;
                        }
                        break;
                    }
                    var3_3 = (var1_2 | var4_1) ^ 623696555;
                    ** GOTO lbl13
                    {
                        case -169266118: {
                            if (this.a != mf.d) ** continue;
                            break;
                        }
                        case 810525211: {
                            var2_4 ^= var3_3 ^ -980893765;
                            break block16;
                        }
                        case 800516255: {
                            v0 = true;
                            ** GOTO lbl5
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ -507176297;
                    ** GOTO lbl13
                }
                var3_3 = (var1_2 | var4_1) ^ 2016069;
                ** GOTO lbl13
            }
            var3_3 = (var1_2 | var4_1) ^ 777394256;
            ** GOTO lbl13
lbl43:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -633266208;
                ** GOTO lbl13
                break;
            }
            {
                case 1379427969: {
                    v0 = false;
                    ** continue;
                }
                ** case 338882024:
            }
lbl50:
            // 1 sources

            var2_4 ^= var3_3 ^ -503975864;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ -1479568898;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public String failure() {
        block9: {
            break block9;
lbl1:
            // 1 sources

            while (true) {
                var3_2 = (var1_1 | -1225622889) ^ -109154824;
                ** GOTO lbl10
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                block10: {
                    var3_2 = (var1_1 | -1225622889) ^ 2017965547;
                    break block10;
lbl7:
                    // 1 sources

                    while (true) {
                        var2_3 ^= var3_2 ^ -1237573737;
                        ** continue;
                        break;
                    }
                }
                block8: while (true) {
                    switch (var3_2) {
                        default: {
                            continue block8;
                        }
                        case -1883976172: {
                            break;
                        }
                        case 1139824036: {
                            ** continue;
                        }
                    }
                    var3_2 = (var1_1 | -1225622889) ^ -1274859941;
                }
                {
                    ** case 244127239:
                }
lbl22:
                // 1 sources

                return this.g;
            }
        }
        var1_1 = dJ.q & -1225622889 ^ 1393643899;
        var3_2 = 0;
        var2_3 = (var1_1 | -1225622889) ^ 1760251887;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public String status() {
        int n2 = q & 0x8D75EE82 ^ 0xD3467B6F;
        int n3 = 0;
        int n4 = (n2 | 0x8D75EE82) ^ 0xF149405E;
        n3 = (n2 | 0x8D75EE82) ^ 0xCC611FE7;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -366706803: {
                    return this.o;
                }
                case -762417888: {
                    n4 ^= n3 ^ 0xBCC25B7F;
                    break;
                }
                case 320266248: {
                    n3 = (n2 | 0x8D75EE82) ^ 0xDF992CF;
                    continue block5;
                }
            }
            n3 = (n2 | 0x8D75EE82) ^ 0x35538062;
        }
    }

    /*
     * Unable to fully structure code
     */
    public class_2338 activeTarget() {
        block23: {
            block24: {
                block25: {
                    block22: {
                        break block25;
lbl1:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 37607895;
                            break block22;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1136633879;
                            break block23;
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1130131073;
                            break block23;
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            if (this.a != null) break block24;
                            ** continue;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1016361905;
                            break block23;
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1756229728;
                    break block23;
lbl19:
                    // 1 sources

                    while (true) {
                        v0 = this.a.target();
                        ** GOTO lbl44
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1945835945;
                        break block23;
                        break;
                    }
                }
                var4_1 = 1371942809;
                var1_2 = dJ.q & 1371942809 ^ -203893964;
                var3_3 = 0;
                var2_4 = (var1_2 | var4_1) ^ 1652125566;
                ** while (true)
lbl31:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -624569945;
                    break block23;
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 640773143;
            break block23;
lbl37:
            // 1 sources

            return v0;
lbl39:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ -788992487;
                ** continue;
                break;
            }
lbl42:
            // 1 sources

            while (true) {
                v0 = null;
lbl44:
                // 2 sources

                var2_4 ^= -941016212;
                ** continue;
                break;
            }
lbl46:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ -1250547175;
                ** continue;
                break;
            }
        }
        block21: while (true) {
            switch (var3_3) {
                default: {
                    continue block21;
                }
                case -2144999916: {
                    ** continue;
                }
                case 1333620418: {
                    ** continue;
                }
                case -1686958115: {
                    ** continue;
                }
                case 689647130: {
                    ** continue;
                }
                case -705719382: {
                    ** continue;
                }
                case 817198066: {
                    ** continue;
                }
                ** case -1335797846:
lbl67:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public class_2338 pickaxeTarget() {
        block26: {
            block29: {
                block27: {
                    block28: {
                        break block29;
lbl1:
                        // 1 sources

                        while (true) {
                            v0 = this.a.target();
                            ** GOTO lbl40
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 66161482;
                            ** GOTO lbl19
lbl7:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -2081829793;
                                ** GOTO lbl19
                                break;
                            }
                            break;
                        }
lbl10:
                        // 1 sources

                        block16: while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 865993249;
                            ** GOTO lbl19
lbl13:
                            // 1 sources

                            while (true) {
                                block30: {
                                    var3_3 = (var1_2 | var4_1) ^ -402208592;
                                    break block30;
lbl16:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ 2096068671;
                                        ** GOTO lbl43
                                        break;
                                    }
                                }
lbl20:
                                // 5 sources

                                block19: while (true) {
                                    switch (var3_3) lbl-1000:
                                    // 4 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block19;
                                            }
                                            break;
                                        }
                                        case 120466577: {
                                            ** continue;
                                        }
                                        case 621491663: {
                                            ** continue;
                                        }
                                        case 927049210: {
                                            ** continue;
                                        }
lbl31:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 1623741660;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl34:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 1809421188;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case -2026476668: {
                                            if (this.a.drill()) break block16;
                                            ** continue;
                                        }
lbl40:
                                        // 2 sources

                                        while (true) {
                                            var2_4 ^= 2115835756;
                                            break block26;
                                            break;
                                        }
lbl43:
                                        // 1 sources

                                        var3_3 = (var1_2 | var4_1) ^ 567579156;
                                        ** continue;
                                        case -321294485: {
                                            var2_4 ^= var3_3 ^ 659171656;
                                            break block27;
                                        }
                                        case 1862677599: {
                                            break block28;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
lbl50:
                        // 3 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1146976327;
                            ** GOTO lbl20
                            break;
                        }
                        {
                            case 219194454: {
                                ** continue;
                            }
                        }
lbl55:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 164561805;
                            ** GOTO lbl20
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1886588133;
                    ** GOTO lbl20
                    {
                        case -528626120: {
                            if (this.a == null) break;
                            ** continue;
                        }
                        case 1957473086: {
                            if (this.a != mf.d) ** break;
                            ** continue;
                            ** continue;
                        }
                        case -1082318750: {
                            var2_4 ^= var3_3 ^ -187433561;
                            ** continue;
                        }
                        ** case 1679291143:
                    }
lbl72:
                    // 1 sources

                    v0 = null;
                    ** while (true)
                }
                var3_3 = (var1_2 | var4_1) ^ -459118109;
                ** while (true)
            }
            var4_1 = 12855241;
            var1_2 = dJ.q & 12855241 ^ 81764690;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ 755422854;
            ** while (true)
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    public hq taskTool() {
        block36: {
            block37: {
                block38: {
                    break block38;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1323174748;
                        break block36;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 982974632;
                        break block36;
                        break;
                    }
lbl7:
                    // 2 sources

                    while (true) {
                        var2_4 ^= 666663436;
                        break block37;
                        break;
                    }
                }
                var4_1 = -584824132;
                var1_2 = dJ.q & -584824132 ^ 1398886876;
                var3_3 = 0;
                var2_4 = (var1_2 | var4_1) ^ 880341563;
                ** GOTO lbl41
lbl16:
                // 1 sources

                while (true) {
                    v0 = this.a.tool();
                    ** GOTO lbl7
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -1868701947;
                    ** GOTO lbl25
                    break;
                }
lbl22:
                // 1 sources

                block23: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -290976063;
                    break block36;
lbl25:
                    // 2 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 2019080527;
                        break block36;
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        switch (var2_4) {
                            case 2118789250: {
                                ** continue;
                            }
lbl32:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 400384769;
                                break block23;
                                break;
                            }
lbl35:
                            // 1 sources

                            while (true) {
                                v0 = hq.b;
                                ** continue;
                                break;
                            }
                            default: {
                                var3_3 = (var1_2 | var4_1) ^ 896092230;
                                break block23;
                            }
lbl41:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ 1024330034;
                            break block23;
                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -989359014;
                                break block23;
lbl46:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 825698175;
                                    ** continue;
                                    break;
                                }
lbl49:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 1514427685;
                                    ** continue;
                                    break;
                                }
lbl52:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -1135640758;
                                    ** continue;
                                    break;
                                }
lbl55:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 1851614031;
                                    break block23;
lbl58:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 955669524;
                                        break block23;
                                        break;
                                    }
lbl61:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ -626468217;
                                        ** GOTO lbl100
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            case 1035569488: {
                                var3_3 = (var1_2 | var4_1) ^ -371903467;
                                break block23;
                            }
                        }
                        break;
                    }
                    break;
                }
                break block36;
            }
            return v0;
        }
        block35: while (true) {
            switch (var3_3) {
                default: {
                    continue block35;
                }
                case 1849995096: {
                    ** continue;
                }
                case 917532649: {
                    ** continue;
                }
                case -933607952: {
                    ** continue;
                }
                case -1321715533: {
                    ** continue;
                }
                case 835540285: {
                    break;
                }
                case -409794584: {
                    ** continue;
                }
                case -368307270: {
                    ** continue;
                }
                case -496282930: {
                    ** continue;
                }
                case 442683302: {
                    ** continue;
                }
                case -437101740: {
                    ** continue;
                }
                case -1489116493: {
                    ** continue;
                }
                case -927450883: {
                    if (this.a != null) ** continue;
                    ** continue;
                }
            }
lbl100:
            // 2 sources

            var3_3 = (var1_2 | var4_1) ^ 390012428;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public mD taskToolProblem(jQ jQ2) {
        int n2 = q & 0x7261AD83 ^ 0x4F42184;
        int n3 = 0;
        int n4 = (n2 | 0x7261AD83) ^ 0x395C26FA;
        n3 = (n2 | 0x7261AD83) ^ 0x3F0630C4;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1658155178: {
                    return jQ2.problem(this.taskTool());
                }
                case 1240702275: {
                    n3 = (n2 | 0x7261AD83) ^ 0x776C424;
                    continue block5;
                }
                case 1904437667: 
            }
            n4 ^= n3 ^ 0xBB52B4DC;
            n3 = (n2 | 0x7261AD83) ^ 0x1420DD2D;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public cb lastObservation() {
        int n2 = q & 0x56E86FB ^ 0x308C14B2;
        int n3 = 0;
        int n4 = (n2 | 0x56E86FB) ^ 0x6FB4A129;
        n3 = (n2 | 0x56E86FB) ^ 0xFC63C186;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 22474286: {
                    n4 ^= n3 ^ 0x93CF6E8D;
                    n3 = (n2 | 0x56E86FB) ^ 0x3E309802;
                    continue block5;
                }
                case 199102201: {
                    return this.a;
                }
                case -913483907: 
            }
            n3 = (n2 | 0x56E86FB) ^ 0x34B878D5;
        }
    }

    /*
     * Unable to fully structure code
     */
    public List<class_2338> leftovers() {
        var1_1 = dJ.q & -2028132824 ^ -164988948;
        var3_2 = 0;
        var2_3 = (var1_1 | -2028132824) ^ -971756507;
        ** GOTO lbl12
lbl5:
        // 1 sources

        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
                case 984591630: {
                    break block5;
                }
lbl12:
                // 1 sources

                var3_2 = (var1_1 | -2028132824) ^ -846144798;
                ** GOTO lbl-1000
                case -478232865: {
                    return List.copyOf(this.a);
                }
lbl16:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -2028132824) ^ 339855667;
                    ** continue;
                    break;
                }
                case 266031156: {
                    var2_3 ^= var3_2 ^ -545600100;
                    ** continue;
                }
            }
            break;
        }
        var3_2 = (var1_1 | -2028132824) ^ -119265320;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean breaking() {
        block20: {
            block21: {
                block22: {
                    var4_1 = -1325703646;
                    var1_2 = dJ.q & -1325703646 ^ -1966814787;
                    var3_3 = 0;
                    ** GOTO lbl16
lbl5:
                    // 1 sources

                    return v0;
lbl7:
                    // 6 sources

                    block12: while (true) {
                        switch (var3_3) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                default: {
                                    continue block12;
                                }
                                break;
                            }
                            case -522235186: {
                                if (this.a) {
                                    break;
                                }
                                break block20;
                            }
lbl16:
                            // 1 sources

                            var2_4 = (var1_2 | var4_1) ^ 1862620202;
                            break block21;
                            case -777668031: {
                                v0 = true;
                                break block22;
                            }
                            case -1370327709: {
                                v0 = false;
                                break block22;
                            }
lbl24:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1801086462;
                                ** GOTO lbl-1000
                                break;
                            }
lbl27:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1915581428;
                                ** GOTO lbl-1000
                                break;
                            }
lbl30:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1946401971;
                                ** continue;
                                break;
                            }
                            case -355761937: {
                                var2_4 ^= var3_3 ^ 562986066;
                                break block12;
                            }
                            case -1155038539: {
                                var2_4 ^= var3_3 ^ 1432837584;
                                break;
                            }
                        }
                        break;
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1512082801;
                    ** GOTO lbl7
                }
                var2_4 ^= -1344958428;
                ** while (true)
            }
            var3_3 = (var1_2 | var4_1) ^ 1759095047;
            ** GOTO lbl7
            {
                case 1470634508: {
                    ** continue;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 346925788;
            ** GOTO lbl7
lbl51:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1345609552;
                ** GOTO lbl7
                break;
            }
            {
                case -925717429: {
                    if (this.a == mf.f) {
                        ** continue;
                    }
                    break block20;
                }
                case -769231176: {
                    ** continue;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -313014861;
            ** GOTO lbl7
        }
        var3_3 = (var1_2 | var4_1) ^ 30956810;
        ** while (true)
        {
            ** case -822320372:
        }
lbl66:
        // 1 sources

        var2_4 ^= var3_3 ^ 549239913;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean actionUnresolved() {
        var4_1 = 2091745396;
        var1_2 = dJ.q & 2091745396 ^ -1121736724;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -496359931;
        var3_3 = (var1_2 | var4_1) ^ 276466055;
        if (true) ** GOTO lbl9
        block11: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1372123150;
lbl9:
            // 2 sources

            block12: while (true) {
                switch (var3_3) {
                    case -863650840: {
                        v0 = true;
                        ** GOTO lbl40
                    }
                    case -66997414: {
                        var2_4 ^= var3_3 ^ -1451667791;
                        var3_3 = (var1_2 | var4_1) ^ 824843284;
                        continue block12;
                    }
                    case -24122469: {
                        ** break;
                    }
                    case -1541151529: {
                        if (this.a == mf.k) {
                            ** break;
                        }
                        ** GOTO lbl44
                    }
                    case -742712627: {
                        if (this.a != mf.l) {
                            var3_3 = (var1_2 | var4_1) ^ 52448359;
                            continue block12;
                        }
                        ** GOTO lbl32
                    }
                    case -304796037: {
                        var3_3 = (var1_2 | var4_1) ^ -394014416;
                        continue block12;
                    }
lbl32:
                    // 2 sources

                    var3_3 = (var1_2 | var4_1) ^ 28185766;
                    default: {
                        continue block12;
                    }
                    case 370626514: {
                        var2_4 ^= var3_3 ^ 1131393593;
                        continue block11;
                    }
                    case 1402513422: {
                        v0 = false;
lbl40:
                        // 2 sources

                        var2_4 ^= -949119755;
                        return v0;
                    }
lbl42:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1502364459;
                    continue block12;
lbl44:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -340203474;
                    continue block12;
                    case 355235532: 
                }
                var2_4 ^= var3_3 ^ -1107946549;
                var3_3 = (var1_2 | var4_1) ^ 773111089;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void begin(mB var1_1, long var2_2) {
        block45: {
            block47: {
                block48: {
                    var7_3 = 1321657113;
                    var4_4 = dJ.q & 1321657113 ^ 303010309;
                    var6_5 = 0;
                    ** GOTO lbl95
lbl5:
                    // 1 sources

                    while (true) {
                        var6_5 = (var4_4 | var7_3) ^ -726882171;
                        break block45;
                        break;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        block46: {
                            var6_5 = (var4_4 | var7_3) ^ 582477401;
                            break block45;
lbl11:
                            // 1 sources

                            while (true) {
                                var5_6 ^= var6_5 ^ -882061937;
                                break block46;
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var6_5 = (var4_4 | var7_3) ^ -685892080;
                                break block45;
                                break;
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                var6_5 = (var4_4 | var7_3) ^ -739898967;
                                break block45;
lbl20:
                                // 1 sources

                                while (true) {
                                    var5_6 ^= var6_5 ^ -1397156564;
                                    break block47;
                                    break;
                                }
lbl23:
                                // 1 sources

                                while (true) {
                                    var6_5 = (var4_4 | var7_3) ^ 1692263058;
                                    break block45;
lbl26:
                                    // 1 sources

                                    while (true) {
                                        var5_6 ^= var6_5 ^ -2046326749;
                                        ** GOTO lbl93
                                        break;
                                    }
lbl29:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        var6_5 = (var4_4 | var7_3) ^ -170803220;
                        break block45;
lbl34:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var6_5 = (var4_4 | var7_3) ^ 935371650;
                        break block45;
lbl39:
                        // 1 sources

                        while (true) {
                            var5_6 ^= var6_5 ^ -931697961;
                            ** GOTO lbl91
                            break;
                        }
lbl42:
                        // 1 sources

                        while (true) {
                            var5_6 ^= var6_5 ^ -1637640064;
                            ** continue;
                            break;
                        }
                        break;
                    }
                    this.c = false;
                    var6_5 = (var4_4 | var7_3) ^ -138858078;
                    break block45;
lbl48:
                    // 1 sources

                    while (true) {
                        var5_6 ^= var6_5 ^ 1276391425;
                        break block48;
                        break;
                    }
lbl51:
                    // 1 sources

                    while (true) {
                        this.g = "";
                        ** GOTO lbl102
                        break;
                    }
lbl54:
                    // 1 sources

                    while (true) {
                        var6_5 = (var4_4 | var7_3) ^ 1733265862;
                        break block45;
                        break;
                    }
                }
                var6_5 = (var4_4 | var7_3) ^ -1471673969;
                break block45;
            }
            var6_5 = (var4_4 | var7_3) ^ -1870755408;
        }
lbl63:
        // 5 sources

        block39: while (true) {
            switch (var6_5) lbl-1000:
            // 7 sources

            {
                while (true) {
                    default: {
                        continue block39;
                    }
                    break;
                }
                case -1351802090: {
                    ** continue;
                }
                case -13956528: {
                    ** continue;
                }
                case -1926628684: {
                    ** continue;
                }
                case -81679034: {
                    ** continue;
                }
                case 69979563: {
                    ** continue;
                }
                case -1973199976: {
                    ** continue;
                }
                case -1860740247: {
                    ** continue;
                }
                case 1060704488: {
                    ** continue;
                }
                case -835028098: {
                    ** continue;
                }
                case 1762611359: {
                    ** continue;
                }
                case 2088244548: {
                    this.a.setSeed(var2_2 ^ var1_1.target().method_10063());
                    break block39;
                }
lbl91:
                // 1 sources

                var6_5 = (var4_4 | var7_3) ^ -444515036;
                ** GOTO lbl-1000
lbl93:
                // 1 sources

                var6_5 = (var4_4 | var7_3) ^ -1862956957;
                ** GOTO lbl-1000
lbl95:
                // 1 sources

                var5_6 = (var4_4 | var7_3) ^ 2078733581;
                ** continue;
                case -1982730995: {
                    return;
                }
lbl99:
                // 1 sources

                while (true) {
                    var6_5 = (var4_4 | var7_3) ^ 1643570165;
                    ** GOTO lbl-1000
                    break;
                }
lbl102:
                // 1 sources

                var6_5 = (var4_4 | var7_3) ^ 98935067;
                ** GOTO lbl-1000
lbl104:
                // 1 sources

                while (true) {
                    var6_5 = (var4_4 | var7_3) ^ -1511104933;
                    ** GOTO lbl-1000
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_5 = (var4_4 | var7_3) ^ 1512604212;
                    ** continue;
                    break;
                }
                case -827229523: {
                    this.nl();
                    ** continue;
                }
            }
            break;
        }
        var6_5 = (var4_4 | var7_3) ^ -1578829491;
        ** GOTO lbl63
        {
            case 1529500166: {
                var5_6 ^= var6_5 ^ 251488979;
                ** continue;
            }
        }
lbl118:
        // 1 sources

        while (true) {
            var6_5 = (var4_4 | var7_3) ^ 1524907702;
            ** GOTO lbl63
            break;
        }
        {
            case -158860654: {
                this.a = mf.j;
                break;
            }
            case -1424077583: {
                this.a = me.b;
                ** continue;
            }
        }
        var6_5 = (var4_4 | var7_3) ^ -240988149;
        ** GOTO lbl63
        {
            case 964721371: {
                var5_6 ^= var6_5 ^ -197938404;
                ** continue;
            }
            case 82276649: {
                this.j = 0;
                ** continue;
            }
            case -1451834689: {
                var5_6 ^= var6_5 ^ 1363072952;
                ** continue;
            }
        }
        this.o = "starting " + var1_1.purpose();
        var6_5 = (var4_4 | var7_3) ^ -807884684;
        ** while (true)
        {
            case 974262671: {
                var5_6 ^= var6_5 ^ -179032253;
                ** continue;
            }
            ** case -1152463303:
        }
lbl145:
        // 1 sources

        this.a = var1_1;
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
     * Exception decompiling
     */
    public void retarget(mB var1_1, long var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [79[UNCONDITIONALDOLOOP]], but top level block is 0[SWITCH]
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
    private void nl() {
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
     * Enabled aggressive block sorting
     */
    public void abort(class_310 var1_1, String var2_2) {
        var6_3 = 2096644102;
        var3_4 = dJ.q & 2096644102 ^ -1354544461;
        var5_5 = 0;
        var4_6 = (var3_4 | var6_3) ^ -1729712782;
        var5_5 = (var3_4 | var6_3) ^ 806021227;
        if (true) ** GOTO lbl15
        block19: while (true) {
            var5_5 = (var3_4 | var6_3) ^ -257863356;
            ** GOTO lbl15
lbl10:
            // 1 sources

            while (true) {
                var5_5 = (var3_4 | var6_3) ^ 454555250;
                if (true) ** GOTO lbl15
                break;
            }
            block21: while (true) {
                var5_5 = (var3_4 | var6_3) ^ 590995178;
lbl15:
                // 4 sources

                block22: while (true) {
                    block26: {
                        block27: {
                            switch (var5_5) {
                                case -1961758415: {
                                    this.a = mf.d;
                                    var5_5 = (var3_4 | var6_3) ^ 1262635581;
                                    continue block22;
                                }
                                case -591227811: {
                                    var4_6 ^= var5_5 ^ -2112581243;
                                    ** break;
                                }
                                case -454247227: {
                                    this.o = "aborted: " + var2_2;
                                    ** GOTO lbl-1000
                                }
                                case -991050349: {
                                    this.g = var2_2;
                                    var5_5 = (var3_4 | var6_3) ^ 1128321388;
                                    ** GOTO lbl55
                                }
                                case 1635032634: {
                                    return;
                                }
                                case -1425513014: {
                                    var4_6 ^= var5_5 ^ 685460711;
                                    ** GOTO lbl57
                                }
                                case -1262944118: {
                                    var4_6 ^= var5_5 ^ -2071617363;
                                    ** continue;
                                }
lbl39:
                                // 1 sources

                                var5_5 = (var3_4 | var6_3) ^ 203212613;
                                continue block22;
                                case 1436734335: {
                                    var4_6 ^= var5_5 ^ 1255135833;
                                    ** GOTO lbl76
                                }
                                case -202928654: {
                                    this.a.release(this);
                                    break block26;
                                }
                                case -1128555557: {
                                    var4_6 ^= var5_5 ^ 88439867;
                                    break block27;
                                }
                                case -568408516: {
                                    if (this.a == mf.d) lbl-1000:
                                    // 2 sources

                                    {
                                        var5_5 = (var3_4 | var6_3) ^ -1436968504;
                                    } else {
                                        var5_5 = (var3_4 | var6_3) ^ -269188407;
                                    }
                                }
lbl55:
                                // 7 sources

                                default: {
                                    continue block22;
                                }
lbl57:
                                // 1 sources

                                var5_5 = (var3_4 | var6_3) ^ 568691851;
                                continue block22;
                                case -1129792494: {
                                    this.nm(var1_1);
                                    continue block21;
                                }
                                case 257563635: {
                                    var4_6 ^= var5_5 ^ 234867193;
                                    var5_5 = (var3_4 | var6_3) ^ 1961540486;
                                    ** GOTO lbl55
                                }
                                case 269469822: {
                                    var4_6 ^= var5_5 ^ -1687659085;
                                    var5_5 = (var3_4 | var6_3) ^ 991334180;
                                    ** GOTO lbl55
                                }
                                case 447459526: {
                                    this.a = me.d;
                                    continue block19;
                                }
                                case -806247716: {
                                    var5_5 = (var3_4 | var6_3) ^ -72711059;
                                    ** GOTO lbl55
                                }
lbl76:
                                // 1 sources

                                var5_5 = (var3_4 | var6_3) ^ -1634741107;
                                continue block22;
                                case 72470234: 
                            }
                            var4_6 ^= var5_5 ^ 2089315177;
                            var5_5 = (var3_4 | var6_3) ^ 1129576101;
                            continue;
                        }
                        var5_5 = (var3_4 | var6_3) ^ -447677839;
                        continue;
                    }
                    var5_5 = (var3_4 | var6_3) ^ 1425223549;
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public void reset(class_310 var1_1) {
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
    public void releaseAim() {
        int n2 = 239951105;
        int n3 = q & 0xE4D5D01 ^ 0x1D4B3FA8;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x8E94023B;
        n4 = (n3 | n2) ^ 0xCDC7D342;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1200316899: {
                    return;
                }
                case 196333360: {
                    n5 ^= n4 ^ 0xE4D6AF9A;
                    n4 = (n3 | n2) ^ 0x4E7FDE46;
                    continue block7;
                }
                case -1394524702: {
                    n5 ^= n4 ^ 0x699A2154;
                    n4 = (n3 | n2) ^ 0xA73BE1B4;
                    continue block7;
                }
                case 1362141679: {
                    this.a.release(this);
                    n4 = (n3 | n2) ^ 0xB3AE424B;
                    continue block7;
                }
                case -762794773: 
            }
            n4 = (n3 | n2) ^ 0x14FCB099;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void nm(class_310 var1_1) {
        block26: {
            block24: {
                block25: {
                    break block25;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ -1779015716;
                        break block24;
                        break;
                    }
                }
                var5_2 = -1255247763;
                var2_3 = dJ.q & -1255247763 ^ 571961121;
                var4_4 = 0;
                break block26;
lbl9:
                // 3 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -2006980660;
                    ** GOTO lbl24
                    break;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ -1918884271;
            if (true) ** GOTO lbl24
            block15: while (true) {
                block27: {
                    var4_4 = (var2_3 | var5_2) ^ 47547005;
                    break block27;
lbl18:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ 365071296;
                        ** GOTO lbl44
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        if (!this.a) ** GOTO lbl9
                        ** GOTO lbl68
                        break;
                    }
                }
lbl25:
                // 3 sources

                block18: while (true) {
                    switch (var4_4) lbl-1000:
                    // 7 sources

                    {
                        while (true) {
                            default: {
                                continue block18;
                            }
                            break;
                        }
                        case 1063295137: {
                            ** continue;
                        }
                        case 1644532499: {
                            ** continue;
                        }
                        case -1032569181: {
                            break block15;
                        }
                        case -538778343: {
                            ** continue;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -717558658;
                            ** GOTO lbl-1000
                            break;
                        }
lbl41:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -886250059;
                            ** GOTO lbl-1000
                            break;
                        }
lbl44:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ -324795473;
                        ** GOTO lbl-1000
                        case 983521596: {
                            this.a = false;
                            ** continue;
                        }
                        case 1123982786: {
                            ** continue;
                        }
lbl51:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1599322829;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -845696567: {
                            if (var1_1.field_1761 == null) ** GOTO lbl9
                            continue block15;
                        }
                        case 395524702: {
                            var1_1.field_1761.method_2925();
                            ** continue;
                        }
lbl60:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1759353460;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -1242890992: {
                            ** continue;
                        }
                        case 2081659608: {
                            var3_5 ^= var4_4 ^ 465782108;
                            ** continue;
                        }
lbl68:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ 1967866318;
                        ** continue;
                        case 1536916674: {
                            return;
                        }
                    }
                    break;
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ 2057883300;
            ** GOTO lbl25
        }
        var3_5 = (var2_3 | var5_2) ^ 331235964;
        var4_4 = (var2_3 | var5_2) ^ -171842897;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public me tick(class_310 var1_1) {
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
    public void tickReappearWatch(class_310 var1_1, long var2_2) {
        block29: {
            var7_3 = -605286216;
            var4_4 = dJ.q & -605286216 ^ -104827962;
            var6_5 = 0;
            ** GOTO lbl75
lbl5:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ -1647041920;
                ** GOTO lbl45
                break;
            }
lbl8:
            // 2 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ -1764151644;
                ** GOTO lbl45
                break;
            }
lbl11:
            // 1 sources

            return;
lbl13:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ 1977453024;
                ** GOTO lbl45
                break;
            }
lbl16:
            // 1 sources

            while (true) {
                var5_6 ^= var6_5 ^ 1090566519;
                ** continue;
                break;
            }
lbl19:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ 1622894002;
                ** GOTO lbl45
                while (true) {
                    var6_5 = (var4_4 | var7_3) ^ -329362255;
                    if (true) ** GOTO lbl45
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    if (var1_1.field_1687 != null) ** continue;
                    ** GOTO lbl8
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    this.a.entrySet().removeIf((Predicate<Map.Entry>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, nF(long net.minecraft.class_310 java.util.Map$Entry ), (Ljava/util/Map$Entry;)Z)((dJ)this, (long)var2_2, (class_310)var1_1));
                    ** continue;
                    break;
                }
                break;
            }
            block22: while (true) {
                block30: {
                    var6_5 = (var4_4 | var7_3) ^ -1445586424;
                    break block30;
lbl35:
                    // 1 sources

                    while (true) {
                        var5_6 ^= var6_5 ^ -657016821;
                        break block22;
                        break;
                    }
lbl38:
                    // 1 sources

                    while (true) {
                        var5_6 ^= var6_5 ^ -1411976602;
                        ** GOTO lbl66
                        break;
                    }
lbl41:
                    // 1 sources

                    while (true) {
                        if (!this.a.isEmpty()) ** break;
                        ** continue;
                        break block29;
                        break;
                    }
                }
lbl46:
                // 3 sources

                block26: while (true) {
                    switch (var6_5) lbl-1000:
                    // 4 sources

                    {
                        default: {
                            continue block26;
                        }
                        case 1714966910: {
                            ** continue;
                        }
                        case -1909327330: {
                            ** continue;
                        }
                        case -1688791476: {
                            ** continue;
                        }
                        case 128809538: {
                            ** continue;
                        }
                        case 1832213850: {
                            ** continue;
                        }
                        case 496155825: {
                            ** continue;
                        }
                        case -258424855: {
                            ** continue;
                        }
                        case -1626367275: {
                            ** continue;
                        }
lbl66:
                        // 1 sources

                        var6_5 = (var4_4 | var7_3) ^ 1692657963;
                        ** GOTO lbl-1000
lbl68:
                        // 1 sources

                        while (true) {
                            var6_5 = (var4_4 | var7_3) ^ -427897009;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 397551439: {
                            var5_6 ^= var6_5 ^ -1520338819;
                            var6_5 = (var4_4 | var7_3) ^ -62846532;
                            ** GOTO lbl-1000
                        }
lbl75:
                        // 1 sources

                        var5_6 = (var4_4 | var7_3) ^ -1418136616;
                        continue block22;
                        case 383494226: {
                            return;
                        }
                        case 1379559926: {
                            ** continue;
                        }
                    }
                    break;
                }
                break;
            }
            var6_5 = (var4_4 | var7_3) ^ -315106388;
            ** GOTO lbl46
        }
        var6_5 = (var4_4 | var7_3) ^ 192203799;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void nn(class_2338 var1_1, long var2_2) {
        block34: {
            break block34;
lbl1:
            // 1 sources

            while (true) {
                block32: {
                    block30: {
                        block33: {
                            block27: {
                                block28: {
                                    block31: {
                                        block29: {
                                            var6_5 = (var4_4 | var7_3) ^ -604750930;
                                            break block30;
lbl4:
                                            // 1 sources

                                            return;
lbl6:
                                            // 1 sources

                                            while (true) {
                                                var5_6 ^= var6_5 ^ 984552543;
                                                break block27;
                                                break;
                                            }
lbl9:
                                            // 1 sources

                                            return;
lbl11:
                                            // 1 sources

                                            while (true) {
                                                if (!this.a.excavationVerification()) break block28;
                                                break block29;
                                                break;
                                            }
lbl14:
                                            // 1 sources

                                            while (true) {
                                                var6_5 = (var4_4 | var7_3) ^ 1524722022;
                                                break block30;
                                                break;
                                            }
lbl17:
                                            // 1 sources

                                            while (true) {
                                                if (this.a.size() < dJ.nC((var5_6 | var6_5 ^ 1050799295) ^ (var6_5 ^ -2061615741), (var4_4 | var6_5 ^ 1050799295) ^ ((var5_6 | var6_5 ^ 1050799295) ^ (var6_5 ^ -1711847765)))) break block31;
                                                break block28;
                                                break;
                                            }
lbl20:
                                            // 1 sources

                                            while (true) {
                                                var5_6 ^= var6_5 ^ 42901836;
                                                break block32;
                                                break;
                                            }
lbl23:
                                            // 1 sources

                                            while (true) {
                                                var6_5 = (var4_4 | var7_3) ^ 488786972;
                                                break block30;
lbl26:
                                                // 1 sources

                                                while (true) {
                                                    var6_5 = (var4_4 | var7_3) ^ 1647181323;
                                                    break block30;
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        var6_5 = (var4_4 | var7_3) ^ -1070510989;
                                        break block30;
                                    }
                                    var6_5 = (var4_4 | var7_3) ^ 1915256290;
                                    break block30;
lbl35:
                                    // 1 sources

                                    while (true) {
                                        this.a.put(var1_1.method_10063(), var2_2 + (8311290494593770175L << (var6_5 ^ 349458678) >>> (var6_5 ^ 349458678) ^ (long)var5_6 & 0xFFFFFFFFL | (8311290494593770175L >>> (var6_5 ^ 349458678) ^ (long)var5_6 & 0xFFFFFFFFL) << (var6_5 ^ 349458678)));
                                        ** continue;
                                        break;
                                    }
                                }
                                var6_5 = (var4_4 | var7_3) ^ 217784252;
                                break block30;
lbl43:
                                // 1 sources

                                while (true) {
                                    var5_6 ^= var6_5 ^ 1229777596;
                                    break block33;
lbl46:
                                    // 1 sources

                                    while (true) {
                                        var6_5 = (var4_4 | var7_3) ^ 136146371;
                                        break block30;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var6_5 = (var4_4 | var7_3) ^ 479888930;
                            break block30;
                        }
                        var6_5 = (var4_4 | var7_3) ^ -1557401811;
                    }
lbl55:
                    // 2 sources

                    block26: while (true) {
                        switch (var6_5) {
                            default: {
                                continue block26;
                            }
                            case -1250569547: {
                                ** continue;
                            }
                            case -1075654088: {
                                ** continue;
                            }
                            case -707640848: {
                                ** continue;
                            }
                            case -1419429415: {
                                ** continue;
                            }
                            case -1428294681: {
                                ** continue;
                            }
                            case -316746083: {
                                ** continue;
                            }
                            case 349458646: {
                                ** continue;
                            }
                            case 1812694101: {
                                ** continue;
                            }
                            case -975715815: {
                                ** continue;
                            }
                            case -1157324729: {
                                var5_6 ^= var6_5 ^ -799695277;
                                ** continue;
                            }
                            case 2010051464: {
                                ** continue;
                            }
                        }
                        break;
                    }
                }
                var6_5 = (var4_4 | var7_3) ^ 42626382;
                ** continue;
                break;
            }
        }
        var7_3 = -1803804840;
        var4_4 = dJ.q & -1803804840 ^ -1478515205;
        var6_5 = 0;
        var5_6 = (var4_4 | var7_3) ^ -847318126;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void no(class_310 var1_1) {
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
    private void np(class_310 var1_1) {
        block123: {
            block118: {
                block124: {
                    block117: {
                        block121: {
                            block119: {
                                block105: {
                                    block115: {
                                        block110: {
                                            block116: {
                                                block113: {
                                                    block109: {
                                                        block104: {
                                                            block114: {
                                                                block106: {
                                                                    block111: {
                                                                        block120: {
                                                                            block107: {
                                                                                block108: {
                                                                                    break block120;
lbl1:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl3:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var4_4 = (var2_3 | var5_2) ^ 1399235626;
                                                                                        ** GOTO lbl155
lbl6:
                                                                                        // 1 sources

                                                                                        return;
lbl8:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var4_4 = (var2_3 | var5_2) ^ -1558648004;
                                                                                            ** GOTO lbl155
                                                                                            break;
                                                                                        }
lbl11:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var4_4 = (var2_3 | var5_2) ^ -1752598508;
                                                                                            ** GOTO lbl155
lbl14:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var3_5 ^= var4_4 ^ 198508697;
                                                                                                break block104;
                                                                                                break;
                                                                                            }
lbl17:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                if (this.l <= dJ.nC((var3_5 | var4_4 ^ -747850526) ^ (var4_4 ^ 90941341), (var2_3 | var4_4 ^ -747850526) ^ ((var3_5 | var4_4 ^ -747850526) ^ (var4_4 ^ -738915459)))) ** GOTO lbl101
                                                                                                break block105;
                                                                                                break;
                                                                                            }
lbl20:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                if (this.b) break block106;
                                                                                                break block107;
                                                                                                break;
                                                                                            }
lbl23:
                                                                                            // 1 sources

                                                                                            while (this.nz(this.a.target()) != null) {
                                                                                                break block108;
lbl25:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    var4_4 = (var2_3 | var5_2) ^ 118768141;
                                                                                                    ** GOTO lbl155
                                                                                                    break;
                                                                                                }
lbl28:
                                                                                                // 1 sources

                                                                                                return;
lbl30:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    continue;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            break block109;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    }
lbl33:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var4_4 = (var2_3 | var5_2) ^ 512355305;
                                                                                        ** GOTO lbl155
                                                                                        break;
                                                                                    }
lbl36:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var3_5 ^= var4_4 ^ 2096321145;
                                                                                        break block110;
                                                                                        break;
                                                                                    }
lbl39:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var3_5 ^= var4_4 ^ 2053288388;
                                                                                        ** GOTO lbl80
                                                                                        break;
                                                                                    }
lbl42:
                                                                                    // 1 sources

                                                                                    while (this.l > dJ.nC((var3_5 | var4_4 ^ -667656470) ^ (var4_4 ^ -1912006758), (var2_3 | var4_4 ^ -667656470) ^ ((var3_5 | var4_4 ^ -667656470) ^ (var4_4 ^ -474231530)))) {
                                                                                        block112: {
                                                                                            break block111;
lbl44:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                this.o = dJ.d;
                                                                                                ** GOTO lbl222
                                                                                                break;
                                                                                            }
lbl47:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var3_5 ^= var4_4 ^ -487133757;
                                                                                                break block112;
                                                                                                break;
                                                                                            }
lbl50:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var4_4 = (var2_3 | var5_2) ^ -594857082;
                                                                                                ** GOTO lbl155
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var4_4 = (var2_3 | var5_2) ^ -530348414;
                                                                                        ** GOTO lbl155
lbl56:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            if (this.l > dJ.nC((var3_5 | var4_4 ^ -1887561176) ^ (var4_4 ^ -615443690), (var2_3 | var4_4 ^ -1887561176) ^ ((var3_5 | var4_4 ^ -1887561176) ^ (var4_4 ^ -223389460)))) {
                                                                                                ** continue;
                                                                                            }
                                                                                            break block106;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    break block115;
lbl61:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var4_4 = (var2_3 | var5_2) ^ -1231581019;
                                                                                        ** GOTO lbl155
                                                                                        break;
                                                                                    }
                                                                                    this.a.aimAt(this, this.a, this.a.rotationSpeed());
                                                                                    var4_4 = (var2_3 | var5_2) ^ -1127117381;
                                                                                    ** GOTO lbl155
lbl68:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var3_5 ^= var4_4 ^ -617394501;
                                                                                        break block113;
                                                                                        break;
                                                                                    }
lbl71:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var4_4 = (var2_3 | var5_2) ^ -120212836;
                                                                                        ** GOTO lbl155
lbl74:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var4_4 = (var2_3 | var5_2) ^ 527696460;
                                                                                            ** GOTO lbl155
lbl77:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var4_4 = (var2_3 | var5_2) ^ -912933830;
                                                                                                ** GOTO lbl155
                                                                                                break;
                                                                                            }
lbl80:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                var4_4 = (var2_3 | var5_2) ^ -2108326760;
                                                                                                ** GOTO lbl155
                                                                                                break;
                                                                                            }
lbl83:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var4_4 = (var2_3 | var5_2) ^ 1480478242;
                                                                                                ** GOTO lbl155
lbl86:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    var3_5 ^= var4_4 ^ -1025743700;
                                                                                                    break block114;
                                                                                                    break;
                                                                                                }
lbl89:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    var4_4 = (var2_3 | var5_2) ^ -558335073;
                                                                                                    ** GOTO lbl155
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var4_4 = (var2_3 | var5_2) ^ -344207341;
                                                                                ** GOTO lbl155
                                                                            }
                                                                            var4_4 = (var2_3 | var5_2) ^ -520334942;
                                                                            ** GOTO lbl155
lbl98:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var4_4 = (var2_3 | var5_2) ^ 892085456;
                                                                                ** GOTO lbl155
lbl101:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    var4_4 = (var2_3 | var5_2) ^ 369658779;
                                                                                    ** GOTO lbl155
                                                                                    break;
                                                                                }
lbl104:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    this.nB(var1_1, dJ.b);
                                                                                    break block115;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
lbl107:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var4_4 = (var2_3 | var5_2) ^ 147466339;
                                                                                ** GOTO lbl155
lbl110:
                                                                                // 1 sources

                                                                                return;
lbl112:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    this.nB(var1_1, dJ.c);
                                                                                    ** continue;
                                                                                    break;
                                                                                }
lbl115:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var4_4 = (var2_3 | var5_2) ^ 259263200;
                                                                                    ** GOTO lbl155
                                                                                    break;
                                                                                }
lbl118:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    this.nD("obstructed: nothing of " + this.a.target().method_23854() + " can be seen from here");
                                                                                    ** continue;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                            this.o = "aiming at " + this.a.target().method_23854();
                                                                            var4_4 = (var2_3 | var5_2) ^ -1414880400;
                                                                            ** GOTO lbl155
                                                                        }
                                                                        var5_2 = 1908778295;
                                                                        var2_3 = dJ.q & 1908778295 ^ -795986691;
                                                                        var4_4 = 0;
                                                                        var3_5 = (var2_3 | var5_2) ^ -858309138;
                                                                        ** while (true)
lbl130:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    var4_4 = (var2_3 | var5_2) ^ 193281228;
                                                                    ** GOTO lbl155
lbl135:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ 1867712226;
                                                                        ** GOTO lbl155
                                                                        break;
                                                                    }
lbl138:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_5 ^= var4_4 ^ 735053713;
                                                                        break block116;
                                                                        break;
                                                                    }
lbl141:
                                                                    // 1 sources

                                                                    while (this.a.preempted()) {
                                                                        ** continue;
lbl143:
                                                                        // 1 sources

                                                                        ** GOTO lbl89
                                                                    }
                                                                    break block121;
                                                                }
                                                                var4_4 = (var2_3 | var5_2) ^ 861944791;
                                                                ** GOTO lbl155
lbl148:
                                                                // 2 sources

                                                                block95: while (true) {
                                                                    block122: {
                                                                        var4_4 = (var2_3 | var5_2) ^ 1037737751;
                                                                        break block122;
lbl151:
                                                                        // 1 sources

                                                                        while (!this.c) {
                                                                            ** continue;
lbl153:
                                                                            // 1 sources

                                                                            ** GOTO lbl135
                                                                        }
                                                                        break block117;
                                                                    }
lbl156:
                                                                    // 22 sources

                                                                    block97: while (true) {
                                                                        switch (var4_4) lbl-1000:
                                                                        // 2 sources

                                                                        {
                                                                            while (true) {
                                                                                default: {
                                                                                    continue block97;
                                                                                }
                                                                                break;
                                                                            }
                                                                            case -289687629: {
                                                                                ** continue;
                                                                            }
                                                                            case 1389846211: {
                                                                                ** continue;
                                                                            }
                                                                            case -599134821: {
                                                                                ** continue;
                                                                            }
                                                                            case 1511537939: {
                                                                                ** continue;
                                                                            }
                                                                            case -1565978155: {
                                                                                ** continue;
                                                                            }
                                                                            case 1307891771: {
                                                                                ** continue;
                                                                            }
                                                                            case -991719121: {
                                                                                ** GOTO lbl23
                                                                            }
                                                                            case 150150491: {
                                                                                ** continue;
                                                                            }
                                                                            case 1704527985: {
                                                                                ** continue;
                                                                            }
                                                                            case 1130804387: {
                                                                                ** continue;
                                                                            }
                                                                            case 152700771: {
                                                                                ** continue;
                                                                            }
                                                                            case -1443759139: {
                                                                                ** GOTO lbl42
                                                                            }
                                                                            case -750893358: {
                                                                                ** continue;
                                                                            }
                                                                            case -280601066: {
                                                                                break block118;
                                                                            }
                                                                            case 1766224350: {
                                                                                ** continue;
                                                                            }
                                                                            case 448030188: {
                                                                                break block119;
                                                                            }
                                                                            case -21250273: {
                                                                                ** continue;
                                                                            }
                                                                            case -1028682200: {
                                                                                ** continue;
                                                                            }
                                                                            case -406372764: {
                                                                                ** continue;
                                                                            }
                                                                            case 288613469: {
                                                                                ** continue;
                                                                            }
                                                                            case 1692754446: {
                                                                                ** continue;
                                                                            }
                                                                            case -248272284: {
                                                                                ** continue;
                                                                            }
                                                                            case 945424837: {
                                                                                ** continue;
                                                                            }
                                                                            case -37065755: {
                                                                                ** continue;
                                                                            }
                                                                            case -428035956: {
                                                                                ** continue;
                                                                            }
                                                                            case 1293826116: {
                                                                                ** continue;
                                                                            }
                                                                            case 759465593: {
                                                                                ** continue;
                                                                            }
                                                                            case 1196959066: {
                                                                                ** GOTO lbl141
                                                                            }
                                                                            case -1629669158: {
                                                                                ** GOTO lbl151
                                                                            }
                                                                            case 1323845577: {
                                                                                var3_5 ^= var4_4 ^ 32919010;
                                                                                ** continue;
                                                                            }
lbl222:
                                                                            // 1 sources

                                                                            var4_4 = (var2_3 | var5_2) ^ 701201436;
                                                                            ** continue;
                                                                            case -153356302: {
                                                                                var3_5 ^= var4_4 ^ 887301618;
                                                                                break block95;
                                                                            }
                                                                            case -95778509: {
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                var4_4 = (var2_3 | var5_2) ^ 1392089786;
                                                                ** GOTO lbl156
                                                                {
                                                                    case 296498045: {
                                                                        this.c = true;
                                                                        break block117;
                                                                    }
                                                                }
                                                            }
                                                            var4_4 = (var2_3 | var5_2) ^ 16523163;
                                                            ** GOTO lbl156
                                                        }
                                                        var4_4 = (var2_3 | var5_2) ^ 1863486757;
                                                        ** GOTO lbl156
                                                        {
                                                            case 796380768: {
                                                                var3_5 ^= var4_4 ^ 242149792;
                                                                break;
                                                            }
                                                        }
lbl243:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ -1075021674;
                                                            ** GOTO lbl156
                                                            break;
                                                        }
                                                    }
lbl247:
                                                    // 2 sources

                                                    while (true) {
                                                        var4_4 = (var2_3 | var5_2) ^ 218276279;
                                                        ** GOTO lbl156
                                                        break;
                                                    }
                                                    {
                                                        case 1310969193: {
                                                            if (this.a.claim(this)) break block123;
                                                            break block124;
                                                        }
                                                    }
                                                    var4_4 = (var2_3 | var5_2) ^ -1792354319;
                                                    ** GOTO lbl156
                                                    {
                                                        case -117072484: {
                                                            var3_5 ^= var4_4 ^ -317743786;
                                                            ** GOTO lbl148
                                                        }
                                                    }
lbl258:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_4 = (var2_3 | var5_2) ^ 397608307;
                                                        ** GOTO lbl156
                                                        break;
                                                    }
                                                    {
                                                        case -1556730043: {
                                                            return;
                                                        }
                                                    }
                                                }
                                                var4_4 = (var2_3 | var5_2) ^ -1806254706;
                                                ** GOTO lbl156
                                            }
                                            var4_4 = (var2_3 | var5_2) ^ 201711130;
                                            ** GOTO lbl156
lbl269:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ -113465180;
                                                ** GOTO lbl156
                                                break;
                                            }
                                        }
                                        var4_4 = (var2_3 | var5_2) ^ -1136955964;
                                        ** GOTO lbl156
                                        {
                                            case -871027992: {
                                                ** continue;
                                            }
                                            case -841875704: {
                                                this.nE(mf.f);
                                                ** continue;
                                            }
                                            case 1516574351: {
                                                var3_5 ^= var4_4 ^ -402634995;
                                                ** continue;
                                            }
                                            case -320869400: {
                                                var3_5 ^= var4_4 ^ 394135455;
                                                ** continue;
                                            }
                                            case 1939523943: {
                                                switch (var3_5) {
                                                    case -930324588: {
                                                        ** continue;
                                                    }
                                                    case -208451166: {
                                                        ** continue;
                                                    }
                                                    ** default:
lbl293:
                                                    // 1 sources

                                                    ** continue;
                                                }
                                            }
                                            case -670774813: {
                                                var3_5 ^= var4_4 ^ 78162467;
                                                ** continue;
                                            }
                                        }
                                        var4_4 = (var2_3 | var5_2) ^ 586281773;
                                        ** GOTO lbl156
                                        {
                                            case -1633897699: {
                                                var3_5 ^= var4_4 ^ 355217152;
                                                ** continue;
                                            }
                                        }
                                    }
                                    var4_4 = (var2_3 | var5_2) ^ 487611927;
                                    ** GOTO lbl156
                                    this.nw(var1_1);
                                    var4_4 = (var2_3 | var5_2) ^ -1735801823;
                                    ** GOTO lbl156
                                    {
                                        case 1715916267: {
                                            var3_5 ^= var4_4 ^ -17170408;
                                            ** continue;
                                        }
                                        case -53668792: {
                                            var3_5 ^= var4_4 ^ 1849969432;
                                            ** continue;
                                        }
                                        case -415342273: {
                                            var3_5 ^= var4_4 ^ -441461448;
                                            ** continue;
                                        }
                                    }
                                }
                                var4_4 = (var2_3 | var5_2) ^ 763779172;
                                ** GOTO lbl156
                                {
                                    ** case -94643052:
                                }
lbl321:
                                // 1 sources

                                var3_5 ^= var4_4 ^ 777700288;
                                ** while (true)
                            }
                            var4_4 = (var2_3 | var5_2) ^ 1008618231;
                            ** GOTO lbl156
                        }
                        var4_4 = (var2_3 | var5_2) ^ -1411938068;
                        ** GOTO lbl156
                    }
                    var4_4 = (var2_3 | var5_2) ^ -1297546916;
                    ** GOTO lbl156
                }
                var4_4 = (var2_3 | var5_2) ^ -1087901130;
                ** GOTO lbl156
            }
            var4_4 = (var2_3 | var5_2) ^ 194275691;
            ** GOTO lbl156
        }
        var4_4 = (var2_3 | var5_2) ^ 384947392;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void nq(class_310 var1_1, class_638 var2_2) {
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
    private void nr(class_310 var1_1, class_638 var2_2) {
        block94: {
            block91: {
                block90: {
                    block92: {
                        block93: {
                            block89: {
                                block86: {
                                    block87: {
                                        block88: {
                                            block85: {
                                                break block93;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    var4_6 ^= var5_5 ^ 1933322693;
                                                    break block85;
                                                    break;
                                                }
lbl4:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl6:
                                                // 1 sources

                                                while (true) {
                                                    var5_5 = (var3_4 | var6_3) ^ 2049228783;
                                                    break block86;
lbl9:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_5 = (var3_4 | var6_3) ^ -1507111777;
                                                        break block86;
                                                        break;
                                                    }
lbl12:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl14:
                                                    // 2 sources

                                                    while (true) {
                                                        var5_5 = (var3_4 | var6_3) ^ 307787210;
                                                        break block86;
lbl17:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl19:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_6 ^= var5_5 ^ 233443942;
                                                            break block87;
                                                            break;
                                                        }
lbl22:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl24:
                                                        // 1 sources

                                                        return;
lbl26:
                                                        // 1 sources

                                                        while (true) {
                                                            var5_5 = (var3_4 | var6_3) ^ -1762430001;
                                                            break block86;
                                                            break;
                                                        }
lbl29:
                                                        // 2 sources

                                                        while (true) {
                                                            var5_5 = (var3_4 | var6_3) ^ 2112159645;
                                                            break block86;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                            var5_5 = (var3_4 | var6_3) ^ 1905229916;
                                            break block86;
lbl35:
                                            // 1 sources

                                            while (true) {
                                                var5_5 = (var3_4 | var6_3) ^ 721122858;
                                                break block86;
lbl38:
                                                // 1 sources

                                                while (true) {
                                                    var5_5 = (var3_4 | var6_3) ^ 420478019;
                                                    break block86;
                                                    break;
                                                }
                                                break;
                                            }
                                            this.e = 0;
                                            var5_5 = (var3_4 | var6_3) ^ 1265186774;
                                            break block86;
lbl44:
                                            // 1 sources

                                            while (true) {
                                                var5_5 = (var3_4 | var6_3) ^ 2083462790;
                                                break block86;
lbl47:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl49:
                                                // 1 sources

                                                while (true) {
                                                    this.g = this.nt(var2_2);
                                                    ** continue;
                                                    break;
                                                }
lbl52:
                                                // 1 sources

                                                while (true) {
                                                    var4_6 ^= var5_5 ^ -2001844876;
                                                    break block88;
                                                    break;
                                                }
                                                break;
                                            }
lbl55:
                                            // 1 sources

                                            while (true) {
                                                var5_5 = (var3_4 | var6_3) ^ -1294887491;
                                                break block86;
lbl58:
                                                // 1 sources

                                                while (true) {
                                                    var4_6 ^= var5_5 ^ -224389342;
                                                    break block89;
                                                    break;
                                                }
lbl61:
                                                // 1 sources

                                                while (true) {
                                                    var5_5 = (var3_4 | var6_3) ^ 1925188765;
                                                    break block86;
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        var5_5 = (var3_4 | var6_3) ^ -1616895626;
                                        break block86;
lbl67:
                                        // 1 sources

                                        return;
lbl69:
                                        // 1 sources

                                        return;
lbl71:
                                        // 1 sources

                                        while (true) {
                                            var4_6 ^= var5_5 ^ -810846819;
                                            break block90;
                                            break;
                                        }
                                    }
                                    var5_5 = (var3_4 | var6_3) ^ -1442530243;
                                    break block86;
lbl77:
                                    // 1 sources

                                    while (true) {
                                        var5_5 = (var3_4 | var6_3) ^ 1779205351;
                                        break block86;
                                        while (true) {
                                            var5_5 = (var3_4 | var6_3) ^ 100598607;
                                            break block86;
                                            break;
                                        }
lbl83:
                                        // 1 sources

                                        while (true) {
                                            var5_5 = (var3_4 | var6_3) ^ 61993354;
                                            break block86;
                                            break;
                                        }
lbl86:
                                        // 1 sources

                                        while (true) {
                                            var5_5 = (var3_4 | var6_3) ^ -1964199304;
                                            break block86;
                                            break;
                                        }
lbl89:
                                        // 1 sources

                                        while (true) {
                                            if (this.a.drill()) ** continue;
                                            ** continue;
                                            break;
                                        }
lbl92:
                                        // 1 sources

                                        while (true) {
                                            var5_5 = (var3_4 | var6_3) ^ 30027041;
                                            break block86;
                                            break;
                                        }
lbl95:
                                        // 1 sources

                                        while (true) {
                                            var4_6 ^= var5_5 ^ 370720182;
                                            break block91;
                                            break;
                                        }
lbl98:
                                        // 1 sources

                                        while (true) {
                                            var4_6 ^= var5_5 ^ -19113876;
                                            ** continue;
                                            break;
                                        }
                                        break;
                                    }
lbl101:
                                    // 1 sources

                                    while (true) {
                                        var5_5 = (var3_4 | var6_3) ^ 682543207;
                                        break block86;
lbl104:
                                        // 1 sources

                                        while (true) {
                                            var4_6 ^= var5_5 ^ 1675974715;
                                            ** GOTO lbl29
                                            break;
                                        }
lbl107:
                                        // 1 sources

                                        while (true) {
                                            var5_5 = (var3_4 | var6_3) ^ 1803353064;
                                            break block86;
lbl110:
                                            // 1 sources

                                            while (true) {
                                                var4_6 ^= var5_5 ^ 1897684343;
                                                ** continue;
                                                break;
                                            }
lbl113:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl115:
                                            // 1 sources

                                            while (true) {
                                                if (this.a == null) ** GOTO lbl14
                                                ** continue;
                                                break;
                                            }
                                            this.a = false;
                                            var5_5 = (var3_4 | var6_3) ^ 523164699;
                                            break block86;
                                            break;
                                        }
                                        break;
                                    }
                                    this.nn(this.a.target(), this.a.tick());
                                    var5_5 = (var3_4 | var6_3) ^ 1796280046;
                                }
lbl124:
                                // 13 sources

                                block80: while (true) {
                                    switch (var5_5) {
                                        default: {
                                            continue block80;
                                        }
                                        case 1683033419: {
                                            ** continue;
                                        }
                                        case 1217852332: {
                                            ** continue;
                                        }
                                        case -139312272: {
                                            ** continue;
                                        }
                                        case -292344137: {
                                            ** continue;
                                        }
                                        case -241999064: {
                                            ** continue;
                                        }
                                        case 1897766469: {
                                            ** continue;
                                        }
                                        case -317960519: {
                                            ** continue;
                                        }
                                        case 1894020405: {
                                            ** continue;
                                        }
                                        case -468765210: {
                                            ** continue;
                                        }
                                        case -829170762: {
                                            ** continue;
                                        }
                                        case -1835884107: {
                                            ** continue;
                                        }
                                        case -2068759596: {
                                            ** continue;
                                        }
                                        case -1669483602: {
                                            ** continue;
                                        }
                                        case -1038194056: {
                                            ** continue;
                                        }
                                        case 657064065: {
                                            ** continue;
                                        }
                                        case 1550592654: {
                                            ** continue;
                                        }
                                        case 1152975630: {
                                            ** continue;
                                        }
                                        case -2050931493: {
                                            ** continue;
                                        }
                                        case -1097679527: {
                                            ** continue;
                                        }
                                        case -703712606: {
                                            ** continue;
                                        }
                                        case -1801912100: {
                                            ** continue;
                                        }
                                        case -52049159: {
                                            ** continue;
                                        }
                                        case -1624096913: {
                                            ** continue;
                                        }
                                        case -971802796: {
                                            ** continue;
                                        }
                                        case -1512797979: {
                                            var4_6 ^= var5_5 ^ 916142601;
                                            break;
                                        }
                                        case 123475330: {
                                            var4_6 ^= var5_5 ^ -188720667;
                                            break block92;
                                        }
                                        case 1555197819: {
                                            if (this.g >= this.nu()) ** break;
                                            ** continue;
                                            ** continue;
                                        }
                                    }
                                    var5_5 = (var3_4 | var6_3) ^ 179473109;
                                    continue;
                                    break;
                                }
                            }
                            var5_5 = (var3_4 | var6_3) ^ 2091876304;
                            ** GOTO lbl124
lbl191:
                            // 1 sources

                            while (true) {
                                var5_5 = (var3_4 | var6_3) ^ 3051908;
                                ** GOTO lbl124
                                break;
                            }
lbl194:
                            // 1 sources

                            while (true) {
                                var5_5 = (var3_4 | var6_3) ^ -1638282746;
                                ** GOTO lbl124
                                break;
                            }
                            {
                                case -67860538: {
                                    this.k = 0;
                                    ** continue;
                                }
                                case -1283031884: {
                                    var4_6 ^= var5_5 ^ 488773817;
                                    break;
                                }
                            }
                        }
                        var6_3 = -1936155344;
                        var3_4 = dJ.q & -1936155344 ^ 1656045331;
                        var5_5 = 0;
                        var4_6 = (var3_4 | var6_3) ^ -1750067318;
                        ** while (true)
                    }
                    var5_5 = (var3_4 | var6_3) ^ 748934475;
                    ** GOTO lbl124
                    {
                        case -277376494: {
                            break block94;
                        }
                    }
                }
                var5_5 = (var3_4 | var6_3) ^ 951291281;
                ** GOTO lbl124
lbl217:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 1564197767;
                    ** GOTO lbl124
                    break;
                }
                this.nA();
                var5_5 = (var3_4 | var6_3) ^ -371086671;
                ** GOTO lbl124
                this.b.add(this.a.target());
                var5_5 = (var3_4 | var6_3) ^ 539911301;
                ** GOTO lbl124
lbl227:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 357120245;
                    ** GOTO lbl124
                    break;
                }
                {
                    case -1844264733: {
                        this.nv(var1_1, var2_2);
                        ** continue;
                    }
                }
            }
            var5_5 = (var3_4 | var6_3) ^ -912801870;
            ** GOTO lbl124
            {
                case -347947908: {
                    var4_6 ^= var5_5 ^ 727685558;
                    ** continue;
                }
                case -1822867282: {
                    switch (var4_6) {
                        case 1992741442: {
                            ** continue;
                        }
                        case -1843790471: {
                            ** continue;
                        }
                        ** default:
lbl246:
                        // 1 sources

                        ** continue;
                    }
                }
                case -2052279843: {
                    var4_6 ^= var5_5 ^ -1640637506;
                    ** continue;
                }
            }
            this.nE(mf.l);
            var5_5 = (var3_4 | var6_3) ^ 1345258090;
            ** GOTO lbl124
            {
                case 2018430204: {
                    var4_6 ^= var5_5 ^ 1909318545;
                    ** continue;
                }
                ** case -1001993959:
            }
lbl257:
            // 1 sources

            var4_6 ^= var5_5 ^ -1724984825;
            ** while (true)
        }
        var5_5 = (var3_4 | var6_3) ^ -1307586488;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void ns(class_638 var1_1) {
        var7_2 = -1748173302;
        var4_3 = dJ.q & -1748173302 ^ 1750922372;
        var6_4 = 0;
        var5_6 = (var4_3 | var7_2) ^ 997361507;
        var6_4 = (var4_3 | var7_2) ^ -1839700557;
        if (true) ** GOTO lbl33
lbl7:
        // 1 sources

        while (true) {
            var6_4 = (var4_3 | var7_2) ^ 1438020458;
            ** GOTO lbl72
lbl10:
            // 1 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ 1882940820;
                ** GOTO lbl72
lbl13:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ -1142951362;
                    ** GOTO lbl72
                    break;
                }
                break;
            }
            break;
        }
        block42: while (true) {
            var6_4 = (var4_3 | var7_2) ^ -1743399957;
            block43: while (true) {
                block59: {
                    switch (var6_4) {
                        case -1445454539: {
                            var5_6 ^= var6_4 ^ 181145621;
                            break;
                        }
                        case 1837407037: {
                            ** break;
                        }
                        case -1129412392: {
                            var5_6 ^= var6_4 ^ 1058430881;
                            break block59;
                        }
lbl28:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ 1131574870;
                        continue block43;
                        case 1741237605: {
                            var5_6 ^= var6_4 ^ -230635291;
                            var6_4 = (var4_3 | var7_2) ^ -835547442;
                        }
lbl33:
                        // 3 sources

                        default: {
                            continue block43;
                        }
                        case 262848355: {
                            var2_5 = this.nt(var1_1);
                            var6_4 = (var4_3 | var7_2) ^ -1496760233;
                            ** GOTO lbl72
                        }
                        case 837709888: {
                            this.o = dJ.p;
                            var6_4 = (var4_3 | var7_2) ^ 1443161019;
                            continue block43;
                        }
                        case 521659284: {
                            ++this.k;
                            continue block42;
                        }
                    }
                    var6_4 = (var4_3 | var7_2) ^ -260685331;
                    continue;
                }
                var6_4 = (var4_3 | var7_2) ^ -523559654;
            }
            break;
        }
lbl51:
        // 1 sources

        while (true) {
            var6_4 = (var4_3 | var7_2) ^ 211205472;
            ** GOTO lbl72
            break;
        }
lbl54:
        // 1 sources

        while (true) {
            var6_4 = (var4_3 | var7_2) ^ -1555043406;
            ** GOTO lbl72
            break;
        }
lbl57:
        // 1 sources

        while (true) {
            var6_4 = (var4_3 | var7_2) ^ -974809035;
            ** GOTO lbl146
            break;
        }
lbl60:
        // 1 sources

        while (true) {
            var3_7 = v0;
            var6_4 = (var4_3 | var7_2) ^ 816807110;
            ** GOTO lbl146
            break;
        }
lbl64:
        // 2 sources

        while (true) {
            var6_4 = (var4_3 | var7_2) ^ -1085527596;
            ** GOTO lbl72
            break;
        }
lbl67:
        // 1 sources

        while (true) {
            var6_4 = (var4_3 | var7_2) ^ -959634003;
            if (true) ** GOTO lbl72
            break;
        }
        block50: while (true) {
            var6_4 = (var4_3 | var7_2) ^ -101611473;
lbl72:
            // 9 sources

            block51: while (true) {
                switch (var6_4) {
                    case 1494597337: {
                        var5_6 ^= var6_4 ^ 1930764137;
                        ** break;
                    }
                    case 854857490: {
                        if (var2_5 >= this.nu()) {
                            ** continue;
                        }
                        ** GOTO lbl125
                    }
                    case 120458689: {
                        ++this.e;
                        ** GOTO lbl64
                    }
                    case -1880646886: {
                        this.e = 0;
                        ** continue;
                    }
                    case 1553143100: {
                        if (this.a != null) {
                            var6_4 = (var4_3 | var7_2) ^ 562743365;
                            continue block51;
                        }
                        ** GOTO lbl125
                    }
                    case -1435857436: {
                        var5_6 ^= var6_4 ^ 1664929458;
                        var6_4 = (var4_3 | var7_2) ^ 1706450772;
                        continue block51;
                    }
                    case 957471523: {
                        v0 = false;
                        ** GOTO lbl110
                    }
                    case -717099333: {
                        var5_6 ^= var6_4 ^ 2007794845;
                        ** continue;
                    }
                    case -213236754: {
                        v0 = true;
                        ** GOTO lbl110
                    }
                    case 310938953: {
                        var5_6 ^= var6_4 ^ -311749868;
                        ** continue;
                    }
lbl108:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 1701784824;
                    ** GOTO lbl130
lbl110:
                    // 2 sources

                    var5_6 ^= -1966399491;
                    ** continue;
                    case -564775221: {
                        var6_4 = (var4_3 | var7_2) ^ -852956772;
                        ** GOTO lbl130
                    }
                    case -1699491210: {
                        if (var2_5 <= this.g) continue block50;
                        ** continue;
                    }
                    case 1141050544: {
                        var5_6 ^= var6_4 ^ -1142910227;
                        ** continue;
                    }
                    case 103642785: {
                        var5_6 ^= var6_4 ^ 1838571473;
                        var6_4 = (var4_3 | var7_2) ^ -118295729;
                        ** GOTO lbl130
                    }
lbl125:
                    // 2 sources

                    var6_4 = (var4_3 | var7_2) ^ -313232441;
                    ** GOTO lbl130
                    case -1704287782: {
                        this.g = var2_5;
                        var6_4 = (var4_3 | var7_2) ^ 714936373;
                    }
lbl130:
                    // 6 sources

                    default: {
                        continue block51;
                    }
                    case 1083234138: 
                }
                break;
            }
            break;
        }
        var5_6 ^= var6_4 ^ -1901753089;
        ** while (true)
lbl135:
        // 2 sources

        while (true) {
            var6_4 = (var4_3 | var7_2) ^ 110142570;
            if (true) ** GOTO lbl146
            break;
        }
        block53: while (true) {
            var6_4 = (var4_3 | var7_2) ^ -524539372;
            ** GOTO lbl146
lbl141:
            // 3 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ 550727461;
                if (true) ** GOTO lbl146
                break;
            }
            block55: while (true) {
                var6_4 = (var4_3 | var7_2) ^ 290142316;
lbl146:
                // 6 sources

                block56: while (true) {
                    switch (var6_4) {
                        case -552627797: {
                            ** GOTO lbl172
                        }
                        case -112436508: {
                            var5_6 ^= var6_4 ^ -485195447;
                            ** break;
                        }
                        case -1325021443: {
                            if (this.k < 5) ** GOTO lbl135
                            ** GOTO lbl141
                        }
                        case 976840379: {
                            if (var3_7) ** GOTO lbl141
                            var6_4 = (var4_3 | var7_2) ^ 478992799;
                            continue block56;
                        }
                        case -292043038: {
                            ** GOTO lbl179
                        }
                        case -814513592: {
                            var5_6 ^= var6_4 ^ 663264081;
                            ** continue;
                        }
                        case 526439578: {
                            if (this.e < 2) ** break;
                            ** continue;
                            continue block55;
                        }
lbl169:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ 1892300225;
                        default: {
                            continue block56;
                        }
lbl172:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ 1733220349;
                        continue block56;
                        case -1735251597: {
                            this.nE(mf.k);
                            ** continue;
                        }
                        case -481286383: {
                            continue block53;
                        }
lbl179:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ 1322858611;
                        continue block56;
                        case -1894331569: 
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private int nt(class_638 var1_1) {
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
     * Enabled aggressive block sorting
     */
    private int nu() {
        block37: {
            var8_1 = 231807955;
            var5_2 = dJ.q & 231807955 ^ -1291344119;
            var7_3 = 0;
            var6_4 = (var5_2 | var8_1) ^ -169038251;
            var7_3 = (var5_2 | var8_1) ^ -1264882452;
            break block37;
lbl7:
            // 1 sources

            while (true) {
                var7_3 = (var5_2 | var8_1) ^ 292737486;
                break block37;
                break;
            }
lbl10:
            // 1 sources

            block28: while (true) {
                block38: {
                    block40: {
                        block41: {
                            block39: {
                                switch (var7_3) {
                                    default: {
                                        continue block28;
                                    }
                                    case 458098184: {
                                        break block38;
                                    }
                                    case -328970533: {
                                        ** break;
                                    }
                                    case 897092528: {
                                        var6_4 ^= var7_3 ^ 696484515;
                                        var7_3 = (var5_2 | var8_1) ^ -440880431;
                                        continue block28;
                                    }
                                    case 1688758761: {
                                        if (var4_8.method_26215()) break block39;
                                        ** GOTO lbl31
                                    }
                                    case 803380245: {
                                        ** GOTO lbl29
                                    }
lbl27:
                                    // 1 sources

                                    var7_3 = (var5_2 | var8_1) ^ -1104038179;
                                    continue block28;
lbl29:
                                    // 1 sources

                                    var7_3 = (var5_2 | var8_1) ^ -612379086;
                                    continue block28;
lbl31:
                                    // 1 sources

                                    var7_3 = (var5_2 | var8_1) ^ 1404301568;
                                    continue block28;
                                    case -694674395: {
                                        var6_4 ^= var7_3 ^ -1972305964;
                                        break block40;
                                    }
                                    case 31852806: {
                                        ++var1_5;
                                        break block39;
                                    }
                                    case 1517227274: 
                                }
                                if (var4_8 != null) break block41;
                            }
                            var7_3 = (var5_2 | var8_1) ^ 1766827006;
                            continue;
                        }
                        var7_3 = (var5_2 | var8_1) ^ -1875565618;
                        continue;
                    }
                    var7_3 = (var5_2 | var8_1) ^ -1533429293;
                    continue;
                }
lbl51:
                // 2 sources

                while (true) {
                    var7_3 = (var5_2 | var8_1) ^ 1447936612;
                    if (true) ** GOTO lbl63
                    break;
                }
                break;
            }
            while (true) {
                var7_3 = (var5_2 | var8_1) ^ 2081052756;
                break block37;
                break;
            }
lbl57:
            // 1 sources

            while (true) {
                var6_4 ^= 1722930720;
                var2_6 = this.a.footprint().iterator();
                ** continue;
                break;
            }
            block32: while (true) {
                var7_3 = (var5_2 | var8_1) ^ -957653080;
lbl63:
                // 2 sources

                while (true) {
                    block42: {
                        switch (var7_3) {
                            case -839664057: {
                                var6_4 ^= var7_3 ^ 1230836806;
                                ** break;
                            }
                            case -1416603469: {
                                var3_7 = var2_6.next();
                                break block32;
                            }
lbl71:
                            // 1 sources

                            var7_3 = (var5_2 | var8_1) ^ 340256616;
                            break;
                            case -375751233: {
                                var6_4 ^= var7_3 ^ 1586623742;
                                var7_3 = (var5_2 | var8_1) ^ -360146568;
                                break;
                            }
                            case 1432299171: {
                                if (!var2_6.hasNext()) continue block32;
                                break block42;
                            }
                            case -1195138430: {
                                return var1_5;
                            }
                            case 2034032755: {
                                var6_4 ^= var7_3 ^ 965894119;
                                ** break;
lbl85:
                                // 1 sources

                                var7_3 = (var5_2 | var8_1) ^ 118758745;
                            }
                        }
                        continue;
                    }
                    var7_3 = (var5_2 | var8_1) ^ 1914962332;
                }
                break;
            }
            var6_4 ^= 1941359010;
            var4_8 = this.a.states().get(var3_7);
            var7_3 = (var5_2 | var8_1) ^ -1968229269;
            ** while (true)
        }
        block34: while (true) {
            switch (var7_3) {
                default: {
                    continue block34;
                }
                case -1364890091: {
                    var6_4 ^= var7_3 ^ 1568292879;
                    var7_3 = (var5_2 | var8_1) ^ -987425512;
                    continue block34;
                }
                case 189584183: {
                    break;
                }
                case -1986942406: {
                    var6_4 ^= var7_3 ^ 1915492159;
                    var7_3 = (var5_2 | var8_1) ^ 1204792567;
                    continue block34;
                }
                case 2062723779: {
                    return 0;
                }
                case -1008867441: {
                    var6_4 ^= var7_3 ^ -887659230;
                    var7_3 = (var5_2 | var8_1) ^ 1829965353;
                    continue block34;
                }
                case -132639956: {
                    if (this.a != null) ** continue;
                    ** continue;
                }
                case -758861326: {
                    var1_5 = 0;
                    ** continue;
                }
            }
            var7_3 = (var5_2 | var8_1) ^ 910562785;
        }
    }

    /*
     * Exception decompiling
     */
    private void nv(class_310 var1_1, class_638 var2_2) {
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
     * Enabled aggressive block sorting
     */
    private void nw(class_310 var1_1) {
        block100: {
            block101: {
                block98: {
                    block99: {
                        var20_2 = 943864096;
                        var17_3 = dJ.q & 943864096 ^ 930424458;
                        var19_4 = 0;
                        var18_18 = (var17_3 | var20_2) ^ 1358706500;
                        var19_4 = (var17_3 | var20_2) ^ -423337468;
                        if (true) ** GOTO lbl46
lbl7:
                        // 1 sources

                        while (true) {
                            var19_4 = (var17_3 | var20_2) ^ -2046766629;
                            ** GOTO lbl236
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var19_4 = (var17_3 | var20_2) ^ 1640055022;
                            break block98;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var18_18 ^= -813400834;
                            var14_16 = mj.trace(var13_15[0], var13_15[1]);
                            var19_4 = (var17_3 | var20_2) ^ 838358917;
                            break block98;
                            break;
                        }
lbl18:
                        // 1 sources

                        while (true) {
                            var19_4 = (var17_3 | var20_2) ^ -1092200650;
                            ** GOTO lbl236
                            while (true) {
                                var19_4 = (var17_3 | var20_2) ^ 1491653019;
                                ** GOTO lbl236
                                break;
                            }
                            break;
                        }
                        while (true) {
                            switch (var19_4) {
                                case -642556498: {
                                    ** break;
                                }
                                case -1344971437: {
                                    var2_5 = this.a.target();
                                    var18_18 ^= 2087101254;
                                    var3_6 = var1_1.field_1724.method_33571();
                                    var18_18 ^= -215640299;
                                    var4_7 = null;
                                    var18_18 ^= 1925706374;
                                    var5_8 = -1.7976931348623157E308;
                                    var18_18 ^= -594034805;
                                    var7_9 = class_2350.values();
                                    var8_10 = var7_9.length;
                                    var9_11 = 0;
                                    ** GOTO lbl202
                                }
lbl41:
                                // 1 sources

                                var19_4 = (var17_3 | var20_2) ^ -1257212950;
                                break;
                                case -1972941760: {
                                    var18_18 ^= var19_4 ^ 700801479;
                                    var19_4 = (var17_3 | var20_2) ^ -1868406023;
                                }
                            }
lbl46:
                            // 4 sources

                        }
lbl47:
                        // 1 sources

                        while (true) {
                            var19_4 = (var17_3 | var20_2) ^ -534148671;
                            break block99;
                            break;
                        }
                        while (true) {
                            var19_4 = (var17_3 | var20_2) ^ -589342453;
                            break block98;
lbl53:
                            // 1 sources

                            while (true) {
                                var19_4 = (var17_3 | var20_2) ^ -1960497428;
                                break block98;
                                break;
                            }
                            break;
                        }
lbl56:
                        // 1 sources

                        while (true) {
                            var19_4 = (var17_3 | var20_2) ^ -1536556218;
                            ** GOTO lbl236
lbl59:
                            // 1 sources

                            while (true) {
                                var19_4 = (var17_3 | var20_2) ^ -791659010;
                                break block100;
                                break;
                            }
lbl62:
                            // 1 sources

                            while (true) {
                                var19_4 = (var17_3 | var20_2) ^ -157038812;
                                ** GOTO lbl236
                                break;
                            }
                            while (true) {
                                var19_4 = (var17_3 | var20_2) ^ -2059693215;
                                break block100;
                                break;
                            }
                            break;
                        }
                    }
                    block72: while (true) {
                        block102: {
                            switch (var19_4) {
                                case -1637254409: {
                                    var18_18 ^= var19_4 ^ 452676291;
                                    break;
                                }
                                case 1513488753: {
                                    if (var15_17 > var5_8) {
                                        var19_4 = (var17_3 | var20_2) ^ -1570554109;
                                        continue block72;
                                    }
                                    break block101;
                                }
                                case -1659633495: {
                                    var18_18 ^= var19_4 ^ 428224669;
                                    ** continue;
                                }
                                case -547441045: {
                                    var5_8 = var15_17;
                                    ** break;
                                }
                                case 1004715784: {
                                    var18_18 ^= var19_4 ^ -292307731;
                                    break block102;
                                }
lbl88:
                                // 1 sources

                                var19_4 = (var17_3 | var20_2) ^ -1591851683;
                                continue block72;
                                case 732934766: {
                                    var4_7 = var10_12;
                                    break block101;
                                }
                            }
                            var19_4 = (var17_3 | var20_2) ^ 349736388;
                            continue;
                        }
                        var19_4 = (var17_3 | var20_2) ^ 1698774747;
lbl98:
                        // 2 sources

                    }
lbl99:
                    // 1 sources

                    while (true) {
                        var19_4 = (var17_3 | var20_2) ^ -595395506;
                        ** GOTO lbl236
                        break;
                    }
lbl102:
                    // 1 sources

                    while (true) {
                        var19_4 = (var17_3 | var20_2) ^ -1562021740;
                        break block98;
                        break;
                    }
lbl105:
                    // 1 sources

                    while (true) {
                        var19_4 = (var17_3 | var20_2) ^ -117134419;
                        ** GOTO lbl236
                        break;
                    }
                }
                block77: while (true) {
                    block103: {
                        switch (var19_4) {
                            case 1589018436: {
                                var19_4 = (var17_3 | var20_2) ^ -212820959;
                                continue block77;
                            }
                            case -869817461: {
                                if (var14_16.method_17783() == class_239.class_240.field_1332) {
                                    var19_4 = (var17_3 | var20_2) ^ 789204957;
                                    continue block77;
                                }
                                break block101;
                            }
                            case 276656247: {
                                var18_18 ^= var19_4 ^ 310192591;
                                ** continue;
                            }
                            case 244279343: {
                                var18_18 ^= var19_4 ^ 545692093;
                                ** break;
                            }
                            case -475502943: {
                                var18_18 ^= var19_4 ^ -1440785360;
                                var19_4 = (var17_3 | var20_2) ^ 118551;
                                continue block77;
                            }
                            case -1269690042: {
                                break;
                            }
                            case -1651355842: {
                                break block101;
                            }
                            case 1064759485: {
                                var15_17 = (double)(-Math.abs(var13_15[1])) - var12_14.method_1025(var3_6) * 0.01;
                                var19_4 = (var17_3 | var20_2) ^ 76906658;
                                ** GOTO lbl98
                            }
                            case -1584022190: {
                                if (var14_16 != null) {
                                    ** continue;
                                }
                                break block101;
                            }
lbl141:
                            // 1 sources

                            var19_4 = (var17_3 | var20_2) ^ -1629322504;
                            break block103;
                            case 1484261177: {
                                var18_18 ^= var19_4 ^ -994165171;
                                ** break;
lbl146:
                                // 1 sources

                                ** continue;
                            }
                        }
                        var18_18 ^= -1631166260;
                        if (var14_16.method_17777().equals((Object)var2_5)) ** continue;
                        var19_4 = (var17_3 | var20_2) ^ 1729050771;
                    }
                }
lbl152:
                // 1 sources

                while (true) {
                    var19_4 = (var17_3 | var20_2) ^ -296092205;
                    break block100;
                    break;
                }
lbl155:
                // 1 sources

                while (true) {
                    var19_4 = (var17_3 | var20_2) ^ 2119751057;
                    ** GOTO lbl236
                    break;
                }
lbl158:
                // 1 sources

                while (true) {
                    var11_13 = var2_5.method_10093(var10_12);
                    ** continue;
                    break;
                }
lbl161:
                // 1 sources

                while (true) {
                    var18_18 ^= 1880280701;
                    var13_15 = eA.getRotationsTo(var3_6, var12_14);
                    ** continue;
                    break;
                }
            }
lbl166:
            // 2 sources

            while (true) {
                var19_4 = (var17_3 | var20_2) ^ -1345111773;
                break block100;
                break;
            }
lbl169:
            // 1 sources

            while (true) {
                var19_4 = (var17_3 | var20_2) ^ -1454039068;
                ** GOTO lbl236
                break;
            }
        }
        block84: while (true) {
            block105: {
                block104: {
                    switch (var19_4) {
                        default: {
                            continue block84;
                        }
                        case -291007626: {
                            ++var9_11;
                            break;
                        }
                        case -274267564: {
                            var18_18 ^= var19_4 ^ 119425545;
                            var19_4 = (var17_3 | var20_2) ^ 1798002317;
                            continue block84;
                        }
                        case -1868298615: {
                            var18_18 ^= var19_4 ^ -619049399;
                            var19_4 = (var17_3 | var20_2) ^ -774853412;
                            continue block84;
                        }
                        case 1819844941: {
                            ** continue;
                        }
                        case 2013538078: {
                            var12_14 = dJ.nx(var2_5, var10_12);
                            ** continue;
                        }
                        case -1169380149: {
                            var18_18 ^= var19_4 ^ -717368138;
                            break block104;
                        }
                        case 1415342375: {
                            if (this.a.isClear(var1_1.field_1687, var11_13)) ** continue;
                            ** continue;
                        }
                        case -785464711: {
                            var18_18 ^= var19_4 ^ 801175829;
                            break block105;
                        }
                    }
lbl202:
                    // 2 sources

                    var19_4 = (var17_3 | var20_2) ^ 781100669;
                    ** GOTO lbl236
                }
                var19_4 = (var17_3 | var20_2) ^ 1198725300;
                continue;
            }
            var19_4 = (var17_3 | var20_2) ^ 1393532647;
        }
lbl210:
        // 1 sources

        while (true) {
            var19_4 = (var17_3 | var20_2) ^ -122926868;
            ** GOTO lbl236
            break;
        }
lbl213:
        // 1 sources

        while (true) {
            var19_4 = (var17_3 | var20_2) ^ 1612084739;
            ** GOTO lbl236
            break;
        }
lbl216:
        // 1 sources

        while (true) {
            var19_4 = (var17_3 | var20_2) ^ -2048135234;
            if (true) ** GOTO lbl236
            break;
        }
        block88: while (true) {
            var19_4 = (var17_3 | var20_2) ^ 1601278349;
            ** GOTO lbl236
lbl222:
            // 1 sources

            while (true) {
                var19_4 = (var17_3 | var20_2) ^ -18824298;
                ** GOTO lbl236
                while (true) {
                    var19_4 = (var17_3 | var20_2) ^ 1474444280;
                    ** GOTO lbl236
                    break;
                }
                break;
            }
lbl228:
            // 1 sources

            while (true) {
                var19_4 = (var17_3 | var20_2) ^ -604433812;
                if (true) ** GOTO lbl236
                break;
            }
lbl231:
            // 1 sources

            while (true) {
                var18_18 ^= -140500858;
                ** continue;
                break;
            }
            block93: while (true) {
                var19_4 = (var17_3 | var20_2) ^ -1712886922;
lbl236:
                // 18 sources

                block94: while (true) {
                    switch (var19_4) {
                        default: {
                            continue block94;
                        }
                        case 1600211369: {
                            if (var4_7 != null) ** continue;
                            ** continue;
                        }
                        case 1093659195: {
                            return;
                        }
                        case 1392697226: {
                            var18_18 ^= var19_4 ^ 922547590;
                            ** continue;
                        }
                        case -1692582676: {
                            var18_18 ^= var19_4 ^ -1357976620;
                            var19_4 = (var17_3 | var20_2) ^ -1696427314;
                            continue block94;
                        }
                        case -1183322511: {
                            var18_18 ^= var19_4 ^ -600444856;
                            var19_4 = (var17_3 | var20_2) ^ 1663020434;
                            continue block94;
                        }
                        case -2121176932: {
                            if (var9_11 >= var8_10) ** continue;
                            ** continue;
                        }
                        case -1516917404: {
                            this.b = false;
                            ** continue;
                        }
                        case 1738534449: {
                            var18_18 ^= var19_4 ^ -182452894;
                            ** continue;
                        }
                        case 301570519: {
                            var18_18 ^= var19_4 ^ -1744994308;
                            ** continue;
                        }
                        case -908789618: {
                            var18_18 ^= var19_4 ^ -645964597;
                            ** continue;
                        }
                        case -1500490532: {
                            var18_18 ^= var19_4 ^ 1301712884;
                            ** continue;
                        }
                        case -1047004100: {
                            var18_18 ^= var19_4 ^ 1206298114;
                            ** continue;
                        }
                        case -965503993: {
                            return;
                        }
                        case -1370981819: {
                            this.b = true;
                            ** continue;
                        }
                        case -1164128236: {
                            this.a = this.ny(dJ.nx(var2_5, var4_7), var4_7, var2_5);
                            var19_4 = (var17_3 | var20_2) ^ 1819664416;
                            continue block94;
                        }
                        case 1611050535: {
                            var10_12 = var7_9[var9_11];
                            ** continue;
                        }
                        case 1550357048: {
                            this.a = var4_7;
                            ** continue;
                        }
                        case -1776148402: {
                            this.a = class_2350.field_11036;
                            continue block93;
                        }
                        case -460444218: {
                            this.a = class_243.method_24953((class_2382)var2_5);
                            ** continue;
                        }
                        case 1754596434: {
                            var18_18 ^= var19_4 ^ -1223670128;
                            var19_4 = (var17_3 | var20_2) ^ -1858124305;
                            continue block94;
                        }
                        case -941918394: {
                            var18_18 ^= var19_4 ^ -342439398;
                            continue block88;
                        }
                        case -470432796: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        var18_18 ^= var19_4 ^ -2015190565;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static class_243 nx(class_2338 var0, class_2350 var1_1) {
        block11: {
            break block11;
lbl1:
            // 1 sources

            block9: while (true) {
                switch (var3_4) {
                    default: {
                        var3_4 ^= 2121769567;
                        continue block9;
                    }
                    case -1602347194: {
                        var3_4 ^= 1752683754;
                        return v0.method_1031(v1, v2, v3);
                    }
                    case 1586738554: 
                }
                var3_4 ^= -475116828;
                return v0.method_1031(v1, v2, v3);
            }
        }
        var2_2 = dJ.q & 154604833 ^ 260960000;
        var4_3 = 0;
        var3_4 = (var2_2 | 154604833) ^ -1336021026;
        var4_3 = (var2_2 | 154604833) ^ -1220183838;
        block10: while (true) {
            switch (var4_3) {
                default: {
                    continue block10;
                }
                case -119123431: {
                    v0 = class_243.method_24953((class_2382)var0);
                    v1 = (double)var1_1.method_10148() * 0.5;
                    var3_4 ^= 1903805175;
                    v2 = (double)var1_1.method_10164() * 0.5;
                    v3 = (double)var1_1.method_10165() * 0.5;
                    ** continue;
                }
                case 1637723357: {
                    var3_4 ^= var4_3 ^ -241841233;
                    var4_3 = (var2_2 | 154604833) ^ -145117896;
                    continue block10;
                }
                case -1191540797: 
            }
            var4_3 = (var2_2 | 154604833) ^ 1847743484;
        }
    }

    /*
     * Exception decompiling
     */
    private class_243 ny(class_243 var1_1, class_2350 var2_2, class_2338 var3_3) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private class_3965 nz(class_2338 var1_1) {
        var6_2 = -1713512218;
        var3_3 = dJ.q & -1713512218 ^ 900041998;
        var5_4 = 0;
        var4_5 = (var3_3 | var6_2) ^ 1232375803;
        var5_4 = (var3_3 | var6_2) ^ 1280145528;
        ** GOTO lbl60
        while (true) {
            var5_4 = (var3_3 | var6_2) ^ 72144839;
            if (true) ** GOTO lbl21
            break;
        }
        while (true) {
            block24: {
                var5_4 = (var3_3 | var6_2) ^ -1896923193;
                break block24;
lbl13:
                // 3 sources

                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ -1858874352;
                    ** GOTO lbl21
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ 749727606;
                    ** GOTO lbl21
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ 1373256635;
lbl21:
                    // 4 sources

                    block22: while (true) {
                        switch (var5_4) {
                            default: {
                                continue block22;
                            }
                            case -1179567575: {
                                var4_5 ^= var5_4 ^ -803424918;
                                var5_4 = (var3_3 | var6_2) ^ 640353790;
                                continue block22;
                            }
                            case 1838891601: {
                                var4_5 ^= -492652242;
                                if (var2_6.method_17777().equals((Object)var1_1)) ** continue;
                                ** GOTO lbl13
                            }
                            case -332933547: {
                                var4_5 ^= var5_4 ^ 588384160;
                                var5_4 = (var3_3 | var6_2) ^ 1668188715;
                                continue block22;
                            }
                            case -560764987: {
                                if (var2_6 == null) ** GOTO lbl13
                                var5_4 = (var3_3 | var6_2) ^ -248711157;
                                continue block22;
                            }
                            case -1856896360: {
                                var4_5 ^= var5_4 ^ 1945156534;
                                var5_4 = (var3_3 | var6_2) ^ -798576705;
                                continue block22;
                            }
                            case 751712766: {
                                var4_5 ^= var5_4 ^ 645951623;
                                var5_4 = (var3_3 | var6_2) ^ 1272318424;
                                continue block22;
                            }
                            case -1732780773: {
                                if (var2_6.method_17783() == class_239.class_240.field_1332) ** break;
                                ** continue;
                                ** continue;
                            }
                            case 1288771045: {
                                var5_4 = (var3_3 | var6_2) ^ 625619189;
                                continue block22;
                            }
                            case -1680414704: {
                                return var2_6;
                            }
                            case -164895690: 
                        }
                        break;
                    }
                    return null;
                }
            }
            block23: while (true) {
                switch (var5_4) {
                    default: {
                        continue block23;
                    }
                    case 856871465: {
                        var4_5 ^= var5_4 ^ 1676760687;
                        var5_4 = (var3_3 | var6_2) ^ -1061976427;
                        continue block23;
                    }
                    case 2102291323: {
                        var2_6 = mj.trace();
                        ** continue;
                    }
                    case -240085610: 
                }
                break;
            }
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void nA() {
        var4_1 = 1655263657;
        var1_2 = dJ.q & 1655263657 ^ -334907755;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 609672714;
        var3_3 = (var1_2 | var4_1) ^ -1394681338;
        ** GOTO lbl70
lbl7:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -780596409;
            if (true) ** GOTO lbl20
            break;
        }
        block20: while (true) {
            if (this.a.drill()) {
                var2_4 ^= -1899997008;
                v0 = " (" + this.b.size() + " blocks)";
            } else {
                var2_4 ^= -1899997008;
                v0 = "";
            }
            var2_4 ^= -1701126908;
            this.o = "cleared " + v1 + (String)v0;
            var3_3 = (var1_2 | var4_1) ^ -136730519;
lbl20:
            // 2 sources

            block21: while (true) {
                switch (var3_3) {
                    case -1709578791: {
                        var2_4 ^= var3_3 ^ -1602380772;
                        ** GOTO lbl43
                    }
                    case 1115106747: {
                        var3_3 = (var1_2 | var4_1) ^ 1957696100;
                        continue block21;
                    }
                    case 1616546878: {
                        var2_4 ^= var3_3 ^ 603065996;
                        ** break;
                    }
                    case 1154165766: {
                        var2_4 ^= var3_3 ^ -415355467;
                        var3_3 = (var1_2 | var4_1) ^ -1194734398;
                        continue block21;
                    }
                    case 1449147263: {
                        v1 = this.a.target().method_23854();
                        ** GOTO lbl72
                    }
                    case 1070660858: {
                        var2_4 ^= var3_3 ^ -1105785286;
                        ** break;
                    }
lbl41:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1095826537;
                    ** GOTO lbl70
lbl43:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1331915637;
                    ** GOTO lbl70
                    case -720870764: {
                        this.a = false;
                        ** GOTO lbl61
                    }
                    case -1580557112: {
                        this.a.clearLocation(this.a.target());
                        var3_3 = (var1_2 | var4_1) ^ -1436361797;
                        ** GOTO lbl70
                    }
lbl52:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1000445225;
                    continue block21;
                    case 1709522398: {
                        this.a = mf.d;
                        ** continue;
                    }
                    case -1148731893: {
                        this.a = me.i;
                        var3_3 = (var1_2 | var4_1) ^ 1250876685;
                        continue block21;
                    }
lbl61:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -1896645757;
                    continue block21;
                    case 426794964: {
                        var2_4 ^= var3_3 ^ -1744728004;
                        var3_3 = (var1_2 | var4_1) ^ 1429096886;
                        ** GOTO lbl70
                    }
                    case -1540937040: {
                        var2_4 ^= var3_3 ^ 1457142496;
                        var3_3 = (var1_2 | var4_1) ^ -1957901725;
                    }
lbl70:
                    // 7 sources

                    default: {
                        continue block21;
                    }
lbl72:
                    // 1 sources

                    block22: while (true) {
                        switch (var2_4) {
                            case 1399738817: {
                                var2_4 ^= -1916508479;
                                continue block20;
                            }
                            default: {
                                var2_4 ^= -1646739954;
                                continue block22;
                            }
                            case 295288203: 
                        }
                        break;
                    }
                    var2_4 ^= 876432531;
                    continue block20;
                    case -1342633004: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void nB(class_310 var1_1, String var2_2) {
        block23: {
            var6_3 = 1786120465;
            var3_4 = dJ.q & 1786120465 ^ 914708219;
            var5_5 = 0;
            var4_6 = (var3_4 | var6_3) ^ 645536998;
            var5_5 = (var3_4 | var6_3) ^ 314288626;
            ** GOTO lbl81
lbl7:
            // 2 sources

            while (true) {
                var4_6 ^= -1895916132;
                break block23;
                break;
            }
            while (true) {
                var4_6 ^= 1771548851;
                v0 = this.a.target();
                ** GOTO lbl7
                break;
            }
lbl14:
            // 1 sources

            while (true) {
                var4_6 ^= 1771548851;
                v0 = null;
                ** continue;
                break;
            }
        }
        this.a.record(var2_2, v0, this.a.tick());
        var5_5 = (var3_4 | var6_3) ^ -549162420;
        block22: while (true) {
            switch (var5_5) {
                case 1955435984: {
                    var4_6 ^= var5_5 ^ 43523334;
                    var5_5 = (var3_4 | var6_3) ^ -625425395;
                    continue block22;
                }
                case 23485387: {
                    var4_6 ^= var5_5 ^ 969860666;
                    var5_5 = (var3_4 | var6_3) ^ 2106026124;
                    continue block22;
                }
                case 1627760012: {
                    var4_6 ^= var5_5 ^ -195489836;
                    var5_5 = (var3_4 | var6_3) ^ -1801661443;
                    continue block22;
                }
                case -362050554: {
                    this.a = me.d;
                    var5_5 = (var3_4 | var6_3) ^ -51783894;
                    continue block22;
                }
                case 0x3703777: {
                    this.nm(var1_1);
                    var5_5 = (var3_4 | var6_3) ^ 2026737182;
                    continue block22;
                }
                case 1816983049: {
                    var5_5 = (var3_4 | var6_3) ^ 2140210224;
                    continue block22;
                }
                case 104518117: {
                    var4_6 ^= var5_5 ^ -192705296;
                    var5_5 = (var3_4 | var6_3) ^ -1749125729;
                    continue block22;
                }
                case -2019197941: {
                    var4_6 ^= var5_5 ^ -2087385110;
                    ** GOTO lbl80
                }
                case -1538286602: {
                    this.o = "failed: " + var2_2;
                    var5_5 = (var3_4 | var6_3) ^ 536017527;
                    continue block22;
                }
                case -2111928111: {
                    var4_6 ^= var5_5 ^ -310367891;
                    var5_5 = (var3_4 | var6_3) ^ 10777796;
                    continue block22;
                }
                case -1582092873: {
                    var4_6 ^= var5_5 ^ 557576586;
                    var5_5 = (var3_4 | var6_3) ^ -2102110388;
                    continue block22;
                }
                case 2119379775: {
                    this.a = mf.d;
                    var5_5 = (var3_4 | var6_3) ^ -112057360;
                    continue block22;
                }
                case 1328676657: {
                    this.g = var2_2;
                    var5_5 = (var3_4 | var6_3) ^ 175819307;
                    continue block22;
                }
                case -381080988: {
                    this.a.release(this);
                    ** break;
                }
                case -62715721: {
                    return;
                }
lbl78:
                // 1 sources

                var5_5 = (var3_4 | var6_3) ^ 103447361;
                ** GOTO lbl81
lbl80:
                // 1 sources

                var5_5 = (var3_4 | var6_3) ^ -1837943512;
lbl81:
                // 4 sources

                default: {
                    continue block22;
                }
                case -326866221: {
                    if (this.a != null) ** continue;
                    ** continue;
                }
                case 2027758778: 
            }
            var4_6 ^= var5_5 ^ -2135531740;
            var5_5 = (var3_4 | var6_3) ^ 835100874;
        }
    }

    private static int nC(int n2, int n3) {
        int n4 = 216273892;
        int n5 = -1473784496;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x7CD886CF)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xACE782BF;
        n6 ^= (n5 | n4) ^ 0xACE7C1D7;
        n6 -= (n5 | n4) ^ 0xACE70482;
        n6 -= (n5 | n4) ^ 0xACE70B4C;
        n6 ^= (n5 | n4) ^ 0xACE72D27;
        n6 -= (n5 | n4) ^ 0xACE733F5;
        n6 -= (n5 | n4) ^ 0xACE7034D;
        n6 -= (n5 | n4) ^ 0xACE7CC0D;
        n6 ^= (n5 | n4) ^ 0xACE741C5;
        return n6 += (n5 | n4) ^ 0xACE7AE8C;
    }

    /*
     * Unable to fully structure code
     */
    private void nD(String var1_1) {
        block36: {
            block32: {
                block33: {
                    block35: {
                        block34: {
                            break block34;
lbl1:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 2083537209;
                                break block32;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -2002882356;
                                break block32;
lbl7:
                                // 1 sources

                                return;
                            }
                        }
                        var5_2 = 1384622991;
                        var2_3 = dJ.q & 1384622991 ^ 1260032100;
                        var4_4 = 0;
                        break block35;
lbl14:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1370871462;
                            break block32;
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ -21859238;
                            var4_4 = (var2_3 | var5_2) ^ 1636807795;
                            break block32;
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            this.a = me.d;
                            ** continue;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1634621280;
                            break block32;
lbl27:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -2093928515;
                                break block32;
lbl30:
                                // 1 sources

                                while (true) {
                                    var3_5 ^= var4_4 ^ 835841413;
                                    break block33;
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                    }
                    var3_5 = (var2_3 | var5_2) ^ -191057589;
                    var4_4 = (var2_3 | var5_2) ^ 713414385;
                    break block32;
lbl37:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ 734313289;
                        ** GOTO lbl71
                        break;
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ 2018053339;
            }
lbl45:
            // 5 sources

            block28: while (true) {
                switch (var4_4) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block28;
                        }
                        break;
                    }
                    case -754857181: {
                        ** continue;
                    }
                    case -566642021: {
                        ** continue;
                    }
                    case -599998008: {
                        ** continue;
                    }
                    case 1203887949: {
                        ** continue;
                    }
                    case 601274164: {
                        ** continue;
                    }
                    case -1927565846: {
                        ** continue;
                    }
                    case 642813885: {
                        var3_5 ^= var4_4 ^ 808780918;
                        break block28;
                    }
                    case 974131100: {
                        this.a.release(this);
                        break;
                    }
                    case -1786657205: {
                        var3_5 ^= var4_4 ^ 1082175294;
                        ** continue;
                    }
lbl71:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -2019329497;
                    ** GOTO lbl-1000
lbl73:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -2052718220;
                        ** GOTO lbl-1000
                        break;
                    }
lbl76:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 2110731346;
                        ** continue;
                        break;
                    }
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ 1492545417;
            ** GOTO lbl45
            this.o = "failed: " + var1_1;
            var4_4 = (var2_3 | var5_2) ^ -695986683;
            ** GOTO lbl45
            {
                case 57267302: {
                    this.a.record(var1_1, null, this.a.tick());
                    ** continue;
                }
                case 988933263: {
                    this.a = mf.d;
                    ** continue;
                }
                case -659647406: {
                    var3_5 ^= var4_4 ^ -1994150888;
                    ** continue;
                }
                case 665844438: {
                    this.g = var1_1;
                    break block36;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ -836862556;
            ** GOTO lbl45
            {
                case 1897557278: {
                    ** continue;
                }
                ** case -170552651:
            }
lbl101:
            // 1 sources

            var3_5 ^= var4_4 ^ 790569895;
            ** while (true)
        }
        var4_4 = (var2_3 | var5_2) ^ 475948194;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void nE(mf var1_1) {
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
    public jg visibleState() {
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
    private /* synthetic */ boolean nF(long var1_1, class_310 var3_2, Map.Entry var4_3) {
        block74: {
            block76: {
                var9_4 = 155842927;
                var6_5 = dJ.q & 155842927 ^ 1827050384;
                var8_6 = 0;
                ** GOTO lbl164
lbl5:
                // 1 sources

                while (true) {
                    var8_6 = (var6_5 | var9_4) ^ 18128577;
                    ** GOTO lbl106
lbl8:
                    // 1 sources

                    while (true) {
                        var8_6 = (var6_5 | var9_4) ^ -1316143739;
                        ** GOTO lbl106
                        break;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var7_8 ^= var8_6 ^ -1217439839;
                        ** continue;
                        break;
                    }
lbl14:
                    // 1 sources

                    return false;
                }
lbl16:
                // 1 sources

                while (true) {
                    var8_6 = (var6_5 | var9_4) ^ 455599056;
                    break block74;
                    break;
                }
lbl19:
                // 1 sources

                return false;
lbl21:
                // 1 sources

                while (true) {
                    var8_6 = (var6_5 | var9_4) ^ -581201180;
                    ** GOTO lbl106
lbl24:
                    // 1 sources

                    while (true) {
                        var8_6 = (var6_5 | var9_4) ^ -822195339;
                        ** GOTO lbl106
                        while (true) {
                            var8_6 = (var6_5 | var9_4) ^ -2064582844;
                            ** GOTO lbl106
lbl30:
                            // 1 sources

                            while (true) {
                                var8_6 = (var6_5 | var9_4) ^ -1463961183;
                                ** GOTO lbl106
                                break;
                            }
lbl33:
                            // 1 sources

                            while (true) {
                                var8_6 = (var6_5 | var9_4) ^ -1055005693;
                                ** GOTO lbl106
                                break;
                            }
lbl36:
                            // 1 sources

                            return true;
                        }
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var8_6 = (var6_5 | var9_4) ^ -923066775;
                    ** GOTO lbl106
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    var8_6 = (var6_5 | var9_4) ^ -1441460356;
                    break block74;
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    this.a.record("the server put " + var5_7.method_23854() + " back", var5_7, var1_1);
                    ** continue;
                    break;
                }
lbl47:
                // 1 sources

                while (true) {
                    var7_8 ^= var8_6 ^ 2130383698;
                    ** GOTO lbl154
                    break;
                }
lbl50:
                // 1 sources

                while (!var3_2.field_1687.method_8320(var5_7).method_26215()) {
                    block75: {
                        ** GOTO lbl156
lbl52:
                        // 2 sources

                        while (true) {
                            var8_6 = (var6_5 | var9_4) ^ -509841824;
                            ** GOTO lbl106
                            break;
                        }
lbl55:
                        // 1 sources

                        while (true) {
                            var8_6 = (var6_5 | var9_4) ^ 1875341040;
                            ** GOTO lbl106
lbl58:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl60:
                            // 1 sources

                            while (true) {
                                var7_8 ^= var8_6 ^ -637012828;
                                break block75;
                                break;
                            }
lbl63:
                            // 2 sources

                            while (true) {
                                var8_6 = (var6_5 | var9_4) ^ -252983626;
                                ** GOTO lbl106
                                break;
                            }
lbl66:
                            // 1 sources

                            while (true) {
                                var8_6 = (var6_5 | var9_4) ^ 2089789048;
                                ** GOTO lbl106
                                break;
                            }
                            break;
                        }
lbl69:
                        // 1 sources

                        while (true) {
                            var8_6 = (var6_5 | var9_4) ^ 1616461929;
                            ** GOTO lbl106
lbl72:
                            // 1 sources

                            while (true) {
                                var7_8 ^= var8_6 ^ 416879379;
                                ** GOTO lbl63
                                break;
                            }
                            break;
                        }
                        this.a.mark(var5_7, gJ.E, this.a.currentPlaneY());
                        var8_6 = (var6_5 | var9_4) ^ -2137801296;
                        ** GOTO lbl106
lbl78:
                        // 1 sources

                        while (true) {
                            var8_6 = (var6_5 | var9_4) ^ -1128912509;
                            ** GOTO lbl106
lbl81:
                            // 1 sources

                            while (true) {
                                var7_8 ^= var8_6 ^ 1194732276;
                                ** continue;
                                break;
                            }
                            break;
                        }
                    }
                    var8_6 = (var6_5 | var9_4) ^ 518523435;
                    ** GOTO lbl106
                }
                break block76;
lbl88:
                // 1 sources

                while (true) {
                    var8_6 = (var6_5 | var9_4) ^ -1586401276;
                    break block74;
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    var8_6 = (var6_5 | var9_4) ^ -907292807;
                    if (true) ** GOTO lbl106
                    break;
                }
                block65: while (true) {
                    var8_6 = (var6_5 | var9_4) ^ 1017684515;
                    if (true) ** GOTO lbl106
lbl97:
                    // 1 sources

                    while (true) {
                        var7_8 ^= var8_6 ^ -338691644;
                        ** continue;
                        break;
                    }
                    block67: while (true) {
                        block77: {
                            var8_6 = (var6_5 | var9_4) ^ -1145759940;
                            break block77;
lbl103:
                            // 1 sources

                            while (true) {
                                var7_8 ^= var8_6 ^ 1851863144;
                                ** GOTO lbl180
                                break;
                            }
                        }
lbl107:
                        // 3 sources

                        block69: while (true) {
                            switch (var8_6) lbl-1000:
                            // 5 sources

                            {
                                while (true) {
                                    default: {
                                        continue block69;
                                    }
                                    break;
                                }
                                case -1678349903: {
                                    ** continue;
                                }
                                case 1929900500: {
                                    ** continue;
                                }
                                case 1101208703: {
                                    ** continue;
                                }
                                case -1525357162: {
                                    ** continue;
                                }
                                case -1114844097: {
                                    ** continue;
                                }
                                case -1559121782: {
                                    ** continue;
                                }
                                case -1393418244: {
                                    ** GOTO lbl50
                                }
                                case -597506438: {
                                    ** continue;
                                }
                                case -1201175098: {
                                    ** continue;
                                }
                                case -1543228282: {
                                    ** continue;
                                }
                                case 1196547266: {
                                    ** GOTO lbl52
                                }
                                case 1363630556: {
                                    ** continue;
                                }
                                case -1660666551: {
                                    ** continue;
                                }
                                case -383841093: {
                                    ** continue;
                                }
                                case -310622641: {
                                    ** continue;
                                }
                                case -1330353893: {
                                    var7_8 ^= var8_6 ^ 1889180494;
                                    ** continue;
                                }
                                case 230079382: {
                                    this.a.reportMining("A block came back after breaking: " + var5_7.method_23854());
                                    continue block67;
                                }
                                case 1828414782: {
                                    if (jR.isLoaded(var3_2.field_1687, var5_7)) ** continue;
                                    ** continue;
                                }
                                case -782642564: {
                                    var7_8 ^= var8_6 ^ -646001011;
                                    ** continue;
                                }
lbl154:
                                // 1 sources

                                var8_6 = (var6_5 | var9_4) ^ 743237504;
                                ** GOTO lbl-1000
lbl156:
                                // 1 sources

                                var8_6 = (var6_5 | var9_4) ^ -166096306;
                                ** GOTO lbl-1000
                                case -698684221: {
                                    var7_8 ^= var8_6 ^ -965431336;
                                    break block65;
                                }
lbl161:
                                // 1 sources

                                while (true) {
                                    var5_7 = class_2338.method_10092((long)((Long)var4_3.getKey()));
                                    ** continue;
                                    break;
                                }
lbl164:
                                // 1 sources

                                var7_8 = (var6_5 | var9_4) ^ -1351235912;
                                ** continue;
                                while (true) {
                                    var8_6 = (var6_5 | var9_4) ^ 717104957;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case -1938582113: {
                                    switch (var7_8) {
                                        default: {
                                            ** continue;
                                        }
                                        case -1987194366: {
                                            ** continue;
                                        }
                                        ** case -1345201791:
lbl176:
                                        // 1 sources

                                        continue block65;
                                    }
                                }
                                case 291528071: {
                                    if (var1_1 <= (Long)var4_3.getValue()) ** continue;
                                    ** continue;
                                }
lbl180:
                                // 1 sources

                                var8_6 = (var6_5 | var9_4) ^ -798806080;
                                ** continue;
                                case 36214031: {
                                    var7_8 ^= var8_6 ^ -118611775;
                                    ** continue;
                                }
                                case -984464802: {
                                    var7_8 ^= var8_6 ^ -262854610;
                                    ** continue;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                var8_6 = (var6_5 | var9_4) ^ -774709151;
                ** GOTO lbl107
            }
            var8_6 = (var6_5 | var9_4) ^ -712475079;
            ** while (true)
            {
                ** case -1136845922:
            }
lbl194:
            // 1 sources

            return true;
        }
        block73: while (true) {
            switch (var8_6) {
                default: {
                    continue block73;
                }
                case 1992824879: {
                    ** continue;
                }
                case -862024709: {
                    ** continue;
                }
                case -939854717: 
            }
            break;
        }
        var7_8 ^= var8_6 ^ 1287907731;
        ** while (true)
    }
}

