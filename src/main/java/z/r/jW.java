/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_12206
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1750
 *  net.minecraft.class_1792
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_2769
 *  net.minecraft.class_310
 *  net.minecraft.class_3726
 *  net.minecraft.class_3965
 *  net.minecraft.class_4969
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_12206;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1750;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_2769;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import z.r.bM;
import z.r.bp;
import z.r.ej;
import z.r.gP;
import z.r.gj;
import z.r.iP;
import z.r.ke;
import z.r.ko;
import z.r.lw;
import z.r.mj;
import z.r.t;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class jW
extends bM {
    private final ke a;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private class_2338 a;
    private int a;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private final gP a;
    private static final /* synthetic */ String e;
    private final ej a;
    private long a;
    private static final /* synthetic */ String f;
    private final gP b;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private long b;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String k;
    private static final int[] a;
    private int b;
    private static jW a;
    private final gP c;
    private t a;
    private final gP d;
    private iP a;
    private final gP e;
    private static final long c;
    public static final int c;
    private final ke b;
    private static final /* synthetic */ String j;
    private boolean a;
    private iP b;
    private static final long d;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private boolean b;
    private static final /* synthetic */ String n;
    private static final long e;

    /*
     * Exception decompiling
     */
    public jW() {
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
    public static jW instance() {
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
    public static class_2338 activeAnchor() {
        block28: {
            block25: {
                block27: {
                    break block27;
lbl1:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ -962032772;
                        ** GOTO lbl42
                        break;
                    }
lbl4:
                    // 2 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ -1855424800;
                        ** GOTO lbl42
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var1_3 ^= var2_2 ^ 1460053876;
                        break block25;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        if (jW.a == null) ** GOTO lbl4
                        ** continue;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ 434644767;
                        ** GOTO lbl42
                        break;
                    }
                }
                var3 = 1101937232;
                var0_1 = jW.c & 1101937232 ^ 1023404058;
                var2_2 = 0;
                break block28;
            }
            var2_2 = (var0_1 | var3) ^ -137582376;
            ** GOTO lbl42
lbl24:
            // 1 sources

            block16: while (true) {
                block26: {
                    var2_2 = (var0_1 | var3) ^ 1343788067;
                    break block26;
lbl27:
                    // 1 sources

                    return v0;
lbl29:
                    // 1 sources

                    while (true) {
                        if (jW.a.a) ** break;
                        ** continue;
                        var2_2 = (var0_1 | var3) ^ -1066959635;
                        break block26;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        v0 = jW.a.a;
lbl36:
                        // 2 sources

                        while (true) {
                            var1_3 ^= 1767349430;
                            ** continue;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        v0 = null;
                        ** continue;
                        break;
                    }
                }
lbl43:
                // 3 sources

                block22: while (true) {
                    switch (var2_2) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block22;
                            }
                            break;
                        }
                        case -1114077513: {
                            ** continue;
                        }
                        case 1679285573: {
                            ** continue;
                        }
                        case -1966165585: {
                            ** continue;
                        }
                        case -1151897306: {
                            break block16;
                        }
                        case -1976348030: {
                            ** continue;
                        }
                        case 770141817: {
                            ** continue;
                        }
lbl60:
                        // 1 sources

                        while (true) {
                            var2_2 = (var0_1 | var3) ^ -1441104929;
                            ** continue;
                            break;
                        }
                    }
                    break;
                }
                break;
            }
            var2_2 = (var0_1 | var3) ^ -147764235;
            ** GOTO lbl43
        }
        var1_3 = (var0_1 | var3) ^ 334607101;
        var2_2 = (var0_1 | var3) ^ 826237123;
        ** while (true)
        {
            case -325612358: {
                var1_3 ^= var2_2 ^ 101297529;
                ** continue;
            }
            case 1287690905: {
                ** continue;
            }
            ** case -672824955:
        }
lbl75:
        // 1 sources

        var1_3 ^= var2_2 ^ 1459278355;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static boolean isArmed() {
        block26: {
            block24: {
                block25: {
                    block21: {
                        block22: {
                            block23: {
                                var3 = -1184549024;
                                var0_1 = jW.c & -1184549024 ^ 133551599;
                                var2_2 = 0;
                                if (true) ** GOTO lbl38
                                block13: while (true) {
                                    var2_2 = (var0_1 | var3) ^ -2001006707;
lbl7:
                                    // 7 sources

                                    block14: while (true) {
                                        switch (var2_2) lbl-1000:
                                        // 5 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block14;
                                                }
                                                break;
                                            }
lbl12:
                                            // 1 sources

                                            while (true) {
                                                var2_2 = (var0_1 | var3) ^ 1270109166;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl15:
                                            // 1 sources

                                            while (true) {
                                                var2_2 = (var0_1 | var3) ^ 1253593834;
                                                ** GOTO lbl-1000
                                                break;
                                            }
                                            case -1809165383: {
                                                v0 = true;
                                                break block21;
                                            }
                                            case -689562771: {
                                                var1_3 ^= var2_2 ^ 1946662069;
                                                break block22;
                                            }
                                            case 2016609841: {
                                                var1_3 ^= var2_2 ^ -738183383;
                                                break block13;
                                            }
                                            case 1023037706: {
                                                if (!jW.a.a) break block23;
                                                var2_2 = (var0_1 | var3) ^ 1762913410;
                                                ** GOTO lbl-1000
                                            }
                                            case 927922274: {
                                                ** continue;
                                            }
                                            case -179460859: {
                                                v0 = false;
                                                break block21;
                                            }
                                            case 1256100760: {
                                                break;
                                            }
lbl38:
                                            // 1 sources

                                            var1_3 = (var0_1 | var3) ^ -1756058554;
                                            break block24;
lbl40:
                                            // 1 sources

                                            while (true) {
                                                var2_2 = (var0_1 | var3) ^ -2096126235;
                                                ** continue;
                                                break;
                                            }
                                            case 753409286: {
                                                if (jW.a != null) {
                                                    continue block13;
                                                }
                                                break block23;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                }
                                var2_2 = (var0_1 | var3) ^ -1826755863;
                                ** GOTO lbl7
                            }
                            while (true) {
                                var2_2 = (var0_1 | var3) ^ -991303601;
                                ** GOTO lbl7
                                break;
                            }
                            {
                                case 2065440672: {
                                    var1_3 ^= var2_2 ^ -637685640;
                                    ** continue;
                                }
                            }
                            var2_2 = (var0_1 | var3) ^ -943263266;
                            ** GOTO lbl7
                            {
                                case -197024767: {
                                    if (!jW.a.isEnabled()) ** continue;
                                    break block25;
                                }
                                ** case -901635798:
                            }
lbl62:
                            // 1 sources

                            ** while (true)
                        }
                        var2_2 = (var0_1 | var3) ^ 736076886;
                        ** GOTO lbl7
                    }
                    var1_3 ^= -319447280;
                    break block26;
                }
                var2_2 = (var0_1 | var3) ^ 1974982341;
                ** GOTO lbl7
            }
            var2_2 = (var0_1 | var3) ^ -181705609;
            ** while (true)
        }
        return v0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean suppressVanillaUse() {
        int n2 = c & 0x7D62C8DC ^ 0xC82D0CA8;
        int n3 = 0;
        int n4 = (n2 | 0x7D62C8DC) ^ 0x91C7222A;
        n3 = (n2 | 0x7D62C8DC) ^ 0x2208DD1B;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 605110443: {
                    n4 ^= n3 ^ 0xA19F3C4C;
                    n3 = (n2 | 0x7D62C8DC) ^ 0x9F64D129;
                    continue block5;
                }
                case -546893337: {
                    break;
                }
                case 1644895701: {
                    return jW.isArmed();
                }
            }
            n3 = (n2 | 0x7D62C8DC) ^ 0xD97E8C57;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    static {
        int n2 = 2100633305;
        c = mK.a(MethodHandles.lookup().lookupClass(), -260679103);
        int n3 = 0;
        int n4 = 1384450869;
        n3 = n2 ^ 0xAC78FA4E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -674419201: {
                    n4 ^= n3 ^ 0x27F36FFB;
                    n3 = n2 ^ 0x7ADFC921;
                    continue block5;
                }
                case -783424361: {
                    n3 = n2 ^ 0xAAF83326;
                    continue block5;
                }
                case 132831224: 
            }
            break;
        }
        int n5 = 0;
        a = new int[((n4 ^= 0xCD07ACFB) | n2) ^ 0x7FBDFFCF];
        n4 ^= 0x58237324;
        int n6 = 0;
        byte[] byArray = "\u00c5!NW\u00a2\u001c\u00d4bo\u0097\u00cb\u00c4\u00f0 \u00a7k\u00a93\u00bfV_(4\u00e0\u00fa\u00ba\u0007\u0011\u00e0z%,!\u0005lDLA\u00da,n\u00cb\u00f1\u00d3@\u0097\u00d9{&q^\u0081\u00fd\u00f5\u00f4K\u00b3\u009ewP\u00b5\u00b3\u00ea\u008ayX\u00de\u00ff\u0087\u00fb\nk\u00c8%\u00aaX\u00ea\u00f4F\u00f6".getBytes("ISO-8859-1");
        do {
            n4 ^= 0x8E437F40;
            n4 ^= 0x6D7F2582;
            n4 ^= 0x2F33C32B;
            n4 ^= 0x7A93FA0A;
            n4 ^= 0x88CFB589;
            n4 ^= 0x30E3677B;
            int n7 = n4 ^= 0x9F532F12;
            n4 ^= 0xC943D4D8;
            jW.a[n5] = ((byArray[n6] & 0xFF) << 24 | ((byArray[n6 + 1] & 0xFF) << 16 | ((byArray[n6 + 2] & 0xFF) << 8 | byArray[n6 + 3] & 0xFF))) ^ ((n7 | n2) ^ 0x8177EE44 ^ c);
            n5 = n5 + 1;
            byArray = byArray;
            n6 = n6 + 4;
            n4 ^= 0x58A04ADB;
        } while (n6 + 4 < byArray.length);
        long l2 = 3625816395764299901L << 32 >>> 32 ^ (long)(n4 ^= 0x5CEEA23) & 0xFFFFFFFFL;
        e = l2 | (3625816395764299901L >>> 32 ^ (long)n4 & 0xFFFFFFFFL) << 32;
        d = 3625816395764301257L << 32 >>> 32 ^ (long)n4 & 0xFFFFFFFFL | (3625816395764301257L >>> 32 ^ (long)n4 & 0xFFFFFFFFL) << 32;
        c = 3625816395764300981L << 32 >>> 32 ^ (long)n4 & 0xFFFFFFFFL | (3625816395764300981L >>> 32 ^ (long)n4 & 0xFFFFFFFFL) << 32;
        k = gj.decode("DVMGJd7I5rOIeA==", jW.Jo((n4 | n2) ^ 0xF8DF5E96, n2 ^ ((n4 | n2) ^ 0x8C274067)));
        s = gj.decode("AUHKvNacjHVK7bMygC2w4kflc3fBlk3qpHH8UjDd8D7X67biYCNlJQ8w8Dp8", jW.Jo((n4 | n2) ^ 0xF8DF5E95, n2 ^ ((n4 | n2) ^ 0x298C4507)));
        f = gj.decode("k4HNZHepe7kOlw==", jW.Jo((n4 | n2) ^ 0xF8DF5E94, n2 ^ ((n4 | n2) ^ 0x649B96F9)));
        l = gj.decode("dbn1TLNz4TirAiSo", jW.Jo((n4 | n2) ^ 0xF8DF5E9B, n2 ^ ((n4 | n2) ^ 0xDEE9AD39)));
        b = gj.decode("Wk8unw==", jW.Jo((n4 | n2) ^ 0xF8DF5E9A, n2 ^ ((n4 | n2) ^ 0x582C000)));
        d = gj.decode("R/NzXeZGQt4UssIZfwbU8D4f7apt3YSV9hXTkMTu4dyVnfGgtnZwWyaO1V648pc7qYEsmyHLlfhvNEgZ7vd/SOtL", jW.Jo((n4 | n2) ^ 0xF8DF5E99, n2 ^ ((n4 | n2) ^ 0xF68FEA64)));
        m = gj.decode("iFsQ6tamYr1NL60=", jW.Jo((n4 | n2) ^ 0xF8DF5E98, n2 ^ ((n4 | n2) ^ 0xCAA86F53)));
        j = gj.decode("YIs7oqKx3YbfD2bsX9enjK7FgGLnJKGlBkRcCiADK8zlbvXG5qcHAOsrf0MWi0gSZF9XSVlE3PbdZiIg", jW.Jo((n4 | n2) ^ 0xF8DF5E9F, n2 ^ ((n4 | n2) ^ 0xCA3E9AB3)));
        h = gj.decode("uhaWXhl7EbLbKW0=", jW.Jo((n4 | n2) ^ 0xF8DF5E9E, n2 ^ ((n4 | n2) ^ 0x21259CD7)));
        n = gj.decode("/x98tidSyBhm+N1euBiamGURjf7T3dlhZpiBmjHtCTQK1RFzARdEsj5c0kRVdTqIgRC274rZcwvjognRjQ==", jW.Jo((n4 | n2) ^ 0xF8DF5E9D, n2 ^ ((n4 | n2) ^ 0xDC570D3A)));
        c = gj.decode("Gf4eFWkbcDfF7AHxlec=", jW.Jo((n4 | n2) ^ 0xF8DF5E9C, n2 ^ ((n4 | n2) ^ 0x3AA96F25)));
        e = gj.decode("nyyR3vzAXRnoCC2K0O87hsATq3VOwJeRWWgFwxmdvbn7pR/FzxCGuFo+dRkh+NDJ6fC7BJVfi6rk47Sq", jW.Jo((n4 | n2) ^ 0xF8DF5E83, n2 ^ ((n4 | n2) ^ 0xE265E427)));
        a = gj.decode("+ezhGpf+DnuSAw==", jW.Jo((n4 | n2) ^ 0xF8DF5E82, n2 ^ ((n4 | n2) ^ 0x66CB532D)));
        g = gj.decode("fjjDBhTcWJq4DO3+FcbNx2VzAulfTYP6A4yglk3Svbv1LVihAdnqAXe54PlqcpIRuQWfcOYy+dRHz/uC", jW.Jo((n4 | n2) ^ 0xF8DF5E81, n2 ^ ((n4 | n2) ^ 0x43D7114C)));
        i = gj.decode("8zYw3rKlulxT11f+8g==", jW.Jo((n4 | n2) ^ 0xF8DF5E80, n2 ^ ((n4 | n2) ^ 0xCC801B2B)));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean wantsRotation() {
        var4_1 = 969462126;
        var1_2 = jW.c & 969462126 ^ 1423044441;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 166227334;
        var3_3 = (var1_2 | var4_1) ^ 1568125625;
        if (true) ** GOTO lbl13
        block11: while (true) {
            block14: {
                var3_3 = (var1_2 | var4_1) ^ -1718081525;
                break block14;
lbl10:
                // 2 sources

                while (true) {
                    var2_4 ^= 1899122842;
                    return v0;
                }
            }
            block13: while (true) {
                switch (var3_3) {
                    default: {
                        continue block13;
                    }
                    case -82377821: {
                        v0 = false;
                        ** GOTO lbl10
                    }
                    case -1390263649: {
                        if (!this.a) continue block11;
                        var3_3 = (var1_2 | var4_1) ^ 858048972;
                        continue block13;
                    }
                    case 548294086: {
                        var3_3 = (var1_2 | var4_1) ^ -1486918290;
                        continue block13;
                    }
                    case 369107186: {
                        v0 = true;
                        ** continue;
                    }
                    case -628714991: {
                        var2_4 ^= var3_3 ^ -1338251304;
                        var3_3 = (var1_2 | var4_1) ^ -788808224;
                        continue block13;
                    }
                    case -1292882421: {
                        var2_4 ^= var3_3 ^ 1811801141;
                        var3_3 = (var1_2 | var4_1) ^ 1809440653;
                        continue block13;
                    }
                    case -465447052: {
                        var2_4 ^= var3_3 ^ 1028398410;
                        var3_3 = (var1_2 | var4_1) ^ -2033255204;
                        continue block13;
                    }
                    case 1325217459: {
                        var3_3 = (var1_2 | var4_1) ^ -1537248110;
                        continue block13;
                    }
                    case -645493779: 
                }
                if (this.a.active()) ** break;
                continue block11;
                var3_3 = (var1_2 | var4_1) ^ -819342988;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public double[] computeAdjustment(double d2) {
        int n2 = c & 0xA509928F ^ 0xD4BCA044;
        int n3 = 0;
        int n4 = (n2 | 0xA509928F) ^ 0xB768635E;
        n3 = (n2 | 0xA509928F) ^ 0xBF6DDC72;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1255173821: {
                    n3 = (n2 | 0xA509928F) ^ 0x379281DD;
                    continue block5;
                }
                case -1037094126: {
                    n4 ^= n3 ^ 0xB89A1BE1;
                    n3 = (n2 | 0xA509928F) ^ 0x635D9873;
                    continue block5;
                }
                case -1763693892: 
            }
            break;
        }
        return this.a.step(d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        int n2 = 1779725234;
        int n3 = c & 0x6A1473B2 ^ 0x19E219A1;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x571F85C6;
        n4 = (n3 | n2) ^ 0xFCF60E25;
        block9: while (true) {
            switch (n4) {
                default: {
                    continue block9;
                }
                case 487052613: {
                    n5 ^= n4 ^ 0x37CC980;
                    n4 = (n3 | n2) ^ 0xEE0BA5B;
                    continue block9;
                }
                case 592147380: {
                    this.Jj();
                    n4 = (n3 | n2) ^ 0x9E29415F;
                    continue block9;
                }
                case -609466183: {
                    this.b = false;
                    n4 = (n3 | n2) ^ 0x66F1AEF6;
                    continue block9;
                }
                case -2030013034: {
                    break;
                }
                case -90250975: {
                    n5 ^= n4 ^ 0x8CF966BC;
                    n4 = (n3 | n2) ^ 0x58BD0807;
                    continue block9;
                }
                case 1964425704: {
                    return;
                }
                case -438355220: {
                    n5 ^= n4 ^ 0x73760DBB;
                    n4 = (n3 | n2) ^ 0xA05A330A;
                    continue block9;
                }
            }
            n4 = (n3 | n2) ^ 0x81689A92;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onCombatTick() {
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
    private void Jb(long var1_1) {
        block90: {
            var9_2 = 947089129;
            var6_3 = jW.c & 947089129 ^ -1843992475;
            var8_4 = 0;
            var7_8 = (var6_3 | var9_2) ^ -1545332193;
            var8_4 = (var6_3 | var9_2) ^ 506721561;
            ** GOTO lbl271
lbl7:
            // 1 sources

            while (true) {
                var8_4 = (var6_3 | var9_2) ^ 1641580235;
                ** GOTO lbl31
                break;
            }
lbl10:
            // 2 sources

            while (true) {
                var8_4 = (var6_3 | var9_2) ^ 2127036314;
                ** GOTO lbl84
                while (true) {
                    var8_4 = (var6_3 | var9_2) ^ -631784383;
                    ** GOTO lbl84
                    break;
                }
                break;
            }
lbl16:
            // 1 sources

            while (true) {
                var8_4 = (var6_3 | var9_2) ^ -533425548;
                ** GOTO lbl84
                break;
            }
lbl19:
            // 1 sources

            while (true) {
                block89: {
                    var8_4 = (var6_3 | var9_2) ^ -2086354588;
                    break block89;
lbl22:
                    // 1 sources

                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ -1353942858;
                        ** GOTO lbl84
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ 636031140;
                        break block89;
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ 201851884;
                        break block90;
                        break;
                    }
                }
                block76: while (true) {
                    switch (var8_4) {
                        case -2018491712: {
                            var7_8 ^= var8_4 ^ -447767336;
                            ** break;
                        }
                        case -1739231825: {
                            this.Jt(var3_5);
                            var8_4 = (var6_3 | var9_2) ^ 366434387;
                            continue block76;
                        }
                        case 1114800885: {
                            if (var3_5 < 0) {
                                var8_4 = (var6_3 | var9_2) ^ -1234317673;
                                continue block76;
                            }
                            ** GOTO lbl74
                        }
                        case 970141577: {
                            var7_8 ^= var8_4 ^ 1054321053;
                            ** GOTO lbl60
                        }
                        case 203038842: {
                            var7_8 ^= var8_4 ^ 1481641104;
                            ** GOTO lbl72
                        }
lbl52:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ 572687170;
                        ** GOTO lbl65
                        case -1469166289: {
                            this.Jj();
                            ** continue;
                        }
                        case -1348421954: {
                            var7_8 ^= var8_4 ^ 1064801327;
                            ** continue;
                        }
lbl60:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ -133862376;
                        ** GOTO lbl65
                        case -1616970167: {
                            var7_8 ^= var8_4 ^ 829003000;
                            var8_4 = (var6_3 | var9_2) ^ -1808883422;
                        }
lbl65:
                        // 4 sources

                        default: {
                            continue block76;
                        }
                        case -609261530: {
                            var4_6 = mj.trace();
                            ** break;
lbl70:
                            // 1 sources

                            var8_4 = (var6_3 | var9_2) ^ 1715452195;
                            ** GOTO lbl84
                        }
lbl72:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ 303670210;
                        continue block76;
lbl74:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ 1036495917;
                        continue block76;
                        case 777605071: 
                    }
                    break;
                }
                return;
lbl78:
                // 1 sources

                while (true) {
                    var8_4 = (var6_3 | var9_2) ^ -123071622;
                    break block90;
                    break;
                }
lbl81:
                // 1 sources

                while (true) {
                    var8_4 = (var6_3 | var9_2) ^ -1660665019;
                    break block90;
lbl84:
                    // 6 sources

                    block79: while (true) {
                        switch (var8_4) {
                            case -601027331: {
                                var7_8 ^= var8_4 ^ 806569213;
                                var8_4 = (var6_3 | var9_2) ^ 1128553842;
                                continue block79;
                            }
                            case -1170955627: {
                                var7_8 ^= var8_4 ^ -1698701318;
                                ** break;
                            }
                            case 357650584: {
                                var5_7 = this.Jh(var4_6);
                                ** GOTO lbl151
                            }
                            case -291069221: {
                                var7_8 ^= var8_4 ^ -950361636;
                                ** GOTO lbl140
                            }
                            case 523071107: {
                                var7_8 ^= var8_4 ^ -461582616;
                                ** GOTO lbl157
                            }
                            case 356226651: {
                                this.Jl(var4_6.method_17777(), var1_1);
                                ** GOTO lbl159
                            }
                            case -181284652: {
                                var7_8 ^= var8_4 ^ -2071759146;
                                var8_4 = (var6_3 | var9_2) ^ -776497532;
                                continue block79;
                            }
                            case -1825852706: {
                                if (!jW.a.field_1687.method_8320(var4_6.method_17777()).method_27852(class_2246.field_23152)) ** continue;
                                var8_4 = (var6_3 | var9_2) ^ 1330003513;
                                continue block79;
                            }
                            case -995094153: {
                                ** break;
                            }
                            case -2092381620: {
                                this.a.release();
                                ** GOTO lbl10
                            }
                            case 1194945760: {
                                var7_8 ^= var8_4 ^ 233762766;
                                ** GOTO lbl135
                            }
                            case -1928853294: {
                                if (var4_6.method_17783() != class_239.class_240.field_1332) ** GOTO lbl246
                                ** GOTO lbl171
                            }
                            case -114052193: {
                                if (!this.Jc()) ** break;
                                ** continue;
                                ** GOTO lbl169
                            }
                            case 1612731052: {
                                var7_8 ^= var8_4 ^ 1931859416;
                                ** GOTO lbl145
                            }
lbl131:
                            // 1 sources

                            var8_4 = (var6_3 | var9_2) ^ 289738472;
                            ** GOTO lbl155
                            case 190613041: {
                                var7_8 ^= var8_4 ^ 1861182361;
lbl135:
                                // 2 sources

                                var8_4 = (var6_3 | var9_2) ^ 74388292;
                                ** GOTO lbl155
                            }
                            case -1395365628: {
                                var8_4 = (var6_3 | var9_2) ^ 931128895;
                                continue block79;
                            }
lbl140:
                            // 2 sources

                            var8_4 = (var6_3 | var9_2) ^ -1543424233;
                            continue block79;
                            case 1514372249: {
                                var7_8 ^= var8_4 ^ 2003508101;
                                ** continue;
                            }
lbl145:
                            // 1 sources

                            var8_4 = (var6_3 | var9_2) ^ -1356415371;
                            continue block79;
                            case -599238706: {
                                var7_8 ^= var8_4 ^ -1366131936;
                                var8_4 = (var6_3 | var9_2) ^ -1792668462;
                                continue block79;
                            }
lbl151:
                            // 1 sources

                            var8_4 = (var6_3 | var9_2) ^ 1372336936;
                            ** GOTO lbl265
                            case -1105658455: {
                                var8_4 = (var6_3 | var9_2) ^ -366144252;
                            }
lbl155:
                            // 4 sources

                            default: {
                                continue block79;
                            }
lbl157:
                            // 1 sources

                            var8_4 = (var6_3 | var9_2) ^ 693918771;
                            continue block79;
lbl159:
                            // 1 sources

                            var8_4 = (var6_3 | var9_2) ^ 4410488;
                            continue block79;
                            case 1807775849: {
                                this.a.hold();
                                ** continue;
                            }
                            case 793895487: {
                                if (var4_6 != null) {
                                    var8_4 = (var6_3 | var9_2) ^ 379815913;
                                    continue block79;
                                }
                                ** GOTO lbl246
                            }
lbl169:
                            // 1 sources

                            var8_4 = (var6_3 | var9_2) ^ -464682759;
                            continue block79;
lbl171:
                            // 1 sources

                            var8_4 = (var6_3 | var9_2) ^ -1520795538;
                            continue block79;
                            case 1580887572: {
                                var8_4 = (var6_3 | var9_2) ^ 960439457;
                                continue block79;
                            }
                            case 511105530: {
                                switch (var7_8) {
                                    default: {
                                        var8_4 = (var6_3 | var9_2) ^ 1423002678;
                                        continue block79;
                                    }
                                    case -2058475074: {
                                        var8_4 = (var6_3 | var9_2) ^ -45186547;
                                        continue block79;
                                    }
                                    case 675781432: 
                                }
                                var8_4 = (var6_3 | var9_2) ^ -1322555172;
                                continue block79;
                            }
                            case -1422729211: {
                                return;
                            }
                            case 1348140009: 
                        }
                        return;
                    }
                    break;
                }
                break;
            }
lbl191:
            // 1 sources

            while (true) {
                var8_4 = (var6_3 | var9_2) ^ 1351408221;
                ** GOTO lbl271
                break;
            }
        }
        block81: while (true) {
            switch (var8_4) {
                case 1942391176: {
                    this.a.hold();
                    ** continue;
                }
                case 1121844631: {
                    var7_8 ^= var8_4 ^ -1345683663;
                    var8_4 = (var6_3 | var9_2) ^ 933728408;
                    continue block81;
                }
                case 952814580: {
                    if (mj.useOn(var4_6)) {
                        var8_4 = (var6_3 | var9_2) ^ 1856990522;
                        continue block81;
                    }
                    ** GOTO lbl255
                }
                case 1275430743: {
                    this.Jr(var1_1);
                    ** GOTO lbl264
                }
                case -1233130239: {
                    this.Jq(var1_1);
                    var8_4 = (var6_3 | var9_2) ^ 207555083;
                    continue block81;
                }
                case -1518600490: {
                    var7_8 ^= var8_4 ^ 1046292583;
                    var8_4 = (var6_3 | var9_2) ^ -911120539;
                    continue block81;
                }
                case 661892520: {
                    if (var5_7 != null) {
                        var8_4 = (var6_3 | var9_2) ^ 616428817;
                        continue block81;
                    }
                    ** GOTO lbl246
                }
                case -1915715979: {
                    if (var1_1 >= this.a) {
                        var8_4 = (var6_3 | var9_2) ^ -85407959;
                        continue block81;
                    }
                    ** GOTO lbl264
                }
                case -724007977: {
                    var7_8 ^= var8_4 ^ -957831772;
                    ** GOTO lbl260
                }
                case 1695301972: {
                    if (mj.grimAccepts(var4_6.method_17777())) {
                        ** break;
                    }
                    ** GOTO lbl246
                }
                case 1084172740: {
                    var7_8 ^= var8_4 ^ -478197191;
                    ** continue;
                }
                case -1306241210: {
                    var7_8 ^= var8_4 ^ -1609273035;
                    var8_4 = (var6_3 | var9_2) ^ -160273990;
                    ** GOTO lbl265
                }
lbl244:
                // 1 sources

                var8_4 = (var6_3 | var9_2) ^ 520884283;
                ** GOTO lbl265
lbl246:
                // 4 sources

                var8_4 = (var6_3 | var9_2) ^ 1717232144;
                ** continue;
                case -211966431: {
                    var7_8 ^= var8_4 ^ -1140743697;
                    var8_4 = (var6_3 | var9_2) ^ -1737041181;
                    ** GOTO lbl265
                }
                case -1630921732: {
                    var8_4 = (var6_3 | var9_2) ^ -545542215;
                    continue block81;
                }
lbl255:
                // 1 sources

                var8_4 = (var6_3 | var9_2) ^ 139704747;
                ** GOTO lbl265
                case -340009531: {
                    var7_8 ^= var8_4 ^ 66058970;
                    ** continue;
                }
lbl260:
                // 1 sources

                var8_4 = (var6_3 | var9_2) ^ -345878955;
                ** GOTO lbl265
                case 1360371896: {
                    this.Jl(var5_7, var1_1);
lbl264:
                    // 3 sources

                    var8_4 = (var6_3 | var9_2) ^ 1227507916;
                }
lbl265:
                // 8 sources

                default: {
                    continue block81;
                }
                case -1238833946: {
                    var7_8 ^= var8_4 ^ 133734760;
                    var8_4 = (var6_3 | var9_2) ^ -2101533415;
                    continue block81;
                }
lbl271:
                // 2 sources

                block82: while (true) {
                    switch (var8_4) {
                        default: {
                            continue block82;
                        }
                        case -1539040268: {
                            var8_4 = (var6_3 | var9_2) ^ 1232386973;
                            continue block82;
                        }
                        case -352635728: {
                            var3_5 = this.Jz(this.d, class_1802.field_23141);
                            ** continue;
                        }
                        case -217885328: 
                    }
                    break;
                }
                var7_8 ^= var8_4 ^ 68589135;
                ** continue;
                case 570504206: 
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean Jc() {
        block41: {
            block42: {
                block40: {
                    var6_1 = -70175314;
                    var3_2 = jW.c & -70175314 ^ -825244899;
                    var5_3 = 0;
                    var4_4 = (var3_2 | var6_1) ^ 1595397147;
                    var5_3 = (var3_2 | var6_1) ^ 1442835217;
                    break block40;
                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ 2002758725;
                        break block40;
                        break;
                    }
                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ 1026651189;
                        break block41;
                        break;
                    }
lbl13:
                    // 2 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ 1789102342;
                        break block42;
                        while (true) {
                            var5_3 = (var3_2 | var6_1) ^ -870655289;
                            break block42;
                            break;
                        }
                        break;
                    }
                }
                block35: while (true) {
                    switch (var5_3) {
                        case -1440736082: {
                            var5_3 = (var3_2 | var6_1) ^ 1571370702;
                            continue block35;
                        }
                        case -2004853766: {
                            var4_4 ^= var5_3 ^ 915493406;
                            ** GOTO lbl53
                        }
                        case 659639153: {
                            var1_5 = mj.trace(jW.a.field_1724.method_36454(), jW.a.field_1724.method_36455());
                            var5_3 = (var3_2 | var6_1) ^ -937167617;
                            break block42;
                        }
                        case -1569275535: {
                            var4_4 ^= var5_3 ^ 967605627;
                            var5_3 = (var3_2 | var6_1) ^ 291937083;
                            continue block35;
                        }
                        case 608102564: {
                            if (ko.diverged()) ** continue;
                            ** GOTO lbl48
                        }
                        case -218956971: {
                            var5_3 = (var3_2 | var6_1) ^ -606003429;
                            ** GOTO lbl49
                        }
                        case -846150278: {
                            var4_4 ^= var5_3 ^ 625802204;
                            var5_3 = (var3_2 | var6_1) ^ -2144200862;
                            ** GOTO lbl49
                        }
                        case -289837948: {
                            if (this.a.silent()) ** GOTO lbl51
lbl48:
                            // 2 sources

                            var5_3 = (var3_2 | var6_1) ^ 844051141;
                        }
lbl49:
                        // 4 sources

                        default: {
                            continue block35;
                        }
lbl51:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ 221056234;
                        continue block35;
lbl53:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ -661734194;
                        continue block35;
                        case 2146296029: 
                    }
                    break;
                }
                return false;
lbl57:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -127394840;
                    break block41;
                    break;
                }
lbl60:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -378134438;
                    break block41;
                    break;
                }
            }
            block38: while (true) {
                switch (var5_3) {
                    default: {
                        continue block38;
                    }
                    case 1375338702: {
                        if (var1_5 == null) ** GOTO lbl13
                        var5_3 = (var3_2 | var6_1) ^ -1018606952;
                        continue block38;
                    }
                    case 939262784: {
                        var4_4 ^= var5_3 ^ -1961482786;
                        var5_3 = (var3_2 | var6_1) ^ -1373243535;
                        continue block38;
                    }
                    case 868560248: {
                        var4_4 ^= var5_3 ^ 1095619191;
                        var5_3 = (var3_2 | var6_1) ^ -1462422143;
                        continue block38;
                    }
                    case 1460322878: {
                        var2_6 = mj.faceTarget(var1_5.method_17777(), var1_5.method_17780());
                        var5_3 = (var3_2 | var6_1) ^ -2046609987;
                        break block38;
                    }
                    case 1016511783: {
                        var5_3 = (var3_2 | var6_1) ^ 1593270883;
                        continue block38;
                    }
                    case -1591175716: {
                        if (var1_5.method_17783() == class_239.class_240.field_1332) ** continue;
                        ** continue;
                    }
                    case -1787003207: {
                        var4_4 ^= var5_3 ^ -1875827496;
                        var5_3 = (var3_2 | var6_1) ^ 2099119141;
                        continue block38;
                    }
                    case -2101218406: {
                        return false;
                    }
                }
                break;
            }
        }
        block39: while (true) {
            switch (var5_3) {
                default: {
                    continue block39;
                }
                case -1024556150: {
                    var4_4 ^= var5_3 ^ 559765701;
                    var5_3 = (var3_2 | var6_1) ^ 1666632690;
                    continue block39;
                }
                case 380229605: {
                    var4_4 ^= var5_3 ^ 494110773;
                    ** continue;
                }
                case 2044510722: {
                    var4_4 ^= var5_3 ^ 309689194;
                    var5_3 = (var3_2 | var6_1) ^ 1647737202;
                    continue block39;
                }
                case -1645637939: {
                    if (mj.sees(var2_6)) ** continue;
                    var5_3 = (var3_2 | var6_1) ^ 910073825;
                    continue block39;
                }
                case -907974562: {
                    var4_4 ^= var5_3 ^ 1751335217;
                    var5_3 = (var3_2 | var6_1) ^ 1318434443;
                    continue block39;
                }
                case -1320533708: {
                    return false;
                }
                case 129494103: {
                    return true;
                }
                case -1668727731: 
            }
            break;
        }
        this.a.aim(var2_6.aim(), ((Float)this.a.getValue()).floatValue());
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void shield(long var1_1) {
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
    private void Jd(long var1_1) {
        var8_2 = 1757755584;
        var5_3 = jW.c & 1757755584 ^ -1739343553;
        var7_4 = 0;
        var6_7 = (var5_3 | var8_2) ^ 1647837159;
        var7_4 = (var5_3 | var8_2) ^ -2006810056;
        ** GOTO lbl211
lbl7:
        // 2 sources

        while (true) {
            var7_4 = (var5_3 | var8_2) ^ -1544433584;
            ** GOTO lbl34
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var7_4 = (var5_3 | var8_2) ^ 1638601617;
            ** GOTO lbl211
lbl13:
            // 1 sources

            while (true) {
                var7_4 = (var5_3 | var8_2) ^ 288613238;
                ** GOTO lbl140
                break;
            }
            break;
        }
lbl16:
        // 1 sources

        while (true) {
            block85: {
                var7_4 = (var5_3 | var8_2) ^ 146571723;
                ** GOTO lbl211
lbl19:
                // 1 sources

                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ 229073926;
                    ** GOTO lbl140
                    break;
                }
lbl22:
                // 1 sources

                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ -243602609;
                    ** GOTO lbl140
                    break;
                }
                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ 199629835;
                    ** GOTO lbl140
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ -401049139;
                    break block85;
                    break;
                }
                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ 1234862127;
                    ** GOTO lbl140
                    break;
                }
            }
lbl35:
            // 2 sources

            block69: while (true) {
                block87: {
                    block86: {
                        switch (var7_4) {
                            case -311398367: {
                                if (!mj.grimAccepts(this.a)) {
                                    ** break;
                                }
                                ** GOTO lbl81
                            }
                            case 987155466: {
                                return;
                            }
                            case 1033100124: {
                                var6_7 ^= var7_4 ^ -1476049857;
                                break block86;
                            }
                            case 1475595700: {
                                if (mj.matches(var4_6, this.a)) {
                                    var7_4 = (var5_3 | var8_2) ^ -884042182;
                                    continue block69;
                                }
                                ** GOTO lbl76
                            }
                            case 1856995945: {
                                var6_7 ^= var7_4 ^ 654321811;
                                break block86;
                            }
                            case 1529244079: {
                                var6_7 ^= var7_4 ^ -2112559173;
                                var7_4 = (var5_3 | var8_2) ^ -1040091659;
                                continue block69;
                            }
                            case 1779963293: {
                                var6_7 ^= var7_4 ^ 319228058;
                                var7_4 = (var5_3 | var8_2) ^ -1978763699;
                                continue block69;
                            }
                            case 282050610: {
                                this.Jm(t.a, var1_1);
                                ** GOTO lbl7
                            }
                            case -1900411296: {
                                if (mj.useOn(var4_6)) {
                                    var7_4 = (var5_3 | var8_2) ^ -982000638;
                                    continue block69;
                                }
                                ** GOTO lbl86
                            }
                            case 147612002: {
                                this.Jr(var1_1);
                                ** continue;
                            }
                            case -414673671: {
                                this.Jq(var1_1);
                                ** GOTO lbl102
                            }
lbl76:
                            // 2 sources

                            var7_4 = (var5_3 | var8_2) ^ -1831883678;
                            ** GOTO lbl87
                            case 1033922045: {
                                var6_7 ^= var7_4 ^ 1267048966;
                                ** continue;
                            }
lbl81:
                            // 1 sources

                            var7_4 = (var5_3 | var8_2) ^ -98751500;
                            ** GOTO lbl87
                            case 144810600: {
                                var6_7 ^= var7_4 ^ 1701300008;
                                break block87;
                            }
lbl86:
                            // 1 sources

                            var7_4 = (var5_3 | var8_2) ^ 703858112;
lbl87:
                            // 4 sources

                            default: {
                                continue block69;
                            }
                            case -1654896710: {
                                var6_7 ^= var7_4 ^ 1358162181;
                                ** GOTO lbl97
                            }
                            case 865677253: {
                                var7_4 = (var5_3 | var8_2) ^ 363317726;
                                continue block69;
                            }
                            case 46830091: {
                                break block87;
                            }
lbl97:
                            // 1 sources

                            var7_4 = (var5_3 | var8_2) ^ -1356565429;
                            continue block69;
                            case -1723626325: {
                                var7_4 = (var5_3 | var8_2) ^ 530525446;
                                continue block69;
                            }
lbl102:
                            // 1 sources

                            var7_4 = (var5_3 | var8_2) ^ 1549124141;
                            continue block69;
                            case -786187201: {
                                var6_7 ^= var7_4 ^ -1492747324;
                                var7_4 = (var5_3 | var8_2) ^ -266610531;
                                continue block69;
                            }
                            case -1534952494: {
                                var6_7 ^= var7_4 ^ -331797014;
                                var7_4 = (var5_3 | var8_2) ^ 1986903967;
                                continue block69;
                            }
                            case 2147323538: {
                                switch (var6_7) {
                                    case -265484958: {
                                        var7_4 = (var5_3 | var8_2) ^ -260695145;
                                        continue block69;
                                    }
                                    default: {
                                        var7_4 = (var5_3 | var8_2) ^ -985374045;
                                        continue block69;
                                    }
                                    case 1697819826: 
                                }
                                var7_4 = (var5_3 | var8_2) ^ -1770505322;
                                continue block69;
                            }
                            case 1926877106: 
                        }
                        return;
                    }
                    var7_4 = (var5_3 | var8_2) ^ 1637102932;
                    continue;
                }
                var7_4 = (var5_3 | var8_2) ^ -2027276435;
                continue;
                break;
            }
lbl131:
            // 1 sources

            while (true) {
                var7_4 = (var5_3 | var8_2) ^ 1339865233;
                ** GOTO lbl140
                break;
            }
            break;
        }
lbl134:
        // 1 sources

        while (true) {
            var7_4 = (var5_3 | var8_2) ^ 2105228191;
            if (true) ** GOTO lbl211
            break;
        }
        block72: while (true) {
            var7_4 = (var5_3 | var8_2) ^ -1427274162;
            if (true) ** GOTO lbl211
lbl140:
            // 7 sources

            block73: while (true) {
                switch (var7_4) {
                    case -1224015506: {
                        if (this.Jf(var1_1)) ** continue;
                        ** break;
                    }
                    case 727658570: {
                        var6_7 ^= var7_4 ^ 1987951738;
                        var7_4 = (var5_3 | var8_2) ^ 2028073231;
                        continue block73;
                    }
                    case -161626005: {
                        this.Jt(var3_5);
                        var7_4 = (var5_3 | var8_2) ^ 343296123;
                        continue block73;
                    }
                    case -370910583: {
                        this.Jj();
                        ** continue;
                    }
                    case -324931196: {
                        var6_7 ^= var7_4 ^ -1696200286;
                        ** continue;
                    }
                    case 1653172303: {
                        var4_6 = mj.trace();
                        ** GOTO lbl186
                    }
                    case -1320338992: {
                        var6_7 ^= var7_4 ^ -150057843;
                        ** GOTO lbl184
                    }
                    case -177152519: {
                        var6_7 ^= var7_4 ^ 1179918555;
                        ** continue;
                    }
                    case -552504999: {
                        return;
                    }
                    case -214850060: {
                        var6_7 ^= var7_4 ^ -2091326828;
                        var7_4 = (var5_3 | var8_2) ^ 243954068;
                        ** GOTO lbl179
                    }
lbl174:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ -699139645;
                    ** GOTO lbl179
                    case -2143926032: {
                        if (var3_5 >= 0) ** continue;
                        var7_4 = (var5_3 | var8_2) ^ -1017671597;
                    }
lbl179:
                    // 5 sources

                    default: {
                        continue block73;
                    }
                    case 998255020: {
                        var6_7 ^= var7_4 ^ 2062316518;
                        ** continue;
                    }
lbl184:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ -1705061968;
                    continue block73;
lbl186:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ 1703673413;
                    ** continue;
                    case 780419132: {
                        var6_7 ^= var7_4 ^ -1960570621;
                        var7_4 = (var5_3 | var8_2) ^ 667338918;
                        ** GOTO lbl179
                    }
                    case 162353840: 
                }
                return;
            }
            block75: while (true) {
                var7_4 = (var5_3 | var8_2) ^ 1133192744;
                ** GOTO lbl211
lbl197:
                // 1 sources

                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ -2106025975;
                    ** GOTO lbl211
                    break;
                }
lbl200:
                // 1 sources

                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ -363975050;
                    ** GOTO lbl211
lbl203:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ 934719176;
                        if (true) ** GOTO lbl211
                        break;
                    }
                    break;
                }
                block79: while (true) {
                    var7_4 = (var5_3 | var8_2) ^ 1476974957;
                    if (true) ** GOTO lbl211
                    block80: while (true) {
                        var7_4 = (var5_3 | var8_2) ^ 1558838899;
lbl211:
                        // 11 sources

                        block81: while (true) {
                            switch (var7_4) {
                                default: {
                                    continue block81;
                                }
                                case 312055689: {
                                    return;
                                }
                                case -2137230449: {
                                    return;
                                }
                                case -1639983934: {
                                    if (this.JA(this.a)) continue block80;
                                    ** continue;
                                }
                                case -1595973486: {
                                    var3_5 = this.Jz(this.b, class_1802.field_8801);
                                    var7_4 = (var5_3 | var8_2) ^ -746026571;
                                    ** continue;
                                }
                                case -815720649: {
                                    this.restart(var1_1);
                                    var7_4 = (var5_3 | var8_2) ^ -962614593;
                                    continue block81;
                                }
                                case 2058297846: {
                                    var6_7 ^= var7_4 ^ 293768850;
                                    ** continue;
                                }
                                case 1890925511: {
                                    var7_4 = (var5_3 | var8_2) ^ -811567737;
                                    continue block81;
                                }
                                case 1379549105: {
                                    var6_7 ^= var7_4 ^ 988908632;
                                    ** continue;
                                }
                                case 1044910912: {
                                    var6_7 ^= var7_4 ^ -1260501816;
                                    ** continue;
                                }
                                case -1539422324: {
                                    var6_7 ^= var7_4 ^ 1863521313;
                                    ** continue;
                                }
                                case -1151557673: {
                                    var6_7 ^= var7_4 ^ 590858138;
                                    continue block79;
                                }
                                case -1719883154: {
                                    this.Jm(t.a, var1_1);
                                    ** continue;
                                }
                                case -2052292000: {
                                    var6_7 ^= var7_4 ^ -1815288373;
                                    var7_4 = (var5_3 | var8_2) ^ 2018232944;
                                    continue block81;
                                }
                                case -261408716: {
                                    if (this.JB(this.a) <= 0) continue block75;
                                    continue block72;
                                }
                                case 930598008: 
                            }
                            var6_7 ^= var7_4 ^ 1258538406;
                            var7_4 = (var5_3 | var8_2) ^ 1726508349;
                        }
                        break;
                    }
                    break;
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
    private void Je(long var1_1) {
        var9_2 = -1956882642;
        var8_3 = -927457989;
        var5_4 = jW.c & -927457989 ^ 1461203027;
        var7_5 = 0;
        var6_6 = (var5_4 | var8_3) ^ 1728363491;
        var7_5 = (var5_4 | var8_3) ^ -612991131;
        ** GOTO lbl92
lbl8:
        // 1 sources

        while (true) {
            var7_5 = (var5_4 | var8_3) ^ -1743492142;
            ** GOTO lbl92
            break;
        }
lbl11:
        // 1 sources

        while (true) {
            var7_5 = (var5_4 | var8_3) ^ 1297740802;
            ** GOTO lbl92
lbl14:
            // 1 sources

            while (true) {
                continue;
                break;
            }
            break;
        }
lbl16:
        // 1 sources

        while (true) {
            var7_5 = (var5_4 | var8_3) ^ -528868537;
            ** GOTO lbl163
lbl19:
            // 1 sources

            while (true) {
                var7_5 = (var5_4 | var8_3) ^ -1968408884;
                ** GOTO lbl163
                break;
            }
            break;
        }
        var7_5 = (var5_4 | var8_3) ^ -212703863;
        block52: while (true) {
            switch (var7_5) {
                case 337977243: {
                    return;
                }
                case 484940476: {
                    var6_6 ^= var7_5 ^ 818619120;
                    ** GOTO lbl60
                }
                case -1035575135: {
                    var4_8 = mj.trace();
                    ** GOTO lbl64
                }
                case 1406965174: {
                    if (this.Jf(var1_1)) ** GOTO lbl49
                    ** GOTO lbl66
                }
                case 1062325617: {
                    this.Jt(var3_7);
                    ** GOTO lbl51
                }
                case -1314013773: {
                    var6_6 ^= var7_5 ^ -2098132478;
                    ** GOTO lbl77
                }
                case 1872722150: {
                    var6_6 ^= var7_5 ^ 1028176773;
                    var7_5 = (var5_4 | var8_3) ^ -1711499167;
                    break;
                }
                case -466344157: {
                    var6_6 ^= var7_5 ^ 237465822;
                    ** GOTO lbl79
                }
lbl49:
                // 1 sources

                var7_5 = (var5_4 | var8_3) ^ 999037528;
                continue block52;
lbl51:
                // 1 sources

                var7_5 = (var5_4 | var8_3) ^ -1017141305;
                continue block52;
                case 1318201736: {
                    var6_6 ^= var7_5 ^ -712286071;
                    var7_5 = (var5_4 | var8_3) ^ -878894368;
                    break;
                }
                case 1940902859: {
                    this.a.release();
                    ** GOTO lbl75
                }
lbl60:
                // 1 sources

                var7_5 = (var5_4 | var8_3) ^ -1939560243;
                continue block52;
                case 753555698: {
                    return;
                }
lbl64:
                // 1 sources

                var7_5 = (var5_4 | var8_3) ^ -1755631499;
                ** GOTO lbl163
lbl66:
                // 1 sources

                var7_5 = (var5_4 | var8_3) ^ -1859513101;
                continue block52;
                case 237324598: {
                    var6_6 ^= var7_5 ^ 1195139605;
                    var7_5 = (var5_4 | var8_3) ^ -521539574;
                    break;
                }
                case -787336954: {
                    var6_6 ^= var7_5 ^ -2088158289;
                    ** continue;
                }
lbl75:
                // 1 sources

                var7_5 = (var5_4 | var8_3) ^ 246025341;
                continue block52;
lbl77:
                // 1 sources

                var7_5 = (var5_4 | var8_3) ^ -1407717712;
                continue block52;
lbl79:
                // 1 sources

                var7_5 = (var5_4 | var8_3) ^ 503209434;
                continue block52;
                case 1178903834: {
                    if (var3_7 >= 0) {
                        var7_5 = (var5_4 | var8_3) ^ -778210227;
                        break;
                    }
                    var7_5 = (var5_4 | var8_3) ^ 1846902984;
                }
            }
lbl86:
            // 7 sources

        }
lbl87:
        // 1 sources

        while (true) {
            var7_5 = (var5_4 | var8_3) ^ 777461686;
            if (true) ** GOTO lbl92
            break;
        }
        block55: while (true) {
            var7_5 = (var5_4 | var8_3) ^ -1653660426;
lbl92:
            // 5 sources

            block56: while (true) {
                switch (var7_5) {
                    case 1020766612: {
                        var6_6 ^= var7_5 ^ 1139546075;
                        ** GOTO lbl149
                    }
                    case 1987584627: {
                        var6_6 ^= var7_5 ^ -1809687308;
                        var7_5 = (var5_4 | var8_3) ^ -1773878439;
                        continue block56;
                    }
                    case 80626206: {
                        ** GOTO lbl140
                    }
                    case -1868421208: {
                        var3_7 = this.Jy();
                        var7_5 = (var5_4 | var8_3) ^ -1339603555;
                        ** GOTO lbl86
                    }
                    case -535819961: {
                        var6_6 ^= var7_5 ^ -368158662;
                        var7_5 = (var5_4 | var8_3) ^ 868525388;
                        ** break;
                    }
                    case -235986227: {
                        if (this.JA(this.a)) ** GOTO lbl147
                        ** GOTO lbl132
                    }
                    case -1275197149: {
                        var6_6 ^= var7_5 ^ -151070501;
                        ** continue;
                    }
                    case -1830696583: {
                        return;
                    }
                    case 564673209: {
                        var6_6 ^= var7_5 ^ 1092911139;
                        ** GOTO lbl151
                    }
                    case -327378889: {
                        if (this.JB(this.a) == 0) ** GOTO lbl145
                        var7_5 = (var5_4 | var8_3) ^ -32503870;
                    }
lbl125:
                    // 4 sources

                    default: {
                        continue block56;
                    }
                    {
                    }
                    case 1202476713: {
                        var6_6 ^= var7_5 ^ 1601550780;
                        var7_5 = (var5_4 | var8_3) ^ 1057753030;
                        ** break;
                    }
lbl132:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ -479226641;
                    continue block56;
                    case 1241316898: {
                        this.Jm(t.i, var1_1);
                        ** continue;
                    }
                    case 1195184544: {
                        this.restart(var1_1);
                        continue block55;
                    }
lbl140:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ 1816540248;
                    continue block56;
                    case 1121393037: {
                        var6_6 ^= var7_5 ^ -1963821713;
                        ** continue;
                    }
lbl145:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ -1447026936;
                    continue block56;
lbl147:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ 1067988028;
                    continue block56;
lbl149:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ -1736102693;
                    continue block56;
lbl151:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ 1327110867;
                    continue block56;
                    case -525059395: 
                }
                break;
            }
            break;
        }
        return;
        while (true) {
            var7_5 = (var5_4 | var8_3) ^ 653423258;
            if (true) ** GOTO lbl163
            break;
        }
        block59: while (true) {
            var7_5 = (var5_4 | var8_3) ^ 684065824;
            if (true) ** GOTO lbl163
            block60: while (true) {
                var7_5 = (var5_4 | var8_3) ^ 816298159;
lbl163:
                // 6 sources

                block61: while (true) {
                    block68: {
                        block69: {
                            block67: {
                                switch (var7_5) {
                                    case 1252188397: {
                                        var6_6 ^= var7_5 ^ -322411093;
                                        continue block60;
                                    }
                                    case 1069688380: {
                                        mj.useOn(var4_8);
                                        break block67;
                                    }
                                    case -283146796: {
                                        return;
                                    }
                                    case -1956882674: {
                                        this.a = var1_1 + (4922624338790755781L << (var7_5 ^ var9_2) >>> (var7_5 ^ var9_2) ^ (long)var6_6 & 0xFFFFFFFFL | (4922624338790755781L >>> (var7_5 ^ var9_2) ^ (long)var6_6 & 0xFFFFFFFFL) << (var7_5 ^ var9_2)) + ThreadLocalRandom.current().nextLong(4922624338790755561L << (var7_5 ^ var9_2) >>> (var7_5 ^ var9_2) ^ (long)var6_6 & 0xFFFFFFFFL | (4922624338790755561L >>> (var7_5 ^ var9_2) ^ (long)var6_6 & 0xFFFFFFFFL) << (var7_5 ^ var9_2));
                                        var7_5 = (var5_4 | var8_3) ^ -1160462;
                                        continue block61;
                                    }
                                    case -1549168755: {
                                        if (mj.grimAccepts(this.a)) ** continue;
                                        break block68;
                                    }
                                    case -1878754731: {
                                        if (mj.matches(var4_8, this.a)) {
                                            ** continue;
                                        }
                                        break block68;
                                    }
                                    case -112570399: {
                                        var6_6 ^= var7_5 ^ -967874874;
                                        var7_5 = (var5_4 | var8_3) ^ 1424255605;
                                        continue block61;
                                    }
                                    case 1222839566: {
                                        var6_6 ^= var7_5 ^ 2036937630;
                                        ** break;
                                    }
                                    case 1427393463: {
                                        break block69;
                                    }
                                    case -712064157: {
                                        var6_6 ^= var7_5 ^ 1780522489;
                                        continue block59;
                                    }
                                    case 542537609: {
                                        var6_6 ^= var7_5 ^ 1315052535;
                                        ** continue;
                                    }
lbl202:
                                    // 1 sources

                                    var7_5 = (var5_4 | var8_3) ^ 1337739054;
                                    default: {
                                        continue block61;
                                    }
                                    case -142722725: 
                                }
                                return;
                            }
                            var7_5 = (var5_4 | var8_3) ^ -1793401450;
                            continue;
                        }
                        var7_5 = (var5_4 | var8_3) ^ 2081534710;
                        continue;
                    }
                    var7_5 = (var5_4 | var8_3) ^ 171376152;
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
    private boolean Jf(long var1_1) {
        block54: {
            var7_2 = 1471224556;
            var4_3 = jW.c & 1471224556 ^ 95516073;
            var6_4 = 0;
            var5_6 = (var4_3 | var7_2) ^ 1565477258;
            var6_4 = (var4_3 | var7_2) ^ -1896116476;
            break block54;
lbl7:
            // 1 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ -1207265565;
                ** GOTO lbl65
lbl10:
                // 2 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ -1460188665;
                    ** GOTO lbl65
                    while (true) {
                        var6_4 = (var4_3 | var7_2) ^ -771083353;
                        ** GOTO lbl65
                        break;
                    }
                    break;
                }
                break;
            }
        }
        block44: while (true) {
            switch (var6_4) {
                case 49931959: {
                    var5_6 ^= var6_4 ^ 501165040;
                    break;
                }
                case 1218411303: {
                    var3_5 = mj.facing(this.a);
                    var6_4 = (var4_3 | var7_2) ^ -1304910385;
                    ** GOTO lbl65
                }
                case -649400087: {
                    ** break;
lbl28:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 1430821210;
                }
                default: {
                    continue block44;
                }
            }
            var6_4 = (var4_3 | var7_2) ^ 523109578;
        }
        while (true) {
            var6_4 = (var4_3 | var7_2) ^ 822207521;
            ** GOTO lbl65
            break;
        }
        while (true) {
            var6_4 = (var4_3 | var7_2) ^ -1586278052;
            ** GOTO lbl65
lbl39:
            // 2 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ 960002170;
                ** GOTO lbl65
                break;
            }
            break;
        }
        while (true) {
            var6_4 = (var4_3 | var7_2) ^ -606994817;
            ** GOTO lbl65
            break;
        }
lbl45:
        // 1 sources

        while (true) {
            var6_4 = (var4_3 | var7_2) ^ -1812951889;
            if (true) ** GOTO lbl65
            break;
        }
        block50: while (true) {
            var6_4 = (var4_3 | var7_2) ^ 913280897;
            if (true) ** GOTO lbl65
            block51: while (true) {
                block55: {
                    var6_4 = (var4_3 | var7_2) ^ -1417110866;
                    break block55;
lbl54:
                    // 2 sources

                    block52: while (true) {
                        switch (var5_6) {
                            default: {
                                var5_6 ^= -125617647;
                                return v0;
                            }
                            case 1688999598: {
                                var5_6 ^= 1703063148;
                                continue block52;
                            }
                            case 1331728050: 
                        }
                        var5_6 ^= 161272357;
                        return v0;
                    }
                }
                block53: while (true) {
                    switch (var6_4) {
                        case 2124108508: {
                            var5_6 ^= var6_4 ^ -1390461550;
                            ** break;
                        }
                        case -1557171623: {
                            var5_6 ^= var6_4 ^ 1691250273;
                            var6_4 = (var4_3 | var7_2) ^ -294088726;
                            continue block53;
                        }
                        case -471193566: {
                            if (this.a == null) ** GOTO lbl10
                            var6_4 = (var4_3 | var7_2) ^ 544034848;
                            continue block53;
                        }
                        case 1444209947: {
                            v1 = false;
                            ** GOTO lbl148
                        }
                        case 2105943348: {
                            if (var1_1 < this.a) ** continue;
                            ** GOTO lbl165
                        }
                        case -207106493: {
                            v1 = true;
                            ** GOTO lbl148
                        }
                        case 2010918861: {
                            var6_4 = (var4_3 | var7_2) ^ -110326917;
                            continue block53;
                        }
                        case -414101245: {
                            if (var3_5 == null) ** continue;
                            ** GOTO lbl163
                        }
                        case -573879511: {
                            v0 = true;
                            ** GOTO lbl54
                        }
                        case -183105103: {
                            var5_6 ^= var6_4 ^ 366815015;
                            var6_4 = (var4_3 | var7_2) ^ -1971702588;
                            continue block53;
                        }
                        case -1511973146: {
                            this.a = var3_5;
                            ** GOTO lbl150
                        }
                        case 1952081361: {
                            this.a = this.Jg(this.a);
                            ** GOTO lbl39
                        }
                        case -690736420: {
                            var5_6 ^= var6_4 ^ 1244985354;
                            var6_4 = (var4_3 | var7_2) ^ 708270809;
                            continue block53;
                        }
                        case -155046223: {
                            var5_6 ^= var6_4 ^ -1715997679;
                            var6_4 = (var4_3 | var7_2) ^ 27630326;
                            continue block53;
                        }
                        case 1645857119: {
                            var5_6 ^= var6_4 ^ 225186815;
                            ** GOTO lbl181
                        }
                        case -1361185642: {
                            if (!mj.sees(this.a)) ** break;
                            ** continue;
                            ** continue;
                        }
                        case -1939832430: {
                            var5_6 ^= var6_4 ^ 1460316444;
                            ** continue;
                        }
                        case -1839908353: {
                            var5_6 ^= var6_4 ^ -105502421;
                            var6_4 = (var4_3 | var7_2) ^ -229613301;
                            continue block53;
                        }
                        case -761252676: {
                            if (var1_1 < this.a) ** continue;
                            ** GOTO lbl176
                        }
                        case 1722850252: {
                            var5_6 ^= var6_4 ^ -2038712998;
                            var6_4 = (var4_3 | var7_2) ^ -236995061;
                            continue block53;
                        }
                        case -443950558: {
                            var5_6 ^= var6_4 ^ 1563567084;
                            ** GOTO lbl170
                        }
                        case -2051322806: {
                            var5_6 ^= var6_4 ^ -1672668941;
                            var6_4 = (var4_3 | var7_2) ^ -1269082161;
                            continue block53;
                        }
lbl143:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -2062464175;
                        ** GOTO lbl171
                        case 1642000492: {
                            if (this.a != null) ** continue;
                            continue block51;
                        }
lbl148:
                        // 2 sources

                        var5_6 ^= -1198266893;
                        return v1;
lbl150:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -190968396;
                        ** GOTO lbl171
                        case -63314621: {
                            var5_6 ^= var6_4 ^ -616976443;
                            ** continue;
                        }
                        case -1177948153: {
                            this.a.hold();
                            var6_4 = (var4_3 | var7_2) ^ 690629937;
                            ** GOTO lbl171
                        }
                        case -272897778: {
                            this.a.aim(this.a.aim(), ((Float)this.a.getValue()).floatValue());
                            var6_4 = (var4_3 | var7_2) ^ -2124067535;
                            ** GOTO lbl171
                        }
lbl163:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -974895598;
                        ** GOTO lbl171
lbl165:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -1566083492;
                        ** GOTO lbl171
                        case -12175894: {
                            var6_4 = (var4_3 | var7_2) ^ 602610236;
                            continue block53;
                        }
lbl170:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -1327485202;
lbl171:
                        // 8 sources

                        default: {
                            continue block53;
                        }
                        case 1854474135: {
                            var5_6 ^= var6_4 ^ 1386734111;
                            continue block50;
                        }
lbl176:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ 900249266;
                        continue block53;
                        case -1502690842: {
                            v0 = false;
                            ** continue;
                        }
lbl181:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -1542016594;
                        continue block53;
                        case -1002310846: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    private iP Jg(class_2338 var1_1) {
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
    private class_2338 Jh(class_3965 var1_1) {
        block31: {
            block32: {
                break block32;
                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 1385369603;
                    break block31;
lbl4:
                    // 1 sources

                    while (true) {
                        var6_4 = (var4_3 | var7_2) ^ 1087101541;
                        ** GOTO lbl18
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var6_4 = (var4_3 | var7_2) ^ 1297402350;
                        break block31;
lbl10:
                        // 1 sources

                        block24: while (true) {
                            block34: {
                                block33: {
                                    block35: {
                                        switch (var6_4) {
                                            case -1422580351: {
                                                var5_6 ^= var6_4 ^ -1296689374;
                                                ** break;
                                            }
                                            case -1198807218: {
                                                ** GOTO lbl26
                                            }
lbl17:
                                            // 1 sources

                                            var6_4 = (var4_3 | var7_2) ^ 1839670723;
lbl18:
                                            // 3 sources

                                            default: {
                                                continue block24;
                                            }
                                            case 1229281810: {
                                                var5_6 ^= var6_4 ^ 1355180209;
                                                break block33;
                                            }
                                            case 982119779: {
                                                var5_6 ^= var6_4 ^ -589521127;
                                                ** GOTO lbl34
                                            }
lbl26:
                                            // 1 sources

                                            var5_6 ^= -1309762808;
                                            var5_6 ^= 303077823;
                                            if (jW.a.field_1687.method_8628(class_2246.field_23152.method_9564(), var3_7, class_3726.method_16195((class_1297)jW.a.field_1724))) {
                                                ** continue;
                                            }
                                            break block34;
                                            case 1312087978: {
                                                v0 = null;
                                                break block35;
                                            }
lbl34:
                                            // 1 sources

                                            var6_4 = (var4_3 | var7_2) ^ 1400199338;
                                            continue block24;
                                            case -2040931801: 
                                        }
                                        v0 = var3_7;
                                    }
                                    var5_6 ^= 531413384;
                                    return v0;
                                }
                                var6_4 = (var4_3 | var7_2) ^ -1513480114;
                                continue;
                            }
                            var6_4 = (var4_3 | var7_2) ^ -1564760586;
                            continue;
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl47:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 1591863916;
                    break block31;
                    break;
                }
lbl50:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 1018097240;
                    break block31;
                    break;
                }
lbl53:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ -780727673;
                    ** continue;
                    break;
                }
            }
            var7_2 = -876965024;
            var4_3 = jW.c & -876965024 ^ 1784082308;
            var6_4 = 0;
            var5_6 = (var4_3 | var7_2) ^ 1379033495;
            var6_4 = (var4_3 | var7_2) ^ 1626908248;
            block28: while (true) {
                switch (var6_4) {
                    default: {
                        continue block28;
                    }
                    case -774828112: {
                        var5_6 ^= -168566229;
                        var2_5 = new class_1750((class_1657)jW.a.field_1724, class_1268.field_5808, jW.a.field_1724.method_6047(), var1_1);
                        ** continue;
                    }
                    case -1962518084: {
                        var6_4 = (var4_3 | var7_2) ^ -2054857855;
                        continue block28;
                    }
                    case 1853596773: 
                }
                var5_6 ^= var6_4 ^ 8383900;
                var6_4 = (var4_3 | var7_2) ^ 976220244;
            }
        }
        block29: while (true) {
            switch (var6_4) {
                default: {
                    continue block29;
                }
                case -1256254072: {
                    var3_7 = var2_5.method_8037();
                    ** continue;
                }
                case -682618436: {
                    var5_6 ^= var6_4 ^ 1336418920;
                    ** continue;
                }
                case -1498794486: {
                    if (var2_5.method_7716()) ** continue;
                    var6_4 = (var4_3 | var7_2) ^ 167950173;
                    continue block29;
                }
                case -1183977497: {
                    var5_6 ^= var6_4 ^ -1644291002;
                    ** continue;
                }
                case -503560007: {
                    var5_6 ^= var6_4 ^ 2021739682;
                    var6_4 = (var4_3 | var7_2) ^ -1764982314;
                    continue block29;
                }
                case 2100461106: 
            }
            break;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    private void Ji() {
        block49: {
            block51: {
                block48: {
                    block52: {
                        block50: {
                            break block52;
lbl1:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1836958890;
                                break block48;
lbl4:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                break;
                            }
lbl6:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -541847490;
                                break block48;
lbl9:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl11:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -658444411;
                                    break block48;
                                    break;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 222951609;
                                    break block48;
                                    break;
                                }
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1459936603;
                                break block48;
lbl22:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 2076771916;
                                    break block48;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 1911500665;
                                    break block48;
lbl28:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ -1096327529;
                                        break block49;
                                        break;
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ 1023435605;
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
lbl34:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 1767707127;
                                    break block48;
                                    break;
                                }
                                break;
                            }
                            this.a = this.b;
                            var3_3 = (var1_2 | var4_1) ^ 1834429219;
                            break block48;
lbl40:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 1613078119;
                                ** continue;
                                break;
                            }
lbl43:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl45:
                            // 1 sources

                            return;
lbl47:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -814862151;
                                ** GOTO lbl131
                                break;
                            }
lbl50:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl52:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -1497234138;
                                break block50;
                                break;
                            }
lbl55:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 414598232;
                                break block51;
                                break;
                            }
                            this.a = null;
                            var3_3 = (var1_2 | var4_1) ^ 1265007151;
                            break block48;
lbl61:
                            // 1 sources

                            while (true) {
                                this.a = null;
                                ** continue;
                                break;
                            }
                            this.b = System.currentTimeMillis();
                            var3_3 = (var1_2 | var4_1) ^ -35667836;
                            break block48;
                            this.a = 0L;
                            var3_3 = (var1_2 | var4_1) ^ 96307399;
                            break block48;
                            this.b = jW.a.field_1724.method_31548().method_67532();
                            var3_3 = (var1_2 | var4_1) ^ 191066413;
                            break block48;
                        }
                        var3_3 = (var1_2 | var4_1) ^ 1991446982;
                        break block48;
lbl76:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -2143969030;
                            break block48;
lbl79:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1491823206;
                                break block48;
                                break;
                            }
                            break;
                        }
                    }
                    var4_1 = -394795714;
                    var1_2 = jW.c & -394795714 ^ 279664321;
                    var3_3 = 0;
                    var2_4 = (var1_2 | var4_1) ^ 265709971;
                    var3_3 = (var1_2 | var4_1) ^ -695740896;
                }
lbl89:
                // 4 sources

                block46: while (true) {
                    switch (var3_3) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block46;
                            }
                            break;
                        }
                        case -1995384698: {
                            ** continue;
                        }
                        case 2118834655: {
                            ** continue;
                        }
                        case -1566483464: {
                            ** continue;
                        }
                        case -207845678: {
                            ** continue;
                        }
                        case 789215482: {
                            ** continue;
                        }
                        case -1784095524: {
                            ** continue;
                        }
                        case -1907562951: {
                            ** continue;
                        }
                        case 541005946: {
                            ** continue;
                        }
                        case -1786629291: {
                            ** continue;
                        }
                        case 659285953: {
                            ** continue;
                        }
                        case 85997435: {
                            ** continue;
                        }
                        case -1281782320: {
                            ** continue;
                        }
                        case 1342494042: {
                            ** continue;
                        }
                        case 779624927: {
                            break block46;
                        }
                        case -172617914: {
                            var2_4 ^= var3_3 ^ 1043370563;
                            ** continue;
                        }
                        case 2026526469: {
                            var2_4 ^= var3_3 ^ 108062569;
                            ** continue;
                        }
                        case -451467274: {
                            this.b = null;
                            ** continue;
                        }
lbl131:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 1516153863;
                        ** continue;
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ -671772923;
                ** GOTO lbl89
                {
                    case -45973704: {
                        var2_4 ^= var3_3 ^ -417904767;
                        ** continue;
                    }
                    case -1851595256: {
                        this.a = t.d;
                        ** continue;
                    }
                    case -1609261671: {
                        var2_4 ^= var3_3 ^ 1053809964;
                        ** continue;
                    }
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 501796873;
            ** GOTO lbl89
        }
        var3_3 = (var1_2 | var4_1) ^ -2034946528;
        ** while (true)
        {
            ** case -2093551181:
        }
lbl151:
        // 1 sources

        this.a = true;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void Jj() {
        var4_1 = 853157282;
        var1_2 = jW.c & 853157282 ^ 1360712538;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -580147222;
        var3_3 = (var1_2 | var4_1) ^ -18467130;
        while (true) {
            block9: {
                block8: {
                    switch (var3_3) {
                        case 1527888284: {
                            var2_4 ^= var3_3 ^ -1923606510;
                            ** break;
                        }
                        case 954139949: {
                            var2_4 ^= var3_3 ^ 1423902752;
                            break block8;
                        }
                        case -1925398212: {
                            break block9;
                        }
                        case 55879615: {
                            return;
                        }
lbl18:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ -653018513;
                        break;
                        case -1429647979: {
                            this.Jk(true);
                            var3_3 = (var1_2 | var4_1) ^ 1258681047;
                        }
                    }
                    continue;
                }
                var3_3 = (var1_2 | var4_1) ^ 1888374853;
                continue;
            }
            var3_3 = (var1_2 | var4_1) ^ 684412518;
        }
    }

    /*
     * Exception decompiling
     */
    private void Jk(boolean var1_1) {
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
    private void Jl(class_2338 var1_1, long var2_2) {
        block24: {
            var7_3 = -166891954;
            var4_4 = jW.c & -166891954 ^ 1727237675;
            var6_5 = 0;
            ** GOTO lbl48
lbl5:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl7:
            // 1 sources

            block14: while (true) {
                block23: {
                    var6_5 = (var4_4 | var7_3) ^ 1880050709;
                    break block23;
lbl10:
                    // 1 sources

                    while (true) {
                        this.Jm(this.Jp(), var2_2);
                        ** GOTO lbl26
                        break;
                    }
                }
lbl14:
                // 6 sources

                block16: while (true) {
                    switch (var6_5) lbl-1000:
                    // 6 sources

                    {
                        while (true) {
                            default: {
                                continue block16;
                            }
                            break;
                        }
                        case -1461234226: {
                            ** continue;
                        }
                        case 1902491874: {
                            ** continue;
                        }
lbl23:
                        // 1 sources

                        while (true) {
                            var6_5 = (var4_4 | var7_3) ^ 1097201662;
                            ** GOTO lbl-1000
                            break;
                        }
lbl26:
                        // 1 sources

                        var6_5 = (var4_4 | var7_3) ^ 270688824;
                        ** GOTO lbl-1000
                        case -1687620670: {
                            var5_6 ^= var6_5 ^ 1295775805;
                            ** continue;
                        }
                        case -378239940: {
                            break block14;
                        }
                        case -2031050118: {
                            var5_6 ^= var6_5 ^ -67798648;
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            var6_5 = (var4_4 | var7_3) ^ 1578679201;
                            ** GOTO lbl-1000
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var6_5 = (var4_4 | var7_3) ^ 529230419;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -351701113: {
                            var5_6 ^= var6_5 ^ 604167789;
                            ** continue;
                        }
lbl45:
                        // 1 sources

                        while (true) {
                            var6_5 = (var4_4 | var7_3) ^ 502700520;
                            ** continue;
                            break;
                        }
lbl48:
                        // 1 sources

                        var5_6 = (var4_4 | var7_3) ^ 1580965456;
                        ** continue;
                    }
                    break;
                }
                break;
            }
            var6_5 = (var4_4 | var7_3) ^ 1838620077;
            ** GOTO lbl14
            {
                case 1457314850: {
                    return;
                }
            }
lbl54:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ -2019928435;
                ** GOTO lbl14
                break;
            }
            {
                case -421688233: {
                    var5_6 ^= var6_5 ^ -1353362422;
                    break block24;
                }
            }
            this.b = null;
            var6_5 = (var4_4 | var7_3) ^ 642144984;
            ** GOTO lbl14
            {
                case -1214637679: {
                    this.a = var1_1;
                    ** continue;
                }
                case -1596305: {
                    this.a = null;
                    ** continue;
                }
            }
            var6_5 = (var4_4 | var7_3) ^ 152586752;
            ** GOTO lbl14
        }
        var6_5 = (var4_4 | var7_3) ^ -1608306099;
        ** while (true)
        {
            ** case -793135945:
        }
lbl75:
        // 1 sources

        var5_6 ^= var6_5 ^ -1177214091;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void Jm(t var1_1, long var2_2) {
        block20: {
            var7_3 = 1981774553;
            var4_4 = jW.c & 1981774553 ^ 538723774;
            var6_5 = 0;
            ** GOTO lbl29
lbl5:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ 1803231571;
                ** GOTO lbl20
                break;
            }
lbl8:
            // 1 sources

            block12: while (true) {
                var6_5 = (var4_4 | var7_3) ^ -453701984;
                ** GOTO lbl20
                block13: while (this.a != var1_1) {
                    if (true) ** GOTO lbl47
lbl13:
                    // 1 sources

                    return;
                    block15: while (true) {
                        var6_5 = (var4_4 | var7_3) ^ -1119853553;
                        if (true) ** GOTO lbl20
                        block16: while (true) {
                            var6_5 = (var4_4 | var7_3) ^ -214921967;
lbl20:
                            // 6 sources

                            block17: while (true) {
                                switch (var6_5) lbl-1000:
                                // 4 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block17;
                                        }
                                        break;
                                    }
                                    case 1032716499: {
                                        continue block13;
                                    }
                                    case 493117100: {
                                        ** continue;
                                    }
lbl29:
                                    // 1 sources

                                    var5_6 = (var4_4 | var7_3) ^ 625047928;
                                    break block20;
lbl31:
                                    // 1 sources

                                    while (true) {
                                        var6_5 = (var4_4 | var7_3) ^ -1346224471;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case 1593363935: {
                                        var5_6 ^= var6_5 ^ -1644993975;
                                        continue block16;
                                    }
                                    case -882959376: {
                                        var5_6 ^= var6_5 ^ 1014593426;
                                        var6_5 = (var4_4 | var7_3) ^ 1267826476;
                                        ** GOTO lbl-1000
                                    }
                                    case 1453520023: {
                                        var5_6 ^= var6_5 ^ 1481400075;
                                        ** continue;
                                    }
                                    case -1830129313: {
                                        this.b = var2_2;
                                        break block12;
                                    }
lbl47:
                                    // 1 sources

                                    var6_5 = (var4_4 | var7_3) ^ 686273056;
                                    ** continue;
                                    case -2060455186: {
                                        this.a = var1_1;
                                        ** continue;
                                    }
                                    case -1693216551: {
                                        continue block15;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                }
                break;
            }
            var6_5 = (var4_4 | var7_3) ^ 549292904;
            ** GOTO lbl20
            {
                ** case -639811242:
            }
lbl57:
            // 1 sources

            var5_6 ^= var6_5 ^ 450293440;
            ** while (true)
        }
        var6_5 = (var4_4 | var7_3) ^ -317919450;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void restart(long var1_1) {
        block34: {
            block31: {
                block32: {
                    block30: {
                        block29: {
                            block33: {
                                break block34;
lbl1:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ -530673914;
                                    ** GOTO lbl15
lbl4:
                                    // 1 sources

                                    return;
                                }
lbl6:
                                // 1 sources

                                block19: while (true) {
                                    block35: {
                                        var5_4 = (var3_3 | var6_2) ^ -1819251643;
                                        break block35;
lbl9:
                                        // 1 sources

                                        while (true) {
                                            var4_5 ^= var5_4 ^ 203619898;
                                            break block29;
                                            break;
                                        }
lbl12:
                                        // 1 sources

                                        while (true) {
                                            var4_5 ^= var5_4 ^ 2122728013;
                                            break block30;
                                            break;
                                        }
                                    }
lbl16:
                                    // 9 sources

                                    block22: while (true) {
                                        switch (var5_4) lbl-1000:
                                        // 6 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block22;
                                                }
                                                break;
                                            }
                                            case 1780066134: {
                                                ** continue;
                                            }
                                            case -1392632260: {
                                                ** continue;
                                            }
                                            case -1151560604: {
                                                ** continue;
                                            }
                                            case 2017127046: {
                                                this.b = null;
                                                break block31;
                                            }
                                            case -52020978: {
                                                this.a = 0L;
                                                break block19;
                                            }
lbl33:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ -2077039075;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl36:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ -230810959;
                                                ** GOTO lbl-1000
                                                break;
                                            }
                                            case -121668283: {
                                                var4_5 ^= var5_4 ^ 219795051;
                                                break block32;
                                            }
lbl42:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ 1196726527;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl45:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ 1723601688;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl48:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ -1546135265;
                                                ** continue;
                                                break;
                                            }
                                            case -1855464497: {
                                                var4_5 ^= var5_4 ^ -166147236;
                                                ** continue;
                                            }
                                            case -850368312: {
                                                this.a = null;
                                                break block33;
                                            }
                                            case 1289308025: {
                                                this.a = null;
                                                ** continue;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                }
                                var5_4 = (var3_3 | var6_2) ^ -1375098442;
                                ** GOTO lbl16
                            }
                            var5_4 = (var3_3 | var6_2) ^ -413240537;
                            ** GOTO lbl16
                            {
                                case -550437505: {
                                    var4_5 ^= var5_4 ^ -17254434;
                                    ** continue;
                                }
                                case 1125212220: {
                                    var4_5 ^= var5_4 ^ -2019969173;
                                    break;
                                }
                            }
                        }
                        var5_4 = (var3_3 | var6_2) ^ 1433916719;
                        ** GOTO lbl16
                        {
                            case -1665553562: {
                                break;
                            }
                        }
                        var5_4 = (var3_3 | var6_2) ^ 1941386496;
                        ** GOTO lbl16
                        {
                            case 147522617: {
                                this.b = var1_1;
                                ** continue;
                            }
                        }
                        var5_4 = (var3_3 | var6_2) ^ 2088702533;
                        ** GOTO lbl16
                        {
                            case 1506959713: {
                                this.a = t.d;
                                ** continue;
                            }
                        }
                    }
                    var5_4 = (var3_3 | var6_2) ^ 933590592;
                    ** GOTO lbl16
                }
                var5_4 = (var3_3 | var6_2) ^ -1014477961;
                ** GOTO lbl16
            }
            var5_4 = (var3_3 | var6_2) ^ -942600388;
            ** while (true)
            {
                ** case -667942562:
            }
lbl96:
            // 1 sources

            var4_5 ^= var5_4 ^ -482425128;
            ** while (true)
        }
        var6_2 = 220602409;
        var3_3 = jW.c & 220602409 ^ 994734680;
        var5_4 = 0;
        var4_5 = (var3_3 | var6_2) ^ -1645031069;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void Jn(long var1_1) {
        block55: {
            block57: {
                block56: {
                    block54: {
                        block53: {
                            break block57;
lbl1:
                            // 1 sources

                            while (true) {
                                var6_4 = (var4_3 | var7_2) ^ 1356060854;
                                ** GOTO lbl106
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var6_4 = (var4_3 | var7_2) ^ 661100474;
                                ** GOTO lbl106
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                if (var3_5 == null) break block53;
                                ** continue;
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var5_6 ^= var6_4 ^ 186555361;
                                var6_4 = (var4_3 | var7_2) ^ 1683844824;
                                ** GOTO lbl106
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var6_4 = (var4_3 | var7_2) ^ -1369097144;
                                ** GOTO lbl106
                                break;
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                var6_4 = (var4_3 | var7_2) ^ 60510680;
                                ** GOTO lbl106
                                break;
                            }
lbl20:
                            // 1 sources

                            while (true) {
                                var3_5.markShielded(this.a);
                                ** GOTO lbl98
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                var5_6 ^= var6_4 ^ -1374555379;
                                break block54;
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var6_4 = (var4_3 | var7_2) ^ -393078693;
                                ** GOTO lbl106
                                break;
                            }
                        }
                        while (true) {
                            var6_4 = (var4_3 | var7_2) ^ 1505331617;
                            ** GOTO lbl106
                            break;
                        }
lbl33:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl35:
                        // 1 sources

                        while (true) {
                            var6_4 = (var4_3 | var7_2) ^ -1103997103;
                            ** GOTO lbl106
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var6_4 = (var4_3 | var7_2) ^ -1914862692;
                            ** GOTO lbl106
                            break;
                        }
lbl41:
                        // 1 sources

                        return;
lbl43:
                        // 1 sources

                        while (true) {
                            var5_6 ^= var6_4 ^ 1974283913;
                            ** GOTO lbl87
                            break;
                        }
lbl46:
                        // 1 sources

                        while (true) {
                            var6_4 = (var4_3 | var7_2) ^ 557902529;
                            break block55;
                            break;
                        }
                    }
                    var6_4 = (var4_3 | var7_2) ^ 337880359;
                    ** GOTO lbl106
lbl52:
                    // 1 sources

                    while (true) {
                        var6_4 = (var4_3 | var7_2) ^ 1677057804;
                        ** GOTO lbl106
                        break;
                    }
lbl55:
                    // 1 sources

                    while (true) {
                        var5_6 ^= var6_4 ^ 982415216;
                        break block56;
                        break;
                    }
lbl58:
                    // 1 sources

                    return;
lbl60:
                    // 1 sources

                    while (true) {
                        var3_5 = bp.instance();
                        ** continue;
                        break;
                    }
lbl63:
                    // 1 sources

                    while (true) {
                        var5_6 ^= var6_4 ^ 145226504;
                        ** continue;
                        break;
                    }
lbl66:
                    // 1 sources

                    while (true) {
                        this.Jm(t.i, var1_1);
                        ** continue;
                        break;
                    }
                }
                var6_4 = (var4_3 | var7_2) ^ -1336792329;
                ** GOTO lbl106
            }
            var7_2 = -727196035;
            var4_3 = jW.c & -727196035 ^ -115159619;
            var6_4 = 0;
            var5_6 = (var4_3 | var7_2) ^ 998161603;
            ** while (true)
        }
lbl79:
        // 2 sources

        block45: while (true) {
            switch (var6_4) lbl-1000:
            // 2 sources

            {
                default: {
                    continue block45;
                }
                case -588827332: {
                    break block45;
                }
                case 248700068: {
                    ** continue;
                }
lbl87:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 1756854247;
                ** GOTO lbl106
lbl89:
                // 1 sources

                while (true) {
                    var5_6 ^= var6_4 ^ 2098852091;
                    ** continue;
                    break;
                }
lbl92:
                // 1 sources

                while (true) {
                    if (this.a != t.e) ** continue;
                    ** continue;
                    break;
                }
lbl95:
                // 1 sources

                while (true) {
                    this.Jj();
                    ** continue;
                    break;
                }
lbl98:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 1503068524;
                if (true) ** GOTO lbl106
                block50: while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 500285257;
                    ** GOTO lbl106
lbl103:
                    // 1 sources

                    while (true) {
                        var5_6 ^= var6_4 ^ -510367813;
                        ** continue;
                        break;
                    }
lbl106:
                    // 16 sources

                    block52: while (true) {
                        switch (var6_4) {
                            default: {
                                continue block52;
                            }
                            case -529112908: {
                                ** continue;
                            }
                            case -1384904885: {
                                ** continue;
                            }
                            case -1711623899: {
                                ** continue;
                            }
                            case -1540301167: {
                                ** continue;
                            }
                            case -1794070502: {
                                ** continue;
                            }
                            case 1133873324: {
                                ** continue;
                            }
                            case -1541515684: {
                                ** continue;
                            }
                            case 1555369940: {
                                ** continue;
                            }
                            case 1887067233: {
                                ** continue;
                            }
                            case 1405281205: {
                                ** continue;
                            }
                            case -377193766: {
                                ** continue;
                            }
                            case 355846054: {
                                ** continue;
                            }
                            case -29585883: {
                                ** continue;
                            }
                            case 1307964682: {
                                ** continue;
                            }
                            case -1638792975: {
                                ** continue;
                            }
                            case -624932793: 
                        }
                        continue block50;
                        break;
                    }
                    break;
                }
                case 323854044: {
                    var5_6 ^= var6_4 ^ -447377887;
                    var6_4 = (var4_3 | var7_2) ^ -210435239;
                    ** GOTO lbl-1000
                }
            }
            break;
        }
        var6_4 = (var4_3 | var7_2) ^ -286637791;
        ** while (true)
        this.b = true;
        var6_4 = (var4_3 | var7_2) ^ -1592602583;
        ** while (true)
    }

    private static int Jo(int n2, int n3) {
        int n4 = -455572968;
        int n5 = -1925299038;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x6A54E6F4)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xEDFEB777;
        n6 ^= (n5 | n4) ^ 0xEDFE35E5;
        n6 += (n5 | n4) ^ 0xEDFE9A33;
        n6 -= (n5 | n4) ^ 0xEDFE34E8;
        n6 += (n5 | n4) ^ 0xEDFEF7C3;
        n6 += (n5 | n4) ^ 0xEDFE47FB;
        n6 -= (n5 | n4) ^ 0xEDFEB943;
        return n6 += (n5 | n4) ^ 0xEDFEB5EC;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private t Jp() {
        block20: {
            break block20;
lbl-1000:
            // 4 sources

            {
                block21: {
                    switch (var4_3) {
                        case 754964394: {
                            v0 = t.e;
                            ** break;
                        }
                        case -1494171554: {
                            v0 = t.i;
                            ** break;
                        }
                        case 965779512: {
                            var3_4 ^= var4_3 ^ -429886090;
                            var4_3 = (var2_2 | var5_1) ^ -1861238903;
                            break;
                        }
                        case -1553036110: {
                            var3_4 ^= var4_3 ^ 2008035887;
                            var4_3 = (var2_2 | var5_1) ^ -1550905397;
                            break;
                        }
lbl16:
                        // 2 sources

                        var3_4 ^= 1838957776;
                        return v0;
                        case -1804570596: {
                            if (var1_5 != null) {
                                var4_3 = (var2_2 | var5_1) ^ -1830850435;
                                continue block15;
                            }
                            break block21;
                        }
                        case -1524625494: {
                            var4_3 = (var2_2 | var5_1) ^ -1223450449;
                            break;
                        }
                        case -1861461169: {
                            var3_4 ^= var4_3 ^ 1325174273;
                            var4_3 = (var2_2 | var5_1) ^ 453027965;
                            break;
                        }
                        case -2131959944: {
                            if (!var1_5.isEnabled()) break block21;
                            var4_3 = (var2_2 | var5_1) ^ -1494014824;
                        }
                    }
                    continue;
                }
                var4_3 = (var2_2 | var5_1) ^ 242212847;
                ** while (true)
            }
lbl37:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ -1802374299;
                ** GOTO lbl-1000
                break;
            }
        }
        var5_1 = 384728593;
        var2_2 = jW.c & 384728593 ^ 631051222;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ -1251095376;
        var4_3 = (var2_2 | var5_1) ^ 1261804261;
        block18: while (true) {
            switch (var4_3) {
                case 2093671730: {
                    var4_3 = (var2_2 | var5_1) ^ 2051045503;
                    continue block18;
                }
                case -254131793: {
                    var1_5 = bp.instance();
                    ** continue;
                }
                case 1304364968: {
                    var3_4 ^= var4_3 ^ 1930487471;
                    var4_3 = (var2_2 | var5_1) ^ -953860488;
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    private void Jq(long var1_1) {
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
    private void Jr(long l2) {
        int n2 = 174122219;
        int n3 = -768665489;
        int n4 = c & 0xD22F186F ^ 0x28950DB;
        int n5 = 0;
        int n6 = (n4 | n3) ^ 0x11C457B;
        n5 = (n4 | n3) ^ 0xEA1EFB4E;
        block7: while (true) {
            switch (n5) {
                case -1561670203: {
                    return;
                }
                case 174122187: {
                    this.a = Math.max(this.a, l2 + (5419696207041044612L << (n5 ^ n2) >>> (n5 ^ n2) ^ (long)n6 & 0xFFFFFFFFL | (5419696207041044612L >>> (n5 ^ n2) ^ (long)n6 & 0xFFFFFFFFL) << (n5 ^ n2)) + ThreadLocalRandom.current().nextLong(5419696207041044692L << (n5 ^ n2) >>> (n5 ^ n2) ^ (long)n6 & 0xFFFFFFFFL | (5419696207041044692L >>> (n5 ^ n2) ^ (long)n6 & 0xFFFFFFFFL) << (n5 ^ n2)));
                    n5 = (n4 | n3) ^ 0xDF2FF650;
                    continue block7;
                }
                case 226537135: {
                    n6 ^= n5 ^ 0xE5FC28D8;
                    n5 = (n4 | n3) ^ 0x7045953A;
                    break;
                }
                case 951165873: {
                    n5 = (n4 | n3) ^ 0x7A5D369E;
                    break;
                }
                case -1460507039: {
                    n6 ^= n5 ^ 0x3077D319;
                    n5 = (n4 | n3) ^ 0xD8CFBC34;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private long Js() {
        int n2 = c & 0xA3EF0D66 ^ 0x48213449;
        int n3 = 0;
        int n4 = (n2 | 0xA3EF0D66) ^ 0x91215FA3;
        n3 = (n2 | 0xA3EF0D66) ^ 0xC36DC66;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -908071475: {
                    n4 ^= n3 ^ 0x71A195F4;
                    n3 = (n2 | 0xA3EF0D66) ^ 0xDED1E1C8;
                    continue block5;
                }
                case -405151479: {
                    break;
                }
                case 893312167: {
                    return (-4418001591614824891L << (n3 ^ 0x353EDC87) >>> (n3 ^ 0x353EDC87) ^ (long)n4 & 0xFFFFFFFFL | (-4418001591614824891L >>> (n3 ^ 0x353EDC87) ^ (long)n4 & 0xFFFFFFFFL) << (n3 ^ 0x353EDC87)) + Math.round(180000.0 / Math.max(1.0, (double)((Float)this.a.getValue()).floatValue()));
                }
            }
            n3 = (n2 | 0xA3EF0D66) ^ 0x2230D0A2;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void Jt(int var1_1) {
        block24: {
            block23: {
                block22: {
                    block25: {
                        var5_2 = -1892535841;
                        var2_3 = jW.c & -1892535841 ^ -1881553297;
                        var4_4 = 0;
                        var3_5 = (var2_3 | var5_2) ^ 877682450;
                        ** GOTO lbl54
lbl6:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -992269550;
                            if (true) ** GOTO lbl21
                            break;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            lw.switchToSlot(var1_1);
                            break block22;
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ -1434136053;
                            break block23;
                            break;
                        }
lbl15:
                        // 1 sources

                        while (jW.a.field_1724.method_31548().method_67532() != var1_1) {
                            ** continue;
lbl17:
                            // 1 sources

                            ** GOTO lbl6
                        }
                        break block22;
                        block17: while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1098491115;
lbl21:
                            // 7 sources

                            block18: while (true) {
                                switch (var4_4) lbl-1000:
                                // 5 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block18;
                                        }
                                        break;
                                    }
                                    case 1260444909: {
                                        continue block17;
                                    }
                                    case 830319850: {
                                        ** continue;
                                    }
                                    case 541278340: {
                                        ** continue;
                                    }
                                    case -1439447061: {
                                        ** GOTO lbl15
                                    }
                                    case 3483969: {
                                        var3_5 ^= var4_4 ^ -252816362;
                                        break block17;
                                    }
                                    case 167260255: {
                                        return;
                                    }
lbl39:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ -1421967738;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case -978348695: {
                                        var4_4 = (var2_3 | var5_2) ^ 495581120;
                                        ** GOTO lbl-1000
                                    }
                                    case -1838022593: {
                                        var3_5 ^= var4_4 ^ -1149178279;
                                        ** continue;
                                    }
lbl48:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ 633876500;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case 616925561: {
                                        if (var1_1 < 0) break block22;
                                        break block24;
                                    }
lbl54:
                                    // 1 sources

                                    var4_4 = (var2_3 | var5_2) ^ 1247044246;
                                    ** continue;
                                    case 1222164510: {
                                        this.a = var1_1;
                                        break block25;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        var4_4 = (var2_3 | var5_2) ^ -2046572640;
                        ** GOTO lbl21
                    }
                    var4_4 = (var2_3 | var5_2) ^ -1882267970;
                    ** GOTO lbl21
                    {
                        ** case -990692392:
                    }
lbl65:
                    // 1 sources

                    ** while (true)
                }
                var4_4 = (var2_3 | var5_2) ^ -1346848901;
                ** GOTO lbl21
            }
            var4_4 = (var2_3 | var5_2) ^ -953993247;
            ** GOTO lbl21
        }
        var4_4 = (var2_3 | var5_2) ^ 1258867751;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private boolean Ju() {
        block50: {
            block49: {
                var4_1 = 1143078365;
                var1_2 = jW.c & 1143078365 ^ 168477329;
                var3_3 = 0;
                ** GOTO lbl90
lbl5:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1361355613;
                    ** GOTO lbl61
lbl8:
                    // 1 sources

                    return v0;
lbl10:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1006621825;
                        ** GOTO lbl61
                        break;
                    }
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1077878158;
                    ** GOTO lbl61
lbl16:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1941899997;
                        ** GOTO lbl61
                        break;
                    }
lbl19:
                    // 1 sources

                    while (jW.a.field_1724 != null) {
                        break block49;
                    }
                    ** GOTO lbl85
lbl22:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -304984385;
                        ** GOTO lbl61
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1671622692;
                        ** GOTO lbl61
lbl28:
                        // 2 sources

                        while (true) {
                            var2_4 ^= 1431775084;
                            ** continue;
                            break;
                        }
lbl31:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1213059895;
                            ** GOTO lbl61
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl34:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 24431310;
                    ** GOTO lbl61
lbl37:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 746806404;
                        ** continue;
                        break;
                    }
                    break;
                }
                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1526995204;
                    ** GOTO lbl61
                    break;
                }
lbl43:
                // 1 sources

                block34: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -401194078;
                    ** GOTO lbl61
lbl46:
                    // 1 sources

                    while (true) {
                        v0 = false;
                        ** GOTO lbl28
                        break;
                    }
lbl49:
                    // 1 sources

                    while (true) {
                        var2_4 ^= -70540258;
                        ** GOTO lbl84
lbl52:
                        // 1 sources

                        while (true) {
                            v0 = true;
                            ** continue;
                            break;
                        }
lbl55:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -580284640;
                            ** continue;
                            break;
                        }
lbl58:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -2072257265;
                            ** GOTO lbl88
                            break;
                        }
lbl61:
                        // 16 sources

                        block40: while (true) {
                            switch (var3_3) lbl-1000:
                            // 4 sources

                            {
                                while (true) {
                                    default: {
                                        continue block40;
                                    }
                                    break;
                                }
                                case -1505903489: {
                                    ** GOTO lbl19
                                }
                                case -683083622: {
                                    ** continue;
                                }
                                case 1331639571: {
                                    break block34;
                                }
                                case -1480561018: {
                                    ** continue;
                                }
                                case 760648593: {
                                    ** continue;
                                }
                                case -1976839006: {
                                    ** continue;
                                }
                                case -1684673789: {
                                    ** continue;
                                }
                                case -1031292628: {
                                    ** continue;
                                }
                                case -521100418: {
                                    ** continue;
                                }
lbl84:
                                // 1 sources

                                if (!jW.a.field_1724.method_7325()) ** continue;
lbl85:
                                // 7 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1934866703;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl88:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ 1669164108;
                                ** GOTO lbl-1000
lbl90:
                                // 1 sources

                                var2_4 = (var1_2 | var4_1) ^ 379287799;
                                ** continue;
lbl92:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1793262263;
                                    ** continue;
                                    break;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ -1902949181;
                ** GOTO lbl61
                {
                    case -1037210032: {
                        if (jW.a.field_1761 == null) ** GOTO lbl85
                        ** continue;
                    }
                    case -1033172226: {
                        ** continue;
                    }
                    case -1061637346: {
                        var2_4 ^= var3_3 ^ -2088962105;
                        ** continue;
                    }
                }
lbl105:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 66054597;
                    ** GOTO lbl61
                    break;
                }
                {
                    case 107359466: {
                        if (jW.a.field_1687 == null) ** GOTO lbl85
                        ** continue;
                    }
                    case 1304696344: {
                        if (jW.a.field_1724.method_6115()) ** GOTO lbl85
                        ** continue;
                    }
                }
lbl114:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -708963106;
                    ** GOTO lbl61
                    break;
                }
lbl117:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1721563321;
                    ** GOTO lbl61
                    break;
                }
lbl120:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1945726579;
                    ** GOTO lbl61
                    break;
                }
                {
                    case -1543917214: {
                        if (jW.a.field_1755 != null) ** GOTO lbl85
                        ** continue;
                    }
                    case -355460831: {
                        ** continue;
                    }
                }
lbl128:
                // 1 sources

                while (true) {
                    var2_4 ^= 2072587965;
                    break block50;
                    break;
                }
                {
                    case 763957241: {
                        ** continue;
                    }
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -370437797;
            ** while (true)
            {
                case -617151852: {
                    var2_4 ^= var3_3 ^ -1598149591;
                    ** continue;
                }
            }
        }
        if (this.Jv()) ** break;
        ** while (true)
        ** while (true)
        {
            ** case -236249681:
        }
lbl144:
        // 1 sources

        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean Jv() {
        var4_1 = 1188163291;
        var1_2 = jW.c & 1188163291 ^ 491488295;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 658104295;
        var3_3 = (var1_2 | var4_1) ^ 1053456351;
        ** GOTO lbl25
        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -642951314;
            if (true) ** GOTO lbl25
            break;
        }
        block23: while (true) {
            switch (var2_4) {
                case -539968195: {
                    var2_4 ^= -909931233;
                    break;
                }
                default: {
                    var2_4 ^= -1779620233;
                    continue block23;
                }
                case -944093612: {
                    var2_4 ^= 730220689;
                }
            }
            if (!((Boolean)v0.method_75697(class_12206.field_63757, v1.method_24515())).booleanValue()) ** continue;
            var3_3 = (var1_2 | var4_1) ^ 1705846692;
            if (true) ** GOTO lbl72
            block24: while (true) {
                var3_3 = (var1_2 | var4_1) ^ -1206089641;
lbl25:
                // 3 sources

                block25: while (true) {
                    switch (var3_3) {
                        case -2084077551: {
                            v2 = false;
                            ** GOTO lbl47
                        }
                        case 870140684: {
                            var3_3 = (var1_2 | var4_1) ^ 1238184114;
                            continue block25;
                        }
                        case -928968189: {
                            var2_4 ^= var3_3 ^ 2012833103;
                            ** break;
                        }
                        case 396802479: {
                            v2 = true;
                            ** GOTO lbl47
                        }
                        case -88401476: {
                            var2_4 ^= var3_3 ^ 441288901;
                            ** break;
                        }
                        case -484505539: {
                            var2_4 ^= var3_3 ^ 1145652089;
                            continue block24;
                        }
lbl45:
                        // 2 sources

                        var3_3 = (var1_2 | var4_1) ^ 1812375027;
                        ** GOTO lbl72
lbl47:
                        // 2 sources

                        var2_4 ^= -1750992435;
                        return v2;
                        case -406362456: {
                            switch (var2_4) {
                                case -1717423065: {
                                    var3_3 = (var1_2 | var4_1) ^ -1520371901;
                                    continue block25;
                                }
                                default: {
                                    var3_3 = (var1_2 | var4_1) ^ -1753547524;
                                    continue block25;
                                }
                                case -242340231: 
                            }
                            var3_3 = (var1_2 | var4_1) ^ -1127946558;
                            ** GOTO lbl72
                        }
                        case -2039039599: {
                            var2_4 ^= var3_3 ^ 878313056;
                            var3_3 = (var1_2 | var4_1) ^ 1216173904;
                            ** GOTO lbl72
                        }
                        case 1628543264: {
                            var3_3 = (var1_2 | var4_1) ^ 1778473492;
                            continue block25;
                        }
                        case 903525611: {
                            continue block24;
                        }
                        case 980863323: {
                            var2_4 ^= var3_3 ^ -2007396694;
                            var3_3 = (var1_2 | var4_1) ^ -602116370;
                        }
lbl72:
                        // 6 sources

                        default: {
                            continue block25;
                        }
                        case 370597453: 
                    }
                    break;
                }
                break;
            }
            v0 = jW.a.field_1687.method_75728();
            v1 = jW.a.field_1724;
        }
    }

    /*
     * Unable to fully structure code
     */
    private boolean Jw() {
        block36: {
            block42: {
                block40: {
                    block39: {
                        block38: {
                            block37: {
                                block41: {
                                    break block41;
lbl1:
                                    // 1 sources

                                    return v0;
lbl3:
                                    // 3 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 578934453;
                                        break block36;
                                        break;
                                    }
lbl6:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ 535166863;
                                        break block37;
                                        break;
                                    }
lbl9:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -31737367;
                                        break block36;
                                        break;
                                    }
lbl12:
                                    // 1 sources

                                    while (true) {
                                        if (this.Jz(this.b, class_1802.field_8801) < 0) ** GOTO lbl3
                                        break block38;
                                        break;
                                    }
                                }
                                var4_1 = -639695171;
                                var1_2 = jW.c & -639695171 ^ 2064846413;
                                var3_3 = 0;
                                break block42;
lbl20:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 1231006400;
                                    break block36;
                                    break;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ 1815882100;
                            break block36;
lbl26:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -574457761;
                                break block39;
                                break;
                            }
lbl29:
                            // 2 sources

                            while (true) {
                                var2_4 ^= -2092258653;
                                ** continue;
                                break;
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ 68164992;
                        break block36;
lbl35:
                        // 1 sources

                        while (true) {
                            var2_4 ^= 1147993218;
                            break block40;
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1948567432;
                            break block36;
lbl41:
                            // 1 sources

                            while (true) {
                                v0 = true;
                                ** GOTO lbl29
                                break;
                            }
lbl44:
                            // 1 sources

                            while (true) {
                                if (this.Jz(this.d, class_1802.field_23141) < 0) ** GOTO lbl3
                                ** continue;
                                break;
                            }
lbl47:
                            // 1 sources

                            while (true) {
                                v0 = false;
                                ** continue;
                                break;
                            }
                            break;
                        }
lbl50:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -717965277;
                            break block36;
                            break;
                        }
lbl53:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1465460688;
                            break block36;
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ -1938756787;
                    break block36;
lbl59:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 209674675;
                        ** GOTO lbl110
                        break;
                    }
                }
                if (((Boolean)this.a.getValue()).booleanValue()) {
                    ** continue;
lbl65:
                    // 1 sources

                    while (true) {
                        if (this.Jy() >= 0) ** break;
                        ** continue;
                        ** GOTO lbl105
                        break;
                    }
                }
                ** GOTO lbl105
            }
            var2_4 = (var1_2 | var4_1) ^ -435919984;
            var3_3 = (var1_2 | var4_1) ^ -2132631244;
        }
lbl74:
        // 2 sources

        block32: while (true) {
            switch (var3_3) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block32;
                    }
                    break;
                }
                case -648095672: {
                    ** continue;
                }
                case 460939160: {
                    ** continue;
                }
                case 787199710: {
                    ** continue;
                }
                case 2008016304: {
                    ** continue;
                }
                case -1300192195: {
                    ** continue;
                }
                case -1746720887: {
                    ** continue;
                }
                case 96778004: {
                    ** continue;
                }
                case 2067640265: {
                    break block32;
                }
                case 1400493773: {
                    ** continue;
                }
                case -1879324299: {
                    ** continue;
                }
                case -1921799968: {
                    var2_4 ^= var3_3 ^ 938111482;
                    ** continue;
                }
                case -3206275: {
                    var2_4 ^= var3_3 ^ -1146884097;
                    ** continue;
                }
lbl105:
                // 2 sources

                var3_3 = (var1_2 | var4_1) ^ -525971099;
                ** GOTO lbl-1000
lbl107:
                // 1 sources

                while (true) {
                    var2_4 ^= 163305127;
                    ** continue;
                    break;
                }
lbl110:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -726465134;
                ** continue;
                case 795609967: {
                    ** continue;
                }
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ 1991026205;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private int Jx() {
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
    private int Jy() {
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
    private int Jz(gP var1_1, class_1792 var2_2) {
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean JA(class_2338 var1_1) {
        block24: {
            block25: {
                block26: {
                    var5_2 = 297337112;
                    var2_3 = jW.c & 297337112 ^ -1178691322;
                    var4_4 = 0;
                    ** GOTO lbl51
lbl5:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -238255311;
                        ** GOTO lbl17
                        break;
                    }
lbl8:
                    // 1 sources

                    while (jW.a.field_1687.method_8320(var1_1).method_27852(class_2246.field_23152)) {
                        ** continue;
lbl10:
                        // 1 sources

                        ** GOTO lbl5
                    }
                    break block26;
lbl12:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 417408392;
                        if (true) ** GOTO lbl17
                        break;
                    }
                    block14: while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 1394296272;
lbl17:
                        // 5 sources

                        block15: while (true) {
                            switch (var4_4) lbl-1000:
                            // 5 sources

                            {
                                while (true) {
                                    default: {
                                        continue block15;
                                    }
                                    break;
                                }
                                case -1587626858: {
                                    ** GOTO lbl8
                                }
                                case 1215502895: {
                                    var3_5 ^= var4_4 ^ 1965990652;
                                    break block24;
                                }
lbl27:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 246709533;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl30:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ -501937241;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case -1223957501: {
                                    var3_5 ^= var4_4 ^ -401701607;
                                    ** continue;
                                }
lbl36:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ -1650705768;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 2126740054;
                                    ** continue;
                                    break;
                                }
                                case -948116664: {
                                    v0 = false;
                                    break block25;
                                }
                                case 1537905337: {
                                    if (var1_1 != null) {
                                        ** continue;
                                    }
                                    break block14;
                                }
                                case 606315398: {
                                    ** continue;
                                }
lbl51:
                                // 1 sources

                                var3_5 = (var2_3 | var5_2) ^ -545200161;
                                continue block14;
                            }
                            break;
                        }
                        break;
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ -1763696903;
                ** GOTO lbl17
            }
lbl57:
            // 2 sources

            while (true) {
                var3_5 ^= -1277870276;
                return v0;
            }
        }
        var4_4 = (var2_3 | var5_2) ^ 1249696581;
        ** while (true)
        {
            case -358294322: {
                ** continue;
            }
            case -205307301: {
                v0 = true;
                ** continue;
            }
            ** case 794789863:
        }
lbl69:
        // 1 sources

        var3_5 ^= var4_4 ^ 302137140;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private int JB(class_2338 class_23382) {
        int n2 = c & 0xEBB61A2 ^ 0x7F77CD9E;
        int n3 = 0;
        int n4 = (n2 | 0xEBB61A2) ^ 0x9DAABB9A;
        n3 = (n2 | 0xEBB61A2) ^ 0x57A8CC48;
        block5: while (true) {
            switch (n3) {
                case 699811989: {
                    return (Integer)((class_310)jW.a).field_1687.method_8320(class_23382).method_11654((class_2769)class_4969.field_23153);
                }
                case -1222014124: {
                    n4 ^= n3 ^ 0x586B0A60;
                    n3 = (n2 | 0xEBB61A2) ^ 0x5649A52B;
                }
                default: {
                    continue block5;
                }
                case 676798966: 
            }
            n3 = (n2 | 0xEBB61A2) ^ 0xC8D666EA;
        }
    }
}

