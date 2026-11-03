/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.ToLongFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.av;
import z.r.dr;
import z.r.gj;
import z.r.ho;
import z.r.lk;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class hv
implements av {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    public static final int b;
    private static final Gson a;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String k;
    private static final int[] a;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private final HttpClient a;
    private static final /* synthetic */ String o;
    private final String p;
    private final String q;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private static final /* synthetic */ String x;

    /*
     * Exception decompiling
     */
    hv(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[CASE]], but top level block is 4[SWITCH]
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
    @Override
    public String label() {
        block21: {
            block22: {
                block24: {
                    block23: {
                        block19: {
                            block20: {
                                block25: {
                                    var4_1 = -639564611;
                                    var1_2 = hv.b & -639564611 ^ 209847424;
                                    var3_3 = 0;
                                    break block25;
lbl5:
                                    // 1 sources

                                    while (true) {
                                        v0 = hv.j;
                                        break block19;
                                        break;
                                    }
lbl8:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ -1031374875;
                                        break block20;
                                        break;
                                    }
lbl11:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ -2105550096;
                                        break block21;
                                        break;
                                    }
lbl14:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -1804297600;
                                        break block22;
                                        break;
                                    }
                                }
                                var2_4 = (var1_2 | var4_1) ^ -1314421062;
                                var3_3 = (var1_2 | var4_1) ^ -1660417662;
                                break block22;
                            }
                            var3_3 = (var1_2 | var4_1) ^ -1382706741;
                            break block22;
lbl24:
                            // 1 sources

                            while (true) {
                                if (this.q != null) break block23;
                                var3_3 = (var1_2 | var4_1) ^ -150968983;
                                break block22;
                                break;
                            }
                        }
lbl29:
                        // 2 sources

                        while (true) {
                            var2_4 ^= 905570352;
                            break block24;
                            break;
                        }
lbl32:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 2144757690;
                            break block22;
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 2069140338;
                    break block22;
lbl38:
                    // 1 sources

                    while (true) {
                        v0 = this.q;
                        ** continue;
                        break;
                    }
                }
                return v0;
lbl43:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ 237710571;
                    ** continue;
                    break;
                }
            }
lbl47:
            // 2 sources

            block18: while (true) {
                switch (var3_3) {
                    default: {
                        continue block18;
                    }
                    case -1716224503: {
                        ** continue;
                    }
                    case 1234673213: {
                        ** continue;
                    }
                    case 719544788: {
                        ** continue;
                    }
                    case 1089146175: {
                        ** continue;
                    }
                    case 1886819702: {
                        ** continue;
                    }
                    case -1573559545: {
                        ** continue;
                    }
                    ** case -1497917489:
lbl64:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ 1146583732;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean isRemote() {
        int n2 = b & 0x454D95DC ^ 0xBD5C0B59;
        int n3 = 0;
        int n4 = (n2 | 0x454D95DC) ^ 0xA9084B09;
        n3 = (n2 | 0x454D95DC) ^ 0x2AC332C0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1716534165: {
                    return true;
                }
                case 375590922: {
                    n4 ^= n3 ^ 0x20091C1E;
                    n3 = (n2 | 0x454D95DC) ^ 0x64F25BB6;
                    continue block5;
                }
                case -677466851: 
            }
            n3 = (n2 | 0x454D95DC) ^ 0xEB3E8FD7;
        }
    }

    @Override
    public CompletableFuture<List<dr>> browse() {
        return CompletableFuture.failedFuture(new IllegalStateException());
    }

    @Override
    public CompletableFuture<List<dr>> mine() {
        return CompletableFuture.failedFuture(new IllegalStateException());
    }

    @Override
    public CompletableFuture<ho> download(String string) {
        return CompletableFuture.failedFuture(new IllegalStateException());
    }

    @Override
    public CompletableFuture<dr> publish(String string, String string2, String string3) {
        return CompletableFuture.failedFuture(new IllegalStateException());
    }

    @Override
    public CompletableFuture<dr> share(String string, String string2, String string3) {
        return CompletableFuture.failedFuture(new IllegalStateException());
    }

    @Override
    public CompletableFuture<dr> save(String string, String string2, String string3, String string4, String string5, String string6, boolean bl2) {
        return CompletableFuture.failedFuture(new IllegalStateException());
    }

    @Override
    public CompletableFuture<dr> importCode(String string) {
        return CompletableFuture.failedFuture(new IllegalStateException());
    }

    @Override
    public CompletableFuture<dr> setAutoLoad(String string, boolean bl2) {
        return CompletableFuture.failedFuture(new IllegalStateException());
    }

    @Override
    public CompletableFuture<Void> delete(String string) {
        return CompletableFuture.failedFuture(new IllegalStateException());
    }

    private static int Mc(int n2, int n3) {
        int n4 = 91640778;
        int n5 = -384662449;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xD74344B0)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xED76F465;
        n6 -= (n5 | n4) ^ 0xED7691DD;
        n6 -= (n5 | n4) ^ 0xED76ECCE;
        n6 += (n5 | n4) ^ 0xED7608A5;
        n6 += (n5 | n4) ^ 0xED7694AA;
        n6 ^= (n5 | n4) ^ 0xED762029;
        n6 += (n5 | n4) ^ 0xED761E2F;
        n6 -= (n5 | n4) ^ 0xED760EE2;
        return n6 += (n5 | n4) ^ 0xED766C3B;
    }

    /*
     * Unable to fully structure code
     */
    private CompletableFuture<dr> Md(String var1_1, String var2_2, String var3_3, String var4_4) {
        block21: {
            block24: {
                block22: {
                    block23: {
                        block25: {
                            break block25;
lbl1:
                            // 1 sources

                            while (true) {
                                var8_7 = (var6_6 | var9_5) ^ -113505712;
                                break block21;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                continue;
lbl6:
                                // 1 sources

                                while (true) {
                                    var7_8 ^= var8_7 ^ -1104233345;
                                    break block22;
                                    break;
                                }
                                var5_9 = hv.Me(var2_2, var4_4);
                                var8_7 = (var6_6 | var9_5) ^ -1181698853;
                                break block23;
                                break;
                            }
lbl12:
                            // 1 sources

                            while (true) {
                                var8_7 = (var6_6 | var9_5) ^ 615988325;
                                break block21;
                                break;
                            }
lbl15:
                            // 1 sources

                            while (true) {
                                var8_7 = (var6_6 | var9_5) ^ 2014918186;
                                break block21;
                                break;
                            }
lbl18:
                            // 1 sources

                            while (true) {
                                var8_7 = (var6_6 | var9_5) ^ 1804814057;
                                break block23;
                                break;
                            }
                        }
                        var9_5 = -1177145543;
                        var6_6 = hv.b & -1177145543 ^ -1506898541;
                        var8_7 = 0;
                        var7_8 = (var6_6 | var9_5) ^ 532643704;
                        ** while (true)
lbl27:
                        // 1 sources

                        return this.Mf(var1_1, hv.c, var5_9).thenApply((Function<String, dr>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, Mo(java.lang.String ), (Ljava/lang/String;)Lz/r/dr;)());
lbl29:
                        // 1 sources

                        while (true) {
                            var7_8 ^= var8_7 ^ -31880605;
                            ** continue;
                            break;
                        }
                    }
lbl33:
                    // 3 sources

                    block19: while (true) {
                        switch (var8_7) {
                            default: {
                                continue block19;
                            }
                            case 107879264: {
                                ** continue;
                            }
                            case -1104036086: {
                                var7_8 ^= 863064550;
                                break;
                            }
                            case -730994350: {
                                var7_8 ^= var8_7 ^ -915156814;
                                break block24;
                            }
                            case 1016450010: {
                                var5_9.addProperty(hv.e, var3_3);
                                ** continue;
                            }
                        }
                        var7_8 ^= 1174784923;
                        ** continue;
                        break;
                    }
                }
                var8_7 = (var6_6 | var9_5) ^ -2090113951;
                ** GOTO lbl33
            }
            var8_7 = (var6_6 | var9_5) ^ 30347441;
            ** while (true)
        }
        block20: while (true) {
            switch (var8_7) {
                default: {
                    continue block20;
                }
                case -941123183: {
                    ** continue;
                }
                case 1187161579: {
                    ** continue;
                }
                ** case -1689676834:
lbl66:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static JsonObject Me(String var0, String var1_1) {
        block24: {
            block22: {
                block23: {
                    var6_2 = 718319472;
                    var3_3 = hv.b & 718319472 ^ 1039575790;
                    var5_4 = 0;
                    ** GOTO lbl43
lbl5:
                    // 1 sources

                    while (true) {
                        var4_6 ^= var5_4 ^ 170511728;
                        ** GOTO lbl27
                        break;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ 1002309010;
                        ** GOTO lbl32
                        break;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ -954212029;
                        ** GOTO lbl32
                        break;
                    }
lbl14:
                    // 1 sources

                    return var2_5;
lbl16:
                    // 3 sources

                    block17: while (true) {
                        switch (var5_4) lbl-1000:
                        // 4 sources

                        {
                            default: {
                                continue block17;
                            }
                            case 1218988015: {
                                ** continue;
                            }
                            case -761032807: {
                                ** continue;
                            }
                            case 80830011: {
                                var4_6 ^= var5_4 ^ 611972482;
                                ** GOTO lbl38
                            }
lbl27:
                            // 1 sources

                            var5_4 = (var3_3 | var6_2) ^ 857205694;
                            ** GOTO lbl-1000
lbl29:
                            // 1 sources

                            while (true) {
                                var4_6 ^= var5_4 ^ -1071023793;
                                break block22;
                                break;
                            }
lbl32:
                            // 3 sources

                            block20: while (true) {
                                switch (var5_4) {
                                    default: {
                                        continue block20;
                                    }
                                    case 71871084: {
                                        ** continue;
                                    }
lbl38:
                                    // 1 sources

                                    var5_4 = (var3_3 | var6_2) ^ 478212195;
                                    ** GOTO lbl-1000
lbl40:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ 2002708497;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl43:
                                    // 1 sources

                                    var4_6 = (var3_3 | var6_2) ^ -841580566;
                                    ** continue;
                                    case 594960285: {
                                        var2_5.add(hv.i, (JsonElement)JsonParser.parseString((String)var1_1).getAsJsonObject());
                                        break block17;
                                    }
                                    case 118894539: {
                                        var2_5 = new JsonObject();
                                        ** continue;
                                    }
                                    case -118927683: {
                                        ** continue;
                                    }
                                }
                                break;
                            }
                            case 216089664: {
                                var2_5.addProperty(hv.u, var0);
                                break block23;
                            }
                            case 337858457: {
                                var4_6 ^= var5_4 ^ -967625582;
                                break block24;
                            }
                        }
                        break;
                    }
                    var5_4 = (var3_3 | var6_2) ^ 735436903;
                    ** GOTO lbl16
                }
                var5_4 = (var3_3 | var6_2) ^ 992473541;
                ** GOTO lbl16
            }
            var5_4 = (var3_3 | var6_2) ^ 954236981;
            ** while (true)
        }
        var5_4 = (var3_3 | var6_2) ^ -313188249;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private CompletableFuture<String> Mf(String var1_1, String var2_2, JsonObject var3_3) {
        block13: {
            block12: {
                break block13;
                {
                    var8_5 = (var6_4 | 337607938) ^ 80478510;
lbl2:
                    // 2 sources

                    block6: while (true) {
                        switch (var8_5) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block6;
                                }
                                break;
                            }
                            case -1880209070: {
                                break block5;
                            }
lbl9:
                            // 1 sources

                            return this.Mi(hv.Mh(this.Mg(var1_1).method(var2_2, var5_8), var4_7));
lbl11:
                            // 1 sources

                            while (true) {
                                var7_6 ^= 1226543951;
                                ** continue;
                                break;
                            }
                            case 122825081: {
                                var7_6 ^= var8_5 ^ -1392009185;
                                continue block5;
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                var8_5 = (var6_4 | 337607938) ^ 833697016;
                                ** continue;
                                break;
                            }
lbl20:
                            // 1 sources

                            while (true) {
                                var7_6 ^= -680579439;
                                break block12;
                                break;
                            }
                        }
                        break;
                    }
                }
                var8_5 = (var6_4 | 337607938) ^ -1190308653;
                ** while (true)
            }
            var5_8 = HttpRequest.BodyPublishers.ofByteArray(var4_7);
            ** while (true)
        }
        var6_4 = hv.b & 337607938 ^ -1170206552;
        var8_5 = 0;
        var7_6 = (var6_4 | 337607938) ^ -505139207;
        ** while (true)
        {
            ** case -1164739452:
        }
lbl34:
        // 1 sources

        var4_7 = hv.a.toJson((JsonElement)var3_3).getBytes(StandardCharsets.UTF_8);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private CompletableFuture<List<dr>> list(String string) {
        int n2 = b & 0x83938D7 ^ 0xDCA29116;
        int n3 = 0;
        int n4 = (n2 | 0x83938D7) ^ 0xA28FD214;
        n3 = (n2 | 0x83938D7) ^ 0x3D159642;
        while (true) {
            switch (n3) {
                case 1212923209: {
                    n4 ^= n3 ^ 0x39314B86;
                    n3 = (n2 | 0x83938D7) ^ 0x2A882F7E;
                    break;
                }
                case -164391255: {
                    return this.Mi(hv.Mh(this.Mg(string).GET(), new byte[0])).thenApply(hv::Mm);
                }
                case -508678251: {
                    n3 = (n2 | 0x83938D7) ^ 0x94F0049E;
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    private HttpRequest.Builder Mg(String var1_1) {
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
    static {
        block21: {
            var2 = -1972210271;
            hv.b = mK.a(MethodHandles.lookup().lookupClass(), -960244374);
            var1_1 = 0;
            var0_2 = -1131968737;
            var1_1 = var2 ^ -1301763084;
            break block21;
lbl7:
            // 2 sources

            while (true) {
                var1_1 = var2 ^ 2139936307;
                break block21;
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                hv.w = gj.decode("DA==", hv.Mc(((var0_2 ^= -323944919) | var2) ^ -238918014, var2 ^ ((var0_2 | var2) ^ 509169325)));
                hv.j = gj.decode("yB2sk6uJ", hv.Mc((var0_2 | var2) ^ -238918013, var2 ^ ((var0_2 | var2) ^ 1063287628)));
                hv.o = gj.decode("8rp3KsaSKqo=", hv.Mc((var0_2 | var2) ^ -238918012, var2 ^ ((var0_2 | var2) ^ -767145862)));
                hv.m = gj.decode("XvSCMrfpR4ZtClTJsg==", hv.Mc((var0_2 | var2) ^ -238918011, var2 ^ ((var0_2 | var2) ^ -1362501430)));
                hv.b = gj.decode("HbiHAyoxbHFz/0slzDY=", hv.Mc((var0_2 | var2) ^ -238918010, var2 ^ ((var0_2 | var2) ^ -1132521771)));
                hv.h = gj.decode("VBkzHw==", hv.Mc((var0_2 | var2) ^ -238918009, var2 ^ ((var0_2 | var2) ^ 2144830850)));
                hv.k = gj.decode("biW77Ed5mSxwrcU8cw==", hv.Mc((var0_2 | var2) ^ -238918008, var2 ^ ((var0_2 | var2) ^ -690758139)));
                hv.g = gj.decode("gWkw5oC/CP6pEw==", hv.Mc((var0_2 | var2) ^ -238918007, var2 ^ ((var0_2 | var2) ^ 966202122)));
                hv.s = gj.decode("EGul+0RvhckrLg==", hv.Mc((var0_2 | var2) ^ -238918006, var2 ^ ((var0_2 | var2) ^ 369972955)));
                hv.f = gj.decode("OGltcokxuXg=", hv.Mc((var0_2 | var2) ^ -238918005, var2 ^ ((var0_2 | var2) ^ -1253095986)));
                hv.c = gj.decode("6EHhRQ==", hv.Mc((var0_2 | var2) ^ -238918004, var2 ^ ((var0_2 | var2) ^ 293828834)));
                hv.n = gj.decode("YJUcHVzBfgFKqWRb4IUN", hv.Mc((var0_2 | var2) ^ -238918003, var2 ^ ((var0_2 | var2) ^ -569217350)));
                hv.t = gj.decode("4Us3g+w=", hv.Mc((var0_2 | var2) ^ -238918002, var2 ^ ((var0_2 | var2) ^ -1314999309)));
                hv.e = gj.decode("a4TrIa6W", hv.Mc((var0_2 | var2) ^ -238918001, var2 ^ ((var0_2 | var2) ^ 562244121)));
                hv.u = gj.decode("chV61A==", hv.Mc((var0_2 | var2) ^ -238918000, var2 ^ ((var0_2 | var2) ^ 877097803)));
                hv.i = gj.decode("IbDKQlRf", hv.Mc((var0_2 | var2) ^ -238917999, var2 ^ ((var0_2 | var2) ^ 1627962999)));
                hv.a = gj.decode("kQUmDpvATnYvu/tH", hv.Mc((var0_2 | var2) ^ -238917998, var2 ^ ((var0_2 | var2) ^ 522569489)));
                hv.l = gj.decode("54EkUsoOqvwKCb4rCajOwg==", hv.Mc((var0_2 | var2) ^ -238917997, var2 ^ ((var0_2 | var2) ^ -301406151)));
                hv.v = gj.decode("iuRP5NUcXUvCtA==", hv.Mc((var0_2 | var2) ^ -238917996, var2 ^ ((var0_2 | var2) ^ -592821510)));
                hv.d = gj.decode("yPf0RBwWsCSMCI0=", hv.Mc((var0_2 | var2) ^ -238917995, var2 ^ ((var0_2 | var2) ^ -1999277692)));
                hv.r = gj.decode("MY2BRfA=", hv.Mc((var0_2 | var2) ^ -238917994, var2 ^ ((var0_2 | var2) ^ -1766174366)));
                hv.x = gj.decode("oOjtBg==", hv.Mc((var0_2 | var2) ^ -238917993, var2 ^ ((var0_2 | var2) ^ -802435077)));
                var1_1 = var2 ^ -47507771;
                break block21;
                break;
            }
lbl35:
            // 2 sources

            while (true) {
                var1_1 = var2 ^ -1452853322;
                break block21;
                break;
            }
lbl38:
            // 1 sources

            while (true) {
                var0_2 ^= 1942245360;
                var0_2 ^= -451616245;
                var0_2 ^= -1029091226;
                var0_2 ^= 623188953;
                var0_2 ^= 501332542;
                var0_2 ^= -1094846882;
                v0 = var0_2 ^= -593847318;
                var0_2 ^= 1855623801;
                hv.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ ((v0 | var2) ^ 1076684663 ^ hv.b);
                v1 = v1 + 1;
                v4 = v3 + 4;
                v2 = v2;
                v3 = v4;
                var0_2 ^= 1610654647;
                if (v4 < v2.length) continue;
                ** continue;
                break;
            }
        }
        block20: while (true) {
            switch (var1_1) {
                case 2002346852: {
                    ** GOTO lbl35
                }
                case -616024772: {
                    var0_2 ^= var1_1 ^ 712003685;
                    var1_1 = var2 ^ 856532269;
                    continue block20;
                }
                case 525745831: {
                    var0_2 ^= var1_1 ^ -1703799127;
                    ** GOTO lbl7
                }
                case 941284949: {
                    var1_1 = var2 ^ 1362772125;
                    continue block20;
                }
                case -167861358: {
                    ** break;
                }
                case -1963332158: {
                    var0_2 ^= var1_1 ^ -759869897;
                    ** continue;
                }
                case 1120472730: {
                    hv.a = new Gson();
                    return;
                }
                case 60229204: {
                    var0_2 ^= var1_1 ^ -1528544880;
                    ** continue;
                }
                case 588595735: {
                    switch (var0_2) {
                        default: {
                            var1_1 = var2 ^ -1981451275;
                            continue block20;
                        }
                        case -1047030306: {
                            var1_1 = var2 ^ -1792783610;
                            continue block20;
                        }
                        case 615113847: 
                    }
                    var1_1 = var2 ^ 9148515;
                }
                default: {
                    continue block20;
                }
lbl110:
                // 1 sources

                var1_1 = var2 ^ -927237317;
                continue block20;
                case -1182805876: 
            }
            break;
        }
        v1 = 0;
        v3 = 0;
        hv.a = new int[((var0_2 ^= 398621668) | var2) ^ -629146181];
        var0_2 ^= 2002448981;
        v2 = "z\u00f4\u00f2\u00b4p\u00a2!\u00af\u0006\u00a0\u0092\u00b6\u00ef>.\u00b3EEI\u00c4\u0095\u001b\u0000\u0002\t\u00ad\u009c\u00d3\u0082)\u00e7\u00e7\u00d0\u00ce\u0098>@\u009fqp\u00e3\u0015\u00cc\u00a7\u00d4\u00c6\u00cd\u0089\u00fa {6-t1\u00a0s\u00f1\u00e8\u00ed\u00b6\u001d\u00e2\u008275\u0087\u00e8H\u0017@;Y\u0017\u0014\u00cb\u0005\u0017N(\u00f7\f\u00bc\rc\u00c2\u00b3H\\\u0085\u00e24\u00bb\u00a1\b>".getBytes("ISO-8859-1");
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static HttpRequest Mh(HttpRequest.Builder var0, byte[] var1_1) {
        block12: {
            block10: {
                block11: {
                    break block11;
lbl1:
                    // 4 sources

                    block7: while (true) {
                        switch (var4_4) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block7;
                                }
                                break;
                            }
                            case 737124351: {
                                break block7;
                            }
                            case 586051274: {
                                lk.apply(var0, var1_1);
                                break;
                            }
lbl11:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -707770736;
                                ** continue;
                                break;
                            }
                            case -207402456: {
                                var3_5 ^= var4_4 ^ -1266729738;
                                break block10;
                            }
                        }
                        break;
                    }
                    var4_4 = (var2_3 | var5_2) ^ -2086995473;
                    ** GOTO lbl1
                    {
                        case 353718435: {
                            return var0.build();
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ 228365127;
                    ** GOTO lbl1
                }
                var5_2 = -1105028755;
                var2_3 = hv.b & -1105028755 ^ -29405073;
                var4_4 = 0;
                var3_5 = (var2_3 | var5_2) ^ 84791213;
                ** while (true)
                {
                    ** case 2107973760:
                }
lbl30:
                // 1 sources

                var3_5 ^= var4_4 ^ 1222883360;
                break block12;
            }
            var4_4 = (var2_3 | var5_2) ^ -349533748;
            ** GOTO lbl1
        }
        var4_4 = (var2_3 | var5_2) ^ -590235739;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private CompletableFuture<String> Mi(HttpRequest httpRequest) {
        int n2 = b & 0xFBD1BA99 ^ 0x817C90DC;
        int n3 = 0;
        int n4 = (n2 | 0xFBD1BA99) ^ 0xF00A9A33;
        n3 = (n2 | 0xFBD1BA99) ^ 0x8227A606;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -583528557: {
                    n4 ^= n3 ^ 0x2427E833;
                    n3 = (n2 | 0xFBD1BA99) ^ 0xDC241703;
                    continue block5;
                }
                case 2044337371: {
                    n3 = (n2 | 0xFBD1BA99) ^ 0x26C5B54E;
                    continue block5;
                }
                case 668577246: 
            }
            break;
        }
        HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8);
        n4 ^= 0x3342C4A3;
        n4 ^= 0x8CAED9E3;
        return CompletableFuture.failedFuture(new IllegalStateException()).thenApply(hv::Ml);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String Mj(HttpResponse<String> var0) {
        var5_1 = -257615175;
        var2_2 = hv.b & -257615175 ^ -298078897;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ 1450409592;
        var4_3 = (var2_2 | var5_1) ^ -1421763078;
        ** GOTO lbl50
lbl-1000:
        // 1 sources

        {
            block22: {
                block23: {
                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 462600543;
                        break block22;
                        break;
                    }
lbl10:
                    // 2 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1169730424;
                        break block23;
                        break;
                    }
lbl-1000:
                    // 1 sources

                    {
                        while (true) {
                            var3_4 ^= -801724411;
                            return "Server replied " + var0.statusCode();
                        }
                    }
                }
lbl17:
                // 2 sources

                block20: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block20;
                        }
                        case 11104118: {
                            var3_4 ^= var4_3 ^ 1678839227;
                            var4_3 = (var2_2 | var5_1) ^ -1855375201;
                            continue block20;
                        }
                        case 1876330336: {
                            if (!var1_5.has(hv.r)) ** GOTO lbl10
                            var4_3 = (var2_2 | var5_1) ^ 1159578925;
                            continue block20;
                        }
                        case -1146979630: {
                            var4_3 = (var2_2 | var5_1) ^ 990836266;
                            continue block20;
                        }
                        case -978236971: {
                            if (var1_5.get(hv.r).isJsonPrimitive()) ** break;
                            ** continue;
                            var4_3 = (var2_2 | var5_1) ^ 17601865;
                            continue block20;
                        }
                        case -5035338: {
                            var3_4 ^= var4_3 ^ -1285788565;
                            var4_3 = (var2_2 | var5_1) ^ -1347185507;
                            continue block20;
                        }
                        case 1359752034: {
                            var3_4 ^= 1705574337;
                            return var1_5.get(hv.r).getAsString();
                        }
                        case 1157163895: {
                            var3_4 ^= var4_3 ^ 75135991;
                            var4_3 = (var2_2 | var5_1) ^ -999113288;
                            continue block20;
                        }
                        case 986513991: 
                    }
                    ** continue;
                    break;
                }
            }
            block21: while (true) {
                switch (var4_3) {
                    default: {
                        continue block21;
                    }
                    case 1442718213: {
                        ** continue;
                    }
                    case -450034016: {
                        var3_4 ^= var4_3 ^ -1937393179;
                        var4_3 = (var2_2 | var5_1) ^ -505980238;
                        continue block21;
                    }
                    case 526968141: 
                }
                break;
            }
            var1_5 = JsonParser.parseString((String)var0.body()).getAsJsonObject();
            var4_3 = (var2_2 | var5_1) ^ -32059255;
            ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Mk(String string) {
        int n2 = b & 0x434AABED ^ 0x3746B677;
        int n3 = 0;
        int n4 = (n2 | 0x434AABED) ^ 0x230C470B;
        n3 = (n2 | 0x434AABED) ^ 0x29FCF10A;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1588743925: {
                    break;
                }
                case 1685160433: {
                    n4 ^= n3 ^ 0x70A14C22;
                    n3 = (n2 | 0x434AABED) ^ 0xAC24FCE8;
                    continue block5;
                }
                case -613793001: {
                    return URLEncoder.encode(string, StandardCharsets.UTF_8);
                }
            }
            n3 = (n2 | 0x434AABED) ^ 0x133F3E0E;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ String Ml(HttpResponse var0) {
        block18: {
            block16: {
                block17: {
                    var4_1 = -2080430920;
                    var1_2 = hv.b & -2080430920 ^ 1510234102;
                    var3_3 = 0;
                    ** GOTO lbl24
lbl5:
                    // 1 sources

                    block11: while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1982108748;
                        ** GOTO lbl10
                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1260509507;
lbl10:
                            // 9 sources

                            block13: while (true) {
                                switch (var3_3) {
                                    default: {
                                        continue block13;
                                    }
                                    case -1864454467: {
                                        var2_4 ^= var3_3 ^ -503571367;
                                        break block16;
                                    }
                                    case -379816608: {
                                        return (String)var0.body();
                                    }
                                    case 1159902971: {
                                        var2_4 ^= var3_3 ^ 797032993;
                                        break block17;
                                    }
                                    case -834928424: {
                                        break block11;
                                    }
lbl24:
                                    // 1 sources

                                    var2_4 = (var1_2 | var4_1) ^ 993352239;
                                    break;
                                    case -1066955199: {
                                        throw new RuntimeException(hv.Mj(var0));
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    var3_3 = (var1_2 | var4_1) ^ -1629634299;
                    ** GOTO lbl10
                }
                var3_3 = (var1_2 | var4_1) ^ 1746796684;
                ** GOTO lbl10
lbl33:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 463010239;
                    ** GOTO lbl10
                    break;
                }
lbl36:
                // 2 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 795107760;
                    ** GOTO lbl10
                    break;
                }
                {
                    case -1277069454: {
                        if (var0.statusCode() < hv.Mc((var2_4 | var3_3 ^ 807293898) ^ (var3_3 ^ 36411830), (var1_2 | var3_3 ^ 807293898) ^ ((var2_4 | var3_3 ^ 807293898) ^ (var3_3 ^ 1667444350)))) ** GOTO lbl36
                        break block18;
                    }
                    case 1378098250: {
                        if (var0.statusCode() < hv.Mc((var2_4 | var3_3 ^ -774162190) ^ (var3_3 ^ -470879601), (var1_2 | var3_3 ^ -774162190) ^ ((var2_4 | var3_3 ^ -774162190) ^ (var3_3 ^ -1997498896)))) ** continue;
                        ** continue;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 365131558;
                ** GOTO lbl10
            }
            var3_3 = (var1_2 | var4_1) ^ 849543838;
            ** GOTO lbl10
        }
        var3_3 = (var1_2 | var4_1) ^ -119034108;
        ** while (true)
        {
            case 588830970: {
                ** continue;
            }
            ** case -191162802:
        }
lbl56:
        // 1 sources

        var2_4 ^= var3_3 ^ 1745445704;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ List Mm(String var0) {
        block30: {
            block29: {
                block31: {
                    break block31;
                    while (true) {
                        var6_3 = (var4_2 | var7_1) ^ 1654483363;
                        break block29;
                        break;
                    }
lbl4:
                    // 2 sources

                    while (true) {
                        var6_3 = (var4_2 | var7_1) ^ 922080599;
                        break block29;
                        break;
                    }
                }
                var7_1 = -1848631918;
                var4_2 = hv.b & -1848631918 ^ 1552249148;
                var6_3 = 0;
                var5_5 = (var4_2 | var7_1) ^ 1991276488;
                var6_3 = (var4_2 | var7_1) ^ -268734474;
                block25: while (true) {
                    switch (var6_3) {
                        default: {
                            continue block25;
                        }
                        case -224672755: {
                            var1_4 = new ArrayList<dr>();
                            var5_5 ^= 1811823881;
                            var2_6 = JsonParser.parseString((String)var0).getAsJsonArray().iterator();
                            ** GOTO lbl4
                        }
                        case 841880136: {
                            var6_3 = (var4_2 | var7_1) ^ 48108677;
                            continue block25;
                        }
                        case -552900293: 
                    }
                    var5_5 ^= var6_3 ^ 904522981;
                    var6_3 = (var4_2 | var7_1) ^ 793688499;
                }
lbl29:
                // 2 sources

                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ -2046584170;
                    break block30;
                    break;
                }
            }
            block27: while (true) {
                switch (var6_3) {
                    default: {
                        continue block27;
                    }
                    case -350181143: {
                        var5_5 ^= var6_3 ^ -620757212;
                        var6_3 = (var4_2 | var7_1) ^ -1526971098;
                        continue block27;
                    }
                    case -1822579917: {
                        var5_5 ^= var6_3 ^ 1534259642;
                        var6_3 = (var4_2 | var7_1) ^ 1796544091;
                        continue block27;
                    }
                    case -329063713: {
                        var3_7 = (JsonElement)var2_6.next();
                        var6_3 = (var4_2 | var7_1) ^ 1104965522;
                        break block27;
                    }
                    case -893318939: {
                        var1_4.sort(Comparator.comparingLong((ToLongFunction<dr>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)J, Mn(z.r.dr ), (Lz/r/dr;)J)()).reversed());
                        var6_3 = (var4_2 | var7_1) ^ 1317592717;
                        continue block27;
                    }
                    case 2032744600: {
                        if (!var2_6.hasNext()) ** continue;
                        var6_3 = (var4_2 | var7_1) ^ -836718488;
                        continue block27;
                    }
                    case 334876118: {
                        var5_5 ^= var6_3 ^ -313172657;
                        var6_3 = (var4_2 | var7_1) ^ 834117473;
                        continue block27;
                    }
                    case -1085795299: {
                        var5_5 ^= var6_3 ^ 1394773251;
                        var6_3 = (var4_2 | var7_1) ^ 387216731;
                        continue block27;
                    }
                    case -1228903451: {
                        return var1_4;
                    }
                }
                break;
            }
        }
        block28: while (true) {
            switch (var6_3) {
                default: {
                    continue block28;
                }
                case -1677127124: {
                    var5_5 ^= var6_3 ^ 130333941;
                    var6_3 = (var4_2 | var7_1) ^ 1079031440;
                    continue block28;
                }
                case 425384991: {
                    var1_4.add(dr.fromJson(var3_7.getAsJsonObject()));
                    ** GOTO lbl29
                }
                case 562116964: {
                    var6_3 = (var4_2 | var7_1) ^ -997219935;
                    continue block28;
                }
                case 1540810536: {
                    var5_5 ^= var6_3 ^ 258248357;
                    var6_3 = (var4_2 | var7_1) ^ 2100076134;
                    continue block28;
                }
                case -1594235944: {
                    ** continue;
                }
                case -1652176082: 
            }
            if (var3_7.isJsonObject()) ** break;
            ** continue;
            var6_3 = (var4_2 | var7_1) ^ -61586214;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ long Mn(dr dr2) {
        int n2 = b & 0x54B4832 ^ 0x2D0EEAB6;
        int n3 = 0;
        int n4 = (n2 | 0x54B4832) ^ 0x828FE3E8;
        n3 = (n2 | 0x54B4832) ^ 0x6FD56BE9;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 560545609: {
                    return dr2.a;
                }
                case 1117421919: {
                    n3 = (n2 | 0x54B4832) ^ 0x1B370873;
                    continue block5;
                }
                case 913892037: 
            }
            n4 ^= n3 ^ 0xE201C463;
            n3 = (n2 | 0x54B4832) ^ 0xC26D5FF;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ dr Mo(String var0) {
        var1_1 = hv.b & 1282941497 ^ 473443160;
        var3_2 = 0;
        var2_3 = (var1_1 | 1282941497) ^ -1895812594;
        ** GOTO lbl14
lbl5:
        // 1 sources

        block5: while (true) {
            var3_2 = (var1_1 | 1282941497) ^ 1185209835;
lbl7:
            // 2 sources

            block6: while (true) {
                switch (var3_2) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
                    case -1660437836: {
                        break block5;
                    }
lbl14:
                    // 1 sources

                    var3_2 = (var1_1 | 1282941497) ^ -1048604211;
                    ** continue;
                    case 450688658: {
                        return dr.fromJson(JsonParser.parseString((String)var0).getAsJsonObject());
                    }
                }
                break;
            }
            break;
        }
        var3_2 = (var1_1 | 1282941497) ^ 1332472533;
        ** while (true)
        {
            ** case 320061868:
        }
lbl21:
        // 1 sources

        var2_3 ^= var3_2 ^ 415519462;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ Void Mp(String var0) {
        block9: {
            break block9;
lbl1:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var1_1 = hv.b & 1564340522 ^ -2083214090;
        var3_2 = 0;
        var2_3 = (var1_1 | 1564340522) ^ 1659549690;
        ** GOTO lbl19
        var3_2 = (var1_1 | 1564340522) ^ 1620552008;
        block6: while (true) {
            switch (var3_2) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block6;
                    }
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 1564340522) ^ 706785700;
                    ** GOTO lbl-1000
                    break;
                }
                case -538504035: {
                    ** continue;
                }
lbl19:
                // 1 sources

                var3_2 = (var1_1 | 1564340522) ^ 1763683;
                ** continue;
                case -170046374: {
                    return null;
                }
                case -1083550538: 
            }
            break;
        }
        var2_3 ^= var3_2 ^ -1267284449;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ dr Mq(String string) {
        int n2 = b & 0xF9716072 ^ 0x3620B7C2;
        int n3 = 0;
        int n4 = (n2 | 0xF9716072) ^ 0xE1B3BCF1;
        n3 = (n2 | 0xF9716072) ^ 0xFDF00B9;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1370624578: {
                    n4 ^= n3 ^ 0xF5690C99;
                    n3 = (n2 | 0xF9716072) ^ 0x1CFD447E;
                    continue block5;
                }
                case -477318260: {
                    return dr.fromJson(JsonParser.parseString((String)string).getAsJsonObject());
                }
                case -256968885: 
            }
            n3 = (n2 | 0xF9716072) ^ 0x513C1A4C;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ dr Mr(String string) {
        int n2 = b & 0x9C8BF826 ^ 0x5CE9C85E;
        int n3 = 0;
        int n4 = (n2 | 0x9C8BF826) ^ 0xF30E4DC4;
        n3 = (n2 | 0x9C8BF826) ^ 0x3F741C71;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 266269583: {
                    return dr.fromJson(JsonParser.parseString((String)string).getAsJsonObject());
                }
                case -662975741: {
                    n4 ^= n3 ^ 0x576DACC2;
                    n3 = (n2 | 0x9C8BF826) ^ 0xD3350BF1;
                    continue block5;
                }
                case -476060657: 
            }
            n3 = (n2 | 0x9C8BF826) ^ 0x490337D;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ dr Ms(String string) {
        int n2 = b & 0x87BF9EA8 ^ 0xE6F92E92;
        int n3 = 0;
        int n4 = (n2 | 0x87BF9EA8) ^ 0xDA4DE406;
        n3 = (n2 | 0x87BF9EA8) ^ 0xCCF876CE;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1244411398: {
                    return dr.fromJson(JsonParser.parseString((String)string).getAsJsonObject());
                }
                case -1027460619: {
                    n4 ^= n3 ^ 0x3313115C;
                    n3 = (n2 | 0x87BF9EA8) ^ 0x522C7740;
                    continue block5;
                }
                case 721930356: 
            }
            n3 = (n2 | 0x87BF9EA8) ^ 0x253D8F4F;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ ho Mt(String var0) {
        block11: {
            block10: {
                var3_1 = hv.b & -1389586159 ^ -806026524;
                var5_2 = 0;
                var4_3 = (var3_1 | -1389586159) ^ 2005920633;
                ** GOTO lbl27
lbl5:
                // 1 sources

                while (true) {
                    var5_2 = (var3_1 | -1389586159) ^ 1820939775;
                    break block10;
lbl8:
                    // 1 sources

                    while (true) {
                        var1_4 = JsonParser.parseString((String)var0).getAsJsonObject();
                        ** GOTO lbl25
                        break;
                    }
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    var4_3 ^= 1996010521;
                    ** GOTO lbl24
                    break;
                }
            }
lbl15:
            // 2 sources

            block8: while (true) {
                switch (var5_2) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block8;
                        }
                        break;
                    }
                    case -374863639: {
                        break block8;
                    }
                    case -2089497078: {
                        ** continue;
                    }
lbl24:
                    // 1 sources

                    return new ho(var2_5, hv.a.toJson((JsonElement)var1_4.getAsJsonObject(hv.i)));
lbl25:
                    // 1 sources

                    var4_3 ^= 265860577;
                    break block11;
lbl27:
                    // 1 sources

                    var5_2 = (var3_1 | -1389586159) ^ 106271516;
                    ** continue;
                }
                break;
            }
            var5_2 = (var3_1 | -1389586159) ^ -219074849;
            ** while (true)
            {
                ** case 487372074:
            }
lbl32:
            // 1 sources

            var4_3 ^= var5_2 ^ -1875366755;
            ** while (true)
        }
        var2_5 = dr.fromJson(var1_4.getAsJsonObject(hv.x));
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ List Mu(String var0) {
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

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ long Mv(dr dr2) {
        int n2 = b & 0xD9586DE9 ^ 0x46C3CBA5;
        int n3 = 0;
        int n4 = (n2 | 0xD9586DE9) ^ 0x6DDB2491;
        n3 = (n2 | 0xD9586DE9) ^ 0xD95DEE5F;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -209835576: {
                    n4 ^= n3 ^ 0xDA30BEC;
                    n3 = (n2 | 0xD9586DE9) ^ 0xA4518447;
                    continue block5;
                }
                case 109445554: {
                    break;
                }
                case 2072669098: {
                    return dr2.a;
                }
            }
            n3 = (n2 | 0xD9586DE9) ^ 0x2CA5C625;
        }
    }
}

