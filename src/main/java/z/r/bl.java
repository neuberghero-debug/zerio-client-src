/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 *  net.minecraft.class_634
 *  net.minecraft.class_638
 *  net.minecraft.class_642
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_642;
import z.r.H;
import z.r.W;
import z.r.fI;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class bl {
    private static Map<String, String> a;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    public static final int a;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static class_638 a;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static Map<UUID, String> b;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private static final Map<String, String> c;
    private static final /* synthetic */ String x;
    private static class_634 a;
    private static final /* synthetic */ String y;
    private static final /* synthetic */ String z;
    private static final /* synthetic */ String A;
    private static Map<UUID, String> d;
    private static final /* synthetic */ String B;
    private static final /* synthetic */ String C;
    private static final /* synthetic */ String D;
    private static final int[] a;
    private static final /* synthetic */ String E;
    private static final /* synthetic */ String F;
    private static final /* synthetic */ String G;
    private static final Map<UUID, fI> e;

    private bl() {
        int n2 = a & 0x27273C3 ^ 0x99FB79DB;
        int n3 = (n2 | 0x27273C3) ^ 0x5023E097;
        n3 ^= 0xA5AF26B0;
    }

    /*
     * Exception decompiling
     */
    static void tick(class_310 var0) {
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
    private static Map<String, String> qm(class_642 var0) {
        block24: {
            block19: {
                block20: {
                    block18: {
                        block23: {
                            break block20;
lbl1:
                            // 6 sources

                            block13: while (true) {
                                block21: {
                                    block22: {
                                        block0 : switch (var3_3) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block13;
                                                }
                                                break;
                                            }
                                            case 1030053754: {
                                                var2_4 ^= var3_3 ^ 612572291;
                                                break block21;
                                            }
                                            case 275451280: {
                                                var2_4 ^= var3_3 ^ -690783675;
                                                break;
                                            }
                                            case -1799860968: {
                                                if (var0 == null) break block18;
                                                break block19;
                                            }
                                            case 1934670812: {
                                                var2_4 ^= var3_3 ^ -915939500;
                                                break;
                                            }
lbl18:
                                            // 1 sources

                                            while (true) {
                                                var3_3 = (var1_2 | var4_1) ^ -1021567361;
                                                ** continue;
                                                break;
                                            }
                                            case -921310721: {
                                                if (var0.field_3761 == null) break block18;
                                                break block22;
                                            }
lbl24:
                                            // 1 sources

                                            while (true) {
                                                var2_4 ^= -960989227;
                                                break block0;
                                                break;
                                            }
                                        }
                                        var3_3 = (var1_2 | var4_1) ^ -779080098;
                                        continue;
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ 1402821199;
                                    continue;
                                }
                                var3_3 = (var1_2 | var4_1) ^ 907222817;
                                continue;
                                {
                                    case -1838777983: {
                                        return Map.of();
                                    }
                                }
                                var3_3 = (var1_2 | var4_1) ^ 955748442;
                                continue;
                                break;
                            }
lbl39:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -2109721197;
                                ** GOTO lbl1
                                break;
                            }
                            {
                                case 581378966: {
                                    break;
                                }
                            }
                            if (!var0.field_3761.toLowerCase(Locale.ROOT).contains(bl.F)) break block18;
                            break block23;
                            {
                                case 1977960702: {
                                    return bl.c;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ -1964786144;
                            ** GOTO lbl1
                            {
                                case -1045011892: {
                                    ** continue;
                                }
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ 2123565221;
                        ** GOTO lbl1
                    }
                    var3_3 = (var1_2 | var4_1) ^ 816245763;
                    ** GOTO lbl1
                    {
                        case 2063714181: {
                            ** continue;
                        }
                        ** case -2132129376:
                    }
lbl61:
                    // 1 sources

                    var2_4 ^= var3_3 ^ -822015626;
                    break block24;
                }
                var4_1 = 1121212124;
                var1_2 = bl.a & 1121212124 ^ 1127617871;
                var3_3 = 0;
                var2_4 = (var1_2 | var4_1) ^ -614732429;
                ** while (true)
            }
            var3_3 = (var1_2 | var4_1) ^ 1632728137;
            ** GOTO lbl1
        }
        var3_3 = (var1_2 | var4_1) ^ -682747193;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static String qn(String var0) {
        block41: {
            block36: {
                block38: {
                    block39: {
                        block37: {
                            break block41;
lbl1:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 871289408;
                                break block36;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -846239980;
                                ** GOTO lbl34
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -273618912;
                                ** GOTO lbl34
lbl10:
                                // 1 sources

                                while (true) {
                                    v0 = bl.a.get(var0.toLowerCase(Locale.ROOT));
                                    break block37;
                                    break;
                                }
                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1941166343;
                                    ** GOTO lbl34
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    if (var0 != null) ** continue;
                                    ** GOTO lbl57
                                    break;
                                }
lbl19:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -298590247;
                                    ** continue;
                                    break;
                                }
                                break;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1322346625;
                                ** GOTO lbl34
                                break;
                            }
                        }
lbl26:
                        // 2 sources

                        while (true) {
                            var2_4 ^= 54030795;
                            break block38;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 813094337;
                            ** GOTO lbl34
                            break;
                        }
lbl32:
                        // 1 sources

                        while (true) {
                            block40: {
                                var3_3 = (var1_2 | var4_1) ^ 925455563;
lbl34:
                                // 11 sources

                                block31: while (true) {
                                    switch (var3_3) lbl-1000:
                                    // 2 sources

                                    {
                                        default: {
                                            continue block31;
                                        }
                                        case 1150379528: {
                                            ** continue;
                                        }
                                        case -1030314564: {
                                            break;
                                        }
                                        case 1925430359: {
                                            ** continue;
                                        }
                                        case 2046023566: {
                                            break block39;
                                        }
                                        case -1115250029: {
                                            ** continue;
                                        }
                                        case 1616330249: {
                                            break block40;
                                        }
                                        case -942940273: {
                                            ** continue;
                                        }
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ 1211716580;
                                    continue;
lbl54:
                                    // 2 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -1779904642;
                                        continue block31;
                                        break;
                                    }
                                    break;
                                }
lbl57:
                                // 2 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 846475000;
                                    ** GOTO lbl34
                                    break;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ -2021896928;
                            ** GOTO lbl34
                            {
                                case -1785187008: {
                                    switch (var2_4) {
                                        case 168123038: {
                                            ** continue;
                                        }
                                        case 368721314: {
                                            ** continue;
                                        }
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ 821506569;
                                    ** GOTO lbl-1000
                                }
                                case -985087106: {
                                    var2_4 ^= var3_3 ^ 1295484687;
                                    ** GOTO lbl54
                                }
                                case -976673610: {
                                    var2_4 ^= var3_3 ^ -1708406424;
                                    break block39;
                                }
                            }
                            break;
                        }
lbl77:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1970129755;
                            ** GOTO lbl34
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1613218871;
                    ** GOTO lbl34
                }
                return v0;
            }
            var3_3 = (var1_2 | var4_1) ^ -1876843361;
            ** while (true)
        }
        var4_1 = -172134043;
        var1_2 = bl.a & -172134043 ^ -978681485;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -2000347231;
        ** while (true)
        {
            case 2133706194: {
                ** continue;
            }
            case 1704875496: {
                if (bl.a.isEmpty()) ** continue;
                ** continue;
            }
            case 942708323: {
                v0 = null;
                ** continue;
            }
            ** case 437197143:
        }
lbl103:
        // 1 sources

        var2_4 ^= var3_3 ^ 871831809;
        ** while (true)
    }

    private static int qo(int n2, int n3) {
        int n4 = 1217539895;
        int n5 = -505536074;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x12839074)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xE9DE5CE2;
        n6 ^= (n5 | n4) ^ 0xE9DE9F1C;
        n6 -= (n5 | n4) ^ 0xE9DEDF32;
        n6 ^= (n5 | n4) ^ 0xE9DE0B9D;
        n6 ^= (n5 | n4) ^ 0xE9DE858A;
        n6 += (n5 | n4) ^ 0xE9DE7781;
        return n6 ^= (n5 | n4) ^ 0xE9DE956F;
    }

    /*
     * Exception decompiling
     */
    private static boolean qp(class_638 var0, UUID var1_1) {
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
    static {
        var2 = 1803437733;
        bl.a = mK.a(MethodHandles.lookup().lookupClass(), 1613226315);
        var1_1 = 0;
        var0_2 = -1226481476;
        var1_1 = var2 ^ 889275054;
        ** GOTO lbl105
lbl7:
        // 1 sources

        while (true) {
            var0_2 ^= 1259372356;
            var0_2 ^= -804855305;
            var0_2 ^= 20367179;
            var0_2 ^= -1967132328;
            var0_2 ^= 1076696046;
            var0_2 ^= 1693386812;
            v0 = ((var0_2 ^= 1176606305) | var2) ^ -608779557 ^ bl.a;
            var0_2 ^= -150750172;
            bl.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ v0;
            v1 = v1 + 1;
            v2 = v2;
            v3 = v3 + 4;
            var0_2 ^= -2055235273;
            if (v3 + 4 < v2.length) continue;
            bl.F = gj.decode("vzTi2IY/3Es=", bl.qo(((var0_2 ^= -1428033911) | var2) ^ 2351203, var2 ^ ((var0_2 | var2) ^ -630584559)));
            bl.z = gj.decode("eu+VlQAJ", bl.qo((var0_2 | var2) ^ 2351212, var2 ^ ((var0_2 | var2) ^ 1196810894)));
            bl.C = gj.decode("yaGZsEgQ", bl.qo((var0_2 | var2) ^ 2351213, var2 ^ ((var0_2 | var2) ^ -357315926)));
            bl.h = gj.decode("jfzDK60v", bl.qo((var0_2 | var2) ^ 2351214, var2 ^ ((var0_2 | var2) ^ -1290218348)));
            bl.w = gj.decode("SdC6Gc9wvEHR", bl.qo((var0_2 | var2) ^ 2351215, var2 ^ ((var0_2 | var2) ^ 1760859204)));
            bl.v = gj.decode("grnBnA==", bl.qo((var0_2 | var2) ^ 2351208, var2 ^ ((var0_2 | var2) ^ -1554104190)));
            bl.A = gj.decode("2GoNu5Pmk0Jl", bl.qo((var0_2 | var2) ^ 2351209, var2 ^ ((var0_2 | var2) ^ 1761594686)));
            bl.t = gj.decode("8zV+zd2P", bl.qo((var0_2 | var2) ^ 2351210, var2 ^ ((var0_2 | var2) ^ 521371990)));
            bl.o = gj.decode("fXjBD7+fKA==", bl.qo((var0_2 | var2) ^ 2351211, var2 ^ ((var0_2 | var2) ^ -1521552690)));
            bl.k = gj.decode("yYg6Gi45x08=", bl.qo((var0_2 | var2) ^ 2351220, var2 ^ ((var0_2 | var2) ^ -1578067319)));
            bl.n = gj.decode("M8HLD8V+G91o4BML", bl.qo((var0_2 | var2) ^ 2351221, var2 ^ ((var0_2 | var2) ^ -1647673258)));
            bl.c = gj.decode("KZs7iL3kU7o=", bl.qo((var0_2 | var2) ^ 2351222, var2 ^ ((var0_2 | var2) ^ -392197492)));
            bl.d = gj.decode("TBIl8LCZxxCWPg==", bl.qo((var0_2 | var2) ^ 2351223, var2 ^ ((var0_2 | var2) ^ 1418874843)));
            bl.G = gj.decode("Mm4i", bl.qo((var0_2 | var2) ^ 2351216, var2 ^ ((var0_2 | var2) ^ -609900407)));
            bl.s = gj.decode("bSZCDPk=", bl.qo((var0_2 | var2) ^ 2351217, var2 ^ ((var0_2 | var2) ^ -2068269136)));
            bl.b = gj.decode("kFAwv2ecJew=", bl.qo((var0_2 | var2) ^ 2351218, var2 ^ ((var0_2 | var2) ^ -793014281)));
            bl.E = gj.decode("jseeNnyM", bl.qo((var0_2 | var2) ^ 2351219, var2 ^ ((var0_2 | var2) ^ -500415507)));
            bl.D = gj.decode("hSKzeP4u6knDRSZy", bl.qo((var0_2 | var2) ^ 2351228, var2 ^ ((var0_2 | var2) ^ 305196631)));
            bl.p = gj.decode("+8X34F6ewnsA", bl.qo((var0_2 | var2) ^ 2351229, var2 ^ ((var0_2 | var2) ^ -1749662819)));
            bl.g = gj.decode("SrYjMhqwHoC8vKf7", bl.qo((var0_2 | var2) ^ 2351230, var2 ^ ((var0_2 | var2) ^ -313698838)));
            bl.x = gj.decode("it+6fIoSJg==", bl.qo((var0_2 | var2) ^ 2351231, var2 ^ ((var0_2 | var2) ^ 1030512550)));
            bl.B = gj.decode("slJpXZQ=", bl.qo((var0_2 | var2) ^ 2351224, var2 ^ ((var0_2 | var2) ^ 1006809696)));
            bl.a = gj.decode("l/OV5aJb", bl.qo((var0_2 | var2) ^ 2351225, var2 ^ ((var0_2 | var2) ^ 295965751)));
            bl.f = gj.decode("w0kMH9kcg9AZHs/z7hE=", bl.qo((var0_2 | var2) ^ 2351226, var2 ^ ((var0_2 | var2) ^ 1855633278)));
            bl.e = gj.decode("lnviyhIq", bl.qo((var0_2 | var2) ^ 2351227, var2 ^ ((var0_2 | var2) ^ -1569749742)));
            bl.i = gj.decode("penmLJTv6Is=", bl.qo((var0_2 | var2) ^ 2351172, var2 ^ ((var0_2 | var2) ^ -577959501)));
            bl.y = gj.decode("CPAfVlSfZUyh", bl.qo((var0_2 | var2) ^ 2351173, var2 ^ ((var0_2 | var2) ^ -913442148)));
            bl.u = gj.decode("hKcPlt6oJG++Qpb6", bl.qo((var0_2 | var2) ^ 2351174, var2 ^ ((var0_2 | var2) ^ -2013152061)));
            bl.j = gj.decode("d+2O8g==", bl.qo((var0_2 | var2) ^ 2351175, var2 ^ ((var0_2 | var2) ^ -564729451)));
            bl.l = gj.decode("oaIbA/E=", bl.qo((var0_2 | var2) ^ 2351168, var2 ^ ((var0_2 | var2) ^ -1103297604)));
            bl.r = gj.decode("UKYJZw==", bl.qo((var0_2 | var2) ^ 2351169, var2 ^ ((var0_2 | var2) ^ 1178097042)));
            bl.m = gj.decode("zCSuwA28", bl.qo((var0_2 | var2) ^ 2351170, var2 ^ ((var0_2 | var2) ^ 1574882511)));
            bl.q = gj.decode("V3SerbNc", bl.qo((var0_2 | var2) ^ 2351171, var2 ^ ((var0_2 | var2) ^ -1220704938)));
            var1_1 = var2 ^ -35250273;
            ** GOTO lbl105
            break;
        }
lbl74:
        // 1 sources

        while (true) {
            var1_1 = var2 ^ -1287344109;
            if (true) ** GOTO lbl105
            break;
        }
lbl77:
        // 1 sources

        while (true) {
            continue;
            break;
        }
lbl79:
        // 2 sources

        while (true) {
            v4[v5] = Map.entry(bl.f, bl.B);
            v6 = bl.qo((var0_2 | var2) ^ 279148554, var2 ^ ((var0_2 | var2) ^ 1861097587));
            v4[v6] = Map.entry(bl.e, bl.i);
            v7 = var0_2 ^= 260533459;
            v8 = var0_2;
            v4[bl.qo((int)((v7 | var2) ^ 337793113), (int)(var2 ^ ((v8 | var2) ^ 298934789)))] = Map.entry(bl.y, bl.i);
            v9 = var0_2 ^= -1508560425;
            v10 = var0_2;
            v4[bl.qo((int)((v9 | var2) ^ -1876729592), (int)(var2 ^ ((v10 | var2) ^ 1515369248)))] = Map.entry(bl.u, bl.j);
            v11 = var0_2 ^= -1012792425;
            v12 = var0_2;
            v4[bl.qo((int)((v11 | var2) ^ 279142427), (int)(var2 ^ ((v12 | var2) ^ -1651544476)))] = Map.entry(bl.l, bl.j);
            v13 = var0_2 ^= 1088451049;
            v14 = var0_2;
            v4[bl.qo((int)((v13 | var2) ^ 270750044), (int)(var2 ^ ((v14 | var2) ^ -1870995799)))] = Map.entry(bl.r, bl.j);
            v15 = bl.qo(((var0_2 ^= -361202630) | var2) ^ -1876727481, var2 ^ ((var0_2 | var2) ^ -1921519036));
            v4[v15] = Map.entry(bl.m, bl.j);
            v16 = bl.qo(((var0_2 ^= -1324650978) | var2) ^ 2244958, var2 ^ ((var0_2 | var2) ^ -1663898381));
            var0_2 ^= -955614005;
            v4[v16] = Map.entry(bl.q, bl.j);
            var0_2 ^= 1021058139;
            bl.c = Map.ofEntries(v4);
            ** continue;
            break;
        }
        block23: while (true) {
            var1_1 = var2 ^ -787853049;
lbl105:
            // 4 sources

            block24: while (true) {
                block26: {
                    switch (var1_1) {
                        default: {
                            continue block24;
                        }
                        case 845583256: {
                            bl.e = new LinkedHashMap<K, V>();
                            var1_1 = var2 ^ 992101247;
                            continue block24;
                        }
                        case 1348208090: {
                            var0_2 ^= var1_1 ^ 2007713739;
                            var1_1 = var2 ^ -793084357;
                            continue block24;
                        }
                        case -2016554050: {
                            var0_2 ^= var1_1 ^ 781075813;
                            var1_1 = var2 ^ -1101381896;
                            continue block24;
                        }
                        case -1144768354: {
                            bl.b = new HashMap<K, V>();
                            var1_1 = var2 ^ 1224256234;
                            continue block24;
                        }
                        case -667224394: {
                            var0_2 ^= var1_1 ^ 699636059;
                            var1_1 = var2 ^ 1494799677;
                            continue block24;
                        }
                        case 596044879: {
                            var0_2 ^= var1_1 ^ 923692178;
                            var1_1 = var2 ^ 2014646386;
                            continue block24;
                        }
                        case -1768400582: {
                            var0_2 ^= var1_1 ^ 403093653;
                            var1_1 = var2 ^ -42216285;
                            continue block24;
                        }
                        case -719030179: {
                            v1 = 0;
                            v3 = 0;
                            break;
                        }
                        case -1939490072: {
                            bl.a = Map.of();
                            return;
                        }
                        case -1166796894: {
                            var0_2 ^= var1_1 ^ -1392237319;
                            var1_1 = var2 ^ -417596339;
                            continue block24;
                        }
                        case -1778019834: {
                            v4 = new Map.Entry[bl.qo((var0_2 | var1_1 ^ -42216285) ^ (var1_1 ^ 312922944), var1_1 ^ -42216285 ^ ((var0_2 | var1_1 ^ -42216285) ^ (var1_1 ^ -1927868042)))];
                            var0_2 ^= -460160338;
                            v4[0] = Map.entry(bl.C, bl.h);
                            var0_2 ^= 880847344;
                            v4[1] = Map.entry(bl.w, bl.h);
                            var0_2 ^= 1591333677;
                            v4[2] = Map.entry(bl.v, bl.A);
                            var0_2 ^= -1681467826;
                            v4[3] = Map.entry(bl.t, bl.A);
                            var0_2 ^= 141863894;
                            v4[4] = Map.entry(bl.o, bl.A);
                            v4[5] = Map.entry(bl.k, bl.A);
                            v17 = bl.qo(((var0_2 ^= -183454779) | var2) ^ 77754701, var2 ^ ((var0_2 | var2) ^ 1325584441));
                            break block23;
                        }
                        case 325801687: {
                            bl.d = new HashMap<K, V>();
                            continue block23;
                        }
                        case 1585382411: {
                            break block26;
                        }
                    }
                    bl.a = new int[((var0_2 ^= 1395425816) | var2) ^ 1878947524];
                    var0_2 ^= 1413972976;
                    v2 = "^*\u0019#\u008b5g\u00d8\u00d0\u00c2j.\u00d7\u008c!\u009c\u00d7\u0007\u0099\u00a4\u0017\u00b7\u00cd\u00ad\u00b1^\u00e4#]\u00fbP\u008b\u0011{O\u0096f\u00d3\u00c0\u00b3f2\u0003\u0084`\u00bc\u00a4\u00bf\u0001\f\u0018\u00ad\u0007\u00d3T\u00b1u\u00fct\u00bf\u000fZ\u0087\u001b\u00dd\u00b8/\u00b9n\u00e6}\u00d5\u00c6\u0006\u00bexUC*\u000b\u00ca\u00b6\u00cb\u00eb.\u001d\u00f8\u00ff\u00e8 \u00b4\u0086g\u00a3\u008a\u0080?\u00dd\u0089\u0094!\"\u001d\u0017@\f\u00fb\u00de\u00eaH\u00fa\u00a1y@\u00c0\u00f3\u00a0\u000b\u00b6\u008a>\u00f7+\u00bbo,\u009f\u00c69\u00bf\u00a9\u00dd\u00e0\u00e9\u00a9XCw\u0012\u007f\u001f\u00c1\u00a9\u0094\r\by\u00ff\u00cb,\u008eR\u0010\u00a4}l\u00b4\u001f\u0081\u00a2M\u008f\u00de\u009d\u0099\u009e\u00bd\u00b9\u00e6Q\u00eb\u0010\u0017\u001f8\u00b3\u00d5~r\u00dc\u008b\u0006\u00e5\u0007|\u00ac1,\u0089\u008b\u00e3\\cqOV\u00afqr\u00ac\u00d0t\u00138\u0093\u007f\u00d4;\u00acs|\u00f9\u00d7\u00cd.\u00dd\u0018O\u00ce\u00a6_\u0012\u0012\u00f0Rg\u0093y\u00cfj\u0087\u009eN\u00ce\u00b17".getBytes("ISO-8859-1");
                    ** continue;
                }
                var1_1 = var2 ^ -323775205;
            }
            break;
        }
        v4[v17] = Map.entry(bl.n, bl.A);
        v18 = var0_2 ^= -475103094;
        v19 = var0_2;
        v4[bl.qo((int)((v18 | var2) ^ -2078084796), (int)(var2 ^ ((v19 | var2) ^ -1337129314)))] = Map.entry(bl.c, bl.A);
        v20 = var0_2 ^= -1603192231;
        v21 = var0_2;
        v4[bl.qo((int)((v20 | var2) ^ 69454109), (int)(var2 ^ ((v21 | var2) ^ -1056772811)))] = Map.entry(bl.d, bl.G);
        v22 = var0_2 ^= -435642300;
        v23 = var0_2;
        ** while (true)
        v4[bl.qo((int)((v22 | var2) ^ -2145162918), (int)(var2 ^ ((v23 | var2) ^ -2023553250)))] = Map.entry(bl.s, bl.G);
        v24 = bl.qo(((var0_2 ^= -1338705056) | var2) ^ 270782491, var2 ^ ((var0_2 | var2) ^ 1226516869));
        v4[v24] = Map.entry(bl.b, bl.E);
        v25 = bl.qo(((var0_2 ^= -181621990) | var2) ^ -2078050046, var2 ^ ((var0_2 | var2) ^ 716264616));
        v4[v25] = Map.entry(bl.D, bl.E);
        v26 = var0_2 ^= 544085648;
        v27 = var0_2;
        v4[bl.qo((int)((v26 | var2) ^ -2078054125), (int)(var2 ^ ((v27 | var2) ^ -543779128)))] = Map.entry(bl.p, bl.E);
        v28 = var0_2 ^= -600030094;
        v29 = var0_2;
        v4[bl.qo((int)((v28 | var2) ^ 270756190), (int)(var2 ^ ((v29 | var2) ^ -1586742644)))] = Map.entry(bl.g, bl.E);
        v30 = bl.qo(((var0_2 ^= 1009054107) | var2) ^ 69457989, var2 ^ ((var0_2 | var2) ^ 2037167708));
        v4[v30] = Map.entry(bl.x, bl.B);
        v31 = bl.qo(((var0_2 ^= 1125844451) | var2) ^ 69392644, var2 ^ ((var0_2 | var2) ^ 107533966));
        v4[v31] = Map.entry(bl.a, bl.B);
        v5 = bl.qo(((var0_2 ^= -1683645724) | var2) ^ -1801240251, var2 ^ ((var0_2 | var2) ^ -706573827));
        while (true) {
            switch (var0_2) {
                case 752662548: {
                    var0_2 ^= -313901587;
                    ** GOTO lbl79
                }
                default: {
                    var0_2 ^= -190555734;
                    ** continue;
                }
                case 997984352: 
            }
            var0_2 ^= -1013950135;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static void clear() {
        int n2 = 486712431;
        int n3 = a & 0x1D02A46F ^ 0xB2985810;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xB120B86;
        n4 = (n3 | n2) ^ 0x437609C8;
        block17: while (true) {
            switch (n4) {
                default: {
                    continue block17;
                }
                case -810260980: {
                    n5 ^= n4 ^ 0xF0495FF0;
                    n4 = (n3 | n2) ^ 0xD16F1DED;
                    continue block17;
                }
                case -51579465: {
                    n4 = (n3 | n2) ^ 0xD52CE244;
                    continue block17;
                }
                case 11070146: {
                    a = Map.of();
                    n4 = (n3 | n2) ^ 0xB640D85F;
                    continue block17;
                }
                case -1066933032: {
                    return;
                }
                case -863610087: {
                    a = null;
                    n4 = (n3 | n2) ^ 0x2D29FF59;
                    continue block17;
                }
                case 165291040: {
                    n5 ^= n4 ^ 0x33B9150F;
                    n4 = (n3 | n2) ^ 0x7FFD18A7;
                    continue block17;
                }
                case -1975842739: {
                    n5 ^= n4 ^ 0x75BFB8FC;
                    n4 = (n3 | n2) ^ 0x3A432D8A;
                    continue block17;
                }
                case -2049322507: {
                    b.clear();
                    n4 = (n3 | n2) ^ 0x702E9A73;
                    continue block17;
                }
                case -1589590328: {
                    e.clear();
                    n4 = (n3 | n2) ^ 0x35A1F432;
                    continue block17;
                }
                case 1012006144: {
                    a = null;
                    n4 = (n3 | n2) ^ 0xE16F5AC2;
                    continue block17;
                }
                case 1593157309: {
                    n5 ^= n4 ^ 0x50357169;
                    n4 = (n3 | n2) ^ 0x731CA766;
                    continue block17;
                }
                case -1824142552: {
                    n5 ^= n4 ^ 0x768DDE42;
                    n4 = (n3 | n2) ^ 0x83CB017F;
                    continue block17;
                }
                case -1833762010: {
                    n5 ^= n4 ^ 0x88B446DE;
                    n4 = (n3 | n2) ^ 0xBF3216BD;
                    continue block17;
                }
                case 1861607826: {
                    d.clear();
                    n4 = (n3 | n2) ^ 0x2CDF3757;
                    continue block17;
                }
                case 1790320187: 
            }
            n5 ^= n4 ^ 0x1BD91E2A;
            n4 = (n3 | n2) ^ 0x1EDA3AB7;
        }
    }

    /*
     * Exception decompiling
     */
    static void render(W var0, H var1_1, long var2_2) {
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

