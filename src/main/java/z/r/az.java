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
import z.r.dm;
import z.r.eC;
import z.r.kd;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class az
extends eC<Integer> {
    private static final /* synthetic */ String a;
    private static final int[] b;
    public static final int a;
    private static final int[] a;

    /*
     * Enabled aggressive block sorting
     */
    public az(String string, int n2) {
        int n3 = a & 0xC9B91039 ^ 0x4EBFE3B5;
        int n4 = (n3 | 0xC9B91039) ^ 0x75A953BC;
        n4 ^= 0x32766F18;
        super(string, n2);
        n4 ^= 0x80B8FD5;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int getRed() {
        int n2 = 1783989388;
        int n3 = a & 0x286FAF55 ^ 0x293489E9;
        int n4 = 0;
        int n5 = (n3 | 0x286FAF55) ^ 0xE2F9EE9B;
        n4 = (n3 | 0x286FAF55) ^ 0xD83A462E;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case 211641066: {
                    n5 ^= n4 ^ 0x2A82896F;
                    n4 = (n3 | 0x286FAF55) ^ 0x6B458424;
                    continue block5;
                }
                case -247076397: {
                    n4 = (n3 | 0x286FAF55) ^ 0x25E2CD17;
                    continue block5;
                }
                case 1111108569: 
            }
            break;
        }
        return (Integer)((Object)this.a) >> az.qZ((n5 | n4 ^ n2) ^ (n4 ^ 0x401A26A7), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x7ADA9828))) & az.qZ((n5 | n4 ^ n2) ^ (n4 ^ 0x401A26A6), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xDFF9E77B)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public int getGreen() {
        int n2 = -1427471839;
        int n3 = a & 0x56D7E506 ^ 0xB125DE98;
        int n4 = 0;
        int n5 = (n3 | 0x56D7E506) ^ 0xB6BD041D;
        n4 = (n3 | 0x56D7E506) ^ 0x6E169C9A;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -63084761: {
                    return (Integer)((Object)this.a) >> az.qZ((n5 | n4 ^ n2) ^ (n4 ^ 0x453D28DB), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xD46A2E11))) & az.qZ((n5 | n4 ^ n2) ^ (n4 ^ 0x453D28DA), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xDDB0BAA)));
                }
                case -1713282300: {
                    n4 = (n3 | 0x56D7E506) ^ 0xBCD83297;
                    continue block5;
                }
                case 1261423881: 
            }
            n5 ^= n4 ^ 0xE6BBEFD;
            n4 = (n3 | 0x56D7E506) ^ 0xBCA98B9;
        }
    }

    private static int qZ(int n2, int n3) {
        int n4 = 1034704127;
        int n5 = 816982846;
        int n6 = b[n2 ^ ((n5 | n4) ^ 0xD261DD76)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x3DBE3DE4;
        n6 -= (n5 | n4) ^ 0x3DBE30F7;
        n6 -= (n5 | n4) ^ 0x3DBEDEDF;
        n6 ^= (n5 | n4) ^ 0x3DBE225C;
        n6 ^= (n5 | n4) ^ 0x3DBE9EFB;
        n6 ^= (n5 | n4) ^ 0x3DBEE5EA;
        n6 -= (n5 | n4) ^ 0x3DBE8BD8;
        n6 ^= (n5 | n4) ^ 0x3DBEEDEA;
        return n6 ^= (n5 | n4) ^ 0x3DBEFC85;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public int getBlue() {
        int n2 = a & 0xE6A95C4B ^ 0x3BFEEB04;
        int n3 = 0;
        int n4 = (n2 | 0xE6A95C4B) ^ 0x18768300;
        n3 = (n2 | 0xE6A95C4B) ^ 0xAB67E822;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1419253613: {
                    n3 = (n2 | 0xE6A95C4B) ^ 0x378EB204;
                    continue block5;
                }
                case -932098741: {
                    n4 ^= n3 ^ 0xA6934AF0;
                    n3 = (n2 | 0xE6A95C4B) ^ 0xED1DDFFD;
                    continue block5;
                }
                case 316809394: 
            }
            break;
        }
        return (Integer)((Object)this.a) & az.qZ((n4 | n3 ^ 0xF44B7CF9) ^ (n3 ^ 0x12D6FDC0), (n2 | n3 ^ 0xF44B7CF9) ^ ((n4 | n3 ^ 0xF44B7CF9) ^ (n3 ^ 0x90861EB2)));
    }

    /*
     * Exception decompiling
     */
    public static void rgbToHsb(int var0, float[] var1_1) {
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
    public float getHue() {
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
    public float getSaturation() {
        block38: {
            block39: {
                block40: {
                    var5_1 = -407074463;
                    var2_2 = az.a & -407074463 ^ -2053750874;
                    var4_3 = 0;
                    ** GOTO lbl78
lbl5:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1896460481;
                        break block38;
lbl8:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -481680884;
                            break block38;
                            break;
                        }
                        break;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -517826399;
                        break block39;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_3 ^ -930647289;
                        break block40;
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -228648200;
                        break block38;
                        break;
                    }
lbl20:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 2052058442;
                        break block38;
                        break;
                    }
lbl23:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_3 ^ -971876788;
                        ** GOTO lbl73
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var1_4 = new float[3];
                        ** GOTO lbl80
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 1740536619;
                        break block38;
                        break;
                    }
                }
lbl33:
                // 2 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -406552856;
                    break block38;
                    break;
                }
lbl36:
                // 1 sources

                return var1_4[1];
lbl38:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_3 ^ 1995594390;
                    ** GOTO lbl75
                    break;
                }
            }
lbl42:
            // 3 sources

            block32: while (true) {
                switch (var4_3) {
                    default: {
                        continue block32;
                    }
                    case -1867307154: {
                        ** continue;
                    }
                    case 479123092: {
                        ** continue;
                    }
                    case 110896966: {
                        ** GOTO lbl71
                    }
                }
                break;
            }
lbl52:
            // 1 sources

            while (true) {
                var3_5 ^= var4_3 ^ -1324914473;
                ** continue;
                break;
            }
        }
        block34: while (true) {
            switch (var4_3) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block34;
                    }
                    break;
                }
                case 8044815: {
                    ** continue;
                }
                case -1156953403: {
                    ** continue;
                }
                case -2147433268: {
                    ** continue;
                }
                case -1645129043: {
                    ** continue;
                }
                case 367109407: {
                    ** continue;
                }
lbl71:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 1997379721;
                ** GOTO lbl42
lbl73:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -80713357;
                ** continue;
lbl75:
                // 2 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -690595569;
                    ** GOTO lbl-1000
                    break;
                }
lbl78:
                // 1 sources

                var3_5 = (var2_2 | var5_1) ^ 407575724;
                ** continue;
lbl80:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -510940818;
                ** GOTO lbl-1000
lbl82:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 1555363106;
                    ** continue;
                    break;
                }
                case 104142473: {
                    var3_5 ^= var4_3 ^ 424238615;
                    ** continue;
                }
                case 83140075: {
                    az.rgbToHsb((Integer)this.a, var1_4);
                    ** continue;
                }
                case 828958440: {
                    switch (var3_5) {
                        case -1238852873: {
                            ** continue;
                        }
                        case 960155338: {
                            ** continue;
                        }
                        ** default:
lbl98:
                        // 1 sources

                        ** continue;
                    }
                }
                case 1766387928: {
                    ** continue;
                }
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public float getBrightness() {
        var5_1 = -784617735;
        var2_2 = az.a & -784617735 ^ 237716884;
        var4_3 = 0;
        if (true) ** GOTO lbl23
        block11: while (true) {
            switch (var4_3) lbl-1000:
            // 5 sources

            {
                while (true) {
                    default: {
                        continue block11;
                    }
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_3 ^ -2109230324;
                    ** GOTO lbl21
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -148723880;
                    ** GOTO lbl-1000
                    break;
                }
                case 672745637: {
                    az.rgbToHsb((Integer)this.a, var1_4);
                    ** GOTO lbl29
                }
lbl19:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
lbl21:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -61497211;
                ** GOTO lbl37
lbl23:
                // 1 sources

                var3_5 = (var2_2 | var5_1) ^ -180606565;
                var4_3 = (var2_2 | var5_1) ^ 736896644;
                ** GOTO lbl37
                var1_4 = new float[3];
                var4_3 = (var2_2 | var5_1) ^ -1672483394;
                ** GOTO lbl-1000
lbl29:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 154416940;
                ** GOTO lbl-1000
lbl31:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 1863665663;
                    ** GOTO lbl37
                    break;
                }
lbl34:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -1994790927;
                    ** continue;
                    break;
                }
lbl37:
                // 3 sources

                block18: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block18;
                        }
                        case -1339119614: {
                            ** continue;
                        }
                        case 594431864: {
                            ** continue;
                        }
                        ** case -187184775:
lbl46:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
                case 1131676227: {
                    var3_5 ^= var4_3 ^ 137026194;
                    ** continue;
                }
                case 1445070860: {
                    return var1_4[2];
                }
                case -703604527: 
            }
            break;
        }
        var3_5 ^= var4_3 ^ 19026408;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void setFromHsb(float var1_1, float var2_2, float var3_3) {
        block30: {
            block31: {
                block29: {
                    var12_4 = -1095407077;
                    var11_5 = -428968636;
                    var8_6 = az.a & -428968636 ^ -281624804;
                    var10_7 = 0;
                    ** GOTO lbl48
lbl6:
                    // 1 sources

                    return;
lbl8:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var10_7 = (var8_6 | var11_5) ^ 1102318043;
                        ** GOTO lbl26
                        break;
                    }
lbl13:
                    // 1 sources

                    block18: while (true) {
                        var5_9 = Math.max(0.0f, Math.min(1.0f, var2_2));
                        ** GOTO lbl33
lbl16:
                        // 3 sources

                        block19: while (true) {
                            switch (var10_7) lbl-1000:
                            // 6 sources

                            {
                                default: {
                                    continue block19;
                                }
                                case -1068665646: {
                                    ** continue;
                                }
                                case 1490755423: {
                                    ** continue;
                                }
lbl24:
                                // 1 sources

                                while (true) {
                                    ** GOTO lbl46
                                    break;
                                }
lbl26:
                                // 2 sources

                                block22: while (true) {
                                    switch (var10_7) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block22;
                                            }
                                            break;
                                        }
                                        case -1413561488: {
                                            ** continue;
                                        }
lbl33:
                                        // 1 sources

                                        var9_12 ^= -997098946;
                                        ** GOTO lbl68
lbl35:
                                        // 1 sources

                                        while (true) {
                                            var10_7 = (var8_6 | var11_5) ^ -1213865981;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl38:
                                        // 1 sources

                                        while (true) {
                                            var10_7 = (var8_6 | var11_5) ^ -1535995149;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case 470846335: {
                                            break block18;
                                        }
                                        case -431052097: {
                                            var9_12 ^= var10_7 ^ 2028523111;
                                            break block29;
                                        }
lbl46:
                                        // 1 sources

                                        var7_11 = (Integer)this.a >>> az.qZ(((var9_12 ^= -1295748179) | var11_5) ^ 145808741, (var8_6 | var11_5) ^ ((var9_12 | var11_5) ^ -1215750359)) & az.qZ((var9_12 | var11_5) ^ 145808740, (var8_6 | var11_5) ^ ((var9_12 | var11_5) ^ 630654860));
                                        ** continue;
lbl48:
                                        // 1 sources

                                        var9_12 = (var8_6 | var11_5) ^ 1027070514;
                                        var10_7 = (var8_6 | var11_5) ^ 1153449004;
                                        ** continue;
lbl51:
                                        // 1 sources

                                        while (true) {
                                            var10_7 = (var8_6 | var11_5) ^ -210865117;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl54:
                                        // 1 sources

                                        while (true) {
                                            var10_7 = (var8_6 | var11_5) ^ 690517854;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case -1362430329: {
                                            var9_12 ^= var10_7 ^ 2060935499;
                                            break block30;
                                        }
                                        case -1282083307: {
                                            var7_11 = az.qZ((var9_12 | var10_7 ^ 1442480977) ^ (var10_7 ^ -1423692971), (var8_6 | var10_7 ^ 1442480977) ^ ((var9_12 | var10_7 ^ 1442480977) ^ (var10_7 ^ -687541597)));
                                            while (true) {
                                                var10_7 = (var8_6 | var11_5) ^ -593035738;
                                                ** GOTO lbl-1000
                                                break;
                                            }
                                        }
                                        case -967407614: {
                                            if (var7_11 != 0) ** continue;
                                            ** continue;
                                        }
lbl68:
                                        // 1 sources

                                        var6_10 = Math.max(0.0f, Math.min(1.0f, var3_3));
                                        ** continue;
                                        case -2057377520: {
                                            var4_8 = Math.max(0.0f, Math.min(1.0f, var1_1));
                                            break block22;
                                        }
                                    }
                                    break;
                                }
                                break block31;
                            }
                            break;
                        }
                        break;
                    }
                    var10_7 = (var8_6 | var11_5) ^ 1558841673;
                    ** GOTO lbl16
                    this.setValue(var7_11 << az.qZ((var9_12 | var10_7 ^ var12_4) ^ (var10_7 ^ 1231766206), (var8_6 | var10_7 ^ var12_4) ^ ((var9_12 | var10_7 ^ var12_4) ^ (var10_7 ^ 274129039))) | az.hsbToRgb(var4_8, var5_9, var6_10) & az.qZ((var9_12 | var10_7 ^ var12_4) ^ (var10_7 ^ 1231766205), (var8_6 | var10_7 ^ var12_4) ^ ((var9_12 | var10_7 ^ var12_4) ^ (var10_7 ^ -1741998776))));
                    var10_7 = (var8_6 | var11_5) ^ 154162659;
                    ** GOTO lbl16
                    {
                        case 869794170: {
                            var9_12 ^= var10_7 ^ -21052258;
                            ** continue;
                        }
                        ** case 1259105711:
                    }
lbl83:
                    // 1 sources

                    var9_12 ^= var10_7 ^ 996833676;
                    ** while (true)
                }
                var10_7 = (var8_6 | var11_5) ^ 791907214;
                ** while (true)
            }
            var9_12 ^= -1861835629;
            ** while (true)
        }
        var10_7 = (var8_6 | var11_5) ^ 1780487756;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void setFromHue(float var1_1) {
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
    @Override
    public void setValue(Integer n2) {
        int n3 = -729052942;
        int n4 = a & 0xD48B88F2 ^ 0xD22BB1B9;
        int n5 = 0;
        int n6 = (n4 | n3) ^ 0x6E10F869;
        n5 = (n4 | n3) ^ 0x7D55B1EC;
        block9: while (true) {
            switch (n5) {
                default: {
                    continue block9;
                }
                case 369583000: {
                    n6 ^= n5 ^ 0x94AEFCAC;
                    n5 = (n4 | n3) ^ 0xD5C745B5;
                    continue block9;
                }
                case 57474126: {
                    dm.requestSave();
                    n5 = (n4 | n3) ^ 0xE17BA284;
                    continue block9;
                }
                case -1409415145: {
                    n5 = (n4 | n3) ^ 0xAB86183A;
                    continue block9;
                }
                case 1840564937: {
                    super.setValue(n2);
                    n5 = (n4 | n3) ^ 0xC0ACDA63;
                    continue block9;
                }
                case 936385407: {
                    n6 ^= n5 ^ 0x6E586BDC;
                    n5 = (n4 | n3) ^ 0xBC82788D;
                    continue block9;
                }
                case 2100142529: {
                    n6 ^= n5 ^ 0x56DB31E8;
                    n5 = (n4 | n3) ^ 0xBB1F7332;
                    continue block9;
                }
                case 1781121398: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    static {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: CONTINUE without a while class org.benf.cfr.reader.bytecode.analysis.parse.statement.AssignmentPreMutation
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getTargetStartBlock(GotoStatement.java:102)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getStructuredStatement(GotoStatement.java:116)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.getStructuredStatementPlaceHolder(Op03SimpleStatement.java:550)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:727)
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
    public static int[] getPresets() {
        int n2 = a & 0x91CA3242 ^ 0x705B076C;
        int n3 = 0;
        int n4 = (n2 | 0x91CA3242) ^ 0xAEEFD1EE;
        n3 = (n2 | 0x91CA3242) ^ 0x4D17F503;
        block5: while (true) {
            switch (n3) {
                case -1382149480: {
                    return a;
                }
                case -1260077111: {
                    n4 ^= n3 ^ 0x7BD7DEAF;
                    n3 = (n2 | 0x91CA3242) ^ 0x5C4525F6;
                }
                default: {
                    continue block5;
                }
                case -1127431571: 
            }
            n3 = (n2 | 0x91CA3242) ^ 0x453F88A7;
        }
    }

    /*
     * Exception decompiling
     */
    public static int hsbToRgb(float var0, float var1_1, float var2_2) {
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
    @Override
    public String getDisplayValue() {
        int n2 = a & 0x64D90CF1 ^ 0x12A000AD;
        int n3 = 0;
        int n4 = (n2 | 0x64D90CF1) ^ 0x6788C56A;
        n3 = (n2 | 0x64D90CF1) ^ 0x49C8267E;
        block5: while (true) {
            switch (n3) {
                case 1718654633: {
                    return String.format(a, (Integer)((Object)this.a) & az.qZ((n4 | n3 ^ 0x2A99A58) ^ (n3 ^ 0x64741BC1), (n2 | n3 ^ 0x2A99A58) ^ ((n4 | n3 ^ 0x2A99A58) ^ (n3 ^ 0x4EBB4EE))));
                }
                case 1060186755: {
                    n3 = (n2 | 0x64D90CF1) ^ 0x13AB1327;
                    continue block5;
                }
                case 1699880922: {
                    n4 ^= n3 ^ 0x9920F93E;
                    n3 = (n2 | 0x64D90CF1) ^ 0x10899A54;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public kd getType() {
        int n2 = a & 0x99324DBB ^ 0x6468A6B9;
        int n3 = 0;
        int n4 = (n2 | 0x99324DBB) ^ 0xD89D7719;
        n3 = (n2 | 0x99324DBB) ^ 0xDEA91EBB;
        block5: while (true) {
            switch (n3) {
                case 1552822283: {
                    n4 ^= n3 ^ 0xE446E11C;
                    n3 = (n2 | 0x99324DBB) ^ 0x496CE8C0;
                }
                default: {
                    continue block5;
                }
                case -1273624709: {
                    return kd.b;
                }
                case 601092352: 
            }
            n3 = (n2 | 0x99324DBB) ^ 0xA1F4DFB0;
        }
    }
}

