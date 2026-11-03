/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import com.google.gson.JsonObject;
import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.net.StandardProtocolFamily;
import java.net.UnixDomainSocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.aL;
import z.r.dt;
import z.r.eL;
import z.r.fM;
import z.r.gj;
import z.r.kH;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class bv {
    private static final int a;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final long a;
    private static final long b;
    private static final /* synthetic */ String c;
    private eL a;
    private static final /* synthetic */ String d;
    private volatile boolean a;
    private static final int b;
    private String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private long c;
    public static final int g;
    private static final /* synthetic */ String n;
    private static final int c;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private final long d;
    private static final int[] a;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final long e;
    private volatile fM a;
    private static final long f;
    private static final long g;
    private static final /* synthetic */ String s;
    private static final int d;
    private static final int e;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private final AtomicBoolean a;
    private static final /* synthetic */ String w;
    private static final /* synthetic */ String x;
    private static final int f;
    private static final long h;
    private volatile Thread a;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public bv(long var1_1) {
        var6_2 = 985846349;
        var3_3 = bv.g & 985846349 ^ -1062675989;
        var5_4 = 0;
        var4_5 = (var3_3 | var6_2) ^ -473902039;
        while (true) {
            switch (var4_5) {
                default: {
                    var4_5 ^= -84370531;
                    ** GOTO lbl12
                }
                case 422186950: {
                    var4_5 ^= 1173644897;
lbl12:
                    // 2 sources

                    super();
                    var5_4 = (var3_3 | var6_2) ^ 1389504343;
                    ** GOTO lbl26
                }
                case 1794631273: 
            }
            var4_5 ^= -1720353173;
        }
lbl18:
        // 1 sources

        while (true) {
            var5_4 = (var3_3 | var6_2) ^ 210178232;
            if (true) ** GOTO lbl26
            break;
        }
        block14: while (true) {
            var5_4 = (var3_3 | var6_2) ^ 846395728;
            if (true) ** GOTO lbl26
            block15: while (true) {
                var5_4 = (var3_3 | var6_2) ^ -253701126;
lbl26:
                // 4 sources

                block16: while (true) {
                    switch (var5_4) {
                        default: {
                            continue block16;
                        }
                        case -1472660296: {
                            var4_5 ^= var5_4 ^ 1554541344;
                            var5_4 = (var3_3 | var6_2) ^ -566073055;
                            continue block16;
                        }
                        case -929553729: {
                            this.d = var1_1;
                            ** continue;
                        }
                        case -160576681: {
                            var4_5 ^= var5_4 ^ -2079685578;
                            continue block15;
                        }
                        case 1484985914: {
                            var4_5 ^= var5_4 ^ 27136555;
                            continue block14;
                        }
                        case 615035598: {
                            this.a = new AtomicBoolean(false);
                            var5_4 = (var3_3 | var6_2) ^ -1570124331;
                            continue block16;
                        }
                        case 168429589: 
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
    public void start() {
        block22: {
            break block22;
lbl1:
            // 1 sources

            block19: while (true) {
                switch (var4_3) {
                    default: {
                        continue block19;
                    }
                    case -1007146923: {
                        var3_5 ^= var4_3 ^ -1185343031;
                        ** GOTO lbl28
                    }
                    case 935977426: {
                        var1_4.setDaemon(true);
                        ** GOTO lbl26
                    }
                    case 1683347175: {
                        var3_5 ^= var4_3 ^ -26078286;
                        var4_3 = (var2_2 | var5_1) ^ 1779642677;
                        continue block19;
                    }
                    case 1569016610: {
                        var1_4.start();
                        ** break;
                    }
                    case 1069331281: {
                        var3_5 ^= var4_3 ^ 1881174786;
                        ** GOTO lbl32
                    }
                    case 858185700: {
                        this.a = var1_4;
                        ** GOTO lbl30
                    }
lbl24:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1023687444;
                    continue block19;
lbl26:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 1650877366;
                    continue block19;
lbl28:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 6265797;
                    continue block19;
lbl30:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1641875278;
                    continue block19;
lbl32:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 1862012675;
                    continue block19;
                    case -1625222133: {
                        var3_5 ^= var4_3 ^ -1140661995;
                        var4_3 = (var2_2 | var5_1) ^ -106698444;
                        continue block19;
                    }
                    case -1535559213: 
                }
                return;
            }
        }
        var5_1 = 1566199905;
        var2_2 = bv.g & 1566199905 ^ 1553649831;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ 681614195;
        var4_3 = (var2_2 | var5_1) ^ 1418110386;
        block20: while (true) {
            switch (var4_3) {
                case -179056319: {
                    if (!this.a.compareAndSet(false, true)) {
                        ** break;
                    }
                    ** GOTO lbl74
                }
                case 157054293: {
                    var4_3 = (var2_2 | var5_1) ^ 1667211112;
                    continue block20;
                }
                case -1848944061: {
                    var1_4 = new Thread((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, oS(), ()V)((bv)this), bv.s);
                    var4_3 = (var2_2 | var5_1) ^ 965674496;
                    ** continue;
                }
                case -893276496: {
                    var3_5 ^= var4_3 ^ -1938562154;
                    var4_3 = (var2_2 | var5_1) ^ -871265628;
                    continue block20;
                }
                case 1048924047: {
                    var3_5 ^= var4_3 ^ 1874091350;
                    var4_3 = (var2_2 | var5_1) ^ -1467416154;
                    ** GOTO lbl68
                }
lbl67:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 1972709081;
lbl68:
                // 3 sources

                default: {
                    continue block20;
                }
                case 676329022: {
                    var3_5 ^= var4_3 ^ 238089055;
                    var4_3 = (var2_2 | var5_1) ^ 1545293767;
                    continue block20;
                }
lbl74:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -1759805865;
                continue block20;
                case 29466400: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void stop() {
        block36: {
            block38: {
                block37: {
                    block35: {
                        var5_1 = -134863309;
                        var2_2 = bv.g & -134863309 ^ 692725232;
                        var4_3 = 0;
                        ** GOTO lbl35
lbl5:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -1582243472;
                            if (true) ** GOTO lbl10
                            break;
                        }
                        block20: while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -1115330993;
lbl10:
                            // 3 sources

                            block21: while (true) {
                                switch (var4_3) lbl-1000:
                                // 6 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block21;
                                        }
                                        break;
                                    }
lbl15:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= var4_3 ^ 686076100;
                                        ** GOTO lbl55
                                        break;
                                    }
                                    case 1271667296: {
                                        var3_5 ^= var4_3 ^ -1697656069;
                                        ** continue;
                                    }
                                    case 1582220931: {
                                        this.a = null;
                                        continue block20;
                                    }
                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ -765728779;
                                        break block35;
                                        break;
                                    }
                                    case -42876936: {
                                        return;
                                    }
lbl29:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 1702826833;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl32:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 42965003;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl35:
                                    // 1 sources

                                    var3_5 = (var2_2 | var5_1) ^ 1959667979;
                                    break block36;
lbl37:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ -1271775853;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl40:
                                    // 1 sources

                                    while (true) {
                                        if (this.a.compareAndSet(true, false)) ** continue;
                                        break block37;
                                        break;
                                    }
lbl43:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 703595149;
                                        break block35;
                                        break;
                                    }
                                    case -557648798: {
                                        if (var1_4 == null) break block20;
                                        ** continue;
                                    }
lbl49:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 557634449;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl52:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ -1762481505;
                                        ** continue;
                                        break;
                                    }
lbl55:
                                    // 1 sources

                                    var4_3 = (var2_2 | var5_1) ^ 2018991769;
                                    break block35;
lbl57:
                                    // 1 sources

                                    while (true) {
                                        var1_4 = this.a;
                                        ** continue;
                                        break;
                                    }
                                    case 1762430316: {
                                        var1_4.interrupt();
                                        break block20;
                                    }
                                    case 660595823: {
                                        var3_5 ^= var4_3 ^ -651374300;
                                        ** continue;
                                    }
                                    case 1115374012: {
                                        var3_5 ^= var4_3 ^ 1431597040;
                                        ** continue;
                                    }
lbl69:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= var4_3 ^ 2119485468;
                                        ** continue;
                                        break;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        var4_3 = (var2_2 | var5_1) ^ -660487268;
                        ** while (true)
                        {
                            ** case -1702808414:
                        }
lbl75:
                        // 1 sources

                        ** while (true)
                    }
lbl77:
                    // 4 sources

                    block34: while (true) {
                        switch (var4_3) {
                            default: {
                                continue block34;
                            }
                            case -127797498: {
                                ** continue;
                            }
                            case -2018936470: {
                                ** continue;
                            }
                            case 485763744: {
                                break;
                            }
                            case -703715970: {
                                ** continue;
                            }
                            case 765837318: {
                                ** continue;
                            }
                        }
                        var4_3 = (var2_2 | var5_1) ^ 127914229;
                        continue;
                        break;
                    }
                }
                var4_3 = (var2_2 | var5_1) ^ 262589277;
                ** GOTO lbl77
                {
                    case -262607698: {
                        var3_5 ^= var4_3 ^ 875153245;
                        break block38;
                    }
                    ** case 1026928110:
                }
lbl100:
                // 1 sources

                return;
            }
            var4_3 = (var2_2 | var5_1) ^ -1026848227;
            ** GOTO lbl77
        }
        var4_3 = (var2_2 | var5_1) ^ -485880493;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void setActivity(fM var1_1) {
        block11: {
            var5_2 = 1855898554;
            var2_3 = bv.g & 1855898554 ^ -1718226372;
            var4_4 = 0;
            ** GOTO lbl15
lbl5:
            // 3 sources

            block7: while (true) {
                switch (var4_4) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block7;
                        }
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -470103503;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 350436782: {
                        break block7;
                    }
lbl15:
                    // 1 sources

                    var3_5 = (var2_3 | var5_2) ^ 1890737473;
                    var4_4 = (var2_3 | var5_2) ^ -344142320;
                    ** continue;
                    case -1019973898: {
                        var3_5 ^= var4_4 ^ -586401123;
                        ** continue;
                    }
                    case 1100844122: {
                        var3_5 ^= var4_4 ^ -967298060;
                        break block11;
                    }
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ 1017879880;
            ** GOTO lbl5
            {
                case 2179962: {
                    return;
                }
            }
lbl28:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -1107132444;
                ** GOTO lbl5
                break;
            }
        }
        var4_4 = (var2_3 | var5_2) ^ -4280124;
        ** while (true)
        {
            ** case 476395919:
        }
lbl35:
        // 1 sources

        this.a = var1_1;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isConnected() {
        int n2 = g & 0x675F848C ^ 0x8CD798DC;
        int n3 = 0;
        int n4 = (n2 | 0x675F848C) ^ 0xA793C87C;
        n3 = (n2 | 0x675F848C) ^ 0x94EA83EC;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 2067078960: {
                    n3 = (n2 | 0x675F848C) ^ 0xC2C1F3B2;
                    continue block5;
                }
                case -661397503: {
                    return this.a;
                }
                case 756969326: 
            }
            n4 ^= n3 ^ 0x991C1B5E;
            n3 = (n2 | 0x675F848C) ^ 0x374C7CDD;
        }
    }

    /*
     * Exception decompiling
     */
    private void oS() {
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

    private static int oT(int n2, int n3) {
        int n4 = 1090080986;
        int n5 = -1144488197;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xC90F400)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xFBF92CBB;
        n6 -= (n5 | n4) ^ 0xFBF96D2C;
        n6 -= (n5 | n4) ^ 0xFBF986AE;
        n6 -= (n5 | n4) ^ 0xFBF9E8DB;
        n6 ^= (n5 | n4) ^ 0xFBF984C1;
        return n6 -= (n5 | n4) ^ 0xFBF910B6;
    }

    /*
     * Unable to fully structure code
     */
    private boolean oU() {
        block117: {
            block114: {
                block107: {
                    block108: {
                        block110: {
                            block112: {
                                block116: {
                                    block115: {
                                        var11_1 = -1237433575;
                                        var8_2 = bv.g & -1237433575 ^ 899590230;
                                        var10_3 = 0;
                                        var9_4 = (var8_2 | var11_1) ^ -1236792858;
                                        var10_3 = (var8_2 | var11_1) ^ -1243507029;
                                        break block107;
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var10_3 = (var8_2 | var11_1) ^ 1190455855;
                                            break block107;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        while (true) {
                                            var9_4 ^= var10_3 ^ 415463001;
                                            var10_3 = (var8_2 | var11_1) ^ 1033349968;
                                            break block107;
                                            break;
                                        }
lbl14:
                                        // 1 sources

                                        while (true) {
                                            block109: {
                                                var1_5 = this.a;
                                                var10_3 = (var8_2 | var11_1) ^ 1439022911;
                                                break block108;
lbl18:
                                                // 1 sources

                                                while (true) {
                                                    var9_4 ^= var10_3 ^ -1289737075;
                                                    var10_3 = (var8_2 | var11_1) ^ 680845239;
                                                    break block108;
                                                    break;
                                                }
lbl22:
                                                // 1 sources

                                                while (true) {
                                                    if (var1_5 != null) break block109;
                                                    var10_3 = (var8_2 | var11_1) ^ 648976385;
                                                    break block108;
                                                    break;
                                                }
lbl26:
                                                // 1 sources

                                                while (true) {
                                                    var9_4 ^= var10_3 ^ -632604556;
                                                    var10_3 = (var8_2 | var11_1) ^ -1732595047;
                                                    break block108;
                                                    break;
                                                }
lbl30:
                                                // 1 sources

                                                while (true) {
                                                    v0 = "";
                                                    ** GOTO lbl42
                                                    break;
                                                }
                                            }
                                            var10_3 = (var8_2 | var11_1) ^ 134702387;
                                            break block108;
lbl36:
                                            // 1 sources

                                            while (true) {
                                                var9_4 ^= var10_3 ^ -186464954;
                                                var10_3 = (var8_2 | var11_1) ^ 330768207;
                                                break block108;
                                                break;
                                            }
lbl40:
                                            // 1 sources

                                            while (true) {
                                                block111: {
                                                    v0 = var1_5.toJson().toString();
lbl42:
                                                    // 2 sources

                                                    block68: while (true) {
                                                        switch (var9_4) {
                                                            default: {
                                                                var9_4 ^= -495193422;
                                                                break block68;
                                                            }
                                                            case 778919545: {
                                                                var9_4 ^= -333767132;
                                                                continue block68;
                                                            }
                                                            case -226515369: {
                                                                var9_4 ^= 1847941165;
                                                                break block68;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    var2_6 = v0;
                                                    var9_4 ^= -48674555;
                                                    var3_7 = System.currentTimeMillis();
                                                    var10_3 = (var8_2 | var11_1) ^ 1246649219;
                                                    break block110;
lbl58:
                                                    // 1 sources

                                                    while (true) {
                                                        var9_4 ^= var10_3 ^ -1352424997;
                                                        var10_3 = (var8_2 | var11_1) ^ -1502324544;
                                                        break block110;
                                                        break;
                                                    }
lbl62:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var2_6.equals(this.e)) break block111;
                                                        var10_3 = (var8_2 | var11_1) ^ 1395937800;
                                                        break block110;
                                                        break;
                                                    }
lbl66:
                                                    // 1 sources

                                                    while (true) {
                                                        var9_4 ^= var10_3 ^ 1158604880;
                                                        var10_3 = (var8_2 | var11_1) ^ -831773250;
                                                        break block110;
                                                        break;
                                                    }
lbl70:
                                                    // 1 sources

                                                    while (true) {
                                                        v1 = true;
                                                        ** GOTO lbl82
                                                        break;
                                                    }
                                                }
                                                var10_3 = (var8_2 | var11_1) ^ -1187907943;
                                                break block110;
lbl76:
                                                // 1 sources

                                                while (true) {
                                                    var9_4 ^= var10_3 ^ -1358213951;
                                                    var10_3 = (var8_2 | var11_1) ^ 843250249;
                                                    break block110;
                                                    break;
                                                }
lbl80:
                                                // 1 sources

                                                while (true) {
                                                    block113: {
                                                        v1 = false;
lbl82:
                                                        // 2 sources

                                                        var9_4 ^= 2132961643;
                                                        var5_8 = v1;
                                                        var10_3 = (var8_2 | var11_1) ^ -871679395;
                                                        break block112;
lbl86:
                                                        // 1 sources

                                                        while (true) {
                                                            var9_4 ^= var10_3 ^ -418035430;
                                                            var10_3 = (var8_2 | var11_1) ^ -114133195;
                                                            break block112;
                                                            break;
                                                        }
lbl90:
                                                        // 1 sources

                                                        while (true) {
                                                            if (var3_7 - this.c < (8202750421821190972L << (var10_3 ^ 1317837898) >>> (var10_3 ^ 1317837898) ^ (long)var9_4 & 0xFFFFFFFFL | (8202750421821190972L >>> (var10_3 ^ 1317837898) ^ (long)var9_4 & 0xFFFFFFFFL) << (var10_3 ^ 1317837898))) break block113;
                                                            var10_3 = (var8_2 | var11_1) ^ 1978268373;
                                                            break block112;
                                                            break;
                                                        }
lbl95:
                                                        // 1 sources

                                                        while (true) {
                                                            var9_4 ^= var10_3 ^ -1193778848;
                                                            var10_3 = (var8_2 | var11_1) ^ -2141237217;
                                                            break block112;
                                                            break;
                                                        }
lbl99:
                                                        // 1 sources

                                                        while (true) {
                                                            v2 = true;
                                                            ** GOTO lbl111
                                                            break;
                                                        }
                                                    }
                                                    var10_3 = (var8_2 | var11_1) ^ 1626830516;
                                                    break block112;
lbl105:
                                                    // 1 sources

                                                    while (true) {
                                                        var9_4 ^= var10_3 ^ -1379472127;
                                                        var10_3 = (var8_2 | var11_1) ^ 1278054395;
                                                        break block112;
                                                        break;
                                                    }
lbl109:
                                                    // 1 sources

                                                    while (true) {
                                                        v2 = false;
lbl111:
                                                        // 2 sources

                                                        var9_4 ^= 999637298;
                                                        var6_9 = v2;
                                                        var10_3 = (var8_2 | var11_1) ^ 130536648;
                                                        break block114;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
lbl115:
                                        // 1 sources

                                        while (true) {
                                            var9_4 ^= var10_3 ^ -1617629021;
                                            var10_3 = (var8_2 | var11_1) ^ -294152525;
                                            break block114;
                                            break;
                                        }
lbl119:
                                        // 1 sources

                                        while (true) {
                                            if (var5_8) break block115;
                                            var10_3 = (var8_2 | var11_1) ^ 1650119111;
                                            break block114;
                                            break;
                                        }
lbl123:
                                        // 1 sources

                                        while (true) {
                                            var10_3 = (var8_2 | var11_1) ^ -978079785;
                                            break block114;
                                            break;
                                        }
lbl126:
                                        // 1 sources

                                        while (true) {
                                            if (var6_9) break block115;
                                            var10_3 = (var8_2 | var11_1) ^ 450394684;
                                            break block114;
                                            break;
                                        }
lbl130:
                                        // 1 sources

                                        while (true) {
                                            var9_4 ^= var10_3 ^ -1070532569;
                                            var10_3 = (var8_2 | var11_1) ^ -1547234807;
                                            break block114;
                                            break;
                                        }
lbl134:
                                        // 1 sources

                                        return true;
                                    }
                                    var10_3 = (var8_2 | var11_1) ^ -614816568;
                                    break block114;
lbl139:
                                    // 1 sources

                                    while (true) {
                                        var9_4 ^= var10_3 ^ 303382226;
                                        var10_3 = (var8_2 | var11_1) ^ 263823331;
                                        break block114;
                                        break;
                                    }
lbl143:
                                    // 1 sources

                                    while (true) {
                                        if (var3_7 - this.c >= (7048284760238491141L << (var10_3 ^ -1207470948) >>> (var10_3 ^ -1207470948) ^ (long)var9_4 & 0xFFFFFFFFL | (7048284760238491141L >>> (var10_3 ^ -1207470948) ^ (long)var9_4 & 0xFFFFFFFFL) << (var10_3 ^ -1207470948))) break block116;
                                        var10_3 = (var8_2 | var11_1) ^ 892988097;
                                        break block114;
                                        break;
                                    }
lbl148:
                                    // 1 sources

                                    while (true) {
                                        var9_4 ^= var10_3 ^ 2051658571;
                                        var10_3 = (var8_2 | var11_1) ^ -391555179;
                                        break block114;
                                        break;
                                    }
lbl152:
                                    // 1 sources

                                    return true;
                                }
                                try {
                                    var10_3 = (var8_2 | var11_1) ^ 587730762;
                                    break block114;
lbl158:
                                    // 1 sources

                                    while (true) {
                                        var9_4 ^= var10_3 ^ -1727752407;
                                        var10_3 = (var8_2 | var11_1) ^ -2122198902;
                                        break block114;
                                        break;
                                    }
lbl162:
                                    // 1 sources

                                    while (true) {
                                        var7_10 = this.a;
                                        var10_3 = (var8_2 | var11_1) ^ 150229763;
                                        break block117;
                                        break;
                                    }
lbl166:
                                    // 1 sources

                                    while (true) {
                                        var9_4 ^= var10_3 ^ -1984012218;
                                        var10_3 = (var8_2 | var11_1) ^ -1229646334;
                                        break block117;
                                        break;
                                    }
lbl170:
                                    // 1 sources

                                    while (true) {
                                        bv.pe(var7_10, (dt)LambdaMetafactory.metafactory(null, null, null, ()V, pk(z.r.eL z.r.fM ), ()V)((bv)this, (eL)var7_10, (fM)var1_5));
                                        var10_3 = (var8_2 | var11_1) ^ 1296632105;
                                        break block117;
                                        break;
                                    }
lbl174:
                                    // 1 sources

                                    while (true) {
                                        var9_4 ^= var10_3 ^ -209291216;
                                        var10_3 = (var8_2 | var11_1) ^ 827389748;
                                        break block117;
                                        break;
                                    }
lbl178:
                                    // 1 sources

                                    while (true) {
                                        this.e = var2_6;
                                        var10_3 = (var8_2 | var11_1) ^ -970038428;
                                        break block117;
                                        break;
                                    }
lbl182:
                                    // 1 sources

                                    while (true) {
                                        var9_4 ^= var10_3 ^ 1460597530;
                                        var10_3 = (var8_2 | var11_1) ^ 1141431448;
                                        break block117;
                                        break;
                                    }
lbl186:
                                    // 1 sources

                                    while (true) {
                                        this.c = var3_7;
                                        var10_3 = (var8_2 | var11_1) ^ 1481262751;
                                        break block117;
                                        break;
                                    }
lbl190:
                                    // 1 sources

                                    while (true) {
                                        var9_4 ^= var10_3 ^ -2002887012;
                                        var10_3 = (var8_2 | var11_1) ^ -1974524539;
                                        break block117;
                                        break;
                                    }
lbl194:
                                    // 1 sources

                                    while (true) {
                                        var9_4 ^= 833657517;
                                        return true;
                                    }
                                }
                                catch (IOException v3) {
                                    var9_4 = (var8_2 | var11_1) ^ -1313913890;
                                    var7_11 = v3;
                                    var9_4 ^= -59377664;
                                    return false;
                                }
                            }
                            block101: while (true) {
                                switch (var10_3) {
                                    default: {
                                        continue block101;
                                    }
                                    case 2075513090: {
                                        ** continue;
                                    }
                                    case 1317837930: {
                                        ** continue;
                                    }
                                    case -1034481270: {
                                        ** continue;
                                    }
                                    case 937540416: {
                                        ** continue;
                                    }
                                    case -683041301: {
                                        ** continue;
                                    }
                                    ** case -74226524:
lbl218:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                        }
                        block102: while (true) {
                            switch (var10_3) {
                                default: {
                                    continue block102;
                                }
                                case -34557732: {
                                    ** continue;
                                }
                                case 298496927: {
                                    ** continue;
                                }
                                case -460670633: {
                                    ** continue;
                                }
                                case 2043858657: {
                                    ** continue;
                                }
                                case 244260294: {
                                    ** continue;
                                }
                                ** case -2047078122:
lbl235:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                    }
                    block103: while (true) {
                        switch (var10_3) {
                            default: {
                                continue block103;
                            }
                            case -495233952: {
                                ** continue;
                            }
                            case -1624623896: {
                                ** continue;
                            }
                            case -1861192866: {
                                ** continue;
                            }
                            case 788814278: {
                                ** continue;
                            }
                            case -1078358420: {
                                ** continue;
                            }
                            ** case -1542851568:
lbl252:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
                }
                block104: while (true) {
                    switch (var10_3) {
                        default: {
                            continue block104;
                        }
                        case 39812596: {
                            ** continue;
                        }
                        case -246808208: {
                            ** continue;
                        }
                        ** case -1977008113:
lbl263:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            block105: while (true) {
                switch (var10_3) {
                    default: {
                        continue block105;
                    }
                    case -1334231145: {
                        ** continue;
                    }
                    case 1506377196: {
                        ** continue;
                    }
                    case -706463080: {
                        ** continue;
                    }
                    case 1913472136: {
                        ** continue;
                    }
                    case -1385787037: {
                        ** continue;
                    }
                    case 343538006: {
                        ** continue;
                    }
                    case 1826901911: {
                        ** continue;
                    }
                    case -1207470916: {
                        ** continue;
                    }
                    case -2105081442: {
                        ** continue;
                    }
                    case 1595391178: {
                        ** continue;
                    }
                    {
                        case -1799953387: {
                            ** continue;
                        }
                        ** case 910113749:
lbl292:
                        // 1 sources

                        ** continue;
                    }
                }
                break;
            }
        }
        block106: while (true) {
            switch (var10_3) {
                default: {
                    continue block106;
                }
                {
                    case -1085622180: {
                        ** continue;
                    }
                    case 17562973: {
                        ** continue;
                    }
                    case -84417930: {
                        ** continue;
                    }
                    case -2031215509: {
                        ** continue;
                    }
                    case 1905297467: {
                        ** continue;
                    }
                    case -206161977: {
                        ** continue;
                    }
                    case -269177408: {
                        ** continue;
                    }
                    ** case 1039257306:
lbl313:
                    // 1 sources

                    ** continue;
                }
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void oV() {
        block31: {
            block30: {
                block32: {
                    var6_1 = 608129519;
                    var3_2 = bv.g & 608129519 ^ -529211637;
                    var5_3 = 0;
                    var4_4 = (var3_2 | var6_1) ^ -1889844816;
                    var5_3 = (var3_2 | var6_1) ^ 1323003309;
                    break block30;
lbl7:
                    // 1 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ -2052616452;
                        break block30;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var4_4 ^= var5_3 ^ -40758429;
                        var5_3 = (var3_2 | var6_1) ^ 850297218;
                        break block30;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var1_5 = this.a;
                        var5_3 = (var3_2 | var6_1) ^ 1832581644;
                        break block31;
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var4_4 ^= var5_3 ^ 1296231321;
                        var5_3 = (var3_2 | var6_1) ^ 1996072758;
                        break block31;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        if (var1_5 != null) break block32;
                        var5_3 = (var3_2 | var6_1) ^ 12960914;
                        break block31;
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var4_4 ^= var5_3 ^ 1332164166;
                        var5_3 = (var3_2 | var6_1) ^ 344405979;
                        break block31;
                        break;
                    }
lbl30:
                    // 1 sources

                    return;
                }
                try {
                    var5_3 = (var3_2 | var6_1) ^ 1862881775;
                    break block31;
lbl36:
                    // 1 sources

                    while (true) {
                        var4_4 ^= var5_3 ^ -743657262;
                        var5_3 = (var3_2 | var6_1) ^ -1498769723;
                        break block31;
                        break;
                    }
lbl40:
                    // 1 sources

                    while (true) {
                        bv.pg(var1_5, 1, this.oW(null));
                        var4_4 ^= -159404326;
                        break;
                    }
                }
                catch (IOException v0) {
                    var4_4 = (var3_2 | var6_1) ^ 2041798066;
                    var2_6 = v0;
                }
                var5_3 = (var3_2 | var6_1) ^ 756955705;
                break block31;
lbl49:
                // 1 sources

                while (true) {
                    var4_4 ^= var5_3 ^ 1484077529;
                    var5_3 = (var3_2 | var6_1) ^ -1525738567;
                    break block31;
                    break;
                }
lbl53:
                // 1 sources

                return;
            }
            block28: while (true) {
                switch (var5_3) {
                    default: {
                        continue block28;
                    }
                    case -1432047038: {
                        ** continue;
                    }
                    case 1641566483: {
                        ** continue;
                    }
                    ** case -690921875:
lbl65:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        block29: while (true) {
            switch (var5_3) {
                default: {
                    continue block29;
                }
                case -1991957021: {
                    ** continue;
                }
                case -1836680999: {
                    ** continue;
                }
                case -457565315: {
                    ** continue;
                }
                case -252123084: {
                    ** continue;
                }
                {
                    case -1955164672: {
                        ** continue;
                    }
                    case 1121274154: {
                        ** continue;
                    }
                }
                case -916331050: {
                    ** continue;
                }
                ** case 1097911382:
lbl86:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private String oW(fM var1_1) {
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
    private void oX() {
        var5_1 = -1963592124;
        var2_2 = bv.g & -1963592124 ^ -1766071545;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ -2146473263;
        var4_3 = (var2_2 | var5_1) ^ 167344566;
        if (true) ** GOTO lbl18
lbl7:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ -1690886482;
            if (true) ** GOTO lbl27
            break;
        }
        while (true) {
            switch (var4_3) {
                case -535639820: {
                    var1_4 = this.a;
                    var4_3 = (var2_2 | var5_1) ^ -194118842;
                    ** GOTO lbl56
                }
                case -1761177871: {
                    var4_3 = (var2_2 | var5_1) ^ 850419589;
                }
lbl18:
                // 3 sources

                default: {
                    break;
                }
                case -1404065598: {
                    var3_5 ^= var4_3 ^ 2096300053;
                    var4_3 = (var2_2 | var5_1) ^ 2129477555;
                    break;
                }
            }
        }
        block19: while (true) {
            var4_3 = (var2_2 | var5_1) ^ -2042935937;
lbl27:
            // 2 sources

            block20: while (true) {
                switch (var4_3) {
                    case 1422396895: {
                        var3_5 ^= var4_3 ^ -440971272;
                        ** break;
                    }
                    case 415543864: {
                        var3_5 ^= var4_3 ^ 1102603315;
                        ** break;
                    }
lbl35:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -315473783;
                    ** GOTO lbl56
                    case 1787956225: {
                        var3_5 ^= var4_3 ^ -460851265;
                        ** continue;
                    }
                    case -1807231773: {
                        bv.ph(var1_4);
                        continue block19;
                    }
                    case 1942861774: {
                        if (var1_4 != null) ** break;
                        continue block19;
                        var4_3 = (var2_2 | var5_1) ^ -364850538;
                        ** GOTO lbl56
                    }
                    case 1958684113: {
                        var4_3 = (var2_2 | var5_1) ^ 179839908;
                        ** GOTO lbl56
                    }
lbl51:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1284533979;
                    continue block20;
                    case 97053161: {
                        this.a = null;
                        var4_3 = (var2_2 | var5_1) ^ -1340397484;
                    }
lbl56:
                    // 8 sources

                    default: {
                        continue block20;
                    }
                    case -1259136269: {
                        this.a = false;
                        var4_3 = (var2_2 | var5_1) ^ -902301032;
                        ** GOTO lbl56
                    }
                    case 786751251: {
                        var3_5 ^= var4_3 ^ -2145197241;
                        var4_3 = (var2_2 | var5_1) ^ 705490356;
                        ** GOTO lbl56
                    }
                    case 764438114: 
                }
                break;
            }
            break;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean oY(long var1_1) {
        var7_2 = 823363208;
        var4_3 = bv.g & 823363208 ^ 1609766924;
        var6_4 = 0;
        var5_5 = (var4_3 | var7_2) ^ -1484208357;
        var6_4 = (var4_3 | var7_2) ^ 1640995320;
        if (true) ** GOTO lbl9
        {
            block22: while (true) {
                var6_4 = (var4_3 | var7_2) ^ 553250030;
lbl9:
                // 2 sources

                block23: while (true) {
                    switch (var6_4) {
                        default: {
                            continue block23;
                        }
                        case 507250548: {
                            continue block22;
                        }
                        case 1594520162: {
                            var5_5 ^= var6_4 ^ 704661503;
                            var6_4 = (var4_3 | var7_2) ^ -170163274;
                            continue block23;
                        }
                        case -1977082566: {
                            Thread.sleep(var1_1);
                            var6_4 = (var4_3 | var7_2) ^ 563603699;
                            continue block23;
                        }
                        case 1583642239: {
                            var5_5 ^= var6_4 ^ 1395419580;
                            var6_4 = (var4_3 | var7_2) ^ -138902855;
                            continue block23;
                        }
                        case -2008343499: 
                    }
                    break;
                }
                break;
            }
            var5_5 ^= -1731350120;
            return this.a.get();
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private eL oZ() {
        block43: {
            var7_1 = -643313713;
            var4_2 = bv.g & -643313713 ^ -1545386968;
            var6_3 = 0;
            var5_7 = (var4_2 | var7_1) ^ -247343984;
            var6_3 = (var4_2 | var7_1) ^ -530314337;
            break block43;
            while (true) {
                var6_3 = (var4_2 | var7_1) ^ 94920987;
                ** GOTO lbl42
                break;
            }
            while (true) {
                var6_3 = (var4_2 | var7_1) ^ 611870858;
                ** GOTO lbl42
                break;
            }
        }
        while (true) {
            switch (var6_3) {
                default: {
                    break;
                }
                case 250080784: {
                    var1_4 = System.getProperty(bv.w, "").toLowerCase(Locale.ROOT).contains(bv.d);
                    var5_7 ^= -1981719545;
                    var2_5 = 0;
                    ** GOTO lbl-1000
                }
                case -1483956341: {
                    var5_7 ^= var6_3 ^ -1593650919;
                    var6_3 = (var4_2 | var7_1) ^ -184540673;
                    break;
                }
                case 461620336: {
                    var6_3 = (var4_2 | var7_1) ^ 1550536804;
                    break;
                }
            }
        }
lbl31:
        // 2 sources

        while (true) {
            var5_7 ^= -2065963630;
            var3_6 = v0;
            var6_3 = (var4_2 | var7_1) ^ -1005119588;
            ** if (true) goto lbl39
            break;
        }
lbl-1000:
        // 1 sources

        {
            block35: while (true) {
                var6_3 = (var4_2 | var7_1) ^ 311108449;
                break block42;
                break;
            }
        }
lbl39:
        // 1 sources

        ** GOTO lbl82
lbl-1000:
        // 2 sources

        {
            block42: {
                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ 793498251;
lbl42:
                    // 3 sources

                    block37: while (true) {
                        switch (var6_3) {
                            default: {
                                continue block37;
                            }
                            case -982920176: {
                                v0 = bv.pb(var2_5);
                                ** GOTO lbl31
                            }
                            case -726917788: {
                                var5_7 ^= var6_3 ^ -326549155;
                                var6_3 = (var4_2 | var7_1) ^ -967915005;
                                continue block37;
                            }
                            case -696196269: {
                                var5_7 ^= var6_3 ^ 1051926492;
                                var6_3 = (var4_2 | var7_1) ^ -1595546394;
                                continue block37;
                            }
                            case -489792439: {
                                var5_7 ^= var6_3 ^ -649079028;
                                var6_3 = (var4_2 | var7_1) ^ 1049500671;
                                continue block37;
                            }
                            case 1823833852: {
                                v0 = bv.pc(var2_5);
                                ** continue;
                            }
                            case 1034487276: {
                                if (var2_5 >= bv.oT((var5_7 | var6_3 ^ -468792797) ^ (var6_3 ^ 925847752), (var4_2 | var6_3 ^ -468792797) ^ ((var5_7 | var6_3 ^ -468792797) ^ (var6_3 ^ 1622493466)))) ** continue;
                                var6_3 = (var4_2 | var7_1) ^ 761736380;
                                continue block37;
                            }
                            case -28332300: {
                                var5_7 ^= var6_3 ^ 1626198557;
                                var6_3 = (var4_2 | var7_1) ^ -1507704645;
                                continue block37;
                            }
                            case 1526868745: {
                                if (!var1_4) ** continue;
                                var6_3 = (var4_2 | var7_1) ^ 422155174;
                                continue block37;
                            }
                            case -543185051: {
                                var5_7 ^= var6_3 ^ -467784672;
                                var6_3 = (var4_2 | var7_1) ^ -1756188397;
                                continue block37;
                            }
                            case 1573228372: 
                        }
                        break;
                    }
                    return null;
                }
            }
            block38: while (true) {
                switch (var6_3) {
                    default: {
                        continue block38;
                    }
                    case 1072748659: {
                        var5_7 ^= var6_3 ^ 1690652463;
                        var6_3 = (var4_2 | var7_1) ^ -1215151289;
                        continue block38;
                    }
                    case -928433016: {
                        ++var2_5;
                        ** continue;
                    }
                    case 1983339980: {
                        bv.ph(var3_6);
                        continue block35;
                    }
                    case 1282772136: {
                        if (var3_6 == null) {
                            var6_3 = (var4_2 | var7_1) ^ 383886713;
                            continue block38;
                        }
                        ** GOTO lbl131
                    }
                    case 758834491: {
                        var5_7 ^= var6_3 ^ 288149631;
                        var6_3 = (var4_2 | var7_1) ^ -1932810747;
                        continue block38;
                    }
                    case 1321005817: {
                        if (this.pa(var3_6)) {
                            var6_3 = (var4_2 | var7_1) ^ -690148652;
                            continue block38;
                        }
                        ** GOTO lbl129
                    }
                    case -378737522: {
                        var5_7 ^= var6_3 ^ 1551517847;
                        var6_3 = (var4_2 | var7_1) ^ 860812135;
                        continue block38;
                    }
                    case 662117625: {
                        var5_7 ^= var6_3 ^ 1538508917;
                        var6_3 = (var4_2 | var7_1) ^ -1252311786;
                        continue block38;
                    }
                    case -318346602: {
                        var5_7 ^= var6_3 ^ 1818859442;
                        var6_3 = (var4_2 | var7_1) ^ -432412020;
                        continue block38;
                    }
                    case 501097827: {
                        continue block35;
                    }
                    case -1006396712: {
                        var5_7 ^= var6_3 ^ 967357296;
                        var6_3 = (var4_2 | var7_1) ^ -1915710941;
                        continue block38;
                    }
lbl129:
                    // 1 sources

                    var6_3 = (var4_2 | var7_1) ^ 1071928631;
                    continue block38;
lbl131:
                    // 1 sources

                    var6_3 = (var4_2 | var7_1) ^ -594488554;
                    continue block38;
                    case 1999399402: 
                }
                break;
            }
        }
        return var3_6;
    }

    /*
     * Exception decompiling
     */
    private boolean pa(eL var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [23[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static eL pb(int var0) {
        var5_1 = -1239825110;
        var2_2 = bv.g & -1239825110 ^ -131261399;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ -1111802365;
        var4_3 = (var2_2 | var5_1) ^ 1207617014;
        if (true) ** GOTO lbl9
        {
            block7: while (true) {
                var4_3 = (var2_2 | var5_1) ^ 271190740;
lbl9:
                // 2 sources

                block8: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block8;
                        }
                        case -1178134307: {
                            continue block7;
                        }
                        case -300427265: {
                            var3_4 ^= var4_3 ^ -1200461697;
                            var4_3 = (var2_2 | var5_1) ^ -254527601;
                            continue block8;
                        }
                        case 250210980: 
                    }
                    break;
                }
                break;
            }
            var3_4 ^= 39635898;
            return new aL(new RandomAccessFile("\\\\.\\pipe\\discord-ipc-" + var0, bv.n));
        }
    }

    /*
     * Unable to fully structure code
     */
    private static eL pc(int var0) {
        block53: {
            block52: {
                block57: {
                    block55: {
                        block54: {
                            var8_1 = 599650985;
                            var5_2 = bv.g & 599650985 ^ -160824237;
                            var7_3 = 0;
                            var6_4 = (var5_2 | var8_1) ^ -531548266;
                            var7_3 = (var5_2 | var8_1) ^ 1606136283;
                            break block52;
lbl7:
                            // 1 sources

                            while (true) {
                                var7_3 = (var5_2 | var8_1) ^ 778601517;
                                break block52;
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var6_4 ^= var7_3 ^ -1086971256;
                                var7_3 = (var5_2 | var8_1) ^ 917804698;
                                break block52;
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var1_5 = bv.pd().iterator();
lbl16:
                                // 3 sources

                                while (true) {
                                    var7_3 = (var5_2 | var8_1) ^ -1863531704;
                                    break block53;
                                    break;
                                }
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                var6_4 ^= var7_3 ^ 1047792726;
                                var7_3 = (var5_2 | var8_1) ^ -1493093235;
                                break block53;
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                if (!var1_5.hasNext()) break block54;
                                var7_3 = (var5_2 | var8_1) ^ 2078686084;
                                break block53;
                                break;
                            }
lbl27:
                            // 1 sources

                            while (true) {
                                var6_4 ^= var7_3 ^ -453536758;
                                var7_3 = (var5_2 | var8_1) ^ -138118577;
                                break block53;
                                break;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                block56: {
                                    var2_6 = var1_5.next();
                                    var6_4 ^= -1588381753;
                                    var3_7 = var2_6.resolve("discord-ipc-" + var0);
                                    var7_3 = (var5_2 | var8_1) ^ -615971425;
                                    break block55;
lbl37:
                                    // 1 sources

                                    while (true) {
                                        var6_4 ^= var7_3 ^ 1822687586;
                                        var7_3 = (var5_2 | var8_1) ^ -1232031964;
                                        break block55;
                                        break;
                                    }
lbl41:
                                    // 1 sources

                                    while (true) {
                                        if (Files.exists(var3_7, new LinkOption[0])) break block56;
                                        var7_3 = (var5_2 | var8_1) ^ 1289269630;
                                        break block55;
                                        break;
                                    }
lbl45:
                                    // 1 sources

                                    while (true) {
                                        var6_4 ^= var7_3 ^ 1810883284;
                                        var7_3 = (var5_2 | var8_1) ^ 966126012;
                                        break block55;
                                        break;
                                    }
                                }
                                try {
                                    var7_3 = (var5_2 | var8_1) ^ 1929713778;
                                    break block55;
lbl53:
                                    // 1 sources

                                    while (true) {
                                        var6_4 ^= var7_3 ^ 1960315780;
                                        var7_3 = (var5_2 | var8_1) ^ 92224423;
                                        break block55;
                                        break;
                                    }
lbl57:
                                    // 1 sources

                                    while (true) {
                                        var4_8 = SocketChannel.open(StandardProtocolFamily.UNIX);
                                        var7_3 = (var5_2 | var8_1) ^ 1877188385;
                                        break block57;
                                        break;
                                    }
lbl61:
                                    // 1 sources

                                    while (true) {
                                        var6_4 ^= var7_3 ^ 1090486497;
                                        var7_3 = (var5_2 | var8_1) ^ -688090308;
                                        break block57;
                                        break;
                                    }
lbl65:
                                    // 1 sources

                                    while (true) {
                                        UnixDomainSocketAddress.of(var3_7);
                                        var7_3 = (var5_2 | var8_1) ^ 196335733;
                                        break block57;
                                        break;
                                    }
lbl72:
                                    // 1 sources

                                    while (true) {
                                        var6_4 ^= var7_3 ^ 688402689;
                                        var7_3 = (var5_2 | var8_1) ^ 764800462;
                                        break block57;
                                        break;
                                    }
lbl76:
                                    // 1 sources

                                    while (true) {
                                        var6_4 ^= -1043225542;
                                        return new kH((SocketChannel)var4_8);
                                    }
                                }
                                catch (Exception v0) {
                                    var6_4 = (var5_2 | var8_1) ^ 2091763743;
                                    var4_8 = v0;
                                    var6_4 ^= -94523433;
                                    ** GOTO lbl16
                                }
                                break;
                            }
                        }
                        var7_3 = (var5_2 | var8_1) ^ -769168313;
                        break block53;
lbl87:
                        // 1 sources

                        while (true) {
                            var6_4 ^= var7_3 ^ 1230482895;
                            var7_3 = (var5_2 | var8_1) ^ -1726513824;
                            break block53;
                            break;
                        }
lbl91:
                        // 1 sources

                        return null;
                    }
                    block48: while (true) {
                        switch (var7_3) {
                            default: {
                                continue block48;
                            }
                            case 750187364: {
                                ** continue;
                            }
                            case 1097816543: {
                                ** continue;
                            }
                            case -1155053691: {
                                ** continue;
                            }
                            case -831905977: {
                                ** continue;
                            }
                            {
                                case -2063929719: {
                                    ** continue;
                                }
                                ** case -226439844:
lbl109:
                                // 1 sources

                                ** continue;
                            }
                        }
                        break;
                    }
                }
                block49: while (true) {
                    switch (var7_3) {
                        default: {
                            continue block49;
                        }
                        {
                            case -1742968358: {
                                ** continue;
                            }
                            case 553870791: {
                                ** continue;
                            }
                            case -62116210: {
                                ** continue;
                            }
                            ** case -630580427:
lbl122:
                            // 1 sources

                            ** continue;
                        }
                    }
                    break;
                }
            }
            block50: while (true) {
                switch (var7_3) {
                    default: {
                        continue block50;
                    }
                    case -1471920352: {
                        ** continue;
                    }
                    case -644386090: {
                        ** continue;
                    }
                    ** case -1052024735:
lbl133:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        block51: while (true) {
            switch (var7_3) {
                default: {
                    continue block51;
                }
                case 1729312179: {
                    ** continue;
                }
                case 1358873206: {
                    ** continue;
                }
                case -1944466049: {
                    ** continue;
                }
                case 3902644: {
                    ** continue;
                }
                case 634952380: {
                    ** continue;
                }
                ** case 1860733851:
lbl150:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static List<Path> pd() {
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
    private static void pe(eL var0, dt var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [23[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static String pf(eL var0) throws IOException {
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
    private static void pg(eL var0, int var1_1, String var2_2) throws IOException {
        block38: {
            block40: {
                block39: {
                    block37: {
                        var8_3 = -1951994919;
                        var5_4 = bv.g & -1951994919 ^ 70368219;
                        var7_5 = 0;
                        ** GOTO lbl66
lbl5:
                        // 1 sources

                        while (true) {
                            var7_5 = (var5_4 | var8_3) ^ 85525899;
                            ** GOTO lbl45
                            break;
                        }
lbl8:
                        // 1 sources

                        while (true) {
                            var7_5 = (var5_4 | var8_3) ^ 1720904007;
                            ** GOTO lbl45
                            break;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            var4_7.putInt(var1_1);
                            ** continue;
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            var6_8 ^= var7_5 ^ -631504220;
                            break block37;
                            break;
                        }
lbl18:
                        // 1 sources

                        while (true) {
                            var7_5 = (var5_4 | var8_3) ^ 915418982;
                            break block38;
                            break;
                        }
                    }
                    var7_5 = (var5_4 | var8_3) ^ 1139937706;
                    ** GOTO lbl45
lbl24:
                    // 1 sources

                    while (true) {
                        var7_5 = (var5_4 | var8_3) ^ -815405014;
                        ** GOTO lbl45
                        break;
                    }
lbl27:
                    // 1 sources

                    block23: while (true) {
                        continue;
lbl29:
                        // 1 sources

                        while (true) {
                            var6_8 ^= var7_5 ^ -1040746350;
                            break block39;
                            break;
                        }
lbl32:
                        // 1 sources

                        while (true) {
                            var6_8 ^= var7_5 ^ -1709735478;
                            ** continue;
                            break;
                        }
lbl35:
                        // 1 sources

                        return;
lbl37:
                        // 1 sources

                        while (true) {
                            var7_5 = (var5_4 | var8_3) ^ 1140610326;
                            ** GOTO lbl45
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var7_5 = (var5_4 | var8_3) ^ 777436039;
                            ** GOTO lbl45
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var7_5 = (var5_4 | var8_3) ^ -1773797515;
lbl45:
                            // 9 sources

                            block30: while (true) {
                                switch (var7_5) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block30;
                                        }
                                        break;
                                    }
                                    case 435291310: {
                                        ** continue;
                                    }
                                    case -1968243120: {
                                        ** continue;
                                    }
                                    case -867455283: {
                                        ** continue;
                                    }
                                    case 1087509489: {
                                        ** continue;
                                    }
                                    case -1579073444: {
                                        ** continue;
                                    }
                                    case -56793890: {
                                        var0.write(var4_7.array());
                                        break block23;
                                    }
lbl63:
                                    // 1 sources

                                    while (true) {
                                        var7_5 = (var5_4 | var8_3) ^ -1980613657;
                                        ** continue;
                                        break;
                                    }
lbl66:
                                    // 1 sources

                                    var6_8 = (var5_4 | var8_3) ^ 1317910151;
                                    ** continue;
lbl68:
                                    // 1 sources

                                    while (true) {
                                        var7_5 = (var5_4 | var8_3) ^ 667158703;
                                        break block38;
                                        break;
                                    }
                                    case -383446372: {
                                        var4_7.put(var3_6);
                                        ** continue;
                                    }
                                    case -2085883416: {
                                        var6_8 ^= var7_5 ^ 1290484181;
                                        ** continue;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    var7_5 = (var5_4 | var8_3) ^ 203164211;
                    ** GOTO lbl45
lbl80:
                    // 1 sources

                    while (true) {
                        var6_8 ^= var7_5 ^ -2086971666;
                        ** continue;
                        break;
                    }
                    {
                        case 105234492: {
                            var6_8 ^= var7_5 ^ -1905605733;
                            ** continue;
                        }
                    }
lbl86:
                    // 1 sources

                    while (true) {
                        var7_5 = (var5_4 | var8_3) ^ -1588508262;
                        break block38;
                        break;
                    }
                    var3_6 = var2_2.getBytes(StandardCharsets.UTF_8);
                    break block40;
                }
                var7_5 = (var5_4 | var8_3) ^ 1932173061;
                ** while (true)
                {
                    ** case -867833231:
                }
lbl95:
                // 1 sources

                var4_7.putInt(var3_6.length);
                ** while (true)
            }
            var4_7 = ByteBuffer.allocate(bv.oT(((var6_8 ^= 1740756992) | var8_3) ^ 2093969668, (var5_4 | var8_3) ^ ((var6_8 | var8_3) ^ 61719717)) + var3_6.length).order(ByteOrder.LITTLE_ENDIAN);
            ** while (true)
        }
        block36: while (true) {
            switch (var7_5) {
                default: {
                    continue block36;
                }
                case -1188571971: {
                    ** continue;
                }
                case -1468796044: {
                    ** continue;
                }
                ** case 786870849:
lbl111:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static void ph(Closeable var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block29: {
            block28: {
                var10 = 1720456300;
                var9_1 = -2125948269;
                var8_2 = -406548769;
                bv.g = mK.a(MethodHandles.lookup().lookupClass(), -934827268);
                var7_3 = 0;
                var6_10 = 195574185;
                var7_3 = var9_1 ^ 258273818;
                break block29;
lbl9:
                // 1 sources

                while (true) {
                    var6_10 ^= -1549258414;
                    break block28;
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var4_8 = 0;
            block21: while (true) {
                var5_9 = (var0_4[var3_7] & (((var6_10 ^= 271628706) | var9_1) ^ -481427900)) << ((var6_10 | var9_1) ^ -481427805) | (var0_4[var3_7 + 1] & ((var6_10 | var9_1) ^ -481427900)) << ((var6_10 | var9_1) ^ -481427797) | (var0_4[var3_7 + 2] & ((var6_10 | var9_1) ^ -481427900)) << ((var6_10 | var9_1) ^ -481427789) | var0_4[var3_7 + 3] & ((var6_10 | var9_1) ^ -481427900);
                var7_3 = var9_1 ^ -610040432;
                if (true) ** GOTO lbl22
                block22: while (true) {
                    var7_3 = var9_1 ^ var10;
lbl22:
                    // 2 sources

                    block23: while (true) {
                        switch (var7_3) {
                            case -1029320881: {
                                bv.a[var4_8] = var5_9 ^= var2_6;
                                var7_3 = var9_1 ^ 1483604556;
                                continue block23;
                            }
                            case -651781921: {
                                var6_10 ^= var7_3 ^ 243622678;
                                ** break;
lbl31:
                                // 1 sources

                                var7_3 = var9_1 ^ -1377259310;
                                continue block23;
                            }
                            case 1525358339: {
                                var6_10 ^= var7_3 ^ -1653056152;
                                var7_3 = var9_1 ^ 1139627484;
                            }
                            default: {
                                continue block23;
                            }
                            case -2066351011: {
                                var6_10 ^= var7_3 ^ 1436144351;
                                continue block22;
                            }
                            case 748694081: {
                                var3_7 += 4;
                                if (++var4_8 < var1_5) continue block21;
                                var7_3 = var9_1 ^ 94201550;
                                continue block23;
                            }
                            case -406548737: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            bv.h = 2481889162294264891L << (var7_3 ^ var8_2) >>> (var7_3 ^ var8_2) ^ (long)var6_10 & 0xFFFFFFFFL | (2481889162294264891L >>> (var7_3 ^ var8_2) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ var8_2);
            bv.f = bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886566), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -911218859)));
            bv.e = bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886567), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -5759357)));
            bv.d = bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886568), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 298556161)));
            bv.g = 2481889162294294235L << (var7_3 ^ var8_2) >>> (var7_3 ^ var8_2) ^ (long)var6_10 & 0xFFFFFFFFL | (2481889162294294235L >>> (var7_3 ^ var8_2) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ var8_2);
            bv.f = 2481889162294292735L << (var7_3 ^ var8_2) >>> (var7_3 ^ var8_2) ^ (long)var6_10 & 0xFFFFFFFFL | (2481889162294292735L >>> (var7_3 ^ var8_2) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ var8_2);
            bv.e = 2481889162294296235L << (var7_3 ^ var8_2) >>> (var7_3 ^ var8_2) ^ (long)var6_10 & 0xFFFFFFFFL | (2481889162294296235L >>> (var7_3 ^ var8_2) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ var8_2);
            bv.c = bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886569), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -196373064)));
            bv.b = bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886570), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -205264070)));
            bv.b = 2481889162294289027L << (var7_3 ^ var8_2) >>> (var7_3 ^ var8_2) ^ (long)var6_10 & 0xFFFFFFFFL | (2481889162294289027L >>> (var7_3 ^ var8_2) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ var8_2);
            bv.a = 2481889162294264891L << (var7_3 ^ var8_2) >>> (var7_3 ^ var8_2) ^ (long)var6_10 & 0xFFFFFFFFL | (2481889162294264891L >>> (var7_3 ^ var8_2) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ var8_2);
            bv.a = bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886571), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1327793823)));
            bv.s = gj.decode("pIwnoZXOaT7GoR70XqmU9VM=", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886572), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 463346454))));
            bv.u = gj.decode("qUjp", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886573), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1734003771))));
            bv.i = gj.decode("XPpcA+AarBk=", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886574), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -420514684))));
            bv.t = gj.decode("IJQO", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886575), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1958547250))));
            bv.v = gj.decode("ASfK31a3I2sotSfs", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886576), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 529802230))));
            bv.g = gj.decode("OAvfOg==", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886577), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -497005816))));
            bv.h = gj.decode("Lbzr7bc=", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886578), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -265851305))));
            bv.w = gj.decode("CpugWyCQ4A==", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886579), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -163445502))));
            bv.d = gj.decode("HwiN", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886580), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1584996785))));
            bv.f = gj.decode("YQ==", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886581), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -2003858857))));
            bv.j = gj.decode("nr+m6bgMFZgq", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886582), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1262508966))));
            bv.n = gj.decode("E9Q=", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886583), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1178211072))));
            bv.o = gj.decode("OVwJpyw1OFGjAj9O5452", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886584), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -388450757))));
            bv.x = gj.decode("2+DuCJgV", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886585), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 799593502))));
            bv.q = gj.decode("7B6u", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886586), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1309131585))));
            bv.b = gj.decode("LvR+XA==", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886587), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1946449600))));
            bv.r = gj.decode("y5djpw==", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886588), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1951661260))));
            bv.c = gj.decode("fWgFHWBVLlg9KeO4JZoRNIZjEfxt9A7xf5g=", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886589), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1187409425))));
            bv.l = gj.decode("zkEPA7A5wJsJmo9N5Lcl8U3j6XY+28qKVPvR3h8feac=", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886590), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 147014924))));
            bv.m = gj.decode("/sbjycoxzN/H6IPn2vKaqWy1+UXz5JA=", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886591), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -687378903))));
            bv.k = gj.decode("h1Y+Tt23QVGxq25H", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886592), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1254634364))));
            bv.a = gj.decode("Lb50ZBqLfHLd4WZIaMtGR5RJKw==", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886529), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -253601206))));
            bv.p = gj.decode("N5EP5E20DghAhKm/OidVQvbiAH64Cg==", bv.oT((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ -1277886530), var7_3 ^ var10 ^ ((var6_10 | var7_3 ^ var10) ^ (var7_3 ^ 1630562430))));
            return;
lbl89:
            // 1 sources

            while (true) {
                var7_3 = var9_1 ^ -909860633;
                break block29;
lbl92:
                // 1 sources

                while (true) {
                    var1_5 = var0_4.length / 4;
                    ** continue;
                    break;
                }
                break;
            }
            var7_3 = var9_1 ^ -1130860500;
            block26: while (true) {
                switch (var7_3) {
                    default: {
                        continue block26;
                    }
                    case -1181914006: {
                        bv.a = new int[var1_5];
                        var7_3 = var9_1 ^ 1129027155;
                        continue block26;
                    }
                    case 1037101759: {
                        var6_10 ^= var7_3 ^ 994974216;
                        break;
                    }
                    case -961754984: {
                        var3_7 = 0;
                        ** continue;
                    }
                    case -1039987520: {
                        var6_10 ^= var7_3 ^ 2005306695;
                        var7_3 = var9_1 ^ 1206145547;
                        continue block26;
                    }
                }
                var7_3 = var9_1 ^ 952497913;
            }
        }
        block27: while (true) {
            switch (var7_3) {
                default: {
                    continue block27;
                }
                case -1909692279: {
                    var7_3 = var9_1 ^ 475343299;
                    continue block27;
                }
                case 1217149556: {
                    var2_6 = (var6_10 | var7_3 ^ -909860633) ^ (var7_3 ^ 1695001793) ^ bv.g;
                    var6_10 ^= -2096683212;
                    var0_4 = "o\u00b22\u0087\u0004\u00f1\u00ec\u00c6\u00a4\u00b6\u0089\u0087\u007f\u00bf\u0012\u00a13\u001a\u00aa\u00c28\u00fcf\u00e9\u000e\u00fb\u009e\u00cb\u00e0\u0099\u001bJ\u0005\u0018\u0015\u00fc\u0002\u0090j\u008b\u00bew\u0006\u00da\u008cr\u0097\u0002\u00fd\u00ed\u000f\u00eal\u00e1\u00c5?^5\u0084\u00a0\t/N\u00e2{9N\u00a1\u00b0\u00c8\u009d\u00dcKu\u0086\u008dt\u00abP\u00d3\u001bG\u0011\u00a7W\u00e2\u0083\u0013\u00e2\u00c5-\u00bb\u0088\u00d22?\u00dd\u0086\u00ecD\u00e4{S\u00e0M\u0094\u00f3\u00c0\u0096\u0010\t\u0016\u00df\r(G3x\u00e7\u00d0\u00e2\u00d9R\u00d7\u0085\u00981\u0006F]'\u00b7\u00bbW\u00d7\u00a3".getBytes("ISO-8859-1");
                    var6_10 ^= -512125041;
                    ** continue;
                }
                case -1658997936: 
            }
            break;
        }
        var6_10 ^= var7_3 ^ 390407593;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void pi(AtomicBoolean var0, eL var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [22[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
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
    private static /* synthetic */ void pj(eL eL2, JsonObject jsonObject) throws IOException {
        int n2 = 508191960;
        int n3 = g & 0x1E4A64D8 ^ 0x7E2E0A23;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x71752B8;
        n4 = (n3 | n2) ^ 0x7E893C01;
        block9: while (true) {
            switch (n4) {
                default: {
                    continue block9;
                }
                case 73346993: {
                    n5 ^= n4 ^ 0xA6E2AB6A;
                    n4 = (n3 | n2) ^ 0xB94A02F3;
                    continue block9;
                }
                case 1769557038: {
                    bv.pg(eL2, 0, jsonObject.toString());
                    n4 = (n3 | n2) ^ 0x7A31414A;
                    continue block9;
                }
                case -28449455: {
                    n5 ^= n4 ^ 0x67D19E44;
                    n4 = (n3 | n2) ^ 0x171722D5;
                    continue block9;
                }
                case 15160058: {
                    n4 = (n3 | n2) ^ 0x80238BAA;
                    continue block9;
                }
                case -1576295126: {
                    n5 ^= n4 ^ 0xD0A8EF23;
                    n4 = (n3 | n2) ^ 0xC4A0AABC;
                    continue block9;
                }
                case -953914360: {
                    bv.pf(eL2);
                    n4 = (n3 | n2) ^ 0xDC65CBD1;
                    continue block9;
                }
                case -1160854457: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void pk(eL var1_1, fM var2_2) throws IOException {
        block14: {
            block13: {
                var6_3 = -1023782680;
                var3_4 = bv.g & -1023782680 ^ 412859129;
                var5_5 = 0;
                if (true) ** GOTO lbl20
                block9: while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 1305008550;
lbl7:
                    // 6 sources

                    block10: while (true) {
                        switch (var5_5) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block10;
                                }
                                break;
                            }
                            case 1393958100: {
                                continue block9;
                            }
                            case 1237523627: {
                                var4_6 ^= var5_5 ^ 1829305563;
                                break block9;
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                var5_5 = (var3_4 | var6_3) ^ 102505202;
                                ** continue;
                                break;
                            }
lbl20:
                            // 1 sources

                            var4_6 = (var3_4 | var6_3) ^ -246012678;
                            break;
                            case -588783605: {
                                var4_6 ^= var5_5 ^ 81374542;
                                break block13;
                            }
                        }
                        break;
                    }
                    break;
                }
                var5_5 = (var3_4 | var6_3) ^ 581081316;
                ** GOTO lbl7
                {
                    case -128359907: {
                        bv.pf(var1_1);
                        ** continue;
                    }
                }
                var5_5 = (var3_4 | var6_3) ^ -1980897747;
                ** GOTO lbl7
            }
            var5_5 = (var3_4 | var6_3) ^ 302844373;
            ** GOTO lbl7
            {
                case -1099846166: {
                    bv.pg(var1_1, 1, this.oW(var2_2));
                    break;
                }
                case -1758256289: {
                    var4_6 ^= var5_5 ^ -189536849;
                    break block14;
                }
            }
            var5_5 = (var3_4 | var6_3) ^ -1824987566;
            ** GOTO lbl7
        }
        var5_5 = (var3_4 | var6_3) ^ 1686787859;
        ** while (true)
        {
            ** case -923339988:
        }
lbl48:
        // 1 sources

    }
}

