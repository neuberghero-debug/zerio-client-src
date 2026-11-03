/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1792
 *  net.minecraft.class_2338
 *  net.minecraft.class_2586
 *  net.minecraft.class_2589
 *  net.minecraft.class_2595
 *  net.minecraft.class_2601
 *  net.minecraft.class_2609
 *  net.minecraft.class_2611
 *  net.minecraft.class_2614
 *  net.minecraft.class_2627
 *  net.minecraft.class_2636
 *  net.minecraft.class_2646
 *  net.minecraft.class_310
 *  net.minecraft.class_3719
 *  net.minecraft.class_4588
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2589;
import net.minecraft.class_2595;
import net.minecraft.class_2601;
import net.minecraft.class_2609;
import net.minecraft.class_2611;
import net.minecraft.class_2614;
import net.minecraft.class_2627;
import net.minecraft.class_2636;
import net.minecraft.class_2646;
import net.minecraft.class_310;
import net.minecraft.class_3719;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import z.r.aE;
import z.r.az;
import z.r.gF;
import z.r.gP;
import z.r.gj;
import z.r.iG;
import z.r.ke;
import z.r.lA;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class ie
extends gF {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private final aE a;
    private final lA a;
    private final lA b;
    private static final /* synthetic */ String k;
    private static final float a;
    private static final /* synthetic */ String c;
    private final ke a;
    private static final /* synthetic */ String d;
    private final iG a;
    private final lA c;
    public static boolean a;
    private final lA d;
    private final ke b;
    private static final /* synthetic */ String e;
    public static final int a;
    private final gP a;
    private static final /* synthetic */ String f;
    private final lA e;
    private final lA f;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private final Set<class_2338> a;
    private final lA g;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private final gP b;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final int[] a;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private final lA h;
    private static final /* synthetic */ String w;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var2 = -1801699739;
        ie.a = mK.a(MethodHandles.lookup().lookupClass(), 1542058239);
        var1_1 = 0;
        var0_2 = 263282817;
        var1_1 = var2 ^ -699381245;
        if (true) ** GOTO lbl67
        while (true) {
            var0_2 ^= -1565484651;
            var0_2 ^= 1547253634;
            var0_2 ^= 2130567551;
            var0_2 ^= -963077280;
            var0_2 ^= 1981873878;
            var0_2 ^= -130339907;
            v0 = ((var0_2 ^= -348213077) | var2) ^ -1182147380 ^ ie.a;
            var0_2 ^= 1763857270;
            ie.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ v0;
            v1 = v1 + 1;
            v2 = v2;
            v3 = v3 + 4;
            var0_2 ^= 1256972990;
            if (v3 + 4 < v2.length) continue;
            ie.a = 0.002f;
            ie.k = gj.decode("UIJZD/0+cvPzug==", ie.LH(((var0_2 ^= 583844462) | var2) ^ -763958973, var2 ^ ((var0_2 | var2) ^ -1320170837)));
            ie.s = gj.decode("bYLL07bL/4IZ3TbZYx7mCXvBXFQdnUgddbs4WKeXvMk=", ie.LH((var0_2 | var2) ^ -763958974, var2 ^ ((var0_2 | var2) ^ -293761458)));
            ie.e = gj.decode("nUgnS5aYe0U=", ie.LH((var0_2 | var2) ^ -763958971, var2 ^ ((var0_2 | var2) ^ 227775239)));
            ie.o = gj.decode("R+4nuNw=", ie.LH((var0_2 | var2) ^ -763958972, var2 ^ ((var0_2 | var2) ^ -463094331)));
            ie.q = gj.decode("nDBu19cGrwfMRjj7ZA==", ie.LH((var0_2 | var2) ^ -763958969, var2 ^ ((var0_2 | var2) ^ -914387228)));
            ie.f = gj.decode("Dv/2lu4tSSiHKtg=", ie.LH((var0_2 | var2) ^ -763958970, var2 ^ ((var0_2 | var2) ^ 1211047851)));
            ie.r = gj.decode("5uVrckwzwEiPx1U=", ie.LH((var0_2 | var2) ^ -763958967, var2 ^ ((var0_2 | var2) ^ -1069712604)));
            ie.u = gj.decode("Y8byMunB", ie.LH((var0_2 | var2) ^ -763958968, var2 ^ ((var0_2 | var2) ^ -913569653)));
            ie.h = gj.decode("Kx4CBJoCCA==", ie.LH((var0_2 | var2) ^ -763958965, var2 ^ ((var0_2 | var2) ^ 1268450159)));
            ie.b = gj.decode("/ZXjJ7ey", ie.LH((var0_2 | var2) ^ -763958966, var2 ^ ((var0_2 | var2) ^ -98792230)));
            ie.l = gj.decode("RDEn55XPHA==", ie.LH((var0_2 | var2) ^ -763958963, var2 ^ ((var0_2 | var2) ^ 304673758)));
            ie.i = gj.decode("v4RVHQ==", ie.LH((var0_2 | var2) ^ -763958964, var2 ^ ((var0_2 | var2) ^ -1931293579)));
            ie.n = gj.decode("8yq6E18VCQ==", ie.LH((var0_2 | var2) ^ -763958961, var2 ^ ((var0_2 | var2) ^ 786937097)));
            ie.d = gj.decode("+4blrA==", ie.LH((var0_2 | var2) ^ -763958962, var2 ^ ((var0_2 | var2) ^ -1300220422)));
            ie.p = gj.decode("gKQYHlQ=", ie.LH((var0_2 | var2) ^ -763958927, var2 ^ ((var0_2 | var2) ^ -1527568725)));
            ie.c = gj.decode("jZiNdQ==", ie.LH((var0_2 | var2) ^ -763958928, var2 ^ ((var0_2 | var2) ^ 1634644487)));
            ie.t = gj.decode("+WLGxjAprjtfkR3GJUGM5HAzU/QCfg8JATfL9AI=", ie.LH((var0_2 | var2) ^ -763958925, var2 ^ ((var0_2 | var2) ^ -1422430611)));
            ie.g = gj.decode("FFGe7cT0hRFm0DH77Zj4", ie.LH((var0_2 | var2) ^ -763958926, var2 ^ ((var0_2 | var2) ^ -132842080)));
            ie.a = gj.decode("bueglGbNsGKqHgHbuZ/tS4OVHRzoyNQ=", ie.LH((var0_2 | var2) ^ -763958923, var2 ^ ((var0_2 | var2) ^ -1186934747)));
            ie.v = gj.decode("FSrWoLuxyQ==", ie.LH((var0_2 | var2) ^ -763958924, var2 ^ ((var0_2 | var2) ^ 917769338)));
            ie.w = gj.decode("ijEA+fLxCdlrT6M=", ie.LH((var0_2 | var2) ^ -763958921, var2 ^ ((var0_2 | var2) ^ 96800008)));
            ie.m = gj.decode("eVPeGDH/XQ==", ie.LH((var0_2 | var2) ^ -763958922, var2 ^ ((var0_2 | var2) ^ 960120847)));
            ie.j = gj.decode("/FNe8Jw=", ie.LH((var0_2 | var2) ^ -763958919, var2 ^ ((var0_2 | var2) ^ 720454614)));
            var1_1 = var2 ^ -377826021;
            if (true) ** GOTO lbl67
            block8: while (true) {
                var1_1 = var2 ^ -519915756;
lbl67:
                // 3 sources

                block9: while (true) {
                    switch (var1_1) {
                        default: {
                            continue block9;
                        }
                        case 1973324145: {
                            ie.a = false;
                            return;
                        }
                        case 1251662739: {
                            var0_2 ^= var1_1 ^ 991751342;
                            var1_1 = var2 ^ 887659287;
                            continue block9;
                        }
                        case 1120695398: {
                            var1_1 = var2 ^ -569973258;
                            continue block9;
                        }
                        case 2112285566: {
                            var0_2 ^= var1_1 ^ 533315552;
                            continue block8;
                        }
                        case -1602968206: 
                    }
                    break;
                }
                break;
            }
            v1 = 0;
            v3 = 0;
            v2 = "\u00c1(\u00b2n\u0094\u0086\u00b9\u0089\f\u000b0n6\u00d5\u00e6\u00c8\u00ce\u00872\u000f\u00ecK\u00bb\u007f\u00b4\u00a8\u00fbo\u00b9\"8\u00e5\u00ebl\u008c\u00b5U\u00a2Z\u009c\u00d22\u00bc?A\u00a8\u0083\u00de\u0015\u0010\u00fd\u00a8$r\u0091\b\u00968^z%\u00a0\u00d4\u00a3.\u00ba\u00a9\u00f7\u0085|$\u00b8\u00a9\u0099\f'\u00baP8\u001fm\u00b2@p\u00fbi\u00d7\u00dd\u00eb\u00cf\u00a8\u00be(\u00e4\u00fd%\u0091D\u00ff\u001ewE\u00aa\u001e\u0012\u0014\u00b9\u001eF\u00fb@\u00c9m\u0087\u0015\u008b?\u00b1\u00b6\u0019\u001f\u008dc^{gD\u00bc\u0092+\u0081\u00ddb\u00b9\u00c1\u00f1\u00bdD\u00b7_l\u00aa\u001d\u0007\u00c7\u00e6\u00b6\u00bf\u00e1y\fc\u0084,\u0080\u00da\u0081\u00ca\u00fe{tv\u00c4\u0096".getBytes("ISO-8859-1");
            ie.a = new int[((var0_2 ^= 1362224092) | var2) ^ -1080115636];
            var0_2 ^= 1844138348;
        }
    }

    /*
     * Exception decompiling
     */
    public ie() {
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
    public iG getStoragesGroup() {
        int n2 = a & 0x4A2B3FD4 ^ 0x84F024CE;
        int n3 = 0;
        int n4 = (n2 | 0x4A2B3FD4) ^ 0x22D4DEB2;
        n3 = (n2 | 0x4A2B3FD4) ^ 0x93224F37;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1574531305: {
                    n3 = (n2 | 0x4A2B3FD4) ^ 0x2EC1F2BD;
                    continue block5;
                }
                case -533017245: {
                    n4 ^= n3 ^ 0xE1AC8824;
                    n3 = (n2 | 0x4A2B3FD4) ^ 0xD318254C;
                    continue block5;
                }
                case 501422738: 
            }
            break;
        }
        return this.a;
    }

    /*
     * Unable to fully structure code
     */
    private lA LB(String var1_1, class_1792 var2_2, int var3_3, boolean var4_4) {
        block27: {
            block25: {
                block29: {
                    block30: {
                        block28: {
                            block26: {
                                break block30;
lbl1:
                                // 1 sources

                                block11: while (true) {
                                    switch (var10_7) lbl-1000:
                                    // 3 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block11;
                                            }
                                            break;
                                        }
lbl6:
                                        // 1 sources

                                        while (true) {
                                            var9_8 ^= 1440955298;
                                            break block25;
                                            break;
                                        }
lbl9:
                                        // 1 sources

                                        while (true) {
                                            var9_8 ^= var10_7 ^ -907459001;
                                            break block26;
                                            break;
                                        }
lbl12:
                                        // 1 sources

                                        while (true) {
                                            var10_7 = (var8_6 | var11_5) ^ 779940007;
                                            break block27;
                                            break;
                                        }
                                        case 1155332068: {
                                            var5_9 = new iG(var1_1, var2_2);
                                            ** continue;
                                        }
lbl18:
                                        // 1 sources

                                        while (true) {
                                            var10_7 = (var8_6 | var11_5) ^ -1672564222;
                                            break block27;
                                            break;
                                        }
                                        case 319698556: {
                                            break block28;
                                        }
lbl23:
                                        // 1 sources

                                        while (true) {
                                            var7_11 = var5_9.add(new az(ie.j, var3_3));
                                            break block29;
                                            break;
                                        }
lbl26:
                                        // 1 sources

                                        while (true) {
                                            var10_7 = (var8_6 | var11_5) ^ -1145205669;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl29:
                                        // 1 sources

                                        return new lA(var5_9, var6_10, var7_11);
lbl31:
                                        // 1 sources

                                        while (true) {
                                            var10_7 = (var8_6 | var11_5) ^ -328249917;
                                            ** continue;
                                            break;
                                        }
lbl34:
                                        // 1 sources

                                        while (true) {
                                            this.a.add(var5_9);
                                            ** continue;
                                            break;
                                        }
                                        case -1569800430: {
                                            var9_8 ^= var10_7 ^ -673022158;
                                            break block11;
                                        }
                                    }
                                    break;
                                }
                                ** while (true)
lbl42:
                                // 1 sources

                                while (true) {
                                    var9_8 ^= 894836036;
                                    ** continue;
                                    break;
                                }
                            }
                            var10_7 = (var8_6 | var11_5) ^ -2125976557;
                            break block27;
                        }
                        var10_7 = (var8_6 | var11_5) ^ 1561314477;
                        ** while (true)
                    }
                    var11_5 = -352318548;
                    var8_6 = ie.a & -352318548 ^ -178161613;
                    var10_7 = 0;
                    var9_8 = (var8_6 | var11_5) ^ -537181730;
                    ** while (true)
                }
                var10_7 = (var8_6 | var11_5) ^ -568534;
                break block27;
lbl60:
                // 1 sources

                while (true) {
                    var9_8 ^= var10_7 ^ -1757985252;
                    ** continue;
                    break;
                }
            }
            var6_10 = var5_9.add(new ke(ie.m, var4_4));
            ** while (true)
        }
        block24: while (true) {
            switch (var10_7) {
                default: {
                    continue block24;
                }
                case 9840789: {
                    ** continue;
                }
                case 1664076221: {
                    ** continue;
                }
                case 2116638636: {
                    ** continue;
                }
                ** case -786593000:
lbl78:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onEnable() {
        var4_1 = -1188661516;
        var1_2 = ie.a & -1188661516 ^ -682722771;
        var3_3 = 0;
        ** GOTO lbl40
lbl5:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 1904876611;
            ** GOTO lbl56
lbl8:
            // 1 sources

            return;
lbl10:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ 1010914088;
                ** GOTO lbl33
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                this.a.clear();
                ** GOTO lbl43
                break;
            }
lbl16:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 573500266;
                if (true) ** GOTO lbl56
                break;
            }
            break;
        }
        block23: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1404869939;
            if (true) ** GOTO lbl56
            block24: while (true) {
                ie.a = true;
                if (true) ** GOTO lbl48
                block25: while (true) {
                    switch (var2_4) {
                        default: {
                            var3_3 = (var1_2 | var4_1) ^ -1830620634;
                            ** GOTO lbl56
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 1679040809;
                            ** GOTO lbl45
                            break;
                        }
lbl33:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ -2079977814;
                        ** GOTO lbl56
lbl35:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 1836148898;
                            break;
                        }
                        var3_3 = (var1_2 | var4_1) ^ 1962740412;
                        ** GOTO lbl56
lbl40:
                        // 1 sources

                        var2_4 = (var1_2 | var4_1) ^ 1616888155;
                        var3_3 = (var1_2 | var4_1) ^ -1258523161;
                        ** GOTO lbl56
lbl43:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 983279419;
                        ** GOTO lbl56
lbl45:
                        // 2 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -631554390;
                            ** GOTO lbl56
                            break;
                        }
lbl48:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 328677693;
                        ** GOTO lbl56
                        case -1506019204: {
                            var3_3 = (var1_2 | var4_1) ^ 1064225915;
                            ** GOTO lbl56
lbl53:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -1862722222;
                                continue block23;
                                break;
                            }
lbl56:
                            // 12 sources

                            block30: while (true) {
                                switch (var3_3) {
                                    default: {
                                        continue block30;
                                    }
                                    case -1953270719: {
                                        ** continue;
                                    }
                                    case -319207488: {
                                        ** continue;
                                    }
                                    case -582969961: {
                                        ** continue;
                                    }
                                    case -1897635138: {
                                        ** continue;
                                    }
                                    case 624246871: {
                                        continue block25;
                                    }
                                    case 2070442071: {
                                        continue block24;
                                    }
                                    case -1073696122: {
                                        ** continue;
                                    }
                                    case 1267862298: {
                                        ** continue;
                                    }
                                    case 1395465264: {
                                        ** continue;
                                    }
                                    case -973743674: {
                                        ** continue;
                                    }
                                    case 1837927643: {
                                        ** continue;
                                    }
                                    case 1294208743: 
                                }
                                var2_4 ^= var3_3 ^ 682559912;
                                continue block23;
                                break;
                            }
                        }
                        case 2117105945: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ -1303744486;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        int n2 = 221388907;
        int n3 = a & 0xD32206B ^ 0x24BFBFE9;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x8E6782F3;
        n4 = (n3 | n2) ^ 0x64D1AC30;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1596919048: {
                    a = false;
                    n4 = (n3 | n2) ^ 0x38E37F62;
                    continue block7;
                }
                case 1026618643: {
                    return;
                }
                case 358400137: {
                    n5 ^= n4 ^ 0xE7325C97;
                    n4 = (n3 | n2) ^ 0x108F4AF8;
                    continue block7;
                }
                case 1231950811: {
                    n4 = (n3 | n2) ^ 0x96C2249C;
                    continue block7;
                }
                case -1149396105: 
            }
            n5 ^= n4 ^ 0x712A73AE;
            n4 = (n3 | n2) ^ 0x8D6F4D13;
        }
    }

    /*
     * Exception decompiling
     */
    public void trackInteraction(class_2338 var1_1) {
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
    public void render(WorldRenderContext var1_1, class_310 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [324[UNCONDITIONALDOLOOP]], but top level block is 350[UNCONDITIONALDOLOOP]
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
    private lA LC(class_2586 var1_1) {
        block82: {
            block83: {
                block89: {
                    block91: {
                        block94: {
                            block92: {
                                block85: {
                                    block87: {
                                        block90: {
                                            block93: {
                                                block88: {
                                                    block84: {
                                                        block95: {
                                                            block86: {
                                                                var5_2 = 990581755;
                                                                var2_3 = ie.a & 990581755 ^ 2036954339;
                                                                var4_4 = 0;
                                                                ** GOTO lbl149
                                                                while (true) {
                                                                    var4_4 = (var2_3 | var5_2) ^ -1268610052;
                                                                    ** GOTO lbl83
lbl8:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ -1071407170;
                                                                        ** GOTO lbl83
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl11:
                                                                // 1 sources

                                                                while (true) {
                                                                    var4_4 = (var2_3 | var5_2) ^ 1013496113;
                                                                    ** GOTO lbl83
lbl14:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_5 ^= var4_4 ^ -1808437001;
                                                                        break block82;
                                                                        break;
                                                                    }
lbl17:
                                                                    // 1 sources

                                                                    while (var1_1 instanceof class_2627) {
                                                                        break block83;
                                                                    }
                                                                    break block84;
lbl20:
                                                                    // 1 sources

                                                                    return this.a;
lbl22:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_5 ^= var4_4 ^ -664182708;
                                                                        ** GOTO lbl167
                                                                        break;
                                                                    }
lbl25:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ -829130848;
                                                                        ** GOTO lbl83
                                                                        break;
                                                                    }
                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ -1716629149;
                                                                        ** GOTO lbl83
                                                                        break;
                                                                    }
lbl31:
                                                                    // 1 sources

                                                                    while (var1_1 instanceof class_2646) {
                                                                        ** continue;
lbl33:
                                                                        // 1 sources

                                                                        ** GOTO lbl25
                                                                    }
                                                                    break block85;
lbl35:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ 1088938898;
                                                                        ** GOTO lbl83
                                                                        break;
                                                                    }
lbl38:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ -299433894;
                                                                        ** GOTO lbl83
lbl41:
                                                                        // 1 sources

                                                                        while (var1_1 instanceof class_2609) {
                                                                            break block86;
                                                                        }
                                                                        ** GOTO lbl126
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl44:
                                                                // 1 sources

                                                                while (true) {
                                                                    var4_4 = (var2_3 | var5_2) ^ 2069591837;
                                                                    ** GOTO lbl83
lbl47:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_5 ^= var4_4 ^ 1468745321;
                                                                        ** continue;
                                                                        break;
                                                                    }
lbl50:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_5 ^= var4_4 ^ -1448021463;
                                                                        break block87;
                                                                        break;
                                                                    }
lbl53:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ -857491807;
                                                                        ** GOTO lbl83
lbl56:
                                                                        // 1 sources

                                                                        while (var1_1 instanceof class_2614) {
                                                                            break block88;
lbl58:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var4_4 = (var2_3 | var5_2) ^ -275645343;
                                                                                ** GOTO lbl83
                                                                                break;
                                                                            }
lbl61:
                                                                            // 1 sources

                                                                            return this.h;
lbl63:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var3_5 ^= var4_4 ^ -1725284654;
                                                                                break block89;
                                                                                break;
                                                                            }
                                                                        }
                                                                        break block90;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            var4_4 = (var2_3 | var5_2) ^ 2087126811;
                                                            ** GOTO lbl83
lbl70:
                                                            // 1 sources

                                                            return this.c;
lbl72:
                                                            // 1 sources

                                                            while (true) {
                                                                var3_5 ^= var4_4 ^ 959484032;
                                                                break block91;
                                                                break;
                                                            }
lbl75:
                                                            // 1 sources

                                                            while (true) {
                                                                if (!(var1_1 instanceof class_2595)) ** continue;
                                                                ** GOTO lbl160
                                                                break;
                                                            }
lbl78:
                                                            // 1 sources

                                                            while (true) {
                                                                var3_5 ^= var4_4 ^ -820097770;
                                                                ** continue;
                                                                break;
                                                            }
lbl81:
                                                            // 1 sources

                                                            block70: while (true) {
                                                                var4_4 = (var2_3 | var5_2) ^ -1129192149;
lbl83:
                                                                // 33 sources

                                                                block71: while (true) {
                                                                    switch (var4_4) lbl-1000:
                                                                    // 11 sources

                                                                    {
                                                                        while (true) {
                                                                            default: {
                                                                                continue block71;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case -490396008: {
                                                                            ** continue;
                                                                        }
                                                                        case -941976880: {
                                                                            ** GOTO lbl17
                                                                        }
                                                                        case 1715166364: {
                                                                            ** continue;
                                                                        }
                                                                        case -1906639619: {
                                                                            ** continue;
                                                                        }
                                                                        case -51337878: {
                                                                            ** GOTO lbl31
                                                                        }
                                                                        case -2067537631: {
                                                                            ** GOTO lbl41
                                                                        }
                                                                        case -1430192819: {
                                                                            ** continue;
                                                                        }
                                                                        case 931925982: {
                                                                            break;
                                                                        }
                                                                        case -1241579429: {
                                                                            ** continue;
                                                                        }
                                                                        case 1038470613: {
                                                                            ** GOTO lbl56
                                                                        }
                                                                        case -1795519590: {
                                                                            ** continue;
                                                                        }
                                                                        case 1212888734: {
                                                                            ** continue;
                                                                        }
                                                                        case -222483828: {
                                                                            ** continue;
                                                                        }
                                                                        case -789607946: {
                                                                            ** continue;
                                                                        }
                                                                        case -239378722: {
                                                                            ** continue;
                                                                        }
                                                                        case -817801391: {
                                                                            ** continue;
                                                                        }
                                                                        case -708482585: {
                                                                            var3_5 ^= var4_4 ^ -1933378707;
                                                                            break block92;
                                                                        }
lbl123:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var4_4 = (var2_3 | var5_2) ^ 436781700;
                                                                            ** GOTO lbl-1000
                                                                            break;
                                                                        }
lbl126:
                                                                        // 1 sources

                                                                        var4_4 = (var2_3 | var5_2) ^ -1843964751;
                                                                        ** GOTO lbl-1000
                                                                        while (true) {
                                                                            var4_4 = (var2_3 | var5_2) ^ 1497368195;
                                                                            ** GOTO lbl-1000
                                                                            break;
                                                                        }
lbl131:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var4_4 = (var2_3 | var5_2) ^ -460389104;
                                                                            ** GOTO lbl-1000
                                                                            break;
                                                                        }
lbl134:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var4_4 = (var2_3 | var5_2) ^ 1497088757;
                                                                            ** GOTO lbl-1000
                                                                            break;
                                                                        }
                                                                        case -377740470: {
                                                                            var3_5 ^= var4_4 ^ -955882925;
                                                                            ** continue;
                                                                        }
                                                                        case 573272440: {
                                                                            var3_5 ^= var4_4 ^ 1828430329;
                                                                            ** continue;
                                                                        }
lbl143:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var4_4 = (var2_3 | var5_2) ^ 1290237989;
                                                                            ** GOTO lbl-1000
                                                                            break;
                                                                        }
                                                                        case -1852473914: {
                                                                            var3_5 ^= var4_4 ^ 2145942550;
                                                                            break block93;
                                                                        }
lbl149:
                                                                        // 1 sources

                                                                        var3_5 = (var2_3 | var5_2) ^ 93892020;
                                                                        ** continue;
lbl151:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var4_4 = (var2_3 | var5_2) ^ 491793255;
                                                                            ** GOTO lbl-1000
                                                                            break;
                                                                        }
                                                                        case 1633924479: {
                                                                            var3_5 ^= var4_4 ^ -1142315684;
                                                                            break block70;
                                                                        }
                                                                        case 370474939: {
                                                                            if (!(var1_1 instanceof class_2611)) break block94;
                                                                            break block95;
                                                                        }
lbl160:
                                                                        // 1 sources

                                                                        var4_4 = (var2_3 | var5_2) ^ -777286986;
                                                                        ** GOTO lbl-1000
                                                                        case 3145958: {
                                                                            return this.e;
                                                                        }
                                                                        while (true) {
                                                                            var4_4 = (var2_3 | var5_2) ^ 726806001;
                                                                            ** GOTO lbl-1000
                                                                            break;
                                                                        }
lbl167:
                                                                        // 1 sources

                                                                        var4_4 = (var2_3 | var5_2) ^ -5728550;
                                                                        ** continue;
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            var4_4 = (var2_3 | var5_2) ^ 860001116;
                                                            ** GOTO lbl83
                                                        }
                                                        var4_4 = (var2_3 | var5_2) ^ 322074836;
                                                        ** GOTO lbl83
                                                    }
                                                    var4_4 = (var2_3 | var5_2) ^ -1049274117;
                                                    ** GOTO lbl83
                                                }
                                                var4_4 = (var2_3 | var5_2) ^ -1272307542;
                                                ** GOTO lbl83
                                            }
                                            var4_4 = (var2_3 | var5_2) ^ -2019831151;
                                            ** GOTO lbl83
                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ -1364320740;
                                                ** GOTO lbl83
                                                break;
                                            }
                                            {
                                                case -1172427008: {
                                                    var3_5 ^= var4_4 ^ 1761380127;
                                                    break;
                                                }
                                                case -1790150751: {
                                                    return this.b;
                                                }
                                                case -2093945515: {
                                                    var3_5 ^= var4_4 ^ 2038013230;
                                                    break;
                                                }
                                            }
                                        }
                                        var4_4 = (var2_3 | var5_2) ^ -181302522;
                                        ** GOTO lbl83
                                        {
                                            case 118255840: {
                                                var3_5 ^= var4_4 ^ 664428199;
                                                ** continue;
                                            }
                                        }
                                        var4_4 = (var2_3 | var5_2) ^ -1982440073;
                                        ** GOTO lbl83
                                        {
                                            case 623608486: {
                                                return this.a;
                                            }
                                            case -821429241: {
                                                var3_5 ^= var4_4 ^ -377453237;
                                                break;
                                            }
                                            case 1191431882: {
                                                if (!(var1_1 instanceof class_2601)) ** continue;
                                                ** continue;
                                            }
                                        }
                                        var4_4 = (var2_3 | var5_2) ^ -26215832;
                                        ** GOTO lbl83
                                    }
                                    var4_4 = (var2_3 | var5_2) ^ -2021037608;
                                    ** GOTO lbl83
                                }
                                var4_4 = (var2_3 | var5_2) ^ 857751909;
                                ** GOTO lbl83
                                {
                                    case 1278247542: {
                                        if (!(var1_1 instanceof class_3719)) ** continue;
                                        break;
                                    }
                                }
lbl221:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 1581315421;
                                    ** GOTO lbl83
                                    break;
                                }
                            }
                            var4_4 = (var2_3 | var5_2) ^ 1183758894;
                            ** GOTO lbl83
                        }
                        var4_4 = (var2_3 | var5_2) ^ 1805622485;
                        ** GOTO lbl83
                    }
                    var4_4 = (var2_3 | var5_2) ^ 1672857685;
                    ** GOTO lbl83
                    {
                        case 1210705063: {
                            return this.h;
                        }
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ -1966069467;
                ** GOTO lbl83
            }
            var4_4 = (var2_3 | var5_2) ^ -1417347571;
            ** GOTO lbl83
            {
                case 575714574: {
                    if (!(var1_1 instanceof class_2589)) ** continue;
                    ** continue;
                }
                case -1215774374: {
                    var3_5 ^= var4_4 ^ 1188545783;
                    ** continue;
                }
                case 999068777: {
                    var3_5 ^= var4_4 ^ -1326169183;
                    ** continue;
                }
                case -52290013: {
                    return this.d;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ -352449987;
            ** GOTO lbl83
            {
                case 1345935882: {
                    var3_5 ^= var4_4 ^ -51951546;
                    ** continue;
                }
                case 417251246: {
                    return this.g;
                }
                case -2063299181: {
                    return null;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ 928773517;
            ** GOTO lbl83
        }
        var4_4 = (var2_3 | var5_2) ^ 1837074496;
        ** GOTO lbl83
        {
            case -1152849851: {
                return this.f;
            }
            case 284486446: {
                var3_5 ^= var4_4 ^ -360791279;
                ** continue;
            }
            case -1612418325: {
                if (!(var1_1 instanceof class_2636)) ** continue;
                ** continue;
            }
        }
        var4_4 = (var2_3 | var5_2) ^ -128214354;
        ** while (true)
        {
            ** case 1750667055:
        }
lbl277:
        // 1 sources

        var3_5 ^= var4_4 ^ 1818330039;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static void LD(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11) {
        block49: {
            block46: {
                block47: {
                    block48: {
                        block45: {
                            var15_12 = 1340557162;
                            var12_13 = ie.a & 1340557162 ^ -1908279506;
                            var14_14 = 0;
                            ** GOTO lbl74
lbl5:
                            // 1 sources

                            while (true) {
                                ie.LF(var0, var1_1, var2_2, var3_3, var7_7, var2_2, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, 1.0f);
                                ** GOTO lbl56
                                break;
                            }
lbl8:
                            // 1 sources

                            while (true) {
                                var14_14 = (var12_13 | var15_12) ^ 570732108;
                                ** GOTO lbl13
                                break;
                            }
lbl11:
                            // 1 sources

                            block31: while (true) {
                                var14_14 = (var12_13 | var15_12) ^ 2114011704;
lbl13:
                                // 18 sources

                                block32: while (true) {
                                    switch (var14_14) lbl-1000:
                                    // 10 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block32;
                                            }
                                            break;
                                        }
                                        case -38002003: {
                                            ** continue;
                                        }
                                        case 59855079: {
                                            ie.LF(var0, var1_1, var2_2, var3_3, var7_7, var2_2, var3_3, var4_4, var8_8, var9_9, var10_10, var11_11, 1.0f);
                                            break;
                                        }
                                        case -146888932: {
                                            ie.LF(var0, var1_1, var5_5, var3_3, var4_4, var5_5, var6_6, var4_4, var8_8, var9_9, var10_10, var11_11, 1.0f);
                                            break;
                                        }
lbl26:
                                        // 1 sources

                                        while (true) {
                                            var14_14 = (var12_13 | var15_12) ^ 937622775;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case -1281049539: {
                                            var13_15 ^= var14_14 ^ -564590513;
                                            break block45;
                                        }
                                        case 382925722: {
                                            ie.LF(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var3_3, var4_4, var8_8, var9_9, var10_10, var11_11, 1.0f);
                                            break block31;
                                        }
                                        case 378900802: {
                                            var13_15 ^= var14_14 ^ -2078061426;
                                            ** continue;
                                        }
lbl38:
                                        // 1 sources

                                        while (true) {
                                            var14_14 = (var12_13 | var15_12) ^ -646814164;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl41:
                                        // 1 sources

                                        while (true) {
                                            var14_14 = (var12_13 | var15_12) ^ -864639095;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case -1098740141: {
                                            ie.LF(var0, var1_1, var5_5, var3_3, var7_7, var2_2, var3_3, var7_7, var8_8, var9_9, var10_10, var11_11, 1.0f);
                                            break;
                                        }
                                        case -876953706: {
                                            ie.LF(var0, var1_1, var2_2, var6_6, var7_7, var2_2, var6_6, var4_4, var8_8, var9_9, var10_10, var11_11, 1.0f);
                                            break block46;
                                        }
lbl50:
                                        // 1 sources

                                        while (true) {
                                            var14_14 = (var12_13 | var15_12) ^ 1754998185;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case 1680856277: {
                                            var13_15 ^= var14_14 ^ 373139700;
                                            ** continue;
                                        }
lbl56:
                                        // 1 sources

                                        var14_14 = (var12_13 | var15_12) ^ 906009409;
                                        ** GOTO lbl-1000
                                        case -1310280362: {
                                            var13_15 ^= var14_14 ^ -215487658;
                                            break;
                                        }
lbl61:
                                        // 1 sources

                                        while (true) {
                                            var14_14 = (var12_13 | var15_12) ^ -1124562680;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case -513148132: {
                                            break;
                                        }
lbl66:
                                        // 1 sources

                                        while (true) {
                                            var14_14 = (var12_13 | var15_12) ^ -216584998;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case -133887079: {
                                            ie.LF(var0, var1_1, var5_5, var3_3, var4_4, var5_5, var3_3, var7_7, var8_8, var9_9, var10_10, var11_11, 1.0f);
                                            ** continue;
                                        }
                                        case 1022417844: {
                                            return;
                                        }
lbl74:
                                        // 1 sources

                                        var13_15 = (var12_13 | var15_12) ^ -1576107250;
                                        var14_14 = (var12_13 | var15_12) ^ 781061234;
                                        ** GOTO lbl-1000
lbl77:
                                        // 1 sources

                                        while (true) {
                                            var14_14 = (var12_13 | var15_12) ^ 1341848414;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            var14_14 = (var12_13 | var15_12) ^ 1851210515;
                            ** GOTO lbl13
                        }
                        var14_14 = (var12_13 | var15_12) ^ -650834700;
                        ** GOTO lbl13
lbl85:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ 861359147;
                            ** GOTO lbl13
                            break;
                        }
                        {
                            case -303867614: {
                                ie.LF(var0, var1_1, var5_5, var6_6, var4_4, var5_5, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, 1.0f);
                                ** continue;
                            }
                            case -1582248835: {
                                var13_15 ^= var14_14 ^ -1498230708;
                                ** continue;
                            }
                            case -55526587: {
                                var13_15 ^= var14_14 ^ 2082386350;
                                break block47;
                            }
                        }
lbl97:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ -1512097468;
                            ** GOTO lbl13
                            break;
                        }
                        {
                            case 1410544657: {
                                ie.LF(var0, var1_1, var2_2, var3_3, var4_4, var2_2, var6_6, var4_4, var8_8, var9_9, var10_10, var11_11, 1.0f);
                                ** continue;
                            }
                            case -1484991801: {
                                var13_15 ^= var14_14 ^ 767792503;
                                break block48;
                            }
                            case -102274001: {
                                var13_15 ^= var14_14 ^ 597926868;
                                ** continue;
                            }
                        }
lbl109:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ 73222392;
                            ** GOTO lbl13
                            break;
                        }
lbl112:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ 953766002;
                            ** GOTO lbl13
                            break;
                        }
                        {
                            case 1931443814: {
                                ie.LF(var0, var1_1, var2_2, var6_6, var4_4, var5_5, var6_6, var4_4, var8_8, var9_9, var10_10, var11_11, 1.0f);
                                ** continue;
                            }
                        }
                        var14_14 = (var12_13 | var15_12) ^ 1617963008;
                        ** GOTO lbl13
                        {
                            case -1349001362: {
                                var13_15 ^= var14_14 ^ -152201762;
                                break;
                            }
                        }
                        var14_14 = (var12_13 | var15_12) ^ -1412947013;
                        ** GOTO lbl13
                    }
                    var14_14 = (var12_13 | var15_12) ^ 1902475581;
                    ** GOTO lbl13
                    {
                        case -2145579984: {
                            var13_15 ^= var14_14 ^ 1489244333;
                            ** continue;
                        }
                    }
                    var14_14 = (var12_13 | var15_12) ^ 2084784979;
                    ** GOTO lbl13
                    {
                        case 1919852665: {
                            ie.LF(var0, var1_1, var5_5, var6_6, var7_7, var2_2, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, 1.0f);
                            ** continue;
                        }
                    }
                    var14_14 = (var12_13 | var15_12) ^ 844879299;
                    ** GOTO lbl13
                }
                var14_14 = (var12_13 | var15_12) ^ -1115072745;
                ** GOTO lbl13
            }
            var14_14 = (var12_13 | var15_12) ^ -394259426;
            ** GOTO lbl13
            {
                case -1929590850: {
                    var13_15 ^= var14_14 ^ -1391861100;
                    ** continue;
                }
                case 661119856: {
                    var13_15 ^= var14_14 ^ 1285586921;
                    break block49;
                }
            }
            var14_14 = (var12_13 | var15_12) ^ 854600424;
            ** GOTO lbl13
        }
        var14_14 = (var12_13 | var15_12) ^ -1678457985;
        ** GOTO lbl13
        {
            case -48767610: {
                ie.LF(var0, var1_1, var5_5, var3_3, var7_7, var5_5, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, 1.0f);
                ** continue;
            }
        }
        var14_14 = (var12_13 | var15_12) ^ 1125855440;
        ** while (true)
        {
            ** case 1782107690:
        }
lbl161:
        // 1 sources

        var13_15 ^= var14_14 ^ 1323908740;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void LE(class_4588 class_45882, Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6, float f7, int n2, int n3, int n4, int n5) {
        int n6 = 825519694;
        int n7 = a & 0x31346E4E ^ 0x2F4D7CAD;
        int n8 = 0;
        int n9 = (n7 | n6) ^ 0xCC4D6343;
        n8 = (n7 | n6) ^ 0x655C6DE9;
        block7: while (true) {
            switch (n8) {
                default: {
                    continue block7;
                }
                case -388342962: {
                    n9 ^= n8 ^ 0xBFC689C4;
                    n8 = (n7 | n6) ^ 0x5FBEC111;
                    continue block7;
                }
                case 1512116998: {
                    n8 = (n7 | n6) ^ 0xD7A725A1;
                    continue block7;
                }
                case -862378315: {
                    n9 ^= n8 ^ 0x4827D4E8;
                    n8 = (n7 | n6) ^ 0xFA1FA859;
                    continue block7;
                }
                case 1623441406: {
                    ie.LF(class_45882, matrix4f, f2, f3, f4, f5, f6, f7, n2, n3, n4, n5, 1.0f);
                    n8 = (n7 | n6) ^ 0xF3E4585A;
                    continue block7;
                }
                case -983378250: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static void LF(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11, float var12_12) {
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
    private static void LG(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11, boolean var12_12) {
        block37: {
            block39: {
                block40: {
                    block41: {
                        block38: {
                            break block41;
lbl1:
                            // 2 sources

                            while (true) {
                                var15_15 = (var13_14 | var16_13) ^ -1700786121;
                                break block37;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var14_16 ^= var15_15 ^ -1762736245;
                                break block38;
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                                var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                                ** GOTO lbl1
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                                var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                                ** continue;
                                break;
                            }
                        }
                        var15_15 = (var13_14 | var16_13) ^ 611302119;
                        break block37;
lbl22:
                        // 1 sources

                        while (true) {
                            var15_15 = (var13_14 | var16_13) ^ 1284408939;
                            break block37;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var15_15 = (var13_14 | var16_13) ^ 177164428;
                            break block37;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var15_15 = (var13_14 | var16_13) ^ 780176805;
                            break block37;
                            break;
                        }
lbl31:
                        // 1 sources

                        while (true) {
                            var15_15 = (var13_14 | var16_13) ^ -1205068829;
                            break block37;
                            break;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            var15_15 = (var13_14 | var16_13) ^ -1208661615;
                            break block37;
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                            var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                            ** continue;
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var14_16 ^= var15_15 ^ -179458668;
                            break block39;
                            break;
                        }
lbl46:
                        // 1 sources

                        while (true) {
                            var14_16 ^= var15_15 ^ -844752174;
                            ** continue;
                            break;
                        }
                        while (true) {
                            var15_15 = (var13_14 | var16_13) ^ 810216336;
                            break block37;
                            break;
                        }
lbl52:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl54:
                        // 1 sources

                        while (true) {
                            if (!var12_12) ** continue;
                            ** continue;
                            break;
                        }
lbl57:
                        // 1 sources

                        while (true) {
                            var14_16 ^= var15_15 ^ -1163132015;
                            break block40;
                            break;
                        }
lbl60:
                        // 1 sources

                        while (true) {
                            var15_15 = (var13_14 | var16_13) ^ 972476428;
                            break block37;
                            break;
                        }
lbl63:
                        // 1 sources

                        while (true) {
                            var14_16 ^= var15_15 ^ -973544017;
                            ** continue;
                            break;
                        }
                    }
                    var16_13 = -1068142490;
                    var13_14 = ie.a & -1068142490 ^ 2110139052;
                    var15_15 = 0;
                    var14_16 = (var13_14 | var16_13) ^ 1288102960;
                    ** while (true)
lbl72:
                    // 1 sources

                    while (true) {
                        var15_15 = (var13_14 | var16_13) ^ 1143559316;
                        break block37;
                        break;
                    }
                    var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                    var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                    var15_15 = (var13_14 | var16_13) ^ -376363320;
                    break block37;
lbl81:
                    // 1 sources

                    return;
                }
                var15_15 = (var13_14 | var16_13) ^ 1393743588;
                break block37;
            }
            var15_15 = (var13_14 | var16_13) ^ 2095119845;
            break block37;
lbl89:
            // 1 sources

            while (true) {
                var14_16 ^= var15_15 ^ -513684067;
                ** continue;
                break;
            }
        }
        block36: while (true) {
            switch (var15_15) {
                default: {
                    continue block36;
                }
                case -749209781: {
                    ** continue;
                }
                case -2127067381: {
                    ** continue;
                }
                case -1004426526: {
                    ** continue;
                }
                case -1362777078: {
                    ** continue;
                }
                case -1174524294: {
                    ** continue;
                }
                case 340155430: {
                    ** continue;
                }
                case 1735879385: {
                    ** continue;
                }
                case -1319502715: {
                    ** continue;
                }
                case -642203639: {
                    ** continue;
                }
                case 1174102285: {
                    ** continue;
                }
                case -845311618: {
                    ** continue;
                }
                case 1243755391: {
                    ** continue;
                }
                ** case -145216926:
lbl122:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    private static int LH(int n2, int n3) {
        int n4 = 1982468886;
        int n5 = -134592744;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xD1318128)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xF7FA2506;
        n6 ^= (n5 | n4) ^ 0xF7FA7DDE;
        n6 += (n5 | n4) ^ 0xF7FAE2E5;
        n6 += (n5 | n4) ^ 0xF7FA192F;
        n6 ^= (n5 | n4) ^ 0xF7FAC03D;
        n6 -= (n5 | n4) ^ 0xF7FA00B0;
        n6 += (n5 | n4) ^ 0xF7FA0F06;
        n6 ^= (n5 | n4) ^ 0xF7FA40B0;
        n6 -= (n5 | n4) ^ 0xF7FA18A1;
        return n6 -= (n5 | n4) ^ 0xF7FA03D2;
    }

    /*
     * Exception decompiling
     */
    private static void LI(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7, int var8_8, int var9_9, int var10_10, boolean var11_11) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [30[UNCONDITIONALDOLOOP], 24[UNCONDITIONALDOLOOP], 29[UNCONDITIONALDOLOOP], 0[SWITCH], 28[UNCONDITIONALDOLOOP]], but top level block is 4[SWITCH]
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
    private static void LJ(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7, int var8_8, int var9_9, int var10_10, boolean var11_11) {
        block32: {
            block34: {
                block33: {
                    break block34;
lbl1:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ -1678538229;
                        break block32;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var0.method_22918((Matrix4fc)var1_1, var3_3, var4_4, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                        var0.method_22918((Matrix4fc)var1_1, var3_3, var6_6, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                        ** GOTO lbl101
                        break;
                    }
lbl10:
                    // 2 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ -1641822284;
                        break block32;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var13_15 ^= var14_14 ^ -836706424;
                        ** GOTO lbl96
                        break;
                    }
                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ 1436647240;
                        break block32;
lbl19:
                        // 1 sources

                        while (true) {
                            var0.method_22918((Matrix4fc)var1_1, var3_3, var4_4, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                            var0.method_22918((Matrix4fc)var1_1, var5_5, var4_4, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                            ** GOTO lbl103
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ -403954619;
                            break block33;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ 361424328;
                        break block32;
                        break;
                    }
lbl31:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ -1448534605;
                        break block32;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var13_15 ^= var14_14 ^ -1250846537;
                        var14_14 = (var12_13 | var15_12) ^ 1518323775;
                        break block32;
                        break;
                    }
lbl38:
                    // 1 sources

                    while (true) {
                        var13_15 ^= var14_14 ^ -1520840504;
                        ** GOTO lbl94
                        break;
                    }
lbl41:
                    // 1 sources

                    while (true) {
                        var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                        var0.method_22918((Matrix4fc)var1_1, var3_3, var6_6, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                        ** GOTO lbl10
                        break;
                    }
lbl47:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ -306549084;
                        break block32;
lbl50:
                        // 1 sources

                        while (true) {
                            var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                            var0.method_22918((Matrix4fc)var1_1, var5_5, var4_4, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                            ** continue;
                            break;
                        }
lbl56:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ 1297744182;
                            ** continue;
                            break;
                        }
                        break;
                    }
                }
                var14_14 = (var12_13 | var15_12) ^ -1536872915;
                break block32;
            }
            var15_12 = 357873663;
            var12_13 = ie.a & 357873663 ^ -730823620;
            var14_14 = 0;
            var13_15 = (var12_13 | var15_12) ^ -653144261;
            ** while (true)
        }
lbl69:
        // 2 sources

        block30: while (true) {
            switch (var14_14) lbl-1000:
            // 5 sources

            {
                while (true) {
                    default: {
                        continue block30;
                    }
                    break;
                }
                case 1648795506: {
                    ** continue;
                }
                case -1057074633: {
                    ** continue;
                }
                case 2094901836: {
                    ** continue;
                }
                case -1895071808: {
                    ** continue;
                }
                case 412116863: {
                    ** continue;
                }
                case 953080155: {
                    ** continue;
                }
                case -1168471598: {
                    ** continue;
                }
                case 1101359724: {
                    ** continue;
                }
                case 1896978898: {
                    ** continue;
                }
                case 1264021579: {
                    ** continue;
                }
lbl94:
                // 1 sources

                var14_14 = (var12_13 | var15_12) ^ -1798185581;
                ** GOTO lbl-1000
lbl96:
                // 1 sources

                var14_14 = (var12_13 | var15_12) ^ 224217580;
                ** GOTO lbl-1000
                case -2133473097: {
                    var13_15 ^= var14_14 ^ -317353093;
                    break block30;
                }
lbl101:
                // 1 sources

                var14_14 = (var12_13 | var15_12) ^ -840642432;
                ** GOTO lbl-1000
lbl103:
                // 1 sources

                var14_14 = (var12_13 | var15_12) ^ 1865301549;
                ** continue;
                case -668336621: {
                    if (!var11_11) ** continue;
                    ** continue;
                }
                case 1317486068: {
                    return;
                }
            }
            break;
        }
        var14_14 = (var12_13 | var15_12) ^ -1221449587;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static void LK(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11) {
        block52: {
            block54: {
                block53: {
                    break block54;
lbl1:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ 926967811;
                        break block52;
lbl4:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ -2077032564;
                            ** GOTO lbl-1000
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ -1304670696;
                            break block52;
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ -813905479;
                            break block52;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ 50245418;
                            ** GOTO lbl142
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ -154623207;
                        break block52;
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ 159302868;
                        break block52;
                        break;
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        ie.LJ(var0, var1_1, var7_7, var2_2, var3_3, var5_5, var6_6, var8_8, var9_9, var10_10, var11_11, true);
                        ** GOTO lbl138
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var13_15 ^= var14_14 ^ -2008512107;
                        break block53;
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl32:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ 809934910;
                        break block52;
                        break;
                    }
                }
                var14_14 = (var12_13 | var15_12) ^ 1607022597;
                break block52;
lbl38:
                // 1 sources

                while (true) {
                    var13_15 ^= var14_14 ^ 2069252306;
                    var14_14 = (var12_13 | var15_12) ^ 1877534040;
                    break block52;
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    var13_15 ^= var14_14 ^ -943536289;
                    ** GOTO lbl140
                    break;
                }
lbl45:
                // 1 sources

                while (true) {
                    var14_14 = (var12_13 | var15_12) ^ 949332722;
                    break block52;
lbl48:
                    // 1 sources

                    while (true) {
                        var13_15 ^= var14_14 ^ 262997999;
                        ** continue;
                        break;
                    }
lbl51:
                    // 1 sources

                    while (true) {
                        var13_15 ^= var14_14 ^ -1184593097;
                        ** continue;
                        break;
                    }
lbl54:
                    // 1 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ 942371918;
                        break block52;
                        break;
                    }
                    break;
                }
            }
            var15_12 = -1344057502;
            var12_13 = ie.a & -1344057502 ^ -782148055;
            var14_14 = 0;
            var13_15 = (var12_13 | var15_12) ^ -1710457012;
            ** while (true)
lbl63:
            // 1 sources

            while (true) {
                var13_15 ^= var14_14 ^ 881948438;
                ** GOTO lbl136
                break;
            }
            ie.LG(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var3_3, var7_7, var8_8, var9_9, var10_10, var11_11, false);
            var14_14 = (var12_13 | var15_12) ^ 495662303;
            break block52;
lbl69:
            // 1 sources

            while (true) {
                var14_14 = (var12_13 | var15_12) ^ -830285586;
                break block52;
lbl72:
                // 1 sources

                while (true) {
                    ie.LI(var0, var1_1, var2_2, var3_3, var4_4, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, false);
                    ** GOTO lbl144
                    break;
                }
                break;
            }
            ie.LJ(var0, var1_1, var4_4, var2_2, var3_3, var5_5, var6_6, var8_8, var9_9, var10_10, var11_11, false);
            var14_14 = (var12_13 | var15_12) ^ 1060695843;
            break block52;
lbl78:
            // 1 sources

            while (true) {
                var13_15 ^= var14_14 ^ 1864466212;
                ** GOTO lbl142
                break;
            }
lbl81:
            // 1 sources

            return;
lbl83:
            // 1 sources

            while (true) {
                ie.LG(var0, var1_1, var2_2, var6_6, var4_4, var5_5, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, true);
                ** continue;
                break;
            }
        }
lbl87:
        // 2 sources

        block50: while (true) {
            switch (var14_14) lbl-1000:
            // 7 sources

            {
                default: {
                    continue block50;
                }
                case 153877618: {
                    ** continue;
                }
                case 828475269: {
                    ** continue;
                }
                case -1084672570: {
                    ** continue;
                }
                case -1878279629: {
                    ** continue;
                }
                case -1006646182: {
                    ** continue;
                }
                case -1607833746: {
                    ** continue;
                }
                case -1059344312: {
                    ** continue;
                }
                case 1306464627: {
                    ** continue;
                }
                case -496473164: {
                    ** continue;
                }
                case 2130539364: {
                    ** continue;
                }
                case -948505191: {
                    ** continue;
                }
                case -801027697: {
                    ** continue;
                }
                case 1408128841: {
                    ** continue;
                }
                case -928827544: {
                    ** continue;
                }
                case -943183067: {
                    ** continue;
                }
                case -811204779: {
                    ** continue;
                }
                case 815765202: {
                    ie.LI(var0, var1_1, var5_5, var3_3, var4_4, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, true);
                    ** continue;
                }
                case -157443137: {
                    break block50;
                }
                case -1226095148: {
                    switch (var13_15) {
                        default: {
                            ** continue;
                        }
                        case -1321946347: {
                            ** continue;
                        }
                        ** case -965517863:
lbl135:
                        // 1 sources

                        ** continue;
                    }
                }
lbl136:
                // 1 sources

                var14_14 = (var12_13 | var15_12) ^ 1085958829;
                ** GOTO lbl-1000
lbl138:
                // 1 sources

                var14_14 = (var12_13 | var15_12) ^ 1057655171;
                ** GOTO lbl-1000
lbl140:
                // 1 sources

                var14_14 = (var12_13 | var15_12) ^ 799151844;
                ** GOTO lbl-1000
lbl142:
                // 2 sources

                var14_14 = (var12_13 | var15_12) ^ -1408432094;
                ** GOTO lbl-1000
lbl144:
                // 1 sources

                var14_14 = (var12_13 | var15_12) ^ -2128729073;
                ** GOTO lbl-1000
                case -1058416920: lbl-1000:
                // 2 sources

                {
                    var14_14 = (var12_13 | var15_12) ^ 1225267903;
                    ** GOTO lbl-1000
                }
            }
            break;
        }
        var14_14 = (var12_13 | var15_12) ^ 1008505649;
        ** while (true)
    }
}

