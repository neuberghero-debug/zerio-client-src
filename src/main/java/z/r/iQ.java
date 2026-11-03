/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2561
 *  net.minecraft.class_2818
 *  net.minecraft.class_310
 *  net.minecraft.class_7923
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.LinkedHashSet;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2561;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_7923;
import z.r.dA;
import z.r.gF;
import z.r.gj;
import z.r.gr;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class iQ
extends gF {
    private long a;
    private long b;
    private final Set<String> a;
    private static final long c;
    private long d;
    private long e;
    private long f;
    private static final /* synthetic */ String a;
    private static final int a;
    private static final /* synthetic */ String b;
    public static final int c;
    private int b;
    private long g;
    private static volatile iQ a;
    private static final Set<class_2248> b;
    private static final /* synthetic */ String c;
    private static final int[] a;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String k;

    /*
     * Enabled aggressive block sorting
     */
    public static iQ getInstance() {
        int n2 = c & 0xE8F18D22 ^ 0x21FB98AA;
        int n3 = 0;
        int n4 = (n2 | 0xE8F18D22) ^ 0x5BAAFA18;
        n3 = (n2 | 0xE8F18D22) ^ 0x4BB6C92E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1571990396: {
                    break;
                }
                case -597691640: {
                    n4 ^= n3 ^ 0xEEEDF2D0;
                    n3 = (n2 | 0xE8F18D22) ^ 0xA56E54F7;
                    continue block5;
                }
                case 1284884829: {
                    return a;
                }
            }
            n3 = (n2 | 0xE8F18D22) ^ 0x35A46EA2;
        }
    }

    private static int MN(int n2, int n3) {
        int n4 = -674609162;
        int n5 = -869568525;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x12086ABB)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xDFEBB071;
        n6 ^= (n5 | n4) ^ 0xDFEBF94E;
        n6 += (n5 | n4) ^ 0xDFEB17CF;
        n6 += (n5 | n4) ^ 0xDFEBC2C1;
        n6 ^= (n5 | n4) ^ 0xDFEB024B;
        n6 ^= (n5 | n4) ^ 0xDFEBA728;
        return n6 -= (n5 | n4) ^ 0xDFEB4573;
    }

    /*
     * Unable to fully structure code
     */
    public iQ() {
        block17: {
            block15: {
                block18: {
                    block16: {
                        break block18;
lbl1:
                        // 1 sources

                        while (true) {
                            var2_4 ^= 1748850601;
                            break block15;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 225823763;
                            break block16;
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1930056038;
                            break block16;
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            this.a = (long)new LinkedHashSet<E>();
                            ** continue;
                            break;
                        }
                    }
lbl14:
                    // 3 sources

                    block12: while (true) {
                        switch (var3_3) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                default: {
                                    continue block12;
                                }
                                break;
                            }
                            case -1006741576: {
                                ** continue;
                            }
                            case 628583565: {
                                var2_4 ^= var3_3 ^ 2079154119;
                                var3_3 = (var1_2 | var4_1) ^ 1010937158;
                                ** GOTO lbl-1000
                            }
                            case -98477963: {
                                var2_4 ^= var3_3 ^ 1341682548;
                                ** continue;
                            }
                            case 1934251108: {
                                return;
                            }
lbl30:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -750755357;
                                ** continue;
                                break;
                            }
                            case 754948893: {
                                iQ.a = this;
                                break block17;
                            }
                            case -221628691: {
                                var2_4 ^= var3_3 ^ -1613946262;
                                break;
                            }
                        }
                        ** continue;
                        break;
                    }
                }
                var4_1 = 1553400052;
                var1_2 = iQ.c & 1553400052 ^ -1221723458;
                var3_3 = 0;
                var2_4 = (var1_2 | var4_1) ^ -673623952;
                ** while (true)
            }
            super(iQ.k, iQ.s, dA.P);
            var3_3 = (var1_2 | var4_1) ^ -624388493;
            ** GOTO lbl14
        }
        var3_3 = (var1_2 | var4_1) ^ 94282379;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onEnable() {
        int n2 = -1167290533;
        int n3 = c & 0xBA6C8F5B ^ 0x5C90D39A;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x9AD65310;
        n4 = (n3 | n2) ^ 0xDBB3CFBA;
        block9: while (true) {
            switch (n4) {
                default: {
                    continue block9;
                }
                case -1091070943: {
                    n5 ^= n4 ^ 0x870BF8D9;
                    n4 = (n3 | n2) ^ 0xC521AA9;
                    continue block9;
                }
                case 705858026: {
                    this.MO();
                    n4 = (n3 | n2) ^ 0x9613E546;
                    continue block9;
                }
                case -764835375: {
                    this.f = 0L;
                    n4 = (n3 | n2) ^ 0x400B4BFA;
                    continue block9;
                }
                case 1760508573: {
                    n5 ^= n4 ^ 0x3801ECB7;
                    n4 = (n3 | n2) ^ 0x2C95560A;
                    continue block9;
                }
                case 625938529: {
                    n4 = (n3 | n2) ^ 0x349374A1;
                    continue block9;
                }
                case -223427214: {
                    return;
                }
                case -898651270: 
            }
            n5 ^= n4 ^ 0xE985824D;
            n4 = (n3 | n2) ^ 0xD4EE5631;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var2 = 687862387;
        iQ.c = mK.a(MethodHandles.lookup().lookupClass(), -463170691);
        var1_1 = 0;
        var0_2 = -1593130424;
        var1_1 = var2 ^ 126135707;
lbl6:
        // 2 sources

        block11: while (true) {
            block15: {
                switch (var1_1) {
                    case 1048804153: {
                        var0_2 ^= var1_1 ^ 820207863;
                        ** break;
                    }
                    case 1907706669: {
                        ** break;
                    }
                    case -1995794918: {
                        iQ.b = (long)Set.of(class_2246.field_28888, class_2246.field_9987, class_2246.field_10124, class_2246.field_10543, class_2246.field_10243);
                        return;
                    }
lbl16:
                    // 1 sources

                    var1_1 = var2 ^ 449689290;
                    continue block11;
                    case -18733404: {
                        var0_2 ^= var1_1 ^ -1127481014;
                        var1_1 = var2 ^ -1577753495;
                        continue block11;
                    }
lbl22:
                    // 1 sources

                    var1_1 = var2 ^ 377260362;
                    continue block11;
                    case 1749574893: {
                        var0_2 ^= var1_1 ^ 745280077;
                        var1_1 = var2 ^ -559940413;
                    }
                    default: {
                        continue block11;
                    }
                    case -161476944: {
                        v0 = 0;
                        v1 = 0;
                        v2 = "\u008dY\u00a4L\u00d0\u008dU\u0001\u00e7\u00fcww\u00f4Y\u00f0\u009exDp\u00b4B\u00c0PZ\u009a\u001b\u00cd\u000f#\u00c0|s\u009b\u0091\u009a\u00c3 \u00c2\u00d9\u00de\u00af\u00d7\u00c21".getBytes("ISO-8859-1");
                        if (true) ** GOTO lbl-1000
                    }
                    case 842155193: {
                        iQ.a = new int[(var0_2 | var1_1 ^ 449689290) ^ (var1_1 ^ 164476489)];
                        var1_1 = var2 ^ 1085773470;
                        continue block11;
                    }
                    case 796614632: {
                        break block15;
                    }
                    case -1543667898: 
                }
                var0_2 ^= var1_1 ^ 928506970;
                var1_1 = var2 ^ 1498069342;
                continue;
            }
            var1_1 = var2 ^ -1962767051;
            continue;
            break;
        }
        while (true) {
            if (v1 + 4 < v2.length) lbl-1000:
            // 2 sources

            {
                var0_2 ^= -1806880436;
                var0_2 ^= -368162776;
                var0_2 ^= 947741638;
                var0_2 ^= 480713379;
                var0_2 ^= -379845988;
                var0_2 ^= 653154804;
            } else {
                iQ.a = iQ.MN(((var0_2 ^= -716845838) | var2) ^ 1729953714, var2 ^ ((var0_2 | var2) ^ -1262422561));
                iQ.c = -6151362075271500992L << 32 >>> 32 ^ (long)var0_2 & 0xFFFFFFFFL | (-6151362075271500992L >>> 32 ^ (long)var0_2 & 0xFFFFFFFFL) << 32;
                iQ.k = gj.decode("rGMWavfiFlyk2iw=", iQ.MN((var0_2 | var2) ^ 1729953713, var2 ^ ((var0_2 | var2) ^ 102321754)));
                iQ.s = gj.decode("7xul+0oguuB2z+jpQTYOD8kRRACSxn5e+IxoFDohQ0l5PDLvFfy+r9viypDJDzrw", iQ.MN((var0_2 | var2) ^ 1729953712, var2 ^ ((var0_2 | var2) ^ 1279255960)));
                iQ.c = gj.decode("J4zzyg==", iQ.MN((var0_2 | var2) ^ 1729953727, var2 ^ ((var0_2 | var2) ^ -1753414345)));
                iQ.b = gj.decode("h0kemKuRO0/WSfGoAkTeQ8dDdouKa9q7S9lVp44=", iQ.MN((var0_2 | var2) ^ 1729953726, var2 ^ ((var0_2 | var2) ^ -904756618)));
                iQ.a = gj.decode("zxtC+pviGqusxmMr9b31+oM=", iQ.MN((var0_2 | var2) ^ 1729953725, var2 ^ ((var0_2 | var2) ^ 977411656)));
                var1_1 = var2 ^ -702688041;
                ** continue;
            }
            v3 = var0_2 ^= -496820791;
            var0_2 ^= -1278989958;
            iQ.a[v0] = ((v2[v1] & 255) << 24 | ((v2[v1 + 1] & 255) << 16 | ((v2[v1 + 2] & 255) << 8 | v2[v1 + 3] & 255))) ^ ((v3 | var2) ^ -2076488909 ^ iQ.c);
            v0 = v0 + 1;
            v2 = v2;
            v1 = v1 + 4;
            var0_2 ^= -997429286;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block14: {
            block13: {
                break block13;
lbl1:
                // 1 sources

                return;
            }
            var4_1 = 1597069839;
            var1_2 = iQ.c & 1597069839 ^ 1804552480;
            var3_3 = 0;
            break block14;
            {
                block15: {
                    var3_3 = (var1_2 | var4_1) ^ 826496702;
                    break block15;
lbl10:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
lbl13:
                // 3 sources

                block10: while (true) {
                    switch (var3_3) lbl-1000:
                    // 3 sources

                    {
                        default: {
                            continue block10;
                        }
                        case 1325141393: {
                            ** continue;
                        }
                        case -1004224485: {
                            ** continue;
                        }
                        case -621838014: {
                            var2_4 ^= var3_3 ^ 484791740;
                            continue block8;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1680900105;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -462412584: {
                            var2_4 ^= var3_3 ^ 68016738;
                            var3_3 = (var1_2 | var4_1) ^ -1147430092;
                            ** GOTO lbl-1000
                        }
                        case -2042366726: {
                            ** continue;
                        }
                    }
                    break;
                }
            }
        }
        var2_4 = (var1_2 | var4_1) ^ 188598050;
        var3_3 = (var1_2 | var4_1) ^ -100880427;
        ** GOTO lbl13
        this.MO();
        var3_3 = (var1_2 | var4_1) ^ -1521427859;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void MO() {
        block38: {
            block37: {
                block39: {
                    block40: {
                        break block40;
lbl1:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -3505723;
                            break block37;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -2122072124;
                            break block37;
                            break;
                        }
lbl7:
                        // 2 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 476205297;
                            break block37;
lbl10:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1317167278;
                                break block37;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1375997946;
                                break block37;
lbl16:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 1733556114;
                                    break block38;
                                    break;
                                }
lbl19:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -95420951;
                                    break block39;
                                    break;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -1420243125;
                                    var3_3 = (var1_2 | var4_1) ^ -1896988314;
                                    break block37;
                                    break;
                                }
lbl26:
                                // 1 sources

                                while (true) {
                                    continue;
lbl28:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 672000212;
                                        break block37;
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                    }
                    var4_1 = -1890074877;
                    var1_2 = iQ.c & -1890074877 ^ 1123595960;
                    var3_3 = 0;
                    var2_4 = (var1_2 | var4_1) ^ -1500655831;
                    ** while (true)
                }
lbl38:
                // 2 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1854532742;
                    break block37;
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1456365825;
                    break block37;
lbl44:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 7696819;
                        ** GOTO lbl7
                        break;
                    }
lbl47:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -980215161;
                        break block37;
                        break;
                    }
lbl50:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1429221687;
                        break block37;
                        break;
                    }
                    break;
                }
                this.g = 0L;
                this.b = 0L;
                this.e = 0L;
                this.d = 0L;
                this.a = 0L;
                var3_3 = (var1_2 | var4_1) ^ 167079582;
                break block37;
lbl60:
                // 1 sources

                while (true) {
                    switch (var2_4) {
                        case 1716453190: {
                            ** continue;
                        }
                        default: {
                            ** continue;
                        }
                        ** case -724492037:
lbl67:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
lbl69:
            // 2 sources

            block36: while (true) {
                switch (var3_3) {
                    default: {
                        continue block36;
                    }
                    case -2122457323: {
                        ** continue;
                    }
                    case 1316749439: {
                        ** continue;
                    }
                    case -744624310: {
                        break;
                    }
                    case 174892348: {
                        ** continue;
                    }
                    case 1724784964: {
                        ** continue;
                    }
                    case -972369627: {
                        ** continue;
                    }
                    case -1644449727: {
                        ** continue;
                    }
                    case -1697673588: {
                        ** continue;
                    }
                    case 1586080961: {
                        ** continue;
                    }
                    case 1091698397: {
                        return;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -1165990714;
                continue;
                {
                    case 1971313533: {
                        this.a.clear();
                        ** continue;
                    }
                    case -403548305: {
                        var2_4 ^= var3_3 ^ -389097285;
                        ** continue;
                    }
                }
                break;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ 1250993139;
        ** while (true)
        {
            case -2056315832: {
                this.b = 0;
                ** continue;
            }
            ** case 808795774:
        }
lbl108:
        // 1 sources

        var2_4 ^= var3_3 ^ 1455531644;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onTick(class_310 var1_1) {
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
    private void MP(class_2818 var1_1) {
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
    private static boolean MQ(class_2248 var0) {
        block34: {
            block33: {
                block31: {
                    block32: {
                        block30: {
                            break block34;
lbl1:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_3 ^ 1852717025;
                                break block30;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                v0 = false;
                                break block31;
                                break;
                            }
                        }
                        var4_3 = (var2_2 | var5_1) ^ 688584347;
                        ** GOTO lbl52
lbl10:
                        // 2 sources

                        block17: while (true) {
                            switch (var4_3) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block17;
                                    }
                                    break;
                                }
                                case -68000352: {
                                    ** GOTO lbl34
                                }
lbl17:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -1941000793;
                                    ** GOTO lbl52
                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 2127063262;
                                        ** GOTO lbl52
                                        break;
                                    }
lbl23:
                                    // 1 sources

                                    while (true) {
                                        if (var0 != class_2246.field_22109) ** continue;
                                        ** GOTO lbl42
                                        break;
                                    }
                                    break;
                                }
lbl26:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -597618125;
                                    ** GOTO lbl52
                                    break;
                                }
lbl29:
                                // 1 sources

                                return v0;
lbl31:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -953311157;
                                    ** GOTO lbl52
                                    break;
                                }
lbl34:
                                // 1 sources

                                var4_3 = (var2_2 | var5_1) ^ 1633935220;
                                ** continue;
                                case -1710488169: {
                                    var3_5 ^= var4_3 ^ 2142890032;
                                    break block32;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var3_5 ^= var4_3 ^ -1883965993;
                                    break block33;
                                    break;
                                }
lbl42:
                                // 2 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 2059467302;
                                    if (true) ** GOTO lbl52
                                    break;
                                }
                                case -585613567: {
                                    var1_4 = class_7923.field_41175.method_10221((Object)var0).method_12832();
                                    break block17;
                                }
                            }
                            break;
                        }
                        ** while (true)
                        block27: while (true) {
                            var3_5 ^= var4_3 ^ -1950587089;
                            var4_3 = (var2_2 | var5_1) ^ -1193347831;
lbl52:
                            // 8 sources

                            block28: while (true) {
                                switch (var4_3) {
                                    default: {
                                        continue block28;
                                    }
                                    case 655280336: {
                                        ** continue;
                                    }
                                    case 1358058906: {
                                        ** continue;
                                    }
                                    case 1998681924: {
                                        ** continue;
                                    }
                                    case 1010989736: {
                                        ** continue;
                                    }
                                    case -2052607427: {
                                        ** continue;
                                    }
                                    case -2119229243: {
                                        continue block27;
                                    }
lbl68:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 10338115;
                                        ** GOTO lbl10
                                        break;
                                    }
                                    case 1135685610: {
                                        v0 = true;
                                        break block31;
                                    }
                                    case -765121416: {
                                        if (var1_4.endsWith(iQ.c)) ** continue;
                                        break block27;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        ** while (true)
                    }
                    var4_3 = (var2_2 | var5_1) ^ 645391842;
                    ** while (true)
                }
                var3_5 ^= -1590592570;
                ** while (true)
            }
            var4_3 = (var2_2 | var5_1) ^ -1415737479;
            ** while (true)
        }
        var5_1 = 2053937698;
        var2_2 = iQ.c & 2053937698 ^ -754722623;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ 1494796962;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void MR(class_310 var1_1) {
        block39: {
            block40: {
                block38: {
                    block41: {
                        block36: {
                            block35: {
                                block37: {
                                    var7_2 = -1066630930;
                                    var4_3 = iQ.c & -1066630930 ^ -1610658295;
                                    var6_4 = 0;
                                    ** GOTO lbl89
lbl5:
                                    // 1 sources

                                    while (true) {
                                        var6_4 = (var4_3 | var7_2) ^ 946188285;
                                        break block35;
                                        break;
                                    }
lbl8:
                                    // 1 sources

                                    while (this.b > 0L) {
                                        break block36;
lbl10:
                                        // 1 sources

                                        while (true) {
                                            v0 = false;
                                            break block37;
                                            break;
                                        }
lbl13:
                                        // 1 sources

                                        while (true) {
                                            v0 = true;
                                            break block37;
                                            break;
                                        }
lbl16:
                                        // 1 sources

                                        while (true) {
                                            if (!this.a.isEmpty()) ** GOTO lbl84
                                            ** GOTO lbl96
                                            break;
                                        }
lbl19:
                                        // 1 sources

                                        while (true) {
                                            var5_5 ^= var6_4 ^ -974635227;
                                            var6_4 = (var4_3 | var7_2) ^ 531452546;
                                            break block35;
                                            break;
                                        }
                                    }
                                    break block40;
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var5_5 ^= 34903155;
                                        ** GOTO lbl113
                                        break;
                                    }
lbl27:
                                    // 1 sources

                                    while (true) {
                                        var5_5 ^= var6_4 ^ 1466137139;
                                        var6_4 = (var4_3 | var7_2) ^ -1613693757;
                                        break block35;
                                        break;
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        var6_4 = (var4_3 | var7_2) ^ 2018136695;
                                        break block38;
                                        break;
                                    }
lbl34:
                                    // 1 sources

                                    while (true) {
                                        var5_5 ^= var6_4 ^ 606473853;
                                        ** continue;
                                        break;
                                    }
lbl37:
                                    // 2 sources

                                    while (true) {
                                        var5_5 ^= -1163786166;
                                        break block39;
                                        break;
                                    }
lbl40:
                                    // 1 sources

                                    while (true) {
                                        var5_5 ^= -536515259;
                                        ** GOTO lbl115
                                        break;
                                    }
                                }
                                var5_5 ^= -1113521089;
                                break block41;
lbl46:
                                // 1 sources

                                while (true) {
                                    var6_4 = (var4_3 | var7_2) ^ -543385296;
                                    break block38;
                                    break;
                                }
                            }
lbl50:
                            // 5 sources

                            block28: while (true) {
                                switch (var6_4) {
                                    default: {
                                        continue block28;
                                    }
                                    case -1068327827: {
                                        ** GOTO lbl8
                                    }
                                    case -409313006: {
                                        ** continue;
                                    }
                                    case 1076834860: {
                                        ** continue;
                                    }
                                    case -1405406298: {
                                        ** continue;
                                    }
                                    case 649216528: {
                                        ** GOTO lbl92
                                    }
                                    case 1781883304: {
                                        ** continue;
                                    }
                                    case 426776038: {
                                        break;
                                    }
                                }
                                ** continue;
                                break;
                            }
                        }
                        var6_4 = (var4_3 | var7_2) ^ -1245008057;
                        ** GOTO lbl50
                    }
                    var2_6 = v0;
                    ** while (true)
                }
                block29: while (true) {
                    switch (var6_4) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block29;
                            }
                            break;
                        }
lbl81:
                        // 1 sources

                        while (true) {
                            var3_7 = "TestFinder y<0: deepslate=" + this.a + " bedrock=" + this.d + " air=" + this.e + " | OTHER=" + this.b + " ores=" + this.g + (String)v1 + " | " + v2;
                            ** continue;
                            break;
                        }
lbl84:
                        // 1 sources

                        var5_5 ^= 909541488;
                        ** GOTO lbl94
                        case 6510559: {
                            var5_5 ^= var6_4 ^ -942378313;
                            ** continue;
                        }
lbl89:
                        // 1 sources

                        var5_5 = (var4_3 | var7_2) ^ -1423673847;
                        var6_4 = (var4_3 | var7_2) ^ -112358145;
                        ** GOTO lbl50
lbl92:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ 1942289737;
                        ** GOTO lbl50
lbl94:
                        // 1 sources

                        v1 = " " + String.valueOf((Object)this.a);
                        ** GOTO lbl37
lbl96:
                        // 1 sources

                        var5_5 ^= 909541488;
                        ** GOTO lbl104
lbl98:
                        // 1 sources

                        while (true) {
                            v2 = iQ.a;
                            ** GOTO lbl117
                            break;
                        }
lbl101:
                        // 1 sources

                        while (true) {
                            var5_5 ^= 34903155;
                            ** continue;
                            break;
                        }
lbl104:
                        // 1 sources

                        v1 = "";
                        ** continue;
                        case -1481270120: {
                            gr.send(var1_1, (class_2561)gr.body(var3_7));
                            var6_4 = (var4_3 | var7_2) ^ 1528192923;
                            ** GOTO lbl-1000
                        }
lbl110:
                        // 1 sources

                        while (true) {
                            var6_4 = (var4_3 | var7_2) ^ 1512443051;
                            ** continue;
                            break;
                        }
lbl113:
                        // 1 sources

                        v2 = iQ.b;
                        ** GOTO lbl117
lbl115:
                        // 1 sources

                        var5_5 ^= 1344220961;
                        ** continue;
lbl117:
                        // 2 sources

                        var5_5 ^= 1862517989;
                        ** continue;
                        case -2065067660: {
                            var5_5 ^= var6_4 ^ -179839953;
                            ** continue;
                        }
                        case -2049326524: {
                            return;
                        }
                    }
                    break;
                }
            }
            var6_4 = (var4_3 | var7_2) ^ -963650807;
            ** while (true)
        }
        ** while (!var2_6)
lbl129:
        // 1 sources

        ** while (true)
    }
}

