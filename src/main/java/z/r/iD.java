/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1657
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import z.r.gg;
import z.r.kR;
import z.r.mw;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class iD {
    private static final /* synthetic */ String a;
    private static final int[] a;
    public static final int a;
    private static final /* synthetic */ String b;

    /*
     * Enabled aggressive block sorting
     */
    private iD() {
        int n2 = a & 0x2AC7767B ^ 0x83F67528;
        int n3 = (n2 | 0x2AC7767B) ^ 0xE30CBF2D;
        n3 ^= 0x91109588;
        n3 ^= 0xCB2FA8E9;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static class_1657 silentAuraTarget() {
        block32: {
            var7 = -120276195;
            var4_1 = iD.a & -120276195 ^ -1620429638;
            var6_2 = 0;
            var5_3 = (var4_1 | var7) ^ -291149877;
            var6_2 = (var4_1 | var7) ^ -1442715993;
            break block32;
lbl7:
            // 1 sources

            while (true) {
                var6_2 = (var4_1 | var7) ^ 213981080;
                ** GOTO lbl73
lbl10:
                // 2 sources

                while (true) {
                    var5_3 ^= -958767195;
                    return v0;
                }
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl15:
            // 1 sources

            while (true) {
                var6_2 = (var4_1 | var7) ^ 564844441;
                ** GOTO lbl73
                while (true) {
                    var6_2 = (var4_1 | var7) ^ -412579024;
                    ** GOTO lbl73
                    break;
                }
                break;
            }
        }
        block26: while (true) {
            switch (var6_2) {
                default: {
                    continue block26;
                }
                case 1442797848: {
                    var6_2 = (var4_1 | var7) ^ 1880098224;
                    continue block26;
                }
                case -1880180209: {
                    var5_3 ^= var6_2 ^ 607473001;
                    var6_2 = (var4_1 | var7) ^ 1934277658;
                    continue block26;
                }
                case -1934359643: 
            }
            break;
        }
        var0_4 = mw.getInstance().getModuleByName(iD.b);
        ** while (true)
        var6_2 = (var4_1 | var7) ^ 794572903;
        block27: while (true) {
            switch (var6_2) {
                case 198450132: {
                    var6_2 = (var4_1 | var7) ^ -1206686766;
                    continue block27;
                }
                case -794654760: {
                    var5_3 ^= var6_2 ^ 1861208393;
                    ** GOTO lbl55
                }
                case -888033964: {
                    if (var0_4 instanceof kR) {
                        var6_2 = (var4_1 | var7) ^ -198531989;
                        continue block27;
                    }
                    ** GOTO lbl53
                }
                case 1206768749: {
                    var1_5 = (kR)var0_4;
                    if (var1_5.isEnabled()) ** GOTO lbl62
lbl53:
                    // 2 sources

                    var6_2 = (var4_1 | var7) ^ 685641506;
                    ** GOTO lbl60
                }
lbl55:
                // 1 sources

                var6_2 = (var4_1 | var7) ^ 888083179;
                ** GOTO lbl60
                case -685723491: {
                    var5_3 ^= var6_2 ^ 1291206532;
                    var6_2 = (var4_1 | var7) ^ -629870035;
                }
lbl60:
                // 4 sources

                default: {
                    continue block27;
                }
lbl62:
                // 1 sources

                var5_3 ^= 530854789;
                var2_6 = var1_5.getTarget();
                var6_2 = (var4_1 | var7) ^ 138439481;
                ** GOTO lbl73
                case 629820818: 
            }
            break;
        }
        return null;
lbl68:
        // 1 sources

        while (true) {
            var6_2 = (var4_1 | var7) ^ 302673680;
            if (true) ** GOTO lbl73
            break;
        }
        block29: while (true) {
            var6_2 = (var4_1 | var7) ^ 1788802249;
lbl73:
            // 6 sources

            block30: while (true) {
                switch (var6_2) {
                    default: {
                        continue block30;
                    }
                    case 412497039: {
                        var5_3 ^= var6_2 ^ 355612579;
                        ** continue;
                    }
                    case -564893658: {
                        var5_3 ^= var6_2 ^ -739218678;
                        continue block29;
                    }
                    case -302722897: {
                        v0 = null;
                        ** GOTO lbl10
                    }
                    case -1788851338: {
                        v0 = var3_7 = (class_1657)var2_6;
                        ** continue;
                    }
                    case -213931993: {
                        if (!(var2_6 instanceof class_1657)) ** continue;
                        ** continue;
                    }
                    case -138488698: 
                }
                break;
            }
            break;
        }
        var5_3 ^= var6_2 ^ 1766659275;
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

    private static int Qu(int n2, int n3) {
        int n4 = -1949991705;
        int n5 = -1764831198;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xA7AF97BC)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0x9FCF12B5;
        n6 -= (n5 | n4) ^ 0x9FCF6370;
        n6 -= (n5 | n4) ^ 0x9FCFCE86;
        n6 += (n5 | n4) ^ 0x9FCF5BC7;
        n6 += (n5 | n4) ^ 0x9FCFE7AD;
        n6 ^= (n5 | n4) ^ 0x9FCFA261;
        return n6 += (n5 | n4) ^ 0x9FCF94E2;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean autoMaceActive() {
        block26: {
            block25: {
                var5 = -223869250;
                var2_1 = iD.a & -223869250 ^ 71227584;
                var4_2 = 0;
                ** GOTO lbl43
lbl5:
                // 1 sources

                while (true) {
                    var4_2 = (var2_1 | var5) ^ -2133484414;
                    ** GOTO lbl48
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var4_2 = (var2_1 | var5) ^ -424128857;
                    break block25;
lbl11:
                    // 1 sources

                    while (true) {
                        var1_5 = (gg)var0_4;
                        if (!var1_5.isEnabled()) ** GOTO lbl38
                        ** GOTO lbl41
                        break;
                    }
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    var3_3 ^= var4_2 ^ 1826664689;
                    break block26;
                    break;
                }
lbl18:
                // 2 sources

                while (true) {
                    var3_3 ^= -154509141;
                    ** GOTO lbl32
                    break;
                }
            }
lbl22:
            // 2 sources

            block18: while (true) {
                switch (var4_2) lbl-1000:
                // 5 sources

                {
                    while (true) {
                        default: {
                            continue block18;
                        }
                        break;
                    }
                    case -597286259: {
                        ** continue;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        v0 = true;
                        ** GOTO lbl18
                        break;
                    }
lbl32:
                    // 1 sources

                    return v0;
lbl33:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                    case 1936556632: {
                        var3_3 ^= var4_2 ^ 652793096;
                        ** GOTO lbl46
                    }
lbl38:
                    // 2 sources

                    while (true) {
                        var4_2 = (var2_1 | var5) ^ -2049745754;
                        ** GOTO lbl-1000
                        break;
                    }
lbl41:
                    // 1 sources

                    var3_3 ^= 1434802000;
                    ** continue;
lbl43:
                    // 1 sources

                    var3_3 = (var2_1 | var5) ^ 1924642525;
                    var4_2 = (var2_1 | var5) ^ -1564930576;
                    ** GOTO lbl48
lbl46:
                    // 1 sources

                    var4_2 = (var2_1 | var5) ^ 847022466;
                    ** GOTO lbl-1000
lbl48:
                    // 3 sources

                    block23: while (true) {
                        switch (var4_2) {
                            default: {
                                continue block23;
                            }
                            case 1986740860: {
                                ** continue;
                            }
                            case -1197852214: {
                                ** continue;
                            }
                            ** case 1409798926:
lbl57:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
                    case 268865625: {
                        break block18;
                    }
                    case 560323296: {
                        if (!(var0_4 instanceof gg)) ** continue;
                        ** continue;
                    }
                    var0_4 = mw.getInstance().getModuleByName(iD.a);
                    var4_2 = (var2_1 | var5) ^ 965981826;
                    ** GOTO lbl-1000
lbl66:
                    // 1 sources

                    while (true) {
                        var4_2 = (var2_1 | var5) ^ -673512418;
                        ** continue;
                        break;
                    }
                }
                break;
            }
            var4_2 = (var2_1 | var5) ^ 718863475;
            ** while (true)
            {
                case -993896580: {
                    v0 = false;
                    ** continue;
                }
                ** case -819107716:
            }
lbl75:
            // 1 sources

            var3_3 ^= var4_2 ^ -1037102979;
            ** while (true)
        }
        var4_2 = (var2_1 | var5) ^ 1311041332;
        ** while (true)
    }
}

