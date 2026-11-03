/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.W;
import z.r.bq;
import z.r.cY;
import z.r.fc;
import z.r.gj;
import z.r.hg;
import z.r.jq;
import z.r.li;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class ia {
    private static final int a;
    private static final /* synthetic */ String a;
    private static final int[] a;
    public static final int b;
    private static final float a;

    private static int Le(int n2, int n3) {
        int n4 = -544141512;
        int n5 = 185955602;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xF084C217)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xDF959ABB;
        n6 += (n5 | n4) ^ 0xDF95540B;
        n6 += (n5 | n4) ^ 0xDF95EC6B;
        n6 ^= (n5 | n4) ^ 0xDF9565B2;
        n6 ^= (n5 | n4) ^ 0xDF9568F1;
        n6 += (n5 | n4) ^ 0xDF954337;
        n6 -= (n5 | n4) ^ 0xDF952A38;
        return n6 ^= (n5 | n4) ^ 0xDF955776;
    }

    /*
     * Enabled aggressive block sorting
     */
    private ia() {
        int n2 = b & 0x7415D898 ^ 0xBBD0DE09;
        int n3 = (n2 | 0x7415D898) ^ 0x422D5424;
        n3 ^= 0x511FB91D;
        n3 ^= 0xD790C94F;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float measure(W w2, jq jq2, float f2, float f3) {
        int n2 = b & 0xD3F1CE8 ^ 0x89CF329A;
        int n3 = 0;
        int n4 = (n2 | 0xD3F1CE8) ^ 0x89D0C33B;
        n3 = (n2 | 0xD3F1CE8) ^ 0x622BDB2E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -271260204: {
                    break;
                }
                case 1705929743: {
                    return ia.Lf(w2, jq2, 0.0f, 0.0f, f2, f3, 1.0f, false, null, true, true);
                }
                case 881435584: {
                    n4 ^= n3 ^ 0x9C94B24;
                    n3 = (n2 | 0xD3F1CE8) ^ 0xE85152F5;
                    continue block5;
                }
            }
            n3 = (n2 | 0xD3F1CE8) ^ 0xB9769D3A;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static float measureBody(W w2, jq jq2, float f2, float f3) {
        int n2 = b & 0xBF059FFA ^ 0x4E9037DD;
        int n3 = 0;
        int n4 = (n2 | 0xBF059FFA) ^ 0xE0CD644A;
        n3 = (n2 | 0xBF059FFA) ^ 0x2CC9F6AC;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0xBF059FFA) ^ 0xCE14066D;
            }
            block6: while (true) {
                switch (n3) {
                    case -748926637: {
                        n3 = (n2 | 0xBF059FFA) ^ 0x7F3988F3;
                    }
                    default: {
                        continue block6;
                    }
                    case -2136197364: {
                        n4 ^= n3 ^ 0x8D906EA7;
                        continue block5;
                    }
                    case 830585234: 
                }
                break;
            }
            break;
        }
        return ia.Lf(w2, jq2, 0.0f, 0.0f, f2, f3, 1.0f, false, null, true, false);
    }

    /*
     * Unable to fully structure code
     */
    public static float draw(W var0, jq var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, boolean var7_7, List<li> var8_8) {
        var9_9 = ia.b & -1248334959 ^ 2087791000;
        var11_10 = 0;
        var10_11 = (var9_9 | -1248334959) ^ -1965053271;
        ** GOTO lbl16
lbl5:
        // 1 sources

        block5: while (true) {
            switch (var11_10) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
                case 1951297663: {
                    var10_11 ^= var11_10 ^ -874699929;
                    break block5;
                }
                ** case 552272945:
lbl14:
                // 1 sources

                var11_10 = (var9_9 | -1248334959) ^ -1984324634;
                ** GOTO lbl-1000
lbl16:
                // 1 sources

                var11_10 = (var9_9 | -1248334959) ^ -585306200;
                ** continue;
                case 573523799: {
                    return ia.Lf(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, false, true);
                }
            }
            break;
        }
        var11_10 = (var9_9 | -1248334959) ^ -539448114;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float drawBody(W w2, jq jq2, float f2, float f3, float f4, float f5, List<li> list) {
        int n2 = b & 0x775330FA ^ 0x9F4782C3;
        int n3 = 0;
        int n4 = (n2 | 0x775330FA) ^ 0x8072C72E;
        n3 = (n2 | 0x775330FA) ^ 0x4F86C54;
        block5: while (true) {
            switch (n3) {
                case -1984135344: {
                    n4 ^= n3 ^ 0xE38188E7;
                    n3 = (n2 | 0x775330FA) ^ 0xCABEF322;
                }
                default: {
                    continue block5;
                }
                case 904479193: {
                    return ia.Lf(w2, jq2, f2, f3, f4, f5, 1.0f, false, list, false, false);
                }
                case -72360273: 
            }
            n3 = (n2 | 0x775330FA) ^ 0x76EBCDAB;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var2 = 928249805;
        ia.b = mK.a(MethodHandles.lookup().lookupClass(), -67624456);
        var1_1 = 0;
        var0_2 = -1477136159;
        var1_1 = var2 ^ 1368891541;
        ** GOTO lbl73
lbl7:
        // 1 sources

        while (true) {
            var1_1 = var2 ^ 1279514033;
            if (true) ** GOTO lbl73
            break;
        }
        block18: while (true) {
            block24: {
                block23: {
                    var1_1 = var2 ^ 2079491962;
                    break block24;
lbl13:
                    // 1 sources

                    block19: while (true) {
                        switch (var0_2) {
                            default: {
                                var0_2 ^= -574971289;
                                break;
                            }
                            case 651835544: {
                                var0_2 ^= 103750481;
                                continue block19;
                            }
                            case 1953839492: {
                                var0_2 ^= 690847041;
                            }
                        }
                        v0 = (v1[v2] & 255) << 24;
                        var0_2 ^= 452900430;
                        v3 = (v1[v2 + 1] & 255) << 16;
                        var0_2 ^= 509715512;
                        break block23;
                        break;
                    }
lbl30:
                    // 2 sources

                    while (true) {
                        var0_2 ^= -2122615083;
                        ** continue;
                        break;
                    }
                }
                v4 = (v1[v2 + 2] & 255) << 8;
                while (true) {
                    switch (var0_2) {
                        case 1481242449: {
                            var0_2 ^= -575592345;
                            ** GOTO lbl44
                        }
                        case -862387606: {
                            var0_2 ^= 265386945;
lbl44:
                            // 2 sources

                            var0_2 ^= -1178374586;
                            v5 = var0_2 ^= 532192983;
                            var0_2 ^= 1959940050;
                            ia.a[v6] = (v0 | (v3 | (v4 | v1[v2 + 3] & 255))) ^ ((v5 | var2) ^ -381066092 ^ ia.b);
                            v6 = v6 + 1;
                            v7 = v2 + 4;
                            v1 = v1;
                            v2 = v7;
                            var0_2 ^= -2061106618;
                            if (v7 < v1.length) ** GOTO lbl30
                            ia.a = 1.45f;
                            ia.a = ia.Le(((var0_2 ^= -873118963) | var2) ^ 1348618953, var2 ^ ((var0_2 | var2) ^ -938715191));
                            ia.a = gj.decode("RPg=", ia.Le((var0_2 | var2) ^ 1348618958, var2 ^ ((var0_2 | var2) ^ 1874621974)));
                            return;
                        }
                    }
                    var0_2 ^= 867287626;
                }
            }
            block22: while (true) {
                switch (var1_1) {
                    default: {
                        continue block22;
                    }
                    case 660433482: {
                        var0_2 ^= var1_1 ^ -1770121074;
                        var1_1 = var2 ^ -2095032524;
                        continue block22;
                    }
                    case 1285648567: {
                        ** break;
                    }
                    case 1100670765: {
                        var0_2 ^= var1_1 ^ -630822286;
                        ** continue;
                    }
                    case -1267490567: {
                        v6 = 0;
                        v2 = 0;
                        v1 = "\u0081D\u000e\u00df\u00d4\u0095.\u00e3!R\u00b4|\u0081\u00d9\u00ce\u00b4\u00f78\u00a0\u00d6\u00bb\u00deR\u00e5\u00b7\f\u00b8\u00ba\u0095\u0091\u0004\u00c5;p\u0092?\u00ad\u0094S\u0093\u00e7\u00db\u00b5\u007f\u00eb\u00d0\u00a3l;b\u009b\u00da".getBytes("ISO-8859-1");
                        ** continue;
                    }
lbl92:
                    // 1 sources

                    var1_1 = var2 ^ 1992888544;
                    continue block22;
                    case -1718185618: {
                        var0_2 ^= var1_1 ^ -2139481414;
                        continue block18;
                    }
                    case 1724143448: {
                        var1_1 = var2 ^ -1362794845;
                        continue block22;
                    }
                    case 2064654972: 
                }
                ia.a = new int[(var0_2 | var1_1 ^ 1279514033) ^ (var1_1 ^ 1290261918)];
                var1_1 = var2 ^ 269393287;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static float Lf(W var0, jq var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, boolean var7_7, List<li> var8_8, boolean var9_9, boolean var10_10) {
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
    private static void Lg(W var0, hg var1_1, String var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, float var10_10, boolean var11_11) {
        block53: {
            block51: {
                block52: {
                    var18_12 = 2146726386;
                    var15_13 = ia.b & 2146726386 ^ -2142944474;
                    var17_14 = 0;
                    var16_17 = (var15_13 | var18_12) ^ 647629361;
                    var17_14 = (var15_13 | var18_12) ^ -1723877399;
                    ** GOTO lbl113
lbl7:
                    // 1 sources

                    while (true) {
                        var17_14 = (var15_13 | var18_12) ^ 310561907;
                        break block51;
                        break;
                    }
lbl10:
                    // 1 sources

                    block34: while (true) {
                        switch (var16_17) {
                            case -1734292214: {
                                var16_17 ^= 363908553;
                                break;
                            }
                            case -1748426656: {
                                var16_17 ^= -480265252;
                                break;
                            }
                            default: {
                                var16_17 ^= 1877548154;
                                continue block34;
                            }
                        }
                        v0 = ia.Le((var16_17 | var18_12) ^ 1357334235, (var15_13 | var18_12) ^ ((var16_17 | var18_12) ^ -795672562));
                        break block52;
                        break;
                    }
lbl23:
                    // 1 sources

                    while (true) {
                        var17_14 = (var15_13 | var18_12) ^ -1773880275;
                        break block51;
                        break;
                    }
                }
lbl27:
                // 2 sources

                while (true) {
                    var16_17 ^= 1666610275;
                    var16_17 ^= 1218850273;
                    var0.strokeRoundedRect(var3_3, var4_4, var5_5, var6_6, var13_16, v1, fc.withAlpha(var12_15, v0));
                    var17_14 = (var15_13 | var18_12) ^ 2023821319;
                    ** GOTO lbl144
                    break;
                }
            }
lbl34:
            // 2 sources

            block37: while (true) {
                switch (var17_14) {
                    case -310919291: {
                        if (var11_11) {
                            break block53;
                        }
                        ** GOTO lbl54
                    }
                    case 1549915648: {
                        var16_17 ^= var17_14 ^ -672133137;
                        ** GOTO lbl57
                    }
                    case -857779765: {
                        var16_17 ^= var17_14 ^ 1965216922;
                        ** continue;
                    }
                    case 1773260763: {
                        var16_17 ^= var17_14 ^ 1808264220;
                        var17_14 = (var15_13 | var18_12) ^ -1434494664;
                        ** GOTO lbl59
                    }
                    case 1951586027: {
                        var0.text(var2_2, var14_18 + var8_8 / 2.0f + var10_10, var4_4 + var6_6 / 2.0f, var7_7, var12_15);
                        ** break;
lbl53:
                        // 1 sources

                        ** continue;
                    }
lbl54:
                    // 1 sources

                    var16_17 ^= 630270375;
                    v2 = var1_1.icon();
                    ** GOTO lbl73
lbl57:
                    // 1 sources

                    var17_14 = (var15_13 | var18_12) ^ -1951947491;
                    continue block37;
lbl59:
                    // 3 sources

                    default: {
                        continue block37;
                    }
                    case 1435118286: 
                }
                return;
            }
lbl63:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl65:
            // 1 sources

            while (true) {
                var17_14 = (var15_13 | var18_12) ^ 1726424372;
                ** GOTO lbl144
                while (true) {
                    v3 = ia.Le(((var16_17 ^= -1684012007) | var18_12) ^ 1357303509, (var15_13 | var18_12) ^ ((var16_17 | var18_12) ^ 2121473684));
                    ** GOTO lbl132
                    break;
                }
                break;
            }
lbl71:
            // 2 sources

            while (true) {
                v2 = bq.cH;
lbl73:
                // 2 sources

                var16_17 ^= 391144703;
                var0.icon(v2, var14_18, var4_4 + var6_6 / 2.0f, var8_8, var12_15);
                var17_14 = (var15_13 | var18_12) ^ -1550539274;
                ** GOTO lbl59
                break;
            }
        }
        block43: while (true) {
            switch (var16_17) {
                case 1447442665: {
                    var16_17 ^= 226091011;
                    continue block43;
                }
                case -683118075: {
                    var16_17 ^= 1482481887;
                    ** GOTO lbl71
                }
            }
            break;
        }
        var16_17 ^= 630270375;
        ** while (true)
        var17_14 = (var15_13 | var18_12) ^ 1768304062;
        block44: while (true) {
            block54: {
                switch (var17_14) {
                    case 1873499574: {
                        var16_17 ^= var17_14 ^ 686846555;
                        ** GOTO lbl103
                    }
                    case 232206751: {
                        if (var1_1 instanceof cY) {
                            ** break;
                        }
                        ** GOTO lbl110
                    }
                    case 428817255: {
                        v4 = fc.accent();
                        ** GOTO lbl117
                    }
lbl101:
                    // 1 sources

                    var17_14 = (var15_13 | var18_12) ^ -1662155794;
                    ** GOTO lbl113
lbl103:
                    // 1 sources

                    var17_14 = (var15_13 | var18_12) ^ -232635799;
                    ** GOTO lbl113
                    case 1724564511: {
                        break block54;
                    }
                    case 1008210875: {
                        var16_17 ^= var17_14 ^ 2112073915;
                        ** GOTO lbl112
                    }
lbl110:
                    // 1 sources

                    var17_14 = (var15_13 | var18_12) ^ -1007853491;
                    ** GOTO lbl113
lbl112:
                    // 1 sources

                    var17_14 = (var15_13 | var18_12) ^ -428193647;
lbl113:
                    // 6 sources

                    default: {
                        continue block44;
                    }
                    case -1768726968: {
                        v4 = ia.Le((var16_17 | var17_14 ^ -379113542) ^ (var17_14 ^ 1182604954), (var15_13 | var17_14 ^ -379113542) ^ ((var16_17 | var17_14 ^ -379113542) ^ (var17_14 ^ 1175606028)));
lbl117:
                        // 2 sources

                        var16_17 ^= 1512543357;
                        break block44;
                    }
                    case 1662578712: 
                }
                var16_17 ^= var17_14 ^ 585323288;
                ** continue;
            }
            var17_14 = (var15_13 | var18_12) ^ -1872878016;
        }
        var12_15 = v4;
        var16_17 ^= -63190204;
        var13_16 = var6_6 * 0.3f;
        var17_14 = (var15_13 | var18_12) ^ 1635775057;
        ** GOTO lbl144
lbl130:
        // 1 sources

        while (true) {
            v3 = ia.Le(((var16_17 ^= -1684012007) | var18_12) ^ 1357303508, (var15_13 | var18_12) ^ ((var16_17 | var18_12) ^ 1559143156));
lbl132:
            // 2 sources

            var16_17 ^= -274744205;
            var0.roundedRect(var3_3, var4_4, var5_5, var6_6, var13_16, fc.withAlpha(var12_15, v3));
            var17_14 = (var15_13 | var18_12) ^ 195111545;
            if (true) ** GOTO lbl144
            break;
        }
lbl136:
        // 1 sources

        while (true) {
            var16_17 ^= 294382158;
            if (!var11_11) ** break;
            ** continue;
            v0 = ia.Le(((var16_17 ^= -480265252) | var18_12) ^ 1357334234, (var15_13 | var18_12) ^ ((var16_17 | var18_12) ^ 1182253541));
            ** continue;
            break;
        }
        block47: while (true) {
            var17_14 = (var15_13 | var18_12) ^ 2095012475;
lbl144:
            // 5 sources

            block48: while (true) {
                switch (var17_14) {
                    default: {
                        continue block48;
                    }
                    case -195798641: {
                        var16_17 ^= var17_14 ^ -110199395;
                        continue block47;
                    }
                    case -1635090009: {
                        var16_17 ^= var17_14 ^ 404649442;
                        var17_14 = (var15_13 | var18_12) ^ -1629168752;
                        continue block48;
                    }
                    case 1628547174: {
                        if (!var11_11) ** continue;
                        ** continue;
                    }
                    case -1726851390: {
                        var14_18 = var3_3 + var9_9 + var8_8 / 2.0f;
                        var17_14 = (var15_13 | var18_12) ^ 858399293;
                        ** continue;
                    }
                    case -2094388851: {
                        v1 = Math.max(1.0f, var6_6 * 0.05f);
                        ** continue;
                    }
                    case -2024512527: 
                }
                break;
            }
            break;
        }
        var16_17 ^= var17_14 ^ -724927768;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static void text(W var0, String var1_1, float var2_2, float var3_3, float var4_4, int var5_5, boolean var6_6) {
        block26: {
            block25: {
                block28: {
                    block27: {
                        break block27;
lbl1:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl3:
                        // 1 sources

                        while (true) {
                            var10_9 = (var8_8 | var11_7) ^ -2127139981;
                            break block25;
                            break;
                        }
                    }
                    var11_7 = 1678122587;
                    var8_8 = ia.b & 1678122587 ^ 1942928473;
                    var10_9 = 0;
                    break block28;
lbl11:
                    // 1 sources

                    while (true) {
                        var10_9 = (var8_8 | var11_7) ^ -207248841;
                        break block25;
lbl14:
                        // 1 sources

                        return;
lbl16:
                        // 1 sources

                        while (true) {
                            var10_9 = (var8_8 | var11_7) ^ -1805032092;
                            break block25;
                            break;
                        }
lbl19:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            var10_9 = (var8_8 | var11_7) ^ -916475111;
                            break block25;
                            break;
                        }
lbl24:
                        // 2 sources

                        while (true) {
                            var10_9 = (var8_8 | var11_7) ^ 1453179744;
                            break block25;
                            break;
                        }
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var0.text(var1_1, var2_2 + var7_10, var3_3 + var7_10, var4_4, ia.Le(((var9_11 ^= 868650847) | var11_7) ^ 1123967708, (var8_8 | var11_7) ^ ((var9_11 | var11_7) ^ -635780738)));
                        ** GOTO lbl24
                        break;
                    }
                    var0.text(var1_1, var2_2, var3_3, var4_4, var5_5);
                    var10_9 = (var8_8 | var11_7) ^ 844348674;
                    break block25;
lbl33:
                    // 1 sources

                    while (true) {
                        var9_11 ^= var10_9 ^ -74260365;
                        ** continue;
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var9_11 ^= var10_9 ^ 869210191;
                        ** continue;
                        break;
                    }
                }
                var9_11 = (var8_8 | var11_7) ^ 1502079232;
                var10_9 = (var8_8 | var11_7) ^ 649102129;
                break block25;
lbl43:
                // 1 sources

                while (true) {
                    if (var6_6) ** break;
                    ** continue;
                    break block26;
                    break;
                }
                var7_10 = Math.max(1.0f, var4_4 * 0.08f);
                ** while (true)
lbl49:
                // 1 sources

                while (true) {
                    var9_11 ^= var10_9 ^ 1365022498;
                    ** continue;
                    break;
                }
            }
lbl53:
            // 2 sources

            block24: while (true) {
                switch (var10_9) {
                    default: {
                        continue block24;
                    }
                    case -475538625: {
                        ** continue;
                    }
                    case -1097790142: {
                        ** continue;
                    }
                    case -151464664: {
                        ** continue;
                    }
                    case 1367227754: {
                        break;
                    }
                    case 559119675: {
                        ** continue;
                    }
                    case 628496: {
                        ** continue;
                    }
                    case -2073355156: {
                        ** continue;
                    }
                    case 1167917913: {
                        ** continue;
                    }
                    case -68439493: {
                        var9_11 ^= var10_9 ^ -1202772781;
                        ** continue;
                    }
                }
                var10_9 = (var8_8 | var11_7) ^ -1943729056;
                continue;
                break;
            }
        }
        var10_9 = (var8_8 | var11_7) ^ 2009540939;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static List<String> Lh(String var0) {
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

