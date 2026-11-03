/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1657
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2382
 *  net.minecraft.class_310
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2382;
import net.minecraft.class_310;
import z.r.al;
import z.r.gD;
import z.r.gF;
import z.r.gP;
import z.r.gj;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class y
extends gF {
    private class_2338 a;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private boolean a;
    private final gP a;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private final gP b;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    public static final int c;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private gD a;
    private static final /* synthetic */ String l;
    private int a;
    private final List<class_2338> a;
    private int b;
    private final ke a;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String k;
    private final gP c;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final int[] a;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private static final /* synthetic */ String x;
    private final ke b;
    private static final /* synthetic */ String y;
    private final gP d;
    private final ke c;
    private final al a;
    private static final /* synthetic */ String z;
    private static final /* synthetic */ String A;
    private static final /* synthetic */ String B;
    private static final /* synthetic */ String C;
    private final gP e;
    private static final /* synthetic */ String D;
    private static final /* synthetic */ String E;
    private static final /* synthetic */ String F;
    private final ke d;
    private static final /* synthetic */ String G;
    private static final /* synthetic */ String H;
    private final gP f;
    private static final /* synthetic */ String I;
    private static final /* synthetic */ String J;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String K;

    /*
     * Exception decompiling
     */
    public y() {
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
        block43: {
            block45: {
                block44: {
                    var4_1 = -428526814;
                    var1_2 = z.r.y.c & -428526814 ^ -453688126;
                    var3_3 = 0;
                    ** GOTO lbl43
lbl5:
                    // 1 sources

                    block26: while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -2031783113;
                        ** GOTO lbl19
lbl8:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 1885181760;
                            break block43;
                            break;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1853352528;
                            ** GOTO lbl19
                            break;
                        }
lbl14:
                        // 2 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1201231532;
                            if (true) ** GOTO lbl19
                            break;
                        }
                        block30: while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 873951591;
lbl19:
                            // 9 sources

                            block31: while (true) {
                                switch (var3_3) lbl-1000:
                                // 12 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block31;
                                        }
                                        break;
                                    }
                                    case -55626349: {
                                        ** continue;
                                    }
                                    case 816756353: {
                                        break block44;
                                    }
lbl28:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -1441922480;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -20304072;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl34:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 2010874607;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case 1611662549: {
                                        var2_4 ^= var3_3 ^ 1804042489;
                                        ** continue;
                                    }
lbl40:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 274446087;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl43:
                                    // 1 sources

                                    var2_4 = (var1_2 | var4_1) ^ 382894085;
                                    ** continue;
lbl45:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -1953940058;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case -756939131: {
                                        this.a = false;
                                        var3_3 = (var1_2 | var4_1) ^ 1068874494;
                                        ** GOTO lbl-1000
                                    }
                                    case 406804698: {
                                        var2_4 ^= var3_3 ^ -1677933581;
                                        ** GOTO lbl14
                                    }
                                    case 1836862020: {
                                        var2_4 ^= var3_3 ^ -1908296308;
                                        ** continue;
                                    }
                                    case -717471764: {
                                        this.a = null;
                                        break block45;
                                    }
                                    case -1294370431: {
                                        var2_4 ^= var3_3 ^ -1808600416;
                                        ** GOTO lbl67
                                    }
lbl64:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 1855344661;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl67:
                                    // 1 sources

                                    var3_3 = (var1_2 | var4_1) ^ 868829198;
                                    ** GOTO lbl-1000
                                    case 1586749110: {
                                        continue block30;
                                    }
                                    case -1506303209: {
                                        this.a = 0;
                                        ** continue;
                                    }
lbl74:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -1229606873;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case -1549562928: {
                                        var2_4 ^= var3_3 ^ -1668259351;
                                        ** continue;
                                    }
lbl80:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 1412173411;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case 1346422725: {
                                        this.a.clear();
                                        break block26;
                                    }
lbl86:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 442122865;
                                        ** continue;
                                        break;
                                    }
                                    case -2006767625: {
                                        var2_4 ^= var3_3 ^ 1784948291;
                                        break block44;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    var3_3 = (var1_2 | var4_1) ^ -698629789;
                    ** GOTO lbl19
                    {
                        case -156319515: {
                            var2_4 ^= var3_3 ^ 2037165648;
                            ** continue;
                        }
                    }
lbl97:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 2015200436;
                        ** GOTO lbl19
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -968658726;
                ** GOTO lbl19
            }
            var3_3 = (var1_2 | var4_1) ^ 1163328562;
            ** GOTO lbl19
            {
                case -2004705870: {
                    this.a = gD.b;
                    ** continue;
                }
                case 1291548082: {
                    this.b = 0;
                    ** continue;
                }
                case -1628900522: {
                    return;
                }
                case -650064612: {
                    var2_4 ^= var3_3 ^ -511108515;
                    ** continue;
                }
                case -1859193587: {
                    ** continue;
                }
            }
        }
        var3_3 = (var1_2 | var4_1) ^ 1086510325;
        ** while (true)
        {
            ** case 548800312:
        }
lbl123:
        // 1 sources

        switch (var2_4) {
            default: {
                ** continue;
            }
            case -514269515: {
                ** continue;
            }
            ** case -1333962037:
lbl129:
            // 1 sources

            ** continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block29: {
            block30: {
                block28: {
                    break block30;
lbl1:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -47543754;
                        break block28;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl6:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 127447494;
                        break block29;
                        break;
                    }
                    this.a = false;
                    var3_3 = (var1_2 | var4_1) ^ 687274704;
                    break block29;
lbl12:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -869574122;
                        break block29;
                        break;
                    }
lbl17:
                    // 1 sources

                    return;
lbl19:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 890521662;
                        ** continue;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 654221978;
                        break block29;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1809545049;
                        break block29;
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 211116827;
                        break block29;
lbl31:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -230319507;
                break block29;
                this.a = null;
                var3_3 = (var1_2 | var4_1) ^ 39316046;
                break block29;
                this.a = gD.b;
                var3_3 = (var1_2 | var4_1) ^ -1383636986;
                break block29;
lbl42:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -938864074;
                    break block29;
                    break;
                }
lbl45:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ 1997614235;
                    ** continue;
                    break;
                }
lbl48:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ 197106714;
                    ** continue;
                    break;
                }
            }
            var4_1 = -2144926643;
            var1_2 = z.r.y.c & -2144926643 ^ 987176136;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -1838188998;
            ** while (true)
        }
        block27: while (true) {
            switch (var3_3) {
                default: {
                    continue block27;
                }
                case 1589627353: {
                    ** continue;
                }
                case 1994147547: {
                    ** continue;
                }
                case -785618028: {
                    ** continue;
                }
                case -1235058730: {
                    ** continue;
                }
                case -1116754677: {
                    ** continue;
                }
                case -1677083049: {
                    break;
                }
                case 1219659424: {
                    ** continue;
                }
                case -1197410685: {
                    ** continue;
                }
                case 393247947: {
                    ** continue;
                }
                case 1929187067: {
                    this.a.clear();
                    ** continue;
                }
                case -1845369315: {
                    var2_4 ^= var3_3 ^ 208694994;
                    ** continue;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -464988908;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block9: {
            break block9;
lbl1:
            // 1 sources

            while (true) {
                z.r.y.a = new int[((var0_2 ^= 1821550819) | var2) ^ 1728052057];
                var0_2 ^= -1661488926;
                v0 = "|\u00ad\u0002\u00f5\u0097)t\u0088\u00f5\u00e8\b\u00b2\u009e,b\u00e7\u0095\u00c9\u00e9hW\u001c\u00e9\u00e4\u0090\u001e\u00e1]\u0087?LG\u0082H\u00dd\u00ef\u00cf\u0087;P\u00ca\u00fb\u001d\u008c\u0095\u00bet\u00ec\u001ek9\u0015\u0011a:\u00bc[\u00fb}&\u00b9\u00d1)i\u0002\n \u00ebtc\u00d8\u00ff%\u00f5\u00dec\\\u00ca\u00f0\u008f\u00a9g\u00c3&\u001fD\u00ef\u0081\u00da[\u0082f\u00ae\u0095\u00bd\u0095Nfd\u00a5Y0>s^\u0011-$\u0099\u00ea\u001e|\u00b2\u0091\u00b8\u0090\u0091\fs\u009f\u0083#5v\u00cc\u008dJ2\u0090_\u00db.U\u0018\u000b|\u00a6\u00a2\u00ec\u0081\u00aeZ\u00d1\u007f\u00a3x\u001ef\u0089%\u001d\u00f55\u00e5\u00e1\u0095\u00ed\u001a\u0081\u000f".getBytes("ISO-8859-1");
                if (true) ** GOTO lbl46
                while (true) {
                    if (v1 + 4 >= v0.length) {
                        z.r.y.k = gj.decode("jR9oeMOdGgwtIH+Tq1M=", z.r.y.vf(((var0_2 ^= 1049398097) | var2) ^ 82857061, var2 ^ ((var0_2 | var2) ^ -1971743301)));
                        z.r.y.s = gj.decode("VFSTphNZos6E3bmo1HPA6vv8htSHTcUaY2mKlKmMnLAJRST2NGVPnBbhSeTwbg==", z.r.y.vf((var0_2 | var2) ^ 82857058, var2 ^ ((var0_2 | var2) ^ -1575786430)));
                        z.r.y.d = gj.decode("r/JwUuGWBMY5vAQjkQ==", z.r.y.vf((var0_2 | var2) ^ 82857059, var2 ^ ((var0_2 | var2) ^ 549859131)));
                        z.r.y.r = gj.decode("wMIRFvCM0l0reXYgxw==", z.r.y.vf((var0_2 | var2) ^ 82857056, var2 ^ ((var0_2 | var2) ^ 1134958005)));
                        z.r.y.y = gj.decode("uhwWSltnSpSZaiSpDQ==", z.r.y.vf((var0_2 | var2) ^ 82857057, var2 ^ ((var0_2 | var2) ^ -705971819)));
                        z.r.y.E = gj.decode("Dg6ELw==", z.r.y.vf((var0_2 | var2) ^ 82857070, var2 ^ ((var0_2 | var2) ^ -512833483)));
                        z.r.y.e = gj.decode("7DIXdnsfZpt1LsNa8f8/NuG9KJ5nKK9pEwhRs+DLBNDYzME1Zelha3g9m0bE2Mc=", z.r.y.vf((var0_2 | var2) ^ 82857071, var2 ^ ((var0_2 | var2) ^ -1616228575)));
                        z.r.y.u = gj.decode("WQtWqphuM9OEObekD0+9C9Fm", z.r.y.vf((var0_2 | var2) ^ 82857068, var2 ^ ((var0_2 | var2) ^ -593542329)));
                        z.r.y.G = gj.decode("GyOUci6ABpVFQdnC5sdb0zf57PNwIwXlmm7166IPJ0oMOXVHbtQJx7xSK/ztQbhuAPedqqjP3H90fo70Tg==", z.r.y.vf((var0_2 | var2) ^ 82857069, var2 ^ ((var0_2 | var2) ^ 1443878353)));
                        z.r.y.g = gj.decode("t5lRgb7su6gS9UOPv/T44txjig==", z.r.y.vf((var0_2 | var2) ^ 82857066, var2 ^ ((var0_2 | var2) ^ -870633630)));
                        z.r.y.C = gj.decode("uNmWtEOyDUM/fZP0WlmqoxilDxkjj5BeCjZage/uCzxSS+Vt", z.r.y.vf((var0_2 | var2) ^ 82857067, var2 ^ ((var0_2 | var2) ^ 1934937851)));
                        z.r.y.x = gj.decode("+TX7SLiuqufvqvLaOU4JLPJTxQ==", z.r.y.vf((var0_2 | var2) ^ 82857064, var2 ^ ((var0_2 | var2) ^ 586483043)));
                        z.r.y.B = gj.decode("4JtOVKy1z3d5QN09eSa4uGUG8N77UPkFDG5VYc+rXjawyFhGDw==", z.r.y.vf((var0_2 | var2) ^ 82857065, var2 ^ ((var0_2 | var2) ^ -413362324)));
                        z.r.y.c = gj.decode("mhKGJlIjwkEIy6c=", z.r.y.vf((var0_2 | var2) ^ 82857078, var2 ^ ((var0_2 | var2) ^ -495777119)));
                        z.r.y.J = gj.decode("4AqepTT4ShOm5wQAPUkakhCB9FYISeujfnQ/BSJuFGk=", z.r.y.vf((var0_2 | var2) ^ 82857079, var2 ^ ((var0_2 | var2) ^ 966720533)));
                        z.r.y.a = gj.decode("tydmSQWjNzExTeolv9FZ", z.r.y.vf((var0_2 | var2) ^ 82857076, var2 ^ ((var0_2 | var2) ^ 1599482317)));
                        z.r.y.l = gj.decode("PzkOVf2899SbmuyfnTOuWrnCbMK8YTk/+HkcCRkGT3zi1b3papq10kttmIpGcDc=", z.r.y.vf((var0_2 | var2) ^ 82857077, var2 ^ ((var0_2 | var2) ^ -2004810583)));
                        z.r.y.m = gj.decode("cDDdzKDmWB/YVm2TT0gZtL4=", z.r.y.vf((var0_2 | var2) ^ 82857074, var2 ^ ((var0_2 | var2) ^ -993042430)));
                        z.r.y.K = gj.decode("12UT9E5E3HesceKdZBFD", z.r.y.vf((var0_2 | var2) ^ 82857075, var2 ^ ((var0_2 | var2) ^ -942679662)));
                        z.r.y.p = gj.decode("QZWTRNYmDQZPhzo=", z.r.y.vf((var0_2 | var2) ^ 82857072, var2 ^ ((var0_2 | var2) ^ -1430640565)));
                        z.r.y.h = gj.decode("5ifRoACNo/gXvE55zzQ2cqdPVgCHpyKfSgZcTJYBmstM/747P0xQLLHgWFv2BWFAKLEW+45PCrxiFbtyNGTs83fE", z.r.y.vf((var0_2 | var2) ^ 82857073, var2 ^ ((var0_2 | var2) ^ 153847794)));
                        z.r.y.H = gj.decode("KDAMD6uTfHGPqKhl49PbWiTF4Cv6vFxunkIO2dkV3Qsdo90hZIQCnLMrMps=", z.r.y.vf((var0_2 | var2) ^ 82857086, var2 ^ ((var0_2 | var2) ^ 1551831841)));
                        z.r.y.j = gj.decode("7ugEXLBZdxk5IWww", z.r.y.vf((var0_2 | var2) ^ 82857087, var2 ^ ((var0_2 | var2) ^ -1886934422)));
                        z.r.y.A = gj.decode("E3sXLAvkgklnGLIICSk2KECr2Z5k/twqySlCM358Fk8i8NJs2aV0FkjRP6rZTjd52FNN04M=", z.r.y.vf((var0_2 | var2) ^ 82857084, var2 ^ ((var0_2 | var2) ^ 303392814)));
                        z.r.y.q = gj.decode("jejc5D3s962YJk6pG04=", z.r.y.vf((var0_2 | var2) ^ 82857085, var2 ^ ((var0_2 | var2) ^ -837369577)));
                        z.r.y.F = gj.decode("uwXFOvHUL40+fEdQCOLA+bSr5+lz18UGZ2DPc1qocPw3l14c", z.r.y.vf((var0_2 | var2) ^ 82857082, var2 ^ ((var0_2 | var2) ^ 2089036197)));
                        z.r.y.z = gj.decode("Fz5yaeCTsVLgP5DPjjtuapFDn69S28K6DvFskns8nNH7CQhinamQdm0e4Q==", z.r.y.vf((var0_2 | var2) ^ 82857083, var2 ^ ((var0_2 | var2) ^ -1304585198)));
                        z.r.y.I = gj.decode("VMLxLbLqUmlMHQA6k6RMl1poJ1GLVJQcNYk=", z.r.y.vf((var0_2 | var2) ^ 82857080, var2 ^ ((var0_2 | var2) ^ -1139603336)));
                        z.r.y.v = gj.decode("BM8=", z.r.y.vf((var0_2 | var2) ^ 82857081, var2 ^ ((var0_2 | var2) ^ -1476120355)));
                        z.r.y.w = gj.decode("olkSr4w2ae/w83z/AjoP7PtEu5LJkog=", z.r.y.vf((var0_2 | var2) ^ 82857030, var2 ^ ((var0_2 | var2) ^ 1503139993)));
                        z.r.y.t = gj.decode("EbBdkYLAcZS5zj3H0w9NK+roBmqTzlnD3A==", z.r.y.vf((var0_2 | var2) ^ 82857031, var2 ^ ((var0_2 | var2) ^ -1213399045)));
                        z.r.y.b = gj.decode("pfClEYOg1H+HhyZgQJnvUrVrh3novCyGr7N9mi0OF9uP03lJs/bCJmdvBSb0DQ==", z.r.y.vf((var0_2 | var2) ^ 82857028, var2 ^ ((var0_2 | var2) ^ 1473471296)));
                        z.r.y.n = gj.decode("b31cWDBBe88TaWE+bbfz", z.r.y.vf((var0_2 | var2) ^ 82857029, var2 ^ ((var0_2 | var2) ^ -321215183)));
                        z.r.y.D = gj.decode("kw==", z.r.y.vf((var0_2 | var2) ^ 82857026, var2 ^ ((var0_2 | var2) ^ 1049559973)));
                        z.r.y.o = gj.decode("iGk=", z.r.y.vf((var0_2 | var2) ^ 82857027, var2 ^ ((var0_2 | var2) ^ 1464814000)));
                        z.r.y.f = gj.decode("G3Qm0hxatYNV/cJQ", z.r.y.vf((var0_2 | var2) ^ 82857024, var2 ^ ((var0_2 | var2) ^ -1835872414)));
                        z.r.y.i = gj.decode("5meOBLVahwkd+uLT30LTQg==", z.r.y.vf((var0_2 | var2) ^ 82857025, var2 ^ ((var0_2 | var2) ^ -741892891)));
                        return;
                    }
lbl46:
                    // 3 sources

                    var0_2 ^= -81686948;
                    var0_2 ^= 1799687678;
                    var0_2 ^= 848373907;
                    var0_2 ^= 582626152;
                    var0_2 ^= 1310909264;
                    var0_2 ^= 1572132686;
                    v2 = var0_2 ^= 1011607524;
                    var0_2 ^= -1058623284;
                    z.r.y.a[v3] = ((v0[v1] & 255) << 24 | ((v0[v1 + 1] & 255) << 16 | ((v0[v1 + 2] & 255) << 8 | v0[v1 + 3] & 255))) ^ ((v2 | var2) ^ -991587463 ^ z.r.y.c);
                    v3 = v3 + 1;
                    v0 = v0;
                    v1 = v1 + 4;
                    var0_2 ^= 1869931375;
                }
                break;
            }
        }
        var2 = 1190103408;
        z.r.y.c = mK.a(MethodHandles.lookup().lookupClass(), -81560143);
        var1_1 = 0;
        var0_2 = -910241046;
        var1_1 = var2 ^ -51855357;
        block7: while (true) {
            switch (var1_1) {
                default: {
                    continue block7;
                }
                case -1480793037: {
                    v3 = 0;
                    v1 = 0;
                    ** continue;
                }
                case -1173927565: {
                    var1_1 = var2 ^ 1854420285;
                    continue block7;
                }
                case 677887053: 
            }
            var0_2 ^= var1_1 ^ -1443679211;
            var1_1 = var2 ^ -514626237;
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
     * Exception decompiling
     */
    private class_1657 vc(class_310 var1_1) {
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
    private class_2338 vd(class_310 var1_1) {
        var16_2 = 1193426045;
        var13_3 = z.r.y.c & 1193426045 ^ -267421721;
        var15_4 = 0;
        var14_14 = (var13_3 | var16_2) ^ -1989600050;
        var15_4 = (var13_3 | var16_2) ^ -1181389;
        ** GOTO lbl79
lbl7:
        // 4 sources

        while (true) {
            var15_4 = (var13_3 | var16_2) ^ 74583027;
            ** GOTO lbl95
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var3_6 = ((Float)this.d.getValue()).intValue();
            var14_14 ^= -1730874493;
            var4_7 = null;
            var14_14 ^= -906502013;
            var5_8 = 1.7976931348623157E308;
            var14_14 ^= 107827577;
            var7_9 = -var3_6;
            ** GOTO lbl87
            break;
        }
lbl19:
        // 1 sources

        while (true) {
            var15_4 = (var13_3 | var16_2) ^ 1942272073;
            ** GOTO lbl131
            break;
        }
lbl22:
        // 1 sources

        while (true) {
            var15_4 = (var13_3 | var16_2) ^ -177253984;
            ** GOTO lbl95
            while (true) {
                var15_4 = (var13_3 | var16_2) ^ -1008453607;
                ** GOTO lbl95
lbl28:
                // 2 sources

                while (true) {
                    var15_4 = (var13_3 | var16_2) ^ 404877115;
                    ** GOTO lbl222
                    break;
                }
                break;
            }
            break;
        }
        while (true) {
            var15_4 = (var13_3 | var16_2) ^ 60024649;
            ** GOTO lbl222
            break;
        }
lbl34:
        // 1 sources

        while (true) {
            var15_4 = (var13_3 | var16_2) ^ -650641293;
            ** GOTO lbl95
            break;
        }
lbl37:
        // 1 sources

        while (true) {
            var15_4 = (var13_3 | var16_2) ^ 243071658;
            ** GOTO lbl131
            break;
        }
lbl40:
        // 1 sources

        while (true) {
            var15_4 = (var13_3 | var16_2) ^ -1851295285;
            if (true) ** GOTO lbl162
            break;
        }
        block65: while (true) {
            switch (var15_4) {
                case 2024779144: {
                    if (var1_1.field_1724 != null) {
                        var15_4 = (var13_3 | var16_2) ^ -1515332077;
                        continue block65;
                    }
                    ** GOTO lbl-1000
                }
                case -2055996788: {
                    var14_14 ^= var15_4 ^ -142606270;
                    var15_4 = (var13_3 | var16_2) ^ -1865881376;
                    continue block65;
                }
                case -1846499820: {
                    var14_14 ^= var15_4 ^ -1684867563;
                    ** break;
                }
                case 1384292844: {
                    var15_4 = (var13_3 | var16_2) ^ -2023533995;
                    continue block65;
                }
lbl60:
                // 1 sources

                var15_4 = (var13_3 | var16_2) ^ -1887382921;
                ** GOTO lbl79
                case 146966220: {
                    ** break;
                }
                case -1941287440: {
                    var14_14 ^= var15_4 ^ -445059533;
                    var15_4 = (var13_3 | var16_2) ^ -129337343;
                    ** GOTO lbl79
                }
                case 258279422: {
                    var2_5 = var1_1.field_1724.method_24515();
                    var14_14 ^= -856430577;
                    ** continue;
                }
lbl72:
                // 1 sources

                var15_4 = (var13_3 | var16_2) ^ 1725946347;
                continue block65;
                case 1884040618: {
                    if (var1_1.field_1687 == null) lbl-1000:
                    // 2 sources

                    {
                        var15_4 = (var13_3 | var16_2) ^ 1918666099;
                    } else {
                        var15_4 = (var13_3 | var16_2) ^ 2070229519;
                    }
                }
lbl79:
                // 6 sources

                default: {
                    continue block65;
                }
lbl81:
                // 1 sources

                while (true) {
                    var15_4 = (var13_3 | var16_2) ^ 1441060553;
                    ** GOTO lbl95
lbl84:
                    // 1 sources

                    while (true) {
                        var15_4 = (var13_3 | var16_2) ^ 311888305;
                        ** GOTO lbl95
                        break;
                    }
                    break;
                }
lbl87:
                // 2 sources

                while (true) {
                    var15_4 = (var13_3 | var16_2) ^ 546954636;
                    ** GOTO lbl192
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    var15_4 = (var13_3 | var16_2) ^ -601759102;
                    ** GOTO lbl222
                    break;
                }
lbl93:
                // 1 sources

                while (true) {
                    var15_4 = (var13_3 | var16_2) ^ 874182810;
lbl95:
                    // 7 sources

                    block71: while (true) {
                        switch (var15_4) {
                            case -440895922: {
                                if (!var1_1.field_1687.method_8320(var10_12).method_27852(class_2246.field_10260)) ** GOTO lbl7
                                var15_4 = (var13_3 | var16_2) ^ -254928692;
                                continue block71;
                            }
                            case 773291916: {
                                ++var9_11;
                                ** GOTO lbl28
                            }
                            case 885737446: {
                                var14_14 ^= var15_4 ^ 1418065402;
                                ** continue;
                            }
                            case -1563711178: {
                                var14_14 ^= var15_4 ^ -1031464150;
                                var15_4 = (var13_3 | var16_2) ^ 1739599578;
                                continue block71;
                            }
                            case 1331396336: {
                                if (!this.a.contains(var10_12)) ** continue;
                                ** continue;
                            }
                            case -1868607195: {
                                ** GOTO lbl7
                            }
                            case -1019902107: {
                                var14_14 ^= var15_4 ^ -1067956326;
                                var15_4 = (var13_3 | var16_2) ^ -1200357105;
                            }
                            default: {
                                continue block71;
                            }
                            case -211979252: {
                                var14_14 ^= var15_4 ^ -37495962;
                                ** continue;
                            }
                            case 132212531: {
                                var14_14 ^= var15_4 ^ 1329551334;
                                ** continue;
                            }
                            case 37760607: 
                        }
                        break;
                    }
                    var11_13 = var2_5.method_10262((class_2382)var10_12);
                    var15_4 = (var13_3 | var16_2) ^ 330588118;
                    ** GOTO lbl174
                    break;
                }
lbl131:
                // 3 sources

                block72: while (true) {
                    switch (var15_4) {
                        default: {
                            continue block72;
                        }
                        case 389702114: {
                            var14_14 ^= var15_4 ^ 2084837892;
                            var15_4 = (var13_3 | var16_2) ^ 2083469367;
                            continue block72;
                        }
                        case -2064922698: {
                            var14_14 ^= var15_4 ^ 1509626399;
                            break;
                        }
                        case -1962915896: {
                            ++var7_9;
                            ** continue;
                        }
                        case 2060046123: {
                            var9_11 = -var3_6;
                            ** continue;
                        }
                        case -111966891: {
                            if (var8_10 <= var3_6) {
                                ** continue;
                            }
                            ** GOTO lbl157
                        }
                        case -1764650774: {
                            var14_14 ^= var15_4 ^ 703107215;
                            ** continue;
                        }
                    }
                    var15_4 = (var13_3 | var16_2) ^ -1914261292;
                    continue;
lbl157:
                    // 1 sources

                    var15_4 = (var13_3 | var16_2) ^ -535486947;
                    continue;
                    break;
                }
lbl159:
                // 1 sources

                while (true) {
                    var15_4 = (var13_3 | var16_2) ^ 1977024400;
                    ** GOTO lbl192
                    break;
                }
lbl162:
                // 1 sources

                block74: while (true) {
                    switch (var15_4) {
                        case -619187105: {
                            var5_8 = var11_13;
                            ** GOTO lbl188
                        }
                        case 1511196627: {
                            var14_14 ^= var15_4 ^ -1392032498;
                            ** break;
                        }
                        case -459595735: {
                            var14_14 ^= var15_4 ^ -1404759812;
                            ** continue;
                        }
lbl173:
                        // 1 sources

                        var15_4 = (var13_3 | var16_2) ^ 418639882;
lbl174:
                        // 3 sources

                        default: {
                            continue block74;
                        }
                        case -270757899: {
                            var4_7 = var10_12;
                            ** GOTO lbl7
                        }
                        case 1720190516: {
                            if (var11_13 < var5_8) ** break;
                            ** continue;
                            ** GOTO lbl190
                        }
                        case -551690093: 
                    }
                    var14_14 ^= var15_4 ^ 671720014;
                    ** break;
lbl186:
                    // 1 sources

                    var15_4 = (var13_3 | var16_2) ^ 741903264;
                    continue;
lbl188:
                    // 1 sources

                    var15_4 = (var13_3 | var16_2) ^ -1388546004;
                    continue;
lbl190:
                    // 1 sources

                    var15_4 = (var13_3 | var16_2) ^ 674406252;
                }
lbl192:
                // 2 sources

                block75: while (true) {
                    switch (var15_4) {
                        default: {
                            continue block75;
                        }
                        case 321357212: {
                            var14_14 ^= var15_4 ^ -1633542282;
                            ** break;
                        }
                        case 1767482532: {
                            var8_10 = -var3_6;
                            ** GOTO lbl245
                        }
                        case -675896717: {
                            var14_14 ^= var15_4 ^ 684598521;
                            ** GOTO lbl216
                        }
                        case -2097577873: {
                            var14_14 ^= var15_4 ^ -1446609562;
                            ** GOTO lbl214
                        }
                        case 2075419691: {
                            if (var7_9 <= var3_6) {
                                ** continue;
                            }
                            ** GOTO lbl218
                        }
lbl212:
                        // 1 sources

                        var15_4 = (var13_3 | var16_2) ^ -1850742130;
                        continue block75;
lbl214:
                        // 1 sources

                        var15_4 = (var13_3 | var16_2) ^ -1636377765;
                        continue block75;
lbl216:
                        // 1 sources

                        var15_4 = (var13_3 | var16_2) ^ -1935991852;
                        continue block75;
lbl218:
                        // 1 sources

                        var15_4 = (var13_3 | var16_2) ^ -469173661;
                        continue block75;
                        case 1719702897: 
                    }
                    break;
                }
                return var4_7;
lbl222:
                // 3 sources

                block76: while (true) {
                    switch (var15_4) {
                        default: {
                            continue block76;
                        }
                        case 2042227677: {
                            if (var9_11 > var3_6) ** continue;
                            ** continue;
                        }
                        case -188966730: {
                            var14_14 ^= var15_4 ^ 1969552871;
                            ** break;
                        }
                        case -284258108: {
                            var14_14 ^= var15_4 ^ 218046553;
                            var15_4 = (var13_3 | var16_2) ^ -1902734302;
                            continue block76;
                        }
                        case 722378109: {
                            var14_14 ^= var15_4 ^ -1522339735;
                            var15_4 = (var13_3 | var16_2) ^ -1065463510;
                            continue block76;
                        }
                        case -2110056596: {
                            ++var8_10;
                            ** GOTO lbl245
                        }
lbl243:
                        // 1 sources

                        var15_4 = (var13_3 | var16_2) ^ 1964271763;
                        continue block76;
lbl245:
                        // 2 sources

                        var15_4 = (var13_3 | var16_2) ^ 1644097301;
                        ** continue;
                        case 928067285: 
                    }
                    break;
                }
                var10_12 = var2_5.method_10069(var7_9, var8_10, var9_11);
                ** continue;
                case 1743230751: 
            }
            break;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    private void ve(class_310 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH], 36[UNCONDITIONALDOLOOP]], but top level block is 21[SWITCH]
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

    private static int vf(int n2, int n3) {
        int n4 = -303261103;
        int n5 = -713896762;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x3FE15B43)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xFDFE470D;
        n6 ^= (n5 | n4) ^ 0xFDFEFFCC;
        n6 += (n5 | n4) ^ 0xFDFE2022;
        n6 += (n5 | n4) ^ 0xFDFEA677;
        n6 ^= (n5 | n4) ^ 0xFDFE262D;
        n6 ^= (n5 | n4) ^ 0xFDFE7CCF;
        n6 -= (n5 | n4) ^ 0xFDFE9EC3;
        n6 -= (n5 | n4) ^ 0xFDFE4B82;
        return n6 ^= (n5 | n4) ^ 0xFDFE313F;
    }

    /*
     * Unable to fully structure code
     */
    private void vg(class_310 var1_1, String var2_2) {
        block25: {
            block29: {
                block28: {
                    block26: {
                        block27: {
                            block24: {
                                break block29;
lbl1:
                                // 1 sources

                                while (true) {
                                    var4_6 ^= var5_5 ^ 1280056387;
                                    break block24;
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    var5_5 = (var3_4 | var6_3) ^ -1509632801;
                                    break block25;
lbl7:
                                    // 1 sources

                                    while (true) {
                                        var5_5 = (var3_4 | var6_3) ^ 276584142;
                                        break block25;
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var4_6 ^= var5_5 ^ -527565315;
                                        break block26;
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    return;
lbl15:
                                    // 1 sources

                                    return;
lbl17:
                                    // 1 sources

                                    while (true) {
                                        this.notify(var1_1, var2_2, (Boolean)this.b.getValue());
                                        var5_5 = (var3_4 | var6_3) ^ 475495455;
                                        break block25;
                                        break;
                                    }
lbl21:
                                    // 1 sources

                                    while (true) {
                                        if (((Boolean)this.a.getValue()).booleanValue()) break block27;
                                        ** continue;
                                        break;
                                    }
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var4_6 ^= var5_5 ^ -1794875215;
                                        break block28;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var5_5 = (var3_4 | var6_3) ^ 13555604;
                            break block25;
                        }
                        var5_5 = (var3_4 | var6_3) ^ -223424469;
                        break block25;
                    }
                    var5_5 = (var3_4 | var6_3) ^ -2046099682;
                    break block25;
lbl36:
                    // 1 sources

                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ 1048345736;
                        break block25;
                        break;
                    }
                }
                var5_5 = (var3_4 | var6_3) ^ -630550824;
                break block25;
lbl42:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 270767950;
                    break block25;
                    break;
                }
lbl45:
                // 1 sources

                while (true) {
                    var4_6 ^= var5_5 ^ 1834586246;
                    ** continue;
                    break;
                }
            }
            var6_3 = -161394389;
            var3_4 = z.r.y.c & -161394389 ^ -1945516801;
            var5_5 = 0;
            var4_6 = (var3_4 | var6_3) ^ -674695467;
            ** while (true)
        }
        block23: while (true) {
            switch (var5_5) {
                default: {
                    continue block23;
                }
                case 214369748: {
                    ** continue;
                }
                case -300580047: {
                    ** continue;
                }
                case 604199719: {
                    ** continue;
                }
                case 2019764961: {
                    ** continue;
                }
                case -22609301: {
                    ** continue;
                }
                case -297123151: {
                    ** continue;
                }
                case -499209760: {
                    ** continue;
                }
                case -1072322185: {
                    ** continue;
                }
                ** case 1483538720:
lbl76:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void vh(String var1_1) {
        block33: {
            block34: {
                var8_2 = -1499805543;
                var5_3 = z.r.y.c & -1499805543 ^ 1324968947;
                var7_4 = 0;
                var6_5 = (var5_3 | var8_2) ^ -1883006966;
                var7_4 = (var5_3 | var8_2) ^ -1059729717;
                break block33;
lbl7:
                // 1 sources

                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ -1172616792;
                    break block33;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var6_5 ^= var7_4 ^ 1376793482;
                    var7_4 = (var5_3 | var8_2) ^ -951879224;
                    break block33;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    if (!((Boolean)this.c.getValue()).booleanValue()) ** GOTO lbl23
                    var7_4 = (var5_3 | var8_2) ^ 1377182362;
                    break block33;
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ 1508819836;
                    break block33;
                    break;
                }
lbl21:
                // 1 sources

                while (true) {
                    if (!((String)this.a.getValue()).isEmpty()) break block34;
lbl23:
                    // 2 sources

                    var7_4 = (var5_3 | var8_2) ^ -2062240973;
                    break block33;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var6_5 ^= var7_4 ^ 2112197086;
                    var7_4 = (var5_3 | var8_2) ^ -1755450809;
                    break block33;
                    break;
                }
lbl29:
                // 1 sources

                return;
            }
            var7_4 = (var5_3 | var8_2) ^ -1374977942;
            break block33;
lbl34:
            // 1 sources

            while (true) {
                var6_5 ^= var7_4 ^ -399349393;
                var7_4 = (var5_3 | var8_2) ^ 1210020785;
                break block33;
                break;
            }
lbl38:
            // 1 sources

            while (true) {
                var2_6 = "{\"content\":\"" + var1_1.replace(z.r.y.D, z.r.y.o) + "\"}";
                try {
                    var6_5 ^= -262017030;
                    var3_7 = HttpClient.newHttpClient();
                    var6_5 ^= -1274292321;
                    v0 = HttpRequest.newBuilder();
                    block30: while (true) {
                        switch (var6_5) {
                            case -369083886: {
                                var6_5 ^= 908459209;
                                break block30;
                            }
                            case -1956587341: {
                                var6_5 ^= 418549679;
                                break block30;
                            }
                            default: {
                                var6_5 ^= -204750155;
                                continue block30;
                            }
                        }
                        break;
                    }
                    var6_5 ^= -1842169702;
                    var6_5 ^= -2003327716;
                    v1 = v0.uri(URI.create((String)this.a.getValue())).header(z.r.y.f, z.r.y.i).POST(HttpRequest.BodyPublishers.ofString(var2_6));
                    block31: while (true) {
                        switch (var6_5) {
                            case -1429052419: {
                                var6_5 ^= -32741380;
                                break block31;
                            }
                            default: {
                                var6_5 ^= -1618206347;
                                break block31;
                            }
                            case 366998337: {
                                var6_5 ^= 772485653;
                                continue block31;
                            }
                        }
                        break;
                    }
                    var4_9 = v1.build();
                    var6_5 ^= 1546812251;
                    HttpResponse.BodyHandlers.ofString();
                    CompletableFuture.failedFuture(new IllegalStateException());
                    var6_5 ^= -418237519;
                }
                catch (Exception v2) {
                    var6_5 = (var5_3 | var8_2) ^ 1130416382;
                    var3_8 = v2;
                }
                var6_5 ^= 623023033;
                return;
            }
        }
        block32: while (true) {
            switch (var7_4) {
                default: {
                    continue block32;
                }
                case 774776112: {
                    ** continue;
                }
                case 1424007763: {
                    ** continue;
                }
                case 699961907: {
                    ** continue;
                }
                case -1125267103: {
                    ** continue;
                }
                case -1223350137: {
                    ** continue;
                }
                case 1810847944: {
                    ** continue;
                }
                case 2040928700: {
                    ** continue;
                }
                case 1089498001: {
                    ** continue;
                }
                ** case -1494968246:
lbl107:
                // 1 sources

                ** continue;
            }
            break;
        }
    }
}

