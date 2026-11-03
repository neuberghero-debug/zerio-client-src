/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import com.google.gson.Gson;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.fq;
import z.r.g;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class bd {
    private static final ConcurrentMap<String, fq> a;
    public static final int a;
    private static final String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final long a;
    private static final Gson a;
    private static final int[] a;
    private static final HttpClient a;
    private static final /* synthetic */ String e;
    private static final ConcurrentMap<String, Boolean> b;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final long b;

    /*
     * Enabled aggressive block sorting
     */
    private bd() {
        int n2 = a & 0xA33E5BA8 ^ 0xDEF76AF8;
        int n3 = (n2 | 0xA33E5BA8) ^ 0xC9A2B909;
        n3 ^= 0xD69BA187;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static Optional<UUID> uuidForName(String var0) {
        var9_1 = 123284701;
        var6_2 = bd.a & 123284701 ^ 1540013369;
        var8_3 = 0;
        var7_8 = (var6_2 | var9_1) ^ 533527445;
        var8_3 = (var6_2 | var9_1) ^ 335440955;
        if (true) ** GOTO lbl41
lbl7:
        // 1 sources

        while (true) {
            var8_3 = (var6_2 | var9_1) ^ -305357021;
            ** GOTO lbl135
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var7_8 ^= -594385049;
            var5_7 = (fq)bd.a.get(var2_5);
            var8_3 = (var6_2 | var9_1) ^ 772542528;
            ** GOTO lbl68
lbl15:
            // 1 sources

            while (true) {
                var8_3 = (var6_2 | var9_1) ^ -597253969;
                ** GOTO lbl68
                break;
            }
            break;
        }
        block38: while (true) {
            switch (var8_3) {
                case -936596820: {
                    var7_8 ^= var8_3 ^ -1924923822;
                    ** GOTO lbl47
                }
                case 1421948304: {
                    var1_4 = var0.strip();
                    ** break;
                }
                case -2132026683: {
                    var7_8 ^= var8_3 ^ -1783387421;
                    ** GOTO lbl45
                }
lbl29:
                // 1 sources

                var8_3 = (var6_2 | var9_1) ^ -1954450756;
                ** GOTO lbl135
                case 2096180164: {
                    var7_8 ^= var8_3 ^ 327574764;
                    var8_3 = (var6_2 | var9_1) ^ 673337215;
                    ** break;
                }
                case 1277546950: {
                    var8_3 = (var6_2 | var9_1) ^ 589993529;
                    continue block38;
                }
                case 2012869250: {
                    if (var0 != null) ** GOTO lbl43
                    var8_3 = (var6_2 | var9_1) ^ -550475976;
                }
lbl41:
                // 4 sources

                default: {
                    continue block38;
                }
lbl43:
                // 1 sources

                var8_3 = (var6_2 | var9_1) ^ -1745414319;
                continue block38;
lbl45:
                // 1 sources

                var8_3 = (var6_2 | var9_1) ^ -1407542952;
                continue block38;
lbl47:
                // 1 sources

                var8_3 = (var6_2 | var9_1) ^ 186288237;
                continue block38;
                case -205445979: 
            }
            break;
        }
        return Optional.empty();
lbl51:
        // 1 sources

        while (true) {
            var8_3 = (var6_2 | var9_1) ^ 109639345;
            ** GOTO lbl68
            break;
        }
lbl54:
        // 1 sources

        while (true) {
            var8_3 = (var6_2 | var9_1) ^ -668213238;
            ** GOTO lbl135
            break;
        }
lbl57:
        // 1 sources

        while (true) {
            var8_3 = (var6_2 | var9_1) ^ 1432694534;
            ** GOTO lbl68
            break;
        }
lbl60:
        // 1 sources

        while (true) {
            var8_3 = (var6_2 | var9_1) ^ 1111048325;
            ** GOTO lbl68
            break;
        }
lbl63:
        // 1 sources

        while (true) {
            var8_3 = (var6_2 | var9_1) ^ -1401726156;
            if (true) ** GOTO lbl68
            break;
        }
        block44: while (true) {
            var8_3 = (var6_2 | var9_1) ^ 578875985;
lbl68:
            // 7 sources

            block45: while (true) {
                switch (var8_3) {
                    case 1909960125: {
                        var7_8 ^= var8_3 ^ -246589240;
                        var8_3 = (var6_2 | var9_1) ^ 190503444;
                        continue block45;
                    }
                    case 2103136172: {
                        if (var5_7.uuid() == null) {
                            ** break;
                        }
                        ** GOTO lbl110
                    }
                    case 1417766889: {
                        if (var5_7 != null) ** GOTO lbl106
                        ** GOTO lbl99
                    }
                    case 1218148901: {
                        bd.qI(var1_4, var2_5);
                        ** continue;
                    }
lbl84:
                    // 1 sources

                    var8_3 = (var6_2 | var9_1) ^ 21854203;
                    ** GOTO lbl123
                    case -1519981288: {
                        var7_8 ^= var8_3 ^ -511237613;
                        ** continue;
                    }
                    case 180261627: {
                        var7_8 ^= var8_3 ^ 589356508;
                        ** continue;
                    }
                    case 1586940422: {
                        var7_8 ^= var8_3 ^ 1597099804;
                        var8_3 = (var6_2 | var9_1) ^ -1827018031;
                        ** GOTO lbl123
                    }
                    case 2082257948: {
                        var7_8 ^= var8_3 ^ 593815086;
                        continue block44;
                    }
lbl99:
                    // 1 sources

                    var8_3 = (var6_2 | var9_1) ^ -1447053880;
                    ** GOTO lbl123
                    case -161216459: {
                        var7_8 ^= var8_3 ^ -1187535139;
                        ** GOTO lbl125
                    }
                    case 1498630988: {
                        ** GOTO lbl108
                    }
lbl106:
                    // 1 sources

                    var8_3 = (var6_2 | var9_1) ^ 600244705;
                    ** GOTO lbl123
lbl108:
                    // 1 sources

                    var8_3 = (var6_2 | var9_1) ^ -554737606;
                    ** GOTO lbl123
lbl110:
                    // 1 sources

                    var8_3 = (var6_2 | var9_1) ^ 731341017;
                    ** GOTO lbl123
                    case -859678932: {
                        if (var5_7.stale(var3_6)) {
                            ** continue;
                        }
                        ** GOTO lbl122
                    }
                    case 1951194404: {
                        var7_8 ^= var8_3 ^ -1818492808;
                        ** continue;
                    }
                    case -2127241785: {
                        bd.qI(var1_4, var2_5);
                        ** break;
lbl122:
                        // 2 sources

                        var8_3 = (var6_2 | var9_1) ^ -88256283;
                    }
lbl123:
                    // 8 sources

                    default: {
                        continue block45;
                    }
lbl125:
                    // 1 sources

                    var8_3 = (var6_2 | var9_1) ^ 390121432;
                    continue block45;
                    case 501415288: {
                        return Optional.empty();
                    }
                    while (true) {
                        var8_3 = (var6_2 | var9_1) ^ -1920316947;
                        ** GOTO lbl135
                        break;
                    }
lbl132:
                    // 1 sources

                    while (true) {
                        var3_6 = System.currentTimeMillis();
                        ** continue;
                        break;
                    }
lbl135:
                    // 4 sources

                    block48: while (true) {
                        switch (var8_3) {
                            case -732246207: {
                                var7_8 ^= var8_3 ^ 727806840;
                                ** continue;
                            }
                            case -2014290441: {
                                if (var1_4.matches(bd.f)) ** continue;
                                ** break;
                            }
                            case -766381040: {
                                var7_8 ^= var8_3 ^ -840258952;
                                ** continue;
                            }
                            case -1510287005: {
                                var7_8 ^= var8_3 ^ 81531477;
                                var8_3 = (var6_2 | var9_1) ^ -749335676;
                            }
                            default: {
                                continue block48;
                            }
lbl151:
                            // 1 sources

                            var8_3 = (var6_2 | var9_1) ^ -98474850;
                            continue block48;
                            case -1307106594: {
                                var2_5 = var1_4.toLowerCase(Locale.ROOT);
                                var7_8 ^= -2035353576;
                                ** continue;
                            }
                            case -1936869767: 
                        }
                        break;
                    }
                    return Optional.empty();
                    case -2084758190: {
                        return Optional.of(var5_7.uuid());
                    }
                    case -207034679: 
                }
                break;
            }
            break;
        }
        return Optional.empty();
    }

    private static int qH(int n2, int n3) {
        int n4 = -2142762884;
        int n5 = -272575801;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x94FB240E)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xEFC8D20E;
        n6 -= (n5 | n4) ^ 0xEFC8C9BA;
        n6 -= (n5 | n4) ^ 0xEFC84FD0;
        n6 += (n5 | n4) ^ 0xEFC8C8CD;
        n6 ^= (n5 | n4) ^ 0xEFC899D4;
        n6 -= (n5 | n4) ^ 0xEFC8A494;
        n6 ^= (n5 | n4) ^ 0xEFC8CEDB;
        n6 ^= (n5 | n4) ^ 0xEFC85749;
        n6 ^= (n5 | n4) ^ 0xEFC86866;
        return n6 -= (n5 | n4) ^ 0xEFC80D39;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void qI(String var0, String var1_1) {
        var6_2 = -1176345273;
        var3_3 = bd.a & -1176345273 ^ 574471160;
        var5_4 = 0;
        var4_5 = (var3_3 | var6_2) ^ -243119946;
        var5_4 = (var3_3 | var6_2) ^ 602139927;
        if (true) ** GOTO lbl40
lbl7:
        // 1 sources

        while (true) {
            var4_5 ^= -38744490;
            var2_6 = HttpRequest.newBuilder(URI.create("https://api.mojang.com/users/profiles/minecraft/" + var0)).timeout(Duration.ofSeconds(v0 | (-8583021857020380400L >>> (var5_4 ^ -47704875) ^ (long)v1 & 0xFFFFFFFFL) << (var5_4 ^ -47704875))).header(bd.b, bd.c).header(bd.e, bd.g).GET().build();
            var5_4 = (var3_3 | var6_2) ^ -1308272042;
            block16: while (true) {
                switch (var5_4) {
                    default: {
                        continue block16;
                    }
                    case 438212346: {
                        HttpResponse.BodyHandlers.ofString();
                        var4_5 ^= 1780351565;
                        var4_5 ^= 782403627;
                        var4_5 ^= -373958798;
                        CompletableFuture.failedFuture(new IllegalStateException()).thenAccept((Consumer<HttpResponse>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, qM(java.lang.String java.net.http.HttpResponse ), (Ljava/net/http/HttpResponse;)V)((String)var1_1)).exceptionally((Function<Throwable, Void>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, qL(java.lang.String java.lang.Throwable ), (Ljava/lang/Throwable;)Ljava/lang/Void;)((String)var1_1)).whenComplete((BiConsumer<Void, Throwable>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, qK(java.lang.String java.lang.Void java.lang.Throwable ), (Ljava/lang/Void;Ljava/lang/Throwable;)V)((String)var1_1));
                        ** break;
                    }
                    case 205879410: {
                        var4_5 ^= var5_4 ^ -1349947334;
                        var5_4 = (var3_3 | var6_2) ^ -402257895;
                        continue block16;
                    }
                    case 167421353: {
                        var4_5 ^= var5_4 ^ -290815548;
                        var5_4 = (var3_3 | var6_2) ^ -1579063035;
                        continue block16;
                    }
lbl34:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ -1212512371;
                    continue block16;
                    case 1408890854: 
                }
                break;
            }
            return;
        }
        block17: while (true) {
            var5_4 = (var3_3 | var6_2) ^ -583796339;
lbl40:
            // 2 sources

            block18: while (true) {
                switch (var5_4) {
                    case 1512660873: {
                        var4_5 ^= var5_4 ^ 866122621;
                        var5_4 = (var3_3 | var6_2) ^ 796879576;
                        continue block18;
                    }
                    case -1742990616: {
                        var5_4 = (var3_3 | var6_2) ^ -506027914;
                        continue block18;
                    }
                    case -827618050: {
                        var4_5 ^= var5_4 ^ -292475752;
                        continue block17;
                    }
                    case -1326441610: {
                        var4_5 ^= var5_4 ^ 467268563;
                        var5_4 = (var3_3 | var6_2) ^ 1188555530;
                    }
                    default: {
                        continue block18;
                    }
                    case -47704843: {
                        v0 = -8583021857020380400L << (var5_4 ^ -47704875) >>> (var5_4 ^ -47704875) ^ (long)var4_5 & 0xFFFFFFFFL;
                        v1 = var4_5;
                        var4_5 ^= -298878475;
                        var4_5 ^= -1129850112;
                        var4_5 ^= -429822184;
                        var4_5 ^= -513633860;
                        ** continue;
                    }
                    case -1803512537: {
                        if (bd.b.putIfAbsent(var1_1, Boolean.TRUE) != null) {
                            var5_4 = (var3_3 | var6_2) ^ 1968468737;
                            continue block18;
                        }
                        var5_4 = (var3_3 | var6_2) ^ 185590921;
                        continue block18;
                    }
                    case 1724647026: 
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
    static {
        var10 = -700514865;
        var9_1 = -1872619724;
        var8_2 = 1180494555;
        bd.a = mK.a(MethodHandles.lookup().lookupClass(), 1987997645);
        var7_3 = 0;
        var6_10 = -371344094;
        var7_3 = var9_1 ^ 159730627;
        if (true) ** GOTO lbl95
        block36: while (true) {
            switch (var7_3) {
                case -1624742297: {
                    bd.a = new Gson();
                    var7_3 = var9_1 ^ -493773245;
                    ** GOTO lbl85
                }
                case -463142669: {
                    var6_10 ^= var7_3 ^ -1513560665;
                    var7_3 = var9_1 ^ -2022931393;
                    ** GOTO lbl85
                }
                case 386831115: {
                    bd.a[var4_8] = var5_9 ^= var2_6;
                    ** GOTO lbl77
                }
                case 1937801562: {
                    var6_10 ^= var7_3 ^ 203347337;
                    ** GOTO lbl75
                }
                case 473785988: {
                    var6_10 ^= var7_3 ^ 2030426252;
                    ** break;
                }
                case -963060813: {
                    bd.a = new ConcurrentHashMap<String, fq>();
                    ** GOTO lbl81
                }
                case 15859581: {
                    v0 = 5589710945599530104L << (var7_3 ^ 15859549) >>> (var7_3 ^ 15859549) ^ (long)var6_10 & 0xFFFFFFFFL | (5589710945599530104L >>> (var7_3 ^ 15859549) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ 15859549);
                    var6_10 ^= 925483101;
                    ** break;
                }
                case -700514833: {
                    bd.b = -3246428169049813721L << (var7_3 ^ var10) >>> (var7_3 ^ var10) ^ (long)var6_10 & 0xFFFFFFFFL | (-3246428169049813721L >>> (var7_3 ^ var10) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ var10);
                    bd.a = -3246428169050102689L << (var7_3 ^ var10) >>> (var7_3 ^ var10) ^ (long)var6_10 & 0xFFFFFFFFL | (-3246428169050102689L >>> (var7_3 ^ var10) ^ (long)var6_10 & 0xFFFFFFFFL) << (var7_3 ^ var10);
                    bd.d = gj.decode("+74abbqSD9Uq58DOqw9+4v1mv69JiD9cpKatqado72KVZVyntAA6FTaXq42lABLy", bd.qH((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 2147441889), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -1521379991))));
                    bd.f = gj.decode("XmJqbwsi8eLHHNqiuoQUE+KU", bd.qH((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 2147441888), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 2110062306))));
                    bd.b = gj.decode("WwKQq54Lw95jIg==", bd.qH((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 2147441891), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 734890122))));
                    bd.c = gj.decode("SS8+WQXwW2qaICDCphnKuRGjfp9CL2vuSUBjANisbitXabnM0PsfHca+O9uudNs=", bd.qH((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 2147441890), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 1764731266))));
                    bd.e = gj.decode("EV1JG/JO", bd.qH((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 2147441893), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ -273582289))));
                    bd.g = gj.decode("zepgI2zeRFIv8VBrgbqRIA==", bd.qH((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 2147441892), var7_3 ^ var8_2 ^ ((var6_10 | var7_3 ^ var8_2) ^ (var7_3 ^ 737047695))));
                    bd.a = bd.d;
                    ** GOTO lbl73
                }
lbl49:
                // 1 sources

                var6_10 ^= -980553358;
                ** GOTO lbl83
                case 1208658799: {
                    var6_10 ^= var7_3 ^ -1359346490;
                    var7_3 = var9_1 ^ var8_2;
                    ** GOTO lbl85
                }
                case 1928563063: {
                    var6_10 ^= var7_3 ^ -234258189;
                    var7_3 = var9_1 ^ -1869354935;
                    ** GOTO lbl85
                }
                case 1509013272: {
                    var6_10 ^= var7_3 ^ 1181434918;
                    ** GOTO lbl79
                }
lbl62:
                // 1 sources

                var7_3 = var9_1 ^ -1288672873;
                continue block36;
                case 592608931: {
                    var3_7 += 4;
                    if (++var4_8 < var1_5) ** GOTO lbl152
                    var7_3 = var9_1 ^ -664224677;
                    ** GOTO lbl85
                }
                case 58116123: {
                    var6_10 ^= var7_3 ^ -1668297309;
                    var7_3 = var9_1 ^ 1459276935;
                    continue block36;
                }
lbl73:
                // 1 sources

                var7_3 = var9_1 ^ -913072084;
                continue block36;
lbl75:
                // 1 sources

                var7_3 = var9_1 ^ 811780537;
                continue block36;
lbl77:
                // 1 sources

                var7_3 = var9_1 ^ -1939902032;
                continue block36;
lbl79:
                // 1 sources

                var7_3 = var9_1 ^ 256536915;
                continue block36;
lbl81:
                // 1 sources

                var7_3 = var9_1 ^ -471689618;
                continue block36;
lbl83:
                // 1 sources

                bd.a = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(v0)).build();
                var7_3 = var9_1 ^ -1827348689;
lbl85:
                // 8 sources

                while (true) {
                    default: {
                        continue block36;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    var6_10 ^= -1260262735;
                    var0_4 = "o#\u00ac\u009b\u00f1\u0082K\u00ef\u00d0\u00c8>\u00bf\u00a52D\u00fd\u00cf\u00c7.\u0080<\b;\u0015\u00fc\u00a4\u00bc,nE\u00e1\u0082<\u00f3\u00fdt\u0001\u00f4\u009b\u00c3\u0090\u00ec\u00e1\u008fC\u00e2\u00a1\u009a\u00ec\u00bc\u00b6\u00df\u0095\u00b2\u00f4V".getBytes("ISO-8859-1");
                    var6_10 ^= 1391191779;
                    var1_5 = var0_4.length / 4;
                    var7_3 = var9_1 ^ -472407620;
                    if (true) ** GOTO lbl149
                    break;
                }
lbl95:
                // 1 sources

                block39: while (true) {
                    switch (var7_3) {
                        case -1712890633: {
                            var7_3 = var9_1 ^ 899996458;
                        }
                        default: {
                            continue block39;
                        }
                        case -1513698274: {
                            var6_10 ^= var7_3 ^ 1045485304;
                            var7_3 = var9_1 ^ 571443603;
                            continue block39;
                        }
                        case -1301438809: 
                    }
                    break;
                }
                var2_6 = (var6_10 | var7_3 ^ 571443603) ^ (var7_3 ^ -1092053784) ^ bd.a;
                ** continue;
                block40: while (true) {
                    switch (var7_3) {
                        case -1473578336: {
                            var6_10 ^= var7_3 ^ -618317523;
                            ** GOTO lbl148
                        }
                        case 1264119441: {
                            bd.a = new int[var1_5];
                            ** GOTO lbl144
                        }
                        case 765424795: {
                            var6_10 ^= var7_3 ^ -2038401230;
                            var7_3 = var9_1 ^ 1036298305;
                            break;
                        }
                        case -539910175: {
                            var6_10 ^= var7_3 ^ -1465381745;
                            ** GOTO lbl-1000
                        }
                        case -695621216: {
                            var7_3 = var9_1 ^ -616891995;
                            continue block40;
                        }
                        case -1381580939: {
                            var3_7 = 0;
                            break block40;
                        }
                        case 1941288584: lbl-1000:
                        // 2 sources

                        {
                            var7_3 = var9_1 ^ -933789175;
                            break;
                        }
                        case 1479906621: {
                            switch (var6_10) {
                                case 558726007: {
                                    var7_3 = var9_1 ^ 944303508;
                                    break;
                                }
                                case -1807635562: {
                                    var7_3 = var9_1 ^ 374220618;
                                    break;
                                }
                                default: {
                                    var7_3 = var9_1 ^ 1337166037;
                                    break;
                                }
                            }
                            break;
                        }
lbl144:
                        // 1 sources

                        var7_3 = var9_1 ^ -1107467345;
                        break;
                        case -2043924354: {
                            var6_10 ^= var7_3 ^ -1840939459;
lbl148:
                            // 2 sources

                            var7_3 = var9_1 ^ 1189854868;
                        }
                    }
lbl149:
                    // 7 sources

                }
                var6_10 ^= 523573010;
                var4_8 = 0;
lbl152:
                // 2 sources

                var5_9 = (var0_4[var3_7] & (((var6_10 ^= 613768028) | var9_1) ^ -1862811703)) << ((var6_10 | var9_1) ^ -1862811858) | (var0_4[var3_7 + 1] & ((var6_10 | var9_1) ^ -1862811703)) << ((var6_10 | var9_1) ^ -1862811866) | (var0_4[var3_7 + 2] & ((var6_10 | var9_1) ^ -1862811703)) << ((var6_10 | var9_1) ^ -1862811842) | var0_4[var3_7 + 3] & ((var6_10 | var9_1) ^ -1862811703);
                var7_3 = var9_1 ^ 1946621895;
                ** continue;
                case -1610555763: 
            }
            break;
        }
        bd.b = new ConcurrentHashMap<K, V>();
    }

    /*
     * Unable to fully structure code
     */
    private static UUID qJ(g var0) {
        block27: {
            block28: {
                var5_1 = 1489378349;
                var2_2 = bd.a & 1489378349 ^ -24626645;
                var4_3 = 0;
                var3_4 = (var2_2 | var5_1) ^ -2031394327;
                var4_3 = (var2_2 | var5_1) ^ -1629368432;
                break block27;
lbl7:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 994965550;
                    break block27;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ -110082996;
                    var4_3 = (var2_2 | var5_1) ^ 1711103863;
                    break block27;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    if (var0 == null) ** GOTO lbl30
                    var4_3 = (var2_2 | var5_1) ^ -220589564;
                    break block27;
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -39299986;
                    break block27;
                    break;
                }
lbl21:
                // 1 sources

                while (true) {
                    if (var0.id() == null) ** GOTO lbl30
                    var4_3 = (var2_2 | var5_1) ^ 378059499;
                    break block27;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -93588080;
                    break block27;
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    if (var0.id().length() == bd.qH((var3_4 | var4_3 ^ 1550047122) ^ (var4_3 ^ 591456481), (var2_2 | var4_3 ^ 1550047122) ^ ((var3_4 | var4_3 ^ 1550047122) ^ (var4_3 ^ -19632378)))) break block28;
lbl30:
                    // 3 sources

                    var4_3 = (var2_2 | var5_1) ^ 1188112028;
                    break block27;
                    break;
                }
lbl32:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ -510454215;
                    var4_3 = (var2_2 | var5_1) ^ 1355644128;
                    break block27;
                    break;
                }
lbl36:
                // 1 sources

                return null;
            }
            try {
                var4_3 = (var2_2 | var5_1) ^ 1468725770;
                break block27;
lbl42:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ 729474726;
                    var4_3 = (var2_2 | var5_1) ^ 1113217909;
                    break block27;
                    break;
                }
lbl46:
                // 1 sources

                while (true) {
                    v0 = new UUID(Long.parseUnsignedLong(var0.id().substring(0, bd.qH(((var3_4 ^= 659270279) | var5_1) ^ -2099993761, (var2_2 | var5_1) ^ ((var3_4 | var5_1) ^ -1042168868))), bd.qH((var3_4 | var5_1) ^ -2099993764, (var2_2 | var5_1) ^ ((var3_4 | var5_1) ^ -525617521))), Long.parseUnsignedLong(var0.id().substring(bd.qH(((var3_4 ^= 1641534172) | var5_1) ^ -1547345523, (var2_2 | var5_1) ^ ((var3_4 | var5_1) ^ -1270870500))), bd.qH((var3_4 | var5_1) ^ -1547345526, (var2_2 | var5_1) ^ ((var3_4 | var5_1) ^ -558537626))));
                    var3_4 ^= -458958557;
                    return v0;
                }
            }
            catch (NumberFormatException v1) {
                var3_4 = (var2_2 | var5_1) ^ -1760306405;
                var1_5 = v1;
                var3_4 ^= 1870729601;
                return null;
            }
        }
        block26: while (true) {
            switch (var4_3) {
                default: {
                    continue block26;
                }
                case 1613754815: {
                    ** continue;
                }
                case -981219839: {
                    ** continue;
                }
                case -1691131560: {
                    ** continue;
                }
                case 202648619: {
                    ** continue;
                }
                case 57043521: {
                    ** continue;
                }
                case -398031676: {
                    ** continue;
                }
                case 77974463: {
                    ** continue;
                }
                case -1205921613: {
                    ** continue;
                }
                case -1375518001: {
                    ** continue;
                }
                {
                    case -1455111131: {
                        ** continue;
                    }
                    ** case -1131125414:
lbl81:
                    // 1 sources

                    ** continue;
                }
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void clear() {
        int n2 = -1451593738;
        int n3 = a & 0xA97A6FF6 ^ 0xFEB36C4;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xCE8AABE9;
        n4 = (n3 | n2) ^ 0xD4028731;
        block9: while (true) {
            switch (n4) {
                case -45296629: {
                    n5 ^= n4 ^ 0x9070A633;
                    n4 = (n3 | n2) ^ 0xA0C45A2A;
                    continue block9;
                }
                case 2079979719: {
                    n4 = (n3 | n2) ^ 0x79A36D41;
                    break;
                }
                case 1060927290: {
                    a.clear();
                    n4 = (n3 | n2) ^ 0x3AC24F81;
                    break;
                }
                case -698871113: {
                    n5 ^= n4 ^ 0x25419A50;
                    n4 = (n3 | n2) ^ 0x90C708CC;
                    break;
                }
                case -1791414153: {
                    n5 ^= n4 ^ 0x1E4F040B;
                    n4 = (n3 | n2) ^ 0xA64C02D0;
                    break;
                }
                case 255796700: {
                    return;
                }
                case 163020070: {
                    b.clear();
                    n4 = (n3 | n2) ^ 0x52B7ABFD;
                }
            }
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void qK(String var0, Void var1_1, Throwable var2_2) {
        var3_3 = bd.a & 844954642 ^ 1885516087;
        var5_4 = 0;
        var4_5 = (var3_3 | 844954642) ^ -84678244;
        var5_4 = (var3_3 | 844954642) ^ 995399709;
        if (true) ** GOTO lbl-1000
        block5: while (true) {
            switch (var5_4) lbl-1000:
            // 2 sources

            {
                default: {
                    continue block5;
                }
                case -117474603: {
                    var4_5 ^= var5_4 ^ 1448780793;
                    var5_4 = (var3_3 | 844954642) ^ -634836878;
                    continue block5;
                }
                case 1227515178: {
                    var5_4 = (var3_3 | 844954642) ^ -1971222558;
                    continue block5;
                }
                case -1470638779: 
            }
            break;
        }
        bd.b.remove(var0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Void qL(String string, Throwable throwable) {
        int n2 = 317417036;
        int n3 = a & 0x12EB664C ^ 0xBDC813FA;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xFA788729;
        n4 = (n3 | n2) ^ 0xE3FE6F22;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1454731230: {
                    n5 ^= n4 ^ 0xA8CF0758;
                    n4 = (n3 | n2) ^ 0x2F092308;
                    continue block7;
                }
                case 1544886492: {
                    n4 = (n3 | n2) ^ 0x88A022BB;
                    continue block7;
                }
                case -1864215306: {
                    return null;
                }
                case 927683909: {
                    n5 ^= n4 ^ 0xFF0DF27D;
                    n4 = (n3 | n2) ^ 0x6B5640AF;
                    continue block7;
                }
                case -725797039: 
            }
            a.put(string, new fq(null, System.currentTimeMillis() + (-8226572457933968009L << (n4 ^ 0xD4BD3771) >>> (n4 ^ 0xD4BD3771) ^ (long)n5 & 0xFFFFFFFFL | (-8226572457933968009L >>> (n4 ^ 0xD4BD3771) ^ (long)n5 & 0xFFFFFFFFL) << (n4 ^ 0xD4BD3771))));
            n4 = (n3 | n2) ^ 0x16A1E7DC;
        }
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void qM(String var0, HttpResponse var1_1) {
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
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

