/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 */
package z.r;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import z.r.cU;
import z.r.dA;
import z.r.gF;
import z.r.gP;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class M
extends gF {
    private final ke a;
    public static final int c;
    private static final /* synthetic */ String a;
    private final Map<UUID, cU> a;
    private final ke b;
    private static final float a;
    private static final /* synthetic */ String s;
    private static final int[] a;
    private static final float b;
    private static final /* synthetic */ String b;
    private static final float c;
    private static final float d;
    private static final double a;
    private static final float e;
    private static final /* synthetic */ String c;
    private int a;
    private static final int b;
    private static final /* synthetic */ String k;
    private final gP a;
    private static final /* synthetic */ String d;
    public static final float f;
    private static final /* synthetic */ String e;
    private final ke c;
    public static final float g;
    private static final /* synthetic */ String f;
    private static final float h;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public M() {
        int n2 = -681913981;
        int n3 = c & 0xD75AD183 ^ 0xAF1EC43E;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x49CC0CF5;
        n5 ^= 0x38867244;
        super(k, s, dA.l);
        n4 = (n3 | n2) ^ 0x62139B4;
        block14: while (true) {
            switch (n4) {
                case -1259476331: {
                    n5 ^= n4 ^ 0x845CD4BA;
                    n4 = (n3 | n2) ^ 0xAF5C5152;
                    continue block14;
                }
                case -1920821929: {
                    this.a = new HashMap();
                    n4 = (n3 | n2) ^ 0x989D530A;
                    continue block14;
                }
                case -330226945: {
                    n5 ^= n4 ^ 0x39254547;
                    n4 = (n3 | n2) ^ 0xED1AB285;
                    continue block14;
                }
                case 1740867253: {
                    n5 ^= n4 ^ 0xCA9C4E73;
                    n4 = (n3 | n2) ^ 0xE1057BFA;
                    continue block14;
                }
                case -109057013: {
                    n5 ^= n4 ^ 0x3C060F0F;
                    n4 = (n3 | n2) ^ 0x3A3F161E;
                    continue block14;
                }
                case 306472762: {
                    this.c = this.addSetting(new ke(c, true));
                    n4 = (n3 | n2) ^ 0x32A210C;
                    continue block14;
                }
                case -869680630: {
                    n5 ^= n4 ^ 0x84518267;
                    n4 = (n3 | n2) ^ 0xCF94FDEF;
                    continue block14;
                }
                case 1342342381: {
                    n5 ^= 0xD57DE3BA;
                    this.a = this.addSetting(new gP(a, 1.0f, 0.2f, 3.0f, 0.1f, f).description(b));
                    n4 = (n3 | n2) ^ 0x130FF740;
                    continue block14;
                }
                case -59444045: {
                    n5 ^= n4 ^ 0xA0E6966C;
                    n4 = (n3 | n2) ^ 0x72DC40E8;
                    continue block14;
                }
                case -983448671: {
                    this.b = this.addSetting(new ke(e, true));
                    n4 = (n3 | n2) ^ 0x33776FB5;
                }
                default: {
                    continue block14;
                }
                case 818554960: {
                    this.a = this.addSetting(new ke(d, true));
                    n4 = (n3 | n2) ^ 0x4BB33F2A;
                    continue block14;
                }
                case 509324869: 
            }
            break;
        }
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
     * Exception decompiling
     */
    public static M get() {
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
    public void onEnable() {
        block7: {
            var1_1 = M.c & 1331913595 ^ 1549205096;
            var3_2 = 0;
            if (true) ** GOTO lbl15
            block5: while (true) {
                var3_2 = (var1_1 | 1331913595) ^ 520656956;
lbl6:
                // 3 sources

                block6: while (true) {
                    switch (var3_2) {
                        default: {
                            continue block6;
                        }
                        case 1082091335: {
                            var2_3 ^= var3_2 ^ 1455347537;
                            break block5;
                        }
                        case 568400177: {
                            continue block5;
                        }
lbl15:
                        // 1 sources

                        var2_3 = (var1_1 | 1331913595) ^ 964645153;
                        break block7;
                    }
                    break;
                }
                break;
            }
            var3_2 = (var1_1 | 1331913595) ^ -563009586;
            ** GOTO lbl6
            {
                ** case -2130257739:
            }
lbl20:
            // 1 sources

            return;
        }
        var3_2 = (var1_1 | 1331913595) ^ 2123818570;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        int n2 = -168843893;
        int n3 = c & 0xF5EFA58B ^ 0xA28A2699;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x5ECFB24C;
        n4 = (n3 | n2) ^ 0xD481F3CB;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case 594433104: {
                    n4 = (n3 | n2) ^ 0xF1359835;
                    continue block7;
                }
                case 114966446: {
                    n5 ^= n4 ^ 0x671E01B9;
                    n4 = (n3 | n2) ^ 0xFD40AEEC;
                    continue block7;
                }
                case -964361770: {
                    n5 ^= n4 ^ 0xCB396CA0;
                    n4 = (n3 | n2) ^ 0x75257793;
                    continue block7;
                }
                case 179243383: {
                    this.a.clear();
                    n4 = (n3 | n2) ^ 0x316AA64D;
                    continue block7;
                }
                case -2100637688: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onTick(class_310 var1_1) {
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
     * Enabled aggressive block sorting
     */
    public boolean shouldPose(class_1657 var1_1) {
        block44: {
            var7_2 = 2138945951;
            var4_3 = M.c & 2138945951 ^ 297712018;
            var6_4 = 0;
            var5_5 = (var4_3 | var7_2) ^ -28790726;
            var6_4 = (var4_3 | var7_2) ^ 113834804;
            block36: while (true) {
                block45: {
                    block46: {
                        switch (var6_4) {
                            case 380188365: {
                                ** GOTO lbl30
                            }
                            case -1596176187: {
                                var5_5 ^= var6_4 ^ 1269205948;
                                ** GOTO lbl18
                            }
                            case 2033664683: {
                                var6_4 = (var4_3 | var7_2) ^ 306231988;
                                ** GOTO lbl50
                            }
                            case 1482728491: {
                                var5_5 ^= var6_4 ^ -2063776341;
lbl18:
                                // 2 sources

                                var6_4 = (var4_3 | var7_2) ^ 1767280466;
                                ** GOTO lbl50
                            }
                            case 1841234731: {
                                var5_5 ^= var6_4 ^ -88268166;
                                break block45;
                            }
                            case -171029185: {
                                var2_6 = class_310.method_1551();
                                ** break;
                            }
                            case 1113426412: {
                                return false;
                            }
lbl28:
                            // 1 sources

                            var6_4 = (var4_3 | var7_2) ^ 2014128366;
                            break block44;
lbl30:
                            // 1 sources

                            var6_4 = (var4_3 | var7_2) ^ 1034039411;
                            continue block36;
                            case 2061591558: {
                                var5_5 ^= var6_4 ^ -604551435;
                                var6_4 = (var4_3 | var7_2) ^ -1976437600;
                                continue block36;
                            }
                            case -1463172076: {
                                switch (var5_5) {
                                    case 380971252: {
                                        var6_4 = (var4_3 | var7_2) ^ -551292582;
                                        continue block36;
                                    }
                                    default: {
                                        var6_4 = (var4_3 | var7_2) ^ -392082154;
                                        continue block36;
                                    }
                                    case 2018920948: 
                                }
                                var6_4 = (var4_3 | var7_2) ^ 664739252;
                                continue block36;
                            }
                            case -2058828573: {
                                if (!this.isEnabled()) ** GOTO lbl52
                                var6_4 = (var4_3 | var7_2) ^ 85908889;
                            }
lbl50:
                            // 4 sources

                            default: {
                                continue block36;
                            }
lbl52:
                            // 1 sources

                            var6_4 = (var4_3 | var7_2) ^ -1210352171;
                            continue block36;
                            case -937114550: {
                                break block46;
                            }
                            case -1755384695: 
                        }
                        var5_5 ^= var6_4 ^ -34076659;
                    }
                    var6_4 = (var4_3 | var7_2) ^ -684294773;
                    continue;
                }
                var6_4 = (var4_3 | var7_2) ^ -88638084;
            }
lbl64:
            // 1 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ -1276039181;
                break block44;
                break;
            }
lbl67:
            // 2 sources

            while (true) {
                var5_5 ^= 796994259;
                var3_7 = v0;
                var6_4 = (var4_3 | var7_2) ^ 775379602;
                if (true) ** GOTO lbl95
                block39: while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 96398258;
                    if (true) ** GOTO lbl77
                    block40: while (true) {
                        var6_4 = (var4_3 | var7_2) ^ 1090015046;
lbl77:
                        // 2 sources

                        block41: while (true) {
                            block49: {
                                block48: {
                                    block47: {
                                        switch (var6_4) {
                                            case 1252716231: {
                                                v1 = (Boolean)this.a.getValue();
                                                break block47;
                                            }
                                            case 1057486553: {
                                                var5_5 ^= var6_4 ^ -1289940656;
                                                ** break;
                                            }
                                            case -1448225428: {
                                                v1 = (Boolean)this.b.getValue();
                                                break block47;
                                            }
                                            case 2051101229: {
                                                var5_5 ^= var6_4 ^ -161761884;
                                                break block48;
                                            }
                                            case 644256375: {
                                                if (!var3_7) continue block40;
                                                continue block39;
                                            }
lbl94:
                                            // 1 sources

                                            var6_4 = (var4_3 | var7_2) ^ 894785368;
lbl95:
                                            // 3 sources

                                            default: {
                                                continue block41;
                                            }
                                            case 1372119821: 
                                        }
                                        var5_5 ^= var6_4 ^ -1077340693;
                                        break block49;
                                    }
                                    var5_5 ^= -259985663;
                                    return v1;
                                }
                                var6_4 = (var4_3 | var7_2) ^ -699241229;
                                continue;
                            }
                            var6_4 = (var4_3 | var7_2) ^ 1503210472;
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        }
        block42: while (true) {
            block51: {
                block50: {
                    switch (var6_4) {
                        case 133337457: {
                            var5_5 ^= var6_4 ^ 1741078839;
                            ** GOTO lbl134
                        }
                        case 1129344562: {
                            if (var1_1 == var2_6.field_1724) {
                                ** break;
                            }
                            ** GOTO lbl139
                        }
                        case 1367637441: {
                            var5_5 ^= var6_4 ^ 2064142263;
                            break block50;
                        }
                        case -29353204: {
                            var5_5 ^= var6_4 ^ -724817542;
                            ** continue;
                        }
lbl125:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ 779863134;
                        ** GOTO lbl135
                        case -1555857942: {
                            if (var2_6.field_1724 == null) ** GOTO lbl139
                            var6_4 = (var4_3 | var7_2) ^ -1403025131;
                            ** GOTO lbl135
                        }
                        case -983899720: {
                            v0 = true;
                            ** GOTO lbl67
                        }
lbl134:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -591608715;
lbl135:
                        // 4 sources

                        default: {
                            continue block42;
                        }
                        case -744476534: {
                            break block51;
                        }
lbl139:
                        // 2 sources

                        var6_4 = (var4_3 | var7_2) ^ -2118147437;
                        continue block42;
                        case -871459220: 
                    }
                    v0 = false;
                    ** continue;
                }
                var6_4 = (var4_3 | var7_2) ^ -1163569113;
                continue;
            }
            var6_4 = (var4_3 | var7_2) ^ 1018156973;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean hidesElytra(class_1657 var1_1) {
        block29: {
            block28: {
                block30: {
                    block27: {
                        block26: {
                            break block30;
lbl1:
                            // 1 sources

                            while (true) {
                                v0 = true;
                                break block26;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_4 ^ 572801584;
                                break block27;
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 752612472;
                                break block28;
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -392503239;
                                break block28;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var3_5 ^= var4_4 ^ 1921446574;
                                break block29;
                                break;
                            }
lbl16:
                            // 1 sources

                            return v0;
lbl18:
                            // 1 sources

                            while (true) {
                                v0 = false;
                                break block26;
                                break;
                            }
lbl21:
                            // 2 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -472519977;
                                break block28;
lbl24:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 1564767656;
                                    break block28;
                                    break;
                                }
                                break;
                            }
                        }
                        var3_5 ^= 1114262040;
                        ** while (true)
                    }
                    var4_4 = (var2_3 | var5_2) ^ 1487005253;
                    break block28;
lbl33:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ 1021373800;
                        ** continue;
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 1823503864;
                        break block28;
                        break;
                    }
                }
                var5_2 = 2059477828;
                var2_3 = M.c & 2059477828 ^ -383409675;
                var4_4 = 0;
                var3_5 = (var2_3 | var5_2) ^ -584553473;
                ** while (true)
lbl45:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1380715247;
                    break block28;
                    break;
                }
lbl48:
                // 1 sources

                while (true) {
                    if (!this.shouldPose(var1_1)) ** GOTO lbl21
                    ** continue;
                    break;
                }
            }
lbl52:
            // 2 sources

            block24: while (true) {
                switch (var4_4) {
                    default: {
                        continue block24;
                    }
                    case -683780211: {
                        ** continue;
                    }
                    case -1499343267: {
                        ** continue;
                    }
                    case 405817634: {
                        ** continue;
                    }
                    case 327107532: {
                        ** continue;
                    }
                    case 2084176480: {
                        ** continue;
                    }
                    case 1448498916: {
                        ** continue;
                    }
                    case -1755982323: {
                        ** continue;
                    }
                    case -1586476439: {
                        ** continue;
                    }
                    case -1555806800: {
                        if (var1_1.method_6128()) ** break;
                        ** continue;
                    }
                }
lbl75:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 1519774108;
                    continue block24;
                    break;
                }
                ** continue;
                break;
            }
        }
        var4_4 = (var2_3 | var5_2) ^ -2015387243;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean hidesArmor() {
        int n2 = c & 0xBD82AC2E ^ 0xC2D5ECD6;
        int n3 = 0;
        int n4 = (n2 | 0xBD82AC2E) ^ 0xD1BEBE51;
        n3 = (n2 | 0xBD82AC2E) ^ 0xE9D46D57;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1406490507: {
                    n4 ^= n3 ^ 0xB31CDFE5;
                    n3 = (n2 | 0xBD82AC2E) ^ 0x706AC2FC;
                    continue block5;
                }
                case 369328553: {
                    n3 = (n2 | 0xBD82AC2E) ^ 0x53FD448B;
                    continue block5;
                }
                case -1883427326: 
            }
            break;
        }
        return (Boolean)this.c.getValue();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean posesSuperman(class_1657 var1_1) {
        block18: {
            break block18;
lbl1:
            // 2 sources

            while (true) {
                var3_5 ^= -496492331;
                return v0;
            }
        }
        var5_2 = 2083884781;
        var2_3 = M.c & 2083884781 ^ 693040796;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -1081554840;
        var4_4 = (var2_3 | var5_2) ^ -244768923;
        block14: while (true) {
            switch (var4_4) {
                default: {
                    continue block14;
                }
                case -1153310433: {
                    if (var1_1.method_6128()) {
                        var4_4 = (var2_3 | var5_2) ^ 610480559;
                        continue block14;
                    }
                    ** GOTO lbl52
                }
                case 920118033: {
                    v0 = false;
                    ** GOTO lbl1
                }
                case 911051177: {
                    v0 = true;
                    ** continue;
                }
                case -345397151: {
                    var3_5 ^= var4_4 ^ -420257852;
                    var4_4 = (var2_3 | var5_2) ^ 1269308908;
                    continue block14;
                }
                case 504065064: {
                    if (var1_1.method_6123()) {
                        var4_4 = (var2_3 | var5_2) ^ 2121599905;
                        continue block14;
                    }
                    ** GOTO lbl52
                }
                case 1009359758: {
                    if (this.shouldPose(var1_1)) {
                        var4_4 = (var2_3 | var5_2) ^ 1601019579;
                        continue block14;
                    }
                    ** GOTO lbl52
                }
                case -1944657512: {
                    var4_4 = (var2_3 | var5_2) ^ -855212695;
                    continue block14;
                }
                case 51049820: {
                    var4_4 = (var2_3 | var5_2) ^ 1096181107;
                    continue block14;
                }
                case -1334213740: {
                    var3_5 ^= var4_4 ^ -594684477;
                    var4_4 = (var2_3 | var5_2) ^ -969007134;
                    continue block14;
                }
                case 1495060306: {
                    var4_4 = (var2_3 | var5_2) ^ 1668584149;
                    continue block14;
                }
lbl52:
                // 3 sources

                var4_4 = (var2_3 | var5_2) ^ -1776920932;
                continue block14;
                case 571629638: 
            }
            var3_5 ^= var4_4 ^ 797480931;
            var4_4 = (var2_3 | var5_2) ^ 1261598548;
        }
    }

    /*
     * Unable to fully structure code
     */
    public float limbProgress(UUID var1_1, float var2_2) {
        block31: {
            block33: {
                block32: {
                    block30: {
                        var7_3 = -1188926241;
                        var4_4 = M.c & -1188926241 ^ -1682429634;
                        var6_5 = 0;
                        ** GOTO lbl52
lbl5:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var5_7 ^= 82235127;
                            break block30;
                            break;
                        }
                        var6_5 = (var4_4 | var7_3) ^ 1579969196;
                        block19: while (true) {
                            switch (var6_5) lbl-1000:
                            // 6 sources

                            {
                                while (true) {
                                    default: {
                                        continue block19;
                                    }
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var6_5 = (var4_4 | var7_3) ^ 1328203182;
                                    ** GOTO lbl25
                                    break;
                                }
                                case -210183905: {
                                    var5_7 ^= var6_5 ^ 62356983;
                                    ** continue;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    var5_7 ^= -291098856;
                                    break block31;
                                    break;
                                }
lbl25:
                                // 3 sources

                                block23: while (true) {
                                    switch (var6_5) {
                                        default: {
                                            continue block23;
                                        }
lbl29:
                                        // 1 sources

                                        while (true) {
                                            var6_5 = (var4_4 | var7_3) ^ -910832455;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case 109767003: {
                                            ** continue;
                                        }
lbl34:
                                        // 1 sources

                                        while (true) {
                                            var6_5 = (var4_4 | var7_3) ^ -1738759170;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl37:
                                        // 1 sources

                                        while (true) {
                                            var6_5 = (var4_4 | var7_3) ^ 1113439978;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case 1913626950: {
                                            v0 = 0.0f;
                                            break block19;
                                        }
                                        case -191846319: {
                                            var5_7 ^= var6_5 ^ -1635454576;
                                            break block32;
                                        }
lbl46:
                                        // 1 sources

                                        while (true) {
                                            var5_7 ^= 761262552;
                                            break block31;
                                            break;
                                        }
                                        case -443152557: {
                                            v0 = var3_6.b - var3_6.a * (1.0f - var2_2);
                                            break block19;
                                        }
lbl52:
                                        // 1 sources

                                        var5_7 = (var4_4 | var7_3) ^ -1721008139;
                                        break block33;
lbl54:
                                        // 1 sources

                                        while (true) {
                                            var6_5 = (var4_4 | var7_3) ^ -706090081;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case 1601688888: {
                                            var3_6 = (cU)this.a.get(var1_1);
                                            break block23;
                                        }
                                    }
                                    break;
                                }
                                ** continue;
lbl61:
                                // 1 sources

                                while (true) {
                                    var6_5 = (var4_4 | var7_3) ^ 1220719840;
                                    ** continue;
                                    break;
                                }
                                case 1850967648: {
                                    var5_7 ^= var6_5 ^ -1633934712;
                                    ** continue;
                                }
                            }
                            break;
                        }
                    }
                    switch (var5_7) {
                        default: {
                            ** continue;
                        }
                        case -1608053549: {
                            ** continue;
                        }
                        ** case -1434921276:
lbl74:
                        // 1 sources

                        ** continue;
                    }
                }
                var6_5 = (var4_4 | var7_3) ^ -456279865;
                ** GOTO lbl25
            }
            var6_5 = (var4_4 | var7_3) ^ -1120893788;
            ** while (true)
        }
        return v0;
        {
            case -102247659: {
                var5_7 ^= var6_5 ^ -342496526;
                ** continue;
            }
            ** case 602328577:
        }
lbl87:
        // 1 sources

        ** while (var3_6 != null)
lbl88:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public float limbAmplitude(UUID var1_1) {
        var6_2 = 2040467086;
        var3_3 = M.c & 2040467086 ^ -1963574608;
        var5_4 = 0;
        ** GOTO lbl66
lbl5:
        // 1 sources

        block13: while (true) {
            block26: {
                var5_4 = (var3_3 | var6_2) ^ 8178698;
                break block26;
lbl8:
                // 1 sources

                return class_3532.method_15363((float)(var2_6.c / 0.5f), (float)0.2f, (float)1.0f);
lbl10:
                // 1 sources

                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ -1524182371;
                    ** GOTO lbl30
                    break;
                }
lbl13:
                // 1 sources

                return 0.0f;
                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ 1792083574;
                    ** GOTO lbl30
                    break;
                }
            }
lbl19:
            // 2 sources

            block18: while (true) {
                switch (var5_4) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block18;
                        }
                        break;
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        var4_5 ^= var5_4 ^ 739423167;
                        ** continue;
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ 882280834;
                        ** continue;
                        break;
                    }
lbl30:
                    // 4 sources

                    block22: while (true) {
                        switch (var5_4) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                default: {
                                    continue block22;
                                }
                                break;
                            }
                            case 1591340067: {
                                ** continue;
                            }
                            case -1844502883: {
                                ** continue;
                            }
                            case -1859241784: {
                                ** continue;
                            }
lbl41:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ 1756547016;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -1823606410: {
                                var4_5 ^= var5_4 ^ 400252744;
                                ** GOTO lbl62
                            }
                            case -815155396: {
                                break block13;
                            }
lbl49:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ 1777344547;
                                ** continue;
                                break;
                            }
                            case -376853715: {
                                var4_5 ^= var5_4 ^ 1118566515;
                                ** continue;
                            }
                            case -1449286791: {
                                if (var2_6 != null) ** continue;
                                break block22;
                            }
                        }
                        break;
                    }
                    ** GOTO lbl64
                    case -75238732: {
                        var2_6 = (cU)this.a.get(var1_1);
                        ** continue;
                    }
lbl62:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 1382194631;
                    ** GOTO lbl30
lbl64:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 309761427;
                    ** continue;
lbl66:
                    // 1 sources

                    var4_5 = (var3_3 | var6_2) ^ -1470864740;
                    ** continue;
                }
                break;
            }
            break;
        }
        var5_4 = (var3_3 | var6_2) ^ -2120751211;
        ** while (true)
        {
            ** case 2053691691:
        }
lbl71:
        // 1 sources

        var4_5 ^= var5_4 ^ 2102772329;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static boolean anchorsCamera(class_1297 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH], 51[UNCONDITIONALDOLOOP]], but top level block is 23[SWITCH]
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

    private static int v(int n2, int n3) {
        int n4 = -1098655435;
        int n5 = -1129637000;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xDB750B)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xBEAB508A;
        n6 += (n5 | n4) ^ 0xBEAB83FF;
        n6 += (n5 | n4) ^ 0xBEAB6509;
        n6 += (n5 | n4) ^ 0xBEABE828;
        n6 -= (n5 | n4) ^ 0xBEABD953;
        n6 ^= (n5 | n4) ^ 0xBEAB3B27;
        n6 -= (n5 | n4) ^ 0xBEABCA17;
        n6 += (n5 | n4) ^ 0xBEAB3ACE;
        return n6 ^= (n5 | n4) ^ 0xBEAB1A19;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static float labelHeight(class_1297 var0) {
        var6_1 = -848814588;
        var3_2 = M.c & -848814588 ^ 1104345024;
        var5_3 = 0;
        var4_6 = (var3_2 | var6_1) ^ -704588868;
        var5_3 = (var3_2 | var6_1) ^ 926917888;
        if (true) ** GOTO lbl37
        block17: while (true) {
            block22: {
                block23: {
                    switch (var5_3) {
                        case -545915498: {
                            var4_6 ^= var5_3 ^ -576602717;
                            var5_3 = (var3_2 | var6_1) ^ -409560887;
                            ** break;
                        }
                        case -866758900: {
                            var4_6 ^= var5_3 ^ -1067140242;
                            var5_3 = (var3_2 | var6_1) ^ -1104178658;
                            ** break;
                        }
                        case 1943367130: {
                            return Math.max(var1_4.method_17682(), 1.8f);
                        }
                        case 711747341: {
                            if (var2_5 == null) break block22;
                            var5_3 = (var3_2 | var6_1) ^ -1868381983;
                        }
lbl22:
                        // 4 sources

                        default: {
                            continue block17;
                        }
                        {
                        }
                        case 294710964: {
                            if (!var2_5.shouldPose(var1_4)) break block22;
                            break block23;
                        }
                        case 1566064421: 
                    }
                    var5_3 = (var3_2 | var6_1) ^ -597028496;
                    continue;
                }
                var5_3 = (var3_2 | var6_1) ^ 28094664;
                continue;
            }
            block18: while (true) {
                var5_3 = (var3_2 | var6_1) ^ 1520312172;
lbl37:
                // 2 sources

                block19: while (true) {
                    block25: {
                        block24: {
                            switch (var5_3) {
                                default: {
                                    continue block19;
                                }
                                case 765006028: {
                                    if (!(var0 instanceof class_1657)) continue block18;
                                    var5_3 = (var3_2 | var6_1) ^ -1212143129;
                                    continue block19;
                                }
                                case 651679231: {
                                    return var0.method_17682();
                                }
                                case -430842329: {
                                    var4_6 ^= var5_3 ^ -254120660;
                                    break block24;
                                }
                                case -1754996568: {
                                    var4_6 ^= var5_3 ^ -1063676114;
                                    var5_3 = (var3_2 | var6_1) ^ -349361605;
                                    continue block19;
                                }
                                case 1847234514: {
                                    var1_4 = (class_1657)var0;
                                    if (var1_4.method_6128()) ** break;
                                    continue block18;
                                    var4_6 ^= 47464501;
                                    break;
                                }
                                case -87729468: {
                                    var5_3 = (var3_2 | var6_1) ^ 732635619;
                                    continue block19;
                                }
                                case 2050676259: {
                                    break block25;
                                }
                            }
                            var2_5 = M.get();
                            var5_3 = (var3_2 | var6_1) ^ 311362130;
                            continue block17;
                        }
                        var5_3 = (var3_2 | var6_1) ^ -530321656;
                        continue;
                    }
                    var5_3 = (var3_2 | var6_1) ^ -1545572330;
                }
                break;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean w(cU var1_1) {
        var5_2 = 1666676263;
        var2_3 = M.c & 1666676263 ^ -1969512134;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 310226642;
        var4_4 = (var2_3 | var5_2) ^ 2044968988;
        if (true) ** GOTO lbl15
        block9: while (true) {
            var4_4 = (var2_3 | var5_2) ^ -268500036;
            if (true) ** GOTO lbl15
            block10: while (true) {
                var4_4 = (var2_3 | var5_2) ^ 932659255;
                if (true) ** GOTO lbl15
                block11: while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1263408833;
lbl15:
                    // 4 sources

                    block12: while (true) {
                        switch (var4_4) {
                            case -1841547485: {
                                var4_4 = (var2_3 | var5_2) ^ 579635886;
                                continue block12;
                            }
                            case 69268611: {
                                v0 = false;
                                ** GOTO lbl37
                            }
                            case -1663820066: {
                                if (this.a - var1_1.a <= M.v((var3_5 | var4_4 ^ -8165127) ^ (var4_4 ^ 1366509271), (var2_3 | var4_4 ^ -8165127) ^ ((var3_5 | var4_4 ^ -8165127) ^ (var4_4 ^ 1881020098)))) continue block11;
                                ** break;
                            }
                            case -916282390: {
                                var3_5 ^= var4_4 ^ -935764313;
                                continue block10;
                            }
                            case 1601052160: {
                                var3_5 ^= var4_4 ^ 1580589901;
                                continue block9;
                            }
lbl32:
                            // 1 sources

                            var4_4 = (var2_3 | var5_2) ^ 582833365;
                            default: {
                                continue block12;
                            }
                            case -599214328: {
                                v0 = true;
lbl37:
                                // 2 sources

                                var3_5 ^= 1370344035;
                                return v0;
                            }
                            case -917275247: 
                        }
                        var3_5 ^= var4_4 ^ 544588291;
                        var4_4 = (var2_3 | var5_2) ^ 1997269473;
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ cU x(UUID var0) {
        var1_1 = M.c & 1998312501 ^ -749137355;
        var3_2 = 0;
        var2_3 = (var1_1 | 1998312501) ^ -435821539;
        var3_2 = (var1_1 | 1998312501) ^ 521126162;
        if (true) ** GOTO lbl8
        block5: while (true) {
            var3_2 = (var1_1 | 1998312501) ^ -609604937;
lbl8:
            // 2 sources

            block6: while (true) {
                switch (var3_2) {
                    default: {
                        continue block6;
                    }
                    case -397142233: {
                        var3_2 = (var1_1 | 1998312501) ^ -1726347616;
                        continue block6;
                    }
                    case 1849806997: {
                        var2_3 ^= var3_2 ^ 561491279;
                        continue block5;
                    }
                    case 754056322: 
                }
                break;
            }
            break;
        }
        return new cU();
    }
}

