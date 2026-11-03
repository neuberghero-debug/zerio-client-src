/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.loader.api.FabricLoader
 *  org.slf4j.Logger
 */
package z.r;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.invoke.LambdaMetafactory;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import z.r.dx;
import z.r.es;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class lR {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final long a;
    private final AtomicReference<es> a;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String l;
    private BufferedReader a;
    private volatile boolean a;
    private BufferedWriter a;
    private volatile dx a;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private volatile long b;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private final LinkedBlockingQueue<String> a;
    private static final lR a;
    private static final /* synthetic */ String r;
    private final boolean b;
    private static final long c;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String t;
    private Thread a;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final String w;
    private static final /* synthetic */ String x;
    private Process a;
    private static final /* synthetic */ String y;
    private static final /* synthetic */ String z;
    private volatile long d;
    private static final /* synthetic */ String A;
    private static final /* synthetic */ String B;
    private static final /* synthetic */ String C;
    private static final /* synthetic */ String D;
    private static final /* synthetic */ String E;
    private static final /* synthetic */ String F;
    private static final /* synthetic */ String G;
    private static final int[] a;
    private static final /* synthetic */ String H;
    private static final /* synthetic */ String I;
    private static final /* synthetic */ String J;
    public static final int a;
    private static final /* synthetic */ String K;
    private static final Logger a;
    private static final /* synthetic */ String L;

    /*
     * Enabled aggressive block sorting
     */
    public static lR get() {
        int n2 = a & 0xFF5220B ^ 0x1B0B0361;
        int n3 = 0;
        int n4 = (n2 | 0xFF5220B) ^ 0xB633E742;
        n3 = (n2 | 0xFF5220B) ^ 0x4F8B2882;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1016168705: {
                    n4 ^= n3 ^ 0x9DC80CD0;
                    n3 = (n2 | 0xFF5220B) ^ 0x59174F1C;
                    continue block5;
                }
                case 1349782505: {
                    n3 = (n2 | 0xFF5220B) ^ 0xDC915D94;
                    continue block5;
                }
                case 1189637239: 
            }
            break;
        }
        return a;
    }

    /*
     * Unable to fully structure code
     */
    private lR() {
        var4_1 = -522833119;
        var1_2 = lR.a & -522833119 ^ 1603874651;
        var3_3 = 0;
        ** GOTO lbl61
lbl5:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1659199712;
            ** GOTO lbl29
lbl8:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1034676905;
                ** GOTO lbl29
lbl11:
                // 1 sources

                return;
lbl13:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -1471467687;
                    ** GOTO lbl66
                    break;
                }
                break;
            }
            break;
        }
lbl16:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1264458990;
            ** GOTO lbl29
lbl19:
            // 1 sources

            while (true) {
                continue;
                break;
            }
            break;
        }
lbl21:
        // 1 sources

        while (true) {
            var2_4 ^= -1225858663;
            ** GOTO lbl68
            break;
        }
lbl24:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 170777573;
            ** GOTO lbl29
            break;
        }
lbl27:
        // 1 sources

        block22: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 952418704;
lbl29:
            // 8 sources

            block23: while (true) {
                switch (var3_3) lbl-1000:
                // 5 sources

                {
                    while (true) {
                        default: {
                            continue block23;
                        }
                        break;
                    }
                    case 56573417: {
                        ** continue;
                    }
                    case -168631138: {
                        break block22;
                    }
                    case 1657118811: {
                        ** continue;
                    }
                    case -954466581: {
                        ** continue;
                    }
lbl42:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1548518198;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 1550599089: {
                        this.a = dx.a;
                        break;
                    }
                    case -1032530478: {
                        this.a = new AtomicReference<V>();
                        break;
                    }
                    case 21177553: {
                        var2_4 ^= var3_3 ^ 2117443055;
                        ** continue;
                    }
lbl54:
                    // 1 sources

                    while (true) {
                        this.b = System.getProperty(lR.g, "").toLowerCase(Locale.ROOT).startsWith(lR.i);
                        var3_3 = (var1_2 | var4_1) ^ 1825523002;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 1266605161: {
                        var2_4 ^= var3_3 ^ -298047355;
                        ** continue;
                    }
lbl61:
                    // 1 sources

                    var2_4 = (var1_2 | var4_1) ^ -743940674;
                    ** continue;
lbl63:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 777491810;
                        ** GOTO lbl-1000
                        break;
                    }
lbl66:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -58719598;
                    ** continue;
lbl68:
                    // 1 sources

                    super();
                    ** continue;
                    case -779572711: {
                        Runtime.getRuntime().addShutdownHook(new Thread((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, stop(), ()V)((lR)this), lR.q));
                        ** continue;
                    }
                }
                break;
            }
            break;
        }
        var2_4 ^= -855333702;
        ** while (true)
        {
            case -1901701970: {
                var2_4 ^= var3_3 ^ 1461596933;
                ** continue;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ 1903782869;
        ** GOTO lbl29
        {
            case -579583751: {
                var2_4 ^= var3_3 ^ 1987961806;
                ** continue;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ 581664642;
        ** GOTO lbl29
        {
            ** case -1827636671:
        }
lbl86:
        // 1 sources

        var2_4 ^= var3_3 ^ 1853294222;
        ** while (true)
        this.a = new LinkedBlockingQueue<E>();
        var3_3 = (var1_2 | var4_1) ^ -23323734;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public dx snapshot() {
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

    public synchronized void start() {
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void stop() {
        block38: {
            block37: {
                block36: {
                    break block38;
lbl1:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -1824228700;
                        break block36;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -671431279;
                        ** GOTO lbl57
lbl7:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 550497392;
                            ** GOTO lbl57
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -157070388;
                            ** GOTO lbl57
lbl13:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1052501040;
                                ** GOTO lbl57
                                break;
                            }
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1126844744;
                            ** GOTO lbl57
lbl19:
                            // 1 sources

                            while (true) {
                                this.a = false;
                                ** continue;
                                break;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 613800724;
                                ** GOTO lbl87
                                break;
                            }
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1680165078;
                            ** GOTO lbl57
lbl28:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -1026260999;
                                break block37;
                                break;
                            }
lbl31:
                            // 1 sources

                            return;
lbl33:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1740744662;
                                ** GOTO lbl57
lbl36:
                                // 1 sources

                                while (true) {
                                    this.a = null;
                                    ** GOTO lbl94
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 1602983274;
                                    ** GOTO lbl92
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 2144550491;
                ** GOTO lbl57
            }
            var3_3 = (var1_2 | var4_1) ^ 955367980;
            ** GOTO lbl57
        }
        var4_1 = 315481279;
        var1_2 = lR.a & 315481279 ^ 2019523747;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 119831493;
        var3_3 = (var1_2 | var4_1) ^ 1843464409;
        if (true) ** GOTO lbl57
        block31: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 2066750988;
lbl57:
            // 11 sources

            block32: while (true) {
                switch (var3_3) lbl-1000:
                // 5 sources

                {
                    while (true) {
                        default: {
                            continue block32;
                        }
                        break;
                    }
                    case 44124712: {
                        ** continue;
                    }
                    case -365865027: {
                        ** continue;
                    }
                    case 519746665: {
                        ** continue;
                    }
                    case -1147410577: {
                        ** continue;
                    }
                    case 390001766: {
                        ** continue;
                    }
                    case -1676836599: {
                        ** continue;
                    }
                    case 972404215: {
                        ** continue;
                    }
                    case 1511002319: {
                        ** continue;
                    }
                    case 32498355: {
                        this.BI();
                        ** continue;
                    }
                    case 84722404: {
                        this.a.interrupt();
                        ** continue;
                    }
                    case -1937983629: {
                        var2_4 ^= var3_3 ^ 496601087;
                        ** continue;
                    }
lbl87:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -422412874;
                    ** GOTO lbl-1000
                    case -1390069458: {
                        this.a = dx.a;
                        ** continue;
                    }
lbl92:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -1863406846;
                    ** GOTO lbl-1000
lbl94:
                    // 2 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 587132599;
                        ** GOTO lbl-1000
                        break;
                    }
lbl97:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 2021570199;
                        ** continue;
                        break;
                    }
                    case -488528747: {
                        var2_4 ^= var3_3 ^ 1133356754;
                        ** continue;
                    }
                    case 1478562312: {
                        var2_4 ^= var3_3 ^ 1553051731;
                        continue block31;
                    }
                    case 1110326931: 
                }
                break;
            }
            break;
        }
        ** while (this.a == null)
lbl108:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isRunning() {
        int n2 = a & 0x6580E455 ^ 0xA34BA3B7;
        int n3 = 0;
        int n4 = (n2 | 0x6580E455) ^ 0xF9FED878;
        n3 = (n2 | 0x6580E455) ^ 0x2C011B7B;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -875889524: {
                    break;
                }
                case 929264416: {
                    n4 ^= n3 ^ 0x93B4027C;
                    n3 = (n2 | 0x6580E455) ^ 0x3F152378;
                    continue block5;
                }
                case -656489329: {
                    return this.a;
                }
            }
            n3 = (n2 | 0x6580E455) ^ 0xD0A894D7;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void seek(long var1_1) {
        block59: {
            block57: {
                block58: {
                    var9_2 = 540923431;
                    var6_3 = lR.a & 540923431 ^ -1606589228;
                    var8_4 = 0;
                    ** GOTO lbl106
lbl5:
                    // 2 sources

                    while (true) {
                        var7_7 ^= -253776352;
                        break block57;
                        break;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ -2033882130;
                        break block58;
lbl11:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ -2082125481;
                            break block59;
                            break;
                        }
lbl14:
                        // 1 sources

                        return;
lbl16:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ 1196430439;
                            break block59;
                            break;
                        }
lbl19:
                        // 1 sources

                        while (true) {
                            this.BD(lR.e, "SEEK " + Math.max(0L, var1_1));
                            ** GOTO lbl164
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ -2115235324;
                            break block59;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var7_7 ^= var8_4 ^ -1053722866;
                            ** continue;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ 366598274;
                            break block59;
                            break;
                        }
lbl31:
                        // 1 sources

                        while (!this.a) {
                            ** GOTO lbl86
                        }
                        ** GOTO lbl68
lbl34:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ 1575294721;
                            break block59;
                            break;
                        }
                        break;
                    }
lbl37:
                    // 1 sources

                    while (true) {
                        ** GOTO lbl108
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ 1951177843;
                        break block59;
                        break;
                    }
lbl42:
                    // 1 sources

                    while (true) {
                        var7_7 ^= var8_4 ^ 203747566;
                        ** continue;
                        break;
                    }
lbl45:
                    // 1 sources

                    while (true) {
                        if (!var3_5.present()) ** GOTO lbl62
                        ** GOTO lbl72
                        break;
                    }
                }
lbl49:
                // 2 sources

                block40: while (true) {
                    switch (var8_4) lbl-1000:
                    // 6 sources

                    {
                        while (true) {
                            default: {
                                continue block40;
                            }
                            break;
                        }
                        case 653827353: {
                            ** continue;
                        }
                        case -1422085229: {
                            ** GOTO lbl31
                        }
lbl58:
                        // 1 sources

                        return;
lbl60:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl62:
                        // 2 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ -1028007734;
                            break block59;
                            break;
                        }
lbl65:
                        // 1 sources

                        while (true) {
                            var7_7 ^= var8_4 ^ -409544196;
                            ** continue;
                            break;
                        }
lbl68:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ 1800534446;
                        ** GOTO lbl-1000
                        case -1929685556: {
                            break block40;
                        }
lbl72:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ -1607237782;
                        break block59;
lbl74:
                        // 1 sources

                        while (true) {
                            var7_7 ^= var8_4 ^ 1055924782;
                            ** GOTO lbl94
                            break;
                        }
lbl77:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ -1772941086;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -882110631: {
                            var7_7 ^= var8_4 ^ 1263782175;
                            ** continue;
                        }
                        this.b = System.currentTimeMillis();
                        var8_4 = (var6_3 | var9_2) ^ -1210149561;
                        break block59;
lbl86:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ -403421781;
                        ** GOTO lbl-1000
lbl88:
                        // 1 sources

                        while (true) {
                            var7_7 ^= var8_4 ^ 2013250716;
                            ** continue;
                            break;
                        }
                        case 913237525: {
                            var3_5 = this.a;
                            ** GOTO lbl115
                        }
lbl94:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ -676685506;
                        break block59;
lbl96:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ 751215419;
                            ** GOTO lbl-1000
                            break;
                        }
lbl99:
                        // 1 sources

                        while (var3_5.durationMs() > 0L) {
                            ** continue;
lbl101:
                            // 1 sources

                            ** GOTO lbl22
                        }
                        break;
lbl103:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ 184632676;
                            ** continue;
                            break;
                        }
lbl106:
                        // 1 sources

                        var7_7 = (var6_3 | var9_2) ^ -28644395;
                        ** continue;
lbl108:
                        // 1 sources

                        var7_7 ^= -990345437;
                        ** GOTO lbl113
lbl110:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ -1597973170;
                            break block59;
                            break;
                        }
lbl113:
                        // 1 sources

                        this.a = new dx(true, var3_5.title(), var3_5.artist(), var3_5.playing(), var4_6, var3_5.durationMs(), System.currentTimeMillis(), var3_5.volume());
                        ** continue;
lbl115:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ -144465293;
                        break block59;
lbl117:
                        // 1 sources

                        while (true) {
                            var7_7 ^= var8_4 ^ -719456411;
                            ** continue;
                            break;
                        }
lbl120:
                        // 1 sources

                        while (true) {
                            v0 = var1_1;
                            ** GOTO lbl5
                            break;
                        }
                    }
                    break;
                }
                var8_4 = (var6_3 | var9_2) ^ -173995879;
                ** while (true)
            }
            var4_6 = v0;
            var7_7 ^= 30721030;
            ** while (true)
        }
        block55: while (true) {
            switch (var8_4) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block55;
                    }
                    break;
                }
                case 601407392: {
                    ** continue;
                }
                case 952733: {
                    ** continue;
                }
                case 174275480: {
                    ** continue;
                }
                case 2006413257: {
                    ** continue;
                }
                case -1243337099: {
                    ** continue;
                }
                case 16591801: {
                    ** continue;
                }
                case 400778160: {
                    ** continue;
                }
                case 1465799812: {
                    ** continue;
                }
                case -2093754614: {
                    ** continue;
                }
                case -412228976: {
                    ** GOTO lbl99
                }
                case 567403763: {
                    ** continue;
                }
                case -730764668: {
                    ** continue;
                }
                {
                    case 1436352110: {
                        var7_7 ^= var8_4 ^ -2055976578;
                        ** continue;
                    }
                }
                var8_4 = (var6_3 | var9_2) ^ 588128765;
                ** GOTO lbl-1000
lbl164:
                // 1 sources

                var8_4 = (var6_3 | var9_2) ^ -1436627601;
                ** continue;
                {
                    ** case 1204400988:
                }
lbl167:
                // 1 sources

                var7_7 ^= var8_4 ^ 2058840325;
                ** continue;
                case -36118026: {
                    v0 = Math.min(var1_1, var3_5.durationMs());
                    ** continue;
                }
                case 1652829757: 
            }
            break;
        }
        var7_7 ^= var8_4 ^ -1413859189;
        ** while (true)
    }

    private static int BC(int n2, int n3) {
        int n4 = -1511901010;
        int n5 = 1792417193;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x65F49A9A)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xEFF6C3B3;
        n6 -= (n5 | n4) ^ 0xEFF60C56;
        n6 ^= (n5 | n4) ^ 0xEFF6A3A7;
        n6 -= (n5 | n4) ^ 0xEFF6B07E;
        n6 ^= (n5 | n4) ^ 0xEFF61F87;
        return n6 ^= (n5 | n4) ^ 0xEFF6FFE0;
    }

    /*
     * Unable to fully structure code
     */
    public void setVolume(float var1_1) {
        block56: {
            block49: {
                block51: {
                    block50: {
                        block55: {
                            block57: {
                                block54: {
                                    block53: {
                                        block52: {
                                            break block57;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                var6_4 = (var4_3 | var7_2) ^ -1670605230;
                                                break block49;
                                                break;
                                            }
lbl4:
                                            // 1 sources

                                            while (true) {
                                                var6_4 = (var4_3 | var7_2) ^ 2002797575;
                                                break block49;
                                                break;
                                            }
lbl7:
                                            // 1 sources

                                            while (true) {
                                                var5_7 ^= -414248542;
                                                break block50;
                                                break;
                                            }
lbl10:
                                            // 1 sources

                                            while (true) {
                                                var5_7 ^= var6_4 ^ 1313285986;
                                                ** GOTO lbl98
                                                break;
                                            }
lbl13:
                                            // 1 sources

                                            while (true) {
                                                var6_4 = (var4_3 | var7_2) ^ -1407672318;
                                                break block49;
                                                break;
                                            }
lbl16:
                                            // 1 sources

                                            while (true) {
                                                var6_4 = (var4_3 | var7_2) ^ -1216349354;
                                                break block51;
                                                break;
                                            }
lbl19:
                                            // 1 sources

                                            while (true) {
                                                if (this.a) break block52;
                                                break block53;
                                                break;
                                            }
lbl22:
                                            // 1 sources

                                            while (true) {
                                                var6_4 = (var4_3 | var7_2) ^ 933460859;
                                                break block49;
                                                break;
                                            }
lbl25:
                                            // 1 sources

                                            while (true) {
                                                if (!var3_6.present()) break block54;
                                                break block55;
                                                break;
                                            }
                                        }
                                        var6_4 = (var4_3 | var7_2) ^ 554073579;
                                        break block51;
lbl31:
                                        // 1 sources

                                        while (true) {
                                            this.BD(lR.k, "VOL " + Math.round(var2_5 * 100.0f));
                                            ** continue;
                                            break;
                                        }
lbl34:
                                        // 1 sources

                                        while (true) {
                                            var6_4 = (var4_3 | var7_2) ^ -110389951;
                                            break block51;
                                            break;
                                        }
lbl37:
                                        // 1 sources

                                        while (true) {
                                            ** GOTO lbl94
                                            break;
                                        }
                                    }
                                    var6_4 = (var4_3 | var7_2) ^ 2014443883;
                                    break block51;
                                }
lbl43:
                                // 2 sources

                                while (true) {
                                    var6_4 = (var4_3 | var7_2) ^ -978468912;
                                    break block49;
                                    break;
                                }
                            }
                            var7_2 = 116514591;
                            var4_3 = lR.a & 116514591 ^ -2030702516;
                            var6_4 = 0;
                            var5_7 = (var4_3 | var7_2) ^ 1035514361;
                            ** while (true)
lbl52:
                            // 1 sources

                            while (true) {
                                var5_7 ^= var6_4 ^ 1642253567;
                                break block56;
                                break;
                            }
lbl55:
                            // 1 sources

                            return;
lbl57:
                            // 1 sources

                            while (true) {
                                var6_4 = (var4_3 | var7_2) ^ 283964452;
                                break block51;
                                break;
                            }
lbl60:
                            // 1 sources

                            while (true) {
                                this.a = new dx(true, var3_6.title(), var3_6.artist(), var3_6.playing(), var3_6.positionMs(), var3_6.durationMs(), var3_6.fetchedAtMs(), var2_5);
                                ** continue;
                                break;
                            }
                        }
                        var6_4 = (var4_3 | var7_2) ^ 742037017;
                        break block49;
lbl66:
                        // 1 sources

                        while (true) {
                            var6_4 = (var4_3 | var7_2) ^ -1061730530;
                            break block49;
                            break;
                        }
lbl69:
                        // 1 sources

                        while (true) {
                            var5_7 ^= var6_4 ^ 1733047017;
                            ** continue;
                            break;
                        }
lbl72:
                        // 1 sources

                        while (true) {
                            var6_4 = (var4_3 | var7_2) ^ 104263928;
                            break block51;
                            break;
                        }
                    }
                    var3_6 = this.a;
                    var6_4 = (var4_3 | var7_2) ^ -668762428;
                    break block49;
lbl79:
                    // 1 sources

                    while (true) {
                        var6_4 = (var4_3 | var7_2) ^ -1609791086;
                        break block49;
                        break;
                    }
                }
                block42: while (true) {
                    switch (var6_4) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block42;
                            }
                            break;
                        }
                        case -1477213516: {
                            ** continue;
                        }
                        case -2134700121: {
                            ** continue;
                        }
                        case 2141088286: {
                            ** continue;
                        }
lbl94:
                        // 1 sources

                        var5_7 ^= -1206079431;
                        ** continue;
                        case 831128585: {
                            ** continue;
                        }
lbl98:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -1873595956;
                        ** continue;
lbl100:
                        // 1 sources

                        while (true) {
                            var5_7 ^= var6_4 ^ 315873663;
                            ** continue;
                            break;
                        }
lbl103:
                        // 1 sources

                        while (true) {
                            this.d = System.currentTimeMillis();
                            ** continue;
                            break;
                        }
lbl106:
                        // 1 sources

                        while (true) {
                            var5_7 ^= var6_4 ^ -1823128798;
                            ** continue;
                            break;
                        }
                        case -18610636: {
                            var5_7 ^= var6_4 ^ 1816893598;
                            ** continue;
                        }
                        case -1776743557: {
                            var5_7 ^= var6_4 ^ -112600612;
                            ** continue;
                        }
                        case 380030611: 
                    }
                    break;
                }
                var2_5 = Math.max(0.0f, Math.min(1.0f, var1_1));
                ** while (true)
lbl118:
                // 1 sources

                while (true) {
                    var5_7 ^= var6_4 ^ -1138503232;
                    ** continue;
                    break;
                }
            }
lbl122:
            // 2 sources

            block48: while (true) {
                switch (var6_4) {
                    default: {
                        continue block48;
                    }
                    case 1591922947: {
                        ** continue;
                    }
                    case 1178777665: {
                        ** continue;
                    }
                    case 446261517: {
                        ** continue;
                    }
                    case 1591116187: {
                        ** continue;
                    }
                    case -241845416: {
                        ** continue;
                    }
                    case -1429247674: {
                        ** continue;
                    }
                    case 720199517: {
                        ** continue;
                    }
                    case 1129857167: {
                        ** continue;
                    }
                    case -1319730140: {
                        ** continue;
                    }
                    case 653883085: {
                        return;
                    }
                }
                break;
            }
        }
        var6_4 = (var4_3 | var7_2) ^ -669569444;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void playPause() {
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
    public void nextTrack() {
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
    public void previousTrack() {
        block20: {
            block19: {
                var4_1 = -2124213913;
                var1_2 = lR.a & -2124213913 ^ 1500822356;
                var3_3 = 0;
                ** GOTO lbl18
lbl5:
                // 1 sources

                while (true) {
                    this.a.offer(lR.s);
                    ** GOTO lbl26
                    break;
                }
lbl9:
                // 1 sources

                block12: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 668587972;
lbl11:
                    // 4 sources

                    block13: while (true) {
                        switch (var3_3) lbl-1000:
                        // 6 sources

                        {
                            while (true) {
                                default: {
                                    continue block13;
                                }
                                break;
                            }
                            case -22123341: {
                                ** continue;
                            }
lbl18:
                            // 1 sources

                            var2_4 = (var1_2 | var4_1) ^ 868829283;
                            break block19;
                            case 1118051761: {
                                var2_4 ^= var3_3 ^ 198884613;
                                break block20;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1843125520;
                                ** GOTO lbl-1000
                                break;
                            }
lbl26:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -1344086647;
                            ** GOTO lbl-1000
lbl28:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 845937259;
                                ** GOTO lbl-1000
                                break;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -800361915;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 1890973500: {
                                if (this.a) break block12;
                                ** continue;
                            }
lbl37:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1680628026;
                                ** continue;
                                break;
                            }
                            case 1989502718: {
                                var2_4 ^= var3_3 ^ 1250877858;
                                ** continue;
                            }
                            case 154978610: {
                                return;
                            }
                            case -549454426: {
                                ** continue;
                            }
                            case 1263769991: {
                                return;
                            }
                            case -350469860: {
                                var2_4 ^= var3_3 ^ -1373156387;
                                ** continue;
                            }
                        }
                        break;
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ 488704949;
                ** GOTO lbl11
                {
                    ** case -1000951614:
                }
lbl55:
                // 1 sources

                var2_4 ^= var3_3 ^ 827876238;
                ** while (true)
            }
            var3_3 = (var1_2 | var4_1) ^ 105400017;
            ** GOTO lbl11
        }
        var3_3 = (var1_2 | var4_1) ^ -1446884277;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void requestArt() {
        block29: {
            block33: {
                break block33;
lbl1:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1378758876;
                    ** GOTO lbl40
lbl4:
                    // 1 sources

                    return;
lbl6:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 942250703;
                        ** GOTO lbl40
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -399076262;
                        ** continue;
                        break;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -687408825;
                        break block29;
                        break;
                    }
                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 262481439;
                        ** GOTO lbl40
                        break;
                    }
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    block30: {
                        block32: {
                            block31: {
                                var3_3 = (var1_2 | var4_1) ^ 1708889881;
                                break block32;
lbl21:
                                // 1 sources

                                while (true) {
                                    if (this.a) ** continue;
                                    break block30;
                                    break;
                                }
lbl24:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -136901927;
                                    break block31;
                                    break;
                                }
lbl27:
                                // 2 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -826130921;
                                    break block32;
lbl30:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 1479730165;
                                        break block32;
                                        break;
                                    }
lbl33:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -1449322862;
                                        break block32;
lbl36:
                                        // 1 sources

                                        return;
                                    }
                                    break;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ 1205189422;
                        }
lbl41:
                        // 3 sources

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
                                case 1233483056: {
                                    ** continue;
                                }
                                case -1083256344: {
                                    ** continue;
                                }
                                case -1373537494: {
                                    ** continue;
                                }
                                case -667813523: {
                                    ** continue;
                                }
                                case 913921233: {
                                    ** continue;
                                }
                                case -625123639: {
                                    ** continue;
                                }
                                case 8559414: {
                                    ** continue;
                                }
                                case -595779365: {
                                    if (this.a.contains(lR.E)) ** GOTO lbl27
                                    ** continue;
                                }
lbl63:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1424903882;
                                    ** continue;
                                    break;
                                }
                                case 2114570720: {
                                    var2_4 ^= var3_3 ^ -52182554;
                                    ** continue;
                                }
                                case 698223626: {
                                    this.a.offer(lR.E);
                                    ** continue;
                                }
                                case 343374054: {
                                    ** continue;
                                }
                            }
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ -544369451;
                    ** GOTO lbl41
                    break;
                }
            }
            var4_1 = 271109092;
            var1_2 = lR.a & 271109092 ^ 1904537247;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -1129408;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ 1898869961;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public es pollArt() {
        int n2 = a & 0xE144CE88 ^ 0xBE9AEE45;
        int n3 = 0;
        int n4 = (n2 | 0xE144CE88) ^ 0xD595C60B;
        n3 = (n2 | 0xE144CE88) ^ 0xA608C6F7;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -905406312: {
                    n4 ^= n3 ^ 0xA91A6C9F;
                    n3 = (n2 | 0xE144CE88) ^ 0x8FD2DAEF;
                    continue block5;
                }
                case 1507207226: {
                    n3 = (n2 | 0xE144CE88) ^ 0x35D67655;
                    continue block5;
                }
                case 1879847970: 
            }
            break;
        }
        return ((AtomicReference)((Object)this.a)).getAndSet(null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void BD(String var1_1, String var2_2) {
        var6_3 = -722439779;
        var3_4 = lR.a & -722439779 ^ -1221847811;
        var5_5 = 0;
        var4_6 = (var3_4 | var6_3) ^ -1328859393;
        var5_5 = (var3_4 | var6_3) ^ 169043445;
        if (true) ** GOTO lbl9
        block11: while (true) {
            var5_5 = (var3_4 | var6_3) ^ 700065589;
lbl9:
            // 2 sources

            block12: while (true) {
                block14: {
                    switch (var5_5) {
                        case -1932575407: {
                            var4_6 ^= var5_5 ^ 108083404;
                            var5_5 = (var3_4 | var6_3) ^ 1906843794;
                            continue block12;
                        }
                        case 583754315: {
                            ** break;
                        }
                        case -34664440: {
                            var5_5 = (var3_4 | var6_3) ^ -922578399;
                            continue block12;
                        }
                        case -2041293457: {
                            return;
                        }
                        case -2112404092: {
                            this.a.removeIf((Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, BJ(java.lang.String java.lang.String ), (Ljava/lang/String;)Z)((String)var1_1));
                            ** break;
                        }
                        case 1847505801: {
                            this.a.offer(var2_2);
                            break block14;
                        }
lbl30:
                        // 1 sources

                        var5_5 = (var3_4 | var6_3) ^ -1713191308;
                        continue block12;
                        case -1333010521: {
                            var4_6 ^= var5_5 ^ 632256815;
                            continue block11;
                        }
                        case 1056892892: {
                            var4_6 ^= var5_5 ^ 1340160058;
                            var5_5 = (var3_4 | var6_3) ^ 1978347641;
                        }
                        default: {
                            continue block12;
                        }
lbl40:
                        // 1 sources

                        var5_5 = (var3_4 | var6_3) ^ 1199024730;
                        continue block12;
                        case -565816632: 
                    }
                    if (var2_2 != null) {
                        var5_5 = (var3_4 | var6_3) ^ -717809738;
                        continue;
                    }
                }
                var5_5 = (var3_4 | var6_3) ^ 2066958508;
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
    private void BE() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [82[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private void BF(String var1_1, String var2_2, String var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [31[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private void BG(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [185[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean BH() {
        var7_1 = 1217240867;
        var6_2 = -133744617;
        var3_3 = lR.a & 1217240867 ^ 593994054;
        var5_4 = 0;
        var4_5 = (var3_3 | var7_1) ^ 1413376538;
        var5_4 = (var3_3 | var7_1) ^ -2100965728;
        ** GOTO lbl39
lbl-1000:
        // 1 sources

        {
            block32: {
                block31: {
                    while (true) {
                        var5_4 = (var3_3 | var7_1) ^ 48973956;
                        break block31;
                        break;
                    }
lbl11:
                    // 1 sources

                    block28: while (true) {
                        switch (var5_4) {
                            default: {
                                continue block28;
                            }
                            case -1108947542: {
                                var4_5 ^= var5_4 ^ 835843310;
                                var5_4 = (var3_3 | var7_1) ^ -1555006885;
                                continue block28;
                            }
                            case -926956228: {
                                Files.writeString(var1_6, (CharSequence)lR.r, StandardCharsets.UTF_8, new OpenOption[0]);
                                var5_4 = (var3_3 | var7_1) ^ -2085732541;
                                continue block28;
                            }
                            case -398360540: {
                                var4_5 ^= var5_4 ^ -460883097;
                                var5_4 = (var3_3 | var7_1) ^ -614131629;
                                continue block28;
                            }
                            case -1333090508: 
                        }
                        v0 = new String[lR.BC((var4_5 | var5_4 ^ var6_2) ^ (var5_4 ^ -1051328522), (var3_3 | var5_4 ^ var6_2) ^ ((var4_5 | var5_4 ^ var6_2) ^ (var5_4 ^ -1052982189)))];
                        v0[0] = lR.G;
                        v0[1] = lR.n;
                        v0[2] = lR.I;
                        v0[3] = lR.b;
                        v0[4] = lR.D;
                        v0[5] = lR.J;
                        v1 = lR.BC((var4_5 | var5_4 ^ var6_2) ^ (var5_4 ^ -1051328521), (var3_3 | var5_4 ^ var6_2) ^ ((var4_5 | var5_4 ^ var6_2) ^ (var5_4 ^ -387989766)));
                        var4_5 ^= 1641819071;
                        break block32;
                        break;
                    }
                }
                block29: while (true) {
                    switch (var5_4) {
                        default: {
                            continue block29;
                        }
                        case -383094329: {
                            ** continue;
                        }
                        case 1761933283: {
                            var4_5 ^= var5_4 ^ -2052914292;
                            var5_4 = (var3_3 | var7_1) ^ -773665249;
                            continue block29;
                        }
                        case -1173524104: 
                    }
                    break;
                }
                var4_5 ^= -522842653;
                var1_6 = FabricLoader.getInstance().getConfigDir().resolve(lR.h);
                var5_4 = (var3_3 | var7_1) ^ -704023859;
                ** continue;
            }
            v0[v1] = var1_6.toString();
            var2_8 = new ProcessBuilder(v0);
            var5_4 = (var3_3 | var7_1) ^ 2055874988;
            block30: while (true) {
                switch (var5_4) {
                    default: {
                        continue block30;
                    }
                    case 291870411: {
                        var4_5 ^= var5_4 ^ -1772793324;
                        var5_4 = (var3_3 | var7_1) ^ 2111073316;
                        continue block30;
                    }
                    case 373019459: {
                        var2_8.redirectError(ProcessBuilder.Redirect.DISCARD);
                        var5_4 = (var3_3 | var7_1) ^ 588775329;
                        continue block30;
                    }
                    case 1224229062: {
                        var4_5 ^= var5_4 ^ 415394622;
                        var5_4 = (var3_3 | var7_1) ^ 631018849;
                        continue block30;
                    }
                    case 1316170246: {
                        this.a = var2_8.start();
                        var5_4 = (var3_3 | var7_1) ^ -450019339;
                        continue block30;
                    }
                    case -1899855726: {
                        var4_5 ^= var5_4 ^ 1305330551;
                        var5_4 = (var3_3 | var7_1) ^ -1938244622;
                        continue block30;
                    }
                    case -409533291: {
                        var4_5 ^= 240840922;
                        this.a = new BufferedWriter(new OutputStreamWriter(this.a.getOutputStream(), StandardCharsets.US_ASCII));
                        var5_4 = (var3_3 | var7_1) ^ -1496887428;
                        continue block30;
                    }
                    case -852955109: {
                        var4_5 ^= var5_4 ^ 161321328;
                        var5_4 = (var3_3 | var7_1) ^ -1012384256;
                        continue block30;
                    }
                    case -1471708825: {
                        var4_5 ^= -665038826;
                        this.a = new BufferedReader(new InputStreamReader(this.a.getInputStream(), StandardCharsets.UTF_8));
                        var5_4 = (var3_3 | var7_1) ^ -1685857608;
                        continue block30;
                    }
                    case -261331489: {
                        var4_5 ^= var5_4 ^ -2058673781;
                        var5_4 = (var3_3 | var7_1) ^ 1371178247;
                        continue block30;
                    }
                    case 978664032: {
                        lR.a.info(lR.m);
                        var5_4 = (var3_3 | var7_1) ^ 611020406;
                        continue block30;
                    }
                    case 1334104337: {
                        var4_5 ^= var5_4 ^ 2112597410;
                        var5_4 = (var3_3 | var7_1) ^ 1889806384;
                        continue block30;
                    }
                    case 457938775: 
                }
                break;
            }
            var4_5 ^= -390477321;
            return true;
        }
    }

    /*
     * Exception decompiling
     */
    private void BI() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [27[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static /* synthetic */ boolean BJ(String string, String string2) {
        int n2 = a & 0x72D9BA84 ^ 0x25A23A99;
        int n3 = 0;
        int n4 = (n2 | 0x72D9BA84) ^ 0xA0D4AE00;
        n3 = (n2 | 0x72D9BA84) ^ 0xF50109FE;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -2080744304: {
                    return string2.startsWith(string);
                }
                case -2097499293: {
                    n3 = (n2 | 0x72D9BA84) ^ 0xB1981D5A;
                    continue block5;
                }
                case -966547513: 
            }
            n4 ^= n3 ^ 0x6F2DCBA;
            n3 = (n2 | 0x72D9BA84) ^ 0xF401E60D;
        }
    }
}

