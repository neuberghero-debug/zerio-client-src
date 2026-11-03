/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1268
 *  org.lwjgl.glfw.GLFW
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import org.lwjgl.glfw.GLFW;
import z.r.bM;
import z.r.c;
import z.r.dX;
import z.r.ej;
import z.r.gP;
import z.r.gj;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class iB
extends bM {
    private final dX a;
    private static final long a;
    private static final /* synthetic */ String k;
    private final ke a;
    private boolean a;
    private boolean b;
    private float a;
    private static iB a;
    private final gP a;
    private static final int[] a;
    private long b;
    private final ke b;
    private final ke c;
    private final ke d;
    private static final /* synthetic */ String a;
    private final ke e;
    private static final float b;
    private final ej a;
    private static final /* synthetic */ String b;
    private int a;
    public static final int c;
    private static final /* synthetic */ String s;
    private c a;
    private static final /* synthetic */ String c;
    private static final long c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private int b;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private float c;
    private static final /* synthetic */ String i;
    private class_1268 a;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            break block12;
lbl1:
            // 1 sources

            block9: while (true) {
                switch (var0_2) {
                    case 209427533: {
                        var0_2 ^= 2091995304;
                        break;
                    }
                    default: {
                        var0_2 ^= -1919162969;
                        continue block9;
                    }
                    case -74631642: {
                        var0_2 ^= -1315821359;
                    }
                }
                do {
                    var0_2 ^= -683072325;
                    var0_2 ^= -162116114;
                    var0_2 ^= 271569562;
                    var0_2 ^= 1742233127;
                    var0_2 ^= -2000338658;
                    var0_2 ^= -1372579053;
                    v0 = var0_2 ^= -1431551678;
                    var0_2 ^= -1894390064;
                    iB.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ ((v0 | var2) ^ -1593686725 ^ iB.c);
                    v1 = v1 + 1;
                    v4 = v3 + 4;
                    v2 = v2;
                    v3 = v4;
                    var0_2 ^= 1436817527;
                } while (v4 < v2.length);
                v5 = -4942877927094657164L << 32 >>> 32 ^ (long)(var0_2 ^= -877817261) & 0xFFFFFFFFL;
                iB.c = v5 | (-4942877927094657164L >>> 32 ^ (long)var0_2 & 0xFFFFFFFFL) << 32;
                iB.b = 84.0f;
                iB.a = -4942877927094657810L << 32 >>> 32 ^ (long)var0_2 & 0xFFFFFFFFL | (-4942877927094657810L >>> 32 ^ (long)var0_2 & 0xFFFFFFFFL) << 32;
                iB.k = gj.decode("IVVXP29SWp46uROLC2396AI=", iB.PQ((var0_2 | var2) ^ 1196427254, var2 ^ ((var0_2 | var2) ^ 293020826)));
                iB.s = gj.decode("Kd6uqaPRZdIMCmXtlcUpv1pzaCZ9ggdEZXnQw/js4w==", iB.PQ((var0_2 | var2) ^ 1196427255, var2 ^ ((var0_2 | var2) ^ -509351983)));
                iB.a = gj.decode("Secx/wWNUaW+8A==", iB.PQ((var0_2 | var2) ^ 1196427252, var2 ^ ((var0_2 | var2) ^ 555577656)));
                iB.c = gj.decode("8jcyZrkd4oJbhST5", iB.PQ((var0_2 | var2) ^ 1196427253, var2 ^ ((var0_2 | var2) ^ -940533033)));
                iB.f = gj.decode("/xfH3A==", iB.PQ((var0_2 | var2) ^ 1196427258, var2 ^ ((var0_2 | var2) ^ 2007427507)));
                iB.e = gj.decode("NGM/DaBricRskg7kMpMUcjzKLGxXFR4c52JBRnWiM0aDdT2KDittverAeX7TRzH4CwbU7Y5SDTgufEzwrsU=", iB.PQ((var0_2 | var2) ^ 1196427259, var2 ^ ((var0_2 | var2) ^ 352938204)));
                iB.d = gj.decode("20km0d4AB3+1zg==", iB.PQ((var0_2 | var2) ^ 1196427256, var2 ^ ((var0_2 | var2) ^ -1405951091)));
                iB.i = gj.decode("8xCjftUL8agM", iB.PQ((var0_2 | var2) ^ 1196427257, var2 ^ ((var0_2 | var2) ^ 440842791)));
                iB.g = gj.decode("DxRErT2sm2bFzw6V", iB.PQ((var0_2 | var2) ^ 1196427262, var2 ^ ((var0_2 | var2) ^ 1262045829)));
                iB.h = gj.decode("kb89Y4jq/9Aeppkk", iB.PQ((var0_2 | var2) ^ 1196427263, var2 ^ ((var0_2 | var2) ^ 2055903931)));
                iB.b = gj.decode("J6364rq1CjJ4", iB.PQ((var0_2 | var2) ^ 1196427260, var2 ^ ((var0_2 | var2) ^ -488641568)));
                return;
            }
        }
        var2 = -1370561025;
        iB.c = mK.a(MethodHandles.lookup().lookupClass(), -1590092718);
        var1_1 = 0;
        var0_2 = -47167552;
        var1_1 = var2 ^ 1423144008;
        block11: while (true) {
            switch (var1_1) {
                default: {
                    continue block11;
                }
                case 1468924034: {
                    var0_2 ^= var1_1 ^ -1350009372;
                    var1_1 = var2 ^ -892271587;
                    continue block11;
                }
                case -90336841: {
                    var1_1 = var2 ^ -104798851;
                    continue block11;
                }
                case 1688199650: 
            }
            break;
        }
        v1 = 0;
        v3 = 0;
        v2 = "\f\u00c6R\u009c\u0091\u0088\u0087>\u00fd9\u00ef*.{\u0091\b\u00ab\u0091\u00a2 \u00cd\u00a3\u00c8\\\u0080!$\u0094`&T\u0013n\u00fa\u0011^\u008a\u00a4\u00bcz\u00cbC\u00d8R8\u0088\u00e2-\u00dd$\u00f9\u00866u*\u00cbuD\u001c\u0000".getBytes("ISO-8859-1");
        iB.a = new int[((var0_2 ^= 156083947) | var2) ^ -1367343632];
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public iB() {
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
    public static iB instance() {
        int n2 = c & 0xE739714D ^ 0xAB9C9364;
        int n3 = 0;
        int n4 = (n2 | 0xE739714D) ^ 0x4B607DB;
        n3 = (n2 | 0xE739714D) ^ 0xE9F326F8;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 105829781: {
                    n3 = (n2 | 0xE739714D) ^ 0x2DF28D09;
                    continue block5;
                }
                case 582751251: {
                    return a;
                }
                case -1034977692: 
            }
            n4 ^= n3 ^ 0xD97776B;
            n3 = (n2 | 0xE739714D) ^ 0xCD01E77E;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean wantsRotation() {
        var4_1 = -620068690;
        var1_2 = iB.c & -620068690 ^ -659213427;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -832702916;
        var3_3 = (var1_2 | var4_1) ^ 0x4CC40440;
        block11: while (true) {
            switch (var3_3) {
                case 476876210: {
                    var2_4 ^= var3_3 ^ 1875952248;
                    ** break;
                }
                case 1192413846: {
                    v0 = false;
                    ** GOTO lbl37
                }
                case -279080181: {
                    if (this.a.active()) {
                        var3_3 = (var1_2 | var4_1) ^ -942457315;
                        continue block11;
                    }
                    ** GOTO lbl41
                }
                case -1715865347: {
                    var2_4 ^= var3_3 ^ -368724169;
                    var3_3 = (var1_2 | var4_1) ^ -1666352839;
                    continue block11;
                }
                case 2097179345: {
                    var2_4 ^= var3_3 ^ -1805639342;
                    var3_3 = (var1_2 | var4_1) ^ -580668565;
                    continue block11;
                }
                case 1799326982: {
                    var3_3 = (var1_2 | var4_1) ^ 887234724;
                    continue block11;
                }
lbl30:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 1276990246;
                break;
                case -1753499665: {
                    var3_3 = (var1_2 | var4_1) ^ -1497376386;
                    break;
                }
                case -1750933367: {
                    v0 = true;
lbl37:
                    // 2 sources

                    var2_4 ^= -1542487721;
                    return v0;
                }
                case 115081412: {
                    if (this.a != z.r.c.f) break block11;
lbl41:
                    // 2 sources

                    var3_3 = (var1_2 | var4_1) ^ 1107708754;
                }
            }
lbl42:
            // 5 sources

        }
        var3_3 = (var1_2 | var4_1) ^ -1333772631;
        ** GOTO lbl42
    }

    /*
     * Enabled aggressive block sorting
     */
    public double[] computeAdjustment(double d2) {
        int n2 = c & 0x554B3BC5 ^ 0xFE16A6E2;
        int n3 = 0;
        int n4 = (n2 | 0x554B3BC5) ^ 0xE1779EB1;
        n3 = (n2 | 0x554B3BC5) ^ 0x42E80374;
        block5: while (true) {
            switch (n3) {
                case -1112032109: {
                    n3 = (n2 | 0x554B3BC5) ^ 0xFD29C552;
                    continue block5;
                }
                case 41319093: {
                    n4 ^= n3 ^ 0xB3CB7BDF;
                    n3 = (n2 | 0x554B3BC5) ^ 0xBA334D93;
                }
                default: {
                    continue block5;
                }
                case 1164767860: 
            }
            break;
        }
        return this.a.step(d2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block18: {
            block17: {
                var4_1 = 1776277215;
                var1_2 = iB.c & 1776277215 ^ -291304072;
                var3_3 = 0;
                break block18;
lbl5:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -303074879;
                    ** GOTO lbl33
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -364908296;
                    break block17;
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -2069420540;
                    ** continue;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 358465875;
                    ** GOTO lbl33
lbl17:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 93027946;
                        ** GOTO lbl33
                        break;
                    }
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -1001745671;
            ** GOTO lbl33
        }
        var2_4 = (var1_2 | var4_1) ^ -381506382;
        var3_3 = (var1_2 | var4_1) ^ 1409460548;
        if (true) ** GOTO lbl33
        block14: while (true) {
            block19: {
                var3_3 = (var1_2 | var4_1) ^ -415136612;
                break block19;
lbl30:
                // 1 sources

                while (true) {
                    this.PT();
                    ** continue;
                    break;
                }
            }
            block16: while (true) {
                switch (var3_3) {
                    default: {
                        continue block16;
                    }
                    case 1153260668: {
                        ** continue;
                    }
                    case -90038612: {
                        ** continue;
                    }
                    case -1141016901: {
                        break;
                    }
                    case 733302022: {
                        ** continue;
                    }
                    case 34647614: {
                        return;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -1421704317;
            }
            {
                case -361455211: {
                    var2_4 ^= var3_3 ^ -2013170640;
                    continue block14;
                }
                ** case 146692963:
            }
            break;
        }
lbl54:
        // 1 sources

        this.a = false;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onCombatTick() {
        block60: {
            block62: {
                block61: {
                    break block61;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -548191403;
                        ** GOTO lbl62
lbl4:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 1699146271;
                            ** GOTO lbl140
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 732830626;
                            ** GOTO lbl62
                            break;
                        }
lbl10:
                        // 4 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -124207473;
                            ** GOTO lbl62
lbl13:
                            // 1 sources

                            while (true) {
                                this.PU();
                                ** continue;
                                break;
                            }
                            break;
                        }
                        break;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -737618900;
                        ** GOTO lbl62
lbl19:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 939587189;
                            ** GOTO lbl92
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -85972775;
                            ** GOTO lbl62
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1361907715;
                            ** GOTO lbl62
lbl28:
                            // 1 sources

                            while (iB.a.field_1755 != null) {
                                ** GOTO lbl10
                            }
                            ** GOTO lbl100
lbl31:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -2031515074;
                                ** GOTO lbl128
                                break;
                            }
lbl34:
                            // 1 sources

                            while (true) {
                                this.PT();
                                ** GOTO lbl118
                                break;
                            }
lbl37:
                            // 1 sources

                            return;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -845396373;
                            ** GOTO lbl62
                            break;
                        }
                        break;
                    }
                }
                var4_1 = -382607831;
                var1_2 = iB.c & -382607831 ^ 744681733;
                var3_3 = 0;
                break block62;
lbl47:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1623315674;
                    ** GOTO lbl62
                    break;
                }
lbl50:
                // 1 sources

                block47: while (true) {
                    block63: {
                        var3_3 = (var1_2 | var4_1) ^ 0xD282228;
                        break block63;
lbl53:
                        // 1 sources

                        while (true) {
                            this.idle();
                            ** GOTO lbl112
                            break;
                        }
lbl56:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 1009337613;
                            ** GOTO lbl126
                            break;
                        }
lbl59:
                        // 1 sources

                        while (true) {
                            this.PO();
                            ** GOTO lbl112
                            break;
                        }
                    }
lbl63:
                    // 5 sources

                    block51: while (true) {
                        switch (var3_3) lbl-1000:
                        // 13 sources

                        {
                            while (true) {
                                default: {
                                    continue block51;
                                }
                                break;
                            }
                            case -958536561: {
                                ** continue;
                            }
                            case -1339721436: {
                                ** continue;
                            }
                            case -1435246845: {
                                ** continue;
                            }
                            case -1917703177: {
                                ** continue;
                            }
                            case 964373249: {
                                ** GOTO lbl28
                            }
                            case 775088292: {
                                ** continue;
                            }
                            case 36275980: {
                                ** continue;
                            }
                            case -555496637: {
                                ** continue;
                            }
                            case -283711823: {
                                ** continue;
                            }
                            case 80759566: {
                                ** continue;
                            }
                            case 182075102: {
                                ** continue;
                            }
                            case 395565044: {
                                ** continue;
                            }
lbl92:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ 1191190574;
                            ** GOTO lbl-1000
lbl94:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -555890313;
                                ** GOTO lbl-1000
                                break;
                            }
lbl97:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -839925143;
                                ** GOTO lbl-1000
                                break;
                            }
lbl100:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -1019144311;
                            ** GOTO lbl-1000
                            case -530850555: {
                                break block47;
                            }
                            case 1549822804: {
                                return;
                            }
                            case 446014744: {
                                var2_4 ^= var3_3 ^ 272079005;
                                break block60;
                            }
lbl109:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 869319025;
                                ** GOTO lbl-1000
                                break;
                            }
lbl112:
                            // 4 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -135898571;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 547110212: {
                                if (iB.a.field_1761 == null) ** GOTO lbl10
                                ** continue;
                            }
lbl118:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -408305165;
                            ** GOTO lbl-1000
                            case -559727012: {
                                this.PR();
                                ** GOTO lbl112
                            }
lbl123:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1531644854;
                                ** GOTO lbl-1000
                                break;
                            }
lbl126:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ 865088622;
                            ** GOTO lbl-1000
lbl128:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ 1820098447;
                            ** GOTO lbl-1000
lbl130:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 40180124;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 185384188: {
                                if (iB.a.field_1724 == null) ** GOTO lbl10
                                ** continue;
                            }
                            case 552581446: {
                                if (iB.a.field_1687 != null) ** break;
                                ** continue;
                                ** continue;
                            }
lbl140:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -427867183;
                            ** continue;
                            case -1237781349: {
                                ** continue;
                            }
                            case 867055194: {
                                ** continue;
                            }
                        }
                        break;
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ -375147485;
                ** GOTO lbl63
            }
            var2_4 = (var1_2 | var4_1) ^ -2008839466;
            var3_3 = (var1_2 | var4_1) ^ 1565951497;
            ** GOTO lbl63
lbl152:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -279283679;
                ** GOTO lbl63
                break;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ -1324116871;
        ** while (true)
        {
            case -1134629074: {
                ** continue;
            }
            case -2129690462: {
                switch (this.a.ordinal()) {
                    case 0: {
                        ** continue;
                    }
                    default: {
                        ** continue;
                    }
                    case 2: {
                        ** continue;
                    }
                    ** case 1:
lbl169:
                    // 1 sources

                    ** continue;
                }
            }
            case 367739298: {
                var2_4 ^= var3_3 ^ 549840224;
                ** continue;
            }
            ** case 841006200:
        }
lbl174:
        // 1 sources

        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void idle() {
        block58: {
            var5_1 = -605126618;
            var2_2 = iB.c & -605126618 ^ -1319853019;
            var4_3 = 0;
            var3_4 = (var2_2 | var5_1) ^ -691558101;
            var4_3 = (var2_2 | var5_1) ^ 1475283516;
            if (true) ** GOTO lbl9
            block47: while (true) {
                var4_3 = (var2_2 | var5_1) ^ -197747652;
lbl9:
                // 2 sources

                block48: while (true) {
                    switch (var4_3) {
                        case -201060002: {
                            ** break;
                        }
                        case -717259806: {
                            var1_5 = iB.a.field_1724.method_5998(this.a);
                            ** GOTO lbl83
                        }
                        case 264779803: {
                            var3_4 ^= var4_3 ^ -1291760244;
                            ** break;
                        }
                        case -816215330: {
                            if (!this.a) ** GOTO lbl85
                            ** GOTO lbl78
                        }
lbl22:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 883371769;
                        continue block48;
lbl24:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -1299021910;
                        continue block48;
                        case 1225206193: {
                            this.a = false;
                            ** GOTO lbl56
                        }
                        case 846143748: {
                            var3_4 ^= var4_3 ^ 618280196;
                            ** GOTO lbl45
                        }
                        case -654602057: {
                            var3_4 ^= var4_3 ^ 617444993;
                            ** GOTO lbl119
                        }
                        case 492633145: {
                            var4_3 = (var2_2 | var5_1) ^ 757804746;
                            ** GOTO lbl41
                        }
                        case 1234998908: {
                            if (!this.PN()) ** GOTO lbl43
                            var4_3 = (var2_2 | var5_1) ^ 604348332;
                        }
lbl41:
                        // 6 sources

                        default: {
                            continue block48;
                        }
lbl43:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -913210077;
                        continue block48;
lbl45:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -1528128449;
                        continue block48;
                        case -661913404: {
                            var4_3 = (var2_2 | var5_1) ^ 1873926091;
                            continue block48;
                        }
                        case 176936592: {
                            var3_4 ^= var4_3 ^ -405316496;
                            var4_3 = (var2_2 | var5_1) ^ 2090501434;
                            continue block48;
                        }
                        case -1408127461: {
                            ** GOTO lbl123
                        }
lbl56:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -1411541914;
                        continue block48;
                        case 2111544958: {
                            var3_4 ^= var4_3 ^ 943253083;
                            var4_3 = (var2_2 | var5_1) ^ 1006162692;
                            ** GOTO lbl41
                        }
                        case -537183349: {
                            var3_4 ^= var4_3 ^ 1674363651;
                            var4_3 = (var2_2 | var5_1) ^ 784457669;
                            continue block48;
                        }
                        case -1806732308: {
                            this.a = false;
                            ** GOTO lbl85
                        }
                        case -2023481059: {
                            var3_4 ^= -312702240;
                            if (!iB.a.field_1724.method_6128()) {
                                var4_3 = (var2_2 | var5_1) ^ -425568226;
                                continue block48;
                            }
                            ** GOTO lbl117
                        }
                        case 1231870861: {
                            if (iB.a.field_1724.method_6115()) ** GOTO lbl117
                            ** GOTO lbl96
                        }
lbl78:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 594715875;
                        continue block48;
                        case 2018942789: {
                            var3_4 ^= var4_3 ^ 1634044257;
                            ** GOTO lbl94
                        }
lbl83:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 728458381;
                        ** GOTO lbl197
lbl85:
                        // 2 sources

                        var4_3 = (var2_2 | var5_1) ^ -2044380583;
                        continue block48;
                        case 1344483393: {
                            var3_4 ^= var4_3 ^ 611292141;
                            var4_3 = (var2_2 | var5_1) ^ -937332009;
                            continue block48;
                        }
                        case -832713022: {
                            if (this.PV()) continue block47;
                            ** GOTO lbl102
                        }
lbl94:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -1292268138;
                        continue block48;
lbl96:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -243961161;
                        continue block48;
                        case -1373349784: {
                            var3_4 ^= var4_3 ^ 1985757868;
                            var4_3 = (var2_2 | var5_1) ^ -1302187429;
                            continue block48;
                        }
lbl102:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -2086126750;
                        continue block48;
                        case -331360792: {
                            var3_4 ^= var4_3 ^ 2095367157;
                            var4_3 = (var2_2 | var5_1) ^ 899902181;
                            ** GOTO lbl41
                        }
                        case -690648339: {
                            if (!iB.a.field_1724.method_5765()) {
                                var4_3 = (var2_2 | var5_1) ^ 1440414799;
                                continue block48;
                            }
                            ** GOTO lbl117
                        }
                        case -1073318109: {
                            if (!iB.a.field_1724.method_3144()) {
                                var4_3 = (var2_2 | var5_1) ^ 268088697;
                                continue block48;
                            }
lbl117:
                            // 5 sources

                            var4_3 = (var2_2 | var5_1) ^ 587543696;
                            ** GOTO lbl41
                        }
lbl119:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -1306941329;
                        continue block48;
                        case 1595160600: {
                            return;
                        }
lbl123:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 398553551;
                        continue block48;
lbl125:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 1368314175;
                            break block58;
lbl128:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ 1477320422;
                                break block58;
                                break;
                            }
                            break;
                        }
                        case 1239878728: {
                            return;
                        }
lbl133:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 2023642894;
                            break block58;
                            break;
                        }
                        case 870307568: 
                    }
                    break;
                }
                break;
            }
            return;
        }
        block53: while (true) {
            switch (var4_3) {
                case -135193133: {
                    var3_4 ^= var4_3 ^ -319724814;
                    var4_3 = (var2_2 | var5_1) ^ -1536155803;
                    continue block53;
                }
                case -795492182: {
                    var3_4 ^= var4_3 ^ 371215946;
                    var4_3 = (var2_2 | var5_1) ^ 1853179993;
                    continue block53;
                }
                case -903674083: {
                    var3_4 ^= var4_3 ^ -1607896338;
                    ** break;
                }
                case -1785992066: {
                    if (iB.a.field_1724.method_7357().method_7904(var1_5)) {
                        var4_3 = (var2_2 | var5_1) ^ 273609535;
                        continue block53;
                    }
                    ** GOTO lbl181
                }
                case 1985063584: {
                    this.a = iB.a.field_1724.method_36454();
                    ** GOTO lbl176
                }
                case 1603189570: {
                    this.a = z.r.c.d;
                    ** GOTO lbl189
                }
                case 1031926603: {
                    var3_4 ^= var4_3 ^ -350160039;
                    var4_3 = (var2_2 | var5_1) ^ -956629013;
                    continue block53;
                }
                case -941587825: {
                    this.a = 0;
                    var4_3 = (var2_2 | var5_1) ^ -1170395614;
                    continue block53;
                }
                case -340764904: {
                    var3_4 ^= var4_3 ^ 701363994;
                    ** continue;
                }
lbl174:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -1917907321;
                ** GOTO lbl197
lbl176:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -1146407677;
                ** GOTO lbl197
                case -1390786415: {
                    this.b = System.currentTimeMillis();
                    ** GOTO lbl183
                }
lbl181:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 836608826;
                ** GOTO lbl197
lbl183:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 202357236;
                ** GOTO lbl197
                case -1435470568: {
                    var3_4 ^= var4_3 ^ 141135147;
                    var4_3 = (var2_2 | var5_1) ^ 1008608936;
                    ** GOTO lbl197
                }
lbl189:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -964733076;
                ** GOTO lbl197
                case 1079349540: {
                    var3_4 ^= var4_3 ^ 1995399654;
                    ** continue;
                }
                case 1103333893: {
                    var3_4 ^= var4_3 ^ -1376102891;
                    var4_3 = (var2_2 | var5_1) ^ 1457843382;
                }
lbl197:
                // 9 sources

                default: {
                    continue block53;
                }
                case -2090798295: {
                    this.c = iB.a.field_1724.method_36455();
                    ** continue;
                }
                case 1023695820: {
                    return;
                }
                case -1544504639: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private boolean PN() {
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
    private void PO() {
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
    private void PP() {
        int n2 = -426645425;
        int n3 = c & 0xE691E84F ^ 0xD0439B74;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xF8C31D09;
        n4 = (n3 | n2) ^ 0xFA8801A7;
        block11: while (true) {
            switch (n4) {
                default: {
                    continue block11;
                }
                case 1767222321: {
                    n5 ^= n4 ^ 0xB23EDCBB;
                    n4 = (n3 | n2) ^ 0x312CC253;
                    continue block11;
                }
                case 1469170899: {
                    n5 ^= n4 ^ 0x551BA1EA;
                    n4 = (n3 | n2) ^ 0x81A62EC6;
                    continue block11;
                }
                case -488133745: {
                    n5 ^= n4 ^ 0x8184351D;
                    n4 = (n3 | n2) ^ 0xB69DD7A9;
                    continue block11;
                }
                case -2017449853: {
                    this.a = 0;
                    n4 = (n3 | n2) ^ 0xA1423FAC;
                    continue block11;
                }
                case 1078865110: {
                    return;
                }
                case 2004211129: {
                    this.b = System.currentTimeMillis();
                    n4 = (n3 | n2) ^ 0x9F86574E;
                    continue block11;
                }
                case -694347025: {
                    n5 ^= n4 ^ 0xAC7DA50E;
                    n4 = (n3 | n2) ^ 0x7113D3FC;
                    continue block11;
                }
                case 207354584: {
                    n4 = (n3 | n2) ^ 0x204EE190;
                    continue block11;
                }
                case -939574996: 
            }
            this.a = z.r.c.g;
            n4 = (n3 | n2) ^ 0x143450F0;
        }
    }

    private static int PQ(int n2, int n3) {
        int n4 = -1626929193;
        int n5 = -735918122;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x27183FDA)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xDF27A29D;
        n6 -= (n5 | n4) ^ 0xDF27E55D;
        n6 -= (n5 | n4) ^ 0xDF273662;
        n6 += (n5 | n4) ^ 0xDF27F312;
        n6 += (n5 | n4) ^ 0xDF278C48;
        n6 ^= (n5 | n4) ^ 0xDF27D081;
        n6 -= (n5 | n4) ^ 0xDF270C7F;
        n6 -= (n5 | n4) ^ 0xDF27627E;
        return n6 += (n5 | n4) ^ 0xDF27C941;
    }

    /*
     * Exception decompiling
     */
    private void PR() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH]], but top level block is 30[SWITCH]
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
     * Enabled aggressive block sorting
     */
    private void PS() {
        int n2 = 431044814;
        int n3 = c & 0x19B138CE ^ 0xD6CDB297;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x703B9297;
        n4 = (n3 | n2) ^ 0xB7B3ACA4;
        block11: while (true) {
            switch (n4) {
                default: {
                    continue block11;
                }
                case -332983232: {
                    return;
                }
                case -1926168696: {
                    this.a.release();
                    n4 = (n3 | n2) ^ 0xFB9CC9A0;
                    continue block11;
                }
                case -2095387897: {
                    n5 ^= n4 ^ 0x5BA7AFFD;
                    n4 = (n3 | n2) ^ 0xC12F95A1;
                    continue block11;
                }
                case 598705742: {
                    this.a = z.r.c.f;
                    n4 = (n3 | n2) ^ 0x5CE751D8;
                    continue block11;
                }
                case -1933345815: {
                    n5 ^= n4 ^ 0xFF976ECD;
                    n4 = (n3 | n2) ^ 0x33DAAE9F;
                    continue block11;
                }
                case 777604973: {
                    n5 ^= n4 ^ 0x6E876348;
                    n4 = (n3 | n2) ^ 0x52CD4557;
                    continue block11;
                }
                case 1749948027: {
                    n4 = (n3 | n2) ^ 0xF1A4F5B2;
                    continue block11;
                }
                case 610366335: {
                    n5 ^= n4 ^ 0xA1E00056;
                    n4 = (n3 | n2) ^ 0xFC523C91;
                    continue block11;
                }
                case 517091198: 
            }
            this.a = true;
            n4 = (n3 | n2) ^ 0x533EC136;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void PT() {
        var4_1 = 2106195327;
        var1_2 = iB.c & 2106195327 ^ 1092802609;
        var3_3 = 0;
        ** GOTO lbl54
lbl5:
        // 1 sources

        while (true) {
            this.a = z.r.c.f;
            ** GOTO lbl41
            break;
        }
lbl8:
        // 1 sources

        return;
lbl10:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 102802037;
            ** GOTO lbl21
lbl13:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 944864394;
                ** GOTO lbl21
                break;
            }
lbl16:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ 874148573;
                ** continue;
                break;
            }
            break;
        }
lbl19:
        // 1 sources

        block20: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1731962551;
lbl21:
            // 6 sources

            block21: while (true) {
                switch (var3_3) lbl-1000:
                // 8 sources

                {
                    while (true) {
                        default: {
                            continue block21;
                        }
                        break;
                    }
                    case 271719507: {
                        ** continue;
                    }
                    case 1725136511: {
                        ** continue;
                    }
                    case 662659364: {
                        ** continue;
                    }
lbl32:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 762046541;
                        ** GOTO lbl-1000
                        break;
                    }
lbl35:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1919248715;
                        ** GOTO lbl-1000
                        break;
                    }
lbl38:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 262008149;
                        ** GOTO lbl-1000
                        break;
                    }
lbl41:
                    // 2 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1523883099;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 2072731402: {
                        var2_4 ^= var3_3 ^ 1523671822;
                        break block20;
                    }
                    case 1121848712: {
                        var2_4 ^= var3_3 ^ -621415086;
                        var3_3 = (var1_2 | var4_1) ^ 1838801196;
                        ** GOTO lbl-1000
                    }
lbl51:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1064694007;
                        ** GOTO lbl-1000
                        break;
                    }
lbl54:
                    // 1 sources

                    var2_4 = (var1_2 | var4_1) ^ 790083803;
                    var3_3 = (var1_2 | var4_1) ^ -1305066448;
                    ** continue;
                    case 1354765618: {
                        var2_4 ^= var3_3 ^ 1495559412;
                        break;
                    }
                }
                break;
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ -1289602104;
        ** GOTO lbl21
        {
            case 1916145706: {
                if (this.a == z.r.c.f) ** continue;
                ** continue;
            }
        }
lbl65:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 1033942540;
            ** GOTO lbl21
            break;
        }
        {
            case 265196596: {
                var2_4 ^= var3_3 ^ -1746572050;
                ** continue;
            }
            case -811746993: {
                ** continue;
            }
            case -445668298: {
                var2_4 ^= var3_3 ^ 2005564294;
                ** continue;
            }
            case 1074482035: {
                this.a.release();
                ** continue;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ 460882688;
        ** while (true)
        {
            case 1174045173: {
                this.b = -1;
                ** continue;
            }
            ** case -829831497:
        }
lbl85:
        // 1 sources

        this.PU();
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void PU() {
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
    private boolean PV() {
        block34: {
            block36: {
                block33: {
                    block35: {
                        var5_1 = 90572975;
                        var2_2 = iB.c & 90572975 ^ 1820088481;
                        var4_3 = 0;
                        ** GOTO lbl31
lbl5:
                        // 1 sources

                        while (true) {
                            var3_4 ^= var4_3 ^ -71500501;
                            break block33;
                            break;
                        }
lbl8:
                        // 3 sources

                        block18: while (true) {
                            switch (var4_3) lbl-1000:
                            // 4 sources

                            {
                                while (true) {
                                    default: {
                                        continue block18;
                                    }
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 1593356016;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 914207590;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl19:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 181419547;
                                    ** GOTO lbl44
                                    break;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 419156234;
                                    ** GOTO lbl44
                                    break;
                                }
                                case 1500918824: {
                                    v0 = true;
                                    break block18;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -2082360014;
                                    ** continue;
                                    break;
                                }
lbl31:
                                // 1 sources

                                var3_4 = (var2_2 | var5_1) ^ -893510955;
                                ** continue;
                                case 1526983625: {
                                    var3_4 ^= var4_3 ^ 698344672;
                                    break;
                                }
lbl36:
                                // 1 sources

                                while (true) {
                                    var1_5 = v1;
                                    ** continue;
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 1631078448;
                                    ** GOTO lbl44
                                    break;
                                }
lbl42:
                                // 1 sources

                                return v0;
lbl44:
                                // 6 sources

                                block28: while (true) {
                                    switch (var4_3) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block28;
                                            }
                                            break;
                                        }
                                        case -1179486624: {
                                            ** continue;
                                        }
                                        case 864482911: {
                                            v0 = false;
                                            break block18;
                                        }
                                        case 1739482804: {
                                            break block28;
                                        }
lbl56:
                                        // 1 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ 788062861;
                                            ** continue;
                                            break;
                                        }
                                        case 1971685797: {
                                            var3_4 ^= var4_3 ^ 1144281571;
                                            break block34;
                                        }
                                        case 205918367: {
                                            var3_4 ^= var4_3 ^ 1039646937;
                                            ** continue;
                                        }
                                    }
                                    break;
                                }
                                var4_3 = (var2_2 | var5_1) ^ -724816177;
                                ** GOTO lbl44
                            }
                            break;
                        }
                        var3_4 ^= 1520307438;
                        ** while (true)
                        {
                            case -87449985: {
                                if (GLFW.glfwGetKey((long)iB.a.method_22683().method_4490(), (int)var1_5) == 1) {
                                    ** continue;
                                }
                                break block35;
                            }
                        }
                        {
                            case 1132902946: {
                                v1 = (Integer)this.a.getValue();
                                break block36;
                            }
                        }
                    }
                    var4_3 = (var2_2 | var5_1) ^ 1843816050;
                    ** GOTO lbl8
                }
                var4_3 = (var2_2 | var5_1) ^ -1396851946;
                ** GOTO lbl44
                {
                    case 1041633308: {
                        v1 = iB.PQ((var3_4 | var4_3 ^ 997202099) ^ (var4_3 ^ 324465133), (var2_2 | var4_3 ^ 997202099) ^ ((var3_4 | var4_3 ^ 997202099) ^ (var4_3 ^ -1697116144)));
                        break block36;
                    }
                }
                {
                    case 9977565: {
                        var3_4 ^= var4_3 ^ 1912877556;
                        ** continue;
                    }
                }
                var4_3 = (var2_2 | var5_1) ^ 872967303;
                ** GOTO lbl8
lbl90:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -1749563696;
                    ** continue;
                    break;
                }
                {
                    ** case -291508835:
                }
lbl94:
                // 1 sources

                var3_4 ^= var4_3 ^ -804811674;
                ** while (true)
            }
            var3_4 ^= 1994080118;
            ** while (true)
        }
        var4_3 = (var2_2 | var5_1) ^ 1399343283;
        ** while (true)
        {
            ** case -1044126791:
        }
lbl103:
        // 1 sources

        ** while (((Integer)this.a.getValue()).intValue() > 0)
lbl104:
        // 1 sources

        ** while (true)
    }
}

