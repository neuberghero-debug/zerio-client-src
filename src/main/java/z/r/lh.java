/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.W;
import z.r.ap;
import z.r.fu;
import z.r.gj;
import z.r.hT;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class lh
extends hT {
    private boolean a;
    public static final int a;
    private static final int[] a;
    private final Consumer<Integer> a;
    private final Supplier<Integer> a;
    private static final /* synthetic */ String a;

    /*
     * Exception decompiling
     */
    public lh(Supplier<Integer> var1_1, Consumer<Integer> var2_2) {
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
    public boolean isListening() {
        block9: {
            break block9;
lbl1:
            // 1 sources

            while (true) {
                var3_2 = (var1_1 | 1084109581) ^ -78961440;
                ** GOTO lbl11
                break;
            }
        }
        var1_1 = lh.a & 1084109581 ^ 1723633079;
        var3_2 = 0;
        var2_3 = (var1_1 | 1084109581) ^ -459356312;
        ** GOTO lbl18
lbl9:
        // 1 sources

        while (true) {
            var3_2 = (var1_1 | 1084109581) ^ -1345262495;
lbl11:
            // 2 sources

            block7: while (true) {
                switch (var3_2) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block7;
                        }
                        break;
                    }
                    case -1720282507: {
                        ** continue;
                    }
lbl18:
                    // 1 sources

                    var3_2 = (var1_1 | 1084109581) ^ -3658294;
                    ** continue;
                    case -915516450: {
                        return this.a;
                    }
                    case -1644848289: 
                }
                break;
            }
            break;
        }
        var2_3 ^= var3_2 ^ 996069851;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block31: {
            break block31;
            {
                var7_1 = var8 ^ 848646693;
                while (true) {
                    switch (var7_1) {
                        case 901106188: {
                            var6_5 ^= var7_1 ^ 87432167;
                            ** break;
                        }
                        case -44640345: {
                            var6_5 ^= var7_1 ^ 383527763;
                            ** GOTO lbl12
                        }
lbl10:
                        // 1 sources

                        var7_1 = var8 ^ 1089062364;
                        break;
lbl12:
                        // 1 sources

                        var7_1 = var8 ^ -872850926;
                        break;
                        case -858144197: {
                            lh.a = new int[var1_3];
                            continue block19;
                        }
                        case 1204379125: {
                            var3_6 = 0;
                            var6_5 ^= 56471835;
                            var4_7 = 0;
                            ** GOTO lbl57
                        }
                    }
lbl22:
                    // 4 sources

                }
            }
lbl23:
            // 1 sources

            while (true) {
                var7_1 = var8 ^ -92909682;
                ** GOTO lbl22
                break;
            }
lbl26:
            // 1 sources

            while (true) {
                var7_1 = var8 ^ 1360361571;
                ** GOTO lbl37
                break;
            }
lbl29:
            // 1 sources

            while (true) {
                var1_3 = var0_2.length / 4;
                ** continue;
                break;
            }
lbl32:
            // 1 sources

            while (true) {
                var7_1 = var8 ^ -1993028699;
                if (true) ** GOTO lbl37
                break;
            }
            block26: while (true) {
                var7_1 = var8 ^ -879560366;
lbl37:
                // 3 sources

                block27: while (true) {
                    switch (var7_1) {
                        default: {
                            continue block27;
                        }
                        case -860724869: {
                            lh.a = gj.decode("ng8fXbpNeL4eeBRqpug=", lh.AO((var6_5 | var7_1 ^ -879560366) ^ (var7_1 ^ 1616120472), var7_1 ^ -879560366 ^ ((var6_5 | var7_1 ^ -879560366) ^ (var7_1 ^ -1304289332))));
                            return;
                        }
                        case 1446371402: {
                            var6_5 ^= var7_1 ^ -884355932;
                            ** continue;
                        }
                        case 1636801240: {
                            var3_6 += 4;
                            if (++var4_7 >= var1_3) {
                                var7_1 = var8 ^ -915804101;
                                continue block27;
                            }
                            ** GOTO lbl57
                        }
                        case -1911270516: {
                            lh.a[var4_7] = var5_8 ^= var2_4;
                            var7_1 = var8 ^ 675881789;
                            continue block27;
                        }
lbl57:
                        // 2 sources

                        var5_8 = (var0_2[var3_6] & (((var6_5 ^= 327282212) | var8) ^ 792255366)) << ((var6_5 | var8) ^ 792255329) | (var0_2[var3_6 + 1] & ((var6_5 | var8) ^ 792255366)) << ((var6_5 | var8) ^ 792255337) | (var0_2[var3_6 + 2] & ((var6_5 | var8) ^ 792255366)) << ((var6_5 | var8) ^ 792255345) | var0_2[var3_6 + 3] & ((var6_5 | var8) ^ 792255366);
                        ** continue;
                        case -834050030: {
                            var6_5 ^= var7_1 ^ 218350296;
                            continue block26;
                        }
                        case 795458324: 
                    }
                    var6_5 ^= var7_1 ^ -1584104994;
                    var7_1 = var8 ^ 1722745585;
                }
                break;
            }
lbl66:
            // 1 sources

            while (true) {
                var6_5 ^= 68260030;
                var0_2 = "\u0007\u008e\u00e7\u00c5@G\u00e1\u008b\u00dcgKH\u00b7-\u00e1\u0017 G-\u00b3j\u00f5\u00ef\u008b\u00fcb\u0000\u00dc\u00c7\u0000\u0096\u0096\u0004\u008bsj;w\u001b[".getBytes("ISO-8859-1");
                var6_5 ^= -112893910;
                ** continue;
                break;
            }
        }
        var8 = 119576617;
        lh.a = mK.a(MethodHandles.lookup().lookupClass(), -1246080421);
        var7_1 = 0;
        var6_5 = 2113384607;
        var7_1 = var8 ^ 591866444;
        block29: while (true) {
            switch (var7_1) {
                default: {
                    continue block29;
                }
                case 610775653: {
                    var7_1 = var8 ^ -872653857;
                    continue block29;
                }
                case -857947146: {
                    var6_5 ^= var7_1 ^ -1450003796;
                    var7_1 = var8 ^ -1981120237;
                    continue block29;
                }
                case -1899357894: 
            }
            break;
        }
        var2_4 = (var6_5 | var7_1 ^ -1981120237) ^ (var7_1 ^ 1739385244) ^ lh.a;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void cancel() {
        block30: {
            block31: {
                block32: {
                    break block32;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1335112738;
                        break block30;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var4_1 = -97896717;
                var1_2 = lh.a & -97896717 ^ -493687504;
                var3_3 = 0;
                var2_4 = (var1_2 | var4_1) ^ -36276586;
                ** while (true)
lbl12:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1131451689;
                    break block30;
lbl15:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 2133783136;
                        break block31;
                        break;
                    }
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1438725;
                    break block30;
lbl21:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 922694569;
                        break block30;
                        break;
                    }
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1972764747;
                    break block30;
lbl27:
                    // 1 sources

                    return;
lbl29:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -1007674291;
                        break block31;
                        break;
                    }
                    break;
                }
lbl32:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1354569942;
                    break block30;
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -1997978969;
            break block30;
lbl38:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1848013440;
                break block30;
                break;
            }
lbl41:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ 176967339;
                ** continue;
                break;
            }
lbl44:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ 231951902;
                ** GOTO lbl70
                break;
            }
            this.a = false;
            var3_3 = (var1_2 | var4_1) ^ 420875054;
        }
        block29: while (true) {
            switch (var3_3) {
                default: {
                    continue block29;
                }
                case -1801679501: {
                    ** continue;
                }
                case -1177916710: {
                    ** continue;
                }
                case -867840934: {
                    ** continue;
                }
                case -89191434: {
                    ** continue;
                }
                case 1442322649: {
                    break;
                }
                case 1918090580: {
                    ** continue;
                }
                case -475204387: {
                    ** continue;
                }
                case -1892876360: {
                    ** continue;
                }
            }
lbl70:
            // 2 sources

            var3_3 = (var1_2 | var4_1) ^ -426437385;
        }
        {
            case 472902404: {
                switch (var2_4) {
                    case 124553573: {
                        ** continue;
                    }
                    case 294023033: {
                        ** continue;
                    }
                    ** default:
lbl79:
                    // 1 sources

                    ** continue;
                }
            }
            ** case -1255224367:
        }
lbl81:
        // 1 sources

        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void draw(W var1_1) {
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
    @Override
    public boolean mouseDown(W var1_1, double var2_2, double var4_3, int var6_4) {
        block71: {
            block68: {
                block78: {
                    block81: {
                        block75: {
                            block77: {
                                block80: {
                                    block70: {
                                        block72: {
                                            block73: {
                                                block76: {
                                                    block69: {
                                                        block66: {
                                                            block79: {
                                                                block65: {
                                                                    block74: {
                                                                        block67: {
                                                                            break block79;
lbl1:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var9_7 = (var7_6 | var10_5) ^ 1197351698;
                                                                                break block65;
lbl4:
                                                                                // 1 sources

                                                                                return true;
lbl6:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    fu.play(ap.n, 1.4f);
                                                                                    break block66;
                                                                                    break;
                                                                                }
lbl9:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
                                                                                while (true) {
                                                                                    var9_7 = (var7_6 | var10_5) ^ -1553479945;
                                                                                    break block65;
                                                                                    break;
                                                                                }
lbl14:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (this.a) break block67;
                                                                                    break block68;
                                                                                    break;
                                                                                }
lbl17:
                                                                                // 1 sources

                                                                                while (var6_4 == 0) {
                                                                                    break block69;
                                                                                }
                                                                                ** GOTO lbl81
lbl20:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    v0 = false;
                                                                                    break block70;
                                                                                    break;
                                                                                }
lbl23:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var9_7 = (var7_6 | var10_5) ^ -1364741038;
                                                                                    break block65;
lbl26:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (var6_4 != 0) ** continue;
                                                                                        break block71;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
lbl29:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var9_7 = (var7_6 | var10_5) ^ -200415306;
                                                                                break block65;
lbl32:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var9_7 = (var7_6 | var10_5) ^ 1706253465;
                                                                                    break block65;
lbl35:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var8_8 ^= var9_7 ^ -966329825;
                                                                                        break block72;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
lbl38:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var9_7 = (var7_6 | var10_5) ^ 1038656552;
                                                                                    break block65;
lbl41:
                                                                                    // 1 sources

                                                                                    while (this.g) {
                                                                                        break block73;
                                                                                    }
                                                                                    ** GOTO lbl81
lbl44:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var8_8 ^= var9_7 ^ 1120774569;
                                                                                        break block74;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                        var8_8 ^= -1206028856;
                                                                        ** while (true)
lbl50:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var9_7 = (var7_6 | var10_5) ^ 859562926;
                                                                            break block65;
                                                                            break;
                                                                        }
                                                                    }
                                                                    var9_7 = (var7_6 | var10_5) ^ 873785840;
                                                                }
lbl56:
                                                                // 18 sources

                                                                block52: while (true) {
                                                                    switch (var9_7) lbl-1000:
                                                                    // 7 sources

                                                                    {
                                                                        default: {
                                                                            continue block52;
                                                                        }
                                                                        case 121705332: {
                                                                            ** continue;
                                                                        }
                                                                        case 826645226: {
                                                                            ** continue;
                                                                        }
                                                                        case -65601378: {
                                                                            ** continue;
                                                                        }
                                                                        case -1121210768: {
                                                                            ** continue;
                                                                        }
                                                                        case 672717793: {
                                                                            ** GOTO lbl17
                                                                        }
                                                                        case 1836058060: {
                                                                            ** continue;
                                                                        }
                                                                        case 836860122: {
                                                                            ** continue;
                                                                        }
                                                                        case 218305642: {
                                                                            ** GOTO lbl41
                                                                        }
                                                                        case -982683141: {
                                                                            ** continue;
                                                                        }
lbl78:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var9_7 = (var7_6 | var10_5) ^ 1589681567;
                                                                            ** GOTO lbl-1000
                                                                            break;
                                                                        }
lbl81:
                                                                        // 3 sources

                                                                        while (true) {
                                                                            var9_7 = (var7_6 | var10_5) ^ -1284061181;
                                                                            ** GOTO lbl-1000
                                                                            break;
                                                                        }
                                                                        case -2146479340: {
                                                                            var8_8 ^= var9_7 ^ -1813545925;
                                                                            break block75;
                                                                        }
                                                                        case -2020627980: {
                                                                            fu.play(ap.D);
                                                                            ** continue;
                                                                        }
lbl90:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var9_7 = (var7_6 | var10_5) ^ 1328387479;
                                                                            ** GOTO lbl-1000
                                                                            break;
                                                                        }
                                                                        case 1274224080: {
                                                                            return true;
                                                                        }
                                                                        case -1140642979: {
                                                                            this.a.accept(var6_4);
                                                                            break block76;
                                                                        }
                                                                        case 685450343: {
                                                                            var8_8 ^= var9_7 ^ -398821777;
                                                                            break block77;
                                                                        }
lbl101:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var9_7 = (var7_6 | var10_5) ^ 460045364;
                                                                            ** GOTO lbl-1000
                                                                            break;
                                                                        }
                                                                        case -658764374: {
                                                                            var8_8 ^= var9_7 ^ -2041014558;
                                                                            break;
                                                                        }
                                                                        case 1108299784: {
                                                                            if (!this.a) break;
                                                                            break;
                                                                        }
                                                                        case -378899611: {
                                                                            var8_8 ^= var9_7 ^ 841080090;
                                                                            var9_7 = (var7_6 | var10_5) ^ 338729328;
                                                                            ** GOTO lbl-1000
                                                                        }
                                                                        case -1804647854: {
                                                                            fu.play(ap.k);
                                                                            break block66;
                                                                        }
                                                                    }
                                                                    var9_7 = (var7_6 | var10_5) ^ -370636142;
                                                                    continue;
                                                                    {
                                                                        case 1159748182: {
                                                                            var8_8 ^= var9_7 ^ 957633408;
                                                                            var9_7 = (var7_6 | var10_5) ^ 1901767308;
                                                                            ** GOTO lbl-1000
                                                                        }
                                                                    }
lbl123:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var9_7 = (var7_6 | var10_5) ^ -904359259;
                                                                        continue block52;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl126:
                                                                // 1 sources

                                                                while (true) {
                                                                    var9_7 = (var7_6 | var10_5) ^ 869545798;
                                                                    ** GOTO lbl56
                                                                    break;
                                                                }
                                                                {
                                                                    case 1646993544: {
                                                                        this.a = false;
                                                                        ** continue;
                                                                    }
                                                                    case 1747333018: {
                                                                        var8_8 ^= var9_7 ^ 2047144105;
                                                                        ** continue;
                                                                    }
                                                                }
                                                            }
                                                            var10_5 = 1712044416;
                                                            var7_6 = lh.a & 1712044416 ^ 1913794808;
                                                            var9_7 = 0;
                                                            break block80;
                                                        }
                                                        var9_7 = (var7_6 | var10_5) ^ -248560765;
                                                        ** GOTO lbl56
                                                        {
                                                            case -2112463282: {
                                                                if (!this.contains(var2_2, var4_3)) ** continue;
                                                                ** continue;
                                                            }
                                                            case -1611451542: {
                                                                var8_8 ^= var9_7 ^ 624265253;
                                                                ** continue;
                                                            }
                                                        }
                                                        var9_7 = (var7_6 | var10_5) ^ -495649878;
                                                        ** GOTO lbl56
                                                    }
                                                    var9_7 = (var7_6 | var10_5) ^ -739509114;
                                                    ** GOTO lbl56
                                                    {
                                                        case 1053883987: {
                                                            return false;
                                                        }
                                                        case -713261297: {
                                                            var8_8 ^= var9_7 ^ 791368947;
                                                            ** continue;
                                                        }
                                                    }
lbl159:
                                                    // 1 sources

                                                    while (true) {
                                                        var9_7 = (var7_6 | var10_5) ^ -241954804;
                                                        ** GOTO lbl56
                                                        break;
                                                    }
                                                }
                                                var9_7 = (var7_6 | var10_5) ^ -1619932515;
                                                ** GOTO lbl56
                                            }
                                            var9_7 = (var7_6 | var10_5) ^ 507352674;
                                            ** GOTO lbl56
                                            this.a = false;
                                            var9_7 = (var7_6 | var10_5) ^ 196850895;
                                            ** GOTO lbl56
                                            {
                                                case 329835873: {
                                                    break block81;
                                                }
                                                case 2107641143: {
                                                    var8_8 ^= var9_7 ^ -169897671;
                                                    ** continue;
                                                }
                                            }
                                        }
                                        var9_7 = (var7_6 | var10_5) ^ -1978877594;
                                        ** GOTO lbl56
lbl179:
                                        // 1 sources

                                        while (true) {
                                            var9_7 = (var7_6 | var10_5) ^ 2065214866;
                                            ** GOTO lbl56
                                            break;
                                        }
                                        {
                                            case -1510980226: {
                                                ** continue;
                                            }
                                        }
                                    }
lbl185:
                                    // 2 sources

                                    while (true) {
                                        var8_8 ^= -1974580293;
                                        break block78;
                                        break;
                                    }
                                }
                                var8_8 = (var7_6 | var10_5) ^ 1070554333;
                                var9_7 = (var7_6 | var10_5) ^ -170294630;
                                ** GOTO lbl56
                            }
                            var9_7 = (var7_6 | var10_5) ^ -886040696;
                            ** GOTO lbl56
lbl195:
                            // 1 sources

                            while (true) {
                                v0 = true;
                                ** continue;
                                break;
                            }
                        }
                        var9_7 = (var7_6 | var10_5) ^ 1221281707;
                        ** GOTO lbl56
                    }
                    var9_7 = (var7_6 | var10_5) ^ 1577280025;
                    ** GOTO lbl56
                    {
                        case 1171230398: {
                            var8_8 ^= var9_7 ^ -736464239;
                            ** continue;
                        }
                    }
lbl207:
                    // 1 sources

                    while (true) {
                        var9_7 = (var7_6 | var10_5) ^ -1110217479;
                        ** GOTO lbl56
                        break;
                    }
                }
                this.a = v0;
                ** while (true)
                {
                    case -2026571141: {
                        var8_8 ^= var9_7 ^ -142310260;
                        ** continue;
                    }
                    case -876030719: {
                        var8_8 ^= var9_7 ^ 1061923709;
                        ** continue;
                    }
                    case -2084422814: {
                        ** continue;
                    }
                }
                var9_7 = (var7_6 | var10_5) ^ -166401300;
                ** GOTO lbl56
                {
                    ** case 959851631:
                }
lbl224:
                // 1 sources

                this.requestFocus(var1_1);
                ** while (true)
            }
            var8_8 ^= -1206028856;
            ** while (true)
        }
        var9_7 = (var7_6 | var10_5) ^ 1207615778;
        ** while (true)
    }

    private static int AO(int n2, int n3) {
        int n4 = -807245292;
        int n5 = 2005125486;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xACF61F2B)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xFFE3F505;
        n6 -= (n5 | n4) ^ 0xFFE3F993;
        n6 += (n5 | n4) ^ 0xFFE32219;
        n6 ^= (n5 | n4) ^ 0xFFE352D7;
        n6 -= (n5 | n4) ^ 0xFFE31377;
        n6 -= (n5 | n4) ^ 0xFFE33C93;
        n6 ^= (n5 | n4) ^ 0xFFE33B61;
        n6 -= (n5 | n4) ^ 0xFFE35232;
        n6 -= (n5 | n4) ^ 0xFFE3AFFD;
        return n6 += (n5 | n4) ^ 0xFFE3B309;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean isFocusable() {
        int n2 = a & 0x6B8D8E0C ^ 0x4CDC861C;
        int n3 = 0;
        int n4 = (n2 | 0x6B8D8E0C) ^ 0x381F52EF;
        n3 = (n2 | 0x6B8D8E0C) ^ 0x8B7798AD;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1520395731: {
                    return true;
                }
                case 730313277: {
                    n4 ^= n3 ^ 0x2AA8AEEC;
                    n3 = (n2 | 0x6B8D8E0C) ^ 0x3542EBCF;
                    continue block5;
                }
                case -458615119: 
            }
            n3 = (n2 | 0x6B8D8E0C) ^ 0x445A3C21;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean key(W var1_1, int var2_2, int var3_3) {
        block102: {
            block105: {
                block106: {
                    block110: {
                        block107: {
                            block101: {
                                block109: {
                                    block98: {
                                        block100: {
                                            block95: {
                                                block108: {
                                                    block104: {
                                                        block99: {
                                                            block103: {
                                                                block97: {
                                                                    block96: {
                                                                        block94: {
                                                                            break block108;
lbl1:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var5_7 ^= var6_6 ^ -368101609;
                                                                                break block94;
                                                                                break;
                                                                            }
lbl4:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var6_6 = (var4_5 | var7_4) ^ -993079160;
                                                                                break block95;
lbl7:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var6_6 = (var4_5 | var7_4) ^ 900010876;
                                                                                    break block95;
                                                                                    break;
                                                                                }
lbl10:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var6_6 = (var4_5 | var7_4) ^ -1772953934;
                                                                                    break block95;
                                                                                    break;
                                                                                }
lbl13:
                                                                                // 1 sources

                                                                                while (var2_2 == lh.AO((var5_7 | var6_6 ^ -704196552) ^ (var6_6 ^ -2095512088), (var4_5 | var6_6 ^ -704196552) ^ ((var5_7 | var6_6 ^ -704196552) ^ (var6_6 ^ 383049333)))) {
                                                                                    break block96;
lbl15:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl17:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl19:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var6_6 = (var4_5 | var7_4) ^ -25013609;
                                                                                        break block95;
lbl22:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            continue;
                                                                                            break;
                                                                                        }
lbl24:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            if (var2_2 != lh.AO((var5_7 | var6_6 ^ -330673625) ^ (var6_6 ^ -1080588469), (var4_5 | var6_6 ^ -330673625) ^ ((var5_7 | var6_6 ^ -330673625) ^ (var6_6 ^ 1143262550)))) break block97;
                                                                                            break block98;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    }
lbl27:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var6_6 = (var4_5 | var7_4) ^ 1320059778;
                                                                                        break block95;
                                                                                        break;
                                                                                    }
lbl30:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var5_7 ^= var6_6 ^ -1343553010;
                                                                                        break block99;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break block100;
                                                                                break;
                                                                            }
lbl34:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var6_6 = (var4_5 | var7_4) ^ -1283330625;
                                                                                break block95;
lbl37:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var6_6 = (var4_5 | var7_4) ^ -673323794;
                                                                                    break block95;
                                                                                    break;
                                                                                }
lbl40:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var6_6 = (var4_5 | var7_4) ^ -1448106878;
                                                                                    break block95;
lbl43:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (var2_2 == lh.AO((var5_7 | var6_6 ^ 183995102) ^ (var6_6 ^ 1609064200), (var4_5 | var6_6 ^ 183995102) ^ ((var5_7 | var6_6 ^ 183995102) ^ (var6_6 ^ 402491222)))) break block96;
                                                                                        ** continue;
                                                                                        break;
                                                                                    }
                                                                                    while (true) {
                                                                                        var6_6 = (var4_5 | var7_4) ^ 1747365494;
                                                                                        break block95;
                                                                                        break;
                                                                                    }
lbl49:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (this.a) ** continue;
                                                                                        ** continue;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                            this.a = false;
                                                                            var6_6 = (var4_5 | var7_4) ^ 1746374602;
                                                                            break block95;
                                                                            this.a = false;
                                                                            var6_6 = (var4_5 | var7_4) ^ -1958010386;
                                                                            break block95;
lbl58:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var6_6 = (var4_5 | var7_4) ^ -1706565010;
                                                                                break block95;
                                                                                break;
                                                                            }
lbl61:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var6_6 = (var4_5 | var7_4) ^ 2065011949;
                                                                                break block95;
lbl64:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var5_7 ^= var6_6 ^ -109815951;
                                                                                    break block101;
                                                                                    break;
                                                                                }
lbl67:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var6_6 = (var4_5 | var7_4) ^ 617470327;
                                                                                    break block95;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                        var6_6 = (var4_5 | var7_4) ^ -509272044;
                                                                        break block95;
                                                                    }
                                                                    while (true) {
                                                                        var6_6 = (var4_5 | var7_4) ^ -117961753;
                                                                        break block95;
                                                                        break;
                                                                    }
lbl77:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var6_6 = (var4_5 | var7_4) ^ -1006728882;
                                                                        break block95;
                                                                        break;
                                                                    }
lbl80:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var6_6 = (var4_5 | var7_4) ^ 805720449;
                                                                        break block95;
                                                                        break;
                                                                    }
lbl83:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var6_6 = (var4_5 | var7_4) ^ -2127032784;
                                                                        break block95;
                                                                        break;
                                                                    }
lbl86:
                                                                    // 1 sources

                                                                    while (var2_2 != lh.AO((var5_7 | var6_6 ^ -988421026) ^ (var6_6 ^ -1765265091), (var4_5 | var6_6 ^ -988421026) ^ ((var5_7 | var6_6 ^ -988421026) ^ (var6_6 ^ -1359962402)))) {
                                                                        ** continue;
lbl88:
                                                                        // 1 sources

                                                                        ** GOTO lbl77
                                                                    }
                                                                    break block98;
lbl90:
                                                                    // 1 sources

                                                                    return false;
lbl92:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        fu.play(ap.C);
                                                                        break block102;
                                                                        break;
                                                                    }
lbl95:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        this.a.accept(var2_2);
                                                                        ** continue;
                                                                        break;
                                                                    }
lbl98:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        fu.play(ap.k);
                                                                        break block102;
                                                                        break;
                                                                    }
lbl101:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var6_6 = (var4_5 | var7_4) ^ 1002936274;
                                                                        break block95;
lbl104:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var5_7 ^= var6_6 ^ 1532141728;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    this.a = true;
                                                                    var6_6 = (var4_5 | var7_4) ^ 963142062;
                                                                    break block95;
lbl110:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var6_6 = (var4_5 | var7_4) ^ -1018632516;
                                                                        break block95;
                                                                        break;
                                                                    }
lbl113:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var5_7 ^= var6_6 ^ 1998312000;
                                                                        ** continue;
                                                                        break;
                                                                    }
lbl116:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var6_6 = (var4_5 | var7_4) ^ -64439249;
                                                                        break block95;
lbl119:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var5_7 ^= var6_6 ^ -410873198;
                                                                            break block103;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                var6_6 = (var4_5 | var7_4) ^ -80644577;
                                                                break block95;
                                                            }
                                                            var6_6 = (var4_5 | var7_4) ^ -361058444;
                                                            break block95;
lbl128:
                                                            // 1 sources

                                                            while (true) {
                                                                if (var2_2 == lh.AO((var5_7 | var6_6 ^ 1776129117) ^ (var6_6 ^ 1019363724), (var4_5 | var6_6 ^ 1776129117) ^ ((var5_7 | var6_6 ^ 1776129117) ^ (var6_6 ^ -474131004)))) ** continue;
                                                                break block104;
                                                                break;
                                                            }
                                                        }
                                                        var6_6 = (var4_5 | var7_4) ^ 913442220;
                                                        break block95;
lbl134:
                                                        // 1 sources

                                                        while (true) {
                                                            var6_6 = (var4_5 | var7_4) ^ 458597715;
                                                            break block95;
lbl137:
                                                            // 1 sources

                                                            while (var2_2 == lh.AO((var5_7 | var6_6 ^ 1111501578) ^ (var6_6 ^ 64872313), (var4_5 | var6_6 ^ 1111501578) ^ ((var5_7 | var6_6 ^ 1111501578) ^ (var6_6 ^ 8906451)))) {
                                                                ** continue;
lbl139:
                                                                // 1 sources

                                                                ** GOTO lbl80
                                                            }
                                                            break block105;
lbl141:
                                                            // 1 sources

                                                            while (true) {
                                                                var6_6 = (var4_5 | var7_4) ^ 1652590609;
                                                                break block95;
                                                                break;
                                                            }
                                                            break;
                                                        }
lbl144:
                                                        // 1 sources

                                                        while (true) {
                                                            var6_6 = (var4_5 | var7_4) ^ -530773359;
                                                            break block95;
lbl147:
                                                            // 1 sources

                                                            while (true) {
                                                                var5_7 ^= var6_6 ^ -527057514;
                                                                ** GOTO lbl234
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    var6_6 = (var4_5 | var7_4) ^ -1485348503;
                                                    break block95;
lbl153:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_6 = (var4_5 | var7_4) ^ -1597431038;
                                                        break block95;
lbl156:
                                                        // 1 sources

                                                        return true;
                                                    }
                                                }
                                                var7_4 = -382349754;
                                                var4_5 = lh.a & -382349754 ^ 1524204726;
                                                var6_6 = 0;
                                                break block109;
lbl163:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl165:
                                                // 1 sources

                                                while (true) {
                                                    var5_7 ^= var6_6 ^ -1255383239;
                                                    ** continue;
                                                    break;
                                                }
                                            }
lbl169:
                                            // 12 sources

                                            block92: while (true) {
                                                switch (var6_6) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        default: {
                                                            continue block92;
                                                        }
                                                        break;
                                                    }
                                                    case 50709777: {
                                                        ** continue;
                                                    }
                                                    case 1060314750: {
                                                        ** GOTO lbl13
                                                    }
                                                    case 951396426: {
                                                        ** continue;
                                                    }
                                                    case 1381132916: {
                                                        ** continue;
                                                    }
                                                    case 442035938: {
                                                        ** continue;
                                                    }
                                                    case 92249185: {
                                                        ** continue;
                                                    }
                                                    case 1891036952: {
                                                        ** continue;
                                                    }
                                                    case -473807720: {
                                                        ** continue;
                                                    }
                                                    case -1719843097: {
                                                        ** continue;
                                                    }
                                                    case -1813364420: {
                                                        ** continue;
                                                    }
                                                    case 740305432: {
                                                        ** GOTO lbl86
                                                    }
                                                    case 463520871: {
                                                        ** continue;
                                                    }
                                                    case -1515042327: {
                                                        ** continue;
                                                    }
                                                    case 1639591064: {
                                                        ** continue;
                                                    }
                                                    case 939739064: {
                                                        ** continue;
                                                    }
                                                    case -1252831884: {
                                                        ** continue;
                                                    }
                                                    case -845235248: {
                                                        ** continue;
                                                    }
                                                    case 1552592799: {
                                                        ** continue;
                                                    }
                                                    case 1258717996: {
                                                        ** continue;
                                                    }
                                                    case 1840189508: {
                                                        ** continue;
                                                    }
                                                    case -2132256229: {
                                                        ** continue;
                                                    }
                                                    case -1406072352: {
                                                        break;
                                                    }
                                                    case -1418336948: {
                                                        ** GOTO lbl137
                                                    }
                                                    case -1030377640: {
                                                        ** continue;
                                                    }
                                                    case 1216095049: {
                                                        ** continue;
                                                    }
                                                    case -1069917916: {
                                                        ** continue;
                                                    }
                                                    case 13416681: {
                                                        ** continue;
                                                    }
                                                    case -565308874: {
                                                        var5_7 ^= var6_6 ^ -1249081348;
                                                        ** continue;
                                                    }
                                                    case 294084994: {
                                                        if (!var1_1.a.isFocused(this)) break block92;
                                                        break block106;
                                                    }
lbl234:
                                                    // 1 sources

                                                    var6_6 = (var4_5 | var7_4) ^ -700279884;
                                                    ** continue;
                                                    case -846214310: {
                                                        fu.play(ap.n, 1.4f);
                                                        break block102;
                                                    }
                                                    case -550496383: {
                                                        this.a = false;
                                                        break block107;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        var6_6 = (var4_5 | var7_4) ^ -1705258636;
                                        ** GOTO lbl169
                                    }
                                    var6_6 = (var4_5 | var7_4) ^ -1200755071;
                                    ** GOTO lbl169
                                    {
                                        case 2059780294: {
                                            var5_7 ^= var6_6 ^ -936105098;
                                            ** continue;
                                        }
                                        case 131429081: {
                                            return true;
                                        }
                                        case -978792949: {
                                            var5_7 ^= var6_6 ^ -1627805414;
                                            ** continue;
                                        }
                                        case -872702089: {
                                            var5_7 ^= var6_6 ^ -567672224;
                                            ** continue;
                                        }
                                        case -525833307: {
                                            var5_7 ^= var6_6 ^ 1519183255;
                                            ** continue;
                                        }
                                    }
                                    this.a.accept(-1);
                                    var6_6 = (var4_5 | var7_4) ^ -1325707814;
                                    ** GOTO lbl169
                                    {
                                        case 366388283: {
                                            ** continue;
                                        }
                                        case 767515970: {
                                            fu.play(ap.D);
                                            ** continue;
                                        }
                                        case 1133518967: {
                                            var5_7 ^= var6_6 ^ -2066845626;
                                            ** continue;
                                        }
                                    }
                                    var6_6 = (var4_5 | var7_4) ^ 406817390;
                                    ** GOTO lbl169
                                }
                                var5_7 = (var4_5 | var7_4) ^ 81783186;
                                var6_6 = (var4_5 | var7_4) ^ -299144499;
                                ** GOTO lbl169
                                {
                                    case 1638276994: {
                                        var5_7 ^= var6_6 ^ -1560904600;
                                        ** continue;
                                    }
                                    case -833036918: {
                                        ** continue;
                                    }
                                    case -1814339456: {
                                        var5_7 ^= var6_6 ^ -448476750;
                                        break block110;
                                    }
                                }
                            }
                            var6_6 = (var4_5 | var7_4) ^ 1582270239;
                            ** GOTO lbl169
                        }
                        var6_6 = (var4_5 | var7_4) ^ 912487718;
                        ** GOTO lbl169
                    }
                    var6_6 = (var4_5 | var7_4) ^ 1351101370;
                    ** GOTO lbl169
                }
                var6_6 = (var4_5 | var7_4) ^ 1473038102;
                ** GOTO lbl169
            }
            var6_6 = (var4_5 | var7_4) ^ 1045758205;
            ** GOTO lbl169
        }
        var6_6 = (var4_5 | var7_4) ^ 632544448;
        ** while (true)
        {
            ** case 1530195444:
        }
lbl306:
        // 1 sources

        var5_7 ^= var6_6 ^ -376170556;
        ** while (true)
    }
}

