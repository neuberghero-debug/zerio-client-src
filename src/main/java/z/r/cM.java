/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.time.Instant;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.gV;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class cM {
    public static final int a;
    private static final Object[] a;
    private static final int[] a;
    private static final long a;
    private static final String[] a;

    private static int a(int n2, int n3) {
        int n4 = -2101369826;
        int n5 = -1776490915;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x7F65E94F)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0x96BF0DD4;
        n6 += (n5 | n4) ^ 0x96BFC7B5;
        n6 ^= (n5 | n4) ^ 0x96BF73E2;
        n6 -= (n5 | n4) ^ 0x96BFFBDF;
        n6 += (n5 | n4) ^ 0x96BFE629;
        return n6 ^= (n5 | n4) ^ 0x96BF2966;
    }

    /*
     * Enabled aggressive block sorting
     */
    private cM() {
        int n2 = a & 0x9E30DB8F ^ 0x79FFD6CD;
        int n3 = (n2 | 0x9E30DB8F) ^ 0xCDA2DB30;
        n3 ^= 0xFBB1FC13;
        n3 ^= 0xEC44968A;
    }

    /*
     * Enabled aggressive block sorting
     */
    static synchronized void info(String string) {
        int n2 = a & 0x50A14A90 ^ 0x54FE350D;
        int n3 = 0;
        int n4 = (n2 | 0x50A14A90) ^ 0x928A5503;
        n3 = (n2 | 0x50A14A90) ^ 0xFC58BA5C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 2060804129: {
                    n4 ^= n3 ^ 0xF5F1F1A3;
                    n3 = (n2 | 0x50A14A90) ^ 0x73504B91;
                    continue block5;
                }
                case -1465399871: {
                    n3 = (n2 | 0x50A14A90) ^ 0x2E2A1FBC;
                    continue block5;
                }
                case 665793548: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    static synchronized void error(String var0, Throwable var1_1) {
        block13: {
            block14: {
                block15: {
                    var5_2 = -215942200;
                    var2_3 = cM.a & -215942200 ^ 1304910055;
                    var4_4 = 0;
                    break block15;
lbl5:
                    // 1 sources

                    return;
lbl7:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 1630213782;
                        break block13;
lbl10:
                        // 1 sources

                        while (true) {
                            cM.write(cM.a((var3_5 | var4_4 ^ 1844188849) ^ (var4_4 ^ 790793082), (var2_3 | var4_4 ^ 1844188849) ^ ((var3_5 | var4_4 ^ 1844188849) ^ (var4_4 ^ 996666745))), var0, var1_1);
                            ** GOTO lbl36
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ -9683467;
                            break block14;
                            break;
                        }
                        break;
                    }
                }
                var3_5 = (var2_3 | var5_2) ^ 151383177;
                var4_4 = (var2_3 | var5_2) ^ -1581096023;
                break block13;
            }
            var4_4 = (var2_3 | var5_2) ^ 894794678;
        }
lbl23:
        // 2 sources

        block11: while (true) {
            switch (var4_4) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block11;
                    }
                    break;
                }
                case 1579522118: {
                    break block11;
                }
                case -894271399: {
                    ** continue;
                }
                case -1630737031: {
                    ** continue;
                }
                case -282475915: {
                    ** continue;
                }
lbl36:
                // 1 sources

                var4_4 = (var2_3 | var5_2) ^ 281950618;
                ** continue;
            }
            break;
        }
        var4_4 = (var2_3 | var5_2) ^ 1170667341;
        ** while (true)
        {
            ** case -1172239198:
        }
lbl41:
        // 1 sources

        var3_5 ^= var4_4 ^ 1360925667;
        ** while (true)
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
    private static void write(String var0, String var1_1, Throwable var2_2) {
        var9_3 = 756506366;
        var6_4 = cM.a & 756506366 ^ -1893716379;
        var8_5 = 0;
        var7_6 = (var6_4 | var9_3) ^ 2067629297;
        var8_5 = (var6_4 | var9_3) ^ -834648342;
        ** GOTO lbl16
lbl-1000:
        // 1 sources

        {
            block31: {
                block32: {
                    while (true) {
                        var8_5 = (var6_4 | var9_3) ^ -462334777;
                        break block31;
                        break;
                    }
lbl10:
                    // 3 sources

                    while (true) {
                        var8_5 = (var6_4 | var9_3) ^ 2117147;
                        break block32;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var7_6 ^= 1957776996;
                        return;
                    }
lbl16:
                    // 1 sources

                    block28: while (true) {
                        switch (var8_5) {
                            default: {
                                continue block28;
                            }
                            case 1635203093: {
                                var8_5 = (var6_4 | var9_3) ^ 339061910;
                                continue block28;
                            }
                            case -1157442967: {
                                var7_6 ^= var8_5 ^ -1098470431;
                                var8_5 = (var6_4 | var9_3) ^ -2079200507;
                                continue block28;
                            }
                            case 723949050: 
                        }
                        break;
                    }
                    var3_7 = cM.sanitize(var1_1);
                    var7_6 ^= -253448287;
                    var4_8 = new StringBuilder().append(Instant.now()).append((char)cM.a(((var7_6 ^= -1488502034) | var9_3) ^ 1189442031, (var6_4 | var9_3) ^ ((var7_6 | var9_3) ^ -1271950247))).append(var0).append((char)cM.a((var7_6 | var9_3) ^ 1189442030, (var6_4 | var9_3) ^ ((var7_6 | var9_3) ^ 164895914))).append(var3_7).append(System.lineSeparator());
                    var8_5 = (var6_4 | var9_3) ^ 1367268071;
                    break block31;
                }
lbl34:
                // 2 sources

                block29: while (true) {
                    switch (var8_5) {
                        default: {
                            continue block29;
                        }
                        case -1527438179: {
                            var7_6 ^= var8_5 ^ -7205478;
                            var8_5 = (var6_4 | var9_3) ^ 1832772845;
                            continue block29;
                        }
                        case -1039492590: {
                            if (!Files.exists(var5_9, new LinkOption[0])) ** GOTO lbl10
                            var8_5 = (var6_4 | var9_3) ^ -1863176355;
                            continue block29;
                        }
                        case 1069896098: {
                            var8_5 = (var6_4 | var9_3) ^ 1955973252;
                            continue block29;
                        }
                        case -610093445: {
                            if (Files.size(var5_9) < (-6318596677203929652L << (var8_5 ^ -610093477) >>> (var8_5 ^ -610093477) ^ (long)var7_6 & 0xFFFFFFFFL | (-6318596677203929652L >>> (var8_5 ^ -610093477) ^ (long)var7_6 & 0xFFFFFFFFL) << (var8_5 ^ -610093477))) ** GOTO lbl10
                            var8_5 = (var6_4 | var9_3) ^ 1289112177;
                            continue block29;
                        }
                        case -471780210: {
                            var8_5 = (var6_4 | var9_3) ^ 1916398222;
                            continue block29;
                        }
                        case -586247055: {
                            Files.writeString(var5_9, (CharSequence)"", StandardCharsets.UTF_8, new OpenOption[]{StandardOpenOption.TRUNCATE_EXISTING});
                            ** continue;
                        }
                        case -1357434652: {
                            var7_6 ^= var8_5 ^ 1506025921;
                            var8_5 = (var6_4 | var9_3) ^ -112493311;
                            continue block29;
                        }
                        case 1450968062: 
                    }
                    Files.writeString(var5_9, (CharSequence)var4_8, StandardCharsets.UTF_8, new OpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.APPEND});
                    var7_6 ^= 720910543;
                    ** continue;
                    break;
                }
            }
            block30: while (true) {
                switch (var8_5) {
                    default: {
                        continue block30;
                    }
                    case -28728296: {
                        var7_6 ^= var8_5 ^ -1745659680;
                        var8_5 = (var6_4 | var9_3) ^ -268575025;
                        continue block30;
                    }
                    case 1087021104: {
                        cM.appendCause(var4_8, "", var2_2, cM.a((var7_6 | var8_5 ^ 1843265230) ^ (var8_5 ^ 1183281629), (var6_4 | var8_5 ^ 1843265230) ^ ((var7_6 | var8_5 ^ 1843265230) ^ (var8_5 ^ 1535749309))));
                        ** continue;
                    }
                    case 1262889528: {
                        var7_6 ^= var8_5 ^ -2055458908;
                        var8_5 = (var6_4 | var9_3) ^ 341893582;
                        continue block30;
                    }
                    case -1151885519: {
                        Files.createDirectories(gV.logs(), new FileAttribute[0]);
                        var8_5 = (var6_4 | var9_3) ^ 800211271;
                        continue block30;
                    }
                    case -2138751048: {
                        var7_6 ^= var8_5 ^ 1375753438;
                        var8_5 = (var6_4 | var9_3) ^ -477020477;
                        continue block30;
                    }
                    case 1285963836: 
                }
                break;
            }
            var5_9 = gV.logs().resolve(cM.a((var7_6 | var8_5 ^ 1638997698) ^ (var8_5 ^ -41278674), (var6_4 | var8_5 ^ 1638997698) ^ ((var7_6 | var8_5 ^ 1638997698) ^ (var8_5 ^ -1541685188))));
            var8_5 = (var6_4 | var9_3) ^ 197286498;
            ** continue;
        }
    }

    /*
     * Exception decompiling
     */
    private static void appendCause(StringBuilder var0, String var1_1, Throwable var2_2, int var3_3) {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String sanitize(String var0) {
        var5_1 = 486870138;
        var4_2 = -1679259431;
        var1_3 = cM.a & 486870138 ^ -503547013;
        var3_4 = 0;
        var2_5 = (var1_3 | var5_1) ^ -805586091;
        var3_4 = (var1_3 | var5_1) ^ -227594148;
        ** GOTO lbl59
lbl8:
        // 1 sources

        while (true) {
            continue;
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var3_4 = (var1_3 | var5_1) ^ 1539824630;
            if (true) ** GOTO lbl47
lbl13:
            // 1 sources

            while (true) {
                v0 = var2_5 ^= -478224480;
                v1 = var2_5;
                v2 = var2_5;
                v3 = var2_5;
                ** continue;
                break;
            }
            break;
        }
lbl19:
        // 2 sources

        while (true) {
            v4 = cM.a((var2_5 | var5_1) ^ -1319882342, (var1_3 | var5_1) ^ ((var2_5 | var5_1) ^ 1787089665));
            v5 = cM.a((var2_5 | var5_1) ^ -1319882341, (var1_3 | var5_1) ^ ((var2_5 | var5_1) ^ 1249039105));
            var2_5 ^= 123603678;
            var2_5 ^= 487309620;
            return v6.replaceAll(v7, v8).replaceAll(v4, v5);
        }
        v6 = var0.replaceAll(cM.a((v9 | var3_4 ^ var4_2) ^ (var3_4 ^ 391317302), (var1_3 | var3_4 ^ var4_2) ^ ((v10 | var3_4 ^ var4_2) ^ (var3_4 ^ 1496966567))), cM.a((v11 | var3_4 ^ var4_2) ^ (var3_4 ^ 391317303), (var1_3 | var3_4 ^ var4_2) ^ ((v12 | var3_4 ^ var4_2) ^ (var3_4 ^ -857217625)))).replaceAll(cM.a((v0 | var5_1) ^ 1942245403, (var1_3 | var5_1) ^ ((v1 | var5_1) ^ -1741770108)), cM.a((v2 | var5_1) ^ 1942245402, (var1_3 | var5_1) ^ ((v3 | var5_1) ^ 891073156)));
        v7 = cM.a(((var2_5 ^= 1266839941) | var5_1) ^ 826679708, (var1_3 | var5_1) ^ ((var2_5 | var5_1) ^ 680772353));
        v8 = cM.a((var2_5 | var5_1) ^ 826679709, (var1_3 | var5_1) ^ ((var2_5 | var5_1) ^ 1905115905));
        block19: while (true) {
            switch (var2_5) {
                case 536406848: {
                    var2_5 ^= 16906669;
                    continue block19;
                }
                default: {
                    var2_5 ^= -732440233;
                    ** GOTO lbl19
                }
                case 1733343272: 
            }
            break;
        }
        var2_5 ^= -1676535694;
        ** while (true)
        block20: while (true) {
            var3_4 = (var1_3 | var5_1) ^ 315187577;
            ** GOTO lbl47
lbl42:
            // 1 sources

            while (true) {
                var3_4 = (var1_3 | var5_1) ^ 2064710616;
                if (true) ** GOTO lbl47
                break;
            }
            block22: while (true) {
                var3_4 = (var1_3 | var5_1) ^ -1603797245;
lbl47:
                // 4 sources

                block23: while (true) {
                    switch (var3_4) {
                        case -107883351: {
                            if (var0 == null) continue block20;
                            ** break;
                        }
                        case -2031254365: {
                            v9 = var2_5;
                            v10 = var2_5;
                            v11 = var2_5;
                            v12 = var2_5;
                            ** continue;
                        }
lbl58:
                        // 1 sources

                        var3_4 = (var1_3 | var5_1) ^ -1484733279;
lbl59:
                        // 4 sources

                        default: {
                            continue block23;
                        }
                        case 1570406520: {
                            var2_5 ^= var3_4 ^ 140050460;
                            ** continue;
                        }
                        case 1518189530: {
                            var3_4 = (var1_3 | var5_1) ^ 504900629;
                            continue block23;
                        }
                        case 261246759: {
                            var3_4 = (var1_3 | var5_1) ^ 1200633128;
                            continue block23;
                        }
                        case -1167242669: {
                            var2_5 ^= var3_4 ^ 302258196;
                            var3_4 = (var1_3 | var5_1) ^ 74230738;
                            ** GOTO lbl59
                        }
                        case -281797118: {
                            var2_5 ^= var3_4 ^ 1291775302;
                            ** continue;
                        }
                        case -471510162: {
                            if (!var0.isBlank()) continue block22;
                            continue block20;
                        }
                        case -1506106227: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return cM.a((var2_5 | var3_4 ^ -1153455881) ^ (var3_4 ^ -712223717), (var1_3 | var3_4 ^ -1153455881) ^ ((var2_5 | var3_4 ^ -1153455881) ^ (var3_4 ^ 1167308425)));
    }
}

