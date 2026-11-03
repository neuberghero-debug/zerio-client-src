/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.LambdaMetafactory;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.jar.JarFile;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.hM;
import z.r.ic;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class jP {
    private static final String[] a;
    public static final int b;
    private static final List<ic> a;
    private static final Object[] a;
    static final String a;
    private static final int[] a;
    private static final String b;
    private static final int a;
    private static final long a;
    private static final HttpClient a;

    /*
     * Enabled aggressive block sorting
     */
    private jP() {
        int n2 = b & 0x83DD28D1 ^ 0x465CADCB;
        int n3 = (n2 | 0x83DD28D1) ^ 0xC3734B1E;
        n3 ^= 0x204F9F73;
        n3 ^= 0xA5143EE;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static List<ic> recommendations() {
        var0 = jP.b & 1580391684 ^ 1656327135;
        var2_1 = 0;
        var1_2 = (var0 | 1580391684) ^ 971433184;
        var2_1 = (var0 | 1580391684) ^ 196351532;
        block5: while (true) {
            switch (var2_1) {
                case 1963969011: {
                    var2_1 = (var0 | 1580391684) ^ 1877353469;
                    ** break;
                }
                case 291372066: {
                    var1_2 ^= var2_1 ^ 1892113719;
                    var2_1 = (var0 | 1580391684) ^ 907153589;
                }
lbl13:
                // 3 sources

                default: {
                    continue block5;
                }
                case 1219088234: 
            }
            break;
        }
        return jP.a;
    }

    /*
     * Exception decompiling
     */
    static Map<String, String> installedFabricMods(Path var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [75[UNCONDITIONALDOLOOP]], but top level block is 76[UNCONDITIONALDOLOOP]
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

    private static int a(int n2, int n3) {
        int n4 = -1871897749;
        int n5 = -2112254556;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x9FE8E2D8)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x927DD111;
        n6 ^= (n5 | n4) ^ 0x927DE09D;
        n6 ^= (n5 | n4) ^ 0x927DD132;
        n6 += (n5 | n4) ^ 0x927D124C;
        n6 += (n5 | n4) ^ 0x927D7CA7;
        n6 -= (n5 | n4) ^ 0x927D330E;
        n6 += (n5 | n4) ^ 0x927D934B;
        n6 += (n5 | n4) ^ 0x927D1B7C;
        return n6 += (n5 | n4) ^ 0x927DD638;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static String installedVersion(ic var0, Map<String, String> var1_1) {
        block29: {
            block28: {
                var8_2 = 896500577;
                var5_3 = jP.b & 896500577 ^ -1849019040;
                var7_4 = 0;
                var6_8 = (var5_3 | var8_2) ^ -1069709521;
                var7_4 = (var5_3 | var8_2) ^ -510338091;
                break block28;
lbl7:
                // 2 sources

                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ 1526474631;
                    ** GOTO lbl56
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ -1202417028;
                    break block28;
                    break;
                }
                while (true) {
                    break block29;
                    break;
                }
                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ -744809519;
                    ** GOTO lbl56
                    break;
                }
            }
            block25: while (true) {
                switch (var7_4) {
                    default: {
                        continue block25;
                    }
                    case 230368541: {
                        var2_5 = var0.a.iterator();
                        ** GOTO lbl7
                    }
                    case 1417374900: {
                        var7_4 = (var5_3 | var8_2) ^ 580203265;
                        continue block25;
                    }
                    case -1753578400: 
                }
                break;
            }
            var6_8 ^= var7_4 ^ 179858145;
            ** while (true)
        }
        var7_4 = (var5_3 | var8_2) ^ -1983131493;
        block26: while (true) {
            switch (var7_4) {
                case -2048732197: {
                    ** continue;
                }
                case 1094179484: {
                    var6_8 ^= var7_4 ^ -1243396737;
                    ** break;
                }
                case 1009018874: {
                    var6_8 ^= var7_4 ^ -1067850849;
                    var7_4 = (var5_3 | var8_2) ^ 806184122;
                    continue block26;
                }
                case -1632431931: {
                    if (var4_7 == null) ** continue;
                    var7_4 = (var5_3 | var8_2) ^ 1407579322;
                    continue block26;
                }
lbl49:
                // 1 sources

                var7_4 = (var5_3 | var8_2) ^ 727492516;
                default: {
                    continue block26;
                }
                case -435534885: {
                    var6_8 ^= var7_4 ^ 1014492556;
                    var7_4 = (var5_3 | var8_2) ^ -1545939460;
                    continue block26;
                }
lbl56:
                // 2 sources

                block27: while (true) {
                    switch (var7_4) {
                        case 1896558985: {
                            var6_8 ^= var7_4 ^ -710979183;
                            ** break;
                        }
                        case 1718922416: {
                            var6_8 ^= var7_4 ^ -1880696471;
                            var7_4 = (var5_3 | var8_2) ^ -660693782;
                            continue block27;
                        }
                        case -1891100164: {
                            if (!var2_5.hasNext()) ** continue;
                            var7_4 = (var5_3 | var8_2) ^ -991656216;
                        }
                        default: {
                            continue block27;
                        }
                        case -283930394: {
                            var6_8 ^= var7_4 ^ -626194482;
                            ** GOTO lbl75
                        }
lbl73:
                        // 1 sources

                        var7_4 = (var5_3 | var8_2) ^ 1929071700;
                        continue block27;
lbl75:
                        // 1 sources

                        var7_4 = (var5_3 | var8_2) ^ 984067741;
                        continue block27;
                        case -954926283: {
                            var3_6 = (String)var2_5.next();
                            var6_8 ^= -1719407434;
                            var4_7 = var1_1.get(var3_6);
                            var7_4 = (var5_3 | var8_2) ^ -187142659;
                            continue block26;
                        }
                        case 1836133259: 
                    }
                    break;
                }
                return null;
                case 372597405: 
            }
            break;
        }
        return var4_7;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static hM resolveLatest(ic var0) throws Exception {
        block228: {
            var24_1 = -1839153739;
            var23_2 = 1944469218;
            var17_3 = jP.b & 1944469218 ^ -1495826089;
            var22_4 = 0;
            var21_19 = (var17_3 | var23_2) ^ -111145915;
            var22_4 = (var17_3 | var23_2) ^ 500145159;
            break block228;
lbl8:
            // 2 sources

            while (true) {
                var22_4 = (var17_3 | var23_2) ^ -2074449556;
                ** GOTO lbl403
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                var22_4 = (var17_3 | var23_2) ^ -1279932968;
                ** GOTO lbl642
lbl14:
                // 1 sources

                while (true) {
                    var21_19 ^= -1890170364;
                    var7_11.sort(Comparator.comparingInt((ToIntFunction<JsonObject>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)I, releaseRank(com.google.gson.JsonObject ), (Lcom/google/gson/JsonObject;)I)()).thenComparing((Function<JsonObject, Instant>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, publishedAt(com.google.gson.JsonObject ), (Lcom/google/gson/JsonObject;)Ljava/time/Instant;)()).reversed());
                    var22_4 = (var17_3 | var23_2) ^ 918216623;
                    ** GOTO lbl202
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var21_19 ^= -962209075;
                    var11_20 = var9_13.iterator();
                    ** GOTO lbl75
                    break;
                }
lbl23:
                // 1 sources

                while (true) {
                    var22_4 = (var17_3 | var23_2) ^ 1369514855;
                    ** GOTO lbl149
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var22_4 = (var17_3 | var23_2) ^ 774922998;
                    ** GOTO lbl403
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    var22_4 = (var17_3 | var23_2) ^ -770279999;
                    ** GOTO lbl613
                    break;
                }
lbl32:
                // 1 sources

                while (true) {
                    var22_4 = (var17_3 | var23_2) ^ 2072737028;
                    ** GOTO lbl561
lbl35:
                    // 1 sources

                    while (true) {
                        var22_4 = (var17_3 | var23_2) ^ 639219411;
                        ** GOTO lbl149
                        break;
                    }
lbl38:
                    // 1 sources

                    while (true) {
                        var22_4 = (var17_3 | var23_2) ^ -547262152;
                        ** GOTO lbl561
                        break;
                    }
                    break;
                }
lbl41:
                // 1 sources

                block150: while (true) {
                    block230: {
                        block231: {
                            block229: {
                                switch (var22_4) {
                                    default: {
                                        continue block150;
                                    }
                                    case 1952562389: {
                                        var21_19 ^= var22_4 ^ -936173888;
                                        break block229;
                                    }
                                    case 1627537410: {
                                        if (var13_22.has(jP.a((var21_19 | var22_4 ^ 316964576) ^ (var22_4 ^ 463804295), (var17_3 | var22_4 ^ 316964576) ^ ((var21_19 | var22_4 ^ 316964576) ^ (var22_4 ^ -1602093034))))) {
                                            ** break;
                                        }
                                        break block230;
                                    }
                                    case -1422608788: {
                                        var21_19 ^= var22_4 ^ 126073988;
                                        ** GOTO lbl68
                                    }
lbl55:
                                    // 1 sources

                                    var22_4 = (var17_3 | var23_2) ^ -1047491868;
                                    continue block150;
                                    case -1682865398: {
                                        if (var13_22.get(jP.a((var21_19 | var22_4 ^ -396902936) ^ (var22_4 ^ -518597492), (var17_3 | var22_4 ^ -396902936) ^ ((var21_19 | var22_4 ^ -396902936) ^ (var22_4 ^ 791855902)))).getAsBoolean()) {
                                            var22_4 = (var17_3 | var23_2) ^ -1387730277;
                                            continue block150;
                                        }
                                        break block230;
                                    }
                                    case 1522488684: {
                                        var21_19 ^= var22_4 ^ 1153805813;
                                        break block231;
                                    }
                                    case 912733459: {
                                        var22_4 = (var17_3 | var23_2) ^ 1816542461;
                                        continue block150;
                                    }
lbl68:
                                    // 1 sources

                                    var22_4 = (var17_3 | var23_2) ^ -1762263051;
                                    continue block150;
                                    case -1503542554: {
                                        var10_14 = var13_22;
                                        var21_19 ^= 1423220136;
                                        ** GOTO lbl325
                                    }
                                    case 605236746: 
                                }
lbl75:
                                // 2 sources

                                var22_4 = (var17_3 | var23_2) ^ -474550796;
                                ** GOTO lbl332
                            }
                            var22_4 = (var17_3 | var23_2) ^ -739995139;
                            continue;
                        }
                        var22_4 = (var17_3 | var23_2) ^ 1368816913;
                        continue;
                    }
                    var22_4 = (var17_3 | var23_2) ^ -2087320798;
                    continue;
                    break;
                }
lbl86:
                // 1 sources

                while (true) {
                    var22_4 = (var17_3 | var23_2) ^ 348126883;
                    ** GOTO lbl149
                    break;
                }
                while (true) {
                    var22_4 = (var17_3 | var23_2) ^ 387397295;
                    ** GOTO lbl461
                    break;
                }
lbl92:
                // 1 sources

                while (true) {
                    var22_4 = (var17_3 | var23_2) ^ 1802242337;
                    ** GOTO lbl262
                    break;
                }
lbl95:
                // 1 sources

                while (true) {
                    var22_4 = (var17_3 | var23_2) ^ 1491088129;
                    ** GOTO lbl597
                    break;
                }
lbl98:
                // 2 sources

                while (true) {
                    var21_19 ^= -2047897654;
                    var14_23 = v0;
                    var22_4 = (var17_3 | var23_2) ^ -437715602;
                    ** GOTO lbl481
                    break;
                }
                break;
            }
lbl103:
            // 1 sources

            while (true) {
                var21_19 ^= 97071095;
                HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8);
                var5_9 = null;
                var22_4 = (var17_3 | var23_2) ^ -744979709;
                ** GOTO lbl642
                break;
            }
lbl112:
            // 1 sources

            while (true) {
                v1 = 5638363046649756997L << 32 >>> 32 ^ (long)(var21_19 ^= -636587784) & 0xFFFFFFFFL;
                v2 = v1 | (5638363046649756997L >>> 32 ^ (long)var21_19 & 0xFFFFFFFFL) << 32;
                v3 = var21_19 ^= 1344167730;
                v4 = var21_19;
                v5 = var21_19;
                v6 = var21_19;
                v7 = var21_19 ^= -1830145630;
                v8 = var21_19;
                v9 = var21_19;
                v10 = var21_19;
                var21_19 ^= 1191462739;
                var21_19 ^= 228099579;
                var21_19 ^= -548440909;
                var4_8 = HttpRequest.newBuilder(var3_7).timeout(Duration.ofSeconds(v2)).header(jP.a((v3 | var23_2) ^ -156789104, (var17_3 | var23_2) ^ ((v4 | var23_2) ^ 1195737364)), jP.a((v5 | var23_2) ^ -156789103, (var17_3 | var23_2) ^ ((v6 | var23_2) ^ 1004241172))).header(jP.a((v7 | var23_2) ^ 1991219090, (var17_3 | var23_2) ^ ((v8 | var23_2) ^ 1467580436)), jP.a((v9 | var23_2) ^ 1991219091, (var17_3 | var23_2) ^ ((v10 | var23_2) ^ -1323597804))).GET().build();
                ** continue;
                break;
            }
            while (true) {
                var22_4 = (var17_3 | var23_2) ^ -307907987;
                ** GOTO lbl377
                break;
            }
lbl132:
            // 1 sources

            while (true) {
                var22_4 = (var17_3 | var23_2) ^ -1454165197;
                break block228;
                break;
            }
lbl135:
            // 1 sources

            while (true) {
                var22_4 = (var17_3 | var23_2) ^ -2121819189;
                ** GOTO lbl377
                break;
            }
lbl138:
            // 1 sources

            while (true) {
                var22_4 = (var17_3 | var23_2) ^ 1400572769;
                ** GOTO lbl219
                break;
            }
lbl141:
            // 1 sources

            while (true) {
                var22_4 = (var17_3 | var23_2) ^ 1306685855;
                ** GOTO lbl377
                break;
            }
lbl144:
            // 1 sources

            while (true) {
                var22_4 = (var17_3 | var23_2) ^ -1510172589;
                if (true) ** GOTO lbl461
                break;
            }
            block164: while (true) {
                var22_4 = (var17_3 | var23_2) ^ -806608844;
lbl149:
                // 4 sources

                block165: while (true) {
                    switch (var22_4) {
                        case -566698966: {
                            if (var7_11.isEmpty()) {
                                continue block164;
                            }
                            ** GOTO lbl167
                        }
                        case 941334467: {
                            var21_19 ^= var22_4 ^ -1777067020;
                            ** GOTO lbl169
                        }
                        case -1051893672: {
                            var21_19 ^= var22_4 ^ 1904491930;
                            ** GOTO lbl186
                        }
                        case -1504273264: {
                            var21_19 ^= 475891353;
                            ** GOTO lbl192
                        }
                        case -1136619585: {
                            var21_19 ^= var22_4 ^ 731218316;
                            ** continue;
                        }
lbl167:
                        // 1 sources

                        var22_4 = (var17_3 | var23_2) ^ 1270296648;
                        ** GOTO lbl202
lbl169:
                        // 1 sources

                        var22_4 = (var17_3 | var23_2) ^ -1220970873;
                        ** GOTO lbl202
                        case -772929244: {
                            var21_19 ^= var22_4 ^ -170990865;
                            ** continue;
                        }
                        case -481803948: {
                            var9_13 = (JsonElement)var8_12.next();
                            ** GOTO lbl200
                        }
                        case -908056844: {
                            var21_19 ^= var22_4 ^ 548543886;
                            var22_4 = (var17_3 | var23_2) ^ -1216190326;
                            ** GOTO lbl202
                        }
                        case -870161870: {
                            var8_12 = (JsonObject)var7_11.get(0);
                            var9_13 = var8_12.getAsJsonArray(jP.a(((var21_19 ^= -1800916582) | var23_2) ^ -156346481, (var17_3 | var23_2) ^ ((var21_19 | var23_2) ^ 1285636096)));
                            var22_4 = (var17_3 | var23_2) ^ 1832625357;
                            ** GOTO lbl403
                        }
lbl186:
                        // 1 sources

                        var22_4 = (var17_3 | var23_2) ^ 1003871685;
                        ** GOTO lbl202
                        case -2089197869: {
                            var21_19 ^= var22_4 ^ 120649102;
                            var22_4 = (var17_3 | var23_2) ^ 701457373;
                            ** GOTO lbl202
                        }
lbl192:
                        // 1 sources

                        var21_19 ^= -2082117872;
                        var21_19 ^= 1725978232;
                        ** continue;
                        case 1081464701: {
                            if (!var8_12.hasNext()) {
                                var22_4 = (var17_3 | var23_2) ^ 1955520804;
                            } else {
                                ** continue;
                            }
                        }
lbl200:
                        // 1 sources

                        var22_4 = (var17_3 | var23_2) ^ 127766665;
                        ** GOTO lbl377
lbl202:
                        // 9 sources

                        while (true) {
                            default: {
                                continue block165;
                            }
                            break;
                        }
lbl205:
                        // 2 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ 766456651;
                            ** GOTO lbl403
                            break;
                        }
                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ 1437700530;
                            ** GOTO lbl262
                            break;
                        }
lbl211:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ 522548011;
                            ** GOTO lbl262
                            break;
                        }
lbl214:
                        // 2 sources

                        while (true) {
                            var21_19 ^= 1832146204;
                            var13_22 = v11;
                            var22_4 = (var17_3 | var23_2) ^ 1447234785;
                            ** GOTO lbl278
                            break;
                        }
lbl219:
                        // 1 sources

                        while (true) {
                            switch (var22_4) {
                                case -273551256: {
                                    var10_14 = var9_13.get(0).getAsJsonObject();
                                    ** GOTO lbl246
                                }
                                case -1534282602: {
                                    break;
                                }
                                case -1875564577: {
                                    var21_19 ^= var22_4 ^ -1577068657;
                                    ** GOTO lbl244
                                }
                                case -960481660: {
                                    if (var10_14 == null) {
                                        ** continue;
                                    }
                                    ** GOTO lbl246
                                }
                                case -1567357487: {
                                    var11_20 = jP.requiredString(var10_14, jP.a((var21_19 | var22_4 ^ -781042893) ^ (var22_4 ^ -801992109), (var17_3 | var22_4 ^ -781042893) ^ ((var21_19 | var22_4 ^ -781042893) ^ (var22_4 ^ 695567808))));
                                    var22_4 = (var17_3 | var23_2) ^ -858329600;
                                    ** GOTO lbl522
                                }
                                case 2117001324: {
                                    var21_19 ^= var22_4 ^ 2137630696;
                                    ** break;
lbl240:
                                    // 1 sources

                                    var22_4 = (var17_3 | var23_2) ^ 825723251;
                                    ** GOTO lbl248
                                }
                            }
                            var22_4 = (var17_3 | var23_2) ^ 407261087;
                            continue;
lbl244:
                            // 1 sources

                            var22_4 = (var17_3 | var23_2) ^ 1432599078;
                            continue;
lbl246:
                            // 2 sources

                            var22_4 = (var17_3 | var23_2) ^ 1740806184;
lbl248:
                            // 3 sources

                        }
lbl249:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -1665143959;
                            ** GOTO lbl561
                            break;
                        }
lbl252:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -565782991;
                            ** GOTO lbl597
                            break;
                        }
                        while (true) {
                            ** GOTO lbl311
                            break;
                        }
lbl257:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl259:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ 225714981;
                            ** GOTO lbl613
                            break;
                        }
lbl262:
                        // 3 sources

                        block178: while (true) {
                            switch (var22_4) {
                                case 1590847951: {
                                    var21_19 ^= var22_4 ^ -1424045800;
                                    ** break;
                                }
                                case -388838180: {
                                    v0 = 8993475522064236118L << (var22_4 ^ -388838148) >>> (var22_4 ^ -388838148) ^ (long)var21_19 & 0xFFFFFFFFL | (8993475522064236118L >>> (var22_4 ^ -388838148) ^ (long)var21_19 & 0xFFFFFFFFL) << (var22_4 ^ -388838148);
                                    ** GOTO lbl98
                                }
                                case -658220664: {
                                    v0 = var10_14.get(jP.a((var21_19 | var22_4 ^ -1423808662) ^ (var22_4 ^ -1569583603), (var17_3 | var22_4 ^ -1423808662) ^ ((var21_19 | var22_4 ^ -1423808662) ^ (var22_4 ^ -1628628588)))).getAsLong();
                                    ** continue;
                                }
                                case -1667516714: {
                                    if (!var10_14.has(jP.a((var21_19 | var22_4 ^ -276985804) ^ (var22_4 ^ 1646616903), (var17_3 | var22_4 ^ -276985804) ^ ((var21_19 | var22_4 ^ -276985804) ^ (var22_4 ^ -859080993))))) ** continue;
                                    ** GOTO lbl286
                                }
lbl277:
                                // 1 sources

                                var22_4 = (var17_3 | var23_2) ^ 791930495;
lbl278:
                                // 3 sources

                                default: {
                                    continue block178;
                                }
                                case -1572458939: {
                                    var21_19 ^= var22_4 ^ 1468698258;
                                    ** continue;
                                }
                                case -1581993194: 
                            }
                            var21_19 ^= var22_4 ^ -97749620;
                            ** continue;
lbl286:
                            // 1 sources

                            var22_4 = (var17_3 | var23_2) ^ -1457138120;
                        }
                        v12 = jP.requiredString((JsonObject)var8_12, jP.a((v13 | var23_2) ^ 1924060804, (var17_3 | var23_2) ^ ((v14 | var23_2) ^ 521453849)));
                        block179: while (true) {
                            switch (var21_19) {
                                default: {
                                    var21_19 ^= -310710812;
                                    ** break;
                                }
                                case -1126969588: {
                                    var21_19 ^= 1512256001;
                                    continue block179;
                                }
                                case -1246451850: 
                            }
                            break;
                        }
                        var21_19 ^= 682950372;
                        ** break;
lbl300:
                        // 2 sources

                        var21_19 ^= 439422284;
                        return new hM(v15, v12, var16_24, (String)var11_20, var13_22.toLowerCase(Locale.ROOT), var14_23);
lbl302:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -2106456870;
                            ** GOTO lbl597
                            break;
                        }
lbl305:
                        // 1 sources

                        while (true) {
                            var8_12 = var6_10.iterator();
                            ** GOTO lbl368
                            break;
                        }
lbl308:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -994336921;
                            ** GOTO lbl522
                            break;
                        }
lbl311:
                        // 1 sources

                        var22_4 = (var17_3 | var23_2) ^ 1324496025;
                        while (true) {
                            switch (var22_4) {
                                case 1528417101: {
                                    var12_21 = (JsonElement)var11_20.next();
                                    var21_19 ^= 1314927540;
                                    var13_22 = var12_21.getAsJsonObject();
                                    ** break;
                                }
                                case 339825155: {
                                    var21_19 ^= var22_4 ^ -490891993;
                                    var22_4 = (var17_3 | var23_2) ^ -1268818482;
                                    break;
                                }
                                case 1135141433: {
                                    if (var11_20.hasNext()) ** continue;
lbl325:
                                    // 2 sources

                                    var22_4 = (var17_3 | var23_2) ^ -1982242917;
                                    ** GOTO lbl248
                                }
lbl327:
                                // 1 sources

                                var22_4 = (var17_3 | var23_2) ^ 1556285851;
                                ** continue;
                                case -1190818962: {
                                    var21_19 ^= var22_4 ^ 293394179;
                                    var22_4 = (var17_3 | var23_2) ^ -1393658694;
                                }
                            }
lbl332:
                            // 4 sources

                        }
lbl333:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -6879955;
                            ** GOTO lbl642
                            break;
                        }
                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -400292294;
                            ** GOTO lbl642
                            break;
                        }
lbl339:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ 311876674;
                            ** GOTO lbl461
                            break;
                        }
lbl342:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -709751169;
                            ** GOTO lbl642
                            break;
                        }
lbl345:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -1528813340;
                            if (true) ** GOTO lbl403
                            break;
                        }
lbl348:
                        // 1 sources

                        while (true) {
                            var21_19 ^= -695903395;
                            var7_11 = new ArrayList<JsonObject>();
                            var21_19 ^= 957449966;
                            ** continue;
                            break;
                        }
lbl353:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ 1687463978;
                            ** GOTO lbl642
                            break;
                        }
lbl356:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ 1957936904;
                            ** GOTO lbl613
                            break;
                        }
                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -1741654115;
                            ** GOTO lbl642
                            break;
                        }
lbl362:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ 480867223;
                            ** GOTO lbl377
                            break;
                        }
lbl365:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -831308439;
                            ** GOTO lbl522
                            break;
                        }
lbl368:
                        // 5 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ 1041733891;
                            ** continue;
                            break;
                        }
lbl371:
                        // 2 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -1666908977;
                            ** GOTO lbl522
                            break;
                        }
lbl374:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ 1964899044;
                            ** GOTO lbl642
                            break;
                        }
lbl377:
                        // 5 sources

                        block198: while (true) {
                            switch (var22_4) {
                                default: {
                                    continue block198;
                                }
                                case -261476482: {
                                    var21_19 ^= var22_4 ^ -1543418476;
                                    var22_4 = (var17_3 | var23_2) ^ 976686880;
                                    continue block198;
                                }
                                case -1172976024: {
                                    var10_14 = var9_13.getAsJsonObject();
                                    ** break;
                                }
                                case -346108832: {
                                    ** GOTO lbl368
                                }
                                case 441585050: {
                                    var21_19 ^= var22_4 ^ 449836649;
                                    ** continue;
                                }
                                case -843009833: {
                                    if (var9_13.isJsonObject()) ** continue;
                                    ** continue;
                                }
lbl396:
                                // 1 sources

                                var22_4 = (var17_3 | var23_2) ^ 474839876;
                                ** GOTO lbl561
                                case 1987060796: 
                            }
                            break;
                        }
                        var21_19 ^= var22_4 ^ -278292889;
                        ** continue;
                        block199: while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -95829288;
lbl403:
                            // 6 sources

                            block200: while (true) {
                                switch (var22_4) {
                                    case -1697899718: {
                                        var21_19 ^= var22_4 ^ 1689999086;
                                        ** GOTO lbl432
                                    }
                                    case 1384727253: {
                                        if (!var9_13.isEmpty()) continue block199;
                                        ** GOTO lbl8
                                    }
                                    case 1940772507: {
                                        ** GOTO lbl453
                                    }
                                    case -553286646: {
                                        ** break;
                                    }
                                    case 1486073911: {
                                        if (var9_13 != null) ** break;
                                        ** continue;
                                        ** continue;
                                    }
                                    case -578039715: {
                                        var21_19 ^= var22_4 ^ -228242489;
                                        ** GOTO lbl453
                                    }
                                    case -641213183: {
                                        var10_14 = null;
                                        ** continue;
                                    }
lbl425:
                                    // 1 sources

                                    switch (var21_19) {
                                        case 1009351046: {
                                            var22_4 = (var17_3 | var23_2) ^ 712798122;
                                            break;
                                        }
                                        case 230587695: {
                                            var21_19 ^= var22_4 ^ 123161783;
                                            ** continue;
                                        }
lbl432:
                                        // 1 sources

                                        var22_4 = (var17_3 | var23_2) ^ -1352396864;
                                        break;
                                        case -1545846112: {
                                            var21_19 ^= var22_4 ^ 1235024167;
                                            ** GOTO lbl205
                                        }
                                        case -631731012: {
                                            var22_4 = (var17_3 | var23_2) ^ 423768970;
                                            break;
                                        }
                                        default: {
                                            var22_4 = (var17_3 | var23_2) ^ -1541972955;
                                            break;
                                        }
                                        case 1407247314: {
                                            var21_19 ^= var22_4 ^ 513264476;
                                            ** continue;
                                        }
                                        case -1602645471: {
                                            var22_4 = (var17_3 | var23_2) ^ 1412169047;
                                            break;
                                        }
                                    }
                                    ** GOTO lbl454
                                    case 1394054931: {
                                        var22_4 = (var17_3 | var23_2) ^ -1518404318;
                                        ** GOTO lbl454
                                    }
lbl453:
                                    // 2 sources

                                    var22_4 = (var17_3 | var23_2) ^ 686963709;
lbl454:
                                    // 4 sources

                                    default: {
                                        continue block200;
                                    }
                                    case -290091907: 
                                }
                                break;
                            }
                            break;
                        }
                        throw new IOException(jP.a((var21_19 | var22_4 ^ -1655459169) ^ (var22_4 ^ 470424572), (var17_3 | var22_4 ^ -1655459169) ^ ((var21_19 | var22_4 ^ -1655459169) ^ (var22_4 ^ -1526133652))));
                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -1797218604;
                            ** GOTO lbl522
                            break;
                        }
lbl461:
                        // 3 sources

                        block202: while (true) {
                            switch (var22_4) {
                                case -446602315: {
                                    if (var14_23 > 0L) {
                                        ** continue;
                                    }
                                    ** GOTO lbl473
                                }
                                case 304038553: {
                                    var21_19 ^= var22_4 ^ -722371692;
                                    ** continue;
                                }
                                case -1775479506: {
                                    if (var14_23 <= (-4597762426879772818L << (var22_4 ^ -1775479538) >>> (var22_4 ^ -1775479538) ^ (long)var21_19 & 0xFFFFFFFFL | (-4597762426879772818L >>> (var22_4 ^ -1775479538) ^ (long)var21_19 & 0xFFFFFFFFL) << (var22_4 ^ -1775479538))) ** continue;
lbl473:
                                    // 2 sources

                                    var22_4 = (var17_3 | var23_2) ^ -1715836929;
                                    ** GOTO lbl481
                                }
                                case -522155688: {
                                    var21_19 ^= var22_4 ^ -484888947;
                                    var22_4 = (var17_3 | var23_2) ^ 1904675172;
                                    ** GOTO lbl481
                                }
                                case 1376462756: {
                                    var22_4 = (var17_3 | var23_2) ^ 1641802457;
                                }
lbl481:
                                // 5 sources

                                default: {
                                    continue block202;
                                }
                                case 1850595336: {
                                    var21_19 ^= var22_4 ^ 1210680743;
                                    var22_4 = (var17_3 | var23_2) ^ -1443547779;
                                    continue block202;
                                }
                                case -2039433581: {
                                    var16_24 = URI.create(jP.requiredString(var10_14, jP.a((var21_19 | var22_4 ^ -174684047) ^ (var22_4 ^ -52502524), (var17_3 | var22_4 ^ -174684047) ^ ((var21_19 | var22_4 ^ -174684047) ^ (var22_4 ^ -1913391201)))));
                                    ** continue;
                                }
                                case 1577224842: 
                            }
                            break;
                        }
                        throw new IOException(jP.a((var21_19 | var22_4 ^ 769963112) ^ (var22_4 ^ 548740100), (var17_3 | var22_4 ^ 769963112) ^ ((var21_19 | var22_4 ^ 769963112) ^ (var22_4 ^ -1414526050))));
lbl492:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ 617519004;
                            ** GOTO lbl561
                            while (true) {
                                var22_4 = (var17_3 | var23_2) ^ 762747143;
                                ** GOTO lbl561
                                break;
                            }
                            break;
                        }
lbl498:
                        // 1 sources

                        while (true) {
                            var21_19 ^= 1031719256;
                            ** continue;
                            break;
                        }
lbl501:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ 376519840;
                            ** GOTO lbl561
                            break;
                        }
lbl504:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ 2003046241;
                            ** GOTO lbl597
                            break;
                        }
lbl507:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -1790319427;
                            ** GOTO lbl642
                            break;
                        }
lbl510:
                        // 1 sources

                        while (true) {
                            var20_18 = var2_6;
                            var19_16 = var1_5;
                            var18_15 = var0.b;
                            var3_7 = URI.create(jP.a(((var21_19 ^= -844686179) | var23_2) ^ 2125961116, (var17_3 | var23_2) ^ ((var21_19 | var23_2) ^ 1414430748)) + var18_15 + jP.a((var21_19 | var23_2) ^ 2125961117, (var17_3 | var23_2) ^ ((var21_19 | var23_2) ^ -170098660)) + var19_16 + jP.a((var21_19 | var23_2) ^ 2125961118, (var17_3 | var23_2) ^ ((var21_19 | var23_2) ^ 2023456796)) + var20_18 + jP.a((var21_19 | var23_2) ^ 2125961119, (var17_3 | var23_2) ^ ((var21_19 | var23_2) ^ -1988657124)));
                            ** continue;
                            break;
                        }
lbl516:
                        // 1 sources

                        while (true) {
                            var22_4 = (var17_3 | var23_2) ^ -1555112405;
                            ** GOTO lbl522
                            break;
                        }
lbl519:
                        // 1 sources

                        while (true) {
                            if (jP.contains(var10_14.getAsJsonArray(jP.a((var21_19 | var22_4 ^ 1151895689) ^ (var22_4 ^ 1106338275), (var17_3 | var22_4 ^ 1151895689) ^ ((var21_19 | var22_4 ^ 1151895689) ^ (var22_4 ^ 1990555247)))), jP.a(((var21_19 ^= 506922886) | var23_2) ^ 2058278541, (var17_3 | var23_2) ^ ((var21_19 | var23_2) ^ 542359808)))) ** continue;
                            ** continue;
                            break;
                        }
lbl522:
                        // 6 sources

                        block212: while (true) {
                            switch (var22_4) {
                                case 1800618808: {
                                    var21_19 ^= var22_4 ^ -110386733;
                                    ** continue;
                                }
                                case 1662460195: {
                                    var21_19 ^= var22_4 ^ 1794810877;
                                    ** break;
                                }
                                case 860627088: {
                                    var21_19 ^= var22_4 ^ -1707444378;
                                    ** continue;
                                }
                                case 1460293958: {
                                    var12_21 = var10_14.getAsJsonObject(jP.a((var21_19 | var22_4 ^ 619474852) ^ (var22_4 ^ -1381742903), (var17_3 | var22_4 ^ 619474852) ^ ((var21_19 | var22_4 ^ 619474852) ^ (var22_4 ^ -396537505))));
                                    ** continue;
                                }
lbl536:
                                // 1 sources

                                var22_4 = (var17_3 | var23_2) ^ -1593971023;
                                ** GOTO lbl544
                                case 1238220779: {
                                    if (!var11_20.toLowerCase(Locale.ROOT).endsWith(jP.a((var21_19 | var22_4 ^ 975929609) ^ (var22_4 ^ -1150670726), (var17_3 | var22_4 ^ 975929609) ^ ((var21_19 | var22_4 ^ 975929609) ^ (var22_4 ^ -1526710290))))) ** GOTO lbl371
                                    ** continue;
                                }
                                case 992039415: {
                                    var21_19 ^= var22_4 ^ -1415425727;
                                    var22_4 = (var17_3 | var23_2) ^ -1103495140;
                                }
lbl544:
                                // 3 sources

                                default: {
                                    continue block212;
                                }
                                case 964985502: {
                                    var21_19 ^= -1451862026;
                                    if (Path.of((String)var11_20, new String[0]).getFileName().toString().equals(var11_20)) ** continue;
                                    ** continue;
                                }
lbl550:
                                // 1 sources

                                while (true) {
                                    var22_4 = (var17_3 | var23_2) ^ 893242421;
                                    ** GOTO lbl561
                                    break;
                                }
lbl553:
                                // 1 sources

                                while (true) {
                                    var2_6 = URLEncoder.encode(jP.a(((var21_19 ^= -286149846) | var23_2) ^ -222914626, (var17_3 | var23_2) ^ ((var21_19 | var23_2) ^ 997949441)), StandardCharsets.UTF_8);
                                    ** continue;
                                    break;
                                }
lbl556:
                                // 1 sources

                                while (true) {
                                    v15 = jP.requiredString((JsonObject)var8_12, v16);
                                    v13 = var21_19 ^= -1619887445;
                                    v14 = var21_19;
                                    ** continue;
                                    break;
                                }
lbl561:
                                // 8 sources

                                block216: while (true) {
                                    switch (var22_4) {
                                        default: {
                                            continue block216;
                                        }
                                        case 680971983: {
                                            var21_19 ^= var22_4 ^ 743928532;
                                            break;
                                        }
                                        case -1026919486: {
                                            var7_11.add(var10_14);
                                            ** continue;
                                        }
                                        case -751228821: {
                                            var21_19 ^= var22_4 ^ -909143050;
                                            var22_4 = (var17_3 | var23_2) ^ -1061615204;
                                            continue block216;
                                        }
                                        case -629070096: {
                                            var21_19 ^= var22_4 ^ -1060628027;
                                            ** continue;
                                        }
                                        case 1336624022: {
                                            ** GOTO lbl368
                                        }
                                        case -1937978637: {
                                            ** GOTO lbl368
                                        }
                                        case 927905387: {
                                            ** continue;
                                        }
                                        case -511278249: {
                                            if (jP.contains(var10_14.getAsJsonArray(jP.a((var21_19 | var22_4 ^ var24_1) ^ (var22_4 ^ -1624648252), (var17_3 | var22_4 ^ var24_1) ^ ((var21_19 | var22_4 ^ var24_1) ^ (var22_4 ^ -527252914)))), jP.a((var21_19 | var22_4 ^ var24_1) ^ (var22_4 ^ -1624648251), (var17_3 | var22_4 ^ var24_1) ^ ((var21_19 | var22_4 ^ var24_1) ^ (var22_4 ^ -1861565874))))) ** break;
                                            ** continue;
                                            ** continue;
                                        }
                                        case 1799902366: {
                                            var21_19 ^= var22_4 ^ 1975572400;
                                            ** continue;
                                        }
                                        case -340081485: {
                                            var21_19 ^= var22_4 ^ 1916701979;
                                            ** continue;
                                        }
                                    }
                                    var22_4 = (var17_3 | var23_2) ^ -1201865631;
                                }
lbl597:
                                // 4 sources

                                block217: while (true) {
                                    switch (var22_4) {
                                        default: {
                                            continue block217;
                                        }
                                        case 699492806: {
                                            jP.requireTrustedDownload(var16_24);
                                            ** continue;
                                        }
                                        case -2137804650: {
                                            v16 = jP.a((var21_19 | var22_4 ^ -210399628) ^ (var22_4 ^ 2116888090), (var17_3 | var22_4 ^ -210399628) ^ ((var21_19 | var22_4 ^ -210399628) ^ (var22_4 ^ 85012870)));
                                            ** continue;
                                        }
                                        case 1971698477: {
                                            var21_19 ^= var22_4 ^ -1017544697;
                                            ** continue;
                                        }
                                        case -1357411082: 
                                    }
                                    break;
                                }
                                var21_19 ^= var22_4 ^ -843353118;
                                ** continue;
lbl613:
                                // 3 sources

                                block218: while (true) {
                                    switch (var22_4) {
                                        default: {
                                            continue block218;
                                        }
                                        case 622369941: {
                                            v11 = jP.requiredString((JsonObject)var12_21, jP.a((var21_19 | var22_4 ^ 1459528311) ^ (var22_4 ^ -542193137), (var17_3 | var22_4 ^ 1459528311) ^ ((var21_19 | var22_4 ^ 1459528311) ^ (var22_4 ^ -353706600))));
                                            ** GOTO lbl214
                                        }
                                        case -1267585539: {
                                            v11 = "";
                                            ** continue;
                                        }
                                        case 635554358: {
                                            var21_19 ^= var22_4 ^ -721718602;
                                            var22_4 = (var17_3 | var23_2) ^ 1132827146;
                                            continue block218;
                                        }
                                        case -92037934: {
                                            if (var12_21 != null) break;
                                            ** continue;
                                        }
                                        case -46441340: {
                                            var21_19 ^= var22_4 ^ 203547652;
                                            ** GOTO lbl638
                                        }
                                        case -2092695297: {
                                            var21_19 ^= var22_4 ^ 19186027;
                                            ** continue;
                                        }
                                    }
                                    var22_4 = (var17_3 | var23_2) ^ 181199731;
                                    continue;
lbl638:
                                    // 1 sources

                                    var22_4 = (var17_3 | var23_2) ^ -756079774;
                                }
                                case 1421435356: 
                            }
                            break;
                        }
                        throw new IOException(jP.a((var21_19 | var22_4 ^ 660561726) ^ (var22_4 ^ 637941317), (var17_3 | var22_4 ^ 660561726) ^ ((var21_19 | var22_4 ^ 660561726) ^ (var22_4 ^ 783229392))));
lbl642:
                        // 9 sources

                        block219: while (true) {
                            switch (var22_4) {
                                default: {
                                    continue block219;
                                }
                                case -194253103: {
                                    var21_19 ^= var22_4 ^ 229789696;
                                    ** continue;
                                }
                                case -1822222371: {
                                    var6_10 = JsonParser.parseString((String)((String)var5_9.body())).getAsJsonArray();
                                    ** continue;
                                }
                                case 611269876: {
                                    var21_19 ^= var22_4 ^ 1037183638;
                                    ** continue;
                                }
                                case 140557018: {
                                    var19_17 = var5_9.statusCode();
                                    throw new IOException(jP.a((var21_19 | var22_4 ^ 2072413240) ^ (var22_4 ^ -220779434), (var17_3 | var22_4 ^ 2072413240) ^ ((var21_19 | var22_4 ^ 2072413240) ^ (var22_4 ^ 544226270))) + var19_17 + ".");
                                }
                                case 533969357: {
                                    var21_19 ^= var22_4 ^ -94529876;
                                    ** continue;
                                }
                                case 574992776: {
                                    var21_19 ^= var22_4 ^ 928907702;
                                    ** continue;
                                }
                                case 1875363946: {
                                    var21_19 ^= var22_4 ^ 1192455165;
                                    ** continue;
                                }
                                case -2098576109: {
                                    if (var5_9.statusCode() == jP.a((var21_19 | var22_4 ^ -250840079) ^ (var22_4 ^ -124680501), (var17_3 | var22_4 ^ -250840079) ^ ((var21_19 | var22_4 ^ -250840079) ^ (var22_4 ^ -88081466)))) ** continue;
                                    ** continue;
                                }
                                case 1656642378: {
                                    if (((String)var5_9.body()).getBytes(StandardCharsets.UTF_8).length > jP.a((var21_19 | var22_4 ^ 291005864) ^ (var22_4 ^ -1664247406), (var17_3 | var22_4 ^ 291005864) ^ ((var21_19 | var22_4 ^ 291005864) ^ (var22_4 ^ -210902194)))) ** continue;
                                    var22_4 = (var17_3 | var23_2) ^ 60576038;
                                    continue block219;
                                }
                                case 1145207343: 
                            }
                            break;
                        }
                        throw new IOException(jP.a((var21_19 | var22_4 ^ 933512397) ^ (var22_4 ^ 922021034), (var17_3 | var22_4 ^ 933512397) ^ ((var21_19 | var22_4 ^ 933512397) ^ (var22_4 ^ -1846412509))));
                        case 1087293808: 
                    }
                    break;
                }
                break;
            }
            throw new IOException(jP.a((var21_19 | var22_4 ^ 858322834) ^ (var22_4 ^ -1099849737), (var17_3 | var22_4 ^ 858322834) ^ ((var21_19 | var22_4 ^ 858322834) ^ (var22_4 ^ 84904057))));
        }
        block220: while (true) {
            switch (var22_4) {
                default: {
                    continue block220;
                }
                case 1587842244: {
                    var1_5 = URLEncoder.encode(jP.a((var21_19 | var22_4 ^ 759345702) ^ (var22_4 ^ 537107059), (var17_3 | var22_4 ^ 759345702) ^ ((var21_19 | var22_4 ^ 759345702) ^ (var22_4 ^ -970814003))), StandardCharsets.UTF_8);
                    ** continue;
                }
                case -365419536: {
                    var22_4 = (var17_3 | var23_2) ^ 1495269793;
                    continue block220;
                }
                case -1361592746: 
            }
            break;
        }
        var21_19 ^= var22_4 ^ 388476922;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    static boolean install(Path var0, ic var1_1, hM var2_2) throws Exception {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [127[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static JsonObject readFabricMetadata(JarFile var0) throws IOException {
        block46: {
            var8_1 = -1587610061;
            var5_2 = jP.b & -1587610061 ^ -313991831;
            var7_3 = 0;
            var6_4 = (var5_2 | var8_1) ^ -703870429;
            var7_3 = (var5_2 | var8_1) ^ 712164094;
            break block46;
lbl7:
            // 1 sources

            while (true) {
                var7_3 = (var5_2 | var8_1) ^ 1450100847;
                break block46;
                break;
            }
lbl10:
            // 2 sources

            while (true) {
                var7_3 = (var5_2 | var8_1) ^ -855675243;
                break block46;
                break;
            }
lbl13:
            // 1 sources

            block30: while (true) {
                switch (var6_4) {
                    case 1199879968: {
                        var7_3 = (var5_2 | var8_1) ^ 1247988157;
                        break block30;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var6_4 ^= var7_3 ^ 1812327693;
                        ** GOTO lbl33
                        break;
                    }
                    default: {
                        var7_3 = (var5_2 | var8_1) ^ -605201005;
                        break block30;
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        var6_4 ^= var7_3 ^ -1337750597;
                        ** GOTO lbl10
                        break;
                    }
                    case 995439960: {
                        var7_3 = (var5_2 | var8_1) ^ -1375911485;
                        break block30;
                    }
                }
                break;
            }
            break block46;
lbl31:
            // 1 sources

            while (true) {
                var6_4 ^= var7_3 ^ -1183547693;
lbl33:
                // 2 sources

                var7_3 = (var5_2 | var8_1) ^ -2103097551;
                break block46;
                break;
            }
lbl35:
            // 1 sources

            while (true) {
                var7_3 = (var5_2 | var8_1) ^ 1325301344;
                break block46;
                break;
            }
lbl38:
            // 1 sources

            while (true) {
                block47: {
                    block48: {
                        var1_5 = var0.getJarEntry(jP.a((var6_4 | var7_3 ^ 50233128) ^ (var7_3 ^ -918628814), (var5_2 | var7_3 ^ 50233128) ^ ((var6_4 | var7_3 ^ 50233128) ^ (var7_3 ^ 395411795))));
                        var7_3 = (var5_2 | var8_1) ^ 1066972232;
                        break block47;
lbl42:
                        // 1 sources

                        while (true) {
                            var6_4 ^= var7_3 ^ 219901408;
                            var7_3 = (var5_2 | var8_1) ^ -1384432044;
                            break block47;
                            break;
                        }
lbl46:
                        // 1 sources

                        while (true) {
                            if (var1_5 == null) ** GOTO lbl56
                            var7_3 = (var5_2 | var8_1) ^ 1685047809;
                            break block47;
                            break;
                        }
lbl50:
                        // 1 sources

                        while (true) {
                            var7_3 = (var5_2 | var8_1) ^ -88404845;
                            break block47;
                            break;
                        }
lbl53:
                        // 1 sources

                        while (true) {
                            if (var1_5.getSize() <= (2116643309405328352L << (var7_3 ^ 400946120) >>> (var7_3 ^ 400946120) ^ (long)var6_4 & 0xFFFFFFFFL | (2116643309405328352L >>> (var7_3 ^ 400946120) ^ (long)var6_4 & 0xFFFFFFFFL) << (var7_3 ^ 400946120))) break block48;
lbl56:
                            // 2 sources

                            var7_3 = (var5_2 | var8_1) ^ -412084900;
                            break block47;
                            break;
                        }
lbl58:
                        // 1 sources

                        while (true) {
                            var6_4 ^= var7_3 ^ 189204097;
                            var7_3 = (var5_2 | var8_1) ^ -2029247910;
                            break block47;
                            break;
                        }
lbl62:
                        // 1 sources

                        return null;
                    }
                    var7_3 = (var5_2 | var8_1) ^ 1529071370;
                    break block47;
lbl67:
                    // 1 sources

                    while (true) {
                        var6_4 ^= var7_3 ^ -434796557;
                        var7_3 = (var5_2 | var8_1) ^ -710433940;
                        break block47;
                        break;
                    }
lbl71:
                    // 1 sources

                    while (true) {
                        var2_6 = new InputStreamReader(var0.getInputStream(var1_5), StandardCharsets.UTF_8);
                        try {
                            var6_4 ^= -280622058;
                            var3_7 = JsonParser.parseReader((Reader)var2_6).getAsJsonObject();
                            var6_4 ^= -1156255647;
                        }
                        catch (Throwable v0) {
                            var6_4 = (var5_2 | var8_1) ^ 1100707382;
                            var3_8 = v0;
                            try {
                                var6_4 ^= 679863090;
                                var2_6.close();
                                var6_4 ^= -824205203;
                            }
                            catch (Throwable v1) {
                                var6_4 = (var5_2 | var8_1) ^ -1480510103;
                                var4_9 = v1;
                                var3_8.addSuppressed(var4_9);
                            }
                            var6_4 ^= 1099028621;
                            throw var3_8;
                        }
                        var2_6.close();
                        var6_4 ^= -1159794334;
                        return var3_7;
                    }
                }
                block44: while (true) {
                    switch (var7_3) {
                        default: {
                            continue block44;
                        }
                        case -758756557: {
                            ** continue;
                        }
                        case 1076216111: {
                            ** continue;
                        }
                        case -1993263750: {
                            ** continue;
                        }
                        case 400946152: {
                            ** continue;
                        }
                        case 170846759: {
                            ** continue;
                        }
                        case 1783815457: {
                            ** continue;
                        }
                        case -1233307535: {
                            ** continue;
                        }
                        ** case 955866135:
lbl114:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
                break;
            }
        }
        block45: while (true) {
            switch (var7_3) {
                default: {
                    continue block45;
                }
                case -953401979: {
                    ** continue;
                }
                case -1154468076: {
                    ** continue;
                }
                case 564236782: {
                    ** continue;
                }
                case -1489226042: {
                    ** continue;
                }
                case 917742312: {
                    ** continue;
                }
                case 1084473016: {
                    ** continue;
                }
                case 1878767690: {
                    ** continue;
                }
                ** case -1549762277:
lbl135:
                // 1 sources

                ** continue;
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
    private static boolean hasExpectedModId(Path var0, ic var1_1) {
        var8_2 = 1982373792;
        var5_3 = jP.b & 1982373792 ^ -226443254;
        var7_4 = 0;
        var6_5 = (var5_3 | var8_2) ^ 358650177;
        var7_4 = (var5_3 | var8_2) ^ 2013591898;
        ** GOTO lbl79
lbl-1000:
        // 1 sources

        {
            block34: {
                while (true) {
                    var7_4 = (var5_3 | var8_2) ^ 1658883124;
                    break block34;
                    break;
                }
lbl-1000:
                // 1 sources

                {
                    while (true) {
                        block35: {
                            var6_5 ^= -648133220;
                            var3_7 = jP.readFabricMetadata(var2_6);
                            var7_4 = (var5_3 | var8_2) ^ -1594439829;
                            break block35;
lbl15:
                            // 3 sources

                            while (true) {
                                var7_4 = (var5_3 | var8_2) ^ 2129183325;
                                break block35;
                                break;
                            }
lbl18:
                            // 2 sources

                            block31: while (true) {
                                switch (var6_5) {
                                    default: {
                                        var6_5 ^= -1410436498;
                                        break;
                                    }
                                    case -1361743094: {
                                        var6_5 ^= 589063231;
                                        continue block31;
                                    }
                                    case 2007607074: {
                                        var6_5 ^= -2080315629;
                                        break;
                                    }
                                }
                                var4_9 = v0;
                                var6_5 ^= -996954688;
                                var2_6.close();
                                var6_5 ^= 665299249;
                                return var4_9;
                            }
                        }
                        block32: while (true) {
                            switch (var7_4) {
                                default: {
                                    continue block32;
                                }
                                case 1449007297: {
                                    var6_5 ^= var7_4 ^ 870359655;
                                    var7_4 = (var5_3 | var8_2) ^ 1438062567;
                                    continue block32;
                                }
                                case -1558198195: {
                                    if (var3_7 == null) ** GOTO lbl15
                                    var7_4 = (var5_3 | var8_2) ^ 2124670011;
                                    continue block32;
                                }
                                case -2012529775: {
                                    var7_4 = (var5_3 | var8_2) ^ -1212316718;
                                    continue block32;
                                }
                                case 1091918968: {
                                    if (!var3_7.has(jP.a((var6_5 | var7_4 ^ 926794712) ^ (var7_4 ^ -1225176192), (var5_3 | var7_4 ^ 926794712) ^ ((var6_5 | var7_4 ^ 926794712) ^ (var7_4 ^ 1424178227))))) ** GOTO lbl15
                                    var7_4 = (var5_3 | var8_2) ^ 936024474;
                                    continue block32;
                                }
                                case -1050524112: {
                                    var6_5 ^= var7_4 ^ -1708813813;
                                    var7_4 = (var5_3 | var8_2) ^ -1417072756;
                                    continue block32;
                                }
                                case 1562505254: {
                                    v1 = jP.a((var6_5 | var7_4 ^ 722038662) ^ (var7_4 ^ -1551194172), (var5_3 | var7_4 ^ 722038662) ^ ((var6_5 | var7_4 ^ 722038662) ^ (var7_4 ^ -1201352586)));
                                    var6_5 ^= 1531434043;
                                    if (var1_1.a.contains(var3_7.get(v1).getAsString())) ** break;
                                    ** continue;
                                    var7_4 = (var5_3 | var8_2) ^ 1716448440;
                                    continue block32;
                                }
                                case -1863961838: {
                                    var6_5 ^= var7_4 ^ -1685280087;
                                    var7_4 = (var5_3 | var8_2) ^ 170618357;
                                    continue block32;
                                }
                                case -58477985: {
                                    v0 = true;
                                    ** GOTO lbl18
                                }
                                case -2009063945: {
                                    var6_5 ^= var7_4 ^ -2094365620;
                                    var7_4 = (var5_3 | var8_2) ^ -37058525;
                                    continue block32;
                                }
                                case 190994313: 
                            }
                            break;
                        }
                        v0 = false;
                        ** continue;
                        break;
                    }
                }
            }
            block33: while (true) {
                switch (var7_4) {
                    default: {
                        continue block33;
                    }
                    case -1901320464: {
                        ** continue;
                    }
                    case -1807199330: {
                        var6_5 ^= var7_4 ^ -1242769650;
                        var7_4 = (var5_3 | var8_2) ^ 136852940;
                        continue block33;
                    }
                    case -25105818: 
                }
                break;
            }
            var2_6 = new JarFile(var0.toFile());
            ** continue;
        }
    }

    /*
     * Exception decompiling
     */
    private static boolean contains(JsonArray var0, String var1_1) {
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
    private static String a(int var0, int var1_1) {
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
    private static int releaseRank(JsonObject var0) {
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
    private static Instant publishedAt(JsonObject var0) {
        var5_1 = -107221938;
        var2_2 = jP.b & -107221938 ^ 2025441741;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ -1459354114;
        var4_3 = (var2_2 | var5_1) ^ -570046529;
        ** GOTO lbl10
lbl-1000:
        // 1 sources

        {
            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 838304397;
                break;
            }
            block9: while (true) {
                switch (var4_3) {
                    default: {
                        continue block9;
                    }
                    case 666774128: {
                        ** continue;
                    }
                    case -934514878: {
                        var3_4 ^= var4_3 ^ -629284714;
                        var4_3 = (var2_2 | var5_1) ^ -1352694686;
                        continue block9;
                    }
                    case 1457809837: 
                }
                break;
            }
            v0 = Instant.parse(jP.requiredString(var0, jP.a((var3_4 | var4_3 ^ -1350597149) ^ (var4_3 ^ 607858240), (var2_2 | var4_3 ^ -1350597149) ^ ((var3_4 | var4_3 ^ -1350597149) ^ (var4_3 ^ 60320653)))));
            var3_4 ^= 1468750830;
            return v0;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String requiredString(JsonObject var0, String var1_1) {
        var8_2 = -1852125905;
        var3_3 = jP.b & -1852125905 ^ -62670209;
        var7_4 = 0;
        var6_6 = (var3_3 | var8_2) ^ 1208705763;
        var7_4 = (var3_3 | var8_2) ^ 1919358745;
        ** GOTO lbl84
lbl7:
        // 1 sources

        while (true) {
            var7_4 = (var3_3 | var8_2) ^ 1741415105;
            ** GOTO lbl87
            break;
        }
        {
            var7_4 = (var3_3 | var8_2) ^ 1439775312;
            if (true) ** GOTO lbl14
            block32: while (true) {
                var7_4 = (var3_3 | var8_2) ^ -757749425;
lbl14:
                // 2 sources

                block33: while (true) {
                    switch (var7_4) {
                        case 1399010011: {
                            var4_7 = var1_1;
                            throw new IllegalArgumentException(jP.a((var6_6 | var7_4 ^ -1023803404) ^ (var7_4 ^ 194856245), (var3_3 | var7_4 ^ -1023803404) ^ ((var6_6 | var7_4 ^ -1023803404) ^ (var7_4 ^ -1369763253))) + var4_7);
                        }
                        case -51726909: {
                            var2_5 = var0.get(var1_1).getAsString();
                            ** GOTO lbl70
                        }
                        case -246002498: {
                            var6_6 ^= var7_4 ^ 201306086;
                            ** GOTO lbl72
                        }
                        case -419246362: {
                            ** break;
                        }
                        case -1212482666: {
                            if (var0.get(var1_1).isJsonPrimitive()) continue block32;
                            continue block31;
                        }
lbl30:
                        // 1 sources

                        switch (var6_6) {
                            default: {
                                var7_4 = (var3_3 | var8_2) ^ -1325368260;
                                break;
                            }
                            case 988173215: {
                                ** GOTO lbl74
                            }
                            case 1782291034: {
                                var7_4 = (var3_3 | var8_2) ^ 1323933671;
                                continue block33;
                            }
                            case -1431676956: {
                                if (var0 == null) continue block31;
                                ** break;
                            }
                            case -1883445146: {
                                var7_4 = (var3_3 | var8_2) ^ 210613185;
                                break;
                            }
                            case 1289454403: {
                                var6_6 ^= var7_4 ^ -762286119;
                                ** GOTO lbl-1000
                            }
lbl48:
                            // 1 sources

                            var7_4 = (var3_3 | var8_2) ^ -1746901723;
                            break;
                            case 789468720: lbl-1000:
                            // 2 sources

                            {
                                var7_4 = (var3_3 | var8_2) ^ 450441625;
                                break;
                            }
                            case 1333362372: {
                                var7_4 = (var3_3 | var8_2) ^ -331594575;
                                break;
                            }
                            case -1475689169: {
                                var6_6 ^= var7_4 ^ -1236850424;
                                var7_4 = (var3_3 | var8_2) ^ -1363620444;
                                break;
                            }
                            case 503411550: {
                                var6_6 ^= var7_4 ^ -1761162698;
                                ** GOTO lbl78
                            }
                            case 581509169: {
                                var7_4 = (var3_3 | var8_2) ^ -472216543;
                                break;
                            }
                        }
                        break;
                        case -1833276027: {
                            var7_4 = (var3_3 | var8_2) ^ 20007612;
                            break;
                        }
lbl70:
                        // 1 sources

                        var7_4 = (var3_3 | var8_2) ^ -1698476579;
                        if (true) ** GOTO lbl87
lbl72:
                        // 1 sources

                        var7_4 = (var3_3 | var8_2) ^ 1467066523;
                        break;
lbl74:
                        // 1 sources

                        var7_4 = (var3_3 | var8_2) ^ 1247872233;
                        break;
                        case 300399566: {
                            var6_6 ^= var7_4 ^ -87314622;
lbl78:
                            // 2 sources

                            var7_4 = (var3_3 | var8_2) ^ 1868665594;
                            break;
                        }
                        case -1288544104: {
                            if (var0.has(var1_1)) ** break;
                            continue block31;
                            var7_4 = (var3_3 | var8_2) ^ -952259360;
                        }
                    }
lbl84:
                    // 8 sources

                }
                break;
            }
        }
        block34: while (true) {
            var7_4 = (var3_3 | var8_2) ^ -1974284756;
lbl87:
            // 3 sources

            block35: while (true) {
                switch (var7_4) {
                    case 1697207289: {
                        var6_6 ^= var7_4 ^ -1722217108;
                        ** break;
                    }
                    case -1710219842: {
                        if (var2_5.isBlank()) {
                            continue block34;
                        }
                        ** GOTO lbl99
                    }
lbl96:
                    // 1 sources

                    var7_4 = (var3_3 | var8_2) ^ -1681080906;
                    default: {
                        continue block35;
                    }
lbl99:
                    // 1 sources

                    var7_4 = (var3_3 | var8_2) ^ -1728926586;
                    continue block35;
                    case 1729671842: {
                        var6_6 ^= var7_4 ^ 1463166663;
                        ** continue;
                    }
                    case 2005479763: {
                        var6_6 ^= var7_4 ^ -288487533;
                        var7_4 = (var3_3 | var8_2) ^ 1450546316;
                        continue block35;
                    }
                    case 1712800457: {
                        return var2_5;
                    }
                    case -1414632461: 
                }
                break;
            }
            break;
        }
        var5_8 = var1_1;
        throw new IllegalArgumentException(jP.a((var6_6 | var7_4 ^ 976529116) ^ (var7_4 ^ -1085272548), (var3_3 | var7_4 ^ 976529116) ^ ((var6_6 | var7_4 ^ 976529116) ^ (var7_4 ^ 1481267555))) + var5_8);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void requireTrustedDownload(URI var0) {
        block23: {
            break block23;
lbl1:
            // 3 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 642693521;
                ** GOTO lbl26
                break;
            }
        }
        var5_1 = -2053566860;
        var2_2 = jP.b & -2053566860 ^ -221419119;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ 685754033;
        var4_3 = (var2_2 | var5_1) ^ -2107427490;
        block20: while (true) {
            switch (var4_3) {
                case -943962421: {
                    var3_5 ^= var4_3 ^ -370933508;
                    var4_3 = (var2_2 | var5_1) ^ 690398896;
                    continue block20;
                }
                case 1975409323: {
                    var4_3 = (var2_2 | var5_1) ^ 811673918;
                }
                default: {
                    continue block20;
                }
                case -553924283: 
            }
            break;
        }
        var1_4 = var0.getHost();
        var4_3 = (var2_2 | var5_1) ^ -860012532;
        if (true) ** GOTO lbl26
        block21: while (true) {
            var4_3 = (var2_2 | var5_1) ^ 484891556;
lbl26:
            // 3 sources

            block22: while (true) {
                switch (var4_3) {
                    default: {
                        continue block22;
                    }
                    case 996159481: {
                        var3_5 ^= var4_3 ^ -117231693;
                        var4_3 = (var2_2 | var5_1) ^ -1597298925;
                        continue block22;
                    }
                    case 1461078246: {
                        if (!jP.a((var3_5 | var4_3 ^ -762362222) ^ (var4_3 ^ 1777274772), (var2_2 | var4_3 ^ -762362222) ^ ((var3_5 | var4_3 ^ -762362222) ^ (var4_3 ^ 390514798))).equalsIgnoreCase(var0.getScheme())) ** GOTO lbl1
                        var4_3 = (var2_2 | var5_1) ^ 178820066;
                        continue block22;
                    }
                    case -348408751: {
                        var3_5 ^= var4_3 ^ 471499992;
                        var4_3 = (var2_2 | var5_1) ^ -862334357;
                        continue block22;
                    }
                    case -37371288: {
                        if (var1_4 == null) ** GOTO lbl1
                        var4_3 = (var2_2 | var5_1) ^ -358523837;
                        continue block22;
                    }
                    case -42599401: {
                        ** GOTO lbl71
                    }
                    case -1414308723: {
                        v0 = jP.a((var3_5 | var4_3 ^ 774525689) ^ (var4_3 ^ -716686730), (var2_2 | var4_3 ^ 774525689) ^ ((var3_5 | var4_3 ^ 774525689) ^ (var4_3 ^ 322174349)));
                        var3_5 ^= -998039096;
                        if (var1_4.equals(v0)) continue block21;
                        ** break;
                    }
                    case 494678966: {
                        var3_5 ^= var4_3 ^ -637595010;
                        var4_3 = (var2_2 | var5_1) ^ 1550726008;
                        continue block22;
                    }
                    case 1087249765: {
                        var4_3 = (var2_2 | var5_1) ^ 897217470;
                        continue block22;
                    }
                    case -778840476: {
                        var3_5 ^= var4_3 ^ 1330586295;
                        var4_3 = (var2_2 | var5_1) ^ 63427866;
                        continue block22;
                    }
                    case -1029235637: {
                        ** break;
lbl66:
                        // 1 sources

                        if (!var1_4.endsWith(jP.a((var3_5 | var4_3 ^ 1195250239) ^ (var4_3 ^ -60925125), (var2_2 | var4_3 ^ 1195250239) ^ ((var3_5 | var4_3 ^ 1195250239) ^ (var4_3 ^ 813341891))))) ** break;
                        continue block21;
                        ** continue;
                    }
lbl69:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -1223462256;
                    continue block22;
lbl71:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 169389469;
                    continue block22;
                    case 994360734: {
                        return;
                    }
                    case -199574801: 
                }
                break;
            }
            break;
        }
        throw new SecurityException(jP.a((var3_5 | var4_3 ^ 1904456859) ^ (var4_3 ^ -794358499), (var2_2 | var4_3 ^ 1904456859) ^ ((var3_5 | var4_3 ^ 1904456859) ^ (var4_3 ^ -522532124))));
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
     * Unable to fully structure code
     */
    private static String hex(byte[] var0) {
        var10_1 = -2068975040;
        var9_2 = -1339436500;
        var6_3 = jP.b & -2068975040 ^ -1854420883;
        var8_4 = 0;
        ** GOTO lbl73
lbl6:
        // 1 sources

        return var1_5.toString();
lbl8:
        // 1 sources

        while (true) {
            var7_10 ^= var8_4 ^ 1234018078;
            if (true) ** GOTO lbl71
            break;
        }
        block15: while (true) {
            switch (var8_4) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block15;
                    }
                    break;
                }
lbl16:
                // 2 sources

                while (true) {
                    var8_4 = (var6_3 | var10_1) ^ 71835615;
                    ** GOTO lbl53
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var2_6 = var0;
                    var3_7 = var2_6.length;
                    var4_8 = 0;
                    ** GOTO lbl16
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var8_4 = (var6_3 | var10_1) ^ -1585718783;
                    ** GOTO lbl53
                    break;
                }
                case -953740445: {
                    var7_10 ^= var8_4 ^ -1719031299;
                    ** GOTO lbl42
                }
lbl30:
                // 1 sources

                while (true) {
                    var5_9 = var2_6[var4_8];
                    var1_5.append(String.format(Locale.ROOT, jP.a((var7_10 | var8_4 ^ var9_2) ^ (var8_4 ^ 191462044), (var6_3 | var8_4 ^ var9_2) ^ ((var7_10 | var8_4 ^ var9_2) ^ (var8_4 ^ -66639622))), new Object[]{var5_9 & jP.a((var7_10 | var8_4 ^ var9_2) ^ (var8_4 ^ -1883459676), (var6_3 | var8_4 ^ var9_2) ^ ((var7_10 | var8_4 ^ var9_2) ^ (var8_4 ^ -678591574)))}));
                    ++var4_8;
                    ** continue;
                    break;
                }
lbl36:
                // 1 sources

                while (true) {
                    var7_10 ^= var8_4 ^ -1087936440;
                    ** GOTO lbl69
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var8_4 = (var6_3 | var10_1) ^ 1389947150;
                    ** GOTO lbl-1000
                    break;
                }
lbl42:
                // 1 sources

                var8_4 = (var6_3 | var10_1) ^ -1631173565;
                ** GOTO lbl-1000
                while (true) {
                    var8_4 = (var6_3 | var10_1) ^ -1558744231;
                    ** GOTO lbl53
                    break;
                }
lbl47:
                // 1 sources

                while (true) {
                    if (var4_8 >= var3_7) ** continue;
                    break block15;
                    break;
                }
lbl50:
                // 1 sources

                while (true) {
                    var7_10 ^= var8_4 ^ 1688026529;
                    ** continue;
                    break;
                }
lbl53:
                // 6 sources

                block26: while (true) {
                    switch (var8_4) {
                        default: {
                            continue block26;
                        }
                        case -397270568: {
                            ** continue;
                        }
                        case 921209140: {
                            ** continue;
                        }
                        case 881074284: {
                            ** continue;
                        }
                        case -1850219086: {
                            ** continue;
                        }
                        case -1983681089: {
                            ** continue;
                        }
                        ** case 1242411099:
lbl68:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
lbl69:
                // 1 sources

                var8_4 = (var6_3 | var10_1) ^ 473733074;
                ** GOTO lbl53
lbl71:
                // 1 sources

                var8_4 = (var6_3 | var10_1) ^ 2108545973;
                ** GOTO lbl53
lbl73:
                // 1 sources

                var7_10 = (var6_3 | var10_1) ^ -1911630054;
                var8_4 = (var6_3 | var10_1) ^ 1494023126;
                ** continue;
lbl76:
                // 1 sources

                while (true) {
                    var7_10 ^= 1946072850;
                    ** continue;
                    break;
                }
                case 188333614: {
                    var1_5 = new StringBuilder(var0.length * 2);
                    ** continue;
                }
                case -856489541: {
                    ** continue;
                }
            }
            break;
        }
        var8_4 = (var6_3 | var10_1) ^ -537769418;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$installedFabricMods$0(Path path) {
        int n2 = b & 0x2DC70572 ^ 0x4712208F;
        int n3 = 0;
        int n4 = (n2 | 0x2DC70572) ^ 0x119584FB;
        n3 = (n2 | 0x2DC70572) ^ 0x5308F08E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 76235751: {
                    return Files.isRegularFile(path, new LinkOption[0]);
                }
                case 1021302129: {
                    n3 = (n2 | 0x2DC70572) ^ 0x1CA5F063;
                    continue block5;
                }
                case 1936905628: 
            }
            n4 ^= n3 ^ 0x7AA0868C;
            n3 = (n2 | 0x2DC70572) ^ 0x6B5C6618;
        }
    }
}

