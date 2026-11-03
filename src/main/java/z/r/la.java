/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1309
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_5599
 *  net.minecraft.class_5601
 *  net.minecraft.class_5602
 *  net.minecraft.class_591
 *  net.minecraft.class_7920
 *  net.minecraft.class_8685
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_5599;
import net.minecraft.class_5601;
import net.minecraft.class_5602;
import net.minecraft.class_591;
import net.minecraft.class_7920;
import net.minecraft.class_8685;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class la {
    public static final int a;
    private static final int[] a;
    private static class_5599 a;
    private static final class_5601 a;
    private static class_591 a;
    private static class_591 b;

    private static int Bz(int n2, int n3) {
        int n4 = -1948946610;
        int n5 = 24313097;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x535BF5D)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x8BF7DEE6;
        n6 -= (n5 | n4) ^ 0x8BF7A047;
        n6 += (n5 | n4) ^ 0x8BF7748F;
        n6 += (n5 | n4) ^ 0x8BF7BD52;
        n6 += (n5 | n4) ^ 0x8BF70D5D;
        return n6 += (n5 | n4) ^ 0x8BF7223D;
    }

    /*
     * Enabled aggressive block sorting
     */
    private la() {
        int n2 = a & 0xD9A8033D ^ 0x9F1A0D21;
        int n3 = (n2 | 0xD9A8033D) ^ 0x8894B93C;
        n3 ^= 0xFD86BFD4;
        n3 ^= 0x6D0B13A;
    }

    /*
     * Exception decompiling
     */
    static void draw(class_332 var0, class_1309 var1_1, int var2_2, int var3_3, int var4_4, int var5_5, float var6_6, float var7_7, float var8_8) {
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
    static {
        block27: {
            block29: {
                block28: {
                    break block28;
lbl1:
                    // 1 sources

                    while (true) {
                        var7_2 = var8_1 ^ -532129120;
                        break block27;
lbl4:
                        // 2 sources

                        while (true) {
                            var5_8 = (var0_3[var3_6] & (((var6_9 ^= -17130049) | var8_1) ^ 1458953984)) << ((var6_9 | var8_1) ^ 1458954215) | (var0_3[var3_6 + 1] & ((var6_9 | var8_1) ^ 1458953984)) << ((var6_9 | var8_1) ^ 1458954223) | (var0_3[var3_6 + 2] & ((var6_9 | var8_1) ^ 1458953984)) << ((var6_9 | var8_1) ^ 1458954231) | var0_3[var3_6 + 3] & ((var6_9 | var8_1) ^ 1458953984);
                            var7_2 = var8_1 ^ -715177274;
                            ** GOTO lbl88
                            break;
                        }
                        break;
                    }
                }
                var9 = 29956512;
                var8_1 = 385146555;
                la.a = mK.a(MethodHandles.lookup().lookupClass(), 1925841521);
                var7_2 = 0;
                var6_9 = 121695179;
                var7_2 = var8_1 ^ -1355346724;
                block23: while (true) {
                    switch (var7_2) {
                        default: {
                            continue block23;
                        }
                        case -1178348953: {
                            var7_2 = var8_1 ^ 1253111156;
                            continue block23;
                        }
                        case -649383965: {
                            var2_5 = (var6_9 | var7_2 ^ -809504424) ^ (var7_2 ^ 524117281) ^ la.a;
                            var6_9 ^= -1048695804;
                            break block23;
                        }
                        case 1547971535: {
                            var6_9 ^= var7_2 ^ -1910798614;
                            var7_2 = var8_1 ^ -809504424;
                            continue block23;
                        }
                    }
                    break;
                }
                var0_3 = "\u00cd\u00d1\u00a9\u00d4\u0016\u00fd\u00a6\\I\u0011z\u00a8x\u00d8\u008d\u00e0\u0015Dol\u0099\u0011\u00daeA\u00cc\u00ca\u00e3\u00b6\u0092\u00c0\u0085\u00bf\u00cf\u00ae\u00ee[\u0094\u00b3\u00e2\u0084\u00e8$~\u00d1\u0090\u0019\u00d1^y\u0089\u00a2\u0000\u001c\u00f7j\\\u0007/~\u0014\u00d1\u00e6\u0093\u00a8\u0093BkRW;\u00a0\u0015\"\u001c\u00b5U;qRC\u00c2(<8\u0094\u009d\f".getBytes("ISO-8859-1");
                var6_9 ^= 2078888510;
                break block29;
lbl33:
                // 1 sources

                while (true) {
                    var7_2 = var8_1 ^ 2087719096;
                    break block27;
                    break;
                }
            }
            var1_4 = var0_3.length / 4;
            var7_2 = var8_1 ^ -2060503711;
            block25: while (true) {
                switch (var7_2) {
                    default: {
                        continue block25;
                    }
                    case -162559824: {
                        var3_6 = 0;
                        var6_9 ^= -2006900224;
                        var4_7 = 0;
                        ** GOTO lbl4
                    }
                    case -1635002693: {
                        var6_9 ^= var7_2 ^ 797961474;
                        break;
                    }
                    case -1814303782: {
                        var6_9 ^= var7_2 ^ 2103038046;
                        var7_2 = var8_1 ^ 773804335;
                        continue block25;
                    }
                    case 954961812: {
                        la.a = new int[var1_4];
                        var7_2 = var8_1 ^ -2004940800;
                        continue block25;
                    }
                }
                var7_2 = var8_1 ^ -524593653;
            }
        }
        block26: while (true) {
            switch (var7_2) {
                case -465797858: {
                    var3_6 += 4;
                    if (++var4_7 >= var1_4) ** break;
                    ** continue;
                    var7_2 = var8_1 ^ -1146018196;
                    continue block26;
                }
                case 160072650: {
                    var6_9 ^= var7_2 ^ -781783574;
                    var7_2 = var8_1 ^ -221731931;
                    continue block26;
                }
                case -1387923241: {
                    var6_9 ^= var7_2 ^ 354054028;
                    var7_2 = var8_1 ^ var9;
                    continue block26;
                }
                case -155417573: {
                    la.a[var4_7] = var5_8 ^= var2_5;
                    var7_2 = var8_1 ^ 528375153;
                    ** break;
                }
                case -1012163459: {
                    var6_9 ^= var7_2 ^ -440569886;
                    ** continue;
                }
                case 1787088387: {
                    var6_9 ^= var7_2 ^ 1922729334;
                    var7_2 = var8_1 ^ 1757352861;
                }
lbl88:
                // 4 sources

                default: {
                    continue block26;
                }
                case 389924635: {
                    v0 = new int[la.Bz((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081805), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -483595499)))];
                    v0[0] = la.Bz((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081808), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1128254393)));
                    v0[1] = la.Bz((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081807), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1928740086)));
                    v0[2] = la.Bz((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081802), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -527097446)));
                    v0[3] = la.Bz((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081801), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1824560314)));
                    v0[4] = la.Bz((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081804), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1273134061)));
                    v0[5] = la.Bz((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081803), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1128500833)));
                    v0[la.Bz((int)((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081798)), (int)(var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1243538353))))] = la.Bz((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081797), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1371144937)));
                    v0[la.Bz((int)((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081800)), (int)(var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1899587872))))] = la.Bz((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081799), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 608261946)));
                    v0[la.Bz((int)((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081794)), (int)(var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1415002885))))] = la.Bz((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081793), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -171066994)));
                    v0[la.Bz((int)((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081796)), (int)(var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1445567942))))] = la.Bz((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081795), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -520050570)));
                    v0[la.Bz((int)((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081822)), (int)(var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ 1564610352))))] = la.Bz((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1895081821), var7_2 ^ var9 ^ ((var6_9 | var7_2 ^ var9) ^ (var7_2 ^ -1484360353)));
                    v1 = new int[]{la.Bz(((var6_9 ^= 1509298757) | var8_1) ^ -785080321, var8_1 ^ ((var6_9 | var8_1) ^ -1093888746)), la.Bz((var6_9 | var8_1) ^ -785080322, var8_1 ^ ((var6_9 | var8_1) ^ -19531540)), la.Bz((var6_9 | var8_1) ^ -785080327, var8_1 ^ ((var6_9 | var8_1) ^ -399728227)), la.Bz((var6_9 | var8_1) ^ -785080328, var8_1 ^ ((var6_9 | var8_1) ^ -1820715863))};
                    var6_9 ^= 1795084111;
                    v2(class_2960.method_60656((String)gj.text(v0)), gj.text(v1));
                    la.a = v2;
                    ** continue;
                }
                case 2118896934: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static void drawSkin(class_332 var0, class_8685 var1_1, int var2_2, int var3_3, int var4_4, int var5_5, float var6_6, float var7_7, float var8_8) {
        block55: {
            var16_9 = -1345436753;
            var13_10 = la.a & -1345436753 ^ -1458298992;
            var15_11 = 0;
            var14_14 = (var13_10 | var16_9) ^ -1344919554;
            var15_11 = (var13_10 | var16_9) ^ -1522695109;
            break block55;
lbl7:
            // 1 sources

            while (true) {
                var15_11 = (var13_10 | var16_9) ^ 1459635677;
                ** GOTO lbl54
lbl10:
                // 1 sources

                while (true) {
                    v0(var10_13.method_32072(class_5602.field_27577), false);
                    la.b = v0;
                    var15_11 = (var13_10 | var16_9) ^ -1318112306;
                    ** GOTO lbl54
                    break;
                }
                break;
            }
lbl15:
            // 1 sources

            while (true) {
                var15_11 = (var13_10 | var16_9) ^ 647592007;
                ** GOTO lbl54
lbl-1000:
                // 3 sources

                {
                    switch (var15_11) {
                        case 1528682379: {
                            var0.method_70854(var11_15, var1_1.comp_1626().comp_3627(), var6_6, -var12_16, var7_7, -1.0625f, var2_2, var3_3, var4_4, var5_5);
                            ** break;
                        }
                        case 1036636649: {
                            var14_14 ^= var15_11 ^ -1050976990;
                            ** GOTO lbl27
                        }
lbl25:
                        // 1 sources

                        var15_11 = (var13_10 | var16_9) ^ -1843949994;
                        continue block44;
lbl27:
                        // 1 sources

                        var15_11 = (var13_10 | var16_9) ^ -417729686;
                        continue block44;
                        case 813585234: {
                            var14_14 ^= var15_11 ^ 343579992;
                            var15_11 = (var13_10 | var16_9) ^ -188512204;
                            break;
                        }
                        case 1221045461: {
                            return;
                        }
                    }
lbl35:
                    // 3 sources

                    ** while (true)
                }
                break;
            }
lbl36:
            // 4 sources

            while (true) {
                var15_11 = (var13_10 | var16_9) ^ 613501768;
                break block55;
                break;
            }
lbl39:
            // 2 sources

            while (true) {
                var14_14 ^= 939523844;
                var11_15 = v1;
                var14_14 ^= 933990827;
                var12_16 = Math.max(-35.0f, Math.min(35.0f, var8_8));
                var15_11 = (var13_10 | var16_9) ^ -1616900883;
                ** GOTO lbl35
                break;
            }
lbl46:
            // 1 sources

            while (true) {
                var15_11 = (var13_10 | var16_9) ^ -1563176705;
                if (true) ** GOTO lbl54
                break;
            }
            block49: while (true) {
                var15_11 = (var13_10 | var16_9) ^ -60019890;
                if (true) ** GOTO lbl54
                block50: while (true) {
                    var15_11 = (var13_10 | var16_9) ^ -1434290583;
lbl54:
                    // 6 sources

                    block51: while (true) {
                        switch (var15_11) {
                            case -466034502: {
                                var14_14 ^= var15_11 ^ 653167205;
                                ** break;
                            }
                            case 514944113: {
                                var14_14 ^= var15_11 ^ -1924277113;
                                var15_11 = (var13_10 | var16_9) ^ -424853133;
                                continue block51;
                            }
                            case -119661982: {
                                if (var1_1.comp_1629() == class_7920.field_41122) {
                                    var15_11 = (var13_10 | var16_9) ^ 955217834;
                                    continue block51;
                                }
                                ** GOTO lbl113
                            }
                            case -1991825416: {
                                var14_14 ^= var15_11 ^ 167893932;
                                ** GOTO lbl96
                            }
                            case -1758386155: {
                                var14_14 ^= var15_11 ^ 623947140;
                                var15_11 = (var13_10 | var16_9) ^ 834441008;
                                continue block51;
                            }
                            case -2077695300: {
                                v1 = la.b;
                                ** GOTO lbl39
                            }
                            case 852516346: {
                                la.a = var10_13;
                                ** GOTO lbl111
                            }
                            case -1637691249: {
                                v1 = la.a;
                                ** continue;
                            }
                            case -114791613: {
                                var14_14 ^= var15_11 ^ 1261039314;
                                var15_11 = (var13_10 | var16_9) ^ 737590531;
                                continue block51;
                            }
                            case 218992448: {
                                ** break;
                            }
lbl90:
                            // 1 sources

                            var15_11 = (var13_10 | var16_9) ^ -1660026299;
                            ** GOTO lbl122
                            case 1404204273: {
                                ** GOTO lbl124
                            }
lbl94:
                            // 1 sources

                            var15_11 = (var13_10 | var16_9) ^ 1183091294;
                            continue block51;
lbl96:
                            // 1 sources

                            var15_11 = (var13_10 | var16_9) ^ 313943600;
                            continue block51;
                            case 1192698270: {
                                var14_14 ^= 144174103;
                                ** continue;
                            }
                            case 89926102: {
                                var14_14 ^= var15_11 ^ 198600002;
                                ** continue;
                            }
                            case 1190504741: {
                                var14_14 ^= var15_11 ^ -442203034;
                                var15_11 = (var13_10 | var16_9) ^ -389448159;
                                continue block51;
                            }
                            case -1291014010: {
                                if (la.a != null) continue block50;
                                ** GOTO lbl121
                            }
lbl111:
                            // 1 sources

                            var15_11 = (var13_10 | var16_9) ^ -382994790;
                            continue block51;
lbl113:
                            // 1 sources

                            var15_11 = (var13_10 | var16_9) ^ 1458975996;
                            continue block51;
                            case -1117242993: {
                                if (var10_13 == la.a) {
                                    ** continue;
                                }
                                ** GOTO lbl121
                            }
                            case -379922975: {
                                if (la.b != null) continue block49;
lbl121:
                                // 3 sources

                                var15_11 = (var13_10 | var16_9) ^ 1273413381;
                            }
lbl122:
                            // 3 sources

                            default: {
                                continue block51;
                            }
lbl124:
                            // 1 sources

                            var15_11 = (var13_10 | var16_9) ^ 483585849;
                            continue block51;
                            case 1232281292: 
                        }
                        break;
                    }
                    var14_14 ^= -85189763;
                    v2(var10_13.method_32072(la.a), true);
                    la.a = v2;
                }
                break;
            }
        }
        block52: while (true) {
            block56: {
                switch (var15_11) {
                    case -1957751561: {
                        var14_14 ^= var15_11 ^ 517676432;
                        ** GOTO lbl164
                    }
                    case -397580541: {
                        var15_11 = (var13_10 | var16_9) ^ 1254656404;
                        continue block52;
                    }
                    case 182705028: {
                        var15_11 = (var13_10 | var16_9) ^ 45907771;
                        continue block52;
                    }
                    case -451488213: {
                        if (var4_4 <= var2_2) ** GOTO lbl36
                        var15_11 = (var13_10 | var16_9) ^ 1697418483;
                        continue block52;
                    }
                    case -1913399465: {
                        return;
                    }
                    case 836827163: {
                        if (var5_5 > var3_3) ** GOTO lbl160
                        ** GOTO lbl36
                    }
                    case 1129982771: {
                        if (var1_1 == null) ** GOTO lbl36
                        ** GOTO lbl178
                    }
                    case 1442521029: {
                        if (var0 != null) ** break;
                        ** continue;
                        var15_11 = (var13_10 | var16_9) ^ 166807376;
                        continue block52;
                    }
lbl160:
                    // 1 sources

                    var15_11 = (var13_10 | var16_9) ^ 591213626;
                    break;
                    case -1506862865: {
                        break block56;
                    }
lbl164:
                    // 1 sources

                    var15_11 = (var13_10 | var16_9) ^ 573409512;
                    break;
                    case 642039600: {
                        var9_12 = class_310.method_1551();
                        var14_14 ^= 1992392948;
                        var10_13 = var9_12.method_31974();
                        ** continue;
                    }
                    case -890055860: {
                        var15_11 = (var13_10 | var16_9) ^ -1640061020;
                        break;
                    }
                    case -1386078076: {
                        var14_14 ^= var15_11 ^ 368745064;
                        var15_11 = (var13_10 | var16_9) ^ -98221958;
                        break;
                    }
lbl178:
                    // 1 sources

                    var15_11 = (var13_10 | var16_9) ^ 1200830652;
                    break;
                    case -1931252859: {
                        var14_14 ^= var15_11 ^ 672557183;
                        ** break;
lbl183:
                        // 1 sources

                        var15_11 = (var13_10 | var16_9) ^ -1986338673;
                    }
                }
                continue;
            }
            var15_11 = (var13_10 | var16_9) ^ -326863732;
        }
    }
}

