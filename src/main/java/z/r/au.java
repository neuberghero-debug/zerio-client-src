/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_4588
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4588;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class au
implements class_4588 {
    private static final int[] a;
    public static final int a;
    private final class_4588 a;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public au(class_4588 class_45882) {
        int n2 = 1073517721;
        int n3 = a & 0x3FFC9499 ^ 0x8488C63E;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x228D23E3;
        n5 ^= 0x8B1BD5AC;
        n4 = (n3 | n2) ^ 0xAF76F958;
        block6: while (true) {
            switch (n4) {
                default: {
                    continue block6;
                }
                case 1634335620: {
                    n5 ^= n4 ^ 0x2274F88D;
                    n4 = (n3 | n2) ^ 0x47FA7DEE;
                    continue block6;
                }
                case 277491687: {
                    n5 ^= n4 ^ 0xDFC3E8EF;
                    n4 = (n3 | n2) ^ 0xF95B88DE;
                    continue block6;
                }
                case 1185373793: {
                    this.a = class_45882;
                    n4 = (n3 | n2) ^ 0xDE952D3B;
                    continue block6;
                }
                case -133780655: 
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void method_23919(float f2, float f3, float f4, int n2, float f5, float f6, int n3, int n4, float f7, float f8, float f9) {
        int n5 = -807625918;
        int n6 = a & 0xCFDC9B42 ^ 0xF5EDF06D;
        int n7 = 0;
        int n8 = (n6 | n5) ^ 0x3CD4D588;
        n7 = (n6 | n5) ^ 0x2B58419;
        block7: while (true) {
            switch (n7) {
                default: {
                    continue block7;
                }
                case -45580426: {
                    n7 = (n6 | n5) ^ 0xAD95A9;
                    continue block7;
                }
                case -404089318: {
                    n8 ^= n7 ^ 0xFF98E01C;
                    n7 = (n6 | n5) ^ 0x38DE7106;
                    continue block7;
                }
                case -11505978: {
                    n8 ^= n7 ^ 0x846D4921;
                    n7 = (n6 | n5) ^ 0x5F675316;
                    continue block7;
                }
                case -953972119: {
                    return;
                }
                case -1600477063: 
            }
            this.a.method_23919(f2, f3, f4, n2 & au.a((n8 | n7 ^ 0x6F46333B) ^ (n7 ^ 0xF3D58401), (n6 | n7 ^ 0x6F46333B) ^ ((n8 | n7 ^ 0x6F46333B) ^ (n7 ^ 0xFD6C9D4F))), f5, f6, n3, n4, f7, f8, f9);
            n7 = (n6 | n5) ^ 0x1817ED75;
        }
    }

    /*
     * Unable to fully structure code
     */
    public class_4588 method_1336(int var1_1, int var2_2, int var3_3, int var4_4) {
        block14: {
            block15: {
                break block15;
lbl1:
                // 1 sources

                while (true) {
                    var7_7 = (var5_6 | var8_5) ^ 1287057520;
                    break block14;
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
                    var7_7 = (var5_6 | var8_5) ^ 985112585;
                    break block14;
                    break;
                }
                this.a.method_1336(0, 0, 0, var4_4);
                var7_7 = (var5_6 | var8_5) ^ 1876458496;
                break block14;
lbl13:
                // 1 sources

                while (true) {
                    var6_8 ^= var7_7 ^ -579093534;
                    ** continue;
                    break;
                }
            }
            var8_5 = -576389604;
            var5_6 = au.a & -576389604 ^ 2079827208;
            var7_7 = 0;
            var6_8 = (var5_6 | var8_5) ^ 940856382;
            ** while (true)
        }
        block11: while (true) {
            switch (var7_7) lbl-1000:
            // 3 sources

            {
                default: {
                    continue block11;
                }
                case -25893959: {
                    ** continue;
                }
                case -1875934436: {
                    ** continue;
                }
lbl31:
                // 1 sources

                while (true) {
                    var7_7 = (var5_6 | var8_5) ^ 25369765;
                    ** GOTO lbl-1000
                    break;
                }
                case -1287581844: {
                    var7_7 = (var5_6 | var8_5) ^ 37370202;
                    ** GOTO lbl-1000
                }
                case -36846010: {
                    var6_8 ^= var7_7 ^ 1003020311;
                    ** continue;
                }
                case -985637099: 
            }
            break;
        }
        return this;
    }

    /*
     * Exception decompiling
     */
    public class_4588 method_39415(int var1_1) {
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
    static {
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
    public class_4588 method_22912(float f2, float f3, float f4) {
        int n2 = 2085028550;
        int n3 = a & 0x7C4702C6 ^ 0x88BFEA7A;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x66FDB5AB;
        n4 = (n3 | n2) ^ 0xBC6D9204;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case 351823343: {
                    return this;
                }
                case -461943557: {
                    n5 ^= n4 ^ 0x502BB5DD;
                    n4 = (n3 | n2) ^ 0x31945424;
                    continue block7;
                }
                case 816204547: {
                    n5 ^= n4 ^ 0x5BED1DB4;
                    n4 = (n3 | n2) ^ 0xE8078F11;
                    continue block7;
                }
                case 1083341050: {
                    n4 = (n3 | n2) ^ 0x1888A605;
                    continue block7;
                }
                case -848576806: 
            }
            this.a.method_22912(f2, f3, f4);
            n4 = (n3 | n2) ^ 0xCC59A1FD;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public class_4588 method_22913(float f2, float f3) {
        int n2 = -919234053;
        int n3 = a & 0xC93599FB ^ 0x4A90D320;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xED7F9319;
        n4 = (n3 | n2) ^ 0x1AF7530A;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1419078897: {
                    n5 ^= n4 ^ 0xC1BC1D3E;
                    n4 = (n3 | n2) ^ 0x20ACE64;
                    continue block7;
                }
                case -1459718368: {
                    this.a.method_22913(f2, f3);
                    n4 = (n3 | n2) ^ 0x60DF48F4;
                    continue block7;
                }
                case -784168719: {
                    n4 = (n3 | n2) ^ 0x85E4BBD;
                    continue block7;
                }
                case -910223969: {
                    return this;
                }
                case -1007972282: 
            }
            n5 ^= n4 ^ 0x85AD39DA;
            n4 = (n3 | n2) ^ 0x634BACDB;
        }
    }

    /*
     * Unable to fully structure code
     */
    public class_4588 method_60796(int var1_1, int var2_2) {
        var6_3 = 761990561;
        var3_4 = au.a & 761990561 ^ -2091938555;
        var5_5 = 0;
        if (true) ** GOTO lbl23
        block7: while (true) {
            var5_5 = (var3_4 | var6_3) ^ 485490130;
            if (true) ** GOTO lbl11
            block8: while (true) {
                var4_6 ^= var5_5 ^ -77573284;
                var5_5 = (var3_4 | var6_3) ^ 1481126902;
lbl11:
                // 3 sources

                block9: while (true) {
                    switch (var5_5) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block9;
                            }
                            break;
                        }
                        case -1283428233: {
                            continue block8;
                        }
                        case 1256863851: {
                            break block7;
                        }
lbl20:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ -444222002;
                            ** GOTO lbl-1000
                            break;
                        }
lbl23:
                        // 1 sources

                        var4_6 = (var3_4 | var6_3) ^ 418396957;
                        ** continue;
                        case -179174086: {
                            this.a.method_60796(var1_1, var2_2);
                            continue block7;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 1513982111;
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
        var5_5 = (var3_4 | var6_3) ^ 358488430;
        ** while (true)
        {
            case -1171155765: {
                var4_6 ^= var5_5 ^ -895291601;
                ** continue;
            }
            ** case -148390317:
        }
lbl38:
        // 1 sources

        return this;
    }

    /*
     * Exception decompiling
     */
    public class_4588 method_22921(int var1_1, int var2_2) {
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
    public class_4588 method_22914(float var1_1, float var2_2, float var3_3) {
        var7_4 = 1203807595;
        var4_5 = au.a & 1203807595 ^ 260398885;
        var6_6 = 0;
        var5_7 = (var4_5 | var7_4) ^ 77445084;
        var6_6 = (var4_5 | var7_4) ^ -749471192;
        if (true) ** GOTO lbl20
        block7: while (true) {
            switch (var6_6) {
                case 309078998: {
                    var5_7 ^= var6_6 ^ 582808632;
                    var6_6 = (var4_5 | var7_4) ^ 1641827860;
                    continue block7;
                }
                case -1667889849: {
                    var6_6 = (var4_5 | var7_4) ^ -1664279253;
                    ** break;
                }
                case -1641402547: {
                    this.a.method_22914(var1_1, var2_2, var3_3);
                    var6_6 = (var4_5 | var7_4) ^ 1571411129;
                }
lbl20:
                // 4 sources

                default: {
                    continue block7;
                }
                case -754392508: {
                    var5_7 ^= var6_6 ^ 369897193;
                    var6_6 = (var4_5 | var7_4) ^ -772812766;
                    continue block7;
                }
                case 773435771: 
            }
            break;
        }
        return this;
    }

    /*
     * Unable to fully structure code
     */
    public class_4588 method_75298(float var1_1) {
        block27: {
            block28: {
                block30: {
                    block29: {
                        break block29;
lbl1:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ -226761975;
                            break block27;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1731335943;
                            ** GOTO lbl36
lbl7:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_4 ^ 1980114169;
                                break block28;
                                break;
                            }
                            break;
                        }
                    }
                    var5_2 = -1435874780;
                    var2_3 = au.a & -1435874780 ^ 637324630;
                    var4_4 = 0;
                    break block30;
lbl15:
                    // 2 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1027062554;
                        ** GOTO lbl36
lbl18:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ -443893508;
                            break block27;
                            break;
                        }
                        break;
                    }
                }
                var3_5 = (var2_3 | var5_2) ^ -1199828519;
                var4_4 = (var2_3 | var5_2) ^ 483964929;
                ** GOTO lbl36
lbl25:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 1710052666;
                    ** GOTO lbl36
                    break;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ -1580063574;
            ** GOTO lbl36
lbl31:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -1471343898;
                if (true) ** GOTO lbl36
                break;
            }
            block23: while (true) {
                var4_4 = (var2_3 | var5_2) ^ 1155784345;
lbl36:
                // 8 sources

                block24: while (true) {
                    switch (var4_4) lbl-1000:
                    // 3 sources

                    {
                        default: {
                            continue block24;
                        }
                        case -350416401: {
                            ** continue;
                        }
                        case -1648179848: {
                            ** continue;
                        }
                        case -926099343: {
                            ** GOTO lbl15
                        }
                        case 259670394: {
                            ** continue;
                        }
                        case 129228176: {
                            ** continue;
                        }
lbl50:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 631418385;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -1289324681: {
                            var4_4 = (var2_3 | var5_2) ^ 842795534;
                            ** GOTO lbl-1000
                        }
                        case -1973657241: {
                            var3_5 ^= var4_4 ^ 106130827;
                            ** continue;
                        }
                        case 237824988: {
                            this.a.method_75298(var1_1);
                            ** continue;
                        }
                        case 1832291216: {
                            switch (var3_5) {
                                default: {
                                    ** continue;
                                }
                                case -62505170: {
                                    continue block23;
                                }
                                ** case 680228970:
lbl70:
                                // 1 sources

                                ** continue;
                            }
                        }
                        case -904684980: {
                            return this;
                        }
                    }
                    break;
                }
                break;
            }
        }
        var4_4 = (var2_3 | var5_2) ^ -1601925620;
        ** while (true)
    }

    private static int a(int n2, int n3) {
        int n4 = -186109020;
        int n5 = -6485250;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x536E8CC4)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xFFFDEA0A;
        n6 -= (n5 | n4) ^ 0xFFFDDD6D;
        n6 += (n5 | n4) ^ 0xFFFD13D2;
        n6 ^= (n5 | n4) ^ 0xFFFD71E3;
        n6 += (n5 | n4) ^ 0xFFFD164C;
        n6 -= (n5 | n4) ^ 0xFFFDA078;
        n6 -= (n5 | n4) ^ 0xFFFD3DC0;
        n6 ^= (n5 | n4) ^ 0xFFFDA619;
        n6 ^= (n5 | n4) ^ 0xFFFDA6F2;
        return n6 -= (n5 | n4) ^ 0xFFFD116E;
    }
}

