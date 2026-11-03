/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10868
 *  net.minecraft.class_310
 *  org.lwjgl.opengl.GL30
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10868;
import net.minecraft.class_310;
import org.lwjgl.opengl.GL30;
import z.r.W;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class jI {
    public static final int b;
    private static final /* synthetic */ String a;
    private static final int[] a;
    private static final /* synthetic */ String b;
    private static W a;
    private static int a;

    /*
     * Enabled aggressive block sorting
     */
    private jI() {
        int n2 = b & 0x56FD2AF5 ^ 0x3EE67777;
        int n3 = (n2 | 0x56FD2AF5) ^ 0xF6B2649C;
        n3 ^= 0xCEECAF8B;
        n3 ^= 0xCE2C5CAC;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block30: {
            block29: {
                block33: {
                    break block33;
lbl1:
                    // 2 sources

                    while (true) {
                        block32: {
                            block31: {
                                var0_2 ^= 748112697;
                                break block29;
lbl4:
                                // 2 sources

                                while (true) {
                                    v0 = (var0_2 | var2) ^ 952102298 ^ jI.b;
                                    var0_2 ^= 1581041790;
                                    jI.a[v1] = v2 ^ v0;
                                    v1 = v1 + 1;
                                    v3 = v3;
                                    v4 = v4 + 4;
                                    var0_2 ^= -1691957372;
                                    if (v4 + 4 < v3.length) break block30;
                                    break block31;
                                    break;
                                }
lbl16:
                                // 2 sources

                                while (true) {
                                    var0_2 ^= -529095039;
                                    var0_2 ^= 1314464007;
                                    var0_2 ^= 1321332073;
                                    break block32;
                                    break;
                                }
                            }
                            block24: while (true) {
                                switch (var0_2) {
                                    case 1617660384: {
                                        var0_2 ^= 2118624302;
                                        break block24;
                                    }
                                    default: {
                                        var0_2 ^= -1000943221;
                                        break block24;
                                    }
                                    case 1347555010: {
                                        var0_2 ^= -171119657;
                                        continue block24;
                                    }
                                }
                                break;
                            }
                            jI.a = gj.decode("W9xwYwd02w==", jI.KS((var0_2 | var2) ^ -902775544, var2 ^ ((var0_2 | var2) ^ -1784260001)));
                            jI.b = gj.decode("Lh1DqjtKJs9T", jI.KS((var0_2 | var2) ^ -902775543, var2 ^ ((var0_2 | var2) ^ -1406421702)));
                            return;
                        }
                        v2 = v5 | ((v3[v4 + 1] & 255) << 16 | ((v3[v4 + 2] & 255) << 8 | v3[v4 + 3] & 255));
                        block25: while (true) {
                            switch (var0_2) {
                                case 148419729: {
                                    var0_2 ^= -1187617789;
                                    ** GOTO lbl4
                                }
                                case 1974424541: {
                                    var0_2 ^= -1721216584;
                                    continue block25;
                                }
                            }
                            break;
                        }
                        var0_2 ^= 2059771272;
                        ** continue;
                        break;
                    }
                }
                var2 = 502649671;
                jI.b = mK.a(MethodHandles.lookup().lookupClass(), 1589827679);
                var1_1 = 0;
                var0_2 = -2059832409;
                var1_1 = var2 ^ -598943506;
                block26: while (true) {
                    switch (var1_1) {
                        default: {
                            continue block26;
                        }
                        case -1044837463: {
                            break;
                        }
                        case -653546695: {
                            var0_2 ^= var1_1 ^ 479693171;
                            var1_1 = var2 ^ -1240799224;
                            continue block26;
                        }
                        case -1409336497: {
                            ** break;
lbl71:
                            // 1 sources

                            v1 = 0;
                            v4 = 0;
                            v3 = "$\u00ddlw_X\"\u00a8\u00a3\u00f1\u008f!\u00e0\u00b2\u00a5\u00d6\u00cd(\u00c5\u00a1\u009b\u00a1\u00d0\u0013\u00a6W\u00da\u000b\u00b1\u00802k\u00ea\u009bX\u0004\u00fc>#\u0003".getBytes("ISO-8859-1");
                            jI.a = new int[((var0_2 ^= -1579484769) | var2) ^ -33555587];
                            var0_2 ^= -2129387118;
                            break block30;
                        }
                    }
                    var1_1 = var2 ^ -989955970;
                }
            }
            v5 = (v3[v4] & 255) << 24;
            block27: while (true) {
                switch (var0_2) {
                    case 1555605768: {
                        var0_2 ^= 1675810933;
                        ** GOTO lbl16
                    }
                    default: {
                        var0_2 ^= -142897793;
                        continue block27;
                    }
                    case 2116778434: 
                }
                break;
            }
            var0_2 ^= 1628676618;
            ** while (true)
        }
        block28: while (true) {
            switch (var0_2) {
                default: {
                    var0_2 ^= 772798692;
                    ** GOTO lbl1
                }
                case -1337767445: {
                    var0_2 ^= -272990041;
                    continue block28;
                }
                case 1617660384: 
            }
            break;
        }
        var0_2 ^= 272919505;
        ** while (true)
    }

    private static int KS(int n2, int n3) {
        int n4 = 1502610970;
        int n5 = -1896035176;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xA318C55)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xDFFC0778;
        n6 -= (n5 | n4) ^ 0xDFFCA00C;
        n6 ^= (n5 | n4) ^ 0xDFFC8287;
        n6 += (n5 | n4) ^ 0xDFFC178D;
        n6 ^= (n5 | n4) ^ 0xDFFCCFAF;
        n6 += (n5 | n4) ^ 0xDFFC1401;
        return n6 ^= (n5 | n4) ^ 0xDFFCD4FE;
    }

    /*
     * Exception decompiling
     */
    public static void onGuiRendered() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 401[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean KT(class_310 var0) {
        block54: {
            var9_1 = 736154079;
            var8_2 = -2119638854;
            var7_3 = 1864401697;
            var4_4 = jI.b & 1864401697 ^ -815055928;
            var6_5 = 0;
            var5_10 = (var4_4 | var7_3) ^ 990368321;
            var6_5 = (var4_4 | var7_3) ^ 1471119971;
            break block54;
lbl9:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ -899349571;
                break block54;
                break;
            }
lbl12:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ -1694494836;
                break block54;
                break;
            }
lbl15:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ 20755702;
                ** GOTO lbl101
                break;
            }
lbl18:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl20:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ -1117934994;
                ** GOTO lbl139
                break;
            }
        }
        block40: while (true) {
            switch (var6_5) {
                default: {
                    continue block40;
                }
                case 1953215589: {
                    var5_10 ^= var6_5 ^ 1991758530;
                    ** continue;
                }
                case 621721684: {
                    var1_6 = var0.method_1522();
                    break block40;
                }
                case -1195099766: {
                    ** continue;
                }
            }
            break;
        }
        var6_5 = (var4_4 | var7_3) ^ -2078433581;
        ** GOTO lbl139
lbl38:
        // 2 sources

        while (true) {
            var6_5 = (var4_4 | var7_3) ^ -1175309202;
            ** GOTO lbl101
            break;
        }
        var6_5 = (var4_4 | var7_3) ^ -1587409093;
        block42: while (true) {
            switch (var6_5) {
                case 2026099101: {
                    var5_10 ^= var6_5 ^ -1496218561;
                    ** GOTO lbl70
                }
                case 1309258962: {
                    var5_10 ^= var6_5 ^ 1949908306;
                    ** break;
                }
                case 1153454846: {
                    if (GL30.glCheckFramebufferStatus((int)jI.KS((var5_10 | var6_5 ^ var9_1) ^ (var6_5 ^ -17177776), (var4_4 | var6_5 ^ var9_1) ^ ((var5_10 | var6_5 ^ var9_1) ^ (var6_5 ^ 1733135315)))) == jI.KS((var5_10 | var6_5 ^ var9_1) ^ (var6_5 ^ -17177775), (var4_4 | var6_5 ^ var9_1) ^ ((var5_10 | var6_5 ^ var9_1) ^ (var6_5 ^ 1889165915)))) {
                        var6_5 = (var4_4 | var7_3) ^ 1659756143;
                        continue block42;
                    }
                    ** GOTO lbl65
                }
                case -293051493: {
                    GL30.glFramebufferTexture2D((int)jI.KS((var5_10 | var6_5 ^ var8_2) ^ (var6_5 ^ -995916110), (var4_4 | var6_5 ^ var8_2) ^ ((var5_10 | var6_5 ^ var8_2) ^ (var6_5 ^ 468881900))), (int)jI.KS((var5_10 | var6_5 ^ var8_2) ^ (var6_5 ^ -995916107), (var4_4 | var6_5 ^ var8_2) ^ ((var5_10 | var6_5 ^ var8_2) ^ (var6_5 ^ 912849596))), (int)jI.KS((var5_10 | var6_5 ^ var8_2) ^ (var6_5 ^ -995916108), (var4_4 | var6_5 ^ var8_2) ^ ((var5_10 | var6_5 ^ var8_2) ^ (var6_5 ^ 1625318410))), (int)var3_9, (int)0);
                    var6_5 = (var4_4 | var7_3) ^ -1750570380;
                    continue block42;
                }
                case -1920572026: {
                    var5_10 ^= var6_5 ^ 845373193;
                    var6_5 = (var4_4 | var7_3) ^ -703019516;
                    continue block42;
                }
lbl63:
                // 1 sources

                var6_5 = (var4_4 | var7_3) ^ 31709298;
                ** GOTO lbl71
lbl65:
                // 1 sources

                var6_5 = (var4_4 | var7_3) ^ -503048292;
                ** GOTO lbl71
                case -2024886887: {
                    v0 = false;
                    ** GOTO lbl75
                }
lbl70:
                // 1 sources

                var6_5 = (var4_4 | var7_3) ^ -1414797033;
lbl71:
                // 4 sources

                default: {
                    continue block42;
                }
                case 963870189: {
                    v0 = true;
lbl75:
                    // 2 sources

                    var5_10 ^= 1880129162;
                    return v0;
                }
                case 225422453: 
            }
            var5_10 ^= var6_5 ^ -1299540230;
            var6_5 = (var4_4 | var7_3) ^ 1747261040;
        }
lbl81:
        // 1 sources

        while (true) {
            var6_5 = (var4_4 | var7_3) ^ 891495030;
            ** GOTO lbl101
            break;
        }
lbl84:
        // 1 sources

        while (true) {
            var6_5 = (var4_4 | var7_3) ^ -1155481756;
            if (true) ** GOTO lbl139
            break;
        }
lbl87:
        // 1 sources

        while (true) {
            var6_5 = (var4_4 | var7_3) ^ -1076324497;
            if (true) ** GOTO lbl101
            break;
        }
lbl90:
        // 1 sources

        while (true) {
            var2_7 = (class_10868)var3_8;
            ** continue;
            break;
        }
        block47: while (true) {
            var6_5 = (var4_4 | var7_3) ^ 734558545;
            if (true) ** GOTO lbl101
            block48: while (true) {
                var6_5 = (var4_4 | var7_3) ^ 1489341225;
                if (true) ** GOTO lbl101
                block49: while (true) {
                    var6_5 = (var4_4 | var7_3) ^ -912572612;
lbl101:
                    // 7 sources

                    block50: while (true) {
                        switch (var6_5) {
                            default: {
                                continue block50;
                            }
                            case -995900744: {
                                var5_10 ^= var6_5 ^ 46916375;
                                ** continue;
                            }
                            case 1452904327: {
                                var6_5 = (var4_4 | var7_3) ^ 506269403;
                                continue block50;
                            }
                            case -1213321024: {
                                var5_10 ^= var6_5 ^ 657224253;
                                continue block49;
                            }
                            case -247024334: {
                                jI.a = GL30.glGenFramebuffers();
                                continue block48;
                            }
                            case 653296853: {
                                GL30.glBindFramebuffer((int)jI.KS((var5_10 | var6_5 ^ 1238370292) ^ (var6_5 ^ -1669117453), (var4_4 | var6_5 ^ 1238370292) ^ ((var5_10 | var6_5 ^ 1238370292) ^ (var6_5 ^ 9532506))), (int)jI.a);
                                continue block47;
                            }
                            case 191436208: {
                                var6_5 = (var4_4 | var7_3) ^ 614360435;
                                continue block50;
                            }
                            case -632776289: {
                                if (jI.a == 0) ** GOTO lbl38
                                var6_5 = (var4_4 | var7_3) ^ -469586343;
                                continue block50;
                            }
                            case -873079142: {
                                if (!GL30.glIsFramebuffer((int)jI.a)) ** break;
                                continue block48;
                                ** continue;
                            }
                            case 1353919622: {
                                var3_9 = var2_7.method_68427();
                                ** continue;
                            }
                            case -296284385: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            break;
        }
        var5_10 ^= var6_5 ^ 2044272214;
        ** while (true)
        block51: while (true) {
            var6_5 = (var4_4 | var7_3) ^ 1263384290;
lbl139:
            // 4 sources

            block52: while (true) {
                switch (var6_5) {
                    default: {
                        continue block52;
                    }
                    case -1541010165: {
                        var5_10 ^= var6_5 ^ 882726810;
                        ** continue;
                    }
                    case 1802904890: {
                        var5_10 ^= var6_5 ^ -96432998;
                        var6_5 = (var4_4 | var7_3) ^ -1987570856;
                        continue block52;
                    }
                    case 702696826: {
                        var3_8 = var1_6.method_30277();
                        if (!(var3_8 instanceof class_10868)) continue block51;
                        var5_10 ^= 1295317489;
                        ** continue;
                    }
                    case 1379275143: {
                        var6_5 = (var4_4 | var7_3) ^ -964036973;
                        continue block52;
                    }
                    case 1726195889: {
                        if (var1_6 != null) ** break;
                        continue block51;
                        ** continue;
                    }
                    case 1414202509: 
                }
                break;
            }
            break;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public static void shutdown() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [48[UNCONDITIONALDOLOOP]], but top level block is 49[DOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
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
}

