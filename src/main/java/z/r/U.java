/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dev.jnic.KERseB.JNICLoader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.SecureRandom;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.at;
import z.r.bG;
import z.r.cQ;
import z.r.dN;
import z.r.hk;
import z.r.ht;
import z.r.ms;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
@Environment(value=EnvType.CLIENT)
public final class U {
    private final String a;
    private static String[] a;
    private final HttpClient a;
    private static Gson a;
    private static SecureRandom a;
    private static int[] a;
    private static String b;
    private final String c;
    public static int b;
    private static String d;
    private static Object[] a;
    private static int a;
    private static volatile String e;
    private static String f;
    static String g;

    /*
     * Exception decompiling
     */
    U(String var1_1) {
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

    native ms signIn(String var1, char[] var2) throws at;

    native cQ beginBrowserSignIn() throws at;

    native ms awaitBrowserSignIn(cQ var1) throws at;

    native ms validate(String var1) throws at;

    native ht downloadPayload(String var1) throws at;

    private native dN requestPayloadTicket(String var1) throws at;

    private static native byte[] decryptPayload(byte[] var0, String var1, String var2, String var3, String var4, String var5) throws at;

    private static native String base64Url(byte[] var0);

    private static native byte[] decodeBase64Url(String var0);

    native String heartbeat(String var1) throws at;

    native ms refresh(ms var1, String var2) throws at;

    native void logout(String var1) throws at;

    private native ms issueSession(String var1) throws at;

    private native HttpRequest.Builder loaderRequest(String var1, String var2);

    native void authorize(HttpRequest.Builder var1, String var2);

    native void authorize(HttpRequest.Builder var1, String var2, byte[] var3);

    /*
     * Enabled aggressive block sorting
     */
    String apiBase() {
        int n2 = b & 0xB2D45771 ^ 0xB1401C6C;
        int n3 = 0;
        int n4 = (n2 | 0xB2D45771) ^ 0xA34A0F9F;
        n3 = (n2 | 0xB2D45771) ^ 0xE7F1037F;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1272881884: {
                    return this.a;
                }
                case 1411734530: {
                    break;
                }
                case -1685556367: {
                    n4 ^= n3 ^ 0xCA461572;
                    n3 = (n2 | 0xB2D45771) ^ 0xF80AFDA1;
                    continue block5;
                }
            }
            n3 = (n2 | 0xB2D45771) ^ 0x285C2C0C;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void observeServerTime(HttpRequest var1_1, HttpResponse<?> var2_2) {
        var8_3 = -1478436399;
        var5_4 = U.b & -1478436399 ^ -1309680379;
        var7_5 = 0;
        var6_6 = (var5_4 | var8_3) ^ -1285794424;
        var7_5 = (var5_4 | var8_3) ^ -1053363976;
        ** GOTO lbl48
lbl-1000:
        // 1 sources

        {
            block21: {
                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ -556797943;
                    break block21;
                    break;
                }
lbl10:
                // 4 sources

                while (true) {
                    var6_6 ^= 1466658159;
                    var6_6 ^= 296910657;
                    return;
                }
lbl14:
                // 1 sources

                block19: while (true) {
                    switch (var7_5) {
                        default: {
                            continue block19;
                        }
                        case 950052086: {
                            var6_6 ^= var7_5 ^ 1016658212;
                            var7_5 = (var5_4 | var8_3) ^ 90449658;
                            continue block19;
                        }
                        case -1299449041: {
                            if (var3_7.getHost() == null) ** GOTO lbl10
                            var7_5 = (var5_4 | var8_3) ^ 768493123;
                            continue block19;
                        }
                        case -1709073514: {
                            var7_5 = (var5_4 | var8_3) ^ -1533552225;
                            continue block19;
                        }
                        case 326632522: {
                            if (!var3_7.getHost().equalsIgnoreCase(var4_9.getHost())) ** GOTO lbl10
                            var7_5 = (var5_4 | var8_3) ^ -518839464;
                            continue block19;
                        }
                        case 1459420813: {
                            var6_6 ^= var7_5 ^ 1246001474;
                            var7_5 = (var5_4 | var8_3) ^ -324561600;
                            continue block19;
                        }
                        case 1531463829: {
                            var6_6 ^= 481855439;
                            if (var3_7.getPort() != var4_9.getPort()) ** GOTO lbl10
                            var7_5 = (var5_4 | var8_3) ^ -2011214232;
                            continue block19;
                        }
                        case 1072731069: {
                            var7_5 = (var5_4 | var8_3) ^ -230274935;
                            continue block19;
                        }
                        case 1168741724: 
                    }
                    hk.observe(var2_2.headers());
                    ** continue;
                    break;
                }
            }
            block20: while (true) {
                switch (var7_5) {
                    default: {
                        continue block20;
                    }
                    case 1993944365: {
                        ** continue;
                    }
                    case 1763716572: {
                        var6_6 ^= var7_5 ^ -1177850086;
                        var7_5 = (var5_4 | var8_3) ^ -901438577;
                        continue block20;
                    }
                    case 2108358234: 
                }
                break;
            }
            var3_7 = URI.create(this.a);
            var6_6 ^= 1840325705;
            var4_9 = var1_1.uri();
            var7_5 = (var5_4 | var8_3) ^ -1890617053;
            ** continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private bG sendSigned(Supplier<HttpRequest.Builder> var1_1, String var2_2, byte[] var3_3, String var4_4) throws at {
        block21: {
            break block21;
lbl-1000:
            // 6 sources

            {
                block23: {
                    block22: {
                        switch (var10_7) {
                            case 1311928607: {
                                ** break;
                            }
                            case 665051755: {
                                break block22;
                            }
                            case 2131253216: {
                                if (Math.abs(hk.offsetMillis() - var5_8) < (2821769135894624196L << (var10_7 ^ 2131253184) >>> (var10_7 ^ 2131253184) ^ (long)var9_10 & 0xFFFFFFFFL | (2821769135894624196L >>> (var10_7 ^ 2131253184) ^ (long)var9_10 & 0xFFFFFFFFL) << (var10_7 ^ 2131253184))) break block23;
                                ** GOTO lbl23
                            }
                            case -1689574703: {
                                var9_10 ^= var10_7 ^ -963430441;
                                ** GOTO lbl21
                            }
                            case -424415288: {
                                if (var7_9.status() != U.a((var9_10 | var10_7 ^ 1974934805) ^ (var10_7 ^ 234192050), (var8_6 | var10_7 ^ 1974934805) ^ ((var9_10 | var10_7 ^ 1974934805) ^ (var10_7 ^ 1031108584)))) break block23;
                                var10_7 = (var8_6 | var11_5) ^ -1267788650;
                            }
lbl16:
                            // 4 sources

                            default: {
                                continue block15;
                            }
                            {
                            }
lbl19:
                            // 1 sources

                            var10_7 = (var8_6 | var11_5) ^ -1206312125;
                            continue block15;
lbl21:
                            // 1 sources

                            var10_7 = (var8_6 | var11_5) ^ -72032226;
                            continue block15;
lbl23:
                            // 1 sources

                            var10_7 = (var8_6 | var11_5) ^ -570521630;
                            continue block15;
                            case 344605918: {
                                var9_10 ^= var10_7 ^ 469312372;
                                var10_7 = (var8_6 | var11_5) ^ 1971263797;
                                ** GOTO lbl16
                            }
                            case 735434174: {
                                var7_9 = this.sendJson(this.signOnce(var1_1, var2_2, var3_3, var4_4));
                                break block23;
                            }
                            case 1752700643: 
                        }
                        return var7_9;
                    }
                    var10_7 = (var8_6 | var11_5) ^ -322658019;
                    continue;
                }
                var10_7 = (var8_6 | var11_5) ^ 143119404;
                ** while (true)
            }
lbl40:
            // 1 sources

            while (true) {
                var10_7 = (var8_6 | var11_5) ^ -2025410013;
                ** GOTO lbl16
                break;
            }
        }
        var11_5 = -1828392227;
        var8_6 = U.b & -1828392227 ^ 281810144;
        var10_7 = 0;
        var9_10 = (var8_6 | var11_5) ^ -222465069;
        var10_7 = (var8_6 | var11_5) ^ 1224093515;
        block18: while (true) {
            switch (var10_7) {
                default: {
                    continue block18;
                }
                case 868375610: {
                    var5_8 = hk.offsetMillis();
                    var9_10 ^= -770889474;
                    var7_9 = this.sendJson(this.signOnce(var1_1, var2_2, var3_3, var4_4));
                    ** continue;
                }
                case -1747729926: {
                    var9_10 ^= var10_7 ^ 217381780;
                    var10_7 = (var8_6 | var11_5) ^ -1609651513;
                    continue block18;
                }
                case -616900170: 
            }
            var10_7 = (var8_6 | var11_5) ^ 69154567;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private HttpRequest signOnce(Supplier<HttpRequest.Builder> var1_1, String var2_2, byte[] var3_3, String var4_4) {
        var9_5 = 1623504943;
        var6_6 = U.b & 1623504943 ^ 1224122374;
        var8_7 = 0;
        var7_8 = (var6_6 | var9_5) ^ -1765906419;
        var8_7 = (var6_6 | var9_5) ^ 306181104;
        ** GOTO lbl48
lbl7:
        // 1 sources

        while (true) {
            var8_7 = (var6_6 | var9_5) ^ -2042369962;
            if (true) ** GOTO lbl48
            break;
        }
        block16: while (true) {
            switch (var8_7) {
                case -1856948601: {
                    var7_8 ^= var8_7 ^ 1325708942;
                    var8_7 = (var6_6 | var9_5) ^ -602074898;
                    continue block16;
                }
                case -793517242: {
                    var5_9.setHeader(U.a((var7_8 | var8_7 ^ -1334355095) ^ (var8_7 ^ -2042282471), (var6_6 | var8_7 ^ -1334355095) ^ ((var7_8 | var8_7 ^ -1334355095) ^ (var8_7 ^ 252568518))), var4_4);
                    ** GOTO lbl41
                }
                case 308180918: {
                    var7_8 ^= var8_7 ^ -2003284902;
                    ** break;
                }
                case 1259374165: {
                    var8_7 = (var6_6 | var9_5) ^ -1203414167;
                    ** GOTO lbl38
                }
                case -1259624255: {
                    this.authorize(var5_9, var2_2, var3_3);
                    ** GOTO lbl43
                }
                case 842259350: {
                    var7_8 ^= var8_7 ^ -586982681;
                    var8_7 = (var6_6 | var9_5) ^ -666135218;
                    continue block16;
                }
lbl33:
                // 1 sources

                var8_7 = (var6_6 | var9_5) ^ -1176437755;
                continue block16;
                case -787069910: {
                    if (var4_4 == null) ** GOTO lbl41
                    var8_7 = (var6_6 | var9_5) ^ 602291834;
                }
lbl38:
                // 4 sources

                while (true) {
                    default: {
                        continue block16;
                    }
                    break;
                }
lbl41:
                // 2 sources

                var8_7 = (var6_6 | var9_5) ^ 1522885561;
                continue block16;
lbl43:
                // 1 sources

                var8_7 = (var6_6 | var9_5) ^ 2057883545;
                continue block16;
lbl45:
                // 1 sources

                while (true) {
                    var8_7 = (var6_6 | var9_5) ^ -106459480;
                    ** continue;
                    break;
                }
lbl48:
                // 2 sources

                block19: while (true) {
                    switch (var8_7) {
                        case 1961778797: {
                            var7_8 ^= var8_7 ^ 1974344970;
                            ** continue;
                        }
                        case 2060012511: {
                            var8_7 = (var6_6 | var9_5) ^ 471393858;
                        }
                        default: {
                            continue block19;
                        }
                        case -290107271: 
                    }
                    break;
                }
                var5_9 = var1_1.get();
                ** continue;
                case -1329779359: 
            }
            break;
        }
        return var5_9.build();
    }

    private static native void requireSecureEndpoint(String var0);

    private static native String sha256(String var0) throws at;

    /*
     * Exception decompiling
     */
    static /* synthetic */ void $jnicClinit() {
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

    private static native String sha256(byte[] var0) throws at;

    static native String releaseId();

    private native bG sendJson(HttpRequest var1) throws at;

    private static native ms sessionFrom(JsonObject var0, String var1);

    private static native String requiredHeader(HttpResponse<?> var0, String var1) throws at;

    private static native String requiredString(JsonObject var0, String var1) throws at;

    private static int a(int n2, int n3) {
        int n4 = -1023125621;
        int n5 = -2136885287;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x9FCF965F)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xC3A5F07D;
        n6 -= (n5 | n4) ^ 0xC3A5DD05;
        n6 += (n5 | n4) ^ 0xC3A5F7D6;
        n6 += (n5 | n4) ^ 0xC3A5CA7A;
        n6 -= (n5 | n4) ^ 0xC3A5A8FE;
        n6 += (n5 | n4) ^ 0xC3A53D37;
        return n6 ^= (n5 | n4) ^ 0xC3A57011;
    }

    private static native boolean booleanValue(JsonObject var0, String var1);

    private static native long longValue(JsonObject var0, String var1, long var2);

    private static native String stringValue(JsonObject var0, String var1);

    private static native String message(JsonObject var0, String var1);

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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ at lambda$requiredHeader$7(String string) {
        int n2 = 913506293;
        int n3 = b & 0x3AB5F0B8 ^ 0xECFB89F8;
        int n4 = 0;
        int n5 = (n3 | 0x3AB5F0B8) ^ 0x58F5A3EF;
        n4 = (n3 | 0x3AB5F0B8) ^ 0x83D2E94;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -155003028: {
                    n4 = (n3 | 0x3AB5F0B8) ^ 0x1158AA6;
                    continue block5;
                }
                case -1412258: {
                    n5 ^= n4 ^ 0x7DE675DA;
                    n4 = (n3 | 0x3AB5F0B8) ^ 0xF238F6B5;
                    continue block5;
                }
                case 214372173: 
            }
            break;
        }
        String string2 = string;
        return new at(U.a((n5 | n4 ^ n2) ^ (n4 ^ 0x9F599625), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xE8DC0A0E))) + string2 + ".", U.a((n5 | n4 ^ n2) ^ (n4 ^ 0x6E1A925A), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xC0DBAF0D))));
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ boolean lambda$requiredHeader$6(String var0) {
        block20: {
            block21: {
                block19: {
                    block18: {
                        var4_1 = 996468235;
                        var1_2 = U.b & 996468235 ^ 1502581069;
                        var3_3 = 0;
                        ** GOTO lbl49
lbl5:
                        // 1 sources

                        return v0;
lbl7:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 606928593;
                            break block18;
                            break;
                        }
lbl10:
                        // 1 sources

                        while (!var0.isBlank()) {
                            ** GOTO lbl45
lbl12:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 2060044953;
                                break block19;
                                break;
                            }
                        }
                        break block21;
                    }
                    var3_3 = (var1_2 | var4_1) ^ -71439690;
                    break block19;
lbl19:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 1779879307;
                        ** GOTO lbl37
                        break;
                    }
                }
lbl23:
                // 2 sources

                block14: while (true) {
                    switch (var3_3) lbl-1000:
                    // 5 sources

                    {
                        while (true) {
                            default: {
                                continue block14;
                            }
                            break;
                        }
                        case 1136012010: {
                            ** continue;
                        }
                        case -2142102023: {
                            ** GOTO lbl10
                        }
                        case 593461540: {
                            ** continue;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1028579356;
                            ** GOTO lbl-1000
                            break;
                        }
lbl37:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ -1968213494;
                        ** GOTO lbl-1000
                        case 19283414: {
                            v0 = false;
                            break block20;
                        }
lbl42:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 945413541;
                            ** GOTO lbl-1000
                            break;
                        }
lbl45:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 1487959659;
                        ** continue;
                        case 1184962387: {
                            ** continue;
                        }
lbl49:
                        // 1 sources

                        var2_4 = (var1_2 | var4_1) ^ -806965528;
                        ** continue;
                        case -247429819: {
                            v0 = true;
                            break block20;
                        }
                        case 1459877141: {
                            var2_4 ^= var3_3 ^ 508213690;
                            break block14;
                        }
                    }
                    break;
                }
                ** while (true)
            }
            var3_3 = (var1_2 | var4_1) ^ 753664602;
            ** while (true)
        }
        var2_4 ^= 1525215115;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ HttpRequest.Builder lambda$logout$5(String var1_1) {
        block8: {
            block9: {
                break block9;
lbl1:
                // 1 sources

                while (true) {
                    block10: {
                        var5_3 = (var2_2 | 747283705) ^ 79472121;
                        break block10;
lbl4:
                        // 1 sources

                        while (true) {
                            var3_5 = this.a;
                            return this.loaderRequest(var3_5 + U.a((var4_4 | var5_3 ^ 1153708356) ^ (var5_3 ^ -1433923696), (var2_2 | var5_3 ^ 1153708356) ^ ((var4_4 | var5_3 ^ 1153708356) ^ (var5_3 ^ -21062211))), var1_1).POST(HttpRequest.BodyPublishers.noBody());
                        }
                    }
lbl8:
                    // 2 sources

                    block7: while (true) {
                        switch (var5_3) {
                            default: {
                                continue block7;
                            }
                            case 1749980605: {
                                ** continue;
                            }
                            case 1242644947: {
                                var4_4 ^= var5_3 ^ 1697255172;
                                break;
                            }
                            case -345878012: {
                                break block8;
                            }
                        }
                        var5_3 = (var2_2 | 747283705) ^ -2020580800;
                        continue;
                        break;
                    }
                    break;
                }
            }
            var2_2 = U.b & 747283705 ^ -278989852;
            var5_3 = 0;
            var4_4 = (var2_2 | 747283705) ^ -1425914114;
            ** while (true)
        }
        var5_3 = (var2_2 | 747283705) ^ -1513114066;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private /* synthetic */ HttpRequest.Builder lambda$refresh$4(String string, byte[] byArray) {
        int n2 = -1557149878;
        int n3 = b & 0x5720513A ^ 0x80259AF9;
        int n4 = 0;
        int n5 = (n3 | 0x5720513A) ^ 0x47DE0A52;
        n4 = (n3 | 0x5720513A) ^ 0x5A0202DB;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -200305040: {
                    String string2 = this.a;
                    HttpRequest.Builder builder = this.loaderRequest(string2 + U.a((n5 | n4 ^ n2) ^ (n4 ^ 0x2ECA289E), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xF07796B4))), string);
                    String string3 = U.a((n5 | n4 ^ n2) ^ (n4 ^ 0x2ECA2891), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x8BD996B4)));
                    String string4 = U.a((n5 | n4 ^ n2) ^ (n4 ^ 0x2ECA2890), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xD27F96B4)));
                    n5 ^= 0xED3A34F9;
                    n5 ^= 0x5456EAF0;
                    return builder.header(string3, string4).POST(HttpRequest.BodyPublishers.ofByteArray(byArray));
                }
                case -1926768352: {
                    n4 = (n3 | 0x5720513A) ^ 0x504787EA;
                    continue block5;
                }
                case -2023597039: 
            }
            n5 ^= n4 ^ 0x3675469F;
            n4 = (n3 | 0x5720513A) ^ 0x232A4D8B;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ HttpRequest.Builder lambda$heartbeat$3(String string) {
        int n2 = b & 0xC0C0BF24 ^ 0x83A288;
        int n3 = 0;
        int n4 = (n2 | 0xC0C0BF24) ^ 0x60EC1C63;
        n3 = (n2 | 0xC0C0BF24) ^ 0x96373E0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1487939794: {
                    n4 ^= n3 ^ 0x2C774026;
                    n3 = (n2 | 0xC0C0BF24) ^ 0x882BA0D2;
                    continue block5;
                }
                case -912208820: {
                    n3 = (n2 | 0xC0C0BF24) ^ 0x678C6882;
                    continue block5;
                }
                case 1223171966: 
            }
            break;
        }
        String string2 = this.a;
        return this.loaderRequest(string2 + U.a((n4 | n3 ^ 0x8828A05A) ^ (n3 ^ 0xE16C545), (n2 | n3 ^ 0x8828A05A) ^ ((n4 | n3 ^ 0x8828A05A) ^ (n3 ^ 0x91AD1F35))), string).POST(HttpRequest.BodyPublishers.noBody());
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ HttpRequest.Builder lambda$requestPayloadTicket$2(String string, byte[] byArray) {
        int n2 = -605033701;
        int n3 = b & 0x97E47DF0 ^ 0x4E69C277;
        int n4 = 0;
        int n5 = (n3 | 0x97E47DF0) ^ 0x5C54B605;
        n4 = (n3 | 0x97E47DF0) ^ 0xB69D1939;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case 1275827947: {
                    String string2 = this.a;
                    HttpRequest.Builder builder = this.loaderRequest(string2 + U.a((n5 | n4 ^ n2) ^ (n4 ^ 0x16DF8CCB), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x6C5616E1))), string);
                    String string3 = U.a((n5 | n4 ^ n2) ^ (n4 ^ 0x16DF8CCC), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0xE26F16E1)));
                    String string4 = U.a((n5 | n4 ^ n2) ^ (n4 ^ 0x16DF8CCD), (n3 | n4 ^ n2) ^ ((n5 | n4 ^ n2) ^ (n4 ^ 0x438D16E1)));
                    n5 ^= 0xA8D4E511;
                    n5 ^= 0x5C3FFE31;
                    return builder.header(string3, string4).POST(HttpRequest.BodyPublishers.ofByteArray(byArray));
                }
                case -2045056330: {
                    n5 ^= n4 ^ 0xF69ADD69;
                    n4 = (n3 | 0x97E47DF0) ^ 0x93E6691C;
                    continue block5;
                }
                case 1769006798: 
            }
            n4 = (n3 | 0x97E47DF0) ^ 0x59F71541;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ HttpRequest.Builder lambda$requestPayloadTicket$1(String string) {
        int n2 = b & 0xCCEBE7F8 ^ 0x703E3BAF;
        int n3 = 0;
        int n4 = (n2 | 0xCCEBE7F8) ^ 0x1CF669F1;
        n3 = (n2 | 0xCCEBE7F8) ^ 0xAC62056;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -163979351: {
                    n3 = (n2 | 0xCCEBE7F8) ^ 0xA621EB97;
                    continue block5;
                }
                case 1383696199: {
                    String string2 = this.a;
                    return this.loaderRequest(string2 + U.a((n4 | n3 ^ 0x9E9260BF) ^ (n3 ^ 0x30BF1D66), (n2 | n3 ^ 0x9E9260BF) ^ ((n4 | n3 ^ 0x9E9260BF) ^ (n3 ^ 0x3E338741))), string).POST(HttpRequest.BodyPublishers.noBody());
                }
                case 1524503656: 
            }
            n4 ^= n3 ^ 0x319A5B5F;
            n3 = (n2 | 0xCCEBE7F8) ^ 0xAE8678B8;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ HttpRequest.Builder lambda$validate$0(String string) {
        int n2 = b & 0x88531B93 ^ 0x6F2E2CDE;
        int n3 = 0;
        int n4 = (n2 | 0x88531B93) ^ 0x860AA69C;
        n3 = (n2 | 0x88531B93) ^ 0x4096BF1E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1947978078: {
                    String string2 = this.a;
                    return this.loaderRequest(string2 + U.a((n4 | n3 ^ 0x3B72D31) ^ (n3 ^ 0x8BBA0CE8), (n2 | n3 ^ 0x3B72D31) ^ ((n4 | n3 ^ 0x3B72D31) ^ (n3 ^ 0x2E5356EE))), string).POST(HttpRequest.BodyPublishers.noBody());
                }
                case -1343651647: {
                    n3 = (n2 | 0x88531B93) ^ 0x9B388D94;
                    continue block5;
                }
                case 1950855755: 
            }
            n4 ^= n3 ^ 0x38156C1B;
            n3 = (n2 | 0x88531B93) ^ 0x649B097D;
        }
    }

    public static native /* synthetic */ void $jnicLoader();

    static {
        JNICLoader.init();
        U.$jnicLoader();
        U.$jnicClinit();
    }
}

