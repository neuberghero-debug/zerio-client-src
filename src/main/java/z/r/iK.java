/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class iK {
    private float a;
    private float b;
    private float c;
    static final int a;
    private static final int[] a;
    private char a;
    private float d;
    static final int b;
    private float e;
    static final int c;
    public static final int f;
    private float f;
    private final String a;
    private float g;
    private int d;
    static final int e;
    private float h;
    private final List<Float> a;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private iK(String var1_1) {
        var5_2 = 1488188621;
        var2_3 = iK.f & 1488188621 ^ 1231667745;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -1856197395;
        var3_5 ^= 772115959;
        super();
        var4_4 = (var2_3 | var5_2) ^ -758849190;
        block10: while (true) {
            switch (var4_4) {
                case -984991806: {
                    var3_5 ^= var4_4 ^ 987203085;
                    var4_4 = (var2_3 | var5_2) ^ -1769425370;
                    continue block10;
                }
                case -814530357: {
                    this.a = '\u0000';
                    var4_4 = (var2_3 | var5_2) ^ -260807727;
                    continue block10;
                }
                case -1958799433: {
                    var3_5 ^= var4_4 ^ -653918814;
                    var4_4 = (var2_3 | var5_2) ^ -1630638159;
                    ** break;
                }
                case -952788644: {
                    this.a = (float)new ArrayList<E>();
                    var4_4 = (var2_3 | var5_2) ^ -1666072273;
                    ** break;
                }
                case -350280161: {
                    var3_5 ^= var4_4 ^ -498901712;
                    var4_4 = (var2_3 | var5_2) ^ -1959790302;
                    ** break;
                }
                case -1450207940: {
                    var3_5 ^= var4_4 ^ -770806376;
                    var4_4 = (var2_3 | var5_2) ^ -106025815;
                }
lbl33:
                // 5 sources

                default: {
                    continue block10;
                }
                case -1604986300: {
                    this.a = var1_1;
                    var4_4 = (var2_3 | var5_2) ^ -1293627150;
                    continue block10;
                }
                case -757854257: 
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static float[] parse(String var0) {
        block29: {
            block30: {
                break block30;
                {
                    var6_3 = (var4_2 | var7_1) ^ 53077167;
                    block22: while (true) {
                        switch (var6_3) {
                            case 1105559918: {
                                var2_6 = new float[var1_5.a.size()];
                                ** break;
                            }
                            case -793290554: {
                                var5_4 ^= var6_3 ^ 1000135484;
                                var6_3 = (var4_2 | var7_1) ^ 1560955099;
                                break;
                            }
lbl11:
                            // 1 sources

                            var5_4 ^= 26758875;
                            var3_7 = 0;
                            break block29;
                            case -522078536: {
                                var1_5.Pd();
                                continue block21;
                            }
                            case -1094575412: {
                                var5_4 ^= var6_3 ^ -1399180220;
                                var6_3 = (var4_2 | var7_1) ^ -66158835;
                                continue block22;
                            }
                        }
lbl21:
                        // 3 sources

                    }
                }
                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ -1777996559;
                    ** GOTO lbl54
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ 1042620256;
                    ** GOTO lbl54
                    break;
                }
            }
            var7_1 = -1664952797;
            var4_2 = iK.f & -1664952797 ^ -1519796639;
            var6_3 = 0;
            var5_4 = (var4_2 | var7_1) ^ -1230610683;
            var6_3 = (var4_2 | var7_1) ^ -142309321;
            block26: while (true) {
                switch (var6_3) {
                    default: {
                        continue block26;
                    }
                    case 1248818772: {
                        break;
                    }
                    case 1573324212: {
                        var5_4 ^= var6_3 ^ -1487047394;
                        var6_3 = (var4_2 | var7_1) ^ -1169874833;
                        continue block26;
                    }
                    case 128900620: {
                        ** break;
lbl46:
                        // 1 sources

                        var1_5 = new iK(var0);
                        var6_3 = (var4_2 | var7_1) ^ 1834788517;
                        ** GOTO lbl21
                    }
                }
                var6_3 = (var4_2 | var7_1) ^ -533922857;
            }
        }
        block27: while (true) {
            var6_3 = (var4_2 | var7_1) ^ 480675640;
lbl54:
            // 3 sources

            block28: while (true) {
                switch (var6_3) {
                    default: {
                        continue block28;
                    }
                    case -1508629955: {
                        var5_4 ^= var6_3 ^ 760851292;
                        var6_3 = (var4_2 | var7_1) ^ -2066049454;
                        continue block28;
                    }
                    case 959539249: {
                        var2_6[var3_7] = ((Float)var1_5.a.get(var3_7)).floatValue();
                        ** break;
                    }
                    case -1625952466: {
                        ++var3_7;
                        continue block27;
                    }
                    case -1588758181: {
                        var5_4 ^= var6_3 ^ 345292729;
                        var6_3 = (var4_2 | var7_1) ^ -2135004266;
                        continue block28;
                    }
                    case 1029019125: {
                        if (var3_7 >= var2_6.length) ** continue;
                        var6_3 = (var4_2 | var7_1) ^ 469752926;
                        continue block28;
                    }
                    case -593372042: {
                        var5_4 ^= var6_3 ^ -499805195;
                        var6_3 = (var4_2 | var7_1) ^ 587075917;
                        continue block28;
                    }
                    case 737022610: {
                        var5_4 ^= var6_3 ^ -959974231;
                        ** continue;
                    }
lbl83:
                    // 1 sources

                    var6_3 = (var4_2 | var7_1) ^ 1632248341;
                    continue block28;
                    case -2083593981: 
                }
                break;
            }
            break;
        }
        return var2_6;
    }

    private static int Pc(int n2, int n3) {
        int n4 = 1079998960;
        int n5 = -384893903;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x45D36E63)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xE95F7722;
        n6 ^= (n5 | n4) ^ 0xE95F95D3;
        n6 -= (n5 | n4) ^ 0xE95FBC16;
        n6 ^= (n5 | n4) ^ 0xE95F11D1;
        n6 += (n5 | n4) ^ 0xE95FE168;
        n6 ^= (n5 | n4) ^ 0xE95FB3D4;
        n6 ^= (n5 | n4) ^ 0xE95F9D2C;
        return n6 -= (n5 | n4) ^ 0xE95F5BCE;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void Pd() {
        block56: {
            block57: {
                block58: {
                    break block58;
                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ 1353499129;
                        break block56;
                        break;
                    }
                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ 1999749552;
                        break block57;
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ -2057467452;
                        break block56;
lbl10:
                        // 2 sources

                        while (true) {
                            var5_3 = (var3_2 | var6_1) ^ 379722724;
                            break block57;
lbl13:
                            // 3 sources

                            while (true) {
                                var5_3 = (var3_2 | var6_1) ^ -33827510;
                                break block56;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var5_3 = (var3_2 | var6_1) ^ 1455459635;
                                break block57;
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                var5_3 = (var3_2 | var6_1) ^ -948958841;
                                break block56;
                                break;
                            }
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            var5_3 = (var3_2 | var6_1) ^ 329694405;
                            break block56;
                            break;
                        }
                        break;
                    }
                }
                var6_1 = 743630534;
                var3_2 = iK.f & 743630534 ^ -1670244768;
                var5_3 = 0;
                var4_6 = (var3_2 | var6_1) ^ -22641006;
                var5_3 = (var3_2 | var6_1) ^ 1206460850;
                block51: while (true) {
                    switch (var5_3) {
                        case 1952603751: {
                            var1_4 = 0;
                            ** GOTO lbl10
                        }
                        case -73672876: {
                            break;
                        }
                        case -1601414321: {
                            var4_6 ^= var5_3 ^ -744865508;
                            ** break;
lbl41:
                            // 1 sources

                            var5_3 = (var3_2 | var6_1) ^ -938432383;
                        }
                        default: {
                            continue block51;
                        }
                    }
                    var5_3 = (var3_2 | var6_1) ^ 486452649;
                }
            }
            block52: while (true) {
                block59: {
                    switch (var5_3) {
                        case -917687376: {
                            var4_6 ^= var5_3 ^ -2024237983;
                            ** break;
                        }
                        case 823220567: {
                            this.Pj();
                            var5_3 = (var3_2 | var6_1) ^ 863616604;
                            continue block52;
                        }
                        case -357401643: {
                            if (this.d < this.a.length()) ** continue;
                            break block59;
                        }
                        case -1429148414: {
                            var4_6 ^= var5_3 ^ 1765428580;
                            var5_3 = (var3_2 | var6_1) ^ -1922846799;
                            break;
                        }
lbl63:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ -827624893;
                        break;
                        case -935339479: {
                            var2_5 = this.a.charAt(this.d);
                            ** break;
                        }
                        case -1895085894: {
                            var4_6 ^= var5_3 ^ 408552850;
                            ** continue;
                        }
                        case 1926857893: {
                            return;
                        }
lbl73:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ 1932823129;
                        break block52;
                        case -884787370: {
                            var4_6 ^= var5_3 ^ 1476422338;
                            var5_3 = (var3_2 | var6_1) ^ 1951214799;
                        }
                    }
                    continue;
                }
                var5_3 = (var3_2 | var6_1) ^ 1967113558;
            }
        }
        block53: while (true) {
            block60: {
                switch (var5_3) {
                    case -1184679555: {
                        return;
                    }
                    case 2063794017: {
                        var4_6 ^= var5_3 ^ 848922105;
                        var5_3 = (var3_2 | var6_1) ^ -641205420;
                        continue block53;
                    }
                    case 108854509: {
                        var5_3 = (var3_2 | var6_1) ^ -1615185753;
                        continue block53;
                    }
                    case -1345041885: {
                        var5_3 = (var3_2 | var6_1) ^ 1752197694;
                        continue block53;
                    }
                    case -1297324824: {
                        if (var1_4 == iK.Pc((var4_6 | var5_3 ^ -1627487698) ^ (var5_3 ^ -218951255), (var3_2 | var5_3 ^ -1627487698) ^ ((var4_6 | var5_3 ^ -1627487698) ^ (var5_3 ^ -131225762)))) {
                            var5_3 = (var3_2 | var6_1) ^ -112476381;
                            continue block53;
                        }
                        ** GOTO lbl168
                    }
                    case 1161382341: {
                        ** GOTO lbl172
                    }
                    case 1518401400: {
                        var1_4 = iK.Pc((var4_6 | var5_3 ^ 1993478590) ^ (var5_3 ^ 450855480), (var3_2 | var5_3 ^ 1993478590) ^ ((var4_6 | var5_3 ^ 1993478590) ^ (var5_3 ^ 1328389491)));
                        ** GOTO lbl168
                    }
                    case -738026280: {
                        if (var1_4 != iK.Pc((var4_6 | var5_3 ^ -128943586) ^ (var5_3 ^ -696911731), (var3_2 | var5_3 ^ -128943586) ^ ((var4_6 | var5_3 ^ -128943586) ^ (var5_3 ^ -1504090229)))) break block60;
                        ** GOTO lbl13
                    }
                    case 1099506604: {
                        var4_6 ^= var5_3 ^ -1371173685;
                        var5_3 = (var3_2 | var6_1) ^ 85053339;
                        continue block53;
                    }
                    case 175251699: {
                        this.Pe((char)var1_4);
                        ** GOTO lbl174
                    }
                    case 1441721136: {
                        var4_6 ^= var5_3 ^ 2138554533;
                        ** GOTO lbl157
                    }
                    case -344891663: {
                        var4_6 ^= var5_3 ^ -1875237825;
                        ** GOTO lbl170
                    }
                    case -782979373: {
                        var4_6 ^= var5_3 ^ 647901168;
                        ** GOTO lbl148
                    }
                    case -139883671: {
                        var4_6 ^= var5_3 ^ 819355248;
                        ** GOTO lbl150
                    }
                    case -332339687: {
                        if (var1_4 == iK.Pc((var4_6 | var5_3 ^ -1067319073) ^ (var5_3 ^ 761959254), (var3_2 | var5_3 ^ -1067319073) ^ ((var4_6 | var5_3 ^ -1067319073) ^ (var5_3 ^ 1446868839)))) ** continue;
                        var5_3 = (var3_2 | var6_1) ^ -1383246687;
                    }
                    default: {
                        continue block53;
                    }
                    case 1385954174: {
                        if (Character.isLetter((char)var2_5)) {
                            ** continue;
                        }
                        ** GOTO lbl146
                    }
                    case -5751202: {
                        ** continue;
                    }
                    case -817464129: {
                        var4_6 ^= var5_3 ^ -526456434;
                        ** GOTO lbl152
                    }
                    case 1474467176: {
                        var1_4 = iK.Pc((var4_6 | var5_3 ^ 2075161518) ^ (var5_3 ^ 398319662), (var3_2 | var5_3 ^ 2075161518) ^ ((var4_6 | var5_3 ^ 2075161518) ^ (var5_3 ^ 1008794318)));
                        ** GOTO lbl168
                    }
lbl146:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ 1459857431;
                    continue block53;
lbl148:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ -1241459179;
                    continue block53;
lbl150:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ 1346507007;
                    continue block53;
lbl152:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ -286716520;
                    continue block53;
                    case 590511039: {
                        if (var1_4 == 0) ** GOTO lbl13
                        ** GOTO lbl184
                    }
lbl157:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ 1138411704;
                    continue block53;
                    case 600362561: {
                        if (var1_4 != iK.Pc((var4_6 | var5_3 ^ 261761159) ^ (var5_3 ^ 566209045), (var3_2 | var5_3 ^ 261761159) ^ ((var4_6 | var5_3 ^ 261761159) ^ (var5_3 ^ -1328215902)))) ** break;
                        ** continue;
                        ** continue;
                    }
                    case -621290345: {
                        var4_6 ^= var5_3 ^ -1507907246;
                        ** continue;
                    }
                    case 959414050: {
                        ++this.d;
lbl168:
                        // 4 sources

                        var5_3 = (var3_2 | var6_1) ^ 1831229493;
                        continue block53;
                    }
lbl170:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ -1623159463;
                    continue block53;
lbl172:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ -420347490;
                    continue block53;
lbl174:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ -375644714;
                    continue block53;
                    case 1706364338: {
                        var1_4 = var2_5;
                        var5_3 = (var3_2 | var6_1) ^ 1720003185;
                        continue block53;
                    }
                    case 301965895: {
                        var4_6 ^= var5_3 ^ -1732738355;
                        var5_3 = (var3_2 | var6_1) ^ 249467406;
                        continue block53;
                    }
lbl184:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ -1173485045;
                    continue block53;
                    case -320981217: 
                }
                var4_6 ^= var5_3 ^ 1704531861;
                var5_3 = (var3_2 | var6_1) ^ -342858866;
                continue;
            }
            var5_3 = (var3_2 | var6_1) ^ 1272675727;
        }
    }

    /*
     * Exception decompiling
     */
    private void Pe(char var1_1) {
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
    private void Pf(float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        var10_7 = -172521630;
        var7_8 = iK.f & -172521630 ^ 936103594;
        var9_9 = 0;
        var8_10 = (var7_8 | var10_7) ^ 376694761;
        var9_9 = (var7_8 | var10_7) ^ 1655755619;
        if (true) ** GOTO lbl9
        block11: while (true) {
            var9_9 = (var7_8 | var10_7) ^ -1263290005;
lbl9:
            // 2 sources

            block12: while (true) {
                switch (var9_9) {
                    case -224742742: {
                        var8_10 ^= var9_9 ^ -919413095;
                        var9_9 = (var7_8 | var10_7) ^ 599211982;
                        continue block12;
                    }
                    case 1129084545: {
                        var8_10 ^= var9_9 ^ -1371523016;
                        var9_9 = (var7_8 | var10_7) ^ 184684472;
                        continue block12;
                    }
                    case 1658856417: {
                        v0 = new float[iK.Pc((var8_10 | var9_9 ^ -1755863933) ^ (var9_9 ^ 870004490), (var7_8 | var9_9 ^ -1755863933) ^ ((var8_10 | var9_9 ^ -1755863933) ^ (var9_9 ^ 1481950547)))];
                        v0[0] = var1_1;
                        v0[1] = var2_2;
                        v0[2] = var3_3;
                        v0[3] = var4_4;
                        v0[4] = var5_5;
                        v0[5] = var6_6;
                        this.Pm(2, v0);
                        ** break;
                    }
                    case 53603125: {
                        this.c = var5_5;
                        this.b = var6_6;
                        continue block11;
                    }
                    case -733417436: {
                        this.a = var3_3;
                        this.h = var4_4;
                        var9_9 = (var7_8 | var10_7) ^ -283298045;
                        ** GOTO lbl46
                    }
lbl38:
                    // 1 sources

                    var9_9 = (var7_8 | var10_7) ^ 90537280;
                    ** GOTO lbl46
                    case -1789977463: {
                        var9_9 = (var7_8 | var10_7) ^ -2087013541;
                        ** GOTO lbl46
                    }
                    case 1952808113: {
                        var8_10 ^= var9_9 ^ -1722034719;
                        var9_9 = (var7_8 | var10_7) ^ -1793070069;
                    }
lbl46:
                    // 5 sources

                    default: {
                        continue block12;
                    }
                    case 417528041: {
                        var8_10 ^= var9_9 ^ -2001468275;
                        var9_9 = (var7_8 | var10_7) ^ -187816737;
                        continue block12;
                    }
                    case -50479022: 
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
    private void Pg(float var1_1, float var2_2, float var3_3, float var4_4) {
        block23: {
            break block23;
lbl1:
            // 1 sources

            while (true) {
                var11_7 = (var9_6 | var12_5) ^ 159149615;
                ** GOTO lbl44
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var11_7 = (var9_6 | var12_5) ^ 910154409;
                ** GOTO lbl44
lbl7:
                // 1 sources

                while (true) {
                    var11_7 = (var9_6 | var12_5) ^ 717596938;
                    ** GOTO lbl44
                    break;
                }
                break;
            }
        }
        var12_5 = -1799709934;
        var9_6 = iK.f & -1799709934 ^ -1732727729;
        var11_7 = 0;
        var10_12 = (var9_6 | var12_5) ^ 1100686305;
        var11_7 = (var9_6 | var12_5) ^ 571507123;
        block18: while (true) {
            switch (var11_7) {
                default: {
                    continue block18;
                }
                case 1046668452: {
                    var5_8 = this.c + 0.6666667f * (var1_1 - this.c);
                    var6_9 = this.b + 0.6666667f * (var2_2 - this.b);
                    var10_12 ^= 771949655;
                    var7_10 = var3_3 + 0.6666667f * (var1_1 - var3_3);
                    var8_11 = var4_4 + 0.6666667f * (var2_2 - var4_4);
                    var11_7 = (var9_6 | var12_5) ^ -930963791;
                    ** GOTO lbl-1000
                }
                case -684763844: {
                    var10_12 ^= var11_7 ^ 79558013;
                    break;
                }
                case -1096139028: {
                    var11_7 = (var9_6 | var12_5) ^ 1268116067;
                    continue block18;
                }
            }
            var11_7 = (var9_6 | var12_5) ^ -1562878981;
        }
lbl36:
        // 1 sources

        while (true) {
            var11_7 = (var9_6 | var12_5) ^ 1923608771;
            if (true) ** GOTO lbl44
            break;
        }
        while (true) {
            var11_7 = (var9_6 | var12_5) ^ -1966626000;
            if (true) ** GOTO lbl44
            block21: while (true) {
                var11_7 = (var9_6 | var12_5) ^ 1452135633;
lbl44:
                // 6 sources

                block22: while (true) {
                    switch (var11_7) lbl-1000:
                    // 2 sources

                    {
                        default: {
                            continue block22;
                        }
                        case -902337650: {
                            var10_12 ^= var11_7 ^ 1927111349;
                            var11_7 = (var9_6 | var12_5) ^ 886166462;
                            continue block22;
                        }
                        case 1412964846: {
                            var10_12 ^= var11_7 ^ -2126118143;
                            ** continue;
                        }
                        case -1434098186: {
                            var10_12 ^= var11_7 ^ -541903950;
                            ** continue;
                        }
                        case -1782132368: {
                            this.d = var1_1;
                            this.e = var2_2;
                            ** continue;
                        }
                        case 377295983: {
                            this.c = var3_3;
                            this.b = var4_4;
                            continue block21;
                        }
                        case -1469354783: {
                            return;
                        }
                        case -300068964: {
                            v0 = new float[iK.Pc((var10_12 | var11_7 ^ 2057819278) ^ (var11_7 ^ -1217444014), (var9_6 | var11_7 ^ 2057819278) ^ ((var10_12 | var11_7 ^ 2057819278) ^ (var11_7 ^ -1468250678)))];
                            v0[0] = var5_8;
                            v0[1] = var6_9;
                            v0[2] = var7_10;
                            v0[3] = var8_11;
                            v0[4] = var3_3;
                            v0[5] = var4_4;
                            this.Pm(2, v0);
                            ** continue;
                        }
                        case -1233185195: 
                    }
                    break;
                }
                break;
            }
            var10_12 ^= var11_7 ^ 1965748709;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void Ph(float var1_1, float var2_2, float var3_3, boolean var4_4, boolean var5_5, float var6_6, float var7_7) {
        block147: {
            block150: {
                block148: {
                    block152: {
                        block151: {
                            block149: {
                                var87_8 = -1440953781;
                                var84_9 = iK.f & -1440953781 ^ 1755053988;
                                var86_10 = 0;
                                var85_18 = (var84_9 | var87_8) ^ 1093264419;
                                var86_10 = (var84_9 | var87_8) ^ 1033456929;
                                break block148;
lbl7:
                                // 1 sources

                                while (true) {
                                    var86_10 = (var84_9 | var87_8) ^ 630066646;
                                    break block147;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var86_10 = (var84_9 | var87_8) ^ 391676005;
                                    ** GOTO lbl439
                                    break;
                                }
                                while (true) {
                                    var86_10 = (var84_9 | var87_8) ^ -1050124428;
                                    break block148;
lbl16:
                                    // 1 sources

                                    while (true) {
                                        var22_19 = var18_16 * var18_16 / (double)(var1_1 * var1_1) + var20_17 * var20_17 / (double)(var2_2 * var2_2);
                                        var86_10 = (var84_9 | var87_8) ^ -1764895066;
                                        break block147;
                                        break;
                                    }
                                    break;
                                }
lbl20:
                                // 1 sources

                                while (true) {
                                    var49_33 = 1.3333333333333333 * Math.tan(var47_32 / 4.0);
                                    var85_18 ^= 1226411758;
                                    var51_34 = this.c;
                                    var53_35 = this.b;
                                    var85_18 ^= -1817261887;
                                    var55_36 = var42_29;
                                    var85_18 ^= -31449712;
                                    var57_37 = 0;
                                    break block149;
                                    break;
                                }
lbl30:
                                // 1 sources

                                while (true) {
                                    var86_10 = (var84_9 | var87_8) ^ 685585366;
                                    ** GOTO lbl235
                                    break;
                                }
                            }
lbl34:
                            // 2 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ -469441345;
                                break block150;
                                break;
                            }
lbl37:
                            // 1 sources

                            while (true) {
                                var14_14 = (double)(this.c - var6_6) / 2.0;
                                var16_15 = (double)(this.b - var7_7) / 2.0;
                                var85_18 ^= 566591157;
                                var18_16 = var10_12 * var14_14 + var12_13 * var16_15;
                                var85_18 ^= -771702302;
                                var20_17 = -var12_13 * var14_14 + var10_12 * var16_15;
                                var85_18 ^= 534209381;
                                ** continue;
                                break;
                            }
lbl46:
                            // 1 sources

                            while (true) {
                                var82_48 = (double)(-var1_1) * (var12_13 * var66_42) + (double)var2_2 * (var10_12 * var64_41);
                                var86_10 = (var84_9 | var87_8) ^ 1202863138;
                                ** GOTO lbl235
                                break;
                            }
lbl50:
                            // 1 sources

                            while (true) {
                                var85_18 ^= -429351595;
                                var44_30 = iK.Pi((var18_16 - var34_25) / (double)var1_1, (var20_17 - var36_26) / (double)var2_2, (-var18_16 - var34_25) / (double)var1_1, (-var20_17 - var36_26) / (double)var2_2);
                                var86_10 = (var84_9 | var87_8) ^ -160374827;
                                ** GOTO lbl439
                                break;
                            }
lbl55:
                            // 1 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ -649226583;
                                ** GOTO lbl235
                                break;
                            }
lbl58:
                            // 1 sources

                            while (true) {
                                var78_46 = (double)(-var1_1) * (var12_13 * var62_40) + (double)var2_2 * (var10_12 * var60_39);
                                var85_18 ^= -1239571417;
                                var80_47 = (double)(-var1_1) * (var10_12 * var66_42) - (double)var2_2 * (var12_13 * var64_41);
                                var85_18 ^= -261520192;
                                ** continue;
                                break;
                            }
lbl64:
                            // 1 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ -1486084610;
                                ** GOTO lbl439
                                break;
                            }
lbl-1000:
                            // 2 sources

                            {
                                switch (var86_10) {
                                    case -725136617: {
                                        var85_18 ^= var86_10 ^ 197496888;
                                        ** break;
                                    }
                                    case 1333793121: {
                                        var2_2 *= (float)var24_20;
                                        break block151;
                                    }
                                    case -14866401: {
                                        var85_18 ^= var86_10 ^ -1876173436;
                                        var86_10 = (var84_9 | var87_8) ^ -1524633970;
                                        break;
                                    }
lbl78:
                                    // 1 sources

                                    var86_10 = (var84_9 | var87_8) ^ 332912628;
                                    continue block105;
                                    case -112711653: {
                                        var1_1 *= (float)var24_20;
                                        var86_10 = (var84_9 | var87_8) ^ 360896496;
                                    }
                                }
lbl83:
                                // 4 sources

                                ** while (true)
                            }
lbl84:
                            // 2 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ 2077794554;
                                break block152;
                                break;
                            }
lbl87:
                            // 1 sources

                            block108: while (true) {
                                block6 : switch (var86_10) {
                                    case -1220360895: {
                                        var85_18 ^= var86_10 ^ -777832605;
                                        ** break;
                                    }
                                    case 2070554411: {
                                        ** GOTO lbl101
                                    }
                                    case 150067143: {
                                        ** break;
                                    }
                                    case 1118518099: {
                                        var85_18 ^= var86_10 ^ -923378833;
                                        ** GOTO lbl105
                                    }
lbl99:
                                    // 2 sources

                                    var86_10 = (var84_9 | var87_8) ^ 662143044;
                                    continue block108;
lbl101:
                                    // 1 sources

                                    var86_10 = (var84_9 | var87_8) ^ -285283568;
                                    continue block108;
                                    case -216873804: {
                                        var85_18 ^= var86_10 ^ -1174318335;
lbl105:
                                        // 2 sources

                                        var86_10 = (var84_9 | var87_8) ^ -1846159164;
                                        break;
                                    }
                                    case 73471231: {
                                        var32_24 = Math.sqrt(Math.max(0.0, var28_22 / var30_23));
                                        var86_10 = (var84_9 | var87_8) ^ 1400555837;
                                        break block152;
                                    }
                                    case -840400981: {
                                        switch (var85_18) {
                                            case 1701100061: {
                                                var86_10 = (var84_9 | var87_8) ^ 1574779566;
                                                break block6;
                                            }
                                            default: {
                                                var86_10 = (var84_9 | var87_8) ^ 428686171;
                                                break block6;
                                            }
                                            case -893614870: {
                                                var86_10 = (var84_9 | var87_8) ^ -1472936772;
                                            }
                                        }
                                    }
                                }
                                continue;
                                break;
                            }
lbl122:
                            // 1 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ -2113126584;
                                ** GOTO lbl439
lbl125:
                                // 1 sources

                                while (true) {
                                    var86_10 = (var84_9 | var87_8) ^ -531259954;
                                    ** GOTO lbl439
                                    break;
                                }
                                break;
                            }
lbl128:
                            // 1 sources

                            while (true) {
                                var85_18 ^= -2015394699;
                                var85_18 ^= 1447321602;
                                var72_43 = var38_27 + (double)var1_1 * (var10_12 * var64_41) - (double)var2_2 * (var12_13 * var66_42);
                                var85_18 ^= 1062161827;
                                var74_44 = var40_28 + (double)var1_1 * (var12_13 * var64_41) + (double)var2_2 * (var10_12 * var66_42);
                                var85_18 ^= -1652790603;
                                var76_45 = (double)(-var1_1) * (var10_12 * var62_40) - (double)var2_2 * (var12_13 * var60_39);
                                var85_18 ^= -1164170328;
                                ** continue;
                                break;
                            }
lbl138:
                            // 1 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ -1654008519;
                                break block148;
                                break;
                            }
lbl141:
                            // 1 sources

                            while (true) {
                                var85_18 ^= -2008966925;
                                var36_26 = -var32_24 * (double)var2_2 * var18_16 / (double)var1_1;
                                var85_18 ^= 629157650;
                                var38_27 = var10_12 * var34_25 - var12_13 * var36_26 + (double)(this.c + var6_6) / 2.0;
                                var85_18 ^= 663428800;
                                var40_28 = var12_13 * var34_25 + var10_12 * var36_26 + (double)(this.b + var7_7) / 2.0;
                                var85_18 ^= -729059700;
                                var42_29 = iK.Pi(1.0, 0.0, (var18_16 - var34_25) / (double)var1_1, (var20_17 - var36_26) / (double)var2_2);
                                ** continue;
                                break;
                            }
lbl151:
                            // 2 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ 1520027537;
                                break block148;
                                break;
                            }
                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ -565916803;
                                break block150;
                                break;
                            }
lbl157:
                            // 1 sources

                            while (true) {
                                var47_32 = var44_30 / (double)var46_31;
                                var85_18 ^= 1978272863;
                                ** continue;
                                break;
                            }
lbl161:
                            // 1 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ -1842110354;
                                ** GOTO lbl235
                                break;
                            }
lbl164:
                            // 1 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ 1046000888;
                                ** GOTO lbl83
                                break;
                            }
lbl167:
                            // 1 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ 83380762;
                                ** GOTO lbl235
                                break;
                            }
lbl170:
                            // 4 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ 754006846;
                                ** GOTO lbl439
lbl173:
                                // 1 sources

                                while (true) {
                                    var86_10 = (var84_9 | var87_8) ^ 540252147;
                                    ** GOTO lbl439
                                    break;
                                }
                                break;
                            }
lbl176:
                            // 1 sources

                            while (true) {
                                var85_18 ^= -1096961819;
                                var30_23 = var24_20 * var20_17 * var20_17 + var26_21 * var18_16 * var18_16;
                                var86_10 = (var84_9 | var87_8) ^ -496097240;
                                ** continue;
                                break;
                            }
lbl181:
                            // 1 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ 979907111;
                                if (true) ** GOTO lbl235
                                break;
                            }
lbl184:
                            // 1 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ -530141465;
                                break block148;
                                break;
                            }
lbl187:
                            // 1 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ -133061174;
                                break block150;
                                break;
                            }
lbl190:
                            // 1 sources

                            while (true) {
                                var86_10 = (var84_9 | var87_8) ^ 1900813430;
                                break block148;
                                break;
                            }
                        }
lbl194:
                        // 2 sources

                        while (true) {
                            var86_10 = (var84_9 | var87_8) ^ 248747992;
                            break block147;
                            break;
                        }
lbl197:
                        // 1 sources

                        while (true) {
                            var86_10 = (var84_9 | var87_8) ^ -1731465190;
                            break block152;
                            break;
                        }
lbl200:
                        // 1 sources

                        while (true) {
                            var10_12 = Math.cos(var8_11);
                            var12_13 = Math.sin(var8_11);
                            var85_18 ^= 1776532762;
                            ** continue;
                            break;
                        }
lbl205:
                        // 1 sources

                        while (true) {
                            var86_10 = (var84_9 | var87_8) ^ -1079315418;
                            break block148;
                            break;
                        }
lbl208:
                        // 1 sources

                        while (true) {
                            var86_10 = (var84_9 | var87_8) ^ -1018511152;
                            if (true) ** GOTO lbl439
                            break;
                        }
lbl211:
                        // 1 sources

                        while (true) {
                            var64_41 = Math.cos(var58_38);
                            var66_42 = Math.sin(var58_38);
                            var85_18 ^= -990060371;
                            ** continue;
                            break;
                        }
lbl216:
                        // 1 sources

                        while (true) {
                            var28_22 = var24_20 * var26_21 - var24_20 * var20_17 * var20_17 - var26_21 * var18_16 * var18_16;
                            ** continue;
                            break;
                        }
lbl219:
                        // 1 sources

                        while (true) {
                            var60_39 = Math.cos(var55_36);
                            var62_40 = Math.sin(var55_36);
                            var85_18 ^= 1500818720;
                            ** continue;
                            break;
                        }
lbl224:
                        // 1 sources

                        while (true) {
                            var86_10 = (var84_9 | var87_8) ^ -25071333;
                            break block148;
                            break;
                        }
lbl227:
                        // 1 sources

                        while (true) {
                            var85_18 ^= 848998619;
                            ** continue;
                            break;
                        }
lbl230:
                        // 1 sources

                        while (true) {
                            var86_10 = (var84_9 | var87_8) ^ -13344111;
                            break block147;
                            break;
                        }
                        block138: while (true) {
                            var86_10 = (var84_9 | var87_8) ^ 861080196;
lbl235:
                            // 7 sources

                            block139: while (true) {
                                switch (var86_10) {
                                    default: {
                                        continue block139;
                                    }
                                    case -295193099: {
                                        var85_18 ^= var86_10 ^ 986132035;
                                        continue block138;
                                    }
                                    case -1035809735: {
                                        var85_18 ^= var86_10 ^ 144690446;
                                        ** continue;
                                    }
                                    case -388914001: {
                                        v0 = new float[iK.Pc((var85_18 | var86_10 ^ 1120759524) ^ (var86_10 ^ -1434190598), (var84_9 | var86_10 ^ 1120759524) ^ ((var85_18 | var86_10 ^ 1120759524) ^ (var86_10 ^ -529069474)))];
                                        v0[0] = (float)(var51_34 + var49_33 * var76_45);
                                        v0[1] = (float)(var53_35 + var49_33 * var78_46);
                                        v0[2] = (float)(var72_43 - var49_33 * var80_47);
                                        v0[3] = (float)(var74_44 - var49_33 * var82_48);
                                        v0[4] = (float)var72_43;
                                        v0[5] = (float)var74_44;
                                        this.Pm(2, v0);
                                        var86_10 = (var84_9 | var87_8) ^ 856451270;
                                        continue block139;
                                    }
                                    case -640879253: {
                                        var55_36 = var58_38;
                                        ** continue;
                                    }
                                    case -789066296: {
                                        var53_35 = var74_44;
                                        ** continue;
                                    }
                                    case -1389509683: {
                                        var85_18 ^= var86_10 ^ 233809831;
                                        break;
                                    }
                                    case 791615695: {
                                        var51_34 = var72_43;
                                        ** continue;
                                    }
                                    case 2024562561: {
                                        ++var57_37;
                                        ** continue;
                                    }
                                    case -644638935: {
                                        var85_18 ^= var86_10 ^ -1682561461;
                                        var86_10 = (var84_9 | var87_8) ^ -978262240;
                                        continue block139;
                                    }
                                    case 869427526: {
                                        var85_18 ^= var86_10 ^ 1585415268;
                                        ** continue;
                                    }
                                }
                                var86_10 = (var84_9 | var87_8) ^ 38689600;
                            }
                            break;
                        }
                    }
                    block140: while (true) {
                        switch (var86_10) {
                            default: {
                                continue block140;
                            }
                            case -1176160558: {
                                var85_18 ^= var86_10 ^ 1810662207;
                                var86_10 = (var84_9 | var87_8) ^ 1188120226;
                                continue block140;
                            }
                            case 155038291: {
                                var34_25 = var32_24 * (double)var1_1 * var20_17 / (double)var2_2;
                                ** continue;
                            }
                            case -1857593579: {
                                var85_18 ^= var86_10 ^ -710106198;
                                break;
                            }
                            case 1918111733: {
                                var86_10 = (var84_9 | var87_8) ^ 610663212;
                                continue block140;
                            }
                            case -1404126899: {
                                if (var4_4 != var5_5) ** GOTO lbl84
                                ** continue;
                            }
                            case -822475581: {
                                var32_24 = -var32_24;
                                ** continue;
                            }
                        }
                        var86_10 = (var84_9 | var87_8) ^ -475902532;
                    }
                }
                block141: while (true) {
                    switch (var86_10) {
                        case -633985304: {
                            var85_18 ^= var86_10 ^ -1337018957;
                            ** continue;
                        }
                        case -1021890238: {
                            var85_18 ^= var86_10 ^ -1963095593;
                            ** continue;
                        }
                        case -1680612455: {
                            var8_11 = Math.toRadians(var3_3);
                            var85_18 ^= -451328169;
                            ** continue;
                        }
                        case 2012621526: {
                            var1_1 = Math.abs(var1_1);
                            ** break;
                        }
                        case -709050987: {
                            var85_18 ^= var86_10 ^ 1173213051;
                            var86_10 = (var84_9 | var87_8) ^ 181100774;
                            continue block141;
                        }
                        case 2077653003: {
                            var85_18 ^= var86_10 ^ 1895256281;
                            ** GOTO lbl368
                        }
                        case 519506140: {
                            if (this.c != var6_6) ** GOTO lbl151
                            ** GOTO lbl370
                        }
                        case -1523240705: {
                            ** GOTO lbl360
                        }
                        case 968392359: {
                            var2_2 = Math.abs(var2_2);
                            var86_10 = (var84_9 | var87_8) ^ 816437511;
                            continue block141;
                        }
                        case 184111368: {
                            if (var1_1 == 0.0f) ** GOTO lbl354
                            ** GOTO lbl350
                        }
                        case 1489732393: {
                            if (this.b == var7_7) ** break;
                            ** continue;
                            ** GOTO lbl354
                        }
                        case -687426866: {
                            var86_10 = (var84_9 | var87_8) ^ 696831661;
                            continue block141;
                        }
lbl348:
                        // 1 sources

                        var86_10 = (var84_9 | var87_8) ^ -1857452060;
                        ** GOTO lbl355
lbl350:
                        // 1 sources

                        var86_10 = (var84_9 | var87_8) ^ 2013015791;
                        ** GOTO lbl355
                        case 552683650: {
                            if (var2_2 != 0.0f) ** continue;
lbl354:
                            // 3 sources

                            var86_10 = (var84_9 | var87_8) ^ 1059275386;
                        }
lbl355:
                        // 4 sources

                        default: {
                            continue block141;
                        }
                        case -531325175: {
                            this.Pm(1, new float[]{var6_6, var7_7});
                            ** continue;
                        }
lbl360:
                        // 1 sources

                        var86_10 = (var84_9 | var87_8) ^ -1303085882;
                        continue block141;
                        case 737648795: {
                            var86_10 = (var84_9 | var87_8) ^ -194447565;
                            continue block141;
                        }
                        case -1654402816: {
                            var86_10 = (var84_9 | var87_8) ^ -898713747;
                            continue block141;
                        }
lbl368:
                        // 1 sources

                        var86_10 = (var84_9 | var87_8) ^ -752385720;
                        continue block141;
lbl370:
                        // 1 sources

                        var86_10 = (var84_9 | var87_8) ^ 1336594192;
                        continue block141;
                        case -1341769602: {
                            var85_18 ^= var86_10 ^ -1071947432;
                            ** continue;
                        }
                        case 1429539785: {
                            var85_18 ^= var86_10 ^ -394834368;
                            ** continue;
                        }
                        case 337546996: 
                    }
                    break;
                }
                return;
lbl380:
                // 1 sources

                while (true) {
                    var85_18 ^= 1321367046;
                    ** continue;
                    break;
                }
            }
            block143: while (true) {
                switch (var86_10) {
                    default: {
                        continue block143;
                    }
                    case 245046096: {
                        var85_18 ^= var86_10 ^ 1673586421;
                        ** continue;
                    }
                    case 1692525584: {
                        var58_38 = var55_36 + var47_32;
                        var85_18 ^= -1742540071;
                        ** continue;
                    }
                    case 959091980: {
                        var85_18 ^= var86_10 ^ 1336720760;
                        ** break;
                    }
                    case 311319077: {
                        if (var57_37 >= var46_31) ** continue;
                        var86_10 = (var84_9 | var87_8) ^ -743085341;
                        continue block143;
                    }
                    case 886781074: {
                        var85_18 ^= var86_10 ^ 293102790;
                        ** GOTO lbl407
                    }
lbl405:
                    // 1 sources

                    var86_10 = (var84_9 | var87_8) ^ -1904337921;
                    continue block143;
lbl407:
                    // 1 sources

                    var86_10 = (var84_9 | var87_8) ^ 203574978;
                    continue block143;
                    case -423775955: 
                }
                break;
            }
            return;
        }
        block144: while (true) {
            switch (var86_10) {
                default: {
                    continue block144;
                }
                case -1577680824: {
                    var24_20 = (double)var1_1 * (double)var1_1;
                    var26_21 = (double)var2_2 * (double)var2_2;
                    ** continue;
                }
                case 363568510: {
                    var24_20 = Math.sqrt(var22_19);
                    ** continue;
                }
                case -464754633: {
                    var85_18 ^= var86_10 ^ 2056871215;
                    var86_10 = (var84_9 | var87_8) ^ 1265205159;
                    continue block144;
                }
                case -820907463: {
                    var85_18 ^= var86_10 ^ 2133187725;
                    ** continue;
                }
                case 2085759305: {
                    var85_18 ^= var86_10 ^ 1268005329;
                    var86_10 = (var84_9 | var87_8) ^ -562874348;
                    continue block144;
                }
                case 887932923: 
            }
            break;
        }
        ** while (!(var22_19 > 1.0))
lbl436:
        // 1 sources

        ** while (true)
        block145: while (true) {
            var86_10 = (var84_9 | var87_8) ^ -419952108;
lbl439:
            // 9 sources

            block146: while (true) {
                switch (var86_10) {
                    default: {
                        continue block146;
                    }
                    case -470654401: {
                        if (!var5_5) ** GOTO lbl170
                        ** continue;
                    }
                    case 181035553: {
                        var44_30 -= 6.283185307179586;
                        ** GOTO lbl170
                    }
                    case 701841215: {
                        var46_31 = (int)Math.ceil(Math.abs(var44_30) / 1.5707963267948966);
                        ** continue;
                    }
                    case 1754513575: {
                        var85_18 ^= var86_10 ^ 1556734608;
                        ** continue;
                    }
                    case 208139771: {
                        var85_18 ^= var86_10 ^ 943577036;
                        var86_10 = (var84_9 | var87_8) ^ 158178768;
                        continue block146;
                    }
                    case -894670820: {
                        ** break;
                    }
                    case 1307826705: {
                        var86_10 = (var84_9 | var87_8) ^ 811928672;
                        continue block146;
                    }
                    case -1765593904: {
                        if (var5_5) continue block145;
                        ** continue;
                    }
                    case -965819183: {
                        var85_18 ^= var86_10 ^ 184278831;
                        ** continue;
                    }
                    case 627215315: {
                        var44_30 += 6.283185307179586;
                        ** GOTO lbl170
                    }
                    case -37257334: {
                        var86_10 = (var84_9 | var87_8) ^ -805473220;
                        continue block146;
                    }
                    case -271469982: {
                        if (var44_30 < 0.0) ** break;
                        ** continue;
                        ** continue;
                    }
                    case -621087857: {
                        if (var44_30 > 0.0) ** break;
                        continue block145;
                        ** continue;
                    }
lbl484:
                    // 1 sources

                    var86_10 = (var84_9 | var87_8) ^ 89017741;
                    continue block146;
                    case 485433402: 
                }
                var85_18 ^= var86_10 ^ 1012043516;
                var86_10 = (var84_9 | var87_8) ^ 2086458175;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static double Pi(double var0, double var2_1, double var4_2, double var6_3) {
        var17_4 = 1183528523;
        var14_5 = iK.f & 1183528523 ^ 890401615;
        var16_6 = 0;
        var15_7 = (var14_5 | var17_4) ^ -1395469078;
        var16_6 = (var14_5 | var17_4) ^ -770620810;
        if (true) ** GOTO lbl49
lbl7:
        // 1 sources

        while (true) {
            block18: {
                var12_10 = Math.acos(Math.max(-1.0, Math.min(1.0, var8_8 / var10_9)));
                var16_6 = (var14_5 | var17_4) ^ 836033195;
                block14: while (true) {
                    switch (var16_6) {
                        case 1179626980: {
                            var15_7 ^= var16_6 ^ -2093462616;
                            var16_6 = (var14_5 | var17_4) ^ -1510910623;
                            continue block14;
                        }
                        case -763038532: {
                            var15_7 ^= var16_6 ^ 781322475;
                            ** break;
                        }
                        case 395688028: {
                            var15_7 ^= var16_6 ^ -343718901;
                            ** GOTO lbl34
                        }
                        case -764796370: {
                            if (var0 * var6_3 - var2_1 * var4_2 < 0.0) ** GOTO lbl28
                            var16_6 = (var14_5 | var17_4) ^ 1611583251;
                            ** GOTO lbl29
                        }
lbl26:
                        // 1 sources

                        var16_6 = (var14_5 | var17_4) ^ -248438537;
                        ** GOTO lbl29
lbl28:
                        // 1 sources

                        var16_6 = (var14_5 | var17_4) ^ -1524661261;
lbl29:
                        // 4 sources

                        default: {
                            continue block14;
                        }
                        case -2035656776: {
                            v0 = -var12_10;
                            break block18;
                        }
lbl34:
                        // 1 sources

                        var16_6 = (var14_5 | var17_4) ^ 1574575194;
                        continue block14;
                        case 708930325: 
                    }
                    break;
                }
                v0 = var12_10;
            }
            var15_7 ^= 229448042;
            return v0;
        }
        while (true) {
            block19: {
                var16_6 = (var14_5 | var17_4) ^ 1251324562;
                break block19;
lbl44:
                // 1 sources

                while (true) {
                    var15_7 ^= -1712605376;
                    var10_9 = Math.sqrt((var0 * var0 + var2_1 * var2_1) * (var4_2 * var4_2 + var6_3 * var6_3));
                    var15_7 ^= -218154310;
                    ** continue;
                    break;
                }
            }
            block17: while (true) {
                switch (var16_6) {
                    default: {
                        continue block17;
                    }
                    case 1024378333: {
                        var8_8 = var0 * var4_2 + var2_1 * var6_3;
                        ** continue;
                    }
                    case -1517669063: {
                        var16_6 = (var14_5 | var17_4) ^ 507882698;
                        continue block17;
                    }
                    case 1776212869: 
                }
                break;
            }
            var15_7 ^= var16_6 ^ -1669322603;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void Pj() {
        block58: {
            block52: {
                block53: {
                    block54: {
                        block59: {
                            block55: {
                                block51: {
                                    block57: {
                                        block61: {
                                            block56: {
                                                block60: {
                                                    break block60;
lbl1:
                                                    // 1 sources

                                                    while (var1_4 != iK.Pc((var3_5 | var4_3 ^ -719933667) ^ (var4_3 ^ 2044526123), (var2_2 | var4_3 ^ -719933667) ^ ((var3_5 | var4_3 ^ -719933667) ^ (var4_3 ^ 1507208656)))) {
                                                        break block51;
lbl3:
                                                        // 2 sources

                                                        while (true) {
                                                            var4_3 = (var2_2 | var5_1) ^ -6108517;
                                                            break block52;
                                                            break;
                                                        }
                                                    }
                                                    break block54;
lbl-1000:
                                                    // 1 sources

                                                    {
                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl9:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_3 = (var2_2 | var5_1) ^ -1781595467;
                                                            break block52;
                                                            break;
                                                        }
lbl12:
                                                        // 1 sources

                                                        return;
lbl14:
                                                        // 1 sources

                                                        while (var1_4 != iK.Pc((var3_5 | var4_3 ^ -1922782448) ^ (var4_3 ^ 565115448), (var2_2 | var4_3 ^ -1922782448) ^ ((var3_5 | var4_3 ^ -1922782448) ^ (var4_3 ^ 1591172334)))) {
                                                            break block53;
                                                        }
                                                        break block54;
lbl17:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_3 = (var2_2 | var5_1) ^ -1464478809;
                                                            break block55;
                                                            break;
                                                        }
lbl20:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_3 = (var2_2 | var5_1) ^ -145834006;
                                                            break block55;
lbl23:
                                                            // 1 sources

                                                            while (true) {
                                                                var4_3 = (var2_2 | var5_1) ^ -1938674944;
                                                                break block55;
                                                                break;
                                                            }
lbl26:
                                                            // 1 sources

                                                            while (true) {
                                                                var4_3 = (var2_2 | var5_1) ^ -738185459;
                                                                break block55;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                }
                                                var5_1 = -24560373;
                                                var2_2 = iK.f & -24560373 ^ 1637329178;
                                                var4_3 = 0;
                                                break block61;
lbl34:
                                                // 1 sources

                                                while (true) {
                                                    var3_5 ^= var4_3 ^ 935541554;
                                                    break block56;
                                                    break;
                                                }
lbl37:
                                                // 1 sources

                                                while (var1_4 != iK.Pc((var3_5 | var4_3 ^ -641414146) ^ (var4_3 ^ 1963891415), (var2_2 | var4_3 ^ -641414146) ^ ((var3_5 | var4_3 ^ -641414146) ^ (var4_3 ^ -1457768146)))) {
                                                    break block57;
                                                }
                                                break block54;
lbl40:
                                                // 1 sources

                                                while (true) {
                                                    var3_5 ^= var4_3 ^ 756119571;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            var4_3 = (var2_2 | var5_1) ^ -1106408918;
                                            break block52;
lbl46:
                                            // 1 sources

                                            while (true) {
                                                var3_5 ^= var4_3 ^ 264478723;
                                                break block58;
                                                break;
                                            }
lbl49:
                                            // 1 sources

                                            while (true) {
                                                var4_3 = (var2_2 | var5_1) ^ 1037927820;
                                                break block52;
                                                break;
                                            }
lbl52:
                                            // 1 sources

                                            while (true) {
                                                if (this.d < this.a.length()) {
                                                    ** continue;
                                                }
                                                ** GOTO lbl77
                                                break;
                                            }
                                        }
                                        var3_5 = (var2_2 | var5_1) ^ 1954379829;
                                        var4_3 = (var2_2 | var5_1) ^ 1824523522;
                                        break block52;
                                    }
                                    var4_3 = (var2_2 | var5_1) ^ -550924544;
                                    break block55;
lbl63:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 68273479;
                                        break block55;
                                        break;
                                    }
lbl66:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ -1409437198;
                                        break block52;
                                        break;
                                    }
                                    var1_4 = this.a.charAt(this.d);
                                    var4_3 = (var2_2 | var5_1) ^ -926537875;
                                    break block55;
lbl72:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= var4_3 ^ -374947772;
                                        break block59;
                                        break;
                                    }
lbl75:
                                    // 1 sources

                                    while (var1_4 != iK.Pc((var3_5 | var4_3 ^ -161988614) ^ (var4_3 ^ 1519546065), (var2_2 | var4_3 ^ -161988614) ^ ((var3_5 | var4_3 ^ -161988614) ^ (var4_3 ^ -2038784057)))) {
                                        ** GOTO lbl117
lbl77:
                                        // 2 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ 1315693850;
                                            break block52;
                                            break;
                                        }
                                    }
                                    break block54;
                                }
                                var4_3 = (var2_2 | var5_1) ^ -1688441020;
                            }
lbl84:
                            // 6 sources

                            block46: while (true) {
                                switch (var4_3) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block46;
                                        }
                                        break;
                                    }
                                    case 1690554975: {
                                        ** continue;
                                    }
                                    case 731877910: {
                                        ** GOTO lbl1
                                    }
                                    case -1074123965: {
                                        ** GOTO lbl3
                                    }
                                    case 1944950299: {
                                        ** GOTO lbl14
                                    }
                                    case 659420917: {
                                        ** GOTO lbl37
                                    }
                                    case -74549156: {
                                        ** continue;
                                    }
                                    case 497810681: {
                                        ** continue;
                                    }
                                    case 818354056: {
                                        ** continue;
                                    }
                                    case 147915505: {
                                        ** GOTO lbl75
                                    }
                                    case 548811291: {
                                        ** continue;
                                    }
                                    case 2062981831: {
                                        break block46;
                                    }
lbl111:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= var4_3 ^ 1541973109;
                                        ** continue;
                                        break;
                                    }
                                    case 1462398652: {
                                        if (var1_4 != iK.Pc((var3_5 | var4_3 ^ -1448913993) ^ (var4_3 ^ 90768000), (var2_2 | var4_3 ^ -1448913993) ^ ((var3_5 | var4_3 ^ -1448913993) ^ (var4_3 ^ -348913811)))) ** continue;
                                        break;
                                    }
lbl117:
                                    // 1 sources

                                    var4_3 = (var2_2 | var5_1) ^ -499891742;
                                    ** continue;
                                }
                                break;
                            }
                            var4_3 = (var2_2 | var5_1) ^ -657306642;
                            ** GOTO lbl84
                        }
                        var4_3 = (var2_2 | var5_1) ^ 1893059189;
                        ** GOTO lbl84
                        {
                            case 928619126: {
                                var3_5 ^= var4_3 ^ -1025992237;
                                ** continue;
                            }
                        }
                    }
                    var4_3 = (var2_2 | var5_1) ^ -816272749;
                    ** GOTO lbl84
                }
                var4_3 = (var2_2 | var5_1) ^ -2056706084;
                ** GOTO lbl84
                {
                    ** case -1890945170:
                }
lbl134:
                // 1 sources

                ++this.d;
                ** while (true)
            }
            block49: while (true) {
                switch (var4_3) {
                    default: {
                        continue block49;
                    }
                    case 1100101425: {
                        ** continue;
                    }
                    case 1415711977: {
                        ** continue;
                    }
                    case -1035847529: {
                        ** continue;
                    }
                    case 4028288: {
                        ** continue;
                    }
                    case 1783676846: {
                        ** continue;
                    }
                    case -1822443495: {
                        ** continue;
                    }
                    ** case -1309386751:
lbl154:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        var4_3 = (var2_2 | var5_1) ^ 1080399448;
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
     * Exception decompiling
     */
    private float Pk() {
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
    private boolean Pl() {
        block31: {
            block28: {
                block30: {
                    block29: {
                        var5_1 = 1408245879;
                        var2_2 = iK.f & 1408245879 ^ 957525541;
                        var4_3 = 0;
                        ** GOTO lbl22
lbl5:
                        // 4 sources

                        block15: while (true) {
                            switch (var4_3) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    default: {
                                        continue block15;
                                    }
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -1615454429;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 1989507766;
                                    break block28;
lbl16:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= var4_3 ^ 1221513532;
                                        break block29;
                                        break;
                                    }
                                    break;
                                }
lbl19:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 310507505;
                                    break block28;
                                    break;
                                }
lbl22:
                                // 1 sources

                                var3_5 = (var2_2 | var5_1) ^ 637168398;
                                var4_3 = (var2_2 | var5_1) ^ 455433273;
                                break block28;
                                case 783328572: {
                                    var3_5 ^= var4_3 ^ -630779743;
                                    break block15;
                                }
lbl28:
                                // 2 sources

                                while (true) {
                                    var3_5 ^= 1137985772;
                                    return v0;
                                }
lbl31:
                                // 1 sources

                                while (true) {
                                    this.Pj();
                                    break block30;
                                    break;
                                }
lbl34:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 1430391627;
                                    ** continue;
                                    break;
                                }
                                case -465260204: {
                                    if (var1_4 == iK.Pc((var3_5 | var4_3 ^ -1212903133) ^ (var4_3 ^ -1287777624), (var2_2 | var4_3 ^ -1212903133) ^ ((var3_5 | var4_3 ^ -1212903133) ^ (var4_3 ^ 823591211)))) {
                                        ** continue;
                                    }
                                    break block31;
                                }
                            }
                            break;
                        }
                        var4_3 = (var2_2 | var5_1) ^ 371580739;
                        ** GOTO lbl5
                    }
                    var4_3 = (var2_2 | var5_1) ^ 27055132;
                    break block28;
lbl46:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                    {
                        case -825068620: {
                            var3_5 ^= var4_3 ^ 973456937;
                            break;
                        }
                        case -1215896335: {
                            var3_5 ^= var4_3 ^ -551677151;
                            ** continue;
                        }
                    }
                    var1_4 = this.a.charAt(this.d++);
                    var4_3 = (var2_2 | var5_1) ^ -864793978;
                    ** GOTO lbl5
                    {
                        case 1842835764: {
                            v0 = true;
                            ** GOTO lbl28
                        }
                    }
                    var4_3 = (var2_2 | var5_1) ^ 456082851;
                    ** GOTO lbl5
                    {
                        ** case 1625156564:
                    }
lbl63:
                    // 1 sources

                    v0 = false;
                    ** while (true)
lbl65:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_3 ^ -2036527423;
                        ** continue;
                        break;
                    }
                }
                var4_3 = (var2_2 | var5_1) ^ 1733330821;
            }
            block26: while (true) {
                switch (var4_3) {
                    default: {
                        continue block26;
                    }
                    case 480389618: {
                        ** continue;
                    }
                    case 1624765006: {
                        ** continue;
                    }
                    case 1769167238: {
                        ** continue;
                    }
                    case 2054060651: {
                        ** continue;
                    }
                    ** case 224908481:
lbl84:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        var4_3 = (var2_2 | var5_1) ^ -1256137277;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void Pm(int var1_1, float ... var2_2) {
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
}

