/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_8685
 */
package z.r;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_8685;
import z.r.ab;
import z.r.cf;
import z.r.dT;
import z.r.ez;
import z.r.jO;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class ac {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final String e;
    private static final long a;
    private static final long b;
    private static final Map<String, cf> a;
    private static volatile int a;
    private static final ExecutorService a;
    private static final /* synthetic */ String f;
    private static final HttpClient a;
    private static final /* synthetic */ String g;
    private static final Map<String, CompletableFuture<Optional<class_8685>>> b;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final String k;
    private static final Duration a;
    private static final String l;
    private static final /* synthetic */ String m;
    public static final int b;
    private static final Map<String, byte[]> c;
    private static final Map<String, ab> d;
    private static final int[] a;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String t;

    /*
     * Enabled aggressive block sorting
     */
    private ac() {
        int n2 = b & 0x9A1632D3 ^ 0x4C4DDED1;
        int n3 = (n2 | 0x9A1632D3) ^ 0x62360A72;
        block4: while (true) {
            switch (n3) {
                case 1151812531: {
                    n3 ^= 0x86284D72;
                    continue block4;
                }
                default: {
                    n3 ^= 0xAB41C7BA;
                    break block4;
                }
                case 1102839487: {
                    n3 ^= 0xE82F96CD;
                    break block4;
                }
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void request(String var0) {
        block49: {
            var7_1 = 1981828779;
            var4_2 = ac.b & 1981828779 ^ 1035652193;
            var6_3 = 0;
            var5_4 = (var4_2 | var7_1) ^ 27129112;
            var6_3 = (var4_2 | var7_1) ^ 111916158;
            ** GOTO lbl93
lbl7:
            // 2 sources

            while (true) {
                var6_3 = (var4_2 | var7_1) ^ -2063729128;
                ** GOTO lbl93
lbl10:
                // 1 sources

                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ 873929858;
                    if (true) ** GOTO lbl66
lbl13:
                    // 1 sources

                    while (true) {
                        var6_3 = (var4_2 | var7_1) ^ 713288584;
                        break block49;
                        break;
                    }
                    break;
                }
                break;
            }
lbl16:
            // 1 sources

            while (true) {
                var6_3 = (var4_2 | var7_1) ^ -1139554012;
                break block49;
                break;
            }
            block39: while (true) {
                block50: {
                    var6_3 = (var4_2 | var7_1) ^ 1559146482;
                    break block50;
lbl22:
                    // 1 sources

                    while (true) {
                        block51: {
                            var6_3 = (var4_2 | var7_1) ^ -2113447453;
                            break block51;
lbl25:
                            // 1 sources

                            while (true) {
                                var6_3 = (var4_2 | var7_1) ^ 2034010652;
                                if (true) ** GOTO lbl30
                                block42: while (true) {
                                    var6_3 = (var4_2 | var7_1) ^ 143071091;
lbl30:
                                    // 2 sources

                                    block43: while (true) {
                                        block52: {
                                            switch (var6_3) {
                                                case 2000542104: {
                                                    return;
                                                }
                                                case 1967083154: {
                                                    ** break;
                                                }
                                                case -1316969280: {
                                                    if (System.currentTimeMillis() - var2_6.at() < var2_6.backoffMs()) {
                                                        var6_3 = (var4_2 | var7_1) ^ -1861460933;
                                                        continue block43;
                                                    }
                                                    ** GOTO lbl61
                                                }
                                                case -290024752: {
                                                    var5_4 ^= var6_3 ^ 532350187;
                                                    continue block42;
                                                }
                                                case 2012206271: {
                                                    var5_4 ^= var6_3 ^ -1645190008;
                                                    ** break;
                                                }
                                                case 109462775: {
                                                    var5_4 ^= var6_3 ^ 1146388526;
                                                    break block52;
                                                }
lbl50:
                                                // 1 sources

                                                var6_3 = (var4_2 | var7_1) ^ -835032533;
                                                continue block43;
lbl52:
                                                // 1 sources

                                                var6_3 = (var4_2 | var7_1) ^ -475001347;
                                                continue block43;
                                                case -1677016298: {
                                                    var3_7 = ac.a;
                                                    ** continue;
                                                }
                                                case 1586353669: {
                                                    if (var2_6 != null) {
                                                        var6_3 = (var4_2 | var7_1) ^ 176521337;
                                                        continue block43;
                                                    }
lbl61:
                                                    // 3 sources

                                                    var6_3 = (var4_2 | var7_1) ^ 139795028;
                                                }
                                            }
                                            continue;
                                        }
                                        var6_3 = (var4_2 | var7_1) ^ 557258990;
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        block44: while (true) {
                            switch (var6_3) {
                                default: {
                                    continue block44;
                                }
                                case 2139446332: {
                                    if (!ac.a.containsKey(var1_5)) break;
                                    var6_3 = (var4_2 | var7_1) ^ 634297869;
                                    continue block44;
                                }
                                case 1269682793: {
                                    return;
                                }
                                case -37906680: {
                                    var5_4 ^= var6_3 ^ -296654517;
                                    var6_3 = (var4_2 | var7_1) ^ 4166359;
                                    continue block44;
                                }
                                case 1440003521: {
                                    var5_4 ^= var6_3 ^ 900614728;
                                    var6_3 = (var4_2 | var7_1) ^ -922468605;
                                    continue block44;
                                }
                                case -1229000216: {
                                    var2_6 = (ab)ac.d.get(var1_5);
                                    ** continue;
                                }
                                case 1517572326: {
                                    var5_4 ^= var6_3 ^ -1507255349;
                                    ** continue;
                                }
                            }
                            var6_3 = (var4_2 | var7_1) ^ 711883562;
                        }
                        break;
                    }
                }
                block45: while (true) {
                    block53: {
                        block54: {
                            block55: {
                                switch (var6_3) {
                                    default: {
                                        continue block45;
                                    }
                                    case -1482016643: {
                                        var6_3 = (var4_2 | var7_1) ^ -1752930452;
                                        continue block45;
                                    }
                                    case 2031188629: {
                                        var6_3 = (var4_2 | var7_1) ^ -58673588;
                                        continue block45;
                                    }
                                    case -2093320025: {
                                        var5_4 ^= var6_3 ^ -1936005088;
                                        break block53;
                                    }
                                    case 1914530365: {
                                        var1_5 = ac.sU(var0);
                                        ** continue;
                                    }
                                    case -79220493: {
                                        var5_4 ^= var6_3 ^ 1064966652;
                                        break block54;
                                    }
                                    case -398546553: {
                                        if (!var0.isBlank()) continue block39;
                                        ** GOTO lbl7
                                    }
                                    case -406168223: {
                                        return;
                                    }
                                    case 592732441: {
                                        var5_4 ^= var6_3 ^ 536922798;
                                        break;
                                    }
                                    case 1635688823: {
                                        if (var0 != null) ** break;
                                        ** continue;
                                        break block55;
                                    }
                                }
                                var6_3 = (var4_2 | var7_1) ^ 229090518;
                                continue;
                            }
                            var6_3 = (var4_2 | var7_1) ^ -669976938;
                            continue;
                        }
                        var6_3 = (var4_2 | var7_1) ^ -1737452662;
                        continue;
                    }
                    var6_3 = (var4_2 | var7_1) ^ 516190108;
                }
                break;
            }
        }
        block46: while (true) {
            switch (var6_3) {
                default: {
                    continue block46;
                }
                case 1429808483: {
                    var5_4 ^= var6_3 ^ -2136545141;
                    var6_3 = (var4_2 | var7_1) ^ -1614311835;
                    continue block46;
                }
                case -1012332593: {
                    return;
                }
                case -1824905984: {
                    var5_4 ^= var6_3 ^ 1641858069;
                    ** continue;
                }
                case -528662386: 
            }
            ac.b.computeIfAbsent(var1_5, (Function<String, CompletableFuture>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, tk(java.lang.String int java.lang.String ), (Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;)((String)var0, (int)var3_7));
            var6_3 = (var4_2 | var7_1) ^ -327095317;
        }
    }

    /*
     * Exception decompiling
     */
    public static void prefetch(Collection<String> var0) {
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
    public static boolean isPending(String var0) {
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
    public static Optional<class_8685> getIfReady(String var0) {
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
    public static Optional<class_2960> getTextureIdIfReady(String string) {
        int n2 = b & 0x25EC80A ^ 0x5C0116BB;
        int n3 = 0;
        int n4 = (n2 | 0x25EC80A) ^ 0xA6A5A0D0;
        n3 = (n2 | 0x25EC80A) ^ 0x85CF41AC;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -611279081: {
                    break;
                }
                case 1552131338: {
                    return ac.getIfReady(string).map(ac::tj);
                }
                case 414398086: {
                    n4 ^= n3 ^ 0x4D5501ED;
                    n3 = (n2 | 0x25EC80A) ^ 0x2DC7BB1;
                    continue block5;
                }
            }
            n3 = (n2 | 0x25EC80A) ^ 0x46ECE83D;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static byte[] getSkinPngIfReady(String string) {
        int n2 = b & 0xE3D6D720 ^ 0xF3768995;
        int n3 = 0;
        int n4 = (n2 | 0xE3D6D720) ^ 0x401B1E8A;
        n3 = (n2 | 0xE3D6D720) ^ 0x737A0A66;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -2138253869: {
                    n3 = (n2 | 0xE3D6D720) ^ 0x527FB485;
                    continue block5;
                }
                case -1584829648: {
                    n4 ^= n3 ^ 0x142D6431;
                    n3 = (n2 | 0xE3D6D720) ^ 0x9C6747A2;
                    continue block5;
                }
                case 1871812631: 
            }
            break;
        }
        return (byte[])c.get(ac.sU(string));
    }

    /*
     * Exception decompiling
     */
    public static jO status(String var0) {
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static int session() {
        int n2 = b & 0x86193EA2 ^ 0x1A2B2DE;
        int n3 = 0;
        int n4 = (n2 | 0x86193EA2) ^ 0xD89376C1;
        n3 = (n2 | 0x86193EA2) ^ 0x1F3EBF55;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0x86193EA2) ^ 0x1DE83EFB;
            }
            block6: while (true) {
                switch (n3) {
                    case -1736113749: {
                        n3 = (n2 | 0x86193EA2) ^ 0x64C66B;
                    }
                    default: {
                        continue block6;
                    }
                    case -2015397739: {
                        n4 ^= n3 ^ 0xFA1ABC2D;
                        continue block5;
                    }
                    case -1705803771: 
                }
                break;
            }
            break;
        }
        return a;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void clear() {
        block41: {
            var6 = -64652361;
            var3_1 = ac.b & -64652361 ^ -612863395;
            var5_2 = 0;
            var4_4 = (var3_1 | var6) ^ 155794820;
            var5_2 = (var3_1 | var6) ^ 267638677;
            break block41;
lbl7:
            // 1 sources

            while (true) {
                block42: {
                    var4_4 ^= -939943889;
                    var1_5 = ac.a.values().iterator();
                    break block42;
lbl11:
                    // 1 sources

                    while (true) {
                        var5_2 = (var3_1 | var6) ^ 1417834611;
                        ** GOTO lbl55
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var5_2 = (var3_1 | var6) ^ -1716506753;
                        ** GOTO lbl55
                        break;
                    }
                    var5_2 = (var3_1 | var6) ^ 810971672;
                    block33: while (true) {
                        switch (var5_2) {
                            case -819263001: {
                                var4_4 ^= var5_2 ^ 94280176;
                                var5_2 = (var3_1 | var6) ^ 1130003187;
                                continue block33;
                            }
                            case -899942908: {
                                break block33;
                            }
                            case -1138294516: {
                                var2_6.destroy(var0_3);
                                var5_2 = (var3_1 | var6) ^ -754068670;
                            }
                            default: {
                                continue block33;
                            }
                            case 745580733: {
                                var4_4 ^= var5_2 ^ 3441415;
                                ** break;
lbl36:
                                // 1 sources

                                var5_2 = (var3_1 | var6) ^ 891719163;
                                continue block33;
                            }
                        }
                        break;
                    }
                }
                var5_2 = (var3_1 | var6) ^ -1135951155;
                ** GOTO lbl103
                break;
            }
lbl41:
            // 1 sources

            while (true) {
                var5_2 = (var3_1 | var6) ^ 0x7757555B;
                break block41;
                break;
            }
lbl44:
            // 1 sources

            while (true) {
                var5_2 = (var3_1 | var6) ^ 1321229953;
                ** GOTO lbl55
                break;
            }
lbl47:
            // 1 sources

            while (true) {
                var5_2 = (var3_1 | var6) ^ 1423501257;
                if (true) ** GOTO lbl55
                break;
            }
            block37: while (true) {
                var5_2 = (var3_1 | var6) ^ -763897592;
                if (true) ** GOTO lbl55
                block38: while (true) {
                    var5_2 = (var3_1 | var6) ^ -1906739009;
lbl55:
                    // 6 sources

                    block39: while (true) {
                        switch (var5_2) {
                            case -1409348724: {
                                var4_4 ^= var5_2 ^ 601876703;
                                var5_2 = (var3_1 | var6) ^ -838615614;
                                continue block39;
                            }
                            case 1471397914: {
                                ac.c.clear();
                                var5_2 = (var3_1 | var6) ^ 1320737718;
                                continue block39;
                            }
                            case -1105158387: {
                                var4_4 ^= var5_2 ^ -1173442716;
                                ** continue;
                            }
                            case -1415209930: {
                                ac.a.clear();
                                ** break;
                            }
                            case 1779800109: {
                                var4_4 ^= var5_2 ^ -1681583176;
                                var5_2 = (var3_1 | var6) ^ -1462846491;
                                continue block39;
                            }
                            case 958558017: {
                                ac.b.clear();
                                var5_2 = (var3_1 | var6) ^ 1096672498;
                                continue block39;
                            }
                            case -77254380: {
                                if (!var1_5.hasNext()) continue block38;
                                ** continue;
                            }
                            case 1127725362: {
                                var4_4 ^= var5_2 ^ 770105804;
                                var5_2 = (var3_1 | var6) ^ 68700907;
                                continue block39;
                            }
                            case 1898185536: {
                                var4_4 ^= var5_2 ^ 791684310;
                                ** continue;
                            }
                            case 830391869: {
                                var2_6 = (cf)var1_5.next();
                                ** continue;
                            }
lbl92:
                            // 1 sources

                            var5_2 = (var3_1 | var6) ^ -1788288046;
                            ** GOTO lbl103
                            case -1313004162: {
                                ac.d.clear();
                                continue block37;
                            }
                            case 755671799: {
                                var4_4 ^= var5_2 ^ 2013440892;
                                ** continue;
                            }
                            case -1312448439: {
                                var4_4 ^= var5_2 ^ -1837126483;
                                var5_2 = (var3_1 | var6) ^ -966847298;
                            }
lbl103:
                            // 4 sources

                            default: {
                                continue block39;
                            }
                            case 1724732544: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            return;
        }
        block40: while (true) {
            switch (var5_2) {
                default: {
                    continue block40;
                }
                case 265146543: {
                    var4_4 ^= var5_2 ^ -99001630;
                    var5_2 = (var3_1 | var6) ^ 123037256;
                    continue block40;
                }
                case -259085206: {
                    var5_2 = (var3_1 | var6) ^ -256857264;
                    continue block40;
                }
                case -2010501468: {
                    var4_4 ^= var5_2 ^ 2073432959;
                    var5_2 = (var3_1 | var6) ^ -812173438;
                    continue block40;
                }
                case -131588681: {
                    ++ac.a;
                    ** continue;
                }
                case 820661373: 
            }
            break;
        }
        var0_3 = class_310.method_1551();
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static void shutdown() {
        block16: {
            block17: {
                break block17;
lbl1:
                // 1 sources

                block9: while (true) {
                    var2_2 = (var0_1 | var3) ^ 34170148;
                    if (true) ** GOTO lbl8
lbl4:
                    // 1 sources

                    return;
                    block11: while (true) {
                        var2_2 = (var0_1 | var3) ^ -900351472;
lbl8:
                        // 4 sources

                        block12: while (true) {
                            switch (var2_2) lbl-1000:
                            // 4 sources

                            {
                                default: {
                                    continue block12;
                                }
                                case -1611102265: {
                                    ** continue;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    var2_2 = (var0_1 | var3) ^ -1530884633;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case 1543080165: {
                                    break block16;
                                }
                                case 2050847381: {
                                    var1_3 ^= var2_2 ^ 973480763;
                                    break block9;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    var2_2 = (var0_1 | var3) ^ -2063304809;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case -480227299: {
                                    ac.clear();
                                    continue block11;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                var2_2 = (var0_1 | var3) ^ 1090877621;
                ** GOTO lbl8
                {
                    case -1172488237: {
                        var1_3 ^= var2_2 ^ 1097819067;
                        var2_2 = (var0_1 | var3) ^ 1033744239;
                        ** GOTO lbl-1000
                    }
                }
            }
            var3 = 1517084434;
            var0_1 = ac.b & 1517084434 ^ -557994126;
            var2_2 = 0;
            var1_3 = (var0_1 | var3) ^ 1483765710;
            ** while (true)
            {
                case -587949482: {
                    ac.a.shutdownNow();
                    ** continue;
                }
                ** case 346572130:
            }
lbl45:
            // 1 sources

            var1_3 ^= var2_2 ^ 1325167005;
            ** while (true)
        }
        var2_2 = (var0_1 | var3) ^ 1692450977;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String sU(String string) {
        int n2 = b & 0xE5E2B3E9 ^ 0x63A761AD;
        int n3 = 0;
        int n4 = (n2 | 0xE5E2B3E9) ^ 0x66575777;
        n3 = (n2 | 0xE5E2B3E9) ^ 0xA316C9DA;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1156659767: {
                    n3 = (n2 | 0xE5E2B3E9) ^ 0x71C01B23;
                    continue block5;
                }
                case 586668507: {
                    return string.trim().toLowerCase(Locale.ROOT);
                }
                case -1775769394: 
            }
            n4 ^= n3 ^ 0x94620BAE;
            n3 = (n2 | 0xE5E2B3E9) ^ 0xC5102A36;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Optional<class_8685> sV(String var0, String var1_1) {
        var11_2 = 679261918;
        var8_3 = ac.b & 679261918 ^ -339459530;
        var10_4 = 0;
        var9_5 = (var8_3 | var11_2) ^ -920155648;
        var10_4 = (var8_3 | var11_2) ^ 1092078474;
        block49: while (true) {
            switch (var10_4) {
                default: {
                    continue block49;
                }
                case -1427423884: {
                    try {
                        var10_4 = (var8_3 | var11_2) ^ 1644645976;
                        continue block49;
                    }
                    catch (ez v0) {
                        var9_5 = (var8_3 | var11_2) ^ -401921381;
                        var2_6 = v0;
                        var9_5 ^= 379642826;
                        throw var2_6;
                    }
                    catch (IOException | InterruptedException v1) {
                        var9_5 = (var8_3 | var11_2) ^ -848733441;
                        var2_6 = v1;
                        var9_5 ^= 2030071205;
                        if (!(var2_6 instanceof InterruptedException)) ** GOTO lbl51
                        var10_4 = (var8_3 | var11_2) ^ 736772725;
                        ** GOTO lbl135
                    }
                    catch (RuntimeException v2) {
                        var9_5 = (var8_3 | var11_2) ^ -895375283;
                        var2_6 = v2;
                        var9_5 ^= -1994327980;
                        return Optional.empty();
                    }
                }
                {
                    while (true) {
                        var10_4 = (var8_3 | var11_2) ^ 819909157;
                        ** GOTO lbl54
                        break;
                    }
lbl34:
                    // 2 sources

                    while (true) {
                        var10_4 = (var8_3 | var11_2) ^ 835386709;
                        ** GOTO lbl89
                        while (true) {
                            var10_4 = (var8_3 | var11_2) ^ 10385928;
                            ** GOTO lbl89
                            break;
                        }
                        break;
                    }
                    while (true) {
                        var10_4 = (var8_3 | var11_2) ^ -1884910800;
                        ** GOTO lbl89
                        break;
                    }
lbl43:
                    // 2 sources

                    while (true) {
                        var9_5 ^= 1600293893;
                        var6_10 = v3;
                        var9_5 ^= 43262080;
                        var7_11 = ac.a;
                        var9_5 ^= 638460098;
                        var9_5 ^= 1281292393;
                        return ac.sW(var7_11, var1_1, (String)var2_6, var0, var4_8, var5_9, var6_10);
                    }
lbl51:
                    // 2 sources

                    while (true) {
                        var10_4 = (var8_3 | var11_2) ^ -1989820080;
                        ** GOTO lbl135
                        break;
                    }
lbl54:
                    // 2 sources

                    block56: while (true) {
                        switch (var10_4) {
                            default: {
                                continue block56;
                            }
                            case -1103750076: {
                                var9_5 ^= var10_4 ^ -762420394;
                                var10_4 = (var8_3 | var11_2) ^ -1831547120;
                                continue block56;
                            }
                            case 2032679406: {
                                if (var4_8 != null) {
                                    var10_4 = (var8_3 | var11_2) ^ -1086775676;
                                    continue block56;
                                }
lbl66:
                                // 3 sources

                                while (true) {
                                    var10_4 = (var8_3 | var11_2) ^ 229527757;
                                    continue block56;
                                    break;
                                }
                            }
                            case 1422256250: {
                                var10_4 = (var8_3 | var11_2) ^ -1520687261;
                                continue block56;
                            }
                            case 1319162269: {
                                if (var4_8.skinUrl() != null) ** continue;
                                ** continue;
                            }
                            case -430791117: {
                                var9_5 ^= var10_4 ^ 634517150;
                                var10_4 = (var8_3 | var11_2) ^ 428611279;
                                continue block56;
                            }
                            case -227483599: {
                                var9_5 ^= 1679076939;
                                return Optional.empty();
                            }
                            case -618519333: {
                                var9_5 ^= var10_4 ^ 100628715;
                                var10_4 = (var8_3 | var11_2) ^ 1673334165;
                                continue block56;
                            }
                            case -2008941717: 
                        }
                        var5_9 = ac.tb(var4_8.skinUrl());
                        var10_4 = (var8_3 | var11_2) ^ 303824036;
lbl89:
                        // 4 sources

                        block58: while (true) {
                            switch (var10_4) {
                                default: {
                                    continue block58;
                                }
                                case -102299046: {
                                    var9_5 ^= var10_4 ^ -390679096;
                                    var10_4 = (var8_3 | var11_2) ^ 1381270046;
                                    continue block58;
                                }
                                case -1180142368: {
                                    if (var5_9 == null) ** GOTO lbl34
                                    var10_4 = (var8_3 | var11_2) ^ 529672425;
                                    continue block58;
                                }
                                case -194060777: {
                                    var10_4 = (var8_3 | var11_2) ^ -1784548644;
                                    continue block58;
                                }
                                case 2120025122: {
                                    if (var5_9.length != 0) ** continue;
                                    ** continue;
                                }
                                case -633992277: {
                                    var9_5 ^= var10_4 ^ -631149014;
                                    var10_4 = (var8_3 | var11_2) ^ 750770213;
                                    continue block58;
                                }
                                case -951898405: {
                                    throw new ez(ac.j);
                                }
                                case -345862922: {
                                    var9_5 ^= var10_4 ^ -144851760;
                                    var10_4 = (var8_3 | var11_2) ^ 1975215111;
                                    continue block58;
                                }
                                case -1639476487: {
                                    if (var4_8.capeUrl() != null) ** continue;
                                    var10_4 = (var8_3 | var11_2) ^ -538018434;
                                    continue block58;
                                }
                                case 873630592: {
                                    var9_5 ^= var10_4 ^ 1243672339;
                                    var10_4 = (var8_3 | var11_2) ^ 1538866793;
                                    continue block58;
                                }
                                case -1337603945: {
                                    v3 = null;
                                    ** GOTO lbl43
                                }
                                case 1683652046: {
                                    var9_5 ^= var10_4 ^ 443029853;
                                    var10_4 = (var8_3 | var11_2) ^ 137793027;
                                    continue block58;
                                }
                                case -473270019: 
                            }
                            break;
                        }
                        v3 = ac.tc(var4_8.capeUrl());
                        ** continue;
                        break;
                    }
                }
lbl135:
                // 2 sources

                block59: while (true) {
                    switch (var10_4) {
                        default: {
                            continue block59;
                        }
                        case -1072253813: {
                            var10_4 = (var8_3 | var11_2) ^ 772219473;
                            continue block59;
                        }
                        case -973351761: {
                            Thread.currentThread().interrupt();
                            ** continue;
                        }
                        case 1654208430: {
                            var9_5 ^= var10_4 ^ -1245472992;
                            var10_4 = (var8_3 | var11_2) ^ 206410725;
                            continue block59;
                        }
                        case -407804645: 
                    }
                    break;
                }
                throw new ez((Throwable)var2_6);
                case -1979991898: {
                    var9_5 ^= var10_4 ^ -1738097328;
                    var10_4 = (var8_3 | var11_2) ^ 1813397624;
                    continue block49;
                }
                case -2014660986: 
            }
            break;
        }
        var2_6 = ac.sY(var0);
        var10_4 = (var8_3 | var11_2) ^ -1688760845;
        block60: while (true) {
            switch (var10_4) {
                default: {
                    continue block60;
                }
                case 1890286349: {
                    var9_5 ^= var10_4 ^ 1408087788;
                    var10_4 = (var8_3 | var11_2) ^ 598974375;
                    continue block60;
                }
                case -934319783: {
                    if (var2_6 == null) {
                        var10_4 = (var8_3 | var11_2) ^ -444220628;
                        continue block60;
                    }
                    var10_4 = (var8_3 | var11_2) ^ 113278944;
                    continue block60;
                }
                case 242830802: {
                    var9_5 ^= var10_4 ^ 221394884;
                    var10_4 = (var8_3 | var11_2) ^ -682739821;
                    continue block60;
                }
                case 1018347885: {
                    var9_5 ^= 759049354;
                    return Optional.empty();
                }
                case -314799842: {
                    var9_5 ^= var10_4 ^ -1027128448;
                    var10_4 = (var8_3 | var11_2) ^ 734198784;
                    continue block60;
                }
                case -1069675778: 
            }
            break;
        }
        var3_7 = ac.te((String)var2_6);
        var9_5 ^= 1108787213;
        var4_8 = ac.sZ(var3_7);
        var10_4 = (var8_3 | var11_2) ^ 1439361722;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static Optional<class_8685> sW(int var0, String var1_1, String var2_2, String var3_3, dT var4_4, byte[] var5_5, byte[] var6_6) {
        block14: {
            block15: {
                break block15;
lbl1:
                // 1 sources

                while (true) {
                    var11_9 = (var9_8 | var12_7) ^ 40085579;
                    break block14;
                    break;
                }
            }
            var12_7 = -1011569715;
            var9_8 = ac.b & -1011569715 ^ 1474775939;
            var11_9 = 0;
            var10_12 = (var9_8 | var12_7) ^ -1924125010;
            var11_9 = (var9_8 | var12_7) ^ -184899696;
            block12: while (true) {
                switch (var11_9) {
                    default: {
                        continue block12;
                    }
                    case -1689280020: {
                        var10_12 ^= var11_9 ^ -1389564382;
                        var11_9 = (var9_8 | var12_7) ^ -1909001446;
                        continue block12;
                    }
                    case 588074079: {
                        var11_9 = (var9_8 | var12_7) ^ 1287146019;
                        continue block12;
                    }
                    case 1505827029: 
                }
                break;
            }
            var7_10 = class_310.method_1551();
            var10_12 ^= 146263708;
            var8_11 = new CompletableFuture<T>();
            var11_9 = (var9_8 | var12_7) ^ -2078508751;
        }
        block13: while (true) {
            switch (var11_9) {
                case 1407947518: {
                    var10_12 ^= var11_9 ^ -96304186;
                    var11_9 = (var9_8 | var12_7) ^ 1296768725;
                    continue block13;
                }
                case -1124000295: {
                    var10_12 ^= var11_9 ^ 1439366433;
                    ** continue;
                }
                case -1698892518: {
                    var7_10.execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, ti(int java.util.concurrent.CompletableFuture net.minecraft.class_310 java.lang.String java.lang.String java.lang.String z.r.dT byte[] byte[] ), ()V)((int)var0, var8_11, (class_310)var7_10, (String)var1_1, (String)var2_2, (String)var3_3, (dT)var4_4, (byte[])var5_5, (byte[])var6_6));
                    var11_9 = (var9_8 | var12_7) ^ 1794569750;
                }
                default: {
                    continue block13;
                }
                case -711703676: 
            }
            break;
        }
        return (Optional)var8_11.join();
    }

    /*
     * Exception decompiling
     */
    private static Optional<class_8685> sX(class_310 var0, String var1_1, String var2_2, String var3_3, dT var4_4, byte[] var5_5, byte[] var6_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [91[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static String sY(String var0) throws IOException, InterruptedException {
        block119: {
            block120: {
                var11_1 = 441696747;
                var8_2 = ac.b & 441696747 ^ 243399191;
                var10_3 = 0;
                var9_9 = (var8_2 | var11_1) ^ 1465477423;
                var10_3 = (var8_2 | var11_1) ^ 2003662140;
                break block120;
                while (true) {
                    var10_3 = (var8_2 | var11_1) ^ -500397790;
                    ** GOTO lbl221
                    break;
                }
            }
            block88: while (true) {
                switch (var10_3) {
                    default: {
                        continue block88;
                    }
                    case 1787286110: {
                        var1_4 = URLEncoder.encode(var0, StandardCharsets.UTF_8);
                        var9_9 ^= 1677667160;
                        ** break;
                    }
                    case 1774096067: {
                        ** GOTO lbl23
                    }
lbl21:
                    // 1 sources

                    var9_9 ^= 797442172;
                    break block88;
lbl23:
                    // 1 sources

                    var10_3 = (var8_2 | var11_1) ^ 460243033;
                    continue block88;
                    case 96287654: 
                }
                var9_9 ^= var10_3 ^ 762262248;
                var10_3 = (var8_2 | var11_1) ^ 1951672737;
            }
            v0 = HttpRequest.newBuilder().uri(URI.create("https://api.mojang.com/users/profiles/minecraft/" + var1_4));
            ** GOTO lbl264
lbl31:
            // 1 sources

            while (true) {
                var9_9 ^= 1936162744;
                var9_9 ^= -364070844;
                var2_5 = v0.timeout(ac.a).header(ac.s, ac.i).GET().build();
                var9_9 ^= 1608746590;
                HttpResponse.BodyHandlers.ofString();
                var3_6 = null;
                var10_3 = (var8_2 | var11_1) ^ -1115519367;
                ** GOTO lbl291
                break;
            }
lbl43:
            // 1 sources

            while (true) {
                var10_3 = (var8_2 | var11_1) ^ -308790236;
                break block119;
                break;
            }
lbl46:
            // 2 sources

            while (true) {
                var10_3 = (var8_2 | var11_1) ^ 986783684;
                ** GOTO lbl101
                break;
            }
lbl49:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl51:
            // 1 sources

            while (true) {
                var10_3 = (var8_2 | var11_1) ^ 1372750166;
                ** GOTO lbl101
                break;
            }
lbl54:
            // 1 sources

            while (true) {
                var10_3 = (var8_2 | var11_1) ^ 750263931;
                break block119;
                break;
            }
            var10_3 = (var8_2 | var11_1) ^ -437049119;
            block95: while (true) {
                switch (var10_3) {
                    case 55295262: {
                        if (!var7_12.isEmpty()) {
                            var10_3 = (var8_2 | var11_1) ^ -1259728742;
                            ** break;
                        }
                        ** GOTO lbl81
                    }
                    case 307554300: {
                        var9_9 ^= var10_3 ^ -1026178736;
                        var10_3 = (var8_2 | var11_1) ^ 1144090668;
                        ** break;
                    }
                    case 1524796371: {
                        v1 = null;
                        ** GOTO lbl79
                    }
                    case -1439044763: {
                        var9_9 ^= var10_3 ^ 2058931657;
                        var10_3 = (var8_2 | var11_1) ^ -881048053;
                    }
lbl75:
                    // 4 sources

                    default: {
                        continue block95;
                    }
                    case -709902860: {
                        v1 = var7_12.get(0).getAsJsonObject().get(ac.q).getAsString();
lbl79:
                        // 2 sources

                        var9_9 ^= 1957205509;
                        return v1;
                    }
lbl81:
                    // 1 sources

                    var10_3 = (var8_2 | var11_1) ^ 210181123;
                    continue block95;
                    case -81734882: 
                }
                var9_9 ^= var10_3 ^ 1993572557;
                var10_3 = (var8_2 | var11_1) ^ 496518881;
            }
lbl87:
            // 1 sources

            while (true) {
                var10_3 = (var8_2 | var11_1) ^ -902999379;
                if (true) ** GOTO lbl101
                break;
            }
lbl90:
            // 1 sources

            while (true) {
                var10_3 = (var8_2 | var11_1) ^ 835149313;
                ** GOTO lbl174
lbl93:
                // 2 sources

                while (true) {
                    var10_3 = (var8_2 | var11_1) ^ -182750297;
                    ** GOTO lbl174
                    break;
                }
                break;
            }
lbl96:
            // 1 sources

            while (true) {
                var10_3 = (var8_2 | var11_1) ^ -1129912999;
                break block119;
                break;
            }
            block100: while (true) {
                var10_3 = (var8_2 | var11_1) ^ -1390917715;
lbl101:
                // 4 sources

                block101: while (true) {
                    switch (var10_3) {
                        case 1325497001: {
                            var9_9 ^= var10_3 ^ -401630528;
                            continue block100;
                        }
                        case -1963545667: {
                            var9_9 ^= var10_3 ^ -653258989;
                            var10_3 = (var8_2 | var11_1) ^ -1399313367;
                            continue block101;
                        }
                        case 1634829030: {
                            var9_9 ^= var10_3 ^ -1704282093;
                            ** GOTO lbl46
                        }
                        case 174275937: {
                            var9_9 ^= var10_3 ^ 1591368238;
                            var10_3 = (var8_2 | var11_1) ^ 566493677;
                            continue block101;
                        }
                        case 1058535954: {
                            if (var4_7 != ac.tn((var9_9 | var10_3 ^ 625228793) ^ (var10_3 ^ 1880638870), (var8_2 | var10_3 ^ 625228793) ^ ((var9_9 | var10_3 ^ 625228793) ^ (var10_3 ^ 1243010343)))) {
                                ** continue;
                            }
                            ** GOTO lbl154
                        }
                        case -1259141243: {
                            var9_9 ^= var10_3 ^ 1328665011;
                            ** GOTO lbl160
                        }
                        case 2094339984: {
                            ** break;
                        }
                        case -2018901524: {
                            var9_9 ^= var10_3 ^ -386384354;
                            ** break;
                        }
                        case -721508014: {
                            var10_3 = (var8_2 | var11_1) ^ -1576501541;
                            ** GOTO lbl168
                        }
                        case -1126464220: {
                            if (var4_7 >= ac.tn((var9_9 | var10_3 ^ -1501018929) ^ (var10_3 ^ -1216602969), (var8_2 | var10_3 ^ -1501018929) ^ ((var9_9 | var10_3 ^ -1501018929) ^ (var10_3 ^ 828649533)))) ** GOTO lbl162
                            var10_3 = (var8_2 | var11_1) ^ 347129502;
                            ** GOTO lbl168
                        }
                        case 1424981216: {
                            var9_9 ^= var10_3 ^ 1914079470;
                            ** continue;
                        }
                        case 1340092771: {
                            switch (var9_9) {
                                case -291797747: {
                                    var10_3 = (var8_2 | var11_1) ^ 2141354265;
                                    continue block101;
                                }
                                case 1631825745: {
                                    var10_3 = (var8_2 | var11_1) ^ -1440678790;
                                    continue block101;
                                }
                            }
                            var10_3 = (var8_2 | var11_1) ^ 1245480735;
                            ** GOTO lbl168
                        }
lbl149:
                        // 1 sources

                        var10_3 = (var8_2 | var11_1) ^ 1689282332;
                        ** GOTO lbl168
                        case 604169275: {
                            var10_3 = (var8_2 | var11_1) ^ 1050989870;
                            continue block101;
                        }
lbl154:
                        // 1 sources

                        var10_3 = (var8_2 | var11_1) ^ -1809493950;
                        ** GOTO lbl168
                        case 2053348579: {
                            if (var4_7 != ac.tn((var9_9 | var10_3 ^ 1613782280) ^ (var10_3 ^ 1908671841), (var8_2 | var10_3 ^ 1613782280) ^ ((var9_9 | var10_3 ^ 1613782280) ^ (var10_3 ^ -522875554)))) {
                                ** continue;
                            }
                            ** GOTO lbl162
                        }
lbl160:
                        // 2 sources

                        var10_3 = (var8_2 | var11_1) ^ 1362348700;
                        continue block101;
lbl162:
                        // 2 sources

                        var10_3 = (var8_2 | var11_1) ^ 1644620911;
                        continue block101;
                        case -1303652394: {
                            var5_8 = (String)var3_6.body();
                            var10_3 = (var8_2 | var11_1) ^ -1159035839;
                            if (true) ** GOTO lbl174
                        }
lbl168:
                        // 7 sources

                        default: {
                            continue block101;
                        }
                        case 544681681: {
                            throw new ez("profile lookup HTTP " + var4_7);
                        }
                        block103: while (true) {
                            var10_3 = (var8_2 | var11_1) ^ -1743820585;
lbl174:
                            // 4 sources

                            block104: while (true) {
                                switch (var10_3) {
                                    case -1949422411: {
                                        if (var5_8 == null) ** GOTO lbl93
                                        ** continue;
                                    }
                                    case 2127368247: {
                                        if (!var5_8.isBlank()) continue block103;
                                        ** continue;
                                    }
                                    case -1539735618: {
                                        var9_9 ^= var10_3 ^ 1048441787;
                                        ** break;
                                    }
                                    case -2032364760: {
                                        var9_9 ^= var10_3 ^ -481914448;
                                        var10_3 = (var8_2 | var11_1) ^ 809197828;
                                        ** GOTO lbl193
                                    }
                                    case -339179432: {
                                        var9_9 ^= var10_3 ^ -623008803;
                                        ** GOTO lbl203
                                    }
lbl192:
                                    // 1 sources

                                    var10_3 = (var8_2 | var11_1) ^ -1793206454;
lbl193:
                                    // 3 sources

                                    default: {
                                        continue block104;
                                    }
                                    case 789882366: {
                                        var10_3 = (var8_2 | var11_1) ^ 1612639176;
                                        continue block104;
                                    }
                                    case 786995963: {
                                        var6_10 = JsonParser.parseString((String)var5_8);
                                        ** break;
lbl201:
                                        // 1 sources

                                        var10_3 = (var8_2 | var11_1) ^ -1892777373;
                                        ** GOTO lbl250
                                    }
lbl203:
                                    // 1 sources

                                    var10_3 = (var8_2 | var11_1) ^ 398984994;
                                    continue block104;
                                    case 152829149: 
                                }
                                break;
                            }
                            break;
                        }
                        return null;
lbl207:
                        // 2 sources

                        while (true) {
                            var10_3 = (var8_2 | var11_1) ^ -1938768614;
                            if (true) ** GOTO lbl291
                            break;
                        }
lbl210:
                        // 2 sources

                        block106: while (true) {
                            switch (var9_9) {
                                default: {
                                    var9_9 ^= -1048591043;
                                    return v2;
                                }
                                case 1811535090: {
                                    var9_9 ^= -1155430523;
                                    continue block106;
                                }
                                case 840110448: 
                            }
                            var9_9 ^= -1863448524;
                            return v2;
                        }
lbl221:
                        // 1 sources

                        block107: while (true) {
                            switch (var10_3) {
                                case -1372890367: {
                                    var9_9 ^= var10_3 ^ 1694415279;
                                    ** GOTO lbl258
                                }
                                case 1472803509: {
                                    if (var6_10.isJsonArray()) {
                                        var10_3 = (var8_2 | var11_1) ^ 1020978463;
                                        continue block107;
                                    }
                                    ** GOTO lbl249
                                }
                                case -1845659236: {
                                    var9_9 ^= var10_3 ^ -864766482;
                                    var10_3 = (var8_2 | var11_1) ^ 1226492234;
                                    continue block107;
                                }
                                case -50367779: {
                                    var9_9 ^= var10_3 ^ -1466112131;
                                    ** break;
                                }
                                case 1435056150: {
                                    var9_9 ^= var10_3 ^ 692169078;
                                    ** GOTO lbl247
                                }
                                case -722867336: {
                                    if (!var6_10.isJsonObject()) ** continue;
                                    var10_3 = (var8_2 | var11_1) ^ 1264239593;
                                    continue block107;
                                }
lbl245:
                                // 1 sources

                                var10_3 = (var8_2 | var11_1) ^ 2113353795;
                                ** GOTO lbl250
lbl247:
                                // 1 sources

                                var10_3 = (var8_2 | var11_1) ^ 1873190685;
                                ** GOTO lbl250
lbl249:
                                // 1 sources

                                var10_3 = (var8_2 | var11_1) ^ -1325883138;
lbl250:
                                // 5 sources

                                default: {
                                    continue block107;
                                }
                                case 1341432884: {
                                    var7_12 = var6_10.getAsJsonArray();
                                    ** continue;
                                }
                                case 1903518946: {
                                    var7_11 = var6_10.getAsJsonObject();
                                    ** continue;
                                }
lbl258:
                                // 1 sources

                                var10_3 = (var8_2 | var11_1) ^ -902164345;
                                continue block107;
                                case 571023072: {
                                    var9_9 ^= var10_3 ^ 1810181906;
                                    var10_3 = (var8_2 | var11_1) ^ 1361534923;
                                    continue block107;
                                }
lbl264:
                                // 1 sources

                                block108: while (true) {
                                    switch (var9_9) {
                                        default: {
                                            var9_9 ^= -1553869249;
                                            continue block108;
                                        }
                                        case 147857033: {
                                            var9_9 ^= -144037593;
                                            break block108;
                                        }
                                        case 758100154: {
                                            var9_9 ^= -1525567402;
                                        }
                                    }
                                    break;
                                }
                                var9_9 ^= -44650034;
                                ** continue;
                                case 1663353788: 
                            }
                            break;
                        }
                        return null;
lbl278:
                        // 1 sources

                        while (true) {
                            var10_3 = (var8_2 | var11_1) ^ -2036884202;
                            break block119;
                            break;
                        }
                        while (true) {
                            var10_3 = (var8_2 | var11_1) ^ -1248205972;
                            break block119;
                            break;
                        }
                        case -1278493614: 
                    }
                    break;
                }
                break;
            }
            return null;
lbl286:
            // 1 sources

            while (true) {
                var10_3 = (var8_2 | var11_1) ^ 1665847177;
                break block119;
                break;
            }
            block112: while (true) {
                var10_3 = (var8_2 | var11_1) ^ 888779467;
lbl291:
                // 3 sources

                block113: while (true) {
                    switch (var10_3) {
                        default: {
                            continue block113;
                        }
                        case -599380257: {
                            var9_9 ^= var10_3 ^ -1924096886;
                            ** GOTO lbl207
                        }
                        case -1834793243: {
                            var10_3 = (var8_2 | var11_1) ^ -1120189458;
                            continue block113;
                        }
                        case -1385413434: {
                            var9_9 ^= var10_3 ^ 16870711;
                            continue block112;
                        }
                        case -1545029615: {
                            var4_7 = var3_6.statusCode();
                            var10_3 = (var8_2 | var11_1) ^ -1720059373;
                            ** GOTO lbl168
                        }
                        case 253063089: {
                            var9_9 ^= var10_3 ^ 1031546318;
                            ** continue;
                        }
                        case -1554940538: {
                            continue block112;
                        }
                        case 707414324: 
                    }
                    switch (var9_9) {
                        case -126447209: {
                            var10_3 = (var8_2 | var11_1) ^ -1030367968;
                            continue block113;
                        }
                        case 373231651: {
                            var10_3 = (var8_2 | var11_1) ^ -1279279303;
                            continue block113;
                        }
                    }
                    var10_3 = (var8_2 | var11_1) ^ 298226766;
                }
                break;
            }
        }
        block114: while (true) {
            switch (var10_3) {
                default: {
                    continue block114;
                }
                case 845931908: {
                    var9_9 ^= var10_3 ^ -607548904;
                    ** continue;
                }
                case -1569382746: {
                    if (!var7_11.has(ac.q)) ** continue;
                    ** continue;
                }
                case 2107192438: {
                    v2 = null;
                    ** GOTO lbl210
                }
                case -1740347671: {
                    v2 = var7_11.get(ac.q).getAsString();
                    ** continue;
                }
                case -213137445: {
                    var9_9 ^= var10_3 ^ -713765126;
                    ** continue;
                }
                case -1421207405: 
            }
            break;
        }
        var9_9 ^= var10_3 ^ 1122531087;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static dT sZ(String var0) throws IOException, InterruptedException {
        block95: {
            var12_1 = -74965387;
            var9_2 = ac.b & -74965387 ^ -1426229311;
            var11_3 = 0;
            var10_11 = (var9_2 | var12_1) ^ -696476423;
            var11_3 = (var9_2 | var12_1) ^ 618132798;
            break block95;
lbl7:
            // 1 sources

            while (true) {
                var11_3 = (var9_2 | var12_1) ^ -432825725;
                ** GOTO lbl197
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var11_3 = (var9_2 | var12_1) ^ 150380484;
                ** GOTO lbl197
                break;
            }
lbl-1000:
            // 3 sources

            {
                block96: {
                    switch (var11_3) {
                        case -375167782: {
                            var10_11 ^= var11_3 ^ -614758142;
                            var11_3 = (var9_2 | var12_1) ^ 854045832;
                            break block96;
                        }
                        case -865448996: {
                            var10_11 ^= var11_3 ^ 1016339890;
                            break;
                        }
                        case 1603942323: {
                            var10_11 ^= var11_3 ^ 1642371280;
                            ** break;
                        }
                        case -920990851: {
                            ** GOTO lbl236
                        }
                        case -415095231: {
                            var11_3 = var6_9.isJsonObject() ? (var9_2 | var12_1) ^ 932656169 : (var9_2 | var12_1) ^ 308157231;
                            break block96;
                        }
lbl29:
                        // 1 sources

                        var11_3 = (var9_2 | var12_1) ^ 482302388;
                        continue block72;
                        case 1602156870: {
                            var7_10 = var6_9.getAsJsonObject();
                            var11_3 = (var9_2 | var12_1) ^ -47377556;
                            ** GOTO lbl197
                        }
                    }
                    var11_3 = (var9_2 | var12_1) ^ -1534884173;
                    continue;
                }
lbl38:
                // 2 sources

                ** while (true)
            }
            {
                switch (var11_3) {
                    case -2065392185: {
                        var4_7 = JsonParser.parseString((String)((String)var2_5.body())).getAsJsonObject();
                        ** break;
                    }
                    case -800881581: {
                        ** GOTO lbl100
                    }
                    case 154821293: {
                        var10_11 ^= var11_3 ^ 2037703770;
                        ** GOTO lbl108
                    }
                    case -1935681977: {
                        ** break;
                    }
lbl50:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ -1582815541;
                    ** GOTO lbl147
                    case -462307148: {
                        var10_11 ^= var11_3 ^ -112848864;
                        ** GOTO lbl83
                    }
                    case -127967744: {
                        if (var3_6 == ac.tn((var10_11 | var11_3 ^ 64438389) ^ (var11_3 ^ -219661025), (var9_2 | var11_3 ^ 64438389) ^ ((var10_11 | var11_3 ^ 64438389) ^ (var11_3 ^ 1990094167)))) ** GOTO lbl81
                        ** GOTO lbl104
                    }
                    case -423254420: {
                        var10_11 ^= var11_3 ^ 1658371909;
                        ** GOTO lbl85
                    }
                    case 667640196: {
                        ** GOTO lbl85
                    }
                    case -1705623176: {
                        switch (var10_11) {
                            case -405161867: {
                                var11_3 = (var9_2 | var12_1) ^ -1540801896;
                                break;
                            }
                            case 1581988102: {
                                var11_3 = (var9_2 | var12_1) ^ -221831848;
                                break;
                            }
                            default: {
                                var11_3 = (var9_2 | var12_1) ^ 490264985;
                                break;
                            }
                        }
                        ** GOTO lbl95
                    }
                    case -358607516: {
                        if (var3_6 == ac.tn((var10_11 | var11_3 ^ 287836945) ^ (var11_3 ^ -529377537), (var9_2 | var11_3 ^ 287836945) ^ ((var10_11 | var11_3 ^ 287836945) ^ (var11_3 ^ 1966337096)))) ** GOTO lbl-1000
                        var11_3 = (var9_2 | var12_1) ^ 2002954674;
                        ** GOTO lbl95
                    }
lbl79:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ 2099953506;
                    continue block74;
lbl81:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ 56067444;
                    continue block74;
lbl83:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ -580476720;
                    continue block74;
lbl85:
                    // 2 sources

                    var11_3 = (var9_2 | var12_1) ^ 1638612621;
                    continue block74;
                    case -123012479: {
                        var10_11 ^= var11_3 ^ -663857700;
                        ** GOTO lbl102
                    }
                    case -2032680809: {
                        if (var3_6 >= ac.tn((var10_11 | var11_3 ^ 2103434978) ^ (var11_3 ^ -1945795829), (var9_2 | var11_3 ^ 2103434978) ^ ((var10_11 | var11_3 ^ 2103434978) ^ (var11_3 ^ 1815046569)))) lbl-1000:
                        // 2 sources

                        {
                            var11_3 = (var9_2 | var12_1) ^ 529317697;
                        } else {
                            var11_3 = (var9_2 | var12_1) ^ -1036671841;
                        }
                    }
lbl95:
                    // 5 sources

                    default: {
                        continue block74;
                    }
                    case -1187519264: {
                        var10_11 ^= var11_3 ^ 874621642;
                        ** GOTO lbl110
                    }
lbl100:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ -256557947;
                    continue block74;
lbl102:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ 2132402738;
                    continue block74;
lbl104:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ -600433039;
                    continue block74;
                    case 1607746925: {
                        var10_11 ^= var11_3 ^ 861596496;
lbl108:
                        // 2 sources

                        var11_3 = (var9_2 | var12_1) ^ 733936550;
                        continue block74;
                    }
lbl110:
                    // 1 sources

                    var11_3 = (var9_2 | var12_1) ^ 291334801;
                    continue block74;
                    case 969464682: {
                        var10_11 ^= var11_3 ^ 1076227500;
                        var11_3 = (var9_2 | var12_1) ^ 60957173;
                        continue block74;
                    }
lbl116:
                    // 1 sources

                    while (true) {
                        var11_3 = (var9_2 | var12_1) ^ 1497195148;
                        break block95;
lbl119:
                        // 1 sources

                        block76: while (true) {
                            switch (var10_11) {
                                case 1070464610: {
                                    var10_11 ^= 1640591149;
                                    continue block76;
                                }
                                case 1423649102: {
                                    var10_11 ^= -724408132;
                                    break;
                                }
                                default: {
                                    var10_11 ^= -1491075477;
                                }
                            }
                            var10_11 ^= -831896108;
                            var10_11 ^= -693385523;
                            var10_11 ^= 36636873;
                            var10_11 ^= -770711083;
                            var1_4 = v0.uri(URI.create(v1)).timeout(ac.a).header(ac.s, ac.i).GET().build();
                            var10_11 ^= -1664242647;
                            HttpResponse.BodyHandlers.ofString();
                            var2_5 = null;
                            var10_11 ^= 2123744820;
                            var3_6 = var2_5.statusCode();
                            var11_3 = (var9_2 | var12_1) ^ 1120574229;
                            continue block74;
                            break;
                        }
                        break;
                    }
                    while (true) {
                        var11_3 = (var9_2 | var12_1) ^ -220583465;
                        ** GOTO lbl197
                        break;
                    }
lbl147:
                    // 1 sources

                    block78: while (true) {
                        switch (var11_3) {
                            case 2082035251: {
                                var5_8 = var4_7.getAsJsonArray(ac.t).iterator();
                                ** GOTO lbl236
                            }
                            case 1515542846: {
                                var10_11 ^= var11_3 ^ 1186845362;
                                ** break;
                            }
                            case 833554960: {
                                if (var4_7.get(ac.t).isJsonArray()) {
                                    var11_3 = (var9_2 | var12_1) ^ -382073032;
                                    ** break;
                                }
                                ** GOTO lbl175
                            }
lbl160:
                            // 1 sources

                            var11_3 = (var9_2 | var12_1) ^ 1728100057;
                            continue block78;
                            case 580969778: {
                                var10_11 ^= var11_3 ^ -403391940;
                                var11_3 = (var9_2 | var12_1) ^ -137160580;
                                continue block78;
                            }
                            case -1661089492: {
                                if (var4_7.has(ac.t)) {
                                    var11_3 = (var9_2 | var12_1) ^ 929186202;
                                    ** break;
                                }
                                ** GOTO lbl175
                            }
                            case -861979025: {
                                var11_3 = (var9_2 | var12_1) ^ -900565531;
                            }
lbl173:
                            // 4 sources

                            default: {
                                continue block78;
                            }
lbl175:
                            // 2 sources

                            var11_3 = (var9_2 | var12_1) ^ -648176953;
                            continue block78;
                            case 315062477: {
                                var10_11 ^= var11_3 ^ 330488820;
                                var11_3 = (var9_2 | var12_1) ^ -2015090234;
                                continue block78;
                            }
                            case 204367753: 
                        }
                        break;
                    }
                    return null;
                    while (true) {
                        var11_3 = (var9_2 | var12_1) ^ -764576486;
                        ** GOTO lbl197
                        break;
                    }
lbl186:
                    // 1 sources

                    while (true) {
                        var11_3 = (var9_2 | var12_1) ^ -1536735162;
                        ** GOTO lbl38
                        break;
                    }
lbl189:
                    // 1 sources

                    while (true) {
                        var11_3 = (var9_2 | var12_1) ^ -641003326;
                        ** GOTO lbl197
                        break;
                    }
lbl192:
                    // 1 sources

                    while (true) {
                        var11_3 = (var9_2 | var12_1) ^ 2009572139;
                        ** GOTO lbl197
                        break;
                    }
                    case 647749413: {
                        throw new ez("session profile HTTP " + var3_6);
                    }
lbl197:
                    // 7 sources

                    block83: while (true) {
                        switch (var11_3) {
                            case -1955996366: {
                                var10_11 ^= var11_3 ^ 880962001;
                                ** break;
                            }
                            case -217325519: {
                                if (ac.o.equals(var7_10.get(ac.f).getAsString())) ** continue;
                                ** continue;
                            }
                            case 697303791: {
                                var10_11 ^= var11_3 ^ -1145129348;
                                ** continue;
                            }
                            case 500098422: {
                                var10_11 ^= var11_3 ^ 806085894;
                                ** GOTO lbl227
                            }
                            case 573992759: {
                                if (var7_10.has(ac.b)) ** continue;
                                ** GOTO lbl229
                            }
                            case 114322585: {
                                var10_11 ^= var11_3 ^ -384575649;
                                ** continue;
                            }
                            case -1942299426: {
                                var10_11 ^= -440762027;
                                ** GOTO lbl224
                            }
lbl220:
                            // 1 sources

                            var11_3 = (var9_2 | var12_1) ^ 1605408150;
                            ** GOTO lbl230
                            case -1538397597: {
                                break block83;
                            }
lbl224:
                            // 1 sources

                            var8_12 = new String(Base64.getDecoder().decode(var7_10.get(ac.b).getAsString()), StandardCharsets.UTF_8);
                            var10_11 ^= -911250510;
                            return ac.ta(var8_12);
lbl227:
                            // 1 sources

                            var11_3 = (var9_2 | var12_1) ^ -2094795385;
                            ** GOTO lbl230
lbl229:
                            // 1 sources

                            var11_3 = (var9_2 | var12_1) ^ 1888789191;
lbl230:
                            // 4 sources

                            default: {
                                continue block83;
                            }
                            case 153572898: {
                                var10_11 ^= var11_3 ^ -637662788;
                                ** continue;
                            }
                            case 2027850354: 
                        }
                        break;
                    }
lbl236:
                    // 4 sources

                    var11_3 = (var9_2 | var12_1) ^ 207353954;
                    ** GOTO lbl270
                    case 189285232: 
                }
            }
            return null;
lbl240:
            // 1 sources

            while (true) {
                var11_3 = (var9_2 | var12_1) ^ -1760388405;
                ** GOTO lbl270
                break;
            }
lbl243:
            // 1 sources

            while (true) {
                var11_3 = (var9_2 | var12_1) ^ -24406095;
                ** GOTO lbl270
                break;
            }
        }
        block86: while (true) {
            switch (var11_3) {
                default: {
                    continue block86;
                }
                case 2134124403: {
                    v0 = HttpRequest.newBuilder();
                    v1 = "https://sessionserver.mojang.com/session/minecraft/profile/" + var0;
                    ** continue;
                }
                case -1564467847: {
                    var10_11 ^= var11_3 ^ -610609349;
                    break;
                }
                case -550860085: {
                    ** continue;
                }
            }
            var11_3 = (var9_2 | var12_1) ^ -2067179386;
        }
        while (true) {
            var11_3 = (var9_2 | var12_1) ^ 786441589;
            if (true) ** GOTO lbl270
            break;
        }
        while (true) {
            var11_3 = (var9_2 | var12_1) ^ -1444670879;
            if (true) ** GOTO lbl270
            block89: while (true) {
                var11_3 = (var9_2 | var12_1) ^ 657425222;
lbl270:
                // 6 sources

                block90: while (true) {
                    switch (var11_3) {
                        default: {
                            continue block90;
                        }
                        case -140081257: {
                            var10_11 ^= var11_3 ^ -489598337;
                            ** continue;
                        }
                        case -590152525: {
                            return null;
                        }
                        case -719496576: {
                            var10_11 ^= var11_3 ^ -149392628;
                            continue block89;
                        }
                        case 1377398164: {
                            var10_11 ^= var11_3 ^ 1273559751;
                            ** continue;
                        }
                        case 91678788: {
                            var6_9 = (JsonElement)var5_8.next();
                            ** continue;
                        }
                        case 1827661118: 
                    }
                    break;
                }
                break;
            }
            if (!var5_8.hasNext()) ** continue;
        }
    }

    /*
     * Exception decompiling
     */
    private static dT ta(String var0) {
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
    private static byte[] tb(String var0) throws IOException, InterruptedException {
        block27: {
            block26: {
                block28: {
                    break block28;
lbl1:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 1753816965;
                        ** GOTO lbl27
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_3 ^ -780545233;
                        ** GOTO lbl54
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1065227886;
                        ** GOTO lbl27
                        break;
                    }
                }
                var5_1 = 767839914;
                var2_2 = ac.b & 767839914 ^ -1717645826;
                var4_3 = 0;
                var3_5 = (var2_2 | var5_1) ^ 1964946389;
                ** GOTO lbl44
lbl16:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -827008375;
                    if (true) ** GOTO lbl27
lbl19:
                    // 1 sources

                    throw new ez("texture download HTTP " + var1_4.statusCode());
lbl21:
                    // 1 sources

                    while (var1_4.statusCode() != ac.tn((var3_5 | var4_3 ^ -1134066429) ^ (var4_3 ^ 453040428), (var2_2 | var4_3 ^ -1134066429) ^ ((var3_5 | var4_3 ^ -1134066429) ^ (var4_3 ^ 1830414742)))) {
                        ** continue;
lbl23:
                        // 1 sources

                        ** GOTO lbl1
                    }
                    break block26;
                    block19: while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 746390615;
lbl27:
                        // 5 sources

                        block20: while (true) {
                            switch (var4_3) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block20;
                                    }
                                    break;
                                }
                                case -715665285: {
                                    ** continue;
                                }
                                case 504778788: {
                                    ** continue;
                                }
                                case -1851536471: {
                                    ** GOTO lbl21
                                }
lbl38:
                                // 1 sources

                                while (true) {
                                    var3_5 ^= var4_3 ^ -1030834192;
                                    ** GOTO lbl52
                                    break;
                                }
                                case 2103387756: {
                                    var3_5 ^= var4_3 ^ -1808073846;
                                    continue block19;
                                }
lbl44:
                                // 1 sources

                                var4_3 = (var2_2 | var5_1) ^ -1447454627;
                                break block27;
lbl46:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 695130405;
                                    break block27;
lbl49:
                                    // 1 sources

                                    while (true) {
                                        var1_4 = ac.td(var0);
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
lbl52:
                                // 1 sources

                                var4_3 = (var2_2 | var5_1) ^ 1122335670;
                                break block27;
lbl54:
                                // 1 sources

                                var4_3 = (var2_2 | var5_1) ^ -1547132966;
                                ** continue;
                                case 1936332151: {
                                    return var1_4.body();
                                }
                                case 932712339: 
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                var3_5 ^= var4_3 ^ 317864731;
                ** while (true)
            }
            var4_3 = (var2_2 | var5_1) ^ -1975074707;
            ** while (true)
        }
        block25: while (true) {
            switch (var4_3) {
                default: {
                    continue block25;
                }
                case -1800399141: {
                    ** continue;
                }
                case -12864440: {
                    ** continue;
                }
                ** case 342316963:
lbl74:
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
    private static byte[] tc(String var0) {
        var5_1 = -1942578856;
        var2_2 = ac.b & -1942578856 ^ 1051873445;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ 533220927;
        var4_3 = (var2_2 | var5_1) ^ -1839681629;
        ** GOTO lbl16
lbl-1000:
        // 1 sources

        {
            block21: {
                block20: {
                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 206619336;
                        break block20;
                        break;
                    }
                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 624021088;
                        break block21;
                        break;
                    }
lbl13:
                    // 2 sources

                    while (true) {
                        var3_4 ^= 966931627;
                        return v0;
                    }
                }
                block18: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block18;
                        }
                        case 753825374: {
                            ** continue;
                        }
                        case -1293542603: {
                            var3_4 ^= var4_3 ^ 1467159832;
                            var4_3 = (var2_2 | var5_1) ^ -1195295345;
                            continue block18;
                        }
                        case 108520562: 
                    }
                    break;
                }
                var1_5 = ac.td(var0);
                var4_3 = (var2_2 | var5_1) ^ -791009734;
            }
            block19: while (true) {
                switch (var4_3) {
                    default: {
                        continue block19;
                    }
                    case 1852637127: {
                        var3_4 ^= var4_3 ^ 1208341333;
                        var4_3 = (var2_2 | var5_1) ^ -335493055;
                        continue block19;
                    }
                    case 1387663804: {
                        if (var1_5.statusCode() != ac.tn((var3_4 | var4_3 ^ -562001692) ^ (var4_3 ^ 1232924843), (var2_2 | var4_3 ^ -562001692) ^ ((var3_4 | var4_3 ^ -562001692) ^ (var4_3 ^ 1176654130)))) ** continue;
                        var4_3 = (var2_2 | var5_1) ^ -2138287163;
                        continue block19;
                    }
                    case 1044023864: {
                        var3_4 ^= var4_3 ^ 1235226240;
                        var4_3 = (var2_2 | var5_1) ^ 24670603;
                        continue block19;
                    }
                    case -1076975498: {
                        v0 = var1_5.body();
                        ** GOTO lbl13
                    }
                    case -1685645411: {
                        var3_4 ^= var4_3 ^ -333606107;
                        var4_3 = (var2_2 | var5_1) ^ -2138674416;
                        continue block19;
                    }
                    case 1043378925: 
                }
                break;
            }
            v0 = null;
            ** continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static HttpResponse<byte[]> td(String var0) throws IOException, InterruptedException {
        block54: {
            block55: {
                block52: {
                    block51: {
                        block53: {
                            var6_1 = -1408833936;
                            var3_2 = ac.b & -1408833936 ^ -1984937769;
                            var5_3 = 0;
                            ** GOTO lbl104
lbl5:
                            // 1 sources

                            while (true) {
                                var4_6 ^= var5_3 ^ 1465323130;
                                break block51;
                                break;
                            }
lbl8:
                            // 1 sources

                            while (true) {
                                var5_3 = (var3_2 | var6_1) ^ 1331333148;
                                break block52;
                                break;
                            }
lbl11:
                            // 2 sources

                            while (true) {
                                var4_6 ^= 1841118878;
                                ** GOTO lbl117
                                break;
                            }
lbl14:
                            // 2 sources

                            while (true) {
                                var4_6 ^= -1125118667;
                                ** GOTO lbl121
                                break;
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                var4_6 ^= 1317462949;
                                ** GOTO lbl99
                                break;
                            }
lbl20:
                            // 1 sources

                            while (true) {
                                var4_6 ^= var5_3 ^ -1844002257;
                                break block53;
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                var4_6 ^= -1393988519;
                                ** GOTO lbl131
                                break;
                            }
                        }
                        var5_3 = (var3_2 | var6_1) ^ -1427818792;
                        ** GOTO lbl84
                    }
lbl30:
                    // 2 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ 1178318537;
                        break block52;
                        break;
                    }
lbl33:
                    // 1 sources

                    while (true) {
                        var4_6 ^= 1995431604;
                        break block54;
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        v0 = var0;
                        ** GOTO lbl14
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var5_3 = (var3_2 | var6_1) ^ -1265148083;
                        ** GOTO lbl84
                        break;
                    }
lbl42:
                    // 1 sources

                    while (true) {
                        var4_6 ^= var5_3 ^ -1774486631;
                        ** GOTO lbl77
                        break;
                    }
lbl45:
                    // 1 sources

                    while (true) {
                        var4_6 ^= -2034271897;
                        ** GOTO lbl11
                        break;
                    }
lbl48:
                    // 1 sources

                    while (true) {
                        v0 = "https://" + var0.substring(ac.tn((var4_6 | var5_3 ^ 739337832) ^ (var5_3 ^ -1734001786), (var3_2 | var5_3 ^ 739337832) ^ ((var4_6 | var5_3 ^ 739337832) ^ (var5_3 ^ -705340607))));
                        ** continue;
                        break;
                    }
                }
lbl52:
                // 2 sources

                block40: while (true) {
                    switch (var5_3) lbl-1000:
                    // 5 sources

                    {
                        default: {
                            continue block40;
                        }
                        case 608402324: {
                            ** continue;
                        }
                        case -487821589: {
                            ** continue;
                        }
lbl60:
                        // 1 sources

                        while (true) {
                            var5_3 = (var3_2 | var6_1) ^ -1980392093;
                            ** GOTO lbl-1000
                            break;
                        }
lbl63:
                        // 1 sources

                        while (true) {
                            var5_3 = (var3_2 | var6_1) ^ 1539994018;
                            ** GOTO lbl84
                            break;
                        }
lbl66:
                        // 1 sources

                        while (true) {
                            v1 = HttpRequest.newBuilder().uri(URI.create(var1_4)).timeout(ac.a).header(ac.s, ac.i);
                            ** GOTO lbl131
                            break;
                        }
                        case -927313661: {
                            ** GOTO lbl77
                        }
                        while (true) {
                            var5_3 = (var3_2 | var6_1) ^ -1940457882;
                            if (true) ** GOTO lbl84
                            break;
                        }
lbl74:
                        // 1 sources

                        while (true) {
                            var5_3 = (var3_2 | var6_1) ^ 1978326781;
                            ** GOTO lbl-1000
                            break;
                        }
lbl77:
                        // 2 sources

                        var5_3 = (var3_2 | var6_1) ^ 957397960;
                        ** GOTO lbl-1000
                        block47: while (true) {
                            var5_3 = (var3_2 | var6_1) ^ 765552367;
                            if (true) ** GOTO lbl84
                            block48: while (true) {
                                var5_3 = (var3_2 | var6_1) ^ -848023134;
lbl84:
                                // 7 sources

                                block49: while (true) {
                                    switch (var5_3) {
                                        default: {
                                            continue block49;
                                        }
                                        case 421640634: {
                                            ** continue;
                                        }
                                        case -73033333: {
                                            ** continue;
                                        }
                                        case 1623381845: {
                                            ** continue;
                                        }
                                        case -2145943528: {
                                            ** continue;
                                        }
lbl96:
                                        // 1 sources

                                        while (true) {
                                            var5_3 = (var3_2 | var6_1) ^ 1695332340;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl99:
                                        // 1 sources

                                        var4_6 ^= -1982855951;
                                        ** continue;
                                        case 568332433: {
                                            var4_6 ^= var5_3 ^ -291733276;
                                            continue block48;
                                        }
lbl104:
                                        // 1 sources

                                        var4_6 = (var3_2 | var6_1) ^ 674564828;
                                        break block55;
                                        case -159606955: {
                                            var4_6 ^= var5_3 ^ 956303136;
                                            continue block47;
                                        }
                                        case 122933295: {
                                            if (!var0.startsWith(ac.g)) ** continue;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        case 632718093: {
                            HttpResponse.BodyHandlers.ofByteArray();
                            return null;
                        }
lbl117:
                        // 1 sources

                        var2_5 = v1.GET().build();
                        ** continue;
                        case -343060418: {
                            break block40;
                        }
lbl121:
                        // 1 sources

                        var1_4 = v0;
                        ** continue;
                        case -1801036481: {
                            switch (var4_6) {
                                case -2056869535: {
                                    ** continue;
                                }
                                default: {
                                    ** continue;
                                }
                                ** case -947527115:
lbl130:
                                // 1 sources

                                ** continue;
                            }
                        }
lbl131:
                        // 2 sources

                        switch (var4_6) {
                            default: {
                                ** continue;
                            }
                            case 747087308: {
                                ** continue;
                            }
                            case -1445758993: 
                        }
                        var4_6 ^= -33723553;
                        ** continue;
                    }
                    break;
                }
                var5_3 = (var3_2 | var6_1) ^ -2013239814;
                ** while (true)
                ** while (true)
            }
            var5_3 = (var3_2 | var6_1) ^ 1444118396;
            ** while (true)
            {
                ** case -665044982:
            }
lbl146:
            // 1 sources

            var4_6 ^= var5_3 ^ 26997919;
            ** while (true)
        }
        var4_6 ^= -536439086;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static String te(String var0) {
        block21: {
            block19: {
                block22: {
                    block20: {
                        block23: {
                            block25: {
                                block18: {
                                    block24: {
                                        break block24;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var3_4 = (var1_3 | var5_1) ^ -901885007;
                                            break block18;
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            ** GOTO lbl38
                                            break;
                                        }
lbl6:
                                        // 1 sources

                                        while (true) {
                                            var2_5 ^= -1040547885;
                                            ** GOTO lbl46
                                            break;
                                        }
                                    }
                                    var5_1 = 326210503;
                                    var4_2 = -1204918456;
                                    var1_3 = ac.b & 326210503 ^ 1113101119;
                                    var3_4 = 0;
                                    break block25;
                                }
lbl16:
                                // 5 sources

                                block12: while (true) {
                                    switch (var3_4) lbl-1000:
                                    // 3 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block12;
                                            }
                                            break;
                                        }
                                        case 1022013635: {
                                            return var0;
                                        }
lbl23:
                                        // 1 sources

                                        while (true) {
                                            var3_4 = (var1_3 | var5_1) ^ -131700880;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl26:
                                        // 1 sources

                                        while (true) {
                                            var3_4 = (var1_3 | var5_1) ^ 616113421;
                                            ** continue;
                                            break;
                                        }
lbl29:
                                        // 1 sources

                                        while (true) {
                                            var2_5 ^= 182771031;
                                            ** continue;
                                            break;
                                        }
                                        case 1664176231: {
                                            var2_5 ^= var3_4 ^ -1820289210;
                                            break block19;
                                        }
                                        case -1723350962: {
                                            if (var0.length() == ac.tn((var2_5 | var3_4 ^ -1976151159) ^ (var3_4 ^ -1757125691), (var1_3 | var3_4 ^ -1976151159) ^ ((var2_5 | var3_4 ^ -1976151159) ^ (var3_4 ^ -1854708343)))) break block20;
                                            break block21;
                                        }
lbl38:
                                        // 1 sources

                                        v0 = ac.tn(((var2_5 ^= 205075635) | var5_1) ^ -905713747, (var1_3 | var5_1) ^ ((var2_5 | var5_1) ^ -996000376));
                                        v1 = ac.tn((var2_5 | var5_1) ^ -905713742, (var1_3 | var5_1) ^ ((var2_5 | var5_1) ^ -574832944));
                                        break block22;
lbl41:
                                        // 1 sources

                                        while (true) {
                                            break block23;
                                            break;
                                        }
                                        case 417375470: {
                                            var2_5 ^= var3_4 ^ 531790309;
                                            ** continue;
                                        }
lbl46:
                                        // 1 sources

                                        return var0.substring(0, ac.tn((v2 | var3_4 ^ var4_2) ^ (var3_4 ^ -1587668209), (var1_3 | var3_4 ^ var4_2) ^ ((v3 | var3_4 ^ var4_2) ^ (var3_4 ^ 689447955)))) + "-" + var0.substring(ac.tn((v4 | var3_4 ^ var4_2) ^ (var3_4 ^ -1587668210), (var1_3 | var3_4 ^ var4_2) ^ ((v5 | var3_4 ^ var4_2) ^ (var3_4 ^ -653928937))), ac.tn((v6 | var3_4 ^ var4_2) ^ (var3_4 ^ -1587668215), (var1_3 | var3_4 ^ var4_2) ^ ((v7 | var3_4 ^ var4_2) ^ (var3_4 ^ -1743452722)))) + "-" + var0.substring(ac.tn((v8 | var5_1) ^ -972307553, (var1_3 | var5_1) ^ ((v9 | var5_1) ^ 448594100)), ac.tn((v10 | var5_1) ^ -972307556, (var1_3 | var5_1) ^ ((v11 | var5_1) ^ -1392362588))) + "-" + var0.substring(v0, v1) + "-" + var0.substring(ac.tn((v12 | var5_1) ^ -1039956077, (var1_3 | var5_1) ^ ((v13 | var5_1) ^ 2040457586)), ac.tn((v14 | var5_1) ^ -1039956080, (var1_3 | var5_1) ^ ((v15 | var5_1) ^ -1846988011)));
                                        case -1182256960: {
                                            ** continue;
                                        }
                                        case -1419774833: {
                                            v2 = var2_5;
                                            v3 = var2_5;
                                            v4 = var2_5;
                                            v5 = var2_5;
                                            v6 = var2_5;
                                            v7 = var2_5;
                                            ** continue;
                                        }
                                        case 2009118450: {
                                            var2_5 ^= var3_4 ^ -85849328;
                                            break block12;
                                        }
                                    }
                                    break;
                                }
                                ** while (true)
                            }
                            var2_5 = (var1_3 | var5_1) ^ 640995445;
                            var3_4 = (var1_3 | var5_1) ^ -353262785;
                            ** GOTO lbl16
                        }
                        v8 = var2_5 ^= -835048104;
                        v9 = var2_5;
                        v10 = var2_5;
                        v11 = var2_5;
                        ** while (true)
                    }
                    var3_4 = (var1_3 | var5_1) ^ 1268332305;
                    ** GOTO lbl16
                }
                v12 = var2_5 ^= 439476962;
                v13 = var2_5;
                v14 = var2_5;
                v15 = var2_5;
                ** while (true)
            }
            var3_4 = (var1_3 | var5_1) ^ 1871913788;
            ** GOTO lbl16
        }
        var3_4 = (var1_3 | var5_1) ^ 810075032;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static String tf(Throwable var0) {
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
    private static /* synthetic */ String tg(String string) {
        int n2 = b & 0x14CD5FEE ^ 0x3C04216B;
        int n3 = 0;
        int n4 = (n2 | 0x14CD5FEE) ^ 0x90CC7A03;
        n3 = (n2 | 0x14CD5FEE) ^ 0xF223D634;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -823219749: {
                    n3 = (n2 | 0x14CD5FEE) ^ 0x8EF5AF5C;
                    continue block5;
                }
                case -420887083: {
                    return "Zerio cape " + string;
                }
                case -1304899405: 
            }
            n4 ^= n3 ^ 0x76DDA949;
            n3 = (n2 | 0x14CD5FEE) ^ 0xDA24BA3A;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String th(String string) {
        int n2 = b & 0xEE9C5376 ^ 0xD3CF21EB;
        int n3 = 0;
        int n4 = (n2 | 0xEE9C5376) ^ 0x62CAA1A7;
        n3 = (n2 | 0xEE9C5376) ^ 0xB66EBFB9;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1236388934: {
                    n3 = (n2 | 0xEE9C5376) ^ 0xC95236BF;
                    continue block5;
                }
                case -1056286875: {
                    return "Zerio skin " + string;
                }
                case 915227968: 
            }
            n4 ^= n3 ^ 0x204388DD;
            n3 = (n2 | 0xEE9C5376) ^ 0x3ED5249A;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void ti(int var0, CompletableFuture var1_1, class_310 var2_2, String var3_3, String var4_4, String var5_5, dT var6_6, byte[] var7_7, byte[] var8_8) {
        block41: {
            block42: {
                var13_9 = -1840486308;
                var10_10 = ac.b & -1840486308 ^ -1648931141;
                var12_11 = 0;
                var11_12 = (var10_10 | var13_9) ^ 1738646800;
                var12_11 = (var10_10 | var13_9) ^ 1944157897;
                break block41;
lbl7:
                // 1 sources

                while (true) {
                    var12_11 = (var10_10 | var13_9) ^ -2134104647;
                    break block41;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var11_12 ^= var12_11 ^ 1609715286;
                    var12_11 = (var10_10 | var13_9) ^ -1083920448;
                    break block41;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    if (var0 == ac.a) break block42;
                    var12_11 = (var10_10 | var13_9) ^ -1179296716;
                    break block41;
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var11_12 ^= var12_11 ^ -1437569583;
                    var12_11 = (var10_10 | var13_9) ^ -1052484522;
                    break block41;
                    break;
                }
lbl22:
                // 1 sources

                while (true) {
                    var1_1.complete(Optional.empty());
                    var12_11 = (var10_10 | var13_9) ^ 1093099279;
                    break block41;
                    break;
                }
lbl27:
                // 2 sources

                while (true) {
                    var12_11 = (var10_10 | var13_9) ^ 1634040331;
                    break block41;
                    break;
                }
lbl30:
                // 1 sources

                block30: while (true) {
                    switch (var11_12) {
                        case -1359707501: {
                            var12_11 = (var10_10 | var13_9) ^ 301021640;
                            break block30;
                        }
lbl35:
                        // 1 sources

                        while (true) {
                            var11_12 ^= var12_11 ^ -501181024;
                            ** GOTO lbl27
                            break;
                        }
                        case 798051810: {
                            var12_11 = (var10_10 | var13_9) ^ -1839547086;
                            break block30;
                        }
lbl41:
                        // 1 sources

                        while (true) {
                            var11_12 ^= var12_11 ^ 2104954114;
                            ** GOTO lbl50
                            break;
                        }
                        default: {
                            var12_11 = (var10_10 | var13_9) ^ -272537184;
                            break block30;
                        }
                    }
                    break;
                }
                break block41;
lbl48:
                // 1 sources

                while (true) {
                    var11_12 ^= var12_11 ^ 1717105178;
lbl50:
                    // 2 sources

                    var12_11 = (var10_10 | var13_9) ^ -1515296709;
                    break block41;
                    break;
                }
lbl52:
                // 1 sources

                while (true) {
                    var12_11 = (var10_10 | var13_9) ^ 1788674957;
                    break block41;
                    break;
                }
lbl55:
                // 1 sources

                return;
            }
            try {
                var12_11 = (var10_10 | var13_9) ^ -203127603;
                break block41;
lbl61:
                // 1 sources

                while (true) {
                    var11_12 ^= var12_11 ^ -1000612180;
                    var12_11 = (var10_10 | var13_9) ^ 148886223;
                    break block41;
                    break;
                }
lbl65:
                // 1 sources

                while (true) {
                    var1_1.complete(ac.sX(var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8));
                    var11_12 ^= -729501861;
                    break;
                }
            }
            catch (Exception v0) {
                var11_12 = (var10_10 | var13_9) ^ 751710228;
                var9_13 = v0;
                var11_12 ^= 2003438545;
                var1_1.complete(Optional.empty());
            }
            var12_11 = (var10_10 | var13_9) ^ 1281880838;
            break block41;
lbl78:
            // 1 sources

            while (true) {
                var11_12 ^= var12_11 ^ 2014625226;
                var12_11 = (var10_10 | var13_9) ^ -842017309;
                break block41;
                break;
            }
lbl82:
            // 1 sources

            return;
        }
        block40: while (true) {
            switch (var12_11) {
                default: {
                    continue block40;
                }
                case -333574090: {
                    ** continue;
                }
                case 523455302: {
                    ** continue;
                }
                case 547078463: {
                    ** continue;
                }
                case 642396875: {
                    ** continue;
                }
                case 1589326505: {
                    ** continue;
                }
                case -556256784: {
                    ** continue;
                }
                case -23456524: {
                    ** continue;
                }
                case -1911662793: {
                    ** continue;
                }
                case 228971469: {
                    ** continue;
                }
                case 1883113311: {
                    ** continue;
                }
                case 978388676: {
                    ** continue;
                }
                case -178098830: {
                    ** continue;
                }
                {
                    case 1813768754: {
                        ** continue;
                    }
                    case -1759462352: {
                        ** continue;
                    }
                }
                case -744972807: {
                    ** continue;
                }
                ** case 1378925340:
lbl120:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ class_2960 tj(class_8685 var0) {
        block10: {
            break block10;
            {
                switch (var3_2) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
lbl5:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | 1674440228) ^ -1718292205;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -133007729: {
                        var2_3 ^= var3_2 ^ 225790880;
                        ** continue;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | 1674440228) ^ 335387002;
                        ** GOTO lbl-1000
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | 1674440228) ^ 340581648;
                        ** continue;
                        break;
                    }
                    case -6081819: {
                        ** continue;
                    }
                    case 1920671462: 
                }
            }
            return var0.comp_1626().comp_3627();
        }
        var1_1 = ac.b & 1674440228 ^ -1960130059;
        var3_2 = 0;
        var2_3 = (var1_1 | 1674440228) ^ -1372267158;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ CompletableFuture tk(String string, int n2, String string2) {
        int n3 = b & 0x525300FF ^ 0x189ACA3D;
        int n4 = 0;
        int n5 = (n3 | 0x525300FF) ^ 0x8EB7B733;
        n4 = (n3 | 0x525300FF) ^ 0x3BFEF9D3;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case 1629827884: {
                    n4 = (n3 | 0x525300FF) ^ 0x6C8EFADD;
                    continue block5;
                }
                case 911552546: {
                    n5 ^= n4 ^ 0x4BEA7557;
                    n4 = (n3 | 0x525300FF) ^ 0x521FD0D2;
                    continue block5;
                }
                case 147069485: 
            }
            break;
        }
        n5 ^= 0xC569BD6A;
        n5 ^= 0xCF389413;
        n5 ^= 0x6EE89539;
        return CompletableFuture.supplyAsync(() -> {
            int n2 = b & 0x187E1C ^ 0x10E295AC;
            int n3 = 0;
            int n4 = (n2 | 0x187E1C) ^ 0x15345097;
            n3 = (n2 | 0x187E1C) ^ 0x2EB248A6;
            block5: while (true) {
                switch (n3) {
                    default: {
                        continue block5;
                    }
                    case 1044952858: {
                        n3 = (n2 | 0x187E1C) ^ 0x9C21EE38;
                        continue block5;
                    }
                    case -1396530880: {
                        return ac.sV(string.trim(), string2);
                    }
                    case -1931800188: 
                }
                n4 ^= n3 ^ 0xB22AA2F7;
                n3 = (n2 | 0x187E1C) ^ 0xBC385EFC;
            }
        }, a).whenComplete((arg_0, arg_1) -> ac.tl(string2, n2, arg_0, arg_1));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void tl(String var0, int var1_1, Optional var2_2, Throwable var3_3) {
        var7_4 = -1918153477;
        var4_5 = ac.b & -1918153477 ^ 2143866964;
        var6_6 = 0;
        var5_7 = (var4_5 | var7_4) ^ -1998344274;
        var6_6 = (var4_5 | var7_4) ^ -1840556494;
        if (true) ** GOTO lbl12
        block21: while (true) {
            var6_6 = (var4_5 | var7_4) ^ -1203350728;
            if (true) ** GOTO lbl12
            block22: while (true) {
                var6_6 = (var4_5 | var7_4) ^ 1591936163;
lbl12:
                // 3 sources

                block23: while (true) {
                    switch (var6_6) {
                        case 849759595: {
                            ac.d.put(var0, new ab(System.currentTimeMillis(), 5133845831115341813L << (var6_6 ^ 849759563) >>> (var6_6 ^ 849759563) ^ (long)var5_7 & 0xFFFFFFFFL | (5133845831115341813L >>> (var6_6 ^ 849759563) ^ (long)var5_7 & 0xFFFFFFFFL) << (var6_6 ^ 849759563)));
                            ** GOTO lbl85
                        }
                        case 1388577360: {
                            var5_7 ^= var6_6 ^ 1133675679;
                            var6_6 = (var4_5 | var7_4) ^ 1259357610;
                            continue block23;
                        }
                        case 1856162120: {
                            ** break;
                        }
                        case -450503740: {
                            ac.d.remove(var0);
                            var6_6 = (var4_5 | var7_4) ^ 1783275747;
                            continue block23;
                        }
                        case -1802836457: {
                            if (var2_2.isEmpty()) {
                                var6_6 = (var4_5 | var7_4) ^ -1857481289;
                                continue block23;
                            }
                            ** GOTO lbl85
                        }
                        case 1839237837: {
                            ** break;
                        }
                        case 1419582278: {
                            if (var3_3 == null) continue block22;
                            ** GOTO lbl83
                        }
                        case 486204773: {
                            var5_7 ^= var6_6 ^ 1006280210;
                            ** GOTO lbl57
                        }
                        case 988676248: {
                            var5_7 ^= var6_6 ^ 365730784;
                            ** GOTO lbl93
                        }
lbl46:
                        // 1 sources

                        var6_6 = (var4_5 | var7_4) ^ -850554476;
                        continue block23;
                        case -95265709: {
                            ac.d.put(var0, new ab(System.currentTimeMillis(), 5133845831115282997L << (var6_6 ^ -95265677) >>> (var6_6 ^ -95265677) ^ (long)var5_7 & 0xFFFFFFFFL | (5133845831115282997L >>> (var6_6 ^ -95265677) ^ (long)var5_7 & 0xFFFFFFFFL) << (var6_6 ^ -95265677)));
                            ** GOTO lbl85
                        }
lbl53:
                        // 1 sources

                        var6_6 = (var4_5 | var7_4) ^ 977400042;
                        continue block23;
                        case 494091505: {
                            return;
                        }
lbl57:
                        // 1 sources

                        var6_6 = (var4_5 | var7_4) ^ 449709883;
                        continue block23;
                        case -1824460833: {
                            var5_7 ^= var6_6 ^ 634038983;
                            var6_6 = (var4_5 | var7_4) ^ 96043180;
                            ** GOTO lbl66
                        }
                        case -792284363: {
                            if (ac.a != var1_1) ** GOTO lbl87
                            var6_6 = (var4_5 | var7_4) ^ -989471641;
                        }
lbl66:
                        // 3 sources

                        default: {
                            continue block23;
                        }
                        {
                        }
                        case 263397548: {
                            var5_7 ^= var6_6 ^ 1057170029;
                            var6_6 = (var4_5 | var7_4) ^ 791506890;
                            continue block23;
                        }
                        case -978703339: {
                            var5_7 ^= var6_6 ^ 1552258672;
                            continue block21;
                        }
                        case -1258579627: {
                            return;
                        }
                        case 1202556871: {
                            ac.b.remove(var0);
                            var6_6 = (var4_5 | var7_4) ^ -262603693;
                            continue block23;
                        }
lbl83:
                        // 1 sources

                        var6_6 = (var4_5 | var7_4) ^ 1823159072;
                        continue block23;
lbl85:
                        // 3 sources

                        var6_6 = (var4_5 | var7_4) ^ -1389371729;
                        continue block23;
lbl87:
                        // 1 sources

                        var6_6 = (var4_5 | var7_4) ^ -485410406;
                        continue block23;
                        case -1593255844: {
                            var5_7 ^= var6_6 ^ 394435908;
                            var6_6 = (var4_5 | var7_4) ^ 1801534184;
                            continue block23;
                        }
lbl93:
                        // 1 sources

                        var6_6 = (var4_5 | var7_4) ^ -1418278983;
                        continue block23;
                        case -1784579044: 
                    }
                    var5_7 ^= var6_6 ^ 1952706854;
                    var6_6 = (var4_5 | var7_4) ^ -493297650;
                }
                break;
            }
            break;
        }
    }

    private static int tn(int n2, int n3) {
        int n4 = 1326550887;
        int n5 = -101290051;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xA8BB392)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xFFF75D0F;
        n6 += (n5 | n4) ^ 0xFFF7D652;
        n6 -= (n5 | n4) ^ 0xFFF78172;
        n6 += (n5 | n4) ^ 0xFFF7A120;
        n6 -= (n5 | n4) ^ 0xFFF7E655;
        n6 += (n5 | n4) ^ 0xFFF72CF8;
        n6 -= (n5 | n4) ^ 0xFFF7622C;
        n6 ^= (n5 | n4) ^ 0xFFF7E54C;
        n6 ^= (n5 | n4) ^ 0xFFF74C24;
        return n6 -= (n5 | n4) ^ 0xFFF726AA;
    }
}

