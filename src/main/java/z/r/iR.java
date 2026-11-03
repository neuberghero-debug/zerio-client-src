/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_11905
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;
import z.r.W;
import z.r.aU;
import z.r.ap;
import z.r.dj;
import z.r.dm;
import z.r.fu;
import z.r.gj;
import z.r.gn;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public abstract class iR
extends class_437 {
    protected final dj a;
    private boolean a;
    private boolean b;
    private long a;
    private boolean c;
    private class_437 a;
    private static final /* synthetic */ String a;
    private boolean d;
    private static final int[] b;
    public static final int b;
    private String b;
    private static final /* synthetic */ String c;
    protected W a;
    private float a;
    private static final float b;
    private String d;
    private String e;
    private float c;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    protected iR(String var1_1) {
        var5_2 = 245545695;
        var2_3 = iR.b & 245545695 ^ -1893931814;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -1825484364;
        var3_5 ^= -432244954;
        super((class_2561)class_2561.method_43470((String)var1_1));
        var4_4 = (var2_3 | var5_2) ^ -1320160506;
        if (true) ** GOTO lbl11
        block6: while (true) {
            var4_4 = (var2_3 | var5_2) ^ -377443847;
lbl11:
            // 2 sources

            block7: while (true) {
                switch (var4_4) {
                    case 1715361574: {
                        this.a = new dj(0.0f);
                        var4_4 = (var2_3 | var5_2) ^ 1193668192;
                        ** break;
                    }
                    case 1055985113: {
                        var3_5 ^= var4_4 ^ 735347791;
                        continue block6;
                    }
                    case -929361729: {
                        var3_5 ^= var4_4 ^ 1271316571;
                        var4_4 = (var2_3 | var5_2) ^ 2029652041;
                    }
lbl23:
                    // 3 sources

                    default: {
                        continue block7;
                    }
                    case -146475370: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setReturnTo(class_437 class_4372) {
        int n2 = 256514865;
        int n3 = b & 0xF4A1B31 ^ 0x2338FF35;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xE2E45D3;
        n4 = (n3 | n2) ^ 0x7D642825;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1303609892: {
                    this.a = class_4372;
                    n4 = (n3 | n2) ^ 0x35D9EBCD;
                    continue block7;
                }
                case 446895352: {
                    n5 ^= n4 ^ 0x57279817;
                    n4 = (n3 | n2) ^ 0xB2F46D72;
                    continue block7;
                }
                case -1235045500: {
                    n5 ^= n4 ^ 0xE19BD23E;
                    n4 = (n3 | n2) ^ 0x9D3682E9;
                    continue block7;
                }
                case -1651600825: {
                    return;
                }
                case 1377752848: 
            }
            n4 = (n3 | n2) ^ 0x99184CB1;
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void method_25426() {
        block38: {
            block37: {
                block39: {
                    var4_1 = 2145082514;
                    var1_2 = iR.b & 2145082514 ^ 1066475735;
                    var3_3 = 0;
                    ** GOTO lbl52
lbl5:
                    // 7 sources

                    block24: while (true) {
                        switch (var3_3) lbl-1000:
                        // 12 sources

                        {
                            while (true) {
                                default: {
                                    continue block24;
                                }
                                break;
                            }
lbl10:
                            // 2 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1051887781;
                                ** GOTO lbl-1000
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1641935909;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -915985839: {
                                var2_4 ^= var3_3 ^ -172861068;
                                ** GOTO lbl10
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 812165621;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -1393244630: {
                                this.a.to(1.0f, iR.b((var2_4 | var3_3 ^ -751854920) ^ (var3_3 ^ 1405401141), (var1_2 | var3_3 ^ -751854920) ^ ((var2_4 | var3_3 ^ -751854920) ^ (var3_3 ^ -1004553805))), aU.c);
                                break block24;
                            }
                            case -1240281017: {
                                fu.play(ap.u);
                                break block37;
                            }
lbl29:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -97134985;
                                ** GOTO lbl-1000
                                break;
                            }
lbl32:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1445301422;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 1315092934: {
                                super.method_25426();
                                ** continue;
                            }
lbl38:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 830531840;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 503744754: {
                                var2_4 ^= var3_3 ^ -236883239;
                                break block38;
                            }
lbl44:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -545880120;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -1599210721: {
                                return;
                            }
                            case 1314624983: {
                                this.a = true;
                                ** continue;
                            }
lbl52:
                            // 1 sources

                            var2_4 = (var1_2 | var4_1) ^ -615471644;
                            var3_3 = (var1_2 | var4_1) ^ 301118654;
                            ** GOTO lbl-1000
                            case -2047956320: {
                                var2_4 ^= var3_3 ^ 365070381;
                                var3_3 = (var1_2 | var4_1) ^ -1362002711;
                                ** GOTO lbl-1000
                            }
                            case -787873730: {
                                if (this.a) break block37;
                                break;
                            }
lbl62:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -909529968;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 1848232041: {
                                ** continue;
                            }
lbl67:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1137701564;
                                ** continue;
                                break;
                            }
                            case 704573561: {
                                break block39;
                            }
                            case 1007980139: {
                                var2_4 ^= var3_3 ^ 956766419;
                                break block39;
                            }
                            case 697989043: {
                                var2_4 ^= var3_3 ^ 235823599;
                                ** continue;
                            }
                        }
                        break;
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1447103332;
                    ** GOTO lbl5
                }
                var3_3 = (var1_2 | var4_1) ^ 157078134;
                ** GOTO lbl5
lbl83:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 834258193;
                    ** GOTO lbl5
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 1389993561;
            ** GOTO lbl5
        }
        var3_3 = (var1_2 | var4_1) ^ -751846659;
        ** GOTO lbl5
        {
            case -446208756: {
                var2_4 ^= var3_3 ^ 756320635;
                ** continue;
            }
            case 755163790: {
                var2_4 ^= var3_3 ^ -297339818;
                ** continue;
            }
        }
lbl98:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1229171066;
            ** GOTO lbl5
            break;
        }
        {
            case 1097462898: {
                ** continue;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ -1698948645;
        ** while (true)
        {
            case 1337185570: {
                var2_4 ^= var3_3 ^ 1313064260;
                ** continue;
            }
            ** case 1988603553:
        }
lbl109:
        // 1 sources

        switch (var2_4) {
            case 1584821594: {
                ** continue;
            }
            case -1737739530: {
                ** continue;
            }
            ** default:
lbl115:
            // 1 sources

            ** continue;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    protected float uiScale() {
        var6_1 = 384954431;
        var3_2 = iR.b & 384954431 ^ 311510985;
        var5_3 = 0;
        var4_6 = (var3_2 | var6_1) ^ 841158617;
        var5_3 = (var3_2 | var6_1) ^ -2006694300;
        ** GOTO lbl37
lbl7:
        // 1 sources

        while (true) {
            var5_3 = (var3_2 | var6_1) ^ 328992794;
            ** GOTO lbl16
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var5_3 = (var3_2 | var6_1) ^ 107753285;
            if (true) ** GOTO lbl16
            break;
        }
        while (true) {
            block18: {
                var5_3 = (var3_2 | var6_1) ^ 1486331723;
                break block18;
lbl16:
                // 2 sources

                block14: while (true) {
                    switch (var5_3) {
                        case -1374014690: {
                            var4_6 ^= var5_3 ^ 902665679;
                            ** continue;
                        }
                        case 1634602871: {
                            var4_6 ^= var5_3 ^ 1510373368;
                            ** continue;
                        }
                        case 91095013: {
                            var2_5 = Math.max(0.72f, Math.min(2.6f, var2_5));
                            var5_3 = (var3_2 | var6_1) ^ 2006972552;
                            continue block14;
                        }
lbl28:
                        // 2 sources

                        while (true) {
                            default: {
                                continue block14;
                            }
                            break;
                        }
                        case 278780090: {
                            return dm.getGuiScale() * var2_5;
                        }
lbl33:
                        // 1 sources

                        while (true) {
                            var2_5 = (float)var1_4.method_22683().method_4507() / 1080.0f;
                            var5_3 = (var3_2 | var6_1) ^ -1192508191;
                            ** continue;
                            break;
                        }
                    }
                    break;
                }
            }
            block17: while (true) {
                switch (var5_3) {
                    default: {
                        continue block17;
                    }
                    case -1634356837: {
                        var5_3 = (var3_2 | var6_1) ^ -348853724;
                        continue block17;
                    }
                    case 1315334324: {
                        var1_4 = class_310.method_1551();
                        var4_6 ^= 512055773;
                        ** continue;
                    }
                    case -37413413: 
                }
                break;
            }
            var4_6 ^= var5_3 ^ -1966521019;
        }
    }

    /*
     * Exception decompiling
     */
    public void method_25420(class_332 var1_1, int var2_2, int var3_3, float var4_4) {
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
     * Enabled aggressive block sorting
     */
    protected float[] backdropCutout() {
        int n2 = b & 0x3700B471 ^ 0x78ABA06F;
        int n3 = 0;
        int n4 = (n2 | 0x3700B471) ^ 0xA7F26749;
        n3 = (n2 | 0x3700B471) ^ 0xCCA6C764;
        block5: while (true) {
            switch (n3) {
                case -1290964197: {
                    n3 = (n2 | 0x3700B471) ^ 0xE1ED3B26;
                    continue block5;
                }
                case -1639542951: {
                    n4 ^= n3 ^ 0x840F5C04;
                    n3 = (n2 | 0x3700B471) ^ 0x827B23DA;
                }
                default: {
                    continue block5;
                }
                case -36661339: 
            }
            break;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    protected void method_57734(class_332 var1_1) {
        block47: {
            block45: {
                block46: {
                    block48: {
                        block49: {
                            var5_2 = -338406211;
                            var2_3 = iR.b & -338406211 ^ -971619918;
                            var4_4 = 0;
                            ** GOTO lbl58
lbl5:
                            // 1 sources

                            block28: while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1858823064;
lbl7:
                                // 13 sources

                                block29: while (true) {
                                    switch (var4_4) lbl-1000:
                                    // 10 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block29;
                                            }
                                            break;
                                        }
lbl12:
                                        // 1 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ -216653872;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl15:
                                        // 1 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ -1737805321;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case 1989543391: {
                                            var3_5 ^= var4_4 ^ 1240501230;
                                            break;
                                        }
lbl21:
                                        // 1 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ -1240557941;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case -1709633724: {
                                            var3_5 ^= var4_4 ^ 1424483794;
                                            break block45;
                                        }
                                        case 1407972575: {
                                            var3_5 ^= var4_4 ^ -1023354674;
                                            break block28;
                                        }
lbl30:
                                        // 1 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ 1152817432;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl33:
                                        // 1 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ 705710192;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case 1507377972: {
                                            break;
                                        }
lbl38:
                                        // 1 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ 1976523515;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case -155770816: {
                                            return;
                                        }
lbl43:
                                        // 2 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ 1196956578;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case 716098075: {
                                            ** continue;
                                        }
                                        case -1365274092: {
                                            break block45;
                                        }
                                        case 929312993: {
                                            super.method_57734(var1_1);
                                            break block46;
                                        }
                                        case 482364015: {
                                            return;
                                        }
                                        case 2038632120: {
                                            if (this.backdropCutout() == null) break;
                                            break block47;
                                        }
lbl58:
                                        // 1 sources

                                        var3_5 = (var2_3 | var5_2) ^ -840194769;
                                        ** continue;
lbl60:
                                        // 1 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ -1136811680;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl63:
                                        // 1 sources

                                        while (true) {
                                            var4_4 = (var2_3 | var5_2) ^ 1836773226;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
lbl66:
                            // 2 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -981950556;
                                ** GOTO lbl7
                                break;
                            }
                            {
                                case -2102609195: {
                                    return;
                                }
                                case 1829651699: {
                                    var3_5 ^= var4_4 ^ -626112915;
                                    break block48;
                                }
                            }
lbl74:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1431841843;
                                ** GOTO lbl7
                                break;
                            }
                            {
                                case 396510122: {
                                    var3_5 ^= var4_4 ^ 1672225531;
                                    break block49;
                                }
                                case 618677090: {
                                    if (!this.c) ** GOTO lbl43
                                    ** continue;
                                }
                                case -1165067892: {
                                    ** continue;
                                }
                                case 486160508: {
                                    switch (var3_5) {
                                        case 1719345783: {
                                            ** continue;
                                        }
                                        default: {
                                            ** continue;
                                        }
                                        ** case -987062225:
lbl92:
                                        // 1 sources

                                        ** continue;
                                    }
                                }
                                case -1419719513: {
                                    var3_5 ^= var4_4 ^ -1548120470;
                                    ** continue;
                                }
                            }
                            var4_4 = (var2_3 | var5_2) ^ -1723838368;
                            ** GOTO lbl7
                        }
                        var4_4 = (var2_3 | var5_2) ^ 1163867297;
                        ** GOTO lbl7
                    }
                    var4_4 = (var2_3 | var5_2) ^ 425817599;
                    ** GOTO lbl7
                }
lbl105:
                // 2 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -2099769012;
                    ** GOTO lbl7
                    break;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ -215192125;
            ** GOTO lbl7
        }
        var4_4 = (var2_3 | var5_2) ^ 1095354283;
        ** GOTO lbl7
        {
            case 2008900680: {
                if (this.a.done()) ** break;
                ** continue;
                ** continue;
            }
            case -2128792025: {
                var3_5 ^= var4_4 ^ 693515572;
                ** continue;
            }
        }
        var4_4 = (var2_3 | var5_2) ^ -885647651;
        ** GOTO lbl7
lbl123:
        // 1 sources

        while (true) {
            var4_4 = (var2_3 | var5_2) ^ -1772791033;
            ** GOTO lbl7
            break;
        }
lbl126:
        // 1 sources

        while (true) {
            var4_4 = (var2_3 | var5_2) ^ -659397282;
            ** GOTO lbl7
            break;
        }
        {
            case -1467068899: {
                var3_5 ^= var4_4 ^ 1895796883;
                ** continue;
            }
        }
        var4_4 = (var2_3 | var5_2) ^ -126609899;
        ** while (true)
        {
            case -976871985: {
                ** continue;
            }
            ** case -1433837282:
        }
lbl137:
        // 1 sources

        ** while (!(dm.getBlurIntensity() > 0.01f))
lbl138:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void method_25394(class_332 var1_1, int var2_2, int var3_3, float var4_4) {
        block20: {
            block19: {
                block21: {
                    block18: {
                        block23: {
                            block22: {
                                break block22;
lbl1:
                                // 1 sources

                                while (true) {
                                    var7_7 = (var5_6 | var8_5) ^ -1593028676;
                                    break block18;
                                    break;
                                }
lbl4:
                                // 2 sources

                                while (true) {
                                    var7_7 = (var5_6 | var8_5) ^ -304750306;
                                    break block18;
                                    break;
                                }
                            }
                            var8_5 = -1907561954;
                            var5_6 = iR.b & -1907561954 ^ 2125399575;
                            var7_7 = 0;
                            break block23;
lbl12:
                            // 1 sources

                            while (true) {
                                var7_7 = (var5_6 | var8_5) ^ 2064733601;
                                break block18;
lbl15:
                                // 1 sources

                                while (true) {
                                    var6_8 ^= var7_7 ^ 1516656065;
                                    ** continue;
                                    break;
                                }
lbl18:
                                // 1 sources

                                while (true) {
                                    var6_8 ^= var7_7 ^ 2114966162;
                                    var7_7 = (var5_6 | var8_5) ^ -141044332;
                                    break block18;
                                    break;
                                }
                                break;
                            }
                        }
                        var6_8 = (var5_6 | var8_5) ^ -722362453;
                        var7_7 = (var5_6 | var8_5) ^ 905433554;
                        break block18;
lbl26:
                        // 1 sources

                        while (true) {
                            break block19;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            if (gn.available()) ** GOTO lbl4
                            break block20;
                            break;
                        }
                    }
lbl32:
                    // 3 sources

                    block16: while (true) {
                        switch (var7_7) {
                            default: {
                                continue block16;
                            }
                            case 692311384: {
                                ** continue;
                            }
                            case 322572033: {
                                ** continue;
                            }
                            case -887603251: {
                                break block21;
                            }
                            case 1608753571: {
                                ** continue;
                            }
                            case -2046903362: {
                                ** continue;
                            }
                            case 158874507: {
                                return;
                            }
                            case 1012999629: {
                                var6_8 ^= var7_7 ^ 1128397906;
                                break;
                            }
                        }
                        ** continue;
                        break;
                    }
lbl52:
                    // 1 sources

                    while (true) {
                        var6_8 ^= 634934291;
                        var1_1.method_27534(this.field_22793, (class_2561)class_2561.method_43470((String)iR.a), this.field_22789 / 2, this.field_22790 / 2, iR.b((v0 | var8_5) ^ 2116046833, (var5_6 | var8_5) ^ ((v1 | var8_5) ^ 1864859612)));
                        ** continue;
                        break;
                    }
                }
                var7_7 = (var5_6 | var8_5) ^ -676578489;
                ** GOTO lbl32
            }
            v0 = var6_8 ^= 1526238604;
            v1 = var6_8;
            ** while (true)
        }
        var7_7 = (var5_6 | var8_5) ^ -1030829102;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean method_25421() {
        var1_1 = iR.b & 229533589 ^ 1554509719;
        var3_2 = 0;
        if (true) ** GOTO lbl14
        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
                case 1853660772: {
                    ** GOTO lbl19
                }
lbl11:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 229533589) ^ 869495283;
                    ** GOTO lbl-1000
                    break;
                }
lbl14:
                // 1 sources

                var2_3 = (var1_1 | 229533589) ^ -1074008465;
                ** continue;
lbl16:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 229533589) ^ -697496383;
                    ** GOTO lbl-1000
                    break;
                }
lbl19:
                // 1 sources

                var3_2 = (var1_1 | 229533589) ^ 1088080692;
                ** continue;
                case -1950162090: {
                    return false;
                }
                case 494216355: 
            }
            break;
        }
        var2_3 ^= var3_2 ^ -482845570;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public final void renderNvg(W var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    protected abstract void renderContent(W var1);

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block28: {
            var9 = -259233052;
            var8_1 = 1906034888;
            iR.b = mK.a(MethodHandles.lookup().lookupClass(), -2075370564);
            var7_2 = 0;
            var6_9 = 1298785764;
            var7_2 = var8_1 ^ 928436356;
            ** GOTO lbl48
lbl8:
            // 2 sources

            while (true) {
                var5_8 = (var0_3[var3_6] & (((var6_9 ^= 712097731) | var8_1) ^ 1944051249)) << ((var6_9 | var8_1) ^ 1944051414) | (var0_3[var3_6 + 1] & ((var6_9 | var8_1) ^ 1944051249)) << ((var6_9 | var8_1) ^ 1944051422) | (var0_3[var3_6 + 2] & ((var6_9 | var8_1) ^ 1944051249)) << ((var6_9 | var8_1) ^ 1944051398) | var0_3[var3_6 + 3] & ((var6_9 | var8_1) ^ 1944051249);
                var7_2 = var8_1 ^ -392295905;
                ** GOTO lbl35
                break;
            }
lbl12:
            // 1 sources

            while (true) {
                var0_3 = "0\u00f7=mB\u0018\u00d5*\u00dfaW\f \u0084\u0010X:\u00b1\u00b6f2\"\u00c5@\u00fd$|d7\u001e\u00c8\u009f\u00ea\u0012\u008ej\u00fe\u00c4C\u00e6\u00fe\u0016\u0094\u00d1\u009a\u00854X_J^\u000eh\u00dc\u009f0\u00fa\u00d0_\u00c6".getBytes("ISO-8859-1");
                var6_9 ^= -1956423513;
                var1_4 = var0_3.length / 4;
                var7_2 = var8_1 ^ -555330004;
                break block28;
                break;
            }
lbl18:
            // 1 sources

            while (true) {
                var4_7 = 0;
                ** GOTO lbl8
                break;
            }
            {
                var7_2 = var8_1 ^ 11498401;
                block23: while (true) {
                    switch (var7_2) {
                        case -1727675689: {
                            var6_9 ^= var7_2 ^ 1755796268;
                            continue block22;
                        }
                        case 697884761: {
                            var3_6 += 4;
                            if (++var4_7 >= var1_4) ** break;
                            ** continue;
                            ** break;
                        }
                        case 1387891066: {
                            var6_9 ^= var7_2 ^ 451315860;
                            var7_2 = var8_1 ^ var9;
                        }
lbl35:
                        // 3 sources

                        default: {
                            continue block23;
                        }
                        case 2060760322: {
                            var6_9 ^= var7_2 ^ -1593337030;
                            ** GOTO lbl42
                        }
lbl40:
                        // 1 sources

                        var7_2 = var8_1 ^ 589447602;
                        continue block23;
lbl42:
                        // 1 sources

                        var7_2 = var8_1 ^ 1476602001;
                        continue block23;
                        case 1899281257: {
                            iR.b[var4_7] = var5_8 ^= var2_5;
                            var7_2 = var8_1 ^ 189758922;
                            continue block23;
                        }
lbl48:
                        // 1 sources

                        block24: while (true) {
                            switch (var7_2) {
                                default: {
                                    continue block24;
                                }
                                case -789490215: {
                                    var2_5 = (var6_9 | var7_2 ^ -1586848495) ^ (var7_2 ^ 1656178043) ^ iR.b;
                                    var6_9 ^= 1353963137;
                                    ** continue;
                                }
                                case 1187846220: {
                                    var7_2 = var8_1 ^ -947012005;
                                    continue block24;
                                }
                                case -1240041837: 
                            }
                            var6_9 ^= var7_2 ^ 433577339;
                            var7_2 = var8_1 ^ -1586848495;
                        }
lbl63:
                        // 1 sources

                        while (true) {
                            var7_2 = var8_1 ^ -580878334;
                            break block28;
                            break;
                        }
                        case -2129157588: 
                    }
                    break;
                }
            }
            iR.b = 1080.0f;
            iR.a = gj.decode("aFmmN4R5WLAHqVePUraqAidcwlScUK2Be22/uDWiakIiTCivICviA5pDLuTT8wsIoDfYodk=", iR.b((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1881401858), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 256171646))));
            iR.c = gj.decode("EA==", iR.b((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1881401857), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1148056468))));
            return;
lbl71:
            // 1 sources

            while (true) {
                var6_9 ^= 663644246;
                ** continue;
                break;
            }
        }
        block27: while (true) {
            switch (var7_2) {
                default: {
                    continue block27;
                }
                case -1392817974: {
                    var6_9 ^= var7_2 ^ 744894302;
                    var7_2 = var8_1 ^ -1592370527;
                    continue block27;
                }
                case 878818419: {
                    iR.b = new int[var1_4];
                    ** continue;
                }
                case -796028311: {
                    var3_6 = 0;
                    ** continue;
                }
                case -1350721820: 
            }
            var6_9 ^= var7_2 ^ 1219113033;
            var7_2 = var8_1 ^ 1174043835;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void requestTooltip(String string, String string2) {
        int n2 = 1440361521;
        int n3 = b & 0x55DA2C31 ^ 0x48317C04;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x3368CC43;
        n4 = (n3 | n2) ^ 0x13CF7443;
        block9: while (true) {
            switch (n4) {
                default: {
                    continue block9;
                }
                case 1065955782: {
                    this.b = string2;
                    n4 = (n3 | n2) ^ 0x5D1CEBEA;
                    continue block9;
                }
                case -1029438008: {
                    return;
                }
                case 1539136188: {
                    n5 ^= n4 ^ 0x63802C2F;
                    n4 = (n3 | n2) ^ 0xCD92FC5D;
                    continue block9;
                }
                case -1872134040: {
                    this.d = string;
                    n4 = (n3 | n2) ^ 0x7B9D08DC;
                    continue block9;
                }
                case 1312032886: {
                    n4 = (n3 | n2) ^ 0x6462689;
                    continue block9;
                }
                case 644248809: {
                    n5 ^= n4 ^ 0xC0580C4D;
                    n4 = (n3 | n2) ^ 0x62724DF3;
                    continue block9;
                }
                case 15177695: 
            }
            n5 ^= n4 ^ 0x8F97331A;
            n4 = (n3 | n2) ^ 0x9F5F79FD;
        }
    }

    /*
     * Exception decompiling
     */
    private void MS(W var1_1) {
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
    public void beginClose() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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
     * Enabled aggressive block sorting
     */
    public boolean isClosing() {
        int n2 = b & 0xDAA339E9 ^ 0xA7F07E51;
        int n3 = 0;
        int n4 = (n2 | 0xDAA339E9) ^ 0x5BECF0B5;
        n3 = (n2 | 0xDAA339E9) ^ 0xDEE23FB3;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1630186587: {
                    return this.c;
                }
                case -961097335: {
                    n4 ^= n3 ^ 0x6380A9D0;
                    n3 = (n2 | 0xDAA339E9) ^ 0x9ED9D3A2;
                    continue block5;
                }
                case 554778698: 
            }
            n3 = (n2 | 0xDAA339E9) ^ 0x3945AE70;
        }
    }

    /*
     * Exception decompiling
     */
    private void MT() {
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
    public void method_25393() {
        block36: {
            block35: {
                block37: {
                    break block37;
lbl1:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1759296405;
                        ** GOTO lbl23
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        if (var1_4.field_1755 != this) ** GOTO lbl69
                        ** GOTO lbl78
lbl7:
                        // 1 sources

                        return;
                    }
                }
                var5_1 = -1035669256;
                var2_2 = iR.b & -1035669256 ^ -1197998441;
                var4_3 = 0;
                var3_5 = (var2_2 | var5_1) ^ -73762492;
                ** GOTO lbl64
lbl15:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 1400033040;
                    ** GOTO lbl23
lbl18:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 2105519552;
                        if (true) ** GOTO lbl23
                        break;
                    }
                    break;
                }
                block24: while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -1940365587;
lbl23:
                    // 6 sources

                    block25: while (true) {
                        block0 : switch (var4_3) lbl-1000:
                        // 6 sources

                        {
                            while (true) {
                                default: {
                                    continue block25;
                                }
                                break;
                            }
                            case -1718807286: {
                                ** continue;
                            }
                            case -1448791569: {
                                ** continue;
                            }
                            case 559871548: {
                                var3_5 ^= var4_3 ^ 1081559702;
                                ** GOTO lbl38
                            }
lbl35:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -901160845;
                                break block35;
                                break;
                            }
lbl38:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ 1497100768;
                            ** GOTO lbl-1000
lbl40:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -1113157106;
                                break block35;
lbl43:
                                // 1 sources

                                while (true) {
                                    var3_5 ^= var4_3 ^ -2050646283;
                                    break block0;
                                    break;
                                }
                                break;
                            }
                            case 1338089298: {
                                var3_5 ^= var4_3 ^ 527219987;
                                ** continue;
                            }
lbl49:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -498072885;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -1544810721: {
                                var1_4 = class_310.method_1551();
                                ** continue;
                            }
                            case -2019011777: {
                                var3_5 ^= var4_3 ^ -1190445649;
                                break block24;
                            }
                            case 1844755092: {
                                var3_5 ^= var4_3 ^ -1182398905;
                                continue block24;
                            }
lbl61:
                            // 1 sources

                            while (true) {
                                var1_4.method_1507(this.a);
                                ** GOTO lbl69
                                break;
                            }
lbl64:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ 1666903029;
                            ** GOTO lbl-1000
lbl66:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -611776317;
                                ** GOTO lbl-1000
                                break;
                            }
lbl69:
                            // 3 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -1256824403;
                                ** continue;
                                break;
                            }
                            case 411565108: {
                                if (!this.b) ** continue;
                                ** continue;
                            }
                            case -299301590: {
                                super.method_25393();
                                break block36;
                            }
lbl78:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ -1095577164;
                            break block35;
                        }
                        break;
                    }
                    break;
                }
                var4_3 = (var2_2 | var5_1) ^ 352254933;
                ** GOTO lbl23
            }
lbl83:
            // 2 sources

            block34: while (true) {
                switch (var4_3) {
                    default: {
                        continue block34;
                    }
                    case 823888503: {
                        ** continue;
                    }
                    case 815701644: {
                        ** continue;
                    }
                    case 1198615793: {
                        ** continue;
                    }
                    case 1147481931: {
                        ** continue;
                    }
                }
                break;
            }
        }
        var4_3 = (var2_2 | var5_1) ^ 1555278660;
        ** while (true)
        {
            case 1989124114: {
                this.b = false;
                ** continue;
            }
        }
        var4_3 = (var2_2 | var5_1) ^ -875793272;
        ** while (true)
        {
            ** case -1503373893:
        }
lbl104:
        // 1 sources

        var3_5 ^= var4_3 ^ -73653086;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void method_25419() {
        var4_1 = -174346899;
        var1_2 = iR.b & -174346899 ^ 1985284621;
        var3_3 = 0;
        ** GOTO lbl55
lbl5:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 421749987;
            ** GOTO lbl24
lbl8:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ 1244544136;
                ** GOTO lbl43
                break;
            }
            break;
        }
lbl11:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1533133603;
            ** GOTO lbl24
lbl14:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ -1914926807;
                ** GOTO lbl22
                break;
            }
            break;
        }
lbl17:
        // 1 sources

        block20: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 1894911917;
            ** GOTO lbl24
lbl20:
            // 1 sources

            return;
lbl22:
            // 1 sources

            block22: while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1336480695;
lbl24:
                // 5 sources

                block23: while (true) {
                    switch (var3_3) lbl-1000:
                    // 6 sources

                    {
                        while (true) {
                            default: {
                                continue block23;
                            }
                            break;
                        }
                        case -525859141: {
                            ** continue;
                        }
                        case -1953677297: {
                            ** continue;
                        }
                        case -559433222: {
                            ** continue;
                        }
                        case -26445250: {
                            ** continue;
                        }
                        case 1396806576: {
                            this.beginClose();
                            break block20;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 393718230;
                            ** GOTO lbl-1000
                            break;
                        }
lbl43:
                        // 2 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1487649006;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -2027052864: {
                            var2_4 ^= var3_3 ^ -357548329;
                            ** continue;
                        }
lbl49:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 162780499;
                            ** GOTO lbl-1000
                            break;
                        }
lbl52:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 2085810018;
                            ** GOTO lbl-1000
                            break;
                        }
lbl55:
                        // 1 sources

                        var2_4 = (var1_2 | var4_1) ^ -588645204;
                        ** continue;
lbl57:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 695735959;
                            ** continue;
                            break;
                        }
                        case 1351346303: {
                            ** continue;
                        }
                        case -285422706: {
                            continue block22;
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ 1734304022;
        ** while (true)
        {
            case -1870606725: {
                var2_4 ^= var3_3 ^ -1753224945;
                ** continue;
            }
            ** case -1200177958:
        }
lbl70:
        // 1 sources

        switch (var2_4) {
            default: {
                ** continue;
            }
            case -36959137: {
                ** continue;
            }
            ** case -804871050:
lbl76:
            // 1 sources

            ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private float MU() {
        int n2 = b & 0xA8536A6C ^ 0xD20F4414;
        int n3 = 0;
        int n4 = (n2 | 0xA8536A6C) ^ 0xE51DA1FC;
        n3 = (n2 | 0xA8536A6C) ^ 0x59C67235;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1841081498: {
                    n4 ^= n3 ^ 0xF366C1D1;
                    n3 = (n2 | 0xA8536A6C) ^ 0xAA95DD7A;
                    continue block5;
                }
                case 1355461382: {
                    class_310 class_3102 = class_310.method_1551();
                    n4 ^= 0x445E748A;
                    return class_3102.method_22683().method_4495();
                }
                case -1550246839: 
            }
            n3 = (n2 | 0xA8536A6C) ^ 0x97E3C2E6;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean method_25402(class_11909 var1_1, boolean var2_2) {
        var4_3 = iR.b & 1158477710 ^ 1645158392;
        var6_4 = 0;
        if (true) ** GOTO lbl11
        block5: while (true) {
            var6_4 = (var4_3 | 1158477710) ^ -680233759;
lbl6:
            // 2 sources

            block6: while (true) {
                switch (var6_4) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
lbl11:
                    // 1 sources

                    var5_5 = (var4_3 | 1158477710) ^ 1157469975;
                    continue block5;
                    case -1493375064: {
                        var3_6 = this.MU();
                        break block5;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var6_4 = (var4_3 | 1158477710) ^ -1687553996;
                        ** continue;
                        break;
                    }
lbl19:
                    // 1 sources

                    return this.onMouseDown(var1_1.comp_4798() * (double)var3_6, var1_1.comp_4799() * (double)var3_6, var1_1.method_74245());
                    case -1334080737: {
                        ** continue;
                    }
                }
                break;
            }
            break;
        }
        var5_5 ^= 1877356376;
        ** while (true)
        {
            ** case -60422198:
        }
lbl26:
        // 1 sources

        var5_5 ^= var6_4 ^ -89493645;
        var6_4 = (var4_3 | 1158477710) ^ -1041033130;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean method_25406(class_11909 var1_1) {
        block8: {
            block10: {
                block9: {
                    var3_2 = iR.b & 603964056 ^ -622088973;
                    var5_3 = 0;
                    ** GOTO lbl13
lbl4:
                    // 2 sources

                    block5: while (true) {
                        switch (var5_3) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block5;
                                }
                                break;
                            }
                            case 1349931806: {
                                var2_5 = this.MU();
                                var4_4 ^= -943650608;
                                break block8;
                            }
lbl13:
                            // 1 sources

                            var4_4 = (var3_2 | 603964056) ^ -1807950889;
                            break block9;
lbl15:
                            // 1 sources

                            while (true) {
                                var5_3 = (var3_2 | 603964056) ^ -1910539415;
                                ** continue;
                                break;
                            }
                            case 1977652626: {
                                var4_4 ^= var5_3 ^ 672464550;
                                break block10;
                            }
                            case 1122828631: {
                                break block5;
                            }
                        }
                        break;
                    }
                    ** while (true)
                }
                var5_3 = (var3_2 | 603964056) ^ -1189941332;
                ** GOTO lbl4
            }
            var5_3 = (var3_2 | 603964056) ^ -1417036315;
            ** while (true)
        }
        return this.onMouseUp(var1_1.comp_4798() * (double)var2_5, var1_1.comp_4799() * (double)var2_5, var1_1.method_74245());
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public boolean method_25403(class_11909 class_119092, double d2, double d3) {
        int n2 = b & 0xDB023770 ^ 0xD1AAA8F3;
        int n3 = 0;
        int n4 = (n2 | 0xDB023770) ^ 0x6ADA974E;
        n3 = (n2 | 0xDB023770) ^ 0x33F9A7B2;
        block5: while (true) {
            switch (n3) {
                case 369748464: {
                    n4 ^= n3 ^ 0xD69003FB;
                    n3 = (n2 | 0xDB023770) ^ 0xF3623098;
                }
                default: {
                    continue block5;
                }
                case -397207487: {
                    n3 = (n2 | 0xDB023770) ^ 0xCDA35603;
                    continue block5;
                }
                case 684232555: 
            }
            break;
        }
        float f2 = this.MU();
        n4 ^= 0x386EA33B;
        return this.onMouseDrag(class_119092.comp_4798() * (double)f2, class_119092.comp_4799() * (double)f2, class_119092.method_74245(), d2 * (double)f2, d3 * (double)f2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean method_25401(double var1_1, double var3_2, double var5_3, double var7_4) {
        var10_5 = iR.b & -916258886 ^ -1034124101;
        var12_6 = 0;
        var11_7 = (var10_5 | -916258886) ^ -1539950075;
        var12_6 = (var10_5 | -916258886) ^ 1988548977;
        block5: while (true) {
            switch (var12_6) {
                case -1107810614: {
                    ** break;
                }
                case 792244782: {
                    var11_7 ^= var12_6 ^ -1089807653;
                    var12_6 = (var10_5 | -916258886) ^ -1281440750;
                }
                default: {
                    continue block5;
                }
lbl14:
                // 1 sources

                var12_6 = (var10_5 | -916258886) ^ -465154667;
                continue block5;
                case 2027961257: 
            }
            break;
        }
        var9_8 = this.MU();
        var11_7 ^= 629154912;
        return this.onScroll(var1_1 * (double)var9_8, var3_2 * (double)var9_8, var7_4);
    }

    /*
     * Unable to fully structure code
     */
    public boolean method_25404(class_11908 var1_1) {
        block78: {
            block83: {
                block69: {
                    block76: {
                        block80: {
                            block70: {
                                block81: {
                                    block72: {
                                        block74: {
                                            block77: {
                                                block82: {
                                                    block79: {
                                                        block75: {
                                                            block73: {
                                                                block71: {
                                                                    var5_2 = 1583312607;
                                                                    var2_3 = iR.b & 1583312607 ^ 406855338;
                                                                    var4_4 = 0;
                                                                    ** GOTO lbl207
lbl5:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ 1480424991;
                                                                        break block69;
                                                                        break;
                                                                    }
lbl8:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ 170831930;
                                                                        break block69;
lbl11:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_5 ^= var4_4 ^ -882300362;
                                                                            break block70;
                                                                            break;
                                                                        }
lbl14:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var3_5 ^= 788643334;
                                                                            break block71;
                                                                            break;
                                                                        }
lbl17:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_5 ^= 730492993;
                                                                            break block72;
                                                                            break;
                                                                        }
lbl20:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var4_4 = (var2_3 | var5_2) ^ -83416974;
                                                                            break block69;
                                                                            break;
                                                                        }
lbl23:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var4_4 = (var2_3 | var5_2) ^ 972460208;
                                                                            break block69;
                                                                            break;
                                                                        }
lbl26:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (this.a.a.focused() == null) break block73;
                                                                            ** GOTO lbl213
                                                                            break;
                                                                        }
lbl29:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var4_4 = (var2_3 | var5_2) ^ 605336329;
                                                                            break block69;
                                                                            break;
                                                                        }
lbl32:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var4_4 = (var2_3 | var5_2) ^ -860231674;
                                                                            break block69;
lbl35:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var4_4 = (var2_3 | var5_2) ^ 732589907;
                                                                                break block69;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
lbl38:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ -2130234315;
                                                                        break block69;
lbl41:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (var1_1.comp_4795() != iR.b((var3_5 | var4_4 ^ 709460369) ^ (var4_4 ^ 176566613), (var2_3 | var4_4 ^ 709460369) ^ ((var3_5 | var4_4 ^ 709460369) ^ (var4_4 ^ -748400236)))) break block74;
                                                                            break block75;
                                                                            break;
                                                                        }
lbl44:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_5 ^= var4_4 ^ -664615295;
                                                                            ** continue;
                                                                            break;
                                                                        }
lbl47:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (var1_1.comp_4795() != iR.b((var3_5 | var4_4 ^ 1017109761) ^ (var4_4 ^ 1014033890), (var2_3 | var4_4 ^ 1017109761) ^ ((var3_5 | var4_4 ^ 1017109761) ^ (var4_4 ^ 543025015)))) ** GOTO lbl20
                                                                            ** GOTO lbl202
                                                                            break;
                                                                        }
lbl50:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var4_4 = (var2_3 | var5_2) ^ 994349022;
                                                                            break block69;
                                                                            break;
                                                                        }
lbl53:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var4_4 = (var2_3 | var5_2) ^ 567042965;
                                                                            break block69;
lbl56:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                block84: {
                                                                                    var3_5 ^= 333603646;
                                                                                    break block84;
lbl59:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var3_5 ^= var4_4 ^ -1439185271;
                                                                                        break block76;
                                                                                        break;
                                                                                    }
lbl62:
                                                                                    // 1 sources

                                                                                    return false;
                                                                                }
                                                                                if (!this.a.a.focused().key(this.a, var1_1.comp_4795(), var1_1.comp_4797())) break block73;
                                                                                break block77;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                return v0.move(v1);
lbl69:
                                                                // 1 sources

                                                                while (true) {
                                                                    v1 = false;
                                                                    ** GOTO lbl14
                                                                    break;
                                                                }
lbl72:
                                                                // 1 sources

                                                                while (true) {
                                                                    var4_4 = (var2_3 | var5_2) ^ 14607772;
                                                                    break block69;
                                                                    break;
                                                                }
lbl75:
                                                                // 1 sources

                                                                while (true) {
                                                                    var3_5 ^= var4_4 ^ 937009927;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl78:
                                                                // 1 sources

                                                                while (true) {
                                                                    var3_5 ^= var4_4 ^ -1346573106;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl81:
                                                                // 1 sources

                                                                while (true) {
                                                                    this.beginClose();
                                                                    ** continue;
                                                                    break;
                                                                }
lbl84:
                                                                // 1 sources

                                                                while (true) {
                                                                    var4_4 = (var2_3 | var5_2) ^ -1283151038;
                                                                    break block69;
                                                                    break;
                                                                }
                                                            }
                                                            while (true) {
                                                                var4_4 = (var2_3 | var5_2) ^ -1456059882;
                                                                break block69;
lbl91:
                                                                // 1 sources

                                                                while (true) {
                                                                    var3_5 ^= var4_4 ^ -1116097953;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl94:
                                                                // 1 sources

                                                                return true;
                                                            }
                                                        }
                                                        var4_4 = (var2_3 | var5_2) ^ 2036484657;
                                                        break block69;
lbl99:
                                                        // 1 sources

                                                        while (true) {
                                                            var3_5 ^= var4_4 ^ -1422004974;
                                                            break block78;
                                                            break;
                                                        }
lbl102:
                                                        // 1 sources

                                                        while (true) {
                                                            var3_5 ^= var4_4 ^ 1941753762;
                                                            break block79;
                                                            break;
                                                        }
lbl105:
                                                        // 1 sources

                                                        while (true) {
                                                            v0 = this.a.a;
                                                            if ((var1_1.comp_4797() & 1) != 0) {
                                                                ** continue;
                                                            }
                                                            break block80;
                                                            break;
                                                        }
                                                    }
                                                    var4_4 = (var2_3 | var5_2) ^ -1492289867;
                                                    break block69;
lbl113:
                                                    // 1 sources

                                                    while (true) {
                                                        if (!this.onKey(var1_1.comp_4795(), var1_1.comp_4797())) break block81;
                                                        var4_4 = (var2_3 | var5_2) ^ -703984688;
                                                        break block69;
                                                        break;
                                                    }
lbl117:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_5 ^= var4_4 ^ -2080658617;
                                                        ** continue;
                                                        break;
                                                    }
lbl120:
                                                    // 1 sources

                                                    while (true) {
                                                        if (this.a != null) ** break;
                                                        ** continue;
                                                        break block82;
                                                        break;
                                                    }
lbl124:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_5 ^= var4_4 ^ 689722464;
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                var4_4 = (var2_3 | var5_2) ^ -960244624;
                                                break block69;
                                            }
                                            var4_4 = (var2_3 | var5_2) ^ 1465982865;
                                            break block69;
lbl133:
                                            // 1 sources

                                            return true;
                                        }
                                        var4_4 = (var2_3 | var5_2) ^ -300817231;
                                        break block69;
                                    }
                                    v1 = true;
                                    ** while (true)
                                }
                                var4_4 = (var2_3 | var5_2) ^ -1649304933;
                                break block69;
                            }
                            var4_4 = (var2_3 | var5_2) ^ 709464497;
                            break block69;
                        }
                        var3_5 ^= 730492993;
                        ** while (true)
                    }
                    var4_4 = (var2_3 | var5_2) ^ 1017105697;
                }
lbl153:
                // 4 sources

                block66: while (true) {
                    switch (var4_4) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block66;
                            }
                            break;
                        }
                        case -144100119: {
                            ** continue;
                        }
                        case 1794806468: {
                            ** continue;
                        }
                        case 1947660110: {
                            ** continue;
                        }
                        case 658322638: {
                            ** continue;
                        }
                        case 1656796126: {
                            ** continue;
                        }
                        case -1830381831: {
                            ** continue;
                        }
                        case 1416744645: {
                            ** continue;
                        }
                        case 155083118: {
                            ** continue;
                        }
                        case 2051788278: {
                            ** continue;
                        }
                        case 1739189839: {
                            ** continue;
                        }
                        case -1734563185: {
                            ** continue;
                        }
                        case 1696330017: {
                            ** continue;
                        }
                        case -1520937331: {
                            ** continue;
                        }
                        case -2007665361: {
                            ** continue;
                        }
                        case 1978995116: {
                            ** continue;
                        }
                        case 1087977611: {
                            ** continue;
                        }
                        case 107086048: {
                            ** continue;
                        }
                        case -1007754140: {
                            ** continue;
                        }
                        case 567104747: {
                            ** continue;
                        }
                        case 989738846: {
                            ** continue;
                        }
                        case 1002268743: {
                            break block66;
                        }
                        case -112064438: {
                            ** continue;
                        }
lbl202:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ 1709315768;
                        ** GOTO lbl-1000
                        case -304360003: {
                            if (this.a == null) ** continue;
                            ** continue;
                        }
lbl207:
                        // 1 sources

                        var3_5 = (var2_3 | var5_2) ^ -1497763231;
                        ** continue;
                        case 2140347754: {
                            break block83;
                        }
                        case -547861814: {
                            ** continue;
                        }
lbl213:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ 1688291745;
                        ** continue;
                    }
                    break;
                }
                var4_4 = (var2_3 | var5_2) ^ 2140285460;
                ** GOTO lbl153
            }
            var4_4 = (var2_3 | var5_2) ^ 883289147;
            ** GOTO lbl153
        }
        var4_4 = (var2_3 | var5_2) ^ 512116340;
        ** while (true)
        {
            case -1337025970: {
                var3_5 ^= var4_4 ^ 498021979;
                ** continue;
            }
            ** case 1585552227:
        }
lbl227:
        // 1 sources

        return true;
    }

    /*
     * Unable to fully structure code
     */
    public boolean method_25400(class_11905 var1_1) {
        block19: {
            block18: {
                var5_2 = -1477702810;
                var2_3 = iR.b & -1477702810 ^ -1052748968;
                var4_4 = 0;
                ** GOTO lbl43
lbl5:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ -1662684921;
                    break block18;
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 910986712;
                    break block19;
lbl11:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 2045909431;
                        break block19;
                        break;
                    }
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 1250432425;
                    break block19;
lbl17:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1008071909;
                        break block19;
lbl20:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ 2057798118;
                            ** continue;
                            break;
                        }
                        break;
                    }
                    break;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ -1444731806;
        }
        block15: while (true) {
            switch (var4_4) lbl-1000:
            // 3 sources

            {
                default: {
                    continue block15;
                }
                case 604393573: {
                    ** continue;
                }
                case -1385935145: {
                    ** continue;
                }
lbl34:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 701858817;
                    ** GOTO lbl-1000
                    break;
                }
                case -1642183991: {
                    return false;
                }
                case -835068033: {
                    ** continue;
                }
                case 1718009904: {
                    return this.onChar((char)var1_1.comp_4793());
                }
lbl43:
                // 1 sources

                var3_5 = (var2_3 | var5_2) ^ 182513996;
                ** continue;
                case -777988442: {
                    var3_5 ^= var4_4 ^ 1600517577;
                    var4_4 = (var2_3 | var5_2) ^ -2121622706;
                    ** GOTO lbl-1000
                }
                case 1309638428: 
            }
            break;
        }
        ** while (var1_1.method_74227())
lbl51:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    protected boolean onMouseDown(double d2, double d3, int n2) {
        int n3 = b & 0x7678DE62 ^ 0x915FD429;
        int n4 = 0;
        int n5 = (n3 | 0x7678DE62) ^ 0xAB21E212;
        n4 = (n3 | 0x7678DE62) ^ 0xED6DE612;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case 1083504244: {
                    n5 ^= n4 ^ 0x7F1B787D;
                    n4 = (n3 | 0x7678DE62) ^ 0x6C1B70EE;
                    continue block5;
                }
                case 437401721: {
                    n4 = (n3 | 0x7678DE62) ^ 0xB7EB281F;
                    continue block5;
                }
                case -1687900539: 
            }
            break;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected boolean onMouseUp(double d2, double d3, int n2) {
        int n3 = b & 0x426D893D ^ 0x7F3F9283;
        int n4 = 0;
        int n5 = (n3 | 0x426D893D) ^ 0x5FC4309E;
        n4 = (n3 | 0x426D893D) ^ 0xA24B913E;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -1573514676: {
                    n5 ^= n4 ^ 0x2D236922;
                    n4 = (n3 | 0x426D893D) ^ 0xBC10B564;
                    continue block5;
                }
                case -1016123685: {
                    return false;
                }
                case -583791999: 
            }
            n4 = (n3 | 0x426D893D) ^ 0xDD4989F3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected boolean onMouseDrag(double d2, double d3, int n2, double d4, double d5) {
        int n3 = b & 0x8E53BF27 ^ 0x32E05132;
        int n4 = 0;
        int n5 = (n3 | 0x8E53BF27) ^ 0xFA4FE8F5;
        n4 = (n3 | 0x8E53BF27) ^ 0x534D7D18;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -306281937: {
                    n4 = (n3 | 0x8E53BF27) ^ 0xC1E2CD0E;
                    continue block5;
                }
                case 2131833401: {
                    n5 ^= n4 ^ 0x57DE9C39;
                    n4 = (n3 | 0x8E53BF27) ^ 0x18D17A8D;
                    continue block5;
                }
                case -1507686982: 
            }
            break;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected boolean onScroll(double d2, double d3, double d4) {
        int n2 = b & 0xF2E918DD ^ 0xB972247B;
        int n3 = 0;
        int n4 = (n2 | 0xF2E918DD) ^ 0x5EBA8749;
        n3 = (n2 | 0xF2E918DD) ^ 0x113CBF55;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 232207309: {
                    n4 ^= n3 ^ 0xF9DAC5F8;
                    n3 = (n2 | 0xF2E918DD) ^ 0x704732F5;
                    continue block5;
                }
                case -356023382: {
                    n3 = (n2 | 0xF2E918DD) ^ 0xF62C0F32;
                    continue block5;
                }
                case -1950609910: 
            }
            break;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected boolean onKey(int n2, int n3) {
        int n4 = b & 0x1C3B21E6 ^ 0x90A14858;
        int n5 = 0;
        int n6 = (n4 | 0x1C3B21E6) ^ 0x4AF4E150;
        n5 = (n4 | 0x1C3B21E6) ^ 0xBA3B2523;
        while (true) {
            switch (n5) {
                case -1028341306: {
                    n6 ^= n5 ^ 0xA0C4839D;
                    n5 = (n4 | 0x1C3B21E6) ^ 0x2A53D438;
                    break;
                }
                case -1226261050: {
                    return false;
                }
                case 645942493: {
                    n5 = (n4 | 0x1C3B21E6) ^ 0x5E0FA838;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected boolean onChar(char c2) {
        int n2 = b & 0x663BE2A1 ^ 0x52409176;
        int n3 = 0;
        int n4 = (n2 | 0x663BE2A1) ^ 0xE756A801;
        n3 = (n2 | 0x663BE2A1) ^ 0x264D5262;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1345757589: {
                    n3 = (n2 | 0x663BE2A1) ^ 0x53842E9B;
                    continue block5;
                }
                case -916893991: {
                    return false;
                }
                case 637525356: 
            }
            n4 ^= n3 ^ 0xD095DC36;
            n3 = (n2 | 0x663BE2A1) ^ 0xBF22BD2E;
        }
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void MV(class_310 var1_1) {
        block23: {
            block22: {
                block21: {
                    break block23;
lbl1:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1882457810;
                        ** GOTO lbl42
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var1_1.method_1507(this.a);
                        break block21;
                        break;
                    }
lbl7:
                    // 1 sources

                    return;
lbl9:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -901814708;
                        ** GOTO lbl42
                        break;
                    }
                }
                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 1337026856;
                    ** GOTO lbl42
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -791458813;
                    ** GOTO lbl42
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ -368603235;
                    break block22;
                    break;
                }
lbl22:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1125722459;
                    ** GOTO lbl42
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    if (var1_1.field_1755 != this) ** continue;
                    ** continue;
                    break;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ 666237327;
            if (true) ** GOTO lbl42
        }
        var5_2 = 2145395482;
        var2_3 = iR.b & 2145395482 ^ -796278334;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -576277697;
        ** while (true)
lbl37:
        // 1 sources

        while (true) {
            var3_5 ^= var4_4 ^ 470428036;
            ** continue;
            break;
        }
        block19: while (true) {
            var4_4 = (var2_3 | var5_2) ^ -46963623;
lbl42:
            // 7 sources

            block20: while (true) {
                switch (var4_4) {
                    default: {
                        continue block20;
                    }
                    case 47875971: {
                        ** continue;
                    }
                    case -665052587: {
                        ** continue;
                    }
                    case 1881283316: {
                        ** continue;
                    }
                    case 1125070207: {
                        continue block19;
                    }
                    case -1336374542: {
                        ** continue;
                    }
                    case 903251350: {
                        ** continue;
                    }
                    ** case 792375257:
lbl59:
                    // 1 sources

                    ** continue;
                }
                break;
            }
            break;
        }
    }

    private static int b(int n2, int n3) {
        int n4 = -229266342;
        int n5 = 1978219626;
        int n6 = b[n2 ^ ((n5 | n4) ^ 0x77321CB2)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xF7FD8F2F;
        n6 ^= (n5 | n4) ^ 0xF7FD1655;
        n6 ^= (n5 | n4) ^ 0xF7FD5732;
        n6 -= (n5 | n4) ^ 0xF7FD64D5;
        n6 += (n5 | n4) ^ 0xF7FD1ADE;
        n6 -= (n5 | n4) ^ 0xF7FD8B78;
        n6 += (n5 | n4) ^ 0xF7FD5F23;
        n6 += (n5 | n4) ^ 0xF7FD268D;
        return n6 -= (n5 | n4) ^ 0xF7FDFF6E;
    }
}

