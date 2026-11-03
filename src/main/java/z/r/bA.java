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
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.cB;
import z.r.dd;
import z.r.gj;
import z.r.he;
import z.r.kM;
import z.r.mw;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class bA {
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    private static final int[] a;
    public static final int l;
    public static final int g;
    private static final List<dd> a;
    private static final double[] a;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    private static final /* synthetic */ String a;

    private static int sI(int n2, int n3) {
        int n4 = 1694235869;
        int n5 = -1322845627;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x5F524C16)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xF5FF7843;
        n6 -= (n5 | n4) ^ 0xF5FF060A;
        n6 -= (n5 | n4) ^ 0xF5FF5525;
        n6 += (n5 | n4) ^ 0xF5FF0674;
        n6 -= (n5 | n4) ^ 0xF5FF12E1;
        n6 -= (n5 | n4) ^ 0xF5FF4A7C;
        return n6 += (n5 | n4) ^ 0xF5FF6917;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            break block12;
lbl1:
            // 1 sources

            while (true) {
                v0 = "\\\u00f2\u0016\u00cd\u000b(\u0006\u00e4j\u00e7T\u0015\u00e5\u00b9 \u00batq\u00e9\"\u00deB\u0012\u00bc.d\u0017>\u001e\u0017\u0004\u009b.tj\u00a2\u00e5\u00b4A\u00a5\u00a6\u00ca\u00a5\u00cf_a\u00b0\u00c1".getBytes("ISO-8859-1");
                if (true) ** GOTO lbl29
                while (true) {
                    var0_2 ^= 1854343815;
                    var0_2 ^= 966031878;
                    v1 = ((var0_2 ^= -126488159) | var2) ^ -1002266374 ^ bA.l;
                    var0_2 ^= 1254412192;
                    bA.a[v2] = ((v0[v3] & 255) << 24 | ((v0[v3 + 1] & 255) << 16 | ((v0[v3 + 2] & 255) << 8 | v0[v3 + 3] & 255))) ^ v1;
                    v2 = v2 + 1;
                    v0 = v0;
                    v3 = v3 + 4;
                    var0_2 ^= 1539192452;
                    if (v3 + 4 >= v0.length) break;
lbl29:
                    // 2 sources

                    var0_2 ^= 1267659568;
                    var0_2 ^= 1554020437;
                    var0_2 ^= -1652219694;
                    var0_2 ^= 884462515;
                }
                bA.k = bA.sI(((var0_2 ^= -1354460736) | var2) ^ 1400404468, var2 ^ ((var0_2 | var2) ^ -557536993));
                bA.j = bA.sI((var0_2 | var2) ^ 1400404469, var2 ^ ((var0_2 | var2) ^ -1994475139));
                bA.i = bA.sI((var0_2 | var2) ^ 1400404470, var2 ^ ((var0_2 | var2) ^ -388895945));
                bA.h = bA.sI((var0_2 | var2) ^ 1400404471, var2 ^ ((var0_2 | var2) ^ 1737464017));
                bA.g = bA.sI((var0_2 | var2) ^ 1400404464, var2 ^ ((var0_2 | var2) ^ -163096838));
                bA.f = bA.sI((var0_2 | var2) ^ 1400404465, var2 ^ ((var0_2 | var2) ^ 1551149817));
                bA.e = bA.sI((var0_2 | var2) ^ 1400404466, var2 ^ ((var0_2 | var2) ^ -1403869002));
                bA.d = bA.sI((var0_2 | var2) ^ 1400404467, var2 ^ ((var0_2 | var2) ^ -1675510992));
                bA.c = bA.sI((var0_2 | var2) ^ 1400404476, var2 ^ ((var0_2 | var2) ^ -1404906784));
                bA.b = bA.sI((var0_2 | var2) ^ 1400404477, var2 ^ ((var0_2 | var2) ^ 1736637966));
                bA.a = bA.sI((var0_2 | var2) ^ 1400404478, var2 ^ ((var0_2 | var2) ^ 620501619));
                bA.a = gj.decode("m04cOOpP+A==", bA.sI((var0_2 | var2) ^ 1400404479, var2 ^ ((var0_2 | var2) ^ 1846212406)));
                var1_1 = var2 ^ -499200780;
                ** GOTO lbl82
                break;
            }
        }
        var2 = 1757727546;
        bA.l = mK.a(MethodHandles.lookup().lookupClass(), -806346694);
        var1_1 = 0;
        var0_2 = -1882825311;
        var1_1 = var2 ^ -328151069;
        block11: while (true) {
            block13: {
                switch (var1_1) {
                    case -2068577063: {
                        var1_1 = var2 ^ -937913504;
                        ** break;
                    }
                    case -174557107: {
                        bA.a = (int)new ArrayList<E>();
                        break block13;
                    }
                    case -1963325490: {
                        var0_2 ^= var1_1 ^ -320807648;
                        var1_1 = var2 ^ -1654869129;
                        ** break;
                    }
                    case -1291456083: {
                        var0_2 ^= var1_1 ^ -720417039;
                        ** break;
                    }
                    case 783835619: {
                        v2 = 0;
                        v3 = 0;
                        bA.a = new int[((var0_2 ^= -880822226) | var2) ^ -36769870];
                        var0_2 ^= -484491703;
                        ** continue;
                    }
lbl77:
                    // 1 sources

                    var1_1 = var2 ^ -1419340004;
                    continue block11;
                    case -1596172198: {
                        var0_2 ^= var1_1 ^ 1370165851;
                        var1_1 = var2 ^ 1182575321;
                    }
lbl82:
                    // 5 sources

                    default: {
                        continue block11;
                    }
                    case -1012769754: 
                }
                bA.a = new double[]{0.0, 0.0};
                return;
            }
            var1_1 = var2 ^ -608093545;
        }
    }

    /*
     * Exception decompiling
     */
    private bA() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
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
    public static void register(int var0, cB var1_1) {
        block17: {
            var5_2 = -650425657;
            var2_3 = bA.l & -650425657 ^ -412661923;
            var4_4 = 0;
            ** GOTO lbl33
lbl5:
            // 1 sources

            while (true) {
                var3_5 ^= var4_4 ^ 1556284697;
                break block17;
                break;
            }
lbl8:
            // 1 sources

            block10: while (true) {
                var4_4 = (var2_3 | var5_2) ^ 1360974397;
lbl10:
                // 3 sources

                block11: while (true) {
                    switch (var4_4) lbl-1000:
                    // 5 sources

                    {
                        while (true) {
                            default: {
                                continue block11;
                            }
                            break;
                        }
                        case -2106991715: {
                            ** continue;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1873283691;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -1864940108: {
                            var3_5 ^= var4_4 ^ 140315523;
                            break block10;
                        }
lbl23:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -988954778;
                            ** GOTO lbl-1000
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 2098631746;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 1826434075: {
                            bA.a.add(new dd(var0, var1_1));
                            ** continue;
                        }
lbl33:
                        // 1 sources

                        var3_5 = (var2_3 | var5_2) ^ 1275483282;
                        ** continue;
                        case 980611257: {
                            ** continue;
                        }
                        case 755652919: {
                            return;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -764078360;
                            ** continue;
                            break;
                        }
                    }
                    break;
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ -1818074172;
            ** GOTO lbl10
        }
        var4_4 = (var2_3 | var5_2) ^ -127592356;
        ** while (true)
        {
            case -1369334302: {
                var3_5 ^= var4_4 ^ -1758834478;
                ** continue;
            }
            ** case 119166851:
        }
lbl51:
        // 1 sources

        bA.a.sort(Comparator.comparingInt((ToIntFunction<dd>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)I, priority(), (Lz/r/dd;)I)()));
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static double[] step(double var0, double var2_2, double var4_1) {
        block74: {
            var13_3 = -1844961310;
            var10_4 = bA.l & -1844961310 ^ 1787931531;
            var12_5 = 0;
            var11_9 = (var10_4 | var13_3) ^ 502412491;
            var12_5 = (var10_4 | var13_3) ^ -1190644998;
            ** GOTO lbl133
lbl7:
            // 2 sources

            while (true) {
                var12_5 = (var10_4 | var13_3) ^ -1781485688;
                break block74;
lbl10:
                // 1 sources

                while (true) {
                    var12_5 = (var10_4 | var13_3) ^ 992383967;
                    break block74;
                    break;
                }
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var12_5 = (var10_4 | var13_3) ^ -1264431460;
                ** GOTO lbl133
                break;
            }
lbl16:
            // 2 sources

            block53: while (true) {
                switch (var11_9) {
                    case 389780352: {
                        var11_9 ^= -82678150;
                        return v0;
                    }
                    default: {
                        var11_9 ^= -1794685633;
                        continue block53;
                    }
                    case 1217397939: 
                }
                var11_9 ^= 1215470594;
                return v0;
            }
lbl27:
            // 2 sources

            while (true) {
                var12_5 = (var10_4 | var13_3) ^ 1831104966;
                ** GOTO lbl83
                break;
            }
lbl30:
            // 1 sources

            while (true) {
                var12_5 = (var10_4 | var13_3) ^ 913839436;
                ** GOTO lbl191
                break;
            }
lbl33:
            // 1 sources

            while (true) {
                var12_5 = (var10_4 | var13_3) ^ 1286175606;
                ** GOTO lbl83
                break;
            }
lbl36:
            // 1 sources

            while (true) {
                var12_5 = (var10_4 | var13_3) ^ 1082217317;
                ** GOTO lbl83
                break;
            }
            while (true) {
                var12_5 = (var10_4 | var13_3) ^ -2129599223;
                break block74;
                break;
            }
lbl42:
            // 1 sources

            while (true) {
                var12_5 = (var10_4 | var13_3) ^ 2094538708;
                ** GOTO lbl83
                break;
            }
lbl45:
            // 2 sources

            while (true) {
                var12_5 = (var10_4 | var13_3) ^ 1536683923;
                ** GOTO lbl133
                break;
            }
lbl48:
            // 1 sources

            while (true) {
                var12_5 = (var10_4 | var13_3) ^ 340213819;
                ** GOTO lbl83
                break;
            }
        }
        block62: while (true) {
            switch (var12_5) {
                case 2072599266: {
                    var11_9 ^= var12_5 ^ -1572433205;
                    ** break;
                }
                case -1942132879: {
                    if (!var7_7.hasNext()) ** continue;
                    ** GOTO lbl74
                }
lbl60:
                // 1 sources

                var12_5 = (var10_4 | var13_3) ^ -1970432619;
                default: {
                    continue block62;
                }
                case 1867059299: {
                    var11_9 ^= var12_5 ^ 1820342173;
                    ** GOTO lbl72
                }
                case -1044435916: {
                    var8_8 = (dd)var7_7.next();
                    ** continue;
                }
                case -1344290509: {
                    var11_9 ^= var12_5 ^ 93561322;
                    ** continue;
                }
lbl72:
                // 1 sources

                var12_5 = (var10_4 | var13_3) ^ 1990514842;
                continue block62;
lbl74:
                // 1 sources

                var12_5 = (var10_4 | var13_3) ^ 1430683352;
                continue block62;
lbl76:
                // 1 sources

                while (true) {
                    if (!var8_8.driver().wantsRotation()) ** GOTO lbl90
                    var12_5 = (var10_4 | var13_3) ^ 1805651748;
                    ** GOTO lbl107
                    break;
                }
lbl80:
                // 1 sources

                while (true) {
                    var12_5 = (var10_4 | var13_3) ^ -1855520896;
                    ** GOTO lbl133
                    break;
                }
lbl83:
                // 5 sources

                block65: while (true) {
                    switch (var12_5) {
                        case 1670833445: {
                            var12_5 = (var10_4 | var13_3) ^ 1028371016;
                            continue block65;
                        }
                        case -942535261: {
                            if (var8_8.driver().allowedWhileAutomationSuppressed()) ** GOTO lbl27
lbl90:
                            // 2 sources

                            var12_5 = (var10_4 | var13_3) ^ -1508291108;
                            ** break;
                        }
                        case -2042519489: {
                            ** GOTO lbl7
                        }
                        case -1238317923: {
                            if (var6_6) ** break;
                            ** continue;
                            ** GOTO lbl116
                        }
                        case 1551954487: {
                            var11_9 ^= var12_5 ^ -1140499277;
                            ** continue;
                        }
                        case -1172771698: {
                            var11_9 ^= var12_5 ^ -216529619;
                            ** continue;
                        }
                        case -1858490161: {
                            var11_9 ^= var12_5 ^ -318784950;
                            var12_5 = (var10_4 | var13_3) ^ 45685813;
                        }
lbl107:
                        // 4 sources

                        default: {
                            continue block65;
                        }
                        case -132078626: {
                            var9_10 = var8_8.driver().computeAdjustment(var0, var2_2, var4_1);
                            var12_5 = (var10_4 | var13_3) ^ 761377929;
                            ** GOTO lbl191
                        }
                        case -1749168595: {
                            var11_9 ^= var12_5 ^ -1952639432;
                            ** continue;
                        }
lbl116:
                        // 1 sources

                        var12_5 = (var10_4 | var13_3) ^ -1727046962;
                        continue block65;
                        case -287375408: 
                    }
                    break;
                }
                var11_9 ^= 471914517;
                ** continue;
lbl121:
                // 1 sources

                while (true) {
                    var12_5 = (var10_4 | var13_3) ^ 1515923216;
                    ** GOTO lbl191
                    break;
                }
lbl124:
                // 1 sources

                while (true) {
                    var12_5 = (var10_4 | var13_3) ^ -1278105732;
                    ** GOTO lbl133
                    break;
                }
                while (true) {
                    var12_5 = (var10_4 | var13_3) ^ 1675876508;
                    ** GOTO lbl133
                    break;
                }
lbl130:
                // 1 sources

                while (true) {
                    var12_5 = (var10_4 | var13_3) ^ 253474306;
                    ** GOTO lbl191
                    break;
                }
lbl133:
                // 6 sources

                block70: while (true) {
                    switch (var12_5) {
                        default: {
                            continue block70;
                        }
                        case -1720031369: {
                            var11_9 ^= var12_5 ^ 1220267695;
                            ** continue;
                        }
                        case 2012627916: {
                            var11_9 ^= var12_5 ^ 1757432697;
                            ** GOTO lbl45
                        }
                        case 1312551287: {
                            var11_9 ^= var12_5 ^ 992971946;
                            ** continue;
                        }
                        case -1669181809: {
                            if (bA.sJ()) ** continue;
                            ** continue;
                        }
                        case -1592897416: {
                            var12_5 = (var10_4 | var13_3) ^ 1713107300;
                            continue block70;
                        }
                        case 1811890283: {
                            var6_6 = he.suppressAutomation();
                            var11_9 ^= 2010176150;
                            ** break;
                        }
                        case 1133612305: {
                            ** GOTO lbl180
                        }
lbl158:
                        // 1 sources

                        var7_7 = bA.a.iterator();
                        ** continue;
                        case -1988623820: {
                            ** GOTO lbl164
                        }
                        case 650479757: {
                            var11_9 ^= var12_5 ^ 190223308;
lbl164:
                            // 2 sources

                            var12_5 = (var10_4 | var13_3) ^ 882181595;
                            continue block70;
                        }
                        case -838026704: {
                            switch (var11_9) {
                                default: {
                                    var12_5 = (var10_4 | var13_3) ^ -714609461;
                                    continue block70;
                                }
                                case -412382432: {
                                    var12_5 = (var10_4 | var13_3) ^ -1922040793;
                                    continue block70;
                                }
                                case -1858244176: 
                            }
                            var12_5 = (var10_4 | var13_3) ^ -597936282;
                            continue block70;
                        }
                        case 805196576: {
                            var11_9 ^= var12_5 ^ -21218962;
                            ** continue;
                        }
lbl180:
                        // 1 sources

                        var12_5 = (var10_4 | var13_3) ^ 1944174047;
                        continue block70;
                        case 1229461655: 
                    }
                    break;
                }
                return bA.a;
                case 1880369790: 
            }
            break;
        }
        return bA.a;
        while (true) {
            var12_5 = (var10_4 | var13_3) ^ -393327279;
            if (true) ** GOTO lbl191
            break;
        }
        block72: while (true) {
            var12_5 = (var10_4 | var13_3) ^ -1625007587;
lbl191:
            // 6 sources

            block73: while (true) {
                switch (var12_5) {
                    default: {
                        continue block73;
                    }
                    case -671610014: {
                        var11_9 ^= var12_5 ^ -1669830919;
                        ** continue;
                    }
                    case -176027159: {
                        if (var9_10 != null) ** continue;
                        continue block72;
                    }
                    case -1597859589: {
                        v0 = var9_10;
                        ** GOTO lbl16
                    }
                    case -857625945: {
                        v0 = bA.a;
                        ** continue;
                    }
                    case 1706943990: {
                        var11_9 ^= var12_5 ^ -100053193;
                        ** continue;
                    }
                    case 303559354: 
                }
                break;
            }
            break;
        }
        var11_9 ^= var12_5 ^ -1918674821;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static boolean steering() {
        block68: {
            block67: {
                block61: {
                    block65: {
                        block66: {
                            block64: {
                                block63: {
                                    block62: {
                                        var6 = -1185451174;
                                        var3_1 = bA.l & -1185451174 ^ -1184684652;
                                        var5_2 = 0;
                                        ** GOTO lbl123
lbl5:
                                        // 1 sources

                                        return true;
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var4_6 ^= var5_2 ^ -958815882;
                                            ** GOTO lbl89
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        while (true) {
                                            var5_2 = (var3_1 | var6) ^ -153591605;
                                            break block61;
                                            break;
                                        }
lbl13:
                                        // 1 sources

                                        while (true) {
                                            var1_4 = bA.a.iterator();
                                            break block62;
                                            break;
                                        }
lbl16:
                                        // 1 sources

                                        while (true) {
                                            var5_2 = (var3_1 | var6) ^ -1457678065;
                                            break block61;
                                            break;
                                        }
lbl19:
                                        // 2 sources

                                        while (true) {
                                            var5_2 = (var3_1 | var6) ^ -674546384;
                                            break block61;
                                            break;
                                        }
lbl22:
                                        // 1 sources

                                        while (true) {
                                            var4_6 ^= var5_2 ^ 1241037124;
                                            break block63;
                                            break;
                                        }
                                    }
lbl26:
                                    // 2 sources

                                    while (true) {
                                        var5_2 = (var3_1 | var6) ^ -1689271133;
                                        ** GOTO lbl103
                                        break;
                                    }
lbl29:
                                    // 1 sources

                                    while (true) {
                                        var5_2 = (var3_1 | var6) ^ 1884664790;
                                        break block64;
                                        break;
                                    }
lbl32:
                                    // 1 sources

                                    while (true) {
                                        var4_6 ^= var5_2 ^ -39872706;
                                        ** continue;
                                        break;
                                    }
                                    while (true) {
                                        var5_2 = (var3_1 | var6) ^ 512053308;
                                        ** GOTO lbl103
                                        break;
                                    }
lbl38:
                                    // 1 sources

                                    while (true) {
                                        var4_6 ^= -585196710;
                                        ** continue;
                                        break;
                                    }
lbl41:
                                    // 1 sources

                                    while (true) {
                                        var4_6 ^= -1826366000;
                                        ** GOTO lbl97
                                        break;
                                    }
                                }
                                var5_2 = (var3_1 | var6) ^ 1672356023;
                                break block64;
lbl47:
                                // 1 sources

                                return false;
lbl49:
                                // 1 sources

                                while (true) {
                                    var4_6 ^= var5_2 ^ -817647773;
                                    var5_2 = (var3_1 | var6) ^ 168725413;
                                    ** GOTO lbl103
                                    break;
                                }
lbl53:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl55:
                                // 1 sources

                                while (true) {
                                    var5_2 = (var3_1 | var6) ^ 1708521419;
                                    break block61;
                                    break;
                                }
                                var2_5 = (dd)var1_4.next();
                                var5_2 = (var3_1 | var6) ^ 36915521;
                                break block61;
                            }
lbl62:
                            // 4 sources

                            block46: while (true) {
                                switch (var5_2) lbl-1000:
                                // 3 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block46;
                                        }
                                        break;
                                    }
                                    case 942452038: {
                                        ** continue;
                                    }
                                    case 1566097512: {
                                        break block46;
                                    }
                                    case 1027359892: {
                                        var4_6 ^= var5_2 ^ 781479209;
                                        ** continue;
                                    }
lbl74:
                                    // 1 sources

                                    while (true) {
                                        var4_6 ^= var5_2 ^ -612734500;
                                        ** GOTO lbl115
                                        break;
                                    }
                                    case -223595789: {
                                        var4_6 ^= var5_2 ^ -92412903;
                                        break block65;
                                    }
lbl80:
                                    // 2 sources

                                    while (true) {
                                        var5_2 = (var3_1 | var6) ^ -1846631806;
                                        break block61;
                                        break;
                                    }
lbl83:
                                    // 1 sources

                                    while (true) {
                                        var5_2 = (var3_1 | var6) ^ -2124686696;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl86:
                                    // 1 sources

                                    while (true) {
                                        var5_2 = (var3_1 | var6) ^ -1136816988;
                                        ** GOTO lbl103
                                        break;
                                    }
lbl89:
                                    // 1 sources

                                    var5_2 = (var3_1 | var6) ^ -2089030459;
                                    ** GOTO lbl103
lbl91:
                                    // 1 sources

                                    while (true) {
                                        var5_2 = (var3_1 | var6) ^ -466634826;
                                        ** continue;
                                        break;
                                    }
                                    case -920468472: {
                                        var0_3 = he.suppressAutomation();
                                        ** continue;
                                    }
lbl97:
                                    // 1 sources

                                    if (!var2_5.driver().wantsRotation()) ** GOTO lbl80
                                    ** continue;
                                    case -143308265: {
                                        if (!bA.sJ()) {
                                            ** continue;
                                        }
                                        break block66;
                                    }
lbl103:
                                    // 6 sources

                                    block53: while (true) {
                                        switch (var5_2) {
                                            default: {
                                                continue block53;
                                            }
                                            case -1477302302: {
                                                ** continue;
                                            }
                                            case 973904667: {
                                                ** continue;
                                            }
                                            case 574141309: {
                                                ** continue;
                                            }
                                            case 987158315: {
                                                ** continue;
                                            }
lbl115:
                                            // 1 sources

                                            var5_2 = (var3_1 | var6) ^ -1895261919;
                                            break block61;
lbl117:
                                            // 1 sources

                                            while (true) {
                                                var5_2 = (var3_1 | var6) ^ -1252498040;
                                                break block61;
                                                break;
                                            }
lbl120:
                                            // 1 sources

                                            while (true) {
                                                var5_2 = (var3_1 | var6) ^ -458471035;
                                                break block61;
                                                break;
                                            }
lbl123:
                                            // 1 sources

                                            var4_6 = (var3_1 | var6) ^ 1184944551;
                                            ** continue;
lbl125:
                                            // 1 sources

                                            while (true) {
                                                if (!var0_3) ** GOTO lbl19
                                                ** continue;
                                                break;
                                            }
                                            case 88800122: {
                                                var4_6 ^= var5_2 ^ -1608843903;
                                                break block67;
                                            }
                                            case -1283851141: {
                                                if (!var1_4.hasNext()) ** continue;
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                            var5_2 = (var3_1 | var6) ^ 1272661293;
                            ** GOTO lbl62
                        }
                        var5_2 = (var3_1 | var6) ^ -2075446454;
                        ** GOTO lbl62
                        {
                            ** case -623290519:
                        }
lbl139:
                        // 1 sources

                        return false;
lbl140:
                        // 1 sources

                        while (true) {
                            var4_6 ^= var5_2 ^ -806641862;
                            ** continue;
                            break;
                        }
                    }
                    var5_2 = (var3_1 | var6) ^ 1308769737;
                    ** while (true)
lbl146:
                    // 1 sources

                    while (true) {
                        if (var2_5.driver().allowedWhileAutomationSuppressed()) ** break;
                        ** continue;
                        ** continue;
                        break;
                    }
                }
lbl151:
                // 2 sources

                block59: while (true) {
                    switch (var5_2) {
                        default: {
                            continue block59;
                        }
                        case 1574649435: {
                            ** continue;
                        }
                        case 275443409: {
                            ** continue;
                        }
                        case 204411478: {
                            ** continue;
                        }
                        case 1857833710: {
                            ** continue;
                        }
                        case 914353919: {
                            ** continue;
                        }
                        case 681170268: {
                            ** continue;
                        }
                        case 885567168: {
                            ** continue;
                        }
                        case -593330155: {
                            ** continue;
                        }
                        case 1336874773: {
                            ** continue;
                        }
                        case -1153155425: 
                    }
                    var4_6 ^= var5_2 ^ 9214202;
                    break block68;
                    break;
                }
            }
            var5_2 = (var3_1 | var6) ^ -2086559499;
            ** while (true)
            ** while (true)
        }
        var5_2 = (var3_1 | var6) ^ -1916806882;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static boolean wouldSteer(cB var0) {
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
    private static boolean sJ() {
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
    private static boolean sK() {
        block32: {
            var5 = 544353108;
            var2_1 = bA.l & 544353108 ^ -1887015986;
            var4_2 = 0;
            var3_5 = (var2_1 | var5) ^ 1658113761;
            var4_2 = (var2_1 | var5) ^ 448258320;
            break block32;
lbl7:
            // 2 sources

            while (true) {
                var4_2 = (var2_1 | var5) ^ -563012376;
                ** GOTO lbl12
                break;
            }
            while (true) {
                block31: {
                    var4_2 = (var2_1 | var5) ^ -1236857329;
lbl12:
                    // 2 sources

                    block26: while (true) {
                        switch (var4_2) {
                            case 294049854: {
                                v0 = true;
                                break block31;
                            }
                            case 431056337: {
                                ** GOTO lbl39
                            }
                            case -1614175562: {
                                var3_5 ^= var4_2 ^ -250166315;
                                ** GOTO lbl7
                            }
                            case 1904703286: {
                                var4_2 = (var2_1 | var5) ^ -1099910176;
                                ** break;
                            }
                            case -589240365: {
                                switch (var3_5) {
                                    case -1236320457: {
                                        var4_2 = (var2_1 | var5) ^ -18027523;
                                        ** break;
                                    }
                                    default: {
                                        var4_2 = (var2_1 | var5) ^ -260192478;
                                        continue block26;
                                    }
                                    case -104852306: 
                                }
                                var4_2 = (var2_1 | var5) ^ 809486696;
                            }
lbl35:
                            // 4 sources

                            default: {
                                continue block26;
                            }
                            case 1360691235: {
                                var3_5 ^= var4_2 ^ 2118193929;
lbl39:
                                // 2 sources

                                var4_2 = (var2_1 | var5) ^ 1930857485;
                                continue block26;
                            }
                            case 1602989308: 
                        }
                        break;
                    }
                    var3_5 ^= var4_2 ^ -1879586363;
                    ** continue;
                }
lbl45:
                // 2 sources

                while (true) {
                    var3_5 ^= -965593398;
                    return v0;
                }
                break;
            }
lbl48:
            // 1 sources

            block28: while (true) {
                switch (var4_2) {
                    default: {
                        continue block28;
                    }
                    case -651754783: {
                        var3_5 ^= var4_2 ^ -1208458366;
                        var4_2 = (var2_1 | var5) ^ 966110281;
                        continue block28;
                    }
                    case 693524545: {
                        var3_5 ^= var4_2 ^ -1125731521;
                        var4_2 = (var2_1 | var5) ^ -1020854023;
                        continue block28;
                    }
                    case -1771845737: {
                        v0 = false;
                        ** continue;
                    }
                    case 1825663783: 
                }
                var0_3 = (kM)var1_4;
                var3_5 ^= -1783567490;
                if (var0_3.isFreecamActive()) ** continue;
                while (true) {
                    var4_2 = (var2_1 | var5) ^ 1993435455;
                    continue block28;
                    break;
                }
                break;
            }
        }
        block30: while (true) {
            switch (var4_2) {
                default: {
                    continue block30;
                }
                case -1269147982: {
                    if (!((var1_4 = mw.getInstance().getModuleByName(bA.a)) instanceof kM)) ** continue;
                    break block30;
                }
                case -1814285866: {
                    var3_5 ^= var4_2 ^ -1489076153;
                    var4_2 = (var2_1 | var5) ^ 464272748;
                    continue block30;
                }
                case -1253995826: {
                    var4_2 = (var2_1 | var5) ^ 1009408520;
                    continue block30;
                }
            }
            break;
        }
        var4_2 = (var2_1 | var5) ^ -2036321377;
        ** while (true)
    }
}

