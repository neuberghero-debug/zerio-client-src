/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
 *  org.lwjgl.opengl.GL11
 */
package z.r;

import com.mojang.blaze3d.opengl.GlStateManager;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4597;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class ax {
    private static final int[] a;
    public static final int a;

    private static int rt(int n2, int n3) {
        int n4 = -1611471550;
        int n5 = -1123074318;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x8BCAAFC3)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xBFFFDF4D;
        n6 -= (n5 | n4) ^ 0xBFFF2FEB;
        n6 += (n5 | n4) ^ 0xBFFF2DFA;
        n6 -= (n5 | n4) ^ 0xBFFF1C09;
        n6 -= (n5 | n4) ^ 0xBFFF08B9;
        n6 ^= (n5 | n4) ^ 0xBFFF2222;
        n6 -= (n5 | n4) ^ 0xBFFFD13B;
        n6 ^= (n5 | n4) ^ 0xBFFF95AB;
        return n6 ^= (n5 | n4) ^ 0xBFFF6323;
    }

    private ax() {
        int n2 = a & 0x6B4AD146 ^ 0xC538655E;
        int n3 = (n2 | 0x6B4AD146) ^ 0x7DB501D0;
        n3 ^= 0x69508944;
    }

    /*
     * Unable to fully structure code
     */
    public static void flushImmediate(class_4597 var0) {
        block23: {
            break block23;
lbl1:
            // 1 sources

            while (true) {
                block20: {
                    block19: {
                        var4_3 = (var2_2 | var5_1) ^ 744156834;
                        ** GOTO lbl31
lbl4:
                        // 1 sources

                        return;
lbl6:
                        // 2 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -1314345291;
                            ** GOTO lbl31
lbl9:
                            // 1 sources

                            while (true) {
                                var3_4 ^= var4_3 ^ 1960845264;
                                break block19;
                                break;
                            }
lbl12:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -2101168614;
                                if (true) ** GOTO lbl31
                                break;
                            }
                            break;
                        }
                        block14: while (true) {
                            block22: {
                                block21: {
                                    var4_3 = (var2_2 | var5_1) ^ 1805563941;
                                    break block22;
lbl18:
                                    // 1 sources

                                    while (true) {
                                        var3_4 ^= var4_3 ^ 994973321;
                                        break block20;
                                        break;
                                    }
lbl21:
                                    // 1 sources

                                    while (true) {
                                        var1_5 = (class_4597.class_4598)var0;
                                        var3_4 ^= -1424633559;
                                        break block21;
                                        break;
                                    }
lbl25:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ -1542819570;
                                        break block22;
                                        break;
                                    }
                                }
                                var1_5.method_22993();
                                ** GOTO lbl6
                            }
lbl32:
                            // 3 sources

                            block18: while (true) {
                                switch (var4_3) {
                                    default: {
                                        continue block18;
                                    }
                                    case -1075200034: {
                                        ** continue;
                                    }
                                    case -537538823: {
                                        ** continue;
                                    }
                                    case -900263614: {
                                        ** continue;
                                    }
                                    case 1523860841: {
                                        ** continue;
                                    }
                                    case 274794450: {
                                        var3_4 ^= var4_3 ^ -1271097260;
                                        ** continue;
                                    }
                                    case -113440275: {
                                        if (var0 instanceof class_4597.class_4598) ** break;
                                        ** continue;
                                        ** continue;
                                    }
                                    case 1470452053: {
                                        continue block14;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                    var4_3 = (var2_2 | var5_1) ^ 556530334;
                    ** GOTO lbl32
                }
                var4_3 = (var2_2 | var5_1) ^ -1005191127;
                ** continue;
                break;
            }
        }
        var5_1 = 2063373814;
        var2_2 = ax.a & 2063373814 ^ 1909172999;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ 484409232;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static void beginThroughWallOverlay() {
        block45: {
            block44: {
                break block44;
lbl1:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
lbl3:
                // 1 sources

                return;
lbl5:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ 1329642390;
                    ** GOTO lbl79
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ -1949612442;
                    ** GOTO lbl79
                    break;
                }
                GL11.glDisable((int)ax.rt((var1_3 | var2_2 ^ 713182320) ^ (var2_2 ^ -1623745479), (var0_1 | var2_2 ^ 713182320) ^ ((var1_3 | var2_2 ^ 713182320) ^ (var2_2 ^ -1184161361))));
                var2_2 = (var0_1 | var3) ^ -74561584;
                ** GOTO lbl79
lbl14:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ 1768788865;
                    ** continue;
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ 164699103;
                    ** GOTO lbl70
                    break;
                }
lbl22:
                // 1 sources

                while (true) {
                    var1_3 ^= var2_2 ^ 1954198962;
                    var2_2 = (var0_1 | var3) ^ -1760178669;
                    ** GOTO lbl79
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ 1302534135;
                    ** GOTO lbl79
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var3 = 1617378561;
            var0_1 = ax.a & 1617378561 ^ -1006871216;
            var2_2 = 0;
            break block45;
lbl36:
            // 1 sources

            while (true) {
                var2_2 = (var0_1 | var3) ^ -755598762;
                ** GOTO lbl79
                break;
            }
lbl39:
            // 1 sources

            while (true) {
                var1_3 ^= var2_2 ^ 2034506682;
                ** continue;
                break;
            }
lbl42:
            // 1 sources

            while (true) {
                var2_2 = (var0_1 | var3) ^ 1872965418;
                ** GOTO lbl79
                break;
            }
            GL11.glDepthMask((boolean)false);
            var2_2 = (var0_1 | var3) ^ 416654767;
            ** GOTO lbl79
lbl48:
            // 1 sources

            while (true) {
                var1_3 ^= var2_2 ^ 1992579071;
                ** GOTO lbl113
                break;
            }
lbl51:
            // 1 sources

            while (true) {
                var2_2 = (var0_1 | var3) ^ -1457910752;
                ** GOTO lbl79
                break;
            }
            GlStateManager._enableDepthTest();
            var2_2 = (var0_1 | var3) ^ -1889542710;
            ** GOTO lbl79
lbl57:
            // 1 sources

            while (true) {
                var1_3 ^= var2_2 ^ -756406539;
                ** continue;
                break;
            }
lbl60:
            // 1 sources

            while (true) {
                GlStateManager._depthMask((boolean)true);
                ** continue;
                break;
            }
lbl63:
            // 1 sources

            while (true) {
                block0 : switch (var1_3) {
                    case 300986946: {
                        ** continue;
                    }
                    case -218674963: {
                        var2_2 = (var0_1 | var3) ^ -2074446801;
                        break;
                    }
lbl70:
                    // 2 sources

                    while (true) {
                        var2_2 = (var0_1 | var3) ^ 2103913491;
                        break block0;
                        break;
                    }
                    default: {
                        var2_2 = (var0_1 | var3) ^ -1688609246;
                        break;
                    }
                }
                if (true) ** GOTO lbl79
                break;
            }
            block41: while (true) {
                var2_2 = (var0_1 | var3) ^ -991015761;
lbl79:
                // 13 sources

                block42: while (true) {
                    switch (var2_2) lbl-1000:
                    // 2 sources

                    {
                        default: {
                            continue block42;
                        }
                        case 1256550769: {
                            ** continue;
                        }
                        case -1396717881: {
                            ** continue;
                        }
                        case 1822466203: {
                            ** continue;
                        }
                        case 1961538370: {
                            ** continue;
                        }
                        case -81078018: {
                            ** continue;
                        }
                        case 1738869118: {
                            ** continue;
                        }
                        case 410073729: {
                            ** continue;
                        }
                        case 822675207: {
                            ** continue;
                        }
                        case -1940106629: {
                            ** continue;
                        }
                        case 2024186739: {
                            ** continue;
                        }
                        case 1748253495: {
                            ** continue;
                        }
                        case 655438334: {
                            ** continue;
                        }
                        case -1634184894: {
                            ** continue;
                        }
                        case -733278043: {
                            continue block41;
                        }
                        case -1369675098: {
                            var1_3 ^= var2_2 ^ 356496360;
lbl113:
                            // 2 sources

                            var2_2 = (var0_1 | var3) ^ 934571508;
                            ** GOTO lbl-1000
                        }
                        case 1235801713: {
                            ** continue;
                        }
                    }
                    break;
                }
                break;
            }
        }
        var1_3 = (var0_1 | var3) ^ 1677479335;
        var2_2 = (var0_1 | var3) ^ -1437095136;
        ** while (true)
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static void endThroughWallOverlay() {
        int n2 = 1809694365;
        int n3 = a & 0x6BDDBE9D ^ 0xC1C33441;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xB8B579FF;
        n4 = (n3 | n2) ^ 0x1DFDD099;
        block13: while (true) {
            switch (n4) {
                default: {
                    continue block13;
                }
                case -2120814340: {
                    GlStateManager._enableDepthTest();
                    n4 = (n3 | n2) ^ 0xA267DBC3;
                    continue block13;
                }
                case -2062677751: {
                    n5 ^= n4 ^ 0x353599BF;
                    n4 = (n3 | n2) ^ 0xF9A38160;
                    continue block13;
                }
                case 691684772: {
                    GlStateManager._depthMask((boolean)true);
                    n4 = (n3 | n2) ^ 0xF2653EEA;
                    continue block13;
                }
                case 662707973: {
                    n5 ^= n4 ^ 0xB7E01C0E;
                    n4 = (n3 | n2) ^ 0xC2E5FB79;
                    continue block13;
                }
                case 1236821278: {
                    n5 ^= n4 ^ 0xC2DBDEB8;
                    n4 = (n3 | n2) ^ 0xA5F79C96;
                    continue block13;
                }
                case -165515708: {
                    n4 = (n3 | n2) ^ 0x6ED1B7D4;
                    continue block13;
                }
                case 431652919: {
                    n5 ^= n4 ^ 0xAA65EFE5;
                    n4 = (n3 | n2) ^ 0xA22C9C07;
                    continue block13;
                }
                case 310132669: {
                    GlStateManager._disableDepthTest();
                    n4 = (n3 | n2) ^ 0x6E394F3E;
                    continue block13;
                }
                case 1311253067: {
                    GlStateManager._depthMask((boolean)false);
                    n4 = (n3 | n2) ^ 0xCC5FA1D8;
                    continue block13;
                }
                case -2048462365: {
                    n5 ^= n4 ^ 0xAF2FFC35;
                    n4 = (n3 | n2) ^ 0x6A494E21;
                    continue block13;
                }
                case 1240670938: 
            }
            break;
        }
    }
}

