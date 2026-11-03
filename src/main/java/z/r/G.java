/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.dm;
import z.r.gj;
import z.r.kM;
import z.r.mw;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class G {
    private static final int[] a;
    public static final int a;
    private static final /* synthetic */ String a;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block16: {
            var2 = 1007780616;
            G.a = mK.a(MethodHandles.lookup().lookupClass(), 316317570);
            var1_1 = 0;
            var0_2 = -1560846461;
            var1_1 = var2 ^ 1451292986;
            break block16;
lbl7:
            // 1 sources

            while (true) {
                var1_1 = var2 ^ 1238020882;
                break block16;
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                G.a = new int[1];
                var0_2 ^= 55123435;
                v0 = ":\u0085\u00ff:".getBytes("ISO-8859-1");
                if (true) ** GOTO lbl55
                break;
            }
        }
        block11: while (true) {
            switch (var1_1) {
                case 1523488187: {
                    var0_2 ^= var1_1 ^ 581536506;
                    ** continue;
                }
                case 1787918898: {
                    var1_1 = var2 ^ 1725896371;
                }
                default: {
                    continue block11;
                }
                case 1977298970: 
            }
            break;
        }
        v1 = 0;
        v2 = 0;
        var0_2 ^= -1742276825;
        ** while (true)
        block12: while (true) {
            var0_2 ^= -1051924937;
            v3 = ((var0_2 ^= -233429546) | var2) ^ -93099547 ^ G.a;
            var0_2 ^= 1521617095;
            G.a[v1] = (v4 | (v5 | (v6 | v0[v2 + 3] & 255))) ^ v3;
            v1 = v1 + 1;
            v0 = v0;
            v2 = v2 + 4;
            var0_2 ^= -1888151968;
            if (v2 + 4 >= v0.length) {
                G.a = gj.decode("dqvqEH5moQ==", G.Q(((var0_2 ^= -1591703114) | var2) ^ -437462312, var2 ^ ((var0_2 | var2) ^ -1271592735)));
                return;
            }
lbl55:
            // 3 sources

            var0_2 ^= 234125132;
            var0_2 ^= 972355981;
            v4 = (v0[v2] & 255) << 24;
            var0_2 ^= 410880792;
            v5 = (v0[v2 + 1] & 255) << 16;
            var0_2 ^= -2080420539;
            v6 = (v0[v2 + 2] & 255) << 8;
            block13: while (true) {
                switch (var0_2) {
                    case 25001873: {
                        var0_2 ^= -1642115290;
                        continue block13;
                    }
                    default: {
                        var0_2 ^= 1226806746;
                        continue block12;
                    }
                    case 840069937: 
                }
                break;
            }
            var0_2 ^= -1318046128;
        }
    }

    private static int Q(int n2, int n3) {
        int n4 = 2057057432;
        int n5 = -1583572811;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xE2AFC5DD)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xFB9C1EA2;
        n6 += (n5 | n4) ^ 0xFB9CB500;
        n6 += (n5 | n4) ^ 0xFB9CE168;
        n6 ^= (n5 | n4) ^ 0xFB9CB582;
        n6 ^= (n5 | n4) ^ 0xFB9CB580;
        n6 += (n5 | n4) ^ 0xFB9CBDA8;
        return n6 -= (n5 | n4) ^ 0xFB9CA7E2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private G() {
        int n2 = a & 0x9E7674EA ^ 0xA27DDDA5;
        int n3 = (n2 | 0x9E7674EA) ^ 0xC0D30AC0;
        n3 ^= 0x7C917DC1;
        n3 ^= 0xE192DEFE;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean enabled() {
        block35: {
            block36: {
                block37: {
                    block33: {
                        block34: {
                            block32: {
                                var3 = 374082836;
                                var0_1 = G.a & 374082836 ^ -283327724;
                                var2_2 = 0;
                                ** GOTO lbl82
lbl5:
                                // 1 sources

                                while (true) {
                                    var1_3 ^= var2_2 ^ -612295009;
                                    break block32;
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (true) {
                                    var2_2 = (var0_1 | var3) ^ 1500359880;
                                    break block33;
                                    break;
                                }
lbl11:
                                // 1 sources

                                while (true) {
                                    if (dm.isShowSilentRotation()) break block34;
                                    break block35;
                                    break;
                                }
lbl14:
                                // 1 sources

                                while (G.S()) {
                                    break block36;
                                }
                                break block37;
lbl17:
                                // 1 sources

                                while (true) {
                                    var2_2 = (var0_1 | var3) ^ 1201156181;
                                    break block33;
lbl20:
                                    // 1 sources

                                    while (true) {
                                        var1_3 ^= var2_2 ^ -1156970265;
                                        ** GOTO lbl65
                                        break;
                                    }
                                    break;
                                }
                            }
                            var2_2 = (var0_1 | var3) ^ 921203240;
                            break block33;
                        }
                        var2_2 = (var0_1 | var3) ^ 1320958586;
                        break block33;
lbl29:
                        // 1 sources

                        return false;
lbl31:
                        // 1 sources

                        while (true) {
                            v0 = true;
                            ** GOTO lbl70
                            break;
                        }
lbl34:
                        // 1 sources

                        return v0;
lbl36:
                        // 1 sources

                        while (true) {
                            var1_3 ^= var2_2 ^ 855626824;
                            ** continue;
                            break;
                        }
                    }
lbl40:
                    // 6 sources

                    block25: while (true) {
                        switch (var2_2) lbl-1000:
                        // 5 sources

                        {
                            while (true) {
                                default: {
                                    continue block25;
                                }
                                break;
                            }
                            case -893830069: {
                                ** continue;
                            }
                            case -669058111: {
                                ** continue;
                            }
                            case -1695584261: {
                                ** GOTO lbl14
                            }
                            case 1523440917: {
                                ** continue;
                            }
                            case -910901956: {
                                ** continue;
                            }
                            case -2004483278: {
                                ** continue;
                            }
                            case -1310657170: {
                                ** continue;
                            }
lbl59:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ 1706270959;
                                ** GOTO lbl-1000
                                break;
                            }
lbl62:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ -1985647968;
                                ** GOTO lbl-1000
                                break;
                            }
lbl65:
                            // 1 sources

                            var2_2 = (var0_1 | var3) ^ 670757413;
                            ** GOTO lbl-1000
                            case 1996072372: {
                                var1_3 ^= var2_2 ^ -558609997;
                                break block25;
                            }
lbl70:
                            // 2 sources

                            while (true) {
                                var1_3 ^= 2045805009;
                                ** continue;
                                break;
                            }
lbl73:
                            // 1 sources

                            while (true) {
                                var2_2 = (var0_1 | var3) ^ 2010827814;
                                ** continue;
                                break;
                            }
                            case -1506712612: {
                                if (G.R()) {
                                    ** continue;
                                }
                                break block36;
                            }
                            case 1658169475: {
                                ** continue;
                            }
lbl82:
                            // 1 sources

                            var1_3 = (var0_1 | var3) ^ 387739370;
                            break;
                        }
                        break;
                    }
                    var2_2 = (var0_1 | var3) ^ 658650325;
                    ** GOTO lbl40
                }
                var2_2 = (var0_1 | var3) ^ -1517219327;
                ** GOTO lbl40
                {
                    case -1195049151: {
                        ** continue;
                    }
                    case 1721125247: {
                        var1_3 ^= var2_2 ^ -2024694643;
                        ** continue;
                    }
                }
                var2_2 = (var0_1 | var3) ^ -1651939433;
                ** GOTO lbl40
            }
            var2_2 = (var0_1 | var3) ^ -1714780565;
            ** GOTO lbl40
            {
                ** case -660193999:
            }
lbl100:
            // 1 sources

            v0 = false;
            ** while (true)
        }
        var2_2 = (var0_1 | var3) ^ 904262495;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static boolean R() {
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
    private static boolean S() {
        block16: {
            block15: {
                block17: {
                    break block17;
lbl1:
                    // 2 sources

                    while (true) {
                        var4_2 = (var2_1 | var5) ^ -973350916;
                        break block15;
                        break;
                    }
                }
                var5 = -1334619787;
                var2_1 = G.a & -1334619787 ^ 1538748123;
                var4_2 = 0;
                var3_4 = (var2_1 | var5) ^ 383095697;
                var4_2 = (var2_1 | var5) ^ 37676425;
                block12: while (true) {
                    switch (var4_2) {
                        default: {
                            continue block12;
                        }
                        case 1359874692: {
                            var1_3 = mw.getInstance().getModuleByName(G.a);
                            if (!(var1_3 instanceof kM)) ** GOTO lbl1
                            var4_2 = (var2_1 | var5) ^ -2083226590;
                            break block15;
                        }
                        case -104228234: {
                            var4_2 = (var2_1 | var5) ^ 815279599;
                            continue block12;
                        }
                        case -881896944: {
                            var3_4 ^= var4_2 ^ -1298606832;
                            var4_2 = (var2_1 | var5) ^ -1426492037;
                            continue block12;
                        }
                    }
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var3_4 ^= -879850415;
                    v0 = true;
                    break block16;
                    break;
                }
            }
            block14: while (true) {
                switch (var4_2) {
                    default: {
                        continue block14;
                    }
                    case 776307869: {
                        v0 = false;
                        break block14;
                    }
                    case 1041016835: {
                        var3_4 ^= var4_2 ^ -176020398;
                        var4_2 = (var2_1 | var5) ^ -709690526;
                        continue block14;
                    }
                    case 2057960530: {
                        var0_5 = (kM)var1_3;
                        var3_4 ^= 1487530954;
                        if (var0_5.isFreecamActive()) ** break;
                        ** continue;
                        ** continue;
                    }
                    case 2015560669: {
                        var3_4 ^= var4_2 ^ 545974295;
                        var4_2 = (var2_1 | var5) ^ -2124512339;
                        continue block14;
                    }
                }
                break;
            }
        }
        var3_4 ^= -267136095;
        return v0;
    }
}

