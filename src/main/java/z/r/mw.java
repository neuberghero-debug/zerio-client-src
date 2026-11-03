/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.dA;
import z.r.gF;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class mw {
    private static final boolean a;
    private static final /* synthetic */ String a;
    private static final Set<String> a;
    private static final /* synthetic */ String b;
    private final List<gF> a;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    public static final int a;
    private static final int[] a;
    private static final mw a;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;

    /*
     * Unable to fully structure code
     */
    private mw() {
        block9: {
            var4_1 = 1786384217;
            var1_2 = mw.a & 1786384217 ^ -1425724522;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ 358030629;
            var2_4 ^= 639294650;
            break block9;
lbl7:
            // 1 sources

            return;
lbl9:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -1463509161;
                break;
            }
lbl12:
            // 2 sources

            block8: while (true) {
                block10: {
                    switch (var3_3) {
                        default: {
                            continue block8;
                        }
                        case 283236277: {
                            ** continue;
                        }
                        case 1136373896: {
                            this.a = new ArrayList<E>();
                            break;
                        }
                        case -1585460918: {
                            var2_4 ^= var3_3 ^ 771403379;
                            break block10;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1241573013;
                    continue;
                }
                var3_3 = (var1_2 | var4_1) ^ -73467798;
                continue;
                {
                    ** case -2070904501:
                }
lbl30:
                // 1 sources

                var2_4 ^= var3_3 ^ -1758418048;
                ** continue;
                break;
            }
        }
        super();
        var3_3 = (var1_2 | var4_1) ^ 1877978772;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static mw getInstance() {
        int n2 = a & 0x29B0651 ^ 0x5013A353;
        int n3 = 0;
        int n4 = (n2 | 0x29B0651) ^ 0xA44F2838;
        n3 = (n2 | 0x29B0651) ^ 0xAC3C8B3C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 82830572: {
                    n4 ^= n3 ^ 0xADA52274;
                    n3 = (n2 | 0x29B0651) ^ 0xDDEB3F1E;
                    continue block5;
                }
                case -22598545: {
                    n3 = (n2 | 0x29B0651) ^ 0x567443BF;
                    continue block5;
                }
                case -1888446387: 
            }
            break;
        }
        return a;
    }

    /*
     * Unable to fully structure code
     */
    public void init() {
        block13: {
            block12: {
                break block12;
lbl1:
                // 2 sources

                block7: while (true) {
                    switch (var3_3) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            default: {
                                continue block7;
                            }
                            break;
                        }
                        case 1236770180: {
                            this.wv();
                            break block7;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 168805176;
                            ** GOTO lbl-1000
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -699895589;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -2103460382: {
                            ** continue;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 492851389;
                            ** continue;
                            break;
                        }
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ 1622904643;
                ** GOTO lbl1
                {
                    case 750771675: {
                        return;
                    }
                }
            }
            var4_1 = 125234263;
            var1_2 = mw.a & 125234263 ^ -1610659574;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -1742570594;
            ** while (true)
            {
                case -12295652: {
                    var2_4 ^= var3_3 ^ 956127877;
                    break block13;
                }
                ** case -1779421593:
            }
lbl34:
            // 1 sources

            var2_4 ^= var3_3 ^ 1481977312;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ -1287638908;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void wv() {
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

    private static int ww(int n2, int n3) {
        int n4 = -2037104198;
        int n5 = 967898123;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x44EE780B)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xBFB486D9;
        n6 += (n5 | n4) ^ 0xBFB48C71;
        n6 ^= (n5 | n4) ^ 0xBFB4E683;
        n6 ^= (n5 | n4) ^ 0xBFB413E1;
        n6 ^= (n5 | n4) ^ 0xBFB42D2A;
        return n6 -= (n5 | n4) ^ 0xBFB4BF8D;
    }

    /*
     * Exception decompiling
     */
    public void register(gF var1_1) {
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
    public List<gF> getModules() {
        int n2 = a & 0xD3F45084 ^ 0xF7D8C66;
        int n3 = 0;
        int n4 = (n2 | 0xD3F45084) ^ 0x32F63E92;
        n3 = (n2 | 0xD3F45084) ^ 0x24868F78;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -75803746: {
                    n3 = (n2 | 0xD3F45084) ^ 0x9F5C76C;
                    continue block5;
                }
                case -704111734: {
                    n4 ^= n3 ^ 0x2CE7A128;
                    n3 = (n2 | 0xD3F45084) ^ 0xA0927095;
                    continue block5;
                }
                case 2138025075: 
            }
            break;
        }
        return this.a;
    }

    /*
     * Unable to fully structure code
     */
    public void forceDisableAll() {
        block48: {
            var7_1 = 1846911711;
            var4_2 = mw.a & 1846911711 ^ 1578035491;
            var6_3 = 0;
            var5_4 = (var4_2 | var7_1) ^ 2123534026;
            var6_3 = (var4_2 | var7_1) ^ 797184022;
            break block48;
lbl7:
            // 1 sources

            while (true) {
                var6_3 = (var4_2 | var7_1) ^ 588154203;
                break block48;
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var5_4 ^= var6_3 ^ 1624216303;
                var6_3 = (var4_2 | var7_1) ^ -492150093;
                break block48;
                break;
            }
lbl14:
            // 1 sources

            while (true) {
                block49: {
                    block51: {
                        block50: {
                            var1_5 = this.a.iterator();
lbl16:
                            // 3 sources

                            while (true) {
                                var6_3 = (var4_2 | var7_1) ^ 1141381959;
                                break block49;
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                var5_4 ^= var6_3 ^ 585980581;
                                var6_3 = (var4_2 | var7_1) ^ 1325923239;
                                break block49;
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                if (!var1_5.hasNext()) break block50;
                                var6_3 = (var4_2 | var7_1) ^ 1257501705;
                                break block49;
                                break;
                            }
lbl27:
                            // 1 sources

                            while (true) {
                                var5_4 ^= var6_3 ^ 1950523532;
                                var6_3 = (var4_2 | var7_1) ^ 660340303;
                                break block49;
                                break;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                block52: {
                                    var2_6 = (gF)var1_5.next();
                                    var6_3 = (var4_2 | var7_1) ^ -547838423;
                                    break block51;
lbl35:
                                    // 1 sources

                                    while (true) {
                                        var5_4 ^= var6_3 ^ -1895863790;
                                        var6_3 = (var4_2 | var7_1) ^ -1885029128;
                                        break block51;
                                        break;
                                    }
lbl39:
                                    // 1 sources

                                    while (true) {
                                        if (var2_6.isEnabled()) break block52;
                                        var6_3 = (var4_2 | var7_1) ^ 1734856586;
                                        break block51;
                                        break;
                                    }
lbl43:
                                    // 1 sources

                                    while (true) {
                                        var5_4 ^= var6_3 ^ 1855198934;
                                        var6_3 = (var4_2 | var7_1) ^ -1550360175;
                                        break block51;
                                        break;
                                    }
                                }
                                try {
                                    var6_3 = (var4_2 | var7_1) ^ 1804218028;
                                    break block51;
lbl51:
                                    // 1 sources

                                    while (true) {
                                        var5_4 ^= var6_3 ^ -913966371;
                                        var6_3 = (var4_2 | var7_1) ^ -1332154168;
                                        break block51;
                                        break;
                                    }
lbl55:
                                    // 1 sources

                                    while (true) {
                                        var2_6.onDisable();
                                        var5_4 ^= -409448823;
                                        break;
                                    }
                                }
                                catch (Throwable v0) {
                                    var5_4 = (var4_2 | var7_1) ^ 254292261;
                                    var3_7 = v0;
                                }
                                var6_3 = (var4_2 | var7_1) ^ -1654903904;
                                break block51;
lbl64:
                                // 1 sources

                                while (true) {
                                    var5_4 ^= var6_3 ^ 487732438;
                                    var6_3 = (var4_2 | var7_1) ^ -1127597048;
                                    break block51;
                                    break;
                                }
lbl68:
                                // 1 sources

                                while (true) {
                                    var2_6.setEnabled(false);
                                    var6_3 = (var4_2 | var7_1) ^ 1610981387;
                                    break block51;
                                    break;
                                }
lbl72:
                                // 1 sources

                                while (true) {
                                    var5_4 ^= var6_3 ^ -1406141223;
                                    var6_3 = (var4_2 | var7_1) ^ -513484165;
                                    break block51;
                                    break;
                                }
                                break;
                            }
                        }
                        var6_3 = (var4_2 | var7_1) ^ 1951390755;
                        break block49;
lbl79:
                        // 1 sources

                        while (true) {
                            var5_4 ^= var6_3 ^ 489009582;
                            var6_3 = (var4_2 | var7_1) ^ -1947726493;
                            break block49;
                            break;
                        }
lbl83:
                        // 1 sources

                        return;
                    }
                    block45: while (true) {
                        switch (var6_3) {
                            default: {
                                continue block45;
                            }
                            case -1589162538: {
                                ** continue;
                            }
                            case -239380729: {
                                ** continue;
                            }
                            case 427304053: {
                                ** continue;
                            }
                            case -578254226: {
                                ** GOTO lbl16
                            }
                            {
                                case 362136915: {
                                    ** continue;
                                }
                                case -830006473: {
                                    ** continue;
                                }
                            }
                            case -482099105: {
                                ** continue;
                            }
                            case -1026172937: {
                                ** continue;
                            }
                            case 505039860: {
                                ** continue;
                            }
                            ** case -1619316348:
lbl109:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
                }
                block46: while (true) {
                    switch (var6_3) {
                        default: {
                            continue block46;
                        }
                        case 974647480: {
                            ** continue;
                        }
                        case 823660632: {
                            ** continue;
                        }
                        case 887889910: {
                            ** continue;
                        }
                        case 1497634224: {
                            ** continue;
                        }
                        case 173029340: {
                            ** continue;
                        }
                        ** case -168302948:
lbl126:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
                break;
            }
        }
        block47: while (true) {
            switch (var6_3) {
                default: {
                    continue block47;
                }
                case 1369177065: {
                    ** continue;
                }
                case 1561423524: {
                    ** continue;
                }
                ** case -1665824436:
lbl137:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public List<gF> getModulesByCategory(dA dA2) {
        int n2 = a & 0x69F8C705 ^ 0x771D6570;
        int n3 = 0;
        int n4 = (n2 | 0x69F8C705) ^ 0x16384D0A;
        n3 = (n2 | 0x69F8C705) ^ 0xFB8E4AEB;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -2072793698: {
                    n3 = (n2 | 0x69F8C705) ^ 0x2E8635AA;
                    continue block5;
                }
                case -2146199644: {
                    n4 ^= 0x4C7C6951;
                    n4 ^= 0xCC027C30;
                    n4 ^= 0x36388D;
                    return this.a.stream().filter(arg_0 -> mw.wB(dA2, arg_0)).collect(Collectors.toList());
                }
                case 1367069407: 
            }
            n4 ^= n3 ^ 0xB0D5732C;
            n3 = (n2 | 0x69F8C705) ^ 0xFFEE70D1;
        }
    }

    /*
     * Unable to fully structure code
     */
    public List<gF> getGuiModulesByCategory(dA var1_1) {
        block10: {
            block12: {
                block9: {
                    block11: {
                        break block11;
lbl1:
                        // 1 sources

                        while (true) {
                            var3_4 ^= -27764656;
                            break block9;
                            break;
                        }
lbl4:
                        // 1 sources

                        return this.a.stream().filter((Predicate<gF>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, wA(z.r.dA z.r.gF ), (Lz/r/gF;)Z)((mw)this, (dA)var1_1)).collect(Collectors.toList());
                    }
                    var2_2 = mw.a & -1391320389 ^ -383212339;
                    var4_3 = 0;
                    break block12;
lbl10:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | -1391320389) ^ 396837146;
                        break block10;
                        break;
                    }
                }
                var3_4 ^= -530461221;
                ** GOTO lbl28
            }
            var3_4 = (var2_2 | -1391320389) ^ 1342616172;
            var4_3 = (var2_2 | -1391320389) ^ -856457964;
        }
lbl20:
        // 2 sources

        block8: while (true) {
            switch (var4_3) {
                default: {
                    continue block8;
                }
                case -90314779: {
                    ** continue;
                }
                case 566877163: {
                    break block8;
                }
lbl28:
                // 1 sources

                var3_4 ^= 610925065;
                ** continue;
                case 1433028154: {
                    var3_4 ^= var4_3 ^ -338538507;
                    ** continue;
                }
            }
            break;
        }
        var4_3 = (var2_2 | -1391320389) ^ -1202659131;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var2 = 647835805;
        mw.a = mK.a(MethodHandles.lookup().lookupClass(), 1388066820);
        var1_1 = 0;
        var0_2 = 644290874;
        var1_1 = var2 ^ 793751116;
        ** GOTO lbl101
        {
            block21: {
                mw.a = new int[((var0_2 ^= -329447597) | var2) ^ 1855928986];
                var0_2 ^= 958778734;
                v0 = "\u00b5#6\u00bd\u0005:\u00e9\u00b8\u001c7\u00dc\u00d9!\u00b6Rq\u00e9n\u00d2F\u00d3\u0093\u0014\u00ff\u007f\u00fa\u00b7\u009c".getBytes("ISO-8859-1");
                if (true) ** GOTO lbl47
lbl11:
                // 1 sources

                while (true) {
                    var1_1 = var2 ^ 1982412598;
                    break block21;
                    break;
                }
                while (true) {
                    var0_2 ^= -723127757;
                    v1 = ((var0_2 ^= -541470358) | var2) ^ -1457316810 ^ mw.a;
                    var0_2 ^= 2042282630;
                    mw.a[v2] = ((v0[v3] & 255) << 24 | ((v0[v3 + 1] & 255) << 16 | ((v0[v3 + 2] & 255) << 8 | v0[v3 + 3] & 255))) ^ v1;
                    v2 = v2 + 1;
                    v4 = v3 + 4;
                    v0 = v0;
                    v3 = v4;
                    var0_2 ^= 461048800;
                    if (v4 >= v0.length) {
                        mw.a = gj.decode("kEpNcADb8g9vIkrzeQ+3DxBgMCk75Z+WiPDpfYlTWAd+xw==", mw.ww(((var0_2 ^= -1581475166) | var2) ^ 231075949, var2 ^ ((var0_2 | var2) ^ 361272062)));
                        mw.d = gj.decode("SGr1dB1slFcjue2Yc+aRXmU=", mw.ww((var0_2 | var2) ^ 231075948, var2 ^ ((var0_2 | var2) ^ 116868972)));
                        mw.e = gj.decode("8GZqv01dbksTp/E=", mw.ww((var0_2 | var2) ^ 231075951, var2 ^ ((var0_2 | var2) ^ 1871279097)));
                        mw.c = gj.decode("JCOqeW4iC5d2CL6o4/8u", mw.ww((var0_2 | var2) ^ 231075950, var2 ^ ((var0_2 | var2) ^ -1448610552)));
                        mw.b = gj.decode("aSuRQw==", mw.ww((var0_2 | var2) ^ 231075945, var2 ^ ((var0_2 | var2) ^ -1906323846)));
                        mw.g = gj.decode("wMuyPYX4KxqCzlA=", mw.ww((var0_2 | var2) ^ 231075944, var2 ^ ((var0_2 | var2) ^ -137516747)));
                        mw.f = gj.decode("EuG8SosJM+q0", mw.ww((var0_2 | var2) ^ 231075947, var2 ^ ((var0_2 | var2) ^ -579613576)));
                        var1_1 = var2 ^ 1622591977;
                        break;
                    }
lbl47:
                    // 3 sources

                    block18: while (true) {
                        switch (var0_2) {
                            default: {
                                var0_2 ^= 950562547;
                                break block18;
                            }
                            case 1461897190: {
                                var0_2 ^= -679406853;
                                break block18;
                            }
                            case -55041145: {
                                var0_2 ^= -794117958;
                                continue block18;
                            }
                        }
                        break;
                    }
                    var0_2 ^= -683015373;
                    var0_2 ^= 1720154359;
                    var0_2 ^= 1165343476;
                    var0_2 ^= 1252276724;
                }
            }
            block19: while (true) {
                switch (var1_1) {
                    case 1177287028: {
                        var0_2 ^= var1_1 ^ -1637785897;
                        var1_1 = var2 ^ -342811442;
                        continue block19;
                    }
                    case 1967697897: {
                        mw.a = mw.wx();
                        return;
                    }
                    case 1653099185: {
                        var0_2 ^= var1_1 ^ -961192368;
                        ** continue;
                    }
                    case 164798161: {
                        var1_1 = var2 ^ 1142258220;
                        continue block19;
                    }
                    case 396187859: {
                        var0_2 ^= var1_1 ^ 2123567733;
                        var1_1 = var2 ^ 1297872920;
                        break;
                    }
                    case 1808189573: {
                        mw.a = Set.of(mw.e, mw.c, mw.b, mw.g, mw.f);
                        var1_1 = var2 ^ 13566839;
                        break;
                    }
                    case 1353975723: {
                        v2 = 0;
                        v3 = 0;
                        continue block15;
                    }
                    case 642921450: {
                        var0_2 ^= var1_1 ^ -976275322;
                        var1_1 = var2 ^ 1406508916;
                        break;
                    }
                    case -854840237: {
                        mw.a = new mw();
                        var1_1 = var2 ^ 822110286;
                    }
                }
lbl101:
                // 6 sources

            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public List<gF> searchModules(String var1_1) {
        block25: {
            block30: {
                block31: {
                    block27: {
                        block29: {
                            block28: {
                                block26: {
                                    break block31;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ 1360225531;
                                        break block25;
                                        break;
                                    }
lbl4:
                                    // 1 sources

                                    while (true) {
                                        var4_5 ^= var5_4 ^ -63025844;
                                        var5_4 = (var3_3 | var6_2) ^ -1718489140;
                                        break block25;
                                        break;
                                    }
lbl8:
                                    // 1 sources

                                    while (true) {
                                        var4_5 ^= -697316692;
                                        var4_5 ^= -825054012;
                                        break block26;
                                        break;
                                    }
lbl12:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ 394602717;
                                        break block25;
lbl15:
                                        // 1 sources

                                        while (true) {
                                            if (!var1_1.isEmpty()) break block27;
                                            break block28;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                return this.a.stream().filter((Predicate<gF>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, wz(java.lang.String z.r.gF ), (Lz/r/gF;)Z)((String)var2_6)).collect(Collectors.toList());
lbl20:
                                // 1 sources

                                while (true) {
                                    var4_5 ^= -1075197832;
                                    ** continue;
                                    break;
                                }
lbl23:
                                // 1 sources

                                while (true) {
                                    var2_6 = var1_1.toLowerCase();
                                    break block29;
                                    break;
                                }
                            }
lbl27:
                            // 2 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ 739091543;
                                break block25;
                                break;
                            }
                        }
                        var4_5 ^= 159770046;
                        ** while (true)
lbl33:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ -1819722608;
                            break block25;
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            var4_5 ^= var5_4 ^ 312866154;
                            ** GOTO lbl76
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ -2129114988;
                            break block25;
                            break;
                        }
lbl42:
                        // 1 sources

                        while (true) {
                            var4_5 ^= var5_4 ^ -94800448;
                            break block30;
                            break;
                        }
                    }
                    var5_4 = (var3_3 | var6_2) ^ 553170439;
                    break block25;
                }
                var6_2 = -373836680;
                var3_3 = mw.a & -373836680 ^ -1840400617;
                var5_4 = 0;
                var4_5 = (var3_3 | var6_2) ^ 499562863;
                ** while (true)
            }
            var5_4 = (var3_3 | var6_2) ^ 28237813;
        }
        block23: while (true) {
            switch (var5_4) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block23;
                    }
                    break;
                }
                case -620297864: {
                    ** continue;
                }
                case 2062024683: {
                    ** continue;
                }
                case 1651398835: {
                    ** continue;
                }
                case -327508062: {
                    ** continue;
                }
                case -1427319932: {
                    ** continue;
                }
                case -672001240: {
                    ** continue;
                }
                case 1752599535: {
                    ** continue;
                }
lbl76:
                // 1 sources

                var5_4 = (var3_3 | var6_2) ^ 1839745281;
                ** continue;
                case -1772618114: {
                    return this.a;
                }
                case -95328118: 
            }
            break;
        }
        ** while (var1_1 == null)
lbl82:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public List<gF> searchGuiModules(String var1_1) {
        block19: {
            block18: {
                var6_2 = -1462097691;
                var3_3 = mw.a & -1462097691 ^ -634643552;
                var5_4 = 0;
                if (true) ** GOTO lbl15
                block9: while (true) {
                    var5_4 = (var3_3 | var6_2) ^ -1931664845;
lbl7:
                    // 4 sources

                    block10: while (true) {
                        switch (var5_4) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                default: {
                                    continue block10;
                                }
                                break;
                            }
lbl12:
                            // 2 sources

                            while (true) {
                                var4_5 ^= -325686945;
                                ** GOTO lbl42
                                break;
                            }
lbl15:
                            // 1 sources

                            var4_5 = (var3_3 | var6_2) ^ 699322674;
                            break;
lbl17:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ -776166793;
                                ** GOTO lbl-1000
                                break;
                            }
lbl20:
                            // 1 sources

                            while (true) {
                                var4_5 ^= -908578851;
                                break block18;
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ 1916297159;
                                ** GOTO lbl-1000
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var4_5 ^= 1172721378;
                                ** GOTO lbl40
                                break;
                            }
                            case 762744841: {
                                continue block9;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ -1902348732;
                                ** continue;
                                break;
                            }
                            case 1982011862: {
                                var4_5 ^= var5_4 ^ -1671108957;
                                break block9;
                            }
                            case 1952599457: {
                                v0 = var1_1.toLowerCase();
                                ** GOTO lbl12
                            }
lbl40:
                            // 1 sources

                            var4_5 ^= -177585698;
                            ** continue;
lbl42:
                            // 1 sources

                            var2_6 = v0;
                            break;
                        }
                        break;
                    }
                    break;
                }
                var5_4 = (var3_3 | var6_2) ^ -19294692;
                ** GOTO lbl7
                {
                    case -2000264158: {
                        var4_5 ^= var5_4 ^ 1186734422;
                        ** continue;
                    }
                }
                var4_5 ^= -1949884424;
                break block19;
                {
                    case 69709305: {
                        if (var1_1 != null) break;
                        ** continue;
                    }
                }
                var5_4 = (var3_3 | var6_2) ^ -678908948;
                ** GOTO lbl7
                {
                    case 725784978: {
                        v0 = "";
                        ** continue;
                    }
                }
                var5_4 = (var3_3 | var6_2) ^ 1818518720;
                ** while (true)
            }
            return this.a.stream().filter((Predicate<gF>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isVisibleInClickGui(z.r.gF ), (Lz/r/gF;)Z)((mw)this)).filter((Predicate<gF>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, wy(java.lang.String z.r.gF ), (Lz/r/gF;)Z)((String)var2_6)).collect(Collectors.toList());
            {
                ** case -1768267995:
            }
lbl64:
            // 1 sources

            var4_5 ^= var5_4 ^ 1491081809;
            ** while (true)
        }
        var4_5 ^= -318780453;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public boolean isVisibleInClickGui(gF var1_1) {
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean wx() {
        var4 = 1096973093;
        var1_1 = mw.a & 1096973093 ^ -14430775;
        var3_2 = 0;
        var2_3 = (var1_1 | var4) ^ 720082519;
        var3_2 = (var1_1 | var4) ^ -1970481396;
        if (true) ** GOTO lbl9
        {
            block9: while (true) {
                var3_2 = (var1_1 | var4) ^ -91804499;
lbl9:
                // 2 sources

                block10: while (true) {
                    switch (var3_2) {
                        default: {
                            continue block10;
                        }
                        case 1978607841: {
                            continue block9;
                        }
                        case 98882368: {
                            var2_3 ^= var3_2 ^ -1770962294;
                            var3_2 = (var1_1 | var4) ^ 877834202;
                            continue block10;
                        }
                        case -885960649: {
                            Class.forName(mw.a, false, mw.class.getClassLoader());
                            var3_2 = (var1_1 | var4) ^ -914572250;
                            continue block10;
                        }
                        case 908018635: {
                            var2_3 ^= var3_2 ^ 240223005;
                            var3_2 = (var1_1 | var4) ^ -2023508294;
                            continue block10;
                        }
                        case 2013284695: 
                    }
                    break;
                }
                break;
            }
            var2_3 ^= -989573006;
            return true;
        }
    }

    /*
     * Exception decompiling
     */
    public gF getModuleByName(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH], 22[UNCONDITIONALDOLOOP]], but top level block is 5[SWITCH]
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
    public void onKeyPress(int var1_1) {
        var7_2 = -1885601001;
        var4_3 = mw.a & -1885601001 ^ -35904352;
        var6_4 = 0;
        var5_7 = (var4_3 | var7_2) ^ -1397296656;
        var6_4 = (var4_3 | var7_2) ^ -1422858389;
        ** GOTO lbl49
lbl-1000:
        // 4 sources

        {
            switch (var6_4) {
                case -256076316: {
                    var5_7 ^= var6_4 ^ -203676937;
                    var6_4 = (var4_3 | var7_2) ^ -1104962055;
                    continue block21;
                }
                case 1965206221: {
                    var5_7 ^= var6_4 ^ -977359419;
                    ** break;
                }
                case 1713718108: {
                    if (true) ** GOTO lbl41
                }
                case 1107278414: {
                    if (var3_6.getKeyBind() == var1_1) {
                        var6_4 = (var4_3 | var7_2) ^ 1702379840;
                        break;
                    }
                    ** GOTO lbl29
                }
                case -1700501769: {
                    var6_4 = (var4_3 | var7_2) ^ 202944890;
                    continue block21;
                }
lbl25:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ -1711708949;
                continue block21;
                case -205220147: {
                    var3_6.toggleManually();
lbl29:
                    // 2 sources

                    var6_4 = (var4_3 | var7_2) ^ -1963029126;
                }
            }
lbl30:
            // 4 sources

            ** while (true)
        }
        while (true) {
            var6_4 = (var4_3 | var7_2) ^ -1522788599;
            ** GOTO lbl55
            break;
        }
lbl34:
        // 1 sources

        while (true) {
            var6_4 = (var4_3 | var7_2) ^ -1823111562;
            ** GOTO lbl55
            break;
        }
        block25: while (true) {
            switch (var6_4) {
                case 1002888991: {
                    var2_5 = this.a.iterator();
lbl41:
                    // 2 sources

                    var6_4 = (var4_3 | var7_2) ^ 790124019;
                    if (true) ** GOTO lbl55
                }
                case -1496986481: {
                    var5_7 ^= var6_4 ^ -272407974;
                    break;
                }
                case 1424802012: {
                    ** break;
lbl48:
                    // 1 sources

                    var6_4 = (var4_3 | var7_2) ^ 1494870840;
                }
lbl49:
                // 3 sources

                default: {
                    continue block25;
                }
            }
            var6_4 = (var4_3 | var7_2) ^ -1004865368;
        }
        block26: while (true) {
            var6_4 = (var4_3 | var7_2) ^ 671698554;
lbl55:
            // 4 sources

            block27: while (true) {
                switch (var6_4) {
                    default: {
                        continue block27;
                    }
                    case 1820959169: {
                        var3_6 = (gF)var2_5.next();
                        var6_4 = (var4_3 | var7_2) ^ 257995347;
                        ** GOTO lbl30
                    }
                    case -673879603: {
                        return;
                    }
                    case -792432060: {
                        var5_7 ^= var6_4 ^ 1473981088;
                        var6_4 = (var4_3 | var7_2) ^ -1046610933;
                        continue block27;
                    }
                    case 1044503484: {
                        if (!var2_5.hasNext()) ** continue;
                        var6_4 = (var4_3 | var7_2) ^ 453854646;
                        continue block27;
                    }
                    case 1524641982: {
                        var5_7 ^= var6_4 ^ -309281657;
                        continue block26;
                    }
                    case -456039935: 
                }
                break;
            }
            break;
        }
        var5_7 ^= var6_4 ^ -801993986;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ boolean wy(String var0, gF var1_1) {
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
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
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
    private static /* synthetic */ boolean wz(String var0, gF var1_1) {
        block27: {
            block32: {
                block26: {
                    block28: {
                        block25: {
                            block29: {
                                break block29;
lbl1:
                                // 1 sources

                                return v0;
lbl3:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 1579113161;
                                    ** GOTO lbl25
                                    break;
                                }
lbl6:
                                // 1 sources

                                while (true) {
                                    block31: {
                                        block30: {
                                            var3_5 ^= 677851088;
                                            break block30;
lbl9:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ 254812973;
                                                ** GOTO lbl25
lbl12:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ -630657136;
                                                    ** GOTO lbl25
lbl15:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_5 ^= var4_4 ^ 1458244179;
                                                        break block25;
                                                        break;
                                                    }
lbl18:
                                                    // 1 sources

                                                    while (true) {
                                                        v0 = true;
                                                        break block26;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        if (!var1_1.getDescription().toLowerCase().contains(var0)) break block31;
lbl23:
                                        // 3 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ -174595051;
lbl25:
                                            // 11 sources

                                            block21: while (true) {
                                                switch (var4_4) {
                                                    default: {
                                                        continue block21;
                                                    }
                                                    case -834722413: {
                                                        break;
                                                    }
                                                    case -1246120770: {
                                                        ** continue;
                                                    }
                                                    case -134408585: {
                                                        ** continue;
                                                    }
                                                    case 1474567917: {
                                                        break block27;
                                                    }
                                                }
                                                var3_5 ^= 326508554;
                                                break block28;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    var4_4 = (var2_3 | var5_2) ^ -1033541693;
                                    ** GOTO lbl25
                                    break;
                                }
                            }
                            var5_2 = 1930744441;
                            var2_3 = mw.a & 1930744441 ^ 349983053;
                            var4_4 = 0;
                            break block32;
                            {
                                case 972483926: {
                                    var3_5 ^= var4_4 ^ -1302418806;
                                    ** continue;
                                }
                                case -1380696851: {
                                    if (var1_1.getName().toLowerCase().contains(var0)) ** GOTO lbl23
                                    ** continue;
                                }
                            }
                        }
                        var4_4 = (var2_3 | var5_2) ^ 190122107;
                        ** GOTO lbl25
lbl56:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1176242450;
                            ** GOTO lbl25
                            break;
                        }
lbl59:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 438140374;
                            ** GOTO lbl25
                            break;
                        }
                        {
                            case 2089409286: {
                                v0 = false;
                                break block26;
                            }
                            case 1841409707: {
                                var3_5 ^= var4_4 ^ 1168540027;
                                ** continue;
                            }
                            case -2108999832: {
                                var3_5 ^= var4_4 ^ 1629063557;
                                break;
                            }
                        }
                    }
                    if (!var1_1.getDisplayName().toLowerCase().contains(var0)) ** break;
                    ** while (true)
                    ** while (true)
                }
                var3_5 ^= -1336507051;
                ** while (true)
            }
            var3_5 = (var2_3 | var5_2) ^ 1366455881;
            var4_4 = (var2_3 | var5_2) ^ 540593552;
            ** GOTO lbl25
            {
                case 2028793936: {
                    var3_5 ^= var4_4 ^ 1805307994;
                    ** continue;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ -2145270518;
            ** GOTO lbl25
            {
                ** case 700680628:
            }
lbl88:
            // 1 sources

            ** while (true)
        }
        var4_4 = (var2_3 | var5_2) ^ 1311391275;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ boolean wA(dA var1_1, gF var2_2) {
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
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
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
    private static /* synthetic */ boolean wB(dA var0, gF var1_1) {
        block22: {
            block21: {
                block25: {
                    block23: {
                        block26: {
                            block24: {
                                break block26;
lbl1:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 347673101;
                                    break block21;
                                    break;
                                }
lbl4:
                                // 2 sources

                                while (true) {
                                    var3_5 ^= -693714550;
                                    break block22;
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    if (var1_1.getCategory() != var0) break block23;
                                    break block24;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var3_5 ^= var4_4 ^ -1635788735;
                                    ** continue;
                                    break;
                                }
                            }
                            var4_4 = (var2_3 | var5_2) ^ -66236717;
                            break block21;
lbl16:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -1608168732;
                                break block21;
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                v0 = false;
                                ** GOTO lbl4
                                break;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_4 ^ 273104012;
                                break block25;
                                break;
                            }
                        }
                        var5_2 = 635833617;
                        var2_3 = mw.a & 635833617 ^ 1883283772;
                        var4_4 = 0;
                        var3_5 = (var2_3 | var5_2) ^ -1618061408;
                        ** while (true)
lbl31:
                        // 1 sources

                        while (true) {
                            v0 = true;
                            ** continue;
                            break;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 31902789;
                            break block21;
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 210929886;
                            break block21;
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ -389640399;
                            ** continue;
                            break;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ -1967908445;
                    break block21;
                }
                var4_4 = (var2_3 | var5_2) ^ -2042436637;
            }
            block20: while (true) {
                switch (var4_4) {
                    default: {
                        continue block20;
                    }
                    case -207335714: {
                        ** continue;
                    }
                    case -11357026: {
                        ** continue;
                    }
                    case 1633664816: {
                        ** continue;
                    }
                    case 1946182008: {
                        ** continue;
                    }
                    case -708581415: {
                        ** continue;
                    }
                    case 2037655011: {
                        ** continue;
                    }
                    ** case -1981029394:
lbl66:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        return v0;
    }
}

