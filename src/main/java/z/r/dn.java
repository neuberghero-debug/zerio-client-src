/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_3414
 */
package z.r;

import java.util.Arrays;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3414;
import z.r.gF;
import z.r.gP;
import z.r.hJ;
import z.r.ke;
import z.r.lV;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class dn
extends gF {
    private static final /* synthetic */ String a;
    private final ke a;
    private static dn a;
    private final gP a;
    private static final /* synthetic */ String b;
    private final gP b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final float a;
    private static final int[] a;
    private static final /* synthetic */ String k;
    private final boolean[] a;
    private static final /* synthetic */ String e;
    private static final long a;
    private static final float b;
    private final ke b;
    private long b;
    private static final /* synthetic */ String f;
    private final long[] a;
    private final gP c;
    private static final /* synthetic */ String g;
    private final gP d;
    private final ke c;
    private final gP e;
    private static final /* synthetic */ String h;
    public static final int a;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String s;
    private final boolean[] b;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final long c;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;

    /*
     * Exception decompiling
     */
    public dn() {
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
    public static dn get() {
        var0 = dn.a & 1399277060 ^ -717044759;
        var2_1 = 0;
        ** GOTO lbl18
lbl4:
        // 1 sources

        block5: while (true) {
            switch (var2_1) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    var2_1 = (var0 | 1399277060) ^ 180606251;
                    ** GOTO lbl-1000
                    break;
                }
                case -1081082843: {
                    var1_2 ^= var2_1 ^ -1934814312;
                    break block5;
                }
                ** case -576449850:
lbl16:
                // 1 sources

                var2_1 = (var0 | 1399277060) ^ 1760050120;
                ** continue;
lbl18:
                // 1 sources

                var1_2 = (var0 | 1399277060) ^ 261976282;
                ** continue;
                case -54513692: {
                    return dn.a;
                }
            }
            break;
        }
        var2_1 = (var0 | 1399277060) ^ 732424201;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void onKeyboardInput(int var1_1, int var2_2) {
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
    private void iq(int var1_1, boolean var2_2) {
        block91: {
            block90: {
                block92: {
                    var10_3 = 171565700;
                    var9_4 = -536513530;
                    var6_5 = dn.a & 171565700 ^ 964177099;
                    var8_6 = 0;
                    var7_8 = (var6_5 | var10_3) ^ -999288862;
                    var8_6 = (var6_5 | var10_3) ^ 1047332280;
                    break block92;
                    while (true) {
                        var8_6 = (var6_5 | var10_3) ^ 42717417;
                        if (true) ** GOTO lbl16
                        break;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var8_6 = (var6_5 | var10_3) ^ 738337043;
                        ** GOTO lbl294
                        break;
                    }
                    block74: while (true) {
                        var8_6 = (var6_5 | var10_3) ^ -1584017966;
lbl16:
                        // 3 sources

                        block75: while (true) {
                            switch (var8_6) {
                                case -365128062: {
                                    var3_9 = lV.a[dn.is((var7_8 | var8_6 ^ var9_4) ^ (var8_6 ^ 832778524), (var6_5 | var8_6 ^ var9_4) ^ ((var7_8 | var8_6 ^ var9_4) ^ (var8_6 ^ -1615384622))) + var1_1 - dn.is((var7_8 | var8_6 ^ var9_4) ^ (var8_6 ^ 832778525), (var6_5 | var8_6 ^ var9_4) ^ ((var7_8 | var8_6 ^ var9_4) ^ (var8_6 ^ 2039797579)))];
                                    ** GOTO lbl285
                                }
                                case -1193778274: {
                                    if (var1_1 != dn.is((var7_8 | var8_6 ^ -1293844198) ^ (var8_6 ^ 1996866910), (var6_5 | var8_6 ^ -1293844198) ^ ((var7_8 | var8_6 ^ -1293844198) ^ (var8_6 ^ 146679943)))) ** GOTO lbl55
                                    ** GOTO lbl177
                                }
                                case 438319142: {
                                    ** break;
                                }
                                case -1254418822: {
                                    var3_9 = lV.a[var1_1 - dn.is((var7_8 | var8_6 ^ -1090325250) ^ (var8_6 ^ 1856287209), (var6_5 | var8_6 ^ -1090325250) ^ ((var7_8 | var8_6 ^ -1090325250) ^ (var8_6 ^ -1872640579)))];
                                    ** GOTO lbl285
                                }
                                case 748129354: {
                                    var8_6 = (var6_5 | var10_3) ^ -1173435718;
                                    ** GOTO lbl53
                                }
                                case -907017171: {
                                    if (var1_1 == dn.is((var7_8 | var8_6 ^ -1010178391) ^ (var8_6 ^ 103654126), (var6_5 | var8_6 ^ -1010178391) ^ ((var7_8 | var8_6 ^ -1010178391) ^ (var8_6 ^ -1981850655)))) ** GOTO lbl177
                                    ** GOTO lbl175
                                }
                                case -404134528: {
                                    var5_11 = Math.floorMod(var1_1 * dn.is((var7_8 | var8_6 ^ -305101052) ^ (var8_6 ^ 1211549217), (var6_5 | var8_6 ^ -305101052) ^ ((var7_8 | var8_6 ^ -305101052) ^ (var8_6 ^ 1171644352))), lV.a.length);
                                    ** GOTO lbl95
                                }
                                case -582494585: {
                                    var3_9 = lV.d;
                                    ** break;
                                }
                                case 325449210: {
                                    ** GOTO lbl125
                                }
                                case 509885009: {
                                    var7_8 ^= var8_6 ^ 469444139;
                                    ** GOTO lbl57
                                }
lbl46:
                                // 1 sources

                                var8_6 = (var6_5 | var10_3) ^ -2086564527;
                                continue block75;
lbl48:
                                // 1 sources

                                var8_6 = (var6_5 | var10_3) ^ 547968054;
                                break block90;
                                case 2016260089: {
                                    var7_8 ^= var8_6 ^ -162861760;
                                    var8_6 = (var6_5 | var10_3) ^ -1908213579;
                                }
lbl53:
                                // 9 sources

                                default: {
                                    continue block75;
                                }
lbl55:
                                // 1 sources

                                var8_6 = (var6_5 | var10_3) ^ -1424695978;
                                continue block75;
lbl57:
                                // 1 sources

                                var8_6 = (var6_5 | var10_3) ^ 617832861;
                                continue block75;
                                case -1112357499: {
                                    var3_9 = lV.b;
                                    var8_6 = (var6_5 | var10_3) ^ 1417309246;
                                    ** GOTO lbl-1000
                                }
                                case 890964089: {
                                    if (var1_1 > dn.is((var7_8 | var8_6 ^ 1059252989) ^ (var8_6 ^ -343492886), (var6_5 | var8_6 ^ 1059252989) ^ ((var7_8 | var8_6 ^ 1059252989) ^ (var8_6 ^ 1890904925)))) continue block74;
                                    ** GOTO lbl137
                                }
                                case -1421417533: {
                                    if (var1_1 == dn.is((var7_8 | var8_6 ^ -1585512121) ^ (var8_6 ^ -1059367644), (var6_5 | var8_6 ^ -1585512121) ^ ((var7_8 | var8_6 ^ -1585512121) ^ (var8_6 ^ 1982406646)))) ** continue;
                                    var8_6 = (var6_5 | var10_3) ^ 622711966;
                                    continue block75;
                                }
                                case -425359365: {
                                    var7_8 ^= var8_6 ^ -108407593;
                                    ** GOTO lbl115
                                }
                                case -1469629573: {
                                    var7_8 ^= var8_6 ^ 2055845206;
                                    var8_6 = (var6_5 | var10_3) ^ 891209166;
                                    ** GOTO lbl53
                                }
                                case 241642241: {
                                    var3_9 = lV.g;
                                    ** GOTO lbl86
                                }
                                case -1871891559: {
                                    var7_8 ^= var8_6 ^ -1137645493;
                                    var8_6 = (var6_5 | var10_3) ^ -603312482;
                                    ** GOTO lbl53
                                }
                                case -1951526480: {
                                    ** GOTO lbl157
                                }
lbl86:
                                // 1 sources

                                var8_6 = (var6_5 | var10_3) ^ -728031127;
                                ** GOTO lbl-1000
                                case 465467659: {
                                    var7_8 ^= var8_6 ^ -1728372688;
                                    var8_6 = (var6_5 | var10_3) ^ 1432145599;
                                    ** GOTO lbl53
                                }
                                case -157838468: {
                                    var7_8 ^= var8_6 ^ -71988994;
                                    ** GOTO lbl98
                                }
lbl95:
                                // 1 sources

                                var7_8 ^= 1954104892;
                                var3_9 = lV.a[var5_11];
                                ** GOTO lbl285
lbl98:
                                // 1 sources

                                var8_6 = (var6_5 | var10_3) ^ -783976371;
                                continue block75;
                                case -35395043: {
                                    switch (var7_8) {
                                        case 90751374: {
                                            var8_6 = (var6_5 | var10_3) ^ 781852293;
                                            continue block75;
                                        }
                                        default: {
                                            var8_6 = (var6_5 | var10_3) ^ -1308955538;
                                            continue block75;
                                        }
                                        case 759282400: 
                                    }
                                    var8_6 = (var6_5 | var10_3) ^ 1740304524;
                                    continue block75;
                                }
                                case 1847926896: {
                                    if (var1_1 < dn.is((var7_8 | var8_6 ^ 1679606516) ^ (var8_6 ^ -1330077982), (var6_5 | var8_6 ^ 1679606516) ^ ((var7_8 | var8_6 ^ 1679606516) ^ (var8_6 ^ -1286151140)))) ** break;
                                    var8_6 = (var6_5 | var10_3) ^ 887967395;
                                    ** GOTO lbl53
                                }
lbl115:
                                // 1 sources

                                var8_6 = (var6_5 | var10_3) ^ -521958891;
                                continue block75;
                                case 1556291139: {
                                    var7_8 ^= var8_6 ^ 1609226950;
                                    ** GOTO lbl125
                                }
                                case -2122898315: {
                                    if (var1_1 <= dn.is((var7_8 | var8_6 ^ -1957771535) ^ (var8_6 ^ -558988322), (var6_5 | var8_6 ^ -1957771535) ^ ((var7_8 | var8_6 ^ -1957771535) ^ (var8_6 ^ -1342998724)))) {
                                        var8_6 = (var6_5 | var10_3) ^ 1129595190;
                                        continue block75;
                                    }
                                    ** GOTO lbl173
                                }
lbl125:
                                // 2 sources

                                var8_6 = (var6_5 | var10_3) ^ -962984750;
                                continue block75;
                                case -1081610924: {
                                    var7_8 ^= var8_6 ^ 373924237;
                                    var8_6 = (var6_5 | var10_3) ^ -225842462;
                                    continue block75;
                                }
                                case -411844527: {
                                    if (dn.iy(var1_1)) {
                                        var8_6 = (var6_5 | var10_3) ^ -1826695756;
                                        continue block75;
                                    }
                                    var8_6 = (var6_5 | var10_3) ^ 362819079;
                                    continue block75;
                                }
lbl137:
                                // 1 sources

                                var8_6 = (var6_5 | var10_3) ^ -840008269;
                                continue block75;
                                case 531271506: {
                                    if (var1_1 == dn.is((var7_8 | var8_6 ^ 361983446) ^ (var8_6 ^ 1907434958), (var6_5 | var8_6 ^ 361983446) ^ ((var7_8 | var8_6 ^ 361983446) ^ (var8_6 ^ 2136125649)))) ** GOTO lbl161
                                    var8_6 = (var6_5 | var10_3) ^ 83119916;
                                    ** GOTO lbl53
                                }
                                case 999145204: {
                                    var7_8 ^= var8_6 ^ 1650200238;
                                    var8_6 = (var6_5 | var10_3) ^ 376979898;
                                    continue block75;
                                }
                                case 786022600: {
                                    var7_8 ^= var8_6 ^ 1654127738;
                                    var8_6 = (var6_5 | var10_3) ^ -594506929;
                                    continue block75;
                                }
                                case -1971125599: {
                                    var7_8 ^= var8_6 ^ -259050721;
                                    ** GOTO lbl181
                                }
                                case 1066246627: {
                                    var8_6 = (var6_5 | var10_3) ^ 1192046241;
                                    continue block75;
                                }
lbl157:
                                // 1 sources

                                var8_6 = (var6_5 | var10_3) ^ -2033505462;
                                continue block75;
                                case 2088026222: {
                                    if (var1_1 != dn.is((var7_8 | var8_6 ^ 1984766698) ^ (var8_6 ^ 309291765), (var6_5 | var8_6 ^ 1984766698) ^ ((var7_8 | var8_6 ^ 1984766698) ^ (var8_6 ^ 779773727)))) ** GOTO lbl167
lbl161:
                                    // 2 sources

                                    var8_6 = (var6_5 | var10_3) ^ 16011323;
                                    ** GOTO lbl53
                                }
                                case -1695800547: {
                                    var7_8 ^= var8_6 ^ 804637024;
                                    var8_6 = (var6_5 | var10_3) ^ -1874916084;
                                    continue block75;
                                }
lbl167:
                                // 1 sources

                                var8_6 = (var6_5 | var10_3) ^ -2063727717;
                                continue block75;
                                case -610638630: {
                                    if (var1_1 >= dn.is((var7_8 | var8_6 ^ -777812386) ^ (var8_6 ^ -2075933834), (var6_5 | var8_6 ^ -777812386) ^ ((var7_8 | var8_6 ^ -777812386) ^ (var8_6 ^ 1359249023)))) {
                                        var8_6 = (var6_5 | var10_3) ^ 401498757;
                                        continue block75;
                                    }
lbl173:
                                    // 3 sources

                                    var8_6 = (var6_5 | var10_3) ^ 549951428;
                                    continue block75;
                                }
lbl175:
                                // 1 sources

                                var8_6 = (var6_5 | var10_3) ^ 559535849;
                                continue block75;
lbl177:
                                // 2 sources

                                var8_6 = (var6_5 | var10_3) ^ 672930613;
                                continue block75;
                                case 367259722: {
                                    var7_8 ^= var8_6 ^ 1022724690;
lbl181:
                                    // 2 sources

                                    var8_6 = (var6_5 | var10_3) ^ -1328021633;
                                    continue block75;
                                }
                                case 755085173: {
                                    var3_9 = lV.f;
                                    var8_6 = (var6_5 | var10_3) ^ -1881794738;
                                    ** GOTO lbl-1000
                                }
                                case 972176934: {
                                    var7_8 ^= var8_6 ^ 643657;
                                    var8_6 = (var6_5 | var10_3) ^ -432129976;
                                    continue block75;
                                }
                                case 261398636: 
                            }
                            var8_6 = (var6_5 | var10_3) ^ 241362614;
                            continue;
                            break;
                        }
                        break;
                    }
lbl194:
                    // 1 sources

                    while (true) {
                        var8_6 = (var6_5 | var10_3) ^ -1338512759;
                        break block90;
                        break;
                    }
                    while (true) {
                        var8_6 = (var6_5 | var10_3) ^ 1556287547;
                        break block90;
                        break;
                    }
                    while (true) {
                        var7_8 ^= 722046136;
                        break block91;
                        break;
                    }
lbl203:
                    // 1 sources

                    while (true) {
                        var8_6 = (var6_5 | var10_3) ^ -2107124100;
                        break block90;
                        break;
                    }
lbl206:
                    // 1 sources

                    while (true) {
                        var8_6 = (var6_5 | var10_3) ^ -15305552;
                        break block92;
                        break;
                    }
lbl209:
                    // 1 sources

                    while (true) {
                        var8_6 = (var6_5 | var10_3) ^ 375091097;
                        break block90;
                        break;
                    }
                }
                block83: while (true) {
                    switch (var8_6) {
                        default: {
                            continue block83;
                        }
                        case 1441659997: {
                            var7_8 ^= var8_6 ^ 1743487522;
                            ** continue;
                        }
                        case 85257079: {
                            break;
                        }
                        case -999318913: {
                            var4_7 = dn.ix(var1_1);
                            ** break;
lbl225:
                            // 1 sources

                            var8_6 = (var6_5 | var10_3) ^ -572757708;
                            ** continue;
                        }
                    }
                    var8_6 = (var6_5 | var10_3) ^ 1855197842;
                }
            }
            block84: while (true) lbl-1000:
            // 8 sources

            {
                block93: {
                    switch (var8_6) {
                        case -1346727715: {
                            var7_8 ^= var8_6 ^ -1039722015;
                            ** break;
                        }
                        case -1061129477: {
                            var4_7 = 1.0f;
                            break block93;
                        }
                        case 1862501105: {
                            var7_8 ^= var8_6 ^ 23400979;
                            var8_6 = (var6_5 | var10_3) ^ -71721932;
                            continue block84;
                        }
                        case -270348634: {
                            var7_8 ^= var8_6 ^ 87767557;
                            ** GOTO lbl259
                        }
                        case 466664185: {
                            var7_8 ^= var8_6 ^ -1710184599;
                            ** continue;
                        }
                        case -1189201741: {
                            v0 = var4_7;
                            ** break;
                        }
                        case -1957821370: {
                            var4_7 = 1.0f;
                            break block93;
                        }
lbl254:
                        // 1 sources

                        var8_6 = (var6_5 | var10_3) ^ -2038727806;
                        break;
                        case -1263535743: {
                            var7_8 ^= var8_6 ^ 1356506206;
                            ** continue;
                        }
lbl259:
                        // 1 sources

                        var8_6 = (var6_5 | var10_3) ^ 1082473655;
                        break;
                        case 2080166520: {
                            var4_7 = 1.0f;
                            break block93;
                        }
                        case 757236054: {
                            var4_7 = 1.0f;
                            break block93;
                        }
                        case -2093463306: {
                            var7_8 ^= var8_6 ^ -207368541;
                            var8_6 = (var6_5 | var10_3) ^ 1055910711;
                            continue block84;
                        }
                        case 1740308212: {
                            var7_8 ^= var8_6 ^ 168261576;
                            ** continue;
                        }
                        case -1123904179: {
                            v0 = var4_7 * 1.07f;
                            ** break;
lbl277:
                            // 2 sources

                            var7_8 ^= -1298946256;
                            var5_10 = v0;
                            var8_6 = (var6_5 | var10_3) ^ 1375515693;
                            ** GOTO lbl294
                        }
                        case 93718008: {
                            if (!var2_2) ** continue;
                            var8_6 = (var6_5 | var10_3) ^ -1799127534;
                        }
                    }
                    continue;
                }
                var8_6 = (var6_5 | var10_3) ^ -1203657159;
            }
        }
        v1 = 1.0f;
        block85: while (true) {
            var7_8 ^= -882043840;
            this.iw(var3_9, this.e, var5_10, true, v1);
            var8_6 = (var6_5 | var10_3) ^ 345567198;
lbl294:
            // 3 sources

            block86: while (true) {
                switch (var8_6) {
                    default: {
                        continue block86;
                    }
                    case 1787124450: {
                        var7_8 ^= var8_6 ^ -1503174952;
                        ** continue;
                    }
                    case 393990108: {
                        if (!var2_2) ** continue;
                        var7_8 ^= 722046136;
                        v1 = 0.52f;
                        continue block85;
                    }
                    case 803275025: {
                        var7_8 ^= var8_6 ^ 328650913;
                        var8_6 = (var6_5 | var10_3) ^ -1155816281;
                        continue block86;
                    }
                    case -2141042072: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public void onMouseInput(int var1_1, int var2_2) {
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
    public static void playSyntheticMouseClick(int var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
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
    public static void playSyntheticMouseRelease(int var0) {
        block33: {
            block32: {
                block31: {
                    block34: {
                        break block34;
lbl1:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 1400547114;
                            break block31;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 447680925;
                            ** GOTO lbl28
                            break;
                        }
                    }
                    var5_1 = -387927413;
                    var2_2 = dn.a & -387927413 ^ -1919359989;
                    var4_3 = 0;
                    var3_4 = (var2_2 | var5_1) ^ 1917182737;
                    ** while (true)
lbl13:
                    // 1 sources

                    while (true) {
                        var1_5.ir(var0, true);
                        break block32;
                        break;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1813859111;
                        ** GOTO lbl28
                        break;
                    }
lbl19:
                    // 1 sources

                    block19: while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -707992913;
                        if (true) ** GOTO lbl28
lbl22:
                        // 1 sources

                        while (var1_5 != null) {
                            ** continue;
lbl24:
                            // 1 sources

                            ** GOTO lbl16
                        }
                        break block32;
                        block21: while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -586200622;
lbl28:
                            // 7 sources

                            block22: while (true) {
                                switch (var4_3) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block22;
                                        }
                                        break;
                                    }
                                    case -1652873380: {
                                        ** continue;
                                    }
                                    case 821542745: {
                                        ** GOTO lbl22
                                    }
                                    case 942937124: {
                                        break block19;
                                    }
                                    case -1740558047: {
                                        var3_4 ^= var4_3 ^ 971473308;
                                        ** continue;
                                    }
lbl42:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ -1641666777;
                                        ** continue;
                                        break;
                                    }
lbl45:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ -2072570660;
                                        break block31;
                                        break;
                                    }
lbl48:
                                    // 1 sources

                                    while (true) {
                                        var3_4 ^= var4_3 ^ -1734252329;
                                        ** continue;
                                        break;
                                    }
lbl51:
                                    // 1 sources

                                    while (true) {
                                        var1_5 = dn.a;
                                        break block33;
                                        break;
                                    }
                                    case -416640841: {
                                        var3_4 ^= var4_3 ^ 1040583866;
                                        continue block21;
                                    }
                                    case 2115650130: {
                                        ** continue;
                                    }
lbl59:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 2078354297;
                                        break block31;
                                        break;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    var4_3 = (var2_2 | var5_1) ^ 1887687127;
                    ** GOTO lbl28
                }
                block29: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block29;
                        }
                        case -1098755679: {
                            ** continue;
                        }
                        case -1776689678: {
                            ** continue;
                        }
                        ** case 1771037271:
lbl74:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 1975109546;
                ** GOTO lbl28
                break;
            }
        }
        var4_3 = (var2_2 | var5_1) ^ 181560892;
        ** while (true)
        {
            case 1943982508: {
                if (!var1_5.iv()) ** continue;
                ** continue;
            }
            ** case -145234154:
        }
lbl86:
        // 1 sources

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
    public static void playSyntheticHotbarSelect(int var0) {
        block24: {
            block26: {
                block25: {
                    break block26;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 602785275;
                        ** GOTO lbl17
lbl4:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 328824052;
                            if (true) ** GOTO lbl33
                            break;
                        }
                        break;
                    }
                    block15: while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -262854375;
                        if (true) ** GOTO lbl17
                        block16: while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 188946029;
                            ** GOTO lbl17
lbl13:
                            // 1 sources

                            return;
                            block18: while (var0 >= 0) {
                                ** GOTO lbl47
lbl17:
                                // 7 sources

                                block19: while (true) {
                                    switch (var3_3) lbl-1000:
                                    // 5 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block19;
                                            }
                                            break;
                                        }
                                        case -847092089: {
                                            ** continue;
                                        }
                                        case 498078866: {
                                            ** continue;
                                        }
                                        case -880086065: {
                                            continue block18;
                                        }
                                        case 18877926: {
                                            continue block16;
                                        }
                                        case -1716685846: {
                                            dn.playSyntheticKeyPress(dn.is((var2_4 | var3_3 ^ -2055717524) ^ (var3_3 ^ 563639309), (var1_2 | var3_3 ^ -2055717524) ^ ((var2_4 | var3_3 ^ -2055717524) ^ (var3_3 ^ -184858012))) + var0);
                                            break block15;
                                        }
lbl33:
                                        // 1 sources

                                        var3_3 = (var1_2 | var4_1) ^ -1535493004;
                                        ** GOTO lbl-1000
                                        case -344948096: {
                                            var2_4 ^= var3_3 ^ -655628694;
                                            break block24;
                                        }
                                        case -2088156714: {
                                            var2_4 ^= var3_3 ^ 62818319;
                                            ** continue;
                                        }
lbl41:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 261248279;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl44:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 1022837368;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl47:
                                        // 1 sources

                                        var3_3 = (var1_2 | var4_1) ^ -82219905;
                                        ** continue;
                                        case 507152997: {
                                            return;
                                        }
                                        case 843389577: {
                                            if (var0 <= dn.is((var2_4 | var3_3 ^ 781210639) ^ (var3_3 ^ 1215958302), (var1_2 | var3_3 ^ 781210639) ^ ((var2_4 | var3_3 ^ 781210639) ^ (var3_3 ^ -1304216396)))) continue block15;
                                            break block25;
                                        }
                                    }
                                    break;
                                }
                            }
                            break block25;
                            break;
                        }
                        break;
                    }
                    var3_3 = (var1_2 | var4_1) ^ -1101132216;
                    ** GOTO lbl17
lbl57:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -161629103;
                        ** GOTO lbl17
                        break;
                    }
                    {
                        case -959568927: {
                            ** continue;
                        }
                        ** case 915692019:
                    }
lbl63:
                    // 1 sources

                    var2_4 ^= var3_3 ^ 419705180;
                    ** while (true)
                }
                var3_3 = (var1_2 | var4_1) ^ -693646050;
                ** GOTO lbl17
            }
            var4_1 = 483741318;
            var1_2 = dn.a & 483741318 ^ 956696858;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -376553497;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ 543644428;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static void playSyntheticKeyPress(int var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
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
    private void ir(int var1_1, boolean var2_2) {
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

    private static int is(int n2, int n3) {
        int n4 = 845060755;
        int n5 = -521547253;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x771D93CA)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xF2FFB729;
        n6 ^= (n5 | n4) ^ 0xF2FF8F95;
        n6 += (n5 | n4) ^ 0xF2FFCE38;
        n6 += (n5 | n4) ^ 0xF2FFB842;
        n6 += (n5 | n4) ^ 0xF2FFA9A1;
        n6 += (n5 | n4) ^ 0xF2FF1554;
        n6 ^= (n5 | n4) ^ 0xF2FFAB8F;
        n6 -= (n5 | n4) ^ 0xF2FFE3B4;
        n6 += (n5 | n4) ^ 0xF2FF7870;
        return n6 += (n5 | n4) ^ 0xF2FF50CE;
    }

    /*
     * Exception decompiling
     */
    public void onMouseScroll(double var1_1) {
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
    @Override
    public void onEnable() {
        var4_1 = 1206527507;
        var1_2 = dn.a & 1206527507 ^ 1760931412;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1911072007;
        var3_3 = (var1_2 | var4_1) ^ -1500400516;
        block7: while (true) {
            switch (var3_3) {
                case 576772434: {
                    var2_4 ^= var3_3 ^ -1192539211;
                    var3_3 = (var1_2 | var4_1) ^ 1802287976;
                    continue block7;
                }
                case -915531221: {
                    var3_3 = (var1_2 | var4_1) ^ 1302296325;
                    ** break;
                }
                case 76748095: {
                    this.it();
                    var3_3 = (var1_2 | var4_1) ^ 324835479;
                    ** break;
                }
                case 2091071168: {
                    var2_4 ^= var3_3 ^ -1514736157;
                    var3_3 = (var1_2 | var4_1) ^ 1849056981;
                }
lbl22:
                // 4 sources

                default: {
                    continue block7;
                }
                case 30011522: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block12: {
            block13: {
                break block13;
lbl1:
                // 1 sources

                return;
lbl3:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ 1756749513;
                    ** GOTO lbl26
                    break;
                }
            }
            var4_1 = 1789642251;
            var1_2 = dn.a & 1789642251 ^ -704990077;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -399390077;
            var3_3 = (var1_2 | var4_1) ^ 256124991;
lbl12:
            // 3 sources

            block9: while (true) {
                switch (var3_3) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block9;
                        }
                        break;
                    }
                    case -48935484: {
                        ** continue;
                    }
                    case 1759628400: {
                        ** continue;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1433861015;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -255861068: {
                        break block12;
                    }
lbl26:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1859304962;
                    ** continue;
                    case -1433596644: {
                        var2_4 ^= var3_3 ^ -946395348;
                        break block9;
                    }
                    case -1859565431: {
                        this.it();
                        ** continue;
                    }
                }
                break;
            }
            var3_3 = (var1_2 | var4_1) ^ 49199951;
            ** GOTO lbl12
        }
        var3_3 = (var1_2 | var4_1) ^ -1759888645;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void it() {
        block24: {
            block25: {
                block23: {
                    break block25;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -84668539;
                        ** GOTO lbl15
lbl4:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 606086745;
                            break block23;
                            break;
                        }
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1103483830;
                        ** GOTO lbl15
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1089611240;
                        ** GOTO lbl15
lbl13:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 957056746;
lbl15:
                            // 8 sources

                            block18: while (true) {
                                switch (var3_3) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block18;
                                        }
                                        break;
                                    }
                                    case -1308503648: {
                                        ** continue;
                                    }
                                    case 1914746859: {
                                        break;
                                    }
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 680610401;
                                        ** continue;
                                        break;
                                    }
                                    case -1748125241: {
                                        Arrays.fill(this.a, false);
                                        ** continue;
                                    }
                                    case -960200944: {
                                        var2_4 ^= var3_3 ^ -2009035383;
                                        ** continue;
                                    }
                                }
                                var3_3 = (var1_2 | var4_1) ^ 890269816;
                                continue;
                                {
                                    case -891319934: {
                                        var2_4 ^= var3_3 ^ 1334938794;
                                        break block24;
                                    }
                                    case -127412776: {
                                        return;
                                    }
                                }
lbl40:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 374823860;
                                    continue block18;
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
lbl43:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1913696751;
                        ** GOTO lbl15
                        break;
                    }
                    {
                        case 1106630064: {
                            var2_4 ^= var3_3 ^ 723485454;
                            ** continue;
                        }
                        case -375872946: {
                            this.b = 0L;
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1305356378;
                    ** GOTO lbl15
                    {
                        case -1086465006: {
                            Arrays.fill(this.b, false);
                            ** continue;
                        }
                        case 87815807: {
                            Arrays.fill(this.a, 0L);
                            ** continue;
                        }
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 128461858;
                ** GOTO lbl15
                {
                    ** case -681659493:
                }
lbl64:
                // 1 sources

                var2_4 ^= var3_3 ^ 1517021196;
                ** while (true)
            }
            var4_1 = -1240466990;
            var1_2 = dn.a & -1240466990 ^ -641576774;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ 1371465029;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ 1744977981;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private boolean iu() {
        block28: {
            block30: {
                block32: {
                    block31: {
                        block33: {
                            break block33;
lbl1:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 992354553;
                                break block28;
lbl4:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 243568098;
                                    break block28;
lbl7:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 1937183143;
                                        break block28;
                                        break;
                                    }
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1929981301;
                                    break block28;
                                    break;
                                }
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1393048487;
                                break block28;
lbl16:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 204271410;
                                    ** continue;
                                    break;
                                }
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                block29: {
                                    var3_3 = (var1_2 | var4_1) ^ 1346315472;
                                    break block28;
lbl22:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ 1016468667;
                                        break block29;
                                        break;
                                    }
lbl25:
                                    // 2 sources

                                    while (true) {
                                        var2_4 ^= 1261762204;
                                        break block30;
                                        break;
                                    }
lbl28:
                                    // 1 sources

                                    while (true) {
                                        if (!((Boolean)this.a.getValue()).booleanValue()) break block31;
                                        break block32;
                                        break;
                                    }
                                }
                                var3_3 = (var1_2 | var4_1) ^ -618049717;
                                break block28;
                                break;
                            }
lbl34:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 85928422;
                                break block28;
                                break;
                            }
                        }
                        var4_1 = -213296378;
                        var1_2 = dn.a & -213296378 ^ -1062477514;
                        var3_3 = 0;
                        var2_4 = (var1_2 | var4_1) ^ 1980945451;
                        ** GOTO lbl81
                    }
lbl44:
                    // 3 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 2087720710;
                        break block28;
lbl47:
                        // 1 sources

                        while (true) {
                            v0 = false;
                            ** GOTO lbl25
                            break;
                        }
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 1288367247;
                break block28;
            }
            return v0;
        }
        block26: while (true) {
            switch (var3_3) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block26;
                    }
                    break;
                }
                case -1515876089: {
                    ** continue;
                }
                case -1595686767: {
                    ** continue;
                }
                case -1885606864: {
                    ** continue;
                }
                case -1088350279: {
                    ** continue;
                }
                case -926032945: {
                    ** continue;
                }
                case -1546330138: {
                    ** continue;
                }
                case 2132617661: {
                    ** continue;
                }
                case 683848829: {
                    v0 = true;
                    ** continue;
                }
                case -151727408: {
                    if (!hJ.ok()) ** GOTO lbl44
                    ** continue;
                }
lbl81:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 1447979569;
                ** continue;
                case -43026732: {
                    if (this.isEnabled()) ** break;
                    ** continue;
                    ** continue;
                }
                case -2137199983: 
            }
            break;
        }
        var2_4 ^= var3_3 ^ -1051264354;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private boolean iv() {
        block30: {
            block31: {
                block28: {
                    block29: {
                        block32: {
                            block27: {
                                break block32;
lbl1:
                                // 1 sources

                                while (true) {
                                    if (!((Boolean)this.b.getValue()).booleanValue()) ** GOTO lbl-1000
                                    ** GOTO lbl76
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -2064022824;
                                    break block27;
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    if (!hJ.ok()) ** GOTO lbl-1000
                                    ** GOTO lbl74
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 867945605;
                                    break block28;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 1883515754;
                                    break block29;
                                    break;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ 1264140431;
                            break block29;
lbl19:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1096287679;
                                break block29;
                                break;
                            }
lbl22:
                            // 2 sources

                            while (true) {
                                var2_4 ^= 1170571712;
                                break block30;
                                break;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -361862379;
                                break block29;
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 585904128;
                                break block29;
lbl31:
                                // 1 sources

                                while (true) {
                                    v0 = true;
                                    ** GOTO lbl22
                                    break;
                                }
lbl34:
                                // 1 sources

                                while (!this.isEnabled()) lbl-1000:
                                // 3 sources

                                {
                                    var3_3 = (var1_2 | var4_1) ^ -893908777;
                                    break block29;
lbl37:
                                    // 1 sources

                                    while (true) {
                                        v0 = false;
                                        ** continue;
                                        break;
                                    }
lbl40:
                                    // 1 sources

                                    ** GOTO lbl22
                                }
                                break block31;
                                break;
                            }
                        }
                        var4_1 = -1682632498;
                        var1_2 = dn.a & -1682632498 ^ -968445143;
                        var3_3 = 0;
                        var2_4 = (var1_2 | var4_1) ^ 990256179;
                        ** while (true)
                    }
lbl49:
                    // 4 sources

                    block25: while (true) {
                        switch (var3_3) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                default: {
                                    continue block25;
                                }
                                break;
                            }
                            case -1632651696: {
                                ** continue;
                            }
                            case -1576143515: {
                                ** continue;
                            }
                            case -48528401: {
                                ** continue;
                            }
                            case 899275002: {
                                break block25;
                            }
                            case 357546808: {
                                ** continue;
                            }
                            case 1132363817: {
                                ** continue;
                            }
                            case -134169700: {
                                ** continue;
                            }
                            case -1800473760: {
                                ** continue;
                            }
                            case -1347184507: {
                                ** GOTO lbl34
                            }
                            case 1630602845: {
                                ** continue;
                            }
lbl74:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -1668729914;
                            ** GOTO lbl-1000
lbl76:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ 2113554058;
                            ** continue;
                        }
                        break;
                    }
                    var3_3 = (var1_2 | var4_1) ^ 500233185;
                    ** GOTO lbl49
                }
                var3_3 = (var1_2 | var4_1) ^ -1094273614;
                ** GOTO lbl49
            }
            var3_3 = (var1_2 | var4_1) ^ 670500979;
            ** while (true)
        }
        return v0;
        {
            ** case -1037615090:
        }
lbl89:
        // 1 sources

        var2_4 ^= var3_3 ^ -1640648277;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void iw(class_3414 var1_1, gP var2_2, float var3_3, boolean var4_4, float var5_5) {
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
    private static float ix(int var0) {
        block9: {
            var4_1 = 1531705225;
            var1_2 = dn.a & 1194351811 ^ 384998651;
            var3_3 = 0;
            ** GOTO lbl18
lbl5:
            // 1 sources

            block5: while (true) {
                switch (var3_3) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
                    case -1564158215: {
                        break block9;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | 1194351811) ^ -181007870;
                        ** GOTO lbl-1000
                        break;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | 1194351811) ^ 1267300273;
                        ** continue;
                        break;
                    }
lbl18:
                    // 1 sources

                    var2_4 = (var1_2 | 1194351811) ^ 898993919;
                    ** continue;
                    case 477866826: {
                        return 0.988f + (float)Math.floorMod(var0 * dn.is((var2_4 | var3_3 ^ var4_1) ^ (var3_3 ^ 1580047871), (var1_2 | var3_3 ^ var4_1) ^ ((var2_4 | var3_3 ^ var4_1) ^ (var3_3 ^ -1222373098))), dn.is((var2_4 | var3_3 ^ var4_1) ^ (var3_3 ^ 1580047864), (var1_2 | var3_3 ^ var4_1) ^ ((var2_4 | var3_3 ^ var4_1) ^ (var3_3 ^ 1269773744)))) * 0.004f;
                    }
                    case 1742161109: {
                        var2_4 ^= var3_3 ^ -2130431579;
                        break block5;
                    }
                }
                break;
            }
            ** while (true)
        }
        var3_3 = (var1_2 | 1194351811) ^ 807770158;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean iy(int var0) {
        var4_1 = 2023897573;
        var1_2 = dn.a & 2023897573 ^ -1898221259;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -941311949;
        var3_3 = (var1_2 | var4_1) ^ -1807571878;
        block29: while (true) {
            switch (var3_3) {
                case 1586046204: {
                    v0 = true;
                    ** GOTO lbl105
                }
                case 1980069464: {
                    ** GOTO lbl101
                }
                case -1171000365: {
                    ** break;
                }
                case 1352109476: {
                    if (var0 == dn.is((var2_4 | var3_3 ^ 674608193) ^ (var3_3 ^ -1429996800), (var1_2 | var3_3 ^ 674608193) ^ ((var2_4 | var3_3 ^ 674608193) ^ (var3_3 ^ 1456425443)))) ** GOTO lbl117
                    ** GOTO lbl55
                }
                case -1467056648: {
                    ** GOTO lbl70
                }
                case -1160741769: {
                    var3_3 = (var1_2 | var4_1) ^ -1368591279;
                    ** GOTO lbl98
                }
lbl23:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -1274874489;
                continue block29;
                case 1813246772: {
                    ** GOTO lbl51
                }
                case -1367679692: {
                    if (var0 == dn.is((var2_4 | var3_3 ^ -690428719) ^ (var3_3 ^ 1412344721), (var1_2 | var3_3 ^ -690428719) ^ ((var2_4 | var3_3 ^ -690428719) ^ (var3_3 ^ 457771203)))) ** GOTO lbl117
                    ** GOTO lbl86
                }
                case 1919627941: {
                    if (var0 == dn.is((var2_4 | var3_3 ^ 180947776) ^ (var3_3 ^ -2009119740), (var1_2 | var3_3 ^ 180947776) ^ ((var2_4 | var3_3 ^ 180947776) ^ (var3_3 ^ -304127188)))) ** GOTO lbl117
                    ** GOTO lbl84
                }
                case 1429932658: {
                    var2_4 ^= var3_3 ^ -1003809648;
                    ** GOTO lbl110
                }
                case -1126153261: {
                    if (var0 != dn.is((var2_4 | var3_3 ^ -1002276298) ^ (var3_3 ^ 1186215283), (var1_2 | var3_3 ^ -1002276298) ^ ((var2_4 | var3_3 ^ -1002276298) ^ (var3_3 ^ 1470276925)))) {
                        var3_3 = (var1_2 | var4_1) ^ 1269614352;
                        continue block29;
                    }
                    ** GOTO lbl117
                }
                case -332569248: {
                    ** GOTO lbl57
                }
                case 1765042254: {
                    ** break;
                }
                case 109109149: {
                    var2_4 ^= var3_3 ^ -1752120961;
                    var3_3 = (var1_2 | var4_1) ^ 588101511;
                    continue block29;
                }
lbl49:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 1350673601;
                continue block29;
lbl51:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 712918315;
                continue block29;
                case -1252540699: {
                    ** GOTO lbl82
                }
lbl55:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -1748037189;
                continue block29;
lbl57:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 408815623;
                continue block29;
                case 1908140409: {
                    if (var0 != dn.is((var2_4 | var3_3 ^ 152686748) ^ (var3_3 ^ -1947230245), (var1_2 | var3_3 ^ 152686748) ^ ((var2_4 | var3_3 ^ 152686748) ^ (var3_3 ^ 1766877915)))) {
                        var3_3 = (var1_2 | var4_1) ^ 1450509325;
                        continue block29;
                    }
                    ** GOTO lbl117
                }
                case -729465634: {
                    if (var0 == dn.is((var2_4 | var3_3 ^ -1406728901) ^ (var3_3 ^ 785468025), (var1_2 | var3_3 ^ -1406728901) ^ ((var2_4 | var3_3 ^ -1406728901) ^ (var3_3 ^ 553848960)))) ** GOTO lbl117
                    ** GOTO lbl88
                }
                case 1931323628: {
                    if (var0 != dn.is((var2_4 | var3_3 ^ 197103881) ^ (var3_3 ^ -1991647665), (var1_2 | var3_3 ^ 197103881) ^ ((var2_4 | var3_3 ^ 197103881) ^ (var3_3 ^ 568994781)))) ** GOTO lbl75
                    ** GOTO lbl117
                }
lbl70:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -1914253031;
                continue block29;
                case 1790565807: {
                    var3_3 = (var1_2 | var4_1) ^ 1221427136;
                    continue block29;
                }
lbl75:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -126114200;
                continue block29;
                case 34034523: {
                    if (var0 != dn.is((var2_4 | var3_3 ^ 2057661118) ^ (var3_3 ^ -128768527), (var1_2 | var3_3 ^ 2057661118) ^ ((var2_4 | var3_3 ^ 2057661118) ^ (var3_3 ^ -2078094559)))) {
                        var3_3 = (var1_2 | var4_1) ^ 1153993254;
                        continue block29;
                    }
                    ** GOTO lbl117
                }
lbl82:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -1936700592;
                continue block29;
lbl84:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 1223408066;
                continue block29;
lbl86:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 316021909;
                continue block29;
lbl88:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 290725853;
                continue block29;
                case -1722573990: {
                    if (var0 != dn.is((var2_4 | var3_3 ^ -504257857) ^ (var3_3 ^ 1661464051), (var1_2 | var3_3 ^ -504257857) ^ ((var2_4 | var3_3 ^ -504257857) ^ (var3_3 ^ -1155440613)))) {
                        var3_3 = (var1_2 | var4_1) ^ -1996615763;
                        continue block29;
                    }
                    ** GOTO lbl117
                }
                case -425365006: {
                    if (var0 == dn.is((var2_4 | var3_3 ^ -1643689961) ^ (var3_3 ^ 485558100), (var1_2 | var3_3 ^ -1643689961) ^ ((var2_4 | var3_3 ^ -1643689961) ^ (var3_3 ^ -1310128733)))) ** GOTO lbl117
                    var3_3 = (var1_2 | var4_1) ^ -1830253887;
                }
lbl98:
                // 3 sources

                default: {
                    continue block29;
                }
                {
                }
lbl101:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -50582866;
                continue block29;
                case -571027854: {
                    v0 = false;
lbl105:
                    // 2 sources

                    var2_4 ^= 434858549;
                    return v0;
                }
                case -273717720: {
                    var3_3 = (var1_2 | var4_1) ^ 1109080614;
                    continue block29;
                }
lbl110:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -1603117815;
                continue block29;
                case -1240416201: {
                    var3_3 = (var1_2 | var4_1) ^ -1891594100;
                    continue block29;
                }
                case 1257868402: {
                    if (var0 != dn.is((var2_4 | var3_3 ^ 844871063) ^ (var3_3 ^ -1330775335), (var1_2 | var3_3 ^ 844871063) ^ ((var2_4 | var3_3 ^ 844871063) ^ (var3_3 ^ 532007017)))) ** GOTO lbl119
lbl117:
                    // 11 sources

                    var3_3 = (var1_2 | var4_1) ^ -1413450873;
                    continue block29;
lbl119:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1143670146;
                    continue block29;
                }
                case -1237973451: 
            }
            var2_4 ^= var3_3 ^ -660746146;
            var3_3 = (var1_2 | var4_1) ^ 1739121327;
        }
    }
}

