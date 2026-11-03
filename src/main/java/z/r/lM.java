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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class lM {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), -1667177606);
    protected long a;

    /*
     * Exception decompiling
     */
    public lM() {
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
    public void reset() {
        int n2 = 329051491;
        int n3 = a & 0x139CED63 ^ 0xE10A7E00;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x66CD5F87;
        n4 = (n3 | n2) ^ 0xA211119E;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case 1368387325: {
                    n4 = (n3 | n2) ^ 0x51B1AD8E;
                    continue block7;
                }
                case 556111341: {
                    return;
                }
                case 2007140705: {
                    n5 ^= n4 ^ 0xCFA67C47;
                    n4 = (n3 | n2) ^ 0xD2BB6A8E;
                    continue block7;
                }
                case 2038966824: {
                    this.a = System.currentTimeMillis();
                    n4 = (n3 | n2) ^ 0x843C7602;
                    continue block7;
                }
                case -1573956883: 
            }
            n5 ^= n4 ^ 0x19BFA712;
            n4 = (n3 | n2) ^ 0x8A16D54B;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public long getLastMS() {
        int n2 = a & 0x5D709E8 ^ 0xB67C8C05;
        int n3 = 0;
        int n4 = (n2 | 0x5D709E8) ^ 0xE19A5556;
        n3 = (n2 | 0x5D709E8) ^ 0x80DD87C1;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 924977708: {
                    n3 = (n2 | 0x5D709E8) ^ 0x635956DF;
                    continue block5;
                }
                case -727262414: {
                    n4 ^= n3 ^ 0x440CF282;
                    n3 = (n2 | 0x5D709E8) ^ 0xBD8F551D;
                    continue block5;
                }
                case 175167728: 
            }
            break;
        }
        return System.currentTimeMillis() - this.a;
    }

    /*
     * Unable to fully structure code
     */
    public boolean hasTimeElapsed(long var1_1) {
        block16: {
            block18: {
                block17: {
                    var6_2 = -914901100;
                    var3_3 = lM.a & -914901100 ^ -752520804;
                    var5_4 = 0;
                    if (true) ** GOTO lbl12
                    block9: while (true) {
                        var5_4 = (var3_3 | var6_2) ^ -142749804;
lbl7:
                        // 6 sources

                        block10: while (true) {
                            switch (var5_4) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block10;
                                    }
                                    break;
                                }
lbl12:
                                // 1 sources

                                var4_5 = (var3_3 | var6_2) ^ -2099692890;
                                break block16;
                                case -1172721705: {
                                    v0 = true;
                                    break block9;
                                }
                                case -1283772032: {
                                    var4_5 ^= var5_4 ^ 1448475165;
                                    break;
                                }
lbl20:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ -526673764;
                                    ** continue;
                                    break;
                                }
                                case -1247042179: {
                                    var4_5 ^= var5_4 ^ 475767183;
                                    continue block9;
                                }
                            }
                            break;
                        }
                        break;
                    }
lbl26:
                    // 2 sources

                    while (true) {
                        var4_5 ^= 670344356;
                        break block17;
                        break;
                    }
                    {
                        case 1475110014: {
                            break block18;
                        }
                    }
lbl31:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ 1482086251;
                        ** GOTO lbl7
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ 1745667612;
                        ** GOTO lbl7
                        break;
                    }
                    {
                        case 1005350656: {
                            v0 = false;
                            ** continue;
                        }
                    }
                    var5_4 = (var3_3 | var6_2) ^ 1634621515;
                    ** GOTO lbl7
                    {
                        case -2094980873: {
                            var4_5 ^= var5_4 ^ 1712319338;
                            ** continue;
                        }
                    }
                }
                return v0;
            }
            var5_4 = (var3_3 | var6_2) ^ 1859932897;
            ** GOTO lbl7
        }
        var5_4 = (var3_3 | var6_2) ^ -1935961118;
        ** while (true)
        {
            ** case 738867208:
        }
lbl54:
        // 1 sources

        ** while (this.getLastMS() < var1_1)
lbl55:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void offset(long var1_1) {
        var6_2 = 1238808421;
        var3_3 = lM.a & 1238808421 ^ 1534152317;
        var5_4 = 0;
        var4_5 = (var3_3 | var6_2) ^ -1619402400;
        var5_4 = (var3_3 | var6_2) ^ 160095734;
        if (true) ** GOTO lbl9
        block7: while (true) {
            var5_4 = (var3_3 | var6_2) ^ -61121286;
lbl9:
            // 2 sources

            block8: while (true) {
                switch (var5_4) {
                    case 1108965565: {
                        var4_5 ^= var5_4 ^ 2070300014;
                        continue block7;
                    }
                    case -1481858169: {
                        return;
                    }
                    case 222613385: {
                        var4_5 ^= var5_4 ^ -794125777;
                        var5_4 = (var3_3 | var6_2) ^ 1993916275;
                        break;
                    }
                    case 1383932555: {
                        var5_4 = (var3_3 | var6_2) ^ 1454584052;
                        continue block8;
                    }
                    case 758071310: {
                        this.a = System.currentTimeMillis() + var1_1;
                        var5_4 = (var3_3 | var6_2) ^ 435062720;
                    }
                }
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public long getOrigin() {
        block11: {
            block12: {
                break block12;
lbl1:
                // 1 sources

                return this.a;
lbl3:
                // 1 sources

                while (true) {
                    block10: {
                        var3_2 = (var1_1 | 2004524326) ^ -1944216792;
                        break block10;
lbl6:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 2004524326) ^ 82793774;
                            break block10;
                            break;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            var2_3 ^= var3_2 ^ -1436766016;
                            ** continue;
                            break;
                        }
                    }
lbl13:
                    // 2 sources

                    block9: while (true) {
                        switch (var3_2) {
                            default: {
                                continue block9;
                            }
                            case -68721641: {
                                break block11;
                            }
                            case 1930799633: {
                                ** continue;
                            }
                            case 283976386: {
                                break;
                            }
                        }
                        ** continue;
                        break;
                    }
                    break;
                }
            }
            var1_1 = lM.a & 2004524326 ^ 1100117529;
            var3_2 = 0;
            var2_3 = (var1_1 | 2004524326) ^ 1400685482;
            ** while (true)
        }
        var3_2 = (var1_1 | 2004524326) ^ 1729617405;
        ** while (true)
    }
}

