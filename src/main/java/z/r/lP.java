/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.dm;
import z.r.eC;
import z.r.gj;
import z.r.kd;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class lP
extends eC<List<String>> {
    private static final /* synthetic */ String a;
    public static final int b;
    private final String b;
    private static final int[] a;
    private static final /* synthetic */ String h;
    private final int a;
    private String[] a;
    private static final /* synthetic */ String i;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public lP(String var1_1, String var2_2, int var3_3) {
        block19: {
            break block19;
lbl1:
            // 2 sources

            while (true) {
                super(var1_1, new ArrayList<E>());
                var6_6 = (var4_5 | var7_4) ^ 514586872;
                if (true) ** GOTO lbl26
                break;
            }
        }
        var7_4 = 3962252;
        var4_5 = lP.b & 3962252 ^ 1038866085;
        var6_6 = 0;
        var5_7 = (var4_5 | var7_4) ^ 524513886;
        block15: while (true) {
            switch (var5_7) {
                default: {
                    var5_7 ^= 8638728;
                    continue block15;
                }
                case 2029737344: {
                    var5_7 ^= 2134056203;
                    ** GOTO lbl1
                }
                case 582780403: 
            }
            break;
        }
        var5_7 ^= 2095942189;
        ** while (true)
        block16: while (true) {
            var6_6 = (var4_5 | var7_4) ^ 1866382900;
            if (true) ** GOTO lbl26
            block17: while (true) {
                var6_6 = (var4_5 | var7_4) ^ 483592590;
lbl26:
                // 3 sources

                block18: while (true) {
                    switch (var6_6) {
                        case -1750118885: {
                            this.a = new String[0];
                            ** break;
                        }
                        case 1388399001: {
                            var5_7 ^= var6_6 ^ -1428775330;
                            var6_6 = (var4_5 | var7_4) ^ -1807719046;
                            continue block18;
                        }
                        case 592711509: {
                            var5_7 ^= var6_6 ^ -2024822813;
                            ** GOTO lbl51
                        }
                        case 1474910833: {
                            var5_7 ^= var6_6 ^ -1233454992;
                            var6_6 = (var4_5 | var7_4) ^ 1226554674;
                            ** GOTO lbl46
                        }
                        case -1792141190: {
                            var5_7 ^= var6_6 ^ -1058002459;
                            continue block17;
                        }
lbl45:
                        // 1 sources

                        var6_6 = (var4_5 | var7_4) ^ 1779871196;
lbl46:
                        // 3 sources

                        default: {
                            continue block18;
                        }
                        case 1961118367: {
                            this.b = var2_2;
                            continue block16;
                        }
lbl51:
                        // 1 sources

                        var6_6 = (var4_5 | var7_4) ^ -1437550154;
                        continue block18;
                        case -1447062825: {
                            this.a = Math.max(1, Math.min(var3_3, lP.Dj((var5_7 | var6_6 ^ -1450973349) ^ (var6_6 ^ 1288245177), (var4_5 | var6_6 ^ -1450973349) ^ ((var5_7 | var6_6 ^ -1450973349) ^ (var6_6 ^ 230972498)))));
                            var6_6 = (var4_5 | var7_4) ^ -1462636585;
                            continue block18;
                        }
                        case 556596771: 
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
    public lP legacyKeys(String ... var1_1) {
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
    public String getPlaceholder() {
        block8: {
            block9: {
                break block9;
                {
                    var3_2 = (var1_1 | 1816419914) ^ -986909705;
lbl2:
                    // 3 sources

                    block6: while (true) {
                        switch (var3_2) {
                            default: {
                                continue block6;
                            }
                            case 676498713: {
                                var2_3 ^= var3_2 ^ 1636715298;
                                break block8;
                            }
                            case -602047322: {
                                return this.b;
                            }
                            case -301262909: {
                                break;
                            }
                        }
                        continue block5;
                        break;
                    }
                }
lbl14:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 1816419914) ^ 58026285;
                    ** GOTO lbl2
                    break;
                }
            }
            var1_1 = lP.b & 1816419914 ^ -1451345236;
            var3_2 = 0;
            var2_3 = (var1_1 | 1816419914) ^ 341148210;
            ** while (true)
        }
        var3_2 = (var1_1 | 1816419914) ^ 828572232;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public int getMaxEntryLength() {
        var1_1 = lP.b & -1554929943 ^ 487380466;
        var3_2 = 0;
        ** GOTO lbl19
lbl4:
        // 1 sources

        while (true) {
            var3_2 = (var1_1 | -1554929943) ^ 609944346;
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
lbl11:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | -1554929943) ^ 775733858;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 108839772: {
                        ** continue;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | -1554929943) ^ -1189006169;
                        ** continue;
                        break;
                    }
lbl19:
                    // 1 sources

                    var2_3 = (var1_1 | -1554929943) ^ 422296552;
                    ** continue;
                    case -1694042911: {
                        return this.a;
                    }
                    case -1855900263: 
                }
                break;
            }
            break;
        }
        var2_3 ^= var3_2 ^ -1565483986;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public List<String> getEntries() {
        int n2 = b & 0x10762AB9 ^ 0xEFED852A;
        int n3 = 0;
        int n4 = (n2 | 0x10762AB9) ^ 0xF247D5B9;
        n3 = (n2 | 0x10762AB9) ^ 0xD52CA745;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -2070184175: {
                    return Collections.unmodifiableList((List)((Object)this.a));
                }
                case 1540973622: {
                    n4 ^= n3 ^ 0x97F23117;
                    n3 = (n2 | 0x10762AB9) ^ 0x7B64D0AA;
                    continue block5;
                }
                case 718473470: 
            }
            n3 = (n2 | 0x10762AB9) ^ 0xA426CB8D;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int size() {
        int n2 = b & 0x70759715 ^ 0x649554F1;
        int n3 = 0;
        int n4 = (n2 | 0x70759715) ^ 0xC0A23099;
        n3 = (n2 | 0x70759715) ^ 0xE69D85C2;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1838656969: {
                    break;
                }
                case -2095283387: {
                    n4 ^= n3 ^ 0x43D312C3;
                    n3 = (n2 | 0x70759715) ^ 0x4361DC10;
                    continue block5;
                }
                case 932449253: {
                    return ((List)((Object)this.a)).size();
                }
            }
            n3 = (n2 | 0x70759715) ^ 0xF7E954B0;
        }
    }

    /*
     * Exception decompiling
     */
    public boolean add(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH], 38[UNCONDITIONALDOLOOP]], but top level block is 4[SWITCH]
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

    private static int Dj(int n2, int n3) {
        int n4 = 48206081;
        int n5 = 573569659;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x247791BB)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0x22FFDD1C;
        n6 -= (n5 | n4) ^ 0x22FF3031;
        n6 ^= (n5 | n4) ^ 0x22FFDB89;
        n6 -= (n5 | n4) ^ 0x22FFA240;
        n6 += (n5 | n4) ^ 0x22FFB9BF;
        n6 += (n5 | n4) ^ 0x22FFCF8C;
        return n6 ^= (n5 | n4) ^ 0x22FFA62A;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void set(int var1_1, String var2_2) {
        var7_3 = -1277979857;
        var4_4 = lP.b & -1277979857 ^ 1001120359;
        var6_5 = 0;
        var5_6 = (var4_4 | var7_3) ^ -654163712;
        var6_5 = (var4_4 | var7_3) ^ -1738078549;
        ** GOTO lbl29
        while (true) {
            var6_5 = (var4_4 | var7_3) ^ 2147121646;
            ** GOTO lbl29
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var6_5 = (var4_4 | var7_3) ^ -1314411835;
            ** GOTO lbl29
            break;
        }
lbl13:
        // 1 sources

        while (true) {
            var6_5 = (var4_4 | var7_3) ^ -1075070091;
            ** GOTO lbl96
            break;
        }
        while (true) {
            var6_5 = (var4_4 | var7_3) ^ 499706750;
            if (true) ** GOTO lbl29
            break;
        }
lbl19:
        // 1 sources

        while (true) {
            var6_5 = (var4_4 | var7_3) ^ -1604732354;
            ** GOTO lbl96
            break;
        }
lbl22:
        // 2 sources

        while (true) {
            var5_6 ^= -563269880;
            var3_7 = v0;
            var6_5 = (var4_4 | var7_3) ^ 212150598;
            ** GOTO lbl139
            break;
        }
        block35: while (true) {
            var6_5 = (var4_4 | var7_3) ^ -694056360;
lbl29:
            // 5 sources

            block36: while (true) {
                block45: {
                    block44: {
                        switch (var6_5) {
                            case -1006531967: {
                                var5_6 ^= var6_5 ^ -2039281078;
                                ** break;
                            }
                            case -120517255: {
                                if (var1_1 < ((List)this.a).size()) ** continue;
                                ** GOTO lbl63
                            }
                            case 1524003943: {
                                if (var1_1 < 0) ** GOTO lbl63
                                break block44;
                            }
                            case 1501197624: {
                                if (var2_2 != null) ** continue;
                                ** GOTO lbl75
                            }
                            case 173824426: {
                                return;
                            }
                            case -844918193: {
                                var5_6 ^= var6_5 ^ 976769247;
                                ** continue;
                            }
                            case 1834645815: {
                                var5_6 ^= var6_5 ^ -1195489219;
                                ** break;
                            }
                            case -1506600943: {
                                var5_6 ^= var6_5 ^ 1348975309;
                                ** GOTO lbl56
                            }
lbl54:
                            // 1 sources

                            var6_5 = (var4_4 | var7_3) ^ -517110008;
                            continue block36;
lbl56:
                            // 1 sources

                            var6_5 = (var4_4 | var7_3) ^ -494827945;
                            continue block36;
lbl58:
                            // 1 sources

                            var6_5 = (var4_4 | var7_3) ^ 1888752315;
                            continue block36;
                            case -1184624367: {
                                v0 = "";
                                ** GOTO lbl22
                            }
lbl63:
                            // 2 sources

                            var6_5 = (var4_4 | var7_3) ^ 1985503520;
                            continue block36;
                            case 872474644: {
                                var6_5 = (var4_4 | var7_3) ^ 1126891030;
                            }
                            default: {
                                continue block36;
                            }
                            case 498313853: {
                                var5_6 ^= var6_5 ^ 1606494902;
                                break block45;
                            }
                            case -881860140: {
                                v0 = var2_2;
                                ** continue;
                            }
lbl75:
                            // 1 sources

                            var6_5 = (var4_4 | var7_3) ^ -1505208046;
                            continue block36;
                            case 597489092: 
                        }
                        continue block35;
                    }
                    var6_5 = (var4_4 | var7_3) ^ -1879368837;
                    continue;
                }
                var6_5 = (var4_4 | var7_3) ^ 44032638;
            }
            break;
        }
lbl85:
        // 1 sources

        while (true) {
            var6_5 = (var4_4 | var7_3) ^ 1598229996;
            ** GOTO lbl96
            break;
        }
lbl88:
        // 1 sources

        while (true) {
            var6_5 = (var4_4 | var7_3) ^ 1727694689;
            ** GOTO lbl96
            break;
        }
lbl91:
        // 1 sources

        while (true) {
            var6_5 = (var4_4 | var7_3) ^ 1137088702;
            if (true) ** GOTO lbl96
            break;
        }
        block40: while (true) {
            var6_5 = (var4_4 | var7_3) ^ 706076875;
lbl96:
            // 6 sources

            block41: while (true) {
                switch (var6_5) {
                    case 68175898: {
                        var5_6 ^= var6_5 ^ -908733841;
                        ** continue;
                    }
                    case -457638269: {
                        ((List)this.a).set(var1_1, var3_7);
                        ** continue;
                    }
                    case -1846668380: {
                        if (var3_7.length() > this.a) {
                            var6_5 = (var4_4 | var7_3) ^ -226990145;
                            continue block41;
                        }
                        ** GOTO lbl134
                    }
                    case -130192431: {
                        if (!var3_7.equals(((List)this.a).get(var1_1))) {
                            ** continue;
                        }
                        ** GOTO lbl124
                    }
                    case -1610589342: {
                        return;
                    }
                    case 463620433: {
                        var5_6 ^= var6_5 ^ -697838812;
                        ** continue;
                    }
                    case -181752201: {
                        var5_6 ^= var6_5 ^ 777142187;
                        ** continue;
                    }
                    case -587107314: {
                        dm.requestSave();
lbl124:
                        // 2 sources

                        var6_5 = (var4_4 | var7_3) ^ -1585555881;
                        break;
                    }
                    case -1218520535: {
                        var5_6 ^= var6_5 ^ -944574227;
                        continue block40;
                    }
                    case 1233360080: {
                        var6_5 = (var4_4 | var7_3) ^ -1005336728;
                        break;
                    }
                    case 2145924103: {
                        var3_7 = var3_7.substring(0, this.a);
lbl134:
                        // 2 sources

                        var6_5 = (var4_4 | var7_3) ^ 1322343704;
                        break;
                    }
                    case 444966200: {
                        var5_6 ^= var6_5 ^ -459494935;
                        var6_5 = (var4_4 | var7_3) ^ 469477389;
                    }
                }
lbl139:
                // 6 sources

            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public void remove(int var1_1) {
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
    static {
        block16: {
            block17: {
                block19: {
                    block18: {
                        break block18;
lbl1:
                        // 1 sources

                        while (v0 + 4 >= v1.length) {
                            break block16;
                        }
                        break block19;
lbl4:
                        // 1 sources

                        while (true) {
                            v2 = var0_2 ^= -500954784;
                            var0_2 ^= -702350647;
                            lP.a[v3] = ((v1[v0] & 255) << 24 | ((v1[v0 + 1] & 255) << 16 | ((v1[v0 + 2] & 255) << 8 | v1[v0 + 3] & 255))) ^ ((v2 | var2) ^ -420026723 ^ lP.b);
                            v3 = v3 + 1;
                            v1 = v1;
                            v0 = v0 + 4;
                            var0_2 ^= -60139710;
                            ** GOTO lbl1
                            break;
                        }
                    }
                    var2 = -2106022397;
                    lP.b = mK.a(MethodHandles.lookup().lookupClass(), 580046183);
                    var1_1 = 0;
                    var0_2 = -1967383562;
                    var1_1 = var2 ^ 135316344;
                    block11: while (true) {
                        switch (var1_1) {
                            default: {
                                continue block11;
                            }
                            case -1972869765: {
                                ** break;
                            }
                            case -1594591879: {
                                v3 = 0;
                                v0 = 0;
                                var0_2 ^= 1102805543;
                                ** GOTO lbl34
                            }
lbl32:
                            // 1 sources

                            var1_1 = var2 ^ -2119479727;
                            continue block11;
lbl34:
                            // 1 sources

                            lP.a = new int[4];
                            break block17;
                            case 64219218: 
                        }
                        var0_2 ^= var1_1 ^ -1878583100;
                        var1_1 = var2 ^ 579654522;
                    }
lbl40:
                    // 1 sources

                    while (true) {
                        var0_2 ^= -1840408250;
                        ** continue;
                        break;
                    }
lbl54:
                    // 1 sources

                    while (true) {
                        var0_2 ^= 1585130024;
                        var0_2 ^= -616128352;
                        var0_2 ^= 565033599;
                        ** continue;
                        break;
                    }
lbl61:
                    // 2 sources

                    while (true) {
                        v1 = "\n\u001bqN\u00ae\u00f3sX\u00d6Y\u00fb\u00e2A\u00a6Vs".getBytes("ISO-8859-1");
                        break;
                    }
                }
                var0_2 ^= 1921946319;
                var0_2 ^= -1941987435;
                ** while (true)
            }
            block15: while (true) {
                switch (var0_2) {
                    default: {
                        var0_2 ^= -843874333;
                        ** GOTO lbl61
                    }
                    case -1808120371: {
                        var0_2 ^= 845255216;
                        continue block15;
                    }
                    case -782496077: 
                }
                break;
            }
            var0_2 ^= 275728310;
            ** while (true)
        }
        lP.a = gj.decode("aiNkBnrh", lP.Dj(((var0_2 ^= 419219732) | var2) ^ -1988833934, var2 ^ ((var0_2 | var2) ^ -1387102200)));
        lP.h = gj.decode("W8YU7qU=", lP.Dj((var0_2 | var2) ^ -1988833935, var2 ^ ((var0_2 | var2) ^ -833337808)));
        lP.i = gj.decode("P0kvLCGS", lP.Dj((var0_2 | var2) ^ -1988833936, var2 ^ ((var0_2 | var2) ^ -630799400)));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void reset() {
        int n2 = -595831472;
        int n3 = b & 0xDC7C5550 ^ 0x77147187;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x86A2621A;
        n4 = (n3 | n2) ^ 0xA5282957;
        boolean bl2 = true;
        block9: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0xD5523F38;
            }
            block10: while (true) {
                switch (n4) {
                    default: {
                        continue block10;
                    }
                    case -187473683: {
                        n5 ^= n4 ^ 0x6710DBAD;
                        n4 = (n3 | n2) ^ 0xC6F6E648;
                        continue block10;
                    }
                    case 965383071: {
                        dm.requestSave();
                        n4 = (n3 | n2) ^ 0x852FA543;
                        continue block10;
                    }
                    case 1015213068: {
                        ((List)((Object)this.a)).clear();
                        n4 = (n3 | n2) ^ 0xBAF153A;
                        continue block10;
                    }
                    case -1792988734: {
                        n5 ^= n4 ^ 0x35330217;
                        n4 = (n3 | n2) ^ 0xC3FE99DB;
                        continue block10;
                    }
                    case 2052313236: {
                        n5 ^= n4 ^ 0x3697A82F;
                        continue block9;
                    }
                    case 1515478144: {
                        n4 = (n3 | n2) ^ 0x6A5D5C15;
                        continue block10;
                    }
                    case 707676911: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public JsonElement toJsonValue() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH], 42[UNCONDITIONALDOLOOP]], but top level block is 12[SWITCH]
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
    public void loadFrom(JsonObject var1_1) {
        block131: {
            block132: {
                block129: {
                    block130: {
                        block133: {
                            block128: {
                                break block133;
lbl1:
                                // 1 sources

                                while (true) {
                                    var10_14 ^= -361530881;
                                    var4_8 = this.a;
                                    var5_10 = var4_8.length;
                                    var6_11 = 0;
                                    break block128;
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    var11_4 = (var9_3 | var12_2) ^ -1372377953;
                                    break block129;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var11_4 = (var9_3 | var12_2) ^ 911653543;
                                    ** GOTO lbl254
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var11_4 = (var9_3 | var12_2) ^ -414900502;
                                    break block130;
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var11_4 = (var9_3 | var12_2) ^ 616054959;
                                    ** GOTO lbl254
                                    break;
                                }
lbl19:
                                // 1 sources

                                while (true) {
                                    var11_4 = (var9_3 | var12_2) ^ -1758352197;
                                    break block129;
                                    break;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    var11_4 = (var9_3 | var12_2) ^ 1127116302;
                                    break block130;
                                    break;
                                }
                                while (true) {
                                    var11_4 = (var9_3 | var12_2) ^ -484048512;
                                    break block131;
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var11_4 = (var9_3 | var12_2) ^ -1393358755;
                                    break block131;
                                    break;
                                }
lbl31:
                                // 1 sources

                                while (true) {
                                    var11_4 = (var9_3 | var12_2) ^ -1211894116;
                                    ** GOTO lbl254
                                    break;
                                }
lbl34:
                                // 1 sources

                                while (true) {
                                    var11_4 = (var9_3 | var12_2) ^ -1666118848;
                                    ** GOTO lbl366
                                    break;
                                }
                            }
lbl38:
                            // 2 sources

                            while (true) {
                                var11_4 = (var9_3 | var12_2) ^ 973669860;
                                break block131;
                                break;
                            }
lbl41:
                            // 1 sources

                            while (true) {
                                var11_4 = (var9_3 | var12_2) ^ 86715825;
                                break block129;
                                break;
                            }
                        }
                        var12_2 = 1289034114;
                        var9_3 = lP.b & 1289034114 ^ 39867026;
                        var11_4 = 0;
                        var10_14 = (var9_3 | var12_2) ^ -350381630;
                        var11_4 = (var9_3 | var12_2) ^ -1512836146;
                        block94: while (true) {
                            switch (var11_4) {
                                case -349788068: {
                                    var11_4 = (var9_3 | var12_2) ^ 297109756;
                                    ** break;
                                }
                                case 1598083950: {
                                    var10_14 ^= var11_4 ^ -2093205193;
                                    var11_4 = (var9_3 | var12_2) ^ -1222249468;
                                }
lbl58:
                                // 3 sources

                                default: {
                                    continue block94;
                                }
                                case -103764074: 
                            }
                            break;
                        }
                        var2_5 = var1_1.get(this.getName());
                        var11_4 = (var9_3 | var12_2) ^ 1164579490;
                        ** GOTO lbl254
                        while (true) {
                            var11_4 = (var9_3 | var12_2) ^ -1900356866;
                            break block131;
lbl67:
                            // 1 sources

                            while (true) {
                                var11_4 = (var9_3 | var12_2) ^ 923942789;
                                break block131;
                                break;
                            }
lbl70:
                            // 1 sources

                            while (true) {
                                var11_4 = (var9_3 | var12_2) ^ -863904049;
                                break block131;
                                break;
                            }
                            break;
                        }
lbl73:
                        // 3 sources

                        while (true) {
                            var11_4 = (var9_3 | var12_2) ^ 80385375;
                            break block129;
                            break;
                        }
lbl76:
                        // 1 sources

                        while (true) {
                            var11_4 = (var9_3 | var12_2) ^ -1331628007;
                            break block129;
                            break;
                        }
lbl79:
                        // 1 sources

                        while (true) {
                            var11_4 = (var9_3 | var12_2) ^ -1271787352;
                            break block129;
lbl82:
                            // 1 sources

                            while (true) {
                                var11_4 = (var9_3 | var12_2) ^ 703396102;
                                ** GOTO lbl366
                                break;
                            }
lbl85:
                            // 3 sources

                            while (true) {
                                var11_4 = (var9_3 | var12_2) ^ 2129396016;
                                break block129;
                                break;
                            }
lbl88:
                            // 1 sources

                            while (true) {
                                var11_4 = (var9_3 | var12_2) ^ -1392596326;
                                break block131;
                                break;
                            }
                            break;
                        }
lbl91:
                        // 1 sources

                        while (true) {
                            var11_4 = (var9_3 | var12_2) ^ -362087090;
                            if (true) ** GOTO lbl208
                            break;
                        }
lbl94:
                        // 1 sources

                        while (true) {
                            var11_4 = (var9_3 | var12_2) ^ 527962966;
                            ** GOTO lbl254
                            break;
                        }
                    }
lbl98:
                    // 2 sources

                    block106: while (true) {
                        switch (var11_4) {
                            case -265986339: {
                                var10_14 ^= var11_4 ^ 1318233563;
                                var11_4 = (var9_3 | var12_2) ^ -1851763768;
                                continue block106;
                            }
                            case 232469916: {
                                var4_9 = (JsonElement)var3_7.next();
                                ** continue;
                            }
                            case -1071847515: {
                                var10_14 ^= var11_4 ^ -904795749;
                                ** continue;
                            }
                            case -1448065672: {
                                if (var3_7.hasNext()) ** GOTO lbl119
                                var11_4 = (var9_3 | var12_2) ^ -1093663409;
                            }
                            default: {
                                continue block106;
                            }
                            {
                            }
                            case 1827814072: {
                                var10_14 ^= var11_4 ^ -180709940;
                                ** continue;
                            }
lbl119:
                            // 1 sources

                            var11_4 = (var9_3 | var12_2) ^ 570908970;
                            continue block106;
                            case -548075430: 
                        }
                        return;
                    }
                }
lbl124:
                // 2 sources

                block107: while (true) {
                    switch (var11_4) {
                        case 1418370222: {
                            ++var6_11;
                            ** GOTO lbl345
                        }
                        case -523864307: {
                            var10_14 ^= var11_4 ^ 1927035071;
                            ** break;
                        }
                        case -27942005: {
                            var11_4 = (var9_3 | var12_2) ^ 1922272736;
                            continue block107;
                        }
                        case 1245695693: {
                            var10_14 ^= var11_4 ^ 812208409;
                            ** GOTO lbl168
                        }
                        case -1283004475: {
                            var10_14 ^= var11_4 ^ 1590735282;
                            ** GOTO lbl184
                        }
                        case 1013372530: {
                            if (!var8_13.isJsonPrimitive()) ** GOTO lbl73
                            ** continue;
                        }
                        case -1451695258: {
                            var3_6 = true;
                            ** break;
                        }
                        case -1090163416: {
                            if (this.Dk(var8_13.getAsString()) == null) ** GOTO lbl73
                            ** continue;
                        }
lbl150:
                        // 1 sources

                        var11_4 = (var9_3 | var12_2) ^ -410142476;
                        ** GOTO lbl194
                        case 733631272: {
                            if (!var8_13.isJsonPrimitive()) ** GOTO lbl85
                            ** continue;
                        }
lbl155:
                        // 1 sources

                        var11_4 = (var9_3 | var12_2) ^ -42746793;
                        continue block107;
                        case -1367473722: {
                            if (var8_13 != null) ** break;
                            ** continue;
                            ** continue;
                        }
                        case -641403095: {
                            var11_4 = (var9_3 | var12_2) ^ -235915590;
                            continue block107;
                        }
                        case -1199074550: {
                            this.add(var8_13.getAsString());
                            ** GOTO lbl85
                        }
lbl168:
                        // 1 sources

                        var11_4 = (var9_3 | var12_2) ^ 1596253168;
                        continue block107;
                        case -87602374: {
                            var10_14 ^= var11_4 ^ -1713043554;
                            ** GOTO lbl175
                        }
                        case -1156777000: {
                            ** GOTO lbl355
                        }
lbl175:
                        // 1 sources

                        var11_4 = (var9_3 | var12_2) ^ -1859050861;
                        continue block107;
                        case -540772095: {
                            if (var8_13 != null) ** break;
                            ** continue;
                            ** GOTO lbl186
                        }
                        case 636635291: {
                            var11_4 = (var9_3 | var12_2) ^ 1699678394;
                            continue block107;
                        }
lbl184:
                        // 1 sources

                        var11_4 = (var9_3 | var12_2) ^ -168189878;
                        continue block107;
lbl186:
                        // 1 sources

                        var11_4 = (var9_3 | var12_2) ^ 1795625737;
                        continue block107;
                        case 298956898: {
                            ++var6_11;
                            ** continue;
                        }
                        case -1046956608: {
                            var10_14 ^= var11_4 ^ 769262433;
                            var11_4 = (var9_3 | var12_2) ^ -527738284;
                        }
lbl194:
                        // 3 sources

                        default: {
                            continue block107;
                        }
                        case 1272870435: {
                            var11_4 = (var9_3 | var12_2) ^ -160249704;
                            continue block107;
                        }
                        case 806967970: 
                    }
                    var10_14 ^= var11_4 ^ -994392432;
                    var11_4 = (var9_3 | var12_2) ^ 444581692;
                    continue;
                    break;
                }
lbl203:
                // 1 sources

                while (true) {
                    var11_4 = (var9_3 | var12_2) ^ -2030304079;
                    if (true) ** GOTO lbl366
                    break;
                }
                block109: while (true) {
                    var11_4 = (var9_3 | var12_2) ^ -1329670234;
lbl208:
                    // 2 sources

                    while (true) {
                        switch (var11_4) {
                            case -28603340: {
                                var10_14 ^= var11_4 ^ -291349768;
                                ** break;
                            }
                            case -1738553659: {
                                ** GOTO lbl217
                            }
lbl215:
                            // 1 sources

                            var11_4 = (var9_3 | var12_2) ^ 745866501;
                            break;
lbl217:
                            // 1 sources

                            var11_4 = (var9_3 | var12_2) ^ 353443988;
                            break;
                            case 1652579991: {
                                break block132;
                            }
                            case 135512386: {
                                if (!var4_9.isJsonPrimitive()) continue block109;
                                var11_4 = (var9_3 | var12_2) ^ -693461673;
                                break;
                            }
                            case 1541700358: {
                                this.add(var4_9.getAsString());
                                continue block109;
                            }
                            case -1533040932: {
                                var10_14 ^= var11_4 ^ 666095962;
                                var11_4 = (var9_3 | var12_2) ^ 1189518032;
                            }
                        }
                    }
                    break;
                }
lbl233:
                // 1 sources

                while (true) {
                    var11_4 = (var9_3 | var12_2) ^ -224741029;
                    break block131;
lbl236:
                    // 1 sources

                    while (true) {
                        var11_4 = (var9_3 | var12_2) ^ -136579133;
                        break block131;
                        break;
                    }
                    break;
                }
lbl239:
                // 1 sources

                while (true) {
                    var11_4 = (var9_3 | var12_2) ^ -1888620974;
                    ** continue;
                    break;
                }
            }
lbl243:
            // 2 sources

            while (true) {
                var11_4 = (var9_3 | var12_2) ^ -1897284553;
                ** continue;
                break;
            }
lbl246:
            // 1 sources

            while (true) {
                var11_4 = (var9_3 | var12_2) ^ -1473597937;
                if (true) ** GOTO lbl254
                break;
            }
lbl249:
            // 1 sources

            while (true) {
                var11_4 = (var9_3 | var12_2) ^ -576390848;
                break block131;
                break;
            }
            block117: while (true) {
                var11_4 = (var9_3 | var12_2) ^ 974607645;
lbl254:
                // 7 sources

                block118: while (true) {
                    block134: {
                        switch (var11_4) {
                            default: {
                                continue block118;
                            }
                            case 2024005941: {
                                var10_14 ^= var11_4 ^ -653733234;
                                ** continue;
                            }
                            case -1270957831: {
                                var10_14 ^= var11_4 ^ 1954748261;
                                continue block117;
                            }
                            case 194988336: {
                                var10_14 ^= var11_4 ^ -1623800881;
                                ** continue;
                            }
                            case -113857266: {
                                ((List)this.a).clear();
                                ** continue;
                            }
                            case 1783438141: {
                                var10_14 ^= var11_4 ^ 1434659810;
                                ** continue;
                            }
                            case 1368213700: {
                                if (var2_5 != null) {
                                    break;
                                }
                                break block134;
                            }
                            case -421530211: {
                                var3_7 = var2_5.getAsJsonArray().iterator();
                                ** continue;
                            }
                            case 1960971919: {
                                var3_6 = false;
                                ** continue;
                            }
                            case 1109252457: {
                                if (var2_5.isJsonArray()) {
                                    ** continue;
                                }
                                break block134;
                            }
                            case -656960012: {
                                var11_4 = (var9_3 | var12_2) ^ 216564475;
                                continue block118;
                            }
                        }
                        var11_4 = (var9_3 | var12_2) ^ -1776103834;
                        continue;
                    }
                    var11_4 = (var9_3 | var12_2) ^ -87301269;
                }
                break;
            }
        }
        block119: while (true) {
            switch (var11_4) {
                case -1146199549: {
                    var10_14 ^= var11_4 ^ -1067187165;
                    var11_4 = (var9_3 | var12_2) ^ -1355364214;
                    continue block119;
                }
                case -1133518135: {
                    var7_12 = var4_8[var6_11];
                    ** continue;
                }
                case -1823366446: {
                    if (var6_11 >= var5_10) ** continue;
                    var11_4 = (var9_3 | var12_2) ^ -1753987150;
                    continue block119;
                }
                case -1480921512: {
                    var10_14 ^= var11_4 ^ -853796912;
                    ** continue;
                }
                case -1068531348: {
                    var10_14 ^= var11_4 ^ 429917524;
                    ** continue;
                }
                case -507276520: {
                    ((List)this.a).clear();
                    var11_4 = (var9_3 | var12_2) ^ 165058129;
                    continue block119;
                }
                case 1962696310: {
                    var10_14 ^= var11_4 ^ 1910954087;
                    ** continue;
                }
                case -645850080: {
                    var10_14 ^= var11_4 ^ -1848036482;
                    ** continue;
                }
                case 1193528771: {
                    var10_14 ^= var11_4 ^ -877584838;
                    ** continue;
                }
                case -1378657774: {
                    var10_14 ^= var11_4 ^ 1200085174;
                    ** break;
                }
                case -1188123567: {
                    var7_12 = var4_8[var6_11];
                    ** continue;
                }
                case -502533880: {
                    if (!var3_6) {
                        ** continue;
                    }
                    ** GOTO lbl358
                }
                case 227865268: {
                    var10_14 ^= var11_4 ^ -438486623;
                    ** continue;
                }
                case 2045207575: {
                    var4_8 = this.a;
                    var5_10 = var4_8.length;
                    var6_11 = 0;
lbl345:
                    // 2 sources

                    var11_4 = (var9_3 | var12_2) ^ 1130473766;
                    ** GOTO lbl356
                }
lbl347:
                // 1 sources

                var11_4 = (var9_3 | var12_2) ^ -1413512400;
                ** GOTO lbl356
                case -2106292899: {
                    var10_14 ^= var11_4 ^ -604671493;
                    var11_4 = (var9_3 | var12_2) ^ 1439264168;
                    ** GOTO lbl356
                }
                case -502901809: {
                    if (var6_11 < var5_10) ** continue;
lbl355:
                    // 2 sources

                    var11_4 = (var9_3 | var12_2) ^ -380652086;
                }
lbl356:
                // 5 sources

                default: {
                    continue block119;
                }
lbl358:
                // 1 sources

                var11_4 = (var9_3 | var12_2) ^ -178570863;
                continue block119;
                case -448079710: {
                    return;
                }
                case 456930874: 
            }
            break;
        }
        return;
        block120: while (true) {
            var11_4 = (var9_3 | var12_2) ^ -1119190790;
lbl366:
            // 4 sources

            block121: while (true) {
                switch (var11_4) {
                    default: {
                        continue block121;
                    }
                    case -205530264: {
                        var8_13 = var1_1.get(var7_12);
                        ** continue;
                    }
                    case -767274798: {
                        var10_14 ^= var11_4 ^ -1733985394;
                        continue block120;
                    }
                    case 1729733268: {
                        var10_14 ^= var11_4 ^ 1351194185;
                        ** continue;
                    }
                    case -938909917: 
                }
                break;
            }
            break;
        }
        var8_13 = var1_1.get(var7_12);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private String Dk(String var1_1) {
        var6_2 = -1080082004;
        var3_3 = lP.b & -1080082004 ^ -1206780704;
        var5_4 = 0;
        var4_6 = (var3_3 | var6_2) ^ -301579302;
        var5_4 = (var3_3 | var6_2) ^ -659014095;
        ** GOTO lbl67
lbl7:
        // 1 sources

        while (true) {
            var5_4 = (var3_3 | var6_2) ^ -425643634;
            ** GOTO lbl18
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var5_4 = (var3_3 | var6_2) ^ 2135554119;
            if (true) ** GOTO lbl67
            break;
        }
lbl13:
        // 1 sources

        while (true) {
            var5_4 = (var3_3 | var6_2) ^ 673998844;
            if (true) ** GOTO lbl18
            block24: while (true) {
                var5_4 = (var3_3 | var6_2) ^ 1054124165;
lbl18:
                // 3 sources

                block25: while (true) {
                    switch (var5_4) {
                        case -1749837296: {
                            var4_6 ^= var5_4 ^ -975165447;
                            ** GOTO lbl46
                        }
                        case 2001032607: {
                            var4_6 ^= var5_4 ^ 881935464;
                            ** GOTO lbl50
                        }
                        case -1110902979: {
                            v0 = var2_5;
                            ** GOTO lbl57
                        }
                        case -2125769367: {
                            var4_6 ^= var5_4 ^ -1321629484;
                            ** GOTO lbl59
                        }
                        case 2112669606: {
                            if (var2_5.length() > this.a) ** GOTO lbl42
                            var5_4 = (var3_3 | var6_2) ^ -95274327;
                        }
                        default: {
                            continue block25;
                        }
                        {
                        }
                        case -94951359: {
                            if (var2_5.isEmpty()) {
                                continue block24;
                            }
                            ** GOTO lbl48
                        }
lbl42:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ 242515922;
                        continue block25;
                        case 2097023853: {
                            return null;
                        }
lbl46:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ 1170789805;
                        continue block25;
lbl48:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ -925194125;
                        continue block25;
lbl50:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ -1032635830;
                        continue block25;
                        case -1309965762: {
                            var4_6 ^= var5_4 ^ 298250912;
                            ** continue;
                        }
                        case 1497287778: {
                            v0 = var2_5.substring(0, this.a);
lbl57:
                            // 2 sources

                            var4_6 ^= -2025296688;
                            return v0;
                        }
lbl59:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ -1016990079;
                        continue block25;
                        case 1171113797: 
                    }
                    var4_6 ^= var5_4 ^ -438257701;
                    var5_4 = (var3_3 | var6_2) ^ 39258833;
                }
                break;
            }
            break;
        }
        while (true) {
            var5_4 = (var3_3 | var6_2) ^ -533218842;
lbl67:
            // 3 sources

            block27: while (true) {
                switch (var5_4) {
                    case 1604862986: {
                        if (var1_1 == null) {
                            ** break;
                        }
                        ** GOTO lbl84
                    }
                    case -1832255639: {
                        var4_6 ^= var5_4 ^ -931731544;
                        ** continue;
                    }
                    case -1185668081: {
                        var4_6 ^= var5_4 ^ -237340451;
                        var5_4 = (var3_3 | var6_2) ^ -1713008814;
                        ** GOTO lbl88
                    }
                    case -1059715669: {
                        return null;
                    }
lbl82:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 760611461;
                    ** GOTO lbl88
lbl84:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 114022883;
                    ** GOTO lbl88
                    case 1730659293: {
                        var5_4 = (var3_3 | var6_2) ^ -1163000034;
                    }
lbl88:
                    // 5 sources

                    default: {
                        continue block27;
                    }
                    case 645558974: {
                        var2_5 = var1_1.trim();
                        ** continue;
                    }
                    case 87161586: 
                }
                break;
            }
            var4_6 ^= var5_4 ^ -853846978;
        }
    }

    /*
     * Exception decompiling
     */
    private boolean Dl(String var1_1) {
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
    @Override
    public String getDisplayValue() {
        block22: {
            var4_1 = 235445941;
            var1_2 = lP.b & 235445941 ^ 554136736;
            var3_3 = 0;
            if (true) ** GOTO lbl50
            block9: while (true) {
                switch (var3_3) lbl-1000:
                // 8 sources

                {
                    while (true) {
                        default: {
                            continue block9;
                        }
                        break;
                    }
lbl10:
                    // 2 sources

                    while (true) {
                        var2_4 ^= 721714522;
                        v0 = v1 + v2;
                        break block9;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 348027747;
                        ** GOTO lbl-1000
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1001551400;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -2012669750: {
                        v0 = lP.a;
                        break block9;
                    }
lbl23:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1070064890;
                        ** GOTO lbl-1000
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1492720001;
                        ** GOTO lbl-1000
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1727393674;
                        ** GOTO lbl-1000
                        break;
                    }
                    while (true) {
                        var2_4 ^= 514071025;
                        ** GOTO lbl38
                        break;
                    }
lbl35:
                    // 1 sources

                    while (true) {
                        v2 = lP.h;
                        ** GOTO lbl10
                        break;
                    }
lbl38:
                    // 1 sources

                    v2 = lP.i;
                    ** continue;
lbl40:
                    // 1 sources

                    while (true) {
                        var2_4 ^= 514071025;
                        ** continue;
                        break;
                    }
                    case -1241125181: {
                        v1 = ((List)this.a).size();
                        if (((List)this.a).size() != 1) ** continue;
                        ** continue;
                    }
lbl47:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -2042542759;
                        ** GOTO lbl-1000
                        break;
                    }
lbl50:
                    // 1 sources

                    var2_4 = (var1_2 | var4_1) ^ -5844867;
                    ** continue;
lbl52:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -491005007;
                        ** continue;
                        break;
                    }
                }
                break;
            }
            var2_4 ^= -2085045104;
            break block22;
            {
                case -1454457876: {
                    var2_4 ^= var3_3 ^ -885207005;
                    ** continue;
                }
            }
        }
        return v0;
        {
            case 347965597: {
                var2_4 ^= var3_3 ^ -1429846668;
                ** continue;
            }
            case 281549391: {
                ** continue;
            }
            case -843832060: {
                var2_4 ^= var3_3 ^ 1181715526;
                ** continue;
            }
            ** case 1001489878:
        }
lbl71:
        // 1 sources

        ** while (!((List)this.a).isEmpty())
lbl72:
        // 1 sources

        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    @Override
    public kd getType() {
        int n2 = b & 0x5C1DEDA4 ^ 0x6914186D;
        int n3 = 0;
        int n4 = (n2 | 0x5C1DEDA4) ^ 0x502DFE49;
        n3 = (n2 | 0x5C1DEDA4) ^ 0xC06A411A;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1116226313: {
                    n3 = (n2 | 0x5C1DEDA4) ^ 0x33BA486A;
                    continue block5;
                }
                case 1319613831: {
                    n4 ^= n3 ^ 0xE8D8E61C;
                    n3 = (n2 | 0x5C1DEDA4) ^ 0xFC2C187;
                    continue block5;
                }
                case 1927232618: 
            }
            break;
        }
        return kd.q;
    }
}

