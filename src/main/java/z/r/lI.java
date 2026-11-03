/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import z.r.af;
import z.r.cm;
import z.r.ep;
import z.r.ki;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class lI
extends af {
    public static final int l = mK.a(MethodHandles.lookup().lookupClass(), -1878032956);
    private boolean f;
    public float g;
    private boolean g;
    private boolean h;
    public static final float h = -999.0f;
    private boolean i;
    public float i;
    private boolean j;
    private boolean k;

    /*
     * Exception decompiling
     */
    public lI(float var1_1, float var2_2) {
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
    public lI(ep ep2) {
        int n2 = l & 0xFED7564F ^ 0x517FBA9A;
        int n3 = (n2 | 0xFED7564F) ^ 0xE10A309E;
        n3 ^= 0x440346E3;
        this(ep2.getYaw(), ep2.getPitch());
        n3 ^= 0x3AD04FC0;
    }

    /*
     * Unable to fully structure code
     */
    public float getCurrentYaw() {
        block32: {
            block36: {
                block30: {
                    block33: {
                        block31: {
                            break block36;
lbl1:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -1542795645;
                                break block30;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_3 ^ -1973262399;
                                break block31;
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_3 ^ -610387642;
                                break block32;
                                break;
                            }
lbl10:
                            // 2 sources

                            while (true) {
                                var3_5 ^= 1338791479;
                                break block33;
                                break;
                            }
                        }
                        var4_3 = (var2_2 | var5_1) ^ -570790841;
                        ** GOTO lbl52
lbl16:
                        // 1 sources

                        while (true) {
                            v0 = 0.0f;
                            ** GOTO lbl10
                            break;
                        }
lbl19:
                        // 1 sources

                        while (true) {
                            block35: {
                                block34: {
                                    var4_3 = (var2_2 | var5_1) ^ 540330347;
                                    break block35;
lbl22:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 767802071;
                                        break block30;
                                        break;
                                    }
lbl25:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ -388983807;
                                        break block30;
                                        break;
                                    }
lbl28:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= var4_3 ^ 390600804;
                                        ** continue;
                                        break;
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        v0 = var1_4.method_36454();
                                        ** continue;
                                        break;
                                    }
                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ -292088915;
                                        break block30;
                                        break;
                                    }
lbl37:
                                    // 1 sources

                                    while (true) {
                                        var1_4 = class_310.method_1551().field_1724;
                                        ** continue;
                                        break;
                                    }
lbl40:
                                    // 1 sources

                                    while (true) {
                                        if (var1_4 != null) ** continue;
                                        break block34;
                                        break;
                                    }
lbl43:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= var4_3 ^ 1757388013;
                                        ** continue;
                                        break;
                                    }
lbl46:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ -189260404;
                                        break block35;
                                        break;
                                    }
                                }
                                var4_3 = (var2_2 | var5_1) ^ 574698127;
                                break block30;
                            }
                            block28: while (true) {
                                switch (var4_3) {
                                    default: {
                                        continue block28;
                                    }
                                    case 256801569: {
                                        ** continue;
                                    }
                                    case -607998010: {
                                        ** continue;
                                    }
                                    ** case 638323434:
lbl62:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                            break;
                        }
                    }
                    return v0;
                }
lbl66:
                // 2 sources

                block29: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block29;
                        }
                        case -642296798: {
                            ** continue;
                        }
                        case -483455302: {
                            ** continue;
                        }
                        case 358708480: {
                            ** continue;
                        }
                        case -701113222: {
                            ** continue;
                        }
                        case 1610393646: {
                            ** continue;
                        }
                        ** case 321319596:
lbl81:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            var5_1 = 737551885;
            var2_2 = lI.l & 737551885 ^ -754827092;
            var4_3 = 0;
            var3_5 = (var2_2 | var5_1) ^ 824135099;
            ** while (true)
        }
        var4_3 = (var2_2 | var5_1) ^ 416901143;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public float getCurrentPitch() {
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
    public float getTargetYaw() {
        block23: {
            block22: {
                break block23;
lbl1:
                // 1 sources

                block14: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -172125631;
lbl3:
                    // 4 sources

                    block15: while (true) {
                        switch (var3_3) lbl-1000:
                        // 5 sources

                        {
                            while (true) {
                                default: {
                                    continue block15;
                                }
                                break;
                            }
                            case 1920459179: {
                                return this.g;
                            }
lbl10:
                            // 2 sources

                            case -2109570601: {
                                var3_3 = (var1_2 | var4_1) ^ -1544640980;
                                ** GOTO lbl-1000
                            }
                            case 1139359585: {
                                var2_4 ^= var3_3 ^ -706860270;
                                ** GOTO lbl10
                            }
                            case 602506592: {
                                break block14;
                            }
lbl18:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1941332609;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 206565374: {
                                break block22;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1975824417;
                                ** GOTO lbl-1000
                                break;
                            }
lbl26:
                            // 2 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -635701025;
                                ** continue;
                                break;
                            }
                        }
                        break;
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ -1954178028;
                ** GOTO lbl3
lbl31:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1172618530;
                    ** GOTO lbl3
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 2075196520;
            ** while (true)
            {
                case -1975247042: {
                    var2_4 ^= var3_3 ^ -2018159430;
                    ** GOTO lbl26
                }
            }
        }
        var4_1 = 2034382251;
        var1_2 = lI.l & 2034382251 ^ -1733273161;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -2061749458;
        ** while (true)
        {
            case 1511840659: {
                switch (var2_4) {
                    case 890864930: {
                        ** continue;
                    }
                    case 2095992465: {
                        ** continue;
                    }
                    ** default:
lbl53:
                    // 1 sources

                    ** continue;
                }
            }
            ** case 1942565472:
        }
lbl55:
        // 1 sources

        var2_4 ^= var3_3 ^ 65618415;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public float getTargetPitch() {
        int n2 = l & 0x50E13E06 ^ 0x763506D5;
        int n3 = 0;
        int n4 = (n2 | 0x50E13E06) ^ 0x78B36097;
        n3 = (n2 | 0x50E13E06) ^ 0x2421FF96;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1498515474: {
                    n4 ^= n3 ^ 0xD31AE4B7;
                    n3 = (n2 | 0x50E13E06) ^ 0x88269DE1;
                    continue block5;
                }
                case 1389674817: {
                    break;
                }
                case -19684554: {
                    return this.i;
                }
            }
            n3 = (n2 | 0x50E13E06) ^ 0xD05B4939;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setTargetRotation(float f2, float f3) {
        int n2 = 305310844;
        int n3 = l & 0x1232AC7C ^ 0x9BA83E28;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xB9EA440A;
        n4 = (n3 | n2) ^ 0xC6F73BB4;
        block11: while (true) {
            switch (n4) {
                default: {
                    continue block11;
                }
                case -649288555: {
                    n5 ^= n4 ^ 0x873EA87A;
                    n4 = (n3 | n2) ^ 0xAABC1948;
                    continue block11;
                }
                case -1866014447: {
                    n5 ^= n4 ^ 0xE1C846B;
                    n4 = (n3 | n2) ^ 0xAD120CDF;
                    continue block11;
                }
                case 128682181: {
                    n5 ^= n4 ^ 0xC1AA7DB7;
                    n4 = (n3 | n2) ^ 0xF92F5158;
                    continue block11;
                }
                case -1322446295: {
                    n5 ^= n4 ^ 0xA501F06C;
                    n4 = (n3 | n2) ^ 0xCCC34519;
                    continue block11;
                }
                case 822519604: {
                    this.g = f2;
                    n4 = (n3 | n2) ^ 0xB7C5F6D;
                    continue block11;
                }
                case 1653993252: {
                    this.setComplete(false);
                    n4 = (n3 | n2) ^ 0x2A97AC55;
                    continue block11;
                }
                case 1565361608: {
                    n4 = (n3 | n2) ^ 0x42F61AE9;
                    continue block11;
                }
                case 917025443: {
                    this.i = f3;
                    n4 = (n3 | n2) ^ 0x9C1136B9;
                    continue block11;
                }
                case 1467612005: 
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setTargetRotation(ep ep2) {
        int n2 = -1014863506;
        int n3 = l & 0xC382696E ^ 0xE1AFA631;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x59CAE960;
        n4 = (n3 | n2) ^ 0xEE5A0E94;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1579495234: {
                    n5 ^= n4 ^ 0x94CBA889;
                    n4 = (n3 | n2) ^ 0x1567EEA4;
                    continue block7;
                }
                case -154664485: {
                    this.setTargetRotation(ep2.getYaw(), ep2.getPitch());
                    n4 = (n3 | n2) ^ 0xE1A8B248;
                    continue block7;
                }
                case 234217963: {
                    n4 = (n3 | n2) ^ 0x42753FC1;
                    continue block7;
                }
                case 263415464: {
                    return;
                }
                case 34037047: 
            }
            n5 ^= n4 ^ 0x80690EC3;
            n4 = (n3 | n2) ^ 0xEC1C89D7;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void setClampStepToRemaining(boolean var1_1) {
        block11: {
            block12: {
                break block11;
lbl1:
                // 4 sources

                block7: while (true) {
                    switch (var4_4) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block7;
                            }
                            break;
                        }
lbl6:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -965797811;
                            ** continue;
                            break;
                        }
                        case 2139845552: {
                            var3_5 ^= var4_4 ^ -999887874;
                            break block7;
                        }
                        case 600893426: {
                            break;
                        }
                    }
                    break;
                }
                var4_4 = (var2_3 | var5_2) ^ -409327217;
                ** GOTO lbl1
                {
                    case 1992747522: {
                        var3_5 ^= var4_4 ^ -157274632;
                        break block12;
                    }
                }
lbl19:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1820781123;
                    ** GOTO lbl1
                    break;
                }
                {
                    case 36034096: {
                        this.k = var1_1;
                        ** continue;
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ -1707832305;
                ** GOTO lbl1
                {
                    ** case -1711739688:
                }
lbl28:
                // 1 sources

                return;
            }
            var4_4 = (var2_3 | var5_2) ^ 2085032807;
            ** while (true)
        }
        var5_2 = -2135924840;
        var2_3 = lI.l & -2135924840 ^ -442499929;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 661630305;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isStepClampedToRemaining() {
        int n2 = l & 0xC7291CDC ^ 0xFC8C9AF3;
        int n3 = 0;
        int n4 = (n2 | 0xC7291CDC) ^ 0x1E2F3D68;
        n3 = (n2 | 0xC7291CDC) ^ 0x3E6BE4DF;
        block5: while (true) {
            switch (n3) {
                case -1295673379: {
                    n4 ^= n3 ^ 0xBCA7E194;
                    n3 = (n2 | 0xC7291CDC) ^ 0xBB57714A;
                }
                default: {
                    continue block5;
                }
                case 1157296053: {
                    return this.k;
                }
                case -1043957216: 
            }
            n3 = (n2 | 0xC7291CDC) ^ 0x4D680922;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void setScaleAxesProportionally(boolean var1_1) {
        block13: {
            block12: {
                break block13;
lbl1:
                // 1 sources

                while (true) {
                    this.j = var1_1;
                    ** GOTO lbl21
                    break;
                }
lbl4:
                // 2 sources

                block8: while (true) {
                    switch (var4_4) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            default: {
                                continue block8;
                            }
                            break;
                        }
                        case -989365489: {
                            break block8;
                        }
                        case -1199088494: {
                            ** continue;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 109713840;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -19798947: {
                            var3_5 ^= var4_4 ^ -1996491496;
                            break block12;
                        }
                        case -126753753: {
                            return;
                        }
lbl21:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ -778596408;
                        ** GOTO lbl-1000
lbl23:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1006405272;
                            ** continue;
                            break;
                        }
                    }
                    break;
                }
                var4_4 = (var2_3 | var5_2) ^ 2759114;
                ** GOTO lbl4
            }
            var4_4 = (var2_3 | var5_2) ^ 1182572805;
            ** while (true)
        }
        var5_2 = -629967850;
        var2_3 = lI.l & -629967850 ^ -58004075;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -365230771;
        ** while (true)
        {
            ** case 795636319:
        }
lbl38:
        // 1 sources

        var3_5 ^= var4_4 ^ -140056537;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean isAxisScalingEnabled() {
        block9: {
            block7: {
                block8: {
                    var1_1 = lI.l & 200050639 ^ 908350850;
                    var3_2 = 0;
                    ** GOTO lbl14
lbl4:
                    // 1 sources

                    return this.j;
lbl6:
                    // 3 sources

                    block6: while (true) {
                        switch (var3_2) {
                            default: {
                                continue block6;
                            }
                            case 1006346570: {
                                ** continue;
                            }
                            case -81234997: {
                                break block7;
                            }
lbl14:
                            // 1 sources

                            var2_3 = (var1_1 | 200050639) ^ 1890069170;
                            break block8;
                            case -1674052018: {
                                var2_3 ^= var3_2 ^ -751628297;
                                break block6;
                            }
                        }
                        break;
                    }
                    break block9;
                }
                var3_2 = (var1_1 | 200050639) ^ -993745916;
                ** GOTO lbl6
            }
            var3_2 = (var1_1 | 200050639) ^ -1545918079;
            ** GOTO lbl6
        }
        var3_2 = (var1_1 | 200050639) ^ 68646533;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setRestoreCapturedRotation(boolean var1_1) {
        var5_2 = -1135059849;
        var2_3 = lI.l & -1135059849 ^ -683178296;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -1237080129;
        var4_4 = (var2_3 | var5_2) ^ 1793060997;
        if (true) ** GOTO lbl9
        block7: while (true) {
            var4_4 = (var2_3 | var5_2) ^ -34613418;
lbl9:
            // 2 sources

            block8: while (true) {
                switch (var4_4) {
                    default: {
                        continue block8;
                    }
                    case 558663542: {
                        var3_5 ^= var4_4 ^ 465693206;
                        var4_4 = (var2_3 | var5_2) ^ 1441316605;
                        continue block8;
                    }
                    case -1786761606: {
                        var4_4 = (var2_3 | var5_2) ^ 1090451191;
                        continue block8;
                    }
                    case -1079957496: {
                        var3_5 ^= var4_4 ^ -1168258591;
                        continue block7;
                    }
                    case 45091241: {
                        this.f = var1_1;
                        var4_4 = (var2_3 | var5_2) ^ -569157239;
                        continue block8;
                    }
                    case -1430822910: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean shouldRestoreCapturedRotation() {
        int n2 = l & 0xD9022BE8 ^ 0x4BD1398D;
        int n3 = 0;
        int n4 = (n2 | 0xD9022BE8) ^ 0xC5254AC0;
        n3 = (n2 | 0xD9022BE8) ^ 0x65AA7D72;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1099348321: {
                    n3 = (n2 | 0xD9022BE8) ^ 0x2C5A59D8;
                    continue block5;
                }
                case -141991371: {
                    n4 ^= n3 ^ 0x561E2DA5;
                    n3 = (n2 | 0xD9022BE8) ^ 0xFD7384DF;
                    continue block5;
                }
                case 648068914: 
            }
            break;
        }
        return this.f;
    }

    /*
     * Unable to fully structure code
     */
    public void setCubicAcceleration(boolean var1_1) {
        block15: {
            break block15;
lbl1:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 1933172966;
                ** GOTO lbl19
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 543153661;
                if (true) ** GOTO lbl19
                break;
            }
        }
        var5_2 = -1446662683;
        var2_3 = lI.l & -1446662683 ^ -1674917505;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -835072760;
        ** while (true)
        block9: while (true) {
            block16: {
                var4_4 = (var2_3 | var5_2) ^ 1637816275;
                break block16;
lbl16:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ 0x8C0C8CC;
                    ** continue;
                    break;
                }
            }
            block11: while (true) {
                switch (var4_4) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block11;
                        }
                        break;
                    }
                    case -1837943460: {
                        ** continue;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 798808227;
                        ** GOTO lbl-1000
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1485443795;
                        ** continue;
                        break;
                    }
                    case 446300370: {
                        var3_5 ^= var4_4 ^ 1791776211;
                        continue block9;
                    }
                    case -1649397758: {
                        ** continue;
                    }
                    case -596575700: {
                        return;
                    }
                    case -824832743: 
                }
                break;
            }
            break;
        }
        this.i = var1_1;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isCubicAccelerationEnabled() {
        int n2 = l & 0x93A22C24 ^ 0x19D6C238;
        int n3 = 0;
        int n4 = (n2 | 0x93A22C24) ^ 0xCD563C13;
        n3 = (n2 | 0x93A22C24) ^ 0x540F2A25;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 845357152: {
                    n4 ^= n3 ^ 0x210953F1;
                    n3 = (n2 | 0x93A22C24) ^ 0x52F36A4C;
                    continue block5;
                }
                case -922385296: {
                    return this.i;
                }
                case -805714919: 
            }
            n3 = (n2 | 0x93A22C24) ^ 0xA995CE5C;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void setLinearAcceleration(boolean var1_1) {
        block14: {
            block16: {
                block15: {
                    break block15;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ 410740511;
                        ** GOTO lbl38
                        break;
                    }
                }
                var5_2 = -1171894457;
                var2_3 = lI.l & -1171894457 ^ 2014831299;
                var4_4 = 0;
                break block16;
lbl9:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1928748559;
                    break block14;
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var3_5 = (var2_3 | var5_2) ^ 1149460782;
            var4_4 = (var2_3 | var5_2) ^ -24766228;
            break block14;
lbl18:
            // 1 sources

            while (true) {
                var3_5 ^= var4_4 ^ -992309600;
                ** continue;
                break;
            }
lbl21:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -443268543;
                break block14;
                break;
            }
            this.g = var1_1;
            var4_4 = (var2_3 | var5_2) ^ -1977177801;
        }
        block12: while (true) {
            switch (var4_4) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block12;
                    }
                    break;
                }
                case 530820486: {
                    ** continue;
                }
                case -1429755842: {
                    ** continue;
                }
                case 1880180464: {
                    ** continue;
                }
lbl38:
                // 1 sources

                var4_4 = (var2_3 | var5_2) ^ 1357924345;
                ** continue;
                case 2000571958: {
                    return;
                }
                case 78772011: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isLinearAccelerationEnabled() {
        int n2 = l & 0x38BCDC05 ^ 0x176B844C;
        int n3 = 0;
        int n4 = (n2 | 0x38BCDC05) ^ 0x101695F0;
        n3 = (n2 | 0x38BCDC05) ^ 0x2D0644A9;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -83451144: {
                    n4 ^= n3 ^ 0x366AC9BE;
                    n3 = (n2 | 0x38BCDC05) ^ 0x88F0C952;
                    continue block5;
                }
                case -1223748321: {
                    return this.g;
                }
                case 318347492: 
            }
            n3 = (n2 | 0x38BCDC05) ^ 0xC4F97EB5;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void setAngleBasedAcceleration(boolean var1_1) {
        block15: {
            break block15;
lbl1:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 148423171;
                ** GOTO lbl23
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -1171534696;
                ** GOTO lbl23
lbl7:
                // 1 sources

                while (true) {
                    this.h = var1_1;
                    ** GOTO lbl35
                    break;
                }
                break;
            }
        }
        var5_2 = -845288267;
        var2_3 = lI.l & -845288267 ^ 988005527;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -74702727;
        ** while (true)
lbl16:
        // 1 sources

        return;
lbl18:
        // 1 sources

        while (true) {
            var4_4 = (var2_3 | var5_2) ^ -1918003902;
            if (true) ** GOTO lbl23
            block12: while (true) {
                var4_4 = (var2_3 | var5_2) ^ 1485814341;
lbl23:
                // 4 sources

                block13: while (true) {
                    switch (var4_4) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block13;
                            }
                            break;
                        }
                        case 1918007797: {
                            ** continue;
                        }
                        case -1485809934: {
                            ** continue;
                        }
                        case -1872339508: {
                            var3_5 ^= var4_4 ^ -1061723728;
                            continue block12;
                        }
lbl35:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ 1872343419;
                        ** continue;
                        case -148427084: {
                            ** continue;
                        }
                        case 1171529775: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        var3_5 ^= var4_4 ^ 1927797710;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isAngleBasedAccelerationEnabled() {
        int n2 = l & 0x9F5A128D ^ 0x703A6397;
        int n3 = 0;
        int n4 = (n2 | 0x9F5A128D) ^ 0x7DC034F7;
        n3 = (n2 | 0x9F5A128D) ^ 0x783262A1;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1067951207: {
                    n4 ^= n3 ^ 0xFE1E4DDC;
                    n3 = (n2 | 0x9F5A128D) ^ 0x17139959;
                    continue block5;
                }
                case -395711802: {
                    return this.h;
                }
                case -2025320130: 
            }
            n3 = (n2 | 0x9F5A128D) ^ 0x3F222806;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public boolean updateYaw() {
        block46: {
            var17_1 = -1054645588;
            var14_2 = lI.l & -1054645588 ^ 921595653;
            var16_3 = 0;
            var15_10 = (var14_2 | var17_1) ^ 984718691;
            var16_3 = (var14_2 | var17_1) ^ 1942358343;
            ** GOTO lbl93
lbl7:
            // 1 sources

            while (true) {
                var16_3 = (var14_2 | var17_1) ^ -2061218538;
                break block46;
                break;
            }
            while (true) {
                var16_3 = (var14_2 | var17_1) ^ -554631927;
                ** GOTO lbl93
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl15:
            // 1 sources

            while (true) {
                var16_3 = (var14_2 | var17_1) ^ -1025096471;
                ** GOTO lbl93
                break;
            }
lbl18:
            // 1 sources

            while (true) {
                var15_10 ^= -541989583;
                var6_8 = cm.wrapAngleTo180((this.i - var3_6) % 360.0f);
                var15_10 ^= -1728789920;
                var8_9 = Math.abs(var4_7);
                var16_3 = (var14_2 | var17_1) ^ -585290339;
                break block46;
                break;
            }
lbl25:
            // 1 sources

            while (true) {
                var16_3 = (var14_2 | var17_1) ^ -131156786;
                if (true) ** GOTO lbl93
                break;
            }
            var16_3 = (var14_2 | var17_1) ^ -1979697236;
            block37: while (true) {
                block47: {
                    block49: {
                        block48: {
                            switch (var16_3) {
                                case 1475523697: {
                                    this.m = this.addPendingStep(this.m, var4_7, var10_11);
                                    var16_3 = (var14_2 | var17_1) ^ -403412358;
                                    continue block37;
                                }
                                case 1587602601: {
                                    return false;
                                }
                                case 2112837633: {
                                    var15_10 ^= var16_3 ^ -529053038;
                                    ** break;
                                }
                                case 2021001281: {
                                    if (this.j) {
                                        ** break;
                                    }
                                    ** GOTO lbl65
                                }
                                case -771029906: {
                                    var10_11 = this.applyYawAcceleration(var10_11, var8_9);
                                    ** continue;
                                }
                                case 1278865892: {
                                    var10_11 *= var12_12;
                                    ** GOTO lbl65
                                }
                                case 1812517512: {
                                    var15_10 ^= var16_3 ^ -2121784696;
                                    break;
                                }
                                case 270206423: {
                                    var15_10 ^= var16_3 ^ 1856459195;
                                    var16_3 = (var14_2 | var17_1) ^ -1454404860;
                                    break block47;
                                }
lbl57:
                                // 1 sources

                                var16_3 = (var14_2 | var17_1) ^ -1608655908;
                                break block47;
                                case 1291284475: {
                                    var15_10 ^= var16_3 ^ -367929509;
                                    var16_3 = (var14_2 | var17_1) ^ 635726787;
                                    break block47;
                                }
                                case 1996473581: {
                                    if (var12_12 < 1.0) break block48;
lbl65:
                                    // 3 sources

                                    var16_3 = (var14_2 | var17_1) ^ -1156054954;
                                    break block47;
                                }
lbl67:
                                // 1 sources

                                var16_3 = (var14_2 | var17_1) ^ 1857802911;
                                continue block37;
                                case 880031108: {
                                    break block49;
                                }
                                case -1722499790: {
                                    var16_3 = (var14_2 | var17_1) ^ -2129614016;
                                    break block47;
                                }
                            }
                            var16_3 = (var14_2 | var17_1) ^ -1885771796;
                            continue;
                        }
                        var16_3 = (var14_2 | var17_1) ^ -1013229015;
                        continue;
                    }
                    var16_3 = (var14_2 | var17_1) ^ -1143562679;
                    continue;
                }
lbl83:
                // 2 sources

            }
            block39: while (true) {
                block50: {
                    var16_3 = (var14_2 | var17_1) ^ -918755762;
                    break block50;
lbl87:
                    // 1 sources

                    while (true) {
                        var15_10 ^= 483400660;
                        var3_6 = this.getCurrentPitch() - (float)((int)(-this.n)) * var1_4 * 0.15f;
                        var15_10 ^= 1375505503;
                        var4_7 = cm.wrapAngleTo180((this.g - var2_5) % 360.0f);
                        ** continue;
                        break;
                    }
                }
                block41: while (true) {
                    switch (var16_3) {
                        case 264362851: {
                            return true;
                        }
                        case 1054050787: {
                            if (this.g != -999.0f) ** continue;
                            ** break;
                        }
                        case 689935012: {
                            var15_10 ^= var16_3 ^ 193034972;
                            ** continue;
                        }
                        case 889793348: {
                            var1_4 = this.getMouseScale();
                            var15_10 ^= 1819698200;
                            var2_5 = this.getCurrentYaw() + (float)((int)this.m) * var1_4 * 0.15f;
                            ** continue;
                        }
lbl109:
                        // 1 sources

                        var16_3 = (var14_2 | var17_1) ^ -58636140;
                        default: {
                            continue block41;
                        }
                        case -1916725989: {
                            var15_10 ^= var16_3 ^ -1620201629;
                            continue block39;
                        }
                        case 191768377: {
                            var15_10 ^= var16_3 ^ -203301581;
                            ** continue;
                        }
                        case -2077661462: 
                    }
                    var16_3 = (var14_2 | var17_1) ^ 2049866422;
                }
                break;
            }
lbl121:
            // 1 sources

            while (true) {
                var15_10 ^= 520767244;
                var12_12 = var8_9 / Math.abs(var6_8);
                var16_3 = (var14_2 | var17_1) ^ -1679311579;
                ** GOTO lbl83
                break;
            }
        }
        block43: while (true) {
            block52: {
                block51: {
                    switch (var16_3) {
                        default: {
                            continue block43;
                        }
                        case 1925915323: {
                            var10_11 = (double)this.getSpeed() * 0.25;
                            ** continue;
                        }
                        case 1540829334: {
                            var15_10 ^= var16_3 ^ -1876364073;
                            ** continue;
                        }
                        case 1096959719: {
                            var15_10 ^= var16_3 ^ 166247159;
                            break block51;
                        }
                        case -2024090642: {
                            if (!this.isOutsideTolerance(var8_9)) {
                                break;
                            }
                            break block52;
                        }
                        case 2143865302: {
                            return true;
                        }
                        case 720519728: {
                            var15_10 ^= var16_3 ^ 644358639;
                            var16_3 = (var14_2 | var17_1) ^ 1890958403;
                            continue block43;
                        }
                    }
                    var16_3 = (var14_2 | var17_1) ^ -1232262838;
                    continue;
                }
                var16_3 = (var14_2 | var17_1) ^ -2010667397;
                continue;
            }
            var16_3 = (var14_2 | var17_1) ^ -1405591749;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean updatePitch() {
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
    protected float getMouseScale() {
        block12: {
            block10: {
                block11: {
                    break block11;
lbl1:
                    // 1 sources

                    return var1_3 * var1_3 * var1_3 * 8.0f;
lbl3:
                    // 1 sources

                    while (true) {
                        var3_4 ^= -1955475209;
                        ** continue;
                        break;
                    }
lbl6:
                    // 1 sources

                    while (true) {
                        var1_3 = ki.a.getMouseSensitivity() * 0.6f + 0.2f;
                        ** continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var4_2 = (var2_1 | 1072305462) ^ -605361595;
                        break block10;
                        break;
                    }
                }
                var2_1 = lI.l & 1072305462 ^ 1833486235;
                var4_2 = 0;
                break block12;
            }
lbl17:
            // 2 sources

            block9: while (true) {
                switch (var4_2) {
                    default: {
                        continue block9;
                    }
                    case -1543488006: {
                        ** continue;
                    }
                    case 366536128: {
                        break;
                    }
                    case 1530910253: {
                        var3_4 ^= var4_2 ^ 1586351825;
                        ** continue;
                    }
                }
                var4_2 = (var2_1 | 1072305462) ^ 617939346;
                continue;
                break;
            }
        }
        var3_4 = (var2_1 | 1072305462) ^ 2106086108;
        var4_2 = (var2_1 | 1072305462) ^ 1781674623;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    protected boolean isOutsideTolerance(double var1_1) {
        block23: {
            block22: {
                break block23;
lbl1:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 210681420;
                    break block22;
                    break;
                }
                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ -176397234;
                    break block22;
                    break;
                }
lbl7:
                // 1 sources

                while (true) {
                    switch (var5_6) {
                        case 1090048981: {
                            var5_6 ^= -1576865274;
                            ** GOTO lbl14
                        }
                        case 1141013834: {
                            var5_6 ^= -83300669;
lbl14:
                            // 2 sources

                            if (v0 <= Math.max((long)Math.round(v1), 0L)) ** continue;
                            ** continue;
                        }
                    }
                    var5_6 ^= -83267444;
                    continue;
                    break;
                }
            }
lbl19:
            // 2 sources

            block20: while (true) {
                switch (var6_4) {
                    default: {
                        continue block20;
                    }
                    case 1250896785: {
                        var5_6 ^= var6_4 ^ 1697213699;
                        var6_4 = (var4_3 | var7_2) ^ 2024785971;
                        continue block20;
                    }
                    case 1119581346: {
                        var5_6 ^= var6_4 ^ -534524818;
                        var6_4 = (var4_3 | var7_2) ^ 1242652677;
                        continue block20;
                    }
                    case -1283591789: {
                        var5_6 ^= var6_4 ^ -1663322367;
                        var6_4 = (var4_3 | var7_2) ^ -1796574200;
                        continue block20;
                    }
                    case 723074007: {
                        v2 = true;
                        break;
                    }
                    case -169725990: {
                        v0 = Math.round(var1_1 / (double)var3_5);
                        v1 = this.p / var3_5;
                        ** continue;
                    }
                    case -950237204: {
                        v2 = false;
                    }
                }
                var5_6 ^= -1712219775;
                return v2;
            }
        }
        var7_2 = -1520301601;
        var4_3 = lI.l & -1520301601 ^ 1003573012;
        var6_4 = 0;
        var5_6 = (var4_3 | var7_2) ^ -1500389260;
        var6_4 = (var4_3 | var7_2) ^ 565445835;
        block21: while (true) {
            switch (var6_4) {
                default: {
                    continue block21;
                }
                case -1639494892: {
                    var6_4 = (var4_3 | var7_2) ^ 397125366;
                    continue block21;
                }
                case -1470568151: {
                    var5_6 ^= var6_4 ^ 1470137092;
                    var6_4 = (var4_3 | var7_2) ^ -486494960;
                    continue block21;
                }
                case 1559487183: 
            }
            break;
        }
        var3_5 = this.getMouseScale() * 0.15f;
        var6_4 = (var4_3 | var7_2) ^ -45597827;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    protected double applyYawAcceleration(double var1_1, double var3_2) {
        block62: {
            block61: {
                block53: {
                    block59: {
                        block55: {
                            block54: {
                                block56: {
                                    block60: {
                                        block64: {
                                            block63: {
                                                block57: {
                                                    block58: {
                                                        break block63;
lbl1:
                                                        // 1 sources

                                                        while (true) {
                                                            var12_6 ^= var13_5 ^ 490324899;
                                                            ** GOTO lbl158
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
                                                            var13_5 = (var11_4 | var14_3) ^ 871197989;
                                                            break block53;
                                                            break;
                                                        }
lbl9:
                                                        // 1 sources

                                                        while (true) {
                                                            var12_6 ^= -1381435508;
                                                            break block54;
                                                            break;
                                                        }
lbl12:
                                                        // 1 sources

                                                        while (true) {
                                                            var12_6 ^= var13_5 ^ 1956167940;
                                                            break block55;
                                                            break;
                                                        }
lbl15:
                                                        // 1 sources

                                                        return var1_1;
lbl17:
                                                        // 1 sources

                                                        while (true) {
                                                            var12_6 ^= 805336438;
                                                            break block56;
                                                            break;
                                                        }
lbl20:
                                                        // 1 sources

                                                        while (true) {
                                                            if (this.g) break block57;
                                                            var13_5 = (var11_4 | var14_3) ^ -848242257;
                                                            break block53;
                                                            break;
                                                        }
lbl24:
                                                        // 1 sources

                                                        while (true) {
                                                            var12_6 ^= var13_5 ^ -1214584461;
                                                            break block58;
                                                            break;
                                                        }
lbl27:
                                                        // 1 sources

                                                        while (true) {
                                                            var13_5 = (var11_4 | var14_3) ^ -1664732049;
                                                            break block53;
                                                            break;
                                                        }
                                                        var5_7 = var3_2 / 100.0;
                                                        var12_6 ^= -1357548179;
                                                        ** GOTO lbl46
lbl33:
                                                        // 1 sources

                                                        while (true) {
                                                            var13_5 = (var11_4 | var14_3) ^ 1014632350;
                                                            break block53;
                                                            break;
                                                        }
                                                    }
                                                    var13_5 = (var11_4 | var14_3) ^ -1034225349;
                                                    break block53;
lbl39:
                                                    // 1 sources

                                                    while (true) {
                                                        var12_6 ^= var13_5 ^ 589171138;
                                                        break block59;
                                                        break;
                                                    }
lbl42:
                                                    // 1 sources

                                                    block38: while (true) {
                                                        switch (var12_6) {
                                                            case 1583533580: {
                                                                ** continue;
                                                            }
lbl46:
                                                            // 1 sources

                                                            var7_9 = var5_7 + 0.7;
                                                            ** continue;
lbl48:
                                                            // 1 sources

                                                            return var1_1 + var3_2 * 0.05;
lbl50:
                                                            // 1 sources

                                                            return var1_1 * (225.0 + var3_2) / 180.0;
                                                            case 129846194: {
                                                                var13_5 = (var11_4 | var14_3) ^ 1001318772;
                                                                break block38;
                                                            }
                                                            default: {
                                                                var13_5 = (var11_4 | var14_3) ^ -1795433526;
                                                                break block38;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break block53;
lbl59:
                                                    // 1 sources

                                                    while (true) {
                                                        if (!this.h) break block60;
                                                        ** GOTO lbl156
                                                        break;
                                                    }
lbl62:
                                                    // 1 sources

                                                    while (true) {
                                                        var12_6 ^= var13_5 ^ -1851764322;
                                                        break block61;
                                                        break;
                                                    }
                                                    while (true) {
                                                        var13_5 = (var11_4 | var14_3) ^ 32139494;
                                                        break block53;
                                                        break;
                                                    }
                                                }
                                                var13_5 = (var11_4 | var14_3) ^ -2081378546;
                                                break block53;
lbl71:
                                                // 1 sources

                                                while (true) {
                                                    var13_5 = (var11_4 | var14_3) ^ 586840607;
                                                    break block53;
                                                    break;
                                                }
                                            }
                                            var14_3 = -1215481564;
                                            var11_4 = lI.l & -1215481564 ^ -1196371305;
                                            var13_5 = 0;
                                            break block64;
lbl79:
                                            // 1 sources

                                            while (true) {
                                                var12_6 ^= var13_5 ^ -308931207;
                                                ** continue;
                                                break;
                                            }
                                        }
                                        var12_6 = (var11_4 | var14_3) ^ -104402245;
                                        var13_5 = (var11_4 | var14_3) ^ -1106626314;
                                        break block53;
lbl86:
                                        // 1 sources

                                        while (true) {
                                            if (this.i) ** continue;
                                            break block62;
                                            break;
                                        }
lbl89:
                                        // 1 sources

                                        while (true) {
                                            var13_5 = (var11_4 | var14_3) ^ 396722802;
                                            break block53;
                                            break;
                                        }
                                    }
                                    var13_5 = (var11_4 | var14_3) ^ 1804453866;
                                    break block53;
                                }
                                var9_8 = 0.4 + 2.0 * Math.pow(var7_9, 3.0) + Math.pow(var7_9, 2.0);
                                ** while (true)
lbl98:
                                // 1 sources

                                while (true) {
                                    var12_6 ^= var13_5 ^ -2146727419;
                                    ** continue;
                                    break;
                                }
lbl101:
                                // 1 sources

                                while (true) {
                                    var12_6 ^= var13_5 ^ -1755709206;
                                    ** continue;
                                    break;
                                }
                            }
                            return var1_1 * Math.min(Math.max(1.0, var9_8), 4.0);
                        }
lbl107:
                        // 2 sources

                        while (true) {
                            var13_5 = (var11_4 | var14_3) ^ 1039812970;
                            break block53;
                            break;
                        }
                    }
                    var13_5 = (var11_4 | var14_3) ^ -349585176;
                }
lbl113:
                // 4 sources

                block51: while (true) {
                    switch (var13_5) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block51;
                            }
                            break;
                        }
                        case 1926046232: {
                            ** continue;
                        }
                        case -1940875630: {
                            ** continue;
                        }
                        case -2079124797: {
                            ** continue;
                        }
                        case 2112291468: {
                            ** continue;
                        }
                        case 1419000671: {
                            ** continue;
                        }
                        case -919377170: {
                            ** continue;
                        }
                        case -1656258136: {
                            break block61;
                        }
                        case -735036323: {
                            ** continue;
                        }
                        case 1762485491: {
                            ** continue;
                        }
                        case -2109230371: {
                            break block51;
                        }
                        case -1474790971: {
                            ** continue;
                        }
                        case 595316696: {
                            ** continue;
                        }
                        case -530748297: {
                            ** continue;
                        }
                        case -2084047831: {
                            ** continue;
                        }
                        case -1153413864: {
                            ** continue;
                        }
                        case -1263694507: {
                            ** continue;
                        }
                        case 1011700921: {
                            ** continue;
                        }
                        case -1101556911: {
                            ** continue;
                        }
                        case 28820289: {
                            ** continue;
                        }
lbl156:
                        // 1 sources

                        var13_5 = (var11_4 | var14_3) ^ 83736239;
                        ** GOTO lbl-1000
lbl158:
                        // 1 sources

                        var13_5 = (var11_4 | var14_3) ^ 185628386;
                        ** continue;
                    }
                    break;
                }
                var13_5 = (var11_4 | var14_3) ^ 1608554432;
                ** GOTO lbl113
                {
                    ** case 726016125:
                }
lbl163:
                // 1 sources

                var12_6 ^= var13_5 ^ -1062320525;
                ** while (true)
            }
            var13_5 = (var11_4 | var14_3) ^ -693067964;
            ** GOTO lbl113
        }
        var13_5 = (var11_4 | var14_3) ^ 1989054809;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    protected double applyPitchAcceleration(double var1_1, double var3_2) {
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
    protected float addPendingStep(float var1_1, double var2_2, double var4_3) {
        block44: {
            block41: {
                block40: {
                    block49: {
                        block42: {
                            block45: {
                                block51: {
                                    block47: {
                                        block46: {
                                            block48: {
                                                block52: {
                                                    block43: {
                                                        block50: {
                                                            break block50;
lbl1:
                                                            // 1 sources

                                                            while (true) {
                                                                var11_9 ^= var12_6 ^ -907140775;
                                                                break block40;
                                                                break;
                                                            }
lbl4:
                                                            // 1 sources

                                                            while (true) {
                                                                var11_9 ^= var12_6 ^ -1536002654;
                                                                ** GOTO lbl74
                                                                break;
                                                            }
lbl7:
                                                            // 1 sources

                                                            while (true) {
                                                                var11_9 ^= var12_6 ^ -1398663509;
                                                                break block41;
                                                                break;
                                                            }
                                                        }
                                                        var13_4 = 1760952836;
                                                        var10_5 = lI.l & 1760952836 ^ 913870398;
                                                        var12_6 = 0;
                                                        break block51;
lbl15:
                                                        // 1 sources

                                                        while (true) {
                                                            var11_9 ^= var12_6 ^ 991402448;
                                                            break block42;
                                                            break;
                                                        }
lbl18:
                                                        // 1 sources

                                                        while (true) {
                                                            if (this.k) break block43;
                                                            ** GOTO lbl86
                                                            break;
                                                        }
lbl21:
                                                        // 1 sources

                                                        while (true) {
                                                            var11_9 ^= var12_6 ^ 1731552553;
                                                            ** GOTO lbl58
                                                            break;
                                                        }
                                                    }
                                                    var12_6 = (var10_5 | var13_4) ^ -1480055157;
                                                    break block52;
lbl27:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl29:
                                                    // 1 sources

                                                    while (true) {
                                                        v0 = (double)var1_1 - var8_8;
                                                        ** GOTO lbl71
                                                        break;
                                                    }
                                                }
lbl33:
                                                // 7 sources

                                                block29: while (true) {
                                                    switch (var12_6) lbl-1000:
                                                    // 5 sources

                                                    {
                                                        while (true) {
                                                            default: {
                                                                continue block29;
                                                            }
                                                            break;
                                                        }
                                                        case 159079507: {
                                                            ** continue;
                                                        }
                                                        case 504354573: {
                                                            ** continue;
                                                        }
                                                        case -349821570: {
                                                            ** continue;
                                                        }
                                                        case -1966460126: {
                                                            ** continue;
                                                        }
                                                        case -246927045: {
                                                            v1 = (double)var1_1 + var4_3;
                                                            break block29;
                                                        }
                                                        case 1891854687: {
                                                            var11_9 ^= var12_6 ^ -573947730;
                                                            break block44;
                                                        }
lbl52:
                                                        // 1 sources

                                                        while (true) {
                                                            var12_6 = (var10_5 | var13_4) ^ -197870308;
                                                            ** GOTO lbl-1000
                                                            break;
                                                        }
lbl55:
                                                        // 1 sources

                                                        while (true) {
                                                            var12_6 = (var10_5 | var13_4) ^ 238937953;
                                                            ** GOTO lbl-1000
                                                            break;
                                                        }
lbl58:
                                                        // 1 sources

                                                        var12_6 = (var10_5 | var13_4) ^ -734070257;
lbl59:
                                                        // 6 sources

                                                        block33: while (true) {
                                                            switch (var12_6) {
                                                                default: {
                                                                    continue block33;
                                                                }
                                                                case -1428332288: {
                                                                    ** continue;
                                                                }
                                                                case -958976869: {
                                                                    ** continue;
                                                                }
                                                                case -1695166366: {
                                                                    ** continue;
                                                                }
                                                                case -272329417: {
                                                                    ** continue;
                                                                }
lbl71:
                                                                // 2 sources

                                                                while (true) {
                                                                    var11_9 ^= -1450003839;
                                                                    break block45;
                                                                    break;
                                                                }
lbl74:
                                                                // 1 sources

                                                                var12_6 = (var10_5 | var13_4) ^ 2057428543;
                                                                ** GOTO lbl-1000
                                                                case -1430227919: {
                                                                    v0 = (double)var1_1 + var8_8;
                                                                    ** continue;
                                                                }
                                                                case 532772348: {
                                                                    if (!(var2_2 > 0.0)) break block46;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        case -388205496: {
                                                            break block47;
                                                        }
lbl83:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_8 = Math.min(var4_3, var6_7);
                                                            break block48;
                                                            break;
                                                        }
lbl86:
                                                        // 1 sources

                                                        var12_6 = (var10_5 | var13_4) ^ 1626429747;
                                                        ** continue;
                                                    }
                                                    break;
                                                }
lbl88:
                                                // 2 sources

                                                while (true) {
                                                    var11_9 ^= -1776117303;
                                                    break block49;
                                                    break;
                                                }
lbl91:
                                                // 1 sources

                                                while (true) {
                                                    var12_6 = (var10_5 | var13_4) ^ -1780962496;
                                                    ** GOTO lbl33
                                                    break;
                                                }
                                            }
                                            var12_6 = (var10_5 | var13_4) ^ -735842498;
                                            ** GOTO lbl59
                                        }
                                        var12_6 = (var10_5 | var13_4) ^ -1205230939;
                                        ** GOTO lbl59
                                    }
                                    var12_6 = (var10_5 | var13_4) ^ 1193896542;
                                    ** GOTO lbl33
                                }
                                var11_9 = (var10_5 | var13_4) ^ -1809785741;
                                var12_6 = (var10_5 | var13_4) ^ -1776092554;
                                ** GOTO lbl33
                            }
                            return (float)v0;
                            while (true) {
                                var12_6 = (var10_5 | var13_4) ^ 2005258861;
                                ** GOTO lbl33
                                break;
                            }
lbl112:
                            // 1 sources

                            while (true) {
                                var12_6 = (var10_5 | var13_4) ^ -469016996;
                                ** GOTO lbl59
                                break;
                            }
                            {
                                case -650729291: {
                                    var11_9 ^= var12_6 ^ -387405520;
                                    ** continue;
                                }
                            }
                            ** while (true)
                        }
                        var12_6 = (var10_5 | var13_4) ^ -1858462967;
                        ** GOTO lbl59
                        {
                            case 73355265: {
                                v1 = (double)var1_1 - var4_3;
                                ** continue;
                            }
                        }
                    }
                    return (float)v1;
                    var6_7 = Math.abs(var2_2 / (double)(this.getMouseScale() * 0.15f));
                    var11_9 ^= 316074012;
                    ** while (true)
                    {
                        case -178126897: {
                            if (!(var2_2 > 0.0)) ** continue;
                            ** continue;
                        }
                    }
                }
                var12_6 = (var10_5 | var13_4) ^ 1631583170;
                ** while (true)
            }
            var12_6 = (var10_5 | var13_4) ^ -1952484879;
            ** GOTO lbl33
        }
        var12_6 = (var10_5 | var13_4) ^ -1883848955;
        ** while (true)
        {
            ** case 970450016:
        }
lbl143:
        // 1 sources

        var11_9 ^= var12_6 ^ 1763028608;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void restoreCapturedRotationIfRequested() {
        block48: {
            var5_1 = -146671045;
            var2_2 = lI.l & -146671045 ^ 35116875;
            var4_3 = 0;
            var3_5 = (var2_2 | var5_1) ^ -235929431;
            var4_3 = (var2_2 | var5_1) ^ -881201179;
            if (true) ** GOTO lbl32
lbl7:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ -178886572;
                break block48;
                break;
            }
lbl10:
            // 2 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ -1966437659;
                break block48;
                break;
            }
            block35: while (true) {
                switch (var4_3) {
                    case -143696988: {
                        var1_4 = class_310.method_1551().field_1724;
                        ** break;
                    }
                    case 2036994673: {
                        var3_5 ^= var4_3 ^ 113183687;
                        ** GOTO lbl34
                    }
                    case 1009651870: {
                        var4_3 = (var2_2 | var5_1) ^ -605737986;
                        ** GOTO lbl32
                    }
lbl24:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -670866507;
                    break block48;
                    case 268484958: {
                        var4_3 = !this.shouldRestoreCapturedRotation() ? (var2_2 | var5_1) ^ -1908544246 : (var2_2 | var5_1) ^ 1472637523;
                        ** GOTO lbl32
                    }
                    case -1601088216: {
                        var3_5 ^= var4_3 ^ 250875399;
                        var4_3 = (var2_2 | var5_1) ^ 3712223;
                    }
lbl32:
                    // 6 sources

                    default: {
                        continue block35;
                    }
lbl34:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -738264922;
                    continue block35;
                    case 749917317: {
                        var3_5 ^= var4_3 ^ -1841527985;
                        var4_3 = (var2_2 | var5_1) ^ -413712859;
                        ** GOTO lbl32
                    }
lbl40:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1548124249;
                        break block48;
                        break;
                    }
                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -607966779;
                        break block48;
lbl46:
                        // 2 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -1449332580;
                            break block48;
lbl49:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ 1927791398;
                                break block48;
lbl52:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 1340475279;
                                    break block48;
                                    break;
                                }
lbl55:
                                // 2 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -1092074794;
                                    break block48;
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
lbl58:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 1310982160;
                        break block48;
lbl61:
                        // 2 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 1311344120;
                            break block48;
                            break;
                        }
lbl64:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -778998422;
                            break block48;
lbl67:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -896568019;
                                break block48;
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    case 615057373: 
                }
                break;
            }
            return;
        }
        block47: while (true) {
            switch (var4_3) {
                default: {
                    continue block47;
                }
                case 1037601366: {
                    var4_3 = (var2_2 | var5_1) ^ -1640098491;
                    continue block47;
                }
                case 794074318: {
                    var3_5 ^= var4_3 ^ 746768918;
                    ** continue;
                }
                case 1424916700: {
                    var4_3 = (var2_2 | var5_1) ^ -755574034;
                    continue block47;
                }
                case 149524549: {
                    if (var1_4.field_6004 == this.r) ** GOTO lbl61
                    var4_3 = (var2_2 | var5_1) ^ 1381376806;
                    continue block47;
                }
                case -1526604707: {
                    var4_3 = (var2_2 | var5_1) ^ -781039351;
                    continue block47;
                }
                case 1768548926: {
                    var1_4.method_36456(this.s);
                    ** GOTO lbl55
                }
                case 640005746: {
                    var1_4.field_6004 = this.r;
                    ** continue;
                }
                case 1590366183: {
                    var3_5 ^= var4_3 ^ 2069234006;
                    var4_3 = (var2_2 | var5_1) ^ -1606468903;
                    continue block47;
                }
                case 945977547: {
                    if (var1_4.method_36454() != this.s) ** break;
                    ** continue;
                    ** continue;
                }
                case 650547729: {
                    var4_3 = (var2_2 | var5_1) ^ -374444772;
                    continue block47;
                }
                case 519672423: {
                    var1_4.field_5982 = this.l;
                    ** GOTO lbl46
                }
                case 747951806: {
                    var3_5 ^= var4_3 ^ -466462921;
                    ** break;
                }
                case 2107471262: {
                    var3_5 ^= var4_3 ^ 1860982131;
                    var4_3 = (var2_2 | var5_1) ^ -4296898;
                    continue block47;
                }
                case -1183580309: {
                    var3_5 ^= var4_3 ^ 837843819;
                    ** continue;
                }
                case 1237302701: {
                    var3_5 ^= var4_3 ^ 28976452;
                    ** continue;
                }
                case 1466484130: {
                    if (var1_4.method_36455() == this.q) ** GOTO lbl10
                    ** continue;
                }
                case -2052047779: {
                    if (var1_4.field_5982 != this.l) ** break;
                    ** continue;
                    ** continue;
                }
                case -1196295948: {
                    if (var1_4 != null) ** continue;
                    ** continue;
                }
                case 631317909: {
                    var1_4.method_36457(this.q);
                    ** continue;
                }
lbl139:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -818575440;
                continue block47;
                case -1182893437: {
                    var3_5 ^= var4_3 ^ -1330608680;
                    var4_3 = (var2_2 | var5_1) ^ -1952808731;
                    continue block47;
                }
                case 2093842334: {
                    return;
                }
                case 33658671: 
            }
            break;
        }
    }
}

