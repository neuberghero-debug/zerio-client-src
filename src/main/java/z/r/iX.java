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
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.av;
import z.r.dr;
import z.r.gV;
import z.r.ho;
import z.r.lN;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class iX
implements av {
    private static final /* synthetic */ String a;
    public static final int b;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final int[] a;
    private static final /* synthetic */ String e;
    private final Executor a;
    private static final SecureRandom a;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private final Path a;
    private static final Gson a;
    private static final /* synthetic */ String h;
    private static final String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String s;

    private static int Mw(int n2, int n3) {
        int n4 = -1024797359;
        int n5 = -722182714;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xA99AA208)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xD6FEBCAB;
        n6 ^= (n5 | n4) ^ 0xD6FE681B;
        n6 -= (n5 | n4) ^ 0xD6FED7F3;
        n6 -= (n5 | n4) ^ 0xD6FE9D4C;
        n6 += (n5 | n4) ^ 0xD6FE8A7C;
        n6 ^= (n5 | n4) ^ 0xD6FE8F07;
        return n6 -= (n5 | n4) ^ 0xD6FEDCD5;
    }

    /*
     * Enabled aggressive block sorting
     */
    iX(Executor executor) {
        int n2 = -1906338570;
        int n3 = b & 0x8E5F94F6 ^ 0xE7030D76;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xBE9BB707;
        n5 ^= 0xC951C40D;
        n4 = (n3 | n2) ^ 0x548780AD;
        block8: while (true) {
            switch (n4) {
                default: {
                    continue block8;
                }
                case 757001131: {
                    this.a = executor;
                    n4 = (n3 | n2) ^ 0x347E0F15;
                    continue block8;
                }
                case -1143464613: {
                    n5 ^= n4 ^ 0x61E70D6E;
                    n4 = (n3 | n2) ^ 0xC241765D;
                    continue block8;
                }
                case 1081531141: {
                    return;
                }
                case 450091174: {
                    this.a = gV.sharedConfigs();
                    n4 = (n3 | n2) ^ 0x7FFE5415;
                    continue block8;
                }
                case -618556701: {
                    n5 ^= n4 ^ 0xD7F8C8E6;
                    n4 = (n3 | n2) ^ 0xF58C4550;
                    continue block8;
                }
                case -1868445213: 
            }
            n5 ^= n4 ^ 0x4687AD9D;
            n4 = (n3 | n2) ^ 0xAF2946F3;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public String label() {
        block10: {
            block11: {
                break block11;
lbl1:
                // 1 sources

                return iX.r;
lbl3:
                // 1 sources

                while (true) {
                    block9: {
                        block12: {
                            var3_2 = (var1_1 | -666779629) ^ 1367208271;
                            break block12;
lbl6:
                            // 1 sources

                            while (true) {
                                var2_3 ^= var3_2 ^ -835710010;
                                break block9;
                                break;
                            }
                        }
lbl10:
                        // 3 sources

                        block8: while (true) {
                            switch (var3_2) {
                                default: {
                                    continue block8;
                                }
                                case -296835748: {
                                    ** continue;
                                }
                                case -1466948776: {
                                    break block10;
                                }
                                case 950061325: {
                                    break;
                                }
                            }
                            ** continue;
                            break;
                        }
                    }
                    var3_2 = (var1_1 | -666779629) ^ 396588875;
                    ** GOTO lbl10
                    break;
                }
            }
            var1_1 = iX.b & -666779629 ^ 2041418261;
            var3_2 = 0;
            var2_3 = (var1_1 | -666779629) ^ -318552367;
            ** while (true)
        }
        var3_2 = (var1_1 | -666779629) ^ -1051911398;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean isRemote() {
        int n2 = b & 0xE1ABDF98 ^ 0x5FF72281;
        int n3 = 0;
        int n4 = (n2 | 0xE1ABDF98) ^ 0xA59036BE;
        n3 = (n2 | 0xE1ABDF98) ^ 0xF4104098;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 943700991: {
                    return false;
                }
                case 957812850: {
                    n4 ^= n3 ^ 0x7C2F7726;
                    n3 = (n2 | 0xE1ABDF98) ^ 0xC7C04466;
                    continue block5;
                }
                case 200261377: 
            }
            n3 = (n2 | 0xE1ABDF98) ^ 0xC6E8EFEB;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public CompletableFuture<List<dr>> browse() {
        int n2 = b & 0x653178C1 ^ 0x5FCD48BB;
        int n3 = 0;
        int n4 = (n2 | 0x653178C1) ^ 0x6B903343;
        n3 = (n2 | 0x653178C1) ^ 0x7567827A;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0x653178C1) ^ 0x337ACC76;
            }
            block6: while (true) {
                switch (n3) {
                    case 177928833: {
                        n3 = (n2 | 0x653178C1) ^ 0x91C4921E;
                    }
                    default: {
                        continue block6;
                    }
                    case -298194203: {
                        n4 ^= n3 ^ 0xDC22D196;
                        continue block5;
                    }
                    case 1283961997: 
                }
                break;
            }
            break;
        }
        return CompletableFuture.supplyAsync(() -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [32[CATCHBLOCK]], but top level block is 2[TRYBLOCK]
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
        }, this.a);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public CompletableFuture<ho> download(String string) {
        int n2 = b & 0x822E97EB ^ 0xCD00B961;
        int n3 = 0;
        int n4 = (n2 | 0x822E97EB) ^ 0x4B38D681;
        n3 = (n2 | 0x822E97EB) ^ 0xCC2C4F62;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 50524297: {
                    n3 = (n2 | 0x822E97EB) ^ 0x71421A6D;
                    continue block5;
                }
                case -1686778635: {
                    return CompletableFuture.supplyAsync(() -> this.MI(string), this.a);
                }
                case -1100175994: 
            }
            n4 ^= n3 ^ 0xC9314EDE;
            n3 = (n2 | 0x822E97EB) ^ 0x545B731E;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public CompletableFuture<dr> publish(String var1_1, String var2_2, String var3_3) {
        var4_4 = iX.b & 2017295107 ^ 1111994416;
        var6_5 = 0;
        if (true) ** GOTO lbl11
        block5: while (true) {
            var6_5 = (var4_4 | 2017295107) ^ -115944769;
            block6: while (true) {
                switch (var6_5) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
lbl11:
                    // 1 sources

                    var5_6 = (var4_4 | 2017295107) ^ 1461941047;
                    continue block5;
lbl13:
                    // 1 sources

                    while (true) {
                        var6_5 = (var4_4 | 2017295107) ^ 552422033;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -2090260084: {
                        ** continue;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var6_5 = (var4_4 | 2017295107) ^ -146252764;
                        ** continue;
                        break;
                    }
                    case 1519563170: {
                        var5_6 ^= var6_5 ^ -1903036652;
                        ** continue;
                    }
                    case -1925732585: {
                        return this.store(var1_1, var2_2, var3_3, true);
                    }
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public CompletableFuture<List<dr>> mine() {
        int n2 = b & 0x62D67BAF ^ 0x7190A80B;
        int n3 = 0;
        int n4 = (n2 | 0x62D67BAF) ^ 0xACFA91B2;
        n3 = (n2 | 0x62D67BAF) ^ 0x5343509E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 546679601: {
                    n3 = (n2 | 0x62D67BAF) ^ 0x69D82E25;
                    continue block5;
                }
                case 437179786: {
                    n4 ^= n3 ^ 0xDBCD5E87;
                    break;
                }
                case -1000706434: {
                    return CompletableFuture.supplyAsync(() -> {
                        int n2 = b & 0x27689A83 ^ 0xFA1F4CA0;
                        int n3 = 0;
                        int n4 = (n2 | 0x27689A83) ^ 0x5487B9A6;
                        n3 = (n2 | 0x27689A83) ^ 0x7B558982;
                        while (true) {
                            switch (n3) {
                                case -2115619733: {
                                    n4 ^= n3 ^ 0xA1745E59;
                                    n3 = (n2 | 0x27689A83) ^ 0x63011942;
                                    break;
                                }
                                case -1669412895: {
                                    return this.My(false);
                                }
                                case -2077599967: {
                                    n3 = (n2 | 0x27689A83) ^ 0x7E99EAC8;
                                }
                            }
                        }
                    }, this.a);
                }
            }
            n3 = (n2 | 0x62D67BAF) ^ 0xB78C95D1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public CompletableFuture<dr> share(String string, String string2, String string3) {
        int n2 = b & 0xC0D353A6 ^ 0xAF4A3CAC;
        int n3 = 0;
        int n4 = (n2 | 0xC0D353A6) ^ 0xEB21CFFE;
        n3 = (n2 | 0xC0D353A6) ^ 0x5B39EFA0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 2007278501: {
                    n4 ^= n3 ^ 0x3EEC547C;
                    n3 = (n2 | 0xC0D353A6) ^ 0x9F2CF691;
                    continue block5;
                }
                case 1895270719: {
                    return this.store(string, string2, string3, false);
                }
                case -1260220402: 
            }
            n3 = (n2 | 0xC0D353A6) ^ 0x987FDC0B;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public CompletableFuture<dr> save(String string, String string2, String string3, String string4, String string5, String string6, boolean bl2) {
        int n2 = b & 0x676E32E1 ^ 0x8DB5ECC9;
        int n3 = 0;
        int n4 = (n2 | 0x676E32E1) ^ 0x30C0E6DA;
        n3 = (n2 | 0x676E32E1) ^ 0x80D2271E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1865275895: {
                    break;
                }
                case -447532200: {
                    return this.store(string2, o, string3, false);
                }
                case -1372986736: {
                    n4 ^= n3 ^ 0xADED75D7;
                    n3 = (n2 | 0x676E32E1) ^ 0xAACCDB1;
                    continue block5;
                }
            }
            n3 = (n2 | 0x676E32E1) ^ 0x41D61C79;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public CompletableFuture<dr> importCode(String string) {
        int n2 = b & 0x7D153652 ^ 0xA4BF1AF7;
        int n3 = 0;
        int n4 = (n2 | 0x7D153652) ^ 0x39D7F4EC;
        n3 = (n2 | 0x7D153652) ^ 0x4A37521E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1215795991: {
                    n3 = (n2 | 0x7D153652) ^ 0xEB80BB2E;
                    continue block5;
                }
                case -1386970329: {
                    return this.download(string).thenCompose(ho2 -> {
                        int n2 = b & 0x527B876F ^ 0xD34B5819;
                        int n3 = 0;
                        int n4 = (n2 | 0x527B876F) ^ 0x4ED751D;
                        n3 = (n2 | 0x527B876F) ^ 0x42E7CC6F;
                        block5: while (true) {
                            switch (n3) {
                                default: {
                                    continue block5;
                                }
                                case -382162313: {
                                    n4 ^= n3 ^ 0xDF4ED81F;
                                    n3 = (n2 | 0x527B876F) ^ 0x109AB79E;
                                    continue block5;
                                }
                                case -1008637727: {
                                    return this.store(ho2.meta().q, o, ho2.configJson(), false);
                                }
                                case -1852042480: 
                            }
                            n3 = (n2 | 0x527B876F) ^ 0x3A437508;
                        }
                    });
                }
                case 373261785: 
            }
            n4 ^= n3 ^ 0xE76E9FA6;
            n3 = (n2 | 0x7D153652) ^ 0x50EBBDD0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public CompletableFuture<dr> setAutoLoad(String string, boolean bl2) {
        int n2 = b & 0x4ACAD697 ^ 0xCA8E0645;
        int n3 = 0;
        int n4 = (n2 | 0x4ACAD697) ^ 0xBDE8F22F;
        n3 = (n2 | 0x4ACAD697) ^ 0x8B464868;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1099472575: {
                    n3 = (n2 | 0x4ACAD697) ^ 0x7381C0CF;
                    continue block5;
                }
                case 953853110: {
                    return this.download(string).thenApply(ho::meta);
                }
                case -1185999336: 
            }
            n4 ^= n3 ^ 0x3290239C;
            n3 = (n2 | 0x4ACAD697) ^ 0xF2147261;
        }
    }

    /*
     * Unable to fully structure code
     */
    private CompletableFuture<dr> store(String var1_1, String var2_2, String var3_3, boolean var4_4) {
        block9: {
            break block9;
lbl1:
            // 1 sources

            return CompletableFuture.supplyAsync((Supplier<dr>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, MF(java.lang.String java.lang.String java.lang.String boolean ), ()Lz/r/dr;)((iX)this, (String)var3_3, (String)var1_1, (String)var2_2, (boolean)var4_4), this.a);
lbl3:
            // 2 sources

            block6: while (true) {
                switch (var7_6) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
                    case -1245794590: {
                        break block6;
                    }
                    case 1613544326: {
                        ** continue;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var7_6 = (var5_5 | -648242666) ^ 1289778645;
                        ** continue;
                        break;
                    }
                }
                break;
            }
            var7_6 = (var5_5 | -648242666) ^ -168640103;
            ** GOTO lbl3
            {
                ** case 212605614:
            }
lbl18:
            // 1 sources

            var6_7 ^= var7_6 ^ 105077001;
            var7_6 = (var5_5 | -648242666) ^ -1720557391;
            ** while (true)
        }
        var5_5 = iX.b & -648242666 ^ 1762578743;
        var7_6 = 0;
        var6_7 = (var5_5 | -648242666) ^ 1724375765;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public CompletableFuture<Void> delete(String string) {
        int n2 = b & 0xEFA22DA9 ^ 0x397CD7D2;
        int n3 = 0;
        int n4 = (n2 | 0xEFA22DA9) ^ 0x708A6D08;
        n3 = (n2 | 0xEFA22DA9) ^ 0xD6E85AD2;
        block5: while (true) {
            switch (n3) {
                case 1883528604: {
                    n4 ^= n3 ^ 0xFAFC9673;
                    n3 = (n2 | 0xEFA22DA9) ^ 0xE3CA8A07;
                }
                default: {
                    continue block5;
                }
                case 473200124: {
                    return CompletableFuture.runAsync(() -> {
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
                         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
                         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
                         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
                         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
                         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
                         *     at org.benf.cfr.reader.Main.main(Main.java:54)
                         */
                        throw new IllegalStateException("Decompilation failed");
                    }, this.a);
                }
                case 689349929: 
            }
            n3 = (n2 | 0xEFA22DA9) ^ 0x8FBAA267;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static boolean Mx(JsonObject var0) {
        block33: {
            block26: {
                block28: {
                    block29: {
                        block30: {
                            block32: {
                                block27: {
                                    block31: {
                                        break block31;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 1482099161;
                                            break block26;
lbl4:
                                            // 1 sources

                                            while (true) {
                                                var2_4 ^= var3_3 ^ 757656004;
                                                break block27;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    var4_1 = 1469454604;
                                    var1_2 = iX.b & 1469454604 ^ -617127369;
                                    var3_3 = 0;
                                    var2_4 = (var1_2 | var4_1) ^ -163763077;
                                    break block32;
lbl13:
                                    // 1 sources

                                    while (var0.has(iX.l)) {
                                        break block28;
lbl15:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 391045411;
                                            break block26;
                                            break;
                                        }
lbl18:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_3 ^ -1499376687;
                                            break block29;
                                            break;
                                        }
                                    }
                                    break block33;
                                }
                                var3_3 = (var1_2 | var4_1) ^ -1924569302;
                                break block26;
lbl25:
                                // 1 sources

                                while (true) {
                                    v0 = true;
                                    break block30;
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -108500263;
                                    ** continue;
                                    break;
                                }
                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -297700511;
                                    break block26;
lbl34:
                                    // 1 sources

                                    return v0;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ 948704233;
                            break block26;
                        }
lbl40:
                        // 2 sources

                        while (true) {
                            var2_4 ^= -521860911;
                            ** continue;
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            v0 = false;
                            ** continue;
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ -1501249478;
                    break block26;
                }
                var3_3 = (var1_2 | var4_1) ^ -1790488118;
            }
lbl52:
            // 2 sources

            block22: while (true) {
                switch (var3_3) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block22;
                        }
                        break;
                    }
                    case -2015333658: {
                        ** continue;
                    }
                    case 1392385045: {
                        ** GOTO lbl13
                    }
                    case 1860120918: {
                        ** continue;
                    }
                    case 2033433349: {
                        ** continue;
                    }
                    case 838207582: {
                        ** continue;
                    }
                    case -415536938: {
                        ** continue;
                    }
                    case -923166180: {
                        ** continue;
                    }
lbl71:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1290894101;
                        ** continue;
                        break;
                    }
                    case 1257253621: {
                        ** continue;
                    }
                    case 1824128980: {
                        if (!var0.get(iX.l).getAsBoolean()) ** continue;
                    }
                }
                break;
            }
        }
lbl79:
        // 2 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1318565271;
            ** continue;
            break;
        }
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private List<dr> My(boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [32[CATCHBLOCK]], but top level block is 2[TRYBLOCK]
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
    private String Mz() {
        block47: {
            block48: {
                break block48;
lbl1:
                // 1 sources

                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ 913348149;
                    break block47;
                    break;
                }
lbl4:
                // 2 sources

                while (true) {
                    var6_3 = (var4_2 | var7_1) ^ -1564464478;
                    ** GOTO lbl78
                    break;
                }
            }
            var7_1 = 1685059822;
            var4_2 = iX.b & 1685059822 ^ 195249785;
            var6_3 = 0;
            var5_8 = (var4_2 | var7_1) ^ -1818619362;
            var6_3 = (var4_2 | var7_1) ^ 1079932890;
            block33: while (true) {
                switch (var6_3) {
                    case 800164133: {
                        break;
                    }
                    case -668773899: {
                        var5_8 ^= var6_3 ^ -1233056122;
                        var6_3 = (var4_2 | var7_1) ^ -1910044674;
                    }
                    default: {
                        continue block33;
                    }
                    case -506922751: {
                        var1_4 = 0;
                        ** GOTO lbl60
                    }
                }
                var6_3 = (var4_2 | var7_1) ^ -1211322614;
            }
lbl27:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl29:
            // 1 sources

            while (true) {
                var6_3 = (var4_2 | var7_1) ^ -869214172;
                ** GOTO lbl78
                break;
            }
lbl32:
            // 1 sources

            while (true) {
                var6_3 = (var4_2 | var7_1) ^ 1710685846;
                ** GOTO lbl78
                var6_3 = (var4_2 | var7_1) ^ 1659631273;
                block37: while (true) {
                    switch (var6_3) {
                        case 1352390527: {
                            var5_8 ^= var6_3 ^ 1800405305;
                            ** continue;
                        }
                        case -1660948467: {
                            ++var1_4;
                            ** GOTO lbl60
                        }
                        case 38817199: {
                            var5_8 ^= var6_3 ^ 541255692;
                            var6_3 = (var4_2 | var7_1) ^ -217051406;
                            ** break;
                        }
                        case 901389592: {
                            var5_8 ^= var6_3 ^ -1297525525;
                            var6_3 = (var4_2 | var7_1) ^ 2019047738;
                            ** break;
                        }
                        case 397920197: {
                            if (!Files.exists(this.MA(var3_6), new LinkOption[0])) ** GOTO lbl58
                            var6_3 = (var4_2 | var7_1) ^ 1841279824;
                        }
lbl55:
                        // 6 sources

                        while (true) {
                            default: {
                                continue block37;
                            }
                            break;
                        }
lbl58:
                        // 1 sources

                        var6_3 = (var4_2 | var7_1) ^ 1064577408;
                        ** GOTO lbl55
lbl60:
                        // 2 sources

                        var6_3 = (var4_2 | var7_1) ^ 1491191669;
                        break block47;
lbl62:
                        // 1 sources

                        while (true) {
                            var6_3 = (var4_2 | var7_1) ^ -86785661;
                            ** GOTO lbl78
                            while (true) {
                                var6_3 = (var4_2 | var7_1) ^ -65891378;
                                if (true) ** GOTO lbl78
lbl68:
                                // 1 sources

                                while (true) {
                                    var6_3 = (var4_2 | var7_1) ^ 1515578343;
                                    ** continue;
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        case 218368086: 
                    }
                    break;
                }
                break;
            }
            return var3_6;
lbl73:
            // 1 sources

            while (true) {
                var6_3 = (var4_2 | var7_1) ^ -705418847;
                break block47;
                break;
            }
            block43: while (true) {
                var6_3 = (var4_2 | var7_1) ^ 1405712166;
lbl78:
                // 6 sources

                block44: while (true) {
                    switch (var6_3) {
                        default: {
                            continue block44;
                        }
                        case -1791213700: {
                            var3_6 = var2_5.toString();
                            ** continue;
                        }
                        case -1023536349: {
                            var5_8 ^= var6_3 ^ -9357073;
                            ** continue;
                        }
                        case -1370492663: {
                            var5_8 ^= var6_3 ^ -536123094;
                            continue block43;
                        }
                        case 169410665: {
                            if (var3_7 >= 5) ** continue;
                            var6_3 = (var4_2 | var7_1) ^ -1391333924;
                            continue block44;
                        }
                        case -852503459: {
                            var5_8 ^= var6_3 ^ -1092327502;
                            ** continue;
                        }
                        case -1545656613: {
                            var2_5.append(iX.j.charAt(iX.a.nextInt(iX.j.length())));
                            var6_3 = (var4_2 | var7_1) ^ -1046474762;
                            continue block44;
                        }
                        case 1009158617: {
                            ++var3_7;
                            ** GOTO lbl4
                        }
                        case -1812107983: 
                    }
                    break;
                }
                break;
            }
            var5_8 ^= var6_3 ^ -1249426768;
            ** while (true)
        }
        block45: while (true) {
            switch (var6_3) {
                default: {
                    continue block45;
                }
                case -248770675: {
                    if (var1_4 < iX.Mw((var5_8 | var6_3 ^ -1790707869) ^ (var6_3 ^ -366506564), (var4_2 | var6_3 ^ -1790707869) ^ ((var5_8 | var6_3 ^ -1790707869) ^ (var6_3 ^ 118237302)))) {
                        ** continue;
                    }
                    ** GOTO lbl130
                }
                case 923679114: {
                    var5_8 ^= var6_3 ^ -973346914;
                    var6_3 = (var4_2 | var7_1) ^ -1631325838;
                    continue block45;
                }
                case -910664838: {
                    var5_8 ^= var6_3 ^ 820017341;
                    ** continue;
                }
                case 2020272977: {
                    var2_5 = new StringBuilder(5);
                    var5_8 ^= 358579698;
                    var3_7 = 0;
                    ** continue;
                }
lbl130:
                // 1 sources

                var6_3 = (var4_2 | var7_1) ^ -1504205435;
                continue block45;
                case -1172580514: {
                    var5_8 ^= var6_3 ^ -1392442234;
                    var6_3 = (var4_2 | var7_1) ^ 394597806;
                    continue block45;
                }
                case 1503619274: 
            }
            break;
        }
        throw new IllegalStateException(iX.c);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Path MA(String var1_1) {
        var6_2 = 1977606153;
        var3_3 = iX.b & 1977606153 ^ 742758718;
        var5_4 = 0;
        var4_6 = (var3_3 | var6_2) ^ 468084908;
        var5_4 = (var3_3 | var6_2) ^ 1987585685;
        ** GOTO lbl84
        {
            var5_4 = (var3_3 | var6_2) ^ -1289371143;
            block28: while (true) {
                switch (var5_4) {
                    case -1563273704: {
                        var4_6 ^= var5_4 ^ -322053464;
                        ** GOTO lbl39
                    }
                    case -1658368428: {
                        var5_4 = (var3_3 | var6_2) ^ -1041105566;
                        ** break;
                    }
                    case 1528936200: {
                        var2_5 = var2_5.toUpperCase(Locale.ROOT);
                        ** GOTO lbl54
                    }
                    case -848105203: {
                        if (!var2_5.matches(iX.b)) ** GOTO lbl54
                        ** GOTO lbl27
                    }
                    case 1228999069: {
                        var4_6 ^= var5_4 ^ -210250640;
                        var5_4 = (var3_3 | var6_2) ^ -666639623;
                    }
lbl25:
                    // 7 sources

                    default: {
                        continue block28;
                    }
lbl27:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ -2020409681;
                    continue block28;
                    case -1137834915: {
                        if (!var2_5.matches(iX.a)) continue block27;
                        var5_4 = (var3_3 | var6_2) ^ -552751321;
                        ** break;
                    }
                    case 144511751: {
                        var4_6 ^= var5_4 ^ 221132649;
                        var5_4 = (var3_3 | var6_2) ^ -1330837454;
                        ** break;
                    }
                    case -95615088: {
                        ** GOTO lbl52
                    }
lbl39:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ -2026410678;
                    continue block28;
                    case -822462266: {
                        var4_6 ^= var5_4 ^ -1253998782;
                        var5_4 = (var3_3 | var6_2) ^ -11039283;
                        ** break;
                    }
                    case -1516495930: {
                        if (!var2_5.isEmpty()) ** break;
                        continue block27;
                        var5_4 = (var3_3 | var6_2) ^ -520571029;
                        ** break;
                    }
                    case -85420939: {
                        return this.a.resolve(var2_5 + ".json");
                    }
lbl52:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 654200375;
                    continue block28;
lbl54:
                    // 2 sources

                    var5_4 = (var3_3 | var6_2) ^ 882831522;
                    continue block28;
lbl56:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ 703794453;
                        ** GOTO lbl84
                        break;
                    }
                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ 1483593849;
                        ** GOTO lbl84
lbl62:
                        // 2 sources

                        while (true) {
                            var2_5 = v0;
                            var5_4 = (var3_3 | var6_2) ^ 1967319608;
                            continue block28;
                            break;
                        }
                        break;
                    }
lbl66:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ -2144814226;
                        if (true) ** GOTO lbl84
                        break;
                    }
                    case -2104986382: 
                }
                break;
            }
        }
        throw new IllegalArgumentException(iX.n);
lbl71:
        // 2 sources

        block34: while (true) {
            switch (var4_6) {
                default: {
                    var4_6 ^= -585835873;
                    continue block34;
                }
                case -885445423: {
                    var4_6 ^= 841185454;
                    ** GOTO lbl62
                }
                case 1764537622: 
            }
            var4_6 ^= 988245357;
            ** continue;
            break;
        }
        block35: while (true) {
            var5_4 = (var3_3 | var6_2) ^ 1840403726;
lbl84:
            // 5 sources

            block36: while (true) {
                switch (var5_4) {
                    default: {
                        continue block36;
                    }
                    case 2087493786: {
                        var4_6 ^= var5_4 ^ 48493721;
                        ** continue;
                    }
                    case 632430918: {
                        var4_6 ^= var5_4 ^ 1411928512;
                        continue block35;
                    }
                    case -34127279: {
                        v0 = "";
                        ** GOTO lbl71
                    }
                    case 1412232234: {
                        if (var1_1 != null) ** continue;
                        var5_4 = (var3_3 | var6_2) ^ 796913493;
                        continue block36;
                    }
                    case 195551146: {
                        var5_4 = (var3_3 | var6_2) ^ 28531109;
                        continue block36;
                    }
                    case 1386223210: {
                        var4_6 ^= var5_4 ^ 591029996;
                        ** continue;
                    }
                    case 275622961: 
                }
                break;
            }
            break;
        }
        v0 = var1_1.trim();
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ long MB(dr var0) {
        var1_1 = iX.b & -911741138 ^ 1898697893;
        var3_2 = 0;
        ** GOTO lbl19
lbl4:
        // 1 sources

        while (true) {
            var3_2 = (var1_1 | -911741138) ^ -1502342463;
            if (true) ** GOTO lbl11
lbl7:
            // 1 sources

            return var0.a;
        }
        block7: while (true) {
            var3_2 = (var1_1 | -911741138) ^ -1631460594;
lbl11:
            // 3 sources

            block8: while (true) {
                switch (var3_2) {
                    default: {
                        continue block8;
                    }
                    case 1608248686: {
                        break block7;
                    }
                    case 1735269537: {
                        ** continue;
                    }
lbl19:
                    // 1 sources

                    var2_3 = (var1_1 | -911741138) ^ -1951036581;
                    ** continue;
                    case -1375564444: {
                        var2_3 ^= var3_2 ^ -1139332209;
                        continue block7;
                    }
                }
                break;
            }
            break;
        }
        var3_2 = (var1_1 | -911741138) ^ 1470984907;
        ** while (true)
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void MC(boolean var0, List var1_1, Path var2_2) {
        var7_3 = -1995473716;
        var4_4 = iX.b & -1995473716 ^ 1652857122;
        var6_5 = 0;
        var5_6 = (var4_4 | var7_3) ^ -433788216;
        var6_5 = (var4_4 | var7_3) ^ 1317556220;
        ** GOTO lbl14
lbl-1000:
        // 1 sources

        {
            block21: {
                while (true) {
                    var6_5 = (var4_4 | var7_3) ^ 1001030892;
                    break block21;
                    break;
                }
lbl10:
                // 4 sources

                while (true) {
                    var5_6 ^= 930620076;
                    var5_6 ^= -1540238523;
                    return;
                }
            }
            block19: while (true) {
                switch (var6_5) {
                    default: {
                        continue block19;
                    }
                    case -1526222318: {
                        ** continue;
                    }
                    case -802850558: {
                        var5_6 ^= var6_5 ^ -34065250;
                        var6_5 = (var4_4 | var7_3) ^ 513846562;
                        continue block19;
                    }
                    case -181448500: 
                }
                break;
            }
            var3_7 = JsonParser.parseString((String)Files.readString(var2_2)).getAsJsonObject();
            var6_5 = (var4_4 | var7_3) ^ -1308759482;
            block20: while (true) {
                switch (var6_5) {
                    default: {
                        continue block20;
                    }
                    case 1517426600: {
                        var5_6 ^= var6_5 ^ -1749529382;
                        var6_5 = (var4_4 | var7_3) ^ -869094329;
                        continue block20;
                    }
                    case 666718633: {
                        if (!var3_7.has(iX.s)) ** GOTO lbl10
                        var6_5 = (var4_4 | var7_3) ^ -122675342;
                        continue block20;
                    }
                    case 322953884: {
                        var6_5 = (var4_4 | var7_3) ^ -1301323184;
                        continue block20;
                    }
                    case 1507893182: {
                        if (!var3_7.get(iX.s).isJsonObject()) ** GOTO lbl10
                        var6_5 = (var4_4 | var7_3) ^ -57716686;
                        continue block20;
                    }
                    case 385920476: {
                        var6_5 = (var4_4 | var7_3) ^ -950458310;
                        continue block20;
                    }
                    case 752276948: {
                        if (iX.Mx(var3_7) != var0) ** GOTO lbl10
                        var6_5 = (var4_4 | var7_3) ^ 1443790407;
                        continue block20;
                    }
                    case -1115585623: {
                        var6_5 = (var4_4 | var7_3) ^ -941485455;
                        continue block20;
                    }
                    case 745402271: 
                }
                break;
            }
            var1_1.add(dr.fromJson(var3_7.getAsJsonObject(iX.s)));
            ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean MD(Path path) {
        int n2 = b & 0x9DCDBBA0 ^ 0xF7D13FE9;
        int n3 = 0;
        int n4 = (n2 | 0x9DCDBBA0) ^ 0x14641024;
        n3 = (n2 | 0x9DCDBBA0) ^ 0xBACFFF8F;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 573617950: {
                    n4 ^= n3 ^ 0xD80278DA;
                    n3 = (n2 | 0x9DCDBBA0) ^ 0x179D0BD5;
                    continue block5;
                }
                case -398412740: {
                    return path.getFileName().toString().endsWith(e);
                }
                case 1158824038: 
            }
            n3 = (n2 | 0x9DCDBBA0) ^ 0xDDED08F7;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ dr MF(String var1_1, String var2_2, String var3_3, boolean var4_4) {
        var11_5 = -1940822846;
        var8_6 = iX.b & -1940822846 ^ 324436204;
        var10_7 = 0;
        var9_8 = (var8_6 | var11_5) ^ 1043777034;
        var10_7 = (var8_6 | var11_5) ^ 263721144;
        ** GOTO lbl43
lbl-1000:
        // 1 sources

        {
            block38: {
                block37: {
                    while (true) {
                        var10_7 = (var8_6 | var11_5) ^ -1263422180;
                        break block37;
                        break;
                    }
lbl10:
                    // 1 sources

                    block34: while (true) {
                        switch (var10_7) {
                            default: {
                                continue block34;
                            }
                            case 613921500: {
                                var9_8 ^= var10_7 ^ 1589793434;
                                var10_7 = (var8_6 | var11_5) ^ 823831862;
                                continue block34;
                            }
                            case -1370666536: {
                                var5_9.remove(iX.q);
                                var10_7 = (var8_6 | var11_5) ^ 338216140;
                                continue block34;
                            }
                            case -1954602974: {
                                var9_8 ^= var10_7 ^ 1650306364;
                                var10_7 = (var8_6 | var11_5) ^ 275618682;
                                continue block34;
                            }
                            case -1891991660: {
                                var5_9.remove(iX.f);
                                var10_7 = (var8_6 | var11_5) ^ 1072446230;
                                continue block34;
                            }
                            case -1598300168: {
                                var9_8 ^= var10_7 ^ -1766565759;
                                var10_7 = (var8_6 | var11_5) ^ -1535703163;
                                continue block34;
                            }
                            case 992011115: 
                        }
                        var9_8 ^= -1002015049;
                        var9_8 ^= -550738691;
                        var9_8 ^= -1710740696;
                        var6_11 = new dr(this.Mz(), var2_2, var3_3, System.currentTimeMillis(), lN.countModules(var5_9)[0], 0, "", "", "", false);
                        var9_8 ^= 186184791;
                        break block38;
                        break;
                    }
                }
                block35: while (true) {
                    switch (var10_7) {
                        default: {
                            continue block35;
                        }
                        case -1863322538: {
                            ** continue;
                        }
                        case 736514546: {
                            var9_8 ^= var10_7 ^ 1613119535;
                            var10_7 = (var8_6 | var11_5) ^ 971866094;
                            continue block35;
                        }
                        case -1497720064: 
                    }
                    break;
                }
                var5_9 = JsonParser.parseString((String)var1_1).getAsJsonObject();
                var10_7 = (var8_6 | var11_5) ^ -1145022926;
                ** continue;
            }
            var7_12 = new JsonObject();
            var10_7 = (var8_6 | var11_5) ^ 1986946412;
            block36: while (true) {
                switch (var10_7) {
                    default: {
                        continue block36;
                    }
                    case -382107262: {
                        var9_8 ^= var10_7 ^ -824523277;
                        var10_7 = (var8_6 | var11_5) ^ 673466816;
                        continue block36;
                    }
                    case -1217155794: {
                        var7_12.add(iX.s, (JsonElement)var6_11.toJson());
                        var10_7 = (var8_6 | var11_5) ^ -2027678722;
                        continue block36;
                    }
                    case 410253072: {
                        var9_8 ^= var10_7 ^ 1731005923;
                        var10_7 = (var8_6 | var11_5) ^ 1609551185;
                        continue block36;
                    }
                    case -1061672513: {
                        var7_12.addProperty(iX.l, Boolean.valueOf(var4_4));
                        var10_7 = (var8_6 | var11_5) ^ 1581587426;
                        continue block36;
                    }
                    case -1055719668: {
                        var9_8 ^= var10_7 ^ -792537467;
                        var10_7 = (var8_6 | var11_5) ^ -1412438336;
                        continue block36;
                    }
                    case 882377262: {
                        var7_12.add(iX.m, (JsonElement)var5_9);
                        var10_7 = (var8_6 | var11_5) ^ 2037494667;
                        continue block36;
                    }
                    case -433694875: {
                        var9_8 ^= var10_7 ^ 1310210468;
                        var10_7 = (var8_6 | var11_5) ^ 1937444710;
                        continue block36;
                    }
                    case -332600440: {
                        Files.createDirectories(this.a, new FileAttribute[0]);
                        var10_7 = (var8_6 | var11_5) ^ 884151121;
                        continue block36;
                    }
                    case -1411057729: {
                        var9_8 ^= var10_7 ^ 707913821;
                        var10_7 = (var8_6 | var11_5) ^ 915852508;
                        continue block36;
                    }
                    case -1446959054: {
                        Files.writeString(this.MA(var6_11.n), (CharSequence)iX.a.toJson((JsonElement)var7_12), new OpenOption[0]);
                        var10_7 = (var8_6 | var11_5) ^ 542619232;
                        continue block36;
                    }
                    case -1090497906: {
                        var9_8 ^= var10_7 ^ -1596982835;
                        var10_7 = (var8_6 | var11_5) ^ 1636977063;
                        continue block36;
                    }
                    case -20599479: 
                }
                break;
            }
            var9_8 ^= 844281826;
            return var6_11;
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ ho MI(String var1_1) {
        var11_2 = 587671856;
        var8_3 = iX.b & 587671856 ^ 487439458;
        var10_4 = 0;
        var9_5 = (var8_3 | var11_2) ^ -518312056;
        var10_4 = (var8_3 | var11_2) ^ 1084378353;
        ** GOTO lbl28
lbl-1000:
        // 1 sources

        {
            block23: {
                while (true) {
                    var9_5 ^= -539561171;
                    var3_7 = JsonParser.parseString((String)Files.readString(var2_6)).getAsJsonObject();
                    var9_5 ^= -25290946;
                    var4_9 = var3_7.getAsJsonObject(iX.m);
                    var9_5 ^= -859980398;
                    var5_10 = var3_7.getAsJsonObject(iX.s);
                    var9_5 ^= -1329124710;
                    var6_11 = dr.fromJson(var5_10);
                    var9_5 ^= 1720538364;
                    break block23;
                    break;
                }
lbl18:
                // 1 sources

                block20: while (true) {
                    switch (var9_5) {
                        case -290416452: {
                            var9_5 ^= 1694557995;
                            continue block20;
                        }
                        case -2054017581: {
                            var9_5 ^= 1751625348;
                            return v0;
                        }
                    }
                    var9_5 ^= -672969477;
                    return v0;
                }
lbl28:
                // 1 sources

                block21: while (true) {
                    switch (var10_4) {
                        default: {
                            continue block21;
                        }
                        case 2142105987: {
                            var10_4 = (var8_3 | var11_2) ^ -1715173275;
                            continue block21;
                        }
                        case -1496632041: {
                            var9_5 ^= var10_4 ^ -317732198;
                            var10_4 = (var8_3 | var11_2) ^ -221106503;
                            continue block21;
                        }
                        case -841116725: 
                    }
                    break;
                }
                var2_6 = this.MA(var1_1);
                ** continue;
            }
            var7_12 = new dr(var6_11.n, var6_11.q, var6_11.g, var6_11.a, var6_11.b, var6_11.a + 1, var6_11.c, var6_11.d, var6_11.f, var6_11.a);
            var10_4 = (var8_3 | var11_2) ^ 963450332;
            block22: while (true) {
                switch (var10_4) {
                    default: {
                        continue block22;
                    }
                    case 107129006: {
                        var9_5 ^= var10_4 ^ 1266142411;
                        var10_4 = (var8_3 | var11_2) ^ -1119689292;
                        continue block22;
                    }
                    case -2108860218: {
                        var3_7.add(iX.s, (JsonElement)var7_12.toJson());
                        var10_4 = (var8_3 | var11_2) ^ 1833963004;
                        continue block22;
                    }
                    case 1382002830: {
                        var9_5 ^= var10_4 ^ 436709265;
                        var10_4 = (var8_3 | var11_2) ^ 674193144;
                        continue block22;
                    }
                    case 388031370: {
                        Files.writeString(var2_6, (CharSequence)iX.a.toJson((JsonElement)var3_7), new OpenOption[0]);
                        var10_4 = (var8_3 | var11_2) ^ -1362057645;
                        continue block22;
                    }
                    case -1847649503: {
                        var9_5 ^= var10_4 ^ 574880212;
                        var10_4 = (var8_3 | var11_2) ^ 1069920932;
                        continue block22;
                    }
                    case 13242326: 
                }
                break;
            }
            v0 = new ho(var7_12, iX.a.toJson((JsonElement)var4_9));
            ** continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ long MK(dr var0) {
        block24: {
            block25: {
                break block25;
                {
                    switch (var2_4) {
                        case -649714783: {
                            var3_3 = (var1_2 | var4_1) ^ 1437415546;
                            ** GOTO lbl31
                        }
lbl5:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -1648090999;
                            break block24;
                            break;
                        }
lbl8:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 831565218;
                            ** GOTO lbl20
lbl11:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1247826675;
                                ** GOTO lbl31
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -515219284;
                                ** GOTO lbl31
                                break;
                            }
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 1798830062;
                            break block24;
                            break;
                        }
lbl20:
                        // 2 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 205652462;
                            ** GOTO lbl31
                            break;
                        }
lbl23:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 393886916;
                            ** GOTO lbl31
                            break;
                        }
                        default: {
                            var3_3 = (var1_2 | var4_1) ^ 81871762;
                            ** GOTO lbl31
lbl29:
                            // 1 sources

                            return var0.a;
lbl31:
                            // 8 sources

                            block23: while (true) {
                                switch (var3_3) {
                                    default: {
                                        continue block23;
                                    }
                                    case 959259150: {
                                        ** continue;
                                    }
                                    case -348682245: {
                                        ** continue;
                                    }
                                    case -267404591: {
                                        continue block14;
                                    }
                                    case 736894201: {
                                        ** continue;
                                    }
                                    case -1444904123: {
                                        ** continue;
                                    }
                                    case -122881875: {
                                        ** continue;
                                    }
                                    case 487054227: {
                                        ** continue;
                                    }
                                    ** case -1238505012:
lbl50:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                        }
                    }
                }
            }
            var4_1 = -1135822031;
            var1_2 = iX.b & -1135822031 ^ -733894129;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -888248100;
            ** while (true)
            {
                ** case -1181933045:
            }
lbl58:
            // 1 sources

            var3_3 = (var1_2 | var4_1) ^ -677271610;
            ** GOTO lbl31
        }
        var3_3 = (var1_2 | var4_1) ^ -983525071;
        ** while (true)
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void ML(List var0, Path var1_1) {
        var6_2 = -53961525;
        var3_3 = iX.b & -53961525 ^ 1232021647;
        var5_4 = 0;
        var4_5 = (var3_3 | var6_2) ^ 344559019;
        var5_4 = (var3_3 | var6_2) ^ 94471353;
        ** GOTO lbl47
lbl-1000:
        // 1 sources

        {
            block21: {
                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ 560176514;
                    break block21;
                    break;
                }
lbl10:
                // 4 sources

                while (true) {
                    var4_5 ^= 504950704;
                    var4_5 ^= -372986564;
                    return;
                }
lbl14:
                // 1 sources

                block19: while (true) {
                    switch (var5_4) {
                        default: {
                            continue block19;
                        }
                        case -500705862: {
                            var4_5 ^= var5_4 ^ -1466844264;
                            var5_4 = (var3_3 | var6_2) ^ -951622883;
                            continue block19;
                        }
                        case 984145874: {
                            if (!var2_6.has(iX.s)) ** GOTO lbl10
                            var5_4 = (var3_3 | var6_2) ^ -622019833;
                            continue block19;
                        }
                        case 654510024: {
                            var5_4 = (var3_3 | var6_2) ^ 759179323;
                            continue block19;
                        }
                        case -793799436: {
                            if (!var2_6.get(iX.s).isJsonObject()) ** GOTO lbl10
                            var5_4 = (var3_3 | var6_2) ^ -1190620285;
                            continue block19;
                        }
                        case 1156001612: {
                            var5_4 = (var3_3 | var6_2) ^ 1988449380;
                            continue block19;
                        }
                        case -1955927893: {
                            if (!iX.Mx(var2_6)) ** GOTO lbl10
                            var5_4 = (var3_3 | var6_2) ^ 694700720;
                            continue block19;
                        }
                        case -729287041: {
                            var5_4 = (var3_3 | var6_2) ^ -1106538792;
                            continue block19;
                        }
                        case 1139028503: 
                    }
                    var0.add(dr.fromJson(var2_6.getAsJsonObject(iX.s)));
                    ** continue;
                    break;
                }
            }
            block20: while (true) {
                switch (var5_4) {
                    default: {
                        continue block20;
                    }
                    case -129091466: {
                        ** continue;
                    }
                    case -594796211: {
                        var4_5 ^= var5_4 ^ 1171401036;
                        var5_4 = (var3_3 | var6_2) ^ -215785911;
                        continue block20;
                    }
                    case 248308358: 
                }
                break;
            }
            var2_6 = JsonParser.parseString((String)Files.readString(var1_1)).getAsJsonObject();
            var5_4 = (var3_3 | var6_2) ^ 533227893;
            ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean MM(Path path) {
        int n2 = b & 0xDE6D5079 ^ 0x5BE3B5C3;
        int n3 = 0;
        int n4 = (n2 | 0xDE6D5079) ^ 0x82AE9AC7;
        n3 = (n2 | 0xDE6D5079) ^ 0x5457D0A2;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1950866087: {
                    n3 = (n2 | 0xDE6D5079) ^ 0x85713B5D;
                    continue block5;
                }
                case 1520357030: {
                    n4 ^= n3 ^ 0x3492A3F9;
                    n3 = (n2 | 0xDE6D5079) ^ 0xFF638633;
                    continue block5;
                }
                case 546075592: 
            }
            break;
        }
        return path.getFileName().toString().endsWith(e);
    }
}

