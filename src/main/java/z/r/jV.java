/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 *  net.minecraft.class_315
 *  net.minecraft.class_377
 *  net.minecraft.class_390
 *  net.minecraft.class_390$class_9241
 *  net.minecraft.class_9243
 *  net.minecraft.class_9243$class_9244
 */
package z.r;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_377;
import net.minecraft.class_390;
import net.minecraft.class_9243;
import z.m.fh;
import z.m.lo;
import z.m.mE;
import z.r.aE;
import z.r.fr;
import z.r.gF;
import z.r.gP;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class jV
extends gF {
    private final aE a;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String g;
    public static final int a;
    private static final /* synthetic */ String h;
    private List<class_390.class_9241> a;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private final List<fr> b;
    private static final fr[] a;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private class_390.class_9241 a;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private class_377 a;
    private static final /* synthetic */ String x;
    private static final /* synthetic */ String k;
    private final gP a;
    private static final /* synthetic */ String y;
    private static final /* synthetic */ String z;
    private fr a;
    private static final /* synthetic */ String A;
    private static final /* synthetic */ String B;
    private static final /* synthetic */ String C;
    private static final int[] a;
    private static final /* synthetic */ String D;
    private float a;
    private static final /* synthetic */ String E;
    private static final float b;

    /*
     * Exception decompiling
     */
    public jV() {
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
    @Override
    public void onEnable() {
        int n2 = 584580914;
        int n3 = a & 0x22D7FF32 ^ 0xA3F124F3;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x4C655990;
        n4 = (n3 | n2) ^ 0x32A7EDFA;
        block7: while (true) {
            switch (n4) {
                case 978377733: {
                    return;
                }
                case 1448551790: {
                    n5 ^= n4 ^ 0x79DF900C;
                    n4 = (n3 | n2) ^ 0x99A723F6;
                    continue block7;
                }
                case -44142691: {
                    n5 ^= n4 ^ 0xC29C57EF;
                    n4 = (n3 | n2) ^ 0x7DB944FE;
                    continue block7;
                }
                case -1857023479: {
                    n4 = (n3 | n2) ^ 0x5EA9906E;
                    break;
                }
                case -565265651: {
                    this.IT(class_310.method_1551());
                    n4 = (n3 | n2) ^ 0xF5A0DA9D;
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        block41: {
            var5_1 = -1384795750;
            var2_2 = jV.a & -1384795750 ^ 1783525575;
            var4_3 = 0;
            var3_4 = (var2_2 | var5_1) ^ 1140990731;
            var4_3 = (var2_2 | var5_1) ^ -1412063639;
            break block41;
lbl7:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 1835667298;
                break block41;
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ -1135737936;
                break block41;
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 583057773;
                ** GOTO lbl116
                break;
            }
        }
        block34: while (true) {
            block42: {
                block43: {
                    block44: {
                        switch (var4_3) {
                            case -404550122: {
                                var3_4 ^= var4_3 ^ -865963414;
                                var4_3 = (var2_2 | var5_1) ^ -1897948845;
                                continue block34;
                            }
                            case 1297327518: {
                                if (this.a != null) {
                                    var4_3 = (var2_2 | var5_1) ^ -863249041;
                                    continue block34;
                                }
                                ** GOTO lbl63
                            }
                            case 1395782255: {
                                var3_4 ^= var4_3 ^ 960688024;
                                var4_3 = (var2_2 | var5_1) ^ -1470023889;
                                continue block34;
                            }
                            case -1960414628: {
                                this.a = null;
                                ** break;
                            }
                            case 2144840944: {
                                var3_4 ^= var4_3 ^ 1130497355;
                                ** break;
                            }
                            case 1371996559: {
                                var3_4 ^= var4_3 ^ -1399433354;
                                break block42;
                            }
                            case 651299188: {
                                if (this.a == null) ** GOTO lbl111
                                var4_3 = (var2_2 | var5_1) ^ -996120048;
                                ** GOTO lbl75
                            }
                            case 1637902476: {
                                this.a = null;
                                break block43;
                            }
                            case 846142996: {
                                var3_4 ^= var4_3 ^ -1039606150;
                                ** GOTO lbl70
                            }
lbl51:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ -1868014289;
                            continue block34;
                            case 1193199344: {
                                this.a = 0.0f;
                                break block44;
                            }
                            case -1841183437: {
                                var3_4 ^= var4_3 ^ 366428095;
                                ** GOTO lbl77
                            }
lbl59:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ 1139843294;
                            continue block34;
                            case -1705511688: {
                                this.a.close();
lbl63:
                                // 2 sources

                                var4_3 = (var2_2 | var5_1) ^ 144506825;
                                ** GOTO lbl75
                            }
                            case 603204784: {
                                var4_3 = (var2_2 | var5_1) ^ 1965557031;
                                continue block34;
                            }
                            case -1140867897: {
                                return;
                            }
lbl70:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ -911345493;
                            continue block34;
                            case 1936178582: {
                                var3_4 ^= var4_3 ^ 1574487722;
                                var4_3 = (var2_2 | var5_1) ^ 14890991;
                            }
lbl75:
                            // 7 sources

                            default: {
                                continue block34;
                            }
lbl77:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ -1574153151;
                            continue block34;
                            case 736074703: {
                                var3_4 ^= var4_3 ^ -1579983714;
                                ** continue;
                            }
                            case -274938320: {
                                this.a = null;
                                var4_3 = (var2_2 | var5_1) ^ -395109464;
                                ** GOTO lbl75
                            }
                            case -1399893759: {
                                this.a = null;
                                ** continue;
                            }
                            case 118286967: {
                                var3_4 ^= var4_3 ^ -1637334326;
                                var4_3 = (var2_2 | var5_1) ^ 1683587971;
                                ** GOTO lbl75
                            }
                            case -2112487747: {
                                var1_5 = ((mE)this.a).zerio$getAllFonts();
                                ** continue;
                            }
                            case 1152020406: 
                        }
                        var4_3 = (var2_2 | var5_1) ^ -586092597;
                        continue;
                    }
                    var4_3 = (var2_2 | var5_1) ^ -1095176112;
                    continue;
                }
                var4_3 = (var2_2 | var5_1) ^ -1676129207;
                continue;
            }
            var4_3 = (var2_2 | var5_1) ^ 1417694488;
        }
lbl108:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ 674338346;
            if (true) ** GOTO lbl116
lbl111:
            // 4 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 2101228780;
                ** GOTO lbl75
                break;
            }
            break;
        }
        block38: while (true) {
            var4_3 = (var2_2 | var5_1) ^ 589583985;
lbl116:
            // 3 sources

            block39: while (true) {
                switch (var4_3) {
                    default: {
                        continue block39;
                    }
                    case -1887441127: {
                        if (var1_5.isEmpty()) ** GOTO lbl111
                        ** continue;
                    }
                    case -866408530: {
                        var4_3 = (var2_2 | var5_1) ^ -1256622653;
                        continue block39;
                    }
                    case -888726367: {
                        if (var1_5.get(0) != this.a) ** GOTO lbl111
                        continue block38;
                    }
                    case -951162891: {
                        var4_3 = (var2_2 | var5_1) ^ 611904894;
                        continue block39;
                    }
                    case 1516667932: {
                        this.a.method_2004((List)this.a, jV.IX(class_310.method_1551().field_1690));
                        ** continue;
                    }
                    case -843108174: 
                }
                var3_4 ^= var4_3 ^ 1202976739;
                var4_3 = (var2_2 | var5_1) ^ 1610620614;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onTick(class_310 var1_1) {
        var5_2 = -1669168904;
        var2_3 = jV.a & -1669168904 ^ 6741440;
        var4_4 = 0;
        ** GOTO lbl25
lbl5:
        // 1 sources

        while (true) {
            var3_5 ^= var4_4 ^ 917443695;
            ** GOTO lbl20
            break;
        }
lbl8:
        // 1 sources

        while (true) {
            var4_4 = (var2_3 | var5_2) ^ -1837452806;
            if (true) ** GOTO lbl13
            break;
        }
        block9: while (true) {
            var4_4 = (var2_3 | var5_2) ^ 1172981598;
lbl13:
            // 2 sources

            block10: while (true) {
                switch (var4_4) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block10;
                        }
                        break;
                    }
                    case -111489966: {
                        ** continue;
                    }
lbl20:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -1289170732;
                    ** GOTO lbl-1000
lbl22:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 1706824106;
                        ** GOTO lbl-1000
                        break;
                    }
lbl25:
                    // 1 sources

                    var3_5 = (var2_3 | var5_2) ^ 1590089785;
                    continue block9;
lbl27:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 68695189;
                        ** continue;
                        break;
                    }
                    case 802032940: {
                        this.IT(var1_1);
                        ** continue;
                    }
                    case -653485402: {
                        ** continue;
                    }
                    case -1728124563: {
                        var3_5 ^= var4_4 ^ -1043548080;
                        ** continue;
                    }
                    case 245132290: 
                }
                break;
            }
            break;
        }
    }

    private static int IS(int n2, int n3) {
        int n4 = 1780465652;
        int n5 = 870678962;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xA30988D5)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x7BFFEA36;
        n6 += (n5 | n4) ^ 0x7BFF7C66;
        n6 ^= (n5 | n4) ^ 0x7BFF8A3F;
        n6 ^= (n5 | n4) ^ 0x7BFFE315;
        n6 += (n5 | n4) ^ 0x7BFF0AAB;
        n6 += (n5 | n4) ^ 0x7BFFEF58;
        return n6 ^= (n5 | n4) ^ 0x7BFFCAE6;
    }

    /*
     * Unable to fully structure code
     */
    private void IT(class_310 var1_1) {
        block181: {
            block177: {
                block174: {
                    block175: {
                        block179: {
                            block185: {
                                block186: {
                                    block184: {
                                        block183: {
                                            block182: {
                                                block178: {
                                                    var13_2 = 1585474091;
                                                    var10_3 = jV.a & 1585474091 ^ 1820738956;
                                                    var12_4 = 0;
                                                    var11_5 = (var10_3 | var13_2) ^ -1197916706;
                                                    var12_4 = (var10_3 | var13_2) ^ -1497495534;
                                                    break block174;
lbl7:
                                                    // 1 sources

                                                    while (true) {
                                                        var12_4 = (var10_3 | var13_2) ^ -407760587;
                                                        break block174;
                                                        break;
                                                    }
lbl10:
                                                    // 1 sources

                                                    while (true) {
                                                        var11_5 ^= var12_4 ^ 1193453008;
                                                        var12_4 = (var10_3 | var13_2) ^ -32816660;
                                                        break block174;
                                                        break;
                                                    }
lbl14:
                                                    // 1 sources

                                                    while (true) {
                                                        block176: {
                                                            var2_6 = jV.IW(var1_1);
                                                            var12_4 = (var10_3 | var13_2) ^ 161814340;
                                                            break block175;
lbl18:
                                                            // 1 sources

                                                            while (true) {
                                                                var11_5 ^= var12_4 ^ 1079821219;
                                                                var12_4 = (var10_3 | var13_2) ^ -1207829930;
                                                                break block175;
                                                                break;
                                                            }
lbl22:
                                                            // 1 sources

                                                            while (true) {
                                                                if (var2_6 != null) break block176;
                                                                var12_4 = (var10_3 | var13_2) ^ 534480006;
                                                                break block175;
                                                                break;
                                                            }
lbl26:
                                                            // 1 sources

                                                            while (true) {
                                                                var11_5 ^= var12_4 ^ 534625105;
                                                                var12_4 = (var10_3 | var13_2) ^ 983413591;
                                                                break block175;
                                                                break;
                                                            }
lbl30:
                                                            // 1 sources

                                                            return;
                                                        }
                                                        var12_4 = (var10_3 | var13_2) ^ -258281065;
                                                        break block175;
lbl35:
                                                        // 1 sources

                                                        while (true) {
                                                            var11_5 ^= var12_4 ^ -700537662;
                                                            var12_4 = (var10_3 | var13_2) ^ 489464067;
                                                            break block175;
                                                            break;
                                                        }
lbl39:
                                                        // 1 sources

                                                        while (true) {
                                                            var3_7 = this.IV();
                                                            var11_5 ^= -915732753;
                                                            var4_8 = ((Float)this.a.getValue()).floatValue();
                                                            var11_5 ^= 1937054631;
                                                            var5_9 = ((mE)var2_6).zerio$getAllFonts();
                                                            var12_4 = (var10_3 | var13_2) ^ -991908507;
                                                            break block177;
                                                            break;
                                                        }
                                                        break;
                                                    }
lbl47:
                                                    // 1 sources

                                                    while (true) {
                                                        var11_5 ^= var12_4 ^ 1859929088;
                                                        var12_4 = (var10_3 | var13_2) ^ -541497987;
                                                        break block177;
                                                        break;
                                                    }
lbl51:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var2_6 != this.a) break block178;
                                                        var12_4 = (var10_3 | var13_2) ^ -79452761;
                                                        break block177;
                                                        break;
                                                    }
lbl55:
                                                    // 1 sources

                                                    while (true) {
                                                        var12_4 = (var10_3 | var13_2) ^ 1663382362;
                                                        break block177;
                                                        break;
                                                    }
lbl58:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var5_9.isEmpty()) break block178;
                                                        var12_4 = (var10_3 | var13_2) ^ -822681811;
                                                        break block177;
                                                        break;
                                                    }
lbl62:
                                                    // 1 sources

                                                    while (true) {
                                                        var12_4 = (var10_3 | var13_2) ^ -111253946;
                                                        break block177;
                                                        break;
                                                    }
lbl65:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var5_9.get(0) != this.a) break block178;
                                                        var12_4 = (var10_3 | var13_2) ^ 1372276367;
                                                        break block177;
                                                        break;
                                                    }
lbl69:
                                                    // 1 sources

                                                    while (true) {
                                                        var11_5 ^= var12_4 ^ 1010793647;
                                                        var12_4 = (var10_3 | var13_2) ^ 563740133;
                                                        break block177;
                                                        break;
                                                    }
lbl73:
                                                    // 1 sources

                                                    while (true) {
                                                        v0 = true;
                                                        ** GOTO lbl85
                                                        break;
                                                    }
                                                }
                                                var12_4 = (var10_3 | var13_2) ^ 248772362;
                                                break block177;
lbl79:
                                                // 1 sources

                                                while (true) {
                                                    var11_5 ^= var12_4 ^ 1663552810;
                                                    var12_4 = (var10_3 | var13_2) ^ -1848458335;
                                                    break block177;
                                                    break;
                                                }
lbl83:
                                                // 1 sources

                                                while (true) {
                                                    block180: {
                                                        v0 = false;
lbl85:
                                                        // 2 sources

                                                        var11_5 ^= -1560710080;
                                                        var6_10 = v0;
                                                        var12_4 = (var10_3 | var13_2) ^ 247684317;
                                                        break block179;
lbl89:
                                                        // 1 sources

                                                        while (true) {
                                                            var11_5 ^= var12_4 ^ -1992979906;
                                                            var12_4 = (var10_3 | var13_2) ^ -2128960098;
                                                            break block179;
                                                            break;
                                                        }
lbl93:
                                                        // 1 sources

                                                        while (true) {
                                                            if (!var6_10) break block180;
                                                            var12_4 = (var10_3 | var13_2) ^ -1775871489;
                                                            break block179;
                                                            break;
                                                        }
lbl97:
                                                        // 1 sources

                                                        while (true) {
                                                            var12_4 = (var10_3 | var13_2) ^ 1568110336;
                                                            break block179;
                                                            break;
                                                        }
lbl100:
                                                        // 1 sources

                                                        while (true) {
                                                            if (var3_7 != this.a) break block180;
                                                            var12_4 = (var10_3 | var13_2) ^ 175549572;
                                                            break block179;
                                                            break;
                                                        }
lbl104:
                                                        // 1 sources

                                                        while (true) {
                                                            var12_4 = (var10_3 | var13_2) ^ 939111640;
                                                            break block179;
                                                            break;
                                                        }
lbl107:
                                                        // 1 sources

                                                        while (true) {
                                                            if (var4_8 != this.a) break block180;
                                                            var12_4 = (var10_3 | var13_2) ^ -144786898;
                                                            break block179;
                                                            break;
                                                        }
lbl111:
                                                        // 1 sources

                                                        while (true) {
                                                            var11_5 ^= var12_4 ^ -1595448174;
                                                            var12_4 = (var10_3 | var13_2) ^ -969935491;
                                                            break block179;
                                                            break;
                                                        }
lbl115:
                                                        // 1 sources

                                                        return;
                                                    }
                                                    var12_4 = (var10_3 | var13_2) ^ 1887364849;
                                                    break block179;
lbl120:
                                                    // 1 sources

                                                    while (true) {
                                                        var11_5 ^= var12_4 ^ 1725692350;
                                                        var12_4 = (var10_3 | var13_2) ^ 377809342;
                                                        break block179;
                                                        break;
                                                    }
lbl124:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var6_10) ** GOTO lbl133
                                                        var12_4 = (var10_3 | var13_2) ^ -1721794303;
                                                        break block179;
                                                        break;
                                                    }
lbl128:
                                                    // 1 sources

                                                    while (true) {
                                                        var12_4 = (var10_3 | var13_2) ^ 629156217;
                                                        break block179;
                                                        break;
                                                    }
lbl131:
                                                    // 1 sources

                                                    while (true) {
                                                        this.a = List.copyOf(var5_9);
lbl133:
                                                        // 2 sources

                                                        var12_4 = (var10_3 | var13_2) ^ 216171770;
                                                        break block179;
                                                        break;
                                                    }
lbl135:
                                                    // 1 sources

                                                    while (true) {
                                                        var11_5 ^= var12_4 ^ -1346463890;
                                                        var12_4 = (var10_3 | var13_2) ^ 1972613425;
                                                        break block179;
                                                        break;
                                                    }
lbl139:
                                                    // 1 sources

                                                    while (true) {
                                                        var8_11 = null;
                                                        var12_4 = (var10_3 | var13_2) ^ -835259648;
                                                        break block181;
                                                        break;
                                                    }
                                                    break;
                                                }
lbl143:
                                                // 2 sources

                                                while (true) {
                                                    var12_4 = (var10_3 | var13_2) ^ -1504048863;
                                                    break block181;
                                                    break;
                                                }
lbl146:
                                                // 1 sources

                                                block129: while (true) {
                                                    switch (var11_5) {
                                                        case 197109175: {
                                                            var12_4 = (var10_3 | var13_2) ^ 296899457;
                                                            break block129;
                                                        }
lbl151:
                                                        // 1 sources

                                                        while (true) {
                                                            var11_5 ^= var12_4 ^ 913180370;
                                                            break block182;
                                                            break;
                                                        }
                                                        case -453900461: {
                                                            var12_4 = (var10_3 | var13_2) ^ 918538576;
                                                            break block129;
                                                        }
lbl157:
                                                        // 1 sources

                                                        while (true) {
                                                            var11_5 ^= var12_4 ^ -2107244495;
                                                            break block182;
                                                            break;
                                                        }
                                                        default: {
                                                            var12_4 = (var10_3 | var13_2) ^ -1610111812;
                                                            break block129;
                                                        }
                                                    }
                                                    break;
                                                }
                                                break block181;
lbl164:
                                                // 1 sources

                                                while (true) {
                                                    var11_5 ^= var12_4 ^ -909522092;
                                                    ** GOTO lbl143
                                                    break;
                                                }
                                            }
                                            var12_4 = (var10_3 | var13_2) ^ 132732103;
                                            break block181;
lbl170:
                                            // 1 sources

                                            while (true) {
                                                var12_4 = (var10_3 | var13_2) ^ 1488569149;
                                                break block181;
                                                break;
                                            }
lbl173:
                                            // 1 sources

                                            while (true) {
                                                if (this.a == null) break block183;
                                                var12_4 = (var10_3 | var13_2) ^ 1712543175;
                                                break block181;
                                                break;
                                            }
lbl177:
                                            // 1 sources

                                            while (true) {
                                                var12_4 = (var10_3 | var13_2) ^ 524768187;
                                                break block181;
                                                break;
                                            }
lbl180:
                                            // 1 sources

                                            while (true) {
                                                if (var3_7 != this.a) break block183;
                                                var12_4 = (var10_3 | var13_2) ^ 1359410615;
                                                break block181;
                                                break;
                                            }
lbl184:
                                            // 1 sources

                                            while (true) {
                                                var12_4 = (var10_3 | var13_2) ^ 1527679582;
                                                break block181;
                                                break;
                                            }
lbl187:
                                            // 1 sources

                                            while (true) {
                                                if (var4_8 != this.a) break block183;
                                                var12_4 = (var10_3 | var13_2) ^ 1460075138;
                                                break block181;
                                                break;
                                            }
lbl191:
                                            // 1 sources

                                            while (true) {
                                                var11_5 ^= var12_4 ^ -1752794109;
                                                var12_4 = (var10_3 | var13_2) ^ 1682046351;
                                                break block181;
                                                break;
                                            }
lbl195:
                                            // 1 sources

                                            while (true) {
                                                var7_12 = this.a;
                                                break block184;
                                                break;
                                            }
                                        }
                                        try {
                                            var12_4 = (var10_3 | var13_2) ^ -1122801382;
                                            break block181;
lbl202:
                                            // 1 sources

                                            while (true) {
                                                var11_5 ^= var12_4 ^ -534111901;
                                                var12_4 = (var10_3 | var13_2) ^ -2013484026;
                                                break block181;
                                                break;
                                            }
lbl206:
                                            // 1 sources

                                            while (true) {
                                                var7_12 = new class_390.class_9241(jV.IY(var3_7, var4_8), class_9243.class_9244.field_49118);
                                                var11_5 ^= 651963971;
                                                break;
                                            }
                                        }
                                        catch (Exception v1) {
                                            var11_5 = (var10_3 | var13_2) ^ 1943941992;
                                            var9_13 = v1;
                                            var11_5 ^= 301890763;
                                            this.IU(var3_7);
                                            var11_5 ^= -353852641;
                                            return;
                                        }
                                        var11_5 ^= -1150953285;
                                        var8_11 = this.a;
                                    }
                                    var11_5 ^= -1435159712;
                                    var9_14 = new ArrayList<class_390.class_9241>(this.a.size() + 1);
                                    var12_4 = (var10_3 | var13_2) ^ -773908186;
                                    break block185;
lbl224:
                                    // 1 sources

                                    while (true) {
                                        var11_5 ^= var12_4 ^ 903763531;
                                        var12_4 = (var10_3 | var13_2) ^ 1743529269;
                                        break block185;
                                        break;
                                    }
lbl228:
                                    // 1 sources

                                    while (true) {
                                        var9_14.add(var7_12);
                                        var12_4 = (var10_3 | var13_2) ^ 1737169398;
                                        break block185;
                                        break;
                                    }
lbl233:
                                    // 1 sources

                                    while (true) {
                                        var11_5 ^= var12_4 ^ 184233858;
                                        var12_4 = (var10_3 | var13_2) ^ -1031478524;
                                        break block185;
                                        break;
                                    }
lbl237:
                                    // 1 sources

                                    while (true) {
                                        var9_14.addAll((Collection<class_390.class_9241>)this.a);
                                        var12_4 = (var10_3 | var13_2) ^ 945267139;
                                        break block185;
                                        break;
                                    }
lbl242:
                                    // 1 sources

                                    while (true) {
                                        var11_5 ^= var12_4 ^ 1743083329;
                                        var12_4 = (var10_3 | var13_2) ^ -1476277751;
                                        break block185;
                                        break;
                                    }
lbl246:
                                    // 1 sources

                                    while (true) {
                                        var2_6.method_2004(var9_14, jV.IX(var1_1.field_1690));
                                        var12_4 = (var10_3 | var13_2) ^ 1222214174;
                                        break block185;
                                        break;
                                    }
lbl250:
                                    // 2 sources

                                    while (true) {
                                        var12_4 = (var10_3 | var13_2) ^ 1550153629;
                                        break block185;
                                        break;
                                    }
lbl253:
                                    // 1 sources

                                    block150: while (true) {
                                        switch (var11_5) {
                                            case -57678405: {
                                                var12_4 = (var10_3 | var13_2) ^ 796576165;
                                                break block150;
                                            }
lbl258:
                                            // 1 sources

                                            while (true) {
                                                var11_5 ^= var12_4 ^ -2037457458;
                                                break block186;
                                                break;
                                            }
                                            default: {
                                                var12_4 = (var10_3 | var13_2) ^ 1224402398;
                                                break block150;
                                            }
lbl264:
                                            // 1 sources

                                            while (true) {
                                                var11_5 ^= var12_4 ^ -746556517;
                                                break block186;
                                                break;
                                            }
                                            case 1192456322: {
                                                var12_4 = (var10_3 | var13_2) ^ 89856321;
                                                break block150;
                                            }
                                        }
                                        break;
                                    }
                                    break block185;
lbl271:
                                    // 1 sources

                                    while (true) {
                                        var11_5 ^= var12_4 ^ -113191123;
                                        ** GOTO lbl250
                                        break;
                                    }
                                }
                                var12_4 = (var10_3 | var13_2) ^ -903412573;
                                break block185;
lbl277:
                                // 1 sources

                                while (true) {
                                    var12_4 = (var10_3 | var13_2) ^ 2046479733;
                                    break block185;
                                    break;
                                }
lbl280:
                                // 1 sources

                                while (true) {
                                    this.a = var2_6;
                                    var12_4 = (var10_3 | var13_2) ^ -1230831915;
                                    break block185;
                                    break;
                                }
lbl284:
                                // 1 sources

                                while (true) {
                                    var11_5 ^= var12_4 ^ 1399519505;
                                    var12_4 = (var10_3 | var13_2) ^ 1636153047;
                                    break block185;
                                    break;
                                }
lbl288:
                                // 1 sources

                                while (true) {
                                    this.a = var7_12;
                                    var12_4 = (var10_3 | var13_2) ^ 1040108843;
                                    break block185;
                                    break;
                                }
lbl292:
                                // 1 sources

                                while (true) {
                                    var11_5 ^= var12_4 ^ 2108376451;
                                    var12_4 = (var10_3 | var13_2) ^ -543566579;
                                    break block185;
                                    break;
                                }
lbl296:
                                // 1 sources

                                while (true) {
                                    this.a = var3_7;
                                    var12_4 = (var10_3 | var13_2) ^ -1021394150;
                                    break block185;
                                    break;
                                }
lbl300:
                                // 1 sources

                                while (true) {
                                    var11_5 ^= var12_4 ^ -1881647522;
                                    var12_4 = (var10_3 | var13_2) ^ -1422805186;
                                    break block185;
                                    break;
                                }
lbl304:
                                // 1 sources

                                while (true) {
                                    this.a = var4_8;
                                    var12_4 = (var10_3 | var13_2) ^ -317631407;
                                    break block185;
                                    break;
                                }
lbl308:
                                // 1 sources

                                while (true) {
                                    var11_5 ^= var12_4 ^ 525282123;
                                    var12_4 = (var10_3 | var13_2) ^ 1426247688;
                                    break block185;
                                    break;
                                }
lbl312:
                                // 1 sources

                                while (true) {
                                    if (var8_11 == null) ** GOTO lbl321
                                    var12_4 = (var10_3 | var13_2) ^ -1477866317;
                                    break block185;
                                    break;
                                }
lbl316:
                                // 1 sources

                                while (true) {
                                    var12_4 = (var10_3 | var13_2) ^ -2144727144;
                                    break block185;
                                    break;
                                }
lbl319:
                                // 1 sources

                                while (true) {
                                    var8_11.close();
lbl321:
                                    // 2 sources

                                    var12_4 = (var10_3 | var13_2) ^ -354952892;
                                    break block185;
                                    break;
                                }
lbl323:
                                // 1 sources

                                while (true) {
                                    var11_5 ^= var12_4 ^ 282777962;
                                    var12_4 = (var10_3 | var13_2) ^ 1497932598;
                                    break block185;
                                    break;
                                }
lbl327:
                                // 1 sources

                                return;
                            }
                            block168: while (true) {
                                switch (var12_4) {
                                    default: {
                                        continue block168;
                                    }
                                    case -1353091447: {
                                        ** continue;
                                    }
                                    case 426396314: {
                                        ** continue;
                                    }
                                    case 420312665: {
                                        ** continue;
                                    }
                                    case -1140683605: {
                                        ** continue;
                                    }
                                    case 1188154988: {
                                        ** continue;
                                    }
                                    case -695753306: {
                                        ** continue;
                                    }
                                    case 912256433: {
                                        ** continue;
                                    }
                                    case 585308210: {
                                        ** continue;
                                    }
                                    case 1375512074: {
                                        ** continue;
                                    }
                                    case 914131569: {
                                        ** continue;
                                    }
                                    case 2078111470: {
                                        ** continue;
                                    }
                                    case -1264489716: {
                                        ** continue;
                                    }
                                    case 125608666: {
                                        ** continue;
                                    }
                                    case -937127558: {
                                        ** continue;
                                    }
                                    case 520345976: {
                                        ** continue;
                                    }
                                    case 1131979396: {
                                        ** continue;
                                    }
                                    case -1591756126: {
                                        ** continue;
                                    }
                                    case -1114067787: {
                                        ** continue;
                                    }
                                    case -709371759: {
                                        ** continue;
                                    }
                                    case -1818805250: {
                                        ** continue;
                                    }
                                    case 730120103: {
                                        ** continue;
                                    }
                                    case -646978788: {
                                        ** continue;
                                    }
                                    case -22257609: {
                                        ** continue;
                                    }
                                    case -1806584085: {
                                        ** continue;
                                    }
                                    ** case 667864217:
lbl383:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                        }
                        block169: while (true) {
                            switch (var12_4) {
                                default: {
                                    continue block169;
                                }
                                case 1883583346: {
                                    ** continue;
                                }
                                case -6501839: {
                                    ** continue;
                                }
                                case -392153520: {
                                    ** continue;
                                }
                                case 603003055: {
                                    ** continue;
                                }
                                case 1961935659: {
                                    ** continue;
                                }
                                case 1233116023: {
                                    ** continue;
                                }
                                case -1982278271: {
                                    ** continue;
                                }
                                case -1196844334: {
                                    ** continue;
                                }
                                case 251169118: {
                                    ** continue;
                                }
                                case 1744995857: {
                                    ** continue;
                                }
                                case -405147986: {
                                    ** continue;
                                }
                                case 1527138006: {
                                    ** continue;
                                }
                                case 1919216469: {
                                    ** continue;
                                }
                                ** case 185982622:
lbl416:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                    }
                    block170: while (true) {
                        switch (var12_4) {
                            default: {
                                continue block170;
                            }
                            case 1998813419: {
                                ** continue;
                            }
                            case -964192775: {
                                ** continue;
                            }
                            case 1633545001: {
                                ** continue;
                            }
                            case 1142676728: {
                                ** continue;
                            }
                            case -1910727112: {
                                ** continue;
                            }
                            ** case 1672138412:
lbl433:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
                }
                block171: while (true) {
                    switch (var12_4) {
                        default: {
                            continue block171;
                        }
                        case -667392067: {
                            ** continue;
                        }
                        case -1724612966: {
                            ** continue;
                        }
                        ** case -2138231229:
lbl444:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            block172: while (true) {
                switch (var12_4) {
                    default: {
                        continue block172;
                    }
                    case -1167670582: {
                        ** continue;
                    }
                    case -1589703982: {
                        ** continue;
                    }
                    case -2050635256: {
                        ** continue;
                    }
                    case 497245429: {
                        ** continue;
                    }
                    case -1334792062: {
                        ** continue;
                    }
                    case -2015884823: {
                        ** continue;
                    }
                    case 793585952: {
                        ** continue;
                    }
                    case 1595904586: {
                        ** continue;
                    }
                    case 1884657829: {
                        ** continue;
                    }
                    ** case -279663602:
lbl469:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        block173: while (true) {
            switch (var12_4) {
                default: {
                    continue block173;
                }
                case -1330602833: {
                    ** continue;
                }
                case -656644466: {
                    ** continue;
                }
                case 1865694254: {
                    ** continue;
                }
                case 1211737855: {
                    ** continue;
                }
                case -561919213: {
                    ** continue;
                }
                case 2037332840: {
                    ** continue;
                }
                case 641707154: {
                    ** continue;
                }
                case 412433000: {
                    ** continue;
                }
                case 1640053780: {
                    ** continue;
                }
                case 796957208: {
                    ** continue;
                }
                case 629728753: {
                    ** continue;
                }
                case 696292653: {
                    ** continue;
                }
                case 449286688: {
                    ** continue;
                }
                {
                    case -1013643595: {
                        ** continue;
                    }
                    ** case -109395031:
lbl504:
                    // 1 sources

                    ** continue;
                }
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void IU(fr var1_1) {
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
    private fr IV() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH]], but top level block is 13[SWITCH]
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
     * Unable to fully structure code
     */
    private static class_377 IW(class_310 var0) {
        var2_1 = jV.a & 1067697278 ^ 1829669749;
        var4_2 = 0;
        if (true) ** GOTO lbl19
        block5: while (true) {
            switch (var4_2) lbl-1000:
            // 4 sources

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
                    var4_2 = (var2_1 | 1067697278) ^ 999885655;
                    ** GOTO lbl-1000
                    break;
                }
lbl12:
                // 1 sources

                return ((lo)var1_4).zerio$getFontStorages().get(class_310.field_1740);
                case 1144439848: {
                    var1_4 = ((fh)var0).zerio$getFontManager();
                    break block5;
                }
                case 544129948: {
                    ** GOTO lbl22
                }
lbl19:
                // 1 sources

                var3_3 = (var2_1 | 1067697278) ^ 605530724;
                var4_2 = (var2_1 | 1067697278) ^ 1606487267;
                ** GOTO lbl-1000
lbl22:
                // 1 sources

                var4_2 = (var2_1 | 1067697278) ^ 343098171;
                ** continue;
                case 1809615940: {
                    var3_3 ^= var4_2 ^ 182557604;
                    ** continue;
                }
            }
            break;
        }
        var3_3 ^= -359477087;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static Set<class_9243> IX(class_315 var0) {
        var5_1 = -1142617008;
        var2_2 = jV.a & -1142617008 ^ 1108286137;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ -1727124253;
        var4_3 = (var2_2 | var5_1) ^ 321463280;
        if (true) ** GOTO lbl52
        block17: while (true) {
            var4_3 = (var2_2 | var5_1) ^ -1823829030;
            block18: while (true) {
                switch (var4_3) {
                    case 1755680035: {
                        var3_4 ^= var4_3 ^ 537126722;
                        ** break;
                    }
                    case -276955972: {
                        ** GOTO lbl41
                    }
lbl16:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1862384930;
                    continue block18;
                    case -1655575200: {
                        var3_4 ^= var4_3 ^ -1387835487;
                        ** break;
                    }
                    case -1342529415: {
                        var1_5.add(class_9243.field_49112);
                        ** GOTO lbl35
                    }
lbl25:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -13530953;
                    continue block18;
                    case 774866382: {
                        var3_4 ^= var4_3 ^ -848172856;
                        ** GOTO lbl50
                    }
                    case 81696334: {
                        if (!((Boolean)var0.method_42437().method_41753()).booleanValue()) ** GOTO lbl35
                        var4_3 = (var2_2 | var5_1) ^ 345170501;
                    }
                    default: {
                        continue block18;
                    }
lbl35:
                    // 2 sources

                    var4_3 = (var2_2 | var5_1) ^ -708797641;
                    continue block18;
                    case 1011324180: {
                        if (!((Boolean)var0.method_57018().method_41753()).booleanValue()) continue block17;
                        var4_3 = (var2_2 | var5_1) ^ -106708828;
                        continue block18;
                    }
lbl41:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 1410711168;
                    continue block18;
                    case 38592093: {
                        var4_3 = (var2_2 | var5_1) ^ -283878339;
                        continue block18;
                    }
                    case 352010948: {
                        var1_5.add(class_9243.field_49113);
                        continue block17;
                    }
lbl50:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -945255443;
                    continue block18;
lbl52:
                    // 1 sources

                    block19: while (true) {
                        switch (var4_3) {
                            case -389661431: {
                                var4_3 = (var2_2 | var5_1) ^ -70475580;
                                ** break;
                            }
                            case 2342461: {
                                var3_4 ^= var4_3 ^ -1955984712;
                                var4_3 = (var2_2 | var5_1) ^ 607364231;
                            }
lbl60:
                            // 3 sources

                            default: {
                                continue block19;
                            }
                            case -539182466: 
                        }
                        break;
                    }
                    var1_5 = EnumSet.noneOf(class_9243.class);
                    var4_3 = (var2_2 | var5_1) ^ 1723790233;
                    continue block18;
                    case 1796299815: 
                }
                break;
            }
            break;
        }
        return var1_5;
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
    private static class_390 IY(fr var0, float var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [19[CATCHBLOCK]], but top level block is 1[TRYBLOCK]
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
     * Exception decompiling
     */
    private static class_390 IZ(InputStream var0, float var1_1, float var2_2) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [85[UNCONDITIONALDOLOOP]], but top level block is 2[TRYBLOCK]
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
     * Unable to fully structure code
     */
    private static /* synthetic */ String[] Ja(int var0) {
        var1_1 = jV.a & 988554848 ^ 1871560533;
        var3_2 = 0;
        var2_3 = (var1_1 | 988554848) ^ -1985301821;
        ** GOTO lbl15
lbl5:
        // 1 sources

        return new String[var0];
lbl7:
        // 1 sources

        block6: while (true) {
            switch (var3_2) lbl-1000:
            // 3 sources

            {
                default: {
                    continue block6;
                }
                case 1842534947: {
                    ** continue;
                }
                case -804579073: {
                    break block6;
                }
lbl15:
                // 1 sources

                var3_2 = (var1_1 | 988554848) ^ -1343838326;
                ** GOTO lbl-1000
                case 1952321978: {
                    var2_3 ^= var3_2 ^ -2024520684;
                    var3_2 = (var1_1 | 988554848) ^ 306144598;
                    ** GOTO lbl-1000
                }
            }
            break;
        }
        var3_2 = (var1_1 | 988554848) ^ 196325071;
        ** while (true)
    }
}

