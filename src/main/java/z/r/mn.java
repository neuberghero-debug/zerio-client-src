/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.em;
import z.r.gV;
import z.r.gj;
import z.r.lH;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class mn {
    private static final Gson a;
    private final Map<String, Long> a;
    private static final /* synthetic */ String a;
    private long a;
    private static final ExecutorService a;
    private boolean a;
    private static final /* synthetic */ String b;
    private final Map<String, Long> b;
    private static final /* synthetic */ String c;
    private static final mn a;
    private static final Path a;
    private long b;
    private long c;
    private static final int[] a;
    private static final long d;
    private String d;
    private long e;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    public static final int a;
    private static final /* synthetic */ String g;
    private long f;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private long g;
    private long h;

    /*
     * Exception decompiling
     */
    private mn() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [35[UNCONDITIONALDOLOOP]], but top level block is 36[UNCONDITIONALDOLOOP]
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
    public static mn get() {
        int n2 = a & 0x62ABB8A9 ^ 0xB9350E13;
        int n3 = 0;
        int n4 = (n2 | 0x62ABB8A9) ^ 0xC929968F;
        n3 = (n2 | 0x62ABB8A9) ^ 0x8421FF2B;
        block5: while (true) {
            switch (n3) {
                case -1680592697: {
                    n4 ^= n3 ^ 0xEB77FFEC;
                    n3 = (n2 | 0x62ABB8A9) ^ 0xD55D5411;
                }
                default: {
                    continue block5;
                }
                case 0x2EE2EAAA: {
                    return a;
                }
                case 2141077904: 
            }
            n3 = (n2 | 0x62ABB8A9) ^ 0x606B8E7C;
        }
    }

    private static int wE(int n2, int n3) {
        int n4 = -1918996397;
        int n5 = -1693678352;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xFF0D7B70)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x9F9E039E;
        n6 ^= (n5 | n4) ^ 0x9F9E20BD;
        n6 += (n5 | n4) ^ 0x9F9E23E8;
        n6 += (n5 | n4) ^ 0x9F9E77B8;
        n6 ^= (n5 | n4) ^ 0x9F9EAF49;
        n6 -= (n5 | n4) ^ 0x9F9EE36F;
        n6 ^= (n5 | n4) ^ 0x9F9E5F5F;
        n6 += (n5 | n4) ^ 0x9F9EB6BC;
        n6 -= (n5 | n4) ^ 0x9F9E88BB;
        return n6 ^= (n5 | n4) ^ 0x9F9EDF89;
    }

    /*
     * Exception decompiling
     */
    public synchronized void start(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
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
     * Unable to fully structure code
     */
    public synchronized void tick() {
        block37: {
            block35: {
                block38: {
                    block36: {
                        var6_1 = 1036054742;
                        var3_2 = mn.a & 1036054742 ^ 233652619;
                        var5_3 = 0;
                        if (true) ** GOTO lbl33
lbl5:
                        // 1 sources

                        while (true) {
                            var4_5 ^= var5_3 ^ -59509107;
                            var5_3 = (var3_2 | var6_1) ^ 1376797633;
                            break block35;
                            break;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            var5_3 = (var3_2 | var6_1) ^ 1656576632;
                            break block35;
                            break;
                        }
                        block21: while (true) {
                            var5_3 = (var3_2 | var6_1) ^ -2013441372;
                            if (true) ** GOTO lbl20
lbl15:
                            // 1 sources

                            while (true) {
                                var4_5 ^= var5_3 ^ -1614971215;
                                ** GOTO lbl89
                                break;
                            }
                            block23: while (true) {
                                var5_3 = (var3_2 | var6_1) ^ -908505511;
lbl20:
                                // 6 sources

                                block24: while (true) {
                                    switch (var5_3) lbl-1000:
                                    // 4 sources

                                    {
                                        default: {
                                            continue block24;
                                        }
                                        case -197869690: {
                                            ** continue;
                                        }
lbl26:
                                        // 1 sources

                                        while (true) {
                                            if (var1_4 - this.b < (1917722706499728580L << (var5_3 ^ 829514893) >>> (var5_3 ^ 829514893) ^ (long)var4_5 & 0xFFFFFFFFL | (1917722706499728580L >>> (var5_3 ^ 829514893) ^ (long)var4_5 & 0xFFFFFFFFL) << (var5_3 ^ 829514893))) break block36;
                                            ** continue;
lbl30:
                                            // 1 sources

                                            while (true) {
                                                var5_3 = (var3_2 | var6_1) ^ 1054068528;
                                                break block35;
                                                break;
                                            }
                                            break;
                                        }
lbl33:
                                        // 1 sources

                                        var4_5 = (var3_2 | var6_1) ^ 400489419;
                                        break block37;
                                        case -1937846207: {
                                            var1_4 = System.currentTimeMillis();
                                            break block21;
                                        }
                                        case -1173314693: {
                                            this.wF();
                                            break block38;
                                        }
lbl41:
                                        // 1 sources

                                        while (true) {
                                            var5_3 = (var3_2 | var6_1) ^ -272021295;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case -725257946: {
                                            continue block23;
                                        }
lbl46:
                                        // 1 sources

                                        while (true) {
                                            var5_3 = (var3_2 | var6_1) ^ 211588466;
                                            break block35;
                                            break;
                                        }
lbl49:
                                        // 1 sources

                                        while (true) {
                                            var5_3 = (var3_2 | var6_1) ^ -1212929390;
                                            ** GOTO lbl-1000
                                            break;
                                        }
                                        case -1973822643: {
                                            return;
                                        }
                                        case 1194736768: {
                                            var4_5 ^= var5_3 ^ -507952845;
                                            var5_3 = (var3_2 | var6_1) ^ -1315757666;
                                            ** GOTO lbl-1000
                                        }
                                        case 1368272601: {
                                            var4_5 ^= var5_3 ^ 802494725;
                                            continue block21;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        var5_3 = (var3_2 | var6_1) ^ 1964190307;
                        break block35;
                    }
lbl64:
                    // 2 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ 1454987753;
                        break block35;
                        break;
                    }
lbl67:
                    // 1 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ 1818484486;
                        ** GOTO lbl20
                        break;
                    }
                }
                var5_3 = (var3_2 | var6_1) ^ 2061225311;
                ** GOTO lbl20
lbl73:
                // 1 sources

                while (true) {
                    var4_5 ^= var5_3 ^ -888322988;
                    ** continue;
                    break;
                }
            }
            block34: while (true) {
                switch (var5_3) {
                    default: {
                        continue block34;
                    }
                    case 1800710198: {
                        ** continue;
                    }
                    case 1599122343: {
                        ** continue;
                    }
                    case 829514925: {
                        ** continue;
                    }
                    case 1224661948: {
                        ** continue;
                    }
lbl89:
                    // 1 sources

                    var5_3 = (var3_2 | var6_1) ^ 1295121679;
                    ** GOTO lbl20
                    case 0x33E3EEF: {
                        this.wI();
                        ** continue;
                    }
                    case 1878897182: 
                }
                break;
            }
            return;
        }
        var5_3 = (var3_2 | var6_1) ^ -383221511;
        ** while (true)
        {
            case -769345266: {
                var4_5 ^= var5_3 ^ -792175479;
                ** continue;
            }
            ** case 1893469392:
        }
lbl104:
        // 1 sources

        ** while (this.a)
lbl105:
        // 1 sources

        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block40: {
            block38: {
                block39: {
                    break block40;
lbl1:
                    // 1 sources

                    while (true) {
                        var7_2 = var9 ^ 1499702291;
                        break block38;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var4_7 = 0;
                        break block39;
                        break;
                    }
lbl7:
                    // 1 sources

                    block29: while (true) {
                        switch (var7_2) {
                            default: {
                                continue block29;
                            }
                            case 630227004: {
                                var6_9 ^= var7_2 ^ 1881903866;
                                var7_2 = var9 ^ 359343708;
                                continue block29;
                            }
                            case 2014574104: {
                                var3_6 = 0;
                                break;
                            }
                            case 1318489561: {
                                mn.a = new int[var1_4];
                                var7_2 = var9 ^ -2054736836;
                                continue block29;
                            }
                            case -562389063: {
                                var6_9 ^= var7_2 ^ 965020586;
                                var7_2 = var9 ^ 602824093;
                                continue block29;
                            }
                        }
                        var6_9 ^= -1389897081;
                        ** continue;
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var7_2 = var9 ^ 98973126;
                        break block38;
                        break;
                    }
                }
                while (true) {
                    var5_8 = (var0_3[var3_6] & (((var6_9 ^= -434127598) | var9) ^ -67113152)) << ((var6_9 | var9) ^ -67113049) | (var0_3[var3_6 + 1] & ((var6_9 | var9) ^ -67113152)) << ((var6_9 | var9) ^ -67113041) | (var0_3[var3_6 + 2] & ((var6_9 | var9) ^ -67113152)) << ((var6_9 | var9) ^ -67113033) | var0_3[var3_6 + 3] & ((var6_9 | var9) ^ -67113152);
                    var7_2 = var9 ^ 949891812;
                    break block38;
lbl36:
                    // 1 sources

                    while (true) {
                        var7_2 = var9 ^ var8_1;
                        break block38;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var7_2 = var9 ^ 2113619708;
                    break block38;
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    var0_3 = "\u0087\u00afS\u00e1\u008e{\u008a\u000b*\u00ab*\u00a9\u0087M\u001b\u0082\u00ffHO\u00c9\u001d\u00ea\u0001\u00d0\u00b3p\u0017]\u00c8\u00b9\u008c\u0006\u00c6\u0086\u00f4M\u0019\u00c5`\u0006".getBytes("ISO-8859-1");
                    var6_9 ^= -1092905401;
                    var1_4 = var0_3.length / 4;
                    var7_2 = var9 ^ 2121083833;
                    ** continue;
                    break;
                }
            }
            block35: while (true) {
                switch (var7_2) {
                    case 873970201: {
                        mn.d = -5976712259545687619L << (var7_2 ^ 873970233) >>> (var7_2 ^ 873970233) ^ (long)var6_9 & 0xFFFFFFFFL | (-5976712259545687619L >>> (var7_2 ^ 873970233) ^ (long)var6_9 & 0xFFFFFFFFL) << (var7_2 ^ 873970233);
                        mn.g = gj.decode("yhJzLeq4", mn.wE((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1417949627), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 247702103))));
                        mn.c = gj.decode("pC5hMAzYZQKi6H8=", mn.wE((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1417949628), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 656779533))));
                        mn.i = gj.decode("cEza2F8MvdkGqyOZq+U=", mn.wE((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1417949629), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 651395074))));
                        mn.f = gj.decode("Bl4N7UI96wA=", mn.wE((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1417949630), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1303331334))));
                        mn.e = gj.decode("f4AUDBPI1XK92sr6ZOMOjlUI/rg=", mn.wE((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1417949631), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1031123399))));
                        mn.b = gj.decode("EruChWaWQRXgB84yEzxBpOmu", mn.wE((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1417949632), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -392188029))));
                        mn.a = gj.decode("XYJMAti3sTn3BGITww==", mn.wE((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1417949617), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -2030625179))));
                        mn.h = gj.decode("uczhhl0h4U9NheTzaAIY8HtG", mn.wE((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ -1417949618), var7_2 ^ var8_1 ^ ((var6_9 | var7_2 ^ var8_1) ^ (var7_2 ^ 1851883812))));
                        var7_2 = var9 ^ 1856512692;
                        continue block35;
                    }
                    case -1209930850: {
                        mn.a = new GsonBuilder().setPrettyPrinting().create();
                        var7_2 = var9 ^ 1076895716;
                        continue block35;
                    }
                    case 894798129: {
                        var6_9 ^= var7_2 ^ -1814913759;
                        var7_2 = var9 ^ -333692901;
                        continue block35;
                    }
                    case 1667471713: {
                        var6_9 ^= var7_2 ^ -1548375875;
                        var7_2 = var9 ^ 436371625;
                        continue block35;
                    }
                    case 212648870: {
                        mn.a = Executors.newSingleThreadExecutor((ThreadFactory)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Runnable;)Ljava/lang/Thread;, wR(java.lang.Runnable ), (Ljava/lang/Runnable;)Ljava/lang/Thread;)());
                        ** break;
                    }
                    case 186520160: {
                        mn.a = gV.profiles().resolve(lH.profileStatsFileName());
                        var7_2 = var9 ^ -121060056;
                        continue block35;
                    }
                    case 1430323356: {
                        var6_9 ^= var7_2 ^ -289358226;
                        var7_2 = var9 ^ 1304587949;
                        continue block35;
                    }
                    case 466465889: {
                        var6_9 ^= var7_2 ^ -2005802072;
                        var7_2 = var9 ^ 1357101541;
                        continue block35;
                    }
lbl91:
                    // 1 sources

                    var7_2 = var9 ^ 247245593;
                    default: {
                        continue block35;
                    }
                    case 43913110: {
                        var6_9 ^= var7_2 ^ -1414978077;
                        ** continue;
                    }
                    case 1107241772: {
                        mn.a[var4_7] = var5_8 ^= var2_5;
                        ** continue;
                    }
                    case 637988217: {
                        var3_6 += 4;
                        if (++var4_7 < var1_4) ** continue;
                        ** continue;
                    }
                    case 1578868291: {
                        var6_9 ^= var7_2 ^ 2027033229;
                        ** continue;
                    }
                    case -1556779347: {
                        var6_9 ^= var7_2 ^ 1419427698;
                        var7_2 = var9 ^ 1464952867;
                        continue block35;
                    }
lbl111:
                    // 1 sources

                    while (true) {
                        var6_9 ^= 1986025005;
                        ** continue;
                        break;
                    }
                    case 373277992: 
                }
                break;
            }
            mn.a = new mn();
            return;
        }
        var9 = 1543351173;
        var8_1 = 1877610908;
        mn.a = mK.a(MethodHandles.lookup().lookupClass(), 281041798);
        var7_2 = 0;
        var6_9 = -160331699;
        var7_2 = var9 ^ -481146829;
        block37: while (true) {
            switch (var7_2) {
                default: {
                    continue block37;
                }
                case -798497458: {
                    var6_9 ^= var7_2 ^ -168318829;
                    var7_2 = var9 ^ 717031277;
                    continue block37;
                }
                case 1900063976: {
                    var2_5 = (var6_9 | var7_2 ^ 717031277) ^ (var7_2 ^ -838263150) ^ mn.a;
                    ** continue;
                }
                case -1196432458: 
            }
            var7_2 = var9 ^ -1952821557;
        }
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void shutdown() {
        block37: {
            block42: {
                block36: {
                    block38: {
                        block41: {
                            block35: {
                                block44: {
                                    block40: {
                                        block43: {
                                            block39: {
                                                break block43;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    var2_4 ^= var3_3 ^ 1301415120;
                                                    break block35;
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
                                                    var2_4 ^= var3_3 ^ 31104419;
                                                    break block36;
                                                    break;
                                                }
lbl9:
                                                // 1 sources

                                                while (true) {
                                                    var3_3 = (var1_2 | var4_1) ^ 1250352331;
                                                    break block37;
                                                    break;
                                                }
lbl12:
                                                // 1 sources

                                                while (true) {
                                                    if (this.a) break block38;
                                                    break block39;
                                                    break;
                                                }
lbl15:
                                                // 1 sources

                                                while (true) {
                                                    var2_4 ^= var3_3 ^ -194476170;
                                                    break block40;
                                                    break;
                                                }
lbl18:
                                                // 1 sources

                                                return;
                                                this.wG();
                                                var3_3 = (var1_2 | var4_1) ^ -1162727741;
                                                break block37;
lbl23:
                                                // 1 sources

                                                while (true) {
                                                    var2_4 ^= var3_3 ^ 1104530667;
                                                    break block41;
                                                    break;
                                                }
lbl26:
                                                // 1 sources

                                                while (true) {
                                                    var2_4 ^= var3_3 ^ 603682824;
                                                    break block42;
                                                    break;
                                                }
lbl29:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var3_3 = (var1_2 | var4_1) ^ -1652785107;
                                            break block37;
                                        }
                                        var4_1 = -1493191513;
                                        var1_2 = mn.a & -1493191513 ^ 1032277048;
                                        var3_3 = 0;
                                        break block44;
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ -1799370321;
                                    break block37;
                                }
                                var2_4 = (var1_2 | var4_1) ^ 2118788988;
                                var3_3 = (var1_2 | var4_1) ^ 495394402;
                                break block37;
                            }
                            var3_3 = (var1_2 | var4_1) ^ -1559826154;
                            break block37;
lbl49:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1233811642;
                                break block37;
                                break;
                            }
lbl52:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1993229362;
                                break block37;
                                break;
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ 152244441;
                        break block37;
lbl58:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl60:
                        // 1 sources

                        while (true) {
                            mn.wK(this.wI());
                            ** continue;
                            break;
                        }
                        this.a = false;
                        var3_3 = (var1_2 | var4_1) ^ 237113565;
                        break block37;
                        this.wF();
                        var3_3 = (var1_2 | var4_1) ^ -1081156306;
                        break block37;
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1137670011;
                    break block37;
                }
                var3_3 = (var1_2 | var4_1) ^ -34689682;
                break block37;
            }
            var3_3 = (var1_2 | var4_1) ^ 222428450;
            break block37;
lbl78:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -2035035966;
                break block37;
                break;
            }
lbl81:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ 941559405;
                ** continue;
                break;
            }
lbl84:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ 742448978;
                ** continue;
                break;
            }
        }
        block34: while (true) {
            switch (var3_3) {
                default: {
                    continue block34;
                }
                case -1310856094: {
                    ** continue;
                }
                case 160070649: {
                    ** continue;
                }
                case -176611212: {
                    ** continue;
                }
                case -1225986970: {
                    ** continue;
                }
                case 88986236: {
                    ** continue;
                }
                case -1296170595: {
                    ** continue;
                }
                case -919488371: {
                    ** continue;
                }
                case 579042450: {
                    ** continue;
                }
                case 961293437: {
                    ** continue;
                }
                case -1569135907: {
                    ** continue;
                }
                case 1108431313: {
                    ** continue;
                }
                case 725628176: {
                    ** continue;
                }
                case -63927356: {
                    ** continue;
                }
                case 7414161: {
                    ** continue;
                }
                case 486084009: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void recordModuleToggle(String var1_1) {
        block36: {
            block28: {
                block34: {
                    block30: {
                        block35: {
                            block33: {
                                block29: {
                                    block32: {
                                        block31: {
                                            block27: {
                                                var5_2 = -1249038115;
                                                var2_3 = mn.a & -1249038115 ^ -1912364293;
                                                var4_4 = 0;
                                                ** GOTO lbl29
lbl5:
                                                // 1 sources

                                                while (true) {
                                                    var3_5 ^= var4_4 ^ -975073364;
                                                    break block27;
                                                    break;
                                                }
lbl8:
                                                // 1 sources

                                                while (var1_1 != null) {
                                                    break block28;
                                                }
                                                break block33;
lbl11:
                                                // 1 sources

                                                while (true) {
                                                    var3_5 ^= var4_4 ^ 1081334657;
                                                    break block29;
                                                    break;
                                                }
lbl14:
                                                // 1 sources

                                                block20: while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ -1622755353;
lbl16:
                                                    // 14 sources

                                                    block21: while (true) {
                                                        switch (var4_4) lbl-1000:
                                                        // 2 sources

                                                        {
                                                            while (true) {
                                                                default: {
                                                                    continue block21;
                                                                }
                                                                break;
                                                            }
                                                            case -1719595174: {
                                                                ** continue;
                                                            }
                                                            case 473455870: {
                                                                ** GOTO lbl8
                                                            }
                                                            case 1571656480: {
                                                                ** continue;
                                                            }
                                                            case 79182233: {
                                                                break block20;
                                                            }
lbl29:
                                                            // 1 sources

                                                            var3_5 = (var2_3 | var5_2) ^ 1042861843;
                                                            break block30;
                                                            while (true) {
                                                                var4_4 = (var2_3 | var5_2) ^ 638500261;
                                                                ** continue;
                                                                break;
                                                            }
                                                            case -519679964: {
                                                                var3_5 ^= var4_4 ^ -129439737;
                                                                break block31;
                                                            }
                                                            case -971469337: {
                                                                return;
                                                            }
                                                            case -2084359740: {
                                                                var3_5 ^= var4_4 ^ 922649258;
                                                                break block32;
                                                            }
                                                            case 1143801152: {
                                                                if (!var1_1.isBlank()) ** continue;
                                                                break block33;
                                                            }
                                                            case 19390371: {
                                                                break block34;
                                                            }
                                                            case 550044952: {
                                                                var3_5 ^= var4_4 ^ -1792370048;
                                                                break block35;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                }
                                                var4_4 = (var2_3 | var5_2) ^ -73222209;
                                                ** GOTO lbl16
                                                {
                                                    case 1172123589: {
                                                        this.b.merge(var1_1, 1L, (BiFunction<Long, Long, Long>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, sum(long long ), (Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Long;)());
                                                        ** continue;
                                                    }
                                                }
                                            }
                                            var4_4 = (var2_3 | var5_2) ^ -95249094;
                                            ** GOTO lbl16
                                        }
                                        var4_4 = (var2_3 | var5_2) ^ -318673251;
                                        ** GOTO lbl16
                                    }
                                    var4_4 = (var2_3 | var5_2) ^ 2039955224;
                                    ** GOTO lbl16
lbl65:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ -501079585;
                                        ** GOTO lbl16
                                        break;
                                    }
                                }
                                var4_4 = (var2_3 | var5_2) ^ -1762884078;
                                ** GOTO lbl16
                            }
                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1011647291;
                                ** GOTO lbl16
                                break;
                            }
                        }
                        var4_4 = (var2_3 | var5_2) ^ -204218304;
                        ** GOTO lbl16
lbl78:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1096258212;
                            ** GOTO lbl16
                            break;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ -1758629252;
                    ** GOTO lbl16
                }
                var4_4 = (var2_3 | var5_2) ^ -1548227071;
                ** GOTO lbl16
                {
                    case 681754755: {
                        ** continue;
                    }
                }
            }
            var4_4 = (var2_3 | var5_2) ^ -1153987738;
            ** GOTO lbl16
            {
                case 1281118911: {
                    ++this.f;
                    break block36;
                }
                case 694367469: {
                    if (!this.a) ** continue;
                    ** continue;
                }
                ** case 1385094242:
            }
lbl99:
            // 1 sources

            return;
        }
        var4_4 = (var2_3 | var5_2) ^ 1586094811;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public synchronized void setProfileName(String var1_1) {
        block31: {
            var6_2 = 1526145008;
            var3_3 = mn.a & 1526145008 ^ 1523522150;
            var5_4 = 0;
            var4_6 = (var3_3 | var6_2) ^ 413549808;
            var5_4 = (var3_3 | var6_2) ^ 1386269826;
            break block31;
lbl7:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ 1002811406;
                ** GOTO lbl45
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ 278406404;
                ** GOTO lbl45
lbl13:
                // 2 sources

                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ -82850031;
                    ** GOTO lbl45
                    break;
                }
                break;
            }
lbl16:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ 1497747454;
                ** GOTO lbl45
                break;
            }
lbl19:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -1073286041;
                ** GOTO lbl45
                break;
            }
            while (true) {
                var5_4 = (var3_3 | var6_2) ^ 1765321533;
                ** GOTO lbl45
                break;
            }
        }
        block27: while (true) {
            switch (var5_4) {
                default: {
                    continue block27;
                }
                case -1369511522: {
                    var4_6 ^= var5_4 ^ -1766382006;
                    var5_4 = (var3_3 | var6_2) ^ 1383326221;
                    continue block27;
                }
                case 140497780: {
                    var5_4 = (var3_3 | var6_2) ^ -190712216;
                    continue block27;
                }
                case 143457787: 
            }
            break;
        }
        var2_5 = mn.wN(var1_1);
        ** while (true)
lbl40:
        // 1 sources

        while (true) {
            var5_4 = (var3_3 | var6_2) ^ 199256506;
            if (true) ** GOTO lbl45
            break;
        }
        block29: while (true) {
            var5_4 = (var3_3 | var6_2) ^ 1809140303;
lbl45:
            // 8 sources

            block30: while (true) {
                switch (var5_4) {
                    case -118183295: {
                        var4_6 ^= var5_4 ^ -245084581;
                        var5_4 = (var3_3 | var6_2) ^ -1878824083;
                        continue block30;
                    }
                    case 1654366086: {
                        var5_4 = (var3_3 | var6_2) ^ 783768237;
                        continue block30;
                    }
                    case -1608168516: {
                        var4_6 ^= var5_4 ^ 1987363886;
                        ** continue;
                    }
                    case 824858041: {
                        this.d = var2_5;
                        var5_4 = (var3_3 | var6_2) ^ -86354870;
                        continue block30;
                    }
                    case 62574600: {
                        var4_6 ^= var5_4 ^ -2134182852;
                        ** break;
                    }
                    case 868725963: {
                        var4_6 ^= var5_4 ^ -599919124;
                        continue block29;
                    }
                    case 1282275145: {
                        if (var2_5.isEmpty()) ** GOTO lbl13
                        var5_4 = (var3_3 | var6_2) ^ 946110576;
                        continue block30;
                    }
lbl71:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 378726591;
                    default: {
                        continue block30;
                    }
                    case -889424741: {
                        this.wI();
                        ** continue;
                    }
                    case -1578053401: {
                        var4_6 ^= var5_4 ^ -1048839511;
                        ** continue;
                    }
                    case -1694897263: {
                        var4_6 ^= var5_4 ^ -1223206350;
                        ** continue;
                    }
                    case 1950893403: {
                        if (!var2_5.equals(this.d)) ** continue;
                        ** continue;
                    }
                    case 1361016396: {
                        ++this.f;
                        var5_4 = (var3_3 | var6_2) ^ -1576290953;
                        continue block30;
                    }
                    case 1631236088: {
                        return;
                    }
                    case 1248279282: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized String profileName() {
        int n2 = a & 0x25092733 ^ 0xF0F09D5D;
        int n3 = 0;
        int n4 = (n2 | 0x25092733) ^ 0xD4339D8D;
        n3 = (n2 | 0x25092733) ^ 0x660C698C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1487151740: {
                    n4 ^= n3 ^ 0x807524E8;
                    n3 = (n2 | 0x25092733) ^ 0x3D8D8BDC;
                    continue block5;
                }
                case -931908445: {
                    return this.d;
                }
                case -1812605197: 
            }
            n3 = (n2 | 0x25092733) ^ 0x52A262FB;
        }
    }

    /*
     * Unable to fully structure code
     */
    public synchronized long currentSessionSeconds() {
        block20: {
            break block20;
lbl1:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ -1541629281;
                ** GOTO lbl46
                break;
            }
        }
        var4_1 = -1883564622;
        var1_2 = mn.a & -1883564622 ^ 851223304;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 281932673;
        ** GOTO lbl44
lbl10:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 804339897;
            ** GOTO lbl29
lbl13:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 385918608;
                ** GOTO lbl29
                break;
            }
lbl16:
            // 1 sources

            return 0L;
lbl18:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ -1176536730;
                ** continue;
                break;
            }
lbl21:
            // 1 sources

            return Math.max(0L, (System.nanoTime() - this.h) / (6590181577042414906L << (var3_3 ^ -1463873270) >>> (var3_3 ^ -1463873270) ^ (long)var2_4 & 0xFFFFFFFFL | (6590181577042414906L >>> (var3_3 ^ -1463873270) ^ (long)var2_4 & 0xFFFFFFFFL) << (var3_3 ^ -1463873270)));
lbl24:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1968268456;
                ** GOTO lbl29
                break;
            }
lbl27:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -1667906480;
lbl29:
                // 4 sources

                block17: while (true) {
                    switch (var3_3) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            default: {
                                continue block17;
                            }
                            break;
                        }
                        case -890318062: {
                            ** continue;
                        }
                        case -1164190486: {
                            ** continue;
                        }
                        case 1545258455: {
                            ** continue;
                        }
                        case 589984746: {
                            ** continue;
                        }
                        case -1463873238: {
                            ** continue;
                        }
lbl44:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 86272848;
                        ** GOTO lbl-1000
lbl46:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ -1458588465;
                        ** GOTO lbl-1000
lbl48:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -475696531;
                            ** continue;
                            break;
                        }
                        case -1873873149: {
                            var2_4 ^= var3_3 ^ 1209838077;
                            ** continue;
                        }
                        case 380633973: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        ** while (this.a)
lbl56:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized long revision() {
        int n2 = a & 0x32BF9354 ^ 0xA2D64D40;
        int n3 = 0;
        int n4 = (n2 | 0x32BF9354) ^ 0xC397B38F;
        n3 = (n2 | 0x32BF9354) ^ 0x3D7C180C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1570227714: {
                    n4 ^= n3 ^ 0x2D2E325E;
                    n3 = (n2 | 0x32BF9354) ^ 0xC740CA06;
                    continue block5;
                }
                case 1975457106: {
                    return this.f;
                }
                case -1887189160: 
            }
            n3 = (n2 | 0x32BF9354) ^ 0x1097E6AA;
        }
    }

    /*
     * Exception decompiling
     */
    public synchronized em snapshot() {
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
    private void wF() {
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
    private void wG() {
        block28: {
            block29: {
                break block29;
                {
                    ++this.f;
                    var3_3 = (var1_2 | var4_1) ^ 645747827;
lbl3:
                    // 4 sources

                    block16: while (true) {
                        switch (var3_3) lbl-1000:
                        // 10 sources

                        {
                            while (true) {
                                default: {
                                    continue block16;
                                }
                                break;
                            }
                            case 300521060: {
                                continue block15;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1887764286;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -1967016552: {
                                break block15;
                            }
lbl15:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 34959650;
                                ** GOTO lbl-1000
                                break;
                            }
lbl18:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1404818063;
                                ** GOTO lbl-1000
                                break;
                            }
lbl21:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -2090912799;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -608159156: {
                                var2_4 ^= var3_3 ^ -904761997;
                                var3_3 = (var1_2 | var4_1) ^ 1293502295;
                                ** GOTO lbl-1000
                            }
                            case -1925607167: {
                                return;
                            }
lbl30:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 936737532;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -899148605: {
                                var2_4 ^= var3_3 ^ 282788214;
                                ** continue;
                            }
lbl36:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1461049328;
                                ** GOTO lbl-1000
                                break;
                            }
lbl39:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -329975717;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 1431782959: {
                                this.e = 0L;
                                ** continue;
                            }
                            case -5759203: {
                                if (this.e <= 0L) {
                                    ** continue;
                                }
                                break block28;
                            }
                            case 1468233573: {
                                var2_4 ^= var3_3 ^ 228339698;
                                ** continue;
                            }
lbl52:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 2004671399;
                                ** continue;
                                break;
                            }
                            case 99859879: {
                                var2_4 ^= var3_3 ^ -1533098943;
                                ** continue;
                            }
                        }
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -1872091685;
                ** GOTO lbl3
                {
                    case 2128764382: {
                        var2_4 ^= var3_3 ^ 897547614;
                        ** continue;
                    }
                    case 1842826212: {
                        var2_4 ^= var3_3 ^ -47131054;
                        ** continue;
                    }
                }
            }
            var4_1 = -1128453065;
            var1_2 = mn.a & -1128453065 ^ 1696679438;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -88420321;
            ** while (true)
            {
                case -1331418776: {
                    return;
                }
            }
lbl74:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -129051752;
                ** GOTO lbl3
                break;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ -1438770854;
        ** while (true)
        {
            ** case -1375290192:
        }
lbl81:
        // 1 sources

        this.a.merge(LocalDate.now().toString(), 1L, (BiFunction<Long, Long, Long>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, sum(long long ), (Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Long;)());
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void wH(String var1_1) {
        block50: {
            block52: {
                block51: {
                    var6_2 = 1886356718;
                    var3_3 = mn.a & 1886356718 ^ 1185439748;
                    var5_4 = 0;
                    var4_5 = (var3_3 | var6_2) ^ -1717118365;
                    var5_4 = (var3_3 | var6_2) ^ -160490170;
                    break block50;
lbl7:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ 2104975429;
                        break block50;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var4_5 ^= var5_4 ^ -643061533;
                        var5_4 = (var3_3 | var6_2) ^ -1489689620;
                        break block50;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        if (Files.exists(mn.a, new LinkOption[0])) break block51;
                        var5_4 = (var3_3 | var6_2) ^ -657165217;
                        break block50;
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var4_5 ^= var5_4 ^ -60844739;
                        var5_4 = (var3_3 | var6_2) ^ 402430631;
                        break block50;
                        break;
                    }
lbl22:
                    // 1 sources

                    return;
                }
                try {
                    var5_4 = (var3_3 | var6_2) ^ 872543423;
                    break block50;
lbl28:
                    // 1 sources

                    while (true) {
                        var4_5 ^= var5_4 ^ -1114798511;
                        var5_4 = (var3_3 | var6_2) ^ -1910061192;
                        break block50;
                        break;
                    }
lbl32:
                    // 1 sources

                    while (true) {
                        var4_5 ^= -1294289881;
                        var2_6 = JsonParser.parseString((String)Files.readString(mn.a, StandardCharsets.UTF_8)).getAsJsonObject();
                        var5_4 = (var3_3 | var6_2) ^ 1274634213;
                        break block52;
lbl37:
                        // 1 sources

                        while (true) {
                            var4_5 ^= var5_4 ^ 446694094;
                            var5_4 = (var3_3 | var6_2) ^ -1363701121;
                            break block52;
                            break;
                        }
lbl41:
                        // 1 sources

                        while (true) {
                            this.d = mn.wN(mn.wO(var2_6, mn.c, var1_1));
                            var5_4 = (var3_3 | var6_2) ^ 1913813049;
                            break block52;
                            break;
                        }
lbl45:
                        // 1 sources

                        while (true) {
                            var4_5 ^= var5_4 ^ 1347530544;
                            var5_4 = (var3_3 | var6_2) ^ -1055836965;
                            break block52;
                            break;
                        }
lbl49:
                        // 1 sources

                        while (true) {
                            if (!this.d.isEmpty()) ** GOTO lbl58
                            var5_4 = (var3_3 | var6_2) ^ -2047060616;
                            break block52;
                            break;
                        }
lbl53:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ -253365381;
                            break block52;
                            break;
                        }
lbl56:
                        // 1 sources

                        while (true) {
                            this.d = var1_1;
lbl58:
                            // 2 sources

                            var5_4 = (var3_3 | var6_2) ^ 82729696;
                            break block52;
                            break;
                        }
lbl60:
                        // 1 sources

                        while (true) {
                            var4_5 ^= var5_4 ^ 789971093;
                            var5_4 = (var3_3 | var6_2) ^ -140775058;
                            break block52;
                            break;
                        }
lbl64:
                        // 1 sources

                        while (true) {
                            this.c = mn.wP(var2_6, mn.i, 0L);
                            var5_4 = (var3_3 | var6_2) ^ -62055060;
                            break block52;
                            break;
                        }
lbl68:
                        // 1 sources

                        while (true) {
                            var4_5 ^= var5_4 ^ -58828882;
                            var5_4 = (var3_3 | var6_2) ^ -1844705367;
                            break block52;
                            break;
                        }
lbl72:
                        // 1 sources

                        while (true) {
                            this.a = mn.wP(var2_6, mn.f, 0L);
                            var5_4 = (var3_3 | var6_2) ^ -510215616;
                            break block52;
                            break;
                        }
lbl76:
                        // 1 sources

                        while (true) {
                            var4_5 ^= var5_4 ^ -1729302969;
                            var5_4 = (var3_3 | var6_2) ^ 240460993;
                            break block52;
                            break;
                        }
lbl80:
                        // 1 sources

                        while (true) {
                            mn.wM(var2_6.get(mn.e), (Map<String, Long>)this.a);
                            var5_4 = (var3_3 | var6_2) ^ 1030210274;
                            break block52;
                            break;
                        }
lbl84:
                        // 1 sources

                        while (true) {
                            var4_5 ^= var5_4 ^ -2036425484;
                            var5_4 = (var3_3 | var6_2) ^ -347858652;
                            break block52;
                            break;
                        }
lbl88:
                        // 1 sources

                        while (true) {
                            mn.wM(var2_6.get(mn.b), (Map<String, Long>)this.b);
                            var4_5 ^= -1171430869;
                            break;
                        }
                        break;
                    }
                }
                catch (Throwable v0) {
                    var4_5 = (var3_3 | var6_2) ^ -1069516205;
                    var2_7 = v0;
                    var4_5 ^= -1267267609;
                    this.a.clear();
                    var4_5 ^= 572906117;
                    this.b.clear();
                    var4_5 ^= 381008880;
                    this.d = var1_1;
                    var4_5 ^= 1347063819;
                    this.c = 0L;
                    var4_5 ^= 918465129;
                    this.a = 0L;
                }
                var4_5 ^= -1792264863;
                return;
            }
            block48: while (true) {
                switch (var5_4) {
                    default: {
                        continue block48;
                    }
                    {
                        case 1024899851: {
                            ** continue;
                        }
                        case -665291119: {
                            ** continue;
                        }
                        case 83729623: {
                            ** continue;
                        }
                        case -1208037323: {
                            ** continue;
                        }
                        case -216813162: {
                            ** continue;
                        }
                        case -2046158955: {
                            ** continue;
                        }
                        case 1912716814: {
                            ** continue;
                        }
                        case -2123098752: {
                            ** continue;
                        }
                        case -1969030782: {
                            ** continue;
                        }
                        case -454827193: {
                            ** continue;
                        }
                        case -1753653586: {
                            ** continue;
                        }
                        case 2025504815: {
                            ** continue;
                        }
                        case 1267213836: {
                            ** continue;
                        }
                        ** case -1649672758:
lbl139:
                        // 1 sources

                        ** continue;
                    }
                }
                break;
            }
        }
        block49: while (true) {
            switch (var5_4) {
                default: {
                    continue block49;
                }
                case -2139031128: {
                    ** continue;
                }
                case 194544811: {
                    ** continue;
                }
                case -774191358: {
                    ** continue;
                }
                case -1371828047: {
                    ** continue;
                }
                case 1628667465: {
                    ** continue;
                }
                {
                    case 1122898001: {
                        ** continue;
                    }
                    ** case -121035882:
lbl158:
                    // 1 sources

                    ** continue;
                }
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Future<?> wI() {
        block42: {
            var6_1 = -1186522228;
            var3_2 = mn.a & -1186522228 ^ 885556679;
            var5_3 = 0;
            var4_5 = (var3_2 | var6_1) ^ 335980004;
            var5_3 = (var3_2 | var6_1) ^ -78477376;
            break block42;
lbl7:
            // 1 sources

            while (true) {
                var5_3 = (var3_2 | var6_1) ^ -512403481;
                if (true) ** GOTO lbl18
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var5_3 = (var3_2 | var6_1) ^ 837045773;
                break block42;
lbl13:
                // 2 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -20455190;
                    break block42;
                    break;
                }
                break;
            }
            block36: while (true) {
                var5_3 = (var3_2 | var6_1) ^ -818705386;
lbl18:
                // 3 sources

                block37: while (true) {
                    switch (var5_3) {
                        case 920295832: {
                            var1_4.add(mn.b, (JsonElement)mn.wL((Map<String, Long>)this.b));
                            ** GOTO lbl63
                        }
                        case 30808160: {
                            var1_4.addProperty(mn.a, (Number)1);
                            var5_3 = (var3_2 | var6_1) ^ -826622138;
                            continue block37;
                        }
                        case -1546733441: {
                            var4_5 ^= var5_3 ^ -1560803537;
                            var5_3 = (var3_2 | var6_1) ^ -1139177553;
                            continue block37;
                        }
                        case 157460893: {
                            var4_5 ^= var5_3 ^ 1132972302;
                            var5_3 = (var3_2 | var6_1) ^ 630224315;
                            continue block37;
                        }
                        case -811180026: {
                            var1_4.addProperty(mn.c, this.d);
                            ** break;
                        }
                        case 1221050646: {
                            var1_4.addProperty(mn.f, (Number)this.a);
                            var5_3 = (var3_2 | var6_1) ^ -2127413892;
                            continue block37;
                        }
                        case 1555744808: {
                            var4_5 ^= var5_3 ^ 1031642373;
                            ** GOTO lbl65
                        }
                        case 299569328: {
                            var4_5 ^= var5_3 ^ 1157206969;
                            var5_3 = (var3_2 | var6_1) ^ -1161589844;
                            continue block37;
                        }
                        case 1937055881: {
                            var4_5 ^= var5_3 ^ -1233394818;
                            var5_3 = (var3_2 | var6_1) ^ 1919549385;
                            continue block37;
                        }
                        case 1023255219: {
                            var4_5 ^= var5_3 ^ 1313123849;
                            var5_3 = (var3_2 | var6_1) ^ -979365038;
                            continue block37;
                        }
                        case -1738544524: {
                            var2_6 = mn.a.toJson((JsonElement)var1_4);
                            var5_3 = (var3_2 | var6_1) ^ -1430415509;
                            ** GOTO lbl121
                        }
lbl61:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ -1407938689;
                        ** GOTO lbl66
lbl63:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ -1263716782;
                        ** GOTO lbl66
lbl65:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ -1961556393;
lbl66:
                        // 4 sources

                        default: {
                            continue block37;
                        }
                        case 118232163: {
                            var1_4.addProperty(mn.i, (Number)this.c);
                            continue block36;
                        }
                        case 2020576413: {
                            var1_4.add(mn.e, (JsonElement)mn.wL((Map<String, Long>)this.a));
                            ** continue;
                        }
                        case 1929122777: 
                    }
                    var4_5 ^= var5_3 ^ 238014991;
                    var5_3 = (var3_2 | var6_1) ^ -184000807;
                    continue;
                    break;
                }
                break;
            }
        }
        block38: while (true) {
            switch (var5_3) {
                default: {
                    continue block38;
                }
                case 1184700431: {
                    ** break;
                }
                case -1791287155: {
                    if (this.a) ** GOTO lbl13
                    var5_3 = (var3_2 | var6_1) ^ 13947519;
                    continue block38;
                }
                case 327178469: {
                    var4_5 ^= var5_3 ^ -550092634;
                    var5_3 = (var3_2 | var6_1) ^ 687128386;
                    continue block38;
                }
                case -1943285310: {
                    var4_5 ^= var5_3 ^ -16472268;
                    var5_3 = (var3_2 | var6_1) ^ 58041870;
                    continue block38;
                }
                case 1124630309: {
                    var4_5 ^= var5_3 ^ 1180804132;
                    var5_3 = (var3_2 | var6_1) ^ 1359544708;
                    continue block38;
                }
                case -1122284112: {
                    var5_3 = (var3_2 | var6_1) ^ -1290912311;
                    continue block38;
                }
                case 247570950: {
                    if (this.c <= 0L) ** break;
                    ** continue;
                    ** continue;
                }
lbl108:
                // 1 sources

                var5_3 = (var3_2 | var6_1) ^ -1370503382;
                continue block38;
                case -322527669: {
                    var1_4 = new JsonObject();
                    var5_3 = (var3_2 | var6_1) ^ 503392176;
                    ** continue;
                }
                case -1095091775: 
            }
            break;
        }
        return null;
lbl116:
        // 1 sources

        while (true) {
            var5_3 = (var3_2 | var6_1) ^ 550206480;
            if (true) ** GOTO lbl121
            break;
        }
        while (true) {
            var5_3 = (var3_2 | var6_1) ^ 1430734076;
lbl121:
            // 3 sources

            block41: while (true) {
                switch (var5_3) {
                    default: {
                        continue block41;
                    }
                    case -1660623905: {
                        var4_5 ^= var5_3 ^ 2116698024;
                        var5_3 = (var3_2 | var6_1) ^ 468174709;
                        continue block41;
                    }
                    case -1507305286: {
                        return mn.a.submit((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, wQ(java.lang.String ), ()V)((String)var2_6));
                    }
                    case -393684173: {
                        this.b = System.currentTimeMillis();
                        ** continue;
                    }
                    case 393349284: 
                }
                break;
            }
            var4_5 ^= var5_3 ^ 1061796760;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void wJ(String var0) {
        var6_1 = -545915976;
        var3_2 = mn.a & -545915976 ^ 59260546;
        var5_3 = 0;
        var4_4 = (var3_2 | var6_1) ^ -1148420667;
        var5_3 = (var3_2 | var6_1) ^ -380187619;
        ** GOTO lbl17
lbl-1000:
        // 1 sources

        {
            while (true) {
                var5_3 = (var3_2 | var6_1) ^ 1373740628;
                ** GOTO lbl17
                break;
            }
lbl-1000:
            // 1 sources

            {
                block22: {
                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ -952452344;
                        break block22;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var4_4 ^= -1118404106;
                        var4_4 ^= -1674514060;
                        return;
                    }
lbl17:
                    // 2 sources

                    block20: while (true) {
                        switch (var5_3) {
                            default: {
                                continue block20;
                            }
                            case 917189543: {
                                ** continue;
                            }
                            case -1910742546: {
                                var4_4 ^= var5_3 ^ 1657707287;
                                var5_3 = (var3_2 | var6_1) ^ -201560488;
                                continue block20;
                            }
                            case 738300386: {
                                Files.createDirectories(mn.a.getParent(), new FileAttribute[0]);
                                var5_3 = (var3_2 | var6_1) ^ -1059235842;
                                continue block20;
                            }
                            case 522233924: {
                                var4_4 ^= var5_3 ^ 895592203;
                                var5_3 = (var3_2 | var6_1) ^ 1831659981;
                                continue block20;
                            }
                            case -1294920073: 
                        }
                        break;
                    }
                    var1_5 = mn.a.resolveSibling(String.valueOf(mn.a.getFileName()) + ".tmp");
                    var5_3 = (var3_2 | var6_1) ^ -393528502;
                }
                block21: while (true) {
                    switch (var5_3) {
                        default: {
                            continue block21;
                        }
                        case 930530544: {
                            var4_4 ^= var5_3 ^ -2077276746;
                            var5_3 = (var3_2 | var6_1) ^ -1197204700;
                            continue block21;
                        }
                        case 1733944478: {
                            Files.writeString(var1_5, (CharSequence)var0, StandardCharsets.UTF_8, new OpenOption[0]);
                            ** continue;
                        }
                        case 415712434: {
                            var4_4 ^= var5_3 ^ -995177810;
                            var5_3 = (var3_2 | var6_1) ^ -1105585821;
                            continue block21;
                        }
                        case 1642587865: 
                    }
                    break;
                }
                Files.move(var1_5, mn.a, new CopyOption[]{StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE});
                var4_4 ^= -1004959044;
                ** continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void wK(Future<?> var0) {
        block23: {
            block24: {
                var5_1 = 1158798015;
                var2_2 = mn.a & 1158798015 ^ 1980351313;
                var4_3 = 0;
                var3_4 = (var2_2 | var5_1) ^ -308440725;
                var4_3 = (var2_2 | var5_1) ^ -1313657495;
                break block23;
lbl7:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 14214916;
                    break block23;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ -1357807635;
                    var4_3 = (var2_2 | var5_1) ^ -77919355;
                    break block23;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    if (var0 != null) break block24;
                    var4_3 = (var2_2 | var5_1) ^ 597062457;
                    break block23;
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ 2095395957;
                    var4_3 = (var2_2 | var5_1) ^ 143021534;
                    break block23;
                    break;
                }
lbl22:
                // 1 sources

                return;
            }
            try {
                var4_3 = (var2_2 | var5_1) ^ -957725536;
                break block23;
lbl28:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ 135184403;
                    var4_3 = (var2_2 | var5_1) ^ -1033289191;
                    break block23;
                    break;
                }
lbl32:
                // 1 sources

                while (true) {
                    var0.get(-312623252140108084L << (var4_3 ^ -1250911802) >>> (var4_3 ^ -1250911802) ^ (long)var3_4 & 0xFFFFFFFFL | (-312623252140108084L >>> (var4_3 ^ -1250911802) ^ (long)var3_4 & 0xFFFFFFFFL) << (var4_3 ^ -1250911802), TimeUnit.SECONDS);
                    var3_4 ^= 397638695;
                    break;
                }
            }
            catch (Throwable v0) {
                var3_4 = (var2_2 | var5_1) ^ -1694240490;
                var1_5 = v0;
            }
            var4_3 = (var2_2 | var5_1) ^ -1044134319;
            break block23;
lbl43:
            // 1 sources

            while (true) {
                var3_4 ^= var4_3 ^ -1985939160;
                var4_3 = (var2_2 | var5_1) ^ -477491283;
                break block23;
                break;
            }
lbl47:
            // 1 sources

            return;
        }
        block22: while (true) {
            switch (var4_3) {
                default: {
                    continue block22;
                }
                case -961874282: {
                    ** continue;
                }
                case 2009152763: {
                    ** continue;
                }
                case -1941778310: {
                    ** continue;
                }
                case 1418700998: {
                    ** continue;
                }
                case 2141163041: {
                    ** continue;
                }
                {
                    case -1309434017: {
                        ** continue;
                    }
                    case -1250911770: {
                        ** continue;
                    }
                }
                case -1227219538: {
                    ** continue;
                }
                ** case -1802251182:
lbl71:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static JsonObject wL(Map<String, Long> var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH], 52[UNCONDITIONALDOLOOP]], but top level block is 12[SWITCH]
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
    private static void wM(JsonElement var0, Map<String, Long> var1_1) {
        block76: {
            block78: {
                block74: {
                    block79: {
                        block77: {
                            block75: {
                                var9_2 = -2100851923;
                                var6_3 = mn.a & -2100851923 ^ 617585741;
                                var8_4 = 0;
                                var7_5 = (var6_3 | var9_2) ^ -1120276694;
                                var8_4 = (var6_3 | var9_2) ^ -1025070106;
                                break block74;
lbl7:
                                // 1 sources

                                while (true) {
                                    var8_4 = (var6_3 | var9_2) ^ -721169315;
                                    break block74;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var7_5 ^= var8_4 ^ 1287309859;
                                    var8_4 = (var6_3 | var9_2) ^ -1896210065;
                                    break block74;
                                    break;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    if (var0 == null) ** GOTO lbl23
                                    var8_4 = (var6_3 | var9_2) ^ 167603710;
                                    break block74;
                                    break;
                                }
lbl18:
                                // 1 sources

                                while (true) {
                                    var8_4 = (var6_3 | var9_2) ^ -1083828955;
                                    break block74;
                                    break;
                                }
lbl21:
                                // 1 sources

                                while (true) {
                                    if (var0.isJsonObject()) break block75;
lbl23:
                                    // 2 sources

                                    var8_4 = (var6_3 | var9_2) ^ -599874899;
                                    break block74;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var7_5 ^= var8_4 ^ 2086566559;
                                    var8_4 = (var6_3 | var9_2) ^ -1779355395;
                                    break block74;
                                    break;
                                }
lbl29:
                                // 1 sources

                                return;
                            }
                            var8_4 = (var6_3 | var9_2) ^ -87772730;
                            break block74;
lbl34:
                            // 1 sources

                            while (true) {
                                var7_5 ^= var8_4 ^ 449416516;
                                var8_4 = (var6_3 | var9_2) ^ -58575229;
                                break block74;
                                break;
                            }
lbl38:
                            // 1 sources

                            while (true) {
                                var2_6 = var0.getAsJsonObject().entrySet().iterator();
lbl40:
                                // 2 sources

                                while (true) {
                                    var8_4 = (var6_3 | var9_2) ^ -1447384712;
                                    break block76;
                                    break;
                                }
                                break;
                            }
lbl43:
                            // 1 sources

                            while (true) {
                                var7_5 ^= var8_4 ^ 1610550511;
                                var8_4 = (var6_3 | var9_2) ^ 448686693;
                                break block76;
                                break;
                            }
lbl47:
                            // 1 sources

                            while (true) {
                                if (!var2_6.hasNext()) break block77;
                                var8_4 = (var6_3 | var9_2) ^ 1746673050;
                                break block76;
                                break;
                            }
lbl51:
                            // 1 sources

                            while (true) {
                                var7_5 ^= var8_4 ^ -1609246008;
                                var8_4 = (var6_3 | var9_2) ^ 122906000;
                                break block76;
                                break;
                            }
lbl55:
                            // 1 sources

                            while (true) {
                                var3_7 = (Map.Entry)var2_6.next();
                                try {
                                    var8_4 = (var6_3 | var9_2) ^ -1026186486;
                                    break block78;
lbl60:
                                    // 1 sources

                                    while (true) {
                                        var7_5 ^= var8_4 ^ 124590790;
                                        var8_4 = (var6_3 | var9_2) ^ 1734456734;
                                        break block78;
                                        break;
                                    }
lbl64:
                                    // 1 sources

                                    while (true) {
                                        block80: {
                                            var4_8 = ((JsonElement)var3_7.getValue()).getAsLong();
                                            var8_4 = (var6_3 | var9_2) ^ -1652303335;
                                            break block79;
lbl68:
                                            // 2 sources

                                            while (true) {
                                                var8_4 = (var6_3 | var9_2) ^ 284471967;
                                                break block79;
                                                break;
                                            }
lbl71:
                                            // 1 sources

                                            block59: while (true) {
                                                switch (var7_5) {
                                                    case 5996238: {
                                                        var8_4 = (var6_3 | var9_2) ^ 97679556;
                                                        break block59;
                                                    }
lbl76:
                                                    // 1 sources

                                                    while (true) {
                                                        var7_5 ^= var8_4 ^ 1934668089;
                                                        break block80;
                                                        break;
                                                    }
                                                    default: {
                                                        var8_4 = (var6_3 | var9_2) ^ 1903367961;
                                                        break block59;
                                                    }
lbl82:
                                                    // 1 sources

                                                    while (true) {
                                                        var7_5 ^= var8_4 ^ 238469677;
                                                        break block80;
                                                        break;
                                                    }
                                                    case 333432057: {
                                                        var8_4 = (var6_3 | var9_2) ^ -679265683;
                                                        break block59;
                                                    }
                                                }
                                                break;
                                            }
                                            break block79;
lbl89:
                                            // 1 sources

                                            while (true) {
                                                var7_5 ^= var8_4 ^ -1295067200;
                                                ** GOTO lbl68
                                                break;
                                            }
                                        }
                                        var8_4 = (var6_3 | var9_2) ^ -248689573;
                                        break block79;
lbl95:
                                        // 1 sources

                                        while (true) {
                                            var8_4 = (var6_3 | var9_2) ^ 1134759385;
                                            break block79;
                                            break;
                                        }
lbl98:
                                        // 1 sources

                                        while (true) {
                                            if (var4_8 < 0L) ** GOTO lbl108
                                            var8_4 = (var6_3 | var9_2) ^ -725631307;
                                            break block79;
                                            break;
                                        }
lbl102:
                                        // 1 sources

                                        while (true) {
                                            var8_4 = (var6_3 | var9_2) ^ 396210294;
                                            break block79;
                                            break;
                                        }
lbl105:
                                        // 1 sources

                                        while (true) {
                                            var1_1.put((String)var3_7.getKey(), var4_8);
lbl108:
                                            // 2 sources

                                            var7_5 ^= -2097040726;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                catch (RuntimeException v0) {
                                    var7_5 = (var6_3 | var9_2) ^ -1019449023;
                                    var4_9 = v0;
                                }
                                var8_4 = (var6_3 | var9_2) ^ -1611105711;
                                break block78;
lbl115:
                                // 1 sources

                                while (true) {
                                    var7_5 ^= var8_4 ^ 1048992171;
                                    var8_4 = (var6_3 | var9_2) ^ -1329722839;
                                    break block78;
                                    break;
                                }
                                break;
                            }
                        }
                        var8_4 = (var6_3 | var9_2) ^ -468355113;
                        break block76;
lbl122:
                        // 1 sources

                        while (true) {
                            var7_5 ^= var8_4 ^ -502031380;
                            var8_4 = (var6_3 | var9_2) ^ -240265340;
                            break block76;
                            break;
                        }
lbl126:
                        // 1 sources

                        return;
                    }
                    block70: while (true) {
                        switch (var8_4) {
                            default: {
                                continue block70;
                            }
                            {
                                case 994854260: {
                                    ** continue;
                                }
                                case -1237635598: {
                                    ** continue;
                                }
                                case -1558321239: {
                                    ** continue;
                                }
                                case -675510156: {
                                    ** continue;
                                }
                                case 1900848384: {
                                    ** continue;
                                }
                                case 1474482998: {
                                    ** continue;
                                }
                                case -445869388: {
                                    ** continue;
                                }
                                case 1919951320: {
                                    ** continue;
                                }
                                ** case -1320014053:
lbl150:
                                // 1 sources

                                ** continue;
                            }
                        }
                        break;
                    }
                }
                block71: while (true) {
                    switch (var8_4) {
                        default: {
                            continue block71;
                        }
                        case 1680422027: {
                            ** continue;
                        }
                        case 1942768432: {
                            ** continue;
                        }
                        case 674610690: {
                            ** continue;
                        }
                        case -1355615597: {
                            ** continue;
                        }
                        case 430541384: {
                            ** continue;
                        }
                        case 2062630336: {
                            ** continue;
                        }
                        case 859746192: {
                            ** continue;
                        }
                        case 1544236715: {
                            ** continue;
                        }
                        ** case 1515039214:
lbl173:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            block72: while (true) {
                switch (var8_4) {
                    default: {
                        continue block72;
                    }
                    {
                        case 1679440999: {
                            ** continue;
                        }
                        case -1045550349: {
                            ** continue;
                        }
                    }
                    case 959964476: {
                        ** continue;
                    }
                    ** case 376542532:
lbl186:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        block73: while (true) {
            switch (var8_4) {
                default: {
                    continue block73;
                }
                case 259339797: {
                    ** continue;
                }
                case -1133382392: {
                    ** continue;
                }
                case -824999177: {
                    ** continue;
                }
                case -1583547651: {
                    ** continue;
                }
                case 1121642682: {
                    ** continue;
                }
                ** case 1466058985:
lbl203:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static String wN(String var0) {
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String wO(JsonObject var0, String var1_1, String var2_2) {
        var7_3 = -826262858;
        var4_4 = mn.a & -826262858 ^ 1302805077;
        var6_5 = 0;
        var5_6 = (var4_4 | var7_3) ^ 1917403716;
        var6_5 = (var4_4 | var7_3) ^ -324158192;
        ** GOTO lbl16
lbl-1000:
        // 1 sources

        {
            block17: {
                while (true) {
                    var6_5 = (var4_4 | var7_3) ^ 1758862966;
                    break block17;
                    break;
                }
lbl10:
                // 2 sources

                while (true) {
                    var6_5 = (var4_4 | var7_3) ^ -826190667;
                    break block17;
                    break;
                }
lbl13:
                // 2 sources

                while (true) {
                    var5_6 ^= -316066023;
                    return v0;
                }
            }
            block16: while (true) {
                switch (var6_5) {
                    default: {
                        continue block16;
                    }
                    case 592087015: {
                        ** continue;
                    }
                    case -1489951615: {
                        var5_6 ^= var6_5 ^ -610254639;
                        var6_5 = (var4_4 | var7_3) ^ 1147319976;
                        continue block16;
                    }
                    case -1954182049: {
                        if (!var0.has(var1_1)) ** GOTO lbl10
                        var6_5 = (var4_4 | var7_3) ^ 2039193261;
                        continue block16;
                    }
                    case -1234394022: {
                        var6_5 = (var4_4 | var7_3) ^ 94168088;
                        continue block16;
                    }
                    case -897851665: {
                        if (!var0.get(var1_1).isJsonNull()) ** break;
                        ** continue;
                        var6_5 = (var4_4 | var7_3) ^ -1140792863;
                        continue block16;
                    }
                    case 1944574742: {
                        var5_6 ^= var6_5 ^ -978745396;
                        var6_5 = (var4_4 | var7_3) ^ -1532430356;
                        continue block16;
                    }
                    case 1800391963: {
                        v0 = var0.get(var1_1).getAsString();
                        ** GOTO lbl13
                    }
                    case 19295810: {
                        var5_6 ^= var6_5 ^ -1217908072;
                        var6_5 = (var4_4 | var7_3) ^ -2132402084;
                        continue block16;
                    }
                    case 1325472427: 
                }
                break;
            }
            v0 = var2_2;
            ** continue;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static long wP(JsonObject var0, String var1_1, long var2_2) {
        var8_3 = -181238623;
        var5_4 = mn.a & -181238623 ^ -1799503567;
        var7_5 = 0;
        var6_6 = (var5_4 | var8_3) ^ 752357697;
        var7_5 = (var5_4 | var8_3) ^ -1926641991;
        ** GOTO lbl16
lbl-1000:
        // 1 sources

        {
            block15: {
                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ 1010501587;
                    break block15;
                    break;
                }
                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ 1696758193;
                    break block15;
                    break;
                }
lbl13:
                // 2 sources

                while (true) {
                    var6_6 ^= -237057933;
                    return v0;
                }
            }
            block14: while (true) {
                switch (var7_5) {
                    default: {
                        continue block14;
                    }
                    case 2023097096: {
                        ** continue;
                    }
                    case -914046366: {
                        var6_6 ^= var7_5 ^ -1621916290;
                        var7_5 = (var5_4 | var8_3) ^ 1431143186;
                        continue block14;
                    }
                    case -1594734941: {
                        if (!var0.has(var1_1)) ** continue;
                        var7_5 = (var5_4 | var8_3) ^ 693632359;
                        continue block14;
                    }
                    case -588760874: {
                        var6_6 ^= var7_5 ^ -711545467;
                        var7_5 = (var5_4 | var8_3) ^ -1523927123;
                        continue block14;
                    }
                    case 1351971356: {
                        v0 = Math.max(0L, var0.get(var1_1).getAsLong());
                        ** GOTO lbl13
                    }
                    case -1868710912: {
                        var6_6 ^= var7_5 ^ -1713165997;
                        var7_5 = (var5_4 | var8_3) ^ 2058871265;
                        continue block14;
                    }
                    case -1895291824: 
                }
                break;
            }
            v0 = var2_2;
            ** continue;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void wQ(String string) {
        int n2 = a & 0x7ABB0D6F ^ 0xA2BE99B4;
        int n3 = 0;
        int n4 = (n2 | 0x7ABB0D6F) ^ 0xDCAF63BA;
        n3 = (n2 | 0x7ABB0D6F) ^ 0xDEFE35BA;
        block5: while (true) {
            switch (n3) {
                case 1510596232: {
                    mn.wJ(string);
                    return;
                }
                case 608282693: {
                    n3 = (n2 | 0x7ABB0D6F) ^ 0x75E6891D;
                }
                default: {
                    continue block5;
                }
                case -1889987358: 
            }
            n4 ^= n3 ^ 0x5A175CA3;
            n3 = (n2 | 0x7ABB0D6F) ^ 0xA0B64377;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ Thread wR(Runnable var0) {
        block23: {
            block22: {
                block20: {
                    block24: {
                        block21: {
                            block19: {
                                var5_1 = -408844529;
                                var2_2 = mn.a & -408844529 ^ 690035287;
                                var4_3 = 0;
                                ** GOTO lbl23
lbl5:
                                // 1 sources

                                return var1_4;
lbl7:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -162180397;
                                    break block19;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -786852464;
                                    break block20;
                                    break;
                                }
                            }
lbl14:
                            // 4 sources

                            block14: while (true) {
                                switch (var4_3) {
                                    default: {
                                        continue block14;
                                    }
                                    case -543184370: {
                                        ** continue;
                                    }
lbl20:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ -1488460412;
                                        break block20;
                                        break;
                                    }
lbl23:
                                    // 1 sources

                                    var3_5 = (var2_2 | var5_1) ^ -1180496796;
                                    break block21;
                                    case 1355745485: {
                                        var3_5 ^= var4_3 ^ 1306055028;
                                        break block22;
                                    }
                                    case 435473804: {
                                        var1_4.setDaemon(true);
                                        break block23;
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        var1_4 = new Thread(var0, mn.h);
                                        break block24;
                                        break;
                                    }
lbl34:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= var4_3 ^ -1669573081;
                                        ** continue;
                                        break;
                                    }
                                    case 2010138320: {
                                        var3_5 ^= var4_3 ^ -1034064756;
                                        break block14;
                                    }
                                }
                                break;
                            }
                            ** while (true)
                        }
                        var4_3 = (var2_2 | var5_1) ^ -299905702;
                        break block20;
                    }
                    var4_3 = (var2_2 | var5_1) ^ -1737369201;
                    ** GOTO lbl14
                }
                block18: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block18;
                        }
                        case 29250053: {
                            ** continue;
                        }
                        case 1223064283: {
                            ** continue;
                        }
                        ** case 1052248783:
lbl57:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            var4_3 = (var2_2 | var5_1) ^ 809383249;
            ** GOTO lbl14
        }
        var4_3 = (var2_2 | var5_1) ^ -1083271278;
        ** while (true)
    }
}

