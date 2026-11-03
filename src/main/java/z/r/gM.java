/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import z.r.dA;
import z.r.gF;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class gM
extends gF {
    private static final int[] a;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String s;
    public static final int a;
    private static boolean a;

    /*
     * Enabled aggressive block sorting
     */
    public gM() {
        int n2 = a & 0x4CB59D7E ^ 0x266543C3;
        int n3 = (n2 | 0x4CB59D7E) ^ 0x6AA2B2DC;
        n3 ^= 0xDFB49936;
        super(k, s, dA.M);
        n3 ^= 0x2A21B07C;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean isActive() {
        int n2 = a & 0x6AF1E207 ^ 0x79C673A0;
        int n3 = 0;
        int n4 = (n2 | 0x6AF1E207) ^ 0x2C6969D6;
        n3 = (n2 | 0x6AF1E207) ^ 0xCB866B9D;
        block5: while (true) {
            switch (n3) {
                case -1334732742: {
                    n3 = (n2 | 0x6AF1E207) ^ 0xC55B56E0;
                }
                default: {
                    continue block5;
                }
                case -700112847: {
                    return a;
                }
                case -1095981753: 
            }
            n4 ^= n3 ^ 0xC7BF9E54;
            n3 = (n2 | 0x6AF1E207) ^ 0xADB2D396;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onEnable() {
        block11: {
            block12: {
                block13: {
                    block10: {
                        var4_1 = 1891438935;
                        var1_2 = gM.a & 1891438935 ^ 31288901;
                        var3_3 = 0;
                        break block13;
lbl5:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -657987576;
                            break block10;
                            break;
                        }
                        {
                            var3_3 = (var1_2 | var4_1) ^ 693405463;
lbl9:
                            // 5 sources

                            block9: while (true) {
                                switch (var3_3) {
                                    default: {
                                        continue block9;
                                    }
                                    case 510816062: {
                                        ** continue;
                                    }
                                    case 1109651714: {
                                        break block11;
                                    }
                                    case 1827810469: {
                                        return;
                                    }
                                    case 1487534144: {
                                        gM.a = true;
                                        break block12;
                                    }
                                    case 2042549392: {
                                        var2_4 ^= var3_3 ^ 1306488398;
                                        break;
                                    }
                                }
                                continue block8;
                                break;
                            }
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 487543794;
                    ** GOTO lbl9
                }
                var2_4 = (var1_2 | var4_1) ^ -484217542;
                var3_3 = (var1_2 | var4_1) ^ 870223445;
                ** GOTO lbl9
            }
            var3_3 = (var1_2 | var4_1) ^ 1871646825;
            ** GOTO lbl9
        }
        var3_3 = (var1_2 | var4_1) ^ 138652615;
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
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block11: {
            block12: {
                var4_1 = -1827667422;
                var1_2 = gM.a & -1827667422 ^ -1398153607;
                var3_3 = 0;
                ** GOTO lbl22
lbl5:
                // 3 sources

                block7: while (true) {
                    switch (var3_3) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block7;
                            }
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -863584203;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -285158496: {
                            var2_4 ^= var3_3 ^ -1878813483;
                            break block7;
                        }
                        case 1933516366: {
                            var2_4 ^= var3_3 ^ 1395326959;
                            break block11;
                        }
lbl19:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1728628445;
                            ** continue;
                            break;
                        }
lbl22:
                        // 1 sources

                        var2_4 = (var1_2 | var4_1) ^ 603991001;
                        ** continue;
                        case -659482458: {
                            break block12;
                        }
                        case -869900019: {
                            gM.a = false;
                            ** continue;
                        }
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ 1939849078;
                ** GOTO lbl5
            }
            var3_3 = (var1_2 | var4_1) ^ 1354304987;
            ** GOTO lbl5
            {
                ** case -694798625:
            }
lbl35:
            // 1 sources

            return;
        }
        var3_3 = (var1_2 | var4_1) ^ 1764747428;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onTick(class_310 var1_1) {
        block28: {
            block24: {
                block26: {
                    block27: {
                        block25: {
                            block23: {
                                block22: {
                                    break block28;
lbl1:
                                    // 1 sources

                                    return;
lbl3:
                                    // 1 sources

                                    while (true) {
                                        if (var1_1.field_1687 != null) break block22;
                                        break block23;
                                        break;
                                    }
lbl6:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ 445930852;
                                        break block24;
                                        break;
                                    }
                                }
                                var4_4 = (var2_3 | var5_2) ^ -1686479501;
                                break block24;
lbl12:
                                // 1 sources

                                while (true) {
                                    if (var1_1.field_1724 == null) break block23;
                                    break block25;
                                    break;
                                }
lbl15:
                                // 1 sources

                                while (true) {
                                    var3_5 ^= var4_4 ^ -1770580762;
                                    break block26;
                                    break;
                                }
                            }
                            var4_4 = (var2_3 | var5_2) ^ -42316370;
                            break block24;
lbl21:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -1315207640;
                                break block24;
                                break;
                            }
lbl24:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -1586544466;
                                break block24;
lbl27:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ -2048344394;
                                    break block24;
                                    break;
                                }
                                break;
                            }
                        }
                        var4_4 = (var2_3 | var5_2) ^ 1169554402;
                        break block24;
lbl33:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ 1719522639;
                            break block27;
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ 727050389;
                            ** continue;
                            break;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ -1498153463;
                    break block24;
                }
                var4_4 = (var2_3 | var5_2) ^ -1453118694;
            }
            block21: while (true) {
                switch (var4_4) {
                    default: {
                        continue block21;
                    }
                    case 1457377000: {
                        ** continue;
                    }
                    case 1590797660: {
                        ** continue;
                    }
                    case -450185066: {
                        ** continue;
                    }
                    case 1494031355: {
                        ** continue;
                    }
                    case 46442588: {
                        ** continue;
                    }
                    case 1311073242: {
                        ** continue;
                    }
                    case 1690613889: {
                        ** continue;
                    }
                    case -1173676528: {
                        ** continue;
                    }
                    case 2052479812: {
                        return;
                    }
                }
                break;
            }
        }
        var5_2 = -1733369632;
        var2_3 = gM.a & -1733369632 ^ -15186574;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 1534900225;
        ** while (true)
    }

    private static int bN(int n2, int n3) {
        int n4 = -857223615;
        int n5 = 107888323;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xE8CB51D4)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xCEEF8772;
        n6 -= (n5 | n4) ^ 0xCEEFEBE9;
        n6 ^= (n5 | n4) ^ 0xCEEF0A6A;
        n6 ^= (n5 | n4) ^ 0xCEEFDC53;
        n6 -= (n5 | n4) ^ 0xCEEFD473;
        n6 += (n5 | n4) ^ 0xCEEFB657;
        return n6 ^= (n5 | n4) ^ 0xCEEFD658;
    }
}

