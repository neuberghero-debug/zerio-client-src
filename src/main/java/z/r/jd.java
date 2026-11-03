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
import z.r.dj;
import z.r.fc;
import z.r.fu;
import z.r.hT;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class jd
extends hT {
    private boolean a;
    public static final int a;
    private final Consumer<Boolean> a;
    private final Supplier<Boolean> a;
    private static final int[] a;
    private final dj a;
    private boolean b;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block24: {
            var8 = 1948787800;
            jd.a = mK.a(MethodHandles.lookup().lookupClass(), 1871056198);
            var7_1 = 0;
            var6_8 = 1327556748;
            var7_1 = var8 ^ -1642112753;
            block19: while (true) {
                switch (var7_1) {
                    case 1179339853: {
                        var2_4 = (var6_8 | var7_1 ^ 845375509) ^ (var7_1 ^ 1677985340) ^ jd.a;
                        var6_8 ^= -1371963554;
                        break block19;
                    }
                    case 1272708785: {
                        var6_8 ^= var7_1 ^ -1236953114;
                        var7_1 = var8 ^ 845375509;
                        break;
                    }
                    case -365462185: {
                        var7_1 = var8 ^ 1072945897;
                    }
                }
            }
            var0_2 = "{\n\u0010+\u00b5\u00d1k\u0083\u00d6\u00b59\u008b\u00ce\u0002\\l\u0018\u00cc\u00db\u000e\u00b8\u00f4\u00ea\t".getBytes("ISO-8859-1");
            var6_8 ^= 1566388886;
            break block24;
            {
                switch (var7_1) {
                    case 1918199672: {
                        var6_8 ^= var7_1 ^ 1156762461;
                        ** break;
                    }
                    case 1928698538: {
                        var6_8 ^= var7_1 ^ -450499801;
                        ** GOTO lbl42
                    }
                    case -2124106793: {
                        var3_5 += 4;
                        if (++var4_6 >= var1_3) {
                            var7_1 = var8 ^ -248161535;
                            continue block20;
                        }
                        ** GOTO lbl51
                    }
                    case -2061664423: {
                        var6_8 ^= var7_1 ^ -948345443;
                        var7_1 = var8 ^ -1740097693;
                        continue block20;
                    }
lbl39:
                    // 1 sources

                    var7_1 = var8 ^ 526715557;
                    default: {
                        continue block20;
                    }
lbl42:
                    // 1 sources

                    var7_1 = var8 ^ -179529841;
                    continue block20;
                    case 1800220413: {
                        jd.a[var4_6] = var5_7 ^= var2_4;
                        var7_1 = var8 ^ 115195634;
                        continue block20;
                    }
lbl48:
                    // 1 sources

                    while (true) {
                        var6_8 ^= 166061662;
                        var4_6 = 0;
lbl51:
                        // 2 sources

                        var5_7 = (var0_2[var3_5] & (((var6_8 ^= -1585979992) | var8) ^ -30541917)) << ((var6_8 | var8) ^ -30542012) | (var0_2[var3_5 + 1] & ((var6_8 | var8) ^ -30541917)) << ((var6_8 | var8) ^ -30542004) | (var0_2[var3_5 + 2] & ((var6_8 | var8) ^ -30541917)) << ((var6_8 | var8) ^ -30541996) | var0_2[var3_5 + 3] & ((var6_8 | var8) ^ -30541917);
                        var7_1 = var8 ^ 108872480;
                        continue block20;
                        break;
                    }
                    case -329247941: 
                }
            }
            return;
        }
        var1_3 = var0_2.length / 4;
        var7_1 = var8 ^ 1028226115;
        block22: while (true) {
            switch (var7_1) {
                default: {
                    continue block22;
                }
                case -1567185572: {
                    jd.a = new int[var1_3];
                    var7_1 = var8 ^ 1346041900;
                    continue block22;
                }
                case 1973618640: {
                    var3_5 = 0;
                    ** continue;
                }
                case 1231116315: {
                    var6_8 ^= var7_1 ^ -1742571832;
                    var7_1 = var8 ^ -692158204;
                    continue block22;
                }
                case 605215860: 
            }
            var6_8 ^= var7_1 ^ -1038813690;
            var7_1 = var8 ^ 25895816;
        }
    }

    private static int Hf(int n2, int n3) {
        int n4 = 579848567;
        int n5 = -769138582;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xC652A16E)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xF2AF6468;
        n6 ^= (n5 | n4) ^ 0xF2AFFEB5;
        n6 -= (n5 | n4) ^ 0xF2AFE069;
        n6 ^= (n5 | n4) ^ 0xF2AFCE3F;
        n6 += (n5 | n4) ^ 0xF2AF3743;
        n6 -= (n5 | n4) ^ 0xF2AF225C;
        return n6 -= (n5 | n4) ^ 0xF2AF3FB9;
    }

    /*
     * Unable to fully structure code
     */
    public jd(Supplier<Boolean> var1_1, Consumer<Boolean> var2_2) {
        block18: {
            block16: {
                block17: {
                    block14: {
                        block15: {
                            break block15;
lbl1:
                            // 1 sources

                            while (true) {
                                var4_6 ^= var5_5 ^ -1253662300;
                                break block14;
                                break;
                            }
lbl4:
                            // 7 sources

                            block11: while (true) {
                                switch (var5_5) {
                                    default: {
                                        continue block11;
                                    }
                                    case -96792309: {
                                        ** continue;
                                    }
                                    case 1193847433: {
                                        var4_6 ^= var5_5 ^ -609543442;
                                        break;
                                    }
                                    case 150711251: {
                                        this.a = var2_2;
                                        break;
                                    }
                                }
                                var5_5 = (var3_4 | var6_3) ^ -2000502490;
                                continue;
                                break;
                            }
                        }
                        var6_3 = 1198961239;
                        var3_4 = jd.a & 1198961239 ^ 1493511918;
                        var5_5 = 0;
                        break block16;
lbl23:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ -1340026656;
                            ** GOTO lbl4
                            break;
                        }
                        {
                            case 821016795: {
                                this.a = var1_1;
                                break;
                            }
                        }
                        var5_5 = (var3_4 | var6_3) ^ 408884342;
                        ** GOTO lbl4
                        {
                            case 2077146365: {
                                var4_6 ^= var5_5 ^ 833557112;
                                break block17;
                            }
                            case -675971111: {
                                return;
                            }
                            case -1249206848: {
                                this.a = new dj(0.0f);
                                break block18;
                            }
                        }
                        var5_5 = (var3_4 | var6_3) ^ 616104450;
                        ** GOTO lbl4
lbl41:
                        // 1 sources

                        while (true) {
                            super();
                            ** continue;
                            break;
                        }
                    }
                    var5_5 = (var3_4 | var6_3) ^ 1872234020;
                    ** GOTO lbl4
                }
                var5_5 = (var3_4 | var6_3) ^ 1468798252;
                ** GOTO lbl4
            }
            var4_6 = (var3_4 | var6_3) ^ -1618750985;
            var4_6 ^= -1252571371;
            ** while (true)
            {
                ** case -279482849:
            }
lbl55:
            // 1 sources

            var4_6 ^= var5_5 ^ 573857772;
            var5_5 = (var3_4 | var6_3) ^ -352509121;
            ** GOTO lbl4
        }
        var5_5 = (var3_4 | var6_3) ^ -1521700876;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void Hg() {
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
    @Override
    protected void draw(W var1_1) {
        block43: {
            block46: {
                block45: {
                    block44: {
                        var16_2 = -1322289356;
                        var13_3 = jd.a & -1322289356 ^ -1515325446;
                        var15_4 = 0;
                        var14_11 = (var13_3 | var16_2) ^ -1144510194;
                        var15_4 = (var13_3 | var16_2) ^ 1736091796;
                        break block46;
lbl7:
                        // 1 sources

                        while (true) {
                            var15_4 = (var13_3 | var16_2) ^ 1170090177;
                            break block43;
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var9_13 = (this.f - var8_12 * 2.0f) / 2.0f;
                            var14_11 ^= -1670725865;
                            var10_14 = this.e + var8_12 + var9_13 + (this.g - var8_12 * 2.0f - var9_13 * 2.0f) * var2_5;
                            var14_11 ^= -218290122;
                            break block44;
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var14_11 ^= -1910354197;
                            var4_7 = var1_1.a.isKeyboardFocused(this);
                            var14_11 ^= -1928697820;
                            var5_8 = fc.input();
                            var15_4 = (var13_3 | var16_2) ^ 1761192726;
                            ** GOTO lbl97
                            break;
                        }
                    }
                    var11_15 = this.h + this.f / 2.0f;
                    var12_16 = fc.mix(jd.Hf(((var14_11 ^= 2016790068) | var16_2) ^ -2129479771, (var13_3 | var16_2) ^ ((var14_11 | var16_2) ^ 422859913)), -1, var2_5);
                    var15_4 = (var13_3 | var16_2) ^ 1688451919;
                    block28: while (true) {
                        switch (var15_4) {
                            default: {
                                continue block28;
                            }
                            case 2008573796: {
                                var14_11 ^= var15_4 ^ 518631623;
                                var15_4 = (var13_3 | var16_2) ^ 891043333;
                                continue block28;
                            }
                            case -1800569691: {
                                var1_1.circle(var10_14, var11_15, var9_13, var12_16);
                                ** break;
                            }
                            case -787723087: {
                                var14_11 ^= var15_4 ^ -1894236783;
                                ** GOTO lbl43
                            }
lbl41:
                            // 1 sources

                            var15_4 = (var13_3 | var16_2) ^ -1038643046;
                            continue block28;
lbl43:
                            // 1 sources

                            var15_4 = (var13_3 | var16_2) ^ 553814875;
                            continue block28;
lbl45:
                            // 1 sources

                            while (true) {
                                var14_11 ^= -485871129;
                                v0 = 0.24f;
                                ** GOTO lbl64
                                break;
                            }
lbl49:
                            // 1 sources

                            while (true) {
                                var14_11 ^= 889436635;
                                var3_6 = this.c.value();
                                ** continue;
                                break;
                            }
                            case -2135700997: 
                        }
                        break;
                    }
                    return;
lbl55:
                    // 1 sources

                    while (true) {
                        var15_4 = (var13_3 | var16_2) ^ -832377529;
                        break block45;
lbl58:
                        // 1 sources

                        while (true) {
                            var7_10 = fc.mix(var5_8, var6_9, var2_5);
                            ** continue;
                            break;
                        }
                        while (true) {
                            var14_11 ^= -485871129;
                            v0 = 0.0f;
lbl64:
                            // 2 sources

                            var14_11 ^= 680317433;
                            var5_8 = fc.mix(var5_8, v1, var3_6 * 0.32f + v0);
                            var15_4 = (var13_3 | var16_2) ^ -1561037951;
                            break block45;
                            break;
                        }
                        break;
                    }
lbl68:
                    // 1 sources

                    while (true) {
                        var15_4 = (var13_3 | var16_2) ^ 1545799515;
                        break block43;
                        break;
                    }
lbl71:
                    // 1 sources

                    while (true) {
                        var15_4 = (var13_3 | var16_2) ^ -1431188855;
                        break block46;
                        break;
                    }
lbl74:
                    // 1 sources

                    while (true) {
                        var15_4 = (var13_3 | var16_2) ^ -906965303;
                        break block46;
lbl77:
                        // 1 sources

                        while (true) {
                            var15_4 = (var13_3 | var16_2) ^ 590330058;
                            break block46;
                            break;
                        }
                        break;
                    }
                }
                while (true) {
                    switch (var15_4) {
                        case 2077039289: {
                            v1 = fc.surfaceHover();
                            if (!var4_7) ** continue;
                            ** continue;
                        }
                        case 1006758516: {
                            var6_9 = fc.withAlpha(fc.accent(), jd.Hf((var14_11 | var15_4 ^ -1926324928) ^ (var15_4 ^ -1089217256), (var13_3 | var15_4 ^ -1926324928) ^ ((var14_11 | var15_4 ^ -1926324928) ^ (var15_4 ^ -1145771305))));
                            var14_11 ^= 1142369306;
                            ** continue;
                        }
                        case -581542680: {
                            var14_11 ^= var15_4 ^ -1572622762;
                            ** continue;
                        }
                        case 391873663: {
                            var14_11 ^= var15_4 ^ 1394443754;
                            var15_4 = (var13_3 | var16_2) ^ -1985077878;
                        }
                    }
lbl97:
                    // 3 sources

                }
            }
            block39: while (true) {
                switch (var15_4) {
                    case 2086615351: {
                        this.Hg();
                        ** continue;
                    }
                    case 522075511: {
                        var14_11 ^= var15_4 ^ -2135854381;
                        ** continue;
                    }
                    case -1769976012: {
                        var2_5 = this.a.value();
                        ** continue;
                    }
                    case -757768342: {
                        var15_4 = (var13_3 | var16_2) ^ -828023337;
                    }
                    default: {
                        continue block39;
                    }
                    case 2064296489: 
                }
                break;
            }
            var14_11 ^= var15_4 ^ 1003744004;
            ** while (true)
lbl117:
            // 1 sources

            while (true) {
                var14_11 ^= 305109667;
                ** continue;
                break;
            }
        }
        block41: while (true) {
            switch (var15_4) {
                case -267264193: {
                    var14_11 ^= var15_4 ^ 1431630053;
                    ** break;
                }
                case -794535116: {
                    var1_1.capsule(this.e, this.h, this.g, this.f, var7_10);
                    ** continue;
                }
lbl129:
                // 1 sources

                var15_4 = (var13_3 | var16_2) ^ 1695263946;
lbl130:
                // 3 sources

                default: {
                    continue block41;
                }
                case -376639323: {
                    var14_11 ^= var15_4 ^ 777104157;
                    var15_4 = (var13_3 | var16_2) ^ -1807490627;
                    ** GOTO lbl130
                }
                case 569120323: 
            }
            break;
        }
        var8_12 = Math.min(var1_1.s(2.0f), this.f * 0.2f);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean mouseDown(W var1_1, double var2_2, double var4_3, int var6_4) {
        block33: {
            block35: {
                block34: {
                    break block34;
lbl1:
                    // 1 sources

                    return false;
                }
                var10_5 = -1211988140;
                var7_6 = jd.a & -1211988140 ^ 1039543840;
                var9_7 = 0;
                break block35;
lbl8:
                // 1 sources

                while (true) {
                    var9_7 = (var7_6 | var10_5) ^ 1414136448;
                    ** GOTO lbl34
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    var9_7 = (var7_6 | var10_5) ^ -676253991;
                    ** GOTO lbl34
lbl14:
                    // 1 sources

                    while (true) {
                        var9_7 = (var7_6 | var10_5) ^ 1576093567;
                        ** GOTO lbl34
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        var8_8 ^= var9_7 ^ -1545134804;
                        ** continue;
                        break;
                    }
lbl20:
                    // 1 sources

                    while (true) {
                        this.requestFocus(var1_1);
                        ** continue;
                        break;
                    }
lbl23:
                    // 1 sources

                    while (true) {
                        var9_7 = (var7_6 | var10_5) ^ 1846201473;
                        ** GOTO lbl34
lbl26:
                        // 1 sources

                        while (true) {
                            var9_7 = (var7_6 | var10_5) ^ 357623031;
                            ** GOTO lbl34
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl29:
                // 1 sources

                block25: while (true) {
                    var9_7 = (var7_6 | var10_5) ^ -344853095;
                    ** GOTO lbl34
lbl32:
                    // 1 sources

                    while (true) {
                        var9_7 = (var7_6 | var10_5) ^ 818552096;
lbl34:
                        // 14 sources

                        block27: while (true) {
                            switch (var9_7) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block27;
                                    }
                                    break;
                                }
                                case -502798325: {
                                    ** continue;
                                }
                                case -503560494: {
                                    ** continue;
                                }
                                case -1674262024: {
                                    break block25;
                                }
                                case -1431942269: {
                                    ** continue;
                                }
                                case -1891847596: {
                                    break;
                                }
                                case 1749516717: {
                                    var8_8 ^= var9_7 ^ 2087827241;
                                    ** continue;
                                }
                                case 1840893666: {
                                    this.toggle();
                                    ** continue;
                                }
                                case -339956236: {
                                    var8_8 ^= var9_7 ^ -627447032;
                                    break;
                                }
lbl58:
                                // 1 sources

                                while (true) {
                                    var9_7 = (var7_6 | var10_5) ^ 1937775659;
                                    ** continue;
                                    break;
                                }
                                case -624048191: {
                                    if (this.contains(var2_2, var4_3)) {
                                        ** continue;
                                    }
                                    break block33;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                var9_7 = (var7_6 | var10_5) ^ -894924839;
                ** GOTO lbl34
                {
                    case 1418156781: {
                        if (!this.g) break block33;
                        ** continue;
                    }
                }
lbl70:
                // 1 sources

                while (true) {
                    var9_7 = (var7_6 | var10_5) ^ 469700420;
                    ** GOTO lbl34
                    break;
                }
                {
                    case -163732110: {
                        ** continue;
                    }
                }
                var9_7 = (var7_6 | var10_5) ^ -766549610;
                ** GOTO lbl34
            }
            var8_8 = (var7_6 | var10_5) ^ 172010131;
            var9_7 = (var7_6 | var10_5) ^ 599942796;
            ** GOTO lbl34
            {
                case -864636065: {
                    return true;
                }
                case -1542873040: {
                    if (var6_4 == 0) {
                        break;
                    }
                    break block33;
                }
            }
            var9_7 = (var7_6 | var10_5) ^ 1698392245;
            ** GOTO lbl34
        }
        var9_7 = (var7_6 | var10_5) ^ 1577773478;
        ** GOTO lbl34
        {
            case 1969105069: {
                var8_8 ^= var9_7 ^ -562627137;
                ** continue;
            }
        }
        var9_7 = (var7_6 | var10_5) ^ 1238043142;
        ** while (true)
        {
            ** case -771988491:
        }
lbl98:
        // 1 sources

        var8_8 ^= var9_7 ^ -897854084;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public boolean isFocusable() {
        int n2 = a & 0x7E5B259E ^ 0xF11F19D0;
        int n3 = 0;
        int n4 = (n2 | 0x7E5B259E) ^ 0x64FFE79A;
        n3 = (n2 | 0x7E5B259E) ^ 0x169E87E6;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0x7E5B259E) ^ 0x453FE362;
            }
            block6: while (true) {
                switch (n3) {
                    default: {
                        continue block6;
                    }
                    case -373179848: {
                        n3 = (n2 | 0x7E5B259E) ^ 0x784093B0;
                        continue block6;
                    }
                    case -2027966866: {
                        n4 ^= n3 ^ 0xB71A15F3;
                        continue block5;
                    }
                    case -1168056644: 
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
    @Override
    public boolean key(W var1_1, int var2_2, int var3_3) {
        block39: {
            block38: {
                block41: {
                    block42: {
                        block37: {
                            var7_4 = -1057138796;
                            var4_5 = jd.a & -1057138796 ^ 2124366195;
                            var6_6 = 0;
                            ** GOTO lbl73
lbl5:
                            // 1 sources

                            block19: while (true) {
                                block36: {
                                    var6_6 = (var4_5 | var7_4) ^ -2085455544;
                                    ** GOTO lbl39
lbl8:
                                    // 1 sources

                                    while (true) {
                                        if (var2_2 == jd.Hf((var5_7 | var6_6 ^ -1535157576) ^ (var6_6 ^ -1887391031), (var4_5 | var6_6 ^ -1535157576) ^ ((var5_7 | var6_6 ^ -1535157576) ^ (var6_6 ^ -1146872380)))) break block36;
                                        break block37;
                                        break;
                                    }
lbl11:
                                    // 1 sources

                                    while (true) {
                                        if (!this.g) ** GOTO lbl27
                                        ** GOTO lbl78
                                        break;
                                    }
lbl14:
                                    // 1 sources

                                    while (true) {
                                        var6_6 = (var4_5 | var7_4) ^ 1899332861;
                                        ** GOTO lbl39
                                        break;
                                    }
                                }
lbl18:
                                // 2 sources

                                block23: while (true) {
                                    var6_6 = (var4_5 | var7_4) ^ 1158166545;
                                    ** GOTO lbl39
lbl21:
                                    // 1 sources

                                    while (true) {
                                        var5_7 ^= var6_6 ^ -911944717;
                                        break block38;
                                        break;
                                    }
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var5_7 ^= var6_6 ^ -1336021662;
                                        break block39;
                                        break;
                                    }
lbl27:
                                    // 1 sources

                                    block26: while (true) {
                                        block40: {
                                            var6_6 = (var4_5 | var7_4) ^ -1045361524;
                                            break block40;
lbl30:
                                            // 1 sources

                                            while (true) {
                                                var6_6 = (var4_5 | var7_4) ^ -266362571;
                                                break block40;
                                                break;
                                            }
lbl33:
                                            // 1 sources

                                            while (true) {
                                                var5_7 ^= var6_6 ^ 881729979;
                                                break block41;
                                                break;
                                            }
lbl36:
                                            // 1 sources

                                            while (true) {
                                                var5_7 ^= var6_6 ^ 802761461;
                                                ** GOTO lbl85
                                                break;
                                            }
                                        }
lbl40:
                                        // 7 sources

                                        block30: while (true) {
                                            switch (var6_6) lbl-1000:
                                            // 7 sources

                                            {
                                                while (true) {
                                                    default: {
                                                        continue block30;
                                                    }
                                                    break;
                                                }
                                                case -1211785152: {
                                                    ** continue;
                                                }
                                                case -1882533110: {
                                                    break block19;
                                                }
                                                case 1686244652: {
                                                    ** continue;
                                                }
                                                case 2083173196: {
                                                    ** continue;
                                                }
                                                case 1962228042: {
                                                    ** continue;
                                                }
                                                case 517375362: {
                                                    ** continue;
                                                }
                                                case 1062099835: {
                                                    ** continue;
                                                }
                                                case -1141411866: {
                                                    ** continue;
                                                }
lbl61:
                                                // 1 sources

                                                while (true) {
                                                    var6_6 = (var4_5 | var7_4) ^ -534130059;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case 249624258: {
                                                    if (!var1_1.a.isFocused(this)) continue block26;
                                                    ** continue;
                                                }
lbl67:
                                                // 1 sources

                                                while (true) {
                                                    var6_6 = (var4_5 | var7_4) ^ 349177926;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
lbl70:
                                                // 1 sources

                                                while (true) {
                                                    var6_6 = (var4_5 | var7_4) ^ -1979027779;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
lbl73:
                                                // 1 sources

                                                var5_7 = (var4_5 | var7_4) ^ 259513696;
                                                ** continue;
lbl75:
                                                // 1 sources

                                                while (true) {
                                                    var6_6 = (var4_5 | var7_4) ^ -1309436447;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
lbl78:
                                                // 1 sources

                                                var6_6 = (var4_5 | var7_4) ^ 1228601271;
                                                ** GOTO lbl-1000
                                                case -413504513: {
                                                    return false;
                                                }
                                                case -1164584579: {
                                                    if (var2_2 == jd.Hf((var5_7 | var6_6 ^ 2053672681) ^ (var6_6 ^ 1368876702), (var4_5 | var6_6 ^ 2053672681) ^ ((var5_7 | var6_6 ^ 2053672681) ^ (var6_6 ^ 323317849)))) continue block23;
                                                    continue block26;
                                                }
lbl85:
                                                // 1 sources

                                                var6_6 = (var4_5 | var7_4) ^ 85050447;
                                                ** continue;
                                                case -68250696: {
                                                    this.toggle();
                                                    ** continue;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            var6_6 = (var4_5 | var7_4) ^ -1703060773;
                            ** GOTO lbl40
                            {
                                case 1326236182: {
                                    break block42;
                                }
                            }
                        }
                        var6_6 = (var4_5 | var7_4) ^ 1569411256;
                        ** GOTO lbl40
                    }
                    var6_6 = (var4_5 | var7_4) ^ 1147833994;
                    ** GOTO lbl40
                    {
                        case 2102210239: {
                            if (var2_2 != jd.Hf((var5_7 | var6_6 ^ -1112508117) ^ (var6_6 ^ -1773170339), (var4_5 | var6_6 ^ -1112508117) ^ ((var5_7 | var6_6 ^ -1112508117) ^ (var6_6 ^ 1957017943)))) ** break;
                            ** continue;
                            ** continue;
                        }
                    }
                }
                var6_6 = (var4_5 | var7_4) ^ 430259208;
                ** GOTO lbl40
                {
                    case -1552677041: {
                        ** continue;
                    }
                }
            }
            var6_6 = (var4_5 | var7_4) ^ 1580174430;
            ** GOTO lbl40
            {
                case -1596925015: {
                    return true;
                }
            }
        }
        var6_6 = (var4_5 | var7_4) ^ -2099911493;
        ** while (true)
        {
            ** case -365994063:
        }
lbl118:
        // 1 sources

        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void toggle() {
        var5_1 = 1105018884;
        var2_2 = jd.a & 1105018884 ^ 1804414060;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ 1879503924;
        var4_3 = (var2_2 | var5_1) ^ 2070570189;
        ** GOTO lbl88
lbl7:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ -645975752;
            ** GOTO lbl67
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ -927257977;
            ** GOTO lbl67
            while (true) {
                var4_3 = (var2_2 | var5_1) ^ -504361857;
                if (true) ** GOTO lbl67
                break;
            }
            break;
        }
        block24: while (true) {
            fu.play(v0);
            var4_3 = (var2_2 | var5_1) ^ 794174174;
            block25: while (true) {
                switch (var4_3) {
                    case -1074199010: {
                        var3_4 ^= var4_3 ^ -1442224417;
                        var4_3 = (var2_2 | var5_1) ^ -199822113;
                        continue block25;
                    }
                    case -2002221418: {
                        if (!var1_5) {
                            var4_3 = (var2_2 | var5_1) ^ 208044909;
                            ** break;
                        }
                        ** GOTO lbl56
                    }
                    case -2030216021: {
                        this.a.accept(var1_5);
                        ** break;
                    }
                    case 1740369665: {
                        var3_4 ^= var4_3 ^ 1917554624;
                        ** GOTO lbl58
                    }
lbl36:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1425356663;
                    continue block25;
                    case 1149980338: {
                        var3_4 ^= var4_3 ^ -153756154;
                        ** GOTO lbl50
                    }
                    case -1456716812: {
                        v0 = ap.C;
                        ** GOTO lbl54
                    }
                    case -571603966: {
                        var3_4 ^= var4_3 ^ -1745331546;
                        var4_3 = (var2_2 | var5_1) ^ -316657465;
                    }
lbl47:
                    // 4 sources

                    while (true) {
                        default: {
                            continue block25;
                        }
                        break;
                    }
lbl50:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1583367998;
                    continue block25;
                    case -1614047053: {
                        v0 = ap.F;
lbl54:
                        // 2 sources

                        var3_4 ^= -1600598789;
                        continue block24;
                    }
lbl56:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -735810958;
                    continue block25;
lbl58:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1024381032;
                    continue block25;
                    case -1059609371: {
                        var3_4 ^= var4_3 ^ -1331570760;
                        var4_3 = (var2_2 | var5_1) ^ -478811398;
                        continue block25;
                    }
lbl64:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1238144914;
                        ** continue;
                        break;
                    }
lbl67:
                    // 3 sources

                    block28: while (true) {
                        switch (var4_3) {
                            case -1553578261: {
                                var3_4 ^= var4_3 ^ 2135546958;
                                var4_3 = (var2_2 | var5_1) ^ 1194344433;
                                ** GOTO lbl88
                            }
                            case -1976737773: {
                                var3_4 ^= var4_3 ^ 1443035830;
                                ** continue;
                            }
                            case -1203654132: {
                                if (Boolean.TRUE.equals(this.a.get())) ** continue;
                                ** continue;
                            }
                            case -1297982124: {
                                v1 = false;
                                ** GOTO lbl84
                            }
                            case 753750941: {
                                v1 = true;
lbl84:
                                // 2 sources

                                var3_4 ^= -2077979670;
                                break block28;
                            }
                            case 280430753: {
                                var4_3 = (var2_2 | var5_1) ^ -1761456335;
                            }
lbl88:
                            // 4 sources

                            default: {
                                continue block28;
                            }
                            case -52485283: 
                        }
                        var3_4 ^= var4_3 ^ -1544700959;
                        var4_3 = (var2_2 | var5_1) ^ -744694176;
                    }
                    var1_5 = v1;
                    ** continue;
                    case -901589842: 
                }
                break;
            }
            break;
        }
    }
}

