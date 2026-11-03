/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import z.r.a;
import z.r.bA;
import z.r.cB;
import z.r.eA;
import z.r.ej;
import z.r.fG;
import z.r.gj;
import z.r.kM;
import z.r.ko;
import z.r.mw;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class dz {
    private int a;
    private final ej a;
    public static final float a;
    private static final int b;
    private double a;
    private static final /* synthetic */ String a;
    private final cB a;
    private Object a;
    public static final int c;
    private double b;
    private static final double c;
    private static final int[] a;
    private boolean a;

    /*
     * Unable to fully structure code
     */
    public dz(int var1_1) {
        block21: {
            block22: {
                break block22;
lbl1:
                // 1 sources

                while (true) {
                    var3_5 ^= -2040738707;
                    ** GOTO lbl47
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -750920909;
                    ** GOTO lbl34
                    break;
                }
lbl7:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 982024075;
                    ** GOTO lbl34
                    break;
                }
            }
            var5_2 = -2012241455;
            var2_3 = dz.c & -2012241455 ^ 811903733;
            var4_4 = 0;
            var3_5 = (var2_3 | var5_2) ^ 1543339272;
            ** while (true)
lbl18:
            // 1 sources

            return;
lbl20:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 537065182;
                ** GOTO lbl34
                break;
            }
lbl23:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 941779803;
                ** GOTO lbl34
lbl26:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 1120122681;
                    if (true) ** GOTO lbl34
lbl29:
                    // 1 sources

                    while (true) {
                        this.a = new fG(this);
                        ** continue;
                        break;
                    }
                    break;
                }
                break;
            }
            block19: while (true) {
                var4_4 = (var2_3 | var5_2) ^ -693428220;
lbl34:
                // 8 sources

                block20: while (true) {
                    switch (var4_4) {
                        default: {
                            continue block20;
                        }
                        case -89383732: {
                            ** continue;
                        }
                        case -2098736002: {
                            ** continue;
                        }
                        case 761786611: {
                            ** continue;
                        }
                        case -1737663189: {
                            var3_5 ^= var4_4 ^ -1854096085;
                            ** continue;
                        }
lbl47:
                        // 1 sources

                        super();
                        continue block19;
                        case 1858374641: {
                            var3_5 ^= var4_4 ^ -2058839437;
                            ** continue;
                        }
                        case -722079964: {
                            var3_5 ^= var4_4 ^ -872287626;
                            break block21;
                        }
                        case -2142388050: {
                            bA.register(var1_1, this.a);
                            ** continue;
                        }
                        case 1800564934: {
                            var3_5 ^= var4_4 ^ 224089847;
                            break block19;
                        }
                    }
                    break;
                }
                break;
            }
            ** while (true)
            this.a = new ej(var1_1, false);
            var4_4 = (var2_3 | var5_2) ^ 1822049489;
            ** GOTO lbl34
        }
        var4_4 = (var2_3 | var5_2) ^ -1794614522;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public boolean claim(Object var1_1) {
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void release(Object object) {
        int n2 = -334224533;
        int n3 = c & 0xEC14236B ^ 0xEEEF5AF6;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x97F14DE5;
        n4 = (n3 | n2) ^ 0x29BEE315;
        boolean bl2 = true;
        block13: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0x3CD90F28;
            }
            block14: while (true) {
                switch (n4) {
                    default: {
                        continue block14;
                    }
                    case 1216786302: {
                        n5 ^= n4 ^ 0x4B9025E9;
                        n4 = (n3 | n2) ^ 0xF47C96F;
                        continue block14;
                    }
                    case 1057817863: {
                        this.a = null;
                        n4 = (n3 | n2) ^ 0x22D9A32C;
                        continue block14;
                    }
                    case -952002326: {
                        n4 = (n3 | n2) ^ 0xA679D481;
                        continue block14;
                    }
                    case -869869357: {
                        n5 ^= n4 ^ 0x85E805D1;
                        n4 = (n3 | n2) ^ 0xD6D07850;
                        continue block14;
                    }
                    case -900624415: {
                        n5 ^= n4 ^ 0x76C88FA5;
                        n4 = (n3 | n2) ^ 0xD0F20FF1;
                        continue block14;
                    }
                    case -507989360: {
                        if (this.a != object) continue block13;
                        n4 = (n3 | n2) ^ 0xB1C09720;
                        continue block14;
                    }
                    case 942605231: {
                        this.a = 0;
                        n4 = (n3 | n2) ^ 0x24AEF41E;
                        continue block14;
                    }
                    case 1041069070: {
                        this.a.release();
                        continue block13;
                    }
                    case -769231657: {
                        n5 ^= n4 ^ 0xBA37CCFE;
                        n4 = (n3 | n2) ^ 0xE0F19BA7;
                        continue block14;
                    }
                    case 1598024927: {
                        n5 ^= n4 ^ 0xAA683199;
                        n4 = (n3 | n2) ^ 0xD1F27EF8;
                        continue block14;
                    }
                    case 235855960: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public void releaseAll() {
        int n2 = -1981842614;
        int n3 = c & 0x89DF7B4A ^ 0xDB579B5E;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x4030DE48;
        n4 = (n3 | n2) ^ 0x669F668F;
        block13: while (true) {
            switch (n4) {
                default: {
                    continue block13;
                }
                case 1343164033: {
                    this.a = 0;
                    n4 = (n3 | n2) ^ 0xAE33030C;
                    continue block13;
                }
                case 661327435: {
                    n5 ^= n4 ^ 0x2D31A650;
                    n4 = (n3 | n2) ^ 0x8BD0F5DF;
                    continue block13;
                }
                case -1452362865: {
                    n5 ^= n4 ^ 0xF6F37A9C;
                    n4 = (n3 | n2) ^ 0x10B64D97;
                    continue block13;
                }
                case 1305965991: {
                    n5 ^= n4 ^ 0x5CD46C46;
                    n4 = (n3 | n2) ^ 0x28007CB;
                    continue block13;
                }
                case 501330735: {
                    n5 ^= n4 ^ 0x80AC7C51;
                    n4 = (n3 | n2) ^ 0xA9B2B1FD;
                    continue block13;
                }
                case -882264375: {
                    this.a = null;
                    n4 = (n3 | n2) ^ 0xFCB4F515;
                    continue block13;
                }
                case -648020843: {
                    this.a.release();
                    n4 = (n3 | n2) ^ 0xC63E4871;
                    continue block13;
                }
                case -1119838767: {
                    n4 = (n3 | n2) ^ 0x72B148D1;
                    continue block13;
                }
                case 1978464338: {
                    n5 ^= n4 ^ 0x9DD1E7A6;
                    n4 = (n3 | n2) ^ 0x6EA0A7;
                    continue block13;
                }
                case -609133575: {
                    this.a = false;
                    n4 = (n3 | n2) ^ 0x96088EF9;
                    continue block13;
                }
                case 1919765155: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean aimAt(Object var1_1, class_243 var2_2, double var3_3) {
        block42: {
            block40: {
                block35: {
                    block39: {
                        block37: {
                            block38: {
                                block36: {
                                    block41: {
                                        break block41;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var9_6 = (var7_5 | var10_4) ^ 876288146;
                                            break block35;
                                            break;
                                        }
                                        while (true) {
                                            var9_6 = (var7_5 | var10_4) ^ -1613662788;
                                            break block35;
                                            break;
                                        }
lbl7:
                                        // 1 sources

                                        while (true) {
                                            if (var5_7.field_1724 != null) ** continue;
                                            break block36;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        while (true) {
                                            var8_8 ^= var9_6 ^ 1680551853;
                                            break block37;
                                            break;
                                        }
lbl13:
                                        // 1 sources

                                        while (true) {
                                            var8_8 ^= var9_6 ^ 1867578190;
                                            break block38;
                                            break;
                                        }
                                    }
                                    var10_4 = -550142167;
                                    var7_5 = dz.c & -550142167 ^ 1420006435;
                                    var9_6 = 0;
                                    break block42;
lbl21:
                                    // 1 sources

                                    while (true) {
                                        var9_6 = (var7_5 | var10_4) ^ -44030646;
                                        break block35;
                                        break;
                                    }
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var8_8 ^= -1994415529;
                                        break block39;
                                        break;
                                    }
lbl27:
                                    // 1 sources

                                    while (true) {
                                        var9_6 = (var7_5 | var10_4) ^ -571576691;
                                        break block35;
                                        break;
                                    }
lbl30:
                                    // 1 sources

                                    return false;
lbl32:
                                    // 1 sources

                                    while (true) {
                                        var8_8 ^= var9_6 ^ -868575614;
                                        ** continue;
                                        break;
                                    }
                                }
                                while (true) {
                                    var9_6 = (var7_5 | var10_4) ^ -824701904;
                                    break block35;
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var6_9 = eA.getRotationsTo(var5_7.field_1724.method_33571(), var2_2);
                                    ** continue;
                                    break;
                                }
                            }
                            var9_6 = (var7_5 | var10_4) ^ -391350007;
                            break block40;
lbl45:
                            // 1 sources

                            while (true) {
                                var9_6 = (var7_5 | var10_4) ^ 121509818;
                                break block35;
                                break;
                            }
lbl48:
                            // 1 sources

                            while (true) {
                                var9_6 = (var7_5 | var10_4) ^ -1158185103;
                                break block40;
                                break;
                            }
                        }
                        var9_6 = (var7_5 | var10_4) ^ 195166443;
                        break block35;
lbl54:
                        // 1 sources

                        while (true) {
                            var9_6 = (var7_5 | var10_4) ^ -456573370;
                            break block35;
                            break;
                        }
                    }
                    return this.aimYawPitch(var1_1, var6_9[0], var6_9[1], var3_3);
lbl59:
                    // 1 sources

                    while (true) {
                        var8_8 ^= var9_6 ^ -523326607;
                        ** continue;
                        break;
                    }
lbl62:
                    // 1 sources

                    while (true) {
                        var5_7 = class_310.method_1551();
                        ** continue;
                        break;
                    }
lbl65:
                    // 1 sources

                    while (true) {
                        if (!this.claim(var1_1)) ** continue;
                        ** continue;
                        break;
                    }
                }
                block33: while (true) {
                    switch (var9_6) {
                        default: {
                            continue block33;
                        }
                        case -662050671: {
                            ** continue;
                        }
                        case 292549403: {
                            ** continue;
                        }
                        case 998162797: {
                            ** continue;
                        }
                        case -736755776: {
                            ** continue;
                        }
                        case 1080461975: {
                            ** continue;
                        }
                        case -343087175: {
                            ** continue;
                        }
                        case 584571489: {
                            ** continue;
                        }
                        ** case 39424422:
lbl88:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
lbl90:
            // 2 sources

            block34: while (true) {
                switch (var9_6) {
                    default: {
                        continue block34;
                    }
                    case 1698725978: {
                        ** continue;
                    }
                    case -1265222809: {
                        ** continue;
                    }
                    ** case 924550690:
lbl99:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        var8_8 = (var7_5 | var10_4) ^ -1024736426;
        var9_6 = (var7_5 | var10_4) ^ 1797375052;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean aimYawPitch(Object var1_1, float var2_2, float var3_3, double var4_4) {
        block50: {
            var11_5 = 226050099;
            var8_6 = dz.c & 226050099 ^ 646545662;
            var10_7 = 0;
            var9_9 = (var8_6 | var11_5) ^ 1934239136;
            var10_7 = (var8_6 | var11_5) ^ 1132594550;
            ** GOTO lbl77
lbl7:
            // 1 sources

            while (true) {
                var10_7 = (var8_6 | var11_5) ^ 1125426;
                break block50;
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var10_7 = (var8_6 | var11_5) ^ -8488567;
                ** GOTO lbl114
                break;
            }
            while (true) {
                var10_7 = (var8_6 | var11_5) ^ -555310889;
                if (true) ** GOTO lbl77
                break;
            }
        }
lbl17:
        // 2 sources

        block40: while (true) {
            block51: {
                block52: {
                    block53: {
                        switch (var10_7) {
                            case 222281936: {
                                var9_9 ^= var10_7 ^ -1255944742;
                                var10_7 = (var8_6 | var11_5) ^ 1164324522;
                                continue block40;
                            }
                            case -878793555: {
                                var9_9 ^= var10_7 ^ 1336511881;
                                ** break;
                            }
                            case 1608621274: {
                                v0 = false;
                                break block51;
                            }
                            case 1791960223: {
                                ** break;
                            }
lbl31:
                            // 1 sources

                            var10_7 = (var8_6 | var11_5) ^ 1880644645;
                            break;
                            case -1755494400: {
                                v0 = true;
                                break block51;
                            }
                            case 803794125: {
                                var9_9 ^= var10_7 ^ 1529678449;
                                break block52;
                            }
                            case -1083104315: {
                                if (this.a) {
                                    ** continue;
                                }
                                ** GOTO lbl59
                            }
                            case -18699232: {
                                var9_9 ^= var10_7 ^ 605061702;
                                var10_7 = (var8_6 | var11_5) ^ -1870077126;
                                break;
                            }
lbl47:
                            // 1 sources

                            var9_9 ^= 1959126716;
                            if (Math.abs(class_3532.method_15393((float)((float)(this.a - (double)var2_2)))) < 0.01f) {
                                var10_7 = (var8_6 | var11_5) ^ 583401519;
                                break;
                            }
                            ** GOTO lbl59
                            case 2146222201: {
                                var9_9 ^= var10_7 ^ -69476003;
                                var10_7 = (var8_6 | var11_5) ^ -1197176577;
                                break;
                            }
                            case 1788866133: {
                                var9_9 ^= -1206121206;
                                if (Math.abs(this.b - (double)var6_8) < 0.009999999776482582) break block53;
lbl59:
                                // 3 sources

                                var10_7 = (var8_6 | var11_5) ^ -462984110;
                            }
                        }
                        continue;
                    }
                    var10_7 = (var8_6 | var11_5) ^ 1343553670;
                    continue;
                }
                var10_7 = (var8_6 | var11_5) ^ 1161225312;
                continue;
            }
            var9_9 ^= 861615429;
            var7_10 = v0;
            var10_7 = (var8_6 | var11_5) ^ -56804207;
            ** GOTO lbl164
            break;
        }
lbl72:
        // 1 sources

        while (true) {
            var10_7 = (var8_6 | var11_5) ^ -1932552201;
            ** GOTO lbl114
            break;
        }
        block42: while (true) {
            var10_7 = (var8_6 | var11_5) ^ 1324619135;
lbl77:
            // 3 sources

            block43: while (true) {
                switch (var10_7) {
                    case 19551972: {
                        var6_8 = class_3532.method_15363((float)var3_3, (float)-90.0f, (float)90.0f);
                        ** GOTO lbl102
                    }
                    case -37113825: {
                        if (this.claim(var1_1)) ** continue;
                        continue block42;
                    }
                    case 1628296576: {
                        var9_9 ^= var10_7 ^ 392349763;
                        ** break;
                    }
                    case -249602008: {
                        var9_9 ^= var10_7 ^ -105303139;
                        var10_7 = (var8_6 | var11_5) ^ 785618459;
                        ** GOTO lbl100
                    }
lbl92:
                    // 1 sources

                    var10_7 = (var8_6 | var11_5) ^ -1928462604;
                    ** GOTO lbl100
                    case 1820050825: {
                        var10_7 = (var8_6 | var11_5) ^ 542512218;
                        continue block43;
                    }
                    case 263181477: {
                        var9_9 ^= var10_7 ^ -439146796;
                        var10_7 = (var8_6 | var11_5) ^ -768577312;
                    }
lbl100:
                    // 4 sources

                    default: {
                        continue block43;
                    }
lbl102:
                    // 1 sources

                    var10_7 = (var8_6 | var11_5) ^ -786731809;
                    ** continue;
                    case -1561051637: 
                }
                break;
            }
            break;
        }
        return false;
lbl106:
        // 2 sources

        while (true) {
            var10_7 = (var8_6 | var11_5) ^ -1943774046;
            ** GOTO lbl114
lbl109:
            // 1 sources

            while (true) {
                var10_7 = (var8_6 | var11_5) ^ 2137044965;
                if (true) ** GOTO lbl114
                break;
            }
            break;
        }
        block46: while (true) {
            var10_7 = (var8_6 | var11_5) ^ -1062934452;
lbl114:
            // 5 sources

            block47: while (true) {
                switch (var10_7) {
                    case 1415816373: {
                        var9_9 ^= var10_7 ^ 843607540;
                        ** continue;
                    }
                    case -279107405: {
                        this.a = var2_2;
                        ** continue;
                    }
                    case 1263396509: {
                        ** break;
                    }
                    case 702736939: {
                        this.b = var6_8;
                        var10_7 = (var8_6 | var11_5) ^ -82535667;
                        continue block47;
                    }
                    case 1352234778: {
                        var9_9 ^= var10_7 ^ 1142981770;
                        var10_7 = (var8_6 | var11_5) ^ 102443732;
                        continue block47;
                    }
                    case 1408698360: {
                        this.a = 0;
                        ** GOTO lbl106
                    }
                    case -748356498: {
                        var9_9 ^= var10_7 ^ -913776870;
                        ** continue;
                    }
                    case -722641934: {
                        var9_9 ^= var10_7 ^ -994631285;
                        var10_7 = (var8_6 | var11_5) ^ 48106495;
                        continue block47;
                    }
                    case -796411530: {
                        if (!var7_10) ** break;
                        ** continue;
                        ** break;
                    }
                    case 496462603: {
                        var9_9 ^= var10_7 ^ 1520909888;
                        var10_7 = (var8_6 | var11_5) ^ -863700921;
                        continue block47;
                    }
                    case 757582592: {
                        this.a = true;
                        var10_7 = (var8_6 | var11_5) ^ 846113780;
                        ** GOTO lbl164
                    }
lbl154:
                    // 1 sources

                    var10_7 = (var8_6 | var11_5) ^ 2081343239;
                    continue block47;
lbl156:
                    // 1 sources

                    var10_7 = (var8_6 | var11_5) ^ 1689527906;
                    continue block47;
                    case -1545757603: {
                        var9_9 ^= var10_7 ^ 1040612578;
                        continue block46;
                    }
                    case -478332744: {
                        this.a.aimYawPitch(var2_2, var6_8, var4_4);
                        var10_7 = (var8_6 | var11_5) ^ 2073715786;
                    }
lbl164:
                    // 4 sources

                    default: {
                        continue block47;
                    }
                    case -1556719864: 
                }
                break;
            }
            break;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block42: {
            block41: {
                block43: {
                    block40: {
                        block39: {
                            var9 = -1311946086;
                            var8_1 = 736356714;
                            dz.c = mK.a(MethodHandles.lookup().lookupClass(), -391025860);
                            var7_2 = 0;
                            ** GOTO lbl95
lbl6:
                            // 1 sources

                            while (true) {
                                var6_5 ^= -1542452253;
                                break block39;
                                break;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl11:
                            // 1 sources

                            while (true) {
                                var6_5 ^= var7_2 ^ 1790275046;
                                ** GOTO lbl71
                                break;
                            }
                            dz.a = new int[var1_6];
                            var7_2 = var9 ^ -59565311;
                            ** GOTO lbl97
lbl17:
                            // 1 sources

                            while (true) {
                                var7_2 = var9 ^ -1759775922;
                                ** GOTO lbl97
                                break;
                            }
lbl20:
                            // 1 sources

                            while (true) {
                                var6_5 ^= 1188184433;
                                ** GOTO lbl111
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                var3_7 = 0;
                                ** continue;
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var7_2 = var9 ^ 2020110849;
                                if (true) ** GOTO lbl59
                                break;
                            }
lbl29:
                            // 1 sources

                            while (true) {
                                var6_5 ^= var7_2 ^ -1065826837;
                                ** continue;
                                break;
                            }
                        }
                        var1_6 = var0_3.length / 4;
                        ** GOTO lbl93
lbl35:
                        // 1 sources

                        while (true) {
                            var6_5 ^= var7_2 ^ -788119545;
                            break block40;
                            break;
                        }
                        block28: while (true) {
                            var7_2 = var9 ^ 2057900417;
lbl40:
                            // 3 sources

                            block29: while (true) {
                                switch (var7_2) lbl-1000:
                                // 4 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block29;
                                        }
                                        break;
                                    }
                                    case -882615525: {
                                        ** continue;
                                    }
                                    case 1632778616: {
                                        ** continue;
                                    }
lbl49:
                                    // 1 sources

                                    while (true) {
                                        var6_5 ^= var7_2 ^ -1452138462;
                                        ** GOTO lbl109
                                        break;
                                    }
lbl52:
                                    // 1 sources

                                    while (true) {
                                        var0_3 = "\u00b4\u0081\u00a1\u00e9we\u0099\u00b7#\u00ca,\u00d1".getBytes("ISO-8859-1");
                                        ** continue;
                                        break;
                                    }
lbl55:
                                    // 1 sources

                                    while (true) {
                                        var7_2 = var9 ^ 1569881394;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    {
                                        var7_2 = var9 ^ 90205453;
lbl59:
                                        // 3 sources

                                        block35: while (true) {
                                            switch (var7_2) {
                                                default: {
                                                    continue block35;
                                                }
                                                case -911918949: {
                                                    continue block34;
                                                }
lbl65:
                                                // 1 sources

                                                while (true) {
                                                    var6_5 ^= 1714066094;
                                                    ** continue;
                                                    break;
                                                }
                                                case 798133870: {
                                                    dz.a[var4_8] = var5_9 ^= var2_4;
                                                    continue block28;
                                                }
lbl71:
                                                // 1 sources

                                                var7_2 = var9 ^ -732238245;
                                                ** GOTO lbl-1000
                                                case -1263720553: {
                                                    var6_5 ^= var7_2 ^ -1823525339;
                                                    break block41;
                                                }
                                                case -2108331225: {
                                                    var2_4 = (var6_5 | var7_2 ^ 865608125) ^ (var7_2 ^ 1899617880) ^ dz.c;
                                                    break block34;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    ** continue;
                                    case 1704436929: {
                                        var3_7 += 4;
                                        if (++var4_8 < var1_6) break block28;
                                        ** continue;
                                    }
lbl84:
                                    // 1 sources

                                    while (true) {
                                        var7_2 = var9 ^ -794856478;
                                        ** continue;
                                        break;
                                    }
                                    case -1708219408: {
                                        dz.c = 0.05;
                                        dz.b = dz.gy((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ -476295079), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ -803806002)));
                                        dz.a = 1.6f;
                                        dz.a = gj.decode("RUtjNnmFsQ==", dz.gy((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ -476295078), var7_2 ^ var8_1 ^ ((var6_5 | var7_2 ^ var8_1) ^ (var7_2 ^ 588350059))));
                                        return;
                                    }
lbl93:
                                    // 1 sources

                                    var7_2 = var9 ^ -1220892581;
                                    ** GOTO lbl97
lbl95:
                                    // 1 sources

                                    var6_5 = 645919338;
                                    ** continue;
lbl97:
                                    // 4 sources

                                    block38: while (true) {
                                        switch (var7_2) {
                                            default: {
                                                continue block38;
                                            }
                                            case 651606484: {
                                                ** continue;
                                            }
                                            case -916877256: {
                                                ** continue;
                                            }
                                            case 116908737: {
                                                ** continue;
                                            }
                                            ** case 1304318363:
lbl108:
                                            // 1 sources

                                            ** continue;
                                        }
                                        break;
                                    }
lbl109:
                                    // 1 sources

                                    var7_2 = var9 ^ 2023021218;
                                    ** continue;
lbl111:
                                    // 1 sources

                                    var4_8 = 0;
                                }
                                break;
                            }
                            break;
                        }
                        break block42;
                        {
                            ** case -329304152:
                        }
lbl114:
                        // 1 sources

                        var6_5 ^= var7_2 ^ 208951866;
                        break block43;
                    }
                    var7_2 = var9 ^ -1637890828;
                    ** GOTO lbl40
                }
                var7_2 = var9 ^ var8_1;
                ** while (true)
            }
            var7_2 = var9 ^ 865608125;
            ** while (true)
        }
        var5_9 = (var0_3[var3_7] & (((var6_5 ^= 293949314) | var9) ^ -1207997952)) << ((var6_5 | var9) ^ -1207997721) | (var0_3[var3_7 + 1] & ((var6_5 | var9) ^ -1207997952)) << ((var6_5 | var9) ^ -1207997713) | (var0_3[var3_7 + 2] & ((var6_5 | var9) ^ -1207997952)) << ((var6_5 | var9) ^ -1207997705) | var0_3[var3_7 + 3] & ((var6_5 | var9) ^ -1207997952);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean mousePipelineBlocked() {
        var6 = 1699347428;
        var3_1 = dz.c & 1699347428 ^ 1389767322;
        var5_2 = 0;
        var4_4 = (var3_1 | var6) ^ 34266332;
        var5_2 = (var3_1 | var6) ^ 2073806150;
        if (true) ** GOTO lbl81
        {
            var5_2 = (var3_1 | var6) ^ 593731850;
            if (true) ** GOTO lbl42
lbl9:
            // 1 sources

            block22: while (true) {
                var5_2 = (var3_1 | var6) ^ -1532710744;
lbl11:
                // 2 sources

                block23: while (true) {
                    block36: {
                        switch (var5_2) {
                            case 881201889: {
                                var1_5 = (kM)var2_6;
                                ** break;
                            }
                            case -746894506: {
                                var4_4 ^= var5_2 ^ -489248776;
                                ** GOTO lbl21
                            }
lbl19:
                            // 1 sources

                            var4_4 ^= -1062415308;
                            ** GOTO lbl28
lbl21:
                            // 1 sources

                            var5_2 = (var3_1 | var6) ^ -298411622;
                            ** GOTO lbl26
                            case 340165351: {
                                var4_4 ^= var5_2 ^ -722839853;
                                var5_2 = (var3_1 | var6) ^ 1129965855;
                            }
lbl26:
                            // 3 sources

                            default: {
                                continue block23;
                            }
lbl28:
                            // 1 sources

                            if (!var1_5.isFreecamActive()) continue block22;
                            var4_4 ^= 833481902;
                            v0 = true;
                            break block36;
                            case -1712758172: 
                        }
                        v0 = false;
                    }
                    var4_4 ^= 332517945;
                    return v0;
                }
                break;
            }
            block24: while (true) {
                var5_2 = (var3_1 | var6) ^ -22551972;
                if (true) ** GOTO lbl42
                block25: while (true) {
                    var5_2 = (var3_1 | var6) ^ -1872241815;
lbl42:
                    // 3 sources

                    block26: while (true) {
                        switch (var5_2) {
                            case -1876150728: {
                                var5_2 = (var3_1 | var6) ^ -1254098708;
                                continue block26;
                            }
                            case 705167209: {
                                var4_4 ^= var5_2 ^ 1310538565;
                                var5_2 = (var3_1 | var6) ^ 1861876774;
                                break;
                            }
                            case -1025506542: {
                                if (var0_3.shouldCaptureMouse()) {
                                    continue block25;
                                }
                                ** GOTO lbl69
                            }
                            case -407363433: {
                                var4_4 ^= var5_2 ^ 1925358068;
                                continue block24;
                            }
                            case 1421630196: {
                                var2_6 = mw.getInstance().getModuleByName(dz.a);
                                if (var2_6 instanceof kM) ** break;
                                ** continue;
                                var5_2 = (var3_1 | var6) ^ 1671002393;
                                ** continue;
                            }
                            case 900589137: {
                                var4_4 ^= var5_2 ^ 1082456463;
                                continue block21;
                            }
                            case 421922776: {
                                if (var0_3 != null) ** GOTO lbl71
lbl69:
                                // 2 sources

                                var5_2 = (var3_1 | var6) ^ 1114774959;
                                break;
lbl71:
                                // 1 sources

                                var5_2 = (var3_1 | var6) ^ -403452474;
                                break;
                            }
                            case -1988617822: {
                                return true;
                            }
                        }
lbl75:
                        // 5 sources

                    }
                    break;
                }
                break;
            }
        }
lbl76:
        // 1 sources

        while (true) {
            var5_2 = (var3_1 | var6) ^ 1574438039;
            ** GOTO lbl75
            break;
        }
        block29: while (true) {
            var5_2 = (var3_1 | var6) ^ 353928590;
lbl81:
            // 2 sources

            block30: while (true) {
                switch (var5_2) {
                    default: {
                        continue block30;
                    }
                    case 1657241200: {
                        var0_3 = z.r.a.get();
                        ** continue;
                    }
                    case -2059818996: {
                        var4_4 ^= var5_2 ^ 1784965510;
                        continue block29;
                    }
                    case 205799096: 
                }
                var5_2 = (var3_1 | var6) ^ -219786254;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void gx() {
        block44: {
            var11_1 = -312466489;
            var8_2 = dz.c & -312466489 ^ -1512747503;
            var10_3 = 0;
            var9_9 = (var8_2 | var11_1) ^ 999937381;
            var10_3 = (var8_2 | var11_1) ^ -1551800125;
            break block44;
lbl7:
            // 1 sources

            while (true) {
                var10_3 = (var8_2 | var11_1) ^ -1881733402;
                if (true) ** GOTO lbl64
                break;
            }
            block30: while (true) {
                var10_3 = (var8_2 | var11_1) ^ 886310543;
                if (true) ** GOTO lbl79
                block31: while (true) {
                    switch (var10_3) {
                        case -1936079910: {
                            var9_9 ^= var10_3 ^ -442230873;
                            ** break;
                        }
                        case 259551452: {
                            if (var3_6[1] != 0.0) ** GOTO lbl45
                            var10_3 = (var8_2 | var11_1) ^ -988314680;
                            ** GOTO lbl47
                        }
                        case 703118857: {
                            var9_9 ^= var10_3 ^ 1252839702;
                            var10_3 = (var8_2 | var11_1) ^ 1141067375;
                            ** GOTO lbl47
                        }
lbl26:
                        // 1 sources

                        var10_3 = (var8_2 | var11_1) ^ -1984888680;
                        continue block31;
                        case 685960223: {
                            var9_9 ^= var10_3 ^ 1250593540;
                            var10_3 = (var8_2 | var11_1) ^ -908664480;
                            ** GOTO lbl47
                        }
                        case 0x64446F4F: {
                            var4_7 = (Double)var1_4.field_1690.method_42495().method_41753() * 0.6 + 0.2;
                            var9_9 ^= -18998249;
                            var6_8 = var4_7 * var4_7 * var4_7 * 8.0;
                            var10_3 = (var8_2 | var11_1) ^ -1021997673;
                            ** GOTO lbl64
                        }
                        case -1278109633: {
                            var10_3 = (var8_2 | var11_1) ^ -494067957;
                            ** GOTO lbl47
                        }
                        case -1443487304: {
                            if (var3_6[0] == 0.0) {
                                var10_3 = (var8_2 | var11_1) ^ 1579481064;
                                continue block31;
                            }
lbl45:
                            // 3 sources

                            var10_3 = (var8_2 | var11_1) ^ 1634511885;
                            continue block31;
                        }
lbl47:
                        // 6 sources

                        while (true) {
                            default: {
                                continue block31;
                            }
                            break;
                        }
lbl50:
                        // 1 sources

                        while (true) {
                            var10_3 = (var8_2 | var11_1) ^ 388273174;
                            if (true) ** GOTO lbl64
                            break;
                        }
lbl53:
                        // 1 sources

                        while (true) {
                            var10_3 = (var8_2 | var11_1) ^ -1004678690;
                            ** continue;
                            break;
                        }
lbl56:
                        // 1 sources

                        while (true) {
                            var10_3 = (var8_2 | var11_1) ^ 2121828367;
                            break block44;
lbl59:
                            // 1 sources

                            while (true) {
                                var10_3 = (var8_2 | var11_1) ^ 1923283975;
                                ** GOTO lbl79
                                break;
                            }
                            break;
                        }
                        while (true) {
                            var10_3 = (var8_2 | var11_1) ^ -1993875809;
lbl64:
                            // 4 sources

                            block38: while (true) {
                                switch (var10_3) {
                                    default: {
                                        continue block38;
                                    }
                                    case -86901823: {
                                        return;
                                    }
                                    case 1691529544: {
                                        var2_5.method_5872(var3_6[0] * var6_8, var3_6[1] * var6_8);
                                        ** continue;
                                    }
                                    case 1646422321: {
                                        var9_9 ^= var10_3 ^ 1037975471;
                                        ** continue;
                                    }
                                    case 786489920: 
                                }
                                break;
                            }
                            var9_9 ^= var10_3 ^ -725209872;
                        }
lbl79:
                        // 2 sources

                        block39: while (true) {
                            switch (var10_3) {
                                case -1621650480: {
                                    var9_9 ^= var10_3 ^ -1215262036;
                                    var10_3 = (var8_2 | var11_1) ^ 191936702;
                                    continue block39;
                                }
                                case 356165569: {
                                    var9_9 ^= var10_3 ^ 1665613441;
                                    ** GOTO lbl102
                                }
                                case -652121768: {
                                    var3_6 = this.a.step(0.05);
                                    ** continue;
                                }
                                case 1369546022: {
                                    var9_9 ^= var10_3 ^ 2001756260;
                                    continue block30;
                                }
                                case -427436183: {
                                    if (var2_5 != null) ** GOTO lbl100
                                    ** break;
lbl97:
                                    // 1 sources

                                    var10_3 = (var8_2 | var11_1) ^ -120600554;
                                }
                                default: {
                                    continue block39;
                                }
lbl100:
                                // 1 sources

                                var10_3 = (var8_2 | var11_1) ^ -1135283471;
                                continue block39;
lbl102:
                                // 1 sources

                                var10_3 = (var8_2 | var11_1) ^ 126186089;
                                continue block39;
lbl104:
                                // 1 sources

                                while (true) {
                                    var2_5 = var1_4.field_1724;
                                    ** continue;
                                    break;
                                }
                                case -361751106: 
                            }
                            break;
                        }
                        return;
                        case 606310071: 
                    }
                    break;
                }
                break;
            }
            return;
lbl111:
            // 1 sources

            while (true) {
                var9_9 ^= -725615984;
                ** continue;
                break;
            }
        }
        block42: while (true) {
            switch (var10_3) {
                default: {
                    continue block42;
                }
                case -1819416616: {
                    var1_4 = class_310.method_1551();
                    ** continue;
                }
                case -450383861: {
                    var9_9 ^= var10_3 ^ -1111477930;
                    ** continue;
                }
                case 1316226836: 
            }
            var10_3 = (var8_2 | var11_1) ^ 148037596;
        }
    }

    /*
     * Exception decompiling
     */
    public boolean holdCurrent(Object var1_1) {
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
    public void tick() {
        block54: {
            block53: {
                block48: {
                    block50: {
                        block49: {
                            block51: {
                                block52: {
                                    break block49;
lbl1:
                                    // 2 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -547039343;
                                        ** GOTO lbl27
lbl4:
                                        // 1 sources

                                        while (true) {
                                            this.a = 0;
                                            ** GOTO lbl43
                                            break;
                                        }
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 785803688;
                                            ** GOTO lbl27
lbl10:
                                            // 1 sources

                                            while (true) {
                                                var2_4 ^= var3_3 ^ 156002097;
                                                ** GOTO lbl45
                                                break;
                                            }
lbl13:
                                            // 1 sources

                                            while (true) {
                                                var2_4 ^= var3_3 ^ 1203293607;
                                                ** GOTO lbl47
                                                break;
                                            }
lbl16:
                                            // 1 sources

                                            while (true) {
                                                var3_3 = (var1_2 | var4_1) ^ 897000983;
                                                ** GOTO lbl27
lbl19:
                                                // 1 sources

                                                while (true) {
                                                    this.a = 0;
                                                    ** GOTO lbl127
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
lbl22:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 1580923795;
                                            ** GOTO lbl27
                                            break;
                                        }
                                        break;
                                    }
                                    block37: while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -122190311;
lbl27:
                                        // 21 sources

                                        block38: while (true) {
                                            switch (var3_3) lbl-1000:
                                            // 7 sources

                                            {
                                                default: {
                                                    continue block38;
                                                }
                                                case 513301869: {
                                                    ** continue;
                                                }
                                                case -577295368: {
                                                    break block48;
                                                }
                                                case -28223359: {
                                                    ** continue;
                                                }
                                                case -1735304774: {
                                                    ** continue;
                                                }
                                                case -710815417: {
                                                    break;
                                                }
                                                case 805136899: {
                                                    ** continue;
                                                }
lbl43:
                                                // 1 sources

                                                var3_3 = (var1_2 | var4_1) ^ -1521798645;
                                                ** GOTO lbl-1000
lbl45:
                                                // 1 sources

                                                var3_3 = (var1_2 | var4_1) ^ 792684741;
                                                ** GOTO lbl-1000
lbl47:
                                                // 1 sources

                                                var3_3 = (var1_2 | var4_1) ^ 1360168908;
                                                ** GOTO lbl-1000
lbl49:
                                                // 4 sources

                                                while (true) {
                                                    var3_3 = (var1_2 | var4_1) ^ -1536618383;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case 550835804: {
                                                    var2_4 ^= var3_3 ^ -228799;
                                                    break block37;
                                                }
                                                case -628687426: {
                                                    var2_4 ^= var3_3 ^ 1483879571;
                                                    break;
                                                }
lbl58:
                                                // 1 sources

                                                while (true) {
                                                    var3_3 = (var1_2 | var4_1) ^ -1420936056;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case 65101697: {
                                                    if (this.a == null) ** GOTO lbl1
                                                    break;
                                                }
                                                case 1957720729: {
                                                    var2_4 ^= var3_3 ^ 804327082;
                                                    break;
                                                }
                                                case 1268304856: {
                                                    this.gx();
                                                    ** GOTO lbl49
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ 1934795664;
                                    ** GOTO lbl27
                                    {
                                        case -2062679785: {
                                            ** continue;
                                        }
                                    }
lbl74:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -69079848;
                                        ** GOTO lbl27
                                        break;
                                    }
                                    {
                                        case 1231680759: {
                                            break;
                                        }
                                        case -1584711074: {
                                            var2_4 ^= var3_3 ^ 1605124777;
                                            break block50;
                                        }
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ 1419733618;
                                    ** GOTO lbl27
                                    {
                                        case -1626197532: {
                                            ** continue;
                                        }
                                        case -609951804: {
                                            var2_4 ^= var3_3 ^ 741088784;
                                            break block51;
                                        }
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ 2098115150;
                                    ** GOTO lbl27
                                    {
                                        case 1372620042: {
                                            if (this.gz()) {
                                                ** continue;
                                            }
                                            break block52;
                                        }
                                        case 1345946727: {
                                            if (!this.a) {
                                                ** continue;
                                            }
                                            break block53;
                                        }
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ -503456725;
                                    ** GOTO lbl27
                                }
                                var3_3 = (var1_2 | var4_1) ^ -427903883;
                                ** GOTO lbl27
                            }
                            var3_3 = (var1_2 | var4_1) ^ -714568095;
                            ** GOTO lbl27
                        }
                        var4_1 = 2095525060;
                        var1_2 = dz.c & 2095525060 ^ 512476555;
                        var3_3 = 0;
                        var2_4 = (var1_2 | var4_1) ^ 1913172481;
                        var3_3 = (var1_2 | var4_1) ^ -1552366025;
                        ** GOTO lbl27
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1618456738;
                    ** GOTO lbl27
                    {
                        case -1417190482: {
                            return;
                        }
                    }
lbl119:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 931535160;
                        ** GOTO lbl27
                        break;
                    }
                    {
                        case 712017853: {
                            if (!dz.mousePipelineBlocked()) ** GOTO lbl49
                            ** continue;
                        }
                        case 230510175: {
                            if (this.a < dz.gy((var2_4 | var3_3 ^ 1901748891) ^ (var3_3 ^ 2116377038), (var1_2 | var3_3 ^ 1901748891) ^ ((var2_4 | var3_3 ^ 1901748891) ^ (var3_3 ^ 1097429594)))) ** continue;
lbl127:
                            // 3 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 174038870;
                                ** GOTO lbl-1000
                                break;
                            }
                        }
                        case -932141351: {
                            ++this.a;
                            ** continue;
                        }
                        case -1204505859: {
                            if (!this.a) ** GOTO lbl49
                            ** continue;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ -1627782631;
                    ** GOTO lbl27
                    {
                        case -535433258: {
                            return;
                        }
                    }
lbl140:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -774210236;
                        ** GOTO lbl27
                        break;
                    }
                    {
                        case -1355444085: {
                            if (this.a != null) ** break;
                            ** continue;
                            ** continue;
                        }
                        case -2041025578: {
                            break block54;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ -958701774;
                    ** GOTO lbl27
                }
                var3_3 = (var1_2 | var4_1) ^ -996309205;
                ** GOTO lbl27
            }
            var3_3 = (var1_2 | var4_1) ^ -2134985394;
            ** GOTO lbl27
            {
                ** case -1166906652:
            }
lbl158:
            // 1 sources

            var2_4 ^= var3_3 ^ -1182542488;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ -1231074538;
        ** while (true)
    }

    private static int gy(int n2, int n3) {
        int n4 = -1505062547;
        int n5 = 625279341;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x2920283A)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xA74F7A61;
        n6 -= (n5 | n4) ^ 0xA74F2B8E;
        n6 += (n5 | n4) ^ 0xA74FC12B;
        n6 += (n5 | n4) ^ 0xA74F0A82;
        n6 -= (n5 | n4) ^ 0xA74FA407;
        n6 += (n5 | n4) ^ 0xA74F1D07;
        n6 += (n5 | n4) ^ 0xA74F33CB;
        n6 -= (n5 | n4) ^ 0xA74FCCC8;
        n6 ^= (n5 | n4) ^ 0xA74FD2E8;
        return n6 ^= (n5 | n4) ^ 0xA74FBD01;
    }

    /*
     * Exception decompiling
     */
    private boolean gz() {
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
    public boolean reachedTarget() {
        block22: {
            block24: {
                block21: {
                    block20: {
                        block19: {
                            block23: {
                                break block23;
lbl1:
                                // 1 sources

                                while (true) {
                                    if (this.a < 2) break block19;
                                    break block20;
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 1341443453;
                                    break block21;
                                    break;
                                }
lbl7:
                                // 1 sources

                                return v0;
                            }
                            var4_1 = 549926063;
                            var1_2 = dz.c & 549926063 ^ 53302189;
                            var3_3 = 0;
                            break block24;
                        }
                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -214323532;
                            break block22;
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1293444662;
                    break block22;
                }
                var3_3 = (var1_2 | var4_1) ^ -439117856;
                break block22;
lbl24:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1744658103;
                    break block22;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -237697537;
                    ** continue;
                    break;
                }
lbl30:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1678901971;
                    break block22;
                    break;
                }
            }
            var2_4 = (var1_2 | var4_1) ^ 85813553;
            var3_3 = (var1_2 | var4_1) ^ 30587528;
        }
        block18: while (true) {
            block25: {
                block26: {
                    switch (var3_3) {
                        default: {
                            continue block18;
                        }
                        case 293788138: {
                            ** continue;
                        }
                        case 1861685657: {
                            ** continue;
                        }
                        case 1207793020: {
                            break;
                        }
                        case -791226085: {
                            ** continue;
                        }
                        case 574475559: {
                            break block25;
                        }
                        case 836544045: {
                            var2_4 ^= var3_3 ^ -1722201692;
                            break block26;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 846048837;
                    continue;
                }
                var3_3 = (var1_2 | var4_1) ^ 1931318528;
                continue;
                {
                    case 1358095023: {
                        if (!this.a) ** continue;
                        ** continue;
                    }
                    case -969088945: {
                        v0 = true;
                        break block18;
                    }
                    ** case -1142040858:
                }
lbl66:
                // 1 sources

                v0 = false;
                break;
            }
            var3_3 = (var1_2 | var4_1) ^ 305385858;
        }
        var2_4 ^= -2006395160;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float serverYaw() {
        int n2 = c & 0xBA696E8D ^ 0xA8C84CA9;
        int n3 = 0;
        int n4 = (n2 | 0xBA696E8D) ^ 0xB7FBA0E8;
        n3 = (n2 | 0xBA696E8D) ^ 0xC57EDE16;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -982910988: {
                    return ko.wireYaw();
                }
                case 2140647611: {
                    n3 = (n2 | 0xBA696E8D) ^ 0xE178D596;
                    continue block5;
                }
                case 1536277307: 
            }
            n4 ^= n3 ^ 0x2F418FA8;
            n3 = (n2 | 0xBA696E8D) ^ 0x7F809959;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static float serverPitch() {
        int n2 = c & 0xA74E4A70 ^ 0x5749D4C4;
        int n3 = 0;
        int n4 = (n2 | 0xA74E4A70) ^ 0xC9AF0F15;
        n3 = (n2 | 0xA74E4A70) ^ 0x7579791F;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -2110347285: {
                    n3 = (n2 | 0xA74E4A70) ^ 0x2271CE85;
                    continue block5;
                }
                case -717352847: {
                    n4 ^= n3 ^ 0xCCB2A318;
                    n3 = (n2 | 0xA74E4A70) ^ 0xEBDFF1B4;
                    continue block5;
                }
                case 479211328: 
            }
            break;
        }
        return ko.wirePitch();
    }

    /*
     * Unable to fully structure code
     */
    public boolean active() {
        block26: {
            block29: {
                block28: {
                    break block28;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 392159170;
                        break block26;
                        break;
                    }
                }
                var4_1 = 1409249146;
                var1_2 = dz.c & 1409249146 ^ 1658637034;
                var3_3 = 0;
                break block29;
lbl9:
                // 1 sources

                while (true) {
                    block27: {
                        var3_3 = (var1_2 | var4_1) ^ -1333139162;
                        break block26;
lbl12:
                        // 1 sources

                        while (true) {
                            v0 = false;
                            break block27;
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1169732279;
                            break block26;
                            break;
                        }
                    }
lbl19:
                    // 2 sources

                    while (true) {
                        var2_4 ^= 1229007349;
                        return v0;
                    }
                    break;
                }
lbl22:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 423717521;
                    break block26;
lbl25:
                    // 2 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 363092104;
                        break block26;
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 604889168;
                        break block26;
                        break;
                    }
lbl31:
                    // 1 sources

                    while (true) {
                        if (!this.a.active()) ** GOTO lbl25
                        ** continue;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -391970326;
                        break block26;
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 626240772;
                    break block26;
                    break;
                }
            }
            var2_4 = (var1_2 | var4_1) ^ -1326253333;
            var3_3 = (var1_2 | var4_1) ^ 765187876;
            break block26;
lbl44:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ 1807246270;
                ** continue;
                break;
            }
lbl47:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ -1000638849;
                ** continue;
                break;
            }
lbl50:
            // 1 sources

            while (true) {
                if (this.a != null) ** break;
                ** continue;
                ** continue;
                break;
            }
        }
        block25: while (true) {
            switch (var3_3) {
                default: {
                    continue block25;
                }
                case 1688219704: {
                    ** continue;
                }
                case 1790870891: {
                    ** continue;
                }
                case 1583626462: {
                    ** continue;
                }
                case 1717286770: {
                    ** continue;
                }
                case -910646605: {
                    ** continue;
                }
                case 1454129918: {
                    ** continue;
                }
                case -1688408560: {
                    v0 = true;
                    ** continue;
                }
                case 1475481514: {
                    ** continue;
                }
                case -1015675172: 
            }
            break;
        }
        var2_4 ^= var3_3 ^ 1175397380;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public boolean preempted() {
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

