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
import z.r.eC;
import z.r.gj;
import z.r.kd;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class ke
extends eC<Boolean> {
    public static final int b;
    private static final /* synthetic */ String a;
    private static final int[] a;
    private static final /* synthetic */ String b;

    /*
     * Enabled aggressive block sorting
     */
    public ke(String string, boolean bl2) {
        int n2 = b & 0xCEC7E677 ^ 0xF72D10BB;
        int n3 = (n2 | 0xCEC7E677) ^ 0x1B05DE85;
        n3 ^= 0xDCD791E7;
        super(string, bl2);
        n3 ^= 0xA8121470;
    }

    /*
     * Unable to fully structure code
     */
    public ke description(String var1_1) {
        block14: {
            var5_2 = 1238660615;
            var2_3 = ke.b & 1238660615 ^ 1044631526;
            var4_4 = 0;
            ** GOTO lbl28
lbl5:
            // 1 sources

            while (true) {
                var3_5 ^= var4_4 ^ 210942312;
                break block14;
                break;
            }
            {
                var4_4 = (var2_3 | var5_2) ^ 472370169;
lbl9:
                // 2 sources

                block9: while (true) {
                    switch (var4_4) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            default: {
                                continue block9;
                            }
                            break;
                        }
                        case -1529034526: {
                            ** continue;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -620022011;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 2091309254: {
                            var3_5 ^= var4_4 ^ 1538384954;
                            continue block8;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 57747233;
                            ** GOTO lbl-1000
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 1432980643;
                            ** continue;
                            break;
                        }
lbl28:
                        // 1 sources

                        var3_5 = (var2_3 | var5_2) ^ -1854120455;
                        ** continue;
                        case 717124420: {
                            ** continue;
                        }
                        case -1418936161: {
                            super.description(var1_1);
                            ** continue;
                        }
                        case 1676686366: 
                    }
                    break;
                }
            }
            return this;
        }
        var4_4 = (var2_3 | var5_2) ^ -725926024;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void toggle() {
        var4_1 = -918431768;
        var1_2 = ke.b & -918431768 ^ 1261239541;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -1479937229;
        var3_3 = (var1_2 | var4_1) ^ 1277456713;
        if (true) ** GOTO lbl14
        block9: while (true) {
            var2_4 ^= -535834895;
            v0 = false;
            block10: while (true) {
                var2_4 ^= -1337874967;
                this.a = v0;
                var3_3 = (var1_2 | var4_1) ^ -653135060;
lbl14:
                // 2 sources

                block11: while (true) {
                    switch (var3_3) {
                        default: {
                            continue block11;
                        }
                        case 875547696: {
                            if (((Boolean)this.a).booleanValue()) continue block9;
                            var2_4 ^= -535834895;
                            v0 = true;
                            continue block10;
                        }
                        case -2078209844: {
                            dm.requestSave();
                            var3_3 = (var1_2 | var4_1) ^ 1562265096;
                            continue block11;
                        }
                        case -2025222476: {
                            var3_3 = (var1_2 | var4_1) ^ -575948816;
                            continue block11;
                        }
                        case 310119633: {
                            var2_4 ^= var3_3 ^ 1681501577;
                            var3_3 = (var1_2 | var4_1) ^ 1330444081;
                            continue block11;
                        }
                        case 382093325: {
                            var2_4 ^= var3_3 ^ -2029984622;
                            var3_3 = (var1_2 | var4_1) ^ -12438579;
                            continue block11;
                        }
                        case -1770800651: {
                            var2_4 ^= var3_3 ^ 248786040;
                            var3_3 = (var1_2 | var4_1) ^ -1126537891;
                            continue block11;
                        }
                        case 2008521376: 
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void setValue(Boolean var1_1) {
        block18: {
            block17: {
                break block18;
lbl1:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ -68892242;
                    break block17;
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 1452503721;
                    ** GOTO lbl12
                    break;
                }
lbl7:
                // 1 sources

                block11: while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1157480456;
                    if (true) ** GOTO lbl12
                    block12: while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -869209938;
lbl12:
                        // 5 sources

                        block13: while (true) {
                            switch (var4_4) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    default: {
                                        continue block13;
                                    }
                                    break;
                                }
                                case 870274885: {
                                    ** continue;
                                }
                                case -1579491178: {
                                    continue block12;
                                }
lbl21:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 16897562;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case 596764722: {
                                    super.setValue(var1_1);
                                    break block11;
                                }
lbl27:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 1580556157;
                                    ** continue;
                                    break;
                                }
                                case -1451438782: {
                                    var3_5 ^= var4_4 ^ 1071954054;
                                    ** continue;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                var4_4 = (var2_3 | var5_2) ^ -1608205155;
                ** GOTO lbl12
            }
            var4_4 = (var2_3 | var5_2) ^ -595699751;
            ** while (true)
        }
        var5_2 = -1815797973;
        var2_3 = ke.b & -1815797973 ^ -311713341;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -400465631;
        ** while (true)
        {
            case -17929743: {
                return;
            }
            case 1156415507: {
                dm.requestSave();
                ** continue;
            }
            ** case 1607140214:
        }
lbl50:
        // 1 sources

        var3_5 ^= var4_4 ^ 1075075223;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @Override
    public String getDisplayValue() {
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

    private static int EP(int n2, int n3) {
        int n4 = -1342023397;
        int n5 = -602828708;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xCF5D988F)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xFC135440;
        n6 += (n5 | n4) ^ 0xFC13D688;
        n6 += (n5 | n4) ^ 0xFC13B744;
        n6 += (n5 | n4) ^ 0xFC13C3E6;
        n6 ^= (n5 | n4) ^ 0xFC130980;
        n6 ^= (n5 | n4) ^ 0xFC1339B7;
        n6 ^= (n5 | n4) ^ 0xFC130A08;
        return n6 -= (n5 | n4) ^ 0xFC13E361;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public kd getType() {
        int n2 = b & 0x953A7362 ^ 0x714BD6DA;
        int n3 = 0;
        int n4 = (n2 | 0x953A7362) ^ 0xE2ACE56C;
        n3 = (n2 | 0x953A7362) ^ 0xE40051CD;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0x953A7362) ^ 0xB68DA0F2;
            }
            block6: while (true) {
                switch (n3) {
                    default: {
                        continue block6;
                    }
                    case -322289488: {
                        n4 ^= n3 ^ 0x5479C00E;
                        continue block5;
                    }
                    case 293316151: {
                        n3 = (n2 | 0x953A7362) ^ 0x19B1B74A;
                        continue block6;
                    }
                    case 1140217608: 
                }
                break;
            }
            break;
        }
        return kd.j;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block20: {
            block21: {
                break block21;
lbl1:
                // 2 sources

                while (true) {
                    var0_2 ^= 474619544;
                    var0_2 ^= 768045066;
                    v0 = (v1[v2] & 255) << 24;
                    var0_2 ^= -1928800974;
                    v3 = (v1[v2 + 1] & 255) << 16;
                    var0_2 ^= -1867093343;
                    break block20;
                    break;
                }
lbl11:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0_2 ^= 797677845;
                    ke.a = new int[2];
                    var0_2 ^= 1657991071;
                    v1 = "\u0006\u009b\u0085\u00e9j\u00f5\u00ed\u00d9".getBytes("ISO-8859-1");
                    ** GOTO lbl1
                    break;
                }
lbl19:
                // 2 sources

                while (true) {
                    v4 = var0_2 ^= -400978441;
                    var0_2 ^= 1238422271;
                    ke.a[v5] = (v0 | (v3 | (v6 | v7))) ^ ((v4 | var2) ^ 1501446019 ^ ke.b);
                    v5 = v5 + 1;
                    v8 = v2 + 4;
                    v1 = v1;
                    v2 = v8;
                    var0_2 ^= 618277993;
                    if (v8 >= v1.length) ** break;
                    ** continue;
                    ke.a = gj.decode("P/o=", ke.EP(((var0_2 ^= 1302384681) | var2) ^ 1815199235, var2 ^ ((var0_2 | var2) ^ -1916030027)));
                    ke.b = gj.decode("2B8h", ke.EP((var0_2 | var2) ^ 1815199234, var2 ^ ((var0_2 | var2) ^ -1124393633)));
                    return;
                }
                v7 = v1[v2 + 3] & 255;
                block17: while (true) {
                    switch (var0_2) {
                        case -1680037155: {
                            var0_2 ^= -1433505144;
                            ** GOTO lbl19
                        }
                        case -929032047: {
                            var0_2 ^= 1602477466;
                            continue block17;
                        }
                    }
                    break;
                }
                var0_2 ^= 320657285;
                ** while (true)
            }
            var2 = 1265008147;
            ke.b = mK.a(MethodHandles.lookup().lookupClass(), 445061662);
            var1_1 = 0;
            var0_2 = 1067597876;
            var1_1 = var2 ^ 2055482000;
            block18: while (true) {
                switch (var1_1) {
                    default: {
                        continue block18;
                    }
                    case -878280986: {
                        v5 = 0;
                        v2 = 0;
                        ** continue;
                    }
                    case -1222312162: {
                        var0_2 ^= var1_1 ^ -599752613;
                        break;
                    }
                    case 836916355: {
                        var1_1 = var2 ^ -62750451;
                        continue block18;
                    }
                }
                var1_1 = var2 ^ -2134900491;
            }
        }
        v6 = (v1[v2 + 2] & 255) << 8;
        while (true) {
            switch (var0_2) {
                case 900503802: {
                    var0_2 ^= -1170442779;
                    ** GOTO lbl11
                }
                default: {
                    var0_2 ^= 1279423612;
                    ** continue;
                }
                case 78741252: 
            }
            var0_2 ^= -357973439;
        }
    }
}

