/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.av;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class jS {
    private static final String a;
    private static final /* synthetic */ String b;
    public static final int a;
    private static final int[] a;
    private static final /* synthetic */ String c;
    private static volatile av a;
    private static final ExecutorService a;
    private static final /* synthetic */ String d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private jS() {
        int n2 = a & 0xCF88CEF2 ^ 0x3B1C4E2D;
        int n3 = (n2 | 0xCF88CEF2) ^ 0xC29EA3D4;
        n3 ^= 0x1CC073DF;
        n3 ^= 0x328C1C2F;
    }

    /*
     * Exception decompiling
     */
    public static av get() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [47[UNCONDITIONALDOLOOP], 51[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
        block31: {
            block30: {
                break block31;
lbl1:
                // 1 sources

                while (true) {
                    var0_3 = "\u00ee\u0015\u00dd\u009dr\u0097z\u00ecp\u00b4\u00aa\u00de".getBytes("ISO-8859-1");
                    var6_6 ^= 1745275938;
                    break block30;
                    break;
                }
lbl5:
                // 1 sources

                while (true) {
                    var7_2 = var8_1 ^ 1619516734;
                    ** GOTO lbl60
                    break;
                }
            }
            var1_4 = var0_3.length / 4;
            var7_2 = var8_1 ^ 253400574;
            block23: while (true) {
                switch (var7_2) {
                    default: {
                        continue block23;
                    }
                    case -475665725: {
                        jS.a = new int[var1_4];
                        var7_2 = var8_1 ^ 553880350;
                        continue block23;
                    }
                    case 1499275757: {
                        var6_6 ^= var7_2 ^ -322572593;
                        var7_2 = var8_1 ^ -1243455792;
                        continue block23;
                    }
                    case 2000961293: {
                        var6_6 ^= var7_2 ^ 1420930556;
                        var7_2 = var8_1 ^ 205814190;
                        continue block23;
                    }
                    case 1510198717: 
                }
                break;
            }
            var3_7 = 0;
            var6_6 ^= 1614182713;
            var4_8 = 0;
            ** GOTO lbl-1000
lbl32:
            // 1 sources

            while (true) {
                var7_2 = var8_1 ^ 1476562596;
                if (true) ** GOTO lbl60
                break;
            }
        }
        var9 = 1596813172;
        var8_1 = 1447539731;
        jS.a = mK.a(MethodHandles.lookup().lookupClass(), -1188961029);
        var7_2 = 0;
        var6_6 = -1954755194;
        var7_2 = var8_1 ^ 47851679;
        block25: while (true) {
            switch (var7_2) {
                case 1419615372: {
                    var7_2 = var8_1 ^ -2015604579;
                }
                default: {
                    continue block25;
                }
                case -778312562: {
                    var6_6 ^= var7_2 ^ -1092652163;
                    break;
                }
                case 1705915606: {
                    var2_5 = (var6_6 | var7_2 ^ 870940869) ^ (var7_2 ^ 1124210665) ^ jS.a;
                    ** break;
lbl54:
                    // 1 sources

                    var6_6 ^= 1930649740;
                    ** continue;
                }
            }
            var7_2 = var8_1 ^ 870940869;
        }
        block26: while (true) {
            var7_2 = var8_1 ^ var9;
lbl60:
            // 3 sources

            block27: while (true) {
                switch (var7_2) {
                    case -1935763688: {
                        var6_6 ^= var7_2 ^ 1290259185;
                        ** GOTO lbl88
                    }
                    case 1587922790: {
                        var6_6 ^= var7_2 ^ 1081972137;
                        continue block26;
                    }
                    case 239418039: {
                        jS.a = Executors.newSingleThreadExecutor((ThreadFactory)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Runnable;)Ljava/lang/Thread;, ID(java.lang.Runnable ), (Ljava/lang/Runnable;)Ljava/lang/Thread;)());
                        return;
                    }
                    case 992457535: {
                        var6_6 ^= var7_2 ^ 1536666969;
                        ** break;
                    }
                    case -1533029190: {
                        jS.a[var4_8] = var5_9 ^= var2_5;
                        var7_2 = var8_1 ^ 1835009836;
                        ** GOTO lbl89
                    }
lbl78:
                    // 1 sources

                    var7_2 = var8_1 ^ 1358248028;
                    ** GOTO lbl89
                    case 112364623: {
                        var3_7 += 4;
                        if (++var4_8 >= var1_4) {
                            var7_2 = var8_1 ^ 149058421;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var5_9 = (var0_3[var3_7] & (((var6_6 ^= -1597422705) | var8_1) ^ -19136)) << ((var6_6 | var8_1) ^ -19033) | (var0_3[var3_7 + 1] & ((var6_6 | var8_1) ^ -19136)) << ((var6_6 | var8_1) ^ -19025) | (var0_3[var3_7 + 2] & ((var6_6 | var8_1) ^ -19136)) << ((var6_6 | var8_1) ^ -19017) | var0_3[var3_7 + 3] & ((var6_6 | var8_1) ^ -19136);
                            var7_2 = var8_1 ^ -623303925;
                        }
                        ** GOTO lbl89
                    }
lbl88:
                    // 1 sources

                    var7_2 = var8_1 ^ -220700503;
lbl89:
                    // 6 sources

                    default: {
                        continue block27;
                    }
                    case 157997927: {
                        jS.b = gj.decode("W4RTQW4lYvRJV28GHGXnHZEZ23VzGHZkkrY=", jS.IE((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -2145611999), var7_2 ^ var9 ^ ((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ 880884464))));
                        jS.c = gj.decode("9bbDzlRhkYmms5srl2tiSg==", jS.IE((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -2145612000), var7_2 ^ var9 ^ ((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ 570454352))));
                        jS.d = gj.decode("PZxJA6N8dRcgFmweggt8Gw==", jS.IE((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -2145611997), var7_2 ^ var9 ^ ((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ 1397278717))));
                        jS.a = jS.b;
                        ** continue;
                    }
                    case 918579501: 
                }
                break;
            }
            break;
        }
        var6_6 ^= var7_2 ^ -1410133085;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ Thread ID(Runnable var0) {
        block21: {
            block22: {
                block23: {
                    break block23;
lbl1:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 1708137768;
                        break block21;
                        break;
                    }
                }
                var5_1 = 155201108;
                var2_2 = jS.a & 155201108 ^ 1708840535;
                var4_3 = 0;
                var3_5 = (var2_2 | var5_1) ^ 1982225844;
                ** GOTO lbl43
lbl10:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_3 ^ -1552441599;
                    ** GOTO lbl41
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_3 ^ 585683838;
                    ** continue;
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_3 ^ -1280207808;
                    break block22;
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var1_4.setDaemon(true);
                    if (true) ** GOTO lbl36
                    break;
                }
            }
            var4_3 = (var2_2 | var5_1) ^ -1228600987;
            break block21;
            block16: while (true) {
                var4_3 = (var2_2 | var5_1) ^ -1372411217;
                block17: while (true) {
                    switch (var4_3) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block17;
                            }
                            break;
                        }
                        case -1008184072: {
                            ** continue;
                        }
lbl34:
                        // 1 sources

                        return var1_4;
lbl36:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 523596843;
                        break block21;
                        case 1234411880: {
                            var1_4 = new Thread(var0, jS.d);
                            break block16;
                        }
lbl41:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 608788287;
                        ** GOTO lbl-1000
lbl43:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -508145886;
                        ** continue;
                        case -1939033739: {
                            continue block16;
                        }
                    }
                    break;
                }
                break;
            }
            var4_3 = (var2_2 | var5_1) ^ 546077016;
        }
        block20: while (true) {
            switch (var4_3) {
                default: {
                    continue block20;
                }
                case 1297516303: {
                    ** continue;
                }
                case 1928301180: {
                    ** continue;
                }
                case 134931327: {
                    ** continue;
                }
                ** case -618662094:
lbl60:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    private static int IE(int n2, int n3) {
        int n4 = -1494447864;
        int n5 = 2071982110;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x216619A7)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xFFFFAB71;
        n6 ^= (n5 | n4) ^ 0xFFFF975F;
        n6 += (n5 | n4) ^ 0xFFFFC9D8;
        n6 += (n5 | n4) ^ 0xFFFFE84E;
        n6 += (n5 | n4) ^ 0xFFFF9868;
        n6 += (n5 | n4) ^ 0xFFFF09C5;
        return n6 += (n5 | n4) ^ 0xFFFF6329;
    }
}

