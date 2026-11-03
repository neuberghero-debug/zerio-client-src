/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1923
 *  net.minecraft.class_2818
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_638
 */
package z.r;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1923;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_638;
import z.r.aE;
import z.r.dA;
import z.r.dI;
import z.r.gF;
import z.r.gP;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class fe
extends gF {
    private static final int a;
    private static final /* synthetic */ String a;
    private static final int b;
    private static final /* synthetic */ String b;
    private static final int[] a;
    private static final /* synthetic */ String c;
    private volatile long a;
    private static final int[] b;
    private static final int c;
    private static final int d;
    private volatile int e;
    public static final int s;
    private static final float a;
    private static final String d;
    private static final /* synthetic */ String e;
    private final ExecutorService a;
    private static final int f;
    private static final /* synthetic */ String f;
    private static final int g;
    private final gP a;
    private static final int h;
    private final AtomicBoolean a;
    private static final String g;
    private final AtomicBoolean b;
    private static final /* synthetic */ String k;
    private static final int[] c;
    private static final int i;
    private static final int j;
    private volatile long b;
    private static final int k;
    private volatile class_638 a;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final int l;
    private volatile dI[] a;
    private volatile String n;
    private static final /* synthetic */ String o;
    private static final int[] d;
    private static final /* synthetic */ String p;
    private static final int[] e;
    private static final String q;
    private final AtomicBoolean c;
    private static final /* synthetic */ String r;
    private static final String t;
    private static final int[] i;
    private static final int[] f;
    private static final /* synthetic */ String u;
    private static final String v;
    private static final String w;
    private static final int m;
    private static final String x;
    private static final dI[] b;
    private final Map<Long, dI> a;
    private static final int n;
    private final gP b;
    private static final /* synthetic */ String y;
    private final AtomicBoolean d;
    private final aE a;
    private final gP c;
    private static final int o;
    private static final int p;
    private static final int q;
    private static final /* synthetic */ String z;
    private volatile int r;
    private final AtomicBoolean e;
    private static final int[] g;
    private volatile class_1923 a;
    private static final /* synthetic */ String s;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public fe() {
        var5_1 = -1515045485;
        var4_2 = 1970860647;
        var1_3 = fe.s & 1970860647 ^ 1562947372;
        var3_4 = 0;
        var2_5 = (var1_3 | var4_2) ^ 149619492;
        var2_5 ^= 850298781;
        super(fe.l, fe.e, dA.q);
        var3_4 = (var1_3 | var4_2) ^ -924790157;
        ** GOTO lbl27
lbl10:
        // 1 sources

        while (true) {
            var3_4 = (var1_3 | var4_2) ^ 371081499;
            ** GOTO lbl27
lbl13:
            // 1 sources

            while (true) {
                var3_4 = (var1_3 | var4_2) ^ 1561662956;
                ** GOTO lbl27
                break;
            }
lbl16:
            // 1 sources

            while (true) {
                var3_4 = (var1_3 | var4_2) ^ 92346767;
                ** GOTO lbl27
lbl19:
                // 2 sources

                while (true) {
                    var3_4 = (var1_3 | var4_2) ^ -341118894;
                    if (true) ** GOTO lbl27
                    break;
                }
                break;
            }
            break;
        }
        block55: while (true) {
            var3_4 = (var1_3 | var4_2) ^ 1305013350;
            if (true) ** GOTO lbl27
            block56: while (true) {
                var3_4 = (var1_3 | var4_2) ^ 296466315;
lbl27:
                // 7 sources

                block57: while (true) {
                    switch (var3_4) {
                        case -1457434326: {
                            this.a = (int)new ConcurrentHashMap<K, V>();
                            var3_4 = (var1_3 | var4_2) ^ -1057588943;
                            continue block57;
                        }
                        case 2019049139: {
                            this.a = fe.b;
                            ** GOTO lbl213
                        }
                        case -1087397492: {
                            var2_5 ^= var3_4 ^ -1271215641;
                            var3_4 = (var1_3 | var4_2) ^ -574928300;
                            continue block57;
                        }
                        case -841298193: {
                            ** GOTO lbl19
                        }
                        case 39055369: {
                            this.b = -5306070104862290598L << (var3_4 ^ 39055401) >>> (var3_4 ^ 39055401) ^ (long)var2_5 & 0xFFFFFFFFL | (-5306070104862290598L >>> (var3_4 ^ 39055401) ^ (long)var2_5 & 0xFFFFFFFFL) << (var3_4 ^ 39055401);
                            var3_4 = (var1_3 | var4_2) ^ -296088057;
                            continue block57;
                        }
                        case -792014860: {
                            v0 = new String[fe.eB((var2_5 | var3_4 ^ var5_1) ^ (var3_4 ^ 940143027), (var1_3 | var3_4 ^ var5_1) ^ ((var2_5 | var3_4 ^ var5_1) ^ (var3_4 ^ 503178688)))];
                            v0[0] = fe.k;
                            v0[1] = fe.s;
                            v0[2] = fe.j;
                            v0[3] = fe.z;
                            v0[4] = fe.a;
                            v0[5] = fe.i;
                            v0[fe.eB((int)((var2_5 | var3_4 ^ var5_1) ^ (var3_4 ^ 940143026)), (int)((var1_3 | var3_4 ^ var5_1) ^ ((var2_5 | var3_4 ^ var5_1) ^ (var3_4 ^ -1236694545))))] = fe.h;
                            this.a = this.addSetting(new aE(fe.y, fe.k, v0));
                            var3_4 = (var1_3 | var4_2) ^ 1585635741;
                            continue block57;
                        }
                        case 2029643488: {
                            var2_5 ^= 231898377;
                            var2_5 ^= 252051058;
                            this.b = this.addSetting(new gP(fe.m, -50.0f, -63.0f, 16.0f, 1.0f, fe.f).description(fe.r));
                            ** break;
                        }
                        case 2110713803: {
                            this.a = new AtomicBoolean(false);
                            var3_4 = (var1_3 | var4_2) ^ -925414717;
                            continue block57;
                        }
                        case -1637018551: {
                            var2_5 ^= -1337248513;
                            ** GOTO lbl186
                        }
                        case 2043157468: {
                            var2_5 ^= var3_4 ^ 1210100982;
                            ** GOTO lbl201
                        }
                        case -245037266: {
                            var2_5 ^= var3_4 ^ -1228203221;
                            var3_4 = (var1_3 | var4_2) ^ -732320187;
                            continue block57;
                        }
                        case -618180765: {
                            this.b = new AtomicBoolean(false);
                            var3_4 = (var1_3 | var4_2) ^ -1331547776;
                            continue block57;
                        }
                        case -1248318180: {
                            var2_5 ^= var3_4 ^ 151812716;
                            var3_4 = (var1_3 | var4_2) ^ -1380831077;
                            continue block57;
                        }
                        case 2062491777: {
                            this.a = 0L;
                            var3_4 = (var1_3 | var4_2) ^ 849883164;
                            continue block57;
                        }
                        case 1821979058: {
                            var2_5 ^= var3_4 ^ -1808875074;
                            ** GOTO lbl199
                        }
                        case 86714617: {
                            var2_5 ^= var3_4 ^ -814495816;
                            var3_4 = (var1_3 | var4_2) ^ -969899597;
                            continue block57;
                        }
                        case 1801895540: {
                            this.n = "";
                            var3_4 = (var1_3 | var4_2) ^ -1512871841;
                            continue block57;
                        }
                        case 1339084659: {
                            var2_5 ^= var3_4 ^ 1952770667;
                            var3_4 = (var1_3 | var4_2) ^ 2133528422;
                            continue block57;
                        }
                        case -1246775892: {
                            var2_5 ^= var3_4 ^ -613682522;
                            var3_4 = (var1_3 | var4_2) ^ -1090876858;
                            continue block57;
                        }
                        case -1014860503: {
                            this.e = new AtomicBoolean(false);
                            var3_4 = (var1_3 | var4_2) ^ 10733003;
                            continue block57;
                        }
                        case 1422356461: {
                            var2_5 ^= var3_4 ^ -772624519;
                            var3_4 = (var1_3 | var4_2) ^ -985773955;
                            continue block57;
                        }
                        case -1152876836: {
                            this.a = Executors.newSingleThreadExecutor((ThreadFactory)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Runnable;)Ljava/lang/Thread;, eW(java.lang.Runnable ), (Ljava/lang/Runnable;)Ljava/lang/Thread;)());
                            var3_4 = (var1_3 | var4_2) ^ 300011229;
                            continue block57;
                        }
                        case -1203325166: {
                            this.d = new AtomicBoolean(false);
                            var3_4 = (var1_3 | var4_2) ^ 1538127119;
                            continue block57;
                        }
                        case 1825786084: {
                            this.e = fe.eB((var2_5 | var3_4 ^ 430684803) ^ (var3_4 ^ 236256168), (var1_3 | var3_4 ^ 430684803) ^ ((var2_5 | var3_4 ^ 430684803) ^ (var3_4 ^ -1936508634)));
                            var3_4 = (var1_3 | var4_2) ^ 2018760598;
                            continue block57;
                        }
                        case 1309040651: {
                            var2_5 ^= var3_4 ^ 159948980;
                            ** GOTO lbl201
                        }
                        case 816845577: {
                            this.a = null;
                            var3_4 = (var1_3 | var4_2) ^ 1393960794;
                            continue block57;
                        }
                        case 544074371: {
                            this.c = new AtomicBoolean(true);
                            var3_4 = (var1_3 | var4_2) ^ 700420226;
                            continue block57;
                        }
                        case -892414999: {
                            var2_5 ^= 1575550812;
                            var2_5 ^= -271748159;
                            this.c = this.addSetting(new gP(fe.o, 160.0f, 0.0f, 255.0f, 1.0f, fe.f).description(fe.c));
                            var3_4 = (var1_3 | var4_2) ^ 1587282795;
                            continue block57;
                        }
                        case -883163131: {
                            return;
                        }
                        case -1743926603: {
                            var2_5 ^= var3_4 ^ -700187915;
                            ** continue;
                        }
                        case 603594482: {
                            var2_5 ^= var3_4 ^ -845073495;
                            var3_4 = (var1_3 | var4_2) ^ -1212797818;
                            continue block57;
                        }
                        case 1880085767: {
                            this.r = fe.eB((var2_5 | var3_4 ^ 91694944) ^ (var3_4 ^ 415983450), (var1_3 | var3_4 ^ 91694944) ^ ((var2_5 | var3_4 ^ 91694944) ^ (var3_4 ^ 1744918778)));
                            var3_4 = (var1_3 | var4_2) ^ -198913136;
                            continue block57;
                        }
                        case -1114732962: {
                            var2_5 ^= var3_4 ^ -3894226;
                            var3_4 = (var1_3 | var4_2) ^ 86032860;
                            continue block57;
                        }
                        case -576427443: {
                            var2_5 ^= var3_4 ^ 1422043238;
                            var3_4 = (var1_3 | var4_2) ^ -485102810;
                            continue block57;
                        }
                        case -659843280: {
                            var2_5 ^= var3_4 ^ -357743680;
                            var3_4 = (var1_3 | var4_2) ^ -1239089302;
                            continue block57;
                        }
                        case -1597786821: {
                            this.a = null;
                            var3_4 = (var1_3 | var4_2) ^ -1131595051;
                            continue block57;
                        }
                        case 2111519396: {
                            var2_5 ^= var3_4 ^ 598829210;
                            ** continue;
                        }
lbl178:
                        // 1 sources

                        var3_4 = (var1_3 | var4_2) ^ -1596156638;
                        ** GOTO lbl218
                        case -1990447873: {
                            var2_5 ^= var3_4 ^ -1017159764;
                            continue block56;
                        }
                        case 602209284: {
                            var2_5 ^= var3_4 ^ 1808211516;
                            ** continue;
                        }
lbl186:
                        // 1 sources

                        var2_5 ^= 1638463822;
                        this.a = this.addSetting(new gP(fe.b, 8.0f, 1.0f, 12.0f, 1.0f, fe.f).description(fe.u));
                        var3_4 = (var1_3 | var4_2) ^ -1944192959;
                        ** GOTO lbl218
                        case -1826426520: {
                            var2_5 ^= var3_4 ^ 1416228950;
                            ** continue;
                        }
                        case -1634726917: {
                            var3_4 = (var1_3 | var4_2) ^ 127393774;
                            ** GOTO lbl218
                        }
                        case -1040857670: {
                            var2_5 ^= var3_4 ^ 2084363633;
                            continue block55;
                        }
lbl199:
                        // 1 sources

                        var3_4 = (var1_3 | var4_2) ^ 11931812;
                        ** GOTO lbl218
lbl201:
                        // 2 sources

                        var3_4 = (var1_3 | var4_2) ^ -471272300;
                        ** GOTO lbl218
                        case -1764618435: {
                            switch (var2_5) {
                                case 1006739304: {
                                    var3_4 = (var1_3 | var4_2) ^ 78701747;
                                    continue block57;
                                }
                                case -1627671285: {
                                    var3_4 = (var1_3 | var4_2) ^ -445303334;
                                    continue block57;
                                }
                            }
                            var3_4 = (var1_3 | var4_2) ^ 863936356;
                            continue block57;
                        }
lbl213:
                        // 1 sources

                        var3_4 = (var1_3 | var4_2) ^ -1034461469;
                        ** GOTO lbl218
                        case 779016245: {
                            var2_5 ^= var3_4 ^ 1984333766;
                            var3_4 = (var1_3 | var4_2) ^ 225913448;
                        }
lbl218:
                        // 8 sources

                        default: {
                            continue block57;
                        }
                        case 651496032: 
                    }
                    var2_5 ^= var3_4 ^ -1995051479;
                    var3_4 = (var1_3 | var4_2) ^ -1503678452;
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
    @Override
    public void onEnable() {
        var4_1 = 1231897332;
        var1_2 = fe.s & 1231897332 ^ -1718090904;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 105093232;
        var3_3 = (var1_2 | var4_1) ^ -924090269;
        if (true) ** GOTO lbl15
        block15: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -878499726;
            ** GOTO lbl15
lbl10:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 233787221;
                if (true) ** GOTO lbl15
                break;
            }
            block17: while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1870827108;
lbl15:
                // 4 sources

                block18: while (true) {
                    switch (var3_3) {
                        default: {
                            continue block18;
                        }
                        case 2075492815: {
                            var2_4 ^= var3_3 ^ -1606933982;
                            var3_3 = (var1_2 | var4_1) ^ -1653711724;
                            continue block18;
                        }
                        case 173668242: {
                            var2_4 ^= var3_3 ^ -1039377453;
                            var3_3 = (var1_2 | var4_1) ^ -1551017763;
                            continue block18;
                        }
                        case -1233138280: {
                            this.eJ();
                            var3_3 = (var1_2 | var4_1) ^ 1395770463;
                            continue block18;
                        }
                        case -1966307421: {
                            var2_4 ^= var3_3 ^ 385405671;
                            var3_3 = (var1_2 | var4_1) ^ -1425942586;
                            continue block18;
                        }
                        case 138236888: {
                            var2_4 ^= var3_3 ^ 829379061;
                            var3_3 = (var1_2 | var4_1) ^ 489804263;
                            continue block18;
                        }
                        case 2054167329: {
                            this.d.set(true);
                            var3_3 = (var1_2 | var4_1) ^ -1572289997;
                            continue block18;
                        }
                        case 286704543: {
                            var3_3 = (var1_2 | var4_1) ^ -1319782868;
                            continue block18;
                        }
                        case 1929155642: {
                            this.c.set(true);
                            var3_3 = (var1_2 | var4_1) ^ -744180626;
                            continue block18;
                        }
                        case 1150492520: {
                            this.b.set(true);
                            ** continue;
                        }
                        case 1755903440: {
                            var2_4 ^= var3_3 ^ -1900691801;
                            continue block17;
                        }
                        case -737014615: {
                            var2_4 ^= var3_3 ^ -604331857;
                            continue block15;
                        }
                        case 308177806: {
                            this.eC();
                            var3_3 = (var1_2 | var4_1) ^ -775942108;
                            continue block18;
                        }
                        case -993226213: 
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    private static int eB(int n2, int n3) {
        int n4 = -736901477;
        int n5 = 1028184706;
        int n6 = i[n2 ^ ((n5 | n4) ^ 0xEA619E3B)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xFD5B6474;
        n6 ^= (n5 | n4) ^ 0xFD5B3D61;
        n6 -= (n5 | n4) ^ 0xFD5BF486;
        n6 ^= (n5 | n4) ^ 0xFD5B5682;
        n6 += (n5 | n4) ^ 0xFD5B01C8;
        n6 ^= (n5 | n4) ^ 0xFD5BB73A;
        n6 ^= (n5 | n4) ^ 0xFD5BC5F7;
        n6 ^= (n5 | n4) ^ 0xFD5B66F5;
        n6 -= (n5 | n4) ^ 0xFD5BA511;
        return n6 ^= (n5 | n4) ^ 0xFD5BC3FE;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block13: {
            block11: {
                block12: {
                    break block12;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 782243025;
                        break block11;
                        break;
                    }
                }
                var4_1 = 743778150;
                var1_2 = fe.s & 743778150 ^ -320819627;
                var3_3 = 0;
                var2_4 = (var1_2 | var4_1) ^ -1345822994;
                ** while (true)
            }
lbl11:
            // 4 sources

            block8: while (true) {
                switch (var3_3) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block8;
                        }
                        break;
                    }
                    case -509072055: {
                        var2_4 ^= var3_3 ^ -1981309288;
                        break;
                    }
lbl19:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 2140165612;
                        ** continue;
                        break;
                    }
                    case -1034568794: {
                        break block8;
                    }
                    case -1796057853: {
                        return;
                    }
                }
                break;
            }
            var3_3 = (var1_2 | var4_1) ^ 224231998;
            ** GOTO lbl11
            {
                case -1822033253: {
                    var2_4 ^= var3_3 ^ -815573651;
                    break block13;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 2084572674;
            ** GOTO lbl11
        }
        var3_3 = (var1_2 | var4_1) ^ 2013788788;
        ** while (true)
        {
            ** case -1867144843:
        }
lbl37:
        // 1 sources

        this.eJ();
        ** while (true)
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
    private void eC() {
        var4_1 = 382521568;
        var1_2 = fe.s & 382521568 ^ 1256591830;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1712553029;
        var3_3 = (var1_2 | var4_1) ^ 280343711;
        ** GOTO lbl15
lbl7:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -814864911;
            if (true) ** GOTO lbl15
            break;
        }
        block12: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -335344175;
            if (true) ** GOTO lbl15
            block13: while (true) {
                var3_3 = (var1_2 | var4_1) ^ -961838750;
lbl15:
                // 4 sources

                block14: while (true) {
                    switch (var3_3) {
                        default: {
                            continue block14;
                        }
                        case 1314612585: {
                            var3_3 = (var1_2 | var4_1) ^ -461206378;
                            continue block14;
                        }
                        case -1853819897: {
                            var2_4 ^= var3_3 ^ -685095740;
                            var3_3 = (var1_2 | var4_1) ^ 1614374726;
                            continue block14;
                        }
                        case -10287883: {
                            ** break;
                        }
                        case 1054324400: {
                            if (!this.a.compareAndSet(false, true)) continue block13;
                            var3_3 = (var1_2 | var4_1) ^ -1584540413;
                            continue block14;
                        }
                        case -512017923: {
                            this.a.submit((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, eD(), ()V)((fe)this));
                            continue block13;
                        }
                        case -1740287852: {
                            var2_4 ^= var3_3 ^ 1207461288;
                            ** GOTO lbl44
                        }
                        case -1293034457: {
                            this.e.set(true);
                            ** continue;
                        }
lbl42:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ -1080694773;
                        continue block14;
lbl44:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 377230094;
                        continue block14;
                        case -1167303328: {
                            var2_4 ^= var3_3 ^ -1855200082;
                            continue block12;
                        }
                        case 1217577720: 
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void eD() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [30[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private void eE() {
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
    private dI eF(class_638 var1_1, class_2818 var2_2, int var3_3) {
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
    private LongSet eG(class_1923 var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH], 39[UNCONDITIONALDOLOOP], 37[UNCONDITIONALDOLOOP]], but top level block is 20[SWITCH]
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
    private int eH() {
        block9: {
            break block9;
lbl1:
            // 1 sources

            while (true) {
                var3_2 = (var1_1 | 1795422476) ^ 1418378761;
                ** GOTO lbl11
                break;
            }
        }
        var1_1 = fe.s & 1795422476 ^ 1332383035;
        var3_2 = 0;
        var2_3 = (var1_1 | 1795422476) ^ 1848023586;
        if (true) ** GOTO lbl18
        block6: while (true) {
            var3_2 = (var1_1 | 1795422476) ^ -454232020;
lbl11:
            // 2 sources

            block7: while (true) {
                switch (var3_2) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block7;
                        }
                        break;
                    }
                    case -853419352: {
                        continue block6;
                    }
lbl18:
                    // 1 sources

                    var3_2 = (var1_1 | 1795422476) ^ -1572198505;
                    ** continue;
                    case -1954085613: {
                        var2_3 ^= var3_2 ^ 580225870;
                        ** continue;
                    }
                    case 1004618550: 
                }
                break;
            }
            break;
        }
        return class_3532.method_15340((int)((Float)this.a.getValue()).intValue(), (int)1, (int)fe.eB((var2_3 | var3_2 ^ 1357036090) ^ (var3_2 ^ -947586348), (var1_1 | var3_2 ^ 1357036090) ^ ((var2_3 | var3_2 ^ 1357036090) ^ (var3_2 ^ -1261517229))));
    }

    /*
     * Unable to fully structure code
     */
    private int eI() {
        var4_1 = -1578398285;
        var1_2 = fe.s & 977540809 ^ 802789585;
        var3_3 = 0;
        if (true) ** GOTO lbl15
        block5: while (true) {
            var3_3 = (var1_2 | 977540809) ^ -1536031325;
            block6: while (true) {
                switch (var3_3) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
                    case -1682392373: {
                        var2_4 ^= var3_3 ^ -1989512614;
                        continue block5;
                    }
lbl15:
                    // 1 sources

                    var2_4 = (var1_2 | 977540809) ^ -436685061;
                    var3_3 = (var1_2 | 977540809) ^ -577420097;
                    ** GOTO lbl-1000
lbl18:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | 977540809) ^ -1536875502;
                        ** continue;
                        break;
                    }
                    case -498541978: {
                        ** continue;
                    }
                    case -1682990214: 
                }
                break;
            }
            break;
        }
        return class_3532.method_15340((int)((Float)this.b.getValue()).intValue(), (int)fe.eB((var2_4 | var3_3 ^ var4_1) ^ (var3_3 ^ 1986145582), (var1_2 | var3_3 ^ var4_1) ^ ((var2_4 | var3_3 ^ var4_1) ^ (var3_3 ^ -1003893772))), (int)fe.eB((var2_4 | var3_3 ^ var4_1) ^ (var3_3 ^ 1986145585), (var1_2 | var3_3 ^ var4_1) ^ ((var2_4 | var3_3 ^ var4_1) ^ (var3_3 ^ 1160377242))));
    }

    /*
     * Exception decompiling
     */
    private void eJ() {
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
     * Enabled aggressive block sorting
     */
    private dI eK(int n2, int n3, int n4, int[] nArray, int n5) {
        int n6 = s & 0x22A4B550 ^ 0x2982BA2C;
        int n7 = 0;
        int n8 = (n6 | 0x22A4B550) ^ 0x8D78E37A;
        n7 = (n6 | 0x22A4B550) ^ 0x80AEF1D3;
        block5: while (true) {
            switch (n7) {
                case 2076958567: {
                    int n9 = this.eM(nArray, n5);
                    n8 ^= 0x6159008C;
                    short[] sArray = this.eN(nArray, n5, n2, n3, n4, n9);
                    n8 ^= 0xFBD89E35;
                    int[] nArray2 = this.eO(nArray, n5, n9);
                    n8 ^= 0xCB0E3D8;
                    return new dI(n2, n3, n4, nArray, n5, sArray, nArray2, n9);
                }
                case -1425518929: {
                    n7 = (n6 | 0x22A4B550) ^ 0xAFB832B4;
                }
                default: {
                    continue block5;
                }
                case -2078372408: 
            }
            n8 ^= n7 ^ 0x323D5AB3;
            n7 = (n6 | 0x22A4B550) ^ 0x506D601B;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private dI eL(dI dI2) {
        int n2 = s & 0x4D4F58B1 ^ 0xECE12E33;
        int n3 = 0;
        int n4 = (n2 | 0x4D4F58B1) ^ 0x1193A24B;
        n3 = (n2 | 0x4D4F58B1) ^ 0x18C8C541;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1656195242: {
                    int[] nArray = this.eO(dI2.a, dI2.c, dI2.e);
                    n4 ^= 0x8EADD370;
                    return new dI(dI2.a, dI2.d, dI2.b, dI2.a, dI2.c, dI2.a, nArray, dI2.e);
                }
                case 1619155155: {
                    n4 ^= n3 ^ 0xB678BB65;
                    n3 = (n2 | 0x4D4F58B1) ^ 0x70A709E5;
                    continue block5;
                }
                case -181945358: 
            }
            n3 = (n2 | 0x4D4F58B1) ^ 0x8D6D2660;
        }
    }

    /*
     * Unable to fully structure code
     */
    private int eM(int[] var1_1, int var2_2) {
        var9_3 = 0x1E31E133;
        var6_4 = fe.s & 0x1E31E133 ^ -1416298160;
        var8_5 = 0;
        if (true) ** GOTO lbl53
        block15: while (true) {
            switch (var8_5) lbl-1000:
            // 4 sources

            {
                default: {
                    continue block15;
                }
lbl9:
                // 1 sources

                while (true) {
                    var4_8 += 5;
                    ** GOTO lbl56
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var8_5 = (var6_4 | var9_3) ^ -1121317893;
                    ** GOTO lbl23
lbl15:
                    // 1 sources

                    while (true) {
                        var7_6 ^= var8_5 ^ 2082621298;
                        ** GOTO lbl64
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var8_5 = (var6_4 | var9_3) ^ 1801405937;
                        ** GOTO lbl23
                        break;
                    }
                    break;
                }
lbl21:
                // 1 sources

                block21: while (true) {
                    var8_5 = (var6_4 | var9_3) ^ 1262150274;
lbl23:
                    // 4 sources

                    block22: while (true) {
                        switch (var8_5) lbl-1000:
                        // 5 sources

                        {
                            while (true) {
                                default: {
                                    continue block22;
                                }
                                break;
                            }
                            case -849965048: {
                                ** continue;
                            }
                            case 226501235: {
                                ** continue;
                            }
                            while (true) {
                                var8_5 = (var6_4 | var9_3) ^ -1305099520;
                                ** GOTO lbl-1000
                                break;
                            }
lbl35:
                            // 1 sources

                            while (true) {
                                var8_5 = (var6_4 | var9_3) ^ -875760379;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 576978403: {
                                return var3_7;
                            }
                            case -1429462834: {
                                var3_7 = 0;
                                break block15;
                            }
lbl43:
                            // 1 sources

                            while (true) {
                                var4_8 = 0;
                                var5_9 = var2_2 * 5;
                                ** GOTO lbl56
                                break;
                            }
                            case -722819966: {
                                var7_6 ^= var8_5 ^ -823721567;
                                break block21;
                            }
                            case 1954092150: {
                                var3_7 += Integer.bitCount(var1_1[var4_8 + 3]);
                                ** continue;
                            }
lbl53:
                            // 1 sources

                            var7_6 = (var6_4 | var9_3) ^ 1391630956;
                            var8_5 = (var6_4 | var9_3) ^ 1949956060;
                            ** GOTO lbl-1000
lbl56:
                            // 2 sources

                            var8_5 = (var6_4 | var9_3) ^ -149443324;
                            ** GOTO lbl-1000
lbl58:
                            // 1 sources

                            while (true) {
                                var8_5 = (var6_4 | var9_3) ^ 310048248;
                                ** GOTO lbl-1000
                                break;
                            }
lbl61:
                            // 1 sources

                            while (true) {
                                var8_5 = (var6_4 | var9_3) ^ 360300989;
                                ** GOTO lbl-1000
                                break;
                            }
lbl64:
                            // 1 sources

                            var8_5 = (var6_4 | var9_3) ^ -1646912368;
                            ** continue;
                            case -191953935: {
                                if (var4_8 >= var5_9) ** continue;
                                ** continue;
                            }
                            case -1378937717: {
                                var7_6 ^= var8_5 ^ 242038577;
                                ** continue;
                            }
                            case 44034696: {
                                var7_6 ^= var8_5 ^ 1973190143;
                                ** continue;
                            }
                        }
                        break;
                    }
                    break;
                }
                var8_5 = (var6_4 | var9_3) ^ 1927508347;
                ** continue;
            }
            break;
        }
        var7_6 ^= 2064209798;
        ** while (true)
        {
            ** case -880011601:
        }
lbl80:
        // 1 sources

        ** while (true)
        {
            ** case 1218595959:
        }
lbl82:
        // 1 sources

        var7_6 ^= var8_5 ^ 632061475;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private short[] eN(int[] var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
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
    private int[] eO(int[] var1_1, int var2_2, int var3_3) {
        block29: {
            break block29;
lbl1:
            // 1 sources

            while (true) {
                var12_14 ^= -1094903439;
                var10_13 = Integer.bitCount(var9_12);
                var13_6 = (var11_5 | var14_4) ^ -341794601;
                if (true) ** GOTO lbl30
                block22: while (true) {
                    var13_6 = (var11_5 | var14_4) ^ -907117677;
                    if (true) ** GOTO lbl11
                    block23: while (true) {
                        var13_6 = (var11_5 | var14_4) ^ -1402103633;
lbl11:
                        // 2 sources

                        block24: while (true) {
                            switch (var13_6) {
                                case 1451598910: {
                                    var12_14 ^= var13_6 ^ -501246152;
                                    var13_6 = (var11_5 | var14_4) ^ 1078738216;
                                    continue block24;
                                }
                                case 1959493498: {
                                    var12_14 ^= var13_6 ^ -1986818248;
                                    continue block23;
                                }
                                case 1793984424: {
                                    var12_14 ^= var13_6 ^ 1585381189;
                                    var13_6 = (var11_5 | var14_4) ^ -2136680258;
                                    ** break;
                                }
                                case 856049410: {
                                    Arrays.fill(var4_7, var5_8, var5_8 + var10_13, var8_11);
                                    continue block22;
                                }
                                case -551034235: {
                                    var5_8 += var10_13;
                                    var13_6 = (var11_5 | var14_4) ^ -175777787;
                                }
lbl30:
                                // 4 sources

                                default: {
                                    continue block24;
                                }
                                case 533661459: 
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                var6_9 += 5;
                if (true) ** GOTO lbl64
                break;
            }
            block25: while (true) {
                switch (var13_6) {
                    case 653752339: {
                        var8_11 = this.eQ(var1_1[var6_9 + 4]);
                        var12_14 ^= 801555209;
                        ** break;
                    }
                    case -1828092380: {
                        var12_14 ^= var13_6 ^ -1725781446;
                        ** GOTO lbl56
                    }
lbl44:
                    // 1 sources

                    var9_12 = var1_1[var6_9 + 3];
                    ** continue;
                    case 354010089: {
                        var12_14 ^= var13_6 ^ -494758254;
                        var13_6 = (var11_5 | var14_4) ^ -1180915778;
                    }
lbl49:
                    // 6 sources

                    while (true) {
                        default: {
                            continue block25;
                        }
                        break;
                    }
                    case -504062565: {
                        var12_14 ^= var13_6 ^ -96065231;
                        var13_6 = (var11_5 | var14_4) ^ 2037875883;
                        ** GOTO lbl49
                    }
lbl56:
                    // 1 sources

                    var13_6 = (var11_5 | var14_4) ^ 628866782;
                    continue block25;
                    case -434349306: {
                        if (var6_9 < var7_10) ** GOTO lbl62
                        var13_6 = (var11_5 | var14_4) ^ 207772041;
                        ** GOTO lbl49
lbl62:
                        // 1 sources

                        var13_6 = (var11_5 | var14_4) ^ -1972233148;
                        ** GOTO lbl49
                    }
lbl64:
                    // 2 sources

                    while (true) {
                        var13_6 = (var11_5 | var14_4) ^ 2124366390;
                        ** continue;
                        break;
                    }
                    case -1173331597: 
                }
                break;
            }
            return var4_7;
        }
        var14_4 = -2058627424;
        var11_5 = fe.s & -2058627424 ^ -1704259795;
        var13_6 = 0;
        var12_14 = (var11_5 | var14_4) ^ -1236644023;
        var13_6 = (var11_5 | var14_4) ^ 1701427134;
        block28: while (true) {
            switch (var13_6) {
                default: {
                    continue block28;
                }
                case -100505581: {
                    var13_6 = (var11_5 | var14_4) ^ 1049684008;
                    continue block28;
                }
                case -1577371771: {
                    var12_14 ^= var13_6 ^ -555537441;
                    break;
                }
                case -501032711: {
                    var4_7 = new int[var3_3];
                    var12_14 ^= 270010887;
                    var5_8 = 0;
                    var12_14 ^= 1352929059;
                    var6_9 = 0;
                    var7_10 = var2_2 * 5;
                    ** continue;
                }
            }
            var13_6 = (var11_5 | var14_4) ^ 2101938004;
        }
    }

    /*
     * Exception decompiling
     */
    private void eP(short[] var1_1, int var2_2, short var3_3, short var4_4, short var5_5, short var6_6, short var7_7, short var8_8, short var9_9, short var10_10, short var11_11, short var12_12, short var13_13, short var14_14) {
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
    private int eQ(int n2) {
        int n3 = s & 0x36EE247A ^ 0x1EC1D68B;
        int n4 = 0;
        int n5 = (n3 | 0x36EE247A) ^ 0x98BE7389;
        n4 = (n3 | 0x36EE247A) ^ 0x6F1AF847;
        block5: while (true) {
            switch (n4) {
                case 179295803: {
                    n5 ^= n4 ^ 0x2B3D5798;
                    n4 = (n3 | 0x36EE247A) ^ 0xCA09E722;
                }
                default: {
                    continue block5;
                }
                case -186248743: {
                    float f2 = class_3532.method_15363((float)((float)n2 / 15.0f), (float)0.0f, (float)1.0f);
                    n5 ^= 0x90BD4C94;
                    return this.eS(this.eR((String)this.a.getValue()), f2);
                }
                case 1375014588: 
            }
            n4 = (n3 | 0x36EE247A) ^ 0x344020C0;
        }
    }

    /*
     * Exception decompiling
     */
    private int[] eR(String var1_1) {
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
    private int eS(int[] var1_1, float var2_2) {
        block10: {
            block12: {
                block11: {
                    break block12;
lbl1:
                    // 1 sources

                    while (true) {
                        var6_6 ^= 1471720575;
                        break block10;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | 577974691) ^ 1197800588;
                        break block11;
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | 577974691) ^ 1072275640;
                        break block11;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var6_6 ^= 548434802;
                        ** GOTO lbl20
                        break;
                    }
                }
lbl14:
                // 2 sources

                block9: while (true) {
                    switch (var7_4) {
                        default: {
                            continue block9;
                        }
                        case -1994516193: {
                            break block9;
                        }
lbl20:
                        // 1 sources

                        return this.eT(var1_1[var4_7], var1_1[var4_7 + 1], var3_5 - (float)var4_7);
                        case -1100416724: {
                            var6_6 ^= var7_4 ^ -1090883771;
                            ** continue;
                        }
                    }
                    break;
                }
                var7_4 = (var5_3 | 577974691) ^ 144654475;
                ** while (true)
                {
                    ** case -242006741:
                }
lbl27:
                // 1 sources

                var3_5 = class_3532.method_15363((float)var2_2, (float)0.0f, (float)1.0f) * (float)(var1_1.length - 1);
                ** while (true)
            }
            var5_3 = fe.s & 577974691 ^ -1801152507;
            var7_4 = 0;
            var6_6 = (var5_3 | 577974691) ^ -1458430167;
            ** while (true)
        }
        var4_7 = Math.min((int)var3_5, var1_1.length - 2);
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private int eT(int var1_1, int var2_2, float var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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
    public void render(WorldRenderContext var1_1, class_310 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [154[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
        var9 = -212459802;
        var8_1 = -1423069009;
        var7_2 = 2089604090;
        var6_3 = 591552065;
        var5_4 = -1565752768;
        var4_5 = 53923651;
        var3_6 = 1877334475;
        var2_7 = -2087130209;
        fe.s = mK.a(MethodHandles.lookup().lookupClass(), 1001477047);
        var1_8 = 0;
        var0_9 = 1402873559;
        var1_8 = var7_2 ^ -949215912;
        ** GOTO lbl99
lbl14:
        // 2 sources

        while (true) {
            var1_8 = var7_2 ^ -38130100;
            ** GOTO lbl99
            break;
        }
lbl17:
        // 1 sources

        while (true) {
            var0_9 ^= 1407843313;
            var0_9 ^= 1690516148;
            var0_9 ^= 1178500018;
            var0_9 ^= -397416679;
            var0_9 ^= 1926572880;
            var0_9 ^= -748808727;
            v0 = var0_9 ^= -1077104088;
            var0_9 ^= -705871378;
            fe.i[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ ((v0 | var7_2) ^ -916091490 ^ fe.s);
            v1 = v1 + 1;
            v4 = v3 + 4;
            v2 = v2;
            v3 = v4;
            var0_9 ^= 1391562897;
            if (v4 < v2.length) continue;
            fe.q = fe.eB(((var0_9 ^= 1334199729) | var7_2) ^ -356019354, var7_2 ^ ((var0_9 | var7_2) ^ 2099030561));
            fe.p = fe.eB((var0_9 | var7_2) ^ -356019355, var7_2 ^ ((var0_9 | var7_2) ^ 1485864015));
            fe.o = fe.eB((var0_9 | var7_2) ^ -356019356, var7_2 ^ ((var0_9 | var7_2) ^ 1619026088));
            fe.n = fe.eB((var0_9 | var7_2) ^ -356019357, var7_2 ^ ((var0_9 | var7_2) ^ -1459146661));
            fe.m = fe.eB((var0_9 | var7_2) ^ -356019358, var7_2 ^ ((var0_9 | var7_2) ^ -437882222));
            fe.l = fe.eB((var0_9 | var7_2) ^ -356019359, var7_2 ^ ((var0_9 | var7_2) ^ -1134188168));
            fe.k = fe.eB((var0_9 | var7_2) ^ -356019360, var7_2 ^ ((var0_9 | var7_2) ^ 622828833));
            fe.j = fe.eB((var0_9 | var7_2) ^ -356019425, var7_2 ^ ((var0_9 | var7_2) ^ 1095579778));
            fe.i = fe.eB((var0_9 | var7_2) ^ -356019426, var7_2 ^ ((var0_9 | var7_2) ^ 1990803716));
            fe.h = fe.eB((var0_9 | var7_2) ^ -356019427, var7_2 ^ ((var0_9 | var7_2) ^ 1293338943));
            fe.g = fe.eB((var0_9 | var7_2) ^ -356019428, var7_2 ^ ((var0_9 | var7_2) ^ 1783055492));
            fe.f = fe.eB((var0_9 | var7_2) ^ -356019429, var7_2 ^ ((var0_9 | var7_2) ^ -416286793));
            fe.a = 160.0f;
            fe.d = fe.eB((var0_9 | var7_2) ^ -356019430, var7_2 ^ ((var0_9 | var7_2) ^ 476868236));
            fe.c = fe.eB((var0_9 | var7_2) ^ -356019431, var7_2 ^ ((var0_9 | var7_2) ^ -149460464));
            fe.b = fe.eB((var0_9 | var7_2) ^ -356019432, var7_2 ^ ((var0_9 | var7_2) ^ 1352218244));
            fe.a = fe.eB((var0_9 | var7_2) ^ -356019433, var7_2 ^ ((var0_9 | var7_2) ^ 1327599668));
            fe.k = gj.decode("/PFTr+5tgw==", fe.eB((var0_9 | var7_2) ^ -356019434, var7_2 ^ ((var0_9 | var7_2) ^ -1887027535)));
            fe.s = gj.decode("4+WgxE/5", fe.eB((var0_9 | var7_2) ^ -356019435, var7_2 ^ ((var0_9 | var7_2) ^ 705682215)));
            fe.j = gj.decode("ZqeurGcWUA==", fe.eB((var0_9 | var7_2) ^ -356019436, var7_2 ^ ((var0_9 | var7_2) ^ 2084991977)));
            fe.z = gj.decode("OhXsz9yw", fe.eB((var0_9 | var7_2) ^ -356019437, var7_2 ^ ((var0_9 | var7_2) ^ 1119051938)));
            fe.a = gj.decode("s2Qde1rg", fe.eB((var0_9 | var7_2) ^ -356019438, var7_2 ^ ((var0_9 | var7_2) ^ -587870470)));
            fe.i = gj.decode("yhfb", fe.eB((var0_9 | var7_2) ^ -356019439, var7_2 ^ ((var0_9 | var7_2) ^ 1112234728)));
            fe.h = gj.decode("NIYino5b", fe.eB((var0_9 | var7_2) ^ -356019440, var7_2 ^ ((var0_9 | var7_2) ^ -1463541658)));
            fe.l = gj.decode("/kG4zG/zF1hXNqI=", fe.eB((var0_9 | var7_2) ^ -356019441, var7_2 ^ ((var0_9 | var7_2) ^ 285135363)));
            fe.e = gj.decode("VDzS1C8ZtcsD5BwY0fqiE49IOs0zjBZK0Zf4N5Mu8TQCFNIDr4rlwmE=", fe.eB((var0_9 | var7_2) ^ -356019442, var7_2 ^ ((var0_9 | var7_2) ^ 920628863)));
            fe.y = gj.decode("ivNVZSNzaWgefA==", fe.eB((var0_9 | var7_2) ^ -356019443, var7_2 ^ ((var0_9 | var7_2) ^ -477713919)));
            fe.o = gj.decode("pCMzHbQ=", fe.eB((var0_9 | var7_2) ^ -356019444, var7_2 ^ ((var0_9 | var7_2) ^ 1267498215)));
            fe.f = gj.decode("ETZeqw==", fe.eB((var0_9 | var7_2) ^ -356019445, var7_2 ^ ((var0_9 | var7_2) ^ 1775091298)));
            fe.c = gj.decode("g7dKS4av4ENOrTSmCAn7jvdqdMVCUQ==", fe.eB((var0_9 | var7_2) ^ -356019446, var7_2 ^ ((var0_9 | var7_2) ^ -421206813)));
            fe.m = gj.decode("F/NHGac=", fe.eB((var0_9 | var7_2) ^ -356019447, var7_2 ^ ((var0_9 | var7_2) ^ 1149675815)));
            fe.r = gj.decode("utzwaCqLYCp2WRfUzVFq/H1jThzlMGDAiM6g3MB8bhfI9tb+eQ2g", fe.eB((var0_9 | var7_2) ^ -356019448, var7_2 ^ ((var0_9 | var7_2) ^ -1399218224)));
            fe.b = gj.decode("lAja56/7623Fyl29", fe.eB((var0_9 | var7_2) ^ -356019449, var7_2 ^ ((var0_9 | var7_2) ^ -202105227)));
            fe.u = gj.decode("O0AZr82F5NFvj6JH/85AASHqUe8O8/AhkkBuXcwzUmbas2XzIfiMKQ==", fe.eB((var0_9 | var7_2) ^ -356019450, var7_2 ^ ((var0_9 | var7_2) ^ 1895771996)));
            fe.p = gj.decode("Imbd4lqqsgm27NMAlI2+/64=", fe.eB((var0_9 | var7_2) ^ -356019451, var7_2 ^ ((var0_9 | var7_2) ^ 1143705552)));
            fe.q = fe.k;
            fe.v = fe.s;
            fe.d = fe.j;
            fe.x = fe.z;
            fe.g = fe.a;
            fe.w = fe.i;
            fe.t = fe.h;
            var1_8 = var7_2 ^ 1645043821;
            if (true) ** GOTO lbl99
            break;
        }
        block32: while (true) {
            var1_8 = var7_2 ^ -296177755;
            if (true) ** GOTO lbl99
            block33: while (true) {
                var1_8 = var7_2 ^ -849316589;
lbl99:
                // 5 sources

                block34: while (true) {
                    switch (var1_8) {
                        default: {
                            continue block34;
                        }
                        case -1831568289: {
                            var0_9 ^= var1_8 ^ 735441535;
                            var1_8 = var7_2 ^ var5_4;
                            continue block34;
                        }
                        case -1881486052: {
                            fe.a = new int[]{fe.eB((var0_9 | var1_8 ^ var9) ^ (var1_8 ^ 1696366295), var1_8 ^ var9 ^ ((var0_9 | var1_8 ^ var9) ^ (var1_8 ^ -1665477666))), fe.eB((var0_9 | var1_8 ^ var9) ^ (var1_8 ^ 1696366294), var1_8 ^ var9 ^ ((var0_9 | var1_8 ^ var9) ^ (var1_8 ^ 439514662))), fe.eB((var0_9 | var1_8 ^ var9) ^ (var1_8 ^ 1696366293), var1_8 ^ var9 ^ ((var0_9 | var1_8 ^ var9) ^ (var1_8 ^ 2045406762))), fe.eB((var0_9 | var1_8 ^ var9) ^ (var1_8 ^ 1696366292), var1_8 ^ var9 ^ ((var0_9 | var1_8 ^ var9) ^ (var1_8 ^ 887691759))), fe.eB((var0_9 | var1_8 ^ var9) ^ (var1_8 ^ 1696366291), var1_8 ^ var9 ^ ((var0_9 | var1_8 ^ var9) ^ (var1_8 ^ 847730203)))};
                            var1_8 = var7_2 ^ 2027413843;
                            continue block34;
                        }
                        case 1607372219: {
                            v5 = new int[fe.eB((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915256), var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1370613341)))];
                            v5[0] = fe.eB((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915255), var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -2016937196)));
                            v5[1] = fe.eB((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915254), var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1016289342)));
                            v5[2] = fe.eB((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915253), var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ 134439758)));
                            v5[3] = fe.eB((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915252), var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ 609651151)));
                            v5[4] = fe.eB((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915251), var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1238107446)));
                            v5[5] = fe.eB((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915250), var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -2100038824)));
                            v5[fe.eB((int)((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915249)), (int)(var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ 229467912))))] = fe.eB((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915248), var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ 819499818)));
                            v5[fe.eB((int)((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915247)), (int)(var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1826098016))))] = fe.eB((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915246), var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ 1973526979)));
                            v5[fe.eB((int)((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915245)), (int)(var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1677971349))))] = fe.eB((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915244), var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -922185040)));
                            v5[fe.eB((int)((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915243)), (int)(var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -540372497))))] = fe.eB((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ -1217915242), var1_8 ^ var6_3 ^ ((var0_9 | var1_8 ^ var6_3) ^ (var1_8 ^ 496284995)));
                            fe.c = v5;
                            var1_8 = var7_2 ^ -1280717989;
                            continue block34;
                        }
                        case -759643979: {
                            var0_9 ^= var1_8 ^ 1569159439;
                            var1_8 = var7_2 ^ 438331812;
                            continue block34;
                        }
                        case 634388033: {
                            var0_9 ^= var1_8 ^ -758901715;
                            ** GOTO lbl14
                        }
                        case 1363652028: {
                            var0_9 ^= var1_8 ^ -2072672355;
                            continue block33;
                        }
                        case 73085609: {
                            var0_9 ^= var1_8 ^ 853927620;
                            var1_8 = var7_2 ^ var3_6;
                            continue block34;
                        }
                        case 1195340191: {
                            var0_9 ^= var1_8 ^ -1012480674;
                            var1_8 = var7_2 ^ var9;
                            continue block34;
                        }
                        case -15452059: {
                            v6 = new int[fe.eB((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483383), var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -395946708)))];
                            v6[0] = fe.eB((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483386), var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ 1976846503)));
                            v6[1] = fe.eB((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483385), var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ 442653057)));
                            v6[2] = fe.eB((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483388), var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1853285549)));
                            v6[3] = fe.eB((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483387), var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1942934406)));
                            v6[4] = fe.eB((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483390), var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ 600226513)));
                            v6[5] = fe.eB((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483389), var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -302461373)));
                            v6[fe.eB((int)((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483392)), (int)(var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -828695182))))] = fe.eB((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483391), var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ 879214414)));
                            v6[fe.eB((int)((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483266)), (int)(var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ 1088991646))))] = fe.eB((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483265), var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ 885188607)));
                            v6[fe.eB((int)((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483268)), (int)(var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ 693828687))))] = fe.eB((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483267), var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ 406908924)));
                            v6[fe.eB((int)((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483270)), (int)(var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ 1372695844))))] = fe.eB((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ -1762483269), var1_8 ^ var2_7 ^ ((var0_9 | var1_8 ^ var2_7) ^ (var1_8 ^ 191241274)));
                            fe.g = v6;
                            var1_8 = var7_2 ^ 17722361;
                            continue block34;
                        }
                        case -677289131: {
                            v7 = new int[fe.eB((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -1101603755), var1_8 ^ var8_1 ^ ((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -596700027)))];
                            v7[0] = fe.eB((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -1101603758), var1_8 ^ var8_1 ^ ((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ 1940615624)));
                            v7[1] = fe.eB((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -1101603757), var1_8 ^ var8_1 ^ ((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -7573826)));
                            v7[2] = fe.eB((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -1101603760), var1_8 ^ var8_1 ^ ((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -542512407)));
                            v7[3] = fe.eB((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -1101603759), var1_8 ^ var8_1 ^ ((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -2087498584)));
                            v7[4] = fe.eB((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -1101603730), var1_8 ^ var8_1 ^ ((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ 943654213)));
                            v7[5] = fe.eB((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -1101603729), var1_8 ^ var8_1 ^ ((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ 374165384)));
                            v7[fe.eB((int)((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -1101603732)), (int)(var1_8 ^ var8_1 ^ ((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ 1879048593))))] = fe.eB((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -1101603731), var1_8 ^ var8_1 ^ ((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ 1483883138)));
                            v7[fe.eB((int)((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -1101603734)), (int)(var1_8 ^ var8_1 ^ ((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ 73880911))))] = fe.eB((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -1101603733), var1_8 ^ var8_1 ^ ((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ 1232859451)));
                            v7[fe.eB((int)((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -1101603736)), (int)(var1_8 ^ var8_1 ^ ((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ 660795736))))] = fe.eB((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ -1101603735), var1_8 ^ var8_1 ^ ((var0_9 | var1_8 ^ var8_1) ^ (var1_8 ^ 1170468360)));
                            fe.f = v7;
                            var1_8 = var7_2 ^ -832420680;
                            continue block34;
                        }
                        case -1142894942: {
                            var1_8 = var7_2 ^ -1372318897;
                            continue block34;
                        }
                        case 2074058087: {
                            fe.b = new dI[0];
                            return;
                        }
                        case 2105718787: {
                            var0_9 ^= var1_8 ^ -415831144;
                            var1_8 = var7_2 ^ var4_5;
                            continue block34;
                        }
                        case -163711215: {
                            var0_9 ^= var1_8 ^ 74271925;
                            var1_8 = var7_2 ^ 118705821;
                            continue block34;
                        }
                        case -568307270: {
                            fe.e = new int[]{fe.eB((var0_9 | var1_8 ^ var5_4) ^ (var1_8 ^ -1258830229), var1_8 ^ var5_4 ^ ((var0_9 | var1_8 ^ var5_4) ^ (var1_8 ^ 1529623942))), fe.eB((var0_9 | var1_8 ^ var5_4) ^ (var1_8 ^ -1258830228), var1_8 ^ var5_4 ^ ((var0_9 | var1_8 ^ var5_4) ^ (var1_8 ^ -585149693))), fe.eB((var0_9 | var1_8 ^ var5_4) ^ (var1_8 ^ -1258830227), var1_8 ^ var5_4 ^ ((var0_9 | var1_8 ^ var5_4) ^ (var1_8 ^ -391329799))), fe.eB((var0_9 | var1_8 ^ var5_4) ^ (var1_8 ^ -1258830226), var1_8 ^ var5_4 ^ ((var0_9 | var1_8 ^ var5_4) ^ (var1_8 ^ -928078568))), fe.eB((var0_9 | var1_8 ^ var5_4) ^ (var1_8 ^ -1258830225), var1_8 ^ var5_4 ^ ((var0_9 | var1_8 ^ var5_4) ^ (var1_8 ^ 124596957)))};
                            var1_8 = var7_2 ^ 1001628261;
                            continue block34;
                        }
                        case -1309890839: {
                            var1_8 = var7_2 ^ var8_1;
                            continue block34;
                        }
                        case 511816599: {
                            ** continue;
                        }
                        case -1292986558: {
                            var0_9 ^= var1_8 ^ 62349618;
                            var1_8 = var7_2 ^ var6_3;
                            continue block34;
                        }
                        case -819652447: {
                            var0_9 ^= var1_8 ^ 518593115;
                            var1_8 = var7_2 ^ var2_7;
                            continue block34;
                        }
                        case 325650993: {
                            fe.b = new int[]{fe.eB((var0_9 | var1_8 ^ var3_6) ^ (var1_8 ^ -73548294), var1_8 ^ var3_6 ^ ((var0_9 | var1_8 ^ var3_6) ^ (var1_8 ^ 449621348))), fe.eB((var0_9 | var1_8 ^ var3_6) ^ (var1_8 ^ -73548295), var1_8 ^ var3_6 ^ ((var0_9 | var1_8 ^ var3_6) ^ (var1_8 ^ 1374901592))), fe.eB((var0_9 | var1_8 ^ var3_6) ^ (var1_8 ^ -73548296), var1_8 ^ var3_6 ^ ((var0_9 | var1_8 ^ var3_6) ^ (var1_8 ^ -1641742208))), fe.eB((var0_9 | var1_8 ^ var3_6) ^ (var1_8 ^ -73548297), var1_8 ^ var3_6 ^ ((var0_9 | var1_8 ^ var3_6) ^ (var1_8 ^ 166688191))), fe.eB((var0_9 | var1_8 ^ var3_6) ^ (var1_8 ^ -73548298), var1_8 ^ var3_6 ^ ((var0_9 | var1_8 ^ var3_6) ^ (var1_8 ^ -1093211203)))};
                            var1_8 = var7_2 ^ -1968102165;
                            continue block34;
                        }
                        case 1722595934: {
                            v1 = 0;
                            v3 = 0;
                            v2 = "\u008d\u00e8\f\u00f0&\\a#X\u00d6\u00a6\u00dc\u00aa\u009b[\u00f2\u00c2M`\u00ee05\u00a9\u00bfd\u000b\u00dcx\u0013\u00b2~\u00dd\u0000\u00dcL\u00a8\u00e7\u00c0\u0084#\u000b\rx\u00f0\u00c0\u00cc\u00a15\u008a\u009b\u00be\u00e1\u0097\u00a6\u00e9p\u00c9E\u00a6W\u00a7\r]\u00d0\u00d9\u00f2'\u00b1\u0097\u00eb\u00a5R\u0099\u00bc\u00da\u0099U\u00bd\u000e\u0087\u00c3\u0002\u00a2R\u0080q\u00dd?\u0001\u008c\u0004\u0093\u00c7V\u00a89e\u0019\u00e7Z\u0010A\u00f2\u00fc\"[\r\u00c7S?\u0006\u008alH\u00baD\u0006<\u0019\u00b4E\u008e\u00f2\u001e{o\u00e6\u00aaIu\u0012\u0011\u0001\"S\u00ad\u0010\u00b0*\u00fb \u009b\u00a7\u00b0\u0085\u00859\u0090i]Z\u009c\u00c6q\u00c7ky\u00fc\u008d\u0015\u0006\u001f\u00a6\u00d1j\u008a\u00d1\u00a0x\u00c59c\u0013\n\u00fao\u0012\u00cbM\u0087lv \u00e0=\u00ab8\u00beW\u0090zfc\u00b7\u00801{'\u00ce\u0014V<i\u00e1\u00c4\u008a>\r\r{s\u0096\u00f4\u00f1m7\u0018\u00e1\u00e7+\u00e7\u0001\u00aa\u00d0\u00bf\f)|>3\u008df\u001b\u00bf[7#\u00afG\u00d8\u00ea(\u0017\u0001\u00a6\u00c9U\u00c9\u00ffJ\u008e\u0010f0\u00baU\u0002b\u001f\u00885\u0086f#\u000e9\u00ee\u0003\u00d6\u0097!\u00cc\u00a4\u0000\u00d0\u00b9\u00a0\u00bc\u000b\u00f5\u00b48M\u001e\u00ecIS\u00b5\f\u000e\u00b7;\u00ef^\u00b1S\u0006f\u00fa<\u009d-|$\u00df\u0094hO\u00e9\u00bcU\u00a9& C\u00a4c\u00ccD\u009a\u000bfo\u008f\u00e3{\u00a10\u009d\u00f6\u0084\u001eF\u00cb\u0084\u0082\u00a1\u00eb\u00d7\u00ee3ks\u00dfz\u00c72\u00d9\u0081k\u0004\u00ee\u00f6\u00f8\u00a2\u00c9\u0084#I\u001f\u00eb6~\u00f5\u00cb\u00d1|\u00fcd\u000e$N\u00e8x:\u00f7\u00c8`/I\u0094\u008990/O\u00a8\u0080\u0001\u001f\u00fa\u00dfg\u00beh\u0016O7\u0085\u0004\u0013\u00d9=3^2\u00e9U0\u00dc\u0099\u0011R\u0081\u00c4\u00dc\u00b0\u00ce\u00bb\u0004\u0099Jb\u000b\u00dd\u00aa\u0002\u00b6\u0016\u00f1\u00c1\u0004:J\u0000\u00b0\u00a8\u000fR,\u009c\u0084\u00a6\u00cc\u0013-\u00c4l.\u00b4\u00fc\u0088\u008d\u00a7V'k\u00da,N\u0085|\u0092\u00d9\u00d7uN/\u00c1J3V\u0003\u00e4Z\u00e1\u00d7|BJJ\u008ae\f%?W\u0017\u00ae\u00ae\u00f5\u00bb\u00b3\u001b\u00e0\u009c\u001c\u00fa,0\u00d2\u00fd\u00f4\u00ac\u00f1\u0081\u000b\u00d9\u000bK<\u00d3\u007f\u00f2\u00a66\u000b\u00b5\u0081|\u0016@\u00eb\u00d2'\u00ef\u001atn\u00cb\u00ba\u00b24\u0081\u00bc\u00b9O>\u00bbD(H0\u0084\u00e1\u0006\u00e08\u00d8,\u00e6\u009d\u00d6\u0094Z\bF\tw\u00df\u00c0\u0086E\u00c1\u00f5dpQ\u00d5Ni|\u001a\u008d*yPD\u00bb\u0017\u00d6\u00d5L\u0003\u00b5\u0001\u0016\u00b6\u00f8q\u0094e\u00fe\u0099\u00d2\u0096H\u00ad\u0091\u00fb\u0003\u00bb\u00a5\u0086\u00cc+\u009e\u00c3[X\u0007\u00ef\u00ecW\u00b7\u0014".getBytes("ISO-8859-1");
                            fe.i = new int[((var0_9 ^= 697164077) | var7_2) ^ -38994080];
                            var0_9 ^= 1465105326;
                            ** continue;
                        }
                        case 1883685705: {
                            var0_9 ^= var1_8 ^ -1484882849;
                            continue block33;
                        }
                        case 2142903481: {
                            fe.d = new int[]{fe.eB((var0_9 | var1_8 ^ var4_5) ^ (var1_8 ^ -1804826779), var1_8 ^ var4_5 ^ ((var0_9 | var1_8 ^ var4_5) ^ (var1_8 ^ 1923595805))), fe.eB((var0_9 | var1_8 ^ var4_5) ^ (var1_8 ^ -1804826780), var1_8 ^ var4_5 ^ ((var0_9 | var1_8 ^ var4_5) ^ (var1_8 ^ 367523641))), fe.eB((var0_9 | var1_8 ^ var4_5) ^ (var1_8 ^ -1804826773), var1_8 ^ var4_5 ^ ((var0_9 | var1_8 ^ var4_5) ^ (var1_8 ^ -594388161))), fe.eB((var0_9 | var1_8 ^ var4_5) ^ (var1_8 ^ -1804826774), var1_8 ^ var4_5 ^ ((var0_9 | var1_8 ^ var4_5) ^ (var1_8 ^ -444174259))), fe.eB((var0_9 | var1_8 ^ var4_5) ^ (var1_8 ^ -1804826775), var1_8 ^ var4_5 ^ ((var0_9 | var1_8 ^ var4_5) ^ (var1_8 ^ -341234736)))};
                            continue block32;
                        }
                        case -2127102538: 
                    }
                    switch (var0_9) {
                        default: {
                            var1_8 = var7_2 ^ 214569139;
                            continue block34;
                        }
                        case 1448394307: {
                            var1_8 = var7_2 ^ 1497574843;
                            continue block34;
                        }
                        case -333165803: 
                    }
                    var1_8 = var7_2 ^ 768310854;
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private int eU(float f2) {
        int n2 = s & 0x563E6E37 ^ 0xD2E11652;
        int n3 = 0;
        int n4 = (n2 | 0x563E6E37) ^ 0x7F8F5E09;
        n3 = (n2 | 0x563E6E37) ^ 0xBC568130;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 621590009: {
                    n4 ^= n3 ^ 0x4B5A791C;
                    n3 = (n2 | 0x563E6E37) ^ 0x75E6B206;
                    continue block5;
                }
                case 1789525831: {
                    n3 = (n2 | 0x563E6E37) ^ 0xF3F3CB8E;
                    continue block5;
                }
                case -1558590351: 
            }
            break;
        }
        return class_3532.method_15340((int)Math.round(f2), (int)0, (int)fe.eB((n4 | n3 ^ 0xF527A246) ^ (n3 ^ 0x631D6256), (n2 | n3 ^ 0xF527A246) ^ ((n4 | n3 ^ 0xF527A246) ^ (n3 ^ 0xDF8A51F9))));
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ boolean eV(LongSet var0, Long var1_1) {
        block17: {
            block18: {
                break block18;
lbl1:
                // 2 sources

                while (true) {
                    var3_5 ^= -1470763715;
                    break block17;
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    v0 = true;
                    ** GOTO lbl1
                    break;
                }
lbl7:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ 2143361326;
                    ** GOTO lbl32
                    break;
                }
lbl10:
                // 1 sources

                block12: while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 2140736728;
                    if (true) ** GOTO lbl15
                    block13: while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 1020563429;
lbl15:
                        // 3 sources

                        block14: while (true) {
                            switch (var4_4) lbl-1000:
                            // 5 sources

                            {
                                while (true) {
                                    default: {
                                        continue block14;
                                    }
                                    break;
                                }
                                case 959049351: {
                                    ** continue;
                                }
                                case -207333834: {
                                    ** continue;
                                }
                                case -1065419794: {
                                    continue block13;
                                }
                                case -2093778733: {
                                    var3_5 ^= var4_4 ^ 1267663446;
                                    break block12;
                                }
                                case 1604956847: {
                                    if (var0.contains((Object)var1_1)) ** GOTO lbl37
                                    ** GOTO lbl39
                                }
lbl32:
                                // 1 sources

                                var4_4 = (var2_3 | var5_2) ^ -2138010123;
                                ** GOTO lbl-1000
lbl34:
                                // 1 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ -2033313359;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl37:
                                // 1 sources

                                var4_4 = (var2_3 | var5_2) ^ 1279500544;
                                ** GOTO lbl-1000
lbl39:
                                // 1 sources

                                var4_4 = (var2_3 | var5_2) ^ 846674030;
                                ** continue;
                                case -1919889576: {
                                    var3_5 ^= var4_4 ^ 32866368;
                                    ** continue;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                var4_4 = (var2_3 | var5_2) ^ -531741287;
                ** while (true)
            }
            var5_2 = 526595888;
            var2_3 = fe.s & 526595888 ^ -1381702618;
            var4_4 = 0;
            var3_5 = (var2_3 | var5_2) ^ -210358786;
            ** while (true)
            {
                ** case 1064794819:
            }
lbl53:
            // 1 sources

            v0 = false;
            ** while (true)
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ Thread eW(Runnable var0) {
        block20: {
            block19: {
                var5_1 = -976373810;
                var2_2 = fe.s & -976373810 ^ -1441398039;
                var4_3 = 0;
                ** GOTO lbl31
lbl5:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_3 ^ 2130817639;
                    break block19;
                    break;
                }
lbl8:
                // 2 sources

                block12: while (true) {
                    switch (var4_3) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block12;
                            }
                            break;
                        }
                        case 380582500: {
                            ** continue;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 1319017004;
                            break block20;
                            break;
                        }
lbl18:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -1187471318;
                            ** GOTO lbl-1000
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_3 ^ 1307837001;
                            ** GOTO lbl34
                            break;
                        }
                        case -782704688: {
                            var1_4.setDaemon(true);
                            break block12;
                        }
                        case 1457985477: {
                            return var1_4;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl31:
                        // 1 sources

                        var3_5 = (var2_2 | var5_1) ^ -1862219258;
                        var4_3 = (var2_2 | var5_1) ^ -594264747;
                        break block20;
lbl34:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 225116145;
                        break block20;
                        var1_4 = new Thread(var0, fe.p);
                        var4_3 = (var2_2 | var5_1) ^ -110064245;
                        ** continue;
                    }
                    break;
                }
                var4_3 = (var2_2 | var5_1) ^ 226441078;
                ** GOTO lbl8
            }
            var4_3 = (var2_2 | var5_1) ^ 1049061439;
            ** while (true)
            {
                ** case -492797799:
            }
lbl45:
            // 1 sources

            var3_5 ^= var4_3 ^ -1329233898;
            ** while (true)
        }
        block18: while (true) {
            switch (var4_3) {
                default: {
                    continue block18;
                }
                case -1589563965: {
                    ** continue;
                }
                case -491436002: {
                    ** continue;
                }
                ** case 860588730:
lbl57:
                // 1 sources

                ** continue;
            }
            break;
        }
    }
}

